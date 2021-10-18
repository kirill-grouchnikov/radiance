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
package org.pushingpixels.radiance.laf.internal.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices.ComponentStateFacet;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.laf.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.laf.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.laf.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.laf.internal.utils.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicButtonListener;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * UI for check boxes in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceCheckBoxUI extends RadianceRadioButtonUI {
    /**
     * Prefix for the checkbox-related properties in the {@link UIManager}.
     */
    private final static String propertyPrefix = "CheckBox" + ".";

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceCheckBoxUI((JToggleButton) comp);
    }

    /**
     * Hash map for storing icons.
     */
    private static LazyResettableHashMap<ScaleAwareImageWrapperIcon> icons =
            new LazyResettableHashMap<>("RadianceCheckBoxUI");

    /**
     * Simple constructor.
     *
     * @param button The associated button.
     */
    private RadianceCheckBoxUI(JToggleButton button) {
        super(button);
    }

    @Override
    protected String getPropertyPrefix() {
        return propertyPrefix;
    }

    @Override
    protected void installDefaults(AbstractButton b) {
        super.installDefaults(b);

        button.setRolloverEnabled(true);

        Border border = b.getBorder();
        if (border == null || border instanceof UIResource) {
            b.setBorder(RadianceSizeUtils.getCheckBoxBorder(
                    RadianceSizeUtils.getComponentFontSize(b),
                    b.getComponentOrientation().isLeftToRight()));
        }
    }

    /**
     * Returns the icon that matches the current and previous states of the checkbox.
     *
     * @param button                 Button (should be {@link JCheckBox}).
     * @param stateTransitionTracker State transition tracker for the checkbox.
     * @return Matching icon.
     */
    private static Icon getIcon(JToggleButton button,
            StateTransitionTracker stateTransitionTracker) {
        double scale = RadianceCommonCortex.getScaleFactor(button);

        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateContributionMap();

        RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(button);
        RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(button);
        ComponentState currState = modelStateInfo.getCurrModelState();

        RadianceColorScheme baseFillColorScheme = RadianceColorSchemeUtilities
                .getColorScheme(button, ColorSchemeAssociationKind.MARK_BOX, currState);
        RadianceColorScheme baseMarkColorScheme = RadianceColorSchemeUtilities
                .getColorScheme(button, ColorSchemeAssociationKind.MARK, currState);
        RadianceColorScheme baseBorderColorScheme = RadianceColorSchemeUtilities
                .getColorScheme(button, ColorSchemeAssociationKind.BORDER, currState);
        float visibility = stateTransitionTracker.getFacetStrength(ComponentStateFacet.SELECTION);
        boolean isCheckMarkFadingOut = !currState.isFacetActive(ComponentStateFacet.SELECTION);
        float alpha = RadianceColorSchemeUtilities.getAlpha(button, currState);

        int fontSize = RadianceSizeUtils.getComponentFontSize(button);
        int checkMarkSize = RadianceSizeUtils.getCheckBoxMarkSize(fontSize);

        ImageHashMapKey keyBase = RadianceCoreUtilities.getScaleAwareHashKey(
                scale, fontSize, checkMarkSize,
                fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                baseFillColorScheme.getDisplayName(), baseMarkColorScheme.getDisplayName(),
                baseBorderColorScheme.getDisplayName(), visibility, isCheckMarkFadingOut,
                alpha);
        ScaleAwareImageWrapperIcon iconBase = icons.get(keyBase);
        if (iconBase == null) {
            iconBase = new ScaleAwareImageWrapperIcon(
                    RadianceImageCreator.getCheckBox(button, fillPainter, borderPainter,
                            checkMarkSize, currState, baseFillColorScheme, baseMarkColorScheme,
                            baseBorderColorScheme, visibility, isCheckMarkFadingOut,
                            alpha), scale);
            icons.put(keyBase, iconBase);
        }
        if (currState.isDisabled() || (activeStates.size() == 1)) {
            return iconBase;
        }

        BufferedImage result = RadianceCoreUtilities.getBlankImage(scale,
                iconBase.getIconWidth(), iconBase.getIconHeight());
        Graphics2D g2d = result.createGraphics();
        // draw the base layer
        iconBase.paintIcon(button, g2d, 0, 0);

        // draw other active layers
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry
                : activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            // System.out.println("Painting state " + activeState + "[curr is "
            // + currState + "] with " + activeEntry.getValue());
            if (activeState == currState) {
                continue;
            }

            float stateContribution = activeEntry.getValue().getContribution();
            if (stateContribution > 0.0f) {
                g2d.setComposite(AlphaComposite.SrcOver.derive(stateContribution));
                RadianceColorScheme fillColorScheme = RadianceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.MARK_BOX, activeState);
                RadianceColorScheme markColorScheme = RadianceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.MARK, activeState);
                RadianceColorScheme borderColorScheme = RadianceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.BORDER, activeState);

                ImageHashMapKey keyLayer = RadianceCoreUtilities.getScaleAwareHashKey(
                        scale, fontSize, checkMarkSize,
                        fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                        fillColorScheme.getDisplayName(), markColorScheme.getDisplayName(),
                        borderColorScheme.getDisplayName(), visibility);
                ScaleAwareImageWrapperIcon iconLayer = icons.get(keyLayer);
                if (iconLayer == null) {
                    iconLayer = new ScaleAwareImageWrapperIcon(
                            RadianceImageCreator.getCheckBox(button, fillPainter, borderPainter,
                                    checkMarkSize, currState, fillColorScheme, markColorScheme,
                                    borderColorScheme, visibility, isCheckMarkFadingOut, alpha),
                            scale);
                    icons.put(keyLayer, iconLayer);
                }

                iconLayer.paintIcon(button, g2d, 0, 0);
            }
        }

        g2d.dispose();
        return new ScaleAwareImageWrapperIcon(result, scale);
    }

    @Override
    protected BasicButtonListener createButtonListener(AbstractButton b) {
        return new RolloverButtonListener(b, this.stateTransitionTracker);
    }

    @Override
    public Icon getDefaultIcon() {
        if (!RadianceCoreUtilities.isCurrentLookAndFeel()) {
            return null;
        }
        return RadianceCheckBoxUI.getIcon(this.button, this.stateTransitionTracker);
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        JCheckBox checkBox = (JCheckBox) c;
        return RadianceMetricsUtilities.getPreferredCheckButtonSize(checkBox,
                ((RadianceCheckBoxUI) checkBox.getUI()).getDefaultIcon());
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        super.update(g2d, c);
        g2d.dispose();
    }
}
