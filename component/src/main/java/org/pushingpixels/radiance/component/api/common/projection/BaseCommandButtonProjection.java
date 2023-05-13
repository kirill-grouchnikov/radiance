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
package org.pushingpixels.radiance.component.api.common.projection;

import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.popup.AbstractPopupMenuPanel;
import org.pushingpixels.radiance.component.api.common.popup.model.BaseCommandPopupMenuPresentationModel;

import javax.swing.*;
import java.util.function.Function;

public abstract class BaseCommandButtonProjection<
        M extends BaseCommand<MCM>,
        MCM extends BaseCommandMenuContentModel,
        P extends BaseCommandButtonPresentationModel<MPM, P>,
        MPM extends BaseCommandPopupMenuPresentationModel>
        extends BaseProjection<JCommandButton, M, P> {
    private CommandButtonComponentSupplier<JCommandButton, M, MCM, P, MPM> componentSupplier;

    /**
     * This interface can be used as part of
     * {@link #setComponentSupplier(CommandButtonComponentSupplier)} to return your own supplier of
     * {@link TC} to be used before the {@link #configureComponent(JCommandButton)} call.
     */
    @FunctionalInterface
    public interface CommandButtonComponentSupplier<TC extends JCommandButton,
            M extends BaseCommand<MCM>,
            MCM extends BaseCommandMenuContentModel,
            P extends BaseCommandButtonPresentationModel<MPM, P>,
            MPM extends BaseCommandPopupMenuPresentationModel> {
        /**
         * @param projection Information on the projection in case this
         *                   creator has logic that depends on specific field(s) of
         *                   the content model and / or the presentation model.
         * @return A supplier of the target component. It should be a reference to a function that
         * gets one parameter - projection, and returns an instance of the matching
         * {@link JComponent} subclass that represents the Swing component to be
         * used to configure the projected component in {@link #configureComponent(JCommandButton)}
         * call.
         */
        Function<BaseCommandButtonProjection<M, MCM, P, MPM>, TC> getComponentSupplier(
                BaseCommandButtonProjection<M, MCM, P, MPM> projection);
    }

    public BaseCommandButtonProjection(M command, P commandPresentation) {
        super(command, commandPresentation);
        this.componentSupplier = projection -> JCommandButton::new;
    }

    public void setComponentSupplier(BaseCommandButtonProjection.CommandButtonComponentSupplier<
            JCommandButton, M, MCM, P, MPM> componentSupplier) {
        if (componentSupplier == null) {
            throw new IllegalArgumentException("Cannot pass null component creator");
        }
        this.componentSupplier = componentSupplier;
    }

    public CommandButtonComponentSupplier<JCommandButton, M, MCM, P, MPM> getComponentSupplier() {
        return componentSupplier;
    }

    public abstract AbstractPopupMenuPanelProjection<? extends AbstractPopupMenuPanel, MCM, MPM>
        getPopupMenuPanelProjection();

    @Override
    public JCommandButton buildBaseComponent() {
        return this.getComponentSupplier().getComponentSupplier(this).apply(this);
    }

    @Override
    protected void configureComponent(JCommandButton component) {
    }
}
