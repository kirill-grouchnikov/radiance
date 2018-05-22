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
package org.pushingpixels.substance.internal.utils;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.util.Map;
import java.util.Set;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JButton;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.Side;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.api.shaper.RectangularButtonShaper;
import org.pushingpixels.substance.api.shaper.StandardButtonShaper;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.animation.ModificationAwareUI;
import org.pushingpixels.substance.internal.animation.RootPaneDefaultButtonTracker;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.Timeline.TimelineState;

/**
 * Delegate class for painting backgrounds of buttons in <b>Substance </b> look and feel. This class
 * is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class ButtonBackgroundDelegate {
    /**
     * Cache for background images. Each time
     * {@link #getBackground(AbstractButton, SubstanceButtonShaper, SubstanceFillPainter, int, int)}
     * is called, it checks <code>this</code> map to see if it already contains such background. If
     * so, the background from the map is returned.
     */
    private static LazyResettableHashMap<BufferedImage> regularBackgrounds = new LazyResettableHashMap<BufferedImage>(
            "ButtonBackgroundDelegate");

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
    public static BufferedImage getFullAlphaBackground(AbstractButton button, ButtonModel model,
            SubstanceButtonShaper shaper, SubstanceFillPainter fillPainter,
            SubstanceBorderPainter borderPainter, int width, int height) {
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) button.getUI();
        StateTransitionTracker.ModelStateInfo modelStateInfo = transitionAwareUI
                .getTransitionTracker().getModelStateInfo();

        ComponentState currState = modelStateInfo.getCurrModelState();

        // ComponentState prevState = stateTransitionModel.getPrevModelState();

        // System.out.println(button.getText() + ": " + prevState.name() +
        // " -> "
        // + state.name() + " at "
        // + stateTransitionModel.getTransitionPosition());

        // compute cycle count (for animation)
        float cyclePos = 0.0f;// currState.getCyclePosition();
        // boolean isPulsating = false;
        if (button instanceof JButton) {
            JButton jb = (JButton) button;
            if (RootPaneDefaultButtonTracker.isPulsating(jb)
                    && (currState != ComponentState.PRESSED_SELECTED)
                    && (currState != ComponentState.PRESSED_UNSELECTED)) {
                // isPulsating = true;
                cyclePos = RootPaneDefaultButtonTracker.getTimelinePosition(jb);
            }
        }

        // compute the straight sides
        Set<SubstanceSlices.Side> straightSides = SubstanceCoreUtilities.getSides(button,
                SubstanceSynapse.BUTTON_STRAIGHT_SIDE);

        boolean isRoundButton = StandardButtonShaper.isRoundButton(button);
        float radius = 0.0f;
        if (shaper instanceof RectangularButtonShaper) {
            radius = ((RectangularButtonShaper) shaper).getCornerRadius(button, 0.0f);
        }

        Set<Side> openSides = SubstanceCoreUtilities.getSides(button,
                SubstanceSynapse.BUTTON_OPEN_SIDE);
        // String openKey = "";
        // for (Side oSide : openSides) {
        // openKey += oSide.name() + "-";
        // }
        // String extraModelKey = "";
        // for (String modelKey : extraModelKeys) {
        // extraModelKey += (modelKey + "-");
        // }
        boolean isContentAreaFilled = button.isContentAreaFilled();
        boolean isBorderPainted = button.isBorderPainted();

        // compute color scheme
        SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities.getColorScheme(button,
                ColorSchemeAssociationKind.BORDER, currState);

        // see if need to use attention-drawing animation
        // boolean isWindowModified = false;
        if (button.getUI() instanceof ModificationAwareUI) {
            ModificationAwareUI modificationAwareUI = (ModificationAwareUI) button.getUI();
            Timeline modificationTimeline = modificationAwareUI.getModificationTimeline();
            if (modificationTimeline != null) {
                if (modificationTimeline.getState() != TimelineState.IDLE) {
                    // isWindowModified = true;
                    SubstanceColorScheme colorScheme2 = SubstanceColorSchemeUtilities.YELLOW;
                    SubstanceColorScheme colorScheme = SubstanceColorSchemeUtilities.ORANGE;
                    cyclePos = modificationTimeline.getTimelinePosition();

                    HashMapKey key1 = SubstanceCoreUtilities.getHashKey(width, height,
                            colorScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
                            shaper.getDisplayName(), fillPainter.getDisplayName(),
                            borderPainter.getDisplayName(), straightSides, openSides,
                            button.getClass().getName(), isRoundButton, radius, isContentAreaFilled,
                            isBorderPainted, SubstanceSizeUtils.getComponentFontSize(button));
                    BufferedImage layer1 = regularBackgrounds.get(key1);
                    if (layer1 == null) {
                        layer1 = createBackgroundImage(button, shaper, fillPainter, borderPainter,
                                width, height, colorScheme, baseBorderScheme, openSides,
                                isContentAreaFilled, isBorderPainted);

                        regularBackgrounds.put(key1, layer1);
                    }
                    HashMapKey key2 = SubstanceCoreUtilities.getHashKey(width, height,
                            colorScheme2.getDisplayName(), baseBorderScheme.getDisplayName(),
                            shaper.getDisplayName(), fillPainter.getDisplayName(),
                            borderPainter.getDisplayName(), straightSides, openSides,
                            button.getClass().getName(), isRoundButton, radius, isContentAreaFilled,
                            isBorderPainted, SubstanceSizeUtils.getComponentFontSize(button));
                    BufferedImage layer2 = regularBackgrounds.get(key2);
                    if (layer2 == null) {
                        layer2 = createBackgroundImage(button, shaper, fillPainter, borderPainter,
                                width, height, colorScheme2, baseBorderScheme, openSides,
                                isContentAreaFilled, isBorderPainted);

                        regularBackgrounds.put(key2, layer2);
                    }

                    BufferedImage result = SubstanceCoreUtilities.getBlankUnscaledImage(layer1);
                    Graphics2D g2d = result.createGraphics();
                    if (cyclePos < 1.0f)
                        g2d.drawImage(layer1, 0, 0, layer1.getWidth(), layer1.getHeight(), null);
                    if (cyclePos > 0.0f) {
                        g2d.setComposite(AlphaComposite.SrcOver.derive(cyclePos));
                        g2d.drawImage(layer2, 0, 0, layer2.getWidth(), layer2.getHeight(), null);
                    }
                    g2d.dispose();
                    return result;
                }
            }
        }

        // see if need to use transition animation. Important - don't do it
        // on pulsating buttons (such as default or close buttons
        // of modified frames).

        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        SubstanceColorScheme baseFillScheme = SubstanceColorSchemeUtilities.getColorScheme(button,
                currState);
        HashMapKey keyBase = SubstanceCoreUtilities.getHashKey(width, height,
                baseFillScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
                shaper.getDisplayName(), fillPainter.getDisplayName(),
                borderPainter.getDisplayName(), straightSides, openSides,
                button.getClass().getName(), isRoundButton, (int) (1000 * radius),
                isContentAreaFilled, isBorderPainted,
                SubstanceSizeUtils.getComponentFontSize(button));
        BufferedImage layerBase = regularBackgrounds.get(keyBase);
        if (layerBase == null) {
            layerBase = createBackgroundImage(button, shaper, fillPainter, borderPainter, width,
                    height, baseFillScheme, baseBorderScheme, openSides, isContentAreaFilled,
                    isBorderPainted);
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
                        .getColorScheme(button, activeState);
                SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.BORDER, activeState);
                HashMapKey key = SubstanceCoreUtilities.getHashKey(width, height,
                        fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                        shaper.getDisplayName(), fillPainter.getDisplayName(),
                        borderPainter.getDisplayName(), straightSides, openSides,
                        button.getClass().getName(), isRoundButton, (int) (1000 * radius),
                        isContentAreaFilled, isBorderPainted,
                        SubstanceSizeUtils.getComponentFontSize(button));
                BufferedImage layer = regularBackgrounds.get(key);
                if (layer == null) {
                    layer = createBackgroundImage(button, shaper, fillPainter, borderPainter, width,
                            height, fillScheme, borderScheme, openSides, isContentAreaFilled,
                            isBorderPainted);
                    regularBackgrounds.put(key, layer);
                }
                g2d.drawImage(layer, 0, 0, layer.getWidth(), layer.getHeight(), null);
            }
        }
        g2d.dispose();
        return result;
    }

    private static BufferedImage createBackgroundImage(AbstractButton button,
            SubstanceButtonShaper shaper, SubstanceFillPainter fillPainter,
            SubstanceBorderPainter borderPainter, int width, int height,
            SubstanceColorScheme colorScheme, SubstanceColorScheme borderScheme,
            Set<Side> openSides, boolean isContentAreaFilled, boolean isBorderPainted) {
        int openDelta = (int) (Math.ceil(3.0 * SubstanceSizeUtils.getBorderStrokeWidth()));
        openDelta *= UIUtil.getScaleFactor();
        int deltaLeft = ((openSides != null) && openSides.contains(Side.LEFT)) ? openDelta : 0;
        int deltaRight = ((openSides != null) && openSides.contains(Side.RIGHT)) ? openDelta : 0;
        int deltaTop = ((openSides != null) && openSides.contains(Side.TOP)) ? openDelta : 0;
        int deltaBottom = ((openSides != null) && openSides.contains(Side.BOTTOM)) ? openDelta : 0;

        // System.err.println(key);
        float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;
        Shape contour = shaper.getButtonOutline(button, borderDelta, width + deltaLeft + deltaRight,
                height + deltaTop + deltaBottom, false);

        BufferedImage newBackground = SubstanceCoreUtilities.getBlankImage(width, height);
        Graphics2D finalGraphics = (Graphics2D) newBackground.getGraphics();
        finalGraphics.translate(-deltaLeft, -deltaTop);
        if (isContentAreaFilled) {
            fillPainter.paintContourBackground(finalGraphics, button,
                    width + deltaLeft + deltaRight, height + deltaTop + deltaBottom, contour, false,
                    colorScheme, true);
        }

        if (isBorderPainted) {
            float borderThickness = SubstanceSizeUtils.getBorderStrokeWidth();
            Shape contourInner = borderPainter.isPaintingInnerContour()
                    ? shaper.getButtonOutline(button, borderDelta + borderThickness,
                            width + deltaLeft + deltaRight, height + deltaTop + deltaBottom, true)
                    : null;
            borderPainter.paintBorder(finalGraphics, button, width + deltaLeft + deltaRight,
                    height + deltaTop + deltaBottom, contour, contourInner, borderScheme);
        }
        return newBackground;
    }

    /**
     * Simple constructor.
     */
    public ButtonBackgroundDelegate() {
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
    public void updateBackground(Graphics g, AbstractButton button) {
        // failsafe for LAF change
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel())
            return;

        if (SubstanceCoreUtilities.isButtonNeverPainted(button))
            return;

        int width = button.getWidth();
        int height = button.getHeight();
        int y = 0;
        if (SubstanceCoreUtilities.isScrollButton(button)
                || SubstanceCoreUtilities.isSpinnerButton(button)) {
            PairwiseButtonBackgroundDelegate.updatePairwiseBackground(g, button, width, height,
                    false);
            return;
        }

        SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(button);
        SubstanceButtonShaper shaper = SubstanceCoreUtilities.getButtonShaper(button);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(button);

        BufferedImage bgImage = getFullAlphaBackground(button, button.getModel(), shaper,
                fillPainter, borderPainter, width, height);

        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) button.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        // Two special cases here:
        // 1. Button has flat appearance.
        // 2. Button is disabled.
        // For both cases, we need to set custom translucency.
        boolean isFlat = SubstanceCoreUtilities.hasFlatAppearance(button);
        boolean isSpecial = isFlat || !button.isEnabled();
        float extraAlpha = 1.0f;
        if (isSpecial) {
            if (isFlat) {
                // Special handling of flat buttons
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
                if (!button.isEnabled()) {
                    extraAlpha = SubstanceColorSchemeUtilities.getAlpha(button,
                            modelStateInfo.getCurrModelState());
                }
            }
        }
        if (extraAlpha > 0.0f) {
            Graphics2D graphics = (Graphics2D) g.create();
            graphics.setComposite(WidgetUtilities.getAlphaComposite(button, extraAlpha, g));
            double factor = UIUtil.getScaleFactor();
            graphics.drawImage(bgImage, 0, y, (int) (bgImage.getWidth() / factor),
                    (int) (bgImage.getHeight() / factor), null);
            graphics.dispose();
        }
    }

    /**
     * Checks whether the specified button has round corners.
     * 
     * @param button
     *            Button to check.
     * @return <code>true</code> if the specified button has round corners, <code>false</code>
     *         otherwise.
     */
    public static boolean isRoundButton(AbstractButton button) {
        return (!SubstanceCoreUtilities.isComboBoxButton(button))
                && (!SubstanceCoreUtilities.isScrollButton(button))
                && SubstanceCoreUtilities.hasText(button);
    }

    /**
     * Returns <code>true</code> if the specified <i>x,y </i> location is contained within the look
     * and feel's defined shape of the specified component. <code>x</code> and <code>y</code> are
     * defined to be relative to the coordinate system of the specified component.
     * 
     * @param button
     *            the component where the <i>x,y </i> location is being queried;
     * @param x
     *            the <i>x </i> coordinate of the point
     * @param y
     *            the <i>y </i> coordinate of the point
     * @return <code>true</code> if the specified <i>x,y </i> location is contained within the look
     *         and feel's defined shape of the specified component, <code>false</code> otherwise.
     */
    public static boolean contains(AbstractButton button, int x, int y) {
        // failsafe for LAF change
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel()) {
            return false;
        }
        SubstanceButtonShaper shaper = SubstanceCoreUtilities.getButtonShaper(button);
        if (shaper == null)
            return false;
        Shape contour = shaper.getButtonOutline(button, 0.0f, button.getWidth(), button.getHeight(),
                false);
        return contour.contains(x, y);
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
