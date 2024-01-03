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
package org.pushingpixels.radiance.component.internal.ui.ribbon;

import org.pushingpixels.radiance.component.api.ribbon.JFlowRibbonBand;
import org.pushingpixels.radiance.component.internal.theming.ribbon.ui.RadianceFlowBandControlPanelUI;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.util.LinkedList;
import java.util.List;

/**
 * Control panel of a single {@link JFlowRibbonBand}. This
 * class is for internal use only and should not be directly used by the applications.
 *
 * @author Kirill Grouchnikov
 */
public class JFlowBandControlPanel extends AbstractBandControlPanel implements UIResource {
    /**
     * List of all components of <code>this</code> control panel.
     */
    private List<JComponent> comps;

    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "FlowBandControlPanelUI";

    /**
     * Creates a control panel for specified ribbon band.
     */
    public JFlowBandControlPanel() {
        super();

        this.comps = new LinkedList<>();
    }

    /**
     * Sets the new UI delegate.
     *
     * @param ui New UI delegate.
     */
    public void setUI(BandControlPanelUI ui) {
        super.setUI(ui);
    }

    @Override
    public void updateUI() {
        setUI(RadianceFlowBandControlPanelUI.createUI(this));
    }

    @Override
    public BandControlPanelUI getUI() {
        return (BandControlPanelUI) ui;
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    /**
     * Adds new component to <code>this</code> control panel.
     *
     * @param comp Component to add
     */
    public void addFlowComponent(JComponent comp) {
        this.comps.add(comp);
        super.add(comp);
    }

    /**
     * Returns regular panels of <code>this</code> control panel.
     *
     * @return Regular panels of <code>this</code> control panel.
     */
    public List<JComponent> getFlowComponents() {
        return this.comps;
    }
}
