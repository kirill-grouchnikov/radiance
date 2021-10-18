## Radiance look and feel - decoration painters

Menu bars, tool bars, status bars - these are common examples of special containers found in application windows. These containers create functional grouping of application controls and bring order to complex screens. Radiance skinning layer provides a flexible and powerful set of APIs to define the visual appearance of these control groups - called **decoration areas**. At the same time, Radiance decoration painters enforce visual consistency and connections across the components in related areas and states. In addition, Radiance provides a set of published APIs for applications that wish to skin custom components and preserve visual consistency with the Swing controls painted by the core Radiance UI delegates.

### Decoration areas

The `RadianceLafSlices.DecorationAreaType` class contains the available core decoration area types. As a picture is worth a thousand words, the following screenshots illustrate the different decoration area types.

The following screenshot is the main Radiance test application under the Business Black Steel skin (click to see full size version):

<a href="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/decoration/full.png"><img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/decoration/thumb.png" width="600" height="448"/></a>

The next screenshot shows the `title` decoration area, which in this example includes the title pane of the main window:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/decoration/areas-title.png" width="600" height="448"/>

The next screenshot shows the `header` decoration area, which in this example includes the menu bar of the main window:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/decoration/areas-header.png" width="600" height="448"/>

The next screenshot shows the `toolbar` decoration area, which in this example includes the tool bar of the main window:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/decoration/areas-toolbar.png" width="600" height="448"/>

The next screenshot shows the `footer` decoration area, which in this example includes the status bar component:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/decoration/areas-footer.png" width="600" height="448"/>

The next screenshot shows the `general` decoration area, which in this example includes the task pane container component:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/decoration/areas-general.png" width="600" height="448"/>

Let's go back to the original screenshot:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/decoration/thumb.png" width="600" height="448"/>

It illustrates that the specific skin assigns different color schemes to different decoration areas. The controls in those areas get the background and foreground colors based on their assigned color scheme (without any custom application code), thus creating visual distinction between different application areas.

### Application-facing APIs

To use the matching decoration painter in custom painting routines of your application, call the following published Radiance APIs:

* `RadianceLafCortex.GlobalScope.getCurrentSkin()` to retrieve the component skin.
* `RadianceSkin.getDecorationPainter()` to retrieve the decoration painter of the component skin.
* `RadianceLafCortex.ComponentOrParentChainScope.getDecorationType()` to retrieve the decoration area type of the component.
* `RadianceDecorationPainter.paintDecorationArea()` (see below) to paint the decoration background on the specific graphics context.

The base class for Radiance decoration painters is `RadianceDecorationPainter`. It has two painting methods. The first paints the passed rectangular area:

```java
  /**
   * Paints the decoration area.
   *
   * @param graphics
   *            Graphics context.
   * @param comp
   *            Component.
   * @param decorationAreaType
   *            Decoration area type. Must not be <code>null</code>.
   * @param width
   *            Width.
   * @param height
   *            Height.
   * @param skin
   *            Skin for painting the decoration area.
   */
  public void paintDecorationArea(Graphics2D graphics, Component comp,
      DecorationAreaType decorationAreaType, int width, int height,
      RadianceSkin skin);
```

The `width` and `height` parameters specify the rectangle to paint (the decoration painters can only paint rectangular areas), the skin specifies the Radiance skin to be used to compute the gradient colors, while `decorationAreaType` indicates the decoration area type.

The second paints the passed shape:
```java
/**
 * Paints the decoration area as a specified shape.
 *
 * @param graphics           
 *            Graphics context.
 * @param comp                         
 *            Component.
 * @param decorationAreaType           
 *            Decoration area type. Must not be <code>null</code>.
 * @param contour                      
 *            Contour to fill.
 * @param colorScheme                  
 *            Color scheme for painting the decoration area.
 */
void paintDecorationArea(Graphics2D graphics, Component comp,
        DecorationAreaType decorationAreaType, Shape contour,
        RadianceColorScheme colorScheme);
```        
