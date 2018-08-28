## Building Radiance

Radiance libraries are built with [Gradle](https://docs.gradle.org/). Each library has its own `build.gradle` file, and the top-level `build.gradle` has tasks to build, package and deploy Radiance artifacts.

### Local artifacts

Radiance artifacts are split into three groups - `core`, `demo` and `tools`. Core artifacts are binaries that provide application-facing functionality of Neon, Trident, Substance, Flamingo etc. Demo artifacts are binaries that provide the bundled test / demo applications for local testing of the various core Radiance libraries.

To build library artifacts, run `./gradlew` in your terminal. After this command completes, the packaged jar files will be under the matching library folders. To copy all the jars under one location, run `./gradlew copyJars` command. For version `X.Y` of Radiance (see `version` in `build.gradle`), the artifacts will be copied under:

* `drop/X.Y/core` for core artifacts
* `drop/X.Y/demo` for demo artifacts

### Local third-party dependencies

Some of the Radiance libraries have third-party dependencies. To print the full dependency tree, run `./gradlew printRuntimeDependencies`. To locally copy these dependencies (in case you do not want to pull them at build time with Gradle in your own environment), use the following:

* `./gradlew getCoreDependencies` to get third-party dependencies for core artifacts
* `./gradlew getDemoDependencies` to get third-party dependencies for demo artifacts

Note that most core Radiance libraries do not have third-party runtime dependencies. Specifically, Neon, Trident, Substance and Flamingo are self-contained within Radiance. However, Ibis requires [Batik](https://xmlgraphics.apache.org/batik/) and Spoonbill requires [SVNKit](https://svnkit.com/). In addition, Kormorant requires the [Kotlin standard library](https://kotlinlang.org/api/latest/jvm/stdlib/index.html).

All of the demo Radiance libraries rely on a number of third-party components, mainly [FormLayout](http://www.jgoodies.com/freeware/libraries/forms/) from [JGoodies](http://www.jgoodies.com/), and [FEST Swing](https://github.com/alexruiz/fest-swing-1.x). Those dependencies can be seen in the relevant `build.gradle` files.
