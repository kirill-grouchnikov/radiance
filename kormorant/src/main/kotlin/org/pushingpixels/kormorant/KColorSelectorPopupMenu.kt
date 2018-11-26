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

import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu
import org.pushingpixels.flamingo.api.common.popup.model.ColorSelectorPopupMenuContentModel
import org.pushingpixels.flamingo.api.common.popup.model.ColorSelectorPopupMenuGroupModel
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

@FlamingoElementMarker
class KColorSelectorPopupMenu {
    private lateinit var colorSelectorPopupMenu: JColorSelectorPopupMenu
    private var hasBeenConverted: Boolean = false

    var onColorActivated: ((Color) -> Unit)? by NullableDelegate { hasBeenConverted }
    var onColorPreviewActivated: ((Color) -> Unit)? by NullableDelegate { hasBeenConverted }
    var onColorPreviewCanceled: (() -> Unit)? by NullableDelegate { hasBeenConverted }

    private val components = arrayListOf<Any>()

    fun command(init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        components.add(command)
        return command
    }

    fun separator() {
        components.add(KCommandPopupMenu.KCommandPopupMenuSeparator())
    }

    fun colorSection(init: KColorSelectorPopupMenuColorSection.() -> Unit): KColorSelectorPopupMenuColorSection {
        val colorSection = KColorSelectorPopupMenuColorSection(false)
        colorSection.init()
        components.add(colorSection)
        return colorSection
    }

    fun colorSectionWithDerived(
            init: KColorSelectorPopupMenuColorSection.() -> Unit): KColorSelectorPopupMenuColorSection {
        val colorSection = KColorSelectorPopupMenuColorSection(true)
        colorSection.init()
        components.add(colorSection)
        return colorSection
    }

    fun recentSection(init: KColorSelectorPopupMenuRecentSection.() -> Unit): KColorSelectorPopupMenuRecentSection {
        val recentSection = KColorSelectorPopupMenuRecentSection()
        recentSection.init()
        components.add(recentSection)
        return recentSection
    }

    fun asColorSelectorPopupMenu(): JColorSelectorPopupMenu {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }

        val menuGroups = ArrayList<ColorSelectorPopupMenuGroupModel>()
        var currMenuGroupBuilder = ColorSelectorPopupMenuGroupModel.builder()

        for (component in components) {
            when (component) {
                is KCommandPopupMenu.KCommandPopupMenuSeparator -> {
                    menuGroups.add(currMenuGroupBuilder.build())
                    currMenuGroupBuilder = ColorSelectorPopupMenuGroupModel.builder()
                }
                is KCommand -> {
                    currMenuGroupBuilder.addCommand(component.toFlamingoCommand())
                }
                is KColorSelectorPopupMenuColorSection -> {
                    if (component.isDerived) {
                        currMenuGroupBuilder.addColorSectionWithDerived(
                                ColorSelectorPopupMenuGroupModel.ColorSectionModel(component.title,
                                        component.colorContainer.colors.toTypedArray()))
                    } else {
                        currMenuGroupBuilder.addColorSection(
                                ColorSelectorPopupMenuGroupModel.ColorSectionModel(component.title,
                                        component.colorContainer.colors.toTypedArray()))
                    }
                }
                is KColorSelectorPopupMenuRecentSection -> {
                    currMenuGroupBuilder.addRecentsSection(
                            ColorSelectorPopupMenuGroupModel.ColorSectionModel(component.title))
                }
                else -> throw IllegalStateException("Unsupported content")
            }
        }
        val lastGroup = currMenuGroupBuilder.build()
        if (!lastGroup.groupContent.isEmpty()) {
            menuGroups.add(lastGroup)
        }
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
