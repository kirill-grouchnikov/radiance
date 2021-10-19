## Kotlin extensions and DSL for Radiance animations

It takes advantage of some of the Kotlin language features to reduce the amount of code needed to write Radiance-powered animations. Let's see a few examples.

We start with a "data" Java class
```java
public class SingleExplosion {
    float x;

    float y;

    float radius;

    float opacity;

    Color color;

    public SingleExplosion(Color color, float x, float y, float radius) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.opacity = 1.0f;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    public void paint(Graphics g) {
       ...
    }
}
```

There's a lot of boilerplate here around the setters - these are needed so that Radiance can animate object properties when a timeline is configured like this:

```java
SingleExplosion circle = new SingleExplosion(this.color, initX, initY,
        circleRadius);
Timeline timeline = Timeline.builder(circle)
        .addPropertyToInterpolate("x", initX, finalX)
        .addPropertyToInterpolate("y", initY, finalY)
        .addPropertyToInterpolate("opacity", 1.0f, 0.0f)
        .setDuration(duration - 200 + randomizer.nextInt(400))
        .setEase(new Spline(0.4f))
        .build();
```

The corresponding Kotlin code for the data class is:

```kotlin
class SingleExplosion(var color: Color, var x: Float, var y: Float, var radius: Float) {
    var opacity = 1.0f

    fun paint(g: Graphics) {
       ...
    }
}
```

and the timeline definition is:

```kotlin
val circle = SingleExplosion(this.color, initX, initY, circleRadius)
val timeline = circle.timeline {
    property(circle::x from initX to finalX)
    property(circle::y from initY to finalY)
    property(circle::opacity from 1.0f to 0.0f)
    duration = (durationTotal - 200 + randomizer.nextInt(400)).toLong()
    ease = Spline(0.4f)
}
```

What do we have here?

* Most of the data fields are declared only once in the class constructor. The remaining `opacity` field is still at the class level.
* No more setters - these are not needed as they are automatically provided in Kotlin.
* Timeline refers to the properties it needs to animate using [property references](https://kotlinlang.org/docs/reference/reflection.html#property-references) which provide compile-time safety - compared to string-based APIs in Radiance. This also comes from the extension `timeline` function being used in the `circle.timeline` line.

Let's see another example. Here is the Java side of things:

```java
public static class SnakePanelRectangle {
    private Color backgroundColor;
    private Timeline rolloverTimeline;
    private SwingRepaintTimeline repaintTimeline;

    public SnakePanelRectangle(SwingRepaintTimeline repaintTimeline) {
        this.backgroundColor = Color.black;

        this.rolloverTimeline = Timeline.builder(this)
                .addPropertyToInterpolate("backgroundColor", Color.yellow, Color.black)
                .setDuration(2500)
                .build();

        this.repaintTimeline = repaintTimeline;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        this.repaintTimeline.forceRepaintOnNextPulse();
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }
}
```

We have a timeline that animates a single `backgroundColor` property. The setter for that property also asks another timeline to force a repaint pass. And we also expose the property getter for the painting logic.

Here is how the corresponding code looks like in Kotlin with extensions:

```kotlin
class SnakePanelRectangle(private val repaintTimeline: SwingRepaintTimeline) {
    var backgroundColor: Color = Color.black

    private val rolloverTimeline = this.timeline {
        property(::backgroundColor from Color.yellow to Color.black)
        onTimelinePulse { _, _ -> repaintTimeline.forceRepaintOnNextPulse() }
        duration = 2500
    }
}
```

* There's no need for getter as that is provided by Kotlin for all class-level properties.
* Using compile-time safe way to refer to the property being animated (with `::backgroundColor`). This safety also comes from the extension `timeline` function that operates on `this` reference.
* Moving the associated setter logic into an `onTimelinePulse` of the timeline.
* And finally, everything has been folded to two class-level properties, with no need for an additional `init` block. We went from 25 lines in Java to 9 lines in Kotlin.

The last part could have been done in the original Java code as well - using `Timeline.Builder.addCallback()` API. However, it would mean bringing in the additional overhead that is associated with Java's anonymous inner classes. Let's see another example of where Kotlin and Radiance animation extensions make that easier to write and read.

Here is the Java definition of a timeline that animates multiple fields of the same object, and removes that object from a tracker list when the timeline is done:

```java
Timeline.builder(star)
        .addPropertyToInterpolate("x", currX, currX + distance * Math.cos(angle))
        .addPropertyToInterpolate("y", currY, currY + distance * Math.sin(angle))
        .addPropertyToInterpolate("alpha", 1.0f, 0.0f)
        .addPropertyToInterpolate("rotation", 0.0f,
                (float) (2 * Math.PI * Math.random()))
        .addPropertyToInterpolate("outerSpan", outerStartSpan, outerFinalSpan)
        .addPropertyToInterpolate("color", Color.white,
                new Color(Color.HSBtoRGB(currHue, 0.8f, 0.7f)))
        .addCallback(new TimelineCallbackAdapter() {
            @Override
            public void onTimelineStateChanged(TimelineState oldState,
                    TimelineState newState, float durationFraction,
                    float timelinePosition) {
                if (newState == TimelineState.DONE) {
                    // should be the last one in the list
                    synchronized (stars) {
                        stars.removeLast();
                    }
                }
            }
        })
        .setDuration(3000)
        .play();
```

and here is the matching Kotlin code:

```kotlin
star.timeline {
    property(star::x from currX to currX + distance * Math.cos(angle))
    property(star::y from currY to currY + distance * Math.sin(angle))
    property(star::alpha from 1.0f to 0.0f)
    property(star::rotation from 0.0f to (2.0 * Math.PI * Math.random()).toFloat())
    property(star::outerSpan from outerStartSpan to outerFinalSpan)
    property(star::color from Color.white to Color(Color.HSBtoRGB(currHue, 0.8f, 0.7f)))
    onTimelineDone {
        // should be the last one in the list
        synchronized(stars) {
            stars.removeLast()
        }
    }
    duration = 3000
}.play()
```

Note how much unnecessary syntactic overhead has been removed - compare the `addCallback` lines in the Java version and the `onTimelineDone` lines in the Kotlin version.

Another example of how Radiance animation extensions make the timeline code easier to follow. This is Java code that animates properties on different objects:

```java
Timeline.builder()
        .addPropertyToInterpolate(Timeline.<Float>property("opacity")
                .on(this.center1).from(0.0f).to(1.0f))
        .addPropertyToInterpolate(Timeline.<Float>property("opacity")
                .on(this.center2).from(0.0f).to(1.0f))
        .addPropertyToInterpolate(Timeline.<Float>property("opacity")
                .on(this.center3).from(0.0f).to(1.0f))
        .setDuration(750)
        .setEase(new Spline(0.9f))
        .playLoop(RepeatBehavior.REVERSE);
```

and here is the corresponding Kotlin version:

```kotlin
timeline {
    property(center1::opacity from 0.0f to 1.0f)
    property(center2::opacity from 0.0f to 1.0f)
    property(center3::opacity from 0.0f to 1.0f)
    duration = 750
    ease = Spline(0.9f)
}.playLoop(RepeatBehavior.REVERSE)
```

which makes it easier to see that the same `opacity` property is being animated on three different objects - in a compile-time safe manner that would be flagged much earlier if there is a typo in any of the object / property names.

One more example is how compact the code to fade out and dismiss a top-level `Window` is:

```kotlin
window.windowTimeline {
    property(RadianceWindow.opacity from 1.0f to 0.0f)
    onTimelineDone { window.dispose() }
    duration = timeInMs
}.play()
```

Here we're using the synthetic property accessor for interpolating the window opacity from 1.0f (full opacity) to 0.0f (full transparency), combined with calling `Window.dispose()` when the timeline is done.
