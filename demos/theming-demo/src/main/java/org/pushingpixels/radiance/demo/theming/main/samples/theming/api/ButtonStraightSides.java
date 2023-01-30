/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.samples.theming.api;

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.Side;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import java.awt.*;
import java.util.EnumSet;

/**
 * Test application that shows the use of the
 * {@link RadianceThemingCortex.ComponentScope#setButtonStraightSide(javax.swing.JComponent, Side)} and
 * {@link RadianceThemingCortex.ComponentScope#setButtonStraightSides(javax.swing.JComponent, java.util.Set)}
 * APIs.
 * 
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.ComponentScope#setButtonStraightSide(javax.swing.JComponent, Side)
 * @see RadianceThemingCortex.ComponentScope#setButtonStraightSides(javax.swing.JComponent, java.util.Set)
 */
public class ButtonStraightSides extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public ButtonStraightSides() {
        super("Buttons with straight sides");

        this.setLayout(new FlowLayout());

        JButton buttonA = new JButton("leading only");
        // Mark button to have straight leading side
        // using side constant
        RadianceThemingCortex.ComponentScope.setButtonStraightSide(buttonA, Side.LEADING);

        JButton buttonB = new JButton("trailing only");
        // Mark button to have straight trailing side
        // using side constant
        RadianceThemingCortex.ComponentScope.setButtonStraightSide(buttonB, Side.TRAILING);

        JButton buttonC = new JButton("leading+top");
        // Mark button to have straight leading and top sides
        // using set of side constants
        RadianceThemingCortex.ComponentScope.setButtonStraightSides(buttonC,
                EnumSet.of(Side.LEADING, Side.TOP));

        JButton buttonD = new JButton("trailing+bottom");
        // Mark button to have straight trailing and bottom sides
        // using set of side constants
        RadianceThemingCortex.ComponentScope.setButtonStraightSides(buttonD,
                EnumSet.of(Side.TRAILING, Side.BOTTOM));

        this.add(buttonA);
        this.add(buttonB);
        this.add(buttonC);
        this.add(buttonD);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
                RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
                new ButtonStraightSides().setVisible(true);
        });
    }
}
