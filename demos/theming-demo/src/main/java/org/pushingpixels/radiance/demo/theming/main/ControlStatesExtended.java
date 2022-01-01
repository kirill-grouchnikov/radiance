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
package org.pushingpixels.radiance.demo.theming.main;

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.extras.api.skinpack.OfficeSilver2007Skin;

import javax.swing.*;

public class ControlStatesExtended extends JFrame {
    public ControlStatesExtended() {
        super("States");

        setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.ComponentScope.getCurrentSkin(this.getRootPane())
                        .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)));

        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 4dlu, fill:pref:grow").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        JButton regular = new JButton("sample");
        builder.add("Regular").xy(1, 1).add(regular).xy(3, 1);

        JButton rollover = new JButton("sample");
        rollover.getModel().setRollover(true);
        builder.add("Rollover").xy(1, 3).add(rollover).xy(3, 3);

        JButton selected = new JButton("sample");
        selected.getModel().setSelected(true);
        builder.add("Selected").xy(1, 5).add(selected).xy(3, 5);

        JButton rolloverSelected = new JButton("sample");
        rolloverSelected.getModel().setRollover(true);
        rolloverSelected.getModel().setSelected(true);
        builder.add("Rollover selected").xy(1, 7).add(rolloverSelected).xy(3, 7);

        JButton pressed = new JButton("sample");
        pressed.getModel().setArmed(true);
        pressed.getModel().setPressed(true);
        builder.add("Pressed").xy(1, 9).add(pressed).xy(3, 9);

        JButton pressedSelected = new JButton("sample");
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
            RadianceThemingCortex.GlobalScope.setFocusKind(RadianceThemingSlices.FocusKind.NONE);
            RadianceThemingCortex.GlobalScope.setSkin(new OfficeSilver2007Skin());
            new ControlStatesExtended().setVisible(true);
        });
    }

}
