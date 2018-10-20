## Zodiac - creating documentation screenshots for Substance and Flamingo

### Overview

Zodiac has a collection of classes for taking screenshots of Substance and Flamingo for documentation purposes.

### Dependencies

Zodiac depends on:
* [JGoodies FormLayout](http://www.jgoodies.com/freeware/libraries/forms/) for layouts
* [FEST Swing](https://github.com/alexruiz/fest-swing-1.x) for driving the screenshot scenarios with robots

### Building

Run the following commands to build and collect all Zodiac runtime components:

* `./gradlew`
* `./gradlew copyJars`
* `./gradlew getToolsDependencies`

At this point, the main Zodiac jar will be in `drop/VERSION/tools`. Substance, Flamingo and their Radiance dependencies (Neon and Trident) will be in `drop/VERSION/core`. Third-party dependencies will be in `build/libs-tools`.

### Running Zodiac scripts

Zodiac scripts are in `scripts/zodiac` folder. The structure of each script is:

* Set up the version of Java to use
* Set up the classpath with all runtime dependencies
* Run Zodiac command for each skin / color scheme / watermark

For example, to run Zodiac to create screenshots for the Autumn skin:

``` export JAVA_HOME=`/usr/libexec/java_home -v 9` ```

`alias JAVA="java"`

`RADIANCE_VERSION=0.9-SNAPSHOT`

`CLASSPATH=../../drop/$RADIANCE_VERSION/tools/radiance-zodiac-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/tools/radiance-tools-common-$RADIANCE_VERSION.jar:../../build/libs-tools/fest-swing-1.2.1.jar:../../build/libs-tools/fest-reflect-1.2.jar:../../build/libs-tools/fest-util-1.1.3.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-neon-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-trident-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/demo/radiance-substance-demo-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-extras-$RADIANCE_VERSION.jar:../../build/libs-tools/jgoodies-forms-1.9.0.jar:../../build/libs-tools/jgoodies-common-1.8.1.jar`

`JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.skins.Autumn ../../docs/images/`
