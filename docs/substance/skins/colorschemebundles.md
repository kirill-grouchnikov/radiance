## Substance look and feel - color scheme bundles

A **color scheme bundle** is a set of information that allows painting controls in a specific decoration area. The `SubstanceColorSchemeBundle` contains all the APIs officially supported by Substance color scheme bundles.

### Basics

The `ComponentState` is the base class for core and custom [component states](componentstates.md). A color scheme bundle is created with three major color schemes - for active, enabled and disabled controls. If no state-specific color schemes are registered on the color scheme bundle, the major color schemes are used for all component states. A color scheme bundle is created with the following constructor:

```java
  /**
   * Creates a new color scheme bundle.
   *
   * @param activeColorScheme
   *            The active color scheme of this bundle.
   * @param enabledColorScheme
   *            The enabled color scheme of this bundle.
   * @param disabledColorScheme
   *            The disabled color scheme of this bundle.
   */
  public SubstanceColorSchemeBundle(SubstanceColorScheme activeColorScheme,
      SubstanceColorScheme enabledColorScheme,
      SubstanceColorScheme disabledColorScheme)
```

Here is a screenshot of three buttons (active, default and disabled) under the core [Business Black Steel skin](toneddown.md#business-black-steel):

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/substance/states/control-states.png" width="293" height="101" />

Here is the relevant code snippet from the definition of this skin:

```java
SubstanceSkin.ColorSchemes businessSchemes = SubstanceSkin
    .getColorSchemes("org/pushingpixels/substance/api/skin/business.colorschemes");

SubstanceColorScheme activeScheme = businessSchemes.get("Business Black Steel Active");
SubstanceColorScheme enabledScheme = businessSchemes.get("Business Black Steel Enabled");
SubstanceColorScheme disabledScheme = businessSchemes.get("Business Black Steel Disabled");

// the default color scheme bundle
SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
    activeScheme, enabledScheme, disabledScheme);
```

### More states

The following API allows specifying a custom color scheme for a specific component state:

```java
  /**
   * Registers a color scheme for the specific component state.
   *
   * @param stateColorScheme
   *     Color scheme for the specified component state.
   * @param states
   *     Component states.
   */
  public void registerColorScheme(SubstanceColorScheme stateColorScheme,
      ComponentState... states)
```      

For example, you can use this API if you want to visualy distinguish between buttons in rollover state and rollover selected state. Here is a screenshot of buttons in different states under the core [Office Silver 2007 skin](toneddown.md#office-silver-2007):

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/substance/states/control-states-extended.png" width="275" height="279" />

Here is the relevant code snippet:

```java
    defaultSchemeBundle.registerColorScheme(rolloverScheme,
        ComponentState.ROLLOVER_UNSELECTED);
    defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme,
        ComponentState.ROLLOVER_SELECTED);
    defaultSchemeBundle.registerColorScheme(selectedScheme,
        ComponentState.SELECTED);
    defaultSchemeBundle.registerColorScheme(pressedScheme,
        ComponentState.PRESSED_UNSELECTED);
    defaultSchemeBundle.registerColorScheme(pressedSelectedScheme,
        ComponentState.PRESSED_SELECTED);
```

It is possible to specify a custom alpha value for controls in some states. This can be useful if you want to use the same color scheme for both default and disabled states, and have disabled controls painted with a custom alpha translucency (making them blend with the background). Use the following API:

```java
/**
 * Registers an alpha channel value for the specific component states.
 *
 * @param alpha  Alpha channel value.
 * @param states Component states.
 */
public void registerAlpha(float alpha, ComponentState... states)
```      
Here is sample code from the [Autumn skin](toneddown.md#autumn) that uses the same color scheme for default and disabled states, setting alpha channel to 60% for the disabled states:

```java
SubstanceSkin.ColorSchemes schemes = SubstanceSkin
    .getColorSchemes("org/pushingpixels/substance/api/skin/autumn.colorschemes");

SubstanceColorScheme activeScheme = schemes.get("Autumn Active");
SubstanceColorScheme enabledScheme = schemes.get("Autumn Enabled");
SubstanceColorScheme disabledScheme = enabledScheme;

SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
    activeScheme, enabledScheme, disabledScheme);
defaultSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
defaultSchemeBundle.registerColorScheme(activeScheme, ComponentState.DISABLED_SELECTED);
```

### Highlights

The [highlight painters](../painters/highlight.md) are used to paint highlight areas on such components as lists, tables, table headers, trees and menus. Use the following APIs to specify custom highlight color schemes for specific component states, along with custom alpha values:

```java
  /**
   * Registers a highlight color scheme for the specific component state if
   * the component state is not <code>null</code>, or a global highlight color
   * scheme otherwise.
   *
   * @param stateHighlightScheme
   *     Highlight color scheme for the specified component state.
   * @param states
   *     Component states. If <code>null</code>, the specified color scheme
   *     will be applied for all states left unspecified.
   */
  public void registerHighlightColorScheme(
      SubstanceColorScheme stateHighlightScheme, ComponentState... states)

  /**
   * Registers a highlight alpha channel value for the specific component states.
   *
   * @param alpha  Highlight alpha channel value.
   * @param states Component states.
   */
  public void registerHighlightAlpha(float alpha, ComponentState... states)
```

Here is an example of using these APIs to set state-specific alpha values for highlights in the [Business Black Steel skin](toneddown.md#business-black-steel):

```java
SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
    activeScheme, enabledScheme, disabledScheme);
defaultSchemeBundle.registerHighlightAlpha(0.6f, ComponentState.ROLLOVER_UNSELECTED);
defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED);
defaultSchemeBundle.registerHighlightAlpha(0.95f, ComponentState.ROLLOVER_SELECTED);
defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
defaultSchemeBundle.registerHighlightColorScheme(activeScheme, ComponentState.ROLLOVER_UNSELECTED,
    ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
    ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
```        

### Finer grained control

As described in the [color scheme association kind documentation](colorschemeassociationkinds.md), Swing controls have different visual areas. Even such a simple example as `JCheckBox` icon has three different visual areas: inner fill, border and the "V" mark:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/substance/color-scheme-association-kinds.png" width="96" height="96"/>

Use the following API to specify custom color schemes to be used for specific visual areas under specific component states:

```java
  /**
   * Registers the color scheme to be used for the specified visual area of
   * controls under the specified states. For example, if the light orange
   * scheme has to be used for gradient fill of rollover selected and rollover
   * controls, the parameters would be:
   *
   * <ul>
   * <li><code>scheme</code>=light orange scheme</li>
   * <li>
   * <code>associationKind</code>={@link ColorSchemeAssociationKind#FILL}</li>
   * <li>
   * <code>states</code>={@link ComponentState#ROLLOVER_SELECTED}, {@link ComponentState#ROLLOVER_UNSELECTED}
   * </li>
   * </ul>
   *
   * @param scheme
   *            Color scheme.
   * @param associationKind
   *            Color scheme association kind that specifies the visual areas
   *            of controls to be painted with this color scheme.
   * @param states
   *            Component states that further restrict the usage of the
   *            specified color scheme.
   */
  public void registerColorScheme(SubstanceColorScheme scheme,
      ColorSchemeAssociationKind associationKind,
      ComponentState... states)
```

Here is an example of using this API in the [Office Silver 2007 skin](toneddown.md#office-silver-2007) skin to specify a custom color scheme to be used on borders of controls in the `ComponentState.SELECTED` state:

```java
    defaultSchemeBundle.registerColorScheme(borderSelectedScheme,
        ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED);
```

### Derived bundles

As with color schemes, it is possible to create a derived color scheme bundle. The same warning applies - a color scheme bundle is a delicate collection of different color schemes and alpha values carefully chosen to work together in providing visually appealing appearance and consistent animation sequences. In some cases, creating a derived color scheme bundle will result in poor visuals.

You can use the following API to create a derived color scheme bundle:

```java
  /**
   * Creates a new color scheme bundle that has the same settings as this
   * color scheme bundle with the addition of applying the specified color
   * scheme transformation on all the relevant color schemes
   *
   * @param transform
   *     Color scheme transformation.
   * @return The new color scheme bundle.
   */
  public SubstanceColorSchemeBundle transform(ColorSchemeTransform transform)
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
  public SubstanceColorScheme transform(SubstanceColorScheme scheme);
}
```     
