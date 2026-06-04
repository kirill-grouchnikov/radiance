## Radiance look and feel - root pane decorators

The base interface for Radiance root pane decorators is `RadianceRootPaneDecorator`. The root pane decorator from the current skin is responsible for the visuals of "chrome" part of decorated root panes - frames, dialogs, etc.

This method is used to compute the root pane insets:

```java
Insets getRootPaneBorderInsets();
```

This method is used to paint the visuals of the decorated root pane border:

```java
void paintRootPaneBorder(Graphics2D graphics, Component comp,
    int width, int height, double scaleFactor, ContainerColorTokens colorTokens);
```

The `width` and `height` parameters define the size of the decorated root pane, while the `colorTokens` specifies the color tokens to be used to paint the border visuals.

Radiance provides a default implementation of this interface in `DefaultRootPaneDecorator`. Skins that target more custom visuals can either implement the `RadianceRootPaneDecorator` interface from scratch, or extend the `DefaultRootPaneDecorator` class.

The core Blueprint skin is an example of a custom root pane decorator:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/decorators/rootpane-blueprint.png"/>

### Management API

If you wish to use the root pane decorator of the current skin to provide additional custom painting in your application, call:

* `RadianceThemingCortex.GlobalScope.getCurrentSkin()`	to retrieve the current skin.
* `RadianceSkin.getRootPaneDecorator()` to retrieve the outline painter of the current skin.
* Call the relevant method(s) on the `RadianceRootPaneDecorator`.
