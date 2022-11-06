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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.common.api.model.TriStateButtonModel.SelectionState;
import org.pushingpixels.radiance.common.api.model.TriStateSelectionChangeEvent;
import org.pushingpixels.radiance.common.api.model.TriStateSelectionChangeListener;
import org.pushingpixels.radiance.common.api.model.TriStateSelectionCycler;
import org.pushingpixels.radiance.component.api.common.RichTooltip;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TriStateCheckBoxContentModel implements ContentModel {
    public static TriStateSelectionCycler DEFAULT_CYCLER = currState -> {
        switch (currState) {
            case ON:
                return SelectionState.OFF;
            case INDETERMINATE:
                return SelectionState.ON;
            case OFF:
            default:
                return SelectionState.INDETERMINATE;
        }
    };

    public static TriStateSelectionCycler ALTERNATIVE_CYCLER = currState -> {
        switch (currState) {
            case ON:
                return SelectionState.INDETERMINATE;
            case INDETERMINATE:
                return SelectionState.OFF;
            case OFF:
            default:
                return SelectionState.ON;
        }
    };

    private boolean isEnabled;
    private RichTooltip richTooltip;
    private TriStateSelectionCycler selectionCycler;
    private TriStateSelectionChangeListener selectionChangeListener;

    private String text;
    private SelectionState selectionState;

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public static Builder builder() {
        return new Builder();
    }

    private TriStateCheckBoxContentModel() {
        super();
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        this.pcs.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        this.pcs.removePropertyChangeListener(pcl);
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        if (!this.text.equals(text)) {
            String old = this.text;
            this.text = text;
            this.pcs.firePropertyChange("text", old, this.text);
        }
    }

    public SelectionState getSelectionState() {
        return this.selectionState;
    }

    public void setSelectionState(SelectionState selectionState) {
        if (this.selectionState != selectionState) {
            SelectionState oldState = this.selectionState;
            this.selectionState = selectionState;
            this.pcs.firePropertyChange("selectionState", oldState, this.selectionState);
        }
    }

    public TriStateSelectionCycler getSelectionCycler() {
        return this.selectionCycler;
    }

    public void setSelectionCycler(TriStateSelectionCycler selectionCycler) {
        if (selectionCycler == null) {
            throw new IllegalArgumentException("Cannot pass null cycler");
        }
        if (this.selectionCycler != selectionCycler) {
            TriStateSelectionCycler oldSelectionCycler = this.selectionCycler;
            this.selectionCycler = selectionCycler;
            this.pcs.firePropertyChange("selectionCycler", oldSelectionCycler, this.selectionCycler);
        }
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

    public RichTooltip getRichTooltip() {
        return this.richTooltip;
    }

    public TriStateSelectionChangeListener getSelectionChangeListener() {
        return this.selectionChangeListener;
    }

    public static class Builder {
        private boolean isEnabled = true;
        private RichTooltip richTooltip;
        private String text;
        private SelectionState selectionState;
        private TriStateSelectionCycler selectionCycler = DEFAULT_CYCLER;
        private TriStateSelectionChangeListener selectionChangeListener;

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setSelectionState(SelectionState selectionState) {
            this.selectionState = selectionState;
            return this;
        }

        public Builder setEnabled(boolean enabled) {
            this.isEnabled = enabled;
            return this;
        }

        public Builder setRichTooltip(RichTooltip richTooltip) {
            this.richTooltip = richTooltip;
            return this;
        }

        public void setSelectionCycler(TriStateSelectionCycler selectionCycler) {
            if (selectionCycler == null) {
                throw new IllegalArgumentException("Cannot pass null cycler");
            }
            this.selectionCycler = selectionCycler;
        }

        public Builder setSelectionChangeListener(TriStateSelectionChangeListener selectionChangeListener) {
            this.selectionChangeListener = selectionChangeListener;
            return this;
        }

        public TriStateCheckBoxContentModel build() {
            TriStateCheckBoxContentModel model = new TriStateCheckBoxContentModel();
            model.text = this.text;
            model.selectionState = this.selectionState;
            if (this.selectionChangeListener != null) {
                // Wrap the original application-provided item listener
                model.selectionChangeListener = new TriStateSelectionChangeListener() {
                    private SelectionState lastSelectionState = selectionState;

                    @Override
                    public void itemTriStateSelectionChanged(TriStateSelectionChangeEvent e) {
                        SelectionState newState = e.getSelectionStateChange();
                        if (lastSelectionState == newState) {
                            // de-dupe changes from multiple checkboxes created from this
                            // content model
                            return;
                        }
                        selectionChangeListener.itemTriStateSelectionChanged(e);
                        lastSelectionState = newState;
                    }
                };
            }
            model.selectionCycler = this.selectionCycler;
            model.isEnabled = this.isEnabled;
            model.richTooltip = this.richTooltip;
            return model;
        }
    }
}
