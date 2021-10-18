## Radiance look and feel - text highlights

Radiance [decoration areas](painters/decoration.md) are a powerful mechanism that allows visual delineation of logical grouping of controls in your application.

Due to technical reasons detailed in [this bug](https://github.com/kirill-grouchnikov/radiance/issues/297), selection (text highlight) visuals in text components do not work well across decoration areas in some of the Radiance skins, especially those that mix light and dark visuals.

In order to have consistent visual appearance of selection highlights, Radiance provides classes that extend the core Swing text components in the `org.pushingpixels.radiance.laf.api.text` package.

For example, instead of using the core `JTextField`, use `RadianceTextField`:

```java
JPanel panelFooter = new JPanel(new FlowLayout());
RadianceLafCortex.ComponentOrParentChainScope.setDecorationType(
        panelFooter, RadianceLafSlices.DecorationAreaType.FOOTER);

panelFooter.add(new RadianceTextField("sample footer", 20));
```

Here is how text selection highlights look like when you use the Radiance-provided text components. This is under the Dust skin:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/text/dust.png" width="300" height="300"/>

This is under the Magellan skin:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/text/magellan.png" width="300" height="300"/>

This is under the Sentinel skin:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/text/sentinel.png" width="300" height="300"/>
