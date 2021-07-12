package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_codekit implements NeonIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(13.5f, 45.7f);
generalPath.lineTo(27.5f, 33.6f);
generalPath.lineTo(27.5f, 39.699997f);
generalPath.lineTo(18.0f, 47.699997f);
generalPath.lineTo(18.0f, 47.799995f);
generalPath.lineTo(27.5f, 55.699997f);
generalPath.lineTo(27.5f, 61.799995f);
generalPath.lineTo(13.5f, 49.699997f);
generalPath.lineTo(13.5f, 45.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(20.513999938964844, 61.792999267578125), new Point2D.Double(20.513999938964844, 33.60300064086914), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(20.513999938964844, 63.979000091552734), new Point2D.Double(20.513999938964844, 31.417999267578125), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.5f, 45.7f);
generalPath.lineTo(27.5f, 33.6f);
generalPath.lineTo(27.5f, 39.699997f);
generalPath.lineTo(18.0f, 47.699997f);
generalPath.lineTo(18.0f, 47.799995f);
generalPath.lineTo(27.5f, 55.699997f);
generalPath.lineTo(27.5f, 61.799995f);
generalPath.lineTo(13.5f, 49.699997f);
generalPath.lineTo(13.5f, 45.699997f);
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
generalPath.moveTo(45.7f, 55.8f);
generalPath.lineTo(55.2f, 47.899998f);
generalPath.lineTo(55.2f, 47.8f);
generalPath.lineTo(45.7f, 39.899998f);
generalPath.lineTo(45.7f, 33.8f);
generalPath.lineTo(59.7f, 45.9f);
generalPath.lineTo(59.7f, 50.0f);
generalPath.lineTo(45.7f, 62.1f);
generalPath.lineTo(45.7f, 55.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(52.68600082397461, 62.051998138427734), new Point2D.Double(52.68600082397461, 33.689998626708984), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(52.68600082397461, 64.23799896240234), new Point2D.Double(52.68600082397461, 31.503999710083008), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.7f, 55.8f);
generalPath.lineTo(55.2f, 47.899998f);
generalPath.lineTo(55.2f, 47.8f);
generalPath.lineTo(45.7f, 39.899998f);
generalPath.lineTo(45.7f, 33.8f);
generalPath.lineTo(59.7f, 45.9f);
generalPath.lineTo(59.7f, 50.0f);
generalPath.lineTo(45.7f, 62.1f);
generalPath.lineTo(45.7f, 55.8f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(11.2f, 86.8f);
generalPath.lineTo(13.2f, 87.600006f);
generalPath.curveTo(12.9f, 89.00001f, 12.4f, 90.100006f, 11.7f, 90.700005f);
generalPath.curveTo(11.0f, 91.4f, 10.099999f, 91.700005f, 9.0f, 91.700005f);
generalPath.curveTo(7.6f, 91.700005f, 6.5f, 91.100006f, 5.7f, 89.9f);
generalPath.curveTo(4.7999997f, 88.700005f, 4.3999996f, 87.1f, 4.3999996f, 85.1f);
generalPath.curveTo(4.3999996f, 83.0f, 4.7999997f, 81.299995f, 5.7f, 80.1f);
generalPath.curveTo(6.6f, 78.9f, 7.7f, 78.299995f, 9.2f, 78.299995f);
generalPath.curveTo(10.4f, 78.299995f, 11.5f, 78.799995f, 12.2f, 79.7f);
generalPath.curveTo(12.7f, 80.299995f, 13.0f, 81.0f, 13.2f, 82.1f);
generalPath.lineTo(11.2f, 82.7f);
generalPath.curveTo(11.099999f, 82.0f, 10.8f, 81.5f, 10.4f, 81.1f);
generalPath.curveTo(9.999999f, 80.7f, 9.599999f, 80.5f, 9.0f, 80.5f);
generalPath.curveTo(8.2f, 80.5f, 7.6f, 80.8f, 7.2f, 81.5f);
generalPath.curveTo(6.7f, 82.2f, 6.5f, 83.3f, 6.5f, 84.8f);
generalPath.curveTo(6.5f, 86.4f, 6.7f, 87.600006f, 7.2f, 88.3f);
generalPath.curveTo(7.7f, 89.0f, 8.3f, 89.3f, 9.0f, 89.3f);
generalPath.curveTo(9.5f, 89.3f, 10.0f, 89.100006f, 10.4f, 88.600006f);
generalPath.curveTo(10.799999f, 88.100006f, 11.0f, 87.700005f, 11.2f, 86.8f);
generalPath.closePath();
generalPath.moveTo(14.5f, 85.200005f);
generalPath.curveTo(14.5f, 83.9f, 14.7f, 82.8f, 15.0f, 81.9f);
generalPath.curveTo(15.2f, 81.200005f, 15.5f, 80.700005f, 15.9f, 80.1f);
generalPath.curveTo(16.3f, 79.49999f, 16.699999f, 79.2f, 17.199999f, 78.9f);
generalPath.curveTo(17.8f, 78.6f, 18.599998f, 78.4f, 19.4f, 78.4f);
generalPath.curveTo(20.9f, 78.4f, 22.1f, 79.0f, 23.0f, 80.200005f);
generalPath.curveTo(23.9f, 81.4f, 24.4f, 83.00001f, 24.4f, 85.100006f);
generalPath.curveTo(24.4f, 87.200005f, 24.0f, 88.8f, 23.1f, 90.00001f);
generalPath.curveTo(22.2f, 91.200005f, 21.0f, 91.80001f, 19.5f, 91.80001f);
generalPath.curveTo(18.0f, 91.80001f, 16.8f, 91.20001f, 15.9f, 90.00001f);
generalPath.curveTo(14.9f, 88.80001f, 14.5f, 87.200005f, 14.5f, 85.200005f);
generalPath.closePath();
generalPath.moveTo(16.6f, 85.100006f);
generalPath.curveTo(16.6f, 86.600006f, 16.9f, 87.700005f, 17.4f, 88.40001f);
generalPath.curveTo(17.9f, 89.10001f, 18.6f, 89.50001f, 19.4f, 89.50001f);
generalPath.curveTo(20.199999f, 89.50001f, 20.9f, 89.100006f, 21.4f, 88.40001f);
generalPath.curveTo(21.9f, 87.70001f, 22.199999f, 86.50001f, 22.199999f, 85.00001f);
generalPath.curveTo(22.199999f, 83.50001f, 21.9f, 82.40001f, 21.4f, 81.700005f);
generalPath.curveTo(20.9f, 81.00001f, 20.199999f, 80.600006f, 19.4f, 80.600006f);
generalPath.curveTo(18.6f, 80.600006f, 17.9f, 81.00001f, 17.4f, 81.700005f);
generalPath.curveTo(16.9f, 82.4f, 16.6f, 83.600006f, 16.6f, 85.100006f);
generalPath.closePath();
generalPath.moveTo(26.0f, 78.700005f);
generalPath.lineTo(29.8f, 78.700005f);
generalPath.curveTo(30.599998f, 78.700005f, 31.3f, 78.8f, 31.699999f, 78.9f);
generalPath.curveTo(32.3f, 79.1f, 32.8f, 79.5f, 33.199997f, 80.1f);
generalPath.curveTo(33.6f, 80.7f, 33.899998f, 81.4f, 34.199997f, 82.2f);
generalPath.curveTo(34.399998f, 83.0f, 34.499996f, 84.0f, 34.499996f, 85.2f);
generalPath.curveTo(34.499996f, 86.299995f, 34.399998f, 87.2f, 34.199997f, 87.899994f);
generalPath.curveTo(33.899998f, 88.799995f, 33.6f, 89.59999f, 33.1f, 90.2f);
generalPath.curveTo(32.699997f, 90.6f, 32.3f, 91.0f, 31.699999f, 91.2f);
generalPath.curveTo(31.199999f, 91.399994f, 30.599998f, 91.5f, 29.9f, 91.5f);
generalPath.lineTo(26.0f, 91.5f);
generalPath.lineTo(26.0f, 78.7f);
generalPath.closePath();
generalPath.moveTo(28.0f, 80.8f);
generalPath.lineTo(28.0f, 89.3f);
generalPath.lineTo(29.5f, 89.3f);
generalPath.curveTo(30.1f, 89.3f, 30.5f, 89.3f, 30.7f, 89.200005f);
generalPath.curveTo(31.0f, 89.100006f, 31.300001f, 88.9f, 31.5f, 88.700005f);
generalPath.curveTo(31.699999f, 88.50001f, 31.9f, 88.00001f, 32.0f, 87.50001f);
generalPath.curveTo(32.1f, 86.90001f, 32.2f, 86.100006f, 32.2f, 85.100006f);
generalPath.curveTo(32.2f, 84.100006f, 32.100002f, 83.3f, 32.0f, 82.8f);
generalPath.curveTo(31.899998f, 82.3f, 31.7f, 81.9f, 31.4f, 81.600006f);
generalPath.curveTo(31.199999f, 81.3f, 30.8f, 81.100006f, 30.4f, 81.00001f);
generalPath.curveTo(30.1f, 80.90001f, 29.6f, 80.90001f, 28.699999f, 80.90001f);
generalPath.lineTo(28.0f, 80.90001f);
generalPath.closePath();
generalPath.moveTo(36.2f, 91.5f);
generalPath.lineTo(36.2f, 78.7f);
generalPath.lineTo(43.7f, 78.7f);
generalPath.lineTo(43.7f, 80.899994f);
generalPath.lineTo(38.2f, 80.899994f);
generalPath.lineTo(38.2f, 83.799995f);
generalPath.lineTo(43.3f, 83.799995f);
generalPath.lineTo(43.3f, 86.0f);
generalPath.lineTo(38.2f, 86.0f);
generalPath.lineTo(38.2f, 89.5f);
generalPath.lineTo(44.0f, 89.5f);
generalPath.lineTo(44.0f, 91.7f);
generalPath.lineTo(36.2f, 91.7f);
generalPath.closePath();
generalPath.moveTo(45.800003f, 91.5f);
generalPath.lineTo(45.800003f, 78.7f);
generalPath.lineTo(47.9f, 78.7f);
generalPath.lineTo(47.9f, 84.399994f);
generalPath.lineTo(52.100002f, 78.7f);
generalPath.lineTo(54.9f, 78.7f);
generalPath.lineTo(51.100002f, 83.7f);
generalPath.lineTo(55.100002f, 91.6f);
generalPath.lineTo(52.4f, 91.6f);
generalPath.lineTo(49.600002f, 85.6f);
generalPath.lineTo(47.9f, 87.799995f);
generalPath.lineTo(47.9f, 91.7f);
generalPath.lineTo(45.800003f, 91.7f);
generalPath.closePath();
generalPath.moveTo(55.9f, 91.5f);
generalPath.lineTo(55.9f, 78.7f);
generalPath.lineTo(58.0f, 78.7f);
generalPath.lineTo(58.0f, 91.6f);
generalPath.lineTo(55.9f, 91.6f);
generalPath.closePath();
generalPath.moveTo(62.2f, 91.5f);
generalPath.lineTo(62.2f, 80.8f);
generalPath.lineTo(59.2f, 80.8f);
generalPath.lineTo(59.2f, 78.600006f);
generalPath.lineTo(67.3f, 78.600006f);
generalPath.lineTo(67.3f, 80.8f);
generalPath.lineTo(64.3f, 80.8f);
generalPath.lineTo(64.3f, 91.5f);
generalPath.lineTo(62.200005f, 91.5f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
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
		return 0.7400000095367432;
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
	private ext_codekit() {
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
    public static NeonIcon of(int width, int height) {
       ext_codekit base = new ext_codekit();
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
       ext_codekit base = new ext_codekit();
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
        return ext_codekit::new;
    }
}

