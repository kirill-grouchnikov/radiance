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
package org.pushingpixels.radiance.demo.themingapps.cookbook;

import org.pushingpixels.radiance.demo.themingapps.cookbook.panels.*;
import org.pushingpixels.radiance.demo.themingapps.cookbook.skin.CookbookSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.FocusKind;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class CookbookFrame extends JFrame {
    public static final int TITLE_PANE_PREF_HEIGHT = 40;
    public static final int FOOTER_PANE_PREF_HEIGHT = 36;

    private SingleContentPanel firstPanel;
    private SingleContentPanel secondPanel;
    private SingleContentPanel thirdPanel;
    private LightsHolderPanel lightsHolderPanel;

    public CookbookFrame() {
        super("Cookbook");

        lightsHolderPanel = new LightsHolderPanel();

        int mainPanelTopOffset = this.lightsHolderPanel.getPreferredSize().height;

        firstPanel = new CategoryListPanel(mainPanelTopOffset);
        secondPanel = new RecipeListPanel(mainPanelTopOffset);
        thirdPanel = new RecipePanel(0);

        // mark the main panels of first/second panels as CONTROL_PANE so that we have
        // continuous lights right below the lights holder panel
        ComponentOrParentChainScope.setDecorationType(firstPanel.getMainPanel(),
                DecorationAreaType.CONTROL_PANE);
        ComponentOrParentChainScope.setDecorationType(secondPanel.getMainPanel(),
                DecorationAreaType.CONTROL_PANE);

        // configure borders
        firstPanel.getTitlePanel().setBorder(new CookbookBorderRight(0.0f, 1.0f));
        firstPanel.getMainPanel().setBorder(new CookbookBorderRight());
        firstPanel.getFooterPanel().setBorder(new CookbookBorderRight());
        secondPanel.getTitlePanel()
                .setBorder(new CompoundBorder(new CookbookBorderLeft(false, true, 0.0f, 1.0f),
                        new CookbookBorderRight(0.0f, 1.0f)));
        secondPanel.getMainPanel().setBorder(new CookbookBorderLeft(true, false));
        secondPanel.getFooterPanel().setBorder(
                new CompoundBorder(new CookbookBorderLeft(true, false), new CookbookBorderRight()));
        thirdPanel.getTitlePanel().setBorder(new CookbookBorderLeft(false, true, 0.0f, 1.0f));
        thirdPanel.getFooterPanel().setBorder(new CookbookBorderLeft(true, false));

        Container contentPane = this.getContentPane();

        contentPane.add(lightsHolderPanel);
        contentPane.add(firstPanel);
        contentPane.add(secondPanel);
        contentPane.add(thirdPanel);

        contentPane.setComponentZOrder(lightsHolderPanel, 0);

        contentPane.setLayout(new LayoutManager2() {
            @Override
            public void addLayoutComponent(String name, Component comp) {
            }

            @Override
            public void addLayoutComponent(Component comp, Object constraints) {
            }

            @Override
            public void removeLayoutComponent(Component comp) {
            }

            @Override
            public float getLayoutAlignmentY(Container target) {
                return 0;
            }

            @Override
            public float getLayoutAlignmentX(Container target) {
                return 0;
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                return null;
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return preferredLayoutSize(parent);
            }

            @Override
            public Dimension maximumLayoutSize(Container target) {
                return preferredLayoutSize(target);
            }

            @Override
            public void invalidateLayout(Container target) {
            }

            @Override
            public void layoutContainer(Container parent) {
                int width = parent.getWidth();
                int height = parent.getHeight();

                Dimension firstPref = firstPanel.getPreferredSize();
                Dimension secondPref = secondPanel.getPreferredSize();

                firstPanel.setBounds(0, 0, firstPref.width, height);
                secondPanel.setBounds(firstPref.width, 0, secondPref.width, height);
                thirdPanel.setBounds(firstPref.width + secondPref.width, 0,
                        width - firstPref.width - secondPref.width, height);
                lightsHolderPanel.setBounds(0, TITLE_PANE_PREF_HEIGHT,
                        firstPref.width + secondPref.width,
                        lightsHolderPanel.getPreferredSize().height);
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(960, 536);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new CookbookSkin());
            RadianceThemingCortex.GlobalScope.setFocusKind(FocusKind.NONE);
            RadianceThemingCortex.GlobalScope.configureTitleContentGravity(
                    RadianceThemingSlices.HorizontalGravity.CENTERED,
                    RadianceThemingSlices.HorizontalGravity.SWING_DEFAULT,
                    RadianceThemingSlices.TitleIconHorizontalGravity.NONE);

            JFrame frame = new CookbookFrame();
            RadianceThemingCortex.WindowScope.extendContentIntoTitlePane(frame,
                    RadianceThemingSlices.HorizontalGravity.LEADING,
                    RadianceThemingSlices.VerticalGravity.CENTERED);
            RadianceThemingCortex.WindowScope.setPreferredTitlePaneHeight(frame, TITLE_PANE_PREF_HEIGHT);
            frame.setVisible(true);
        });
    }
}
