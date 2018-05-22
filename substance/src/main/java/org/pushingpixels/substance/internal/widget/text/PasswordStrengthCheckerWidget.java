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
package org.pushingpixels.substance.internal.widget.text;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;

import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.password.PasswordStrengthChecker;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.substance.internal.utils.border.BorderWrapper;

/**
 * Adds password strength indication on password fields.
 * 
 * @author Kirill Grouchnikov
 */
public class PasswordStrengthCheckerWidget extends SubstanceWidget<JPasswordField> {
    /**
     * Listens on changes to {@link SubstanceSynapse#PASSWORD_STRENGTH_CHECKER} property.
     */
    protected PropertyChangeListener strengthCheckerListener;

    private static class WrappedBorder extends CompoundBorderUIResource implements BorderWrapper {
        public WrappedBorder(Border outsideBorder, Border insideBorder) {
            super(outsideBorder, insideBorder);
        }

        @Override
        public Border getOriginalBorder() {
            return this.getOutsideBorder();
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

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.border.Border#isBorderOpaque()
         */
        public boolean isBorderOpaque() {
            return false;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.border.Border#getBorderInsets(java.awt.Component)
         */
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

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.border.Border#paintBorder(java.awt.Component, java.awt.Graphics, int,
         * int, int, int)
         */
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            JPasswordField jpf = (JPasswordField) c;
            PasswordStrengthChecker passwordStrengthChecker = WidgetUtilities
                    .getPasswordStrengthChecker(jpf);
            if (passwordStrengthChecker == null)
                return;

            SubstanceSlices.PasswordStrength strength = passwordStrengthChecker
                    .getStrength(jpf.getPassword());
            if (c.getComponentOrientation().isLeftToRight())
                paintPasswordStrengthMarker(g, x + width - StrengthCheckedBorder.GUTTER_WIDTH, y,
                        StrengthCheckedBorder.GUTTER_WIDTH, height, strength);
            else
                paintPasswordStrengthMarker(g, x, y, StrengthCheckedBorder.GUTTER_WIDTH, height,
                        strength);

            String tooltip = passwordStrengthChecker.getDescription(strength);
            jpf.setToolTipText(tooltip);
        }

        private void paintPasswordStrengthMarker(Graphics g, int x, int y, int width, int height,
                SubstanceSlices.PasswordStrength pStrength) {
            Graphics2D g2 = (Graphics2D) g.create();

            SubstanceColorScheme colorScheme = null;

            if (pStrength == SubstanceSlices.PasswordStrength.WEAK)
                colorScheme = SubstanceColorSchemeUtilities.ORANGE;
            if (pStrength == SubstanceSlices.PasswordStrength.MEDIUM)
                colorScheme = SubstanceColorSchemeUtilities.YELLOW;
            if (pStrength == SubstanceSlices.PasswordStrength.STRONG)
                colorScheme = SubstanceColorSchemeUtilities.GREEN;

            if (colorScheme != null) {
                SubstanceImageCreator.paintRectangularBackground(null, g, x, y, width, height,
                        colorScheme, 0.5f, false);
            }

            g2.dispose();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#installListeners()
     */
    @Override
    public void installListeners() {
        this.strengthCheckerListener = (PropertyChangeEvent evt) -> {
            if (SubstanceSynapse.PASSWORD_STRENGTH_CHECKER.equals(evt.getPropertyName())) {
                Object newValue = evt.getNewValue();
                Object oldValue = evt.getOldValue();
                if ((newValue != null) && (newValue instanceof PasswordStrengthChecker)
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

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#uninstallListeners()
     */
    @Override
    public void uninstallListeners() {
        this.jcomp.removePropertyChangeListener(this.strengthCheckerListener);
        this.strengthCheckerListener = null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#installDefaults()
     */
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
}
