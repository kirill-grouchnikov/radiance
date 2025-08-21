## Radiance look and feel - renderers

### Basics

Swing's core approach to visualizing large sets of data as lists, trees or tables is to use renderers that "rubber stamp" individuals cells during the drawing pass.

For example, a table with 20 rows and 10 columns does not contain 200 child views (or one for each cell). Instead, the `JTableColumn.setCellRenderer` and `JTable.setDefaultRenderer` APIs are used to configure the renderer(s) for specific data types (checkbox for boolean values, labels for strings, etc). At runtime, the same renderer instance is used to paint (or rubber stamp) the visuals for all the cells in the column or of the specific data type. Transitioning to the edit mode (usually double-clicking a cell) adds an actual interactive child hierarchy configured by `JTableColumn.setCellEditor`, `JTable.setDefaultEditor` and `JTable.setCellEditor`.

### Radiance label-based renderers

The `org.pushingpixels.radiance.theming.api.renderer` package provides base renderer classes for consistent layout metrics and visuals. The following classes extend the matching default core renderers and apply consistent margins, paddings, fonts, foreground and background colors (including highlight animations), as well as odd-even background striping:

* `RadianceDefaultListCellRenderer` for `JList`
* `RadianceDefaultComboBoxRenderer` for `JComboBox`
* `RadianceDefaultTreeCellRenderer` for `JTree`
* `RadianceDefaultTableCellRenderer` for `JTable`
* `RadianceDefaultTableHeaderCellRenderer` for `JTableHeader`

If you do not configure a custom renderer for one of your data containers, a matching default renderer provided by Radiance will be used. Otherwise, it is highly recommended to extend the matching renderer classes for consistent visuals throughout your app.

### Complex Radiance list renderers

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/complex-list-renderer.png" width="546" border=0/>

[VisorMail](https://github.com/kirill-grouchnikov/radiance/tree/sunshine/demos/theming-apps/src/main/java/org/pushingpixels/radiance/demo/themingapps/mail) demo app illustrates the usage of `RadiancePanelListCellRenderer` base class for more complex `JList` content. It is used in the destinations list on the left to host three labels (icon, destination name, unread count) and in the threads list in the middle to host six labels across three rows.

In both cases the [highlights](painters/highlight.md) configured on the matching [decoration areas](painters/decoration.md) provide "special" visuals for highlighted rows - those that are in selected, rollover, armed or pressed state. In addition to configuring the background and foreground colors for the highlights at the skin level, during rendering the `RadiancePanelListCellRenderer` calls its abstract `bindRenderer` method. Here, the application should:

* Bind the relevant data fields to the sub-components present in your renderer panel (icons, labels, etc)
* Use the incoming container color tokens to configure the visuals of the relevant sub-components - text color, icon color, outlines, etc

Here is how this flow looks like for the leftmost destinations list. The data model content is configured statically in this sample app:

```java
JList<DestinationInfo> destinationList = new JList<>(new DestinationListModel(
    new DestinationInfo(ic_inbox_black_24px.factory(), "Inbox", 6),
    new DestinationInfo(ic_send_black_24px.factory(), "Sent", 3),
    new DestinationInfo(ic_watch_later_black_24px.factory(), "Send later", 5),
    new DestinationInfo(ic_drafts_black_24px.factory(), "Drafts", -1),
    new DestinationInfo(ic_star_border_black_24px.factory(), "Starred", -1),
    new DestinationInfo(ic_delete_black_24px.factory(), "Trash", -1)));
destinationList.setCellRenderer(new DestinationRenderer());
```

We extend the base Radiance panel-based renderer:

```java
private static class DestinationRenderer extends
        RadiancePanelListCellRenderer<DestinationInfo> {
    private JLabel iconLabel;
    private JLabel titleLabel;
    private ContainedLabel unreadLabel;
```

The constructor uses `FormLayout` to configure the layout constraints and registers the three labels to be theme-aware so that at runtime these labels will participate in correct highlight animation sequences driven by Radiance:

```java
public DestinationRenderer() {
    FormBuilder builder = FormBuilder.create().
          columns("center:pref, 4dlu, fill:pref:grow, 4dlu, center:pref").
          rows("p").
          padding(new EmptyBorder(8, 8, 8, 8));

    this.iconLabel = new JLabel();
    this.titleLabel = new JLabel();
    this.unreadLabel = new JLabel();
    builder.add(this.iconLabel).xy(1, 1);
    builder.add(this.titleLabel).xy(3, 1);
    builder.add(this.unreadLabel).xy(5, 1);

    this.setLayout(new BorderLayout());
    this.add(builder.build(), BorderLayout.CENTER);

    this.setOpaque(false);
}
```

The renderer binding wires the data from the data model to the labels that are part of our renderer, as well as configuring the color tokens to use on different parts of the UI:

```java
@Override
protected void bindRenderer(JList<? extends DestinationInfo> list, DestinationInfo value,
    int index, ContainerColorTokens colorTokens) {

    // Bind data
    this.titleLabel.setText(value.title);
    this.unreadLabel.setText(value.unread > 0 ? Integer.toString(value.unread) : "");

    // Configure colors
    this.iconLabel.setForeground(colorTokens.getOnContainer());
    this.titleLabel.setForeground(colorTokens.getOnContainer());
    this.unreadLabel.setContainerColorTokens(colorTokens);

    // And icons
    RadianceIcon icon = value.iconFactory.createNewIcon();
    icon.setColorFilter(color -> colorTokens.getOnContainer());
    icon.setDimension(new Dimension(16, 16));
    this.iconLabel.setIcon(icon);
}
```

Our `ContainedLabel` has custom drawing for the unread label, styling it as a rounded badge, using:

* `containerSurfaceLow` color token for the badge fill
* `containerOutlineVariant` color token for the badge outline
* `onContainerVariant` color token for the badge text

```java
private static class ContainedLabel extends JPanel {
    private JLabel label;
    private ContainerColorTokens containerColorTokens;

    public ContainedLabel() {
        this.label = new JLabel();
        this.setLayout(new BorderLayout());
        this.setBorder(new EmptyBorder(2, 10, 2, 10));
        this.add(this.label, BorderLayout.CENTER);
        this.setOpaque(false);
    }

    public void setContainerColorTokens(ContainerColorTokens containerColorTokens) {
        this.containerColorTokens = containerColorTokens;
        this.label.setForeground(containerColorTokens.getOnContainerVariant());
        this.repaint();
    }

    public void setText(String text) {
        this.label.setText(text);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.containerColorTokens == null) {
            return;
        }

        String text = this.label.getText();
        if ((text == null) || text.isEmpty()) {
            return;
        }

        Graphics2D g2d = (Graphics2D) g.create();

        int width = this.getWidth();
        int height = this.getHeight();

        RadianceCommonCortex.paintAtScale1x(g2d, 0, 0, width, height,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                // Inner fill
                graphics1X.setColor(this.containerColorTokens.getContainerSurfaceLow());
                graphics1X.fill(new RoundRectangle2D.Float(0.5f, 0.5f,
                    scaledWidth - 2.0f, scaledHeight - 2.0f,
                    scaledHeight - 2.0f, scaledHeight - 2.0f));

                // Outline
                graphics1X.setColor(this.containerColorTokens.getContainerOutlineVariant());
                graphics1X.draw(new RoundRectangle2D.Float(0.0f, 0.0f,
                    scaledWidth - 1.0f, scaledHeight - 1.0f,
                    scaledHeight - 2.0f, scaledHeight - 2.0f));
            });


        g2d.dispose();
    }
}
```

At runtime, the highlighted destination is using the light-yellow background fill and slightly darker text / icon foreground colors. The same flow applies to the threads list that is using white-on-blue highlight visuals for its content.

### Complex Radiance tree renderers

For more complex `JTree` content, use `RadiancePanelTreeCellRenderer` with the same implementation of the abstract `bindRenderer` method as documented for complex list renderers in the previous section.
