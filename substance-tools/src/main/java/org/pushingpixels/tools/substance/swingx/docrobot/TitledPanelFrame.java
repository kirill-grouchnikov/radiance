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

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.jdesktop.swingx.JXTitledPanel;
import org.pushingpixels.substance.api.skin.SubstanceBusinessBlackSteelLookAndFeel;

public class TitledPanelFrame extends JFrame {
	public TitledPanelFrame() {
		super("JXTitledPanel example");

		this.setLayout(new BorderLayout());

		this.add(new JXTitledPanel("Left panel"), BorderLayout.WEST);
		JPanel center = new JPanel(new GridLayout(2, 1, 0, 0));
		center.add(new JXTitledPanel("Top panel"));
		center.add(new JXTitledPanel("Bottom panel"));
		this.add(center, BorderLayout.CENTER);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 350);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) throws Exception {
		JFrame.setDefaultLookAndFeelDecorated(true);
		UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());
		SwingUtilities.invokeLater(() -> new TitledPanelFrame().setVisible(true));
	}
}
