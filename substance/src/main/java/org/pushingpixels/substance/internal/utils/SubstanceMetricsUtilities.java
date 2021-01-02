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
package org.pushingpixels.substance.internal.utils;

import org.pushingpixels.neon.api.NeonCortex;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * Utility methods to keep component preferred size and component painting in sync.
 * All update() calls in the UI delegates use {@link NeonCortex#installDesktopHints}
 * on the passed {@link Graphics} object. Components that show texts (labels, buttons, etc)
 * should also account for text hinting for computing the preferred size. Otherwise on
 * some JVM versions on specific screens the width of unhinted text is not the same as the
 * width of hinted text, leading to text cut-off.
 */
public class SubstanceMetricsUtilities {
    private static BufferedImage offscreen = NeonCortex.getBlankImage(1, 1);
    private static Map<Font, FontMetrics> metricsMap = new SoftHashMap<>();
    private static Map<Font, FontRenderContext> renderContextMap = new SoftHashMap<>();

    private static Rectangle iconR = new Rectangle();
    private static Rectangle textR = new Rectangle();
    private static Rectangle viewR = new Rectangle();
    private static Insets insets = new Insets(0, 0, 0, 0);

    public static FontMetrics getFontMetrics(Font font) {
        if (metricsMap.containsKey(font)) {
            return metricsMap.get(font);
        }

        Graphics2D g2d = offscreen.createGraphics();
        g2d.setFont(font);
        NeonCortex.installDesktopHints(g2d, font);
        FontMetrics result = g2d.getFontMetrics();
        NeonCortex.clearDesktopHints(g2d, font);
        g2d.dispose();

        metricsMap.put(font, result);

        return result;
    }

    public static FontRenderContext getFontRenderContext(Font font) {
        if (renderContextMap.containsKey(font)) {
            return renderContextMap.get(font);
        }

        Graphics2D g2d = offscreen.createGraphics();
        g2d.setFont(font);
        NeonCortex.installDesktopHints(g2d, font);
        FontRenderContext result = g2d.getFontRenderContext();
        NeonCortex.clearDesktopHints(g2d, font);
        g2d.dispose();

        renderContextMap.put(font, result);

        return result;
    }

    public static Dimension getPreferredLabelSize(JLabel label) {
        String text = label.getText();
        Icon icon = label.isEnabled() ? label.getIcon() : label.getDisabledIcon();
        Font font = label.getFont();

        insets = label.getInsets(insets);

        int dx = insets.left + insets.right;
        int dy = insets.top + insets.bottom;

        if ((icon == null) && ((text == null) || (font == null))) {
            return new Dimension(dx, dy);
        } else if ((text == null) || ((icon != null) && (font == null))) {
            return new Dimension(icon.getIconWidth() + dx,
                    icon.getIconHeight() + dy);
        } else {
            FontMetrics fm = getFontMetrics(font);
            iconR.setBounds(0, 0, 0, 0);
            textR.setBounds(0, 0, 0, 0);
            viewR.setBounds(dx, dy, Short.MAX_VALUE, Short.MAX_VALUE);

            SwingUtilities.layoutCompoundLabel(label, fm, text, icon,
                    label.getVerticalAlignment(), label.getHorizontalAlignment(),
                    label.getVerticalTextPosition(), label.getHorizontalTextPosition(),
                    viewR, iconR, textR, label.getIconTextGap());

            int minLeft = Math.min(iconR.x, textR.x);
            int maxRight = Math.max(iconR.x + iconR.width, textR.x + textR.width);
            int minTop = Math.min(iconR.y, textR.y);
            int maxBottom = Math.max(iconR.y + iconR.height, textR.y + textR.height);
            Dimension result = new Dimension(maxRight - minLeft, maxBottom - minTop);

            result.width += dx;
            result.height += dy;

            return result;
        }
    }

    public static Dimension getPreferredButtonSize(AbstractButton button) {
        if (button.getComponentCount() > 0) {
            return null;
        }

        iconR.setBounds(0, 0, 0, 0);
        textR.setBounds(0, 0, 0, 0);
        viewR.setBounds(0, 0, Short.MAX_VALUE, Short.MAX_VALUE);

        SwingUtilities.layoutCompoundLabel(
                button, getFontMetrics(button.getFont()), button.getText(), button.getIcon(),
                button.getVerticalAlignment(), button.getHorizontalAlignment(),
                button.getVerticalTextPosition(), button.getHorizontalTextPosition(),
                viewR, iconR, textR, (button.getText() == null) ? 0 : button.getIconTextGap());

        Rectangle r = iconR.union(textR);

        insets = button.getInsets(insets);
        r.width += insets.left + insets.right;
        r.height += insets.top + insets.bottom;

        return r.getSize();
    }


    public static Dimension getPreferredCheckButtonSize(JToggleButton button, Icon defaultIcon) {
        if (button.getComponentCount() > 0) {
            return null;
        }

        String text = button.getText();

        Icon buttonIcon = button.getIcon();
        if (buttonIcon == null) {
            buttonIcon = defaultIcon;
        }

        FontMetrics fm = getFontMetrics(button.getFont());

        textR.setBounds(0, 0, 0, 0);
        iconR.setBounds(0, 0, 0, 0);
        viewR.setBounds(0, 0, Short.MAX_VALUE, Short.MAX_VALUE);

        SwingUtilities.layoutCompoundLabel(
                button, fm, text, buttonIcon,
                button.getVerticalAlignment(), button.getHorizontalAlignment(),
                button.getVerticalTextPosition(), button.getHorizontalTextPosition(),
                viewR, iconR, textR,
                text == null ? 0 : button.getIconTextGap());

        int minLeft = Math.min(iconR.x, textR.x);
        int maxRight = Math.max(iconR.x + iconR.width, textR.x + textR.width);
        int minTop = Math.min(iconR.y, textR.y);
        int maxBottom = Math.max(iconR.y + iconR.height, textR.y + textR.height);

        int width = maxRight - minLeft;
        int height = maxBottom - minTop;

        insets = button.getInsets(insets);
        width += (insets.left + insets.right);
        height += (insets.top + insets.bottom);

        return new Dimension(width, height);
    }

}
