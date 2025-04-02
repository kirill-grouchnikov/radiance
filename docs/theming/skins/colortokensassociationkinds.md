## Radiance look and feel - color tokens association kinds

Color tokens association kinds in Radiance are best illustrated by a simple example:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/color-tokens-association-kinds.png" width="386" height="304"/>

This is a screenshot of a sample application UI window with a variety of Swing controls - buttons, checkboxes, comboboxes, menu items, etc. Of a particular interest to us in this instance are controls in selected state:

* The green checkbox and radio button (with "Enabled selected" text)
* The light blue button in the bottom right corner (with "OK" text)

All three have their selected bit turned on, but the button is light blue while the other two controls tokens with different visual areas of Swing controls.

The `RadianceThemingSlices.ContainerColorTokensAssociationKind` is the base class for core and custom color tokens association kinds. Where is this class used?

* The skin definition, and more specifically the `ContainerColorTokensBundle` APIs that allow associating different color tokens with different visual areas of Swing controls.
* The specific UI delegates that query the current skin for the color tokens that match the relevant visual areas of the specific control that is painted by that UI delegate.

Let's go back to our application window above. How do we use the color tokens association kinds to specify different color tokens for controls (buttons vs checkboxes and radio buttons) in selected state?

As detailed in the [skin documentation](overview.md), each skin has a number of [color tokens bundles](colortokensbundles.md). This means that two controls with the same model state (`selected` in our case) can have different visuals, depending on the [decoration areas](../painters/decoration.md) they reside in. In the definition of the specific color tokens bundle, you can specify different [color tokens](colortokens.md) for different component states. This means that a selected checkbox can use colors different from those of a rollover selected checkbox.

In our case, we want to specify different color tokens for **selected** buttons vs **selected** checkboxes in the default decoration area. The relevant method in the `ContainerColorTokensBundle` is:

```java
/**
 * Registers the container color tokens to be used for controls in specified active states.
 * For example, if light orange color tokens are to be used for rollover selected and rollover
 * controls in highlights, the parameters would be:
 *
 * <ul>
 * <li><code>stateContainerTokens</code>=light orange color tokens</li>
 * <li><code>associationKind</code>={@link RadianceThemingSlices.ContainerColorTokensAssociationKind#HIGHLIGHT}</li>
 * <li><code>states</code>={@link ComponentState#ROLLOVER_SELECTED}, {@link ComponentState#ROLLOVER_UNSELECTED}</li>
 * </ul>
 *
 * @param colorTokens Container color tokens for the specified active component states.
 * @param associationKind Color tokens association kind that specifies the visual areas
 *                        of controls to be painted with this color tokens.
 * @param activeStates          Component states that further restrict the usage of the
 *                        specified color tokens.
 */
public void registerActiveContainerTokens(ContainerColorTokens colorTokens,
    RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
    ComponentState... activeStates)
```

* Buttons use the default `ContainerColorTokensAssociationKind.DEFAULT` kind
* Check marks of components such as checkboxes and radio buttons use `ContainerColorTokensAssociationKind.MARK`

Going back once again to the original image:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/color-tokens-association-kinds.png" width="386" height="304"/>

Here is the outline of the relevant configuration code:

```java
ContainerColorTokensBundle magellanDefaultBundle = new ContainerColorTokensBundle(
    activeContainerTokens, mutedContainerTokens, neutralContainerTokens);

magellanDefaultBundle.registerActiveContainerTokens(magellanGreenContainerTokens,
    RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
    ComponentState.SELECTED);
```

Note that there is no explicit usage of the `ContainerColorTokensAssociationKind.DEFAULT` value. This illustrates the **fallback** mechanism. In this particular case, the active container tokens passed to the `ContainerColorTokensBundle` constructor are used as the fallback color tokens for all active states (`ComponentState.SELECTED` included). The fallback mechanism also extends to the other color tokens association kinds.

Here is the constructor signature of the `ContainerColorTokensAssociationKind`:

```java
/**
 * Creates a new association kind.
 *
 * @param name     Association kind name.
 * @param fallback Fallback association kind. This is used when no color tokens
 *                 are associated with this kind. For example, {@link #TAB}
 *                 specifies that its fallback is {@link #DEFAULT}. When the
 *                 {@link JTabbedPane} UI delegate is painting the tabs, it will
 *                 try to use the color tokens associated with
 *                 {@link #TAB}. If none was registered, it will fall back
 *                 to use the color tokens associated with {@link #DEFAULT}.
 */
public ContainerColorTokensAssociationKind(String name,
    ContainerColorTokensAssociationKind fallback)
```

The second parameter specifies what should happen when the color tokens bundle definition does not have explicitly registered color tokens for the specific color tokens association kind under the specific component state.

The registered associations are used by the Radiance UI delegates during the component painting. Specifically for the checkbox, the UI delegate queries `ContainerColorTokensAssociationKind.MARK` and uses the relevant painters ([surface](../painters/surface.md) and [outline](../painters/outline.md)) to paint the matching visual areas.

Applications that want to provide [custom skinning](../painters/custom-skinning.md) of their UIs can use the following two supported APIs in order to get the relevant color tokens.

First, use the following API in `RadianceThemingCortex.ComponentScope` class to obtain the skin that should be used for painting your component:

```java
  /**
   * Returns the current skin for the specified component. If the current
   * look-and-feel is not Radiance, this method returns <code>null</code>.
   *
   * @param c
   *            Component. May be <code>null</code> - in this case the global
   *            current Radiance skin will be returned.
   * @return Current skin for the specified component.
   * @see GlobalScope#getCurrentSkin()
   */
  public static RadianceSkin getCurrentSkin(Component c)
```

Then, use the following API in the obtained `RadianceSkin` class to get the color tokens for the relevant visual area:

```java
/**
 * Returns the color tokens to be used for painting the specified visual
 * area of the component under the specified component state.
 *
 * @param comp            Component.
 * @param associationKind Color tokens association kind.
 * @param componentState  Component state.
 * @return Color tokens to be used for painting the specified visual area of
 * the component under the specified component state.
 */
public final ContainerColorTokens getActiveContainerTokens(Component comp,
    RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
    ComponentState componentState)
```			
This method will always return a non-`null` value, using the fallback mechanism discussed above to return the matching color tokens.
