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
import org.pushingpixels.flamingo.api.common.model.CommandToggleGroupModel;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback;
import org.pushingpixels.flamingo.api.ribbon.*;
import org.pushingpixels.flamingo.internal.utils.FlamingoUtilities;
import org.pushingpixels.neon.icon.ResizableIcon;

import javax.swing.event.*;
import java.awt.event.ActionListener;
import java.beans.*;
import java.util.EventListener;

/**
 * Encapsulates metadata associated with a single command. Use a new instance of
 * {@link FlamingoCommandBuilder} to configure a new command, and
 * {@link FlamingoCommandBuilder#build()} to build a command.
 * <p>
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
    private String popupKeyTip;
    private boolean isTitleClickAction;
    private boolean isTitleClickPopup;
    private boolean isEnabled;
    private boolean isToggle;
    private boolean isToggleSelected;
    private FlamingoCommandToggleGroup toggleGroup;
    private CommandToggleGroupModel toggleGroupModel;
    private boolean isAutoRepeatAction;
    private boolean hasAutoRepeatIntervalsSet;
    private int autoRepeatInitialInterval;
    private int autoRepeatSubsequentInterval;
    private boolean isFireActionOnRollover;
    private FlamingoCommand.CommandPreviewListener previewListener;

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    protected FlamingoCommand() {
    }

    public static FlamingoCommand.FlamingoCommandBuilder builder() {
        return new FlamingoCommand.FlamingoCommandBuilder();
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
                        "Command configured to have both action and popup can't have both " +
                                "activated on title click");
            }
            if (!isTitleClickAction && !isTitleClickPopup) {
                throw new IllegalStateException(
                        "Command configured to have both action and popup must have one activated" +
                                " on title click");
            }
        }

        if (isToggle && (popupCallback != null)) {
            throw new IllegalStateException("Command configured to be toggle can't have popups");
        }

        if ((toggleGroup != null) && !isToggle) {
            throw new IllegalStateException(
                    "Command configured to not be a toggle but is in a toggleGroup");
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

    public void setExtraText(String extraText) {
        String old = this.extraText;
        this.extraText = extraText;
        this.pcs.firePropertyChange("extraText", old, this.extraText);
    }

    public ActionListener getAction() {
        return this.action;
    }

    public void setAction(ActionListener actionListener) {
        ActionListener old = this.action;
        this.action = actionListener;
        this.pcs.firePropertyChange("action", old, this.action);
    }

    public RichTooltip getActionRichTooltip() {
        return this.actionRichTooltip;
    }

    public void setActionRichTooltip(RichTooltip actionRichTooltip) {
        if (this.actionRichTooltip != actionRichTooltip) {
            RichTooltip old = this.actionRichTooltip;
            this.actionRichTooltip = actionRichTooltip;
            this.pcs.firePropertyChange("actionRichTooltip", old, this.actionRichTooltip);
        }
    }

    public String getActionKeyTip() {
        return this.actionKeyTip;
    }

    public void setActionKeyTip(String actionKeyTip) {
        this.actionKeyTip = actionKeyTip;
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

    public void setIcon(ResizableIcon icon) {
        if (this.icon != icon) {
            ResizableIcon old = this.icon;
            this.icon = icon;
            this.pcs.firePropertyChange("icon", old, this.icon);
        }
    }

    public boolean isToggle() {
        return this.isToggle;
    }

    public boolean isToggleSelected() {
        return this.isToggleSelected;
    }

    public void setToggleSelected(boolean isToggleSelected) {
        if (this.isToggleSelected != isToggleSelected) {
            this.isToggleSelected = isToggleSelected;
            this.pcs.firePropertyChange("isToggleSelected", !this.isToggleSelected,
                    this.isToggleSelected);
            this.fireStateChanged();
        }
    }

    /**
     * @deprecated Use {@link FlamingoCommandBuilder#inToggleGroup(CommandToggleGroupModel)}
     * and {@link #getToggleGroupModel()}
     */
    @Deprecated
    public FlamingoCommandToggleGroup getToggleGroup() {
        return this.toggleGroup;
    }

    public CommandToggleGroupModel getToggleGroupModel() {
        return this.toggleGroupModel;
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

    public CommandPreviewListener getPreviewListener() {
        return this.previewListener;
    }

    private AbstractCommandButton createButton(boolean isMenu) {
        AbstractCommandButton result = isMenu
                ? (this.isToggle() ? new JCommandToggleMenuButton(this.title, this.icon)
                : new JCommandMenuButton(this.title, this.icon))
                : (this.isToggle() ? new JCommandToggleButton(this.title, this.icon)
                : new JCommandButton(this.title, this.icon));
        result.putClientProperty(FlamingoUtilities.COMMAND, this);
        return result;
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
            }

            if (hasAction && hasPopup) {
                jcb.setCommandButtonKind(
                        this.isTitleClickAction ? CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                                : CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
            } else if (hasPopup) {
                jcb.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
            } else {
                jcb.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
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

        if ((this.getToggleGroupModel() == null) && (this.getToggleGroup() != null)) {
            this.getToggleGroup().toggleButtonGroup.add((JCommandToggleButton) button);
        }

        if (this.isToggleSelected()) {
            button.getActionModel().setSelected(true);
        }

        if (this.previewListener != null) {
            button.getActionModel().addChangeListener(new ChangeListener() {
                boolean wasRollover = false;

                @Override
                public void stateChanged(ChangeEvent e) {
                    boolean isRollover = button.getActionModel().isRollover();
                    if (wasRollover && !isRollover) {
                        previewListener.onCommandPreviewCanceled(FlamingoCommand.this);
                    }
                    if (!wasRollover && isRollover) {
                        previewListener.onCommandPreviewActivated(FlamingoCommand.this);
                    }
                    wasRollover = isRollover;
                }
            });
        }

        this.pcs.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("enabled".equals(evt.getPropertyName())) {
                button.setEnabled((Boolean) evt.getNewValue());
            }
            if ("icon".equals(evt.getPropertyName())) {
                button.setIcon((ResizableIcon) evt.getNewValue());
            }
            if ("isToggleSelected".equals(evt.getPropertyName())) {
                button.getActionModel().setSelected((Boolean) evt.getNewValue());
                if (toggleGroupModel != null) {
                    toggleGroupModel.setSelected(FlamingoCommand.this, (Boolean) evt.getNewValue());
                }
            }
            if ("extraText".equals(evt.getPropertyName())) {
                button.setExtraText((String) evt.getNewValue());
            }
            if ("action".equals(evt.getPropertyName())) {
                button.removeActionListener((ActionListener) evt.getOldValue());
                button.addActionListener((ActionListener) evt.getNewValue());
            }
        });
    }

    /**
     * Adds the specified change listener to track changes to this model.
     *
     * @param l Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from tracking changes to this model.
     *
     * @param l Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    /**
     * Notifies all registered listeners that the state of this model has changed.
     */
    private void fireStateChanged() {
        // Guaranteed to return a non-null array
        Object[] listeners = this.listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        ChangeEvent event = new ChangeEvent(this);
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class) {
                ((ChangeListener) listeners[i + 1]).stateChanged(event);
            }
        }
    }

    public AbstractCommandButton buildButton() {
        AbstractCommandButton result = createButton(false);
        populateButton(result);
        return result;
    }

    public AbstractCommandButton buildButton(FlamingoCommandDisplay commandDisplay) {
        AbstractCommandButton result = createButton(commandDisplay.isMenu());
        populateButton(result);
        result.setDisplayState(commandDisplay.getState());
        result.setHorizontalAlignment(commandDisplay.getHorizontalAlignment());
        result.setHGapScaleFactor(commandDisplay.getHorizontalGapScaleFactor());
        result.setVGapScaleFactor(commandDisplay.getVerticalGapScaleFactor());
        result.setFlat(commandDisplay.isFlat());
        if (commandDisplay.getCustomDimension() != null) {
            result.updateCustomDimension(commandDisplay.getCustomDimension());
        }
        if (result instanceof JCommandButton) {
            ((JCommandButton) result).setPopupOrientationKind(
                    commandDisplay.getPopupOrientationKind());
        }
        return result;
    }

    public AbstractCommandButton buildMenuButton() {
        AbstractCommandButton result = createButton(true);
        populateButton(result);
        return result;
    }

    /**
     * @deprecated Use {@link #buildButton(FlamingoCommandDisplay)} and
     * {@link FlamingoCommandDisplay.FlamingoCommandDisplayBuilder#setMenu(boolean)} with true.
     */
    @Deprecated
    public AbstractCommandButton buildMenuButton(FlamingoCommandDisplay commandDisplay) {
        AbstractCommandButton result = createButton(true);
        populateButton(result);
        result.setDisplayState(commandDisplay.getState());
        result.setHorizontalAlignment(commandDisplay.getHorizontalAlignment());
        result.setHGapScaleFactor(commandDisplay.getHorizontalGapScaleFactor());
        result.setVGapScaleFactor(commandDisplay.getVerticalGapScaleFactor());
        result.setFlat(commandDisplay.isFlat());
        if (commandDisplay.getCustomDimension() != null) {
            result.updateCustomDimension(commandDisplay.getCustomDimension());
        }
        if (result instanceof JCommandButton) {
            ((JCommandButton) result).setPopupOrientationKind(
                    commandDisplay.getPopupOrientationKind());
        }
        return result;
    }

    public interface CommandPreviewListener extends EventListener {
        void onCommandPreviewActivated(FlamingoCommand command);

        void onCommandPreviewCanceled(FlamingoCommand command);
    }

    /**
     * @deprecated Use {@link CommandToggleGroupModel},
     * {@link FlamingoCommandBuilder#inToggleGroup(CommandToggleGroupModel)}
     * and {@link FlamingoCommand#getToggleGroupModel()}
     */
    @Deprecated
    public static class FlamingoCommandToggleGroup {
        private CommandToggleButtonGroup toggleButtonGroup = new CommandToggleButtonGroup();
    }

    public abstract static class BaseFlamingoCommandBuilder<T extends FlamingoCommand,
            B extends BaseFlamingoCommandBuilder> {
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
        protected boolean isTitleClickAction;
        protected boolean isTitleClickPopup;
        protected boolean isEnabled = true;
        protected boolean isToggle;
        protected boolean isToggleSelected;
        protected FlamingoCommandToggleGroup toggleGroup;
        protected CommandToggleGroupModel toggleGroupModel;
        protected boolean isAutoRepeatAction;
        protected boolean hasAutoRepeatIntervalsSet;
        protected int autoRepeatInitialInterval;
        protected int autoRepeatSubsequentInterval;
        protected boolean isFireActionOnRollover;
        protected CommandPreviewListener previewListener;

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
            command.isTitleClickAction = this.isTitleClickAction;
            command.isTitleClickPopup = this.isTitleClickPopup;
            command.isEnabled = this.isEnabled;
            command.isToggle = this.isToggle;
            command.isToggleSelected = this.isToggleSelected;
            command.toggleGroup = this.toggleGroup;
            command.toggleGroupModel = this.toggleGroupModel;
            command.isAutoRepeatAction = this.isAutoRepeatAction;
            command.hasAutoRepeatIntervalsSet = this.hasAutoRepeatIntervalsSet;
            command.autoRepeatInitialInterval = this.autoRepeatInitialInterval;
            command.autoRepeatSubsequentInterval = this.autoRepeatSubsequentInterval;
            command.isFireActionOnRollover = this.isFireActionOnRollover;
            command.previewListener = this.previewListener;

            // special handling for toggle group model
            if (command.toggleGroupModel != null) {
                command.toggleGroupModel.add(command);
            }
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

        /**
         * @deprecated Use {@link #inToggleGroup(CommandToggleGroupModel)}
         */
        @Deprecated
        public B inToggleGroup(FlamingoCommandToggleGroup toggleGroup) {
            this.toggleGroup = toggleGroup;
            return (B) this;
        }

        public B inToggleGroup(CommandToggleGroupModel toggleGroup) {
            this.toggleGroupModel = toggleGroup;
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

        public B setPreviewListener(CommandPreviewListener previewListener) {
            this.previewListener = previewListener;
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
