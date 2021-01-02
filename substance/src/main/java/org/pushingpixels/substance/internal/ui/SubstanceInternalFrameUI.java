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
package org.pushingpixels.substance.internal.ui;

import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceInternalFrameTitlePane;

import javax.swing.*;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
import java.beans.PropertyChangeListener;

/**
 * UI for internal frames in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceInternalFrameUI extends BasicInternalFrameUI {
    /**
     * Title pane
     */
    private SubstanceInternalFrameTitlePane titlePane;

    /**
     * Property listener on the associated internal frame.
     */
    private PropertyChangeListener substancePropertyListener;

    /**
     * Simple constructor.
     * 
     * @param b
     *            Associated internal frame.
     */
    private SubstanceInternalFrameUI(JInternalFrame b) {
        super(b);
    }

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceInternalFrameUI((JInternalFrame) comp);
    }

    @Override
    protected JComponent createNorthPane(JInternalFrame w) {
        this.titlePane = new SubstanceInternalFrameTitlePane(w);

        return this.titlePane;
    }

    @Override
    protected void uninstallComponents() {
        this.titlePane.uninstall();
        super.uninstallComponents();
    }

    @Override
    protected void installListeners() {
        super.installListeners();
        this.substancePropertyListener = propertyChangeEvent -> {
            if (JInternalFrame.IS_CLOSED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                titlePane.uninstall();
                JDesktopIcon jdi = frame.getDesktopIcon();
                SubstanceDesktopIconUI ui = (SubstanceDesktopIconUI) jdi.getUI();
                ui.uninstallIfNecessary(jdi);
            }

            if ("background".equals(propertyChangeEvent.getPropertyName())) {
                Color newBackgr = (Color) propertyChangeEvent.getNewValue();
                if (!(newBackgr instanceof UIResource)) {
                    getTitlePane().setBackground(newBackgr);
                    frame.getDesktopIcon().setBackground(newBackgr);
                }
            }

            if ("ancestor".equals(propertyChangeEvent.getPropertyName())) {
                // fix for issue 344 - reopening an internal frame
                // that has been closed.
                JDesktopIcon jdi = frame.getDesktopIcon();
                SubstanceDesktopIconUI ui = (SubstanceDesktopIconUI) jdi.getUI();
                ui.installIfNecessary(jdi);
            }
        };
        this.frame.addPropertyChangeListener(this.substancePropertyListener);
    }

    @Override
    protected void uninstallListeners() {
        this.frame.removePropertyChangeListener(this.substancePropertyListener);
        this.substancePropertyListener = null;
        super.uninstallListeners();
    }

    /**
     * Returns the title pane of the associated internal frame. This method is <b>for internal use
     * only</b>.
     * 
     * @return Title pane of the associated internal frame.
     */
    public SubstanceInternalFrameTitlePane getTitlePane() {
        return titlePane;
    }

    void setWindowModified(boolean isWindowModified) {
        titlePane.getCloseButton().putClientProperty(SubstanceSynapse.CONTENTS_MODIFIED,
                Boolean.valueOf(isWindowModified));

        SubstanceDesktopIconUI desktopIconUi = (SubstanceDesktopIconUI) this.frame.getDesktopIcon()
                .getUI();
        desktopIconUi.setWindowModified(isWindowModified);
    }
}
