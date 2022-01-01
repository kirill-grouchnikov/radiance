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
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingWidget;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.text.RadiancePasswordField;
import org.pushingpixels.radiance.theming.internal.RadianceThemingWidgetRepository;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.*;
import org.pushingpixels.radiance.theming.internal.utils.border.RadianceTextComponentBorder;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.plaf.basic.BasicPasswordFieldUI;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.util.Set;

/**
 * UI for password fields in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadiancePasswordFieldUI extends BasicPasswordFieldUI implements TransitionAwareUI {
    private StateTransitionTracker stateTransitionTracker;

    /**
     * The associated password field.
     */
    private JPasswordField passwordField;

    /**
     * Property change listener.
     */
    private PropertyChangeListener radiancePropertyChangeListener;

    /**
     * Listener for transition animations.
     */
    private RolloverTextControlListener radianceRolloverListener;

    /**
     * Surrogate button model for tracking the state transitions.
     */
    private ButtonModel transitionModel;

    private Set<RadianceThemingWidget<JComponent>> themingWidgets;

    /**
     * Custom password view.
     *
     * @author Kirill Grouchnikov
     */
    private static class RadiancePasswordView extends FieldView {
        /**
         * The associated password field.
         */
        private JPasswordField field;

        /**
         * Simple constructor.
         *
         * @param field   The associated password field.
         * @param element The element
         */
        private RadiancePasswordView(JPasswordField field, Element element) {
            super(element);
            this.field = field;
        }

        /**
         * Draws the echo character(s) for a single password field character. The number of echo
         * characters is defined by
         * {@link RadianceSynapse#PASSWORD_ECHO_PER_CHAR}
         * client property.
         *
         * @param g          Graphics context
         * @param x          X coordinate of the first echo character to draw.
         * @param y          Y coordinate of the first echo character to draw.
         * @param c          Password field.
         * @param isSelected Indicates whether the password field character is selected.
         * @return The X location of the next echo character.
         * @see RadianceSynapse#PASSWORD_ECHO_PER_CHAR
         */
        private float drawEchoCharacter(Graphics g, float x, float y, char c, boolean isSelected) {
            Container container = this.getContainer();

            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            JPasswordField field = (JPasswordField) container;

            int fontSize = RadianceSizeUtils.getComponentFontSize(this.field);
            int dotDiameter = RadianceSizeUtils.getPasswordDotDiameter(fontSize);
            int dotGap = RadianceSizeUtils.getPasswordDotGap(fontSize);
            if (field instanceof RadiancePasswordField) {
                graphics.setColor(field.getSelectedTextColor());
            } else {
                ComponentState state = field.isEnabled() ? ComponentState.ENABLED
                        : ComponentState.DISABLED_UNSELECTED;
                RadianceColorScheme scheme = RadianceColorSchemeUtilities.getColorScheme(field, state);
                Color color = isSelected ? scheme.getSelectionForegroundColor()
                        : RadianceColorUtilities.getForegroundColor(scheme);
                graphics.setColor(color);
            }
            int echoPerChar = RadianceCoreUtilities.getEchoPerChar(field);
            for (int i = 0; i < echoPerChar; i++) {
                graphics.fillOval((int) (x + dotGap / 2), (int) (y - dotDiameter), dotDiameter, dotDiameter);
                x += (dotDiameter + dotGap);
            }
            return x;
        }

        /**
         * Returns the advance of a single password field character. The advance is the pixel
         * distance between first echo characters of consecutive password field characters. The
         * {@link RadianceSynapse#PASSWORD_ECHO_PER_CHAR}
         * can be used to specify that more than
         * one echo character is used for each password field character.
         *
         * @return The advance of a single password field character
         */
        private int getEchoCharAdvance() {
            int fontSize = RadianceSizeUtils.getComponentFontSize(this.field);
            int dotDiameter = RadianceSizeUtils.getPasswordDotDiameter(fontSize);
            int dotGap = RadianceSizeUtils.getPasswordDotGap(fontSize);
            int echoPerChar = RadianceCoreUtilities.getEchoPerChar(field);
            return echoPerChar * (dotDiameter + dotGap);
        }

        @Override
        protected float drawSelectedText(Graphics2D g, float x, float y, int p0, int p1)
                throws BadLocationException {
            Container c = getContainer();
            if (c instanceof JPasswordField) {
                JPasswordField f = (JPasswordField) c;
                if (!f.echoCharIsSet()) {
                    return super.drawSelectedText(g, x, y, p0, p1);
                }
                int n = p1 - p0;
                char echoChar = f.getEchoChar();
                float currPos = x;
                for (int i = 0; i < n; i++) {
                    currPos = drawEchoCharacter(g, currPos, y, echoChar, true);
                }
                return x + n * getEchoCharAdvance();
            }
            return x;
        }

        @Override
        protected float drawUnselectedText(Graphics2D g, float x, float y, int p0, int p1)
                throws BadLocationException {
            Container c = getContainer();
            if (c instanceof JPasswordField) {
                JPasswordField f = (JPasswordField) c;
                if (!f.echoCharIsSet()) {
                    return super.drawUnselectedText(g, x, y, p0, p1);
                }
                int n = p1 - p0;
                char echoChar = f.getEchoChar();
                float currPos = x;
                for (int i = 0; i < n; i++) {
                    currPos = drawEchoCharacter(g, currPos, y, echoChar, false);
                }
                return x + n * getEchoCharAdvance();
            }
            return x;
        }

        @Override
        public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {
            Container c = this.getContainer();
            if (c instanceof JPasswordField) {
                JPasswordField f = (JPasswordField) c;
                if (!f.echoCharIsSet()) {
                    return super.modelToView(pos, a, b);
                }

                Rectangle alloc = this.adjustAllocation(a).getBounds();
                int echoPerChar = RadianceCoreUtilities.getEchoPerChar(f);
                int fontSize = RadianceSizeUtils.getComponentFontSize(this.field);
                int dotWidth = RadianceSizeUtils.getPasswordDotDiameter(fontSize)
                        + RadianceSizeUtils.getPasswordDotGap(fontSize);

                int dx = (pos - this.getStartOffset()) * echoPerChar * dotWidth;
                alloc.x += dx;
                alloc.width = 1;
                return alloc;
            }
            return null;
        }

        @Override
        public int viewToModel(float fx, float fy, Shape a, Position.Bias[] bias) {
            bias[0] = Position.Bias.Forward;
            int n = 0;
            Container c = this.getContainer();
            if (c instanceof JPasswordField) {
                JPasswordField f = (JPasswordField) c;
                if (!f.echoCharIsSet()) {
                    return super.viewToModel(fx, fy, a, bias);
                }
                a = this.adjustAllocation(a);
                Rectangle alloc = (a instanceof Rectangle) ? (Rectangle) a : a.getBounds();
                int echoPerChar = RadianceCoreUtilities.getEchoPerChar(f);
                int fontSize = RadianceSizeUtils.getComponentFontSize(this.field);
                int dotWidth = RadianceSizeUtils.getPasswordDotDiameter(fontSize)
                        + RadianceSizeUtils.getPasswordDotGap(fontSize);
                n = ((int) fx - alloc.x) / (echoPerChar * dotWidth);
                if (n < 0) {
                    n = 0;
                } else {
                    if (n > (this.getStartOffset() + this.getDocument().getLength())) {
                        n = this.getDocument().getLength() - this.getStartOffset();
                    }
                }
            }
            return this.getStartOffset() + n;
        }

        @Override
        public float getPreferredSpan(int axis) {
            switch (axis) {
                case View.X_AXIS:
                    Container c = this.getContainer();
                    if (c instanceof JPasswordField) {
                        JPasswordField f = (JPasswordField) c;
                        if (f.echoCharIsSet()) {
                            int echoPerChar = RadianceCoreUtilities.getEchoPerChar(f);
                            int fontSize = RadianceSizeUtils.getComponentFontSize(this.field);
                            int dotWidth = RadianceSizeUtils.getPasswordDotDiameter(fontSize)
                                    + RadianceSizeUtils.getPasswordDotGap(fontSize);
                            return echoPerChar * dotWidth * this.getDocument().getLength();
                        }
                    }
            }
            return super.getPreferredSpan(axis);
        }

    }

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadiancePasswordFieldUI(comp);
    }

    /**
     * Creates the UI delegate for the specified component (password field).
     *
     * @param c Component.
     */
    private RadiancePasswordFieldUI(JComponent c) {
        super();
        this.passwordField = (JPasswordField) c;

        this.transitionModel = new DefaultButtonModel();
        this.transitionModel.setArmed(false);
        this.transitionModel.setSelected(false);
        this.transitionModel.setPressed(false);
        this.transitionModel.setRollover(false);
        this.transitionModel.setEnabled(this.passwordField.isEnabled());

        this.stateTransitionTracker = new StateTransitionTracker(this.passwordField,
                this.transitionModel);
    }

    @Override
    public void installUI(JComponent c) {
        this.themingWidgets = RadianceThemingWidgetRepository.getRepository().getMatchingWidgets(c);

        super.installUI(c);

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installUI();
        }
    }

    @Override
    public void uninstallUI(JComponent c) {
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallUI();
        }
        super.uninstallUI(c);
    }

    @Override
    public View create(Element elem) {
        return new RadiancePasswordView(this.passwordField, elem);
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.radianceRolloverListener = new RolloverTextControlListener(this.passwordField, this,
                this.transitionModel);
        this.radianceRolloverListener.registerListeners();

        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();

        this.radiancePropertyChangeListener = propertyChangeEvent -> {
            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(() -> {
                    // remember the caret location - issue 404
                    int caretPos = passwordField.getCaretPosition();
                    passwordField.updateUI();
                    passwordField.setCaretPosition(caretPos);
                    Container parent = passwordField.getParent();
                    if (parent != null) {
                        parent.invalidate();
                        parent.validate();
                    }
                });
            }

            if ("enabled".equals(propertyChangeEvent.getPropertyName())) {
                transitionModel.setEnabled(passwordField.isEnabled());
            }
        };
        this.passwordField.addPropertyChangeListener(this.radiancePropertyChangeListener);
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installListeners();
        }
    }

    @Override
    protected void uninstallListeners() {
        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();

        this.passwordField.removePropertyChangeListener(this.radiancePropertyChangeListener);
        this.radiancePropertyChangeListener = null;

        this.passwordField.removeMouseListener(this.radianceRolloverListener);
        this.passwordField.removeMouseMotionListener(this.radianceRolloverListener);
        this.radianceRolloverListener = null;

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallListeners();
        }

        super.uninstallListeners();
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        Border b = this.passwordField.getBorder();
        if (b == null || b instanceof UIResource) {
            Border newB = new BorderUIResource.CompoundBorderUIResource(
                    new RadianceTextComponentBorder(RadianceSizeUtils.getTextBorderInsets(
                            RadianceSizeUtils.getComponentFontSize(this.passwordField))),
                    new BasicBorders.MarginBorder());
            this.passwordField.setBorder(newB);
        }

        // support for per-window skins
        SwingUtilities.invokeLater(() -> {
            if (passwordField == null)
                return;
            Color foregr = passwordField.getForeground();
            if ((foregr == null) || (foregr instanceof UIResource)) {
                passwordField.setForeground(RadianceColorUtilities.getForegroundColor(
                        RadianceThemingCortex.ComponentScope.getCurrentSkin(passwordField)
                                .getEnabledColorScheme(ComponentOrParentChainScope
                                        .getDecorationType(passwordField))));
            }
        });
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installDefaults();
        }
    }

    @Override
    protected void uninstallDefaults() {
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallDefaults();
        }

        super.uninstallDefaults();
    }

    @Override
    protected void paintBackground(Graphics g) {
        RadianceTextUtilities.paintTextCompBackground(g, this.passwordField);
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
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        super.update(g2d, c);
        g2d.dispose();
    }
}
