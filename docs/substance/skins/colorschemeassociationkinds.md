## Substance look and feel - color scheme association kinds

Color scheme association kinds in Substance are best illustrated by a simple example:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/color-scheme-association-kinds.png" width="96" height="96"/>

This is a screenshot of a `JCheckBox` icon under 72 point font. This checkmark icon has three different visual areas: inner fill, border and the "V" mark. Each one of these areas is painted with a different [color scheme](colorschemes.md), and this is allowed by using the relevant **color scheme association kinds**.

The `org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind` is the base class for core and custom color scheme association kinds. Where is this class used?

* The first usage is in the skin definition. The main `SubstanceSkin` APIs allow associating different color schemes with different visual areas of Swing controls.
* The specific UI delegates query the component skin for the color schemes that match the relevant visual areas.

Let's go back to the `JCheckBox` icon example above. How do we use the color scheme association kinds to specify three different color schemes for painting this checkmark icon?

As detailed in the [skin documentation](overview.md), each skin has a number of [color scheme bundles](colorschemebundles.md). This means that two checkboxes with the same model state (`selected` in our case) can have different visuals, depending on the [decoration areas](../painters/decoration.md) they reside in. In the definition of the specific color scheme bundle, you can specify different [color schemes](colorschemes.md) for different component states. This means that a selected checkbox can use colors different from those of a rollover selected checkbox.

In our case, we want to specify different color schemes for different visual areas of **selected** checkboxes in the default decoration area. The relevant method in the `org.pushingpixels.substance.api.SubstanceColorSchemeBundle` is:

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

* The inner fill is specified by the `ColorSchemeAssociationKind.FILL`
* The border is specified by the `ColorSchemeAssociationKind.BORDER`
* The mark is specified by the `ColorSchemeAssociationKind.MARK`

Going back once again to the original image:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/substance/master/www/images/screenshots/color-scheme-association-kinds.png" width="96" height="96"/>

Here is the outline of the relevant configuration code:

```java
SubstanceColorScheme activeScheme = ...;
SubstanceColorScheme defaultScheme = ...;
SubstanceColorScheme disabledScheme = ...;

SubstanceColorSchemeBundle defaultBundle = new SubstanceColorSchemeBundle(
    activeScheme, defaultScheme, disabledScheme);

SubstanceColorScheme selectedBorderScheme = ...;
defaultBundle.registerColorScheme(selectedBorderScheme,
    ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED);

SubstanceColorScheme selectedMarkScheme = ...;
defaultBundle.registerColorScheme(selectedMarkScheme,
    ColorSchemeAssociationKind.MARK, ComponentState.SELECTED);
```

Note that there is no explicit usage of the `ColorSchemeAssociationKind.FILL` value. This illustrates the **fallback** mechanism. In this particular case, the second parameter to the `SubstanceColorSchemeBundle` constructor is used as the fallback color scheme for inner fills under all component states. The fallback mechanism also extends to the other color scheme association kinds.

Here is the constructor signature of the `ColorSchemeAssociationKind`:

```java
  /**
   * Creates a new association kind.
   *
   * @param name
   *            Association kind name.
   * @param fallback
   *            Fallback association kind. This is used when no color scheme
   *            is associated with this kind. For example, {@link #TAB_BORDER}
   *            specifies that its fallback is {@link #BORDER}. When the
   *            {@link JTabbedPane} UI delegate is painting the tabs, it will
   *            try to use the color scheme associated with
   *            {@link #TAB_BORDER}. If none was registered, it will fall back
   *            to use the color scheme associated with {@link #BORDER}, and
   *            if that is not registered as well, will use the color scheme
   *            associated with {@link #FILL}.
   */
  public ColorSchemeAssociationKind(String name,
      ColorSchemeAssociationKind fallback)
```

The second parameter specifies what should happen when the color scheme bundle definition does not have an explicitly registered color scheme for the specific color scheme association kind under the specific component state.

For example, the `ColorSchemeAssociationKind.MARK` has the `ColorSchemeAssociationKind.BORDER` as its fallback. This means that if you want to use the same color scheme for painting both borders and marks, you need to only call the `SubstanceColorSchemeBundle.registerColorScheme` API with the `ColorSchemeAssociationKind.BORDER` value.

The registered associations are used by the Substance UI delegates during the component painting. Specifically for the checkbox, the UI delegate queries the three relevant association kinds (`ColorSchemeAssociationKind.FIL`L, `ColorSchemeAssociationKind.BORDER` and `ColorSchemeAssociationKind.MARK`) and uses the relevant painters ([fill](../painters/fill.md) and [border](../painters/border.md)) to paint the matching visual areas.

Applications that want to provide [custom skinning](../painters/custom-skinning.md) of their UIs can use the following two supported APIs in order to get the relevant color schemes.

First, use the following API in `org.pushingpixels.substance.api.SubstanceCortex.ComponentScope` class to obtain the skin that should be used for painting your component:

```java
  /**
   * Returns the current skin for the specified component. If the current
   * look-and-feel is not Substance, this method returns <code>null</code>.
   *
   * @param c
   *            Component. May be <code>null</code> - in this case the global
   *            current Substance skin will be returned.
   * @return Current skin for the specified component.
   * @see #SKIN_PROPERTY
   * @see #getCurrentSkin()
   */
  @SubstanceApi
  public static SubstanceSkin getCurrentSkin(Component c)
```

Then, use the following API in the obtained `org.pushingpixels.substance.api.SubstanceSkin` class to get the color scheme for the relevant visual area:

```java
  /**
   * Returns the color scheme to be used for painting the specified visual
   * area of the component under the specified component state.
   *
   * @param comp
   *            Component.
   * @param associationKind
   *            Color scheme association kind.
   * @param componentState
   *            Component state.
   * @return Color scheme to be used for painting the specified visual area of
   *         the component under the specified component state.
   */
  public SubstanceColorScheme getColorScheme(Component comp,
      ColorSchemeAssociationKind associationKind,
      ComponentState componentState)
```			
Note that the second method should always return a non-`null` value, using the fallback mechanism discussed above to return the matching color scheme.
