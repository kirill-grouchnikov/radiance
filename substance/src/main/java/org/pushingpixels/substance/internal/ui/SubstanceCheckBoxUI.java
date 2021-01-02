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
package org.pushingpixels.substance.internal.ui;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicButtonListener;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * UI for check boxes in <b>Substance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceCheckBoxUI extends SubstanceRadioButtonUI {
    /**
     * Prefix for the checkbox-related properties in the {@link UIManager}.
     */
    private final static String propertyPrefix = "CheckBox" + ".";

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceCheckBoxUI((JToggleButton) comp);
    }

    /**
     * Hash map for storing icons.
     */
    private static LazyResettableHashMap<ImageWrapperIcon> icons = new LazyResettableHashMap<>(
            "SubstanceCheckBoxUI");

    /**
     * Simple constructor.
     *
     * @param button The associated button.
     */
    private SubstanceCheckBoxUI(JToggleButton button) {
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
            b.setBorder(SubstanceSizeUtils.getCheckBoxBorder(
                    SubstanceSizeUtils.getComponentFontSize(b),
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
        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateContributionMap();

        SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(button);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(button);
        ComponentState currState = modelStateInfo.getCurrModelState();

        SubstanceColorScheme baseFillColorScheme = SubstanceColorSchemeUtilities
                .getColorScheme(button, ColorSchemeAssociationKind.MARK_BOX, currState);
        SubstanceColorScheme baseMarkColorScheme = SubstanceColorSchemeUtilities
                .getColorScheme(button, ColorSchemeAssociationKind.MARK, currState);
        SubstanceColorScheme baseBorderColorScheme = SubstanceColorSchemeUtilities
                .getColorScheme(button, ColorSchemeAssociationKind.BORDER, currState);
        float visibility = stateTransitionTracker.getFacetStrength(ComponentStateFacet.SELECTION);
        boolean isCheckMarkFadingOut = !currState.isFacetActive(ComponentStateFacet.SELECTION);
        float alpha = SubstanceColorSchemeUtilities.getAlpha(button, currState);

        int fontSize = SubstanceSizeUtils.getComponentFontSize(button);
        int checkMarkSize = SubstanceSizeUtils.getCheckBoxMarkSize(fontSize);

        HashMapKey keyBase = SubstanceCoreUtilities.getHashKey(fontSize, checkMarkSize,
                fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                baseFillColorScheme.getDisplayName(), baseMarkColorScheme.getDisplayName(),
                baseBorderColorScheme.getDisplayName(), visibility, isCheckMarkFadingOut,
                alpha);
        ImageWrapperIcon iconBase = icons.get(keyBase);
        if (iconBase == null) {
            iconBase = new ImageWrapperIcon(
                    SubstanceImageCreator.getCheckBox(button, fillPainter, borderPainter,
                            checkMarkSize, currState, baseFillColorScheme, baseMarkColorScheme,
                            baseBorderColorScheme, visibility, isCheckMarkFadingOut,
                            alpha));
            icons.put(keyBase, iconBase);
        }
        if (currState.isDisabled() || (activeStates.size() == 1)) {
            return iconBase;
        }

        BufferedImage result = SubstanceCoreUtilities.getBlankImage(iconBase.getIconWidth(),
                iconBase.getIconHeight());
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
                SubstanceColorScheme fillColorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.MARK_BOX, activeState);
                SubstanceColorScheme markColorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.MARK, activeState);
                SubstanceColorScheme borderColorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.BORDER, activeState);

                HashMapKey keyLayer = SubstanceCoreUtilities.getHashKey(fontSize, checkMarkSize,
                        fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                        fillColorScheme.getDisplayName(), markColorScheme.getDisplayName(),
                        borderColorScheme.getDisplayName(), visibility);
                ImageWrapperIcon iconLayer = icons.get(keyLayer);
                if (iconLayer == null) {
                    iconLayer = new ImageWrapperIcon(
                            SubstanceImageCreator.getCheckBox(button, fillPainter, borderPainter,
                                    checkMarkSize, currState, fillColorScheme, markColorScheme,
                                    borderColorScheme, visibility, isCheckMarkFadingOut, alpha));
                    icons.put(keyLayer, iconLayer);
                }

                iconLayer.paintIcon(button, g2d, 0, 0);
            }
        }

        g2d.dispose();
        return new ImageWrapperIcon(result);
    }

    @Override
    protected BasicButtonListener createButtonListener(AbstractButton b) {
        return new RolloverButtonListener(b, this.stateTransitionTracker);
    }

    @Override
    public Icon getDefaultIcon() {
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel()) {
            return null;
        }
        return SubstanceCheckBoxUI.getIcon(this.button, this.stateTransitionTracker);
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        JCheckBox checkBox = (JCheckBox) c;
        return SubstanceMetricsUtilities.getPreferredCheckButtonSize(checkBox,
                ((SubstanceCheckBoxUI) checkBox.getUI()).getDefaultIcon());
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        NeonCortex.installDesktopHints(g2d, c.getFont());
        super.update(g2d, c);
        g2d.dispose();
    }
}
