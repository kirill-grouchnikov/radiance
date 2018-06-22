## Timeline duration

By default, a Trident timeline runs for 500 milliseconds. To change the default timeline duration use the `Timeline.setDuration(long)` API, passing the required duration in milliseconds. At runtime, the timeline [interpolates](TimelineInterpolatingFields.md) all registered properties and [notifies](TimelineLifecycle.md) all registered listeners. Note that while the number of timeline pulses is directly proportional to the timeline duration, the actual number of pulses, as well as the intervals between each successive pair of pulses depends on the current load of the system and the virtual machine. As such, the application code **must not** make any assumptions about when the timeline pulses will happen, and how many pulses will happen throughout the duration of the timeline.

The `Timeline.setInitialDelay(long)` method specifies the number of milliseconds the timeline should wait after the application code to `play()` before starting firing the timeline pulses. For a timeline with no initial delay, the following events [are fired](TimelineLifecycle.md):

* **idle** -> **ready** immediately after call to `Timeline.play()`
* **ready** -> ** playing forward** immediately afterwards

For a timeline with non-zero delay, the following events are fired:

* **idle** -> **ready** immediately after call to `Timeline.play()`
* **ready** -> ** playing forward** after the specified initial delay has passed

### Timeline position

Each timeline pulse has two associated fractional values - **duration fraction** and **timeline position**. Duration fraction is a number between `0.0` and `1.0` that indicates the absolute percentage of the full timeline duration that has passed. For example, in a timeline that lasts 500 ms, a timeline pulse happening 200 ms after the timeline has begun has the associated duration fraction of `0.4`.

However, some application scenarios require non-linear rate of change for recreating realistic animations of the real physical world. For example, if your application timeline is interpolating the `Y` location of a falling ball, strict linear interpolation will result in overly artificial movement. When objects in the real world move, they don't move at constant speed. For example, a car starts from zero velocity, accelerates to a constant speed, maintains it throughout the main part of the movement and then decelerates to zero velocity as it reaches its final location.

The **timeline position** is a fractional number between `0.0` and `1.0` that indicates how far the timeline has progressed based on the current **ease function**. The ease function takes the linearly increasing duration fraction and translates it to the matching timeline position. The `Timeline.setEase(TimelineEase)` method allows setting a custom ease function on the timeline, where `TimelineEase` interface has the following method:

```java
	public float map(float durationFraction);
```

The `org.pushingpixels.trident.ease` package has a number of core ease functions. To illustrate the difference between the different ease functions, we will use the core `Spline` ease function. The following screenshot shows the mapping between duration fraction and timeline position under `Spline` with factor of `0.5`:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/trident/ease-50.png" width="500" height="289" />

Here, the timeline position close to linear rate of change throughout the entire duration of the timeline, with little acceleration in the beginning, and little deceleration at the end. Here is the mapping between duration fraction and timeline position under `Spline` with factor of `0.9`:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/trident/ease-90.png" width="501" height="289" />

Here, the acceleration phase is longer, and the rate of change between the acceleration and deceleration phases is higher. As you can see, you can simulate different physical processes using different factors of `Spline` ease function. Application code can create custom implementation of the `TimelineEase` interface as well.

### Putting it all together

Interpolation of field values for fields registered for the specific timeline is done based on the **timeline position** and not duration fraction. Application callbacks registered with the `Timeline.addCallback` method get both values in the `TimelineCallback.onTimelinePulse` method. This provides the application logic with the information how much time has passed since the timeline has started, as well as how far along the timeline is based on its ease method.
