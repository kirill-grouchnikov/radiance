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

import java.awt.FlowLayout;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.jdesktop.swingx.JXMonthView;
import org.pushingpixels.substance.api.skin.SubstanceBusinessBlackSteelLookAndFeel;

public class MonthViewFrame extends JFrame {
	public MonthViewFrame() {
		super("JXMonthView example");

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 4);
		JXMonthView monthView = new JXMonthView();
		monthView.setShowingLeadingDays(true);
		monthView.setShowingTrailingDays(true);
		monthView.setShowingWeekNumber(true);

		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(monthView);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 250);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) throws Exception {
		JFrame.setDefaultLookAndFeelDecorated(true);
		UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());
		SwingUtilities.invokeLater(() -> new MonthViewFrame().setVisible(true));
	}
}
