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
package org.pushingpixels.substance.internal.ui;

import java.awt.Adjustable;
import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Map;
import java.util.Set;

import javax.swing.BoundedRangeModel;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicScrollBarUI;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.internal.SubstanceWidgetRepository;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.RolloverControlListener;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceOutlineUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;

/**
 * UI for scroll bars in <b>Substance </b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceScrollBarUI extends BasicScrollBarUI implements TransitionAwareUI {
    /**
     * Surrogate button model for tracking the thumb transitions.
     */
    private ButtonModel thumbModel;

    /**
     * Stores computed images for vertical thumbs.
     */
    private static LazyResettableHashMap<BufferedImage> thumbVerticalMap = new LazyResettableHashMap<BufferedImage>(
            "SubstanceScrollBarUI.thumbVertical");

    /**
     * Stores computed images for horizontal thumbs.
     */
    private static LazyResettableHashMap<BufferedImage> thumbHorizontalMap = new LazyResettableHashMap<BufferedImage>(
            "SubstanceScrollBarUI.thumbHorizontal");

    /**
     * Listener for thumb transition animations.
     */
    private RolloverControlListener substanceThumbRolloverListener;

    protected StateTransitionTracker compositeStateTransitionTracker;

    /**
     * Property change listener.
     * 
     */
    private PropertyChangeListener substancePropertyListener;

    /**
     * Scroll bar width.
     */
    protected int scrollBarWidth;

    /**
     * Listener on adjustments made to the scrollbar model - this is for the overlay mode (see
     * {@link SubstanceLookAndFeel#OVERLAY_PROPERTY} and repaiting both scrollbars with the
     * viewport.
     * 
     * @since version 3.2
     */
    protected AdjustmentListener substanceAdjustmentListener;

    private Set<SubstanceWidget> lafWidgets;

    private static int THUMB_DELTA = 2;

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
     */
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceScrollBarUI(comp);
    }

    /**
     * Simple constructor.
     * 
     * @param b
     *            Associated component.
     */
    protected SubstanceScrollBarUI(JComponent b) {
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
        this.lafWidgets = SubstanceWidgetRepository.getRepository().getMatchingWidgets(c);

        super.installUI(c);

        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.installUI();
        }
    }

    @Override
    public void uninstallUI(JComponent c) {
        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.uninstallUI();
        }
        super.uninstallUI(c);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#createDecreaseButton(int)
     */
    @Override
    protected JButton createDecreaseButton(int orientation) {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#createIncreaseButton(int)
     */
    @Override
    protected JButton createIncreaseButton(int orientation) {
        return null;
    }

    /**
     * Retrieves image for vertical thumb.
     * 
     * @param thumbBounds
     *            Thumb bounding rectangle.
     * @return Image for vertical thumb.
     */
    private BufferedImage getThumbVertical(Rectangle thumbBounds) {
        int width = Math.max(1, thumbBounds.width);
        int delta = Math.max(0, (int) (0.4 * width));
        if (delta % 2 == 1) {
            delta--;
        }
        width -= delta;

        int height = Math.max(1, thumbBounds.height);

        StateTransitionTracker.ModelStateInfo modelStateInfo = this.compositeStateTransitionTracker
                .getModelStateInfo();
        ComponentState currState = modelStateInfo.getCurrModelState();

        // enabled scroll bar is always painted as active
        SubstanceColorScheme baseFillScheme = (currState != ComponentState.ENABLED)
                ? SubstanceColorSchemeUtilities.getColorScheme(this.scrollbar, currState)
                : SubstanceColorSchemeUtilities.getActiveColorScheme(this.scrollbar, currState);
        SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities
                .getColorScheme(this.scrollbar, ColorSchemeAssociationKind.BORDER, currState);
        BufferedImage baseLayer = getThumbVertical(this.scrollbar, width, height, baseFillScheme,
                baseBorderScheme);

        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();
        if (currState.isDisabled() || (activeStates.size() == 1)) {
            return baseLayer;
        }

        BufferedImage result = SubstanceCoreUtilities.getBlankUnscaledImage(baseLayer);
        Graphics2D g2d = result.createGraphics();
        g2d.drawImage(baseLayer, 0, 0, baseLayer.getWidth(), baseLayer.getHeight(), null);

        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                .entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            if (activeState == modelStateInfo.getCurrModelState())
                continue;

            float contribution = activeEntry.getValue().getContribution();
            if (contribution == 0.0f)
                continue;

            g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));

            SubstanceColorScheme fillScheme = (activeState != ComponentState.ENABLED)
                    ? SubstanceColorSchemeUtilities.getColorScheme(this.scrollbar, activeState)
                    : SubstanceColorSchemeUtilities.getActiveColorScheme(this.scrollbar,
                            activeState);
            SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(this.scrollbar, ColorSchemeAssociationKind.BORDER, activeState);
            BufferedImage layer = getThumbVertical(this.scrollbar, width, height, fillScheme,
                    borderScheme);
            g2d.drawImage(layer, 0, 0, layer.getWidth(), layer.getHeight(), null);
        }

        g2d.dispose();
        return result;
    }

    /**
     * Retrieves image for vertical thumb.
     * 
     * @param scrollBar
     *            Scroll bar.
     * @param width
     *            Thumb width.
     * @param height
     *            Thumb height.
     * @param kind
     *            Color scheme kind.
     * @param cyclePos
     *            Cycle position.
     * @param scheme
     *            The first color scheme.
     * @param scheme2
     *            The second color scheme.
     * @param borderScheme
     *            The first border color scheme.
     * @param borderScheme2
     *            The second border color scheme.
     * @return Image for vertical thumb.
     */
    private static BufferedImage getThumbVertical(JScrollBar scrollBar, int width, int height,
            SubstanceColorScheme scheme, SubstanceColorScheme borderScheme) {
        SubstanceFillPainter painter = SubstanceCoreUtilities.getFillPainter(scrollBar);
        SubstanceButtonShaper shaper = SubstanceCoreUtilities.getButtonShaper(scrollBar);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(scrollBar);
        HashMapKey key = SubstanceCoreUtilities.getHashKey(width, height, scheme.getDisplayName(),
                borderScheme.getDisplayName(), painter.getDisplayName(), shaper.getDisplayName(),
                borderPainter.getDisplayName());
        BufferedImage result = SubstanceScrollBarUI.thumbVerticalMap.get(key);
        if (result == null) {
            // System.out.println("Cache miss - computing");
            // System.out.println("New image for vertical thumb");
            float radius = width / 2;

            float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;
            GeneralPath contour = SubstanceOutlineUtilities.getBaseOutline(height, width, radius,
                    null, borderDelta);

            result = SubstanceCoreUtilities.getBlankImage(height, width);
            painter.paintContourBackground(result.createGraphics(), scrollBar, height, width,
                    contour, false, scheme, true);

            borderPainter.paintBorder(result.getGraphics(), scrollBar, height, width, contour, null,
                    borderScheme);
            result = SubstanceImageCreator.getRotated(result, 3, false);
            // System.out.println(key);
            SubstanceScrollBarUI.thumbVerticalMap.put(key, result);
        }

        return result;
    }

    /**
     * Retrieves image for horizontal thumb.
     * 
     * @param thumbBounds
     *            Thumb bounding rectangle.
     * @return Image for horizontal thumb.
     */
    private BufferedImage getThumbHorizontal(Rectangle thumbBounds) {
        int width = Math.max(1, thumbBounds.width);
        int height = Math.max(1, thumbBounds.height);
        int delta = Math.max(0, (int) (0.4 * height));
        if (delta % 2 == 1) {
            delta--;
        }
        height -= delta;

        StateTransitionTracker.ModelStateInfo modelStateInfo = this.compositeStateTransitionTracker
                .getModelStateInfo();
        ComponentState currState = modelStateInfo.getCurrModelState();

        SubstanceColorScheme baseFillScheme = (currState != ComponentState.ENABLED)
                ? SubstanceColorSchemeUtilities.getColorScheme(this.scrollbar, currState)
                : SubstanceColorSchemeUtilities.getActiveColorScheme(this.scrollbar, currState);
        SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities
                .getColorScheme(this.scrollbar, ColorSchemeAssociationKind.BORDER, currState);
        BufferedImage baseLayer = getThumbHorizontal(this.scrollbar, width, height, baseFillScheme,
                baseBorderScheme);

        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();
        if (currState.isDisabled() || (activeStates.size() == 1)) {
            return baseLayer;
        }

        BufferedImage result = SubstanceCoreUtilities.getBlankUnscaledImage(baseLayer);
        Graphics2D g2d = result.createGraphics();
        g2d.drawImage(baseLayer, 0, 0, baseLayer.getWidth(), baseLayer.getHeight(), null);

        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                .entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            if (activeState == modelStateInfo.getCurrModelState())
                continue;
            // if (activeState == ComponentState.ENABLED)
            // activeState = ComponentState.SELECTED;

            float contribution = activeEntry.getValue().getContribution();
            if (contribution == 0.0f)
                continue;

            g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));

            SubstanceColorScheme fillScheme = (activeState != ComponentState.ENABLED)
                    ? SubstanceColorSchemeUtilities.getColorScheme(this.scrollbar, activeState)
                    : SubstanceColorSchemeUtilities.getActiveColorScheme(this.scrollbar,
                            activeState);
            SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(this.scrollbar, ColorSchemeAssociationKind.BORDER, activeState);
            BufferedImage layer = getThumbHorizontal(this.scrollbar, width, height, fillScheme,
                    borderScheme);
            g2d.drawImage(layer, 0, 0, layer.getWidth(), layer.getHeight(), null);
        }

        g2d.dispose();
        return result;
    }

    /**
     * Retrieves image for horizontal thumb.
     * 
     * @param scrollBar
     *            Scroll bar.
     * @param width
     *            Thumb width.
     * @param height
     *            Thumb height.
     * @param kind
     *            Color scheme kind.
     * @param cyclePos
     *            Cycle position.
     * @param scheme
     *            The first color scheme.
     * @param scheme2
     *            The second color scheme.
     * @param borderScheme
     *            The first border color scheme.
     * @param borderScheme2
     *            The second border color scheme.
     * @return Image for horizontal thumb.
     */
    private static BufferedImage getThumbHorizontal(JScrollBar scrollBar, int width, int height,
            SubstanceColorScheme scheme, SubstanceColorScheme borderScheme) {
        SubstanceFillPainter painter = SubstanceCoreUtilities.getFillPainter(scrollBar);
        SubstanceButtonShaper shaper = SubstanceCoreUtilities.getButtonShaper(scrollBar);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(scrollBar);
        HashMapKey key = SubstanceCoreUtilities.getHashKey(width, height, scheme.getDisplayName(),
                borderScheme.getDisplayName(), painter.getDisplayName(), shaper.getDisplayName(),
                borderPainter.getDisplayName());

        float radius = height / 2;
        float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;
        GeneralPath contour = SubstanceOutlineUtilities.getBaseOutline(width, height, radius, null,
                borderDelta);
        BufferedImage opaque = SubstanceScrollBarUI.thumbHorizontalMap.get(key);
        if (opaque == null) {
            // System.out.println("New image for horizontal thumb");

            opaque = SubstanceCoreUtilities.getBlankImage(width, height);
            painter.paintContourBackground(opaque.createGraphics(), scrollBar, width, height,
                    contour, false, scheme, true);

            borderPainter.paintBorder(opaque.getGraphics(), scrollBar, width, height, contour, null,
                    borderScheme);
            SubstanceScrollBarUI.thumbHorizontalMap.put(key, opaque);
        }

        return opaque;
    }

    /**
     * Returns the scroll button state.
     * 
     * @param scrollButton
     *            Scroll button.
     * @return Scroll button state.
     */
    protected ComponentState getState(JButton scrollButton) {
        if (scrollButton == null)
            return null;

        ComponentState result = ((TransitionAwareUI) scrollButton.getUI()).getTransitionTracker()
                .getModelStateInfo().getCurrModelState();
        if ((result == ComponentState.ENABLED)
                && SubstanceCoreUtilities.hasFlatAppearance(this.scrollbar, false)) {
            result = null;
        }
        if (SubstanceCoreUtilities.isButtonNeverPainted(scrollButton)) {
            result = null;
        }
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#paintTrack(java.awt.Graphics,
     * javax.swing.JComponent, java.awt.Rectangle)
     */
    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        Graphics2D graphics = (Graphics2D) g.create();

        if (this.scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            graphics.translate(trackBounds.x, trackBounds.y - THUMB_DELTA);
        } else {
            graphics.translate(trackBounds.x - THUMB_DELTA, trackBounds.y);
        }
        graphics.setColor(SubstanceColorUtilities.getBackgroundFillColorScrollBar(this.scrollbar));
        // graphics.setColor(Color.red);
        graphics.fillRect(0, 0, this.scrollbar.getWidth(), this.scrollbar.getHeight());
        GhostPaintingUtils.paintGhostImages(this.scrollbar, g);

        graphics.dispose();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#paintThumb(java.awt.Graphics,
     * javax.swing.JComponent, java.awt.Rectangle)
     */
    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        // System.out.println("Thumb");
        Graphics2D graphics = (Graphics2D) g.create();

        this.thumbModel.setSelected(this.thumbModel.isSelected() || this.isDragging);
        this.thumbModel.setEnabled(c.isEnabled());
        double scaleFactor = UIUtil.getScaleFactor();
        boolean isVertical = (this.scrollbar.getOrientation() == Adjustable.VERTICAL);
        if (isVertical) {
            Rectangle adjustedBounds = new Rectangle(thumbBounds.x, thumbBounds.y,
                    thumbBounds.width, thumbBounds.height);
            BufferedImage thumbImage = this.getThumbVertical(adjustedBounds);
            int xdelta = (thumbBounds.width - (int) (thumbImage.getWidth() / scaleFactor)) / 2;
            graphics.drawImage(thumbImage, adjustedBounds.x + xdelta, adjustedBounds.y,
                    (int) (thumbImage.getWidth() / scaleFactor),
                    (int) (thumbImage.getHeight() / scaleFactor), null);
        } else {
            Rectangle adjustedBounds = new Rectangle(thumbBounds.x, thumbBounds.y,
                    thumbBounds.width, thumbBounds.height);
            BufferedImage thumbImage = this.getThumbHorizontal(adjustedBounds);
            int ydelta = (thumbBounds.height - (int) (thumbImage.getHeight() / scaleFactor)) / 2;
            graphics.drawImage(thumbImage, adjustedBounds.x, adjustedBounds.y + ydelta,
                    (int) (thumbImage.getWidth() / scaleFactor),
                    (int) (thumbImage.getHeight() / scaleFactor), null);
        }
        graphics.dispose();
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D graphics = (Graphics2D) g.create();
        BackgroundPaintingUtils.update(graphics, c, false);
        float alpha = SubstanceColorSchemeUtilities.getAlpha(this.scrollbar,
                ComponentState.getState(this.thumbModel, this.scrollbar));
        graphics.setComposite(WidgetUtilities.getAlphaComposite(c, alpha, g));
        super.paint(graphics, c);
        graphics.dispose();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#installDefaults()
     */
    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.scrollBarWidth = SubstanceSizeUtils
                .getScrollBarWidth(SubstanceSizeUtils.getComponentFontSize(this.scrollbar));

        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.installDefaults();
        }
    }

    @Override
    protected void uninstallDefaults() {
        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.uninstallDefaults();
        }

        super.uninstallDefaults();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#installComponents()
     */
    @Override
    protected void installComponents() {
        this.compositeStateTransitionTracker = new StateTransitionTracker(this.scrollbar,
                this.thumbModel);
        this.compositeStateTransitionTracker.registerModelListeners();

        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.installComponents();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#uninstallComponents()
     */
    @Override
    protected void uninstallComponents() {
        this.compositeStateTransitionTracker.unregisterModelListeners();

        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.uninstallComponents();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#installListeners()
     */
    @Override
    protected void installListeners() {
        super.installListeners();

        this.substanceThumbRolloverListener = new RolloverControlListener(this, this.thumbModel);
        this.scrollbar.addMouseListener(this.substanceThumbRolloverListener);
        this.scrollbar.addMouseMotionListener(this.substanceThumbRolloverListener);

        this.substancePropertyListener = (PropertyChangeEvent evt) -> {
            if ("font".equals(evt.getPropertyName())) {
                SwingUtilities.invokeLater(() -> scrollbar.updateUI());
            }
        };
        this.scrollbar.addPropertyChangeListener(this.substancePropertyListener);

        this.substanceAdjustmentListener = (AdjustmentEvent e) -> {
            SubstanceCoreUtilities.testComponentStateChangeThreadingViolation(scrollbar);
            Component parent = SubstanceScrollBarUI.this.scrollbar.getParent();
            if (parent instanceof JScrollPane) {
                JScrollPane jsp = (JScrollPane) parent;
                JScrollBar hor = jsp.getHorizontalScrollBar();
                JScrollBar ver = jsp.getVerticalScrollBar();

                JScrollBar other = null;
                if (SubstanceScrollBarUI.this.scrollbar == hor) {
                    other = ver;
                }
                if (SubstanceScrollBarUI.this.scrollbar == ver) {
                    other = hor;
                }

                if ((other != null) && other.isVisible())
                    other.repaint();
                SubstanceScrollBarUI.this.scrollbar.repaint();
            }
        };
        this.scrollbar.addAdjustmentListener(this.substanceAdjustmentListener);

        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.installListeners();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#uninstallListeners()
     */
    @Override
    protected void uninstallListeners() {
        this.scrollbar.removeMouseListener(this.substanceThumbRolloverListener);
        this.scrollbar.removeMouseMotionListener(this.substanceThumbRolloverListener);
        this.substanceThumbRolloverListener = null;

        this.scrollbar.removePropertyChangeListener(this.substancePropertyListener);
        this.substancePropertyListener = null;

        this.scrollbar.removeAdjustmentListener(this.substanceAdjustmentListener);
        this.substanceAdjustmentListener = null;

        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.uninstallListeners();
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

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#scrollByBlock(int)
     */
    @Override
    public void scrollByBlock(int direction) {
        // This method is called from SubstanceScrollPaneUI to implement wheel
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
     * @param direction
     *            Direction.
     * @param units
     *            Scroll units.
     */
    public void scrollByUnits(int direction, int units) {
        // This method is called from SubstanceScrollPaneUI to implement wheel
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

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#layoutVScrollbar(javax.swing. JScrollBar)
     */
    @Override
    protected void layoutVScrollbar(JScrollBar sb) {
        this.layoutVScrollbarNone(sb);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#layoutHScrollbar(javax.swing. JScrollBar)
     */
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

    /**
     * Returns the memory usage string.
     * 
     * @return The memory usage string.
     */
    public static String getMemoryUsage() {
        StringBuffer sb = new StringBuffer();
        sb.append("SubstanceScrollBarUI: \n");
        sb.append("\t" + thumbHorizontalMap.size() + " thumb horizontal, " + thumbVerticalMap.size()
                + " thumb vertical");
        return sb.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#createTrackListener()
     */
    @Override
    protected TrackListener createTrackListener() {
        return new SubstanceTrackListener();
    }

    /**
     * Track mouse drags. Had to take this one from BasicScrollBarUI since the setValueForm method
     * is private.
     */
    protected class SubstanceTrackListener extends TrackListener {
        /**
         * Current scroll direction.
         */
        private transient int direction = +1;

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.plaf.basic.BasicScrollBarUI$TrackListener#mouseReleased
         * (java.awt.event.MouseEvent)
         */
        @Override
        public void mouseReleased(MouseEvent e) {
            if (SubstanceScrollBarUI.this.isDragging) {
                SubstanceScrollBarUI.this.updateThumbState(e.getX(), e.getY());
            }
            if (SwingUtilities.isRightMouseButton(e)
                    || (!SubstanceScrollBarUI.this.getSupportsAbsolutePositioning()
                            && SwingUtilities.isMiddleMouseButton(e)))
                return;
            if (!SubstanceScrollBarUI.this.scrollbar.isEnabled())
                return;

            Rectangle r = SubstanceScrollBarUI.this.getTrackBounds();
            SubstanceScrollBarUI.this.scrollbar.repaint(r.x, r.y, r.width, r.height);

            SubstanceScrollBarUI.this.trackHighlight = NO_HIGHLIGHT;
            SubstanceScrollBarUI.this.isDragging = false;
            this.offset = 0;
            SubstanceScrollBarUI.this.scrollTimer.stop();
            SubstanceScrollBarUI.this.scrollbar.setValueIsAdjusting(false);
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.plaf.basic.BasicScrollBarUI$TrackListener#mousePressed
         * (java.awt.event.MouseEvent)
         */
        @Override
        public void mousePressed(MouseEvent e) {
            // If the mouse is pressed above the "thumb" component then reduce
            // the scrollbars value by one page ("page up"), otherwise increase
            // it by one page. If there is no thumb then page up if the mouse is
            // in the upper half of the track.
            if (SwingUtilities.isRightMouseButton(e)
                    || (!SubstanceScrollBarUI.this.getSupportsAbsolutePositioning()
                            && SwingUtilities.isMiddleMouseButton(e)))
                return;
            if (!SubstanceScrollBarUI.this.scrollbar.isEnabled())
                return;

            if (!SubstanceScrollBarUI.this.scrollbar.hasFocus()
                    && SubstanceScrollBarUI.this.scrollbar.isRequestFocusEnabled()) {
                SubstanceScrollBarUI.this.scrollbar.requestFocus();
            }

            SubstanceScrollBarUI.this.scrollbar.setValueIsAdjusting(true);

            this.currentMouseX = e.getX();
            this.currentMouseY = e.getY();

            // Clicked in the Thumb area?
            if (SubstanceScrollBarUI.this.getThumbBounds().contains(this.currentMouseX,
                    this.currentMouseY)) {
                switch (SubstanceScrollBarUI.this.scrollbar.getOrientation()) {
                    case JScrollBar.VERTICAL:
                        this.offset = this.currentMouseY
                                - SubstanceScrollBarUI.this.getThumbBounds().y;
                        break;
                    case JScrollBar.HORIZONTAL:
                        this.offset = this.currentMouseX
                                - SubstanceScrollBarUI.this.getThumbBounds().x;
                        break;
                }
                SubstanceScrollBarUI.this.isDragging = true;
                return;
            } else if (SubstanceScrollBarUI.this.getSupportsAbsolutePositioning()
                    && SwingUtilities.isMiddleMouseButton(e)) {
                switch (SubstanceScrollBarUI.this.scrollbar.getOrientation()) {
                    case JScrollBar.VERTICAL:
                        this.offset = SubstanceScrollBarUI.this.getThumbBounds().height / 2;
                        break;
                    case JScrollBar.HORIZONTAL:
                        this.offset = SubstanceScrollBarUI.this.getThumbBounds().width / 2;
                        break;
                }
                SubstanceScrollBarUI.this.isDragging = true;
                this.setValueFrom(e);
                return;
            }
            SubstanceScrollBarUI.this.isDragging = false;

            Dimension sbSize = SubstanceScrollBarUI.this.scrollbar.getSize();
            this.direction = +1;

            switch (SubstanceScrollBarUI.this.scrollbar.getOrientation()) {
                case JScrollBar.VERTICAL:
                    if (SubstanceScrollBarUI.this.getThumbBounds().isEmpty()) {
                        int scrollbarCenter = sbSize.height / 2;
                        this.direction = (this.currentMouseY < scrollbarCenter) ? -1 : +1;
                    } else {
                        int thumbY = SubstanceScrollBarUI.this.getThumbBounds().y;
                        this.direction = (this.currentMouseY < thumbY) ? -1 : +1;
                    }
                    break;
                case JScrollBar.HORIZONTAL:
                    if (SubstanceScrollBarUI.this.getThumbBounds().isEmpty()) {
                        int scrollbarCenter = sbSize.width / 2;
                        this.direction = (this.currentMouseX < scrollbarCenter) ? -1 : +1;
                    } else {
                        int thumbX = SubstanceScrollBarUI.this.getThumbBounds().x;
                        this.direction = (this.currentMouseX < thumbX) ? -1 : +1;
                    }
                    if (!SubstanceScrollBarUI.this.scrollbar.getComponentOrientation()
                            .isLeftToRight()) {
                        this.direction = -this.direction;
                    }
                    break;
            }
            SubstanceScrollBarUI.this.scrollByBlock(this.direction);

            SubstanceScrollBarUI.this.scrollTimer.stop();
            SubstanceScrollBarUI.this.scrollListener.setDirection(this.direction);
            SubstanceScrollBarUI.this.scrollListener.setScrollByBlock(true);
            this.startScrollTimerIfNecessary();
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.plaf.basic.BasicScrollBarUI$TrackListener#mouseDragged
         * (java.awt.event.MouseEvent)
         */
        @Override
        public void mouseDragged(MouseEvent e) {
            // Set the models value to the position of the thumb's top of
            // Vertical scrollbar, or the left/right of Horizontal scrollbar in
            // LTR / RTL scrollbar relative to the origin of
            // the track.
            if (SwingUtilities.isRightMouseButton(e)
                    || (!SubstanceScrollBarUI.this.getSupportsAbsolutePositioning()
                            && SwingUtilities.isMiddleMouseButton(e)))
                return;
            if (!SubstanceScrollBarUI.this.scrollbar.isEnabled()
                    || SubstanceScrollBarUI.this.getThumbBounds().isEmpty()) {
                return;
            }
            if (SubstanceScrollBarUI.this.isDragging) {
                this.setValueFrom(e);
            } else {
                this.currentMouseX = e.getX();
                this.currentMouseY = e.getY();
                SubstanceScrollBarUI.this.updateThumbState(this.currentMouseX, this.currentMouseY);
                this.startScrollTimerIfNecessary();
            }
        }

        /**
         * Sets the scrollbar value based on the specified mouse event.
         * 
         * @param e
         *            Mouse event.
         */
        private void setValueFrom(MouseEvent e) {
            boolean active = SubstanceScrollBarUI.this.isThumbRollover();
            BoundedRangeModel model = SubstanceScrollBarUI.this.scrollbar.getModel();
            Rectangle thumbR = SubstanceScrollBarUI.this.getThumbBounds();
            int thumbMin = 0, thumbMax = 0, thumbPos;

            if (SubstanceScrollBarUI.this.scrollbar.getOrientation() == JScrollBar.VERTICAL) {
                thumbMin = THUMB_DELTA;
                thumbMax = SubstanceScrollBarUI.this.scrollbar.getSize().height
                        - SubstanceScrollBarUI.this.scrollbar.getInsets().bottom - thumbR.height
                        - THUMB_DELTA;

                thumbPos = Math.min(thumbMax, Math.max(thumbMin, (e.getY() - this.offset)));
                SubstanceScrollBarUI.this.setThumbBounds(thumbR.x, thumbPos, thumbR.width,
                        thumbR.height);
            } else {
                thumbMin = THUMB_DELTA;
                thumbMax = SubstanceScrollBarUI.this.scrollbar.getSize().width
                        - SubstanceScrollBarUI.this.scrollbar.getInsets().right - thumbR.width
                        - THUMB_DELTA;
                // System.out.println(thumbMin + " : " + thumbMax + " : "
                // + (e.getX() - offset));
                thumbPos = Math.min(thumbMax, Math.max(thumbMin, (e.getX() - this.offset)));
                SubstanceScrollBarUI.this.setThumbBounds(thumbPos, thumbR.y, thumbR.width,
                        thumbR.height);
            }

            /*
             * Set the scrollbars value. If the thumb has reached the end of the scrollbar, then
             * just set the value to its maximum. Otherwise compute the value as accurately as
             * possible.
             */
            if (thumbPos == thumbMax) {
                if (SubstanceScrollBarUI.this.scrollbar.getOrientation() == JScrollBar.VERTICAL
                        || SubstanceScrollBarUI.this.scrollbar.getComponentOrientation()
                                .isLeftToRight()) {
                    SubstanceScrollBarUI.this.scrollbar
                            .setValue(model.getMaximum() - model.getExtent());
                } else {
                    SubstanceScrollBarUI.this.scrollbar.setValue(model.getMinimum());
                }
            } else {
                float valueMax = model.getMaximum() - model.getExtent();
                float valueRange = valueMax - model.getMinimum();
                float thumbValue = thumbPos - thumbMin;
                float thumbRange = thumbMax - thumbMin;
                int value;
                if (SubstanceScrollBarUI.this.scrollbar.getOrientation() == JScrollBar.VERTICAL
                        || SubstanceScrollBarUI.this.scrollbar.getComponentOrientation()
                                .isLeftToRight()) {
                    value = (int) (0.5 + ((thumbValue / thumbRange) * valueRange));
                } else {
                    value = (int) (0.5 + (((thumbMax - thumbPos) / thumbRange) * valueRange));
                }

                SubstanceScrollBarUI.this.scrollbar.setValue(value + model.getMinimum());
            }
            SubstanceScrollBarUI.this.setThumbRollover(active);
        }

        /**
         * If necessary, starts the scroll timer.
         */
        private void startScrollTimerIfNecessary() {
            if (SubstanceScrollBarUI.this.scrollTimer.isRunning()) {
                return;
            }
            switch (SubstanceScrollBarUI.this.scrollbar.getOrientation()) {
                case JScrollBar.VERTICAL:
                    if (this.direction > 0) {
                        if (SubstanceScrollBarUI.this.getThumbBounds().y + SubstanceScrollBarUI.this
                                .getThumbBounds().height < ((SubstanceTrackListener) SubstanceScrollBarUI.this.trackListener).currentMouseY) {
                            SubstanceScrollBarUI.this.scrollTimer.start();
                        }
                    } else if (SubstanceScrollBarUI.this
                            .getThumbBounds().y > ((SubstanceTrackListener) SubstanceScrollBarUI.this.trackListener).currentMouseY) {
                        SubstanceScrollBarUI.this.scrollTimer.start();
                    }
                    break;
                case JScrollBar.HORIZONTAL:
                    if (this.direction > 0) {
                        if (SubstanceScrollBarUI.this.getThumbBounds().x + SubstanceScrollBarUI.this
                                .getThumbBounds().width < ((SubstanceTrackListener) SubstanceScrollBarUI.this.trackListener).currentMouseX) {
                            SubstanceScrollBarUI.this.scrollTimer.start();
                        }
                    } else if (SubstanceScrollBarUI.this
                            .getThumbBounds().x > ((SubstanceTrackListener) SubstanceScrollBarUI.this.trackListener).currentMouseX) {
                        SubstanceScrollBarUI.this.scrollTimer.start();
                    }
                    break;
            }
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.plaf.basic.BasicScrollBarUI$TrackListener#mouseMoved(
         * java.awt.event.MouseEvent)
         */
        @Override
        public void mouseMoved(MouseEvent e) {
            if (!SubstanceScrollBarUI.this.isDragging) {
                SubstanceScrollBarUI.this.updateThumbState(e.getX(), e.getY());
            }
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.plaf.basic.BasicScrollBarUI$TrackListener#mouseExited
         * (java.awt.event.MouseEvent)
         */
        @Override
        public void mouseExited(MouseEvent e) {
            if (!SubstanceScrollBarUI.this.isDragging) {
                SubstanceScrollBarUI.this.setThumbRollover(false);
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#createArrowButtonListener()
     */
    @Override
    protected ArrowButtonListener createArrowButtonListener() {
        return null;
    }

    /**
     * Updates the thumb state based on the coordinates.
     * 
     * @param x
     *            X coordinate.
     * @param y
     *            Y coordinate.
     */
    private void updateThumbState(int x, int y) {
        Rectangle rect = this.getThumbBounds();

        this.setThumbRollover(rect.contains(x, y));
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicScrollBarUI#getPreferredSize(javax.swing. JComponent)
     */
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