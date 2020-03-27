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
public class ext_adn implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(-0.2, 99.0);
generalPath.lineTo(-0.2, 1.0);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(-0.2, 99.0);
generalPath.lineTo(-0.2, 1.0);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(160, 53, 55, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(-0.2, 99.0);
generalPath.lineTo(-0.2, 1.0);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(26.1, 91.1);
generalPath.lineTo(21.7, 91.1);
generalPath.lineTo(19.900002, 86.6);
generalPath.lineTo(11.800001, 86.6);
generalPath.lineTo(10.100001, 91.1);
generalPath.lineTo(5.8, 91.1);
generalPath.lineTo(13.700001, 71.3);
generalPath.lineTo(18.0, 71.3);
generalPath.lineTo(26.1, 91.100006);
generalPath.closePath();
generalPath.moveTo(18.6, 83.2);
generalPath.lineTo(15.8, 75.799995);
generalPath.lineTo(13.1, 83.2);
generalPath.lineTo(18.6, 83.2);
generalPath.closePath();
generalPath.moveTo(28.2, 71.2);
generalPath.lineTo(35.600002, 71.2);
generalPath.curveTo(37.300003, 71.2, 38.600002, 71.299995, 39.4, 71.6);
generalPath.curveTo(40.600002, 71.9, 41.600002, 72.6, 42.4, 73.4);
generalPath.curveTo(43.2, 74.200005, 43.9, 75.3, 44.300003, 76.6);
generalPath.curveTo(44.700005, 77.9, 45.000004, 79.4, 45.000004, 81.299995);
generalPath.curveTo(45.000004, 82.899994, 44.800003, 84.299995, 44.400005, 85.49999);
generalPath.curveTo(43.900005, 86.899994, 43.200005, 88.09999, 42.200005, 88.99999);
generalPath.curveTo(41.500004, 89.69999, 40.500004, 90.19999, 39.300003, 90.59999);
generalPath.curveTo(38.4, 90.899994, 37.200005, 90.99999, 35.700005, 90.99999);
generalPath.lineTo(28.0, 90.99999);
generalPath.lineTo(28.0, 71.2);
generalPath.closePath();
generalPath.moveTo(32.3, 74.6);
generalPath.lineTo(32.3, 87.7);
generalPath.lineTo(35.3, 87.7);
generalPath.curveTo(36.399998, 87.7, 37.3, 87.6, 37.8, 87.5);
generalPath.curveTo(38.5, 87.3, 39.0, 87.1, 39.399998, 86.7);
generalPath.curveTo(39.799995, 86.299995, 40.199997, 85.7, 40.499996, 84.799995);
generalPath.curveTo(40.799995, 83.899994, 40.899998, 82.7, 40.899998, 81.2);
generalPath.curveTo(40.899998, 79.7, 40.8, 78.5, 40.499996, 77.7);
generalPath.curveTo(40.199993, 76.899994, 39.799995, 76.2, 39.299995, 75.799995);
generalPath.curveTo(38.799995, 75.299995, 38.199997, 74.99999, 37.399994, 74.899994);
generalPath.curveTo(36.799995, 74.799995, 35.699993, 74.7, 34.099995, 74.7);
generalPath.lineTo(32.299995, 74.7);
generalPath.closePath();
generalPath.moveTo(48.6, 91.1);
generalPath.lineTo(48.6, 71.2);
generalPath.lineTo(52.6, 71.2);
generalPath.lineTo(60.899998, 84.399994);
generalPath.lineTo(60.899998, 71.2);
generalPath.lineTo(64.7, 71.2);
generalPath.lineTo(64.7, 91.0);
generalPath.lineTo(60.6, 91.0);
generalPath.lineTo(52.5, 78.1);
generalPath.lineTo(52.5, 91.0);
generalPath.lineTo(48.6, 91.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(54.0, 48.1);
generalPath.curveTo(54.0, 50.6, 45.9, 52.6, 36.0, 52.6);
generalPath.curveTo(26.099998, 52.6, 18.0, 50.6, 18.0, 48.1);
generalPath.curveTo(18.0, 45.6, 26.1, 43.6, 36.0, 43.6);
generalPath.curveTo(45.9, 43.6, 54.0, 45.6, 54.0, 48.1);
generalPath.closePath();
shape = generalPath;
paint = new Color(242, 242, 242, 255);
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
generalPath.moveTo(49.5, 47.8);
generalPath.curveTo(49.5, 50.0, 43.5, 51.7, 36.0, 51.7);
generalPath.curveTo(28.5, 51.7, 22.5, 50.0, 22.5, 47.8);
generalPath.curveTo(22.5, 45.6, 28.5, 43.899998, 36.0, 43.899998);
generalPath.curveTo(43.5, 43.899998, 49.5, 45.6, 49.5, 47.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 47.22200012207031), new Point2D.Double(43.02799987792969, 61.27799987792969), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(18.0, 48.3);
generalPath.lineTo(18.0, 59.5);
generalPath.curveTo(18.0, 59.5, 22.5, 64.0, 36.0, 64.0);
generalPath.curveTo(49.5, 64.0, 54.0, 59.5, 54.0, 59.5);
generalPath.lineTo(54.0, 48.3);
generalPath.curveTo(54.0, 48.3, 51.8, 52.2, 36.0, 52.5);
generalPath.curveTo(20.2, 52.8, 18.0, 48.3, 18.0, 48.3);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 45.900001525878906), new Point2D.Double(54.0, 45.900001525878906), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.0, 32.3);
generalPath.curveTo(54.0, 34.8, 45.9, 36.8, 36.0, 36.8);
generalPath.curveTo(26.099998, 36.8, 18.0, 34.8, 18.0, 32.3);
generalPath.curveTo(18.0, 29.8, 26.1, 27.8, 36.0, 27.8);
generalPath.curveTo(45.9, 27.8, 54.0, 29.8, 54.0, 32.3);
generalPath.closePath();
shape = generalPath;
paint = new Color(242, 242, 242, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.5, 31.9);
generalPath.curveTo(49.5, 34.1, 43.5, 35.8, 36.0, 35.8);
generalPath.curveTo(28.5, 35.8, 22.5, 34.1, 22.5, 31.9);
generalPath.curveTo(22.5, 29.7, 28.5, 28.0, 36.0, 28.0);
generalPath.curveTo(43.5, 28.1, 49.5, 29.8, 49.5, 31.9);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.95400047302246, 63.00400161743164), new Point2D.Double(43.0099983215332, 77.05999755859375), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.0, 32.6);
generalPath.lineTo(18.0, 43.8);
generalPath.curveTo(18.0, 43.8, 22.5, 48.3, 36.0, 48.3);
generalPath.curveTo(49.5, 48.3, 54.0, 43.8, 54.0, 43.8);
generalPath.lineTo(54.0, 32.6);
generalPath.curveTo(54.0, 32.6, 51.8, 36.5, 36.0, 36.8);
generalPath.curveTo(20.2, 37.1, 18.0, 32.6, 18.0, 32.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 61.599998474121094), new Point2D.Double(54.0, 61.599998474121094), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.0, 16.6);
generalPath.curveTo(54.0, 19.1, 45.9, 21.1, 36.0, 21.1);
generalPath.curveTo(26.099998, 21.1, 18.0, 19.1, 18.0, 16.6);
generalPath.curveTo(18.0, 14.1, 26.1, 12.1, 36.0, 12.1);
generalPath.curveTo(45.9, 12.1, 54.0, 14.1, 54.0, 16.6);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.5, 16.3);
generalPath.curveTo(49.5, 18.5, 43.5, 20.199999, 36.0, 20.199999);
generalPath.curveTo(28.5, 20.199999, 22.5, 18.499998, 22.5, 16.3);
generalPath.curveTo(22.5, 14.1, 28.5, 12.4, 36.0, 12.4);
generalPath.curveTo(43.5, 12.4, 49.5, 14.099999, 49.5, 16.3);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 78.72200012207031), new Point2D.Double(43.02799987792969, 92.77799987792969), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.0, 16.8);
generalPath.lineTo(18.0, 28.0);
generalPath.curveTo(18.0, 28.0, 22.5, 32.5, 36.0, 32.5);
generalPath.curveTo(49.5, 32.5, 54.0, 28.0, 54.0, 28.0);
generalPath.lineTo(54.0, 16.8);
generalPath.curveTo(54.0, 16.8, 51.8, 20.699999, 36.0, 21.0);
generalPath.curveTo(20.2, 21.3, 18.0, 16.8, 18.0, 16.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 77.4000015258789), new Point2D.Double(54.0, 77.4000015258789), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.1, 27.7);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.1, 1.0);
generalPath.lineTo(71.3, 27.7);
generalPath.lineTo(44.1, 27.7);
generalPath.lineTo(44.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(160, 53, 55, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.1, 1.0);
generalPath.lineTo(71.3, 27.7);
generalPath.lineTo(44.1, 27.7);
generalPath.lineTo(44.1, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
        return 0.12799999117851257;
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
		return 0.7450000047683716;
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
	private ext_adn() {
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
       ext_adn base = new ext_adn();
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
       ext_adn base = new ext_adn();
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
        return ext_adn::new;
    }
}

