/*
 * Copyright (c) 2003-2018 Flamingo Kirill Grouchnikov
 * and <a href="http://www.topologi.com">Topologi</a>.
 * Contributed by <b>Rick Jelliffe</b> of <b>Topologi</b>
 * in January 2006. in All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov Topologi nor the names of
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
package org.pushingpixels.flamingo.internal.ui.bcb;

import org.pushingpixels.flamingo.api.bcb.*;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.model.*;
import org.pushingpixels.flamingo.api.common.projection.*;
import org.pushingpixels.flamingo.internal.ui.common.JCircularProgress;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.substance.api.SubstanceCortex;

import javax.swing.Timer;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Basic UI for breadcrumb bar ({@link JBreadcrumbBar}).
 *
 * @author Topologi
 * @author Kirill Grouchnikov
 * @author Pawel Hajda
 */
public abstract class BasicBreadcrumbBarUI extends BreadcrumbBarUI {
    /**
     * The associated breadcrumb bar.
     */
    private JBreadcrumbBar breadcrumbBar;

    private JCircularProgress circularProgress;

    private JPanel mainPanel;

    private JScrollablePanel<JPanel> scrollerPanel;

    private ComponentListener componentListener;

    private AbstractCommandButton dummy;

    /**
     * Contains the item path.
     */
    private LinkedList modelStack;

    private LinkedList<JCommandButton> buttonStack;
    private LinkedList<Command> commandStack;

    private BreadcrumbPathListener pathListener;

    private AtomicInteger atomicCounter;

    private Timer loadingTimer;

    private boolean isShowingProgress;

    @Override
    public void installUI(JComponent c) {
        this.breadcrumbBar = (JBreadcrumbBar) c;

        this.modelStack = new LinkedList();
        this.buttonStack = new LinkedList<>();
        this.commandStack = new LinkedList<>();

        installDefaults(this.breadcrumbBar);
        installComponents(this.breadcrumbBar);
        installListeners(this.breadcrumbBar);

        c.setLayout(createLayoutManager());

        if (this.breadcrumbBar.getCallback() != null) {
            SwingWorker<List<StringValuePair>, Void> worker =
                    new SwingWorker<List<StringValuePair>, Void>() {
                        @Override
                        protected List<StringValuePair> doInBackground() throws Exception {
                            startLoadingTimer();
                            return breadcrumbBar.getCallback().getPathChoices(null);
                        }

                        @Override
                        protected void done() {
                            try {
                                stopLoadingTimer();
                                pushChoices(new BreadcrumbItemChoices(null, get()));
                            } catch (Exception exc) {
                                exc.printStackTrace(System.err);
                            }
                        }
                    };
            worker.execute();
        }

        this.dummy = Command.builder().setText("Dummy").setIcon(new EmptyResizableIcon(16))
                .setAction((CommandActionEvent e) -> {})
                .build().project(CommandPresentation.builder()
                        .setPresentationState(CommandButtonPresentationState.SMALL).build())
                .buildComponent();
        int preferredHeight = dummy.getPreferredSize().height;
        this.circularProgress.setBorder(
                new EmptyBorder((preferredHeight - 12) / 2, 10, (preferredHeight - 12) / 2, 10));
        this.circularProgress.setPreferredSize(new Dimension(32, preferredHeight));
    }

    @Override
    public void uninstallUI(JComponent c) {
        c.setLayout(null);

        uninstallListeners((JBreadcrumbBar) c);
        uninstallComponents((JBreadcrumbBar) c);
        uninstallDefaults((JBreadcrumbBar) c);
        this.breadcrumbBar = null;
    }

    protected void installDefaults(JBreadcrumbBar bar) {
        Font currFont = bar.getFont();
        if ((currFont == null) || (currFont instanceof UIResource)) {
            bar.setFont(SubstanceCortex.GlobalScope.getFontPolicy().getFontSet(null)
                    .getControlFont());
        }
    }

    protected void installComponents(JBreadcrumbBar bar) {
        FlowLayout mainPanelLayout = new FlowLayout(FlowLayout.LEFT, 0, 0);
        mainPanelLayout.setAlignOnBaseline(true);
        this.mainPanel = new JPanel(mainPanelLayout);
        this.mainPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.mainPanel.setOpaque(false);
        this.scrollerPanel = new JScrollablePanel<JPanel>(this.mainPanel,
                JScrollablePanel.ScrollType.HORIZONTALLY);
        this.circularProgress = new JCircularProgress();
        this.circularProgress.setPreferredSize(new Dimension(12, 12));
        bar.add(this.scrollerPanel, BorderLayout.CENTER);
    }

    protected void installListeners(final JBreadcrumbBar bar) {
        this.atomicCounter = new AtomicInteger(0);

        this.componentListener = new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                updateComponents();
            }
        };
        bar.addComponentListener(this.componentListener);

        this.pathListener = new BreadcrumbPathListener() {
            private SwingWorker<Void, Object> pathChangeWorker;

            @Override
            public void breadcrumbPathEvent(BreadcrumbPathEvent event) {
                startLoadingTimer();
                final int indexOfFirstChange = event.getIndexOfFirstChange();

                if ((this.pathChangeWorker != null) && !this.pathChangeWorker.isDone()) {
                    this.pathChangeWorker.cancel(true);
                }
                this.pathChangeWorker = new SwingWorker<Void, Object>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        atomicCounter.incrementAndGet();

                        synchronized (BasicBreadcrumbBarUI.this) {
                            // remove stack elements after the first change
                            if (indexOfFirstChange == 0) {
                                modelStack.clear();
                            } else {
                                int toLeave = indexOfFirstChange * 2 + 1;
                                while (modelStack.size() > toLeave)
                                    modelStack.removeLast();
                            }
                        }

                        SwingUtilities.invokeLater(() -> updateComponents());

                        if (indexOfFirstChange == 0) {
                            List<StringValuePair> rootChoices = breadcrumbBar.getCallback()
                                    .getPathChoices(null);
                            BreadcrumbItemChoices bic = new BreadcrumbItemChoices(null,
                                    rootChoices);
                            if (!this.isCancelled()) {
                                publish(bic);
                            }
                        }

                        List<BreadcrumbItem> items = breadcrumbBar.getModel().getItems();
                        if (items != null) {
                            for (int itemIndex = indexOfFirstChange; itemIndex < items
                                    .size(); itemIndex++) {
                                if (this.isCancelled())
                                    break;

                                BreadcrumbItem item = items.get(itemIndex);
                                publish(item);

                                // now check if it has any children
                                List<BreadcrumbItem> subPath = new ArrayList<BreadcrumbItem>();
                                for (int j = 0; j <= itemIndex; j++) {
                                    subPath.add(items.get(j));
                                }
                                BreadcrumbItemChoices bic = new BreadcrumbItemChoices(item,
                                        breadcrumbBar.getCallback().getPathChoices(subPath));
                                if ((bic.getChoices() != null) && (bic.getChoices().length > 0)) {
                                    // add the selector - the current item has
                                    // children
                                    publish(bic);
                                }
                            }
                        }
                        return null;
                    }

                    @Override
                    protected void process(List<Object> chunks) {
                        if (chunks != null) {
                            for (Object chunk : chunks) {
                                if (this.isCancelled() || atomicCounter.get() > 1)
                                    break;

                                if (chunk instanceof BreadcrumbItemChoices) {
                                    pushChoices((BreadcrumbItemChoices) chunk, false);
                                }
                                if (chunk instanceof BreadcrumbItem) {
                                    pushChoice((BreadcrumbItem) chunk, false);
                                }
                            }
                        }
                        updateComponents();
                    }

                    @Override
                    protected void done() {
                        atomicCounter.decrementAndGet();
                        stopLoadingTimer();
                    }
                };
                pathChangeWorker.execute();
            }
        };
        this.breadcrumbBar.getModel().addPathListener(this.pathListener);
    }

    protected void uninstallDefaults(JBreadcrumbBar bar) {
    }

    protected void uninstallComponents(JBreadcrumbBar bar) {
        this.stopLoadingTimer();
        this.mainPanel.removeAll();
        this.buttonStack.clear();
        this.commandStack.clear();

        bar.remove(this.scrollerPanel);
    }

    protected void uninstallListeners(JBreadcrumbBar bar) {
        bar.removeComponentListener(this.componentListener);
        this.componentListener = null;

        this.breadcrumbBar.getModel().removePathListener(this.pathListener);
        this.pathListener = null;
    }

    private synchronized void startLoadingTimer() {
        if (this.loadingTimer == null) {
            this.loadingTimer = new Timer(100, (ActionEvent e) -> {
                this.loadingTimer.stop();

                this.circularProgress.setVisible(false);
                this.mainPanel.remove(this.circularProgress);
                this.circularProgress.setVisible(true);
                this.isShowingProgress = true;
                this.mainPanel.add(this.circularProgress);
                this.mainPanel.revalidate();
                this.mainPanel.repaint();
            });
        }
        if (this.loadingTimer.isRunning()) {
            this.loadingTimer.stop();
        }
        this.loadingTimer.start();
    }

    private synchronized void stopLoadingTimer() {
        if ((this.loadingTimer != null) && this.loadingTimer.isRunning()) {
            this.loadingTimer.stop();
        }
        this.isShowingProgress = false;
        this.mainPanel.remove(this.circularProgress);
        this.mainPanel.revalidate();
        this.mainPanel.repaint();
    }

    /**
     * Invoked by <code>installUI</code> to create a layout manager object to manage the
     * {@link JBreadcrumbBar}.
     *
     * @return a layout manager object
     * @see BreadcrumbBarLayout
     */
    protected LayoutManager createLayoutManager() {
        return new BreadcrumbBarLayout();
    }

    /**
     * Layout for the breadcrumb bar.
     *
     * @author Kirill Grouchnikov
     * @author Topologi
     */
    protected class BreadcrumbBarLayout implements LayoutManager {
        /**
         * Creates new layout manager.
         */
        public BreadcrumbBarLayout() {
        }

        @Override
        public void addLayoutComponent(String name, Component c) {
        }

        @Override
        public void removeLayoutComponent(Component c) {
        }

        @Override
        public Dimension preferredLayoutSize(Container c) {
            // The height of breadcrumb bar is
            // computed based on the preferred height of a command
            // button in MEDIUM state.
            int buttonHeight = dummy.getPreferredSize().height;

            Insets ins = c.getInsets();
            return new Dimension(c.getWidth(), buttonHeight + ins.top + ins.bottom);
        }

        @Override
        public Dimension minimumLayoutSize(Container c) {
            int buttonHeight = dummy.getPreferredSize().height;

            return new Dimension(10, buttonHeight);
        }

        @Override
        public void layoutContainer(Container c) {
            int width = c.getWidth();
            int height = c.getHeight();
            scrollerPanel.setBounds(0, 0, width, height);
        }
    }

    protected synchronized void updateComponents() {
        if (!this.breadcrumbBar.isVisible()) {
            return;
        }

        this.mainPanel.removeAll();
        this.buttonStack.clear();
        this.commandStack.clear();

        CommandPresentation commandPresentation = CommandPresentation.builder()
                .setPresentationState(CommandButtonPresentationState.MEDIUM)
                .setPopupOrientationKind(
                        CommandPresentation.CommandButtonPopupOrientationKind.SIDEWARD)
                .setHorizontalGapScaleFactor(0.75)
                .build();

        // update the ui
        for (int i = 0; i < modelStack.size(); i++) {
            Object element = modelStack.get(i);
            if (element instanceof BreadcrumbItemChoices) {
                BreadcrumbItemChoices bic = (BreadcrumbItemChoices) element;
                if (buttonStack.isEmpty()) {
                    Command command = Command.builder().build();
                    JCommandButton button = (JCommandButton) command.project(commandPresentation)
                            .buildComponent();
                    button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
                    configureBreadcrumbButton(button);
                    configurePopupAction(command, bic);
                    configurePopupRollover(button);
                    buttonStack.add(button);
                    commandStack.add(command);
                } else {
                    JCommandButton button = buttonStack.getLast();
                    Command command = commandStack.getLast();
                    button.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
                    configurePopupAction(command, bic);
                    configurePopupRollover(button);
                }
            } else if (element instanceof BreadcrumbItem) {
                BreadcrumbItem bi = (BreadcrumbItem) element;

                Command command = Command.builder().setText(bi.getKey()).build();
                JCommandButton button = (JCommandButton) command.project(commandPresentation)
                        .buildComponent();
                configureBreadcrumbButton(button);

                configureMainAction(command, bi);
                final Icon icon = bi.getIcon();
                if (icon != null) {
                    button.setIcon(new ResizableIcon() {
                        int iw = icon.getIconWidth();
                        int ih = icon.getIconHeight();

                        @Override
                        public void paintIcon(Component c, Graphics g, int x, int y) {
                            int dx = (iw - icon.getIconWidth()) / 2;
                            int dy = (ih - icon.getIconHeight()) / 2;
                            icon.paintIcon(c, g, x + dx, y + dy);
                        }

                        @Override
                        public int getIconWidth() {
                            return iw;
                        }

                        @Override
                        public int getIconHeight() {
                            return ih;
                        }

                        @Override
                        public void setDimension(Dimension newDimension) {
                            iw = newDimension.width;
                            ih = newDimension.height;
                        }
                    });
                }

                if (i > 0) {
                    BreadcrumbItemChoices lastBic = (BreadcrumbItemChoices) modelStack.get(i - 1);
                    BreadcrumbItem[] choices = lastBic.getChoices();
                    if (choices != null) {
                        for (int j = 0; j < choices.length; j++) {
                            if (bi.getKey().equals(choices[j].getKey())) {
                                lastBic.setSelectedIndex(j);
                                break;
                            }
                        }
                    }
                }

                buttonStack.addLast(button);
                commandStack.addLast(command);
            }
        }

        for (JCommandButton jcb : buttonStack) {
            this.mainPanel.add(jcb);
        }
        if (this.isShowingProgress) {
            this.mainPanel.add(this.circularProgress);
        }

        this.scrollerPanel.revalidate();
        this.scrollerPanel.repaint();
        SwingUtilities.invokeLater(() -> {
            // scroll to the last element in the breadcrumb bar
            scrollerPanel.scrollToIfNecessary(mainPanel.getPreferredSize().width, 0);
            scrollerPanel.repaint();
        });
    }

    private void configureMainAction(Command command, final BreadcrumbItem bi) {
        command.setAction((CommandActionEvent e) ->
                SwingUtilities.invokeLater(() -> {
                    BreadcrumbBarModel barModel = breadcrumbBar.getModel();
                    int itemIndex = barModel.indexOf(bi);
                    int toLeave = (itemIndex < 0) ? 0 : itemIndex + 1;
                    barModel.setCumulative(true);
                    while (barModel.getItemCount() > toLeave) {
                        barModel.removeLast();
                    }
                    barModel.setCumulative(false);
                })
        );
    }

    private void configurePopupAction(Command command, final BreadcrumbItemChoices bic) {
        List<Command> menuCommands = new ArrayList<>();

        CommandPopupMenuPresentationModel.Builder menuPresentationModel =
                CommandPopupMenuPresentationModel.builder();

        for (int i = 0; i < bic.getChoices().length; i++) {
            final BreadcrumbItem bi = bic.getChoices()[i];

            Command.Builder commandBuilder = Command.builder();

            commandBuilder.setText(bi.getKey());

            final Icon icon = bi.getIcon();
            if (icon != null) {
                commandBuilder.setIcon(new ResizableIcon() {
                    int iw = icon.getIconWidth();
                    int ih = icon.getIconHeight();

                    @Override
                    public void paintIcon(Component c, Graphics g, int x, int y) {
                        int dx = (iw - icon.getIconWidth()) / 2;
                        int dy = (ih - icon.getIconHeight()) / 2;
                        icon.paintIcon(c, g, x + dx, y + dy);
                    }

                    @Override
                    public int getIconWidth() {
                        return iw;
                    }

                    @Override
                    public int getIconHeight() {
                        return ih;
                    }

                    @Override
                    public void setDimension(Dimension newDimension) {
                        iw = newDimension.width;
                        ih = newDimension.height;
                    }
                });
            }

            final int biIndex = i;

            commandBuilder.setAction((CommandActionEvent e) -> {
                SwingUtilities.invokeLater(() -> {
                    BreadcrumbBarModel barModel = breadcrumbBar.getModel();
                    barModel.setCumulative(true);
                    int itemIndex = barModel.indexOf(bic.getAncestor());
                    int toLeave = ((bic.getAncestor() == null) || (itemIndex < 0)) ? 0
                            : itemIndex + 1;
                    while (barModel.getItemCount() > toLeave) {
                        barModel.removeLast();
                    }
                    barModel.addLast(bi);

                    bic.setSelectedIndex(biIndex);

                    barModel.setCumulative(false);
                });
            });

            Command menuCommand = commandBuilder.build();
            if (i == bic.getSelectedIndex()) {
                menuPresentationModel.setHighlightedCommand(menuCommand);
            }

            menuCommands.add(menuCommand);
        }

        menuPresentationModel.setMaxVisibleMenuCommands(10);

        command.setPopupMenuProjection(new CommandPopupMenuProjection(
                new CommandPopupMenuContentModel(new CommandGroupModel(menuCommands)),
                menuPresentationModel.build()));
    }

    private void configurePopupRollover(final JCommandButton button) {
        button.getPopupModel().addChangeListener(new ChangeListener() {
            boolean rollover = button.getPopupModel().isRollover();

            @Override
            public void stateChanged(ChangeEvent e) {
                SwingUtilities.invokeLater(() -> {
                    boolean isRollover = button.getPopupModel().isRollover();
                    if (isRollover == rollover)
                        return;

                    if (isRollover) {
                        // does any *other* button show popup?
                        for (JCommandButton bcbButton : buttonStack) {
                            if (bcbButton == button) {
                                continue;
                            }

                            if (bcbButton.getPopupModel().isPopupShowing()) {
                                // scroll to view
                                scrollerPanel.scrollToIfNecessary(button.getBounds().x,
                                        button.getWidth());
                                // simulate click on the popup area of *this* button
                                button.doPopupClick();
                            }
                        }
                    }

                    rollover = isRollover;
                });
            }
        });
    }

    private void configureBreadcrumbButton(final JCommandButton button) {
        button.getPopupModel().addChangeListener((ChangeEvent e) -> {
            PopupButtonModel model = button.getPopupModel();
            boolean displayDownwards = model.isRollover() || model.isPopupShowing();
            CommandPresentation.CommandButtonPopupOrientationKind popupOrientationKind =
                    displayDownwards
                            ? CommandPresentation.CommandButtonPopupOrientationKind.DOWNWARD
                            : CommandPresentation.CommandButtonPopupOrientationKind.SIDEWARD;
            button.setPopupOrientationKind(popupOrientationKind);
        });
    }

    /**
     * Pushes a choice to the top position of the stack. If the current top is already a
     * {@link BreadcrumbItemChoices}, replace it.
     *
     * @param bic The choice item to push.
     * @return The item that has been pushed.
     */
    protected Object pushChoices(BreadcrumbItemChoices bic) {
        return pushChoices(bic, true);
    }

    /**
     * Pushes a choice to the top position of the stack. If the current top is already a
     * {@link BreadcrumbItemChoices}, replace it.
     *
     * @param bic        The choice item to push.
     * @param toUpdateUI Indication whether the bar should be repainted.
     * @return The item that has been pushed.
     */
    protected synchronized Object pushChoices(BreadcrumbItemChoices bic, boolean toUpdateUI) {
        if (bic == null)
            return null;
        if (modelStack.size() % 2 == 1) {
            modelStack.pop();
        }
        modelStack.addLast(bic);
        if (toUpdateUI) {
            updateComponents();
        }
        return bic;
    }

    /**
     * Pushes an item to the top position of the stack. If the current top is already a
     * {@link BreadcrumbItemChoices}, replace it.
     *
     * @param bi         The item to push.
     * @param toUpdateUI Indication whether the bar should be repainted.
     * @return The item that has been pushed.
     */
    protected synchronized Object pushChoice(BreadcrumbItem bi, boolean toUpdateUI) {
        assert (bi != null);
        if (!modelStack.isEmpty() && modelStack.size() % 2 == 0) {
            modelStack.pop();
        }
        bi.setIndex(modelStack.size());
        modelStack.addLast(bi);
        return bi;
    }
}