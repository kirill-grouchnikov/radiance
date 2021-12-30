/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.common.api;

import org.pushingpixels.radiance.common.api.filter.RadianceAbstractFilter;
import org.pushingpixels.radiance.common.api.font.FontPolicy;
import org.pushingpixels.radiance.common.api.font.FontSet;
import org.pushingpixels.radiance.common.internal.contrib.intellij.JBHiDPIScaledImage;
import org.pushingpixels.radiance.common.internal.contrib.intellij.UIUtil;
import org.pushingpixels.radiance.common.internal.contrib.jgoodies.looks.LookUtils;
import org.pushingpixels.radiance.common.internal.font.*;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterGraphics;
import java.util.HashMap;
import java.util.Map;

/**
 * Provides the public API surface for working with platform-consistent fonts,
 * text rendering and offscreen bitmap rendering.
 *
 * @author Kirill Grouchnikov.
 */
public class RadianceCommonCortex {
    public enum Platform {
        MACOS, GNOME, KDE, WINDOWS, DEFAULT
    }

    private static final String PROP_DESKTOPHINTS = "awt.font.desktophints";
    private static Platform platform;

    private static Map<String, Map> desktopHintsCache = new HashMap<>();

    // No-op private constructor to prevent application code from directly creating instances
    private RadianceCommonCortex() {
    }

    public static synchronized Platform getPlatform() {
        if (platform != null) {
            return platform;
        }

        if (LookUtils.IS_OS_WINDOWS) {
            return (platform = Platform.WINDOWS);
        }
        if (LookUtils.IS_OS_MAC) {
            return (platform = Platform.MACOS);
        }
        try {
            if (DefaultKDEFontPolicy.isKDERunning()) {
                return (platform = Platform.KDE);
            }
        } catch (Throwable t) {
            // security access - too bad for KDE desktops.
        }
        try {
            String desktop = System.getProperty("sun.desktop");
            if ("gnome".equals(desktop)) {
                return (platform = Platform.GNOME);
            }
        } catch (Throwable t) {
            // security access - too bad for Gnome desktops.
        }

        return (platform = Platform.DEFAULT);
    }

    /**
     * Returns the default platform-specific font policy.
     *
     * @return Default platform-specific font policy.
     */
    public static FontPolicy getDefaultFontPolicy() {
        Platform platform = getPlatform();

        FontPolicy defaultPolicy;
        switch (platform) {
            case MACOS:
                defaultPolicy = new DefaultMacFontPolicy();
                break;
            case KDE:
                defaultPolicy = new DefaultKDEFontPolicy();
                break;
            case GNOME:
                defaultPolicy = new DefaultGnomeFontPolicy();
                break;
            case WINDOWS:
                defaultPolicy = FontPolicies.getDefaultWindowsPolicy();
                break;
            default:
                defaultPolicy = FontPolicies.getDefaultPlasticPolicy();
        }

        return () -> new RadianceFontSet(defaultPolicy.getFontSet());
    }

    /**
     * Returns scaled platform-specific font policy.
     *
     * @param scaleFactor Scale factor. Should be positive.
     * @return Scaled platform-specific font policy.
     */
    public static FontPolicy getScaledFontPolicy(final float scaleFactor) {
        final FontSet defaultFontSet = getDefaultFontPolicy().getFontSet();
        // Create the scaled font set
        return () -> new ScaledFontSet(defaultFontSet, scaleFactor);
    }

    /**
     * Creates a thumbnail of the specified width.
     *
     * @param image               The original image.
     * @param requestedThumbWidth The width of the resulting thumbnail.
     * @return Thumbnail of the specified width.
     * @author Romain Guy
     */
    public static BufferedImage createThumbnail(double scale, BufferedImage image,
            int requestedThumbWidth) {
        float ratio = (float) image.getWidth() / (float) image.getHeight();
        int width = image.getWidth();
        BufferedImage thumb = image;

        do {
            width /= 2;
            if (width < requestedThumbWidth) {
                width = requestedThumbWidth;
            }

            BufferedImage temp = RadianceCommonCortex.getBlankScaledImage(scale, width, (int) (width / ratio));
            Graphics2D g2 = temp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2.drawImage(thumb, 0, 0, (int) (temp.getWidth() / scale),
                    (int) (temp.getHeight() / scale), null);
            g2.dispose();

            thumb = temp;
        } while (width != requestedThumbWidth);

        return thumb;
    }

    public static void installDesktopHints(Graphics2D g2, Font font) {
        // Special case for macOS on Mojave. The default system fonts, if rendered
        // with the hints returned from the "awt.font.desktophints" property of the
        // Toolkit, look too thick. Just for this configuration skip setting hints
        // altogether.
        boolean isDefaultMojaveFont = (getPlatform() == Platform.MACOS)
                && LookUtils.IS_OS_MAC_MOJAVE_OR_LATER
                && (g2.getDeviceConfiguration().getDevice().getType()
                == GraphicsDevice.TYPE_RASTER_SCREEN)
                && (font instanceof FontSets.DefaultUIResourceFont);
        if (isDefaultMojaveFont) {
            return;
        }

        Map desktopHints = desktopHints(g2);
        if (desktopHints != null && !desktopHints.isEmpty()) {
            g2.addRenderingHints(desktopHints);
        }
    }

    public static void clearDesktopHints(Graphics2D g2, Font font) {
        GraphicsDevice device = g2.getDeviceConfiguration().getDevice();
        String deviceId = device.getIDstring();
        desktopHintsCache.remove(deviceId);
    }

    private static Map desktopHints(Graphics2D g2) {
        if (isPrinting(g2)) {
            return null;
        }
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        GraphicsDevice device = g2.getDeviceConfiguration().getDevice();
        String deviceId = device.getIDstring();
        String key = deviceId;
        if (!desktopHintsCache.containsKey(key)) {
            Map desktopHints = (Map) toolkit.getDesktopProperty(PROP_DESKTOPHINTS + '.' + deviceId);
            if (desktopHints == null) {
                desktopHints = (Map) toolkit.getDesktopProperty(PROP_DESKTOPHINTS);
            }

            // It is possible to get a non-empty map but with disabled AA.
            if ((desktopHints != null)) {
                Object aaHint = desktopHints.get(RenderingHints.KEY_TEXT_ANTIALIASING);
                if ((aaHint == RenderingHints.VALUE_TEXT_ANTIALIAS_OFF)
                        || (aaHint == RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT)) {
                    desktopHints = null;
                }
            }

            if (desktopHints == null) {
                desktopHints = new HashMap();
            }
            desktopHintsCache.put(key, desktopHints);
        }

        return desktopHintsCache.get(key);
    }

    private static boolean isPrinting(Graphics g) {
        return (g instanceof PrintGraphics) || (g instanceof PrinterGraphics);
    }

    public static double getScaleFactor(Component component) {
        if ((component == null) || (component.getGraphicsConfiguration() == null)) {
            // TODO - revisit this
            return UIUtil.getScaleFactor();
        }
        AffineTransform transform = component.getGraphicsConfiguration().getDevice()
                .getDefaultConfiguration().getDefaultTransform();
        return Math.max(transform.getScaleX(), transform.getScaleY());
    }

    /**
     * Gets a scaled, high-DPI aware image of specified dimensions.
     * <p>
     * Use {@link #drawImageWithScale(Graphics, double, Image, int, int)} or
     * {@link #drawImageWithScale(Graphics, double, Image, int, int, int, int, int, int)}
     * to draw the image obtained with this method. Note that applying an extension of
     * {@link RadianceAbstractFilter} is a "safe" operation
     * as far as preserving the scale-aware configuration. If you are using a custom
     * {@link java.awt.image.BufferedImageOp} that is not a
     * {@link RadianceAbstractFilter}, the resulting image will be
     * a regular {@link BufferedImage} that will not be drawn correctly using one of the
     * <code>drawImageWithScale</code> methods above. In such a case, use
     * {@link #getScaleFactor(Component)} to divide the image width and height for the
     * purposes of drawing.
     *
     * @param width  Width of the target image
     * @param height Width of the target image
     * @return A scaled, high-DPI aware image of specified dimensions.
     */
    public static BufferedImage getBlankScaledImage(double scale, int width, int height) {
        if (scale > 1.0) {
            return JBHiDPIScaledImage.createScaled(scale, width, height, BufferedImage.TYPE_INT_ARGB);
        } else {
            GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice d = e.getDefaultScreenDevice();
            GraphicsConfiguration c = d.getDefaultConfiguration();
            return c.createCompatibleImage(width, height, Transparency.TRANSLUCENT);
        }
    }

    /**
     * Gets an unscaled, high-DPI aware image of specified dimensions.
     *
     * @param width  Width of the target image
     * @param height Width of the target image
     * @return An unscaled, high-DPI aware image of specified dimensions.
     */
    public static BufferedImage getBlankUnscaledImage(int width, int height) {
        if (UIUtil.getScaleFactor() > 1.0) {
            return JBHiDPIScaledImage.createUnscaled(width, height, BufferedImage.TYPE_INT_ARGB);
        } else {
            GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice d = e.getDefaultScreenDevice();
            GraphicsConfiguration c = d.getDefaultConfiguration();
            return c.createCompatibleImage(width, height, Transparency.TRANSLUCENT);
        }
    }

    public static void drawImageWithScale(Graphics g, double scaleFactor, Image img, int x, int y) {
        if (img instanceof JBHiDPIScaledImage) {
            g.drawImage(img, x, y, (int) (img.getWidth(null) / scaleFactor),
                    (int) (img.getHeight(null) / scaleFactor), null);
        } else {
            g.drawImage(img, x, y, img.getWidth(null), img.getHeight(null), null);
        }
    }

    public static void drawImageWithScale(Graphics g, double scaleFactor, Image img, int x, int y,
            int width, int height, int offsetX, int offsetY) {
        if (img instanceof JBHiDPIScaledImage) {
            g.drawImage(img, x, y, x + width, y + height,
                    x + (int) (offsetX * scaleFactor), y + (int) (offsetY * scaleFactor),
                    x + (int) ((offsetX + width) * scaleFactor),
                    y + (int) ((offsetY + height) * scaleFactor), null);
        } else {
            g.drawImage(img, x, y, x + width, y + height,
                    x + offsetX, y + offsetY,
                    x + offsetX + width, y + offsetY + height, null);
        }
    }
}
