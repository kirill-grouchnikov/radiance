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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuPresentationModel;

/**
 * Encapsulates presentation metadata for displaying color selector commands as buttons. Use a new
 * instance of {@link Builder} to configure a new presentation, and {@link Builder#build()} to build
 * a presentation.
 *
 * @author Kirill Grouchnikov
 * @see ColorSelectorCommand
 */
public class ColorSelectorCommandButtonPresentationModel extends BaseCommandButtonPresentationModel<ColorSelectorPopupMenuPresentationModel,
        ColorSelectorCommandButtonPresentationModel> {

    protected ColorSelectorCommandButtonPresentationModel() {
    }

    @Override
    public ColorSelectorCommandButtonPresentationModel overlayWith(Overlay overlay) {
        ColorSelectorCommandButtonPresentationModel result = new ColorSelectorCommandButtonPresentationModel();

        result.presentationState = (overlay.getPresentationState() != null)
                ? overlay.getPresentationState() : this.presentationState;
        result.backgroundAppearanceStrategy = (overlay.getBackgroundAppearanceStrategy() != null)
                ? overlay.getBackgroundAppearanceStrategy() : this.backgroundAppearanceStrategy;
        result.isFocusable = (overlay.getFocusable() != null) ? overlay.getFocusable() : this.isFocusable;
        result.horizontalAlignment = (overlay.getHorizontalAlignment() != null)
                ? overlay.getHorizontalAlignment() : this.horizontalAlignment;
        result.contentPadding = (overlay.getContentPadding() != null)
                ? overlay.getContentPadding() : this.contentPadding;
        result.horizontalGapScaleFactor = (overlay.getHorizontalGapScaleFactor() != null)
                ? overlay.getHorizontalGapScaleFactor() : this.horizontalGapScaleFactor;
        result.verticalGapScaleFactor = (overlay.getVerticalGapScaleFactor() != null)
                ? overlay.getVerticalGapScaleFactor() : this.verticalGapScaleFactor;
        result.iconDimension = (overlay.getIconDimension() != null)
                ? overlay.getIconDimension() : this.iconDimension;
        result.activeIconFilterStrategy = (overlay.getActiveIconFilterStrategy() != null)
                ? overlay.getActiveIconFilterStrategy() : this.activeIconFilterStrategy;
        result.enabledIconFilterStrategy = (overlay.getEnabledIconFilterStrategy() != null)
                ? overlay.getEnabledIconFilterStrategy() : this.enabledIconFilterStrategy;
        result.disabledIconFilterStrategy = (overlay.getDisabledIconFilterStrategy() != null)
                ? overlay.getDisabledIconFilterStrategy() : this.disabledIconFilterStrategy;
        result.forceAllocateSpaceForIcon = (overlay.isForceAllocateSpaceForIcon() != null)
                ? overlay.isForceAllocateSpaceForIcon() : this.forceAllocateSpaceForIcon;
        result.selectedStateHighlight = (overlay.getSelectedStateHighlight() != null)
                ? overlay.getSelectedStateHighlight() : this.selectedStateHighlight;
        result.font = (overlay.getFont() != null) ? overlay.getFont() : this.font;
        result.popupPlacementStrategy = (overlay.getPopupPlacementStrategy() != null)
                ? overlay.getPopupPlacementStrategy() : this.popupPlacementStrategy;
        result.toDismissPopupsOnActivation = (overlay.getToDismissPopupsOnActivation() != null)
                ? overlay.getToDismissPopupsOnActivation() : this.toDismissPopupsOnActivation;
        result.showPopupIcon = (overlay.isShowPopupIcon() != null)
                ? overlay.isShowPopupIcon() : this.showPopupIcon;
        result.popupIcon = (overlay.getPopupIcon() != null)
                ? overlay.getPopupIcon() : this.popupIcon;
        result.popupAnchorBoundsProvider = (overlay.getPopupAnchorBoundsProvider() != null)
                ? overlay.getPopupAnchorBoundsProvider() : this.popupAnchorBoundsProvider;
        result.popupMenuPresentationModel = (overlay.getPopupMenuPresentationModel() != null)
                ? (ColorSelectorPopupMenuPresentationModel) overlay.getPopupMenuPresentationModel() : this.popupMenuPresentationModel;
        result.actionKeyTip = (overlay.getActionKeyTip() != null)
                ? overlay.getActionKeyTip() : this.actionKeyTip;
        result.popupKeyTip = (overlay.getPopupKeyTip() != null)
                ? overlay.getPopupKeyTip() : this.popupKeyTip;
        result.textClick = (overlay.getTextClick() != null)
                ? overlay.getTextClick() : this.textClick;
        result.isAutoRepeatAction = (overlay.getAutoRepeatAction() != null)
                ? overlay.getAutoRepeatAction() : this.isAutoRepeatAction;
        result.hasAutoRepeatIntervalsSet = (overlay.getHasAutoRepeatIntervalsSet() != null)
                ? overlay.getHasAutoRepeatIntervalsSet() : this.hasAutoRepeatIntervalsSet;
        result.autoRepeatInitialInterval = (overlay.getAutoRepeatInitialInterval() != null)
                ? overlay.getAutoRepeatInitialInterval() : this.autoRepeatInitialInterval;
        result.autoRepeatSubsequentInterval = (overlay.getAutoRepeatSubsequentInterval() != null)
                ? overlay.getAutoRepeatSubsequentInterval() : this.autoRepeatSubsequentInterval;
        result.actionFireTrigger = (overlay.getActionFireTrigger() != null)
                ? overlay.getActionFireTrigger() : this.actionFireTrigger;
        result.popupFireTrigger = (overlay.getPopupFireTrigger() != null)
                ? overlay.getPopupFireTrigger() : this.popupFireTrigger;
        result.actionRichTooltipPresentationModel = (overlay.getActionRichTooltipPresentationModel() != null)
                ? overlay.getActionRichTooltipPresentationModel() : this.actionRichTooltipPresentationModel;
        result.popupRichTooltipPresentationModel = (overlay.getPopupRichTooltipPresentationModel() != null)
                ? overlay.getPopupRichTooltipPresentationModel() : this.popupRichTooltipPresentationModel;
        result.sides = (overlay.getSides() != null)
                ? overlay.getSides() : this.sides;

        return result;
    }

    public static ColorSelectorCommandButtonPresentationModel withDefaults() {
        return ColorSelectorCommandButtonPresentationModel.builder().build();
    }

    public static Builder builder() {
        return new Builder();
    }


    public static class Builder extends BaseBuilder<ColorSelectorPopupMenuPresentationModel,
            ColorSelectorCommandButtonPresentationModel, Builder> {
        public ColorSelectorCommandButtonPresentationModel build() {
            ColorSelectorCommandButtonPresentationModel presentationModel = new ColorSelectorCommandButtonPresentationModel();
            this.configureBaseCommandButtonPresentationModel(presentationModel);
            return presentationModel;
        }
    }
}
