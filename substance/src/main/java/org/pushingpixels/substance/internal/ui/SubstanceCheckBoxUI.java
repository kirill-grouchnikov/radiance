/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicButtonListener;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.RolloverButtonListener;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;

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

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
     */
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceCheckBoxUI((JToggleButton) comp);
    }

    /**
     * Hash map for storing icons.
     */
    private static LazyResettableHashMap<SubstanceIconUIResource> icons = new LazyResettableHashMap<SubstanceIconUIResource>(
            "SubstanceCheckBoxUI");

    /**
     * Simple constructor.
     * 
     * @param button
     *            The associated button.
     */
    public SubstanceCheckBoxUI(JToggleButton button) {
        super(button);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicRadioButtonUI#getPropertyPrefix()
     */
    @Override
    protected String getPropertyPrefix() {
        return propertyPrefix;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.substance.SubstanceRadioButtonUI#installDefaults(javax .swing
     * .AbstractButton)
     */
    @Override
    protected void installDefaults(AbstractButton b) {
        super.installDefaults(b);

        button.setRolloverEnabled(true);

        Border border = b.getBorder();
        if (border == null || border instanceof UIResource) {
            b.setBorder(
                    SubstanceSizeUtils.getCheckBoxBorder(SubstanceSizeUtils.getComponentFontSize(b),
                            b.getComponentOrientation().isLeftToRight()));
        }
    }

    /**
     * Returns the icon that matches the current and previous states of the checkbox.
     * 
     * @param button
     *            Button (should be {@link JCheckBox}).
     * @param currState
     *            Current state of the checkbox.
     * @param prevState
     *            Previous state of the checkbox.
     * @return Matching icon.
     */
    private static Icon getIcon(JToggleButton button,
            StateTransitionTracker stateTransitionTracker) {
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(button);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(button);
        ComponentState currState = modelStateInfo.getCurrModelState();

        SubstanceColorScheme baseFillColorScheme = SubstanceColorSchemeUtilities
                .getColorScheme(button, ColorSchemeAssociationKind.FILL, currState);
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
                baseBorderColorScheme.getDisplayName(), visibility, isCheckMarkFadingOut, alpha);
        SubstanceIconUIResource iconBase = icons.get(keyBase);
        if (iconBase == null) {
            iconBase = new SubstanceIconUIResource(
                    SubstanceImageCreator.getCheckBox(button, fillPainter, borderPainter,
                            checkMarkSize, currState, baseFillColorScheme, baseMarkColorScheme,
                            baseBorderColorScheme, visibility, isCheckMarkFadingOut, alpha));
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
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                .entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            // System.out.println("Painting state " + activeState + "[curr is "
            // + currState + "] with " + activeEntry.getValue());
            if (activeState == currState)
                continue;

            float stateContribution = activeEntry.getValue().getContribution();
            if (stateContribution > 0.0f) {
                g2d.setComposite(AlphaComposite.SrcOver.derive(stateContribution));
                SubstanceColorScheme fillColorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.FILL, activeState);
                SubstanceColorScheme markColorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.MARK, activeState);
                SubstanceColorScheme borderColorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.BORDER, activeState);

                HashMapKey keyLayer = SubstanceCoreUtilities.getHashKey(fontSize, checkMarkSize,
                        fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                        fillColorScheme.getDisplayName(), markColorScheme.getDisplayName(),
                        borderColorScheme.getDisplayName(), visibility);
                SubstanceIconUIResource iconLayer = icons.get(keyLayer);
                if (iconLayer == null) {
                    iconLayer = new SubstanceIconUIResource(
                            SubstanceImageCreator.getCheckBox(button, fillPainter, borderPainter,
                                    checkMarkSize, currState, fillColorScheme, markColorScheme,
                                    borderColorScheme, visibility, isCheckMarkFadingOut, alpha));
                    icons.put(keyLayer, iconLayer);
                }

                iconLayer.paintIcon(button, g2d, 0, 0);
            }
        }

        g2d.dispose();
        return new SubstanceIconUIResource(result);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicButtonUI#createButtonListener(javax.swing .AbstractButton)
     */
    @Override
    protected BasicButtonListener createButtonListener(AbstractButton b) {
        return new RolloverButtonListener(b, this.stateTransitionTracker);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicRadioButtonUI#getDefaultIcon()
     */
    @Override
    public Icon getDefaultIcon() {
        if (!(UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel)) {
            return null;
        }
        return SubstanceCheckBoxUI.getIcon(this.button, this.stateTransitionTracker);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#update(java.awt.Graphics, javax.swing.JComponent)
     */
    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RenderingUtils.installDesktopHints(g2d, c);
        super.update(g2d, c);
        g2d.dispose();
    }

    /**
     * Returns memory usage string.
     * 
     * @return Memory usage string.
     */
    public static String getMemoryUsage() {
        StringBuffer sb = new StringBuffer();
        sb.append("SubstanceCheckBox: \n");
        sb.append("\t" + SubstanceCheckBoxUI.icons.size() + " icons");
        return sb.toString();
    }
}
