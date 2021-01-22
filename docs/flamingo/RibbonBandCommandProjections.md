## Flamingo - ribbon band command projections

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon/content/content-intro.png" width="1433" border=0/>

[Command projections](CommandProjections.md) are the first type of content that can be placed in a ribbon band. Let's take a look at the various moving pieces involved in configuring a couple of command projections in the leftmost "Clipboard" band in the screenshot above.

### Command

We first start by configuring our [command](Command.md):

```java
this.pasteCommand = Command.builder()
        .setText(resourceBundle.getString("Paste.text"))
        .setIconFactory(Edit_paste.factory())
        .setAction(commandActionEvent -> System.out.println("Pasted!"))
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
```

where the secondary content is five commands split into two command groups:

```java
MessageFormat mf = new MessageFormat(resourceBundle.getString("TestMenuItem.text"));
mf.setLocale(currLocale);

this.popupCommand1 = Command.builder()
        .setText(mf.format(new Object[] { "1" }))
        .setIconFactory(ColorResizableIcon.factory(new Color(0xFF80DEEA)))
        .setAction(commandActionEvent ->
                System.out.println("Test menu item 1 activated"))
        .build();
this.popupCommand2 = Command.builder()
        .setText(mf.format(new Object[] { "2" }))
        .setIconFactory(ColorResizableIcon.factory(new Color(0xFF80CBC4)))
        .setAction(commandActionEvent ->
                System.out.println("Test menu item 2 activated"))
        .build();
this.popupCommand3 = Command.builder()
        .setText(mf.format(new Object[] { "3" }))
        .setIconFactory(ColorResizableIcon.factory(new Color(0xFFA5D6A7)))
        .setAction(commandActionEvent ->
                System.out.println("Test menu item 3 activated"))
        .build();
this.popupCommand4 = Command.builder()
        .setText(mf.format(new Object[] { "4" }))
        .setIconFactory(ColorResizableIcon.factory(new Color(0xFFC5E1A5)))
        .setAction(commandActionEvent ->
                System.out.println("Test menu item 4 activated"))
        .build();
this.popupCommand5 = Command.builder()
        .setText(mf.format(new Object[] { "5" }))
        .setIconFactory(ColorResizableIcon.factory(new Color(0xFFE6EE9C)))
        .setAction(commandActionEvent ->
                System.out.println("Test menu item 5 activated"))
        .build();

List<Command> menuCommands1 = Arrays.asList(
        this.popupCommand1, this.popupCommand2, this.popupCommand3);
List<Command> menuCommands2 = Arrays.asList(
        this.popupCommand4, this.popupCommand5);

this.popupMenuContentModel = new CommandMenuContentModel(
        Arrays.asList(new CommandGroup(menuCommands1),
                new CommandGroup(menuCommands2)));
```

and this is how that secondary content looks like when it is shown as a [popup menu](CommandPopupMenu.md):

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon/content/content-command-popup.png" width="1433" border=0/>

### Command projection

Now, we combine this command with a [command button presentation](CommandButtonPresentation.md) to create a [command projection](CommandProjections.md):

```java
CommandButtonProjection pasteCommandProjection = this.pasteCommand.project(
        CommandButtonPresentationModel.builder()
                .setTextClickAction()
                .setActionKeyTip("Y")
                .setPopupKeyTip("V")
                .build());
```

Note that here we are not explicitly specifying the presentation state for this content. Ribbon is a highly dynamic container that reconfigures the presentation of its content on the fly as it is resized - based on the available horizontal space.

We're almost ready to add this command projection to the ribbon band. The last step is to configure the action key tips for the secondary / popup content. Since commands in this secondary content can be used elsewhere in the ribbon, the action key tips are configured not at the level of each such command itself, but rather at the level of the command projection that is using those commands in its secondary content:

```java
Map<Command, CommandButtonPresentationModel.Overlay> pasteOverlays = new HashMap<>();
pasteOverlays.put(this.popupCommand1,
        CommandButtonPresentationModel.overlay().setActionKeyTip("1"));
pasteOverlays.put(this.popupCommand2,
        CommandButtonPresentationModel.overlay().setActionKeyTip("2"));
pasteOverlays.put(this.popupCommand3,
        CommandButtonPresentationModel.overlay().setActionKeyTip("3"));
pasteOverlays.put(this.popupCommand4,
        CommandButtonPresentationModel.overlay().setActionKeyTip("4"));
pasteOverlays.put(this.popupCommand5,
        CommandButtonPresentationModel.overlay().setActionKeyTip("5"));
pasteCommandProjection.setCommandOverlays(pasteOverlays);
```

Now we can add our command projection:

```java
clipboardBand.addRibbonCommand(pasteCommandProjection,
        JRibbonBand.PresentationPriority.TOP);
```

Before we discuss the presentation priority parameter, let's take a look at how the action key tips for this secondary content look like when activated:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon/bands/command-popup-keytips.png" width="1400" border=0/>

### Presentation priority

Now let's go back to the second parameter of the `JRibbonBand.addRibbonCommand` - the presentation priority. It is a hint to the ribbon's built-in layout logic that is used to decide how to layout content in each ribbon band of the currently selected task, and what the presentation state of each command projection should be.

In this particular case, `PresentationPriority.TOP` results in the "Paste" command projection to be displayed in 'BIG' presentation state.

Now, why is the "Paste" command projection displayed as 'BIG' spanning the full height of the band, while the other three command projections (Cut, Copy and Format) are displayed as `MEDIUM`, each spanning one third of the band height? Here is how these projections are defined and added to the ribbon band:

```java
clipboardBand.addRibbonCommand(
        Command.builder()
                .setText(resourceBundle.getString("Cut.text"))
                .setIconFactory(Edit_cut.factory())
                .setAction(commandActionEvent -> System.out.println("Cut!"))
                .setActionRichTooltip(RichTooltip.builder()
                        .setTitle(resourceBundle.getString("Cut.text"))
                        .addDescriptionSection(resourceBundle
                                .getString("Cut.tooltip.actionParagraph1"))
                        .build())
                .setSecondaryContentModel(this.popupMenuContentModel)
                .build()
                .project(CommandButtonPresentationModel.builder()
                        .setPopupKeyTip("X")
                        .setTextClickAction()
                        .build()),
        JRibbonBand.PresentationPriority.MEDIUM);
```

Each one of these is added with `PresentationPriority.MEDIUM`. When there is enough horizontal space, each one is displayed at `MEDIUM` presentation state. But if the ribbon is resized to be more narrow, those projections will be in the `SMALL` presentation state instead (displaying only their icon):

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize4.png" width="1020" border=0/>

This is controlled at the level of the band in this particular demo:

```java
List<RibbonBandResizePolicy> resizePolicies = new ArrayList<>();
resizePolicies.add(new CoreRibbonResizePolicies.Mirror(clipboardBand));
resizePolicies.add(new CoreRibbonResizePolicies.Mid2Low(clipboardBand));
clipboardBand.setResizePolicies(resizePolicies);
```

The first `Mirror` policy means that the layout should respect the presentation priority of each command projection. The second `Mid2Low` policy means that under smaller available horizontal space, the layout can switch command projections at `MEDIUM` presentation priority to be displayed at `SMALL` presentation state.

### Rich tooltips

Let's take another look at our "Paste" command:

```java
```java
this.pasteCommand = Command.builder()
        ...
        .setAction(commandActionEvent -> System.out.println("Pasted!"))
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
```


Rich tooltips associated with action and secondary content of the original command are displayed under the parent ribbon band:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon/content/content-command-actiontip.png" width="1433" border=0/>

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon/content/content-command-popuptip.png" width="1433" border=0/>

### Complex popups

As discussed in the [popup menu documentation](CommandPopupMenu.md), applications can configure more complex secondary content for any given command:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon/content/content-command-complexpopup.png" width="1433" border=0/>

### Next

Continue to the [ribbon band component projections](RibbonBandComponentProjections.md).
