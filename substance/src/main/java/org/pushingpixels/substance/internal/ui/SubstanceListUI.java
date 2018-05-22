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

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicListUI;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.animation.StateTransitionMultiTracker;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.HighlightPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceStripingUtils;
import org.pushingpixels.substance.internal.utils.UpdateOptimizationAware;
import org.pushingpixels.substance.internal.utils.UpdateOptimizationInfo;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;
import org.pushingpixels.trident.Timeline.TimelineState;
import org.pushingpixels.trident.callback.UIThreadTimelineCallbackAdapter;

/**
 * UI for lists in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceListUI extends BasicListUI implements UpdateOptimizationAware {
    /**
     * Holds the list of currently selected indices.
     */
    protected Map<Integer, Object> selectedIndices;

    /**
     * Holds the currently rolled-over index, or -1 is there is none such.
     */
    protected int rolledOverIndex;

    /**
     * Property listener that listens to the {@link SubstanceLookAndFeel#WATERMARK_TO_BLEED}
     * property.
     */
    protected PropertyChangeListener substancePropertyChangeListener;

    /**
     * Listener for transition animations on list selections.
     */
    protected ListSelectionListener substanceListSelectionListener;

    /**
     * Listener for transition animations on list rollovers.
     */
    protected RolloverFadeListener substanceFadeRolloverListener;

    private ComponentListener substanceComponentListener;

    private StateTransitionMultiTracker<Integer> stateTransitionMultiTracker;

    private ListDataListener substanceListDataListener;

    private class SubstanceListSelectionListener implements ListSelectionListener {
        public void valueChanged(final ListSelectionEvent e) {
            // fix for issue 469/474 - update the inner structures
            // in a separate event
            SwingUtilities.invokeLater(() -> {
                handleListSelectionChange(e);
                if (list != null) {
                    list.repaint();
                }
            });
        }

        private void handleListSelectionChange(ListSelectionEvent e) {
            if (list == null) {
                // fix for issue 464 - misbehaving app listener can change
                // look-and-feel without giving this listener a chance to
                // react
                return;
            }
            // optimization on large lists and large selections
            if (WidgetUtilities.hasNoAnimations(list, AnimationFacet.SELECTION))
                return;

            // no selection animations on non-Substance renderers
            if (!(list.getCellRenderer() instanceof SubstanceDefaultListCellRenderer)) {
                syncModelContents();
                return;
            }

            Set<StateTransitionTracker> initiatedTrackers = new HashSet<StateTransitionTracker>();
            boolean fadeCanceled = false;

            for (int i = e.getFirstIndex(); i <= e.getLastIndex(); i++) {
                if (i >= list.getModel().getSize())
                    continue;
                if (list.isSelectedIndex(i)) {
                    // check if was selected before
                    if (!selectedIndices.containsKey(i)) {
                        // start fading in
                        // System.out.println("Fade in on index " + i);

                        selectedIndices.put(i, list.getModel().getElementAt(i));

                        if (!fadeCanceled) {
                            StateTransitionTracker tracker = getTracker(i, (i == rolledOverIndex),
                                    false);
                            tracker.getModel().setSelected(true);

                            initiatedTrackers.add(tracker);
                            if (initiatedTrackers.size() > 25) {
                                stateTransitionMultiTracker.clear();
                                initiatedTrackers.clear();
                                fadeCanceled = true;
                            }
                        }
                    }
                } else {
                    // check if was selected before and still points to the
                    // same element
                    if (selectedIndices.containsKey(i)) {
                        if (selectedIndices.get(i) == list.getModel().getElementAt(i)) {
                            // start fading out
                            // System.out
                            // .println("Fade out on index " + i);

                            if (!fadeCanceled) {
                                StateTransitionTracker tracker = getTracker(i,
                                        (i == rolledOverIndex), true);
                                tracker.getModel().setSelected(false);

                                initiatedTrackers.add(tracker);
                                if (initiatedTrackers.size() > 25) {
                                    stateTransitionMultiTracker.clear();
                                    initiatedTrackers.clear();
                                    fadeCanceled = true;
                                }
                            }
                        }
                        selectedIndices.remove(i);
                    }
                }
            }
        }
    }

    private final class SubstanceListDataListener implements ListDataListener {
        private void _syncModelContents() {
            // fix for issue 469/474 - update the inner structures
            // in a separate event
            SwingUtilities.invokeLater(() -> syncModelContents());
        }

        @Override
        public void intervalRemoved(ListDataEvent e) {
            _syncModelContents();
        }

        @Override
        public void intervalAdded(ListDataEvent e) {
            _syncModelContents();
        }

        @Override
        public void contentsChanged(ListDataEvent e) {
            _syncModelContents();
        }
    }

    /**
     * Listener for fade animations on list rollovers.
     * 
     * @author Kirill Grouchnikov
     */
    private class RolloverFadeListener implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
            // if (SubstanceCoreUtilities.toBleedWatermark(list))
            // return;

            fadeOutRolloverIndication();
            // System.out.println("Nulling RO index");
            resetRolloverIndex();
        }

        public void mouseMoved(MouseEvent e) {
            if (!list.isEnabled())
                return;
            handleMove(e);
        }

        public void mouseDragged(MouseEvent e) {
            if (!list.isEnabled())
                return;
            handleMove(e);
        }

        /**
         * Handles various mouse move events and initiates the fade animation if necessary.
         * 
         * @param e
         *            Mouse event.
         */
        private void handleMove(MouseEvent e) {
            // no rollover effects on non-Substance renderers
            if (!(list.getCellRenderer() instanceof SubstanceDefaultListCellRenderer)) {
                fadeOutRolloverIndication();
                resetRolloverIndex();
                return;
            }

            int roIndex = list.locationToIndex(e.getPoint());
            if ((roIndex >= 0) && (roIndex < list.getModel().getSize())) {
                // test actual hit
                if (!list.getCellBounds(roIndex, roIndex).contains(e.getPoint())) {
                    roIndex = -1;
                }
            }
            if ((roIndex < 0) || (roIndex >= list.getModel().getSize())) {
                fadeOutRolloverIndication();
                // System.out.println("Nulling RO index");
                resetRolloverIndex();
            } else {
                // check if this is the same index
                if ((rolledOverIndex >= 0) && (rolledOverIndex == roIndex))
                    return;

                fadeOutRolloverIndication();

                // rollover on a new row
                StateTransitionTracker tracker = getTracker(roIndex, false,
                        list.isSelectedIndex(roIndex));
                tracker.getModel().setRollover(true);
                rolledOverIndex = roIndex;
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
     */
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceListUI();
    }

    /**
     * Creates a UI delegate for list.
     */
    public SubstanceListUI() {
        super();
        rolledOverIndex = -1;
        selectedIndices = new HashMap<Integer, Object>();

        this.stateTransitionMultiTracker = new StateTransitionMultiTracker<Integer>();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicListUI#installDefaults()
     */
    @Override
    protected void installDefaults() {
        super.installDefaults();
        if (SubstanceCoreUtilities.toDrawWatermark(list)) {
            list.setOpaque(false);
        }

        syncModelContents();
    }

    @Override
    protected void uninstallDefaults() {
        selectedIndices.clear();

        super.uninstallDefaults();
    }

    @Override
    public void uninstallUI(JComponent c) {
        this.stateTransitionMultiTracker.clear();

        super.uninstallUI(c);
    }

    /**
     * Repaints a single cell during the fade animation cycle.
     * 
     * @author Kirill Grouchnikov
     */
    protected class CellRepaintCallback extends UIThreadTimelineCallbackAdapter {
        /**
         * Associated list.
         */
        protected JList list;

        /**
         * Associated (animated) cell index.
         */
        protected int cellIndex;

        /**
         * Creates a new animation repaint callback.
         * 
         * @param list
         *            Associated list.
         * @param cellIndex
         *            Associated (animated) cell index.
         */
        public CellRepaintCallback(JList list, int cellIndex) {
            this.list = list;
            this.cellIndex = cellIndex;
        }

        @Override
        public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                float durationFraction, float timelinePosition) {
            repaintCell();
        }

        @Override
        public void onTimelinePulse(float durationFraction, float timelinePosition) {
            // System.out.println(cellIndex + " at " + timelinePosition);
            repaintCell();
        }

        /**
         * Repaints the associated cell.
         */
        private void repaintCell() {
            if (SubstanceListUI.this.list == null) {
                // may happen if the LAF was switched in the meantime
                return;
            }
            try {
                maybeUpdateLayoutState();
                int cellCount = list.getModel().getSize();
                if ((cellCount > 0) && (cellIndex < cellCount)) {
                    // need to retrieve the cell rectangle since the
                    // cells can be moved while animating
                    Rectangle rect = SubstanceListUI.this.getCellBounds(list, cellIndex, cellIndex);
                    // System.out.println("Repainting " + cellIndex
                    // + " at " + rect);
                    list.repaint(rect);
                }
            } catch (RuntimeException re) {
                return;
            }
        }
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        // Add listener for the selection animation
        substanceListSelectionListener = new SubstanceListSelectionListener();
        list.getSelectionModel().addListSelectionListener(substanceListSelectionListener);

        substanceFadeRolloverListener = new RolloverFadeListener();
        list.addMouseMotionListener(substanceFadeRolloverListener);
        list.addMouseListener(substanceFadeRolloverListener);

        substancePropertyChangeListener = (final PropertyChangeEvent evt) -> {
            if (SubstanceSynapse.WATERMARK_VISIBLE.equals(evt.getPropertyName())) {
                list.setOpaque(!SubstanceCoreUtilities.toDrawWatermark(list));
            }
            if ("model".equals(evt.getPropertyName())) {
                SwingUtilities.invokeLater(() -> {
                    ListModel oldModel = (ListModel) evt.getOldValue();
                    if (oldModel != null) {
                        oldModel.removeListDataListener(substanceListDataListener);
                    }
                    ListModel newModel = (ListModel) evt.getNewValue();
                    substanceListDataListener = new SubstanceListDataListener();
                    newModel.addListDataListener(substanceListDataListener);
                    syncModelContents();
                });
            }
            if ("selectionModel".equals(evt.getPropertyName())) {
                // fix for issue 475 - wire the listener on the new
                // selection model
                SwingUtilities.invokeLater(() -> {
                    ListSelectionModel oldModel = (ListSelectionModel) evt.getOldValue();
                    if (oldModel != null) {
                        oldModel.removeListSelectionListener(substanceListSelectionListener);
                    }
                    ListSelectionModel newModel = (ListSelectionModel) evt.getNewValue();
                    substanceListSelectionListener = new SubstanceListSelectionListener();
                    newModel.addListSelectionListener(substanceListSelectionListener);
                    syncModelContents();
                });
            }
        };
        list.addPropertyChangeListener(substancePropertyChangeListener);

        this.substanceComponentListener = new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                // clear the rollover indexes since these are no longer
                // in sync with the mouse location
                fadeOutRolloverIndication();
                resetRolloverIndex();
            }
        };
        this.list.addComponentListener(this.substanceComponentListener);

        this.substanceListDataListener = new SubstanceListDataListener();
        this.list.getModel().addListDataListener(this.substanceListDataListener);
    }

    @Override
    protected void uninstallListeners() {
        this.list.getModel().removeListDataListener(this.substanceListDataListener);
        this.substanceListDataListener = null;

        list.getSelectionModel().removeListSelectionListener(substanceListSelectionListener);
        substanceListSelectionListener = null;

        list.removeMouseMotionListener(substanceFadeRolloverListener);
        list.removeMouseListener(substanceFadeRolloverListener);
        substanceFadeRolloverListener = null;

        list.removePropertyChangeListener(substancePropertyChangeListener);
        substancePropertyChangeListener = null;

        this.list.removeComponentListener(this.substanceComponentListener);
        this.substanceComponentListener = null;

        super.uninstallListeners();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicListUI#paintCell(java.awt.Graphics, int, java.awt.Rectangle,
     * javax.swing.ListCellRenderer, javax.swing.ListModel, javax.swing.ListSelectionModel, int)
     */
    @Override
    protected void paintCell(Graphics g, int row, Rectangle rowBounds,
            ListCellRenderer cellRenderer, ListModel dataModel, ListSelectionModel selModel,
            int leadIndex) {
        Object value = dataModel.getElementAt(row);
        boolean cellHasFocus = list.hasFocus() && (row == leadIndex);
        boolean isSelected = selModel.isSelectedIndex(row);

        Component rendererComponent = cellRenderer.getListCellRendererComponent(list, value, row,
                isSelected, cellHasFocus);

        if (!(rendererComponent instanceof SubstanceDefaultListCellRenderer)) {
            // if it's not Substance renderer - ask the Basic delegate to paint
            // it.
            super.paintCell(g, row, rowBounds, cellRenderer, dataModel, selModel, leadIndex);
            return;
        }

        boolean isWatermarkBleed = updateInfo.toDrawWatermark;

        int cx = rowBounds.x;
        int cy = rowBounds.y;
        int cw = rowBounds.width;
        int ch = rowBounds.height;

        // if (isFileList) {
        // // Shrink renderer to preferred size. This is mostly used on Windows
        // // where selection is only shown around the file name, instead of
        // // across the whole list cell.
        // int w = Math
        // .min(cw, rendererComponent.getPreferredSize().width + 4);
        // if (!isLeftToRight) {
        // cx += (cw - w);
        // }
        // cw = w;
        // }

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(WidgetUtilities.getAlphaComposite(list, g));
        if (!isWatermarkBleed) {
            Color background = rendererComponent.getBackground();
            // optimization - only render background if it's different
            // from the list background
            if ((background != null) && (!list.getBackground().equals(background)
                    || this.updateInfo.isInDecorationArea)) {
                g2d.setColor(background);
                g2d.fillRect(cx, cy, cw, ch);
            }
        } else {
            BackgroundPaintingUtils.fillAndWatermark(g2d, this.list,
                    rendererComponent.getBackground(), new Rectangle(cx, cy, cw, ch));
        }

        StateTransitionTracker.ModelStateInfo modelStateInfo = getModelStateInfo(row,
                rendererComponent);
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = ((modelStateInfo == null)
                ? null
                : modelStateInfo.getStateContributionMap());
        ComponentState currState = ((modelStateInfo == null) ? getCellState(row, rendererComponent)
                : modelStateInfo.getCurrModelState());

        // if the renderer is disabled, do not show any highlights
        boolean hasHighlights = false;
        if (rendererComponent.isEnabled()) {
            if (activeStates != null) {
                for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> stateEntry : activeStates
                        .entrySet()) {
                    hasHighlights = (this.updateInfo.getHighlightAlpha(stateEntry.getKey())
                            * stateEntry.getValue().getContribution() > 0.0f);
                    if (hasHighlights)
                        break;
                }
            } else {
                hasHighlights = (this.updateInfo.getHighlightAlpha(currState) > 0.0f);
            }
        }

        JList.DropLocation dropLocation = list.getDropLocation();
        if (dropLocation != null && !dropLocation.isInsert() && dropLocation.getIndex() == row) {
            // mark drop location
            SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities.getColorScheme(list,
                    ColorSchemeAssociationKind.HIGHLIGHT_TEXT, currState);
            SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities.getColorScheme(list,
                    ColorSchemeAssociationKind.HIGHLIGHT_BORDER, currState);
            Rectangle cellRect = new Rectangle(cx, cy, cw, ch);
            HighlightPainterUtils.paintHighlight(g2d, this.rendererPane, rendererComponent,
                    cellRect, 0.8f, null, fillScheme, borderScheme);
        } else {
            if (hasHighlights) {
                Rectangle cellRect = new Rectangle(cx, cy, cw, ch);
                if (activeStates == null) {
                    float alpha = this.updateInfo.getHighlightAlpha(currState);
                    if (alpha > 0.0f) {
                        SubstanceColorScheme fillScheme = this.updateInfo
                                .getHighlightColorScheme(currState);
                        SubstanceColorScheme borderScheme = this.updateInfo
                                .getHighlightBorderColorScheme(currState);
                        g2d.setComposite(WidgetUtilities.getAlphaComposite(list, alpha, g));
                        HighlightPainterUtils.paintHighlight(g2d, this.rendererPane,
                                rendererComponent, cellRect, 0.8f, null, fillScheme, borderScheme);
                        g2d.setComposite(WidgetUtilities.getAlphaComposite(list, g));
                    }
                } else {
                    for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> stateEntry : activeStates
                            .entrySet()) {
                        ComponentState activeState = stateEntry.getKey();
                        float alpha = this.updateInfo.getHighlightAlpha(activeState)
                                * stateEntry.getValue().getContribution();
                        if (alpha == 0.0f)
                            continue;
                        SubstanceColorScheme fillScheme = this.updateInfo
                                .getHighlightColorScheme(activeState);
                        SubstanceColorScheme borderScheme = this.updateInfo
                                .getHighlightBorderColorScheme(activeState);
                        g2d.setComposite(WidgetUtilities.getAlphaComposite(list, alpha, g));
                        HighlightPainterUtils.paintHighlight(g2d, this.rendererPane,
                                rendererComponent, cellRect, 0.8f, null, fillScheme, borderScheme);
                        g2d.setComposite(WidgetUtilities.getAlphaComposite(list, g));
                    }
                }
            }
        }

        // System.out.println(row + ":" + rendererComponent.getBackground());
        rendererPane.paintComponent(g2d, rendererComponent, list, cx, cy, cw, ch, true);
        g2d.dispose();
    }

    public StateTransitionTracker getStateTransitionTracker(int row) {
        return this.stateTransitionMultiTracker.getTracker(row);
    }

    /**
     * Returns the current state for the specified cell.
     * 
     * @param cellIndex
     *            Cell index.
     * @param rendererComponent
     *            Renderer component for the specified cell index.
     * @return The current state for the specified cell.
     */
    public ComponentState getCellState(int cellIndex, Component rendererComponent) {
        boolean isEnabled = this.list.isEnabled();
        if (rendererComponent != null) {
            isEnabled = isEnabled && rendererComponent.isEnabled();
        }
        StateTransitionTracker tracker = this.stateTransitionMultiTracker.getTracker(cellIndex);
        if (tracker == null) {
            boolean isRollover = (rolledOverIndex >= 0) && (rolledOverIndex == cellIndex);
            boolean isSelected = selectedIndices.containsKey(cellIndex);
            return ComponentState.getState(isEnabled, isRollover, isSelected);
        } else {
            ComponentState fromTracker = tracker.getModelStateInfo().getCurrModelState();
            return ComponentState.getState(isEnabled,
                    fromTracker.isFacetActive(ComponentStateFacet.ROLLOVER),
                    fromTracker.isFacetActive(ComponentStateFacet.SELECTION));
        }
    }

    public StateTransitionTracker.ModelStateInfo getModelStateInfo(int row,
            Component rendererComponent) {
        if (this.stateTransitionMultiTracker.size() == 0)
            return null;
        StateTransitionTracker tracker = this.stateTransitionMultiTracker.getTracker(row);
        if (tracker == null) {
            return null;
        } else {
            return tracker.getModelStateInfo();
        }
    }

    /**
     * Resets the rollover index.
     */
    public void resetRolloverIndex() {
        rolledOverIndex = -1;
    }

    /**
     * Initiates the fade out effect.
     */
    private void fadeOutRolloverIndication() {
        if (rolledOverIndex < 0)
            return;

        StateTransitionTracker tracker = getTracker(rolledOverIndex, true,
                list.isSelectedIndex(rolledOverIndex));
        tracker.getModel().setRollover(false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#update(java.awt.Graphics, javax.swing.JComponent)
     */
    @Override
    public void update(Graphics g, JComponent c) {
        BackgroundPaintingUtils.updateIfOpaque(g, c);

        Graphics2D g2d = (Graphics2D) g.create();
        RenderingUtils.installDesktopHints(g2d, c);
        SubstanceStripingUtils.setup(c);
        this.updateInfo = new UpdateOptimizationInfo(c);
        this.paint(g2d, c);
        SubstanceStripingUtils.tearDown(c);
        g2d.dispose();
        this.updateInfo = null;
    }

    // /**
    // * Returns the current default color scheme. This method is for internal
    // use
    // * only.
    // *
    // * @return The current default color scheme.
    // */
    // public SubstanceColorScheme getDefaultColorScheme() {
    // if (this.updateInfo != null)
    // return this.updateInfo.defaultScheme;
    // return null;
    // }
    //
    // public SubstanceColorScheme getHighlightColorScheme(ComponentState state)
    // {
    // if (this.updateInfo != null)
    // return updateInfo.getHighlightColorScheme(state);
    // return null;
    // }

    private UpdateOptimizationInfo updateInfo;

    // private class UpdateOptimizationInfo {
    // public boolean toDrawWatermark;
    //
    // private Map<ComponentState, SubstanceColorScheme> highlightSchemeMap;
    //
    // private Map<ComponentState, SubstanceColorScheme> borderSchemeMap;
    //
    // private Map<ComponentState, Float> highlightAlphaMap;
    //
    // public SubstanceColorScheme defaultScheme;
    //
    // public DecorationAreaType decorationAreaType;
    //
    // public boolean isInDecorationArea;
    //
    // public UpdateOptimizationInfo() {
    // this.toDrawWatermark = SubstanceCoreUtilities.toDrawWatermark(list);
    // this.defaultScheme = SubstanceColorSchemeUtilities.getColorScheme(
    // list, ComponentState.DEFAULT);
    // this.highlightAlphaMap = new EnumMap<ComponentState, Float>(
    // ComponentState.class);
    // this.highlightSchemeMap = new EnumMap<ComponentState,
    // SubstanceColorScheme>(
    // ComponentState.class);
    // this.borderSchemeMap = new EnumMap<ComponentState, SubstanceColorScheme>(
    // ComponentState.class);
    // this.decorationAreaType = SubstanceLookAndFeel
    // .getDecorationType(list);
    //
    // SubstanceSkin skin = SubstanceCoreUtilities.getSkin(list);
    // this.isInDecorationArea = (this.decorationAreaType != null)
    // && skin
    // .isRegisteredAsDecorationArea(this.decorationAreaType)
    // && SubstanceCoreUtilities.isOpaque(list);
    // }
    //
    // public SubstanceColorScheme getHighlightColorScheme(ComponentState state)
    // {
    // if (!this.highlightSchemeMap.containsKey(state)) {
    // this.highlightSchemeMap.put(state,
    // SubstanceColorSchemeUtilities.getColorScheme(list,
    // ColorSchemeAssociationKind.HIGHLIGHT, state));
    // }
    // return this.highlightSchemeMap.get(state);
    // }
    //
    // public SubstanceColorScheme getHighlightBorderColorScheme(
    // ComponentState state) {
    // if (!this.borderSchemeMap.containsKey(state)) {
    // this.borderSchemeMap.put(state, SubstanceColorSchemeUtilities
    // .getColorScheme(list,
    // ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
    // state));
    // }
    // return this.borderSchemeMap.get(state);
    // }
    //
    // public float getHighlightAlpha(ComponentState state) {
    // if (!this.highlightAlphaMap.containsKey(state)) {
    // this.highlightAlphaMap.put(state, SubstanceColorSchemeUtilities
    // .getHighlightAlpha(list, state));
    // }
    // return this.highlightAlphaMap.get(state);
    // }
    // }

    private void syncModelContents() {
        if (list == null)
            return;
        stateTransitionMultiTracker.clear();
        selectedIndices.clear();
        for (int i = 0; i < list.getModel().getSize(); i++) {
            if (list.isSelectedIndex(i)) {
                selectedIndices.put(i, list.getModel().getElementAt(i));
            }
        }
        list.repaint();
    }

    private StateTransitionTracker getTracker(final int row, boolean initialRollover,
            boolean initialSelected) {
        StateTransitionTracker tracker = stateTransitionMultiTracker.getTracker(row);
        if (tracker == null) {
            ButtonModel model = new DefaultButtonModel();
            model.setSelected(initialSelected);
            model.setRollover(initialRollover);
            tracker = new StateTransitionTracker(list, model);
            tracker.registerModelListeners();
            tracker.setRepaintCallback(() -> new CellRepaintCallback(list, row));
            tracker.setName("row " + row);
            stateTransitionMultiTracker.addTracker(row, tracker);
        }
        return tracker;
    }

    @Override
    public UpdateOptimizationInfo getUpdateOptimizationInfo() {
        return this.updateInfo;
    }
}
