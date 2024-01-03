/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
    private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy;
    private HorizontalAlignment horizontalAlignment;
    private String keyTip;
    private boolean isResizingAware;
    private RichTooltipPresentationModel richTooltipPresentationModel;

    private ComponentPresentationModel() {
    }

    public static ComponentPresentationModel withDefaults() {
        return ComponentPresentationModel.builder().build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public RadianceThemingSlices.BackgroundAppearanceStrategy getBackgroundAppearanceStrategy() {
        return this.backgroundAppearanceStrategy;
    }

    public HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public String getKeyTip() {
        return this.keyTip;
    }

    public boolean isResizingAware() {
        return this.isResizingAware;
    }

    public RichTooltipPresentationModel getRichTooltipPresentationModel() {
        return this.richTooltipPresentationModel;
    }

    public static class Builder {
        private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy =
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT;
        private HorizontalAlignment horizontalAlignment = HorizontalAlignment.FILL;
        private String keyTip;
        private boolean isResizingAware;
        private RichTooltipPresentationModel richTooltipPresentationModel =
                RichTooltipPresentationModel.builder().build();

        public Builder setBackgroundAppearanceStrategy(
                RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {
            this.backgroundAppearanceStrategy = backgroundAppearanceStrategy;
            return this;
        }

        public Builder setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        public Builder setKeyTip(String keyTip) {
            this.keyTip = keyTip;
            return this;
        }

        public Builder setResizingAware(boolean resizingAware) {
            this.isResizingAware = resizingAware;
            return this;
        }

        public Builder setRichTooltipPresentationModel(RichTooltipPresentationModel richTooltipPresentationModel) {
            if (richTooltipPresentationModel == null) {
                throw new IllegalArgumentException("Cannot pass null presentation model");
            }
            this.richTooltipPresentationModel = richTooltipPresentationModel;
            return this;
        }

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
