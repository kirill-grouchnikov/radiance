/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.tools.schemeeditor

import org.pushingpixels.radiance.swing.ktx.addDelayedActionListener
import org.pushingpixels.radiance.swing.ktx.awt.windowAncestor
import org.pushingpixels.radiance.swing.ktx.swing.*
import org.pushingpixels.radiance.theming.api.RadianceSkin
import org.pushingpixels.radiance.theming.api.RadianceSkin.ColorSchemes
import org.pushingpixels.radiance.theming.api.colorscheme.BaseDarkColorScheme
import org.pushingpixels.radiance.theming.api.colorscheme.BaseLightColorScheme
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme
import org.pushingpixels.radiance.theming.api.renderer.RadianceDefaultListCellRenderer
import org.pushingpixels.radiance.tools.schemeeditor.svg.*
import java.awt.*
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.PrintStream
import java.util.*
import java.util.regex.Pattern
import javax.swing.*
import javax.swing.border.EmptyBorder
import javax.swing.filechooser.FileNameExtensionFilter
import kotlin.collections.ArrayList
import kotlin.properties.Delegates

/**
 * Contains information on color schemes loaded by the
 * [RadianceSkin.getColorSchemes] API. Note that the custom
 * skins should only use the [.get] API. The rest of the API
 * is currently internal and is used in the **Radiance**
 * visual editor.
 *
 * @author Kirill Grouchnikov
 */
class EditorColorSchemes() : ColorSchemes {
    /**
     * List of color schemes of this object.
     */
    private val schemes: MutableList<RadianceColorScheme> = ArrayList()

    /**
     * Creates an object based on the specified list of color schemes. This
     * method is for internal use only and should not be used in custom
     * application skins.
     *
     * @param schemes List of color schemes.
     */
    constructor(schemes: Collection<RadianceColorScheme>) : this() {
        this.schemes.addAll(schemes)
    }

    /**
     * Returns the number of color schemes in this object. This method is
     * for internal use only and should not be used in custom application
     * skins.
     *
     * @return The number of color schemes in this object.
     */
    fun size(): Int {
        return schemes.size
    }

    /**
     * Returns the color scheme at the specified index. This method is for
     * internal use only and should not be used in custom application skins.
     *
     * @param index Index.
     * @return Color scheme at the specified index.
     */
    operator fun get(index: Int): RadianceColorScheme {
        return schemes[index]
    }

    override fun getAll(): Collection<RadianceColorScheme> {
        return Collections.unmodifiableCollection(schemes)
    }

    /**
     * Returns the color scheme based on its display name. This method is
     * the only API that is published for use in custom application skins.
     *
     * @param displayName Display name of a color scheme.
     * @return The color scheme with the matching display name.
     */
    override fun get(displayName: String): RadianceColorScheme? {
        for (scheme in schemes) {
            if (scheme.displayName == displayName) {
                return scheme
            }
        }
        return null
    }

    /**
     * Returns the index of the color scheme that has the specified display
     * name. This method is for internal use only and should not be used in
     * custom application skins.
     *
     * @param displayName Display name of a color scheme.
     * @return The index of the color scheme that has the specified display
     * name.
     */
    private fun indexOf(displayName: String): Int {
        for (i in schemes.indices) {
            val curr = schemes[i]
            if (curr.displayName == displayName) {
                return i
            }
        }
        return -1
    }

    /**
     * Finds the index of the color scheme that has the specified display
     * name and replaces it with (possibly another) color scheme. This
     * method is for internal use only and should not be used in custom
     * application skins.
     *
     * @param displayName Display name of a color scheme.
     * @param scheme      Color scheme that will replace the existing color scheme
     * (based on the display name) at the same index in the list.
     */
    fun replace(displayName: String, scheme: RadianceColorScheme) {
        val index = this.indexOf(displayName)
        if (index >= 0) {
            schemes.removeAt(index)
            schemes.add(index, scheme)
        }
    }

    /**
     * Deletes the color scheme that has the specified display name. This
     * method is for internal use only and should not be used in custom
     * application skins.
     *
     * @param displayName Display name of the color scheme to delete from the list.
     */
    fun delete(displayName: String) {
        val index = this.indexOf(displayName)
        if (index >= 0) {
            schemes.removeAt(index)
        }
    }

    /**
     * Adds the specified color scheme to the end of the list. This method
     * is for internal use only and should not be used in custom application
     * skins.
     *
     * @param scheme Color scheme to add to the end of the list.
     */
    fun add(scheme: RadianceColorScheme) {
        schemes.add(scheme)
    }

    /**
     * Moves the color scheme with the specified display name one position
     * towards the beginning of the list. This method is for internal use
     * only and should not be used in custom application skins.
     *
     * @param displayName Display name of the color scheme to move one position
     * towards the beginning of the list.
     */
    fun switchWithPrevious(displayName: String) {
        val index = this.indexOf(displayName)
        if (index >= 0) {
            val scheme = schemes.removeAt(index)
            schemes.add(index - 1, scheme)
        }
    }

    /**
     * Moves the color scheme with the specified display name one position
     * towards the end of the list. This method is for internal use only and
     * should not be used in custom application skins.
     *
     * @param displayName Display name of the color scheme to move one position
     * towards the end of the list.
     */
    fun switchWithNext(displayName: String) {
        val index = this.indexOf(displayName)
        if (index >= 0) {
            val scheme = schemes.removeAt(index)
            schemes.add(index + 1, scheme)
        }
    }
}

class JColorSchemeList : JComponent() {
    private var schemes: EditorColorSchemes? = null
    private val schemeList: JList<RadianceColorScheme>
    private val cardPanel: JPanel
    private val schemeListModel: ColorSchemeListModel
    var currentFile: File? = null
        private set

    var isModified: Boolean by Delegates.observable(false) {
        prop, old, new -> this.firePropertyChange(prop.name, old, new)
    }
    var selectedColorScheme: RadianceColorScheme? by Delegates.observable(null) {
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
            val returnVal = jfc.showSaveDialog(this.windowAncestor)
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
        this.schemes = EditorColorSchemes()

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
            val selected = schemeList.selectedValue as RadianceColorScheme
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
                this.schemes = EditorColorSchemes(RadianceSkin.getColorSchemes(FileInputStream(file)).all)
            } else {
                this.schemes = EditorColorSchemes()
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

    fun updateColorScheme(colorScheme: RadianceColorScheme) {
        this.schemes!!.replace(colorScheme.displayName, colorScheme)
    }

    internal inner class ColorSchemeListModel : AbstractListModel<RadianceColorScheme>() {
        override fun getSize(): Int {
            return if (schemes == null) 0 else schemes!!.size()
        }

        override fun getElementAt(index: Int): RadianceColorScheme? {
            return schemes?.get(index)
        }

        fun fireContentsChanged() {
            this.fireContentsChanged(schemeList, 0, size)
        }
    }

    internal inner class ColorSchemeListRenderer : RadianceDefaultListCellRenderer() {
        override fun getListCellRendererComponent(list: JList<*>, value: Any?, index: Int,
                isSelected: Boolean, cellHasFocus: Boolean): Component {
            val scheme = value as RadianceColorScheme?
            return super.getListCellRendererComponent(list, scheme!!.displayName, index,
                    isSelected, cellHasFocus)
        }
    }

    companion object {
        internal val LIST = "List"
        internal val INSTRUCTIONAL = "Instructional"
    }
}
