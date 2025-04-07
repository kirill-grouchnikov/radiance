## Radiance look and feel - outline painters

The base class for Radiance outline painters is `RadianceOutlinePainter`. Outline painter is used to paint the outer outline of most UI components, such as buttons, check boxes, radio buttons, progress bars, tabs, scroll bars and others. This allows providing a consistent and pluggable appearance to those components. In addition, it provides an external API for applications that wish to skin custom components in a visually consistent manner.

The `RadianceOutlinePainter` interface defines the following painting method:

```java
  /**
   * Paints the outline.
   *
   * @param g
   *            Graphics.
   * @param c
   *            Component.
   * @param width
   *            Width of a UI component.
   * @param height
   *            Height of a UI component.
   * @param outline
   *            Primary outline to paint.
   * @param innerOutline
   *            Optional inner outline  to paint. May be ignored if the
   *            specific implementation paints only the primary outline.
   * @param colorTokens
   *            The color tokens.
   */
  public void paintOutline(Graphics g, Component c, int width, int height,
      Shape outline, Shape innerOutline, ContainerColorTokens colorTokens);
```

The `outline` and `innerOutline` parameters specify the outer and inner outline shapes to paint, while the `colorTokens` specifies the color tokens to be used to compute the outline colors. The internal implementation of a specific outline painter may decide to ignore the `innerOutline` if this are not relevant.

For optimization purposes, the `RadianceOutlinePainter` defines the following method that must be implemented by the specific outline painter:

```java
  /**
   * Returns boolean indication whether this outline painter is painting the
   * inner outlines.
   *
   * @return <code>true</code> if this outline painter is painting the inner
   *         outlines, <code>false</code> otherwise.
   */
  public boolean isPaintingInnerOutline();
```

Note that if this method returns `false`, the implementation of the `paintOutline()` **must** ignore the `innerOutline` parameter.

Radiance provides a number of outline painters that can be used as a starting point for your custom application visuals.

* `FractionBasedOutlinePainter` enables vertical gradients with arbitrary multi-stop colors. Most core Radiance outline painters extend this class.
* `CompositeOutlinePainter` combines two outline painters, using one for just the primary outline, and the other just for the inner outline.


### Management API

If you wish to use the outline painter of the current skin to provide additional custom painting in your application, call:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()`	to retrieve the current skin.
* `RadianceSkin.getOutlinePainter()` to retrieve the outline painter of the current skin.
* `RadianceOutlinePainter.paintOutline()` to paint the outline on the specific graphics context.
