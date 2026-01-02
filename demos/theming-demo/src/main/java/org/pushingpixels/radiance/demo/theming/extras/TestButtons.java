/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.extras;

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;
import org.pushingpixels.radiance.theming.extras.api.shaperpack.*;

import javax.swing.*;
import java.awt.*;

public class TestButtons extends JFrame {
    private static RadianceThemingSlices.DecorationAreaType RHINO =
        new RadianceThemingSlices.DecorationAreaType("Rhino");
    private static RadianceThemingSlices.DecorationAreaType FISH =
        new RadianceThemingSlices.DecorationAreaType("Fish");
    private static RadianceThemingSlices.DecorationAreaType RACECAR =
        new RadianceThemingSlices.DecorationAreaType("RaceCar");
    private static RadianceThemingSlices.DecorationAreaType BUTTERFLY =
        new RadianceThemingSlices.DecorationAreaType("Butterfly");
    private static RadianceThemingSlices.DecorationAreaType FOOT =
        new RadianceThemingSlices.DecorationAreaType("Foot");
    private static RadianceThemingSlices.DecorationAreaType ICECREAM =
        new RadianceThemingSlices.DecorationAreaType("IceCream");
    private static RadianceThemingSlices.DecorationAreaType STEGOSAURUS =
        new RadianceThemingSlices.DecorationAreaType("Stegosaurus");
    private static RadianceThemingSlices.DecorationAreaType DOLPHIN =
        new RadianceThemingSlices.DecorationAreaType("Dolphin");

    private JPanel getButton(String text,
        RadianceThemingSlices.DecorationAreaType decorationAreaType) {

        JPanel panel = new JPanel(new BorderLayout());
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(panel, decorationAreaType);
        JButton button = new JButton(text);
        panel.add(button, BorderLayout.CENTER);
        return panel;
    }

    public TestButtons() {
        super("Button shapes");

        FormBuilder builder = FormBuilder.create().
                columns("center:pref, 4dlu, center:pref").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        builder.add(this.getButton("rhino", RHINO)).xy(1, 1).
                add(this.getButton("big rhino", RHINO)).xy(3, 1);

        builder.add(this.getButton("fish", FISH)).xy(1, 3).
                add(this.getButton("big fish", FISH)).xy(3, 3);

        builder.add(this.getButton("racecar", RACECAR)).xy(1, 5).
                add(this.getButton("big racecar", RACECAR)).xy(3, 5);

        builder.add(this.getButton("butterfly", BUTTERFLY)).xy(1, 7).
                add(this.getButton("big butterfly", BUTTERFLY)).xy(3, 7);

        builder.add(this.getButton("foot", FOOT)).xy(1, 9).
                add(this.getButton("big foot", FOOT)).xy(3, 9);

        builder.add(this.getButton("icecream", ICECREAM)).xy(1, 11).
                add(this.getButton("big icecream", ICECREAM)).xy(3, 11);

        builder.add(this.getButton("stegosaurus", STEGOSAURUS)).xy(1, 13).
                add(this.getButton("big stegosaurus", STEGOSAURUS)).xy(3, 13);

        builder.add(this.getButton("dolphin", DOLPHIN)).xy(1, 15).
                add(this.getButton("big dolphin", DOLPHIN)).xy(3, 15);

        this.add(builder.build(), BorderLayout.CENTER);
    }

    public static void main(String... args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceSkin customSkin = new BusinessBlackSteelSkin();
            customSkin.registerButtonShaper(new RhinoButtonShaper(), RHINO);
            customSkin.registerButtonShaper(new FishButtonShaper(), FISH);
            customSkin.registerButtonShaper(new RaceCarButtonShaper(), RACECAR);
            customSkin.registerButtonShaper(new ButterflyButtonShaper(), BUTTERFLY);
            customSkin.registerButtonShaper(new FootButtonShaper(), FOOT);
            customSkin.registerButtonShaper(new IceCreamButtonShaper(), ICECREAM);
            customSkin.registerButtonShaper(new StegosaurusButtonShaper(), STEGOSAURUS);
            customSkin.registerButtonShaper(new DolphinButtonShaper(), DOLPHIN);

            RadianceThemingCortex.GlobalScope.setSkin(customSkin);
            TestButtons tb = new TestButtons();
            tb.invalidate();
            System.out.println(tb.getPreferredSize());
            tb.pack();
            tb.setLocationRelativeTo(null);
            tb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tb.setVisible(true);
        });
    }
}
