## Substance look and feel - animations

### Basics

To bring richer user experience to Swing applications, Substance look and feel uses the [Trident animation library](../trident/trident.md). This library provides support for animating core and custom Swing components.

While the default animation settings (which transitions to animate, the animation speed, the set of components to animate) were selected to provide a consistent and pleasant out-of-the-box visual experience, some applications might require tweaking the animation settings.

### Using the animation APIs

The animation APIs on the global and component scope in `org.pushingpixels.substance.api.SubstanceCortex` allow programmatic control over core and custom animations. You can use the various `allowAnimations` and `disallowAnimations` on all components, on all components of the specified class or on a specific component. For example, here is how you can remove rollover and selection animations from the specific list:

```java
	JList list = ...; // create the list
	SubstanceCortex.ComponentScope.disallowFades(AnimationFacet.ROLLOVER, list);
	SubstanceCortex.ComponentScope.disallowFades(AnimationFacet.SELECTION, list);
```

where `org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet` provides access to core and custom animation facets.
