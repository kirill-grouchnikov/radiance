/*
 * @(#)ColorSliderUI.java  1.0.3  2005-09-11
 *
 * Copyright (c) 2004 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Werner Randelshofer. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Werner Randelshofer.
 */

package org.pushingpixels.radiance.theming.internal.contrib.randelshofer.quaqua.colorchooser;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.painter.SeparatorPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RolloverControlListener;
import org.pushingpixels.radiance.theming.internal.contrib.randelshofer.quaqua.VisualMargin;
import org.pushingpixels.radiance.theming.internal.ui.RadianceSliderUI;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

/**
 * A UI delegate for color sliders. The track of the slider visualizes how
 * changing the value of the slider affects the color.
 *
 * @author Werner Randelshofer
 * @version 1.0.3 2005-09-11 Tweaked layout and drawing code. <br>
 * 1.0.2 2005-08-28 Color track must always be regenerated if the
 * snapToTicks property changes. <br>
 * 1.0.1 2005-04-18 Fixed an undesired shift of the track on the
 * x-axis. <br>
 * 1.0 29 March 2005 Created.
 */
public class ColorSliderUI extends RadianceSliderUI implements TransitionAwareUI {
    protected Integer componentIndex;

    protected ColorSliderModel colorSliderModel;

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

    /**
     * Listener for transition animations.
     */
    protected StateTransitionTracker stateTransitionTracker;

    private static final Dimension PREFERRED_HORIZONTAL_SIZE = new Dimension(36, 20);
    private static final Dimension PREFERRED_VERTICAL_SIZE = new Dimension(26, 100);
    private static final Dimension MINIMUM_HORIZONTAL_SIZE = new Dimension(36, 20);
    private static final Dimension MINIMUM_VERTICAL_SIZE = new Dimension(26, 36);

    /**
     * Creates a new instance.
     */
    public ColorSliderUI(JSlider b) {
        super(b);
        this.thumbModel = new DefaultButtonModel();
        this.thumbModel.setArmed(false);
        this.thumbModel.setSelected(false);
        this.thumbModel.setPressed(false);
        this.thumbModel.setRollover(false);
        this.thumbModel.setEnabled(b.isEnabled());

        this.stateTransitionTracker = new StateTransitionTracker(b, this.thumbModel);
        // b.setLabelTable(new Hashtable());
    }

    public static ComponentUI createUI(JComponent b) {
        return new ColorSliderUI((JSlider) b);
    }

    @Override
    protected void installDefaults(JSlider slider) {
        super.installDefaults(slider);
        focusInsets = new Insets(0, 0, 0, 0);
        slider.setOpaque(false);
        if (slider.getOrientation() == JSlider.HORIZONTAL) {
            slider.setBorder(new VisualMargin(0, 1, -1, 1));
        } else {
            slider.setBorder(new VisualMargin(0, 0, 0, 1));
        }
        slider.setRequestFocusEnabled(true);
    }

    @Override
    protected void installListeners(final JSlider slider) {
        super.installListeners(slider);

        this.radianceRolloverListener = new RolloverControlListener(this, this.thumbModel);
        slider.addMouseListener(this.radianceRolloverListener);
        slider.addMouseMotionListener(this.radianceRolloverListener);

        this.radiancePropertyChangeListener = propertyChangeEvent -> {
            if ("enabled".equals(propertyChangeEvent.getPropertyName())) {
                thumbModel.setEnabled(slider.isEnabled());
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

        slider.removeMouseListener(this.radianceRolloverListener);
        slider.removeMouseMotionListener(this.radianceRolloverListener);
        this.radianceRolloverListener = null;

        slider.removePropertyChangeListener(this.radiancePropertyChangeListener);
        this.radiancePropertyChangeListener = null;

        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();
    }

    @Override
    public Dimension getPreferredHorizontalSize() {
        return PREFERRED_HORIZONTAL_SIZE;
    }

    @Override
    public Dimension getPreferredVerticalSize() {
        return PREFERRED_VERTICAL_SIZE;
    }

    @Override
    public Dimension getMinimumHorizontalSize() {
        return MINIMUM_HORIZONTAL_SIZE;
    }

    @Override
    public Dimension getMinimumVerticalSize() {
        return MINIMUM_VERTICAL_SIZE;
    }

    @Override
    protected void calculateThumbLocation() {
        super.calculateThumbLocation();
        if (slider.getOrientation() == JSlider.HORIZONTAL) {
            thumbRect.y += 3;
        } else {
            boolean ltr = this.slider.getComponentOrientation().isLeftToRight();
            if (ltr) {
                thumbRect.x = contentRect.x + 1;
            } else {
                thumbRect.x = tickRect.x + tickRect.width - thumbRect.width;
            }
        }
    }

    @Override
    public void paintTrack(Graphics g) {
        int cx, cy, cw, ch;
        int pad;

        Rectangle trackBounds = trackRect;
        if (slider.getOrientation() == JSlider.HORIZONTAL) {
            pad = trackBuffer;// - thumbRect.width / 2 + 2;
            cx = trackBounds.x - pad + 1;
            cy = trackBounds.y;
            // cy = (trackBounds.height / 2) - 4;
            cw = trackBounds.width + pad * 2 - 2;
            ch = trackBounds.height;
        } else {
            pad = trackBuffer;
            // cx = (trackBounds.width / 2) - 4;
            // cx = (trackBounds.width / 2);
            // cx = thumbRect.x + 2;
            cx = trackBounds.x;
            // cy = pad;
            cy = contentRect.y + 2;
            cw = trackBounds.width - 1;
            // ch = trackBounds.height;
            ch = trackBounds.height + pad * 2 - 5;
        }

        Color backgroundFill = RadianceColorSchemeUtilities.getColorScheme(this.slider,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)
                .getTextBackgroundFillColor();
        g.setColor(backgroundFill);
        g.fillRect(cx, cy, cw, ch);

        Color border = RadianceCoreUtilities.getBorderPainter(this.slider).getRepresentativeColor(
                RadianceColorSchemeUtilities.getColorScheme(this.slider,
                        RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                        ComponentState.ENABLED));
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.translate(cx, cy);

        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, cw, ch,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    graphics1X.setColor(border);
                    graphics1X.drawRect(0, 0, scaledWidth - 1, scaledHeight - 1);
                });
        graphics.dispose();

        paintColorTrack(g, cx + 2, cy + 2, cw - 4, ch - 4, trackBuffer);
    }

    @Override
    public void paintTicks(Graphics g) {
        RadianceColorScheme tickScheme = RadianceColorSchemeUtilities.getColorScheme(this.slider,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR,
                ComponentState.ENABLED);

        Rectangle tickBounds = tickRect;

        if (slider.getOrientation() == JSlider.HORIZONTAL) {
            int value = slider.getMinimum();
            int xPos;

            if (slider.getMinorTickSpacing() > 0) {
                // collect x's of the minor ticks
                java.util.List<Integer> minorXs = new ArrayList<>();
                while (value <= slider.getMaximum()) {
                    xPos = xPositionForValue(value);
                    minorXs.add(xPos);
                    value += slider.getMinorTickSpacing();
                }

                // and paint them in one call
                SeparatorPainterUtils.paintVerticalLines(g, this.slider, tickScheme, tickBounds.y,
                        minorXs, tickBounds.height / 2, 0.75f);
            }

            if (slider.getMajorTickSpacing() > 0) {
                // collect x's of the major ticks
                java.util.List<Integer> majorXs = new ArrayList<>();
                value = slider.getMinimum();

                while (value <= slider.getMaximum()) {
                    xPos = xPositionForValue(value);
                    majorXs.add(xPos);
                    value += slider.getMajorTickSpacing();
                }

                // and paint them in one call
                SeparatorPainterUtils.paintVerticalLines(g, this.slider, tickScheme, tickBounds.y,
                        majorXs, tickBounds.height, 0.75f);
            }
        } else {
            boolean ltr = this.slider.getComponentOrientation().isLeftToRight();
            g.translate(tickBounds.x, 0);

            int value = slider.getMinimum();
            int yPos;

            if (slider.getMinorTickSpacing() > 0) {
                int offset = 0;
                if (!ltr) {
                    offset = tickBounds.width - tickBounds.width / 2;
                }

                // collect y's of the minor ticks
                java.util.List<Integer> minorYs = new ArrayList<>();
                while (value <= slider.getMaximum()) {
                    yPos = yPositionForValue(value);
                    minorYs.add(yPos);
                    value += slider.getMinorTickSpacing();
                }
                // and paint them in one call
                SeparatorPainterUtils.paintHorizontalLines(g, this.slider, tickScheme, offset,
                        minorYs, tickBounds.width / 2, ltr ? 0.75f : 0.25f, ltr);
            }

            if (slider.getMajorTickSpacing() > 0) {
                value = slider.getMinimum();

                // collect y's of the major ticks
                java.util.List<Integer> majorYs = new ArrayList<>();
                while (value <= slider.getMaximum()) {
                    yPos = yPositionForValue(value);
                    majorYs.add(yPos);
                    value += slider.getMajorTickSpacing();
                }

                // and paint them in one call
                SeparatorPainterUtils.paintHorizontalLines(g, this.slider, tickScheme, 0, majorYs,
                        tickBounds.width, ltr ? 0.75f : 0.25f, ltr);
            }
            g.translate(-tickBounds.x, 0);
        }
    }

    @Override
    public void paintFocus(Graphics g) {
    }

    private void paintColorTrack(Graphics g, int x, int y, int width, int height, int buffer) {
        if (componentIndex == null) {
            componentIndex = (Integer) slider.getClientProperty("ColorComponentIndex");
        }
        if (colorSliderModel == null) {
            colorSliderModel = (ColorSliderModel) slider.getClientProperty("ColorSliderModel");
        }

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.translate(x, y);

        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                    int gradientEndX = scaledX;
                    int gradientEndY = scaledY;
                    if (slider.getOrientation() == JSlider.HORIZONTAL) {
                        gradientEndX += scaledWidth;
                    } else {
                        gradientEndY += scaledHeight;
                    }

                    Color c1 = new Color(colorSliderModel.getInterpolatedRGB(componentIndex, 0.0f),
                            true);
                    Color c2 = new Color(colorSliderModel.getInterpolatedRGB(componentIndex, 1.0f));
                    graphics1X.setPaint(new LinearGradientPaint(
                            scaledX, scaledY, gradientEndX, gradientEndY, new float[]{0f, 1.0f},
                            slider.getOrientation() == JSlider.HORIZONTAL ?
                                    new Color[]{c1, c2} : new Color[]{c2, c1}));
                    graphics1X.fillRect(scaledX, scaledY, scaledWidth, scaledHeight);
                });
        graphics.dispose();
    }

    @Override
    protected void calculateTrackRect() {
        if (slider.getOrientation() == JSlider.HORIZONTAL) {
            trackRect.x = contentRect.x + trackBuffer + 1;
            trackRect.height = 13;
            trackRect.y = contentRect.y + contentRect.height - trackRect.height;
            trackRect.width = contentRect.width - (trackBuffer * 2) - 1;
        } else {
            trackRect.width = 14;
            boolean ltr = this.slider.getComponentOrientation().isLeftToRight();
            if (ltr) {
                trackRect.x = contentRect.x + contentRect.width - trackRect.width;
            } else {
                trackRect.x = contentRect.x;
            }
            trackRect.y = contentRect.y + trackBuffer;
            trackRect.height = contentRect.height - (trackBuffer * 2) + 1;
        }

    }

    @Override
    protected void calculateTickRect() {
        if (slider.getOrientation() == JSlider.HORIZONTAL) {
            tickRect.x = trackRect.x;
            tickRect.y = trackRect.y - getTickLength();
            tickRect.width = trackRect.width;
            tickRect.height = getTickLength();

            if (!slider.getPaintTicks()) {
                --tickRect.y;
                tickRect.height = 0;
            }
        } else {
            boolean ltr = this.slider.getComponentOrientation().isLeftToRight();
            if (ltr) {
                tickRect.width = getTickLength();
                tickRect.x =
                        trackRect.x - tickRect.width;
            } else {
                tickRect.x =
                        trackRect.x + trackRect.width;
                tickRect.width = getTickLength();
            }

            tickRect.y = trackRect.y;
            tickRect.height = trackRect.height;

            if (!slider.getPaintTicks()) {
                --tickRect.x;
                tickRect.width = 0;
            }
        }
    }

    /**
     * Gets the height of the tick area for horizontal sliders and the width of
     * the tick area for vertical sliders. BasicSliderUI uses the returned value
     * to determine the tick area rectangle. If you want to give your ticks some
     * room, make this larger than you need and paint your ticks away from the
     * sides in paintTicks().
     */
    @Override
    protected int getTickLength() {
        return 4;
    }

    @Override
    protected PropertyChangeListener createPropertyChangeListener(JSlider slider) {
        return new CSUIPropertyChangeHandler();
    }

    public class CSUIPropertyChangeHandler extends BasicSliderUI.PropertyChangeHandler {
        @Override
        public void propertyChange(PropertyChangeEvent e) {
            String propertyName = e.getPropertyName();

            switch (propertyName) {
                case "Frame.active":
                    // calculateGeometry();
                    slider.repaint();
                    break;
                case "ColorSliderModel":
                    colorSliderModel = (ColorSliderModel) e.getNewValue();
                    slider.repaint();
                    break;
                case "snapToTicks":
                    slider.repaint();
                    break;
                case "ColorComponentIndex":
                    componentIndex = (Integer) e.getNewValue();
                    slider.repaint();
                    break;
                case "ColorComponentChange":
                    slider.repaint();
                    break;
                case "ColorComponentValue":
                    slider.repaint();
                    break;
                case "Orientation":
                    if (slider.getOrientation() == JSlider.HORIZONTAL) {
                        slider.setBorder(new VisualMargin(0, 1, -1, 1));
                    } else {
                        slider.setBorder(new VisualMargin(0, 0, 0, 1));
                    }
                    break;
            }

            super.propertyChange(e);
        }
    }

    @Override
    protected TrackListener createTrackListener(JSlider slider) {
        return new QuaquaTrackListener();
    }

    /**
     * Track mouse movements.
     * <p>
     * This inner class is marked &quot;public&quot; due to a compiler bug. This
     * class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of <Foo>.
     */
    public class QuaquaTrackListener extends BasicSliderUI.TrackListener {
        /**
         * If the mouse is pressed above the "thumb" component then reduce the
         * scrollbars value by one page ("page up"), otherwise increase it by
         * one page. If there is no thumb then page up if the mouse is in the
         * upper half of the track.
         */
        @Override
        public void mousePressed(MouseEvent e) {
            if (!slider.isEnabled())
                return;

            currentMouseX = e.getX();
            currentMouseY = e.getY();

            if (slider.isRequestFocusEnabled()) {
                slider.requestFocus();
            }

            // Clicked inside the Thumb area?
            if (thumbRect.contains(currentMouseX, currentMouseY)) {
                super.mousePressed(e);
            } else {
                switch (slider.getOrientation()) {
                    case JSlider.VERTICAL:
                        slider.setValue(valueForYPosition(currentMouseY));
                        break;
                    case JSlider.HORIZONTAL:
                        slider.setValue(valueForXPosition(currentMouseX));
                        break;
                }

                // FIXME:
                // We should set isDragging to false here. Unfortunately,
                // we can not access this variable in class BasicSliderUI.
            }
        }
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.stateTransitionTracker;
    }

    @Override
    public boolean isInside(MouseEvent me) {
        Rectangle thumbB = this.thumbRect;
        return thumbB != null && thumbB.contains(me.getX(), me.getY());
    }
}
