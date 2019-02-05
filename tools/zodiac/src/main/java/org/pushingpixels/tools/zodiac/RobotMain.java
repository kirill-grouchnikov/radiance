/*
 * Copyright (c) 2005-2019 Radiance Zodiac Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Zodiac Kirill Grouchnikov nor the names of
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
package org.pushingpixels.tools.zodiac;

import javax.swing.*;
import java.lang.reflect.Method;

/**
 * The main method for taking screenshots for Substance documentation. Expects
 * two parameter - fully qualified class name of a single screenshot robot which
 * has a <code>public void run(String)</code> method, and the location of screenshots.
 *
 * @author Kirill Grouchnikov
 */
public class RobotMain {
    /**
     * Runs the specified screenshot robot.
     *
     * @param args Should contain two string - fully qualified class name of a
     *             single screenshot robot which has a
     *             <code>public void run(String)</code> method, and the location of screenshots.
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);

        String mainClassName = args[0];
        String screenshotDirectory = args[1];
        Class<?> robotClass = Class.forName(mainClassName);
        Object robotInstance = robotClass.getDeclaredConstructor().newInstance();
        Method runMethod = robotClass.getMethod("run", new Class[] { String.class });
        runMethod.invoke(robotInstance, new Object[] { screenshotDirectory });
    }
}
