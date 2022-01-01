/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.common.popup;

import org.pushingpixels.radiance.component.api.common.JCommandButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.*;

/**
 * Manager for showing and hiding {@link JPopupPanel}s.
 *
 * @author Kirill Grouchnikov
 */
public class PopupPanelManager {
    /**
     * Listener on showing and hiding the popup panels.
     *
     * @author Kirill Grouchnikov
     */
    public interface PopupListener extends EventListener {
        /**
         * Fired when a popup panel has been shown.
         *
         * @param event Popup event.
         */
        void popupShown(PopupEvent event);

        /**
         * Fired when a popup panel has been hidden.
         *
         * @param event Popup event.
         */
        void popupHidden(PopupEvent event);
    }

    // Implementation of PopupListener that holds a weak reference to the original
    // listener and unregisters it if gets reclaimed even without being explicitly
    // unregistered
    private static class WeakPopupListener implements PopupListener {
        private WeakReference<PopupListener> listenerRef;

        public WeakPopupListener(PopupListener listener) {
            if (listener == null) {
                throw new IllegalArgumentException("Cannot wrap a null listener");
            }
            this.listenerRef = new WeakReference<>(listener);
        }

        @Override
        public void popupShown(PopupEvent event) {
            PopupListener originalListener = this.listenerRef.get();
            if (originalListener != null) {
                originalListener.popupShown(event);
            } else {
                // the original is reclaimed - unregister explicitly
                PopupPanelManager.defaultManager().listenerList.remove(this);
                this.listenerRef = null;
            }
        }

        @Override
        public void popupHidden(PopupEvent event) {
            PopupListener originalListener = this.listenerRef.get();
            if (originalListener != null) {
                originalListener.popupHidden(event);
            } else {
                // the original is reclaimed - unregister explicitly
                System.out.println("Removing " + this.listenerRef + " as weak");
                PopupPanelManager.defaultManager().listenerList.remove(this);
                this.listenerRef = null;
            }
        }
    }

    /**
     * Popup event.
     *
     * @author Kirill Grouchnikov
     */
    public static class PopupEvent extends ComponentEvent {
        /**
         * ID of "popup shown" event.
         */
        public static final int POPUP_SHOWN = ComponentEvent.COMPONENT_LAST + 1;

        /**
         * ID of "popup hidden" event.
         */
        public static final int POPUP_HIDDEN = ComponentEvent.COMPONENT_LAST + 2;

        /**
         * The popup originator component.
         */
        private JComponent popupOriginator;

        /**
         * Creates a new popup event.
         *
         * @param source          Event source.
         * @param id              Event ID.
         * @param popupOriginator Popup originator component.
         */
        public PopupEvent(JPopupPanel source, int id, JComponent popupOriginator) {
            super(source, id);
            this.popupOriginator = popupOriginator;
        }

        /**
         * Returns the popup originator component.
         *
         * @return Popup originator component.
         */
        public JComponent getPopupOriginator() {
            return this.popupOriginator;
        }
    }

    /**
     * List of all registered listeners.
     */
    private List<WeakPopupListener> listenerList = new ArrayList<>();

    /**
     * The singleton instance of popup panel manager.
     */
    private static final PopupPanelManager instance = new PopupPanelManager();

    /**
     * Information on a single showing popup.
     *
     * @author Kirill Grouchnikov
     */
    public static class PopupInfo {
        /**
         * The popup panel.
         */
        private JPopupPanel popupPanel;

        /**
         * The originating component.
         */
        private JComponent popupOriginator;

        /**
         * Creates a new information object.
         *
         * @param popupOriginator The originating component.
         * @param popupPanel      The popup panel.
         */
        public PopupInfo(JComponent popupOriginator, JPopupPanel popupPanel) {
            this.popupOriginator = popupOriginator;
            this.popupPanel = popupPanel;
        }

        /**
         * Returns the popup panel.
         *
         * @return The popup panel.
         */
        public JPopupPanel getPopupPanel() {
            return this.popupPanel;
        }

        /**
         * Returns the originating component.
         *
         * @return The originating component.
         */
        public JComponent getPopupOriginator() {
            return this.popupOriginator;
        }
    }

    /**
     * Returns the default popup panel manager.
     *
     * @return a PopupPanelManager object
     */
    public static PopupPanelManager defaultManager() {
        return instance;
    }

    /**
     * All currently shown popup panels.
     */
    protected LinkedList<PopupInfo> shownPath = new LinkedList<>();

    /**
     * Map of all popup panels and associated {@link Popup} objects.
     */
    protected Map<JPopupPanel, Popup> popupPanels = new HashMap<>();

    /**
     * Adds new popup to the tracking structures.
     *
     * @param popupOriginator The originating component.
     * @param popup           The new popup.
     * @param popupInitiator  The initiator of the popup.
     */
    public void addPopup(JComponent popupOriginator, Popup popup, JPopupPanel popupInitiator) {
        popupInitiator.setInvoker(popupOriginator);
        popupPanels.put(popupInitiator, popup);
        shownPath.addLast(new PopupInfo(popupOriginator, popupInitiator));
        popup.show();
        if (popupOriginator instanceof JCommandButton) {
            ((JCommandButton) popupOriginator).getPopupModel().setPopupShowing(true);
        }
        this.firePopupShown(popupInitiator, popupOriginator);
    }

    /**
     * Hides the last shown popup panel.
     */
    public void hideLastPopup() {
        if (shownPath.size() == 0) {
            return;
        }
        PopupInfo last = shownPath.removeLast();
        Popup popup = popupPanels.get(last.popupPanel);
        popup.hide();
        popupPanels.remove(last.popupPanel);
        if (last.popupOriginator instanceof JCommandButton) {
            ((JCommandButton) last.popupOriginator).getPopupModel().setPopupShowing(false);
        }

        // KeyTipManager.defaultManager().showChainBefore(last.popupPanel);
        last.popupPanel.setInvoker(null);
        this.firePopupHidden(last.popupPanel, last.popupOriginator);
    }

    /**
     * Hides all popup panels based on the specified component. We find the
     * first ancestor of the specified component that is popup panel, and close
     * all popup panels that were open from that popup panel. If the specified
     * component is <code>null</code>, all popup panels are closed.
     *
     * @param comp Component.
     */
    public void hidePopups(Component comp) {
        boolean foundAndDismissed = false;
        if (comp != null) {
            Component c = comp;
            // find JPopupPanel parent of the component
            while (c != null) {
                if (c instanceof JPopupPanel) {
                    foundAndDismissed = true;
                    // And close all popups that were opened
                    // from the found popup panel
                    while (shownPath.size() > 0) {
                        if (shownPath.getLast().popupPanel == c) {
                            return;
                        }

                        PopupInfo last = shownPath.removeLast();
                        Popup popup = popupPanels.get(last.popupPanel);
                        popup.hide();
                        if (last.popupOriginator instanceof JCommandButton) {
                            ((JCommandButton) last.popupOriginator)
                                    .getPopupModel().setPopupShowing(false);
                        }
                        last.popupPanel.setInvoker(null);
                        this.firePopupHidden(last.popupPanel, last.popupOriginator);
                        popupPanels.remove(last.popupPanel);
                    }
                }
                c = c.getParent();
            }
        }
        if (!foundAndDismissed || (comp == null)) {
            Component lastOriginator = null;
            while (shownPath.size() > 0) {
                PopupInfo last = shownPath.removeLast();
                lastOriginator = last.popupOriginator;
                Popup popup = popupPanels.get(last.popupPanel);
                popup.hide();
                if (last.popupOriginator instanceof JCommandButton) {
                    ((JCommandButton) last.popupOriginator).getPopupModel()
                            .setPopupShowing(false);
                }
                last.popupPanel.setInvoker(null);
                this.firePopupHidden(last.popupPanel, last.popupOriginator);
                popupPanels.remove(last.popupPanel);
            }
            if ((lastOriginator != null) && lastOriginator.isFocusable()) {
                lastOriginator.requestFocus();
            }
        }
    }

    /**
     * Returns all currently shown popup panels.
     *
     * @return All currently shown popup panels.
     */
    public List<PopupInfo> getShownPath() {
        return Collections.unmodifiableList(this.shownPath);
    }

    /**
     * Adds the specified popup listener.
     *
     * @param l Listener to add.
     */
    public void addPopupListener(PopupListener l) {
        if (l instanceof WeakPopupListener) {
            throw new IllegalArgumentException("Don't pass an explicitly wrapped listener");
        }
        this.listenerList.add(new WeakPopupListener(l));
    }

    /**
     * Removes the specified popup listener.
     *
     * @param l Listener to remove.
     */
    public void removePopupListener(PopupListener l) {
        if (l instanceof WeakPopupListener) {
            throw new IllegalArgumentException("Don't pass an explicitly wrapped listener");
        }

        // Remove the specified popup listener. We don't want to remove all reclaimed listeners,
        // as that will throw ConcurrentModificationException if we get here from a listener
        // that removes itself as part of its notification logic.
        for (int i = this.listenerList.size() - 1; i >= 0; i--) {
            WeakPopupListener current = this.listenerList.get(i);
            PopupListener original = current.listenerRef.get();
            if (original == l) {
                this.listenerList.remove(i);
            }
        }
    }

    /**
     * Fires an event on showing the specified popup panel.
     *
     * @param panel           Popup panel that was shown.
     * @param popupOriginator The originating component.
     */
    protected void firePopupShown(JPopupPanel panel, JComponent popupOriginator) {
        // Guaranteed to return a non-null array
        PopupEvent popupEvent = new PopupEvent(panel, PopupEvent.POPUP_SHOWN, popupOriginator);
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listenerList.size() - 1; i >= 0; i--) {
            WeakPopupListener current = this.listenerList.get(i);
            PopupListener original = current.listenerRef.get();
            if (original != null) {
                original.popupShown(popupEvent);
            }
        }

        // Remove all wrappers around listeners that have been reclaimed
        for (int i = this.listenerList.size() - 1; i >= 0; i--) {
            WeakPopupListener current = this.listenerList.get(i);
            PopupListener original = current.listenerRef.get();
            if (original == null) {
                this.listenerList.remove(i);
            }
        }
    }

    /**
     * Fires an event on hiding the specified popup panel.
     *
     * @param panel           Popup panel that was hidden.
     * @param popupOriginator The originating component.
     */
    protected void firePopupHidden(JPopupPanel panel, JComponent popupOriginator) {
        // Guaranteed to return a non-null array
        PopupEvent popupEvent = new PopupEvent(panel, PopupEvent.POPUP_HIDDEN, popupOriginator);
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listenerList.size() - 1; i >= 0; i--) {
            WeakPopupListener current = this.listenerList.get(i);
            PopupListener original = current.listenerRef.get();
            if (original != null) {
                original.popupHidden(popupEvent);
            }
        }

        // Remove all wrappers around listeners that have been reclaimed
        for (int i = this.listenerList.size() - 1; i >= 0; i--) {
            WeakPopupListener current = this.listenerList.get(i);
            PopupListener original = current.listenerRef.get();
            if (original == null) {
                this.listenerList.remove(i);
            }
        }
    }
}
