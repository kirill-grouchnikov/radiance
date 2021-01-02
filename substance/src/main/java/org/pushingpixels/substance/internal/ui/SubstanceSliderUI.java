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
package org.pushingpixels.substance.internal.ui;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.SeparatorPainterUtils;
import org.pushingpixels.substance.internal.utils.*;
import org.pushingpixels.substance.internal.utils.icon.SubstanceIconFactory;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Map;

/**
 * UI for sliders in <b>Substance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceSliderUI extends BasicSliderUI implements TransitionAwareUI {
    /**
     * Surrogate button model for tracking the thumb transitions.
     */
    private ButtonModel thumbModel;

    /**
     * Listener for transition animations.
     */
    private RolloverControlListener substanceRolloverListener;

    /**
     * Listener on property change events.
     */
    private PropertyChangeListener substancePropertyChangeListener;

    private StateTransitionTracker stateTransitionTracker;

    /**
     * Icon for horizontal sliders.
     */
    private Icon horizontalIcon;

    /**
     * Icon for sliders without labels and ticks.
     */
    private Icon roundIcon;

    /**
     * Icon for vertical sliders.
     */
    private Icon verticalIcon;

    /**
     * Cache of track images.
     */
    private static final LazyResettableHashMap<BufferedImage> trackCache = new LazyResettableHashMap<>(
            "SubstanceSliderUI.track");

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceSliderUI((JSlider) comp);
    }

    /**
     * Simple constructor.
     *
     * @param slider Slider.
     */
    protected SubstanceSliderUI(JSlider slider) {
        super(null);
        this.thumbModel = new DefaultButtonModel();
        this.thumbModel.setArmed(false);
        this.thumbModel.setSelected(false);
        this.thumbModel.setPressed(false);
        this.thumbModel.setRollover(false);
        this.thumbModel.setEnabled(slider.isEnabled());

        this.stateTransitionTracker = new StateTransitionTracker(slider, this.thumbModel);
    }

    @Override
    protected void calculateTrackRect() {
        super.calculateTrackRect();
        if (this.slider.getOrientation() == SwingConstants.VERTICAL) {
            if (this.slider.getComponentOrientation().isLeftToRight()) {
                this.trackRect.x += 2;
            } else {
                this.trackRect.x -= 2;
            }
        }
    }

    /**
     * Returns the rectangle of track for painting.
     *
     * @return The rectangle of track for painting.
     */
    private Rectangle getPaintTrackRect() {
        int trackLeft = 0, trackRight = 0, trackTop = 0, trackBottom = 0;
        int trackWidth = this.getTrackWidth();
        if (this.slider.getOrientation() == SwingConstants.HORIZONTAL) {
            trackRight = this.trackRect.width;
            int thumbOffset = 0;
            if (this.slider.getPaintLabels() || this.slider.getPaintTicks()) {
                trackTop = this.insetCache.top + 2 * this.focusInsets.top;
				thumbOffset = (this.getIcon().getIconHeight() - (trackWidth - 1)) / 2;
            } else {
                // vertically center the track
                int topInset = this.insetCache.top + this.focusInsets.top;
                int bottomInset = this.insetCache.bottom + this.focusInsets.bottom;
                trackTop = topInset + (this.slider.getHeight() - topInset - bottomInset) / 2
                        - trackWidth / 2;
            }
            trackBottom = trackTop + trackWidth - 1;
            return new Rectangle(this.trackRect.x + trackLeft, trackTop + thumbOffset, trackRight - trackLeft,
                    trackBottom - trackTop);
        } else {
			int thumbOffset = 0;
            if (this.slider.getPaintLabels() || this.slider.getPaintTicks()) {
                if (this.slider.getComponentOrientation().isLeftToRight()) {
                    trackLeft = trackRect.x + this.insetCache.left + this.focusInsets.left;
                    trackRight = trackLeft + trackWidth - 1;
					thumbOffset = (this.getIcon().getIconWidth() - (trackWidth - 1)) / 2;
                } else {
                    trackRight = trackRect.x + trackRect.width - this.insetCache.right
                            - this.focusInsets.right;
                    trackLeft = trackRight - trackWidth - 1;
					thumbOffset = -(this.getIcon().getIconWidth() - (trackWidth - 1)) / 2;
                }
            } else {
                // horizontally center the track
                int leftInset = this.insetCache.left + this.focusInsets.left;
                int rightInset = this.insetCache.right + this.focusInsets.right;
                trackLeft = leftInset + (this.slider.getWidth() - leftInset - rightInset) / 2
                        - trackWidth / 2;
                trackRight = trackLeft + trackWidth - 1;
            }
            trackBottom = this.trackRect.height - 1;
            return new Rectangle(trackLeft + thumbOffset, this.trackRect.y + trackTop, trackRight - trackLeft,
                    trackBottom - trackTop);
        }
    }

    @Override
    public void paintTrack(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();

        boolean drawInverted = this.drawInverted();

        Rectangle paintRect = this.getPaintTrackRect();

        // Width and height of the painting rectangle.
        int width = paintRect.width;
        int height = paintRect.height;

        if (this.slider.getOrientation() == JSlider.VERTICAL) {
            // apply rotation / translate transformation on vertical
            // slider tracks
            int temp = width;
            width = height;
            height = temp;
            AffineTransform at = graphics.getTransform();
            at.translate(paintRect.x, width + paintRect.y);
            at.rotate(-Math.PI / 2);
            graphics.setTransform(at);
        } else {
            graphics.translate(paintRect.x, paintRect.y);
        }

        StateTransitionTracker.ModelStateInfo modelStateInfo = this.stateTransitionTracker
                .getModelStateInfo();

        SubstanceColorScheme trackSchemeUnselected = SubstanceColorSchemeUtilities
                .getColorScheme(this.slider, this.slider.isEnabled() ? ComponentState.ENABLED
                        : ComponentState.DISABLED_UNSELECTED);
        SubstanceColorScheme trackBorderSchemeUnselected = SubstanceColorSchemeUtilities
                .getColorScheme(this.slider, ColorSchemeAssociationKind.BORDER,
                        this.slider.isEnabled() ? ComponentState.ENABLED
                                : ComponentState.DISABLED_UNSELECTED);
        this.paintSliderTrack(graphics, drawInverted, trackSchemeUnselected,
                trackBorderSchemeUnselected, width, height);

        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                .entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            if (!activeState.isActive())
                continue;

            float contribution = activeEntry.getValue().getContribution();
            if (contribution == 0.0f)
                continue;

            graphics.setComposite(
                    WidgetUtilities.getAlphaComposite(this.slider, contribution, g));

            SubstanceColorScheme activeFillScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(this.slider, activeState);
            SubstanceColorScheme activeBorderScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(this.slider, ColorSchemeAssociationKind.BORDER, activeState);
            this.paintSliderTrackSelected(graphics, drawInverted, paintRect, activeFillScheme,
                    activeBorderScheme, width, height);
        }

        graphics.dispose();
    }

    /**
     * Paints the slider track.
     *
     * @param graphics        Graphics.
     * @param drawInverted    Indicates whether the value-range shown for the slider is
     *                        reversed.
     * @param fillColorScheme Fill color scheme.
     * @param borderScheme    Border color scheme.
     * @param width           Track width.
     * @param height          Track height.
     */
    private void paintSliderTrack(Graphics2D graphics, boolean drawInverted,
            SubstanceColorScheme fillColorScheme, SubstanceColorScheme borderScheme, int width,
            int height) {
        Graphics2D g2d = (Graphics2D) graphics.create();

        SubstanceFillPainter fillPainter = ClassicFillPainter.INSTANCE;
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(this.slider);

        int componentFontSize = SubstanceSizeUtils.getComponentFontSize(this.slider);
        float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;
        float radius = SubstanceSizeUtils.getClassicButtonCornerRadius(componentFontSize) / 2.0f;
        float borderThickness = (int) SubstanceSizeUtils.getBorderStrokeWidth();

        HashMapKey key = SubstanceCoreUtilities.getHashKey(width, height, radius, borderDelta,
                borderThickness, fillColorScheme.getDisplayName(), borderScheme.getDisplayName());

        BufferedImage trackImage = trackCache.get(key);
        if (trackImage == null) {
            trackImage = SubstanceCoreUtilities.getBlankImage(width + 1, height + 1);
            Graphics2D cacheGraphics = trackImage.createGraphics();

            Shape contour = SubstanceOutlineUtilities.getBaseOutline(width + 1, height + 1, radius,
                    null, borderDelta);

            fillPainter.paintContourBackground(cacheGraphics, slider, width, height, contour, false,
                    fillColorScheme, false);

            Shape contourInner = SubstanceOutlineUtilities.getBaseOutline(width + 1,
                    height + 1, radius - borderThickness, null, borderThickness + borderDelta);
            borderPainter.paintBorder(cacheGraphics, slider, width + 1, height + 1, contour,
                    contourInner, borderScheme);

            trackCache.put(key, trackImage);
            cacheGraphics.dispose();
        }

        NeonCortex.drawImage(graphics, trackImage, 0, 0);

        g2d.dispose();
    }

    /**
     * Paints the selected part of the slider track.
     *
     * @param graphics     Graphics.
     * @param drawInverted Indicates whether the value-range shown for the slider is
     *                     reversed.
     * @param paintRect    Selected portion.
     * @param fillScheme   Fill color scheme.
     * @param borderScheme Border color scheme.
     * @param width        Track width.
     * @param height       Track height.
     */
    private void paintSliderTrackSelected(Graphics2D graphics, boolean drawInverted,
            Rectangle paintRect, SubstanceColorScheme fillScheme, SubstanceColorScheme borderScheme,
            int width, int height) {

        Graphics2D g2d = (Graphics2D) graphics.create();
        Insets insets = this.slider.getInsets();
        insets.top /= 2;
        insets.left /= 2;
        insets.bottom /= 2;
        insets.right /= 2;

        SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(this.slider);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(this.slider);
        float radius = SubstanceSizeUtils.getClassicButtonCornerRadius(
                SubstanceSizeUtils.getComponentFontSize(slider)) / 2.0f;
        float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;

        // fill selected portion
        if (this.slider.isEnabled()) {
            if (this.slider.getOrientation() == SwingConstants.HORIZONTAL) {
                int middleOfThumb = this.thumbRect.x + (this.thumbRect.width / 2) - paintRect.x;
                int fillMinX;
                int fillMaxX;

                if (drawInverted) {
                    fillMinX = middleOfThumb;
                    fillMaxX = width;
                } else {
                    fillMinX = 0;
                    fillMaxX = middleOfThumb;
                }

                int fillWidth = fillMaxX - fillMinX;
                int fillHeight = height + 1;
                if ((fillWidth > 0) && (fillHeight > 0)) {
                    Shape contour = SubstanceOutlineUtilities.getBaseOutline(fillWidth, fillHeight,
                            radius, null, borderDelta);
                    g2d.translate(fillMinX, 0);
                    fillPainter.paintContourBackground(g2d, this.slider, fillWidth, fillHeight,
                            contour, false, fillScheme, false);
                    borderPainter.paintBorder(g2d, this.slider, fillWidth, fillHeight, contour,
                            null, borderScheme);
                }
            } else {
                int middleOfThumb = this.thumbRect.y + (this.thumbRect.height / 2) - paintRect.y;
                int fillMin;
                int fillMax;

                if (this.drawInverted()) {
                    fillMin = 0;
                    fillMax = middleOfThumb;
                    // fix for issue 368 - inverted vertical sliders
                    g2d.translate(width + 2 - middleOfThumb, 0);
                } else {
                    fillMin = middleOfThumb;
                    fillMax = width + 1;
                }

                int fillWidth = fillMax - fillMin;
                int fillHeight = height + 1;
                if ((fillWidth > 0) && (fillHeight > 0)) {
                    Shape contour = SubstanceOutlineUtilities.getBaseOutline(fillWidth, fillHeight,
                            radius, null, borderDelta);

                    fillPainter.paintContourBackground(g2d, this.slider, fillWidth, fillHeight,
                            contour, false, fillScheme, false);
                    borderPainter.paintBorder(g2d, this.slider, fillWidth, fillHeight, contour,
                            null, borderScheme);
                }
            }
        }
        g2d.dispose();
    }

    @Override
    protected Dimension getThumbSize() {
        Icon thumbIcon = this.getIcon();
        return new Dimension(thumbIcon.getIconWidth(), thumbIcon.getIconHeight());
    }

    /**
     * Returns the thumb icon for the associated slider.
     *
     * @return The thumb icon for the associated slider.
     */
    protected Icon getIcon() {
        if (this.slider.getOrientation() == JSlider.HORIZONTAL) {
            if (this.slider.getPaintTicks() || this.slider.getPaintLabels())
                return this.horizontalIcon;
            else
                return this.roundIcon;
        } else {
            if (this.slider.getPaintTicks() || this.slider.getPaintLabels())
                return this.verticalIcon;
            else
                return this.roundIcon;
        }
    }

    @Override
    public void paintThumb(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();
        Rectangle knobBounds = this.thumbRect;

        graphics.translate(knobBounds.x, knobBounds.y);

        Icon icon = this.getIcon();
        if (this.slider.getOrientation() == JSlider.HORIZONTAL) {
            if (icon != null) {
                graphics.translate(-2, 0);
                icon.paintIcon(this.slider, graphics, 0, 0);
            }
        } else {
            if (this.slider.getComponentOrientation().isLeftToRight()) {
                if (icon != null) {
                    graphics.translate(1, -1);
                    icon.paintIcon(this.slider, graphics, 0, 0);
                }
            } else {
                if (icon != null) {
                    graphics.translate(1, 1);
                    icon.paintIcon(this.slider, graphics, 0, 0);
                }
            }
        }

        graphics.dispose();
    }

    @Override
    public void paint(Graphics g, final JComponent c) {
        Graphics2D graphics = (Graphics2D) g.create();

        ComponentState currState = ComponentState.getState(this.thumbModel, this.slider);
        float alpha = SubstanceColorSchemeUtilities.getAlpha(this.slider, currState);

        BackgroundPaintingUtils.updateIfOpaque(graphics, c);

        recalculateIfInsetsChanged();
        recalculateIfOrientationChanged();
        final Rectangle clip = graphics.getClipBounds();

        if (!clip.intersects(trackRect) && slider.getPaintTrack())
            calculateGeometry();

        graphics.setComposite(WidgetUtilities.getAlphaComposite(this.slider, alpha, g));
        if (slider.getPaintTrack() && clip.intersects(trackRect)) {
            paintTrack(graphics);
        }
        if (slider.getPaintTicks() && clip.intersects(tickRect)) {
            paintTicks(graphics);
        }
        paintFocus(graphics);
        if (clip.intersects(thumbRect)) {
            paintThumb(graphics);
        }
        graphics.setComposite(WidgetUtilities.getAlphaComposite(this.slider, 1.0f, g));
        if (slider.getPaintLabels() && clip.intersects(labelRect)) {
            paintLabels(graphics);
        }

        graphics.dispose();
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.stateTransitionTracker;
    }

    @Override
    public boolean isInside(MouseEvent me) {
        Rectangle thumbB = this.thumbRect;
        if (thumbB == null)
            return false;
        return thumbB.contains(me.getX(), me.getY());
    }

    @Override
    protected void installDefaults(JSlider slider) {
        super.installDefaults(slider);
        Font f = slider.getFont();
        if (f == null || f instanceof UIResource) {
            slider.setFont(new FontUIResource(SubstanceCortex.GlobalScope.getFontPolicy()
                    .getFontSet().getControlFont()));
        }
        int size = SubstanceSizeUtils
                .getSliderIconSize(SubstanceSizeUtils.getComponentFontSize(slider));
        // System.out.println("Slider size : " + size);
        this.horizontalIcon = SubstanceIconFactory.getSliderHorizontalIcon(size, false);
        this.roundIcon = SubstanceIconFactory.getSliderRoundIcon(size);
        this.verticalIcon = SubstanceIconFactory.getSliderVerticalIcon(size, false);

        int focusIns = (int) Math.ceil(2.0 * SubstanceSizeUtils.getFocusStrokeWidth());
        this.focusInsets = new Insets(focusIns, focusIns, focusIns, focusIns);
    }

    @Override
    protected void installListeners(final JSlider slider) {
        super.installListeners(slider);

        // fix for defect 109 - memory leak on changing skin
        this.substanceRolloverListener = new RolloverControlListener(this, this.thumbModel);
        slider.addMouseListener(this.substanceRolloverListener);
        slider.addMouseMotionListener(this.substanceRolloverListener);

        this.substancePropertyChangeListener = propertyChangeEvent -> {
            if ("enabled".equals(propertyChangeEvent.getPropertyName())) {
                SubstanceSliderUI.this.thumbModel.setEnabled(slider.isEnabled());
            }
            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(slider::updateUI);
            }
        };
        this.slider.addPropertyChangeListener(this.substancePropertyChangeListener);

        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();
    }

    @Override
    protected void uninstallListeners(JSlider slider) {
        super.uninstallListeners(slider);

        // fix for defect 109 - memory leak on changing skin
        slider.removeMouseListener(this.substanceRolloverListener);
        slider.removeMouseMotionListener(this.substanceRolloverListener);
        this.substanceRolloverListener = null;

        slider.removePropertyChangeListener(this.substancePropertyChangeListener);
        this.substancePropertyChangeListener = null;

        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();
    }

    @Override
    public void paintFocus(Graphics g) {
        SubstanceCoreUtilities.paintFocus(g, this.slider, this.slider, this, null, null, 1.0f,
                SubstanceSizeUtils.getFocusStrokeWidth());
    }

    /**
     * Returns the shorter dimension of the track.
     *
     * @return Shorter dimension of the track.
     */
    protected int getTrackWidth() {
        return SubstanceSizeUtils
                .getSliderTrackSize(SubstanceSizeUtils.getComponentFontSize(this.slider));
    }

    @Override
    protected int getTickLength() {
        return SubstanceSizeUtils
                .getSliderTickSize(SubstanceSizeUtils.getComponentFontSize(this.slider));
    }

    @Override
    public void paintTicks(Graphics g) {
        Rectangle tickBounds = this.tickRect;
        SubstanceColorScheme tickScheme = SubstanceColorSchemeUtilities.getColorScheme(this.slider,
                ColorSchemeAssociationKind.SEPARATOR,
                this.slider.isEnabled() ? ComponentState.ENABLED
                        : ComponentState.DISABLED_UNSELECTED);
        if (this.slider.getOrientation() == JSlider.HORIZONTAL) {
            long value = this.slider.getMinimum() + this.slider.getMinorTickSpacing();

            if ((this.slider.getMinorTickSpacing() > 0)
                    && (this.slider.getMajorTickSpacing() > 0)) {
                // collect x's of the minor ticks
                java.util.List<Integer> minorXs = new ArrayList<>();
                while (value < this.slider.getMaximum()) {
                    long delta = value - this.slider.getMinimum();
                    if (delta % this.slider.getMajorTickSpacing() != 0) {
                        int xPos = this.xPositionForValue((int) value);
                        minorXs.add(xPos - 1);
                    }
                    value += this.slider.getMinorTickSpacing();
                }
                // and paint them in one call
                SeparatorPainterUtils.paintVerticalLines(g, this.slider, tickScheme, tickBounds.y,
                        minorXs, tickBounds.height / 2, 0.75f);
            }

            if (this.slider.getMajorTickSpacing() > 0) {
                // collect x's of the major ticks
                java.util.List<Integer> majorXs = new ArrayList<>();
                value = this.slider.getMinimum() + this.slider.getMajorTickSpacing();
                while (value < this.slider.getMaximum()) {
                    int xPos = this.xPositionForValue((int) value);
                    majorXs.add(xPos - 1);
                    value += this.slider.getMajorTickSpacing();
                }
                // and paint them in one call
                SeparatorPainterUtils.paintVerticalLines(g, this.slider, tickScheme, tickBounds.y,
                        majorXs, tickBounds.height, 0.75f);
            }
        } else {
            g.translate(tickBounds.x, 0);

            long value = this.slider.getMinimum() + this.slider.getMinorTickSpacing();

            boolean ltr = this.slider.getComponentOrientation().isLeftToRight();
            if (this.slider.getMinorTickSpacing() > 0) {
                // collect y's of the minor ticks
                java.util.List<Integer> minorYs = new ArrayList<>();
                int offset = 0;
                if (!ltr) {
                    offset = tickBounds.width - tickBounds.width / 2;
                }

                while (value < this.slider.getMaximum()) {
                    int yPos = this.yPositionForValue((int) value);
                    minorYs.add(yPos);
                    value += this.slider.getMinorTickSpacing();
                }

                // and paint them in one call
                SeparatorPainterUtils.paintHorizontalLines(g, this.slider, tickScheme, offset,
                        minorYs, tickBounds.width / 2, ltr ? 0.75f : 0.25f, ltr);
            }

            if (this.slider.getMajorTickSpacing() > 0) {
                // collect y's of the major ticks
                java.util.List<Integer> majorYs = new ArrayList<>();
                value = this.slider.getMinimum() + this.slider.getMajorTickSpacing();

                while (value < this.slider.getMaximum()) {
                    int yPos = this.yPositionForValue((int) value);
                    majorYs.add(yPos);
                    value += this.slider.getMajorTickSpacing();
                }

                // and paint them in one call
                SeparatorPainterUtils.paintHorizontalLines(g, this.slider, tickScheme, 0, majorYs,
                        tickBounds.width, ltr ? 0.75f : 0.25f, ltr);
            }
            g.translate(-tickBounds.x, 0);
        }
    }

    @Override
    protected void calculateTickRect() {
        if (this.slider.getOrientation() == JSlider.HORIZONTAL) {
            this.tickRect.x = this.trackRect.x;
            this.tickRect.y = this.trackRect.y + this.trackRect.height;
            this.tickRect.width = this.trackRect.width;
            this.tickRect.height = (this.slider.getPaintTicks()) ? this.getTickLength() : 0;
        } else {
            this.tickRect.width = (this.slider.getPaintTicks()) ? this.getTickLength() : 0;
            if (this.slider.getComponentOrientation().isLeftToRight()) {
                this.tickRect.x = this.trackRect.x + this.trackRect.width;
            } else {
                this.tickRect.x = this.trackRect.x - this.tickRect.width;
            }
            this.tickRect.y = this.trackRect.y;
            this.tickRect.height = this.trackRect.height;
        }

        if (this.slider.getPaintTicks()) {
            if (this.slider.getOrientation() == JSlider.HORIZONTAL) {
                this.tickRect.y -= 3;
            } else {
                if (this.slider.getComponentOrientation().isLeftToRight()) {
                    this.tickRect.x -= 2;
                } else {
                    this.tickRect.x += 2;
                }
            }
        }
    }

    @Override
    protected void calculateLabelRect() {
        super.calculateLabelRect();
        if ((this.slider.getOrientation() == JSlider.VERTICAL) && !this.slider.getPaintTicks()
                && this.slider.getComponentOrientation().isLeftToRight()) {
            this.labelRect.x += 3;
        }
        if (this.slider.getOrientation() == JSlider.VERTICAL) {
            this.labelRect.width = getHeightOfTallestLabel();
        }
    }

    @Override
    protected int getHeightOfTallestLabel() {
        int result = super.getHeightOfTallestLabel();
        return result;
    }

    @Override
    protected void calculateThumbLocation() {
        super.calculateThumbLocation();
        Rectangle trackRect = this.getPaintTrackRect();
        if (slider.getOrientation() == JSlider.HORIZONTAL) {
            int valuePosition = xPositionForValue(slider.getValue());

            double centerY = trackRect.y + trackRect.height / 2.0;
            thumbRect.y = (int) (centerY - thumbRect.height / 2.0) + 1;

            thumbRect.x = valuePosition - thumbRect.width / 2 + 1;
        } else {
            int valuePosition = yPositionForValue(slider.getValue());

            double centerX = trackRect.x + trackRect.width / 2.0;
            thumbRect.x = (int) (centerX - thumbRect.width / 2.0);

            thumbRect.y = valuePosition - (thumbRect.height / 2);
        }
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        this.recalculateIfInsetsChanged();
        Dimension d;
        if (this.slider.getOrientation() == JSlider.VERTICAL) {
            d = new Dimension(this.getPreferredVerticalSize());
            d.width = this.insetCache.left + this.insetCache.right;
            d.width += this.focusInsets.left + this.focusInsets.right;
            d.width += Math.max(this.trackRect.width, this.getIcon().getIconWidth());
            if (this.slider.getPaintTicks())
                d.width += getTickLength();
            if (this.slider.getPaintLabels())
                d.width += getWidthOfWidestLabel();
            d.width += 3;
        } else {
            d = new Dimension(this.getPreferredHorizontalSize());
            d.height = this.insetCache.top + this.insetCache.bottom;
            d.height += this.focusInsets.top + this.focusInsets.bottom;
            d.height += Math.max(this.trackRect.height, this.getIcon().getIconHeight());
            if (this.slider.getPaintTicks())
                d.height += getTickLength();
            if (this.slider.getPaintLabels())
                d.height += getHeightOfTallestLabel();
            d.height += 6;
        }

        return d;
    }

    @Override
    public void setThumbLocation(int x, int y) {
        super.setThumbLocation(x, y);
        this.slider.repaint();
    }

    @Override
    public Dimension getPreferredHorizontalSize() {
        return new Dimension(
                SubstanceSizeUtils.getAdjustedSize(
                        SubstanceSizeUtils.getComponentFontSize(this.slider), 200, 1, 20, false),
                21);
    }

    @Override
    public Dimension getPreferredVerticalSize() {
        return new Dimension(21, SubstanceSizeUtils.getAdjustedSize(
                SubstanceSizeUtils.getComponentFontSize(this.slider), 200, 1, 20, false));
    }
}
