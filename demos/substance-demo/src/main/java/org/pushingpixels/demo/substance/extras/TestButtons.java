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
package org.pushingpixels.demo.substance.extras;

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;
import org.pushingpixels.substance.extras.api.shaperpack.*;

import javax.swing.*;
import java.awt.*;

public class TestButtons extends JFrame {
    private JButton getButton(String text, SubstanceButtonShaper shaper) {
        JButton button = new JButton(text);
        SubstanceCortex.ComponentScope.setButtonShaper(button, shaper);
        return button;
    }

    public TestButtons() {
        super("Button shapes");

        FormBuilder builder = FormBuilder.create().
                columns("center:pref, 4dlu, center:pref").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        builder.add(this.getButton("rhino", new RhinoButtonShaper())).xy(1, 1).
                add(this.getButton("big rhino", new RhinoButtonShaper())).xy(3, 1);

        builder.add(this.getButton("fish", new FishButtonShaper())).xy(1, 3).
                add(this.getButton("big fish", new FishButtonShaper())).xy(3, 3);

        builder.add(this.getButton("racecar", new RaceCarButtonShaper())).xy(1, 5).
                add(this.getButton("big racecar", new RaceCarButtonShaper())).xy(3, 5);

        builder.add(this.getButton("butterfly", new ButterflyButtonShaper())).xy(1, 7).
                add(this.getButton("big butterfly", new ButterflyButtonShaper())).xy(3, 7);

        builder.add(this.getButton("foot", new FootButtonShaper())).xy(1, 9).
                add(this.getButton("big foot", new FootButtonShaper())).xy(3, 9);

        builder.add(this.getButton("icecream", new IceCreamButtonShaper())).xy(1, 11).
                add(this.getButton("big icecream", new IceCreamButtonShaper())).xy(3, 11);

        builder.add(this.getButton("stegosaurus", new StegosaurusButtonShaper())).xy(1, 13).
                add(this.getButton("big stegosaurus", new StegosaurusButtonShaper())).xy(3, 13);

        builder.add(this.getButton("dolphin", new DolphinButtonShaper())).xy(1, 15).
                add(this.getButton("big dolphin", new DolphinButtonShaper())).xy(3, 15);

        this.add(builder.build(), BorderLayout.CENTER);
    }

    public static void main(String... args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
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
