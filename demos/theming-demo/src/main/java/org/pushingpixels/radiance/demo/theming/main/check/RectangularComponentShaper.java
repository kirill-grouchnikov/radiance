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
package org.pushingpixels.radiance.demo.theming.main.check;

import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.shaper.ClassicComponentShaper;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.Set;

public class RectangularComponentShaper extends ClassicComponentShaper {
    private final ShapeSupplier RECTANGLE_SHAPE_SUPPLIER =
        (c, width, height, insets, radiusAdjustment, scaleFactor) ->
            new Rectangle2D.Float(insets, insets, width - 2.0f * insets, height - 2.0f * insets);

    private final ShapeSupplier ROUND_SHAPE_SUPPLIER =
        (c, width, height, insets, radiusAdjustment, scaleFactor) ->
            new Ellipse2D.Float(insets, insets, width - 2.0f * insets, height - 2.0f * insets);

    private final ShapeSupplier DIAMOND_SHAPE_SUPPLIER =
        (c, width, height, insets, radiusAdjustment, scaleFactor) -> {
            float dimension = Math.min(width, height) - 1.0f;
            float midX = width / 2.0f - 1.0f;
            float midY = height / 2.0f - 1.0f;
            float halfSize = dimension / 2.0f - insets;

            Path2D.Float result = new Path2D.Float();
            // Starting from top, clockwise
            result.moveTo(midX, midY - halfSize);
            result.lineTo(midX + halfSize, midY);
            result.lineTo(midX, midY + halfSize);
            result.lineTo(midX - halfSize, midY);
            result.closePath();
            return result;
        };

    @Override
    public String getDisplayName() {
        return "Rectangular Demo";
    }

    @Override
    public ShapeSupplier getButtonShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public Insets getBaselineInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public ShapeSupplier getBaselineShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getBaselineShapeSupplier(Set<RadianceThemingSlices.Side> straightSides) {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getCheckBoxShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getComboBoxShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getProgressBarProgressShapeSupplier(
        Set<RadianceThemingSlices.Side> straightSides) {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getProgressBarTrackShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getRadioButtonShapeSupplier() {
        return ROUND_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getScrollBarThumbShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getSliderThumbDirectionalShapeSupplier() {
        return DIAMOND_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getSliderThumbUniformShapeSupplier() {
        return DIAMOND_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getSliderTrackShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getSplitDividerBumpShapeSupplier() {
        return ROUND_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getSwitchThumbShapeSupplier() {
        return ROUND_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getSwitchTrackShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getTabShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getTextComponentShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }

    @Override
    public ShapeSupplier getTreeIconShapeSupplier() {
        return RECTANGLE_SHAPE_SUPPLIER;
    }
}
