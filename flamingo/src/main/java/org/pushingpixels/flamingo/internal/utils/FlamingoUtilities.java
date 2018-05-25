/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.flamingo.internal.utils;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager;
import org.pushingpixels.flamingo.api.ribbon.AbstractRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.api.ribbon.resize.IconRibbonBandResizePolicy;
import org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizePolicy;
import org.pushingpixels.flamingo.internal.ui.ribbon.AbstractBandControlPanel;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonTaskToggleButton;
import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.JRibbonApplicationMenuButton;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

/**
 * Helper utilities for Flamingo project. This class is for internal use only.
 * 
 * @author Kirill Grouchnikov
 */
public class FlamingoUtilities {
    /**
     * Gets the component font.
     * 
     * @param comp
     *            Component.
     * @param keys
     *            {@link UIManager} keys.
     * @return If the component is not <code>null</code>, its font is returned. Otherwise the first
     *         entry in {@link UIManager} which is a {@link Font} is returned.
     */
    public static FontUIResource getFont(Component comp, String... keys) {
        if (comp != null) {
            Font compFont = comp.getFont();
            if ((compFont != null) && !(compFont instanceof UIResource)) {
                return new FontUIResource(compFont);
            }
        }
        for (String key : keys) {
            Font font = UIManager.getFont(key);
            if (font != null) {
                if (font instanceof UIResource)
                    return (FontUIResource) font;
                else
                    return new FontUIResource(font);
            }
        }
        return null;
    }

    /**
     * Gets the color based on the specified {@link UIManager} keys.
     * 
     * @param defaultColor
     *            Default color to return if none of the {@link UIManager} keys are present.
     * @param keys
     *            {@link UIManager} keys.
     * @return The first entry in {@link UIManager} which is a color. If none, then the default
     *         color is returned.
     */
    public static Color getColor(Color defaultColor, String... keys) {
        for (String key : keys) {
            Color color = UIManager.getColor(key);
            if (color != null)
                return color;
        }
        return new ColorUIResource(defaultColor);
    }

    /**
     * Creates a thumbnail of the specified width.
     * 
     * @param image
     *            The original image.
     * @param requestedThumbWidth
     *            The width of the resulting thumbnail.
     * @return Thumbnail of the specified width.
     * @author Romain Guy
     */
    public static BufferedImage createThumbnail(BufferedImage image, int requestedThumbWidth) {
        float ratio = (float) image.getWidth() / (float) image.getHeight();
        int width = image.getWidth();
        BufferedImage thumb = image;

        do {
            width /= 2;
            if (width < requestedThumbWidth) {
                width = requestedThumbWidth;
            }

            BufferedImage temp = new BufferedImage(width, (int) (width / ratio),
                    BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = temp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(thumb, 0, 0, temp.getWidth(), temp.getHeight(), null);
            g2.dispose();

            thumb = temp;
        } while (width != requestedThumbWidth);

        return thumb;
    }

    /**
     * Returns the alpha version of the specified color.
     * 
     * @param color
     *            Original color.
     * @param alpha
     *            Alpha channel value.
     * @return Alpha version of the specified color.
     */
    public static Color getAlphaColor(Color color, int alpha) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
    }

    public static int getHLayoutGap(AbstractCommandButton commandButton) {
        Font font = commandButton.getFont();
        if (font == null)
            font = UIManager.getFont("Button.font");
        return (int) Math.ceil(commandButton.getHGapScaleFactor() * (font.getSize() - 4) / 4);
    }

    public static int getVLayoutGap(AbstractCommandButton commandButton) {
        Font font = commandButton.getFont();
        if (font == null)
            font = UIManager.getFont("Button.font");
        return (int) Math.ceil(commandButton.getVGapScaleFactor() * (font.getSize() - 4) / 4);
    }

    public static boolean hasPopupAction(AbstractCommandButton commandButton) {
        if (commandButton instanceof JCommandButton) {
            JCommandButton jcb = (JCommandButton) commandButton;
            return jcb.getCommandButtonKind().hasPopup();
        }
        return false;
    }

    public static void updateRibbonFrameIconImages(JRibbonFrame ribbonFrame) {
        JRibbonApplicationMenuButton appMenuButton = getApplicationMenuButton(ribbonFrame);
        if (appMenuButton == null) {
            return;
        }

        ResizableIcon appIcon = ribbonFrame.getApplicationIcon();
        if (appIcon != null) {
            appMenuButton.setIcon(appIcon);
        }
    }

    public static JRibbonApplicationMenuButton getApplicationMenuButton(Component comp) {
        if (comp instanceof JRibbonApplicationMenuButton)
            return (JRibbonApplicationMenuButton) comp;
        if (comp instanceof Container) {
            Container cont = (Container) comp;
            for (int i = 0; i < cont.getComponentCount(); i++) {
                JRibbonApplicationMenuButton result = getApplicationMenuButton(
                        cont.getComponent(i));
                if ((result != null) && result.isVisible())
                    return result;
            }
        }
        return null;
    }

    public static Color getBorderColor() {
        return FlamingoUtilities.getColor(Color.gray, "TextField.inactiveForeground",
                "Button.disabledText", "ComboBox.disabledForeground");
    }

    public static boolean isShowingMinimizedRibbonInPopup(JRibbon ribbon) {
        List<PopupPanelManager.PopupInfo> popups = PopupPanelManager.defaultManager()
                .getShownPath();
        if (popups.size() == 0)
            return false;

        for (PopupPanelManager.PopupInfo popup : popups) {
            JComponent originator = popup.getPopupOriginator();
            if (originator instanceof JRibbonTaskToggleButton) {
                return (ribbon == SwingUtilities.getAncestorOfClass(JRibbon.class, originator));
            }
        }
        return false;
    }

    public static void checkResizePoliciesConsistency(AbstractRibbonBand ribbonBand) {
        Insets ins = ribbonBand.getInsets();
        AbstractBandControlPanel controlPanel = ribbonBand.getControlPanel();
        if (controlPanel == null)
            return;
        int height = controlPanel.getPreferredSize().height
                + ribbonBand.getUI().getBandTitleHeight() + ins.top + ins.bottom;
        List<RibbonBandResizePolicy> resizePolicies = ribbonBand.getResizePolicies();
        checkResizePoliciesConsistencyBase(ribbonBand);
        for (int i = 0; i < (resizePolicies.size() - 1); i++) {
            RibbonBandResizePolicy policy1 = resizePolicies.get(i);
            RibbonBandResizePolicy policy2 = resizePolicies.get(i + 1);
            int width1 = policy1.getPreferredWidth(height, 4);
            int width2 = policy2.getPreferredWidth(height, 4);
            if (width1 < width2) {
                // create the trace message
                StringBuilder builder = new StringBuilder();
                builder.append("Inconsistent preferred widths\n");
                builder.append("Ribbon band '" + ribbonBand.getTitle()
                        + "' has the following resize policies\n");
                for (int j = 0; j < resizePolicies.size(); j++) {
                    RibbonBandResizePolicy policy = resizePolicies.get(j);
                    int width = policy.getPreferredWidth(height, 4);
                    builder.append("\t" + policy.getClass().getName() + " with preferred width "
                            + width + "\n");
                }
                builder.append(policy1.getClass().getName() + " with pref width " + width1
                        + " is followed by resize policy " + policy2.getClass().getName()
                        + " with larger pref width\n");

                throw new IllegalStateException(builder.toString());
            }
        }
    }

    private static void checkResizePoliciesConsistencyBase(AbstractRibbonBand ribbonBand) {
        List<RibbonBandResizePolicy> resizePolicies = ribbonBand.getResizePolicies();
        if (resizePolicies.size() == 0) {
            throw new IllegalStateException("Must have at least one resize policy");
        }
        if ((resizePolicies.size() == 1)
                && (resizePolicies.get(0) instanceof IconRibbonBandResizePolicy)) {
            throw new IllegalStateException(
                    "When icon resize policy is present, must have at least one another resize policy.");
        }
        for (int i = 0; i < resizePolicies.size(); i++) {
            RibbonBandResizePolicy policy = resizePolicies.get(i);
            boolean isIcon = policy instanceof IconRibbonBandResizePolicy;
            if (isIcon && (i < (resizePolicies.size() - 1))) {
                throw new IllegalStateException("Icon resize policy must be the last in the list");
            }
        }
    }

    public static int getScaledSize(int baseSize, int componentFontSize, double scaleFactor,
            int stepQuantizationSize) {
        int fontDelta = Math.max(0, componentFontSize - 16);
        int stepCount = fontDelta / stepQuantizationSize;
        return baseSize + (int) (scaleFactor * stepCount * stepQuantizationSize);
    }
}
