## Radiance look and feel - use in your project

### Adding Radiance

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-theming/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-theming) `radiance-theming` for build instructions of the latest stable release.

In addition, snapshot artifacts of tip-of-tree [are available](https://oss.sonatype.org/content/repositories/snapshots/org/pushing-pixels/) on Sonatype for Maven and Gradle builds.

You can also build Radiance locally:

* Download the latest bits for Radiance from [Github](https://github.com/kirill-grouchnikov/radiance).
* Consult `version` string in the top-level `build.gradle` file. The rest of the instructions treat the current version as *X.Y.ZZ*.
* [Build Radiance locally](../building.md) with Gradle.
* Copy the binaries from `drop/X.Y.ZZ/core`. Specifically, add *radiance-theming-X.Y.ZZ.jar*, *radiance-animation-X.Y.ZZ.jar* and *radiance-common-X.Y.ZZ.jar* to the place that has your local dependencies.

For earlier versions of Radiance, see [this page](../../archive/older-releases.md) for the list of binaries to take for the specific pre-Radiance versions.

### Using Radiance

You have these options to use Radiance in your application:

* Call `UIManager.setLookAndFeel()` with one of the skin-based look-and-feel classes ([light](skins/toneddown.md) or [dark](skins/dark.md)).
* Use the static `setSkin(RadianceSkin)` or `setSkin(String)` APIs in `RadianceThemingCortex.GlobalScope` to set the specific skin.
* Extend the `RadianceLookAndFeel` class and pass a `RadianceSkin` instance to the super constructor. Then call `UIManager.setLookAndFeel()` API.
