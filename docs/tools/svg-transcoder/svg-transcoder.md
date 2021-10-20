## SVG Transcoder - SVG icons for Swing applications

### Overview

The goal of this project is to enable usage of vector-based icons in Swing applications.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-photon/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-photon) `radiance-photon` for build instructions of the latest stable release.

The original icon format supported by the transcoder is SVG, and you need the [matching version](#dependency-versions-for-the-radiance-svg-transcoder) of [Apache Batik](https://xmlgraphics.apache.org/batik/) and its dependencies.

### Offline transcoding of SVG content

SVG has a wide feature surface which, depending on the complexity of your SVG sources, can lead to significant initial parsing and rendering time of the icon content.

Radiance SVG transcoder allows you to convert an SVG source into a corresponding Java / Kotlin class that contains a sequence of matching Java2D canvas draw calls to render the original content. Radiance SVG transcoder ships with two sets of built-in template files (one for Java and one for Kotlin) that create slightly different wrappers around the Java2D draw calls:

* `SvgTranscoderTemplatePlain.templ` - generates a class with a static method to paint the icon content onto the passed `Graphics2D` object. The generated class also has methods to query the bounding box of the original SVG content.
* `SvgTranscoderTemplateRadiance.templ` - generates a class that implements [common](../../common/common.md)'s `RadianceIcon` interface. An instance of the generated class can be passed to any relevant Radiance API, including the matching command button and ribbon calls. At runtime, the content will be automatically reconfigured based on the new display size of the icon.

A couple of usages of transcoded resizable icons in Radiance itself are:

* Radiance ribbon resize that may involve a number of command buttons going between smaller and larger icon sizes. It is recommended to use the generated static `of(int, int)` method to obtain an instance of a generated class for the specific initial size.
* Icons in Radiance icon packs configured with the `RadianceThemingCortex.GlobalScope.setIconPack` API.

#### Batch transcoding all SVG files in a single folder

The `SvgBatchConverter` class is the entry point into the offline batch converter pipeline for a single folder. It has the following parameters:

* [Mandatory] `sourceFolder=` The location of the folder that contains source SVG images
* [Mandatory] `outputPackageName=` The package name for the transcoded classes
* [Mandatory] `templateFile=` The path of the template file
* [Mandatory] `outputLanguage=java|kotlin` The language for the transcoded classes
* [Optional] `outputFolder=xyz` The location of the transcoded classes. If not specified, output files will be placed in the `sourceFolder` alongside the original SVG files.
* [Optional] `outputClassNamePrefix=` The prefix for the class names of the transcoded classes

Assuming your `RADIANCE_VERSION` variable points to the latest version of the Radiance libraries, here is how you would run the converter pipeline for a single SVG source folder (note that the dependencies versions need to match the Radiance version, see [the list below](#dependency-versions-for-the-radiance-svg-transcoder)):

<code>java <b>-cp</b> ../drop/$RADIANCE_VERSION/tools/radiance-svg-transcoder-$RADIANCE_VERSION.jar:../build/libs-core/batik-all-1.14.jar:../build/libs-core/xml-apis-1.4.01.jar:../build/libs-core/xml-apis-ext-1.3.04.jar:../build/libs-core/xmlgraphics-commons-2.6.jar SvgBatchConverter <b>sourceFolder=</b>../demos/components-demo/src/main/java/org/pushingpixels/radiance/demo/components/svg/tango/transcoded <b>outputPackageName=</b>org.pushingpixels.radiance.demo.component.svg.tango.transcoded <b>templateFile=</b>/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ <b>outputLanguage=</b>java</code>

The first part is enumerating all the jar files required for the converter - Radiance and Batik. In this sample script, the Radiance SVG transcoder jar is under `drop` folder after running the `gradlew copyJars` command. The Batik dependencies are under `build/libs-core` after running the `gradlew getCoreDependencies` command.

The second part passes the mandatory parameters:

* `../demos/components-demo/src/main/java/org/pushingpixels/radiance/demo/components/svg/tango/transcoded` as the location of the source SVG images - and the output transcoded classes
* `org.pushingpixels.radiance.demo.component.svg.tango.transcoded` as the package name for the transcoded classes
* `/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ` as the path of the template file
* `outputLanguage=java` to specify that the transcoded classes should be Java code

#### Recursive batch transcoding all SVG files under a folder

The `SvgDeepBatchConverter` class is the entry point into the offline recursive batch converter pipeline. It has the following parameters:

* [Mandatory] `sourceRootFolder=` The location of the root folder to traverse for SVG images
* [Mandatory] `outputRootPackageName=` The root package name for the transcoded classes
* [Mandatory] `templateFile=` The path of the template file
* [Mandatory] `outputLanguage=java|kotlin` The language for the transcoded classes
* [Optional] `outputRootFolder=xyz` The root location of the transcoded classes. If not specified, output files will be placed under the `sourceRootFolder` alongside the original SVG files.
* [Optional] `outputClassNamePrefix=` The prefix for the class names of the transcoded classes

Assuming your `RADIANCE_VERSION` variable points to the latest version of the Radiance libraries, here is how you would run the converter pipeline recursively for all SVG files under a folder (note that the dependencies versions need to match the Radiance version, see [the list below](#dependency-versions-for-the-radiance-svg-transcoder)):

<code>java <b>-cp</b> ../drop/$RADIANCE_VERSION/tools/radiance-svg-transcoder-$RADIANCE_VERSION.jar:../build/libs-core/batik-all-1.14.jar:../build/libs-core/xml-apis-1.4.01.jar:../build/libs-core/xml-apis-ext-1.3.04.jar:../build/libs-core/xmlgraphics-commons-2.6.jar SvgDeepBatchConverter <b>sourceRootFolder=</b>../demos/theming-apps/src/main/java/org/pushingpixels/radiance/demo/themingapps/ <b>outputRootPackageName=</b>org.pushingpixels.radiance.demo.themingapps <b>templateFile=</b>/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ <b>outputLanguage=</b>java</code>

The first part is enumerating all the jar files required for the converter - Radiance and Batik. In this sample script, the Radiance SVG transcoder jar is under `drop` folder after running the `gradlew copyJars` command. The Batik dependencies are under `build/libs-core` after running the `gradlew getCoreDependencies` command.

The second part passes the mandatory parameters:

* `../demos/theming-apps/src/main/java/org/pushingpixels/radiance/demo/themingapps` as the root folder of the source SVG images - and the output transcoded classes
* `org.pushingpixels.radiance.demo.themingapps` as the root package name for the transcoded classes
* `/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ` as the path of the template file
* `outputLanguage=java` to specify that the transcoded classes should be Java code

#### An important note on offline transcoding

The intended usage and the scope of the Radiance SVG transcoder is to convert reasonably sized icons for usages as supporting imagery without the additional runtime overhead of bundling a full-fledged SVG parsing and rendering library.

SVG content can be arbitrarily complex. For example, [this Spanish flag](https://en.wikipedia.org/wiki/File:Flag_of_Spain.svg) is a 59KB SVG file. It is transcoded by Radiance to a 674KB Java file, and then compiled to a 302KB class file. There are more complex flags, such as [Ecuador](https://en.wikipedia.org/wiki/File:Flag_of_Ecuador.svg) with a lot more details or [Afghanistan](https://en.wikipedia.org/wiki/File:Flag_of_Afghanistan.svg) that has a huge path with more than 8K elements in it (all the white outlines of mosque, wheat and inscription is a single path). Such files produce a Java / Kotlin class that can't be compiled due to too many symbols in it.

The Radiance SVG transcoder **does not** provide support for such huge SVG files. At some point, the binary size of the compiled transcoded classes is at the same order of magnitude as simply bundling the original SVGs and the full Batik distribution.

### SVG format support

The following table summarizes the level of support for different SVG elements.

| SVG element | Status |
| --- | --- |
| `<animate>` | Under consideration using Animation |
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

### Dependency versions for the Radiance SVG transcoder

* For **4.5.0**, use
  * `batik-all-1.14.jar`
  * `xml-apis-1.4.01.jar`
  * `xml-apis-ext-1.3.04.jar`
  * `xmlgraphics-commons-2.6.jar`
* For **4.0.0**, use
  * `batik-all-1.14.jar`
  * `xml-apis-1.4.01.jar`
  * `xml-apis-ext-1.3.04.jar`
  * `xmlgraphics-commons-2.6.jar`
* For **3.5.1**, use
  * `batik-all-1.13.jar`
  * `xml-apis-1.4.01.jar`
  * `xml-apis-ext-1.3.04.jar`
  * `xmlgraphics-commons-2.4.jar`
* For **3.0.0**, use
  * `batik-all-1.13.jar`
  * `xml-apis-1.4.01.jar`
  * `xml-apis-ext-1.3.04.jar`
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

At this point, the Radiance SVG transcoder jar will be under `drop/X.Y.Z/core` and the dependencies will be under `build/libs-core`.

### Taking a deeper look at the transcoder internals

If you want to know more about the internal implementation details of the transcoder, [click here](internals.md).
