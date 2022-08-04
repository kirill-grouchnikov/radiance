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
import org.pushingpixels.radiance.component.api.common.model.CommandMenuContentModel;
import org.pushingpixels.radiance.component.api.common.model.CommandPanelContentModel;
import org.pushingpixels.radiance.component.internal.ui.common.popup.ScrollableHost;

import javax.swing.*;
import javax.swing.JPopupMenu.Separator;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Popup menu with groups of command buttons. Use the
 * {@link CommandMenuContentModel#CommandMenuContentModel(CommandPanelContentModel, List)}
 * constructor to place a scrollable command button panel in the top part of the popup menu.
 *
 * @author Kirill Grouchnikov
 */
public abstract class AbstractPopupMenuPanel extends JPopupPanel implements ScrollableHost {
    /**
     * Menu components.
     */
    private List<Component> menuComponents;

    protected AbstractPopupMenuPanel() {
        this.menuComponents = new ArrayList<>();
    }

    void addMenuButton(JCommandButton menuButton) {
        menuButton.setHorizontalAlignment(SwingUtilities.LEADING);
        this.menuComponents.add(menuButton);
        this.fireStateChanged();
    }

    void addMenuSeparator() {
        Separator separator = new Separator();
        separator.setFocusable(false);
        this.menuComponents.add(separator);
        this.fireStateChanged();
    }

    /**
     * Adds a menu panel to this menu.
     *
     * @param menuPanel Menu panel to add.
     */
    void addMenuPanel(JPanel menuPanel) {
        this.menuComponents.add(menuPanel);
        this.fireStateChanged();
    }

    /**
     * Returns an unmodifiable list of all the menu components. Can return
     * <code>null</code>.
     *
     * @return An unmodifiable list of all the menu components
     */
    public List<Component> getMenuComponents() {
        if (this.menuComponents == null) {
            return null;
        }
        return Collections.unmodifiableList(this.menuComponents);
    }

    /**
     * Adds the specified change listener to track changes to this popup menu.
     *
     * @param l Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from tracking changes to this popup
     * menu.
     *
     * @param l Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    /**
     * Notifies all registered listener that the state of this popup menu has
     * changed.
     */
    protected void fireStateChanged() {
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
}
