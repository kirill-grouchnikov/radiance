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
package org.pushingpixels.substance.internal.utils.icon;

import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.IsHiDpiAware;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.ui.SubstanceSliderUI;
import org.pushingpixels.substance.internal.ui.SubstanceTreeUI;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceOutlineUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

/**
 * Icon factory for dynamically-changing icons. This class is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceIconFactory {
    /**
     * Icons for horizontal slider in {@link SubstanceSliderUI}.
     */
    private static LazyResettableHashMap<Icon> sliderHorizontalIcons = new LazyResettableHashMap<Icon>(
            "SubstanceIconFactory.sliderHorizontalIcon");

    /**
     * Icons for horizontal slider in {@link SubstanceSliderUI}.
     */
    private static LazyResettableHashMap<Icon> sliderRoundIcons = new LazyResettableHashMap<Icon>(
            "SubstanceIconFactory.sliderRoundIcon");

    /**
     * Icons for vertical slider in {@link SubstanceSliderUI}.
     */
    private static LazyResettableHashMap<Icon> sliderVerticalIcons = new LazyResettableHashMap<Icon>(
            "SubstanceIconFactory.sliderVerticalIcon");

    /**
     * Icons for tree collapse / expand in {@link SubstanceTreeUI}.
     */
    private static LazyResettableHashMap<Icon> treeIcons = new LazyResettableHashMap<Icon>(
            "SubstanceIconFactory.treeIcon");

    /**
     * Retrieves icon for horizontal slider in {@link SubstanceSliderUI}.
     * 
     * @param size
     *            The size of the icon to retrieve.
     * @param isMirrorred
     *            Indication whether the icon should be mirrored.
     * @return Icon for horizontal slider in {@link SubstanceSliderUI}.
     */
    public static Icon getSliderHorizontalIcon(int size, boolean isMirrorred) {
        HashMapKey key = SubstanceCoreUtilities.getHashKey(size, isMirrorred);
        if (SubstanceIconFactory.sliderHorizontalIcons.get(key) == null) {
            Icon icon = new SliderHorizontalIcon(size, isMirrorred);
            SubstanceIconFactory.sliderHorizontalIcons.put(key, icon);
        }
        return SubstanceIconFactory.sliderHorizontalIcons.get(key);
    }

    /**
     * Retrieves round icon for slider in {@link SubstanceSliderUI}.
     * 
     * @param size
     *            The size of the icon to retrieve.
     * @return Round icon for slider in {@link SubstanceSliderUI}.
     */
    public static Icon getSliderRoundIcon(int size) {
        HashMapKey key = SubstanceCoreUtilities.getHashKey(size);
        if (SubstanceIconFactory.sliderRoundIcons.get(key) == null) {
            Icon icon = new SliderRoundIcon(size);
            SubstanceIconFactory.sliderRoundIcons.put(key, icon);
        }
        return SubstanceIconFactory.sliderRoundIcons.get(key);
    }

    /**
     * Retrieves icon for vertical slider in {@link SubstanceSliderUI}.
     * 
     * @param size
     *            The size of the icon to retrieve.
     * @param isMirrorred
     *            Indication whether the icon should be mirrored.
     * @return Icon for vertical slider in {@link SubstanceSliderUI}.
     */
    public static Icon getSliderVerticalIcon(int size, boolean isMirrorred) {
        HashMapKey key = SubstanceCoreUtilities.getHashKey(size, isMirrorred);
        if (SubstanceIconFactory.sliderVerticalIcons.get(key) == null) {
            Icon icon = new SliderVerticalIcon(size, isMirrorred);
            SubstanceIconFactory.sliderVerticalIcons.put(key, icon);
        }
        return SubstanceIconFactory.sliderVerticalIcons.get(key);
    }

    public static Icon getTreeIcon(JTree tree, boolean isCollapsed) {
        int fontSize = SubstanceSizeUtils.getComponentFontSize(tree);
        int size = SubstanceSizeUtils.getTreeIconSize(fontSize);

        HashMapKey key = SubstanceCoreUtilities.getHashKey(size, isCollapsed);
        if (SubstanceIconFactory.treeIcons.get(key) == null) {
            Icon icon = new TreeIcon(size, isCollapsed);
            SubstanceIconFactory.treeIcons.put(key, icon);
        }
        return SubstanceIconFactory.treeIcons.get(key);
    }

    /**
     * Icon for horizontal slider in {@link SubstanceSliderUI}.
     * 
     * @author Kirill Grouchnikov
     */
    private static class SliderHorizontalIcon implements Icon, UIResource {
        /**
         * Icon hash.
         */
        private static LazyResettableHashMap<SubstanceIconUIResource> icons = new LazyResettableHashMap<SubstanceIconUIResource>(
                "SubstanceIconFactory.SliderHorizontalIcon");

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

        private SubstanceIconUIResource getIcon(JSlider slider,
                StateTransitionTracker stateTransitionTracker) {
            StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                    .getModelStateInfo();
            Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                    .getStateContributionMap();
            ComponentState currState = stateTransitionTracker.getModelStateInfo()
                    .getCurrModelState();

            float activeStrength = stateTransitionTracker.getActiveStrength();
            float width = this.size * (2.0f + activeStrength) / 3.0f;

            SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(slider);
            SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(slider);

            SubstanceColorScheme baseFillScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(slider, currState);
            SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, currState);

            HashMapKey baseKey = SubstanceCoreUtilities.getHashKey(this.size, width,
                    baseFillScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
                    fillPainter.getDisplayName(), borderPainter.getDisplayName(), this.isMirrorred);

            SubstanceIconUIResource baseLayer = SliderHorizontalIcon.icons.get(baseKey);
            if (baseLayer == null) {
                baseLayer = getSingleLayer(slider, width, fillPainter, borderPainter,
                        baseFillScheme, baseBorderScheme);
                SliderHorizontalIcon.icons.put(baseKey, baseLayer);
            }

            if (currState.isDisabled() || (activeStates.size() == 1))
                return baseLayer;

            BufferedImage result = SubstanceCoreUtilities.getBlankImage(baseLayer.getIconWidth(),
                    baseLayer.getIconHeight());
            Graphics2D g2d = result.createGraphics();
            baseLayer.paintIcon(slider, g2d, 0, 0);
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                    .entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == currState)
                    continue;

                float contribution = activeEntry.getValue().getContribution();
                if (contribution == 0.0f)
                    continue;

                SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(slider, activeState);
                SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, activeState);

                HashMapKey key = SubstanceCoreUtilities.getHashKey(this.size, width,
                        fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                        fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                        this.isMirrorred);

                SubstanceIconUIResource layer = SliderHorizontalIcon.icons.get(key);
                if (layer == null) {
                    layer = getSingleLayer(slider, width, fillPainter, borderPainter, fillScheme,
                            borderScheme);
                    SliderHorizontalIcon.icons.put(key, layer);
                }

                g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));
                layer.paintIcon(slider, g2d, 0, 0);
            }

            g2d.dispose();
            return new SubstanceIconUIResource(result);
        }

        private SubstanceIconUIResource getSingleLayer(JSlider slider, float width,
                SubstanceFillPainter fillPainter, SubstanceBorderPainter borderPainter,
                SubstanceColorScheme fillScheme, SubstanceColorScheme borderScheme) {
            float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;
            Shape contour = SubstanceOutlineUtilities.getTriangleButtonOutline(width, this.size - 1,
                    2, borderDelta);

            BufferedImage stateImage = SubstanceCoreUtilities.getBlankImage(this.size, this.size);
            Graphics2D g2d = stateImage.createGraphics();
            g2d.translate((this.size - width) / 2.0f, 0);

            fillPainter.paintContourBackground(g2d, slider, width, this.size, contour, false,
                    fillScheme, true);

            float borderThickness = SubstanceSizeUtils.getBorderStrokeWidth();
            GeneralPath contourInner = SubstanceOutlineUtilities.getTriangleButtonOutline(width,
                    this.size - 1, 2, borderThickness + borderDelta);

            borderPainter.paintBorder(g2d, slider, width, this.size, contour, contourInner,
                    borderScheme);
            g2d.dispose();

            if (this.isMirrorred)
                stateImage = SubstanceImageCreator.getRotated(stateImage, 2, false);

            return new SubstanceIconUIResource(stateImage);
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         */
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

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#getIconWidth()
         */
        public int getIconWidth() {
            return this.size;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#getIconHeight()
         */
        public int getIconHeight() {
            return this.size;
        }
    }

    /**
     * Round icon for sliders in {@link SubstanceSliderUI}.
     * 
     * @author Kirill Grouchnikov
     */
    private static class SliderRoundIcon implements Icon, UIResource {
        /**
         * Icon hash.
         */
        private static LazyResettableHashMap<SubstanceIconUIResource> icons = new LazyResettableHashMap<SubstanceIconUIResource>(
                "SubstanceIconFactory.SliderRoundIcon");

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
         * @param state
         *            Slider state.
         * @param prevState
         *            The previous slider state.
         * @param slider
         *            The slider itself.
         * @param sliderIcon
         *            The slider icon.
         * @return Icon that matches the specified state of the slider thumb.
         */
        private SubstanceIconUIResource getIcon(JSlider slider,
                StateTransitionTracker stateTransitionTracker) {
            StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                    .getModelStateInfo();
            Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                    .getStateContributionMap();
            ComponentState currState = stateTransitionTracker.getModelStateInfo()
                    .getCurrModelState();

            float activeStrength = stateTransitionTracker.getActiveStrength();
            float width = this.size * (2.0f + activeStrength) / 3.0f;

            SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(slider);
            SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(slider);

            SubstanceColorScheme baseFillScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(slider, currState);
            SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, currState);

            HashMapKey baseKey = SubstanceCoreUtilities.getHashKey(this.size, width,
                    baseFillScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
                    fillPainter.getDisplayName(), borderPainter.getDisplayName());

            SubstanceIconUIResource baseLayer = SliderRoundIcon.icons.get(baseKey);
            if (baseLayer == null) {
                baseLayer = getSingleLayer(slider, width, fillPainter, borderPainter,
                        baseFillScheme, baseBorderScheme);
                SliderRoundIcon.icons.put(baseKey, baseLayer);
            }

            if (currState.isDisabled() || (activeStates.size() == 1))
                return baseLayer;

            BufferedImage result = SubstanceCoreUtilities.getBlankImage(baseLayer.getIconWidth(),
                    baseLayer.getIconHeight());
            Graphics2D g2d = result.createGraphics();
            baseLayer.paintIcon(slider, g2d, 0, 0);

            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                    .entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == currState)
                    continue;

                float contribution = activeEntry.getValue().getContribution();
                if (contribution == 0.0f)
                    continue;

                SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(slider, activeState);
                SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, activeState);

                HashMapKey key = SubstanceCoreUtilities.getHashKey(this.size, width,
                        fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                        fillPainter.getDisplayName(), borderPainter.getDisplayName());

                SubstanceIconUIResource layer = SliderRoundIcon.icons.get(key);
                if (layer == null) {
                    layer = getSingleLayer(slider, width, fillPainter, borderPainter, fillScheme,
                            borderScheme);
                    SliderRoundIcon.icons.put(key, layer);
                }

                g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));
                layer.paintIcon(slider, g2d, 0, 0);
            }

            g2d.dispose();
            return new SubstanceIconUIResource(result);
        }

        private SubstanceIconUIResource getSingleLayer(JSlider slider, float width,
                SubstanceFillPainter fillPainter, SubstanceBorderPainter borderPainter,
                SubstanceColorScheme fillScheme, SubstanceColorScheme borderScheme) {
            float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;
            Shape contour = new Ellipse2D.Float(borderDelta, borderDelta,
                    width - 2 * borderDelta - 1, width - 2 * borderDelta - 1);

            BufferedImage stateImage = SubstanceCoreUtilities.getBlankImage(this.size, this.size);
            Graphics2D g2d = stateImage.createGraphics();

            float delta = (this.size - width) / 2.0f;
            g2d.translate(delta, delta);

            fillPainter.paintContourBackground(g2d, slider, width, this.size, contour, false,
                    fillScheme, true);

            float borderThickness = SubstanceSizeUtils.getBorderStrokeWidth();
            Shape contourInner = new Ellipse2D.Float(borderDelta + borderThickness,
                    borderDelta + borderThickness,
                    width - 2 * borderDelta - 2 * borderThickness - 1,
                    width - 2 * borderDelta - 2 * borderThickness - 1);

            borderPainter.paintBorder(g2d, slider, width, this.size, contour, contourInner,
                    borderScheme);

            return new SubstanceIconUIResource(stateImage);
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         */
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

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#getIconWidth()
         */
        public int getIconWidth() {
            return this.size;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#getIconHeight()
         */
        public int getIconHeight() {
            return this.size;
        }
    }

    /**
     * Icon for vertical slider in {@link SubstanceSliderUI}.
     * 
     * @author Kirill Grouchnikov
     */
    private static class SliderVerticalIcon implements Icon, UIResource {
        /**
         * Icon hash.
         */
        private static LazyResettableHashMap<SubstanceIconUIResource> icons = new LazyResettableHashMap<SubstanceIconUIResource>(
                "SubstanceIconFactory.SliderVerticalIcon");

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
         * @param state
         *            Slider state.
         * @param prevState
         *            The previous slider state.
         * @param slider
         *            The slider itself.
         * @param sliderIcon
         *            The slider icon.
         * @return Icon that matches the specified state of the slider thumb.
         */
        private SubstanceIconUIResource getIcon(JSlider slider,
                StateTransitionTracker stateTransitionTracker) {
            StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                    .getModelStateInfo();
            Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                    .getStateContributionMap();
            ComponentState currState = stateTransitionTracker.getModelStateInfo()
                    .getCurrModelState();

            float activeStrength = stateTransitionTracker.getActiveStrength();
            int height = (int) (this.size * (2.0 + activeStrength) / 3.0);
            height = Math.min(height, this.size - 2);
            int delta = (this.size - height) / 2 - 1;

            SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(slider);
            SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(slider);

            SubstanceColorScheme baseFillScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(slider, currState);
            SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, currState);

            HashMapKey baseKey = SubstanceCoreUtilities.getHashKey(this.size, height,
                    slider.getComponentOrientation(), baseFillScheme.getDisplayName(),
                    baseBorderScheme.getDisplayName(), fillPainter.getDisplayName(),
                    borderPainter.getDisplayName(), this.isMirrorred);

            SubstanceIconUIResource baseLayer = SliderVerticalIcon.icons.get(baseKey);
            if (baseLayer == null) {
                baseLayer = getSingleLayer(slider, height, delta, fillPainter, borderPainter,
                        baseFillScheme, baseBorderScheme);
                SliderVerticalIcon.icons.put(baseKey, baseLayer);
            }

            if (currState.isDisabled() || (activeStates.size() == 1))
                return baseLayer;

            BufferedImage result = SubstanceCoreUtilities.getBlankImage(baseLayer.getIconWidth(),
                    baseLayer.getIconHeight());
            Graphics2D g2d = result.createGraphics();
            baseLayer.paintIcon(slider, g2d, 0, 0);

            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                    .entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == currState)
                    continue;

                float contribution = activeEntry.getValue().getContribution();
                if (contribution == 0.0f)
                    continue;

                SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(slider, activeState);
                SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(slider, ColorSchemeAssociationKind.BORDER, activeState);

                HashMapKey key = SubstanceCoreUtilities.getHashKey(this.size, height,
                        slider.getComponentOrientation(), fillScheme.getDisplayName(),
                        borderScheme.getDisplayName(), fillPainter.getDisplayName(),
                        borderPainter.getDisplayName(), this.isMirrorred);

                SubstanceIconUIResource layer = SliderVerticalIcon.icons.get(key);
                if (layer == null) {
                    layer = getSingleLayer(slider, height, delta, fillPainter, borderPainter,
                            fillScheme, borderScheme);
                    SliderVerticalIcon.icons.put(key, layer);
                }

                g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));
                layer.paintIcon(slider, g2d, 0, 0);
            }

            g2d.dispose();
            return new SubstanceIconUIResource(result);
        }

        private SubstanceIconUIResource getSingleLayer(JSlider slider, int height, int delta,
                SubstanceFillPainter fillPainter, SubstanceBorderPainter borderPainter,
                SubstanceColorScheme fillScheme, SubstanceColorScheme borderScheme) {
            float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;
            Shape contour = SubstanceOutlineUtilities.getTriangleButtonOutline(height,
                    this.size - 1, 2, borderDelta);

            BufferedImage stateImage = SubstanceCoreUtilities.getBlankImage(this.size - 1,
                    this.size - 1);
            Graphics2D g2d = stateImage.createGraphics();
            g2d.translate(delta, 0);

            fillPainter.paintContourBackground(g2d, slider, height, this.size, contour, false,
                    fillScheme, true);

            float borderThickness = SubstanceSizeUtils.getBorderStrokeWidth();
            GeneralPath contourInner = SubstanceOutlineUtilities.getTriangleButtonOutline(height,
                    this.size - 1, 2, borderThickness + borderDelta);

            borderPainter.paintBorder(g2d, slider, height, this.size - 1, contour, contourInner,
                    borderScheme);

            if (this.isMirrorred)
                stateImage = SubstanceImageCreator.getRotated(stateImage, 1, false);
            else
                stateImage = SubstanceImageCreator.getRotated(stateImage, 3, false);

            if (!slider.getComponentOrientation().isLeftToRight()) {
                stateImage = SubstanceImageCreator.getRotated(stateImage, 2, false);
            }

            return new SubstanceIconUIResource(stateImage);
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         */
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

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#getIconWidth()
         */
        public int getIconWidth() {
            return this.size - 1;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#getIconHeight()
         */
        public int getIconHeight() {
            return this.size - 1;
        }
    }

    /**
     * Collapse / expand icons for JTrees in {@link SubstanceTreeUI}.
     * 
     * @author Kirill Grouchnikov
     */
    private static class TreeIcon implements Icon, UIResource, IsHiDpiAware {
        /**
         * Icon hash.
         */
        private static LazyResettableHashMap<SubstanceIconUIResource> icons = new LazyResettableHashMap<SubstanceIconUIResource>(
                "SubstanceIconFactory.TreeIcon");

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
        public boolean isHiDpiAware() {
            return true;
        }

        /**
         * Retrieves icon that matches the specified state of the slider thumb.
         * 
         * @param state
         *            Slider state.
         * @param prevState
         *            The previous slider state.
         * @param slider
         *            The slider itself.
         * @param sliderIcon
         *            The slider icon.
         * @return Icon that matches the specified state of the slider thumb.
         */
        private static SubstanceIconUIResource getIcon(JTree tree, boolean isCollapsed) {
            ComponentState state = ((tree == null) || tree.isEnabled()) ? ComponentState.ENABLED
                    : ComponentState.DISABLED_UNSELECTED;
            SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities.getColorScheme(tree,
                    state);
            SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities.getColorScheme(tree,
                    ColorSchemeAssociationKind.BORDER, state);
            SubstanceColorScheme markScheme = SubstanceColorSchemeUtilities.getColorScheme(tree,
                    ColorSchemeAssociationKind.MARK, state);

            int fontSize = SubstanceSizeUtils.getComponentFontSize(tree);

            HashMapKey key = SubstanceCoreUtilities.getHashKey(fontSize,
                    fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                    markScheme.getDisplayName(), isCollapsed);

            SubstanceIconUIResource result = TreeIcon.icons.get(key);
            if (result != null)
                return result;

            result = new SubstanceIconUIResource(SubstanceImageCreator.getTreeIcon(tree, fillScheme,
                    borderScheme, markScheme, isCollapsed));
            TreeIcon.icons.put(key, result);

            return result;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
         */
        public void paintIcon(Component c, Graphics g, int x, int y) {
            if (!(g instanceof Graphics2D)) {
                return;
            }

            // The following check is here because some applications
            // (like JIDE's ExpandablePanel) may decide to use the
            // "Tree.collapsedIcon" and "Tree.expandedIcon" UIManager
            // entries to paint on non-JTree components. Sigh.
            JTree tree = (c instanceof JTree) ? (JTree) c : null;
            SubstanceIconUIResource iconToDraw = TreeIcon.getIcon(tree, this.isCollapsed);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.translate(x, y);
            iconToDraw.paintIcon(c, g2d, 0, 0);
            g2d.dispose();
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#getIconWidth()
         */
        public int getIconWidth() {
            return this.size;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.Icon#getIconHeight()
         */
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
        RESTORE;
    }

    /**
     * Cache of title pane icons.
     */
    private static final Map<IconKind, LazyResettableHashMap<SubstanceIconUIResource>> titlePaneIcons = SubstanceIconFactory
            .createTitlePaneIcons();

    /**
     * Creates an empty map of title pane icons.
     * 
     * @return Empty map of title pane icons.
     */
    private static Map<IconKind, LazyResettableHashMap<SubstanceIconUIResource>> createTitlePaneIcons() {
        Map<IconKind, LazyResettableHashMap<SubstanceIconUIResource>> result = new HashMap<IconKind, LazyResettableHashMap<SubstanceIconUIResource>>();

        result.put(IconKind.CLOSE,
                new LazyResettableHashMap<SubstanceIconUIResource>("Close title pane icons"));
        result.put(IconKind.MINIMIZE,
                new LazyResettableHashMap<SubstanceIconUIResource>("Minimize title pane icons"));
        result.put(IconKind.MAXIMIZE,
                new LazyResettableHashMap<SubstanceIconUIResource>("Maximize title pane icons"));
        result.put(IconKind.RESTORE,
                new LazyResettableHashMap<SubstanceIconUIResource>("Restore title pane icons"));
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
    public static SubstanceIconUIResource getTitlePaneIcon(IconKind iconKind,
            SubstanceColorScheme scheme, SubstanceColorScheme backgroundScheme) {

        LazyResettableHashMap<SubstanceIconUIResource> kindMap = SubstanceIconFactory.titlePaneIcons
                .get(iconKind);
        HashMapKey key = SubstanceCoreUtilities.getHashKey(scheme.getDisplayName(),
                backgroundScheme.getDisplayName());
        SubstanceIconUIResource result = kindMap.get(key);
        if (result != null)
            return result;

        switch (iconKind) {
            case CLOSE:
                result = SubstanceImageCreator.getCloseIcon(scheme, backgroundScheme);
                break;
            case MINIMIZE:
                result = SubstanceImageCreator.getMinimizeIcon(scheme, backgroundScheme);
                break;
            case MAXIMIZE:
                result = SubstanceImageCreator.getMaximizeIcon(scheme, backgroundScheme);
                break;
            case RESTORE:
                result = SubstanceImageCreator.getRestoreIcon(scheme, backgroundScheme);
                break;
        }
        kindMap.put(key, result);
        return result;
    }

}