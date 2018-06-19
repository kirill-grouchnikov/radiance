## Timeline overview

**Timeline** is the most important concept in Trident. Here is a simple example that illustrates the basic timeline terms:

```java
import org.pushingpixels.trident.Timeline;

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

* Line 1 imports the `Timeline` class.
* Line 3 starts the definition of the test class.
* Line 4 defines a private float attribute of this class, and lines 6-9 specify a public setter for this attribute.
* Line 12 in the main method creates a new instance of our test class.
* Line 13 creates a new timeline associated with that instance.
* Line 14 specifies that the `value` attribute of that instance should be interpolated from 0 to 1 when the timeline is played.
* Line 15 plays the timeline.
* Lines 17-20 make sure that the application waits long enough for the timeline to finish playing

Here is the output of this application:
```
0.0 -> 0.0
0.0 -> 0.436
0.436 -> 0.514
0.514 -> 0.594
0.594 -> 0.672
0.672 -> 0.75
0.75 -> 0.828
0.828 -> 0.906
0.906 -> 0.984
0.984 -> 1.0
1.0 -> 1.0
```

Note that the actual numbers depend on the current system load. The setter is called by the timeline at timeline pulses. A **timeline pulse** is the point where the timeline "wakes up" and changes the values of all registered fields. The values are changed based on how much time has passed since the timeline has started playing.

The three basic timeline concepts illustrated in this sample are:
* A timeline is associated with an object.
* A timeline interpolates values of object fields using the public setters of the relevant class.
* The field values are changed at timeline pulses.
