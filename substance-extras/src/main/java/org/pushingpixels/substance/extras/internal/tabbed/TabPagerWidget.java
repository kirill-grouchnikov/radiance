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
package org.pushingpixels.substance.extras.internal.tabbed;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.extras.api.tabbed.TabPreviewPainter;
import org.pushingpixels.substance.extras.internal.SubstanceExtrasSynapse;

/**
 * Adds tab pager to tabbed panes.
 * 
 * @author Kirill Grouchnikov
 */
public class TabPagerWidget extends SubstanceWidget<JTabbedPane> {
    /**
     * Mouse wheel listener for Ctrl paging (from version 2.1).
     */
    protected MouseWheelListener mouseWheelListener;

    /**
     * Mouse listener for Ctrl paging (from version 2.1).
     */
    protected MouseListener mouseListener;

    protected PropertyChangeListener propertyChangeListener;

    @Override
    public void installUI() {
        super.installUI();
        if (TabPreviewUtilities.getTabPreviewPainter(this.jcomp) != null) {
            installMaps();
        }
    }

    private void installMaps() {
        InputMap currMap = SwingUtilities.getUIInputMap(this.jcomp,
                JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        InputMap newMap = new InputMap();
        if (currMap != null) {
            KeyStroke[] kss = currMap.allKeys();
            for (int i = 0; i < kss.length; i++) {
                KeyStroke stroke = kss[i];
                Object val = currMap.get(stroke);
                newMap.put(stroke, val);
            }
        }

        newMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, InputEvent.CTRL_MASK),
                "tabSwitcherForward");
        newMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, InputEvent.CTRL_MASK),
                "tabSwitcherBackward");
        newMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_CONTROL, 0, true), "tabSwitcherClose");
        newMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "tabSwitcherHide");

        this.jcomp.getActionMap().put("tabSwitcherForward", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                // fix for issue 323 in Substance - don't show pager on
                // tabbed
                // panes with no preview painter
                TabPreviewPainter tpp = TabPreviewUtilities
                        .getTabPreviewPainter(TabPagerWidget.this.jcomp);
                if (tpp == null)
                    return;

                TabPagerManager te = TabPagerManager.getPager();
                te.page(TabPagerWidget.this.jcomp, true);
            }
        });

        this.jcomp.getActionMap().put("tabSwitcherBackward", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                // fix for issue 323 in Substance - don't show pager on
                // tabbed panes with no preview painter
                TabPreviewPainter tpp = TabPreviewUtilities
                        .getTabPreviewPainter(TabPagerWidget.this.jcomp);
                if (tpp == null)
                    return;

                TabPagerManager te = TabPagerManager.getPager();
                te.page(TabPagerWidget.this.jcomp, false);
            }
        });

        this.jcomp.getActionMap().put("tabSwitcherClose", new AbstractAction() {
            public void actionPerformed(final ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                        // fix for issue 323 in Substance - don't show pager on
                        // tabbed panes with no preview painter
                        TabPreviewPainter tpp = TabPreviewUtilities
                                .getTabPreviewPainter(TabPagerWidget.this.jcomp);
                        if (tpp == null) {
                            return;
                        }

                        TabPagerManager te = TabPagerManager.getPager();
                        int index = te.hide();
                        // fix for issue 177 in Substance (disallowing selection
                        // of disabled tabs).
                        if ((index >= 0)
                                && tpp.isSensitiveToEvents(TabPagerWidget.this.jcomp, index)) {
                            TabPagerWidget.this.jcomp.setSelectedIndex(index);
                        }
                });
            }
        });

        this.jcomp.getActionMap().put("tabSwitcherHide", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                TabPagerManager te = TabPagerManager.getPager();
                if (te.isVisible()) {
                    te.hide();
                } else {
                    // fix for defect 233 on Substance - the key event
                    // is not dispatched when tab pager is not showing.
                    Component comp = jcomp.getParent();
                    while (comp != null) {
                        if (comp instanceof JComponent) {
                            JComponent jc = (JComponent) comp;
                            KeyStroke escapeKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,
                                    0, false);
                            ActionListener al = jc.getActionForKeyStroke(escapeKeyStroke);
                            if (al != null) {
                                al.actionPerformed(e);
                                return;
                            }
                        }
                        comp = comp.getParent();
                    }
                }
            }
        });

        SwingUtilities.replaceUIInputMap(this.jcomp, JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT,
                newMap);
    }

    private void uninstallMaps() {
        InputMap currMap = SwingUtilities.getUIInputMap(this.jcomp,
                JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        InputMap newMap = new InputMap();
        if (currMap != null) {
            KeyStroke[] kss = currMap.allKeys();
            for (int i = 0; i < kss.length; i++) {
                KeyStroke stroke = kss[i];
                Object val = currMap.get(stroke);
                if (stroke
                        .equals(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, InputEvent.CTRL_MASK))) {
                    if ("tabSwitcherForward".equals(val))
                        continue;
                }
                if (stroke.equals(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, InputEvent.CTRL_MASK))) {
                    if ("tabSwitcherBackward".equals(val))
                        continue;
                }
                if (stroke.equals(KeyStroke.getKeyStroke(KeyEvent.VK_CONTROL, 0, true))) {
                    if ("tabSwitcherClose".equals(val))
                        continue;
                }
                if (stroke.equals(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0))) {
                    if ("tabSwitcherHide".equals(val))
                        continue;
                }
                newMap.put(stroke, val);
            }
        }

        this.jcomp.getActionMap().remove("tabSwitcherForward");
        this.jcomp.getActionMap().remove("tabSwitcherBackward");
        this.jcomp.getActionMap().remove("tabSwitcherClose");
        this.jcomp.getActionMap().remove("tabSwitcherHide");

        SwingUtilities.replaceUIInputMap(this.jcomp, JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT,
                newMap);
    }

    @Override
    public void uninstallUI() {
        this.uninstallMaps();
        super.uninstallUI();
    }

    @Override
    public void installListeners() {
        this.mouseWheelListener = new TabPagerMouseWheelListener(this.jcomp);
        this.jcomp.addMouseWheelListener(this.mouseWheelListener);
        this.mouseListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if ((e.getModifiers() & InputEvent.CTRL_MASK) != 0) {
                    SwingUtilities.invokeLater(() -> {
                        TabPagerManager te = TabPagerManager.getPager();
                        int index = te.hide();
                        if (index >= 0)
                            TabPagerWidget.this.jcomp.setSelectedIndex(index);
                    });
                }
            }
        };
        this.jcomp.addMouseListener(this.mouseListener);

        this.propertyChangeListener = (PropertyChangeEvent evt) -> {
            if (SubstanceExtrasSynapse.TABBED_PANE_PREVIEW_PAINTER.equals(evt.getPropertyName())) {
                TabPreviewPainter oldValue = (TabPreviewPainter) evt.getOldValue();
                TabPreviewPainter newValue = (TabPreviewPainter) evt.getNewValue();
                if ((oldValue == null) && (newValue != null)) {
                    installMaps();
                }
                if ((oldValue != null) && (newValue == null)) {
                    uninstallMaps();
                }
            }
        };
        this.jcomp.addPropertyChangeListener(this.propertyChangeListener);
    }

    @Override
    public void uninstallListeners() {
        this.jcomp.removeMouseWheelListener(this.mouseWheelListener);
        this.mouseWheelListener = null;

        this.jcomp.removeMouseListener(this.mouseListener);
        this.mouseListener = null;

        this.jcomp.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;
    }
}
