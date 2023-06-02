/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov
 * and <a href="http://www.topologi.com">Topologi</a>.
 * Contributed by <b>Rick Jelliffe</b> of <b>Topologi</b>
 * in January 2006.
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
package org.pushingpixels.radiance.component.internal.ui.bcb;

import org.pushingpixels.radiance.component.api.bcb.*;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.JCircularProgress;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.JScrollablePanel;
import org.pushingpixels.radiance.component.api.common.icon.EmptyRadianceIcon;
import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CircularProgressProjection;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
    private JBreadcrumbBar<Object> breadcrumbBar;

    private JCircularProgress circularProgress;

    private JPanel mainPanel;

    private JScrollablePanel<JPanel> scrollerPanel;

    private ComponentListener componentListener;

    private JCommandButton forSizing;

    /**
     * Contains the item path.
     */
    private LinkedList<Object> modelStack;

    private LinkedList<JCommandButton> buttonStack;
    private LinkedList<Command> commandStack;

    private BreadcrumbPathListener<Object> pathListener;

    private AtomicInteger atomicCounter;

    private Timer loadingTimer;

    private boolean isShowingProgress;

    private SwingWorker<Void, Object> pathChangeWorker;

    @SuppressWarnings("unchecked")
    @Override
    public void installUI(JComponent c) {
        this.breadcrumbBar = (JBreadcrumbBar<Object>) c;

        this.modelStack = new LinkedList<>();
        this.buttonStack = new LinkedList<>();
        this.commandStack = new LinkedList<>();

        installDefaults(this.breadcrumbBar);
        installComponents(this.breadcrumbBar);
        installListeners(this.breadcrumbBar);

        c.setLayout(createLayoutManager());

        if (this.breadcrumbBar.getContentModel().getItemCount() > 0) {
            // Already have some items in the model
            startLoadingTimer();

            if ((pathChangeWorker != null) && !pathChangeWorker.isDone()) {
                pathChangeWorker.cancel(true);
            }
            initAndRunPathChangeWorker(0);
        } else if (this.breadcrumbBar.getContentProvider() != null) {
            SwingWorker<List<BreadcrumbItem<Object>>, Void> worker =
                    new SwingWorker<>() {
                        @Override
                        protected List<BreadcrumbItem<Object>> doInBackground() throws Exception {
                            startLoadingTimer();
                            return breadcrumbBar.getContentProvider().getPathChoices(null);
                        }

                        @Override
                        protected void done() {
                            try {
                                stopLoadingTimer();
                                pushChoices(new BreadcrumbItemChoices<>(null, get()));
                            } catch (Exception exc) {
                                exc.printStackTrace(System.err);
                            }
                        }
                    };
            worker.execute();
        }

        this.forSizing = Command.builder()
                .setText("Text")
                .setIconFactory(EmptyRadianceIcon.factory())
                .setAction(commandActionEvent -> {
                })
                .build().project(CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.SMALL).build())
                .buildComponent();
        int preferredHeight = forSizing.getPreferredSize().height;
        this.circularProgress.setBorder(
                new EmptyBorder((preferredHeight - 12) / 2, 10, (preferredHeight - 12) / 2, 10));
        this.circularProgress.setPreferredSize(new Dimension(32, preferredHeight));
    }

    @Override
    public void uninstallUI(JComponent c) {
        c.setLayout(null);

        uninstallListeners((JBreadcrumbBar<?>) c);
        uninstallComponents((JBreadcrumbBar<?>) c);
        uninstallDefaults((JBreadcrumbBar<?>) c);
        this.breadcrumbBar = null;
    }

    protected void installDefaults(JBreadcrumbBar<?> bar) {
        Font currFont = bar.getFont();
        if ((currFont == null) || (currFont instanceof UIResource)) {
            bar.setFont(RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().getControlFont());
        }
    }

    protected void installComponents(JBreadcrumbBar<?> bar) {
        FlowLayout mainPanelLayout = new FlowLayout(FlowLayout.LEFT, 0, 0);
        mainPanelLayout.setAlignOnBaseline(true);
        this.mainPanel = new JPanel(mainPanelLayout);
        this.mainPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.mainPanel.setOpaque(false);
        this.scrollerPanel = new JScrollablePanel<>(this.mainPanel,
                JScrollablePanel.ScrollType.HORIZONTALLY);
        this.circularProgress = new CircularProgressProjection(
                CircularProgressContentModel.builder().build(),
                CircularProgressPresentationModel.builder().setSize(12).build()
        ).buildComponent();
        bar.add(this.scrollerPanel, BorderLayout.CENTER);
    }

    protected void installListeners(final JBreadcrumbBar<?> bar) {
        this.atomicCounter = new AtomicInteger(0);

        this.componentListener = new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                updateComponents();
            }
        };
        bar.addComponentListener(this.componentListener);

        this.pathListener = event -> {
            startLoadingTimer();

            if ((pathChangeWorker != null) && !pathChangeWorker.isDone()) {
                pathChangeWorker.cancel(true);
            }
            initAndRunPathChangeWorker(event.getIndexOfFirstChange());
        };
        this.breadcrumbBar.getContentModel().addPathListener(this.pathListener);
    }

    private void initAndRunPathChangeWorker(int indexOfFirstChange) {
        this.pathChangeWorker = new SwingWorker<>() {
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

                SwingUtilities.invokeLater(BasicBreadcrumbBarUI.this::updateComponents);

                if (indexOfFirstChange == 0) {
                    List<BreadcrumbItem<Object>> rootChoices = breadcrumbBar.getContentProvider()
                            .getPathChoices(null);
                    BreadcrumbItemChoices<Object> bic = new BreadcrumbItemChoices<>(null,
                            rootChoices);
                    if (!this.isCancelled()) {
                        publish(bic);
                    }
                }

                List<BreadcrumbItem<Object>> items = breadcrumbBar.getContentModel().getItems();
                if (items != null) {
                    for (int itemIndex = indexOfFirstChange; itemIndex < items.size();
                         itemIndex++) {
                        if (this.isCancelled()) {
                            break;
                        }

                        BreadcrumbItem<Object> item = items.get(itemIndex);
                        publish(item);

                        // now check if it has any children
                        List<BreadcrumbItem<Object>> subPath = new ArrayList<>();
                        for (int j = 0; j <= itemIndex; j++) {
                            subPath.add(items.get(j));
                        }
                        BreadcrumbItemChoices<Object> bic = new BreadcrumbItemChoices<>(
                                item, breadcrumbBar.getContentProvider().getPathChoices(subPath));
                        if ((bic.getChoices() != null) && !bic.getChoices().isEmpty()) {
                            // add the selector - the current item has
                            // children
                            publish(bic);
                        }
                    }
                }
                return null;
            }

            @SuppressWarnings("unchecked")
            @Override
            protected void process(List<Object> chunks) {
                if (chunks != null) {
                    for (Object chunk : chunks) {
                        if (this.isCancelled() || atomicCounter.get() > 1)
                            break;

                        if (chunk instanceof BreadcrumbItemChoices) {
                            pushChoices((BreadcrumbItemChoices<Object>) chunk, false);
                        }
                        if (chunk instanceof BreadcrumbItem) {
                            pushChoice((BreadcrumbItem<?>) chunk);
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

    protected void uninstallDefaults(JBreadcrumbBar<?> bar) {
    }

    protected void uninstallComponents(JBreadcrumbBar<?> bar) {
        this.stopLoadingTimer();
        this.mainPanel.removeAll();
        this.buttonStack.clear();
        this.commandStack.clear();

        bar.remove(this.scrollerPanel);
    }

    protected void uninstallListeners(JBreadcrumbBar<?> bar) {
        bar.removeComponentListener(this.componentListener);
        this.componentListener = null;

        this.breadcrumbBar.getContentModel().removePathListener(this.pathListener);
        this.pathListener = null;
    }

    private synchronized void startLoadingTimer() {
        if (this.loadingTimer == null) {
            this.loadingTimer = new Timer(100, actionEvent -> {
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
            int buttonHeight = forSizing.getPreferredSize().height;

            Insets ins = c.getInsets();
            return new Dimension(c.getWidth(), buttonHeight + ins.top + ins.bottom);
        }

        @Override
        public Dimension minimumLayoutSize(Container c) {
            int buttonHeight = forSizing.getPreferredSize().height;

            return new Dimension(10, buttonHeight);
        }

        @Override
        public void layoutContainer(Container c) {
            int width = c.getWidth();
            int height = c.getHeight();
            scrollerPanel.setBounds(0, 0, width, height);
        }
    }

    @SuppressWarnings("unchecked")
    protected synchronized void updateComponents() {
        if (!this.breadcrumbBar.isVisible()) {
            return;
        }

        this.mainPanel.removeAll();
        this.buttonStack.clear();
        this.commandStack.clear();

        BreadcrumbBarPresentationModel breadcrumbBarPresentationModel =
                this.breadcrumbBar.getPresentationModel();
        CommandButtonPresentationModel commandPresentation =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.MEDIUM)
                        .setIconFilterStrategies(
                                breadcrumbBarPresentationModel.getActiveIconFilterStrategy(),
                                breadcrumbBarPresentationModel.getEnabledIconFilterStrategy(),
                                breadcrumbBarPresentationModel.getDisabledIconFilterStrategy()
                        )
                        .setPopupPlacementStrategy(
                                RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_TOP)
                        .setHorizontalGapScaleFactor(0.75)
                        .setPopupMenuPresentationModel(
                                CommandPopupMenuPresentationModel.builder()
                                        .setMaxVisibleItems(10)
                                        .setItemFilterStrategies(
                                                breadcrumbBarPresentationModel.getActiveIconFilterStrategy(),
                                                breadcrumbBarPresentationModel.getEnabledIconFilterStrategy(),
                                                breadcrumbBarPresentationModel.getDisabledIconFilterStrategy()
                                        )
                                        .build())
                        .build();

        // update the ui
        for (int i = 0; i < modelStack.size(); i++) {
            Object element = modelStack.get(i);
            if (element instanceof BreadcrumbItemChoices) {
                BreadcrumbItemChoices<Object> bic = (BreadcrumbItemChoices<Object>) element;
                if (buttonStack.isEmpty()) {
                    Command command = Command.builder()
                            .setSecondaryContentModel(new CommandMenuContentModel(
                                    new CommandGroup()))
                            .build();
                    JCommandButton button = command.project(commandPresentation).buildComponent();
                    button.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
                    configureBreadcrumbButton(button);
                    configurePopupAction(command, bic);
                    configurePopupRollover(button);
                    buttonStack.add(button);
                    commandStack.add(command);
                } else {
                    JCommandButton button = buttonStack.getLast();
                    Command command = commandStack.getLast();
                    button.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
                    configurePopupAction(command, bic);
                    configurePopupRollover(button);
                }
            } else if (element instanceof BreadcrumbItem) {
                BreadcrumbItem<Object> bi = (BreadcrumbItem<Object>) element;

                Command command = Command.builder()
                        .setText(bi.getDisplayName())
                        .setIconFactory(bi.getIconFactory())
                        .setSecondaryContentModel(new CommandMenuContentModel(
                                new CommandGroup()))
                        .build();
                JCommandButton button = command.project(commandPresentation).buildComponent();
                configureBreadcrumbButton(button);

                configureMainAction(command, bi);

                if (i > 0) {
                    BreadcrumbItemChoices<Object> lastBic = (BreadcrumbItemChoices<Object>) modelStack.get(i - 1);
                    List<BreadcrumbItem<Object>> choices = lastBic.getChoices();
                    if (choices != null) {
                        for (int j = 0; j < choices.size(); j++) {
                            if (bi.getDisplayName().equals(choices.get(j).getDisplayName())) {
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

    private void configureMainAction(Command command, final BreadcrumbItem<Object> bi) {
        command.setAction(commandActionEvent ->
                SwingUtilities.invokeLater(() -> {
                    BreadcrumbBarContentModel<Object> barContentModel =
                            breadcrumbBar.getContentModel();
                    int itemIndex = barContentModel.indexOf(bi);
                    int toLeave = (itemIndex < 0) ? 0 : itemIndex + 1;
                    barContentModel.setCumulative(true);
                    while (barContentModel.getItemCount() > toLeave) {
                        barContentModel.removeLast();
                    }
                    barContentModel.setCumulative(false);
                })
        );
    }

    private void configurePopupAction(Command command, final BreadcrumbItemChoices<Object> bic) {
        List<Command> menuCommands = new ArrayList<>();

        List<BreadcrumbItem<Object>> items = bic.getChoices();
        for (int i = 0; i < items.size(); i++) {
            final BreadcrumbItem<Object> bi = items.get(i);

            Command.Builder commandBuilder = Command.builder();

            commandBuilder.setText(bi.getDisplayName());
            commandBuilder.setIconFactory(bi.getIconFactory());

            final int biIndex = i;

            commandBuilder.setAction(commandActionEvent -> SwingUtilities.invokeLater(() -> {
                BreadcrumbBarContentModel<Object> barContentModel =
                        breadcrumbBar.getContentModel();
                barContentModel.setCumulative(true);
                int itemIndex = barContentModel.indexOf(bic.getAncestor());
                int toLeave = ((bic.getAncestor() == null) || (itemIndex < 0)) ? 0
                        : itemIndex + 1;
                while (barContentModel.getItemCount() > toLeave) {
                    barContentModel.removeLast();
                }
                barContentModel.addLast(bi);

                bic.setSelectedIndex(biIndex);

                barContentModel.setCumulative(false);
            }));

            Command menuCommand = commandBuilder.build();
            menuCommands.add(menuCommand);
        }

        CommandMenuContentModel popupMenuContentModel =
                new CommandMenuContentModel(new CommandGroup(menuCommands));
        if (bic.getSelectedIndex() >= 0) {
            popupMenuContentModel.setHighlightedCommand(menuCommands.get(bic.getSelectedIndex()));
        }

        CommandMenuContentModel commandPopupMenuContentModel = command.getSecondaryContentModel();
        commandPopupMenuContentModel.removeAllCommandGroups();
        commandPopupMenuContentModel.addCommandGroup(new CommandGroup(menuCommands));
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
        button.getPopupModel().addChangeListener(changeEvent -> {
            PopupButtonModel model = button.getPopupModel();
            boolean displayDownwards = model.isRollover() || model.isPopupShowing();
            RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
                    displayDownwards
                            ? RadianceThemingSlices.PopupPlacementStrategy.Downward.HALIGN_START
                            : RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_TOP;
            button.setPopupPlacementStrategy(popupPlacementStrategy);
        });
    }

    /**
     * Pushes a choice to the top position of the stack. If the current top is already a
     * {@link BreadcrumbItemChoices}, replace it.
     *
     * @param bic The choice item to push.
     * @return The item that has been pushed.
     */
    protected Object pushChoices(BreadcrumbItemChoices<Object> bic) {
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
    protected synchronized Object pushChoices(BreadcrumbItemChoices<Object> bic, boolean toUpdateUI) {
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
     * @param bi The item to push.
     * @return The item that has been pushed.
     */
    protected synchronized Object pushChoice(BreadcrumbItem bi) {
        assert (bi != null);
        if (!modelStack.isEmpty() && modelStack.size() % 2 == 0) {
            modelStack.pop();
        }
        modelStack.addLast(bi);
        return bi;
    }
}