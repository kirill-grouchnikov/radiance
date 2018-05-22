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
package org.pushingpixels.substance.internal.ui;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceInternalFrameTitlePane;

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
    protected PropertyChangeListener substancePropertyListener;

    /**
     * Simple constructor.
     * 
     * @param b
     *            Associated internal frame.
     */
    public SubstanceInternalFrameUI(JInternalFrame b) {
        super(b);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
     */
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceInternalFrameUI((JInternalFrame) comp);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicInternalFrameUI#createNorthPane(javax.swing .JInternalFrame)
     */
    @Override
    protected JComponent createNorthPane(JInternalFrame w) {
        this.titlePane = new SubstanceInternalFrameTitlePane(w);

        // f.putClientProperty(INTERNAL_FRAME_PINNED, Boolean.TRUE);

        return this.titlePane;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicInternalFrameUI#uninstallComponents()
     */
    @Override
    protected void uninstallComponents() {
        this.titlePane.uninstall();
        super.uninstallComponents();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicInternalFrameUI#installListeners()
     */
    @Override
    protected void installListeners() {
        super.installListeners();
        this.substancePropertyListener = (PropertyChangeEvent evt) -> {
            if (JInternalFrame.IS_CLOSED_PROPERTY.equals(evt.getPropertyName())) {
                titlePane.uninstall();
                JDesktopIcon jdi = frame.getDesktopIcon();
                SubstanceDesktopIconUI ui = (SubstanceDesktopIconUI) jdi.getUI();
                ui.uninstallIfNecessary(jdi);
            }

            if ("background".equals(evt.getPropertyName())) {
                Color newBackgr = (Color) evt.getNewValue();
                if (!(newBackgr instanceof UIResource)) {
                    getTitlePane().setBackground(newBackgr);
                    frame.getDesktopIcon().setBackground(newBackgr);
                }
            }

            if ("ancestor".equals(evt.getPropertyName())) {
                // fix for issue 344 - reopening an internal frame
                // that has been closed.
                JDesktopIcon jdi = frame.getDesktopIcon();
                SubstanceDesktopIconUI ui = (SubstanceDesktopIconUI) jdi.getUI();
                ui.installIfNecessary(jdi);
            }
        };
        this.frame.addPropertyChangeListener(this.substancePropertyListener);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicInternalFrameUI#uninstallListeners()
     */
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
