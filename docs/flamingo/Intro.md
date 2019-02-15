## Flamingo - introduction

Let's get right down to business of showing what Flamingo brings to the table.

In the screenshot below we have a multiline `JTextPane` and a vertical strip of buttons on the right. Clicking one of the buttons should change the text alignment of the content. The current alignment should be represented by the visual indication on the matching button.

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/intro-text-alignment.png" width="696" border=0/>

### Content setup

First, we set up the `JTextPane` with its content:

```java
JFrame frame = new JFrame("Text alignment demo");
frame.setLayout(new BorderLayout());

// Configure and populate "Lorem ipsum" multiline content
final JTextPane textPane = new JTextPane();
textPane.setText(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim" +
                " veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip " +
                "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
                "voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.");
textPane.setEditable(true);
textPane.setBorder(new EmptyBorder(12, 12, 12, 12));
// force the display of text selection even when the focus has been lost
textPane.setCaret(new DefaultCaret() {
    @Override
    public void setSelectionVisible(boolean visible) {
        super.setSelectionVisible(true);
    }
});

frame.add(textPane, BorderLayout.CENTER);
```

Now let's add a panel for the buttons and show the frame in the middle of the screen:

```java
JPanel styleButtonPanel = new JPanel(new FlowLayout());
frame.add(styleButtonPanel, BorderLayout.LINE_END);

// Show our frame in the center of the screen
frame.setIconImage(new BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR));
frame.setSize(new Dimension(600, 300));
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
frame.setVisible(true);
```

Finally, let's add a helper method that changes the content alignment on text pane:

```java
private static void setAlignment(JTextPane textPane, int alignment) {
    MutableAttributeSet attrSet = new SimpleAttributeSet();
    StyleConstants.setAlignment(attrSet, alignment);
    textPane.getStyledDocument().setParagraphAttributes(0,
            textPane.getStyledDocument().getLength(), attrSet, false);
}
```

So far, nothing special. This should all be familiar to a Swing developer. Let's take a look at what Flamingo brings to the table.

### Commands

The most basic building block of Flamingo components is a **command**. Instead of thinking in terms of buttons - where each button, when clicked, changes the content alignment on text pane - Flamingo separates the **content** aspects of such a unit of functionality from the **presentation** aspects of it.

Let's take a look at the four commands for changing the text pane content alignment:

```java
CommandToggleGroupModel justifyToggleGroup = new CommandToggleGroupModel();

// Align left command
Command commandAlignLeft = Command.builder()
        .setIconFactory(Format_justify_left.factory())
        .setAction((CommandActionEvent event) ->
                setAlignment(textPane, StyleConstants.ALIGN_LEFT))
        .inToggleGroupAsSelected(justifyToggleGroup)
        .build();

// Align center command
Command commandAlignCenter = Command.builder()
        .setIconFactory(Format_justify_center.factory())
        .setAction((CommandActionEvent event) ->
                setAlignment(textPane, StyleConstants.ALIGN_CENTER))
        .inToggleGroup(justifyToggleGroup)
        .build();

// Align right command
Command commandAlignRight = Command.builder()
        .setIconFactory(Format_justify_right.factory())
        .setAction((CommandActionEvent event) ->
                setAlignment(textPane, StyleConstants.ALIGN_RIGHT))
        .inToggleGroup(justifyToggleGroup)
        .build();

// Align fill command
Command commandAlignFill = Command.builder()
        .setIconFactory(Format_justify_fill.factory())
        .setAction((CommandActionEvent event) ->
                setAlignment(textPane, StyleConstants.ALIGN_JUSTIFIED))
        .inToggleGroup(justifyToggleGroup)
        .build();
```

Each command in this example is configured with the following three attributes:

1. Factory for creating a resizable icon for the command's representation (or projection, in Flamingo's terms) on the screen. In this case, the classes for `Format_justify_*` icons were transcoded by [Photon](../photon/photon.md).
2. Action to be taken when the command's representation on the screen is activated. Here, each command's action is mapped to call our helper `setAlignment` method.
3. Finally, each command is marked to belong to the same `CommandToggleGroupModel`, and the first command (align left) is marked also to be the selected one.

Let's take another look at how the visual representation of these four commands looks like:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/intro-text-alignment.png" width="696" border=0/>

Each command is represented by a single button. When a button is clicked, the corresponding command action is activated and our helper `setAlignment` method is called. In addition, the overall button strip is updated to reflect the currently "selected" command (the one whose visual representation was just clicked):

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/intro-text-alignment-changed.png" width="696" border=0/>


### Command strip

How do we "convert" these four commands to be shown as a vertical strip of four buttons on the screen? Here's the code:

```java
// Create a button strip to change the text alignment in our text pane.
CommandStripProjection commandStripProjection = new CommandStripProjection(
        new CommandGroup(commandAlignLeft, commandAlignCenter,
                commandAlignRight, commandAlignFill),
        CommandStripPresentationModel.builder()
                .setOrientation(CommandStripPresentationModel.StripOrientation.VERTICAL)
                .setHorizontalGapScaleFactor(0.8)
                .setVerticalGapScaleFactor(1.4)
                .build());
JCommandButtonStrip commandButtonStrip = commandStripProjection.buildComponent();
styleButtonPanel.add(commandButtonStrip);
```

Let's unpack what is going on here.

A `CommandStripProjection` is created from two objects - a command group and a command strip presentation. The first one represents a logical group of our four `Command` objects to be treated as the content model of that vertical strip of buttons you see in the screenshot.

The second one is the presentation model for the button strip. It says that we want the strip to layout the buttons vertically, and configures vertical and horizontal gaps between those buttons.

What is a **projection**? A projection takes a content model (a group of four commands in our case) and defines a visual representation of that content model on that screen. For that, in addition to the content model it also needs a matching presentation model. Note how, in this particular case, the vertical orientation of the layout belongs in the presentation model. And the logic of what happens when the button that represents a command belongs in the content model.

After our projection object is constructed, we call a `buildComponent` on it. This gives us a Swing component (or container) that can be added to our window hierarchy.
