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

import org.pushingpixels.demo.flamingo.LocaleSwitcher;
import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.flamingo.api.common.JCommandButtonPanel;
import org.pushingpixels.flamingo.api.common.JCommandButtonPanel.LayoutKind;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;

public class TestCommandButtonPanel extends JFrame {
    private ResourceBundle resourceBundle;

    private Locale currLocale;

    private JScrollPane scroller;

    private JCommandButtonPanel buttonPanel;

    private TestCommandButtonPanel() {
        super("Command button panel test");
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle.getBundle(
                "org.pushingpixels.demo.flamingo.resource.Resources", currLocale);

        buttonPanel = QuickStylesPanel.getQuickStylesPanel(resourceBundle, currLocale);
        scroller = new JScrollPane(buttonPanel);

        add(scroller, BorderLayout.CENTER);
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        final JCheckBox toShowGroupLabels = new JCheckBox("show group labels");
        toShowGroupLabels.setSelected(
                buttonPanel.getPresentationModel().isToShowGroupLabels());
        toShowGroupLabels.addActionListener((ActionEvent e) -> {
            buttonPanel.getPresentationModel().setToShowGroupLabels(
                    toShowGroupLabels.isSelected());
            scroller.revalidate();
        });
        controlPanel.add(toShowGroupLabels);

        final JCheckBox isRowFillLayout = new JCheckBox("use row fill layout");
        isRowFillLayout.setSelected(
                buttonPanel.getPresentationModel().getLayoutKind() == LayoutKind.ROW_FILL);
        isRowFillLayout.addActionListener((ActionEvent e) ->
                buttonPanel.getPresentationModel().setLayoutKind(
                        isRowFillLayout.isSelected() ? LayoutKind.ROW_FILL : LayoutKind
                                .COLUMN_FILL));
        controlPanel.add(isRowFillLayout);

        JComboBox localeSwitcher = LocaleSwitcher.getLocaleSwitcher((Locale selected) -> {
            currLocale = selected;
            resourceBundle = ResourceBundle.getBundle(
                    "org.pushingpixels.demo.flamingo.resource.Resources", currLocale);
            remove(scroller);

            buttonPanel = QuickStylesPanel.getQuickStylesPanel(resourceBundle, currLocale);
            scroller = new JScrollPane(buttonPanel);
            add(scroller, BorderLayout.CENTER);
            Window window = SwingUtilities.getWindowAncestor(buttonPanel);
            window.applyComponentOrientation(ComponentOrientation.getOrientation(currLocale));
            SwingUtilities.updateComponentTreeUI(window);
        });
        controlPanel.add(localeSwitcher);

        add(controlPanel, BorderLayout.SOUTH);
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());
            new TestCommandButtonPanel().setVisible(true);
        });
    }
}
