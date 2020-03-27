package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_ram implements ResizableIcon {
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
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(72.3, 99.1);
generalPath.lineTo(0.0, 99.1);
generalPath.lineTo(0.0, 0.9);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.150001525878906, 2.88700008392334), new Point2D.Double(36.150001525878906, 101.1259994506836), new float[] {0.0f,0.012f,0.182f,0.352f,0.521f,0.687f,0.848f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(91, 87, 148, 255),new Color(123, 119, 170, 255),new Color(152, 150, 191, 255),new Color(178, 178, 210, 255),new Color(199, 201, 226, 255),new Color(214, 217, 236, 255),new Color(219, 223, 240, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(72.3, 99.1);
generalPath.lineTo(0.0, 99.1);
generalPath.lineTo(0.0, 0.9);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(72.3, 99.1);
generalPath.lineTo(0.0, 99.1);
generalPath.lineTo(0.0, 0.9);
generalPath.lineTo(45.2, 0.9);
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
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.4, 91.2);
generalPath.lineTo(6.4, 71.3);
generalPath.lineTo(14.9, 71.3);
generalPath.curveTo(17.0, 71.3, 18.6, 71.5, 19.599998, 71.8);
generalPath.curveTo(20.599998, 72.200005, 21.399998, 72.8, 21.899998, 73.700005);
generalPath.curveTo(22.499998, 74.600006, 22.799997, 75.700005, 22.799997, 76.8);
generalPath.curveTo(22.799997, 78.3, 22.399998, 79.5, 21.499998, 80.5);
generalPath.curveTo(20.599998, 81.5, 19.299997, 82.1, 17.499998, 82.3);
generalPath.curveTo(18.399998, 82.8, 19.099998, 83.4, 19.699999, 84.0);
generalPath.curveTo(20.3, 84.6, 20.999998, 85.7, 21.999998, 87.2);
generalPath.lineTo(24.499998, 91.1);
generalPath.lineTo(19.599998, 91.1);
generalPath.lineTo(16.699999, 86.799995);
generalPath.curveTo(15.699999, 85.299995, 14.899999, 84.299995, 14.599998, 83.899994);
generalPath.curveTo(14.199999, 83.49999, 13.799998, 83.2, 13.399999, 83.09999);
generalPath.curveTo(12.999999, 82.99999, 12.299998, 82.899994, 11.399999, 82.899994);
generalPath.lineTo(10.599998, 82.899994);
generalPath.lineTo(10.599998, 91.2);
generalPath.lineTo(6.4, 91.2);
generalPath.closePath();
generalPath.moveTo(10.4, 79.7);
generalPath.lineTo(13.4, 79.7);
generalPath.curveTo(15.299999, 79.7, 16.6, 79.6, 17.0, 79.5);
generalPath.curveTo(17.5, 79.3, 17.9, 79.1, 18.1, 78.7);
generalPath.curveTo(18.4, 78.299995, 18.5, 77.799995, 18.5, 77.2);
generalPath.curveTo(18.5, 76.5, 18.3, 76.0, 18.0, 75.6);
generalPath.curveTo(17.6, 75.2, 17.1, 74.9, 16.5, 74.799995);
generalPath.curveTo(16.2, 74.799995, 15.2, 74.7, 13.5, 74.7);
generalPath.lineTo(10.3, 74.7);
generalPath.lineTo(10.3, 79.7);
generalPath.closePath();
generalPath.moveTo(44.800003, 91.2);
generalPath.lineTo(40.4, 91.2);
generalPath.lineTo(38.600002, 86.7);
generalPath.lineTo(30.600002, 86.7);
generalPath.lineTo(28.900002, 91.2);
generalPath.lineTo(24.600002, 91.2);
generalPath.lineTo(32.4, 71.299995);
generalPath.lineTo(36.7, 71.299995);
generalPath.lineTo(44.800003, 91.2);
generalPath.closePath();
generalPath.moveTo(37.300003, 83.299995);
generalPath.lineTo(34.500004, 75.899994);
generalPath.lineTo(31.800003, 83.299995);
generalPath.lineTo(37.300003, 83.299995);
generalPath.closePath();
generalPath.moveTo(46.9, 91.2);
generalPath.lineTo(46.9, 71.3);
generalPath.lineTo(53.0, 71.3);
generalPath.lineTo(56.7, 84.9);
generalPath.lineTo(60.3, 71.3);
generalPath.lineTo(66.4, 71.3);
generalPath.lineTo(66.4, 91.200005);
generalPath.lineTo(62.600002, 91.200005);
generalPath.lineTo(62.600002, 75.5);
generalPath.lineTo(58.600002, 91.2);
generalPath.lineTo(54.7, 91.2);
generalPath.lineTo(50.7, 75.5);
generalPath.lineTo(50.7, 91.2);
generalPath.lineTo(46.9, 91.2);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.3, 54.7);
generalPath.lineTo(13.599999, 45.1);
generalPath.lineTo(13.599999, 45.0);
generalPath.lineTo(22.3, 35.4);
generalPath.lineTo(22.3, 29.0);
generalPath.lineTo(10.8, 42.5);
generalPath.lineTo(10.8, 47.6);
generalPath.lineTo(22.3, 61.1);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(10.784000396728516, 45.05400085449219), new Point2D.Double(22.30699920654297, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(10.034000396728516, 45.05400085449219), new Point2D.Double(23.05699920654297, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.3, 54.7);
generalPath.lineTo(13.599999, 45.1);
generalPath.lineTo(13.599999, 45.0);
generalPath.lineTo(22.3, 35.4);
generalPath.lineTo(22.3, 29.0);
generalPath.lineTo(10.8, 42.5);
generalPath.lineTo(10.8, 47.6);
generalPath.lineTo(22.3, 61.1);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.5, 29.0);
generalPath.lineTo(51.5, 35.4);
generalPath.lineTo(60.4, 45.0);
generalPath.lineTo(60.4, 45.1);
generalPath.lineTo(51.5, 54.699997);
generalPath.lineTo(51.5, 61.1);
generalPath.lineTo(63.0, 47.8);
generalPath.lineTo(63.0, 42.3);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(51.47600173950195, 45.05400085449219), new Point2D.Double(63.0, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(50.72600173950195, 45.05400085449219), new Point2D.Double(63.75, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.5, 29.0);
generalPath.lineTo(51.5, 35.4);
generalPath.lineTo(60.4, 45.0);
generalPath.lineTo(60.4, 45.1);
generalPath.lineTo(51.5, 54.699997);
generalPath.lineTo(51.5, 61.1);
generalPath.lineTo(63.0, 47.8);
generalPath.lineTo(63.0, 42.3);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(42.8, 33.9);
generalPath.curveTo(41.3, 33.2, 39.399998, 32.100002, 38.7, 30.500002);
generalPath.curveTo(38.7, 29.700003, 38.0, 29.000002, 37.2, 29.000002);
generalPath.curveTo(36.4, 29.000002, 35.7, 29.700003, 35.7, 30.500002);
generalPath.lineTo(35.7, 50.100002);
generalPath.curveTo(34.2, 49.300003, 31.300001, 49.500004, 29.0, 50.800003);
generalPath.curveTo(25.6, 52.700005, 24.1, 56.300003, 25.6, 58.9);
generalPath.curveTo(27.1, 61.4, 31.2, 61.9, 34.6, 60.0);
generalPath.curveTo(37.0, 58.7, 38.6, 56.4, 38.699997, 54.2);
generalPath.lineTo(38.699997, 37.3);
generalPath.curveTo(43.699997, 37.3, 46.6, 39.3, 45.499996, 44.1);
generalPath.curveTo(45.299995, 45.0, 44.999996, 45.899998, 44.599995, 46.699997);
generalPath.curveTo(44.399994, 46.999996, 44.399994, 47.299995, 44.699993, 47.6);
generalPath.curveTo(44.899994, 47.8, 45.399994, 47.8, 45.79999, 47.399998);
generalPath.curveTo(47.699993, 45.6, 48.79999, 43.199997, 48.89999, 40.6);
generalPath.curveTo(48.99999, 37.3, 45.69999, 35.199997, 42.79999, 33.899998);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.065000534057617, 45.04399871826172), new Point2D.Double(48.935001373291016, 45.04399871826172), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(24.565000534057617, 45.04399871826172), new Point2D.Double(49.435001373291016, 45.04399871826172), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(42.8, 33.9);
generalPath.curveTo(41.3, 33.2, 39.399998, 32.100002, 38.7, 30.500002);
generalPath.curveTo(38.7, 29.700003, 38.0, 29.000002, 37.2, 29.000002);
generalPath.curveTo(36.4, 29.000002, 35.7, 29.700003, 35.7, 30.500002);
generalPath.lineTo(35.7, 50.100002);
generalPath.curveTo(34.2, 49.300003, 31.300001, 49.500004, 29.0, 50.800003);
generalPath.curveTo(25.6, 52.700005, 24.1, 56.300003, 25.6, 58.9);
generalPath.curveTo(27.1, 61.4, 31.2, 61.9, 34.6, 60.0);
generalPath.curveTo(37.0, 58.7, 38.6, 56.4, 38.699997, 54.2);
generalPath.lineTo(38.699997, 37.3);
generalPath.curveTo(43.699997, 37.3, 46.6, 39.3, 45.499996, 44.1);
generalPath.curveTo(45.299995, 45.0, 44.999996, 45.899998, 44.599995, 46.699997);
generalPath.curveTo(44.399994, 46.999996, 44.399994, 47.299995, 44.699993, 47.6);
generalPath.curveTo(44.899994, 47.8, 45.399994, 47.8, 45.79999, 47.399998);
generalPath.curveTo(47.699993, 45.6, 48.79999, 43.199997, 48.89999, 40.6);
generalPath.curveTo(48.99999, 37.3, 45.69999, 35.199997, 42.79999, 33.899998);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(45.2, 27.699999);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(58.32099914550781, 87.27300262451172), new Point2D.Double(50.78300094604492, 78.83899688720703), new float[] {0.0f,0.07f,0.159f,0.255f,0.359f,0.471f,0.598f,0.751f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(112, 108, 162, 255),new Color(137, 136, 181, 255),new Color(163, 165, 200, 255),new Color(186, 191, 217, 255),new Color(206, 213, 231, 255),new Color(222, 230, 242, 255),new Color(233, 243, 250, 255),new Color(236, 248, 254, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(45.2, 27.699999);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(45.2, 27.699999);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
        return 0.12999999523162842;
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
		return 0.7430000305175781;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_ram() {
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
       ext_ram base = new ext_ram();
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
       ext_ram base = new ext_ram();
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
        return ext_ram::new;
    }
}

