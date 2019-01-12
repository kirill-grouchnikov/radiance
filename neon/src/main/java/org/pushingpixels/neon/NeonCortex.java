/*
 * Copyright (c) 2005-2019 Radiance Neon Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.neon.font.*;
import org.pushingpixels.neon.icon.*;
import org.pushingpixels.neon.internal.ColorFilter;
import org.pushingpixels.neon.internal.contrib.intellij.*;
import org.pushingpixels.neon.internal.contrib.jgoodies.looks.LookUtils;
import org.pushingpixels.neon.internal.font.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterGraphics;
import java.security.*;
import java.util.*;

/**
 * Provides the public API surface for working with platform-consistent fonts,
 * text rendering and offscreen bitmap rendering.
 *
 * @author Kirill Grouchnikov.
 */
public class NeonCortex {
    public enum Platform {
        MACOS, GNOME, KDE, WINDOWS, DEFAULT
    }

    private static final String PROP_DESKTOPHINTS = "awt.font.desktophints";
    private static Platform platform;

    private static Map<String, Map> desktopHintsCache = new HashMap<>();

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
            PrivilegedAction<String> desktopAction = () -> System.getProperty("sun.desktop");
            String desktop = AccessController.doPrivileged(desktopAction);
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

        return (UIDefaults table) -> new NeonFontSet(defaultPolicy.getFontSet(table));
    }

    /**
     * Returns scaled platform-specific font policy.
     *
     * @param scaleFactor Scale factor. Should be positive.
     * @return Scaled platform-specific font policy.
     */
    public static FontPolicy getScaledFontPolicy(final float scaleFactor) {
        final FontSet defaultFontSet = getDefaultFontPolicy().getFontSet(null);
        // Create the scaled font set
        FontPolicy newFontPolicy = (UIDefaults table) ->
                new ScaledFontSet(defaultFontSet, scaleFactor);
        return newFontPolicy;
    }

    /**
     * Creates a thumbnail of the specified width.
     *
     * @param image               The original image.
     * @param requestedThumbWidth The width of the resulting thumbnail.
     * @return Thumbnail of the specified width.
     * @author Romain Guy
     */
    public static BufferedImage createThumbnail(BufferedImage image, int requestedThumbWidth) {
        float ratio = (float) image.getWidth() / (float) image.getHeight();
        int width = image.getWidth();
        BufferedImage thumb = image;

        double scaleFactor = getScaleFactor();
        do {
            width /= 2;
            if (width < requestedThumbWidth) {
                width = requestedThumbWidth;
            }

            BufferedImage temp = NeonCortex.getBlankImage(width, (int) (width / ratio));
            Graphics2D g2 = temp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2.drawImage(thumb, 0, 0, (int) (temp.getWidth() / scaleFactor),
                    (int) (temp.getHeight() / scaleFactor), null);
            g2.dispose();

            thumb = temp;
        } while (width != requestedThumbWidth);

        return thumb;
    }

    public static void installDesktopHints(Graphics2D g2, Component c) {
        Map desktopHints = desktopHints(g2);
        if (desktopHints != null && !desktopHints.isEmpty()) {
            g2.addRenderingHints(desktopHints);
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
            Map desktopHints = (Map) toolkit.getDesktopProperty(PROP_DESKTOPHINTS + '.'
                    + device.getIDstring());
            if (desktopHints == null) {
                desktopHints = (Map) toolkit.getDesktopProperty(PROP_DESKTOPHINTS);
            }
            // It is possible to get a non-empty map but with disabled AA.
            if (desktopHints != null) {
                Object aaHint = desktopHints.get(RenderingHints.KEY_TEXT_ANTIALIASING);
                if ((aaHint == RenderingHints.VALUE_TEXT_ANTIALIAS_OFF)
                        || (aaHint == RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT)) {
                    desktopHints = null;
                }
            }

            if (desktopHints == null) {
                desktopHints = new HashMap();
            }
            if (getPlatform() == Platform.MACOS && LookUtils.IS_OS_MAC_MOJAVE_OR_LATER
                    && (device.getType() == GraphicsDevice.TYPE_RASTER_SCREEN)) {
                desktopHints.put(RenderingHints.KEY_TEXT_ANTIALIASING,
                        RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
            }

            desktopHintsCache.put(deviceId, desktopHints);
        }

        return desktopHintsCache.get(deviceId);
    }

    private static boolean isPrinting(Graphics g) {
        return (g instanceof PrintGraphics) || (g instanceof PrinterGraphics);
    }

    public static double getScaleFactor() {
        return UIUtil.getScaleFactor();
    }

    /**
     * Gets a scaled, high-DPI aware image of specified dimensions.
     * <p>
     * Use {@link #drawImage(Graphics, Image, int, int)} or
     * {@link #drawImage(Graphics, Image, int, int, int, int, int, int)} to draw the image
     * obtained with this method. Note that applying an extension of
     * {@link org.pushingpixels.neon.filter.NeonAbstractFilter} is a "safe" operation
     * as far as preserving the scale-aware configuration. If you are using a custom
     * {@link java.awt.image.BufferedImageOp} that is not a
     * {@link org.pushingpixels.neon.filter.NeonAbstractFilter}, the resulting image will be
     * a regular {@link BufferedImage} that will not be drawn correctly using one of the
     * <code>drawImage</code> methods above. In such a case, use {@link #getScaleFactor()}
     * to divide the image width and height for the purposes of drawing.
     *
     * @param width  Width of the target image
     * @param height Width of the target image
     * @return A scaled, high-DPI aware image of specified dimensions.
     */
    public static BufferedImage getBlankImage(int width, int height) {
        if (UIUtil.getScaleFactor() > 1.0) {
            return JBHiDPIScaledImage.create(width, height, BufferedImage.TYPE_INT_ARGB);
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

    public static void drawImage(Graphics g, Image img, int x, int y) {
        if (img instanceof JBHiDPIScaledImage) {
            double scaleFactor = UIUtil.getScaleFactor();
            g.drawImage(img, x, y, (int) (img.getWidth(null) / scaleFactor),
                    (int) (img.getHeight(null) / scaleFactor), null);
        } else {
            g.drawImage(img, x, y, img.getWidth(null), img.getHeight(null), null);
        }
    }

    public static void drawImage(Graphics g, Image img, int x, int y,
            int width, int height, int offsetX, int offsetY) {
        if (img instanceof JBHiDPIScaledImage) {
            double scaleFactor = UIUtil.getScaleFactor();
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

    /**
     * Returns the colorized version of icon based off of the passed icon factory.
     *
     * @param sourceFactory Source factory to be used to create the icon.
     * @param color         Color for colorization.
     * @return The colorized version of the icon.
     */
    public static ResizableIcon colorizeIcon(ResizableIconFactory sourceFactory,
            Color color) {
        return new ResizableIcon() {
            private int width;
            private int height;
            private BufferedImage colorized;

            @Override
            public void setDimension(Dimension newDimension) {
                ResizableIcon original = sourceFactory.createNewIcon();
                original.setDimension(newDimension);
                BufferedImage flat = NeonCortex.getBlankImage(newDimension.width,
                        newDimension.height);
                original.paintIcon(null, flat.getGraphics(), 0, 0);
                this.colorized = new ColorFilter(color).filter(flat, null);

                this.width = newDimension.width;
                this.height = newDimension.height;
            }

            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.translate(x, y);
                NeonCortex.drawImage(g2d, this.colorized, x, y);
                g2d.dispose();
            }

            @Override
            public int getIconWidth() {
                return this.width;
            }

            @Override
            public int getIconHeight() {
                return this.height;
            }
        };
    }

    /**
     * Returns the colorized version of icon based off of the passed icon factory.
     *
     * @param sourceFactory Source factory to be used to create the icon.
     * @param color         Color for colorization.
     * @param alpha         Alpha value for colorization.
     * @return The colorized version of the icon.
     */
    public static ResizableIcon colorizeIcon(ResizableIconFactory sourceFactory,
            Color color, float alpha) {
        return colorizeIcon(sourceFactory, new Color(color.getRed(), color.getGreen(),
                color.getBlue(), (int) (alpha * 255)));
    }

    /**
     * Returns the colorized version of icon based off of the passed icon factory. The returned
     * icon also implements the marker {@link javax.swing.plaf.UIResource} interface.
     *
     * @param sourceFactory Source factory to be used to create the icon.
     * @param color         Color for colorization.
     * @return The colorized version of the icon.
     */
    public static ResizableIconUIResource colorizeIconAsUiResource(
            ResizableIconFactory sourceFactory, Color color) {
        return new ResizableIconUIResource(colorizeIcon(sourceFactory, color));
    }

    /**
     * Returns the colorized version of icon based off of the passed icon factory. The returned
     * icon also implements the marker {@link javax.swing.plaf.UIResource} interface.
     *
     * @param sourceFactory Source factory to be used to create the icon.
     * @param color         Color for colorization.
     * @param alpha         Alpha value for colorization.
     * @return The colorized version of the icon.
     */
    public static ResizableIconUIResource colorizeIconAsUiResource(
            ResizableIconFactory sourceFactory, Color color, float alpha) {
        return colorizeIconAsUiResource(sourceFactory,
                new Color(color.getRed(), color.getGreen(),
                        color.getBlue(), (int) (alpha * 255)));
    }
}
