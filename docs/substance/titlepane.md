## Substance look and feel - title pane

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/visor-mail.png" width="720" border=0 align="right"/>

### Introduction

Substance provides a collection of APIs to configure the layout inside and around the title pane area of application windows.

In the screenshot above, the title pane control buttons (minimize, maximize, close) are on the left. In addition, each one of the three panes (folders, thread list, email thread) "pushes" some of its content into the title pane area:

* The refresh icon in the folders pane
* The search box in the thread list pane
* Action icons in the email thread pane

Let's see what APIs Substance provides to achieve this functionality.

### Title content gravity

Use `SubstanceCortex.GlobalScope.configureTitleContentGravity()` API to configure the overall layout of the "core" content of the title pane - title text, application icon and control buttons:

* The first parameter controls the gravity of the title text itself - leading, centered, trailing, platform-based or default Swing.
* The second parameter controls the gravity of the control buttons - leading, trailing, platform-based or default Swing.
* The third parameter controls the gravity of the application icon - none (icon not shown), next to title text, opposite of control buttons, platform-based or default Swing.

### Extending application content into the title pane

The following APIs are available on `SubstanceCortex.WindowScope`:


* `extendContentIntoTitlePane(Window, SubstanceSlices.HorizontalGravity, SubstanceSlices.VerticalGravity)` to marks the specified window to have its content extend vertically into the title pane area.
* `getTitlePaneControlInsets(Window)` to query the insets that should be reserved for the main control buttons – close / maximize / minimize.
* `setPreferredTitlePaneHeight(Window, int)` to increase the preferred height of the title pane area in case the content you extend into that area is taller than the main control buttons.
* `getTitleControlButtonGroupHorizontalGravity(Window window)` to get the horizontal gravity for the control button group.
* `createTitlePaneControlButton(Window)` to get a button that has consistent visual appearance and preferred size with the main control buttons.

Let's see a couple of examples.

### Example A

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/visor-mail.png" width="720" border=0 align="right"/>

In this example, we configure the frame as:

```java
// Extend our content into the title pane and configure the title control buttons to be
// vertically centered and in the leading horizontal position (in our main selector
// pane).
SubstanceCortex.WindowScope.extendContentIntoTitlePane(visorMail,
        SubstanceSlices.HorizontalGravity.LEADING,
        SubstanceSlices.VerticalGravity.CENTERED);

// And increase the height of the title pane to play nicer with additional
// content that we are displaying in that area.
SubstanceCortex.WindowScope.setPreferredTitlePaneHeight(visorMail, 40);
```

The first call "moves" the control buttons to the leading position - which is the left edge of the title pane under left-to-right orientation. The second call increases the title pane height to 40 pixels to accommodate taller content - such as the search box. Note the second parameter in the first call, instructing Substance to vertically center the control buttons in the taller title pane.

In addition, we're also using `SubstanceCortex.WindowScope.createTitlePaneControlButton()` API to create the refresh button in the first (folders) pane:

```java
// Use Substance API to create a button that has consistent look with the
// title pane control buttons
JButton refreshButton = SubstanceCortex.WindowScope.createTitlePaneControlButton(window);

refreshButton.setIcon(icon);
refreshButton.setToolTipText("Refresh mail");
builder.add(refreshButton).xy(1, 1);
```

### Example B

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/visor-chat.png" width="720" border=0 align="right"/>

We first configure the gravity of the control buttons to leading, along with increased title pane height to accommodate custom content:

```java
SubstanceCortex.WindowScope.extendContentIntoTitlePane(this,
        SubstanceSlices.HorizontalGravity.LEADING,
        SubstanceSlices.VerticalGravity.CENTERED);
SubstanceCortex.WindowScope.setPreferredTitlePaneHeight(this, 40);
```

And now we want to make sure that the leading "New chat" button does not go into the area reserved for the control buttons. Here is the full code for the layout of this custom title pane:

```java
FormBuilder builder = FormBuilder.create().
        columns("pref, 8dlu, center:0dlu:grow, 8dlu, pref, 8dlu, pref, 8dlu, pref").
        rows("p").
        padding(new EmptyBorder(8,
                12 + SubstanceCortex.WindowScope.getTitlePaneControlInsets(this).left,
                0, 12));

builder.add(new JButton("New chat")).xy(1, 1);

JLabel titleLabel = new JLabel("Chat", ic_chat_black_24px.of(16, 16), JLabel.CENTER);
titleLabel.setIconTextGap(6);
titleLabel.setFont(SubstanceCortex.GlobalScope.getFontPolicy().getFontSet()
        .getWindowTitleFont().deriveFont(16.0f));
builder.add(titleLabel).xy(3, 1);

builder.add(new JTextField(12)).xy(5, 1);
builder.add(new JLabel(ic_help_outline_black_24px.of(14, 14))).xy(7, 1);
builder.add(new JLabel(ic_person_black_24px.of(12, 12))).xy(9, 1);

JPanel titlePane = builder.build();
titlePane.setPreferredSize(new Dimension(100, 40));
titlePane.setOpaque(true);
ComponentOrParentChainScope.setDecorationType(titlePane,
        DecorationAreaType.PRIMARY_TITLE_PANE);

this.getContentPane().add(titlePane, BorderLayout.NORTH);
```

The important part is the call to `SubstanceCortex.WindowScope.getTitlePaneControlInsets` which is then used to configure the padding on the `FormBuilder`.
