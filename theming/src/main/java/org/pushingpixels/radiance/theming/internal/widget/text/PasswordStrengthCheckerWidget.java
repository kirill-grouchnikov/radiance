/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.widget.text;

import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingWidget;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.password.PasswordStrengthChecker;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.blade.BladeDrawingUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import java.awt.*;
import java.beans.PropertyChangeListener;

/**
 * Adds password strength indication on password fields.
 * 
 * @author Kirill Grouchnikov
 */
public class PasswordStrengthCheckerWidget extends RadianceThemingWidget<JPasswordField> {
    /**
     * Listens on changes to {@link RadianceSynapse#PASSWORD_STRENGTH_CHECKER} property.
     */
    private PropertyChangeListener strengthCheckerListener;

    private static class WrappedBorder extends CompoundBorderUIResource {
        public WrappedBorder(Border outsideBorder, Border insideBorder) {
            super(outsideBorder, insideBorder);
        }
    }

    /**
     * Border with password strength indication.
     * 
     * @author Kirill Grouchnikov
     */
    private static class StrengthCheckedBorder implements Border {
        /**
         * Gutter width.
         */
        private static final int GUTTER_WIDTH = 5;

        @Override
        public boolean isBorderOpaque() {
            return false;
        }

        @Override
        public Insets getBorderInsets(Component c) {
            JPasswordField jpf = (JPasswordField) c;
            if (WidgetUtilities.getPasswordStrengthChecker(jpf) == null) {
                return new Insets(0, 0, 0, 0);
            } else {
                if (c.getComponentOrientation().isLeftToRight())
                    return new Insets(0, 0, 0, StrengthCheckedBorder.GUTTER_WIDTH);
                else
                    return new Insets(0, StrengthCheckedBorder.GUTTER_WIDTH, 0, 0);
            }
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            JPasswordField jpf = (JPasswordField) c;
            PasswordStrengthChecker passwordStrengthChecker = WidgetUtilities
                    .getPasswordStrengthChecker(jpf);
            if (passwordStrengthChecker == null)
                return;

            RadianceThemingSlices.PasswordStrength strength = passwordStrengthChecker
                    .getStrength(jpf.getPassword());
            if (c.getComponentOrientation().isLeftToRight())
                paintPasswordStrengthMarker(c, g, x + width - StrengthCheckedBorder.GUTTER_WIDTH, y,
                        StrengthCheckedBorder.GUTTER_WIDTH, height, strength);
            else
                paintPasswordStrengthMarker(c, g, x, y, StrengthCheckedBorder.GUTTER_WIDTH, height,
                        strength);

            String tooltip = passwordStrengthChecker.getDescription(strength);
            jpf.setToolTipText(tooltip);
        }

        private void paintPasswordStrengthMarker(Component c, Graphics g, int x, int y, int width, int height,
                RadianceThemingSlices.PasswordStrength pStrength) {
            Graphics2D g2 = (Graphics2D) g.create();

            RadianceSkin skin = RadianceCoreUtilities.getSkin(c);
            ContainerColorTokens colorTokens = null;
            if (pStrength == RadianceThemingSlices.PasswordStrength.WEAK) {
                colorTokens = skin.getSystemContainerTokens(c,
                    RadianceThemingSlices.SystemContainerType.ERROR);
            }
            if (pStrength == RadianceThemingSlices.PasswordStrength.MEDIUM) {
                colorTokens = skin.getSystemContainerTokens(c,
                    RadianceThemingSlices.SystemContainerType.WARNING);
            }
            if (pStrength == RadianceThemingSlices.PasswordStrength.STRONG) {
                colorTokens = skin.getSystemContainerTokens(c,
                    RadianceThemingSlices.SystemContainerType.SUCCESS);
            }

            if (colorTokens != null) {
                paintRectangularBackground(c, g2, x, y, width, height, colorTokens, 0.8f,
                    false);
            }

            g2.dispose();
        }
    }

    @Override
    public void installListeners() {
        this.strengthCheckerListener = propertyChangeEvent -> {
            if (RadianceSynapse.PASSWORD_STRENGTH_CHECKER.equals(propertyChangeEvent.getPropertyName())) {
                Object newValue = propertyChangeEvent.getNewValue();
                Object oldValue = propertyChangeEvent.getOldValue();
                if ((newValue instanceof PasswordStrengthChecker)
                        && (!(oldValue instanceof PasswordStrengthChecker))) {
                    jcomp.setBorder(
                            new WrappedBorder(jcomp.getBorder(), new StrengthCheckedBorder()));
                } else {
                    // restore core border
                    Border coreBorder = UIManager.getBorder("PasswordField.border");
                    jcomp.setBorder(coreBorder);
                    jcomp.setToolTipText(null);
                }
            }
        };
        this.jcomp.addPropertyChangeListener(this.strengthCheckerListener);
    }

    @Override
    public void uninstallListeners() {
        this.jcomp.removePropertyChangeListener(this.strengthCheckerListener);
        this.strengthCheckerListener = null;
    }

    @Override
    public void installDefaults() {
        super.installDefaults();

        // check if the property is already set - can happen on LAF change
        PasswordStrengthChecker checker = WidgetUtilities.getPasswordStrengthChecker(this.jcomp);
        if (checker != null) {
            this.jcomp.setBorder(new BorderUIResource.CompoundBorderUIResource(
                    this.jcomp.getBorder(), new StrengthCheckedBorder()));
        }
    }

    private static void paintRectangularBackground(Component c, Graphics g, int startX, int startY,
        int width, int height, ContainerColorTokens colorTokens, float borderAlpha,
        boolean isVertical) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(startX, startY);

        if (!isVertical) {
            LinearGradientPaint paint = new LinearGradientPaint(0, 0, 0, height,
                new float[] { 0.0f, 0.4f, 0.5f, 1.0f },
                new Color[] {
                    colorTokens.getContainerSurface(),
                    colorTokens.getContainerSurfaceHigh(),
                    colorTokens.getContainerSurfaceHighest(),
                    colorTokens.getContainerSurface() },
                MultipleGradientPaint.CycleMethod.REPEAT);
            graphics.setPaint(paint);
            graphics.fillRect(0, 0, width, height);
        } else {
            LinearGradientPaint paint = new LinearGradientPaint(0, 0, width, 0,
                new float[] { 0.0f, 0.4f, 0.5f, 1.0f },
                new Color[] {
                    colorTokens.getContainerSurface(),
                    colorTokens.getContainerSurfaceHigh(),
                    colorTokens.getContainerSurfaceHighest(),
                    colorTokens.getContainerSurface() },
                MultipleGradientPaint.CycleMethod.REPEAT);
            graphics.setPaint(paint);
            graphics.fillRect(0, 0, width, height);
        }

        if (borderAlpha > 0.0f) {
            Graphics2D g2d = (Graphics2D) graphics.create();
            g2d.setComposite(WidgetUtilities.getAlphaComposite(null, borderAlpha, graphics));

            BladeDrawingUtils.paintBladeSimpleTonalBorder(c, g2d, width, height, 0.0f, colorTokens);

            g2d.dispose();
        }
        graphics.dispose();
    }
}
