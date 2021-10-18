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
package org.pushingpixels.radiance.laf.internal.utils.icon;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.laf.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.laf.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.laf.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.laf.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.laf.internal.ui.RadianceSliderUI;
import org.pushingpixels.radiance.laf.internal.ui.RadianceTreeUI;
import org.pushingpixels.radiance.laf.internal.utils.*;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/**
 * Icon factory for dynamically-changing icons. This class is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceIconFactory {
    /**
     * Icons for horizontal slider in {@link RadianceSliderUI}.
     */
    private static LazyResettableHashMap<Icon> sliderHorizontalIcons =
            new LazyResettableHashMap<>("RadianceIconFactory.sliderHorizontalIcon");

    /**
     * Icons for horizontal slider in {@link RadianceSliderUI}.
     */
    private static LazyResettableHashMap<Icon> sliderRoundIcons =
            new LazyResettableHashMap<>("RadianceIconFactory.sliderRoundIcon");

    /**
     * Icons for vertical slider in {@link RadianceSliderUI}.
     */
    private static LazyResettableHashMap<Icon> sliderVerticalIcons =
            new LazyResettableHashMap<>("RadianceIconFactory.sliderVerticalIcon");

    /**
     * Icons for tree collapse / expand in {@link RadianceTreeUI}.
     */
    private static LazyResettableHashMap<RadianceIcon> treeIcons =
            new LazyResettableHashMap<>("RadianceIconFactory.treeIcon");

    /**
     * Retrieves icon for horizontal slider in {@link RadianceSliderUI}.
     * 
     * @param size
     *            The size of the icon to retrieve.
     * @param isMirrored
     *            Indication whether the icon should be mirrored.
     * @return Icon for horizontal slider in {@link RadianceSliderUI}.
     */
    public static Icon getSliderHorizontalIcon(JSlider slider, int size, boolean isMirrored) {
        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                RadianceCommonCortex.getScaleFactor(slider), size, isMirrored);
        if (RadianceIconFactory.sliderHorizontalIcons.get(key) == null) {
            Icon icon = new SliderHorizontalIcon(size, isMirrored);
            RadianceIconFactory.sliderHorizontalIcons.put(key, icon);
        }
        return RadianceIconFactory.sliderHorizontalIcons.get(key);
    }

    /**
     * Retrieves round icon for slider in {@link RadianceSliderUI}.
     * 
     * @param size
     *            The size of the icon to retrieve.
     * @return Round icon for slider in {@link RadianceSliderUI}.
     */
    public static Icon getSliderRoundIcon(JSlider slider, int size) {
        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                RadianceCommonCortex.getScaleFactor(slider), size);
        if (RadianceIconFactory.sliderRoundIcons.get(key) == null) {
            Icon icon = new SliderRoundIcon(size);
            RadianceIconFactory.sliderRoundIcons.put(key, icon);
        }
        return RadianceIconFactory.sliderRoundIcons.get(key);
    }

    /**
     * Retrieves icon for vertical slider in {@link RadianceSliderUI}.
     * 
     * @param size
     *            The size of the icon to retrieve.
     * @param isMirrorred
     *            Indication whether the icon should be mirrored.
     * @return Icon for vertical slider in {@link RadianceSliderUI}.
     */
    public static Icon getSliderVerticalIcon(JSlider slider, int size, boolean isMirrorred) {
        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                RadianceCommonCortex.getScaleFactor(slider), size, isMirrorred);
        if (RadianceIconFactory.sliderVerticalIcons.get(key) == null) {
            Icon icon = new SliderVerticalIcon(size, isMirrorred);
            RadianceIconFactory.sliderVerticalIcons.put(key, icon);
        }
        return RadianceIconFactory.sliderVerticalIcons.get(key);
    }

    public static RadianceIcon getTreeIcon(JTree tree, boolean isCollapsed) {
        double scale = RadianceCommonCortex.getScaleFactor(tree);
        int fontSize = RadianceSizeUtils.getComponentFontSize(tree);
        int size = RadianceSizeUtils.getTreeIconSize(fontSize);

        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(scale, size, isCollapsed);
        if (RadianceIconFactory.treeIcons.get(key) == null) {
            RadianceIcon icon = new TreeIcon(size, isCollapsed);
            RadianceIconFactory.treeIcons.put(key, icon);
        }
        return RadianceIconFactory.treeIcons.get(key);
    }

    /**
     * Icon for horizontal slider in {@link RadianceSliderUI}.
     * 
     * @author Kirill Grouchnikov
     */
    private static class SliderHorizontalIcon implements Icon, UIResource {
        /**
         * Icon hash.
         */
        private static LazyResettableHashMap<ScaleAwareImageWrapperIcon> icons =
                new LazyResettableHashMap<>("RadianceIconFactory.SliderHorizontalIcon");

        /**
         * The size of <code>this</code> icon.
         */
        private int size;

        /**
         * Indication whether the icon is mirrorred.
         */
        private boolean isMirrorred;

        /**
         * Simple constructor.
         * 
         * @param size
         *            The size of <code>this</code> icon.
         * @param isMirrorred
         *            Indication whether the icon should be mirrored.
         */
        public SliderHorizontalIcon(int size, boolean isMirrorred) {
            this.size = size;
            this.isMirrorred = isMirrorred;
        }

        private ScaleAwareImageWrapperIcon getIcon(JSlider slider,
                StateTransitionTracker stateTransitionTracker) {
            double scale = RadianceCommonCortex.getScaleFactor(slider);
            StateTransitionTracker.ModelStateInfo modelStateInfo =
                    stateTransitionTracker.getModelStateInfo();
            Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                    modelStateInfo.getStateContributionMap();
            ComponentState currState =
                    stateTransitionTracker.getModelStateInfo().getCurrModelState();

            float activeStrength = stateTransitionTracker.getActiveStrength();
            float width = this.size * (2.0f + activeStrength) / 3.0f;

            RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(slider);
            RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(slider);

            RadianceColorScheme baseFillScheme = RadianceColorSchemeUtilities
                    .getColorScheme(slider, currState);
            RadianceColorScheme baseBorderScheme = RadianceColorSchemeUtilities
                    .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, currState);

            ImageHashMapKey baseKey = RadianceCoreUtilities.getScaleAwareHashKey(
                    scale, this.size, width,
                    baseFillScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
                    fillPainter.getDisplayName(), borderPainter.getDisplayName(), this.isMirrorred);

            ScaleAwareImageWrapperIcon baseLayer = SliderHorizontalIcon.icons.get(baseKey);
            if (baseLayer == null) {
                baseLayer = getSingleLayer(slider, width, fillPainter, borderPainter,
                        baseFillScheme, baseBorderScheme);
                SliderHorizontalIcon.icons.put(baseKey, baseLayer);
            }

            if (currState.isDisabled() || (activeStates.size() == 1)) {
                return baseLayer;
            }

            BufferedImage result = RadianceCoreUtilities.getBlankImage(scale,
                    baseLayer.getIconWidth(), baseLayer.getIconHeight());
            Graphics2D g2d = result.createGraphics();
            baseLayer.paintIcon(slider, g2d, 0, 0);
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                    activeStates.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == currState) {
                    continue;
                }

                float contribution = activeEntry.getValue().getContribution();
                if (contribution == 0.0f) {
                    continue;
                }

                RadianceColorScheme fillScheme = RadianceColorSchemeUtilities
                        .getColorScheme(slider, activeState);
                RadianceColorScheme borderScheme = RadianceColorSchemeUtilities
                        .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, activeState);

                ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                        scale, this.size, width,
                        fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                        fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                        this.isMirrorred);

                ScaleAwareImageWrapperIcon layer = SliderHorizontalIcon.icons.get(key);
                if (layer == null) {
                    layer = getSingleLayer(slider, width, fillPainter, borderPainter, fillScheme,
                            borderScheme);
                    SliderHorizontalIcon.icons.put(key, layer);
                }

                g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));
                layer.paintIcon(slider, g2d, 0, 0);
            }

            g2d.dispose();
            return new ScaleAwareImageWrapperIcon(result, scale);
        }

        private ScaleAwareImageWrapperIcon getSingleLayer(JSlider slider, float width,
                RadianceFillPainter fillPainter, RadianceBorderPainter borderPainter,
                RadianceColorScheme fillScheme, RadianceColorScheme borderScheme) {
            double scale = RadianceCommonCortex.getScaleFactor(slider);
            float borderDelta = RadianceSizeUtils.getBorderStrokeWidth(slider) / 2.0f;
            Shape contour = RadianceOutlineUtilities.getTriangleButtonOutline(width, this.size - 1,
                    2, borderDelta);

            BufferedImage stateImage = RadianceCoreUtilities.getBlankImage(
                    scale, this.size, this.size);
            Graphics2D g2d = stateImage.createGraphics();
            g2d.translate((this.size - width) / 2.0f, 0);

            fillPainter.paintContourBackground(g2d, slider, width, this.size, contour, false,
                    fillScheme, true);

            float borderThickness = RadianceSizeUtils.getBorderStrokeWidth(slider);
            GeneralPath contourInner = RadianceOutlineUtilities.getTriangleButtonOutline(width,
                    this.size - 1, 2, borderThickness + borderDelta);

            borderPainter.paintBorder(g2d, slider, width, this.size, contour, contourInner,
                    borderScheme);
            g2d.dispose();

            if (this.isMirrorred) {
                stateImage = RadianceImageCreator.getRotated(scale, stateImage, 2);
            }

            return new ScaleAwareImageWrapperIcon(stateImage, scale);
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            if (!(g instanceof Graphics2D)) {
                return;
            }

            JSlider slider = (JSlider) c;
            TransitionAwareUI transitionAwareUI = (TransitionAwareUI) slider.getUI();
            StateTransitionTracker stateTransitionTracker =
                    transitionAwareUI.getTransitionTracker();
            Icon iconToDraw = getIcon(slider, stateTransitionTracker);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.translate(x, y);
            iconToDraw.paintIcon(c, g, 0, 0);
            g2d.dispose();
        }

        @Override
        public int getIconWidth() {
            return this.size;
        }

        @Override
        public int getIconHeight() {
            return this.size;
        }
    }

    /**
     * Round icon for sliders in {@link RadianceSliderUI}.
     * 
     * @author Kirill Grouchnikov
     */
    private static class SliderRoundIcon implements Icon, UIResource {
        /**
         * Icon hash.
         */
        private static LazyResettableHashMap<ScaleAwareImageWrapperIcon> icons =
                new LazyResettableHashMap<>("RadianceIconFactory.SliderRoundIcon");

        /**
         * The size of <code>this</code> icon.
         */
        private int size;

        /**
         * Simple constructor.
         * 
         * @param size
         *            The size of <code>this</code> icon.
         */
        public SliderRoundIcon(int size) {
            this.size = size;
        }

        /**
         * Retrieves icon that matches the specified state of the slider thumb.
         * 
         * @param slider
         *            The slider itself.
         * @return Icon that matches the specified state of the slider thumb.
         */
        private ScaleAwareImageWrapperIcon getIcon(JSlider slider,
                StateTransitionTracker stateTransitionTracker) {
            double scale = RadianceCommonCortex.getScaleFactor(slider);
            StateTransitionTracker.ModelStateInfo modelStateInfo =
                    stateTransitionTracker.getModelStateInfo();
            Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                    modelStateInfo.getStateContributionMap();
            ComponentState currState =
                    stateTransitionTracker.getModelStateInfo().getCurrModelState();

            float activeStrength = stateTransitionTracker.getActiveStrength();
            float width = this.size * (2.0f + activeStrength) / 3.0f;

            RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(slider);
            RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(slider);

            RadianceColorScheme baseFillScheme = RadianceColorSchemeUtilities
                    .getColorScheme(slider, currState);
            RadianceColorScheme baseBorderScheme = RadianceColorSchemeUtilities
                    .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, currState);

            ImageHashMapKey baseKey = RadianceCoreUtilities.getScaleAwareHashKey(
                    scale, this.size, width,
                    baseFillScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
                    fillPainter.getDisplayName(), borderPainter.getDisplayName());

            ScaleAwareImageWrapperIcon baseLayer = SliderRoundIcon.icons.get(baseKey);
            if (baseLayer == null) {
                baseLayer = getSingleLayer(slider, width, fillPainter, borderPainter,
                        baseFillScheme, baseBorderScheme);
                SliderRoundIcon.icons.put(baseKey, baseLayer);
            }

            if (currState.isDisabled() || (activeStates.size() == 1)) {
                return baseLayer;
            }

            BufferedImage result = RadianceCoreUtilities.getBlankImage(scale,
                    baseLayer.getIconWidth(), baseLayer.getIconHeight());
            Graphics2D g2d = result.createGraphics();
            baseLayer.paintIcon(slider, g2d, 0, 0);

            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                    activeStates.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == currState) {
                    continue;
                }

                float contribution = activeEntry.getValue().getContribution();
                if (contribution == 0.0f) {
                    continue;
                }

                RadianceColorScheme fillScheme = RadianceColorSchemeUtilities
                        .getColorScheme(slider, activeState);
                RadianceColorScheme borderScheme = RadianceColorSchemeUtilities
                        .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, activeState);

                ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                        scale, this.size, width,
                        fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                        fillPainter.getDisplayName(), borderPainter.getDisplayName());

                ScaleAwareImageWrapperIcon layer = SliderRoundIcon.icons.get(key);
                if (layer == null) {
                    layer = getSingleLayer(slider, width, fillPainter, borderPainter, fillScheme,
                            borderScheme);
                    SliderRoundIcon.icons.put(key, layer);
                }

                g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));
                layer.paintIcon(slider, g2d, 0, 0);
            }

            g2d.dispose();
            return new ScaleAwareImageWrapperIcon(result, scale);
        }

        private ScaleAwareImageWrapperIcon getSingleLayer(JSlider slider, float width,
                RadianceFillPainter fillPainter, RadianceBorderPainter borderPainter,
                RadianceColorScheme fillScheme, RadianceColorScheme borderScheme) {
            double scale = RadianceCommonCortex.getScaleFactor(slider);
            float borderDelta = RadianceSizeUtils.getBorderStrokeWidth(slider) / 2.0f;
            Shape contour = new Ellipse2D.Float(borderDelta, borderDelta,
                    width - 2 * borderDelta - 1, width - 2 * borderDelta - 1);

            BufferedImage stateImage = RadianceCoreUtilities.getBlankImage(
                    scale, this.size, this.size);
            Graphics2D g2d = stateImage.createGraphics();

            float delta = (this.size - width) / 2.0f;
            g2d.translate(delta, delta);

            fillPainter.paintContourBackground(g2d, slider, width, this.size, contour, false,
                    fillScheme, true);

            float borderThickness = RadianceSizeUtils.getBorderStrokeWidth(slider);
            Shape contourInner = new Ellipse2D.Float(borderDelta + borderThickness,
                    borderDelta + borderThickness,
                    width - 2 * borderDelta - 2 * borderThickness - 1,
                    width - 2 * borderDelta - 2 * borderThickness - 1);

            borderPainter.paintBorder(g2d, slider, width, this.size, contour, contourInner,
                    borderScheme);

            return new ScaleAwareImageWrapperIcon(stateImage, scale);
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            if (!(g instanceof Graphics2D)) {
                return;
            }

            JSlider slider = (JSlider) c;
            TransitionAwareUI transitionAwareUI = (TransitionAwareUI) slider.getUI();
            StateTransitionTracker stateTransitionTracker = transitionAwareUI
                    .getTransitionTracker();
            Icon iconToDraw = getIcon(slider, stateTransitionTracker);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.translate(x, y);
            iconToDraw.paintIcon(c, g, 0, 0);
            g2d.dispose();
        }

        @Override
        public int getIconWidth() {
            return this.size;
        }

        @Override
        public int getIconHeight() {
            return this.size;
        }
    }

    /**
     * Icon for vertical slider in {@link RadianceSliderUI}.
     * 
     * @author Kirill Grouchnikov
     */
    private static class SliderVerticalIcon implements Icon, UIResource {
        /**
         * Icon hash.
         */
        private static LazyResettableHashMap<ScaleAwareImageWrapperIcon> icons =
                new LazyResettableHashMap<>("RadianceIconFactory.SliderVerticalIcon");

        /**
         * The size of <code>this</code> icon.
         */
        private int size;

        /**
         * Indication whether the icon is mirrorred.
         */
        private boolean isMirrorred;

        /**
         * Simple constructor.
         * 
         * @param size
         *            The size of <code>this</code> icon.
         * @param isMirrorred
         *            Indication whether the icon should be mirrored.
         */
        public SliderVerticalIcon(int size, boolean isMirrorred) {
            this.size = size;
            this.isMirrorred = isMirrorred;
        }

        /**
         * Retrieves icon that matches the specified state of the slider thumb.
         * 
         * @param slider
         *            The slider itself.
         * @return Icon that matches the specified state of the slider thumb.
         */
        private ScaleAwareImageWrapperIcon getIcon(JSlider slider,
                StateTransitionTracker stateTransitionTracker) {
            double scale = RadianceCommonCortex.getScaleFactor(slider);
            StateTransitionTracker.ModelStateInfo modelStateInfo =
                    stateTransitionTracker.getModelStateInfo();
            Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                    modelStateInfo.getStateContributionMap();
            ComponentState currState =
                    stateTransitionTracker.getModelStateInfo().getCurrModelState();

            float activeStrength = stateTransitionTracker.getActiveStrength();
            int height = (int) (this.size * (2.0 + activeStrength) / 3.0);
            height = Math.min(height, this.size - 2);
            int delta = (this.size - height) / 2 - 1;

            RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(slider);
            RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(slider);

            RadianceColorScheme baseFillScheme = RadianceColorSchemeUtilities
                    .getColorScheme(slider, currState);
            RadianceColorScheme baseBorderScheme = RadianceColorSchemeUtilities
                    .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, currState);

            ImageHashMapKey baseKey = RadianceCoreUtilities.getScaleAwareHashKey(
                    scale, this.size, height,
                    slider.getComponentOrientation(), baseFillScheme.getDisplayName(),
                    baseBorderScheme.getDisplayName(), fillPainter.getDisplayName(),
                    borderPainter.getDisplayName(), this.isMirrorred);

            ScaleAwareImageWrapperIcon baseLayer = SliderVerticalIcon.icons.get(baseKey);
            if (baseLayer == null) {
                baseLayer = getSingleLayer(slider, height, delta, fillPainter, borderPainter,
                        baseFillScheme, baseBorderScheme);
                SliderVerticalIcon.icons.put(baseKey, baseLayer);
            }

            if (currState.isDisabled() || (activeStates.size() == 1)) {
                return baseLayer;
            }

            BufferedImage result = RadianceCoreUtilities.getBlankImage(scale,
                    baseLayer.getIconWidth(), baseLayer.getIconHeight());
            Graphics2D g2d = result.createGraphics();
            baseLayer.paintIcon(slider, g2d, 0, 0);

            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                    activeStates.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == currState) {
                    continue;
                }

                float contribution = activeEntry.getValue().getContribution();
                if (contribution == 0.0f) {
                    continue;
                }

                RadianceColorScheme fillScheme = RadianceColorSchemeUtilities
                        .getColorScheme(slider, activeState);
                RadianceColorScheme borderScheme = RadianceColorSchemeUtilities
                        .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, activeState);

                ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                        scale, this.size, height,
                        slider.getComponentOrientation(), fillScheme.getDisplayName(),
                        borderScheme.getDisplayName(), fillPainter.getDisplayName(),
                        borderPainter.getDisplayName(), this.isMirrorred);

                ScaleAwareImageWrapperIcon layer = SliderVerticalIcon.icons.get(key);
                if (layer == null) {
                    layer = getSingleLayer(slider, height, delta, fillPainter, borderPainter,
                            fillScheme, borderScheme);
                    SliderVerticalIcon.icons.put(key, layer);
                }

                g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));
                layer.paintIcon(slider, g2d, 0, 0);
            }

            g2d.dispose();
            return new ScaleAwareImageWrapperIcon(result, scale);
        }

        private ScaleAwareImageWrapperIcon getSingleLayer(JSlider slider, int height, int delta,
                RadianceFillPainter fillPainter, RadianceBorderPainter borderPainter,
                RadianceColorScheme fillScheme, RadianceColorScheme borderScheme) {
            double scale = RadianceCommonCortex.getScaleFactor(slider);
            float borderDelta = RadianceSizeUtils.getBorderStrokeWidth(slider) / 2.0f;
            Shape contour = RadianceOutlineUtilities.getTriangleButtonOutline(height,
                    this.size - 1, 2, borderDelta);

            BufferedImage stateImage = RadianceCoreUtilities.getBlankImage(scale,
                    this.size - 1, this.size - 1);
            Graphics2D g2d = stateImage.createGraphics();
            g2d.translate(delta, 0);

            fillPainter.paintContourBackground(g2d, slider, height, this.size, contour, false,
                    fillScheme, true);

            float borderThickness = RadianceSizeUtils.getBorderStrokeWidth(slider);
            GeneralPath contourInner = RadianceOutlineUtilities.getTriangleButtonOutline(height,
                    this.size - 1, 2, borderThickness + borderDelta);

            borderPainter.paintBorder(g2d, slider, height, this.size - 1, contour, contourInner,
                    borderScheme);

            if (this.isMirrorred) {
                stateImage = RadianceImageCreator.getRotated(scale, stateImage, 1);
            } else {
                stateImage = RadianceImageCreator.getRotated(scale, stateImage, 3);
            }

            if (!slider.getComponentOrientation().isLeftToRight()) {
                stateImage = RadianceImageCreator.getRotated(scale, stateImage, 2);
            }

            return new ScaleAwareImageWrapperIcon(stateImage, scale);
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            if (!(g instanceof Graphics2D)) {
                return;
            }

            JSlider slider = (JSlider) c;
            TransitionAwareUI transitionAwareUI = (TransitionAwareUI) slider.getUI();
            StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
            Icon iconToDraw = getIcon(slider, stateTransitionTracker);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.translate(x, y);
            iconToDraw.paintIcon(c, g, 0, 0);
            g2d.dispose();
        }

        @Override
        public int getIconWidth() {
            return this.size - 1;
        }

        @Override
        public int getIconHeight() {
            return this.size - 1;
        }
    }

    /**
     * Collapse / expand icons for JTrees in {@link RadianceTreeUI}.
     * 
     * @author Kirill Grouchnikov
     */
    private static class TreeIcon implements RadianceIcon, UIResource {
        /**
         * Icon hash.
         */
        private static LazyResettableHashMap<ScaleAwareImageWrapperIcon> icons =
                new LazyResettableHashMap<>("RadianceIconFactory.TreeIcon");

        /**
         * The collapsed indication of this icon
         */
        private boolean isCollapsed;

        private int size;

        /**
         * Simple constructor.
         * 
         * @param isCollapsed
         *            The collapsed indication of <code>this</code> icon.
         */
        public TreeIcon(int size, boolean isCollapsed) {
            this.isCollapsed = isCollapsed;
            this.size = size;
        }

        @Override
        public void setDimension(Dimension newDimension) {
            this.size = newDimension.width;
        }

        @Override
        public boolean supportsColorFilter() {
            return false;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException();
        }

        /**
         * Retrieves icon that matches the specified state of the tree.
         */
        private static ScaleAwareImageWrapperIcon getIcon(JTree tree, boolean isCollapsed) {
            double scale = RadianceCommonCortex.getScaleFactor(tree);
            ComponentState state = ((tree == null) || tree.isEnabled()) ? ComponentState.ENABLED
                    : ComponentState.DISABLED_UNSELECTED;
            RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(tree,
                    state);
            RadianceColorScheme borderScheme = RadianceColorSchemeUtilities.getColorScheme(tree,
                    ColorSchemeAssociationKind.BORDER, state);
            RadianceColorScheme markScheme = RadianceColorSchemeUtilities.getColorScheme(tree,
                    ColorSchemeAssociationKind.MARK, state);

            int fontSize = RadianceSizeUtils.getComponentFontSize(tree);

            ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                    scale, fontSize,
                    fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                    markScheme.getDisplayName(), isCollapsed);

            ScaleAwareImageWrapperIcon result = TreeIcon.icons.get(key);
            if (result != null) {
                return result;
            }

            result = new ScaleAwareImageWrapperIcon(RadianceImageCreator.getTreeIcon(
                    tree, fillScheme, borderScheme, markScheme, isCollapsed), scale);
            TreeIcon.icons.put(key, result);

            return result;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            if (!(g instanceof Graphics2D)) {
                return;
            }

            // The following check is here because some applications
            // (like JIDE's ExpandablePanel) may decide to use the
            // "Tree.collapsedIcon" and "Tree.expandedIcon" UIManager
            // entries to paint on non-JTree components. Sigh.
            JTree tree = (c instanceof JTree) ? (JTree) c : null;
            ScaleAwareImageWrapperIcon iconToDraw = TreeIcon.getIcon(tree, this.isCollapsed);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.translate(x, y);
            iconToDraw.paintIcon(c, g2d, 0, 0);
            g2d.dispose();
        }

        @Override
        public int getIconWidth() {
            return this.size;
        }

        @Override
        public int getIconHeight() {
            return this.size;
        }
    }

    /**
     * Icon kind of a title pane button.
     * 
     * @author Kirill Grocuhnikov.
     */
    public enum IconKind {
        /**
         * Icon of a close button.
         */
        CLOSE,

        /**
         * Icon of a minimize button.
         */
        MINIMIZE,

        /**
         * Icon of a maximize button.
         */
        MAXIMIZE,

        /**
         * Icon of a restore button.
         */
        RESTORE
    }

    /**
     * Cache of title pane icons.
     */
    private static final Map<IconKind, LazyResettableHashMap<ScaleAwareImageWrapperIcon>> titlePaneIcons =
            RadianceIconFactory.createTitlePaneIcons();

    /**
     * Creates an empty map of title pane icons.
     * 
     * @return Empty map of title pane icons.
     */
    private static Map<IconKind, LazyResettableHashMap<ScaleAwareImageWrapperIcon>> createTitlePaneIcons() {
        Map<IconKind, LazyResettableHashMap<ScaleAwareImageWrapperIcon>> result = new HashMap<>();

        result.put(IconKind.CLOSE, new LazyResettableHashMap<>("Close title pane icons"));
        result.put(IconKind.MINIMIZE, new LazyResettableHashMap<>("Minimize title pane icons"));
        result.put(IconKind.MAXIMIZE, new LazyResettableHashMap<>("Maximize title pane icons"));
        result.put(IconKind.RESTORE, new LazyResettableHashMap<>("Restore title pane icons"));
        return result;
    }

    /**
     * Returns title pane icon of the specified kind.
     * 
     * @param iconKind
     *            Icon kind.
     * @param scheme
     *            Color scheme.
     * @return Title pane icon of the specified kind.
     */
    public static ScaleAwareImageWrapperIcon getTitlePaneIcon(Component titlePane,
            IconKind iconKind, RadianceColorScheme scheme) {
        LazyResettableHashMap<ScaleAwareImageWrapperIcon> kindMap =
                RadianceIconFactory.titlePaneIcons.get(iconKind);
        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                RadianceCommonCortex.getScaleFactor(titlePane), scheme.getDisplayName());
        ScaleAwareImageWrapperIcon result = kindMap.get(key);
        if (result != null)
            return result;

        switch (iconKind) {
            case CLOSE:
                result = RadianceImageCreator.getCloseIcon(titlePane, scheme);
                break;
            case MINIMIZE:
                result = RadianceImageCreator.getMinimizeIcon(titlePane, scheme);
                break;
            case MAXIMIZE:
                result = RadianceImageCreator.getMaximizeIcon(titlePane, scheme);
                break;
            case RESTORE:
                result = RadianceImageCreator.getRestoreIcon(titlePane, scheme);
                break;
        }
        kindMap.put(key, result);
        return result;
    }
}
