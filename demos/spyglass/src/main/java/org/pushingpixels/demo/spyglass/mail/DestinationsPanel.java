/*
 * Copyright (c) 2005-2018 Spyglass Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Spyglass Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.spyglass.mail;

import com.jgoodies.forms.builder.FormBuilder;
import org.pushingpixels.demo.spyglass.mail.svg.*;
import org.pushingpixels.neon.icon.NeonIcon;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.*;
import org.pushingpixels.substance.api.colorscheme.*;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.highlight.SubstanceHighlightPainter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Main destinations panel (leftmost under LTR). In the real app this will probably be a JList
 * backed by an adapter and custom renderer(s).
 */
public class DestinationsPanel extends PanelWithRightLine {
    public DestinationsPanel(Window window) {
        SubstanceSkin currentSkin = SubstanceCortex.GlobalScope.getCurrentSkin();

        ComponentOrParentChainScope.setDecorationType(this, DecorationAreaType.GENERAL);
        this.setRightLineColor(currentSkin.getColorScheme(DecorationAreaType.GENERAL,
                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED).getDarkColor());
        this.setLayout(new VerticalStackLayout());

        // Get the color schemes for colorizing the icons.
        Color mainSelectorIconColor = currentSkin
                .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                        ColorSchemeAssociationKind.FILL, ComponentState.ROLLOVER_UNSELECTED)
                .getDarkColor();
        Color mainSelectorIconTitleColor = currentSkin
                .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                        ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)
                .getForegroundColor();

        this.add(getRefreshAction(window,
                ic_refresh_black_24px.of(12, 12).colorize(mainSelectorIconTitleColor)));
        this.add(getMainLabel("MAIL"));

        HighlightablePanel inboxSelector = getSelectorDestinationRow(
                ic_inbox_black_24px.of(16, 16).colorize(mainSelectorIconColor), "Inbox", 6);
        // Emulate selected state for this row. In the real app this will probably be a
        // combination of highlights built into the JList renderers + highlight color schemes
        // configured on the application skin.
        inboxSelector.setSelected();
        this.add(inboxSelector);

        this.add(getSelectorDestinationRow(
                ic_send_black_24px.of(16, 16).colorize(mainSelectorIconColor), "Sent", 3));
        this.add(getSelectorDestinationRow(
                ic_watch_later_black_24px.of(16, 16).colorize(mainSelectorIconColor), "Send later",
                5));
        this.add(getSelectorDestinationRow(
                ic_drafts_black_24px.of(16, 16).colorize(mainSelectorIconColor), "Drafts", -1));
        this.add(getSelectorDestinationRow(
                ic_star_border_black_24px.of(16, 16).colorize(mainSelectorIconColor), "Starred",
                -1));
        this.add(getSelectorDestinationRow(
                ic_delete_black_24px.of(16, 16).colorize(mainSelectorIconColor), "Trash", -1));

        this.setPreferredSize(new Dimension(200, 0));
    }

    // This class emulates the highlights on rows. In the real app this will probably
    // be an extension of SubstanceDefaultListCellRenderer.
    private static class HighlightablePanel extends JPanel {
        private boolean isSelected;

        public HighlightablePanel(JPanel content) {
            content.setOpaque(false);
            setLayout(new BorderLayout());
            add(content, BorderLayout.CENTER);
        }

        public void setSelected() {
            isSelected = true;
            setOpaque(!isSelected);
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (isSelected) {
                SubstanceSkin skin = SubstanceCortex.ComponentScope.getCurrentSkin(this);
                SubstanceHighlightPainter highlightPainter = skin.getHighlightPainter();
                SubstanceBorderPainter highlightBorderPainter = skin.getHighlightBorderPainter();
                if (highlightBorderPainter == null) {
                    highlightBorderPainter = skin.getBorderPainter();
                }
                SubstanceColorScheme fillScheme = new SunGlareColorScheme();
                SubstanceColorScheme borderScheme = new TerracottaColorScheme();

                int width = this.getWidth();
                int height = this.getHeight();

                Graphics2D g2d = (Graphics2D) g.create();
                highlightPainter.paintHighlight(g2d, this, width, height, fillScheme);
                highlightBorderPainter.paintBorder(g2d, this, width, height,
                        new Rectangle2D.Float(0, 0, width, height), null, borderScheme);
                g2d.dispose();
            }

            super.paintComponent(g);
        }
    }

    private HighlightablePanel getSelectorDestinationRow(NeonIcon icon, String title,
            int count) {
        FormBuilder builder = FormBuilder.create().
                columns("center:pref, 4dlu, fill:pref:grow, 4dlu, center:pref").
                rows("p").
                padding(new EmptyBorder(8, 8, 8, 8));

        builder.add(new JLabel(icon)).xy(1, 1);
        builder.add(new JLabel(title)).xy(3, 1);
        builder.add(new JLabel(count > 0 ? Integer.toString(count) : "")).xy(5, 1);

        HighlightablePanel result = new HighlightablePanel(builder.build());
        return result;
    }

    private JPanel getMainLabel(String title) {
        FormBuilder builder = FormBuilder.create().
                columns("fill:pref:grow").
                rows("p").
                padding(new EmptyBorder(8, 8, 8, 8));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(SubstanceCortex.GlobalScope.getFontPolicy().getFontSet(null)
                .getControlFont().deriveFont(Font.BOLD));
        builder.add(titleLabel).xy(1, 1);

        JPanel result = builder.build();
        return result;
    }

    private JPanel getRefreshAction(Window window, NeonIcon icon) {
        FormBuilder builder = FormBuilder.create().
                columns("right:pref:grow").
                rows("p").
                padding(new EmptyBorder(12, 8, 12, 8));

        // Use Substance API to create a button that has consistent look with the
        // title pane control buttons
        JButton refreshButton = SubstanceCortex.WindowScope.createTitlePaneControlButton(window);

        refreshButton.setIcon(icon);
        refreshButton.setToolTipText("Refresh mail");
        builder.add(refreshButton).xy(1, 1);

        JPanel result = builder.build();
        return result;
    }
}
