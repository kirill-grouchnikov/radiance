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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;

import java.awt.*;

public class SwitchPresentationModel implements ImmutablePresentationModel {
    public static final Insets DEFAULT_SWITCH_CONTENT_PADDING = new Insets(4, 6, 4, 4);
    public static final int SWITCH_TRACK_WIDTH = 36;
    public static final int SWITCH_TRACK_HEIGHT = 18;
    public static final int SWITCH_THUMB_SIZE_ON = 12;
    public static final int SWITCH_THUMB_SIZE_OFF = 10;

    private Insets contentPadding;
    private Dimension trackSize;
    private int thumbSizeOn;
    private int thumbSizeOff;
    private HorizontalAlignment horizontalAlignment;
    private RichTooltipPresentationModel richTooltipPresentationModel;

    private SwitchPresentationModel() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public Insets getContentPadding() {
        return this.contentPadding;
    }

    public Dimension getTrackSize() {
        return this.trackSize;
    }

    public int getThumbSizeOn() {
        return this.thumbSizeOn;
    }

    public int getThumbSizeOff() {
        return this.thumbSizeOff;
    }

    public HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public RichTooltipPresentationModel getRichTooltipPresentationModel() {
        return this.richTooltipPresentationModel;
    }

    public static class Builder {
        private Insets contentPadding = DEFAULT_SWITCH_CONTENT_PADDING;
        private Dimension trackSize = new Dimension(SWITCH_TRACK_WIDTH, SWITCH_TRACK_HEIGHT);
        private int thumbSizeOn = SWITCH_THUMB_SIZE_ON;
        private int thumbSizeOff = SWITCH_THUMB_SIZE_OFF;
        private HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEADING;
        private RichTooltipPresentationModel richTooltipPresentationModel =
                RichTooltipPresentationModel.builder().build();

        public Builder setContentPadding(Insets contentPadding) {
            if (contentPadding == null) {
                throw new IllegalArgumentException("Cannot pass null content padding");
            }
            this.contentPadding = contentPadding;
            return this;
        }

        public Builder setTrackSize(Dimension trackSize) {
            if (trackSize == null) {
                throw new IllegalArgumentException("Cannot pass null track size");
            }
            this.trackSize = trackSize;
            return this;
        }

        public Builder setThumbSizes(int thumbSizeOn, int thumbSizeOff) {
            this.thumbSizeOn = thumbSizeOn;
            this.thumbSizeOff = thumbSizeOff;
            return this;
        }

        public Builder setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
            if (horizontalAlignment == null) {
                throw new IllegalArgumentException("Cannot pass null horizontal alignment");
            }
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        public Builder setRichTooltipPresentationModel(RichTooltipPresentationModel richTooltipPresentationModel) {
            if (richTooltipPresentationModel == null) {
                throw new IllegalArgumentException("Cannot pass null tooltip presentation model");
            }
            this.richTooltipPresentationModel = richTooltipPresentationModel;
            return this;
        }

        public SwitchPresentationModel build() {
            SwitchPresentationModel presentationModel = new SwitchPresentationModel();
            presentationModel.contentPadding = this.contentPadding;
            presentationModel.trackSize = this.trackSize;
            presentationModel.thumbSizeOn = this.thumbSizeOn;
            presentationModel.thumbSizeOff = this.thumbSizeOff;
            presentationModel.horizontalAlignment = this.horizontalAlignment;
            presentationModel.richTooltipPresentationModel = this.richTooltipPresentationModel;
            return presentationModel;
        }
    }
}
