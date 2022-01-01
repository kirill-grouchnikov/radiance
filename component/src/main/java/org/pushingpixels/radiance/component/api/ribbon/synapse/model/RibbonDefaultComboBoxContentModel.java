/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.ribbon.synapse.model;

import org.pushingpixels.radiance.component.api.common.RichTooltip;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;

import javax.swing.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class RibbonDefaultComboBoxContentModel<E> extends DefaultComboBoxModel<E>
        implements RibbonComboBoxContentModel<E> {
    private boolean isEnabled;
    private RadianceIcon.Factory iconFactory;
    private String caption;
    private RichTooltip richTooltip;
    private ComboBoxSelectionChangeListener selectionChangeListener;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    private RibbonDefaultComboBoxContentModel(E[] items) {
        super(items);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        this.pcs.addPropertyChangeListener(pcl);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        this.pcs.removePropertyChangeListener(pcl);
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
    public RadianceIcon.Factory getIconFactory() {
        return this.iconFactory;
    }

    @Override
    public String getCaption() {
        return this.caption;
    }

    @Override
    public ComboBoxSelectionChangeListener getSelectionChangeListener() {
        return this.selectionChangeListener;
    }

    @Override
    public RichTooltip getRichTooltip() {
        return this.richTooltip;
    }

    public static class Builder<E> {
        private boolean isEnabled = true;
        private E[] items;
        private RadianceIcon.Factory iconFactory;
        private String caption;
        private ComboBoxSelectionChangeListener selectionChangeListener;
        private RichTooltip richTooltip;

        public Builder<E> setItems(E[] items) {
            this.items = items;
            return this;
        }

        public Builder<E> setEnabled(boolean enabled) {
            this.isEnabled = enabled;
            return this;
        }

        public Builder<E> setIconFactory(RadianceIcon.Factory iconFactory) {
            this.iconFactory = iconFactory;
            return this;
        }

        public Builder<E> setCaption(String caption) {
            this.caption = caption;
            return this;
        }

        public Builder<E> setSelectionChangeListener(ComboBoxSelectionChangeListener selectionChangeListener) {
            this.selectionChangeListener = selectionChangeListener;
            return this;
        }

        public Builder<E> setRichTooltip(RichTooltip richTooltip) {
            this.richTooltip = richTooltip;
            return this;
        }

        public RibbonDefaultComboBoxContentModel<E> build() {
            RibbonDefaultComboBoxContentModel<E> model =
                    new RibbonDefaultComboBoxContentModel<>(this.items);
            model.isEnabled = this.isEnabled;
            model.iconFactory = this.iconFactory;
            model.caption = this.caption;
            if (this.selectionChangeListener != null) {
                // Wrap the original application-provided selection change listener
                model.selectionChangeListener = new ComboBoxSelectionChangeListener() {
                    private Object lastSelection = null;
                    @Override
                    public void onSelectionChanged(Object oldSelection, Object newSelection) {
                        if (lastSelection == newSelection) {
                            // de-dupe changes from multiple comboboxes created from this content model
                            return;
                        }
                        selectionChangeListener.onSelectionChanged(oldSelection, newSelection);
                        lastSelection = newSelection;
                    }
                };
            }
            model.richTooltip = this.richTooltip;
            return model;
        }
    }

}
