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
package org.pushingpixels.radiance.theming.internal.ui;

import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSplitPaneDivider;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.beans.PropertyChangeListener;

/**
 * UI for split panes in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceSplitPaneUI extends BasicSplitPaneUI {
    /**
     * Property change listener that listens on changes to {@link JSplitPane#ORIENTATION_PROPERTY}
     * property.
     */
    private PropertyChangeListener radiancePropertyListener;

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceSplitPaneUI();
    }

    protected RadianceSplitPaneUI() {
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.radiancePropertyListener = propertyChangeEvent -> {
            if (JSplitPane.ORIENTATION_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                RadianceSplitPaneDivider radianceDivider =
                        (RadianceSplitPaneDivider) getDivider();
                radianceDivider.updateOneTouchButtons((Integer) propertyChangeEvent.getNewValue());
            }
        };
        this.splitPane.addPropertyChangeListener(this.radiancePropertyListener);
    }

    @Override
    protected void uninstallListeners() {
        this.splitPane.removePropertyChangeListener(this.radiancePropertyListener);
        this.radiancePropertyListener = null;
        super.uninstallListeners();
    }

    @Override
    public BasicSplitPaneDivider createDefaultDivider() {
        return new RadianceSplitPaneDivider(this);
    }
}
