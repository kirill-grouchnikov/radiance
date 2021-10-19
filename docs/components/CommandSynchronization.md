## Components - command synchronization

### Introduction

A `Command` object encapsulates the business logic of one piece of the application model realm. It can be a command to apply bold style on the current text selection. It can be a command to paste the current content of the clipboard. Or it can be a command to print the current document.

Commands are [projected](CommandProjections.md) to create a visual representation of it - as a Swing component that can be placed into the application hierarchy. Radiance takes care of two-way synchronization between a command and all of its projections:

- When the command is updated based on the matching local or remote model changes, these updates are automatically propagated to all the projections of that command. For example, when the text selection changes, the "apply bold" command may change its toggle state based on the presence of the bold style in the new text selection.
- When the user interacts with a specific projection of the command, that interaction is propagated to the command itself, and from there to all other projections of that command.

### Example

Let's take a look at a somewhat contrived example of the seamless sync of a user interaction with one projection that is propagated to all other projections.

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/command-sync1.png" width="437" border=0/>

We start by defining the four [commands](Command.md) that are marked to belong to the same command toggle group model:

```java
CommandToggleGroupModel justifyToggleGroup = new CommandToggleGroupModel();

Command justifyLeft = Command.builder()
    .setText("left")
    .setIconFactory(Format_justify_left.factory())
    .inToggleGroupAsSelected(justifyToggleGroup)
    .build();
Command justifyCenter = Command.builder()
    .setText("center")
    .setIconFactory(Format_justify_center.factory())
    .inToggleGroup(justifyToggleGroup)
    .build();
Command justifyRight = Command.builder()
    .setText("right")
    .setIconFactory(Format_justify_right.factory())
    .inToggleGroup(justifyToggleGroup)
    .build();
Command justifyFill = Command.builder()
    .setText("fill")
    .setIconFactory(Format_justify_fill.factory())
    .inToggleGroup(justifyToggleGroup)
    .build();
```

Then we create three command button strips, each one from the same group of our four commands. The only difference between the three strips is the presentation state used for each one:

```java
// Three rows of toggle buttons with selection sync
CommandGroup justifyCommandGroup =
    new CommandGroup(justifyLeft, justifyCenter, justifyRight, justifyFill);
contentPanel.add(new CommandStripProjection(justifyCommandGroup,
    CommandStripPresentationModel.builder()
        .setCommandPresentationState(CommandButtonPresentationState.SMALL)
        .build())
    .buildComponent());
contentPanel.add(new CommandStripProjection(justifyCommandGroup,
    CommandStripPresentationModel.builder()
        .setCommandPresentationState(CommandButtonPresentationState.MEDIUM)
        .build())
    .buildComponent());
contentPanel.add(new CommandStripProjection(justifyCommandGroup,
    CommandStripPresentationModel.builder()
        .setCommandPresentationState(CommandButtonPresentationState.BIG)
        .build())
    .buildComponent());
```

The first command is marked as `inToggleGroupAsSelected()` and that is what marks all three of its projections to be in selected state.

Let's see what happens when one of the "justify right" command projections is clicked:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/command-sync2.png" width="437" border=0/>

Here is what happens under the hood - with no additional code required from the application side:

- The clicked projection (toggle button, in this case) is queried to get the `Command` used to create that projection.
- If that command has an associated action, that `CommandAction` is invoked.
- As the `justifyRight` command was marked as `toggle`, and it is configured to belong to a `CommandToggleGroupModel`, the previous toggle group model selection - `justifyLeft` command - is marked to be `off`. Our `justifyRight` command is then marked to be `on`.
- That triggers code to update all the projections of these two commands. Each command is projected three times in our case. Each one of these six projections is a Swing toggle button. Each one of these Swing components is updated to reflect the latest toggle state to be either `off` (for `justifyLeft`) or `on` (for `justifyRight`), and the components are repainted to show their new state visually.

### Summary

It is highly recommended to encapsulate all the business logic in relevant `Command` objects. For simpler applications, each command would be projected once on the screen. Having a single place in your codebase to be responsible for tracking your data state and reacting to the user interaction with visual representation of that data on screen should properly compartmentalize the responsibilities of each layer in your application.

The ribbon container is an example of a more complex scenario where the same command can be projected in multiple places in the UI.

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon-lego.jpg" width="767" border=0/>

In the screenshot above, take a look at the ribbon taskbar - a strip of content integrated into the window title pane.

The "Paste" split button from the "Clipboard" task is the first pinned element. Both of these buttons were projected from the same paste `Command` object. From the pure functional perspective, these two buttons are identical. Clicking one of them activates the same block of code (command action) as clicking the other. Disabling the command will disable both buttons. Changing the icon factory on the command will change the icon on both buttons, etc.

The same applies to the font selector combobox in the "Font" ribbon task, which is also pinned in the ribbon taskbar. Making a selection in one combobox automatically updates the selection in the other.

This is the power of content models, presentation models and projections.

### Next

Continue to the [model and projection overview](ModelProjectionOverview.md).
