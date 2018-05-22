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
package org.pushingpixels.substance.api.renderer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.TreeUI;
import javax.swing.plaf.UIResource;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker.StateContributionInfo;
import org.pushingpixels.substance.internal.ui.SubstanceTreeUI;
import org.pushingpixels.substance.internal.ui.SubstanceTreeUI.TreePathId;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceStripingUtils;

/**
 * Default renderer for tree cells. Note that this does not extend {@link DefaultTreeCellRenderer}
 * as other default renderers since that class overrides {@link Component#setBackground(Color)} and
 * prevents the pass-through of {@link UIResource} colors that Substance sets for odd-even row
 * striping.
 * 
 * @author Kirill Grouchnikov
 */
@SubstanceRenderer
public class SubstanceDefaultTreeCellRenderer extends JLabel implements TreeCellRenderer {
    /** Last tree the renderer was painted in. */
    private JTree tree;

    /** Is the value currently selected. */
    protected boolean selected;

    /** True if has focus. */
    protected boolean hasFocus;

    /**
     * Returns a new instance of SubstanceDefaultTreeCellRenderer. Alignment is set to left aligned.
     * Icons and text color are determined from the UIManager.
     */
    public SubstanceDefaultTreeCellRenderer() {
        this.setHorizontalAlignment(SwingConstants.LEFT);
        SubstanceCortex.ComponentOrParentChainScope.setColorizationFactor(this, 1.0);
    }

    /**
     * Returns the default icon that is used to represent non-leaf nodes that are expanded.
     * 
     * @return The default icon for non-leaf expanded nodes.
     */
    public Icon getDefaultOpenIcon() {
        return UIManager.getIcon("Tree.openIcon");
    }

    /**
     * Returns the default icon that is used to represent non-leaf nodes that are not expanded.
     * 
     * @return The default icon for non-leaf non-expanded nodes.
     */
    public Icon getDefaultClosedIcon() {
        return UIManager.getIcon("Tree.closedIcon");
    }

    /**
     * Returns the default icon that is used to represent leaf nodes.
     * 
     * @return The default icon for leaf nodes.
     */
    public Icon getDefaultLeafIcon() {
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
        if (font instanceof FontUIResource)
            font = null;
        super.setFont(font);
    }

    /**
     * Gets the font of this component.
     * 
     * @return this component's font; if a font has not been set for this component, the font of its
     *         parent is returned
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

    /**
     * Configures the renderer based on the passed in components. The value is set from messaging
     * the tree with <code>convertValueToText</code>, which ultimately invokes <code>toString</code>
     * on <code>value</code>. The foreground color is set based on the selection and the icon is set
     * based on on leaf and expanded.
     */
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel,
            boolean expanded, boolean leaf, int row, boolean hasFocus) {
        String stringValue = tree.convertValueToText(value, sel, expanded, leaf, row, hasFocus);

        this.tree = tree;
        this.hasFocus = hasFocus;
        this.setText(stringValue);

        TreeUI treeUI = tree.getUI();
        if (treeUI instanceof SubstanceTreeUI) {
            SubstanceTreeUI ui = (SubstanceTreeUI) treeUI;
            TreePathId pathId = new TreePathId(tree.getPathForRow(row));

            StateTransitionTracker.ModelStateInfo modelStateInfo = ui.getModelStateInfo(pathId);
            ComponentState currState = ui.getPathState(pathId);

            // special case for drop location
            JTree.DropLocation dropLocation = tree.getDropLocation();
            boolean isDropLocation = (dropLocation != null && dropLocation.getChildIndex() == -1
                    && tree.getRowForPath(dropLocation.getPath()) == row);

            if (!isDropLocation && (modelStateInfo != null)) {
                Map<ComponentState, StateContributionInfo> activeStates = modelStateInfo
                        .getStateContributionMap();
                SubstanceColorScheme colorScheme = getColorSchemeForState(tree, ui, currState);
                if (currState.isDisabled() || (activeStates == null)
                        || (activeStates.size() == 1)) {
                    super.setForeground(new ColorUIResource(colorScheme.getForegroundColor()));
                } else {
                    float aggrRed = 0;
                    float aggrGreen = 0;
                    float aggrBlue = 0;

                    for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : modelStateInfo
                            .getStateContributionMap().entrySet()) {
                        ComponentState activeState = activeEntry.getKey();
                        SubstanceColorScheme scheme = getColorSchemeForState(tree, ui, activeState);
                        Color schemeFg = scheme.getForegroundColor();
                        float contribution = activeEntry.getValue().getContribution();
                        aggrRed += schemeFg.getRed() * contribution;
                        aggrGreen += schemeFg.getGreen() * contribution;
                        aggrBlue += schemeFg.getBlue() * contribution;
                    }
                    super.setForeground(new ColorUIResource(
                            new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue)));
                }
            } else {
                SubstanceColorScheme scheme = getColorSchemeForState(tree, ui, currState);
                if (isDropLocation) {
                    scheme = SubstanceColorSchemeUtilities.getColorScheme(tree,
                            ColorSchemeAssociationKind.HIGHLIGHT_TEXT, currState);
                }
                if (scheme != null) {
                    super.setForeground(new ColorUIResource(scheme.getForegroundColor()));
                }
            }
        } else {
            if (sel)
                this.setForeground(UIManager.getColor("Tree.selectionForeground"));
            else
                this.setForeground(UIManager.getColor("Tree.textForeground"));
        }

        if (SubstanceCoreUtilities.isCurrentLookAndFeel())
            SubstanceStripingUtils.applyStripedBackground(tree, row, this);

        // There needs to be a way to specify disabled icons.
        if (!tree.isEnabled()) {
            this.setEnabled(false);
            if (leaf) {
                this.setDisabledIcon(SubstanceImageCreator.toGreyscale(SubstanceImageCreator
                        .makeTransparent(tree, this.getDefaultLeafIcon(), 0.5)));
            } else if (expanded) {
                this.setDisabledIcon(SubstanceImageCreator.toGreyscale(SubstanceImageCreator
                        .makeTransparent(tree, this.getDefaultOpenIcon(), 0.5)));
            } else {
                this.setDisabledIcon(SubstanceImageCreator.toGreyscale(SubstanceImageCreator
                        .makeTransparent(tree, this.getDefaultClosedIcon(), 0.5)));
            }
        } else {
            this.setEnabled(true);
            if (leaf) {
                this.setIcon(this.getDefaultLeafIcon());
            } else if (expanded) {
                this.setIcon(this.getDefaultOpenIcon());
            } else {
                this.setIcon(this.getDefaultClosedIcon());
            }
        }
        this.setComponentOrientation(tree.getComponentOrientation());

        this.setOpaque(false);

        this.selected = sel;

        if (treeUI instanceof SubstanceTreeUI) {
            SubstanceTreeUI ui = (SubstanceTreeUI) treeUI;
            Insets regInsets = ui.getCellRendererInsets();
            this.setBorder(new BorderUIResource.EmptyBorderUIResource(regInsets));
        }

        return this;
    }

    private SubstanceColorScheme getColorSchemeForState(JTree tree, SubstanceTreeUI ui,
            ComponentState activeState) {
        SubstanceColorScheme scheme = (activeState == ComponentState.ENABLED)
                ? ui.getDefaultColorScheme()
                : SubstanceColorSchemeUtilities.getColorScheme(tree,
                        ColorSchemeAssociationKind.HIGHLIGHT, activeState);
        if (scheme == null) {
            scheme = SubstanceColorSchemeUtilities.getColorScheme(tree,
                    ColorSchemeAssociationKind.HIGHLIGHT, activeState);
        }
        return scheme;
    }

    /**
     * Overrides <code>JComponent.getPreferredSize</code> to return slightly wider preferred size
     * value.
     */
    @Override
    public Dimension getPreferredSize() {
        Dimension retDimension = super.getPreferredSize();

        if (retDimension != null)
            retDimension = new Dimension(retDimension.width + 3, retDimension.height);
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
     * 
     * @since 1.5
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
     * 
     * @since 1.5
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
