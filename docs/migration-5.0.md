## Migration to version 5.0

Version 5.0 is the [long-planned](https://github.com/kirill-grouchnikov/radiance/issues/315) refactoring of the codebase to move away from original codenames for various modules (Trident, Substance, Flamingo) and rename everything based on the functional boundaries.

This page lists the mapping between the old and the new names.

### Maven Modules

Everything was and remains under the same `groupId` which is `org.pushing-pixels`. This mapping shows old and new values of `artifactId`

| In 4.5 | In 5.0 |
| --- | --- |
| `radiance-neon` | `radiance-common` |
| `radiance-trident` | `radiance-animation` |
| `radiance-substance` | `radiance-theming` |
| `radiance-substance-extras` | `radiance-theming-extras` |
| `radiance-flamingo` | `radiance-component` |
| `radiance-photon` | `radiance-svg-transcoder` |
| `radiance-ignite` | `radiance-svg-transcoder-gradle-plugin` |
| `radiance-beacon` | `radiance-theming-debugger` |
| `radiance-ember` | `radiance-theming-ktx` |
| `radiance-meteor` | `radiance-swing-ktx` |
| `radiance-plasma` | `radiance-component-ktx` |
| `radiance-torch` | `radiance-animation-ktx` |

### Package names for public APIs

In the mapping below, `o.p` stands for `org.pushingpixels`

| In 4.5 | In 5.0 |
| --- | --- |
| `o.p.neon` | `o.p.radiance.common` |
| `o.p.trident` | `o.p.radiance.animation` |
| `o.p.substance` | `o.p.radiance.theming` |
| `o.p.flamingo` | `o.p.radiance.component` |
| `o.p.meteor` | `o.p.radiance.swing.ktx` |
| `o.p.torch` | `o.p.radiance.animation.ktx` |
| `o.p.ember` | `o.p.radiance.theming.ktx` |
| `o.p.plasma` | `o.p.radiance.component.ktx` |
| `o.p.tools.beacon` | `o.p.radiance.tools.themedebugger` |
| `o.p.tools.lightbeam` | `o.p.radiance.tools.lafbenchmark` |
| `o.p.tools.photon` | `o.p.radiance.tools.svgtranscoder` |
| `o.p.tools.ignite` | `o.p.radiance.tools.svgtranscoder.gradle` |

### Class names for public APIs, Neon / Common

| In 4.5 | In 5.0 |
| --- | --- |
| `NeonCortex` | `RadianceCommonCortex` |
| `NeonIcon` | `RadianceIcon` |
| `NeonIconUIResource` | `RadianceIconUIResource` |
| `NeonAsyncLoadingIconUIResource` | `RadianceAsyncLoadingIconUIResource` |
| `NeonAbstractFilter` | `RadianceAbstractFilter` |
| `ImageBackedFilterableNeonIcon` | `ImageBackedFilterableRadianceIcon` |

### Class names for public APIs, Trident / Animation

| In 4.5 | In 5.0 |
| --- | --- |
| `TridentCortex` | `RadianceAnimationCortex` |


### Class names for public APIs, Substance / Theming

| In 4.5 | In 5.0 |
| --- | --- |
| `SubstanceLookAndFeel` | `RadianceLookAndFeel` |
| `SubstanceSkin` | `RadianceSkin` |
| `SubstanceCortex` | `RadianceThemingCortex` |
| `SubstanceSlices` | `RadianceThemingSlices` |
| `SubstanceSlices.SubstanceWidgetType` | `RadianceThemingSlices.WidgetType` |
| `SubstanceComponentPlugin` | `RadianceThemingComponentPlugin` |
| `SubstanceSkinPlugin` | `RadianceThemingSkinPlugin` |
| `SubstanceWidget` | `RadianceThemingWidget` |
| `SubstanceColorSchemeBundle` | `RadianceColorSchemeBundle` |
| `SubstanceColorScheme` | `RadianceColorScheme` |
| `SubstanceTrait` | `RadianceTrait` |
| `SubstanceTraitInfo` | `RadianceTraitInfo` |
| `SubstanceBorderPainter` | `RadianceBorderPainter` |
| `SubstanceDecorationPainter` | `RadianceDecorationPainter` |
| `SubstanceFillPainter` | `RadianceFillPainter` |
| `SubstanceHighlightPainter` | `RadianceHighlightPainter` |
| `SubstanceOverlayPainter` | `RadianceOverlayPainter` |
| `SubstanceButtonShaper` | `RadianceButtonShaper` |
| `SubstanceIconPack` | `RadianceIconPack` |
| `SubstanceInputMap` | `RadianceInputMap` |
| `SubstanceRenderer` | `RadianceRenderer` |
| `SubstanceDefaultTableHeaderCellRenderer` | `RadianceDefaultTableHeaderCellRenderer` |
| `SubstanceDefaultComboBoxRenderer` | `RadianceDefaultComboBoxRenderer` |
| `SubstanceDefaultTreeCellRenderer` | `RadianceDefaultTreeCellRenderer` |
| `SubstanceDefaultListCellRenderer` | `RadianceDefaultListCellRenderer` |
| `SubstancePanelListCellRenderer` | `RadiancePanelListCellRenderer` |
| `SubstanceDefaultTableCellRenderer` | `RadianceDefaultTableCellRenderer` |
| `SubstanceEditorPane` | `RadianceEditorPane` |
| `SubstanceFormattedTextField` | `RadianceFormattedTextField` |
| `SubstancePasswordField` | `RadiancePasswordField` |
| `SubstanceTextArea` | `RadianceTextArea` |
| `SubstanceTextField` | `RadianceTextField` |
| `SubstanceTextPane` | `RadianceTextPane` |

### Transcoded SVG icons

If your project is using SVG icons transcoded by Radiance, see the [updated documentation](tools/svg-transcoder/svg-transcoder.md) on how to regenerate them to be compatible with version 5.0.
