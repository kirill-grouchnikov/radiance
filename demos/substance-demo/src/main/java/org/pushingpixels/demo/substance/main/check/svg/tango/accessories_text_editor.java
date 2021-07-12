package org.pushingpixels.demo.substance.main.check.svg.tango;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class accessories_text_editor implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private NeonIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.02417561039328575f, 0.0f, 0.0f, 0.02086758054792881f, 45.12765121459961f, 40.15359878540039f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0
shape = new Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375);
paint = new LinearGradientPaint(new Point2D.Double(302.8571472167969, 366.64788818359375), new Point2D.Double(302.8571472167969, 609.5050659179688), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-219.61876f, -150.68037f);
generalPath.curveTo(-219.61876f, -150.68037f, -219.61876f, 327.65042f, -219.61876f, 327.65042f);
generalPath.curveTo(-76.74459f, 328.55087f, 125.78146f, 220.48074f, 125.78138f, 88.45424f);
generalPath.curveTo(125.78138f, -43.572304f, -33.655437f, -150.68036f, -219.61876f, -150.68037f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-1559.2523f, -150.68037f);
generalPath.curveTo(-1559.2523f, -150.68037f, -1559.2523f, 327.65042f, -1559.2523f, 327.65042f);
generalPath.curveTo(-1702.1265f, 328.55087f, -1904.6525f, 220.48074f, -1904.6525f, 88.45424f);
generalPath.curveTo(-1904.6525f, -43.572304f, -1745.2157f, -150.68036f, -1559.2523f, -150.68037f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.16387f, 4.5063725f);
generalPath.lineTo(39.81312f, 4.5063725f);
generalPath.curveTo(40.5757f, 4.5063725f, 41.189613f, 5.038824f, 41.189613f, 5.70021f);
generalPath.curveTo(41.189613f, 5.70021f, 43.590946f, 39.868908f, 43.590946f, 39.868908f);
generalPath.curveTo(43.590946f, 39.868908f, 43.6034f, 42.21653f, 43.6034f, 42.21653f);
generalPath.curveTo(43.6034f, 42.877914f, 42.989487f, 43.410366f, 42.22691f, 43.410366f);
generalPath.lineTo(4.750081f, 43.410366f);
generalPath.curveTo(3.9875042f, 43.410366f, 3.3735888f, 42.877914f, 3.3735888f, 42.21653f);
generalPath.lineTo(3.3624172f, 40.049614f);
generalPath.lineTo(5.7873774f, 5.70021f);
generalPath.curveTo(5.7873774f, 5.038824f, 6.4012933f, 4.5063725f, 7.16387f, 4.5063725f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.04348373413086, 42.833370208740234), new Point2D.Double(14.283641815185547, 6.833368301391602), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(223, 223, 223, 255)) : new Color(223, 223, 223, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1378710269927979f, 0.0f, 0.0f, 1.0f, -2.660883903503418f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(26.612417221069336, 28.0833683013916), new Point2D.Double(26.22840118408203, 42.833370208740234), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(147, 147, 147, 255)) : new Color(147, 147, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 66, 66, 255)) : new Color(66, 66, 66, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.9999998f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.16387f, 4.5063725f);
generalPath.lineTo(39.81312f, 4.5063725f);
generalPath.curveTo(40.5757f, 4.5063725f, 41.189613f, 5.038824f, 41.189613f, 5.70021f);
generalPath.curveTo(41.189613f, 5.70021f, 43.590946f, 39.868908f, 43.590946f, 39.868908f);
generalPath.curveTo(43.590946f, 39.868908f, 43.6034f, 42.21653f, 43.6034f, 42.21653f);
generalPath.curveTo(43.6034f, 42.877914f, 42.989487f, 43.410366f, 42.22691f, 43.410366f);
generalPath.lineTo(4.750081f, 43.410366f);
generalPath.curveTo(3.9875042f, 43.410366f, 3.3735888f, 42.877914f, 3.3735888f, 42.21653f);
generalPath.lineTo(3.3624172f, 40.049614f);
generalPath.lineTo(5.7873774f, 5.70021f);
generalPath.curveTo(5.7873774f, 5.038824f, 6.4012933f, 4.5063725f, 7.16387f, 4.5063725f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.31578943f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.61661297082901f, 0.0f, 0.0f, 0.4403670132160187f, 10.614250183105469f, 13.942660331726074f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.125f, 40.4375f);
generalPath.curveTo(43.15635f, 42.878628f, 39.434628f, 45.13901f, 33.36909f, 46.36274f);
generalPath.curveTo(27.303555f, 47.586468f, 19.821445f, 47.586468f, 13.755908f, 46.36274f);
generalPath.curveTo(7.690371f, 45.13901f, 3.9686508f, 42.878628f, 4.0f, 40.4375f);
generalPath.curveTo(3.9686508f, 37.996372f, 7.690371f, 35.73599f, 13.755908f, 34.51226f);
generalPath.curveTo(19.821445f, 33.288532f, 27.303555f, 33.288532f, 33.36909f, 34.51226f);
generalPath.curveTo(39.434628f, 35.73599f, 43.15635f, 37.996372f, 43.125f, 40.4375f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(23.5625, 40.4375), 19.5625f, new Point2D.Double(23.5625, 40.4375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.34824299812316895f, 1.4398179704316877E-16f, 26.355430603027344f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
shape = new RoundRectangle2D.Double(3.977037191390991, 39.86827087402344, 39.04807662963867, 3.0714950561523438, 1.3587572574615479, 1.3587572574615479);
paint = (colorFilter != null) ? colorFilter.filter(new Color(164, 164, 164, 255)) : new Color(164, 164, 164, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(3.9267507f, 40.442795f);
generalPath.curveTo(3.9267507f, 40.442795f, 4.0776124f, 39.912464f, 4.6307726f, 39.86827f);
generalPath.lineTo(42.195374f, 39.86827f);
generalPath.curveTo(42.949684f, 39.86827f, 42.99997f, 40.61957f, 42.99997f, 40.61957f);
generalPath.curveTo(42.99997f, 40.61957f, 43.02357f, 39.0f, 41.7161f, 39.0f);
generalPath.lineTo(5.304216f, 39.0f);
generalPath.curveTo(4.29847f, 39.088387f, 3.9267507f, 39.779884f, 3.9267507f, 40.442795f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.25f, 5.734375f);
generalPath.lineTo(6.0f, 10.125f);
generalPath.curveTo(6.0f, 10.125f, 6.3125f, 9.0f, 7.0f, 9.0f);
generalPath.lineTo(40.125f, 9.0f);
generalPath.curveTo(40.828125f, 8.984375f, 40.859375f, 9.3125f, 40.984375f, 9.828125f);
generalPath.curveTo(40.984375f, 9.828125f, 40.734375f, 5.953125f, 40.734375f, 5.953125f);
generalPath.curveTo(40.703125f, 5.40625f, 40.515625f, 5.0f, 39.953125f, 5.0f);
generalPath.lineTo(7.0625f, 5.0f);
generalPath.curveTo(6.609375f, 5.0f, 6.296875f, 5.34375f, 6.25f, 5.734375f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(6.0, 7.5625), new Point2D.Double(40.984375, 7.5625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(163, 164, 160, 255)) : new Color(163, 164, 160, 255)),((colorFilter != null) ? colorFilter.filter(new Color(136, 138, 133, 255)) : new Color(136, 138, 133, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.4385965f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.99999946f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.8126473f, 5.54045f);
generalPath.lineTo(38.944984f, 5.54045f);
generalPath.curveTo(39.66702f, 5.54045f, 40.2483f, 5.388346f, 40.2483f, 6.014572f);
generalPath.curveTo(40.2483f, 6.014572f, 42.521973f, 39.023075f, 42.521973f, 39.023075f);
generalPath.curveTo(42.521973f, 39.023075f, 42.622154f, 41.732033f, 42.622154f, 41.732033f);
generalPath.curveTo(42.622154f, 42.358257f, 42.48282f, 42.37627f, 41.76078f, 42.37627f);
generalPath.lineTo(4.8620443f, 42.37627f);
generalPath.curveTo(4.449366f, 42.37627f, 4.442611f, 42.26987f, 4.442611f, 41.864616f);
generalPath.lineTo(4.432034f, 39.194176f);
generalPath.lineTo(6.7280807f, 6.045822f);
generalPath.curveTo(6.7280807f, 5.419596f, 7.09061f, 5.54045f, 7.8126473f, 5.54045f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7_0
shape = new RoundRectangle2D.Double(8.5, 2.5, 2.0, 5.0, 2.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(252, 233, 79, 255)) : new Color(252, 233, 79, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 111, 0, 255)) : new Color(136, 111, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(8.5, 2.5, 2.0, 5.0, 2.0, 2.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7_1
shape = new RoundRectangle2D.Double(12.5, 2.5, 2.0, 5.0, 2.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(252, 233, 79, 255)) : new Color(252, 233, 79, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 111, 0, 255)) : new Color(136, 111, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(12.5, 2.5, 2.0, 5.0, 2.0, 2.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7_2
shape = new RoundRectangle2D.Double(16.5, 2.5, 2.0, 5.0, 2.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(252, 233, 79, 255)) : new Color(252, 233, 79, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 111, 0, 255)) : new Color(136, 111, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(16.5, 2.5, 2.0, 5.0, 2.0, 2.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7_3
shape = new RoundRectangle2D.Double(20.5, 2.5, 2.0, 5.0, 2.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(252, 233, 79, 255)) : new Color(252, 233, 79, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 111, 0, 255)) : new Color(136, 111, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(20.5, 2.5, 2.0, 5.0, 2.0, 2.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7_4
shape = new RoundRectangle2D.Double(24.5, 2.5, 2.0, 5.0, 2.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(252, 233, 79, 255)) : new Color(252, 233, 79, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 111, 0, 255)) : new Color(136, 111, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(24.5, 2.5, 2.0, 5.0, 2.0, 2.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7_5
shape = new RoundRectangle2D.Double(28.5, 2.5, 2.0, 5.0, 2.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(252, 233, 79, 255)) : new Color(252, 233, 79, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 111, 0, 255)) : new Color(136, 111, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(28.5, 2.5, 2.0, 5.0, 2.0, 2.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7_6
shape = new RoundRectangle2D.Double(32.5, 2.5, 2.0, 5.0, 2.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(252, 233, 79, 255)) : new Color(252, 233, 79, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 111, 0, 255)) : new Color(136, 111, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(32.5, 2.5, 2.0, 5.0, 2.0, 2.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7_7
shape = new RoundRectangle2D.Double(36.5, 2.5, 2.0, 5.0, 2.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(252, 233, 79, 255)) : new Color(252, 233, 79, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 111, 0, 255)) : new Color(136, 111, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(36.5, 2.5, 2.0, 5.0, 2.0, 2.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
g.setComposite(AlphaComposite.getInstance(3, 0.28070176f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8_0
shape = new Rectangle2D.Double(9.0, 12.0, 29.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.28070176f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8_1
shape = new Rectangle2D.Double(9.0, 14.981792449951172, 29.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.28070176f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8_2
shape = new Rectangle2D.Double(9.0, 18.003938674926758, 13.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.28070176f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8_3
shape = new Rectangle2D.Double(9.0, 22.98573112487793, 29.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.28070176f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8_4
shape = new Rectangle2D.Double(9.0, 26.007877349853516, 29.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.28070176f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8_5
shape = new Rectangle2D.Double(9.0, 29.0300235748291, 29.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.28070176f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8_6
shape = new Rectangle2D.Double(9.0, 32.05216979980469, 8.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.34116f, 32.5f);
generalPath.lineTo(22.96616f, 26.875f);
generalPath.lineTo(43.05991f, 17.125f);
generalPath.curveTo(46.30991f, 15.875f, 48.24741f, 20.5f, 45.37241f, 22.125f);
generalPath.lineTo(25.34116f, 31.5f);
generalPath.lineTo(17.34116f, 32.5f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(203, 144, 34, 255)) : new Color(203, 144, 34, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(92, 65, 12, 255)) : new Color(92, 65, 12, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.34116f, 32.5f);
generalPath.lineTo(22.96616f, 26.875f);
generalPath.lineTo(43.05991f, 17.125f);
generalPath.curveTo(46.30991f, 15.875f, 48.24741f, 20.5f, 45.37241f, 22.125f);
generalPath.lineTo(25.34116f, 31.5f);
generalPath.lineTo(17.34116f, 32.5f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.330708f, 20.0f);
generalPath.curveTo(38.330708f, 20.0f, 39.768208f, 20.09375f, 40.330708f, 21.34375f);
generalPath.curveTo(40.910202f, 22.631512f, 40.330708f, 24.0f, 40.330708f, 24.0f);
generalPath.lineTo(45.361958f, 21.53125f);
generalPath.curveTo(45.361958f, 21.53125f, 46.81399f, 20.649883f, 46.018208f, 18.6875f);
generalPath.curveTo(45.233295f, 16.751923f, 43.330708f, 17.53125f, 43.330708f, 17.53125f);
generalPath.lineTo(38.330708f, 20.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(48.90625, 17.376184463500977), new Point2D.Double(50.98833465576172, 22.250591278076172), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 209, 209, 255)) : new Color(255, 209, 209, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 29, 29, 255)) : new Color(255, 29, 29, 255)),((colorFilter != null) ? colorFilter.filter(new Color(111, 0, 0, 255)) : new Color(111, 0, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -5.669291973114014f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.330708f, 20.0f);
generalPath.curveTo(38.330708f, 20.0f, 39.768208f, 20.09375f, 40.330708f, 21.34375f);
generalPath.curveTo(40.910202f, 22.631512f, 40.330708f, 24.0f, 40.330708f, 24.0f);
generalPath.lineTo(42.330708f, 23.0f);
generalPath.curveTo(42.330708f, 23.0f, 43.15774f, 21.681133f, 42.549458f, 20.3125f);
generalPath.curveTo(41.924458f, 18.90625f, 40.330708f, 19.0f, 40.330708f, 19.0f);
generalPath.lineTo(38.330708f, 20.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(46.0, 19.8125), new Point2D.Double(47.6875, 22.625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(193, 193, 193, 255)) : new Color(193, 193, 193, 255)),((colorFilter != null) ? colorFilter.filter(new Color(172, 172, 172, 255)) : new Color(172, 172, 172, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -5.669291973114014f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.768208f, 31.78125f);
generalPath.lineTo(23.268208f, 27.28125f);
generalPath.curveTo(24.768208f, 28.09375f, 25.549458f, 29.4375f, 25.143208f, 31.0f);
generalPath.lineTo(18.768208f, 31.78125f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(29.053354263305664, 27.640750885009766), 3.2408545f, new Point2D.Double(29.053354263305664, 27.640750885009766), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(231, 226, 184, 255)) : new Color(231, 226, 184, 255)),((colorFilter != null) ? colorFilter.filter(new Color(231, 226, 184, 0)) : new Color(231, 226, 184, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.923564910888672f, -3.911409026357343E-24f, 2.471768955448662E-23f, 2.029716968536377f, -61.555320739746094f, -27.884170532226562f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.111958f, 30.375f);
generalPath.lineTo(18.486958f, 31.96875f);
generalPath.lineTo(20.830708f, 31.65625f);
generalPath.curveTo(21.049458f, 30.9375f, 20.643208f, 30.59375f, 20.111958f, 30.375f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.71875, 31.046875), new Point2D.Double(25.514589309692383, 30.703125), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(201, 201, 201, 255)) : new Color(201, 201, 201, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -5.825541973114014f, 0.125f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.268208f, 27.25f);
generalPath.lineTo(24.830708f, 28.5f);
generalPath.lineTo(40.21805f, 21.18133f);
generalPath.curveTo(39.773617f, 20.325287f, 38.97628f, 20.096733f, 38.31467f, 20.019068f);
generalPath.lineTo(23.268208f, 27.25f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 93)) : new Color(255, 255, 255, 93);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.143208f, 31.0625f);
generalPath.lineTo(25.330708f, 30.3125f);
generalPath.lineTo(40.5618f, 23.1829f);
generalPath.curveTo(40.5618f, 23.1829f, 40.451637f, 23.796528f, 40.34592f, 23.93225f);
generalPath.lineTo(25.143208f, 31.0625f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 93)) : new Color(0, 0, 0, 93);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());

}



    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    _paint0(g, origAlpha);


	    shape = null;
	    generalPath = null;
	    paint = null;
	    stroke = null;
	    clip = null;
        transformsStack.clear();
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 2.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 48.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 45.00965881347656;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private accessories_text_editor() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public synchronized void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    @Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static NeonIcon of(int width, int height) {
       accessories_text_editor base = new accessories_text_editor();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       accessories_text_editor base = new accessories_text_editor();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return accessories_text_editor::new;
    }
}

