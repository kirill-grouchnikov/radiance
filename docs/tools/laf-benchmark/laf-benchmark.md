## LAF Benchmark - measuring performance of Swing look-and-feels

This Radiance module is targeted at Swing look-and-feel developers that wish to test the performance of their libraries.

It is a collection of static and dynamic scenarios that are targeting different core Swing components and different interaction scenarios. The static scenarios create a number of components and then render the main frame onto an offscreen buffer. The dynamic scenarios run a number of typical interaction scenarios that involve changing the components or models.

First, run the following Gradle commands locally to build LAF Benchmark as part of Radiance and collect the necessary jar files:

* `gradlew`
* `gradlew copyJars`
* `gradlew getToolsDependencies`

Now configure the specific version of Java runtime that you want to test under and the classpath with all the dependencies:

``` export JAVA_HOME=`/usr/libexec/java_home -v 9` ```

`RADIANCE_VERSION=5.0.0`

`CLASSPATH=./drop/$RADIANCE_VERSION/tools/radiance-laf-benchmark-$RADIANCE_VERSION.jar:./build/libs-tools/jgoodies-forms-1.9.0.jar:./build/libs-tools/jgoodies-common-1.8.1.jar`

To measure the performance of a specific core look-and-feel - in this case Nimbus - run the following command:

`java -Dswing.defaultlaf=javax.swing.plaf.nimbus.NimbusLookAndFeel -cp $CLASSPATH DynamicPerformanceSuite 10
`

This will launch the dynamic performance suite and run all the scenarios ten times (the parameter passed to the `main()` method). Do not interact with the app while it's running, and do not switch away to other apps on your machine.

As the suite runs, it prints out thread user time and thread CPU time spent on each scenario, with minimum, maximum, average and deviance listed:

`avg  365, min  306, max  428, dev 0.12         Buttons : Toggling selection on buttons`

`avg  246, min  196, max  398, dev 0.24         Buttons : Toggling enabled on buttons`

`avg  339, min  245, max  587, dev 0.26         Buttons : Changing text on buttons`

`avg  204, min  118, max  465, dev 0.56          Combos : Toggling enabled on comboboxes`

`avg  151, min  128, max  212, dev 0.18          Combos : Toggling editable on comboboxes`

`avg  109, min   62, max  415, dev 0.94            List : Scrolling large list`

`avg   51, min   48, max   56, dev 0.05            List : Moving elements in a large list`

The numbers are milliseconds it takes to render a frame with a number of matching components (buttons, sliders etc) to an offscreen buffer (the smaller, the better).

With this, you can compare the performance of your look-and-feel with that of core / third-party libraries. You can also track performance improvements and regressions during the development cycle.

[Here is the script](../../../scripts/laf-benchmark/auto-dynamic-radiance.sh) used for tracking performance numbers for Radiance:

``` export JAVA_HOME=`/usr/libexec/java_home -v 9` ```

`RADIANCE_VERSION=5.0.0`

`CLASSPATH=../../drop/$RADIANCE_VERSION/tools/radiance-laf-benchmark-$RADIANCE_VERSION.jar:../../build/libs-tools/jgoodies-forms-1.9.0.jar:../../build/libs-tools/jgoodies-common-1.8.1.jar`

`RADIANCE_CLASSPATH=../../drop/$RADIANCE_VERSION/core/radiance-theming-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-animation-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-common-$RADIANCE_VERSION.jar`

`java -Dswing.defaultlaf=RadianceGeminiLookAndFeel -cp $CLASSPATH:$RADIANCE_CLASSPATH DynamicPerformanceSuite 10`
