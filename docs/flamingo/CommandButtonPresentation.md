## Flamingo - command button presentation model

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-basics.png" width="780" border=0/>

As [discussed earlier](CommandProjections.md#command-button-presentation-model), the code for the app in the screenshot above uses four commands, one for each button column. Here is the code snippet that creates the first "paste" button (the one with big icon and the text below the icon):

```java
this.pasteActionCommand = Command.builder()
    .setText(resourceBundle.getString("Paste.text"))
    .setExtraText(resourceBundle.getString("Paste.textExtra"))
    .setIconFactory(Edit_paste.factory())
    .build();

AbstractCommandButton bigButton = this.pasteActionCommand.project(
    CommandButtonPresentationModel.builder()
      .setPresentationState(CommandButtonPresentationState.BIG)
      .setFlat(false)
      .build())
    .buildComponent();
```

The **content model** (`Command` class) describes the basic elements of a command (such as text and icon), how the user interacts with it, and what happens when that interaction happens.

The **presentation model** describes how to "convert" (or project) that content model into a Swing component - a command button in our case - that can be added to the application UI hierarchy to present the data backed by that content model and react to the user interaction.

Let's take a look at the attributes of command button presentation model.

### Attributes overview

Command button presentation models are created with the builder pattern which is pervasive throughout Flamingo. Call `CommandButtonPresentationModel.builder()` to get a new builder instance. Then, configure one or more of the following attributes on the builder:

|  | Attribute | Type |
| --- | --- | --- |
| **Visuals** | flat | boolean |
|  | presentationState | CommandButtonPresentationState |
|  | iconDimension | int
| **Layout metrics** | horizontalAlignment | int |
|  | horizontalGapScaleFactor | int |
|  | verticalGapScaleFactor | int |
| **Interaction** | focusable | boolean |
|  | menu | boolean |
|  | textClickAction | boolean |
|  | textClickPopup | boolean |
|  | actionKeyTip | String |
|  | popupKeyTip | String |
|  | popupMenuPresentationModel | AbstractPopupMenuPresentationModel |
|  | popupOrientationKind | PopupOrientationKind |
|  | dismissPopupsOnActivation | boolean |
|  | autoRepeatAction | boolean |
|  | autoRepeatInitialInterval | int |
|  | autoRepeatSubsequentInterval | int |
|  | fireActionOnRollover | boolean |
|  | fireActionOnPress | boolean |

### Visual attributes

Going back to the same screenshot that shows how four commands (paste, cut, copy, and select all) are projected on the screen:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-basics.png" width="780" border=0/>

Here's the relevant code snippet that creates a command button presentation model used to project the first "paste" button:

```java
AbstractCommandButton bigButton = this.pasteActionCommand.project(
    CommandButtonPresentationModel.builder()
      .setPresentationState(CommandButtonPresentationState.BIG)
      .setFlat(false)
      .build())
    .buildComponent();
```

In here, `CommandButtonPresentationState.BIG` is used to instruct the projection to create the specific layout that is using a vertical stack of text and big icon. There are additional presentation states available in that class for out-of-box configuration of buttons, as well as support for custom application-specific layouts. One of the out-of-box configurations is `CommandButtonPresentationState.FIT_TO_ICON` that is used when the `iconDimension` attribute is set on the builder.

The boolean `flat` attribute controls the appearance of the projected button in a non-active state (no rollover, selection, press, arm, etc). In the example above, all the buttons are projected as non-flat - showing the background at all times. Buttons marked as flat will only show the background in one of the active states.

### Layout metrics

The `horizontalAlignment` attribute controls what happens when the projected button gets more horizontal space than it needs to fully display the content under the specific presentation state:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-button-halignment.png" width="515" border=0/>

The supported attribute values are `SwingConstants.LEADING`, `SwingConstants.CENTER` and `SwingConstants.TRAILING`. As can be seen from the screenshot above, some combinations of the attribute values and presentation states may result in a layout that would look distracting for certain application scenarios.

The `horizontalGapScaleFactor` and `verticalGapScaleFactor` attributes can be used to decrease or increase the amount of space (gap) between the icon and the text(s) of the specific projected button:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-button-gap-scaling.png" width="518" border=0/>

In the first row the `horizontalGapScaleFactor` is combined with `CommandButtonPresentationState.MEDIUM` presentation state to tweak the horizontal space between the icon and the text. In the second row the `verticalGapScaleFactor` is combined with `CommandButtonPresentationState.BIG` presentation state to tweak the vertical space between the icon and the text.

### Interaction

#### Text click area

Let's take a look at two screenshots. In the first one, the mouse cursor is over the text area of the "Cut" button in tile state. Note that different strength of yellow rollover highlight indication. The area of the button that contains the icon and the two texts has a stronger yellow highlight, while the area with the down arrow has a weaker highlight. This projection is configured with `CommandButtonPresentationState.Builder.setTextClickAction()` API to indicate that clicking anywhere in the area that shows the command text (and extra text, if relevant) will activate the main command action:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-title-action.png" width="764" border=0/>

In the second one, the mouse cursor is over the same text area, this time of the "Copy" button in tile state. Here, the area of the button with the icon has a weaker highlight, while the area with the two texts and the down arrow has a stronger highlight.  This projection is configured with `CommandButtonPresentationState.Builder.setTextClickPopup()` API to indicate that clicking anywhere in the area that shows the command text (and extra text, if relevant) will activate the secondary command content - in this case, showing a popup menu:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-title-popup.png" width="764" border=0/>

#### Repeated action

In some cases, the design calls for facilitating repeated activation of the command action. For example, it would be quite tedious to scroll down a large list of items by repeatedly clicking the down button (or area below the scrollbar thumb). The usability of such actions can be improved if, pressed once, the action is repeated continuously until the mouse button is released.

Command button presentation models come with five attributes that aim to address such scenarios.

* `setAutoRepeatAction(true)` will result in a repeated, continuous activation of the command action as long as the projected button is activated.
* `setFireActionOnRollover(true)` will result in command action activation when the mouse is moved over the projected button - without the need to press the mouse button itself.
* Alternatively, `setFireActionOnPress(true)` will result in command action activation when the mouse button is pressed - as opposed to the usual click which is a combination of pressing the button and then releasing it.
* Finally, `setAutoRepeatActionIntervals()` can be used to configure the command-specific initial and subsequent intervals between action activation. The static `Command.DEFAULT_AUTO_REPEAT_*` constants can be used to check for the default values of these two intervals.

#### Working with popups

A `CommandButtonProjection` uses `CommandButtonPresentationModel` to project a command as a Swing command button component. The [secondary content](Command.md#secondary-content-model) configured on the command is displayed in a popup window anchored to the projected button:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-secondary-simple.png" width="734" border=0/>

The `popupMenuPresentationModel` attribute can be used to tune the presentation of that popup content. For example, if you want to limit the number of visible elements in the popup and kick in vertical scrolling when necessary, configure your presentation model like this:

```java
CommandButtonProjection commandProjection = command.project(
    CommandButtonPresentationModel.builder()
    ...
    .setPopupMenuPresentationModel(CommandPopupMenuPresentationModel.builder()
      .setMaxVisibleMenuCommands(8)
      .build())
    .build());
```

and if the secondary content has more than 8 elements (commands), the popup will limit the number of visible elements to 8 with vertical scrolling:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-secondary-scrollable.png" width="734" border=0/>

Use the `popupOrientationKind` attribute to control the anchoring of the popup content. The default `PopupOrientationKind.DOWNWARD` displays the popup content below the projected button (same as the default popup anchoring for the core `JComboBox` component). Use `PopupOrientationKind.SIDEWARD` to display the popup to the side (right under left-to-right and left under right-to-left) of the projected button.

In some cases, you would want to allow the user to interact with multiple entries in the popup menu. Let's take a look at this screenshot:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-popup-dismiss.png" width="337" border=0/>

Here is the skeleton code behind the "multi" button and its popup content:

```java
Command formatBold = Command.builder()
    .setText("bold")
    .setIconFactory(Format_text_bold.factory())
    .setToggle()
    .build();
Command formatItalic = Command.builder()
    .setText("italic")
    .setIconFactory(Format_text_italic.factory())
    .setToggle()
    .build();
Command formatUnderline = Command.builder()
    .setText("underline")
    .setIconFactory(Format_text_underline.factory())
    .setToggle()
    .build();
Command formatStrikethrough = Command.builder()
    .setText("strikethrough")
    .setIconFactory(Format_text_strikethrough.factory())
    .setToggle()
    .build();

CommandMenuContentModel formatMenuContentModel = new CommandMenuContentModel(
    new CommandGroup(formatBold, formatItalic, formatUnderline, formatStrikethrough));

AbstractCommandButton multiChoice = Command.builder()
    .setText("multi")
    .setSecondaryContentModel(formatMenuContentModel)
    .build()
    .project(CommandButtonPresentationModel.builder()
    .setPresentationState(CommandButtonPresentationState.MEDIUM)
    .setFlat(false)
    .setPopupMenuPresentationModel(
        CommandPopupMenuPresentationModel.builder()
        .setToDismissOnCommandActivation(false).build())
    .build())
    .buildComponent();
```

First we create the four styling commands. Then we create a `CommandMenuContentModel` with those commands, and set it as `secondaryContentModel` for the top-level "multi" command.

The default behavior for Flamingo popup content is to dismiss all popups immediately when the user activates an entry in a popup. In this particular case, however, we want to allow the user to make as many selections in this popup as necessary without dismissing the popup after every single selection. This is what `setToDismissOnCommandActivation(false)` call on the `CommandPopupMenuPresentationModel` is for.

The same API is available on `CommandButtonPresentationModel` to configure the same behavior at the level of an individual projected button. Going back to an earlier screenshot:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-secondary-scrollable.png" width="734" border=0/>

Activating any menu entry in this vertically scrollable popup will dismiss the popup. However, the scroll-up and scroll-down buttons will kick in scrolling when activated, without dismissing the popup. Internally, these two buttons are projected from commands configured with presentation model with `toDismissOnCommandActivation` set to false.

#### Keytips

Keytips are evolution of mnemonics - a way to quickly navigate to and activate a specific command without using the mouse. While keytips can be configured on any command button presentation model, they are only shown on command projections added to the ribbon container.

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon-keytips.png" width="492" border=0/>

In the screenshot above, the "Paste" button is projected as:

```java
this.pasteCommand = Command.builder()
    .setText(resourceBundle.getString("Paste.text"))
    .setIconFactory(Edit_paste.factory())
    .setAction((CommandActionEvent e) -> System.out.println("Pasted!"))
    .setActionRichTooltip(
        RichTooltip.builder()
            .setTitle(resourceBundle.getString("Paste.text"))
            .addDescriptionSection(resourceBundle.getString(
                "Paste.tooltip.actionParagraph1"))
            .build())
    .setSecondaryContentModel(this.popupMenuContentModel)
    .setSecondaryRichTooltip(RichTooltip.builder()
        .setTitle(resourceBundle.getString("Paste.text"))
        .addDescriptionSection(resourceBundle
            .getString("Paste.tooltip.popupParagraph1"))
        .build())
    .build();

CommandButtonProjection pasteCommandProjection = this.pasteCommand.project(
    CommandButtonPresentationModel.builder()
        .setTextClickAction()
        .setActionKeyTip("Y")
        .setPopupKeyTip("V")
        .build());
```

Here the "paste" command has the main action, as well as additional secondary content that is displayed as popup when the arrow area of the projected button is clicked.

The presentation model is configured with `setTextClickAction()`, marking the text area to activate the main command action. In addition, `setActionKeyTip()` and `setPopupKeyTip()` APIs are used to associate specific keytips with the action and popup areas of the projected button. These keytips are shown when the user activates the sequence of keystrokes that shows all keytips for the "Page Layout" ribbon band.

### Next

Continue to the [command synchronization](CommandSynchronization.md).
