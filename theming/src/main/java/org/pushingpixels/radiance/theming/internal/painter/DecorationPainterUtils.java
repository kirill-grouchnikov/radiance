/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.painter;

import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.decoration.RadianceDecorationPainter;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import javax.swing.*;
import java.awt.*;

/**
 * Contains utility methods related to decoration painters. This class is for internal use only.
 * 
 * @author Kirill Grouchnikov
 */
public class DecorationPainterUtils {
    /**
     * Client property for marking a component with an instance of {@link RadianceThemingSlices.DecorationAreaType} enum.
     */
    private static final String DECORATION_AREA_TYPE = "radiance.theming.internal.painter.decorationAreaType";

    public static final String POPUP_ORIGINATOR_LINK = "radiance.theming.internal.popupOriginatorLink";

    public interface PopupOriginatorLink {
        JComponent getPopupOriginator();
    }

    /**
     * Sets the decoration type of the specified component.
     * 
     * @param comp
     *            Component.
     * @param type
     *            Decoration type of the component and its children.
     */
    public static void setDecorationType(JComponent comp, RadianceThemingSlices.DecorationAreaType type) {
        comp.putClientProperty(DECORATION_AREA_TYPE, type);
    }

    /**
     * Clears the client properties related to the decoration area type.
     * 
     * @param comp
     *            Component.
     */
    public static void clearDecorationType(JComponent comp) {
        if (comp != null) {
            comp.putClientProperty(DECORATION_AREA_TYPE, null);
        }
    }

    /**
     * Returns the decoration area type of the specified component. The component and its ancestor
     * hierarchy are scanned for the registered decoration area type. If
     * {@link #setDecorationType(JComponent, RadianceThemingSlices.DecorationAreaType)} has been called on the specified
     * component, the matching decoration type is returned. Otherwise, the component hierarchy is
     * scanned to find the closest ancestor that was passed to
     * {@link #setDecorationType(JComponent, RadianceThemingSlices.DecorationAreaType)} - and its decoration type is
     * returned. If neither the component, nor any one of its parent components has been passed to
     * the setter method, {@link RadianceThemingSlices.DecorationAreaType#NONE} is returned.
     * 
     * @param comp
     *            Component.
     * @return Decoration area type of the component.
     */
    public static RadianceThemingSlices.DecorationAreaType getDecorationType(Component comp) {
        JPopupMenu popupMenu = null;
        JComponent popupOriginator = null;
        Component c = comp;
        while (c != null) {
            if (c instanceof JComponent) {
                JComponent jc = (JComponent) c;
                Object prop = jc.getClientProperty(DECORATION_AREA_TYPE);
                if (prop instanceof RadianceThemingSlices.DecorationAreaType) {
                    return (RadianceThemingSlices.DecorationAreaType) prop;
                }
                Object invokerProp = jc.getClientProperty(POPUP_ORIGINATOR_LINK);
                if (invokerProp instanceof PopupOriginatorLink) {
                    popupOriginator = ((PopupOriginatorLink) invokerProp).getPopupOriginator();
                }
            }
            if (c instanceof JPopupMenu) {
                popupMenu = (JPopupMenu) c;
            }
            c = c.getParent();
        }
        if (popupMenu != null) {
            Component invoker = popupMenu.getInvoker();
            if (popupMenu != invoker) {
                return getDecorationType(popupMenu.getInvoker());
            }
        }
        if (popupOriginator != null) {
            return getDecorationType(popupOriginator);
        }
        return RadianceThemingSlices.DecorationAreaType.NONE;
    }

    /**
     * Returns the immediate decoration area type of the specified component. The component is
     * checked for the registered decoration area type. If
     * {@link #setDecorationType(JComponent, RadianceThemingSlices.DecorationAreaType)} was not called on this
     * component, this method returns <code>null</code>.
     * 
     * @param comp
     *            Component.
     * @return Immediate decoration area type of the component.
     */
    public static RadianceThemingSlices.DecorationAreaType getImmediateDecorationType(Component comp) {
        Component c = comp;
        if (c instanceof JComponent) {
            JComponent jc = (JComponent) c;
            Object prop = jc.getClientProperty(DECORATION_AREA_TYPE);
            if (prop instanceof RadianceThemingSlices.DecorationAreaType) {
                return (RadianceThemingSlices.DecorationAreaType) prop;
            }
        }
        return null;
    }

    /**
     * Paints the decoration background on the specified component. The decoration background is not
     * painted when the <code>force</code> parameter is <code>false</code> and at least one of the
     * following conditions holds:
     * <ul>
     * <li>The component is in a cell renderer.</li>
     * <li>The component is not showing on the screen.</li>
     * <li>The component is in the preview mode.</li>
     * </ul>
     * 
     * @param g
     *            Graphics context.
     * @param c
     *            Component.
     * @param force
     *            If <code>true</code>, the painting of decoration background is enforced.
     */
    public static void paintDecorationBackground(Graphics g, Component c, boolean force) {
        RadianceThemingSlices.DecorationAreaType decorationType = RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(c);
        paintDecorationBackground(g, c, decorationType, force);
    }

    /**
     * Paints the decoration background on the specified component. See comments on
     * {@link #paintDecorationBackground(Graphics, Component, boolean)} for the cases when the
     * decoration background painting is skipped.
     * 
     * @param g
     *            Graphics context.
     * @param c
     *            Component.
     * @param decorationType
     *            Decoration area type of the component.
     * @param force
     *            If <code>true</code>, the painting of decoration background is enforced. #see
     *            {@link #paintDecorationBackground(Graphics, Component, boolean)}
     */
    private static void paintDecorationBackground(Graphics g, Component c,
                                                  RadianceThemingSlices.DecorationAreaType decorationType, boolean force) {
        // System.out.println("Painting " + c.getClass().getSimpleName());
        boolean isInCellRenderer = (SwingUtilities.getAncestorOfClass(CellRendererPane.class,
                c) != null);
        boolean isPreviewMode = false;
        if (c instanceof JComponent) {
            isPreviewMode = (Boolean.TRUE
                    .equals(((JComponent) c).getClientProperty(WidgetUtilities.PREVIEW_MODE)));
        }

        if (!force && !isPreviewMode && !c.isShowing() && !isInCellRenderer) {
            return;
        }

        if ((c.getHeight() == 0) || (c.getWidth() == 0)) {
            return;
        }

        RadianceSkin skin = RadianceCoreUtilities.getSkin(c);
        RadianceDecorationPainter painter = skin.getDecorationPainter();

        Graphics2D g2d = (Graphics2D) g.create();
        painter.paintDecorationArea(g2d, c, decorationType, c.getWidth(), c.getHeight(), skin);

        g2d.dispose();
    }

    public static void paintDecorationArea(Graphics g, Component c,
            Shape contour, RadianceThemingSlices.DecorationAreaType decorationType,
            RadianceColorScheme colorScheme, boolean force) {
        // System.out.println("Painting " + c.getClass().getSimpleName());
        boolean isInCellRenderer = (SwingUtilities.getAncestorOfClass(CellRendererPane.class,
                c) != null);
        boolean isPreviewMode = false;
        if (c instanceof JComponent) {
            isPreviewMode = (Boolean.TRUE
                    .equals(((JComponent) c).getClientProperty(WidgetUtilities.PREVIEW_MODE)));
        }

        if (!force && !isPreviewMode && !c.isShowing() && !isInCellRenderer) {
            return;
        }

        if ((c.getHeight() == 0) || (c.getWidth() == 0)) {
            return;
        }

        RadianceSkin skin = RadianceCoreUtilities.getSkin(c);
        RadianceDecorationPainter painter = skin.getDecorationPainter();

        Graphics2D g2d = (Graphics2D) g.create();
        painter.paintDecorationArea(g2d, c, decorationType, contour, colorScheme);

        g2d.dispose();
    }

}
