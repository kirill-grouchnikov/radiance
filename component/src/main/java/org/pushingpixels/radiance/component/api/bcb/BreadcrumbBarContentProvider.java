/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov
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

import java.io.InputStream;
import java.util.List;

/**
 * Content provider for a {@link JBreadcrumbBar}.
 *
 * @param <T> Type of data associated with each breadcrumb bar item.
 */
public abstract class BreadcrumbBarContentProvider<T> {
    /**
     * Returns the choice elements that correspond to the specified path. If the
     * path is empty, <code>null</code> should be returned. If path is
     * <code>null</code>, the "root" elements should be returned
     *
     * @param path Breadcrumb bar path.
     * @return The choice elements that correspond to the specified path
     */
    public List<BreadcrumbItem<T>> getPathChoices(List<BreadcrumbItem<T>> path) {
        return null;
    }

    /**
     * Returns the leaf elements that correspond to the specified path. If the
     * path is empty, <code>null</code> should be returned. If path is
     * <code>null</code>, leaf content of the "root" elements should be returned. Most probably, if
     * your root is more than one element, you should be returning null in here.
     *
     * @param path Breadcrumb bar path.
     * @return The leaf elements that correspond to the specified path
     */
    public List<BreadcrumbItem<T>> getLeaves(List<BreadcrumbItem<T>> path) {
        return null;
    }

    /**
     * Returns the input stream with the leaf content. Some implementations may
     * return <code>null</code> if this is not applicable.
     *
     * @param leaf Leaf.
     * @return Input stream with the leaf content. May be <code>null</code> if
     * this is not applicable.
     */
    public InputStream getLeafContent(T leaf) {
        return null;
    }
}
