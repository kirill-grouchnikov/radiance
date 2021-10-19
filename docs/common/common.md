## Common - scalable icons and native text rendering

The Common library provides a core set of APIs to work with images and text that scale with the display resolution. Common icons scale to maintain crisp, pixel-perfect visuals for application icons. Font APIs can be used to render platform-consistent textual content across a variety of supported platforms.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-neon/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-neon) `radiance-neon` for build instructions of the latest stable release.

<p align="center">
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/nebulabrickwall1.png" width="340" height="258" border=0>
</p>

### Querying the underlying platform

`RadianceCommonCortex.getPlatform()` API can be used to obtain the generic "type" of the underlying platform / operating system. The result can then be used for platform-specific functionality such as, for example, installing keyboard shortcuts that use the Cmd key on Mac and Ctrl key on others.

For example:

```java
KeyStroke keyStroke = (RadianceCommonCortex.getPlatform() == CommonCortex.Platform.MACOS)
    ? KeyStroke.getKeyStroke("meta alt E")
    : KeyStroke.getKeyStroke("alt shift E");
```

### Working with platform fonts

`RadianceCommonCortex.getDefaultFontPolicy()` API retrieves the font policy that is consistent with the default control font set used by the underlying platform / operating system. Use `getFontSet()` on the result (passing `null` as the parameter is supported), and then query the resulting font set for the specific font to use in your application.

`RadianceCommonCortex.getScaledFontPolicy()` API retrieves the platform-consistent font policy with all fonts scaled up or down by the passed multiplier.

### Rendering text

`RadianceCommonCortex.installDesktopHints` API should be used for rendering platform-consistent text in your application running under the Radiance look-and-feel.

For example:

```java
public static class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, this.getFont());
        g2d.drawString("Sample text", 50, 50);
        g2d.dispose();
    }
}
```

### Working with high-resolution / high-DPI displays

`RadianceCommonCortex.getScaleFactor(Component)` API returns the scale factor of the graphics device / display that the component is displayed on. The result should be used for any custom application rendering code that draws content directly on `Graphics` in the `paintComponent` method.

This API is primarily meant to be used in conjunction with the following APIs that target offloading frequently performed rendering operations to cached, offscreen images:

* `RadianceCommonCortex.getBlankScaledImage` returns a `BufferedImage` that scales all rendering commands on the specific display.
* `RadianceCommonCortex.drawImageWithScale` renders an image obtained with `getBlankScaledImage` on the passed `Graphics`, scaling the content as necessary.

Consider the following use case - a UI delegate for the `JButton` component may want to cache the composited visuals for most frequently sized buttons. On a high-resolution / Retina display, we want the final result to look crisp, with a pixel-wide hairline outline. The following steps should be followed to achieve the target look:

* Get the scale factor for the button with `RadianceCommonCortex.getScaleFactor(Component)`
* Obtain a scalable blank image with `RadianceCommonCortex.getBlankScaledImage`, passing the scale factor, as well as width and height of the button in pixels. Note that here we are passing the "unscaled" pixels in the traditional, legacy Swing coordinate system. For example, on a MacBook Retina screen, the button will be rendered as a 140x60 pixel block, while `JButton.getWidth()` and `JButton.getHeight()` will return 70 and 30, respectively.
* Use `RadianceCommonCortex.getScaleFactor(Component)` to compute the stroke width of the button border / outline. Due to the legacy Swing considerations, creating a `BasicStroke` with width equal to `1.0f` will create a border that is too thick on a Retina screen. The correct border stroke width should be `1.0f / CommonCortex.getScaleFactor(Component)`
* After all button visuals have been combined into the buffered image, use `RadianceCommonCortex.drawImageWithScale` to render that image onto the target `Graphics`.

What is happening under the hood? Going back to our 70x30 button which takes 140x60 area on the underlying Retina hardware, the image returned in the first step will actually be 140x60 pixels wide. Then, in the second step, we are scaling down the stroke in our rendering pass - since we want to treat all screen densities consistently, while the underlying buffered image will scale that stroke back to be 1 pixel wide (on an image that is twice as big as far as the pure pixel size goes). Finally, when the 2x image is rendered on the target graphics, it is scaled back down by 2x. As far as Swing is concerned, it is rendering a 140x60 image in a 70x30 area. However, when it gets down to rendering the actual pixels, the underlying graphics pipeline will do the right thing and render our 140x60 image in a 140x60 screen area.

### Icons

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/common/resizable-icon.png" width="248" height="274" border=0 align="right">

The `RadianceIcon` extends the core `Icon` interface to allow scaling and colorizing the icon visuals at runtime. Scaling is relevant for controls that can be dynamically resized. This class is used extensively in Components for such controls as ribbon buttons or file viewer panel, but can be used in core and third-party components as well.

The [SVG Transcoder library](../tools/svg-transcoder/svg-transcoder.md) provides tools for using SVG content via the `RadianceIcon` interface. SVG Transcoder can be used offline to transcode the SVG content into standalone Java / Kotlin classes that use Java2D canvas draw calls to render the original visuals with no additional runtime dependencies.

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/complex-list-renderer.png" width="946" border=0 align="right">

### Icon colorization

`RadianceIcon.setColorFilter` API provides support for colorizing Common icons.

[VisorMail](https://github.com/kirill-grouchnikov/radiance/tree/sunshine/demos/spyglass/src/main/java/org/pushingpixels/demo/spyglass/mail) demo app illustrates the usage of colorized icons in [complex list renderers](../theming/renderers.md). Note the visuals of the selected elements in the destinations list on the left and the threads list in the middle - the icon is colorized with the same foreground color as the associated texts.

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/complex-list-renderer.png" width="946" border=0 align="right">


In the screenshot above, the first two icons in the middle panel (the one next to the search box and the one right below it next to the "Inbox" label) are colorized like this:

```java
RadianceIcon editIcon = ic_mode_edit_black_24px.of(14, 14);
Color filterColor = new Color(mainSelectorIconColor.getRed(),
                mainSelectorIconColor.getGreen(),
                mainSelectorIconColor.getBlue(),
                204);
editIcon.setColorFilter(color -> filterColor);

RadianceIcon mailIcon = ic_refresh_black_24px.of(12, 12);
mailIcon.setColorFilter(color -> mainSelectorIconColor);
```
The first block uses an alpha-derived filter color on a 14x14 icon. The second block does not use alpha (so that the icon's perceived darkness is consistent since it is displayed next to a visually heavier, bold label) on a 12x12 icon. Both icons were transcoded by [SVG Transcoder](../tools/svg-transcoder/svg-transcoder.md) from the [Material icon set](https://material.io/tools/icons/).

The code snippet above shows a color filter based on a single color. This works well for monochrome icons such as those from the Material icon set. In case your transcoded icon is a bit more colorful, you can use `RadianceIcon.setColorFilter` together with the `RadianceColorScheme.getColorFilter`.

How does color filtering work? There is a "fast" way, and there is a "slow" way.

The fast way is to apply the `RadianceIcon.ColorFilter` on every color used to draw the specific icon visuals. This is provided out of the box on all icons transcoded by SVG Transcoder, with one exception - icons with raster (bitmap) content. If the original icons have regular vector content such as paths and simple shapes, the generated class will return `true` from its `supportsColorFilter`, and it will be enough to call `setColorFilter` to do color filtering.

SVG supports using raster content in `<image>` and `<pattern>` elements. SVG Transcoder supports transcoding such content. Such transcoded content does not support the "fast" color filter path. To colorize such icons, use the `ImageBackedFilterableRadianceIcon` wrapper.

This class implements color filtering by using offscreen images and a custom `BufferedImageOp` based on the configured `RadianceIcon.ColorFilter`. This is a "slow" path that consumes additional memory resources. It is also a more versatile one since it supports colorizing arbitrarily complex `RadianceIcon`s as in this example:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/common/icon-color-filtering.png" width="446" height="196" border=0 align="center">

Here, the colors of Sunfire, Lime Green and Steel Blue color schemes from Radiance are used to filter the original visuals of an icon from the Tango icon set (second row), preserving its overall visual feel, while at the same time making it blend more with the specific Radiance visuals.

Note that in this particular example, the original SVG icon is not transcoded by SVG Transcoder (which would have resulted in a `RadianceIcon` class that uses the fast path), but rather using Apache Batik at runtime to asynchronously load the original SVG, and then colorizing the icon visuals rendered by Batik.
