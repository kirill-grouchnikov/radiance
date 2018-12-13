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
package org.pushingpixels.flamingo.api.common.projection;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.AbstractPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.model.*;
import org.pushingpixels.neon.icon.*;

import java.beans.PropertyChangeEvent;

public class CommandProjection extends Projection<AbstractCommandButton, Command,
        CommandPresentation> {

    private static ComponentSupplier<AbstractCommandButton, Command, CommandPresentation> DEFAULT_SUPPLIER =
            (Projection<AbstractCommandButton, Command, CommandPresentation> projection) -> {
                if (projection.getPresentationModel().isMenu()) {
                    return projection.getContentModel().isToggle() ? JCommandToggleMenuButton::new
                            : JCommandMenuButton::new;
                } else {
                    return projection.getContentModel().isToggle() ? JCommandToggleButton::new
                            : JCommandButton::new;
                }
            };

    private ComponentSupplier<? extends AbstractPopupMenu, ? extends AbstractPopupMenuContentModel,
            ? extends AbstractPopupMenuPresentationModel> popupMenuSupplier;
    private ComponentCustomizer<? extends AbstractPopupMenu> popupMenuCustomizer;

    public CommandProjection(Command command, CommandPresentation commandPresentation) {
        super(command, commandPresentation, DEFAULT_SUPPLIER);
    }

    public CommandProjection reproject(CommandPresentation newCommandPresentation) {
        CommandProjection result = this.getContentModel().project(newCommandPresentation);
        result.setComponentSupplier(this.getComponentSupplier());
        result.setComponentCustomizer(this.getComponentCustomizer());
        return result;
    }

    public void setPopupMenuCustomizer(
            ComponentCustomizer<? extends AbstractPopupMenu> popupMenuCustomizer) {
        this.popupMenuCustomizer = popupMenuCustomizer;
    }

    public ComponentCustomizer<? extends AbstractPopupMenu> getPopupMenuCustomizer() {
        return this.popupMenuCustomizer;
    }

    public void setPopupMenuSupplier(ComponentSupplier<? extends AbstractPopupMenu,
            ? extends AbstractPopupMenuContentModel,
            ? extends AbstractPopupMenuPresentationModel> popupMenuSupplier) {
        this.popupMenuSupplier = popupMenuSupplier;
    }

    public ComponentSupplier<? extends AbstractPopupMenu, ? extends AbstractPopupMenuContentModel,
            ? extends AbstractPopupMenuPresentationModel> getPopupMenuSupplier() {
        return this.popupMenuSupplier;
    }

    public boolean hasAction() {
        return (this.getContentModel().getAction() != null);
    }

    public boolean hasPopup() {
        return (this.getContentModel().getPopupMenuContentModel() != null);
    }

    @Override
    protected void configureComponent(AbstractCommandButton component) {
        Command command = this.getContentModel();

        // TODO: this should be looking at the weakly-referenced command button so that
        //  it doesn't prevent unused buttons from being GC'd. When that reference is null,
        //  the matching property change listener should be removed. Another option is to
        //  have each projection have a list of weak references to buttons and cull that list.
        command.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("enabled".equals(evt.getPropertyName())) {
                component.setEnabled((Boolean) evt.getNewValue());
            }
            if ("text".equals(evt.getPropertyName())) {
                component.setText((String) evt.getNewValue());
            }
            if ("extraText".equals(evt.getPropertyName())) {
                component.setExtraText((String) evt.getNewValue());
            }
            if ("icon".equals(evt.getPropertyName()) && (command.getIconFactory() == null)) {
                component.setIcon((ResizableIcon) evt.getNewValue());
            }
            if ("iconFactory".equals(evt.getPropertyName())) {
                ResizableIconFactory factory = (ResizableIconFactory) evt.getNewValue();
                component.setIcon((factory != null) ? factory.createNewIcon() : command.getIcon());
            }
            if ("disabledIcon".equals(evt.getPropertyName()) &&
                    (command.getDisabledIconFactory() == null)) {
                component.setDisabledIcon((ResizableIcon) evt.getNewValue());
            }
            if ("disabledIconFactory".equals(evt.getPropertyName())) {
                ResizableIconFactory factory = (ResizableIconFactory) evt.getNewValue();
                component.setDisabledIcon((factory != null) ? factory.createNewIcon()
                        : command.getDisabledIcon());
            }
            if ("isToggleSelected".equals(evt.getPropertyName())) {
                component.getActionModel().setSelected((Boolean) evt.getNewValue());
                if (command.getToggleGroupModel() != null) {
                    command.getToggleGroupModel().setSelected(command, (Boolean) evt.getNewValue());
                }
            }
            if ("action".equals(evt.getPropertyName())) {
                component.removeCommandListener((CommandAction) evt.getOldValue());
                component.addCommandListener((CommandAction) evt.getNewValue());
            }
            if ("actionRichTooltip".equals(evt.getPropertyName())) {
                component.setActionRichTooltip((RichTooltip) evt.getNewValue());
            }
            if ("popupRichTooltip".equals(evt.getPropertyName())) {
                if (component instanceof JCommandButton) {
                    ((JCommandButton) component).setPopupRichTooltip(
                            (RichTooltip) evt.getNewValue());
                }
            }
            if ("isAutoRepeatAction".equals(evt.getPropertyName())) {
                if (component instanceof JCommandButton) {
                    ((JCommandButton) component).setAutoRepeatAction((Boolean) evt.getNewValue());
                }
            }
            if ("isFireActionOnRollover".equals(evt.getPropertyName())) {
                if (component instanceof JCommandButton) {
                    ((JCommandButton) component).setFireActionOnRollover(
                            (Boolean) evt.getNewValue());
                }
            }
            if ("isFireActionOnPress".equals(evt.getPropertyName())) {
                component.getActionModel().setFireActionOnPress((Boolean) evt.getNewValue());
            }
            if ("actionEnabled".equals(evt.getPropertyName())) {
                component.getActionModel().setEnabled((Boolean) evt.getNewValue());
            }
            if ("popupEnabled".equals(evt.getPropertyName())) {
                if (component instanceof JCommandButton) {
                    ((JCommandButton) component).getPopupModel().setEnabled(
                            (Boolean) evt.getNewValue());
                }
            }
        });
    }
}
