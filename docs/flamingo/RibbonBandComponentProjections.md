## Flamingo - ribbon band component projections

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/content/content-intro.png" width="1433" border=0/>

Component projections are the second type of content that can be placed in a ribbon band. In the screenshot above these can be seen in the "Font" ribbon band in the middle of the ribbon. The top row has two comboboxes, and the bottom row has three [command button strips](CommandStrip.md). Let's take a look at the various moving pieces involved in configuring such component projections.

### Base projections

The first type of component projections is available by using the `JFlowRibbonBand.addFlowComponent(Projection)` API. Here is the complete code for adding the first command strip (with two commands - indent left and indent right) to the "Font" ribbon band:

```java
Command indentLeft = Command.builder()
        .setIconFactory(Format_indent_less.factory())
        .setAction((CommandActionEvent e) -> System.out.println("<- Left"))
        .build();
Command indentRight = Command.builder()
        .setIconFactory(Format_indent_more.factory())
        .setAction((CommandActionEvent e) -> System.out.println("-> Right"))
        .build();
Map<Command, CommandButtonPresentationModel.Overlay> indentOverlays = new HashMap<>();
indentOverlays.put(indentLeft,
        CommandButtonPresentationModel.overlay().setActionKeyTip("AO"));
indentOverlays.put(indentRight,
        CommandButtonPresentationModel.overlay().setActionKeyTip("AI"));

CommandStripProjection indentStripProjection = new CommandStripProjection(
        new CommandGroup(indentLeft, indentRight),
        CommandStripPresentationModel.withDefaults());
indentStripProjection.setCommandOverlays(indentOverlays);
fontBand.addFlowComponent(indentStripProjection);
```

The steps are:

- Create commands
- Configure presentation overlays for action key tips
- Create the content model (`CommandGroup`) and presentation model (`CommandStripPresentationModel`), and combine them into the projection (`CommandStripProjection`)
- Call `JFlowRibbonBand.addFlowComponent()` to add that projection to the ribbon band

### Wrapper projections

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/content/content-combobox-tip.png" width="1325" border=0/>

This component projection can be added to both flow and general ribbon bands with the following APIs:

- `JFlowRibbonBand.addFlowComponent(ComponentProjection)`
- `JRibbonBand.addRibbonComponent(ComponentProjection)`

In the screenshot above, both comboboxes in the "Font" flow ribbon band were added as wrapper projections. This is what allows associating the rich tooltip with these comboboxes - as shown in that screenshot right under the "Font" band.

Wrapper projections follow the same overall approach of [Flamingo projections](Intro.md):

- **content model + presentation model &#8594; projection**
- **projection &#8594; one or more Swing components**

The `org.pushingpixels.flamingo.api.ribbon.synapse` package and its `model` and `projection` sub-packages provide APIs to wrap a number of core Swing components and expose them via the Flamingo projection model. Here are a couple of examples.

#### Wrapping `JComboBox`

We start by defining our content model:

```java
this.fontComboBoxModel = RibbonDefaultComboBoxContentModel.<String>builder()
        .setItems(new String[] {
                "+ Minor (Calibri)   ", "+ Minor (Columbus)   ",
                "+ Minor (Consolas)   ", "+ Minor (Cornelius)   ",
                "+ Minor (Cleopatra)   ", "+ Minor (Cornucopia)   ",
                "+ Minor (California)   ", "+ Minor (Calendula)   ",
                "+ Minor (Coriander)   ", "+ Minor (Callisto)   ",
                "+ Minor (Cajun)   ", "+ Minor (Congola)   ",
                "+ Minor (Candella)   ", "+ Minor (Cambria)   " })
        .setRichTooltip(RichTooltip.builder()
                .setTitle(resourceBundle.getString("Fonts.tooltip.title"))
                .build())
        .build();
```

Here our content model is an array of strings, with an associated rich tooltip. Now we attach a `ListDataListener` to keep track of selection changes so that we can invoke the relevant application logic (such as changing the font used in the current text selection, for example):

```java
this.fontComboBoxModel.addListDataListener(new ListDataListener() {
    Object selected = fontComboBoxModel.getSelectedItem();

    @Override
    public void intervalAdded(ListDataEvent e) {
    }

    @Override
    public void intervalRemoved(ListDataEvent e) {
    }

    @Override
    public void contentsChanged(ListDataEvent e) {
        Object newSelection = fontComboBoxModel.getSelectedItem();
        if (this.selected != newSelection) {
            System.out.println("New font selection -> " + newSelection);
            this.selected = newSelection;
        }
    }
});
```

Now we combine this content model with a simple presentation model that associates a key tip during the projection, and create a `RibbonComboBoxProjection` object to be passed to the `JFlowRibbonBand.addFlowComponent()` API:

```java
fontBand.addFlowComponent(new RibbonComboBoxProjection(this.fontComboBoxModel,
        ComponentPresentationModel.builder().setKeyTip("SF").build()));
```

#### Wrapping `JCheckBox`

We start again by defining the content model:

```java
this.rulerCheckBoxModel = RibbonCheckBoxContentModel.builder()
        .setText(resourceBundle.getString("Ruler.text"))
        .setSelected(true)
        .setActionListener((ActionEvent ae) ->
                System.out.println("Ruler selection --> " + rulerCheckBoxModel.isSelected()))
        .build();
```

Here we are using the `RibbonCheckBoxContentModel` class and its builder to create a content model with selection initialized to `true`, and an associated action listener that will be invoked whenever a Swing checkbox projected from this content model will change its selection.

And then we combine this content model with a simple presentation model that associates a key tip during the projection, and create a `RibbonCheckBoxProjection` object to be passed to the `JFlowRibbonBand.addFlowComponent()` API:

```java
showHideBand.addRibbonComponent(new RibbonCheckBoxProjection(
        this.rulerCheckBoxModel,
        ComponentPresentationModel.builder().setKeyTip("SR").build()));
```

#### Wrapping `JSpinner`

We start again by defining the content model:

```java
this.indentLeftSpinnerModel = RibbonSpinnerNumberContentModel.builder()
        .setValues(0, 0, 100, 5)
        .setIconFactory(Format_justify_left.factory())
        .setCaption(resourceBundle.getString("IndentLeft.text"))
        .setRichTooltip(RichTooltip.builder()
                .setTitle(resourceBundle.getString("IndentLeft.tooltip.title"))
                .addDescriptionSection(resourceBundle.getString(
                        "IndentLeft.tooltip.actionParagraph1"))
                .addDescriptionSection(resourceBundle.getString(
                        "IndentLeft.tooltip.actionParagraph2"))
                .build())
        .build();
```

Here we are using the `RibbonSpinnerNumberContentModel` class and its builder to create a content model that will "add" a leading caption and icon to the left of the wrapped spinner itself.

And then we combine this content model with a simple presentation model that associates a key tip during the projection, and create a `RibbonCheckBoxProjection` object to be passed to the `JRibbonBand.addRibbonComponent()` API:

```java
paragraphBand.addRibbonComponent(new RibbonSpinnerProjection(
        this.indentLeftSpinnerModel,
        ComponentPresentationModel.builder()
                .setKeyTip("PL")
                .build()));
```

Note that, unlike `JRibbonBand.addRibbonCommand()` API, the `JRibbonBand.addRibbonComponent()` does not take a presentation state parameter. Wrapped components are always projected with however much width they need, and they get one third of the available ribbon band height.

### Next

Continue to the [in-ribbon galleries](RibbonBandGalleries.md).
