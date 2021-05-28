/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.torch.swing

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.meteor.addDelayedComponentListener
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.torch.from
import org.pushingpixels.torch.repaintTimeline
import org.pushingpixels.torch.timeline
import org.pushingpixels.trident.api.Timeline.RepeatBehavior
import org.pushingpixels.trident.api.TimelineScenario
import java.awt.*
import java.util.*
import javax.swing.JFrame
import javax.swing.JPanel
import kotlin.collections.ArrayList

class Letter(private val x: Int, private val y: Int, private val c: Char, private var font: Font) {
    var color: Color = Color.white
    var opacity = 0.0f

    fun paint(g: Graphics) {
        if (this.opacity == 0.0f) {
            return
        }

        g.render {
            it.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                    RenderingHints.VALUE_TEXT_ANTIALIAS_ON)
            it.font = font
            it.color = this.color
            it.composite = AlphaComposite.SrcOver.derive(this.opacity)
            it.drawString("" + this.c, this.x, this.y)
        }
    }
}

class Drop(private var font: Font) {
    private val letters: MutableList<Letter> = ArrayList()

    fun getScenario(x: Int): TimelineScenario {
        val result = TimelineScenario.Parallel()
        val randomizer = Random()
        // how many letters will there be?
        val totalLetterCount = 5 + randomizer.nextInt(20)
        val initialDelayTotal = randomizer.nextInt(1000)
        val durationTotal = 1000 + randomizer.nextInt(100)
        for (i in 0 until totalLetterCount) {
            val y = font.size * i
            // choose random katakana letter
            val start = 33
            val delta = 95
            val c = (start + Math.random() * delta).toInt().toChar()
            val l = Letter(x, y, c, font)
            this.letters.add(l)
            val t = l.timeline {
                property(l::opacity from 1.0f to 0.0f)
                property(l::color from Color.white to Color.green)
                duration = durationTotal.toLong()
                initialDelay = (initialDelayTotal + i * 120).toLong()
            }
            result.addScenarioActor(t)
        }
        return result
    }

    fun paint(g: Graphics) {
        for (l in this.letters) {
            l.paint(g)
        }
    }
}

private class MatrixPanel : JPanel() {
    private val drops: MutableList<Drop> = ArrayList()
    private var katakanaFont = Font.createFont(Font.TRUETYPE_FONT,
            MatrixPanel::class.java.classLoader.getResourceAsStream("fonts/katakana.ttf")!!)
            .deriveFont(Font.BOLD, 14.0f)

    init {
        this.repaintTimeline().playLoop(RepeatBehavior.LOOP)

        this.addDelayedComponentListener(onComponentResized = {
            while (drops.size < 40) {
                addDrop()
            }
        })
    }

    @Synchronized
    private fun addDrop() {
        val drop = Drop(katakanaFont)
        val scenario = drop.getScenario(Random().nextInt(width))
        scenario.addCallback {
            synchronized(this@MatrixPanel) {
                drops.remove(drop)
                addDrop()
            }
        }
        this.drops.add(drop)
        scenario.play()
    }

    override fun paintComponent(g: Graphics) {
        g.color = Color.black
        g.fillRect(0, 0, width, height)

        synchronized(this) {
            for (drop in this.drops) {
                drop.paint(g)
            }
        }
    }
}

fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        val fr = JFrame("Matrix rain")
        fr.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        val panel = MatrixPanel()
        panel.preferredSize = Dimension(400, 300)
        fr.add(panel)
        fr.pack()
        fr.setLocationRelativeTo(null)

        fr.isVisible = true
    }
}
