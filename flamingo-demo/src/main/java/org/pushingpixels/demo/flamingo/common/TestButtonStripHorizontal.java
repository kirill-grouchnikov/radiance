/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.flamingo.common;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;
import org.pushingpixels.demo.flamingo.LocaleSwitcher;
import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.*;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandButtonStrip;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class TestButtonStripHorizontal extends JFrame {
    private Locale currLocale;

    private JPanel buttonPanel;

    private TestButtonStripHorizontal() {
        super("Tests for horizontal buttons strips");

        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        buttonPanel = getButtonPanel();
        this.add(buttonPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JComboBox localeSwitcher = LocaleSwitcher.getLocaleSwitcher((Locale selected) -> {
            currLocale = selected;
            remove(buttonPanel);
            buttonPanel = getButtonPanel();
            add(buttonPanel, BorderLayout.CENTER);
            Window window = SwingUtilities.getWindowAncestor(buttonPanel);
            window.applyComponentOrientation(ComponentOrientation.getOrientation(currLocale));
            SwingUtilities.updateComponentTreeUI(window);
        });
        controlPanel.add(localeSwitcher);
        this.add(controlPanel, BorderLayout.SOUTH);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private JPanel getButtonPanel() {
        FormLayout lm = new FormLayout("right:pref, 4dlu, left:pref, 4dlu, left:pref", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm).border(Borders.DIALOG);

        builder.append("hgap 0.5,  vgap 1.0", getStrip1(0.5, 1.0), getStrip2(0.5, 1.0));
        builder.append("hgap 0.75, vgap 1.0", getStrip1(0.75, 1.0), getStrip2(0.75, 1.0));
        builder.append("hgap 1.0,  vgap 1.0", getStrip1(1.0, 1.0), getStrip2(1.0, 1.0));

        builder.append("hgap 0.75, vgap 0.5", getStrip1(0.75, 0.5), getStrip2(0.75, 0.5));
        builder.append("hgap 0.75, vgap 0.75", getStrip1(0.75, 0.75), getStrip2(0.75, 0.75));
        builder.append("hgap 0.75, vgap 1.0", getStrip1(0.75, 1.0), getStrip2(0.75, 1.0));

        return builder.getPanel();
    }

    private JCommandButtonStrip getStrip1(double hgapScaleFactor, double vgapScaleFactor) {
        JCommandButtonStrip buttonStrip = new JCommandButtonStrip();
        buttonStrip.setHGapScaleFactor(hgapScaleFactor);
        buttonStrip.setVGapScaleFactor(vgapScaleFactor);
        buttonStrip.add(new JCommandButton("", new Format_justify_left()));
        buttonStrip.add(new JCommandButton("", new Format_justify_center()));
        buttonStrip.add(new JCommandButton("", new Format_justify_right()));
        return buttonStrip;
    }

    private JCommandButtonStrip getStrip2(double hgapScaleFactor, double vgapScaleFactor) {
        JCommandButtonStrip buttonStrip2 = new JCommandButtonStrip();
        buttonStrip2.setHGapScaleFactor(hgapScaleFactor);
        buttonStrip2.setVGapScaleFactor(vgapScaleFactor);
        buttonStrip2.add(new JCommandButton("", new Format_text_bold()));
        buttonStrip2.add(new JCommandButton("", new Format_text_italic()));
        buttonStrip2.add(new JCommandButton("", new Format_text_underline()));
        JCommandButton strike = new JCommandButton("", new Format_text_strikethrough());
        strike.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
        strike.setPopupCallback((JCommandButton commandButton) -> new SamplePopupMenu(
                commandButton.getComponentOrientation()));
        buttonStrip2.add(strike);
        return buttonStrip2;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());

            new TestButtonStripHorizontal().setVisible(true);
        });
    }
}
