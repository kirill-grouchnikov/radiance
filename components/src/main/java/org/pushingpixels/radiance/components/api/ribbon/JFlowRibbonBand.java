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
package org.pushingpixels.radiance.components.api.ribbon;

import org.pushingpixels.radiance.components.api.common.CommandAction;
import org.pushingpixels.radiance.components.api.common.projection.Projection;
import org.pushingpixels.radiance.components.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.radiance.components.api.ribbon.synapse.model.ComponentContentModel;
import org.pushingpixels.radiance.components.api.ribbon.synapse.projection.ComponentProjection;
import org.pushingpixels.radiance.components.internal.ui.ribbon.JFlowBandControlPanel;
import org.pushingpixels.radiance.components.internal.ui.ribbon.JRibbonComponent;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;

import javax.swing.*;

/**
 * Flow ribbon band component. Hosts components added with
 * {@link #addFlowComponent(Projection)} and {@link #addFlowComponent(ComponentProjection)} in
 * flowing rows. Depending on the current resize policy, the content is shown in either two or
 * three rows.
 *
 * @author Kirill Grouchnikov
 */
public class JFlowRibbonBand extends AbstractRibbonBand {
    /**
     * Creates a new flow ribbon band.
     *
     * @param title       Band title.
     * @param iconFactory Associated icon factory (for collapsed state).
     */
    public JFlowRibbonBand(String title, RadianceIcon.Factory iconFactory) {
        this(title, iconFactory, null);
    }

    /**
     * Creates a new flow ribbon band.
     *
     * @param title                 Band title.
     * @param iconFactory           Associated icon factory (for collapsed state).
     * @param expandCommandListener Expand command listener (can be <code>null</code>).
     */
    public JFlowRibbonBand(String title, RadianceIcon.Factory iconFactory,
            CommandAction expandCommandListener) {
        super(title, iconFactory, expandCommandListener, new JFlowBandControlPanel());
        this.resizePolicies = CoreRibbonResizePolicies.getCoreFlowPoliciesRestrictive(this, 3);
        updateUI();
    }

    public void addFlowComponent(Projection projection) {
        ((JFlowBandControlPanel) this.getControlPanel()).addFlowComponent(
                projection.buildComponent());
    }

    public void addFlowComponent(
            ComponentProjection<? extends JComponent, ? extends ComponentContentModel> projection) {
        JRibbonComponent ribbonComponent = new JRibbonComponent(projection);
        ((JFlowBandControlPanel) this.getControlPanel()).addFlowComponent(ribbonComponent);
    }

    @Override
    public AbstractRibbonBand cloneBand() {
        AbstractRibbonBand result = new JFlowRibbonBand(
                this.getTitle(), this.getIconFactory(), this.getExpandCommandListener());
        result.applyComponentOrientation(this.getComponentOrientation());
        return result;
    }
}
