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
package org.pushingpixels.radiance.theming.api.shaper;

import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.utils.*;
import org.pushingpixels.radiance.theming.internal.utils.border.RadianceBorder;
import org.pushingpixels.radiance.theming.internal.utils.border.RadianceButtonBorder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Set;

/**
 * Button shaper that returns buttons with completely rounded corners (ala Mac 10.4). This class is
 * part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class PillButtonShaper implements RadianceButtonShaper, RectangularButtonShaper {
    /**
     * Cache of already computed contours.
     */
    private final static LazyResettableHashMap<Shape> contours = new LazyResettableHashMap<>(
            "PillButtonShaper");

    @Override
    public String getDisplayName() {
        return "Pill";
    }

    @Override
    public Shape getButtonOutline(AbstractButton button, float extraInsets, float width,
            float height, boolean isInner) {
        Set<RadianceThemingSlices.Side> straightSides = RadianceCoreUtilities.getSides(button,
                RadianceSynapse.BUTTON_STRAIGHT_SIDE);

        float radius = this.getCornerRadius(button, extraInsets);
        if (isInner) {
            radius -= RadianceSizeUtils.getBorderStrokeWidth(button);
            if (radius < 0.0f)
                radius = 0.0f;
        }

        HashMapKey key = RadianceCoreUtilities.getHashKey(width, height, straightSides, radius,
                extraInsets);

        Shape result = contours.get(key);
        if (result != null) {
            return result;
        }

        result = RadianceOutlineUtilities.getBaseOutline(width, height, radius, straightSides,
                extraInsets);
        contours.put(key, result);
        return result;
    }

    @Override
    public Border getButtonBorder(final AbstractButton button) {
        return new RadianceButtonBorder(PillButtonShaper.class) {
            public Insets getBorderInsets(Component c) {
                int fontSize = RadianceSizeUtils.getComponentFontSize(button);
                Insets buttonInsets = RadianceSizeUtils.getButtonInsets(button, fontSize);
                float focusPadding = RadianceSizeUtils.getFocusRingPadding(button, fontSize);
                int lrPadding = RadianceCoreUtilities.hasText(button)
                        ? RadianceSizeUtils.getTextButtonLRPadding(fontSize)
                        : 0;
                Set<RadianceThemingSlices.Side> openSides = RadianceCoreUtilities.getSides(button,
                        RadianceSynapse.BUTTON_OPEN_SIDE);
                int left = lrPadding + buttonInsets.left + (int) focusPadding
                        + ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.LEFT) ? -1
                                : 0);
                int right = lrPadding + buttonInsets.right + (int) focusPadding
                        + ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.RIGHT)
                                ? -1
                                : 0);
                int top = buttonInsets.top
                        + ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.TOP) ? -1
                                : 0);
                int bottom = buttonInsets.bottom
                        + ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.BOTTOM)
                                ? -1
                                : 0);
                return new Insets(top, left, bottom, right);
            }
        };
    }

    @Override
    public Dimension getPreferredSize(AbstractButton button, Dimension uiPreferredSize) {
        Dimension result;
        boolean toTweakWidth = false;
        boolean toTweakHeight = false;

        Icon icon = button.getIcon();
        boolean hasIcon = RadianceCoreUtilities.hasIcon(button);
        boolean hasText = RadianceCoreUtilities.hasText(button);
        Insets margin = button.getMargin();

        result = uiPreferredSize;

        boolean hasNoMinSizeProperty = RadianceCoreUtilities.hasNoMinSizeProperty(button);
        if ((!hasNoMinSizeProperty) && hasText) {
            int baseWidth = uiPreferredSize.width;
            baseWidth = Math.max(baseWidth + uiPreferredSize.height, RadianceSizeUtils
                    .getMinButtonWidth(RadianceSizeUtils.getComponentFontSize(button)));
            result = new Dimension(baseWidth, uiPreferredSize.height);
            int baseHeight = result.height;
            result = new Dimension(result.width, baseHeight);
        } else {
            if (hasNoMinSizeProperty) {
                if (margin != null) {
                    result = new Dimension(result.width + margin.left + margin.right,
                            result.height + margin.top + margin.bottom);
                }
            }
        }

        int extraPadding = RadianceSizeUtils
                .getExtraPadding(RadianceSizeUtils.getComponentFontSize(button));
        int iconPaddingWidth = 6 + 2 * extraPadding;
        int iconPaddingHeight = 6 + 2 * extraPadding;
        if (margin != null) {
            iconPaddingWidth = Math.max(iconPaddingWidth, margin.left + margin.right);
            iconPaddingHeight = Math.max(iconPaddingHeight, margin.top + margin.bottom);
        }
        if (hasIcon) {
            // check the icon height
            int iconHeight = icon.getIconHeight();
            if (iconHeight > (result.getHeight() - iconPaddingHeight)) {
                result = new Dimension(result.width, iconHeight);
                toTweakHeight = true;
            }
            int iconWidth = icon.getIconWidth();
            if (iconWidth > (result.getWidth() - iconPaddingWidth)) {
                result = new Dimension(iconWidth, result.height);
                toTweakWidth = true;
            }
        }

        if (RadianceCoreUtilities.isScrollBarButton(button)) {
            toTweakWidth = false;
            toTweakHeight = false;
        }

        if (toTweakWidth) {
            result = new Dimension(result.width + iconPaddingWidth, result.height);
        }
        if (toTweakHeight) {
            result = new Dimension(result.width, result.height + iconPaddingHeight);
        }

        if (result.height % 2 != 0)
            result.height++;

        return result;
    }

    /**
     * Returns indication whether the specified button should be drawn with completely round
     * corners.
     * 
     * @param button
     *            A button.
     * @return <code>true</code> if the specified button should be drawn with completely round
     *         corners, <code>false</code> otherwise.
     */
    public static boolean isRoundButton(AbstractButton button) {
        return (!RadianceCoreUtilities.isComboBoxButton(button))
                && (!RadianceCoreUtilities.isScrollButton(button))
                && RadianceCoreUtilities.hasText(button);
    }

    @Override
    public boolean isProportionate() {
        return true;
    }

    @Override
    public float getCornerRadius(AbstractButton button, float insets) {
        float width = button.getWidth() - 2 * insets;
        float height = button.getHeight() - 2 * insets;

        boolean isRoundCorners = isRoundButton(button);
        float radius = RadianceSizeUtils
                .getClassicButtonCornerRadius(RadianceSizeUtils.getComponentFontSize(button));
        if (button.getClass().isAnnotationPresent(RadianceInternalArrowButton.class)) {
            Border parentBorder = ((JComponent) button.getParent()).getBorder();
            if (parentBorder instanceof RadianceBorder) {
                radius *= ((RadianceBorder) parentBorder).getRadiusScaleFactor();
            }
        }

        if (isRoundCorners) {
            if (width > height) {
                radius = (height) / 2.0f;
            } else {
                radius = (width) / 2.0f;
            }
        }

        if (RadianceCoreUtilities.isToolBarButton(button)) {
            radius = RadianceCoreUtilities.getToolbarButtonCornerRadius(button, insets);
        }
        return radius;
    }
}
