## Animations in UI toolkits
Smooth transitions and subdued animations are integral part of many modern graphical applications, and Trident comes with built-in support for Swing. The three UI specific requirements are addressed by the core Trident library:

* Automatically respecting the threading rules of Swing's event dispatch thread
* Providing [property interpolators](TimelineInterpolatingFields.md) for classes that represent graphical objects of Swing and AWT
* Repainting application windows that have continuous animations

### UI threading rules

Most modern UI toolkits have **threading rules** that the applications must respect in order to prevent application freeze and visual artifacts. The threading rules for [Swing](http://www.javaworld.com/javaworld/jw-08-2007/jw-08-swingthreading.html) and specify that the UI-related operations must be done on the special UI thread.

The strictness of the rules is different for different operations. For example, Swing allows calling `Component.repaint()` off the UI thread - internally the repaint request is scheduled to run on that thread.

The core Trident library provides a pluggable behavior to automatically detect animations running on UI components and change the interpolated properties on Swing's event dispatch thread. In addition, custom application callbacks can be marked to be executed on the that thread.

### UI property interpolators

Swing has its own set of classes that represent **visual objects** or **properties of graphical objects**. Classes such as `Color`, `Point` and `Rectangle` in Swing are found in the `java.awt` package.

Applications that wish to interpolate properties of these types require the matching [property interpolators](TimelineInterpolatingFields.md). The core Trident library provides built-in property interpolators for the AWT / Swing graphical classes.

### Updating the screen
An update to a property of a graphical object should usually be reflected in the visual representation of that object on the screen. Simple operations - such as changing the foreground color of a UI control - automatically repaint the affected control. However, more complicated application animations affect multiple visual objects many times a second. Such scenarios require periodical update of the screen to reflect all the changes that happened in the application objects since the last repaint.

The core Trident library provides special **repaint timelines** that are usually run in a repeating loop, repainting the contents of the entire window or specific UI component / container.

### Respecting the threading rules

If the main timeline object is an AWT `Component`, all fields registered with the `Timeline.addPropertyToInterpolate` methods will be changed on the event dispatch thread.

In the [simple Swing example](SimpleSwingExample.md) that interpolates the foreground color of a button on mouse rollover, the timeline is configured as

```java
	SwingComponentTimeline.componentBuilder(button)
	    .addPropertyToInterpolate("foreground", Color.blue, Color.red)
```

If you put a breakpoint in the `JComponent.setForeground(Color)` - which is called on every timeline pulse - you will see that it is called on the Swing Event Dispatch Thread. Internally, this is what happens:

* When the timeline is created, the main object is checked to see if it's an instance of the `Component` class
* On every timeline pulse, a `Runnable` object is created internally. The `run()` method calls the setters for all registered fields - using the `PropertyInterpolator.interpolate` method of the matching [property interpolator](PropertyInterpolatorPlugin.md)
* This `Runnable` is passed to the `SwingUtilities.invokeLater` to be scheduled to run on the event dispatch thread.

### Running custom application code on UI thread

The flow described above works for the fields registered with the `Timeline.Builder.addPropertyToInterpolate` methods. What about the custom [application callbacks](TimelineLifecycle.md) registered with the `Timeline.Builder.addCallback()`? If the callback methods need to respect the Swing threading rules, the `TimelineCallback` implementation class needs to be tagged with the `org.pushingpixels.trident.swing.RunOnEventDispatchThread` annotation.

Callback implementations marked with this annotation will have both `onTimelineStateChanged` and `onTimelinePulse` invoked on the event dispatch thread, making it safe to query and change the UI. The `EventDispatchThreadTimelineCallbackAdapter` is a core adapter class that is marked with this annotation.
