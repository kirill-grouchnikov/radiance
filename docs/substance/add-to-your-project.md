## Substance look and feel - use in your project

### Adding Substance

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-substance/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-substance) `radiance-substance` for build instructions of the latest stable release.

In addition, snapshot artifacts of tip-of-tree [are available](https://oss.sonatype.org/content/repositories/snapshots/org/pushing-pixels/) on Sonatype for Maven and Gradle builds.

You can also build Substance locally:

* Download the latest bits for Radiance from [Github](https://github.com/kirill-grouchnikov/radiance).
* Consult `version` string in the top-level `build.gradle` file. The rest of the instructions treat the current version as *X.Y.ZZ*.
* [Build Radiance locally](../building.md) with Gradle.
* Copy the binaries from `drop/X.Y.ZZ/core`. Specifically, add *radiance-substance-X.Y.ZZ.jar*, *radiance-animation-X.Y.ZZ.jar* and *radiance-common-X.Y.ZZ.jar* to the place that has your local dependencies.

For earlier versions of Substance, see [this page](../../archive/older-releases.md) for the list of binaries to take for the specific pre-Radiance versions.

### Using Substance

You have these options to use Substance in your application:

* Call `UIManager.setLookAndFeel()` with one of the skin-based look-and-feel classes ([light](skins/toneddown.md) or [dark](skins/dark.md)).
* Use the static `setSkin(SubstanceSkin)` or `setSkin(String)` APIs in `SubstanceCortex.GlobalScope` to set the specific skin.
* Extend the `SubstanceLookAndFeel` class and pass a `SubstanceSkin` instance to the super constructor. Then call `UIManager.setLookAndFeel()` API.
