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

### Secondary content attributes

#### Secondary content model

Secondary content allows logical grouping of multiple commands that are only shown when a specific, so-called "secondary" area of the projected button is activated.

The simplest case of secondary content is additional commands shown in a popup menu:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-secondary-simple.png" width="734" border=0/>

Secondary content can be configured to display a certain maximum number of commands on the screen, kicking in vertical scrolling:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-secondary-scrollable.png" width="734" border=0/>

Or have a more complex structure, with an embedded, separately scrollable panel of commands:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-secondary-complex.png" width="734" border=0/>

All these three examples would be called "popup buttons" in similar component suites. The power of secondary content in Flamingo commands can be seen in how easily it is to configure a projected button to be a "regular" action button - with just one action.

Or, by calling `setSecondaryContentModel()` and `setTextClickAction(true)` make it a split button with a popup menu shown when the down arrow is clicked:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-title-action.png" width="764" border=0/>

Or instead, calling `setTextClickPopup(true)` to make it a split button with a popup menu shown when either texts or down arrow are clicked:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-title-popup.png" width="764" border=0/>

An important note is in order here. Even though all the examples so far have shown secondary content displayed as a popup menu, that is not necessarily the case. Flamingo's model of separating content from presentation (and combining the two in a projection) means that the **same exact command** projected as a split button can be projected into something that looks like this:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon-application-menu.png" width="754" border=0/>

Here, the ribbon application menu is a two-panel layout. The main commands are projected in the left column. The secondary content associated with a command is displayed in the panel on the right - not as a separate popup menu, but as part of the same application menu container.
