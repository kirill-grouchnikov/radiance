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
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.renderer.RadianceDefaultTableHeaderCellRenderer;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionMultiTracker;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.painter.HighlightPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.TableUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicTableHeaderUI;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.geom.Line2D;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * UI for table headers in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceTableHeaderUI extends BasicTableHeaderUI {
    /**
     * Repaints the header on column selection.
     */
    private TableHeaderListener radianceHeaderListener;

    /**
     * The default renderer.
     */
    private TableCellRenderer defaultHeaderRenderer;

    /**
     * Holds the list of currently selected indices.
     */
    private Map<Integer, Object> selectedIndices;

    /**
     * Listener for transition animations on list selections.
     */
    private ListSelectionListener radianceFadeSelectionListener;

    private StateTransitionMultiTracker<Integer> stateTransitionMultiTracker;

    /**
     * Property change listener.
     */
    private PropertyChangeListener radiancePropertyChangeListener;

    /**
     * Listener for table header.
     * 
     * @author Kirill Grouchnikov
     */
    private static class TableHeaderListener implements ListSelectionListener {
        /**
         * The associated table header UI.
         */
        private RadianceTableHeaderUI ui;

        /**
         * Simple constructor.
         * 
         * @param ui
         *            The associated table header UI
         */
        public TableHeaderListener(RadianceTableHeaderUI ui) {
            this.ui = ui;
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (ui.header == null)
                return;
            if (ui.header.isValid())
                ui.header.repaint();
        }
    }

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceTableHeaderUI();
    }

    /**
     * Creates a new UI delegate.
     */
    protected RadianceTableHeaderUI() {
        this.stateTransitionMultiTracker = new StateTransitionMultiTracker<>();
        selectedIndices = new HashMap<>();
    }

    @Override
    protected void installListeners() {
        super.installListeners();
        TableColumnModel columnModel = header.getColumnModel();
        if (columnModel != null) {
            ListSelectionModel lsm = columnModel.getSelectionModel();
            if (lsm != null) {
                // fix for defect 109 - memory leak on skin switch
                radianceHeaderListener = new TableHeaderListener(this);
                lsm.addListSelectionListener(radianceHeaderListener);
            }
        }

        // Add listener for the selection animation
        this.radianceFadeSelectionListener = listSelectionEvent -> {
            if (header == null)
                return;

            if (!columnModel.getColumnSelectionAllowed())
                return;

            // fix for issue 367 - check that there is an associated
            // table and that it has a Radiance UI delegate
            JTable table = header.getTable();
            if (table == null)
                return;

            TableUI ui = table.getUI();
            if (!(ui instanceof RadianceTableUI)) {
                stateTransitionMultiTracker.clear();
                return;
            }

            // optimization on large tables and large selections
            // and syncing the fade presence with the table
            // (issue 309)
            RadianceTableUI tableUI = (RadianceTableUI) ui;
            // System.out.println("Sel anim: "
            // + tableUI.hasSelectionAnimations());
            if (!tableUI._hasSelectionAnimations()) {
                stateTransitionMultiTracker.clear();
                return;
            }

            // Set<Long> initiatedFadeSequences = new HashSet<Long>();
            Set<StateTransitionTracker> initiatedTrackers = new HashSet<>();
            boolean fadeCanceled = false;

            // FadeTracker fadeTrackerInstance = FadeTracker.getInstance();
            int size = columnModel.getColumnCount();
            ListSelectionModel lsm = columnModel.getSelectionModel();
            for (int i = listSelectionEvent.getFirstIndex(); i <= listSelectionEvent.getLastIndex(); i++) {
                if (i >= size)
                    continue;
                if (lsm.isSelectedIndex(i)) {
                    // check if was selected before
                    if (!selectedIndices.containsKey(i)) {
                        // start fading in
                        // System.out.println("Fade in on index " + i);

                        if (!fadeCanceled) {
                            StateTransitionTracker tracker = getTracker(i,
                                    getColumnState(i).isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER),
                                    false);
                            tracker.getModel().setSelected(true);
                            initiatedTrackers.add(tracker);
                            if (initiatedTrackers.size() > 15) {
                                stateTransitionMultiTracker.clear();
                                initiatedTrackers.clear();
                                fadeCanceled = true;
                            }
                        }

                        selectedIndices.put(i, columnModel.getColumn(i));
                    }
                } else {
                    // check if was selected before and still points to the
                    // same element
                    if (selectedIndices.containsKey(i)) {
                        if (selectedIndices.get(i) == columnModel.getColumn(i)) {
                            // start fading out
                            // System.out.println("Fade out on index " + i);

                            if (!fadeCanceled) {
                                StateTransitionTracker tracker = getTracker(i, getColumnState(i)
                                        .isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER), true);
                                tracker.getModel().setSelected(false);
                                initiatedTrackers.add(tracker);
                                if (initiatedTrackers.size() > 15) {
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
        };

        if (columnModel != null) {
            ListSelectionModel lsm = columnModel.getSelectionModel();
            if (lsm != null) {
                lsm.addListSelectionListener(radianceFadeSelectionListener);
            }
        }

        this.radiancePropertyChangeListener = propertyChangeEvent -> {
            if ("table".equals(propertyChangeEvent.getPropertyName())) {
                // track changes to the table and re-register the
                // column model listener to the new table.
                TableColumnModel oldModel = (propertyChangeEvent.getOldValue() instanceof JTable)
                        ? ((JTable) propertyChangeEvent.getOldValue()).getColumnModel()
                        : null;
                TableColumnModel newModel = (propertyChangeEvent.getNewValue() instanceof JTable)
                        ? ((JTable) propertyChangeEvent.getNewValue()).getColumnModel()
                        : null;
                processColumnModelChangeEvent(oldModel, newModel);
            }
        };
        this.header.addPropertyChangeListener(this.radiancePropertyChangeListener);
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();

        defaultHeaderRenderer = header.getDefaultRenderer();
        if (defaultHeaderRenderer instanceof UIResource) {
            header.setDefaultRenderer(new RadianceDefaultTableHeaderCellRenderer());
        }

        for (int i = 0; i < header.getColumnModel().getColumnCount(); i++) {
            if (header.getColumnModel().getSelectionModel().isSelectedIndex(i)) {
                selectedIndices.put(i, header.getColumnModel().getColumn(i));
            }
        }
    }

    @Override
    protected void uninstallListeners() {
        // fix for defect 109 - memory leak on skin switch
        TableColumnModel columnModel = header.getColumnModel();
        if (columnModel != null) {
            ListSelectionModel lsm = columnModel.getSelectionModel();
            if (lsm != null) {
                lsm.removeListSelectionListener(radianceHeaderListener);
                radianceHeaderListener = null;
            }
        }

        this.header.removePropertyChangeListener(this.radiancePropertyChangeListener);
        this.radiancePropertyChangeListener = null;

        super.uninstallListeners();
    }

    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();

        selectedIndices.clear();

        if (header.getDefaultRenderer() instanceof RadianceDefaultTableHeaderCellRenderer) {
            header.setDefaultRenderer(defaultHeaderRenderer);
            if (defaultHeaderRenderer instanceof Component)
                SwingUtilities.updateComponentTreeUI((Component) defaultHeaderRenderer);
        }
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        if (header.getColumnModel().getColumnCount() <= 0) {
            return;
        }
        boolean ltr = header.getComponentOrientation().isLeftToRight();

        Rectangle clip = g.getClipBounds();
        Point left = clip.getLocation();
        Point right = new Point(clip.x + clip.width - 1, clip.y);

        TableColumnModel cm = header.getColumnModel();
        int[] selectedColumns = cm.getSelectedColumns();
        Set<Integer> selected = new HashSet<>();
        for (int sel : selectedColumns)
            selected.add(sel);

        int cMin = header.columnAtPoint(ltr ? left : right);
        int cMax = header.columnAtPoint(ltr ? right : left);
        // This should never happen.
        if (cMin == -1) {
            cMin = 0;
        }
        // If the table does not have enough columns to fill the view we'll get
        // -1.
        // Replace this with the index of the last column.
        if (cMax == -1) {
            cMax = cm.getColumnCount() - 1;
        }

        TableColumn draggedColumn = header.getDraggedColumn();
        int columnWidth;
        Rectangle cellRect = header.getHeaderRect(ltr ? cMin : cMax);
        TableColumn aColumn;
        if (ltr) {
            for (int column = cMin; column <= cMax; column++) {
                aColumn = cm.getColumn(column);
                columnWidth = aColumn.getWidth();
                cellRect.width = columnWidth;
                if (aColumn != draggedColumn) {
                    this.paintCell(g, cellRect, column);
                }
                cellRect.x += columnWidth;
            }
        } else {
            for (int column = cMax; column >= cMin; column--) {
                aColumn = cm.getColumn(column);
                columnWidth = aColumn.getWidth();
                cellRect.width = columnWidth;
                if (aColumn != draggedColumn) {
                    this.paintCell(g, cellRect, column);
                }
                cellRect.x += columnWidth;
            }
        }

        this.paintGrid(g);

        // Paint the dragged column if we are dragging.
        if (draggedColumn != null) {
            int draggedColumnIndex = viewIndexForColumn(draggedColumn);
            Rectangle draggedCellRect = header.getHeaderRect(draggedColumnIndex);

            // Draw a gray well in place of the moving column.
            g.setColor(header.getParent().getBackground());
            g.fillRect(draggedCellRect.x, draggedCellRect.y, draggedCellRect.width,
                    draggedCellRect.height);

            draggedCellRect.x += header.getDraggedDistance();

            // Fill the background.
            g.setColor(header.getBackground());
            g.fillRect(draggedCellRect.x, draggedCellRect.y, draggedCellRect.width,
                    draggedCellRect.height);

            // Don't paint the dragged cell if dragged column index is negative (otherwise
            // it will crash in ColumnModel.getColumn)
            if (draggedColumnIndex >= 0) {
                this.paintCell(g, draggedCellRect, draggedColumnIndex);
            }
        }

        // Remove all components in the rendererPane.
        rendererPane.removeAll();
    }

    /**
     * Retrieves renderer for the specified column header.
     * 
     * @param columnIndex
     *            Column index.
     * @return Renderer for the specified column header.
     */
    private Component getHeaderRenderer(int columnIndex) {
        TableColumn aColumn = header.getColumnModel().getColumn(columnIndex);
        TableCellRenderer renderer = aColumn.getHeaderRenderer();
        if (renderer == null) {
            renderer = header.getDefaultRenderer();
        }
        return renderer.getTableCellRendererComponent(header.getTable(), aColumn.getHeaderValue(),
                false, false, -1, columnIndex);
    }

    protected void paintGrid(Graphics g) {
        boolean ltr = header.getComponentOrientation().isLeftToRight();

        Graphics2D g2d = (Graphics2D) g.create();

        Rectangle clip = g.getClipBounds();
        Point left = clip.getLocation();
        // tweak the points for issue 378 - making sure that the
        // grid lines are repainted correctly on scroll.
        int lineWeight = (int) Math.ceil(RadianceSizeUtils.getBorderStrokeWidth(header));
        left = new Point(left.x - 2 * lineWeight, left.y);
        Point right = new Point(clip.x + clip.width + 2 * lineWeight, clip.y);

        TableColumnModel cm = header.getColumnModel();

        int cMin = header.columnAtPoint(ltr ? left : right);
        int cMax = header.columnAtPoint(ltr ? right : left);
        // This should never happen.
        if (cMin == -1) {
            cMin = 0;
        }

        Rectangle cellRect0 = header.getHeaderRect(cMin);
        // int top = cellRect0.y;
        int bottom = cellRect0.y + cellRect0.height;

        Color gridColor = getGridColor(this.header);

        float strokeWidth = RadianceSizeUtils.getBorderStrokeWidth(this.header);
        g2d.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(gridColor);
        g2d.setComposite(WidgetUtilities.getAlphaComposite(this.header, 0.7f, g));

        float bottomLineY = bottom - strokeWidth / 2;
        g2d.draw(new Line2D.Float((float) left.getX(), bottomLineY, (float) right.getX(),
                bottomLineY));
        // If the table does not have enough columns to fill the view we'll
        // get -1. Replace this with the index of the last column.
        if (cMax == -1) {
            cMax = cm.getColumnCount() - 1;
        }

        TableColumn draggedColumn = this.header.getDraggedColumn();
        int columnWidth;
        Rectangle cellRect = this.header.getHeaderRect(ltr ? cMin : cMax);
        TableColumn aColumn;
        if (ltr) {
            for (int column = cMin; column <= cMax; column++) {
                aColumn = cm.getColumn(column);
                columnWidth = aColumn.getWidth();
                cellRect.width = columnWidth;

                if (aColumn != draggedColumn) {
                    if (hasLeadingVerticalGridLine(header, column)) {
                        g2d.drawLine(cellRect.x, cellRect.y, cellRect.x, bottom);
                    }
                    if (hasTrailingVerticalGridLine(header, cellRect, column)) {
                        g2d.drawLine(cellRect.x + cellRect.width - 1, cellRect.y,
                                cellRect.x + cellRect.width - 1, bottom);
                    }
                }

                cellRect.x += columnWidth;
            }
        } else {
            for (int column = cMax; column >= cMin; column--) {
                aColumn = cm.getColumn(column);
                columnWidth = aColumn.getWidth();
                cellRect.width = columnWidth;

                if (aColumn != draggedColumn) {
                    if (hasLeadingVerticalGridLine(header, column)) {
                        g2d.drawLine(cellRect.x + cellRect.width - 1, cellRect.y,
                                cellRect.x + cellRect.width - 1, bottom);
                    }
                    if (hasTrailingVerticalGridLine(header, cellRect, column)) {
                        g2d.drawLine(cellRect.x, cellRect.y, cellRect.x, bottom);
                    }
                }
                cellRect.x += columnWidth;
            }
        }

        g2d.dispose();
    }

    private boolean hasTrailingVerticalGridLine(JTableHeader tableHeader, Rectangle cellRect,
            int column) {
        boolean toDrawLine = (column != (tableHeader.getColumnModel().getColumnCount() - 1));
        if (!toDrawLine) {
            Container parent = this.header.getParent();
            if (tableHeader.getComponentOrientation().isLeftToRight()) {
                toDrawLine = (parent != null)
                        && (parent.getWidth() > (cellRect.x + cellRect.width));
            } else {
                toDrawLine = (parent != null) && (cellRect.x > 0);
            }
        }
        return toDrawLine;
    }

    private boolean hasLeadingVerticalGridLine(JTableHeader tableHeader, int column) {
        if (column != 0) {
            return false;
        }
        Container parent = tableHeader.getParent();
        if (parent instanceof JViewport) {
            Container grand = parent.getParent();
            if (grand instanceof JScrollPane) {
                return (((JScrollPane) grand).getRowHeader() != null);
            }
        }
        return false;
    }

    /**
     * Returns the grid color for the table header.
     * 
     * @param header
     *            Table header.
     * @return Grid color.
     */
    protected static Color getGridColor(JTableHeader header) {
        boolean isEnabled = header.isEnabled();
        if (header.getTable() != null) {
            // fix for issue 472 - handle standalone table headers
            isEnabled = isEnabled && header.getTable().isEnabled();
        }
        ComponentState currState = isEnabled ? ComponentState.ENABLED
                : ComponentState.DISABLED_UNSELECTED;
        Color gridColor = RadianceCoreUtilities.getSkin(header).getOverlayColor(
                RadianceThemingSlices.ColorOverlayType.LINE,
                DecorationPainterUtils.getDecorationType(header), currState);
        if (gridColor == null) {
            gridColor = RadianceColorSchemeUtilities.getColorScheme(
                    header, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, currState).getLineColor();
        }
        return gridColor;
    }

    /**
     * Paints cell.
     * 
     * @param g
     *            Graphic context.
     * @param cellRect
     *            Cell rectangle.
     * @param columnIndex
     *            Column index.
     */
    private void paintCell(Graphics g, Rectangle cellRect, int columnIndex) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(WidgetUtilities.getAlphaComposite(header, g));

        // paint default background
        Component component = getHeaderRenderer(columnIndex);

        StateTransitionTracker.ModelStateInfo modelStateInfo = getModelStateInfo(columnIndex);
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = ((modelStateInfo == null)
                ? null
                : modelStateInfo.getStateContributionMap());
        ComponentState currState = ((modelStateInfo == null) ? getColumnState(columnIndex)
                : modelStateInfo.getCurrModelState());

        boolean hasHighlights = false;
        if (activeStates != null) {
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> stateEntry : activeStates
                    .entrySet()) {
                hasHighlights = (RadianceColorSchemeUtilities.getHighlightAlpha(this.header,
                        stateEntry.getKey()) * stateEntry.getValue().getContribution() > 0.0f);
                if (hasHighlights)
                    break;
            }
        } else {
            hasHighlights = (RadianceColorSchemeUtilities.getHighlightAlpha(this.header,
                    currState) > 0.0f);
        }

        // System.out.println(row + ":" + prevTheme.getDisplayName() + "["
        // + alphaForPrevBackground + "]:" + currTheme.getDisplayName()
        // + "[" + alphaForCurrBackground + "]");

        if (hasHighlights) {
            if (activeStates == null) {
                float alpha = RadianceColorSchemeUtilities.getHighlightAlpha(this.header,
                        currState);
                if (alpha > 0.0f) {
                    RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(
                            this.header, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, currState);
                    RadianceColorScheme borderScheme = RadianceColorSchemeUtilities
                            .getColorScheme(this.header,
                                    RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER, currState);
                    g2d.setComposite(WidgetUtilities.getAlphaComposite(this.header, alpha, g));
                    HighlightPainterUtils.paintHighlight(g2d, this.rendererPane, rendererPane,
                            cellRect, 0.8f, null, fillScheme, borderScheme);
                    g2d.setComposite(WidgetUtilities.getAlphaComposite(this.header, g));
                }
            } else {
                for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> stateEntry : activeStates
                        .entrySet()) {
                    ComponentState activeState = stateEntry.getKey();
                    float alpha = RadianceColorSchemeUtilities.getHighlightAlpha(this.header,
                            activeState) * stateEntry.getValue().getContribution();
                    if (alpha == 0.0f)
                        continue;
                    RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(
                            this.header, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, activeState);
                    RadianceColorScheme borderScheme = RadianceColorSchemeUtilities
                            .getColorScheme(this.header,
                                    RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER, activeState);
                    g2d.setComposite(WidgetUtilities.getAlphaComposite(this.header, alpha, g));
                    HighlightPainterUtils.paintHighlight(g2d, this.rendererPane, rendererPane,
                            cellRect, 0.8f, null, fillScheme, borderScheme);
                    g2d.setComposite(WidgetUtilities.getAlphaComposite(this.header, g));
                }
            }
        }

        rendererPane.paintComponent(g2d, component, header, cellRect.x, cellRect.y, cellRect.width,
                cellRect.height, true);

        g2d.dispose();
    }

    /**
     * Retrieves view index for the specified column.
     * 
     * @param aColumn
     *            Table column.
     * @return View index for the specified column.
     */
    private int viewIndexForColumn(TableColumn aColumn) {
        TableColumnModel cm = header.getColumnModel();
        for (int column = 0; column < cm.getColumnCount(); column++) {
            if (cm.getColumn(column) == aColumn) {
                return column;
            }
        }
        return -1;
    }

    @Override
    public void update(Graphics g, JComponent c) {
        // fix for issue 175 - table header under resize mode off
        // was painted in color scheme-agnostic (gray) color.
        boolean isEnabled = this.header.isEnabled();
        if (this.header.getTable() != null) {
            // fix for issue 472 - handle standalone table headers
            isEnabled = isEnabled && this.header.getTable().isEnabled();
        }
        ComponentState backgroundState = isEnabled ? ComponentState.ENABLED
                : ComponentState.DISABLED_UNSELECTED;

        // fix for issue 360 - respect the clip bounds of the
        // table header
        Rectangle clip = g.getClipBounds();
        if (clip == null)
            clip = c.getBounds();

        // do not use the highlight scheme for painting the
        // table header background
        RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(c,
                backgroundState);
        RadianceColorScheme borderScheme = RadianceColorSchemeUtilities.getColorScheme(c,
                RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER, backgroundState);

        HighlightPainterUtils.paintHighlight(g, null, c, clip, 0.0f, null, fillScheme,
                borderScheme);
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        paint(g2d, c);
        g2d.dispose();
    }

    @Override
    public void uninstallUI(JComponent c) {
        for (int i = 0; i < header.getColumnModel().getColumnCount(); i++) {
            TableColumn aColumn = header.getColumnModel().getColumn(i);
            TableCellRenderer renderer = aColumn.getHeaderRenderer();
            if (renderer == null) {
                renderer = header.getDefaultRenderer();
            }
            Component rendComp = renderer.getTableCellRendererComponent(header.getTable(),
                    aColumn.getHeaderValue(), false, false, -1, i);
            SwingUtilities.updateComponentTreeUI(rendComp);
        }
        super.uninstallUI(c);
    }

    /**
     * Returns the current state for the specified cell.
     * 
     * @param columnIndex
     *            Column index.
     * @return The current state for the specified column.
     */
    public ComponentState getColumnState(int columnIndex) {
        // ButtonModel synthModel = new DefaultButtonModel();
        boolean toEnable = header.isEnabled();

        // get the rollover column index from the table UI delegate
        JTable table = this.header.getTable();
        if (table != null) {
            toEnable = toEnable && table.isEnabled();
        }

        StateTransitionTracker tracker = this.stateTransitionMultiTracker.getTracker(columnIndex);
        if (tracker == null) {
            boolean isRollover = false;
            TableColumnModel columnModel = header.getColumnModel();
            boolean isSelected = false;
            if (columnModel.getColumnSelectionAllowed()) {
                isSelected = columnModel.getSelectionModel().isSelectedIndex(columnIndex);
                if ((table != null) && (table.getUI() instanceof RadianceTableUI)) {
                    RadianceTableUI tableUI = (RadianceTableUI) table.getUI();
                    int rolledOverIndex = tableUI.getRolloverColumnIndex();
                    isRollover = (rolledOverIndex >= 0) && (rolledOverIndex == columnIndex);
                    boolean hasSelectionAnimations = tableUI.hasSelectionAnimations();
                    if (hasSelectionAnimations && AnimationConfigurationManager.getInstance()
                            .isAnimationAllowed(RadianceThemingSlices.AnimationFacet.SELECTION, table))
                        isSelected = this.selectedIndices.containsKey(columnIndex);
                }
            }
            return ComponentState.getState(toEnable, isRollover, isSelected);
        } else {
            ComponentState fromTracker = tracker.getModelStateInfo().getCurrModelState();
            return ComponentState.getState(toEnable,
                    fromTracker.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER),
                    fromTracker.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION));
        }
    }

    public StateTransitionTracker.ModelStateInfo getModelStateInfo(int columnIndex) {
        if (this.stateTransitionMultiTracker.size() == 0)
            return null;
        StateTransitionTracker tracker = this.stateTransitionMultiTracker.getTracker(columnIndex);
        if (tracker == null) {
            return null;
        } else {
            return tracker.getModelStateInfo();
        }
    }

    /**
     * Returns the scroll pane corner filler component. This method is used in
     * {@link RadianceScrollPaneUI} to put a consistent filler for tables.
     * 
     * @return Scroll pane corner filler.
     */
    public JComponent getScrollPaneCornerFiller() {
        return new ScrollPaneCornerFiller(this.header);
    }

    /**
     * Corner filler for tables wrapped in scroll panes.
     * 
     * @author Kirill Grouchnikov
     */
    protected static class ScrollPaneCornerFiller extends JComponent implements UIResource {
        /**
         * Associated table header.
         */
        protected JTableHeader header;

        /**
         * Creates a new corner filler.
         * 
         * @param header
         *            Table header.
         */
        public ScrollPaneCornerFiller(JTableHeader header) {
            this.header = header;
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            // System.err.println("Painting " + this.hashCode() + " from "
            // + ((header == null) ? "null" : header.hashCode()));

            boolean ltr = header.getComponentOrientation().isLeftToRight();
            final ComponentState backgroundState = (header.isEnabled()
                    && header.getTable().isEnabled()) ? ComponentState.ENABLED
                            : ComponentState.DISABLED_UNSELECTED;

            RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(
                    this.header, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, backgroundState);
            RadianceColorScheme borderScheme = RadianceColorSchemeUtilities.getColorScheme(
                    this.header, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER, backgroundState);

            HighlightPainterUtils.paintHighlight(g2d, null, this.header,
                    new Rectangle(0, 0, this.getWidth(), this.getHeight()), 0.0f, null, fillScheme,
                    borderScheme);

            g2d.setColor(getGridColor(this.header));
            float strokeWidth = RadianceSizeUtils.getBorderStrokeWidth(this.header);
            g2d.setStroke(
                    new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(WidgetUtilities.getAlphaComposite(this.header, 0.7f, g));

            int x = ltr ? (int) strokeWidth / 2 : getWidth() - 1 - (int) strokeWidth / 2;
            g2d.drawLine(x, 0, x, getHeight());

            g2d.dispose();
        }
    }

    /**
     * Processes the events on model changes on the table column model.
     * 
     * @param oldModel
     *            Old column model.
     * @param newModel
     *            New column model.
     */
    public void processColumnModelChangeEvent(TableColumnModel oldModel,
            TableColumnModel newModel) {
        if (oldModel != null) {
            oldModel.getSelectionModel().removeListSelectionListener(radianceFadeSelectionListener);
        }
        if (newModel != null) {
            newModel.getSelectionModel().addListSelectionListener(radianceFadeSelectionListener);
        }
        selectedIndices.clear();
        stateTransitionMultiTracker.clear();
    }

    /**
     * Repaints a single column header during the fade animation cycle.
     * 
     * @author Kirill Grouchnikov
     */
    protected static class ColumnHeaderRepaintCallback extends EventDispatchThreadTimelineCallbackAdapter {
        /**
         * Associated table header.
         */
        protected JTableHeader header;

        /**
         * Associated (animated) column index.
         */
        protected int columnIndex;

        /**
         * Creates a new animation repaint callback.
         * 
         * @param header
         *            Associated table header.
         * @param columnIndex
         *            Associated (animated) column index.
         */
        public ColumnHeaderRepaintCallback(JTableHeader header, int columnIndex) {
            this.header = header;
            this.columnIndex = columnIndex;
        }

        @Override
        public void onTimelinePulse(float durationFraction, float timelinePosition) {
            repaintColumnHeader();
        }

        @Override
        public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                float durationFraction, float timelinePosition) {
            repaintColumnHeader();
        }

        /**
         * Repaints the associated cell.
         */
        private void repaintColumnHeader() {
            SwingUtilities.invokeLater(() -> {
                if (header == null) {
                    // may happen if the LAF was switched in the meantime
                    return;
                }
                try {
                    // maybeUpdateLayoutState();
                    int cellCount = header.getColumnModel().getColumnCount();
                    if ((cellCount > 0) && (columnIndex < cellCount)) {
                        // need to retrieve the cell rectangle since the
                        // cells can be moved while animating
                        Rectangle rect = header.getHeaderRect(columnIndex);
                        Rectangle damaged = new Rectangle(rect.x - 5, rect.y, rect.width + 10,
                                rect.height);
                        header.repaint(damaged);
                    }
                } catch (RuntimeException re) {
                }
            });
        }
    }

    public StateTransitionTracker getTracker(final int columnIndex, boolean initialRollover,
            boolean initialSelected) {
        StateTransitionTracker tracker = stateTransitionMultiTracker.getTracker(columnIndex);
        if (tracker == null) {
            ButtonModel model = new DefaultButtonModel();
            model.setSelected(initialSelected);
            model.setRollover(initialRollover);
            tracker = new StateTransitionTracker(header, model);
            tracker.registerModelListeners();
            tracker.setRepaintCallback(() -> new ColumnHeaderRepaintCallback(header, columnIndex));
            stateTransitionMultiTracker.addTracker(columnIndex, tracker);
        }
        return tracker;
    }

}
