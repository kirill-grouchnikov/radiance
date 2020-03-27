## Photon - SVG icons for Swing applications

### Overview

The goal of this project is to enable usage of vector-based icons in Swing applications.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-photon/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-photon) `radiance-photon` for build instructions of the latest stable release.

There are two ways to use Photon for working with vector icons. In both cases the original format is SVG, and in both cases you need the [matching version](#dependency-versions-for-photon) of [Apache Batik](https://xmlgraphics.apache.org/batik/) and its dependencies.

### Offline transcoding of SVG content

This is the recommended way of using Photon. SVG has a wide feature surface which, depending on the complexity of your SVG sources, can lead to significant initial parsing and rendering time of the icon content.

Photon transcoder allows you to convert an SVG source into a corresponding Java / Kotlin class that contains a sequence of matching Java2D canvas draw calls to render the original content. Photon ships with two sets of built-in template files (one for Java and one for Kotlin) that create slightly different wrappers around the Java2D draw calls:

* `SvgTranscoderTemplatePlain.templ` - generates a class with a static method to paint the icon content onto the passed `Graphics2D` object. The generated class also has methods to query the bounding box of the original SVG content.
* `SvgTranscoderTemplateResizable.templ` - generates a class that implements [Neon](../neon/neon.md)'s `ResizableIcon` interface. An instance of the generated class can be passed to any relevant Substance or Flamingo API, including the matching command button and ribbon calls. At runtime, the content will be automatically reconfigured based on the new display size of the icon.

A couple of usages of transcoded resizable icons in Radiance itself are:

* Flamingo ribbon resize that may involve a number of command buttons going between smaller and larger icon sizes. It is recommended to use the generated static `of(int, int)` method to obtain an instance of a generated class for the specific initial size.
* Icons in Substance icon packs configured with the `SubstanceCortex.GlobalScope.setIconPack` API.

#### Batch transcoding all SVG files in a single folder

The `SvgBatchConverter` class is the entry point into the offline batch converter pipeline for a single folder. It has the following parameters:

* [Mandatory] `sourceFolder=` The location of the folder that contains source SVG images
* [Mandatory] `outputPackageName=` The package name for the transcoded classes
* [Mandatory] `templateFile=` The path of the template file
* [Mandatory] `outputLanguage=java|kotlin` The language for the transcoded classes
* [Optional] `outputFolder=xyz` The location of the transcoded classes. If not specified, output files will be placed in the `sourceFolder` alongside the original SVG files.
* [Optional] `outputClassNamePrefix=` The prefix for the class names of the transcoded classes

Assuming your `RADIANCE_VERSION` variable points to the latest version of the Radiance libraries, here is how you would run the converter pipeline for a single SVG source folder (note that the dependencies versions need to match the Radiance version, see [the list below](#dependency-versions-for-photon)):

<code>java <b>-cp</b> ../drop/$RADIANCE_VERSION/core/radiance-photon-$RADIANCE_VERSION.jar:../build/libs-core/batik-all-1.12.jar:../build/libs-core/xml-apis-1.4.01.jar:../build/libs-core/xml-apis-ext-1.4.01.jar:../build/libs-core/xmlgraphics-commons-2.4.jar org.pushingpixels.photon.api.transcoder.SvgBatchConverter <b>sourceFolder=</b>../demos/flamingo-demo/src/main/java/org/pushingpixels/demo/flamingo/svg/tango/transcoded <b>outputPackageName=</b>org.pushingpixels.demo.flamingo.svg.tango.transcoded <b>templateFile=</b>/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ <b>outputLanguage=</b>java</code>

The first part is enumerating all the jar files required for the converter - Photon and Batik. In this sample script, the Photon jar is under `drop` folder after running the `gradlew copyJars` command. The Batik dependencies are under `build/libs-core` after running the `gradlew getCoreDependencies` command.

The second part passes the mandatory parameters:

* `../demos/flamingo-demo/src/main/java/org/pushingpixels/demo/flamingo/svg/tango/transcoded` as the location of the source SVG images - and the output transcoded classes
* `org.pushingpixels.demo.flamingo.svg.tango.transcoded` as the package name for the transcoded classes
* `/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ` as the path of the template file
* `outputLanguage=java` to specify that the transcoded classes should be Java code

#### Recursive batch transcoding all SVG files under a folder

The `SvgDeepBatchConverter` class is the entry point into the offline recursive batch converter pipeline. It has the following parameters:

* [Mandatory] `sourceRootFolder=` The location of the root folder to traverse for SVG images
* [Mandatory] `outputRootPackageName=` The root package name for the transcoded classes
* [Mandatory] `templateFile=` The path of the template file
* [Mandatory] `outputLanguage=java|kotlin` The language for the transcoded classes
* [Optional] `outputRootFolder=xyz` The root location of the transcoded classes. If not specified, output files will be placed under the `sourceRootFolder` alongside the original SVG files.
* [Optional] `outputClassNamePrefix=` The prefix for the class names of the transcoded classes

Assuming your `RADIANCE_VERSION` variable points to the latest version of the Radiance libraries, here is how you would run the converter pipeline recursively for all SVG files under a folder (note that the dependencies versions need to match the Radiance version, see [the list below](#dependency-versions-for-photon)):

<code>java <b>-cp</b> ../drop/$RADIANCE_VERSION/core/radiance-photon-$RADIANCE_VERSION.jar:../build/libs-core/batik-all-1.12.jar:../build/libs-core/xml-apis-1.4.01.jar:../build/libs-core/xml-apis-ext-1.4.01.jar:../build/libs-core/xmlgraphics-commons-2.4.jar org.pushingpixels.photon.api.transcoder.SvgDeepBatchConverter <b>sourceRootFolder=</b>../demos/spyglass/src/main/java/org/pushingpixels/demo/spyglass/ <b>outputRootPackageName=</b>org.pushingpixels.demo.spyglass <b>templateFile=</b>/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ <b>outputLanguage=</b>java</code>

The first part is enumerating all the jar files required for the converter - Photon and Batik. In this sample script, the Photon jar is under `drop` folder after running the `gradlew copyJars` command. The Batik dependencies are under `build/libs-core` after running the `gradlew getCoreDependencies` command.

The second part passes the mandatory parameters:

* `../demos/spyglass/src/main/java/org/pushingpixels/demo/spyglass` as the root folder of the source SVG images - and the output transcoded classes
* `org.pushingpixels.demo.spyglass` as the root package name for the transcoded classes
* `/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ` as the path of the template file
* `outputLanguage=java` to specify that the transcoded classes should be Java code

#### Important note for offline transcoding

The intended usage and the scope of Photon is to convert reasonably sized icons for usages as supporting imagery without the additional overhead of bundling a full-fledged SVG parsing and rendering library.

SVG content can be arbitrarily complex. For example, [this Spain flag](https://en.wikipedia.org/wiki/File:Flag_of_Spain.svg) is 59KB in the SVG format. It is transcoded by Photon to a 643KB Java file, and then compiled to a 319KB class file. There are more complex flags, such as [Ecuador](https://en.wikipedia.org/wiki/File:Flag_of_Ecuador.svg) with a lot more details or [Afghanistan](https://en.wikipedia.org/wiki/File:Flag_of_Afghanistan.svg) that has a huge path with more than 8K elements in it (all the white outlines of mosque, wheat and inscription is a single path). Such files produce a Java / Kotlin class that can't be compiled due to too many symbols in it.

Photon **does not** provide support for such huge SVG files. At some point, the binary size of the compiled transcoded classes is at the same order of magnitude as simply bundling the original SVGs and the full Batik distribution.

### Dynamic display of SVG content at runtime

The second option to display content of SVG icons is to use the `SvgBatikResizableIcon` class. It provides a number of static methods to load the SVG content from an `InputStream` or a `URL`. The source can be either uncompressed or compressed (use `getSvgIcon` or `getSvgzIcon` APIs respectively).

If you choose this route, keep the following in mind:

* You will need to bring in Photon, Neon, Batik and all of Batik's dependencies into your classpath.
* SVG has a wide feature surface which, depending on the complexity of your SVG sources, can lead to significant initial parsing and rendering time of the icon content. In the meantime, you are not showing any graphical content in that specific Swing view.

Note that `SvgBatikResizableIcon`'s primary intent is to be used with components that expect to be populated with resizable icon content. However, since this class implements the core Swing `Icon` interface, you can use the instance returned by one of the class's static methods anywhere you use icons today.

If your app needs to track the loading of the SVG content, you can use the following APIs on the `SvgBatikResizableIcon` class:

* `addAsynchronousLoadListener(AsynchronousLoadListener)` API to be notified on content load completion
* `isLoading()` API to query whether the content loading has been completed

### SVG format support

The following table summarizes the level of support for different SVG elements.

| SVG element | Status |
| --- | --- |
| `<animate>` | Under consideration using Trident |
| `<circle>` | Radiance 1.0+ |
| `<clipPath>` | Radiance 1.0+ |
| `<ellipse>` | Radiance 1.0+ |
| `<filter>` | Out of scope |
| `<hatch>` | [Not supported](https://issues.apache.org/jira/browse/BATIK-1259) by Batik |
| `<image>` | Radiance 2.5+ |
| `<line>` | Radiance 1.0+ |
| `<linearGradient>` | Radiance 1.0+ |
| `<marker>` | Radiance 2.5+ |
| `<mask>` | Out of scope |
| `<path>` | Radiance 1.0+ |
| `<pattern>` | Radiance 2.5+ |
| `<polygon>` | Radiance 1.0+ |
| `<polyline>` | Radiance 1.0+ |
| `<radialGradient>` | Radiance 1.0+ |
| `<rect>` | Radiance 1.0+ |
| `<solidcolor>` | Radiance 1.0+ |
| `<text>` | Radiance 2.5+ |

### Dependency versions for Photon

* For **3.0-SNAPSHOT**, use
  * `batik-all-1.12.jar`
  * `xml-apis-1.4.01.jar`
  * `xml-apis-ext-1.4.01.jar`
  * `xmlgraphics-commons-2.4.jar`
* For **2.5.1**, use
  * `batik-all-1.11.jar`
  * `xml-apis-1.3.04.jar`
  * `xml-apis-ext-1.3.04.jar`
  * `xmlgraphics-commons-2.3.jar`
* For **2.0.1**, use
  * `batik-all-1.11.jar`
  * `xml-apis-1.3.04.jar`
  * `xml-apis-ext-1.3.04.jar`
  * `xmlgraphics-commons-2.3.jar`
* For **1.0.2**
  * `batik-all-1.10.jar`
  * `xml-apis-1.3.04.jar`
  * `xml-apis-ext-1.3.04.jar`
  * `xmlgraphics-commons-2.2.jar`

These can be downloaded manually from the net, or doing the following:

* Download the matching Radiance `X.Y.Z` source archive
* Run `./gradlew`
* Run `./gradlew copyJars`
* Run `./gradlew getCoreDependencies`

At this point, the Photon jar will be under `drop/X.Y.Z/core` and the dependencies will be under `build/libs-core`.

### Taking a deeper look at Photon internals

If you want to know more about the internal implementation details of Photon, [click here](internals.md).
