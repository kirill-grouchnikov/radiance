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
public class ext_m3u implements ResizableIcon {
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
generalPath.moveTo(9.1, 91.2);
generalPath.lineTo(9.1, 71.3);
generalPath.lineTo(15.200001, 71.3);
generalPath.lineTo(18.800001, 84.9);
generalPath.lineTo(22.400002, 71.3);
generalPath.lineTo(28.500002, 71.3);
generalPath.lineTo(28.500002, 91.200005);
generalPath.lineTo(24.700003, 91.200005);
generalPath.lineTo(24.700003, 75.5);
generalPath.lineTo(20.700003, 91.2);
generalPath.lineTo(16.800003, 91.2);
generalPath.lineTo(12.800003, 75.5);
generalPath.lineTo(12.800003, 91.2);
generalPath.lineTo(9.1, 91.2);
generalPath.closePath();
generalPath.moveTo(31.5, 85.899994);
generalPath.lineTo(35.2, 85.49999);
generalPath.curveTo(35.3, 86.399994, 35.600002, 87.19999, 36.2, 87.69999);
generalPath.curveTo(36.7, 88.19999, 37.4, 88.39999, 38.100002, 88.39999);
generalPath.curveTo(38.9, 88.39999, 39.600002, 88.09998, 40.100002, 87.499985);
generalPath.curveTo(40.600002, 86.89999, 40.9, 86.09998, 40.9, 85.09998);
generalPath.curveTo(40.9, 84.09998, 40.600002, 83.39999, 40.100002, 82.79998);
generalPath.curveTo(39.600002, 82.199974, 38.9, 81.99998, 38.2, 81.99998);
generalPath.curveTo(37.7, 81.99998, 37.100002, 82.099976, 36.4, 82.29998);
generalPath.lineTo(36.800003, 79.19998);
generalPath.curveTo(37.800003, 79.19998, 38.600002, 78.999985, 39.200005, 78.499985);
generalPath.curveTo(39.700005, 77.999985, 40.000004, 77.39999, 40.000004, 76.59998);
generalPath.curveTo(40.000004, 75.89999, 39.800003, 75.39999, 39.400005, 74.999985);
generalPath.curveTo(39.000004, 74.59998, 38.500004, 74.39999, 37.800007, 74.39999);
generalPath.curveTo(37.100006, 74.39999, 36.600006, 74.59998, 36.100006, 75.09998);
generalPath.curveTo(35.600006, 75.59998, 35.300007, 76.19998, 35.200005, 77.09998);
generalPath.lineTo(31.600004, 76.499985);
generalPath.curveTo(31.800005, 75.29999, 32.200005, 74.29999, 32.700005, 73.59998);
generalPath.curveTo(33.200005, 72.89998, 33.900005, 72.29998, 34.800003, 71.89999);
generalPath.curveTo(35.700005, 71.499985, 36.700005, 71.29999, 37.800003, 71.29999);
generalPath.curveTo(39.700005, 71.29999, 41.200005, 71.89999, 42.4, 73.09999);
generalPath.curveTo(43.300003, 74.09999, 43.800003, 75.19999, 43.800003, 76.399994);
generalPath.curveTo(43.800003, 78.09999, 42.800003, 79.49999, 40.9, 80.59999);
generalPath.curveTo(42.100002, 80.79999, 43.0, 81.399994, 43.7, 82.19999);
generalPath.curveTo(44.4, 82.99999, 44.7, 84.09999, 44.7, 85.29999);
generalPath.curveTo(44.7, 86.999985, 44.100002, 88.499985, 42.8, 89.79999);
generalPath.curveTo(41.5, 90.999985, 39.899998, 91.59999, 38.0, 91.59999);
generalPath.curveTo(36.2, 91.59999, 34.7, 91.09999, 33.5, 89.99999);
generalPath.curveTo(32.4, 88.899994, 31.7, 87.59999, 31.5, 85.899994);
generalPath.closePath();
generalPath.moveTo(48.1, 71.299995);
generalPath.lineTo(52.199997, 71.299995);
generalPath.lineTo(52.199997, 82.0);
generalPath.curveTo(52.199997, 83.7, 52.299995, 84.8, 52.399998, 85.3);
generalPath.curveTo(52.6, 86.100006, 52.999996, 86.8, 53.6, 87.3);
generalPath.curveTo(54.3, 87.8, 55.1, 88.0, 56.3, 88.0);
generalPath.curveTo(57.5, 88.0, 58.3, 87.8, 58.899998, 87.3);
generalPath.curveTo(59.499996, 86.8, 59.8, 86.3, 59.999996, 85.600006);
generalPath.curveTo(60.099995, 84.90001, 60.199997, 83.8, 60.199997, 82.200005);
generalPath.lineTo(60.199997, 71.200005);
generalPath.lineTo(64.299995, 71.200005);
generalPath.lineTo(64.299995, 81.600006);
generalPath.curveTo(64.299995, 84.00001, 64.2, 85.700005, 63.999996, 86.700005);
generalPath.curveTo(63.799995, 87.700005, 63.399998, 88.50001, 62.799995, 89.200005);
generalPath.curveTo(62.199993, 89.9, 61.399994, 90.4, 60.399994, 90.8);
generalPath.curveTo(59.399994, 91.200005, 58.099995, 91.4, 56.499992, 91.4);
generalPath.curveTo(54.59999, 91.4, 53.09999, 91.200005, 52.09999, 90.700005);
generalPath.curveTo(51.09999, 90.3, 50.29999, 89.700005, 49.69999, 89.00001);
generalPath.curveTo(49.099987, 88.30001, 48.69999, 87.600006, 48.59999, 86.80001);
generalPath.curveTo(48.29999, 85.70001, 48.19999, 84.00001, 48.19999, 81.80001);
generalPath.lineTo(48.19999, 71.3);
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
generalPath.moveTo(15.2, 33.1);
generalPath.lineTo(38.6, 33.1);
generalPath.curveTo(39.8, 33.1, 40.8, 32.1, 40.8, 30.899998);
generalPath.curveTo(40.8, 29.699997, 39.8, 28.699997, 38.6, 28.699997);
generalPath.lineTo(15.2, 28.699997);
generalPath.curveTo(14.0, 28.699997, 13.0, 29.699997, 13.0, 30.899998);
generalPath.curveTo(13.0, 32.1, 14.0, 33.1, 15.2, 33.1);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.0, 30.927000045776367), new Point2D.Double(40.702999114990234, 30.927000045776367), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(15.2, 44.3);
generalPath.lineTo(38.6, 44.3);
generalPath.curveTo(39.8, 44.3, 40.8, 43.3, 40.8, 42.1);
generalPath.curveTo(40.8, 40.899998, 39.8, 39.899998, 38.6, 39.899998);
generalPath.lineTo(15.2, 39.899998);
generalPath.curveTo(14.0, 40.0, 13.0, 41.0, 13.0, 42.2);
generalPath.curveTo(13.0, 43.4, 14.0, 44.3, 15.2, 44.3);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.0, 42.18199920654297), new Point2D.Double(40.702999114990234, 42.18199920654297), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(26.4, 50.4);
generalPath.lineTo(15.2, 50.4);
generalPath.curveTo(14.0, 50.4, 13.0, 51.4, 13.0, 52.600002);
generalPath.curveTo(13.0, 53.800003, 14.0, 54.800003, 15.2, 54.800003);
generalPath.lineTo(26.5, 54.800003);
generalPath.curveTo(27.7, 54.800003, 28.7, 53.800003, 28.7, 52.600002);
generalPath.curveTo(28.7, 51.4, 27.6, 50.4, 26.400002, 50.4);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.0, 52.57099914550781), new Point2D.Double(28.58300018310547, 52.57099914550781), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.8, 32.6);
generalPath.curveTo(52.2, 31.8, 50.0, 30.499998, 49.2, 28.8);
generalPath.curveTo(49.2, 27.9, 48.4, 27.099998, 47.5, 27.099998);
generalPath.curveTo(46.6, 27.099998, 45.8, 27.899998, 45.8, 28.8);
generalPath.lineTo(45.8, 50.699997);
generalPath.curveTo(44.1, 49.799995, 40.8, 50.1, 38.3, 51.499996);
generalPath.curveTo(34.399998, 53.599995, 32.8, 57.699997, 34.5, 60.499996);
generalPath.curveTo(36.2, 63.299995, 40.7, 63.899998, 44.6, 61.699997);
generalPath.curveTo(47.3, 60.199997, 49.1, 57.699997, 49.199997, 55.299995);
generalPath.lineTo(49.199997, 36.4);
generalPath.curveTo(54.799995, 36.4, 58.1, 38.600002, 56.799995, 44.100002);
generalPath.curveTo(56.599995, 45.100002, 56.199997, 46.100002, 55.799995, 47.000004);
generalPath.curveTo(55.599995, 47.300003, 55.599995, 47.700005, 55.899994, 48.000004);
generalPath.curveTo(56.199993, 48.300003, 56.699993, 48.200005, 57.099995, 47.800003);
generalPath.curveTo(59.199993, 45.800003, 60.399994, 43.100002, 60.599995, 40.200005);
generalPath.curveTo(60.699993, 36.300003, 56.999996, 34.100006, 53.799995, 32.600006);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.935001373291016, 45.04399871826172), new Point2D.Double(60.632999420166016, 45.04399871826172), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_0
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
// _0_6_1
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
	private ext_m3u() {
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
       ext_m3u base = new ext_m3u();
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
       ext_m3u base = new ext_m3u();
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
        return ext_m3u::new;
    }
}

