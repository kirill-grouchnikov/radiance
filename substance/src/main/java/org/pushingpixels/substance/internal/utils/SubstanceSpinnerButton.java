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

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.util.EnumSet;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.SubstanceSlices.Side;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.utils.border.SubstanceButtonBorder;

/**
 * Spinner button in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
@SubstanceInternalButton
@SubstanceInternalArrowButton
public class SubstanceSpinnerButton extends JButton {
    static {
        AnimationConfigurationManager.getInstance().disallowAnimations(
                AnimationFacet.GHOSTING_BUTTON_PRESS, SubstanceSpinnerButton.class);
        AnimationConfigurationManager.getInstance().disallowAnimations(
                AnimationFacet.GHOSTING_ICON_ROLLOVER, SubstanceSpinnerButton.class);
    }

    private abstract static class SpinnerButtonBorder extends SubstanceButtonBorder {
        public SpinnerButtonBorder(Class<?> buttonShaperClass) {
            super(buttonShaperClass);
        }
    }

    /**
     * Simple constructor.
     * 
     * @param spinner
     *            The owner spinner.
     * @param orientation
     *            The orientation of the spinner icon arrow.
     */
    public SubstanceSpinnerButton(JSpinner spinner, final int orientation) {
        this.setEnabled(spinner.isEnabled());
        this.setFocusable(false);
        this.setRequestFocusEnabled(false);
        super.setBorder(new SpinnerButtonBorder(ClassicButtonShaper.class) {
            public Insets getBorderInsets(Component c) {
                int extraPadding = SubstanceSizeUtils
                        .getExtraPadding(SubstanceSizeUtils.getComponentFontSize(c));
                // Bring the icons closer together instead of
                // having them centered in the spinner buttons
                int delta = SubstanceSizeUtils.getAdjustedSize(
                        SubstanceSizeUtils.getComponentFontSize(c), 3, 3, 1, false);
                int deltaTop = (orientation == SwingConstants.NORTH) ? delta : 0;
                int deltaBottom = (orientation == SwingConstants.NORTH) ? 0 : delta;
                return new Insets(extraPadding + deltaTop, extraPadding, extraPadding + deltaBottom,
                        extraPadding);
            }
        });

        SubstanceCoreUtilities.markButtonAsFlat(this);
        SubstanceCortex.ComponentScope.setButtonStraightSides(this, EnumSet.allOf(Side.class));
    }

    @Override
    public void setBorder(Border border) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.Component#isFocusable()
     */
    @Override
    public boolean isFocusable() {
        return false;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();
        int clipDelta = (int) SubstanceSizeUtils.getBorderStrokeWidth();

        if (this.getComponentOrientation().isLeftToRight()) {
            g2d.clipRect(clipDelta, 0, width - clipDelta, height);
        } else {
            g2d.clipRect(0, 0, width - clipDelta, height);
        }
        super.paint(g2d);
        g2d.dispose();
    }
}
