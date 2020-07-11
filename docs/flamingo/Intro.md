## Flamingo - introduction

Most of Flamingo's components are created as projections. Projections are built from content models and presentation models.

A **content model** describes the basic elements of a piece of your model realm, how the user interacts with it, and what happens when that interaction happens.

A **presentation model** describes how to "convert" (or project) that content model into a Swing component that can be added to the application UI hierarchy to present the data backed by that content model and react to the user interaction.

A **projection** is the act of "combining" a content model and a presentation model and creating a Swing component.

In a nutshell:

- **content model + presentation model &#8594; projection**
- **projection &#8594; one or more Swing components**

### Example

Let's take a look at these three concepts in action:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/command-basics.png" width="780" border=0/>

Here is how the first button (big icon with "Paste" text underneath) is created:

```java
Command pasteActionCommand = Command.builder()
    .setText(resourceBundle.getString("Paste.text"))
    .setExtraText(resourceBundle.getString("Paste.textExtra"))
    .setIconFactory(Edit_paste.factory())
    .build();

CommandButtonProjection bigPasteProjection =
      pasteActionCommand.project(
            CommandButtonPresentationModel.builder()
                    .setPresentationState(CommandButtonPresentationState.BIG)
                    .setFlat(false)
                    .build());

JCommandButton bigButton = bigPasteProjection.buildComponent();
```

First, we create a `Command` which is a content model. It sets text, extra text and icon factory as the basic elements that describe this piece of application model realm.

Then we construct a `CommandButtonPresentationModel` which is a presentation model. It specifies that we want to use the `BIG` presentation state (big icon + one or two lines of text underneath), and non-flat appearance (button background always showing).

Then, we combine them together by calling `Command.project(CommandButtonPresentationModel)` that gives us a `CommandButtonProjection`.

And finally, we call `CommandButtonProjection.buildComponent()` that gives us a `JCommandButton` - a Swing component that can be added to the component hierarchy of our application.

### Next

Continue to a [more detailed sample walkthrough](Sample.md).
