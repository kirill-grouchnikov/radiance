/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.painter.SeparatorPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;
import org.pushingpixels.radiance.theming.internal.utils.icon.SliderHorizontalIcon;
import org.pushingpixels.radiance.theming.internal.utils.icon.SliderRoundIcon;
import org.pushingpixels.radiance.theming.internal.utils.icon.SliderVerticalIcon;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

/**
 * UI for sliders in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceSliderUI extends BasicSliderUI implements TransitionAwareUI {
    /**
     * Surrogate button model for tracking the thumb transitions.
     */
    private ButtonModel thumbModel;

    /**
     * Listener for transition animations.
     */
    private RolloverControlListener radianceRolloverListener;

    /**
     * Listener on property change events.
     */
    private PropertyChangeListener radiancePropertyChangeListener;

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

    private BladeColorScheme mutableFillColorScheme = new BladeColorScheme();
    private BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceSliderUI((JSlider) comp);
    }

    /**
     * Simple constructor.
     *
     * @param slider Slider.
     */
    protected RadianceSliderUI(JSlider slider) {
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
        boolean drawInverted = this.drawInverted();
        Rectangle paintRect = this.getPaintTrackRect();

        Graphics2D g2d = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(g2d, paintRect.x, paintRect.y,
                paintRect.width + 1, paintRect.height + 1,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    if (this.slider.getOrientation() == JSlider.VERTICAL) {
                        // apply rotation / translate transformation on vertical
                        // slider tracks
                        int temp = scaledWidth;
                        scaledWidth = scaledHeight;
                        scaledHeight = temp;
                        AffineTransform at = graphics1X.getTransform();
                        at.translate(x, scaledWidth + y);
                        at.rotate(-Math.PI / 2);
                        graphics1X.setTransform(at);
                    } else {
                        graphics1X.translate(x, y);
                    }

                    StateTransitionTracker.ModelStateInfo modelStateInfo = this.stateTransitionTracker
                            .getModelStateInfo();
                    ComponentState currState = modelStateInfo.getCurrModelState();

                    RadianceColorScheme trackSchemeUnselected = RadianceColorSchemeUtilities
                            .getColorScheme(this.slider, this.slider.isEnabled() ? ComponentState.ENABLED
                                    : ComponentState.DISABLED_UNSELECTED);
                    RadianceColorScheme trackBorderSchemeUnselected = RadianceColorSchemeUtilities
                            .getColorScheme(this.slider, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                                    this.slider.isEnabled() ? ComponentState.ENABLED
                                            : ComponentState.DISABLED_UNSELECTED);
                    this.paintSliderTrack1X(graphics1X, trackSchemeUnselected,
                            trackBorderSchemeUnselected, scaledWidth, scaledHeight, scaleFactor);

                    // Populate color schemes based on the current transition state of the slider.
                    BladeUtils.populateColorScheme(mutableFillColorScheme, this.slider,
                            modelStateInfo, currState,
                            RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                            false);
                    BladeUtils.populateColorScheme(mutableBorderColorScheme, this.slider,
                            modelStateInfo, currState,
                            RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                            false);
                    this.paintSliderTrackSelected1X(graphics1X, drawInverted, paintRect,
                            mutableFillColorScheme, mutableBorderColorScheme,
                            scaledWidth, scaledHeight, scaleFactor);
                });
        g2d.dispose();
    }

    private void paintSliderTrack1X(Graphics2D graphics1X,
            RadianceColorScheme fillColorScheme, RadianceColorScheme borderScheme,
            int width, int height, double scaleFactor) {
        RadianceFillPainter fillPainter = ClassicFillPainter.INSTANCE;
        RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(this.slider);

        int componentFontSize = RadianceSizeUtils.getComponentFontSize(this.slider);
        float radius = (float) scaleFactor *
                RadianceSizeUtils.getClassicButtonCornerRadius(componentFontSize) / 2.0f;

        Shape contour = RadianceOutlineUtilities.getBaseOutline(width, height,
                radius, null, 1.0f);

        fillPainter.paintContourBackground(graphics1X, slider, width, height,
                contour, fillColorScheme);

        Shape contourInner = RadianceOutlineUtilities.getBaseOutline(width, height,
                radius - 1.0f, null, 2.0f);
        borderPainter.paintBorder(graphics1X, slider, width, height,
                contour, contourInner, borderScheme);
    }

    /**
     * Paints the selected part of the slider track.
     *
     * @param graphics1X   Graphics.
     * @param drawInverted Indicates whether the value-range shown for the slider is
     *                     reversed.
     * @param paintRect    Selected portion.
     * @param fillScheme   Fill color scheme.
     * @param borderScheme Border color scheme.
     * @param width        Track width.
     * @param height       Track height.
     */
    private void paintSliderTrackSelected1X(Graphics2D graphics1X, boolean drawInverted,
            Rectangle paintRect, RadianceColorScheme fillScheme, RadianceColorScheme borderScheme,
            int width, int height, double scaleFactor) {

        Graphics2D g2d = (Graphics2D) graphics1X.create();
        Insets insets = this.slider.getInsets();
        insets.top /= 2;
        insets.left /= 2;
        insets.bottom /= 2;
        insets.right /= 2;

        RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(this.slider);
        RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(this.slider);
        float radius = (float) scaleFactor * RadianceSizeUtils.getClassicButtonCornerRadius(
                RadianceSizeUtils.getComponentFontSize(slider)) / 2.0f;

        // fill selected portion
        if (this.slider.isEnabled()) {
            if (this.slider.getOrientation() == SwingConstants.HORIZONTAL) {
                int middleOfThumb = (int) (scaleFactor * (this.thumbRect.x + (this.thumbRect.width / 2) - paintRect.x));
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
                int fillHeight = height;
                if ((fillWidth > 0) && (fillHeight > 0)) {
                    Shape contour = RadianceOutlineUtilities.getBaseOutline(fillWidth, fillHeight,
                            radius, null, 1.0f);
                    g2d.translate(fillMinX, 0);
                    fillPainter.paintContourBackground(g2d, this.slider, fillWidth, fillHeight,
                            contour, fillScheme);
                    borderPainter.paintBorder(g2d, this.slider, fillWidth, fillHeight, contour,
                            null, borderScheme);
                }
            } else {
                int middleOfThumb = (int) (scaleFactor * (this.thumbRect.y + (this.thumbRect.height / 2) - paintRect.y));
                int fillMin;
                int fillMax;

                if (this.drawInverted()) {
                    fillMin = 0;
                    fillMax = middleOfThumb;
                    // fix for issue 368 - inverted vertical sliders
                    g2d.translate(width + 2 - middleOfThumb, 0);
                } else {
                    fillMin = middleOfThumb;
                    fillMax = width;
                }

                int fillWidth = fillMax - fillMin;
                int fillHeight = height;
                if ((fillWidth > 0) && (fillHeight > 0)) {
                    Shape contour = RadianceOutlineUtilities.getBaseOutline(fillWidth, fillHeight,
                            radius, null, 1.0f);

                    fillPainter.paintContourBackground(g2d, this.slider, fillWidth, fillHeight,
                            contour, fillScheme);
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
        float alpha = RadianceColorSchemeUtilities.getAlpha(this.slider, currState);

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
            slider.setFont(new FontUIResource(RadianceThemingCortex.GlobalScope.getFontPolicy()
                    .getFontSet().getControlFont()));
        }
        int size = RadianceSizeUtils.getSliderIconSize(
                RadianceSizeUtils.getComponentFontSize(slider));
        this.horizontalIcon = new SliderHorizontalIcon(slider, size);
        this.roundIcon = new SliderRoundIcon(slider, size);
        this.verticalIcon = new SliderVerticalIcon(slider, size);

        int focusIns = (int) Math.ceil(2.0 * RadianceSizeUtils.getFocusStrokeWidth(slider));
        this.focusInsets = new Insets(focusIns, focusIns, focusIns, focusIns);
    }

    @Override
    protected void installListeners(final JSlider slider) {
        super.installListeners(slider);

        // fix for defect 109 - memory leak on changing skin
        this.radianceRolloverListener = new RolloverControlListener(this, this.thumbModel);
        slider.addMouseListener(this.radianceRolloverListener);
        slider.addMouseMotionListener(this.radianceRolloverListener);

        this.radiancePropertyChangeListener = propertyChangeEvent -> {
            if ("enabled".equals(propertyChangeEvent.getPropertyName())) {
                RadianceSliderUI.this.thumbModel.setEnabled(slider.isEnabled());
            }
            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(slider::updateUI);
            }
        };
        this.slider.addPropertyChangeListener(this.radiancePropertyChangeListener);

        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();
    }

    @Override
    protected void uninstallListeners(JSlider slider) {
        super.uninstallListeners(slider);

        // fix for defect 109 - memory leak on changing skin
        slider.removeMouseListener(this.radianceRolloverListener);
        slider.removeMouseMotionListener(this.radianceRolloverListener);
        this.radianceRolloverListener = null;

        slider.removePropertyChangeListener(this.radiancePropertyChangeListener);
        this.radiancePropertyChangeListener = null;

        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();
    }

    @Override
    public void paintFocus(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(g2d, 0, 0,
                this.slider.getWidth(), this.slider.getWidth(),
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    RadianceCoreUtilities.paintFocus(graphics1X, this.slider, this.slider, this,
                            scaleFactor, null, null, 1.0f,
                            (float) scaleFactor * RadianceSizeUtils.getFocusStrokeWidth(this.slider));
                }
        );

        g2d.dispose();
    }

    /**
     * Returns the shorter dimension of the track.
     *
     * @return Shorter dimension of the track.
     */
    protected int getTrackWidth() {
        return RadianceSizeUtils
                .getSliderTrackSize(RadianceSizeUtils.getComponentFontSize(this.slider));
    }

    @Override
    protected int getTickLength() {
        return RadianceSizeUtils
                .getSliderTickSize(RadianceSizeUtils.getComponentFontSize(this.slider));
    }

    @Override
    public void paintTicks(Graphics g) {
        Rectangle tickBounds = this.tickRect;
        RadianceColorScheme tickScheme = RadianceColorSchemeUtilities.getColorScheme(this.slider,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR,
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
                RadianceSizeUtils.getAdjustedSize(
                        RadianceSizeUtils.getComponentFontSize(this.slider), 200, 1, 20, false),
                21);
    }

    @Override
    public Dimension getPreferredVerticalSize() {
        return new Dimension(21, RadianceSizeUtils.getAdjustedSize(
                RadianceSizeUtils.getComponentFontSize(this.slider), 200, 1, 20, false));
    }
}
