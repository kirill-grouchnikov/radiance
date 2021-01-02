/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.internal.widget.text;

import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;

/**
 * Adds "select / deselect on Escape key press" behaviour on text components.
 * 
 * @author Kirill Grouchnikov
 */
public class SelectOnEscapeWidget extends SubstanceWidget<JTextComponent> {
    private PropertyChangeListener propertyChangeListener;

    private static final String FLIP_SELECTION_KEY = "substancelaf.internal.flipTextSelection";

    private void installTracking() {
        InputMap currMap = SwingUtilities.getUIInputMap(this.jcomp, JComponent.WHEN_FOCUSED);

        InputMap newMap = new InputMap();
        if (currMap != null) {
            KeyStroke[] kss = currMap.allKeys();
            for (KeyStroke stroke : kss) {
                Object val = currMap.get(stroke);
                newMap.put(stroke, val);
            }
        }

        newMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), FLIP_SELECTION_KEY);

        this.jcomp.getActionMap().put(FLIP_SELECTION_KEY, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    int selectionLength = jcomp.getSelectionEnd() - jcomp.getSelectionStart();
                    if (selectionLength == 0) {
                        jcomp.selectAll();
                    } else {
                        int lastPos = jcomp.getSelectionEnd();
                        jcomp.setSelectionStart(0);
                        jcomp.setSelectionEnd(0);
                        jcomp.setCaretPosition(lastPos);
                    }
                });
            }
        });

        SwingUtilities.replaceUIInputMap(this.jcomp, JComponent.WHEN_FOCUSED, newMap);
    }

    private void uninstallTracking() {
        InputMap currMap = SwingUtilities.getUIInputMap(this.jcomp, JComponent.WHEN_FOCUSED);
        if (currMap != null) {
            InputMap newMap = new InputMap();
            KeyStroke[] kss = currMap.allKeys();
            for (KeyStroke stroke : kss) {
                Object val = currMap.get(stroke);
                if (stroke.equals(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0))
                        && FLIP_SELECTION_KEY.equals(val)) {
                    continue;
                }
                newMap.put(stroke, val);
            }
            SwingUtilities.replaceUIInputMap(this.jcomp, JComponent.WHEN_FOCUSED, newMap);
        }
        this.jcomp.getActionMap().remove(FLIP_SELECTION_KEY);
    }

    @Override
    public void installListeners() {
        this.propertyChangeListener = propertyChangeEvent -> {
            if (SubstanceSynapse.TEXT_FLIP_SELECT_ON_ESCAPE.equals(
                    propertyChangeEvent.getPropertyName())) {
                boolean hasTextFlipSelection =
                        WidgetUtilities.hasTextFlipSelectOnEscapeProperty(jcomp);
                if (hasTextFlipSelection) {
                    // change the input map
                    installTracking();
                } else {
                    // remove the input map
                    uninstallTracking();
                }
            }
        };
        this.jcomp.addPropertyChangeListener(this.propertyChangeListener);
    }

    @Override
    public void uninstallListeners() {
        this.jcomp.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;
    }
}
