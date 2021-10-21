## Timeline states

A timeline goes through different **timeline states**. The `Timeline.TimelineState` enum lists all possible timeline states, with the basic ones being:

* **Idle** for timelines that are not playing. A timeline is idle when it's been created but not played, or after it has finished playing
* **Playing forward** for timelines that [interpolate](TimelineInterpolatingFields.md) fields from start value to end value.
* **Playing reverse** for timelines that [interpolate](TimelineInterpolatingFields.md) fields from end value to start value.
* **Done** for timelines that have finished playing. A done timeline becomes idle after notifying all listeners (see below).

### Playing timelines

When the timeline is created, it is in the **idle** state. An idle timeline can be configured by the application code - even after it has finished playing. The configuration includes adding properties to interpolate, changing the initial delay and duration, adding callbacks and changing the ease function.

To start playing a timeline use the `Timeline.play()` method. At every pulse the timeline will interpolate all registered properties (using the public setters), as well as notify all registered callbacks. If the timeline is already playing, it will continue playing from the **same point**.

Some scenarios required playing the timeline **in reverse**. In the example below we want to animate the button foreground from blue to red when the mouse moves over the button - this is done in the `mouseEntered` method. To provide consistent UI behavior, we also want to animate the foreground color from red back to blue when the mouse is moved away from the button - this is done by calling the `Timeline.playReverse()` in the `mouseExisted` method.

```java
final Timeline rolloverTimeline = Timeline.builder(button)
    .addPropertyToInterpolate("foreground", Color.blue, Color.red)
    .build();
button.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseEntered(MouseEvent e) {
		rolloverTimeline.play();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		rolloverTimeline.playReverse();
	}
});
```

Suppose the user moves the mouse over the button and then quickly moves it away. You do not want to have the reverse play start from the end value (full red color) - this will create a noticeable color flicker on the screen. Internally, `playReverse()` detects that this timeline is already playing (forward), and starts playing it in reverse from its **current position**.

### Replaying timelines

While `play()` and `playReverse()` respect the current timeline position for already playing timelines, some scenarios require restarting the timeline. The `Timeline.replay()` and `Timeline.replayReverse()` can be used in these cases. Code example below shows the `replay()` API used to restart the rollover animation that interpolates the background color of a single grid rectangle from yellow to black color:

```java
public SnakePanelRectangle() {
	this.backgroundColor = Color.black;
	this.isRollover = false;

	this.rolloverTimeline = Timeline.builder(this)
        .addPropertyToInterpolate("backgroundColor", Color.yellow, Color.black)
        .setDuration(2500)
        .build();
}

public void setRollover(boolean isRollover) {
	if (this.isRollover == isRollover)
		return;
	this.isRollover = isRollover;
	if (this.isRollover) {
		this.rolloverTimeline.replay();
	}
}
```

### Looping timelines
While most timelines need to play only once, some application scenarios require running timelines in loop. Pulsating the system tray icon to indicate new messages or showing an indefinite progress while your application connects over a slow line are examples of looping timelines.

Looping timelines are created and configured in exactly the same way as regular timelines, and they can interpolate float and custom properties of the associated main timeline object. The only difference is the way the looping timeline is played. There are two `Timeline` methods to start playing a looping timeline:

* `Timeline.playLoop(RepeatBehavior)`
* `Timeline.playLoop(int, RepeatBehavior)`

The first method starts an infinite loop (at least until the timeline is canceled). The second method runs the timeline for the specified number of loops. The `Timeline.RepeatBehavior` enum specifies what happens when the looping timeline reaches the "end" of the loop. Each timeline loop changes the internal **duration fraction** which is a number between `0.0` and `1.0`. While a regular timeline ends once the fraction reaches the value `1.0`, a looping timeline continues. The difference between the repeat behaviors is in the way the timeline fraction is computed:

* In the **loop** mode the timeline fraction starts from `0.0`, is interpolated to `1.0`, and once that value is reached, it is reset it back to `0.0`.
* In the **reverse** mode, the timeline fraction is interpolated during odd loops from `0.0` to `1.0`, and is interpolated during even loops from `1.0` down to `0.0`.

As an example, the loop mode can be used for circular indefinite progress indication, where the matching "lead" angle is interpolated between 0 and 360 degrees. The reverse mode can be used for displaying indefinite linear progress indication that oscillates between the left and right markers.

### Additional timeline operations
A timeline can be put in the **suspended** state by calling the `Timeline.suspend()` method. A suspended timeline can be resumed with the `Timeline.resume()` method.

In some cases you will want to stop a running timeline. There are three different APIs that you can use, each with its own semantics:

* `Timeline.abort()`. The timeline transitions to the **idle** state. No application callbacks or field interpolations are done.
* `Timeline.end()`. The timeline transitions to the **done** state, with the timeline position set to 0.0 or 1.0 - based on the direction of the timeline. After application callbacks and field interpolations are done on the **done** state, the timeline transitions to the **idle** state. Application callbacks and field interpolations are done on this state as well.
* `Timeline.cancel()`. The timeline transitions to the **cancelled** state, preserving its current timeline position. After application callbacks and field interpolations are done on the **cancelled** state, the timeline transitions to the **idle** state. Application callbacks and field interpolations are done on this state as well.

In addition, there is a method to indicate that a looping timeline should stop once it reaches the end of the loop. For example, suppose that you have a pulsating animation of system tray icon to indicate unread messages. Once the message is read, this animation is canceled in the application code. However, immediate cancellation of the pulsating animation may result in jarring visuals, especially if it is done at the "peak" of the pulsation cycle. Calling `Timeline.cancelAtCycleBreak()` method will indicate that the looping animation should stop once it reaches the end of the loop.

### Tracking timeline state
Simple application scenarios create timelines, configure them with fields to interpolate and then play them. However, a more complicated application logic may require tracking the state changes of the timeline. The `Timeline.addCallback(TimelineCallback)` allows registering a custom callback that will be notified in the following cases:

* `TimelineCallback.onTimelineStateChanged()` - this is called whenever the **timeline state** is changed. For example, calling `Timeline.suspend()` will notify all the registered listeners that the timeline has changed its state from **playing** to **suspended**.
* `TimelineCallback.onTimelinePulse()` - this is called on every **timeline pulse**.

The second method can be used by applications that do not wish to add public setters for all the fields that participate in the timelines. Instead of using the `Timeline.Builder.addPropertyToInterpolate()` to [interpolate the fields](TimelineInterpolatingFields.md) via public setters, a timeline callback that interpolates the fields directly in the `onTimelinePulse()` can be used.
