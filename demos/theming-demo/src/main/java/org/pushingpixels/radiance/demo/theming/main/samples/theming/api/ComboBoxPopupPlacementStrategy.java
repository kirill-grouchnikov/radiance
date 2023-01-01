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
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import java.awt.*;

/**
 * Test application that shows the use of the
 * {@link RadianceThemingCortex.ComponentScope#setComboBoxPopupPlacementStrategy(JComboBox, RadianceThemingSlices.PopupPlacementStrategy)} API.
 *
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.ComponentScope#setComboBoxPopupPlacementStrategy(JComboBox, RadianceThemingSlices.PopupPlacementStrategy)
 */
public class ComboBoxPopupPlacementStrategy extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public ComboBoxPopupPlacementStrategy() {
        super("Combobox popup placement strategy");

        this.setLayout(new BorderLayout());

        final JComboBox<String> cb = new JComboBox<>(
                new String[]{"Ester", "Jordi", "Jordina", "Jorge", "Sergi"});

        JPanel main = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.add(main, BorderLayout.CENTER);
        main.add(cb);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        final JComboBox<String> placementStrategyCombo = new JComboBox<>(
                new String[]{
                        "default",
                        "center start", "center end",
                        "upward start", "upward end",
                        "downward start", "downward end",
                        "endward top", "endward bottom",
                        "startward top", "startward bottom"
                });
        cb.setPrototypeDisplayValue("Jordina");
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeDisplayValue(cb,
                "Arabella Flemings Junior");
        placementStrategyCombo.addActionListener(actionEvent -> {
            Object selected = placementStrategyCombo.getSelectedItem();
            // set popup placement strategy based on the selected item
            if ("default".equals(selected))
                RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(cb, null);
            if ("center start".equals(selected))
                RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(cb,
                        RadianceThemingSlices.PopupPlacementStrategy.CenteredVertically.HALIGN_START);
            if ("center end".equals(selected))
                RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(cb,
                        RadianceThemingSlices.PopupPlacementStrategy.CenteredVertically.HALIGN_END);
            if ("upward start".equals(selected))
                RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(cb,
                        RadianceThemingSlices.PopupPlacementStrategy.Upward.HALIGN_START);
            if ("upward end".equals(selected))
                RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(cb,
                        RadianceThemingSlices.PopupPlacementStrategy.Upward.HALIGN_END);
            if ("downward start".equals(selected))
                RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(cb,
                        RadianceThemingSlices.PopupPlacementStrategy.Downward.HALIGN_START);
            if ("downward end".equals(selected))
                RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(cb,
                        RadianceThemingSlices.PopupPlacementStrategy.Downward.HALIGN_END);
            if ("endward top".equals(selected))
                RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(cb,
                        RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_TOP);
            if ("endward bottom".equals(selected))
                RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(cb,
                        RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_BOTTOM);
            if ("startward top".equals(selected))
                RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(cb,
                        RadianceThemingSlices.PopupPlacementStrategy.Startward.VALIGN_TOP);
            if ("startward bottom".equals(selected))
                RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(cb,
                        RadianceThemingSlices.PopupPlacementStrategy.Startward.VALIGN_BOTTOM);
        });

        controls.add(new JLabel("Combo popup flyout orientation"));
        controls.add(placementStrategyCombo);
        this.add(controls, BorderLayout.SOUTH);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new ComboBoxPopupPlacementStrategy().setVisible(true);
        });
    }
}
