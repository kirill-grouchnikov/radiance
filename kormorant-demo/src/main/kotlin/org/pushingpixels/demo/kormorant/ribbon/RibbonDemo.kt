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

import com.jgoodies.forms.builder.DefaultFormBuilder
import com.jgoodies.forms.layout.FormLayout
import org.pushingpixels.demo.kormorant.popup.ColorIcon
import org.pushingpixels.demo.kormorant.svg.*
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState
import org.pushingpixels.flamingo.api.common.HorizontalAlignment
import org.pushingpixels.flamingo.api.common.icon.ColorResizableIcon
import org.pushingpixels.flamingo.api.common.icon.DecoratedResizableIcon
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon
import org.pushingpixels.flamingo.api.common.model.ActionButtonModel
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuPrimaryCommand
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizeSequencingPolicies
import org.pushingpixels.flamingo.api.ribbon.resize.IconRibbonBandResizePolicy
import org.pushingpixels.kormorant.*
import org.pushingpixels.kormorant.ribbon.*
import org.pushingpixels.neon.NeonCortex
import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.text.MessageFormat
import java.util.*
import javax.imageio.ImageIO
import javax.swing.*
import javax.swing.border.EmptyBorder

object SkinSwitcher {
    fun getSkinSwitcher(frame: JFrame): JComboBox<*> {
        val skinInfoMap = SubstanceCortex.GlobalScope.getAllSkins()
        val skinNames = skinInfoMap.keys.toTypedArray()
        val result = JComboBox(skinNames)
        for (i in skinNames.indices) {
            if (skinNames[i] == SubstanceCortex.GlobalScope.getCurrentSkin()!!.displayName) {
                result.selectedIndex = i
                break
            }
        }

        result.addItemListener {
            SwingUtilities.invokeLater {
                val selected = result.selectedItem as String
                SubstanceCortex.GlobalScope.setSkin(
                        SubstanceCortex.GlobalScope.getAllSkins()[selected]!!.className)
                SwingUtilities.updateComponentTreeUI(frame)
            }
        }

        return result
    }
}

class RulerPanel : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        val g2d = g.create() as Graphics2D
        NeonCortex.installDesktopHints(g2d, this)
        g2d.color = Color.gray

        if (componentOrientation.isLeftToRight) {
            // horizontal ruler on top
            val offset = 20
            run {
                var i = offset
                while (i < this.width) {
                    if ((i - offset) % 100 == 0) {
                        i += 10
                        continue
                    }
                    g2d.drawLine(i, 9, i, 11)
                    i += 10
                }
            }
            run {
                var i = offset + 50
                while (i < this.width) {
                    g2d.drawLine(i, 7, i, 13)
                    i += 100
                }
            }
            run {
                var i = offset
                while (i < this.width) {
                    val c = (i - offset) / 100 % 10
                    g2d.drawString("" + c, i - 2, 15)
                    i += 100
                }
            }

            // vertical ruler on left
            run {
                var i = offset
                while (i < this.height) {
                    if ((i - offset) % 100 == 0) {
                        i += 10
                        continue
                    }
                    g2d.drawLine(9, i, 11, i)
                    i += 10
                }
            }
            run {
                var i = offset + 50
                while (i < this.height) {
                    g2d.drawLine(7, i, 13, i)
                    i += 100
                }
            }
            var i = offset
            while (i < this.height) {
                val c = (i - offset) / 100 % 10
                g2d.drawString("" + c, 8, i + 4)
                i += 100
            }
        } else {
            // horizontal ruler on top
            val offset = 20
            run {
                var i = width - offset
                while (i > 0) {
                    if ((width - offset - i) % 100 == 0) {
                        i -= 10
                        continue
                    }
                    g2d.drawLine(i, 9, i, 11)
                    i -= 10
                }
            }
            run {
                var i = width - offset - 50
                while (i > 0) {
                    g2d.drawLine(i, 7, i, 13)
                    i -= 100
                }
            }
            run {
                var i = width - offset
                while (i > 0) {
                    val c = (width - offset - i) / 100 % 10
                    g2d.drawString("" + c, i - 2, 15)
                    i -= 100
                }
            }

            // vertical ruler on right
            run {
                var i = offset
                while (i < this.height) {
                    if ((i - offset) % 100 == 0) {
                        i += 10
                        continue
                    }
                    g2d.drawLine(width - 9, i, width - 11, i)
                    i += 10
                }
            }
            run {
                var i = offset + 50
                while (i < this.height) {
                    g2d.drawLine(width - 7, i, width - 13, i)
                    i += 100
                }
            }
            var i = offset
            while (i < this.height) {
                val c = (i - offset) / 100 % 10
                g2d.drawString("" + c, width - 14, i + 4)
                i += 100
            }
        }
        g2d.dispose()
    }
}

private class ExpandActionListener : ActionListener {
    override fun actionPerformed(e: ActionEvent) {
        JOptionPane.showMessageDialog(null, "Expand button clicked")
    }
}

private class SimpleResizableIcon(private val priority: RibbonElementPriority, private var currWidth: Int,
                                  private var currHeight: Int) : ResizableIcon {

    override fun setDimension(newDimension: Dimension) {
        this.currWidth = newDimension.width
        this.currHeight = newDimension.height
    }

    override fun getIconHeight(): Int {
        return this.currHeight
    }

    override fun getIconWidth(): Int {
        return this.currWidth
    }

    override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
        val graphics = g.create() as Graphics2D
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)

        val rx = this.currWidth / 3
        val ry = this.currHeight / 3
        val cx = x + this.currWidth / 2 - 1
        val cy = y + this.currHeight / 2 - 1
        var color: Color? = null
        when (this.priority) {
            RibbonElementPriority.TOP -> color = Color(0, 0, 128)
            RibbonElementPriority.MEDIUM -> color = Color.blue
            RibbonElementPriority.LOW -> color = Color(128, 128, 255)
        }

        graphics.color = color
        graphics.fillOval(cx - rx, cy - ry, 2 * rx, 2 * ry)
        graphics.color = color!!.darker()
        graphics.drawOval(cx - rx, cy - ry, 2 * rx, 2 * ry)
        graphics.drawRect(x, y, this.currWidth - 2, this.currHeight - 2)

        graphics.dispose()
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
                                                        NeonCortex.installDesktopHints(g2d, component)
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

            resizePolicies = { ribbonBand ->
                listOf(CoreRibbonResizePolicies.Mirror(ribbonBand.controlPanel),
                        CoreRibbonResizePolicies.Mid2Low(ribbonBand.controlPanel))
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
                                        NeonCortex.installDesktopHints(g2d, component)
                                        g2d.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                .getFontSet(null).controlFont
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
                                        NeonCortex.installDesktopHints(g2d, component)
                                        g2d.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                .getFontSet(null).controlFont
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

            resizePolicies = { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesRestrictive(ribbonBand) }
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

            resizePolicies = { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesRestrictive(ribbonBand) }
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

            resizePolicies = { ribbonBand ->
                listOf(CoreRibbonResizePolicies.Mirror(ribbonBand.controlPanel),
                        IconRibbonBandResizePolicy(ribbonBand.controlPanel))
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

    fun getActionBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Action.textBandTitle")
            icon = Document_new.of(16, 16)
            expandCommand {
                action = ExpandActionListener()
            }

            group {
                command(RibbonElementPriority.TOP) {
                    title = resourceBundle.getString("AddressBook.text")
                    icon = Address_book_new.of(16, 16)
                    action = ActionListener { println("Address Book activated") }
                    actionKeyTip = "NA"
                }
            }

            group {
                command(RibbonElementPriority.TOP) {
                    title = resourceBundle.getString("Document.text")
                    icon = Document_new.of(16, 16)
                    action = ActionListener { println("Document activated") }
                    actionKeyTip = "ND"
                }

                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("Appointment.text")
                    icon = Appointment_new.of(16, 16)
                    action = ActionListener { println("Appointment activated") }
                    actionKeyTip = "NP"
                }

                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("Bookmark.text")
                    icon = Bookmark_new.of(16, 16)
                    action = ActionListener { println("Bookmark activated") }
                    actionKeyTip = "NB"
                }

                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("Contact.text")
                    icon = Contact_new.of(16, 16)
                    action = ActionListener { println("Contact activated") }
                    actionKeyTip = "NC"
                }
            }

            resizePolicies = { ribbonBand ->
                listOf(CoreRibbonResizePolicies.Mirror(ribbonBand.controlPanel),
                        CoreRibbonResizePolicies.Mid2Low(ribbonBand.controlPanel),
                        IconRibbonBandResizePolicy(ribbonBand.controlPanel))
            }
        }
    }

    fun getPreferencesBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Preferences.textBandTitle")
            icon = Preferences_desktop_font.of(16, 16)
            expandCommand {
                action = ExpandActionListener()
            }

            group {
                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("Accessibility.text")
                    icon = Preferences_desktop_accessibility.of(16, 16)
                    action = ActionListener { println("Accessibility activated") }
                    actionKeyTip = "Y"
                }

                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("Assistive.text")
                    icon = Preferences_desktop_assistive_technology.of(16, 16)
                    action = ActionListener { println("Assistive activated") }
                    actionKeyTip = "E"
                }

                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("KeyboardShortcuts.text")
                    icon = Preferences_desktop_keyboard_shortcuts.of(16, 16)
                    popupCallback = getSimplePopupMenu()
                    popupKeyTip = "H"
                }
            }

            group {
                command(RibbonElementPriority.TOP) {
                    title = resourceBundle.getString("Font.text")
                    icon = Preferences_desktop_font.of(16, 16)
                    action = ActionListener { println("Font activated") }
                    actionKeyTip = "Z"
                }

                command(RibbonElementPriority.TOP) {
                    title = resourceBundle.getString("Locale.text")
                    icon = Preferences_desktop_locale.of(16, 16)
                    action = ActionListener { println("Locale activated") }
                    actionKeyTip = "L"
                }
            }

            group {
                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("Screensaver.text")
                    icon = Preferences_desktop_screensaver.of(16, 16)
                    action = ActionListener { println("Screensaver activated") }
                    actionKeyTip = "V"
                }

                command(RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("Themes.text")
                    icon = Preferences_desktop_theme.of(16, 16)
                    action = ActionListener { println("Themes activated") }
                    actionKeyTip = "T"
                }
            }

            resizePolicies = { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesRestrictive(ribbonBand) }
        }
    }

    fun getApplicationsBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Applications.textBandTitle")
            icon = Applications_other.of(16, 16)
            expandCommand {
                action = ExpandActionListener()
            }

            wrapper {
                caption = resourceBundle.getString("Games.text")
                icon = Applications_games.of(16, 16)
                component = JComboBox(arrayOf<Any>("Tetris", "Minesweeper", "Doom"))
                keyTip = "AG"
                isResizingAware = true
                horizontalAlignment = HorizontalAlignment.FILL
            }

            wrapper {
                caption = resourceBundle.getString("Internet.text")
                icon = Applications_internet.of(16, 16)
                component = JComboBox(arrayOf<Any>("Firefox", "Opera", "Konqueror"))
                keyTip = "AI"
                isEnabled = false
                isResizingAware = true
                horizontalAlignment = HorizontalAlignment.FILL
            }

            wrapper {
                caption = resourceBundle.getString("Multimedia.text")
                component = JComboBox(arrayOf<Any>(resourceBundle.getString("Pictures.text"),
                        resourceBundle.getString("Video.text"), resourceBundle.getString("Audio.text")))
                keyTip = "AM"
                isResizingAware = true
                horizontalAlignment = HorizontalAlignment.FILL
            }
        }
    }

    fun getParagraphBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Paragraph.textBandTitle")
            icon = Format_justify_left.of(16, 16)

            group {
                title = resourceBundle.getString("Indent.text")

                wrapper {
                    caption = resourceBundle.getString("IndentLeft.text")
                    icon = Format_justify_left.of(16, 16)
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    keyTip = "PL"
                    richTooltip {
                        title = resourceBundle.getString("IndentLeft.tooltip.title")
                        description {
                            +resourceBundle.getString("IndentLeft.tooltip.actionParagraph1")
                            +resourceBundle.getString("IndentLeft.tooltip.actionParagraph2")
                        }
                    }
                }

                wrapper {
                    caption = resourceBundle.getString("IndentRight.text")
                    icon = Format_justify_right.of(16, 16)
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    keyTip = "PR"
                    richTooltip {
                        title = resourceBundle.getString("IndentRight.tooltip.title")
                        description {
                            +resourceBundle.getString("IndentRight.tooltip.actionParagraph1")
                            +resourceBundle.getString("IndentRight.tooltip.actionParagraph2")
                        }
                    }
                }
            }

            group {
                title = resourceBundle.getString("Spacing.text")

                wrapper {
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    keyTip = "PB"
                }

                wrapper {
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    keyTip = "PA"
                }
            }
        }
    }

    fun getShowHideBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("ShowHide.textBandTitle")
            icon = Format_justify_left.of(16, 16)

            wrapper {
                val ruler = JCheckBox(resourceBundle.getString("Ruler.text"))
                ruler.isSelected = true

                component = ruler
                keyTip = "SR"
            }

            wrapper {
                component = JCheckBox(resourceBundle.getString("Gridlines.text"))
                keyTip = "SG"
            }

            wrapper {
                component = JCheckBox(resourceBundle.getString("MessageBar.text"))
                isEnabled = false
                keyTip = "SM"
            }

            wrapper {
                component = JCheckBox(resourceBundle.getString("DocumentMap.text"))
                keyTip = "SD"
            }

            wrapper {
                component = JCheckBox(resourceBundle.getString("Thumbnails.text"))
                keyTip = "ST"
            }
        }
    }

    fun getWriteTask(): KRibbonTask {
        return ribbonTask {
            title = resourceBundle.getString("Write.textTaskTitle")
            keyTip = "W"

            bands {
                +getActionBand()
                +getPreferencesBand()
                +getApplicationsBand()
                +getParagraphBand()
                +getShowHideBand()
            }

            bandResizeSequencingPolicySource = { task -> CoreRibbonResizeSequencingPolicies.CollapseFromLast(task) }
        }
    }

    fun getPreviewBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Preview.textBandTitle")
            icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)

            command(RibbonElementPriority.TOP) {
                title = resourceBundle.getString("Preview.text")
                icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)
                action = ActionListener { println("Preview activated") }
            }

            command(RibbonElementPriority.TOP) {
                title = resourceBundle.getString("SlideShow.text")
                icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)
                action = ActionListener { println("Slide Show activated") }
            }

            resizePolicies = { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesNone(ribbonBand) }
        }
    }

    fun getAnimationBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Animation.textBandTitle")
            icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)

            command(RibbonElementPriority.TOP) {
                title = resourceBundle.getString("CustomAnimation.text")
                icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)
                action = ActionListener { println("Animation 1 activated") }
            }

            command(RibbonElementPriority.TOP) {
                title = resourceBundle.getString("CustomAnimation.text")
                icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)
                action = ActionListener { println("Animation 2 activated") }
            }

            command(RibbonElementPriority.TOP) {
                title = resourceBundle.getString("CustomAnimation.text")
                icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)
                action = ActionListener { println("Animation 3 activated") }
            }

            resizePolicies = { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesNone(ribbonBand) }
        }
    }

    fun getTransitionBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("TransitionToThis.textBandTitle")
            icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)

            gallery(RibbonElementPriority.TOP) {
                title = "Transitions"
                display {
                    state = CommandButtonDisplayState.SMALL
                    preferredPopupMaxCommandColumns = 6
                    preferredPopupMaxVisibleCommandRows = 6
                    commandVisibilities {
                        2 at RibbonElementPriority.LOW
                        4 at RibbonElementPriority.MEDIUM
                        6 at RibbonElementPriority.TOP
                    }
                }

                commandGroup {
                    title = resourceBundle.getString("TransitionGallery.textGroupTitle1")
                    for (i in 1..40) {
                        command {
                            icon = DecoratedResizableIcon(Appointment_new.of(16, 16),
                                    DecoratedResizableIcon.IconDecorator { c, g, x, y, _, height ->
                                        val g2d = g.create() as Graphics2D
                                        NeonCortex.installDesktopHints(g2d, c)
                                        g2d.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                .getFontSet(null).controlFont.deriveFont(9.0f)
                                        g2d.color = Color.black
                                        g2d.drawString("" + i, x + 1, y + height - 2)
                                        g2d.drawString("" + i, x + 3, y + height - 2)
                                        g2d.drawString("" + i, x + 2, y + height - 1)
                                        g2d.drawString("" + i, x + 2, y + height - 3)
                                        g2d.color = Color.white
                                        g2d.drawString("" + i, x + 2, y + height - 2)
                                        g2d.dispose()
                                    })
                            action = ActionListener { println("Activated action $i") }
                            isToggle = true
                        }
                    }
                }

                commandGroup {
                    title = resourceBundle.getString("TransitionGallery.textGroupTitle2")
                    for (i in 41..70) {
                        command {
                            icon = DecoratedResizableIcon(Appointment_new.of(16, 16),
                                    DecoratedResizableIcon.IconDecorator { c, g, x, y, _, height ->
                                        val g2d = g.create() as Graphics2D
                                        NeonCortex.installDesktopHints(g2d, c)
                                        g2d.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                .getFontSet(null).controlFont.deriveFont(9.0f)
                                        g2d.color = Color.black
                                        g2d.drawString("" + i, x + 1, y + height - 2)
                                        g2d.drawString("" + i, x + 3, y + height - 2)
                                        g2d.drawString("" + i, x + 2, y + height - 1)
                                        g2d.drawString("" + i, x + 2, y + height - 3)
                                        g2d.color = Color.white
                                        g2d.drawString("" + i, x + 2, y + height - 2)
                                        g2d.dispose()
                                    })
                            action = ActionListener { println("Activated action $i") }
                            isToggle = true
                        }
                    }
                }
            }

            group {
                wrapper {
                    caption = resourceBundle.getString("Sound.text")
                    icon = SimpleResizableIcon(RibbonElementPriority.TOP, 16, 16)
                    component = JComboBox(arrayOf<Any>("[" + resourceBundle.getString("NoSound.text") + "]     "))
                }

                wrapper {
                    caption = resourceBundle.getString("Speed.text")
                    component = JComboBox(arrayOf<Any>(resourceBundle.getString("Medium.text") + "           "))
                }

                wrapper {
                    commandButton {
                        display {
                            state = CommandButtonDisplayState.MEDIUM
                            verticalGapScaleFactor = 0.5
                        }
                        command {
                            title = resourceBundle.getString("ApplyToAll.text")
                            icon = SimpleResizableIcon(RibbonElementPriority.TOP, 16, 16)
                            action = ActionListener { println("Apply To All activated") }
                        }
                    }
                }
            }
        }
    }

    fun getTransitionNextBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("TransitionToNext.textBandTitle")
            icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)

            wrapper {
                val mouseClick = JCheckBox(resourceBundle.getString("OnMouseClick.text"))
                mouseClick.isSelected = true

                component = mouseClick
            }

            wrapper {
                component = JCheckBox(resourceBundle.getString("AutoAfter.text"))
            }

            wrapper {
                icon = SimpleResizableIcon(RibbonElementPriority.TOP, 16, 16)
                component = JSpinner(SpinnerDateModel())
            }
        }
    }

    fun getAnimationsTask(): KRibbonTask {
        return ribbonTask {
            title = resourceBundle.getString("Animations.textTaskTitle")
            keyTip = "A"

            bands {
                +getPreviewBand()
                +getAnimationBand()
                +getTransitionBand()
                +getTransitionNextBand()
            }
        }
    }

    fun getRowSpanBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("RowSpans.textBandTitle")
            icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)

            wrapper(rowSpan = 3) {
                val textPane1 = JTextPane()
                textPane1.text = resourceBundle.getString("ThreeRows.text")
                val scrollPane1 = JScrollPane(textPane1)
                scrollPane1.preferredSize = Dimension(120, 100)

                component = scrollPane1
            }

            wrapper(rowSpan = 1) {
                component = JTextField(resourceBundle.getString("OneRow.text"), 8)
            }

            wrapper(rowSpan = 2) {
                val textPane3 = JTextPane()
                textPane3.text = resourceBundle.getString("TwoRows.text")
                val scrollPane3 = JScrollPane(textPane3)
                scrollPane3.preferredSize = Dimension(80, 100)

                component = scrollPane3
            }

            wrapper(rowSpan = 2) {
                val textPane4 = JTextPane()
                textPane4.text = resourceBundle.getString("TwoRows.text")
                val scrollPane4 = JScrollPane(textPane4)
                scrollPane4.preferredSize = Dimension(80, 100)

                component = scrollPane4
            }

            wrapper(rowSpan = 1) {
                component = JTextField(resourceBundle.getString("OneRow.text"), 8)
            }

            wrapper(rowSpan = 2) {
                val textPane6 = JTextPane()
                textPane6.text = resourceBundle.getString("TwoRows.text")
                val scrollPane6 = JScrollPane(textPane6)
                scrollPane6.preferredSize = Dimension(80, 100)

                component = scrollPane6
            }

            wrapper(rowSpan = 2) {
                val textPane7 = JTextPane()
                textPane7.text = resourceBundle.getString("TwoRows.text")
                val scrollPane7 = JScrollPane(textPane7)
                scrollPane7.preferredSize = Dimension(80, 100)

                component = scrollPane7
            }

            resizePolicies = { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesNone(ribbonBand) }
        }
    }

    fun getAlignmentBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Alignment.textTaskTitle")
            icon = Format_justify_left.of(16, 16)

            group {
                wrapper {
                    component = JLabel(resourceBundle.getString("VeryLong.text"))
                }

                wrapper {
                    caption = resourceBundle.getString("Leading.text")
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    horizontalAlignment = HorizontalAlignment.LEADING
                }

                wrapper {
                    caption = resourceBundle.getString("Trailing.text")
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    horizontalAlignment = HorizontalAlignment.TRAILING
                }

                wrapper {
                    component = JLabel(resourceBundle.getString("VeryLong.text"))
                }

                wrapper {
                    caption = resourceBundle.getString("Center.text")
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    horizontalAlignment = HorizontalAlignment.CENTER
                }

                wrapper {
                    caption = resourceBundle.getString("Fill.text")
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    horizontalAlignment = HorizontalAlignment.FILL
                }
            }

            group {
                wrapper {
                    component = JLabel(resourceBundle.getString("Long.text"))
                }

                wrapper {
                    caption = resourceBundle.getString("Leading.text")
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    horizontalAlignment = HorizontalAlignment.LEADING
                }

                wrapper {
                    caption = resourceBundle.getString("Trailing.text")
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    horizontalAlignment = HorizontalAlignment.TRAILING
                }

                wrapper {
                    component = JLabel(resourceBundle.getString("Long.text"))
                }

                wrapper {
                    caption = resourceBundle.getString("Center.text")
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    horizontalAlignment = HorizontalAlignment.CENTER
                }

                wrapper {
                    caption = resourceBundle.getString("Fill.text")
                    component = JSpinner(SpinnerNumberModel(0, 0, 100, 5))
                    horizontalAlignment = HorizontalAlignment.FILL
                }
            }
        }
    }


    fun getWrappedTask(): KRibbonTask {
        return ribbonTask {
            title = resourceBundle.getString("Wrapped.textTaskTitle")
            keyTip = "R"

            bands {
                +getRowSpanBand()
                +getAlignmentBand()
            }
        }
    }

    fun getContextualRibbonTask(taskTitle: String, taskKeyTip: String): KRibbonTask {
        return ribbonTask {
            title = taskTitle
            keyTip = taskKeyTip

            bands {
                +getActionBand()
                +getApplicationsBand()
                +getPreviewBand()
                +getTransitionBand()
            }
        }
    }
}

fun getApplicationMenuRichTooltipIcon(): ResizableIcon {
    val appMenuButtonTooltipImage = ImageIO
            .read(RibbonDemoBuilder::class.java.classLoader.getResource(
                    "org.pushingpixels.demo.kormorant.ribbon/appmenubutton-tooltip-main.png"))
    val appMenuButtonTooltipImageWidth = appMenuButtonTooltipImage.getWidth()
    val appMenuButtonTooltipImageHeight = appMenuButtonTooltipImage.getHeight()
    val appMenuButtonTooltipImageRatio =
            appMenuButtonTooltipImageWidth.toFloat() / appMenuButtonTooltipImageHeight.toFloat()
    val appMenuButtonTooltipImageInitialWidth = 160
    val appMenuButtonTooltipImageInitialHeight =
            (appMenuButtonTooltipImageInitialWidth / appMenuButtonTooltipImageRatio).toInt()
    val appMenuRichTooltipMainIcon = object : ResizableIcon {
        private var width: Int = 0
        private var height: Int = 0

        override fun getIconWidth(): Int {
            return this.width
        }

        override fun getIconHeight(): Int {
            return this.height
        }

        override fun setDimension(newDimension: Dimension) {
            this.width = newDimension.width
            this.height = newDimension.height
        }

        override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
            g.drawImage(appMenuButtonTooltipImage, x, y, iconWidth, iconHeight,
                    null)
        }
    }
    appMenuRichTooltipMainIcon.setDimension(Dimension(
            appMenuButtonTooltipImageInitialWidth, appMenuButtonTooltipImageInitialHeight))
    return appMenuRichTooltipMainIcon
}

fun configureControlPanel(ribbonFrame: JRibbonFrame, builder: DefaultFormBuilder) {
    val ribbon = ribbonFrame.ribbon

    val group1Visible = JCheckBox("visible")
    val group2Visible = JCheckBox("visible")
    group1Visible.addActionListener {
        SwingUtilities.invokeLater {
            ribbon.setVisible(ribbon.getContextualTaskGroup(0), group1Visible.isSelected)
        }
    }
    group2Visible.addActionListener {
        SwingUtilities.invokeLater {
            ribbon.setVisible(ribbon.getContextualTaskGroup(1), group2Visible.isSelected)
        }
    }
    builder.append("Group 1", group1Visible)
    builder.append("Group 2", group2Visible)

    builder.append("Skins", SkinSwitcher.getSkinSwitcher(ribbonFrame))

    val taskbarEnabled = JCheckBox("enabled")
    taskbarEnabled.isSelected = true
    taskbarEnabled.addActionListener {
        SwingUtilities.invokeLater {
            for (command in ribbon.taskbarCommands) {
                command.isEnabled = taskbarEnabled.isSelected
            }
        }
    }
    builder.append("Taskbar", taskbarEnabled)


    val toggleMinimize = JCheckBox("minimized")
    toggleMinimize.isSelected = false
    toggleMinimize.addActionListener {
        SwingUtilities.invokeLater {
            ribbon.isMinimized = !ribbon.isMinimized
        }
    }
    builder.append("Minimize", toggleMinimize)
}

fun main(args: Array<String>) {
    SwingUtilities.invokeLater {
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)

        SubstanceCortex.GlobalScope.setSkin(OfficeBlue2007Skin())

        val builder = RibbonDemoBuilder()

        val ribbonFrame = ribbonFrame {
            title = builder.resourceBundle.getString("Frame.title")
            applicationIcon = Applications_internet.of(16, 16)

            tasks {
                +builder.getPageLayoutTask()
                +builder.getWriteTask()
                +builder.getAnimationsTask()
                +builder.getWrappedTask()
            }

            contextualTaskGroups {
                taskGroup {
                    title = builder.resourceBundle.getString("Group1.textTaskGroupTitle")
                    color = Color.red

                    tasks {
                        +builder.getContextualRibbonTask(
                                builder.resourceBundle.getString("Task11.textTaskTitle"), "XA")
                        +builder.getContextualRibbonTask(
                                builder.resourceBundle.getString("Task12.textTaskTitle"), "XB")
                    }
                }

                taskGroup {
                    title = builder.resourceBundle.getString("Group2.textTaskGroupTitle")
                    color = Color.green

                    tasks {
                        +builder.getContextualRibbonTask(
                                builder.resourceBundle.getString("Task21.textTaskTitle"), "YA")
                    }
                }
            }

            anchored {
                command {
                    title = builder.resourceBundle.getString("Share.title")
                    icon = Internet_mail.of(16, 16)
                    actionKeyTip = "GS"
                    action = ActionListener { JOptionPane.showMessageDialog(null, "Share button clicked") }
                }

                command {
                    icon = Internet_group_chat.of(16, 16)
                    actionKeyTip = "GC"
                    action = ActionListener { JOptionPane.showMessageDialog(null, "Chat button clicked") }
                }

                command {
                    icon = Help_browser.of(16, 16)
                    actionKeyTip = "GH"
                    action = ActionListener { JOptionPane.showMessageDialog(null, "Help button clicked") }
                    actionRichTooltip {
                        title = builder.resourceBundle.getString("Help.tooltip.title")
                        description {
                            +builder.resourceBundle.getString("Help.tooltip.actionParagraph")
                        }
                    }
                }
            }

            taskbar {
                command {
                    icon = Edit_paste.of(16, 16)
                    action = ActionListener { println("Taskbar Paste activated") }
                    actionRichTooltip {
                        title = builder.resourceBundle.getString("Paste.text")
                        description {
                            +builder.resourceBundle.getString("Paste.tooltip.actionParagraph1")
                        }
                    }
                    actionKeyTip = "1"
                    popupCallback = builder.getSimplePopupMenu()
                    popupRichTooltip {
                        title = builder.resourceBundle.getString("Paste.text")
                        description {
                            +builder.resourceBundle.getString("Paste.tooltip.actionParagraph1")
                        }
                    }
                    isTitleClickAction = true
                }

                command {
                    icon = Edit_clear.of(16, 16)
                    action = ActionListener { println("Taskbar Clear activated") }
                    actionKeyTip = "2"
                    isEnabled = false
                }

                command {
                    icon = Edit_copy.of(16, 16)
                    action = ActionListener { println("Taskbar Copy activated") }
                    actionKeyTip = "3"
                }

                separator()

                command {
                    icon = Edit_find.of(16, 16)
                    action = ActionListener { println("Taskbar Find activated") }
                    actionKeyTip = "4"
                }
            }

            applicationMenu {
                title = builder.resourceBundle.getString("AppMenu.title")
                richTooltip {
                    title = builder.resourceBundle.getString("AppMenu.tooltip.title")
                    description {
                        +builder.resourceBundle.getString("AppMenu.tooltip.paragraph1")
                    }
                    mainIcon = getApplicationMenuRichTooltipIcon()
                    footer {
                        +builder.resourceBundle.getString("AppMenu.tooltip.footer1")
                    }
                    footerIcon = Help_browser.of(16, 16)
                }
                keyTip = "F"

                defaultCallback = RibbonApplicationMenuPrimaryCommand.PrimaryRolloverCallback { targetPanel ->
                    targetPanel.removeAll()

                    val openHistoryPanel = commandButtonPanel {
                        display {
                            state = CommandButtonDisplayState.MEDIUM
                            maxButtonColumns = 1
                            buttonHorizontalAlignment = SwingConstants.LEADING
                        }
                        commandGroup {
                            title = builder.resourceBundle.getString("AppMenu.default.textGroupTitle1")

                            val mf = MessageFormat(
                                    builder.resourceBundle.getString("AppMenu.default.textButton"))
                            mf.locale = builder.currLocale
                            for (i in 0..4) {
                                command {
                                    title = mf.format(arrayOf<Any>(i))
                                    icon = Text_html.of(16, 16)
                                    action = ActionListener { println("Action $i activated") }
                                }
                            }
                        }
                    }

                    targetPanel.layout = BorderLayout()
                    targetPanel.add(openHistoryPanel.asButtonPanel(), BorderLayout.CENTER)
                }

                // "Create new" primary
                primaryCommand {
                    title = builder.resourceBundle.getString("AppMenuNew.text")
                    icon = Document_new.of(16, 16)
                    action = ActionListener { println("Invoked creating new document") }
                    actionKeyTip = "N"
                }

                // "Open" primary
                primaryCommand {
                    title = builder.resourceBundle.getString("AppMenuOpen.text")
                    icon = Document_open.of(16, 16)
                    action = ActionListener { println("Invoked opening document") }
                    actionKeyTip = "O"
                    rolloverCallback = RibbonApplicationMenuPrimaryCommand.PrimaryRolloverCallback { targetPanel ->
                        targetPanel.removeAll()

                        val openHistoryPanel = commandButtonPanel {
                            display {
                                state = CommandButtonDisplayState.MEDIUM
                                maxButtonColumns = 1
                                buttonHorizontalAlignment = SwingConstants.LEADING
                            }
                            commandGroup {
                                title = builder.resourceBundle.getString("AppMenuOpen.secondary.textGroupTitle1")

                                val mf = MessageFormat(
                                        builder.resourceBundle.getString("AppMenuOpen.secondary.textButton"))
                                mf.locale = builder.currLocale
                                for (i in 0..4) {
                                    command {
                                        title = mf.format(arrayOf<Any>(i))
                                        icon = Text_html.of(16, 16)
                                        action = ActionListener { println("Action $i activated") }
                                    }
                                }
                            }
                        }

                        targetPanel.layout = BorderLayout()
                        targetPanel.add(openHistoryPanel.asButtonPanel(), BorderLayout.CENTER)
                    }
                }

                // "Save" primary
                primaryCommand {
                    title = builder.resourceBundle.getString("AppMenuSave.text")
                    icon = Document_save.of(16, 16)
                    action = ActionListener { println("Invoked saving document") }
                    actionKeyTip = "S"
                    isEnabled = false
                }

                // "Save as" primary + secondaries
                primaryCommand {
                    title = builder.resourceBundle.getString("AppMenuSaveAs.text")
                    icon = Document_save_as.of(16, 16)
                    action = ActionListener { println("Invoked saving document as") }
                    actionKeyTip = "A"
                    popupKeyTip = "F"
                    isTitleClickAction = true

                    secondaryGroup {
                        title = builder.resourceBundle.getString("AppMenuSaveAs.secondary.textGroupTitle1")

                        command {
                            title = builder.resourceBundle.getString("AppMenuSaveAs.word.text")
                            icon = X_office_document.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSaveAs.word.description")
                            action = ActionListener { println("Invoked saved as Word") }
                            actionKeyTip = "W"
                        }

                        command {
                            title = builder.resourceBundle.getString("AppMenuSaveAs.html.text")
                            icon = Text_html.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSaveAs.html.description")
                            action = ActionListener { println("Invoked saved as HTML") }
                            actionKeyTip = "H"
                            isEnabled = false
                        }

                        command {
                            title = builder.resourceBundle.getString("AppMenuSaveAs.other.text")
                            icon = Document_save_as.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSaveAs.other.description")
                            action = ActionListener { println("Invoked saved as other") }
                            actionKeyTip = "O"
                        }
                    }
                }

                primarySeparator()

                // "Print" primary + secondaries
                primaryCommand {
                    title = builder.resourceBundle.getString("AppMenuPrint.text")
                    icon = Document_print.of(16, 16)
                    action = ActionListener { println("Invoked printing as") }
                    actionKeyTip = "P"
                    popupKeyTip = "W"
                    isTitleClickAction = true

                    secondaryGroup {
                        title = builder.resourceBundle.getString("AppMenuPrint.secondary.textGroupTitle1")

                        command {
                            title = builder.resourceBundle.getString("AppMenuPrint.print.text")
                            icon = Printer.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuPrint.print.description")
                            action = ActionListener { println("Invoked print") }
                            actionKeyTip = "P"
                        }

                        command {
                            title = builder.resourceBundle.getString("AppMenuPrint.quick.text")
                            icon = Printer.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuPrint.quick.description")
                            action = ActionListener { println("Invoked quick") }
                            actionKeyTip = "Q"
                        }

                        command {
                            title = builder.resourceBundle.getString("AppMenuPrint.preview.text")
                            icon = Document_print_preview.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuPrint.preview.description")
                            action = ActionListener { println("Invoked preview") }
                            actionKeyTip = "V"
                        }
                    }

                    secondaryGroup {
                        title = builder.resourceBundle.getString("AppMenuPrint.secondary.textGroupTitle2")

                        command {
                            title = builder.resourceBundle.getString("AppMenuPrint.memo.text")
                            icon = Text_x_generic.of(16, 16)
                            action = ActionListener { println("Invoked memo") }
                            actionKeyTip = "M"
                        }

                        command {
                            title = builder.resourceBundle.getString("AppMenuPrint.custom.text")
                            icon = Text_x_generic.of(16, 16)
                            action = ActionListener { println("Invoked custom") }
                            actionKeyTip = "C"
                        }
                    }
                }

                // "Send" primary + secondaries
                primaryCommand {
                    title = builder.resourceBundle.getString("AppMenuSend.text")
                    icon = Mail_forward.of(16, 16)
                    popupKeyTip = "D"

                    secondaryGroup {
                        title = builder.resourceBundle.getString("AppMenuSend.secondary.textGroupTitle1")

                        command {
                            title = builder.resourceBundle.getString("AppMenuSend.email.text")
                            icon = Mail_message_new.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSend.email.description")
                            action = ActionListener { println("Invoked email") }
                            actionKeyTip = "E"
                        }

                        command {
                            title = builder.resourceBundle.getString("AppMenuSend.html.text")
                            icon = Text_html.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSend.html.description")
                            action = ActionListener { println("Invoked HTML") }
                            actionKeyTip = "H"
                        }

                        command {
                            title = builder.resourceBundle.getString("AppMenuSend.word.text")
                            icon = X_office_document.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSend.word.description")
                            action = ActionListener { println("Invoked Word") }
                            actionKeyTip = "W"
                        }

                        command {
                            title = builder.resourceBundle.getString("AppMenuSend.wireless.text")
                            icon = Mail_message_new.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSend.wireless.description")
                            popupCallback = PopupPanelCallback {
                                commandPopupMenu {
                                    command {
                                        title = builder.resourceBundle.getString("AppMenuSend.wireless.wifi.text")
                                        icon = EmptyResizableIcon(16)
                                        action = ActionListener { println("WiFi activated") }
                                        actionKeyTip = "W"
                                    }

                                    command {
                                        title = builder.resourceBundle.getString("AppMenuSend.wireless.bluetooth.text")
                                        icon = EmptyResizableIcon(16)
                                        action = ActionListener { println("Bluetooth activated") }
                                        actionKeyTip = "B"
                                    }
                                }.asCommandPopupMenu()
                            }
                            popupKeyTip = "X"
                        }

                    }
                }

                // "Exit" primary
                primaryCommand {
                    title = builder.resourceBundle.getString("AppMenuExit.text")
                    icon = System_log_out.of(16, 16)
                    action = ActionListener { System.exit(0) }
                    actionKeyTip = "X"
                    rolloverCallback = RibbonApplicationMenuPrimaryCommand.PrimaryClearRolloverCallback()
                }

                footer {
                    command {
                        title = builder.resourceBundle.getString("AppMenuOptions.text")
                        icon = Document_properties.of(16, 16)
                        action = ActionListener { println("Invoked Options") }
                    }

                    command {
                        title = builder.resourceBundle.getString("AppMenuExit.text")
                        icon = System_log_out.of(16, 16)
                        action = ActionListener { System.exit(0) }
                    }
                }
            }
        }

        val javaRibbonFrame = ribbonFrame.asRibbonFrame()

        val controlPanel = JPanel()
        controlPanel.border = EmptyBorder(20, 0, 0, 5)
        val lm = FormLayout("right:pref, 4dlu, fill:pref:grow", "")
        val formBuilder = DefaultFormBuilder(lm, controlPanel)
        configureControlPanel(javaRibbonFrame, formBuilder)

        javaRibbonFrame.add(controlPanel, BorderLayout.EAST)
        javaRibbonFrame.add(RulerPanel(), BorderLayout.CENTER)

        javaRibbonFrame.applyComponentOrientation(
                ComponentOrientation.getOrientation(builder.currLocale))
        val r = GraphicsEnvironment.getLocalGraphicsEnvironment().maximumWindowBounds
        javaRibbonFrame.preferredSize = Dimension(r.width, r.height / 2)
        javaRibbonFrame.minimumSize = Dimension(r.width / 10, r.height / 2)
        javaRibbonFrame.pack()
        javaRibbonFrame.setLocation(r.x, r.y)
        javaRibbonFrame.defaultCloseOperation = WindowConstants.DISPOSE_ON_CLOSE

        javaRibbonFrame.setVisible(true)
    }
}
