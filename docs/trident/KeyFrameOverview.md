## Key frames

The sample application in [multiple timelines example](ParallelSwingTimelines.md) has the following basic timeline:

```java
this.rolloverTimeline = Timeline.builder(this)
    .addPropertyToInterpolate("backgroundColor", Color.yellow, Color.black)
    .build();
```

This creates a timeline that animates the `backgroundColor` field from yellow to black when the timeline is `play`ed. What if you want to animate this field from yellow to green, and then to black? One option is to create two timelines, one to animate from yellow to green, and another to animate from green to black. Since the second timeline needs to wait until the first one ends, you will have to either use the [timeline callbacks](TimelineLifecycle.md), or create a parallel [timeline scenario](TimelineScenarioIntroduction.md).

However, there is a simpler solution for interpolating the value of the specific field between more than two values - **key frames**. A key frame defines the value of the field at the particular [timeline duration fraction](TimelineAdditionalConfiguration.md) (**not** timeline position).

### Key times and key values

In our example, the timeline to interpolate the background color will have three key frames:

* The beginning key frame at key time `0.0f` with associated key value of `Color.yellow`
* The intermediate key frame at the matching key time (any value between `0.0f` and `1.0f` based on the application requirement) with associated key value of `Color.green`
* The ending key frame at key time `1.0f` with associated key value of `Color.black`

Each key frame has two mandatory associated properties: **key time** and **key value**. Key times must form a strictly increasing sequence that starts at `0.0f` and ends at `1.0f`. Key values must have either an explicit or an implicit [property interpolator](TimelineInterpolatingFields.md). This interpolator must be able to compute interpolated value for any successive pair of key values; this value should be of a class that can be passed to the public setter of the relevant property.

### Simple example

To put it all together, here is the definition of a key frame-driven timeline for the example above:

```java
KeyValues alphaValues = KeyValues.create(Color.yellow,
		Color.green, Color.black);
KeyTimes alphaTimes = new KeyTimes(0.0f, 0.5f, 1.0f);

this.rolloverTimeline = Timeline.builder(this)
    .addPropertyToInterpolate("backgroundColor", new KeyFrames(alphaValues, alphaTimes))
    .build();
```

Here, we specify that the `backgroundColor` starts at yellow, goes to green at half the **duration** of the timeline, and then goes to black at the end.
