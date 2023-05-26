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

import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import java.awt.*;

public class LabelPresentationModel implements ImmutablePresentationModel {
    public static final Insets DEFAULT_LABEL_CONTENT_PADDING = new Insets(4, 5, 4, 5);
    public static final int DEFAULT_LABEL_ICON_SIZE = 16;
    public static final int DEFAULT_ICON_TEXT_GAP = 4;

    private Insets contentPadding;
    private Dimension iconDimension;
    private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy;
    private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy;
    private Font font;
    private HorizontalAlignment horizontalAlignment;
    private int iconTextGap;
    private float horizontalGapScaleFactor;
    private String singleLineDisplayPrototype;

    private LabelPresentationModel() {
    }

    public Insets getContentPadding() {
        return this.contentPadding;
    }

    public Dimension getIconDimension() {
        return this.iconDimension;
    }

    public RadianceThemingSlices.IconFilterStrategy getEnabledIconFilterStrategy() {
        return this.enabledIconFilterStrategy;
    }

    public RadianceThemingSlices.IconFilterStrategy getDisabledIconFilterStrategy() {
        return this.disabledIconFilterStrategy;
    }

    public Font getFont() {
        return this.font;
    }

    public HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public int getIconTextGap() {
        return this.iconTextGap;
    }

    public float getHorizontalGapScaleFactor() {
        return this.horizontalGapScaleFactor;
    }

    public String getSingleLineDisplayPrototype() {
        return this.singleLineDisplayPrototype;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Insets contentPadding = DEFAULT_LABEL_CONTENT_PADDING;
        private Dimension iconDimension =
                new Dimension(DEFAULT_LABEL_ICON_SIZE, DEFAULT_LABEL_ICON_SIZE);
        private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME;
        private Font font = null;
        private HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEADING;
        private int iconTextGap = DEFAULT_ICON_TEXT_GAP;
        private float horizontalGapScaleFactor = 1.0f;
        private String singleLineDisplayPrototype = null;

        public Builder setContentPadding(Insets contentPadding) {
            if (contentPadding == null) {
                throw new IllegalArgumentException("Cannot pass null content padding");
            }
            this.contentPadding = contentPadding;
            return this;
        }

        public Builder setIconDimension(Dimension iconDimension) {
            this.iconDimension = iconDimension;
            return this;
        }

        public Builder setIconFilterStrategies(
                RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {
            this.enabledIconFilterStrategy = enabledIconFilterStrategy;
            this.disabledIconFilterStrategy = disabledIconFilterStrategy;
            return this;
        }

        public Builder setFont(Font font) {
            this.font = font;
            return this;
        }

        public Builder setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
            if (horizontalAlignment == null) {
                throw new IllegalArgumentException("Cannot pass null horizontal alignment");
            }
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        public Builder setIconTextGap(int iconTextGap) {
            this.iconTextGap = iconTextGap;
            return this;
        }

        public Builder setHorizontalGapScaleFactor(float horizontalGapScaleFactor) {
            this.horizontalGapScaleFactor = horizontalGapScaleFactor;
            return this;
        }

        public Builder setSingleLineDisplayPrototype(String singleLineDisplayPrototype) {
            this.singleLineDisplayPrototype = singleLineDisplayPrototype;
            return this;
        }

        public LabelPresentationModel build() {
            LabelPresentationModel presentationModel = new LabelPresentationModel();
            presentationModel.contentPadding = this.contentPadding;
            presentationModel.iconDimension = this.iconDimension;
            presentationModel.enabledIconFilterStrategy = this.enabledIconFilterStrategy;
            presentationModel.disabledIconFilterStrategy = this.disabledIconFilterStrategy;
            presentationModel.font = this.font;
            presentationModel.horizontalAlignment = this.horizontalAlignment;
            presentationModel.iconTextGap = this.iconTextGap;
            presentationModel.horizontalGapScaleFactor = this.horizontalGapScaleFactor;
            presentationModel.singleLineDisplayPrototype = this.singleLineDisplayPrototype;
            return presentationModel;
        }
    }
}
