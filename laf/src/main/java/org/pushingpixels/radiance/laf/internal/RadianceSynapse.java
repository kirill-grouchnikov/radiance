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
package org.pushingpixels.radiance.laf.internal;

import org.pushingpixels.radiance.laf.internal.widget.text.CapsLockPasswordBorderWidget;
import org.pushingpixels.radiance.laf.internal.widget.text.LockBorderWidget;

public class RadianceSynapse {
    /**
     * Client property name for specifying that the {@link LockBorderWidget} should put the lock icon.
     */
    public final static String HAS_LOCK_ICON = "radiance.laf.internal.widget.hasLockIcon";

    /**
     * Client property name for specifying that the {@link CapsLockPasswordBorderWidget} should put the caps lock icon.
     */
    public final static String HAS_CAPS_LOCK_ICON = "radiance.laf.internal.widget.hasCapsLockIcon";

    /**
     * Client property name for specifying the preview painter for a component.
     */
    public final static String COMPONENT_PREVIEW_PAINTER = "radiance.laf.internal.widget.componentPreviewPainter";

    /**
     * Client property name for specifying password strength checker for a password field.
     */
    public final static String PASSWORD_STRENGTH_CHECKER = "radiance.laf.internal.widget.passwordStrengthChecker";

    /**
     * Client property name for specifying that the text component contents should be selected on
     * focus gain.
     */
    public final static String TEXT_SELECT_ON_FOCUS = "radiance.laf.internal.widget.textSelectAllOnFocus";

    /**
     * Client property name for specifying that the text component contents should flip selection on
     * ESCAPE key press.
     */
    public final static String TEXT_FLIP_SELECT_ON_ESCAPE = "radiance.laf.internal.widget.textFlipSelectOnEscape";

    /**
     * Client property name for specifying that the text component should have the edit context menu
     * (with Cut / Copy / Paste / ... menu items).
     */
    public final static String TEXT_EDIT_CONTEXT_MENU = "radiance.laf.internal.widget.textEditContextMenu";

    /**
     * Client property name for specifying that the tree component should have automatic drag and
     * drop support.
     */
    public final static String TREE_AUTO_DND_SUPPORT = "radiance.laf.internal.widget.treeAutoDnDSupport";

    /**
     * Client property name for specifying that a scroll pane should have auto-scroll support
     * invoked on mouse button click that triggers popups.
     */
    public final static String AUTO_SCROLL = "radiance.laf.internal.widget.autoScroll";

    /**
     * Client property name for ignoring the default (minimum) dimension for a single button.
     */
    public static final String BUTTON_NO_MIN_SIZE = "radiance.laf.internal.buttonNoMinSize";

    /**
     * Client property name for specifying a straight side for a single button.
     */
    public static final String BUTTON_STRAIGHT_SIDE = "radiance.laf.internal.buttonStraightSide";

    /**
     * Client property name for specifying an open side for a single button.
     */
    public static final String BUTTON_OPEN_SIDE = "radiance.laf.internal.buttonOpenSide";

    /**
     * Client property name for specifying the corner radius for buttons.
     */
    public static final String TOOLBAR_BUTTON_CORNER_RADIUS = "radiance.laf.internal.toolbarButtonCornerRadius";

    /**
     * Client property name for specifying a skin to be used on the specific root pane.
     */
    public static final String ROOT_PANE_SKIN = "radiance.laf.internal.rootPaneSkin";

    /**
     * Client property name for specifying that extra UI elements (such as menu items in system menu
     * or lock borders) should be shown.
     */
    public final static String SHOW_EXTRA_WIDGETS = "radiance.laf.internal.showExtraWidgets";

    /**
     * Client property name for specifying the colorization amount applied to the background and
     * foreground of the current color scheme and the application controls.
     */
    public final static String COLORIZATION_FACTOR = "radiance.laf.internal.colorizationFactor";

    /**
     * Client property name for specifying that icons on <code>JOptionPane</code>s created with
     * predefined message types will use constant color schemes for the icons.
     */
    public final static String USE_THEMED_ICONS_ON_OPTION_PANES = "radiance.laf.internal.useThemedIconsOnOptionPanes";

    /**
     * Client property name for specifying how icons in active states are filtered.
     */
    public final static String ICON_FILTER_STRATEGY_ACTIVE = "radiance.laf.internal.iconFilterStrategyActive";

    /**
     * Client property name for specifying how icons in the enabled state are filtered.
     */
    public final static String ICON_FILTER_STRATEGY_ENABLED = "radiance.laf.internal.iconFilterStrategyEnabled";

    /**
     * Client property name for specifying how icons in disabled states are filtered.
     */
    public final static String ICON_FILTER_STRATEGY_DISABLED = "radiance.laf.internal.iconFilterStrategyDisabled";

    /**
     * Client property name for specifying when control background should be painted.
     */
    public final static String BACKGROUND_APPEARANCE_STRATEGY = "radiance.laf.internal.backgroundAppearanceStrategy";

    /**
     * Client property name for specifying that contents of a frame, dialog, internal frame, desktop
     * icon or tab have been modified and not saved.
     */
    public final static String CONTENTS_MODIFIED = "radiance.laf.internal.contentsModified";

    /**
     * Client property name for adding close buttons on tabs.
     */
    public final static String TABBED_PANE_CLOSE_BUTTONS = "radiance.laf.internal.tabbedPaneHasCloseButtons";

    /**
     * Client property name for specifying that only the close button of a marked-as-modified tab
     * component should pulsate.
     */
    public final static String TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION = "radiance.laf.internal.tabbedPaneCloseButtonsModifiedAnimation";

    /**
     * Client property name for specifying the callback for deciding on the tab close type.
     */
    public final static String TABBED_PANE_CLOSE_CALLBACK = "radiance.laf.internal.tabbedPaneCloseCallback";

    /**
     * Client property name for specifying the content pane border kind.
     */
    public final static String TABBED_PANE_CONTENT_BORDER_KIND = "radiance.laf.internal.tabbedPaneContentBorderKind";

    /**
     * Client property name for specifying the number of echo characters for each password
     * character.
     */
    public final static String PASSWORD_ECHO_PER_CHAR = "radiance.laf.internal.passwordEchoPerChar";

    /**
     * Client property name for specifying outline shaper.
     */
    public static final String BUTTON_SHAPER = "radiance.laf.internal.buttonShaper";

    /**
     * Client property name for specifying menu gutter fill alpha.
     */
    public final static String MENU_GUTTER_FILL_ALPHA = "radiance.laf.internal.menuGutterFillAlpha";

    /**
     * Client property name for specifying the trace file.
     */
    public final static String TRACE_FILE = "radiance.laf.internal.traceFile";

    /**
     * Client property name for specifying the kind of focus indication.
     */
    public final static String FOCUS_KIND = "radiance.laf.internal.focusKind";

    /**
     * Client property name for specifying combo popup flyout orientation.
     */
    public final static String COMBO_BOX_POPUP_FLYOUT_ORIENTATION = "radiance.laf.internal.comboBoxPopupFlyoutOrientation";

    /**
     * Client property name for specifying the combobox popup prototype callback which is used to
     * compute the width of the popup at runtime.
     */
    public final static String COMBOBOX_POPUP_PROTOTYPE_CALLBACK = "radiance.laf.internal.comboPopupPrototype";

    /**
     * Client property name for specifying the combobox popup prototype object which is used to
     * compute the width of the popup at runtime.
     */
    public final static String COMBOBOX_POPUP_PROTOTYPE_OBJECT = "radiance.laf.internal.comboPopupPrototype";

    /**
     * Client property name for specifying that the content of the root pane extends into the title
     * pane area.
     */
    public final static String ROOT_PANE_CONTENTS_EXTENDS_INTO_TITLE_PANE = "radiance.laf.internal.rootPaneContentExtendsIntoTitlePane";

    /**
     * Client property name for specifying the preferred height of the title pane.
     */
    public final static String ROOT_PANE_PREFERRED_TITLE_PANE_HEIGHT = "radiance.laf.internal.rootPanePreferredTitlePaneHeight";

    /**
     * Client property name for specifying that a label should be painted as title pane text.
     */
    public final static String IS_TITLE_PANE_LABEL = "radiance.laf.internal.isTitlePaneLabel";

    /**
     * Client property name for specifying the horizontal gravity of the title pane text.
     */
    public final static String TITLE_TEXT_HORIZONTAL_GRAVITY = "radiance.laf.internal.titleTextHorizontalGravity";

    /**
     * Client property name for specifying the horizontal gravity of the title pane control button group.
     */
    public final static String TITLE_CONTROL_BUTTON_GROUP_HORIZONTAL_GRAVITY = "radiance.laf.internal.titleControlButtonGroupHorizontalGravity";

    /**
     * Client property name for specifying the horizontal gravity of the title pane control button group.
     */
    public final static String TITLE_CONTROL_BUTTON_GROUP_VERTICAL_GRAVITY = "radiance.laf.internal.titleControlButtonGroupVerticalGravity";

    /**
     * Client property name for specifying the horizontal gravity of the title pane icon.
     */
    public final static String TITLE_ICON_HORIZONTAL_GRAVITY = "radiance.laf.internal.titleIconHorizontalGravity";

    /**
     * Client property name for specifying the horizontal gravity of the title pane icon.
     */
    public final static String USE_DEFAULT_COLOR_CHOOSER = "radiance.laf.internal.useDefaultColorChooser";
}
