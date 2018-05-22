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
package org.pushingpixels.substance.internal.widget.scroll;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JScrollPane;

import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;

/**
 * Widget that decorates scroll panes with auto scroll.
 * 
 * @author Kirill Grouchnikov
 */
public class AutoScrollWidget extends SubstanceWidget<JScrollPane> {
    /**
     * Property change listener - listens on the changes to {@link SubstanceWidget#AUTO_SCROLL}
     * property.
     */
    private PropertyChangeListener propertyChangeListener;

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#installUI()
     */
    @Override
    public void installUI() {
        if (WidgetUtilities.hasAutoScroll(this.jcomp)) {
            AutoScrollActivator.setAutoScrollEnabled(this.jcomp, true);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#uninstallUI()
     */
    @Override
    public void uninstallUI() {
        AutoScrollActivator.setAutoScrollEnabled(this.jcomp, false);
    }

    @Override
    public void installListeners() {
        this.propertyChangeListener = (PropertyChangeEvent evt) -> {
            if (SubstanceSynapse.AUTO_SCROLL.equals(evt.getPropertyName())) {
                AutoScrollActivator.setAutoScrollEnabled(jcomp,
                        WidgetUtilities.hasAutoScroll(jcomp));
            }
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
}
