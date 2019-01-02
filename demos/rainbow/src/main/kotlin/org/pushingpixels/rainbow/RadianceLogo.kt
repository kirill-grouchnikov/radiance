/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Kirill Grouchnikov nor the names of
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
package org.pushingpixels.rainbow

import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.rainbow.svg.radiance_menu
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.SubstanceSlices
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme
import java.awt.Dimension
import java.awt.image.BufferedImage

object RadianceLogo {
    fun getLogoIcon(scheme: SubstanceColorScheme): ResizableIcon {
        // Step 1 - create a colorized version of the transcoded Radiance logo
        val base = SubstanceCortex.GlobalScope.colorizeIcon(radiance_menu.factory(),
                scheme.foregroundColor)
        // Step 2 - configure the colorized version to be 16x16
        base.setDimension(Dimension(16, 16))
        // Step 3 - good to go
        return base
    }

    fun getLogoImage(scheme: SubstanceColorScheme): BufferedImage {
        return getLogoIcon(scheme).toImage()
    }

    fun getTitlePaneLogoImage(): BufferedImage {
        return getLogoImage(SubstanceCortex.GlobalScope.getCurrentSkin()!!
                .getEnabledColorScheme(SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE))
    }
}
