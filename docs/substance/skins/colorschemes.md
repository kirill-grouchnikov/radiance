## Substance look and feel - color schemes

A **color scheme** is a set of information that allows painting a control in a specific visual state. In general, a color scheme defines a collection of colors that are used by the various Substance [painters](../painters/overview.md) to paint different control areas (such as background fill, border etc) under a specific visual state.

The `org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme` contains all the APIs officially supported by Substance color schemes. The APIs can be roughly divided in three categories:

* Base colors. These are defined in the `org.pushingpixels.substance.api.colorscheme.SchemeBaseColors`
* Derived colors. These are defined in the `org.pushingpixels.substance.api.colorscheme.SchemeDerivedColors`
* Creating derived color schemes.

### Base colors

The `SchemeBaseColors` defines the following base colors:
* Ultra light
* Extra light
* Light
* Mid (medium)
* Dark
* Ultra dark
* Foreground

The first six colors are used to paint the background "layer" of a control, such as, for example, the background fill of a button. The foreground color is primarily used to paint the foreground "layer" of a control, such as, for example, the button text and optionally the themed button icon.

It is up to the [fill painter](../painters/fill.md) to decide which specific colors to use for the background layer, and how to use them. For example, a completely flat (non-gradient) look can be achieved by the fill painter using a single color, or by a color scheme specifying identical color values for the entire ultra light / ultra dark spectrum.

### Derived colors

The `SchemeDerivedColors` defines the following derived colors:
* Line
* Focus ring
* Mark
* Echo
* Background fill
* Text background fill
* Accented background fill
* Selection background
* Selection foreground
* Separator primary
* Separator secondary

The idea behind derived colors is to find the balance between consistent visuals across all surfaces painted by Substance and allowing the app to customize specific colors to fit the particulars of its design language.

Let's take a look at the following UI under the core Business skin:

<img alt="Dust Coffee"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/skins/dustcoffee1.png" width="340" height="258" />

To point out just a few places where Substance is using derived colors:

* Mark color is used for the selected mark / dot of checkboxes and radio buttons, as well as the arrow of the combobox.
* Separator secondary color is used for the double content border of the tabbed pane
* Separator primary and secondary colors are used to paint the drag bump dots of the toolbar, as well as the separators in the toolbar
* Accented background fill is used to fill the scroll bar track
* Text background fill is used to fill the text field for better visual indication of editable content

Providing one or more of the derived colors in your [color schemes file](colorschemes-fileformat.md) is the recommended approach to tweaking the overall visual language of your application while maintaining continuity across different UI surfaces.

### Core light color schemes
The Substance core library provides the following sixteen light color schemes:

`Aqua`, `Barby Pink`
<p>
<img alt="Aqua"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/aqua.png" width="340" height="258" />
<img alt="Barby Pink"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/barby-pink.png" width="340" height="258" />
</p>
`Bottle Green`, `Brown`
<p>
<img alt="Bottle Green"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/bottle-green.png" width="340" height="258" />
<img alt="Brown"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/brown.png" width="340" height="258" />
</p>
`Creme`, `Light Aqua`
<p>
<img alt="Creme"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/creme.png" width="340" height="258" />
<img alt="Light Aqua"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/light-aqua.png" width="340" height="258" />
</p>
`Lime Green`, `Olive`
<p>
<img alt="Lime Green"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/lime-green.png" width="340" height="258" />
<img alt="Olive"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/olive.png" width="340" height="258" />
</p>
`Orange`, `Purple`
<p>
<img alt="Orange"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/orange.png" width="340" height="258" />
<img alt="Purple"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/purple.png" width="340" height="258" />
</p>
`Raspberry`, `Sepia`
<p>
<img alt="Raspberry"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/raspberry.png" width="340" height="258" />
<img alt="Sepia"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/sepia.png" width="340" height="258" />
</p>
`Steel Blue`, `Sunset`
<p>
<img alt="Steel Blue"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/steel-blue.png" width="340" height="258" />
<img alt="Sunset"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/sunset.png" width="340" height="258" />
</p>
`Sun Glare`, `Terracotta`
<p>
<img alt="Sun Glare"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/sun-glare.png" width="340" height="258" />
<img alt="Terracotta"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/terracotta.png" width="340" height="258" />
</p>

### Core dark color schemes
The Substance core library provides the following five dark color schemes:

`Ebony`, `Dark Violet`
<p>
<img alt="Ebony"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/ebony.png" width="340" height="258" />
<img alt="Dark Violet"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/dark-violet.png" width="340" height="258" />
</p>
`Charcoal`, `Jade Forest`
<p>
<img alt="Charcoal"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/charcoal.png" width="340" height="258" />
<img alt="Jade Forest"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/jade-forest.png" width="340" height="258" />
</p>
`Ultramarine`
<p>
<img alt="Ultramarine"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/ultramarine.png" width="340" height="258" />
</p>

### Deriving color schemes

The `org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme` contains a number of APIs to create derived color schemes. Note that a color scheme is a delicate balance between the foreground color and the background colors, providing visually appealing selection of colors that are designed to work together on various painters. In some cases, creating a derived color scheme with one the these APIs (especially negated and inverted color schemes) will not result in visually pleasing appearance.

The following API allows shifting both the background and the foreground colors:

```java
  /**
   * Creates a shift version of <code>this</code> scheme.
   *
   * @param backgroundShiftColor
   *     Shift color for background colors. Should have full opacity.
   * @param backgroundShiftFactor
   *     Value in 0.0...1.0 range. Larger values shift more towards the
   *     specified color.
   * @param foregroundShiftColor
   *     Shift color for foreground colors. Should have full opacity.
   * @param foregroundShiftFactor
   *     Value in 0.0...1.0 range. Larger values shift more towards the
   *     specified color.
   * @return Shift version of <code>this</code> scheme.
   */
  public SubstanceColorScheme shift(Color backgroundShiftColor,
      double backgroundShiftFactor, Color foregroundShiftColor,
      double foregroundShiftFactor)
```      
Here is the `Purple` color scheme shifted 80% towards light green in background colors and 70% towards dark red in foreground color (see the foreground color of the default button):

<img alt="Derived Shifted"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/derived-shifted.png" width="340" height="258" />

The following API allows shifting only the background colors:

```java
  /**
   * Creates a shift version of <code>this</code> scheme.
   *
   * @param backgroundShiftColor
   *     Shift color for background colors. Should have full opacity.
   * @param backgroundShiftFactor
   *     Value in 0.0...1.0 range. Larger values shift more towards the
   *     specified color.
   * @return Shift version of <code>this</code> scheme that does not change
   *   the foreground color.
   */
  public SubstanceColorScheme shiftBackground(Color backgroundShiftColor,
      double backgroundShiftFactor)
```      
Here is the same `Purple` color scheme shifted 80% towards light red in background colors:

<img alt="Derived Shifted Background"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/derived-shiftedbackground.png" width="340" height="258" />

The following API allows tinting the colors (shifting towards white):

```java
  /**
   * Creates a tinted (shifted towards white) version of <code>this</code>
   * color scheme.
   *
   * @param tintFactor
   *     Value in 0.0...1.0 range. Larger values shift more towards white
   *     color.
   * @return Tinted version of <code>this</code> scheme.
   */
  public SubstanceColorScheme tint(double tintFactor)
```

The following API allows toning the colors (shifting towards gray):

```java
  /**
   * Creates a toned (shifted towards gray) version of <code>this</code> color
   * scheme.
   *
   * @param toneFactor
   *     Value in 0.0...1.0 range. Larger values shift more towards gray
   *     color.
   * @return Toned version of <code>this</code> scheme.
   */
  public SubstanceColorScheme tone(double toneFactor)
```  
The following API allows shading the colors (shifting towards black):

```java
  /**
   * Creates a shaded (shifted towards black) version of <code>this</code>
   * color scheme.
   *
   * @param shadeFactor
   *     Value in 0.0...1.0 range. Larger values shift more towards black
   *     color.
   * @return Shaded version of <code>this</code> scheme.
   */
  public SubstanceColorScheme shade(double shadeFactor)
```

Here is the same `Purple` color scheme tinted 40%, toned 40% and shaded 40%:

<img alt="Derived Tinted"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/derived-tinted.png" width="340" height="258" />
<img alt="Derived Toned"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/derived-toned.png" width="340" height="258" />
<img alt="Derived Shaded"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/derived-shaded.png" width="340" height="258" />

The following API allows saturating or desaturating the colors:

```java
  /**
   * Creates a saturated or desaturated version of <code>this</code> scheme.
   * The value and brightness stay the same.
   *
   * @param saturateFactor
   *     Value in -1.0...1.0 range. Positive values create more saturated
   *     colors. Negative values create more desaturated colors.
   * @return Saturated version of <code>this</code> scheme.
   */
  public SubstanceColorScheme saturate(double saturateFactor)
```

Here is the same `Purple` color scheme saturated 40% and desaturated 40%:

<img alt="Derived Saturated"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/derived-saturate.png" width="340" height="258" />
<img alt="Derived Desaturated"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/derived-desaturate.png" width="340" height="258" />

The following API allows inverting the colors:

```java
  /**
   * Creates an inverted version of <code>this</code> scheme.
   *
   * @return Inverted version of <code>this</code> scheme.
   */
  public SubstanceColorScheme invert()
```

The following API allows negating the colors:

```java
  /**
   * Creates a negated version of <code>this</code> scheme.
   *
   * @return Negated version of <code>this</code> scheme.
   */
  public SubstanceColorScheme negate()
```

Here is the same `Purple` color scheme inverted and negated:

<img alt="Derived Inverted"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/derived-invert.png" width="340" height="258" />
<img alt="Derived Negated"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/derived-negate.png" width="340" height="258" />

The following API allows shifting the hue of the colors:

```java
  /**
   * Creates a hue-shifted (in HSB space) version of <code>this</code> color
   * scheme.
   *
   * @param hueShiftFactor
   *     Value in -1.0...1.0 range.
   * @return Hue-shifted version of <code>this</code> scheme.
   */
  public SubstanceColorScheme hueShift(double hueShiftFactor)
```

Here is the same `Purple` color scheme hue-shifted 40%:

<img alt="Derived Hue Shifted"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/colorschemes/derived-hueshift.png" width="340" height="258" />

### Additional color schemes

Additional color schemes can be found in the [extras pack](colorschemes-extras.md).
