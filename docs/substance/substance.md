## Substance look and feel

### Getting started

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/walkthrough/all.png" width="279" height="324" border=0 align="right">

If you are new to Swing, start with the general [Swing tutorial](http://java.sun.com/docs/books/tutorial/uiswing/). If you are new to look-and-feels, read the [getting started](getting-started.md) first.

To use Substance in your applications, use one of the following options:

* Call `UIManager.setLookAndFeel()` with one of the skin-based look-and-feel classes ([light](skins/toneddown.md) or [dark](skins/dark.md)).
* Use the static `setSkin(SubstanceSkin)` or `setSkin(String)` APIs in `SubstanceCortex.GlobalScope` to set the specific skin.
* Extend the `SubstanceLookAndFeel` class and pass a `SubstanceSkin` instance to the super constructor.

The main demo application that showcases various Substance features is in the [substance-demo](https://github.com/kirill-grouchnikov/radiance/tree/master/demos/substance-demo/src/main/java/org/pushingpixels/demo/substance/main) folder. In addition, [substance-samples](https://github.com/kirill-grouchnikov/radiance/tree/master/demos/substance-samples/src/main/java/org/pushingpixels/samples/substance) has a collection of self-contained samples that show more [advanced usage](../spyglass/cookbook/cookbook.md) of Substance APIs for custom application skinning.

Have a question? See the [FAQ](faq.md) and the list of [known issues](known-issues.md), and if you don't see an answer there, [file a bug](https://github.com/kirill-grouchnikov/radiance/issues) or [get in touch](http://www.pushing-pixels.org/about-kirill).

### Adding Substance to your application

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-substance/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-substance) `radiance-substance` for [Substance](docs/substance/substance.md)

In addition, snapshot artifacts of tip-of-tree [are available](https://oss.sonatype.org/content/repositories/snapshots/org/pushing-pixels/) on Sonatype for Maven and Gradle builds. Another option is to:
* Download the local copy of the latest Radiance.
* Build Radiance locally with *gradlew* command.
* Copy the binaries with *gradlew copyJars* command. For version *X.Y.ZZ* of Radiance, add *radiance-substance-X.Y.ZZ.jar*, *radiance-trident-X.Y.ZZ.jar* and *radiance-neon-X.Y.ZZ.jar* to the place that has your local dependencies.

For earlier versions of Substance, see [this page](../../drop/archive/older-releases.md) for the list of binaries to take for the specific pre-Radiance versions.

### Configure and customize

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/skins/nebulabrickwall1.png" width="340" height="254" border=0 align="left">

Substance provides a flexible [API surface](api.md) to customize and extend the visual appearance of your app. The overall visuals are controlled by [skins](skins/overview.md), with each skin defined by [color scheme bundles](skins/colorschemebundles.md) and [painters](painters/overview.md).

The [skinning primer](painters/custom-skinning.md) has a few tips on how to use the different Substance painters in applications that wish to paint custom components in a way that is consistent with other Substance visuals. The [substance-samples](https://github.com/kirill-grouchnikov/radiance/tree/master/demos/substance-samples) sub-project provides additional self-contained mini-applications that show more advanced usage of Substance APIs for pixel-perfect skinning, including complex [renderers](renderers.md).

### Plugins

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/ribbon.png" width="340" height="210" border=0 align="right">

While the core Swing components cover the base UI functionality that most applications require, modern UIs need modern UI components. To address this need, Substance comes with a built-in support to define and load plugins that provide consistent appearance and interaction patterns for third-party components.

During the initialization of your application in the `main()` method - **before creating your first window** - use these `SubstanceCortex.GlobalScope` APIs to register plugins:
* `registerComponentPlugin()` for registering component plugins
* `registerSkinPlugin()` for registering skin plugins

[Substance Extras pack](extras.md) provides additional watermarks, painters, color schemes, skins and tab widgets.
