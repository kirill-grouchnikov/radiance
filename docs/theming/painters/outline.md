## Radiance look and feel - outline painters

The base class for Radiance outline painters is `RadianceOutlinePainter`. Outline painter is used to paint the outer outline of most UI components, such as buttons, checkboxes, radio buttons, progress bars, tabs, scroll bars and others. This allows providing a consistent and pluggable appearance to those components. In addition, it provides an external API for applications that wish to skin custom components in a visually consistent manner.

The `RadianceOutlinePainter` interface defines the following painting method:

```java
/**
 * Paints the outline.
 *
 * @param g
 *     Graphics.
 * @param c
 *     Component.
 * @param width
 *     Width of a UI component.
 * @param height
 *     Height of a UI component.
 * @param scaleFactor
 *     Scale factor.
 * @param shapeSupplier
 *     To compute the shape(s) painted by this painter.
 * @param colorTokens
 *     The color tokens.
 */
void paintOutline(Graphics g, Component c, float width, float height, double scaleFactor,
    ShapeSuppler shapeSupplier, ContainerColorTokens colorTokens);
```

The `shapeSupplier` parameter is used to compute the shape(s) to paint, while the `colorTokens` specifies the color tokens to be used to compute the outline colors. The internal implementation of a specific outline painter may decide to draw multiple shapes, such as a darker outer outline and a lighter inner outline, depending on the target visuals.

Radiance provides a number of outline painters that can be used as a starting point for your custom application visuals.

* `FractionBasedOutlinePainter` enables vertical gradients with arbitrary multi-stop colors. Most core Radiance outline painters extend this class.
* `InlayOutlinePainter` paints a double outline, with the inner one following the shape of the outer one with no gaps between them. The visuals for both outlines have configurable vertical gradients.
* `LuminousOutlinePainter` paints an outline of a 3D glass object lit from straight above.

### Management API

If you wish to use the outline painter of the current skin to provide additional custom painting in your application, call:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()`	to retrieve the current skin.
* `RadianceSkin.getOutlinePainter()` to retrieve the outline painter of the current skin.
* `RadianceOutlinePainter.paintOutline()` to paint the outline on the specific graphics context.
