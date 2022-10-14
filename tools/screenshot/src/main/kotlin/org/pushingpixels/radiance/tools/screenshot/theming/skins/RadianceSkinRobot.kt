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
package org.pushingpixels.radiance.tools.screenshot.theming.skins

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.swing.Swing
import kotlinx.coroutines.withContext
import org.pushingpixels.radiance.common.api.RadianceCommonCortex
import org.pushingpixels.radiance.demo.theming.main.check.SampleFrame
import org.pushingpixels.radiance.theming.api.ComponentState
import org.pushingpixels.radiance.theming.api.RadianceSkin
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType
import org.pushingpixels.radiance.theming.api.skin.MarinerSkin
import org.pushingpixels.radiance.tools.common.RadianceLogo
import org.pushingpixels.radiance.tools.screenshot.ScreenshotRobot
import java.awt.Robot
import java.awt.event.InputEvent
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO
import javax.swing.JFrame

/**
 * The base class for taking screenshots of skins for Radiance look-and-feel documentation.
 *
 * @author Kirill Grouchnikov
 */
abstract class RadianceSkinRobot(
    private val skins: List<RadianceSkin>,
    private val screenshotSubfolder: String,
    private val frameTitle: String
) : ScreenshotRobot {
    private suspend fun runInner(screenshotDirectory: String) {
        withContext(Dispatchers.Swing) {
            // Initial skin
            RadianceThemingCortex.GlobalScope.setSkin(MarinerSkin())
            JFrame.setDefaultLookAndFeelDecorated(true)
        }

        // create the frame and set the icon image
        val frame: SampleFrame
        withContext(Dispatchers.Swing) {
            frame = SampleFrame(frameTitle)
            frame.iconImage = RadianceLogo.getLogoImage(
                frame,
                RadianceThemingCortex.ComponentScope.getCurrentSkin(frame.rootPane).getColorScheme(
                    DecorationAreaType.PRIMARY_TITLE_PANE,
                    RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                    ComponentState.ENABLED
                )
            )
            frame.setSize(340, 258)
            frame.setLocationRelativeTo(null)
            frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

            frame.isFocusable = false
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
        }

        // get the default button
        val defaultButton = withContext(Dispatchers.Swing) { frame.rootPane.defaultButton }

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

            // switch to the middle tab
            withContext(Dispatchers.Swing) { frame.switchToMiddleTab() }

            // move the mouse to the default button
            withContext(Dispatchers.Swing) {
                defaultButton.isFocusable = false
                val locOnScreen = defaultButton.locationOnScreen
                robot.mouseMove(
                    locOnScreen.x + defaultButton.width / 2,
                    locOnScreen.y + defaultButton.height / 2
                )
            }

            // wait for a bit
            withContext(Dispatchers.Main) { delay(500) }

            // make the first screenshot
            withContext(Dispatchers.Swing) {
                makeScreenshot(
                    frame, screenshotDirectory,
                    "$screenshotSubfolder/" +
                            skin.displayName.lowercase().replace(" ", "") + "1.png"
                )
            }

            // switch to the last tab
            withContext(Dispatchers.Swing) { frame.switchToLastTab() }

            // move the mouse away from the frame
            withContext(Dispatchers.Swing) { robot.mouseMove(0, 0) }

            // wait for a bit
            withContext(Dispatchers.Main) { delay(500) }

            // make the second screenshot
            withContext(Dispatchers.Swing) {
                makeScreenshot(
                    frame, screenshotDirectory,
                    "$screenshotSubfolder/" +
                            skin.displayName.lowercase().replace(" ", "") + "2.png"
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
     *
     * @param count Sequence number for the screenshot.
     */
    private fun makeScreenshot(
        frame: SampleFrame,
        screenshotDirectory: String,
        screenshotFilename: String
    ) {
        val bi = RadianceCommonCortex.getBlankScaledImage(
            RadianceCommonCortex.getScaleFactor(frame),
            frame.width,
            frame.height
        )
        val g = bi.graphics
        frame.paint(g)
        try {
            val output = File(screenshotDirectory + screenshotFilename)
            output.parentFile.mkdirs()
            ImageIO.write(bi, "png", output)
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }

    }
}
