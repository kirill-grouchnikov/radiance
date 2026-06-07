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
package org.pushingpixels.radiance.theming.api.decorator;

import org.pushingpixels.radiance.theming.api.decorator.rootpane.DefaultRootPaneDecorator;
import org.pushingpixels.radiance.theming.api.decorator.rootpane.RadianceRootPaneDecorator;

public class RadianceDecorators {
    private RadianceRootPaneDecorator rootPaneDecorator;

    private RadianceDecorators() {}

    public RadianceRootPaneDecorator getRootPaneDecorator() {
        return this.rootPaneDecorator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RadianceDecorators buildDefault() {
        RadianceDecorators result = new RadianceDecorators();
        result.rootPaneDecorator = new DefaultRootPaneDecorator();
        return result;
    }

    public static final class Builder {
        private RadianceRootPaneDecorator rootPaneDecorator;

        private Builder() {}

        public Builder withRootPaneDecorator(RadianceRootPaneDecorator rootPaneDecorator) {
            if (rootPaneDecorator == null) {
                throw new IllegalArgumentException("Cannot have a null root pane decorator");
            }
            this.rootPaneDecorator = rootPaneDecorator;
            return this;
        }

        public RadianceDecorators build() {
            RadianceDecorators result = new RadianceDecorators();
            result.rootPaneDecorator = this.rootPaneDecorator;
            return result;
        }
    }
}
