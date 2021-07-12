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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_indd implements NeonIcon {
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(72.2f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, -1.0), new Point2D.Double(36.20000076293945, 97.0), new float[] {0.312f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 234, 246, 255)) : new Color(255, 234, 246, 255)),((colorFilter != null) ? colorFilter.filter(new Color(219, 0, 123, 255)) : new Color(219, 0, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(72.2f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(219, 0, 123, 255)) : new Color(219, 0, 123, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(72.2f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(8.7f, 91.1f);
generalPath.lineTo(8.7f, 73.9f);
generalPath.lineTo(12.2f, 73.9f);
generalPath.lineTo(12.2f, 91.100006f);
generalPath.lineTo(8.7f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(15.6f, 91.1f);
generalPath.lineTo(15.6f, 73.9f);
generalPath.lineTo(19.0f, 73.9f);
generalPath.lineTo(26.1f, 85.4f);
generalPath.lineTo(26.1f, 73.9f);
generalPath.lineTo(29.4f, 73.9f);
generalPath.lineTo(29.4f, 91.100006f);
generalPath.lineTo(25.9f, 91.100006f);
generalPath.lineTo(18.9f, 79.90001f);
generalPath.lineTo(18.9f, 91.100006f);
generalPath.lineTo(15.599999f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(33.0f, 73.9f);
generalPath.lineTo(39.4f, 73.9f);
generalPath.curveTo(40.800003f, 73.9f, 41.9f, 74.0f, 42.7f, 74.200005f);
generalPath.curveTo(43.7f, 74.50001f, 44.600002f, 75.00001f, 45.3f, 75.8f);
generalPath.curveTo(45.999996f, 76.6f, 46.6f, 77.5f, 47.0f, 78.600006f);
generalPath.curveTo(47.4f, 79.70001f, 47.6f, 81.100006f, 47.6f, 82.700005f);
generalPath.curveTo(47.6f, 84.100006f, 47.399998f, 85.3f, 47.1f, 86.4f);
generalPath.curveTo(46.699997f, 87.6f, 46.0f, 88.700005f, 45.199997f, 89.4f);
generalPath.curveTo(44.6f, 90.0f, 43.799995f, 90.4f, 42.699997f, 90.8f);
generalPath.curveTo(41.899998f, 91.0f, 40.899998f, 91.200005f, 39.6f, 91.200005f);
generalPath.lineTo(33.0f, 91.200005f);
generalPath.lineTo(33.0f, 73.9f);
generalPath.closePath();
generalPath.moveTo(36.5f, 76.8f);
generalPath.lineTo(36.5f, 88.200005f);
generalPath.lineTo(39.1f, 88.200005f);
generalPath.curveTo(40.1f, 88.200005f, 40.8f, 88.100006f, 41.199997f, 88.00001f);
generalPath.curveTo(41.799995f, 87.90001f, 42.199997f, 87.600006f, 42.6f, 87.30001f);
generalPath.curveTo(43.0f, 87.000015f, 43.3f, 86.40001f, 43.5f, 85.60001f);
generalPath.curveTo(43.7f, 84.80001f, 43.9f, 83.80001f, 43.9f, 82.500015f);
generalPath.curveTo(43.9f, 81.20002f, 43.800003f, 80.20001f, 43.5f, 79.40002f);
generalPath.curveTo(43.3f, 78.70002f, 42.9f, 78.10001f, 42.5f, 77.70002f);
generalPath.curveTo(42.1f, 77.300026f, 41.5f, 77.00002f, 40.9f, 76.90002f);
generalPath.curveTo(40.4f, 76.80002f, 39.5f, 76.70002f, 38.0f, 76.70002f);
generalPath.lineTo(36.5f, 76.70002f);
generalPath.closePath();
generalPath.moveTo(50.5f, 73.9f);
generalPath.lineTo(56.9f, 73.9f);
generalPath.curveTo(58.300003f, 73.9f, 59.4f, 74.0f, 60.2f, 74.200005f);
generalPath.curveTo(61.2f, 74.50001f, 62.100002f, 75.00001f, 62.8f, 75.8f);
generalPath.curveTo(63.5f, 76.600006f, 64.1f, 77.5f, 64.5f, 78.600006f);
generalPath.curveTo(64.9f, 79.70001f, 65.1f, 81.100006f, 65.1f, 82.700005f);
generalPath.curveTo(65.1f, 84.100006f, 64.9f, 85.3f, 64.6f, 86.4f);
generalPath.curveTo(64.2f, 87.6f, 63.5f, 88.700005f, 62.699997f, 89.4f);
generalPath.curveTo(62.1f, 90.0f, 61.299995f, 90.4f, 60.199997f, 90.8f);
generalPath.curveTo(59.399998f, 91.0f, 58.399998f, 91.200005f, 57.1f, 91.200005f);
generalPath.lineTo(50.5f, 91.200005f);
generalPath.lineTo(50.5f, 73.9f);
generalPath.closePath();
generalPath.moveTo(54.0f, 76.8f);
generalPath.lineTo(54.0f, 88.200005f);
generalPath.lineTo(56.6f, 88.200005f);
generalPath.curveTo(57.6f, 88.200005f, 58.3f, 88.100006f, 58.699997f, 88.00001f);
generalPath.curveTo(59.299995f, 87.90001f, 59.699997f, 87.600006f, 60.1f, 87.30001f);
generalPath.curveTo(60.5f, 87.000015f, 60.8f, 86.40001f, 61.0f, 85.60001f);
generalPath.curveTo(61.2f, 84.80001f, 61.4f, 83.80001f, 61.4f, 82.500015f);
generalPath.curveTo(61.4f, 81.20002f, 61.300003f, 80.20001f, 61.0f, 79.40002f);
generalPath.curveTo(60.8f, 78.70002f, 60.4f, 78.10001f, 60.0f, 77.70002f);
generalPath.curveTo(59.6f, 77.30002f, 59.0f, 77.00002f, 58.4f, 76.90002f);
generalPath.curveTo(57.9f, 76.80002f, 57.0f, 76.70002f, 55.5f, 76.70002f);
generalPath.lineTo(54.0f, 76.70002f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.275001525878906, 25.774999618530273), new Point2D.Double(58.775001525878906, 12.274999618530273), new float[] {0.0f,0.378f,0.515f,0.612f,0.69f,0.757f,0.817f,0.871f,0.921f,0.965f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(249, 239, 246, 255)) : new Color(249, 239, 246, 255)),((colorFilter != null) ? colorFilter.filter(new Color(248, 237, 245, 255)) : new Color(248, 237, 245, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 230, 241, 255)) : new Color(243, 230, 241, 255)),((colorFilter != null) ? colorFilter.filter(new Color(236, 219, 235, 255)) : new Color(236, 219, 235, 255)),((colorFilter != null) ? colorFilter.filter(new Color(227, 204, 226, 255)) : new Color(227, 204, 226, 255)),((colorFilter != null) ? colorFilter.filter(new Color(215, 184, 215, 255)) : new Color(215, 184, 215, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 161, 201, 255)) : new Color(202, 161, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 136, 187, 255)) : new Color(188, 136, 187, 255)),((colorFilter != null) ? colorFilter.filter(new Color(174, 108, 171, 255)) : new Color(174, 108, 171, 255)),((colorFilter != null) ? colorFilter.filter(new Color(159, 77, 155, 255)) : new Color(159, 77, 155, 255)),((colorFilter != null) ? colorFilter.filter(new Color(147, 42, 142, 255)) : new Color(147, 42, 142, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(219, 0, 123, 255)) : new Color(219, 0, 123, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
generalPath.moveTo(24.6f, 61.3f);
generalPath.lineTo(24.6f, 34.5f);
generalPath.lineTo(28.2f, 34.5f);
generalPath.lineTo(28.2f, 61.3f);
generalPath.lineTo(24.6f, 61.3f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(219, 0, 123, 255)) : new Color(219, 0, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_0
paint = (colorFilter != null) ? colorFilter.filter(new Color(219, 0, 123, 255)) : new Color(219, 0, 123, 255);
stroke = new BasicStroke(1.25f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.6f, 61.3f);
generalPath.lineTo(24.6f, 34.5f);
generalPath.lineTo(28.2f, 34.5f);
generalPath.lineTo(28.2f, 61.3f);
generalPath.lineTo(24.6f, 61.3f);
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
// _0_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(42.5f, 61.7f);
generalPath.curveTo(36.5f, 61.7f, 33.3f, 58.0f, 33.3f, 52.5f);
generalPath.curveTo(33.3f, 47.0f, 36.399998f, 42.7f, 42.5f, 42.7f);
generalPath.curveTo(43.6f, 42.7f, 44.6f, 42.8f, 45.7f, 43.100002f);
generalPath.lineTo(45.7f, 34.5f);
generalPath.lineTo(49.100002f, 34.5f);
generalPath.lineTo(49.100002f, 60.5f);
generalPath.curveTo(47.7f, 61.1f, 45.2f, 61.7f, 42.500004f, 61.7f);
generalPath.closePath();
generalPath.moveTo(45.7f, 44.800003f);
generalPath.curveTo(44.9f, 44.600002f, 43.9f, 44.500004f, 43.0f, 44.500004f);
generalPath.curveTo(38.2f, 44.500004f, 36.6f, 48.200005f, 36.6f, 52.200005f);
generalPath.curveTo(36.6f, 56.600006f, 38.3f, 59.700005f, 42.6f, 59.700005f);
generalPath.curveTo(44.0f, 59.700005f, 44.899998f, 59.500004f, 45.6f, 59.200005f);
generalPath.lineTo(45.6f, 44.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(219, 0, 123, 255)) : new Color(219, 0, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8_0
paint = (colorFilter != null) ? colorFilter.filter(new Color(219, 0, 123, 255)) : new Color(219, 0, 123, 255);
stroke = new BasicStroke(1.25f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(42.5f, 61.7f);
generalPath.curveTo(36.5f, 61.7f, 33.3f, 58.0f, 33.3f, 52.5f);
generalPath.curveTo(33.3f, 47.0f, 36.399998f, 42.7f, 42.5f, 42.7f);
generalPath.curveTo(43.6f, 42.7f, 44.6f, 42.8f, 45.7f, 43.100002f);
generalPath.lineTo(45.7f, 34.5f);
generalPath.lineTo(49.100002f, 34.5f);
generalPath.lineTo(49.100002f, 60.5f);
generalPath.curveTo(47.7f, 61.1f, 45.2f, 61.7f, 42.500004f, 61.7f);
generalPath.closePath();
generalPath.moveTo(45.7f, 44.800003f);
generalPath.curveTo(44.9f, 44.600002f, 43.9f, 44.500004f, 43.0f, 44.500004f);
generalPath.curveTo(38.2f, 44.500004f, 36.6f, 48.200005f, 36.6f, 52.200005f);
generalPath.curveTo(36.6f, 56.600006f, 38.3f, 59.700005f, 42.6f, 59.700005f);
generalPath.curveTo(44.0f, 59.700005f, 44.899998f, 59.500004f, 45.6f, 59.200005f);
generalPath.lineTo(45.6f, 44.8f);
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
        return 0.13199996948242188;
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_indd() {
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
       ext_indd base = new ext_indd();
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
       ext_indd base = new ext_indd();
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
        return ext_indd::new;
    }
}

