## Neon - scalable icons and native text rendering

The Neon library provides a core set of APIs to work with images and text that scale with the display resolution. Neon icons scale to maintain crisp, pixel-perfect visuals for application icons. Font APIs can be used to render platform-consistent textual content across a variety of supported platforms.

<p align="center">
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/skins/nebulabrickwall1.png" width="340" height="254" border=0>
</p>

### Querying the underlying platform

`NeonCortex.getPlatform()` API can be used to obtain the generic "type" of the underlying platform / operating system. The result can then be used for platform-specific functionality such as, for example, installing keyboard shortcuts that use the Cmd key on Mac and Ctrl key on others.

For example:

```java
KeyStroke keyStroke = (NeonCortex.getPlatform() == NeonCortex.Platform.MACOS)
    ? KeyStroke.getKeyStroke("meta alt E")
    : KeyStroke.getKeyStroke("alt shift E");
```

### Working with platform fonts

`NeonCortex.getDefaultFontPolicy()` API retrieves the font policy that is consistent with the default control font set used by the underlying platform / operating system. Use `getFontSet()` on the result (passing `null` as the parameter is supported), and then query the resulting font set for the specific font to use in your application.

`NeonCortex.getScaledFontPolicy()` API retrieves the platform-consistent font policy with all fonts scaled up or down by the passed multiplier.

### Rendering text

`NeonCortex.installDesktopHints` API should be used for rendering platform-consistent text in your application running under the Substance look-and-feel.

For example:

```java
public static class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();
        NeonCortex.installDesktopHints(g2d, this);
        g2d.drawString("Sample text", 50, 50);
        g2d.dispose();
    }
}
```

### Working with high-resolution / high-DPI displays

`NeonCortex.getScaleFactor` API returns the scale factor of the highest-resolution connected graphics device / display. The result should be used for any custom application rendering code that draws content directly on `Canvas` in the `paintComponent` method.

This API is primarily meant to be used in conjunction with the following APIs that target offloading frequently performed rendering operations to cached, offscreen images:

* `NeonCortex.getBlankImage` returns a `BufferedImage` that scales all rendering commands on high-resolution displays.
* `NeonCortex.drawImage` renders an image obtained with `getBlankImage` on the passed `Graphics`, scaling the content as necessary.

Consider the following use case - a UI delegate for the `JButton` component may want to cache the composited visuals for most frequently sized buttons. On a high-resolution / Retina display, we want the final result to look crisp, with a pixel-wide hairline outline. The following steps should be followed to achieve the target look:

* Obtain a scalable blank image with `NeonCortex.getBlankImage`, passing the width and height of the button in pixels. Note that here we are passing the "unscaled" pixels in the traditional, legacy Swing coordinate system. For example, on a MacBook Retina screen, the button will be rendered as a 140x60 pixel block, while `JButton.getWidth()` and `JButton.getHeight()` will return 70 and 30, respectively.
* Use `NeonCortex.getScaleFactor` to compute the stroke width of the button border / outline. Due to the legacy Swing considerations, creating a `BasicStroke` with width equal to `1.0f` will create a border that is too thick on a Retina screen. The correct border stroke width should be `1.0f / NeonCortex.getScaleFactor()`
* After all button visuals have been combined into the buffered image, use `NeonCortex.drawImage` to render that image onto the target `Graphics`.

What is happening under the hood? Going back to our 70x30 button which takes 140x60 area on the underlying Retina hardware, the image returned in the first step will actually be 140x60 pixels wide. Then, in the second step, we are scaling down the stroke in our rendering pass - since we want to treat all screen densities consistently, while the underlying buffered image will scale that stroke back to be 1 pixel wide (on an image that is twice as big as far as the pure pixel size goes). Finally, when the 2x image is rendered on the target graphics, it is scaled back down by 2x. As far as Swing is concerned, it is rendering a 140x60 image in a 70x30 area. However, when it gets down to rendering the actual pixels, the underlying graphics pipeline will do the right thing and render our 140x60 image in a 140x60 screen area.

### Resizable icons

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/neon/resizable-icon.png" width="248" height="274" border=0 align="right">

The `ResizableIcon` extends the core `Icon` interface to allow scaling the icon visuals at runtime. This is especially relevant for controls that can be dynamically resized. This class is used extensively in Flamingo for such controls as ribbon buttons or file viewer panel, but can be used in core and third-party components as well.

The core library provides helper classes to expose a variety of image formats as `ResizableIcon`s, including ICO and all `ImageIO`-supported formats. Additional helper classes allow decorating, filtering and layering icons to create more advanced functionality.

The [Photon library](../photon/photon.md) provides tools for using SVG content via the `ResizableIcon` interface. Photon can be used at runtime to asynchronously load and display SVG content, or offline to transcode the SVG content into standalone Java / Kotlin classes that use Java2D canvas draw calls to render the original visuals with no additional runtime dependencies.
