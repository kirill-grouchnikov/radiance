/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.theming.ribbon.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.JScrollablePanel;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.JPopupPanel;
import org.pushingpixels.radiance.component.api.common.popup.PopupPanelManager;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.component.api.ribbon.JRibbon;
import org.pushingpixels.radiance.component.api.ribbon.JRibbonFrame;
import org.pushingpixels.radiance.component.api.ribbon.RibbonContextualTaskGroup;
import org.pushingpixels.radiance.component.api.ribbon.RibbonTaskbarKeyTipPolicy;
import org.pushingpixels.radiance.component.internal.theming.common.BladeTransitionAwareRadianceIcon;
import org.pushingpixels.radiance.component.internal.theming.common.ui.ActionPopupTransitionAwareUI;
import org.pushingpixels.radiance.component.internal.ui.common.CommandButtonLayoutManagerSmall;
import org.pushingpixels.radiance.component.internal.ui.ribbon.JRibbonComponent;
import org.pushingpixels.radiance.component.internal.ui.ribbon.RibbonUI;
import org.pushingpixels.radiance.component.internal.utils.ComponentUtilities;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeArrowIconUtils;
import org.pushingpixels.radiance.theming.internal.painter.SeparatorPainterUtils;
import org.pushingpixels.radiance.theming.internal.ui.RadianceRootPaneUI;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.List;
import java.util.*;

/**
 * Custom title pane for {@link JRibbonFrame} running under Radiance look-and-feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceRibbonFrameTitlePane extends RadianceTitlePane {
    private static final double TASKBAR_WIDTH_MAX_RATIO = 0.25;

    /**
     * Custom component to paint the header of a single contextual task group.
     *
     * @author Kirill Grouchnikov
     */
    private class RadianceContextualGroupComponent extends JComponent {
        /**
         * The associated contextual task group.
         */
        RibbonContextualTaskGroup taskGroup;

        /**
         * Creates the new task group header component.
         *
         * @param taskGroup The associated contextual task group.
         */
        private RadianceContextualGroupComponent(RibbonContextualTaskGroup taskGroup) {
            this.taskGroup = taskGroup;
            this.setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            int width = this.getWidth();
            int height = this.getHeight();
            Color hueColor = this.taskGroup.getHueColor();

            Graphics2D g2d = (Graphics2D) g.create();
            Paint paint = new GradientPaint(0, 0,
                    RadianceColorUtilities.getAlphaColor(hueColor, 0), 0, height,
                    RadianceColorUtilities.getAlphaColor(hueColor,
                            (int) (255 * RibbonContextualTaskGroup.HUE_ALPHA)));
            // translucent gradient paint
            g2d.setPaint(paint);
            g2d.fillRect(0, 0, width, height);
            // and a solid line at the bottom
            g2d.setColor(hueColor);
            g2d.drawLine(1, height - 1, width, height - 1);

            JRibbon ribbon = getRibbon();

            RadianceColorScheme scheme = RadianceCoreUtilities.getSkin(rootPane)
                    .getEnabledColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE);

            // task group title
            FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
                    RadianceCommonCortex.getScaleFactor(ribbon), ribbon.getFont());
            int yOffset = (height - fm.getHeight()) / 2;
            RadianceCommonCortex.installDesktopHints(g2d, ribbon.getFont());

            int offset = RadianceSizeUtils
                    .getAdjustedSize(RadianceSizeUtils.getComponentFontSize(this), 5, 2, 1, false);
            if (getComponentOrientation().isLeftToRight()) {
                RadianceTextUtilities.paintText(g2d,
                        new Rectangle(offset, yOffset, width, height - yOffset),
                        this.taskGroup.getTitle(), -1, ribbon.getFont(),
                        RadianceColorUtilities.getForegroundColor(scheme), null);
            } else {
                RadianceTextUtilities.paintText(g2d,
                        new Rectangle(width - offset - g2d.getFontMetrics().stringWidth(this.taskGroup.getTitle()),
                                yOffset, width, height - yOffset),
                        this.taskGroup.getTitle(), -1, ribbon.getFont(),
                        RadianceColorUtilities.getForegroundColor(scheme), null);
            }

            // left separator
            SeparatorPainterUtils.paintSeparator(ribbon, g2d, 2, height, SwingConstants.VERTICAL,
                    false, height / 3, 0, true);

            // right separator
            g2d.translate(width - 1, 0);
            SeparatorPainterUtils.paintSeparator(ribbon, g2d, 2, height, SwingConstants.VERTICAL,
                    false, height / 3, 0, true);

            g2d.dispose();
        }
    }

    private static class CommandButtonLayoutManagerTaskbarOverflow
            extends CommandButtonLayoutManagerSmall {
        @Override
        public int getPreferredIconSize(JCommandButton commandButton) {
            int fontSize = commandButton.getFont().getSize();
            int arrowIconHeight = (int) RadianceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
            int arrowIconWidth = (int) RadianceSizeUtils.getSmallArrowIconWidth(fontSize);
            return Math.max(arrowIconWidth, arrowIconHeight);
        }
    }

    @RadiancePopupContainer
    private class TaskbarOverflowPopupPanelContent extends JPanel {
        public TaskbarOverflowPopupPanelContent(LayoutManager layout) {
            super(layout);
        }
    }

    @RadiancePopupContainer
    public class TaskbarOverflowPopupPanel extends JPopupPanel {
        private TaskbarOverflowPopupPanel(List<Component> overflowComponents,
                Dimension size, boolean hasScrolling) {
            this.setLayout(new BorderLayout());

            JPanel overflowPanel = new TaskbarOverflowPopupPanelContent(
                    new FlowLayout(FlowLayout.CENTER, getTaskBarLayoutGap(this), 0));
            for (Component overflow : overflowComponents) {
                overflowPanel.add(overflow);
            }

            if (hasScrolling) {
                this.add(new JScrollablePanel<>(overflowPanel,
                        JScrollablePanel.ScrollType.HORIZONTALLY), BorderLayout.CENTER);
            } else {
                this.add(overflowPanel, BorderLayout.CENTER);
            }

            this.setPreferredSize(size);
            this.setSize(size);
            RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(this,
                    DecorationAreaType.HEADER);
        }
    }

    public static class TaskbarOverflowButton extends JCommandButton {
        public TaskbarOverflowButton(Projection<JCommandButton, ? extends Command,
                CommandButtonPresentationModel> projection) {
            super(projection);
        }
    }

    /**
     * The taskbar panel that holds the taskbar components.
     *
     * @author Kirill Grouchnikov
     */
    private class TaskbarPanel extends JPanel {
        private TaskbarOverflowButton overflowButton;
        private List<Component> overflowComponents;

        /**
         * Creates the new taskbar panel.
         */
        private TaskbarPanel() {
            super(new TaskbarLayout());

            this.setFont(RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().
                    getControlFont());

            this.overflowComponents = new ArrayList<>();
            this.setOpaque(false);
            int insets = RadianceSizeUtils.getAdjustedSize(
                    RadianceSizeUtils.getComponentFontSize(this), 2, 3, 1, false);
            this.setBorder(new EmptyBorder(2, insets, 2, insets));

            int defaultIconSize = (int) RadianceSizeUtils.getSmallDoubleArrowIconHeight(
                    getFont().getSize());
            CommandButtonProjection<Command> overflowProjection = Command.builder()
                    .setAction(commandActionEvent -> SwingUtilities.invokeLater(() ->
                            showOverflowTaskbarContent(commandActionEvent.getButtonSource())))
                    .build().project(CommandButtonPresentationModel.builder()
                            .setPresentationState(new CommandButtonPresentationState(
                                    "overflow", defaultIconSize) {
                                @Override
                                public CommandButtonLayoutManager createLayoutManager(
                                        JCommandButton commandButton) {
                                    return new CommandButtonLayoutManagerTaskbarOverflow();
                                }
                            })
                            .build());
            overflowProjection.setComponentCustomizer(button -> {
                final int fontSize = RadianceSizeUtils.getComponentFontSize(button);
                int arrowIconHeight = (int) RadianceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
                int arrowIconWidth = (int) RadianceSizeUtils.getSmallArrowIconWidth(fontSize);
                RadianceIcon arrowIcon = new BladeTransitionAwareRadianceIcon(button,
                        () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                        (g, scheme, width, height) -> BladeArrowIconUtils.drawDoubleArrow(
                                g, arrowIconWidth, arrowIconHeight,
                                RadianceSizeUtils.getSmallDoubleArrowGap(fontSize),
                                RadianceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                                getComponentOrientation().isLeftToRight()
                                        ? SwingUtilities.EAST
                                        : SwingUtilities.WEST,
                                scheme),
                        new Dimension(arrowIconWidth, arrowIconHeight));
                button.setIcon(arrowIcon);

                button.setBorder(BorderFactory.createEmptyBorder(2, 6, 2, 6));
                button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                RadianceThemingCortex.ComponentScope.setButtonStraightSides(button,
                        EnumSet.allOf(RadianceThemingSlices.Side.class));
            });
            overflowProjection.setComponentSupplier(projection -> TaskbarOverflowButton::new);
            this.overflowButton = (TaskbarOverflowButton) overflowProjection.buildComponent();
        }

        @Override
        protected void paintComponent(Graphics g) {
        }

        @Override
        public Dimension getPreferredSize() {
            Insets ins = this.getInsets();
            int pw = 0;
            int gap = getTaskBarLayoutGap(this);
            for (Component component : getRibbon().getTaskbarComponents()) {
                pw += component.getPreferredSize().width;
                pw += gap;
            }
            return new Dimension(pw + ins.left + ins.right, this.getParent().getHeight());
        }

        private void showOverflowTaskbarContent(JCommandButton overflowButton) {
            // How wide is the full overflow content?
            int gap = getTaskBarLayoutGap(this);
            int overflowFullWidth = gap;
            for (Component overflow : this.overflowComponents) {
                overflowFullWidth += (overflow.getPreferredSize().width + gap);
            }
            overflowFullWidth += 2 * gap;

            // How wide is the ribbon?
            int ribbonWidth = RadianceRibbonFrameTitlePane.this.getWidth();

            // How wide the popup will be
            int popupWidth = Math.min(overflowFullWidth, ribbonWidth);

            // Overflow is restricted to the ribbon width. Horizontally, it is anchored as
            // close to the overflow button as we can.
            int overflowButtonX = overflowButton.getLocationOnScreen().x;
            int titlePaneX = RadianceRibbonFrameTitlePane.this.getLocationOnScreen().x;
            int titlePaneY = RadianceRibbonFrameTitlePane.this.getLocationOnScreen().y;
            int titlePaneHeight = RadianceRibbonFrameTitlePane.this.getHeight();

            // Determine the X position of the popup in screen coordinates
            int popupX;
            if (this.getComponentOrientation().isLeftToRight()) {
                if ((overflowButtonX + popupWidth) > (titlePaneX + ribbonWidth)) {
                    // Don't let the overflow popup go beyond the right edge of the ribbon
                    int delta = (overflowButtonX + popupWidth) - (titlePaneX + ribbonWidth);
                    popupX = overflowButtonX - delta;
                } else {
                    // The overflow popup will be anchored to the overflow button's left edge
                    popupX = overflowButtonX;
                }
            } else {
                int overflowButtonWidth = overflowButton.getWidth();
                if ((overflowButtonX + overflowButtonWidth - popupWidth) < titlePaneX) {
                    // Don't let the overflow popup go beyond the left edge of the ribbon
                    int delta = titlePaneX - (overflowButtonX + overflowButtonWidth - popupWidth);
                    popupX = overflowButtonX + overflowButtonWidth - popupWidth + delta;
                } else {
                    // The overflow popup will be anchored to the overflow button's right edge
                    popupX = overflowButtonX + overflowButtonWidth - popupWidth;
                }
            }

            // Create the popup panel with the overflow content (with scrolling if necessary)
            JPopupPanel overflowPopupPanel = new TaskbarOverflowPopupPanel(
                    this.overflowComponents,
                    new Dimension(popupWidth,
                            ComponentUtilities.getTaskToggleButtonHeight(getRibbon())),
                    overflowFullWidth > ribbonWidth);
            overflowPopupPanel.applyComponentOrientation(this.getComponentOrientation());

            // Show the popup
            Popup popup = PopupFactory.getSharedInstance().getPopup(
                    overflowButton, overflowPopupPanel, popupX,
                    titlePaneY + titlePaneHeight);
            PopupPanelManager.defaultManager().addPopup(overflowButton, popup, overflowPopupPanel);
        }

        private void showAsMuchAsPossible(int availableWidth) {
            this.removeAll();
            this.overflowComponents.clear();

            Insets ins = this.getInsets();
            int gap = getTaskBarLayoutGap(this);

            boolean isInOverflow = false;
            int pw = ins.left + ins.right + this.overflowButton.getPreferredSize().width + gap;
            for (Component component : getRibbon().getTaskbarComponents()) {
                int componentWidth = component.getPreferredSize().width;
                if (!isInOverflow && (pw + componentWidth + gap) <= availableWidth) {
                    // can still fit
                    this.add(component);
                    pw += (componentWidth + gap);
                } else {
                    isInOverflow = true;
                    this.overflowComponents.add(component);
                }
            }
            this.add(this.overflowButton);
            this.overflowButton.setActionKeyTip(getRibbon().getTaskbarKeyTipPolicy()
                    .getOverflowButtonKeyTip());

            updateKeyTips();
            revalidate();
        }

        private void showAll() {
            this.removeAll();
            this.overflowComponents.clear();

            for (Component component : getRibbon().getTaskbarComponents()) {
                this.add(component);
            }

            updateKeyTips();
            revalidate();
        }

        private void updateKeyTips() {
            RibbonTaskbarKeyTipPolicy policy = getRibbon().getTaskbarKeyTipPolicy();
            List<Component> taskbarComponents = getRibbon().getTaskbarComponents();
            int index = 1;
            for (Component taskbarComp : taskbarComponents) {
                if (taskbarComp instanceof JCommandButton) {
                    JCommandButton button = (JCommandButton) taskbarComp;
                    switch (button.getCommandButtonKind()) {
                        case ACTION_ONLY:
                            button.setActionKeyTip(policy.getContentKeyTip(index++));
                            break;
                        case ACTION_AND_POPUP_MAIN_ACTION:
                        case ACTION_AND_POPUP_MAIN_POPUP:
                            button.setActionKeyTip(policy.getContentKeyTip(index++));
                            button.setPopupKeyTip(policy.getContentKeyTip(index++));
                            break;
                        case POPUP_ONLY:
                            button.setPopupKeyTip(policy.getContentKeyTip(index++));
                    }
                } else if (taskbarComp instanceof JRibbonComponent) {
                    ((JRibbonComponent) taskbarComp).setKeyTip(policy.getContentKeyTip(index++));
                }
            }
        }
    }

    /**
     * Maps the currently visible contextual task groups to the respective child components of this
     * title pane.
     */
    private Map<RibbonContextualTaskGroup, RadianceContextualGroupComponent> taskComponentMap;

    /**
     * Listener to sync {@link #taskComponentMap}.
     */
    private ChangeListener ribbonFrameChangeListener;

    /**
     * Panel for the taskbar components.
     */
    private TaskbarPanel taskbarPanel;

    /**
     * Creates a new title pane for {@link JRibbonFrame}.
     *
     * @param root Root pane.
     * @param ui   UI delegate.
     */
    public RadianceRibbonFrameTitlePane(JRootPane root, RadianceRootPaneUI ui) {
        super(root, ui);
        this.taskComponentMap = new HashMap<>();
        this.taskbarPanel = new TaskbarPanel();
        this.taskbarPanel.setComponentOrientation(root.getComponentOrientation());
        RadianceTitlePaneUtilities.markTitlePaneExtraComponent(this.taskbarPanel,
                RadianceTitlePaneUtilities.ExtraComponentKind.LEADING);
        // Mark the taskbar panel with HEADER decoration area type even though it is in the
        // primary title pane. Otherwise the background fill on the popup menu doesn't look good.
        ComponentOrParentChainScope.setDecorationType(this.taskbarPanel,
                DecorationAreaType.HEADER);
        this.add(this.taskbarPanel);
    }

    @Override
    protected LayoutManager createLayout() {
        return new RibbonFrameTitlePaneLayout();
    }

    @Override
    public void addNotify() {
        super.addNotify();

        JRibbon ribbon = this.getRibbon();

        this.syncRibbonState();

        this.ribbonFrameChangeListener = changeEvent -> {
            syncRibbonState();
            invalidate();
            revalidate();
            repaint();
        };
        ribbon.addChangeListener(this.ribbonFrameChangeListener);
    }

    @Override
    public void removeNotify() {
        JRibbon ribbon = this.getRibbon();

        for (RadianceContextualGroupComponent groupComp : this.taskComponentMap.values()) {
            this.remove(groupComp);
        }

        ribbon.removeChangeListener(this.ribbonFrameChangeListener);
        this.ribbonFrameChangeListener = null;

        super.removeNotify();
    }

    /**
     * Synchronizes the child components for ribbon state (visible contextual task groups and
     * taskbar components).
     */
    private void syncRibbonState() {
        // Contextual task groups
        for (RadianceContextualGroupComponent groupComp : this.taskComponentMap.values()) {
            this.remove(groupComp);
        }
        this.taskComponentMap.clear();
        JRibbon ribbon = this.getRibbon();
        for (int i = 0; i < ribbon.getContextualTaskGroupCount(); i++) {
            RibbonContextualTaskGroup group = ribbon.getContextualTaskGroup(i);
            if (!ribbon.isVisible(group)) {
                continue;
            }
            RadianceContextualGroupComponent taskGroupComponent =
                    new RadianceContextualGroupComponent(group);
            taskGroupComponent.applyComponentOrientation(
                    this.getRibbon().getComponentOrientation());
            this.add(taskGroupComponent);
            this.taskComponentMap.put(group, taskGroupComponent);
            RadianceTitlePaneUtilities.markTitlePaneExtraComponent(taskGroupComponent,
                    RadianceTitlePaneUtilities.ExtraComponentKind.TRAILING);
        }
        // Taskbar components
        this.taskbarPanel.removeAll();
        this.taskbarPanel.setPreferredSize(null);
    }

    /**
     * Custom layout manager for the title panes of {@link JRibbonFrame} under decorated mode.
     *
     * @author Kirill Grouchnikov
     */
    protected class RibbonFrameTitlePaneLayout extends TitlePaneLayout {
        @Override
        public void layoutContainer(Container c) {
            super.layoutContainer(c);

            JRibbon ribbon = getRibbon();
            boolean ltr = ribbon.getComponentOrientation().isLeftToRight();
            RibbonUI ribbonUI = ribbon.getUI();

            if (ltr) {
                // headers of contextual task groups
                for (Map.Entry<RibbonContextualTaskGroup, RadianceContextualGroupComponent>
                        entry : taskComponentMap.entrySet()) {
                    Rectangle taskGroupBounds = ribbonUI
                            .getContextualTaskGroupBounds(entry.getKey());
                    // make sure that the header bounds do not overlap with the
                    // min / max / close buttons
                    int minTrailingX = c.getWidth();

                    for (int i = 0; i < c.getComponentCount(); i++) {
                        Component child = c.getComponent(i);
                        if (!child.isVisible()) {
                            continue;
                        }
                        if (child instanceof JComponent) {
                            RadianceTitlePaneUtilities.ExtraComponentKind kind =
                                    (RadianceTitlePaneUtilities.ExtraComponentKind) (
                                            (JComponent) child).getClientProperty(
                                            RadianceTitlePaneUtilities
                                                    .EXTRA_COMPONENT_KIND);
                            if (kind == RadianceTitlePaneUtilities.ExtraComponentKind.LEADING) {
                                continue;
                            }
                            if (child instanceof RadianceContextualGroupComponent) {
                                continue;
                            }

                            minTrailingX = Math.min(child.getX(), minTrailingX);
                        }
                    }

                    int width = taskGroupBounds.width;
                    if (taskGroupBounds.x + width > (minTrailingX - 5)) {
                        width = minTrailingX - 5 - taskGroupBounds.x;
                    }
                    entry.getValue().setBounds(
                            new Rectangle(taskGroupBounds.x, 0, width, c.getHeight()));
                    // hide headers when the task toggle buttons
                    // are wrapped with visible scroller buttons
                    entry.getValue().setVisible(!ribbonUI.isShowingScrollsForTaskToggleButtons());
                }

                // taskbar panel
                taskbarPanel.setVisible(true);
                Dimension pref = taskbarPanel.getPreferredSize();

                int availableForTaskbarPanel =
                        (int) (TASKBAR_WIDTH_MAX_RATIO * c.getBounds().width);

                if (pref.width <= availableForTaskbarPanel) {
                    taskbarPanel.showAll();
                } else {
                    taskbarPanel.showAsMuchAsPossible(availableForTaskbarPanel);
                    pref.width = availableForTaskbarPanel;
                }

                if (taskbarPanel.getComponentCount() == 0) {
                    // If there are no taskbar components, don't push the title to the right
                    pref.width = 0;
                }

                if (taskbarPanel.isVisible()) {
                    if (pref.width == 0) {
                        taskbarPanel.setBounds(menuBar.getX() + menuBar.getWidth(), 0,
                                pref.width, c.getHeight());
                    } else {
                        taskbarPanel.setBounds(menuBar.getX() + menuBar.getWidth() + 5, 0,
                                pref.width, c.getHeight());
                    }
                    taskbarPanel.doLayout();
                }
            } else {
                // headers of contextual task groups
                for (Map.Entry<RibbonContextualTaskGroup, RadianceContextualGroupComponent>
                        entry : taskComponentMap.entrySet()) {
                    Rectangle taskGroupBounds = ribbonUI
                            .getContextualTaskGroupBounds(entry.getKey());
                    // make sure that the header bounds do not overlap with the
                    // min / max / close buttons
                    int maxTrailingX = 0;

                    for (int i = 0; i < c.getComponentCount(); i++) {
                        Component child = c.getComponent(i);
                        if (!child.isVisible()) {
                            continue;
                        }
                        if (child instanceof JComponent) {
                            RadianceTitlePaneUtilities.ExtraComponentKind kind =
                                    (RadianceTitlePaneUtilities.ExtraComponentKind) (
                                            (JComponent) child).getClientProperty(
                                            RadianceTitlePaneUtilities.EXTRA_COMPONENT_KIND);
                            if (kind == RadianceTitlePaneUtilities.ExtraComponentKind.LEADING) {
                                continue;
                            }
                            if (child instanceof RadianceContextualGroupComponent) {
                                continue;
                            }

                            maxTrailingX = Math.max(child.getX() + child.getWidth(), maxTrailingX);
                        }
                    }

                    int width = taskGroupBounds.width;
                    int x = taskGroupBounds.x;
                    if (taskGroupBounds.x < (maxTrailingX + 5)) {
                        int diff = maxTrailingX + 5 - taskGroupBounds.x;
                        x += diff;
                        width -= diff;
                    }
                    entry.getValue().setBounds(new Rectangle(x, 0, width, c.getHeight()));
                    // hide headers when the task toggle buttons
                    // are wrapped with visible scroller buttons
                    entry.getValue().setVisible(!ribbonUI.isShowingScrollsForTaskToggleButtons());
                }

                // taskbar panel
                taskbarPanel.setVisible(true);
                Dimension pref = taskbarPanel.getPreferredSize();

                int availableForTaskbarPanel =
                        (int) (TASKBAR_WIDTH_MAX_RATIO * c.getBounds().width);

                if (pref.width <= availableForTaskbarPanel) {
                    taskbarPanel.showAll();
                } else {
                    taskbarPanel.showAsMuchAsPossible(availableForTaskbarPanel);
                    pref.width = availableForTaskbarPanel;
                }

                if (taskbarPanel.getComponentCount() == 0) {
                    // If there are no taskbar components, don't push the title to the left
                    pref.width = 0;
                }

                if (taskbarPanel.isVisible()) {
                    if (pref.width == 0) {
                        taskbarPanel.setBounds(menuBar.getX(), 0, pref.width,
                                c.getHeight());
                    } else {
                        taskbarPanel.setBounds(menuBar.getX() - 5 - pref.width, 0,
                                pref.width, c.getHeight());
                    }
                    taskbarPanel.doLayout();
                }
            }
            menuBar.setVisible(true);
        }
    }

    /**
     * Layout for the task bar.
     *
     * @author Kirill Grouchnikov
     */
    private class TaskbarLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component c) {
        }

        @Override
        public void removeLayoutComponent(Component c) {
        }

        @Override
        public Dimension preferredLayoutSize(Container c) {
            Insets ins = c.getInsets();
            int pw = 0;
            int gap = getTaskBarLayoutGap(c);
            for (Component regComp : c.getComponents()) {
                if (regComp.isVisible()) {
                    pw += regComp.getPreferredSize().width;
                    pw += gap;
                }
            }
            return new Dimension(pw + ins.left + ins.right, c.getParent().getHeight());
        }

        @Override
        public Dimension minimumLayoutSize(Container c) {
            return this.preferredLayoutSize(c);
        }

        @Override
        public void layoutContainer(Container c) {
            Insets ins = c.getInsets();
            int gap = getTaskBarLayoutGap(c);
            boolean ltr = c.getComponentOrientation().isLeftToRight();
            int x = ltr ? ins.left : c.getWidth() - ins.right;
            for (Component regComp : c.getComponents()) {
                if (!regComp.isVisible()) {
                    continue;
                }
                int pw = regComp.getPreferredSize().width;
                if (ltr) {
                    regComp.setBounds(x, ins.top, pw, c.getHeight() - ins.top - ins.bottom);
                    x += (pw + gap);
                } else {
                    regComp.setBounds(x - pw, ins.top, pw, c.getHeight() - ins.top - ins.bottom);
                    x -= (pw + gap);
                }
            }
        }
    }

    public Container getTaskbarPanel() {
        return this.taskbarPanel;
    }

    /**
     * Retrieves the {@link JRibbon} component of the associated {@link JRibbonFrame}.
     *
     * @return {@link JRibbon} component of the associated {@link JRibbonFrame}.
     */
    private JRibbon getRibbon() {
        JRibbonFrame ribbonFrame = (JRibbonFrame) SwingUtilities.getWindowAncestor(this);
        return ribbonFrame.getRibbon();
    }

    /**
     * Returns the layout gap of the taskbar panel.
     *
     * @param c Container.
     * @return Layout gap of the taskbar panel.
     */
    private int getTaskBarLayoutGap(Container c) {
        return RadianceSizeUtils.getAdjustedSize(RadianceSizeUtils.getComponentFontSize(c), 1, 6,
                1, false);
    }
}
