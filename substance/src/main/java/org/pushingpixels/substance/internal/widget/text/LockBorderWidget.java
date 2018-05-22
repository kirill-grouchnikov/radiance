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
package org.pushingpixels.substance.internal.widget.text;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;

import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Adds visual indication on non-editable text components.
 * 
 * @author Kirill Grouchnikov
 */
public class LockBorderWidget extends SubstanceWidget<JTextComponent> {
    /**
     * Listens on all properties to decide whether a lock border should be shown / hidden.
     */
    protected PropertyChangeListener propertyChangeListener;

    /**
     * <code>true</code> if this widget is uninstalling. Fix for defect 7.
     */
    protected boolean isUninstalling = false;

    /**
     * Name for client property that stores the original border.
     */
    private static String ORIGINAL_BORDER = "lafwidget.internal.originalBorder";

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#installListeners()
     */
    @Override
    public void installListeners() {
        this.propertyChangeListener = (PropertyChangeEvent evt) -> {
            // fix for defect 5 - infinite event chain.
            if ("border".equals(evt.getPropertyName()))
                return;
            if (LockBorderWidget.ORIGINAL_BORDER.equals(evt.getPropertyName()))
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

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#uninstallListeners()
     */
    @Override
    public void uninstallListeners() {
        this.jcomp.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#uninstallUI()
     */
    @Override
    public void uninstallUI() {
        // fix for issue 7 - restoring original border on LAF switch.
        this.isUninstalling = true;
        Border original = (Border) this.jcomp.getClientProperty(LockBorderWidget.ORIGINAL_BORDER);
        if (original != null) {
            this.jcomp.setBorder(original);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#installDefaults()
     */
    @Override
    public void installDefaults() {
        super.installDefaults();
        if (LockBorderWidget.hasLockIcon(this.jcomp)) {
            Border currBorder = this.jcomp.getBorder();
            this.jcomp.putClientProperty(LockBorderWidget.ORIGINAL_BORDER, currBorder);
            this.jcomp.setBorder(new LockBorder(currBorder));
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#uninstallDefaults()
     */
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
}
