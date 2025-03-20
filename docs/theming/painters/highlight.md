## Radiance look and feel - highlight painters

The highlight painters are used to paint highlightable areas of application content. In Radiance, the highlight painters are the same `RadianceSurfacePainter` and `RadianceOutlinePainter` interfaces for [surface](surface.md) and [outline](outline.md) painters. The choice of when to use the highlight visuals vs the regular painter is left for the application side to decide. Some applications may decide to use different visuals for selected items in lists or grids, in which case they may opt to use the highlight painter.

Radiance uses the highlight painters on list, table and tree cell renderers, as well as active menu items. This allows the application code to provide different highlight visuals for elements in repeatable collection-based containers such as lists and grids.

The highlight painters can also be used to paint visuals of third-party components (see [skinning primer](custom-skinning.md) for more information). This allows providing a consistent and pluggable appearance to those components. In addition, it provides an external API for applications that wish to skin custom components in a visually consistent manner.

### Management API

If you wish to use the highlight painters of the current skin to provide additional custom painting in your application, call:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()` to retrieve the current skin.
* `RadianceSkin.getHighlightSurfacePainter()` to retrieve the highlight surface painter of the current skin and `RadianceSurfacePainter.paintContourBackground()` to paint the highlight surface on the specific graphics context.
* `RadianceSkin.getHighlightOutlinePainter()` to retrieve the highlight outline painter of the current skin and `RadianceOutlinePainter.paintContourBackground()` to paint the highlight outline on the specific graphics context.
