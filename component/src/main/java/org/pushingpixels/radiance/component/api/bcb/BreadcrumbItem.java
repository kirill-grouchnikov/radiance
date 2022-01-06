/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov
 * and <a href="http://www.topologi.com">Topologi</a>.
 * Contributed by <b>Rick Jelliffe</b> of <b>Topologi</b>
 * in January 2006.
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
package org.pushingpixels.radiance.component.api.bcb;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;

/**
 * A single item in the {@link JBreadcrumbBar} model.
 *
 * @param <T> Type of associated data.
 */
public final class BreadcrumbItem<T> {
    /**
     * Display key for this item.
     */
    private String displayName;

    /**
     * Icon factory for this item.
     */
    private RadianceIcon.Factory iconFactory;

    /**
     * Data value for this item.
     */
    private T data;

    public BreadcrumbItem(String displayName, RadianceIcon.Factory iconFactory, T data) {
        this.displayName = displayName;
        this.iconFactory = iconFactory;
        this.data = data;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public RadianceIcon.Factory getIconFactory() {
        return this.iconFactory;
    }

    public T getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return getDisplayName() + ":" + getData();
    }
}
