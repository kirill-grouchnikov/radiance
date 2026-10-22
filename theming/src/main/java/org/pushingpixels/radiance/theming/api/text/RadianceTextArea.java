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
package org.pushingpixels.radiance.theming.api.text;

import org.pushingpixels.radiance.theming.internal.utils.RadianceTextUtilities;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import javax.swing.text.Document;
import java.awt.*;

/**
 * An extension of the core {@link JTextArea} class that provides consistent support for text selection
 * visuals under different Radiance skins and decoration area types.
 */
public class RadianceTextArea extends JTextArea {
    /**
     * Constructs a {@code RadianceTextArea} with no initial text.
     */
    public RadianceTextArea() {
    }

    /**
     * Constructs a {@code RadianceTextArea} with the specified text.
     *
     * @param text The initial text.
     */
    public RadianceTextArea(String text) {
        super(text);
    }

    /**
     * Constructs a {@code RadianceTextArea} with the specified rows and columns.
     *
     * @param rows    The number of rows.
     * @param columns The number of columns.
     */
    public RadianceTextArea(int rows, int columns) {
        super(rows, columns);
    }

    /**
     * Constructs a {@code RadianceTextArea} with the specified text, rows, and columns.
     *
     * @param text    The initial text.
     * @param rows    The number of rows.
     * @param columns The number of columns.
     */
    public RadianceTextArea(String text, int rows, int columns) {
        super(text, rows, columns);
    }

    /**
     * Constructs a {@code RadianceTextArea} with the specified document.
     *
     * @param doc The document model.
     */
    public RadianceTextArea(Document doc) {
        super(doc);
    }

    /**
     * Constructs a {@code RadianceTextArea} with the specified document, text, rows, and columns.
     *
     * @param doc     The document model.
     * @param text    The initial text.
     * @param rows    The number of rows.
     * @param columns The number of columns.
     */
    public RadianceTextArea(Document doc, String text, int rows, int columns) {
        super(doc, text, rows, columns);
    }

    @Override
    public Color getSelectionColor() {
        Color base = super.getSelectionColor();
        if (base instanceof UIResource) {
            return RadianceTextUtilities.getTextSelectionBackground(this);
        } else {
            return base;
        }
    }

    @Override
    public Color getSelectedTextColor() {
        Color base = super.getSelectionColor();
        if (base instanceof UIResource) {
            return RadianceTextUtilities.getTextSelectionForeground(this);
        } else {
            return base;
        }
    }
}
