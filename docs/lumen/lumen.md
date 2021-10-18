## Lumen - animation blueprints for Swing

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/lumen/lumen-main.png" width="594" height="284" border=0>

Lumen aims to provide blueprints for adding animation to Swing applications using the [Animation](../animation/animation.md) engine. Lumen is a Swing application that connects to [MusicBrainz](https://musicbrainz.org/doc/Development/XML_Web_Service/Version_2) and Amazon, and shows a list of albums for a specific performer. It is a pure Swing / Java2D application with the following dependencies:

* [Animation](../animation/animation.md) for animations
* [Common](../common/common.md) for consistent text appearance and correct high-DPI rendering
* [Retrofit](https://github.com/square/retrofit) for fetching information from MusicBrainz without manual handling of endpoints and JSON parsing

[Lucent](https://github.com/kirill-grouchnikov/radiance/tree/sunshine/demos/lucent) is a port of Lumen to Kotlin.

### Deeper dives

* [Part 1](part1-simple.md) - window structure and simple animations such as component appearance (fade in), rollovers and window disposal (fade-out) using built in and custom class attributes and setters.
* [Part 2](part2-visuals.md) - visuals of the main window.
* [Part 3](part3-progress.md) - animated load progress indication while the application is loading data.
* [Part 4](part4-albumart.md) - loading the album art matching the specific search string and asynchronously displaying the associated images.
* [Part 5](part5-layout.md) - scrolling the album covers showed in the container and adding animations to the scrolling.
* [Part 6](part6-scenario.md) - complex transition scenarios.
