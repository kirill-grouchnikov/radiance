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
package org.pushingpixels.demo.substance.main;

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.demo.substance.main.check.svg.ic_help_black_24px;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.SubstanceSlices.FocusKind;
import org.pushingpixels.substance.api.SubstanceSlices.IconThemingStrategy;
import org.pushingpixels.substance.api.skin.MagellanSkin;

import javax.swing.*;

public class ControlStatesExtendedThemed extends JFrame {
    public ControlStatesExtendedThemed() {
        super("States");

        setIconImage(RadianceLogo
                .getLogoImage(SubstanceCortex.ComponentScope.getCurrentSkin(this.getRootPane())
                        .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)));

        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 4dlu, fill:pref:grow").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        JButton regular = new JButton("sample", ic_help_black_24px.of(16, 16));
        builder.add("Regular").xy(1, 1).add(regular).xy(3, 1);

        JButton rollover = new JButton("sample", ic_help_black_24px.of(16, 16));
        rollover.getModel().setRollover(true);
        builder.add("Rollover").xy(1, 3).add(rollover).xy(3, 3);

        JButton selected = new JButton("sample", ic_help_black_24px.of(16, 16));
        selected.getModel().setSelected(true);
        builder.add("Selected").xy(1, 5).add(selected).xy(3, 5);

        JButton rolloverSelected = new JButton("sample", ic_help_black_24px.of(16, 16));
        rolloverSelected.getModel().setRollover(true);
        rolloverSelected.getModel().setSelected(true);
        builder.add("Rollover selected").xy(1, 7).add(rolloverSelected).xy(3, 7);

        JButton pressed = new JButton("sample", ic_help_black_24px.of(16, 16));
        pressed.getModel().setArmed(true);
        pressed.getModel().setPressed(true);
        builder.add("Pressed").xy(1, 9).add(pressed).xy(3, 9);

        JButton pressedSelected = new JButton("sample", ic_help_black_24px.of(16, 16));
        pressedSelected.getModel().setArmed(true);
        pressedSelected.getModel().setPressed(true);
        pressedSelected.getModel().setSelected(true);
        builder.add("Pressed selected").xy(1, 11).add(pressedSelected).xy(3, 11);

        this.add(builder.build());

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);

            SubstanceCortex.GlobalScope.setFocusKind(FocusKind.NONE);
            SubstanceCortex.GlobalScope.setSkin(new MagellanSkin());
            SubstanceCortex.GlobalScope.setIconThemingStrategy(IconThemingStrategy.FOLLOW_FOREGROUND);

            new ControlStatesExtendedThemed().setVisible(true);
        });
    }

}
