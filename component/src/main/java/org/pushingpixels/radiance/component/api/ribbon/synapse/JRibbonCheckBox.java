/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.ribbon.synapse;

import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.component.api.ribbon.synapse.model.ComponentPresentationModel;
import org.pushingpixels.radiance.component.api.ribbon.synapse.model.RibbonCheckBoxContentModel;

import javax.swing.*;

public class JRibbonCheckBox extends JCheckBox {
    public JRibbonCheckBox(Projection<JRibbonCheckBox,
            RibbonCheckBoxContentModel, ComponentPresentationModel> projection) {
        super(projection.getContentModel().getText());

        final RibbonCheckBoxContentModel contentModel = projection.getContentModel();
        this.setSelected(contentModel.isSelected());
        this.setEnabled(contentModel.isEnabled());

        this.addActionListener(actionEvent -> {
            contentModel.setSelected(!contentModel.isSelected());
            if (contentModel.getActionListener() != null) {
                contentModel.getActionListener().actionPerformed(actionEvent);
            }
        });

        contentModel.addPropertyChangeListener(propertyChangeEvent -> {
            if ("selected".equals(propertyChangeEvent.getPropertyName())) {
                setSelected(contentModel.isSelected());
            }
        });
    }
}
