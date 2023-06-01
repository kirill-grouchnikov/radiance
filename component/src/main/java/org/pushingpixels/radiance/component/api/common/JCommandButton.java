/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.common;

import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.popup.PopupPanelCallback;
import org.pushingpixels.radiance.component.api.common.popup.PopupPanelManager;
import org.pushingpixels.radiance.component.api.common.popup.model.BaseCommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.BaseCommandButtonProjection;
import org.pushingpixels.radiance.component.internal.theming.common.ui.RadianceCommandButtonUI;
import org.pushingpixels.radiance.component.internal.ui.common.BasicCommandButtonUI;
import org.pushingpixels.radiance.component.internal.ui.common.CommandButtonUI;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 * Command button. Note that while this class is a part of public API, it is highly
 * recommended to use the {@link Command} and {@link CommandButtonPresentationModel}
 * instances used to project the command button on screen for any dynamic manipulation
 * of the state.
 *
 * @author Kirill Grouchnikov
 */
public class JCommandButton extends JComponent implements RichTooltipManager.WithRichTooltip {
    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "CommandButtonUI";

    private BaseCommandButtonProjection<? extends BaseCommand<?>,
            ? extends BaseCommandMenuContentModel,
            ? extends BaseCommandButtonPresentationModel<?, ?>,
            ? extends BaseCommandPopupMenuPresentationModel> projection;
    @SuppressWarnings("rawtypes")
    private BaseCommand command;
    @SuppressWarnings("rawtypes")
    private BaseCommandButtonPresentationModel commandPresentation;

    /**
     * The button action model.
     *
     * @see #getActionModel()
     * @see #setActionModel(ActionButtonModel)
     */
    private ActionButtonModel actionModel;

    /**
     * Current presentation state of <code>this</code> button.
     *
     * @see #setPresentationState(CommandButtonPresentationState)
     * @see #getPresentationState()
     */
    private CommandButtonPresentationState presentationState;

    /**
     * Action handler for the button.
     */
    private ActionHandler actionHandler;

    /**
     * Key tip for the action area.
     *
     * @see #setActionKeyTip(String)
     * @see #getActionKeyTip()
     */
    private String actionKeyTip;

    /**
     * Associated popup callback. May be <code>null</code>.
     *
     * @see #setPopupCallback(PopupPanelCallback)
     * @see #getPopupCallback()
     */
    private PopupPanelCallback popupCallback;

    /**
     * The command button kind of this button.
     *
     * @see #setCommandButtonKind(CommandButtonKind)
     * @see #getCommandButtonKind()
     */
    private CommandButtonKind commandButtonKind;

    /**
     * The popup placement strategy of this button.
     *
     * @see #setPopupPlacementStrategy(RadianceThemingSlices.PopupPlacementStrategy)
     * @see #getPopupPlacementStrategy()
     */
    private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy;

    /**
     * Popup model of this button.
     *
     * @see #setPopupModel(PopupButtonModel)
     * @see #getPopupModel()
     */
    private PopupButtonModel popupModel;

    /**
     * Default popup handler for this button.
     */
    private PopupHandler popupHandler;

    /**
     * Key tip for the popup area of this button.
     *
     * @see #setPopupKeyTip(String)
     * @see #getPopupKeyTip()
     */
    private String popupKeyTip;

    /**
     * Enumerates the available command button kinds.
     *
     * @author Kirill Grouchnikov
     */
    public enum CommandButtonKind {
        /**
         * Command button that has only action area.
         */
        ACTION_ONLY(true, false),

        /**
         * Command button that has only popup area.
         */
        POPUP_ONLY(false, true),

        /**
         * Command button that has both action and popup areas, with the main
         * text click activating the action.
         */
        ACTION_AND_POPUP_MAIN_ACTION(true, true),

        /**
         * Command button that has both action and popup areas, with the main
         * text click activating the popup.
         */
        ACTION_AND_POPUP_MAIN_POPUP(true, true);

        /**
         * <code>true</code> if the command button kind has an action.
         */
        private boolean hasAction;

        /**
         * <code>true</code> if the command button kind has a popup.
         */
        private boolean hasPopup;

        /**
         * Constructs a new command button kind.
         *
         * @param hasAction Indicates whether the command button kind has an action.
         * @param hasPopup  Indicates whether the command button kind has a popup.
         */
        CommandButtonKind(boolean hasAction, boolean hasPopup) {
            this.hasAction = hasAction;
            this.hasPopup = hasPopup;
        }

        /**
         * Returns indication whether this command button kind has an action.
         *
         * @return <code>true</code> if the command button kind has an action,
         * <code>false</code> otherwise.
         */
        public boolean hasAction() {
            return hasAction;
        }

        /**
         * Returns indication whether this command button kind has a popup.
         *
         * @return <code>true</code> if the command button kind has a popup,
         * <code>false</code> otherwise.
         */
        public boolean hasPopup() {
            return hasPopup;
        }
    }

    /**
     * Extension of the default button model that supports the
     * {@link PopupButtonModel} interface.
     *
     * @author Kirill Grouchnikov
     */
    private static class DefaultPopupButtonModel extends DefaultButtonModel implements PopupButtonModel {
        /**
         * Identifies the "popup showing" bit in the bitmask, which indicates
         * that the visibility status of the associated popup.
         */
        public final static int POPUP_SHOWING = 1 << 8;

        private JCommandButton commandButton;

        /**
         * Creates a new default popup button model.
         */
        public DefaultPopupButtonModel(JCommandButton commandButton) {
            super();
            this.commandButton = commandButton;
        }

        @Override
        public void addPopupActionListener(PopupActionListener l) {
            listenerList.add(PopupActionListener.class, l);
        }

        @Override
        public void removePopupActionListener(PopupActionListener l) {
            listenerList.remove(PopupActionListener.class, l);
        }

        /**
         * Notifies all listeners that have registered interest for notification
         * on this event type.
         *
         * @param e the <code>ActionEvent</code> to deliver to listeners
         * @see EventListenerList
         */
        protected void firePopupActionPerformed(ActionEvent e) {
            // Guaranteed to return a non-null array
            Object[] listeners = listenerList.getListenerList();
            // Process the listeners last to first, notifying
            // those that are interested in this event
            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == PopupActionListener.class) {
                    ((PopupActionListener) listeners[i + 1]).actionPerformed(e);
                }
            }
        }

        @Override
        public void setPressed(boolean b) {
            if ((isPressed() == b) || !isEnabled()) {
                return;
            }

            if (b) {
                stateMask |= PRESSED;
            } else {
                stateMask &= ~PRESSED;
            }

            if (isPressed() && isArmed()) {
                // fire the popup action on button press and not on button
                // release - like the comboboxes
                int modifiers = 0;
                AWTEvent currentEvent = EventQueue.getCurrentEvent();
                if (currentEvent instanceof InputEvent) {
                    modifiers = ((InputEvent) currentEvent).getModifiersEx();
                } else if (currentEvent instanceof ActionEvent) {
                    modifiers = ((ActionEvent) currentEvent).getModifiers();
                }
                this.commandButton.getUI().setInnerFocusOnAction(false);
                firePopupActionPerformed(new ActionEvent(this,
                        ActionEvent.ACTION_PERFORMED, getActionCommand(),
                        EventQueue.getMostRecentEventTime(), modifiers));
            }

            fireStateChanged();
        }

        @Override
        public boolean isPopupShowing() {
            return (stateMask & POPUP_SHOWING) != 0;
        }

        @Override
        public void setPopupShowing(boolean b) {
            // System.out.println(this.isPopupShowing() + "-->" + b);
            if (this.isPopupShowing() == b) {
                return;
            }

            if (b) {
                stateMask |= POPUP_SHOWING;
            } else {
                stateMask &= ~POPUP_SHOWING;
            }

            fireStateChanged();
        }
    }

    public JCommandButton(BaseCommandButtonProjection<? extends BaseCommand<?>,
            ? extends BaseCommandMenuContentModel,
            ? extends BaseCommandButtonPresentationModel<?, ?>,
            ? extends BaseCommandPopupMenuPresentationModel> projection) {
        this.projection = projection;
        this.command = projection.getContentModel();
        this.commandPresentation = projection.getPresentationModel();

        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(this,
                commandPresentation.getActiveIconFilterStrategy(),
                commandPresentation.getEnabledIconFilterStrategy(),
                commandPresentation.getDisabledIconFilterStrategy());

        boolean hasAction = (command.getAction() != null);

        if (hasAction) {
            this.addCommandListener(command.getAction());
            this.setActionKeyTip(commandPresentation.getActionKeyTip());
        }

        if (!commandPresentation.isToDismissPopupsOnActivation()) {
            this.putClientProperty(BasicCommandButtonUI.DONT_DISPOSE_POPUPS, Boolean.TRUE);
        }

        this.setPresentationState(commandPresentation.getPresentationState());
        this.setFocusable(commandPresentation.isFocusable());

        this.actionHandler = new ActionHandler();
        this.setOpaque(false);

        ActionButtonModel actionButtonModel = new ActionRepeatableButtonModel(this);
        actionButtonModel.setEnabled(command.isActionEnabled());
        actionButtonModel.setSelected(command.isToggleSelected());
        this.setActionModel(actionButtonModel);

        // important - handler creation must be done before setting
        // the popup model so that it can be registered to track the
        // changes
        this.popupHandler = new PopupHandler();
        PopupButtonModel popupButtonModel = new DefaultPopupButtonModel(this);
        popupButtonModel.setEnabled(command.isSecondaryEnabled());
        this.setPopupModel(popupButtonModel);

        boolean hasPopup = (command.getSecondaryContentModel() != null);

        if (hasPopup) {
            if (command.getSecondaryContentModel() != null) {
                this.setPopupCallback(commandButton ->
                        projection.getPopupMenuPanelProjection().buildComponent());
            }
            this.setPopupKeyTip(commandPresentation.getPopupKeyTip());
        }

        if (hasAction && hasPopup) {
            this.setCommandButtonKind(commandPresentation.getTextClick() == BaseCommandButtonPresentationModel.TextClick.ACTION
                    ? JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                    : JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
        } else if (hasPopup) {
            this.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
        } else {
            this.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_ONLY);
        }

        this.getActionModel().setFireActionOnPress(commandPresentation.getActionFireTrigger() ==
                CommandButtonPresentationModel.ActionFireTrigger.ON_PRESSED);

        this.setPopupPlacementStrategy(commandPresentation.getPopupPlacementStrategy());

        if (command.getActionPreview() != null) {
            this.getActionModel().addChangeListener(new ChangeListener() {
                boolean wasRollover = false;

                @Override
                public void stateChanged(ChangeEvent e) {
                    boolean isRollover = getActionModel().isRollover();
                    if (wasRollover && !isRollover) {
                        command.getActionPreview().onCommandPreviewCanceled(command);
                    }
                    if (!wasRollover && isRollover) {
                        command.getActionPreview().onCommandPreviewActivated(command);
                    }
                    wasRollover = isRollover;
                }
            });
        }

        // Don't remove the next line - we need to instantiate the RichTooltipManager
        // so that it starts tracking mouse events for displaying rich tooltips
        RichTooltipManager.sharedInstance();

        this.updateUI();
        if (commandPresentation.getFont() != null) {
            this.setFont(commandPresentation.getFont());
        }
    }

    /**
     * Returns the UI delegate for this button.
     *
     * @return The UI delegate for this button.
     */
    public CommandButtonUI getUI() {
        return (CommandButtonUI) ui;
    }

    public BaseCommandButtonProjection<? extends BaseCommand<?>, ? extends BaseCommandMenuContentModel,
            ? extends BaseCommandButtonPresentationModel<?, ?>,
            ? extends BaseCommandPopupMenuPresentationModel> getProjection() {
        return this.projection;
    }

    public BaseCommand<? extends BaseCommandMenuContentModel> getContentModel() {
        return this.projection.getContentModel();
    }

    public BaseCommandButtonPresentationModel<? extends BaseCommandPopupMenuPresentationModel,
            ? extends BaseCommandButtonPresentationModel<?, ?>> getPresentationModel() {
        return this.projection.getPresentationModel();
    }

    /**
     * Sets new presentation state for <code>this</code> button. Fires a
     * <code>presentationState</code> property change event.
     *
     * @param state New presentation state.
     * @see #getPresentationState()
     */
    public void setPresentationState(CommandButtonPresentationState state) {
        CommandButtonPresentationState old = this.presentationState;
        this.presentationState = state;

        this.firePropertyChange("presentationState", old, this.presentationState);
    }

    /**
     * Return the current presentation state of <code>this</code> button.
     *
     * @return The current presentation state of <code>this</code> button.
     * @see #setPresentationState(CommandButtonPresentationState)
     */
    public CommandButtonPresentationState getPresentationState() {
        return this.presentationState;
    }

    /**
     * Returns the action model for this button.
     *
     * @return The action model for this button.
     * @see #setActionModel(ActionButtonModel)
     */
    public ActionButtonModel getActionModel() {
        return this.actionModel;
    }

    /**
     * Sets the new action model for this button. Fires an
     * <code>actionModel</code> property change event.
     *
     * @param newModel The new action model for this button.
     * @see #getActionModel()
     */
    public void setActionModel(ActionButtonModel newModel) {
        ButtonModel oldModel = getActionModel();

        if (oldModel != null) {
            oldModel.removeChangeListener(this.actionHandler);
            oldModel.removeActionListener(this.actionHandler);
        }

        actionModel = newModel;

        if (newModel != null) {
            newModel.addChangeListener(this.actionHandler);
            newModel.addActionListener(this.actionHandler);
        }

        firePropertyChange("actionModel", oldModel, newModel);
        if (newModel != oldModel) {
            revalidate();
            repaint();
        }
    }

    /**
     * Adds the specified command listener to this button.
     *
     * @param l Command listener to add.
     * @see #removeCommandListener(CommandAction)
     */
    public void addCommandListener(CommandAction l) {
        this.listenerList.add(CommandAction.class, l);
    }

    /**
     * Removes the specified command listener from this button.
     *
     * @param l Command listener to remove.
     * @see #addCommandListener(CommandAction)
     */
    public void removeCommandListener(CommandAction l) {
        this.listenerList.remove(CommandAction.class, l);
    }

    /**
     * Adds the specified change listener to this button.
     *
     * @param l Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from this button.
     *
     * @param l Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    /**
     * Default action handler for this button.
     *
     * @author Kirill Grouchnikov
     */
    class ActionHandler implements ActionListener, ChangeListener {
        public void stateChanged(ChangeEvent e) {
            fireStateChanged();
            repaint();
        }

        public void actionPerformed(ActionEvent event) {
            fireActionPerformed(event);
        }
    }

    /**
     * Notifies all listeners that have registered interest for notification on
     * this event type. The event instance is lazily created.
     *
     * @see EventListenerList
     */
    protected void fireStateChanged() {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        ChangeEvent ce = new ChangeEvent(this);
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class) {
                // Lazily create the event:
                ((ChangeListener) listeners[i + 1]).stateChanged(ce);
            }
        }
    }

    /**
     * Notifies all listeners that have registered interest for notification on
     * this event type. The event instance is lazily created using the
     * <code>event</code> parameter.
     *
     * @param event the <code>ActionEvent</code> object
     * @see EventListenerList
     */
    protected void fireActionPerformed(ActionEvent event) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        CommandActionEvent e = null;
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == CommandAction.class) {
                // Lazily create the event:
                if (e == null) {
                    String actionCommand = event.getActionCommand();
                    e = new CommandActionEvent(this, ActionEvent.ACTION_PERFORMED, this.command,
                            actionCommand, event.getWhen(), event.getModifiers());
                }
                ((CommandAction) listeners[i + 1]).commandActivated(e);
            }
        }

        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ActionListener.class) {
                // Lazily create the event:
                if (e == null) {
                    String actionCommand = event.getActionCommand();
                    e = new CommandActionEvent(this, ActionEvent.ACTION_PERFORMED, this.command,
                            actionCommand, event.getWhen(), event.getModifiers());
                }
                ((ActionListener) listeners[i + 1]).actionPerformed(e);
            }
        }
    }

    /**
     * Programmatically perform an action "click". This does the same thing as
     * if the user had pressed and released the action area of the button.
     */
    public void doActionClick() {
        Dimension size = getSize();
        ButtonModel actionModel = this.getActionModel();
        actionModel.setArmed(true);
        actionModel.setPressed(true);
        paintImmediately(new Rectangle(0, 0, size.width, size.height));
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
        }
        actionModel.setPressed(false);
        actionModel.setArmed(false);
    }

    @Override
    public void setToolTipText(String text) {
        throw new UnsupportedOperationException("Use rich tooltip APIs");
    }

    /**
     * Returns the key tip for the action area of this button.
     *
     * @return The key tip for the action area of this button.
     * @see #setActionKeyTip(String)
     */
    public String getActionKeyTip() {
        return this.actionKeyTip;
    }

    /**
     * Sets the key tip for the action area of this button. Fires an
     * <code>actionKeyTip</code> property change event.
     *
     * @param actionKeyTip The key tip for the action area of this button.
     * @see #getActionKeyTip()
     */
    public void setActionKeyTip(String actionKeyTip) {
        String old = this.actionKeyTip;
        this.actionKeyTip = actionKeyTip;
        this.firePropertyChange("actionKeyTip", old, this.actionKeyTip);
    }

    /**
     * Returns the command button kind of this button.
     *
     * @return Command button kind of this button.
     * @see #setCommandButtonKind(CommandButtonKind)
     */
    public CommandButtonKind getCommandButtonKind() {
        return this.commandButtonKind;
    }

    /**
     * Sets the kind for this button. Fires a <code>commandButtonKind</code>
     * property change event.
     *
     * @param commandButtonKind The new button kind.
     * @see #getCommandButtonKind()
     */
    public void setCommandButtonKind(CommandButtonKind commandButtonKind) {
        CommandButtonKind old = this.commandButtonKind;
        this.commandButtonKind = commandButtonKind;
        if (old != this.commandButtonKind) {
            firePropertyChange("commandButtonKind", old, this.commandButtonKind);
        }
    }

    /**
     * Returns the popup placement strategy of this button.
     *
     * @return Popup placement strategy of this button.
     * @see #setPopupPlacementStrategy(RadianceThemingSlices.PopupPlacementStrategy)
     */
    public RadianceThemingSlices.PopupPlacementStrategy getPopupPlacementStrategy() {
        return this.popupPlacementStrategy;
    }

    /**
     * Sets the popup placement strategy for this button. Fires a
     * <code>popupPlacementStrategy</code> property change event.
     *
     * @param popupPlacementStrategy The new popup placement strategy.
     * @see #getPopupPlacementStrategy()
     */
    public void setPopupPlacementStrategy(
            RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy) {
        RadianceThemingSlices.PopupPlacementStrategy old = this.popupPlacementStrategy;
        this.popupPlacementStrategy = popupPlacementStrategy;
        if (old != this.popupPlacementStrategy) {
            firePropertyChange("popupPlacementStrategy", old, this.popupPlacementStrategy);
        }
    }

    @Override
    public void updateUI() {
        setUI(RadianceCommandButtonUI.createUI(this));
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    /**
     * Returns the associated popup callback.
     *
     * @return The associated popup callback.
     * @see #setPopupCallback(PopupPanelCallback)
     */
    public PopupPanelCallback getPopupCallback() {
        return this.popupCallback;
    }

    /**
     * Sets new popup callback for <code>this</code> button.
     *
     * @param popupCallback New popup callback for <code>this</code> button.
     * @see #getPopupCallback()
     */
    public void setPopupCallback(PopupPanelCallback popupCallback) {
        this.popupCallback = popupCallback;

        if (command != null) {
            boolean hasAction = (command.getAction() != null);
            boolean hasPopup = (this.popupCallback != null);

            if (hasPopup) {
                this.setPopupKeyTip(commandPresentation.getPopupKeyTip());
            }

            if (hasAction && hasPopup) {
                this.setCommandButtonKind(commandPresentation.getTextClick() == BaseCommandButtonPresentationModel.TextClick.ACTION
                        ? JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                        : JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
            } else if (hasPopup) {
                this.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
            } else {
                this.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_ONLY);
            }
        }
    }

    /**
     * Returns the popup model of this button.
     *
     * @return The popup model of this button.
     * @see #setPopupModel(PopupButtonModel)
     */
    public PopupButtonModel getPopupModel() {
        return this.popupModel;
    }

    /**
     * Sets the new popup model for this button. Fires a <code>popupModel</code>
     * property change event.
     *
     * @param newModel The new popup model for this button.
     * @see #getPopupModel()
     */
    public void setPopupModel(PopupButtonModel newModel) {
        PopupButtonModel oldModel = getPopupModel();

        if (oldModel != null) {
            oldModel.removeChangeListener(this.popupHandler);
            oldModel.removeActionListener(this.popupHandler);
        }

        this.popupModel = newModel;

        if (newModel != null) {
            newModel.addChangeListener(this.popupHandler);
            newModel.addActionListener(this.popupHandler);
        }

        firePropertyChange("popupModel", oldModel, newModel);
        if (newModel != oldModel) {
            revalidate();
            repaint();
        }
    }

    @Override
    public void setEnabled(boolean b) {
        if (this.popupModel != null) {
            if (!b && this.popupModel.isRollover()) {
                this.popupModel.setRollover(false);
            }
        }
        if (this.actionModel != null) {
            if (!b && this.actionModel.isRollover()) {
                this.actionModel.setRollover(false);
            }
        }
        super.setEnabled(b);
        if (this.popupModel != null) {
            this.popupModel.setEnabled(b);
        }
        if (this.actionModel != null) {
            this.actionModel.setEnabled(b);
        }
    }

    /**
     * Default popup handler.
     *
     * @author Kirill Grouchnikov
     */
    class PopupHandler implements PopupActionListener, ChangeListener {
        public void stateChanged(ChangeEvent e) {
            fireStateChanged();
            repaint();
        }

        public void actionPerformed(ActionEvent event) {
            firePopupActionPerformed(event);
        }
    }

    /**
     * Notifies all listeners that have registered interest for notification on
     * this event type. The event instance is lazily created using the
     * <code>event</code> parameter.
     *
     * @param event the <code>ActionEvent</code> object
     * @see EventListenerList
     */
    protected void firePopupActionPerformed(ActionEvent event) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        ActionEvent e = null;
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == PopupActionListener.class) {
                // Lazily create the event:
                if (e == null) {
                    String actionCommand = event.getActionCommand();
                    e = new ActionEvent(this, ActionEvent.ACTION_PERFORMED,
                            actionCommand, event.getWhen(), event
                            .getModifiers());
                }
                ((PopupActionListener) listeners[i + 1]).actionPerformed(e);
            }
        }
    }

    @Override
    public RichTooltip getRichTooltip(MouseEvent event) {
        CommandButtonUI ui = this.getUI();
        if (ui.getLayoutInfo().actionClickArea.contains(event.getPoint())) {
            return this.command.getActionRichTooltip();
        }
        if (ui.getLayoutInfo().popupClickArea.contains(event.getPoint())) {
            return this.command.getSecondaryRichTooltip();
        }
        return null;
    }

    @Override
    public RichTooltipPresentationModel getRichTooltipPresentationModel(MouseEvent event) {
        CommandButtonUI ui = this.getUI();
        if (ui.getLayoutInfo().actionClickArea.contains(event.getPoint())) {
            return this.commandPresentation.getActionRichTooltipPresentationModel();
        }
        if (ui.getLayoutInfo().popupClickArea.contains(event.getPoint())) {
            return this.commandPresentation.getPopupRichTooltipPresentationModel();
        }
        return null;
    }

    /**
     * Returns the key tip for the popup area of this button.
     *
     * @return The key tip for the popup area of this button.
     * @see #setPopupKeyTip(String)
     * @see #getActionKeyTip()
     */
    public String getPopupKeyTip() {
        return this.popupKeyTip;
    }

    /**
     * Sets the key tip for the popup area of this button. Fires a
     * <code>popupKeyTip</code> property change event.
     *
     * @param popupKeyTip The key tip for the popup area of this button.
     * @see #getPopupKeyTip()
     * @see #setActionKeyTip(String)
     */
    public void setPopupKeyTip(String popupKeyTip) {
        String old = this.popupKeyTip;
        this.popupKeyTip = popupKeyTip;
        this.firePropertyChange("popupKeyTip", old, this.popupKeyTip);
    }

    /**
     * Programmatically perform a "click" on the popup area. This does the same
     * thing as if the user had pressed and released the popup area of the
     * button.
     */
    public void doPopupClick() {
        Dimension size = getSize();
        PopupButtonModel popupModel = this.getPopupModel();
        popupModel.setArmed(true);
        popupModel.setPressed(true);
        paintImmediately(new Rectangle(0, 0, size.width, size.height));
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
        }
        popupModel.setPressed(false);
        popupModel.setArmed(false);
        popupModel.setPopupShowing(true);
        paintImmediately(new Rectangle(0, 0, size.width, size.height));
    }

    public boolean isPopupVisible() {
        List<PopupPanelManager.PopupInfo> popupInfos =
                PopupPanelManager.defaultManager().getShownPath();
        for (PopupPanelManager.PopupInfo popupInfo : popupInfos) {
            if (popupInfo.getPopupOriginator() == this) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a rollover action listener that will be called when the rollover
     * state of this button becomes active.
     *
     * @param l The rollover action listener to add.
     * @see #removeRolloverActionListener(RolloverActionListener)
     */
    public void addRolloverActionListener(RolloverActionListener l) {
        this.listenerList.add(RolloverActionListener.class, l);
    }

    /**
     * Removes the specified rollover action listener.
     *
     * @param l The listener to remove.
     * @see #addRolloverActionListener(RolloverActionListener)
     */
    public void removeRolloverActionListener(RolloverActionListener l) {
        this.listenerList.remove(RolloverActionListener.class, l);
    }

    /**
     * Programmatically perform a "rollover" on the action area. This does the
     * same thing as if the user had moved the mouse over the action area of the
     * button.
     */
    public void doActionRollover() {
        ActionEvent ae = new ActionEvent(this, ActionEvent.ACTION_PERFORMED,
                this.getActionModel().getActionCommand());
        // Guaranteed to return a non-null array
        RolloverActionListener[] listeners = this.getListeners(RolloverActionListener.class);
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 1; i >= 0; i--) {
            (listeners[i]).actionPerformed(ae);
        }
    }
}
