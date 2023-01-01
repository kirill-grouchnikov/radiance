/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.ui.ribbon.appmenu;

import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.popup.AbstractPopupMenuPanel;
import org.pushingpixels.radiance.component.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.component.api.ribbon.RibbonApplicationMenu;
import org.pushingpixels.radiance.component.internal.theming.ribbon.ui.RadianceRibbonApplicationMenuPopupPanelUI;
import org.pushingpixels.radiance.component.internal.ui.common.popup.ScrollableHost;
import org.pushingpixels.radiance.theming.internal.utils.RadiancePopupContainer;

import javax.swing.*;

@RadiancePopupContainer
public class JRibbonApplicationMenuPopupPanel extends AbstractPopupMenuPanel implements ScrollableHost {
    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "RibbonApplicationMenuPopupPanelUI";

    private Projection<JRibbonApplicationMenuPopupPanel,
                RibbonApplicationMenu, CommandPopupMenuPresentationModel> ribbonAppMenuProjection;

    public JRibbonApplicationMenuPopupPanel(Projection<JRibbonApplicationMenuPopupPanel,
            RibbonApplicationMenu, CommandPopupMenuPresentationModel> projection) {
        super();

        this.ribbonAppMenuProjection = projection;

        this.updateUI();
    }

    public JPanel getPanelLevel1() {
        return ((BasicRibbonApplicationMenuPopupPanelUI) getUI()).getPanelLevel1();
    }

    public JPanel getPanelLevel2() {
        return ((BasicRibbonApplicationMenuPopupPanelUI) getUI()).getPanelLevel2();
    }

    public JPanel getFooterPanel() {
        return ((BasicRibbonApplicationMenuPopupPanelUI) getUI()).getFooterPanel();
    }

    public Runnable getPathToSequence(Command command) {
        return ((BasicRibbonApplicationMenuPopupPanelUI) getUI()).getPathToSequence(command);
    }

    @Override
    public void updateUI() {
        setUI(RadianceRibbonApplicationMenuPopupPanelUI.createUI(this));
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    public Projection<JRibbonApplicationMenuPopupPanel, RibbonApplicationMenu,
            CommandPopupMenuPresentationModel> getRibbonAppMenuProjection() {
        return this.ribbonAppMenuProjection;
    }
}
