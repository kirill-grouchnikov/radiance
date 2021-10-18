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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class system_search implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.17112298f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.446431040763855f, 0.0f, 0.0f, 1.5199899673461914f, -10.974530220031738f, -17.751680374145508f));
// _0_0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.65864f, 37.967922f);
generalPath.curveTo(40.685127f, 39.37734f, 37.540596f, 40.6824f, 32.41574f, 41.38893f);
generalPath.curveTo(27.290888f, 42.095467f, 20.96915f, 42.095467f, 15.8442955f, 41.38893f);
generalPath.curveTo(10.719441f, 40.6824f, 7.574909f, 39.37734f, 7.6013966f, 37.967922f);
generalPath.curveTo(7.574909f, 36.558506f, 10.719441f, 35.253445f, 15.8442955f, 34.546913f);
generalPath.curveTo(20.96915f, 33.840378f, 27.290888f, 33.840378f, 32.41574f, 34.546913f);
generalPath.curveTo(37.540596f, 35.253445f, 40.685127f, 36.558506f, 40.65864f, 37.967922f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.13001823425293, 37.96792221069336), 16.528622f, new Point2D.Double(24.13001823425293, 37.96792221069336), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.23796799778938293f, -2.47198095326695E-16f, 28.93277931213379f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.62757f, 3.1435547f);
generalPath.curveTo(10.488439f, 3.1435547f, 3.8827682f, 9.749226f, 3.8827682f, 17.888355f);
generalPath.curveTo(3.8827682f, 26.027487f, 10.488439f, 32.63316f, 18.62757f, 32.63316f);
generalPath.curveTo(22.107124f, 32.63316f, 25.17857f, 31.248766f, 27.701292f, 29.23051f);
generalPath.curveTo(27.495914f, 30.237392f, 27.623257f, 31.265879f, 28.457436f, 31.990437f);
generalPath.lineTo(39.42152f, 41.517845f);
generalPath.curveTo(40.654938f, 42.589176f, 42.508984f, 42.448807f, 43.58031f, 41.21539f);
generalPath.curveTo(44.651638f, 39.98197f, 44.51127f, 38.127926f, 43.27785f, 37.0566f);
generalPath.lineTo(32.31377f, 27.529188f);
generalPath.curveTo(31.642242f, 26.94591f, 30.82089f, 26.773218f, 30.00753f, 26.886465f);
generalPath.curveTo(31.99423f, 24.374044f, 33.37237f, 21.337664f, 33.37237f, 17.888355f);
generalPath.curveTo(33.37237f, 9.749226f, 26.766699f, 3.1435547f, 18.62757f, 3.1435547f);
generalPath.closePath();
generalPath.moveTo(18.551954f, 4.369738f);
generalPath.curveTo(26.191414f, 4.369738f, 31.843729f, 9.158689f, 31.843729f, 17.661512f);
generalPath.curveTo(31.843729f, 26.336626f, 26.027039f, 30.953287f, 18.551954f, 30.953287f);
generalPath.curveTo(11.249005f, 30.953287f, 5.2601805f, 25.475197f, 5.2601805f, 17.661512f);
generalPath.curveTo(5.2601805f, 9.677406f, 11.084819f, 4.369738f, 18.551954f, 4.369738f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(220, 220, 220, 255)) : new Color(220, 220, 220, 255);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(27.36634063720703, 26.58029556274414), new Point2D.Double(31.33596420288086, 30.557771682739258), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(138, 138, 138, 255)) : new Color(138, 138, 138, 255)),((colorFilter != null) ? colorFilter.filter(new Color(72, 72, 72, 255)) : new Color(72, 72, 72, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.000001f,1,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.62757f, 3.1435547f);
generalPath.curveTo(10.488439f, 3.1435547f, 3.8827682f, 9.749226f, 3.8827682f, 17.888355f);
generalPath.curveTo(3.8827682f, 26.027487f, 10.488439f, 32.63316f, 18.62757f, 32.63316f);
generalPath.curveTo(22.107124f, 32.63316f, 25.17857f, 31.248766f, 27.701292f, 29.23051f);
generalPath.curveTo(27.495914f, 30.237392f, 27.623257f, 31.265879f, 28.457436f, 31.990437f);
generalPath.lineTo(39.42152f, 41.517845f);
generalPath.curveTo(40.654938f, 42.589176f, 42.508984f, 42.448807f, 43.58031f, 41.21539f);
generalPath.curveTo(44.651638f, 39.98197f, 44.51127f, 38.127926f, 43.27785f, 37.0566f);
generalPath.lineTo(32.31377f, 27.529188f);
generalPath.curveTo(31.642242f, 26.94591f, 30.82089f, 26.773218f, 30.00753f, 26.886465f);
generalPath.curveTo(31.99423f, 24.374044f, 33.37237f, 21.337664f, 33.37237f, 17.888355f);
generalPath.curveTo(33.37237f, 9.749226f, 26.766699f, 3.1435547f, 18.62757f, 3.1435547f);
generalPath.closePath();
generalPath.moveTo(18.551954f, 4.369738f);
generalPath.curveTo(26.191414f, 4.369738f, 31.843729f, 9.158689f, 31.843729f, 17.661512f);
generalPath.curveTo(31.843729f, 26.336626f, 26.027039f, 30.953287f, 18.551954f, 30.953287f);
generalPath.curveTo(11.249005f, 30.953287f, 5.2601805f, 25.475197f, 5.2601805f, 17.661512f);
generalPath.curveTo(5.2601805f, 9.677406f, 11.084819f, 4.369738f, 18.551954f, 4.369738f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.602905f, 3.0803552f);
generalPath.curveTo(10.437465f, 3.0803552f, 3.8104408f, 9.707379f, 3.8104408f, 17.87282f);
generalPath.curveTo(3.8104408f, 26.03826f, 10.437465f, 32.665283f, 18.602905f, 32.665283f);
generalPath.curveTo(22.093708f, 32.665283f, 25.175081f, 31.276417f, 27.70596f, 29.251638f);
generalPath.curveTo(27.49992f, 30.261774f, 27.627672f, 31.293585f, 28.464546f, 32.020485f);
generalPath.lineTo(39.464073f, 41.57869f);
generalPath.curveTo(40.701477f, 42.653484f, 42.561516f, 42.51266f, 43.636307f, 41.275257f);
generalPath.curveTo(44.711098f, 40.037853f, 44.570274f, 38.177814f, 43.33287f, 37.103024f);
generalPath.lineTo(32.333347f, 27.544815f);
generalPath.curveTo(31.659649f, 26.959652f, 30.835642f, 26.786402f, 30.019653f, 26.900017f);
generalPath.curveTo(32.012775f, 24.379473f, 33.39537f, 21.333277f, 33.39537f, 17.87282f);
generalPath.curveTo(33.39537f, 9.707379f, 26.768345f, 3.0803552f, 18.602905f, 3.0803552f);
generalPath.closePath();
generalPath.moveTo(18.527046f, 6.266424f);
generalPath.curveTo(24.808153f, 6.2664247f, 29.905865f, 11.364135f, 29.905865f, 17.645243f);
generalPath.curveTo(29.905865f, 23.926352f, 24.808153f, 29.024061f, 18.527046f, 29.024061f);
generalPath.curveTo(12.245938f, 29.024061f, 7.1482277f, 23.926352f, 7.1482277f, 17.645243f);
generalPath.curveTo(7.1482277f, 11.364135f, 12.245938f, 6.266424f, 18.527046f, 6.266424f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(220, 220, 220, 255)) : new Color(220, 220, 220, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.507004f, 41.57769f);
generalPath.curveTo(39.02833f, 39.304504f, 40.904335f, 36.76627f, 43.091057f, 36.789314f);
generalPath.curveTo(43.091057f, 36.789314f, 32.33069f, 27.531204f, 32.33069f, 27.531204f);
generalPath.curveTo(29.385899f, 27.474499f, 28.061188f, 29.80382f, 28.553877f, 32.131126f);
generalPath.lineTo(39.507004f, 41.57769f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(30.65625, 34.0), new Point2D.Double(33.21875, 31.0625), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(125, 125, 125, 255)) : new Color(125, 125, 125, 255)),((colorFilter != null) ? colorFilter.filter(new Color(177, 177, 177, 255)) : new Color(177, 177, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(104, 104, 104, 255)) : new Color(104, 104, 104, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3345930576324463f, 0.0f, 0.0f, 1.2912919521331787f, -6.973842144012451f, -7.460658073425293f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.2457430362701416f, 0.0f, 0.0f, 1.2457430362701416f, -3.4253458976745605f, -6.177032947540283f));
// _0_0_0_4
paint = new LinearGradientPaint(new Point2D.Double(18.292673110961914, 13.602121353149414), new Point2D.Double(17.500892639160156, 25.74346923828125), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 56)) : new Color(255, 255, 255, 56)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.8027336f,1,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.549437f, 18.920233f);
generalPath.curveTo(28.567142f, 22.879269f, 26.465181f, 26.545166f, 23.039478f, 28.529814f);
generalPath.curveTo(19.613773f, 30.51446f, 15.388013f, 30.51446f, 11.962308f, 28.529814f);
generalPath.curveTo(8.536603f, 26.545166f, 6.4346433f, 22.879269f, 6.4523487f, 18.920233f);
generalPath.curveTo(6.4346433f, 14.961198f, 8.536603f, 11.295299f, 11.962308f, 9.310653f);
generalPath.curveTo(15.388013f, 7.326006f, 19.613773f, 7.326006f, 23.039478f, 9.310653f);
generalPath.curveTo(26.465181f, 11.295299f, 28.567142f, 14.961198f, 28.549437f, 18.920233f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.497763991355896f, 0.0f, 0.0f, 0.609620988368988f, 8.973526000976562f, 15.619290351867676f));
// _0_0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.65864f, 37.967922f);
generalPath.curveTo(40.685127f, 39.37734f, 37.540596f, 40.6824f, 32.41574f, 41.38893f);
generalPath.curveTo(27.290888f, 42.095467f, 20.96915f, 42.095467f, 15.8442955f, 41.38893f);
generalPath.curveTo(10.719441f, 40.6824f, 7.574909f, 39.37734f, 7.6013966f, 37.967922f);
generalPath.curveTo(7.574909f, 36.558506f, 10.719441f, 35.253445f, 15.8442955f, 34.546913f);
generalPath.curveTo(20.96915f, 33.840378f, 27.290888f, 33.840378f, 32.41574f, 34.546913f);
generalPath.curveTo(37.540596f, 35.253445f, 40.685127f, 36.558506f, 40.65864f, 37.967922f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.13001823425293, 37.96792221069336), 16.528622f, new Point2D.Double(24.13001823425293, 37.96792221069336), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.23796799778938293f, 3.1528590705548996E-15f, 28.93277931213379f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.4331551f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.7529860138893127f, 0.658037006855011f, -0.6489019989967346f, 0.7608720064163208f, 0.0f, 0.0f));
// _0_0_0_6
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0000311f,1,0,10.0f,null,0.0f);
shape = new RoundRectangle2D.Double(40.37333679199219, 0.14086054265499115, 19.048439025878906, 4.440478324890137, 4.273321628570557, 3.7758729457855225);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.3986140489578247f, 0.0f, 0.0f, 1.3986140489578247f, -6.224338054656982f, -8.298957824707031f));
// _0_0_0_7
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
stroke = new BasicStroke(0.71499395f,1,0,10.0f,null,0.0f);
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
// _0_0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.156916f, 7.3966937f);
generalPath.curveTo(12.949325f, 7.3966937f, 8.732368f, 11.613651f, 8.732368f, 16.821241f);
generalPath.curveTo(8.732368f, 18.325216f, 9.152676f, 19.709015f, 9.77954f, 20.971144f);
generalPath.curveTo(11.03192f, 21.432756f, 12.362297f, 21.746826f, 13.774307f, 21.746826f);
generalPath.curveTo(19.945263f, 21.746826f, 24.873589f, 16.88519f, 25.254414f, 10.809698f);
generalPath.curveTo(23.523449f, 8.764167f, 21.044374f, 7.3966937f, 18.156916f, 7.3966937f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, new Point2D.Double(15.4143705368042, 13.078408241271973), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 63)) : new Color(255, 255, 255, 63))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.5929629802703857f, -7.746899656918026E-24f, -5.714442921965876E-24f, 2.2521040439605713f, -25.059749603271484f, -18.94099998474121f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
        return 2.143554210662842;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 47.87369918823242;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 44.08945083618164;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private system_search() {
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
       system_search base = new system_search();
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
       system_search base = new system_search();
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
        return system_search::new;
    }
}

