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

import org.fest.swing.core.Robot;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.edt.GuiTask;
import org.fest.swing.timing.Condition;
import org.fest.swing.timing.Pause;
import org.jdesktop.swingx.JXErrorPane;
import org.jdesktop.swingx.error.ErrorInfo;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * The base class for taking a single screenshot for Substance documentation.
 * 
 * @author Kirill Grouchnikov
 */
public class ErrorPaneRobot {
	/**
	 * The associated Substance skin.
	 */
	protected SubstanceSkin skin;

	/**
	 * The screenshot filename.
	 */
	protected String screenshotFilename;

	protected JDialog dialog;

	protected Robot robot;

	/**
	 * Creates the new screenshot robot.
	 * 
	 * @param skin
	 *            Substance skin.
	 * @param screenshotFilename
	 *            The screenshot filename.
	 */
	public ErrorPaneRobot(SubstanceSkin skin, String screenshotFilename,
			Robot robot) {
		this.skin = skin;
		this.screenshotFilename = screenshotFilename;
		this.robot = robot;
	}

	/**
	 * Runs the screenshot process.
	 */
	public void run() {
		long start = System.currentTimeMillis();
		// set the skin
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
			    SubstanceCortex.GlobalScope.setSkin(skin);
				JDialog.setDefaultLookAndFeelDecorated(true);
			}
		});
		robot.waitForIdle();

		final Frame owner = GuiActionRunner.execute(new GuiQuery<Frame>() {
			@Override
			protected Frame executeInEDT() throws Throwable {
				return JOptionPane.getRootFrame();
			}
		});

		// show dialog
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				try {
					new URL("some wrong URL string");
				} catch (MalformedURLException murle) {
					String msg = "<html>An error just happened. Possible reasons:"
							+ "<ol><li>Development team hoped nobody would notice."
							+ "<li>The testers missed this scenario. Wait, we don't have testers."
							+ "<li>Didn't your momma teach you not to use Linux?"
							+ "</ol>"
							+ "In any case, it's all open source so it's all good. Fix it yourself.";
					String details = "<html>Web resources should begin with \"http://\""
							+ " and cannot contain any spaces. Below are a few"
							+ " more guidelines.<ul></ul></html>";
					JXErrorPane.showDialog(owner, new ErrorInfo(
							"JXErrorPane example", msg, details, null, murle,
							null, null));
				}
			}
		});
		robot.waitForIdle();

		// get dialog
		this.dialog = GuiActionRunner.execute(new GuiQuery<JDialog>() {
			@Override
			protected JDialog executeInEDT() throws Throwable {
				return (JDialog) owner.getOwnedWindows()[owner
						.getOwnedWindows().length - 1];
			}
		});
		robot.waitForIdle();

		// get the close button
		final JButton closeButton = GuiActionRunner
				.execute(new GuiQuery<JButton>() {
					@Override
					protected JButton executeInEDT() throws Throwable {
						return getLoginButton(dialog.getContentPane());
					}

					private JButton getLoginButton(Component comp) {
						if (comp instanceof JButton) {
							JButton button = (JButton) comp;
							if ("Close".equals(button.getText())) {
								return button;
							}
						}
						if (comp instanceof Container) {
							Container cont = (Container) comp;
							for (int i = 0; i < cont.getComponentCount(); i++) {
								JButton result = getLoginButton(cont
										.getComponent(i));
								if (result != null)
									return result;
							}
						}
						return null;
					}
				});

		// move the mouse to the close button
		if (closeButton != null) {
			robot.moveMouse(closeButton);
		}

		// make screenshot
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				makeScreenshot();
			}
		});

		// click the button
		if (closeButton != null) {
			GuiActionRunner.execute(new GuiTask() {
				@Override
				protected void executeInEDT() throws Throwable {
					closeButton.doClick();
				}
			});
		}

		Pause.pause(new Condition("Wait for the close button click") {
			@Override
			public boolean test() {
				return !dialog.isDisplayable();
			}
		});

		long end = System.currentTimeMillis();
		System.out.println(this.getClass().getSimpleName() + " ["
				+ this.skin.getDisplayName() + "] : " + (end - start) + "ms");
	}

	/**
	 * Creates the screenshot and saves it on the disk.
	 */
	public void makeScreenshot() {
		BufferedImage bi = new BufferedImage(dialog.getWidth(), dialog
				.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Map<Component, Boolean> map = new HashMap<Component, Boolean>();
		RobotUtilities.makePreviewable(dialog, map);
		Graphics g = bi.getGraphics();
		dialog.paint(g);
		try {
			ImageIO
					.write(bi, "png",
							new File(this.screenshotFilename + ".png"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
