/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.theming.ribbon.ui;

import org.pushingpixels.radiance.component.api.ribbon.JRibbonFrame;
import org.pushingpixels.radiance.component.internal.ui.ribbon.JRibbonRootPane;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.internal.ui.RadianceRootPaneUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceTitlePane;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * UI delegate for root panes of {@link JRibbonFrame} under Radiance
 * look-and-feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceRibbonRootPaneUI extends RadianceRootPaneUI {
	public static ComponentUI createUI(JComponent c) {
		return new RadianceRibbonRootPaneUI();
	}

	private RadianceRibbonRootPaneUI() {
	}

    @Override
    protected void installDefaults(JRootPane c) {
        super.installDefaults(c);

        // Set control font, so that it can be used in the key tip layer to determine how big
        // each key tip is during its rendering.
        c.setFont(RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().getControlFont());
    }

    @Override
	protected RadianceTitlePane createTitlePane(JRootPane root) {
		return new RadianceRibbonFrameTitlePane(root, this);
	}

    @Override
    protected LayoutManager createLayoutManager() {
        LayoutManager coreRadianceLayoutManager = super.createLayoutManager();
        return new LayoutManager() {
            public void addLayoutComponent(String name, Component comp) {
                coreRadianceLayoutManager.addLayoutComponent(name, comp);
            }

            public void layoutContainer(Container parent) {
                coreRadianceLayoutManager.layoutContainer(parent);
                JRibbonRootPane root = (JRibbonRootPane) parent;
                JComponent keyTipLayer = root.getKeyTipLayer();
                if (root.getWindowDecorationStyle() != JRootPane.NONE) {
                    keyTipLayer.setBounds(root.getBounds());
                } else {
                    keyTipLayer.setBounds(root.getContentPane().getBounds());
                }
            }

            public Dimension minimumLayoutSize(Container parent) {
                return coreRadianceLayoutManager.minimumLayoutSize(parent);
            }

            public Dimension preferredLayoutSize(Container parent) {
                return coreRadianceLayoutManager.preferredLayoutSize(parent);
            }

            public void removeLayoutComponent(Component comp) {
                coreRadianceLayoutManager.removeLayoutComponent(comp);
            }
        };
    }
}
