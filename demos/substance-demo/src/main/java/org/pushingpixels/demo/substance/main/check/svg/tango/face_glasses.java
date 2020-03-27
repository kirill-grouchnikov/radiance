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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class face_glasses implements ResizableIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
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
g.setComposite(AlphaComposite.getInstance(3, 0.5316456f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.42857, 38.57143);
generalPath.curveTo(44.460163, 40.926178, 40.709564, 43.10657, 34.596966, 44.286995);
generalPath.curveTo(28.484367, 45.46742, 20.944202, 45.46742, 14.831604, 44.286995);
generalPath.curveTo(8.719005, 43.10657, 4.9684076, 40.926178, 5.0, 38.57143);
generalPath.curveTo(4.9684076, 36.216682, 8.719005, 34.03629, 14.831604, 32.855865);
generalPath.curveTo(20.944202, 31.675442, 28.484367, 31.675442, 34.596966, 32.855865);
generalPath.curveTo(40.709564, 34.03629, 44.460163, 36.216682, 44.42857, 38.57143);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.714284896850586, 38.57143020629883), 19.714285f, new Point2D.Double(24.714284896850586, 38.57143020629883), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.33333298563957214f, 0.0f, 25.714290618896484f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(2.083142042160034f, 0.0f, 0.0f, 2.083142042160034f, -40.547149658203125f, -16.49224090576172f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.774754, 19.008621);
generalPath.curveTo(39.788635, 22.112505, 38.140697, 24.986568, 35.454945, 26.54253);
generalPath.curveTo(32.769196, 28.098494, 29.4562, 28.098494, 26.770447, 26.54253);
generalPath.curveTo(24.084696, 24.986568, 22.436758, 22.112505, 22.45064, 19.008621);
generalPath.curveTo(22.436758, 15.904738, 24.084696, 13.030674, 26.770447, 11.474711);
generalPath.curveTo(29.4562, 9.918749, 32.769196, 9.918749, 35.454945, 11.474711);
generalPath.curveTo(38.140697, 13.030674, 39.788635, 15.904738, 39.774754, 19.008621);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(29.288070678710938, 15.72098445892334), 8.90208f, new Point2D.Double(29.158466339111328, 15.755711555480957), new float[] {0.0f,0.6448598f,1.0f}, new Color[] {new Color(255, 252, 222, 255),new Color(246, 231, 106, 255),new Color(255, 183, 56, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(156, 140, 10, 255);
stroke = new BasicStroke(0.48004404f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.774754, 19.008621);
generalPath.curveTo(39.788635, 22.112505, 38.140697, 24.986568, 35.454945, 26.54253);
generalPath.curveTo(32.769196, 28.098494, 29.4562, 28.098494, 26.770447, 26.54253);
generalPath.curveTo(24.084696, 24.986568, 22.436758, 22.112505, 22.45064, 19.008621);
generalPath.curveTo(22.436758, 15.904738, 24.084696, 13.030674, 26.770447, 11.474711);
generalPath.curveTo(29.4562, 9.918749, 32.769196, 9.918749, 35.454945, 11.474711);
generalPath.curveTo(38.140697, 13.030674, 39.788635, 15.904738, 39.774754, 19.008621);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.875f, -0.625f));
// _0_0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.375, 19.1875);
generalPath.curveTo(38.378807, 19.389061, 37.926968, 19.575699, 37.19058, 19.67674);
generalPath.curveTo(36.454185, 19.777782, 35.545815, 19.777782, 34.80942, 19.67674);
generalPath.curveTo(34.073032, 19.575699, 33.621193, 19.389061, 33.625, 19.1875);
generalPath.curveTo(33.621193, 18.985939, 34.073032, 18.799301, 34.80942, 18.69826);
generalPath.curveTo(35.545815, 18.597218, 36.454185, 18.597218, 37.19058, 18.69826);
generalPath.curveTo(37.926968, 18.799301, 38.378807, 18.985939, 38.375, 19.1875);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -20.25f, -0.625f));
// _0_0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.375, 19.1875);
generalPath.curveTo(38.378807, 19.389061, 37.926968, 19.575699, 37.19058, 19.67674);
generalPath.curveTo(36.454185, 19.777782, 35.545815, 19.777782, 34.80942, 19.67674);
generalPath.curveTo(34.073032, 19.575699, 33.621193, 19.389061, 33.625, 19.1875);
generalPath.curveTo(33.621193, 18.985939, 34.073032, 18.799301, 34.80942, 18.69826);
generalPath.curveTo(35.545815, 18.597218, 36.454185, 18.597218, 37.19058, 18.69826);
generalPath.curveTo(37.926968, 18.799301, 38.378807, 18.985939, 38.375, 19.1875);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.6772152f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.979781985282898f, 0.0f, 0.0f, 1.979781985282898f, -37.33127975463867f, -14.527460098266602f));
// _0_0_3
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.5051063f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.774754, 19.008621);
generalPath.curveTo(39.788635, 22.112505, 38.140697, 24.986568, 35.454945, 26.54253);
generalPath.curveTo(32.769196, 28.098494, 29.4562, 28.098494, 26.770447, 26.54253);
generalPath.curveTo(24.084696, 24.986568, 22.436758, 22.112505, 22.45064, 19.008621);
generalPath.curveTo(22.436758, 15.904738, 24.084696, 13.030674, 26.770447, 11.474711);
generalPath.curveTo(29.4562, 9.918749, 32.769196, 9.918749, 35.454945, 11.474711);
generalPath.curveTo(38.140697, 13.030674, 39.788635, 15.904738, 39.774754, 19.008621);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.36f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.657427, 26.772383);
generalPath.curveTo(29.168451, 29.351362, 27.42745, 31.210005, 24.328217, 31.210005);
generalPath.curveTo(21.317154, 31.210005, 19.112904, 29.067863, 17.737226, 26.685122);
generalPath.curveTo(18.995657, 28.193571, 20.83858, 29.926355, 24.197327, 29.926355);
generalPath.curveTo(28.210522, 29.926355, 28.912231, 28.491488, 30.657427, 26.772383);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(30.657427, 26.423346);
generalPath.curveTo(29.168451, 29.002323, 27.42745, 30.860968, 24.328217, 30.860968);
generalPath.curveTo(21.317154, 30.860968, 19.112904, 28.718826, 17.737226, 26.336084);
generalPath.curveTo(18.995657, 27.844534, 20.83858, 29.577318, 24.197327, 29.577318);
generalPath.curveTo(28.210522, 29.577318, 28.912231, 28.14245, 30.657427, 26.423346);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(25.05270004272461, 39.59280014038086), 15.7572f, new Point2D.Double(25.05270004272461, 39.59280014038086), new float[] {0.0f,1.0f}, new Color[] {new Color(119, 119, 119, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.61701899766922f, 0.0f, 0.0f, 0.61701899766922f, 9.05479621887207f, 7.969542980194092f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.375f, 2.75f));
// _0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6_0
paint = new Color(65, 65, 65, 255);
stroke = new BasicStroke(0.99999946f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.036428, 12.467883);
generalPath.curveTo(21.051725, 15.88849, 19.235632, 19.055826, 16.275824, 20.770561);
generalPath.curveTo(13.316014, 22.485296, 9.664958, 22.485296, 6.7051487, 20.770561);
generalPath.curveTo(3.7453396, 19.055826, 1.9292464, 15.88849, 1.9445438, 12.467883);
generalPath.curveTo(1.9292464, 9.0472765, 3.7453396, 5.87994, 6.7051487, 4.1652055);
generalPath.curveTo(9.664958, 2.450471, 13.316014, 2.450471, 16.275824, 4.1652055);
generalPath.curveTo(19.235632, 5.87994, 21.051725, 9.0472765, 21.036428, 12.467883);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 24.57196044921875f, 0.0f));
// _0_0_6_1
paint = new Color(65, 65, 65, 255);
stroke = new BasicStroke(0.99999946f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.036428, 12.467883);
generalPath.curveTo(21.051725, 15.88849, 19.235632, 19.055826, 16.275824, 20.770561);
generalPath.curveTo(13.316014, 22.485296, 9.664958, 22.485296, 6.7051487, 20.770561);
generalPath.curveTo(3.7453396, 19.055826, 1.9292464, 15.88849, 1.9445438, 12.467883);
generalPath.curveTo(1.9292464, 9.0472765, 3.7453396, 5.87994, 6.7051487, 4.1652055);
generalPath.curveTo(9.664958, 2.450471, 13.316014, 2.450471, 16.275824, 4.1652055);
generalPath.curveTo(19.235632, 5.87994, 21.051725, 9.0472765, 21.036428, 12.467883);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.40174999833106995f, -0.47953200340270996f, 0.47953200340270996f, -0.40174999833106995f, 22.405210494995117f, 22.900449752807617f));
// _0_0_6_2
paint = new Color(65, 65, 65, 255);
stroke = new BasicStroke(1.5985087f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.036428, 12.467883);
generalPath.curveTo(21.036428, 17.074842, 17.746138, 21.024513, 13.214976, 21.856768);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0321580171585083f, 0.0f, 0.0f, 1.0321580171585083f, 18.261070251464844f, -3.8645999431610107f));
// _0_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.897785, 18.478292);
generalPath.curveTo(25.9111, 21.455486, 24.330425, 24.212242, 21.754295, 25.704697);
generalPath.curveTo(19.178165, 27.197151, 16.000395, 27.197151, 13.424265, 25.704697);
generalPath.curveTo(10.848135, 24.212242, 9.267462, 21.455486, 9.280776, 18.478292);
generalPath.curveTo(9.267462, 15.501098, 10.848135, 12.744343, 13.424265, 11.251888);
generalPath.curveTo(16.000395, 9.759435, 19.178165, 9.759435, 21.754295, 11.251888);
generalPath.curveTo(24.330425, 12.744343, 25.9111, 15.501098, 25.897785, 18.478292);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.240928649902344, 21.8179874420166), 8.308505f, new Point2D.Double(18.240928649902344, 21.8179874420166), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 53),new Color(114, 159, 207, 172)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(48, 99, 163, 255);
stroke = new BasicStroke(0.968844f,1,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.897785, 18.478292);
generalPath.curveTo(25.9111, 21.455486, 24.330425, 24.212242, 21.754295, 25.704697);
generalPath.curveTo(19.178165, 27.197151, 16.000395, 27.197151, 13.424265, 25.704697);
generalPath.curveTo(10.848135, 24.212242, 9.267462, 21.455486, 9.280776, 18.478292);
generalPath.curveTo(9.267462, 15.501098, 10.848135, 12.744343, 13.424265, 11.251888);
generalPath.curveTo(16.000395, 9.759435, 19.178165, 9.759435, 21.754295, 11.251888);
generalPath.curveTo(24.330425, 12.744343, 25.9111, 15.501098, 25.897785, 18.478292);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.8342246f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.254112, 7.7185783);
generalPath.curveTo(32.41098, 7.7185783, 29.298923, 10.830635, 29.298923, 14.673768);
generalPath.curveTo(29.298923, 15.783682, 29.609104, 16.804907, 30.07172, 17.736341);
generalPath.curveTo(30.99596, 18.077005, 31.97776, 18.308784, 33.019806, 18.308784);
generalPath.curveTo(37.573887, 18.308784, 41.21093, 14.720961, 41.49197, 10.237329);
generalPath.curveTo(40.214542, 8.727756, 38.385017, 7.7185783, 36.254112, 7.7185783);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, new Point2D.Double(15.4143705368042, 13.078408241271973), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 63)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9135719537734985f, -5.717108088534165E-24f, -4.217182951704133E-24f, 1.6620229482650757f, 4.360787868499756f, -11.718279838562012f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0321580171585083f, 0.0f, 0.0f, 1.0321580171585083f, -6.26925802230835f, -3.8645999431610107f));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.897785, 18.478292);
generalPath.curveTo(25.9111, 21.455486, 24.330425, 24.212242, 21.754295, 25.704697);
generalPath.curveTo(19.178165, 27.197151, 16.000395, 27.197151, 13.424265, 25.704697);
generalPath.curveTo(10.848135, 24.212242, 9.267462, 21.455486, 9.280776, 18.478292);
generalPath.curveTo(9.267462, 15.501098, 10.848135, 12.744343, 13.424265, 11.251888);
generalPath.curveTo(16.000395, 9.759435, 19.178165, 9.759435, 21.754295, 11.251888);
generalPath.curveTo(24.330425, 12.744343, 25.9111, 15.501098, 25.897785, 18.478292);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.240928649902344, 21.8179874420166), 8.308505f, new Point2D.Double(18.240928649902344, 21.8179874420166), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 53),new Color(114, 159, 207, 172)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(48, 99, 163, 255);
stroke = new BasicStroke(0.968844f,1,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.897785, 18.478292);
generalPath.curveTo(25.9111, 21.455486, 24.330425, 24.212242, 21.754295, 25.704697);
generalPath.curveTo(19.178165, 27.197151, 16.000395, 27.197151, 13.424265, 25.704697);
generalPath.curveTo(10.848135, 24.212242, 9.267462, 21.455486, 9.280776, 18.478292);
generalPath.curveTo(9.267462, 15.501098, 10.848135, 12.744343, 13.424265, 11.251888);
generalPath.curveTo(16.000395, 9.759435, 19.178165, 9.759435, 21.754295, 11.251888);
generalPath.curveTo(24.330425, 12.744343, 25.9111, 15.501098, 25.897785, 18.478292);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.8342246f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.723783, 7.7185783);
generalPath.curveTo(7.8806505, 7.7185783, 4.7685933, 10.830635, 4.7685933, 14.673768);
generalPath.curveTo(4.7685933, 15.783682, 5.078774, 16.804907, 5.5413914, 17.736341);
generalPath.curveTo(6.46563, 18.077005, 7.447431, 18.308784, 8.489476, 18.308784);
generalPath.curveTo(13.04356, 18.308784, 16.6806, 14.720961, 16.961643, 10.237329);
generalPath.curveTo(15.684215, 8.727756, 13.85469, 7.7185783, 11.723783, 7.7185783);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, new Point2D.Double(15.4143705368042, 13.078408241271973), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 63)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9135719537734985f, -5.717108088534165E-24f, -4.217182951704133E-24f, 1.6620229482650757f, -20.1695499420166f, -11.718279838562012f));
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
        return 1.8034504652023315;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.647467613220215;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 44.69602966308594;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 41.819950103759766;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private face_glasses() {
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
    public static ResizableIcon of(int width, int height) {
       face_glasses base = new face_glasses();
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       face_glasses base = new face_glasses();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return face_glasses::new;
    }
}

