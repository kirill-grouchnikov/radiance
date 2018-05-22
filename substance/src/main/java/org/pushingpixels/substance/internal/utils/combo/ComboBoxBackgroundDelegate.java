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
package org.pushingpixels.substance.internal.utils.combo;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceOutlineUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;

/**
 * Delegate class for painting backgrounds of buttons in <b>Substance </b> look and feel. This class
 * is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class ComboBoxBackgroundDelegate {
    /**
     * Cache for background images. Each time
     * {@link #getBackground(AbstractButton, SubstanceButtonShaper, SubstanceFillPainter, int, int)}
     * is called, it checks <code>this</code> map to see if it already contains such background. If
     * so, the background from the map is returned.
     */
    private static LazyResettableHashMap<BufferedImage> regularBackgrounds = new LazyResettableHashMap<BufferedImage>(
            "ComboBoxBackgroundDelegate");

    /**
     * Retrieves the background for the specified button.
     * 
     * @param button
     *            Button.
     * @param model
     *            Button model.
     * @param shaper
     *            Button shaper.
     * @param fillPainter
     *            Button fill painter.
     * @param borderPainter
     *            Button border painter.
     * @param width
     *            Button width.
     * @param height
     *            Button height.
     * @return Button background.
     */
    public static BufferedImage getFullAlphaBackground(JComboBox combo, ButtonModel model,
            SubstanceFillPainter fillPainter, SubstanceBorderPainter borderPainter, int width,
            int height) {
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) combo.getUI();
        StateTransitionTracker.ModelStateInfo modelStateInfo = transitionAwareUI
                .getTransitionTracker().getModelStateInfo();
        ComponentState currState = modelStateInfo.getCurrModelState();

        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        ClassicButtonShaper shaper = ClassicButtonShaper.INSTANCE;
        int comboFontSize = SubstanceSizeUtils.getComponentFontSize(combo);
        float radius = SubstanceSizeUtils.getClassicButtonCornerRadius(comboFontSize);

        SubstanceColorScheme baseFillScheme = SubstanceColorSchemeUtilities.getColorScheme(combo,
                currState);
        SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities.getColorScheme(combo,
                ColorSchemeAssociationKind.BORDER, currState);

        HashMapKey keyBase = SubstanceCoreUtilities.getHashKey(width, height,
                baseFillScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
                fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                combo.getClass().getName(), radius, comboFontSize);
        BufferedImage layerBase = regularBackgrounds.get(keyBase);
        if (layerBase == null) {
            layerBase = createBackgroundImage(combo, shaper, fillPainter, borderPainter, width,
                    height, baseFillScheme, baseBorderScheme, radius);
            regularBackgrounds.put(keyBase, layerBase);
        }
        if (currState.isDisabled() || (activeStates.size() == 1)) {
            return layerBase;
        }

        BufferedImage result = SubstanceCoreUtilities.getBlankUnscaledImage(layerBase);
        Graphics2D g2d = result.createGraphics();
        // draw the base layer
        g2d.drawImage(layerBase, 0, 0, layerBase.getWidth(), layerBase.getHeight(), null);
        // System.out.println("\nPainting base state " + currState);

        // draw the other active layers
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

                SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(combo, activeState);
                SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(combo, ColorSchemeAssociationKind.BORDER, activeState);
                HashMapKey key = SubstanceCoreUtilities.getHashKey(width, height,
                        fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                        fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                        combo.getClass().getName(), radius, comboFontSize);
                BufferedImage layer = regularBackgrounds.get(key);
                if (layer == null) {
                    layer = createBackgroundImage(combo, shaper, fillPainter, borderPainter, width,
                            height, fillScheme, borderScheme, radius);
                    regularBackgrounds.put(key, layer);
                }
                g2d.drawImage(layer, 0, 0, layer.getWidth(), layer.getHeight(), null);
            }
        }
        g2d.dispose();
        return result;
    }

    private static BufferedImage createBackgroundImage(JComboBox combo,
            SubstanceButtonShaper shaper, SubstanceFillPainter fillPainter,
            SubstanceBorderPainter borderPainter, int width, int height,
            SubstanceColorScheme fillScheme, SubstanceColorScheme borderScheme, float radius) {
        float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;
        Shape contour = SubstanceOutlineUtilities.getBaseOutline(width, height, radius, null,
                borderDelta);

        BufferedImage newBackground = SubstanceCoreUtilities.getBlankImage(width, height);
        Graphics2D finalGraphics = (Graphics2D) newBackground.getGraphics();
        fillPainter.paintContourBackground(finalGraphics, combo, width, height, contour, false,
                fillScheme, true);
        float borderThickness = SubstanceSizeUtils.getBorderStrokeWidth();
        Shape contourInner = borderPainter.isPaintingInnerContour()
                ? SubstanceOutlineUtilities.getBaseOutline(width, height, radius - borderThickness,
                        null, borderDelta + borderThickness)
                : null;
        borderPainter.paintBorder(finalGraphics, combo, width, height, contour, contourInner,
                borderScheme);
        return newBackground;
    }

    /**
     * Simple constructor.
     */
    public ComboBoxBackgroundDelegate() {
        super();
    }

    /**
     * Updates background of the specified button.
     * 
     * @param g
     *            Graphic context.
     * @param button
     *            Button to update.
     */
    public void updateBackground(Graphics g, JComboBox combo, ButtonModel comboModel) {
        // failsafe for LAF change
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel())
            return;

        int width = combo.getWidth();
        int height = combo.getHeight();
        int y = 0;

        SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(combo);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(combo);

        BufferedImage bgImage = getFullAlphaBackground(combo, comboModel, fillPainter,
                borderPainter, width, height);

        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) combo.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        // Two special cases here:
        // 1. Combobox has flat appearance.
        // 2. Combobox is disabled.
        // For both cases, we need to set custom translucency.
        boolean isFlat = SubstanceCoreUtilities.hasFlatAppearance(combo, false);
        boolean isSpecial = isFlat || !combo.isEnabled();
        float extraAlpha = 1.0f;
        if (isSpecial) {
            if (isFlat) {
                // Special handling of flat combos
                extraAlpha = 0.0f;
                for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                        .entrySet()) {
                    ComponentState activeState = activeEntry.getKey();
                    if (activeState.isDisabled())
                        continue;
                    if (activeState == ComponentState.ENABLED)
                        continue;
                    extraAlpha += activeEntry.getValue().getContribution();
                }
            } else {
                if (!combo.isEnabled()) {
                    extraAlpha = SubstanceColorSchemeUtilities.getAlpha(combo,
                            modelStateInfo.getCurrModelState());
                }
            }
        }
        if (extraAlpha > 0.0f) {
            Graphics2D graphics = (Graphics2D) g.create();
            graphics.setComposite(WidgetUtilities.getAlphaComposite(combo, extraAlpha, g));
            double factor = UIUtil.getScaleFactor();
            graphics.drawImage(bgImage, 0, y, (int) (bgImage.getWidth() / factor),
                    (int) (bgImage.getHeight() / factor), null);
            graphics.dispose();
        }
    }

    /**
     * Returns the memory usage string.
     * 
     * @return Memory usage string.
     */
    static String getMemoryUsage() {
        StringBuffer sb = new StringBuffer();
        sb.append("SubstanceBackgroundDelegate: \n");
        sb.append("\t" + regularBackgrounds.size() + " regular");
        // + pairwiseBackgrounds.size() + " pairwise");
        return sb.toString();
    }

}
