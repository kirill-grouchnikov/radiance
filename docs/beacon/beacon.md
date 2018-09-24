## Beacon - visual runtime debugger for Substance

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
* Dump entire window control hierarchy
* Print Substance cache statistics
