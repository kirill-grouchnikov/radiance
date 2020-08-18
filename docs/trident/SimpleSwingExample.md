## Interpolating foreground color of a Swing button
The following example shows how to smoothly change the foreground color of a Swing button on mouse rollover. This example showcases a few Trident utilities that simplify animations on Swing controls.

```java
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import org.pushingpixels.trident.api.Timeline;

public class ButtonFg extends JFrame {
	public ButtonFg() {
		JButton button = new JButton("sample");
		button.setForeground(Color.blue);

		this.setLayout(new FlowLayout());
		this.add(button);

		Timeline rolloverTimeline = SwingComponentTimeline.componentBuilder(button)
				.addPropertyToInterpolate("foreground", Color.blue, Color.red)
				.setDuration(2500)
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

		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new ButtonFg().setVisible(true));
	}
}
```

* Lines 12-16 create a `JButton` with blue foreground color and add it to the center of the frame (setting the `FlowLayout`).
* Line 18 creates a new timeline associated with this button.
* Lines 19-20 specify that the timeline interpolates the button foreground color between blue and red.
* Lines 22-32 add a mouse listener to the button. When the mouse enters the button area, the timeline is played. When the mouse exits the button area, the timeline is played in reverse.

This example shows how the `JComponent.setForeground(Color)` method is used together with the built in property interpolator for the `java.awt.Color` class to run the timeline that interpolates the foreground color of a Swing button. Note that since the `JComponent.setForeground(Color)` also repaints the button, there is no need to explicitly repaint it on every timeline pulse.

If you debug this application and put a breakpoint in the `JComponent.setForeground(Color)` method, you will see that it is called on the [Event Dispatch Thread](http://www.javaworld.com/javaworld/jw-08-2007/jw-08-swingthreading.html). This is a built-in capability of the Trident core. It recognizes that the timeline is associated with a Swing component, and calls the setter method (during the timeline pulses) on the EDT.

Finally, since we are using the `Timeline.play()` and `Timeline.playReverse()` methods, the interpolation can be reversed in the middle if the user moves the mouse quickly. The rollover timeline in our example takes 2.5 seconds to complete. Suppose the user moves the mouse over the button, and then after one second moves the mouse away. The call to `playReverse` detects that this very timeline [is already playing](TimelineLifecycle.md), and starts playing it in reverse from its **current** position.
