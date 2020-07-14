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
package org.pushingpixels.flamingo.internal.ui.common.popup;

import org.pushingpixels.flamingo.api.common.popup.JPopupPanel;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.trident.api.Timeline;
import org.pushingpixels.trident.api.swing.SwingRepaintCallback;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

/**
 * Basic UI for color selector component {@link JColorSelectorComponent}.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BasicColorSelectorComponentUI extends ColorSelectorComponentUI {
    protected JColorSelectorComponent colorSelectorComponent;

    protected ButtonModel buttonModel;

    private MouseListener mouseListener;

    private ChangeListener modelChangeListener;

    private ActionListener actionListener;

    private Timeline rolloverTimeline;

    protected float rollover;

    private FocusListener focusListener;

    protected BasicColorSelectorComponentUI() {
        this.buttonModel = new DefaultButtonModel();
    }

    @Override
    public void installUI(JComponent c) {
        this.colorSelectorComponent = (JColorSelectorComponent) c;

        installDefaults();
        installComponents();
        installKeyboardActions();
        installListeners();
    }

    @Override
    public void uninstallUI(JComponent c) {
        uninstallListeners();
        uninstallKeyboardActions();
        uninstallComponents();
        uninstallDefaults();

        c.setLayout(null);

        this.colorSelectorComponent = null;
    }

    /**
     * Installs listeners on the associated color selector component.
     */
    protected void installListeners() {
        this.mouseListener = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (!buttonModel.isRollover()) {
                    colorSelectorComponent.onColorPreviewActivated(
                            colorSelectorComponent.getColor());
                    rolloverTimeline.play();
                }
                buttonModel.setRollover(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (buttonModel.isRollover()) {
                    colorSelectorComponent.onColorPreviewCanceled();
                    rolloverTimeline.playReverse();
                }
                buttonModel.setRollover(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                buttonModel.setArmed(true);
                buttonModel.setPressed(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                buttonModel.setPressed(false);
                buttonModel.setArmed(false);
            }
        };
        this.colorSelectorComponent.addMouseListener(this.mouseListener);

        this.modelChangeListener = changeEvent -> colorSelectorComponent.repaint();
        this.buttonModel.addChangeListener(this.modelChangeListener);

        this.actionListener = actionEvent -> {
            colorSelectorComponent.onColorActivated(colorSelectorComponent.getColor());

            PopupPanelManager.defaultManager().hidePopups(null);
        };
        this.buttonModel.addActionListener(this.actionListener);

        this.focusListener = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                colorSelectorComponent.onColorPreviewActivated(
                        colorSelectorComponent.getColor());
                colorSelectorComponent.repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                colorSelectorComponent.onColorPreviewCanceled();
                colorSelectorComponent.repaint();
            }
        };
        this.colorSelectorComponent.addFocusListener(this.focusListener);
    }

    /**
     * Uninstalls listeners from the associated color selector component.
     */
    protected void uninstallListeners() {
        this.buttonModel.removeActionListener(this.actionListener);
        this.actionListener = null;

        this.buttonModel.removeChangeListener(this.modelChangeListener);
        this.modelChangeListener = null;

        this.colorSelectorComponent.removeMouseListener(this.mouseListener);
        this.mouseListener = null;

        this.colorSelectorComponent.removeFocusListener(this.focusListener);
        this.focusListener = null;
    }

    /**
     * Installs defaults on the associated color selector component.
     */
    protected void installDefaults() {
        this.rolloverTimeline = Timeline.builder(this)
                .addPropertyToInterpolate("rollover", 0.0f, 1.0f)
                .addCallback(new SwingRepaintCallback(this.colorSelectorComponent))
                .setDuration(150)
                .build();
    }

    /**
     * Uninstalls defaults from the associated color selector component.
     */
    protected void uninstallDefaults() {
    }

    /**
     * Installs subcomponents on the associated color selector component.
     */
    protected void installComponents() {
    }

    /**
     * Uninstalls subcomponents from the associated color selector component.
     */
    protected void uninstallComponents() {
    }

    private void installKeyboardActions() {
        ActionMap actionMap = new ActionMap();
        actionMap.put(PressAction.PRESS, new PressAction(this.colorSelectorComponent));
        actionMap.put(ReleaseAction.RELEASE, new ReleaseAction(this.colorSelectorComponent));
        actionMap.put(PopupDismissAction.DISMISS,
                new PopupDismissAction(this.colorSelectorComponent));
        actionMap.put(FocusUpAction.FOCUS_UP, new FocusUpAction(this.colorSelectorComponent));
        actionMap.put(FocusDownAction.FOCUS_DOWN, new FocusDownAction(this.colorSelectorComponent));
        actionMap.put(FocusRightAction.FOCUS_RIGHT,
                new FocusRightAction(this.colorSelectorComponent));
        actionMap.put(FocusLeftAction.FOCUS_LEFT, new FocusLeftAction(this.colorSelectorComponent));
        SwingUtilities.replaceUIActionMap(this.colorSelectorComponent, actionMap);

        InputMap focusedInputMap = LookAndFeel.makeInputMap(new Object[] {
                "SPACE", PressAction.PRESS,
                "released SPACE", ReleaseAction.RELEASE,
                "ENTER", PressAction.PRESS,
                "released ENTER", ReleaseAction.RELEASE,
                "ESCAPE", PopupDismissAction.DISMISS,
                "DOWN", FocusDownAction.FOCUS_DOWN,
                "KP_DOWN", FocusDownAction.FOCUS_DOWN,
                "UP", FocusUpAction.FOCUS_UP,
                "KP_UP", FocusUpAction.FOCUS_UP,
                "LEFT", FocusLeftAction.FOCUS_LEFT,
                "KP_LEFT", FocusLeftAction.FOCUS_LEFT,
                "RIGHT", FocusRightAction.FOCUS_RIGHT,
                "KP_RIGHT", FocusRightAction.FOCUS_RIGHT,
        });
        SwingUtilities.replaceUIInputMap(this.colorSelectorComponent, JComponent.WHEN_FOCUSED,
                focusedInputMap);
    }

    private void uninstallKeyboardActions() {
        SwingUtilities.replaceUIInputMap(this.colorSelectorComponent, JComponent.WHEN_FOCUSED,
                null);
        SwingUtilities.replaceUIActionMap(this.colorSelectorComponent, null);
    }

    private abstract static class ColorSelectorComponentAction extends AbstractAction {
        protected final JColorSelectorComponent colorSelectorComponent;

        ColorSelectorComponentAction(String actionName,
                JColorSelectorComponent colorSelectorComponent) {
            super(actionName);
            this.colorSelectorComponent = colorSelectorComponent;
        }
    }

    private class PressAction extends ColorSelectorComponentAction {
        private static final String PRESS = "press";

        PressAction(JColorSelectorComponent colorSelectorComponent) {
            super(PRESS, colorSelectorComponent);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonModel.setArmed(true);
            buttonModel.setPressed(true);
            if (!this.colorSelectorComponent.hasFocus()) {
                this.colorSelectorComponent.requestFocus();
            }
        }
    }

    private class ReleaseAction extends ColorSelectorComponentAction {
        private static final String RELEASE = "release";

        ReleaseAction(JColorSelectorComponent colorSelectorComponent) {
            super(RELEASE, colorSelectorComponent);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonModel.setPressed(false);
            buttonModel.setArmed(false);
        }
    }

    private class PopupDismissAction extends ColorSelectorComponentAction {
        private static final String DISMISS = "popupDismiss";

        PopupDismissAction(JColorSelectorComponent colorSelectorComponent) {
            super(DISMISS, colorSelectorComponent);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            PopupPanelManager.defaultManager().hidePopups(null);
        }
    }

    private abstract class FocusTraversalAction extends ColorSelectorComponentAction {
        FocusTraversalAction(String actionName, JColorSelectorComponent colorSelectorComponent) {
            super(actionName, colorSelectorComponent);
        }

        protected JPopupPanel getPopup() {
            JPopupPanel popupPanel = (JPopupPanel) SwingUtilities.getAncestorOfClass(
                    JPopupPanel.class, this.colorSelectorComponent);
            if (popupPanel != null) {
                return popupPanel;
            }

            PopupPanelManager popupPanelManager = PopupPanelManager.defaultManager();
            for (PopupPanelManager.PopupInfo popupInfo : popupPanelManager.getShownPath()) {
                if (popupInfo.getPopupOriginator() == this.colorSelectorComponent) {
                    return popupInfo.getPopupPanel();
                }
            }
            return null;
        }
    }

    private class FocusUpAction extends FocusTraversalAction {
        private static final String FOCUS_UP = "focusUp";

        FocusUpAction(JColorSelectorComponent colorSelectorComponent) {
            super(FOCUS_UP, colorSelectorComponent);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JPopupPanel popupPanel = getPopup();
            if (popupPanel != null) {
                popupPanel.getUI().focusUp();
            }
        }
    }

    private class FocusDownAction extends FocusTraversalAction {
        private static final String FOCUS_DOWN = "focusDown";

        FocusDownAction(JColorSelectorComponent colorSelectorComponent) {
            super(FOCUS_DOWN, colorSelectorComponent);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JPopupPanel popupPanel = getPopup();
            if (popupPanel != null) {
                popupPanel.getUI().focusDown();
            }
        }
    }

    private class FocusRightAction extends FocusTraversalAction {
        private static final String FOCUS_RIGHT = "focusRight";

        FocusRightAction(JColorSelectorComponent colorSelectorComponent) {
            super(FOCUS_RIGHT, colorSelectorComponent);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JPopupPanel popupPanel = getPopup();
            if (popupPanel != null) {
                popupPanel.getUI().focusRight();
            }
        }
    }

    private class FocusLeftAction extends FocusTraversalAction {
        private static final String FOCUS_LEFT = "focusLeft";

        FocusLeftAction(JColorSelectorComponent colorSelectorComponent) {
            super(FOCUS_LEFT, colorSelectorComponent);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JPopupPanel popupPanel = getPopup();
            if (popupPanel != null) {
                popupPanel.getUI().focusLeft();
            }
        }
    }

    public void setRollover(float rollover) {
        this.rollover = rollover;
    }

    @Override
    public void update(Graphics g, JComponent c) {
        int w = this.colorSelectorComponent.getWidth();
        int h = this.colorSelectorComponent.getHeight();
        Graphics2D g2d = (Graphics2D) g.create();

        Color fillColor = this.colorSelectorComponent.getColor();
        g2d.setColor(fillColor);
        g2d.fillRect(0, 0, w, h);

        float[] hsb = new float[3];
        Color.RGBtoHSB(fillColor.getRed(), fillColor.getGreen(), fillColor.getBlue(), hsb);
        float brightness = hsb[2] * 0.7f;
        g2d.setColor(new Color(brightness, brightness, brightness));

        float borderThickness = 1.0f / (float) NeonCortex.getScaleFactor();
        float ty = this.colorSelectorComponent.isTopOpen() ? borderThickness : 0;
        float by = this.colorSelectorComponent.isBottomOpen() ? borderThickness : 0;
        g2d.setStroke(
                new BasicStroke(borderThickness, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(
                new Rectangle2D.Double(0, -ty, w - borderThickness, h - borderThickness + ty + by));

        if (this.rollover > 0.0f) {
            this.paintRolloverIndication(g2d);
        }

        if (this.colorSelectorComponent.hasFocus()) {
            this.paintFocus(g2d);
        }

        g2d.dispose();
    }

    protected abstract void paintRolloverIndication(Graphics g);

    protected abstract void paintFocus(Graphics g);
}
