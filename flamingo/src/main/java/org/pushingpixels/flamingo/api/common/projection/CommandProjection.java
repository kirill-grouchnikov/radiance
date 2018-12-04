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
import org.pushingpixels.flamingo.internal.ui.common.BasicCommandButtonUI;
import org.pushingpixels.flamingo.internal.utils.FlamingoUtilities;
import org.pushingpixels.neon.icon.*;

import javax.swing.event.*;
import java.beans.PropertyChangeEvent;

public class CommandProjection extends Projection<AbstractCommandButton, Command,
        CommandPresentation> {

    private static Projection.ComponentCreator<AbstractCommandButton, Command,
            CommandPresentation> DEFAULT_CREATOR = new DefaultCommandButtonCreator();

    public static class DefaultCommandButtonCreator implements
            Projection.ComponentCreator<AbstractCommandButton, Command, CommandPresentation> {
        @Override
        public AbstractCommandButton createUnitializedComponent(Projection<AbstractCommandButton,
                Command, CommandPresentation> projection) {
            Command command = projection.getContentModel();
            CommandPresentation commandPresentation = projection.getPresentationModel();

            if (commandPresentation.isMenu()) {
                return command.isToggle() ? new JCommandToggleMenuButton()
                        : new JCommandMenuButton();
            } else {
                return command.isToggle() ? new JCommandToggleButton() : new JCommandButton();
            }
        }
    }

    public CommandProjection(Command command, CommandPresentation commandPresentation) {
        super(command, commandPresentation);

        this.setComponentCreator(DEFAULT_CREATOR);
    }

    public CommandProjection reproject(CommandPresentation newCommandPresentation) {
        CommandProjection result = this.getContentModel().project(newCommandPresentation);
        result.setComponentCreator(this.getComponentCreator());
        result.setComponentCustomizer(this.getComponentCustomizer());
        return result;
    }

    protected boolean hasAction() {
        return (this.getContentModel().getAction() != null);
    }

    protected boolean hasPopup() {
        return (this.getContentModel().getPopupMenuProjection() != null)
                || (this.getContentModel().getPopupCallback() != null);
    }

    @Override
    public AbstractCommandButton buildComponent() {
        AbstractCommandButton result = this.getComponentCreator().createUnitializedComponent(this);

        Command command = this.getContentModel();
        CommandPresentation commandPresentation = this.getPresentationModel();

        result.setText(command.getTitle());
        result.setExtraText(command.getExtraText());

        result.setIcon((command.getIconFactory() != null)
                ? command.getIconFactory().createNewIcon()
                : command.getIcon());
        result.setDisabledIcon((command.getDisabledIconFactory() != null)
                ? command.getDisabledIconFactory().createNewIcon()
                : command.getDisabledIcon());

        boolean hasAction = this.hasAction();
        boolean hasPopup = this.hasPopup();

        if (hasAction) {
            result.addCommandListener(command.getAction());
            result.setActionRichTooltip(command.getActionRichTooltip());
            result.setActionKeyTip(commandPresentation.getActionKeyTip());
        }

        if (!command.isToggle()) {
            JCommandButton jcb = (JCommandButton) result;
            if (hasPopup) {
                if (command.getPopupMenuProjection() != null) {
                    jcb.setPopupCallback((JCommandButton commandButton)
                            -> command.getPopupMenuProjection().buildComponent());
                } else {
                    jcb.setPopupCallback(command.getPopupCallback());
                }
                jcb.setPopupRichTooltip(command.getPopupRichTooltip());
                jcb.setPopupKeyTip(commandPresentation.getPopupKeyTip());
            }

            if (hasAction && hasPopup) {
                jcb.setCommandButtonKind(command.isTitleClickAction()
                        ? JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                        : JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
            } else if (hasPopup) {
                jcb.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
            } else {
                jcb.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_ONLY);
            }

            if (command.isAutoRepeatAction()) {
                jcb.setAutoRepeatAction(true);
                if (command.hasAutoRepeatIntervalsSet()) {
                    jcb.setAutoRepeatActionIntervals(command.getAutoRepeatInitialInterval(),
                            command.getAutoRepeatSubsequentInterval());
                }
            }

            jcb.setFireActionOnRollover(command.isFireActionOnRollover());
            jcb.getActionModel().setFireActionOnPress(command.isFireActionOnPress());
        }

        result.setEnabled(command.isEnabled());

        if (command.isToggleSelected()) {
            result.getActionModel().setSelected(true);
        }

        if (command.getPreviewListener() != null) {
            result.getActionModel().addChangeListener(new ChangeListener() {
                boolean wasRollover = false;

                @Override
                public void stateChanged(ChangeEvent e) {
                    boolean isRollover = result.getActionModel().isRollover();
                    if (wasRollover && !isRollover) {
                        command.getPreviewListener().onCommandPreviewCanceled(command);
                    }
                    if (!wasRollover && isRollover) {
                        command.getPreviewListener().onCommandPreviewActivated(command);
                    }
                    wasRollover = isRollover;
                }
            });
        }

        if (!commandPresentation.isToDismissPopupsOnActivation()) {
            result.putClientProperty(BasicCommandButtonUI.DONT_DISPOSE_POPUPS, Boolean.TRUE);
        }

        // TODO: this should be looking at the weakly-referenced command button so that
        //  it doesn't prevent unused buttons from being GC'd. When that reference is null,
        //  the matching property change listener should be removed. Another option is to
        //  have each projection have a list of weak references to buttons and cull that list.
        command.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("enabled".equals(evt.getPropertyName())) {
                result.setEnabled((Boolean) evt.getNewValue());
            }
            if ("title".equals(evt.getPropertyName())) {
                result.setText((String) evt.getNewValue());
            }
            if ("extraText".equals(evt.getPropertyName())) {
                result.setExtraText((String) evt.getNewValue());
            }
            if ("icon".equals(evt.getPropertyName()) && (command.getIconFactory() == null)) {
                result.setIcon((ResizableIcon) evt.getNewValue());
            }
            if ("iconFactory".equals(evt.getPropertyName())) {
                ResizableIconFactory factory = (ResizableIconFactory) evt.getNewValue();
                result.setIcon((factory != null) ? factory.createNewIcon() : command.getIcon());
            }
            if ("disabledIcon".equals(evt.getPropertyName()) &&
                    (command.getDisabledIconFactory() == null)) {
                result.setDisabledIcon((ResizableIcon) evt.getNewValue());
            }
            if ("disabledIconFactory".equals(evt.getPropertyName())) {
                ResizableIconFactory factory = (ResizableIconFactory) evt.getNewValue();
                result.setDisabledIcon((factory != null) ? factory.createNewIcon()
                        : command.getDisabledIcon());
            }
            if ("isToggleSelected".equals(evt.getPropertyName())) {
                result.getActionModel().setSelected((Boolean) evt.getNewValue());
                if (command.getToggleGroupModel() != null) {
                    command.getToggleGroupModel().setSelected(command, (Boolean) evt.getNewValue());
                }
            }
            if ("action".equals(evt.getPropertyName())) {
                result.removeCommandListener((CommandListener) evt.getOldValue());
                result.addCommandListener((CommandListener) evt.getNewValue());
            }
            if ("actionRichTooltip".equals(evt.getPropertyName())) {
                result.setActionRichTooltip((RichTooltip) evt.getNewValue());
            }
            if ("popupRichTooltip".equals(evt.getPropertyName())) {
                if (result instanceof JCommandButton) {
                    ((JCommandButton) result).setPopupRichTooltip((RichTooltip) evt.getNewValue());
                }
            }
            if ("isAutoRepeatAction".equals(evt.getPropertyName())) {
                if (result instanceof JCommandButton) {
                    ((JCommandButton) result).setAutoRepeatAction((Boolean) evt.getNewValue());
                }
            }
            if ("isFireActionOnRollover".equals(evt.getPropertyName())) {
                if (result instanceof JCommandButton) {
                    ((JCommandButton) result).setFireActionOnRollover((Boolean) evt.getNewValue());
                }
            }
            if ("isFireActionOnPress".equals(evt.getPropertyName())) {
                result.getActionModel().setFireActionOnPress((Boolean) evt.getNewValue());
            }
            if ("actionEnabled".equals(evt.getPropertyName())) {
                result.getActionModel().setEnabled((Boolean) evt.getNewValue());
            }
            if ("popupEnabled".equals(evt.getPropertyName())) {
                if (result instanceof JCommandButton) {
                    ((JCommandButton) result).getPopupModel().setEnabled(
                            (Boolean) evt.getNewValue());
                }
            }
        });

        result.setPresentationState(commandPresentation.getPresentationState());
        result.setHorizontalAlignment(commandPresentation.getHorizontalAlignment());
        result.setHGapScaleFactor(commandPresentation.getHorizontalGapScaleFactor());
        result.setVGapScaleFactor(commandPresentation.getVerticalGapScaleFactor());
        result.setFlat(commandPresentation.isFlat());
        result.setFocusable(commandPresentation.isFocusable());
        if (commandPresentation.getIconDimension() != null) {
            result.updateCustomDimension(commandPresentation.getIconDimension());
        }
        if (result instanceof JCommandButton) {
            ((JCommandButton) result).setPopupOrientationKind(
                    commandPresentation.getPopupOrientationKind());
        }

        if (this.getComponentCustomizer() != null) {
            this.getComponentCustomizer().customizeComponent(result);
        }

        result.putClientProperty(FlamingoUtilities.COMMAND, this.getContentModel());

        return result;
    }
}
