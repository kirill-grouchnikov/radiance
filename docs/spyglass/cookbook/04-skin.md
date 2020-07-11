## Cookbook - implementing the skin

### Anatomy of a skin

While the concepts of decoration areas and decoration painters introduced in the [second phase](02-map.md) and implemented in the [third phase](03-decorations.md) are one of the most powerful features in Substance, they are part of the more comprehensive package of settings designed to facilitate creation of consistent and configurable visuals for modern graphical user interfaces. In Substance terminology it is called a [skin](../../substance/skins/overview.md).

This phase of Cookbook UI implementation will focus on creating the other parts of the skin, including color schemes, color scheme bundles, the fill painter and the border painter.

### Color schemes

A [color scheme](../../substance/skins/colorschemes.md) is a set of information that allows painting a control in a specific visual state. In general, a color scheme defines a collection of colors that are used by the various Substance painters to paint different control areas (such as background fill, border etc) under a specific visual state.

The color schemes were implicitly used in the [previous phase](03-decorations.md) to drive the colorization of the decoration area textures. At the most basic level a color scheme can be thought of as a palette that provides colors to the different painters. Each color scheme defines seven basic colors, six for background and one for foreground. In addition, a color scheme exposes derived colors that are used for painting text selections, focus rings and more. The derived colors are usually implemented as a combination of one or more basic colors and can be overriden by the custom skin.

The main two color schemes for Cookbook UI are Golden Brown and Dark Brown. Here are their background palettes:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/spyglass/cookbook/04-skin/goldenbrown.png" width="240" border=0/>

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/spyglass/cookbook/04-skin/darkbrown.png" width="240" border=0/>

Radiance includes [Apollo](../../tools/apollo/apollo.md) - a visual editor for creating and editing files that serve as color scheme lists.

Looking at the Cookbook UI design we can see that `Golden Brown` color scheme is used for:

* Background fill and texture of header and footer areas.
* Background fill of default buttons in header and footer areas.
* Highlights on the selected elements in sidebar area.
* Scroll bar in sidebar area.

The `Dark Brown` color scheme is used for:

* Background fill and texture of sidebar area.
* Selected buttons in header and footer area.
* Slider track in header area.

The definition of color scheme bundles in the custom Substance skin will use these two color schemes as the main building blocks. `Dark Brown` will be used for:

* `GENERAL` area, controls in default and disabled state. Disabled controls will be painted with 70% opacity.
* `PRIMARY_TITLE_PANE`, `TOOLBAR` and `FOOTER` areas, controls in active states. This will make the selected button in the toolbar painted with dark background.

`Golden Brown` will be used for:

* `GENERAL` area, controls in active state. This will paint the sidebar scroll bar since the enabled scroll bars are painted in active state (this is true for all Substance skins).
* `PRIMARY_TITLE_PANE`, `TOOLBAR` and `FOOTER` areas, controls in default and disabled state. Disabled controls will be painted with 70% opacity.

Here are the sidebars of the original mock-up and Substance-powered implementation of it:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/spyglass/cookbook/sidebars.png" width="500" border=0/>

Note the correct color schemes for the relevant decoration areas, including the background, textures, buttons, scroll bar and slider. The only two discrepancies comes from:

* the slider track – by design Substance uses the same default (Golden Brown) color scheme to paint its track unless the mouse is over the slider.
* the scroll bar track - by design Substance fills the entire area of the scroll bar with flat color based on the associated skin, decoration area type and color scheme.

In addition to the two color schemes above, we define three color schemes to be used on `NONE` area type. In case of Cookbook UI these schemes are only relevant for the search text field in the second footer panel (marked as `NONE` to create the custom visuals). Since every Substance skin must define a color scheme bundle for the `NONE` area type, this is a step that you can not omit. Here are the palettes for the active, default and disabled color schemes of `NONE`:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/spyglass/cookbook/04-skin/active.png" width="240" border=0/>

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/spyglass/cookbook/04-skin/enabled.png" width="240" border=0/>

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/spyglass/cookbook/04-skin/disabled.png" width="240" border=0/>

### Fill and border painters

Here is a zoomed version of footer buttons in Cookbook UI:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/spyglass/cookbook/04-skin/zoom-buttons-cookbook.png" width="360" border=0/>

Analyzing the visuals, we can see:

* The fill gradient goes from light at the top to dark at the middle with no brightness inflection.
* The fill gradient is overlayed with the continuous texture of the relevant region.
* The outer border is a gradient that goes from dark at the top to very dark at the bottom.
* The inner border is a gradient that goes from very light at the top to completely translucent at the bottom.

The implementation has a custom [fill painter](../../substance/painters/fill.md) and a custom [border painter](../../substance/painters/border.md). Base Substance painters provide extension points for computing the relevant stop point colors, handling all the rest of the logic (anti-aliasing, stroke widths, insets, scaling gaps, caching etc). All we need to do in our custom painter implementation is to emulate the colors of the target design.

Here are the original design and the custom Substance implementation side-by-side:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/spyglass/cookbook/03-decorations/footers.png" width="132" border=0/>

[Continue on](05-polish.md) to read about visual polish.
