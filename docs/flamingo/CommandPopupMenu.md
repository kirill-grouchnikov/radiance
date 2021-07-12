## Flamingo - command popup menus

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon-lego.jpg" width="767" border=0/>

Command menu (seen in the screenshot above anchored just below the "Format" button) is a multi-tiered collection of commands. Any command in any tier can have associated secondary content that is, in turn, its own command menu - essentially creating traditional cascading menus. At *any tier*, a command menu can have a vertically scrollable [command panel](CommandPanel.md) - seen in the screenshot above as a 5-column grid of large buttons.

### Content model

`org.pushingpixels.flamingo.api.common.model.CommandMenuContentModel` is the content model for command menus. A variety of constructors are available to set the initial content with one or more command groups for the regular content, as well as the optional `CommandPanelContentModel` for the leading command panel. If a menu content model has more than one command group, the groups are visually delineated with horizontal separator when they are projected and displayed on the screen.

As with [command strips](CommandStrip.md), commands can be added to and removed from individual command groups. The same applies to dynamically changing command content of the optional leading command panel. In addition, command groups can be added to and removed from the overall command menu model.

The `highlightedCommand` attribute can be used to visually mark one command in the overall menu to be highlighted.

### Presentation model

`org.pushingpixels.flamingo.api.common.model.CommandPopupMenuPresentationModel` and its `Builder` are the presentation model for command popup menus.

The `panelPresentationMode` attribute can be used to provide the presentation model for the optional leading command panel.

The `maxVisibleMenuCommands` controls the maximum number of regular commands visible on the screen before vertical scrolling kicks in. In the screenshot below the command popup menu is configured to display at most 8 items:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/command-secondary-scrollable.png" width="734" border=0/>

The `menuPresentationState` attribute determines the visual presentation of the commands in the projected menu content.

### Projection

`org.pushingpixels.flamingo.api.common.projection.CommandPopupMenuProjection` is the projection that combines `CommandMenuContentModel` content model and `CommandPopupMenuPresentationModel` presentation model. The result of `buildComponent` is a Swing component of the `JCommandPopupMenu` class.

**Note:** this, however, is not the recommended way to configure popup menu content if you are working with command projections. Here is how you would go about that.

### Sample code

Let's see the code behind this popup menu:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon-lego.jpg" width="767" border=0/>

First we create the same command panel content model as in the [previous example](CommandPanel.md#sample-code):

```java
List<CommandGroup> commandGroups = new ArrayList<>();

MessageFormat mf = new MessageFormat(resourceBundle.getString("PanelStyles.text"));
mf.setLocale(locale);

for (int groupIndex = 0; groupIndex < 4; groupIndex++) {
    String commandGroupName = mf.format(new Object[] { groupIndex });
    List<Command> commands = new ArrayList<>();
    for (int i = 0; i < 15; i++) {
        final String deco = groupIndex + "/" + i;
        NeonIcon.Factory iconFactory = DecoratedNeonIcon.factory(
                Font_x_generic.factory(),
                ...
                });
        Command command = Command.builder()
                .setIconFactory(iconFactory)
                .setToggle()
                .setAction(commandActionEvent ->
                        System.out.println("Invoked action on " + deco))
                .build();
        commands.add(command);
    }

    commandGroups.add(new CommandGroup(commandGroupName, commands));
}

CommandPanelContentModel commandPanelContentModel =
        new CommandPanelContentModel(commandGroups);
commandPanelContentModel.setSingleSelectionMode(true);
```

Then we create a `CommandMenuContentModel` from that command panel content model and three additional command (split into two command groups):

```java
List<CommandGroup> extraEntries = new ArrayList<>();
extraEntries.add(new CommandGroup(
        Command.builder()
                .setText(resourceBundle.getString("SaveSelection.text"))
                .setIconFactory(X_office_document.factory())
                .build(),
        Command.builder()
                .setText(resourceBundle.getString("ClearSelection.text"))
                .setIconFactory(EmptyNeonIcon.factory())
                .build()
));
extraEntries.add(new CommandGroup(
        Command.builder()
                .setText(resourceBundle.getString("ApplyStyles.text"))
                .setIconFactory(EmptyNeonIcon.factory())
                .build()
));

CommandMenuContentModel commandMenuContentModel =
    new CommandMenuContentModel(commandPanelContentModel, extraEntries);
```

Then we create a presentation model in the default `ROW_FILL` mode, with all projected buttons using `FIT_TO_ICON` layout and icons sized at 48 pixels:

```java
CommandPopupMenuPresentationModel commandPopupMenuPresentationModel = CommandPopupMenuPresentationModel.builder()
      .setPanelPresentationModel(CommandPanelPresentationModel.builder()
            .setToShowGroupLabels(false)
            .setCommandPresentationState(CommandButtonPresentationState.FIT_TO_ICON)
            .setCommandIconDimension(48)
            .setMaxColumns(5)
            .setMaxRows(3)
            .build())
      .build();
```

Note how the inner `panelPresentationModel` is configured for projecting the leading command panel.

At this point, we go back to how commands [are projected](CommandProjections.md) as buttons.

The first part is to set our `CommandMenuContentModel` as `secondaryContent` on the `Command` content model. The second is to set our `CommandPopupMenuPresentationModel` as `popupMenuPresentationModel` on the `CommandButtonPresentationModel` presentation model:

```java
CommandButtonProjection formatCommandProjection = Command.builder()
        .setText(resourceBundle.getString("Format.text"))
        .setIconFactory(Edit_paste.factory())
        .setSecondaryContentModel(commandMenuContentModel)
        .setSecondaryRichTooltip(...)
        .build()
        .project(CommandButtonPresentationModel.builder()
                .setPopupMenuPresentationModel(commandPopupMenuPresentationModel)
                .build());
```

A Swing button component projected from this projection will display the popup content specified by the `commandMenuContentModel`, with its presentation configured by the `commandPopupMenuPresentationModel`:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon-lego.jpg" width="767" border=0/>

### Next

Continue to [color selector commands](ColorSelectorCommand.md).
