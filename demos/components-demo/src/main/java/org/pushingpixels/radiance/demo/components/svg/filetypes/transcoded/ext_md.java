package org.pushingpixels.radiance.demo.components.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.util.Stack;
import javax.swing.plaf.UIResource;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_md implements RadianceIcon {
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
generalPath.moveTo(45.0f, 1.2f);
generalPath.lineTo(72.0f, 28.0f);
generalPath.lineTo(72.0f, 99.2f);
generalPath.lineTo(0.0f, 99.2f);
generalPath.lineTo(0.0f, 1.199997f);
generalPath.lineTo(45.0f, 1.199997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 0.800000011920929), new Point2D.Double(36.0, 98.80000305175781), new float[] {0.0f,0.047f,0.225f,0.424f,0.655f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 217, 224, 255)) : new Color(207, 217, 224, 255)),((colorFilter != null) ? colorFilter.filter(new Color(228, 234, 237, 255)) : new Color(228, 234, 237, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 246, 247, 255)) : new Color(243, 246, 247, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 253, 253, 255)) : new Color(252, 253, 253, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 160, 255)) : new Color(113, 145, 160, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.2f);
generalPath.lineTo(72.0f, 28.0f);
generalPath.lineTo(72.0f, 99.2f);
generalPath.lineTo(0.0f, 99.2f);
generalPath.lineTo(0.0f, 1.199997f);
generalPath.lineTo(45.0f, 1.199997f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(17.0f, 92.3f);
generalPath.lineTo(17.0f, 72.5f);
generalPath.lineTo(23.0f, 72.5f);
generalPath.lineTo(26.7f, 86.0f);
generalPath.lineTo(30.300001f, 72.5f);
generalPath.lineTo(36.4f, 72.5f);
generalPath.lineTo(36.4f, 92.3f);
generalPath.lineTo(32.600002f, 92.3f);
generalPath.lineTo(32.600002f, 76.7f);
generalPath.lineTo(28.600002f, 92.299995f);
generalPath.lineTo(24.700003f, 92.299995f);
generalPath.lineTo(20.700003f, 76.7f);
generalPath.lineTo(20.700003f, 92.299995f);
generalPath.lineTo(17.0f, 92.299995f);
generalPath.closePath();
generalPath.moveTo(40.3f, 72.5f);
generalPath.lineTo(47.7f, 72.5f);
generalPath.curveTo(49.4f, 72.5f, 50.600002f, 72.6f, 51.5f, 72.9f);
generalPath.curveTo(52.7f, 73.200005f, 53.7f, 73.9f, 54.5f, 74.700005f);
generalPath.curveTo(55.3f, 75.50001f, 56.0f, 76.600006f, 56.4f, 77.9f);
generalPath.curveTo(56.800003f, 79.2f, 57.100002f, 80.700005f, 57.100002f, 82.6f);
generalPath.curveTo(57.100002f, 84.2f, 56.9f, 85.6f, 56.500004f, 86.799995f);
generalPath.curveTo(56.000004f, 88.2f, 55.300003f, 89.399994f, 54.400005f, 90.299995f);
generalPath.curveTo(53.700005f, 90.99999f, 52.800007f, 91.49999f, 51.600006f, 91.899994f);
generalPath.curveTo(50.700005f, 92.2f, 49.500008f, 92.299995f, 48.000008f, 92.299995f);
generalPath.lineTo(40.40001f, 92.299995f);
generalPath.lineTo(40.40001f, 72.5f);
generalPath.lineTo(40.30001f, 72.5f);
generalPath.closePath();
generalPath.moveTo(44.399998f, 75.8f);
generalPath.lineTo(44.399998f, 89.0f);
generalPath.lineTo(47.399998f, 89.0f);
generalPath.curveTo(48.499996f, 89.0f, 49.3f, 88.9f, 49.8f, 88.8f);
generalPath.curveTo(50.5f, 88.600006f, 51.0f, 88.4f, 51.399998f, 88.0f);
generalPath.curveTo(51.8f, 87.6f, 52.199997f, 87.0f, 52.499996f, 86.1f);
generalPath.curveTo(52.799995f, 85.2f, 52.899998f, 84.0f, 52.899998f, 82.5f);
generalPath.curveTo(52.899998f, 81.0f, 52.8f, 79.8f, 52.499996f, 79.0f);
generalPath.curveTo(52.199997f, 78.2f, 51.799995f, 77.5f, 51.399998f, 77.1f);
generalPath.curveTo(51.0f, 76.7f, 50.3f, 76.299995f, 49.499996f, 76.2f);
generalPath.curveTo(48.899998f, 76.1f, 47.799995f, 76.0f, 46.199997f, 76.0f);
generalPath.lineTo(44.399998f, 76.0f);
generalPath.lineTo(44.399998f, 75.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.7f, 51.8f);
generalPath.lineTo(19.6f, 51.8f);
generalPath.lineTo(19.6f, 46.2f);
generalPath.lineTo(25.0f, 46.2f);
generalPath.lineTo(26.8f, 38.600002f);
generalPath.lineTo(19.5f, 38.600002f);
generalPath.lineTo(19.5f, 33.0f);
generalPath.lineTo(28.2f, 33.0f);
generalPath.lineTo(30.6f, 23.0f);
generalPath.lineTo(37.4f, 23.0f);
generalPath.lineTo(35.0f, 33.0f);
generalPath.lineTo(41.7f, 33.0f);
generalPath.lineTo(44.0f, 23.0f);
generalPath.lineTo(51.1f, 23.0f);
generalPath.lineTo(48.699997f, 33.0f);
generalPath.lineTo(53.0f, 33.0f);
generalPath.lineTo(53.0f, 38.7f);
generalPath.lineTo(47.4f, 38.7f);
generalPath.lineTo(45.600002f, 46.3f);
generalPath.lineTo(53.0f, 46.3f);
generalPath.lineTo(53.0f, 51.899998f);
generalPath.lineTo(44.2f, 51.899998f);
generalPath.lineTo(41.8f, 61.899998f);
generalPath.lineTo(35.0f, 61.899998f);
generalPath.lineTo(37.3f, 51.899998f);
generalPath.lineTo(30.5f, 51.899998f);
generalPath.lineTo(28.1f, 61.899998f);
generalPath.lineTo(21.2f, 61.899998f);
generalPath.lineTo(23.7f, 51.799995f);
generalPath.closePath();
generalPath.moveTo(33.7f, 38.699997f);
generalPath.lineTo(31.900002f, 46.299995f);
generalPath.lineTo(38.7f, 46.299995f);
generalPath.lineTo(40.5f, 38.699997f);
generalPath.lineTo(33.7f, 38.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.25, 61.900001525878906), new Point2D.Double(36.25, 23.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0f, 1.2f);
generalPath.lineTo(72.0f, 28.0f);
generalPath.lineTo(45.0f, 28.0f);
generalPath.lineTo(45.0f, 1.2f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.04999923706055, 71.94999694824219), new Point2D.Double(58.54999923706055, 85.44999694824219), new float[] {0.0f,0.335f,0.51f,0.647f,0.765f,0.87f,0.966f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 253, 253, 255)) : new Color(253, 253, 253, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 247, 248, 255)) : new Color(245, 247, 248, 255)),((colorFilter != null) ? colorFilter.filter(new Color(231, 236, 238, 255)) : new Color(231, 236, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(212, 220, 224, 255)) : new Color(212, 220, 224, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 200, 207, 255)) : new Color(188, 200, 207, 255)),((colorFilter != null) ? colorFilter.filter(new Color(158, 175, 185, 255)) : new Color(158, 175, 185, 255)),((colorFilter != null) ? colorFilter.filter(new Color(145, 165, 176, 255)) : new Color(145, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 160, 255)) : new Color(113, 145, 160, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.2f);
generalPath.lineTo(72.0f, 28.0f);
generalPath.lineTo(45.0f, 28.0f);
generalPath.lineTo(45.0f, 1.2f);
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       ext_md base = new ext_md();
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
        return ext_md::new;
    }
}

