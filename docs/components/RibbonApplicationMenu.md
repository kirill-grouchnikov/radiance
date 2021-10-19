## Flamingo - ribbon application menu

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/ribbon-appmenu-expanded.png" width="1181" border=0/>

Ribbon application menu is the optional part of the ribbon that hosts projected commands that are "global". For example, "Paste" command has local context - it operates on the specific current selection in the main content, be it text editor or a graphical editor. But "Save" operated at the global context - saving the entire document no matter which part of it is being viewed or edited.

### Application menu structure

When the application menu button is activated (with mouse or via [keytip traversal](RibbonKeytips.md)), it shows the primary level of application menu content:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/appmenu/app-menu-initial.png" width="1119" border=0/>

Activating one of these primary entries (with mouse rollover or keytip travesal) shows the matching secondary level commands:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/appmenu/app-menu-secondary-medium.png" width="1119" border=0/>

Secondary level commands can have different presentation states (size and internal layout) for different primary commands:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/appmenu/app-menu-secondary-large.png" width="1119" border=0/>

If there is not enough vertical space to show all secondary command projections, vertical scrolling kicks in:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/appmenu/app-menu-secondary-scrollable.png" width="1119" border=0/>

If your application menu hierarchy requires more than two levels of cascading commands, the rest of those levels will be shown as regular popup content:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/appmenu/app-menu-secondary-cascade-popup.png" width="1119" border=0/>

### Creating application menu

To set application menu content, use the `JRibbon.setApplicationMenuCommand(RibbonApplicationMenuCommandButtonProjection)` API.

This is how you work with this API:

```java
RibbonApplicationMenuCommandButtonProjection ribbonMenuCommandProjection =
        new RibbonApplicationMenuCommandButtonProjection(
                Command.builder()
                        .setText(resourceBundle.getString("AppMenu.title"))
                        .setSecondaryRichTooltip(RichTooltip.builder()
                                .setTitle(resourceBundle.getString(
                                        "AppMenu.tooltip.title"))
                                .addDescriptionSection(resourceBundle.getString(
                                        "AppMenu.tooltip.paragraph1"))
                                .setMainIconFactory(() -> appMenuRichTooltipMainIcon)
                                .setFooterIconFactory(Help_browser.factory())
                                .addFooterSection(resourceBundle.getString(
                                        "AppMenu.tooltip.footer1"))
                                .build())
                        .setSecondaryContentModel(applicationMenu)
                        .build(),
                CommandButtonPresentationModel.builder().setPopupKeyTip("F").build());
...
this.getRibbon().setApplicationMenuCommand(ribbonMenuCommandProjection);
```

Here we have configured the "outer shell", so to speak of the application menu:

- The text displayed on the application menu button
- The secondary (popup) rich tooltip associated with the application menu button
- The popup key tip for traversing the application menu with keyboard

The primary/secondary/additional content of the application menu itself is set here with `Command.Builder.setSecondaryContentModel()` call. Let's see how we construct that secondary content model.

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/appmenu/app-menu-secondary-large.png" width="1119" border=0/>

For the "Save As" primary command, we start by creating its secondary commands:

```java
this.amEntrySaveAsWord = Command.builder()
        .setText(resourceBundle.getString("AppMenuSaveAs.word.text"))
        .setIconFactory(X_office_document.factory())
        .setExtraText(resourceBundle.getString("AppMenuSaveAs.word.description"))
        .setAction(commandActionEvent -> System.out.println("Invoked saved as Word"))
        .build();

this.amEntrySaveAsHtml = Command.builder()
        .setText(resourceBundle.getString("AppMenuSaveAs.html.text"))
        .setIconFactory(Text_html.factory())
        .setExtraText(resourceBundle.getString("AppMenuSaveAs.html.description"))
        .setAction(commandActionEvent -> System.out.println("Invoked saved as HTML"))
        .setActionEnabled(false)
        .build();

this.amEntrySaveAsOtherFormats = Command.builder()
        .setText(resourceBundle.getString("AppMenuSaveAs.other.text"))
        .setIconFactory(Document_save_as.factory())
        .setExtraText(resourceBundle.getString("AppMenuSaveAs.other.description"))
        .setAction(commandActionEvent -> System.out.println("Invoked saved as other"))
        .build();
```

Now we create the "Save As" command itself, and configure its secondary content model from these three commands:

```java
CommandMenuContentModel saveAsMenu = new CommandMenuContentModel(
        new CommandGroup(
                resourceBundle.getString("AppMenuSaveAs.secondary.textGroupTitle1"),
                amEntrySaveAsWord, amEntrySaveAsHtml,
                amEntrySaveAsOtherFormats));

this.amEntrySaveAs = Command.builder()
        .setText(resourceBundle.getString("AppMenuSaveAs.text"))
        .setIconFactory(Document_save_as.factory())
        .setAction(commandActionEvent ->
                System.out.println("Invoked saving document as"))
        .setSecondaryContentModel(saveAsMenu)
        .build();
```

Note that this is exactly the same way as working with [commands](Command.md) and [command popup menus](CommandPopupMenu.md) - as far as content models go. This is quite intentional. Ribbon does not force you to have commands that can only be placed in the application menu. As the design of your application evolves, you can move commands between different places in the ribbon (ribbon tasks, ribbon anchored area, ribbon application menu) with no changes required to the content models.

After you have all your primary commands configured, use `RibbonApplicationMenu` that accepts one or more `CommandGroup`s to set the primary application menu content:

```java
RibbonApplicationMenu applicationMenu = new RibbonApplicationMenu(
        new CommandGroup(amEntryNew, amEntryOpen, amEntrySave, this.amEntrySaveAs),
        new CommandGroup(amEntryPrint, amEntrySend),
        new CommandGroup(this.amEntryExit));
```

You can also place one or more command projections in the footer area of the ribbon application menu - see the "Options" button in the screenshots above.

```java
this.amFooterProps = Command.builder()
        .setText(resourceBundle.getString("AppMenuOptions.text"))
        .setIconFactory(Document_properties.factory())
        .setAction(commandActionEvent -> System.out.println("Invoked Options"))
        .build();

applicationMenu.addFooterCommand(this.amFooterProps);
```

Here we are using the  `RibbonApplicationMenu.addFooterCommand()` API to add that command to the footer area. And now we are done with the content model for the ribbon application menu - that is set as secondary content model on the application menu command button projection:

```java
RibbonApplicationMenuCommandButtonProjection ribbonMenuCommandProjection =
        new RibbonApplicationMenuCommandButtonProjection(
                Command.builder()
                        ...
                        .setSecondaryContentModel(applicationMenu)
                        .build(),
                CommandButtonPresentationModel.builder().setPopupKeyTip("F").build());
...
this.getRibbon().setApplicationMenuCommand(ribbonMenuCommandProjection);
```

### Configuring secondary content presentation state

Let's go back to these two screenshots:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/appmenu/app-menu-secondary-medium.png" width="1119" border=0/>

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/appmenu/app-menu-secondary-large.png" width="1119" border=0/>

How do we "tell" the ribbon that secondary content for "New" should be presented differently from secondary content for "Save As"? We use the `RibbonApplicationMenuCommandButtonProjection.setSecondaryLevelCommandPresentationState()` API:

```java
Map<Command, CommandButtonPresentationState> applicationMenuSecondaryStates = new HashMap<>();
applicationMenuSecondaryStates.put(amEntryNew, CommandButtonPresentationState.MEDIUM);
applicationMenuSecondaryStates.put(amEntrySaveAs,
        RibbonApplicationMenuCommandButtonProjection.RIBBON_APP_MENU_SECONDARY_LEVEL);
ribbonMenuCommandProjection.setSecondaryLevelCommandPresentationState(applicationMenuSecondaryStates);
```

Here we have configured "New" to use `MEDIUM` presentation state on its secondary content - a small icon + single line of text / title. And "Save As" is using the `RIBBON_APP_MENU_SECONDARY_LEVEL` presentation state on its secondary content - large icon, single line of text / title and two lines of extra text.

If you want to switch the presentation of secondary content in your ribbon application menu as your design evolves, there is no need to touch the content model of any command or the application menu itself. You only need to update the secondary presentation state mapping.

### Next

Continue to [ribbon anchored commands](RibbonAnchoredCommands.md).
