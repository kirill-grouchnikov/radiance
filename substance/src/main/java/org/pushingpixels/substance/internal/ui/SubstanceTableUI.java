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

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Window;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.RowSorterEvent;
import javax.swing.event.RowSorterListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.TableHeaderUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicTableUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.SubstanceSlices.Side;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultTableCellRenderer;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultTableHeaderCellRenderer;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.animation.StateTransitionMultiTracker;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.HighlightPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceColorResource;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.SubstanceStripingUtils;
import org.pushingpixels.substance.internal.utils.UpdateOptimizationAware;
import org.pushingpixels.substance.internal.utils.UpdateOptimizationInfo;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;
import org.pushingpixels.trident.Timeline.TimelineState;
import org.pushingpixels.trident.callback.UIThreadTimelineCallbackAdapter;

/**
 * UI for tables in <b>Substance</b> look and feel. Unfortunately, the entire painting stack has
 * been copied from {@link BasicTableUI} since the methods are private. The animation effects are
 * implemented in the {@link #paintCell(Graphics, Rectangle, int, int)}.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceTableUI extends BasicTableUI implements UpdateOptimizationAware {
    /**
     * Holds the list of currently selected row-column indexes.
     */
    protected Map<TableCellId, Object> selectedIndices;

    /**
     * Holds the currently rolled-over row-column index, or <code>null</code> if none such.
     */
    protected Set<TableCellId> rolledOverIndices;

    protected TableCellId focusedCellId;

    /**
     * Holds the currently rolled-over column index, or <code>-1</code> if none such. This is used
     * for the table header animations.
     */
    protected int rolledOverColumn;

    /**
     * Map of default renderers.
     */
    protected Map<Class<?>, TableCellRenderer> defaultRenderers;

    /**
     * Map of default editors.
     */
    protected Map<Class<?>, TableCellEditor> defaultEditors;

    /**
     * Listener that listens to changes on table properties.
     */
    protected PropertyChangeListener substancePropertyChangeListener;

    /**
     * Listener for transition animations on list selections.
     */
    protected TableStateListener substanceTableStateListener;

    /**
     * Listener for transition animations on table rollovers.
     */
    protected RolloverFadeListener substanceFadeRolloverListener;

    protected FocusListener substanceFocusListener;

    private StateTransitionMultiTracker<TableCellId> stateTransitionMultiTracker;

    /**
     * Cell renderer insets. Is computed in {@link #installDefaults()} and reused in
     * {@link SubstanceDefaultTableCellRenderer#getTableCellRendererComponent(JTable, Object, boolean, boolean, int, int)}
     * and
     * {@link SubstanceDefaultTableHeaderCellRenderer#getTableCellRendererComponent(JTable, Object, boolean, boolean, int, int)}
     * for performance optimizations.
     */
    private Insets cellRendererInsets;

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
     */
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceTableUI();
    }

    /**
     * Creates a UI delegate for table.
     */
    public SubstanceTableUI() {
        super();
        this.selectedIndices = new HashMap<TableCellId, Object>();
        this.rolledOverIndices = new HashSet<TableCellId>();
        this.stateTransitionMultiTracker = new StateTransitionMultiTracker<TableCellId>();
        this.rolledOverColumn = -1;

        this.cellId = new TableCellId(-1, -1);
    }

    static class BooleanEditor extends DefaultCellEditor {
        private static class SubstanceEditorCheckBox extends JCheckBox {
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
            super(new SubstanceEditorCheckBox());
            JCheckBox checkBox = (JCheckBox) getComponent();
            checkBox.setOpaque(false);
            checkBox.setHorizontalAlignment(JCheckBox.CENTER);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicTableUI#installDefaults()
     */
    @Override
    protected void installDefaults() {
        super.installDefaults();
        if (SubstanceCoreUtilities.toDrawWatermark(this.table))
            this.table.setOpaque(false);

        // fix for defect 117 - need to restore default table cell
        // renderers when Substance is unset
        this.defaultRenderers = new HashMap<Class<?>, TableCellRenderer>();

        Class<?>[] defClasses = new Class[] { Object.class, Icon.class, ImageIcon.class,
                        Number.class, Float.class, Double.class, Date.class, Boolean.class };
        for (Class<?> clazz : defClasses) {
            this.defaultRenderers.put(clazz, this.table.getDefaultRenderer(clazz));
        }

        // Override default renderers - note fix for issue 194
        // that doesn't override user-specific renderers (those that don't come
        // from JTable class).
        this.installRendererIfNecessary(Object.class, new SubstanceDefaultTableCellRenderer());
        this.installRendererIfNecessary(Icon.class,
                new SubstanceDefaultTableCellRenderer.IconRenderer());
        this.installRendererIfNecessary(ImageIcon.class,
                new SubstanceDefaultTableCellRenderer.IconRenderer());
        this.installRendererIfNecessary(Number.class,
                new SubstanceDefaultTableCellRenderer.NumberRenderer());
        this.installRendererIfNecessary(Float.class,
                new SubstanceDefaultTableCellRenderer.DoubleRenderer());
        this.installRendererIfNecessary(Double.class,
                new SubstanceDefaultTableCellRenderer.DoubleRenderer());
        this.installRendererIfNecessary(Date.class,
                new SubstanceDefaultTableCellRenderer.DateRenderer());

        // fix for bug 56 - making default renderer for Boolean a check box.
        this.installRendererIfNecessary(Boolean.class,
                new SubstanceDefaultTableCellRenderer.BooleanRenderer());

        this.defaultEditors = new HashMap<Class<?>, TableCellEditor>();

        Class<?>[] defEditorClasses = new Class[] { Boolean.class };
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
        // come from Substance. If not, it does nothing. If they do, it
        // creates a dummy label, computes its preferred height and apply
        // insets. There's no need to go over each cell and compute its
        // preferred height - since at this moment the cell renderers
        // *are* Substance labels.
        boolean areAllRenderersFromSubstance = true;
        TableColumnModel columnModel = table.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            TableColumn column = columnModel.getColumn(i);
            TableCellRenderer renderer = column.getCellRenderer();
            if (renderer == null) {
                renderer = table.getDefaultRenderer(table.getColumnClass(i));
            }
            if ((renderer instanceof SubstanceDefaultTableCellRenderer)
                    || (renderer instanceof SubstanceDefaultTableCellRenderer.BooleanRenderer))
                continue;
            areAllRenderersFromSubstance = false;
            break;
        }
        if (areAllRenderersFromSubstance) {
            Insets rendererInsets = SubstanceSizeUtils
                    .getTableCellRendererInsets(SubstanceSizeUtils.getComponentFontSize(table));
            JLabel dummy = new JLabel("dummy");
            dummy.setFont(table.getFont());
            int rowHeight = dummy.getPreferredSize().height + rendererInsets.bottom
                    + rendererInsets.top;
            table.setRowHeight(rowHeight);
        }

        // instead of computing the cell renderer insets on
        // every cell rendering, compute it once and expose to the
        // SubstanceDefaultTableCellRenderer
        this.cellRendererInsets = SubstanceSizeUtils
                .getTableCellRendererInsets(SubstanceSizeUtils.getComponentFontSize(table));
    }

    /**
     * Installs Substance-specific renderers for column classes that don't have application-specific
     * renderers installed by the user code.
     * 
     * @param clazz
     *            Column class.
     * @param renderer
     *            Default renderer for the specified column class.
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
     * Installs Substance-specific renderers for column classes that don't have application-specific
     * renderers installed by the user code.
     * 
     * @param clazz
     *            Column class.
     * @param editor
     *            Default renderer for the specified column class.
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

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicTableUI#uninstallDefaults()
     */
    @Override
    protected void uninstallDefaults() {
        // fix for defect 117 - need to restore default table cell
        // renderers when Substance is unset
        for (Map.Entry<Class<?>, TableCellRenderer> entry : this.defaultRenderers.entrySet()) {
            // fix for issue 194 - restore only those renderers that were
            // overriden by Substance.
            this.uninstallRendererIfNecessary(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<Class<?>, TableCellEditor> entry : this.defaultEditors.entrySet()) {
            this.uninstallEditorIfNecessary(entry.getKey(), entry.getValue());
        }

        this.selectedIndices.clear();
        // this.table.putClientProperty(SubstanceTableUI.SELECTED_INDICES,
        // null);

        super.uninstallDefaults();
    }

    /**
     * Uninstalls default Substance renderers that were installed in
     * {@link #installRendererIfNecessary(Class, TableCellRenderer)}.
     * 
     * @param clazz
     *            Column class.
     * @param renderer
     *            Renderer to restore.
     */
    protected void uninstallRendererIfNecessary(Class<?> clazz, TableCellRenderer renderer) {
        TableCellRenderer currRenderer = this.table.getDefaultRenderer(clazz);
        if (currRenderer != null) {
            boolean isSubstanceRenderer = isSubstanceDefaultRenderer(currRenderer);
            if (!isSubstanceRenderer)
                return;
        }
        if (renderer instanceof Component)
            SwingUtilities.updateComponentTreeUI((Component) renderer);
        this.table.setDefaultRenderer(clazz, renderer);
    }

    /**
     * Uninstalls default Substance editors that were installed in
     * {@link #installEditorIfNecessary(Class, TableCellEditor)}.
     * 
     * @param clazz
     *            Column class.
     * @param editor
     *            Editor to restore.
     */
    protected void uninstallEditorIfNecessary(Class<?> clazz, TableCellEditor editor) {
        TableCellEditor currEditor = this.table.getDefaultEditor(clazz);
        if (currEditor != null) {
            boolean isSubstanceEditor = isSubstanceDefaultEditor(currEditor);
            if (!isSubstanceEditor)
                return;
        }
        if (editor instanceof Component)
            SwingUtilities.updateComponentTreeUI((Component) editor);
        this.table.setDefaultEditor(clazz, editor);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicTableUI#installListeners()
     */
    @Override
    protected void installListeners() {
        super.installListeners();
        this.substancePropertyChangeListener = (PropertyChangeEvent evt) -> {
            if (SubstanceSynapse.WATERMARK_VISIBLE.equals(evt.getPropertyName())) {
                SubstanceTableUI.this.table.setOpaque(
                        !SubstanceCoreUtilities.toDrawWatermark(SubstanceTableUI.this.table));
            }

            if ("columnSelectionAllowed".equals(evt.getPropertyName())
                    || "rowSelectionAllowed".equals(evt.getPropertyName())) {
                SubstanceTableUI.this.syncSelection(true);
            }

            if ("model".equals(evt.getPropertyName())) {
                TableModel old = (TableModel) evt.getOldValue();
                if (old != null) {
                    old.removeTableModelListener(substanceTableStateListener);
                }
                // fix for defect 291 - track changes to the table.
                table.getModel().addTableModelListener(substanceTableStateListener);
                selectedIndices.clear();
                stateTransitionMultiTracker.clear();
                SubstanceTableUI.this.syncSelection(true);
            }

            if ("columnModel".equals(evt.getPropertyName())) {
                TableColumnModel old = (TableColumnModel) evt.getOldValue();
                if (old != null) {
                    old.getSelectionModel()
                            .removeListSelectionListener(substanceTableStateListener);
                }
                table.getColumnModel().getSelectionModel()
                        .addListSelectionListener(substanceTableStateListener);
                selectedIndices.clear();
                stateTransitionMultiTracker.clear();
                SubstanceTableUI.this.syncSelection(true);

                JTableHeader tableHeader = table.getTableHeader();
                // fix for issue 408 - table header may be null.
                if (tableHeader != null) {
                    // fix for issue 309 - syncing animations on tables
                    // and table headers.
                    SubstanceTableHeaderUI headerUI = (SubstanceTableHeaderUI) tableHeader.getUI();
                    headerUI.processColumnModelChangeEvent((TableColumnModel) evt.getOldValue(),
                            (TableColumnModel) evt.getNewValue());
                }
            }

            // fix for defect 243 - not tracking changes to selection
            // model results in incorrect selection painting on JXTreeTable
            // component from SwingX.
            if ("selectionModel".equals(evt.getPropertyName())) {
                ListSelectionModel old = (ListSelectionModel) evt.getOldValue();
                if (old != null) {
                    old.removeListSelectionListener(substanceTableStateListener);
                }
                table.getSelectionModel().addListSelectionListener(substanceTableStateListener);
                selectedIndices.clear();
                stateTransitionMultiTracker.clear();
                SubstanceTableUI.this.syncSelection(true);
            }

            // fix for issue 479 - tracking sort / filter changes and
            // canceling selection animations
            if ("rowSorter".equals(evt.getPropertyName())) {
                RowSorter old = (RowSorter) evt.getOldValue();
                if (old != null) {
                    old.removeRowSorterListener(substanceTableStateListener);
                }
                RowSorter newSorter = (RowSorter) evt.getNewValue();
                if (newSorter != null) {
                    newSorter.addRowSorterListener(substanceTableStateListener);
                }
                selectedIndices.clear();
                stateTransitionMultiTracker.clear();
                SubstanceTableUI.this.syncSelection(true);
            }

            if ("font".equals(evt.getPropertyName())) {
                SwingUtilities.invokeLater(() -> {
                    // fix for bug 341
                    if (table == null)
                        return;
                    table.updateUI();
                });
            }

            if ("background".equals(evt.getPropertyName())) {
                // propagate application-specific background color to the
                // header.
                Color newBackgr = (Color) evt.getNewValue();
                JTableHeader header = table.getTableHeader();
                if (header != null) {
                    Color headerBackground = header.getBackground();
                    if (SubstanceCoreUtilities.canReplaceChildBackgroundColor(headerBackground)) {
                        if (!(newBackgr instanceof UIResource)) {
                            if (newBackgr == null) {
                                header.setBackground(null);
                            } else {
                                // Issue 450 - wrap the color in
                                // SubstanceColorResource to
                                // mark that it can be replaced.
                                header.setBackground(new SubstanceColorResource(newBackgr));
                            }
                        } else {
                            header.setBackground(newBackgr);
                        }
                    }
                }
            }

            // fix for issue 361 - track enabled status of the table
            // and propagate to the table header
            if ("enabled".equals(evt.getPropertyName())) {
                JTableHeader header = table.getTableHeader();
                if (header != null) {
                    header.setEnabled(table.isEnabled());
                }
            }

            if ("dropLocation".equals(evt.getPropertyName())) {
                JTable.DropLocation oldValue = (JTable.DropLocation) evt.getOldValue();
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

            if ("tableCellEditor".equals(evt.getPropertyName())) {
                // fix for issue 481 - rollovers on cell editing
                TableCellEditor newEditor = (TableCellEditor) evt.getNewValue();
                TableCellEditor oldEditor = (TableCellEditor) evt.getOldValue();
                if (oldEditor != null) {
                    table.getEditorComponent().removeMouseListener(substanceFadeRolloverListener);
                }
                if (newEditor != null) {
                    table.getEditorComponent().addMouseListener(substanceFadeRolloverListener);
                }
            }
        };
        this.table.addPropertyChangeListener(this.substancePropertyChangeListener);

        // Add listener for the selection animation
        this.substanceTableStateListener = new TableStateListener();
        this.table.getSelectionModel().addListSelectionListener(this.substanceTableStateListener);
        TableColumnModel columnModel = this.table.getColumnModel();
        columnModel.getSelectionModel().addListSelectionListener(this.substanceTableStateListener);
        this.table.getModel().addTableModelListener(this.substanceTableStateListener);
        if (this.table.getRowSorter() != null) {
            this.table.getRowSorter().addRowSorterListener(this.substanceTableStateListener);
        }

        // Add listener for the transition animation
        this.substanceFadeRolloverListener = new RolloverFadeListener();
        this.table.addMouseMotionListener(this.substanceFadeRolloverListener);
        this.table.addMouseListener(this.substanceFadeRolloverListener);

        // fix for issue 481 - tracking focus events on the table
        this.substanceFocusListener = new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {
                if (focusedCellId == null)
                    return;

                ComponentState cellState = getCellState(focusedCellId);
                StateTransitionTracker tracker = getTracker(focusedCellId,
                        cellState.isFacetActive(ComponentStateFacet.ROLLOVER),
                        cellState.isFacetActive(ComponentStateFacet.SELECTION));
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
                            cellState.isFacetActive(ComponentStateFacet.ROLLOVER),
                            cellState.isFacetActive(ComponentStateFacet.SELECTION));
                    tracker.setFocusState(true);

                    focusedCellId = toFocus;
                }
            }
        };
        this.table.addFocusListener(this.substanceFocusListener);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicTableUI#uninstallListeners()
     */
    @Override
    protected void uninstallListeners() {
        this.table.removePropertyChangeListener(this.substancePropertyChangeListener);
        this.substancePropertyChangeListener = null;

        this.table.getSelectionModel()
                .removeListSelectionListener(this.substanceTableStateListener);
        this.table.getColumnModel().getSelectionModel()
                .removeListSelectionListener(this.substanceTableStateListener);
        this.table.getModel().removeTableModelListener(this.substanceTableStateListener);
        if (this.table.getRowSorter() != null) {
            this.table.getRowSorter().removeRowSorterListener(this.substanceTableStateListener);
        }
        this.substanceTableStateListener = null;

        // Remove listener for the fade animation
        this.table.removeMouseMotionListener(this.substanceFadeRolloverListener);
        this.table.removeMouseListener(this.substanceFadeRolloverListener);
        this.substanceFadeRolloverListener = null;

        this.table.removeFocusListener(this.substanceFocusListener);
        this.substanceFocusListener = null;

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
        float alpha = SubstanceColorSchemeUtilities.getAlpha(this.table, currState);
        g2d.setComposite(WidgetUtilities.getAlphaComposite(this.table, alpha, g));

        Color gridColor = this.table.getGridColor();
        if (gridColor instanceof UIResource) {
            SubstanceColorScheme scheme = SubstanceColorSchemeUtilities.getColorScheme(this.table,
                    ColorSchemeAssociationKind.BORDER,
                    this.table.isEnabled() ? ComponentState.ENABLED
                            : ComponentState.DISABLED_UNSELECTED);
            gridColor = scheme.getLineColor();
        }
        g2d.setColor(gridColor);

        Rectangle minCell = this.table.getCellRect(rMin, cMin, true);
        Rectangle maxCell = this.table.getCellRect(rMax, cMax, true);
        Rectangle damagedArea = minCell.union(maxCell);

        float strokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
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
                    if (hasLeadingVerticalGridLine(cm, column)) {
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
                    if (hasLeadingVerticalGridLine(cm, column)) {
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

    private boolean hasLeadingVerticalGridLine(TableColumnModel cm, int column) {
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

        // Fix for https://github.com/kirill-grouchnikov/substance/issues/70 -
        // don't paint the dragged cell if dragged column index is negative (otherwise
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
            boolean isSubstanceRenderer = isSubstanceDefaultRenderer(renderer);
            rendererComponent = this.table.prepareRenderer(renderer, row, column);
            boolean isSubstanceRendererComponent = isSubstanceDefaultRenderer(rendererComponent);
            if (isSubstanceRenderer && !isSubstanceRendererComponent) {
                throw new IllegalArgumentException(
                        "Renderer extends the SubstanceDefaultTableCellRenderer but does not return one in its getTableCellRendererComponent() method");
            }

            if (!isSubstanceRenderer) {
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
        if (!updateInfo.hasRolloverAnimations && !updateInfo.hasSelectionAnimations)
            activeStates = null;
        ComponentState currState = ((modelStateInfo == null) ? this.getCellState(cellId)
                : modelStateInfo.getCurrModelState());

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

        Set<SubstanceSlices.Side> highlightOpenSides = null;
        float highlightBorderAlpha = 0.0f;

        if (hasHighlights) {
            // compute the highlight visuals, but only if there are
            // highlights on this cell (optimization)
            highlightOpenSides = EnumSet.noneOf(Side.class);
            // show highlight border only when the table grid is not shown
            highlightBorderAlpha = (table.getShowHorizontalLines() || table.getShowVerticalLines())
                    ? 0.0f
                    : 0.8f;
            if (!table.getColumnSelectionAllowed() && table.getRowSelectionAllowed()) {
                // if row selection is on and column selection is off, we
                // will show the highlight for the entire row

                // all cells have open left side
                highlightOpenSides.add(SubstanceSlices.Side.LEFT);
                // all cells have open right side
                highlightOpenSides.add(SubstanceSlices.Side.RIGHT);
            }
            if (table.getColumnSelectionAllowed() && !table.getRowSelectionAllowed()) {
                // if row selection is off and column selection is on, we
                // will show the highlight for the entire column

                // the top side is open for all rows except the
                // first, or when the table header is visible
                highlightOpenSides.add(SubstanceSlices.Side.TOP);
                // all cells but the last have open bottom side
                highlightOpenSides.add(SubstanceSlices.Side.BOTTOM);
            }
            if (row > 1) {
                ComponentState upperNeighbourState = this
                        .getCellState(new TableCellId(row - 1, column));
                if (currState == upperNeighbourState) {
                    // the cell above it is in the same state
                    highlightOpenSides.add(SubstanceSlices.Side.TOP);
                }
            }
            if (column > 1) {
                ComponentState leftNeighbourState = this
                        .getCellState(new TableCellId(row, column - 1));
                if (currState == leftNeighbourState) {
                    // the cell to the left is in the same state
                    highlightOpenSides.add(SubstanceSlices.Side.LEFT);
                }
            }
            if (row == 0) {
                highlightOpenSides.add(SubstanceSlices.Side.TOP);
            }
            if (row == (table.getRowCount() - 1)) {
                highlightOpenSides.add(SubstanceSlices.Side.BOTTOM);
            }
            if (column == 0) {
                highlightOpenSides.add(SubstanceSlices.Side.LEFT);
            }
            if (column == (table.getColumnCount() - 1)) {
                highlightOpenSides.add(SubstanceSlices.Side.RIGHT);
            }
        }

        boolean isRollover = this.rolledOverIndices.contains(cellId);
        if (this.table.isEditing() && this.table.getEditingRow() == row
                && this.table.getEditingColumn() == column) {
            Component component = this.table.getEditorComponent();
            component.applyComponentOrientation(this.table.getComponentOrientation());

            if (hasHighlights) {
                float extra = SubstanceSizeUtils.getBorderStrokeWidth();
                float extraWidth = highlightOpenSides.contains(SubstanceSlices.Side.LEFT) ? 0.0f
                        : extra;
                float extraHeight = highlightOpenSides.contains(SubstanceSlices.Side.TOP) ? 0.0f
                        : extra;
                Rectangle highlightRect = new Rectangle(highlightCellRect.x - (int) extraWidth,
                        highlightCellRect.y - (int) extraHeight,
                        highlightCellRect.width + (int) extraWidth,
                        highlightCellRect.height + (int) extraHeight);
                if (activeStates == null) {
                    float alpha = this.updateInfo.getHighlightAlpha(currState);
                    if (alpha > 0.0f) {
                        SubstanceColorScheme fillScheme = this.updateInfo
                                .getHighlightColorScheme(currState);
                        SubstanceColorScheme borderScheme = this.updateInfo
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
                        SubstanceColorScheme fillScheme = this.updateInfo
                                .getHighlightColorScheme(activeState);
                        SubstanceColorScheme borderScheme = this.updateInfo
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
            boolean isWatermarkBleed = this.updateInfo.toDrawWatermark;
            if (rendererComponent != null) {
                if (!isWatermarkBleed) {
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
                } else {
                    BackgroundPaintingUtils.fillAndWatermark(g2d, this.table,
                            rendererComponent.getBackground(), highlightCellRect);
                }
            }

            if (hasHighlights) {
                JTable.DropLocation dropLocation = table.getDropLocation();
                if (dropLocation != null && !dropLocation.isInsertRow()
                        && !dropLocation.isInsertColumn() && dropLocation.getRow() == row
                        && dropLocation.getColumn() == column) {
                    // mark drop location
                    SubstanceColorScheme scheme = SubstanceColorSchemeUtilities.getColorScheme(
                            table, ColorSchemeAssociationKind.HIGHLIGHT_TEXT, currState);
                    SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
                            .getColorScheme(table, ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
                                    currState);
                    float extra = SubstanceSizeUtils.getBorderStrokeWidth();
                    HighlightPainterUtils.paintHighlight(g2d, this.rendererPane, rendererComponent,
                            new Rectangle(highlightCellRect.x - (int) extra,
                                    highlightCellRect.y - (int) extra,
                                    highlightCellRect.width + (int) extra,
                                    highlightCellRect.height + (int) extra),
                            0.8f, null, scheme, borderScheme);
                } else {
                    float extra = SubstanceSizeUtils.getBorderStrokeWidth();
                    float extraWidth = highlightOpenSides.contains(SubstanceSlices.Side.LEFT) ? 0.0f
                            : extra;
                    float extraHeight = highlightOpenSides.contains(SubstanceSlices.Side.TOP) ? 0.0f
                            : extra;
                    Rectangle highlightRect = new Rectangle(highlightCellRect.x - (int) extraWidth,
                            highlightCellRect.y - (int) extraHeight,
                            highlightCellRect.width + (int) extraWidth,
                            highlightCellRect.height + (int) extraHeight);
                    if (activeStates == null) {
                        SubstanceColorScheme fillScheme = this.updateInfo
                                .getHighlightColorScheme(currState);
                        SubstanceColorScheme borderScheme = this.updateInfo
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
                            SubstanceColorScheme fillScheme = this.updateInfo
                                    .getHighlightColorScheme(activeState);
                            SubstanceColorScheme borderScheme = this.updateInfo
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

                if (this.updateInfo.toDrawWatermark)
                    newOpaque = false;

                Map<Component, Boolean> opacity = new HashMap<Component, Boolean>();
                if (!newOpaque)
                    SubstanceCoreUtilities.makeNonOpaque(jRenderer, opacity);
                this.rendererPane.paintComponent(g2d, rendererComponent, this.table, cellRect.x,
                        cellRect.y, cellRect.width, cellRect.height, true);
                if (!newOpaque)
                    SubstanceCoreUtilities.restoreOpaque(jRenderer, opacity);
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
    protected class CellRepaintCallback extends UIThreadTimelineCallbackAdapter {
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
         * @param table
         *            Associated table.
         * @param rowIndex
         *            Associated (animated) row index.
         * @param columnIndex
         *            Associated (animated) column index.
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
                if (SubstanceTableUI.this.table == null) {
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
     * Repaints a single row during the fade animation cycle.
     * 
     * @author Kirill Grouchnikov
     */
    protected class RowRepaintCallback extends UIThreadTimelineCallbackAdapter {
        /**
         * Associated table.
         */
        protected JTable table;

        /**
         * Associated (animated) row index.
         */
        protected int rowIndex;

        /**
         * Creates a new animation repaint callback.
         * 
         * @param table
         *            Associated table.
         * @param rowIndex
         *            Associated (animated) row index.
         */
        public RowRepaintCallback(JTable table, int rowIndex) {
            super();
            this.table = table;
            this.rowIndex = rowIndex;
        }

        @Override
        public void onTimelinePulse(float durationFraction, float timelinePosition) {
            this.repaintRow();
        }

        @Override
        public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                float durationFraction, float timelinePosition) {
            this.repaintRow();
        }

        /**
         * Repaints the associated row.
         */
        private void repaintRow() {
            SwingUtilities.invokeLater(() -> {
                if (SubstanceTableUI.this.table == null) {
                    // may happen if the LAF was switched in the meantime
                    return;
                }
                int rowCount = RowRepaintCallback.this.table.getRowCount();
                if ((rowCount > 0) && (RowRepaintCallback.this.rowIndex < rowCount)) {
                    // need to retrieve the cell rectangle since the cells
                    // can be moved while animating
                    Rectangle rect = RowRepaintCallback.this.table
                            .getCellRect(RowRepaintCallback.this.rowIndex, 0, true);
                    for (int i = 1; i < RowRepaintCallback.this.table.getColumnCount(); i++) {
                        rect = rect.union(RowRepaintCallback.this.table
                                .getCellRect(RowRepaintCallback.this.rowIndex, i, true));
                    }
                    if (!table.getShowHorizontalLines() && !table.getShowVerticalLines()) {
                        float extra = SubstanceSizeUtils.getBorderStrokeWidth();
                        rect.y -= (int) extra;
                        rect.height += 2 * (int) extra;
                    }
                    // System.out.println("Repainting row " + rowIndex
                    // + " at " + rect);
                    RowRepaintCallback.this.table.repaint(rect);
                }
            });
        }
    }

    /**
     * Repaints a single column during the fade animation cycle.
     * 
     * @author Kirill Grouchnikov
     */
    protected class ColumnRepaintCallback extends UIThreadTimelineCallbackAdapter {
        /**
         * Associated table.
         */
        protected JTable table;

        /**
         * Associated (animated) column index.
         */
        protected int columnIndex;

        /**
         * Creates a new animation repaint callback.
         * 
         * @param table
         *            Associated table.
         * @param columnIndex
         *            Associated (animated) column index.
         */
        public ColumnRepaintCallback(JTable table, int columnIndex) {
            super();
            this.table = table;
            this.columnIndex = columnIndex;
        }

        @Override
        public void onTimelinePulse(float durationFraction, float timelinePosition) {
            this.repaintColumn();
        }

        @Override
        public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                float durationFraction, float timelinePosition) {
            this.repaintColumn();
        }

        /**
         * Repaints the associated row.
         */
        private void repaintColumn() {
            SwingUtilities.invokeLater(() -> {
                if (SubstanceTableUI.this.table == null) {
                    // may happen if the LAF was switched in the meantime
                    return;
                }
                int columnCount = ColumnRepaintCallback.this.table.getColumnCount();
                if ((columnCount > 0) && (ColumnRepaintCallback.this.columnIndex < columnCount)) {
                    // need to retrieve the cell rectangle since the cells
                    // can be moved while animating
                    Rectangle rect = ColumnRepaintCallback.this.table.getCellRect(0,
                            ColumnRepaintCallback.this.columnIndex, true);
                    for (int i = 1; i < ColumnRepaintCallback.this.table.getRowCount(); i++) {
                        rect = rect.union(ColumnRepaintCallback.this.table.getCellRect(i,
                                ColumnRepaintCallback.this.columnIndex, true));
                    }
                    if (!table.getShowHorizontalLines() && !table.getShowVerticalLines()) {
                        float extra = SubstanceSizeUtils.getBorderStrokeWidth();
                        rect.x -= (int) extra;
                        rect.width += 2 * (int) extra;
                    }
                    ColumnRepaintCallback.this.table.repaint(rect);
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
         * @param row
         *            Cell row.
         * @param column
         *            Cell column.
         */
        public TableCellId(int row, int column) {
            this.row = row;
            this.column = column;
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Comparable#compareTo(java.lang.Object)
         */
        @Override
        public int compareTo(TableCellId o) {
            if (row == o.row) {
                return Integer.compare(column, o.column);
            } else {
                return Integer.compare(row, o.row);
            }
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TableCellId) {
                return this.compareTo((TableCellId) obj) == 0;
            }
            return false;
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {
            return (this.row ^ (this.row << 16)) & (this.column ^ (this.column << 16));
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Object#toString()
         */
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

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.event.ListSelectionListener#valueChanged(javax.swing.
         * event.ListSelectionEvent)
         */
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
                oldSortKeys = new ArrayList<SortKey>();
                for (SortKey sortKey : sortKeys) {
                    SortKey copy = new SortKey(sortKey.getColumn(), sortKey.getSortOrder());
                    oldSortKeys.add(copy);
                }
            }
            syncSelection(isDifferentSorter);
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.event.TableModelListener#tableChanged(javax.swing.event
         * .TableModelEvent)
         */
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

            if (table == null)
                return;

            if (!table.isEnabled())
                return;

            // check the mouse location. If the cell editor has been shown
            // or hidden, we will get a mouseExited() event, but shouldn't
            // be changing the rollover indication if the mouse is still
            // over the table
            PointerInfo pi = MouseInfo.getPointerInfo();
            Point mouseLoc = pi != null ? pi.getLocation() : null;
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
        }

        public void mouseMoved(MouseEvent e) {
            if (!SubstanceTableUI.this.table.isEnabled())
                return;
            handleMouseMove(e.getPoint());
            this.handleMoveForHeader(e);
        }

        public void mouseDragged(MouseEvent e) {
            if (!SubstanceTableUI.this.table.isEnabled())
                return;
            handleMouseMove(e.getPoint());
            this.handleMoveForHeader(e);
        }

        /**
         * Handles various mouse move events and initiates the fade animation if necessary.
         * 
         * @param e
         *            Mouse event.
         */
        private void handleMoveForHeader(MouseEvent e) {
            if (!SubstanceTableUI.this.table.getColumnSelectionAllowed())
                return;
            JTableHeader header = SubstanceTableUI.this.table.getTableHeader();
            if ((header == null) || (!header.isVisible()))
                return;

            TableHeaderUI ui = header.getUI();
            if (!(ui instanceof SubstanceTableHeaderUI))
                return;

            SubstanceTableHeaderUI sthui = (SubstanceTableHeaderUI) ui;

            // synchronized (SubstanceTableUI.this.table) {
            int row = SubstanceTableUI.this.table.rowAtPoint(e.getPoint());
            int column = SubstanceTableUI.this.table.columnAtPoint(e.getPoint());
            if ((row < 0) || (row >= SubstanceTableUI.this.table.getRowCount()) || (column < 0)
                    || (column >= SubstanceTableUI.this.table.getColumnCount())) {
                this.fadeOutTableHeader();
                // System.out.println("Nulling RO column index");
                SubstanceTableUI.this.rolledOverColumn = -1;
            } else {
                // check if this is the same column
                if (SubstanceTableUI.this.rolledOverColumn == column)
                    return;

                this.fadeOutTableHeader();

                TableColumnModel columnModel = header.getColumnModel();
                StateTransitionTracker columnTransitionTracker = sthui.getTracker(column, false,
                        columnModel.getColumnSelectionAllowed()
                                && columnModel.getSelectionModel().isSelectedIndex(column));
                columnTransitionTracker.getModel().setRollover(true);

                SubstanceTableUI.this.rolledOverColumn = column;
            }
            // }
        }

        /**
         * Initiates the fade out effect.
         */
        private void fadeOutTableHeader() {
            if (SubstanceTableUI.this.rolledOverColumn >= 0) {
                JTableHeader header = SubstanceTableUI.this.table.getTableHeader();
                if ((header == null) || (!header.isVisible()))
                    return;
                SubstanceTableHeaderUI ui = (SubstanceTableHeaderUI) header.getUI();

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
         * @param e
         *            Mouse event.
         */
        private void handleMouseMove(Point mousePoint) {
            // synchronized (SubstanceTableUI.this.table) {
            int row = table.rowAtPoint(mousePoint);
            int column = table.columnAtPoint(mousePoint);
            if ((row < 0) || (row >= table.getRowCount()) || (column < 0)
                    || (column >= table.getColumnCount())) {
                this.fadeOutAllRollovers();
                // System.out.println("Nulling RO index in handleMove()");
                // table.putClientProperty(ROLLED_OVER_INDEX, null);
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
                Set<TableCellId> toRemove = new HashSet<TableCellId>();
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
                                            .isFacetActive(ComponentStateFacet.SELECTION));
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
                        getCellState(tableCellId).isFacetActive(ComponentStateFacet.SELECTION));
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
     * @param row
     *            Row index.
     * @param column
     *            Column index.
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
     * 
     * @param e
     *            Selection event.
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

        Set<StateTransitionTracker> initiatedTrackers = new HashSet<StateTransitionTracker>();

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
                                    .isFacetActive(ComponentStateFacet.ROLLOVER), false);
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
                                                .isFacetActive(ComponentStateFacet.ROLLOVER),
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
                                        cellState.isFacetActive(ComponentStateFacet.ROLLOVER),
                                        cellState.isFacetActive(ComponentStateFacet.SELECTION));
                                tracker.setFocusState(false);
                            }

                            // fade in the current cell (new focus holder)
                            ComponentState cellState = getCellState(cellId);

                            // System.out.println("Getting focus/in tracker for "
                            // + currId);
                            StateTransitionTracker tracker = getTracker(cellId,
                                    cellState.isFacetActive(ComponentStateFacet.ROLLOVER),
                                    cellState.isFacetActive(ComponentStateFacet.SELECTION));
                            tracker.setFocusState(true);
                        }

                        if (AnimationConfigurationManager.getInstance()
                                .isAnimationAllowed(AnimationFacet.FOCUS, this.table)) {
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
                                    cellState.isFacetActive(ComponentStateFacet.ROLLOVER),
                                    cellState.isFacetActive(ComponentStateFacet.SELECTION));
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
     * @param cellIndex
     *            Cell index.
     * @return The current state for the specified cell.
     */
    public ComponentState getCellState(TableCellId cellIndex) {
        boolean isEnabled = this.table.isEnabled();

        StateTransitionTracker tracker = this.stateTransitionMultiTracker.getTracker(cellIndex);
        if (tracker == null) {
            int row = cellIndex.row;
            int column = cellIndex.column;
            TableCellId cellId = this.getId(row, column);
            boolean isRollover = rolledOverIndices.contains(cellId);
            boolean isSelected = false;
            boolean hasSelectionAnimations = (this.updateInfo != null)
                    ? this.updateInfo.hasSelectionAnimations
                    : this._hasSelectionAnimations();
            if (hasSelectionAnimations && AnimationConfigurationManager.getInstance()
                    .isAnimationAllowed(AnimationFacet.SELECTION, table))
                isSelected = this.selectedIndices.containsKey(cellId);
            else {
                isSelected = this.table.isCellSelected(row, column);
            }
            return ComponentState.getState(isEnabled, isRollover, isSelected);
        } else {
            ComponentState fromTracker = tracker.getModelStateInfo().getCurrModelState();
            return ComponentState.getState(isEnabled,
                    fromTracker.isFacetActive(ComponentStateFacet.ROLLOVER),
                    fromTracker.isFacetActive(ComponentStateFacet.SELECTION));
        }
    }

    /**
     * Returns the current state for the specified cell.
     * 
     * @param cellId
     *            Cell index.
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
     *         otherwise.
     */
    protected boolean _hasSelectionAnimations() {
        return this._hasAnimations()
                && !WidgetUtilities.hasNoAnimations(this.table, AnimationFacet.SELECTION);
    }

    /**
     * Checks whether the table has rollover animations.
     * 
     * @return <code>true</code> if the table has rollover animations, <code>false</code> otherwise.
     */
    protected boolean _hasRolloverAnimations() {
        return this._hasAnimations()
                && !WidgetUtilities.hasNoAnimations(this.table, AnimationFacet.ROLLOVER);
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
     * @param row
     *            Cell row index.
     * @param column
     *            Cell column index.
     * @return <code>true</code> If the focus is on the specified cell, <code>false</code>
     *         otherwise.
     */
    public boolean isFocusedCell(int row, int column) {
        return (this.focusedCellId != null) && (this.focusedCellId.row == row)
                && (this.focusedCellId.column == column);
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
        this.updateInfo = new TableUpdateOptimizationInfo();
        this.paint(g2d, c);
        SubstanceStripingUtils.tearDown(c);
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

    private boolean isSubstanceDefaultRenderer(Object instance) {
        return (instance instanceof SubstanceDefaultTableCellRenderer)
                || (instance instanceof SubstanceDefaultTableCellRenderer.BooleanRenderer);
    }

    private boolean isSubstanceDefaultEditor(TableCellEditor editor) {
        return (editor instanceof BooleanEditor);
    }

    private Rectangle getCellRectangleForRepaint(int row, int column) {
        Rectangle rect = this.table.getCellRect(row, column, true);

        if (!table.getShowHorizontalLines() && !table.getShowVerticalLines()) {
            float extra = SubstanceSizeUtils.getBorderStrokeWidth();
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
