
## Lumen - main window visuals

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/lumen/lumen-main.png" width="594" height="284" border=0>

Here is the code for painting the main content window (in `Stage0Base`). First, we store the current clip and enable anti-aliasing:

```java
@Override
protected void paintComponent(Graphics g) {
   Graphics2D g2d = (Graphics2D) g.create();
   Shape clip = g2d.getClip();

   g2d.setStroke(new BasicStroke(1.0f));
   g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
         RenderingHints.VALUE_ANTIALIAS_ON);
```
Next, we compute the outer and inner contours of the panel (the inner contour will be painted with slightly brighter colors as shown in the screenshot above):

```java
   int radius = 16;

   Shape contour = new RoundRectangle2D.Double(0, 0, getWidth() - 1,
         getHeight() - 1, radius, radius);
   Shape innerContour = new RoundRectangle2D.Double(1, 1, getWidth() - 3,
         getHeight() - 3, radius - 1, radius - 1);
```
When the main window is first shown and disposed, a special timeline is played to make the window appear and disappear smoothly. The timeline interpolates the alpha field between 0.0 and 0.9. The main panel has two parts – the bright blue header and the black content. While the content is painted based on the current value of alpha, the header uses less translucency:

```java
   g2d.setComposite(AlphaComposite.SrcOver.derive(1.0f - (float) Math.pow(
         1.0f - alpha, 3.0)));
```
To paint the header, we first update the current clip to make sure that the painting is only done in the header section. Next, we fill the contour, draw the inner contour and draw the outer contour – all based on the specific colors required by the target design:

```java
   // top part
   g2d.clipRect(0, 0, getWidth(), TITLE_HEIGHT);
   g2d.setPaint(new LinearGradientPaint(0, 0, 0, TITLE_HEIGHT,
         new float[] { 0.0f, 0.49999f, 0.5f, 1.0f }, new Color[] {
               new Color(119, 152, 251), new Color(80, 127, 250),
               new Color(48, 109, 250), new Color(10, 97, 250) }));
   g2d.fill(contour);
   g2d.setPaint(new GradientPaint(0, 0, new Color(151, 179, 253), 0,
         TITLE_HEIGHT, new Color(19, 92, 233)));
   g2d.draw(innerContour);
   g2d.setColor(new Color(11, 61, 200));
   g2d.draw(contour);
```
Now we restore the clip:

```java
   g2d.setClip(clip);
```
If we have an artist name to display, we position it in the middle of the title area (using font ascent for proper baseline alignment) and paint the string twice to create a lighting effect:

```java
   if (this.searchString != null) {
      NeonCortex.installDesktopHints(g2d, this);
      g2d.setFont(NeonCortex.getDefaultFontPolicy().getFontSet().
            getControlFont().deriveFont(14.0f).deriveFont(Font.BOLD));
      int fa = g2d.getFontMetrics().getAscent();
      int x = (getWidth() - g2d.getFontMetrics().stringWidth(
            this.searchString)) / 2;
      int y = (TITLE_HEIGHT + fa) / 2;
      g2d.setColor(new Color(31, 60, 114));
      g2d.drawString(this.searchString, x, y + 1);
      g2d.setColor(new Color(255, 255, 255));
      g2d.drawString(this.searchString, x, y);
   }
   ```

The main content area is painted in the same way as the header. We update the clip, fill the contour, draw the inner contour and draw the outer contour:

```java
   // bottom part
   g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha));
   g2d.clipRect(0, TITLE_HEIGHT, getWidth(), getHeight() - TITLE_HEIGHT + 1);

   g2d.setColor(new Color(0, 0, 0));
   g2d.fill(contour);
   g2d.setPaint(new GradientPaint(0, TITLE_HEIGHT, new Color(57, 56, 57),
         0, getHeight() - TITLE_HEIGHT, new Color(50, 48, 50)));
   g2d.draw(innerContour);
   g2d.setPaint(new GradientPaint(0, TITLE_HEIGHT, new Color(13, 11, 15),
         0, getHeight() - TITLE_HEIGHT, new Color(15, 8, 13)));
   g2d.draw(contour);
```
Finally, we draw a single line separator between the title and main content areas:

```java
   // separator
   g2d.setClip(clip);
   g2d.setColor(new Color(12, 11, 12));
   g2d.drawLine(1, TITLE_HEIGHT, getWidth() - 2, TITLE_HEIGHT);

   g2d.dispose();
}
```
