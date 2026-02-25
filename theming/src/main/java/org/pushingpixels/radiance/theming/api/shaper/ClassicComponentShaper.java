/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.utils.*;
import org.pushingpixels.radiance.theming.internal.utils.border.RadianceBorder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.EnumSet;
import java.util.Set;

/**
 * Component shaper that returns rectangular buttons with slightly rounded corners (ala Windows XP).
 * This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class ClassicComponentShaper implements RadianceComponentShaper {
    /** Cache of already computed outlines. */
    private final static LazyResettableHashMap<Shape> outlines = new LazyResettableHashMap<>(
        "ClassicComponentShaper");

    private final static RadianceOutlinePainter.ShapeSupplier CLASSIC_BUTTON_SHAPE_SUPPLIER =
        new ClassicButtonShapeSupplier();

    private static class ClassicButtonShapeSupplier implements RadianceOutlinePainter.ShapeSupplier {
        @Override
        public Shape getShape(Component c, float width, float height, float insets, float radiusAdjustment, double scaleFactor) {
            AbstractButton button = (AbstractButton) c;
            Set<RadianceThemingSlices.Side> straightSides = RadianceCoreUtilities.getSides(button,
                RadianceSynapse.BUTTON_STRAIGHT_SIDE);

            float radius = (float) scaleFactor * this.getCornerRadius(button, insets, radiusAdjustment);

            HashMapKey key = RadianceCoreUtilities.getHashKey(width, height, straightSides, radius, insets);

            Shape result = outlines.get(key);
            if (result != null) {
                return result;
            }

            result = RadianceOutlineUtilities.getBaseOutline(
                button.getComponentOrientation(),
                width - 1, height - 1, radius, straightSides, insets);
            outlines.put(key, result);
            return result;
        }

        float getCornerRadius(AbstractButton button, float insets, float radiusAdjustment) {
            float radius = RadianceSizeUtils
                .getClassicButtonCornerRadius(RadianceSizeUtils.getComponentFontSize(button));
            if ((button != null)
                && button.getClass().isAnnotationPresent(RadianceInternalArrowButton.class)) {
                Border parentBorder = ((JComponent) button.getParent()).getBorder();
                if (parentBorder instanceof RadianceBorder) {
                    radius *= ((RadianceBorder) parentBorder).getRadiusScaleFactor();
                }
            }
            radius -= radiusAdjustment;
            return radius;
        }
    }

    private RadianceOutlinePainter.ShapeSupplier SCROLLBAR_THUMB_SHAPE_SUPPLIER =
        (c, width, height, insets, radiusAdjustment, scaleFactor) -> {
            // Adaptive corner radius, either half the height for larger thumbs, or quarter the
            // height for smaller thumbs
            float adjustedInsets = insets + 1.0f;
            float radius = (width >= 1.5 * height)
                ? (height - 2.0f * adjustedInsets) / 2.0f
                : (height - 2.0f * adjustedInsets) / 4.0f;
            return RadianceOutlineUtilities.getBaseOutline(
                c.getComponentOrientation(), width, height, radius, null, insets + 1.0f);
        };

    private static RadianceOutlinePainter.ShapeSupplier TAB_SHAPE_SUPPLIER =
        (c, width, height, insets, radiusAdjustment, scaleFactor) -> {

            float cornerRadius = (float) scaleFactor * RadianceSizeUtils
                .getClassicButtonCornerRadius(RadianceSizeUtils.getComponentFontSize(c)) -
                radiusAdjustment;

            return RadianceOutlineUtilities.getBaseOutline(
                c.getComponentOrientation(),
                width, height, cornerRadius - insets,
                EnumSet.of(RadianceThemingSlices.Side.BOTTOM), 1.0f + insets);
        };

    private RadianceOutlinePainter.ShapeSupplier DEFAULT_SHAPE_SUPPLIER =
        (c, width, height, insets, radiusAdjustment, scaleFactor) -> {
            int fontSize = RadianceSizeUtils.getComponentFontSize(c);
            float radius = (float) scaleFactor *
                RadianceSizeUtils.getClassicButtonCornerRadius(fontSize) - insets - radiusAdjustment;

            return RadianceOutlineUtilities.getBaseOutline(
                c.getComponentOrientation(),
                width, height, radius, null, insets);
        };

    private RadianceOutlinePainter.ShapeSupplier DEFAULT_HALF_SHAPE_SUPPLIER =
        (c, width, height, insets, radiusAdjustment, scaleFactor) -> {
            int fontSize = RadianceSizeUtils.getComponentFontSize(c);
            float radius = 0.5f * (float) scaleFactor *
                RadianceSizeUtils.getClassicButtonCornerRadius(fontSize) - insets - radiusAdjustment;

            return RadianceOutlineUtilities.getBaseOutline(
                c.getComponentOrientation(),
                width, height, radius, null, insets);
        };

    private RadianceOutlinePainter.ShapeSupplier ROUND_SHAPE_SUPPLIER =
        (c, width, height, insets, radiusAdjustment, scaleFactor) ->
            new Ellipse2D.Float(insets, insets, width - 2.0f * insets, height - 2.0f * insets);

    private RadianceOutlinePainter.ShapeSupplier RECTANGLE_SHAPE_SUPPLIER =
        (c, width, height, insets, radiusAdjustment, scaleFactor) ->
            new Rectangle2D.Float(insets, insets, width - 1 - 2.0f * insets, height - 1 - 2.0f * insets);

    @Override
    public String getDisplayName() {
        return "Classic";
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getButtonShapeSupplier() {
        return CLASSIC_BUTTON_SHAPE_SUPPLIER;
    }

    @Override
    public Dimension getButtonPreferredSize(AbstractButton button) {
        Dimension result = RadianceMetricsUtilities.getPreferredButtonSize(button);
        boolean toTweakWidth = false;
        boolean toTweakHeight = false;

        Icon icon = button.getIcon();
        boolean hasIcon = RadianceCoreUtilities.hasIcon(button);
        boolean hasText = RadianceCoreUtilities.hasText(button);
        Insets margin = button.getMargin();

        boolean hasNoMinSizeProperty = RadianceCoreUtilities.hasNoMinSizeProperty(button);
        if ((!hasNoMinSizeProperty) && hasText) {
            result = new Dimension(Math.max(result.width,
                RadianceSizeUtils.getMinButtonWidth(RadianceSizeUtils.getComponentFontSize(button))),
                result.height);
        } else {
            if (hasNoMinSizeProperty) {
                if (margin != null) {
                    result = new Dimension(result.width + margin.left + margin.right,
                            result.height + margin.top + margin.bottom);
                }
            }
        }

        int fontSize = RadianceSizeUtils.getComponentFontSize(button);
        int extraPadding = RadianceSizeUtils.getExtraPadding(fontSize);
        float focusPadding = RadianceSizeUtils.getFocusRingPadding(button, fontSize);
        int iconPaddingWidth = 6 + 2 * extraPadding + (int) (2 * focusPadding);
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

        return result;
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getBaselineShapeSupplier() {
        return DEFAULT_SHAPE_SUPPLIER;
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getBaselineShapeSupplier(Set<RadianceThemingSlices.Side> straightSides) {
        return (c, width, height, insets, radiusAdjustment, scaleFactor) -> {
            float radius = (float) scaleFactor * RadianceSizeUtils.getClassicButtonCornerRadius(
                RadianceSizeUtils.getComponentFontSize(c));

            return RadianceOutlineUtilities.getBaseOutline(
                c.getComponentOrientation(), width, height, radius - radiusAdjustment,
                straightSides, insets);
        };
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getCheckBoxShapeSupplier() {
        return DEFAULT_SHAPE_SUPPLIER;
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getComboBoxShapeSupplier() {
        return DEFAULT_SHAPE_SUPPLIER;
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getProgressBarProgressShapeSupplier(
        Set<RadianceThemingSlices.Side> straightSides) {
        return (c, width, height, insets, radiusAdjustment, scaleFactor) -> {
            int fontSize = RadianceSizeUtils.getComponentFontSize(c);
            float radius = 0.5f * (float) scaleFactor *
                RadianceSizeUtils.getClassicButtonCornerRadius(fontSize) - insets - radiusAdjustment;

            return RadianceOutlineUtilities.getBaseOutline(
                c.getComponentOrientation(), width, height, radius, straightSides, insets);
        };
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getProgressBarTrackShapeSupplier() {
        return DEFAULT_HALF_SHAPE_SUPPLIER;
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getRadioButtonShapeSupplier() {
        return ROUND_SHAPE_SUPPLIER;
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getScrollBarThumbShapeSupplier() {
        return SCROLLBAR_THUMB_SHAPE_SUPPLIER;
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getSliderTrackShapeSupplier() {
        return DEFAULT_HALF_SHAPE_SUPPLIER;
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getSplitDividerBumpShapeSupplier() {
        return ROUND_SHAPE_SUPPLIER;
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getTabShapeSupplier() {
        return TAB_SHAPE_SUPPLIER;
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getTextComponentShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public RadianceOutlinePainter.ShapeSupplier getTreeIconShapeSupplier() {
        return DEFAULT_HALF_SHAPE_SUPPLIER;
    }

    public static class ToolbarComponentShaper extends ClassicComponentShaper {
        private final static RadianceOutlinePainter.ShapeSupplier TOOLBAR_BUTTON_SHAPE_SUPPLIER =
            new ToolbarButtonShapeSupplier();

        private static class ToolbarButtonShapeSupplier extends ClassicButtonShapeSupplier {
            @Override
            float getCornerRadius(AbstractButton button, float insets, float radiusAdjustment) {
                return 2.0f - radiusAdjustment;
            }
        }

        @Override
        public RadianceOutlinePainter.ShapeSupplier getButtonShapeSupplier() {
            return TOOLBAR_BUTTON_SHAPE_SUPPLIER;
        }

        @Override
        public String getDisplayName() {
            return "Toolbar";
        }

    }
}
