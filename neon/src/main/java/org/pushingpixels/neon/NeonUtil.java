/*
 * Copyright (c) 2005-2018 Radiance Neon Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Neon Kirill Grouchnikov nor the names of
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
package org.pushingpixels.neon;

import org.pushingpixels.neon.internal.contrib.intellij.JBHiDPIScaledImage;
import org.pushingpixels.neon.internal.contrib.intellij.UIUtil;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterGraphics;
import java.util.HashMap;
import java.util.Map;

/**
 * A collection of utility methods.
 *
 * @author Kirill Grouchnikov.
 */
public class NeonUtil {
    private static final String PROP_DESKTOPHINTS = "awt.font.desktophints";

    private static Map<String, Map> desktopHintsCache = new HashMap<>();

    public static void installDesktopHints(Graphics2D g2, Component c) {
        Map desktopHints = desktopHints(g2);
        if (desktopHints != null && !desktopHints.isEmpty()) {
            g2.addRenderingHints(desktopHints);
            if (c != null) {
                Font font = c.getFont();
                if (font != null) {
                    if (font.getSize() > 15) {
                        g2.setRenderingHint(
                                RenderingHints.KEY_TEXT_ANTIALIASING,
                                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                    }
                }
            }
        }
    }

    private static Map desktopHints(Graphics2D g2) {
        if (isPrinting(g2)) {
            return null;
        }
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        GraphicsDevice device = g2.getDeviceConfiguration().getDevice();
        String deviceId = device.getIDstring();
        if (!desktopHintsCache.containsKey(deviceId)) {
            Map desktopHints = (Map) toolkit
                    .getDesktopProperty(PROP_DESKTOPHINTS + '.'
                            + device.getIDstring());
            if (desktopHints == null) {
                desktopHints = (Map) toolkit
                        .getDesktopProperty(PROP_DESKTOPHINTS);
            }
            // It is possible to get a non-empty map but with disabled AA.
            if (desktopHints != null) {
                Object aaHint = desktopHints
                        .get(RenderingHints.KEY_TEXT_ANTIALIASING);
                if ((aaHint == RenderingHints.VALUE_TEXT_ANTIALIAS_OFF)
                        || (aaHint == RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT)) {
                    desktopHints = null;
                }
            }

            if (desktopHints == null)
                desktopHints = new HashMap();

            desktopHintsCache.put(deviceId, desktopHints);
        }

        return desktopHintsCache.get(deviceId);
    }

    private static boolean isPrinting(Graphics g) {
        return g instanceof PrintGraphics || g instanceof PrinterGraphics;
    }

    public static double getScaleFactor() {
        return UIUtil.getScaleFactor();
    }

    public static BufferedImage getBlankImage(int width, int height) {
        if (UIUtil.getScaleFactor() > 1.0) {
            return new JBHiDPIScaledImage(width, height, BufferedImage.TYPE_INT_ARGB);
        } else {
            GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice d = e.getDefaultScreenDevice();
            GraphicsConfiguration c = d.getDefaultConfiguration();
            return c.createCompatibleImage(width, height, Transparency.TRANSLUCENT);
        }
    }

    public static BufferedImage getBlankUnscaledImage(int width, int height) {
        if (UIUtil.getScaleFactor() > 1.0) {
            JBHiDPIScaledImage result = new JBHiDPIScaledImage(null, width, height,
                    BufferedImage.TYPE_INT_ARGB);
            result.setIgnoreScaling();
            return result;
        } else {
            GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice d = e.getDefaultScreenDevice();
            GraphicsConfiguration c = d.getDefaultConfiguration();
            return c.createCompatibleImage(width, height, Transparency.TRANSLUCENT);
        }
    }

}
