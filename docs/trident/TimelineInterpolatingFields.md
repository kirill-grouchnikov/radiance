## Interpolating field values
A timeline allows changing field values of the associated object. For example, in a fade-in animation the timeline will interpolate the value of `alpha` field from `0.0` to `1.0`. There are two steps involved in setting up such timeline.

The first step is to create a `Timeline` instance passing the **main** object. The timeline is then configured to interpolate one or more fields of this main object. Let's see a simple example:

```java
public class HelloWorld {
   private float value;

   public void setValue(float newValue) {
      System.out.println(this.value + " -> " + newValue);
      this.value = newValue;
   }

   public static void main(String[] args) {
      HelloWorld helloWorld = new HelloWorld();
      Timeline timeline = new Timeline(helloWorld);
      timeline.addPropertyToInterpolate("value", 0.0f, 1.0f);
      timeline.play();

      try {
         Thread.sleep(3000);
      } catch (Exception exc) {
      }
   }
}
```

Here, the timeline created in line 11 has the associated `HelloWorld` instance. Line 12 instructs the timeline to interpolate the `value` field of that instance from `0.0` to `1.0` over the duration of the timeline.

There is an important assumption that the application code must honor. Each field added with the `addPropertyToInterpolate` **must** have the matching ##public## setter - see lines 4-7 in the example above.

A timeline can interpolate multiple fields. In the following example the timeline will change values of three fields at each timeline pulse:

```java
Timeline timeline = new Timeline(circle);
timeline.addPropertyToInterpolate("x", initX, finalX);
timeline.addPropertyToInterpolate("y", initY, finalY);
timeline.addPropertyToInterpolate("opacity", 1.0f, 0.0f);
```

### Configuring interpolation properties

The examples shown above interpolate the specified field from given start value to given end value. Application code that requires finer control over the field interpolation will use the following `Timeline` APIs:

* The static `Timeline.property(String)` method. This returns a `TimelinePropertyBuilder` object that is used to configure the different aspects of field interpolation - see below.
* Once the `TimelinePropertyBuilder` has been fully configured, pass it to the `Timeline.addPropertyToInterpolateTo(TimelinePropertyBuilder)` API.

Here is a code snippet that illustrates property builders in action:

```java
Timeline pulseCenters = new Timeline();
pulseCenters.addPropertyToInterpolate(
   Timeline.<Float> property("opacity").on(this.center1).from(0.0f).to(1.0f));
pulseCenters.addPropertyToInterpolate(
   Timeline.<Float> property("opacity").on(this.center2).from(0.0f).to(1.0f));
pulseCenters.addPropertyToInterpolate(
   Timeline.<Float> property("opacity").on(this.center3).from(0.0f).to(1.0f));
pulseCenters.setDuration(750);
pulseCenters.setEase(new Spline(0.9f));
pulseCenters.playLoop(RepeatBehavior.REVERSE);
```

Line 1 creates a new timeline not associated with any object. Lines 2-7 use three property builders to interpolate the `opacity` field on three separate objects (`center1`, `center2`, `center3`) from `0.0` to `1.0`. Lines 8-10 configure the [timeline duration and ease](TimelineAdditionalConfiguration.md), and play it in a reverse loop.

The following APIs are available on the `TimelinePropertyBuilder` class:
* `from(startValue)` and `to(endValue)` specify the start and end field values for the interpolation.
* `fromCurrent()` specifies that the field will be interpolated from its current value.
* `on(object)` passes the object whose field will be interpolated. The example above uses this API to interpolate fields of three different objects in one timeline.
* `goingThrough(key frames)` specifies the [key frames](KeyFrameOverview.md) to be used for multi-value interpolation sequence.
* `interpolatedWith(property interpolator)` specifies the property interpolator (see below) for field types not supported by the core library.
* `getWith(property getter)` specifies the method to use to get the field value.
* `setWith(property setter)` specifies the method to use to set the field value.
* `accessWith(property accessor)` specifies the method to use to access (get and set) the field value.

Here is another example of using the `TimelinePropertyBuilder` to interpolate the specific field from its ##current value## to the set end value:

```java
this.scrollTimeline = new Timeline(this);
this.scrollTimeline.addPropertyToInterpolate(
   Timeline.<Float> property("leadingPosition").
      fromCurrent().to(this.targetLeadingPosition));
this.scrollTimeline.setDuration(250);
```

### Custom property interpolators
Trident supports interpolation of primitive values - such as integers, floats and point / color / rectangle classes of [supported UI toolkits](TimelineAdditionalConfiguration.md). Application code that needs to interpolate fields of these types does not need to explicitly state how the field value is interpolated between the start / current and end value. In order to use a custom property interpolator, configure your `TimelinePropertyBuilder` with the call to `interpolatedWith(PropertyInterpolator)` API. The `org.pushingpixels.trident.interpolator.PropertyInterpolator` interface is:

```java
public interface PropertyInterpolator<T> {
   public Class getBasePropertyClass();

   public T interpolate(T from, T to, float timelinePosition);
}
```

The `interpolate` method is used at each [timeline pulse](TimelineOverview.md) to compute the interpolated value. Note that if the `TimelinePropertyBuilder` is not configured with a custom property setter (see below), the application is responsible to make sure that the object containing the interpolated field (either the main timeline object, or the one passed to `TimelinePropertyBuilder.on()` API) has a public setter accepting the interpolated value returned by the `interpolate` implementation of this property interpolator.

The `PropertyInterpolator.getBasePropertyClass` is not used when the application code explicitly sets a property interpolator on the timeline property builder - and it is safe to return any value (including `null`) from it. This method is used only during dynamic lookup of [custom property interpolators](CustomPropertyInterpolators.md).

### Custom property accessors

The default mechanism to retrieve and update the interpolated field is to use reflection to look up and call the matching published getter and setter. Application code that does not wish to expose these methods should use the following APIs:

* `TimelinePropertyBuilder.getWith(PropertyGetter)`
* `TimelinePropertyBuilder.setWith(PropertySetter)`
* `TimelinePropertyBuilder.accessWith(PropertyAccessor)`

Where the relevant interfaces are defined in the `TimelinePropertyBuilder` class as follows:

```java
public static interface PropertySetter<T> {
    public void set(Object obj, String fieldName, T value);
}

public static interface PropertyGetter<T> {
    public T get(Object obj, String fieldName);
}

public static interface PropertyAccessor<T> extends PropertyGetter<T>,
    PropertySetter<T> {
}
```

If the timeline property builder is configured with a custom property setter / accessor, the `set()` will be called at every [timeline pulse](TimelineOverview.md) passing the object, the name of the field and the new value to set on the field. If the timeline property builder is configured with a custom property getter / accessor, the `get()` will be called when the current value of the field is needed. For example, when the builder is configured with `fromCurrent()`, the `get()` will be called to get the current field value when the timeline starts playing.

The following sample shows usage of a custom property setter:

```java
public class CustomSetter {
   private float value;

   public static void main(String[] args) {
      final CustomSetter helloWorld = new CustomSetter();
      Timeline timeline = new Timeline(helloWorld);
      PropertySetter<Float> propertySetter = new PropertySetter<Float>() {
         @Override
         public void set(Object obj, String fieldName, Float value) {
            SimpleDateFormat sdf = new SimpleDateFormat("ss.SSS");
            float oldValue = helloWorld.value;
            System.out.println(sdf.format(new Date()) + " : " + oldValue
                  + " -> " + value);
            helloWorld.value = value;
         }
      };
      timeline.addPropertyToInterpolate(Timeline.<Float> property("value")
            .from(0.0f).to(1.0f).setWith(propertySetter));
      timeline.play();

      try {
         Thread.sleep(3000);
      } catch (Exception exc) {
      }
   }
}
```

Here, the `CustomSetter` class does not wish to expose the `value` field via a public setter. Instead, lines 7-16 define a custom property setter to be called on every timeline pulse. Note that while this sample code does update the matching object field, it is not a strict requirement. Your custom property setter can do anything it wants in the `set` implementation - update a key-value map, update multiple fields or even ignore some of the values altogether.

The following sample shows usage of a custom property accessor backed up by a key-value map:

```java
public class CustomAccessor {
   private Map<String, Float> values = new HashMap<String, Float>();

   public static void main(String[] args) {
      final CustomAccessor helloWorld = new CustomAccessor();
      Timeline timeline = new Timeline(helloWorld);

      PropertyAccessor<Float> propertyAccessor = new PropertyAccessor<Float>() {
         @Override
         public Float get(Object obj, String fieldName) {
            return helloWorld.values.get("value");
         }

         @Override
         public void set(Object obj, String fieldName, Float value) {
            SimpleDateFormat sdf = new SimpleDateFormat("ss.SSS");
            float oldValue = helloWorld.values.get("value");
            System.out.println(sdf.format(new Date()) + " : " + oldValue
                  + " -> " + value);
            helloWorld.values.put("value", value);
         }
      };
      helloWorld.values.put("value", 50f);

      timeline.addPropertyToInterpolate(Timeline.<Float> property("value")
            .fromCurrent().to(100.0f).accessWith(propertyAccessor));
      timeline.setDuration(300);
      timeline.play();

      try {
         Thread.sleep(1000);
      } catch (Exception exc) {
      }
   }
}
```

Note that both examples assume that the setter / accessor is used only for one specific field ("value"). You can use the same getter / setter / accessor implementation to access multiple fields - using the `fieldName` parameter passed to the `get()` and `set()` methods.
