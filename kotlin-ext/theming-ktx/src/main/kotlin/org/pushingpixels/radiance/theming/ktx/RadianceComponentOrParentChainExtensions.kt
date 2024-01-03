/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.ktx

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType
import java.awt.Component
import javax.swing.AbstractButton
import javax.swing.JComponent
import javax.swing.JToolBar
import javax.swing.plaf.UIResource

/**
 * Specifies whether the contents of this component or its nested children
 * should be selected on focus gain.
 *
 * @param selectTextOnFocus If `true`, the contents of this text
 * component or its nested children will be selected on focus gain. Pass
 * `null` to reset to the default behavior.
 */
@RadianceComponentOrParentChainScope
public fun JComponent.setSelectTextOnFocus(selectTextOnFocus: Boolean?) {
    RadianceThemingCortex.ComponentOrParentChainScope.setSelectTextOnFocus(this, selectTextOnFocus)
}

/**
 * Specifies corner radius for all buttons in this toolbar.
 *
 * @param toolbarButtonCornerRadius Corner radius for all buttons in the toolbar.
 * @see AbstractButton.setToolbarButtonCornerRadius
 */
@RadianceComponentOrParentChainScope
public fun JToolBar.setToolbarButtonCornerRadius(toolbarButtonCornerRadius: Float) {
    RadianceThemingCortex.ComponentOrParentChainScope.setToolbarButtonCornerRadius(
            this, toolbarButtonCornerRadius)
}

/**
 * Specifies that extra UI elements (such as menu items in system menu or lock borders)
 * should be shown in this component.
 *
 * @param extraWidgetsPresence If `true`, extra UI elements (such as menu
 * items in system menu or lock borders) will be shown in this component. Pass
 * `null` to reset to the default behavior.
 */
@RadianceComponentOrParentChainScope
public fun JComponent.setExtraWidgetsPresence(extraWidgetsPresence: Boolean?) {
    RadianceThemingCortex.ComponentOrParentChainScope.setExtraWidgetsPresence(this, extraWidgetsPresence)
}

/**
 * Specifies colorization amount applied to the background and foreground of the current
 * color scheme and the specific control. By default, when the application does not use any
 * custom colors, all the controls are painted with the colors of the current color scheme /
 * skin. The colors coming from the look-and-feel implement the marker [UIResource]
 * interface which allows the UI delegates to differentiate between application-specific
 * colors which are not changed, and the LAF-provide colors that are changed on LAF switch.
 *
 * Calling this method installs the "smart colorization" mode which uses the colors of the
 * current color scheme and the custom background / foreground colors (when installed by
 * application) to colorize the relevant portions of the control. For example, on checkbox
 * the custom background color will be used to colorize the check box itself, while the
 * custom foreground color will be applied to the check box text and the check mark.
 *
 * Value of 0.0 of colorization amount results in Radiance completely
 * **ignoring** the custom application background and foreground colors set on
 * the components - no colorization. Values closer to 1.0 result in almost full usage of the
 * custom application background and foreground colors set on the components. Note that in
 * order to maintain the gradients (fill, border, etc), even value of 1.0 does not result in
 * full custom color being applied to the relevant visuals of the control.
 *
 * Calling this method applies colorization amount to the component / container itself and
 * all its children that do not call this method.
 *
 * The default colorization amount (when this method is not called at all) is 0.5. This
 * means that applications that install custom background / foreground colors on their UI
 * controls will see them colorized with 50% "strength", even without calling this method.
 *
 *
 * @param colorizationFactor Colorization factor to apply to this component and its nested
 * children.
 */
@RadianceComponentOrParentChainScope
public fun JComponent.setColorizationFactor(colorizationFactor: Double) {
    RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(this, colorizationFactor)
}

/**
 * Specifies the kind of focus indication to be used on this component and its
 * nested children.
 *
 * @param focusKind Kind of focus indication to be used on this component and its nested
 * children.
 */
@RadianceComponentOrParentChainScope
public fun JComponent.setFocusKind(focusKind: RadianceThemingSlices.FocusKind) {
    RadianceThemingCortex.ComponentOrParentChainScope.setFocusKind(this, focusKind)
}

/**
 * Sets the decoration type of this component and all its children.
 *
 * @param type Decoration type of this component and all its children.
 * @see JComponent.getDecorationType
 * @see JComponent.getImmediateDecorationType
 */
@RadianceComponentOrParentChainScope
public fun JComponent.setDecorationType(type: DecorationAreaType) {
    RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(this, type)
}

/**
 * Returns the decoration area type of this component. The component and its
 * ancestor hierarchy are scanned for the registered decoration area type. If
 * [JComponent.setDecorationType] has been called on the
 * specified component, the matching decoration type is returned. Otherwise, the component
 * hierarchy is scanned to find the closest ancestor that was passed to
 * [JComponent.setDecorationType] - and its decoration type is
 * returned. If neither the component, nor any one of its parent components has been passed
 * to the setter method, [RadianceThemingSlices.DecorationAreaType.NONE] is returned.
 *
 * @return Decoration area type of the component.
 * @see JComponent.setDecorationType
 * @see JComponent.getImmediateDecorationType
 */
@RadianceComponentOrParentChainScope
public fun Component.getDecorationType(): DecorationAreaType {
    return RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(this)
}

