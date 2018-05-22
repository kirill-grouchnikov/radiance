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
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.basic.BasicHTML;
import javax.swing.plaf.basic.BasicRadioButtonUI;
import javax.swing.text.View;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.RolloverButtonListener;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.SubstanceTextUtilities;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;

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
    protected PropertyChangeListener substancePropertyListener;

    /**
     * Associated toggle button.
     */
    protected JToggleButton button;

    /**
     * Icons for all component states
     */
    private static LazyResettableHashMap<SubstanceIconUIResource> icons = new LazyResettableHashMap<SubstanceIconUIResource>(
            "SubstanceRadioButtonUI");

    protected StateTransitionTracker stateTransitionTracker;

    private Rectangle viewRect = new Rectangle();

    private Rectangle iconRect = new Rectangle();

    private Rectangle textRect = new Rectangle();

    /*
     * (non-Javadoc)
     * 
     * @seejavax.swing.plaf.basic.BasicButtonUI#installListeners(javax.swing. AbstractButton)
     */
    @Override
    protected void installListeners(final AbstractButton b) {
        super.installListeners(b);

        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();

        this.substancePropertyListener = (PropertyChangeEvent evt) -> {
            if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(evt.getPropertyName())) {
                stateTransitionTracker.setModel((ButtonModel) evt.getNewValue());
            }
            if ("font".equals(evt.getPropertyName())) {
                SwingUtilities.invokeLater(() -> b.updateUI());
            }
        };
        b.addPropertyChangeListener(substancePropertyListener);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicRadioButtonUI#installDefaults(javax.swing .AbstractButton)
     */
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

    /*
     * (non-Javadoc)
     * 
     * @seejavax.swing.plaf.basic.BasicButtonUI#uninstallListeners(javax.swing. AbstractButton)
     */
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
     * @param currState
     *            Current state of the checkbox.
     * @param prevState
     *            Previous state of the checkbox.
     * @return Matching icon.
     */
    private static SubstanceIconUIResource getIcon(JToggleButton button,
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
                .getColorScheme(button, ColorSchemeAssociationKind.FILL, currState);
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
        SubstanceIconUIResource iconBase = icons.get(keyBase);
        if (iconBase == null) {
            iconBase = new SubstanceIconUIResource(SubstanceImageCreator.getRadioButton(button, fillPainter,
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
                        .getColorScheme(button, ColorSchemeAssociationKind.FILL, activeState);
                SubstanceColorScheme markColorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.MARK, activeState);
                SubstanceColorScheme borderColorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(button, ColorSchemeAssociationKind.BORDER, activeState);

                HashMapKey keyLayer = SubstanceCoreUtilities.getHashKey(fontSize, checkMarkSize,
                        fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                        fillColorScheme.getDisplayName(), markColorScheme.getDisplayName(),
                        borderColorScheme.getDisplayName(), visibility, alpha);
                SubstanceIconUIResource iconLayer = icons.get(keyLayer);
                if (iconLayer == null) {
                    iconLayer = new SubstanceIconUIResource(
                            SubstanceImageCreator.getRadioButton(button, fillPainter, borderPainter,
                                    checkMarkSize, currState, 0, fillColorScheme, markColorScheme,
                                    borderColorScheme, visibility, alpha));
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
     * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
     */
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
    public SubstanceRadioButtonUI(JToggleButton button) {
        this.button = button;
        button.setRolloverEnabled(true);
        this.stateTransitionTracker = new StateTransitionTracker(this.button,
                this.button.getModel());
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
     * Returns memory usage string.
     * 
     * @return Memory usage string.
     */
    public static String getMemoryUsage() {
        StringBuffer sb = new StringBuffer();
        sb.append("SubstanceRadioButtonUI: \n");
        sb.append("\t" + SubstanceRadioButtonUI.icons.size() + " icons");
        return sb.toString();
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
    protected void paintButtonText(Graphics g, AbstractButton button, Rectangle textRect,
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
}
