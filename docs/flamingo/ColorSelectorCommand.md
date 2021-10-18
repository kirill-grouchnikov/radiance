## Flamingo - command popup menus

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/color-selector-command1.png" width="665" border=0/>

A projection of a color selector command is a popup button ("Styles3" button in the screenshot above) that displays a popup menu with regular commands and additional, optional three color selector panels:
- color section with derived colors
- regular color section
- color section with recently selected colors

### Content model

`org.pushingpixels.flamingo.api.common.model.ColorSelectorCommand` is the content model for color selector commands. It extends the [core `Command`](Command.md) content model. Thus anything that can be configured on a regular command (text, icon factory, etc) can be configured on a color selector command.

The only additional attribute that `ColorSelectorCommand.Builder` adds is the `colorSelectorPopupMenuContentModel` - of type `ColorSelectorPopupMenuContentModel`. Let's take a look at the content model for the color selector popup menu.

### Color selector popup menu content model

The constructor of `ColorSelectorPopupMenuContentModel` accepts a list of `ColorSelectorPopupMenuGroupModel` objects. Each such group model is created with the usual builder pattern. The following four types of popup menu groups are supported by the `GroupEntryKind` enum:

- `COMMAND` - regular command. In the screenshot above, the leading "Automatic" and the trailing "More colors" are regular commands. Use `Builder.addCommand(Command)` API.
- `COLOR_SECTION` - a single row of color selector cells. In the screenshot above it can be seen in the "Standard Colors" section. Use `Builder.addColorSection(ColorSectionModel)` API.
- `COLOR_SECTION_WITH_DERIVED` - a grid of color selector cells. In the screenshot above it can be seen in the "Theme Colors" section. Use `Builder.addColorSectionWithDerived(ColorSectionModel)` API.
- `RECENTS_SECTION` - a single row of selector cells based on recently selected colors. Use `Builder.addRecentsSection(ColorSectionModel)` API.

The inner `ColorSectionModel` class is a simple wrapper around string title and an array of `Color`s.

### Color activation and preview listeners

Same as with [command action](Command.md#action) and [command action preview](Command.md#action-preview), the `ColorSelectorPopupMenuContentModel` has APIs for the application code to be notified on user previewing and activating colors in the color selector popup menu.

For preview color events, the following interface is used:

```java
public interface ColorPreviewListener extends EventListener {
    /**
     * Invoked when the preview of a color in any of the color sections of this model is
     * activated.
     */
    void onColorPreviewActivated(Color color);

    /**
     * Invoked when the color preview has been canceled.
     */
    void onColorPreviewCanceled();
}
```

For activation color events, the following interface is used:

```java
public interface ColorActivationListener extends EventListener {
    /**
     * Invoked when a color in any of the color sections of this model is activated.
     */
    void onColorActivated(Color color);
}
```

### Sample code

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/color-selector-command2.png" width="546" border=0/>

First let's take a look at the functionality that we see in this screenshot, and then get to the code behind it.

- We have a small popup button that displays a color selector popup menu with five sections - "automatic" with hard-coded color, a grid of color selector cells based on "theme" colors, a single row of "standard" colors, another row of "recent" colors and a command that brings up a `JColorChooser`.
- Any color selected in the popup is automatically added to the "recent" color section.
- Any color selected in the popup also updates the background of the main panel.
- Any color selected in the popup also updates the icon of our popup button.
- Moving the mouse over any color cell in the popup menu shows the preview of that color - temporarily changing the background fill of the main panel for as long as that cell is under the mouse cursor. When the mouse moves out, the main panel reverts its background to the previous value.

#### Button icon

First we have a custom implementation of the `RadianceIcon` interface that paints a square fill with slightly darker outline based on the color passed to the constructor:

```java
private static class ColorIcon implements RadianceIcon {
    private int w;
    private int h;
    private Color color;

    private ColorIcon(Color color) {
        this.color = color;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(color);
        g2d.fillRect(x, y, w, h);
        float borderThickness = 1.0f / (float) RadianceCommonCortex.getScaleFactor();
        g2d.setColor(color.darker());
        g2d.setStroke(new BasicStroke(borderThickness, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND));
        g2d.draw(new Rectangle2D.Double(x, y, w - borderThickness, h - borderThickness));
        g2d.dispose();
    }

    @Override
    public int getIconWidth() {
        return w;
    }

    @Override
    public int getIconHeight() {
        return h;
    }

    @Override
    public void setDimension(Dimension newDimension) {
        w = newDimension.width;
        h = newDimension.height;
    }

    public static Factory factory(Color color) {
        return () -> new ColorIcon(color);
    }
}
```

#### Color preview and activation synchronization

Now, let's set up our panel and wire color preview and activation events to update the backround fill of the panel, as well as the button icon:

```java
// at the class level
private ColorSelectorCommand colorSelectorCommand;
private Color backgroundColor;

// somewhere in the constructor
final JPanel centerPanel = new JPanel();
backgroundColor = centerPanel.getBackground();

final ColorSelectorPopupMenuContentModel.ColorActivationListener colorActivationListener =
        (Color color) -> {
            backgroundColor = color;
            centerPanel.setBackground(backgroundColor);
            colorSelectorCommand.setIconFactory(ColorIcon.factory(backgroundColor));
        };
final ColorSelectorPopupMenuContentModel.ColorPreviewListener colorPreviewListener =
        new ColorSelectorPopupMenuContentModel.ColorPreviewListener() {
            @Override
            public void onColorPreviewActivated(Color color) {
                centerPanel.setBackground(color);
            }

            @Override
            public void onColorPreviewCanceled() {
                centerPanel.setBackground(backgroundColor);
            }
        };
```

What do we have here?

- Our `ColorActivationListener` updates the class-level `backgroundColor` field. It then calls `JPanel.setBackground()` on our main panel - with will cause a repaint pass. It also calls `Command.setIconFactory()` with a new variant of the above-shown `ColorIcon`. Remember that updating a command attribute will [automatically propagate](ModelProjectionOverview.md) to all the projected components.
- Our `ColorPreviewListener` calls `JPanel.setBackground()` in `onColorPreviewActivated`, causing a repaint pass. Then, in `onColorPreviewCanceled` it calls the same `JPanel.setBackground()` with the color tracked by the `backgroundColor` field, effectively resetting the panel fill preview to the previous color selection.

No we are ready to configure the color selector popup menu.

#### Adding the "automatic" color command

```java
final Color defaultPanelColor = centerPanel.getBackground();
ColorSelectorPopupMenuGroupModel.Builder selectorBuilder =
        ColorSelectorPopupMenuGroupModel.builder();

selectorBuilder.addCommand(Command.builder()
        .setText(resourceBundle.getString("ColorSelector.textAutomatic"))
        .setIconFactory(ColorIcon.factory(defaultPanelColor))
        .setAction(commandActionEvent -> {
            colorActivationListener.onColorActivated(defaultPanelColor);
            JColorSelectorPopupMenu.addColorToRecentlyUsed(defaultPanelColor);
        })
        .setActionPreview(new Command.CommandActionPreview() {
            @Override
            public void onCommandPreviewActivated(Command command) {
                colorPreviewListener.onColorPreviewActivated(defaultPanelColor);
            }

            @Override
            public void onCommandPreviewCanceled(Command command) {
                colorPreviewListener.onColorPreviewCanceled();
            }
        })
        .build());
```

We use another local variable to store the default / automatic background color as the initial color of our panel. Then we add a `Command` that is configured with:

- `iconFactory` to use the `ColorIcon` with the default panel color
- `action` to explicitly activate our color activation listener with the default panel color, and add that color to recently used
- `actionPreview` to explicitly activate our color preview listener

#### Adding a color section with a grid of derived colors

```java
selectorBuilder.addColorSectionWithDerived(
        new ColorSelectorPopupMenuGroupModel.ColorSectionModel(
                resourceBundle.getString("ColorSelector.textThemeCaption"),
                new Color[] { new Color(255, 255, 255), new Color(0, 0, 0),
                        new Color(160, 160, 160), new Color(16, 64, 128),
                        new Color(80, 128, 192), new Color(180, 80, 80),
                        new Color(160, 192, 80), new Color(128, 92, 160),
                        new Color(80, 160, 208), new Color(255, 144, 64) }));
```

We're using `Builder.addColorSectionWithDerived()`, passing a `ColorSectionModel` initialized with ten colors. Internally, each color will be used to generate additional five colors of varying brightness but the same hue and saturation:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/color-selector-command2.png" width="546" border=0/>

#### Adding a color section with a row of colors

```java
selectorBuilder.addColorSection(
        new ColorSelectorPopupMenuGroupModel.ColorSectionModel(
                resourceBundle.getString("ColorSelector.textStandardCaption"),
                new Color[] { new Color(140, 0, 0), new Color(253, 0, 0),
                        new Color(255, 160, 0), new Color(255, 255, 0),
                        new Color(144, 240, 144), new Color(0, 128, 0),
                        new Color(160, 224, 224), new Color(0, 0, 255),
                        new Color(0, 0, 128), new Color(128, 0, 128) }));
```

Here we're using `Builder.addColorSection()`, passing a `ColorSectionModel` initialized with ten colors.

#### Adding a recents color section

```java
selectorBuilder.addRecentsSection(
        new ColorSelectorPopupMenuGroupModel.ColorSectionModel(
                resourceBundle.getString("ColorSelector.textRecentCaption")));
```

We're using `Builder.addRecentsSection()`. Internally, any color selection made in any color selector popup menu will add the matching color to the recently selected list and display it the next time a color selector popup menu with a recents section is shown.

#### Adding a command to bring up the full color selector dialog

```java
selectorBuilder.addCommand(Command.builder()
        .setText(resourceBundle.getString("ColorSelector.textMoreColor"))
        .setAction(commandActionEvent -> SwingUtilities.invokeLater(() -> {
            Color color = JColorChooser.showDialog(MyFrame.this,
                    "Color chooser", backgroundColor);
            if (color != null) {
                colorActivationListener.onColorActivated(color);
                JColorSelectorPopupMenu.addColorToRecentlyUsed(color);
            }
        }))
        .build());
```

Here we have a `Command` configured to bring up a `JColorChooser` configured to display the current background color of our panel as the initial color. When a selection is made in that color chooser dialog, we explicitly activate our color activation listener, and add that color to recently used.

#### Bringing it all together to project a Swing button

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/color-selector-command2.png" width="546" border=0/>

```java
this.colorSelectorCommand = ColorSelectorCommand.colorSelectorBuilder()
        .setIconFactory(ColorIcon.factory(backgroundColor))
        .setColorSelectorPopupMenuContentModel(selectorModel)
        .build();
JCommandButton colorButton = new ColorSelectorCommandButtonProjection(
        this.colorSelectorCommand,
        CommandButtonPresentationModel.builder()
                .setPresentationState(CommandButtonPresentationState.SMALL)
                .setFlat(false)
                .build())
        .buildComponent();
```

- We use `ColorSelectorCommand.colorSelectorBuilder()` to get a `Builder` instance for our color selector command.
- The initial icon is set to be based on the default background color of our main panel. All color selections are wired to our main color activation listener that updates the command's icon factory with the newly selected color - automatically updating the projected `colorButton`.
- The `colorSelectorPopupMenuContentModel` is set to our popup menu content model.
- We use `ColorSelectorCommandButtonProjection` to combine our `ColorSelectorCommand` content model with a `CommandButtonPresentationModel` presentation model configured with `SMALL` presentation state and non-flat background fill.
- Finally, we call `ColorSelectorCommandButtonProjection.buildComponent()` to get a Swing `JCommandButton` component that we can add to our component hierarchy.

### Next

Continue to the [breadcrumb bar](BreadcrumbBar.md).
