/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.tools.zodiac.substance

import kotlinx.coroutines.*
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.demo.substance.main.check.SampleFrame
import org.pushingpixels.neon.NeonCortex
import org.pushingpixels.substance.api.ComponentState
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.SubstanceSkin
import org.pushingpixels.substance.api.SubstanceSlices
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType
import org.pushingpixels.tools.common.RadianceLogo
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO
import javax.swing.JFrame

/**
 * The base class for taking a single screenshot for Substance documentation.
 *
 * @author Kirill Grouchnikov
 */
abstract class BaseRobot(protected var skin: SubstanceSkin, private val screenshotFilename: String) {

    /**
     * The frame instance.
     */
    private var sf: SampleFrame? = null

    suspend fun runInner(screenshotDirectory: String) {
        val start = System.currentTimeMillis()

        // set skin
        withContext(Dispatchers.Swing) {
            SubstanceCortex.GlobalScope.setSkin(skin)
            JFrame.setDefaultLookAndFeelDecorated(true)
        }

        // create the frame and set the icon image
        withContext(Dispatchers.Swing) {
            sf = SampleFrame()
            sf!!.iconImage = RadianceLogo.getLogoImage(
                    SubstanceCortex.ComponentScope.getCurrentSkin(sf!!.rootPane).getColorScheme(
                            DecorationAreaType.PRIMARY_TITLE_PANE,
                            SubstanceSlices.ColorSchemeAssociationKind.FILL,
                            ComponentState.ENABLED))
            sf!!.setSize(340, 254)
            sf!!.setLocationRelativeTo(null)
            sf!!.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            sf!!.isVisible = true
        }

        // wait for one second
        withContext(Dispatchers.Main) { delay(1000) }

        // make the screenshot
        withContext(Dispatchers.Swing) { makeScreenshot(screenshotDirectory) }

        // dispose the frame
        withContext(Dispatchers.Swing) { sf!!.dispose() }

        val end = System.currentTimeMillis()
        println(this.javaClass.simpleName + " : " + (end - start) + "ms")
    }

    /**
     * Runs the screenshot process.
     */
    fun run(screenshotDirectory: String) {
        runBlocking { runInner(screenshotDirectory) }
    }

    /**
     * Creates the screenshot and saves it on the disk.
     */
    private fun makeScreenshot(screenshotDirectory: String) {
        val bi = NeonCortex.getBlankImage(sf!!.width, sf!!.height)
        val g = bi.graphics
        sf!!.paint(g)
        try {
            val target = File(screenshotDirectory + this.screenshotFilename)
            target.parentFile.mkdirs()
            ImageIO.write(bi, "png", target)
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }

    }
}
