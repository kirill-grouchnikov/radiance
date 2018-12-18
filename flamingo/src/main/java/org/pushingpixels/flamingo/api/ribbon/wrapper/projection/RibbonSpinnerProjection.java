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
package org.pushingpixels.flamingo.api.ribbon.wrapper.projection;

import org.pushingpixels.flamingo.api.common.projection.Projection;
import org.pushingpixels.flamingo.api.ribbon.wrapper.JRibbonSpinner;
import org.pushingpixels.flamingo.api.ribbon.wrapper.model.*;

import java.beans.PropertyChangeEvent;

public class RibbonSpinnerProjection extends WrapperProjection<JRibbonSpinner,
        RibbonSpinnerContentModel> {

    private static ComponentSupplier<JRibbonSpinner,
            RibbonSpinnerContentModel, WrapperPresentation> DEFAULT_SUPPLIER =
            (Projection<JRibbonSpinner, RibbonSpinnerContentModel,
                    WrapperPresentation> projection) -> JRibbonSpinner::new;

    public RibbonSpinnerProjection(RibbonSpinnerContentModel contentModel,
            WrapperPresentation presentationModel) {
        super(contentModel, presentationModel, DEFAULT_SUPPLIER);
    }

    @Override
    protected void configureComponent(JRibbonSpinner component) {
        // TODO: this should be looking at the weakly-referenced component so that
        //  it doesn't prevent unused components from being GC'd. When that reference is null,
        //  the matching property change listener should be removed. Another option is to
        //  have each projection have a list of weak references to component and cull that list.
        this.getContentModel().addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("enabled".equals(evt.getPropertyName())) {
                component.setEnabled((Boolean) evt.getNewValue());
            }
        });
    }
}
