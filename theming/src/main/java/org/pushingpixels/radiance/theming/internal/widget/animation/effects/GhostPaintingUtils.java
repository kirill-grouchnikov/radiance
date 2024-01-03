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
package org.pushingpixels.radiance.theming.internal.widget.animation.effects;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.AnimationFacet;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;
import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.Timeline.TimelineState;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Utility class that implements the ghost effects.
 * 
 * @author Kirill Grouchnikov
 */
public class GhostPaintingUtils {
    /**
     * Minimal starting opacity for icon ghosting. Change to a higher value for debugging / demoing
     * purposes.
     */
    public static float MIN_ICON_GHOSTING_ALPHA = 0.15f;

    /**
     * Maximal starting opacity for icon ghosting. Change to a higher value for debugging / demoing
     * purposes.
     */
    public static float MAX_ICON_GHOSTING_ALPHA = 0.5f;

    /**
     * Minimal starting opacity for press ghosting. Change to a higher value for debugging / demoing
     * purposes.
     */
    public static float MIN_PRESS_GHOSTING_ALPHA = 0.15f;

    /**
     * Maximal starting opacity for press ghosting. Change to a higher value for debugging / demoing
     * purposes.
     */
    public static float MAX_PRESS_GHOSTING_ALPHA = 0.3f;

    /**
     * Global decay factor.
     */
    public static float DECAY_FACTOR = 1.0f;

    /**
     * Cache of component ghost images. Used to speed up the rendering of the ghost effects.
     */
    private static LinkedHashMap<String, BufferedImage> componentGhostCache = new LinkedHashMap<>() {
        @Override
        protected boolean removeEldestEntry(java.util.Map.Entry<String, BufferedImage> eldest) {
            return this.size() > 50;
        }
    };

    /**
     * Cache of icon ghost images. Used to speed up the rendering of the ghost effects.
     */
    private static LinkedHashMap<String, BufferedImage> iconGhostCache = new LinkedHashMap<>() {
        @Override
        protected boolean removeEldestEntry(java.util.Map.Entry<String, BufferedImage> eldest) {
            return this.size() > 50;
        }
    };

    /**
     * Returns a scaled ghost image of the specified component.
     * 
     * @param comp
     *            Component.
     * @param ghostScaleFactor
     *            Scale factor.
     * @return A scaled ghost image of the specified component.
     */
    private static synchronized BufferedImage getComponentGhostImage(JComponent comp,
            Timeline ghostPressTimeline, double ghostScaleFactor) {
        double scale = RadianceCommonCortex.getScaleFactor(comp);
        String key = scale + ":"  + ghostPressTimeline.getTimelinePosition() + ":" +
                comp.hashCode() + ":" + ghostScaleFactor;

        BufferedImage result = componentGhostCache.get(key);
        if (result == null) {
            Rectangle bounds = comp.getBounds();

            double iWidth = bounds.width * ghostScaleFactor;
            double iHeight = bounds.height * ghostScaleFactor;
            result = RadianceCoreUtilities.getBlankImage(scale, (int) iWidth, (int) iHeight);
            Graphics2D iGraphics = result.createGraphics();
            iGraphics.scale(ghostScaleFactor, ghostScaleFactor);
            comp.paint(iGraphics);
            iGraphics.dispose();

            componentGhostCache.put(key, result);
        }
        return result;
    }

    /**
     * Returns a scaled ghost image of the specified icon.
     * 
     * @param comp
     *            Component.
     * @param icon
     *            Icon.
     * @param ghostScaleFactor
     *            Scale factor.
     * @return A scaled ghost image of the specified icon.
     */
    private static synchronized BufferedImage getIconGhostImage(JComponent comp,
            Timeline ghostRolloverTimeline, Icon icon, double ghostScaleFactor) {
        double scale = RadianceCommonCortex.getScaleFactor(comp);
        String key = scale + ":" + ghostRolloverTimeline.getTimelinePosition() + ":" +
                comp.hashCode() + ":" + icon.hashCode() + ":" + ghostScaleFactor;

        BufferedImage result = iconGhostCache.get(key);
        if (result == null) {
            int oWidth = icon.getIconWidth();
            int oHeight = icon.getIconHeight();
            double iWidth = oWidth * ghostScaleFactor;
            double iHeight = oHeight * ghostScaleFactor;
            result = RadianceCoreUtilities.getBlankImage(scale, (int) iWidth, (int) iHeight);
            Graphics2D iGraphics = result.createGraphics();
            iGraphics.scale(ghostScaleFactor, ghostScaleFactor);
            icon.paintIcon(comp, iGraphics, 0, 0);
            iGraphics.dispose();

            iconGhostCache.put(key, result);
        }
        return result;
    }

    /**
     * Paints ghost images on the specified component.
     * 
     * @param mainComponent
     *            Component.
     * @param g
     *            Graphics context.
     */
    public static void paintGhostImages(Component mainComponent, Graphics g) {
        if (!mainComponent.isShowing()) {
            return;
        }
        if (!mainComponent.isVisible()) {
            return;
        }
        // The following check is for offscreen rendering. The component
        // may be showing and visible, but have no peer (non displayable).
        if (!mainComponent.isDisplayable()) {
            return;
        }
        if (SwingUtilities.getWindowAncestor(mainComponent) == null) {
            return;
        }

        Graphics2D graphics = (Graphics2D) g.create();

        Rectangle mainRect = mainComponent.getBounds();
        mainRect.setLocation(mainComponent.getLocationOnScreen());
        if (AnimationConfigurationManager.getInstance().isAnimationAllowed(
                AnimationFacet.GHOSTING_BUTTON_PRESS, mainComponent)) {
            Map<JComponent, Timeline> runningGhostPressTimelines =
                    GhostingListener.getRunningGhostPressTimelines();
            for (Map.Entry<JComponent, Timeline> entry : runningGhostPressTimelines.entrySet()) {
                JComponent comp = entry.getKey();
                Timeline timeline = entry.getValue();

                if (comp == mainComponent) {
                    continue;
                }

                if (!comp.isShowing()) {
                    continue;
                }
                if (!comp.isVisible()) {
                    continue;
                }
                // The following check is for offscreen rendering. The component
                // may be showing and visible, but have no peer (non displayable).
                if (!comp.isDisplayable()) {
                    return;
                }

                Rectangle compRect = comp.getBounds();
                compRect.setLocation(comp.getLocationOnScreen());

                int dx = compRect.x - mainRect.x;
                int dy = compRect.y - mainRect.y;

                compRect.x -= compRect.width / 2;
                compRect.y -= compRect.height / 2;
                compRect.width *= 2;
                compRect.height *= 2;

                if (mainRect.intersects(compRect)) {
                    float fade = timeline.getTimelinePosition();
                    // 0.0 --> 0.3
                    // 1.0 --> 0.0
                    double start = MAX_PRESS_GHOSTING_ALPHA - 0.0015 * compRect.getWidth();
                    float coef = Math.max((float) start, MIN_PRESS_GHOSTING_ALPHA);
                    float opFactor = coef * (1.0f - DECAY_FACTOR * fade);
                    double iFactor = 1.0 + fade;

                    graphics.setComposite(
                            WidgetUtilities.getAlphaComposite(mainComponent, opFactor));

                    Rectangle bounds = comp.getBounds();

                    BufferedImage ghost = getComponentGhostImage(comp, timeline, iFactor);
                    dx -= ((ghost.getWidth() - bounds.width) / 2);
                    dy -= ((ghost.getHeight() - bounds.height) / 2);
                    graphics.drawImage(ghost, dx, dy, null);
                }
            }
        }

        if (AnimationConfigurationManager.getInstance()
                .isAnimationAllowed(AnimationFacet.GHOSTING_ICON_ROLLOVER, mainComponent)) {
            synchronized (GhostingListener.class) {
                Map<JComponent, Timeline> runningGhostRolloverTimelines = GhostingListener
                        .getRunningGhostRolloverTimelines();
                for (Map.Entry<JComponent, Timeline> entry : runningGhostRolloverTimelines.entrySet()) {
                    JComponent comp = entry.getKey();
                    Timeline timeline = entry.getValue();
                    if (comp == mainComponent) {
                        continue;
                    }

                    if (!comp.isShowing()) {
                        continue;
                    }
                    if (!comp.isVisible()) {
                        continue;
                    }

                    Rectangle compRect = comp.getBounds();
                    compRect.setLocation(comp.getLocationOnScreen());

                    int dx = compRect.x - mainRect.x;
                    int dy = compRect.y - mainRect.y;

                    compRect.x -= compRect.width / 2;
                    compRect.y -= compRect.height / 2;
                    compRect.width *= 2;
                    compRect.height *= 2;

                    if (mainRect.intersects(compRect)) {
                        float fade = timeline.getTimelinePosition();
                        Icon icon = null;
                        Rectangle iconRect = (Rectangle) comp.getClientProperty("icon.bounds");
                        if (iconRect != null) {
                            if (comp instanceof AbstractButton) {
                                icon = WidgetUtilities.getIcon((AbstractButton) comp);
                            } else {
                                icon = (Icon) comp.getClientProperty("icon");
                            }
                        }

                        if ((icon != null) && (iconRect != null)) {
                            double iFactor = 1.0 + fade;
                            BufferedImage iImage = getIconGhostImage(comp, timeline, icon, iFactor);

                            int iWidth = iImage.getWidth();
                            int iHeight = iImage.getHeight();
                            dx -= ((iWidth - icon.getIconWidth()) / 2);
                            dy -= ((iHeight - icon.getIconHeight()) / 2);

                            double start = MAX_ICON_GHOSTING_ALPHA
                                    - (MAX_ICON_GHOSTING_ALPHA - MIN_ICON_GHOSTING_ALPHA)
                                    * (iWidth - 16) / 48;
                            float coef = Math.max((float) start, MIN_ICON_GHOSTING_ALPHA);
                            float opFactor = coef * (1.0f - DECAY_FACTOR * fade);
                            graphics.setComposite(
                                    WidgetUtilities.getAlphaComposite(mainComponent, opFactor));

                            graphics.drawImage(iImage, dx + iconRect.x, dy + iconRect.y, null);
                        }
                    }
                }
            }
        }
        graphics.dispose();
    }

    /**
     * Paints the ghost icon inside the bounds of the specified button.
     * 
     * @param graphics
     *            Graphics context.
     * @param b
     *            Button.
     * @param iconRectangle
     *            Rectangle of the button icon.
     */
    public static void paintGhostIcon(Graphics2D graphics, AbstractButton b,
            Rectangle iconRectangle) {
        paintGhostIcon(graphics, b, WidgetUtilities.getIcon(b), iconRectangle);
    }

    /**
     * Paints the ghost icon inside the bounds of the specified button.
     * 
     * @param graphics
     *            Graphics context.
     * @param b
     *            Button.
     * @param icon
     *            Icon to paint.
     * @param iconRectangle
     *            Rectangle of the button icon.
     */
    public static void paintGhostIcon(Graphics2D graphics, Component b, Icon icon,
            Rectangle iconRectangle) {
        // System.out.println(b.getText() + ":" + icon + ":" + iconRectangle);
        if (!AnimationConfigurationManager.getInstance()
                .isAnimationAllowed(AnimationFacet.GHOSTING_ICON_ROLLOVER, b)) {
            return;
        }

        if (!(b instanceof JComponent)) {
            return;
        }

        GhostingListener gl = (GhostingListener) ((JComponent) b)
                .getClientProperty(GhostingListener.GHOST_LISTENER_KEY);
        if (gl == null) {
            return;
        }

        Timeline ghostRolloverTimeline = gl.getGhostIconRolloverTimeline();

        if (ghostRolloverTimeline.getState() != TimelineState.IDLE) {
            float fade = ghostRolloverTimeline.getTimelinePosition();
            if ((icon != null) && (iconRectangle != null)) {
                double iFactor = 1.0 + fade;
                BufferedImage iImage = getIconGhostImage((JComponent) b, ghostRolloverTimeline,
                        icon, iFactor);

                int iWidth = iImage.getWidth();
                int iHeight = iImage.getHeight();
                int dx = ((iWidth - icon.getIconWidth()) / 2);
                int dy = ((iHeight - icon.getIconHeight()) / 2);

                double start = MAX_ICON_GHOSTING_ALPHA
                        - (MAX_ICON_GHOSTING_ALPHA - MIN_ICON_GHOSTING_ALPHA) * (iWidth - 16) / 48;
                float coef = Math.max((float) start, MIN_ICON_GHOSTING_ALPHA);
                float opFactor = coef * (1.0f - DECAY_FACTOR * fade);
                graphics.setComposite(WidgetUtilities.getAlphaComposite(b, opFactor));

                graphics.drawImage(iImage, iconRectangle.x - dx, iconRectangle.y - dy, null);
            }
        }
    }
}
