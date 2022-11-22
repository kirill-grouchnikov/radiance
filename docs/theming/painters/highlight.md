## Radiance look and feel - highlight painters

The highlight painter is used to paint special highlightable areas of application content. In Radiance, the highlight painter is using the same `RadianceFillPainter` interface as the [fill painter](fill.md). The choice of when to use the highlight painter vs the fill painter is left for the application side to decide. Some applications may decide to use different visuals for selected items in lists or grids, in which case they may opt to use the highlight painter.

Radiance uses the highlight painter on list, table and tree cell renderers, as well as active menu items. This allows the application code to provide different highlight visuals for elements in repeatable collection-based containers such as lists and grids.

The highlight painter can also be used to paint visuals of third-party components (see [skinning primer](custom-skinning.md) for more information). This allows providing a consistent and pluggable appearance to those components. In addition, it provides an external API for applications that wish to skin custom components in a visually consistent manner.

### Management API

If you wish to use the highlight painter of the current skin to provide additional custom painting in your application, call:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()` to retrieve the current skin.
* `RadianceSkin.getHighlightPainter()` to retrieve the highlight painter of the current skin.
* `RadianceFillPainter.paintContourBackground()` to paint the highlight background on the specific graphics context.
