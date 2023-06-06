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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.CommandAction;
import org.pushingpixels.radiance.component.api.common.RichTooltip;
import org.pushingpixels.radiance.component.internal.utils.WeakChangeSupport;
import org.pushingpixels.radiance.component.internal.utils.WeakPropertyChangeSupport;

import javax.swing.event.ChangeListener;
import java.beans.PropertyChangeListener;
import java.util.EventListener;

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
    private RichTooltip secondaryRichTooltip;
    private boolean isSecondaryEnabled;
    private CommandToggleGroupModel toggleGroupModel;
    private Object tag;

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
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;
    private final WeakPropertyChangeSupport weakPropertyChangeSupport;

    protected BaseCommand() {
        this.weakChangeSupport = new WeakChangeSupport(this);
        this.weakPropertyChangeSupport = new WeakPropertyChangeSupport(this);
    }

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

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        if (!this.text.equals(text)) {
            String old = this.text;
            this.text = text;
            this.weakPropertyChangeSupport.firePropertyChange("text", old, this.text);
        }
    }

    public RadianceIcon.Factory getIconFactory() {
        return this.iconFactory;
    }

    public void setIconFactory(RadianceIcon.Factory iconFactory) {
        if (this.iconFactory != iconFactory) {
            RadianceIcon.Factory old = this.iconFactory;
            this.iconFactory = iconFactory;
            this.weakPropertyChangeSupport.firePropertyChange("iconFactory", old, this.iconFactory);
        }
    }

    public String getExtraText() {
        return this.extraText;
    }

    public void setExtraText(String extraText) {
        String old = this.extraText;
        this.extraText = extraText;
        this.weakPropertyChangeSupport.firePropertyChange("extraText", old, this.extraText);
    }

    public CommandAction getAction() {
        return this.action;
    }

    public void setAction(CommandAction actionListener) {
        CommandAction old = this.action;
        this.action = actionListener;
        this.weakPropertyChangeSupport.firePropertyChange("action", old, this.action);
    }

    public RichTooltip getActionRichTooltip() {
        return this.actionRichTooltip;
    }

    public void setActionRichTooltip(RichTooltip actionRichTooltip) {
        if (this.actionRichTooltip != actionRichTooltip) {
            RichTooltip old = this.actionRichTooltip;
            this.actionRichTooltip = actionRichTooltip;
            this.weakPropertyChangeSupport.firePropertyChange("actionRichTooltip", old, this.actionRichTooltip);
        }
    }

    public boolean hasSecondaryContent() {
        return (this.getSecondaryContentModel() != null) &&
                !this.getSecondaryContentModel().isEmpty();
    }

    public MCM getSecondaryContentModel() {
        return this.secondaryContentModel;
    }

    public RichTooltip getSecondaryRichTooltip() {
        return this.secondaryRichTooltip;
    }

    public void setSecondaryRichTooltip(RichTooltip secondaryRichTooltip) {
        if (this.secondaryRichTooltip != secondaryRichTooltip) {
            RichTooltip old = this.secondaryRichTooltip;
            this.secondaryRichTooltip = secondaryRichTooltip;
            this.weakPropertyChangeSupport.firePropertyChange("secondaryRichTooltip", old, this.secondaryRichTooltip);
        }
    }

    public boolean isActionEnabled() {
        return this.isActionEnabled;
    }

    public void setActionEnabled(boolean actionEnabled) {
        if (this.isActionEnabled != actionEnabled) {
            this.isActionEnabled = actionEnabled;
            this.weakPropertyChangeSupport.firePropertyChange("actionEnabled", !this.isActionEnabled,
                    this.isActionEnabled);
        }
    }

    public boolean isSecondaryEnabled() {
        return this.isSecondaryEnabled;
    }

    public void setSecondaryEnabled(boolean secondaryEnabled) {
        if (this.isSecondaryEnabled != secondaryEnabled) {
            this.isSecondaryEnabled = secondaryEnabled;
            this.weakPropertyChangeSupport.firePropertyChange("secondaryEnabled", !this.isSecondaryEnabled,
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

    public CommandToggleGroupModel getToggleGroupModel() {
        return this.toggleGroupModel;
    }

    public CommandActionPreview getActionPreview() {
        return this.actionPreview;
    }

    public void setActionPreview(CommandActionPreview actionPreview) {
        CommandActionPreview old = this.actionPreview;
        this.actionPreview = actionPreview;
        this.weakPropertyChangeSupport.firePropertyChange("actionPreview", old, this.actionPreview);
    }

    public Object getTag() {
        return this.tag;
    }

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

    public abstract static class BaseBuilder<T extends BaseCommand<MCM>,
            MCM extends BaseCommandMenuContentModel, B extends BaseBuilder<T, MCM, B>> {
        protected String text;
        protected String extraText;
        protected RadianceIcon.Factory iconFactory;
        protected CommandAction action;
        protected CommandActionPreview actionPreview;
        protected RichTooltip actionRichTooltip;
        protected MCM secondaryContentModel;
        protected RichTooltip secondaryRichTooltip;
        protected boolean isActionEnabled = true;
        protected boolean isSecondaryEnabled = true;
        protected boolean isToggle;
        protected boolean isToggleSelected;
        protected CommandToggleGroupModel toggleGroupModel;
        protected Object tag;

        protected void configureBaseCommand(BaseCommand<MCM> command) {
            command.text = this.text;
            command.iconFactory = this.iconFactory;
            command.extraText = this.extraText;
            command.action = this.action;
            command.actionRichTooltip = this.actionRichTooltip;
            command.secondaryContentModel = this.secondaryContentModel;
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

        public abstract T build();

        @SuppressWarnings("unchecked")
        public B setText(String text) {
            this.text = text;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setIconFactory(RadianceIcon.Factory iconFactory) {
            this.iconFactory = iconFactory;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setExtraText(String extraText) {
            this.extraText = extraText;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setAction(CommandAction action) {
            this.action = action;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setActionRichTooltip(RichTooltip actionRichTooltip) {
            this.actionRichTooltip = actionRichTooltip;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setSecondaryContentModel(MCM secondaryContentModel) {
            this.secondaryContentModel = secondaryContentModel;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setSecondaryRichTooltip(RichTooltip secondaryRichTooltip) {
            this.secondaryRichTooltip = secondaryRichTooltip;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setActionEnabled(boolean isActionEnabled) {
            this.isActionEnabled = isActionEnabled;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setSecondaryEnabled(boolean isSecondaryEnabled) {
            this.isSecondaryEnabled = isSecondaryEnabled;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setToggle() {
            this.isToggle = true;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setToggleSelected(boolean toggleSelected) {
            this.isToggle = true;
            this.isToggleSelected = toggleSelected;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B inToggleGroup(CommandToggleGroupModel toggleGroup) {
            this.isToggle = true;
            this.toggleGroupModel = toggleGroup;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B inToggleGroupAsSelected(CommandToggleGroupModel toggleGroup) {
            this.isToggle = true;
            this.isToggleSelected = true;
            this.toggleGroupModel = toggleGroup;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setActionPreview(CommandActionPreview actionPreview) {
            this.actionPreview = actionPreview;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setTag(Object tag) {
            this.tag = tag;
            return (B) this;
        }
    }
}

