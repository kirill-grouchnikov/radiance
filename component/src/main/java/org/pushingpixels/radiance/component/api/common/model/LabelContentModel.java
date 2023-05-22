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
import org.pushingpixels.radiance.component.internal.utils.WeakPropertyChangeSupport;

import java.beans.PropertyChangeListener;

public class LabelContentModel implements ContentModel, PropertyChangeAware {
    private String text;
    private boolean isEnabled;
    private RadianceIcon.Factory iconFactory;

    private final WeakPropertyChangeSupport weakPropertyChangeSupport = new WeakPropertyChangeSupport(this);

    public static Builder builder() {
        return new Builder();
    }

    private LabelContentModel() {
        super();
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        this.weakPropertyChangeSupport.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        this.weakPropertyChangeSupport.removePropertyChangeListener(pcl);
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void setEnabled(boolean enabled) {
        if (this.isEnabled != enabled) {
            this.isEnabled = enabled;
            this.weakPropertyChangeSupport.firePropertyChange("enabled", !this.isEnabled, this.isEnabled);
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

    public static class Builder {
        private String text = "";
        private boolean isEnabled = true;
        private RadianceIcon.Factory iconFactory;

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setEnabled(boolean enabled) {
            this.isEnabled = enabled;
            return this;
        }

        public Builder setIconFactory(RadianceIcon.Factory iconFactory) {
            this.iconFactory = iconFactory;
            return this;
        }

        public LabelContentModel build() {
            LabelContentModel model = new LabelContentModel();
            model.text = this.text;
            model.isEnabled = this.isEnabled;
            model.iconFactory = this.iconFactory;
            return model;
        }
    }
}
