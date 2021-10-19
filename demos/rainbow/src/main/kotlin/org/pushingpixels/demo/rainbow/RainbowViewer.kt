/*
 * Copyright (c) 2005-2020 Rainbow Kirill Grouchnikov
 * and Alexander Potochkin. All Rights Reserved.
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
package org.pushingpixels.demo.rainbow

import com.jgoodies.forms.builder.FormBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import kotlinx.coroutines.withContext
import org.jdesktop.jxlayer.JXLayer
import org.jdesktop.jxlayer.plaf.ext.MouseScrollableUI
import org.jdesktop.jxlayer.plaf.ext.SpotLightUI
import org.pushingpixels.demo.rainbow.svg.ic_search_black_24px
import org.pushingpixels.demo.rainbow.svg.ic_zoom_in_black_24px
import org.pushingpixels.demo.rainbow.svg.ic_zoom_out_black_24px
import org.pushingpixels.radiance.theming.ktx.setDecorationType
import org.pushingpixels.flamingo.api.bcb.JBreadcrumbBar
import org.pushingpixels.flamingo.api.common.ProgressEvent
import org.pushingpixels.flamingo.api.layout.TransitionLayout
import org.pushingpixels.flamingo.api.layout.TransitionLayoutEvent
import org.pushingpixels.meteor.addDelayedChangeListener
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType
import java.awt.BorderLayout
import java.awt.geom.RoundRectangle2D
import javax.swing.*
import javax.swing.border.EmptyBorder
import javax.swing.event.DocumentEvent
import javax.swing.event.DocumentListener

/**
 * An extension of {@link JFrame} that displays SVG content in an icon grid.
 *
 * @author Kirill Grouchnikov
 * @author Alexander Potochkin
 */
class RainbowViewer<T>(title: String, private val bar: JBreadcrumbBar<T>) : JFrame(title) {
    /**
     * Panel with SVG icons.
     */
    private val svgFileViewPanel: RainbowFileViewPanel<T>

    /**
     * [JXLayer] painter.
     */
    private val spotLightLayerUI: SpotLightUI

    /**
     * Find field (a-la SpotLight).
     */
    private val findField: JTextField

    /**
     * Status label (in the status bar).
     */
    private val statusLabel: JLabel

    /**
     * Progress bar for tracking the asycnhronous loading of SVG images (in the
     * status bar).
     */
    private val statusProgressBar: JProgressBar

    /**
     * Number of files that match the current find string.
     */
    private var matchingFileCount: Int = 0

    /**
     * Current icon size.
     */
    private var currIconSize: Int = 0

    private var iconSize: Int
        get() = this.currIconSize
        set(iconSize) {
            this.currIconSize = iconSize
            svgFileViewPanel.projection.presentationModel.commandIconDimension = currIconSize
        }

    init {
        val initialSize = 64
        this.currIconSize = initialSize
        this.statusLabel = JLabel()
        this.statusProgressBar = JProgressBar()

        this.svgFileViewPanel = RainbowFileViewPanel(bar, initialSize)
        this.svgFileViewPanel.setProgressListener { evt: ProgressEvent ->
            GlobalScope.launch(Dispatchers.Swing) {
                when (evt.progress) {
                    0 -> {
                        // started
                        statusProgressBar.minimum = evt.minimum
                        statusProgressBar.maximum = evt.maximum
                        statusProgressBar.value = 0
                        statusProgressBar.isVisible = true
                    }
                    evt.maximum -> {
                        // ended
                        statusProgressBar.isVisible = false
                        statusProgressBar.value = 0
                    }
                    else -> {
                        statusProgressBar.value = evt.progress
                    }
                }
            }
        }

        val layer = JXLayer<JComponent>(svgFileViewPanel)
        spotLightLayerUI = SpotLightUI(2)
        layer.setUI(spotLightLayerUI)

        bar.model.addPathListener { event ->
            GlobalScope.launch(Dispatchers.Swing) {
                svgFileViewPanel.cancelMainWorker()
                val newPath = event.source.items
                if (newPath.size > 0) {
                    val folder = withContext(Dispatchers.Default) {
                        bar.callback.getLeafs(newPath)
                    }
                    svgFileViewPanel.setFolder(folder)
                    svgFileViewPanel.projection.presentationModel.commandIconDimension = currIconSize
                }
                updateSpotLightPainter()
            }
        }

        this.layout = BorderLayout()

        val toolbarBuilder =
                FormBuilder.create().columns("fill:pref:grow, 2dlu, fill:pref, 4dlu, fill:pref, 2dlu").rows("p")

        val toolbar = JToolBar()
        toolbar.isFloatable = false
        toolbar.layout = BorderLayout()
        toolbar.setDecorationType(DecorationAreaType.HEADER)

        toolbarBuilder.add(bar).xy(1, 1)

        this.findField = JTextField()
        this.findField.columns = 8
        this.findField.document.addDocumentListener(object : DocumentListener {
            override fun changedUpdate(e: DocumentEvent) {
                updateSpotLightPainter()
            }

            override fun insertUpdate(e: DocumentEvent) {
                updateSpotLightPainter()
            }

            override fun removeUpdate(e: DocumentEvent) {
                updateSpotLightPainter()
            }
        })
        this.findField.toolTipText = "Type search string"
        toolbarBuilder.add(this.findField).xy(3, 1)

        val searchIconLabel = JLabel(ic_search_black_24px.of(14, 14))
        toolbarBuilder.add(searchIconLabel).xy(5, 1)

        toolbar.add(toolbarBuilder.build(), BorderLayout.CENTER)

        this.add(toolbar, BorderLayout.NORTH)

        val panelLm = this.svgFileViewPanel.layout as TransitionLayout
        panelLm.addTransitionLayoutListener { event: TransitionLayoutEvent ->
            when (event.id) {
                TransitionLayoutEvent.TRANSITION_STARTED -> spotLightLayerUI.reset()
                TransitionLayoutEvent.TRANSITION_ENDED -> updateSpotLightPainter()
            }
        }

        val jsp = JScrollPane(layer, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER)
        add(JXLayer(jsp, MouseScrollableUI()))

        val statusBarBuilder = FormBuilder.create().columns(
                "fill:pref:grow(1), 1dlu, fill:min(pref;100px):grow(1), " + "1dlu, fill:min(pref;200px):grow(1)")
                .rows("p")
                .border(EmptyBorder(2, 4, 2, 4))

        statusBarBuilder.add(this.statusLabel).xy(1, 1)

        statusBarBuilder.add(this.statusProgressBar).xy(3, 1)
        this.statusProgressBar.isVisible = false

        statusBarBuilder.add(getPanel(initialSize)).xy(5, 1)

        val statusBarPanel = statusBarBuilder.build()
        statusBarPanel.setDecorationType(DecorationAreaType.CONTROL_PANE)
        this.add(statusBarPanel, BorderLayout.SOUTH)

        this.iconImage = RadianceLogo.getTitlePaneLogoImage(this)
    }

    /**
     * Updates the [JXLayer] painter.
     */
    private fun updateSpotLightPainter() {
        this.matchingFileCount = 0
        val text = this.findField.text
        if (text.isEmpty()) {
            // disable JXLayer shaper and painter
            spotLightLayerUI.isShadowEnabled = false
            spotLightLayerUI.reset()
            this.matchingFileCount = this.svgFileViewPanel.projection.contentModel.commandCount
        } else {
            // No grouping, so we're always looking at the first group (index 0)
            val buttonGroups = svgFileViewPanel.getGroupButtons(0)
            // System.out.println("Matching:");
            spotLightLayerUI.reset()
            for (value in buttonGroups) {
                val buttonText = value.text
                if (buttonText.contains(text)) {
                    this.matchingFileCount++
                    val bounds = value.bounds
                    // System.out.println("\t" + buttonEntry.getKey() + ":"
                    // + bounds);
                    bounds.grow(-1, 0)
                    val roundBounds = RoundRectangle2D.Double(bounds.x.toDouble(), bounds.y.toDouble(),
                            bounds.width.toDouble(), bounds.height.toDouble(), 10.0, 10.0)
                    spotLightLayerUI.addShape(roundBounds)
                } else {
                    // if the search string is modified while the mouse pointer
                    // is over an "active" button that becomes inactive as the
                    // result of search string modification, we need to remove
                    // the rollover status from the button to have the
                    // consistent UI behaviour.
                    value.actionModel.isRollover = false
                }
            }
            // enable it back - will fire the repaint of the layer
            spotLightLayerUI.isShadowEnabled = true
        }
        this.updateStatus()
    }

    /**
     * Updates the status label.
     */
    private fun updateStatus() {
        val svgFileCount = this.svgFileViewPanel.projection.contentModel.commandCount
        statusLabel.text = ("Folder contains " + svgFileCount + " SVG files ("
                + this.matchingFileCount + " matching filter)")

    }

    private fun getPanel(initialSize: Int): JPanel {
        val builder = FormBuilder.create()
                .columns("left:pref, 8dlu, fill:pref, 0dlu, fill:min:grow, 0dlu, fill:pref, 4dlu")
                .rows("p")

        val sizeLabel = JLabel()
        sizeLabel.text = initialSize.toString() + "x" + initialSize
        builder.add(sizeLabel).xy(1, 1)

        val zoomOutLabel = JLabel(ic_zoom_out_black_24px.of(12, 12))
        builder.add(zoomOutLabel).xy(3, 1)

        val iconSizeSlider = JSlider()
        iconSizeSlider.isOpaque = false
        iconSizeSlider.minimum = 32
        iconSizeSlider.maximum = 128
        iconSizeSlider.snapToTicks = true
        iconSizeSlider.majorTickSpacing = 32
        iconSizeSlider.minorTickSpacing = 8
        iconSizeSlider.value = initialSize
        iconSizeSlider.isFocusable = false

        iconSizeSlider.addDelayedChangeListener {
            if (!iconSizeSlider.model.valueIsAdjusting) {
                val newValue = iconSizeSlider.value
                if (newValue != iconSize) {
                    iconSize = newValue
                    sizeLabel.text = newValue.toString() + "x" + newValue
                }
            }
        }
        builder.add(iconSizeSlider).xy(5, 1)

        val zoomInLabel = JLabel(ic_zoom_in_black_24px.of(12, 12))
        builder.add(zoomInLabel).xy(7, 1)

        val result = builder.build()
        result.isOpaque = false
        return result
    }
}