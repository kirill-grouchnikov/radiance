## Radiance look and feel - tab decorators

The base interface for Radiance tab decorators is `RadianceTabDecorator`. The tab decorator from the current skin is responsible for the visuals of tabs - paddings, background fill, highlight indicator of the selected tab, outlines, etc.

Radiance provides a default implementation of this interface in `DefaultTabDecorator`. Skins that target more custom visuals can either implement the `RadianceTabDecorator` interface from scratch, or extend the `DefaultTabDecorator` class.

In the image below, the top one shows the default visuals of tabs under the Gemini skin. The bottom one shows custom visuals of tabs:

* No outline for the selected tab
* The highlight indicator is a thick underline
* That needs a larger bottom padding for all tabs

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/decorators/tabs.png" width="545"/>

### Management API

If you wish to use the tab decorator of the current skin to provide additional custom painting in your application, call:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()`	to retrieve the current skin.
* `RadianceSkin.getDecorators().getTabDecorator()` to retrieve the tab decorator of the current skin.
* Call the relevant method(s) on the `RadianceTabDecorator`.
