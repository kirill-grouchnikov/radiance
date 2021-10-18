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
package org.pushingpixels.tools.common

import org.pushingpixels.radiance.common.api.RadianceCommonCortex
import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.radiance.laf.api.RadianceLafCortex
import org.pushingpixels.radiance.laf.api.RadianceLafSlices
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme
import java.awt.Component
import java.awt.image.BufferedImage

object RadianceLogo {
    fun getLogoIcon(scheme: RadianceColorScheme): RadianceIcon {
        // Step 1 - create a 16x16 version of the transcoded Radiance logo
        val base = radiance_menu.of(16, 16)
        // Step 2 - apply color filter
        base.setColorFilter { scheme.foregroundColor }
        // Step 3 - good to go
        return base
    }

    fun getLogoImage(comp: Component, scheme: RadianceColorScheme): BufferedImage {
        return getLogoIcon(scheme).toImage(RadianceCommonCortex.getScaleFactor(comp))
    }

    fun getTitlePaneLogoImage(comp: Component): BufferedImage {
        return getLogoImage(comp, RadianceLafCortex.GlobalScope.getCurrentSkin()!!
                .getEnabledColorScheme(RadianceLafSlices.DecorationAreaType.PRIMARY_TITLE_PANE))
    }
}
