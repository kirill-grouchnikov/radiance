## Radiance look and feel - animations

### Basics

To bring richer user experience to Swing applications, Radiance look and feel uses the [Radiance animation library](../animation/animation.md). This library provides support for animating core and custom Swing components.

While the default animation settings (which transitions to animate, the animation speed, the set of components to animate) were selected to provide a consistent and pleasant out-of-the-box visual experience, some applications might require tweaking the animation settings.

### Using the animation APIs

The animation APIs on the global and component scope in `RadianceThemingCortex` allow programmatic control over core and custom animations. You can use the various `allowAnimations` and `disallowAnimations` on all components, on all components of the specified class or on a specific component (see note below). For example, here is how you can remove rollover and selection animations from the specific list:

```java
	JList list = ...; // create the list
	RadianceThemingCortex.ComponentScope.disallowFades(AnimationFacet.ROLLOVER, list);
	RadianceThemingCortex.ComponentScope.disallowFades(AnimationFacet.SELECTION, list);
```

where `RadianceThemingSlices.AnimationFacet` provides access to core and custom animation facets.

**Note:**

These APIs provide fine-grained controls over two specific classes of animations:

* Renderer-based controls such as tables, trees and lists
* Custom animations that Radiance adds such as focus loop, icon glow etc

It would add too much runtime overhead to support such fine-grained control to every base facet (rollover, selection, press) of every single view. This is the primary reasons why these APIs do not allow to turn off rollover animation, for instance, for a specific button.
