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

import org.pushingpixels.flamingo.api.common.JCommandMenuButton
import org.pushingpixels.flamingo.api.common.JCommandToggleMenuButton
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu

@FlamingoElementMarker
class KColorSelectorPopupMenuColorSection(val isDerived: Boolean) {
    var title: String by NonNullDelegate2({ false })
    internal var colors = ColorContainer()

    fun colors(init: ColorContainer.() -> Unit) {
        colors.init()
    }
}

@FlamingoElementMarker
class KColorSelectorPopupMenuRecentSection {
    var title: String by NonNullDelegate(null)
}

@FlamingoElementMarker
class KColorSelectorPopupMenu {
    private lateinit var colorSelectorPopupMenu: JColorSelectorPopupMenu
    private var hasBeenConverted: Boolean = false

    var colorSelectorCallback: JColorSelectorPopupMenu.ColorSelectorCallback
            by NonNullDelegate2({ hasBeenConverted })

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

        colorSelectorPopupMenu = JColorSelectorPopupMenu(colorSelectorCallback)

        for (component in components) {
            when (component) {
                is KCommandPopupMenu.KCommandPopupMenuSeparator -> colorSelectorPopupMenu.addMenuSeparator()
                is KCommand -> {
                    val commandMenuButton = component.asBaseMenuButton()
                    when (commandMenuButton) {
                        is JCommandMenuButton -> colorSelectorPopupMenu.addMenuButton(commandMenuButton)
                        is JCommandToggleMenuButton -> colorSelectorPopupMenu.addMenuButton(commandMenuButton)
                        else -> throw IllegalStateException("Unsupported content")
                    }
                }
                is KColorSelectorPopupMenuColorSection -> {
                    if (component.isDerived) {
                        colorSelectorPopupMenu.addColorSectionWithDerived(component.title,
                                component.colors.colors.toTypedArray())
                    } else {
                        colorSelectorPopupMenu.addColorSection(component.title,
                                component.colors.colors.toTypedArray())
                    }
                }
                is KColorSelectorPopupMenuRecentSection -> {
                    colorSelectorPopupMenu.addRecentSection(component.title)
                }
                else -> throw IllegalStateException("Unsupported content")
            }
        }
        hasBeenConverted = true
        return colorSelectorPopupMenu
    }
}

fun colorSelectorPopupMenu(init: KColorSelectorPopupMenu.() -> Unit): KColorSelectorPopupMenu {
    val colorSelectorPopupMenu = KColorSelectorPopupMenu()
    colorSelectorPopupMenu.init()
    return colorSelectorPopupMenu
}
