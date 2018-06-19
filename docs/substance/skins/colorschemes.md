## Substance look and feel - color schemes

A **color scheme** is a set of information that allows painting a control in a specific visual state. In general, a color scheme defines a collection of colors that are used by the various Substance [painters](../painters/overview.md) to paint different control areas (such as background fill, border etc) under a specific visual state.

The `org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme` contains all the APIs officially supported by Substance color schemes. The APIs can be roughly divided in three categories:

* Base colors. These are defined in the `org.pushingpixels.substance.api.colorscheme.SchemeBaseColors`
* Derived colors. These are defined in the `org.pushingpixels.substance.api.colorscheme.SchemeDerivedColors`
* Creating derived color schemes.

The Substance core library provides the following twenty one color schemes:

* Light color schemes: `Aqua`, `Barby Pink`, `Bottle Green`, `Brown`, `Creme`, `Light Aqua`, `Lime Green`, `Olive`, `Orange`, `Purple`, `Raspberry`, `Sepia`, `Steel Blue`, `Sunset`, `Sun Glare` and `Terracotta`
* Dark themes : `Ebony`, `Dark Violet`, `Charcoal`, `Jade Forest` and `Ultramarine`.

<img alt="Aqua"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/aqua.png" width="340" height="254" />
<img alt="Barby Pink"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/barby-pink.png" width="340" height="254" />
<img alt="Bottle Green"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/bottle-green.png" width="340" height="254" />
<img alt="Brown"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/brown.png" width="340" height="254" />
<img alt="Creme"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/creme.png" width="340" height="254" />
<img alt="Light Aqua"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/light-aqua.png" width="340" height="254" />
<img alt="Line Green"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/lime-green.png" width="340" height="254" />
<img alt="Olive"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/olive.png" width="340" height="254" />
<img alt="Orange"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/orange.png" width="340" height="254" />
<img alt="Purple"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/purple.png" width="340" height="254" />
<img alt="Raspberry"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/raspberry.png" width="340" height="254" />
<img alt="Sepia"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/sepia.png" width="340" height="254" />
<img alt="Steel Blue"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/steel-blue.png" width="340" height="254" />
<img alt="Sunset"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/sunset.png" width="340" height="254" />
<img alt="Sun Glare"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/sun-glare.png" width="340" height="254" />
<img alt="Terracotta"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/terracotta.png" width="340" height="254" />
<p>
<img alt="Ebony"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/ebony.png" width="340" height="254" />
<img alt="Dark Violet"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/dark-violet.png" width="340" height="254" />
<img alt="Charcoal"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/charcoal.png" width="340" height="254" />
<img alt="Jade Forest"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/jade-forest.png" width="340" height="254" />
<img alt="Ultramarine"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/ultramarine.png" width="340" height="254" />

### Derived color schemes

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

<img alt="Derived Shifted"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/derived-shifted.png" width="340" height="254" />

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

<img alt="Derived Shifted Background"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/derived-shiftedbackground.png" width="340" height="254" />

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

<img alt="Derived Tinted"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/derived-tinted.png" width="340" height="254" />
<img alt="Derived Toned"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/derived-toned.png" width="340" height="254" />
<img alt="Derived Shaded"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/derived-shaded.png" width="340" height="254" />

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

<img alt="Derived Saturated"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/derived-saturate.png" width="340" height="254" />
<img alt="Derived Desaturated"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/derived-desaturate.png" width="340" height="254" />

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

<img alt="Derived Inverted"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/derived-invert.png" width="340" height="254" />
<img alt="Derived Negated"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/derived-negate.png" width="340" height="254" />

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

<img alt="Derived Hue Shifted"  src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/colorschemes/derived-hueshift.png" width="340" height="254" />
