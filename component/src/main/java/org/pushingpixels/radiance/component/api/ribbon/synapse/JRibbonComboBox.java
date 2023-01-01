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
package org.pushingpixels.radiance.component.api.ribbon.synapse;

import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.component.api.ribbon.synapse.model.ComponentPresentationModel;
import org.pushingpixels.radiance.component.api.ribbon.synapse.model.RibbonComboBoxContentModel;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class JRibbonComboBox<E> extends JComboBox<E> {
    public JRibbonComboBox(Projection<JRibbonComboBox<E>,
            RibbonComboBoxContentModel<E>, ComponentPresentationModel> projection) {
        super(projection.getContentModel());

        final RibbonComboBoxContentModel<E> contentModel = projection.getContentModel();
        if (contentModel.getSelectionChangeListener() != null) {
            contentModel.addListDataListener(new ListDataListener() {
                Object selected = contentModel.getSelectedItem();

                @Override
                public void intervalAdded(ListDataEvent e) {
                }

                @Override
                public void intervalRemoved(ListDataEvent e) {
                }

                @Override
                public void contentsChanged(ListDataEvent e) {
                    Object newSelection = contentModel.getSelectedItem();
                    if (this.selected != newSelection) {
                        contentModel.getSelectionChangeListener().onSelectionChanged(this.selected,
                                newSelection);
                        this.selected = newSelection;
                    }
                }
            });
            // Notify the listener on initial selection
            if (contentModel.getSelectedItem() != null) {
                contentModel.getSelectionChangeListener().onSelectionChanged(null,
                        contentModel.getSelectedItem());
            }
        }
    }
}
