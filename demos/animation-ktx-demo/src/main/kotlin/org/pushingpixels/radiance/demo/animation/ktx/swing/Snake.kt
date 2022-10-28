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
package org.pushingpixels.radiance.demo.animation.ktx.swing

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.radiance.swing.ktx.awt.render
import org.pushingpixels.radiance.animation.ktx.from
import org.pushingpixels.radiance.animation.ktx.repaintTimeline
import org.pushingpixels.radiance.animation.ktx.timeline
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline
import java.awt.Color
import java.awt.Dimension
import java.awt.Graphics
import java.awt.event.MouseEvent
import java.awt.event.MouseMotionAdapter
import javax.swing.JFrame
import javax.swing.JPanel

class SnakePanelRectangle(private val repaintTimeline: SwingRepaintTimeline) {
    var backgroundColor: Color = Color.black

    private var isRollover = false

    private val rolloverTimeline = this.timeline {
        property(::backgroundColor from Color.yellow to Color.black)
        onTimelinePulse { _, _ -> repaintTimeline.forceRepaintOnNextPulse() }
        duration = 2500
    }

    fun setRollover(isRollover: Boolean) {
        if (this.isRollover == isRollover) {
            return
        }
        this.isRollover = isRollover
        if (this.isRollover) {
            this.rolloverTimeline.replay()
        }
    }
}

private class SnakePanel : JPanel() {

    private val grid: Array<Array<SnakePanelRectangle>>

    private val ROWS = 10

    private val COLUMNS = 20

    private val DIM = 20

    init {
        val repaintTimeline = this.repaintTimeline { autoRepaintMode = false }
        this.grid = Array(COLUMNS) { Array(ROWS) { SnakePanelRectangle(repaintTimeline) } }
        this.preferredSize = Dimension(COLUMNS * (DIM + 1), ROWS * (DIM + 1))

        repaintTimeline.playLoop(RepeatBehavior.LOOP)

        this.addMouseMotionListener(object : MouseMotionAdapter() {
            var rowOld = -1
            var colOld = -1

            override fun mouseMoved(e: MouseEvent?) {
                val x = e!!.x
                val y = e.y

                val column = x / (DIM + 1)
                val row = y / (DIM + 1)

                if (column != colOld || row != rowOld) {
                    if (colOld >= 0 && rowOld >= 0)
                        grid[colOld][rowOld].setRollover(false)
                    grid[column][row].setRollover(true)
                }
                colOld = column
                rowOld = row
            }
        })
    }

    override fun paintComponent(g: Graphics) {
        g.render {
            it.color = Color.black
            it.fillRect(0, 0, width, height)

            for (i in 0 until COLUMNS) {
                for (j in 0 until ROWS) {
                    val rect = this.grid[i][j]
                    val background = rect.backgroundColor

                    if (Color.black != background) {
                        it.color = background
                        it.fillRect(i * (DIM + 1), j * (DIM + 1), DIM, DIM)
                    }
                }
            }
        }
    }
}

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        val frame = JFrame("Snake")
        frame.add(SnakePanel())
        frame.pack()
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE

        frame.isVisible = true
    }
}
