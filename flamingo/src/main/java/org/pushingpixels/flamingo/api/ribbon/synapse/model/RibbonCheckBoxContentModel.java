/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.api.ribbon.synapse.model;

import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.neon.api.icon.ResizableIcon;

import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class RibbonCheckBoxContentModel implements ComponentContentModel {
    private boolean isEnabled;
    private ResizableIcon.Factory iconFactory;
    private String caption;
    private RichTooltip richTooltip;
    private ActionListener actionListener;

    private String text;
    private boolean isSelected;
    
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public static Builder builder() {
        return new Builder();
    }

    private RibbonCheckBoxContentModel() {
        super();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        this.pcs.addPropertyChangeListener(pcl);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        this.pcs.removePropertyChangeListener(pcl);
    }

    public String getText() {
        return this.text;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean selected) {
        if (this.isSelected != selected) {
            this.isSelected = selected;
            this.pcs.firePropertyChange("selected", !this.isSelected, this.isSelected);
        }
    }

    @Override
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        if (this.isEnabled != enabled) {
            this.isEnabled = enabled;
            this.pcs.firePropertyChange("enabled", !this.isEnabled, this.isEnabled);
        }
    }

    @Override
    public ResizableIcon.Factory getIconFactory() {
        return this.iconFactory;
    }

    @Override
    public String getCaption() {
        return this.caption;
    }

    @Override
    public RichTooltip getRichTooltip() {
        return this.richTooltip;
    }

    public ActionListener getActionListener() {
        return this.actionListener;
    }

    public static class Builder {
        private boolean isEnabled = true;
        private ResizableIcon.Factory iconFactory;
        private String caption;
        private RichTooltip richTooltip;
        private String text;
        private boolean isSelected;
        private ActionListener actionListener;

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setSelected(boolean selected) {
            this.isSelected = selected;
            return this;
        }

        public Builder setEnabled(boolean enabled) {
            this.isEnabled = enabled;
            return this;
        }

        public Builder setIconFactory(ResizableIcon.Factory iconFactory) {
            this.iconFactory = iconFactory;
            return this;
        }

        public Builder setCaption(String caption) {
            this.caption = caption;
            return this;
        }

        public Builder setRichTooltip(RichTooltip richTooltip) {
            this.richTooltip = richTooltip;
            return this;
        }

        public Builder setActionListener(ActionListener actionListener) {
            this.actionListener = actionListener;
            return this;
        }

        public RibbonCheckBoxContentModel build() {
            RibbonCheckBoxContentModel model = new RibbonCheckBoxContentModel();
            model.text = this.text;
            model.isSelected = this.isSelected;
            model.actionListener = this.actionListener;
            model.isEnabled = this.isEnabled;
            model.iconFactory = this.iconFactory;
            model.caption = this.caption;
            model.richTooltip = this.richTooltip;
            return model;
        }
    }

}
