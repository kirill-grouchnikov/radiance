package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_md implements ResizableIcon {
    private Shape shape = null;
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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.2);
((GeneralPath)shape).lineTo(72.0, 28.0);
((GeneralPath)shape).lineTo(72.0, 99.2);
((GeneralPath)shape).lineTo(0.0, 99.2);
((GeneralPath)shape).lineTo(0.0, 1.199997);
((GeneralPath)shape).lineTo(45.0, 1.199997);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 0.800000011920929), new Point2D.Double(36.0, 98.80000305175781), new float[] {0.0f,0.047f,0.225f,0.424f,0.655f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(207, 217, 224, 255),new Color(228, 234, 237, 255),new Color(243, 246, 247, 255),new Color(252, 253, 253, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 160, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.2);
((GeneralPath)shape).lineTo(72.0, 28.0);
((GeneralPath)shape).lineTo(72.0, 99.2);
((GeneralPath)shape).lineTo(0.0, 99.2);
((GeneralPath)shape).lineTo(0.0, 1.199997);
((GeneralPath)shape).lineTo(45.0, 1.199997);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.0, 92.3);
((GeneralPath)shape).lineTo(17.0, 72.5);
((GeneralPath)shape).lineTo(23.0, 72.5);
((GeneralPath)shape).lineTo(26.7, 86.0);
((GeneralPath)shape).lineTo(30.300001, 72.5);
((GeneralPath)shape).lineTo(36.4, 72.5);
((GeneralPath)shape).lineTo(36.4, 92.3);
((GeneralPath)shape).lineTo(32.600002, 92.3);
((GeneralPath)shape).lineTo(32.600002, 76.7);
((GeneralPath)shape).lineTo(28.600002, 92.299995);
((GeneralPath)shape).lineTo(24.700003, 92.299995);
((GeneralPath)shape).lineTo(20.700003, 76.7);
((GeneralPath)shape).lineTo(20.700003, 92.299995);
((GeneralPath)shape).lineTo(17.0, 92.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.3, 72.5);
((GeneralPath)shape).lineTo(47.7, 72.5);
((GeneralPath)shape).curveTo(49.4, 72.5, 50.600002, 72.6, 51.5, 72.9);
((GeneralPath)shape).curveTo(52.7, 73.200005, 53.7, 73.9, 54.5, 74.700005);
((GeneralPath)shape).curveTo(55.3, 75.50001, 56.0, 76.600006, 56.4, 77.9);
((GeneralPath)shape).curveTo(56.800003, 79.2, 57.100002, 80.700005, 57.100002, 82.6);
((GeneralPath)shape).curveTo(57.100002, 84.2, 56.9, 85.6, 56.500004, 86.799995);
((GeneralPath)shape).curveTo(56.000004, 88.2, 55.300003, 89.399994, 54.400005, 90.299995);
((GeneralPath)shape).curveTo(53.700005, 90.99999, 52.800007, 91.49999, 51.600006, 91.899994);
((GeneralPath)shape).curveTo(50.700005, 92.2, 49.500008, 92.299995, 48.000008, 92.299995);
((GeneralPath)shape).lineTo(40.40001, 92.299995);
((GeneralPath)shape).lineTo(40.40001, 72.5);
((GeneralPath)shape).lineTo(40.30001, 72.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(44.399998, 75.8);
((GeneralPath)shape).lineTo(44.399998, 89.0);
((GeneralPath)shape).lineTo(47.399998, 89.0);
((GeneralPath)shape).curveTo(48.499996, 89.0, 49.3, 88.9, 49.8, 88.8);
((GeneralPath)shape).curveTo(50.5, 88.600006, 51.0, 88.4, 51.399998, 88.0);
((GeneralPath)shape).curveTo(51.8, 87.6, 52.199997, 87.0, 52.499996, 86.1);
((GeneralPath)shape).curveTo(52.799995, 85.2, 52.899998, 84.0, 52.899998, 82.5);
((GeneralPath)shape).curveTo(52.899998, 81.0, 52.8, 79.8, 52.499996, 79.0);
((GeneralPath)shape).curveTo(52.199997, 78.2, 51.799995, 77.5, 51.399998, 77.1);
((GeneralPath)shape).curveTo(51.0, 76.7, 50.3, 76.299995, 49.499996, 76.2);
((GeneralPath)shape).curveTo(48.899998, 76.1, 47.799995, 76.0, 46.199997, 76.0);
((GeneralPath)shape).lineTo(44.399998, 76.0);
((GeneralPath)shape).lineTo(44.399998, 75.8);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.7, 51.8);
((GeneralPath)shape).lineTo(19.6, 51.8);
((GeneralPath)shape).lineTo(19.6, 46.2);
((GeneralPath)shape).lineTo(25.0, 46.2);
((GeneralPath)shape).lineTo(26.8, 38.600002);
((GeneralPath)shape).lineTo(19.5, 38.600002);
((GeneralPath)shape).lineTo(19.5, 33.0);
((GeneralPath)shape).lineTo(28.2, 33.0);
((GeneralPath)shape).lineTo(30.6, 23.0);
((GeneralPath)shape).lineTo(37.4, 23.0);
((GeneralPath)shape).lineTo(35.0, 33.0);
((GeneralPath)shape).lineTo(41.7, 33.0);
((GeneralPath)shape).lineTo(44.0, 23.0);
((GeneralPath)shape).lineTo(51.1, 23.0);
((GeneralPath)shape).lineTo(48.699997, 33.0);
((GeneralPath)shape).lineTo(53.0, 33.0);
((GeneralPath)shape).lineTo(53.0, 38.7);
((GeneralPath)shape).lineTo(47.4, 38.7);
((GeneralPath)shape).lineTo(45.600002, 46.3);
((GeneralPath)shape).lineTo(53.0, 46.3);
((GeneralPath)shape).lineTo(53.0, 51.899998);
((GeneralPath)shape).lineTo(44.2, 51.899998);
((GeneralPath)shape).lineTo(41.8, 61.899998);
((GeneralPath)shape).lineTo(35.0, 61.899998);
((GeneralPath)shape).lineTo(37.3, 51.899998);
((GeneralPath)shape).lineTo(30.5, 51.899998);
((GeneralPath)shape).lineTo(28.1, 61.899998);
((GeneralPath)shape).lineTo(21.2, 61.899998);
((GeneralPath)shape).lineTo(23.7, 51.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.7, 38.699997);
((GeneralPath)shape).lineTo(31.900002, 46.299995);
((GeneralPath)shape).lineTo(38.7, 46.299995);
((GeneralPath)shape).lineTo(40.5, 38.699997);
((GeneralPath)shape).lineTo(33.7, 38.699997);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.25, 61.900001525878906), new Point2D.Double(36.25, 23.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.2);
((GeneralPath)shape).lineTo(72.0, 28.0);
((GeneralPath)shape).lineTo(45.0, 28.0);
((GeneralPath)shape).lineTo(45.0, 1.2);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.04999923706055, 71.94999694824219), new Point2D.Double(58.54999923706055, 85.44999694824219), new float[] {0.0f,0.335f,0.51f,0.647f,0.765f,0.87f,0.966f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(253, 253, 253, 255),new Color(245, 247, 248, 255),new Color(231, 236, 238, 255),new Color(212, 220, 224, 255),new Color(188, 200, 207, 255),new Color(158, 175, 185, 255),new Color(145, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 160, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.2);
((GeneralPath)shape).lineTo(72.0, 28.0);
((GeneralPath)shape).lineTo(45.0, 28.0);
((GeneralPath)shape).lineTo(45.0, 1.2);
((GeneralPath)shape).closePath();
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
        return 0.0019999693613499403;
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
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_md() {
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
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
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
       ext_md base = new ext_md();
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
       ext_md base = new ext_md();
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
        return ext_md::new;
    }
}

