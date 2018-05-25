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
package org.pushingpixels.flamingo.api.common;

import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonPopupOrientationKind;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback;
import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;

import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeSupport;

/**
 * Encapsulates metadata associated with a single command. Use a new instance of
 * {@link FlamingoCommandBuilder} to configure a new command, and
 * {@link FlamingoCommandBuilder#build()} to build a command.
 * 
 * Note that while {@link #buildButton()} can be used to directly build the visual representation of
 * a command, commands represented by this class are passed to various APIs on the {@link JRibbon}
 * and {@link JRibbonBand} to construct and modify the ribbon content. Use
 * {@link #setEnabled(boolean)} to control the enabled state of the command and, by extension, its
 * visual representation that you acquire from the {@link #buildButton()} call.
 * 
 * @author Kirill Grouchnikov
 */
public class FlamingoCommand {
    private String title;
    private ResizableIcon icon;
    private ResizableIcon disabledIcon;
    private String extraText;
    private ActionListener action;
    private RichTooltip actionRichTooltip;
    private String actionKeyTip;
    private PopupPanelCallback popupCallback;
    private RichTooltip popupRichTooltip;
    private CommandButtonPopupOrientationKind popupOrientationKind;
    private String popupKeyTip;
    private boolean isTitleClickAction;
    private boolean isTitleClickPopup;
    private boolean isEnabled;
    private boolean isToggle;
    private boolean isToggleSelected;
    private FlamingoCommandToggleGroup toggleGroup;
    private boolean isAutoRepeatAction;
    private boolean hasAutoRepeatIntervalsSet;
    private int autoRepeatInitialInterval;
    private int autoRepeatSubsequentInterval;
    private boolean isFireActionOnRollover;

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    protected FlamingoCommand() {
    }

    protected void checkConsistency() {
        if (action == null) {
            if (actionRichTooltip != null) {
                throw new IllegalStateException("Configured action rich tooltip with no action");
            }
            if (actionKeyTip != null) {
                throw new IllegalStateException("Configured action key tip with no action");
            }
        }
        if (popupCallback == null) {
            if (popupRichTooltip != null) {
                throw new IllegalStateException("Configured popup rich tooltip with no callback");
            }
            if (popupKeyTip != null) {
                throw new IllegalStateException("Configured popup key tip with no callback");
            }
        }

        if ((action == null) && (popupCallback == null)) {
            throw new IllegalStateException("Command configured with no action or popup callback");
        }

        if ((action != null) && (popupCallback == null) && isTitleClickPopup) {
            throw new IllegalStateException(
                    "Action-only command configured to activate popup on title click");
        }

        if ((popupCallback != null) && (action == null) && isTitleClickAction) {
            throw new IllegalStateException(
                    "Popup-only command configured to activate action on title click");
        }

        if ((action != null) && (popupCallback != null)) {
            if (isTitleClickAction && isTitleClickPopup) {
                throw new IllegalStateException(
                        "Command configured to have both action and popup can't have both activated on title click");
            }
            if (!isTitleClickAction && !isTitleClickPopup) {
                throw new IllegalStateException(
                        "Command configured to have both action and popup must have one activated on title click");
            }
        }

        if (isToggle && (popupCallback != null)) {
            throw new IllegalStateException("Command configured to be toggle can't have popups");
        }

        if ((toggleGroup != null) && !isToggle) {
            throw new IllegalStateException(
                    "Command configured to not be a toggle but is in a toggle toggleGroup");
        }
        if (isToggleSelected && !isToggle) {
            throw new IllegalStateException(
                    "Command configured to not be a toggle but is selected");
        }
    }

    public String getTitle() {
        return this.title;
    }

    public ResizableIcon getIcon() {
        return this.icon;
    }

    public ResizableIcon getDisabledIcon() {
        return this.disabledIcon;
    }

    public String getExtraText() {
        return this.extraText;
    }

    public ActionListener getAction() {
        return this.action;
    }

    public RichTooltip getActionRichTooltip() {
        return this.actionRichTooltip;
    }

    public String getActionKeyTip() {
        return this.actionKeyTip;
    }

    public PopupPanelCallback getPopupCallback() {
        return this.popupCallback;
    }

    public RichTooltip getPopupRichTooltip() {
        return this.popupRichTooltip;
    }

    public String getPopupKeyTip() {
        return this.popupKeyTip;
    }

    public CommandButtonPopupOrientationKind getPopupOrientationKind() {
        return this.popupOrientationKind;
    }

    public boolean isTitleClickAction() {
        return this.isTitleClickAction;
    }

    public boolean isTitleClickPopup() {
        return this.isTitleClickPopup;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void setEnabled(boolean enabled) {
        if (this.isEnabled != enabled) {
            this.isEnabled = enabled;
            this.pcs.firePropertyChange("enabled", !this.isEnabled, this.isEnabled);
        }
    }

    public boolean isToggle() {
        return this.isToggle;
    }

    public boolean isToggleSelected() {
        return this.isToggleSelected;
    }

    public FlamingoCommandToggleGroup getToggleGroup() {
        return this.toggleGroup;
    }

    public boolean isAutoRepeatAction() {
        return this.isAutoRepeatAction;
    }

    public int getAutoRepeatInitialInterval() {
        return this.hasAutoRepeatIntervalsSet ? this.autoRepeatInitialInterval : -1;
    }

    public int getAutoRepeatSubsequentInterval() {
        return this.hasAutoRepeatIntervalsSet ? this.autoRepeatSubsequentInterval : -1;
    }

    public boolean isFireActionOnRollover() {
        return this.isFireActionOnRollover;
    }

    private AbstractCommandButton createButton(boolean isMenu) {
        return isMenu
                ? (this.isToggle() ? new JCommandToggleMenuButton(this.title, this.icon)
                        : new JCommandMenuButton(this.title, this.icon))
                : (this.isToggle() ? new JCommandToggleButton(this.title, this.icon)
                        : new JCommandButton(this.title, this.icon));
    }

    protected boolean hasAction() {
        return (this.getAction() != null);
    }

    protected boolean hasPopup() {
        return (this.getPopupCallback() != null);
    }

    private void populateButton(AbstractCommandButton button) {
        if (this.getDisabledIcon() != null) {
            button.setDisabledIcon(this.getDisabledIcon());
        }

        button.setExtraText(this.getExtraText());

        boolean hasAction = this.hasAction();
        boolean hasPopup = this.hasPopup();

        if (hasAction) {
            button.addActionListener(this.getAction());
            button.setActionRichTooltip(this.getActionRichTooltip());
            button.setActionKeyTip(this.getActionKeyTip());
        }

        if (!isToggle) {
            JCommandButton jcb = (JCommandButton) button;
            if (hasPopup) {
                jcb.setPopupCallback(this.getPopupCallback());
                jcb.setPopupRichTooltip(this.getPopupRichTooltip());
                jcb.setPopupKeyTip(this.getPopupKeyTip());
                if (this.popupOrientationKind != null) {
                    jcb.setPopupOrientationKind(this.getPopupOrientationKind());
                }
            }

            if (hasAction && hasPopup) {
                jcb.setCommandButtonKind(
                        this.isTitleClickAction ? CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                                : CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
            } else if (hasAction) {
                jcb.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
            } else {
                jcb.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
            }

            if (this.isAutoRepeatAction()) {
                jcb.setAutoRepeatAction(true);
                if (this.hasAutoRepeatIntervalsSet) {
                    jcb.setAutoRepeatActionIntervals(this.getAutoRepeatInitialInterval(),
                            this.getAutoRepeatSubsequentInterval());
                }
            }

            jcb.setFireActionOnRollover(this.isFireActionOnRollover());
        }

        button.setEnabled(this.isEnabled());

        if (this.getToggleGroup() != null) {
            this.getToggleGroup().toggleButtonGroup.add((JCommandToggleButton) button);
        }

        if (this.isToggleSelected()) {
            button.getActionModel().setSelected(true);
        }

        this.pcs.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("enabled".equals(evt.getPropertyName())) {
                button.setEnabled((Boolean) evt.getNewValue());
            }
        });
    }

    public AbstractCommandButton buildButton() {
        AbstractCommandButton result = createButton(false);
        populateButton(result);
        return result;
    }

    public AbstractCommandButton buildMenuButton() {
        AbstractCommandButton result = createButton(true);
        populateButton(result);
        return result;
    }

    public static class FlamingoCommandToggleGroup {
        private CommandToggleButtonGroup toggleButtonGroup = new CommandToggleButtonGroup();
    }

    protected abstract static class BaseFlamingoCommandBuilder<T extends FlamingoCommand, B extends BaseFlamingoCommandBuilder> {
        protected String title;
        protected ResizableIcon icon;
        protected ResizableIcon disabledIcon;
        protected String extraText;
        protected ActionListener action;
        protected RichTooltip actionRichTooltip;
        protected String actionKeyTip;
        protected PopupPanelCallback popupCallback;
        protected RichTooltip popupRichTooltip;
        protected String popupKeyTip;
        protected CommandButtonPopupOrientationKind popupOrientationKind;
        protected boolean isTitleClickAction;
        protected boolean isTitleClickPopup;
        protected boolean isEnabled = true;
        protected boolean isToggle;
        protected boolean isToggleSelected;
        protected FlamingoCommandToggleGroup toggleGroup;
        protected boolean isAutoRepeatAction;
        protected boolean hasAutoRepeatIntervalsSet;
        protected int autoRepeatInitialInterval;
        protected int autoRepeatSubsequentInterval;
        protected boolean isFireActionOnRollover;

        protected void configureBaseCommand(FlamingoCommand command) {
            command.title = this.title;
            command.icon = this.icon;
            command.disabledIcon = this.disabledIcon;
            command.extraText = this.extraText;
            command.action = this.action;
            command.actionRichTooltip = this.actionRichTooltip;
            command.actionKeyTip = this.actionKeyTip;
            command.popupCallback = this.popupCallback;
            command.popupRichTooltip = this.popupRichTooltip;
            command.popupKeyTip = this.popupKeyTip;
            command.popupOrientationKind = popupOrientationKind;
            command.isTitleClickAction = this.isTitleClickAction;
            command.isTitleClickPopup = this.isTitleClickPopup;
            command.isEnabled = this.isEnabled;
            command.isToggle = this.isToggle;
            command.isToggleSelected = this.isToggleSelected;
            command.toggleGroup = this.toggleGroup;
            command.isAutoRepeatAction = this.isAutoRepeatAction;
            command.hasAutoRepeatIntervalsSet = this.hasAutoRepeatIntervalsSet;
            command.autoRepeatInitialInterval = this.autoRepeatInitialInterval;
            command.autoRepeatSubsequentInterval = this.autoRepeatSubsequentInterval;
            command.isFireActionOnRollover = this.isFireActionOnRollover;
        }

        public B setTitle(String title) {
            this.title = title;
            return (B) this;
        }

        public B setIcon(ResizableIcon icon) {
            this.icon = icon;
            return (B) this;
        }

        public B setDisabledIcon(ResizableIcon disabledIcon) {
            this.disabledIcon = disabledIcon;
            return (B) this;
        }

        public B setExtraText(String extraText) {
            this.extraText = extraText;
            return (B) this;
        }

        public B setAction(ActionListener action) {
            this.action = action;
            return (B) this;
        }

        public B setActionRichTooltip(RichTooltip actionRichTooltip) {
            this.actionRichTooltip = actionRichTooltip;
            return (B) this;
        }

        public B setActionKeyTip(String actionKeyTip) {
            this.actionKeyTip = actionKeyTip;
            return (B) this;
        }

        public B setPopupCallback(PopupPanelCallback popupCallback) {
            this.popupCallback = popupCallback;
            return (B) this;
        }

        public B setPopupRichTooltip(RichTooltip popupRichTooltip) {
            this.popupRichTooltip = popupRichTooltip;
            return (B) this;
        }

        public B setPopupKeyTip(String popupKeyTip) {
            this.popupKeyTip = popupKeyTip;
            return (B) this;
        }

        public B setPopupOrientationKind(CommandButtonPopupOrientationKind popupOrientationKind) {
            this.popupOrientationKind = popupOrientationKind;
            return (B) this;
        }

        public B setTitleClickAction() {
            this.isTitleClickAction = true;
            return (B) this;
        }

        public B setTitleClickPopup() {
            this.isTitleClickPopup = true;
            return (B) this;
        }

        public B setEnabled(boolean isEnabled) {
            this.isEnabled = isEnabled;
            return (B) this;
        }

        public B setToggle() {
            this.isToggle = true;
            return (B) this;
        }

        public B setToggleSelected(boolean toggleSelected) {
            this.isToggle = true;
            this.isToggleSelected = toggleSelected;
            return (B) this;
        }

        public B inToggleGroup(FlamingoCommandToggleGroup toggleGroup) {
            this.toggleGroup = toggleGroup;
            return (B) this;
        }

        public B setAutoRepeatAction(boolean isAutoRepeatAction) {
            this.isAutoRepeatAction = isAutoRepeatAction;
            return (B) this;
        }

        public B setAutoRepeatActionIntervals(int initial, int subsequent) {
            this.hasAutoRepeatIntervalsSet = true;
            this.autoRepeatInitialInterval = initial;
            this.autoRepeatSubsequentInterval = subsequent;
            return (B) this;
        }

        public B setFireActionOnRollover(boolean isFireActionOnRollover) {
            this.isFireActionOnRollover = isFireActionOnRollover;
            return (B) this;
        }
    }

    public static class FlamingoCommandBuilder
            extends BaseFlamingoCommandBuilder<FlamingoCommand, FlamingoCommandBuilder> {

        public FlamingoCommand build() {
            FlamingoCommand command = new FlamingoCommand();

            this.configureBaseCommand(command);

            command.checkConsistency();

            return command;
        }
    }
}
