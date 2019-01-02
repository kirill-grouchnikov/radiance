/*
 * Copyright (c) 2005-2019 Radiance Zodiac Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Zodiac Kirill Grouchnikov nor the names of
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
package org.pushingpixels.tools.zodiac;

import org.fest.swing.core.Robot;
import org.fest.swing.core.*;
import org.fest.swing.edt.*;
import org.fest.swing.timing.Pause;
import org.pushingpixels.demo.substance.main.check.SampleFrame;
import org.pushingpixels.neon.NeonCortex;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.tools.common.RadianceLogo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * The base class for taking screenshots of skins for Substance documentation.
 *
 * @author Kirill Grouchnikov
 */
public abstract class SkinRobot {
    /**
     * The associated Substance skin.
     */
    protected SubstanceSkin skin;

    /**
     * The screenshot filename.
     */
    private String screenshotFilename;

    /**
     * The frame instance.
     */
    private SampleFrame sf;

    /**
     * Creates the new screenshot robot.
     *
     * @param skin               Substance skin.
     * @param screenshotFilename The screenshot filename.
     */
    public SkinRobot(SubstanceSkin skin, String screenshotFilename) {
        this.skin = skin;
        this.screenshotFilename = screenshotFilename;
    }

    /**
     * Runs the screenshot process.
     */
    public void run(String screenshotDirectory) {
        long start = System.currentTimeMillis();

        Robot robot = BasicRobot.robotWithNewAwtHierarchy();

        // set skin
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                SubstanceCortex.GlobalScope.setSkin(skin);
                JFrame.setDefaultLookAndFeelDecorated(true);
            }
        });
        robot.waitForIdle();

        // create the frame and set the icon image
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                sf = new SampleFrame();
                sf.setIconImage(
                        RadianceLogo.INSTANCE.getLogoImage(
                                SubstanceCortex.ComponentScope.getCurrentSkin(
                                        sf.getRootPane()).getColorScheme(
                                        DecorationAreaType.PRIMARY_TITLE_PANE,
                                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                                        ComponentState.ENABLED)));
                sf.setSize(340, 254);
                sf.setLocationRelativeTo(null);
                sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                sf.setVisible(true);
            }
        });
        robot.waitForIdle();

        // get the default button
        JButton defaultButton = GuiActionRunner
                .execute(new GuiQuery<JButton>() {
                    @Override
                    protected JButton executeInEDT() throws Throwable {
                        return sf.getRootPane().getDefaultButton();
                    }
                });
        // and move the mouse to it
        robot.moveMouse(defaultButton);
        robot.waitForIdle();

        // wait for a second
        Pause.pause(1000);

        // make the first screenshot
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                makeScreenshot(screenshotDirectory, 1);
            }
        });
        robot.waitForIdle();

        // switch to the last tab
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                sf.switchToLastTab();
            }
        });
        robot.waitForIdle();

        // move the mouse away from the frame
        robot.moveMouse(new Point(0, 0));
        robot.waitForIdle();

        // wait for two seconds
        Pause.pause(1000);

        // make the second screenshot
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                makeScreenshot(screenshotDirectory, 2);
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
     * Creates the screenshot and saves it on the disk.
     *
     * @param count Sequence number for the screenshot.
     */
    private void makeScreenshot(String screenshotDirectory, int count) {
        BufferedImage bi = NeonCortex.getBlankImage(sf.getWidth(), sf.getHeight());
        Graphics g = bi.getGraphics();
        sf.paint(g);
        try {
            File output = new File(screenshotDirectory + this.screenshotFilename + count + ".png");
            output.getParentFile().mkdirs();
            ImageIO.write(bi, "png", output);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
