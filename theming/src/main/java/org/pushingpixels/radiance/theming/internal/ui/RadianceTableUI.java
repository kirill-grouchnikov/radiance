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
import org.pushingpixels.radiance.theming.api.renderer.RadianceDefaultTableCellRenderer;
import org.pushingpixels.radiance.theming.api.renderer.RadianceDefaultTableHeaderCellRenderer;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionMultiTracker;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.painter.HighlightPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.RowSorter.SortKey;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.TableHeaderUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicTableUI;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.*;

/**
 * UI for tables in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceTableUI extends BasicTableUI implements UpdateOptimizationAware {
    /**
     * Holds the list of currently selected row-column indexes.
     */
    private Map<TableCellId, Object> selectedIndices;

    /**
     * Holds the currently rolled-over row-column index, or <code>null</code> if none such.
     */
    private Set<TableCellId> rolledOverIndices;

    private TableCellId focusedCellId;

    /**
     * Holds the currently rolled-over column index, or <code>-1</code> if none such. This is used
     * for the table header animations.
     */
    private int rolledOverColumn;

    private int rolledOverRow;

    /**
     * Map of default renderers.
     */
    private Map<Class<?>, TableCellRenderer> defaultRenderers;

    /**
     * Map of default editors.
     */
    private Map<Class<?>, TableCellEditor> defaultEditors;

    /**
     * Listener that listens to changes on table properties.
     */
    private PropertyChangeListener radiancePropertyChangeListener;

    /**
     * Listener for transition animations on list selections.
     */
    private TableStateListener radianceTableStateListener;

    /**
     * Listener for transition animations on table rollovers.
     */
    private RolloverFadeListener radianceFadeRolloverListener;

    private FocusListener radianceFocusListener;

    private StateTransitionMultiTracker<TableCellId> stateTransitionMultiTracker;

    /**
     * Cell renderer insets. Is computed in {@link #installDefaults()} and reused in
     * {@link RadianceDefaultTableCellRenderer#getTableCellRendererComponent(JTable, Object, boolean, boolean, int, int)}
     * and
     * {@link RadianceDefaultTableHeaderCellRenderer#getTableCellRendererComponent(JTable, Object, boolean, boolean, int, int)}
     * for performance optimizations.
     */
    private Insets cellRendererInsets;

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceTableUI();
    }

    /**
     * Creates a UI delegate for table.
     */
    protected RadianceTableUI() {
        super();
        this.selectedIndices = new HashMap<>();
        this.rolledOverIndices = new HashSet<>();
        this.stateTransitionMultiTracker = new StateTransitionMultiTracker<>();
        this.rolledOverColumn = -1;
        this.rolledOverRow = -1;

        this.cellId = new TableCellId(-1, -1);
    }

    static class BooleanEditor extends DefaultCellEditor {
        private static class RadianceEditorCheckBox extends JCheckBox {
            @Override
            public void setOpaque(boolean isOpaque) {
                if (!isOpaque) {
                    super.setOpaque(isOpaque);
                }
            }

            @Override
            public boolean isOpaque() {
                return false;
            }

            @Override
            public void setBorder(Border border) {
            }
        }

        public BooleanEditor() {
            super(new RadianceEditorCheckBox());
            JCheckBox checkBox = (JCheckBox) getComponent();
            checkBox.setOpaque(false);
            checkBox.setHorizontalAlignment(JCheckBox.CENTER);
        }
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();

        // fix for defect 117 - need to restore default table cell
        // renderers when Radiance is unset
        this.defaultRenderers = new HashMap<>();

        Class<?>[] defClasses = new Class[] {Object.class, Icon.class, ImageIcon.class,
                Number.class, Float.class, Double.class, Date.class, Boolean.class};
        for (Class<?> clazz : defClasses) {
            this.defaultRenderers.put(clazz, this.table.getDefaultRenderer(clazz));
        }

        // Override default renderers - note fix for issue 194
        // that doesn't override user-specific renderers (those that don't come
        // from JTable class).
        this.installRendererIfNecessary(Object.class, new RadianceDefaultTableCellRenderer());
        this.installRendererIfNecessary(Icon.class,
                new RadianceDefaultTableCellRenderer.IconRenderer());
        this.installRendererIfNecessary(ImageIcon.class,
                new RadianceDefaultTableCellRenderer.IconRenderer());
        this.installRendererIfNecessary(Number.class,
                new RadianceDefaultTableCellRenderer.NumberRenderer());
        this.installRendererIfNecessary(Float.class,
                new RadianceDefaultTableCellRenderer.DoubleRenderer());
        this.installRendererIfNecessary(Double.class,
                new RadianceDefaultTableCellRenderer.DoubleRenderer());
        this.installRendererIfNecessary(Date.class,
                new RadianceDefaultTableCellRenderer.DateRenderer());

        // fix for bug 56 - making default renderer for Boolean a check box.
        this.installRendererIfNecessary(Boolean.class,
                new RadianceDefaultTableCellRenderer.BooleanRenderer());

        this.defaultEditors = new HashMap<>();

        Class<?>[] defEditorClasses = new Class[] {Boolean.class};
        for (Class<?> clazz : defEditorClasses) {
            this.defaultEditors.put(clazz, this.table.getDefaultEditor(clazz));
        }
        this.installEditorIfNecessary(Boolean.class, new BooleanEditor());

        int rows = this.table.getRowCount();
        int cols = this.table.getColumnCount();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (this.table.isCellSelected(i, j)) {
                    TableCellId cellId = new TableCellId(i, j);
                    this.selectedIndices.put(cellId, this.table.getValueAt(i, j));
                }
            }
        }

        // This is a little tricky, and hopefully will not
        // interfere with existing applications. The row height in tables
        // is computed differently from trees and lists. While lists
        // trees respect the current renderers and their insets, the
        // JTable uses hard-code value of 16 pixels as the default
        // row height. This, obviously, doesn't sit well with the support
        // for custom fonts and high-DPI monitors.
        //
        // The current solution first checks whether all the renderers
        // come from Radiance. If not, it does nothing. If they do, it
        // creates a placeholder label, computes its preferred height and apply
        // insets. There's no need to go over each cell and compute its
        // preferred height - since at this moment the cell renderers
        // *are* Radiance labels.
        boolean areAllRenderersFromRadiance = true;
        TableColumnModel columnModel = table.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            TableColumn column = columnModel.getColumn(i);
            TableCellRenderer renderer = column.getCellRenderer();
            if (renderer == null) {
                renderer = table.getDefaultRenderer(table.getColumnClass(i));
            }
            if ((renderer instanceof RadianceDefaultTableCellRenderer)
                    || (renderer instanceof RadianceDefaultTableCellRenderer.BooleanRenderer))
                continue;
            areAllRenderersFromRadiance = false;
            break;
        }
        if (areAllRenderersFromRadiance) {
            Insets rendererInsets = RadianceSizeUtils
                    .getTableCellRendererInsets(RadianceSizeUtils.getComponentFontSize(table));
            JLabel forSizing = new JLabel("Text");
            forSizing.setFont(table.getFont());
            int rowHeight = forSizing.getPreferredSize().height + rendererInsets.bottom + rendererInsets.top;
            table.setRowHeight(rowHeight);
        }

        // instead of computing the cell renderer insets on
        // every cell rendering, compute it once and expose to the
        // RadianceDefaultTableCellRenderer
        this.cellRendererInsets = RadianceSizeUtils
                .getTableCellRendererInsets(RadianceSizeUtils.getComponentFontSize(table));
    }

    /**
     * Installs Radiance-specific renderers for column classes that don't have application-specific
     * renderers installed by the user code.
     *
     * @param clazz    Column class.
     * @param renderer Default renderer for the specified column class.
     */
    protected void installRendererIfNecessary(Class<?> clazz, TableCellRenderer renderer) {
        TableCellRenderer currRenderer = this.table.getDefaultRenderer(clazz);
        if (currRenderer != null) {
            boolean isCore = (currRenderer instanceof DefaultTableCellRenderer.UIResource)
                    || (currRenderer.getClass().getName().startsWith("javax.swing.JTable"));
            if (!isCore)
                return;
        }
        this.table.setDefaultRenderer(clazz, renderer);
    }

    /**
     * Installs Radiance-specific renderers for column classes that don't have application-specific
     * renderers installed by the user code.
     *
     * @param clazz  Column class.
     * @param editor Default renderer for the specified column class.
     */
    protected void installEditorIfNecessary(Class<?> clazz, TableCellEditor editor) {
        TableCellEditor currEditor = this.table.getDefaultEditor(clazz);
        if (currEditor != null) {
            boolean isCore = currEditor.getClass().getName().startsWith("javax.swing.JTable");
            if (!isCore)
                return;
        }
        this.table.setDefaultEditor(clazz, editor);
    }

    @Override
    protected void uninstallDefaults() {
        // fix for defect 117 - need to restore default table cell
        // renderers when Radiance is unset
        for (Map.Entry<Class<?>, TableCellRenderer> entry : this.defaultRenderers.entrySet()) {
            // fix for issue 194 - restore only those renderers that were
            // overriden by Radiance.
            this.uninstallRendererIfNecessary(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<Class<?>, TableCellEditor> entry : this.defaultEditors.entrySet()) {
            this.uninstallEditorIfNecessary(entry.getKey(), entry.getValue());
        }

        this.selectedIndices.clear();

        super.uninstallDefaults();
    }

    /**
     * Uninstalls default Radiance renderers that were installed in
     * {@link #installRendererIfNecessary(Class, TableCellRenderer)}.
     *
     * @param clazz    Column class.
     * @param renderer Renderer to restore.
     */
    protected void uninstallRendererIfNecessary(Class<?> clazz, TableCellRenderer renderer) {
        TableCellRenderer currRenderer = this.table.getDefaultRenderer(clazz);
        if (currRenderer != null) {
            boolean isRadianceRenderer = isRadianceDefaultRenderer(currRenderer);
            if (!isRadianceRenderer)
                return;
        }
        if (renderer instanceof Component)
            SwingUtilities.updateComponentTreeUI((Component) renderer);
        this.table.setDefaultRenderer(clazz, renderer);
    }

    /**
     * Uninstalls default Radiance editors that were installed in
     * {@link #installEditorIfNecessary(Class, TableCellEditor)}.
     *
     * @param clazz  Column class.
     * @param editor Editor to restore.
     */
    protected void uninstallEditorIfNecessary(Class<?> clazz, TableCellEditor editor) {
        TableCellEditor currEditor = this.table.getDefaultEditor(clazz);
        if (currEditor != null) {
            boolean isRadianceEditor = isRadianceDefaultEditor(currEditor);
            if (!isRadianceEditor)
                return;
        }
        if (editor instanceof Component)
            SwingUtilities.updateComponentTreeUI((Component) editor);
        this.table.setDefaultEditor(clazz, editor);
    }

    @Override
    protected void installListeners() {
        super.installListeners();
        this.radiancePropertyChangeListener = propertyChangeEvent -> {
            if ("columnSelectionAllowed".equals(propertyChangeEvent.getPropertyName())
                    || "rowSelectionAllowed".equals(propertyChangeEvent.getPropertyName())) {
                RadianceTableUI.this.syncSelection(true);
            }

            if ("model".equals(propertyChangeEvent.getPropertyName())) {
                TableModel old = (TableModel) propertyChangeEvent.getOldValue();
                if (old != null) {
                    old.removeTableModelListener(radianceTableStateListener);
                }
                // fix for defect 291 - track changes to the table.
                table.getModel().addTableModelListener(radianceTableStateListener);
                selectedIndices.clear();
                stateTransitionMultiTracker.clear();
                RadianceTableUI.this.syncSelection(true);
            }

            if ("columnModel".equals(propertyChangeEvent.getPropertyName())) {
                TableColumnModel old = (TableColumnModel) propertyChangeEvent.getOldValue();
                if (old != null) {
                    old.getSelectionModel()
                            .removeListSelectionListener(radianceTableStateListener);
                }
                table.getColumnModel().getSelectionModel()
                        .addListSelectionListener(radianceTableStateListener);
                selectedIndices.clear();
                stateTransitionMultiTracker.clear();
                RadianceTableUI.this.syncSelection(true);

                JTableHeader tableHeader = table.getTableHeader();
                // fix for issue 408 - table header may be null.
                if (tableHeader != null) {
                    // fix for issue 309 - syncing animations on tables
                    // and table headers.
                    RadianceTableHeaderUI headerUI = (RadianceTableHeaderUI) tableHeader.getUI();
                    headerUI.processColumnModelChangeEvent((TableColumnModel) propertyChangeEvent.getOldValue(),
                            (TableColumnModel) propertyChangeEvent.getNewValue());
                }
            }

            // fix for defect 243 - not tracking changes to selection
            // model results in incorrect selection painting on JXTreeTable
            // component from SwingX.
            if ("selectionModel".equals(propertyChangeEvent.getPropertyName())) {
                ListSelectionModel old = (ListSelectionModel) propertyChangeEvent.getOldValue();
                if (old != null) {
                    old.removeListSelectionListener(radianceTableStateListener);
                }
                table.getSelectionModel().addListSelectionListener(radianceTableStateListener);
                selectedIndices.clear();
                stateTransitionMultiTracker.clear();
                RadianceTableUI.this.syncSelection(true);
            }

            // fix for issue 479 - tracking sort / filter changes and
            // canceling selection animations
            if ("rowSorter".equals(propertyChangeEvent.getPropertyName())) {
                RowSorter old = (RowSorter) propertyChangeEvent.getOldValue();
                if (old != null) {
                    old.removeRowSorterListener(radianceTableStateListener);
                }
                RowSorter newSorter = (RowSorter) propertyChangeEvent.getNewValue();
                if (newSorter != null) {
                    newSorter.addRowSorterListener(radianceTableStateListener);
                }
                selectedIndices.clear();
                stateTransitionMultiTracker.clear();
                RadianceTableUI.this.syncSelection(true);
            }

            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(() -> {
                    // fix for bug 341
                    if (table == null)
                        return;
                    table.updateUI();
                });
            }

            if ("background".equals(propertyChangeEvent.getPropertyName())) {
                // propagate application-specific background color to the
                // header.
                Color newBackgr = (Color) propertyChangeEvent.getNewValue();
                JTableHeader header = table.getTableHeader();
                if (header != null) {
                    Color headerBackground = header.getBackground();
                    if (RadianceCoreUtilities.canReplaceChildBackgroundColor(headerBackground)) {
                        if (!(newBackgr instanceof UIResource)) {
                            if (newBackgr == null) {
                                header.setBackground(null);
                            } else {
                                // Issue 450 - wrap the color in
                                // RadianceColorResource to
                                // mark that it can be replaced.
                                header.setBackground(new RadianceColorResource(newBackgr));
                            }
                        } else {
                            header.setBackground(newBackgr);
                        }
                    }
                }
            }

            // fix for issue 361 - track enabled status of the table
            // and propagate to the table header
            if ("enabled".equals(propertyChangeEvent.getPropertyName())) {
                JTableHeader header = table.getTableHeader();
                if (header != null) {
                    header.setEnabled(table.isEnabled());
                    header.repaint();
                }
            }

            if ("dropLocation".equals(propertyChangeEvent.getPropertyName())) {
                JTable.DropLocation oldValue = (JTable.DropLocation) propertyChangeEvent.getOldValue();
                if (oldValue != null) {
                    Rectangle oldRect = getCellRectangleForRepaint(oldValue.getRow(),
                            oldValue.getColumn());
                    table.repaint(oldRect);
                }
                JTable.DropLocation newValue = table.getDropLocation();
                if (newValue != null) {
                    Rectangle newRect = getCellRectangleForRepaint(table.getDropLocation().getRow(),
                            table.getDropLocation().getColumn());
                    table.repaint(newRect);
                }
            }

            if ("tableCellEditor".equals(propertyChangeEvent.getPropertyName())) {
                // fix for issue 481 - rollovers on cell editing
                TableCellEditor newEditor = (TableCellEditor) propertyChangeEvent.getNewValue();
                TableCellEditor oldEditor = (TableCellEditor) propertyChangeEvent.getOldValue();
                Component currentEditorComponent = table.getEditorComponent();
                if ((oldEditor != null) && (currentEditorComponent != null)) {
                    table.getEditorComponent().removeMouseListener(radianceFadeRolloverListener);
                }
                if ((newEditor != null) && (currentEditorComponent != null)) {
                    table.getEditorComponent().addMouseListener(radianceFadeRolloverListener);
                }
            }
        };
        this.table.addPropertyChangeListener(this.radiancePropertyChangeListener);

        // Add listener for the selection animation
        this.radianceTableStateListener = new TableStateListener();
        this.table.getSelectionModel().addListSelectionListener(this.radianceTableStateListener);
        TableColumnModel columnModel = this.table.getColumnModel();
        columnModel.getSelectionModel().addListSelectionListener(this.radianceTableStateListener);
        this.table.getModel().addTableModelListener(this.radianceTableStateListener);
        if (this.table.getRowSorter() != null) {
            this.table.getRowSorter().addRowSorterListener(this.radianceTableStateListener);
        }

        // Add listener for the transition animation
        this.radianceFadeRolloverListener = new RolloverFadeListener();
        this.table.addMouseMotionListener(this.radianceFadeRolloverListener);
        this.table.addMouseListener(this.radianceFadeRolloverListener);

        // fix for issue 481 - tracking focus events on the table
        this.radianceFocusListener = new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {
                if (focusedCellId == null)
                    return;

                ComponentState cellState = getCellState(focusedCellId);
                StateTransitionTracker tracker = getTracker(focusedCellId,
                        cellState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER),
                        cellState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION));
                tracker.setFocusState(false);

                focusedCellId = null;
            }

            @Override
            public void focusGained(FocusEvent e) {
                int rowLead = table.getSelectionModel().getLeadSelectionIndex();
                int colLead = table.getColumnModel().getSelectionModel().getLeadSelectionIndex();
                if ((rowLead >= 0) && (colLead >= 0)) {
                    TableCellId toFocus = new TableCellId(rowLead, colLead);
                    if (toFocus.equals(focusedCellId))
                        return;
                    ComponentState cellState = getCellState(toFocus);
                    StateTransitionTracker tracker = getTracker(toFocus,
                            cellState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER),
                            cellState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION));
                    tracker.setFocusState(true);

                    focusedCellId = toFocus;
                }
            }
        };
        this.table.addFocusListener(this.radianceFocusListener);
    }

    @Override
    protected void uninstallListeners() {
        this.table.removePropertyChangeListener(this.radiancePropertyChangeListener);
        this.radiancePropertyChangeListener = null;

        this.table.getSelectionModel()
                .removeListSelectionListener(this.radianceTableStateListener);
        this.table.getColumnModel().getSelectionModel()
                .removeListSelectionListener(this.radianceTableStateListener);
        this.table.getModel().removeTableModelListener(this.radianceTableStateListener);
        if (this.table.getRowSorter() != null) {
            this.table.getRowSorter().removeRowSorterListener(this.radianceTableStateListener);
        }
        this.radianceTableStateListener = null;

        // Remove listener for the fade animation
        this.table.removeMouseMotionListener(this.radianceFadeRolloverListener);
        this.table.removeMouseListener(this.radianceFadeRolloverListener);
        this.radianceFadeRolloverListener = null;

        this.table.removeFocusListener(this.radianceFocusListener);
        this.radianceFocusListener = null;

        super.uninstallListeners();
    }

    /**
     * Paint a representation of the <code>table</code> instance that was set in installUI().
     */
    @Override
    public void paint(Graphics g, JComponent c) {
        Rectangle clip = g.getClipBounds();

        Rectangle bounds = this.table.getBounds();
        // account for the fact that the graphics has already been translated
        // into the table's bounds
        bounds.x = bounds.y = 0;

        if (this.table.getRowCount() <= 0 || this.table.getColumnCount() <= 0 ||
                // this check prevents us from painting the entire table
                // when the clip doesn't intersect our bounds at all
                !bounds.intersects(clip)) {

            return;
        }

        Point upperLeft = clip.getLocation();
        Point lowerRight = new Point(clip.x + clip.width - 1, clip.y + clip.height - 1);
        int rMin = this.table.rowAtPoint(upperLeft);
        int rMax = this.table.rowAtPoint(lowerRight);
        // This should never happen (as long as our bounds intersect the clip,
        // which is why we bail above if that is the case).
        if (rMin == -1) {
            rMin = 0;
        }
        // If the table does not have enough rows to fill the view we'll get -1.
        // (We could also get -1 if our bounds don't intersect the clip,
        // which is why we bail above if that is the case).
        // Replace this with the index of the last row.
        if (rMax == -1) {
            rMax = this.table.getRowCount() - 1;
        }

        boolean ltr = this.table.getComponentOrientation().isLeftToRight();
        int cMin = this.table.columnAtPoint(ltr ? upperLeft : lowerRight);
        int cMax = this.table.columnAtPoint(ltr ? lowerRight : upperLeft);
        // This should never happen.
        if (cMin == -1) {
            cMin = 0;
        }
        // If the table does not have enough columns to fill the view we'll get
        // -1.
        // Replace this with the index of the last column.
        if (cMax == -1) {
            cMax = this.table.getColumnCount() - 1;
        }

        // Paint the cells.
        this.paintCells(g, rMin, rMax, cMin, cMax);

        // Paint the grid.
        this.paintGrid(g, rMin, rMax, cMin, cMax);

        // Paint the drop lines
        this.paintDropLines(g);
    }

    /**
     * Paints the grid lines within <I>aRect</I>, using the grid color set with <I>setGridColor</I>.
     * Paints vertical lines if <code>getShowVerticalLines()</code> returns true and paints
     * horizontal lines if <code>getShowHorizontalLines()</code> returns true.
     */
    protected void paintGrid(Graphics g, int rMin, int rMax, int cMin, int cMax) {
        Graphics2D g2d = (Graphics2D) g.create();
        ComponentState currState = this.table.isEnabled() ? ComponentState.ENABLED
                : ComponentState.DISABLED_UNSELECTED;
        float alpha = RadianceColorSchemeUtilities.getAlpha(this.table, currState);
        g2d.setComposite(WidgetUtilities.getAlphaComposite(this.table, alpha, g));

        Color gridColor = this.table.getGridColor();
        if (gridColor instanceof UIResource) {
            gridColor = RadianceCoreUtilities.getSkin(this.table).getOverlayColor(
                    RadianceThemingSlices.ColorOverlayType.LINE,
                    DecorationPainterUtils.getDecorationType(this.table), currState);
            if (gridColor == null) {
                RadianceColorScheme scheme = RadianceColorSchemeUtilities.getColorScheme(this.table,
                        RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                        this.table.isEnabled() ? ComponentState.ENABLED
                                : ComponentState.DISABLED_UNSELECTED);
                gridColor = scheme.getLineColor();
            }
        }
        g2d.setColor(gridColor);

        Rectangle minCell = this.table.getCellRect(rMin, cMin, true);
        Rectangle maxCell = this.table.getCellRect(rMax, cMax, true);
        Rectangle damagedArea = minCell.union(maxCell);

        float strokeWidth = RadianceSizeUtils.getBorderStrokeWidth(this.table);
        g2d.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (this.table.getShowHorizontalLines()) {
            int tableWidth = damagedArea.x + damagedArea.width;
            int y = damagedArea.y;
            for (int row = rMin; row <= rMax; row++) {
                y += this.table.getRowHeight(row);
                g2d.drawLine(damagedArea.x, y - 1, tableWidth - 1, y - 1);
            }
        }
        if (this.table.getShowVerticalLines()) {
            TableColumnModel cm = this.table.getColumnModel();
            int tableHeight = damagedArea.y + damagedArea.height;
            int x;
            if (this.table.getComponentOrientation().isLeftToRight()) {
                x = damagedArea.x;
                for (int column = cMin; column <= cMax; column++) {
                    int w = cm.getColumn(column).getWidth();
                    if (hasLeadingVerticalGridLine(column)) {
                        g2d.drawLine(x, 0, x, tableHeight - 1);
                    }
                    x += w;
                    if (hasTrailingVerticalGridLine(cm, column)) {
                        g2d.drawLine(x - 1, 0, x - 1, tableHeight - 1);
                    }
                }
            } else {
                x = damagedArea.x + damagedArea.width;
                // fix for defect 196 - proper grid painting on RTL tables
                for (int column = cMin; column <= cMax; column++) {
                    int w = cm.getColumn(column).getWidth();
                    if (hasLeadingVerticalGridLine(column)) {
                        g2d.drawLine(x - 1, 0, x - 1, tableHeight - 1);
                    }
                    x -= w;
                    if (hasTrailingVerticalGridLine(cm, column)) {
                        g2d.drawLine(x, 0, x, tableHeight - 1);
                    }
                }
            }
        }
        g2d.dispose();
    }

    private boolean hasTrailingVerticalGridLine(TableColumnModel cm, int column) {
        boolean toDrawLine = (column != (cm.getColumnCount() - 1));
        if (!toDrawLine) {
            Container parent = this.table.getParent();
            toDrawLine = (parent != null) && (parent.getWidth() > this.table.getWidth());
        }
        return toDrawLine;
    }

    private boolean hasLeadingVerticalGridLine(int column) {
        if (column != 0)
            return false;
        Container parent = this.table.getParent();
        if (parent instanceof JViewport) {
            Container grand = parent.getParent();
            if (grand instanceof JScrollPane) {
                return (((JScrollPane) grand).getRowHeader() != null);
            }
        }
        return false;
    }

    private int viewIndexForColumn(TableColumn aColumn) {
        TableColumnModel cm = this.table.getColumnModel();
        for (int column = 0; column < cm.getColumnCount(); column++) {
            if (cm.getColumn(column) == aColumn) {
                return column;
            }
        }
        return -1;
    }

    protected void paintCells(Graphics g, int rMin, int rMax, int cMin, int cMax) {
        JTableHeader header = this.table.getTableHeader();
        TableColumn draggedColumn = (header == null) ? null : header.getDraggedColumn();

        TableColumnModel cm = this.table.getColumnModel();
        int columnMargin = cm.getColumnMargin();
        int rowMargin = this.table.getRowMargin();

        Rectangle cellRect;
        Rectangle highlightCellRect;
        TableColumn aColumn;
        int columnWidth;
        if (this.table.getComponentOrientation().isLeftToRight()) {
            for (int row = rMin; row <= rMax; row++) {
                cellRect = this.table.getCellRect(row, cMin, false);

                highlightCellRect = new Rectangle(cellRect);
                highlightCellRect.y -= rowMargin / 2;
                highlightCellRect.height += rowMargin;

                for (int column = cMin; column <= cMax; column++) {
                    aColumn = cm.getColumn(column);
                    columnWidth = aColumn.getWidth();

                    cellRect.width = columnWidth - columnMargin;
                    highlightCellRect.x = cellRect.x - columnMargin / 2;
                    highlightCellRect.width = columnWidth;
                    if (!hasTrailingVerticalGridLine(cm, column)) {
                        cellRect.width++;
                        highlightCellRect.width++;
                    }

                    if (aColumn != draggedColumn) {
                        this.paintCell(g, cellRect, highlightCellRect, row, column);
                    }
                    cellRect.x += columnWidth;
                }
            }
        } else {
            for (int row = rMin; row <= rMax; row++) {
                cellRect = this.table.getCellRect(row, cMin, false);
                highlightCellRect = new Rectangle(cellRect);
                highlightCellRect.y -= rowMargin / 2;
                highlightCellRect.height += rowMargin;

                for (int column = cMin; column <= cMax; column++) {
                    aColumn = cm.getColumn(column);
                    columnWidth = aColumn.getWidth();
                    cellRect.width = columnWidth - columnMargin;

                    highlightCellRect.x = cellRect.x - columnMargin / 2;
                    highlightCellRect.width = columnWidth;
                    if (aColumn != draggedColumn) {
                        this.paintCell(g, cellRect, highlightCellRect, row, column);
                    }
                    cellRect.x -= columnWidth;
                }
            }
        }

        // Paint the dragged column if we are dragging.
        if (draggedColumn != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            // enhancement 331 - translucent dragged column
            g2d.setComposite(WidgetUtilities.getAlphaComposite(this.table, 0.65f, g));
            this.paintDraggedArea(g2d, rMin, rMax, draggedColumn, header.getDraggedDistance());
            g2d.dispose();
        }

        // Remove any renderers that may be left in the rendererPane.
        this.rendererPane.removeAll();
    }

    protected void paintDraggedArea(Graphics g, int rMin, int rMax, TableColumn draggedColumn,
            int distance) {
        int draggedColumnIndex = this.viewIndexForColumn(draggedColumn);

        Rectangle minCell = this.table.getCellRect(rMin, draggedColumnIndex, true);
        Rectangle maxCell = this.table.getCellRect(rMax, draggedColumnIndex, true);

        Rectangle vacatedColumnRect = minCell.union(maxCell);

        // Paint a gray well in place of the moving column.
        g.setColor(this.table.getParent().getBackground());
        g.fillRect(vacatedColumnRect.x, vacatedColumnRect.y, vacatedColumnRect.width,
                vacatedColumnRect.height);

        // Move to the where the cell has been dragged.
        vacatedColumnRect.x += distance;

        // Fill the background.
        g.setColor(this.table.getBackground());
        g.fillRect(vacatedColumnRect.x, vacatedColumnRect.y, vacatedColumnRect.width,
                vacatedColumnRect.height);

        // Paint the vertical grid lines if necessary.
        if (this.table.getShowVerticalLines()) {
            g.setColor(this.table.getGridColor());
            int x1 = vacatedColumnRect.x;
            int y1 = vacatedColumnRect.y;
            int x2 = x1 + vacatedColumnRect.width - 1;
            int y2 = y1 + vacatedColumnRect.height - 1;
            // Left
            g.drawLine(x1 - 1, y1, x1 - 1, y2);
            // Right
            g.drawLine(x2, y1, x2, y2);
        }

        // Don't paint the dragged cell if dragged column index is negative (otherwise
        // it will crash in ColumnModel.getColumn)
        if (draggedColumnIndex >= 0) {
            for (int row = rMin; row <= rMax; row++) {
                // Render the cell value
                Rectangle r = this.table.getCellRect(row, draggedColumnIndex, false);
                r.x += distance;
                this.paintCell(g, r, r, row, draggedColumnIndex);

                // Paint the (lower) horizontal grid line if necessary.
                if (this.table.getShowHorizontalLines()) {
                    g.setColor(this.table.getGridColor());
                    Rectangle rcr = this.table.getCellRect(row, draggedColumnIndex, true);
                    rcr.x += distance;
                    int x1 = rcr.x;
                    int y1 = rcr.y;
                    int x2 = x1 + rcr.width - 1;
                    int y2 = y1 + rcr.height - 1;
                    g.drawLine(x1, y2, x2, y2);
                }
            }
        }
    }

    protected void paintCell(Graphics g, Rectangle cellRect, Rectangle highlightCellRect, int row,
            int column) {
        // System.out.println("Painting " + row + ":" + column);
        Component rendererComponent = null;
        if (!this.table.isEditing() || this.table.getEditingRow() != row
                || this.table.getEditingColumn() != column) {
            TableCellRenderer renderer = this.table.getCellRenderer(row, column);
            boolean isRadianceRenderer = isRadianceDefaultRenderer(renderer);
            rendererComponent = this.table.prepareRenderer(renderer, row, column);
            boolean isRadianceRendererComponent = isRadianceDefaultRenderer(rendererComponent);
            if (isRadianceRenderer && !isRadianceRendererComponent) {
                throw new IllegalArgumentException(
                        "Renderer extends the RadianceDefaultTableCellRenderer but does not return one in its getTableCellRendererComponent() method");
            }

            if (!isRadianceRenderer) {
                rendererPane.paintComponent(g, rendererComponent, table, cellRect.x, cellRect.y,
                        cellRect.width, cellRect.height, true);
                return;
            }
        }

        Graphics2D g2d = (Graphics2D) g.create();
        // fix for issue 183 - passing the original Graphics context
        // to compute the alpha composite. If the table is in a JXPanel
        // (component from SwingX) and it has custom alpha value set,
        // then the original graphics context will have a SRC_OVER
        // alpha composite applied to it.
        g2d.setComposite(WidgetUtilities.getAlphaComposite(this.table, g));

        TableCellId cellId = new TableCellId(row, column);

        StateTransitionTracker.ModelStateInfo modelStateInfo = this.getModelStateInfo(cellId);
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = ((modelStateInfo == null)
                ? null
                : modelStateInfo.getStateContributionMap());
        // optimize for tables that don't initiate rollover
        // or selection animations
        ComponentState currState = null;
        if (!updateInfo.hasRolloverAnimations && !updateInfo.hasSelectionAnimations) {
            activeStates = null;
            boolean isRollover = false;
            if (table.getRowSelectionAllowed()) {
                if (table.getColumnSelectionAllowed()) {
                    isRollover = (row == rolledOverRow) && (column == rolledOverColumn);
                } else {
                    isRollover = (row == rolledOverRow);
                }
            } else if (table.getColumnSelectionAllowed()) {
                isRollover = (column == rolledOverColumn);
            }
            boolean isSelected = table.isCellSelected(row, column);
            currState = isRollover
                    ? (isSelected ? ComponentState.ROLLOVER_SELECTED : ComponentState.ROLLOVER_UNSELECTED)
                    : (isSelected ? ComponentState.SELECTED : ComponentState.ENABLED);
        } else {
            currState = ((modelStateInfo == null) ? this.getCellState(cellId)
                    : modelStateInfo.getCurrModelState());
        }

        boolean hasHighlights = (currState != ComponentState.ENABLED) || (activeStates != null);
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

        Set<RadianceThemingSlices.Side> highlightOpenSides = null;
        float highlightBorderAlpha = 0.0f;

        if (hasHighlights) {
            // compute the highlight visuals, but only if there are
            // highlights on this cell (optimization)
            highlightOpenSides = EnumSet.noneOf(RadianceThemingSlices.Side.class);
            // show highlight border only when the table grid is not shown
            highlightBorderAlpha = (table.getShowHorizontalLines() || table.getShowVerticalLines())
                    ? 0.0f
                    : 0.8f;
            if (!table.getColumnSelectionAllowed() && table.getRowSelectionAllowed()) {
                // if row selection is on and column selection is off, we
                // will show the highlight for the entire row

                // all cells have open left side
                highlightOpenSides.add(RadianceThemingSlices.Side.LEFT);
                // all cells have open right side
                highlightOpenSides.add(RadianceThemingSlices.Side.RIGHT);
            }
            if (table.getColumnSelectionAllowed() && !table.getRowSelectionAllowed()) {
                // if row selection is off and column selection is on, we
                // will show the highlight for the entire column

                // the top side is open for all rows except the
                // first, or when the table header is visible
                highlightOpenSides.add(RadianceThemingSlices.Side.TOP);
                // all cells but the last have open bottom side
                highlightOpenSides.add(RadianceThemingSlices.Side.BOTTOM);
            }
            if (row > 1) {
                ComponentState upperNeighbourState = this
                        .getCellState(new TableCellId(row - 1, column));
                if (currState == upperNeighbourState) {
                    // the cell above it is in the same state
                    highlightOpenSides.add(RadianceThemingSlices.Side.TOP);
                }
            }
            if (column > 1) {
                ComponentState leftNeighbourState = this
                        .getCellState(new TableCellId(row, column - 1));
                if (currState == leftNeighbourState) {
                    // the cell to the left is in the same state
                    highlightOpenSides.add(RadianceThemingSlices.Side.LEFT);
                }
            }
            if (row == 0) {
                highlightOpenSides.add(RadianceThemingSlices.Side.TOP);
            }
            if (row == (table.getRowCount() - 1)) {
                highlightOpenSides.add(RadianceThemingSlices.Side.BOTTOM);
            }
            if (column == 0) {
                highlightOpenSides.add(RadianceThemingSlices.Side.LEFT);
            }
            if (column == (table.getColumnCount() - 1)) {
                highlightOpenSides.add(RadianceThemingSlices.Side.RIGHT);
            }
        }

        boolean isRollover = this.rolledOverIndices.contains(cellId);
        if (this.table.isEditing() && this.table.getEditingRow() == row
                && this.table.getEditingColumn() == column) {
            Component component = this.table.getEditorComponent();
            component.applyComponentOrientation(this.table.getComponentOrientation());

            if (hasHighlights) {
                float extra = RadianceSizeUtils.getBorderStrokeWidth(this.table);
                float extraWidth = highlightOpenSides.contains(RadianceThemingSlices.Side.LEFT) ? 0.0f
                        : extra;
                float extraHeight = highlightOpenSides.contains(RadianceThemingSlices.Side.TOP) ? 0.0f
                        : extra;
                Rectangle highlightRect = new Rectangle(highlightCellRect.x - (int) extraWidth,
                        highlightCellRect.y - (int) extraHeight,
                        highlightCellRect.width + (int) extraWidth,
                        highlightCellRect.height + (int) extraHeight);
                if (activeStates == null) {
                    float alpha = this.updateInfo.getHighlightAlpha(currState);
                    if (alpha > 0.0f) {
                        RadianceColorScheme fillScheme = this.updateInfo
                                .getHighlightColorScheme(currState);
                        RadianceColorScheme borderScheme = this.updateInfo
                                .getHighlightBorderColorScheme(currState);
                        g2d.setComposite(WidgetUtilities.getAlphaComposite(this.table, alpha, g));
                        HighlightPainterUtils.paintHighlight(g2d, this.rendererPane, component,
                                highlightRect, highlightBorderAlpha, highlightOpenSides, fillScheme,
                                borderScheme);
                        g2d.setComposite(WidgetUtilities.getAlphaComposite(this.table, g));
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
                        g2d.setComposite(WidgetUtilities.getAlphaComposite(this.table, alpha, g));
                        HighlightPainterUtils.paintHighlight(g2d, this.rendererPane, component,
                                highlightRect, highlightBorderAlpha, highlightOpenSides, fillScheme,
                                borderScheme);
                        g2d.setComposite(WidgetUtilities.getAlphaComposite(this.table, g));
                    }
                }
            }

            component.setBounds(cellRect);
            component.validate();
        } else {
            if (rendererComponent != null) {
                Color background = rendererComponent.getBackground();
                // optimization - only render background if it's different
                // from the table background
                if ((background != null) && (!table.getBackground().equals(background)
                        || this.updateInfo.isInDecorationArea)) {
                    // fill with the renderer background color
                    g2d.setColor(background);
                    g2d.fillRect(highlightCellRect.x, highlightCellRect.y,
                            highlightCellRect.width, highlightCellRect.height);
                }
            }

            if (hasHighlights) {
                JTable.DropLocation dropLocation = table.getDropLocation();
                if (dropLocation != null && !dropLocation.isInsertRow()
                        && !dropLocation.isInsertColumn() && dropLocation.getRow() == row
                        && dropLocation.getColumn() == column) {
                    // mark drop location
                    RadianceColorScheme scheme = RadianceColorSchemeUtilities.getColorScheme(
                            table, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, currState);
                    RadianceColorScheme borderScheme = RadianceColorSchemeUtilities
                            .getColorScheme(table, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
                                    currState);
                    float extra = RadianceSizeUtils.getBorderStrokeWidth(table);
                    HighlightPainterUtils.paintHighlight(g2d, this.rendererPane, rendererComponent,
                            new Rectangle(highlightCellRect.x - (int) extra,
                                    highlightCellRect.y - (int) extra,
                                    highlightCellRect.width + (int) extra,
                                    highlightCellRect.height + (int) extra),
                            0.8f, null, scheme, borderScheme);
                } else {
                    float extra = RadianceSizeUtils.getBorderStrokeWidth(table);
                    float extraWidth = highlightOpenSides.contains(RadianceThemingSlices.Side.LEFT) ? 0.0f
                            : extra;
                    float extraHeight = highlightOpenSides.contains(RadianceThemingSlices.Side.TOP) ? 0.0f
                            : extra;
                    Rectangle highlightRect = new Rectangle(highlightCellRect.x - (int) extraWidth,
                            highlightCellRect.y - (int) extraHeight,
                            highlightCellRect.width + (int) extraWidth,
                            highlightCellRect.height + (int) extraHeight);
                    if (activeStates == null) {
                        RadianceColorScheme fillScheme = this.updateInfo
                                .getHighlightColorScheme(currState);
                        RadianceColorScheme borderScheme = this.updateInfo
                                .getHighlightBorderColorScheme(currState);
                        float alpha = this.updateInfo.getHighlightAlpha(currState);
                        if (alpha > 0.0f) {
                            g2d.setComposite(
                                    WidgetUtilities.getAlphaComposite(this.table, alpha, g));
                            HighlightPainterUtils.paintHighlight(g2d, this.rendererPane,
                                    rendererComponent, highlightRect, highlightBorderAlpha,
                                    highlightOpenSides, fillScheme, borderScheme);
                            g2d.setComposite(WidgetUtilities.getAlphaComposite(this.table, g));
                        }
                    } else {
                        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> stateEntry : activeStates
                                .entrySet()) {
                            ComponentState activeState = stateEntry.getKey();
                            RadianceColorScheme fillScheme = this.updateInfo
                                    .getHighlightColorScheme(activeState);
                            RadianceColorScheme borderScheme = this.updateInfo
                                    .getHighlightBorderColorScheme(activeState);
                            float alpha = this.updateInfo.getHighlightAlpha(activeState)
                                    * stateEntry.getValue().getContribution();
                            if (alpha > 0.0f) {
                                g2d.setComposite(
                                        WidgetUtilities.getAlphaComposite(this.table, alpha, g));
                                HighlightPainterUtils.paintHighlight(g2d, this.rendererPane,
                                        rendererComponent, highlightRect, highlightBorderAlpha,
                                        highlightOpenSides, fillScheme, borderScheme);
                                g2d.setComposite(WidgetUtilities.getAlphaComposite(this.table, g));
                            }
                        }
                    }
                }
            }

            rendererComponent.applyComponentOrientation(this.table.getComponentOrientation());
            if (rendererComponent instanceof JComponent) {
                // Play with opacity to make our own gradient background
                // on selected elements to show.
                JComponent jRenderer = (JComponent) rendererComponent;
                // Compute the selection status to prevent flicker - JTable
                // registers a listener on selection changes and repaints
                // the relevant cell before our listener (in TableUI) gets
                // the chance to start the fade sequence. The result is that
                // the first frame uses full opacity, and the next frame
                // starts the fade sequence. So, we use the UI delegate to
                // compute the selection status.
                boolean isSelected = updateInfo.hasSelectionAnimations
                        ? this.selectedIndices.containsKey(cellId)
                        : this.table.isCellSelected(row, column);
                boolean newOpaque = !(isSelected || isRollover || hasHighlights);

                Map<Component, Boolean> opacity = new HashMap<>();
                if (!newOpaque)
                    RadianceCoreUtilities.makeNonOpaque(jRenderer, opacity);
                this.rendererPane.paintComponent(g2d, rendererComponent, this.table, cellRect.x,
                        cellRect.y, cellRect.width, cellRect.height, true);
                if (!newOpaque)
                    RadianceCoreUtilities.restoreOpaque(jRenderer, opacity);
            } else {
                this.rendererPane.paintComponent(g2d, rendererComponent, this.table, cellRect.x,
                        cellRect.y, cellRect.width, cellRect.height, true);
            }
        }
        g2d.dispose();
    }

    protected void paintDropLines(Graphics g) {
        JTable.DropLocation loc = table.getDropLocation();
        if (loc == null) {
            return;
        }

        Color color = UIManager.getColor("Table.dropLineColor");
        Color shortColor = UIManager.getColor("Table.dropLineShortColor");
        if (color == null && shortColor == null) {
            return;
        }

        Rectangle rect;

        rect = getHDropLineRect(loc);
        if (rect != null) {
            int x = rect.x;
            int w = rect.width;
            if (color != null) {
                extendRect(rect, true);
                g.setColor(color);
                g.fillRect(rect.x, rect.y, rect.width, rect.height);
            }
            if (!loc.isInsertColumn() && shortColor != null) {
                g.setColor(shortColor);
                g.fillRect(x, rect.y, w, rect.height);
            }
        }

        rect = getVDropLineRect(loc);
        if (rect != null) {
            int y = rect.y;
            int h = rect.height;
            if (color != null) {
                extendRect(rect, false);
                g.setColor(color);
                g.fillRect(rect.x, rect.y, rect.width, rect.height);
            }
            if (!loc.isInsertRow() && shortColor != null) {
                g.setColor(shortColor);
                g.fillRect(rect.x, y, rect.width, h);
            }
        }
    }

    private Rectangle getHDropLineRect(JTable.DropLocation loc) {
        if (!loc.isInsertRow()) {
            return null;
        }

        int row = loc.getRow();
        int col = loc.getColumn();
        if (col >= table.getColumnCount()) {
            col--;
        }

        Rectangle rect = table.getCellRect(row, col, true);

        if (row >= table.getRowCount()) {
            row--;
            Rectangle prevRect = table.getCellRect(row, col, true);
            rect.y = prevRect.y + prevRect.height;
        }

        if (rect.y == 0) {
            rect.y = -1;
        } else {
            rect.y -= 2;
        }

        rect.height = 3;

        return rect;
    }

    private Rectangle getVDropLineRect(JTable.DropLocation loc) {
        if (!loc.isInsertColumn()) {
            return null;
        }

        boolean ltr = table.getComponentOrientation().isLeftToRight();
        int col = loc.getColumn();
        Rectangle rect = table.getCellRect(loc.getRow(), col, true);

        if (col >= table.getColumnCount()) {
            col--;
            rect = table.getCellRect(loc.getRow(), col, true);
            if (ltr) {
                rect.x = rect.x + rect.width;
            }
        } else if (!ltr) {
            rect.x = rect.x + rect.width;
        }

        if (rect.x == 0) {
            rect.x = -1;
        } else {
            rect.x -= 2;
        }

        rect.width = 3;

        return rect;
    }

    private Rectangle extendRect(Rectangle rect, boolean horizontal) {
        if (rect == null) {
            return rect;
        }

        if (horizontal) {
            rect.x = 0;
            rect.width = table.getWidth();
        } else {
            rect.y = 0;

            if (table.getRowCount() != 0) {
                Rectangle lastRect = table.getCellRect(table.getRowCount() - 1, 0, true);
                rect.height = lastRect.y + lastRect.height;
            } else {
                rect.height = table.getHeight();
            }
        }

        return rect;
    }

    /**
     * Repaints a single cell during the fade animation cycle.
     *
     * @author Kirill Grouchnikov
     */
    protected class CellRepaintCallback extends EventDispatchThreadTimelineCallbackAdapter {
        /**
         * Associated table.
         */
        protected JTable table;

        /**
         * Associated (animated) row index.
         */
        protected int rowIndex;

        /**
         * Associated (animated) column index.
         */
        protected int columnIndex;

        /**
         * Creates a new animation repaint callback.
         *
         * @param table       Associated table.
         * @param rowIndex    Associated (animated) row index.
         * @param columnIndex Associated (animated) column index.
         */
        public CellRepaintCallback(JTable table, int rowIndex, int columnIndex) {
            super();
            this.table = table;
            this.rowIndex = rowIndex;
            this.columnIndex = columnIndex;
        }

        @Override
        public void onTimelinePulse(float durationFraction, float timelinePosition) {
            this.repaintCell();
        }

        @Override
        public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                float durationFraction, float timelinePosition) {
            this.repaintCell();
        }

        /**
         * Repaints the associated cell.
         */
        private void repaintCell() {
            SwingUtilities.invokeLater(() -> {
                if (RadianceTableUI.this.table == null) {
                    // may happen if the LAF was switched in the meantime
                    return;
                }
                int rowCount = table.getRowCount();
                int colCount = table.getColumnCount();
                if ((rowCount > 0) && (rowIndex < rowCount) && (colCount > 0)
                        && (columnIndex < colCount)) {
                    // need to retrieve the cell rectangle since the cells
                    // can be moved while animating
                    Rectangle rect = getCellRectangleForRepaint(rowIndex, columnIndex);
                    // System.out.println("Cell Repainting " + rowIndex +
                    // ":"
                    // + columnIndex + ":" + rect);
                    CellRepaintCallback.this.table.repaint(rect);
                }
            });
        }
    }

    /**
     * ID of a single table cell.
     *
     * @author Kirill Grouchnikov
     */
    public static class TableCellId implements Comparable<TableCellId> {
        /**
         * Cell row.
         */
        protected int row;

        /**
         * Cell column.
         */
        protected int column;

        /**
         * Creates a new cell ID.
         *
         * @param row    Cell row.
         * @param column Cell column.
         */
        public TableCellId(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public int compareTo(TableCellId o) {
            if (row == o.row) {
                return Integer.compare(column, o.column);
            } else {
                return Integer.compare(row, o.row);
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TableCellId) {
                return this.compareTo((TableCellId) obj) == 0;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return (this.row ^ (this.row << 16)) & (this.column ^ (this.column << 16));
        }

        @Override
        public String toString() {
            return "Row " + this.row + ", Column " + this.column;
        }
    }

    /**
     * State listener for tracking the selection changes.
     *
     * @author Kirill Grouchnikov
     */
    protected class TableStateListener
            implements ListSelectionListener, TableModelListener, RowSorterListener {
        List<SortKey> oldSortKeys = null;

        private boolean isSameSorter(List<? extends SortKey> sortKeys1,
                List<? extends SortKey> sortKeys2) {
            int size1 = (sortKeys1 == null) ? 0 : sortKeys1.size();
            int size2 = (sortKeys2 == null) ? 0 : sortKeys2.size();
            if ((size1 == 0) && (size2 == 0)) {
                return true;
            }
            if ((sortKeys1 == null) && (sortKeys2 == null))
                return true;
            if ((sortKeys1 == null) || (sortKeys2 == null))
                return false;
            if (size1 != size2)
                return false;
            for (int i = 0; i < size1; i++) {
                SortKey sortKey1 = sortKeys1.get(i);
                SortKey sortKey2 = sortKeys2.get(i);
                if ((sortKey1.getColumn() != sortKey2.getColumn())
                        || (sortKey1.getSortOrder() != sortKey2.getSortOrder())) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public void valueChanged(final ListSelectionEvent e) {
            // fix for issue 478 - no animations when sorter has changed
            List<? extends SortKey> sortKeys = (table.getRowSorter() == null) ? null
                    : table.getRowSorter().getSortKeys();
            boolean isDifferentSorter = !isSameSorter(sortKeys, oldSortKeys);
            if (e.getValueIsAdjusting() && isDifferentSorter)
                return;
            if (sortKeys == null) {
                oldSortKeys = null;
            } else {
                oldSortKeys = new ArrayList<>();
                for (SortKey sortKey : sortKeys) {
                    SortKey copy = new SortKey(sortKey.getColumn(), sortKey.getSortOrder());
                    oldSortKeys.add(copy);
                }
            }
            syncSelection(isDifferentSorter);
        }

        @Override
        public void tableChanged(final TableModelEvent e) {
            // fix for defect 291 - tracking changes to the table.
            SwingUtilities.invokeLater(() -> {
                // fix for defect 350 - font might have been
                // switched in the middle of update
                if (table == null)
                    return;

                // fix for defect 328 - do not clear the
                // internal selection and focus tracking
                // when the event is table update.
                if (e.getType() != TableModelEvent.UPDATE) {
                    selectedIndices.clear();
                    stateTransitionMultiTracker.clear();
                    focusedCellId = null;
                }
                syncSelection(true);
                table.repaint();
            });
        }

        @Override
        public void sorterChanged(RowSorterEvent e) {
            // fix for issue 479 - cancel selection animations
            // that are happening due to changes in sorter
            SwingUtilities.invokeLater(stateTransitionMultiTracker::clear);
        }
    }

    /**
     * Listener for fade animations on table rollovers.
     *
     * @author Kirill Grouchnikov
     */
    private class RolloverFadeListener implements MouseListener, MouseMotionListener {
        private int lastRow = -1;
        private int lastColumn = -1;

        public void mouseClicked(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
            if (table == null)
                return;

            if (!table.isEnabled())
                return;

            // check the mouse location. If the cell editor has been shown
            // or hidden, we will get a mouseExited() event, but shouldn't
            // be changing the rollover indication if the mouse is still
            // over the table
            PointerInfo pi = MouseInfo.getPointerInfo();
            Point mouseLoc = (pi != null) ? pi.getLocation() : null;
            Window windowAncestor = SwingUtilities.getWindowAncestor(table);
            if ((mouseLoc != null) && (windowAncestor != null)) {
                SwingUtilities.convertPointFromScreen(mouseLoc, windowAncestor);
                Component deepest = SwingUtilities.getDeepestComponentAt(windowAncestor, mouseLoc.x,
                        mouseLoc.y);

                while (deepest != null) {
                    if (deepest == table) {
                        // still in table
                        return;
                    }
                    deepest = deepest.getParent();
                }
            }

            fadeOutAllRollovers();
            this.fadeOutTableHeader();
            rolledOverIndices.clear();
            rolledOverColumn = -1;
            rolledOverRow = -1;
            lastRow = -1;
            lastColumn = -1;

            if (!_hasRolloverAnimations()) {
                table.repaint();
            }
        }

        public void mouseMoved(MouseEvent e) {
            if (!RadianceTableUI.this.table.isEnabled())
                return;
            handleMouseMove(e.getPoint());
            this.handleMoveForHeader(e);
        }

        public void mouseDragged(MouseEvent e) {
            if (!RadianceTableUI.this.table.isEnabled())
                return;
            handleMouseMove(e.getPoint());
            this.handleMoveForHeader(e);
        }

        /**
         * Handles various mouse move events and initiates the fade animation if necessary.
         *
         * @param e Mouse event.
         */
        private void handleMoveForHeader(MouseEvent e) {
            if (!RadianceTableUI.this.table.getColumnSelectionAllowed())
                return;
            JTableHeader header = RadianceTableUI.this.table.getTableHeader();
            if ((header == null) || (!header.isVisible()))
                return;

            TableHeaderUI ui = header.getUI();
            if (!(ui instanceof RadianceTableHeaderUI))
                return;

            RadianceTableHeaderUI sthui = (RadianceTableHeaderUI) ui;

            int row = RadianceTableUI.this.table.rowAtPoint(e.getPoint());
            int column = RadianceTableUI.this.table.columnAtPoint(e.getPoint());
            if ((row < 0) || (row >= RadianceTableUI.this.table.getRowCount()) || (column < 0)
                    || (column >= RadianceTableUI.this.table.getColumnCount())) {
                this.fadeOutTableHeader();
                // System.out.println("Nulling RO column index");
                RadianceTableUI.this.rolledOverColumn = -1;
            } else {
                // check if this is the same column
                if (RadianceTableUI.this.rolledOverColumn == column)
                    return;

                this.fadeOutTableHeader();

                TableColumnModel columnModel = header.getColumnModel();
                StateTransitionTracker columnTransitionTracker = sthui.getTracker(column, false,
                        columnModel.getColumnSelectionAllowed()
                                && columnModel.getSelectionModel().isSelectedIndex(column));
                columnTransitionTracker.getModel().setRollover(true);

                RadianceTableUI.this.rolledOverColumn = column;
            }
            // }
        }

        /**
         * Initiates the fade out effect.
         */
        private void fadeOutTableHeader() {
            if (RadianceTableUI.this.rolledOverColumn >= 0) {
                JTableHeader header = RadianceTableUI.this.table.getTableHeader();
                if ((header == null) || (!header.isVisible()))
                    return;
                RadianceTableHeaderUI ui = (RadianceTableHeaderUI) header.getUI();

                TableColumnModel columnModel = header.getColumnModel();
                StateTransitionTracker columnTransitionTracker = ui.getTracker(rolledOverColumn,
                        true, columnModel.getColumnSelectionAllowed() && columnModel
                                .getSelectionModel().isSelectedIndex(rolledOverColumn));
                columnTransitionTracker.getModel().setRollover(false);
            }
        }

        /**
         * Handles various mouse move events and initiates the fade animation if necessary.
         *
         * @param mousePoint Mouse event location.
         */
        private void handleMouseMove(Point mousePoint) {
            int row = table.rowAtPoint(mousePoint);
            int column = table.columnAtPoint(mousePoint);

            if ((row == this.lastRow) && (column == this.lastColumn)) {
                return;
            }
            this.lastRow = row;
            this.lastColumn = column;

            rolledOverRow = row;

            boolean hasRolloverAnimations = _hasRolloverAnimations();
            if (!hasRolloverAnimations) {
                table.repaint();
                return;
            }

            if ((row < 0) || (row >= table.getRowCount()) || (column < 0)
                    || (column >= table.getColumnCount())) {
                this.fadeOutAllRollovers();
                rolledOverIndices.clear();
            } else {
                // check if this is the same index
                boolean hasRowSelection = table.getRowSelectionAllowed();
                boolean hasColumnSelection = table.getColumnSelectionAllowed();
                int startRolloverRow = row;
                int endRolloverRow = row;
                int startRolloverColumn = column;
                int endRolloverColumn = column;
                if (hasRowSelection && !hasColumnSelection) {
                    startRolloverColumn = 0;
                    endRolloverColumn = table.getColumnCount() - 1;
                }
                if (!hasRowSelection && hasColumnSelection) {
                    startRolloverRow = 0;
                    endRolloverRow = table.getRowCount() - 1;
                }
                Set<TableCellId> toRemove = new HashSet<>();
                for (TableCellId currRolloverId : rolledOverIndices) {
                    if ((currRolloverId.row < startRolloverRow)
                            || (currRolloverId.row > endRolloverRow)
                            || (currRolloverId.column < startRolloverColumn)
                            || (currRolloverId.column > endRolloverColumn)) {
                        fadeOutRollover(currRolloverId);
                        toRemove.add(currRolloverId);
                    }
                }
                for (TableCellId id : toRemove) {
                    rolledOverIndices.remove(id);
                }

                int totalRolloverCount = (endRolloverRow - startRolloverRow + 1)
                        * (endRolloverColumn - startRolloverColumn + 1);
                if (totalRolloverCount > 20) {
                    for (int i = startRolloverRow; i <= endRolloverRow; i++) {
                        for (int j = startRolloverColumn; j <= endRolloverColumn; j++) {
                            rolledOverIndices.add(new TableCellId(i, j));
                        }
                    }
                    table.repaint();
                } else {
                    for (int i = startRolloverRow; i <= endRolloverRow; i++) {
                        for (int j = startRolloverColumn; j <= endRolloverColumn; j++) {
                            TableCellId currCellId = new TableCellId(i, j);
                            if (rolledOverIndices.contains(currCellId))
                                continue;
                            // System.out
                            // .println("Getting rollover/in tracker for "
                            // + currCellId);
                            StateTransitionTracker tracker = getTracker(currCellId, false,
                                    getCellState(currCellId)
                                            .isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION));
                            tracker.getModel().setRollover(true);

                            rolledOverIndices.add(currCellId);
                        }
                    }
                }
            }
        }

        /**
         * Initiates the fade out effect.
         */
        private void fadeOutRollover(TableCellId tableCellId) {
            if (rolledOverIndices.contains(tableCellId)) {
                // System.out
                // .println("Getting rollover/out tracker for " + cellId);
                StateTransitionTracker tracker = getTracker(tableCellId, true,
                        getCellState(tableCellId).isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION));
                tracker.getModel().setRollover(false);
            }
        }

        private void fadeOutAllRollovers() {
            if (rolledOverIndices.size() < 20) {
                for (TableCellId tcid : rolledOverIndices) {
                    fadeOutRollover(tcid);
                }
            }
        }
    }

    /**
     * Returns a comparable ID for the specified location.
     *
     * @param row    Row index.
     * @param column Column index.
     * @return Comparable ID for the specified location.
     */
    public TableCellId getId(int row, int column) {
        cellId.column = column;
        cellId.row = row;
        return cellId;
    }

    TableCellId cellId;

    /**
     * Synchronizes the current selection state.
     */
    // @SuppressWarnings("unchecked")
    protected void syncSelection(boolean enforceNoAnimations) {
        if (this.table == null) {
            // fix for defect 270 - if the UI delegate is updated
            // by another selection listener, ignore this
            return;
        }

        int rows = this.table.getRowCount();
        int cols = this.table.getColumnCount();

        int rowLeadIndex = this.table.getSelectionModel().getLeadSelectionIndex();
        int colLeadIndex = this.table.getColumnModel().getSelectionModel().getLeadSelectionIndex();
        boolean isFocusOwner = this.table.isFocusOwner();

        // fix for defect 209 - selection very slow on large tables with
        // column selection set to true and row selection set to false.
        // Solution - no selection animations on tables with more than 1000
        // cells.
        if (!this._hasSelectionAnimations()) {
            stateTransitionMultiTracker.clear();
            // this.prevStateMap.clear();
            table.repaint();

            // fix for issue 414 - track focus on tables
            // without selection animations
            if (isFocusOwner) {
                this.focusedCellId = new TableCellId(rowLeadIndex, colLeadIndex);
            }
            return;
        }

        Set<StateTransitionTracker> initiatedTrackers = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                TableCellId cellId = new TableCellId(i, j);
                if (this.table.isCellSelected(i, j)) {
                    // check if was selected before
                    if (!this.selectedIndices.containsKey(cellId)) {
                        // start fading in
                        if (!enforceNoAnimations) {
                            // System.out
                            // .println("Getting selection/in tracker for "
                            // + cellId);
                            StateTransitionTracker tracker = getTracker(cellId, getCellState(cellId)
                                    .isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER), false);
                            tracker.getModel().setSelected(true);
                            // System.out
                            // .println("Selecting previously unselected "
                            // + i + ":" + j);
                            initiatedTrackers.add(tracker);
                            if (initiatedTrackers.size() > 20) {
                                stateTransitionMultiTracker.clear();
                                initiatedTrackers.clear();
                                enforceNoAnimations = true;
                            }
                        }

                        this.selectedIndices.put(cellId, this.table.getValueAt(i, j));
                    }
                } else {
                    // check if was selected before and still points
                    // to the same element
                    if (this.selectedIndices.containsKey(cellId)) {
                        // corner case when the model returns null
                        Object oldValue = this.selectedIndices.get(cellId);
                        if ((i >= this.table.getModel().getRowCount())
                                || (j >= this.table.getModel().getColumnCount())) {
                            // not only the content changed, but the model
                            // dimensions as well
                            continue;
                        }
                        Object currValue = this.table.getValueAt(i, j);
                        boolean isSame = false;
                        if (oldValue == null) {
                            isSame = (currValue == null);
                        } else {
                            isSame = oldValue.equals(currValue);
                        }
                        if (isSame) {
                            // start fading out
                            if (!enforceNoAnimations) {
                                // System.out
                                // .println("Getting selection/out tracker for "
                                // + cellId);
                                StateTransitionTracker tracker = getTracker(cellId,
                                        getCellState(cellId)
                                                .isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER),
                                        true);
                                tracker.getModel().setSelected(false);
                                // System.out
                                // .println("Unselecting previously selected "
                                // + i + ":" + j);

                                initiatedTrackers.add(tracker);
                                if (initiatedTrackers.size() > 20) {
                                    stateTransitionMultiTracker.clear();
                                    initiatedTrackers.clear();
                                    enforceNoAnimations = true;
                                }
                            }
                        }
                        this.selectedIndices.remove(cellId);
                    }
                }

                // handle focus animations
                boolean cellHasFocus = isFocusOwner && (i == rowLeadIndex) && (j == colLeadIndex);
                if (cellHasFocus) {
                    // check if it's a different cell
                    if ((this.focusedCellId == null) || !this.focusedCellId.equals(cellId)) {
                        if (!enforceNoAnimations) {
                            if (this.focusedCellId != null) {
                                // fade out the previous focus holder

                                ComponentState cellState = getCellState(this.focusedCellId);
                                // System.out.println("Getting focus/out tracker for "
                                // + cellId);
                                StateTransitionTracker tracker = getTracker(this.focusedCellId,
                                        cellState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER),
                                        cellState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION));
                                tracker.setFocusState(false);
                            }

                            // fade in the current cell (new focus holder)
                            ComponentState cellState = getCellState(cellId);

                            // System.out.println("Getting focus/in tracker for "
                            // + currId);
                            StateTransitionTracker tracker = getTracker(cellId,
                                    cellState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER),
                                    cellState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION));
                            tracker.setFocusState(true);
                        }

                        if (AnimationConfigurationManager.getInstance()
                                .isAnimationAllowed(RadianceThemingSlices.AnimationFacet.FOCUS, this.table)) {
                            // and store it for future checks
                            this.focusedCellId = new TableCellId(i, j);
                        }
                    }
                } else {
                    // check if previously it held focus
                    if (cellId.equals(this.focusedCellId)) {
                        if (!enforceNoAnimations) {
                            // fade it out
                            ComponentState cellState = getCellState(cellId);
                            // System.out.println("Getting focus/out tracker for "
                            // + cellId);
                            StateTransitionTracker tracker = getTracker(cellId,
                                    cellState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER),
                                    cellState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION));
                            tracker.setFocusState(false);
                        }

                        this.focusedCellId = null;
                    }
                }
            }
        }
    }

    /**
     * Returns the current state for the specified cell.
     *
     * @param cellIndex Cell index.
     * @return The current state for the specified cell.
     */
    public ComponentState getCellState(TableCellId cellIndex) {
        boolean isEnabled = this.table.isEnabled();

        StateTransitionTracker tracker = this.stateTransitionMultiTracker.getTracker(cellIndex);
        if (tracker == null) {
            int row = cellIndex.row;
            int column = cellIndex.column;
            TableCellId cellId = this.getId(row, column);

            boolean isRollover = false;
            if (_hasRolloverAnimations()) {
                isRollover = rolledOverIndices.contains(cellId);
            } else if (table.getRowSelectionAllowed()) {
                if (table.getColumnSelectionAllowed()) {
                    isRollover = (row == rolledOverRow) && (column == rolledOverColumn);
                } else {
                    isRollover = (row == rolledOverRow);
                }
            } else if (table.getColumnSelectionAllowed()) {
                isRollover = (column == rolledOverColumn);
            }

            boolean isSelected = false;
            boolean hasSelectionAnimations = (this.updateInfo != null)
                    ? this.updateInfo.hasSelectionAnimations
                    : this._hasSelectionAnimations();
            if (hasSelectionAnimations && AnimationConfigurationManager.getInstance()
                    .isAnimationAllowed(RadianceThemingSlices.AnimationFacet.SELECTION, table))
                isSelected = this.selectedIndices.containsKey(cellId);
            else {
                isSelected = this.table.isCellSelected(row, column);
            }
            return ComponentState.getState(isEnabled, isRollover, isSelected);
        } else {
            ComponentState fromTracker = tracker.getModelStateInfo().getCurrModelState();
            return ComponentState.getState(isEnabled,
                    fromTracker.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER),
                    fromTracker.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION));
        }
    }

    /**
     * Returns the current state for the specified cell.
     *
     * @param cellId Cell index.
     * @return The current state for the specified cell.
     */
    public StateTransitionTracker.ModelStateInfo getModelStateInfo(TableCellId cellId) {
        if (this.stateTransitionMultiTracker.size() == 0)
            return null;
        StateTransitionTracker tracker = this.stateTransitionMultiTracker.getTracker(cellId);
        if (tracker == null) {
            return null;
        } else {
            return tracker.getModelStateInfo();
        }
    }

    /**
     * Checks whether the table has animations.
     *
     * @return <code>true</code> if the table has animations, <code>false</code> otherwise.
     */
    protected boolean _hasAnimations() {
        // fix for defects 164 and 209 - selection
        // and deletion are very slow on large tables.
        int rowCount = this.table.getRowCount();
        int colCount = this.table.getColumnCount();
        if (rowCount * colCount >= 500)
            return false;
        if (this.table.getColumnSelectionAllowed() && !this.table.getRowSelectionAllowed()) {
            if (!this.table.getShowHorizontalLines() && !this.table.getShowVerticalLines())
                return rowCount <= 10;
            return rowCount <= 25;
        }
        if (!this.table.getColumnSelectionAllowed() && this.table.getRowSelectionAllowed()) {
            if (!this.table.getShowHorizontalLines() && !this.table.getShowVerticalLines())
                return colCount <= 10;
            return colCount <= 25;
        }
        return true;
    }

    /**
     * Checks whether the table has selection animations.
     *
     * @return <code>true</code> if the table has selection animations, <code>false</code>
     * otherwise.
     */
    protected boolean _hasSelectionAnimations() {
        return this._hasAnimations()
                && !WidgetUtilities.hasNoAnimations(this.table, RadianceThemingSlices.AnimationFacet.SELECTION);
    }

    /**
     * Checks whether the table has rollover animations.
     *
     * @return <code>true</code> if the table has rollover animations, <code>false</code> otherwise.
     */
    protected boolean _hasRolloverAnimations() {
        return this._hasAnimations()
                && !WidgetUtilities.hasNoAnimations(this.table, RadianceThemingSlices.AnimationFacet.ROLLOVER);
    }

    /**
     * Returns the index of the rollover column.
     *
     * @return The index of the rollover column.
     */
    public int getRolloverColumnIndex() {
        return this.rolledOverColumn;
    }

    /**
     * Returns indication whether the specified cell has focus.
     *
     * @param row    Cell row index.
     * @param column Cell column index.
     * @return <code>true</code> If the focus is on the specified cell, <code>false</code>
     * otherwise.
     */
    public boolean isFocusedCell(int row, int column) {
        return (this.focusedCellId != null) && (this.focusedCellId.row == row)
                && (this.focusedCellId.column == column);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        BackgroundPaintingUtils.updateIfOpaque(g, c);
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        RadianceStripingUtils.setup(c);
        this.updateInfo = new TableUpdateOptimizationInfo();
        this.paint(g2d, c);
        RadianceStripingUtils.tearDown(c);
        g2d.dispose();
        this.updateInfo = null;
    }

    /**
     * Returns the cell renderer insets of this table. Is for internal use only.
     *
     * @return The cell renderer insets of this table.
     */
    public Insets getCellRendererInsets() {
        return this.cellRendererInsets;
    }

    public boolean hasSelectionAnimations() {
        if (this.updateInfo != null)
            return this.updateInfo.hasSelectionAnimations;
        return this._hasSelectionAnimations();
    }

    public boolean hasRolloverAnimations() {
        if (this.updateInfo != null)
            return this.updateInfo.hasRolloverAnimations;
        return this._hasRolloverAnimations();
    }

    private TableUpdateOptimizationInfo updateInfo;

    private class TableUpdateOptimizationInfo extends UpdateOptimizationInfo {
        public boolean hasSelectionAnimations;

        public boolean hasRolloverAnimations;

        public TableUpdateOptimizationInfo() {
            super(table);
            this.hasSelectionAnimations = _hasSelectionAnimations();
            this.hasRolloverAnimations = _hasRolloverAnimations();
        }
    }

    @Override
    public UpdateOptimizationInfo getUpdateOptimizationInfo() {
        return this.updateInfo;
    }

    private boolean isRadianceDefaultRenderer(Object instance) {
        return (instance instanceof RadianceDefaultTableCellRenderer)
                || (instance instanceof RadianceDefaultTableCellRenderer.BooleanRenderer);
    }

    private boolean isRadianceDefaultEditor(TableCellEditor editor) {
        return (editor instanceof BooleanEditor);
    }

    private Rectangle getCellRectangleForRepaint(int row, int column) {
        Rectangle rect = this.table.getCellRect(row, column, true);

        if (!table.getShowHorizontalLines() && !table.getShowVerticalLines()) {
            float extra = RadianceSizeUtils.getBorderStrokeWidth(table);
            rect.x -= (int) extra;
            rect.width += 2 * (int) extra;
            rect.y -= (int) extra;
            rect.height += 2 * (int) extra;
        }
        return rect;
    }

    private StateTransitionTracker getTracker(final TableCellId tableCellId,
            boolean initialRollover, boolean initialSelected) {
        StateTransitionTracker tracker = stateTransitionMultiTracker.getTracker(tableCellId);
        // System.out.println("TableID " + tableCellId + " has tracker "
        // + ((tracker == null) ? "null" : ("@" + tracker.hashCode())));
        if (tracker == null) {
            ButtonModel model = new DefaultButtonModel();
            model.setSelected(initialSelected);
            model.setRollover(initialRollover);
            tracker = new StateTransitionTracker(table, model);
            tracker.registerModelListeners();
            tracker.setRepaintCallback(
                    () -> new CellRepaintCallback(table, tableCellId.row, tableCellId.column));
            tracker.setName("row " + tableCellId.row + ", col " + tableCellId.column);
            // System.out.println("TableID " + tableCellId +
            // " has new tracker @"
            // + tracker.hashCode());
            stateTransitionMultiTracker.addTracker(tableCellId, tracker);
        }
        return tracker;
    }

    public StateTransitionTracker getStateTransitionTracker(TableCellId tableId) {
        return this.stateTransitionMultiTracker.getTracker(tableId);
    }
}
