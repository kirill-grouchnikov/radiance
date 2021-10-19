## Cookbook - visual polish

### Lather, rinse, repeat

Unless you are using the exact same images that the designer was using for creating the screen mockups, the process of implementing the required visuals is hardly ever done. The slightest variations in color saturation, hues and brightness can result in a drab appearance. Not paying attention to artfully placed visual separators (gaps, margins, borders) can result in a cluttered appearance. Failing to remove visual noise that does not bother you as a programmer can result in visual distractions for the users, even at the unconscious level.

### The devil is in the details

While the first two phases ([analysis](01-analyze.md) and [mapping](02-map.md)) operated on more abstract layers (decoration areas, functional areas, container hierarchy), the implementation phases ([decoration](03-decorations.md) and [skin creation](04-skin.md)) must pay painstaking attention to all the minute details of the target design. Not closely following the design may seem insignificant to the developer, but it will in most cases result in deteriorated user experience.

The following is an incomplete list of Cookbook UI minute visuals that have been pointed out before. Most of these can be easily addressed with Radiance painters and skins.

* Seamless and continuous texturing of header, footer and sidebar areas.
* Light-dark fill gradients for the buttons.
* Darker gradients for the button borders with translucent fading inner borders.
* Color schemes used for the selected buttons in the header and scroll bar in the sidebar.

Here are two more examples of fine details that are easily missed at a cursory glance. The following is a zoomed screenshot of the seam between the sidebar and the footer area. The vertical separator has two lines, darker on the left and lighter on the right. The same appies to the horizontal separator. In addition, the horizontal separator is painted on top of the vertical one to further enforce the boundary between the application functional areas:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/spyglass/cookbook/05-polish/zoom-footer-cookbook.png" width="207" border=0/>

In the implementation, the vertical separators are painted as a custom border installed on the relevant panels. While this can be achieved with the decoration painter, in this specific case it is easier to use borders and supported Radiance APIs (to fetch the color schemes). These borders are the only usage of Radiance APIs outside the self-contained definition of the custom skin. This is an example of the tradeoff between containing the painting routines inside the skin definition and the limitations of the Radiance skinning layer that impose greater complexity on implementing this specific feature.

The next screenshot shows a zoomed version of the buttons in one of the footers:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/spyglass/cookbook/05-polish/zoom-buttons-cookbook.png" width="198" border=0/>

In addition to the details on the gradient fill and the double border, there is one more important thing – the seamless appearance of the buttons as one joined group. In order to implement this, the Cookbook code is using the `JCommandButtonStrip` component from [Flamingo component suite](../../flamingo/flamingo.md). Buttons placed in the `JCommandButtonStrip` will have continuous background, a single separator line between them and correct rounded corners on the left / right buttons.

The icons used for the header and footer buttons were created using the [Photon transcoder](../../tools/svgtranscoder/svgtranscoder.md). A few icons from the [Material icon set](https://material.io/tools/icons/) were transcoded offline to pure Java2D classes.

If you take a closer look at the icon visuals in the design mockup, you will notice that all the icons have a dark brown "halo" around them that further reinforces the overall golden-brown color scheme of the app. On out side, this can be achieved by applying a combination of a [few filters](http://www.jhlabs.com/ip/filters/index.html) to create that darker halo shade. The full code is in `EchoRadianceIcon` class, and the most relevant snippet is:

```java
static BufferedImageOp iconShadowFilter;

{
    BlurFilter blurFilter = new BlurFilter();
    blurFilter.setUseAlpha(true);
    int kernelSide = 3;
    float[] kernelData = new float[kernelSide * kernelSide];
    for (int i = 0; i < kernelData.length; i++) {
        kernelData[i] = 1.0f;
    }
    blurFilter.setKernel(new Kernel(kernelSide, kernelSide, kernelData));

    RadianceColorScheme colorScheme = new GoldenBrownColorScheme();
    Gradient inverseGradient = new Gradient(
            new int[] { 0, 128, 255 },
            new int[] {
                    colorScheme.getUltraLightColor().getRGB(),
                    colorScheme.getMidColor().getRGB(),
                    colorScheme.getUltraDarkColor().getRGB() });
    // Can't use LookupFilter since it disregards the original alpha
    PointFilter inverseFilter = new PointFilter() {
        @Override
        public int filterRGB(int x, int y, int rgb) {
            int a = rgb & 0xff000000;
            int r = (rgb >> 16) & 0xff;
            int g = (rgb >> 8) & 0xff;
            int b = rgb & 0xff;
            // Compute perceived color brightness based on the individual RGB components
            // See https://en.wikipedia.org/wiki/Relative_luminance
            int brightness = (2126 * r + 7152 * g + 722 * b) / 10000;
            return a | (inverseGradient.getColor(brightness/255.0f) & 0x00ffffff);
        }
    };

    iconShadowFilter = new CompoundFilter(blurFilter, inverseFilter);
}
```

Here, the `CompountFilter` wraps the 3x3 uniform `BlurFilter` and an extension of `PointFilter` that is using a `Gradient` based on the colors in our `Golden Brown` color scheme. Note that in this implementation, the halo is uniformly distributed around the icon visuals so that it remains consistent with the default look of Radiance window icons. This is important since we are "pushing" the toolbar content into the title pane using the `RadianceCortex.WindowScope.extendContentIntoTitlePane` API.

### Even when you think you’re done

The process of defining, implementing and refining the visuals can take a few iterations until both sides (design and implementation) are satisfied with the results. In this process, paying attention to the work of the designer is as important as handling all the corner cases in the business logic. Indeed, a few ill-advised pixels or a drab color scheme are not going to bring your application down. However, if you are interested in providing an appealing and immersive flow to your users, it is most certainly worth extra few days of investment.
