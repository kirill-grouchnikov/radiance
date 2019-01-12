## Building Radiance

Radiance libraries are built with [Gradle](https://docs.gradle.org/). Each library has its own `build.gradle` file, and the top-level `build.gradle` has tasks to build, package and deploy Radiance artifacts.

### Local artifacts

Radiance artifacts are split into three groups - `core`, `demo` and `tools`. Core artifacts are binaries that provide application-facing functionality of Neon, Trident, Substance, Flamingo etc. Demo artifacts are binaries that provide the bundled test / demo applications for local testing of the various core Radiance libraries. Tools artifacts are binaries for general maintenance of various Radiance libraries.

To build library artifacts, run `./gradlew` in your terminal. After this command completes, the packaged jar files will be under the matching library folders. To copy all the jars under one location, run `./gradlew copyJars` command. For version `X.Y` of Radiance (see `version` in `build.gradle`), the artifacts will be copied under:

* `drop/X.Y/core` for core artifacts
* `drop/X.Y/demo` for demo artifacts
* `drop/X.Y/tools` for tools artifacts

### Local third-party dependencies

Some of the Radiance libraries have third-party dependencies. To print the full dependency tree, run `./gradlew printRuntimeDependencies`. To locally copy these dependencies (in case you do not want to pull them at build time with Gradle in your own environment), use the following:

* `./gradlew getCoreDependencies` to copy third-party dependencies for core artifacts into `build/libs-core`
* `./gradlew getDemoDependencies` to copy third-party dependencies for demo artifacts into `build/libs-demo`
* `./gradlew getToolsDependencies` to copy third-party dependencies for tools artifacts into `build/libs-tools`
* `./gradlew getAllDependencies` to copy third-party dependencies for all artifacts into the folders above

Note that most core Radiance libraries do not have third-party runtime dependencies. Specifically, Neon, Trident, Substance and Flamingo are self-contained within Radiance. However, Photon requires [Batik](https://xmlgraphics.apache.org/batik/) and Spoonbill requires [SVNKit](https://svnkit.com/). In addition, core Kotlin libraries (Ember, Meteor, Plasma) require the [Kotlin standard library](https://kotlinlang.org/api/latest/jvm/stdlib/index.html).

Most of the Radiance demo and tools libraries rely on a number of third-party components, mainly [FormLayout](http://www.jgoodies.com/freeware/libraries/forms/) from [JGoodies](http://www.jgoodies.com/), and [FEST Swing](https://github.com/alexruiz/fest-swing-1.x). Those dependencies can be seen in the relevant `build.gradle` files.
