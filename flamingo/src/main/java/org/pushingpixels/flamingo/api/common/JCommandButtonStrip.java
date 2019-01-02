/*
 * Copyright (c) 2005-2019 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.flamingo.api.common;

import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.projection.Projection;
import org.pushingpixels.flamingo.internal.ui.common.*;

import javax.swing.*;
import java.awt.*;

/**
 * Button strip component. Provides visual appearance of a strip. The buttons in
 * the strip are either drawn horizontally with no horizontal space between them
 * or drawn vertically with no vertical space between them.
 *
 * @author Kirill Grouchnikov
 */
public class JCommandButtonStrip extends JComponent {
    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "CommandButtonStripUI";

    private Projection<JCommandButtonStrip, CommandGroup, CommandStripPresentationModel> projection;

    public JCommandButtonStrip(Projection<JCommandButtonStrip, CommandGroup,
            CommandStripPresentationModel> projection) {
        this.projection = projection;

        this.setOpaque(false);

        updateUI();
    }

    public Projection<JCommandButtonStrip, CommandGroup, CommandStripPresentationModel> getProjection() {
        return this.projection;
    }

    @Override
    public void add(Component comp, Object constraints, int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(Component comp, Object constraints) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component add(Component comp, int index) {
        if (!(comp instanceof AbstractCommandButton)) {
            throw new UnsupportedOperationException();
        }
        return super.add(comp, index);
    }

    @Override
    public Component add(Component comp) {
        if (!(comp instanceof AbstractCommandButton)) {
            throw new UnsupportedOperationException();
        }
        return super.add(comp);
    }

    @Override
    public Component add(String name, Component comp) {
        throw new UnsupportedOperationException();
    }

    /**
     * Sets the new UI delegate.
     *
     * @param ui New UI delegate.
     */
    public void setUI(CommandButtonStripUI ui) {
        super.setUI(ui);
    }

    /**
     * Resets the UI property to a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
    @Override
    public void updateUI() {
        if (UIManager.get(getUIClassID()) != null) {
            setUI((CommandButtonStripUI) UIManager.getUI(this));
        } else {
            setUI(BasicCommandButtonStripUI.createUI(this));
        }
    }

    /**
     * Returns the UI delegate for this component.
     *
     * @return a <code>ButtonStripUI</code> object
     * @see #setUI
     */
    public CommandButtonStripUI getUI() {
        return (CommandButtonStripUI) ui;
    }

    /**
     * Returns the name of the UI delegate for this component.
     *
     * @return the string "ButtonStripUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    /**
     * Returns the number of buttons in <code>this</code> strip.
     *
     * @return Number of buttons in <code>this</code> strip.
     * @see #getButton(int)
     */
    public int getButtonCount() {
        return this.getComponentCount();
    }

    /**
     * Returns the specified button component of <code>this</code> strip.
     *
     * @param index Button index.
     * @return The matching button.
     * @see #getButtonCount()
     */
    public AbstractCommandButton getButton(int index) {
        return (AbstractCommandButton) this.getComponent(index);
    }
}
