/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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

import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.CellRendererPane;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;

import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.painter.preview.PreviewPainter;
import org.pushingpixels.substance.api.password.PasswordStrengthChecker;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;

/**
 * Various utility functions.
 * 
 * @author Kirill Grouchnikov
 * @author Romain Guy
 */
public class WidgetUtilities {
    /**
     * Name for the internal client property that marks a component as previewable.
     */
    public static final String PREVIEW_MODE = "substance.widget.internal.previewMode";

    /**
     * Private constructor. Is here to enforce using static methods only.
     */
    private WidgetUtilities() {
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

        double scaleFactor = UIUtil.getScaleFactor();
        do {
            width /= 2;
            if (width < requestedThumbWidth) {
                width = requestedThumbWidth;
            }

            BufferedImage temp = SubstanceCoreUtilities.getBlankImage(width, (int) (width / ratio));
            Graphics2D g2 = temp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(thumb, 0, 0, (int) (temp.getWidth() / scaleFactor),
                    (int) (temp.getHeight() / scaleFactor), null);
            g2.dispose();

            thumb = temp;
        } while (width != requestedThumbWidth);

        return thumb;
    }

    /**
     * Makes the specified component and all its descendants previewable.
     * 
     * @param comp
     *            Component.
     * @param dbSnapshot
     *            The "snapshot" map that will contain the original double-buffer status of the
     *            specified component and all its descendants. Key is {@link JComponent}, value is
     *            {@link Boolean}.
     */
    public static void makePreviewable(Component comp, Map<Component, Boolean> dbSnapshot) {
        if (comp instanceof JComponent) {
            JComponent jcomp = (JComponent) comp;
            // if (jcomp.getParent() instanceof CellRendererPane) {
            // System.out.println(jcomp.getClass().getSimpleName() + ":"
            // + jcomp.hashCode());
            // }
            dbSnapshot.put(jcomp, Boolean.valueOf(jcomp.isDoubleBuffered()));
            jcomp.setDoubleBuffered(false);
            jcomp.putClientProperty(WidgetUtilities.PREVIEW_MODE, Boolean.TRUE);
        }
        if (comp instanceof Container) {
            Container cont = (Container) comp;
            for (int i = 0; i < cont.getComponentCount(); i++)
                WidgetUtilities.makePreviewable(cont.getComponent(i), dbSnapshot);
        }
    }

    /**
     * Restores the regular (non-previewable) status of the specified component and all its
     * descendants.
     * 
     * @param comp
     *            Component.
     * @param dbSnapshot
     *            The "snapshot" map that contains the original double-buffer status of the
     *            specified component and all its descendants. Key is {@link JComponent}, value is
     *            {@link Boolean}.
     */
    public static void restorePreviewable(Component comp, Map<Component, Boolean> dbSnapshot) {
        if (comp instanceof JComponent) {
            JComponent jcomp = (JComponent) comp;
            if (dbSnapshot.containsKey(comp)) {
                jcomp.setDoubleBuffered(dbSnapshot.get(comp));
                jcomp.putClientProperty(WidgetUtilities.PREVIEW_MODE, null);
            } else {
                // this can happen in case the application has
                // renderers (combos, ...). Take the property from the parent
                Component parent = comp.getParent();
                if (parent instanceof JComponent) {
                    jcomp.setDoubleBuffered(dbSnapshot.get(parent));
                    jcomp.putClientProperty(WidgetUtilities.PREVIEW_MODE, null);
                }
                // System.out.println("Not found");
                // Component c = jcomp;
                // while (c != null) {
                // System.out.println("\t" + c.getClass().getSimpleName()
                // + ":" + c.hashCode());
                // c = c.getParent();
                // }
            }
        }
        if (comp instanceof Container) {
            Container cont = (Container) comp;
            for (int i = 0; i < cont.getComponentCount(); i++)
                WidgetUtilities.restorePreviewable(cont.getComponent(i), dbSnapshot);
        }
    }

    /**
     * Checks whether the specified text component has "select all on focus gain" property.
     * 
     * @param textComp
     *            Text component.
     * @return <code>true</code> if the specified text component has "select all on focus gain"
     *         property, <code>false</code> otherwise.
     */
    public static boolean hasTextFocusSelectAllProperty(JTextComponent textComp) {
        Component comp = textComp;
        while (comp != null) {
            if (comp instanceof JComponent) {
                Object textFocusSelectAllProperty = ((JComponent) comp)
                        .getClientProperty(SubstanceSynapse.TEXT_SELECT_ON_FOCUS);
                if (Boolean.TRUE.equals(textFocusSelectAllProperty))
                    return true;
                if (Boolean.FALSE.equals(textFocusSelectAllProperty))
                    return false;
            }
            comp = comp.getParent();
        }
        return (Boolean.TRUE.equals(UIManager.get(SubstanceSynapse.TEXT_SELECT_ON_FOCUS)));
    }

    /**
     * Checks whether the specified text component has "flip select on escape" property.
     * 
     * @param textComp
     *            Text component.
     * @return <code>true</code> if the specified text component has "flip select on escape"
     *         property, <code>false</code> otherwise.
     */
    public static boolean hasTextFlipSelectOnEscapeProperty(JTextComponent textComp) {
        Object textFocusSelectAllProperty = textComp
                .getClientProperty(SubstanceSynapse.TEXT_FLIP_SELECT_ON_ESCAPE);
        return (Boolean.TRUE.equals(textFocusSelectAllProperty));
    }

    /**
     * Checks whether the specified text component has edit context menu property.
     * 
     * @param textComp
     *            Text component.
     * @return <code>true</code> if the specified text component has edit context menu property,
     *         <code>false</code> otherwise.
     */
    public static boolean hasTextEditContextMenu(JTextComponent textComp) {
        Object textEditContextMenuProperty = textComp
                .getClientProperty(SubstanceSynapse.TEXT_EDIT_CONTEXT_MENU);
        if (Boolean.TRUE.equals(textEditContextMenuProperty))
            return true;
        if (Boolean.FALSE.equals(textEditContextMenuProperty))
            return false;
        return (Boolean.TRUE.equals(UIManager.get(SubstanceSynapse.TEXT_EDIT_CONTEXT_MENU)));
    }

    /**
     * Checks whether the specified scroll pane supports auto scroll.
     * 
     * @param scrollPane
     *            Scroll pane component.
     * @return <code>true</code> if the specified scroll pane supports auto scroll,
     *         <code>false</code> otherwise.
     */
    public static boolean hasAutoScroll(JScrollPane scrollPane) {
        Object compProperty = scrollPane.getClientProperty(SubstanceSynapse.AUTO_SCROLL);
        if (Boolean.TRUE.equals(compProperty))
            return true;
        if (Boolean.FALSE.equals(compProperty))
            return false;
        return (Boolean.TRUE.equals(UIManager.get(SubstanceSynapse.AUTO_SCROLL)));
    }

    /**
     * Checks whether the specified tree component has automatic drag and drop support.
     * 
     * @param tree
     *            Tree component.
     * @return <code>true</code> if the specified text component has automatic drag and drop
     *         support, <code>false</code> otherwise.
     */
    public static boolean hasAutomaticDnDSupport(JTree tree) {
        Object dndProperty = tree.getClientProperty(SubstanceSynapse.TREE_AUTO_DND_SUPPORT);
        if (Boolean.TRUE.equals(dndProperty))
            return true;
        if (Boolean.FALSE.equals(dndProperty))
            return false;
        return (Boolean.TRUE.equals(UIManager.get(SubstanceSynapse.TREE_AUTO_DND_SUPPORT)));
    }

    /**
     * Checks whether the specified component has been configured (specifically or globally) to have
     * no animations of the specific facet. Can be used to cull unnecessary code in animation
     * listeners on large tables and lists.
     * 
     * @param comp
     *            Component.
     * @param animationFacet
     *            Animation facet.
     * @return <code>true</code> if the specified component has been configured (specifically or
     *         globally) to have no animations of the specific facet, <code>false</code> otherwise.
     */
    public static boolean hasNoAnimations(Component comp, AnimationFacet animationFacet) {
        return !AnimationConfigurationManager.getInstance().isAnimationAllowed(animationFacet,
                comp);
    }

    /**
     * Returns the current icon for the specified button. This method is <b>for internal use
     * only</b>.
     * 
     * @param b
     *            Button.
     * @return Icon for the specified button.
     */
    public static Icon getIcon(AbstractButton b) {
        Icon icon = b.getIcon();
        if (icon == null)
            return null;
        ButtonModel model = b.getModel();
        Icon tmpIcon = null;

        if (icon != null) {
            if (!model.isEnabled()) {
                if (model.isSelected()) {
                    tmpIcon = b.getDisabledSelectedIcon();
                } else {
                    tmpIcon = b.getDisabledIcon();
                }
            } else if (model.isPressed() && model.isArmed()) {
                tmpIcon = b.getPressedIcon();
            } else if (b.isRolloverEnabled() && model.isRollover()) {
                if (model.isSelected()) {
                    tmpIcon = b.getRolloverSelectedIcon();
                } else {
                    tmpIcon = b.getRolloverIcon();
                }
            } else if (model.isSelected()) {
                tmpIcon = b.getSelectedIcon();
            }

            if (tmpIcon != null) {
                icon = tmpIcon;
            }
        }
        return icon;
    }

    public static boolean toIgnoreAnimations(Component comp) {
        if (comp instanceof JMenuItem)
            return false;
        return (SwingUtilities.getAncestorOfClass(CellRendererPane.class, comp) != null);
    }

    /**
     * Fires the matching property change event on the specific component.
     * 
     * @param component
     *            Component.
     * @param propertyName
     *            Property name.
     * @param oldValue
     *            Old property value.
     * @param newValue
     *            New property value.
     */
    public static void firePropertyChangeEvent(JComponent component, String propertyName,
            Object oldValue, Object newValue) {
        PropertyChangeEvent pce = new PropertyChangeEvent(component, propertyName, oldValue,
                newValue);
        for (PropertyChangeListener general : component.getPropertyChangeListeners()) {
            general.propertyChange(pce);
        }
        for (PropertyChangeListener specific : component.getPropertyChangeListeners(propertyName)) {
            specific.propertyChange(pce);
        }
    }

    /**
     * Returns the composite to use for painting the specified component. The result should be set
     * on the {@link Graphics2D} before any custom rendering is done. This method can be used by
     * application painting code and by look-and-feel delegates.
     * 
     * @param c
     *            Component.
     * @param translucency
     *            The translucency of the original painting.
     * @param g
     *            The original graphics context.
     * @return The composite to use for painting the specified component.
     */
    public static Composite getAlphaComposite(Component c, float translucency, Graphics g) {
        float xFactor = 1.0f;
        if (g instanceof Graphics2D) {
            Graphics2D g2d = (Graphics2D) g;
            Composite existingComposite = g2d.getComposite();
            if (existingComposite instanceof AlphaComposite) {
                AlphaComposite ac = (AlphaComposite) existingComposite;
                if (ac.getRule() == AlphaComposite.SRC_OVER)
                    xFactor = ac.getAlpha();
            }
        }
        float finalAlpha = translucency * xFactor;
        if (finalAlpha < 0.0f) {
            finalAlpha = 0.0f;
        }
        if (finalAlpha > 1.0f) {
            finalAlpha = 1.0f;
        }
        if (finalAlpha == 1.0f) {
            return AlphaComposite.SrcOver;
        }
        return AlphaComposite.SrcOver.derive(finalAlpha);
    }

    public static Composite getAlphaComposite(Component c, float translucency) {
        return getAlphaComposite(c, translucency, null);
    }

    /**
     * Returns the composite to use for painting the specified component. The result should be set
     * on the {@link Graphics2D} before any custom rendering is done. This method can be used by
     * application painting code and by look-and-feel delegates.
     * 
     * @param c
     *            Component.
     * @return The composite to use for painting the specified component.
     */
    public static Composite getAlphaComposite(Component c, Graphics g) {
        return getAlphaComposite(c, 1.0f, g);
    }

    /**
     * Returns the composite to use for painting the specified component. The result should be set
     * on the {@link Graphics2D} before any custom rendering is done. This method can be used by
     * application painting code and by look-and-feel delegates.
     * 
     * @param c
     *            Component.
     * @return The composite to use for painting the specified component.
     */
    public static Composite getAlphaComposite(Component c) {
        return getAlphaComposite(c, 1.0f, null);
    }

    /**
     * Returns the preview painter for the specified component.
     * 
     * @param comp
     *            Component.
     * @return Preview painter for the specified component.
     * @since 2.1
     */
    public static PreviewPainter getComponentPreviewPainter(Component comp) {
        if (comp == null)
            return null;

        // check property on component
        if (comp instanceof JComponent) {
            Object compProp = ((JComponent) comp)
                    .getClientProperty(SubstanceSynapse.COMPONENT_PREVIEW_PAINTER);
            if (compProp instanceof PreviewPainter)
                return (PreviewPainter) compProp;
        }

        // check property on parent
        Container parent = comp.getParent();
        if (parent instanceof JComponent) {
            Object parentProp = ((JComponent) parent)
                    .getClientProperty(SubstanceSynapse.COMPONENT_PREVIEW_PAINTER);
            if (parentProp instanceof PreviewPainter)
                return (PreviewPainter) parentProp;
        }

        Object globProp = UIManager.get(SubstanceSynapse.COMPONENT_PREVIEW_PAINTER);
        if (globProp instanceof PreviewPainter)
            return (PreviewPainter) globProp;

        return null;
    }

    /**
     * Returns the password strength checker for the specified password field.
     * 
     * @param jpf
     *            Password field.
     * @return Password strength checker for the specified password field. The result can be
     *         <code>null</code>.
     */
    public static PasswordStrengthChecker getPasswordStrengthChecker(JPasswordField jpf) {
        Object obj = jpf.getClientProperty(SubstanceSynapse.PASSWORD_STRENGTH_CHECKER);
        if ((obj != null) && (obj instanceof PasswordStrengthChecker))
            return (PasswordStrengthChecker) obj;
        return null;
    }
}
