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
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.basic.BasicHTML;
import javax.swing.plaf.basic.BasicRadioButtonUI;
import javax.swing.text.View;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.util.Map;

/**
 * UI for radio buttons in <b>Substance </b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceRadioButtonUI extends BasicRadioButtonUI implements TransitionAwareUI {
    /**
     * Property change listener. Listens on changes to {@link AbstractButton#MODEL_CHANGED_PROPERTY}
     * property.
     */
    private PropertyChangeListener substancePropertyListener;

    /**
     * Associated toggle button.
     */
    JToggleButton button;

    /**
     * Icons for all component states
     */
    private static LazyResettableHashMap<ImageWrapperIcon> icons = new LazyResettableHashMap<>(
            "SubstanceRadioButtonUI");

    StateTransitionTracker stateTransitionTracker;

    private Rectangle viewRect = new Rectangle();

    private Rectangle iconRect = new Rectangle();

    private Rectangle textRect = new Rectangle();

    @Override
    protected void installListeners(final AbstractButton b) {
        super.installListeners(b);

        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();

        this.substancePropertyListener = propertyChangeEvent -> {
            if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                stateTransitionTracker.setModel((ButtonModel) propertyChangeEvent.getNewValue());
            }
            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(b::updateUI);
            }
        };
        b.addPropertyChangeListener(substancePropertyListener);
    }

    @Override
    protected void installDefaults(AbstractButton b) {
        super.installDefaults(b);
        Border border = b.getBorder();
        if (border == null || border instanceof UIResource) {
            b.setBorder(SubstanceSizeUtils.getRadioButtonBorder(
                    SubstanceSizeUtils.getComponentFontSize(b),
                    b.getComponentOrientation().isLeftToRight()));
        }

        button.setRolloverEnabled(true);

        LookAndFeel.installProperty(b, "iconTextGap",
                SubstanceSizeUtils.getTextIconGap(SubstanceSizeUtils.getComponentFontSize(b)));
    }

    @Override
    protected void uninstallListeners(AbstractButton b) {
        b.removePropertyChangeListener(substancePropertyListener);
        substancePropertyListener = null;

        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();

        super.uninstallListeners(b);
    }

    /**
     * Returns the icon that matches the current and previous states of the radio button.
     * 
     * @param button
     *            Button (should be {@link JRadioButton}).
     * @param stateTransitionTracker
     *            State transition tracker for the radio button.
     * @return Matching icon.
     */
    private static ImageWrapperIcon getIcon(JToggleButton button,
            StateTransitionTracker stateTransitionTracker) {
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        int fontSize = SubstanceSizeUtils.getComponentFontSize(button);
        int checkMarkSize = SubstanceSizeUtils.getRadioButtonMarkSize(fontSize);

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
        float alpha = SubstanceColorSchemeUtilities.getAlpha(button, currState);

        HashMapKey keyBase = SubstanceCoreUtilities.getHashKey(fontSize, checkMarkSize,
                fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                baseFillColorScheme.getDisplayName(), baseMarkColorScheme.getDisplayName(),
                baseBorderColorScheme.getDisplayName(), visibility, alpha);
        ImageWrapperIcon iconBase = icons.get(keyBase);
        if (iconBase == null) {
            iconBase = new ImageWrapperIcon(SubstanceImageCreator.getRadioButton(button, fillPainter,
                    borderPainter, checkMarkSize, currState, 0, baseFillColorScheme,
                    baseMarkColorScheme, baseBorderColorScheme, visibility, alpha));
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
                        .getColorScheme(button, ColorSchemeAssociationKind.MARK_BOX, activeState);
                SubstanceColorScheme markColorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.MARK, activeState);
                SubstanceColorScheme borderColorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.BORDER, activeState);

                HashMapKey keyLayer = SubstanceCoreUtilities.getHashKey(fontSize, checkMarkSize,
                        fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                        fillColorScheme.getDisplayName(), markColorScheme.getDisplayName(),
                        borderColorScheme.getDisplayName(), visibility, alpha);
                ImageWrapperIcon iconLayer = icons.get(keyLayer);
                if (iconLayer == null) {
                    iconLayer = new ImageWrapperIcon(
                            SubstanceImageCreator.getRadioButton(button, fillPainter, borderPainter,
                                    checkMarkSize, currState, 0, fillColorScheme, markColorScheme,
                                    borderColorScheme, visibility, alpha));
                    icons.put(keyLayer, iconLayer);
                }

                iconLayer.paintIcon(button, g2d, 0, 0);
            }
        }

        g2d.dispose();
        return new ImageWrapperIcon(result);
    }

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceRadioButtonUI((JToggleButton) comp);
    }

    /**
     * Simple constructor.
     * 
     * @param button
     *            Associated radio button.
     */
    SubstanceRadioButtonUI(JToggleButton button) {
        this.button = button;
        button.setRolloverEnabled(true);
        this.stateTransitionTracker = new StateTransitionTracker(this.button,
                this.button.getModel());
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
        return SubstanceRadioButtonUI.getIcon(button, this.stateTransitionTracker);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        AbstractButton b = (AbstractButton) c;

        // boolean isOpaque = b.isOpaque();
        // b.putClientProperty(SubstanceButtonUI.LOCK_OPACITY, Boolean.TRUE);
        // b.setOpaque(false);

        if (SubstanceCoreUtilities.isOpaque(c)) {
            BackgroundPaintingUtils.update(g, c, false);
        }

        // b.setOpaque(isOpaque);

        // b.putClientProperty(SubstanceButtonUI.LOCK_OPACITY, null);

        FontMetrics fm = g.getFontMetrics();

        Insets i = b.getInsets();

        viewRect.x = i.left;
        viewRect.y = i.top;
        viewRect.width = b.getWidth() - (i.right + viewRect.x);
        viewRect.height = b.getHeight() - (i.bottom + viewRect.y);

        textRect.x = textRect.y = textRect.width = textRect.height = 0;
        iconRect.x = iconRect.y = iconRect.width = iconRect.height = 0;

        Font f = b.getFont();
        g.setFont(f);

        Icon icon = SubstanceCoreUtilities.getOriginalIcon(b, getDefaultIcon());

        // layout the text and icon
        String text = SwingUtilities.layoutCompoundLabel(c, fm, b.getText(), icon,
                b.getVerticalAlignment(), b.getHorizontalAlignment(), b.getVerticalTextPosition(),
                b.getHorizontalTextPosition(), viewRect, iconRect, textRect,
                b.getText() == null ? 0 : b.getIconTextGap());

        Graphics2D g2d = (Graphics2D) g.create();
        if (text != null && !text.equals("")) {
            final View v = (View) b.getClientProperty(BasicHTML.propertyKey);
            if (v != null) {
                v.paint(g2d, textRect);
            } else {
                this.paintButtonText(g2d, b, textRect, text);
            }
        }

        // Paint the Icon
        if (icon != null) {
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            icon.paintIcon(c, g2d, iconRect.x, iconRect.y);
        }

        if (b.isFocusPainted()) {
            // make sure that the focus ring is not clipped
            float focusRingPadding = SubstanceSizeUtils
                    .getFocusRingPadding(SubstanceSizeUtils.getComponentFontSize(button)) / 2;
            SubstanceCoreUtilities.paintFocus(g2d, button, button, this, null, textRect, 1.0f,
                    focusRingPadding);
        }
        // g2d.setColor(Color.red);
        // g2d.draw(iconRect);
        // g2d.draw(viewRect);
        // g2d.draw(textRect);
        // g2d.setColor(Color.blue);
        // g2d.drawRect(0, 0, button.getWidth() - 1, button.getHeight() - 1);

        g2d.dispose();
    }

    /**
     * Paints the text.
     * 
     * @param g
     *            Graphic context
     * @param button
     *            Button
     * @param textRect
     *            Text rectangle
     * @param text
     *            Text to paint
     */
    private void paintButtonText(Graphics g, AbstractButton button, Rectangle textRect,
            String text) {
        SubstanceTextUtilities.paintText(g, button, textRect, text,
                button.getDisplayedMnemonicIndex());
    }

    @Override
    public boolean isInside(MouseEvent me) {
        return true;
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.stateTransitionTracker;
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        JRadioButton radioButton = (JRadioButton) c;
        return SubstanceMetricsUtilities.getPreferredCheckButtonSize(radioButton,
                ((SubstanceRadioButtonUI) radioButton.getUI()).getDefaultIcon());
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        NeonCortex.installDesktopHints(g2d, c.getFont());
        super.update(g2d, c);
        g2d.dispose();
    }
}
