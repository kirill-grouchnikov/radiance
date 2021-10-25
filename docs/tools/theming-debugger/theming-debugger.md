## Theming Debugger - visual runtime debugger for Radiance

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-theming-debugger/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-theming-debugger) `radiance-theming-debugger` for build instructions of the latest stable release.

To enable Theming Debugger in your app, add the matching dependency to your build script and add the following line in your `main()` method before creating the app:

`RadianceThemingCortex.GlobalScope.registerWidget(
    RootPaneTitlePaneUiDebugger.class.getName(), JRootPane.class, true);`

From that point on, a context menu will be added to all decorated windows in your app with the following debug tools available:

* Simulate color blindness - protanopia, deuteranopia, tritanopia
* Change global animation rate     
* Change global focus kind
* Toggle left-to-right / right-to-left mode
* Toggle usage of themed icons
* Toggle global ghost debug mode
* Dump entire window component hierarchy
* Print Radiance cache statistics
