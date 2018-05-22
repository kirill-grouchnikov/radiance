/*
 * Copyright (c) 2005-2018 Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.flamingo.ribbon.ui;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonComponent;
import org.pushingpixels.flamingo.internal.ui.ribbon.BasicRibbonComponentUI;
import org.pushingpixels.substance.flamingo.utils.SubstanceDisabledResizableIcon;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * UI for {@link JRibbonComponent} components in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceRibbonComponentUI extends BasicRibbonComponentUI {
	public static ComponentUI createUI(JComponent c) {
		return new SubstanceRibbonComponentUI();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jvnet.flamingo.ribbon.ui.BasicRibbonComponentUI#createDisabledIcon()
	 */
	@Override
	protected ResizableIcon createDisabledIcon() {
		return new SubstanceDisabledResizableIcon(this.ribbonComponent.getIcon());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jvnet.flamingo.ribbon.ui.BasicRibbonComponentUI#paintIcon(java.awt
	 * .Graphics, org.jvnet.flamingo.ribbon.JRibbonComponent, javax.swing.Icon,
	 * int, int)
	 */
	@Override
	protected void paintIcon(Graphics g, JRibbonComponent ribbonComp, Icon icon, int x, int y) {
		if (ribbonComp.isEnabled() && (icon != null)
				&& SubstanceCoreUtilities.useThemedDefaultIcon(ribbonComp)) {
			icon = SubstanceCoreUtilities.getThemedIcon(ribbonComp, icon);
		}
		super.paintIcon(g, ribbonComp, icon, x, y);
	}
}
