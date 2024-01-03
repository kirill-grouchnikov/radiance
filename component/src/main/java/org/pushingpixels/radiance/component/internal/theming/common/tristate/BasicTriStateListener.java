/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.theming.common.tristate;

import org.pushingpixels.radiance.common.api.model.TriStateButtonModel;
import org.pushingpixels.radiance.component.api.common.JTriStateCheckBox;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.util.Objects;

public abstract class BasicTriStateListener implements MouseListener, MouseMotionListener,
        FocusListener, ChangeListener {
    protected JTriStateCheckBox button;

    public BasicTriStateListener(JTriStateCheckBox button) {
        this.button = button;
    }

    public void installKeyboardActions() {
        ActionMap actionMap = new ActionMap();
        actionMap.put(TriStateAction.PRESS, new TriStateAction(TriStateAction.PRESS));
        actionMap.put(TriStateAction.RELEASE, new TriStateAction(TriStateAction.RELEASE));
        SwingUtilities.replaceUIActionMap(this.button, actionMap);

        InputMap km = (InputMap) UIManager.get("CheckBox.focusInputMap");
        SwingUtilities.replaceUIInputMap(this.button, JComponent.WHEN_FOCUSED, km);
    }

    public void uninstallKeyboardActions() {
        SwingUtilities.replaceUIInputMap(this.button, JComponent.WHEN_IN_FOCUSED_WINDOW, null);
        SwingUtilities.replaceUIInputMap(this.button, JComponent.WHEN_FOCUSED, null);
        SwingUtilities.replaceUIActionMap(this.button, null);
    }

    public void stateChanged(ChangeEvent e) {
        JTriStateCheckBox b = (JTriStateCheckBox) e.getSource();
        b.invalidate();
        b.revalidate();
        b.repaint();
    }

    public void focusGained(FocusEvent e) {
    }

    public void focusLost(FocusEvent e) {
        JTriStateCheckBox b = (JTriStateCheckBox) e.getSource();
        TriStateButtonModel model = b.getTriStateButtonModel();
        model.setPressed(false);
        b.repaint();
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            JTriStateCheckBox b = (JTriStateCheckBox) e.getSource();

            if (b.contains(e.getX(), e.getY())) {
                TriStateButtonModel model = b.getTriStateButtonModel();
                if (!model.isEnabled()) {
                    return;
                }
                model.setPressed(true);
                if (!b.hasFocus() && b.isRequestFocusEnabled()) {
                    b.requestFocus();
                }
            }
        }
    }

    public void mouseReleased(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            JTriStateCheckBox b = (JTriStateCheckBox) e.getSource();
            TriStateButtonModel model = b.getTriStateButtonModel();
            model.setPressed(false);
        }
    }

    public void mouseEntered(MouseEvent e) {
        JTriStateCheckBox b = (JTriStateCheckBox) e.getSource();
        TriStateButtonModel model = b.getTriStateButtonModel();
        if (!SwingUtilities.isLeftMouseButton(e)) {
            model.setRollover(true);
        }
    }

    public void mouseExited(MouseEvent e) {
        JTriStateCheckBox b = (JTriStateCheckBox) e.getSource();
        TriStateButtonModel model = b.getTriStateButtonModel();
        model.setRollover(false);
    }

    private static class TriStateAction implements Action {
        private static final String PRESS = "pressed";
        private static final String RELEASE = "released";

        private String name;

        private TriStateAction(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void actionPerformed(ActionEvent e) {
            JTriStateCheckBox b = (JTriStateCheckBox) e.getSource();
            String key = getName();
            if (Objects.equals(key, PRESS)) {
                TriStateButtonModel model = b.getTriStateButtonModel();
                model.setPressed(true);
                if (!b.hasFocus()) {
                    b.requestFocus();
                }
            } else if (Objects.equals(key, RELEASE)) {
                TriStateButtonModel model = b.getTriStateButtonModel();
                model.setPressed(false);
            }
        }

        @Override
        public boolean isEnabled() {
            return true;
        }

        @Override
        public void setEnabled(boolean b) {
        }

        @Override
        public Object getValue(String key) {
            if (Objects.equals(key, NAME)) {
                return this.name;
            }
            return null;
        }

        @Override
        public void putValue(String key, Object value) {
        }

        @Override
        public void addPropertyChangeListener(PropertyChangeListener listener) {
        }

        @Override
        public void removePropertyChangeListener(PropertyChangeListener listener) {
        }
    }
}
