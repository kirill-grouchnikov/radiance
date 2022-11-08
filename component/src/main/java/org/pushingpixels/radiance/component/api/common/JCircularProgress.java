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

import org.pushingpixels.radiance.component.api.common.model.CircularProgressContentModel;
import org.pushingpixels.radiance.component.api.common.model.CircularProgressPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.component.internal.theming.common.ui.RadianceCircularProgressUI;

import javax.swing.*;

public class JCircularProgress extends JComponent {
    /**
     * @see #getUIClassID
     */
    public static final String uiClassID = "CircularProgressUI";

    private Projection<JCircularProgress, CircularProgressContentModel, CircularProgressPresentationModel> projection;
    private CircularProgressContentModel contentModel;
    private CircularProgressPresentationModel presentationModel;

    public JCircularProgress(Projection<JCircularProgress, CircularProgressContentModel,
            CircularProgressPresentationModel> projection) {
        this.projection = projection;
        this.contentModel = projection.getContentModel();
        this.presentationModel = projection.getPresentationModel();

        this.updateUI();
    }

    public Projection<JCircularProgress, CircularProgressContentModel, CircularProgressPresentationModel> getProjection() {
        return this.projection;
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    @Override
    public void updateUI() {
        setUI(RadianceCircularProgressUI.createUI(this));
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag != isVisible()) {
            super.setVisible(aFlag);
            firePropertyChange("visible", !aFlag, aFlag);
        }
    }
}
