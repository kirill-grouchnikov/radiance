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
package org.pushingpixels.substance.internal.ui;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultTreeCellRenderer;
import org.pushingpixels.substance.internal.SubstanceWidgetRepository;
import org.pushingpixels.substance.internal.animation.StateTransitionMultiTracker;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.HighlightPainterUtils;
import org.pushingpixels.substance.internal.utils.*;
import org.pushingpixels.substance.internal.utils.icon.SubstanceIconFactory;
import org.pushingpixels.trident.api.Timeline.TimelineState;
import org.pushingpixels.trident.api.swing.EventDispatchThreadTimelineCallbackAdapter;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeListener;
import java.util.*;

/**
 * UI for lists in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceTreeUI extends BasicTreeUI {
	/**
	 * Holds the list of currently selected paths.
	 */
	private Map<TreePathId, Object> selectedPaths;

	/**
	 * Holds the currently rolled-over path or <code>null</code> if none such.
	 */
	private TreePathId currRolloverPathId;

	/**
	 * Listener that listens to changes on tree properties.
	 */
	private PropertyChangeListener substancePropertyChangeListener;

	/**
	 * Listener for selection animations.
	 */
	private TreeSelectionListener substanceSelectionFadeListener;

	/**
	 * Listener for transition animations on tree rollovers.
	 */
	private RolloverFadeListener substanceFadeRolloverListener;

	/**
	 * Listener for selection of an entire row.
	 */
	private MouseListener substanceRowSelectionListener;

	private StateTransitionMultiTracker<TreePathId> stateTransitionMultiTracker;

	/**
	 * The current default color scheme. Is computed in
	 * {@link #update(Graphics, JComponent)} and reused in
	 * {@link SubstanceDefaultTreeCellRenderer#getTreeCellRendererComponent(JTree, Object, boolean, boolean, boolean, int, boolean)}
	 * for performance optimizations.
	 */
	private SubstanceColorScheme currDefaultColorScheme;

	/**
	 * Cell renderer insets. Is computed in {@link #installDefaults()} and
	 * reused in
	 * {@link SubstanceDefaultTreeCellRenderer#getTreeCellRendererComponent(JTree, Object, boolean, boolean, boolean, int, boolean)}
	 * for performance optimizations.
	 */
	private Insets cellRendererInsets;

	private Set<SubstanceWidget<JComponent>> lafWidgets;

	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceTreeUI();
	}

	/**
	 * Creates a UI delegate for tree.
	 */
	private SubstanceTreeUI() {
		super();
		this.selectedPaths = new HashMap<>();
		this.stateTransitionMultiTracker = new StateTransitionMultiTracker<>();
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

	@Override
	protected void installDefaults() {
		super.installDefaults();

		if (this.tree.getSelectionPaths() != null) {
			for (TreePath selectionPath : this.tree.getSelectionPaths()) {
				TreePathId pathId = new TreePathId(selectionPath);
				selectedPaths.put(pathId, selectionPath.getLastPathComponent());
			}
		}

		ResizableIcon expandedIcon = SubstanceIconFactory.getTreeIcon(this.tree, false);
		ResizableIcon collapsedIcon = SubstanceIconFactory.getTreeIcon(this.tree, true);
		setExpandedIcon(new ResizableIconUIResource(expandedIcon));
		setCollapsedIcon(new ResizableIconUIResource(collapsedIcon));

		// instead of computing the cell renderer insets on
		// every cell rendering, compute it once and expose to the
		// SubstanceDefaultTreeCellRenderer
		this.cellRendererInsets = SubstanceSizeUtils
				.getTreeCellRendererInsets(SubstanceSizeUtils.getComponentFontSize(tree));

		for (SubstanceWidget lafWidget : this.lafWidgets) {
			lafWidget.installDefaults();
		}
	}

	@Override
	protected void uninstallDefaults() {
		this.selectedPaths.clear();
		for (SubstanceWidget lafWidget : this.lafWidgets) {
			lafWidget.uninstallDefaults();
		}
		super.uninstallDefaults();
	}

	@Override
	protected void paintRow(Graphics g, Rectangle clipBounds, Insets insets, Rectangle bounds,
			TreePath path, int row, boolean isExpanded, boolean hasBeenExpanded, boolean isLeaf) {
		// Don't paint the renderer if editing this row.
		if ((this.editingComponent != null) && (this.editingRow == row)) {
			// fix for issue 446 - paint the expand control
			// on the editing row
			if (shouldPaintExpandControl(path, row, isExpanded, hasBeenExpanded, isLeaf)) {
				paintExpandControlEnforce(g, clipBounds, insets, bounds, path, row, isExpanded,
						hasBeenExpanded, isLeaf);
			}
		}

		int leadIndex;

		if (this.tree.hasFocus()) {
			TreePath leadPath = this.tree.getLeadSelectionPath();
			leadIndex = this.getRowForPath(this.tree, leadPath);
		} else {
			leadIndex = -1;
		}

		Component renderer = this.currentCellRenderer.getTreeCellRendererComponent(this.tree,
				path.getLastPathComponent(), this.tree.isRowSelected(row), isExpanded, isLeaf, row,
				(leadIndex == row));

		if (!(renderer instanceof SubstanceDefaultTreeCellRenderer)) {
			// if it's not Substance renderer - ask the Basic delegate to paint
			// it.
			super.paintRow(g, clipBounds, insets, bounds, path, row, isExpanded, hasBeenExpanded,
					isLeaf);
			if (shouldPaintExpandControl(path, row, isExpanded, hasBeenExpanded, isLeaf)) {
				paintExpandControlEnforce(g, clipBounds, insets, bounds, path, row, isExpanded,
						hasBeenExpanded, isLeaf);
			}
			return;
		}

		TreePathId pathId = new TreePathId(path);

		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setComposite(WidgetUtilities.getAlphaComposite(tree, g));

		// Color background = renderer.getBackground();
		// if (background == null)
		// background = tree.getBackground();

		StateTransitionTracker.ModelStateInfo modelStateInfo = getModelStateInfo(pathId);
		Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = ((modelStateInfo == null)
				? null
				: modelStateInfo.getStateContributionMap());
		ComponentState currState = ((modelStateInfo == null) ? getPathState(pathId)
				: modelStateInfo.getCurrModelState());

		// Compute the alpha values for the animation.
		boolean hasHighlights = false;
		if (renderer.isEnabled()) {
			if (activeStates != null) {
				for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> stateEntry : activeStates
						.entrySet()) {
					hasHighlights = (SubstanceColorSchemeUtilities.getHighlightAlpha(this.tree,
							stateEntry.getKey()) * stateEntry.getValue().getContribution() > 0.0f);
					if (hasHighlights)
						break;
				}
			} else {
				hasHighlights = (SubstanceColorSchemeUtilities.getHighlightAlpha(this.tree,
						currState) > 0.0f);
			}
		}

		// System.out.println(row + ":" + prevTheme.getDisplayName() + "["
		// + alphaForPrevBackground + "]:" + currTheme.getDisplayName()
		// + "[" + alphaForCurrBackground + "]");

		// At this point the renderer is an instance of
		// SubstanceDefaultTreeCellRenderer
		JTree.DropLocation dropLocation = tree.getDropLocation();
		Rectangle rowRectangle = new Rectangle(this.tree.getInsets().left, bounds.y,
				this.tree.getWidth() - this.tree.getInsets().right - this.tree.getInsets().left,
				bounds.height);
		if (dropLocation != null && dropLocation.getChildIndex() == -1
				&& tree.getRowForPath(dropLocation.getPath()) == row) {
			// mark drop location
			SubstanceColorScheme scheme = SubstanceColorSchemeUtilities.getColorScheme(tree,
					ColorSchemeAssociationKind.HIGHLIGHT, currState);
			SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities.getColorScheme(tree,
					ColorSchemeAssociationKind.HIGHLIGHT_BORDER, currState);
			HighlightPainterUtils.paintHighlight(g2d, this.rendererPane, renderer, rowRectangle,
					0.8f, null, scheme, borderScheme);
		} else {
			if (hasHighlights) {
				if (activeStates == null) {
					float alpha = SubstanceColorSchemeUtilities.getHighlightAlpha(this.tree,
							currState);
					if (alpha > 0.0f) {
						SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
								.getColorScheme(this.tree,
										ColorSchemeAssociationKind.HIGHLIGHT, currState);
						SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
								.getColorScheme(this.tree,
										ColorSchemeAssociationKind.HIGHLIGHT_BORDER, currState);
						g2d.setComposite(WidgetUtilities.getAlphaComposite(this.tree, alpha, g));
						// Fix for defect 180 - painting the
						// highlight beneath the entire row
						HighlightPainterUtils.paintHighlight(g2d, this.rendererPane, renderer,
								rowRectangle, 0.8f, null, fillScheme, borderScheme);
						g2d.setComposite(WidgetUtilities.getAlphaComposite(this.tree, g));
					}
				} else {
					for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> stateEntry : activeStates
							.entrySet()) {
						ComponentState activeState = stateEntry.getKey();
						float alpha = SubstanceColorSchemeUtilities.getHighlightAlpha(this.tree,
								activeState) * stateEntry.getValue().getContribution();
						if (alpha == 0.0f)
							continue;
						SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
								.getColorScheme(this.tree,
										ColorSchemeAssociationKind.HIGHLIGHT, activeState);
						SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
								.getColorScheme(this.tree,
										ColorSchemeAssociationKind.HIGHLIGHT_BORDER, activeState);
						g2d.setComposite(WidgetUtilities.getAlphaComposite(this.tree, alpha, g));
						// Fix for defect 180 - painting the
						// highlight beneath the entire row
						HighlightPainterUtils.paintHighlight(g2d, this.rendererPane, renderer,
								rowRectangle, 0.8f, null, fillScheme, borderScheme);
						g2d.setComposite(WidgetUtilities.getAlphaComposite(this.tree, g));
					}
				}
			}
		}

		// System.out.println("Painting row " + row);
		// Play with opacity to make our own gradient background
		// on selected elements to show - safe to cast and set opacity
		// since at this point the renderer can only by the
		// SubstanceDefaultTreeCellRenderer
		JComponent jRenderer = (JComponent) renderer;
		boolean newOpaque = !this.tree.isRowSelected(row);

		Map<Component, Boolean> opacity = new HashMap<>();
		if (!newOpaque)
			SubstanceCoreUtilities.makeNonOpaque(jRenderer, opacity);
		this.rendererPane.paintComponent(g2d, renderer, this.tree, bounds.x, bounds.y,
				Math.max(this.tree.getWidth() - this.tree.getInsets().right
						- this.tree.getInsets().left - bounds.x, bounds.width),
				bounds.height, true);
		if (!newOpaque)
			SubstanceCoreUtilities.restoreOpaque(jRenderer, opacity);

		// Paint the expand control now after the row background has been
		// overlayed by the highlight background on selected and rolled over
		// rows. See comments on paintExpandControl().
		if (shouldPaintExpandControl(path, row, isExpanded, hasBeenExpanded, isLeaf)) {
			paintExpandControlEnforce(g2d, clipBounds, insets, bounds, path, row, isExpanded,
					hasBeenExpanded, isLeaf);
		}

		g2d.dispose();
	}

	@Override
	protected void paintExpandControl(Graphics g, Rectangle clipBounds, Insets insets,
			Rectangle bounds, TreePath path, int row, boolean isExpanded, boolean hasBeenExpanded,
			boolean isLeaf) {
		// This does nothing. The base implementation of paint() paints
		// the tree lines and tree expand controls *before* painting the
		// renderer. In Substance, the highlights are painted in the
		// paintRow, and thus would overlay the expand controls. This results
		// in expand controls being much less visible under most of the skins.
		// So, Substance paints the expand controls *after* painting the
		// highlights (and the renderer which doesn't overlap with the expand
		// controls in any case). This is done in paintRow() by calling
		// the paintExpandControlEnforce() instead (that eventually calls the
		// super implementation of paintExpandControl().
	}

	/**
	 * Paints the expand control of the specified row.
	 * 
	 * @param g
	 *            Graphics context.
	 * @param clipBounds
	 *            Clip bounds.
	 * @param insets
	 *            Insets.
	 * @param bounds
	 *            Row bounds.
	 * @param path
	 *            Tree path.
	 * @param row
	 *            Tree row.
	 * @param isExpanded
	 *            Expand indication.
	 * @param hasBeenExpanded
	 *            Indication whether this row has ever been expanded.
	 * @param isLeaf
	 *            Indication whether this row is a leaf.
	 */
	private void paintExpandControlEnforce(Graphics g, Rectangle clipBounds, Insets insets,
			Rectangle bounds, TreePath path, int row, boolean isExpanded, boolean hasBeenExpanded,
			boolean isLeaf) {

		float alpha = SubstanceColorSchemeUtilities.getAlpha(this.tree,
				this.tree.isEnabled() ? ComponentState.ENABLED
						: ComponentState.DISABLED_UNSELECTED);

		Graphics2D graphics = (Graphics2D) g.create();
		graphics.setComposite(WidgetUtilities.getAlphaComposite(this.tree, alpha, g));
		super.paintExpandControl(graphics, clipBounds, insets, bounds, path, row, isExpanded,
				hasBeenExpanded, isLeaf);
		graphics.dispose();
	}

	@Override
	protected void paintHorizontalPartOfLeg(Graphics g, Rectangle clipBounds, Insets insets,
			Rectangle bounds, TreePath path, int row, boolean isExpanded, boolean hasBeenExpanded,
			boolean isLeaf) {
	}

	@Override
	protected void paintVerticalPartOfLeg(Graphics g, Rectangle clipBounds, Insets insets,
			TreePath path) {
	}

	@Override
	protected TreeCellRenderer createDefaultCellRenderer() {
		return new SubstanceDefaultTreeCellRenderer();
	}

	@Override
	protected void installListeners() {
		super.installListeners();
		this.substancePropertyChangeListener = propertyChangeEvent -> {
			if ("font".equals(propertyChangeEvent.getPropertyName())) {
				SwingUtilities.invokeLater(() -> {
					tree.updateUI();
					// Update indents so that the expand / collapse icons are not cut off
					int fontSize = SubstanceSizeUtils.getComponentFontSize(tree);
					setLeftChildIndent(SubstanceSizeUtils.getTreeLeftIndent(fontSize));
					setRightChildIndent(SubstanceSizeUtils.getTreeRightIndent(fontSize));
				});
			}
			if ("dropLocation".equals(propertyChangeEvent.getPropertyName())) {
				JTree.DropLocation oldValue = (JTree.DropLocation) propertyChangeEvent.getOldValue();
				if (oldValue != null) {
					TreePath oldDrop = oldValue.getPath();
					Rectangle oldBounds = getPathBounds(tree, oldDrop);
					tree.repaint(0, oldBounds.y, tree.getWidth(), oldBounds.height);
				}
				JTree.DropLocation currLocation = tree.getDropLocation();
				if (currLocation != null) {
					TreePath newDrop = currLocation.getPath();
					if (newDrop != null) {
						Rectangle newBounds = getPathBounds(tree, newDrop);
						tree.repaint(0, newBounds.y, tree.getWidth(), newBounds.height);
					}
				}
			}
		};
		this.tree.addPropertyChangeListener(this.substancePropertyChangeListener);

		this.substanceSelectionFadeListener = new MyTreeSelectionListener();
		this.tree.getSelectionModel().addTreeSelectionListener(this.substanceSelectionFadeListener);

		this.substanceRowSelectionListener = new RowSelectionListener();
		this.tree.addMouseListener(this.substanceRowSelectionListener);

		// Add listener for the fade animation
		this.substanceFadeRolloverListener = new RolloverFadeListener();
		this.tree.addMouseMotionListener(this.substanceFadeRolloverListener);
		this.tree.addMouseListener(this.substanceFadeRolloverListener);

		for (SubstanceWidget lafWidget : this.lafWidgets) {
			lafWidget.installListeners();
		}
	}

	@Override
	protected void uninstallListeners() {
		this.tree.removeMouseListener(this.substanceRowSelectionListener);
		this.substanceRowSelectionListener = null;

		this.tree.getSelectionModel()
				.removeTreeSelectionListener(this.substanceSelectionFadeListener);
		this.substanceSelectionFadeListener = null;

		this.tree.removePropertyChangeListener(this.substancePropertyChangeListener);
		this.substancePropertyChangeListener = null;

		// Remove listener for the fade animation
		this.tree.removeMouseMotionListener(this.substanceFadeRolloverListener);
		this.tree.removeMouseListener(this.substanceFadeRolloverListener);
		this.substanceFadeRolloverListener = null;

		for (SubstanceWidget lafWidget : this.lafWidgets) {
			lafWidget.uninstallListeners();
		}

		super.uninstallListeners();
	}

	@Override
	protected void installComponents() {
		super.installComponents();

		for (SubstanceWidget lafWidget : this.lafWidgets) {
			lafWidget.installComponents();
		}
	}

	@Override
	protected void uninstallComponents() {
		for (SubstanceWidget lafWidget : this.lafWidgets) {
			lafWidget.uninstallComponents();
		}

		super.uninstallComponents();
	}

	/**
	 * ID of a single tree path.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static class TreePathId implements Comparable<TreePathId> {
		/**
		 * Tree path.
		 */
		protected TreePath path;

		/**
		 * Creates a tree path ID.
		 * 
		 * @param path
		 *            Tree path.
		 */
		public TreePathId(TreePath path) {
			this.path = path;
		}

		@Override
		public int compareTo(TreePathId otherId) {
			if ((this.path == null) && (otherId.path != null))
				return 1;
			if ((otherId.path == null) && (this.path != null))
				return -1;
			Object[] path1Objs = this.path.getPath();
			Object[] path2Objs = otherId.path.getPath();
			if (path1Objs.length != path2Objs.length)
				return 1;
			for (int i = 0; i < path1Objs.length; i++)
				if (!path1Objs[i].equals(path2Objs[i]))
					return 1;
			return 0;
		}

		public boolean equals(TreePathId obj) {
			return this.compareTo(obj) == 0;
		}

		@Override
		public int hashCode() {
			if (this.path == null)
				return 0;
			Object[] pathObjs = this.path.getPath();
			int result = pathObjs[0].hashCode();
			for (int i = 1; i < pathObjs.length; i++)
				result = result ^ pathObjs[i].hashCode();
			return result;
		}
	}

	/**
	 * Selection listener for selection animation effects.
	 * 
	 * @author Kirill Grouchnikov
	 */
	protected class MyTreeSelectionListener implements TreeSelectionListener {
		@Override
		public void valueChanged(TreeSelectionEvent e) {
			// Map<TreePathId, Object> currSelected = (Map<TreePathId, Object>)
			// tree
			// .getClientProperty(SELECTED_INDICES);
			if (tree.getSelectionPaths() != null) {
				for (TreePath selectionPath : tree.getSelectionPaths()) {
					TreePathId pathId = new TreePathId(selectionPath);

					// check if was selected before
					if (!selectedPaths.containsKey(pathId)) {
						// start fading in
						StateTransitionTracker tracker = getTracker(pathId,
								(currRolloverPathId != null) && pathId.equals(currRolloverPathId),
								false);
						tracker.getModel().setSelected(true);
						selectedPaths.put(pathId, selectionPath.getLastPathComponent());
					}
				}
			}

			for (Iterator<Map.Entry<TreePathId, Object>> it = selectedPaths.entrySet()
					.iterator(); it.hasNext();) {
				Map.Entry<TreePathId, Object> entry = it.next();
				if (tree.getSelectionModel().isPathSelected(entry.getKey().path))
					continue;
				// fade out for deselected path
				TreePathId pathId = entry.getKey();
				StateTransitionTracker tracker = getTracker(pathId,
						(currRolloverPathId != null) && pathId.equals(currRolloverPathId), true);
				tracker.getModel().setSelected(false);
				it.remove();
			}
		}
	}

	/**
	 * Repaints a single path during the fade animation cycle.
	 * 
	 * @author Kirill Grouchnikov
	 */
	protected class PathRepaintCallback extends EventDispatchThreadTimelineCallbackAdapter {
		/**
		 * Associated tree.
		 */
		protected JTree tree;

		/**
		 * Associated (animated) path.
		 */
		protected TreePath treePath;

		/**
		 * Creates a new animation repaint callback.
		 * 
		 * @param tree
		 *            Associated tree.
		 * @param treePath
		 *            Associated (animated) path.
		 */
		public PathRepaintCallback(JTree tree, TreePath treePath) {
			super();
			this.tree = tree;
			this.treePath = treePath;
		}

		@Override
		public void onTimelinePulse(float durationFraction, float timelinePosition) {
			this.repaintPath();
		}

		@Override
		public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
				float durationFraction, float timelinePosition) {
			this.repaintPath();
		}

		/**
		 * Repaints the associated path.
		 */
		private void repaintPath() {
			SwingUtilities.invokeLater(() -> {
				if (SubstanceTreeUI.this.tree == null) {
					// may happen if the LAF was switched in the meantime
					return;
				}

				Rectangle boundsBuffer = new Rectangle();
				Rectangle bounds = treeState.getBounds(treePath, boundsBuffer);

				if (bounds != null) {
					// still visible

					// fix for defect 180 - refresh the entire row
					bounds.x = 0;
					bounds.width = tree.getWidth();

					// fix for defect 188 - rollover effects for trees
					// with insets
					Insets insets = tree.getInsets();
					bounds.x += insets.left;
					bounds.y += insets.top;

					tree.repaint(bounds);
				}
			});
		}
	}

	/**
	 * Listener for rollover animation effects.
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
			if (!tree.isEnabled())
				return;
			// isInside = false;
			this.fadeOut();
			// System.out.println("Nulling RO index");
			currRolloverPathId = null;
		}

		public void mouseMoved(MouseEvent e) {
			if (!tree.isEnabled())
				return;
			// isInside = true;
			handleMove(e);
		}

		public void mouseDragged(MouseEvent e) {
			if (!tree.isEnabled())
				return;
			handleMove(e);
		}

		/**
		 * Handles various mouse move events and initiates the fade animation if
		 * necessary.
		 * 
		 * @param e
		 *            Mouse event.
		 */
		private void handleMove(MouseEvent e) {
			TreePath closestPath = tree.getClosestPathForLocation(e.getX(), e.getY());
			Rectangle bounds = tree.getPathBounds(closestPath);
			if (bounds == null) {
				this.fadeOut();
				currRolloverPathId = null;
				return;
			}
			if ((e.getY() < bounds.y) || (e.getY() > (bounds.y + bounds.height))) {
				this.fadeOut();
				currRolloverPathId = null;
				return;
			}
			// check if this is the same index
			TreePathId newPathId = new TreePathId(closestPath);
			if ((currRolloverPathId != null) && newPathId.equals(currRolloverPathId)) {
				// System.out.println("Same location " +
				// System.currentTimeMillis());
				// System.out.print("Current : ");
				// for (Object o1 : currPathId.path.getPath()) {
				// System.out.print(o1);
				// }
				// System.out.println("");
				// System.out.print("Closest : ");
				// for (Object o2 : newPathId.path.getPath()) {
				// System.out.print(o2);
				// }
				// System.out.println("");
				return;
			}

			this.fadeOut();

			StateTransitionTracker tracker = getTracker(newPathId, false,
					selectedPaths.containsKey(newPathId));
			tracker.getModel().setRollover(true);

			currRolloverPathId = newPathId;
		}

		/**
		 * Initiates the fade out effect.
		 */
		private void fadeOut() {
			if (currRolloverPathId == null)
				return;

			StateTransitionTracker tracker = getTracker(currRolloverPathId, true,
					selectedPaths.containsKey(currRolloverPathId));
			tracker.getModel().setRollover(false);
		}
	}

	/**
	 * Listener for selecting the entire rows.
	 * 
	 * @author Kirill Grouchnikov
	 */
	private class RowSelectionListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if (!tree.isEnabled())
				return;
			TreePath closestPath = tree.getClosestPathForLocation(e.getX(), e.getY());
			if (closestPath == null)
				return;
			Rectangle bounds = tree.getPathBounds(closestPath);
			// Process events outside the immediate bounds - fix for defect
			// 19 on substance-netbeans. This properly handles Ctrl and Shift
			// selections on trees.
			if ((e.getY() >= bounds.y) && (e.getY() < (bounds.y + bounds.height))
					&& ((e.getX() < bounds.x) || (e.getX() > (bounds.x + bounds.width)))) {
				// tree.setSelectionPath(closestPath);

				// fix - don't select a node if the click was on the
				// expand control
				if (isLocationInExpandControl(closestPath, e.getX(), e.getY()))
					return;
				selectPathForEvent(closestPath, e);
			}
		}
	}

	/**
	 * Returns the pivot X for the cells rendered in the specified area. Used
	 * for the smart tree scroll (
	 * {@link SubstanceSlices.AnimationFacet#TREE_SMART_SCROLL_ANIMATION}).
	 * 
	 * @param paintBounds
	 *            Area bounds.
	 * @return Pivot X for the cells rendered in the specified area
	 */
	public int getPivotRendererX(Rectangle paintBounds) {
		TreePath initialPath = getClosestPathForLocation(tree, 0, paintBounds.y);
		Enumeration<?> paintingEnumerator = treeState.getVisiblePathsFrom(initialPath);
		int endY = paintBounds.y + paintBounds.height;

		int totalY = 0;
		int count = 0;

		if (initialPath != null && paintingEnumerator != null) {
			boolean done = false;
			Rectangle boundsBuffer = new Rectangle();
			Rectangle bounds;
			TreePath path;
			Insets insets = tree.getInsets();

			while (!done && paintingEnumerator.hasMoreElements()) {
				path = (TreePath) paintingEnumerator.nextElement();
				if (path != null) {
					bounds = treeState.getBounds(path, boundsBuffer);
					bounds.x += insets.left;
					bounds.y += insets.top;

					int currMedianX = bounds.x;// + bounds.width / 2;
					totalY += currMedianX;
					count++;
					if ((bounds.y + bounds.height) >= endY)
						done = true;
				} else {
					done = true;
				}
			}
		}
		if (count == 0)
			return -1;
		return totalY / count - 2
				* SubstanceSizeUtils.getTreeIconSize(SubstanceSizeUtils.getComponentFontSize(tree));
	}

	/**
	 * Returns the current state for the specified path.
	 * 
	 * @param pathId
	 *            Path index.
	 * @return The current state for the specified path.
	 */
	public ComponentState getPathState(TreePathId pathId) {
		boolean isEnabled = this.tree.isEnabled();
		StateTransitionTracker tracker = this.stateTransitionMultiTracker.getTracker(pathId);
		if (tracker == null) {
			int rowIndex = this.tree.getRowForPath(pathId.path);
			boolean isRollover = (this.currRolloverPathId != null)
					&& pathId.equals(this.currRolloverPathId);
			boolean isSelected = this.tree.isRowSelected(rowIndex);
			return ComponentState.getState(isEnabled, isRollover, isSelected);
		} else {
			ComponentState fromTracker = tracker.getModelStateInfo().getCurrModelState();
			return ComponentState.getState(isEnabled,
					fromTracker.isFacetActive(ComponentStateFacet.ROLLOVER),
					fromTracker.isFacetActive(ComponentStateFacet.SELECTION));
		}
	}

	public StateTransitionTracker.ModelStateInfo getModelStateInfo(TreePathId pathId) {
		if (this.stateTransitionMultiTracker.size() == 0)
			return null;
		StateTransitionTracker tracker = this.stateTransitionMultiTracker.getTracker(pathId);
		if (tracker == null) {
			return null;
		} else {
			return tracker.getModelStateInfo();
		}
	}

	@Override
	public void update(Graphics g, JComponent c) {
		BackgroundPaintingUtils.updateIfOpaque(g, c);

		// Should never happen if installed for a UI
		if (treeState == null) {
			return;
		}

		// compute the default color scheme - to optimize the performance
		// SubstanceColorScheme scheme = SubstanceColorSchemeUtilities
		// .getColorScheme(this.tree,
		// this.tree.isEnabled() ? ComponentState.DEFAULT
		// : ComponentState.DISABLED_UNSELECTED);
		// this.currHashColor = scheme.getLineColor();
		this.currDefaultColorScheme = SubstanceColorSchemeUtilities.getColorScheme(tree,
				ComponentState.ENABLED);

		Rectangle paintBounds = g.getClipBounds();
		Insets insets = tree.getInsets();

		TreePath initialPath = getClosestPathForLocation(tree, 0, paintBounds.y);
		Enumeration<?> paintingEnumerator = treeState.getVisiblePathsFrom(initialPath);
		int row = treeState.getRowForPath(initialPath);
		int endY = paintBounds.y + paintBounds.height;

		// second part - fix for defect 214 (rollover effects on non-opaque
		// trees resulted in inconsistent behaviour)

		Graphics2D g2d = (Graphics2D) g.create();
		NeonCortex.installDesktopHints(g2d, c.getFont());

		SubstanceStripingUtils.setup(c);
		if (initialPath != null && paintingEnumerator != null) {
			boolean done = false;
			Rectangle boundsBuffer = new Rectangle();
			Rectangle bounds;
			TreePath path;

			while (!done && paintingEnumerator.hasMoreElements()) {
				path = (TreePath) paintingEnumerator.nextElement();
				if (path != null) {
					// respect the background color of the renderer.
					boolean isLeaf = treeModel.isLeaf(path.getLastPathComponent());
					boolean isExpanded = !isLeaf && treeState.getExpandedState(path);
					Component renderer = this.currentCellRenderer.getTreeCellRendererComponent(
							this.tree, path.getLastPathComponent(), this.tree.isRowSelected(row),
							isExpanded, isLeaf, row,
							tree.hasFocus() && (tree.getLeadSelectionRow() == row));
					Color background = renderer.getBackground();
					if (background == null)
						background = tree.getBackground();
					bounds = treeState.getBounds(path, boundsBuffer);
					bounds.x += insets.left;
					bounds.y += insets.top;
					if (tree.isOpaque()) {
						g2d.setColor(background);
						g2d.fillRect(paintBounds.x, bounds.y, paintBounds.width, bounds.height);
					} else {
						BackgroundPaintingUtils.fillBackground(g2d, this.tree, background,
								new Rectangle(paintBounds.x, bounds.y, paintBounds.width,
										bounds.height));
					}
					if ((bounds.y + bounds.height) >= endY)
						done = true;
				} else {
					done = true;
				}
				row++;
			}
		}

		this.paint(g2d, c);
		SubstanceStripingUtils.tearDown(c);
		g2d.dispose();
	}

	/**
	 * Returns the default color scheme of this tree. Is for internal use only.
	 * 
	 * @return The default color scheme of this tree.
	 */
	public SubstanceColorScheme getDefaultColorScheme() {
		return this.currDefaultColorScheme;
	}

	/**
	 * Returns the cell renderer insets of this tree. Is for internal use only.
	 * 
	 * @return The cell renderer insets of this tree.
	 */
	public Insets getCellRendererInsets() {
		return cellRendererInsets;
	}

	@Override
	public Rectangle getPathBounds(JTree tree, TreePath path) {
		Rectangle result = super.getPathBounds(tree, path);
		if (result != null) {
			if (tree.getComponentOrientation().isLeftToRight()) {
				result.width = tree.getWidth() - tree.getInsets().right - result.x;
			} else {
				int delta = result.x - tree.getInsets().left;
				result.x -= delta;
				result.width += delta;
			}
		}
		return result;
	}

	private StateTransitionTracker getTracker(final TreePathId pathId, boolean initialRollover,
			boolean initialSelected) {
		StateTransitionTracker tracker = stateTransitionMultiTracker.getTracker(pathId);
		if (tracker == null) {
			ButtonModel model = new DefaultButtonModel();
			model.setSelected(initialSelected);
			model.setRollover(initialRollover);
			tracker = new StateTransitionTracker(this.tree, model);
			tracker.registerModelListeners();
			tracker.setRepaintCallback(() -> new PathRepaintCallback(tree, pathId.path));
			stateTransitionMultiTracker.addTracker(pathId, tracker);
		}
		return tracker;
	}
}
