# Radiance libraries

**Radiance** is a collection of libraries for writing modern, elegant and fast Swing applications based on
the [Ephemeral](https://github.com/kirill-grouchnikov/ephemeral) design system. It is built with Java 11, and runs on Java 9 and later.

<p align="center">
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/nebula1.png" width="340" height="258" border=0>
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/gemini2.png" width="340" height="258" border=0>
</p>

<p align="center">
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/graphitechalk1.png" width="340" height="258" border=0>
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/theming/skins/nightshade2.png" width="340" height="258" border=0>
</p>

## General questions

[This document](docs/faq.md) is where you may find answers to some of the general questions on Radiance. If there's anything missing there, [let me know](https://github.com/kirill-grouchnikov/radiance/issues).

## Core Java libraries

### Common

[Common](docs/common/common.md) provides APIs to work with images and text that scale with the display resolution. Radiance icons scale to maintain crisp, pixel-perfect visuals for application icons. Font APIs can be used to render platform-consistent textual content across a variety of supported platforms.

### Animation

[Animation](docs/animation/animation.md) provides powerful and flexible animation APIs that scale from simple, single-property cases to complex scenarios that involve multiple animations. It powers all animations in the Radiance libraries.

### Theming

[Theming](docs/theming/overview.md) provides a comprehensive set of APIs for skinning Swing applications, addressing the most demanding, modern design requirements. It comes with built-in support for all core Swing components, and a flexible API surface for rendering third-party / application components.

### Components

[Components](docs/component/overview.md) provides a robust set of additional Swing components that can be used as building blocks for creating modern, rich Swing applications. In addition to providing the powerful command button and breadcrumb bar components, it packs an Office Command Bar (ribbon) container that hosts complex hierarchies of content on a flexible and adaptive surface.

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/ribbon/taskbar/taskbar-overflow-popup.png" width="1428" border=0/>

## Core Kotlin libraries

* [Core Swing extensions](docs/kotlin-ext/swing/swing.md) is a set of Kotlin extensions that expose selected core Swing APIs for idiomatic Kotlin usage.

* [Animation extensions](docs/kotlin-ext/animation/animation-ktx.md) exposes a subset of the API surface of Animation as a concise, focused and approachable Kotlin domain-specific language (DSL). It also provides a number of Kotlin extensions for Animation APIs.

* [Theming extensions](docs/kotlin-ext/theming/theming-ktx.md) is a set of Kotlin extensions that provide a more elegant way of working with scoped Radiance theming APIs.

* [Component extensions](docs/kotlin-ext/component/component-ktx.md) exposes a subset of the API surface of Components as a concise, focused and approachable Kotlin domain-specific language (DSL). It also provides a number of Kotlin extensions for Components APIs.

## Tools

* [Laf Benchmark](docs/tools/laf-benchmark/laf-benchmark.md) provides tools for Swing look-and-feel developers to measure the performance of their libraries.

* [Theming Debugger](docs/tools/theming-debugger/theming-debugger.md) is a visual runtime debugger for Radiance look-and-feel.

* [Screenshot](docs/tools/screenshot/screenshot.md) has utilities for taking screenshots for Radiance documentation.

* [Shaper Editor](docs/tools/shape-editor/shape-editor.md) can be used creating and editing files that define custom button shapers.

* [SVG Transcoder](docs/tools/svg-transcoder/svg-transcoder.md) enables usage of vector-based icons in Swing applications. SVG content is transcoded offline to Java / Kotlin classes that use pure Java2D canvas operations that do not require expensive runtime overhead of third-party dependencies.

* [SVG Transcoder Plugin](docs/tools/svg-transcoder/svg-transcoder-gradle-plugin.md) is a Gradle plugin that wraps the SVG Transcoder library to allow build-time transcoding of SVG content into Java / Kotlin classes.


## Demos

[This document](docs/demos.md) lists all major demos and samples that showcase how to use various Radiance APIs.

## Radiance artifacts

Radiance artifacts are available in the Maven Central repository under `groupId=org.pushing-pixels`

### Core artifacts

* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-common/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-common/8.0.0)
`radiance-common` for [Common](docs/common/common.md)
* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-animation/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-animation/8.0.0) `radiance-animation` for [Animation](docs/animation/animation.md)
* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-theming/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-theming/8.0.0) `radiance-theming` for [Theming](docs/theming/overview.md)
* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-component/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-component/8.0.0) `radiance-component` for [Component](docs/component/overview.md)
* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-theming-extras/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-theming-extras/8.0.0) `radiance-theming-extras` for [Theming extras](docs/theming/extras.md)

### Kotlin extension artifacts
* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-swing-ktx/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-swing-ktx/8.0.0) `radiance-swing-ktx` for [Swing Kotlin extensions](docs/kotlin-ext/swing/swing.md)
* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-animation-ktx/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-animation-ktx/8.0.0) `radiance-animation-ktx` for [Animation Kotlin extensions](docs/kotlin-ext/animation/animation-ktx.md)
* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-theming-ktx/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-theming-ktx/8.0.0) `radiance-theming-ktx` for [Theming Kotlin extensions](docs/kotlin-ext/theming/theming-ktx.md)
* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-component-ktx/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-component-ktx/8.0.0) `radiance-component-ktx` for [Component Kotlin extensions](docs/kotlin-ext/component/component-ktx.md)

### Tools artifacts

* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-svg-transcoder/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-svg-transcoder/8.0.0) `radiance-svg-transcoder` for [SVG transcoder](docs/tools/svg-transcoder/svg-transcoder.md)
* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-svg-transcoder-gradle-plugin/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-svg-transcoder-gradle-plugin/8.0.0) `radiance-svg-transcoder-gradle-plugin` for [SVG transcoder Gradle plugin](docs/tools/svg-transcoder/svg-transcoder-gradle-plugin.md)
* [![Sonatype Central](https://maven-badges.sml.io/sonatype-central/org.pushing-pixels/radiance-theming-debugger/badge.svg?style=plastic&version=8.0.0)](https://central.sonatype.com/artifact/org.pushing-pixels/radiance-theming-debugger/8.0.0) `radiance-theming-debugger` for [Theming debugger](docs/tools/theming-debugger/theming-debugger.md)

### Snapshots

Radiance snapshot artifacts [are available in the Maven Central snapshot repository](https://central.sonatype.com/service/rest/repository/browse/maven-snapshots/org/pushing-pixels/) using the `https://central.sonatype.com/repository/maven-snapshots/` URL.

## Building Radiance

[This document](docs/building.md) is an overview of how to build Radiance artifacts locally.

<p align="center">
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/icon/radiance_product_512.png" width="256" height="256" border=0>
</p>
