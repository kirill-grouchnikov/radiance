## Radiance look and feel - palette seeds

The `TonalPaletteSeeds` class in `theming.api.colorscheme` package replaces the pre-Chroma set of core color schemes.

### Light seeds

It is up to the application code to decide how to generate a full color tokens bundle from one of the light seeds. Active container color tokens can be generated directly from the seed using `ContainerColorTokensUtils.getContainerTokens(Hct.fromInt(TonalPaletteSeeds.XYZ), ContainerConfiguration.defaultLight())`. Muted and neutral container color tokens can be generated from the same seed but lower chroma, or from app-specific neutral / greyscale seeds.

The following screenshots show sample skins created from each one of the 15 light seeds, where the muted and neutral container color tokens were generated from hardcoded neutral seeds:

Aqua, Barby Pink
<p>
<img alt="Aqua"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/aqua.png" width="340" height="258" />
<img alt="Barby Pink"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/barby-pink.png" width="340" height="258" />
</p>

Bottle Green, Brown
<p>
<img alt="Bottle Green"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/bottle-green.png" width="340" height="258" />
<img alt="Brown"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/brown.png" width="340" height="258" />
</p>

Desert Sand, Lime Green
<p>
<img alt="Desert Sand"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/desert-sand.png" width="340" height="258" />
<img alt="Lime Green"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/lime-green.png" width="340" height="258" />
</p>

Olive, Orange
<p>
<img alt="Olive"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/olive.png" width="340" height="258" />
<img alt="Orange"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/orange.png" width="340" height="258" />
</p>

Purple, Raspberry
<p>
<img alt="Purple"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/purple.png" width="340" height="258" />
<img alt="Raspberry"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/raspberry.png" width="340" height="258" />
</p>

Sepia, Steel Blue
<p>
<img alt="Sepia"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/sepia.png" width="340" height="258" />
<img alt="Steel Blue"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/steel-blue.png" width="340" height="258" />
</p>

Sun Glare, Sunset
<p>
<img alt="Sunset"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/sunset.png" width="340" height="258" />
<img alt="Sun Glare"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/sun-glare.png" width="340" height="258" />
</p>

Terracotta
<p>
<img alt="Terracotta"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/terracotta.png" width="340" height="258" />
</p>

### Dark seeds

It is up to the application code to decide how to generate a full color tokens bundle from one of the dark seeds. Active container color tokens can be generated directly from the seed using `ContainerColorTokensUtils.getContainerTokens(Hct.fromInt(TonalPaletteSeeds.XYZ), ContainerConfiguration.defaultDark())`. Muted and neutral container color tokens can be generated from the same seed but lower chroma, or from app-specific neutral / greyscale seeds.

The following screenshots show sample skins created from each one of the 5 light seeds, where the muted and neutral container color tokens were generated from hardcoded neutral seeds:

Charcoal, Jade Forest
<p>
<img alt="Charcoal"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/charcoal.png" width="340" height="258" />
<img alt="Jade Forest"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/jade-forest.png" width="340" height="258" />
</p>
Ultramarine, Violet
<p>
<img alt="Ultramarine"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/ultramarine.png" width="340" height="258" />
<img alt="Violet"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/paletteseeds/violet.png" width="340" height="258" />
</p>

### Additional palette seeds

Additional palette seeds can be found in the [extras pack](palette-seeds-extras.md).
