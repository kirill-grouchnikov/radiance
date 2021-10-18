## Property interpolators

Radiance Animation supports interpolation of primitive values - such as integers, floats and point / color / rectangle classes of supported [UI toolkits](UIToolkitSupport.md). Application code that needs to interpolate fields of these types does not need to explicitly state how the field value is interpolated between the start / current and end value. For other field types the application code can either register custom property interpolators, or [explicitly state](TimelineInterpolatingFields.md) the property interpolator to be used for computing the field value.

For both cases the application code needs to provide one or more implementations of the `PropertyInterpolator` interface. This interface has two methods.

The `public Class getBasePropertyClass()` is used to choose the property interpolator in the `Timeline.addPropertyToInterpolate(String, Object, Object)`. Internally, all registered property interpolators are queried to check whether they support the specified *from* and *to* values using the `Class.isAssignableFrom(Class)`. The **first** property interpolator that has a match for both values will be used.

For example, the `PointInterpolator` in the core AWT property interpolator source (`AWTPropertyInterpolators` class) has the following implementation of this method:

```java
	@Override
	public Class getBasePropertyClass() {
		return Point.class;
	}
```

The `public T interpolate(T from, T to, float timelinePosition)` is used to compute the interpolated value during the current timeline pulse. For example, the `PointInterpolator` in the core AWT property interpolator source (`AWTPropertyInterpolators` class) has the following implementation of this method:

```java
	public Point interpolate(Point from, Point to, float timelinePosition) {
		int x = from.x + (int) (timelinePosition * (to.x - from.x));
		int y = from.y + (int) (timelinePosition * (to.y - from.y));
		return new Point(x, y);
	}
```

### Registering custom property interpolators

`TimelinePropertyBuilder.interpolatedWith(PropertyInterpolator)` API can be used to explicitly state the property interpolator to be used for the specific property. However, using this API may lead to a lot of boilerplate code in applications that have multiple animations of fields of the same custom type. In such cases it is recommended to register custom property interpolators and have Radiance Animation automatically pick up the matching interpolator at runtime. Radiance provides two ways to register custom interpolators - customization APIs and plugins.

The `RadianceAnimationCortex` class has the following APIs to work with property interpolators:

* `addPropertyInterpolatorSource(PropertyInterpolatorSource)` - registers all the property interpolators provided by this source
* `addPropertyInterpolator(PropertyInterpolator)` - registers the property interpolator
* `removePropertyInterpolator(PropertyInterpolator)` - unregisters the property interpolator
* `getPropertyInterpolators()` - retrieves an unmodifiable list of all registered (core and custom) property interpolators
* `getPropertyInterpolator(Object...)` - retrieves the first property interpolator that matches all the passed objects, or `null` if no match is found

The **PropertyInterpolatorSource** interface can be used by application code to provide property interpolators for custom application classes. This interface has one method:
```java
public Set<PropertyInterpolator> getPropertyInterpolators()
```
which returns a set of custom property interpolators. Custom property interpolators can be used in two ways:

* The `Timeline.Builder.addPropertyToInterpolate(String, Object, Object)` API that will choose the property interpolator that matches the types of the ''from'' and ''to'' values
* Use a [timeline property builder](TimelineInterpolatingFields.md) and the `TimelinePropertyBuilder.interpolatedWith()` API. The `Timeline.Builder.addPropertyToInterpolate(TimelinePropertyBuilder)` API will use the specified property interpolator

### Bringing it together

Let's look at the following Swing example that moves a red rectangle in an infinite loop:

```java
public class MovingRectangle extends JFrame {
   public static class MyRectangle {
      private Point corner = new Point(0, 0);

      public void setCorner(Point corner) {
         this.corner = corner;
      }

      void paint(Graphics g) {
         g.setColor(Color.red);
         g.fillRect(this.corner.x, this.corner.y, 100, 100);
      }
   }

   public MovingRectangle() {
      super("Moving rectangle");
      final MyRectangle rectangle = new MyRectangle();
      JPanel panel = new JPanel() {
         @Override
         protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            rectangle.paint(g);
         }
      };

      Timeline.builder(rectangle)
          .addPropertyToInterpolate("corner", new Point(0, 0), new Point(100, 80))
          .setDuration(2000)
          .playLoop(RepeatBehavior.REVERSE);

      SwingRepaintTimeline.repaintTimeline(panel).playLoop(RepeatBehavior.LOOP);

      this.add(panel);
      this.setSize(200, 200);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new MovingRectangle().setVisible(true);
         }
      });
   }
}
```

What happens in lines 35-36? Internally, the Animation core looks at all available property interpolators and finds that the `AWTPropertyInterpolators.PointInterpolator` is the best match for the passed values (which are both `java.awt.Point`s). Then, at every pulse of the `move` timeline, the `MyRectangle.setCorner(Point)` is called.

Note that the application code **did not** explicitly specify which property interpolator should be used. The following class illustrates the usage of `RadianceAnimationCortex.addPropertyInterpolator` API:

```java
public class CustomPropertyInterpolatorSource extends JFrame {
   private Ellipse2D ellipse;

   private static class Ellipse2DPropertyInterpolator implements
         PropertyInterpolator<Ellipse2D> {
      public Class getBasePropertyClass() {
         return Ellipse2D.class;
      }

      @Override
      public Ellipse2D interpolate(Ellipse2D from, Ellipse2D to,
            float timelinePosition) {
         double x = from.getX() + timelinePosition
               * (to.getX() - from.getX());
         double y = from.getY() + timelinePosition
               * (to.getY() - from.getY());
         double w = from.getWidth() + timelinePosition
               * (to.getWidth() - from.getWidth());
         double h = from.getHeight() + timelinePosition
               * (to.getHeight() - from.getHeight());
         return new Ellipse2D.Double(x, y, w, h);
      }
   }

   public CustomPropertyInterpolatorSource() {
      RadianceAnimationCortex.addPropertyInterpolator(
            new Ellipse2DPropertyInterpolator());

      Ellipse2D from = new Ellipse2D.Double(10, 10, 100, 50);
      Ellipse2D to = new Ellipse2D.Double(40, 40, 200, 120);
      this.ellipse = (Ellipse2D) from.clone();
      JPanel ellipsePanel = new JPanel() {
         @Override
         protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                  RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.red);
            g2d.fill(ellipse);

            g2d.dispose();
         }
      };
      ellipsePanel.setBackground(Color.black);

      SwingComponentTimeline.componentBuilder(this)
          .addPropertyToInterpolate("ellipse", from, to)
          .setEase(new Sine())
          .setDuration(2000)
          .playLoop(RepeatBehavior.REVERSE);

      SwingRepaintTimeline.repaintBuilder(ellipsePanel).playLoop(RepeatBehavior.LOOP);

      this.add(ellipsePanel);

      this.setSize(400, 300);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void setEllipse(Ellipse2D ellipse) {
      this.ellipse = ellipse;
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new CustomPropertyInterpolatorSource().setVisible(true));
   }
}
```

Here, the registered property interpolator is implicitly used to animate the expanding / shrinking ellipse.
