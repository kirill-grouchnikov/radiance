## Simple Swing timeline scenario

The following example shows a Swing application with a simple [timeline scenario](TimelineScenarioIntroduction.md) that launches five parallel timelines. It shows the code behind [this video](http://vimeo.com/3401957), where every volley is a separate timeline, and all currently playing volleys are part of the same timeline scenario.

In the code, there are three "hierarchy" levels of fireworks:
* The entire fireworks display - this is a timeline scenario that consists of five volley explosions.
* The volley explosion implemented in `VolleyExplosion` class - this is a collection of single explosions that have the same color and originate from the same explosion center point.
* The single explosion implemented in `SingleExplosion` class - this is a fading circle that represents a single "leaf" part of the volley explosion.

The code behind the single explosion is quite simple:

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
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setComposite(AlphaComposite.SrcOver.derive(this.opacity));
			g2d.setColor(this.color);
			g2d.fill(new Ellipse2D.Float(this.x - this.radius, this.y
					- this.radius, 2 * radius, 2 * radius));
			g2d.dispose();
		}
	}
```

It has four fields (lines 2-10) that specify its location, size, opacity and color. Each field except the color has a public setter that is used in the timeline created in the parent volley explosion (lines 20-34). Finally, it has a custom painting implementation that paints the graphical representation of the single volley (lines 36-45).

The volley explosion is implemented by the following class:
```java
	public class VolleyExplosion {
		private int x;

		private int y;

		private Color color;

		private Set<SingleExplosion> circles;

		public VolleyExplosion(int x, int y, Color color) {
			this.x = x;
			this.y = y;
			this.color = color;
			this.circles = new HashSet<SingleExplosion>();
		}

		public TimelineScenario getExplosionScenario() {
			TimelineScenario scenario = new TimelineScenario.Parallel();

			int duration = 1000 + (int) (1000 * Math.random());
			for (int i = 0; i < 18; i++) {
				float dist = (float) (50 + 10 * Math.random());
				float radius = (float) (2 + 2 * Math.random());
				for (float delta = 0.6f; delta <= 1.0f; delta += 0.2f) {
					float circleRadius = radius * delta;

					double degrees = 20.0 * (i + Math.random());
					float radians = (float) (2.0 * Math.PI * degrees / 360.0);

					float initDist = delta * dist / 10.0f;
					float finalDist = delta * dist;
					float initX = (float) (this.x + initDist
							* Math.cos(radians));
					float initY = (float) (this.y + initDist
							* Math.sin(radians));
					float finalX = (float) (this.x + finalDist
							* Math.cos(radians));
					float finalY = (float) (this.y + finalDist
							* Math.sin(radians));

					SingleExplosion circle = new SingleExplosion(this.color,
							initX, initY, circleRadius);
					Timeline timeline = Timeline.builder(circle)
							.addPropertyToInterpolate("x", initX, finalX)
							.addPropertyToInterpolate("y", initY, finalY)
							.addPropertyToInterpolate("opacity", 1.0f, 0.0f)
							.setDuration(duration - 200 + randomizer.nextInt(400))
							.setEase(new Spline(0.4f))
							.build();

					synchronized (this.circles) {
						circles.add(circle);
					}
					scenario.addScenarioActor(timeline);
				}
			}

			return scenario;
		}

		public void paint(Graphics g) {
			synchronized (this.circles) {
				for (SingleExplosion circle : this.circles) {
					circle.paint(g);
				}
			}
		}
	}
```

A quick walkthrough:
* Lines 2-6 specify the fields that store the center and the color of the explosion.
* Line 8 specifies the set that stores all the single explosions of this volley explosion.
* Lines 17-59 return a timeline scenario that implements this volley explosion:
** Line 18 creates a parallel timeline. **Each** single explosion is implemented as a separate timeline.
** Line 20 computes a random duration for this scenario.
** Lines 21 and 24 create 54 single explosions.
** Lines 21, 27 and 28 create single explosions at almost evenly distributed angles (every 20 degrees).
** Lines 22, 24 and 30-39 create single explosions at almost evenly distributed distance from the center (three for each angle).
** Lines 41-42 create the `SingleExplosion` object.
** Lines 43-49 create the timeline that interpolates the relevant properties of that object. Each timeline has a random duration.
** Line 54 adds the created timeline to the scenario.
* The scenario returned on line 58 has 54 different timelines, one for each single explosion.
* Lines 61-67 paint all the single explosions of this volley explosion.

Now we get to the main application class. It implements the following functionality:
* Playing five explosion volleys (five timeline scenarios).
* Waiting for all five to be done.
* Playing another five - repeating the previous two steps.
* Listening to the mouse events, suspending the currently playing scenarios on mouse press, and resuming them on mouse release.

The code starts by declaring the relevant data structures:
```java
public class Fireworks extends JFrame {
	private Set<VolleyExplosion> volleys;

	private Map<VolleyExplosion, TimelineScenario> volleyScenarios;

	private JPanel mainPanel;
```

Here is the constructor of this class:
```java
public Fireworks() {
   super("Swing Fireworks");

   this.mainPanel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         synchronized (volleys) {
            for (VolleyExplosion exp : volleys)
               exp.paint(g);
         }
      }
   };
   this.mainPanel.setBackground(Color.black);
   this.mainPanel.setPreferredSize(new Dimension(480, 320));

   SwingRepaintTimeline.repaintBuilder(this).playLoop(RepeatBehavior.LOOP);

   this.volleys = new HashSet<VolleyExplosion>();
   this.volleyScenarios = new HashMap<VolleyExplosion, TimelineScenario>();

   this.mainPanel.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
         synchronized (volleys) {
            for (TimelineScenario scenario : volleyScenarios.values())
               scenario.suspend();
         }
      }

      @Override
      public void mouseReleased(MouseEvent e) {
         synchronized (volleys) {
            for (TimelineScenario scenario : volleyScenarios.values())
               scenario.resume();
         }
      }
   });

   mainPanel.addComponentListener(new ComponentAdapter() {
      @Override
      public void componentResized(ComponentEvent e) {
        if ((mainPanel.getWidth() == 0) || (mainPanel.getHeight() == 0))
            return;
        new Thread(() -> {
 	        while (true) {
		       	addExplosions(5);
	        }
        }).start();
      }
   });

   this.add(mainPanel);
   this.pack();
   this.setLocationRelativeTo(null);
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
```

* Lines 4-15 create a `JPanel` that paints all currently playing volley explosions on black background.
* Lines 17-18 create a looping timeline that repaints the contents of this application.
* Lines 20-21 create the data structures tracking the currently playing explosions.
* Lines 23-39 add the mouse listener that suspends the currently playing scenarios on mouse press and resumes them on mouse release.
* Lines 41-55 register a listener that checks the size of the panel. When the panel has a non-zero size, the listener creates and runs a thread that adds five explosions in an infinite loop (see the explanation of `addExplosions` below)
* Lines 57-60 configure the application hierarchy and location

Here is the method that makes sure that the volley explosions are run in batches of 5, even when they have different durations:

```java
	private void addExplosions(int count) {
		final CountDownLatch latch = new CountDownLatch(count);

		for (int i = 0; i < count; i++) {
			int r = (int) (255 * Math.random());
			int g = (int) (100 + 155 * Math.random());
			int b = (int) (50 + 205 * Math.random());
			Color color = new Color(r, g, b);

			int x = 60 + (int) ((mainPanel.getWidth() - 120) * Math.random());
			int y = 60 + (int) ((mainPanel.getHeight() - 120) * Math.random());
			final VolleyExplosion exp = new VolleyExplosion(x, y, color);
			synchronized (volleys) {
				volleys.add(exp);
				TimelineScenario scenario = exp.getExplosionScenario();
				scenario.addCallback(new TimelineScenarioCallback() {
					@Override
					public void onTimelineScenarioDone() {
						synchronized (volleys) {
							volleys.remove(exp);
							volleyScenarios.remove(exp);
							latch.countDown();
						}
					}
				});
				volleyScenarios.put(exp, scenario);
				scenario.play();
			}
		}

		try {
			latch.await();
		} catch (Exception exc) {
		}
	}
```

* Line 2 creates a `CountDownLatch` that will be used to wait until all timeline scenarios that run the volley explosions are done
* Lines 5-8 compute a random color for each one of the volley explosions
* Lines 10-11 compute a random center location for each one of the volley explosions
* Line 12 creates a new `VolleyExplosion` object
* Line 15 creates the timeline scenario that corresponds to this object
* Lines 16-25 add a callback that notifies the count down latch when the timeline scenario is done
* Line 27 plays the timeline scenario
* Lines 31-34 wait on the count down latch - until **all** timeline scenarios are done

And finally, the main method to launch the fireworks:

```java
public static void main(String[] args) {
	SwingUtilities.invokeLater(() -> new Fireworks().setVisible(true));
}
```
