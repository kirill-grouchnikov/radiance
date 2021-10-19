## Radiance look and feel - themed states

### Introduction

Radiance comes with built-in support for animating state transitions for the core Swing components, as well as for all the Flamingo components.

Let's take a look at this screenshot from the [component states](skins/componentstates.md) documentation:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/states/control-states-extended.png"
width="275" height="279"/>

Here we see how one of the Radiance skins (Office Silver 2007) provides different visuals for different component states - light yellow for rollover, light orange for selected, deeper orange for pressed, etc. As the component - such as `JButton` in this case - reacts to the user interaction and changes state, Radiance smoothly animates the visuals of that component to reflect the new state. In the case of our `JButton`, that includes the inner fill, the border and the text.

This comes particularly handy for skins that mix light and dark visuals for different states of the same component. Here is the same UI under the Magellan skin:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/states/control-states-extended-mix.png"
width="275" height="279"/>

Note how the selected button uses light text on dark background, while the rollover selected button uses dark text on light background. If your UI uses the Magellan skin (or any other skin that uses a mix of light and dark color schemes), Radiance will do the right thing to animate all relevant parts of your UI as the user interacts with it.

What about the icons?

### Theming icons

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/states/icon-no-theming.png"
width="757" height="550"/>

This is a screenshot of the main Radiance demo app running under the Nebula Amethyst skin. As UIs with lots of icons can get pretty busy, Radiance provides APIs to theme the icons based on the current skin visuals.

The APIs are in the `RadianceThemingCortex` class, one in the `GlobalScope` to apply on all icons in your app, and one in the `ComponentScope` to configure icon filtering (theming) for the specific control:

* `RadianceThemingCortex.GlobalScope.setIconFilterStrategies` for global icon filtering
* `RadianceThemingCortex.ComponentScope.setIconFilterStrategies` for per-component icon filtering

These APIs apply for components / icons in three states:
 * Disabled
 * Enabled
 * Active (any combination of rollover, pressed, armed, selected)

 Three icon filtering strategies are supported:
 * `ORIGINAL` - leave the icon as supplied by the application with no filtering applied
 * `THEMED_FOLLOW_TEXT` - filter the icon to use the text color that matches the current component state
 * `THEMED_FOLLOW_COLOR_SCHEME` - filter the icon to use the Radiance color scheme from the currently set skin that matches the component in its current state

`THEMED_FOLLOW_COLOR_SCHEME` which works best for multi-color / multi-tone icons and Radiance skins with multi-color color schemes. Here is the same UI with this icon filter strategy applied on enabled and disabled component states:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/states/icon-theming-enabled.png"
width="757" height="550"/>

Take a look at the icons in the toolbar. The icon for the active / selected button (bold A) is still in full original color, but the rest of the icons have been themed with the colors of the enabled color scheme configured for the toolbar area of the Nebula Amethyst skin. This work well in this particular case because:

* The original Tango icons have enough contrast to continue being easily recognizable when they are themed in what is essentially a mono-chrome purple color palette
* Nebula Amethyst skin uses color schemes with different background colors for the ultra light to ultra dark range, so that when these colors are used to theme the original icons, the icons remain crisp and legible.

`THEMED_FOLLOW_TEXT` works best for single-tone icons found in such popular icon packs as [Material](https://material.io/resources/icons/), [Ionicons](https://ionicons.com/), [Friconix](https://friconix.com/), [Flexicons](https://setproduct.com/flexicons), [Font Awesome](https://fontawesome.com/) and many others:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/states/control-states-extended-themed.png"
width="275" height="279"/>

In this screenshot of the same UI from earlier under the Magellan skin, all the buttons use the same help icon from the Material icon pack converted by [Photon](../tools/svgtranscoder/svgtranscoder.md). At runtime, Radiance filters the icon to follow the foreground / text color of the button for a consistent look across all component states.
