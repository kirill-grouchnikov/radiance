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

import java.awt.Component;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;

import org.fest.swing.core.BasicRobot;
import org.fest.swing.core.Robot;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.skin.SkinInfo;
import org.pushingpixels.substance.swingx.SubstanceErrorPaneUI;

/**
 * The main method for taking screenshots for Substance documentation.
 * 
 * @author Kirill Grouchnikov
 */
public class ErrorPaneRunner {
	public static class MyErrorPaneUI extends SubstanceErrorPaneUI {
		public static ComponentUI createUI(JComponent c) {
			return new MyErrorPaneUI();
		}

		@Override
		public JDialog getErrorDialog(Component owner) {
			JDialog result = super.getErrorDialog(owner);
			result.setModal(false);
			return result;
		}
	}

	/**
	 * Runs the specified screenshot robot.
	 * 
	 * @param args
	 *            Ignored.
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		JFrame.setDefaultLookAndFeelDecorated(true);
		UIManager.put("ErrorPaneUI", MyErrorPaneUI.class.getName());

		String subfolder = "errorpane";
		Map<String, SkinInfo> skins = SubstanceCortex.GlobalScope.getAllSkins();
		Robot robot = BasicRobot.robotWithNewAwtHierarchy();
		for (Map.Entry<String, SkinInfo> skinEntry : skins.entrySet()) {
			String key = skinEntry.getKey();
			String normalized = key.toLowerCase().replaceAll(" ", "");
			new ErrorPaneRobot((SubstanceSkin) Class.forName(
					skinEntry.getValue().getClassName()).newInstance(),
					"C:/jprojects/substance-swingx/www/images/" + subfolder
							+ "/" + normalized, robot).run();
		}
	}
}
