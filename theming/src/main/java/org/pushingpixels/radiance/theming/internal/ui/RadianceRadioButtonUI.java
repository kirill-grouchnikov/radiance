/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeIconUtils;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;

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
import java.beans.PropertyChangeListener;

/**
 * UI for radio buttons in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceRadioButtonUI extends BasicRadioButtonUI implements TransitionAwareUI {
    /**
     * Property change listener. Listens on changes to {@link AbstractButton#MODEL_CHANGED_PROPERTY}
     * property.
     */
    private PropertyChangeListener radiancePropertyListener;

    /**
     * Associated toggle button.
     */
    JToggleButton button;

    StateTransitionTracker stateTransitionTracker;

    private Rectangle viewRect = new Rectangle();

    private Rectangle iconRect = new Rectangle();

    private Rectangle textRect = new Rectangle();

    protected Icon radianceIcon;
    protected BladeColorScheme mutableFillColorScheme = new BladeColorScheme();
    protected BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();
    protected BladeColorScheme mutableMarkColorScheme = new BladeColorScheme();

    @Override
    protected void installListeners(final AbstractButton b) {
        super.installListeners(b);

        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();

        this.radiancePropertyListener = propertyChangeEvent -> {
            if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                stateTransitionTracker.setModel((ButtonModel) propertyChangeEvent.getNewValue());
            }
            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(b::updateUI);
            }
        };
        b.addPropertyChangeListener(radiancePropertyListener);
    }

    @Override
    protected void installDefaults(AbstractButton b) {
        super.installDefaults(b);
        Border border = b.getBorder();
        if (border == null || border instanceof UIResource) {
            b.setBorder(RadianceSizeUtils.getRadioButtonBorder(
                    RadianceSizeUtils.getComponentFontSize(b),
                    b.getComponentOrientation().isLeftToRight()));
        }

        button.setRolloverEnabled(true);

        LookAndFeel.installProperty(b, "iconTextGap",
                RadianceSizeUtils.getTextIconGap(RadianceSizeUtils.getComponentFontSize(b)));

        this.updateIcon();
    }

    protected void updateIcon() {
        int fontSize = RadianceSizeUtils.getComponentFontSize(button);
        int checkMarkSize = RadianceSizeUtils.getRadioButtonMarkSize(fontSize);
        this.radianceIcon = new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                StateTransitionTracker.ModelStateInfo modelStateInfo =
                        stateTransitionTracker.getModelStateInfo();

                RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(button);
                RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(button);
                ComponentState currState = modelStateInfo.getCurrModelState();

                float visibility = stateTransitionTracker.getFacetStrength(RadianceThemingSlices.ComponentStateFacet.SELECTION);
                float alpha = RadianceColorSchemeUtilities.getAlpha(button, currState);

                // Populate color schemes based on the current transition state of the radio button.
                BladeUtils.populateColorScheme(mutableFillColorScheme, button,
                        modelStateInfo, currState,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        false);
                BladeUtils.populateColorScheme(mutableBorderColorScheme, button,
                        modelStateInfo, currState,
                        RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                        false);
                BladeUtils.populateColorScheme(mutableMarkColorScheme, button,
                        modelStateInfo, currState,
                        RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                        false);

                Graphics2D graphics = (Graphics2D) g.create();
                graphics.translate(x, y);
                BladeIconUtils.drawRadioButton(
                        graphics, button, fillPainter, borderPainter,
                        checkMarkSize, currState,
                        mutableFillColorScheme, mutableMarkColorScheme, mutableBorderColorScheme,
                        visibility, alpha);
                graphics.dispose();
            }

            @Override
            public int getIconWidth() {
                return checkMarkSize;
            }

            @Override
            public int getIconHeight() {
                return checkMarkSize;
            }
        };
    }

    @Override
    protected void uninstallListeners(AbstractButton b) {
        b.removePropertyChangeListener(radiancePropertyListener);
        radiancePropertyListener = null;

        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();

        super.uninstallListeners(b);
    }

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceRadioButtonUI((JToggleButton) comp);
    }

    /**
     * Simple constructor.
     * 
     * @param button
     *            Associated radio button.
     */
    RadianceRadioButtonUI(JToggleButton button) {
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
        if (!RadianceCoreUtilities.isCurrentLookAndFeel()) {
            return null;
        }
        return this.radianceIcon;
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        AbstractButton b = (AbstractButton) c;

        if (RadianceCoreUtilities.isOpaque(c)) {
            BackgroundPaintingUtils.update(g, c, false);
        }

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

        Icon icon = RadianceCoreUtilities.getOriginalIcon(b, getDefaultIcon());

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
            float focusRingPadding = RadianceSizeUtils.getFocusRingPadding(
                    button, RadianceSizeUtils.getComponentFontSize(button)) / 2;

            Graphics2D graphicsFocus = (Graphics2D) g2d.create();
            // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
            // to not normalize coordinates to paint at full pixels, and will result in blurry
            // outlines.
            graphicsFocus.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            RadianceCommonCortex.paintAtScale1x(graphicsFocus, 0, 0,
                    button.getWidth(), button.getHeight(),
                    (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                        RadianceCoreUtilities.paintFocus(graphics1X, button, button, this, scaleFactor,
                                null, textRect, 1.0f,
                                (float) scaleFactor * focusRingPadding);
                    }
            );
            graphicsFocus.dispose();
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
        RadianceTextUtilities.paintText(g, button, textRect, text,
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
        return RadianceMetricsUtilities.getPreferredCheckButtonSize(radioButton,
                ((RadianceRadioButtonUI) radioButton.getUI()).getDefaultIcon());
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        super.update(g2d, c);
        g2d.dispose();
    }
}
