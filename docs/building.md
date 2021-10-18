## Building Radiance

Radiance libraries are built with [Gradle](https://docs.gradle.org/). Each library has its own `build.gradle` file, and the top-level `build.gradle` has tasks to build, package and deploy Radiance artifacts.

### Java requirements

Radiance is built with Java 9. Search for "Java 9 download" in your favorite search engine, or browse [this page](https://www.oracle.com/technetwork/java/javase/downloads/index.html) (and perhaps the archives that it points to) to get the JDK distribution for your environment.

### Local artifacts

Radiance artifacts are split into three groups - `core`, `demo` and `tools`. Core artifacts are binaries that provide application-facing functionality of **Common**, **Animation**, **Substance**, **Flamingo** etc. Demo artifacts are binaries that provide the bundled test / demo applications for local testing of the various core Radiance libraries. Tools artifacts are binaries for general maintenance of various Radiance libraries.

To build library artifacts, run `./gradlew` in your terminal. After this command completes, the packaged jar files will be under the matching library folders. To copy all the jars under one location, run `./gradlew copyJars` command. For version `X.Y` of Radiance (see `version` in `build.gradle`), the artifacts will be copied under:

* `drop/X.Y/core` for core artifacts
* `drop/X.Y/demo` for demo artifacts
* `drop/X.Y/tools` for tools artifacts

### Local third-party dependencies

Some Radiance libraries have third-party dependencies. To print the full dependency tree, run `./gradlew printRuntimeDependencies`. Here is a snippet that shows the dependencies for [Photon](tools/photon/photon.md):

```
------------------ photon -------------------
org.apache.xmlgraphics:batik-all:1.12
org.pushing-pixels:neon:4.0.0
```

To locally copy these dependencies (in case you do not want to pull them at build time with Gradle, Maven or other similar build tools in your own environment), use the following:

* `./gradlew getCoreDependencies` to copy third-party dependencies for core artifacts into `build/libs-core`
* `./gradlew getDemoDependencies` to copy third-party dependencies for demo artifacts into `build/libs-demo`
* `./gradlew getToolsDependencies` to copy third-party dependencies for tools artifacts into `build/libs-tools`
* `./gradlew getAllDependencies` to copy third-party dependencies for all artifacts into the folders above

For a more detailed tree of dependencies, run `./gradlew photon:dependencies` - substituting the relevant module name.

Third-party dependencies of core Radiance libraries are kept to a minimum:
* **Common**, **Animation**, **Substance** and **Flamingo** are self-contained within Radiance.
* Kotlin libraries (**Ember**, **Meteor**, **Plasma**, **Torch**) require Kotlin [standard library](https://kotlinlang.org/api/latest/jvm/stdlib/) and [coroutines library](https://github.com/Kotlin/kotlinx.coroutines).

Radiance demos and tools rely on a number of third-party libraries, mainly [FormLayout](http://www.jgoodies.com/freeware/libraries/forms/) from [JGoodies](http://www.jgoodies.com/), and [Retrofit2](https://square.github.io/retrofit/) from Square, as well as [Apache Batik](https://xmlgraphics.apache.org/batik/) for Photon. Those dependencies can be seen in the relevant `build.gradle` files.
