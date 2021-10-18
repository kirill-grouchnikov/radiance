## Substance look and feel - fill painters

The only painting method in `SubstanceFillPainter` is

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
   * @param isFocused
   *            Indication whether component owns the focus.
   * @param fillScheme
   *            The fill color scheme.
   * @param hasShine
   *            Indication whether the returned image should have a 3D shine
   *            spot in its top half.
   */
  public void paintContourBackground(Graphics g, Component comp, int width,
      int height, Shape contour, boolean isFocused,
      SubstanceColorScheme fillScheme, boolean hasShine);
```

The `contour` parameter specifies the actual shape to fill and the `fillScheme` specifies the Substance color scheme to be used to compute the colors. The internal implementation of a specific fill painter may decide to ignore the `isFocused` and `hasShine` if these are not relevant. In addition, specific implementation may maintain an internal cache of computed images if the computation is CPU-heavy.

Important thing to note - a fill painter **should not** paint the focus ring or the border; these are painted by separate painters. As noted above, the `isFocused` can be ignored by the specific painter implementation.

Applications that wish to provide a custom (branding) fill painter may utilize the existing `StandardFillPainter` base class. The subclass can override any one of the six base methods that compute fill colors at four fill and two shine vertical locations (see `get*FillColor` and `get*ShineColor` methods). Most core Substance fill painters extend this class. Note that if your fill painter does not paint the shine spot, return `null` from the `get*ShineColor` methods.

### Management API

If you wish to use the fill painter of the current skin to provide additional custom painting in your application, call:

* `SubstanceCortex.GlobalScope.getCurrentSkin()` to retrieve the current skin.
* `SubstanceSkin.getFillPainter()` to retrieve the fill painter of the current skin.
* `SubstanceFillPainter.paintContourBackground()` to paint the background on the specific graphics context.
