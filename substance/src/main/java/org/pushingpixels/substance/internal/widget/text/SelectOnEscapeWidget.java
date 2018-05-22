/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;

import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;

/**
 * Adds "select / deselect on Escape key press" behaviour on text components.
 * 
 * @author Kirill Grouchnikov
 * @since 2.1
 */
public class SelectOnEscapeWidget extends SubstanceWidget<JTextComponent> {
    protected PropertyChangeListener propertyChangeListener;

    private void installTracking() {
        InputMap currMap = SwingUtilities.getUIInputMap(this.jcomp, JComponent.WHEN_FOCUSED);

        InputMap newMap = new InputMap();
        if (currMap != null) {
            KeyStroke[] kss = currMap.allKeys();
            for (int i = 0; i < kss.length; i++) {
                KeyStroke stroke = kss[i];
                Object val = currMap.get(stroke);
                newMap.put(stroke, val);
            }
        }

        newMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "flipTextSelection");

        this.jcomp.getActionMap().put("flipTextSelection", new AbstractAction() {
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
            for (int i = 0; i < kss.length; i++) {
                KeyStroke stroke = kss[i];
                Object val = currMap.get(stroke);
                if (stroke.equals(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0))
                        && "flipTextSelection".equals(val)) {
                    continue;
                }
                newMap.put(stroke, val);
            }
            SwingUtilities.replaceUIInputMap(this.jcomp, JComponent.WHEN_FOCUSED, newMap);
        }
        this.jcomp.getActionMap().remove("flipTextSelection");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#installListeners()
     */
    @Override
    public void installListeners() {
        this.propertyChangeListener = (PropertyChangeEvent evt) -> {
            if (SubstanceSynapse.TEXT_FLIP_SELECT_ON_ESCAPE.equals(evt.getPropertyName())) {
                boolean hasTextFlipSelection = WidgetUtilities
                        .hasTextFlipSelectOnEscapeProperty(jcomp);
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

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#uninstallListeners()
     */
    @Override
    public void uninstallListeners() {
        this.jcomp.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;
    }
}
