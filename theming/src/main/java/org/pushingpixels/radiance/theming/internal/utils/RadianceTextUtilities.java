/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.utils.border.RadianceTextComponentBorder;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.util.Map;

/**
 * Text-related utilities. This class is for internal use only.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceTextUtilities {
    /**
     * Paints text with drop shadow.
     *
     * @param c               Component.
     * @param g               Graphics context.
     * @param foregroundColor Foreground color.
     * @param text            Text to paint.
     * @param width           Text rectangle width.
     * @param height          Text rectangle height.
     * @param xOffset         Text rectangle X offset.
     * @param yOffset         Text rectangle Y offset.
     */
    public static void paintTextWithDropShadow(JComponent c, Graphics g, Color foregroundColor,
            Color echoColor, String text, int width, int height, int xOffset, int yOffset) {
        Graphics2D graphics = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(graphics, c.getFont());

        // blur the text shadow
        BufferedImage blurred = RadianceCoreUtilities.getBlankImage(
                RadianceCommonCortex.getScaleFactor(c), width, height);
        Graphics2D gBlurred = (Graphics2D) blurred.getGraphics();
        gBlurred.setFont(graphics.getFont());
        gBlurred.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        float luminFactor = RadianceColorUtilities.getColorStrength(foregroundColor);
        gBlurred.setColor(echoColor);
        ConvolveOp convolve = new ConvolveOp(
                new Kernel(3, 3,
                        new float[] {.04f, .06f, .04f, .06f, .04f, .06f, .04f, .06f, .04f}),
                ConvolveOp.EDGE_NO_OP, null);
        gBlurred.drawString(text, xOffset, yOffset);
        blurred = convolve.filter(blurred, null);

        graphics.setComposite(WidgetUtilities.getAlphaComposite(c, luminFactor, g));
        double scaleFactor = RadianceCommonCortex.getScaleFactor(c);
        graphics.drawImage(blurred, 0, 0, (int) (blurred.getWidth() / scaleFactor),
                (int) (blurred.getHeight() / scaleFactor), null);
        graphics.setComposite(WidgetUtilities.getAlphaComposite(c, g));

        FontMetrics fm = graphics.getFontMetrics();
        RadianceTextUtilities.paintText(graphics,
                new Rectangle(xOffset, yOffset - fm.getAscent(), width - xOffset, fm.getHeight()),
                text, -1, graphics.getFont(), foregroundColor, graphics.getClipBounds());

        graphics.dispose();
    }

    /**
     * Paints the specified text.
     *
     * @param g             Graphics context.
     * @param textRect      Text rectangle.
     * @param text          Text to paint.
     * @param mnemonicIndex Mnemonic index.
     * @param font          Font to use.
     * @param color         Color to use.
     * @param clip          Optional clip. Can be <code>null</code>.
     * @param transform     Optional transform to apply. Can be <code>null</code>.
     */
    private static void paintText(Graphics g, Rectangle textRect, String text,
            int mnemonicIndex, java.awt.Font font, java.awt.Color color, java.awt.Rectangle clip,
            java.awt.geom.AffineTransform transform) {
        if ((text == null) || (text.length() == 0)) {
            return;
        }

        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setFont(font);
        g2d.setColor(color);

        // Important - it appears that there's a bug in OpenJDK where the FontMetrics reports
        // ascent=0 after applying an AffineTransform. This is why the computation of offsets is
        // done before applying the transform ¯\_(ツ)_/¯
        int dx = textRect.x;
        int dy = textRect.y + g2d.getFontMetrics().getAscent();

        if (clip != null) {
            // Use clip() instead of setClip() to respect the currently set clip shape
            g2d.clip(clip);
        }
        if (transform != null) {
            // Use transform() instead of setTransform() to chain transforms instead of wiping
            g2d.transform(transform);
        }
        BasicGraphicsUtils.drawStringUnderlineCharAt(g2d, text, mnemonicIndex, dx, dy);
        g2d.dispose();
    }

    /**
     * Paints the specified text.
     *
     * @param g             Graphics context.
     * @param textRect      Text rectangle.
     * @param text          Text to paint.
     * @param mnemonicIndex Mnemonic index.
     * @param font          Font to use.
     * @param color         Color to use.
     * @param clip          Optional clip. Can be <code>null</code>.
     */
    public static void paintText(Graphics g, Rectangle textRect, String text,
            int mnemonicIndex, java.awt.Font font, java.awt.Color color, java.awt.Rectangle clip) {
        RadianceTextUtilities.paintText(g, textRect, text, mnemonicIndex, font, color, clip, null);
    }

    /**
     * Paints the specified vertical text.
     *
     * @param g                 Graphics context.
     * @param textRect          Text rectangle.
     * @param text              Text to paint.
     * @param mnemonicIndex     Mnemonic index.
     * @param font              Font to use.
     * @param color             Color to use.
     * @param clip              Optional clip. Can be <code>null</code>.
     * @param isFromBottomToTop If <code>true</code>, the text will be painted from bottom to top, otherwise the
     *                          text will be painted from top to bottom.
     */
    public static void paintVerticalText(Graphics g, Rectangle textRect, String text, int mnemonicIndex,
            Font font, Color color, Rectangle clip, boolean isFromBottomToTop) {
        if ((text == null) || (text.length() == 0)) {
            return;
        }

        AffineTransform at;

        if (!isFromBottomToTop) {
            at = AffineTransform.getTranslateInstance(textRect.x + textRect.width, textRect.y);
            at.rotate(Math.PI / 2);
        } else {
            at = AffineTransform.getTranslateInstance(textRect.x, textRect.y + textRect.height);
            at.rotate(-Math.PI / 2);
        }
        Rectangle newRect = new Rectangle(0, 0, textRect.width, textRect.height);

        RadianceTextUtilities.paintText(g, newRect, text, mnemonicIndex, font, color, clip, at);
    }

    /**
     * Paints the text of the specified button.
     *
     * @param g             Graphic context.
     * @param button        Button
     * @param textRect      Text rectangle
     * @param text          Text to paint
     * @param mnemonicIndex Mnemonic index.
     */
    public static Color paintText(Graphics g, AbstractButton button, Rectangle textRect, String text,
            int mnemonicIndex) {
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) button.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();

        if (button instanceof JMenuItem) {
            // A slightly different path for menu items as we ignore the selection
            // state for visual consistency in menu content
            float menuItemAlpha = RadianceColorSchemeUtilities.getAlpha(button,
                    ComponentState.getState(button.getModel(), button, true));
            return paintMenuItemText(g, (JMenuItem) button, textRect, text, mnemonicIndex,
                    stateTransitionTracker.getModelStateInfo(), menuItemAlpha);
        } else {
            float buttonAlpha = RadianceColorSchemeUtilities.getAlpha(button,
                    ComponentState.getState(button));
            return paintText(g, button, textRect, text, mnemonicIndex,
                    stateTransitionTracker.getModelStateInfo(), buttonAlpha);
        }
    }

    /**
     * Paints the specified text.
     *
     * @param g             Graphics context.
     * @param component     Component.
     * @param textRect      Text rectangle.
     * @param text          Text to paint.
     * @param mnemonicIndex Mnemonic index.
     * @param state         Component state.
     * @param textAlpha     Alpha channel for painting the text.
     */
    public static Color paintText(Graphics g, JComponent component, Rectangle textRect, String text,
            int mnemonicIndex, ComponentState state, float textAlpha) {
        Color fgColor = getForegroundColor(component, state, textAlpha);

        RadianceTextUtilities.paintText(g, textRect, text, mnemonicIndex, component.getFont(), fgColor, null);

        return fgColor;
    }

    public static Color paintText(Graphics g, JComponent component, Rectangle textRect, String text,
            int mnemonicIndex, StateTransitionTracker.ModelStateInfo modelStateInfo, float textAlpha) {
        Color fgColor = getForegroundColor(component, text, modelStateInfo, textAlpha);

        RadianceTextUtilities.paintText(g, textRect, text, mnemonicIndex, component.getFont(), fgColor, null);

        return fgColor;
    }

    public static Color paintMenuItemText(Graphics g, JMenuItem menuItem, Rectangle textRect,
            String text, int mnemonicIndex, StateTransitionTracker.ModelStateInfo modelStateInfo,
            float textAlpha) {
        Color fgColor = getMenuComponentForegroundColor(menuItem, text, modelStateInfo, textAlpha);

        RadianceTextUtilities.paintText(g, textRect, text, mnemonicIndex, menuItem.getFont(), fgColor, null);

        return fgColor;
    }

    /**
     * Returns the foreground color for the specified component.
     *
     * @param component Component.
     * @param state     Component state.
     * @param textAlpha Alpha channel for painting the text. If value is less than 1.0, the result is an
     *                  opaque color which is an interpolation between the "real" foreground color and the
     *                  background color of the component. This is done to ensure that native text
     *                  rasterization will be performed on Windows.
     * @return The foreground color for the specified component.
     */
    public static Color getForegroundColor(JComponent component, ComponentState state, float textAlpha) {
        boolean toEnforceFgColor = (SwingUtilities.getAncestorOfClass(CellRendererPane.class, component) != null);

        Color fgColor = toEnforceFgColor ? component.getForeground()
                : RadianceColorSchemeUtilities.getColorScheme(component, state).getForegroundColor();

        if (textAlpha < 1.0f) {
            Color bgFillColor = RadianceColorUtilities.getBackgroundFillColor(component);
            fgColor = RadianceColorUtilities.getInterpolatedColor(fgColor, bgFillColor, textAlpha);
        }
        return fgColor;
    }

    /**
     * Returns the foreground color for the specified component.
     *
     * @param component Component.
     * @param text      Text. If empty or <code>null</code>, the result is <code>null</code>.
     * @param textAlpha Alpha channel for painting the text. If value is less than 1.0, the result is an
     *                  opaque color which is an interpolation between the "real" foreground color and the
     *                  background color of the component. This is done to ensure that native text
     *                  rasterization will be performed on Windows.
     * @return The foreground color for the specified component.
     */
    public static Color getForegroundColor(JComponent component, String text,
            StateTransitionTracker.ModelStateInfo modelStateInfo, float textAlpha) {
        if ((text == null) || (text.length() == 0)) {
            return null;
        }

        boolean toEnforceFgColor = (SwingUtilities.getAncestorOfClass(CellRendererPane.class, component) != null);

        Color fgColor = toEnforceFgColor ? component.getForeground()
                : RadianceColorUtilities.getForegroundColor(component, modelStateInfo);
        if (textAlpha < 1.0f) {
            Color bgFillColor = RadianceColorUtilities.getBackgroundFillColor(component);
            fgColor = RadianceColorUtilities.getInterpolatedColor(fgColor, bgFillColor, textAlpha);
        }
        return fgColor;
    }

    /**
     * Returns the foreground color for the specified menu component.
     *
     * @param menuComponent  Menu component.
     * @param text           Text. If empty or <code>null</code>, the result is <code>null</code>.
     * @param modelStateInfo Model state info for the specified component.
     * @param textAlpha      Alpha channel for painting the text. If value is less than 1.0, the result is an
     *                       opaque color which is an interpolation between the "real" foreground color and the
     *                       background color of the component. This is done to ensure that native text
     *                       rasterization will be performed on Windows.
     * @return The foreground color for the specified menu component.
     */
    public static Color getMenuComponentForegroundColor(JMenuItem menuComponent, String text,
            StateTransitionTracker.ModelStateInfo modelStateInfo, float textAlpha) {
        if ((text == null) || (text.length() == 0)) {
            return null;
        }

        Color fgColor = RadianceColorUtilities.getMenuComponentForegroundColor(menuComponent, modelStateInfo);

        if (textAlpha < 1.0f) {
            Color bgFillColor = RadianceColorUtilities.getBackgroundFillColor(menuComponent);
            fgColor = RadianceColorUtilities.getInterpolatedColor(fgColor, bgFillColor, textAlpha);
        }
        return fgColor;
    }

    public static Color getTextBackgroundFillColor(JComponent comp) {
        Color backgroundFillColor = RadianceColorUtilities.getBackgroundFillColor(comp);

        JTextComponent componentForTransitions = RadianceCoreUtilities.getTextComponentForTransitions(comp);

        if (componentForTransitions != null) {
            ComponentUI ui = componentForTransitions.getUI();
            if (ui instanceof TransitionAwareUI) {
                TransitionAwareUI trackable = (TransitionAwareUI) ui;
                StateTransitionTracker stateTransitionTracker = trackable.getTransitionTracker();

                float lightnessFactor = RadianceColorSchemeUtilities.getColorScheme(componentForTransitions,
                        componentForTransitions.isEnabled() ? ComponentState.ENABLED
                                : ComponentState.DISABLED_UNSELECTED).isDark() ? 0.1f : 0.4f;
                Color lighterFill = RadianceColorUtilities.getLighterColor(backgroundFillColor,
                        lightnessFactor);
                lighterFill = RadianceColorUtilities.getInterpolatedColor(lighterFill,
                        backgroundFillColor, 0.6);

                float selectionStrength = stateTransitionTracker.getFacetStrength(RadianceThemingSlices.ComponentStateFacet.SELECTION);
                float rolloverStrength = stateTransitionTracker.getFacetStrength(RadianceThemingSlices.ComponentStateFacet.ROLLOVER);
                backgroundFillColor = RadianceColorUtilities.getInterpolatedColor(lighterFill,
                        backgroundFillColor, Math.max(selectionStrength, rolloverStrength) / 4.0f);
            }
        }
        return backgroundFillColor;
    }

    public static Color getTextSelectionBackground(JTextComponent comp) {
        TransitionAwareUI ui = (TransitionAwareUI) comp.getUI();
        StateTransitionTracker stateTransitionTracker = ui.getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker.getModelStateInfo();
        ComponentState state = modelStateInfo.getCurrModelState();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateContributionMap();

        if (state == ComponentState.ENABLED) {
            // Treat ENABLED state as SELECTED (since we are talking about selections)
            state = ComponentState.SELECTED;
        }
        Color result = RadianceCoreUtilities.getTextSelectionBackground(comp, state);
        if (!state.isDisabled() && (activeStates != null) && (activeStates.size() > 1)) {
            // If we have more than one active state, compute the composite color from all
            // the contributions
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                    activeStates.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == state) {
                    continue;
                }

                if (activeState == ComponentState.ENABLED) {
                    // Treat ENABLED state as SELECTED (since we are talking about selections)
                    activeState = ComponentState.SELECTED;
                }
                float contribution = activeEntry.getValue().getContribution();
                if (contribution == 0.0f) {
                    continue;
                }

                float alpha = RadianceColorSchemeUtilities.getAlpha(comp, activeState);
                if (alpha == 0.0f) {
                    continue;
                }

                Color active = RadianceCoreUtilities.getTextSelectionBackground(comp, activeState);
                result = RadianceColorUtilities.getInterpolatedColor(result, active, 1.0f - contribution * alpha);
            }
        }
        return result;
    }

    public static Color getTextSelectionForeground(JTextComponent comp) {
        TransitionAwareUI ui = (TransitionAwareUI) comp.getUI();
        StateTransitionTracker stateTransitionTracker = ui.getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker.getModelStateInfo();
        ComponentState state = modelStateInfo.getCurrModelState();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateContributionMap();

        if (state == ComponentState.ENABLED) {
            // Treat ENABLED state as SELECTED (since we are talking about selections)
            state = ComponentState.SELECTED;
        }
        Color result = RadianceCoreUtilities.getTextSelectionForeground(comp, state);
        if (!state.isDisabled() && (activeStates != null) && (activeStates.size() > 1)) {
            // If we have more than one active state, compute the composite color from all
            // the contributions
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                    activeStates.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == state) {
                    continue;
                }

                if (activeState == ComponentState.ENABLED) {
                    // Treat ENABLED state as SELECTED (since we are talking about selections)
                    activeState = ComponentState.SELECTED;
                }
                float contribution = activeEntry.getValue().getContribution();
                if (contribution == 0.0f) {
                    continue;
                }

                float alpha = RadianceColorSchemeUtilities.getAlpha(comp, activeState);
                if (alpha == 0.0f) {
                    continue;
                }

                Color active = RadianceCoreUtilities.getTextSelectionForeground(comp, activeState);
                result = RadianceColorUtilities.getInterpolatedColor(result, active, 1.0f - contribution * alpha);
            }
        }
        return result;
    }

    /**
     * Paints background of the specified text component.
     *
     * @param g    Graphics context.
     * @param comp Component.
     */
    public static void paintTextCompBackground(Graphics g, JComponent comp) {
        Graphics2D g2d = (Graphics2D) g.create();

        BackgroundPaintingUtils.update(g2d, comp, false);

        Color backgroundFillColor = getTextBackgroundFillColor(comp);
        g2d.setColor(backgroundFillColor);

        // Match the logic / shape in RadianceImageCreator.paintSimpleBorder that draws the
        // border
        float borderStrokeWidth = RadianceSizeUtils.getBorderStrokeWidth(comp);
        g2d.fill(new Rectangle2D.Float(borderStrokeWidth / 2.0f, borderStrokeWidth / 2.0f,
                comp.getWidth() - borderStrokeWidth, comp.getHeight() - borderStrokeWidth));

        ComponentState state = comp.isEnabled() ? ComponentState.ENABLED : ComponentState.DISABLED_UNSELECTED;
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = null;
        JTextComponent componentForTransitions = RadianceCoreUtilities
                .getTextComponentForTransitions(comp);
        if (componentForTransitions != null) {
            ComponentUI ui = componentForTransitions.getUI();
            if (ui instanceof TransitionAwareUI) {
                TransitionAwareUI trackable = (TransitionAwareUI) ui;
                StateTransitionTracker stateTransitionTracker = trackable.getTransitionTracker();
                StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                        .getModelStateInfo();
                state = modelStateInfo.getCurrModelState();
                activeStates = modelStateInfo.getStateContributionMap();
            }
        }

        if ((componentForTransitions != null) && !componentForTransitions.isEditable()) {
            // don't paint top shadow on non-editable text fields
            return;
        }

        RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(comp);
        // Get the base border color
        RadianceColorScheme baseBorderScheme = RadianceColorSchemeUtilities.getColorScheme(comp,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, state);
        Color borderColor = borderPainter.getRepresentativeColor(baseBorderScheme);

        if (!state.isDisabled() && (activeStates != null) && (activeStates.size() > 1)) {
            // If we have more than one active state, compute the composite color from all
            // the contributions
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                    activeStates.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == state) {
                    continue;
                }

                float contribution = activeEntry.getValue().getContribution();
                if (contribution == 0.0f) {
                    continue;
                }

                float alpha = RadianceColorSchemeUtilities.getAlpha(componentForTransitions, activeState);
                if (alpha == 0.0f) {
                    continue;
                }

                RadianceColorScheme activeBorderScheme = RadianceColorSchemeUtilities
                        .getColorScheme(componentForTransitions, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                                activeState);
                Color activeBorderColor = borderPainter.getRepresentativeColor(activeBorderScheme);
                borderColor = RadianceColorUtilities.getInterpolatedColor(borderColor,
                        activeBorderColor, 1.0f - contribution * alpha);
            }
        }
        // At this point we should have the color that matches the border color. Use that to
        // paint emulated drop shadow along the top edge of the component.
        if (hasRadianceTextBorder(comp)) {
            int shadowHeight = 6;
            int topAlpha = state.isDisabled() ? 16 : 32;
            g2d.setPaint(new GradientPaint(0, 0,
                    RadianceColorUtilities.getAlphaColor(borderColor, topAlpha), 0, shadowHeight,
                    RadianceColorUtilities.getAlphaColor(borderColor, 0)));
            float yTop = RadianceSizeUtils.getBorderStrokeWidth(comp);
            g2d.fill(new Rectangle2D.Float(borderStrokeWidth, yTop,
                    comp.getWidth() - 2 * borderStrokeWidth, shadowHeight));
        }
        g2d.dispose();
    }

    private static boolean hasRadianceTextBorder(JComponent comp) {
        Border border = comp.getBorder();
        if (border instanceof RadianceTextComponentBorder) {
            return true;
        }
        if (border instanceof CompoundBorder) {
            CompoundBorder compoundBorder = (CompoundBorder) border;
            return (compoundBorder.getOutsideBorder() instanceof RadianceTextComponentBorder) ||
                    (compoundBorder.getInsideBorder() instanceof RadianceTextComponentBorder);
        }
        return false;
    }
}

