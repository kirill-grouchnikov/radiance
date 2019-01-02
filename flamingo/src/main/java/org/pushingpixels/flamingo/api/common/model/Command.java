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
package org.pushingpixels.flamingo.api.common.model;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.projection.CommandButtonProjection;
import org.pushingpixels.neon.icon.ResizableIconFactory;

import javax.swing.event.*;
import java.beans.*;
import java.util.EventListener;

/**
 * Encapsulates metadata for a single command. Use a new instance of
 * {@link Builder} to configure a new command, and {@link Builder#build()} to build a command.
 *
 * <p>A command can be projected to screen (creating a visual representation of that command)
 * using {@link CommandButtonPresentationModel} and {@link CommandButtonProjection}. Use
 * {@link #project()} for default presentation settings or
 * {@link #project(CommandButtonPresentationModel)} to customize presentation settings. Then use
 * {@link CommandButtonProjection#buildComponent()} to get an instance of
 * {@link AbstractCommandButton} that can be added to the component hierarchy. Note that you
 * can - and should - use the same {@link Command} instance and one or more
 * {@link CommandButtonPresentationModel}s if you need to have multiple instances (or
 * projections) of the same command in your app UI. That way changes in thecommand are propagated
 * and synced across all those projections.</p>
 *
 * @author Kirill Grouchnikov
 * @see CommandButtonPresentationModel
 * @see CommandButtonProjection
 */
public class Command implements ContentModel {
    public static final int DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS = 500;
    public static final int DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS = 100;

    private String text;
    private ResizableIconFactory iconFactory;
    private ResizableIconFactory disabledIconFactory;
    private String extraText;
    private CommandAction action;
    private CommandActionPreview actionPreview;
    private RichTooltip actionRichTooltip;
    private CommandMenuContentModel secondaryContentModel;
    private RichTooltip secondaryRichTooltip;
    private boolean isTitleClickAction;
    private boolean isTitleClickSecondary;
    private boolean isEnabled;
    private boolean isActionEnabled;
    private boolean isSecondaryEnabled;
    private boolean isToggle;
    private boolean isToggleSelected;
    private CommandToggleGroupModel toggleGroupModel;
    private boolean isAutoRepeatAction;
    private boolean hasAutoRepeatIntervalsSet;
    private int autoRepeatInitialInterval;
    private int autoRepeatSubsequentInterval;
    private boolean isFireActionOnRollover;
    private boolean isFireActionOnPress;

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public interface CommandActionPreview extends EventListener {
        void onCommandPreviewActivated(Command command);

        void onCommandPreviewCanceled(Command command);
    }

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
        if (secondaryContentModel == null) {
            if (secondaryRichTooltip != null) {
                throw new IllegalStateException(
                        "Configured secondary rich tooltip with no callback");
            }
        }

        if ((action != null) && (secondaryContentModel == null) && isTitleClickSecondary) {
            throw new IllegalStateException(
                    "Action-only command configured to activate secondary on title click");
        }

        if ((secondaryContentModel != null) && (action == null) && isTitleClickAction) {
            throw new IllegalStateException(
                    "Secondary-only command configured to activate action on title click");
        }

        if ((action != null) && (secondaryContentModel != null)) {
            if (isTitleClickAction && isTitleClickSecondary) {
                throw new IllegalStateException(
                        "Command configured to have both action and secondary can't have both " +
                                "activated on title click");
            }
            if (!isTitleClickAction && !isTitleClickSecondary) {
                throw new IllegalStateException(
                        "Command configured to have both action and secondary must have one " +
                                "activated on title click");
            }
        }

        if (isToggle && (secondaryContentModel != null)) {
            throw new IllegalStateException("Command configured to be toggle can't have secondary");
        }

        if (isToggle && isFireActionOnRollover) {
            throw new IllegalStateException(
                    "Command configured to be toggle can't fire action on rollover");
        }

        if (isToggleSelected && !isToggle) {
            throw new IllegalStateException(
                    "Command configured to not be a toggle but is selected");
        }
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        if (this.text != text) {
            String old = this.text;
            this.text = text;
            this.pcs.firePropertyChange("text", old, this.text);
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

    public ResizableIconFactory getDisabledIconFactory() {
        return this.disabledIconFactory;
    }

    public void setDisabledIconFactory(ResizableIconFactory disabledIconFactory) {
        if (this.disabledIconFactory != disabledIconFactory) {
            ResizableIconFactory old = this.disabledIconFactory;
            this.disabledIconFactory = disabledIconFactory;
            this.pcs.firePropertyChange("disabledIconFactory", old, this.disabledIconFactory);
        }
    }

    public String getExtraText() {
        return this.extraText;
    }

    public void setExtraText(String extraText) {
        String old = this.extraText;
        this.extraText = extraText;
        this.pcs.firePropertyChange("extraText", old, this.extraText);
    }

    public CommandAction getAction() {
        return this.action;
    }

    public void setAction(CommandAction actionListener) {
        CommandAction old = this.action;
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

    public CommandMenuContentModel getSecondaryContentModel() {
        return this.secondaryContentModel;
    }

    public RichTooltip getSecondaryRichTooltip() {
        return this.secondaryRichTooltip;
    }

    public void setSecondaryRichTooltip(RichTooltip secondaryRichTooltip) {
        if (this.secondaryRichTooltip != secondaryRichTooltip) {
            RichTooltip old = this.secondaryRichTooltip;
            this.secondaryRichTooltip = secondaryRichTooltip;
            this.pcs.firePropertyChange("secondaryRichTooltip", old, this.secondaryRichTooltip);
        }
    }

    public boolean isTitleClickAction() {
        return this.isTitleClickAction;
    }

    public boolean isTitleClickSecondary() {
        return this.isTitleClickSecondary;
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

    public boolean isSecondaryEnabled() {
        return this.isSecondaryEnabled;
    }

    public void setSecondaryEnabled(boolean secondaryEnabled) {
        if (this.isSecondaryEnabled != secondaryEnabled) {
            this.isSecondaryEnabled = secondaryEnabled;
            this.pcs.firePropertyChange("secondaryEnabled", !this.isSecondaryEnabled,
                    this.isSecondaryEnabled);
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

    public CommandActionPreview getActionPreview() {
        return this.actionPreview;
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

    public CommandButtonProjection<Command> project() {
        return new CommandButtonProjection<>(this, CommandButtonPresentationModel.withDefaults());
    }

    public CommandButtonProjection<Command> project(
            CommandButtonPresentationModel commandPresentation) {
        return new CommandButtonProjection<>(this, commandPresentation);
    }

    public abstract static class BaseBuilder<T extends Command, B extends BaseBuilder> {
        protected String text;
        protected String extraText;
        protected ResizableIconFactory iconFactory;
        protected ResizableIconFactory disabledIconFactory;
        protected CommandAction action;
        protected CommandActionPreview actionPreview;
        protected RichTooltip actionRichTooltip;
        protected CommandMenuContentModel secondaryContentModel;
        protected RichTooltip secondaryRichTooltip;
        protected boolean isTitleClickAction;
        protected boolean isTitleClickSecondary;
        protected boolean isEnabled = true;
        protected boolean isActionEnabled = true;
        protected boolean isSecondaryEnabled = true;
        protected boolean isToggle;
        protected boolean isToggleSelected;
        protected CommandToggleGroupModel toggleGroupModel;
        protected boolean isAutoRepeatAction;
        protected boolean hasAutoRepeatIntervalsSet;
        protected int autoRepeatInitialInterval;
        protected int autoRepeatSubsequentInterval;
        protected boolean isFireActionOnRollover;
        protected boolean isFireActionOnPress;

        protected void configureBaseCommand(Command command) {
            command.text = this.text;
            command.iconFactory = this.iconFactory;
            command.disabledIconFactory = this.disabledIconFactory;
            command.extraText = this.extraText;
            command.action = this.action;
            command.actionRichTooltip = this.actionRichTooltip;
            command.secondaryContentModel = this.secondaryContentModel;
            command.secondaryRichTooltip = this.secondaryRichTooltip;
            command.isTitleClickAction = this.isTitleClickAction;
            command.isTitleClickSecondary = this.isTitleClickSecondary;
            command.isEnabled = this.isEnabled;
            command.isActionEnabled = this.isActionEnabled;
            command.isSecondaryEnabled = this.isSecondaryEnabled;
            command.isToggle = this.isToggle;
            command.isToggleSelected = this.isToggleSelected;
            command.toggleGroupModel = this.toggleGroupModel;
            command.isAutoRepeatAction = this.isAutoRepeatAction;
            command.hasAutoRepeatIntervalsSet = this.hasAutoRepeatIntervalsSet;
            command.autoRepeatInitialInterval = this.autoRepeatInitialInterval;
            command.autoRepeatSubsequentInterval = this.autoRepeatSubsequentInterval;
            command.isFireActionOnRollover = this.isFireActionOnRollover;
            command.isFireActionOnPress = this.isFireActionOnPress;
            command.actionPreview = this.actionPreview;

            // special handling for toggle group model
            if (command.toggleGroupModel != null) {
                command.toggleGroupModel.add(command);
            }
        }

        public B setText(String text) {
            this.text = text;
            return (B) this;
        }

        public B setIconFactory(ResizableIconFactory iconFactory) {
            this.iconFactory = iconFactory;
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

        public B setAction(CommandAction action) {
            this.action = action;
            return (B) this;
        }

        public B setActionRichTooltip(RichTooltip actionRichTooltip) {
            this.actionRichTooltip = actionRichTooltip;
            return (B) this;
        }

        public B setSecondaryContentModel(CommandMenuContentModel secondaryContentModel) {
            this.secondaryContentModel = secondaryContentModel;
            return (B) this;
        }

        public B setSecondaryRichTooltip(RichTooltip secondaryRichTooltip) {
            this.secondaryRichTooltip = secondaryRichTooltip;
            return (B) this;
        }

        public B setTitleClickAction() {
            this.isTitleClickAction = true;
            return (B) this;
        }

        public B setTitleClickSecondary() {
            this.isTitleClickSecondary = true;
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

        public B setSecondaryEnabled(boolean isSecondaryEnabled) {
            this.isSecondaryEnabled = isSecondaryEnabled;
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

        public B setActionPreview(CommandActionPreview actionPreview) {
            this.actionPreview = actionPreview;
            return (B) this;
        }
    }

    public static class Builder extends BaseBuilder<Command, Builder> {
        public Command build() {
            Command command = new Command();

            this.configureBaseCommand(command);

            command.checkConsistency();

            return command;
        }
    }
}
