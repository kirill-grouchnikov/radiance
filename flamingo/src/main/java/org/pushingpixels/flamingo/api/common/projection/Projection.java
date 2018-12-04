/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.flamingo.api.common.projection;

import org.pushingpixels.flamingo.api.common.model.*;

import javax.swing.*;

public abstract class Projection<T extends JComponent, C extends ContentModel,
        P extends PresentationModel> {
    private C contentModel;
    private P presentationModel;

    private ComponentCreator<T, C, P> componentCreator;
    private ComponentCustomizer<T> componentCustomizer;

    /**
     * This interface can be used as part of {@link #setComponentCreator(ComponentCreator)}
     * to return your own subclass of {@link TC} as the result of {@link #buildComponent()} call.
     */
    public interface ComponentCreator<TC extends JComponent, CC extends ContentModel,
            PC extends PresentationModel> {
        /**
         * @param projection Information on the projection in case this
         *                   creator has logic that depends on specific field(s) of
         *                   the content model and / or the presentation model.
         * @return A new, unitialized instance of the target component.
         */
        TC createUnitializedComponent(Projection<TC, CC, PC> projection);
    }

    /**
     * This interface can be used as part of
     * {@link #setComponentCustomizer(ComponentCustomizer)} to customize the result of
     * {@link #buildComponent()} with additional functionality not exposed via
     * {@link #getContentModel()} or {@link #getPresentationModel()}.
     */
    public interface ComponentCustomizer<TC extends JComponent> {
        void customizeComponent(TC component);
    }

    public Projection(C contentModel, P presentationModel) {
        this.contentModel = contentModel;
        this.presentationModel = presentationModel;
    }

    public C getContentModel() {
        return this.contentModel;
    }

    public P getPresentationModel() {
        return this.presentationModel;
    }

    public void setComponentCreator(ComponentCreator<T, C, P> componentCreator) {
        if (componentCreator == null) {
            throw new IllegalArgumentException("Cannot pass null component creator");
        }
        this.componentCreator = componentCreator;
    }

    public void setComponentCustomizer(ComponentCustomizer<T> componentCustomizer) {
        this.componentCustomizer = componentCustomizer;
    }

    public ComponentCreator<T, C, P> getComponentCreator() {
        return this.componentCreator;
    }

    public ComponentCustomizer<T> getComponentCustomizer() {
        return this.componentCustomizer;
    }

    public abstract T buildComponent();
}
