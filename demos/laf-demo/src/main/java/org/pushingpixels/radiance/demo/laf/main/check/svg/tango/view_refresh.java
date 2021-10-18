package org.pushingpixels.radiance.demo.laf.main.check.svg.tango;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class view_refresh implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.38333333f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.4897359609603882f, 0.0f, 0.0f, -1.0012520551681519f, 61.208648681640625f, 75.28189849853516f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.48186f, 36.421127f);
generalPath.curveTo(40.50693f, 39.429993f, 37.530556f, 42.216076f, 32.67976f, 43.724407f);
generalPath.curveTo(27.828962f, 45.23274f, 21.845287f, 45.23274f, 16.99449f, 43.724407f);
generalPath.curveTo(12.143692f, 42.216076f, 9.167317f, 39.429993f, 9.192389f, 36.421127f);
generalPath.curveTo(9.167317f, 33.412262f, 12.143692f, 30.626177f, 16.99449f, 29.117847f);
generalPath.curveTo(21.845287f, 27.609516f, 27.828962f, 27.609516f, 32.67976f, 29.117847f);
generalPath.curveTo(37.530556f, 30.626177f, 40.50693f, 33.412262f, 40.48186f, 36.421127f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, new Point2D.Double(24.837125778198242, 36.42112731933594), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5367230176925659f, -9.680927934296868E-14f, 16.87306022644043f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(20.152912f, 10.409904f);
generalPath.curveTo(20.152912f, 10.409904f, 11.215413f, 9.784904f, 13.965413f, 20.284904f);
generalPath.lineTo(6.277913f, 20.284904f);
generalPath.curveTo(6.277913f, 20.284904f, 6.777913f, 8.409904f, 20.152912f, 10.409904f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.478553771972656, 10.61220645904541), new Point2D.Double(15.419417381286621, 19.115121841430664), new float[] {0.0f,0.33333334f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 255)) : new Color(52, 101, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(91, 134, 190, 255)) : new Color(91, 134, 190, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 168, 216, 0)) : new Color(131, 168, 216, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.46541300415992737f, -0.2775929868221283f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(37.1280517578125, 29.729604721069336), new Point2D.Double(37.06541442871094, 26.19407081604004), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 255)) : new Color(52, 101, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 0)) : new Color(52, 101, 164, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 47.52790832519531f, 45.847408294677734f));
stroke = new BasicStroke(0.9999996f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.152912f, 10.409904f);
generalPath.curveTo(20.152912f, 10.409904f, 11.215413f, 9.784904f, 13.965413f, 20.284904f);
generalPath.lineTo(6.277913f, 20.284904f);
generalPath.curveTo(6.277913f, 20.284904f, 6.777913f, 8.409904f, 20.152912f, 10.409904f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.5790510177612305f, -0.4892280101776123f, -0.4892280101776123f, 0.5790510177612305f, 56.91585159301758f, 13.371370315551758f));
// _0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.30678f, 50.229694f);
generalPath.curveTo(62.8215f, 35.81886f, 49.664585f, 13.411704f, 22.462412f, 12.49765f);
generalPath.lineTo(22.113844f, 3.151548f);
generalPath.lineTo(7.624544f, 20.496754f);
generalPath.lineTo(22.714329f, 33.21919f);
generalPath.curveTo(22.714329f, 33.21919f, 22.462412f, 23.337969f, 22.462412f, 23.337969f);
generalPath.curveTo(41.29217f, 24.336946f, 55.44404f, 37.4097f, 44.30678f, 50.229694f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(62.51383590698242, 36.06123733520508), new Point2D.Double(15.98486328125, 20.608579635620117), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(185, 207, 231, 255)) : new Color(185, 207, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(46.834815979003906, 45.264122009277344), new Point2D.Double(45.380435943603516, 50.939666748046875), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 255)) : new Color(52, 101, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 255)) : new Color(52, 101, 164, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.3191693f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.30678f, 50.229694f);
generalPath.curveTo(62.8215f, 35.81886f, 49.664585f, 13.411704f, 22.462412f, 12.49765f);
generalPath.lineTo(22.113844f, 3.151548f);
generalPath.lineTo(7.624544f, 20.496754f);
generalPath.lineTo(22.714329f, 33.21919f);
generalPath.curveTo(22.714329f, 33.21919f, 22.462412f, 23.337969f, 22.462412f, 23.337969f);
generalPath.curveTo(41.29217f, 24.336946f, 55.44404f, 37.4097f, 44.30678f, 50.229694f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.375f, 33.4375f);
generalPath.curveTo(28.375f, 33.4375f, 37.3125f, 34.0625f, 34.5625f, 23.5625f);
generalPath.lineTo(42.338387f, 23.5625f);
generalPath.curveTo(42.338387f, 25.065102f, 41.75f, 35.4375f, 28.375f, 33.4375f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(32.647972106933594, 30.74884605407715), new Point2D.Double(37.12446212768555, 24.842252731323242), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(196, 215, 235, 255)) : new Color(196, 215, 235, 255)),((colorFilter != null) ? colorFilter.filter(new Color(196, 215, 235, 0)) : new Color(196, 215, 235, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.713836669921875, 31.455951690673828), new Point2D.Double(37.12446212768555, 24.842252731323242), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(57, 119, 195, 255)) : new Color(57, 119, 195, 255)),((colorFilter != null) ? colorFilter.filter(new Color(137, 174, 220, 0)) : new Color(137, 174, 220, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.9999996f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.375f, 33.4375f);
generalPath.curveTo(28.375f, 33.4375f, 37.3125f, 34.0625f, 34.5625f, 23.5625f);
generalPath.lineTo(42.338387f, 23.5625f);
generalPath.curveTo(42.338387f, 25.065102f, 41.75f, 35.4375f, 28.375f, 33.4375f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.5790510177612305f, 0.4892280101776123f, 0.4892280101776123f, -0.5790510177612305f, -7.921022891998291f, 30.53598976135254f));
// _0_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.30678f, 50.229694f);
generalPath.curveTo(62.8215f, 35.81886f, 49.664585f, 13.411704f, 22.462412f, 12.49765f);
generalPath.lineTo(22.399431f, 3.0690298f);
generalPath.lineTo(7.793943f, 20.424006f);
generalPath.lineTo(22.462412f, 33.006348f);
generalPath.curveTo(22.462412f, 33.006348f, 22.462412f, 23.337969f, 22.462412f, 23.337969f);
generalPath.curveTo(41.29217f, 24.336946f, 55.44404f, 37.4097f, 44.30678f, 50.229694f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.935766220092773, 23.667896270751953), new Point2D.Double(53.588623046875, 26.649362564086914), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 138, 197, 255)) : new Color(82, 138, 197, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(46.834815979003906, 45.264122009277344), new Point2D.Double(45.380435943603516, 50.939666748046875), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 255)) : new Color(52, 101, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 255)) : new Color(52, 101, 164, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.3191693f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.30678f, 50.229694f);
generalPath.curveTo(62.8215f, 35.81886f, 49.664585f, 13.411704f, 22.462412f, 12.49765f);
generalPath.lineTo(22.399431f, 3.0690298f);
generalPath.lineTo(7.793943f, 20.424006f);
generalPath.lineTo(22.462412f, 33.006348f);
generalPath.curveTo(22.462412f, 33.006348f, 22.462412f, 23.337969f, 22.462412f, 23.337969f);
generalPath.curveTo(41.29217f, 24.336946f, 55.44404f, 37.4097f, 44.30678f, 50.229694f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.27222225f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.0625f, 38.1875f);
generalPath.lineTo(7.125f, 23.3125f);
generalPath.lineTo(20.0625f, 22.9375f);
generalPath.lineTo(15.673627f, 28.116318f);
generalPath.lineTo(19.540852f, 30.489515f);
generalPath.curveTo(16.540852f, 32.739517f, 14.991304f, 32.911644f, 13.991304f, 35.474144f);
generalPath.lineTo(11.174446f, 33.363873f);
generalPath.lineTo(7.0625f, 38.1875f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.5085359811782837f, 0.4296509921550751f, 0.4296509921550751f, -0.5085359811782837f, -3.9731879234313965f, 30.541189193725586f));
// _0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6_0
paint = new LinearGradientPaint(new Point2D.Double(5.9649176597595215, 26.04816436767578), new Point2D.Double(52.854095458984375, 26.04816436767578), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5020893f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.090263f, 45.943707f);
generalPath.curveTo(60.210464f, 30.723955f, 46.631615f, 12.20113f, 19.485058f, 11.948579f);
generalPath.lineTo(19.513464f, 3.7032833f);
generalPath.lineTo(6.534198f, 19.296638f);
generalPath.lineTo(19.36766f, 30.26876f);
generalPath.curveTo(19.36766f, 30.26876f, 19.42328f, 21.261883f, 19.42328f, 21.261883f);
generalPath.curveTo(36.951096f, 21.037973f, 54.618465f, 31.365253f, 51.090263f, 45.943707f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.5085359811782837f, -0.4296509921550751f, -0.4296509921550751f, 0.5085359811782837f, 53.04899978637695f, 13.365480422973633f));
// _0_0_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7_0
paint = new LinearGradientPaint(new Point2D.Double(5.9649176597595215, 26.04816436767578), new Point2D.Double(52.854095458984375, 26.04816436767578), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5020893f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.389927f, 46.505947f);
generalPath.curveTo(60.510128f, 31.286196f, 47.050762f, 12.432359f, 19.628483f, 12.069755f);
generalPath.lineTo(19.342825f, 4.05072f);
generalPath.lineTo(6.341309f, 19.379475f);
generalPath.lineTo(19.80906f, 30.76459f);
generalPath.curveTo(19.80906f, 30.76459f, 19.627295f, 21.311346f, 19.627295f, 21.311346f);
generalPath.curveTo(37.87223f, 21.693317f, 54.411175f, 32.23659f, 51.389927f, 46.505947f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.27222225f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.8125f, 16.5f);
generalPath.curveTo(10.405935f, 6.0587273f, 23.256283f, 10.355393f, 27.0f, 12.0f);
generalPath.curveTo(31.175306f, 12.211475f, 32.674736f, 9.164996f, 36.0f, 9.0f);
generalPath.curveTo(21.950264f, -0.7899963f, 7.1875f, 2.5f, 6.8125f, 16.5f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
        return 0.0;
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
		return 48.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private view_refresh() {
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
       view_refresh base = new view_refresh();
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
       view_refresh base = new view_refresh();
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
        return view_refresh::new;
    }
}

