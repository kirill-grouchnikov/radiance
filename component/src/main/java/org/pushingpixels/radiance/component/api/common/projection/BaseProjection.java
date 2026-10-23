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
package org.pushingpixels.radiance.component.api.common.projection;

import org.pushingpixels.radiance.component.api.common.model.ContentModel;
import org.pushingpixels.radiance.component.api.common.model.PresentationModel;

import javax.swing.*;

/**
 * Base projection that builds a Swing component from content and presentation models.
 *
 * @param <T> The type of the Swing component.
 * @param <C> The type of the content model.
 * @param <P> The type of the presentation model.
 */
public abstract class BaseProjection<T extends JComponent, C extends ContentModel,
        P extends PresentationModel> extends BlackboxProjection<C, P> {
    /**
     * Constructs a {@code BaseProjection}.
     *
     * @param contentModel The content model.
     * @param presentationModel The presentation model.
     */
    protected BaseProjection(C contentModel, P presentationModel) {
        super(contentModel, presentationModel);
    }

    /**
     * Builds the base component without configuration.
     *
     * @return The base component.
     */
    public abstract T buildBaseComponent();

    /**
     * Builds and configures the component.
     *
     * @return The configured component.
     */
    public final T buildComponent() {
        T result = this.buildBaseComponent();
        this.configureComponent(result);
        return result;
    }

    /**
     * Configures the component after it has been built.
     *
     * @param component The component to configure.
     */
    protected void configureComponent(T component) {}
}
