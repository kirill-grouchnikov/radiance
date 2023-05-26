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

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.component.api.common.model.BaseCommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.LabelPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.model.BaseCommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import java.awt.*;

public class CustomComplexPopupMenuPresentationModel extends BaseCommandPopupMenuPresentationModel {
    public final CommandButtonPresentationState itemPresentationState =
            CommandPopupMenuPresentationModel.DEFAULT_POPUP_MENU_PRESENTATION_STATE;
    public final BaseCommandButtonPresentationModel.PopupFireTrigger itemPopupFireTrigger =
            BaseCommandButtonPresentationModel.PopupFireTrigger.ON_ROLLOVER;
    public final BaseCommandButtonPresentationModel.SelectedStateHighlight itemSelectedStateHighlight =
            BaseCommandButtonPresentationModel.SelectedStateHighlight.ICON_ONLY;
    public final RadianceThemingSlices.IconFilterStrategy itemIconActiveFilterStrategy =
            RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
    public final RadianceThemingSlices.IconFilterStrategy itemIconEnabledFilterStrategy =
            RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
    public final RadianceThemingSlices.IconFilterStrategy itemIconDisabledFilterStrategy =
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME;
    public final Insets itemContentPadding = new Insets(6, 16, 6, 16);
    public final HorizontalAlignment itemHorizontalAlignment = HorizontalAlignment.FILL;
    public final RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
            RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_TOP;

    public final CommandButtonPresentationModel zoomPresentationModel =
            CommandButtonPresentationModel.builder()
                    .setPresentationState(CommandButtonPresentationState.MEDIUM)
                    .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)
                    .setToDismissPopupsOnActivation(false)
                    .setSides(RadianceThemingSlices.Sides.CLOSED_RECTANGLE)
                    .setContentPadding(new Insets(6, 8, 6, 8))
                    .build();
    public final LabelPresentationModel zoomLabelPresentationModel =
            LabelPresentationModel.builder()
                    .setContentPadding(new Insets(6, 4, 6, 4))
                    .setSingleLineDisplayPrototype("999%")
                    .setHorizontalAlignment(HorizontalAlignment.CENTER)
                    .build();
    public final CommandButtonPresentationModel fullScreenPresentationModel =
            CommandButtonPresentationModel.builder()
                    .setPresentationState(CommandButtonPresentationState.SMALL)
                    .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)
                    .setIconFilterStrategies(RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME)
                    .setSides(RadianceThemingSlices.Sides.CLOSED_RECTANGLE)
                    .setContentPadding(new Insets(6, 16, 6, 16))
                    .build();
    public final CommandButtonPresentationModel editPresentationModel =
            CommandButtonPresentationModel.builder()
                    .setPresentationState(CommandButtonPresentationState.MEDIUM)
                    .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)
                    .setSides(RadianceThemingSlices.Sides.CLOSED_RECTANGLE)
                    .setContentPadding(new Insets(6, 16, 6, 16))
                    .build();
    public final LabelPresentationModel headerTitlePresentationModel =
            LabelPresentationModel.builder()
                    .setContentPadding(new Insets(10, 16, 10, 16))
                    .setFont(RadianceThemingCortex.GlobalScope.getFontPolicy().
                            getFontSet().getControlFont().deriveFont(Font.BOLD))
                    .build();
    public final CommandButtonPresentationModel headerSignInPresentationModel =
            CommandButtonPresentationModel.builder()
                    .setPresentationState(CommandButtonPresentationState.MEDIUM)
                    .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)
                    .setSides(RadianceThemingSlices.Sides.CLOSED_RECTANGLE)
                    .setContentPadding(new Insets(10, 16, 10, 16))
                    .build();
    public final int headerSeparatorHeight = 2;
    public final CommandButtonPresentationModel footerPresentationModel =
            CommandButtonPresentationModel.builder()
                    .setPresentationState(CommandButtonPresentationState.MEDIUM)
                    .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)
                    .setSides(RadianceThemingSlices.Sides.CLOSED_RECTANGLE)
                    .setContentPadding(new Insets(10, 16, 10, 16))
                    .setHorizontalAlignment(HorizontalAlignment.LEADING)
                    .build();

    public CustomComplexPopupMenuPresentationModel() {
    }

}
