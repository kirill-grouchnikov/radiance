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
package org.pushingpixels.radiance.component.api.ribbon.projection;

import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.AbstractPopupMenuPanel;
import org.pushingpixels.radiance.component.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.AbstractPopupMenuPanelProjection;
import org.pushingpixels.radiance.component.api.common.projection.BaseCommandButtonProjection;
import org.pushingpixels.radiance.component.api.ribbon.RibbonApplicationMenu;
import org.pushingpixels.radiance.component.api.ribbon.model.RibbonApplicationMenuCommand;
import org.pushingpixels.radiance.component.internal.ui.ribbon.appmenu.CommandButtonLayoutManagerMenuTileLevel2;
import org.pushingpixels.radiance.component.internal.ui.ribbon.appmenu.RibbonApplicationMenuPanelPanelProjection;

import java.util.Map;

public class RibbonApplicationMenuCommandButtonProjection extends BaseCommandButtonProjection<
        RibbonApplicationMenuCommand, RibbonApplicationMenu,
        CommandButtonPresentationModel,
        CommandPopupMenuPresentationModel> {
    public static final CommandButtonPresentationState RIBBON_APP_MENU_SECONDARY_LEVEL =
            new CommandButtonPresentationState("Ribbon application menu tile level 2", 32) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(
                        JCommandButton commandButton) {
                    return new CommandButtonLayoutManagerMenuTileLevel2();
                }
            };

    private Map<Command, CommandButtonPresentationState> secondaryLevelCommandPresentationState;

    public RibbonApplicationMenuCommandButtonProjection(RibbonApplicationMenuCommand command,
            CommandButtonPresentationModel commandPresentation) {
        super(command, commandPresentation);
    }

    public void setSecondaryLevelCommandPresentationState(Map<Command,
            CommandButtonPresentationState> secondaryLevelCommandPresentationState) {
        this.secondaryLevelCommandPresentationState = secondaryLevelCommandPresentationState;
    }

    public Map<Command, CommandButtonPresentationState> getSecondaryLevelCommandPresentationState() {
        return this.secondaryLevelCommandPresentationState;
    }

    @Override
    public RibbonApplicationMenuCommandButtonProjection reproject(
            CommandButtonPresentationModel newCommandPresentation) {
        RibbonApplicationMenuCommandButtonProjection result =
                new RibbonApplicationMenuCommandButtonProjection(
                        this.getContentModel(), newCommandPresentation);
        result.setComponentSupplier(this.getComponentSupplier());
        result.setCommandOverlays(this.getCommandOverlays());
        result.setSecondaryLevelCommandPresentationState(
                this.getSecondaryLevelCommandPresentationState());
        return result;
    }

    @Override
    public AbstractPopupMenuPanelProjection<? extends AbstractPopupMenuPanel, RibbonApplicationMenu, CommandPopupMenuPresentationModel> getPopupMenuPanelProjection() {
        CommandPopupMenuPresentationModel popupMenuPresentationModel =
                this.getPresentationModel().getPopupMenuPresentationModel();
        if (popupMenuPresentationModel == null) {
            popupMenuPresentationModel = CommandPopupMenuPresentationModel.builder().build();
        }
        RibbonApplicationMenuPanelPanelProjection menuPanelProjection =
                new RibbonApplicationMenuPanelPanelProjection(
                        this.getContentModel().getSecondaryContentModel(), popupMenuPresentationModel);
        menuPanelProjection.setCommandOverlays(this.getCommandOverlays());
        menuPanelProjection.setSecondaryLevelCommandPresentationState(
                this.getSecondaryLevelCommandPresentationState());
        return menuPanelProjection;
    }
}
