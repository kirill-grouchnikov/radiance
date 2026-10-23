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
package org.pushingpixels.radiance.component.api.ribbon.synapse.model;

import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.component.api.common.model.ImmutablePresentationModel;
import org.pushingpixels.radiance.component.api.common.model.RichTooltipPresentationModel;
import org.pushingpixels.radiance.component.api.ribbon.synapse.projection.ComponentProjection;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

/**
 * Encapsulates presentation metadata for displaying arbitrary components in the ribbon.
 * Use a new instance of {@link Builder} to configure a new presentation, and
 * {@link Builder#build()} to build a presentation.
 *
 * @author Kirill Grouchnikov
 * @see ComponentProjection
 */
public class ComponentPresentationModel implements ImmutablePresentationModel {
    /**
     * Background appearance strategy.
     */
    private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy;
    /**
     * Horizontal alignment.
     */
    private HorizontalAlignment horizontalAlignment;
    /**
     * Keyboard shortcut tip.
     */
    private String keyTip;
    /**
     * Whether the component is resizing-aware.
     */
    private boolean isResizingAware;
    /**
     * Rich tooltip presentation model.
     */
    private RichTooltipPresentationModel richTooltipPresentationModel;

    /**
     * Constructs a {@code ComponentPresentationModel}.
     */
    private ComponentPresentationModel() {
    }

    /**
     * Returns a presentation model with default settings.
     *
     * @return The default presentation model.
     */
    public static ComponentPresentationModel withDefaults() {
        return ComponentPresentationModel.builder().build();
    }

    /**
     * Creates a new builder for {@link ComponentPresentationModel}.
     *
     * @return A new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Returns the background appearance strategy.
     *
     * @return The strategy.
     */
    public RadianceThemingSlices.BackgroundAppearanceStrategy getBackgroundAppearanceStrategy() {
        return this.backgroundAppearanceStrategy;
    }

    /**
     * Returns the horizontal alignment.
     *
     * @return The alignment.
     */
    public HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /**
     * Returns the keyboard shortcut tip.
     *
     * @return The key tip.
     */
    public String getKeyTip() {
        return this.keyTip;
    }

    /**
     * Returns whether the component is resizing-aware.
     *
     * @return {@code true} if resizing-aware.
     */
    public boolean isResizingAware() {
        return this.isResizingAware;
    }

    /**
     * Returns the rich tooltip presentation model.
     *
     * @return The rich tooltip presentation model.
     */
    public RichTooltipPresentationModel getRichTooltipPresentationModel() {
        return this.richTooltipPresentationModel;
    }

    /**
     * Builder for {@link ComponentPresentationModel}.
     */
    public static class Builder {
        /**
         * Background appearance strategy.
         */
        private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy =
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT;
        /**
         * Horizontal alignment.
         */
        private HorizontalAlignment horizontalAlignment = HorizontalAlignment.FILL;
        /**
         * Keyboard shortcut tip.
         */
        private String keyTip;
        /**
         * Whether the component is resizing-aware.
         */
        private boolean isResizingAware;
        /**
         * Rich tooltip presentation model.
         */
        private RichTooltipPresentationModel richTooltipPresentationModel =
                RichTooltipPresentationModel.builder().build();

        /**
         * Constructs a {@code Builder}.
         */
        public Builder() {
        }

        /**
         * Sets the background appearance strategy.
         *
         * @param backgroundAppearanceStrategy The strategy.
         * @return This builder.
         */
        public Builder setBackgroundAppearanceStrategy(
                RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {
            this.backgroundAppearanceStrategy = backgroundAppearanceStrategy;
            return this;
        }

        /**
         * Sets the horizontal alignment.
         *
         * @param horizontalAlignment The alignment.
         * @return This builder.
         */
        public Builder setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        /**
         * Sets the keyboard shortcut tip.
         *
         * @param keyTip The key tip.
         * @return This builder.
         */
        public Builder setKeyTip(String keyTip) {
            this.keyTip = keyTip;
            return this;
        }

        /**
         * Sets whether the component is resizing-aware.
         *
         * @param resizingAware {@code true} if resizing-aware.
         * @return This builder.
         */
        public Builder setResizingAware(boolean resizingAware) {
            this.isResizingAware = resizingAware;
            return this;
        }

        /**
         * Sets the rich tooltip presentation model.
         *
         * @param richTooltipPresentationModel The model (must not be null).
         * @return This builder.
         * @throws IllegalArgumentException if the model is null.
         */
        public Builder setRichTooltipPresentationModel(RichTooltipPresentationModel richTooltipPresentationModel) {
            if (richTooltipPresentationModel == null) {
                throw new IllegalArgumentException("Cannot pass null presentation model");
            }
            this.richTooltipPresentationModel = richTooltipPresentationModel;
            return this;
        }

        /**
         * Builds the {@link ComponentPresentationModel}.
         *
         * @return The built model.
         */
        public ComponentPresentationModel build() {
            ComponentPresentationModel componentPresentationModel = new ComponentPresentationModel();
            componentPresentationModel.horizontalAlignment = this.horizontalAlignment;
            componentPresentationModel.backgroundAppearanceStrategy = this.backgroundAppearanceStrategy;
            componentPresentationModel.keyTip = this.keyTip;
            componentPresentationModel.isResizingAware = this.isResizingAware;
            componentPresentationModel.richTooltipPresentationModel = this.richTooltipPresentationModel;
            return componentPresentationModel;
        }
    }
}
