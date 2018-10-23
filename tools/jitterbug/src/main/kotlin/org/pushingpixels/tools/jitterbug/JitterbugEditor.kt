/*
 * Copyright (c) 2005-2018 Radiance Jitterbug Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Jitterbug Kirill Grouchnikov nor the names of
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
package org.pushingpixels.tools.jitterbug

import com.jgoodies.forms.builder.FormBuilder
import org.pushingpixels.ember.setContentsModified
import org.pushingpixels.meteor.awt.addDelayedWindowListener
import org.pushingpixels.meteor.awt.addTypedDelayedPropertyChangeListener
import org.pushingpixels.meteor.awt.forEach
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType
import org.pushingpixels.substance.api.colorscheme.BaseDarkColorScheme
import org.pushingpixels.substance.api.colorscheme.BaseLightColorScheme
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme
import org.pushingpixels.substance.api.skin.BusinessSkin
import org.pushingpixels.tools.common.JImageComponent
import org.pushingpixels.tools.common.RadianceLogo
import org.pushingpixels.tools.jitterbug.svg.outline_save_24px
import java.awt.*
import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.ClipboardOwner
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.Transferable
import java.awt.dnd.*
import java.io.File
import java.io.InputStream
import javax.swing.*

class JitterbugEditor : JFrame(), ClipboardOwner {
    private val colorSchemeList: JColorSchemeList
    private val colorSchemeComp: JColorSchemeComponent
    private val hsvGraph: JHsvGraph

    init {

        this.iconImage = RadianceLogo.getLogoImage(SubstanceCortex.GlobalScope.getCurrentSkin()!!
                .getEnabledColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE))

        val leftPanelBuilder = FormBuilder.create().columns("fill:pref")
                .rows("fill:pref, \$lg, fill:pref, \$lg, fill:pref:grow, \$lg, fill:pref")

        this.colorSchemeList = JColorSchemeList()
        this.colorSchemeList.dropTarget = DropTarget(this, JitterbugDropHandler())
        leftPanelBuilder.add(this.colorSchemeList).xy(1, 1)

        this.colorSchemeComp = JColorSchemeComponent()
        this.colorSchemeComp.isEnabled = false
        this.colorSchemeComp.dropTarget = DropTarget(this, JitterbugDropHandler())
        leftPanelBuilder.add(this.colorSchemeComp).xy(1, 3)

        this.hsvGraph = JHsvGraph()
        this.hsvGraph.dropTarget = DropTarget(this, JitterbugDropHandler())
        leftPanelBuilder.add(this.hsvGraph).xy(1, 5)

        val controlsPanel = JPanel(FlowLayout(FlowLayout.TRAILING))

        val saveButton = JButton("save")
        saveButton.icon = outline_save_24px.of(12, 12)
        saveButton.addActionListener {
            colorSchemeList.save()
            SwingUtilities.invokeLater { saveButton.isEnabled = false }
        }
        saveButton.isEnabled = false
        controlsPanel.add(saveButton)

        val saveAsButton = JButton("save as...")
        saveAsButton.addActionListener {
            colorSchemeList.saveAs()
            updateMainWindowTitle(colorSchemeList.isModified)
        }
        controlsPanel.add(saveAsButton)

        val newButton = JButton("new")
        newButton.addActionListener {
            colorSchemeList.setColorSchemeList(null)
            colorSchemeComp.clearContent()
            updateMainWindowTitle(colorSchemeList.isModified)
        }

        controlsPanel.add(Box.createHorizontalStrut(20))
        controlsPanel.add(newButton)

        leftPanelBuilder.add(controlsPanel).xy(1, 7)

        val leftPanel = leftPanelBuilder.build()
        // wire drag and drop
        wireDragAndDrop(leftPanel)

        // wire color scheme selection in the list to the
        // color scheme component
        this.colorSchemeList.addTypedDelayedPropertyChangeListener<SubstanceColorScheme>("selectedColorScheme") { event ->
            val newSelection = event.newValue
            if (newSelection != null) {
                colorSchemeComp.setContent(newSelection)
            } else {
                colorSchemeComp.clearContent()
            }
        }
        // track color modifications of the currently selected
        // color scheme
        this.colorSchemeComp.addStateChangeListener { stateChangeType ->
            if (stateChangeType == JColorSchemeComponent.StateChangeType.MODIFIED) {
                // let the color scheme list know that there was change
                colorSchemeList.isModified = true
            }
            // update the HSV graph component
            if (colorSchemeComp.isDefined) {
                val colors = arrayOf(colorSchemeComp.ultraLightColor, colorSchemeComp.extraLightColor,
                        colorSchemeComp.lightColor, colorSchemeComp.midColor, colorSchemeComp.darkColor,
                        colorSchemeComp.ultraDarkColor)
                hsvGraph.setColors(colors)
            } else {
                hsvGraph.setColors(null)
            }

            if (stateChangeType == JColorSchemeComponent.StateChangeType.MODIFIED) {
                if (colorSchemeComp.isDefined) {
                    val isLight = colorSchemeComp.isLight
                    val ultraDark = colorSchemeComp.ultraDarkColor
                    val dark = colorSchemeComp.darkColor
                    val mid = colorSchemeComp.midColor
                    val light = colorSchemeComp.lightColor
                    val extraLight = colorSchemeComp.extraLightColor
                    val ultraLight = colorSchemeComp.ultraLightColor
                    val foreground = colorSchemeComp.foregroundColor
                    val name = colorSchemeComp.displayName

                    val scheme = if (isLight)
                        object : BaseLightColorScheme(name) {
                            override fun getForegroundColor(): Color {
                                return foreground
                            }

                            override fun getUltraLightColor(): Color {
                                return ultraLight
                            }

                            override fun getExtraLightColor(): Color {
                                return extraLight
                            }

                            override fun getLightColor(): Color {
                                return light
                            }

                            override fun getMidColor(): Color {
                                return mid
                            }

                            override fun getDarkColor(): Color {
                                return dark
                            }

                            override fun getUltraDarkColor(): Color {
                                return ultraDark
                            }
                        }
                    else
                        object : BaseDarkColorScheme(name) {
                            override fun getForegroundColor(): Color {
                                return foreground
                            }

                            override fun getUltraLightColor(): Color {
                                return ultraLight
                            }

                            override fun getExtraLightColor(): Color {
                                return extraLight
                            }

                            override fun getLightColor(): Color {
                                return light
                            }

                            override fun getMidColor(): Color {
                                return mid
                            }

                            override fun getDarkColor(): Color {
                                return dark
                            }

                            override fun getUltraDarkColor(): Color {
                                return ultraDark
                            }
                        }
                    colorSchemeList.updateColorScheme(scheme)
                }
            }
        }

        // track modification changes on the scheme list and any scheme in it
        this.colorSchemeList.addTypedDelayedPropertyChangeListener<Boolean>(
                this.colorSchemeList::isModified.name) { evt ->
            val isModified = evt.newValue?: false

            // update the close / X button of the main frame
            this.rootPane.setContentsModified(isModified)

            // update the main frame title
            updateMainWindowTitle(isModified)

            // update the enabled state of the "save" button
            saveButton.isEnabled = (colorSchemeList.currentFile != null)
        }

        this.add(leftPanel, BorderLayout.WEST)

        val mainPanel = JPanel(BorderLayout())
        val imageComp = JImageComponent(true)
        imageComp
                .setLegend(arrayOf("Image panel. Use one of the following to show an image:",
                        "\t* Right-click to paste an image from the clipboard",
                        "\t* Drag and drop an image file from local disk or another app",
                        "\t* Drag and drop a URL pointing to an image"))

        imageComp.addTypedDelayedPropertyChangeListener<Color>("selectedColor") { evt ->
            val selectedImageColor = evt.newValue
            val selectedColorComp = colorSchemeComp.selectedColorComponent
            selectedColorComp?.setColor(selectedImageColor, true)
        }

        mainPanel.add(imageComp, BorderLayout.CENTER)

        this.add(mainPanel, BorderLayout.CENTER)

        this.setSize(800, 700)
        this.extendedState = JFrame.MAXIMIZED_BOTH
        this.setLocationRelativeTo(null)
        this.defaultCloseOperation = JFrame.DO_NOTHING_ON_CLOSE

        this.addDelayedWindowListener(onWindowClosing = {
            // do we need to save the modified scheme list?
            if (colorSchemeList.checkModifiedStateAndSaveIfNecessary()) {
                dispose()
            }
        })

        this.updateMainWindowTitle(false)
    }

    private fun wireDragAndDrop(comp: Component) {
        comp.dropTarget = DropTarget(this, JitterbugDropHandler())
        if (comp is Container) {
            comp.forEach { wireDragAndDrop(it) }
        }
    }

    override fun lostOwnership(clipboard: Clipboard, contents: Transferable) {}

    private fun updateMainWindowTitle(isModified: Boolean) {
        val schemesFile = colorSchemeList.currentFile
        var title = "$APP_TITLE - "
        if (isModified) {
            title += "* "
        }
        if (schemesFile != null) {
            title += schemesFile.absolutePath
        } else {
            title += "Unsaved"
        }
        setTitle(title)
    }

    inner class JitterbugDropHandler : DropTargetAdapter() {
        override fun drop(dtde: DropTargetDropEvent) {
            val t = dtde.transferable
            if (t.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                try {
                    dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE)
                    val files = t
                            .getTransferData(DataFlavor.javaFileListFlavor) as List<*>
                    val f = files[0] as File
                    println("Reading from " + f.absolutePath)
                    colorSchemeList.setColorSchemeList(f)
                    colorSchemeComp.clearContent()
                    dtde.dropComplete(true)
                    this@JitterbugEditor.title = APP_TITLE + " - " + f.absolutePath
                } catch (exc: Exception) {
                    exc.printStackTrace()
                }

            }
        }

        override fun dragEnter(dtde: DropTargetDragEvent?) {
            for (df in dtde!!.currentDataFlavors) {
                val repClass = df.defaultRepresentationClass
                val canDrop = InputStream::class.java.isAssignableFrom(repClass)
                if (canDrop) {
                    dtde.acceptDrag(DnDConstants.ACTION_COPY_OR_MOVE)
                    return
                }
            }
        }
    }

    companion object {
        private const val APP_TITLE = "Jitterbug color scheme editor"
    }
}

fun main(args: Array<String>) {
    JDialog.setDefaultLookAndFeelDecorated(true)
    JFrame.setDefaultLookAndFeelDecorated(true)
    SwingUtilities.invokeLater {
        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())
        JitterbugEditor().isVisible = true
    }
}