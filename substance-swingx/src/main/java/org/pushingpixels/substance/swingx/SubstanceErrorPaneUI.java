/*
 * Copyright 2005-2018 Kirill Grouchnikov, based on work by
 * Sun Microsystems, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.pushingpixels.substance.swingx;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;

import org.jdesktop.swingx.JXErrorPane;
import org.jdesktop.swingx.plaf.basic.BasicErrorPaneUI;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.animation.IconGlowTracker;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.icon.GlowingIcon;

/**
 * UI delegate for the {@link JXErrorPane} component.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceErrorPaneUI extends BasicErrorPaneUI {
	protected IconGlowTracker iconGlowTracker;

	static {
		AnimationConfigurationManager.getInstance().allowAnimations(
				AnimationFacet.ICON_GLOW, JXErrorPane.class);
	}

	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceErrorPaneUI();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jdesktop.swingx.plaf.basic.BasicErrorPaneUI#installComponents()
	 */
	@Override
	protected void installComponents() {
		super.installComponents();

		this.errorMessage.setBorder(null);
		this.errorScrollPane.setOpaque(false);
		this.errorScrollPane.getViewport().setOpaque(false);

		this.iconGlowTracker = new IconGlowTracker(this.iconLabel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jdesktop.swingx.plaf.basic.BasicErrorPaneUI#getDefaultErrorIcon()
	 */
	@Override
	protected Icon getDefaultErrorIcon() {
		Icon errorIcon = UIManager.getIcon("OptionPane.errorIcon");
		return new GlowingIcon(errorIcon, this.iconGlowTracker);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jdesktop.swingx.plaf.basic.BasicErrorPaneUI#getDefaultWarningIcon()
	 */
	@Override
	protected Icon getDefaultWarningIcon() {
		Icon errorIcon = UIManager.getIcon("OptionPane.warningIcon");
		return new GlowingIcon(errorIcon, this.iconGlowTracker);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jdesktop.swingx.plaf.basic.BasicErrorPaneUI#reinit()
	 */
	@Override
	protected void reinit() {
		super.reinit();

		if (this.iconLabel.getIcon() != null) {
			this.iconGlowTracker.play(3);
		}
	}
}
