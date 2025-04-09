/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.check;

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.text.RadianceTextField;

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;

/**
 * Test application panel for testing text fields in decoration areas.
 * 
 * @author Kirill Grouchnikov
 */
public class DecoratedTextFieldsPanel extends JPanel implements Deferrable, SkinDependent {
    private boolean isInitialized;

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
    }

    public DecoratedTextFieldsPanel() {
    }

    private RadianceTextField makeTextField(String text) {
        RadianceTextField result = new RadianceTextField(text, 20);
        // force the display of text selection even when the focus has been lost
        result.setCaret(new DefaultCaret() {
            @Override
            public void setSelectionVisible(boolean vis) {
                super.setSelectionVisible(true);
            }
        });
        return result;
    }

    @Override
    public void reload() {
        this.removeAll();

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel panelTitlePane = new JPanel(new FlowLayout());
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(panelTitlePane,
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE);
        panelTitlePane.add(makeTextField("sample title pane"));
        this.add(panelTitlePane);

        JPanel panelToolbar = new JPanel(new FlowLayout());
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(panelToolbar,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);
        panelToolbar.add(makeTextField("sample toolbar"));
        this.add(panelToolbar);

        JPanel panelControlPane = new JPanel(new FlowLayout());
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(panelControlPane,
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);
        panelControlPane.add(makeTextField("sample control pane"));
        this.add(panelControlPane);

        JPanel panelNone = new JPanel(new FlowLayout());
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(panelNone,
            RadianceThemingSlices.DecorationAreaType.NONE);
        panelNone.add(makeTextField("sample none"));
        this.add(panelNone);

        JPanel panelFooter = new JPanel(new FlowLayout());
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(panelFooter,
            RadianceThemingSlices.DecorationAreaType.FOOTER);
        panelFooter.add(makeTextField("sample footer"));
        this.add(panelFooter);
    }

    @Override
    public synchronized void initialize() {
        this.reload();
        this.isInitialized = true;
    }
}
