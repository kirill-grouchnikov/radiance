## Radiance look and feel - custom skinning

As mentioned in the [painter overview](overview.md), most of the Radiance painting logic is abstracted into a set of painters. Not only this allows preventing duplicate painting sequence in the Radiance UI delegates, but it also provides a flexible painting layer for the applications that wish to paint custom components in a way that is consistent with other Radiance visuals.

This applies in two major cases:

* Providing consistent painting for additional Radiance components in [Flamingo](../../flamingo/flamingo.md)
* Providing consistent painting for custom components and visual areas of a specific application.

Instead of trying to match the colors, gradients and animation sequences from the current Radiance skin (which might change between various releases), applications can use the Radiance painting APIs. Such code should be shorter and more maintainable, and will also produce better visual consistency across the entire UI.

### Skinning primer

The following Radiance APIs are most suited for painting custom components:

* [Fill painters](fill.md)
* [Border painters](border.md)
* [Highlight painters](highlight.md)
* [Decoration painters](decoration.md)
* [Overlay painters](overlay.md)

Most of the Radiance UI delegates use a combination of the above APIs. And even as the exact combinations in the existing UI delegates is subject to change in between releases, the main combination patterns in Radiance codebase can be reduced down to a few recurring patterns.

### Decorating

[Decoration painters](decoration.md) are used to provide distinct painting to some containers, this setting them "apart" from the rest of the application. As the pattern name implies, this works best on specialized containers and visual areas that are situated along the window edges. Here is an example of Flamingo's breadcrumb bar marked as `header`:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/header.png" width="596" height="431"/>

In this scenario, the entire `JBreadcrumbBar` component is marked to have decoration area type of `header`. Flamingo's UI delegate for that component calls the painting method that respects the decoration area type, resulting in consistent visual appearance across all Radiance skins.

Here is another example of this pattern, this time on a status bar component. Assuming that this component will be placed along the bottom side of the frame, the matching code uses the current decoration painter to provide a distinct appearance of status bar which is consistent with the title pane and menu bar:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/footer.png" width="628" height="388"/>

### Border tracing

Components that require consistent painting of borders or contours can use the border painter with the matching contour. Here is an example of border tracing in the `JRibbon` component from [Flamingo](../../flamingo/flamingo.md) component library:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/jribbon.png" width="600" height="210"/>

The UI delegates for the main `JRibbon` components and inner parts use the border painter extensively to create the required visuals. Note the outer contour of the ribbon that also includes the selected tab button, and the inner contours of the ribbon tasks.

Here is another example of this pattern, this time on the `JCommandButton` component from Flamingo library. The custom UI delegate uses the border painter to paint the button border (a simpler contour in this case):

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/jcommandbutton.png" width="600" height="210"/>

### Inner fills

This pattern is used to paint the inner fill of custom components (along with the border tracing pattern to paint the component contour). This pattern uses the fill painter with the matching contour. Here is an example of the `JRibbon` component from [Flamingo](../../flamingo/flamingo.md) component library:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf/painters/jtoggletabbutton.png" width="600" height="210"/>

In this example, the first toggle tab button (`Page Layout`) is painted by the current fill painter, providing a consistent appearance with the rest of the application controls. Another example is the `Style 1` command button, where the button fill is painted by the current fill painter as well.
