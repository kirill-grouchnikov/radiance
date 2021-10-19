## Radiance look and feel - file format for defining multiple color schemes

A [color scheme](colorschemes.md) implements the `RadianceColorScheme` interface. Radiance API has a number of base classes that provide a more structured way to define color schemes. In addition to the `BaseLightColorScheme` and `BaseDarkColorScheme`, you can define multiple color schemes in a single text file and then load them in your skin class.

Let's see how this works.

### Basics

`RadianceSkin.getColorSchemes(URL)` and `RadianceSkin.getColorSchemes(String)` APIs return a `RadianceSkin.ColorSchemes` object. For example, here is how the [Business Black Steel skin](toneddown.md#business-black-steel) loads its color schemes:

```java
RadianceSkin.ColorSchemes businessSchemes = RadianceSkin
    .getColorSchemes("org/pushingpixels/radiance/theming/api/skin/business.colorschemes");
```

Then, use `RadianceSkin.ColorSchemes.get(String)` API to get a specific color scheme based on its name:

```java
RadianceColorScheme activeScheme = businessSchemes.get("Business Black Steel Active");
RadianceColorScheme enabledScheme = businessSchemes.get("Business Black Steel Enabled");
RadianceColorScheme disabledScheme = businessSchemes.get("Business Black Steel Disabled");

// the default color scheme bundle
RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
    activeScheme, enabledScheme, disabledScheme);
```

### File format

Color schemes are defined in a plaintext format. The file itself does not have to have the `.colorschemes` filename extension. Core Radiance skins use this convention for consistency.

A snippet that defines a single color scheme looks like this:

```plaintext
Business Black Steel Active {
    kind=Light
    colorUltraLight=#ABCCE1
    colorExtraLight=#9EC3DB
    colorLight=#96B6CE
    colorMid=#90ABC0
    colorDark=#718091
    colorUltraDark=#747E8A
    colorForeground=#4D4D4D
}
```

Note that you have to provide values for `kind`, as well as for each one of the seven base `color` entries defined by the [BaseColorScheme](https://github.com/kirill-grouchnikov/radiance/blob/sunshine/theming/src/main/java/org/pushingpixels/radiance/theming/api/colorscheme/BaseColorScheme.java) interface. Otherwise calling `RadianceSkin.getColorSchemes` will throw an exception at runtime.

For simpler color schemes that are used with painters that only look at a single color - such as a flat background fill of a specific [decoration area](../painters/decoration.md), you can use the `colorBackground` shortcut to provide the same color for all non-foreground base colors:

```plaintext
Twilight Header Border {
    kind=Dark
    colorBackground=#000000
    colorForeground=#B9B49E
}
```

Optionally, you can specify one or more colors defined by the [SchemeDerivedColors](https://github.com/kirill-grouchnikov/radiance/blob/sunshine/theming/src/main/java/org/pushingpixels/radiance/theming/api/colorscheme/SchemeDerivedColors.java) interface:

```plaintext
Green Magic Footer Fill {
    kind=Light
    colorBackground=#9EDDB8
    colorForeground=#5BA581
    colorSeparatorPrimary=#589288
    colorSeparatorSecondary=#CAE8BD
}
```

Here, the last three lines specify the colors for painting separators (light, dark, shadow).

### Color references

Even though some complex skins might use a lot of different color schemes, a visually pleasant skin might not need more than a dozen or so different colors (with, perhaps, a slight variation between two colors for subtle gradients on certain elements). In this particular case, your color schemes can be defined in a more compact way that does not have duplicate color value definitions by using the following syntax.

First, start with a section that lists all your colors:

```plaintext
@colors {
    XDarkBrown=#260E07
    DarkBrown=#4D2A1D
    MediumBrown=#876250
    MediumDarkBrown=#6E4436
    ControlLight=#E2C4AA
    LightPink=#F3BAA2
}
```

Then, reference colors by names in color scheme blocks:
```plaintext
Sentinel Enabled {
    kind=Light
    colorBackground=@ControlLight
    colorForeground=@DarkBrown
}

Sentinel Disabled {
    kind=Light
    colorBackground=@ControlLight
    colorForeground=@MediumBrown
}

Sentinel Active {
    kind=Light
    colorBackground=@LightPink
    colorForeground=@DarkBrown
}
```

You can also specify two colors as "end" points for the ultra light to ultra dark spectrum, and let Radiance compute the rest of the colors for you:

```plaintext
Sentinel Decorations Separator {
    kind=Dark
    colorBackground=@MediumDarkBrown->@XDarkBrown
    colorForeground=@DarkBrown
}
```

This way you can have a small collection of "core" colors define the entire appearance of the skin. Here is a screenshot of the [Sentinel skin](toneddown.md#sentinel):

<img alt="Sentinel" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/sentinel1.png" width="340" height="258">

This entire skin is defined by a dozen or so [core colors](https://github.com/kirill-grouchnikov/radiance/blob/sunshine/theming/src/main/resources/org/pushingpixels/radiance/theming/api/skin/sentinel.colorschemes), and around 30 color schemes created from these core colors.
