/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingWidget;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.RadianceThemingWidgetRepository;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;
import org.pushingpixels.radiance.theming.internal.widget.animation.effects.GhostPaintingUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.beans.PropertyChangeListener;
import java.util.Set;

/**
 * UI for scroll bars in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceScrollBarUI extends BasicScrollBarUI implements TransitionAwareUI {
    /**
     * Surrogate button model for tracking the thumb transitions.
     */
    private ButtonModel thumbModel;

    private BladeColorScheme mutableFillColorScheme = new BladeColorScheme();
    private BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();

    /**
     * Listener for thumb transition animations.
     */
    private RolloverControlListener radianceThumbRolloverListener;

    private StateTransitionTracker compositeStateTransitionTracker;

    /**
     * Property change listener.
     */
    private PropertyChangeListener radiancePropertyListener;

    /**
     * Scroll bar width.
     */
    private int scrollBarWidth;

    /**
     * Listener on adjustments made to the scrollbar model.
     */
    private AdjustmentListener radianceAdjustmentListener;

    private Set<RadianceThemingWidget<JComponent>> themingWidgets;

    private static int THUMB_DELTA = 2;

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceScrollBarUI(comp);
    }

    /**
     * Simple constructor.
     *
     * @param b Associated component.
     */
    private RadianceScrollBarUI(JComponent b) {
        super();
        this.thumbModel = new DefaultButtonModel();
        this.thumbModel.setArmed(false);
        this.thumbModel.setSelected(false);
        this.thumbModel.setPressed(false);
        this.thumbModel.setRollover(false);

        b.setOpaque(false);
    }

    @Override
    public void installUI(JComponent c) {
        this.themingWidgets = RadianceThemingWidgetRepository.getRepository().getMatchingWidgets(c);

        super.installUI(c);

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installUI();
        }
    }

    @Override
    public void uninstallUI(JComponent c) {
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallUI();
        }
        super.uninstallUI(c);
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return null;
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return null;
    }

    private void drawThumbVertical(Graphics2D g, Rectangle thumbBounds) {
        int width = Math.max(1, thumbBounds.width);
        int delta = Math.max(0, (int) (0.4 * width));
        if (delta % 2 == 1) {
            delta--;
        }
        width -= delta;
        int height = Math.max(1, thumbBounds.height);

        int hoffset = thumbBounds.width - width;

        StateTransitionTracker.ModelStateInfo modelStateInfo = this.compositeStateTransitionTracker
                .getModelStateInfo();
        ComponentState currState = modelStateInfo.getCurrModelState();

        // Populate color schemes based on the current transition state of the scrollbar.
        // Note that enabled scroll bar is always painted as active (the "treatEnabledAsActive"
        // parameter to "populateColorScheme").
        BladeUtils.populateColorScheme(mutableFillColorScheme, this.scrollbar,
                modelStateInfo, currState,
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                true);
        BladeUtils.populateColorScheme(mutableBorderColorScheme, this.scrollbar,
                modelStateInfo, currState,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                false);

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics,
                thumbBounds.x, thumbBounds.y, height, width,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    RadianceFillPainter painter = RadianceCoreUtilities.getFillPainter(this.scrollbar);
                    RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(this.scrollbar);

                    float radius = scaledHeight / 2;
                    Shape contour = RadianceOutlineUtilities.getBaseOutline(scaledWidth, scaledHeight,
                            radius, null, 1.0f);

                    // Rotate the graphics context for correct "orientation" of the visuals
                    AffineTransform at = AffineTransform.getRotateInstance(-Math.PI / 2);
                    at.translate(x - scaledWidth, y + hoffset / scaleFactor);
                    graphics1X.transform(at);

                    painter.paintContourBackground(graphics1X, this.scrollbar, scaledWidth, scaledHeight,
                            contour, false, mutableFillColorScheme, true);
                    borderPainter.paintBorder(graphics1X, this.scrollbar, scaledWidth, scaledHeight,
                            contour, null, mutableBorderColorScheme);
                });
        graphics.dispose();
    }

    private void drawThumbHorizontal(Graphics2D g, Rectangle thumbBounds) {
        int width = Math.max(1, thumbBounds.width);
        int height = Math.max(1, thumbBounds.height);
        int delta = Math.max(0, (int) (0.4 * height));
        if (delta % 2 == 1) {
            delta--;
        }
        height -= delta;

        int voffset = thumbBounds.height - height;

        StateTransitionTracker.ModelStateInfo modelStateInfo = this.compositeStateTransitionTracker
                .getModelStateInfo();
        ComponentState currState = modelStateInfo.getCurrModelState();

        // Populate color schemes based on the current transition state of the scrollbar.
        // Note that enabled scroll bar is always painted as active (the "treatEnabledAsActive"
        // parameter to "populateColorScheme").
        BladeUtils.populateColorScheme(mutableFillColorScheme, this.scrollbar,
                modelStateInfo, currState,
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                true);
        BladeUtils.populateColorScheme(mutableBorderColorScheme, this.scrollbar,
                modelStateInfo, currState,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                false);

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics,
                thumbBounds.x, thumbBounds.y, width, height,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    RadianceFillPainter painter = RadianceCoreUtilities.getFillPainter(this.scrollbar);
                    RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(this.scrollbar);

                    float radius = scaledHeight / 2;
                    Shape contour = RadianceOutlineUtilities.getBaseOutline(scaledWidth, scaledHeight,
                            radius, null, 1.0f);
                    graphics1X.translate(x, y + voffset / scaleFactor);
                    painter.paintContourBackground(graphics1X, this.scrollbar, scaledWidth, scaledHeight,
                            contour, false, mutableFillColorScheme, true);
                    borderPainter.paintBorder(graphics1X, this.scrollbar, scaledWidth, scaledHeight,
                            contour, null, mutableBorderColorScheme);
                });
        graphics.dispose();
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        Graphics2D graphics = (Graphics2D) g.create();

        if (this.scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            graphics.translate(trackBounds.x, trackBounds.y - THUMB_DELTA);
        } else {
            graphics.translate(trackBounds.x - THUMB_DELTA, trackBounds.y);
        }
        graphics.setColor(RadianceColorUtilities.getBackgroundFillColorScrollBar(this.scrollbar));
        graphics.fillRect(0, 0, this.scrollbar.getWidth(), this.scrollbar.getHeight());

        GhostPaintingUtils.paintGhostImages(this.scrollbar, g);

        graphics.dispose();
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        // System.out.println("Thumb");
        Graphics2D graphics = (Graphics2D) g.create();

        this.thumbModel.setSelected(this.thumbModel.isSelected() || this.isDragging);
        this.thumbModel.setEnabled(c.isEnabled());
        boolean isVertical = (this.scrollbar.getOrientation() == Adjustable.VERTICAL);
        if (isVertical) {
            Rectangle adjustedBounds = new Rectangle(thumbBounds.x, thumbBounds.y,
                    thumbBounds.width, thumbBounds.height);
            drawThumbVertical(graphics, adjustedBounds);
        } else {
            Rectangle adjustedBounds = new Rectangle(thumbBounds.x, thumbBounds.y,
                    thumbBounds.width, thumbBounds.height);
            drawThumbHorizontal(graphics, adjustedBounds);
        }
        graphics.dispose();
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D graphics = (Graphics2D) g.create();
        BackgroundPaintingUtils.update(graphics, c, false);
        float alpha = RadianceColorSchemeUtilities.getAlpha(this.scrollbar,
                ComponentState.getState(this.thumbModel, this.scrollbar));
        graphics.setComposite(WidgetUtilities.getAlphaComposite(c, alpha, g));
        super.paint(graphics, c);
        graphics.dispose();
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.scrollBarWidth = RadianceSizeUtils
                .getScrollBarWidth(RadianceSizeUtils.getComponentFontSize(this.scrollbar));

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installDefaults();
        }
    }

    @Override
    protected void uninstallDefaults() {
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallDefaults();
        }

        super.uninstallDefaults();
    }

    @Override
    protected void installComponents() {
        this.compositeStateTransitionTracker = new StateTransitionTracker(this.scrollbar,
                this.thumbModel);
        this.compositeStateTransitionTracker.registerModelListeners();

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installComponents();
        }
    }

    @Override
    protected void uninstallComponents() {
        this.compositeStateTransitionTracker.unregisterModelListeners();

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallComponents();
        }
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.radianceThumbRolloverListener = new RolloverControlListener(this, this.thumbModel);
        this.scrollbar.addMouseListener(this.radianceThumbRolloverListener);
        this.scrollbar.addMouseMotionListener(this.radianceThumbRolloverListener);

        this.radiancePropertyListener = propertyChangeEvent -> {
            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(() -> scrollbar.updateUI());
            }
        };
        this.scrollbar.addPropertyChangeListener(this.radiancePropertyListener);

        this.radianceAdjustmentListener = adjustmentEvent -> {
            RadianceCoreUtilities.testComponentStateChangeThreadingViolation(scrollbar);
            Component parent = RadianceScrollBarUI.this.scrollbar.getParent();
            if (parent instanceof JScrollPane) {
                JScrollPane jsp = (JScrollPane) parent;
                JScrollBar hor = jsp.getHorizontalScrollBar();
                JScrollBar ver = jsp.getVerticalScrollBar();

                JScrollBar other = null;
                if (RadianceScrollBarUI.this.scrollbar == hor) {
                    other = ver;
                }
                if (RadianceScrollBarUI.this.scrollbar == ver) {
                    other = hor;
                }

                if ((other != null) && other.isVisible())
                    other.repaint();
                RadianceScrollBarUI.this.scrollbar.repaint();
            }
        };
        this.scrollbar.addAdjustmentListener(this.radianceAdjustmentListener);

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installListeners();
        }
    }

    @Override
    protected void uninstallListeners() {
        this.scrollbar.removeMouseListener(this.radianceThumbRolloverListener);
        this.scrollbar.removeMouseMotionListener(this.radianceThumbRolloverListener);
        this.radianceThumbRolloverListener = null;

        this.scrollbar.removePropertyChangeListener(this.radiancePropertyListener);
        this.radiancePropertyListener = null;

        this.scrollbar.removeAdjustmentListener(this.radianceAdjustmentListener);
        this.radianceAdjustmentListener = null;

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallListeners();
        }

        super.uninstallListeners();
    }

    public boolean isInside(MouseEvent me) {
        Rectangle trackB = this.getTrackBounds();
        if (trackB == null)
            return false;
        return trackB.contains(me.getX(), me.getY());
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.compositeStateTransitionTracker;
    }

    @Override
    public void scrollByBlock(int direction) {
        // This method is called from RadianceScrollPaneUI to implement wheel
        // scrolling.
        int oldValue = this.scrollbar.getValue();
        int blockIncrement = this.scrollbar.getBlockIncrement(direction);
        int delta = blockIncrement * ((direction > 0) ? +1 : -1);
        int newValue = oldValue + delta;

        // Check for overflow.
        if ((delta > 0) && (newValue < oldValue)) {
            newValue = this.scrollbar.getMaximum();
        } else if ((delta < 0) && (newValue > oldValue)) {
            newValue = this.scrollbar.getMinimum();
        }

        this.scrollbar.setValue(newValue);
    }

    /**
     * Scrolls the associated scroll bar.
     *
     * @param direction Direction.
     * @param units     Scroll units.
     */
    public void scrollByUnits(int direction, int units) {
        // This method is called from RadianceScrollPaneUI to implement wheel
        // scrolling.
        int delta;

        for (int i = 0; i < units; i++) {
            if (direction > 0) {
                delta = this.scrollbar.getUnitIncrement(direction);
            } else {
                delta = -this.scrollbar.getUnitIncrement(direction);
            }

            int oldValue = this.scrollbar.getValue();
            int newValue = oldValue + delta;

            // Check for overflow.
            if ((delta > 0) && (newValue < oldValue)) {
                newValue = this.scrollbar.getMaximum();
            } else if ((delta < 0) && (newValue > oldValue)) {
                newValue = this.scrollbar.getMinimum();
            }
            if (oldValue == newValue) {
                break;
            }
            this.scrollbar.setValue(newValue);
        }
    }

    @Override
    protected void layoutVScrollbar(JScrollBar sb) {
        this.layoutVScrollbarNone(sb);
    }

    @Override
    protected void layoutHScrollbar(JScrollBar sb) {
        this.layoutHScrollbarNone(sb);
    }

    protected void layoutVScrollbarNone(JScrollBar sb) {
        Dimension sbSize = sb.getSize();
        Insets sbInsets = sb.getInsets();

        /*
         * Width and left edge of the buttons and thumb.
         */
        int itemW = sbSize.width - (sbInsets.left + sbInsets.right);
        int itemX = sbInsets.left;

        /*
         * Nominal locations of the buttons, assuming their preferred size will fit.
         */
        int incrButtonY = sbSize.height - sbInsets.bottom - THUMB_DELTA;

        /*
         * The thumb must fit within the height left over after we subtract the preferredSize of the
         * buttons and the insets.
         */
        int sbInsetsH = sbInsets.top + sbInsets.bottom;
        float trackH = sbSize.height - sbInsetsH - THUMB_DELTA;

        /*
         * Compute the height and origin of the thumb. The case where the thumb is at the bottom
         * edge is handled specially to avoid numerical problems in computing thumbY. Enforce the
         * thumbs min/max dimensions. If the thumb doesn't fit in the track (trackH) we'll hide it
         * later.
         */
        float min = sb.getMinimum();
        float extent = sb.getVisibleAmount();
        float range = sb.getMaximum() - min;
        float value = sb.getValue();

        int thumbH = (range <= 0) ? this.getMaximumThumbSize().height
                : (int) (trackH * (extent / range));
        thumbH = Math.max(thumbH, this.getMinimumThumbSize().height);
        thumbH = Math.min(thumbH, this.getMaximumThumbSize().height);
        thumbH -= THUMB_DELTA;

        int thumbY = incrButtonY - thumbH + THUMB_DELTA;
        if (value < (sb.getMaximum() - sb.getVisibleAmount())) {
            float thumbRange = trackH - thumbH;
            thumbY = THUMB_DELTA + (int) (0.5f + (thumbRange * ((value - min) / (range - extent))));
        }

        /*
         * Update the trackRect field.
         */
        int itrackY = THUMB_DELTA;
        int itrackH = incrButtonY - itrackY - 2 * THUMB_DELTA;
        this.trackRect.setBounds(itemX, itrackY, itemW, itrackH);

        /*
         * If the thumb isn't going to fit, zero it's bounds. Otherwise make sure it fits between
         * the buttons. Note that setting the thumbs bounds will cause a repaint.
         */
        if (thumbH >= (int) trackH) {
            this.setThumbBounds(0, 0, 0, 0);
        } else {
            if ((thumbY + thumbH) > incrButtonY) {
                thumbY = incrButtonY - thumbH;
            }
            if (thumbY < 0) {
                thumbY = 0;
            }
            this.setThumbBounds(itemX, thumbY, itemW, thumbH);
        }
    }

    protected void layoutHScrollbarNone(JScrollBar sb) {
        Dimension sbSize = sb.getSize();
        Insets sbInsets = sb.getInsets();

        /*
         * Height and top edge of the buttons and thumb.
         */
        int itemH = sbSize.height - (sbInsets.top + sbInsets.bottom);
        int itemY = sbInsets.top;

        boolean ltr = sb.getComponentOrientation().isLeftToRight();

        /*
         * Nominal locations of the buttons, assuming their preferred size will fit.
         */
        int incrButtonX = ltr ? sbSize.width - sbInsets.right - THUMB_DELTA
                : sbInsets.left + THUMB_DELTA;

        /*
         * The thumb must fit within the width left over after we subtract the preferredSize of the
         * buttons and the insets.
         */
        int sbInsetsW = sbInsets.left + sbInsets.right;
        float trackW = sbSize.width - sbInsetsW - THUMB_DELTA;

        /*
         * Compute the width and origin of the thumb. Enforce the thumbs min/max dimensions. The
         * case where the thumb is at the right edge is handled specially to avoid numerical
         * problems in computing thumbX. If the thumb doesn't fit in the track (trackH) we'll hide
         * it later.
         */
        float min = sb.getMinimum();
        float max = sb.getMaximum();
        float extent = sb.getVisibleAmount();
        float range = max - min;
        float value = sb.getValue();

        int thumbW = (range <= 0) ? this.getMaximumThumbSize().width
                : (int) (trackW * (extent / range));
        thumbW = Math.max(thumbW, this.getMinimumThumbSize().width);
        thumbW = Math.min(thumbW, this.getMaximumThumbSize().width);
        thumbW -= THUMB_DELTA;

        int thumbX = ltr ? incrButtonX - thumbW + THUMB_DELTA : sbInsets.left + THUMB_DELTA;
        if (value < (max - sb.getVisibleAmount())) {
            float thumbRange = trackW - thumbW;
            if (ltr) {
                thumbX = THUMB_DELTA
                        + (int) (0.5f + (thumbRange * ((value - min) / (range - extent))));
            } else {
                thumbX = THUMB_DELTA
                        + (int) (0.5f + (thumbRange * ((max - extent - value) / (range - extent))));
                // thumbX += decrButton2X + decrButton2W;
            }
        }

        /*
         * Update the trackRect field.
         */
        if (ltr) {
            int itrackX = sbInsets.left + THUMB_DELTA;
            int itrackW = incrButtonX - itrackX - 2 * THUMB_DELTA;
            this.trackRect.setBounds(itrackX, itemY, itrackW, itemH);
        } else {
            int itrackX = incrButtonX + THUMB_DELTA;
            int itrackW = sbSize.width - itrackX - 2 * THUMB_DELTA;
            this.trackRect.setBounds(itrackX, itemY, itrackW, itemH);
        }

        /*
         * Make sure the thumb fits between the buttons. Note that setting the thumbs bounds causes
         * a repaint.
         */
        if (thumbW >= (int) trackW) {
            this.setThumbBounds(0, 0, 0, 0);
        } else {
            if (ltr) {
                if (thumbX + thumbW > incrButtonX) {
                    thumbX = incrButtonX - thumbW;
                }
                if (thumbX < 0) {
                    thumbX = 1;
                }
            } else {
                if (thumbX + thumbW > (sbSize.width - sbInsets.left)) {
                    thumbX = sbSize.width - sbInsets.left - thumbW;
                }
                // if (thumbX < (incrButtonX + decrButton2W)) {
                // thumbX = incrButtonX + decrButton2W + 1;
                // }
            }
            this.setThumbBounds(thumbX, itemY, thumbW, itemH);
        }
    }

    @Override
    protected TrackListener createTrackListener() {
        return new RadianceTrackListener();
    }

    /**
     * Track mouse drags. Had to take this one from BasicScrollBarUI since the setValueForm method
     * is private.
     */
    protected class RadianceTrackListener extends TrackListener {
        /**
         * Current scroll direction.
         */
        private transient int direction = +1;

        @Override
        public void mouseReleased(MouseEvent e) {
            if (RadianceScrollBarUI.this.isDragging) {
                RadianceScrollBarUI.this.updateThumbState(e.getX(), e.getY());
            }
            if (SwingUtilities.isRightMouseButton(e)
                    || (!RadianceScrollBarUI.this.getSupportsAbsolutePositioning()
                    && SwingUtilities.isMiddleMouseButton(e)))
                return;
            if (!RadianceScrollBarUI.this.scrollbar.isEnabled())
                return;

            Rectangle r = RadianceScrollBarUI.this.getTrackBounds();
            RadianceScrollBarUI.this.scrollbar.repaint(r.x, r.y, r.width, r.height);

            RadianceScrollBarUI.this.trackHighlight = NO_HIGHLIGHT;
            RadianceScrollBarUI.this.isDragging = false;
            this.offset = 0;
            RadianceScrollBarUI.this.scrollTimer.stop();
            RadianceScrollBarUI.this.scrollbar.setValueIsAdjusting(false);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // If the mouse is pressed above the "thumb" component then reduce
            // the scrollbars value by one page ("page up"), otherwise increase
            // it by one page. If there is no thumb then page up if the mouse is
            // in the upper half of the track.
            if (SwingUtilities.isRightMouseButton(e)
                    || (!RadianceScrollBarUI.this.getSupportsAbsolutePositioning()
                    && SwingUtilities.isMiddleMouseButton(e)))
                return;
            if (!RadianceScrollBarUI.this.scrollbar.isEnabled())
                return;

            if (!RadianceScrollBarUI.this.scrollbar.hasFocus()
                    && RadianceScrollBarUI.this.scrollbar.isRequestFocusEnabled()) {
                RadianceScrollBarUI.this.scrollbar.requestFocus();
            }

            RadianceScrollBarUI.this.scrollbar.setValueIsAdjusting(true);

            this.currentMouseX = e.getX();
            this.currentMouseY = e.getY();

            // Clicked in the Thumb area?
            if (RadianceScrollBarUI.this.getThumbBounds().contains(this.currentMouseX,
                    this.currentMouseY)) {
                switch (RadianceScrollBarUI.this.scrollbar.getOrientation()) {
                    case JScrollBar.VERTICAL:
                        this.offset = this.currentMouseY
                                - RadianceScrollBarUI.this.getThumbBounds().y;
                        break;
                    case JScrollBar.HORIZONTAL:
                        this.offset = this.currentMouseX
                                - RadianceScrollBarUI.this.getThumbBounds().x;
                        break;
                }
                RadianceScrollBarUI.this.isDragging = true;
                return;
            } else if (RadianceScrollBarUI.this.getSupportsAbsolutePositioning()
                    && SwingUtilities.isMiddleMouseButton(e)) {
                switch (RadianceScrollBarUI.this.scrollbar.getOrientation()) {
                    case JScrollBar.VERTICAL:
                        this.offset = RadianceScrollBarUI.this.getThumbBounds().height / 2;
                        break;
                    case JScrollBar.HORIZONTAL:
                        this.offset = RadianceScrollBarUI.this.getThumbBounds().width / 2;
                        break;
                }
                RadianceScrollBarUI.this.isDragging = true;
                this.setValueFrom(e);
                return;
            }
            RadianceScrollBarUI.this.isDragging = false;

            Dimension sbSize = RadianceScrollBarUI.this.scrollbar.getSize();
            this.direction = +1;

            switch (RadianceScrollBarUI.this.scrollbar.getOrientation()) {
                case JScrollBar.VERTICAL:
                    if (RadianceScrollBarUI.this.getThumbBounds().isEmpty()) {
                        int scrollbarCenter = sbSize.height / 2;
                        this.direction = (this.currentMouseY < scrollbarCenter) ? -1 : +1;
                    } else {
                        int thumbY = RadianceScrollBarUI.this.getThumbBounds().y;
                        this.direction = (this.currentMouseY < thumbY) ? -1 : +1;
                    }
                    break;
                case JScrollBar.HORIZONTAL:
                    if (RadianceScrollBarUI.this.getThumbBounds().isEmpty()) {
                        int scrollbarCenter = sbSize.width / 2;
                        this.direction = (this.currentMouseX < scrollbarCenter) ? -1 : +1;
                    } else {
                        int thumbX = RadianceScrollBarUI.this.getThumbBounds().x;
                        this.direction = (this.currentMouseX < thumbX) ? -1 : +1;
                    }
                    if (!RadianceScrollBarUI.this.scrollbar.getComponentOrientation()
                            .isLeftToRight()) {
                        this.direction = -this.direction;
                    }
                    break;
            }
            RadianceScrollBarUI.this.scrollByBlock(this.direction);

            RadianceScrollBarUI.this.scrollTimer.stop();
            RadianceScrollBarUI.this.scrollListener.setDirection(this.direction);
            RadianceScrollBarUI.this.scrollListener.setScrollByBlock(true);
            this.startScrollTimerIfNecessary();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            // Set the models value to the position of the thumb's top of
            // Vertical scrollbar, or the left/right of Horizontal scrollbar in
            // LTR / RTL scrollbar relative to the origin of
            // the track.
            if (SwingUtilities.isRightMouseButton(e)
                    || (!RadianceScrollBarUI.this.getSupportsAbsolutePositioning()
                    && SwingUtilities.isMiddleMouseButton(e)))
                return;
            if (!RadianceScrollBarUI.this.scrollbar.isEnabled()
                    || RadianceScrollBarUI.this.getThumbBounds().isEmpty()) {
                return;
            }
            if (RadianceScrollBarUI.this.isDragging) {
                this.setValueFrom(e);
            } else {
                this.currentMouseX = e.getX();
                this.currentMouseY = e.getY();
                RadianceScrollBarUI.this.updateThumbState(this.currentMouseX, this.currentMouseY);
                this.startScrollTimerIfNecessary();
            }
        }

        /**
         * Sets the scrollbar value based on the specified mouse event.
         *
         * @param e Mouse event.
         */
        private void setValueFrom(MouseEvent e) {
            boolean active = RadianceScrollBarUI.this.isThumbRollover();
            BoundedRangeModel model = RadianceScrollBarUI.this.scrollbar.getModel();
            Rectangle thumbR = RadianceScrollBarUI.this.getThumbBounds();
            int thumbMin = 0, thumbMax = 0, thumbPos;

            if (RadianceScrollBarUI.this.scrollbar.getOrientation() == JScrollBar.VERTICAL) {
                thumbMin = THUMB_DELTA;
                thumbMax = RadianceScrollBarUI.this.scrollbar.getSize().height
                        - RadianceScrollBarUI.this.scrollbar.getInsets().bottom - thumbR.height
                        - THUMB_DELTA;

                thumbPos = Math.min(thumbMax, Math.max(thumbMin, (e.getY() - this.offset)));
                RadianceScrollBarUI.this.setThumbBounds(thumbR.x, thumbPos, thumbR.width,
                        thumbR.height);
            } else {
                thumbMin = THUMB_DELTA;
                thumbMax = RadianceScrollBarUI.this.scrollbar.getSize().width
                        - RadianceScrollBarUI.this.scrollbar.getInsets().right - thumbR.width
                        - THUMB_DELTA;
                // System.out.println(thumbMin + " : " + thumbMax + " : "
                // + (e.getX() - offset));
                thumbPos = Math.min(thumbMax, Math.max(thumbMin, (e.getX() - this.offset)));
                RadianceScrollBarUI.this.setThumbBounds(thumbPos, thumbR.y, thumbR.width,
                        thumbR.height);
            }

            /*
             * Set the scrollbars value. If the thumb has reached the end of the scrollbar, then
             * just set the value to its maximum. Otherwise compute the value as accurately as
             * possible.
             */
            if (thumbPos == thumbMax) {
                if (RadianceScrollBarUI.this.scrollbar.getOrientation() == JScrollBar.VERTICAL
                        || RadianceScrollBarUI.this.scrollbar.getComponentOrientation()
                        .isLeftToRight()) {
                    RadianceScrollBarUI.this.scrollbar
                            .setValue(model.getMaximum() - model.getExtent());
                } else {
                    RadianceScrollBarUI.this.scrollbar.setValue(model.getMinimum());
                }
            } else {
                float valueMax = model.getMaximum() - model.getExtent();
                float valueRange = valueMax - model.getMinimum();
                float thumbValue = thumbPos - thumbMin;
                float thumbRange = thumbMax - thumbMin;
                int value;
                if (RadianceScrollBarUI.this.scrollbar.getOrientation() == JScrollBar.VERTICAL
                        || RadianceScrollBarUI.this.scrollbar.getComponentOrientation()
                        .isLeftToRight()) {
                    value = (int) (0.5 + ((thumbValue / thumbRange) * valueRange));
                } else {
                    value = (int) (0.5 + (((thumbMax - thumbPos) / thumbRange) * valueRange));
                }

                RadianceScrollBarUI.this.scrollbar.setValue(value + model.getMinimum());
            }
            RadianceScrollBarUI.this.setThumbRollover(active);
        }

        /**
         * If necessary, starts the scroll timer.
         */
        private void startScrollTimerIfNecessary() {
            if (RadianceScrollBarUI.this.scrollTimer.isRunning()) {
                return;
            }
            switch (RadianceScrollBarUI.this.scrollbar.getOrientation()) {
                case JScrollBar.VERTICAL:
                    if (this.direction > 0) {
                        if (RadianceScrollBarUI.this.getThumbBounds().y + RadianceScrollBarUI.this
                                .getThumbBounds().height < ((RadianceTrackListener) RadianceScrollBarUI.this.trackListener).currentMouseY) {
                            RadianceScrollBarUI.this.scrollTimer.start();
                        }
                    } else if (RadianceScrollBarUI.this
                            .getThumbBounds().y > ((RadianceTrackListener) RadianceScrollBarUI.this.trackListener).currentMouseY) {
                        RadianceScrollBarUI.this.scrollTimer.start();
                    }
                    break;
                case JScrollBar.HORIZONTAL:
                    if (this.direction > 0) {
                        if (RadianceScrollBarUI.this.getThumbBounds().x + RadianceScrollBarUI.this
                                .getThumbBounds().width < ((RadianceTrackListener) RadianceScrollBarUI.this.trackListener).currentMouseX) {
                            RadianceScrollBarUI.this.scrollTimer.start();
                        }
                    } else if (RadianceScrollBarUI.this
                            .getThumbBounds().x > ((RadianceTrackListener) RadianceScrollBarUI.this.trackListener).currentMouseX) {
                        RadianceScrollBarUI.this.scrollTimer.start();
                    }
                    break;
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            if (!RadianceScrollBarUI.this.isDragging) {
                RadianceScrollBarUI.this.updateThumbState(e.getX(), e.getY());
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!RadianceScrollBarUI.this.isDragging) {
                RadianceScrollBarUI.this.setThumbRollover(false);
            }
        }
    }

    @Override
    protected ArrowButtonListener createArrowButtonListener() {
        return null;
    }

    /**
     * Updates the thumb state based on the coordinates.
     *
     * @param x X coordinate.
     * @param y Y coordinate.
     */
    private void updateThumbState(int x, int y) {
        Rectangle rect = this.getThumbBounds();

        this.setThumbRollover(rect.contains(x, y));
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            return new Dimension(scrollBarWidth, Math.max(48, 5 * scrollBarWidth));
        } else {
            return new Dimension(Math.max(48, 5 * scrollBarWidth), scrollBarWidth);
        }
    }

    @Override
    public void update(Graphics g, JComponent c) {
        super.update(g, c);
        GhostPaintingUtils.paintGhostImages(c, g);
    }
}
