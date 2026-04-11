/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.renderer;

import org.pushingpixels.radiance.common.api.UiThreadingViolationException;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker.StateContributionInfo;
import org.pushingpixels.radiance.theming.internal.blade.BladeContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.ui.RadianceTreeUI;
import org.pushingpixels.radiance.theming.internal.ui.RadianceTreeUI.TreePathId;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.plaf.*;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Default renderer for tree cells. Note that this does not extend {@link DefaultTreeCellRenderer}
 * as other default renderers since that class overrides {@link Component#setBackground(Color)} and
 * prevents the pass-through of {@link UIResource} colors that Radiance sets for odd-even row
 * striping.
 *
 * @author Kirill Grouchnikov
 */
@RadianceRenderer
public class RadianceDefaultTreeCellRenderer extends JLabel implements RadianceTreeCellRenderer,
        FilteredIconAwareRenderer {
    /**
     * Last tree the renderer was painted in.
     */
    private JTree tree;

    /**
     * Is the value currently selected.
     */
    protected boolean selected;

    /**
     * True if has focus.
     */
    protected boolean hasFocus;

    private Map<ComponentState, Float> activeContributions = new HashMap<>();

    private BladeContainerColorTokens mutableContainerTokens = new BladeContainerColorTokens();

    /**
     * Returns a new instance of RadianceDefaultTreeCellRenderer. Alignment is set to start
     * aligned. Icons and text color are determined from the UIManager.
     */
    public RadianceDefaultTreeCellRenderer() {
        this.setHorizontalAlignment(SwingConstants.LEADING);
    }

    /**
     * Returns the default icon that is used to represent non-leaf nodes that are expanded.
     *
     * @return The default icon for non-leaf expanded nodes.
     */
    private Icon getDefaultOpenIcon() {
        return UIManager.getIcon("Tree.openIcon");
    }

    /**
     * Returns the default icon that is used to represent non-leaf nodes that are not expanded.
     *
     * @return The default icon for non-leaf non-expanded nodes.
     */
    private Icon getDefaultClosedIcon() {
        return UIManager.getIcon("Tree.closedIcon");
    }

    /**
     * Returns the default icon that is used to represent leaf nodes.
     *
     * @return The default icon for leaf nodes.
     */
    private Icon getDefaultLeafIcon() {
        return UIManager.getIcon("Tree.leafIcon");
    }

    /**
     * Subclassed to map <code>FontUIResource</code>s to null. If <code>font</code> is null, or a
     * <code>FontUIResource</code>, this has the effect of letting the font of the JTree show
     * through. On the other hand, if <code>font</code> is non-null, and not a
     * <code>FontUIResource</code>, the font becomes <code>font</code>.
     */
    @Override
    public void setFont(Font font) {
        if (font instanceof FontUIResource) {
            font = null;
        }
        super.setFont(font);
    }

    /**
     * Gets the font of this component.
     *
     * @return this component's font; if a font has not been set for this component, the font of its
     * parent is returned
     */
    @Override
    public Font getFont() {
        Font font = super.getFont();

        if ((font == null) && (this.tree != null)) {
            // Strive to return a non-null value, otherwise the html support
            // will typically pick up the wrong font in certain situations.
            font = this.tree.getFont();
        }
        return font;
    }

    private static void mergeIntoMutableColorTokens(
        BladeContainerColorTokens bladeContainerTokens,
        ContainerColorTokens contributionColorTokens,
        float amount
    ) {
        // Update the mutable color tokens with the interpolated colors
        bladeContainerTokens.containerSurfaceLowest =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceLowest,
                contributionColorTokens.getContainerSurfaceLowest(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceLow =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceLow,
                contributionColorTokens.getContainerSurfaceLow(), 1.0f - amount);
        bladeContainerTokens.containerSurface =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurface,
                contributionColorTokens.getContainerSurface(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceHigh =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceHigh,
                contributionColorTokens.getContainerSurfaceHigh(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceHighest =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceHighest,
                contributionColorTokens.getContainerSurfaceHighest(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceDim =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceDim,
                contributionColorTokens.getContainerSurfaceDim(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceBright =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceBright,
                contributionColorTokens.getContainerSurfaceBright(), 1.0f - amount);
        bladeContainerTokens.onContainer =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.onContainer,
                contributionColorTokens.getOnContainer(), 1.0f - amount);
        bladeContainerTokens.onContainerVariant =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.onContainerVariant,
                contributionColorTokens.getOnContainerVariant(), 1.0f - amount);
        bladeContainerTokens.containerOutline =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerOutline,
                contributionColorTokens.getContainerOutline(), 1.0f - amount);
        bladeContainerTokens.containerOutlineVariant =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerOutlineVariant,
                contributionColorTokens.getContainerOutlineVariant(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceEnabledAlpha =
            (1.0f - amount) * bladeContainerTokens.containerSurfaceEnabledAlpha +
                amount * contributionColorTokens.getContainerSurfaceEnabledAlpha();
        bladeContainerTokens.onContainerEnabledAlpha =
            (1.0f - amount) * bladeContainerTokens.onContainerEnabledAlpha +
                amount * contributionColorTokens.getOnContainerEnabledAlpha();
        bladeContainerTokens.containerOutlineEnabledAlpha =
            (1.0f - amount) * bladeContainerTokens.containerOutlineEnabledAlpha +
                amount * contributionColorTokens.getContainerOutlineEnabledAlpha();
        bladeContainerTokens.containerSurfaceDisabledAlpha =
            (1.0f - amount) * bladeContainerTokens.containerSurfaceDisabledAlpha +
                amount * contributionColorTokens.getContainerSurfaceDisabledAlpha();
        bladeContainerTokens.onContainerDisabledAlpha =
            (1.0f - amount) * bladeContainerTokens.onContainerDisabledAlpha +
                amount * contributionColorTokens.getOnContainerDisabledAlpha();
        bladeContainerTokens.containerOutlineDisabledAlpha =
            (1.0f - amount) * bladeContainerTokens.containerOutlineDisabledAlpha +
                amount * contributionColorTokens.getContainerOutlineDisabledAlpha();
        bladeContainerTokens.inverseContainerSurface =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.inverseContainerSurface,
                contributionColorTokens.getInverseContainerSurface(), 1.0f - amount);
        bladeContainerTokens.inverseOnContainer =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.inverseOnContainer,
                contributionColorTokens.getInverseOnContainer(), 1.0f - amount);
        bladeContainerTokens.inverseContainerOutline =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.inverseContainerOutline,
                contributionColorTokens.getInverseContainerOutline(), 1.0f - amount);
        bladeContainerTokens.complementaryOnContainer =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.complementaryOnContainer,
                contributionColorTokens.getComplementaryOnContainer(), 1.0f - amount);
        bladeContainerTokens.complementaryContainerOutline =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.complementaryContainerOutline,
                contributionColorTokens.getComplementaryContainerOutline(), 1.0f - amount);
        bladeContainerTokens.accentOnContainer =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.accentOnContainer,
                contributionColorTokens.getAccentOnContainer(), 1.0f - amount);

        bladeContainerTokens.combinedName = bladeContainerTokens.hashCode() + ", [" +
            contributionColorTokens.hashCode() + ":" + amount + "]";

        bladeContainerTokens.isDark = bladeContainerTokens.isDark() && contributionColorTokens.isDark();
    }

    @Override
    public ContainerColorTokens getColorTokens(JTree tree, Object value, int row) {
        TreeUI treeUI = tree.getUI();
        if (treeUI instanceof RadianceTreeUI) {
            RadianceTreeUI ui = (RadianceTreeUI) treeUI;

            TreePathId pathId = new TreePathId(tree.getPathForRow(row));

            StateTransitionTracker.ModelStateInfo modelStateInfo = ui.getModelStateInfo(pathId);
            ComponentState currState = ui.getPathState(pathId);

            // special case for drop location
            JTree.DropLocation dropLocation = tree.getDropLocation();
            boolean isDropLocation = (dropLocation != null)
                && (dropLocation.getChildIndex() == -1)
                && (tree.getRowForPath(dropLocation.getPath()) == row);

            if (!isDropLocation && (modelStateInfo != null)) {
                Map<ComponentState, StateContributionInfo> activeStates = modelStateInfo
                    .getStateContributionMap();
                if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
                    return getContainerTokensForState(tree, ui, currState);
                } else {
                    mergeIntoMutableColorTokens(mutableContainerTokens,
                        getContainerTokensForState(tree, ui, currState), 1.0f);
                    for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                        modelStateInfo.getStateContributionMap().entrySet()) {
                        ComponentState activeState = activeEntry.getKey();
                        if (activeState == currState) {
                            continue;
                        }
                        float contribution = activeEntry.getValue().getContribution();
                        mergeIntoMutableColorTokens(mutableContainerTokens,
                            getContainerTokensForState(tree, ui, activeState), contribution);
                    }
                    return this.mutableContainerTokens;
                }
            } else {
                if (isDropLocation) {
                    return CoreColorTokenUtils.getContainerTokens(tree,
                        RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
                        currState, CoreColorTokenUtils.ContainerType.NEUTRAL);
                } else {
                    return getContainerTokensForState(tree, ui, currState);
                }
            }
        } else {
            return null;
        }
    }

    /**
     * Configures the renderer based on the passed in components. The value is set from messaging
     * the tree with <code>convertValueToText</code>, which ultimately invokes <code>toString</code>
     * on <code>value</code>. The foreground color is set based on the selection and the icon is set
     * based on on leaf and expanded.
     */
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected,
            boolean expanded, boolean leaf, int row, boolean hasFocus) {
        String stringValue = tree.convertValueToText(value, selected, expanded, leaf, row, hasFocus);

        this.tree = tree;
        this.hasFocus = hasFocus;
        this.setText(stringValue);

        this.activeContributions.clear();

        TreeUI treeUI = tree.getUI();
        if (treeUI instanceof RadianceTreeUI) {
            RadianceTreeUI ui = (RadianceTreeUI) treeUI;

            TreePathId pathId = new TreePathId(tree.getPathForRow(row));

            StateTransitionTracker.ModelStateInfo modelStateInfo = ui.getModelStateInfo(pathId);
            ComponentState currState = ui.getPathState(pathId);

            // special case for drop location
            JTree.DropLocation dropLocation = tree.getDropLocation();
            boolean isDropLocation = (dropLocation != null)
                    && (dropLocation.getChildIndex() == -1)
                    && (tree.getRowForPath(dropLocation.getPath()) == row);

            if (!isDropLocation && (modelStateInfo != null)) {
                Map<ComponentState, StateContributionInfo> activeStates = modelStateInfo
                        .getStateContributionMap();
                if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
                    ContainerColorTokens colorTokens = getContainerTokensForState(tree, ui, currState);
                    Color foreground = colorTokens.getOnContainer();
                    float alpha = currState.isDisabled() ? colorTokens.getOnContainerDisabledAlpha()
                        : colorTokens.getOnContainerEnabledAlpha();
                    if (alpha < 1.0f) {
                        foreground = RadianceColorUtilities.getAlphaColor(foreground,
                            (int) (foreground.getAlpha() * alpha));
                    }
                    super.setForeground(new ColorUIResource(foreground));
                } else {
                    float aggrRed = 0;
                    float aggrGreen = 0;
                    float aggrBlue = 0;

                    for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                            modelStateInfo.getStateContributionMap().entrySet()) {
                        ComponentState activeState = activeEntry.getKey();
                        float contribution = activeEntry.getValue().getContribution();
                        if (activeState.isFacetActive(
                                RadianceThemingSlices.ComponentStateFacet.ROLLOVER) ||
                                activeState.isFacetActive(
                                        RadianceThemingSlices.ComponentStateFacet.ARM)) {
                            this.activeContributions.put(activeState, contribution);
                        }
                        ContainerColorTokens colorTokens = getContainerTokensForState(tree, ui, activeState);
                        Color foreground = colorTokens.getOnContainer();
                        aggrRed += foreground.getRed() * contribution;
                        aggrGreen += foreground.getGreen() * contribution;
                        aggrBlue += foreground.getBlue() * contribution;
                    }
                    super.setForeground(new ColorUIResource(
                            new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue)));
                }
            } else {
                ContainerColorTokens colorTokens = getContainerTokensForState(tree, ui, currState);
                if (isDropLocation) {
                    colorTokens = CoreColorTokenUtils.getContainerTokens(tree,
                        RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
                        currState, CoreColorTokenUtils.ContainerType.NEUTRAL);
                }
                Color foreground = colorTokens.getOnContainer();
                float alpha = currState.isDisabled() ? colorTokens.getOnContainerDisabledAlpha()
                    : colorTokens.getOnContainerEnabledAlpha();
                if (alpha < 1.0f) {
                    foreground = RadianceColorUtilities.getAlphaColor(foreground,
                        (int) (foreground.getAlpha() * alpha));
                }
                super.setForeground(new ColorUIResource(foreground));
                boolean isActive = currState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER)
                        || currState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION)
                        || currState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ARM);
                this.activeContributions.put(currState, isActive ? 1.0f : 0.0f);
            }
        } else {
            if (selected) {
                this.setForeground(UIManager.getColor("Tree.selectionForeground"));
            } else {
                this.setForeground(UIManager.getColor("Tree.textForeground"));
            }
        }

        if (RadianceCoreUtilities.isCurrentLookAndFeel()) {
            RadianceStripingUtils.applyStripedBackground(tree, row, this, false);
        }

        this.setEnabled(tree.isEnabled());
        if (leaf) {
            this.setIcon(this.getDefaultLeafIcon());
        } else if (expanded) {
            this.setIcon(this.getDefaultOpenIcon());
        } else {
            this.setIcon(this.getDefaultClosedIcon());
        }

        this.setComponentOrientation(tree.getComponentOrientation());

        this.setOpaque(false);

        this.selected = selected;

        if (treeUI instanceof RadianceTreeUI) {
            RadianceTreeUI ui = (RadianceTreeUI) treeUI;
            Insets regInsets = ui.getCellRendererInsets();
            this.setBorder(new BorderUIResource.EmptyBorderUIResource(regInsets));
        }

        return this;
    }

    @Override
    public Map<ComponentState, Float> getActiveContributions() {
        return this.activeContributions;
    }

    private ContainerColorTokens getContainerTokensForState(JTree tree, RadianceTreeUI ui,
        ComponentState activeState) {
        ContainerColorTokens colorTokens = (activeState == ComponentState.ENABLED)
            ? ui.getDefaultColorTokens()
            : CoreColorTokenUtils.getContainerTokens(tree,
                RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT, activeState,
                CoreColorTokenUtils.ContainerType.NEUTRAL);
        if (colorTokens == null) {
            colorTokens = CoreColorTokenUtils.getContainerTokens(tree,
                RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT, activeState,
                CoreColorTokenUtils.ContainerType.NEUTRAL);
        }
        return colorTokens;
    }

    /**
     * Overrides <code>JComponent.getPreferredSize</code> to return slightly wider preferred size
     * value.
     */
    @Override
    public Dimension getPreferredSize() {
        Dimension retDimension = super.getPreferredSize();

        if (retDimension != null) {
            retDimension = new Dimension(retDimension.width + 3, retDimension.height);
        }
        return retDimension;
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void validate() {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void invalidate() {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void revalidate() {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void repaint(long tm, int x, int y, int width, int height) {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void repaint(Rectangle r) {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void repaint() {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        if ("text".equals(propertyName))
            super.firePropertyChange(propertyName, oldValue, newValue);
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void firePropertyChange(String propertyName, byte oldValue, byte newValue) {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void firePropertyChange(String propertyName, char oldValue, char newValue) {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void firePropertyChange(String propertyName, short oldValue, short newValue) {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void firePropertyChange(String propertyName, int oldValue, int newValue) {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void firePropertyChange(String propertyName, long oldValue, long newValue) {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void firePropertyChange(String propertyName, float oldValue, float newValue) {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void firePropertyChange(String propertyName, double oldValue, double newValue) {
    }

    /**
     * Overridden for performance reasons. See the <a href="#override">Implementation Note</a> for
     * more information.
     */
    @Override
    public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) {
    }

    @Override
    public final void paint(Graphics g) {
        super.paint(g);
    }

    @Override
    protected final void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
