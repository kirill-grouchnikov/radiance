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
package org.pushingpixels.radiance.component.api.common.popup.model;

import org.pushingpixels.radiance.component.api.common.model.BaseCommandMenuContentModel;
import org.pushingpixels.radiance.component.api.common.model.ChangeAware;
import org.pushingpixels.radiance.component.internal.utils.WeakChangeSupport;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventListener;
import java.util.List;

public class ColorSelectorPopupMenuContentModel implements BaseCommandMenuContentModel, ChangeAware {
    private List<ColorSelectorPopupMenuGroupModel> menuGroups;

    private ColorPreviewListener colorPreviewListener;
    private ColorActivationListener colorActivationListener;
    private final WeakChangeSupport weakChangeSupport;

    /**
     * Stores the listeners on this model.
     */

    private ChangeListener menuGroupChangeListener;

    /**
     * Listener for tracking color preview events.
     */
    public interface ColorPreviewListener extends EventListener {
        /**
         * Invoked when the preview of a color in any of the color sections of this model is
         * activated.
         *
         * @param color Color for which the preview has been activated.
         */
        void onColorPreviewActivated(Color color);

        /**
         * Invoked when the color preview has been canceled.
         */
        void onColorPreviewCanceled();
    }

    /**
     * Listener for tracking color activation events.
     */
    public interface ColorActivationListener extends EventListener {
        /**
         * Invoked when a color in any of the color sections of this model is activated.
         *
         * @param color Activated color.
         */
        void onColorActivated(Color color);
    }

    public ColorSelectorPopupMenuContentModel(List<ColorSelectorPopupMenuGroupModel> menuGroups) {
        this.weakChangeSupport = new WeakChangeSupport(this);
        this.menuGroups = new ArrayList<>(menuGroups);
        this.menuGroupChangeListener = (ChangeEvent event) -> fireStateChanged();
        for (ColorSelectorPopupMenuGroupModel menuGroup : this.menuGroups) {
            menuGroup.addChangeListener(this.menuGroupChangeListener);
        }
    }

    public List<ColorSelectorPopupMenuGroupModel> getMenuGroups() {
        return Collections.unmodifiableList(this.menuGroups);
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

    @Override
    public boolean isEmpty() {
        return this.menuGroups.isEmpty();
    }

    public void addChangeListener(ChangeListener l) {
        this.weakChangeSupport.addChangeListener(l);
    }

    @Override
    public void removeChangeListener(ChangeListener l) {
        this.weakChangeSupport.removeChangeListener(l);
    }

    private void fireStateChanged() {
        this.weakChangeSupport.fireStateChanged();
    }
}
