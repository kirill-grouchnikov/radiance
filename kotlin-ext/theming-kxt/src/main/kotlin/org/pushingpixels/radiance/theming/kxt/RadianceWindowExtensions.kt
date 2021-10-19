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
package org.pushingpixels.radiance.theming.kxt

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import java.awt.Insets
import java.awt.Window
import javax.swing.JButton
import javax.swing.SwingUtilities

/**
 * Sets the visibility of the specified widget type(s). This method should not be called
 * from inside the initialization sequence of this window. If the specific widget needs to
 * be visible when the window is shown, wrap the call with
 * [SwingUtilities.invokeLater] or [GlobalScope.launch(Dispatchers.Swing)]
 *
 * @param visible          Visibility indication.
 * @param radianceWidgets Widget types.
 */
@RadianceWindowScope
public fun Window.setWidgetVisible(visible: Boolean,
        vararg radianceWidgets: RadianceThemingSlices.WidgetType
) {
    RadianceThemingCortex.WindowScope.setWidgetVisible(this, visible, *radianceWidgets)
}

/**
 * Marks this window to have its content extend vertically into the title pane
 * area. Use the following methods for finer control over such extended content:
 *
 *  * [Window.getTitlePaneControlInsets] to query the insets that should be
 * reserved for the main control buttons - close / maximize / minimize.
 *  * [Window.setPreferredTitlePaneHeight] to increase the preferred height of
 * the title pane area in case the content you extend into that area is taller than the main
 * control buttons.
 *  * [Window.createTitlePaneControlButton] to get a button that has consistent
 * visual appearance and preferred size with the main control buttons.
 *
 * @param controlButtonGroupHorizontalGravity Horizontal gravity for the title control
 * buttons. Must be either
 * [RadianceThemingSlices.HorizontalGravity.LEADING] or
 * [RadianceThemingSlices.HorizontalGravity.TRAILING].
 * @param controlButtonGroupVerticalGravity   Vertical gravity for the title control
 * buttons. May not be `null`.
 * @see Window.getTitlePaneControlInsets
 * @see Window.setPreferredTitlePaneHeight
 * @see Window.getTitleControlButtonGroupHorizontalGravity
 * @see Window.createTitlePaneControlButton
 */
@RadianceWindowScope
public fun Window.extendContentIntoTitlePane(
    controlButtonGroupHorizontalGravity: RadianceThemingSlices.HorizontalGravity,
    controlButtonGroupVerticalGravity: RadianceThemingSlices.VerticalGravity?) {
    RadianceThemingCortex.WindowScope.extendContentIntoTitlePane(this,
            controlButtonGroupHorizontalGravity, controlButtonGroupVerticalGravity)
}

/**
 * Returns a new instance of a button that has consistent visuals and preferred size to be
 * used in application content that is extended into the title pane area with
 * [Window.extendContentIntoTitlePane]
 * API. If the content of the button will need more space (horizontally and / or
 * vertically), you can query the preferred size and then tweak it.
 *
 * @return A new instance of a button that has consistent visuals and preferred size to be
 * used in application content that is extended into the title pane area.
 * @see Window.extendContentIntoTitlePane
 * @see Window.getTitlePaneControlInsets
 * @see Window.setPreferredTitlePaneHeight
 */
@RadianceWindowScope
public fun Window.createTitlePaneControlButton(): JButton? {
    return RadianceThemingCortex.WindowScope.createTitlePaneControlButton(this)
}

/**
 * Queries the insets that should be reserved for the main control buttons (close / maximize
 * / minimize) in application content that is extended into the title pane area with
 * [Window.extendContentIntoTitlePane]
 * API. [Insets.left] and [Insets.right] give the horizontal insets of the
 * control buttons.
 * [Insets.top] and [Insets.right] give the vertical insets within the matching
 * horizontal insets.
 *
 * @return The insets that should be reserved for the main control buttons (close / maximize
 * / minimize) in application content that is extended into the title pane area.
 * @see Window.extendContentIntoTitlePane
 * @see Window.createTitlePaneControlButton
 * @see Window.setPreferredTitlePaneHeight
 */
@RadianceWindowScope
public fun Window.getTitlePaneControlInsets(): Insets? {
    return RadianceThemingCortex.WindowScope.getTitlePaneControlInsets(this)
}

/**
 * Increase the preferred height of the title pane area in case the content you extend into
 * that area with [Window.extendContentIntoTitlePane]
 * API is taller than the main control buttons.
 *
 * @param preferredTitlePaneHeight Preferred height of the title pane area. Must be a
 * positive value.
 * @see Window.extendContentIntoTitlePane
 * @see Window.createTitlePaneControlButton
 * @see Window.getTitlePaneControlInsets
 */
@RadianceWindowScope
public fun Window.setPreferredTitlePaneHeight(preferredTitlePaneHeight: Int) {
    RadianceThemingCortex.WindowScope.setPreferredTitlePaneHeight(this, preferredTitlePaneHeight)
}

/**
 * Returns the horizontal gravity for the control button group in the title pane of this
 * window.
 *
 * @return Horizontal gravity for the control button group in the title pane of this
 * window.
 * @see Window.extendContentIntoTitlePane
 */
@RadianceWindowScope
public fun Window.getTitleControlButtonGroupHorizontalGravity(): RadianceThemingSlices.HorizontalGravity {
    return RadianceThemingCortex.WindowScope.getTitleControlButtonGroupHorizontalGravity(this)
}
