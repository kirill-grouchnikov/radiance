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
package org.pushingpixels.radiance.demo.component.ktx

import org.pushingpixels.radiance.common.api.RadianceCommonCortex
import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.radiance.demo.component.ktx.svg.radiance_menu
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo
import org.pushingpixels.radiance.theming.api.ContainerColorTokens
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import java.awt.Component
import java.awt.Dimension
import java.awt.image.BufferedImage
import javax.swing.JDialog
import javax.swing.JFrame
import javax.swing.JInternalFrame
import javax.swing.SwingUtilities

object RadianceLogo {
    fun getLogoIcon(colorTokens: ContainerColorTokens): RadianceIcon {
        // Step 1 - create a colorized version of the transcoded Radiance logo
        val base: RadianceIcon = radiance_menu.factory().createNewIcon()
        base.setColorFilter { color -> colorTokens.getOnContainer() }
        // Step 2 - configure the colorized version to be 16x16
        base.setDimension(Dimension(16, 16))
        // Step 3 - good to go
        return base
    }

    fun getLogoImage(comp: Component, colorTokens: ContainerColorTokens): BufferedImage {
        return RadianceLogo.getLogoIcon(colorTokens).toImage(RadianceCommonCortex.getScaleFactor(comp))
    }

    fun tonalConfigureOn(frame: JFrame) {
        frame.iconImage = RadianceLogo.getLogoImage(
            frame,
            RadianceThemingCortex.ComponentScope.getCurrentSkin(frame.getRootPane())
                .getNeutralContainerTokens(RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE)
        )
        RadianceThemingCortex.GlobalScope.registerSkinChangeListener {
            SwingUtilities.invokeLater {
                frame.iconImage = RadianceLogo.getLogoImage(
                    frame,
                    RadianceThemingCortex.ComponentScope.getCurrentSkin(frame.getRootPane())
                        .getNeutralContainerTokens(
                            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE
                        )
                )
            }
        }
    }

    fun tonalConfigureOn(dialog: JDialog) {
        dialog.setIconImage(
            RadianceLogo.getLogoImage(
                dialog,
                RadianceThemingCortex.ComponentScope.getCurrentSkin(dialog.getRootPane())
                    .getNeutralContainerTokens(RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE)
            )
        )
        RadianceThemingCortex.GlobalScope.registerSkinChangeListener {
            SwingUtilities.invokeLater {
                dialog.setIconImage(
                    RadianceLogo.getLogoImage(
                        dialog,
                        RadianceThemingCortex.ComponentScope.getCurrentSkin(dialog.getRootPane())
                            .getNeutralContainerTokens(
                                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE
                            )
                    )
                )
            }
        }
    }

    fun tonalConfigureOn(frame: JInternalFrame) {
        frame.setFrameIcon(
            RadianceLogo.getLogoIcon(
                RadianceThemingCortex.ComponentScope.getCurrentSkin(frame.getRootPane())
                    .getNeutralContainerTokens(RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE)
            )
        )
        RadianceThemingCortex.GlobalScope.registerSkinChangeListener {
            SwingUtilities.invokeLater {
                frame.setFrameIcon(
                    RadianceLogo.getLogoIcon(
                        RadianceThemingCortex.ComponentScope.getCurrentSkin(frame.getRootPane())
                            .getNeutralContainerTokens(
                                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE
                            )
                    )
                )
            }
        }
    }
}
