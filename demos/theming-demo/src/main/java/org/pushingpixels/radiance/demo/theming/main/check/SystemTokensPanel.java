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
import org.pushingpixels.radiance.common.api.font.FontSet;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.demo.theming.main.check.svg.*;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Test application panel for testing system tokens.
 * 
 * @author Kirill Grouchnikov
 */
public class SystemTokensPanel extends JPanel implements Deferrable, SkinDependent {
    private boolean isInitialized;

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
    }

    private static class SamplePanel extends JPanel {
        private ContainerColorTokens containerTokens;

        private SamplePanel(JLabel textPrimary, JLabel textSecondary,
            RadianceIcon iconPrimary, RadianceIcon iconSecondary,
            ContainerColorTokens containerTokens) {

            this.containerTokens = containerTokens;

            this.setLayout(new BorderLayout(12, 0));
            this.setBorder(new EmptyBorder(8, 16, 8, 16));

            this.add(new JLabel(iconPrimary), BorderLayout.LINE_START);
            this.add(new JLabel(iconSecondary), BorderLayout.LINE_END);

            JPanel labelsPanel = new JPanel();
            BoxLayout labelsLayout = new BoxLayout(labelsPanel, BoxLayout.Y_AXIS);
            labelsPanel.setLayout(labelsLayout);
            labelsPanel.setOpaque(false);

            labelsPanel.add(textPrimary);
            labelsPanel.add(textSecondary);

            this.add(labelsPanel, BorderLayout.CENTER);
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

            Color gradientTop = containerTokens.isDark()
                ? containerTokens.getContainerSurfaceHigh() :
                containerTokens.getContainerSurfaceLow();
            Color gradientBottom = containerTokens.isDark()
                ? containerTokens.getContainerSurfaceLow() :
                containerTokens.getContainerSurfaceHigh();

            MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0, height,
                new float[] {0.0f, 1.0f},
                new Color[] {gradientTop, gradientBottom},
                MultipleGradientPaint.CycleMethod.REPEAT);
            g2d.setPaint(gradient);
            g2d.fillRoundRect(strokeThickness, strokeThickness,
                width - 2 * strokeThickness + 1, height - 2 * strokeThickness + 1, arc, arc);

            g2d.setColor(containerTokens.getContainerOutlineVariant());
            g2d.setStroke(new BasicStroke(strokeThickness));
            g2d.drawRoundRect(1, 1, width - 2, height - 2, arc, arc);

            g2d.dispose();
        }

        @Override
        public Dimension getPreferredSize() {
            Dimension min = super.getPreferredSize();
            return new Dimension(300, min.height);
        }
    }

    private void makeNeutral(JPanel tokensPanel, TestFormLayoutBuilder builder,
        ContainerColorTokens systemTokens, RadianceIcon iconPrimary,
        String textPrimary, String textSecondary) {

        ContainerColorTokens containerTokens =
            RadianceThemingCortex.ComponentScope.getCurrentSkin(tokensPanel)
                .getNeutralContainerTokens(RadianceThemingSlices.DecorationAreaType.NONE);

        FontSet fontSet = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet();
        Font controlFont = fontSet.getControlFont();

        JLabel textPrimaryLabel = new JLabel(textPrimary);
        textPrimaryLabel.setForeground(containerTokens.getOnContainer());
        textPrimaryLabel.setFont(controlFont.deriveFont(controlFont.getSize2D() + 2f));

        JLabel textSecondaryLabel = new JLabel(textSecondary);
        textSecondaryLabel.setForeground(containerTokens.getOnContainerVariant());
        textSecondaryLabel.setFont(controlFont.deriveFont(controlFont.getSize2D() + 1f));

        iconPrimary.setColorFilter(color -> systemTokens.getContainerSurfaceHighest());

        RadianceIcon iconSecondary = close_16dp.of(12, 12);
        iconSecondary.setColorFilter(color -> containerTokens.getOnContainerVariant());

        JPanel neutral = new SamplePanel(textPrimaryLabel, textSecondaryLabel, iconPrimary,
            iconSecondary, containerTokens);

        builder.append(neutral);
    }

    private void makeTonal(JPanel tokensPanel, TestFormLayoutBuilder builder,
        ContainerColorTokens systemTokens, RadianceIcon iconPrimary,
        String textPrimary, String textSecondary) {

        FontSet fontSet = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet();
        Font controlFont = fontSet.getControlFont();

        JLabel textPrimaryLabel = new JLabel(textPrimary);
        textPrimaryLabel.setForeground(systemTokens.getOnContainer());
        textPrimaryLabel.setFont(controlFont.deriveFont(controlFont.getSize2D() + 2f));

        JLabel textSecondaryLabel = new JLabel(textSecondary);
        textSecondaryLabel.setForeground(systemTokens.getOnContainerVariant());
        textSecondaryLabel.setFont(controlFont.deriveFont(controlFont.getSize2D() + 1f));

        iconPrimary.setColorFilter(color -> systemTokens.getOnContainer());

        RadianceIcon iconSecondary = close_16dp.of(12, 12);
        iconSecondary.setColorFilter(color -> systemTokens.getOnContainer());

        JPanel tonal = new SamplePanel(textPrimaryLabel, textSecondaryLabel, iconPrimary,
            iconSecondary, systemTokens);

        builder.append(tonal);
    }

    private void makeInverse(JPanel tokensPanel, TestFormLayoutBuilder builder,
        ContainerColorTokens systemTokens, RadianceIcon iconPrimary,
        String textPrimary, String textSecondary) {

        FontSet fontSet = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet();
        Font controlFont = fontSet.getControlFont();

        JLabel textPrimaryLabel = new JLabel(textPrimary);
        textPrimaryLabel.setForeground(systemTokens.getOnContainer());
        textPrimaryLabel.setFont(controlFont.deriveFont(controlFont.getSize2D() + 2f));

        JLabel textSecondaryLabel = new JLabel(textSecondary);
        textSecondaryLabel.setForeground(systemTokens.getOnContainerVariant());
        textSecondaryLabel.setFont(controlFont.deriveFont(controlFont.getSize2D() + 1f));

        iconPrimary.setColorFilter(color -> systemTokens.getOnContainer());

        RadianceIcon iconSecondary = close_16dp.of(12, 12);
        iconSecondary.setColorFilter(color -> systemTokens.getOnContainer());

        JPanel primary = new SamplePanel(textPrimaryLabel, textSecondaryLabel, iconPrimary,
            iconSecondary, systemTokens);

        builder.append(primary);
    }

    private void populateNeutrals(JPanel tokensPanel, TestFormLayoutBuilder builder) {
        builder.appendSeparator("Neutral");

        RadianceSkin skin = RadianceThemingCortex.ComponentScope.getCurrentSkin(tokensPanel);

        makeNeutral(tokensPanel, builder,
            skin.getInverseSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.INFO),
            info_24dp_fill.of(24, 24),
            "Update available",
            "Click to install version 8.0");

        makeNeutral(tokensPanel, builder,
            skin.getInverseSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.SUCCESS),
            check_24dp_fill.of(24, 24),
            "Connection established",
            "Streaming content");

        makeNeutral(tokensPanel, builder,
            skin.getInverseSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.WARNING),
            warning_24dp_fill.of(24, 24),
            "Connection lost",
            "Connect to WiFi to continue");

        makeNeutral(tokensPanel, builder,
            skin.getInverseSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.ERROR),
            error_24dp_fill.of(24, 24),
            "Access denied",
            "Check your permissions");
    }

    private void populateTonals(JPanel tokensPanel, TestFormLayoutBuilder builder) {
        builder.appendSeparator("Tonal");

        RadianceSkin skin = RadianceThemingCortex.ComponentScope.getCurrentSkin(tokensPanel);

        makeTonal(tokensPanel, builder,
            skin.getSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.INFO),
            info_24dp_outline.of(24, 24),
            "Update available",
            "Click to install version 8.0");

        makeTonal(tokensPanel, builder,
            skin.getSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.SUCCESS),
            check_24dp_outline.of(24, 24),
            "Connection established",
            "Streaming content");

        makeTonal(tokensPanel, builder,
            skin.getSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.WARNING),
            warning_24dp_outline.of(24, 24),
            "Connection lost",
            "Connect to WiFi to continue");

        makeTonal(tokensPanel, builder,
            skin.getSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.ERROR),
            error_24dp_outline.of(24, 24),
            "Access denied",
            "Check your permissions");
    }

    private void populateInverse(JPanel tokensPanel, TestFormLayoutBuilder builder) {
        builder.appendSeparator("Inverse");

        RadianceSkin skin = RadianceThemingCortex.ComponentScope.getCurrentSkin(tokensPanel);

        makeInverse(tokensPanel, builder,
            skin.getInverseSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.INFO),
            info_24dp_outline.of(24, 24),
            "Update available",
            "Click to install version 8.0");

        makeInverse(tokensPanel, builder,
            skin.getInverseSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.SUCCESS),
            check_24dp_outline.of(24, 24),
            "Connection established",
            "Streaming content");

        makeInverse(tokensPanel, builder,
            skin.getInverseSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.WARNING),
            warning_24dp_outline.of(24, 24),
            "Connection lost",
            "Connect to WiFi to continue");

        makeInverse(tokensPanel, builder,
            skin.getInverseSystemContainerTokens(tokensPanel,
                RadianceThemingSlices.SystemContainerType.ERROR),
            error_24dp_outline.of(24, 24),
            "Access denied",
            "Check your permissions");
    }

    /**
     * Creates the system tokens panel.
     */
    public SystemTokensPanel() {
    }

    @Override
    public void reload() {
        this.removeAll();
        this.setLayout(new BorderLayout());
        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
            "right:pref, 4dlu, fill:pref:grow", 2, 30)
            .padding(Paddings.DIALOG);

        populateNeutrals(this, builder);
        builder.nextLine();
        populateTonals(this, builder);
        builder.nextLine();
        populateInverse(this, builder);
        builder.nextLine();

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
