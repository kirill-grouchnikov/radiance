## Substance look and feel - text highlights

Substance [decoration areas](painters/decoration.md) are a powerful mechanism that allows visual delineation of logical grouping of controls in your application.

Due to technical reasons detailed in [this bug](https://github.com/kirill-grouchnikov/radiance/issues/297), selection (text highlight) visuals in text components do not work well across decoration areas in some of the Substance skins, especially those that mix light and dark visuals.

In order to have consistent visual appearance of selection highlights, Substance provides classes that extend the core Swing text components in the `org.pushingpixels.substance.api.text` package.

For example, instead of using the core `JTextField`, use `SubstanceTextField`:

```java
JPanel panelFooter = new JPanel(new FlowLayout());
SubstanceCortex.ComponentOrParentChainScope.setDecorationType(
        panelFooter, SubstanceSlices.DecorationAreaType.FOOTER);

panelFooter.add(new SubstanceTextField("sample footer", 20));
```

Here is how text selection highlights look like when you use the Substance-provided text components. This is under the Dust skin:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/text/dust.png" width="300" height="300"/>

This is under the Magellan skin:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/text/magellan.png" width="300" height="300"/>

This is under the Sentinel skin:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/text/sentinel.png" width="300" height="300"/>
