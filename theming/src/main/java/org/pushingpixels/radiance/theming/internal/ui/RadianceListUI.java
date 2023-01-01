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

import org.pushingpixels.radiance.animation.api.Timeline.TimelineState;
import org.pushingpixels.radiance.animation.api.swing.EventDispatchThreadTimelineCallbackAdapter;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.AnimationFacet;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ComponentStateFacet;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.renderer.RadianceDefaultListCellRenderer;
import org.pushingpixels.radiance.theming.api.renderer.RadiancePanelListCellRenderer;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionMultiTracker;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.painter.HighlightPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicListUI;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * UI for lists in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceListUI extends BasicListUI implements UpdateOptimizationAware {
    /**
     * Holds the list of currently selected indices.
     */
    private Map<Integer, Object> selectedIndices;

    /**
     * Holds the currently rolled-over index, or -1 is there is none such.
     */
    private int rolledOverIndex;

    /**
     * Property listener.
     */
    private PropertyChangeListener radiancePropertyChangeListener;

    /**
     * Listener for transition animations on list selections.
     */
    private ListSelectionListener radianceListSelectionListener;

    /**
     * Listener for transition animations on list rollovers.
     */
    private RolloverFadeListener radianceFadeRolloverListener;

    private ComponentListener radianceComponentListener;

    private StateTransitionMultiTracker<Integer> stateTransitionMultiTracker;

    private ListDataListener radianceListDataListener;

    private class RadianceListSelectionListener implements ListSelectionListener {
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

            // no selection animations on non-Radiance renderers
            ListCellRenderer cellRenderer = list.getCellRenderer();
            boolean isRadianceRenderer =
                    (cellRenderer instanceof RadianceDefaultListCellRenderer) ||
                            (cellRenderer instanceof RadiancePanelListCellRenderer);
            if (!isRadianceRenderer) {
                syncModelContents();
                return;
            }

            Set<StateTransitionTracker> initiatedTrackers = new HashSet<>();
            boolean fadeCanceled = false;

            for (int i = e.getFirstIndex(); i <= e.getLastIndex(); i++) {
                if (i >= list.getModel().getSize()) {
                    continue;
                }
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

    private final class RadianceListDataListener implements ListDataListener {
        private void _syncModelContents() {
            // fix for issue 469/474 - update the inner structures
            // in a separate event
            SwingUtilities.invokeLater(RadianceListUI.this::syncModelContents);
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
         * @param e Mouse event.
         */
        private void handleMove(MouseEvent e) {
            // no rollover effects on non-Radiance renderers
            ListCellRenderer cellRenderer = list.getCellRenderer();
            boolean isRadianceRenderer =
                    (cellRenderer instanceof RadianceDefaultListCellRenderer) ||
                            (cellRenderer instanceof RadiancePanelListCellRenderer);
            if (!isRadianceRenderer) {
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

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceListUI();
    }

    /**
     * Creates a UI delegate for list.
     */
    protected RadianceListUI() {
        super();
        rolledOverIndex = -1;
        selectedIndices = new HashMap<>();

        this.stateTransitionMultiTracker = new StateTransitionMultiTracker<>();
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();

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
    private class CellRepaintCallback extends EventDispatchThreadTimelineCallbackAdapter {
        /**
         * Associated list.
         */
        protected JList list;

        /**
         * Associated (animated) cell index.
         */
        private int cellIndex;

        /**
         * Creates a new animation repaint callback.
         *
         * @param list      Associated list.
         * @param cellIndex Associated (animated) cell index.
         */
        private CellRepaintCallback(JList list, int cellIndex) {
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
            if (RadianceListUI.this.list == null) {
                // may happen if the LAF was switched in the meantime
                return;
            }
            try {
                maybeUpdateLayoutState();
                int cellCount = list.getModel().getSize();
                if ((cellCount > 0) && (cellIndex < cellCount)) {
                    // need to retrieve the cell rectangle since the
                    // cells can be moved while animating
                    Rectangle rect = RadianceListUI.this.getCellBounds(list, cellIndex, cellIndex);
                    // System.out.println("Repainting " + cellIndex
                    // + " at " + rect);
                    list.repaint(rect);
                }
            } catch (RuntimeException re) {
            }
        }
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        // Add listener for the selection animation
        radianceListSelectionListener = new RadianceListSelectionListener();
        list.getSelectionModel().addListSelectionListener(radianceListSelectionListener);

        radianceFadeRolloverListener = new RolloverFadeListener();
        list.addMouseMotionListener(radianceFadeRolloverListener);
        list.addMouseListener(radianceFadeRolloverListener);

        radiancePropertyChangeListener = propertyChangeEvent -> {
            if ("model".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(() -> {
                    ListModel oldModel = (ListModel) propertyChangeEvent.getOldValue();
                    if (oldModel != null) {
                        oldModel.removeListDataListener(radianceListDataListener);
                    }
                    ListModel newModel = (ListModel) propertyChangeEvent.getNewValue();
                    radianceListDataListener = new RadianceListDataListener();
                    newModel.addListDataListener(radianceListDataListener);
                    syncModelContents();
                });
            }
            if ("selectionModel".equals(propertyChangeEvent.getPropertyName())) {
                // fix for issue 475 - wire the listener on the new
                // selection model
                SwingUtilities.invokeLater(() -> {
                    ListSelectionModel oldModel = (ListSelectionModel) propertyChangeEvent.getOldValue();
                    if (oldModel != null) {
                        oldModel.removeListSelectionListener(radianceListSelectionListener);
                    }
                    ListSelectionModel newModel = (ListSelectionModel) propertyChangeEvent.getNewValue();
                    radianceListSelectionListener = new RadianceListSelectionListener();
                    newModel.addListSelectionListener(radianceListSelectionListener);
                    syncModelContents();
                });
            }
        };
        list.addPropertyChangeListener(radiancePropertyChangeListener);

        this.radianceComponentListener = new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                // clear the rollover indexes since these are no longer
                // in sync with the mouse location
                fadeOutRolloverIndication();
                resetRolloverIndex();
            }
        };
        this.list.addComponentListener(this.radianceComponentListener);

        this.radianceListDataListener = new RadianceListDataListener();
        this.list.getModel().addListDataListener(this.radianceListDataListener);
    }

    @Override
    protected void uninstallListeners() {
        this.list.getModel().removeListDataListener(this.radianceListDataListener);
        this.radianceListDataListener = null;

        list.getSelectionModel().removeListSelectionListener(radianceListSelectionListener);
        radianceListSelectionListener = null;

        list.removeMouseMotionListener(radianceFadeRolloverListener);
        list.removeMouseListener(radianceFadeRolloverListener);
        radianceFadeRolloverListener = null;

        list.removePropertyChangeListener(radiancePropertyChangeListener);
        radiancePropertyChangeListener = null;

        this.list.removeComponentListener(this.radianceComponentListener);
        this.radianceComponentListener = null;

        super.uninstallListeners();
    }

    @Override
    protected void paintCell(Graphics g, int row, Rectangle rowBounds,
            ListCellRenderer<Object> cellRenderer, ListModel<Object> dataModel, ListSelectionModel selModel,
            int leadIndex) {
        Object value = dataModel.getElementAt(row);
        boolean cellHasFocus = list.hasFocus() && (row == leadIndex);
        boolean isSelected = selModel.isSelectedIndex(row);

        Component rendererComponent = cellRenderer.getListCellRendererComponent(list, value, row,
                isSelected, cellHasFocus);

        boolean isRadianceRenderer =
                (rendererComponent instanceof RadianceDefaultListCellRenderer) ||
                        (rendererComponent instanceof RadiancePanelListCellRenderer);

        if (!isRadianceRenderer) {
            // if it's not Radiance renderer - ask the Basic delegate to paint
            // it.
            super.paintCell(g, row, rowBounds, cellRenderer, dataModel, selModel, leadIndex);
            return;
        }

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
        Color background = rendererComponent.getBackground();
        // optimization - only render background if it's different
        // from the list background
        if (!(background instanceof UIResource) &&
                ((background != null) && (!list.getBackground().equals(background)
                        || this.updateInfo.isInDecorationArea))) {
            g2d.setColor(background);
            g2d.fillRect(cx, cy, cw, ch);
        }

        StateTransitionTracker tracker = this.stateTransitionMultiTracker.getTracker(row);
        if (tracker != null) {
            tracker.getModel().setEnabled(this.list.isEnabled() && rendererComponent.isEnabled());
        }

        StateTransitionTracker.ModelStateInfo modelStateInfo = getModelStateInfo(row);
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                ((modelStateInfo == null) ? null
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
                    if (hasHighlights) {
                        break;
                    }
                }
            } else {
                hasHighlights = (this.updateInfo.getHighlightAlpha(currState) > 0.0f);
            }
        }

        JList.DropLocation dropLocation = list.getDropLocation();
        if (dropLocation != null && !dropLocation.isInsert() && dropLocation.getIndex() == row) {
            // mark drop location
            RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(list,
                    ColorSchemeAssociationKind.HIGHLIGHT, currState);
            RadianceColorScheme borderScheme = RadianceColorSchemeUtilities.getColorScheme(list,
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
                        RadianceColorScheme fillScheme = this.updateInfo
                                .getHighlightColorScheme(currState);
                        RadianceColorScheme borderScheme = this.updateInfo
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
                        RadianceColorScheme fillScheme = this.updateInfo
                                .getHighlightColorScheme(activeState);
                        RadianceColorScheme borderScheme = this.updateInfo
                                .getHighlightBorderColorScheme(activeState);
                        g2d.setComposite(WidgetUtilities.getAlphaComposite(list, alpha, g));
                        HighlightPainterUtils.paintHighlight(g2d, this.rendererPane,
                                rendererComponent, cellRect, 0.8f, null, fillScheme, borderScheme);
                        g2d.setComposite(WidgetUtilities.getAlphaComposite(list, g));
                    }
                }
            }
        }

        rendererPane.paintComponent(g2d, rendererComponent, list, cx, cy, cw, ch, true);
        g2d.dispose();
    }

    /**
     * Returns the current state for the specified cell.
     *
     * @param cellIndex         Cell index.
     * @param rendererComponent Renderer component for the specified cell index.
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

    public StateTransitionTracker.ModelStateInfo getModelStateInfo(int row) {
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

    @Override
    public void update(Graphics g, JComponent c) {
        BackgroundPaintingUtils.updateIfOpaque(g, c);

        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        RadianceStripingUtils.setup(c);
        this.updateInfo = new UpdateOptimizationInfo(c);
        this.paint(g2d, c);
        RadianceStripingUtils.tearDown(c);
        g2d.dispose();
        this.updateInfo = null;
    }

    private UpdateOptimizationInfo updateInfo;

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
