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
package org.pushingpixels.radiance.theming.api.shaper;

import org.pushingpixels.radiance.theming.api.trait.RadianceTrait;

import javax.swing.*;
import java.awt.*;

/**
 * Component shaper interface for <b>Radiance</b> look and feel. This class is
 * part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public interface RadianceComponentShaper extends RadianceTrait {
    /**
     * Returns the outline path for the specified button.
     *
     * @param button      A button.
     * @param width       Button width.
     * @param height      Button height.
     * @param insets Button insets.
     * @param scaleFactor Scale factor.
     * @return The outline path for the specified button.
     */
    Shape getButtonOutline(AbstractButton button,
        float width, float height, float insets, float radiusAdjustment, double scaleFactor);

    /**
     * Returns the preferred size for the specified button.
     *
     * @param button          A button.
     * @return The preferred size for the specified button.
     */
    Dimension getButtonPreferredSize(AbstractButton button);
}
