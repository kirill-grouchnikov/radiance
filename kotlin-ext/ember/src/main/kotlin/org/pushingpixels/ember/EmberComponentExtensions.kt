/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.ember

import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.SubstanceSkin
import org.pushingpixels.substance.api.SubstanceSlices
import org.pushingpixels.substance.api.combo.ComboPopupPrototypeCallback
import org.pushingpixels.substance.api.password.PasswordStrengthChecker
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper
import org.pushingpixels.substance.api.shaper.StandardButtonShaper
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper
import org.pushingpixels.substance.api.tabbed.BaseTabCloseListener
import org.pushingpixels.substance.api.tabbed.TabCloseCallback
import java.awt.Component
import javax.swing.*
import javax.swing.text.JTextComponent

/**
 * Returns the current skin for the this component. If the current look-and-feel is not
 * Substance, this method returns `null`.
 *
 * @return Current skin for the specified component.
 */
@EmberComponentScope
fun Component.getCurrentSkin(): SubstanceSkin? {
    return SubstanceCortex.ComponentScope.getCurrentSkin(this)
}

/**
 * Registers the specified listener on tab-close events on this tabbed pane.
 *
 * @param tabCloseListener Listener to register.
 * @see JTabbedPane.unregisterTabCloseChangeListener
 * @see JTabbedPane.getAllTabCloseListeners
 */
@EmberComponentScope
fun JTabbedPane.registerTabCloseChangeListener(tabCloseListener: BaseTabCloseListener) {
    SubstanceCortex.ComponentScope.registerTabCloseChangeListener(this, tabCloseListener)
}

/**
 * Unregisters the specified listener on tab-close events on this tabbed pane.
 *
 * @param tabCloseListener Listener to unregister.
 * @see JTabbedPane.registerTabCloseChangeListener
 * @see JTabbedPane.getAllTabCloseListeners
 */
@EmberComponentScope
fun JTabbedPane.unregisterTabCloseChangeListener(tabCloseListener: BaseTabCloseListener) {
    SubstanceCortex.ComponentScope.unregisterTabCloseChangeListener(this, tabCloseListener)
}

/**
 * Returns all listeners registered on tab closing of this tabbed pane.
 *
 * @return All listeners registered on tab closing of this tabbed pane.
 * @see JTabbedPane.registerTabCloseChangeListener
 * @see JTabbedPane.unregisterTabCloseChangeListener
 */
@EmberComponentScope
fun JTabbedPane.getAllTabCloseListeners(): Set<BaseTabCloseListener> {
    return SubstanceCortex.ComponentScope.getAllTabCloseListeners(this)
}

/**
 * Allows animations of the specified facet on this control.
 *
 * @param animationFacet Animation facet to allow.
 * @see Component.disallowAnimations
 * @see Component.isAnimationAllowed
 */
@EmberComponentScope
fun Component.allowAnimations(animationFacet: SubstanceSlices.AnimationFacet) {
    SubstanceCortex.ComponentScope.allowAnimations(this, animationFacet)
}

/**
 * Disallows animations of the specified facet on this control.
 *
 * @param animationFacet Animation facet to disallow.
 * @see Component.allowAnimations
 * @see Component.isAnimationAllowed
 */
@EmberComponentScope
fun Component.disallowAnimations(animationFacet: SubstanceSlices.AnimationFacet) {
    SubstanceCortex.ComponentScope.disallowAnimations(this, animationFacet)
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
@EmberComponentScope
fun Component.isAnimationAllowed(animationFacet: SubstanceSlices.AnimationFacet): Boolean {
    return SubstanceCortex.ComponentScope.isAnimationAllowed(this, animationFacet)
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
@EmberComponentScope
fun Component.getImmediateDecorationType(): SubstanceSlices.DecorationAreaType? {
    return SubstanceCortex.ComponentScope.getImmediateDecorationType(this)
}

/**
 * Specifies component-level visibility of the lock icon on this component.
 *
 * @param visible If `true`, this component will show a lock icon
 * when it is in non-editable mode. Pass `null` to reset to the default
 * behavior.
 */
@EmberComponentScope
fun JComponent.setLockIconVisible(visible: Boolean?) {
    SubstanceCortex.ComponentScope.setLockIconVisible(this, visible)
}

/**
 * Specifies component-level visibility of the caps lock indicator on this password field.
 *
 * @param visible If `true`, this password field will show an indicator icon
 * when it is focused and caps lock is on. Pass `null` to reset to the default
 * behavior.
 */
@EmberComponentScope
fun JPasswordField.setCapsLockIconVisible(visible: Boolean?) {
    SubstanceCortex.ComponentScope.setCapsLockIconVisible(this, visible)
}

/**
 * Specifies password strength checker for this password field.
 *
 * @param passwordStrengthChecker Password strength checker
 */
@EmberComponentScope
fun JPasswordField.setPasswordStrengthChecker(passwordStrengthChecker: PasswordStrengthChecker) {
    SubstanceCortex.ComponentScope.setPasswordStrengthChecker(this, passwordStrengthChecker)
}

/**
 * Specifies whether this text component contents should flip selection on ESCAPE key press.
 *
 * @param flipTextSelectionOnEscape If `true`, the contents of the specified
 * text component will flip selection on ESCAPE key press. Pass `null`
 * to reset to the default behavior.
 */
@EmberComponentScope
fun JTextComponent.setFlipTextSelectionOnEscape(flipTextSelectionOnEscape: Boolean?) {
    SubstanceCortex.ComponentScope.setFlipTextSelectionOnEscape(this, flipTextSelectionOnEscape)
}

/**
 * Specifies whether this text component should have the edit context menu (with Cut / Copy /
 * Paste / ... menu items).
 *
 * @param hasEditContextMenu If `true`, the text component will have the edit
 * context menu (with Cut / Copy / Paste / ... menu items). Pass `null`
 * to reset to the default behavior.
 */
@EmberComponentScope
fun JTextComponent.setTextEditContextMenuPresence(hasEditContextMenu: Boolean?) {
    SubstanceCortex.ComponentScope.setTextEditContextMenuPresence(this, hasEditContextMenu)
}

/**
 * Specifies whether this tree should have automatic drag and drop support.
 *
 * @param hasAutomaticDragAndDropSupport If `true`, this tree will have
 * automatic drag and drop support. Pass `null` to reset to the default behavior.
 */
@EmberComponentScope
fun JTree.setAutomaticDragAndDropSupportPresence(hasAutomaticDragAndDropSupport: Boolean?) {
    SubstanceCortex.ComponentScope.setAutomaticDragAndDropSupportPresence(
            this, hasAutomaticDragAndDropSupport)
}

/**
 * Specifies whether this scroll pane should have have auto-scroll support invoked on mouse
 * button click that triggers popups.
 *
 * @param hasAutomaticScroll If `true`, this scroll pane will have have
 * auto-scroll support invoked on mouse button click that triggers popups. Pass
 * `null` to reset to the default behavior.
 */
@EmberComponentScope
fun JScrollPane.setAutomaticScrollPresence(hasAutomaticScroll: Boolean?) {
    SubstanceCortex.ComponentScope.setAutomaticScrollPresence(this, hasAutomaticScroll)
}

/**
 * Specifies the open side for this component. Note that the
 * [SubstanceButtonShaper] implementations are not required to respect this call. The
 * default [StandardButtonShaper] and [ClassicButtonShaper] respect this call.
 *
 * @param openSide Open side.
 * @see JComponent.setButtonOpenSides
 * @see JComponent.setButtonStraightSide
 */
@EmberComponentScope
fun JComponent.setButtonOpenSide(openSide: SubstanceSlices.Side) {
    SubstanceCortex.ComponentScope.setButtonOpenSide(this, openSide)
}

/**
 * Specifies the open sides for this component. Note that the
 * [SubstanceButtonShaper] implementations are not required to respect this call. The
 * default [StandardButtonShaper] and [ClassicButtonShaper] respect this call.
 *
 * @param openSides Open sides.
 * @see JComponent.setButtonOpenSide
 * @see JComponent.setButtonStraightSides
 */
@EmberComponentScope
fun JComponent.setButtonOpenSides(openSides: Set<SubstanceSlices.Side>) {
    SubstanceCortex.ComponentScope.setButtonOpenSides(this, openSides)
}

/**
 * Specifies the straight side for this component. Note that the
 * [SubstanceButtonShaper] implementations are not required to respect this call. The
 * default [StandardButtonShaper] and [ClassicButtonShaper] respect this call.
 *
 * @param straightSide Straight side.
 * @see JComponent.setButtonOpenSide
 * @see JComponent.setButtonStraightSides
 */
@EmberComponentScope
fun JComponent.setButtonStraightSide(straightSide: SubstanceSlices.Side) {
    SubstanceCortex.ComponentScope.setButtonStraightSide(this, straightSide)
}

/**
 * Specifies the straight sides for this component. Note that the
 * [SubstanceButtonShaper] implementations are not required to respect this call. The
 * default [StandardButtonShaper] and [ClassicButtonShaper] respect this call.
 *
 * @param straightSides Straight sides.
 * @see JComponent.setButtonStraightSide
 * @see JComponent.setButtonOpenSides
 */
@EmberComponentScope
fun JComponent.setButtonStraightSides(straightSides: Set<SubstanceSlices.Side>) {
    SubstanceCortex.ComponentScope.setButtonStraightSides(this, straightSides)
}

/**
 * Specifies corner radius for this button. Note that this only applies when the
 * button is in a [JToolBar].
 *
 * @param toolbarButtonCornerRadius Corner radius for the button when it is in a
 * [JToolBar].
 * @see JToolBar.setToolbarButtonCornerRadius
 */
@EmberComponentScope
fun AbstractButton.setToolbarButtonCornerRadius(toolbarButtonCornerRadius: Float) {
    SubstanceCortex.ComponentScope.setToolbarButtonCornerRadius(this, toolbarButtonCornerRadius)
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
@EmberComponentScope
fun JComponent.setTabContentsModified(contentsModified: Boolean?) {
    SubstanceCortex.ComponentScope.setTabContentsModified(this, contentsModified)
}

/**
 * Configures visibility of close buttons on all tabs in this tabbed pane.
 *
 * @param tabCloseButtonsVisible If `true`, all tabs in this tabbed pane will
 * show close buttons.
 * @see JComponent.setTabComponentCloseButtonVisible
 */
@EmberComponentScope
fun JTabbedPane.setTabCloseButtonsVisible(tabCloseButtonsVisible: Boolean?) {
    SubstanceCortex.ComponentScope.setTabCloseButtonsVisible(this, tabCloseButtonsVisible)
}

/**
 * Configures visibility of close button on the specified tab component.
 *
 * @param tabCloseButtonVisible If `true`, the tab will show close button.
 * @see JTabbedPane.setTabCloseButtonsVisible
 */
@EmberComponentScope
fun JComponent.setTabComponentCloseButtonVisible(tabCloseButtonVisible: Boolean?) {
    SubstanceCortex.ComponentScope.setTabCloseButtonVisible(this, tabCloseButtonVisible)
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
@EmberComponentScope
fun JTabbedPane.setTabCloseCallback(tabCloseCallback: TabCloseCallback) {
    SubstanceCortex.ComponentScope.setTabCloseCallback(this, tabCloseCallback)
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
@EmberComponentScope
fun JComponent.setTabComponentCloseCallback(tabCloseCallback: TabCloseCallback) {
    SubstanceCortex.ComponentScope.setTabCloseCallback(this, tabCloseCallback)
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
@EmberComponentScope
fun JTabbedPane.setRunModifiedAnimationOnTabCloseButton(
        runModifiedAnimationOnTabCloseButton: Boolean?) {
    SubstanceCortex.ComponentScope.setRunModifiedAnimationOnTabCloseButton(
            this, runModifiedAnimationOnTabCloseButton)
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
@EmberComponentScope
fun JComponent.setRunModifiedAnimationOnTabComponentCloseButton(
        runModifiedAnimationOnTabCloseButton: Boolean?) {
    SubstanceCortex.ComponentScope.setRunModifiedAnimationOnTabCloseButton(
            this, runModifiedAnimationOnTabCloseButton)
}

/**
 * Specifies the content pane border kind for this tabbed pane.
 *
 * @param tabContentPaneBorderKind Content pane border kind for this tabbed pane.
 */
@EmberComponentScope
fun JTabbedPane.setTabContentPaneBorderKind(
        tabContentPaneBorderKind: SubstanceSlices.TabContentPaneBorderKind) {
    SubstanceCortex.ComponentScope.setTabContentPaneBorderKind(this,
            tabContentPaneBorderKind)
}

/**
 * Specifies the button shaper to be used for this component.
 *
 * @param buttonShaper Button shaper to be used for this component.
 */
@EmberComponentScope
fun JComponent.setButtonShaper(buttonShaper: SubstanceButtonShaper) {
    SubstanceCortex.ComponentScope.setButtonShaper(this, buttonShaper)
}

/**
 * Specifies the number of echo characters for each password character in this
 * password field.
 *
 * @param echoCount Number of echo characters for each password character in this
 * password field.
 */
@EmberComponentScope
fun JPasswordField.setNumberOfPasswordEchoesPerCharacter(echoCount: Int) {
    SubstanceCortex.ComponentScope.setNumberOfPasswordEchoesPerCharacter(this, echoCount)
}

/**
 * Specifies the combobox popup prototype callback which is used to compute the width of the
 * popup at runtime.
 *
 * @param comboPopupPrototypeCallback Popup prototype callback which is used to compute
 * the width of the popup at runtime.
 * @see JComboBox.setComboBoxPrototypeDisplayValue
 */
@EmberComponentScope
fun JComboBox<*>.setComboBoxPrototypeCallback(
        comboPopupPrototypeCallback: ComboPopupPrototypeCallback<*>) {
    SubstanceCortex.ComponentScope.setComboBoxPrototypeCallback(this, comboPopupPrototypeCallback)
}

/**
 * Specifies the combobox popup prototype display value which is used to compute the width
 * of the popup at runtime.
 *
 * @param comboPopupPrototypeDisplayValue Popup prototype display value which is used to
 * compute the width of the popup at runtime.
 * @see JComboBox.setComboBoxPrototypeCallback
 */
@EmberComponentScope
fun JComboBox<*>.setComboBoxPrototypeDisplayValue(comboPopupPrototypeDisplayValue: Any) {
    SubstanceCortex.ComponentScope.setComboBoxPrototypeDisplayValue(
            this, comboPopupPrototypeDisplayValue)
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
@EmberComponentScope
fun JComboBox<*>.setComboBoxPopupFlyoutOrientation(comboPopupFlyoutOrientation: Int?) {
    SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(
            this, comboPopupFlyoutOrientation)
}
