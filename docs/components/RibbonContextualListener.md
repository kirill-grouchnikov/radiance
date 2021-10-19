## Components - ribbon global contextual listener

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/taskbar/taskbar-contextualmenu-add.png" width="1181" border=0/>

The `JRibbon.setOnShowContextualMenuListener()` API allows configuring the global contextual menu listener that will be used to populate content of a menu displayed on any mouse event that is a popup trigger (aka right-click).

The application is in charge of implementing the methods in `OnShowContextualMenuListener` listener to return a [`CommandMenuContentModel`](CommandPopupMenu) content model that will be used to project the contextual menu.

In the screenshot above the user right-clicked on the "font size" combobox in the "Font" ribbon band. The menu shows commands for adding that combobox to [taskbar](RibbonTaskbar.md), minimizing the ribbon and general ribbon configuration.

Let's take a look at the code behind populating this specific menu (in the main ribbon demo application):

```java
@Override
public CommandMenuContentModel getContextualMenuContentModel(
        ComponentProjection<? extends JComponent, ?
                extends ComponentContentModel> componentProjection) {
    Command componentCommand;
    if (getRibbon().isShowingInTaskbar(componentProjection.getContentModel())) {
        componentCommand = Command.builder()
                .setText(resourceBundle.getString(
                        "ContextMenu.removeFromTaskbar"))
                .setAction(commandActionEvent ->
                        getRibbon().removeTaskbarComponent(
                                componentProjection.getContentModel()))
                .build();
    } else {
        componentCommand = Command.builder()
                .setText(resourceBundle.getString("ContextMenu.addToTaskbar"))
                .setAction(commandActionEvent ->
                        getRibbon().addTaskbarComponent(componentProjection))
                .build();
    }

    return build(componentCommand);
}
```

We use `JRibbon.isShowingInTaskbar()` API to determine whether this component projection is already in the taskbar. That determines whether we show the "Add to taskbar" command (backed by the `JRibbon.addTaskbarComponent()` API) or "Remove from taskbar" command (backed by the `JRibbon.removeTaskbarComponent()`) API. This is how you can enable the user to configure the exact taskbar content that they want to always see and access via keytips.

Most of the logic in this implementation is specific to `ComponentProjection`, and you will probably want to have something similar for commands and galleries. The last line adds the projection-independent menu commands:

```java
private CommandMenuContentModel build(Command... commands) {
    CommandGroup commandGroup = new CommandGroup(commands);

    if (getRibbon().isMinimized()) {
        commandGroup.addCommand(Command.builder()
                .setText(resourceBundle.getString("ContextMenu.showRibbon"))
                .setAction(commandActionEvent ->
                        getRibbon().setMinimized(false))
                .build());
    } else {
        commandGroup.addCommand(Command.builder()
                .setText(resourceBundle.getString("ContextMenu.hideRibbon"))
                .setAction(commandActionEvent ->
                        getRibbon().setMinimized(true))
                .build());
    }
    commandGroup.addCommand(Command.builder()
            .setText(resourceBundle.getString("ContextMenu.configureRibbon"))
            .setAction(commandActionEvent ->
                    JOptionPane.showMessageDialog(BasicCheckRibbon.this,
                            "Configure ribbon option selected"))
            .build());
    return new CommandMenuContentModel(commandGroup);
}
```

The first is the command to minimize / restore the ribbon, using `JRibbon.isMinimized()` and `JRibbon.setMinimized()` APIs. The second is a placeholder command to open a custom UI for deep configuration of the entire ribbon content - that is left to the particular application needs.

Here is our global contextual menu shown when the user right-clicks on the font combobox in the taskbar:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/taskbar/taskbar-contextualmenu-remove.png" width="1181" border=0/>

and the taskbar updated after "Remove from taskbar" menu command has been activated:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/taskbar/taskbar-contextualmenu-removed.png" width="1181" border=0/>

Here you can see how the available taskbar space is now enough to host additional command buttons and the checkbox that were previously displayed in the overflow.

And here is another screenshot of the same taskbar after a few more removal operations - where there is no need for overflow since the entire taskbar content fits into the available space:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/taskbar/taskbar-contextualmenu-removed2.png" width="1181" border=0/>
