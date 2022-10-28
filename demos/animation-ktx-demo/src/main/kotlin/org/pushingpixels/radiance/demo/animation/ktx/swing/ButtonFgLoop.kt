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
import org.pushingpixels.radiance.swing.ktx.addDelayedMouseListener
import org.pushingpixels.radiance.animation.ktx.RadianceComponent
import org.pushingpixels.radiance.animation.ktx.componentTimeline
import org.pushingpixels.radiance.animation.api.Timeline
import java.awt.Color
import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.WindowConstants

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        val frame = JFrame()
        frame.layout = FlowLayout()

        // Configure a button with componentTimeline that loops the foreground animation while the
        // mouse is over the button, and cancels the animation at cycle break when the mouse
        // moves out.
        val buttonWithCancel = JButton("button w/cancel")
        buttonWithCancel.foreground = Color.blue

        val timelineWithCancel = buttonWithCancel.componentTimeline {
            duration = 1500
            property(RadianceComponent.foreground from buttonWithCancel.foreground to Color.red)
        }

        buttonWithCancel.addDelayedMouseListener(
                onMouseEntered = { timelineWithCancel.playLoop(Timeline.RepeatBehavior.REVERSE) },
                onMouseExited = { timelineWithCancel.cancelAtCycleBreak() })
        frame.add(buttonWithCancel)

        // Configure a button with componentTimeline that loops the foreground animation while the
        // mouse is over the button, and reverses the animation when the mouse moves out.
        val buttonWithRevert = JButton("button w/revert")
        buttonWithRevert.foreground = Color.blue

        val timelineWithRevert = buttonWithRevert.componentTimeline {
            duration = 1500
            property(RadianceComponent.foreground from buttonWithRevert.foreground to Color.red)
        }

        buttonWithRevert.addDelayedMouseListener(
                onMouseEntered = { timelineWithRevert.playLoop(Timeline.RepeatBehavior.REVERSE) },
                onMouseExited = { timelineWithRevert.playReverse() })
        frame.add(buttonWithRevert)

        frame.setSize(400, 200)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
