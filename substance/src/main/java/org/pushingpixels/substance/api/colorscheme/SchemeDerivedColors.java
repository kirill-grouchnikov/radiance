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
package org.pushingpixels.substance.api.colorscheme;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices;

import java.awt.*;

/**
 * Interface for derived color scheme colors.
 *
 * @author Kirill Grouchnikov
 */
public interface SchemeDerivedColors {
    /**
     * Returns the line color for <code>this</code> scheme.
     *
     * @return The line color for <code>this</code> scheme.
     * @see org.pushingpixels.substance.api.SubstanceSkin#getOverlayColor(SubstanceSlices.ColorOverlayType, SubstanceSlices.DecorationAreaType, ComponentState)
     */
    Color getLineColor();

    /**
     * Returns the selection background color for <code>this</code> scheme.
     *
     * @return The selection background color for <code>this</code> scheme.
     */
    Color getSelectionBackgroundColor();

    /**
     * Returns the selection foreground color for <code>this</code> scheme.
     *
     * @return The selection foreground color for <code>this</code> scheme.
     */
    Color getSelectionForegroundColor();

    /**
     * Returns the background fill color for <code>this</code> scheme.
     *
     * @return The background fill color for <code>this</code> scheme.
     */
    Color getBackgroundFillColor();

    /**
     * Returns the accented background fill color for <code>this</code> scheme.
     *
     * @return The accented background fill color for <code>this</code> scheme.
     */
    Color getAccentedBackgroundFillColor();

    /**
     * Returns the text background fill color for <code>this</code> scheme.
     *
     * @return The text background fill color for <code>this</code> scheme.
     */
    Color getTextBackgroundFillColor();

    /**
     * Returns the focus ring color for <code>this</code> scheme.
     *
     * @return The focus ring color for <code>this</code> scheme.
     * @see org.pushingpixels.substance.api.SubstanceSkin#getOverlayColor(SubstanceSlices.ColorOverlayType, SubstanceSlices.DecorationAreaType, ComponentState)
     */
    Color getFocusRingColor();

    /**
     * Returns the primary separator color for <code>this</code> scheme.
     *
     * @return The primary separator color for <code>this</code> scheme.
     */
    Color getSeparatorPrimaryColor();

    /**
     * Returns the secondary separator color for <code>this</code> scheme.
     *
     * @return The secondary separator color for <code>this</code> scheme.
     */
    Color getSeparatorSecondaryColor();

    /**
     * Returns the mark color for <code>this</code> scheme. Mark color is used on
     * checkboxes, radio buttons, scrollbar arrows, combo arrows, menu arrows, etc.
     *
     * @return The mark color for <code>this</code> scheme.
     */
    Color getMarkColor();

    /**
     * Returns the echo color for <code>this</code> scheme. Echo color is used for
     * drawing slight echo / drop shadow around title pane texts and similar "primary"
     * elements.
     *
     * @return The echo color for <code>this</code> scheme.
     */
    Color getEchoColor();
}
