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
package org.pushingpixels.radiance.tools.screenshot.theming.text

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.swing.Swing
import kotlinx.coroutines.withContext
import org.pushingpixels.radiance.common.api.RadianceCommonCortex
import org.pushingpixels.radiance.theming.api.ComponentState
import org.pushingpixels.radiance.theming.api.RadianceSkin
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType
import org.pushingpixels.radiance.theming.api.skin.MarinerSkin
import org.pushingpixels.radiance.theming.api.text.RadianceTextField
import org.pushingpixels.radiance.tools.common.RadianceLogo
import org.pushingpixels.radiance.tools.screenshot.ScreenshotRobot
import java.awt.FlowLayout
import java.awt.Robot
import java.awt.event.InputEvent
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO
import javax.swing.BoxLayout
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.text.DefaultCaret

/**
 * The base class for taking screenshots of text highlights for Radiance documentation.
 *
 * @author Kirill Grouchnikov
 */
abstract class TextHighlightsRobot(
    private val skins: List<RadianceSkin>,
    private val screenshotSubfolder: String
) : ScreenshotRobot {

    private class TextHighlightsFrame(title: String) : JFrame(title) {
        val textFields = arrayListOf<RadianceTextField>()

        fun makeTextField(text: String): RadianceTextField {
            val result = RadianceTextField(text, 20)
            // force the display of text selection even when the focus has been lost
            result.caret = object : DefaultCaret() {
                override fun setSelectionVisible(visible: Boolean) {
                    super.setSelectionVisible(true)
                }
            }
            textFields.add(result)
            return result
        }
    }

    private fun makeFrame(): TextHighlightsFrame {
        val frame = TextHighlightsFrame("Text highlights")

        frame.iconImage = RadianceLogo.getLogoImage(
            frame,
            RadianceThemingCortex.ComponentScope.getCurrentSkin(frame.rootPane).getColorScheme(
                DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                ComponentState.ENABLED
            )
        )

        frame.contentPane.layout = BoxLayout(frame.contentPane, BoxLayout.Y_AXIS)

        val panelTitlePane = JPanel(FlowLayout())
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(
            panelTitlePane, DecorationAreaType.PRIMARY_TITLE_PANE
        )
        val panelToolbar = JPanel(FlowLayout())
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(
            panelToolbar, DecorationAreaType.TOOLBAR
        )
        val panelGeneral = JPanel(FlowLayout())
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(
            panelGeneral, DecorationAreaType.CONTROL_PANE
        )
        val panelNone = JPanel(FlowLayout())
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(
            panelNone, DecorationAreaType.NONE
        )
        val panelFooter = JPanel(FlowLayout())
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(
            panelFooter, DecorationAreaType.FOOTER
        )

        panelTitlePane.add(frame.makeTextField("sample title pane"))
        panelToolbar.add(frame.makeTextField("sample toolbar"))
        panelGeneral.add(frame.makeTextField("sample general"))
        panelNone.add(frame.makeTextField("sample none"))
        panelFooter.add(frame.makeTextField("sample footer"))

        frame.contentPane.add(panelTitlePane)
        frame.contentPane.add(panelToolbar)
        frame.contentPane.add(panelGeneral)
        frame.contentPane.add(panelNone)
        frame.contentPane.add(panelFooter)

        return frame
    }

    private suspend fun runInner(screenshotDirectory: String) {
        withContext(Dispatchers.Swing) {
            // Initial skin
            RadianceThemingCortex.GlobalScope.setSkin(MarinerSkin())
            JFrame.setDefaultLookAndFeelDecorated(true)
        }

        // create the frame
        val frame: TextHighlightsFrame
        withContext(Dispatchers.Swing) {
            frame = makeFrame()
            frame.setSize(300, 300)
            frame.setLocationRelativeTo(null)
            frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

            frame.isVisible = true
        }

        val robot = Robot()

        // move the mouse to the frame's title bar and click on it. This is to bring that
        // Java window to the front of the desktop
        withContext(Dispatchers.Swing) {
            val locOnScreen = frame.locationOnScreen
            robot.mouseMove(
                locOnScreen.x + frame.width / 2,
                locOnScreen.y + 10
            )
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK)
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK)
            frame.requestFocusInWindow()
            frame.requestFocus()
        }

        for (skin in skins) {
            // set skin and update the frame logo
            withContext(Dispatchers.Swing) {
                RadianceThemingCortex.GlobalScope.setSkin(skin)
                frame.iconImage = RadianceLogo.getLogoImage(
                    frame,
                    skin.getColorScheme(
                        DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED
                    )
                )
            }

            // Go over all the text fields and emulate text selection by pressing the mouse
            // at the left edge of the field, moving it to the right edge and then releasing it
            for (textField in frame.textFields) {
                withContext(Dispatchers.Swing) {
                    val locOnScreen = textField.locationOnScreen
                    robot.mouseMove(
                        locOnScreen.x,
                        locOnScreen.y + textField.height / 2
                    )
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK)
                    robot.mouseMove(
                        locOnScreen.x + textField.width,
                        locOnScreen.y + textField.height / 2
                    )
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK)
                }

                withContext(Dispatchers.Main) { delay(100) }
            }

            // wait for a bit
            withContext(Dispatchers.Main) { delay(100) }

            // make the screenshot
            withContext(Dispatchers.Swing) {
                makeScreenshot(
                    frame,
                    screenshotDirectory,
                    "$screenshotSubfolder/" +
                            skin.displayName.lowercase().replace(" ", "") + ".png"
                )
            }
        }

        // dispose the frame
        withContext(Dispatchers.Swing) { frame.dispose() }
    }

    /**
     * Runs the screenshot process.
     */
    override fun run(screenshotDirectory: String) {
        runBlocking { runInner(screenshotDirectory) }
    }

    /**
     * Creates the screenshot and saves it on the disk.
     */
    private fun makeScreenshot(
        frame: JFrame,
        screenshotDirectory: String,
        screenshotFilename: String
    ) {
        val bi = RadianceCommonCortex.getBlankScaledImage(
            RadianceCommonCortex.getScaleFactor(frame),
            frame.width, frame.height
        )
        val g = bi.graphics
        frame.paint(g)
        try {
            val target = File(screenshotDirectory + screenshotFilename)
            target.parentFile.mkdirs()
            ImageIO.write(bi, "png", target)
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }
    }
}
