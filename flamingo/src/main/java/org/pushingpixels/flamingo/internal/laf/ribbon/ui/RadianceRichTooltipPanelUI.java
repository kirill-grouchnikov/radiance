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
package org.pushingpixels.flamingo.internal.laf.ribbon.ui;

import org.pushingpixels.flamingo.internal.ui.common.BasicRichTooltipPanelUI;
import org.pushingpixels.flamingo.internal.ui.common.JRichTooltipPanel;
import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceLafCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices.DecorationAreaType;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.laf.internal.utils.RadianceColorSchemeUtilities;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * UI for {@link JRichTooltipPanel} components in <b>Radiance</b> look and
 * feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceRichTooltipPanelUI extends BasicRichTooltipPanelUI {
	public static ComponentUI createUI(JComponent c) {
		return new RadianceRichTooltipPanelUI();
	}

	private RadianceRichTooltipPanelUI() {
	}

	@Override
	protected void installDefaults() {
		super.installDefaults();
		ComponentOrParentChainScope.setDecorationType(this.richTooltipPanel, DecorationAreaType.CONTROL_PANE);
	}

	@Override
	protected void paintBackground(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();

		RadianceColorScheme colorScheme = RadianceColorSchemeUtilities
				.getColorScheme(this.richTooltipPanel, ComponentState.ENABLED);
		g2d.setPaint(new GradientPaint(0, 0, colorScheme.getExtraLightColor(), 0,
				this.richTooltipPanel.getHeight(), colorScheme.getLightColor()));
		g2d.fillRect(0, 0, this.richTooltipPanel.getWidth(), this.richTooltipPanel.getHeight());

		g2d.dispose();
	}
}
