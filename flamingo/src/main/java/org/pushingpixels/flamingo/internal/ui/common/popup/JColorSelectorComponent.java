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
package org.pushingpixels.flamingo.internal.ui.common.popup;

import org.pushingpixels.flamingo.api.common.popup.model.*;
import org.pushingpixels.flamingo.internal.substance.common.ui.SubstanceColorSelectorComponentUI;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class JColorSelectorComponent extends JComponent {
    private Color color;

    private List<ColorSelectorPopupMenuContentModel.ColorPreviewListener> colorPreviewListeners;
    private List<ColorSelectorPopupMenuContentModel.ColorActivationListener> colorActivationListeners;

    private boolean isTopOpen;

    private boolean isBottomOpen;

    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "ColorSelectorComponentUI";

    public JColorSelectorComponent(Color color,
            ColorSelectorPopupMenuContentModel.ColorPreviewListener colorPreviewListener,
            ColorSelectorPopupMenuContentModel.ColorActivationListener colorActivationListener) {
        this.setOpaque(true);
        this.color = color;
        this.colorPreviewListeners = new ArrayList<>();
        this.colorPreviewListeners.add(colorPreviewListener);
        this.colorActivationListeners = new ArrayList<>();
        this.colorActivationListeners.add(colorActivationListener);

        this.updateUI();
    }

    @Override
    public void updateUI() {
        setUI(SubstanceColorSelectorComponentUI.createUI(this));
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    public Color getColor() {
        return this.color;
    }

    public synchronized void addColorActivationListener(
            ColorSelectorPopupMenuContentModel.ColorActivationListener listener) {
        this.colorActivationListeners.add(listener);
    }

    public synchronized void addColorPreviewListener(
            ColorSelectorPopupMenuContentModel.ColorPreviewListener listener) {
        this.colorPreviewListeners.add(listener);
    }

    public synchronized void onColorActivated(Color color) {
        for (ColorSelectorPopupMenuContentModel.ColorActivationListener listener : this.colorActivationListeners) {
            listener.onColorActivated(color);
        }
    }

    public synchronized void onColorPreviewActivated(Color color) {
        for (ColorSelectorPopupMenuContentModel.ColorPreviewListener listener : this.colorPreviewListeners) {
            listener.onColorPreviewActivated(color);
        }
    }

    public synchronized void onColorPreviewCanceled() {
        for (ColorSelectorPopupMenuContentModel.ColorPreviewListener listener : this.colorPreviewListeners) {
            listener.onColorPreviewCanceled();
        }
    }

    public void setTopOpen(boolean isTopOpen) {
        this.isTopOpen = isTopOpen;
    }

    public void setBottomOpen(boolean isBottomOpen) {
        this.isBottomOpen = isBottomOpen;
    }

    public boolean isTopOpen() {
        return this.isTopOpen;
    }

    public boolean isBottomOpen() {
        return this.isBottomOpen;
    }
}
