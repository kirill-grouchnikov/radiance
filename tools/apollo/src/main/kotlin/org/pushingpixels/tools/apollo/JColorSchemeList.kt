/*
 * Copyright (c) 2005-2019 Radiance Apollo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Apollo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.tools.apollo

import org.pushingpixels.meteor.addDelayedActionListener
import org.pushingpixels.meteor.swing.*
import org.pushingpixels.substance.api.SubstanceSkin
import org.pushingpixels.substance.api.colorscheme.BaseDarkColorScheme
import org.pushingpixels.substance.api.colorscheme.BaseLightColorScheme
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer
import org.pushingpixels.tools.apollo.svg.*
import java.awt.*
import java.io.File
import java.io.FileOutputStream
import java.io.PrintStream
import java.util.regex.Pattern
import javax.swing.*
import javax.swing.border.EmptyBorder
import javax.swing.filechooser.FileNameExtensionFilter
import kotlin.properties.Delegates

class JColorSchemeList : JComponent() {
    private var schemes: SubstanceSkin.ColorSchemes? = null
    private val schemeList: JList<SubstanceColorScheme>
    private val cardPanel: JPanel
    private val schemeListModel: ColorSchemeListModel
    var currentFile: File? = null
        private set

    var isModified: Boolean by Delegates.observable(false) {
        prop, old, new -> this.firePropertyChange(prop.name, old, new)
    }
    var selectedColorScheme: SubstanceColorScheme? by Delegates.observable<SubstanceColorScheme?>(null) {
        prop, old, new -> this.firePropertyChange(prop.name, old, new)
    }

    private val moveUpButton: JButton

    private val moveDownButton: JButton

    private val renameButton: JButton

    private val deleteButton: JButton

    private val fileNameForSaving: String?
        get() {
            val jfc = JFileChooser()
            val filter = FileNameExtensionFilter("Color scheme files", "colorschemes")
            jfc.fileFilter = filter
            val returnVal = jfc.showSaveDialog(SwingUtilities.getWindowAncestor(this))
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                var res = jfc.selectedFile.absolutePath
                if (!res.endsWith(".colorschemes")) {
                    res += ".colorschemes"
                }
                return res
            }
            return null
        }

    init {
        this.schemes = SubstanceSkin.ColorSchemes()

        this.schemeList = JList()
        this.schemeListModel = ColorSchemeListModel()
        this.schemeList.model = schemeListModel
        this.schemeList.cellRenderer = ColorSchemeListRenderer()
        this.schemeList.selectionMode = ListSelectionModel.SINGLE_SELECTION
        this.schemeList.selectionModel.addListSelectionListener {
            selectedColorScheme = schemeList.selectedValue
        }

        val bottomButtonsPanel = JPanel(FlowLayout(FlowLayout.TRAILING))
        val addColorScheme = JButton()
        addColorScheme.toolTipText = "Adds a new color scheme"
        addColorScheme.icon = outline_add_24px.of(12, 12)
        addColorScheme.addDelayedActionListener {
            val newName = getNewColorSchemeName(null)
            if (newName != null) {
                val newScheme = object : BaseLightColorScheme(newName) {
                    override fun getForegroundColor(): Color {
                        return Color.white
                    }

                    override fun getUltraLightColor(): Color {
                        return Color.white
                    }

                    override fun getExtraLightColor(): Color {
                        return Color.white
                    }

                    override fun getLightColor(): Color {
                        return Color.white
                    }

                    override fun getMidColor(): Color {
                        return Color.white
                    }

                    override fun getDarkColor(): Color {
                        return Color.white
                    }

                    override fun getUltraDarkColor(): Color {
                        return Color.white
                    }
                }

                schemes!!.add(newScheme)
                schemeListModel.fireContentsChanged()
                schemeList.setSelectedValue(newScheme, true)
                isModified = true
            }
        }

        bottomButtonsPanel.add(addColorScheme)

        bottomButtonsPanel.add(Box.createHorizontalStrut(10))

        moveUpButton = JButton()
        moveUpButton.toolTipText = "Moves the currently selected color scheme up"
        moveUpButton.isEnabled = false
        moveUpButton.icon = outline_keyboard_arrow_up_24px.of(12, 12)
        moveUpButton.addDelayedActionListener {
            val selected = schemeList.selectedValue as SubstanceColorScheme
            schemes!!.switchWithPrevious(selected.displayName)
            schemeListModel.fireContentsChanged()
            schemeList.setSelectedValue(selected, true)
            isModified = true
        }
        bottomButtonsPanel.add(moveUpButton)

        moveDownButton = JButton()
        moveDownButton.toolTipText = "Moves the currently selected color scheme down"
        moveDownButton.isEnabled = false
        moveDownButton.icon = outline_keyboard_arrow_down_24px.of(12, 12)
        moveDownButton.addDelayedActionListener {
            val selected = schemeList.selectedValue
            schemes!!.switchWithNext(selected.displayName)
            schemeListModel.fireContentsChanged()
            schemeList.setSelectedValue(selected, true)
            isModified = true
        }
        bottomButtonsPanel.add(moveDownButton)

        bottomButtonsPanel.add(Box.createHorizontalStrut(10))

        renameButton = JButton()
        renameButton.toolTipText = "Renames the currently selected color scheme"
        renameButton.isEnabled = false
        renameButton.icon = outline_edit_24px.of(12, 12)
        renameButton.addDelayedActionListener {
            val selected = schemeList.selectedValue
            val newName = getNewColorSchemeName(selected.displayName)
            if ((newName != null) && (newName.compareTo(selected.displayName) != 0)) {

                val isLight = !selected.isDark

                val renamedScheme = if (isLight)
                    object : BaseLightColorScheme(newName) {
                        override fun getForegroundColor(): Color {
                            return selected.foregroundColor
                        }

                        override fun getUltraLightColor(): Color {
                            return selected.ultraLightColor
                        }

                        override fun getExtraLightColor(): Color {
                            return selected.extraLightColor
                        }

                        override fun getLightColor(): Color {
                            return selected.lightColor
                        }

                        override fun getMidColor(): Color {
                            return selected.midColor
                        }

                        override fun getDarkColor(): Color {
                            return selected.darkColor
                        }

                        override fun getUltraDarkColor(): Color {
                            return selected.ultraDarkColor
                        }
                    }
                else
                    object : BaseDarkColorScheme(newName) {
                        override fun getForegroundColor(): Color {
                            return selected.foregroundColor
                        }

                        override fun getUltraLightColor(): Color {
                            return selected.ultraLightColor
                        }

                        override fun getExtraLightColor(): Color {
                            return selected.extraLightColor
                        }

                        override fun getLightColor(): Color {
                            return selected.lightColor
                        }

                        override fun getMidColor(): Color {
                            return selected.midColor
                        }

                        override fun getDarkColor(): Color {
                            return selected.darkColor
                        }

                        override fun getUltraDarkColor(): Color {
                            return selected.ultraDarkColor
                        }
                    }

                schemes!!.replace(selected.displayName, renamedScheme)
                schemeListModel.fireContentsChanged()
                schemeList.selectionModel.clearSelection()
                schemeList.setSelectedValue(renamedScheme, true)
                isModified = true
            }
        }

        bottomButtonsPanel.add(renameButton)

        deleteButton = JButton()
        deleteButton.toolTipText = "Removes the currently selected color scheme"
        deleteButton.isEnabled = false
        deleteButton.icon = outline_delete_24px.of(12, 12)
        deleteButton.addDelayedActionListener {
            val selected = schemeList.selectedValue
            schemes!!.delete(selected.displayName)
            schemeListModel.fireContentsChanged()
            schemeList.selectionModel.clearSelection()
            isModified = true
        }

        bottomButtonsPanel.add(deleteButton)

        this.schemeList.selectionModel.addListSelectionListener {
            val selectedIndex = schemeList.selectedIndex
            val hasSelection = selectedIndex >= 0
            renameButton.isEnabled = hasSelection
            deleteButton.isEnabled = hasSelection

            moveUpButton.isEnabled = hasSelection && selectedIndex > 0
            moveDownButton.isEnabled = hasSelection && selectedIndex < schemes!!.size() - 1
        }

        val mainControlPanel = JPanel(BorderLayout())
        mainControlPanel.add(JScrollPane(this.schemeList), BorderLayout.CENTER)
        mainControlPanel.add(bottomButtonsPanel, BorderLayout.SOUTH)

        // Set up a card panel. It has two cards:
        // * instructional text
        // * list of color schemes with button controls
        this.cardPanel = JPanel(CardLayout())
        val textArea = JTextArea(
                "List of color schemes. Use one of the following:\n   * Drag a .colorschemes file" + " here\n   * Click the \"New\" button below")
        textArea.border = EmptyBorder(10, 8, 0, 8)
        textArea.isEditable = false
        textArea.isOpaque = false
        textArea.rows = 9
        // textArea.setColumns(20);
        this.cardPanel.add(textArea, INSTRUCTIONAL)
        this.cardPanel.add(mainControlPanel, LIST)

        this.layout = BorderLayout()
        this.add(this.cardPanel, BorderLayout.CENTER)

        // constrain the preferred size so that the layout doesn't
        // change once the control panel is shown
        this.preferredSize = textArea.preferredSize
    }

    fun setColorSchemeList(file: File?) {
        if (!this.checkModifiedStateAndSaveIfNecessary()) {
            return
        }
        try {
            this.currentFile = file
            if (file != null) {
                this.schemes = SubstanceSkin.getColorSchemes(file.toURI().toURL())
            } else {
                this.schemes = SubstanceSkin.ColorSchemes()
            }
            // switch to the list view
            val cl = cardPanel.layout as CardLayout
            cl.show(cardPanel, LIST)
            // let the view know that the model has changed
            schemeListModel.fireContentsChanged()
            // update the buttons state
            if (file == null) {
                moveUpButton.isEnabled = false
                moveDownButton.isEnabled = false
                deleteButton.isEnabled = false
                renameButton.isEnabled = false
            }
            this.isModified = false
        } catch (exc: Exception) {
            exc.printStackTrace()
        }

    }

    fun checkModifiedStateAndSaveIfNecessary(): Boolean {
        if (!this.isModified) {
            return true
        }

        // does the user want to save modifications?
        val fileName = if (this.currentFile == null) "Unsaved" else this.currentFile!!.name

        val userSelection = this.showConfirmDialogInWindow(
                "Do you want to save the changes to '$fileName'?", "Modified contents",
                OptionPaneConfirmType.YES_NO_CANCEL_OPTION_TYPE)
        if (userSelection == JOptionPane.CANCEL_OPTION) {
            return false
        }
        if (userSelection == JOptionPane.YES_OPTION) {
            if (this.currentFile != null) {
                // ask to save
                this.save()
            } else {
                this.saveAs()
            }
        }
        return true
    }

    private fun getNewColorSchemeName(nameToStartWith: String?): String? {
        var result: String? = this.showInputDialogInWindow(
                "Type the color scheme name", nameToStartWith) ?: return null

        if (result == nameToStartWith) {
            return result
        }

        result = result!!.trim { it <= ' ' }

        // check characters
        val pattern = Pattern.compile("[a-zA-Z ]+")
        val matcher = pattern.matcher(result)
        if (!matcher.matches()) {
            this.showMessageDialogInWindow("Only use letters and spaces", "Name invalid",
                    OptionPaneMessageType.ERROR_MESSAGE_TYPE)
            return null
        }

        // check for uniqueness
        val existing = this.schemes!!.get(result)
        if (existing != null) {
            this.showMessageDialogInWindow("Name already exists", "Name clash",
                    OptionPaneMessageType.ERROR_MESSAGE_TYPE)
            return null
        }
        return result
    }

    fun save() {
        this.saveAs(this.currentFile)
    }

    fun saveAs() {
        // ask for a filename for the save
        val fileName = this.fileNameForSaving
        if (fileName != null) {
            val file = File(fileName)
            this.saveAs(file)
        }
    }

    private fun saveAs(file: File?) {
        val printStream = PrintStream(FileOutputStream(file!!))
        printStream.use {
            for (i in 0 until this.schemes!!.size()) {
                val colorScheme = this.schemes!!.get(i)
                val encodedColorScheme = colorScheme.toString()
                printStream.println(encodedColorScheme)
                printStream.println()
            }
        }
        this.currentFile = file
        this.isModified = false
    }

    fun updateColorScheme(colorScheme: SubstanceColorScheme) {
        this.schemes!!.replace(colorScheme.displayName, colorScheme)
    }

    internal inner class ColorSchemeListModel : AbstractListModel<SubstanceColorScheme>() {
        override fun getSize(): Int {
            return if (schemes == null) 0 else schemes!!.size()
        }

        override fun getElementAt(index: Int): SubstanceColorScheme? {
            return schemes?.get(index)
        }

        fun fireContentsChanged() {
            this.fireContentsChanged(schemeList, 0, size)
        }
    }

    internal inner class ColorSchemeListRenderer : SubstanceDefaultListCellRenderer() {
        override fun getListCellRendererComponent(list: JList<*>, value: Any?, index: Int,
                isSelected: Boolean, cellHasFocus: Boolean): Component {
            val scheme = value as SubstanceColorScheme?
            return super.getListCellRendererComponent(list, scheme!!.displayName, index,
                    isSelected, cellHasFocus)
        }
    }

    companion object {
        internal val LIST = "List"
        internal val INSTRUCTIONAL = "Instructional"
    }
}
