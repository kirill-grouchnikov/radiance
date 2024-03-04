## Radiance look and feel - border painters

The base class for Radiance border painters is `RadianceBorderPainter`. Border painter is used to paint the outer contour of most UI components, such as buttons, check boxes, radio buttons, progress bars, tabs, scroll bars and others. This allows providing a consistent and pluggable appearance to those components. In addition, it provides an external API for applications that wish to skin custom components in a visually consistent manner.

The `RadianceBorderPainter` interface defines the following painting method:

```java
  /**
   * Paints the control border.
   *
   * @param g
   *            Graphics.
   * @param c
   *            Component.
   * @param width
   *            Width of a UI component.
   * @param height
   *            Height of a UI component.
   * @param contour
   *            Contour of a UI component.
   * @param innerContour
   *            Inner contour of a UI component. May be ignored if the
   *            specific implementation paints only the outside border.
   * @param borderScheme
   *            The border color scheme.
   */
  public void paintBorder(Graphics g, Component c, int width, int height,
      Shape contour, Shape innerContour, RadianceColorScheme borderScheme);
```

The `contour` and `innerContour` parameters specify the outer and inner contour shapes to paint, while the `borderScheme` specifies the Radiance color scheme to be used to compute the border colors. The internal implementation of a specific border painter may decide to ignore the `innerContour` if this are not relevant.

For optimization purposes, the `RadianceBorderPainter` defines the following method that must be implemented by the specific border painter:

```java
  /**
   * Returns boolean indication whether this border painter is painting the
   * inner contours.
   *
   * @return <code>true</code> if this border painter is painting the inner
   *         contours, <code>false</code> otherwise.
   */
  public boolean isPaintingInnerContour();
```

Note that if this method returns `false`, the implementation of the `paintBorder()` **must** ignore the `innerContour` parameter.

Radiance provides a number of border painters that can be used as a starting point for your custom application visuals.

* `FractionBasedBorderPainter` enables vertical gradients with arbitrary multi-stop colors. Most core Radiance border painters extend this class.
* `DelegateFractionBasedBorderPainter` wraps a `FractionBasedBorderPainter` with per-stop bit masks and a color scheme transform.
* `CompositeBorderPainter` combines two border painters, using one for just the outer contour, and the other just for the inner contour.


### Management API

If you wish to use the border painter of the current skin to provide additional custom painting in your application, call:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()`	to retrieve the current skin.
* `RadianceSkin.getBorderPainter()` to retrieve the border painter of the current skin.
* `RadianceBorderPainter.paintBorder()` to paint the border on the specific graphics context.
