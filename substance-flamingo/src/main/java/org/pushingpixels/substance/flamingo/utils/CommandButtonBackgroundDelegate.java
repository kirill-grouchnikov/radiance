/*
 * Copyright (c) 2005-2018 Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.flamingo.utils;

import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.Map;
import java.util.Set;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.Icon;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.AbstractCommandButton.CommandButtonLocationOrderKind;
import org.pushingpixels.flamingo.api.common.JCommandButtonStrip;
import org.pushingpixels.flamingo.api.common.JCommandButtonStrip.StripOrientation;
import org.pushingpixels.flamingo.api.common.model.PopupButtonModel;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.flamingo.common.GlowingResizableIcon;
import org.pushingpixels.substance.flamingo.common.ui.ActionPopupTransitionAwareUI;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceOutlineUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.substance.internal.utils.icon.TransitionAware;

/**
 * Delegate class for painting backgrounds of buttons in <b>Substance </b> look and feel. This class
 * is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class CommandButtonBackgroundDelegate {
    /**
     * Cache for background images. Each time
     * {@link #getBackground(AbstractButton, SubstanceButtonShaper, SubstanceFillPainter, int, int)}
     * is called, it checks <code>this</code> map to see if it already contains such background. If
     * so, the background from the map is returned.
     */
    private static LazyResettableHashMap<BufferedImage> imageCache = new LazyResettableHashMap<BufferedImage>(
            "Substance.Flamingo.CommandButtonBackgroundDelegate");

    /**
     * Retrieves the background for the specified button.
     * 
     * @param commandButton
     *            Button.
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
    @SuppressWarnings("incomplete-switch")
    public static BufferedImage getFullAlphaBackground(AbstractCommandButton commandButton,
            ButtonModel buttonModel, SubstanceFillPainter fillPainter,
            SubstanceBorderPainter borderPainter, int width, int height,
            StateTransitionTracker stateTransitionTracker, boolean ignoreSelections) {
        StateTransitionTracker.ModelStateInfo modelStateInfo = (stateTransitionTracker == null)
                ? null
                : stateTransitionTracker.getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = (modelStateInfo == null)
                ? null
                : (ignoreSelections ? modelStateInfo.getStateNoSelectionContributionMap()
                        : modelStateInfo.getStateContributionMap());
        ComponentState currState = (modelStateInfo == null)
                ? ComponentState.getState(buttonModel, commandButton)
                : (ignoreSelections ? modelStateInfo.getCurrModelStateNoSelection()
                        : modelStateInfo.getCurrModelState());

        SubstanceColorScheme baseFillScheme = SubstanceColorSchemeUtilities
                .getColorScheme(commandButton, currState);
        SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities
                .getColorScheme(commandButton, ColorSchemeAssociationKind.BORDER, currState);

        float radius = SubstanceSizeUtils.getClassicButtonCornerRadius(
                SubstanceSizeUtils.getComponentFontSize(commandButton));

        Set<SubstanceSlices.Side> straightSides = SubstanceCoreUtilities.getSides(commandButton,
                SubstanceSynapse.BUTTON_STRAIGHT_SIDE);

        // special handling for location order
        AbstractCommandButton.CommandButtonLocationOrderKind locationOrderKind = commandButton
                .getLocationOrderKind();
        int dx = 0;
        int dy = 0;
        int dw = 0;
        int dh = 0;
        boolean isVertical = false;
        if ((locationOrderKind != null)
                && (locationOrderKind != AbstractCommandButton.CommandButtonLocationOrderKind.ONLY)) {
            Component parent = commandButton.getParent();
            if ((parent instanceof JCommandButtonStrip) && (((JCommandButtonStrip) parent)
                    .getOrientation() == StripOrientation.VERTICAL)) {
                isVertical = true;
                switch (locationOrderKind) {
                    case FIRST:
                        dh = commandButton.getHeight() / 2;
                        break;
                    case MIDDLE:
                        dy = -commandButton.getHeight() / 2;
                        dh = commandButton.getHeight();
                        break;
                    case LAST:
                        dy = -commandButton.getHeight() / 2;
                        dh = commandButton.getHeight() / 2;
                }
            } else {
                boolean ltr = commandButton.getComponentOrientation().isLeftToRight();
                if (locationOrderKind == AbstractCommandButton.CommandButtonLocationOrderKind.MIDDLE) {
                    dx = -commandButton.getWidth() / 2;
                    dw = commandButton.getWidth();
                } else {
                    boolean curveOnLeft = (ltr
                            && (locationOrderKind == AbstractCommandButton.CommandButtonLocationOrderKind.FIRST))
                            || (!ltr && (locationOrderKind == AbstractCommandButton.CommandButtonLocationOrderKind.LAST));
                    if (curveOnLeft) {
                        dw = commandButton.getWidth() / 2;
                    } else {
                        dx = -commandButton.getWidth() / 2;
                        dw = commandButton.getWidth() / 2;
                    }
                }
            }
        }

        HashMapKey baseKey = SubstanceCoreUtilities.getHashKey(currState, width, height,
                baseFillScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
                fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                commandButton.getClass().getName(), radius, straightSides,
                SubstanceSizeUtils.getComponentFontSize(commandButton), locationOrderKind, dx, dy,
                dw, dh, isVertical);

        BufferedImage baseLayer = imageCache.get(baseKey);
        if (baseLayer == null) {
            baseLayer = getSingleLayer(commandButton, fillPainter, borderPainter, width, height,
                    baseFillScheme, baseBorderScheme, radius, straightSides, locationOrderKind, dx,
                    dy, dw, dh, isVertical);

            imageCache.put(baseKey, baseLayer);
        }

        if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
            return baseLayer;
        }

        BufferedImage result = SubstanceCoreUtilities.getBlankImage(width, height);
        Graphics2D g2d = result.createGraphics();
        double factor = UIUtil.getScaleFactor();

        g2d.drawImage(baseLayer, 0, 0, (int) (baseLayer.getWidth() / factor),
                (int) (baseLayer.getHeight() / factor), null);

        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                .entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            if (activeState == currState)
                continue;

            float contribution = activeEntry.getValue().getContribution();
            if (contribution == 0.0f)
                continue;

            SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(commandButton, activeState);
            SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(commandButton, ColorSchemeAssociationKind.BORDER, activeState);

            HashMapKey key = SubstanceCoreUtilities.getHashKey(activeState, width, height,
                    fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                    fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                    commandButton.getClass().getName(), radius, straightSides,
                    SubstanceSizeUtils.getComponentFontSize(commandButton), locationOrderKind, dx,
                    dy, dw, dh, isVertical);

            BufferedImage layer = imageCache.get(key);
            if (layer == null) {
                layer = getSingleLayer(commandButton, fillPainter, borderPainter, width, height,
                        fillScheme, borderScheme, radius, straightSides, locationOrderKind, dx, dy,
                        dw, dh, isVertical);

                imageCache.put(key, layer);
            }

            g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));
            g2d.drawImage(layer, 0, 0, (int) (layer.getWidth() / factor),
                    (int) (layer.getHeight() / factor), null);
        }

        g2d.dispose();
        return result;
    }

    private static BufferedImage getSingleLayer(AbstractCommandButton commandButton,
            SubstanceFillPainter fillPainter, SubstanceBorderPainter borderPainter, int width,
            int height, SubstanceColorScheme fillScheme, SubstanceColorScheme borderScheme,
            float radius, Set<SubstanceSlices.Side> straightSides,
            AbstractCommandButton.CommandButtonLocationOrderKind locationOrderKind, int dx, int dy,
            int dw, int dh, boolean isVertical) {
        float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;

        Shape contour = SubstanceOutlineUtilities.getBaseOutline(width + dw, height + dh, radius,
                straightSides, borderDelta);
        BufferedImage newBackground = SubstanceCoreUtilities.getBlankImage(width, height);
        Graphics2D finalGraphics = (Graphics2D) newBackground.getGraphics();
        finalGraphics.translate(dx, dy);
        fillPainter.paintContourBackground(finalGraphics, commandButton, width + dw, height + dh,
                contour, false, fillScheme, true);

        float borderThickness = SubstanceSizeUtils.getBorderStrokeWidth();
        Shape contourInner = SubstanceOutlineUtilities.getBaseOutline(width + dw, height + dh,
                radius, straightSides, borderDelta + borderThickness);
        borderPainter.paintBorder(finalGraphics, commandButton, width + dw, height + dh, contour,
                contourInner, borderScheme);

        if (isVertical) {
            if ((locationOrderKind == AbstractCommandButton.CommandButtonLocationOrderKind.FIRST)
                    || (locationOrderKind == CommandButtonLocationOrderKind.MIDDLE)) {
                // outer/inner line at the bottom
                float y = -dy + commandButton.getHeight() - borderDelta - borderThickness;
                float xs = borderDelta;
                float xe = commandButton.getWidth() - borderDelta;
                Shape upper = new Line2D.Double(xs + borderThickness, y, xe - borderThickness, y);
                y += borderThickness;
                Shape lower = new Line2D.Double(xs, y, xe, y);
                borderPainter.paintBorder(finalGraphics, commandButton, width + dw, height + dh,
                        lower, upper, borderScheme);
            }

            // special case for MIDDLE and LAST location order kinds
            if ((locationOrderKind == CommandButtonLocationOrderKind.MIDDLE)
                    || (locationOrderKind == AbstractCommandButton.CommandButtonLocationOrderKind.LAST)) {
                // inner line at the top
                float y = -dy + borderDelta;
                float xs = borderDelta;
                float xe = commandButton.getWidth() - borderDelta;
                Shape upper = new Line2D.Double(xs + borderThickness, y, xe - borderThickness, y);
                borderPainter.paintBorder(finalGraphics, commandButton, width + dw, height + dh,
                        null, upper, borderScheme);
            }
        } else {
            // special case for leftmost (not FIRST!!!) and MIDDLE location
            // order kinds
            boolean ltr = commandButton.getComponentOrientation().isLeftToRight();
            boolean leftmost = (ltr
                    && (locationOrderKind == AbstractCommandButton.CommandButtonLocationOrderKind.FIRST))
                    || (!ltr && (locationOrderKind == AbstractCommandButton.CommandButtonLocationOrderKind.LAST));
            if (leftmost || (locationOrderKind == CommandButtonLocationOrderKind.MIDDLE)) {
                // outer / inner line at the right
                float x = -dx + commandButton.getWidth() - borderDelta - borderThickness;
                float ys = borderDelta;
                float ye = commandButton.getHeight() - borderDelta;
                Shape upper = new Line2D.Double(x, ys + borderThickness, x, ye - borderThickness);
                x += borderThickness;
                Shape lower = new Line2D.Double(x, ys, x, ye);
                borderPainter.paintBorder(finalGraphics, commandButton, width + dw, height + dh,
                        lower, upper, borderScheme);
            }

            // special case for MIDDLE and LAST location order kinds
            boolean rightmost = (ltr
                    && (locationOrderKind == AbstractCommandButton.CommandButtonLocationOrderKind.LAST))
                    || (!ltr && (locationOrderKind == AbstractCommandButton.CommandButtonLocationOrderKind.FIRST));
            if ((locationOrderKind == CommandButtonLocationOrderKind.MIDDLE) || rightmost) {
                // inner line at the left
                float x = -dx + borderDelta;
                float ys = borderDelta;
                float ye = commandButton.getHeight() - borderDelta;
                Shape upper = new Line2D.Double(x, ys + borderThickness, x, ye - borderThickness);
                borderPainter.paintBorder(finalGraphics, commandButton, width + dw, height + dh,
                        null, upper, borderScheme);
            }
        }
        return newBackground;
    }

    public static BufferedImage getCombinedCommandButtonBackground(
            AbstractCommandButton commandButton, ButtonModel actionModel, Rectangle actionArea,
            PopupButtonModel popupModel, Rectangle popupArea) {
        ButtonModel backgroundModel = new DefaultButtonModel();
        backgroundModel.setEnabled(actionModel.isEnabled() && popupModel.isEnabled());

        SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(commandButton);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities
                .getBorderPainter(commandButton);

        // layer number one - background with the combined enabled
        // state of both models. Full opacity
        // System.out.println("Background layer");
        BufferedImage fullAlphaBackground = CommandButtonBackgroundDelegate.getFullAlphaBackground(
                commandButton, backgroundModel, fillPainter, borderPainter,
                commandButton.getWidth(), commandButton.getHeight(), null, false);

        BufferedImage layers = SubstanceCoreUtilities.getBlankImage(fullAlphaBackground.getWidth(),
                fullAlphaBackground.getHeight());
        Graphics2D combinedGraphics = layers.createGraphics();
        double scaleFactor = UIUtil.getScaleFactor();
        combinedGraphics.drawImage(fullAlphaBackground, 0, 0,
                (int) (fullAlphaBackground.getWidth() / scaleFactor),
                (int) (fullAlphaBackground.getHeight() / scaleFactor), null);

        ActionPopupTransitionAwareUI ui = (ActionPopupTransitionAwareUI) commandButton.getUI();

        if (actionModel.isEnabled() && popupModel.isEnabled()) {
            // layer number two - background with the combined rollover state
            // of both models. Opacity 60%.
            backgroundModel.setRollover(actionModel.isRollover() || popupModel.isRollover()
                    || popupModel.isPopupShowing());
            // System.out.println(actionModel.isRollover() + ":"
            // + popupModel.isRollover());
            combinedGraphics.setComposite(AlphaComposite.SrcOver.derive(0.6f));
            // System.out.println("Rollover layer");
            BufferedImage rolloverBackground = CommandButtonBackgroundDelegate
                    .getFullAlphaBackground(commandButton, backgroundModel, fillPainter,
                            borderPainter, commandButton.getWidth(), commandButton.getHeight(),
                            ui.getTransitionTracker(), false);
            combinedGraphics.drawImage(rolloverBackground, 0, 0,
                    (int) (rolloverBackground.getWidth() / scaleFactor),
                    (int) (rolloverBackground.getHeight() / scaleFactor), null);
        }

        // Shape currClip = combinedGraphics.getClip();
        if ((actionArea != null) && !actionArea.isEmpty()) {
            // layer number three - action area with its model. Opacity 40%
            // for enabled popup area, 100% for disabled popup area
            Graphics2D graphicsAction = (Graphics2D) combinedGraphics.create();
            // System.out.println(actionArea);
            graphicsAction.clip(actionArea);
            // System.out.println(graphicsAction.getClipBounds());
            float actionAlpha = 0.4f;
            if ((popupModel != null) && !popupModel.isEnabled())
                actionAlpha = 1.0f;
            if (!actionModel.isEnabled())
                actionAlpha = 0.0f;
            graphicsAction.setComposite(AlphaComposite.SrcOver.derive(actionAlpha));
            BufferedImage actionAreaBackground = CommandButtonBackgroundDelegate
                    .getFullAlphaBackground(commandButton, null, fillPainter, borderPainter,
                            commandButton.getWidth(), commandButton.getHeight(),
                            ui.getActionTransitionTracker(), false);
            graphicsAction.drawImage(actionAreaBackground, 0, 0,
                    (int) (actionAreaBackground.getWidth() / scaleFactor),
                    (int) (actionAreaBackground.getHeight() / scaleFactor), null);
            // graphicsAction.setColor(Color.red);
            // graphicsAction.fill(toFill);
            graphicsAction.dispose();
        }
        // combinedGraphics.setClip(currClip);
        if ((popupArea != null) && !popupArea.isEmpty()) {
            // layer number four - popup area with its model. Opacity 40%
            // for enabled action area, 100% for disabled action area
            Graphics2D graphicsPopup = (Graphics2D) combinedGraphics.create();
            // System.out.println(popupArea);
            graphicsPopup.clip(popupArea);
            // System.out.println(graphicsPopup.getClipBounds());
            float popupAlpha = 0.4f;
            if (!actionModel.isEnabled())
                popupAlpha = 1.0f;
            if ((popupModel != null) && !popupModel.isEnabled())
                popupAlpha = 0.0f;
            graphicsPopup.setComposite(AlphaComposite.SrcOver.derive(popupAlpha));
            // System.out.println(popupAlpha + ":"
            // + ComponentState.getState(popupModel, this.commandButton));
            BufferedImage popupAreaBackground = CommandButtonBackgroundDelegate
                    .getFullAlphaBackground(commandButton, null, fillPainter, borderPainter,
                            commandButton.getWidth(), commandButton.getHeight(),
                            ui.getPopupTransitionTracker(), false);
            graphicsPopup.drawImage(popupAreaBackground, 0, 0,
                    (int) (popupAreaBackground.getWidth() / scaleFactor),
                    (int) (popupAreaBackground.getHeight() / scaleFactor), null);
            // graphicsPopup.setColor(Color.blue);
            // graphicsPopup.fill(toFill);
            graphicsPopup.dispose();
        }
        combinedGraphics.dispose();
        // System.out.println(imageCache.size());
        return layers;
    }

    /**
     * Returns the memory usage string.
     * 
     * @return Memory usage string.
     */
    static String getMemoryUsage() {
        StringBuffer sb = new StringBuffer();
        sb.append("SubstanceBackgroundDelegate: \n");
        sb.append("\t" + imageCache.size() + " regular");
        // + pairwiseBackgrounds.size() + " pairwise");
        return sb.toString();
    }

    public static void paintCommandButtonIcon(Graphics2D g, Rectangle iconRect,
            AbstractCommandButton commandButton, Icon regular, GlowingResizableIcon glowingIcon,
            ButtonModel model, StateTransitionTracker stateTransitionTracker) {
        boolean useThemed = SubstanceCoreUtilities.useThemedDefaultIcon(commandButton);
        Icon themed = useThemed ? SubstanceCoreUtilities.getThemedIcon(commandButton, regular)
                : regular;

        boolean useRegularVersion = (model.isArmed() || model.isPressed() || model.isSelected()
                || regular.getClass().isAnnotationPresent(TransitionAware.class));
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.translate(iconRect.x, iconRect.y);

        float alpha = stateTransitionTracker.getActiveStrength();
        if (alpha > 0 && glowingIcon != null && model.isEnabled()
                && AnimationConfigurationManager.getInstance()
                        .isAnimationAllowed(AnimationFacet.ICON_GLOW, commandButton)
                && stateTransitionTracker.getIconGlowTracker().isPlaying()) {
            glowingIcon.paintIcon(commandButton, g2d, 0, 0);
            return;
        }

        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        if (useRegularVersion) {
            regular.paintIcon(commandButton, g2d, 0, 0);
        } else {
            double scaleFactor = UIUtil.getScaleFactor();
            if (alpha < 1.0f) {
                // paint the themed image full opaque on a separate image
                BufferedImage themedImage = SubstanceCoreUtilities
                        .getBlankImage(themed.getIconWidth(), themed.getIconHeight());
                themed.paintIcon(commandButton, themedImage.createGraphics(), 0, 0);
                // and paint that image translucently
                g2d.setComposite(WidgetUtilities.getAlphaComposite(commandButton, 1.0f - alpha, g));
                g2d.drawImage(themedImage, 0, 0, (int) (themedImage.getWidth() / scaleFactor),
                        (int) (themedImage.getHeight() / scaleFactor), null);
            }

            if (alpha > 0.0f) {
                // paint the regular image full opaque on a separate image
                BufferedImage regularImage = SubstanceCoreUtilities
                        .getBlankImage(regular.getIconWidth(), regular.getIconHeight());
                regular.paintIcon(commandButton, regularImage.createGraphics(), 0, 0);
                // and paint that image translucently
                g2d.setComposite(WidgetUtilities.getAlphaComposite(commandButton, alpha, g));
                g2d.drawImage(regularImage, 0, 0, (int) (regularImage.getWidth() / scaleFactor),
                        (int) (regularImage.getHeight() / scaleFactor), null);
            }
        }
        g2d.dispose();
    }
}
