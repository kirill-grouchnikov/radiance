/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.component.ktx.imageviewer

import kotlinx.coroutines.*
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.radiance.component.api.bcb.BreadcrumbItem
import org.pushingpixels.radiance.component.api.bcb.core.BreadcrumbFileSelector
import org.pushingpixels.radiance.component.api.common.AbstractFileViewPanel
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState
import org.pushingpixels.radiance.component.ktx.bcb.addDelayedPathListener
import org.pushingpixels.radiance.demo.component.icon.ImageWrapperRadianceIcon
import org.pushingpixels.radiance.demo.component.ktx.RadianceLogo
import org.pushingpixels.radiance.theming.api.ComponentState
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin
import java.awt.BorderLayout
import java.awt.Dimension
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.JSlider
import javax.swing.WindowConstants

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        JFrame.setDefaultLookAndFeelDecorated(true)
        RadianceThemingCortex.GlobalScope.setSkin(
            BusinessSkin()
        )

        val frame = JFrame("Image Viewer")

        frame.layout = BorderLayout()
        val initialSize = 100

        val bar =
            BreadcrumbFileSelector()
        val fileViewPanel = object : AbstractFileViewPanel<File>(initialSize) {
            override fun getLeafContent(leaf: File): InputStream? {
                return try {
                    FileInputStream(leaf)
                } catch (exc: Exception) {
                    exc.printStackTrace()
                    null
                }
            }

            override fun getRadianceIcon(
                leaf: AbstractFileViewPanel.Leaf,
                stream: InputStream, state: CommandButtonPresentationState,
                dimension: Dimension
            ): RadianceIcon {
                var dimensionForIcon = dimension
                val prefSize = state.preferredIconSize
                if (prefSize > 0) {
                    dimensionForIcon = Dimension(prefSize, prefSize)
                }
                return ImageWrapperRadianceIcon.getIcon(stream, dimensionForIcon)
            }

            override fun toShowFile(item: BreadcrumbItem<File>): Boolean {
                val fileName = item.data.name.lowercase()
                return fileName.endsWith(".jpeg") || fileName.endsWith(".jpg")
                        || fileName.endsWith(".gif") || fileName.endsWith(".png")
                        || fileName.endsWith(".bmp")
            }
        }

        bar.contentModel.addDelayedPathListener { event ->
            val newPath = event.source.items
            println("New path is ")
            for (item in newPath) {
                println("\t" + item.data.absolutePath)
            }

            if (newPath.size > 0) {
                fileViewPanel.setFolder(withContext(Dispatchers.Default) {
                    bar.contentProvider.getLeaves(newPath)
                })
            }
        }

        frame.add(bar, BorderLayout.NORTH)

        val jsp = JScrollPane(
            fileViewPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
        )
        frame.add(jsp, BorderLayout.CENTER)

        val iconSizeSlider = JSlider()
        iconSizeSlider.minimum = 50
        iconSizeSlider.maximum = 200
        iconSizeSlider.snapToTicks = true
        iconSizeSlider.paintLabels = true
        iconSizeSlider.paintTicks = true
        iconSizeSlider.majorTickSpacing = 50
        iconSizeSlider.minorTickSpacing = 10
        iconSizeSlider.value = initialSize

        iconSizeSlider.addChangeListener {
            if (!iconSizeSlider.model.valueIsAdjusting) {
                if (iconSizeSlider.value != fileViewPanel.projection.presentationModel.commandIconDimension) {
                    GlobalScope.launch(Dispatchers.Swing) {
                        fileViewPanel.projection.presentationModel.commandIconDimension =
                            iconSizeSlider.value
                    }
                }
            }
        }
        frame.add(iconSizeSlider, BorderLayout.SOUTH)

        frame.iconImage = RadianceLogo.getLogoImage(
            frame,
            RadianceThemingCortex.GlobalScope.getCurrentSkin()!!.getColorScheme(
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                ComponentState.ENABLED
            )
        )
        frame.setSize(550, 400)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
