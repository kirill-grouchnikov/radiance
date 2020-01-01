/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.internal.ui.ribbon;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.CommandActionEvent;
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.flamingo.internal.utils.FlamingoUtilities;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.UIResource;
import java.awt.*;

/**
 * Basic UI for control panel of ribbon band {@link JBandControlPanel}.
 *
 * @author Kirill Grouchnikov
 */
abstract class AbstractBandControlPanelUI extends BandControlPanelUI {
    /**
     * The associated control panel.
     */
    protected AbstractBandControlPanel controlPanel;

    protected AbstractCommandButton dummy;

    public static final String TOP_ROW = "flamingo.internal.ribbonBandControlPanel.topRow";

    public static final String MID_ROW = "flamingo.internal.ribbonBandControlPanel.midRow";

    public static final String BOTTOM_ROW = "flamingo.internal.ribbonBandControlPanel.bottomRow";

    @Override
    public void installUI(JComponent c) {
        this.controlPanel = (AbstractBandControlPanel) c;

        this.dummy = Command.builder()
                .setText("Dummy")
                .setIconFactory(EmptyResizableIcon.factory())
                .setAction((CommandActionEvent e) -> {})
                .build().project(CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.BIG).build())
                .buildComponent();

        installDefaults();
        installComponents();
        installListeners();

        c.setLayout(createLayoutManager());
    }

    @Override
    public void uninstallUI(JComponent c) {
        uninstallListeners();
        uninstallComponents();
        uninstallDefaults();

        c.setLayout(null);
        this.controlPanel = null;
    }

    /**
     * Installs listeners on the associated control panel of a ribbon band.
     */
    protected void installListeners() {
    }

    /**
     * Uninstalls listeners from the associated control panel of a ribbon band.
     */
    protected void uninstallListeners() {
    }

    /**
     * Installs components on the associated control panel of a ribbon band.
     */
    protected void installComponents() {
    }

    /**
     * Uninstalls components from the associated control panel of a ribbon band.
     */
    protected void uninstallComponents() {
    }

    /**
     * Installs default parameters on the associated control panel of a ribbon
     * band.
     */
    protected void installDefaults() {
        this.controlPanel.setBackground(null);

        Font font = this.controlPanel.getFont();
        if (font == null || font instanceof UIResource) {
            Font toSet = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet().
                    getControlFont();
            this.controlPanel.setFont(toSet);
        }

        Border b = this.controlPanel.getBorder();
        if (b == null || b instanceof UIResource) {
            Insets insets = SubstanceSizeUtils
                    .getDefaultBorderInsets(SubstanceSizeUtils.getComponentFontSize(this.controlPanel));
            //this.controlPanel.setBorder(new EmptyBorder(insets.top, 0, insets.bottom, 0));
        }
    }

    /**
     * Uninstalls default parameters from the associated control panel.
     */
    protected void uninstallDefaults() {
        LookAndFeel.uninstallBorder(this.controlPanel);
    }

    /**
     * Invoked by <code>installUI</code> to create a layout manager object to
     * manage the {@link JBandControlPanel}.
     *
     * @return a layout manager object
     */
    protected abstract LayoutManager createLayoutManager();

    @Override
    public int getLayoutGap() {
        return FlamingoUtilities.getScaledSize(4, controlPanel.getFont().getSize(), 0.25, 1);
    }
}
