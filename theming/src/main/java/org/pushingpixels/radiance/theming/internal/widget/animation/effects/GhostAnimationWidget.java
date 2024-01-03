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

import org.pushingpixels.radiance.theming.api.RadianceThemingWidget;

import javax.swing.*;
import java.beans.PropertyChangeListener;

/**
 * Widget that tracks changes to the button for ghost effects.
 * 
 * @author Kirill Grouchnikov
 */
public class GhostAnimationWidget extends RadianceThemingWidget<AbstractButton> {
    /**
     * Model change listener for ghost image effects.
     */
    private GhostingListener ghostModelChangeListener;

    /**
     * Property change listener. Listens on changes to the
     * {@link AbstractButton#MODEL_CHANGED_PROPERTY} property.
     */
    private PropertyChangeListener ghostPropertyListener;

    @Override
    public void installDefaults() {
        this.jcomp.setRolloverEnabled(true);
    }

    @Override
    public void installListeners() {
        this.ghostPropertyListener = propertyChangeEvent -> {
            if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                if (ghostModelChangeListener != null) {
                    ghostModelChangeListener.unregisterListeners();
                }
                ghostModelChangeListener = new GhostingListener(jcomp, jcomp.getModel());
                ghostModelChangeListener.registerListeners();
            }
        };
        jcomp.addPropertyChangeListener(this.ghostPropertyListener);

        this.ghostModelChangeListener = new GhostingListener(jcomp, jcomp.getModel());
        this.ghostModelChangeListener.registerListeners();
    }

    @Override
    public void uninstallListeners() {
        jcomp.removePropertyChangeListener(this.ghostPropertyListener);
        this.ghostPropertyListener = null;

        this.ghostModelChangeListener.unregisterListeners();
        this.ghostModelChangeListener = null;
    }

}
