## Radiance look and feel - color scheme bundles

A **color scheme bundle** is a set of information that allows painting controls in a specific decoration area. The `ContainerColorTokensBundle` contains all the APIs officially supported by Radiance color scheme bundles.

### Basics

The `ComponentState` is the base class for core and custom [component states](componentstates.md). A color scheme bundle is created with three major color tokens - for active, muted and neutral containers. If no state-specific color tokens are registered on the color scheme bundle, the major color tokens are used for all component states. A color scheme bundle is created with the following constructor:

```java
/**
 * Creates a new color scheme bundle.
 *
 * @param activeContainerTokens
 *            The active color tokens of this bundle.
 * @param mutedContainerTokens
 *            The muted color tokens of this bundle.
 * @param neutralContainerTokens
 *            The neutral color tokens of this bundle.
 * @param isSystemDark
 *            <code>true</code> if the system tokens should be created in dark mode.
 */
public ContainerColorTokensBundle(ContainerColorTokens activeContainerTokens,
    ContainerColorTokens mutedContainerTokens, ContainerColorTokens neutralContainerTokens,
    boolean isSystemDark)
```

Here is a screenshot of three buttons (active, enabled and disabled) under the core [Mariner skin](light-skins.md#mariner):

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/states/control-states.png" width="305" height="114" />

Here is the relevant code snippet from the definition of this skin:

```java
ContainerColorTokensBundle marinerDefaultBundle = new ContainerColorTokensBundle(
    /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
        /* seed */ Hct.fromInt(0xFFF6DD9D),
        /* containerConfiguration */ ContainerConfiguration.defaultLight()),
    /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
        /* seed */ Hct.fromInt(0xFFD9D8D5),
        /* containerConfiguration */ ContainerConfiguration.defaultLight()),
    /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
        /* seed */ Hct.fromInt(0xFFECF0F3),
        /* containerConfiguration */ ContainerConfiguration.defaultLight()),
    /* isSystemDark */ false);
```

### More states

The following API allows specifying custom color tokens for a specific component state:

```java
  /**
   * Registers container color tokens for the specific active component states.
   *
   * @param stateContainerTokens
   *     Container color tokens for the specified active component states.
   * @param states
   *     Component states.
   */
  public void registerActiveContainerTokens(ContainerColorTokens stateContainerTokens,
      ComponentState... states)
```      

For example, you can use this API if you want to visualy distinguish between buttons in rollover state and rollover selected state. Here is a screenshot of buttons in different states under the core [Office Silver 2007 skin](light-skins.md#office-silver-2007):

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/states/control-states-extended.png" width="275" height="279" />

Here is the relevant code snippet:

```java
officeSilverDefaultBundle.registerActiveContainerTokens(rolloverContainerTokens,
    ComponentState.ROLLOVER_UNSELECTED);
officeSilverDefaultBundle.registerActiveContainerTokens(rolloverSelectedContainerTokens,
    ComponentState.ROLLOVER_SELECTED);
officeSilverDefaultBundle.registerActiveContainerTokens(selectedContainerTokens,
    ComponentState.SELECTED);
officeSilverDefaultBundle.registerActiveContainerTokens(pressedContainerTokens,
    ComponentState.PRESSED_UNSELECTED);
officeSilverDefaultBundle.registerActiveContainerTokens(pressedSelectedContainerTokens,
    ComponentState.PRESSED_SELECTED);
```

Controls in disabled states are drawn using the following alpha tokens:

* `containerSurfaceDisabledAlpha`
* `containerOutlineDisabledAlpha`
* `onContainerDisabledAlpha`

### Highlights

The [highlight painters](../painters/highlight.md) are used to paint highlight areas on such components as lists, tables, table headers, trees and menus. Use the following API to specify custom highlight color tokens for specific component states:

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
 * @param stateContainerTokens Container color tokens for the specified active component states.
 * @param associationKind Color scheme association kind that specifies the visual areas
 *                        of controls to be painted with this color tokens.
 * @param activeStates    Component states that further restrict the usage of the
 *                        specified color tokens.
 */
public void registerActiveContainerTokens(ContainerColorTokens stateContainerTokens,
    RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
    ComponentState... activeStates)
```

Here is an example of using these APIs to set custom highlight color tokens in the [Mariner skin](light-skins.md#mariner):

```java
marinerDefaultBundle.registerActiveContainerTokens(
    marinerSelectedHighlightContainerTokens,
    RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
    ComponentState.SELECTED);
```        

This API can also be used for configuring custom color tokens for other association kinds, like the `MARK` in the [Magellan skin](dark-skins.md#magellan):

```java
magellanDefaultBundle.registerActiveContainerTokens(magellanGreenContainerTokens,
    RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
    ComponentState.SELECTED);
magellanDefaultBundle.registerActiveContainerTokens(magellanGreenRolloverContainerTokens,
    RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
    ComponentState.ROLLOVER_SELECTED,
    ComponentState.ROLLOVER_UNSELECTED,
    ComponentState.ARMED,
    ComponentState.ROLLOVER_ARMED);
magellanDefaultBundle.registerActiveContainerTokens(magellanPressedContainerTokens,
    RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
    ComponentState.PRESSED_UNSELECTED,
    ComponentState.PRESSED_SELECTED);
```
