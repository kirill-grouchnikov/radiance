/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.tools.zodiac.substance.text

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.swing.Swing
import kotlinx.coroutines.withContext
import org.pushingpixels.neon.api.NeonCortex
import org.pushingpixels.substance.api.ComponentState
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.SubstanceSkin
import org.pushingpixels.substance.api.SubstanceSlices
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType
import org.pushingpixels.substance.api.text.SubstanceTextField
import org.pushingpixels.tools.common.RadianceLogo
import org.pushingpixels.tools.zodiac.ZodiacRobot
import java.awt.FlowLayout
import java.awt.KeyboardFocusManager
import java.awt.Robot
import java.awt.event.KeyEvent
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO
import javax.swing.BoxLayout
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JTextField
import javax.swing.text.DefaultCaret

/**
 * The base class for taking screenshots of text highlights for Substance documentation.
 *
 * @author Kirill Grouchnikov
 */
abstract class TextHighlightsRobot(private val skin: SubstanceSkin,
        private val screenshotFilename: String) : ZodiacRobot {
    private fun makeTextField(text: String): JTextField {
        val result = SubstanceTextField(text, 20)
        // force the display of text selection even when the focus has been lost
        result.caret = object : DefaultCaret() {
            override fun setSelectionVisible(visible: Boolean) {
                super.setSelectionVisible(true)
            }
        }
        result.selectAll()
        return result
    }

    private fun makeFrame(): JFrame {
        val frame = JFrame("Text highlights")

        frame.iconImage = RadianceLogo.getLogoImage(
                SubstanceCortex.ComponentScope.getCurrentSkin(frame.rootPane).getColorScheme(
                        DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED))

        frame.contentPane.layout = BoxLayout(frame.contentPane, BoxLayout.Y_AXIS)

        val panelTitlePane = JPanel(FlowLayout())
        SubstanceCortex.ComponentOrParentChainScope.setDecorationType(
                panelTitlePane, DecorationAreaType.PRIMARY_TITLE_PANE)
        val panelToolbar = JPanel(FlowLayout())
        SubstanceCortex.ComponentOrParentChainScope.setDecorationType(
                panelToolbar, DecorationAreaType.TOOLBAR)
        val panelGeneral = JPanel(FlowLayout())
        SubstanceCortex.ComponentOrParentChainScope.setDecorationType(
                panelGeneral, DecorationAreaType.CONTROL_PANE)
        val panelNone = JPanel(FlowLayout())
        SubstanceCortex.ComponentOrParentChainScope.setDecorationType(
                panelNone, DecorationAreaType.NONE)
        val panelFooter = JPanel(FlowLayout())
        SubstanceCortex.ComponentOrParentChainScope.setDecorationType(
                panelFooter, DecorationAreaType.FOOTER)

        panelTitlePane.add(makeTextField("sample title pane"))
        panelToolbar.add(makeTextField("sample toolbar"))
        panelGeneral.add(makeTextField("sample general"))
        panelNone.add(makeTextField("sample none"))
        panelFooter.add(makeTextField("sample footer"))

        frame.contentPane.add(panelTitlePane)
        frame.contentPane.add(panelToolbar)
        frame.contentPane.add(panelGeneral)
        frame.contentPane.add(panelNone)
        frame.contentPane.add(panelFooter)

        return frame
    }

    private suspend fun runInner(screenshotDirectory: String) {
        val start = System.currentTimeMillis()

        // set skin
        withContext(Dispatchers.Swing) {
            SubstanceCortex.GlobalScope.setSkin(skin)
            JFrame.setDefaultLookAndFeelDecorated(true)
        }

        // create the frame
        val frame: JFrame
        withContext(Dispatchers.Swing) {
            frame = makeFrame()
            frame.setSize(300, 300)
            frame.setLocationRelativeTo(null)
            frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

            frame.isVisible = true
        }

        val robot = Robot()

        // Some black magic (not really, but this is ugly) to focus-traverse all our text components
        // to actually kick in the selection highlights
        for (i in 1..4) {
            withContext(Dispatchers.Swing) {
                robot.keyPress(KeyEvent.VK_TAB)
                robot.keyRelease(KeyEvent.VK_TAB)
            }

            withContext(Dispatchers.Main) { delay(100) }

            KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent()
            KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent()
        }

        // wait for one second
        withContext(Dispatchers.Main) { delay(1000) }

        // make the screenshot
        withContext(Dispatchers.Swing) { makeScreenshot(frame, screenshotDirectory) }

        // dispose the frame
        withContext(Dispatchers.Swing) { frame.dispose() }

        val end = System.currentTimeMillis()
        println(this.javaClass.simpleName + " : " + (end - start) + "ms")
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
    private fun makeScreenshot(frame: JFrame, screenshotDirectory: String) {
        val bi = NeonCortex.getBlankImage(frame.width, frame.height)
        val g = bi.graphics
        frame.paint(g)
        try {
            val target = File(screenshotDirectory + this.screenshotFilename)
            target.parentFile.mkdirs()
            ImageIO.write(bi, "png", target)
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }
    }
}