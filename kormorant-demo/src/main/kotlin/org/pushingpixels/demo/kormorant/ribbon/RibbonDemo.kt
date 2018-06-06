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
package org.pushingpixels.demo.kormorant.ribbon

import org.pushingpixels.demo.kormorant.popup.ColorIcon
import org.pushingpixels.demo.kormorant.svg.*
import org.pushingpixels.flamingo.api.common.icon.ColorResizableIcon
import org.pushingpixels.flamingo.api.common.icon.DecoratedResizableIcon
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon
import org.pushingpixels.flamingo.api.common.model.ActionButtonModel
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies
import org.pushingpixels.flamingo.api.ribbon.resize.IconRibbonBandResizePolicy
import org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizePolicy
import org.pushingpixels.flamingo.internal.ui.ribbon.JBandControlPanel
import org.pushingpixels.kormorant.*
import org.pushingpixels.kormorant.ribbon.*
import org.pushingpixels.neon.NeonUtil
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.text.MessageFormat
import java.util.*
import javax.swing.*

private class ExpandActionListener : ActionListener {
    override fun actionPerformed(e: ActionEvent) {
        JOptionPane.showMessageDialog(null, "Expand button clicked")
    }
}

private class RibbonDemoBuilder {
    val currLocale = Locale.getDefault() as Locale
    val resourceBundle = ResourceBundle.getBundle(
            "org.pushingpixels.demo.kormorant.resources.Resources", currLocale) as ResourceBundle

    fun getSimplePopupMenu(): PopupPanelCallback {
        return PopupPanelCallback {
            val mf = MessageFormat(resourceBundle.getString("TestMenuItem.text"))
            val popupMenuCommand = commandPopupMenu {
                command {
                    title = mf.format(arrayOf("1"))
                    icon = ColorResizableIcon(16, Color(0x80, 0xDE, 0xEA))
                    action = ActionListener {
                        println("Test menu item 1 activated")
                    }
                    actionKeyTip = "1"
                }
                command {
                    title = mf.format(arrayOf("2"))
                    icon = ColorResizableIcon(16, Color(0x80, 0xCB, 0xC4))
                    action = ActionListener {
                        println("Test menu item 2 activated")
                    }
                    actionKeyTip = "2"
                }
                command {
                    title = mf.format(arrayOf("3"))
                    icon = ColorResizableIcon(16, Color(0xA5, 0xD6, 0xA7))
                    action = ActionListener {
                        println("Test menu item 3 activated")
                    }
                    actionKeyTip = "3"
                }
                separator()
                command {
                    title = mf.format(arrayOf("4"))
                    icon = ColorResizableIcon(16, Color(0xC5, 0xE1, 0xA5))
                    action = ActionListener {
                        println("Test menu item 4 activated")
                    }
                    actionKeyTip = "4"
                }
                command {
                    title = mf.format(arrayOf("5"))
                    icon = ColorResizableIcon(16, Color(0xE6, 0xEE, 0x9C))
                    action = ActionListener {
                        println("Test menu item 5 activated")
                    }
                    actionKeyTip = "5"
                }
            }
            popupMenuCommand.asCommandPopupMenu()
        }
    }

    fun getClipboardBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Clipboard.textBandTitle")
            icon = Edit_paste.of(16, 16)
            expandCommand {
                keyTip = "Q"
                richTooltip {
                    title = resourceBundle.getString("Clipboard.textBandTitle")
                    description {
                        +resourceBundle.getString("Clipboard.textBandTooltipParagraph1")
                    }
                }
                action = ExpandActionListener()
            }
            collapsedStateKeyTip = "ZC"

            command(RibbonElementPriority.TOP) {
                title = resourceBundle.getString("Paste.text")
                icon = Edit_paste.of(16, 16)
                action = ActionListener { println("Pasted!") }
                actionRichTooltip {
                    title = resourceBundle.getString("Paste.text")
                    description {
                        +resourceBundle.getString("Paste.tooltip.actionParagraph1")
                    }
                }
                popupCallback = getSimplePopupMenu()
                popupRichTooltip {
                    title = resourceBundle.getString("Paste.text")
                    description {
                        +resourceBundle.getString("Paste.tooltip.popupParagraph1")
                    }
                }
                popupKeyTip = "V"
                isTitleClickAction = true
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("Cut.text")
                icon = Edit_cut.of(16, 16)
                action = ActionListener { println("Cut!") }
                actionRichTooltip {
                    title = resourceBundle.getString("Cut.text")
                    description {
                        +resourceBundle.getString("Cut.tooltip.actionParagraph1")
                    }
                }
                popupCallback = getSimplePopupMenu()
                popupKeyTip = "X"
                isTitleClickAction = true
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("Copy.text")
                icon = Edit_copy.of(16, 16)
                action = ActionListener { println("Copy!") }
                popupCallback = getSimplePopupMenu()
                popupKeyTip = "C"
                isTitleClickPopup = true
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("Format.text")
                icon = Edit_paste.of(16, 16)
                popupCallback = PopupPanelCallback {
                    val mfGroupTitle = MessageFormat(resourceBundle.getString("PanelStyles.text"))
                    mfGroupTitle.locale = currLocale
                    val mfTooltipTitle = MessageFormat(
                            resourceBundle.getString("PanelStyles.tooltip.textActionTitle"))
                    mfTooltipTitle.locale = currLocale
                    val mfTooltipParagraph = MessageFormat(
                            resourceBundle.getString("PanelStyles.tooltip.textActionParagraph1"))
                    mfTooltipParagraph.locale = currLocale

                    val popupMenuCommand = commandPopupMenu {
                        commandPanel {
                            display {
                                dimension = 32
                                maxButtonColumns = 5
                                maxVisibleButtonRows = 3
                                isShowingGroupTitles = true
                            }

                            for (groupIndex in 0 until 4) {
                                commandGroup {
                                    title = mfGroupTitle.format(arrayOf<Any>(groupIndex))

                                    for (i in 0 until 15) {
                                        command {
                                            icon = DecoratedResizableIcon(Font_x_generic.of(16, 16),
                                                    DecoratedResizableIcon.IconDecorator { component, graphics, x, y, _, height ->
                                                        val g2d = graphics.create() as Graphics2D
                                                        g2d.color = Color.black
                                                        g2d.font = UIManager.getFont("Label.font")
                                                        NeonUtil.installDesktopHints(g2d, component)
                                                        g2d.drawString("" + i, x + 2, y + height - 2)
                                                        g2d.dispose()
                                                    }
                                            )

                                            isToggle = true
                                            action = ActionListener { println("Invoked action on $i") }
                                            actionRichTooltip {
                                                title = mfTooltipTitle.format(arrayOf<Any>(i))
                                                description {
                                                    +mfTooltipParagraph.format(arrayOf<Any>(i))
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            isSingleSelectionMode = true
                        }

                        command {
                            title = resourceBundle.getString("Format.menuSaveSelection.text")
                            icon = ColorResizableIcon(16, Color(0xFB, 0xC0, 0x2D))
                            action = ActionListener { println("Save Selection activated") }
                            actionKeyTip = "SS"
                        }

                        command {
                            title = resourceBundle.getString("Format.menuClearSelection.text")
                            icon = ColorResizableIcon(16, Color(0xFF, 0xA0, 0x00))
                            action = ActionListener { println("Clear Selection activated") }
                            actionKeyTip = "SC"
                        }

                        separator()

                        command {
                            title = resourceBundle.getString("Format.applyStyles.text")
                            icon = ColorResizableIcon(16, Color(0xF5, 0x7C, 0x00))
                            action = ActionListener { println("Apply Styles activated") }
                            actionKeyTip = "SA"
                        }
                    }
                    popupMenuCommand.asCommandPopupMenu()
                }
                popupRichTooltip {
                    title = "Main title that can go over multiple lines of text even exceeding the bigger"
                    description {
                        +"Simple description that can go over multiple lines of text even exceeding the bigger"
                        +"Second paragraph that can be multiline as well to test this feature"
                    }
                    mainIcon = Address_book_new.of(32, 32)
                    footer {
                        +"Multiline footer description to provide a little bit more information on this subject"
                    }
                    footerIcon = Help_browser.of(16, 16)
                }
                popupKeyTip = "FP"
            }

            // This is kind of ugly for now
            resizePolicies {
                +object : ResizePolicySource {
                    override fun getResizePolicy(controlPanel: JBandControlPanel): RibbonBandResizePolicy {
                        return CoreRibbonResizePolicies.Mirror(controlPanel)
                    }
                }
                +object : ResizePolicySource {
                    override fun getResizePolicy(controlPanel: JBandControlPanel): RibbonBandResizePolicy {
                        return CoreRibbonResizePolicies.Mid2Low(controlPanel)
                    }
                }
            }
        }
    }

    fun getQuickStylesBand(): KRibbonBand {
        val mfButtonText = MessageFormat(
                resourceBundle.getString("StylesGallery.textButton"))
        mfButtonText.locale = currLocale

        val defaultColor = Color(0xEE, 0xEE, 0xEE)
        val myColorSelectorCallback = object : JColorSelectorPopupMenu.ColorSelectorCallback {
            override fun onColorSelected(color: Color) {
                println("Selected color $color")
            }

            override fun onColorRollover(color: Color?) {
                println("Rollover color $color")
            }
        }

        return ribbonBand {
            title = resourceBundle.getString("QuickStyles.textBandTitle")
            icon = Preferences_desktop_theme.of(16, 16)
            collapsedStateKeyTip = "ZS"

            gallery(RibbonElementPriority.TOP) {
                title = "Styles"
                display {
                    state = JRibbonBand.BIG_FIXED_LANDSCAPE
                    preferredPopupMaxCommandColumns = 3
                    preferredPopupMaxVisibleCommandRows = 3
                    commandVisibilities {
                        1 at RibbonElementPriority.LOW
                        2 at RibbonElementPriority.MEDIUM
                        2 at RibbonElementPriority.TOP
                    }
                }
                commandGroup {
                    title = resourceBundle.getString("StylesGallery.textGroupTitle1")
                    for (i in 0 until 10) {
                        command {
                            title = mfButtonText.format(arrayOf<Any>(i))
                            icon = DecoratedResizableIcon(Font_x_generic.of(16, 16),
                                    DecoratedResizableIcon.IconDecorator { component, graphics, x, y, _, height ->
                                        val g2d = graphics.create() as Graphics2D
                                        g2d.color = Color.black
                                        NeonUtil.installDesktopHints(g2d, component)
                                        g2d.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                .getFontSet("Substance", null).controlFont
                                        g2d.drawString("$i", x + 2, y + height - 2)
                                        g2d.dispose()
                                    }
                            )
                            action = ActionListener { println("Invoked action on $i") }
                            isToggle = (i != 1)
                            isToggleSelected = (i == 1)
                        }
                    }
                }
                commandGroup {
                    title = resourceBundle.getString("StylesGallery.textGroupTitle2")
                    for (i in 10 until 30) {
                        command {
                            title = mfButtonText.format(arrayOf<Any>(i))
                            icon = DecoratedResizableIcon(Font_x_generic.of(16, 16),
                                    DecoratedResizableIcon.IconDecorator { component, graphics, x, y, _, height ->
                                        val g2d = graphics.create() as Graphics2D
                                        g2d.color = Color.black
                                        NeonUtil.installDesktopHints(g2d, component)
                                        g2d.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                .getFontSet("Substance", null).controlFont
                                        g2d.drawString("$i", x + 2, y + height - 2)
                                        g2d.dispose()
                                    }
                            )
                            action = ActionListener { println("Invoked action on $i") }
                            isToggle = true
                        }
                    }
                }
                extraPopupContent {
                    command {
                        title = resourceBundle.getString("Format.menuSaveSelection.text")
                        icon = EmptyResizableIcon(16)
                        action = ActionListener { println("Save Selection activated") }
                        actionKeyTip = "SS"
                    }

                    command {
                        title = resourceBundle.getString("Format.menuClearSelection.text")
                        icon = EmptyResizableIcon(16)
                        action = ActionListener { println("Clear Selection activated") }
                        actionKeyTip = "SC"
                    }

                    separator()

                    command {
                        title = resourceBundle.getString("Format.applyStyles.text")
                        icon = Font_x_generic.of(16, 16)
                        action = ActionListener { println("Apply Styles activated") }
                        actionKeyTip = "SA"
                    }
                }
                expandKeyTip = "L"
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("Styles1.text")
                icon = Font_x_generic.of(16, 16)
                action = ActionListener { println("Generic activated") }
                actionKeyTip = "SA"
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("Styles2.text")
                icon = Image_x_generic.of(16, 16)
                action = ActionListener { println("Image activated") }
                actionKeyTip = "SB"
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("Styles3.text")
                icon = Text_html.of(16, 16)
                popupCallback = PopupPanelCallback {
                    colorSelectorPopupMenu {
                        colorSelectorCallback = myColorSelectorCallback

                        command {
                            title = resourceBundle.getString("ColorSelector.textAutomatic")
                            icon = ColorIcon(defaultColor)
                            action = ActionListener {
                                myColorSelectorCallback.onColorSelected(defaultColor)
                                JColorSelectorPopupMenu.addColorToRecentlyUsed(defaultColor)
                            }
                            // Register a listener on the action model
                            actionModelChangeListener = object : ActionModelChangeInterface {
                                var wasRollover = false
                                override fun stateChanged(model: ActionButtonModel) {
                                    val isRollover = model.isRollover
                                    if (wasRollover && !isRollover) {
                                        // Notify the callback that there is no rollover
                                        myColorSelectorCallback.onColorRollover(null)
                                    }
                                    if (!wasRollover && isRollover) {
                                        // Notify the callback that there is rollover with automatic (black) color
                                        myColorSelectorCallback.onColorRollover(Color.black)
                                    }
                                    wasRollover = isRollover
                                }
                            }
                        }

                        colorSectionWithDerived {
                            title = resourceBundle.getString("ColorSelector.textThemeCaption")
                            colors {
                                +Color(255, 255, 255)
                                +Color(0, 0, 0)
                                +Color(160, 160, 160)
                                +Color(16, 64, 128)
                                +Color(80, 128, 192)
                                +Color(180, 80, 80)
                                +Color(160, 192, 80)
                                +Color(128, 92, 160)
                                +Color(80, 160, 208)
                                +Color(255, 144, 64)
                            }
                        }

                        colorSection {
                            title = resourceBundle.getString("ColorSelector.textStandardCaption")
                            colors {
                                +Color(140, 0, 0)
                                +Color(253, 0, 0)
                                +Color(255, 160, 0)
                                +Color(255, 255, 0)
                                +Color(144, 240, 144)
                                +Color(0, 128, 0)
                                +Color(160, 224, 224)
                                +Color(0, 0, 255)
                                +Color(0, 0, 128)
                                +Color(128, 0, 128)
                            }
                        }

                        recentSection {
                            title = resourceBundle.getString("ColorSelector.textRecentCaption")
                        }

                        command {
                            title = resourceBundle.getString("ColorSelector.textMoreColor")
                            action = ActionListener {
                                SwingUtilities.invokeLater({
                                    val newColor = JColorChooser.showDialog(it.source as Component,
                                            "Color chooser", defaultColor)
                                    if (newColor != null) {
                                        myColorSelectorCallback.onColorSelected(newColor)
                                        JColorSelectorPopupMenu.addColorToRecentlyUsed(newColor)
                                    }
                                })
                            }
                        }
                    }.asColorSelectorPopupMenu()
                }
                popupKeyTip = "SC"
            }

            resizePolicies {
                +object : ResizePoliciesSource {
                    override fun getResizePolicies(ribbonBand: JRibbonBand): List<RibbonBandResizePolicy> {
                        return CoreRibbonResizePolicies.getCorePoliciesRestrictive(ribbonBand)
                    }
                }
            }
        }
    }

    fun getFontBand(): KFlowRibbonBand {
        return flowRibbonBand {
            title = resourceBundle.getString("Font.textBandTitle")
            icon = Preferences_desktop_font.of(16, 16)
            collapsedStateKeyTip = "ZF"
            expandCommand {
                keyTip = "FN"
                action = ExpandActionListener()
            }

            ribbonComponent {
                component = JComboBox(arrayOf("+ Minor (Calibri)   ", "+ Minor (Columbus)   ", "+ Minor (Consolas)   ",
                        "+ Minor (Cornelius)   ", "+ Minor (Cleopatra)   ", "+ Minor (Cornucopia)   ",
                        "+ Minor (Candella)   ", "+ Minor (Cambria)   "))
                keyTip = "SF"
            }

            ribbonComponent {
                component = JComboBox(arrayOf("11  "))
                keyTip = "SS"
            }

            flowCommandButtonStrip {
                command {
                    icon = Format_indent_less.of(16, 16)
                    action = ActionListener { println("Indent less") }
                    actionKeyTip = "AO"
                }

                command {
                    icon = Format_indent_more.of(16, 16)
                    action = ActionListener { println("Indent more") }
                    actionKeyTip = "AI"
                }
            }

            flowCommandButtonStrip {
                command {
                    icon = Format_text_bold.of(16, 16)
                    isToggleSelected = true
                    action = ActionListener { println("Bold toggled") }
                    actionRichTooltip {
                        title = resourceBundle.getString("FontBold.tooltip.textActionTitle")
                        description {
                            +resourceBundle.getString("FontBold.tooltip.textActionParagraph1")
                        }
                    }
                    actionKeyTip = "1"
                }

                command {
                    icon = Format_text_italic.of(16, 16)
                    isToggle = true
                    action = ActionListener { println("Italic toggled") }
                    actionRichTooltip {
                        title = resourceBundle.getString("FontItalic.tooltip.textActionTitle")
                        description {
                            +resourceBundle.getString("FontItalic.tooltip.textActionParagraph1")
                        }
                    }
                    actionKeyTip = "2"
                }

                command {
                    icon = Format_text_underline.of(16, 16)
                    isToggle = true
                    action = ActionListener { println("Underline toggled") }
                    actionRichTooltip {
                        title = resourceBundle.getString("FontUnderline.tooltip.textActionTitle")
                        description {
                            +resourceBundle.getString("FontUnderline.tooltip.textActionParagraph1")
                        }
                    }
                    actionKeyTip = "3"
                }

                command {
                    icon = Format_text_strikethrough.of(16, 16)
                    isToggle = true
                    action = ActionListener { println("Strikethrough toggled") }
                    actionRichTooltip {
                        title = resourceBundle.getString("FontStrikethrough.tooltip.textActionTitle")
                        description {
                            +resourceBundle.getString("FontStrikethrough.tooltip.textActionParagraph1")
                        }
                    }
                    actionKeyTip = "4"
                }
            }

            flowCommandToggleButtonStrip {
                command {
                    icon = Format_justify_left.of(16, 16)
                    action = ActionListener { println("Align left!") }
                    actionKeyTip = "AL"
                }

                command {
                    icon = Format_justify_center.of(16, 16)
                    isToggleSelected = true
                    action = ActionListener { println("Align center!") }
                    actionKeyTip = "AC"
                }

                command {
                    icon = Format_justify_right.of(16, 16)
                    action = ActionListener { println("Align right!") }
                    actionKeyTip = "AR"
                }

                command {
                    icon = Format_justify_fill.of(16, 16)
                    action = ActionListener { println("Align justified!") }
                    actionKeyTip = "AF"
                }
            }
        }
    }

    fun getDocumentBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Document.textBandTitle")
            icon = Applications_office.of(16, 16)
            expandCommand {
                action = ExpandActionListener()
                keyTip = "FY"
            }
            collapsedStateKeyTip = "ZD"

            group {
                val documentLocationToggleGroup = KCommandToggleGroup()

                command(RibbonElementPriority.TOP) {
                    title = resourceBundle.getString("DocumentLocal.text")
                    icon = Folder.of(16, 16)
                    action = ActionListener { println("Document Local activated") }
                    isToggle = true
                    toggleGroup = documentLocationToggleGroup
                }

                command(RibbonElementPriority.TOP) {
                    title = resourceBundle.getString("DocumentRemote.text")
                    icon = Folder_remote.of(16, 16)
                    action = ActionListener { println("Document Remote activated") }
                    isToggle = true
                    toggleGroup = documentLocationToggleGroup
                }
                command(RibbonElementPriority.TOP) {
                    title = resourceBundle.getString("DocumentSaved.text")
                    icon = Folder_saved_search.of(16, 16)
                    action = ActionListener { println("Document Saved activated") }
                    isToggle = true
                    toggleGroup = documentLocationToggleGroup
                }
            }

            group {
                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentNew.text")
                    icon = Document_new.of(16, 16)
                    action = ActionListener { println("Document New activated") }
                }

                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentOpen.text")
                    icon = Document_open.of(16, 16)
                    action = ActionListener { println("Document Open activated") }
                }

                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentSave.text")
                    icon = Document_save.of(16, 16)
                    action = ActionListener { println("Document Save activated") }
                }

                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentPrint.text")
                    icon = Document_print.of(16, 16)
                    action = ActionListener { println("Document Print activated") }
                }

                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentPrintPreview.text")
                    icon = Document_print_preview.of(16, 16)
                    action = ActionListener { println("Document Print Preview activated") }
                }

                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentProperties.text")
                    icon = Document_properties.of(16, 16)
                    action = ActionListener { println("Document Properties activated") }
                }
            }

            resizePolicies {
                +object : ResizePoliciesSource {
                    override fun getResizePolicies(ribbonBand: JRibbonBand): List<RibbonBandResizePolicy> {
                        return CoreRibbonResizePolicies.getCorePoliciesRestrictive(ribbonBand)
                    }
                }
            }
        }
    }

    fun getFindBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Find.textBandTitle")
            icon = Edit_find.of(16, 16)
            collapsedStateKeyTip = "ZY"

            command(RibbonElementPriority.TOP) {
                title = resourceBundle.getString("Search.text")
                icon = System_search.of(16, 16)
                action = ActionListener { println("Search activated") }
                actionKeyTip = "FD"
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("Find.text")
                icon = Edit_find.of(16, 16)
                action = ActionListener { println("Find activated") }
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("FindReplace.text")
                icon = Edit_find_replace.of(16, 16)
                action = ActionListener { println("Find Replace activated") }
                isEnabled = false
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("SelectAll.text")
                icon = Edit_select_all.of(16, 16)
                action = ActionListener { println("Select All activated") }
            }

            // This is kind of ugly for now
            resizePolicies {
                +object : ResizePolicySource {
                    override fun getResizePolicy(controlPanel: JBandControlPanel): RibbonBandResizePolicy {
                        return CoreRibbonResizePolicies.Mirror(controlPanel)
                    }
                }
                +object : ResizePolicySource {
                    override fun getResizePolicy(controlPanel: JBandControlPanel): RibbonBandResizePolicy {
                        return IconRibbonBandResizePolicy(controlPanel)
                    }
                }
            }
        }
    }

    fun getPageLayoutTask(): KRibbonTask {
        return ribbonTask {
            title = resourceBundle.getString("PageLayout.textTaskTitle")
            keyTip = "P"

            bands {
                +getClipboardBand()
                +getQuickStylesBand()
                +getFontBand()
                +getDocumentBand()
                +getFindBand()
            }
        }
    }
}

fun main(args: Array<String>) {
    SwingUtilities.invokeLater({
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)

        SubstanceCortex.GlobalScope.setSkin(OfficeBlue2007Skin())

        val builder = RibbonDemoBuilder()

        val ribbonFrame = ribbonFrame {
            title = builder.resourceBundle.getString("Frame.title")
            applicationIcon = Applications_internet.of(16, 16)

            tasks {
                +builder.getPageLayoutTask()
            }
        }

        val javaRibbonFrame = ribbonFrame.asRibbonFrame()

        javaRibbonFrame.applyComponentOrientation(
                ComponentOrientation.getOrientation(builder.currLocale))
        val r = GraphicsEnvironment.getLocalGraphicsEnvironment().maximumWindowBounds
        javaRibbonFrame.preferredSize = Dimension(r.width, r.height / 2)
        javaRibbonFrame.minimumSize = Dimension(r.width / 10, r.height / 2)
        javaRibbonFrame.pack()
        javaRibbonFrame.setLocation(r.x, r.y)
        javaRibbonFrame.defaultCloseOperation = WindowConstants.DISPOSE_ON_CLOSE

        javaRibbonFrame.setVisible(true)
    })
}
