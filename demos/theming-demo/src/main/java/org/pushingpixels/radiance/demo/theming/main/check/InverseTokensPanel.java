/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.check;

import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Test application panel for testing inverse tokens.
 * 
 * @author Kirill Grouchnikov
 */
public class InverseTokensPanel extends JPanel implements Deferrable, SkinDependent {
    private boolean isInitialized;

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
    }

    private static class InverseSurfacePanel extends JPanel {
        private ContainerColorTokens tokens;

        private InverseSurfacePanel(ContainerColorTokens tokens, String text) {
            this.tokens = tokens;

            this.setLayout(new BorderLayout(12, 0));
            this.setBorder(new EmptyBorder(0, 24, 0, 24));

            JLabel textLabel = new JLabel(text);
            textLabel.setOpaque(false);
            textLabel.setForeground(tokens.getInverseOnContainer());

            JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            flowPanel.setOpaque(false);
            flowPanel.setBorder(new EmptyBorder(8, 0, 8, 0));
            flowPanel.add(textLabel);
            this.add(flowPanel, BorderLayout.SOUTH);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth() - 1;
            int height = getHeight() - 1;
            int arc = 16;
            int strokeThickness = 2;

            g2d.setColor(this.tokens.getInverseContainerSurface());
            g2d.fillRoundRect(strokeThickness, strokeThickness,
                width - 2 * strokeThickness + 1, height - 2 * strokeThickness + 1, arc, arc);

            g2d.setColor(this.tokens.getInverseContainerOutline());
            g2d.setStroke(new BasicStroke(strokeThickness));
            g2d.drawRoundRect(strokeThickness, strokeThickness,
                width - 2 * strokeThickness + 1, height - 2 * strokeThickness + 1, arc, arc);

            g2d.dispose();
        }

    }

    private static class SurfacePanel extends JPanel {
        private ContainerColorTokens tokens;

        private SurfacePanel(ContainerColorTokens tokens, String text) {
            this.tokens = tokens;

            this.setLayout(new BorderLayout(12, 0));
            this.setBorder(new EmptyBorder(0, 24, 0, 24));

            JLabel textLabel = new JLabel(text);
            textLabel.setOpaque(false);
            textLabel.setForeground(tokens.getOnContainer());

            JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            flowPanel.setOpaque(false);
            flowPanel.setBorder(new EmptyBorder(8, 0, 8, 0));
            flowPanel.add(textLabel);
            this.add(flowPanel, BorderLayout.SOUTH);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth() - 1;
            int height = getHeight() - 1;
            int arc = 16;
            int strokeThickness = 2;

            g2d.setColor(this.tokens.getContainerSurface());
            g2d.fillRoundRect(strokeThickness, strokeThickness,
                width - 2 * strokeThickness + 1, height - 2 * strokeThickness + 1, arc, arc);

            g2d.setColor(this.tokens.getContainerOutline());
            g2d.setStroke(new BasicStroke(strokeThickness));
            g2d.drawRoundRect(strokeThickness, strokeThickness,
                width - 2 * strokeThickness + 1, height - 2 * strokeThickness + 1, arc, arc);

            g2d.dispose();
        }

    }

    private void makeNeutral(JPanel tokensPanel, TestFormLayoutBuilder builder) {
        ContainerColorTokens containerTokens =
            RadianceThemingCortex.ComponentScope.getCurrentSkin(tokensPanel)
                .getNeutralContainerTokens(RadianceThemingSlices.DecorationAreaType.NONE);

        builder.append(new SurfacePanel(containerTokens, "regular"));
        builder.append(new InverseSurfacePanel(containerTokens, "inverse"));
    }

    private void makeMuted(JPanel tokensPanel, TestFormLayoutBuilder builder) {
        ContainerColorTokens containerTokens =
            RadianceThemingCortex.ComponentScope.getCurrentSkin(tokensPanel)
                .getMutedContainerTokens(RadianceThemingSlices.DecorationAreaType.NONE);

        builder.append(new SurfacePanel(containerTokens, "regular"));
        builder.append(new InverseSurfacePanel(containerTokens, "inverse"));
    }

    private void makeActive(JPanel tokensPanel, TestFormLayoutBuilder builder) {
        ContainerColorTokens containerTokens =
            RadianceThemingCortex.ComponentScope.getCurrentSkin(tokensPanel)
                .getActiveContainerTokens(RadianceThemingSlices.DecorationAreaType.NONE);

        builder.append(new SurfacePanel(containerTokens, "regular"));
        builder.append(new InverseSurfacePanel(containerTokens, "inverse"));
    }

    /**
     * Creates the surface tokens panel.
     */
    public InverseTokensPanel() {
    }

    @Override
    public void reload() {
        this.removeAll();
        this.setLayout(new BorderLayout());
        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
            "right:pref, 4dlu, fill:pref:grow", 2, 30)
            .padding(Paddings.DIALOG);

        builder.appendSeparator("Neutral surfaces");
        makeNeutral(this, builder);

        builder.appendSeparator("Muted surfaces");
        makeMuted(this, builder);

        builder.appendSeparator("Active surfaces");
        makeActive(this, builder);

        JPanel everything = builder.build();
        RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(everything, 1.0);

        JPanel scrollablePanel = new ScrollablePanel();
        scrollablePanel.setLayout(new BorderLayout());
        scrollablePanel.add(everything);
        this.add(new JScrollPane(scrollablePanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), BorderLayout.CENTER);
    }

    @Override
    public synchronized void initialize() {
        this.reload();
        this.isInitialized = true;
    }
}
