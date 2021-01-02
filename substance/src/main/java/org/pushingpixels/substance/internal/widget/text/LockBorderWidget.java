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
package org.pushingpixels.substance.internal.widget.text;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.border.BorderWrapper;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.UIResource;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.beans.PropertyChangeListener;

/**
 * Adds visual indication on non-editable text components.
 * 
 * @author Kirill Grouchnikov
 */
public class LockBorderWidget extends SubstanceWidget<JTextComponent> {
    /**
     * Listens on all properties to decide whether a lock border should be shown / hidden.
     */
    private PropertyChangeListener propertyChangeListener;

    /**
     * <code>true</code> if this widget is uninstalling. Fix for defect 7.
     */
    private boolean isUninstalling = false;

    /**
     * Name for client property that stores the original border.
     */
    private static final String ORIGINAL_BORDER = "substancelaf.internal.lockBorder.original";

    @Override
    public void installListeners() {
        this.propertyChangeListener = propertyChangeEvent -> {
            // fix for defect 5 - infinite event chain.
            if ("border".equals(propertyChangeEvent.getPropertyName()))
                return;
            if (LockBorderWidget.ORIGINAL_BORDER.equals(propertyChangeEvent.getPropertyName()))
                return;
            SwingUtilities.invokeLater(() -> {
                // fix for defect 7 - not removing lock border
                // on LAF switch
                if (isUninstalling)
                    return;
                boolean hasLockIcon = hasLockIcon(jcomp);
                if (hasLockIcon) {
                    installLockBorder();
                } else {
                    restoreOriginalBorder();
                }
            });
        };
        this.jcomp.addPropertyChangeListener(this.propertyChangeListener);
    }

    @Override
    public void uninstallListeners() {
        this.jcomp.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;
    }

    @Override
    public void uninstallUI() {
        // fix for issue 7 - restoring original border on LAF switch.
        this.isUninstalling = true;
        Border original = (Border) this.jcomp.getClientProperty(LockBorderWidget.ORIGINAL_BORDER);
        if (original != null) {
            this.jcomp.setBorder(original);
        }
    }

    @Override
    public void installDefaults() {
        super.installDefaults();
        if (LockBorderWidget.hasLockIcon(this.jcomp)) {
            Border currBorder = this.jcomp.getBorder();
            this.jcomp.putClientProperty(LockBorderWidget.ORIGINAL_BORDER, currBorder);
            this.jcomp.setBorder(new LockBorder(currBorder));
        }
    }

    @Override
    public void uninstallDefaults() {
        // fix for issue 7 - restoring original border on LAF switch.
        this.isUninstalling = true;
        this.jcomp.putClientProperty(LockBorderWidget.ORIGINAL_BORDER, null);
    }

    /**
     * Installs the lock border on the associated component.
     */
    private void installLockBorder() {
        if (jcomp.getClientProperty(LockBorderWidget.ORIGINAL_BORDER) instanceof Border) {
            // already installed
            return;
        }
        // need to install
        Border currBorder = jcomp.getBorder();
        if (currBorder != null) {
            jcomp.putClientProperty(LockBorderWidget.ORIGINAL_BORDER, currBorder);
            jcomp.setBorder(new LockBorder(currBorder));
        }
    }

    /**
     * Restores the original border on the associated component.
     */
    private void restoreOriginalBorder() {
        if (jcomp.getClientProperty(LockBorderWidget.ORIGINAL_BORDER) instanceof Border) {
            // revert to original
            Border originalBorder = (Border) jcomp
                    .getClientProperty(LockBorderWidget.ORIGINAL_BORDER);
            jcomp.setBorder(originalBorder);
            jcomp.putClientProperty(LockBorderWidget.ORIGINAL_BORDER, null);
        } else {
            // already uninstalled
        }
    }

    /**
     * Checks whether the specified component should show a lock icon. Is used in the
     * {@link LockBorderWidget} widget.
     * 
     * @param comp
     *            Component.
     * @return <code>true</code> if the specified component should show a lock icon,
     *         <code>false</code> otherwise.
     */
    private static boolean hasLockIcon(Component comp) {
        if (!SubstanceCoreUtilities.toShowExtraWidgets(comp))
            return false;
        // Skip password fields
        if (comp instanceof JPasswordField) {
            return false;
        }
        // check the HAS_LOCK_ICON property
        boolean isEditableTextComponent = (comp instanceof JTextComponent)
                ? ((JTextComponent) comp).isEditable()
                : false;
        if (comp instanceof JComponent) {
            if (!isEditableTextComponent && Boolean.TRUE
                    .equals(((JComponent) comp).getClientProperty(SubstanceSynapse.HAS_LOCK_ICON)))
                return true;
            if (Boolean.FALSE
                    .equals(((JComponent) comp).getClientProperty(SubstanceSynapse.HAS_LOCK_ICON)))
                return false;
        }
        if (!isEditableTextComponent
                && Boolean.TRUE.equals(UIManager.get(SubstanceSynapse.HAS_LOCK_ICON)))
            return true;

        return false;
    }

    /**
     * Border with "lock" indication.
     *
     * @author Kirill Grouchnikov
     */
    private static class LockBorder implements Border, UIResource, BorderWrapper {
        /**
         * The original (decorated) border.
         */
        private Border originalBorder;

        /**
         * Constructs a new lock border.
         *
         * @param originalBorder The original border.
         */
        public LockBorder(Border originalBorder) {
            if (originalBorder != null) {
                this.originalBorder = originalBorder;
            } else {
                this.originalBorder = new EmptyBorder(0, 0, 0, 0);
            }
        }

        @Override
        public Insets getBorderInsets(Component c) {
            Icon lockIcon = SubstanceImageCreator.getSmallLockIcon(
                    SubstanceColorSchemeUtilities.getColorScheme(c, ComponentState.ENABLED), c);

            Insets origInsets = this.originalBorder.getBorderInsets(c);

            if (c.getComponentOrientation().isLeftToRight()) {
                return new Insets(origInsets.top, origInsets.left, origInsets.bottom,
                        Math.max(origInsets.right, lockIcon.getIconWidth() + 2));
            } else {
                // support for RTL
                return new Insets(origInsets.top,
                        Math.max(origInsets.left, lockIcon.getIconWidth() + 2), origInsets.bottom,
                        origInsets.right);
            }
        }

        @Override
        public boolean isBorderOpaque() {
            return this.originalBorder.isBorderOpaque();
        }

        @Override
        public Border getOriginalBorder() {
            return originalBorder;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            this.originalBorder.paintBorder(c, g, x, y, width, height);
            Icon lockIcon = SubstanceImageCreator.getSmallLockIcon(
                    SubstanceColorSchemeUtilities.getColorScheme(c, ComponentState.ENABLED), c);

            int offsetY = 1;
            if (c.getParent() instanceof JViewport) {
                // enhancement 9 - show the lock icon of components
                // in JScrollPane so that it is visible in the bottom
                // corner of the scroll pane
                JViewport viewport = (JViewport) c.getParent();
                // have to set to simple scroll mode since the default (blit)
                // results in visual artifacts due to optimized buffer-copy
                // painting.
                if (viewport.getScrollMode() != JViewport.SIMPLE_SCROLL_MODE) {
                    viewport.setScrollMode(JViewport.SIMPLE_SCROLL_MODE);
                }
                Rectangle viewRect = viewport.getViewRect();
                offsetY = c.getHeight() - viewRect.y - viewRect.height;
            }

            int iconY = y + height - lockIcon.getIconHeight() - offsetY;
            if (c.getComponentOrientation().isLeftToRight()) {
                lockIcon.paintIcon(c, g, x + width - lockIcon.getIconWidth(), iconY);
            } else {
                // support for RTL
                lockIcon.paintIcon(c, g, x, iconY);
            }
        }
    }
}
