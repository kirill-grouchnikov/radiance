/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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
package org.pushingpixels.tools.substance.main.docrobot;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

import org.fest.swing.core.BasicRobot;
import org.fest.swing.core.Robot;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiTask;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

/**
 * The base class for taking a single screenshot for Substance documentation.
 * 
 * @author Kirill Grouchnikov
 */
public abstract class ImageWatermarkRobot {
	/**
	 * The screenshot filename.
	 */
	protected String screenshotFilename;

	/**
	 * The frame instance.
	 */
	protected JFrame sf;

	/**
	 * Creates the new screenshot robot.
	 * 
	 * @param screenshotFilename
	 *            The screenshot filename.
	 */
	public ImageWatermarkRobot(String screenshotFilename) {
		this.screenshotFilename = screenshotFilename;
	}

	/**
	 * Runs the screenshot process.
	 */
	public void run() {
		long start = System.currentTimeMillis();

		Robot robot = BasicRobot.robotWithNewAwtHierarchy();

		// set skin
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
				JFrame.setDefaultLookAndFeelDecorated(true);
			}
		});
		robot.waitForIdle();

		// create the frame and set the icon image
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				sf = new JFrame("Sample frame");
				apply();
				sf.setSize(238, 261);

				sf.setLayout(new FlowLayout(FlowLayout.CENTER));
				JButton defButton = new JButton("default");
				JButton disButton = new JButton("disabled");
				JButton regButton = new JButton("regular");
				disButton.setEnabled(false);
				sf.add(defButton);
				sf.add(disButton);
				sf.add(regButton);
				sf.getRootPane().setDefaultButton(defButton);

				BufferedImage iconImage = new BufferedImage(1, 1,
						BufferedImage.TYPE_INT_ARGB);
				sf.setIconImage(iconImage);
				sf.setLocationRelativeTo(null);
				sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				sf.setVisible(true);
			}
		});
		robot.waitForIdle();

		// make the screenshot
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				makeScreenshot();
			}
		});
		robot.waitForIdle();

		// dispose the frame
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				sf.dispose();
			}
		});
		robot.waitForIdle();

		long end = System.currentTimeMillis();
		System.out.println(this.getClass().getSimpleName() + " : "
				+ (end - start) + "ms");
	}

	/**
	 * Applies instance-specific Substance settings before taking the
	 * screenshot.
	 */
	protected abstract void apply();

	/**
	 * Creates the screenshot and saves it on the disk.
	 */
	public void makeScreenshot() {
		BufferedImage bi = new BufferedImage(sf.getWidth(), sf.getHeight(),
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.getGraphics();
		sf.paint(g);
		try {
			ImageIO.write(bi, "png", new File(this.screenshotFilename));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
