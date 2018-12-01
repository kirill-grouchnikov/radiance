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
package org.pushingpixels.flamingo.api.common.model;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback;
import org.pushingpixels.flamingo.api.common.projection.*;
import org.pushingpixels.neon.icon.*;

import javax.swing.event.*;
import java.beans.*;
import java.util.EventListener;

/**
 * Encapsulates metadata for a single command. Use a new instance of
 * {@link Builder} to configure a new command, and {@link Builder#build()} to build a command.
 *
 * <p>A command can be "rendered" on screen using {@link CommandPresentation} and
 * {@link CommandProjection}. Use {@link #project()} for default presentation settings or
 * {@link #project(CommandPresentation)} to customize presentation settings. Then use
 * {@link CommandProjection#buildButton()} to get an instance of {@link AbstractCommandButton}
 * that can be added to the component hierarchy. Note that you can - and should - use the same
 * {@link Command} instance and one or more {@link CommandPresentation}s if you need to have
 * multiple instances (or projections) of the same command in your app UI. That way changes in the
 * command are propagated and synced across all those projections.</p>
 *
 * @author Kirill Grouchnikov
 * @see CommandPresentation
 * @see CommandProjection
 */
public class Command implements ContentModel {
    public static final int DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS = 500;
    public static final int DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS = 100;

    private String title;
    private ResizableIcon icon;
    private ResizableIconFactory iconFactory;
    private ResizableIcon disabledIcon;
    private ResizableIconFactory disabledIconFactory;
    private String extraText;
    private CommandListener action;
    private RichTooltip actionRichTooltip;
    private CommandPopupMenuProjection popupMenuProjection;
    private PopupPanelCallback popupCallback;
    private RichTooltip popupRichTooltip;
    private boolean isTitleClickAction;
    private boolean isTitleClickPopup;
    private boolean isEnabled;
    private boolean isActionEnabled;
    private boolean isPopupEnabled;
    private boolean isToggle;
    private boolean isToggleSelected;
    private CommandToggleGroupModel toggleGroupModel;
    private boolean isAutoRepeatAction;
    private boolean hasAutoRepeatIntervalsSet;
    private int autoRepeatInitialInterval;
    private int autoRepeatSubsequentInterval;
    private boolean isFireActionOnRollover;
    private boolean isFireActionOnPress;
    private Command.CommandPreviewListener previewListener;

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    protected Command() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private void checkConsistency() {
        if (action == null) {
            if (actionRichTooltip != null) {
                throw new IllegalStateException("Configured action rich tooltip with no action");
            }
        }
        if ((popupMenuProjection == null) && (popupCallback == null)) {
            if (popupRichTooltip != null) {
                throw new IllegalStateException("Configured popup rich tooltip with no callback");
            }
        }

        if ((action != null) && (popupMenuProjection == null) && (popupCallback == null)
                && isTitleClickPopup) {
            throw new IllegalStateException(
                    "Action-only command configured to activate popup on title click");
        }

        if (((popupCallback != null) || (popupMenuProjection != null))
                && (action == null) && isTitleClickAction) {
            throw new IllegalStateException(
                    "Popup-only command configured to activate action on title click");
        }

        if ((action != null) && ((popupCallback != null) || (popupMenuProjection != null))) {
            if (isTitleClickAction && isTitleClickPopup) {
                throw new IllegalStateException(
                        "Command configured to have both action and popup can't have both " +
                                "activated on title click");
            }
            if (!isTitleClickAction && !isTitleClickPopup) {
                throw new IllegalStateException(
                        "Command configured to have both action and popup must have one activated" +
                                " on title click");
            }
        }

        if (isToggle && ((popupCallback != null) || (popupMenuProjection != null))) {
            throw new IllegalStateException("Command configured to be toggle can't have popups");
        }

        if (isToggleSelected && !isToggle) {
            throw new IllegalStateException(
                    "Command configured to not be a toggle but is selected");
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (this.title != title) {
            String old = this.title;
            this.title = title;
            this.pcs.firePropertyChange("title", old, this.title);
        }
    }

    public ResizableIcon getIcon() {
        return this.icon;
    }

    public void setIcon(ResizableIcon icon) {
        if (this.icon != icon) {
            ResizableIcon old = this.icon;
            this.icon = icon;
            this.pcs.firePropertyChange("icon", old, this.icon);
        }
    }

    public ResizableIconFactory getIconFactory() {
        return this.iconFactory;
    }

    public void setIconFactory(ResizableIconFactory iconFactory) {
        if (this.iconFactory != iconFactory) {
            ResizableIconFactory old = this.iconFactory;
            this.iconFactory = iconFactory;
            this.pcs.firePropertyChange("iconFactory", old, this.iconFactory);
        }
    }

    public ResizableIcon getDisabledIcon() {
        return this.disabledIcon;
    }

    public ResizableIconFactory getDisabledIconFactory() {
        return this.disabledIconFactory;
    }

    public String getExtraText() {
        return this.extraText;
    }

    public void setExtraText(String extraText) {
        String old = this.extraText;
        this.extraText = extraText;
        this.pcs.firePropertyChange("extraText", old, this.extraText);
    }

    public CommandListener getAction() {
        return this.action;
    }

    public void setAction(CommandListener actionListener) {
        CommandListener old = this.action;
        this.action = actionListener;
        this.pcs.firePropertyChange("action", old, this.action);
    }

    public RichTooltip getActionRichTooltip() {
        return this.actionRichTooltip;
    }

    public void setActionRichTooltip(RichTooltip actionRichTooltip) {
        if (this.actionRichTooltip != actionRichTooltip) {
            RichTooltip old = this.actionRichTooltip;
            this.actionRichTooltip = actionRichTooltip;
            this.pcs.firePropertyChange("actionRichTooltip", old, this.actionRichTooltip);
        }
    }

    public CommandPopupMenuProjection getPopupMenuProjection() {
        return this.popupMenuProjection;
    }

    public void setPopupMenuProjection(CommandPopupMenuProjection popupMenuProjection) {
        if (this.popupMenuProjection != popupMenuProjection) {
            CommandPopupMenuProjection old = this.popupMenuProjection;
            this.popupMenuProjection = popupMenuProjection;
            this.pcs.firePropertyChange("popupMenuProjection", old, this.popupMenuProjection);
        }
    }

    public PopupPanelCallback getPopupCallback() {
        return this.popupCallback;
    }

    public RichTooltip getPopupRichTooltip() {
        return this.popupRichTooltip;
    }

    public void setPopupRichTooltip(RichTooltip popupRichTooltip) {
        if (this.popupRichTooltip != popupRichTooltip) {
            RichTooltip old = this.popupRichTooltip;
            this.popupRichTooltip = popupRichTooltip;
            this.pcs.firePropertyChange("popupRichTooltip", old, this.popupRichTooltip);
        }
    }

    public boolean isTitleClickAction() {
        return this.isTitleClickAction;
    }

    public boolean isTitleClickPopup() {
        return this.isTitleClickPopup;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void setEnabled(boolean enabled) {
        if (this.isEnabled != enabled) {
            this.isEnabled = enabled;
            this.pcs.firePropertyChange("enabled", !this.isEnabled, this.isEnabled);
        }
    }

    public boolean isActionEnabled() {
        return this.isActionEnabled;
    }

    public void setActionEnabled(boolean actionEnabled) {
        if (this.isActionEnabled != actionEnabled) {
            this.isActionEnabled = actionEnabled;
            this.pcs.firePropertyChange("actionEnabled", !this.isActionEnabled,
                    this.isActionEnabled);
        }
    }

    public boolean isPopupEnabled() {
        return this.isPopupEnabled;
    }

    public void setPopupEnabled(boolean popupEnabled) {
        if (this.isPopupEnabled != popupEnabled) {
            this.isPopupEnabled = popupEnabled;
            this.pcs.firePropertyChange("popupEnabled", !this.isPopupEnabled, this.isPopupEnabled);
        }
    }

    public boolean isToggle() {
        return this.isToggle;
    }

    public boolean isToggleSelected() {
        return this.isToggleSelected;
    }

    public void setToggleSelected(boolean isToggleSelected) {
        if (this.isToggleSelected != isToggleSelected) {
            this.isToggleSelected = isToggleSelected;
            this.pcs.firePropertyChange("isToggleSelected", !this.isToggleSelected,
                    this.isToggleSelected);
            this.fireStateChanged();
        }
    }

    public CommandToggleGroupModel getToggleGroupModel() {
        return this.toggleGroupModel;
    }

    public boolean isAutoRepeatAction() {
        return this.isAutoRepeatAction;
    }

    public void setAutoRepeatAction(boolean isAutoRepeatAction) {
        if (this.isAutoRepeatAction != isAutoRepeatAction) {
            this.isAutoRepeatAction = isAutoRepeatAction;
            this.pcs.firePropertyChange("isAutoRepeatAction", !this.isAutoRepeatAction,
                    this.isAutoRepeatAction);
            this.fireStateChanged();
        }
    }

    public boolean hasAutoRepeatIntervalsSet() {
        return this.hasAutoRepeatIntervalsSet;
    }

    public int getAutoRepeatInitialInterval() {
        return this.hasAutoRepeatIntervalsSet ? this.autoRepeatInitialInterval : -1;
    }

    public int getAutoRepeatSubsequentInterval() {
        return this.hasAutoRepeatIntervalsSet ? this.autoRepeatSubsequentInterval : -1;
    }

    public boolean isFireActionOnRollover() {
        return this.isFireActionOnRollover;
    }

    public void setFireActionOnRollover(boolean isFireActionOnRollover) {
        if (this.isFireActionOnRollover != isFireActionOnRollover) {
            this.isFireActionOnRollover = isFireActionOnRollover;
            this.pcs.firePropertyChange("isFireActionOnRollover", !this.isFireActionOnRollover,
                    this.isFireActionOnRollover);
            this.fireStateChanged();
        }
    }

    public boolean isFireActionOnPress() {
        return this.isFireActionOnPress;
    }

    public void setFireActionOnPress(boolean isFireActionOnPress) {
        if (this.isFireActionOnPress != isFireActionOnPress) {
            this.isFireActionOnPress = isFireActionOnPress;
            this.pcs.firePropertyChange("isFireActionOnPress", !this.isFireActionOnPress,
                    this.isFireActionOnPress);
            this.fireStateChanged();
        }
    }

    public CommandPreviewListener getPreviewListener() {
        return this.previewListener;
    }

    protected boolean hasAction() {
        return (this.getAction() != null);
    }

    protected boolean hasPopup() {
        return (this.getPopupMenuProjection() != null) || (this.getPopupCallback() != null);
    }

    /**
     * Adds the specified change listener to track changes to this model.
     *
     * @param l Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from tracking changes to this model.
     *
     * @param l Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    /**
     * Notifies all registered listeners that the state of this model has changed.
     */
    private void fireStateChanged() {
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

    public void addPropertyChangeListener(PropertyChangeListener l) {
        this.pcs.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        this.pcs.removePropertyChangeListener(l);
    }

    public CommandProjection project() {
        return new CommandProjection(this, CommandPresentation.builder().build());
    }

    public CommandProjection project(CommandPresentation commandDisplay) {
        return new CommandProjection(this, commandDisplay);
    }

    public interface CommandPreviewListener extends EventListener {
        void onCommandPreviewActivated(Command command);

        void onCommandPreviewCanceled(Command command);
    }

    public abstract static class BaseBuilder<T extends Command, B extends BaseBuilder> {
        protected String title;
        protected ResizableIcon icon;
        protected ResizableIconFactory iconFactory;
        protected ResizableIcon disabledIcon;
        protected ResizableIconFactory disabledIconFactory;
        protected String extraText;
        protected CommandListener action;
        protected RichTooltip actionRichTooltip;
        protected CommandPopupMenuProjection popupMenuProjection;
        protected PopupPanelCallback popupCallback;
        protected RichTooltip popupRichTooltip;
        protected boolean isTitleClickAction;
        protected boolean isTitleClickPopup;
        protected boolean isEnabled = true;
        protected boolean isActionEnabled = true;
        protected boolean isPopupEnabled = true;
        protected boolean isToggle;
        protected boolean isToggleSelected;
        protected CommandToggleGroupModel toggleGroupModel;
        protected boolean isAutoRepeatAction;
        protected boolean hasAutoRepeatIntervalsSet;
        protected int autoRepeatInitialInterval;
        protected int autoRepeatSubsequentInterval;
        protected boolean isFireActionOnRollover;
        protected boolean isFireActionOnPress;
        protected CommandPreviewListener previewListener;

        protected void configureBaseCommand(Command command) {
            command.title = this.title;
            command.icon = this.icon;
            command.iconFactory = this.iconFactory;
            command.disabledIcon = this.disabledIcon;
            command.disabledIconFactory = this.disabledIconFactory;
            command.extraText = this.extraText;
            command.action = this.action;
            command.actionRichTooltip = this.actionRichTooltip;
            command.popupMenuProjection = this.popupMenuProjection;
            command.popupCallback = this.popupCallback;
            command.popupRichTooltip = this.popupRichTooltip;
            command.isTitleClickAction = this.isTitleClickAction;
            command.isTitleClickPopup = this.isTitleClickPopup;
            command.isEnabled = this.isEnabled;
            command.isActionEnabled = this.isActionEnabled;
            command.isPopupEnabled = this.isPopupEnabled;
            command.isToggle = this.isToggle;
            command.isToggleSelected = this.isToggleSelected;
            command.toggleGroupModel = this.toggleGroupModel;
            command.isAutoRepeatAction = this.isAutoRepeatAction;
            command.hasAutoRepeatIntervalsSet = this.hasAutoRepeatIntervalsSet;
            command.autoRepeatInitialInterval = this.autoRepeatInitialInterval;
            command.autoRepeatSubsequentInterval = this.autoRepeatSubsequentInterval;
            command.isFireActionOnRollover = this.isFireActionOnRollover;
            command.isFireActionOnPress = this.isFireActionOnPress;
            command.previewListener = this.previewListener;

            // special handling for toggle group model
            if (command.toggleGroupModel != null) {
                command.toggleGroupModel.add(command);
            }
        }

        public B setTitle(String title) {
            this.title = title;
            return (B) this;
        }

        public B setIcon(ResizableIcon icon) {
            this.icon = icon;
            return (B) this;
        }

        public B setIconFactory(ResizableIconFactory iconFactory) {
            this.iconFactory = iconFactory;
            return (B) this;
        }

        public B setDisabledIcon(ResizableIcon disabledIcon) {
            this.disabledIcon = disabledIcon;
            return (B) this;
        }

        public B setDisabledIconFactory(ResizableIconFactory iconFactory) {
            this.disabledIconFactory = iconFactory;
            return (B) this;
        }

        public B setExtraText(String extraText) {
            this.extraText = extraText;
            return (B) this;
        }

        public B setAction(CommandListener action) {
            this.action = action;
            return (B) this;
        }

        public B setActionRichTooltip(RichTooltip actionRichTooltip) {
            this.actionRichTooltip = actionRichTooltip;
            return (B) this;
        }

        public B setPopupMenuProjection(CommandPopupMenuProjection popupMenuProjection) {
            this.popupMenuProjection = popupMenuProjection;
            return (B) this;
        }

        public B setPopupCallback(PopupPanelCallback popupCallback) {
            this.popupCallback = popupCallback;
            return (B) this;
        }

        public B setPopupRichTooltip(RichTooltip popupRichTooltip) {
            this.popupRichTooltip = popupRichTooltip;
            return (B) this;
        }

        public B setTitleClickAction() {
            this.isTitleClickAction = true;
            return (B) this;
        }

        public B setTitleClickPopup() {
            this.isTitleClickPopup = true;
            return (B) this;
        }

        public B setEnabled(boolean isEnabled) {
            this.isEnabled = isEnabled;
            return (B) this;
        }

        public B setActionEnabled(boolean isActionEnabled) {
            this.isActionEnabled = isActionEnabled;
            return (B) this;
        }

        public B setPopupEnabled(boolean isPopupEnabled) {
            this.isPopupEnabled = isPopupEnabled;
            return (B) this;
        }

        public B setToggle() {
            this.isToggle = true;
            return (B) this;
        }

        public B setToggleSelected(boolean toggleSelected) {
            this.isToggle = true;
            this.isToggleSelected = toggleSelected;
            return (B) this;
        }

        public B inToggleGroup(CommandToggleGroupModel toggleGroup) {
            this.isToggle = true;
            this.toggleGroupModel = toggleGroup;
            return (B) this;
        }

        public B inToggleGroupAsSelected(CommandToggleGroupModel toggleGroup) {
            this.isToggle = true;
            this.isToggleSelected = true;
            this.toggleGroupModel = toggleGroup;
            return (B) this;
        }

        public B setAutoRepeatAction(boolean isAutoRepeatAction) {
            this.isAutoRepeatAction = isAutoRepeatAction;
            return (B) this;
        }

        public B setAutoRepeatActionIntervals(int initial, int subsequent) {
            this.hasAutoRepeatIntervalsSet = true;
            this.autoRepeatInitialInterval = initial;
            this.autoRepeatSubsequentInterval = subsequent;
            return (B) this;
        }

        public B setFireActionOnRollover(boolean isFireActionOnRollover) {
            this.isFireActionOnRollover = isFireActionOnRollover;
            return (B) this;
        }

        public B setFireActionOnPress(boolean isFireActionOnPress) {
            this.isFireActionOnPress = isFireActionOnPress;
            return (B) this;
        }

        public B setPreviewListener(CommandPreviewListener previewListener) {
            this.previewListener = previewListener;
            return (B) this;
        }
    }

    public static class Builder
            extends BaseBuilder<Command, Builder> {
        public Command build() {
            Command command = new Command();

            this.configureBaseCommand(command);

            command.checkConsistency();

            return command;
        }

        public AbstractCommandButton buildButton() {
            return build().project().buildButton();
        }

        public AbstractCommandButton buildButton(CommandPresentation commandDisplay) {
            return build().project(commandDisplay).buildButton();
        }

    }
}
