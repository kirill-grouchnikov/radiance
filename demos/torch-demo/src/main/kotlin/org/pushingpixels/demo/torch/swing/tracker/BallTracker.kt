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
package org.pushingpixels.demo.torch.swing.tracker

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.torch.componentTimeline
import org.pushingpixels.torch.from
import org.pushingpixels.torch.repaintTimeline
import org.pushingpixels.trident.api.Timeline
import org.pushingpixels.trident.api.Timeline.RepeatBehavior
import org.pushingpixels.trident.api.ease.Linear
import org.pushingpixels.trident.api.ease.Sine
import org.pushingpixels.trident.api.ease.Spline
import org.pushingpixels.trident.api.ease.TimelineEase
import java.awt.Component
import java.awt.FlowLayout
import java.awt.GridLayout
import javax.swing.*

data class Options(val description: String, val ease: TimelineEase)

fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        var timelineBallFalling: Timeline? = null

        val frame = JFrame("Ball tracker")

        frame.layout = GridLayout(2, 1)
        val main = JPanel(GridLayout(1, 2))
        val visualizer = TimelineVisualizer()

        frame.add(main)
        frame.add(visualizer)

        val controls = JPanel(FlowLayout())
        main.add(controls)

        val ballPanel = BallPanel()
        main.add(ballPanel)

        val eases = arrayOf(Options("1. Linear", Linear()), Options("2. Sine", Sine()),
                Options("3. Spline (0.1, 0.0)-(0.9,1.0)", Spline(0.1f, 0.0f, 0.9f, 1.0f)),
                Options("4. Spline (0.2, 0.0)-(0.8,1.0)", Spline(0.2f, 0.0f, 0.8f, 1.0f)),
                Options("5. Spline (0.5, 0.0)-(0.5,1.0)", Spline(0.5f, 0.0f, 0.5f, 1.0f)),
                Options("6. Spline (0.8, 0.0)-(0.2,1.0)", Spline(0.8f, 0.0f, 0.2f, 1.0f)),
                Options("7. Spline (0.9, 0.0)-(0.1,1.0)", Spline(0.9f, 0.0f, 0.1f, 1.0f)),
                Options("8. Spline (1.0, 0.0)-(0.9,1.0)", Spline(1.0f, 0.0f, 0.9f, 1.0f)))
        val easeModel = DefaultComboBoxModel(eases)
        val easeCombo = JComboBox(easeModel)
        easeCombo.renderer = object : DefaultListCellRenderer() {
            override fun getListCellRendererComponent(list: JList<*>, value: Any?, index: Int,
                    isSelected: Boolean, cellHasFocus: Boolean): Component {
                return super.getListCellRendererComponent(list,
                        (value as Options).description, index, isSelected,
                        cellHasFocus)
            }
        }
        easeCombo.selectedIndex = 0
        controls.add(easeCombo)

        val msToSkip = JTextField("0", 6)
        controls.add(JLabel("to skip"))
        controls.add(msToSkip)

        val msInitialDelay = JTextField("500", 6)
        controls.add(JLabel("initial delay"))
        controls.add(msInitialDelay)

        val msCycleDelay = JTextField("0", 6)
        controls.add(JLabel("cycle delay"))
        controls.add(msCycleDelay)

        val runTimeline = JButton("run")
        runTimeline.addActionListener {
            if (timelineBallFalling != null) {
                timelineBallFalling!!.cancel()
            }

            timelineBallFalling = ballPanel.componentTimeline {
                property(ballPanel::ballY from BallPanel.RADIUS to ballPanel.height - BallPanel.RADIUS)
                duration = 2000
                initialDelay = Integer.parseInt(msInitialDelay.text).toLong()
                cycleDelay = Integer.parseInt(msCycleDelay.text).toLong()
                ease = (easeCombo.selectedItem as Options).ease
                onTimelinePulse { durationFraction, timelinePosition ->
                    // add a fading dot to visualize the timeline interpolation behavior
                    visualizer.addDot(durationFraction, timelinePosition)
                }
                onTimelineStateChanged { oldState, newState, _, _ ->
                    println("State change: " + oldState.name + " -> " + newState.name)
                }
            }

            val toSkip = java.lang.Long.parseLong(msToSkip.text)
            if (toSkip > 0) {
                timelineBallFalling!!.playLoopSkipping(RepeatBehavior.REVERSE, toSkip)
            } else {
                timelineBallFalling!!.playLoop(RepeatBehavior.REVERSE)
            }
        }

        val cancelTimeline = JButton("cancel")
        cancelTimeline.addActionListener {
            if (timelineBallFalling != null) {
                timelineBallFalling!!.cancelAtCycleBreak()
            }
        }

        val suspendTimeline = JButton("suspend")
        suspendTimeline.addActionListener {
            if (timelineBallFalling != null) {
                timelineBallFalling!!.suspend()
            }
        }

        val resumeTimeline = JButton("resume")
        resumeTimeline.addActionListener {
            if (timelineBallFalling != null) {
                timelineBallFalling!!.resume()
            }
        }

        controls.add(runTimeline)
        controls.add(cancelTimeline)
        controls.add(suspendTimeline)
        controls.add(resumeTimeline)

        frame.repaintTimeline().playLoop(RepeatBehavior.LOOP)

        frame.setSize(500, 600)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
