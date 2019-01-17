/*
 * Copyright (c) 2005-2019 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.flamingo.internal.ui.ribbon;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.*;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager.PopupEvent;
import org.pushingpixels.flamingo.api.common.projection.CommandButtonProjection;
import org.pushingpixels.flamingo.api.ribbon.*;
import org.pushingpixels.flamingo.api.ribbon.resize.*;
import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.JRibbonApplicationMenuButton;
import org.pushingpixels.flamingo.internal.utils.*;
import org.pushingpixels.neon.NeonCortex;
import org.pushingpixels.substance.api.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.plaf.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.List;
import java.util.*;

/**
 * Basic UI for ribbon {@link JRibbon}.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BasicRibbonUI extends RibbonUI {
    private static final String JUST_MINIMIZED = "ribbon.internal.justMinimized";

    /**
     * The associated ribbon.
     */
    protected JRibbon ribbon;

    protected JScrollablePanel<JPanel> bandScrollablePanel;

    private JScrollablePanel<TaskToggleButtonsHostPanel> taskToggleButtonsScrollablePanel;

    protected JRibbonApplicationMenuButton applicationMenuButton;

    private Container anchoredButtons;

    /**
     * Map of toggle buttons of all tasks.
     */
    protected Map<RibbonTask, AbstractCommandButton> taskToggleButtons;

    /**
     * Group model for task toggle buttons.
     */
    private CommandToggleGroupModel taskToggleGroupModel;

    /**
     * Change listener.
     */
    private ChangeListener ribbonChangeListener;

    /**
     * Property change listener.
     */
    private PropertyChangeListener propertyChangeListener;

    private ComponentListener ribbonComponentListener;

    /**
     * Creates a new basic ribbon UI delegate.
     */
    protected BasicRibbonUI() {
        this.taskToggleButtons = new HashMap<>();
        this.taskToggleGroupModel = new CommandToggleGroupModel();
        this.taskToggleGroupModel.setAllowsClearingSelection(false);
    }

    @Override
    public void installUI(JComponent c) {
        this.ribbon = (JRibbon) c;
        installDefaults();
        installComponents();
        installListeners();
    }

    @Override
    public void uninstallUI(JComponent c) {
        uninstallListeners();
        uninstallComponents();
        uninstallDefaults();

        this.ribbon = null;
    }

    /**
     * Installs listeners on the associated ribbon.
     */
    protected void installListeners() {
        this.ribbonChangeListener = (ChangeEvent e) -> syncRibbonState();
        this.ribbon.addChangeListener(this.ribbonChangeListener);

        this.propertyChangeListener = (PropertyChangeEvent evt) -> {
            if ("selectedTask".equals(evt.getPropertyName())) {
                syncSelectedTask();
            }
            if ("applicationMenu".equals(evt.getPropertyName())) {
                if (this.applicationMenuButton != null) {
                    this.ribbon.remove(this.applicationMenuButton);
                }

                boolean isShowingAppMenuButton = (ribbon.getApplicationMenuProjection() != null);
                if (isShowingAppMenuButton) {
                    this.applicationMenuButton = new JRibbonApplicationMenuButton(
                            this.ribbon.getApplicationMenuCommandProjection());
                    this.applicationMenuButton.applyComponentOrientation(
                            this.ribbon.getComponentOrientation());
                    this.syncApplicationMenuTips();
                    this.ribbon.add(this.applicationMenuButton);
                }

                ribbon.revalidate();
                ribbon.doLayout();
                ribbon.repaint();

                Window windowAncestor = SwingUtilities.getWindowAncestor(ribbon);
                if ((windowAncestor instanceof JRibbonFrame) && isShowingAppMenuButton) {
                    applicationMenuButton.setText(ribbon.getApplicationMenuCommandProjection()
                            .getContentModel().getText());
                }

                syncApplicationMenuTips();
            }
            if ("minimized".equals(evt.getPropertyName())) {
                PopupPanelManager.defaultManager().hidePopups(null);
                RichTooltipManager.sharedInstance().hideCurrentlyShowingTipIfNecessary();
                ribbon.revalidate();
                ribbon.doLayout();
                ribbon.repaint();
            }
        };
        this.ribbon.addPropertyChangeListener(this.propertyChangeListener);

        this.ribbonComponentListener = new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                KeyTipManager.defaultManager().hideAllKeyTips();
            }
        };
        this.ribbon.addComponentListener(this.ribbonComponentListener);
    }

    /**
     * Uninstalls listeners from the associated ribbon.
     */
    protected void uninstallListeners() {
        this.ribbon.removeChangeListener(this.ribbonChangeListener);
        this.ribbonChangeListener = null;

        this.ribbon.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;

        this.ribbon.removeComponentListener(this.ribbonComponentListener);
        this.ribbonComponentListener = null;
    }

    /**
     * Installs defaults on the associated ribbon.
     */
    protected void installDefaults() {
        Border b = this.ribbon.getBorder();
        if (b == null || b instanceof UIResource) {
            this.ribbon.setBorder(new BorderUIResource.EmptyBorderUIResource(0, 0, 1, 0));
        }
    }

    /**
     * Uninstalls defaults from the associated ribbon.
     */
    protected void uninstallDefaults() {
    }

    /**
     * Installs subcomponents on the associated ribbon.
     */
    protected void installComponents() {
        // band scrollable panel
        JPanel bandHostPanel = new JPanel();
        bandHostPanel.setLayout(createBandHostPanelLayoutManager());
        this.bandScrollablePanel = new JScrollablePanel<>(bandHostPanel,
                JScrollablePanel.ScrollType.HORIZONTALLY);
        this.bandScrollablePanel.setScrollOnRollover(false);
        this.ribbon.add(this.bandScrollablePanel);

        // task toggle buttons scrollable panel
        TaskToggleButtonsHostPanel taskToggleButtonsHostPanel = createTaskToggleButtonsHostPanel();
        taskToggleButtonsHostPanel.setLayout(createTaskToggleButtonsHostPanelLayoutManager());
        this.taskToggleButtonsScrollablePanel = new JScrollablePanel<>(
                taskToggleButtonsHostPanel, JScrollablePanel.ScrollType.HORIZONTALLY);
        this.taskToggleButtonsScrollablePanel.setScrollOnRollover(false);
        // need to repaint the entire ribbon on change since scrolling
        // the task toggle buttons affects the contour outline
        // of the ribbon
        this.taskToggleButtonsScrollablePanel.addChangeListener(
                (ChangeEvent e) -> ribbon.repaint());
        this.ribbon.add(this.taskToggleButtonsScrollablePanel);

        this.ribbon.setLayout(createLayoutManager());

        this.syncRibbonState();

        boolean isShowingAppMenuButton = (ribbon.getApplicationMenuProjection() != null);
        if (isShowingAppMenuButton) {
            this.applicationMenuButton = new JRibbonApplicationMenuButton(
                    this.ribbon.getApplicationMenuCommandProjection());
            this.applicationMenuButton.applyComponentOrientation(
                    this.ribbon.getComponentOrientation());
            this.syncApplicationMenuTips();
            this.ribbon.add(this.applicationMenuButton);
            Window windowAncestor = SwingUtilities.getWindowAncestor(this.ribbon);
            if (windowAncestor instanceof JRibbonFrame) {
                this.applicationMenuButton.setText(ribbon.getApplicationMenuCommandProjection()
                        .getContentModel().getText());
            }
        }
    }

    @Override
    public JRibbonApplicationMenuButton getApplicationMenuButton() {
        return this.applicationMenuButton;
    }

    private LayoutManager createTaskToggleButtonsHostPanelLayoutManager() {
        return new TaskToggleButtonsHostPanelLayout();
    }

    protected abstract TaskToggleButtonsHostPanel createTaskToggleButtonsHostPanel();

    private LayoutManager createBandHostPanelLayoutManager() {
        return new BandHostPanelLayout();
    }

    /**
     * Uninstalls subcomponents from the associated ribbon.
     */
    protected void uninstallComponents() {
        JPanel bandHostPanel = this.bandScrollablePanel.getView();
        bandHostPanel.removeAll();
        bandHostPanel.setLayout(null);
        this.ribbon.remove(this.bandScrollablePanel);

        TaskToggleButtonsHostPanel taskToggleButtonsHostPanel =
                this.taskToggleButtonsScrollablePanel.getView();
        taskToggleButtonsHostPanel.removeAll();
        taskToggleButtonsHostPanel.setLayout(null);
        this.ribbon.remove(this.taskToggleButtonsScrollablePanel);

        this.ribbon.remove(this.applicationMenuButton);
        if (this.anchoredButtons != null) {
            this.ribbon.remove(this.anchoredButtons);
        }

        this.ribbon.setLayout(null);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        NeonCortex.installDesktopHints(g2d);
        super.update(g2d, c);
        g2d.dispose();
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        this.paintBackground(g);

        if (ribbon.isMinimized()) {
            this.paintMinimizedRibbonSeparator(g);
        }
    }

    protected abstract void paintMinimizedRibbonSeparator(Graphics g);

    /**
     * Paints the ribbon background.
     *
     * @param g Graphics context.
     */
    protected abstract void paintBackground(Graphics g);

    @Override
    public Rectangle getContextualTaskGroupBounds(RibbonContextualTaskGroup group) {
        Rectangle rect = null;
        for (int j = 0; j < group.getTaskCount(); j++) {
            JComponent button = taskToggleButtons.get(group.getTask(j));
            if (rect == null) {
                rect = button.getBounds();
            } else {
                rect = rect.union(button.getBounds());
            }
        }
        int buttonGap = getTabButtonGap();
        Point location = SwingUtilities.convertPoint(taskToggleButtonsScrollablePanel.getView(),
                rect.getLocation(), ribbon);
        return new Rectangle(location.x - buttonGap / 3, location.y - 1,
                rect.width + buttonGap * 2 / 3 - 1, rect.height + 1);
    }

    /**
     * Returns the layout gap for the bands in the associated ribbon.
     *
     * @return The layout gap for the bands in the associated ribbon.
     */
    private int getBandGap() {
        return FlamingoUtilities.getScaledSize(2, this.ribbon.getFont().getSize(), 0.2, 1);
    }

    /**
     * Returns the layout gap for the tab buttons in the associated ribbon.
     *
     * @return The layout gap for the tab buttons in the associated ribbon.
     */
    protected int getTabButtonGap() {
        return FlamingoUtilities.getScaledSize(6, this.ribbon.getFont().getSize(), 0.25, 1);
    }

    /**
     * Invoked by <code>installUI</code> to create a layout manager object to manage the
     * {@link JRibbon}.
     *
     * @return a layout manager object
     */
    protected LayoutManager createLayoutManager() {
        return new RibbonLayout();
    }

    /**
     * Returns the height of the taskbar area.
     *
     * @return The height of the taskbar area.
     */
    public abstract int getTaskbarHeight();

    /**
     * Returns the height of the task toggle button area.
     *
     * @return The height of the task toggle button area.
     */
    public abstract int getTaskToggleButtonHeight();

    /**
     * Layout for the ribbon.
     *
     * @author Kirill Grouchnikov
     */
    private class RibbonLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component c) {
        }

        @Override
        public void removeLayoutComponent(Component c) {
        }

        @Override
        public Dimension preferredLayoutSize(Container c) {
            Insets ins = c.getInsets();
            int maxPrefBandHeight = 0;
            boolean isRibbonMinimized = ribbon.isMinimized();
            if (!isRibbonMinimized) {
                if (ribbon.getTaskCount() > 0) {
                    RibbonTask selectedTask = ribbon.getSelectedTask();
                    for (AbstractRibbonBand ribbonBand : selectedTask.getBands()) {
                        int bandPrefHeight = ribbonBand.getPreferredSize().height;
                        Insets bandInsets = ribbonBand.getInsets();
                        maxPrefBandHeight = Math.max(maxPrefBandHeight,
                                bandPrefHeight + bandInsets.top + bandInsets.bottom);
                    }
                }
            }

            int extraHeight = getTaskToggleButtonHeight();
            int prefHeight = maxPrefBandHeight + extraHeight + ins.top + ins.bottom;
            // System.out.println("Ribbon pref = " + prefHeight);
            return new Dimension(c.getWidth(), prefHeight);
        }

        @Override
        public Dimension minimumLayoutSize(Container c) {
            // go over all ribbon bands and sum the width
            // of ribbon buttons (of collapsed state)
            Insets ins = c.getInsets();
            int width = 0;
            int maxMinBandHeight = 0;
            int gap = getBandGap();

            int extraHeight = getTaskToggleButtonHeight();

            if (ribbon.getTaskCount() > 0) {
                boolean isRibbonMinimized = ribbon.isMinimized();
                // minimum is when all the tasks are collapsed
                RibbonTask selectedTask = ribbon.getSelectedTask();
                for (AbstractRibbonBand ribbonBand : selectedTask.getBands()) {
                    int bandPrefHeight = ribbonBand.getMinimumSize().height;
                    Insets bandInsets = ribbonBand.getInsets();
                    RibbonBandUI bandUI = ribbonBand.getUI();
                    width += bandUI.getPreferredCollapsedWidth();
                    if (!isRibbonMinimized) {
                        maxMinBandHeight = Math.max(maxMinBandHeight,
                                bandPrefHeight + bandInsets.top + bandInsets.bottom);
                    }
                }
                // add inter-band gaps
                width += gap * (selectedTask.getBandCount() - 1);
            } else {
                // fix for issue 44 (empty ribbon)
                width = 50;
            }
            return new Dimension(width, maxMinBandHeight + extraHeight + ins.top + ins.bottom);
        }

        private int getAnchoredButtonsWidth(CommandButtonPresentationState state) {
            int result = 0;

            for (Component comp : anchoredButtons.getComponents()) {
                AbstractCommandButton anchoredButton = (AbstractCommandButton) comp;
                result += state.createLayoutManager(anchoredButton)
                        .getPreferredSize(anchoredButton).width;
            }

            return result;
        }

        @Override
        public void layoutContainer(Container c) {
            // System.out.println("Ribbon real = " + c.getHeight());

            Insets ins = c.getInsets();
            int tabButtonGap = getTabButtonGap();

            boolean ltr = ribbon.getComponentOrientation().isLeftToRight();

            // the top row - task bar components
            int width = c.getWidth();
            int y = ins.top;

            int taskToggleButtonHeight = getTaskToggleButtonHeight();

            int x = ltr ? ins.left : width - ins.right;

            // the application menu button width
            boolean isShowingAppMenuButton = (ribbon.getApplicationMenuProjection() != null);
            FontMetrics fm = applicationMenuButton.getFontMetrics(applicationMenuButton.getFont());
            int appMenuButtonWidth = isShowingAppMenuButton
                    ? fm.stringWidth(ribbon.getApplicationMenuCommandProjection()
                    .getContentModel().getText()) + 40
                    : 0;

            x = ltr ? x + 2 : x - 2;
            if (isShowingAppMenuButton) {
                x = ltr ? x + appMenuButtonWidth + 2 : x - appMenuButtonWidth - 2;
            }

            // how much horizontal space do anchored buttons need in expanded (text + icon) and
            // collapsed (icon only) modes?
            int anchoredButtonsCollapsedWidth = getAnchoredButtonsWidth(
                    CommandButtonPresentationState.SMALL);
            int anchoredButtonsExpandedWidth = getAnchoredButtonsWidth(
                    CommandButtonPresentationState.MEDIUM);

            // if anchored buttons are expanded, do we have enough horizontal space to display
            // the task toggle buttons in their preferred size (without cutting off on the sides
            // or kicking in the scrolling)?
            TaskToggleButtonsHostPanel taskToggleButtonsStrip = taskToggleButtonsScrollablePanel
                    .getView();
            taskToggleButtonsStrip.setPreferredSize(null);

            int fullPreferredContentWidth = ins.left + ins.right + 2
                    + (isShowingAppMenuButton ? appMenuButtonWidth : 0)
                    + ((anchoredButtons.getComponentCount() > 0)
                    ? (anchoredButtonsExpandedWidth + tabButtonGap) : 0)
                    + taskToggleButtonsStrip.getPreferredSize().width;

            int anchoredButtonPanelWidth;
            if (fullPreferredContentWidth <= c.getWidth()) {
                // can fit everything with no cuts
                for (Component comp : anchoredButtons.getComponents()) {
                    AbstractCommandButton anchoredButton = (AbstractCommandButton) comp;
                    anchoredButton.setPresentationState(CommandButtonPresentationState.MEDIUM);
                }
                anchoredButtonPanelWidth = anchoredButtonsExpandedWidth;
            } else {
                // switch anchored buttons to icon-only mode
                for (Component comp : anchoredButtons.getComponents()) {
                    AbstractCommandButton anchoredButton = (AbstractCommandButton) comp;
                    anchoredButton.setPresentationState(CommandButtonPresentationState.SMALL);
                }
                anchoredButtonPanelWidth = anchoredButtonsCollapsedWidth;
            }

            if (anchoredButtons.getComponentCount() > 0) {
                // Note that here we're using the height of task toggle buttons so that all the
                // content in that row has consistent vertical size.
                if (ltr) {
                    anchoredButtons.setBounds(width - ins.right - anchoredButtonPanelWidth, y,
                            anchoredButtonPanelWidth, taskToggleButtonHeight);
                } else {
                    anchoredButtons.setBounds(ins.left, y, anchoredButtonPanelWidth,
                            taskToggleButtonHeight);
                }
                anchoredButtons.doLayout();
            }

            // task buttons
            if (ltr) {
                int taskButtonsWidth = (anchoredButtons.getComponentCount() > 0)
                        ? (anchoredButtons.getX() - tabButtonGap - x)
                        : (c.getWidth() - ins.right - x);
                taskToggleButtonsScrollablePanel.setBounds(x, y, taskButtonsWidth,
                        taskToggleButtonHeight);
            } else {
                int taskButtonsWidth = (anchoredButtons.getComponentCount() > 0)
                        ? (x - tabButtonGap - anchoredButtons.getX() - anchoredButtons.getWidth())
                        : (x - ins.left);
                taskToggleButtonsScrollablePanel.setBounds(x - taskButtonsWidth, y,
                        taskButtonsWidth, taskToggleButtonHeight);
            }
            if (ribbon.getApplicationMenuProjection() != null) {
                applicationMenuButton.setVisible(true);
                if (ltr) {
                    applicationMenuButton.setBounds(x - appMenuButtonWidth - 2, y + 1,
                            appMenuButtonWidth, taskToggleButtonHeight - 1);
                } else {
                    applicationMenuButton.setBounds(x + 2, y + 1, appMenuButtonWidth,
                            taskToggleButtonHeight - 1);
                }
            } else {
                applicationMenuButton.setVisible(false);
            }

            TaskToggleButtonsHostPanel taskToggleButtonsHostPanel =
                    taskToggleButtonsScrollablePanel.getView();
            int taskToggleButtonsHostPanelMinWidth =
                    taskToggleButtonsHostPanel.getMinimumSize().width;
            taskToggleButtonsHostPanel.setPreferredSize(new Dimension(
                    taskToggleButtonsHostPanelMinWidth,
                    taskToggleButtonsScrollablePanel.getBounds().height));
            taskToggleButtonsScrollablePanel.doLayout();

            y += taskToggleButtonHeight;

            if (bandScrollablePanel.getParent() == ribbon) {
                if (!ribbon.isMinimized() && (ribbon.getTaskCount() > 0)) {
                    // y += ins.top;
                    Insets bandInsets = (ribbon.getSelectedTask().getBandCount() == 0)
                            ? new Insets(0, 0, 0, 0)
                            : ribbon.getSelectedTask().getBand(0).getInsets();
                    bandScrollablePanel.setBounds(ins.left, y + bandInsets.top,
                            c.getWidth() - 2 * ins.left - 2 * ins.right,
                            c.getHeight() - taskToggleButtonHeight - ins.top - ins.bottom
                                    - bandInsets.top - bandInsets.bottom);
                    // System.out.println("Scrollable : "
                    // + bandScrollablePanel.getBounds());
                    JPanel bandHostPanel = bandScrollablePanel.getView();
                    int bandHostPanelMinWidth = bandHostPanel.getMinimumSize().width;
                    bandHostPanel.setPreferredSize(new Dimension(bandHostPanelMinWidth,
                            bandScrollablePanel.getBounds().height));
                    bandScrollablePanel.doLayout();
                    bandHostPanel.doLayout();
                } else {
                    bandScrollablePanel.setBounds(0, 0, 0, 0);
                }
            }
        }
    }

    /**
     * Layout for the band host panel.
     *
     * @author Kirill Grouchnikov
     */
    private class BandHostPanelLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component c) {
        }

        @Override
        public void removeLayoutComponent(Component c) {
        }

        @Override
        public Dimension preferredLayoutSize(Container c) {
            // Insets ins = c.getInsets();
            int maxPrefBandHeight = 0;
            if (ribbon.getTaskCount() > 0) {
                RibbonTask selectedTask = ribbon.getSelectedTask();
                for (AbstractRibbonBand ribbonBand : selectedTask.getBands()) {
                    int bandPrefHeight = ribbonBand.getPreferredSize().height;
                    Insets bandInsets = ribbonBand.getInsets();
                    maxPrefBandHeight = Math.max(maxPrefBandHeight,
                            bandPrefHeight + bandInsets.top + bandInsets.bottom);
                }
            }

            return new Dimension(c.getWidth(), maxPrefBandHeight);
        }

        @Override
        public Dimension minimumLayoutSize(Container c) {
            // go over all ribbon bands and sum the width
            // of ribbon buttons (of collapsed state)
            // Insets ins = c.getInsets();
            int width = 0;
            int maxMinBandHeight = 0;
            int gap = getBandGap();

            // minimum is when all the tasks are collapsed
            RibbonTask selectedTask = ribbon.getSelectedTask();
            // System.out.println(selectedTask.getTitle() + " min width");
            for (AbstractRibbonBand ribbonBand : selectedTask.getBands()) {
                int bandPrefHeight = ribbonBand.getMinimumSize().height;
                Insets bandInsets = ribbonBand.getInsets();
                RibbonBandUI bandUI = ribbonBand.getUI();
                int preferredCollapsedWidth = bandUI.getPreferredCollapsedWidth() + bandInsets.left
                        + bandInsets.right;
                width += preferredCollapsedWidth;
                // System.out.println("\t" + ribbonBand.getTitle() + ":" +
                // preferredCollapsedWidth);
                maxMinBandHeight = Math.max(maxMinBandHeight, bandPrefHeight);
            }
            // add inter-band gaps
            width += gap * (selectedTask.getBandCount() + 1);
            // System.out.println("\t" + gap + "*" +
            // (selectedTask.getBandCount() + 1));

            // System.out.println(selectedTask.getTitle() + " min width:" +
            // width);

            // System.out.println("Returning min height of " +
            // maxMinBandHeight);

            return new Dimension(width, maxMinBandHeight);
        }

        @Override
        public void layoutContainer(Container c) {
            // System.err.println("Layout of band host panel " + c.getWidth() +
            // ":" + c.getHeight());
            int bandGap = getBandGap();

            // the top row - task bar components
            int x;
            int y = 0;

            RibbonTask selectedTask = ribbon.getSelectedTask();
            if (selectedTask == null) {
                return;
            }

            // check that the resize policies are still consistent
            for (AbstractRibbonBand band : selectedTask.getBands()) {
                FlamingoUtilities.checkResizePoliciesConsistency(band);
            }

            // start with the most "permissive" resize policy for each band
            for (AbstractRibbonBand band : selectedTask.getBands()) {
                List<RibbonBandResizePolicy> policies = band.getResizePolicies();
                RibbonBandResizePolicy last = policies.get(0);
                band.setCurrentResizePolicy(last);
            }

            int availableBandHeight = c.getHeight();
            int availableWidth = c.getWidth();
            if (selectedTask.getBandCount() > 0) {
                RibbonBandResizeSequencingPolicy resizeSequencingPolicy = selectedTask
                        .getResizeSequencingPolicy();
                resizeSequencingPolicy.reset();
                AbstractRibbonBand currToTakeFrom = resizeSequencingPolicy.next();
                while (true) {
                    // check whether all bands have the current resize
                    // policy as their last (most restrictive) registered policy
                    boolean noMore = true;
                    for (AbstractRibbonBand band : selectedTask.getBands()) {
                        RibbonBandResizePolicy currentResizePolicy = band.getCurrentResizePolicy();
                        List<RibbonBandResizePolicy> resizePolicies = band.getResizePolicies();
                        if (currentResizePolicy != resizePolicies.get(resizePolicies.size() - 1)) {
                            noMore = false;
                            break;
                        }
                    }
                    if (noMore) {
                        break;
                    }

                    // get the current preferred width of the bands
                    int totalWidth = 0;
                    // System.out.println("Iteration");
                    for (AbstractRibbonBand ribbonBand : selectedTask.getBands()) {
                        RibbonBandResizePolicy currentResizePolicy = ribbonBand
                                .getCurrentResizePolicy();

                        Insets ribbonBandInsets = ribbonBand.getInsets();
                        AbstractBandControlPanel controlPanel = ribbonBand.getControlPanel();
                        if (controlPanel == null) {
                            controlPanel = ribbonBand.getPopupRibbonBand().getControlPanel();
                        }
                        Insets controlPanelInsets = controlPanel.getInsets();
                        int controlPanelGap = controlPanel.getUI().getLayoutGap();
                        int ribbonBandHeight = availableBandHeight - ribbonBandInsets.top
                                - ribbonBandInsets.bottom;
                        int availableHeight = ribbonBandHeight
                                - ribbonBand.getUI().getBandTitleHeight();
                        if (controlPanel != null) {
                            availableHeight = availableHeight - controlPanelInsets.top
                                    - controlPanelInsets.bottom;
                        }
                        int preferredWidth = currentResizePolicy.getPreferredWidth(availableHeight,
                                controlPanelGap) + ribbonBandInsets.left + ribbonBandInsets.right;
                        totalWidth += preferredWidth + bandGap;
                        // System.out.println("\t"
                        // + ribbonBand.getTitle()
                        // + ":"
                        // + currentResizePolicy.getClass()
                        // .getSimpleName() + ":" + preferredWidth
                        // + " under " + availableHeight + " with "
                        // + controlPanel.getComponentCount()
                        // + " children");
                    }
                    // System.out.println("\t:Total:" + totalWidth + "("
                    // + availableWidth + ")");
                    // System.out.println("\n");
                    if (totalWidth < availableWidth) {
                        break;
                    }

                    // try to take from the currently rotating band
                    List<RibbonBandResizePolicy> policies = currToTakeFrom.getResizePolicies();
                    int currPolicyIndex = policies.indexOf(currToTakeFrom.getCurrentResizePolicy());
                    if (currPolicyIndex == (policies.size() - 1)) {
                        // nothing to take
                    } else {
                        currToTakeFrom.setCurrentResizePolicy(policies.get(currPolicyIndex + 1));
                    }
                    currToTakeFrom = resizeSequencingPolicy.next();
                }
            }

            boolean ltr = ribbon.getComponentOrientation().isLeftToRight();
            x = ltr ? 1 : c.getWidth() - 1;
            // System.out.println("Will get [" + availableWidth + "]:");
            for (AbstractRibbonBand ribbonBand : selectedTask.getBands()) {
                Insets ribbonBandInsets = ribbonBand.getInsets();
                RibbonBandResizePolicy currentResizePolicy = ribbonBand.getCurrentResizePolicy();
                AbstractBandControlPanel controlPanel = ribbonBand.getControlPanel();
                if (controlPanel == null) {
                    controlPanel = ribbonBand.getPopupRibbonBand().getControlPanel();
                }
                Insets controlPanelInsets = controlPanel.getInsets();
                int controlPanelGap = controlPanel.getUI().getLayoutGap();
                int ribbonBandHeight = availableBandHeight;
                // - ribbonBandInsets.top - ribbonBandInsets.bottom;
                int availableHeight = ribbonBandHeight - ribbonBandInsets.top
                        - ribbonBandInsets.bottom - ribbonBand.getUI().getBandTitleHeight();
                if (controlPanelInsets != null) {
                    availableHeight = availableHeight - controlPanelInsets.top
                            - controlPanelInsets.bottom;
                }

                int requiredBandWidth = currentResizePolicy.getPreferredWidth(availableHeight,
                        controlPanelGap) + ribbonBandInsets.left + ribbonBandInsets.right;

                if (ltr) {
                    ribbonBand.setBounds(x, y, requiredBandWidth, ribbonBandHeight);
                } else {
                    ribbonBand.setBounds(x - requiredBandWidth, y, requiredBandWidth,
                            ribbonBandHeight);
                }

                // System.out.println("\t" + ribbonBand.getTitle() + ":"
                // + currentResizePolicy.getClass().getSimpleName() + ":"
                // + requiredBandWidth + "[insets " + ribbonBandInsets.left + "," +
                // ribbonBandInsets.right + "] under " + ribbonBandHeight);

                if (ribbonBand.getHeight() > 0) {
                    ribbonBand.doLayout();
                }

                if (ltr) {
                    x += (requiredBandWidth + bandGap);
                } else {
                    x -= (requiredBandWidth + bandGap);
                }

            }
            // System.out.println();
        }
    }

    protected abstract class TaskToggleButtonsHostPanel extends JPanel {
        private static final String IS_SQUISHED =
                "flamingo.internal.ribbon.taskToggleButtonsHostPanel.isSquished";

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            this.paintContextualTaskGroupsOutlines(g);
            if (Boolean.TRUE.equals(this.getClientProperty(IS_SQUISHED))) {
                this.paintTaskOutlines(g);
            }
        }

        protected abstract void paintTaskOutlines(Graphics g);

        /**
         * Paints the outline of the contextual task groups.
         *
         * @param g Graphics context.
         */
        private void paintContextualTaskGroupsOutlines(Graphics g) {
            for (int i = 0; i < ribbon.getContextualTaskGroupCount(); i++) {
                RibbonContextualTaskGroup group = ribbon.getContextualTaskGroup(i);
                if (!ribbon.isVisible(group)) {
                    continue;
                }
                // go over all the tasks in this group and compute the union
                // of bounds of the matching tab buttons
                Rectangle rect = getContextualTaskGroupBounds(group);
                rect.setLocation(SwingUtilities.convertPoint(ribbon, rect.getLocation(),
                        taskToggleButtonsScrollablePanel.getView()));
                this.paintContextualTaskGroupOutlines(g, group, rect);
            }
        }

        /**
         * Paints the outline of the specified contextual task group.
         *
         * @param g           Graphics context.
         * @param group       Contextual task group.
         * @param groupBounds Contextual task group bounds.
         */
        protected abstract void paintContextualTaskGroupOutlines(Graphics g,
                RibbonContextualTaskGroup group,
                Rectangle groupBounds);
    }

    /**
     * Layout for the band host panel.
     *
     * @author Kirill Grouchnikov
     */
    private class TaskToggleButtonsHostPanelLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component c) {
        }

        @Override
        public void removeLayoutComponent(Component c) {
        }

        @Override
        public Dimension preferredLayoutSize(Container c) {
            int tabButtonGap = getTabButtonGap();
            int taskToggleButtonHeight = getTaskToggleButtonHeight();

            int totalTaskButtonsWidth = 0;
            List<RibbonTask> visibleTasks = getCurrentlyShownRibbonTasks();
            for (RibbonTask task : visibleTasks) {
                AbstractCommandButton tabButton = taskToggleButtons.get(task);
                int pw = tabButton.getPreferredSize().width;
                totalTaskButtonsWidth += (pw + tabButtonGap);
            }

            return new Dimension(totalTaskButtonsWidth, taskToggleButtonHeight);
        }

        @Override
        public Dimension minimumLayoutSize(Container c) {
            int tabButtonGap = getTabButtonGap();
            int taskToggleButtonHeight = getTaskToggleButtonHeight();

            int totalTaskButtonsWidth = 0;
            List<RibbonTask> visibleTasks = getCurrentlyShownRibbonTasks();
            for (RibbonTask task : visibleTasks) {
                AbstractCommandButton tabButton = taskToggleButtons.get(task);
                int pw = tabButton.getMinimumSize().width;
                totalTaskButtonsWidth += (pw + tabButtonGap);
            }

            return new Dimension(totalTaskButtonsWidth, taskToggleButtonHeight);
        }

        @Override
        public void layoutContainer(Container c) {
            int y = 0;
            int tabButtonGap = getTabButtonGap();
            int taskToggleButtonHeight = getTaskToggleButtonHeight();

            int totalPrefWidth = 0;
            int totalMinWidth = 0;
            List<RibbonTask> visibleTasks = getCurrentlyShownRibbonTasks();
            Map<AbstractCommandButton, Integer> diffMap = new HashMap<>();
            int totalDiff = 0;
            for (RibbonTask task : visibleTasks) {
                AbstractCommandButton tabButton = taskToggleButtons.get(task);
                int pw = tabButton.getPreferredSize().width;
                int mw = tabButton.getMinimumSize().width;
                diffMap.put(tabButton, pw - mw);
                totalDiff += (pw - mw);
                totalPrefWidth += pw;
                totalMinWidth += mw;
            }
            totalPrefWidth += tabButtonGap * visibleTasks.size();
            totalMinWidth += tabButtonGap * visibleTasks.size();

            boolean ltr = ribbon.getComponentOrientation().isLeftToRight();

            // do we have enough width?
            if (totalPrefWidth <= c.getWidth()) {
                // compute bounds for the tab buttons
                int x = ltr ? 0 : c.getWidth();
                for (RibbonTask task : visibleTasks) {
                    AbstractCommandButton tabButton = taskToggleButtons.get(task);
                    int pw = tabButton.getPreferredSize().width;
                    if (ltr) {
                        tabButton.setBounds(x, y + 1, pw, taskToggleButtonHeight - 1);
                        x += (pw + tabButtonGap);
                    } else {
                        tabButton.setBounds(x - pw, y + 1, pw, taskToggleButtonHeight - 1);
                        x -= (pw + tabButtonGap);
                    }
                    tabButton.setActionRichTooltip(null);
                }
                ((JComponent) c).putClientProperty(TaskToggleButtonsHostPanel.IS_SQUISHED, null);
            } else {
                if (totalMinWidth > c.getWidth()) {
                    throw new IllegalStateException(
                            "Available width not enough to host minimized task tab buttons");
                }
                int x = ltr ? 0 : c.getWidth();
                // how much do we need to take from each toggle button?
                int toDistribute = totalPrefWidth - c.getWidth() + 2;
                for (RibbonTask task : visibleTasks) {
                    AbstractCommandButton tabButton = taskToggleButtons.get(task);
                    int pw = tabButton.getPreferredSize().width;
                    int delta = (toDistribute * diffMap.get(tabButton) / totalDiff);
                    int finalWidth = pw - delta;
                    if (ltr) {
                        tabButton.setBounds(x, y + 1, finalWidth, taskToggleButtonHeight - 1);
                        x += (finalWidth + tabButtonGap);
                    } else {
                        tabButton.setBounds(x - finalWidth, y + 1, finalWidth,
                                taskToggleButtonHeight - 1);
                        x -= (finalWidth + tabButtonGap);
                    }
                    // show the tooltip with the full title
                    tabButton.setActionRichTooltip(
                            RichTooltip.builder().setTitle(task.getTitle()).build());
                }
                ((JComponent) c).putClientProperty(TaskToggleButtonsHostPanel.IS_SQUISHED,
                        Boolean.TRUE);
            }
        }
    }

    private class AnchoredButtonsPanelLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            int minWidth = 0;
            for (Component comp : parent.getComponents()) {
                minWidth += comp.getMinimumSize().width;
            }
            return new Dimension(minWidth, getTaskToggleButtonHeight());
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            int prefWidth = 0;
            for (Component comp : parent.getComponents()) {
                prefWidth += comp.getPreferredSize().width;
            }
            return new Dimension(prefWidth, getTaskToggleButtonHeight());
        }

        @Override
        public void layoutContainer(Container parent) {
            boolean ltr = ribbon.getComponentOrientation().isLeftToRight();
            if (ltr) {
                int x = 0;
                for (Component comp : parent.getComponents()) {
                    int prefWidth = comp.getPreferredSize().width;
                    comp.setBounds(x, 0, prefWidth, parent.getHeight());
                    x += prefWidth;
                }
            } else {
                int x = parent.getWidth();
                for (Component comp : parent.getComponents()) {
                    int prefWidth = comp.getPreferredSize().width;
                    comp.setBounds(x - prefWidth, 0, prefWidth, parent.getHeight());
                    x -= prefWidth;
                }
            }
        }

    }

    private void syncSelectedTask() {
        final RibbonTask currentSelection = this.ribbon.getSelectedTask();
        for (Map.Entry<RibbonTask, AbstractCommandButton> taskToggleButtonEntry :
                this.taskToggleButtons.entrySet()) {
            if (currentSelection == taskToggleButtonEntry.getKey()) {
                taskToggleButtonEntry.getValue().getActionModel().setSelected(true);
            } else {
                taskToggleButtonEntry.getValue().getActionModel().setSelected(false);
            }
        }

        if (isShowingScrollsForTaskToggleButtons() && (currentSelection != null)) {
            // scroll selected task as necessary so that it's
            // visible
            AbstractCommandButton toggleButton = taskToggleButtons.get(currentSelection);
            if (toggleButton != null) {
                scrollAndRevealTaskToggleButton(toggleButton);
            }
        }

        // Special case for showing key tips of ribbon tasks.
        // When a ribbon task is selected with a key tip, its
        // showing and layout is deferred as a separate Runnable
        // on EDT. When the key chain for that task is created,
        // the command buttons are not at their final size yet
        // and no key tips are shown.
        // Here we schedule yet another Runnable
        // to recompute all keytips if the
        // originator is a task toggle button.
        SwingUtilities.invokeLater(() -> {
            KeyTipManager ktm = KeyTipManager.defaultManager();
            if (ktm.isShowingKeyTips()) {
                KeyTipManager.KeyTipChain chain = ktm.getCurrentlyShownKeyTipChain();
                if (chain.chainParentComponent == taskToggleButtons.get(currentSelection)) {
                    ktm.refreshCurrentChain();
                }
            }
        });
    }

    private void syncRibbonState() {
        // remove all existing ribbon bands
        JPanel bandHostPanel = this.bandScrollablePanel.getView();
        bandHostPanel.removeAll();

        // remove all the existing task toggle buttons
        TaskToggleButtonsHostPanel taskToggleButtonsHostPanel = this
                .taskToggleButtonsScrollablePanel
                .getView();
        taskToggleButtonsHostPanel.removeAll();

        // remove the anchored buttons
        if (this.anchoredButtons != null) {
            this.ribbon.remove(this.anchoredButtons);
            this.anchoredButtons = null;
        }

        // go over all visible ribbon tasks and create a toggle button for each one of them
        List<RibbonTask> visibleTasks = this.getCurrentlyShownRibbonTasks();
        final RibbonTask selectedTask = this.ribbon.getSelectedTask();
        for (final RibbonTask task : visibleTasks) {
            // Configure the task toggle command
            Command taskToggleCommand = Command.builder()
                    .setText(task.getTitle())
                    .inToggleGroup(this.taskToggleGroupModel)
                    .setAction((CommandActionEvent cae) -> SwingUtilities.invokeLater(() ->
                            processTaskSelection(task, (JRibbonTaskToggleButton) cae.getSource())))
                    .build();

            // And create a specific projection
            CommandButtonProjection<Command> taskToggleCommandProjection = taskToggleCommand.project(
                    CommandButtonPresentationModel.builder()
                            .setActionKeyTip(task.getKeyTip())
                            .setToDismissPopupsOnActivation(false)
                            .build());

            // Configure the projection to use our own subclass of command button (so that it can
            // use its own UI delegate class
            taskToggleCommandProjection.setComponentSupplier(
                    projection -> JRibbonTaskToggleButton::new);

            // Configure the projection with additional customizations on the command button that
            // is created to represent the task toggle command
            taskToggleCommandProjection.setComponentCustomizer(
                    (AbstractCommandButton button) -> {
                        JRibbonTaskToggleButton taskToggleButton = (JRibbonTaskToggleButton) button;

                        // wire listener to toggle ribbon minimization on double mouse click
                        taskToggleButton.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                if ((ribbon.getSelectedTask() == task) &&
                                        (e.getClickCount() == 2)) {
                                    boolean wasMinimized = ribbon.isMinimized();
                                    ribbon.setMinimized(!wasMinimized);
                                    if (!wasMinimized) {
                                        // fix for issue 69 - mark the ribbon as
                                        // "just minimized" to prevent the action handler
                                        // of the toggle button to show the ribbon in
                                        // popup mode
                                        ribbon.putClientProperty(JUST_MINIMIZED, Boolean.TRUE);
                                    }
                                }
                            }
                        });

                        // set the background hue color on the tab buttons
                        // of tasks in contextual groups
                        if (task.getContextualGroup() != null) {
                            taskToggleButton.setContextualGroupHueColor(
                                    task.getContextualGroup().getHueColor());
                        }

                        taskToggleButton.setRibbonTask(task);
                    }
            );

            final AbstractCommandButton taskToggleButton =
                    taskToggleCommandProjection.buildComponent();

            taskToggleButtonsHostPanel.add(taskToggleButton);
            this.taskToggleButtons.put(task, taskToggleButton);
        }

        AbstractCommandButton toSelect = this.taskToggleButtons.get(selectedTask);
        if (toSelect != null) {
            toSelect.getActionModel().setSelected(true);
        }

        for (int i = 0; i < this.ribbon.getTaskCount(); i++) {
            RibbonTask task = this.ribbon.getTask(i);
            for (AbstractRibbonBand band : task.getBands()) {
                bandHostPanel.add(band);
                band.setVisible(selectedTask == task);
            }
        }
        for (int i = 0; i < this.ribbon.getContextualTaskGroupCount(); i++) {
            RibbonContextualTaskGroup taskGroup = this.ribbon.getContextualTaskGroup(i);
            for (int j = 0; j < taskGroup.getTaskCount(); j++) {
                RibbonTask task = taskGroup.getTask(j);
                for (AbstractRibbonBand band : task.getBands()) {
                    bandHostPanel.add(band);
                    band.setVisible(selectedTask == task);
                }
            }
        }

        List<CommandButtonProjection> anchoredCommands = this.ribbon.getAnchoredCommands();
        if (anchoredCommands != null) {
            this.anchoredButtons = new Container();
            this.anchoredButtons.setLayout(new AnchoredButtonsPanelLayout());
            for (CommandButtonProjection anchoredCommandProjection : anchoredCommands) {
                this.anchoredButtons.add(anchoredCommandProjection.buildComponent());
            }
            this.ribbon.add(this.anchoredButtons);
        }

        this.ribbon.revalidate();
        this.ribbon.repaint();
    }

    private void processTaskSelection(RibbonTask task, JRibbonTaskToggleButton taskToggleButton) {
        scrollAndRevealTaskToggleButton(taskToggleButton);

        ribbon.setSelectedTask(task);

        // System.out.println("Button click on "
        // + task.getTitle() + ", ribbon minimized? "
        // + ribbon.isMinimized());

        if (ribbon.isMinimized()) {
            if (Boolean.TRUE.equals(ribbon.getClientProperty(JUST_MINIMIZED))) {
                ribbon.putClientProperty(JUST_MINIMIZED, null);
                return;
            }

            // special case - do we have this task currently
            // shown in a popup?
            List<PopupPanelManager.PopupInfo> popups = PopupPanelManager
                    .defaultManager().getShownPath();
            if (popups.size() > 0) {
                for (PopupPanelManager.PopupInfo popup : popups) {
                    if (popup.getPopupOriginator() == taskToggleButton) {
                        // hide all popups and return (hides
                        // the task popup and does not
                        // show any additional popup).
                        PopupPanelManager.defaultManager().hidePopups(null);
                        return;
                    }
                }
            }

            PopupPanelManager.defaultManager().hidePopups(null);
            ribbon.remove(bandScrollablePanel);

            int prefHeight = bandScrollablePanel.getView().getPreferredSize().height;
            Insets ins = ribbon.getInsets();
            prefHeight += ins.top + ins.bottom;
            AbstractRibbonBand band = (ribbon.getSelectedTask().getBandCount() > 0)
                    ? ribbon.getSelectedTask().getBand(0)
                    : null;
            if (band != null) {
                Insets bandIns = band.getInsets();
                prefHeight += bandIns.top + bandIns.bottom;
            }

            // System.out.println(prefHeight
            // + ":"
            // + bandScrollablePanel.getView()
            // .getComponentCount());

            JPopupPanel popupPanel = new BandHostPopupPanel(bandScrollablePanel,
                    new Dimension(ribbon.getWidth(), prefHeight));

            int x = ribbon.getLocationOnScreen().x;
            int y = ribbon.getLocationOnScreen().y + ribbon.getHeight();

            // make sure that the popup stays in
            // bounds
            Rectangle scrBounds = ribbon.getGraphicsConfiguration().getBounds();
            int pw = popupPanel.getPreferredSize().width;
            if ((x + pw) > (scrBounds.x + scrBounds.width)) {
                x = scrBounds.x + scrBounds.width - pw;
            }
            int ph = popupPanel.getPreferredSize().height;
            if ((y + ph) > (scrBounds.y + scrBounds.height)) {
                y = scrBounds.y + scrBounds.height - ph;
            }

            // get the popup and show it
            popupPanel.setPreferredSize(new Dimension(ribbon.getWidth(), prefHeight));
            Popup popup = PopupFactory.getSharedInstance().getPopup(
                    taskToggleButton, popupPanel, x, y);
            PopupPanelManager.PopupListener tracker = new PopupPanelManager.PopupListener() {
                @Override
                public void popupShown(PopupEvent event) {
                    JComponent originator = event.getPopupOriginator();
                    if (originator instanceof JRibbonTaskToggleButton) {
                        bandScrollablePanel.doLayout();
                        bandScrollablePanel.repaint();
                    }
                }

                @Override
                public void popupHidden(PopupEvent event) {
                    JComponent originator = event.getPopupOriginator();
                    if (originator instanceof JRibbonTaskToggleButton) {
                        ribbon.add(bandScrollablePanel);
                        PopupPanelManager.defaultManager().removePopupListener(this);
                        ribbon.revalidate();
                        ribbon.doLayout();
                        ribbon.repaint();
                    }
                }
            };
            PopupPanelManager.defaultManager().addPopupListener(tracker);
            PopupPanelManager.defaultManager().addPopup(taskToggleButton, popup, popupPanel);
        }
    }

    /**
     * Returns the list of currently shown ribbon tasks. This method is for internal use only.
     *
     * @return The list of currently shown ribbon tasks.
     */
    private List<RibbonTask> getCurrentlyShownRibbonTasks() {
        List<RibbonTask> result = new ArrayList<>();

        // add all regular tasks
        for (int i = 0; i < this.ribbon.getTaskCount(); i++) {
            RibbonTask task = this.ribbon.getTask(i);
            result.add(task);
        }
        // add all tasks of visible contextual groups
        for (int i = 0; i < this.ribbon.getContextualTaskGroupCount(); i++) {
            RibbonContextualTaskGroup group = this.ribbon.getContextualTaskGroup(i);
            if (this.ribbon.isVisible(group)) {
                for (int j = 0; j < group.getTaskCount(); j++) {
                    RibbonTask task = group.getTask(j);
                    result.add(task);
                }
            }
        }

        return result;
    }

    protected abstract void syncApplicationMenuTips();

    @Override
    public boolean isShowingScrollsForTaskToggleButtons() {
        return this.taskToggleButtonsScrollablePanel.isShowingScrollButtons();
    }

    public Map<RibbonTask, AbstractCommandButton> getTaskToggleButtons() {
        return Collections.unmodifiableMap(taskToggleButtons);
    }

    public List<JCommandButton> getAnchoredCommandButtons() {
        List<JCommandButton> result = new ArrayList<>();
        for (Component anchored : this.anchoredButtons.getComponents()) {
            result.add((JCommandButton) anchored);
        }
        return Collections.unmodifiableList(result);
    }

    private static class BandHostPopupPanel extends JPopupPanel {
        /**
         * The main component of <code>this</code> popup panel. Can be <code>null</code>.
         */
        private BandHostPopupPanel(Component component, Dimension originalSize) {
            this.setLayout(new BorderLayout());
            this.add(component, BorderLayout.CENTER);
            this.setPreferredSize(originalSize);
            this.setSize(originalSize);
            SubstanceCortex.ComponentOrParentChainScope.setDecorationType(this,
                    SubstanceSlices.DecorationAreaType.GENERAL);
        }
    }

    @Override
    public void handleMouseWheelEvent(MouseWheelEvent e) {
        // no mouse wheel scrolling when the ribbon is minimized
        if (ribbon.isMinimized())
            return;

        // get the visible tasks
        final List<RibbonTask> visibleTasks = getCurrentlyShownRibbonTasks();
        if (visibleTasks.size() == 0)
            return;

        int delta = e.getWheelRotation();
        if (delta == 0)
            return;

        // find the index of the currently selected task
        int currSelectedTaskIndex = visibleTasks.indexOf(ribbon.getSelectedTask());

        // compute the next task
        if (!ribbon.getComponentOrientation().isLeftToRight())
            delta = -delta;
        int newSelectedTaskIndex = currSelectedTaskIndex + ((delta > 0) ? 1 : -1);
        if (newSelectedTaskIndex < 0)
            return;
        if (newSelectedTaskIndex >= visibleTasks.size())
            return;

        final int indexToSet = newSelectedTaskIndex;
        SwingUtilities.invokeLater(() -> {
            ribbon.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            ribbon.setSelectedTask(visibleTasks.get(indexToSet));
            ribbon.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        });
    }

    private void scrollAndRevealTaskToggleButton(final AbstractCommandButton taskToggleButton) {
        // scroll the viewport of the scrollable panel
        // so that the button is fully viewed.
        Point loc = SwingUtilities.convertPoint(taskToggleButton.getParent(),
                taskToggleButton.getLocation(), taskToggleButtonsScrollablePanel.getView());
        taskToggleButtonsScrollablePanel.scrollToIfNecessary(loc.x, taskToggleButton.getWidth());
    }
}
