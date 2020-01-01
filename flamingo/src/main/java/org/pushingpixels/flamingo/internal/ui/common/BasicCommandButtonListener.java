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
package org.pushingpixels.flamingo.internal.ui.common;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JScrollablePanel;
import org.pushingpixels.flamingo.api.common.model.PopupButtonModel;
import org.pushingpixels.flamingo.api.common.popup.JPopupPanel;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

/**
 * Listener to track user interaction with the command buttons.
 *
 * @author Kirill Grouchnikov
 */
public class BasicCommandButtonListener implements MouseListener,
        MouseMotionListener, FocusListener, ChangeListener {
    @Override
    public void focusLost(FocusEvent e) {
        AbstractCommandButton b = (AbstractCommandButton) e.getSource();
        // System.err.println(e.getComponent() + "\n\tlost "
        // + (e.isTemporary() ? "temporary" : "permanent")
        // + " focus to \n\t" + e.getOppositeComponent());
        b.getActionModel().setArmed(false);
        b.getActionModel().setPressed(false);
        if (b instanceof JCommandButton) {
            PopupButtonModel popupModel = ((JCommandButton) b).getPopupModel();
            popupModel.setPressed(false);
            popupModel.setArmed(false);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        AbstractCommandButton b = (AbstractCommandButton) e.getSource();
        b.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            AbstractCommandButton b = (AbstractCommandButton) e.getSource();

            JScrollablePanel scrollable = (JScrollablePanel) SwingUtilities
                    .getAncestorOfClass(JScrollablePanel.class, b);
            if (scrollable != null) {
                // scroll the viewport of the scrollable panel so that
                // the button is fully viewed.
                Point loc = SwingUtilities.convertPoint(b.getParent(), b
                        .getLocation(), scrollable.getView());
                if (scrollable.getScrollType() == JScrollablePanel.ScrollType.HORIZONTALLY) {
                    scrollable.scrollToIfNecessary(loc.x, b.getWidth());
                } else {
                    scrollable.scrollToIfNecessary(loc.y, b.getHeight());
                }
            }

            if (b.contains(e.getX(), e.getY())) {
                CommandButtonUI ui = b.getUI();
                Rectangle actionRect = ui.getLayoutInfo().actionClickArea;
                Rectangle popupRect = ui.getLayoutInfo().popupClickArea;

                if ((actionRect != null) && actionRect.contains(e.getPoint())) {
                    ButtonModel actionModel = b.getActionModel();
                    if (actionModel.isEnabled()) {
                        actionModel.setArmed(true);
                        actionModel.setPressed(true);
                    }
                } else {
                    if ((popupRect != null) && popupRect.contains(e.getPoint())) {
                        PopupButtonModel popupModel = ((JCommandButton) b)
                                .getPopupModel();
                        if (popupModel.isEnabled()) {
                            popupModel.setArmed(true);
                            popupModel.setPressed(true);
                        }
                    }
                }

                // System.err.println(b.getText() + " - hasFocus():"
                // + b.hasFocus() + ", isRequestFocusEnabled():"
                // + b.isRequestFocusEnabled());
                if (!b.hasFocus() && b.isRequestFocusEnabled()) {
                    b.requestFocusInWindow();
                }
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            AbstractCommandButton b = (AbstractCommandButton) e.getSource();
            b.getActionModel().setPressed(false);
            if (b instanceof JCommandButton) {
                ((JCommandButton) b).getPopupModel().setPressed(false);
            }
            b.getActionModel().setArmed(false);
            if (b instanceof JCommandButton) {
                ((JCommandButton) b).getPopupModel().setArmed(false);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.syncMouseMovement(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.syncMouseMovement(e);
    }

    /**
     * Synchronizes the action and popup models of the command button with the
     * specified mouse event.
     *
     * @param e Mouse event for the model synchronization.
     */
    private void syncMouseMovement(MouseEvent e) {
        AbstractCommandButton b = (AbstractCommandButton) e.getSource();
        ButtonModel actionModel = b.getActionModel();
        PopupButtonModel popupModel = (b instanceof JCommandButton) ? ((JCommandButton) b)
                .getPopupModel()
                : null;
        CommandButtonUI ui = b.getUI();
        Rectangle actionRect = ui.getLayoutInfo().actionClickArea;
        Rectangle popupRect = ui.getLayoutInfo().popupClickArea;

        if ((actionRect != null) && actionRect.contains(e.getPoint())) {
            if (actionModel.isEnabled()) {
                if (!SwingUtilities.isLeftMouseButton(e))
                    actionModel.setRollover(true);
                if (actionModel.isPressed())
                    actionModel.setArmed(true);
            }
            if (popupModel != null && !SwingUtilities.isLeftMouseButton(e))
                popupModel.setRollover(false);
        } else {
            if ((popupRect != null) && popupRect.contains(e.getPoint())) {
                if ((popupModel != null) && popupModel.isEnabled()) {
                    if (!SwingUtilities.isLeftMouseButton(e))
                        popupModel.setRollover(true);
                    if (popupModel.isPressed())
                        popupModel.setArmed(true);
                }
                if (!SwingUtilities.isLeftMouseButton(e))
                    actionModel.setRollover(false);
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        AbstractCommandButton b = (AbstractCommandButton) e.getSource();
        ButtonModel actionModel = b.getActionModel();
        PopupButtonModel popupModel = (b instanceof JCommandButton) ? ((JCommandButton) b)
                .getPopupModel()
                : null;
        actionModel.setRollover(false);
        actionModel.setArmed(false);
        if (popupModel != null) {
            popupModel.setRollover(false);
            popupModel.setArmed(false);
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        AbstractCommandButton b = (AbstractCommandButton) e.getSource();
        b.repaint();
    }

    /**
     * Installs keyboard action (space / enter keys) on the specified command
     * button.
     *
     * @param button Command button.
     */
    public void installKeyboardActions(AbstractCommandButton button) {
        ActionMap actionMap = new ActionMap();
        actionMap.put(PressAction.PRESS, new PressAction(button));
        actionMap.put(ReleaseAction.RELEASE, new ReleaseAction(button));
        actionMap.put(PopupDismissAction.DISMISS, new PopupDismissAction(button));
        actionMap.put(PopupToggleAction.TOGGLE, new PopupToggleAction(button));
        actionMap.put(FocusHomeAction.FOCUS_HOME, new FocusHomeAction(button));
        actionMap.put(FocusEndAction.FOCUS_END, new FocusEndAction(button));
        actionMap.put(FocusUpAction.FOCUS_UP, new FocusUpAction(button));
        actionMap.put(FocusDownAction.FOCUS_DOWN, new FocusDownAction(button));
        actionMap.put(FocusRightAction.FOCUS_RIGHT, new FocusRightAction(button));
        actionMap.put(FocusLeftAction.FOCUS_LEFT, new FocusLeftAction(button));
        SwingUtilities.replaceUIActionMap(button, actionMap);

        InputMap focusedInputMap = LookAndFeel.makeInputMap(new Object[] {
                "SPACE", PressAction.PRESS,
                "released SPACE", ReleaseAction.RELEASE,
                "ENTER", PressAction.PRESS,
                "released ENTER", ReleaseAction.RELEASE,
                "DOWN", FocusDownAction.FOCUS_DOWN,
                "KP_DOWN", FocusDownAction.FOCUS_DOWN,
                "UP", FocusUpAction.FOCUS_UP,
                "KP_UP", FocusUpAction.FOCUS_UP,
                "LEFT", FocusLeftAction.FOCUS_LEFT,
                "KP_LEFT", FocusLeftAction.FOCUS_LEFT,
                "RIGHT", FocusRightAction.FOCUS_RIGHT,
                "KP_RIGHT", FocusRightAction.FOCUS_RIGHT,
        });
        SwingUtilities.replaceUIInputMap(button, JComponent.WHEN_FOCUSED, focusedInputMap);

        InputMap ancestorOfFocusedInputMap = LookAndFeel.makeInputMap(new Object[] {
                "ESCAPE", PopupDismissAction.DISMISS,
                "alt DOWN", PopupToggleAction.TOGGLE,
                "alt KP_DOWN", PopupToggleAction.TOGGLE,
                "alt UP", PopupToggleAction.TOGGLE,
                "alt KP_UP", PopupToggleAction.TOGGLE,
                "HOME", FocusHomeAction.FOCUS_HOME,
                "END", FocusEndAction.FOCUS_END,
        });
        SwingUtilities.replaceUIInputMap(button, JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT,
                ancestorOfFocusedInputMap);
    }

    private static abstract class ButtonAction extends AbstractAction {
        protected final AbstractCommandButton button;

        ButtonAction(String actionName, AbstractCommandButton button) {
            super(actionName);
            this.button = button;
        }
    }

    private static class PressAction extends ButtonAction {
        private static final String PRESS = "press";

        PressAction(AbstractCommandButton button) {
            super(PRESS, button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ButtonModel model = button.getUI().isInnerFocusOnAction() ? button.getActionModel()
                    : ((JCommandButton) button).getPopupModel();
            model.setArmed(true);
            model.setPressed(true);
            if (!button.hasFocus()) {
                button.requestFocus();
            }
        }

        @Override
        public boolean isEnabled() {
            return button.getActionModel().isEnabled();
        }
    }

    private static class ReleaseAction extends ButtonAction {
        private static final String RELEASE = "release";

        ReleaseAction(AbstractCommandButton button) {
            super(RELEASE, button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ButtonModel model = button.getUI().isInnerFocusOnAction() ? button.getActionModel()
                    : ((JCommandButton) button).getPopupModel();
            model.setPressed(false);
            model.setArmed(false);
        }

        @Override
        public boolean isEnabled() {
            return button.getActionModel().isEnabled();
        }
    }

    private static class PopupDismissAction extends ButtonAction {
        private static final String DISMISS = "popupDismiss";

        PopupDismissAction(AbstractCommandButton button) {
            super(DISMISS, button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            PopupPanelManager.defaultManager().hidePopups(null);
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }

    private static class PopupToggleAction extends ButtonAction {
        private static final String TOGGLE = "popupToggle";

        PopupToggleAction(AbstractCommandButton button) {
            super(TOGGLE, button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (this.button instanceof JCommandButton &&
                    !this.button.getUI().isInnerFocusOnAction()) {
                ButtonModel model = ((JCommandButton) button).getPopupModel();
                if (PopupPanelManager.defaultManager().getShownPath().isEmpty()) {
                    model.setArmed(true);
                    model.setPressed(true);
                } else {
                    PopupPanelManager.defaultManager().hidePopups(null);
                    model.setArmed(false);
                    model.setPressed(false);
                }
            }
        }

        @Override
        public boolean isEnabled() {
            return ((this.button instanceof JCommandButton) &&
                    ((JCommandButton) this.button).getPopupModel().isEnabled());
        }
    }

    private static abstract class FocusTraversalAction extends ButtonAction {
        FocusTraversalAction(String actionName, AbstractCommandButton button) {
            super(actionName, button);
        }

        @Override
        public boolean isEnabled() {
            return true;
        }

        protected JPopupPanel getPopup() {
            JPopupPanel popupPanel = (JPopupPanel) SwingUtilities.getAncestorOfClass(
                    JPopupPanel.class, this.button);
            if (popupPanel != null) {
                return popupPanel;
            }

            PopupPanelManager popupPanelManager = PopupPanelManager.defaultManager();
            for (PopupPanelManager.PopupInfo popupInfo : popupPanelManager.getShownPath()) {
                if (popupInfo.getPopupOriginator() == this.button) {
                    return popupInfo.getPopupPanel();
                }
            }
            return null;
        }
    }

    private static class FocusHomeAction extends FocusTraversalAction {
        private static final String FOCUS_HOME = "focusHome";

        FocusHomeAction(AbstractCommandButton button) {
            super(FOCUS_HOME, button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JPopupPanel popupPanel = getPopup();
            if (popupPanel != null) {
                popupPanel.getUI().focusFirst();
            }
        }
    }

    private static class FocusEndAction extends FocusTraversalAction {
        private static final String FOCUS_END = "focusEnd";

        FocusEndAction(AbstractCommandButton button) {
            super(FOCUS_END, button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JPopupPanel popupPanel = getPopup();
            if (popupPanel != null) {
                popupPanel.getUI().focusLast();
            }
        }
    }

    private static class FocusUpAction extends FocusTraversalAction {
        private static final String FOCUS_UP = "focusUp";

        FocusUpAction(AbstractCommandButton button) {
            super(FOCUS_UP, button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JPopupPanel popupPanel = getPopup();
            if (popupPanel != null) {
                popupPanel.getUI().focusUp();
            }
        }
    }

    private static class FocusDownAction extends FocusTraversalAction {
        private static final String FOCUS_DOWN = "focusDown";

        FocusDownAction(AbstractCommandButton button) {
            super(FOCUS_DOWN, button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JPopupPanel popupPanel = getPopup();
            if (popupPanel != null) {
                popupPanel.getUI().focusDown();
            }
        }
    }

    private static class FocusRightAction extends FocusTraversalAction {
        private static final String FOCUS_RIGHT = "focusRight";

        FocusRightAction(AbstractCommandButton button) {
            super(FOCUS_RIGHT, button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JPopupPanel popupPanel = getPopup();
            if (popupPanel != null) {
                popupPanel.getUI().focusRight();
            }
        }
    }

    private static class FocusLeftAction extends FocusTraversalAction {
        private static final String FOCUS_LEFT = "focusLeft";

        FocusLeftAction(AbstractCommandButton button) {
            super(FOCUS_LEFT, button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JPopupPanel popupPanel = getPopup();
            if (popupPanel != null) {
                popupPanel.getUI().focusLeft();
            }
        }
    }

    /**
     * Uninstalls keyboard action from the specified command button.
     *
     * @param button Command button.
     */
    public void uninstallKeyboardActions(AbstractCommandButton button) {
        SwingUtilities.replaceUIInputMap(button,
                JComponent.WHEN_IN_FOCUSED_WINDOW, null);
        SwingUtilities.replaceUIInputMap(button, JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT,
                null);
        SwingUtilities.replaceUIInputMap(button, JComponent.WHEN_FOCUSED, null);
        SwingUtilities.replaceUIActionMap(button, null);
    }
}
