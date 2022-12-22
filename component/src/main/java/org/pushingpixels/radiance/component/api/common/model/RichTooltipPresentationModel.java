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

import java.awt.*;

public class RichTooltipPresentationModel implements ImmutablePresentationModel {
    public static final Insets DEFAULT_CONTENT_PADDING = new Insets(6, 6, 6, 6);
    public static final int LARGE_ICON_SIZE = 32;
    public static final int SMALL_ICON_SIZE = 16;

    private Insets contentPadding;
    private Dimension mainIconSize;
    private Dimension footerIconSize;

    private RichTooltipPresentationModel() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public Dimension getMainIconSize() {
        return this.mainIconSize;
    }

    public Dimension getFooterIconSize() {
        return this.footerIconSize;
    }

    public Insets getContentPadding() {
        return this.contentPadding;
    }

    public static class Builder {
        private Insets contentPadding = DEFAULT_CONTENT_PADDING;
        private Dimension mainIconSize = new Dimension(LARGE_ICON_SIZE, LARGE_ICON_SIZE);
        private Dimension footerIconSize = new Dimension(SMALL_ICON_SIZE, SMALL_ICON_SIZE);

        public Builder setContentPadding(Insets contentPadding) {
            if (contentPadding == null) {
                throw new IllegalArgumentException("Content padding cannot be null");
            }
            this.contentPadding = contentPadding;
            return this;
        }

        public Builder setMainIconSize(Dimension mainIconSize) {
            this.mainIconSize = mainIconSize;
            return this;
        }

        public Builder setFooterIconSize(Dimension footerIconSize) {
            this.footerIconSize = footerIconSize;
            return this;
        }

        public RichTooltipPresentationModel build() {
            RichTooltipPresentationModel presentationModel = new RichTooltipPresentationModel();
            presentationModel.contentPadding = this.contentPadding;
            presentationModel.mainIconSize = this.mainIconSize;
            presentationModel.footerIconSize = this.footerIconSize;
            return presentationModel;
        }
    }
}
