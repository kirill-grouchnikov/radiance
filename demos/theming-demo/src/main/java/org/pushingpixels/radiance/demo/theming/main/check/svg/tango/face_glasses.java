package org.pushingpixels.radiance.demo.theming.main.check.svg.tango;

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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class face_glasses implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
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
generalPath.moveTo(44.42857f, 38.57143f);
generalPath.curveTo(44.460163f, 40.926178f, 40.709564f, 43.10657f, 34.596966f, 44.286995f);
generalPath.curveTo(28.484367f, 45.46742f, 20.944202f, 45.46742f, 14.831604f, 44.286995f);
generalPath.curveTo(8.719005f, 43.10657f, 4.9684076f, 40.926178f, 5.0f, 38.57143f);
generalPath.curveTo(4.9684076f, 36.216682f, 8.719005f, 34.03629f, 14.831604f, 32.855865f);
generalPath.curveTo(20.944202f, 31.675442f, 28.484367f, 31.675442f, 34.596966f, 32.855865f);
generalPath.curveTo(40.709564f, 34.03629f, 44.460163f, 36.216682f, 44.42857f, 38.57143f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.714284896850586, 38.57143020629883), 19.714285f, new Point2D.Double(24.714284896850586, 38.57143020629883), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.33333298563957214f, 0.0f, 25.714290618896484f));
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
generalPath.moveTo(39.774754f, 19.008621f);
generalPath.curveTo(39.788635f, 22.112505f, 38.140697f, 24.986568f, 35.454945f, 26.54253f);
generalPath.curveTo(32.769196f, 28.098494f, 29.4562f, 28.098494f, 26.770447f, 26.54253f);
generalPath.curveTo(24.084696f, 24.986568f, 22.436758f, 22.112505f, 22.45064f, 19.008621f);
generalPath.curveTo(22.436758f, 15.904738f, 24.084696f, 13.030674f, 26.770447f, 11.474711f);
generalPath.curveTo(29.4562f, 9.918749f, 32.769196f, 9.918749f, 35.454945f, 11.474711f);
generalPath.curveTo(38.140697f, 13.030674f, 39.788635f, 15.904738f, 39.774754f, 19.008621f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(29.288070678710938, 15.72098445892334), 8.90208f, new Point2D.Double(29.158466339111328, 15.755711555480957), new float[] {0.0f,0.6448598f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 252, 222, 255)) : new Color(255, 252, 222, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 231, 106, 255)) : new Color(246, 231, 106, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 183, 56, 255)) : new Color(255, 183, 56, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(156, 140, 10, 255)) : new Color(156, 140, 10, 255);
stroke = new BasicStroke(0.48004404f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.774754f, 19.008621f);
generalPath.curveTo(39.788635f, 22.112505f, 38.140697f, 24.986568f, 35.454945f, 26.54253f);
generalPath.curveTo(32.769196f, 28.098494f, 29.4562f, 28.098494f, 26.770447f, 26.54253f);
generalPath.curveTo(24.084696f, 24.986568f, 22.436758f, 22.112505f, 22.45064f, 19.008621f);
generalPath.curveTo(22.436758f, 15.904738f, 24.084696f, 13.030674f, 26.770447f, 11.474711f);
generalPath.curveTo(29.4562f, 9.918749f, 32.769196f, 9.918749f, 35.454945f, 11.474711f);
generalPath.curveTo(38.140697f, 13.030674f, 39.788635f, 15.904738f, 39.774754f, 19.008621f);
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
generalPath.moveTo(38.375f, 19.1875f);
generalPath.curveTo(38.378807f, 19.389061f, 37.926968f, 19.575699f, 37.19058f, 19.67674f);
generalPath.curveTo(36.454185f, 19.777782f, 35.545815f, 19.777782f, 34.80942f, 19.67674f);
generalPath.curveTo(34.073032f, 19.575699f, 33.621193f, 19.389061f, 33.625f, 19.1875f);
generalPath.curveTo(33.621193f, 18.985939f, 34.073032f, 18.799301f, 34.80942f, 18.69826f);
generalPath.curveTo(35.545815f, 18.597218f, 36.454185f, 18.597218f, 37.19058f, 18.69826f);
generalPath.curveTo(37.926968f, 18.799301f, 38.378807f, 18.985939f, 38.375f, 19.1875f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
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
generalPath.moveTo(38.375f, 19.1875f);
generalPath.curveTo(38.378807f, 19.389061f, 37.926968f, 19.575699f, 37.19058f, 19.67674f);
generalPath.curveTo(36.454185f, 19.777782f, 35.545815f, 19.777782f, 34.80942f, 19.67674f);
generalPath.curveTo(34.073032f, 19.575699f, 33.621193f, 19.389061f, 33.625f, 19.1875f);
generalPath.curveTo(33.621193f, 18.985939f, 34.073032f, 18.799301f, 34.80942f, 18.69826f);
generalPath.curveTo(35.545815f, 18.597218f, 36.454185f, 18.597218f, 37.19058f, 18.69826f);
generalPath.curveTo(37.926968f, 18.799301f, 38.378807f, 18.985939f, 38.375f, 19.1875f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.6772152f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.979781985282898f, 0.0f, 0.0f, 1.979781985282898f, -37.33127975463867f, -14.527460098266602f));
// _0_0_3
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.5051063f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.774754f, 19.008621f);
generalPath.curveTo(39.788635f, 22.112505f, 38.140697f, 24.986568f, 35.454945f, 26.54253f);
generalPath.curveTo(32.769196f, 28.098494f, 29.4562f, 28.098494f, 26.770447f, 26.54253f);
generalPath.curveTo(24.084696f, 24.986568f, 22.436758f, 22.112505f, 22.45064f, 19.008621f);
generalPath.curveTo(22.436758f, 15.904738f, 24.084696f, 13.030674f, 26.770447f, 11.474711f);
generalPath.curveTo(29.4562f, 9.918749f, 32.769196f, 9.918749f, 35.454945f, 11.474711f);
generalPath.curveTo(38.140697f, 13.030674f, 39.788635f, 15.904738f, 39.774754f, 19.008621f);
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
generalPath.moveTo(30.657427f, 26.772383f);
generalPath.curveTo(29.168451f, 29.351362f, 27.42745f, 31.210005f, 24.328217f, 31.210005f);
generalPath.curveTo(21.317154f, 31.210005f, 19.112904f, 29.067863f, 17.737226f, 26.685122f);
generalPath.curveTo(18.995657f, 28.193571f, 20.83858f, 29.926355f, 24.197327f, 29.926355f);
generalPath.curveTo(28.210522f, 29.926355f, 28.912231f, 28.491488f, 30.657427f, 26.772383f);
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
generalPath.moveTo(30.657427f, 26.423346f);
generalPath.curveTo(29.168451f, 29.002323f, 27.42745f, 30.860968f, 24.328217f, 30.860968f);
generalPath.curveTo(21.317154f, 30.860968f, 19.112904f, 28.718826f, 17.737226f, 26.336084f);
generalPath.curveTo(18.995657f, 27.844534f, 20.83858f, 29.577318f, 24.197327f, 29.577318f);
generalPath.curveTo(28.210522f, 29.577318f, 28.912231f, 28.14245f, 30.657427f, 26.423346f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(25.05270004272461, 39.59280014038086), 15.7572f, new Point2D.Double(25.05270004272461, 39.59280014038086), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(119, 119, 119, 255)) : new Color(119, 119, 119, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.61701899766922f, 0.0f, 0.0f, 0.61701899766922f, 9.05479621887207f, 7.969542980194092f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(65, 65, 65, 255)) : new Color(65, 65, 65, 255);
stroke = new BasicStroke(0.99999946f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.036428f, 12.467883f);
generalPath.curveTo(21.051725f, 15.88849f, 19.235632f, 19.055826f, 16.275824f, 20.770561f);
generalPath.curveTo(13.316014f, 22.485296f, 9.664958f, 22.485296f, 6.7051487f, 20.770561f);
generalPath.curveTo(3.7453396f, 19.055826f, 1.9292464f, 15.88849f, 1.9445438f, 12.467883f);
generalPath.curveTo(1.9292464f, 9.0472765f, 3.7453396f, 5.87994f, 6.7051487f, 4.1652055f);
generalPath.curveTo(9.664958f, 2.450471f, 13.316014f, 2.450471f, 16.275824f, 4.1652055f);
generalPath.curveTo(19.235632f, 5.87994f, 21.051725f, 9.0472765f, 21.036428f, 12.467883f);
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(65, 65, 65, 255)) : new Color(65, 65, 65, 255);
stroke = new BasicStroke(0.99999946f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.036428f, 12.467883f);
generalPath.curveTo(21.051725f, 15.88849f, 19.235632f, 19.055826f, 16.275824f, 20.770561f);
generalPath.curveTo(13.316014f, 22.485296f, 9.664958f, 22.485296f, 6.7051487f, 20.770561f);
generalPath.curveTo(3.7453396f, 19.055826f, 1.9292464f, 15.88849f, 1.9445438f, 12.467883f);
generalPath.curveTo(1.9292464f, 9.0472765f, 3.7453396f, 5.87994f, 6.7051487f, 4.1652055f);
generalPath.curveTo(9.664958f, 2.450471f, 13.316014f, 2.450471f, 16.275824f, 4.1652055f);
generalPath.curveTo(19.235632f, 5.87994f, 21.051725f, 9.0472765f, 21.036428f, 12.467883f);
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(65, 65, 65, 255)) : new Color(65, 65, 65, 255);
stroke = new BasicStroke(1.5985087f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.036428f, 12.467883f);
generalPath.curveTo(21.036428f, 17.074842f, 17.746138f, 21.024513f, 13.214976f, 21.856768f);
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
generalPath.moveTo(25.897785f, 18.478292f);
generalPath.curveTo(25.9111f, 21.455486f, 24.330425f, 24.212242f, 21.754295f, 25.704697f);
generalPath.curveTo(19.178165f, 27.197151f, 16.000395f, 27.197151f, 13.424265f, 25.704697f);
generalPath.curveTo(10.848135f, 24.212242f, 9.267462f, 21.455486f, 9.280776f, 18.478292f);
generalPath.curveTo(9.267462f, 15.501098f, 10.848135f, 12.744343f, 13.424265f, 11.251888f);
generalPath.curveTo(16.000395f, 9.759435f, 19.178165f, 9.759435f, 21.754295f, 11.251888f);
generalPath.curveTo(24.330425f, 12.744343f, 25.9111f, 15.501098f, 25.897785f, 18.478292f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.240928649902344, 21.8179874420166), 8.308505f, new Point2D.Double(18.240928649902344, 21.8179874420166), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 53)) : new Color(114, 159, 207, 53)),((colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 172)) : new Color(114, 159, 207, 172))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 99, 163, 255)) : new Color(48, 99, 163, 255);
stroke = new BasicStroke(0.968844f,1,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.897785f, 18.478292f);
generalPath.curveTo(25.9111f, 21.455486f, 24.330425f, 24.212242f, 21.754295f, 25.704697f);
generalPath.curveTo(19.178165f, 27.197151f, 16.000395f, 27.197151f, 13.424265f, 25.704697f);
generalPath.curveTo(10.848135f, 24.212242f, 9.267462f, 21.455486f, 9.280776f, 18.478292f);
generalPath.curveTo(9.267462f, 15.501098f, 10.848135f, 12.744343f, 13.424265f, 11.251888f);
generalPath.curveTo(16.000395f, 9.759435f, 19.178165f, 9.759435f, 21.754295f, 11.251888f);
generalPath.curveTo(24.330425f, 12.744343f, 25.9111f, 15.501098f, 25.897785f, 18.478292f);
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
generalPath.moveTo(36.254112f, 7.7185783f);
generalPath.curveTo(32.41098f, 7.7185783f, 29.298923f, 10.830635f, 29.298923f, 14.673768f);
generalPath.curveTo(29.298923f, 15.783682f, 29.609104f, 16.804907f, 30.07172f, 17.736341f);
generalPath.curveTo(30.99596f, 18.077005f, 31.97776f, 18.308784f, 33.019806f, 18.308784f);
generalPath.curveTo(37.573887f, 18.308784f, 41.21093f, 14.720961f, 41.49197f, 10.237329f);
generalPath.curveTo(40.214542f, 8.727756f, 38.385017f, 7.7185783f, 36.254112f, 7.7185783f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, new Point2D.Double(15.4143705368042, 13.078408241271973), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 63)) : new Color(255, 255, 255, 63))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9135719537734985f, -5.717108088534165E-24f, -4.217182951704133E-24f, 1.6620229482650757f, 4.360787868499756f, -11.718279838562012f));
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
generalPath.moveTo(25.897785f, 18.478292f);
generalPath.curveTo(25.9111f, 21.455486f, 24.330425f, 24.212242f, 21.754295f, 25.704697f);
generalPath.curveTo(19.178165f, 27.197151f, 16.000395f, 27.197151f, 13.424265f, 25.704697f);
generalPath.curveTo(10.848135f, 24.212242f, 9.267462f, 21.455486f, 9.280776f, 18.478292f);
generalPath.curveTo(9.267462f, 15.501098f, 10.848135f, 12.744343f, 13.424265f, 11.251888f);
generalPath.curveTo(16.000395f, 9.759435f, 19.178165f, 9.759435f, 21.754295f, 11.251888f);
generalPath.curveTo(24.330425f, 12.744343f, 25.9111f, 15.501098f, 25.897785f, 18.478292f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.240928649902344, 21.8179874420166), 8.308505f, new Point2D.Double(18.240928649902344, 21.8179874420166), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 53)) : new Color(114, 159, 207, 53)),((colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 172)) : new Color(114, 159, 207, 172))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 99, 163, 255)) : new Color(48, 99, 163, 255);
stroke = new BasicStroke(0.968844f,1,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.897785f, 18.478292f);
generalPath.curveTo(25.9111f, 21.455486f, 24.330425f, 24.212242f, 21.754295f, 25.704697f);
generalPath.curveTo(19.178165f, 27.197151f, 16.000395f, 27.197151f, 13.424265f, 25.704697f);
generalPath.curveTo(10.848135f, 24.212242f, 9.267462f, 21.455486f, 9.280776f, 18.478292f);
generalPath.curveTo(9.267462f, 15.501098f, 10.848135f, 12.744343f, 13.424265f, 11.251888f);
generalPath.curveTo(16.000395f, 9.759435f, 19.178165f, 9.759435f, 21.754295f, 11.251888f);
generalPath.curveTo(24.330425f, 12.744343f, 25.9111f, 15.501098f, 25.897785f, 18.478292f);
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
generalPath.moveTo(11.723783f, 7.7185783f);
generalPath.curveTo(7.8806505f, 7.7185783f, 4.7685933f, 10.830635f, 4.7685933f, 14.673768f);
generalPath.curveTo(4.7685933f, 15.783682f, 5.078774f, 16.804907f, 5.5413914f, 17.736341f);
generalPath.curveTo(6.46563f, 18.077005f, 7.447431f, 18.308784f, 8.489476f, 18.308784f);
generalPath.curveTo(13.04356f, 18.308784f, 16.6806f, 14.720961f, 16.961643f, 10.237329f);
generalPath.curveTo(15.684215f, 8.727756f, 13.85469f, 7.7185783f, 11.723783f, 7.7185783f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, new Point2D.Double(15.4143705368042, 13.078408241271973), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 63)) : new Color(255, 255, 255, 63))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9135719537734985f, -5.717108088534165E-24f, -4.217182951704133E-24f, 1.6620229482650757f, -20.1695499420166f, -11.718279838562012f));
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
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
    public boolean supportsColorFilter() {
        return true;
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
    public static RadianceIcon of(int width, int height) {
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       face_glasses base = new face_glasses();
       base.width = width;
       base.height = height;
       return new RadianceIconUIResource(base);
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

