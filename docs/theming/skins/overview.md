## Radiance look and feel - skins

### Introduction

A **skin** is a set of visual settings that gives your application a polished and consistent look. The core Radiance library bundles a number of predefined skins that can be broadly categorized as light and dark.

[Light skins](toneddown.md) use predominantly light colors for painting the UI controls and containers. [Business skin](toneddown.md#business) is an example of a light skin:

<p>
<img alt="Business" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/business1.png" width="340" height="258">
<img alt="Business" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/business2.png" width="340" height="258">
</p>

[Dark skins](dark.md) use predominantly dark colors for painting the UI controls and containers. [Graphite Chalk](dark.md#graphite-chalk) skin is an example of a dark skin:

<p>
<img alt="GraphiteChalk" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/graphitechalk1.png" width="340" height="258">
<img alt="GraphiteChalk" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/graphitechalk2.png" width="340" height="258">
</p>

The core Radiance skins are in the `org.pushingpixels.radiance.theming.api.skin` package, and the `RadianceSkin` class contains all the APIs officially supported by Radiance skins. It is possible to use different Radiance skins on different windows in the same application. Consult the documentation on the `RadianceThemingCortex.RootPaneScope.setSkin` API.

### Skin definition

The skin definition consists of the following:

* Decoration areas and color scheme bundles:
  * List of supported [decoration areas](../painters/decoration.md).
  * [Color scheme bundles](colorschemebundles.md) for the supported decoration areas.
  * Optional background [color schemes](colorschemes.md) for the supported decoration areas.
* Painters:
  * [Fill painter](../painters/fill.md).
  * [Border painter](../painters/border.md).
  * [Highlight painter](../painters/highlight.md).
  * [Decoration painter](../painters/decoration.md).
* Miscellaneous:
  * [Button shaper](../../hyperion/hyperion.md).
  * Optional [overlay painters](../painters/overlay.md) for some decoration areas.
  * Optional values for start and end values of tab fade on `JTabbedPane` and similar containers.

In order to define a valid skin, you need to specify all its mandatory parameters. A valid skin must have a color scheme bundle for `DecorationAreaType.NONE`, a button shaper, a fill painter, a decoration painter, a highlight painter and a border painter. All other parts are optional.

### Decoration areas

The documentation on [decoration painters](../painters/decoration.md) explains the notion of a decoration area type. While a valid skin must define a color scheme bundle for `DecorationAreaType.NONE`, all other decoration area types are optional. Different skins have different sets of decoration areas that are painted. For example, the [Moderate skin](toneddown.md#moderate) decorates `DecorationAreaType.PRIMARY_TITLE_PANE`, `DecorationAreaType.SECONDARY_TITLE_PANE` and `DecorationAreaType.HEADER`, while the [Nebula Amethyst skin](toneddown.md#nebula-amethyst) also decorates `DecorationAreaType.TOOLBAR`:

<p>
<img alt="Moderate" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/moderate1.png" width="340" height="258">
<img alt="Nebula Amethyst" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/nebulaamethyst1.png" width="340" height="258">
</p>

In order to register a custom color scheme bundle and an optional background color scheme on the specific decoration area type(s), use the following APIs:

```java
  /**
   * Registers the specified color scheme bundle to be used on controls in
   * decoration areas.
   *
   * @param bundle
   *     The color scheme bundle to use on controls in decoration areas.
   * @param areaTypes
   *     Enumerates the area types that are affected by the parameters.
   */
  public void registerDecorationAreaSchemeBundle(
      RadianceColorSchemeBundle bundle, DecorationAreaType... areaTypes)

  /**
   * Registers the specified color scheme bundle and background color scheme
   * to be used on controls in decoration areas.
   *
   * @param bundle
   *     The color scheme bundle to use on controls in decoration areas.
   * @param backgroundColorScheme
   *     The color scheme to use for background of controls in decoration
   *     areas.
   * @param areaTypes
   *     Enumerates the area types that are affected by the parameters.
   */
  public void registerDecorationAreaSchemeBundle(
      RadianceColorSchemeBundle bundle,
      RadianceColorScheme backgroundColorScheme,
      DecorationAreaType... areaTypes)
```

Decoration areas registered with these APIs will have their background painted by the skin's [decoration painter](../painters/decoration.md) based on the default color scheme of the registered color scheme bundle. You can also use the following API to use a custom default color scheme on the specified decoration area types (in this case the controls in those decoration areas will use the default color scheme bundle):

```java
  /**
   * Registers the specified background color scheme to be used on controls in
   * decoration areas.
   *
   * @param backgroundColorScheme
   *     The color scheme to use for background of controls in decoration
   *     areas.
   * @param areaTypes
   *     Enumerates the area types that are affected by the parameters. Each
   *     decoration area type will be painted by {@link
   *     RadianceDecorationPainter#paintDecorationArea(Graphics2D,
   *     Component, DecorationAreaType, int, int, RadianceSkin)}.
   */
  public void registerAsDecorationArea(
      RadianceColorScheme backgroundColorScheme,
      DecorationAreaType... areaTypes)
```

Here is an example of specifying the default color scheme bundle for the [Business Blue Steel skin](toneddown.md#business-blue-steel):

```java
RadianceSkin.ColorSchemes businessSchemes = RadianceSkin
    .getColorSchemes("org/pushingpixels/radiance/theming/api/skin/business.colorschemes");

RadianceColorScheme activeScheme = businessSchemes.get("Business Blue Steel Active");
RadianceColorScheme enabledScheme = businessSchemes.get("Business Blue Steel Enabled");
RadianceColorScheme disabledScheme = businessSchemes.get("Business Blue Steel Disabled");

RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
    activeScheme, enabledScheme, disabledScheme);

RadianceColorScheme highlightColorScheme = businessSchemes
    .get("Business Blue Steel Highlight");
defaultSchemeBundle.registerColorScheme(activeScheme, 0.5f,
    ComponentState.DISABLED_SELECTED);
defaultSchemeBundle.registerHighlightColorScheme(highlightColorScheme);
this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);
```
and a custom color scheme bundle for the `header`-type decoration areas:

```java
RadianceColorScheme activeHeaderScheme = businessSchemes
    .get("Business Blue Steel Active Header");
RadianceColorScheme enabledHeaderScheme = businessSchemes
    .get("Business Blue Steel Enabled Header");
RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(
    activeHeaderScheme, enabledHeaderScheme, enabledHeaderScheme);
headerSchemeBundle.registerColorScheme(enabledHeaderScheme, 0.5f,
    ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
this.registerDecorationAreaSchemeBundle(headerSchemeBundle,
    DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
    DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR);
```

And here is an example of specifying a number of decoration area types to have their background painted by the decoration painter and the specific color scheme, without registering a custom color scheme bundle for those areas:

```java
    this.registerAsDecorationArea(defaultScheme,
        DecorationAreaType.PRIMARY_TITLE_PANE,
        DecorationAreaType.SECONDARY_TITLE_PANE,
        DecorationAreaType.HEADER, DecorationAreaType.FOOTER,
        DecorationAreaType.CONTROL_PANE);
```

### Overlays        
To add polishing touches to the specific decoration areas, use [overlay painters](../painters/overlay.md) with the following API:

```java
  /**
   * Adds the specified overlay painter to the end of the list of overlay
   * painters associated with the specified decoration area types.
   *
   * @param overlayPainter
   *            Overlay painter to add to the end of the list of overlay
   *            painters associated with the specified decoration area types.
   * @param areaTypes
   *            Decoration area types.
   */
  public void addOverlayPainter(RadianceOverlayPainter overlayPainter,
      DecorationAreaType... areaTypes)
```

Here is how the [Nebula skin](toneddown.md#nebula) is configured to paint drop shadows on the toolbars and separators on title panes and headers:

```java
// add an overlay painter to paint a drop shadow along the top
// edge of toolbars
this.addOverlayPainter(TopShadowOverlayPainter.getInstance(),
    DecorationAreaType.TOOLBAR);

// add an overlay painter to paint separator lines along the bottom
// edges of title panes and menu bars
this.bottomLineOverlayPainter = new BottomLineOverlayPainter(
    ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.DARK,
        ColorTransform.alpha(160)));
this.addOverlayPainter(this.bottomLineOverlayPainter,
    DecorationAreaType.PRIMARY_TITLE_PANE,
    DecorationAreaType.SECONDARY_TITLE_PANE,
    DecorationAreaType.HEADER);
```

and here is how it looks like:

<img alt="Nebula" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/nebula1.png" width="340" height="258">

### Derived skins

As with [color scheme bundles](colorschemebundles.md), it is possible to create a derived skin. The same warning applies - a skin is a delicate collection of different color scheme bundles, painters and additional settings carefully chosen to work together in providing visually appealing appearance and consistent animation sequences. In some cases, creating a derived skin will result in poor visuals.

You can use the following API to create a derived skin:

```java
  /**
   * Creates a new skin that has the same settings as this skin with the
   * addition of applying the specified color scheme transformation on all the
   * relevant color schemes
   *
   * @param transform
   *     Color scheme transformation.
   * @param name
   *     The name of the new skin.
   * @return The new skin.
   */
  @RadianceApi
  public RadianceSkin transform(ColorSchemeTransform transform,
      final String name)
```      
Where the color scheme transformation is defined by the following interface:

```java
/**
 * Defines transformation on a color scheme.
 *
 * @author Kirill Grouchnikov
 */
public interface ColorSchemeTransform {
  /**
   * Transforms the specified color scheme.
   *
   * @param scheme
   *            The original color scheme to transform.
   * @return The transformed color scheme.
   */
  public RadianceColorScheme transform(RadianceColorScheme scheme);
}
```

### Accented skins

Another, more fine grained mechanism for deriving a skin is using **accented skins**. This can be done by extending a skin that extends the `RadianceSkin.Accented` super class.

Such skins "declare" themselves to support one particular, narrowly scoped kind of derivation - providing up to five [color schemes](colorschemes.md) as accents. It is up to a skin that declares itself as accented to "decide" how to apply those accent colors.

For example, here are two `Creme` skins that extend the core `CremeAccentedSkin` class:

<p>
<img alt="Creme" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/creme1.png" width="340" height="258">
<img alt="Creme Coffee" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/cremecoffee1.png" width="340" height="258">
</p>

The first passes a light blue color scheme as the accent for active controls and cell highlights, while the second passes a light brown scheme as the accent for the same parts of the UI. This particular accented skin family uses these two accent types for selected tabs, checkboxes, radio buttons, default buttons, scroll bars and active cells in tables, trees, and lists.

As another example, here are two `Nebula` skins that extend the core `NebulaAccentedSkin` class:

<p>
<img alt="Nebula" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/nebula1.png" width="340" height="258">
<img alt="Nebula Brick Wall" src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/nebulabrickwall1.png" width="340" height="258">
</p>

The first passes a light silver scheme as the window chrome accent, while the second passes an orange scheme as the window chrome accent. This particular accented skin family uses the window chrome accent on the root pane border, the title pane and the menu bar - while maintaining the overall consistency of its visual "language", such as decoration painter, fill painter, color scheme for active controls in the main UI area, etc.

### Providing custom skins

Radiance provides an option for specifying custom skin. This option uses the Radiance plugin mechanism to register additional skins at runtime.

The top-level entry into a skin plugin is `RadianceThemingSkinPlugin` interface. This interface specifies the following method:

```java
  /**
   * Returns information on all available skins in <code>this</code> plugin.
   *
   * @return Information on all available skins in <code>this</code> plugin.
   */
  public Set<SkinInfo> getSkins();
```

The `SkinInfo` class contains information on single (base or custom) skin.

Note that using this option you may override the skins supplied with Radiance base package (by specifying the same display name).

### Sample code to work with Radiance skins

The following class implements a custom combobox that lists all available Radiance skins and allows changing the current Radiance skin based on the user selection.

```java
public class RadianceSkinComboSelector extends JComboBox {
  public RadianceSkinComboSelector() {
    // populate the combobox
    super(new ArrayList<>(RadianceThemingCortex.GlobalScope.getAllSkins().values()).toArray());
    // set the current skin as the selected item
    RadianceSkin currentSkin = RadianceThemingCortex.GlobalScope.getCurrentSkin();
    for (SkinInfo skinInfo : RadianceThemingCortex.GlobalScope.getAllSkins().values()) {
      if (skinInfo.getDisplayName().compareTo(
          currentSkin.getDisplayName()) == 0) {
        this.setSelectedItem(skinInfo);
        break;
      }
    }
    // set custom renderer to show the skin display name
    this.setRenderer(new RadianceDefaultComboBoxRenderer(this) {
      @Override
      public Component getListCellRendererComponent(JList list,
          Object value, int index, boolean isSelected,
          boolean cellHasFocus) {
        return super.getListCellRendererComponent(list,
            ((SkinInfo) value).getDisplayName(), index, isSelected,
            cellHasFocus);
      }
    });
    // add an action listener to change skin based on user selection
    this.addActionListener(
            actionEvent -> SwingUtilities.invokeLater(() -> RadianceThemingCortex.GlobalScope
                    .setSkin(((SkinInfo) RadianceSkinComboSelector.this.getSelectedItem())
                            .getClassName())));
  }
}
```

* First, it uses the `getAllSkins()` API to populate the combobox with the list of all available Radiance skins.
* Then, it uses the `getCurrentSkin()` API to select the combobox entry that matches the current Radiance skin.
* Since the model entries behind the combobox are `SkinInfo` objects, we extend the default Radiance combobox cell renderer to use the display name of the skin.
* Finally, we register an action listener on the combobox which gets triggerred on any selection change. The action listener uses the `setSkin(String className)` API to set the selected skin as the new global Radiance skin. Note that there is no need to explicitly invoke `SwingUtilities.updateComponentTree` on all your windows after calling this Radiance API.

The same approach can be used to create a menu selection of available Radiance skins.
