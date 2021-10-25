## Kotlin extensions for Radiance look-and-feel APIs

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-theming-ktx/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-theming-ktx) `radiance-theming-ktx` for build instructions of the latest stable release.

In your Java app, this is how you would mark a `BreadcrumbBarSelector` to use the `HEADER` [decoration area type](/painters/decoration.md):

```java
BreadcrumbFileSelector bar = new BreadcrumbFileSelector();
RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(bar,
        RadianceThemingSlices.DecorationAreaType.HEADER);
```

And here is how the same code would look like in Kotlin using a Radiance-provided extension on the `JComponent` class:

```kotlin
val bar = BreadcrumbFileSelector()
bar.setDecorationType(RadianceThemingSlices.DecorationAreaType.HEADER)
```

### Scopes

Kotlin scopes mirror scopes defined in `RadianceThemingCortex`:

* `RadianceWindowScope` - configuring and querying state at the level of the application `Window`s.
* `RadianceRootPaneScope` - configuring and querying state at the level of the application `JRootPane`s.
* `RadianceComponentScope` - configuring and querying state at the level of the application `Component`s.
* `RadianceComponentOrParentScope` - configuring and querying state at the level of individual application `Component`s or all immediate child components of a container.
* `RadianceComponentOrParentChainScope` - configuring and querying state at the level of individual application `Component`s or all nested child components of a container.

Note that these are Kotlin annotations marking the extension functions on the relevant Swing classes. There is no global scope annotation as none of the `RadianceThemingCortex.GlobalScope` APIs are exposed via Radiance (yet).
