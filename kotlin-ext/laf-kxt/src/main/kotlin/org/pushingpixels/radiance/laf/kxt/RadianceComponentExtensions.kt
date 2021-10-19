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
package org.pushingpixels.radiance.laf.kxt

import org.pushingpixels.radiance.laf.api.RadianceLafCortex
import org.pushingpixels.radiance.laf.api.RadianceSkin
import org.pushingpixels.radiance.laf.api.RadianceLafSlices
import org.pushingpixels.radiance.laf.api.combo.ComboPopupPrototypeCallback
import org.pushingpixels.radiance.laf.api.password.PasswordStrengthChecker
import org.pushingpixels.radiance.laf.api.shaper.ClassicButtonShaper
import org.pushingpixels.radiance.laf.api.shaper.PillButtonShaper
import org.pushingpixels.radiance.laf.api.shaper.RadianceButtonShaper
import org.pushingpixels.radiance.laf.api.tabbed.BaseTabCloseListener
import org.pushingpixels.radiance.laf.api.tabbed.TabCloseCallback
import java.awt.Component
import javax.swing.*
import javax.swing.text.JTextComponent

/**
 * Returns the current skin for the this component. If the current look-and-feel is not
 * Radiance, this method returns `null`.
 *
 * @return Current skin for the specified component.
 */
@RadianceComponentScope
public fun Component.getCurrentSkin(): RadianceSkin? {
    return RadianceLafCortex.ComponentScope.getCurrentSkin(this)
}

/**
 * Registers the specified listener on tab-close events on this tabbed pane.
 *
 * @param tabCloseListener Listener to register.
 * @see JTabbedPane.unregisterTabCloseChangeListener
 * @see JTabbedPane.getAllTabCloseListeners
 */
@RadianceComponentScope
public fun JTabbedPane.registerTabCloseChangeListener(tabCloseListener: BaseTabCloseListener) {
    RadianceLafCortex.ComponentScope.registerTabCloseChangeListener(this, tabCloseListener)
}

/**
 * Unregisters the specified listener on tab-close events on this tabbed pane.
 *
 * @param tabCloseListener Listener to unregister.
 * @see JTabbedPane.registerTabCloseChangeListener
 * @see JTabbedPane.getAllTabCloseListeners
 */
@RadianceComponentScope
public fun JTabbedPane.unregisterTabCloseChangeListener(tabCloseListener: BaseTabCloseListener) {
    RadianceLafCortex.ComponentScope.unregisterTabCloseChangeListener(this, tabCloseListener)
}

/**
 * Returns all listeners registered on tab closing of this tabbed pane.
 *
 * @return All listeners registered on tab closing of this tabbed pane.
 * @see JTabbedPane.registerTabCloseChangeListener
 * @see JTabbedPane.unregisterTabCloseChangeListener
 */
@RadianceComponentScope
public fun JTabbedPane.getAllTabCloseListeners(): Set<BaseTabCloseListener> {
    return RadianceLafCortex.ComponentScope.getAllTabCloseListeners(this)
}

/**
 * Allows animations of the specified facet on this control.
 *
 * @param animationFacet Animation facet to allow.
 * @see Component.disallowAnimations
 * @see Component.isAnimationAllowed
 */
@RadianceComponentScope
public fun Component.allowAnimations(animationFacet: RadianceLafSlices.AnimationFacet) {
    RadianceLafCortex.ComponentScope.allowAnimations(this, animationFacet)
}

/**
 * Disallows animations of the specified facet on this control.
 *
 * @param animationFacet Animation facet to disallow.
 * @see Component.allowAnimations
 * @see Component.isAnimationAllowed
 */
@RadianceComponentScope
public fun Component.disallowAnimations(animationFacet: RadianceLafSlices.AnimationFacet) {
    RadianceLafCortex.ComponentScope.disallowAnimations(this, animationFacet)
}

/**
 * Checks whether the specified animation facet is allowed on this component.
 *
 * @param animationFacet Animation facet.
 * @return `true` if the specified animation facet is allowed on the specified
 * component, `false` otherwise.
 * @see Component.allowAnimations
 * @see Component.disallowAnimations
 */
@RadianceComponentScope
public fun Component.isAnimationAllowed(animationFacet: RadianceLafSlices.AnimationFacet): Boolean {
    return RadianceLafCortex.ComponentScope.isAnimationAllowed(this, animationFacet)
}

/**
 * Returns the immediate decoration area type of this component. The component is
 * checked for the registered decoration area type. If
 * [JComponent.setDecorationType] was not called on this component, this method returns `null`.
 *
 * @return Immediate decoration area type of the component.
 * @see JComponent.setDecorationType
 * @see JComponent.getDecorationType
 */
@RadianceComponentScope
public fun Component.getImmediateDecorationType(): RadianceLafSlices.DecorationAreaType? {
    return RadianceLafCortex.ComponentScope.getImmediateDecorationType(this)
}

/**
 * Specifies component-level visibility of the lock icon on this component.
 *
 * @param visible If `true`, this component will show a lock icon
 * when it is in non-editable mode. Pass `null` to reset to the default
 * behavior.
 */
@RadianceComponentScope
public fun JComponent.setLockIconVisible(visible: Boolean?) {
    RadianceLafCortex.ComponentScope.setLockIconVisible(this, visible)
}

/**
 * Specifies component-level visibility of the caps lock indicator on this password field.
 *
 * @param visible If `true`, this password field will show an indicator icon
 * when it is focused and caps lock is on. Pass `null` to reset to the default
 * behavior.
 */
@RadianceComponentScope
public fun JPasswordField.setCapsLockIconVisible(visible: Boolean?) {
    RadianceLafCortex.ComponentScope.setCapsLockIconVisible(this, visible)
}

/**
 * Specifies password strength checker for this password field.
 *
 * @param passwordStrengthChecker Password strength checker
 */
@RadianceComponentScope
public fun JPasswordField.setPasswordStrengthChecker(passwordStrengthChecker: PasswordStrengthChecker) {
    RadianceLafCortex.ComponentScope.setPasswordStrengthChecker(this, passwordStrengthChecker)
}

/**
 * Specifies whether this text component contents should flip selection on ESCAPE key press.
 *
 * @param flipTextSelectionOnEscape If `true`, the contents of the specified
 * text component will flip selection on ESCAPE key press. Pass `null`
 * to reset to the default behavior.
 */
@RadianceComponentScope
public fun JTextComponent.setFlipTextSelectionOnEscape(flipTextSelectionOnEscape: Boolean?) {
    RadianceLafCortex.ComponentScope.setFlipTextSelectionOnEscape(this, flipTextSelectionOnEscape)
}

/**
 * Specifies whether this text component should have the edit context menu (with Cut / Copy /
 * Paste / ... menu items).
 *
 * @param hasEditContextMenu If `true`, the text component will have the edit
 * context menu (with Cut / Copy / Paste / ... menu items). Pass `null`
 * to reset to the default behavior.
 */
@RadianceComponentScope
public fun JTextComponent.setTextEditContextMenuPresence(hasEditContextMenu: Boolean?) {
    RadianceLafCortex.ComponentScope.setTextEditContextMenuPresence(this, hasEditContextMenu)
}

/**
 * Specifies whether this tree should have automatic drag and drop support.
 *
 * @param hasAutomaticDragAndDropSupport If `true`, this tree will have
 * automatic drag and drop support. Pass `null` to reset to the default behavior.
 */
@RadianceComponentScope
public fun JTree.setAutomaticDragAndDropSupportPresence(hasAutomaticDragAndDropSupport: Boolean?) {
    RadianceLafCortex.ComponentScope.setAutomaticDragAndDropSupportPresence(
        this, hasAutomaticDragAndDropSupport
    )
}

/**
 * Specifies whether this scroll pane should have have auto-scroll support invoked on mouse
 * button click that triggers popups.
 *
 * @param hasAutomaticScroll If `true`, this scroll pane will have have
 * auto-scroll support invoked on mouse button click that triggers popups. Pass
 * `null` to reset to the default behavior.
 */
@RadianceComponentScope
public fun JScrollPane.setAutomaticScrollPresence(hasAutomaticScroll: Boolean?) {
    RadianceLafCortex.ComponentScope.setAutomaticScrollPresence(this, hasAutomaticScroll)
}

/**
 * Specifies the open side for this component. Note that the
 * [RadianceButtonShaper] implementations are not required to respect this call. The
 * default [PillButtonShaper] and [ClassicButtonShaper] respect this call.
 *
 * @param openSide Open side.
 * @see JComponent.setButtonOpenSides
 * @see JComponent.setButtonStraightSide
 */
@RadianceComponentScope
public fun JComponent.setButtonOpenSide(openSide: RadianceLafSlices.Side) {
    RadianceLafCortex.ComponentScope.setButtonOpenSide(this, openSide)
}

/**
 * Specifies the open sides for this component. Note that the
 * [RadianceButtonShaper] implementations are not required to respect this call. The
 * default [PillButtonShaper] and [ClassicButtonShaper] respect this call.
 *
 * @param openSides Open sides.
 * @see JComponent.setButtonOpenSide
 * @see JComponent.setButtonStraightSides
 */
@RadianceComponentScope
public fun JComponent.setButtonOpenSides(openSides: Set<RadianceLafSlices.Side>) {
    RadianceLafCortex.ComponentScope.setButtonOpenSides(this, openSides)
}

/**
 * Specifies the straight side for this component. Note that the
 * [RadianceButtonShaper] implementations are not required to respect this call. The
 * default [PillButtonShaper] and [ClassicButtonShaper] respect this call.
 *
 * @param straightSide Straight side.
 * @see JComponent.setButtonOpenSide
 * @see JComponent.setButtonStraightSides
 */
@RadianceComponentScope
public fun JComponent.setButtonStraightSide(straightSide: RadianceLafSlices.Side) {
    RadianceLafCortex.ComponentScope.setButtonStraightSide(this, straightSide)
}

/**
 * Specifies the straight sides for this component. Note that the
 * [RadianceButtonShaper] implementations are not required to respect this call. The
 * default [PillButtonShaper] and [ClassicButtonShaper] respect this call.
 *
 * @param straightSides Straight sides.
 * @see JComponent.setButtonStraightSide
 * @see JComponent.setButtonOpenSides
 */
@RadianceComponentScope
public fun JComponent.setButtonStraightSides(straightSides: Set<RadianceLafSlices.Side>) {
    RadianceLafCortex.ComponentScope.setButtonStraightSides(this, straightSides)
}

/**
 * Specifies corner radius for this button. Note that this only applies when the
 * button is in a [JToolBar].
 *
 * @param toolbarButtonCornerRadius Corner radius for the button when it is in a
 * [JToolBar].
 * @see JToolBar.setToolbarButtonCornerRadius
 */
@RadianceComponentScope
public fun AbstractButton.setToolbarButtonCornerRadius(toolbarButtonCornerRadius: Float) {
    RadianceLafCortex.ComponentScope.setToolbarButtonCornerRadius(this, toolbarButtonCornerRadius)
}

/**
 * Specifies that contents of contents of this tab component in [JTabbedPane] have been modified and
 * not saved. [JTabbedPane.setRunModifiedAnimationOnTabCloseButton] and
 * [JTabbedPane.setRunModifiedAnimationOnTabCloseButton] APIs control whether
 * the entire tab or its close button area is animated.
 *
 * The animation cycles between red, orange and yellow color schemes. In most cases (all but
 * tabs not marked with
 * [JTabbedPane.setRunModifiedAnimationOnTabCloseButton] and
 * [JTabbedPane.setRunModifiedAnimationOnTabCloseButton] APIs), the animation
 * will be visible only when the mouse hovers over the close button of the tab. The tooltip
 * of the close button is changed as well to reflect that the container contents are marked
 * as modified.
 *
 * @param contentsModified If `true`, the **close** button of the matching
 * tab of the matching frame / dialog will be animated.
 * @see JRootPane.setContentsModified
 */
@RadianceComponentScope
public fun JComponent.setTabContentsModified(contentsModified: Boolean?) {
    RadianceLafCortex.ComponentScope.setTabContentsModified(this, contentsModified)
}

/**
 * Configures visibility of close buttons on all tabs in this tabbed pane.
 *
 * @param tabCloseButtonsVisible If `true`, all tabs in this tabbed pane will
 * show close buttons.
 * @see JComponent.setTabComponentCloseButtonVisible
 */
@RadianceComponentScope
public fun JTabbedPane.setTabCloseButtonsVisible(tabCloseButtonsVisible: Boolean?) {
    RadianceLafCortex.ComponentScope.setTabCloseButtonsVisible(this, tabCloseButtonsVisible)
}

/**
 * Configures visibility of close button on the specified tab component.
 *
 * @param tabCloseButtonVisible If `true`, the tab will show close button.
 * @see JTabbedPane.setTabCloseButtonsVisible
 */
@RadianceComponentScope
public fun JComponent.setTabComponentCloseButtonVisible(tabCloseButtonVisible: Boolean?) {
    RadianceLafCortex.ComponentScope.setTabCloseButtonVisible(this, tabCloseButtonVisible)
}

/**
 * Configures the callback for deciding on the tab close type on all tabs in this
 * tabbed pane. Note that this is only relevant for tabs configured with
 * [JComponent.setTabComponentCloseButtonVisible] and
 * [JTabbedPane.setTabCloseButtonsVisible] APIs.
 *
 * @param tabCloseCallback Callback for deciding on the tab close type on all tabs in this
 * tabbed pane.
 * @see JComponent.setTabComponentCloseCallback
 */
@RadianceComponentScope
public fun JTabbedPane.setTabCloseCallback(tabCloseCallback: TabCloseCallback) {
    RadianceLafCortex.ComponentScope.setTabCloseCallback(this, tabCloseCallback)
}

/**
 * Configures the callback for deciding on the tab close type on this tab
 * component. Note that this is only relevant for tabs configured with
 * [JComponent.setTabComponentCloseButtonVisible] and
 * [JTabbedPane.setTabCloseButtonsVisible] APIs.
 *
 * @param tabCloseCallback Callback for deciding on the tab close type on the tab component.
 * @see JTabbedPane.setTabCloseCallback
 */
@RadianceComponentScope
public fun JComponent.setTabComponentCloseCallback(tabCloseCallback: TabCloseCallback) {
    RadianceLafCortex.ComponentScope.setTabCloseCallback(this, tabCloseCallback)
}

/**
 * Specifies that only the close button of a marked-as-modified tab components should
 * pulsate. By default, the animation on modified tabs is on the entire tab rectangle. Note
 * that this is only relevant for tabs configured with
 * [JTabbedPane.setTabContentsModified].
 *
 * @param runModifiedAnimationOnTabCloseButton If `true`, the
 * marked-as-modified animation will run only
 * on the tab close button.
 * @see JComponent.setRunModifiedAnimationOnTabComponentCloseButton
 */
@RadianceComponentScope
public fun JTabbedPane.setRunModifiedAnimationOnTabCloseButton(
    runModifiedAnimationOnTabCloseButton: Boolean?
) {
    RadianceLafCortex.ComponentScope.setRunModifiedAnimationOnTabCloseButton(
        this, runModifiedAnimationOnTabCloseButton
    )
}

/**
 * Specifies that only the close button of a marked-as-modified tab component should
 * pulsate. By default, the animation on modified tabs is on the entire tab rectangle. Note
 * that this is only relevant for tabs configured with
 * [JComponent.setTabContentsModified].
 *
 * @param runModifiedAnimationOnTabCloseButton If `true`, the
 * marked-as-modified animation will run only
 * on the tab close button.
 * @see JTabbedPane.setRunModifiedAnimationOnTabCloseButton
 */
@RadianceComponentScope
public fun JComponent.setRunModifiedAnimationOnTabComponentCloseButton(
    runModifiedAnimationOnTabCloseButton: Boolean?
) {
    RadianceLafCortex.ComponentScope.setRunModifiedAnimationOnTabCloseButton(
        this, runModifiedAnimationOnTabCloseButton
    )
}

/**
 * Specifies the content pane border kind for this tabbed pane.
 *
 * @param tabContentPaneBorderKind Content pane border kind for this tabbed pane.
 */
@RadianceComponentScope
public fun JTabbedPane.setTabContentPaneBorderKind(
    tabContentPaneBorderKind: RadianceLafSlices.TabContentPaneBorderKind
) {
    RadianceLafCortex.ComponentScope.setTabContentPaneBorderKind(
        this,
        tabContentPaneBorderKind
    )
}

/**
 * Specifies the button shaper to be used for this component.
 *
 * @param buttonShaper Button shaper to be used for this component.
 */
@RadianceComponentScope
public fun JComponent.setButtonShaper(buttonShaper: RadianceButtonShaper) {
    RadianceLafCortex.ComponentScope.setButtonShaper(this, buttonShaper)
}

/**
 * Specifies the number of echo characters for each password character in this
 * password field.
 *
 * @param echoCount Number of echo characters for each password character in this
 * password field.
 */
@RadianceComponentScope
public fun JPasswordField.setNumberOfPasswordEchoesPerCharacter(echoCount: Int) {
    RadianceLafCortex.ComponentScope.setNumberOfPasswordEchoesPerCharacter(this, echoCount)
}

/**
 * Specifies the combobox popup prototype callback which is used to compute the width of the
 * popup at runtime.
 *
 * @param comboPopupPrototypeCallback Popup prototype callback which is used to compute
 * the width of the popup at runtime.
 * @see JComboBox.setComboBoxPrototypeDisplayValue
 */
@RadianceComponentScope
public fun JComboBox<*>.setComboBoxPrototypeCallback(
    comboPopupPrototypeCallback: ComboPopupPrototypeCallback<*>
) {
    RadianceLafCortex.ComponentScope.setComboBoxPrototypeCallback(this, comboPopupPrototypeCallback)
}

/**
 * Specifies the combobox popup prototype display value which is used to compute the width
 * of the popup at runtime.
 *
 * @param comboPopupPrototypeDisplayValue Popup prototype display value which is used to
 * compute the width of the popup at runtime.
 * @see JComboBox.setComboBoxPrototypeCallback
 */
@RadianceComponentScope
public fun JComboBox<*>.setComboBoxPrototypeDisplayValue(comboPopupPrototypeDisplayValue: Any) {
    RadianceLafCortex.ComponentScope.setComboBoxPrototypeDisplayValue(
        this, comboPopupPrototypeDisplayValue
    )
}

/**
 * Specifies the combobox popup flyout orientation. The value should be either
 * `null` to reset to the default flyout orientation or one of the
 * [Integer]s below:
 *
 *  * The default [SwingConstants.SOUTH] - the popup is displayed directly below the
 * combobox aligned to the left.
 *  * [SwingConstants.NORTH] - the popup is displayed directly above the combobox
 * aligned to the left.
 *  * [SwingConstants.EAST] - the popup is displayed to the left of the combobox
 * aligned to the top.
 *  * [SwingConstants.WEST] - the popup is displayed to the right of the combobox
 * aligned to the top.
 *  * [SwingConstants.CENTER] - the popup is displayed centered vertically over the
 * combobox aligned to the left.
 *
 * Note that the combo arrow changes in accordance with the combo popup flyout orientation.
 *
 * @param comboPopupFlyoutOrientation Flyout orientation for combobox popup.
 */
@RadianceComponentScope
public fun JComboBox<*>.setComboBoxPopupFlyoutOrientation(comboPopupFlyoutOrientation: Int?) {
    RadianceLafCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(
        this, comboPopupFlyoutOrientation
    )
}

/**
 * Specifies how icon on the specified control is themed.
 *
 * @param activeIconFilterStrategy Icon filter strategy for active states.
 * @param enabledIconFilterStrategy Icon filter strategy for enabled state.
 * @param disabledIconFilterStrategy Icon filter strategy for disabled states.
 */
@RadianceComponentScope
public fun JComponent.setIconFilterStrategies(
    activeIconFilterStrategy: RadianceLafSlices.IconFilterStrategy,
    enabledIconFilterStrategy: RadianceLafSlices.IconFilterStrategy,
    disabledIconFilterStrategy: RadianceLafSlices.IconFilterStrategy
) {
    RadianceLafCortex.ComponentScope.setIconFilterStrategies(
        this, activeIconFilterStrategy, enabledIconFilterStrategy, disabledIconFilterStrategy
    )
}

