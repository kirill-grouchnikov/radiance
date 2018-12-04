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
package org.pushingpixels.flamingo.api.common.popup.model;

import org.pushingpixels.flamingo.api.common.model.ContentModel;

import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class ColorSelectorPopupMenuContentModel implements ContentModel {
    private List<ColorSelectorPopupMenuGroupModel> menuGroups;

    private ColorPreviewListener colorPreviewListener;
    private ColorActivationListener colorActivationListener;

    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    private ChangeListener menuGroupChangeListener;

    public interface ColorPreviewListener extends EventListener {
        void onColorPreviewActivated(Color color);

        void onColorPreviewCanceled();
    }

    public interface ColorActivationListener extends EventListener {
        void onColorActivated(Color color);
    }

    public ColorSelectorPopupMenuContentModel(List<ColorSelectorPopupMenuGroupModel> menuGroups) {
        this.menuGroups = new ArrayList<>(menuGroups);
        this.menuGroupChangeListener = (ChangeEvent event) -> fireStateChanged();
        for (ColorSelectorPopupMenuGroupModel menuGroup : this.menuGroups) {
            menuGroup.addChangeListener(this.menuGroupChangeListener);
        }
    }

    public List<ColorSelectorPopupMenuGroupModel> getMenuGroups() {
        return this.menuGroups;
    }

    public ColorPreviewListener getColorPreviewListener() {
        return this.colorPreviewListener;
    }

    public void setColorPreviewListener(ColorPreviewListener colorPreviewListener) {
        this.colorPreviewListener = colorPreviewListener;
    }

    public ColorActivationListener getColorActivationListener() {
        return this.colorActivationListener;
    }

    public void setColorActivationListener(ColorActivationListener colorActivationListener) {
        this.colorActivationListener = colorActivationListener;
    }

    public void addMenuGroup(ColorSelectorPopupMenuGroupModel menuGroupModel) {
        this.menuGroups.add(menuGroupModel);
        menuGroupModel.addChangeListener(this.menuGroupChangeListener);
        this.fireStateChanged();
    }

    public void removeMenuGroup(ColorSelectorPopupMenuGroupModel menuGroupModel) {
        this.menuGroups.remove(menuGroupModel);
        menuGroupModel.removeChangeListener(this.menuGroupChangeListener);
        this.fireStateChanged();
    }

    public void removeAllMenuGroups() {
        for (ColorSelectorPopupMenuGroupModel menuGroup : this.menuGroups) {
            menuGroup.removeChangeListener(this.menuGroupChangeListener);
        }
        this.menuGroups.clear();
        this.fireStateChanged();
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
}
