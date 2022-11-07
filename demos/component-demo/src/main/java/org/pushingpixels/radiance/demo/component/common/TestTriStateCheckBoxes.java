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
package org.pushingpixels.radiance.demo.component.common;

import org.pushingpixels.radiance.common.api.model.TriStateButtonModel;
import org.pushingpixels.radiance.component.api.common.model.TriStateCheckBoxContentModel;
import org.pushingpixels.radiance.component.api.common.model.TriStateCheckboxPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.TriStateCheckBoxProjection;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.demo.theming.main.check.selector.RadianceLocaleSelector;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.MarinerSkin;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class TestTriStateCheckBoxes extends JFrame {
    private Locale currLocale;

    private TriStateCheckBoxContentModel contentModel;

    private TestTriStateCheckBoxes() {
        super("Tests for tri-state checkboxes");

        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        currLocale = Locale.getDefault();

        this.contentModel = TriStateCheckBoxContentModel.builder()
                .setText("tri-state box")
                .setSelectionState(TriStateButtonModel.SelectionState.ON)
                .setSelectionChangeListener(e ->
                        System.out.println("New selection state is " + e.getSelectionStateChange()))
                .build();

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(getBox());
        this.add(panel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        controlPanel.add(new RadianceLocaleSelector(false, selected -> {
            currLocale = selected;

            Window window = SwingUtilities.getWindowAncestor(panel);
            window.applyComponentOrientation(ComponentOrientation.getOrientation(currLocale));
            SwingUtilities.updateComponentTreeUI(window);
        }));

        JButton changeText = new JButton("change text");
        changeText.addActionListener(e -> contentModel.setText("new text!"));
        controlPanel.add(changeText);

        JCheckBox isEnabled = new JCheckBox("is enabled");
        isEnabled.setSelected(true);
        isEnabled.addChangeListener(e -> contentModel.setEnabled(isEnabled.isSelected()));
        controlPanel.add(isEnabled);

        this.add(controlPanel, BorderLayout.SOUTH);

        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private JComponent getBox() {
        return new TriStateCheckBoxProjection(
                this.contentModel,
                TriStateCheckboxPresentationModel.builder().build()
        ).buildComponent();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new MarinerSkin());

            new TestTriStateCheckBoxes().setVisible(true);
        });
    }
}
