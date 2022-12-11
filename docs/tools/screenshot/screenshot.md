## Screenshot - creating documentation screenshots for Radiance

### Overview

A collection of classes for taking screenshots of Radiance for documentation purposes.

### Dependencies

Screenshot depends on:
* [JGoodies FormLayout](http://www.jgoodies.com/freeware/libraries/forms/) for layouts
* Kotlin coroutines for driving the screenshot scenarios

### Building

Run the following commands to build and collect all Screenshot runtime components:

* `./gradlew`
* `./gradlew copyJars`
* `./gradlew getToolsDependencies`

At this point, the main Screenshot jar will be in `drop/VERSION/tools`. Radiance dependencies will be in `drop/VERSION/core`. Third-party dependencies will be in `build/libs-tools`.

### Running Screenshot scripts

Screenshot scripts are in `scripts/screenshot` folder. The structure of each script is:

* Set up the version of Java to use
* Set up the classpath with all runtime dependencies
* Run Screenshot command for each skin / color scheme

For example, to run Screenshot to create screenshots for all Aurora core skins:

``` export JAVA_HOME=`/usr/libexec/java_home -v 16` ```

`alias JAVA="java"`

`RADIANCE_VERSION=7.0-SNAPSHOT`

`KOTLIN_VERSION=1.7.20`

`KOTLIN_COROUTINES_VERSION=1.6.4`

`CLASSPATH=../../drop/$RADIANCE_VERSION/tools/radiance-screenshot-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/tools/radiance-tools-common-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-theming-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-theming-extras-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-common-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-animation-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/demo/radiance-theming-demo-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-theming-extras-$RADIANCE_VERSION.jar:../../build/libs-tools/jgoodies-forms-1.9.0.jar:../../build/libs-tools/jgoodies-common-1.8.1.jar:../../build/libs-tools/kotlin-stdlib-$KOTLIN_VERSION.jar:../../build/libs-tools/kotlin-stdlib-common-$KOTLIN_VERSION.jar:../../build/libs-tools/kotlinx-coroutines-core-jvm-$KOTLIN_COROUTINES_VERSION.jar:../../build/libs-tools/kotlinx-coroutines-swing-$KOTLIN_COROUTINES_VERSION.jar`

`JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.theming.skins.All ../../docs/images/`
