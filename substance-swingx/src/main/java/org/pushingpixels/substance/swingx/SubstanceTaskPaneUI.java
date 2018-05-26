/*
 * Copyright 2005-2018 Kirill Grouchnikov, based on work by
 * Sun Microsystems, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.pushingpixels.substance.swingx;

import org.jdesktop.swingx.JXTaskPane;
import org.jdesktop.swingx.icon.EmptyIcon;
import org.jdesktop.swingx.plaf.basic.BasicTaskPaneUI;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.painter.HighlightPainterUtils;
import org.pushingpixels.substance.internal.utils.*;
import org.pushingpixels.substance.internal.utils.icon.TransitionAwareIcon;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Map;

/**
 * Substance-consistent UI delegate for {@link JXTaskPane}.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceTaskPaneUI extends BasicTaskPaneUI implements TransitionAwareUI {
    /**
     * Background delegate.
     */
    private SubstanceSwingxFillBackgroundDelegate bgDelegate;

    /**
     * Listener for thumb transition animations.
     */
    private RolloverControlListener substanceRolloverListener;

    /**
     * Listener for transition animations.
     */
    protected StateTransitionTracker stateTransitionTracker;

    /**
     * Surrogate model for the fade effects on the title pane border.
     */
    protected ButtonModel taskPaneModel;

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceTaskPaneUI((JXTaskPane) comp);
    }

    /**
     * Creates a new UI delegate.
     */
    public SubstanceTaskPaneUI(JXTaskPane taskPane) {
        super();
        this.bgDelegate = new SubstanceSwingxFillBackgroundDelegate();

        this.taskPaneModel = new DefaultButtonModel();
        this.taskPaneModel.setArmed(false);
        this.taskPaneModel.setSelected(false);
        this.taskPaneModel.setPressed(false);
        this.taskPaneModel.setRollover(false);

        this.stateTransitionTracker = new StateTransitionTracker(taskPane, this.taskPaneModel);
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.substanceRolloverListener = new RolloverControlListener(this, this.taskPaneModel);
        this.group.addMouseListener(this.substanceRolloverListener);
        this.group.addMouseMotionListener(this.substanceRolloverListener);

        this.stateTransitionTracker.registerModelListeners();
    }

    @Override
    protected void uninstallListeners() {
        this.group.removeMouseListener(this.substanceRolloverListener);
        this.group.removeMouseMotionListener(this.substanceRolloverListener);
        this.substanceRolloverListener = null;

        this.stateTransitionTracker.unregisterModelListeners();

        super.uninstallListeners();
    }

    @Override
    protected void installDefaults() {
        ComponentOrParentChainScope.setDecorationType(this.group, DecorationAreaType.GENERAL);

        super.installDefaults();
    }

    @Override
    public void uninstallUI(JComponent c) {
        DecorationPainterUtils.clearDecorationType(this.group);
        super.uninstallUI(c);
    }

    @Override
    protected Border createPaneBorder() {
        return new SubstancePaneBorder();
    }

    @Override
    protected Border createContentPaneBorder() {
        SubstanceColorScheme colorScheme = SubstanceColorSchemeUtilities.getColorScheme(group,
                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
        // the code below is the same as for the separators
        final Color borderColor = colorScheme.isDark() ? colorScheme.getDarkColor()
                : SubstanceColorUtilities.getInterpolatedColor(colorScheme.getMidColor(),
                        colorScheme.getDarkColor(), 0.4);
        Border outer = new Border() {
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2d = (Graphics2D) g.create();

                float strokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
                g2d.setStroke(
                        new BasicStroke(strokeWidth, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
                g2d.setColor(borderColor);
                // left
                g2d.drawLine(x, y, x, y + height - 1);
                // right
                g2d.drawLine(x + width - 1, y, x + width - 1, y + height - 1);
                // bottom
                g2d.drawLine(x, y + height - 1, x + width - 1, y + height - 1);

                g2d.dispose();
            }

            @Override
            public boolean isBorderOpaque() {
                return true;
            }

            @Override
            public Insets getBorderInsets(Component c) {
                // don't paint at the top
                return new Insets(0, 1, 1, 1);
            }
        };
        return new CompoundBorder(outer, new EmptyBorder(1, 2, 2, 2));
    }

    /**
     * Pane border for task pane.
     * 
     * @author Kirill Grouchnikov
     */
    protected class SubstancePaneBorder extends PaneBorder {
        protected Icon expandedIcon;

        protected Icon collapsedIcon;

        /**
         * Creates a new pane border.
         */
        public SubstancePaneBorder() {
            this.borderColor = SubstanceColorSchemeUtilities.getColorScheme(group,
                    ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED).getMidColor();
            TransitionAwareIcon.ColorSchemeAssociationKindDelegate colorSchemeAssociationDelegate = (
                    ComponentState state) -> {
                if (!state.isDisabled() && (state != ComponentState.ENABLED)) {
                    // use HIGHLIGHT
                    return ColorSchemeAssociationKind.HIGHLIGHT;
                }
                return ColorSchemeAssociationKind.MARK;
            };
            this.expandedIcon = new TransitionAwareIcon(group,
                    () -> (TransitionAwareUI) group.getUI(),
                    (SubstanceColorScheme scheme) -> SubstanceImageCreator.getDoubleArrowIcon(
                            SubstanceSizeUtils.getComponentFontSize(group), SwingConstants.NORTH,
                            scheme),
                    colorSchemeAssociationDelegate, "substance.swingx.taskpane.expanded");
            this.collapsedIcon = new TransitionAwareIcon(group,
                    () -> (TransitionAwareUI) group.getUI(),
                    (SubstanceColorScheme scheme) -> SubstanceImageCreator.getDoubleArrowIcon(
                            SubstanceSizeUtils.getComponentFontSize(group), SwingConstants.SOUTH,
                            scheme),
                    colorSchemeAssociationDelegate, "substance.swingx.taskpane.collapsed");

            // since the label is never added to this component, we need
            // to explicitly mark it as DecorationAreaType.GENERAL
            ComponentOrParentChainScope.setDecorationType(this.label,
                    DecorationAreaType.GENERAL);
            // and enforce the foreground color computed in #getPaintColor
            this.label.putClientProperty(SubstanceTextUtilities.ENFORCE_FG_COLOR, Boolean.TRUE);
        }

        @Override
        protected void paintTitleBackground(JXTaskPane group, Graphics g) {
            Graphics2D graphics = (Graphics2D) g.create();

            StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                    .getModelStateInfo();
            Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                    .getStateContributionMap();
            ComponentState currState = stateTransitionTracker.getModelStateInfo()
                    .getCurrModelState();

            SubstanceColorScheme baseFillScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(group, ColorSchemeAssociationKind.HIGHLIGHT, currState);
            SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(group, ColorSchemeAssociationKind.HIGHLIGHT_BORDER, currState);

            HighlightPainterUtils.paintHighlight(graphics, null, group,
                    new Rectangle(0, 0, group.getWidth(), getTitleHeight(group)), 0.5f, null,
                    baseFillScheme, baseBorderScheme);

            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> stateEntry : activeStates
                    .entrySet()) {
                ComponentState activeState = stateEntry.getKey();
                if (activeState == currState)
                    continue;

                float contribution = stateEntry.getValue().getContribution();
                if (contribution == 0.0f)
                    continue;

                SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(group, ColorSchemeAssociationKind.HIGHLIGHT, activeState);
                SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities.getColorScheme(
                        group, ColorSchemeAssociationKind.HIGHLIGHT_BORDER, activeState);

                graphics.setComposite(WidgetUtilities.getAlphaComposite(group, contribution, g));
                HighlightPainterUtils.paintHighlight(graphics, null, group,
                        new Rectangle(0, 0, group.getWidth(), getTitleHeight(group)), 0.5f, null,
                        fillScheme, borderScheme);
            }
            graphics.dispose();
        }

        @Override
        protected Color getPaintColor(JXTaskPane group) {
            StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                    .getModelStateInfo();
            Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                    .getStateContributionMap();
            ComponentState currState = stateTransitionTracker.getModelStateInfo()
                    .getCurrModelState();

            if (currState.isDisabled() || (activeStates.size() == 1))
                return getColorSchemeForState(group, currState).getForegroundColor();

            float aggrRed = 0;
            float aggrGreen = 0;
            float aggrBlue = 0;

            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : modelStateInfo
                    .getStateContributionMap().entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                SubstanceColorScheme scheme = getColorSchemeForState(group, activeState);
                Color schemeFg = scheme.getForegroundColor();
                float contribution = activeEntry.getValue().getContribution();
                aggrRed += schemeFg.getRed() * contribution;
                aggrGreen += schemeFg.getGreen() * contribution;
                aggrBlue += schemeFg.getBlue() * contribution;
            }
            return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
        }

        private SubstanceColorScheme getColorSchemeForState(JXTaskPane group,
                ComponentState state) {
            ColorSchemeAssociationKind assocKind = ColorSchemeAssociationKind.FILL;
            if (!state.isDisabled() && (state != ComponentState.ENABLED)) {
                // use HIGHLIGHT
                assocKind = ColorSchemeAssociationKind.HIGHLIGHT;
            }
            SubstanceColorScheme currScheme = SubstanceColorSchemeUtilities.getColorScheme(group,
                    assocKind, state);
            return currScheme;
        }

        @Override
        protected void paintExpandedControls(JXTaskPane group, Graphics g, int x, int y, int width,
                int height) {
            Icon arrowIcon = group.isCollapsed() ? collapsedIcon : expandedIcon;
            int dx = (width - arrowIcon.getIconWidth()) / 2;
            int dy = 1 + (height - arrowIcon.getIconHeight()) / 2;
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2d.translate(x + dx, y + dy);
            arrowIcon.paintIcon(group, g2d, 0, 0);
            g2d.dispose();
        }

        @Override
        protected boolean isMouseOverBorder() {
            return true;
        }

        @Override
        protected void paintFocus(Graphics g, Color paintColor, int x, int y, int width,
                int height) {
            SubstanceCoreUtilities.paintFocus(g, group, group, SubstanceTaskPaneUI.this,
                    new Rectangle(x, y, width - 1, height - 1), label.getBounds(), 1.0f, 0);
        }

        @Override
        protected void configureLabel(JXTaskPane group) {
            label.applyComponentOrientation(group.getComponentOrientation());
            label.setFont(group.getFont());
            label.setText(group.getTitle());
            label.setIcon(group.getIcon() == null ? new EmptyIcon() : group.getIcon());
        }
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        this.bgDelegate.paint(c, (Graphics2D) g, false);
    }

    @Override
    public boolean isInside(MouseEvent me) {
        return this.isInBorder(me);
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.stateTransitionTracker;
    }

    @Override
    protected int getTitleHeight(Component c) {
        return SubstanceSizeUtils.getAdjustedSize(SubstanceSizeUtils.getComponentFontSize(c),
                super.getTitleHeight(c), 2, 3, false);
    }
}
