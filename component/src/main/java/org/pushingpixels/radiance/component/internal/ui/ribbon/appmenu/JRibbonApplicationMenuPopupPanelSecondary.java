/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.ui.ribbon.appmenu;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.JCommandButtonPanel;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.CommandPanelContentModel;
import org.pushingpixels.radiance.component.api.common.model.CommandPanelPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.panel.PanelLayoutSpec;
import org.pushingpixels.radiance.component.api.common.model.panel.PanelRowFillSpec;
import org.pushingpixels.radiance.component.api.common.projection.CommandPanelProjection;
import org.pushingpixels.radiance.component.internal.ui.common.BasicCommandButtonPanelUI;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import java.util.Map;

public class JRibbonApplicationMenuPopupPanelSecondary extends JCommandButtonPanel {
    public static JRibbonApplicationMenuPopupPanelSecondary getPanel(
            Command primaryMenuEntry,
            Map<Command, CommandButtonPresentationModel.Overlay> commandOverlays,
            CommandButtonPresentationState secondaryMenuPresentationState,
            RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
            RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
            RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy,
            JCommandButton commandButton) {
        CommandPanelProjection projection = new CommandPanelProjection(
                new CommandPanelContentModel(primaryMenuEntry.getSecondaryContentModel()
                        .getCommandGroups()),
                CommandPanelPresentationModel.builder()
                        .setLayoutSpec(new PanelLayoutSpec.RowFill(new PanelRowFillSpec.Fixed(1)))
                        .setCommandPresentationState(secondaryMenuPresentationState)
                        .setCommandHorizontalAlignment(HorizontalAlignment.LEADING)
                        .setPopupPlacementStrategy(
                                RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_TOP)
                        .setCommandPopupFireTrigger(CommandButtonPresentationModel.PopupFireTrigger.ON_ROLLOVER)
                        .setCommandSelectedStateHighlight(CommandButtonPresentationModel.SelectedStateHighlight.ICON_ONLY)
                        .setIconFilterStrategies(activeIconFilterStrategy, enabledIconFilterStrategy,
                                disabledIconFilterStrategy)
                        .build());
        projection.setCommandOverlays(commandOverlays);

        return new JRibbonApplicationMenuPopupPanelSecondary(projection, commandButton);
    }

    private JCommandButton toTrack;

    private JRibbonApplicationMenuPopupPanelSecondary(CommandPanelProjection projection,
            JCommandButton toTrack) {
        super(projection);
        this.toTrack = toTrack;
        this.putClientProperty(BasicCommandButtonPanelUI.SKIP_BACKGROUND_FILL, Boolean.TRUE);
    }

    @Override
    public void removeNotify() {
        super.removeNotify();
        this.toTrack.getPopupModel().setPopupShowing(false);
    }
}
