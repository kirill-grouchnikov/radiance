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
package org.pushingpixels.flamingo.internal.ui.ribbon.appmenu;

import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.flamingo.api.common.projection.*;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenu;

import java.util.Map;

public class RibbonApplicationMenuPanelProjection extends AbstractPopupMenuProjection<
        JRibbonApplicationMenuPopupPanel, RibbonApplicationMenu,
        CommandPopupMenuPresentationModel> {
    private Map<Command, CommandButtonPresentationState> secondaryLevelCommandPresentationState;

    private static ComponentSupplier<JRibbonApplicationMenuPopupPanel, RibbonApplicationMenu,
            CommandPopupMenuPresentationModel> DEFAULT_SUPPLIER =
            (Projection<JRibbonApplicationMenuPopupPanel, RibbonApplicationMenu,
                    CommandPopupMenuPresentationModel> projection) ->
                    JRibbonApplicationMenuPopupPanel::new;

    public RibbonApplicationMenuPanelProjection(RibbonApplicationMenu contentModel,
            CommandPopupMenuPresentationModel presentationModel) {
        super(contentModel, presentationModel, DEFAULT_SUPPLIER);
    }

    @Override
    protected void configureComponent(JRibbonApplicationMenuPopupPanel component) {
    }

    public void setSecondaryLevelCommandPresentationState(Map<Command,
            CommandButtonPresentationState> secondaryLevelCommandPresentationState) {
        this.secondaryLevelCommandPresentationState = secondaryLevelCommandPresentationState;
    }

    public Map<Command, CommandButtonPresentationState> getSecondaryLevelCommandPresentationState() {
        return this.secondaryLevelCommandPresentationState;
    }
}
