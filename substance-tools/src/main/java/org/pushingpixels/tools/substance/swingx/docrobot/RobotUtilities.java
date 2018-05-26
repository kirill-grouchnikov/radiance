/*
 * Copyright 2005-2008 Kirill Grouchnikov, based on work by
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
package org.pushingpixels.tools.substance.swingx.docrobot;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class RobotUtilities {
	/**
	 * Makes the specified component and all its descendants previewable.
	 * 
	 * @param comp
	 *            Component.
	 * @param dbSnapshot
	 *            The "snapshot" map that will contain the original
	 *            double-buffer status of the specified component and all its
	 *            descendants. Key is {@link JComponent}, value is
	 *            {@link Boolean}.
	 */
	public static void makePreviewable(Component comp,
			Map<Component, Boolean> dbSnapshot) {
		if (comp instanceof JComponent) {
			JComponent jcomp = (JComponent) comp;
			// if (jcomp.getParent() instanceof CellRendererPane) {
			// System.out.println(jcomp.getClass().getSimpleName() + ":"
			// + jcomp.hashCode());
			// }
			dbSnapshot.put(jcomp, Boolean.valueOf(jcomp.isDoubleBuffered()));
			jcomp.setDoubleBuffered(false);
		}
		if (comp instanceof Container) {
			Container cont = (Container) comp;
			for (int i = 0; i < cont.getComponentCount(); i++)
				RobotUtilities
						.makePreviewable(cont.getComponent(i), dbSnapshot);
		}
	}

	/**
	 * Restores the regular (non-previewable) status of the specified component
	 * and all its descendants.
	 * 
	 * @param comp
	 *            Component.
	 * @param dbSnapshot
	 *            The "snapshot" map that contains the original double-buffer
	 *            status of the specified component and all its descendants. Key
	 *            is {@link JComponent}, value is {@link Boolean}.
	 */
	public static void restorePreviewable(Component comp,
			Map<Component, Boolean> dbSnapshot) {
		if (comp instanceof JComponent) {
			JComponent jcomp = (JComponent) comp;
			if (dbSnapshot.containsKey(comp)) {
				jcomp.setDoubleBuffered(dbSnapshot.get(comp));
			} else {
				// this can happen in case the application has
				// renderers (combos, ...). Take the property from the parent
				Component parent = comp.getParent();
				if (parent instanceof JComponent) {
					jcomp.setDoubleBuffered(dbSnapshot.get(parent));
				}
			}
		}
		if (comp instanceof Container) {
			Container cont = (Container) comp;
			for (int i = 0; i < cont.getComponentCount(); i++)
				RobotUtilities.restorePreviewable(cont.getComponent(i),
						dbSnapshot);
		}
	}
}
