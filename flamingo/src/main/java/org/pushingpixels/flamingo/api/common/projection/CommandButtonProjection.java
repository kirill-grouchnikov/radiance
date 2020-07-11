/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.api.common.projection;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.flamingo.api.common.model.CommandMenuContentModel;
import org.pushingpixels.flamingo.api.common.popup.AbstractPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.model.AbstractPopupMenuPresentationModel;

public class CommandButtonProjection<M extends Command>
        extends Projection<JCommandButton, M, CommandButtonPresentationModel> {

    private ComponentSupplier<? extends AbstractPopupMenu, ? extends CommandMenuContentModel,
            ? extends AbstractPopupMenuPresentationModel> popupMenuSupplier;
    private ComponentCustomizer<? extends AbstractPopupMenu> popupMenuCustomizer;

    @SuppressWarnings("unchecked")
    public CommandButtonProjection(M command, CommandButtonPresentationModel commandPresentation) {
        this(command, commandPresentation, projection ->  JCommandButton::new);
    }

    public CommandButtonProjection(M command, CommandButtonPresentationModel commandPresentation,
            ComponentSupplier<JCommandButton, M, CommandButtonPresentationModel> componentSupplier) {
        super(command, commandPresentation, componentSupplier);
    }

    @SuppressWarnings("unchecked")
    public CommandButtonProjection<M> reproject(CommandButtonPresentationModel newCommandPresentation) {
        CommandButtonProjection<M> result =
                (CommandButtonProjection<M>) this.getContentModel().project(newCommandPresentation);
        result.setComponentSupplier(this.getComponentSupplier());
        result.setComponentCustomizer(this.getComponentCustomizer());
        result.setCommandOverlays(this.getCommandOverlays());
        return result;
    }

    public void setPopupMenuCustomizer(ComponentCustomizer<? extends AbstractPopupMenu> popupMenuCustomizer) {
        this.popupMenuCustomizer = popupMenuCustomizer;
    }

    public ComponentCustomizer<? extends AbstractPopupMenu> getPopupMenuCustomizer() {
        return this.popupMenuCustomizer;
    }

    public void setPopupMenuSupplier(ComponentSupplier<? extends AbstractPopupMenu,
            ? extends CommandMenuContentModel,
            ? extends AbstractPopupMenuPresentationModel> popupMenuSupplier) {
        this.popupMenuSupplier = popupMenuSupplier;
    }

    public ComponentSupplier<? extends AbstractPopupMenu, ? extends CommandMenuContentModel,
            ? extends AbstractPopupMenuPresentationModel> getPopupMenuSupplier() {
        return this.popupMenuSupplier;
    }

    @Override
    protected void configureComponent(JCommandButton component) {
    }
}
