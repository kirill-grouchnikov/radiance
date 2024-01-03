/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.tools.screenshot.component.skins

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.swing.Swing
import kotlinx.coroutines.withContext
import org.pushingpixels.radiance.common.api.RadianceCommonCortex
import org.pushingpixels.radiance.demo.component.ribbon.BasicCheckRibbon
import org.pushingpixels.radiance.theming.api.RadianceSkin
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.skin.MarinerSkin
import org.pushingpixels.radiance.tools.screenshot.ScreenshotRobot
import java.awt.ComponentOrientation
import java.awt.Dimension
import java.awt.GraphicsEnvironment
import java.awt.Robot
import java.awt.event.InputEvent
import java.io.File
import java.io.IOException
import java.util.*
import javax.imageio.ImageIO
import javax.swing.JFrame

/**
 * The base class for taking screenshots of skins for Component documentation.
 *
 * @author Kirill Grouchnikov
 */
abstract class ComponentSkinRobot(
    private val skins: List<RadianceSkin>,
    private val screenshotSubfolder: String
) : ScreenshotRobot {
    private suspend fun runInner(screenshotDirectory: String) {
        withContext(Dispatchers.Swing) {
            // Initial skin
            RadianceThemingCortex.GlobalScope.setSkin(MarinerSkin())
            JFrame.setDefaultLookAndFeelDecorated(true)
        }

        // create the frame and set the icon image
        val ribbonFrame: BasicCheckRibbon
        withContext(Dispatchers.Swing) {
            ribbonFrame =
                BasicCheckRibbon()
            ribbonFrame.configureRibbon()
            ribbonFrame.applyComponentOrientation(
                ComponentOrientation.getOrientation(Locale.getDefault())
            )
            val r = GraphicsEnvironment.getLocalGraphicsEnvironment().maximumWindowBounds
            ribbonFrame.preferredSize = Dimension(r.width, r.height / 2)
            ribbonFrame.minimumSize = Dimension(100, r.height / 3)
            ribbonFrame.pack()
            ribbonFrame.setLocation(r.x, r.y)
            ribbonFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

            ribbonFrame.isFocusable = true
            ribbonFrame.isVisible = true
        }

        val robot = Robot()

        // move the mouse to the frame's title bar and click on it. This is to bring that
        // Java window to the front of the desktop
        withContext(Dispatchers.Swing) {
            val locOnScreen = ribbonFrame.locationOnScreen
            robot.mouseMove(
                locOnScreen.x + ribbonFrame.width / 2,
                locOnScreen.y + 10
            )
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK)
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK)
        }

        withContext(Dispatchers.Swing) { robot.mouseMove(0, 0) }

        // wait for a second
        withContext(Dispatchers.Main) { delay(1000) }

        for (skin in skins) {
            // set skin and update the frame logo
            withContext(Dispatchers.Swing) {
                RadianceThemingCortex.GlobalScope.setSkin(skin)
            }
            // wait for a bit
            withContext(Dispatchers.Main) { delay(100) }

            // make the screenshot
            withContext(Dispatchers.Swing) {
                makeScreenshot(
                    ribbonFrame,
                    screenshotDirectory,
                    "$screenshotSubfolder/" +
                            skin.displayName.lowercase().replace(" ", "") + ".png"
                )
            }
        }

        // dispose the frame
        withContext(Dispatchers.Swing) { ribbonFrame.dispose() }
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
        ribbonFrame: JFrame,
        screenshotDirectory: String,
        screenshotFilename: String
    ) {
        val bi = RadianceCommonCortex.getBlankScaledImage(
            RadianceCommonCortex.getScaleFactor(ribbonFrame),
            ribbonFrame.width, ribbonFrame.height
        )
        val g = bi.graphics
        ribbonFrame.paint(g)

        val finalIm = RadianceCommonCortex.getBlankScaledImage(
            RadianceCommonCortex.getScaleFactor(ribbonFrame), 500, 200
        )
        finalIm.graphics.drawImage(bi, 0, 0, null)

        try {
            val output = File(screenshotDirectory + screenshotFilename)
            output.parentFile.mkdirs()
            ImageIO.write(finalIm, "png", output)
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }

    }
}
