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

import com.jgoodies.forms.builder.FormBuilder
import org.pushingpixels.demo.kormorant.LocaleSwitcher
import org.pushingpixels.demo.kormorant.popup.ColorIcon
import org.pushingpixels.demo.kormorant.svg.*
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState
import org.pushingpixels.flamingo.api.common.CommandListener
import org.pushingpixels.flamingo.api.common.HorizontalAlignment
import org.pushingpixels.flamingo.api.common.icon.ColorResizableIcon
import org.pushingpixels.flamingo.api.common.icon.DecoratedResizableIcon
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon
import org.pushingpixels.flamingo.api.common.model.ActionButtonModel
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuPrimaryCommand
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizeSequencingPolicies
import org.pushingpixels.kormorant.*
import org.pushingpixels.kormorant.ribbon.*
import org.pushingpixels.meteor.addDelayedActionListener
import org.pushingpixels.meteor.addDelayedItemListener
import org.pushingpixels.meteor.awt.brightness
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.neon.NeonCortex
import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.skin.BusinessSkin
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.text.MessageFormat
import java.util.*
import javax.imageio.ImageIO
import javax.swing.*
import javax.swing.border.EmptyBorder

object SkinSwitcher {
    fun getSkinSwitcher(): JComboBox<String> {
        val skinInfoMap = SubstanceCortex.GlobalScope.getAllSkins()
        val skinNames = skinInfoMap.keys.toTypedArray()
        val result = JComboBox<String>(skinNames)
        result.selectedIndex = skinNames.indexOfFirst { it ->
            it == SubstanceCortex.GlobalScope.getCurrentSkin()!!.displayName
        }

        result.addDelayedItemListener {
            val selected = result.selectedItem as String
            SubstanceCortex.GlobalScope.setSkin(
                    SubstanceCortex.GlobalScope.getAllSkins()[selected]!!.className)
        }

        return result
    }
}

class RulerPanel : JPanel() {
    private var line = Color.darkGray
    private var previewFill: Color? = null
    private var selectFill = Color(200, 200, 200)
    private var backgroundFill = selectFill

    private fun setBackgroundFill(backgroundFill: Color) {
        this.backgroundFill = backgroundFill
        val brightness = this.backgroundFill.brightness()
        this.line = if (brightness > 0.7f) Color.darkGray else Color.white
        this.invalidate()
        this.repaint()
    }

    fun previewBackgroundFill(previewFill: Color?) {
        this.previewFill = previewFill
        this.setBackgroundFill(this.previewFill ?: this.selectFill)
    }

    fun selectBackgroundFill(selectFill: Color) {
        this.previewFill = null
        this.selectFill = selectFill
        this.setBackgroundFill(this.selectFill)
    }

    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        g.render {
            NeonCortex.installDesktopHints(it, this)
            it.color = backgroundFill
            it.fillRect(0, 0, width, height)

            it.color = line
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
                        it.drawLine(i, 9, i, 11)
                        i += 10
                    }
                }
                run {
                    var i = offset + 50
                    while (i < this.width) {
                        it.drawLine(i, 7, i, 13)
                        i += 100
                    }
                }
                run {
                    var i = offset
                    while (i < this.width) {
                        val c = (i - offset) / 100 % 10
                        it.drawString("" + c, i - 2, 15)
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
                        it.drawLine(9, i, 11, i)
                        i += 10
                    }
                }
                run {
                    var i = offset + 50
                    while (i < this.height) {
                        it.drawLine(7, i, 13, i)
                        i += 100
                    }
                }
                var i = offset
                while (i < this.height) {
                    val c = (i - offset) / 100 % 10
                    it.drawString("" + c, 8, i + 4)
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
                        it.drawLine(i, 9, i, 11)
                        i -= 10
                    }
                }
                run {
                    var i = width - offset - 50
                    while (i > 0) {
                        it.drawLine(i, 7, i, 13)
                        i -= 100
                    }
                }
                run {
                    var i = width - offset
                    while (i > 0) {
                        val c = (width - offset - i) / 100 % 10
                        it.drawString("" + c, i - 2, 15)
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
                        it.drawLine(width - 9, i, width - 11, i)
                        i += 10
                    }
                }
                run {
                    var i = offset + 50
                    while (i < this.height) {
                        it.drawLine(width - 7, i, width - 13, i)
                        i += 100
                    }
                }
                var i = offset
                while (i < this.height) {
                    val c = (i - offset) / 100 % 10
                    it.drawString("" + c, width - 14, i + 4)
                    i += 100
                }
            }
        }
    }
}

private class ExpandActionListener : ActionListener {
    override fun actionPerformed(e: ActionEvent) {
        JOptionPane.showMessageDialog(null, "Expand button clicked")
    }
}

private class SimpleResizableIcon(private val priority: RibbonElementPriority,
        private var currWidth: Int, private var currHeight: Int) : ResizableIcon {

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

        val color: Color = when (this.priority) {
            RibbonElementPriority.TOP -> Color(0, 0, 128)
            RibbonElementPriority.MEDIUM -> Color.blue
            RibbonElementPriority.LOW -> Color(128, 128, 255)
        }

        graphics.color = color
        graphics.fillOval(cx - rx, cy - ry, 2 * rx, 2 * ry)
        graphics.color = color.darker()
        graphics.drawOval(cx - rx, cy - ry, 2 * rx, 2 * ry)
        graphics.drawRect(x, y, this.currWidth - 2, this.currHeight - 2)

        graphics.dispose()
    }
}

private class RibbonDemoBuilder {
    var currLocale = Locale.getDefault()
    var resourceBundle = ResourceBundle.getBundle(
            "org.pushingpixels.demo.kormorant.resources.Resources", currLocale)
    lateinit var rulerPanel: RulerPanel
    val documentNewCommand: KCommand
    val pasteCommand: KCommand
    val styleGalleryContentModel: KRibbonGalleryContent

    init {
        documentNewCommand = command {
            title = resourceBundle.getString("DocumentNew.text")
            iconFactory = Document_new.factory()
            action = CommandListener { println("Document New activated") }
        }

        pasteCommand = command {
            title = resourceBundle.getString("Paste.text")
            iconFactory = Edit_paste.factory()
            action = CommandListener { println("Pasted!") }
            actionRichTooltip {
                title = resourceBundle.getString("Paste.text")
                description {
                    +resourceBundle.getString("Paste.tooltip.actionParagraph1")
                }
            }
            popupMenu = getSimplePopupMenu()
            popupRichTooltip {
                title = resourceBundle.getString("Paste.text")
                description {
                    +resourceBundle.getString("Paste.tooltip.popupParagraph1")
                }
            }
            isTitleClickAction = true
        }

        val mfButtonText = MessageFormat(
                resourceBundle.getString("StylesGallery.textButton"))
        mfButtonText.locale = currLocale

        styleGalleryContentModel = galleryContent {
            iconFactory = Font_x_generic.factory()
            commandGroup {
                title = resourceBundle.getString("StylesGallery.textGroupTitle1")
                for (i in 0 until 10) {
                    command {
                        title = mfButtonText.format(arrayOf<Any>(i))
                        icon = DecoratedResizableIcon(Font_x_generic.of(16, 16),
                                DecoratedResizableIcon.IconDecorator { component, graphics, x, y, _, height ->
                                    graphics.render {
                                        it.color = Color.black
                                        NeonCortex.installDesktopHints(it, component)
                                        it.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                .getFontSet(null).controlFont
                                        it.drawString("$i", x + 2, y + height - 2)
                                    }
                                }
                        )
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
                                    graphics.render {
                                        it.color = Color.black
                                        NeonCortex.installDesktopHints(it, component)
                                        it.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                .getFontSet(null).controlFont
                                        it.drawString("$i", x + 2, y + height - 2)
                                    }
                                }
                        )
                        isToggle = true
                    }
                }
            }

            onCommandActivated = { command -> println("*** Command '" + command.title + "' activated! ***") }
            onCommandPreviewActivated = { command -> println("Preview activated for '" + command.title + "'") }
            onCommandPreviewCanceled = { command -> println("Preview canceled for '" + command.title + "'") }

            extraPopupGroup {
                command(actionKeyTip = "SS") {
                    title = resourceBundle.getString("Format.menuSaveSelection.text")
                    icon = EmptyResizableIcon(16)
                    action = CommandListener {
                        println("Save Selection activated")
                    }
                }

                command(actionKeyTip = "SC") {
                    title = resourceBundle.getString("Format.menuClearSelection.text")
                    icon = EmptyResizableIcon(16)
                    action = CommandListener {
                        println("Clear Selection activated")
                    }
                }
            }

            extraPopupGroup {
                command(actionKeyTip = "SA") {
                    title = resourceBundle.getString("Format.applyStyles.text")
                    icon = Font_x_generic.of(16, 16)
                    action = CommandListener { println("Apply Styles activated") }
                }
            }
        }
    }

    fun getControlPanel(ribbonFrame: JRibbonFrame): JPanel {
        val ribbon = ribbonFrame.ribbon

        val formBuilder = FormBuilder.create()
                .columns("right:pref, 8dlu, fill:pref:grow")
                .rows("p, \$lg, p, \$lg, p, \$lg, p, \$lg, p, \$lg, p, \$lg, p")
                .padding(EmptyBorder(20, 4, 0, 4))

        val group1Visible = JCheckBox("visible")
        val group2Visible = JCheckBox("visible")
        group1Visible.addDelayedActionListener {
            ribbon.setVisible(ribbon.getContextualTaskGroup(0), group1Visible.isSelected)
        }
        group2Visible.addDelayedActionListener {
            ribbon.setVisible(ribbon.getContextualTaskGroup(1), group2Visible.isSelected)
        }
        formBuilder.add("Group 1").xy(1, 1).add(group1Visible).xy(3, 1)
        formBuilder.add("Group 2").xy(1, 3).add(group2Visible).xy(3, 3)

        formBuilder.addLabel("Skin").xy(1, 5).add(SkinSwitcher.getSkinSwitcher()).xy(3, 5)

        val taskbarEnabled = JCheckBox("enabled")
        taskbarEnabled.isSelected = true
        taskbarEnabled.addDelayedActionListener {
            for (command in ribbon.taskbarCommands) {
                command.isEnabled = taskbarEnabled.isSelected
            }
        }
        formBuilder.add("Taskbar").xy(1, 7).add(taskbarEnabled).xy(3, 7)

        val toggleMinimize = JCheckBox("minimized")
        toggleMinimize.isSelected = false
        toggleMinimize.addDelayedActionListener {
            ribbon.isMinimized = !ribbon.isMinimized
        }
        formBuilder.add("Minimize").xy(1, 9).add(toggleMinimize).xy(3, 9)

        val localeSwitcher = LocaleSwitcher.getLocaleSwitcher { selected ->
            currLocale = selected
            resourceBundle = ResourceBundle.getBundle(
                    "org.pushingpixels.demo.kormorant.resources.Resources", currLocale)
            for (window in Window.getWindows()) {
                window.applyComponentOrientation(ComponentOrientation.getOrientation(currLocale))
                SwingUtilities.updateComponentTreeUI(window)
            }
        }
        formBuilder.add("Locale").xy(1, 13).add(localeSwitcher).xy(3, 13)

        return formBuilder.build()
    }

    fun getSimplePopupMenu(): KCommandPopupMenu {
        return commandPopupMenu {
            val mf = MessageFormat(resourceBundle.getString("TestMenuItem.text"))
            group {
                command(actionKeyTip = "1") {
                    title = mf.format(arrayOf("1"))
                    icon = ColorResizableIcon(16, Color(0x80, 0xDE, 0xEA))
                    action = CommandListener {
                        println("Test menu item 1 activated")
                    }
                }
                command(actionKeyTip = "2") {
                    title = mf.format(arrayOf("2"))
                    icon = ColorResizableIcon(16, Color(0x80, 0xCB, 0xC4))
                    action = CommandListener {
                        println("Test menu item 2 activated")
                    }
                }
                command(actionKeyTip = "3") {
                    title = mf.format(arrayOf("3"))
                    icon = ColorResizableIcon(16, Color(0xA5, 0xD6, 0xA7))
                    action = CommandListener {
                        println("Test menu item 3 activated")
                    }
                }
            }

            group {
                command(actionKeyTip = "4") {
                    title = mf.format(arrayOf("4"))
                    icon = ColorResizableIcon(16, Color(0xC5, 0xE1, 0xA5))
                    action = CommandListener {
                        println("Test menu item 4 activated")
                    }
                }
                command(actionKeyTip = "5") {
                    title = mf.format(arrayOf("5"))
                    icon = ColorResizableIcon(16, Color(0xE6, 0xEE, 0x9C))
                    action = CommandListener {
                        println("Test menu item 5 activated")
                    }
                }
            }
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

            command(priority = RibbonElementPriority.TOP, popupKeyTip = "V", command = pasteCommand)

            command(RibbonElementPriority.MEDIUM, popupKeyTip = "X") {
                title = resourceBundle.getString("Cut.text")
                icon = Edit_cut.of(16, 16)
                action = CommandListener { println("Cut!") }
                actionRichTooltip {
                    title = resourceBundle.getString("Cut.text")
                    description {
                        +resourceBundle.getString("Cut.tooltip.actionParagraph1")
                    }
                }
                popupMenu = getSimplePopupMenu()
                isTitleClickAction = true
            }

            command(RibbonElementPriority.MEDIUM, popupKeyTip = "C") {
                title = resourceBundle.getString("Copy.text")
                icon = Edit_copy.of(16, 16)
                action = CommandListener { println("Copy!") }
                popupMenu = getSimplePopupMenu()
                isTitleClickPopup = true
            }

            command(RibbonElementPriority.MEDIUM, popupKeyTip = "FP") {
                title = resourceBundle.getString("Format.text")
                icon = Edit_paste.of(16, 16)
                popupMenu = commandPopupMenu {
                    val mfGroupTitle = MessageFormat(resourceBundle.getString("PanelStyles.text"))
                    mfGroupTitle.locale = currLocale
                    val mfTooltipTitle = MessageFormat(
                            resourceBundle.getString("PanelStyles.tooltip.textActionTitle"))
                    mfTooltipTitle.locale = currLocale
                    val mfTooltipParagraph = MessageFormat(
                            resourceBundle.getString("PanelStyles.tooltip.textActionParagraph1"))
                    mfTooltipParagraph.locale = currLocale

                    commandPanel {
                        presentation {
                            commandIconDimension = 32
                            maxColumns = 5
                            maxRows = 3
                            toShowGroupLabels = true
                        }

                        for (groupIndex in 0 until 4) {
                            commandGroup {
                                title = mfGroupTitle.format(arrayOf<Any>(groupIndex))

                                for (i in 0 until 15) {
                                    command {
                                        icon = DecoratedResizableIcon(Font_x_generic.of(16, 16),
                                                DecoratedResizableIcon.IconDecorator { component, graphics, x, y, _, height ->
                                                    graphics.render {
                                                        it.color = Color.black
                                                        it.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                                .getFontSet(null).controlFont
                                                        NeonCortex.installDesktopHints(it, component)
                                                        it.drawString("" + i, x + 2, y + height - 2)
                                                    }
                                                }
                                        )

                                        isToggle = true
                                        action = CommandListener {
                                            println("Invoked action on $i")
                                        }
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

                    group {
                        command(actionKeyTip = "SS") {
                            title = resourceBundle.getString("Format.menuSaveSelection.text")
                            icon = ColorResizableIcon(16, Color(0xFB, 0xC0, 0x2D))
                            action = CommandListener {
                                println("Save Selection activated")
                            }
                        }

                        command(actionKeyTip = "SC") {
                            title = resourceBundle.getString("Format.menuClearSelection.text")
                            icon = ColorResizableIcon(16, Color(0xFF, 0xA0, 0x00))
                            action = CommandListener {
                                println("Clear Selection activated")
                            }
                        }
                    }

                    group {
                        command(actionKeyTip = "SA") {
                            title = resourceBundle.getString("Format.applyStyles.text")
                            icon = ColorResizableIcon(16, Color(0xF5, 0x7C, 0x00))
                            action = CommandListener {
                                println("Apply Styles activated")
                            }
                        }
                    }
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
            }

            resizePolicies = { ribbonBand ->
                listOf(CoreRibbonResizePolicies.Mirror(ribbonBand),
                        CoreRibbonResizePolicies.Mid2Low(ribbonBand))
            }
        }
    }

    fun getQuickStylesBand(): KRibbonBand {
        val defaultColor = Color(0xEE, 0xEE, 0xEE)

        val onColorActivatedListener = { color: Color ->
            println("Activated color $color")
            rulerPanel.selectBackgroundFill(color)
        }
        val onColorPreviewActivatedListener = { color: Color ->
            println("Preview activated color $color")
            rulerPanel.previewBackgroundFill(color)
        }
        val onColorPreviewCanceledListener = {
            println("Preview canceled")
            rulerPanel.previewBackgroundFill(null)
        }

        return ribbonBand {
            title = resourceBundle.getString("QuickStyles.textBandTitle")
            icon = Preferences_desktop_theme.of(16, 16)
            collapsedStateKeyTip = "ZS"

            gallery(priority = RibbonElementPriority.TOP) {
                content = styleGalleryContentModel

                presentation {
                    state = JRibbonBand.BIG_FIXED_LANDSCAPE
                    preferredPopupMaxCommandColumns = 3
                    preferredPopupMaxVisibleCommandRows = 3
                    commandVisibilities {
                        1 at RibbonElementPriority.LOW
                        2 at RibbonElementPriority.MEDIUM
                        2 at RibbonElementPriority.TOP
                    }
                    expandKeyTip = "L"
                }
            }

            command(priority = RibbonElementPriority.MEDIUM, actionKeyTip = "SA") {
                title = resourceBundle.getString("Styles1.text")
                icon = Font_x_generic.of(16, 16)
                action = CommandListener { println("Generic activated") }
            }

            command(priority = RibbonElementPriority.MEDIUM, actionKeyTip = "SB") {
                title = resourceBundle.getString("Styles2.text")
                icon = Image_x_generic.of(16, 16)
                action = CommandListener { println("Image activated") }
            }

            command(priority = RibbonElementPriority.MEDIUM, popupKeyTip = "SC") {
                title = resourceBundle.getString("Styles3.text")
                icon = Text_html.of(16, 16)
                colorSelectorPopupMenu = colorSelectorPopupMenu {
                    onColorActivated = onColorActivatedListener
                    onColorPreviewActivated = onColorPreviewActivatedListener
                    onColorPreviewCanceled = onColorPreviewCanceledListener

                    command {
                        title = resourceBundle.getString("ColorSelector.textAutomatic")
                        icon = ColorIcon(defaultColor)
                        action = CommandListener {
                            onColorActivatedListener.invoke(defaultColor)
                            JColorSelectorPopupMenu.addColorToRecentlyUsed(defaultColor)
                        }

                        onCommandPreviewActivated = {
                            // Notify the callback that there is rollover with automatic
                            // (black) color
                            onColorPreviewActivatedListener.invoke(Color.black)
                        }
                        onCommandPreviewCanceled = {
                            // Notify the callback that there is no rollover
                            onColorPreviewCanceledListener.invoke()
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
                        action = DelayedCommandListener {
                            val newColor = JColorChooser.showDialog(it.source as Component,
                                    "Color chooser", defaultColor)
                            if (newColor != null) {
                                onColorActivatedListener.invoke(newColor)
                                JColorSelectorPopupMenu.addColorToRecentlyUsed(newColor)
                            }
                        }
                    }
                }
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
                command(actionKeyTip = "AO") {
                    icon = Format_indent_less.of(16, 16)
                    action = CommandListener { println("Indent less") }
                }

                command(actionKeyTip = "AI") {
                    icon = Format_indent_more.of(16, 16)
                    action = CommandListener { println("Indent more") }
                }
            }

            flowCommandButtonStrip {
                command(actionKeyTip = "1") {
                    icon = Format_text_bold.of(16, 16)
                    isToggleSelected = true
                    action = CommandListener { println("Bold toggled") }
                    actionRichTooltip {
                        title = resourceBundle.getString("FontBold.tooltip.textActionTitle")
                        description {
                            +resourceBundle.getString("FontBold.tooltip.textActionParagraph1")
                        }
                    }
                }

                command(actionKeyTip = "2") {
                    icon = Format_text_italic.of(16, 16)
                    isToggle = true
                    action = CommandListener { println("Italic toggled") }
                    actionRichTooltip {
                        title = resourceBundle.getString("FontItalic.tooltip.textActionTitle")
                        description {
                            +resourceBundle.getString("FontItalic.tooltip.textActionParagraph1")
                        }
                    }
                }

                command(actionKeyTip = "3") {
                    icon = Format_text_underline.of(16, 16)
                    isToggle = true
                    action = CommandListener { println("Underline toggled") }
                    actionRichTooltip {
                        title = resourceBundle.getString("FontUnderline.tooltip.textActionTitle")
                        description {
                            +resourceBundle.getString("FontUnderline.tooltip.textActionParagraph1")
                        }
                    }
                }

                command(actionKeyTip = "4") {
                    icon = Format_text_strikethrough.of(16, 16)
                    isToggle = true
                    action = CommandListener { println("Strikethrough toggled") }
                    actionRichTooltip {
                        title = resourceBundle.getString("FontStrikethrough.tooltip.textActionTitle")
                        description {
                            +resourceBundle.getString("FontStrikethrough.tooltip.textActionParagraph1")
                        }
                    }
                }
            }

            flowCommandToggleButtonStrip {
                command(actionKeyTip = "AL") {
                    icon = Format_justify_left.of(16, 16)
                    action = CommandListener { println("Align left!") }
                }

                command(actionKeyTip = "AC") {
                    icon = Format_justify_center.of(16, 16)
                    isToggleSelected = true
                    action = CommandListener { println("Align center!") }
                }

                command(actionKeyTip = "AR") {
                    icon = Format_justify_right.of(16, 16)
                    action = CommandListener { println("Align right!") }
                }

                command(actionKeyTip = "AF") {
                    icon = Format_justify_fill.of(16, 16)
                    action = CommandListener { println("Align justified!") }
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
                val documentLocationToggleGroup = KCommandToggleGroupModel()

                command(priority = RibbonElementPriority.TOP) {
                    title = resourceBundle.getString("DocumentLocal.text")
                    icon = Folder.of(16, 16)
                    action = CommandListener {
                        println("Document Local activated")
                    }
                    isToggle = true
                    toggleGroup = documentLocationToggleGroup
                }

                command(priority = RibbonElementPriority.TOP) {
                    title = resourceBundle.getString("DocumentRemote.text")
                    icon = Folder_remote.of(16, 16)
                    action = CommandListener {
                        println("Document Remote activated")
                    }
                    isToggle = true
                    toggleGroup = documentLocationToggleGroup
                }

                command(priority = RibbonElementPriority.TOP) {
                    title = resourceBundle.getString("DocumentSaved.text")
                    icon = Folder_saved_search.of(16, 16)
                    action = CommandListener {
                        println("Document Saved activated")
                    }
                    isToggle = true
                    toggleGroup = documentLocationToggleGroup
                }
            }

            group {
                command(priority = RibbonElementPriority.MEDIUM, command = documentNewCommand,
                        actionKeyTip = "DN")

                command(priority = RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentOpen.text")
                    icon = Document_open.of(16, 16)
                    action =
                            CommandListener { println("Document Open activated") }
                }

                command(priority = RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentSave.text")
                    icon = Document_save.of(16, 16)
                    action =
                            CommandListener { println("Document Save activated") }
                }

                command(priority = RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentPrint.text")
                    icon = Document_print.of(16, 16)
                    action = CommandListener {
                        println("Document Print activated")
                    }
                }

                command(priority = RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentPrintPreview.text")
                    icon = Document_print_preview.of(16, 16)
                    action = CommandListener {
                        println("Document Print Preview activated")
                    }
                }

                command(priority = RibbonElementPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentProperties.text")
                    icon = Document_properties.of(16, 16)
                    action = CommandListener {
                        println("Document Properties activated")
                    }
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

            command(priority = RibbonElementPriority.TOP, actionKeyTip = "FD") {
                title = resourceBundle.getString("Search.text")
                icon = System_search.of(16, 16)
                action = CommandListener { println("Search activated") }
            }

            command(priority = RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("Find.text")
                icon = Edit_find.of(16, 16)
                action = CommandListener { println("Find activated") }
            }

            command(priority = RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("FindReplace.text")
                icon = Edit_find_replace.of(16, 16)
                action = CommandListener { println("Find Replace activated") }
                isEnabled = false
            }

            command(priority = RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("SelectAll.text")
                icon = Edit_select_all.of(16, 16)
                action = CommandListener { println("Select All activated") }
            }

            resizePolicies = { ribbonBand ->
                listOf(CoreRibbonResizePolicies.Mirror(ribbonBand),
                        CoreRibbonResizePolicies.IconRibbonBandResizePolicy(ribbonBand))
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
                command(priority = RibbonElementPriority.TOP, actionKeyTip = "NA") {
                    title = resourceBundle.getString("AddressBook.text")
                    icon = Address_book_new.of(16, 16)
                    action = CommandListener { println("Address Book activated") }
                }
            }

            group {
                command(priority = RibbonElementPriority.TOP, actionKeyTip = "ND") {
                    title = resourceBundle.getString("Document.text")
                    icon = Document_new.of(16, 16)
                    action = CommandListener { println("Document activated") }
                }

                command(priority = RibbonElementPriority.MEDIUM, actionKeyTip = "NP") {
                    title = resourceBundle.getString("Appointment.text")
                    icon = Appointment_new.of(16, 16)
                    action = CommandListener { println("Appointment activated") }
                }

                command(priority = RibbonElementPriority.MEDIUM, actionKeyTip = "NB") {
                    title = resourceBundle.getString("Bookmark.text")
                    icon = Bookmark_new.of(16, 16)
                    action = CommandListener { println("Bookmark activated") }
                }

                command(priority = RibbonElementPriority.MEDIUM, actionKeyTip = "NC") {
                    title = resourceBundle.getString("Contact.text")
                    icon = Contact_new.of(16, 16)
                    action = CommandListener { println("Contact activated") }
                }
            }

            resizePolicies = { ribbonBand ->
                listOf(CoreRibbonResizePolicies.Mirror(ribbonBand),
                        CoreRibbonResizePolicies.Mid2Low(ribbonBand),
                        CoreRibbonResizePolicies.IconRibbonBandResizePolicy(ribbonBand))
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
                command(priority = RibbonElementPriority.MEDIUM, actionKeyTip = "Y") {
                    title = resourceBundle.getString("Accessibility.text")
                    icon = Preferences_desktop_accessibility.of(16, 16)
                    action =
                            CommandListener { println("Accessibility activated") }
                }

                command(priority = RibbonElementPriority.MEDIUM, actionKeyTip = "E") {
                    title = resourceBundle.getString("Assistive.text")
                    icon = Preferences_desktop_assistive_technology.of(16, 16)
                    action = CommandListener { println("Assistive activated") }
                }

                command(priority = RibbonElementPriority.MEDIUM, popupKeyTip = "H") {
                    title = resourceBundle.getString("KeyboardShortcuts.text")
                    icon = Preferences_desktop_keyboard_shortcuts.of(16, 16)
                    popupMenu = getSimplePopupMenu()
                }
            }

            group {
                command(priority = RibbonElementPriority.TOP, actionKeyTip = "Z") {
                    title = resourceBundle.getString("Font.text")
                    icon = Preferences_desktop_font.of(16, 16)
                    action = CommandListener { println("Font activated") }
                }

                command(priority = RibbonElementPriority.TOP, actionKeyTip = "L") {
                    title = resourceBundle.getString("Locale.text")
                    icon = Preferences_desktop_locale.of(16, 16)
                    action = CommandListener { println("Locale activated") }
                }
            }

            group {
                command(priority = RibbonElementPriority.MEDIUM, actionKeyTip = "V") {
                    title = resourceBundle.getString("Screensaver.text")
                    icon = Preferences_desktop_screensaver.of(16, 16)
                    action = CommandListener { println("Screensaver activated") }
                }

                command(priority = RibbonElementPriority.MEDIUM, actionKeyTip = "T") {
                    title = resourceBundle.getString("Themes.text")
                    icon = Preferences_desktop_theme.of(16, 16)
                    action = CommandListener { println("Themes activated") }
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
                action = CommandListener { println("Preview activated") }
            }

            command(RibbonElementPriority.TOP) {
                title = resourceBundle.getString("SlideShow.text")
                icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)
                action = CommandListener { println("Slide Show activated") }
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
                action = CommandListener { println("Animation 1 activated") }
            }

            command(RibbonElementPriority.TOP) {
                title = resourceBundle.getString("CustomAnimation.text")
                icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)
                action = CommandListener { println("Animation 2 activated") }
            }

            command(RibbonElementPriority.TOP) {
                title = resourceBundle.getString("CustomAnimation.text")
                icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)
                action = CommandListener { println("Animation 3 activated") }
            }

            resizePolicies = { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesNone(ribbonBand) }
        }
    }

    fun getTransitionBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("TransitionToThis.textBandTitle")
            icon = SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32)

            gallery(RibbonElementPriority.TOP) {
                presentation {
                    state = CommandButtonDisplayState.SMALL
                    preferredPopupMaxCommandColumns = 6
                    preferredPopupMaxVisibleCommandRows = 6
                    commandVisibilities {
                        2 at RibbonElementPriority.LOW
                        4 at RibbonElementPriority.MEDIUM
                        6 at RibbonElementPriority.TOP
                    }
                }

                content {
                    commandGroup {
                        title = resourceBundle.getString("TransitionGallery.textGroupTitle1")
                        for (i in 1..40) {
                            command {
                                icon = DecoratedResizableIcon(Appointment_new.of(16, 16),
                                        DecoratedResizableIcon.IconDecorator { c, g, x, y, _, height ->
                                            g.render {
                                                NeonCortex.installDesktopHints(it, c)
                                                it.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                        .getFontSet(null).controlFont.deriveFont(9.0f)
                                                it.color = Color.black
                                                it.drawString("" + i, x + 1, y + height - 2)
                                                it.drawString("" + i, x + 3, y + height - 2)
                                                it.drawString("" + i, x + 2, y + height - 1)
                                                it.drawString("" + i, x + 2, y + height - 3)
                                                it.color = Color.white
                                                it.drawString("" + i, x + 2, y + height - 2)
                                            }
                                        })
                                action = CommandListener {
                                    println("Activated action $i")
                                }
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
                                            g.render {
                                                NeonCortex.installDesktopHints(it, c)
                                                it.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                        .getFontSet(null).controlFont.deriveFont(9.0f)
                                                it.color = Color.black
                                                it.drawString("" + i, x + 1, y + height - 2)
                                                it.drawString("" + i, x + 3, y + height - 2)
                                                it.drawString("" + i, x + 2, y + height - 1)
                                                it.drawString("" + i, x + 2, y + height - 3)
                                                it.color = Color.white
                                                it.drawString("" + i, x + 2, y + height - 2)
                                            }
                                        })
                                action = CommandListener {
                                    println("Activated action $i")
                                }
                                isToggle = true
                            }
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
                        presentation {
                            commandDisplayState = CommandButtonDisplayState.MEDIUM
                            verticalGapScaleFactor = 0.5
                        }
                        command {
                            title = resourceBundle.getString("ApplyToAll.text")
                            icon = SimpleResizableIcon(RibbonElementPriority.TOP, 16, 16)
                            action = CommandListener {
                                println("Apply To All activated")
                            }
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

fun main(args: Array<String>) {
    SwingUtilities.invokeLater {
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)

        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())

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
                command(actionKeyTip = "GS") {
                    title = builder.resourceBundle.getString("Share.title")
                    icon = Internet_mail.of(16, 16)
                    action = CommandListener {
                        JOptionPane.showMessageDialog(null, "Share button clicked")
                    }
                }

                command(actionKeyTip = "GC") {
                    icon = Internet_group_chat.of(16, 16)
                    action = CommandListener {
                        JOptionPane.showMessageDialog(null, "Chat button clicked")
                    }
                }

                command(actionKeyTip = "GH") {
                    icon = Help_browser.of(16, 16)
                    action = CommandListener {
                        JOptionPane.showMessageDialog(null, "Help button clicked")
                    }
                    actionRichTooltip {
                        title = builder.resourceBundle.getString("Help.tooltip.title")
                        description {
                            +builder.resourceBundle.getString("Help.tooltip.actionParagraph")
                        }
                    }
                }
            }

            taskbar {
                command(actionKeyTip = "1", command = builder.pasteCommand)

                command(actionKeyTip = "2") {
                    icon = Edit_clear.of(16, 16)
                    action =
                            CommandListener { println("Taskbar Clear activated") }
                    isEnabled = false
                }

                command(actionKeyTip = "3") {
                    icon = Edit_copy.of(16, 16)
                    action = CommandListener { println("Taskbar Copy activated") }
                }

                +builder.documentNewCommand

                separator()

                command(actionKeyTip = "4") {
                    icon = Edit_find.of(16, 16)
                    action = CommandListener { println("Taskbar Find activated") }
                }

                ribbonComponent {
                    component = JComboBox(arrayOf("Winter", "Spring", "Summer", "Autumn"))
                    richTooltip {
                        title = builder.resourceBundle.getString("Seasons.tooltip.title")
                    }
                    keyTip = "5"
                }

                // Add the same gallery we have in the first ribbon task to the taskbar, configuring
                // its popup presentation with a 4x2 grid of slightly smaller buttons (instead of a 3x3
                // grid of slightly larger ones in the in-task gallery popup).
                // Content preview and selection is controlled by the same model and is kept in sync
                // along all usages of the gallery content model in our ribbon
                gallery {
                    content = builder.styleGalleryContentModel

                    presentation {
                        preferredPopupMaxCommandColumns = 4
                        preferredPopupMaxVisibleCommandRows = 2
                        state = JRibbonBand.BIG_FIXED
                    }
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
                        presentation {
                            commandDisplayState = CommandButtonDisplayState.MEDIUM
                            maxColumns = 1
                            commandHorizontalAlignment = SwingConstants.LEADING
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
                                    action = CommandListener {
                                        println("Action $i activated")
                                    }
                                }
                            }
                        }
                    }

                    targetPanel.layout = BorderLayout()
                    targetPanel.add(openHistoryPanel.toJavaButtonPanel(), BorderLayout.CENTER)
                }

                // "Create new" primary
                primaryCommand(actionKeyTip = "N") {
                    title = builder.resourceBundle.getString("AppMenuNew.text")
                    icon = Document_new.of(16, 16)
                    action = CommandListener {
                        println("Invoked creating new document")
                    }
                }

                // "Open" primary
                primaryCommand(actionKeyTip = "O") {
                    title = builder.resourceBundle.getString("AppMenuOpen.text")
                    icon = Document_open.of(16, 16)
                    action = CommandListener {
                        println("Invoked opening document")
                    }
                    rolloverCallback = RibbonApplicationMenuPrimaryCommand.PrimaryRolloverCallback { targetPanel ->
                        targetPanel.removeAll()

                        val openHistoryPanel = commandButtonPanel {
                            presentation {
                                commandDisplayState = CommandButtonDisplayState.MEDIUM
                                maxColumns = 1
                                commandHorizontalAlignment = SwingConstants.LEADING
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
                                        action = CommandListener {
                                            println("Action $i activated")
                                        }
                                    }
                                }
                            }
                        }

                        targetPanel.layout = BorderLayout()
                        targetPanel.add(openHistoryPanel.toJavaButtonPanel(), BorderLayout.CENTER)
                    }
                }

                // "Save" primary
                primaryCommand(actionKeyTip = "S") {
                    title = builder.resourceBundle.getString("AppMenuSave.text")
                    icon = Document_save.of(16, 16)
                    action =
                            CommandListener { println("Invoked saving document") }
                    isEnabled = false
                }

                // "Save as" primary + secondaries
                primaryCommand(actionKeyTip = "A", popupKeyTip = "F") {
                    title = builder.resourceBundle.getString("AppMenuSaveAs.text")
                    icon = Document_save_as.of(16, 16)
                    action = CommandListener {
                        println("Invoked saving document as")
                    }
                    isTitleClickAction = true

                    secondaryGroup {
                        title = builder.resourceBundle.getString("AppMenuSaveAs.secondary.textGroupTitle1")

                        command(actionKeyTip = "W") {
                            title = builder.resourceBundle.getString("AppMenuSaveAs.word.text")
                            icon = X_office_document.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSaveAs.word.description")
                            action = CommandListener {
                                println("Invoked saved as Word")
                            }
                        }

                        command(actionKeyTip = "H") {
                            title = builder.resourceBundle.getString("AppMenuSaveAs.html.text")
                            icon = Text_html.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSaveAs.html.description")
                            action = CommandListener {
                                println("Invoked saved as HTML")
                            }
                            isEnabled = false
                        }

                        command(actionKeyTip = "O") {
                            title = builder.resourceBundle.getString("AppMenuSaveAs.other.text")
                            icon = Document_save_as.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSaveAs.other.description")
                            action = CommandListener {
                                println("Invoked saved as other")
                            }
                        }
                    }
                }

                primarySeparator()

                // "Print" primary + secondaries
                primaryCommand(actionKeyTip = "P", popupKeyTip = "W") {
                    title = builder.resourceBundle.getString("AppMenuPrint.text")
                    icon = Document_print.of(16, 16)
                    action = CommandListener { println("Invoked printing as") }
                    isTitleClickAction = true

                    secondaryGroup {
                        title = builder.resourceBundle.getString("AppMenuPrint.secondary.textGroupTitle1")

                        command(actionKeyTip = "P") {
                            title = builder.resourceBundle.getString("AppMenuPrint.print.text")
                            icon = Printer.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuPrint.print.description")
                            action = CommandListener { println("Invoked print") }
                        }

                        command(actionKeyTip = "Q") {
                            title = builder.resourceBundle.getString("AppMenuPrint.quick.text")
                            icon = Printer.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuPrint.quick.description")
                            action = CommandListener { println("Invoked quick") }
                        }

                        command(actionKeyTip = "V") {
                            title = builder.resourceBundle.getString("AppMenuPrint.preview.text")
                            icon = Document_print_preview.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuPrint.preview.description")
                            action =
                                    CommandListener { println("Invoked preview") }
                        }
                    }

                    secondaryGroup {
                        title = builder.resourceBundle.getString("AppMenuPrint.secondary.textGroupTitle2")

                        command(actionKeyTip = "M") {
                            title = builder.resourceBundle.getString("AppMenuPrint.memo.text")
                            icon = Text_x_generic.of(16, 16)
                            action = CommandListener { println("Invoked memo") }
                        }

                        command(actionKeyTip = "C") {
                            title = builder.resourceBundle.getString("AppMenuPrint.custom.text")
                            icon = Text_x_generic.of(16, 16)
                            action = CommandListener { println("Invoked custom") }
                        }
                    }
                }

                // "Send" primary + secondaries
                primaryCommand(popupKeyTip = "D") {
                    title = builder.resourceBundle.getString("AppMenuSend.text")
                    icon = Mail_forward.of(16, 16)

                    secondaryGroup {
                        title = builder.resourceBundle.getString("AppMenuSend.secondary.textGroupTitle1")

                        command(actionKeyTip = "E") {
                            title = builder.resourceBundle.getString("AppMenuSend.email.text")
                            icon = Mail_message_new.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSend.email.description")
                            action = CommandListener { println("Invoked email") }
                        }

                        command(actionKeyTip = "H") {
                            title = builder.resourceBundle.getString("AppMenuSend.html.text")
                            icon = Text_html.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSend.html.description")
                            action = CommandListener { println("Invoked HTML") }
                        }

                        command(actionKeyTip = "W") {
                            title = builder.resourceBundle.getString("AppMenuSend.word.text")
                            icon = X_office_document.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSend.word.description")
                            action = CommandListener { println("Invoked Word") }
                        }

                        command(popupKeyTip = "X") {
                            title = builder.resourceBundle.getString("AppMenuSend.wireless.text")
                            icon = Mail_message_new.of(16, 16)
                            extraText = builder.resourceBundle.getString("AppMenuSend.wireless.description")
                            popupMenu = commandPopupMenu {
                                command(actionKeyTip = "W") {
                                    title = builder.resourceBundle.getString("AppMenuSend.wireless.wifi.text")
                                    icon = EmptyResizableIcon(16)
                                    action = CommandListener {
                                        println("WiFi activated")
                                    }
                                }

                                command(actionKeyTip = "B") {
                                    title = builder.resourceBundle.getString("AppMenuSend.wireless.bluetooth.text")
                                    icon = EmptyResizableIcon(16)
                                    action = CommandListener {
                                        println("Bluetooth activated")
                                    }
                                }
                            }
                        }
                    }
                }

                // "Exit" primary
                primaryCommand(actionKeyTip = "X") {
                    title = builder.resourceBundle.getString("AppMenuExit.text")
                    icon = System_log_out.of(16, 16)
                    action = CommandListener { System.exit(0) }
                    rolloverCallback = RibbonApplicationMenuPrimaryCommand.PrimaryClearRolloverCallback()
                }

                footer {
                    command {
                        title = builder.resourceBundle.getString("AppMenuOptions.text")
                        icon = Document_properties.of(16, 16)
                        action = CommandListener { println("Invoked Options") }
                    }

                    command {
                        title = builder.resourceBundle.getString("AppMenuExit.text")
                        icon = System_log_out.of(16, 16)
                        action = CommandListener { System.exit(0) }
                    }
                }
            }
        }

        val javaRibbonFrame = ribbonFrame.asJavaRibbonFrame()

        javaRibbonFrame.add(builder.getControlPanel(javaRibbonFrame), BorderLayout.EAST)
        builder.rulerPanel = RulerPanel()
        javaRibbonFrame.add(builder.rulerPanel, BorderLayout.CENTER)

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
