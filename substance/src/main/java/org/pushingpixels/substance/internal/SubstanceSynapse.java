/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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
package org.pushingpixels.substance.internal;

import org.pushingpixels.substance.internal.widget.text.LockBorderWidget;

public class SubstanceSynapse {
    /**
     * Client property name for specifying that the {@link LockBorderWidget} should put a lock icon.
     */
    public final static String HAS_LOCK_ICON = "substancelaf.internal.widget.hasLockIcon";

    /**
     * Client property name for specifying the preview painter for a component.
     */
    public final static String COMPONENT_PREVIEW_PAINTER = "substancelaf.internal.widget.componentPreviewPainter";

    /**
     * Client property name for specifying password strength checker for a password field.
     */
    public final static String PASSWORD_STRENGTH_CHECKER = "substancelaf.internal.widget.passwordStrengthChecker";

    /**
     * Client property name for specifying that the text component contents should be selected on
     * focus gain.
     */
    public final static String TEXT_SELECT_ON_FOCUS = "substancelaf.internal.widget.textSelectAllOnFocus";

    /**
     * Client property name for specifying that the text component contents should flip selection on
     * ESCAPE key press.
     */
    public final static String TEXT_FLIP_SELECT_ON_ESCAPE = "substancelaf.internal.widget.textFlipSelectOnEscape";

    /**
     * Client property name for specifying that the text component should have the edit context menu
     * (with Cut / Copy / Paste / ... menu items).
     */
    public final static String TEXT_EDIT_CONTEXT_MENU = "substancelaf.internal.widget.textEditContextMenu";

    /**
     * Client property name for specifying that the tree component should have automatic drag and
     * drop support.
     */
    public final static String TREE_AUTO_DND_SUPPORT = "substancelaf.internal.widget.treeAutoDnDSupport";

    /**
     * Client property name for specifying that a scroll pane should have auto-scroll support
     * invoked on mouse button click that triggers popups.
     */
    public final static String AUTO_SCROLL = "substancelaf.internal.widget.autoScroll";

    /**
     * Client property name for requesting that watermark should be painted on the component and its
     * descendants.
     */
    public static final String WATERMARK_VISIBLE = "substancelaf.internal.watermarkVisible";

    /**
     * Client property name for ignoring the default (minimum) dimension for a single button.
     */
    public static final String BUTTON_NO_MIN_SIZE = "substancelaf.internal.buttonNoMinSize";

    /**
     * Client property name for specifying that a single button / all application buttons should not
     * paint the background.
     */
    public static final String BUTTON_NEVER_PAINT_BACKGROUND = "substancelaf.internal.buttonNeverPaintBackground";

    /**
     * Client property name for specifying that the component should be painted flat (no background
     * / border) when it's inactive.
     */
    public static final String FLAT_LOOK = "substancelaf.internal.FlatLook";

    /**
     * Client property name for specifying a straight side for a single button.
     */
    public static final String BUTTON_STRAIGHT_SIDE = "substancelaf.internal.buttonStraightSide";

    /**
     * Client property name for specifying an open side for a single button.
     */
    public static final String BUTTON_OPEN_SIDE = "substancelaf.internal.buttonOpenSide";

    /**
     * Client property name for specifying the corner radius for buttons.
     */
    public static final String TOOLBAR_BUTTON_CORNER_RADIUS = "substancelaf.internal.toolbarButtonCornerRadius";

    /**
     * Client property name for specifying a skin to be used on the specific root pane.
     */
    public static final String ROOT_PANE_SKIN = "substancelaf.internal.rootPaneSkin";

    /**
     * Client property name for specifying that extra UI elements (such as menu items in system menu
     * or lock borders) should be shown.
     */
    public final static String SHOW_EXTRA_WIDGETS = "substancelaf.internal.showExtraWidgets";

    /**
     * Client property name for specifying the colorization amount applied to the background and
     * foreground of the current color scheme and the application controls.
     */
    public final static String COLORIZATION_FACTOR = "substancelaf.internal.colorizationFactor";

    /**
     * Client property name for specifying that icons on <code>JOptionPane</code>s created with
     * predefined message types will use constant color schemes for the icons.
     */
    public final static String USE_THEMED_ICONS_ON_OPTION_PANES = "substancelaf.internal.useThemedIconsOnOptionPanes";

    /**
     * Client property name for specifying that icons on controls such as buttons, toggle buttons,
     * labels, tabs and menu items should match the color of the current color scheme when they are
     * in default state.
     */
    public final static String USE_THEMED_DEFAULT_ICONS = "substancelaf.internal.useThemedDefaultIcons";

    /**
     * Client property name for specifying that contents of a frame, dialog, internal frame, desktop
     * icon or tab have been modified and not saved.
     */
    public final static String CONTENTS_MODIFIED = "substancelaf.internal.contentsModified";

    /**
     * Client property name for adding close buttons on tabs.
     */
    public final static String TABBED_PANE_CLOSE_BUTTONS = "substancelaf.internal.tabbedPaneHasCloseButtons";

    /**
     * Client property name for specifying that only the close button of a marked-as-modified tab
     * component should pulsate.
     */
    public final static String TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION = "substancelaf.internal.tabbedPaneCloseButtonsModifiedAnimation";

    /**
     * Client property name for specifying the callback for deciding on the tab close type.
     */
    public final static String TABBED_PANE_CLOSE_CALLBACK = "substancelaf.internal.tabbedPaneCloseCallback";

    /**
     * Client property name for specifying the content pane border kind.
     */
    public final static String TABBED_PANE_CONTENT_BORDER_KIND = "substancelaf.internal.tabbedPaneContentBorderKind";

    /**
     * Client property name for specifying the number of echo characters for each password
     * character.
     */
    public final static String PASSWORD_ECHO_PER_CHAR = "substancelaf.internal.passwordEchoPerChar";

    /**
     * Client property name for specifying outline shaper.
     */
    public static final String BUTTON_SHAPER = "substancelaf.internal.buttonShaper";

    /**
     * Client property name for specifying menu gutter fill kind.
     */
    public final static String MENU_GUTTER_FILL_KIND = "substancelaf.internal.menuGutterFillKind";

    /**
     * Client property name for specifying the trace file.
     */
    public final static String TRACE_FILE = "substancelaf.internal.traceFile";

    /**
     * Client property name for specifying the heap status trace file.
     */
    public static final String HEAP_STATUS_TRACE_FILE = "substancelaf.internal.heapStatusTraceFile";

    /**
     * Client property name for specifying the kind of focus indication.
     */
    public final static String FOCUS_KIND = "substancelaf.internal.focusKind";

    /**
     * Client property name for specifying combo popup flyout orientation.
     */
    public final static String COMBO_BOX_POPUP_FLYOUT_ORIENTATION = "substancelaf.internal.comboBoxPopupFlyoutOrientation";

    /**
     * Client property name for specifying the combobox popup prototype callback which is used to
     * compute the width of the popup at runtime.
     */
    public final static String COMBOBOX_POPUP_PROTOTYPE_CALLBACK = "substancelaf.internal.comboPopupPrototype";

    /**
     * Client property name for specifying the combobox popup prototype object which is used to
     * compute the width of the popup at runtime.
     */
    public final static String COMBOBOX_POPUP_PROTOTYPE_OBJECT = "substancelaf.internal.comboPopupPrototype";

    /**
     * Client property name for specifying that the content of the root pane extends into the title
     * pane area.
     */
    public final static String ROOT_PANE_CONTENTS_EXTENDS_INTO_TITLE_PANE = "substancelaf.internal.rootPaneContentExtendsIntoTitlePane";

    /**
     * Client property name for specifying the preferred height of the title pane.
     */
    public final static String ROOT_PANE_PREFERRED_TITLE_PANE_HEIGHT = "substancelaf.internal.rootPanePreferredTitlePaneHeight";
    
    /**
     * Client property name for specifying the horizontal gravity of the button bar content. 
     */
    public final static String BUTTON_BAR_GRAVITY = "substancelaf.internal.buttonBarGravity";

    /**
     * Client property name for specifying the horizontal gravity of the title pane text.
     */
    public final static String TITLE_TEXT_HORIZONTAL_GRAVITY = "substancelaf.internal.titleTextHorizontalGravity";

    /**
     * Client property name for specifying the horizontal gravity of the title pane control button group.
     */
    public final static String TITLE_CONTROL_BUTTON_GROUP_HORIZONTAL_GRAVITY = "substancelaf.internal.titleControlButtonGroupHorizontalGravity";

    /**
     * Client property name for specifying the horizontal gravity of the title pane control button group.
     */
    public final static String TITLE_CONTROL_BUTTON_GROUP_VERTICAL_GRAVITY = "substancelaf.internal.titleControlButtonGroupVerticalGravity";

    /**
     * Client property name for specifying the horizontal gravity of the title pane icon.
     */
    public final static String TITLE_ICON_HORIZONTAL_GRAVITY = "substancelaf.internal.titleIconHorizontalGravity";
}
