## Radiance look and feel - surface painters

The only painting method in `RadianceSurfacePainter` is

```java
  /**
   * Fills the outline that matches the specified parameters.
   *
   * @param g
   *            Graphics context.
   * @param comp
   *            Component to paint.
   * @param width
   *            Width of a UI component.
   * @param height
   *            Height of a UI component.
   * @param outline
   *            Outline of a UI component.
   * @param colorTokens
   *            Color tokens.
   */
  public void paintSurface(Graphics g, Component comp, int width,
      int height, Shape outline, ContainerColorTokens colorTokens);
```

The `outline` parameter specifies the actual shape to fill and the `colorTokens` specifies the color tokens to be used to compute the colors. Specific implementations may choose to use offscreen images if the target visuals are not achievable with direct rendering APIs on the passed graphics context.

Important thing to note - a surface painter **must not** paint the focus ring or the border; these are painted separately.

Radiance provides a number of surface painters that can be used as a starting point for your custom application visuals.

* `FractionBasedSurfacePainter` enables vertical gradients with arbitrary multi-stop colors. Most core Radiance surface painters extend this class.
* `SpecularRectangularSurfacePainter` allows adding specular bottomShine along the top part of the surface area.

### Management API

If you wish to use the surface painter of the current skin to provide additional custom painting in your application, call:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()` to retrieve the current skin.
* `RadianceSkin.getSurfacePainter()` to retrieve the surface painter of the current skin.
* `RadianceSurfacePainter.paintSurface()` to paint the background on the specific graphics context.
