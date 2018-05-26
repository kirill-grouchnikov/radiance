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

import org.jdesktop.swingx.JXHeader;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.skin.SubstanceBusinessBlackSteelLookAndFeel;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class HeaderFrame extends JFrame {
	public HeaderFrame() {
		super("JXHeader example");

		this.setLayout(new BorderLayout());
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		URL iconUrl = cl.getResource("docrobot/applications-internet.png");
		Icon icon = new ImageIcon(iconUrl);
		icon = new ImageIcon(SubstanceImageCreator.getColorSchemeImage(null,
				icon, SubstanceCortex.ComponentScope.getCurrentSkin(this.getRootPane())
						.getActiveColorScheme(
								DecorationAreaType.PRIMARY_TITLE_PANE), 0.0f));
		String title = "LGPL license";
		String description = "This library is free software; you can redistribute it and/or"
				+ " modify it under the terms of the GNU Lesser General Public"
				+ " License.";

		final JXHeader header = new JXHeader(title, description, icon);
		this.add(header, BorderLayout.NORTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(440, 300);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) throws Exception {
		JFrame.setDefaultLookAndFeelDecorated(true);
		UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());
		// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		SwingUtilities.invokeLater(() -> new HeaderFrame().setVisible(true));
	}
}
