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
package org.pushingpixels.demo.plasma.ribbon

import com.jgoodies.forms.builder.FormBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.demo.plasma.LocaleSwitcher
import org.pushingpixels.demo.plasma.popup.ColorIcon
import org.pushingpixels.demo.plasma.svg.*
import org.pushingpixels.flamingo.api.common.CommandActionEvent
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState
import org.pushingpixels.flamingo.api.common.HorizontalAlignment
import org.pushingpixels.flamingo.api.common.icon.ColorResizableIcon
import org.pushingpixels.flamingo.api.common.icon.DecoratedResizableIcon
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand.PresentationPriority
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizeSequencingPolicies
import org.pushingpixels.meteor.addDelayedActionListener
import org.pushingpixels.meteor.addDelayedItemListener
import org.pushingpixels.meteor.awt.brightness
import org.pushingpixels.meteor.awt.deriveByBrightness
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.neon.api.NeonCortex
import org.pushingpixels.neon.api.icon.ResizableIcon
import org.pushingpixels.neon.api.icon.ResizableIcon.Factory
import org.pushingpixels.plasma.*
import org.pushingpixels.plasma.ribbon.*
import org.pushingpixels.plasma.synapse.*
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.skin.BusinessSkin
import java.awt.*
import java.text.MessageFormat
import java.util.*
import javax.imageio.ImageIO
import javax.swing.*
import javax.swing.border.EmptyBorder
import kotlin.system.exitProcess

object SkinSwitcher {
    fun getSkinSwitcher(): JComboBox<String> {
        val skinInfoMap = SubstanceCortex.GlobalScope.getAllSkins()
        val skinNames = skinInfoMap.keys.toTypedArray()
        val result = JComboBox<String>(skinNames)
        result.selectedIndex = skinNames.indexOfFirst {
            it == SubstanceCortex.GlobalScope.getCurrentSkin()!!.displayName
        }

        result.addDelayedItemListener {
            val selected = result.selectedItem as String
            SubstanceCortex.GlobalScope.setSkin(
                SubstanceCortex.GlobalScope.getAllSkins()[selected]!!.className
            )
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
            NeonCortex.installDesktopHints(it, font)
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

private class ExpandCommandListener : (CommandActionEvent?) -> Unit {
    override fun invoke(event: CommandActionEvent?) {
        JOptionPane.showMessageDialog(null, "Expand button clicked")
    }
}

private class SimpleResizableIcon(
    private val priority: PresentationPriority,
    private var currWidth: Int, private var currHeight: Int
) : ResizableIcon {

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
        graphics.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        )

        val rx = this.currWidth / 3
        val ry = this.currHeight / 3
        val cx = x + this.currWidth / 2 - 1
        val cy = y + this.currHeight / 2 - 1

        val color: Color = when (this.priority) {
            PresentationPriority.TOP -> Color(0, 0, 128)
            PresentationPriority.MEDIUM -> Color.blue
            PresentationPriority.LOW -> Color(128, 128, 255)
        }

        graphics.color = color
        graphics.fillOval(cx - rx, cy - ry, 2 * rx, 2 * ry)
        graphics.color = color.deriveByBrightness(-0.4)
        graphics.drawOval(cx - rx, cy - ry, 2 * rx, 2 * ry)
        graphics.drawRect(x, y, this.currWidth - 2, this.currHeight - 2)

        graphics.dispose()
    }

    class FactoryTop : Factory {
        override fun createNewIcon(): ResizableIcon {
            return SimpleResizableIcon(PresentationPriority.TOP, 16, 16)
        }
    }
}

private class RibbonDemoBuilder {
    var currLocale = Locale.getDefault()
    var resourceBundle = ResourceBundle.getBundle(
        "org.pushingpixels.demo.plasma.resources.Resources", currLocale
    )
    lateinit var rulerPanel: RulerPanel
    val documentNewCommand: KCommand

    val copyCommand: KCommand
    val pasteCommand: KCommand
    val cutCommand: KCommand

    val menuSaveSelection: KCommand
    val menuClearSelection: KCommand
    val applyStyles: KCommand

    val fontComboBoxModel: KRibbonComboBoxContentModel<String>
    val rulerCheckBoxModel: KRibbonCheckBoxContentModel
    val indentLeftSpinnerModel: KRibbonSpinnerNumberContentModel

    val styleGalleryContentModel: KRibbonGalleryContent

    init {
        documentNewCommand = command {
            title = resourceBundle.getString("DocumentNew.text")
            iconFactory = Document_new.factory()
            action = { println("Document New activated") }
        }

        cutCommand = command {
            title = resourceBundle.getString("Cut.text")
            iconFactory = Edit_cut.factory()
            action = { println("Cut!") }
            actionRichTooltip {
                title = resourceBundle.getString("Cut.text")
                description = resourceBundle.getString("Cut.tooltip.actionParagraph1")
            }
            menu = getSimplePopupMenu()
        }

        copyCommand = command {
            title = resourceBundle.getString("Copy.text")
            iconFactory = Edit_copy.factory()
            action = { println("Copy!") }
            menu = getSimplePopupMenu()
        }

        pasteCommand = command {
            title = resourceBundle.getString("Paste.text")
            iconFactory = Edit_paste.factory()
            action = { println("Pasted!") }
            actionRichTooltip {
                title = resourceBundle.getString("Paste.text")
                description = resourceBundle.getString("Paste.tooltip.actionParagraph1")
            }
            menu = getSimplePopupMenu()
            secondaryRichTooltip {
                title = resourceBundle.getString("Paste.text")
                description = resourceBundle.getString("Paste.tooltip.popupParagraph1")
            }
        }

        menuSaveSelection = command {
            title = resourceBundle.getString("Format.menuSaveSelection.text")
            iconFactory = ColorResizableIcon.factory(Color(0xFB, 0xC0, 0x2D))
            action = { println("Save Selection activated") }
        }

        menuClearSelection = command {
            title = resourceBundle.getString("Format.menuClearSelection.text")
            iconFactory = ColorResizableIcon.factory(Color(0xFF, 0xA0, 0x00))
            action = { println("Clear Selection activated") }
        }

        applyStyles = command {
            title = resourceBundle.getString("Format.applyStyles.text")
            iconFactory = ColorResizableIcon.factory(Color(0xF5, 0x7C, 0x00))
            action = { println("Apply Styles activated") }
        }


        val mfButtonText = MessageFormat(
            resourceBundle.getString("StylesGallery.textButton")
        )
        mfButtonText.locale = currLocale

        styleGalleryContentModel = galleryContent {
            iconFactory = Font_x_generic.factory()
            commandGroup {
                title = resourceBundle.getString("StylesGallery.textGroupTitle1")
                for (i in 0 until 10) {
                    command {
                        title = mfButtonText.format(arrayOf<Any>(i))
                        iconFactory = DecoratedResizableIcon.factory(
                            Font_x_generic.factory(),
                            DecoratedResizableIcon.IconDecorator { _, graphics, x, y, _, height ->
                                graphics.render {
                                    it.color = Color.black
                                    it.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                        .getFontSet().controlFont
                                    NeonCortex.installDesktopHints(it, it.font)
                                    it.drawString("$i", x + 2, y + height - 2)
                                }
                            })
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
                        iconFactory = DecoratedResizableIcon.factory(
                            Font_x_generic.factory(),
                            DecoratedResizableIcon.IconDecorator { _, graphics, x, y, _, height ->
                                graphics.render {
                                    it.color = Color.black
                                    it.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                        .fontSet.controlFont
                                    NeonCortex.installDesktopHints(it, it.font)
                                    it.drawString("$i", x + 2, y + height - 2)
                                }
                            })
                        isToggle = true
                    }
                }
            }

            onCommandActivated =
                { command -> println("*** Command '" + command.text + "' activated! ***") }
            onCommandPreviewActivated =
                { command -> println("Preview activated for '" + command.text + "'") }
            onCommandPreviewCanceled =
                { command -> println("Preview canceled for '" + command.text + "'") }

            extraPopupGroup {
                command(command = menuSaveSelection, actionKeyTip = "SS")
                command(command = menuClearSelection, actionKeyTip = "SC")
            }

            extraPopupGroup {
                command(command = applyStyles, actionKeyTip = "SA")
            }
        }

        fontComboBoxModel = comboBoxContentModel {
            items(
                "+ Minor (Calibri)   ", "+ Minor (Columbus)   ",
                "+ Minor (Consolas)   ", "+ Minor (Cornelius)   ",
                "+ Minor (Cleopatra)   ", "+ Minor (Cornucopia)   ",
                "+ Minor (California)   ", "+ Minor (Calendula)   ",
                "+ Minor (Coriander)   ", "+ Minor (Callisto)   ",
                "+ Minor (Cajun)   ", "+ Minor (Congola)   ",
                "+ Minor (Candella)   ", "+ Minor (Cambria)   "
            )
            richTooltip {
                title = resourceBundle.getString("Seasons.tooltip.title")
            }
            selectionChangeListener = { _, newSelection ->
                println("New font selection -> $newSelection")
            }
        }

        rulerCheckBoxModel = checkBoxContentModel {
            text = resourceBundle.getString("Ruler.text")
            isSelected = true
        }

        indentLeftSpinnerModel = spinnerNumberContentModel {
            value = 0
            minimum = 0
            maximum = 100
            stepSize = 5
            iconFactory = Format_justify_left.factory()
            caption = resourceBundle.getString("IndentLeft.text")
            selectionChangeListener =
                { _, newSelection -> println("New selection -> $newSelection") }
            richTooltip {
                title = resourceBundle.getString("IndentLeft.tooltip.title")
                description {
                    +resourceBundle.getString("IndentLeft.tooltip.actionParagraph1")
                    +resourceBundle.getString("IndentLeft.tooltip.actionParagraph2")
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

        val toggleMinimize = JCheckBox("minimized")
        toggleMinimize.isSelected = false
        toggleMinimize.addDelayedActionListener {
            ribbon.isMinimized = !ribbon.isMinimized
        }
        formBuilder.add("Minimize").xy(1, 9).add(toggleMinimize).xy(3, 9)

        val localeSwitcher = LocaleSwitcher.getLocaleSwitcher { selected ->
            currLocale = selected
            resourceBundle = ResourceBundle.getBundle(
                "org.pushingpixels.demo.plasma.resources.Resources", currLocale
            )
            Window.getWindows().forEach {
                it.applyComponentOrientation(ComponentOrientation.getOrientation(currLocale))
                SwingUtilities.updateComponentTreeUI(it)
            }
        }
        formBuilder.add("Locale").xy(1, 13).add(localeSwitcher).xy(3, 13)

        return formBuilder.build()
    }

    fun getSimplePopupMenu(): KCommandMenu {
        return commandPopupMenu {
            val mf = MessageFormat(resourceBundle.getString("TestMenuItem.text"))
            group {
                command(actionKeyTip = "1") {
                    title = mf.format(arrayOf("1"))
                    iconFactory = ColorResizableIcon.factory(Color(0x80, 0xDE, 0xEA))
                    action = { println("Test menu item 1 activated") }
                }
                command(actionKeyTip = "2") {
                    title = mf.format(arrayOf("2"))
                    iconFactory = ColorResizableIcon.factory(Color(0x80, 0xCB, 0xC4))
                    action = { println("Test menu item 2 activated") }
                }
                command(actionKeyTip = "3") {
                    title = mf.format(arrayOf("3"))
                    iconFactory = ColorResizableIcon.factory(Color(0xA5, 0xD6, 0xA7))
                    action = { println("Test menu item 3 activated") }
                }
            }

            group {
                command(actionKeyTip = "4") {
                    title = mf.format(arrayOf("4"))
                    iconFactory = ColorResizableIcon.factory(Color(0xC5, 0xE1, 0xA5))
                    action = { println("Test menu item 4 activated") }
                }
                command(actionKeyTip = "5") {
                    title = mf.format(arrayOf("5"))
                    iconFactory = ColorResizableIcon.factory(Color(0xE6, 0xEE, 0x9C))
                    action = { println("Test menu item 5 activated") }
                }
            }
        }
    }

    fun getClipboardBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Clipboard.textBandTitle")
            iconFactory = Edit_paste.factory()
            expandCommand {
                keyTip = "Q"
                richTooltip {
                    title = resourceBundle.getString("Clipboard.textBandTitle")
                    description = resourceBundle.getString("Clipboard.textBandTooltipParagraph1")
                }
                action = ExpandCommandListener()
            }
            collapsedStateKeyTip = "ZC"

            command(
                priority = PresentationPriority.TOP,
                popupKeyTip = "V",
                isTextClickAction = true,
                command = pasteCommand
            )

            command(
                priority = PresentationPriority.MEDIUM,
                popupKeyTip = "X",
                isTextClickAction = true,
                command = cutCommand
            )

            command(
                priority = PresentationPriority.MEDIUM,
                popupKeyTip = "C",
                isTextClickSecondary = true,
                command = copyCommand
            )

            command(PresentationPriority.MEDIUM, popupKeyTip = "FP") {
                title = resourceBundle.getString("Format.text")
                iconFactory = Edit_paste.factory()
                menu = commandPopupMenu {
                    val mfGroupTitle = MessageFormat(resourceBundle.getString("PanelStyles.text"))
                    mfGroupTitle.locale = currLocale
                    val mfTooltipTitle = MessageFormat(
                        resourceBundle.getString("PanelStyles.tooltip.textActionTitle")
                    )
                    mfTooltipTitle.locale = currLocale
                    val mfTooltipParagraph = MessageFormat(
                        resourceBundle.getString("PanelStyles.tooltip.textActionParagraph1")
                    )
                    mfTooltipParagraph.locale = currLocale

                    commandPanel {
                        presentation {
                            commandIconDimension = 48
                            maxColumns = 5
                            maxRows = 3
                            toShowGroupLabels = false
                        }

                        for (groupIndex in 0 until 4) {
                            commandGroup {
                                title = mfGroupTitle.format(arrayOf<Any>(groupIndex))

                                for (i in 0 until 15) {
                                    command {
                                        iconFactory = DecoratedResizableIcon.factory(
                                            Font_x_generic.factory(),
                                            DecoratedResizableIcon.IconDecorator { _, graphics, x, y, _, height ->
                                                graphics.render {
                                                    it.color = Color.black
                                                    it.font =
                                                        SubstanceCortex.GlobalScope.getFontPolicy()
                                                            .fontSet.controlFont
                                                    NeonCortex.installDesktopHints(it, it.font)
                                                    it.drawString("" + i, x + 2, y + height - 2)
                                                }
                                            })

                                        isToggle = true
                                        action = { println("Invoked action on $i") }
                                        actionRichTooltip {
                                            title = mfTooltipTitle.format(arrayOf<Any>(i))
                                            description = mfTooltipParagraph.format(arrayOf<Any>(i))
                                        }
                                    }
                                }
                            }
                        }

                        isSingleSelectionMode = true
                    }

                    group {
                        command(command = menuSaveSelection, actionKeyTip = "SS")
                        command(command = menuClearSelection, actionKeyTip = "SC")
                    }

                    group {
                        command(command = applyStyles, actionKeyTip = "SA")
                    }
                }
                secondaryRichTooltip {
                    title =
                        "Main title that can go over multiple lines of text even exceeding the bigger"
                    description {
                        +"Simple description that can go over multiple lines of text even exceeding the bigger"
                        +"Second paragraph that can be multiline as well to test this feature"
                    }
                    mainIconFactory = Address_book_new.factory()
                    footer =
                        "Multiline footer description to provide a little bit more information on this subject"
                    footerIconFactory = Help_browser.factory()
                }
            }

            resizePolicies = { ribbonBand ->
                listOf(
                    CoreRibbonResizePolicies.Mirror(ribbonBand),
                    CoreRibbonResizePolicies.Mid2Low(ribbonBand)
                )
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
            iconFactory = Preferences_desktop_theme.factory()
            collapsedStateKeyTip = "ZS"

            gallery(priority = PresentationPriority.TOP) {
                content = styleGalleryContentModel

                presentation {
                    state = JRibbonBand.BIG_FIXED_LANDSCAPE
                    preferredPopupMaxCommandColumns = 3
                    preferredPopupMaxVisibleCommandRows = 3
                    commandVisibilities {
                        1 at PresentationPriority.LOW
                        2 at PresentationPriority.MEDIUM
                        2 at PresentationPriority.TOP
                    }
                    expandKeyTip = "L"
                }
            }

            command(priority = PresentationPriority.MEDIUM, actionKeyTip = "SA") {
                title = resourceBundle.getString("Styles1.text")
                iconFactory = Font_x_generic.factory()
                action = { println("Generic activated") }
            }

            command(priority = PresentationPriority.MEDIUM, actionKeyTip = "SB") {
                title = resourceBundle.getString("Styles2.text")
                iconFactory = Image_x_generic.factory()
                action = { println("Image activated") }
            }

            colorSelectorCommand(priority = PresentationPriority.MEDIUM, popupKeyTip = "SC") {
                title = resourceBundle.getString("Styles3.text")
                iconFactory = Text_html.factory()
                colorSelectorPopupMenu = colorSelectorPopupMenu {
                    onColorActivated = onColorActivatedListener
                    onColorPreviewActivated = onColorPreviewActivatedListener
                    onColorPreviewCanceled = onColorPreviewCanceledListener

                    command {
                        title = resourceBundle.getString("ColorSelector.textAutomatic")
                        iconFactory = ColorIcon.factory(defaultColor)
                        action = {
                            onColorActivatedListener.invoke(defaultColor)
                            JColorSelectorPopupMenu.addColorToRecentlyUsed(defaultColor)
                        }

                        onActionPreviewActivated = {
                            // Notify the callback that there is rollover with the default color
                            onColorPreviewActivatedListener.invoke(defaultColor)
                        }

                        onActionPreviewCanceled = {
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
                            val newColor = JColorChooser.showDialog(
                                it.buttonSource,
                                "Color chooser", defaultColor
                            )
                            if (newColor != null) {
                                onColorActivatedListener.invoke(newColor)
                                JColorSelectorPopupMenu.addColorToRecentlyUsed(newColor)
                            }
                        }
                    }
                }
            }

            resizePolicies =
                { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesRestrictive(ribbonBand) }
        }
    }

    fun getFontBand(): KFlowRibbonBand {
        return flowRibbonBand {
            title = resourceBundle.getString("Font.textBandTitle")
            iconFactory = Preferences_desktop_font.factory()
            collapsedStateKeyTip = "ZF"
            expandCommand {
                keyTip = "FN"
                action = ExpandCommandListener()
            }

            flowComboBox<String> {
                +fontComboBoxModel
                presentation {
                    keyTip = "SF"
                }
            }

            flowComboBox<String> {
                content {
                    items("11  ")
                }
                presentation {
                    keyTip = "SS"
                }
            }

            flowCommandButtonStrip {
                command(actionKeyTip = "AO") {
                    iconFactory = Format_indent_less.factory()
                    action = { println("Indent less") }
                }

                command(actionKeyTip = "AI") {
                    iconFactory = Format_indent_more.factory()
                    action = { println("Indent more") }
                }
            }

            flowCommandButtonStrip {
                command(actionKeyTip = "1") {
                    iconFactory = Format_text_bold.factory()
                    isToggleSelected = true
                    action = { println("Bold toggled") }
                    actionRichTooltip {
                        title = resourceBundle.getString("FontBold.tooltip.textActionTitle")
                        description =
                            resourceBundle.getString("FontBold.tooltip.textActionParagraph1")
                    }
                }

                command(actionKeyTip = "2") {
                    iconFactory = Format_text_italic.factory()
                    isToggle = true
                    action = { println("Italic toggled") }
                    actionRichTooltip {
                        title = resourceBundle.getString("FontItalic.tooltip.textActionTitle")
                        description =
                            resourceBundle.getString("FontItalic.tooltip.textActionParagraph1")
                    }
                }

                command(actionKeyTip = "3") {
                    iconFactory = Format_text_underline.factory()
                    isToggle = true
                    action = { println("Underline toggled") }
                    actionRichTooltip {
                        title = resourceBundle.getString("FontUnderline.tooltip.textActionTitle")
                        description =
                            resourceBundle.getString("FontUnderline.tooltip.textActionParagraph1")
                    }
                }

                command(actionKeyTip = "4") {
                    iconFactory = Format_text_strikethrough.factory()
                    isToggle = true
                    action = { println("Strikethrough toggled") }
                    actionRichTooltip {
                        title =
                            resourceBundle.getString("FontStrikethrough.tooltip.textActionTitle")
                        description =
                            resourceBundle.getString("FontStrikethrough.tooltip.textActionParagraph1")
                    }
                }
            }

            flowCommandToggleButtonStrip {
                command(actionKeyTip = "AL") {
                    iconFactory = Format_justify_left.factory()
                    action = { println("Align left!") }
                }

                command(actionKeyTip = "AC") {
                    iconFactory = Format_justify_center.factory()
                    isToggleSelected = true
                    action = { println("Align center!") }
                }

                command(actionKeyTip = "AR") {
                    iconFactory = Format_justify_right.factory()
                    action = { println("Align right!") }
                }

                command(actionKeyTip = "AF") {
                    iconFactory = Format_justify_fill.factory()
                    action = { println("Align justified!") }
                }
            }
        }
    }

    fun getDocumentBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Document.textBandTitle")
            iconFactory = Applications_office.factory()
            expandCommand {
                action = ExpandCommandListener()
                keyTip = "FY"
            }
            collapsedStateKeyTip = "ZD"

            group {
                val documentLocationToggleGroup = KCommandToggleGroupModel()

                command(priority = PresentationPriority.TOP) {
                    title = resourceBundle.getString("DocumentLocal.text")
                    iconFactory = Folder.factory()
                    action = { println("Document Local activated") }
                    isToggle = true
                    toggleGroup = documentLocationToggleGroup
                }

                command(priority = PresentationPriority.TOP) {
                    title = resourceBundle.getString("DocumentRemote.text")
                    iconFactory = Folder_remote.factory()
                    action = { println("Document Remote activated") }
                    isToggle = true
                    toggleGroup = documentLocationToggleGroup
                }

                command(priority = PresentationPriority.TOP) {
                    title = resourceBundle.getString("DocumentSaved.text")
                    iconFactory = Folder_saved_search.factory()
                    action = { println("Document Saved activated") }
                    isToggle = true
                    toggleGroup = documentLocationToggleGroup
                }
            }

            group {
                command(
                    priority = PresentationPriority.MEDIUM, command = documentNewCommand,
                    actionKeyTip = "DN"
                )

                command(priority = PresentationPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentOpen.text")
                    iconFactory = Document_open.factory()
                    action = { println("Document Open activated") }
                }

                command(priority = PresentationPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentSave.text")
                    iconFactory = Document_save.factory()
                    action = { println("Document Save activated") }
                }

                command(priority = PresentationPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentPrint.text")
                    iconFactory = Document_print.factory()
                    action = { println("Document Print activated") }
                }

                command(priority = PresentationPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentPrintPreview.text")
                    iconFactory = Document_print_preview.factory()
                    action = { println("Document Print Preview activated") }
                }

                command(priority = PresentationPriority.MEDIUM) {
                    title = resourceBundle.getString("DocumentProperties.text")
                    iconFactory = Document_properties.factory()
                    action = { println("Document Properties activated") }
                }
            }

            resizePolicies =
                { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesRestrictive(ribbonBand) }
        }
    }

    fun getFindBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Find.textBandTitle")
            iconFactory = Edit_find.factory()
            collapsedStateKeyTip = "ZY"

            command(priority = PresentationPriority.TOP, actionKeyTip = "FD") {
                title = resourceBundle.getString("Search.text")
                iconFactory = System_search.factory()
                action = { println("Search activated") }
            }

            command(priority = PresentationPriority.MEDIUM) {
                title = resourceBundle.getString("Find.text")
                iconFactory = Edit_find.factory()
                action = { println("Find activated") }
            }

            command(priority = PresentationPriority.MEDIUM) {
                title = resourceBundle.getString("FindReplace.text")
                iconFactory = Edit_find_replace.factory()
                action = { println("Find Replace activated") }
                isActionEnabled = false
            }

            command(priority = PresentationPriority.MEDIUM) {
                title = resourceBundle.getString("SelectAll.text")
                iconFactory = Edit_select_all.factory()
                action = { println("Select All activated") }
            }

            resizePolicies = { ribbonBand ->
                listOf(
                    CoreRibbonResizePolicies.Mirror(ribbonBand),
                    CoreRibbonResizePolicies.IconRibbonBandResizePolicy(ribbonBand)
                )
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
            iconFactory = Document_new.factory()
            expandCommand {
                action = ExpandCommandListener()
            }

            group {
                command(priority = PresentationPriority.TOP, actionKeyTip = "NA") {
                    title = resourceBundle.getString("AddressBook.text")
                    iconFactory = Address_book_new.factory()
                    action = { println("Address Book activated") }
                }
            }

            group {
                command(priority = PresentationPriority.TOP, actionKeyTip = "ND") {
                    title = resourceBundle.getString("Document.text")
                    iconFactory = Document_new.factory()
                    action = { println("Document activated") }
                }

                command(priority = PresentationPriority.MEDIUM, actionKeyTip = "NP") {
                    title = resourceBundle.getString("Appointment.text")
                    iconFactory = Appointment_new.factory()
                    action = { println("Appointment activated") }
                }

                command(priority = PresentationPriority.MEDIUM, actionKeyTip = "NB") {
                    title = resourceBundle.getString("Bookmark.text")
                    iconFactory = Bookmark_new.factory()
                    action = { println("Bookmark activated") }
                }

                command(priority = PresentationPriority.MEDIUM, actionKeyTip = "NC") {
                    title = resourceBundle.getString("Contact.text")
                    iconFactory = Contact_new.factory()
                    action = { println("Contact activated") }
                }
            }

            resizePolicies = { ribbonBand ->
                listOf(
                    CoreRibbonResizePolicies.Mirror(ribbonBand),
                    CoreRibbonResizePolicies.Mid2Low(ribbonBand),
                    CoreRibbonResizePolicies.IconRibbonBandResizePolicy(ribbonBand)
                )
            }
        }
    }

    fun getPreferencesBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Preferences.textBandTitle")
            iconFactory = Preferences_desktop_font.factory()
            expandCommand {
                action = ExpandCommandListener()
            }

            group {
                command(priority = PresentationPriority.MEDIUM, actionKeyTip = "Y") {
                    title = resourceBundle.getString("Accessibility.text")
                    iconFactory = Preferences_desktop_accessibility.factory()
                    action = { println("Accessibility activated") }
                }

                command(priority = PresentationPriority.MEDIUM, actionKeyTip = "E") {
                    title = resourceBundle.getString("Assistive.text")
                    iconFactory = Preferences_desktop_assistive_technology.factory()
                    action = { println("Assistive activated") }
                }

                command(priority = PresentationPriority.MEDIUM, popupKeyTip = "H") {
                    title = resourceBundle.getString("KeyboardShortcuts.text")
                    iconFactory = Preferences_desktop_keyboard_shortcuts.factory()
                    menu = getSimplePopupMenu()
                }
            }

            group {
                command(priority = PresentationPriority.TOP, actionKeyTip = "Z") {
                    title = resourceBundle.getString("Font.text")
                    iconFactory = Preferences_desktop_font.factory()
                    action = { println("Font activated") }
                }

                command(priority = PresentationPriority.TOP, actionKeyTip = "L") {
                    title = resourceBundle.getString("Locale.text")
                    iconFactory = Preferences_desktop_locale.factory()
                    action = { println("Locale activated") }
                }
            }

            group {
                command(priority = PresentationPriority.MEDIUM, actionKeyTip = "V") {
                    title = resourceBundle.getString("Screensaver.text")
                    iconFactory = Preferences_desktop_screensaver.factory()
                    action = { println("Screensaver activated") }
                }

                command(priority = PresentationPriority.MEDIUM, actionKeyTip = "T") {
                    title = resourceBundle.getString("Themes.text")
                    iconFactory = Preferences_desktop_theme.factory()
                    action = { println("Themes activated") }
                }
            }

            resizePolicies =
                { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesRestrictive(ribbonBand) }
        }
    }

    fun getApplicationsBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Applications.textBandTitle")
            iconFactory = Applications_other.factory()
            expandCommand {
                action = ExpandCommandListener()
            }

            comboBox<String> {
                content {
                    items("Tetris", "Minesweeper", "Doom")
                    iconFactory = Applications_games.factory()
                    caption = resourceBundle.getString("Games.text")
                }
                presentation {
                    keyTip = "AG"
                    isResizingAware = true
                    horizontalAlignment = HorizontalAlignment.FILL
                }
            }

            comboBox<String> {
                content {
                    items("Firefox", "Opera", "Konqueror")
                    isEnabled = false
                    iconFactory = Applications_internet.factory()
                    caption = resourceBundle.getString("Internet.text")
                }
                presentation {
                    keyTip = "AI"
                    isResizingAware = true
                    horizontalAlignment = HorizontalAlignment.FILL
                }
            }

            comboBox<String> {
                content {
                    items(
                        resourceBundle.getString("Pictures.text"),
                        resourceBundle.getString("Video.text"),
                        resourceBundle.getString("Audio.text")
                    )
                    caption = resourceBundle.getString("Multimedia.text")
                }
                presentation {
                    keyTip = "AM"
                    isResizingAware = true
                    horizontalAlignment = HorizontalAlignment.FILL
                }
            }
        }
    }

    fun getParagraphBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Paragraph.textBandTitle")
            iconFactory = Format_justify_left.factory()

            group {
                title = resourceBundle.getString("Indent.text")

                spinnerNumber {
                    +indentLeftSpinnerModel
                    presentation {
                        keyTip = "PL"
                    }
                }

                spinnerNumber {
                    content {
                        value = 0
                        minimum = 0
                        maximum = 100
                        stepSize = 5
                        iconFactory = Format_justify_right.factory()
                        caption = resourceBundle.getString("IndentRight.text")
                        richTooltip {
                            title = resourceBundle.getString("IndentRight.tooltip.title")
                            description {
                                +resourceBundle.getString("IndentRight.tooltip.actionParagraph1")
                                +resourceBundle.getString("IndentRight.tooltip.actionParagraph2")
                            }
                        }
                    }
                    presentation {
                        keyTip = "PR"
                    }
                }
            }

            group {
                title = resourceBundle.getString("Spacing.text")

                spinnerNumber {
                    content {
                        value = 0
                        minimum = 0
                        maximum = 100
                        stepSize = 5
                    }
                    presentation {
                        keyTip = "PB"
                    }
                }

                spinnerNumber {
                    content {
                        value = 0
                        minimum = 0
                        maximum = 100
                        stepSize = 5
                    }
                    presentation {
                        keyTip = "PA"
                    }
                }
            }
        }
    }

    fun getShowHideBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("ShowHide.textBandTitle")
            iconFactory = Format_justify_left.factory()

            checkBox {
                +rulerCheckBoxModel
                presentation {
                    keyTip = "SR"
                }
            }

            checkBox {
                content {
                    text = resourceBundle.getString("Gridlines.text")
                }
                presentation {
                    keyTip = "SG"
                }
            }

            checkBox {
                content {
                    text = resourceBundle.getString("MessageBar.text")
                }
                presentation {
                    keyTip = "SM"
                }
            }

            checkBox {
                content {
                    text = resourceBundle.getString("DocumentMap.text")
                }
                presentation {
                    keyTip = "SD"
                }
            }

            checkBox {
                content {
                    text = resourceBundle.getString("Thumbnails.text")
                }
                presentation {
                    keyTip = "ST"
                }
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

            bandResizeSequencingPolicySource =
                { task -> CoreRibbonResizeSequencingPolicies.CollapseFromLast(task) }
        }
    }

    fun getPreviewBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Preview.textBandTitle")
            iconFactory = SimpleResizableIcon.FactoryTop()

            command(PresentationPriority.TOP) {
                title = resourceBundle.getString("Preview.text")
                iconFactory = SimpleResizableIcon.FactoryTop()
                action = { println("Preview activated") }
            }

            command(PresentationPriority.TOP) {
                title = resourceBundle.getString("SlideShow.text")
                iconFactory = SimpleResizableIcon.FactoryTop()
                action = { println("Slide Show activated") }
            }

            resizePolicies =
                { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesNone(ribbonBand) }
        }
    }

    fun getAnimationBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Animation.textBandTitle")
            iconFactory = SimpleResizableIcon.FactoryTop()

            command(PresentationPriority.TOP) {
                title = resourceBundle.getString("CustomAnimation.text")
                iconFactory = SimpleResizableIcon.FactoryTop()
                action = { println("Animation 1 activated") }
            }

            command(PresentationPriority.TOP) {
                title = resourceBundle.getString("CustomAnimation.text")
                iconFactory = SimpleResizableIcon.FactoryTop()
                action = { println("Animation 2 activated") }
            }

            command(PresentationPriority.TOP) {
                title = resourceBundle.getString("CustomAnimation.text")
                iconFactory = SimpleResizableIcon.FactoryTop()
                action = { println("Animation 3 activated") }
            }

            resizePolicies =
                { ribbonBand -> CoreRibbonResizePolicies.getCorePoliciesNone(ribbonBand) }
        }
    }

    fun getTransitionBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("TransitionToThis.textBandTitle")
            iconFactory = SimpleResizableIcon.FactoryTop()

            gallery(PresentationPriority.TOP) {
                presentation {
                    state = CommandButtonPresentationState.SMALL
                    preferredPopupMaxCommandColumns = 6
                    preferredPopupMaxVisibleCommandRows = 6
                    commandVisibilities {
                        2 at PresentationPriority.LOW
                        4 at PresentationPriority.MEDIUM
                        6 at PresentationPriority.TOP
                    }
                }

                content {
                    commandGroup {
                        title = resourceBundle.getString("TransitionGallery.textGroupTitle1")
                        for (i in 1..40) {
                            command {
                                iconFactory = DecoratedResizableIcon.factory(
                                    Appointment_new.factory(),
                                    DecoratedResizableIcon.IconDecorator { _, g, x, y, _, height ->
                                        g.render {
                                            it.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                .fontSet.controlFont.deriveFont(9.0f)
                                            NeonCortex.installDesktopHints(it, it.font)
                                            it.color = Color.black
                                            it.drawString("" + i, x + 1, y + height - 2)
                                            it.drawString("" + i, x + 3, y + height - 2)
                                            it.drawString("" + i, x + 2, y + height - 1)
                                            it.drawString("" + i, x + 2, y + height - 3)
                                            it.color = Color.white
                                            it.drawString("" + i, x + 2, y + height - 2)
                                        }
                                    })
                                action = { println("Activated action $i") }
                                isToggle = true
                            }
                        }
                    }

                    commandGroup {
                        title = resourceBundle.getString("TransitionGallery.textGroupTitle2")
                        for (i in 41..70) {
                            command {
                                iconFactory = DecoratedResizableIcon.factory(
                                    Appointment_new.factory(),
                                    DecoratedResizableIcon.IconDecorator { _, g, x, y, _, height ->
                                        g.render {
                                            it.font = SubstanceCortex.GlobalScope.getFontPolicy()
                                                .fontSet.controlFont.deriveFont(9.0f)
                                            NeonCortex.installDesktopHints(it, it.font)
                                            it.color = Color.black
                                            it.drawString("" + i, x + 1, y + height - 2)
                                            it.drawString("" + i, x + 3, y + height - 2)
                                            it.drawString("" + i, x + 2, y + height - 1)
                                            it.drawString("" + i, x + 2, y + height - 3)
                                            it.color = Color.white
                                            it.drawString("" + i, x + 2, y + height - 2)
                                        }
                                    })
                                action = { println("Activated action $i") }
                                isToggle = true
                            }
                        }
                    }
                }
            }

            group {
                comboBox<String> {
                    content {
                        items("[" + resourceBundle.getString("NoSound.text") + "]     ")
                        iconFactory = SimpleResizableIcon.FactoryTop()
                    }
                }

                comboBox<String> {
                    content {
                        items("[" + resourceBundle.getString("Speed.text") + "]     ")
                        caption = resourceBundle.getString("Speed.text")
                    }
                }

                checkBox {
                    content {
                        text = resourceBundle.getString("ApplyToAll.text")
                    }
                }
            }
        }
    }

    fun getTransitionNextBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("TransitionToNext.textBandTitle")
            iconFactory = SimpleResizableIcon.FactoryTop()

            checkBox {
                content {
                    text = resourceBundle.getString("OnMouseClick.text")
                    isSelected = true
                }
            }

            checkBox {
                content {
                    text = resourceBundle.getString("AutoAfter.text")
                }
            }

            spinnerDate {
                content {
                    iconFactory = SimpleResizableIcon.FactoryTop()
                }
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
            iconFactory = Format_justify_left.factory()

            group {
                comboBox<String> {
                    content {
                        items(resourceBundle.getString("VeryLong.text"))
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.FILL
                    }
                }

                spinnerNumber {
                    content {
                        value = 0
                        minimum = 0
                        maximum = 100
                        stepSize = 5
                        caption = resourceBundle.getString("Leading.text")
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.LEADING
                    }
                }

                spinnerNumber {
                    content {
                        value = 0
                        minimum = 0
                        maximum = 100
                        stepSize = 5
                        caption = resourceBundle.getString("Trailing.text")
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.TRAILING
                    }
                }

                comboBox<String> {
                    content {
                        items(resourceBundle.getString("VeryLong.text"))
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.FILL
                    }
                }

                spinnerNumber {
                    content {
                        value = 0
                        minimum = 0
                        maximum = 100
                        stepSize = 5
                        caption = resourceBundle.getString("Center.text")
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.CENTER
                    }
                }

                spinnerNumber {
                    content {
                        value = 0
                        minimum = 0
                        maximum = 100
                        stepSize = 5
                        caption = resourceBundle.getString("Fill.text")
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.FILL
                    }
                }
            }

            group {
                comboBox<String> {
                    content {
                        items(resourceBundle.getString("Long.text"))
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.FILL
                    }
                }

                spinnerNumber {
                    content {
                        value = 0
                        minimum = 0
                        maximum = 100
                        stepSize = 5
                        caption = resourceBundle.getString("Leading.text")
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.LEADING
                    }
                }

                spinnerNumber {
                    content {
                        value = 0
                        minimum = 0
                        maximum = 100
                        stepSize = 5
                        caption = resourceBundle.getString("Trailing.text")
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.TRAILING
                    }
                }

                comboBox<String> {
                    content {
                        items(resourceBundle.getString("Long.text"))
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.FILL
                    }
                }

                spinnerNumber {
                    content {
                        value = 0
                        minimum = 0
                        maximum = 100
                        stepSize = 5
                        caption = resourceBundle.getString("Center.text")
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.CENTER
                    }
                }

                spinnerNumber {
                    content {
                        value = 0
                        minimum = 0
                        maximum = 100
                        stepSize = 5
                        caption = resourceBundle.getString("Fill.text")
                    }
                    presentation {
                        horizontalAlignment = HorizontalAlignment.FILL
                    }
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

fun getApplicationMenuRichTooltipIcon(): Factory {
    val appMenuButtonTooltipImage = ImageIO
        .read(
            RibbonDemoBuilder::class.java.classLoader.getResource(
                "org.pushingpixels.demo.plasma.ribbon/appmenubutton-tooltip-main.png"
            )
        )
    val appMenuButtonTooltipImageWidth = appMenuButtonTooltipImage.width
    val appMenuButtonTooltipImageHeight = appMenuButtonTooltipImage.height
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
            g.drawImage(
                appMenuButtonTooltipImage, x, y, iconWidth, iconHeight,
                null
            )
        }
    }
    appMenuRichTooltipMainIcon.setDimension(
        Dimension(
            appMenuButtonTooltipImageInitialWidth, appMenuButtonTooltipImageInitialHeight
        )
    )
    return (Factory { appMenuRichTooltipMainIcon })
}

fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)

        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())

        val builder = RibbonDemoBuilder()

        val ribbonFrame = ribbonFrame {
            title = builder.resourceBundle.getString("Frame.title")
            applicationIconFactory = Applications_internet.factory()

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
                            builder.resourceBundle.getString("Task11.textTaskTitle"), "XA"
                        )
                        +builder.getContextualRibbonTask(
                            builder.resourceBundle.getString("Task12.textTaskTitle"), "XB"
                        )
                    }
                }

                taskGroup {
                    title = builder.resourceBundle.getString("Group2.textTaskGroupTitle")
                    color = Color.green

                    tasks {
                        +builder.getContextualRibbonTask(
                            builder.resourceBundle.getString("Task21.textTaskTitle"), "YA"
                        )
                    }
                }
            }

            onTaskSelectionChange = { task -> println("Task [${task.title}] selected") }

            anchored {
                command(
                    popupKeyTip = "GS",
                    popupHorizontalGravity = CommandButtonPresentationModel.PopupHorizontalGravity.END
                ) {
                    title = builder.resourceBundle.getString("Share.title")
                    iconFactory = Internet_mail.factory()

                    menu = commandPopupMenu {
                        command(actionKeyTip = "E") {
                            title = builder.resourceBundle.getString("AppMenuSend.email.text")
                            action = { println("Shared to email") }
                        }

                        command(actionKeyTip = "H") {
                            title = builder.resourceBundle.getString("AppMenuSend.html.text")
                            action = { println("Shared to browser") }
                        }

                        command(actionKeyTip = "W") {
                            title = builder.resourceBundle.getString("AppMenuSend.word.text")
                            action = { println("Shared to Word") }
                        }
                    }
                }

                command(actionKeyTip = "GC") {
                    iconFactory = Internet_group_chat.factory()
                    isToggle = true
                    action = { JOptionPane.showMessageDialog(null, "Chat button clicked") }
                }

                command(actionKeyTip = "GH") {
                    iconFactory = Help_browser.factory()
                    action = { JOptionPane.showMessageDialog(null, "Help button clicked") }

                    actionRichTooltip {
                        title = builder.resourceBundle.getString("Help.tooltip.title")
                        description =
                            builder.resourceBundle.getString("Help.tooltip.actionParagraph")
                    }
                }
            }

            taskbar {
                +builder.pasteCommand

                command {
                    iconFactory = Edit_clear.factory()
                    action = { println("Taskbar Clear activated") }
                    isActionEnabled = false
                }

                command {
                    iconFactory = Edit_copy.factory()
                    action = { println("Taskbar Copy activated") }
                }

                +builder.documentNewCommand

                command {
                    iconFactory = Edit_find.factory()
                    action = { println("Taskbar Find activated") }
                }

                comboBox<String> {
                    +builder.fontComboBoxModel
                }

                checkBox {
                    +builder.rulerCheckBoxModel
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
                    description = builder.resourceBundle.getString("AppMenu.tooltip.paragraph1")
                    mainIconFactory = getApplicationMenuRichTooltipIcon()
                    footer = builder.resourceBundle.getString("AppMenu.tooltip.footer1")
                    footerIconFactory = Help_browser.factory()
                }
                keyTip = "F"

                group {
                    // "Create new" primary
                    command(actionKeyTip = "N") {
                        title = builder.resourceBundle.getString("AppMenuNew.text")
                        iconFactory = Document_new.factory()
                        action = { println("Invoked creating new document") }

                        commandPopupMenu {
                            group {
                                title =
                                    builder.resourceBundle.getString("AppMenu.default.textGroupTitle1")

                                val mf = MessageFormat(
                                    builder.resourceBundle.getString("AppMenu.default.textButton")
                                )
                                mf.locale = builder.currLocale
                                for (i in 0..4) {
                                    command {
                                        title = mf.format(arrayOf<Any>(i))
                                        iconFactory = Text_html.factory()
                                        action = { println("Action $i activated") }
                                    }
                                }
                            }
                        }
                    }

                    // "Open" primary
                    command(actionKeyTip = "O") {
                        title = builder.resourceBundle.getString("AppMenuOpen.text")
                        iconFactory = Document_open.factory()
                        action = { println("Invoked opening document") }

                        commandPopupMenu {
                            group {
                                title =
                                    builder.resourceBundle.getString("AppMenuOpen.secondary.textGroupTitle1")

                                val mf = MessageFormat(
                                    builder.resourceBundle.getString("AppMenuOpen.secondary.textButton")
                                )
                                mf.locale = builder.currLocale
                                for (i in 0..4) {
                                    command {
                                        title = mf.format(arrayOf<Any>(i))
                                        iconFactory = Text_html.factory()
                                        action = { println("Action $i activated") }
                                    }
                                }
                            }
                        }
                    }

                    // "Save" primary
                    command(actionKeyTip = "S") {
                        title = builder.resourceBundle.getString("AppMenuSave.text")
                        iconFactory = Document_save.factory()
                        action = { println("Invoked saving document") }
                        isActionEnabled = false
                    }

                    // "Save as" primary + secondaries
                    command(actionKeyTip = "A", popupKeyTip = "F", isTextClickAction = true) {
                        title = builder.resourceBundle.getString("AppMenuSaveAs.text")
                        iconFactory = Document_save_as.factory()
                        action = { println("Invoked saving document as") }

                        commandPopupMenu {
                            group {
                                title =
                                    builder.resourceBundle.getString("AppMenuSaveAs.secondary.textGroupTitle1")

                                command(actionKeyTip = "W") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuSaveAs.word.text")
                                    iconFactory = X_office_document.factory()
                                    extraText =
                                        builder.resourceBundle.getString("AppMenuSaveAs.word.description")
                                    action = { println("Invoked saved as Word") }
                                }

                                command(actionKeyTip = "H") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuSaveAs.html.text")
                                    iconFactory = Text_html.factory()
                                    extraText =
                                        builder.resourceBundle.getString("AppMenuSaveAs.html.description")
                                    action = { println("Invoked saved as HTML") }
                                    isActionEnabled = false
                                }

                                command(actionKeyTip = "O") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuSaveAs.other.text")
                                    iconFactory = Document_save_as.factory()
                                    extraText =
                                        builder.resourceBundle.getString("AppMenuSaveAs.other.description")
                                    action = { println("Invoked saved as other") }
                                }
                            }
                        }
                    }
                }

                group {
                    // "Print" primary + secondaries
                    command(actionKeyTip = "P", popupKeyTip = "W", isTextClickAction = true) {
                        title = builder.resourceBundle.getString("AppMenuPrint.text")
                        iconFactory = Document_print.factory()
                        action = { println("Invoked printing as") }

                        commandPopupMenu {
                            group {
                                title =
                                    builder.resourceBundle.getString("AppMenuPrint.secondary.textGroupTitle1")

                                command(actionKeyTip = "P") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuPrint.print.text")
                                    iconFactory = Printer.factory()
                                    extraText =
                                        builder.resourceBundle.getString("AppMenuPrint.print.description")
                                    action = { println("Invoked print") }
                                }

                                command(actionKeyTip = "Q") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuPrint.quick.text")
                                    iconFactory = Printer.factory()
                                    extraText =
                                        builder.resourceBundle.getString("AppMenuPrint.quick.description")
                                    action = { println("Invoked quick") }
                                }

                                command(actionKeyTip = "V") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuPrint.preview.text")
                                    iconFactory = Document_print_preview.factory()
                                    extraText =
                                        builder.resourceBundle.getString("AppMenuPrint.preview.description")
                                    action = { println("Invoked preview") }
                                }
                            }

                            group {
                                title =
                                    builder.resourceBundle.getString("AppMenuPrint.secondary.textGroupTitle2")

                                command(actionKeyTip = "M") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuPrint.memo.text")
                                    iconFactory = Text_x_generic.factory()
                                    action = { println("Invoked memo") }
                                }

                                command(actionKeyTip = "C") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuPrint.custom.text")
                                    iconFactory = Text_x_generic.factory()
                                    action = { println("Invoked custom") }
                                }
                            }
                        }
                    }

                    // "Send" primary + secondaries
                    command(popupKeyTip = "D") {
                        title = builder.resourceBundle.getString("AppMenuSend.text")
                        iconFactory = Mail_forward.factory()

                        commandPopupMenu {
                            group {
                                title =
                                    builder.resourceBundle.getString("AppMenuSend.secondary.textGroupTitle1")

                                command(actionKeyTip = "E") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuSend.email.text")
                                    iconFactory = Mail_message_new.factory()
                                    extraText =
                                        builder.resourceBundle.getString("AppMenuSend.email.description")
                                    action = { println("Invoked email") }
                                }

                                command(actionKeyTip = "H") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuSend.html.text")
                                    iconFactory = Text_html.factory()
                                    extraText =
                                        builder.resourceBundle.getString("AppMenuSend.html.description")
                                    action = { println("Invoked HTML") }
                                }

                                command(actionKeyTip = "W") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuSend.word.text")
                                    iconFactory = X_office_document.factory()
                                    extraText =
                                        builder.resourceBundle.getString("AppMenuSend.word.description")
                                    action = { println("Invoked Word") }
                                }

                                command(popupKeyTip = "X") {
                                    title =
                                        builder.resourceBundle.getString("AppMenuSend.wireless.text")
                                    iconFactory = Mail_message_new.factory()
                                    extraText =
                                        builder.resourceBundle.getString("AppMenuSend.wireless.description")
                                    menu = commandPopupMenu {
                                        command(actionKeyTip = "W") {
                                            title =
                                                builder.resourceBundle.getString("AppMenuSend.wireless.wifi.text")
                                            iconFactory = EmptyResizableIcon.factory()
                                            action = { println("WiFi activated") }
                                        }

                                        command(actionKeyTip = "B") {
                                            title =
                                                builder.resourceBundle.getString("AppMenuSend.wireless.bluetooth.text")
                                            iconFactory = EmptyResizableIcon.factory()
                                            action = { println("Bluetooth activated") }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                group {
                    // "Exit" primary
                    command(actionKeyTip = "X") {
                        title = builder.resourceBundle.getString("AppMenuExit.text")
                        iconFactory = System_log_out.factory()
                        action = { exitProcess(0) }
                        menu = null
                    }
                }

                footer {
                    command {
                        title = builder.resourceBundle.getString("AppMenuOptions.text")
                        iconFactory = Document_properties.factory()
                        action = { println("Invoked Options") }
                    }

                    command {
                        title = builder.resourceBundle.getString("AppMenuExit.text")
                        iconFactory = System_log_out.factory()
                        action = { exitProcess(0) }
                    }
                }
            }

            keyboardActions {
                +RibbonKeyboardAction(
                    actionName = "Cut",
                    actionKeyStroke = if (NeonCortex.getPlatform() == NeonCortex.Platform.MACOS)
                        KeyStroke.getKeyStroke("meta X") else KeyStroke.getKeyStroke("ctrl X"),
                    command = builder.cutCommand
                )
                +RibbonKeyboardAction(
                    actionName = "Copy",
                    actionKeyStroke = if (NeonCortex.getPlatform() == NeonCortex.Platform.MACOS)
                        KeyStroke.getKeyStroke("meta C") else KeyStroke.getKeyStroke("ctrl C"),
                    command = builder.copyCommand
                )
                +RibbonKeyboardAction(
                    actionName = "Paste",
                    actionKeyStroke = if (NeonCortex.getPlatform() == NeonCortex.Platform.MACOS)
                        KeyStroke.getKeyStroke("meta V") else KeyStroke.getKeyStroke("ctrl V"),
                    command = builder.pasteCommand
                )
            }
        }

        val javaRibbonFrame = ribbonFrame.asJavaRibbonFrame()

        javaRibbonFrame.add(builder.getControlPanel(javaRibbonFrame), BorderLayout.EAST)
        builder.rulerPanel = RulerPanel()
        javaRibbonFrame.add(builder.rulerPanel, BorderLayout.CENTER)

        javaRibbonFrame.applyComponentOrientation(
            ComponentOrientation.getOrientation(builder.currLocale)
        )
        val r = GraphicsEnvironment.getLocalGraphicsEnvironment().maximumWindowBounds
        javaRibbonFrame.preferredSize = Dimension(r.width, r.height / 2)
        javaRibbonFrame.minimumSize = Dimension(r.width / 10, r.height / 2)
        javaRibbonFrame.pack()
        javaRibbonFrame.setLocation(r.x, r.y)
        javaRibbonFrame.defaultCloseOperation = WindowConstants.DISPOSE_ON_CLOSE

        javaRibbonFrame.isVisible = true
    }
}
