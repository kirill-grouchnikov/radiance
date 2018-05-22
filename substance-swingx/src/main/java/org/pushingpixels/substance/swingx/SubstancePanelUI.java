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

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

import org.jdesktop.swingx.JXPanel;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Substance-consistent UI delegate for {@link JXPanel}.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstancePanelUI extends org.pushingpixels.substance.internal.ui.SubstancePanelUI {

	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstancePanelUI();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jvnet.substance.SubstancePanelUI#toPaintBackground(javax.swing.JComponent
	 * )
	 */
	@Override
	protected boolean toPaintBackground(JComponent c) {
		boolean result = super.toPaintBackground(c);
		if (c instanceof JXPanel) {
			JXPanel jxPanel = (JXPanel) c;
			if (jxPanel.getAlpha() < 1.0)
				return true;
		}
		return result;
	}

}
