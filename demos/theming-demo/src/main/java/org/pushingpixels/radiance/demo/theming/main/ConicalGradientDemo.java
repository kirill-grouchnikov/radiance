/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of the copyright holder nor the names of
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
package org.pushingpixels.radiance.demo.theming.main;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;
import org.pushingpixels.radiance.theming.internal.utils.ConicalGradientPaint;

import javax.swing.*;
import java.awt.*;

/**
 * Contributed under the BSD license by Gerrit Grunwald. Original code from
 * https://www.jug-muenster.de/java2d-conical-gradient-paint-674/
 *
 * @author hansolo
 */
public class ConicalGradientDemo extends javax.swing.JComponent
{
    public ConicalGradientDemo()
    {
        super();
    }

    @Override
    protected void paintComponent(java.awt.Graphics g)
    {
        final java.awt.Graphics2D G2 = (java.awt.Graphics2D) g;

        G2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

        final java.awt.geom.Ellipse2D CONE = new java.awt.geom.Ellipse2D.Double(0, 0, 100, 100);

        final java.awt.geom.Point2D CONE_CENTER = new java.awt.geom.Point2D.Double(CONE.getCenterX(), CONE.getCenterY());

        final java.awt.Color COLOR2 = java.awt.Color.BLACK;
        final java.awt.Color COLOR1 = java.awt.Color.MAGENTA;

        final float ROTATION_OFFSET = 0f;

        final float[] CONE1_FRACTIONS =
        {
            0.0f,
            0.5f,
            1.0f
        };

        final java.awt.Color[] CONE1_COLORS =
        {
            java.awt.Color.BLACK,
            java.awt.Color.WHITE,
            java.awt.Color.BLACK
        };


        final float[] CONE2_FRACTIONS =
        {
            0,
            30,
            60,
            90,
            120,
            150,
            180,
            210,
            240,
            270,
            300,
            330,
            360
        };


        final java.awt.Color[] CONE2_COLORS =
        {
            COLOR1,
            COLOR2,
            COLOR1,
            COLOR2,
            COLOR1,
            COLOR2,
            COLOR1,
            COLOR2,
            COLOR1,
            COLOR2,
            COLOR1,
            COLOR2,
            COLOR1,
        };

        ConicalGradientPaint coneGradient = new ConicalGradientPaint(false, CONE_CENTER, ROTATION_OFFSET, CONE1_FRACTIONS, CONE1_COLORS);
        G2.setPaint(coneGradient);
        G2.fill(CONE);

        coneGradient = new ConicalGradientPaint(true, CONE_CENTER, ROTATION_OFFSET, CONE2_FRACTIONS, CONE2_COLORS);
        G2.translate(150, 0);
        G2.setPaint(coneGradient);
        G2.fill(CONE);
        G2.translate(-150, 0);

        G2.drawImage(createStainlessSteelKnobImage(100), 0, 150, null);

        G2.drawImage(createSunBeamImage(getWidth(), getHeight()), 150, 150, null);
    }



    private java.awt.image.BufferedImage createStainlessSteelKnobImage(final int SIZE)
    {
        final java.awt.GraphicsConfiguration GFX_CONF = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        final java.awt.image.BufferedImage IMAGE = GFX_CONF.createCompatibleImage(SIZE, SIZE, java.awt.Transparency.TRANSLUCENT);
        final java.awt.Graphics2D G2 = IMAGE.createGraphics();
        G2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        G2.setRenderingHint(java.awt.RenderingHints.KEY_DITHERING, java.awt.RenderingHints.VALUE_DITHER_ENABLE);
        G2.setRenderingHint(java.awt.RenderingHints.KEY_ALPHA_INTERPOLATION, java.awt.RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        G2.setRenderingHint(java.awt.RenderingHints.KEY_COLOR_RENDERING, java.awt.RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        G2.setRenderingHint(java.awt.RenderingHints.KEY_STROKE_CONTROL, java.awt.RenderingHints.VALUE_STROKE_PURE);

        final java.awt.geom.Ellipse2D KNOB_FRAME = new java.awt.geom.Ellipse2D.Double(0, 0, SIZE, SIZE);
        final java.awt.geom.Point2D CENTER = new java.awt.geom.Point2D.Double(KNOB_FRAME.getCenterX(), KNOB_FRAME.getCenterY());
        final float[] KNOB_FRAME_FRACTIONS =
        {
            0.0f,
            0.02f,
            0.13f,
            0.37f,
            0.55f,
            0.62f,
            0.8f,
            1.0f
        };

        final java.awt.Color[] KNOB_FRAME_COLORS =
        {
            java.awt.Color.WHITE,
            java.awt.Color.WHITE,
            java.awt.Color.DARK_GRAY,
            java.awt.Color.WHITE,
            java.awt.Color.WHITE,
            java.awt.Color.DARK_GRAY,
            java.awt.Color.WHITE,
            java.awt.Color.WHITE
        };
        final ConicalGradientPaint KNOB_FRAME_GRADIENT = new ConicalGradientPaint(CENTER, KNOB_FRAME_FRACTIONS, KNOB_FRAME_COLORS);
        G2.setPaint(KNOB_FRAME_GRADIENT);
        G2.fill(KNOB_FRAME);

        final java.awt.geom.Ellipse2D KNOB = new java.awt.geom.Ellipse2D.Double(KNOB_FRAME.getMinX() + 1, KNOB_FRAME.getMinY() + 1, KNOB_FRAME.getWidth() - 2, KNOB_FRAME.getHeight() - 2);
        final float[] KNOB_FRACTIONS =
        {
            0f,
            0.03f,
            0.10f,
            0.14f,
            0.24f,
            0.33f,
            0.38f,
            0.5f,
            0.62f,
            0.67f,
            0.76f,
            0.81f,
            0.85f,
            0.97f,
            1.0f
        };

        final java.awt.Color[] KNOB_COLORS =
        {
            new java.awt.Color(0xFDFDFD),
            new java.awt.Color(0xFDFDFD),
            new java.awt.Color(0xB2B2B4),
            new java.awt.Color(0xACACAE),
            new java.awt.Color(0xFDFDFD),
            new java.awt.Color(0x6E6E70),
            new java.awt.Color(0x6E6E70),
            new java.awt.Color(0xFDFDFD),
            new java.awt.Color(0x6E6E70),
            new java.awt.Color(0x6E6E70),
            new java.awt.Color(0xFDFDFD),
            new java.awt.Color(0xACACAE),
            new java.awt.Color(0xB2B2B4),
            new java.awt.Color(0xFDFDFD),
            new java.awt.Color(0xFDFDFD)
        };

        final ConicalGradientPaint KNOB_GRADIENT = new ConicalGradientPaint(false, CENTER, -0.25f, KNOB_FRACTIONS, KNOB_COLORS);
        G2.setPaint(KNOB_GRADIENT);
        G2.fill(KNOB);

        G2.dispose();

        return IMAGE;
    }

    private java.awt.image.BufferedImage createSunBeamImage(final int WIDTH, final int HEIGHT)
    {
        final java.awt.GraphicsConfiguration GFX_CONF = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        final java.awt.image.BufferedImage IMAGE = GFX_CONF.createCompatibleImage(WIDTH, HEIGHT, java.awt.Transparency.TRANSLUCENT);
        final java.awt.Graphics2D G2 = IMAGE.createGraphics();
        G2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        G2.setRenderingHint(java.awt.RenderingHints.KEY_DITHERING, java.awt.RenderingHints.VALUE_DITHER_ENABLE);
        G2.setRenderingHint(java.awt.RenderingHints.KEY_ALPHA_INTERPOLATION, java.awt.RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        G2.setRenderingHint(java.awt.RenderingHints.KEY_COLOR_RENDERING, java.awt.RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        G2.setRenderingHint(java.awt.RenderingHints.KEY_STROKE_CONTROL, java.awt.RenderingHints.VALUE_STROKE_PURE);

        final java.awt.geom.Rectangle2D SUN = new java.awt.geom.Rectangle2D.Double(0, 0, WIDTH, HEIGHT);

        final java.awt.geom.Point2D CENTER = new java.awt.geom.Point2D.Double(WIDTH * 0.1, HEIGHT * 0.1);

        final java.awt.Color SUN_BEAM_COLOR1 = new java.awt.Color(0xFFBF01);
        final java.awt.Color SUN_BEAM_COLOR2 = new java.awt.Color(0xFC0C00);



        final float[] SUN_FRACTIONS = new float[40];
        for (int i = 0 ; i < 360 ; i += 9)
        {
            SUN_FRACTIONS[i/9] = i;
        }

        final java.awt.Color[] SUN_COLORS = new java.awt.Color[40];
        for (int i = 0 ; i < 40 ; i++)
        {
            if (i % 2 == 0)
            {
                SUN_COLORS[i] = SUN_BEAM_COLOR1;
            }
            else
            {
                SUN_COLORS[i] = SUN_BEAM_COLOR2;
            }
        }

        final ConicalGradientPaint SUN_GRADIENT = new ConicalGradientPaint(true, CENTER, 170, SUN_FRACTIONS, SUN_COLORS);
        G2.setPaint(SUN_GRADIENT);
        G2.fill(SUN);

        G2.dispose();

        return IMAGE;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());

                JFrame frame = new JFrame("Conical gradients");
                frame.setLayout(new BorderLayout());
                frame.add(new ConicalGradientDemo(), BorderLayout.CENTER);
                frame.setSize(500, 500);

                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setIconImage(RadianceLogo.getLogoImage(frame,
                        RadianceThemingCortex.ComponentScope.getCurrentSkin(frame.getRootPane())
                                .getColorScheme(RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                                        ComponentState.ENABLED)));
            }
        });
    }
}
