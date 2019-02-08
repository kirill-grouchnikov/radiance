## UI toolkit handlers

Graphical applications are a natural fit for animations, and Trident core has built-in support for Swing. [This support](UIToolkitSupport.md) covers threading rules, custom property interpolators and repaint timelines. Application code that needs to support additional Java-based UI toolkits should register a custom UI toolkit handler.

Most modern UI toolkits have threading rules that the applications must respect in order to prevent application freeze and visual artifacts. The threading rules for both Swing and SWT specify that the UI-related operations must be done on a special UI thread, and the methods in the `org.pushingpixels.trident.UIToolkitHandler` are used to determine the relevance of these threading rules. The `UIToolkitHandler` interface is illustrated by the following 'mock' support for SWT:

```java
public class SWTToolkitHandler implements UIToolkitHandler {
	@Override
	public boolean isHandlerFor(Object mainTimelineObject) {
		return (mainTimelineObject instanceof Widget);
	}

	@Override
	public boolean isInReadyState(Object mainTimelineObject) {
		return !((Widget) mainTimelineObject).isDisposed();
	}

	@Override
	public void runOnUIThread(Runnable runnable) {
		Display.getDefault().asyncExec(runnable);
	}
}
```

This is a very simple implementation of a UI toolkit handler that respects the relevant threading rules:
* The `isHandlerFor` associates this handler with all SWT widgets
* The `isInReadyState` marks disposed widgets to skip the property interpolation / callback invocations
* The `runOnUIThread` runs the UI related logic on the SWT thread

### Registering custom UI toolkit handlers

Trident provides two ways to register custom UI toolkit handlers - customization APIs and plugins.

The `TridentConfig` class has the following APIs to work with UI toolkit handlers:

* `addUIToolkitHandler(UIToolkitHandler)` - registers the UI toolkit handler
* `removeUIToolkitHandler(UIToolkitHandler)` - unregisters the UI toolkit handler
* `getUIToolkitHandlers()` - retrieves an unmodifiable collection of all registered (core and custom) UI toolkit handlers

### Respecting the threading rules

The `UIToolkitHandler.isHandlerFor(Object)` is used to determine whether the main timeline object is a component / widget for the specific UI toolkit. At runtime, all fields registered with the `Timeline.addPropertyToInterpolate` methods will be changed on the UI thread using the `UIToolkitHandler.runOnUIThread` method.

In the [simple Swing example](SimpleSwingExample.md) that interpolates the foreground color of a button on mouse rollover, the timeline is configured as

```java
	SwingComponentTimeline.componentBuilder(button)
	    .addPropertyToInterpolate("foreground", Color.blue, Color.red)
```

If you put a breakpoint in the `JComponent.setForeground(Color)` - which is called on every timeline pulse - you will see that it is called on the Swing Event Dispatch Thread. Internally, this is what happens:

* When the timeline is created, all registered UI toolkit handlers are asked whether they are handlers for the specified object
* The `org.pushingpixels.trident.swing.SwingToolkitHandler` registered in the core library returns `true` for the button object in its `isHandlerFor(Object)`
* On every timeline pulse, a `Runnable` object is created internally. The `run()` method calls the setters for all registered fields - using the `PropertyInterpolator.interpolate` method of the matching [property interpolator](PropertyInterpolatorPlugin.md)
* This `Runnable` is passed to the `UIToolkitHandler.runOnUIThread` method of the matching UI toolkit handler.

And this is how `SwingToolkitHandler.runOnUIThread()` is implemented:

```java
	@Override
	public void runOnUIThread(Runnable runnable) {
		if (SwingUtilities.isEventDispatchThread())
			runnable.run();
		else
			SwingUtilities.invokeLater(runnable);
	}
```

### Running custom application code on UI thread

The flow described above works for the fields registered with the `Timeline.Builder.addPropertyToInterpolate` methods. What about the custom [application callbacks](TimelineLifecycle.md) registered with the `Timeline.Builder.addCallback()`? If the callback methods need to respect the UI threading rules of the matching toolkit, the `TimelineCallback` implementation class needs to be tagged with the `org.pushingpixels.trident.callback.RunOnUIThread` annotation.

Callback implementations marked with this annotation will have both `onTimelineStateChanged` and `onTimelinePulse` invoked on the UI thread, making it safe to query and change the UI. The `UIThreadTimelineCallbackAdapter` is a core adapter class that is marked with this annotation.

### Querying the readiness of the timeline object

The `isInReadyState(Object)` is the third and final method in the `UIToolkitHandler` interface. After the specific UI toolkit handler has declared that it will handle the main object of the specific timeline (by returning `true` from the `isHandlerFor(Object)` method), it will be used to interpolate the registered fields and run the registered callbacks. However, some UI toolkits may impose additional restrictions on when the UI object is ready to be queried / changed.

For example, once an SWT control is disposed, it will throw an `SWTException` in the `setForeground` method. So, if the application code is running a slow animation that changes the foreground color of a button, and the application window containing this button is disposed in the meantime, the call to `setForeground` should be skipped.
