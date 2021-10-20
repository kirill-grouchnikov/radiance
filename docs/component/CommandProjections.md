## Components - command projections

Let's take another look at the example from the [command documentation](Command.md#base-attributes)

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/command-basics.png" width="780" border=0/>

For the paste buttons (first column), the command that was used to project all four buttons looks like this:

```java
this.pasteActionCommand = Command.builder()
    .setText(resourceBundle.getString("Paste.text"))
    .setExtraText(resourceBundle.getString("Paste.textExtra"))
    .setIconFactory(Edit_paste.factory())
    .build();
```

The only difference is the presentation model associated with each one of the projection:

1. In the first row (big state), the button is showing the text (that might go to two lines) and a big icon, stacked vertically.
2. In the second row (tile state), the big icon is on the left, and the vertical stack on the right displays the text and the extra text.
3. In the third row (medium state), the icon is smaller, and only text is showing.
4. In the fourth row (small state), only the small icon is showing.

Here is how the first (big) button is created:

```java
JCommandButton bigButton =
      this.pasteActionCommand.project(
            CommandButtonPresentationModel.builder()
                    .setPresentationState(CommandButtonPresentationState.BIG)
                    .setFlat(false)
                    .build())
            .buildComponent();
```

There are two important parts here - the presentation model and projecting the command onto the screen. Let's talk about these two parts.

### Command button presentation model

In Radiance's terminology, a command (represented by the `Command` class and its builder pattern) is a **content model**. [It describes](Command.md) the basic elements of a command (such as text and icon), how the user interacts with it, and what happens when that interaction happens.

The **presentation model** describes how to "convert" (or project) a content model into a Swing component that can be added to the application UI hierarchy to present the data backed by that content model and react to the user interaction.

In this particular case, we are projecting our [command as a button](CommandButtonPresentation.md) - hence the `CommandButtonPresentationModel` class name. With the same builder pattern, `.builder()` creates a new builder instance, and then `.build()` creates an immutable presentation model instance:

```java
CommandButtonPresentationModel.builder()
        .setPresentationState(CommandButtonPresentationState.BIG)
        .setFlat(false)
        .build())
```

Going back to our screenshot:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/command-basics.png" width="780" border=0/>

What is different between the four "Paste" buttons in the first column? The only thing is the presentation state passed to the `.setPresentationState()` call on the presentation model builder. The rest is identical - the command itself, as well as the `.setFlat(false)` to mark the projected button to always display background.

Now let's talk about the projection is.

### Command button projection

Projection is the act of "combining" a content model and a presentation model and creating a Swing component. In our case, `Command` is our content model and `CommandButtonPresentationModel` is our presentation model.

The same command object can be projected multiple times on the screen - four in the case of our demo app. And the same presentation model object can be used to project multiple commands in case all of them use the same presentation "instructions".

Taking another look at the combined code:

```java
this.pasteActionCommand = Command.builder()
    .setText(resourceBundle.getString("Paste.text"))
    .setExtraText(resourceBundle.getString("Paste.textExtra"))
    .setIconFactory(Edit_paste.factory())
    .build();

JCommandButton bigButton = this.pasteActionCommand.project(
    CommandButtonPresentationModel.builder()
          .setPresentationState(CommandButtonPresentationState.BIG)
          .setFlat(false)
          .build())
    .buildComponent();
```

### Two-way sync

In an [earlier example](IntroMode.md) we have four buttons to change content styling (bold, italic, underline and strikethrough) of `JTextPane` content:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/intro-text-styling.png" width="696" border=0/>

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/intro-text-styling-bold-italic.png" width="696" border=0/>

Let's take a look at how the "bold" styling is done. First, we create the command (which is the content model):

```java
// Bold style command
Command commandBold = Command.builder()
        .setIconFactory(Format_text_bold.factory())
        .setAction(commandActionEvent -> {
             // toggle bold in current selection
             toggleStyleInSelection(textPane, StyleConstants.CharacterConstants.Bold);
             // and update command selection state based on the presence of bold
             commandActionEvent.getCommand().setToggleSelected(
                 hasStyleInSelection(textPane,
                         StyleConstants.CharacterConstants.Bold));
        })
        .setToggle(true)
        .build();
```

The important part here is what happens in the `setAction` block. The first thing the command action does is to update the styling of the currently selected content in our text pane. And then, we update the `toggleSelected` attribute of the **command itself** - not the Swing component that represents that command on the screen.

And then, we have the caret listener registered on the text pane to update the enabled state of our command:

```java
textPane.addCaretListener(caretEvent -> {
    // Compute selection presence
    boolean hasSelection =
          (textPane.getSelectionEnd() - textPane.getSelectionStart()) > 0;
    // Enable or disable the command based on that
    commandBold.setActionEnabled(hasSelection);

    // Determine whether the bold toggle selection is "on" based on
    // the presence of the matching style in the text pane selection
    commandBold.setToggleSelected(hasStyleInSelection(textPane,
            StyleConstants.CharacterConstants.Bold));
});
```

Here, again, we update the `actionEnabled` and `toggleSelected` attributes of the **command itself**.

*This is the whole purpose of existence for content model (command), presentation model (command button presentation model) and projection (command button projection).*

Content model encapsulates the "business logic", if you will, of one piece of the application model realm. In our case, it is a piece of model realm that deals with applying bold styling on a selected text somewhere in the application UI. That piece of model realm is the one that should be tracking whether that bold styling is on or off (the `toggleSelected` attribute). It is the one that also should be tracking whether it is active or not (the `enabled` attribute).

Radiance then takes care of updating all the projections based on the changes in the content model - be it a single projection of each styling command in our last example, or more than one projection of the same content model as can be seen in the ribbon.

It's worth noting that a particular command may not be projected in the current screen at all. In this case you would still want to continue updating the content model (which is that command) based on the specific application logic - as you would do with any other piece of your model realm that you keep in sync with the latest local or remote data changes.

### Next

Continue to the [command button presentation models](CommandButtonPresentation.md).
