/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import javax.swing.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Date;

public class RibbonSpinnerDateContentModel extends SpinnerDateModel
        implements RibbonSpinnerContentModel {
    private boolean isEnabled;
    private ResizableIcon.Factory iconFactory;
    private String caption;
    private SpinnerSelectionChangeListener selectionChangeListener;
    private RichTooltip richTooltip;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public static Builder builder() {
        return new Builder();
    }

    public RibbonSpinnerDateContentModel() {
    }

    public RibbonSpinnerDateContentModel(Date value, Comparable<Date> start, Comparable<Date> end,
            int calendarField) {
        super(value, start, end, calendarField);
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
        return isEnabled;
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
    public SpinnerSelectionChangeListener getSelectionChangeListener() {
        return this.selectionChangeListener;
    }

    @Override
    public RichTooltip getRichTooltip() {
        return this.richTooltip;
    }

    public static class Builder {
        private boolean isEnabled = true;
        private Date value;
        private Comparable<Date> start;
        private Comparable<Date> end;
        private int calendarField;
        private ResizableIcon.Factory iconFactory;
        private String caption;
        private RibbonSpinnerContentModel.SpinnerSelectionChangeListener selectionChangeListener;
        private RichTooltip richTooltip;

        public Builder setValues(Date value, Comparable<Date> start, Comparable<Date> end, int calendarField) {
            this.value = value;
            this.start = start;
            this.end = end;
            this.calendarField = calendarField;
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

        public Builder setSelectionChangeListener(SpinnerSelectionChangeListener selectionChangeListener) {
            this.selectionChangeListener = selectionChangeListener;
            return this;
        }

        public Builder setRichTooltip(RichTooltip richTooltip) {
            this.richTooltip = richTooltip;
            return this;
        }

        public RibbonSpinnerDateContentModel build() {
            RibbonSpinnerDateContentModel model = (this.value == null)
                    ? new RibbonSpinnerDateContentModel()
                    : new RibbonSpinnerDateContentModel(this.value, this.start, this.end, this.calendarField);
            model.isEnabled = this.isEnabled;
            model.iconFactory = this.iconFactory;
            model.caption = this.caption;
            if (this.selectionChangeListener != null) {
                // Wrap the original application-provided selection change listener
                model.selectionChangeListener = new SpinnerSelectionChangeListener() {
                    private Object lastSelection = null;
                    @Override
                    public void onSelectionChanged(Object oldSelection, Object newSelection) {
                        if (lastSelection == newSelection) {
                            // de-dupe changes from multiple spinners created from this content model
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
