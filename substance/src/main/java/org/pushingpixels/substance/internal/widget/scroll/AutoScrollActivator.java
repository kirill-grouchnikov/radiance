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
package org.pushingpixels.substance.internal.widget.scroll;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.Border;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIconPack;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Christopher Deckers (chrriis@nextencia.net) http://www.nextencia.net
 * 
 * @author Christopher Deckers
 */
public class AutoScrollActivator {

    private JScrollPane scrollPane;

    public AutoScrollActivator(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
        configureScrollPane();
    }

    private static class AutoScrollProperties {
        public Point startLocation;
        public Point currentLocation;
        public Timer timer;
        public AWTEventListener toolkitListener;
        public boolean isDragMode;
        public JPopupMenu iconPopupMenu;
    }

    private AutoScrollProperties autoScrollProperties;

    private void deactivateAutoScroll() {
        if (autoScrollProperties == null)
            return;
        autoScrollProperties.timer.stop();
        Toolkit.getDefaultToolkit().removeAWTEventListener(autoScrollProperties.toolkitListener);
        autoScrollProperties.iconPopupMenu.setVisible(false);
        autoScrollProperties = null;
    }

    private void activateAutoScroll(MouseEvent e) {
        autoScrollProperties = new AutoScrollProperties();
        autoScrollProperties.isDragMode = false;
        JViewport viewport = scrollPane.getViewport();
        autoScrollProperties.currentLocation = MouseInfo.getPointerInfo().getLocation();
        SwingUtilities.convertPointFromScreen(autoScrollProperties.currentLocation, viewport);
        autoScrollProperties.startLocation = autoScrollProperties.currentLocation;
        // We use a popup menu so that it can be heavyweight or lightweight
        // depending on the context.
        // By default it is probably lightweight and thus uses alpha
        // transparency
        final JPopupMenu iconPopupMenu = new JPopupMenu() {
            @Override
            public void setBorder(Border border) {
                // Overriden to avoid having a border set by the L&F
            }
        };
        iconPopupMenu.setFocusable(false);
        iconPopupMenu.setOpaque(false);
        JLabel iconLabel = new JLabel(getAutoScrollIcon());
        iconLabel.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                deactivateAutoScroll();
            }
        });
        iconPopupMenu.add(iconLabel);
        iconPopupMenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                iconPopupMenu.setVisible(false);
            }
        });
        autoScrollProperties.iconPopupMenu = iconPopupMenu;
        Dimension iconPopupMenuSize = iconPopupMenu.getPreferredSize();
        iconPopupMenu.show(viewport,
                autoScrollProperties.startLocation.x - iconPopupMenuSize.width / 2,
                autoScrollProperties.startLocation.y - iconPopupMenuSize.height / 2);
        // Assumption: the popup menu has a parent that is itself added to the
        // glass pane or to a window.
        // Some L&F will create borders to that parent, and we don't want that.
        Container parent = iconPopupMenu.getParent();
        if (parent instanceof JComponent) {
            ((JComponent) parent).setBorder(null);
        }
        ActionListener actionListener = (ActionEvent actionEvent) -> {
            JViewport scrollPaneViewport = scrollPane.getViewport();
            Component view = scrollPaneViewport.getView();
            if (view == null) {
                return;
            }
            Point viewPosition = scrollPaneViewport.getViewPosition();
            int offsetX = autoScrollProperties.currentLocation.x
                    - autoScrollProperties.startLocation.x;
            int offsetY = autoScrollProperties.currentLocation.y
                    - autoScrollProperties.startLocation.y;
            offsetX = offsetX > 0 ? Math.max(0, offsetX - 4) : Math.min(0, offsetX + 4);
            offsetY = offsetY > 0 ? Math.max(0, offsetY - 4) : Math.min(0, offsetY + 4);
            viewPosition = new Point(viewPosition.x + offsetX, viewPosition.y + offsetY);
            Dimension extentSize = scrollPaneViewport.getExtentSize();
            Dimension viewSize = view.getSize();
            if (viewSize.width - viewPosition.x < extentSize.width) {
                viewPosition.x = viewSize.width - extentSize.width;
            }
            if (viewSize.height - viewPosition.y < extentSize.height) {
                viewPosition.y = viewSize.height - extentSize.height;
            }
            if (viewPosition.x < 0) {
                viewPosition.x = 0;
            }
            if (viewPosition.y < 0) {
                viewPosition.y = 0;
            }
            scrollPaneViewport.setViewPosition(viewPosition);
        };
        autoScrollProperties.timer = new Timer(50, actionListener);
        autoScrollProperties.timer.start();
        autoScrollProperties.toolkitListener = (AWTEvent awtEvent) -> {
            int eventID = awtEvent.getID();
            switch (eventID) {
            case MouseEvent.MOUSE_MOVED:
            case MouseEvent.MOUSE_DRAGGED:
                JViewport scrollPaneViewport = scrollPane.getViewport();
                autoScrollProperties.currentLocation = MouseInfo.getPointerInfo().getLocation();
                SwingUtilities.convertPointFromScreen(autoScrollProperties.currentLocation,
                        scrollPaneViewport);
                if (!autoScrollProperties.isDragMode && eventID == MouseEvent.MOUSE_DRAGGED) {
                    Dimension size = new Dimension(
                            Math.abs(autoScrollProperties.currentLocation.x
                                    - autoScrollProperties.startLocation.x),
                            Math.abs(autoScrollProperties.currentLocation.y
                                    - autoScrollProperties.startLocation.y));
                    autoScrollProperties.isDragMode = size.width > SCROLL_ICON_SIZE / 2
                            || size.height > SCROLL_ICON_SIZE / 2;
                }
                break;
            case MouseEvent.MOUSE_PRESSED:
            case MouseEvent.MOUSE_WHEEL:
                deactivateAutoScroll();
                break;
            case MouseEvent.MOUSE_RELEASED:
                if (autoScrollProperties.isDragMode && ((MouseEvent) awtEvent).getButton() == 2) {
                    deactivateAutoScroll();
                }
                break;
            case WindowEvent.WINDOW_LOST_FOCUS:
                deactivateAutoScroll();
                break;
            }
        };
        Toolkit.getDefaultToolkit().addAWTEventListener(autoScrollProperties.toolkitListener,
                AWTEvent.MOUSE_MOTION_EVENT_MASK | AWTEvent.MOUSE_EVENT_MASK
                        | AWTEvent.MOUSE_WHEEL_EVENT_MASK | AWTEvent.WINDOW_FOCUS_EVENT_MASK);
    }

    private static class AutoScrollMouseListener extends MouseAdapter {
        private AutoScrollActivator autoScrollActivator;

        public AutoScrollMouseListener(AutoScrollActivator autoScrollActivator) {
            this.autoScrollActivator = autoScrollActivator;
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.isPopupTrigger()) {
                autoScrollActivator.activateAutoScroll(e);
            }
        }
    }

    private void configureScrollPane() {
        for (MouseListener mouseListener : scrollPane.getMouseListeners()) {
            if (mouseListener instanceof AutoScrollMouseListener) {
                return;
            }
        }
        scrollPane.addMouseListener(new AutoScrollMouseListener(this));
    }

    private static final int SCROLL_ICON_SIZE = 28;

    private Icon getAutoScrollIcon() {
        SubstanceIconPack iconPack = SubstanceCortex.GlobalScope.getIconPack();
        SubstanceColorScheme colorScheme = SubstanceCoreUtilities.getSkin(scrollPane)
                .getEnabledColorScheme(DecorationAreaType.NONE);
        if (scrollPane.getHorizontalScrollBar().isVisible()) {
            if (scrollPane.getVerticalScrollBar().isVisible()) {
                return iconPack.getScrollAllIcon(SCROLL_ICON_SIZE, colorScheme);
            } else {
                return iconPack.getScrollHorizontalIcon(SCROLL_ICON_SIZE, colorScheme);
            }
        }
        return iconPack.getScrollVerticalIcon(SCROLL_ICON_SIZE, colorScheme);
    }

    static void setAutoScrollEnabled(final JScrollPane scrollPane, boolean isEnabled) {
        if (isEnabled) {
            new AutoScrollActivator(scrollPane);
        } else {
            for (MouseListener mouseListener : scrollPane.getMouseListeners()) {
                if (mouseListener instanceof AutoScrollMouseListener) {
                    scrollPane.removeMouseListener(mouseListener);
                    return;
                }
            }
        }
    }

}
