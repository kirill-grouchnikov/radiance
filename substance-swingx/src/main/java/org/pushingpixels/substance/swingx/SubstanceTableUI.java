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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import org.jdesktop.swingx.JXPanel;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Substance-consistent UI delegate for {@link JXPanel}.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceTableUI extends
		org.pushingpixels.substance.internal.ui.SubstanceTableUI {

	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceTableUI();
	}

	@Override
	protected void installRendererIfNecessary(java.lang.Class<?> clazz,
			javax.swing.table.TableCellRenderer renderer) {
		TableCellRenderer currRenderer = this.table.getDefaultRenderer(clazz);
		if (currRenderer != null) {
			boolean isCore = (currRenderer instanceof DefaultTableCellRenderer.UIResource)
					|| (currRenderer.getClass().getName().startsWith(
							"javax.swing.JTable") || (currRenderer instanceof org.jdesktop.swingx.renderer.DefaultTableRenderer));
			if (!isCore)
				return;
		}
		// System.out.println(clazz.getSimpleName() + " : overriding "
		// + currRenderer.getClass().getName() + "["
		// + currRenderer.hashCode() + "] with "
		// + renderer.getClass().getName() + "[" + renderer.hashCode()
		// + "]");
		this.table.setDefaultRenderer(clazz, renderer);
	}

}
