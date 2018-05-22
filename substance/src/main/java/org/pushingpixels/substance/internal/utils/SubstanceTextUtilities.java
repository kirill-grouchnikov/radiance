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

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.CellRendererPane;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.text.JTextComponent;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.utils.border.SubstanceTextComponentBorder;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;

/**
 * Text-related utilities. This class if for internal use only.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceTextUtilities {
    public static final String ENFORCE_FG_COLOR = "substancelaf.internal.textUtilities.enforceFgColor";

    /**
     * Paints text with drop shadow.
     * 
     * @param c
     *            Component.
     * @param g
     *            Graphics context.
     * @param foregroundColor
     *            Foreground color.
     * @param text
     *            Text to paint.
     * @param width
     *            Text rectangle width.
     * @param height
     *            Text rectangle height.
     * @param xOffset
     *            Text rectangle X offset.
     * @param yOffset
     *            Text rectangle Y offset.
     */
    public static void paintTextWithDropShadow(JComponent c, Graphics g, Color foregroundColor,
            Color echoColor, String text, int width, int height, int xOffset, int yOffset) {
        Graphics2D graphics = (Graphics2D) g.create();
        RenderingUtils.installDesktopHints(graphics, c);

        // blur the text shadow
        BufferedImage blurred = SubstanceCoreUtilities.getBlankImage(width, height);
        Graphics2D gBlurred = (Graphics2D) blurred.getGraphics();
        gBlurred.setFont(graphics.getFont());
        gBlurred.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        float luminFactor = SubstanceColorUtilities.getColorStrength(foregroundColor);
        gBlurred.setColor(echoColor);
        ConvolveOp convolve = new ConvolveOp(
                new Kernel(3, 3,
                        new float[] { .04f, .06f, .04f, .06f, .04f, .06f, .04f, .06f, .04f }),
                ConvolveOp.EDGE_NO_OP, null);
        gBlurred.drawString(text, xOffset, yOffset);
        blurred = convolve.filter(blurred, null);

        graphics.setComposite(WidgetUtilities.getAlphaComposite(c, luminFactor, g));
        double scaleFactor = UIUtil.getScaleFactor();
        graphics.drawImage(blurred, 0, 0, (int) (blurred.getWidth() / scaleFactor),
                (int) (blurred.getHeight() / scaleFactor), null);
        graphics.setComposite(WidgetUtilities.getAlphaComposite(c, g));

        FontMetrics fm = graphics.getFontMetrics();
        SubstanceTextUtilities.paintText(graphics, c,
                new Rectangle(xOffset, yOffset - fm.getAscent(), width - xOffset, fm.getHeight()),
                text, -1, graphics.getFont(), foregroundColor, graphics.getClipBounds());

        graphics.dispose();
    }

    /**
     * Paints the specified text.
     * 
     * @param g
     *            Graphics context.
     * @param comp
     *            Component.
     * @param textRect
     *            Text rectangle.
     * @param text
     *            Text to paint.
     * @param mnemonicIndex
     *            Mnemonic index.
     * @param font
     *            Font to use.
     * @param color
     *            Color to use.
     * @param clip
     *            Optional clip. Can be <code>null</code>.
     * @param transform
     *            Optional transform to apply. Can be <code>null</code>.
     */
    private static void paintText(Graphics g, JComponent comp, Rectangle textRect, String text,
            int mnemonicIndex, java.awt.Font font, java.awt.Color color, java.awt.Rectangle clip,
            java.awt.geom.AffineTransform transform) {
        if ((text == null) || (text.length() == 0))
            return;

        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setFont(font);
        g2d.setColor(color);
        // fix for issue 420 - call clip() instead of setClip() to
        // respect the currently set clip shape
        if (clip != null)
            g2d.clip(clip);
        if (transform != null)
            g2d.transform(transform);
        BasicGraphicsUtils.drawStringUnderlineCharAt(g2d, text, mnemonicIndex, textRect.x,
                textRect.y + g2d.getFontMetrics().getAscent());
        g2d.dispose();
    }

    /**
     * Paints the specified text.
     * 
     * @param g
     *            Graphics context.
     * @param comp
     *            Component.
     * @param textRect
     *            Text rectangle.
     * @param text
     *            Text to paint.
     * @param mnemonicIndex
     *            Mnemonic index.
     * @param font
     *            Font to use.
     * @param color
     *            Color to use.
     * @param clip
     *            Optional clip. Can be <code>null</code>.
     */
    public static void paintText(Graphics g, JComponent comp, Rectangle textRect, String text,
            int mnemonicIndex, java.awt.Font font, java.awt.Color color, java.awt.Rectangle clip) {
        SubstanceTextUtilities.paintText(g, comp, textRect, text, mnemonicIndex, font, color, clip,
                null);
    }

    /**
     * Paints the specified vertical text.
     * 
     * @param g
     *            Graphics context.
     * @param comp
     *            Component.
     * @param textRect
     *            Text rectangle.
     * @param text
     *            Text to paint.
     * @param mnemonicIndex
     *            Mnemonic index.
     * @param font
     *            Font to use.
     * @param color
     *            Color to use.
     * @param clip
     *            Optional clip. Can be <code>null</code>.
     * @param isFromBottomToTop
     *            If <code>true</code>, the text will be painted from bottom to top, otherwise the
     *            text will be painted from top to bottom.
     */
    public static void paintVerticalText(Graphics g, JComponent comp, Rectangle textRect,
            String text, int mnemonicIndex, java.awt.Font font, java.awt.Color color,
            java.awt.Rectangle clip, boolean isFromBottomToTop) {
        if ((text == null) || (text.length() == 0))
            return;

        AffineTransform at = null;

        if (!isFromBottomToTop) {
            at = AffineTransform.getTranslateInstance(textRect.x + textRect.width, textRect.y);
            at.rotate(Math.PI / 2);
        } else {
            at = AffineTransform.getTranslateInstance(textRect.x, textRect.y + textRect.height);
            at.rotate(-Math.PI / 2);
        }
        Rectangle newRect = new Rectangle(0, 0, textRect.width, textRect.height);

        SubstanceTextUtilities.paintText(g, comp, newRect, text, mnemonicIndex, font, color, clip,
                at);
    }

    /**
     * Paints the text of the specified button.
     * 
     * @param g
     *            Graphic context.
     * @param button
     *            Button
     * @param textRect
     *            Text rectangle
     * @param text
     *            Text to paint
     * @param mnemonicIndex
     *            Mnemonic index.
     */
    public static void paintText(Graphics g, AbstractButton button, Rectangle textRect, String text,
            int mnemonicIndex) {
        paintText(g, button, button.getModel(), textRect, text, mnemonicIndex);
    }

    /**
     * Paints the text of the specified button.
     * 
     * @param g
     *            Graphic context.
     * @param button
     *            Button
     * @param model
     *            Button model.
     * @param textRect
     *            Text rectangle
     * @param text
     *            Text to paint
     * @param mnemonicIndex
     *            Mnemonic index.
     */
    public static void paintText(Graphics g, AbstractButton button, ButtonModel model,
            Rectangle textRect, String text, int mnemonicIndex) {
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) button.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();

        if (button instanceof JMenuItem) {
            // A slightly different path for menu items as we ignore the selection
            // state for visual consistency in menu content
            float menuItemAlpha = SubstanceColorSchemeUtilities.getAlpha(button,
                    ComponentState.getState(button.getModel(), button, true));
            paintMenuItemText(g, (JMenuItem) button, textRect, text, mnemonicIndex,
                    stateTransitionTracker.getModelStateInfo(), menuItemAlpha);
        } else {
            float buttonAlpha = SubstanceColorSchemeUtilities.getAlpha(button,
                    ComponentState.getState(button));
            paintText(g, button, textRect, text, mnemonicIndex,
                    stateTransitionTracker.getModelStateInfo(), buttonAlpha);
        }
    }

    /**
     * Paints the specified text.
     * 
     * @param g
     *            Graphics context.
     * @param component
     *            Component.
     * @param textRect
     *            Text rectangle.
     * @param text
     *            Text to paint.
     * @param mnemonicIndex
     *            Mnemonic index.
     * @param state
     *            Component state.
     * @param prevState
     *            Component previous state.
     * @param textAlpha
     *            Alpha channel for painting the text.
     */
    public static void paintText(Graphics g, JComponent component, Rectangle textRect, String text,
            int mnemonicIndex, ComponentState state, float textAlpha) {
        Color fgColor = getForegroundColor(component, text, state, textAlpha);

        SubstanceTextUtilities.paintText(g, component, textRect, text, mnemonicIndex,
                component.getFont(), fgColor, null);
    }

    public static void paintText(Graphics g, JComponent component, Rectangle textRect, String text,
            int mnemonicIndex, StateTransitionTracker.ModelStateInfo modelStateInfo,
            float textAlpha) {
        Color fgColor = getForegroundColor(component, text, modelStateInfo, textAlpha);

        SubstanceTextUtilities.paintText(g, component, textRect, text, mnemonicIndex,
                component.getFont(), fgColor, null);
    }

    public static void paintMenuItemText(Graphics g, JMenuItem menuItem, Rectangle textRect,
            String text, int mnemonicIndex, StateTransitionTracker.ModelStateInfo modelStateInfo,
            float textAlpha) {
        Color fgColor = getMenuComponentForegroundColor(menuItem, text, modelStateInfo, textAlpha);

        SubstanceTextUtilities.paintText(g, menuItem, textRect, text, mnemonicIndex,
                menuItem.getFont(), fgColor, null);
    }

    /**
     * Returns the foreground color for the specified component.
     * 
     * @param component
     *            Component.
     * @param text
     *            Text. If empty or <code>null</code>, the result is <code>null</code>.
     * @param state
     *            Component state.
     * @param textAlpha
     *            Alpha channel for painting the text. If value is less than 1.0, the result is an
     *            opaque color which is an interpolation between the "real" foreground color and the
     *            background color of the component. This is done to ensure that native text
     *            rasterization will be performed on 6u10+ on Windows.
     * @return The foreground color for the specified component.
     */
    public static Color getForegroundColor(JComponent component, String text, ComponentState state,
            float textAlpha) {
        if ((text == null) || (text.length() == 0))
            return null;

        boolean toEnforceFgColor = (SwingUtilities.getAncestorOfClass(CellRendererPane.class,
                component) != null)
                || Boolean.TRUE.equals(component.getClientProperty(ENFORCE_FG_COLOR));

        Color fgColor = toEnforceFgColor ? component.getForeground()
                : SubstanceColorSchemeUtilities.getColorScheme(component, state)
                        .getForegroundColor();

        // System.out.println(text + ":" + prevState.name() + "->" +
        // state.name() + ":" + fgColor);
        if (textAlpha < 1.0f) {
            Color bgFillColor = SubstanceColorUtilities.getBackgroundFillColor(component);
            fgColor = SubstanceColorUtilities.getInterpolatedColor(fgColor, bgFillColor, textAlpha);
        }
        return fgColor;
    }

    /**
     * Returns the foreground color for the specified component.
     * 
     * @param component
     *            Component.
     * @param text
     *            Text. If empty or <code>null</code>, the result is <code>null</code>.
     * @param textAlpha
     *            Alpha channel for painting the text. If value is less than 1.0, the result is an
     *            opaque color which is an interpolation between the "real" foreground color and the
     *            background color of the component. This is done to ensure that native text
     *            rasterization will be performed on 6u10 on Windows.
     * @return The foreground color for the specified component.
     */
    public static Color getForegroundColor(JComponent component, String text,
            StateTransitionTracker.ModelStateInfo modelStateInfo, float textAlpha) {
        if ((text == null) || (text.length() == 0))
            return null;

        boolean toEnforceFgColor = (SwingUtilities.getAncestorOfClass(CellRendererPane.class,
                component) != null)
                || Boolean.TRUE.equals(component.getClientProperty(ENFORCE_FG_COLOR));

        Color fgColor = null;
        if (toEnforceFgColor) {
            fgColor = component.getForeground();
        } else {
            fgColor = SubstanceColorUtilities.getForegroundColor(component, modelStateInfo);
        }

        // System.out.println(text + ":" + prevState.name() + "->" +
        // state.name() + ":" + fgColor);
        if (textAlpha < 1.0f) {
            Color bgFillColor = SubstanceColorUtilities.getBackgroundFillColor(component);
            fgColor = SubstanceColorUtilities.getInterpolatedColor(fgColor, bgFillColor, textAlpha);
        }
        return fgColor;
    }

    /**
     * Returns the foreground color for the specified menu component.
     * 
     * @param menuComponent
     *            Menu component.
     * @param text
     *            Text. If empty or <code>null</code>, the result is <code>null</code>.
     * @param modelStateInfo
     *            Model state info for the specified component.
     * @param textAlpha
     *            Alpha channel for painting the text. If value is less than 1.0, the result is an
     *            opaque color which is an interpolation between the "real" foreground color and the
     *            background color of the component. This is done to ensure that native text
     *            rasterization will be performed on 6u10 on Windows.
     * @return The foreground color for the specified component.
     */
    public static Color getMenuComponentForegroundColor(JMenuItem menuComponent, String text,
            StateTransitionTracker.ModelStateInfo modelStateInfo, float textAlpha) {
        if ((text == null) || (text.length() == 0))
            return null;

        Color fgColor = SubstanceColorUtilities.getMenuComponentForegroundColor(menuComponent,
                modelStateInfo);

        if (textAlpha < 1.0f) {
            Color bgFillColor = SubstanceColorUtilities.getBackgroundFillColor(menuComponent);
            fgColor = SubstanceColorUtilities.getInterpolatedColor(fgColor, bgFillColor, textAlpha);
        }
        return fgColor;
    }

    /**
     * Paints background of the specified text component.
     * 
     * @param g
     *            Graphics context.
     * @param comp
     *            Component.
     */
    public static void paintTextCompBackground(Graphics g, JComponent comp) {
        Color backgroundFillColor = getTextBackgroundFillColor(comp);

        boolean toPaintWatermark = (SubstanceCortex.ComponentScope.getCurrentSkin(comp)
                .getWatermark() != null)
                && (SubstanceCoreUtilities.toDrawWatermark(comp) || !comp.isOpaque());
        paintTextCompBackground(g, comp, backgroundFillColor, toPaintWatermark);
    }

    public static Color getTextBackgroundFillColor(JComponent comp) {
        Color backgroundFillColor = SubstanceColorUtilities.getBackgroundFillColor(comp);

        JTextComponent componentForTransitions = SubstanceCoreUtilities
                .getTextComponentForTransitions(comp);

        if (componentForTransitions != null) {
            ComponentUI ui = componentForTransitions.getUI();
            if (ui instanceof TransitionAwareUI) {
                TransitionAwareUI trackable = (TransitionAwareUI) ui;
                StateTransitionTracker stateTransitionTracker = trackable.getTransitionTracker();

                Color lighterFill = SubstanceColorUtilities.getLighterColor(backgroundFillColor,
                        0.4f);
                lighterFill = SubstanceColorUtilities.getInterpolatedColor(lighterFill,
                        backgroundFillColor, 0.6);

                float selectionStrength = stateTransitionTracker
                        .getFacetStrength(ComponentStateFacet.SELECTION);
                float rolloverStrength = stateTransitionTracker
                        .getFacetStrength(ComponentStateFacet.ROLLOVER);
                backgroundFillColor = SubstanceColorUtilities.getInterpolatedColor(lighterFill,
                        backgroundFillColor, Math.max(selectionStrength, rolloverStrength) / 4.0f);
            }
        }
        return backgroundFillColor;
    }

    /**
     * Paints background of the specified text component.
     * 
     * @param g
     *            Graphics context.
     * @param comp
     *            Component.
     * @param backgr
     *            Background color.
     * @param toOverlayWatermark
     *            If <code>true</code>, this method will paint the watermark overlay on top of the
     *            background fill.
     */
    private static void paintTextCompBackground(Graphics g, JComponent comp, Color backgr,
            boolean toOverlayWatermark) {
        Graphics2D g2d = (Graphics2D) g.create();

        BackgroundPaintingUtils.update(g2d, comp, false);
        SubstanceWatermark watermark = SubstanceCoreUtilities.getSkin(comp).getWatermark();
        if (watermark != null) {
            watermark.drawWatermarkImage(g2d, comp, 0, 0, comp.getWidth(), comp.getHeight());
        }
        g2d.setColor(backgr);

        // Match the logic / shape in SubstanceImageCreator.paintSimpleBorder that draws the
        // border
        float borderStrokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
        g2d.fill(new Rectangle2D.Float(borderStrokeWidth / 2.0f, borderStrokeWidth / 2.0f,
                comp.getWidth() - borderStrokeWidth, comp.getHeight() - borderStrokeWidth));

        if (toOverlayWatermark) {
            if (watermark != null) {
                g2d.clipRect(0, 0, comp.getWidth(), comp.getHeight());
                watermark.drawWatermarkImage(g2d, comp, 0, 0, comp.getWidth(), comp.getHeight());
            }
        }

        ComponentState state = comp.isEnabled() ? ComponentState.ENABLED
                : ComponentState.DISABLED_UNSELECTED;
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = null;
        JTextComponent componentForTransitions = SubstanceCoreUtilities
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

        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(comp);
        // Get the base border color
        SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities.getColorScheme(comp,
                ColorSchemeAssociationKind.BORDER, state);
        Color borderColor = borderPainter.getRepresentativeColor(baseBorderScheme);

        if (!state.isDisabled() && (activeStates != null) && (activeStates.size() > 1)) {
            // If we have more than one active state, compute the composite color from all
            // the contributions
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                    .entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == state) {
                    continue;
                }

                float contribution = activeEntry.getValue().getContribution();
                if (contribution == 0.0f) {
                    continue;
                }

                float alpha = SubstanceColorSchemeUtilities.getAlpha(componentForTransitions,
                        activeState);
                if (alpha == 0.0f) {
                    continue;
                }

                SubstanceColorScheme activeBorderScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(componentForTransitions, ColorSchemeAssociationKind.BORDER,
                                activeState);
                Color activeBorderColor = borderPainter.getRepresentativeColor(activeBorderScheme);
                borderColor = SubstanceColorUtilities.getInterpolatedColor(borderColor,
                        activeBorderColor, 1.0f - contribution * alpha);
            }
        }
        // At this point we should have the color that matches the border color. Use that to
        // paint emulated drop shadow along the top edge of the component.
        boolean hasSubstanceTextBorder = (comp.getBorder() instanceof SubstanceTextComponentBorder);
        if (hasSubstanceTextBorder) {
            int shadowHeight = 6;
            g2d.setPaint(new GradientPaint(0, 0,
                    SubstanceColorUtilities.getAlphaColor(borderColor, 48), 0, shadowHeight,
                    SubstanceColorUtilities.getAlphaColor(borderColor, 0)));
            float yTop = SubstanceSizeUtils.getBorderStrokeWidth();
            g2d.fill(new Rectangle2D.Float(borderStrokeWidth, yTop,
                    comp.getWidth() - 2 * borderStrokeWidth, shadowHeight));
        }
        g2d.dispose();
    }
}
