## Migration to version 8.0

Version 8.0 is the [long-planned](https://github.com/kirill-grouchnikov/radiance/issues/400) refactoring of the codebase to introduce a new color system.

This page lists the mapping between the old and the new APIs.

### Package names for public APIs

In the mapping below, `o.p.r.t.a.p` stands for `org.pushingpixels.radiance.theming.api.painter`

| In 7.5 | In 8.0 |
| --- | --- |
| `o.p.r.t.a.p.border` | `o.p.r.t.a.p.outline` |
| `o.p.r.t.a.p.fill` | `o.p.r.t.a.p.surface` |

### Class names for public APIs

| In 7.5 | In 8.0 |
| --- | --- |
| `RadianceBorderPainter` | `RadianceOutlinePainter` |
| `RadianceFillPainter` | `RadianceSurfacePainter` |

All relevant APIs that work with these painters in `RadianceSkin` and elsewhere have been updated to reflect the new naming conventions.

### APIs that have been replaced

* `RadianceColorScheme` has been replaced by `ContainerColorTokens`, including all relevant Radiance painter APIs. Use `ContainerColorTokensUtils` to get `ContainerColorTokens` from seed colors and additional container configuration options.
* State-specific alphas (including for highlights) are now configured via `ContainerColorTokens` APIs for disabled alpha for container surface, on container, and container outline tokens.
* `RadianceSkin.getBackgroundColorScheme` is now `RadianceSkin.getNeutralContainerTokens`.
* Shading, tinting, toning, saturating, hue shifting, negating and inverting a `RadianceColorScheme` can be achieved with changing the seed HCT or container configuration passed to `ContainerColorTokensUtils.getContainerTokens`:
  * Shading and tinting by changing the seed tone
  * Toning and saturating by changing the seed chroma
  * Hue shifting by changing the seed hue
  * Negating and inverting by changing the dark flag in the container configuration
* `RadianceColorSchemeBundle` has been replaced by `ContainerColorTokensBundle`.
* Color overlay APIs in `RadianceSkin` are removed. Use `ContainerColorTokensBundle.registerActiveContainerTokens` for configuring state-specific color tokens to use to paint controls.
* Base and derived colors are replaced by color tokens in `ContainerColorTokens`. Use `PaletteContainerColorsResolverOverlay` and `BimodalPaletteContainerColorsResolverOverlay` to tweak color token resolution for specific visuals in your application.
* `RadianceThemingSlices.ColorSchemeAssociationKind` is replaced with `RadianceThemingSlices.ContainerColorTokensAssociationKind`.
* `RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME` is now `RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_TOKENS`
* `RadianceFillPainter.paintContourBackground` is now `RadianceSurfacePainter.paintSurface`.
* `RadianceBorderPainter.paintBorder` is now `RadianceOutlinePainter.paintOutline`.
* A new enum added to `RadianceThemingSlices` - `SystemContainerType` - for retrieving system container color tokens from `RadianceSkin` and `ContainerColorTokensBundle`.
* Core color schemes (such as Aqua, Bottle Green, etc) are now provided as a set of palette seeds in the `TonalPaletteSeeds` class.
