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
package org.pushingpixels.flamingo.api.common.model;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.internal.ui.common.BasicCommandButtonUI;
import org.pushingpixels.flamingo.internal.utils.FlamingoUtilities;
import org.pushingpixels.neon.icon.*;

import javax.swing.event.*;
import java.beans.PropertyChangeEvent;

public class CommandProjection {
    private Command command;
    private CommandPresentation commandPresentation;

    private CommandButtonCreator commandButtonCreator;
    private CommandButtonCustomizer commandButtonCustomizer;

    private static CommandButtonCreator DEFAULT_BUILDER = new DefaultCommandButtonBuilder();

    /**
     * This interface can be used as part of {@link #setCommandButtonCreator(CommandButtonCreator)}
     * to return your own subclass of {@link AbstractCommandButton} (or one of the public
     * Flamingo command button classes) as the result of {@link #buildButton()} call.
     */
    public interface CommandButtonCreator {
        /**
         * @param commandProjection Information on the command projection in case this
         *                          creator has logic that depends on specific field(s) of
         *                          the command and / or the command presentation.
         * @return A new, unitialized command button.
         */
        AbstractCommandButton createUnitializedButton(CommandProjection commandProjection);
    }

    /**
     * This interface can be used as part of
     * {@link #setCommandButtonCustomizer(CommandButtonCustomizer)} to customize the result of
     * {@link #buildButton()} with additional functionality not exposed via {@link Command}
     * or {@link CommandPresentation}.
     */
    public interface CommandButtonCustomizer {
        void customizeButton(AbstractCommandButton button);
    }

    public static class DefaultCommandButtonBuilder implements CommandButtonCreator {
        @Override
        public AbstractCommandButton createUnitializedButton(CommandProjection commandProjection) {
            Command command = commandProjection.getCommand();
            CommandPresentation commandDisplay = commandProjection.getCommandPresentation();

            if (commandDisplay.isMenu()) {
                return command.isToggle() ? new JCommandToggleMenuButton()
                        : new JCommandMenuButton();
            } else {
                return command.isToggle() ? new JCommandToggleButton() : new JCommandButton();
            }
        }
    }

    public CommandProjection(Command command, CommandPresentation commandDisplay) {
        this.command = command;
        this.commandPresentation = commandDisplay;
        this.commandButtonCreator = DEFAULT_BUILDER;
    }

    public CommandProjection reproject(CommandPresentation newCommandDisplay) {
        CommandProjection result = this.command.project(newCommandDisplay);
        result.setCommandButtonCreator(this.commandButtonCreator);
        result.setCommandButtonCustomizer(this.commandButtonCustomizer);
        return result;
    }

    public void setCommandButtonCreator(CommandButtonCreator commandButtonCreator) {
        if (commandButtonCreator == null) {
            throw new IllegalArgumentException("Cannot pass null button builder");
        }
        this.commandButtonCreator = commandButtonCreator;
    }

    public void setCommandButtonCustomizer(CommandButtonCustomizer commandButtonCustomizer) {
        this.commandButtonCustomizer = commandButtonCustomizer;
    }

    public Command getCommand() {
        return this.command;
    }

    public CommandPresentation getCommandPresentation() {
        return this.commandPresentation;
    }

    protected boolean hasAction() {
        return (this.command.getAction() != null);
    }

    protected boolean hasPopup() {
        return (this.command.getPopupCallback() != null);
    }

    private void populateButton(AbstractCommandButton button) {
        button.setText(this.command.getTitle());
        button.setExtraText(this.command.getExtraText());

        button.setIcon((command.getIconFactory() != null)
                ? command.getIconFactory().createNewIcon()
                : command.getIcon());
        button.setDisabledIcon((command.getDisabledIconFactory() != null)
                ? command.getDisabledIconFactory().createNewIcon()
                : command.getDisabledIcon());

        boolean hasAction = this.hasAction();
        boolean hasPopup = this.hasPopup();

        if (hasAction) {
            button.addCommandListener(this.command.getAction());
            button.setActionRichTooltip(this.command.getActionRichTooltip());
            button.setActionKeyTip(this.commandPresentation.getActionKeyTip());
        }

        if (!this.command.isToggle()) {
            JCommandButton jcb = (JCommandButton) button;
            if (hasPopup) {
                jcb.setPopupCallback(this.command.getPopupCallback());
                jcb.setPopupRichTooltip(this.command.getPopupRichTooltip());
                jcb.setPopupKeyTip(this.commandPresentation.getPopupKeyTip());
            }

            if (hasAction && hasPopup) {
                jcb.setCommandButtonKind(
                        this.command.isTitleClickAction()
                                ? JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                                : JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
            } else if (hasPopup) {
                jcb.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
            } else {
                jcb.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_ONLY);
            }

            if (this.command.isAutoRepeatAction()) {
                jcb.setAutoRepeatAction(true);
                if (this.command.hasAutoRepeatIntervalsSet()) {
                    jcb.setAutoRepeatActionIntervals(this.command.getAutoRepeatInitialInterval(),
                            this.command.getAutoRepeatSubsequentInterval());
                }
            }

            jcb.setFireActionOnRollover(this.command.isFireActionOnRollover());
            jcb.getActionModel().setFireActionOnPress(this.command.isFireActionOnPress());
        }

        button.setEnabled(this.command.isEnabled());

        if (this.command.isToggleSelected()) {
            button.getActionModel().setSelected(true);
        }

        if (this.command.getPreviewListener() != null) {
            button.getActionModel().addChangeListener(new ChangeListener() {
                boolean wasRollover = false;

                @Override
                public void stateChanged(ChangeEvent e) {
                    boolean isRollover = button.getActionModel().isRollover();
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

        if (!this.commandPresentation.isToDismissPopupsOnActivation()) {
            button.putClientProperty(BasicCommandButtonUI.DONT_DISPOSE_POPUPS, Boolean.TRUE);
        }

        this.command.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("enabled".equals(evt.getPropertyName())) {
                button.setEnabled((Boolean) evt.getNewValue());
            }
            if ("icon".equals(evt.getPropertyName())) {
                button.setIcon((ResizableIcon) evt.getNewValue());
            }
            if ("icon".equals(evt.getPropertyName()) && (command.getIconFactory() == null)) {
                button.setIcon((ResizableIcon) evt.getNewValue());
            }
            if ("iconFactory".equals(evt.getPropertyName())) {
                ResizableIconFactory factory = (ResizableIconFactory) evt.getNewValue();
                button.setIcon((factory != null) ? factory.createNewIcon() : command.getIcon());
            }
            if ("isToggleSelected".equals(evt.getPropertyName())) {
                button.getActionModel().setSelected((Boolean) evt.getNewValue());
                if (command.getToggleGroupModel() != null) {
                    command.getToggleGroupModel().setSelected(command, (Boolean) evt.getNewValue());
                }
            }
            if ("extraText".equals(evt.getPropertyName())) {
                button.setExtraText((String) evt.getNewValue());
            }
            if ("action".equals(evt.getPropertyName())) {
                button.removeCommandListener((CommandListener) evt.getOldValue());
                button.addCommandListener((CommandListener) evt.getNewValue());
            }
        });
    }

    public AbstractCommandButton buildButton() {
        AbstractCommandButton result = this.commandButtonCreator.createUnitializedButton(this);

        populateButton(result);

        result.setDisplayState(commandPresentation.getCommandDisplayState());
        result.setHorizontalAlignment(commandPresentation.getHorizontalAlignment());
        result.setHGapScaleFactor(commandPresentation.getHorizontalGapScaleFactor());
        result.setVGapScaleFactor(commandPresentation.getVerticalGapScaleFactor());
        result.setFlat(commandPresentation.isFlat());
        result.setFocusable(commandPresentation.isFocusable());
        if (commandPresentation.getCommandIconDimension() != null) {
            result.updateCustomDimension(commandPresentation.getCommandIconDimension());
        }
        if (result instanceof JCommandButton) {
            ((JCommandButton) result).setPopupOrientationKind(
                    commandPresentation.getPopupOrientationKind());
        }

        if (this.commandButtonCustomizer != null) {
            this.commandButtonCustomizer.customizeButton(result);
        }

        result.putClientProperty(FlamingoUtilities.COMMAND, this.command);

        return result;
    }

}
