## Ember - Kotlin extensions for Substance APIs

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-ember/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-ember) `radiance-ember` for build instructions of the latest stable release.

In your Java app, this is how you would mark a `BreadcrumbBarSelector` to use the `HEADER` [decoration area type](../substance/painters/decoration.md):

```java
BreadcrumbFileSelector bar = new BreadcrumbFileSelector();
SubstanceCortex.ComponentOrParentChainScope.setDecorationType(bar,
        SubstanceSlices.DecorationAreaType.HEADER);
```

And here is how the same code would look like in Kotlin using Ember-provided extension on the `JComponent` class:

```kotlin
val bar = BreadcrumbFileSelector()
bar.setDecorationType(SubstanceSlices.DecorationAreaType.HEADER)
```

### Ember scopes

Ember scopes mirror scopes defined in `SubstanceCortex`:

* `EmberWindowScope` - configuring and querying state at the level of the application `Window`s.
* `EmberRootPaneScope` - configuring and querying state at the level of the application `JRootPane`s.
* `EmberComponentScope` - configuring and querying state at the level of the application `Component`s.
* `EmberComponentOrParentScope` - configuring and querying state at the level of individual application `Component`s or all immediate child components of a container.
* `EmberComponentOrParentChainScope` - configuring and querying state at the level of individual application `Component`s or all nested child components of a container.

Note that these are Kotlin annotations marking the extension functions on the relevant Swing classes. There is no global scope annotation as none of the `SubstanceCortex.GlobalScope` APIs are exposed via Ember (yet).
