/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.theming.internal.utils.border.RadianceButtonBorder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.EnumSet;

/**
 * Spinner button in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
@RadianceInternalButton
@RadianceInternalArrowButton
public class RadianceSpinnerButton extends JButton {
    static {
        AnimationConfigurationManager.getInstance().disallowAnimations(
                RadianceThemingSlices.AnimationFacet.GHOSTING_BUTTON_PRESS, RadianceSpinnerButton.class);
        AnimationConfigurationManager.getInstance().disallowAnimations(
                RadianceThemingSlices.AnimationFacet.GHOSTING_ICON_ROLLOVER, RadianceSpinnerButton.class);
    }

    private abstract static class SpinnerButtonBorder extends RadianceButtonBorder {
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
    public RadianceSpinnerButton(JSpinner spinner, final int orientation) {
        this.setEnabled(spinner.isEnabled());
        this.setFocusable(false);
        this.setRequestFocusEnabled(false);
        super.setBorder(new SpinnerButtonBorder(ClassicButtonShaper.class) {
            public Insets getBorderInsets(Component c) {
                int extraPadding = RadianceSizeUtils
                        .getExtraPadding(RadianceSizeUtils.getComponentFontSize(c));
                // Bring the icons closer together instead of
                // having them centered in the spinner buttons
                int delta = RadianceSizeUtils.getAdjustedSize(
                        RadianceSizeUtils.getComponentFontSize(c), 3, 3, 1, false);
                int deltaTop = (orientation == SwingConstants.NORTH) ? delta : 0;
                int deltaBottom = (orientation == SwingConstants.NORTH) ? 0 : delta;
                return new Insets(extraPadding + deltaTop, extraPadding, extraPadding + deltaBottom,
                        extraPadding);
            }
        });

        RadianceCoreUtilities.markButtonAsFlat(this);
        RadianceThemingCortex.ComponentScope.setButtonStraightSides(this, EnumSet.allOf(RadianceThemingSlices.Side.class));
    }

    @Override
    public void setBorder(Border border) {
    }

    @Override
    public boolean isFocusable() {
        return false;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();
        int clipDelta = (int) RadianceSizeUtils.getBorderStrokeWidth(this);

        if (this.getComponentOrientation().isLeftToRight()) {
            g2d.clipRect(clipDelta, 0, width - clipDelta, height);
        } else {
            g2d.clipRect(0, 0, width - clipDelta, height);
        }
        super.paint(g2d);
        g2d.dispose();
    }
}
