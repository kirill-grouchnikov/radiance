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
package org.pushingpixels.radiance.component.api.common;

import org.pushingpixels.radiance.component.api.common.model.RichTooltipPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.SwitchContentModel;
import org.pushingpixels.radiance.component.api.common.model.SwitchPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.component.internal.theming.common.ui.RadianceSwitchUI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.MouseEvent;

public class JSwitch extends JToggleButton implements RichTooltipManager.WithRichTooltip {
    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "SwitchUI";

    private Projection<JSwitch, SwitchContentModel, SwitchPresentationModel> projection;
    private SwitchContentModel contentModel;
    private SwitchPresentationModel presentationModel;

    private ButtonModel buttonModel;

    public JSwitch(Projection<JSwitch, SwitchContentModel,
            SwitchPresentationModel> projection) {
        this.projection = projection;
        this.contentModel = projection.getContentModel();
        this.presentationModel = projection.getPresentationModel();

        this.buttonModel = new ToggleButtonModel();
        this.buttonModel.setEnabled(this.contentModel.isEnabled());
        this.buttonModel.setSelected(this.contentModel.isSelected());
        this.buttonModel.addItemListener(this.contentModel.getItemListener());
        this.buttonModel.addActionListener(this.contentModel.getActionListener());
        this.setModel(this.buttonModel);

        // Don't remove the next line - we need to instantiate the RichTooltipManager
        // so that it starts tracking mouse events for displaying rich tooltips
        RichTooltipManager.sharedInstance();

        this.updateUI();
    }

    @Override
    public void updateUI() {
        setUI(RadianceSwitchUI.createUI(this));
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    public Projection<JSwitch, SwitchContentModel, SwitchPresentationModel> getProjection() {
        return this.projection;
    }

    @Override
    public RichTooltip getRichTooltip(MouseEvent mouseEvent) {
        return this.contentModel.getRichTooltip();
    }

    @Override
    public RichTooltipPresentationModel getRichTooltipPresentationModel(MouseEvent mouseEvent) {
        return this.presentationModel.getRichTooltipPresentationModel();
    }

    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    protected void fireStateChanged() {
        Object[] listeners = listenerList.getListenerList();
        ChangeEvent event = new ChangeEvent(this);
        // Process the listeners last to first
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class) {
                ((ChangeListener) listeners[i + 1]).stateChanged(event);
            }
        }
    }

    @Override
    public void setBorder(Border border) {
        super.setBorder(border);
    }
}
