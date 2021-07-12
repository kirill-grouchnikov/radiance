package org.pushingpixels.demo.flamingo.svg.tango.transcoded;

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
public class X_office_document implements NeonIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.7836257f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071080207824707f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.128307f, 42.07798f);
generalPath.curveTo(40.15366f, 43.693268f, 37.143654f, 45.188953f, 32.23805f, 45.998688f);
generalPath.curveTo(27.332438f, 46.808426f, 21.28115f, 46.808426f, 16.375542f, 45.998688f);
generalPath.curveTo(11.469933f, 45.188953f, 8.459927f, 43.693268f, 8.485281f, 42.07798f);
generalPath.curveTo(8.459927f, 40.462692f, 11.469933f, 38.967007f, 16.375542f, 38.157272f);
generalPath.curveTo(21.28115f, 37.347534f, 27.332438f, 37.347534f, 32.23805f, 38.157272f);
generalPath.curveTo(37.143654f, 38.967007f, 40.15366f, 40.462692f, 40.128307f, 42.07798f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.306795120239258, 42.077980041503906), 15.821514f, new Point2D.Double(24.306795120239258, 42.077980041503906), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.2849160134792328f, 0.0f, 30.089279174804688f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0
shape = new RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746);
paint = new RadialGradientPaint(new Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, new Point2D.Double(33.966678619384766, 35.736915588378906), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(250, 250, 250, 255)) : new Color(250, 250, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(187, 187, 187, 255)) : new Color(187, 187, 187, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.0411319732666016f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new RadialGradientPaint(new Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, new Point2D.Double(8.824419021606445, 3.7561285495758057), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(163, 163, 163, 255)) : new Color(163, 163, 163, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 76, 76, 255)) : new Color(76, 76, 76, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_1
paint = new RadialGradientPaint(new Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, new Point2D.Double(8.143556594848633, 7.26789665222168), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(248, 248, 248, 255)) : new Color(248, 248, 248, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.666053771972656, 4.583946228027344, 32.77588653564453, 38.94638442993164, 0.2980971336364746, 0.2980971336364746);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.6464470028877258f, -0.03798932954668999f));
// _0_1_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.967081069946289f, 4.244972229003906f));
// _0_1_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.428f, 113.07f);
generalPath.curveTo(23.428f, 115.043f, 21.828f, 116.642f, 19.855f, 116.642f);
generalPath.curveTo(17.881f, 116.642f, 16.282f, 115.042f, 16.282f, 113.07f);
generalPath.curveTo(16.282f, 111.096f, 17.882f, 109.497f, 19.855f, 109.497f);
generalPath.curveTo(21.828f, 109.497f, 23.428f, 111.097f, 23.428f, 113.07f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.428f, 63.07f);
generalPath.curveTo(23.428f, 65.043f, 21.828f, 66.643f, 19.855f, 66.643f);
generalPath.curveTo(17.881f, 66.643f, 16.282f, 65.043f, 16.282f, 63.07f);
generalPath.curveTo(16.282f, 61.096f, 17.882f, 59.497f, 19.855f, 59.497f);
generalPath.curveTo(21.828f, 59.497f, 23.428f, 61.097f, 23.428f, 63.07f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.995011f, 29.952326f);
generalPath.curveTo(9.995011f, 30.40553f, 9.627486f, 30.772825f, 9.174282f, 30.772825f);
generalPath.curveTo(8.720848f, 30.772825f, 8.353554f, 30.4053f, 8.353554f, 29.952326f);
generalPath.curveTo(8.353554f, 29.498892f, 8.721078f, 29.131598f, 9.174282f, 29.131598f);
generalPath.curveTo(9.627486f, 29.131598f, 9.995011f, 29.499123f, 9.995011f, 29.952326f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(20.892099380493164, 114.56839752197266), 5.256f, new Point2D.Double(20.892099380493164, 114.56839752197266), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 240, 255)) : new Color(240, 240, 240, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 154, 154, 255)) : new Color(154, 154, 154, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.995011f, 18.467176f);
generalPath.curveTo(9.995011f, 18.92038f, 9.627486f, 19.287905f, 9.174282f, 19.287905f);
generalPath.curveTo(8.720848f, 19.287905f, 8.353554f, 18.92038f, 8.353554f, 18.467176f);
generalPath.curveTo(8.353554f, 18.013742f, 8.721078f, 17.646446f, 9.174282f, 17.646446f);
generalPath.curveTo(9.627486f, 17.646446f, 9.995011f, 18.013971f, 9.995011f, 18.467176f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(20.892099380493164, 64.56790161132812), 5.257f, new Point2D.Double(20.892099380493164, 64.56790161132812), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 240, 255)) : new Color(240, 240, 240, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 154, 154, 255)) : new Color(154, 154, 154, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_3
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 4)) : new Color(0, 0, 0, 4);
stroke = new BasicStroke(0.9885531f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.505723f, 5.4942765f);
generalPath.lineTo(11.505723f, 43.400867f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_4
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 52)) : new Color(255, 255, 255, 52);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(12.5f, 5.0205154f);
generalPath.lineTo(12.5f, 43.038227f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new RoundRectangle2D.Double(15.999985694885254, 31.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new RoundRectangle2D.Double(15.999985694885254, 33.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
shape = new RoundRectangle2D.Double(15.999985694885254, 35.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_3
shape = new RoundRectangle2D.Double(15.999985694885254, 37.0, 14.000014305114746, 1.0, 0.19290097057819366, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.66477275f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.6089820265769958f, 0.0f, 0.0f, 0.6062189936637878f, 12.8233003616333f, 10.55720043182373f));
// _0_2_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.512695f, 30.0f);
generalPath.lineTo(39.643234f, 30.0f);
generalPath.lineTo(39.643234f, 19.627375f);
generalPath.lineTo(5.512695f, 19.627375f);
generalPath.lineTo(5.512695f, 30.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.932600021362305, 24.627399444580078), new Point2D.Double(21.932600021362305, 7.109099864959717), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(133, 149, 188, 255)) : new Color(133, 149, 188, 255)),((colorFilter != null) ? colorFilter.filter(new Color(4, 26, 59, 255)) : new Color(4, 26, 59, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0989890098571777f, 0.0f, 0.0f, -0.7977570295333862f, -1.9538650512695312f, 37.32400131225586f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.512695f, 5.679136f);
generalPath.lineTo(39.643234f, 5.679136f);
generalPath.lineTo(39.643234f, 19.627375f);
generalPath.lineTo(5.512695f, 19.627375f);
generalPath.lineTo(5.512695f, 5.679136f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.1892169713974f, 0.0f, 0.0f, 1.1892169713974f, -3.525355100631714f, -6.535408020019531f));
// _0_2_4_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_2_0
g.setComposite(AlphaComposite.getInstance(3, 0.04999994f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.4f, 15.4f);
generalPath.curveTo(18.4f, 17.6f, 16.6f, 19.5f, 14.3f, 19.5f);
generalPath.curveTo(12.1f, 19.5f, 10.2f, 17.7f, 10.2f, 15.4f);
generalPath.curveTo(10.2f, 13.2f, 12.0f, 11.3f, 14.3f, 11.3f);
generalPath.curveTo(16.5f, 11.3f, 18.4f, 13.1f, 18.4f, 15.4f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(232, 245, 47, 255)) : new Color(232, 245, 47, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.20829993f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.0f, 15.4f);
generalPath.curveTo(18.0f, 17.4f, 16.4f, 19.1f, 14.3f, 19.1f);
generalPath.curveTo(12.3f, 19.1f, 10.6f, 17.5f, 10.6f, 15.4f);
generalPath.curveTo(10.6f, 13.4f, 12.2f, 11.7f, 14.3f, 11.7f);
generalPath.curveTo(16.3f, 11.7f, 18.0f, 13.3f, 18.0f, 15.4f);
generalPath.lineTo(18.0f, 15.4f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(236, 247, 81, 255)) : new Color(236, 247, 81, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.36669993f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_2_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.6f, 15.4f);
generalPath.curveTo(17.6f, 17.2f, 16.1f, 18.7f, 14.3f, 18.7f);
generalPath.curveTo(12.5f, 18.7f, 11.0f, 17.2f, 11.0f, 15.4f);
generalPath.curveTo(11.0f, 13.6f, 12.5f, 12.1f, 14.3f, 12.1f);
generalPath.curveTo(16.1f, 12.1f, 17.6f, 13.6f, 17.6f, 15.4f);
generalPath.lineTo(17.6f, 15.4f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(240, 249, 114, 255)) : new Color(240, 249, 114, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.525f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_2_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.2f, 15.4f);
generalPath.curveTo(17.2f, 17.0f, 15.9f, 18.3f, 14.3f, 18.3f);
generalPath.curveTo(12.7f, 18.3f, 11.4f, 17.0f, 11.4f, 15.4f);
generalPath.curveTo(11.4f, 13.8f, 12.7f, 12.5f, 14.3f, 12.5f);
generalPath.curveTo(15.9f, 12.5f, 17.2f, 13.8f, 17.2f, 15.4f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(244, 250, 149, 255)) : new Color(244, 250, 149, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.6833f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_2_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.8f, 15.4f);
generalPath.curveTo(16.8f, 16.8f, 15.7f, 17.9f, 14.3f, 17.9f);
generalPath.curveTo(12.9f, 17.9f, 11.8f, 16.8f, 11.8f, 15.4f);
generalPath.curveTo(11.8f, 14.0f, 12.9f, 12.9f, 14.3f, 12.9f);
generalPath.curveTo(15.7f, 12.9f, 16.8f, 14.0f, 16.8f, 15.4f);
generalPath.lineTo(16.8f, 15.4f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(247, 252, 183, 255)) : new Color(247, 252, 183, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.8417f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_2_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.4f, 15.4f);
generalPath.curveTo(16.4f, 16.6f, 15.4f, 17.5f, 14.3f, 17.5f);
generalPath.curveTo(13.2f, 17.5f, 12.2f, 16.5f, 12.2f, 15.4f);
generalPath.curveTo(12.2f, 14.3f, 13.2f, 13.3f, 14.3f, 13.3f);
generalPath.curveTo(15.4f, 13.3f, 16.4f, 14.3f, 16.4f, 15.4f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(251, 253, 219, 255)) : new Color(251, 253, 219, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_2_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.0f, 15.4f);
generalPath.curveTo(16.0f, 16.4f, 15.2f, 17.2f, 14.2f, 17.2f);
generalPath.curveTo(13.2f, 17.2f, 12.4f, 16.4f, 12.4f, 15.4f);
generalPath.curveTo(12.4f, 14.4f, 13.2f, 13.6f, 14.2f, 13.6f);
generalPath.curveTo(15.2f, 13.6f, 16.0f, 14.4f, 16.0f, 15.4f);
generalPath.lineTo(16.0f, 15.4f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.3f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.01586f, 21.649044f);
generalPath.lineTo(33.697147f, 21.649044f);
generalPath.lineTo(35.362053f, 22.124731f);
generalPath.lineTo(32.50793f, 22.124731f);
generalPath.curveTo(32.50793f, 22.124731f, 35.362053f, 22.362574f, 36.789116f, 24.1464f);
generalPath.curveTo(38.216175f, 25.811304f, 35.12421f, 27.832975f, 35.12421f, 27.832975f);
generalPath.curveTo(35.12421f, 27.832975f, 35.12421f, 27.832975f, 35.12421f, 27.832975f);
generalPath.curveTo(35.005287f, 27.47621f, 34.291756f, 24.622087f, 32.864697f, 23.43287f);
generalPath.curveTo(31.7944f, 22.481497f, 30.605183f, 22.243652f, 30.605183f, 22.243652f);
generalPath.lineTo(25.01586f, 22.243652f);
generalPath.lineTo(25.01586f, 21.767965f);
generalPath.lineTo(25.01586f, 21.649044f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.3f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.724106f, 22.362574f);
generalPath.lineTo(25.729391f, 22.362574f);
generalPath.lineTo(35.005287f, 27.59513f);
generalPath.lineTo(30.724106f, 22.362574f);
generalPath.lineTo(30.724106f, 22.362574f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.01586f, 21.767965f);
generalPath.lineTo(33.697147f, 21.767965f);
generalPath.lineTo(35.005287f, 20.935513f);
generalPath.lineTo(32.15117f, 20.935513f);
generalPath.curveTo(32.15117f, 20.935513f, 34.767445f, 20.459827f, 35.12421f, 17.486782f);
generalPath.curveTo(35.480972f, 14.513739f, 31.08087f, 11.183931f, 31.08087f, 11.183931f);
generalPath.curveTo(31.08087f, 11.183931f, 31.08087f, 11.183931f, 31.08087f, 11.302853f);
generalPath.curveTo(31.19979f, 12.016383f, 32.389008f, 17.011095f, 31.556557f, 18.913845f);
generalPath.curveTo(31.19979f, 20.578747f, 30.129496f, 20.935513f, 30.129496f, 20.935513f);
generalPath.lineTo(24.659094f, 20.935513f);
generalPath.lineTo(24.896938f, 21.767965f);
generalPath.lineTo(25.01586f, 21.767965f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(81, 81, 81, 255)) : new Color(81, 81, 81, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.248419f, 20.459827f);
generalPath.lineTo(25.253704f, 20.459827f);
generalPath.lineTo(31.19979f, 11.421773f);
generalPath.lineTo(30.248419f, 20.459827f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(81, 81, 81, 255)) : new Color(81, 81, 81, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(158, 158, 158, 255)) : new Color(158, 158, 158, 255);
stroke = new BasicStroke(0.9999986f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(16.508501052856445, 14.48575210571289, 19.995502471923828, 13.99746322631836);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_5
shape = new RoundRectangle2D.Double(15.999985694885254, 9.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_6
shape = new RoundRectangle2D.Double(15.999985694885254, 11.0, 14.000014305114746, 1.0, 0.19290097057819366, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
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
        return 6.10355281829834;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.1464462280273438;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 35.875;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 44.36908721923828;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private X_office_document() {
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
       X_office_document base = new X_office_document();
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
       X_office_document base = new X_office_document();
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
        return X_office_document::new;
    }
}

