/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.api.ribbon;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.projection.*;
import org.pushingpixels.flamingo.api.ribbon.projection.*;
import org.pushingpixels.flamingo.api.ribbon.synapse.model.ComponentContentModel;
import org.pushingpixels.flamingo.api.ribbon.synapse.projection.ComponentProjection;
import org.pushingpixels.flamingo.internal.substance.ribbon.ui.SubstanceRibbonUI;
import org.pushingpixels.flamingo.internal.ui.ribbon.*;
import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.RibbonApplicationMenuProjection;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.List;
import java.util.*;

/**
 * The ribbon component.
 *
 * <p>
 * The ribbon has the following major parts:
 * </p>
 * <ul>
 * <li>Ribbon tasks added with {@link #addTask(RibbonTask)}</li>
 * <li>Contextual ribbon task groups added with
 * {@link #addContextualTaskGroup(RibbonContextualTaskGroup)}</li>
 * <li>Application menu content set by
 * {@link #setApplicationMenuCommand(RibbonApplicationMenuCommandProjection)} </li>
 * <li>Taskbar panel populated by {@link #addTaskbarCommand(CommandProjection)},
 * {@link #addTaskbarGalleryDropdown(RibbonGalleryProjection)}
 * and {@link #addTaskbarComponent(ComponentProjection)}</li>
 * <li>Anchored content set by {@link #addAnchoredCommand(CommandProjection)}</li>
 * </ul>
 *
 * <p>
 * While multiple ribbon tasks can be added to the ribbon, only one is visible at any given time.
 * This task is called the <strong>selected</strong> task. Tasks can be switched with the task
 * buttons placed along the top part of the ribbon. Once a task has been added to the ribbon, it
 * cannot be removed.
 * </p>
 *
 * <p>
 * The contextual ribbon task groups allow showing and hiding ribbon tasks based on the current
 * selection in the application. For example, Word only shows the table tasks when a table is
 * selected in the document. By default, tasks belonging to the groups added by
 * {@link #addContextualTaskGroup(RibbonContextualTaskGroup)} are not visible. To show the tasks
 * belonging to the specific group, call {@link #setVisible(RibbonContextualTaskGroup, boolean)}
 * API. Note that you can have multiple task groups visible at the same time.
 * </p>
 *
 * <p>
 * The application menu button is a rectangular button shown in the top left corner of the ribbon.
 * If the {@link #setApplicationMenuCommand(RibbonApplicationMenuCommandProjection)} is not called,
 * or called with the <code>null</code> value, the application menu button is not shown, and ribbon
 * task buttons are shifted to the left.
 * </p>
 *
 * <p>
 * The taskbar panel allows showing controls that are visible no matter what ribbon task is
 * selected. To add a taskbar component use the {@link #addTaskbarCommand(CommandProjection)},
 * {@link #addTaskbarGalleryDropdown(RibbonGalleryProjection)} and
 * {@link #addTaskbarComponent(ComponentProjection)} APIs. The taskbar panel lives in the top-left
 * corner of the application frame.
 * </p>
 *
 * <p>
 * The ribbon can be minimized in one of the following ways:
 * </p>
 * <ul>
 * <li>Calling {@link #setMinimized(boolean)} with <code>true</code>.</li>
 * <li>User double-clicking on a task button.</li>
 * <li>User pressing <code>Meta+Alt+R</code> key combination on a Mac machine or
 * </code><code>Ctrl+F1</code> key combination on a non-Mac machine.</li>
 * </ul>
 *
 * <p>
 * A minimized ribbon shows the application menu button, taskbar panel, task buttons and anchored
 * contet, but not the ribbon bands of the selected task. Clicking a task button shows the ribbon
 * bands of that task in a popup <strong>without</strong> shifting the application content down.
 * </p>
 *
 * @author Kirill Grouchnikov
 */
public class JRibbon extends JComponent {
    /**
     * The general tasks.
     *
     * @see #addTask(RibbonTask)
     * @see #getTaskCount()
     * @see #getTask(int)
     */
    private ArrayList<RibbonTask> tasks;

    /**
     * The contextual task groups.
     *
     * @see #addContextualTaskGroup(RibbonContextualTaskGroup)
     * @see #setVisible(RibbonContextualTaskGroup, boolean)
     * @see #isVisible(RibbonContextualTaskGroup)
     * @see #getContextualTaskGroupCount()
     * @see #getContextualTaskGroup(int)
     */
    private ArrayList<RibbonContextualTaskGroup> contextualTaskGroups;

    /**
     * The taskbar components (to the right of the application menu button).
     */
    private ArrayList<Component> taskbarComponents;

    private ArrayList<Command> taskbarCommands;

    private Map<Command, AbstractCommandButton> taskbarCommandMap;

    /**
     * Bands of the currently shown task.
     */
    private ArrayList<AbstractRibbonBand> bands;

    /**
     * Currently selected (shown) task.
     */
    private RibbonTask currentlySelectedTask;

    /**
     * Commands anchored to the far edge of the task toggle strip (right under LTR and left under
     * RTL).
     *
     * @see #addAnchoredCommand(CommandProjection)
     * @see #getAnchoredCommands()
     */
    private ArrayList<CommandProjection> anchoredCommands;

    /**
     * Visibility status of the contextual task group. Must contain a value for each group in
     * {@link #contextualTaskGroups}.
     *
     * @see #setVisible(RibbonContextualTaskGroup, boolean)
     * @see #isVisible(RibbonContextualTaskGroup)
     */
    private Map<RibbonContextualTaskGroup, Boolean> groupVisibilityMap;

    private RibbonApplicationMenuCommandProjection applicationMenuCommandProjection;

    /**
     * The application menu.
     *
     * @see #setApplicationMenuCommand(RibbonApplicationMenuCommandProjection)
     * @see #getApplicationMenuProjection()
     */
    private RibbonApplicationMenuProjection applicationMenuProjection;

    /**
     * Indicates whether the ribbon is currently minimized.
     *
     * @see #setMinimized(boolean)
     * @see #isMinimized()
     */
    private boolean isMinimized;

    /**
     * The host ribbon frame. Is <code>null</code> when the ribbon is not hosted in a
     * {@link JRibbonFrame}.
     */
    private JRibbonFrame ribbonFrame;

    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "RibbonUI";

    /**
     * Creates a new empty ribbon. Applications are highly encouraged to use {@link JRibbonFrame}
     * and access the ribbon with {@link JRibbonFrame#getRibbon()} API.
     */
    public JRibbon() {
        this.tasks = new ArrayList<>();
        this.contextualTaskGroups = new ArrayList<>();
        this.taskbarComponents = new ArrayList<>();
        this.taskbarCommandMap = new HashMap<>();
        this.taskbarCommands = new ArrayList<>();
        this.bands = new ArrayList<>();
        this.currentlySelectedTask = null;
        this.groupVisibilityMap = new HashMap<>();
        this.anchoredCommands = new ArrayList<>();

        updateUI();
    }

    /**
     * Creates an empty ribbon for the specified ribbon frame.
     *
     * @param ribbonFrame Host ribbon frame.
     */
    JRibbon(JRibbonFrame ribbonFrame) {
        this();
        this.ribbonFrame = ribbonFrame;
    }

    /**
     * Adds the specified command to the taskbar area of this ribbon.
     *
     * @param projection The taskbar command projection to add.
     * @see #getTaskbarCommands()
     * @see #addTaskbarSeparator()
     * @see #clearTaskbar()
     */
    public synchronized void addTaskbarCommand(CommandProjection<Command> projection) {
        CommandPresentation withOverlay = projection.getPresentationModel().overlayWith(
                CommandPresentation.overlay()
                        .setPresentationState(CommandButtonPresentationState.SMALL)
                        .setFocusable(false)
                        .setHorizontalGapScaleFactor(0.5)
                        .setVerticalGapScaleFactor(0.5));

        CommandProjection<Command> projectionWithOverlay = projection.reproject(withOverlay);
        AbstractCommandButton commandButton = projectionWithOverlay.buildComponent();

        this.taskbarComponents.add(commandButton);

        Command command = projection.getContentModel();
        this.taskbarCommandMap.put(command, commandButton);
        this.taskbarCommands.add(command);

        this.fireStateChanged();
    }

    public synchronized void addTaskbarComponent(
            ComponentProjection<? extends JComponent, ? extends ComponentContentModel> projection) {
        JRibbonComponent ribbonComponent = new JRibbonComponent(projection);
        this.taskbarComponents.add(ribbonComponent);
        this.fireStateChanged();
    }


    /**
     * Adds a separator to the taskbar area of this ribbon.
     *
     * @return the added separator
     * @see #addTaskbarCommand(CommandProjection)
     * @see #getTaskbarCommands()
     * @see #clearTaskbar()
     */
    public synchronized JSeparator addTaskbarSeparator() {
        JSeparator result = new JSeparator(JSeparator.VERTICAL);

        this.taskbarComponents.add(result);
        this.fireStateChanged();

        return result;
    }

    public synchronized void addTaskbarGalleryDropdown(RibbonGalleryProjection galleryProjection) {
        CommandPopupMenuProjection popupMenuProjection =
                JRibbonGallery.getExpandPopupMenu(galleryProjection,
                        this.getComponentOrientation());
        // The popup callback displays the expanded popup menu for the gallery
        Command galleryDropdownCommand = Command.builder()
                .setIconFactory(galleryProjection.getContentModel().getIconFactory())
                .setPopupMenuContentModel(popupMenuProjection.getContentModel())
                .build();

        CommandProjection galleryDropdownProjection = galleryDropdownCommand.project(
                CommandPresentation.builder()
                        .setPresentationState(CommandButtonPresentationState.SMALL)
                        .setPopupMenuPresentationModel(popupMenuProjection.getPresentationModel())
                        .build());
        galleryDropdownProjection.setPopupMenuCustomizer(
                popupMenuProjection.getComponentCustomizer());
        galleryDropdownProjection.setCommandOverlays(popupMenuProjection.getCommandOverlays());

        this.taskbarComponents.add(galleryDropdownProjection.buildComponent());

        this.fireStateChanged();
    }

    /**
     * Removes all taskbar content from this ribbon.
     *
     * @see #addTaskbarCommand(CommandProjection)
     * @see #addTaskbarSeparator()
     * @see #getTaskbarCommands()
     */
    public synchronized void clearTaskbar() {
        this.taskbarCommandMap.clear();
        this.taskbarCommands.clear();
        this.taskbarComponents.clear();
        this.fireStateChanged();
    }

    /**
     * Adds the specified task to this ribbon.
     *
     * @param task The ribbon task to add.
     * @see #addContextualTaskGroup(RibbonContextualTaskGroup)
     * @see #getTaskCount()
     * @see #getTask(int)
     */
    public synchronized void addTask(RibbonTask task) {
        task.setRibbon(this);

        this.tasks.add(task);

        if (this.tasks.size() == 1) {
            this.setSelectedTask(task);
        }

        this.fireStateChanged();
    }

    /**
     * Adds the specified ribbon command projection to the trailing edge of the task toggle strip
     * of this ribbon.
     *
     * @param projection Command projection to add.
     * @see #getAnchoredCommands()
     * @see #removeAnchoredCommand(CommandProjection)
     */
    public synchronized void addAnchoredCommand(CommandProjection projection) {
        this.anchoredCommands.add(projection);
        this.fireStateChanged();
    }

    /**
     * Removes the specified ribbon command from the trailing edge of the task toggle strip of this
     * ribbon.
     *
     * @param projection Command projection to remove.
     * @see #getAnchoredCommands()
     * @see #addAnchoredCommand(CommandProjection)
     */
    public synchronized void removeAnchoredCommand(CommandProjection projection) {
        this.anchoredCommands.remove(projection);
        this.fireStateChanged();
    }

    /**
     * Returns the anchored commands for this ribbon.
     *
     * @return This ribbon's anchored commands.
     * @see #addAnchoredCommand(CommandProjection)
     * @see #removeAnchoredCommand(CommandProjection)
     */
    public synchronized List<CommandProjection> getAnchoredCommands() {
        return Collections.unmodifiableList(this.anchoredCommands);
    }

    /**
     * Adds the specified contextual task group to this ribbon.
     *
     * @param group Task group to add.
     * @see #addTask(RibbonTask)
     * @see #setVisible(RibbonContextualTaskGroup, boolean)
     * @see #isVisible(RibbonContextualTaskGroup)
     */
    public synchronized void addContextualTaskGroup(RibbonContextualTaskGroup group) {
        group.setRibbon(this);

        this.contextualTaskGroups.add(group);
        this.groupVisibilityMap.put(group, Boolean.FALSE);

        this.fireStateChanged();
    }

    /**
     * Returns the number of regular tasks in <code>this</code> ribbon.
     *
     * @return Number of regular tasks in <code>this</code> ribbon.
     * @see #getTask(int)
     * @see #addTask(RibbonTask)
     */
    public synchronized int getTaskCount() {
        return this.tasks.size();
    }

    /**
     * Retrieves the regular task at specified index.
     *
     * @param index Task index.
     * @return Task that matches the specified index.
     * @see #getTaskCount()
     * @see #addTask(RibbonTask)
     */
    public synchronized RibbonTask getTask(int index) {
        return this.tasks.get(index);
    }

    /**
     * Returns the number of contextual task groups in <code>this</code> ribbon.
     *
     * @return Number of contextual task groups in <code>this</code> ribbon.
     * @see #addContextualTaskGroup(RibbonContextualTaskGroup)
     * @see #getContextualTaskGroup(int)
     */
    public synchronized int getContextualTaskGroupCount() {
        return this.contextualTaskGroups.size();
    }

    /**
     * Retrieves contextual task group at specified index.
     *
     * @param index Group index.
     * @return Group that matches the specified index.
     * @see #addContextualTaskGroup(RibbonContextualTaskGroup)
     * @see #getContextualTaskGroupCount()
     */
    public synchronized RibbonContextualTaskGroup getContextualTaskGroup(int index) {
        return this.contextualTaskGroups.get(index);
    }

    /**
     * Selects the specified task. The task can be either regular (added with
     * {@link #addTask(RibbonTask)}) or a task in a visible contextual task group (added with
     * {@link #addContextualTaskGroup(RibbonContextualTaskGroup)}. Fires a <code>selectedTask</code>
     * property change event.
     *
     * @param task Task to select.
     * @throws IllegalArgumentException If the specified task is not in the ribbon or not visible.
     * @see #getSelectedTask()
     */
    public synchronized void setSelectedTask(RibbonTask task) {
        boolean valid = this.tasks.contains(task);
        if (!valid) {
            for (int i = 0; i < this.getContextualTaskGroupCount(); i++) {
                RibbonContextualTaskGroup group = this.getContextualTaskGroup(i);
                if (!this.isVisible(group))
                    continue;
                for (int j = 0; j < group.getTaskCount(); j++) {
                    if (group.getTask(j) == task) {
                        valid = true;
                        break;
                    }
                }
                if (valid)
                    break;
            }
        }
        if (!valid) {
            throw new IllegalArgumentException("The specified task to be selected is either not "
                    + "part of this ribbon or not marked as visible");
        }

        for (AbstractRibbonBand ribbonBand : this.bands) {
            ribbonBand.setVisible(false);
        }
        this.bands.clear();

        for (int i = 0; i < task.getBandCount(); i++) {
            AbstractRibbonBand ribbonBand = task.getBand(i);
            ribbonBand.setVisible(true);
            this.bands.add(ribbonBand);
        }

        RibbonTask old = this.currentlySelectedTask;
        this.currentlySelectedTask = task;

        this.revalidate();
        this.repaint();

        this.firePropertyChange("selectedTask", old, this.currentlySelectedTask);
    }

    /**
     * Returns the currently selected task.
     *
     * @return The currently selected task.
     * @see #setSelectedTask(RibbonTask)
     */
    public synchronized RibbonTask getSelectedTask() {
        return this.currentlySelectedTask;
    }

    @Override
    public void updateUI() {
        setUI(new SubstanceRibbonUI());
        for (Component comp : this.taskbarComponents) {
            SwingUtilities.updateComponentTreeUI(comp);
        }
    }

    /**
     * Returns the UI delegate for this component.
     *
     * @return a <code>RibbonUI</code> object
     * @see #setUI
     */
    public RibbonUI getUI() {
        return (RibbonUI) ui;
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    /**
     * Gets an unmodifiable list of all taskbar commands of <code>this</code> ribbon.
     *
     * @return All taskbar commands of <code>this</code> ribbon.
     */
    public synchronized List<Command> getTaskbarCommands() {
        return Collections.unmodifiableList(this.taskbarCommands);
    }

    public synchronized List<Component> getTaskbarComponents() {
        return Collections.unmodifiableList(this.taskbarComponents);
    }

    /**
     * Adds the specified change listener to track changes to this ribbon.
     *
     * @param l Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from tracking changes to this ribbon.
     *
     * @param l Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    /**
     * Notifies all registered listeners that the state of this ribbon has changed.
     */
    protected void fireStateChanged() {
        // Guaranteed to return a non-null array
        Object[] listeners = this.listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        ChangeEvent event = new ChangeEvent(this);
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class) {
                ((ChangeListener) listeners[i + 1]).stateChanged(event);
            }
        }
    }

    /**
     * Sets the visibility of ribbon tasks in the specified contextual task group. Visibility of all
     * ribbon tasks in the specified group is affected. Note that the ribbon can show ribbon tasks
     * of multiple groups at the same time.
     *
     * @param group     Contextual task group.
     * @param isVisible If <code>true</code>, all ribbon tasks in the specified group will be
     *                  visible. If
     *                  <code>false</code>, all ribbon tasks in the specified group will be hidden.
     * @see #isVisible(RibbonContextualTaskGroup)
     */
    public synchronized void setVisible(RibbonContextualTaskGroup group, boolean isVisible) {
        this.groupVisibilityMap.put(group, isVisible);

        // special handling of selected tab
        if (!isVisible) {
            boolean isSelectedBeingHidden = false;
            for (int i = 0; i < group.getTaskCount(); i++) {
                if (this.getSelectedTask() == group.getTask(i)) {
                    isSelectedBeingHidden = true;
                    break;
                }
            }
            if (isSelectedBeingHidden) {
                this.setSelectedTask(this.getTask(0));
            }
        }

        this.fireStateChanged();
        this.revalidate();
        SwingUtilities.getWindowAncestor(this).repaint();
    }

    /**
     * Returns the visibility of ribbon tasks in the specified contextual task group.
     *
     * @param group Contextual task group.
     * @return <code>true</code> if the ribbon tasks in the specified group are visible,
     * <code>false</code> otherwise.
     */
    public synchronized boolean isVisible(RibbonContextualTaskGroup group) {
        return this.groupVisibilityMap.get(group);
    }

    /**
     * Sets the application menu command for this ribbon. If <code>null</code> is passed, the
     * application menu button is hidden.
     *
     * @param applicationMenuCommandProjection The new application menu command. Can be
     *                                         <code>null</code>.
     * @see #getApplicationMenuProjection()
     */
    public synchronized void setApplicationMenuCommand(
            RibbonApplicationMenuCommandProjection applicationMenuCommandProjection) {
        if (this.applicationMenuCommandProjection == applicationMenuCommandProjection) {
            return;
        }

        RibbonApplicationMenuProjection old = this.applicationMenuProjection;

        this.applicationMenuCommandProjection = applicationMenuCommandProjection;

        if (applicationMenuCommandProjection == null) {
            this.applicationMenuProjection = null;
        } else {
            RibbonApplicationMenu ribbonApplicationMenu = (RibbonApplicationMenu)
                    applicationMenuCommandProjection.getContentModel().getPopupMenuContentModel();
            RibbonApplicationMenuProjection ribbonApplicationMenuProjection =
                    new RibbonApplicationMenuProjection(
                            ribbonApplicationMenu, CommandPresentation.withDefaults());
            this.applicationMenuProjection = ribbonApplicationMenuProjection;
        }
        this.firePropertyChange("applicationMenu", old, this.applicationMenuProjection);
    }

    public RibbonApplicationMenuCommandProjection getApplicationMenuCommandProjection() {
        return this.applicationMenuCommandProjection;
    }

    /**
     * Returns the application menu of this ribbon.
     *
     * @return The application menu of this ribbon.
     * @see #setApplicationMenuCommand(RibbonApplicationMenuCommandProjection)
     */
    public synchronized RibbonApplicationMenuProjection getApplicationMenuProjection() {
        return this.applicationMenuProjection;
    }

    /**
     * Returns the indication whether this ribbon is minimized.
     *
     * @return <code>true</code> if this ribbon is minimized, <code>false</code> otherwise.
     * @see #setMinimized(boolean)
     */
    public synchronized boolean isMinimized() {
        return this.isMinimized;
    }

    /**
     * Changes the minimized state of this ribbon. Fires a <code>minimized</code> property change
     * event.
     *
     * @param isMinimized if <code>true</code>, this ribbon becomes minimized, otherwise it is
     *                    unminimized.
     */
    public synchronized void setMinimized(boolean isMinimized) {
        // System.out.println("Ribbon minimized -> " + isMinimized);
        boolean old = this.isMinimized;
        if (old != isMinimized) {
            this.isMinimized = isMinimized;
            this.firePropertyChange("minimized", old, this.isMinimized);
        }
    }

    /**
     * Returns the ribbon frame that hosts this ribbon. The result can be <code>null</code>.
     *
     * @return The ribbon frame that hosts this ribbon.
     */
    public JRibbonFrame getRibbonFrame() {
        return this.ribbonFrame;
    }

    @Override
    public void setVisible(boolean flag) {
        if (!flag && (getRibbonFrame() != null)) {
            throw new IllegalArgumentException("Can't hide ribbon on JRibbonFrame");
        }
        super.setVisible(flag);
    }
}
