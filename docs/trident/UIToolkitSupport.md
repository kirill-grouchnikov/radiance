## Animations in UI toolkits
Smooth transitions and subdued animations are integral part of many modern graphical applications, and Trident comes with built-in support for Java based UI toolkits. The three UI specific requirements are addressed by the core Trident library:

* Automatically respecting the threading rules of the UI toolkits
* Providing [property interpolators](TimelineInterpolatingFields.md) for classes that represent graphical objects of the UI toolkits
* Repainting application windows that have continuous animations

Out of the box, Trident supports [Swing](https://docs.oracle.com/javase/tutorial/uiswing/). In addition, Trident has a pluggable layer that allows interested applications and third part developers to support additional Java UI toolkits (such as [SWT](http://www.eclipse.org/swt/), [Pivot](http://incubator.apache.org/pivot/), [Qt Jambi](http://qtjambi.org/) and others).

### UI threading rules

Most modern UI toolkits have **threading rules** that the applications must respect in order to prevent application freeze and visual artifacts. The threading rules for both [Swing](http://www.javaworld.com/javaworld/jw-08-2007/jw-08-swingthreading.html) and [SWT](http://help.eclipse.org/stable/index.jsp?topic=/org.eclipse.platform.doc.isv/guide/swt_threading.htm) specify that the UI-related operations must be done on the special UI thread.

The strictness of the rules is different between the toolkits. For example, Swing allows calling `Component.repaint()` off the UI thread - internally the repaint request is scheduled to run on that thread. However, SWT is much stricter - repaints (as well as changing any UI property of widget objects) must be done on the UI thread. Failure to do so results in an `SWTException` being thrown by the UI toolkit.

The core Trident library provides a pluggable behavior to automatically detect animations running on UI components and change the interpolated properties on the toolkit UI thread. In addition, custom application callbacks can be marked to be executed on the that thread.

### UI property interpolators

Each UI toolkit has its own set of classes that represent **visual objects** or **properties of graphical objects**. Classes such as `Color`, `Point` and `Rectangle` are specific to the UI toolkit. In Swing, these are found in the `java.awt` package, while in SWT they are located in the `org.eclipse.swt.graphics` package.

Applications that wish to interpolate properties of these types require the matching [property interpolators](TimelineInterpolatingFields.md). The core Trident library provides built-in property interpolators for the AWT / Swing graphical classes.

### Updating the screen
An update to a property of a graphical object should usually be reflected in the visual representation of that object on the screen. Simple operations - such as changing the foreground color of a UI control - automatically repaint the affected control. However, more complicated application animations affect multiple visual objects many times a second. Such scenarios require periodical update of the screen to reflect all the changes that happened in the application objects since the last repaint.

The core Trident library provides special **repaint timelines** that are usually run in a repeating loop, repainting the contents of the entire window or specific UI component / container.
