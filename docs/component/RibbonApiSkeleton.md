## Components - ribbon API skeleton

As the following sections will take a deep dive into how the ribbon is built bottom-up, here is a skeleton overview of how the ribbon is built top-down.

### Ribbon frame and ribbon

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/ribbon/ribbon-start.png" width="1181" border=0/>

The `JRibbonFrame` is the only officially supported way to use the Radiance ribbon component. Its implementation enforces that the ribbon is always at the `BorderLayout.NORTH` location, throwing `IllegalArgumentException` on attempts to set a custom layout manager, add another component at `BorderLayout.NORTH`, remove the ribbon component, set a custom menu bar, content pane or any other operation that interferes with the intended hierarchy of this frame.

Call `JRibbonFrame.getRibbon()` to get a `JRibbon` object that represents the ribbon itself.

### Adding ribbon content

Ribbon tasks (see the section below) are added with `JRibbon.addTask(RibbonTask)` API. Contextual task groups are added with `JRibbon.addContextualTaskGroup(RibbonContextualTaskGroup)` API.

Ribbon taskbar content is added with the following APIs:
- Regular command ([projections](CommandProjections.md)) with `JRibbon.addTaskbarCommand(Command)` API.
- Component projections with `JRibbon.addTaskbarComponent(ComponentProjection)` API.
- Ribbon galleries represented as dropdown buttons with `JRibbon.addTaskbarGalleryDropdown(RibbonGalleryProjection)` API.
- Links to application menu content represented as command projections with `JRibbon.addTaskbarAppMenuLink(Command)` API.

Anchored commands are added with `JRibbon.addAnchoredCommand(CommandButtonProjection)` API.

Application menu content is set with `JRibbon.setApplicationMenuCommand(RibbonApplicationMenuCommandButtonProjection)` API.

Contextual menu listener is set with `JRibbon.setOnShowContextualMenuListener(OnShowContextualMenuListener)` API.

### Ribbon tasks and bands

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/ribbon/ribbon-start.png" width="1181" border=0/>

Each ribbon task is represented by the `RibbonTask` class. It provides constructors to initialize the task content with the task title and the list of the task's bands:

```java
RibbonTask pageLayoutTask = new RibbonTask(
        resourceBundle.getString("PageLayout.textTaskTitle"), clipboardBand,
        quickStylesBand, fontBand, documentBand, findBand);
```

The `AbstractRibbonBand` is the base class for ribbon bands. There are two types of bands - general and flow.

A flow band can be seen in the screenshot above in the middle of the ribbon - the "Font" band with two comboboxes in the first row and three [command strips](CommandStrip.md) in the second row. When the ribbon is resized and horizontal space is reduced, a flow band can switch from two-row to three-row layout.

To create a new flow band, use one of the constructors of the `JFlowRibbonBand` class:

```java
JFlowRibbonBand fontBand = new JFlowRibbonBand(
        resourceBundle.getString("Font.textBandTitle"), Preferences_desktop_font.factory(),
        new ExpandActionListener());
```

To add content to a flow band, use `JFlowRibbonBand.addFlowComponent()` APIs:

```java
fontBand.addFlowComponent(new RibbonComboBoxProjection(this.fontComboBoxModel,
        ComponentPresentationModel.builder().setKeyTip("SF").build()));

CommandStripProjection indentStripProjection = new CommandStripProjection(
        new CommandGroup(indentLeft, indentRight),
        CommandStripPresentationModel.withDefaults());
fontBand.addFlowComponent(indentStripProjection);
```

All the other bands in the screenshot above are general bands. A general band can host command projections, component projections and in-ribbon galleries.

The "Clipboard" band in the screenshot above hosts four command projections - Paste, Cut, Copy and Format. The first is configured to have `TOP` priority and is displayed in `BIG` [presentation state](CommandButtonPresentation.md). The other three are configured to have `MEDIUM` priority. When there is enough horizontal space, each one is displayed in 'MEDIUM' presentation state, and the overall layout is a vertical stack of three buttons. When horizontal space is reduced, these buttons can switch to the `SMALL` presentation state.

To add a command (projection) to a general ribbon band, use the `JRibbonBand.addRibbonCommand()` API:

```java
clipboardBand.addRibbonCommand(
        Command.builder().setText(resourceBundle.getString("Cut.text"))
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

To add a component projection to a general ribbon band, use the `JRibbonBand.addRibbonComponent()` API:

```java
showHideBand.addRibbonComponent(new RibbonCheckBoxProjection(
        RibbonCheckBoxContentModel.builder()
                .setText(resourceBundle.getString("Gridlines.text"))
                .build(),
        ComponentPresentationModel.builder().setKeyTip("SG").build()));
```

The "Quick Styles" band shows an in-ribbon gallery. In-ribbon galleries are configured to display a certain (usually small) number of selections, with a vertical strip right next to them to scroll the selections inline up and down, and display the available selections in a larger popup:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/ribbon/ribbon-gallery-expanded.png" width="1181" border=0/>

To add an in-ribbon gallery to a general ribbon band, use the `JRibbonBand.addRibbonGallery()` API:

```java
RibbonGalleryProjection quickStylesGalleryProjection =
        new RibbonGalleryProjection(this.styleGalleryContentModel,
                RibbonGalleryPresentationModel.builder()
                        .setPreferredVisibleCommandCounts(stylesGalleryVisibleCommandCounts)
                        .setPreferredPopupMaxVisibleCommandRows(3)
                        .setPreferredPopupMaxCommandColumns(3)
                        .setCommandPresentationState(JRibbonBand.BIG_FIXED_LANDSCAPE)
                        .setExpandKeyTip("L")
                        .build());
quickStylesBand.addRibbonGallery(quickStylesGalleryProjection,
        JRibbonBand.PresentationPriority.TOP);
```

### Ribbon band resize policies

The `AbstractRibbonBand.setResizePolicies(List<RibbonBandResizePolicy>)` API controls what happens when the ribbon is resized horizontally, and how the available horizontal space is distributed among the ribbon band content in the currently selected ribbon task. Here's an example of configuring a ribbon band with two built-in resize policies:

```java
List<RibbonBandResizePolicy> resizePolicies = new ArrayList<>();
resizePolicies.add(new CoreRibbonResizePolicies.Mirror(clipboardBand));
resizePolicies.add(new CoreRibbonResizePolicies.Mid2Low(clipboardBand));
clipboardBand.setResizePolicies(resizePolicies);
```

### Next

Continue to the [ribbon band command projections](RibbonBandCommandProjections.md).
