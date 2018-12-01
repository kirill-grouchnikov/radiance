/*
 * Copyright (c) 2018 Radiance Kormorant Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Kormorant Kirill Grouchnikov nor the names of
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
package org.pushingpixels.kormorant

import org.pushingpixels.flamingo.api.common.model.CommandPresentation
import org.pushingpixels.flamingo.api.common.model.CommandProjectionGroupModel
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu
import org.pushingpixels.flamingo.api.common.popup.model.ColorSelectorPopupMenuContentModel
import org.pushingpixels.flamingo.api.common.popup.model.ColorSelectorPopupMenuGroupModel
import org.pushingpixels.flamingo.api.common.projection.CommandProjection
import java.awt.Color

@FlamingoElementMarker
class KColorSelectorPopupMenuColorSection(val isDerived: Boolean) {
    var title: String by NonNullDelegate { false }
    internal var colorContainer = ColorContainer()

    fun colors(init: ColorContainer.() -> Unit) {
        colorContainer.init()
    }
}

@FlamingoElementMarker
class KColorSelectorPopupMenuRecentSection {
    var title: String by NonNullDelegate { false }
}

class KColorSelectorPopupMenuGroup {
    internal val content = arrayListOf<Any>()

    operator fun KCommand.unaryPlus() {
        this@KColorSelectorPopupMenuGroup.content.add(KCommandGroup.CommandConfig(this, null, null))
    }

    fun command(actionKeyTip: String? = null, popupKeyTip: String? = null,
            init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        content.add(KCommandGroup.CommandConfig(command, actionKeyTip, popupKeyTip))
        return command
    }

    fun colorSection(init: KColorSelectorPopupMenuColorSection.() -> Unit): KColorSelectorPopupMenuColorSection {
        val colorSection = KColorSelectorPopupMenuColorSection(false)
        colorSection.init()
        content.add(colorSection)
        return colorSection
    }

    fun colorSectionWithDerived(
            init: KColorSelectorPopupMenuColorSection.() -> Unit): KColorSelectorPopupMenuColorSection {
        val colorSection = KColorSelectorPopupMenuColorSection(true)
        colorSection.init()
        content.add(colorSection)
        return colorSection
    }

    fun recentSection(init: KColorSelectorPopupMenuRecentSection.() -> Unit): KColorSelectorPopupMenuRecentSection {
        val recentSection = KColorSelectorPopupMenuRecentSection()
        recentSection.init()
        content.add(recentSection)
        return recentSection
    }

    fun toJavaColorSelectorPopupMenuGroupModel(): ColorSelectorPopupMenuGroupModel {
        val menuGroupBuilder = ColorSelectorPopupMenuGroupModel.builder()

        for (component in content) {
            when (component) {
                is KCommandGroup.CommandConfig -> {
                    menuGroupBuilder.addCommand(component.toProjection())
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

@FlamingoElementMarker
class KColorSelectorPopupMenu {
    private lateinit var colorSelectorPopupMenu: JColorSelectorPopupMenu
    private var hasBeenConverted: Boolean = false

    var onColorActivated: ((Color) -> Unit)? by NullableDelegate { hasBeenConverted }
    var onColorPreviewActivated: ((Color) -> Unit)? by NullableDelegate { hasBeenConverted }
    var onColorPreviewCanceled: (() -> Unit)? by NullableDelegate { hasBeenConverted }

    private val groups = arrayListOf<KColorSelectorPopupMenuGroup>()
    private val defaultGroup = KColorSelectorPopupMenuGroup()

    init {
        groups.add(defaultGroup)
    }

    operator fun KCommand.unaryPlus() {
        this@KColorSelectorPopupMenu.defaultGroup.content.add(
                KCommandGroup.CommandConfig(this, null, null))
    }

    fun command(actionKeyTip: String? = null, popupKeyTip: String? = null,
            init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        defaultGroup.content.add(KCommandGroup.CommandConfig(command, actionKeyTip, popupKeyTip))
        return command
    }

    fun colorSection(init: KColorSelectorPopupMenuColorSection.() -> Unit): KColorSelectorPopupMenuColorSection {
        val colorSection = KColorSelectorPopupMenuColorSection(false)
        colorSection.init()
        defaultGroup.content.add(colorSection)
        return colorSection
    }

    fun colorSectionWithDerived(
            init: KColorSelectorPopupMenuColorSection.() -> Unit): KColorSelectorPopupMenuColorSection {
        val colorSection = KColorSelectorPopupMenuColorSection(true)
        colorSection.init()
        defaultGroup.content.add(colorSection)
        return colorSection
    }

    fun recentSection(init: KColorSelectorPopupMenuRecentSection.() -> Unit): KColorSelectorPopupMenuRecentSection {
        val recentSection = KColorSelectorPopupMenuRecentSection()
        recentSection.init()
        defaultGroup.content.add(recentSection)
        return recentSection
    }

    fun group(init: KColorSelectorPopupMenuGroup.() -> Unit): KColorSelectorPopupMenuGroup {
        val group = KColorSelectorPopupMenuGroup()
        group.init()
        groups.add(group)
        return group
    }

    fun toJavaColorSelectorPopupMenu(): JColorSelectorPopupMenu {
        if (defaultGroup.content.isEmpty()) {
            groups.remove(defaultGroup)
        }

        val menuGroups = groups.map { it.toJavaColorSelectorPopupMenuGroupModel() }

        hasBeenConverted = true

        val menuContentModel = ColorSelectorPopupMenuContentModel(menuGroups)
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

        colorSelectorPopupMenu = JColorSelectorPopupMenu(menuContentModel)

        return colorSelectorPopupMenu
    }
}

fun colorSelectorPopupMenu(init: KColorSelectorPopupMenu.() -> Unit): KColorSelectorPopupMenu {
    val colorSelectorPopupMenu = KColorSelectorPopupMenu()
    colorSelectorPopupMenu.init()
    return colorSelectorPopupMenu
}
