## Radiance look and feel - fill painters

The only painting method in `RadianceFillPainter` is

```java
  /**
   * Fills the contour that matches the specified parameters.
   *
   * @param g
   *            Graphics context.
   * @param comp
   *            Component to paint.
   * @param width
   *            Width of a UI component.
   * @param height
   *            Height of a UI component.
   * @param contour
   *            Contour of a UI component.
   * @param fillScheme
   *            The fill color scheme.
   */
  public void paintContourBackground(Graphics g, Component comp, int width,
      int height, Shape contour, RadianceColorScheme fillScheme);
```

The `contour` parameter specifies the actual shape to fill and the `fillScheme` specifies the Radiance color scheme to be used to compute the colors. Specific implementations may choose to use offscreen images if the target visuals are not achievable with direct rendering APIs on the passed graphics context.

Important thing to note - a fill painter **must not** paint the focus ring or the border; these are painted separately.

Radiance provides a number of fill painters that can be used as a starting point for your custom application visuals.

* `StandardFillPainter` provides six base methods that compute fill colors at four fill and two shine vertical locations (see `get*FillColor` and `get*ShineColor` methods). Most core Radiance fill painters extend this class. Note that if your fill painter does not paint the shine spot, return `null` from the `get*ShineColor` methods.
* `FractionBasedFillPainter` enables vertical gradients with arbitrary multi-stop colors.

### Management API

If you wish to use the fill painter of the current skin to provide additional custom painting in your application, call:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()` to retrieve the current skin.
* `RadianceSkin.getFillPainter()` to retrieve the fill painter of the current skin.
* `RadianceFillPainter.paintContourBackground()` to paint the background on the specific graphics context.
