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
import org.fest.swing.edt.GuiTask;
import org.fest.swing.timing.Condition;
import org.fest.swing.timing.Pause;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * The base class for taking a single screenshot for Substance documentation.
 * 
 * @author Kirill Grouchnikov
 */
public class FrameRobot {
    /**
     * The associated Substance skin.
     */
    protected SubstanceSkin skin;

    /**
     * The screenshot filename.
     */
    protected String screenshotFilename;

    /**
     * The frame class name.
     */
    protected String frameClass;

    /**
     * Indicates whether the screenshot process is complete.
     */
    protected boolean done = false;

    protected JFrame frame;

    private Robot robot;

    /**
     * Creates the new screenshot robot.
     * 
     * @param skin
     *            Substance skin.
     * @param screenshotFilename
     *            The screenshot filename.
     */
    public FrameRobot(String frameClass, SubstanceSkin skin, String screenshotFilename,
            Robot robot) {
        this.frameClass = frameClass;
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
                JFrame.setDefaultLookAndFeelDecorated(true);
            }
        });
        robot.waitForIdle();

        // create the frame
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                try {
                    frame = (JFrame) Class.forName(frameClass).newInstance();
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                frame.setIconImage(SubstanceImageCreator.getColorSchemeImage(null,
                        new ImageIcon(FrameRobot.class.getClassLoader()
                                .getResource("test/resource/image-x-generic.png")),
                        SubstanceCortex.ComponentScope.getCurrentSkin(frame.getRootPane())
                                .getActiveColorScheme(DecorationAreaType.NONE),
                        0.0f));

                frame.setVisible(true);
            }
        });
        robot.waitForIdle();

        // remove the focus ring
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                KeyboardFocusManager.getCurrentKeyboardFocusManager().clearGlobalFocusOwner();
            }
        });

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
                frame.dispose();
            }
        });
        robot.waitForIdle();

        // wait for the frame to become disposed
        Pause.pause(new Condition("Wait for the frame to become disposed") {
            @Override
            public boolean test() {
                return !frame.isDisplayable();
            }
        });

        long end = System.currentTimeMillis();
        System.out.println(this.getClass().getSimpleName() + " [" + skin.getDisplayName() + "] : "
                + (end - start) + "ms");
    }

    /**
     * Creates the screenshot and saves it on the disk.
     */
    public void makeScreenshot() {
        BufferedImage bi = new BufferedImage(frame.getWidth(), frame.getHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.getGraphics();
        frame.paint(g);
        try {
            ImageIO.write(bi, "png", new File(screenshotFilename + ".png"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
