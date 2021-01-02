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
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;

/**
 * Adds visual indication when caps-lock key is on in focused password fields.
 *
 * @author Kirill Grouchnikov
 */
public class CapsLockPasswordBorderWidget extends SubstanceWidget<JPasswordField> {
    /**
     * Listens on all properties to decide whether a caps lock border should be shown / hidden.
     */
    private PropertyChangeListener propertyChangeListener;

    // Listens on key events to repaint the component when caps lock key is activated
    private KeyAdapter keyAdapter;

    /**
     * <code>true</code> if this widget is uninstalling.
     */
    private boolean isUninstalling = false;

    /**
     * Name for client property that stores the original border.
     */
    private static final String ORIGINAL_BORDER = "substancelaf.internal.capsLockBorder.original";

    @Override
    public void installListeners() {
        this.propertyChangeListener = propertyChangeEvent -> {
            // fix for defect 5 - infinite event chain.
            if ("border".equals(propertyChangeEvent.getPropertyName())) {
                return;
            }
            if (CapsLockPasswordBorderWidget.ORIGINAL_BORDER.equals(propertyChangeEvent.getPropertyName())) {
                return;
            }
            SwingUtilities.invokeLater(() -> {
                // fix for defect 7 - not removing lock border
                // on LAF switch
                if (isUninstalling) {
                    return;
                }
                boolean hasCapsLockIcon = hasCapsLockIcon(jcomp);
                if (hasCapsLockIcon) {
                    installCapsLockBorder();
                } else {
                    restoreOriginalBorder();
                }
            });
        };
        this.jcomp.addPropertyChangeListener(this.propertyChangeListener);

        this.keyAdapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                jcomp.repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                jcomp.repaint();
            }
        };
        this.jcomp.addKeyListener(this.keyAdapter);
    }

    @Override
    public void uninstallListeners() {
        this.jcomp.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;

        this.jcomp.removeKeyListener(this.keyAdapter);
        this.keyAdapter = null;
    }

    @Override
    public void uninstallUI() {
        // fix for issue 7 - restoring original border on LAF switch.
        this.isUninstalling = true;
        Border original = (Border) this.jcomp.getClientProperty(CapsLockPasswordBorderWidget.ORIGINAL_BORDER);
        if (original != null) {
            this.jcomp.setBorder(original);
        }
    }

    @Override
    public void installDefaults() {
        super.installDefaults();
        if (CapsLockPasswordBorderWidget.hasCapsLockIcon(this.jcomp)) {
            Border currBorder = this.jcomp.getBorder();
            this.jcomp.putClientProperty(CapsLockPasswordBorderWidget.ORIGINAL_BORDER, currBorder);
            this.jcomp.setBorder(new CapsLockBorder(currBorder));
        }
    }

    @Override
    public void uninstallDefaults() {
        // fix for issue 7 - restoring original border on LAF switch.
        this.isUninstalling = true;
        this.jcomp.putClientProperty(CapsLockPasswordBorderWidget.ORIGINAL_BORDER, null);
    }

    /**
     * Installs the lock border on the associated component.
     */
    private void installCapsLockBorder() {
        if (jcomp.getClientProperty(CapsLockPasswordBorderWidget.ORIGINAL_BORDER) instanceof Border) {
            // already installed
            return;
        }
        // need to install
        Border currBorder = jcomp.getBorder();
        if (currBorder != null) {
            jcomp.putClientProperty(CapsLockPasswordBorderWidget.ORIGINAL_BORDER, currBorder);
            jcomp.setBorder(new CapsLockBorder(currBorder));
        }
    }

    /**
     * Restores the original border on the associated component.
     */
    private void restoreOriginalBorder() {
        if (jcomp.getClientProperty(CapsLockPasswordBorderWidget.ORIGINAL_BORDER) instanceof Border) {
            // revert to original
            Border originalBorder = (Border) jcomp
                    .getClientProperty(CapsLockPasswordBorderWidget.ORIGINAL_BORDER);
            jcomp.setBorder(originalBorder);
            jcomp.putClientProperty(CapsLockPasswordBorderWidget.ORIGINAL_BORDER, null);
        } else {
            // already uninstalled
        }
    }

    /**
     * Checks whether the specified component should show a lock icon. Is used in the
     * {@link CapsLockPasswordBorderWidget} widget.
     *
     * @param comp Component.
     * @return <code>true</code> if the specified component should show a lock icon,
     * <code>false</code> otherwise.
     */
    private static boolean hasCapsLockIcon(Component comp) {
        if (!SubstanceCoreUtilities.toShowExtraWidgets(comp))
            return false;
        // check the HAS_LOCK_ICON property
        if (comp instanceof JComponent) {
            if (Boolean.TRUE.equals(((JComponent) comp).getClientProperty(SubstanceSynapse.HAS_CAPS_LOCK_ICON)))
                return true;
            if (Boolean.FALSE.equals(((JComponent) comp).getClientProperty(SubstanceSynapse.HAS_CAPS_LOCK_ICON)))
                return false;
        }
        if (Boolean.TRUE.equals(UIManager.get(SubstanceSynapse.HAS_CAPS_LOCK_ICON))) {
            return true;
        }

        return false;
    }

    /**
     * Border with "caps lock" indication.
     *
     * @author Kirill Grouchnikov
     */
    private static class CapsLockBorder implements Border, UIResource, BorderWrapper {
        /**
         * The original (decorated) border.
         */
        private Border originalBorder;

        /**
         * Constructs a new lock border.
         *
         * @param originalBorder The original border.
         */
        public CapsLockBorder(Border originalBorder) {
            if (originalBorder != null) {
                this.originalBorder = originalBorder;
            } else {
                this.originalBorder = new EmptyBorder(0, 0, 0, 0);
            }
        }

        @Override
        public Insets getBorderInsets(Component c) {
            Icon capsLockIcon = SubstanceImageCreator.getCapsLockIcon(
                    SubstanceColorSchemeUtilities.getColorScheme(c, ComponentState.ENABLED), c);

            Insets origInsets = this.originalBorder.getBorderInsets(c);

            if (c.getComponentOrientation().isLeftToRight()) {
                return new Insets(origInsets.top, origInsets.left, origInsets.bottom,
                        Math.max(origInsets.right, capsLockIcon.getIconWidth() + 6));
            } else {
                // support for RTL
                return new Insets(origInsets.top,
                        Math.max(origInsets.left, capsLockIcon.getIconWidth() + 6), origInsets.bottom,
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
            // Paint the original border
            this.originalBorder.paintBorder(c, g, x, y, width, height);

            // Only paint the icon when the component is focused and the caps-lock is on
            if (!c.isFocusOwner()) {
                return;
            }

            try {
                if (!Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
                    return;
                }
            } catch (UnsupportedOperationException e) {
                return;
            }

            Icon capsLockIcon = SubstanceImageCreator.getCapsLockIcon(
                    SubstanceColorSchemeUtilities.getColorScheme(c, ComponentState.ENABLED), c);

            int iconY = y + (height - capsLockIcon.getIconHeight()) / 2;
            if (c.getComponentOrientation().isLeftToRight()) {
                capsLockIcon.paintIcon(c, g, x + width - capsLockIcon.getIconWidth() - 4, iconY);
            } else {
                // support for RTL
                capsLockIcon.paintIcon(c, g, x + 4, iconY);
            }
        }
    }
}
