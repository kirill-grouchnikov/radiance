/*
 * Copyright (c) 2018-2019 Radiance Ember Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Ember Kirill Grouchnikov nor the names of
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
package org.pushingpixels.ember

import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.painter.preview.DefaultPreviewPainter
import org.pushingpixels.substance.api.painter.preview.PreviewPainter
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper
import org.pushingpixels.substance.api.shaper.StandardButtonShaper
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper
import javax.swing.JComponent

/**
 * Specifies preview painter to be used for showing preview of this component or its
 * immediate children. Default implementation is available in the
 * [DefaultPreviewPainter].
 *
 * @param previewPainter Preview painter. Can be `null`.
 */
@EmberComponentOrParentScope
fun JComponent.setComponentPreviewPainter(previewPainter: PreviewPainter) {
    SubstanceCortex.ComponentOrParentScope.setComponentPreviewPainter(this, previewPainter)
}

/**
 * Specifies whether this component or its immediate children should ignore the
 * default (minimum) dimension for buttons. Note that [SubstanceButtonShaper]
 * implementations are not required to respect this call. The current implementations of the
 * default [StandardButtonShaper] and [ClassicButtonShaper] respect this
 * setting.
 *
 * @param buttonIgnoreMinimumSize If `true`, the component or its immediate
 * children will ignore the default (minimum) dimension for buttons under button
 * shapers that respect this setting. Pass `null` to reset to the default
 * behavior.
 */
fun JComponent.setButtonIgnoreMinimumSize(buttonIgnoreMinimumSize: Boolean?) {
    SubstanceCortex.ComponentOrParentScope.setButtonIgnoreMinimumSize(this, buttonIgnoreMinimumSize)
}

/**
 * Specifies whether this component or its immediate children should never paint
 * button backgrounds.
 *
 * @param neverPaintButtonBackground If `true`, the component or its immediate
 * children will never paint button backgrounds. Pass `null` to reset
 * to the default behavior.
 * @see JComponent.setFlatBackground
 */
fun JComponent.setButtonNeverPaintBackground(neverPaintButtonBackground: Boolean?) {
    SubstanceCortex.ComponentOrParentScope.setButtonNeverPaintBackground(this,
            neverPaintButtonBackground)
}

/**
 * Specifies whether this component or its immediate children should not paint
 * backgrounds unless selected, armed, pressed or (possibly) hovered over.
 *
 * @param flatBackground If `true`, the component or its immediate children
 * will not paint backgrounds unless selected, armed, pressed or (possibly)
 * hovered over. Pass `null` to reset to the default behavior.
 * @see JComponent.setButtonNeverPaintBackground
 */
fun JComponent.setFlatBackground(flatBackground: Boolean?) {
    SubstanceCortex.ComponentOrParentScope.setFlatBackground(this, flatBackground)
}
