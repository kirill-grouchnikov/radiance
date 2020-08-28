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
package org.pushingpixels.tools.zodiac

import javax.swing.JFrame
import kotlin.system.exitProcess

fun interface ZodiacRobot {
    fun run(screenshotDirectory: String)
}

object RobotMain {
    /**
     * Runs the specified screenshot robot.
     *
     * @param args Should contain two strings:
     * 1. Fully qualified class name of a single screenshot robot which
     *    has a `public void run(String)` method
     * 2. Location of output screenshots
     */
    @JvmStatic
    fun main(args: Array<String>) {
        JFrame.setDefaultLookAndFeelDecorated(true)

        val mainClassName = args[0]
        val screenshotDirectory = args[1]
        val robotClass = Class.forName(mainClassName)
        val robotInstance = robotClass.getDeclaredConstructor().newInstance()
        if (robotInstance !is ZodiacRobot) {
            println("$robotClass is not a Zodiac robot")
            exitProcess(0)
        }
        robotInstance.run(screenshotDirectory)
    }
}
