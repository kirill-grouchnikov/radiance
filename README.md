# Radiance libraries

Radiance is a collection of libraries for writing modern, elegant and fast Swing applications.

<p align="center">
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/skins/nebulabrickwall1.png" width="340" height="254" border=0>
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/skins/dustcoffee2.png" width="340" height="254" border=0>
</p>

## Core Java libraries

### Neon

[Neon](docs/neon/neon.md) provides a core set of APIs to work with images and text that scale with the display resolution. Neon icons scale to maintain crisp, pixel-perfect visuals for application icons. Font APIs can be used to render platform-consistent textual content across a variety of supported platforms.

### Photon

[Photon](docs/photon/photon.md) enables usage of vector-based icons in Swing applications. SVG content can be either loaded asynchronously at runtime from a variety of local and remote sources, or transcoded offline to Java / Kotlin classes that use pure Java2D canvas operations that do not require expensive runtime overhead of third-party dependencies.

### Trident

[Trident](docs/trident/trident.md) provides powerful and flexible animation APIs that scale from simple, single-property cases to complex scenarios that involve multiple animations. Trident powers all animations in the Radiance libraries.

### Substance

[Substance](docs/substance/substance.md) provides a powerful and flexible set of APIs that can be used to skin Swing applications to address the most demanding, modern design requirements. It comes with built-in support for all core Swing components, and a comprehensive API set for consistent rendering of third-party / application components.

### Flamingo

[Flamingo](docs/flamingo/flamingo.md) provides a robust set of additional Swing components that can be used as building blocks for creating modern, rich Swing applications. In addition to providing powerful command button and breadcrumb bar components, Flamingo packs an Office Command Bar (ribbon) container that can host a complex hierarchy of flexible, scalable application control surface.

## Core Kotlin libraries

### Meteor

[Meteor](docs/kotlin-ext/meteor/meteor.md) is a set of Kotlin extensions that expose selected core Swing APIs for idiomatic Kotlin usage.

### Ember

[Ember](docs/kotlin-ext/ember/ember.md) is a set of Kotlin extensions that provide a more elegant way of working with scoped Substance APIs.

### Plasma

[Plasma](docs/kotlin-ext/plasma/plasma.md) exposes the entire API surface of Flamingo as a concise, focused and approachable Kotlin domain-specific language (DSL). It also provides a number of Kotlin extensions for Flamingo APIs.

### Torch

[Torch](docs/kotlin-ext/torch/torch.md) exposes a subset of the API surface of Trident as a concise, focused and approachable Kotlin domain-specific language (DSL). It also provides a number of Kotlin extensions for Trident APIs.

## Tools

* [Apollo](docs/tools/apollo/apollo.md) is a tool for creating and editing color scheme lists.

* [Beacon](docs/tools/beacon/beacon.md) is a visual runtime debugger for Substance.

* [Electra](docs/tools/electra/electra.md) simplifies the process of adding callout bubbles to documentation screenshots.

* [Hyperion](docs/tools/hyperion/hyperion.md) can be used creating and editing files that define custom button shapers.

* [Ignite](docs/tools/ignite/ignite.md) is a Gradle plugin that wraps the Photon library to allow build-time transcoding of SVG content into Java / Kotlin classes.

* [Lightbeam](docs/tools/lightbeam/lightbeam.md) provides tools for Swing look-and-feel developers to measure the performance of their libraries.

* [Zodiac](docs/tools/zodiac/zodiac.md) has utilities for taking screenshots for Substance and Flamingo documentation.

## Demos

[This document](docs/demos.md) lists all major demos and samples that showcase how to use various Radiance APIs.

## Radiance artifacts

Radiance artifacts are available in the central Maven repository under `groupId=org.pushing-pixels`

### Core artifacts

* [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-neon/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-neon)
`radiance-neon` for [Neon](docs/neon/neon.md)
* [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-photon/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-photon) `radiance-photon` for [Photon](docs/photon/photon.md)
* [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-trident/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-trident) `radiance-trident` for [Trident](docs/trident/trident.md)
* [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-substance/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-substance) `radiance-substance` for [Substance](docs/substance/substance.md)
* [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-flamingo/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-flamingo) `radiance-flamingo` for [Flamingo](docs/flamingo/flamingo.md)
* [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-substance-extras/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-substance-extras) `radiance-substance-extras` for [Substance extras](docs/substance/extras.md)

### Kotlin extension artifacts
* [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-ember/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-ember) `radiance-ember` for [Ember](docs/kotlin-ext/ember/ember.md)
* [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-meteor/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-meteor) `radiance-meteor` for [Meteor](docs/kotlin-ext/meteor/meteor.md)
* [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-plasma/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-plasma) `radiance-plasma` for [Plasma](docs/kotlin-ext/plasma/plasma.md)

### Tools artifacts

* [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-ignite/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-ignite) `radiance-ignite` for [Ignite](docs/tools/ignite/ignite.md)
* [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-beacon/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-beacon) `radiance-beacon` for [Beacon](docs/tools/beacon/beacon.md)

## Building Radiance

[This document](docs/building.md) is an overview of how to build Radiance artifacts locally.

<p align="center">
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/icon/radiance_product_512.png" width="256" height="256" border=0>
</p>
