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
package org.pushingpixels.radiance.laf.internal.ui;

import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior;
import org.pushingpixels.radiance.animation.api.Timeline.TimelineState;
import org.pushingpixels.radiance.animation.api.callback.TimelineCallback;
import org.pushingpixels.radiance.animation.api.ease.Spline;
import org.pushingpixels.radiance.animation.api.swing.SwingComponentTimeline;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices;
import org.pushingpixels.radiance.laf.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.laf.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.laf.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.laf.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.laf.internal.utils.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.util.EnumSet;
import java.util.Set;

/**
 * UI for progress bars in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceProgressBarUI extends BasicProgressBarUI {
    private static final ComponentState DETERMINATE_SELECTED = new ComponentState(
            "determinate enabled", new RadianceLafSlices.ComponentStateFacet[] {RadianceLafSlices.ComponentStateFacet.ENABLE,
            RadianceLafSlices.ComponentStateFacet.DETERMINATE, RadianceLafSlices.ComponentStateFacet.SELECTION},
            null);

    private static final ComponentState DETERMINATE_SELECTED_DISABLED = new ComponentState(
            "determinate disabled",
            new RadianceLafSlices.ComponentStateFacet[] {RadianceLafSlices.ComponentStateFacet.DETERMINATE,
                    RadianceLafSlices.ComponentStateFacet.SELECTION},
            new RadianceLafSlices.ComponentStateFacet[] {RadianceLafSlices.ComponentStateFacet.ENABLE});

    private static final ComponentState INDETERMINATE_SELECTED = new ComponentState(
            "indeterminate enabled",
            new RadianceLafSlices.ComponentStateFacet[] {RadianceLafSlices.ComponentStateFacet.ENABLE, RadianceLafSlices.ComponentStateFacet.SELECTION},
            new RadianceLafSlices.ComponentStateFacet[] {RadianceLafSlices.ComponentStateFacet.DETERMINATE});

    private static final ComponentState INDETERMINATE_SELECTED_DISABLED = new ComponentState(
            "indeterminate disabled", null,
            new RadianceLafSlices.ComponentStateFacet[] {RadianceLafSlices.ComponentStateFacet.DETERMINATE, RadianceLafSlices.ComponentStateFacet.ENABLE,
                    RadianceLafSlices.ComponentStateFacet.SELECTION});

    private static final RadianceFillPainter progressFillPainter = new FractionBasedFillPainter(
            "Progress fill (internal)", new float[] {0.0f, 0.5f, 1.0f},
            new ColorSchemeSingleColorQuery[] {ColorSchemeSingleColorQuery.EXTRALIGHT,
                    ColorSchemeSingleColorQuery.LIGHT, ColorSchemeSingleColorQuery.MID});

    private final class RadianceChangeListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            RadianceCoreUtilities.testComponentStateChangeThreadingViolation(progressBar);

            int currValue = progressBar.getValue();
            int span = progressBar.getMaximum() - progressBar.getMinimum();

            int barRectWidth = progressBar.getWidth() - 2 * margin;
            int barRectHeight = progressBar.getHeight() - 2 * margin;
            int totalPixels = (progressBar.getOrientation() == JProgressBar.HORIZONTAL)
                    ? barRectWidth : barRectHeight;
            // fix for defect 223 (min and max on the model are the
            // same).
            int pixelDelta = (span <= 0) ? 0 : (currValue - displayedValue) * totalPixels / span;

            if (displayTimeline != null) {
                displayTimeline.abort();
            }

            displayTimeline =
                    AnimationConfigurationManager.getInstance().timelineBuilder(progressBar)
                            .addPropertyToInterpolate(Timeline.<Integer>property("displayedValue")
                                    .from(displayedValue)
                                    .to(currValue)
                                    .setWith((obj, fieldName, value) -> {
                                        displayedValue = value;
                                        if (progressBar != null) {
                                            progressBar.repaint();
                                        }
                                    }))
                            .setEase(new Spline(0.4f))
                            .build();

            // Do not animate progress bars used in cell renderers
            // since in this case it will most probably be the
            // same progress bar used to display different
            // values for different cells. Also do not animate progress bars
            // that are not part of the UI tree.
            boolean isInCellRenderer = (SwingUtilities.getAncestorOfClass(CellRendererPane.class,
                    progressBar) != null);
            boolean hasParent = (progressBar.getParent() != null);
            if (hasParent && !isInCellRenderer && Math.abs(pixelDelta) > 5) {
                displayTimeline.play();
            } else {
                displayedValue = currValue;
                progressBar.repaint();
            }
        }
    }

    /**
     * Hash for computed stripe images.
     */
    private static LazyResettableHashMap<BufferedImage> stripeMap = new
            LazyResettableHashMap<>("RadianceProgressBarUI.stripeMap");

    /**
     * Hash for computed background images.
     */
    private static LazyResettableHashMap<BufferedImage> backgroundMap = new
            LazyResettableHashMap<>("RadianceProgressBarUI.backgroundMap");

    /**
     * Hash for computed progress images.
     */
    private static LazyResettableHashMap<BufferedImage> progressMap = new
            LazyResettableHashMap<>("RadianceProgressBarUI.progressMap");

    /**
     * The current position of the indeterminate animation's cycle. 0, the initial value, means
     * paint the first frame. When the progress bar is indeterminate and showing, the
     * {@link #indeterminateLoopTimeline} is updating this value.
     */
    private float animationPosition;

    /**
     * Value change listener on the associated progress bar.
     */
    private ChangeListener radianceValueChangeListener;

    /**
     * Property change listener. Tracks changes to the <code>font</code> property.
     */
    private PropertyChangeListener radiancePropertyChangeListener;

    /**
     * Inner margin.
     */
    private int margin;

    private int displayedValue;

    private Timeline displayTimeline;

    private Timeline indeterminateLoopTimeline;

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceProgressBarUI();
    }

    private RadianceProgressBarUI() {
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();

        this.displayedValue = progressBar.getValue();
        LookAndFeel.installProperty(progressBar, "opaque", Boolean.FALSE);

        this.margin = 0;
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        radianceValueChangeListener = new RadianceChangeListener();
        this.progressBar.addChangeListener(this.radianceValueChangeListener);

        this.radiancePropertyChangeListener = propertyChangeEvent -> {
            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(() -> {
                    if (progressBar != null) {
                        progressBar.updateUI();
                    }
                });
            }
        };
        this.progressBar.addPropertyChangeListener(this.radiancePropertyChangeListener);
    }

    @Override
    protected void uninstallListeners() {
        this.progressBar.removeChangeListener(this.radianceValueChangeListener);
        this.radianceValueChangeListener = null;

        this.progressBar.removePropertyChangeListener(this.radiancePropertyChangeListener);
        this.radiancePropertyChangeListener = null;

        super.uninstallListeners();
    }

    /**
     * Retrieves stripe image.
     *
     * @param baseSize    Stripe base in pixels.
     * @param isRotated   if <code>true</code>, the resulting stripe image will be rotated.
     * @param colorScheme Color scheme to paint the stripe image.
     * @return Stripe image.
     */
    private static BufferedImage getStripe(double scale, int baseSize, boolean isRotated,
            RadianceColorScheme colorScheme) {
        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(scale,
                baseSize, isRotated, colorScheme.getDisplayName());
        BufferedImage result = RadianceProgressBarUI.stripeMap.get(key);
        if (result == null) {
            result = RadianceImageCreator.getStripe(scale, baseSize,
                    colorScheme.getUltraLightColor());
            if (isRotated) {
                result = RadianceImageCreator.getRotated(scale, result, 1);
            }
            RadianceProgressBarUI.stripeMap.put(key, result);
        }
        return result;
    }

    /**
     * Returns the background of a determinate progress bar.
     *
     * @param bar                  Progress bar.
     * @param width                Progress bar width.
     * @param height               Progress bar height.
     * @param scheme               Color scheme for the background.
     * @param fillPainter          Fill painter.
     * @param orientation          Progress bar orientation (vertical / horizontal).
     * @param componentOrientation Progress bar LTR / RTL orientation.
     * @return Background image.
     */
    private static BufferedImage getDeterminateBackground(JProgressBar bar, int width, int height,
            RadianceColorScheme scheme, RadianceFillPainter fillPainter, int orientation,
            ComponentOrientation componentOrientation) {
        double scale = RadianceCommonCortex.getScaleFactor(bar);
        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(scale, width, height,
                scheme.getDisplayName(), fillPainter.getDisplayName(),
                orientation, componentOrientation);
        BufferedImage result = RadianceProgressBarUI.backgroundMap.get(key);
        if (result == null) {
            result = RadianceCoreUtilities.getBlankImage(scale, width, height);
            Graphics2D g2d = result.createGraphics();
            float radius = 0.5f * RadianceSizeUtils
                    .getClassicButtonCornerRadius(RadianceSizeUtils.getComponentFontSize(bar));
            Shape contour = RadianceOutlineUtilities.getBaseOutline(width, height, radius, null);
            fillPainter.paintContourBackground(g2d, bar, width, height, contour, false, scheme,
                    true);
            g2d.dispose();

            if (orientation == SwingConstants.VERTICAL) {
                result = RadianceImageCreator.getRotated(scale, result, 3);
            }
            RadianceProgressBarUI.backgroundMap.put(key, result);
        }
        return result;
    }

    /**
     * Returns the background of a determinate progress bar.
     *
     * @param bar                  Progress bar.
     * @param width                Progress bar width.
     * @param height               Progress bar height.
     * @param scheme               Color scheme for the background.
     * @param fillPainter          Fill painter.
     * @param orientation          Progress bar orientation (vertical / horizontal).
     * @param componentOrientation Progress bar LTR / RTL orientation.
     * @return Background image.
     */
    private static BufferedImage getDeterminateProgress(JProgressBar bar, int width, int height,
            boolean isFull, RadianceColorScheme scheme, RadianceFillPainter fillPainter,
            int orientation, ComponentOrientation componentOrientation) {
        double scale = RadianceCommonCortex.getScaleFactor(bar);
        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(scale, width, height,
                scheme.getDisplayName(), fillPainter.getDisplayName(),
                orientation, componentOrientation);
        BufferedImage result = RadianceProgressBarUI.progressMap.get(key);
        if (result == null) {
            result = RadianceCoreUtilities.getBlankImage(scale, width, height);
            Graphics2D g2d = result.createGraphics();
            float radius = 0.5f * RadianceSizeUtils
                    .getClassicButtonCornerRadius(RadianceSizeUtils.getComponentFontSize(bar));
            RadianceLafSlices.Side straightSide = (orientation == SwingConstants.VERTICAL) ? RadianceLafSlices.Side.RIGHT
                    : (componentOrientation.isLeftToRight() ? RadianceLafSlices.Side.RIGHT : RadianceLafSlices.Side.LEFT);
            Set<RadianceLafSlices.Side> straightSides = isFull ? null : EnumSet.of(straightSide);
            Shape contour = RadianceOutlineUtilities.getBaseOutline(width, height, radius,
                    straightSides);
            fillPainter.paintContourBackground(g2d, bar, width, height, contour, false, scheme,
                    true);
            g2d.dispose();

            if (orientation == SwingConstants.VERTICAL) {
                result = RadianceImageCreator.getRotated(scale, result, 3);
            }
            RadianceProgressBarUI.progressMap.put(key, result);
        }
        return result;
    }

    @Override
    public void paintDeterminate(Graphics g, JComponent c) {
        if (!(g instanceof Graphics2D)) {
            return;
        }

        double scale = RadianceCommonCortex.getScaleFactor(progressBar);

        ComponentState fillState = getFillState();
        ComponentState progressState = getProgressState();

        int barRectWidth = progressBar.getWidth() - 2 * margin;
        int barRectHeight = progressBar.getHeight() - 2 * margin;

        // amount of progress to draw
        int amountFull = getAmountFull(new Insets(margin, margin, margin, margin), barRectWidth,
                barRectHeight);

        Graphics2D g2d = (Graphics2D) g.create();
        // install state-aware alpha channel (support for skins
        // that use translucency on disabled states).
        float stateAlpha = RadianceColorSchemeUtilities.getAlpha(progressBar, fillState);
        g2d.setComposite(WidgetUtilities.getAlphaComposite(progressBar, stateAlpha, g));

        RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(progressBar,
                fillState);

        RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(progressBar);
        if (progressBar.getOrientation() == SwingConstants.HORIZONTAL) {
            BufferedImage back = getDeterminateBackground(progressBar, barRectWidth, barRectHeight,
                    fillScheme, fillPainter, progressBar.getOrientation(),
                    this.progressBar.getComponentOrientation());
            RadianceCommonCortex.drawImageWithScale(g2d, scale, back, margin, margin);
        } else {
            BufferedImage back = getDeterminateBackground(progressBar, barRectHeight, barRectWidth,
                    fillScheme, fillPainter, progressBar.getOrientation(),
                    this.progressBar.getComponentOrientation());
            RadianceCommonCortex.drawImageWithScale(g2d, scale, back, margin, margin);
        }

        if (amountFull > 0) {
            boolean isFull = (this.progressBar.getModel().getValue() == this.progressBar
                    .getMaximum());
            RadianceColorScheme progressColorScheme = RadianceColorSchemeUtilities
                    .getColorScheme(progressBar, progressState);
            if (progressBar.getOrientation() == SwingConstants.HORIZONTAL) {
                int progressWidth = amountFull;
                int progressHeight = barRectHeight;
                if ((progressWidth > 0) && (progressHeight > 0)) {
                    BufferedImage progress = getDeterminateProgress(progressBar, progressWidth,
                            progressHeight, isFull, progressColorScheme, progressFillPainter,
                            progressBar.getOrientation(),
                            this.progressBar.getComponentOrientation());
                    if (progressBar.getComponentOrientation().isLeftToRight()) {
                        RadianceCommonCortex.drawImageWithScale(g2d, scale, progress, margin, margin);
                    } else {
                        // fix for RTL determinate horizontal progress
                        // bar in 2.3
                        RadianceCommonCortex.drawImageWithScale(g2d, scale, progress,
                                margin + barRectWidth - amountFull, margin);
                    }
                }
            } else { // VERTICAL
                int progressWidth = barRectWidth;
                int progressHeight = amountFull;
                if ((amountFull > 0) && (progressHeight > 0)) {
                    // fix for issue 95. Vertical bar is growing from
                    // the bottom
                    BufferedImage progress = getDeterminateProgress(progressBar, progressHeight,
                            progressWidth, isFull, progressColorScheme, progressFillPainter,
                            progressBar.getOrientation(),
                            this.progressBar.getComponentOrientation());
                    RadianceCommonCortex.drawImageWithScale(g2d, scale, progress, margin,
                            margin + barRectHeight - progressHeight);
                }
            }
        }

        // Deal with possible text painting
        if (progressBar.isStringPainted()) {
            g2d.setComposite(WidgetUtilities.getAlphaComposite(progressBar, 1.0f, g));
            this.paintString(g2d, margin, margin, barRectWidth, barRectHeight, amountFull,
                    new Insets(margin, margin, margin, margin));
        }
        g2d.dispose();
    }

    @Override
    protected Color getSelectionBackground() {
        ComponentState fillState = getFillState();

        RadianceColorScheme scheme = RadianceColorSchemeUtilities.getColorScheme(progressBar,
                fillState);
        return RadianceColorUtilities.getForegroundColor(scheme);
    }

    @Override
    protected Color getSelectionForeground() {
        ComponentState progressState = getProgressState();

        RadianceColorScheme scheme = RadianceColorSchemeUtilities.getColorScheme(progressBar,
                progressState);
        return RadianceColorUtilities.getForegroundColor(scheme);
    }

    @Override
    public void paintIndeterminate(Graphics g, JComponent c) {
        if (!(g instanceof Graphics2D)) {
            return;
        }

        double scale = RadianceCommonCortex.getScaleFactor(c);
        ComponentState progressState = getProgressState();

        final int barRectWidth = progressBar.getWidth() - 2 * margin;
        final int barRectHeight = progressBar.getHeight() - 2 * margin;

        int valComplete;
        if (progressBar.getOrientation() == SwingConstants.HORIZONTAL) {
            valComplete = (int) (this.animationPosition * (2 * barRectHeight + 1));
        } else {
            valComplete = (int) (this.animationPosition * (2 * barRectWidth + 1));
        }

        Graphics2D g2d = (Graphics2D) g.create();
        // install state-aware alpha channel (support for skins
        // that use translucency on disabled states).
        float stateAlpha = RadianceColorSchemeUtilities.getAlpha(progressBar, progressState);
        g2d.setComposite(WidgetUtilities.getAlphaComposite(progressBar, stateAlpha, g));
        float radius = 0.5f * RadianceSizeUtils
                .getClassicButtonCornerRadius(RadianceSizeUtils.getComponentFontSize(progressBar));
        g2d.clip(new RoundRectangle2D.Float(margin, margin, barRectWidth, barRectHeight, radius,
                radius));

        RadianceColorScheme scheme = RadianceColorSchemeUtilities.getColorScheme(progressBar,
                progressState);
        if (progressBar.getOrientation() == SwingConstants.HORIZONTAL) {
            RadianceImageCreator.paintRectangularStripedBackground(c, g2d, scale, margin,
                    margin, barRectWidth, barRectHeight, scheme,
                    RadianceProgressBarUI.getStripe(scale, barRectHeight, false, scheme),
                    valComplete, 0.6f, false);
        } else {
            // fix for issue 95. Vertical progress bar grows from the
            // bottom.
            RadianceImageCreator.paintRectangularStripedBackground(c, g2d, scale, margin,
                    margin, barRectWidth, barRectHeight, scheme,
                    RadianceProgressBarUI.getStripe(scale, barRectWidth, true, scheme),
                    2 * barRectWidth - valComplete, 0.6f, true);
        }

        // Deal with possible text painting
        if (progressBar.isStringPainted()) {
            g2d.setComposite(WidgetUtilities.getAlphaComposite(progressBar, 1.0f, g));
            this.paintString(g2d, margin, margin, barRectWidth, barRectHeight, barRectWidth,
                    new Insets(margin, margin, margin, margin));
        }
        g2d.dispose();
    }

    private ComponentState getFillState() {
        return progressBar.isEnabled() ? ComponentState.ENABLED
                : ComponentState.DISABLED_UNSELECTED;
    }

    private ComponentState getProgressState() {
        if (progressBar.isIndeterminate()) {
            return progressBar.isEnabled() ? INDETERMINATE_SELECTED
                    : INDETERMINATE_SELECTED_DISABLED;
        } else {
            return progressBar.isEnabled() ? DETERMINATE_SELECTED : DETERMINATE_SELECTED_DISABLED;
        }
    }

    @Override
    protected Rectangle getBox(Rectangle r) {
        // Insets b = this.getInsets(); // area for border
        int barRectWidth = progressBar.getWidth() - 2 * margin;
        int barRectHeight = progressBar.getHeight() - 2 * margin;
        return new Rectangle(margin, margin, barRectWidth, barRectHeight);
    }

    @Override
    protected void startAnimationTimer() {
        int cycleDuration = UIManager.getInt("ProgressBar.cycleTime");
        if (cycleDuration == 0) {
            cycleDuration = 1000;
        }
        this.indeterminateLoopTimeline =
                SwingComponentTimeline.componentBuilder(this.progressBar)
                        .setDuration(cycleDuration)
                        .addCallback(new TimelineCallback() {
                            @Override
                            public void onTimelineStateChanged(TimelineState oldState,
                                    TimelineState newState,
                                    float durationFraction, float timelinePosition) {
                                if ((progressBar != null) && progressBar.isVisible())
                                    progressBar.repaint();
                            }

                            @Override
                            public void onTimelinePulse(float durationFraction,
                                    float timelinePosition) {
                                if ((progressBar != null) && progressBar.isVisible())
                                    progressBar.repaint();
                            }
                        })
                        .addPropertyToInterpolate(
                                Timeline.<Float>property("animationPosition")
                                        .from(0.0f)
                                        .to(1.0f)
                                        .setWith((obj, fieldName, value) -> animationPosition = value))
                        .build();

        this.indeterminateLoopTimeline.playLoop(RepeatBehavior.LOOP);
    }

    @Override
    protected void stopAnimationTimer() {
        this.indeterminateLoopTimeline.abort();
    }

    @Override
    protected int getAmountFull(Insets b, int width, int height) {
        int amountFull = 0;
        BoundedRangeModel model = progressBar.getModel();

        long span = model.getMaximum() - model.getMinimum();
        double percentComplete = (double) (this.displayedValue - model.getMinimum())
                / (double) span;

        if ((model.getMaximum() - model.getMinimum()) != 0) {
            if (this.progressBar.getOrientation() == JProgressBar.HORIZONTAL) {
                amountFull = (int) Math.round(width * percentComplete);
            } else {
                amountFull = (int) Math.round(height * percentComplete);
            }
        }
        return amountFull;
    }

    @Override
    protected Dimension getPreferredInnerHorizontal() {
        int size = RadianceSizeUtils.getComponentFontSize(this.progressBar);
        size += 2 * RadianceSizeUtils.getAdjustedSize(size, 1, 4, 1, false);
        return new Dimension(146 + RadianceSizeUtils.getAdjustedSize(size, 0, 1, 10, false), size);
    }

    @Override
    protected Dimension getPreferredInnerVertical() {
        int size = RadianceSizeUtils.getComponentFontSize(this.progressBar);
        size += 2 * RadianceSizeUtils.getAdjustedSize(size, 1, 4, 1, false);
        return new Dimension(size, 146 + RadianceSizeUtils.getAdjustedSize(size, 0, 1, 10, false));
    }

    @Override
    protected void paintString(Graphics g, int x, int y, int width, int height, int amountFull,
            Insets b) {
        if (progressBar.getOrientation() == JProgressBar.HORIZONTAL) {
            if (progressBar.getComponentOrientation().isLeftToRight()) {
                if (progressBar.isIndeterminate()) {
                    boxRect = getBox(boxRect);
                    paintString(g, x, y, width, height, boxRect.x, boxRect.width);
                } else {
                    paintString(g, x, y, width, height, x, amountFull);
                }
            } else {
                paintString(g, x, y, width, height, x + width - amountFull, amountFull);
            }
        } else {
            if (progressBar.isIndeterminate()) {
                boxRect = getBox(boxRect);
                paintString(g, x, y, width, height, boxRect.y, boxRect.height);
            } else {
                paintString(g, x, y, width, height, y + height - amountFull, amountFull);
            }
        }
    }

    /**
     * Paints the progress string.
     *
     * @param g          Graphics used for drawing.
     * @param x          x location of bounding box
     * @param y          y location of bounding box
     * @param width      width of bounding box
     * @param height     height of bounding box
     * @param fillStart  start location, in x or y depending on orientation, of the filled
     *                   portion of the
     *                   progress bar.
     * @param amountFull size of the fill region, either width or height depending upon orientation.
     */
    private void paintString(Graphics g, int x, int y, int width, int height, int fillStart, int amountFull) {
        String progressString = progressBar.getString();
        Rectangle renderRectangle = getStringRectangle(progressString, x, y, width, height);

        if (progressBar.getOrientation() == JProgressBar.HORIZONTAL) {
            RadianceTextUtilities.paintText(g, renderRectangle, progressString,
                    -1, progressBar.getFont(), getSelectionBackground(),
                    new Rectangle(amountFull, y, progressBar.getWidth() - amountFull, height));
            RadianceTextUtilities.paintText(g, renderRectangle, progressString,
                    -1, progressBar.getFont(), getSelectionForeground(),
                    new Rectangle(fillStart, y, amountFull, height));
        } else { // VERTICAL
            RadianceTextUtilities.paintVerticalText(g, renderRectangle,
                    progressString, -1, progressBar.getFont(), getSelectionBackground(),
                    new Rectangle(x, y, width, progressBar.getHeight() - amountFull),
                    progressBar.getComponentOrientation().isLeftToRight());
            RadianceTextUtilities.paintVerticalText(g, renderRectangle,
                    progressString, -1, progressBar.getFont(), getSelectionForeground(),
                    new Rectangle(x, fillStart, width, amountFull),
                    progressBar.getComponentOrientation().isLeftToRight());
        }
    }

    /**
     * Returns the rectangle for the progress bar string.
     *
     * @param progressString Progress bar string.
     * @param x              x location of bounding box
     * @param y              y location of bounding box
     * @param width          width of bounding box
     * @param height         height of bounding box
     * @return The rectangle for the progress bar string.
     */
    private Rectangle getStringRectangle(String progressString, int x, int y, int width,
            int height) {
        FontMetrics fontSizer = RadianceMetricsUtilities.getFontMetrics(
                RadianceCommonCortex.getScaleFactor(progressBar), progressBar.getFont());

        int stringWidth = fontSizer.stringWidth(progressString);

        if (progressBar.getOrientation() == JProgressBar.HORIZONTAL) {
            return new Rectangle(x + Math.round(width / 2 - stringWidth / 2),
                    y + (height - fontSizer.getHeight()) / 2, stringWidth, fontSizer.getHeight());
        } else {
            return new Rectangle(x + (width - fontSizer.getHeight()) / 2,
                    y + Math.round(height / 2 - stringWidth / 2), fontSizer.getHeight(),
                    stringWidth);
        }
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        super.update(g2d, c);
        g2d.dispose();
    }
}
