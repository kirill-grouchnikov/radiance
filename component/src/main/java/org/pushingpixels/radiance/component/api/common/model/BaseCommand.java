/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.CommandAction;
import org.pushingpixels.radiance.component.api.common.RichTooltip;
import org.pushingpixels.radiance.component.api.common.popup.JPopupPanel;
import org.pushingpixels.radiance.component.internal.utils.WeakChangeSupport;
import org.pushingpixels.radiance.component.internal.utils.WeakPropertyChangeSupport;

import javax.swing.event.ChangeListener;
import java.beans.PropertyChangeListener;
import java.util.EventListener;

/**
 * Base command model that provides the core functionality for commands in the Radiance component library.
 *
 * @param <MCM> The type of the menu content model.
 */
public abstract class BaseCommand<MCM extends BaseCommandMenuContentModel> implements ContentModel, ChangeAware, PropertyChangeAware {
    private String text;
    private String extraText;
    private RadianceIcon.Factory iconFactory;
    private CommandAction action;
    private CommandActionPreview actionPreview;
    private boolean isActionEnabled;
    private boolean isToggle;
    private boolean isToggleSelected;
    private RichTooltip actionRichTooltip;
    private MCM secondaryContentModel;
    private BaseCommand.SecondaryLifecycle secondaryLifecycle;
    private RichTooltip secondaryRichTooltip;
    private boolean isSecondaryEnabled;
    private CommandToggleGroupModel toggleGroupModel;
    private Object tag;

    /**
     * Listener interface for command preview events.
     */
    public interface CommandActionPreview extends EventListener {
        /**
         * Invoked when a command preview has been activated.
         *
         * @param command Command for which the preview has been activated.
         */
        void onCommandPreviewActivated(BaseCommand command);

        /**
         * Invoked when a command preview has been canceled.
         *
         * @param command Command for which the preview has been canceled.
         */
        void onCommandPreviewCanceled(BaseCommand command);
    }

    /**
     * Lifecycle callback interface for secondary content activation and deactivation.
     */
    public interface SecondaryLifecycle {
        /**
         * Called before the secondary content is activated.
         * @param popupPanel The popup panel being activated.
         */
        void onBeforeActivateSecondary(JPopupPanel popupPanel);

        /**
         * Called after the secondary content is activated.
         * @param popupPanel The popup panel that was activated.
         */
        void onAfterActivateSecondary(JPopupPanel popupPanel);

        /**
         * Called before the secondary content is deactivated.
         * @param popupPanel The popup panel being deactivated.
         */
        void onBeforeDeactivateSecondary(JPopupPanel popupPanel);

        /**
         * Called after the secondary content is deactivated.
         * @param popupPanel The popup panel that was deactivated.
         */
        void onAfterDeactivateSecondary(JPopupPanel popupPanel);
    }

    /**
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;
    private final WeakPropertyChangeSupport weakPropertyChangeSupport;

    /**
     * Constructs a new BaseCommand.
     */
    protected BaseCommand() {
        this.weakChangeSupport = new WeakChangeSupport(this);
        this.weakPropertyChangeSupport = new WeakPropertyChangeSupport(this);
    }

    /**
     * Checks the internal consistency of the command state.
     */
    protected void checkConsistency() {
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

        if (isToggleSelected && !isToggle) {
            throw new IllegalStateException(
                    "Command configured to not be a toggle but is selected");
        }
    }

    /**
     * Returns the text label of this command.
     * @return The text label.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Sets the text label of this command.
     * @param text The text label.
     */
    public void setText(String text) {
        if (!this.text.equals(text)) {
            String old = this.text;
            this.text = text;
            this.weakPropertyChangeSupport.firePropertyChange("text", old, this.text);
        }
    }

    /**
     * Returns the icon factory for this command.
     * @return The icon factory.
     */
    public RadianceIcon.Factory getIconFactory() {
        return this.iconFactory;
    }

    /**
     * Sets the icon factory for this command.
     * @param iconFactory The icon factory.
     */
    public void setIconFactory(RadianceIcon.Factory iconFactory) {
        if (this.iconFactory != iconFactory) {
            RadianceIcon.Factory old = this.iconFactory;
            this.iconFactory = iconFactory;
            this.weakPropertyChangeSupport.firePropertyChange("iconFactory", old, this.iconFactory);
        }
    }

    /**
     * Returns the extra text (subtitle) for this command.
     * @return The extra text.
     */
    public String getExtraText() {
        return this.extraText;
    }

    /**
     * Sets the extra text (subtitle) for this command.
     * @param extraText The extra text.
     */
    public void setExtraText(String extraText) {
        String old = this.extraText;
        this.extraText = extraText;
        this.weakPropertyChangeSupport.firePropertyChange("extraText", old, this.extraText);
    }

    /**
     * Returns the action handler for this command.
     * @return The action handler.
     */
    public CommandAction getAction() {
        return this.action;
    }

    /**
     * Sets the action handler for this command.
     * @param actionListener The action handler.
     */
    public void setAction(CommandAction actionListener) {
        CommandAction old = this.action;
        this.action = actionListener;
        this.weakPropertyChangeSupport.firePropertyChange("action", old, this.action);
    }

    /**
     * Returns the rich tooltip for the primary action.
     * @return The rich tooltip.
     */
    public RichTooltip getActionRichTooltip() {
        return this.actionRichTooltip;
    }

    /**
     * Sets the rich tooltip for the primary action.
     * @param actionRichTooltip The rich tooltip.
     */
    public void setActionRichTooltip(RichTooltip actionRichTooltip) {
        if (this.actionRichTooltip != actionRichTooltip) {
            RichTooltip old = this.actionRichTooltip;
            this.actionRichTooltip = actionRichTooltip;
            this.weakPropertyChangeSupport.firePropertyChange("actionRichTooltip", old, this.actionRichTooltip);
        }
    }

    /**
     * Returns whether this command has secondary content.
     * @return {@code true} if secondary content is present and non-empty.
     */
    public boolean hasSecondaryContent() {
        return (this.getSecondaryContentModel() != null) &&
                !this.getSecondaryContentModel().isEmpty();
    }

    /**
     * Returns the secondary content model.
     * @return The secondary content model.
     */
    public MCM getSecondaryContentModel() {
        return this.secondaryContentModel;
    }

    /**
     * Returns the secondary lifecycle callback.
     * @return The secondary lifecycle callback.
     */
    public SecondaryLifecycle getSecondaryLifecycle() {
        return this.secondaryLifecycle;
    }

    /**
     * Returns the rich tooltip for the secondary content.
     * @return The rich tooltip.
     */
    public RichTooltip getSecondaryRichTooltip() {
        return this.secondaryRichTooltip;
    }

    /**
     * Sets the rich tooltip for the secondary content.
     * @param secondaryRichTooltip The rich tooltip.
     */
    public void setSecondaryRichTooltip(RichTooltip secondaryRichTooltip) {
        if (this.secondaryRichTooltip != secondaryRichTooltip) {
            RichTooltip old = this.secondaryRichTooltip;
            this.secondaryRichTooltip = secondaryRichTooltip;
            this.weakPropertyChangeSupport.firePropertyChange("secondaryRichTooltip", old, this.secondaryRichTooltip);
        }
    }

    /**
     * Returns whether the primary action is enabled.
     * @return {@code true} if the action is enabled.
     */
    public boolean isActionEnabled() {
        return this.isActionEnabled;
    }

    /**
     * Sets whether the primary action is enabled.
     * @param actionEnabled {@code true} to enable the action.
     */
    public void setActionEnabled(boolean actionEnabled) {
        if (this.isActionEnabled != actionEnabled) {
            this.isActionEnabled = actionEnabled;
            this.weakPropertyChangeSupport.firePropertyChange("actionEnabled", !this.isActionEnabled,
                    this.isActionEnabled);
        }
    }

    /**
     * Returns whether the secondary content is enabled.
     * @return {@code true} if the secondary content is enabled.
     */
    public boolean isSecondaryEnabled() {
        return this.isSecondaryEnabled;
    }

    /**
     * Sets whether the secondary content is enabled.
     * @param secondaryEnabled {@code true} to enable the secondary content.
     */
    public void setSecondaryEnabled(boolean secondaryEnabled) {
        if (this.isSecondaryEnabled != secondaryEnabled) {
            this.isSecondaryEnabled = secondaryEnabled;
            this.weakPropertyChangeSupport.firePropertyChange("secondaryEnabled", !this.isSecondaryEnabled,
                    this.isSecondaryEnabled);
        }
    }

    /**
     * Returns whether this command is a toggle command.
     * @return {@code true} if this is a toggle command.
     */
    public boolean isToggle() {
        return this.isToggle;
    }

    /**
     * Returns whether this toggle command is currently selected.
     * @return {@code true} if selected.
     */
    public boolean isToggleSelected() {
        return this.isToggleSelected;
    }

    /**
     * Sets whether this toggle command is selected.
     * @param isToggleSelected {@code true} to select the toggle.
     */
    public void setToggleSelected(boolean isToggleSelected) {
        if (!this.isToggle) {
            throw new IllegalArgumentException("This command is not toggle");
        }
        if (this.isToggleSelected != isToggleSelected) {
            this.isToggleSelected = isToggleSelected;
            this.weakPropertyChangeSupport.firePropertyChange("isToggleSelected", !this.isToggleSelected,
                    this.isToggleSelected);
            this.fireStateChanged();
        }
    }

    /**
     * Returns the toggle group model, if this command belongs to a toggle group.
     * @return The toggle group model.
     */
    public CommandToggleGroupModel getToggleGroupModel() {
        return this.toggleGroupModel;
    }

    /**
     * Returns the action preview listener.
     * @return The action preview listener.
     */
    public CommandActionPreview getActionPreview() {
        return this.actionPreview;
    }

    /**
     * Sets the action preview listener.
     * @param actionPreview The action preview listener.
     */
    public void setActionPreview(CommandActionPreview actionPreview) {
        CommandActionPreview old = this.actionPreview;
        this.actionPreview = actionPreview;
        this.weakPropertyChangeSupport.firePropertyChange("actionPreview", old, this.actionPreview);
    }

    /**
     * Returns the arbitrary tag object associated with this command.
     * @return The tag object.
     */
    public Object getTag() {
        return this.tag;
    }

    /**
     * Sets an arbitrary tag object associated with this command.
     * @param tag The tag object.
     */
    public void setTag(Object tag) {
        this.tag = tag;
    }

    @Override
    public void addChangeListener(ChangeListener l) {
        this.weakChangeSupport.addChangeListener(l);
    }

    @Override
    public void removeChangeListener(ChangeListener l) {
        this.weakChangeSupport.removeChangeListener(l);
    }

    private void fireStateChanged() {
        this.weakChangeSupport.fireStateChanged();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener l) {
        this.weakPropertyChangeSupport.addPropertyChangeListener(l);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener l) {
        this.weakPropertyChangeSupport.removePropertyChangeListener(l);
    }

    /**
     * Abstract builder for constructing BaseCommand instances.
     *
     * @param <T>   The type of the BaseCommand being built.
     * @param <MCM> The type of the menu content model.
     * @param <B>   The self-referential builder type.
     */
    public abstract static class BaseBuilder<T extends BaseCommand<MCM>,
            MCM extends BaseCommandMenuContentModel, B extends BaseBuilder<T, MCM, B>> {
        /** The text label. */
        protected String text;
        /** The extra text (subtitle). */
        protected String extraText;
        /** The icon factory. */
        protected RadianceIcon.Factory iconFactory;
        /** The action handler. */
        protected CommandAction action;
        /** The action preview listener. */
        protected CommandActionPreview actionPreview;
        /** The rich tooltip for the primary action. */
        protected RichTooltip actionRichTooltip;
        /** The secondary content model. */
        protected MCM secondaryContentModel;
        /** The secondary lifecycle callback. */
        protected SecondaryLifecycle secondaryLifecycle;
        /** The rich tooltip for the secondary content. */
        protected RichTooltip secondaryRichTooltip;
        /** Whether the primary action is enabled. */
        protected boolean isActionEnabled = true;
        /** Whether the secondary content is enabled. */
        protected boolean isSecondaryEnabled = true;
        /** Whether this is a toggle command. */
        protected boolean isToggle;
        /** Whether this toggle command is selected. */
        protected boolean isToggleSelected;
        /** The toggle group model. */
        protected CommandToggleGroupModel toggleGroupModel;
        /** An arbitrary tag object. */
        protected Object tag;

        /**
         * Constructs a {@code BaseBuilder}.
         */
        protected BaseBuilder() {
        }

        /**
         * Applies the builder configuration to the given command.
         * @param command The command to configure.
         */
        protected void configureBaseCommand(BaseCommand<MCM> command) {
            command.text = this.text;
            command.iconFactory = this.iconFactory;
            command.extraText = this.extraText;
            command.action = this.action;
            command.actionRichTooltip = this.actionRichTooltip;
            command.secondaryContentModel = this.secondaryContentModel;
            command.secondaryLifecycle = this.secondaryLifecycle;
            command.secondaryRichTooltip = this.secondaryRichTooltip;
            command.isActionEnabled = this.isActionEnabled;
            command.isSecondaryEnabled = this.isSecondaryEnabled;
            command.isToggle = this.isToggle;
            command.isToggleSelected = this.isToggleSelected;
            command.toggleGroupModel = this.toggleGroupModel;
            command.actionPreview = this.actionPreview;

            // special handling for toggle group model
            if (command.toggleGroupModel != null) {
                command.toggleGroupModel.add(command);
            }

            command.tag = this.tag;
        }

        /**
         * Builds and returns the configured command instance.
         * @return The built command.
         */
        public abstract T build();

        /**
         * Sets the text label.
         * @param text The text label.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setText(String text) {
            this.text = text;
            return (B) this;
        }

        /**
         * Sets the icon factory.
         * @param iconFactory The icon factory.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setIconFactory(RadianceIcon.Factory iconFactory) {
            this.iconFactory = iconFactory;
            return (B) this;
        }

        /**
         * Sets the extra text (subtitle).
         * @param extraText The extra text.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setExtraText(String extraText) {
            this.extraText = extraText;
            return (B) this;
        }

        /**
         * Sets the action handler.
         * @param action The action handler.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setAction(CommandAction action) {
            this.action = action;
            return (B) this;
        }

        /**
         * Sets the rich tooltip for the primary action.
         * @param actionRichTooltip The rich tooltip.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setActionRichTooltip(RichTooltip actionRichTooltip) {
            this.actionRichTooltip = actionRichTooltip;
            return (B) this;
        }

        /**
         * Sets the secondary content model.
         * @param secondaryContentModel The secondary content model.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setSecondaryContentModel(MCM secondaryContentModel) {
            this.secondaryContentModel = secondaryContentModel;
            return (B) this;
        }

        /**
         * Sets the secondary lifecycle callback.
         * @param secondaryLifecycle The secondary lifecycle callback.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setSecondaryLifecycle(SecondaryLifecycle secondaryLifecycle) {
            this.secondaryLifecycle = secondaryLifecycle;
            return (B) this;
        }

        /**
         * Sets the rich tooltip for the secondary content.
         * @param secondaryRichTooltip The rich tooltip.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setSecondaryRichTooltip(RichTooltip secondaryRichTooltip) {
            this.secondaryRichTooltip = secondaryRichTooltip;
            return (B) this;
        }

        /**
         * Sets whether the primary action is enabled.
         * @param isActionEnabled {@code true} to enable the action.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setActionEnabled(boolean isActionEnabled) {
            this.isActionEnabled = isActionEnabled;
            return (B) this;
        }

        /**
         * Sets whether the secondary content is enabled.
         * @param isSecondaryEnabled {@code true} to enable the secondary content.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setSecondaryEnabled(boolean isSecondaryEnabled) {
            this.isSecondaryEnabled = isSecondaryEnabled;
            return (B) this;
        }

        /**
         * Configures this command as a toggle.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setToggle() {
            this.isToggle = true;
            return (B) this;
        }

        /**
         * Configures this command as a toggle with the given selected state.
         * @param toggleSelected {@code true} if the toggle should be selected.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setToggleSelected(boolean toggleSelected) {
            this.isToggle = true;
            this.isToggleSelected = toggleSelected;
            return (B) this;
        }

        /**
         * Adds this command to the given toggle group.
         * @param toggleGroup The toggle group.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B inToggleGroup(CommandToggleGroupModel toggleGroup) {
            this.isToggle = true;
            this.toggleGroupModel = toggleGroup;
            return (B) this;
        }

        /**
         * Adds this command to the given toggle group as the selected item.
         * @param toggleGroup The toggle group.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B inToggleGroupAsSelected(CommandToggleGroupModel toggleGroup) {
            this.isToggle = true;
            this.isToggleSelected = true;
            this.toggleGroupModel = toggleGroup;
            return (B) this;
        }

        /**
         * Sets the action preview listener.
         * @param actionPreview The action preview listener.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setActionPreview(CommandActionPreview actionPreview) {
            this.actionPreview = actionPreview;
            return (B) this;
        }

        /**
         * Sets an arbitrary tag object.
         * @param tag The tag object.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setTag(Object tag) {
            this.tag = tag;
            return (B) this;
        }
    }
}

