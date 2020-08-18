## Beacon - visual runtime debugger for Substance

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-beacon/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-beacon) `radiance-beacon` for build instructions of the latest stable release.

To enable Beacon in your app, add Beacon dependency to your build script and add the following line in your `main()` method before creating the app:

`SubstanceCortex.GlobalScope.registerWidget(
    RootPaneTitlePaneUiDebugger.class.getName(), JRootPane.class, true);`

From that point on, Beacon will add a context menu to all decorated windows in your app with the following debug tools available:

* Simulate color blindness - protanopia, deuteranopia, tritanopia
* Change global animation rate     
* Change global focus kind
* Toggle left-to-right / right-to-left mode
* Toggle usage of themed icons
* Toggle global ghost debug mode
* Dump entire window component hierarchy
* Print Substance cache statistics
