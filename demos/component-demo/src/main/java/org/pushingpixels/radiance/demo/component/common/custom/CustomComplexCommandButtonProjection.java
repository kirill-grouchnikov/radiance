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
package org.pushingpixels.radiance.demo.component.common.custom;

import org.pushingpixels.radiance.component.api.common.popup.AbstractPopupMenuPanel;
import org.pushingpixels.radiance.component.api.common.projection.AbstractPopupMenuPanelProjection;
import org.pushingpixels.radiance.component.api.common.projection.BaseCommandButtonProjection;

public class CustomComplexCommandButtonProjection extends
        BaseCommandButtonProjection<CustomComplexCommand, CustomComplexPopupMenuContentModel,
                CustomComplexCommandButtonPresentationModel,
                CustomComplexPopupMenuPresentationModel> {
    public CustomComplexCommandButtonProjection(CustomComplexCommand command,
            CustomComplexCommandButtonPresentationModel commandPresentation) {
        super(command, commandPresentation);
    }

    @Override
    @SuppressWarnings("unchecked")
    public AbstractPopupMenuPanelProjection<? extends AbstractPopupMenuPanel,
            CustomComplexPopupMenuContentModel, CustomComplexPopupMenuPresentationModel> getPopupMenuPanelProjection() {
        CustomComplexPopupMenuContentModel popupMenuContentModel =
                this.getContentModel().getSecondaryContentModel();
        CustomComplexPopupMenuPresentationModel popupMenuPresentationModel =
                this.getPresentationModel().getPopupMenuPresentationModel();
        if (popupMenuPresentationModel == null) {
            popupMenuPresentationModel = new CustomComplexPopupMenuPresentationModel();
        }
        CustomComplexPopupMenuPanelProjection customComplexPopupMenuPanelProjection =
                new CustomComplexPopupMenuPanelProjection(popupMenuContentModel, popupMenuPresentationModel);
        customComplexPopupMenuPanelProjection.setCommandOverlays(this.getCommandOverlays());
        return customComplexPopupMenuPanelProjection;
    }

    @Override
    public CustomComplexCommandButtonProjection reproject(
            CustomComplexCommandButtonPresentationModel newCommandPresentation) {
        CustomComplexCommandButtonProjection result =
                new CustomComplexCommandButtonProjection(
                        this.getContentModel(), newCommandPresentation);
        result.setComponentSupplier(this.getComponentSupplier());
        result.setCommandOverlays(this.getCommandOverlays());
        return result;
    }
}
