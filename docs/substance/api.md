## Substance look and feel - API

The `SubstanceCortex` class in the `org.pushingpixels.substance.api` package is the only officially-supported entry point into configuring the behavior of Substance-powered UIs and for querying the state of such UIs. The API surface of this class is broken into a number of scopes, with every scope applying at the specific granularity level of control:

* **GlobalScope** - configuring and querying the global state of the application.
* **WindowScope** - configuring and querying state at the level of the application `Window`s.
* **RootPaneScope** - configuring and querying state at the level of the application `JRootPane`s.
* **ComponentScope** - configuring and querying state at the level of the application `Component`s.
* **ComponentOrParentScope** - configuring and querying state at the level of individual application `Component`s or all immediate child components of a container.
* **ComponentOrParentChainScope** - configuring and querying state at the level of individual application `Component`s or all nested child components of a container.

### GlobalScope

#### Working with skins

`public static Map<String, SkinInfo> getAllSkins()`

Returns all available skins.

`public static boolean setSkin(String skinClassName)`

Sets the specified skin.

`public static boolean setSkin(SubstanceSkin skin)`

Sets the specified skin.

`public static SubstanceSkin getCurrentSkin(Component c)`

Returns the current skin for the specified component.

`public static void registerSkinChangeListener(
SkinChangeListener skinChangeListener)`

Registers a new listener on skin change.

`public static void unregisterSkinChangeListener(
SkinChangeListener skinChangeListener)`

Unregisters a listener on skin change.

### Working with plugins and widgets

`public static void registerComponentPlugin(SubstanceComponentPlugin componentPlugin)`

Registers the specified component plugin that provides Substance-powered UI delegates for custom components.

`public static void registerSkinPlugin(SubstanceSkinPlugin skinPlugin)`

Registers the specified skin plugin.

`public static void registerWidget(String widgetClassName, Class<?> supportedClass, boolean isExact)`

Registers the specified widget class to be applicable to all components of the specified class.

`public static void setWidgetVisible(JRootPane rootPane, boolean visible, SubstanceWidgetType... substanceWidgets)`

Sets the visibility of the specified widget kind(s).

`public static void setExtraWidgetsPresence(Boolean extraWidgetsPresence)`

Specifies that extra UI elements (such as menu items in system menu or lock borders) should be shown.

`public static void setLockIconVisible(Boolean visible)`

Specifies global visibility of the lock icon on non-editable text components.

### Working with fonts

`public static FontPolicy getFontPolicy()`

Looks up and retrieves the font policy used by the Substance family.

`public static void setFontPolicy(FontPolicy fontPolicy)`

Sets the font policy to be used with Substance family.

### Working with tab closing

`public static void setTabCloseButtonsVisible(Boolean tabCloseButtonsVisible)`

Configures visibility of close buttons on tabbed pane tabs.

`public static void setTabCloseCallback(TabCloseCallback tabCloseCallback)`

Configures the callback for deciding on the tab close type on tabbed pane tabs.

`public static void setRunModifiedAnimationOnTabCloseButton(Boolean runModifiedAnimationOnTabCloseButton)`

Specifies that only the close button of a marked-as-modified tab component should pulsate.

`public static Set<BaseTabCloseListener> getAllTabCloseListeners()`

Returns the set of all listeners registered on tab-close events on all tabbed panes.

`public static Set<BaseTabCloseListener> getAllTabCloseListeners(
JTabbedPane tabbedPane)`

Returns all listeners registered on tab closing of the specified tabbed pane.

`public static void registerTabCloseChangeListener(
BaseTabCloseListener tabCloseListener)`

Registers the specified listener on tab-close events on all tabbed panes.

`public static void registerTabCloseChangeListener(JTabbedPane tabbedPane,
BaseTabCloseListener tabCloseListener)`

Registers the specified listener on tab-close events on the specified tabbed pane.

`public static void unregisterTabCloseChangeListener(
BaseTabCloseListener tabCloseListener)`

Unregisters the specified listener on tab-close events on all tabbed panes.

`public static void unregisterTabCloseChangeListener(JTabbedPane tabbedPane,
BaseTabCloseListener tabCloseListener)`

Unregisters the specified listener on tab-close events on the specified tabbed pane.

#### Working with animations

`public static void allowAnimations(AnimationFacet animationFacet)`

`public static void allowAnimations(AnimationFacet animationFacet, Class<?> clazz)`

`public static void allowAnimations(AnimationFacet animationFacet, Class<?>[] clazz)`

Allows animations of the specified facet on all controls / controls of specified class(es).

`public static void disallowAnimations(AnimationFacet animationFacet)`

`public static void disallowAnimations(AnimationFacet animationFacet, Class<?> clazz)`

`public static void disallowAnimations(AnimationFacet animationFacet, Class<?>[] clazz)`

Disallows animations of the specified facet on all controls / controls of specified class(es).

`public static boolean isAnimationAllowed(AnimationFacet animationFacet)`

Checks whether the specified animation facet is allowed.

`public static void setTimelineDuration(long timelineDuration)`

Configures the global timeline duration for all animations.

`public static long getTimelineDuration()`

Returns the global timeline duration used on all animations.

#### Working with strings

`public static ResourceBundle getLabelBundle()`

Returns the current label bundle.

`public static ResourceBundle getLabelBundle(Locale locale)`

Returns the label bundle for the specified locale.

`public static void resetLabelBundle()`

Resets the current label bundle.

`public static void setLabelBundleClassLoader(ClassLoader labelBundleClassLoader)`

Sets the class loader for retrieving label bundles.

`public static ClassLoader getLabelBundleClassLoader()`

Returns the class loader for retrieving label bundles.

`public static void registerLocaleChangeListener(LocaleChangeListener localeListener)`

Registers the specified listener on locale change.

`public static void unregisterLocaleChangeListener(LocaleChangeListener localeListener)`

Unregisters the specified listener on locale change.

`public static Set<LocaleChangeListener> getLocaleChangeListeners()`

Returns all listeners registered on locale change.

#### Working with icons

`public static void setIconPack(SubstanceIconPack iconPack)`

Sets the global icon pack to be used by Substance.

`public static SubstanceIconPack getIconPack()`

Retrieves the currently used global icon pack.

`public static void setUseConstantThemesOnOptionPanes(Boolean useConstantThemesOnOptionPanes)`

Sets the new setting for the icons of the `JOptionPane`s created with predefined message types

`public static void setUseThemedDefaultIcons(Boolean useThemedDefaultIcons)`

Specifies that icons on controls such as buttons, toggle buttons, labels, tabs and menu items should match the color of the current color scheme when they are in default state.

#### Working with button bars

`public static SubstanceSlices.ButtonOrder getButtonBarOrder()`

Returns the currently set button order for all containers that display grouped buttons, such as `JOptionPane`s, for example.

`public static void setButtonBarOrder(SubstanceSlices.ButtonOrder buttonBarButtonOrder)`

Sets the button order for all containers that display grouped buttons, such as `JOptionPane`s, for example.

`public static SubstanceSlices.HorizontalGravity getButtonBarGravity()`

Returns the currently set button bar gravity for all containers that display grouped buttons, such as `JOptionPane`s, for example.

`public static void setButtonBarGravity(SubstanceSlices.HorizontalGravity buttonBarGravity)`

Sets the button bar gravity for all containers that display grouped buttons, such as `JOptionPane`s, for example.

#### Working with title pane content

`public static void configureTitleContentGravity(SubstanceSlices.HorizontalGravity titleTextHorizontalGravity, SubstanceSlices.HorizontalGravity titleControlButtonGroupHorizontalGravity, SubstanceSlices.TitleIconHorizontalGravity titleIconHorizontalGravity)`

Configures title pane content gravity for all decorated application windows.

`public static SubstanceSlices.HorizontalGravity getTitleTextHorizontalGravity()`

Returns the gravity for the title text in title panes of all decorated application windows.

`public static SubstanceSlices.TitleIconHorizontalGravity getTitleIconHorizontalGravity()`

Returns the gravity for the icon in title panes of all decorated application windows.

#### Working with comboboxes

`public static void setComboBoxPrototypeCallback(ComboPopupPrototypeCallback comboPopupPrototypeCallback)`

Specifies the combobox popup prototype callback which is used to compute the width of the popups at runtime.

`public static void setComboBoxPrototypeDisplayValue(Object comboPopupPrototypeDisplayValue)`

Specifies the combobox popup prototype display value which is used to compute the width of the popups at runtime.

`public static void setComboBoxPopupFlyoutOrientation(int comboPopupFlyoutOrientation)`

Specifies the combobox popup flyout orientation.

#### Additional global APIs

`public static void setComponentPreviewPainter(PreviewPainter previewPainter)`

Specifies global preview painter to be used for showing preview thumbnails.

`public static void setSelectTextOnFocus(Boolean selectTextOnFocus)`

Specifies whether the contents of text components should be selected on focus gain.

`public static void setTextEditContextMenuPresence(Boolean hasEditContextMenu)`

Specifies whether text components should have the edit context menu (with Cut / Copy / Paste / ... menu items).

`public static void setAutomaticDragAndDropSupportPresence(Boolean hasAutomaticDragAndDropSupport)`

Specifies whether trees should have should have automatic drag and drop support.

`public static void setAutomaticScrollPresence(Boolean hasAutomaticScroll)`

Specifies whether scroll panes should have have auto-scroll support invoked on mouse button click that triggers popups.

`public static void setWatermarkVisible(Boolean watermarkVisible)`

Specifies that watermark should be painted on all components.

`public static void setButtonIgnoreMinimumSize(Boolean buttonIgnoreMinimumSize)`

Specifies whether buttons should ignore the default (minimum) dimension.

`public static void setButtonNeverPaintBackground(Boolean neverPaintButtonBackground)`

Specifies whether buttons should never paint backgrounds.

`public static void setFlatBackground(Boolean flatBackground)`

Specifies whether components should not paint backgrounds unless selected, armed, pressed or (possibly) hovered over.

`public static void setToolbarButtonCornerRadius(float toolbarButtonCornerRadius)`

Specifies corner radius for all toolbar buttons.

`public static void setColorizationFactor(double colorizationFactor)`

Specifies colorization amount applied to the background and foreground of the current color scheme and all controls.

`public static void setTabContentPaneBorderKind(TabContentPaneBorderKind tabContentPaneBorderKind)`

Specifies the content pane border kind for tabbed panes.

`public static void setNumberOfPasswordEchoesPerCharacter(int echoCount)`

Specifies the number of echo characters for each password character in password fields.

`public static void setMenuGutterFillKind(MenuGutterFillKind menuGutterFillKind)`

Specifies the menu gutter fill kind.

`public static void setTraceFilename(String traceFilename)`

Specifies the trace filename.

`public static void setHeapStatusTraceFilename(String heapStatusTraceFilename)`

Specifies the heap status trace filename.

`public static void setFocusKind(FocusKind focusKind)`

Specifies the kind of focus indication to be used on application components.

`public static BufferedImage getBlankImage(int width, int height)`

Returns high-DPI aware image of specified size.

`public static double getScaleFactor()`

Returns the global scale factor of the screen hardware that is showing the application UI.

### WindowScope

#### Working with title pane content

`public static void extendContentIntoTitlePane(Window window, SubstanceSlices.HorizontalGravity controlButtonGroupHorizontalGravity, SubstanceSlices.VerticalGravity controlButtonGroupVerticalGravity)`

Marks the specified window to have its content extend vertically into the title pane area.

`public static JButton createTitlePaneControlButton(Window window)`

Returns a new instance of a button that has consistent visuals and preferred size to be used in application content that is extended into the title pane area with `extendContentIntoTitlePane(Window)` API.

`public static Insets getTitlePaneControlInsets(Window window)`

Queries the insets that should be reserved for the main control buttons (close / maximize / minimize) in application content that is extended into the title pane area with `extendContentIntoTitlePane(Window)` API.

`public static void setPreferredTitlePaneHeight(Window window, int preferredTitlePaneHeight)`

Increase the preferred height of the title pane area in case the content you extend into that area with `extendContentIntoTitlePane(Window)` API is taller than the main control buttons.

`public static SubstanceSlices.HorizontalGravity getTitleControlButtonGroupHorizontalGravity(Window window)`

Returns the horizontal gravity for the control button group in the title pane of the specific window.

#### Working with widgets

`public static void setWidgetVisible(Window window, boolean visible, SubstanceWidgetType... substanceWidgets)`

Sets the visibility of the specified widget type(s).

### RootPaneScope

`public static void setSkin(JRootPane rootPane, SubstanceSkin skin)`

Specifies a skin to be used on the specific root pane.

`public static void setContentsModified(JRootPane rootPane, Boolean contentsModified)`

Specifies that contents of a root pane have been modified and not saved.

### ComponentScope

#### Working with skins

`public static SubstanceSkin getCurrentSkin(Component c)`

Returns the current skin for the specified component.

#### Working with tabs

`public static void setTabCloseButtonsVisible(JTabbedPane tabbedPane, Boolean tabCloseButtonsVisible)`

Configures visibility of close buttons on all tabs in the specified tabbed pane.

`public static void setTabCloseButtonVisible(JComponent tabComponent, Boolean tabCloseButtonVisible)`

Configures visibility of close button on the specified tab component.

`public static void setTabCloseCallback(JTabbedPane tabbedPane, TabCloseCallback tabCloseCallback)`

Configures the callback for deciding on the tab close type on all tabs in the specified tabbed pane.

`public static void setTabCloseCallback(JComponent tabComponent, TabCloseCallback tabCloseCallback)`

Configures the callback for deciding on the tab close type on the specified tab component.

`public static void registerTabCloseChangeListener(JTabbedPane tabbedPane, BaseTabCloseListener tabCloseListener)`

Registers the specified listener on tab-close events on the specified tabbed pane.

`public static void unregisterTabCloseChangeListener(JTabbedPane tabbedPane, BaseTabCloseListener tabCloseListener)`

Unregisters the specified listener on tab-close events on the specified tabbed pane.

`public static Set<BaseTabCloseListener> getAllTabCloseListeners(JTabbedPane tabbedPane)`

Returns all listeners registered on tab closing of the specified tabbed pane.

`public static void setTabContentsModified(JComponent tabComponent,  Boolean contentsModified)`

Specifies that contents of a tab component in `JTabbedPane` have been modified and not saved.

`public static void setRunModifiedAnimationOnTabCloseButton(JTabbedPane tabbedPane, Boolean runModifiedAnimationOnTabCloseButton)`

Specifies that only the close button of a marked-as-modified tab components should pulsate.

`public static void setRunModifiedAnimationOnTabCloseButton(JComponent tabComponent, Boolean runModifiedAnimationOnTabCloseButton)`

Specifies that only the close button of a marked-as-modified tab component should pulsate.

`public static void setTabContentPaneBorderKind(JTabbedPane tabbedPane, TabContentPaneBorderKind tabContentPaneBorderKind)`

Specifies the content pane border kind for the specified tabbed pane.

#### Working with animations

`public static void allowAnimations(Component comp, AnimationFacet animationFacet)`

Allows animations of the specified facet on the specified control.

`public static void disallowAnimations(Component comp, AnimationFacet animationFacet)`

Disallows animations of the specified facet on the specified control.

`public static boolean isAnimationAllowed(Component comp, AnimationFacet animationFacet)`

Checks whether the specified animation facet is allowed on the specified component.

#### Working with decoration areas

`public static DecorationAreaType getImmediateDecorationType(Component comp)`

Returns the immediate decoration area type of the specified component.

#### Working with buttons

`public static void setButtonOpenSide(JComponent comp, SubstanceSlices.Side openSide)`

Specifies the open side for the specific button component.

`public static void setButtonOpenSides(JComponent comp, Set<SubstanceSlices.Side> openSides)`

Specifies the open sides for the specific button component.

`public static void setButtonStraightSide(JComponent comp, SubstanceSlices.Side straightSide)`

Specifies the straight side for the specific button component.

`public static void setButtonStraightSides(JComponent comp, Set<SubstanceSlices.Side> straightSides)`

Specifies the straight sides for the specific button component.

`public static void setToolbarButtonCornerRadius(AbstractButton button, float toolbarButtonCornerRadius)`

Specifies corner radius for the specific button.

`public static void setButtonShaper(JComponent comp, SubstanceButtonShaper buttonShaper)`

Specifies the button shaper to be used for the specific component.

#### Working with comboboxes

`public static void setComboBoxPrototypeCallback(JComboBox comboBox, ComboPopupPrototypeCallback comboPopupPrototypeCallback)`

Specifies the combobox popup prototype callback which is used to compute the width of the popup at runtime.

`public static void setComboBoxPrototypeDisplayValue(JComboBox comboBox, Object comboPopupPrototypeDisplayValue)`

Specifies the combobox popup prototype display value which is used to compute the width of the popup at runtime.

`public static void setComboBoxPopupFlyoutOrientation(JComboBox comboBox, Integer comboPopupFlyoutOrientation)`

Specifies the combobox popup flyout orientation.

#### Additional component APIs

`public static void setLockIconVisible(JComponent comp, Boolean visible)`

Specifies component-level visibility of the lock icon on the specific component.

`public static void setPasswordStrengthChecker(JPasswordField passwordField, PasswordStrengthChecker passwordStrengthChecker)`

Specifies password strength checker for the specific password field.

`public static void setFlipTextSelectionOnEscape(JTextComponent comp, Boolean flipTextSelectionOnEscape)`

Specifies whether the text component contents should flip selection on ESCAPE key press.

`public static void setTextEditContextMenuPresence(JTextComponent comp, Boolean hasEditContextMenu)`

Specifies whether the text component should have the edit context menu (with Cut / Copy / Paste / ... menu items).

`public static void setAutomaticDragAndDropSupportPresence(JTree tree, Boolean hasAutomaticDragAndDropSupport)`

Specifies whether the tree should have automatic drag and drop support.

`public static void setAutomaticScrollPresence(JScrollPane scrollPane, Boolean hasAutomaticScroll)`

Specifies whether the scroll pane should have have auto-scroll support invoked on mouse button click that triggers popups.

`public static void setNumberOfPasswordEchoesPerCharacter(JPasswordField passwordField, int echoCount)`

Specifies the number of echo characters for each password character in the specific password field.

### ComponentOrParentScope

`public static void setComponentPreviewPainter(JComponent comp, PreviewPainter previewPainter)`

Specifies preview painter to be used for showing preview of the specific component or its immediate children.

`public static void setButtonIgnoreMinimumSize(JComponent comp, Boolean buttonIgnoreMinimumSize)`

Specifies whether the specific component or its immediate children should ignore the default (minimum) dimension for buttons.

`public static void setButtonNeverPaintBackground(JComponent comp, Boolean neverPaintButtonBackground)`

Specifies whether the specific component or its immediate children should never paint button backgrounds.

`public static void setFlatBackground(JComponent comp, Boolean flatBackground)`

Specifies whether the specific component or its immediate children should not paint backgrounds unless selected, armed, pressed or (possibly) hovered over.

### ComponentOrParentChainScope

`public static void setSelectTextOnFocus(JComponent comp, Boolean selectTextOnFocus)`

Specifies whether the contents of the specified text component or its nested children should be selected on focus gain.

`public static void setWatermarkVisible(JComponent comp, Boolean watermarkVisible)`

Specifies that watermark should be painted on the component and its nested children.

`public static void setToolbarButtonCornerRadius(JToolBar toolbar, float toolbarButtonCornerRadius)`

Specifies corner radius for all buttons in the specified toolbar.

`public static void setExtraWidgetsPresence(JComponent comp, Boolean extraWidgetsPresence)`

Specifies that extra UI elements (such as menu items in system menu or lock borders) should be shown in the specified component.

`public static void setColorizationFactor(JComponent comp, double colorizationFactor)`

Specifies colorization amount applied to the background and foreground of the current color scheme and the specific control.

`public static void setFocusKind(JComponent comp, FocusKind focusKind)`

Specifies the kind of focus indication to be used on the specified component and its nested children.

`public static void setDecorationType(JComponent comp, DecorationAreaType type)`

Sets the decoration type of the specified component and all its children.

`public static DecorationAreaType getDecorationType(Component comp)`

Returns the decoration area type of the specified component.
