## Radiance look and feel - decoration painters

Menu bars, tool bars, status bars - these are common examples of special containers found in application windows. These containers create functional grouping of application controls and bring order to complex screens. Radiance skinning layer provides a flexible and powerful set of APIs to define the visual appearance of these control groups - called **decoration areas**. At the same time, Radiance decoration painters enforce visual consistency and connections across the components in related areas and states. In addition, Radiance provides a set of published APIs for applications that wish to skin custom components and preserve visual consistency with the Swing controls painted by the core Radiance UI delegates.

### Decoration areas

The `RadianceThemingSlices.DecorationAreaType` class contains the available core decoration area types. As a picture is worth a thousand words, the following screenshots illustrate the different decoration area types.

The following screenshot is the main Radiance test application under the Gemini skin (click to see full size version):

<a href="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/decoration/full.png"><img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/decoration/thumb.png" width="600" height="448"/></a>

The next screenshot shows the `title` decoration area, which in this example includes the title pane of the main window:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/decoration/areas-title.png" width="600" height="448"/>

The next screenshot shows the `header` decoration area, which in this example includes the menu bar of the main window:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/decoration/areas-header.png" width="600" height="448"/>

The next screenshot shows the `toolbar` decoration area, which in this example includes the tool bar of the main window:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/decoration/areas-toolbar.png" width="600" height="448"/>

The next screenshot shows the `footer` decoration area, which in this example includes the status bar component:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/decoration/areas-footer.png" width="600" height="448"/>

The next screenshot shows the `control pane` decoration area, which in this example includes the task pane container component:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/decoration/areas-control-pane.png" width="600" height="448"/>

Let's go back to the original screenshot:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/decoration/thumb.png" width="600" height="448"/>

It illustrates that the specific skin assigns different color tokens to different decoration areas. The controls in those areas get the background and foreground colors based on their assigned color tokens (without any custom application code), thus creating visual distinction between different application areas.

### Inlay painters

Inlay painters provide the functionality of watermarks - a layer that is drawn above surfaces (background fills) but below content (texts, icons, etc).

This is how a custom inlay looks like under the Blueprint skin:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/decoration/inlays.png"/>

This skin emulates the visuals of construction blueprints that are drawn across all surfaces. The custom inlay painter is set on the skin's decoration painter:

```java
this.decorationPainter.setInlayPainter(new BlueprintDecorationInlayPainter());
```

### Overlay painters

Overlay painters add the final polish that usually affects relatively small areas at the edges of the relevant decoration areas.

Overlays are best illustrated with screenshots. The following screenshot is a skeleton window under the [Nebula Brick Wall](../skins/light-skins.md#nebula-brick-wall) skin:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/overlay/nebulabrickwall.png" width="646" height="446"/>

This skin defines custom visual appearance for the title pane, the menu bar and the status bar - the background of these areas is painted by the matching decoration painter - in this case, the `MarbleNoiseDecorationPainter`. To add the final polishing touch and create a unique visual footprint for this skin, we use a number of overlay painters. The Nebula Brick Wall skin defines two separate overlay painters, each one associated with the relevant decoration areas:

```java
// add an overlay painter to paint a drop shadow along the top
// edge of toolbars
this.addOverlayPainter(TopShadowOverlayPainter.getInstance(60),
    RadianceThemingSlices.DecorationAreaType.TOOLBAR);

// add an overlay painter to paint separator lines along the bottom
// edges of title panes and menu bars
this.bottomLineOverlayPainter = new BottomLineOverlayPainter(
    ContainerColorTokensSingleColorQuery.composite(
      ContainerColorTokens::getMarkerOnContainer,
      ColorTransform.alpha(128)));
this.addOverlayPainter(this.bottomLineOverlayPainter,
    RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
    RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
    RadianceThemingSlices.DecorationAreaType.HEADER);
```

* The `TopShadowOverlayPainter` is associated with the `toolbar` decoration area - adding the drop shadow along the top edge of all application toolbars (see the bottom half of the zoomed area in the screenshot above).
* The `BottomLineOverlayPainter` is associated with `title pane` and `header` decoration areas - adding a thin separator line along the bottom edge of the title pane and the menubar (see the top half of the zoomed area in the screenshot above). Note that the application needs to specify what color is used to paint the separator line - using the `org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery` - more on this interface later.

Here is the same skeleton window under the [Gemini](../skins/light-skins.md#gemini) skin:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/overlay/gemini.png" width="646" height="446"/>

This skin defines custom visual appearance for the title pane, the menu bar, the toolbars and the status bar - the background of these areas is painted by the matching [decoration painter](decoration.md) - in this case, the `MatteDecorationPainter`. To add the final polishing touch and create a unique visual footprint for this skin, we use overlay painters. The Gemini skin defines a number of overlay painters, each one associated with the relevant decoration areas:

```java
// add an overlay painter to paint a bezel line along the top
// edge of footer
RadianceDecorationPainter.OverlayPainter footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
    ContainerColorTokens::getComplementaryMarkerOnContainer,
    ContainerColorTokens::getMarkerOnContainer);
this.addOverlayPainter(footerTopBezelOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

// add two overlay painters to create a bezel line between
// menu bar and toolbars
BottomLineOverlayPainter menuOverlayPainter = new BottomLineOverlayPainter(
    ContainerColorTokens::getComplementaryMarkerOnContainer);
RadianceDecorationPainter.OverlayPainter toolbarOverlayPainter = new TopLineOverlayPainter(
    ContainerColorTokensSingleColorQuery.composite(
        ContainerColorTokens::getMarkerOnContainer,
        ColorTransform.alpha(128)));
this.addOverlayPainter(menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
this.addOverlayPainter(toolbarOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

// add overlay painter to paint drop shadows along the bottom
// edges of toolbars
this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
    RadianceThemingSlices.DecorationAreaType.TOOLBAR);

// add overlay painter to paint a dark line along the bottom
// edge of toolbars
RadianceDecorationPainter.OverlayPainter toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
    ContainerColorTokens::getComplementaryMarkerOnContainer);
this.addOverlayPainter(toolbarBottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);
```

This skin shows two different ways to add double-line bezel separators - the first between the menu bar and tool bar, and the second between the main application area and the footer:

* The double separator along the top edge of the footer (status bar) is painted by an instance of `TopBezelOverlayPainter` which is associated with the footer decoration area - see the bottom zoomed area in the screenshot above.
* The double separator between the menu bar and the tool bar is painted by two different overlay painters - see the top zoomed area in the screenshot above:
  * An instance of `BottomLineOverlayPainter` associated with header decoration area - paints the top (darker) separator line along the bottom edge of the menu bar.
  * An instance of `TopLineOverlayPainter` associated with toolbar decoration area - paints the bottom (lighter) separator line along the top edge of the tool bar.

The last example comes from the [Twilight](../skins/dark-skins.md#twilight) skin:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/painters/overlay/twilight.png" width="646" height="446"/>

This skin defines custom visual appearance for the title pane, the menu bar, the toolbars and the status bar - the background of these areas is painted by the matching decoration painter - in this case, the `MatteDecorationPainter`. To add the final polishing touch and create a unique visual footprint for this skin, we use overlay painters. The Twilight skin defines a number of overlay painters, each one associated with the relevant decoration areas:

```java
// Add overlay painters to paint drop shadows along the bottom
// edges of toolbars and footers
this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
    RadianceThemingSlices.DecorationAreaType.TOOLBAR,
    RadianceThemingSlices.DecorationAreaType.FOOTER);

// add an overlay painter to paint a dark line along the bottom
// edge of toolbars
RadianceDecorationPainter.OverlayPainter toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
    ContainerColorTokens::getContainerOutlineVariant);
this.addOverlayPainter(toolbarBottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

// add an overlay painter to paint a dark line along the bottom
// edge of toolbars
RadianceDecorationPainter.OverlayPainter toolbarTopLineOverlayPainter = new TopLineOverlayPainter(
    ContainerColorTokensSingleColorQuery.composite(
      ContainerColorTokens::getComplementaryMarkerOnContainer,
      ColorTransform.alpha(128)));
this.addOverlayPainter(toolbarTopLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

// add an overlay painter to paint a bezel line along the top
// edge of footer
RadianceDecorationPainter.OverlayPainter footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
    ContainerColorTokens::getMarkerOnContainer,
    ContainerColorTokens::getComplementaryMarkerOnContainer);
this.addOverlayPainter(footerTopBezelOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);
```

The overlay painters used in the Twilight skin are:

* An instance of `TopLineOverlayPainter` associated with `toolbar` decoration area - paints the lighter top separator line along the top edge of the tool bar - see the top zoomed area in the screenshot above.
* An instance of `BottomLineOverlayPainter` associated with `toolbar` decoration area - paints the darker bottom separator line along the bottom edge of the tool bar - see the top zoomed area in the screenshot above.
* An instance of `TopBezelOverlayPainter` associated with `footer` decoration area - paints the double bezel separator lines along the top edge of the status bar - see the bottom zoomed area in the screenshot above.
* The instance of `BottomShadowOverlayPainter` associated with `toolbar` and `footer` decoration areas - paints the drop shadow along the bottom edge of these areas - see the top zoomed area in the screenshot above.


### Application-facing APIs

To use the current **decoration painter** in custom painting routines of your application, call the following published Radiance APIs:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()` to retrieve the component skin.
* `RadianceSkin.getDecorationPainter()` to retrieve the decoration painter of the component skin.
* `RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType()` to retrieve the decoration area type of the component.
* `RadianceDecorationPainter.paintDecorationArea()` (see below) to paint the decoration background on the specific graphics context.

The base class for Radiance decoration painters is `RadianceDecorationPainter`. It has a single painting methods:

```java
public void paintDecorationArea(Graphics2D graphics, Component comp,
    DecorationAreaType decorationAreaType, int width, int height,
    double scaleFactor, ContainerColorTokens colorTokens);
```

The `width` and `height` parameters specify the rectangle to paint (the decoration painters can only paint rectangular areas), the `colorTokens` specifies the tokens to be used to paint the area, while `decorationAreaType` indicates the decoration area type.

To use the current **inlay painter** in custom painting routines of your application, call the following published Radiance APIs:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()` to retrieve the component skin.
* `RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType()` to retrieve the decoration area type of the component.
* `RadianceSkin.getDecorationPainter()` to retrieve the decoration painter of the component skin, followed by `RadianceDecorationPainter.getInlayPainter()` to get the inlay painter.
* If the inlay painter is not null, use the `RadianceDecorationPainter.InlayPainter.paintInlay()` (see below) to paint the inlay on the specific graphics context.

The base interface for inlay painters is `RadianceDecorationPainter.InlayPainter`. The only painting method in this class is:

```java
public void paintInlay(Graphics2D graphics, Component comp,
    DecorationAreaType decorationAreaType,
    int x, int y, int width, int height, double scaleFactor,
    ContainerColorTokens colorTokens);
```

The `x`, `y`, `width` and `height` parameters specify the rectangle for the inlay (the inlay painters can only paint on rectangular areas), the `colorTokens` specifies the tokens to be used to paint the inlay, while `decorationAreaType` indicates the decoration area type.

To use the current **overlay painters** in custom painting routines of your application, call the following published Radiance APIs:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()` to retrieve the component skin.
* `RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType()` to retrieve the decoration area type of the component.
* `RadianceSkin.getDecorationPainter()` to retrieve the decoration painter of the component skin, followed by `RadianceDecorationPainter.getOverlayPainters(DecorationAreaType)` to get the list of overlay painters.
* Loop over the overlay painters and use the `RadianceDecorationPainter.OverlayPainter.paintOverlay()` (see below) to paint the overlays on the specific graphics context.

The base interface for overlay painters is `RadianceDecorationPainter.OverlayPainter`. The only painting method in this class is:

```java
public void paintOverlay(Graphics2D graphics, Component comp,
    DecorationAreaType decorationAreaType, int width, int height,
    double scaleFactor, ContainerColorTokens colorTokens);
```

The `width` and `height` parameters specify the rectangle for the overlays (the overlay painters can only paint on rectangular areas), the `colorTokens` specifies the tokens to be used to paint the overlay, while `decorationAreaType` indicates the decoration area type.
