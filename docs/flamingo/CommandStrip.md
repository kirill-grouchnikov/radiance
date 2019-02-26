## Flamingo - command strips

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/intro-text-styling-bold-italic.png" width="696" border=0/>

Command strip is a logically and visually connected group of commands (and their projections). In the screenshot below the four styling commands - bold, italic, underline, strikethrough - are grouped together to reinforce the logical connection of the underlying functionality.

### Content model

`org.pushingpixels.flamingo.api.common.model.CommandGroup` is the content model for command strips. A variety of constructors are available to set the initial command content. In addition, commands can be added to and removed from a command group dynamically.

### Presentation model

`org.pushingpixels.flamingo.api.common.model.CommandStripPresentationModel` and its `Builder` are the presentation model for command button strips.

The `orientation` attribute can be used to specify whether the strip buttons should be laid out horizontally or vertically.

The `commandPresentationState` attribute determines the visual presentation of the strip commands in the projected buttons. In the screenshot below, the same `CommandGroup` is projected using three different `CommandStripPresentationModel` instances - each one differing only in its command presentation state:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-sync1.png" width="437" border=0/>

The `horizontalGapScaleFactor` and `verticalGapScaleFactor` can be used to control the space around the icons of the projected buttons:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-strip-horizontal.png" width="435" border=0/>

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-strip-vertical.png" width="512" border=0/>

The `flat` attribute controls the background presence of all projected buttons in default (non-active state).

### Projection

`org.pushingpixels.flamingo.api.common.projection.CommandStripProjection` is the projection that combines `CommandGroup` content model and `CommandStripPresentationModel` presentation model. The result of `buildComponent` is a Swing component of the `JCommandButtonStrip` class.

### Sample code

First we create four commands configured to belong to the same command toggle group:

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

And then we create a `CommandGroup` content model and a `CommandStripPresentationModel` presentation model, combine them together into a `CommandStripProjection` and then call `buildComponent()` to get a Swing component that can be added to the component hierarchy of our application:

```java
CommandGroup justifyCommandGroup =
    new CommandGroup(justifyLeft, justifyCenter, justifyRight, justifyFill);
contentPanel.add(new CommandStripProjection(justifyCommandGroup,
    CommandStripPresentationModel.builder()
        .setCommandPresentationState(CommandButtonPresentationState.SMALL)
        .build())
    .buildComponent());
```

### Next

Continue to [command panels](CommandPanel.md).
