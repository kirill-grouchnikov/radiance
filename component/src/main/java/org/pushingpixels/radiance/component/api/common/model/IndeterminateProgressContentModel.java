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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Content model for an indeterminate progress indicator.
 */
public class IndeterminateProgressContentModel implements ContentModel {
    /**
     * Whether the progress indicator is enabled.
     */
    private boolean isEnabled;

    /**
     * Property change support.
     */
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    /**
     * Creates a new builder for {@link IndeterminateProgressContentModel}.
     *
     * @return A new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Constructs an {@code IndeterminateProgressContentModel}.
     */
    private IndeterminateProgressContentModel() {
        super();
    }

    /**
     * Adds a property change listener.
     *
     * @param pcl The listener.
     */
    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        this.pcs.addPropertyChangeListener(pcl);
    }

    /**
     * Removes a property change listener.
     *
     * @param pcl The listener.
     */
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        this.pcs.removePropertyChangeListener(pcl);
    }

    /**
     * Returns whether the progress indicator is enabled.
     *
     * @return {@code true} if enabled.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Sets whether the progress indicator is enabled.
     *
     * @param enabled {@code true} to enable.
     */
    public void setEnabled(boolean enabled) {
        if (this.isEnabled != enabled) {
            this.isEnabled = enabled;
            this.pcs.firePropertyChange("enabled", !this.isEnabled, this.isEnabled);
        }
    }

    /**
     * Builder for {@link IndeterminateProgressContentModel}.
     */
    public static class Builder {
        /**
         * Whether the progress indicator is enabled.
         */
        private boolean isEnabled = true;

        /**
         * Constructs a {@code Builder}.
         */
        public Builder() {
        }

        /**
         * Sets whether the progress indicator is enabled.
         *
         * @param enabled {@code true} to enable.
         * @return This builder.
         */
        public Builder setEnabled(boolean enabled) {
            this.isEnabled = enabled;
            return this;
        }

        /**
         * Builds the {@link IndeterminateProgressContentModel}.
         *
         * @return The built model.
         */
        public IndeterminateProgressContentModel build() {
            IndeterminateProgressContentModel model = new IndeterminateProgressContentModel();
            model.isEnabled = this.isEnabled;
            return model;
        }
    }
}
