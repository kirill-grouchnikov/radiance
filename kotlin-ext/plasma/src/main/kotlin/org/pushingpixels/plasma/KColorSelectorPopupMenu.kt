/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.plasma

import org.pushingpixels.radiance.components.api.common.popup.model.ColorSelectorPopupMenuContentModel
import org.pushingpixels.radiance.components.api.common.popup.model.ColorSelectorPopupMenuGroupModel
import org.pushingpixels.radiance.components.api.common.popup.model.ColorSelectorPopupMenuPresentationModel
import java.awt.Color

@PlasmaElementMarker
public class KColorSelectorPopupMenuColorSection(public val isDerived: Boolean) {
    public var title: String by NonNullDelegate { false }
    internal var colorContainer = ColorContainer()

    public fun colors(init: ColorContainer.() -> Unit) {
        colorContainer.init()
    }
}

@PlasmaElementMarker
public class KColorSelectorPopupMenuRecentSection {
    public var title: String by NonNullDelegate { false }
}

public class KColorSelectorPopupMenuGroup {
    internal val content = arrayListOf<Any>()

    public operator fun KCommand.unaryPlus() {
        this@KColorSelectorPopupMenuGroup.content.add(KCommandGroup.CommandConfig(this, null, null,
                false, false, null))
    }

    public fun command(actionKeyTip: String? = null, popupKeyTip: String? = null,
            init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        content.add(KCommandGroup.CommandConfig(command, actionKeyTip, popupKeyTip, false, false, null))
        return command
    }

    public fun colorSection(init: KColorSelectorPopupMenuColorSection.() -> Unit): KColorSelectorPopupMenuColorSection {
        val colorSection = KColorSelectorPopupMenuColorSection(false)
        colorSection.init()
        content.add(colorSection)
        return colorSection
    }

    public fun colorSectionWithDerived(
            init: KColorSelectorPopupMenuColorSection.() -> Unit): KColorSelectorPopupMenuColorSection {
        val colorSection = KColorSelectorPopupMenuColorSection(true)
        colorSection.init()
        content.add(colorSection)
        return colorSection
    }

    public fun recentSection(init: KColorSelectorPopupMenuRecentSection.() -> Unit): KColorSelectorPopupMenuRecentSection {
        val recentSection = KColorSelectorPopupMenuRecentSection()
        recentSection.init()
        content.add(recentSection)
        return recentSection
    }

    internal fun toJavaColorSelectorPopupMenuGroupModel(): ColorSelectorPopupMenuGroupModel {
        val menuGroupBuilder = ColorSelectorPopupMenuGroupModel.builder()

        for (component in content) {
            when (component) {
                is KCommandGroup.CommandConfig -> {
                    menuGroupBuilder.addCommand(component.toJavaCommand())
                }
                is KColorSelectorPopupMenuColorSection -> {
                    if (component.isDerived) {
                        menuGroupBuilder.addColorSectionWithDerived(
                                ColorSelectorPopupMenuGroupModel.ColorSectionModel(component.title,
                                        component.colorContainer.colors.toTypedArray()))
                    } else {
                        menuGroupBuilder.addColorSection(
                                ColorSelectorPopupMenuGroupModel.ColorSectionModel(component.title,
                                        component.colorContainer.colors.toTypedArray()))
                    }
                }
                is KColorSelectorPopupMenuRecentSection -> {
                    menuGroupBuilder.addRecentsSection(
                            ColorSelectorPopupMenuGroupModel.ColorSectionModel(component.title))
                }
                else -> throw IllegalStateException("Unsupported content")
            }
        }
        return menuGroupBuilder.build()
    }
}

@PlasmaElementMarker
public class KColorSelectorPopupMenu {
    public var onColorActivated: ((Color) -> Unit)? by NullableDelegate { false }
    public var onColorPreviewActivated: ((Color) -> Unit)? by NullableDelegate { false }
    public var onColorPreviewCanceled: (() -> Unit)? by NullableDelegate { false }

    private val groups = arrayListOf<KColorSelectorPopupMenuGroup>()
    private val defaultGroup = KColorSelectorPopupMenuGroup()

    init {
        groups.add(defaultGroup)
    }

    public operator fun KCommand.unaryPlus() {
        this@KColorSelectorPopupMenu.defaultGroup.content.add(
                KCommandGroup.CommandConfig(this, null, null, null, null, null))
    }

    public fun command(actionKeyTip: String? = null, popupKeyTip: String? = null,
            init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        defaultGroup.content.add(KCommandGroup.CommandConfig(command, actionKeyTip, popupKeyTip, false, false, null))
        return command
    }

    public fun colorSection(init: KColorSelectorPopupMenuColorSection.() -> Unit): KColorSelectorPopupMenuColorSection {
        val colorSection = KColorSelectorPopupMenuColorSection(false)
        colorSection.init()
        defaultGroup.content.add(colorSection)
        return colorSection
    }

    public fun colorSectionWithDerived(
            init: KColorSelectorPopupMenuColorSection.() -> Unit): KColorSelectorPopupMenuColorSection {
        val colorSection = KColorSelectorPopupMenuColorSection(true)
        colorSection.init()
        defaultGroup.content.add(colorSection)
        return colorSection
    }

    public fun recentSection(init: KColorSelectorPopupMenuRecentSection.() -> Unit): KColorSelectorPopupMenuRecentSection {
        val recentSection = KColorSelectorPopupMenuRecentSection()
        recentSection.init()
        defaultGroup.content.add(recentSection)
        return recentSection
    }

    public fun group(init: KColorSelectorPopupMenuGroup.() -> Unit): KColorSelectorPopupMenuGroup {
        val group = KColorSelectorPopupMenuGroup()
        group.init()
        groups.add(group)
        return group
    }

    internal fun toJavaPopupMenuContentModel(): ColorSelectorPopupMenuContentModel {
        if (defaultGroup.content.isEmpty()) {
            groups.remove(defaultGroup)
        }

        val menuGroups = groups.map { it.toJavaColorSelectorPopupMenuGroupModel() }

        val menuContentModel =
            ColorSelectorPopupMenuContentModel(
                menuGroups
            )
        menuContentModel.colorActivationListener =
                ColorSelectorPopupMenuContentModel.ColorActivationListener {
                    onColorActivated?.invoke(it)
                }
        menuContentModel.colorPreviewListener = object :
                ColorSelectorPopupMenuContentModel.ColorPreviewListener {
            override fun onColorPreviewActivated(color: Color) {
                onColorPreviewActivated?.invoke(color)
            }

            override fun onColorPreviewCanceled() {
                onColorPreviewCanceled?.invoke()
            }
        }

        return menuContentModel
    }

    internal fun toJavaPopupMenuPresentationModel(): ColorSelectorPopupMenuPresentationModel {
        return ColorSelectorPopupMenuPresentationModel.builder().build()
    }
}

public fun colorSelectorPopupMenu(init: KColorSelectorPopupMenu.() -> Unit): KColorSelectorPopupMenu {
    val colorSelectorPopupMenu = KColorSelectorPopupMenu()
    colorSelectorPopupMenu.init()
    return colorSelectorPopupMenu
}
