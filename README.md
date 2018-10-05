# Radiance libraries

Radiance is a collection of libraries for writing modern, elegant and well-performing Swing applications.

<p align="center">
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/skins/nebulabrickwall1.png" width="340" height="254" border=0>
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/substance/skins/dustcoffee2.png" width="340" height="254" border=0>
</p>

## Core libraries

### Neon

The [Neon library](docs/neon/neon.md) provides a core set of APIs to work with images and text that scale with the display resolution. Neon icons scale to maintain crisp, pixel-perfect visuals for application icons. Font APIs can be used to render platform-consistent textual content across a variety of supported platforms.

### Photon

The [Photon library](docs/photon/photon.md) enables usage of vector-based icons in Swing applications. SVG content can be either loaded asynchronously at runtime from a variety of local and remote sources, or transcoded offline to Java / Kotlin classes that use pure Java2D canvas operations that do not require expensive runtime overhead of third-party dependencies.

### Trident

The [Trident library](docs/trident/trident.md) provides powerful and flexible animation APIs that scale from simple, single-property cases to complex scenarios that involve multiple animations. Trident powers all animations in the Radiance libraries.

### Substance

The [Substance library](docs/substance/substance.md) provides a powerful and flexible set of APIs that can be used to skin Swing applications to address the most demanding, modern design requirements. It comes with built-in support for all core Swing components, and a comprehensive API set for consistent rendering of third-party / application components.

### Flamingo

The [Flamingo library](docs/flamingo/flamingo.md) provides a robust set of additional Swing components that can be used as building blocks for creating modern, rich Swing applications. In addition to providing powerful command button and breadcrumb bar components, Flamingo packs an Office Command Bar (ribbon) container that can host a complex hierarchy of flexible, scalable application control surface.

### Kormorant

The Kormorant library exposes the entire API surface of Flamingo as a custom, targeted and approachable Kotlin DSL (domain-specific language).

## Tools

### Beacon

The [Beacon plugin](docs/beacon/beacon.md) is a visual runtime debugger for Substance.

### Electra

The [Electra tool](docs/electra/electra.md) allows adding callout bubbles to documentation screenshots.

### Hyperion

The [Hyperion editor](docs/hyperion/hyperion.md) allows creating and editing files that define custom button shapers.

### Ignite

The [Ignite plugin](docs/ignite/ignite.md) wraps the Photon library to allow build-time transcoding of SVG content into Java / Kotlin classes.

### Jitterbug

The [Jitterbug editor](docs/jitterbug/jitterbug.md) allows creating and editing color scheme lists.

### Lightbeam

The [Lightbeam library](docs/lightbeam/lightbeam.md) provides tools for Swing look-and-feel developers to measure the performance of their libraries.

### Zodiac

The [Zodiac library](docs/zodiac/zodiac.md) provides utilities for taking screenshots for Substance and Flamingo documentation.

## Building Radiance

[This document](docs/building.md) is an overview of how to build Radiance artifacts locally. [This document](docs/dependencies.md) is an overview of dependency specification for apps that wish to use Radiance in their build scripts.

<p align="center">
<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/icon/radiance_product_512.png" width="256" height="256" border=0>
</p>
