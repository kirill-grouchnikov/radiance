package org.pushingpixels.radiance.demo.theming.main.check.svg.tango;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class edit_copy implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.49999997f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0015079975128174f, 0.0f, 0.0f, 1.0006159543991089f, -0.050022050738334656f, -0.06304895132780075f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.17045452f * origAlpha));
// _0_0_0_0
shape = new Rectangle2D.Double(20.161836624145508, 34.03341293334961, 13.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0_1
shape = new RoundRectangle2D.Double(1.5484408140182495, 1.5629303455352783, 30.95155906677246, 35.976688385009766, 1.131310224533081, 1.1323192119598389);
paint = new LinearGradientPaint(new Point2D.Double(22.308330535888672, 18.99213981628418), new Point2D.Double(35.78529357910156, 39.49823760986328), new float[] {0.0f,0.59928656f,0.82758623f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 239, 255)) : new Color(240, 240, 239, 255)),((colorFilter != null) ? colorFilter.filter(new Color(232, 232, 232, 255)) : new Color(232, 232, 232, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 216, 211, 255)) : new Color(216, 216, 211, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0656980276107788f, 0.0f, 0.0f, 0.9875950217247009f, -8.548319816589355f, -4.8917131423950195f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 138, 133, 255)) : new Color(136, 138, 133, 255);
stroke = new BasicStroke(0.99893934f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(1.5484408140182495, 1.5629303455352783, 30.95155906677246, 35.976688385009766, 1.131310224533081, 1.1323192119598389);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0_2
paint = new LinearGradientPaint(new Point2D.Double(26.076091766357422, 26.69667625427246), new Point2D.Double(30.811172485351562, 42.00735092163086), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9985039830207825f, 0.0f, 0.0f, 0.9982460141181946f, -6.970390796661377f, -4.8929009437561035f));
stroke = new BasicStroke(0.99893963f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(2.532512903213501, 2.5605955123901367, 28.970741271972656, 33.981056213378906);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.17045452f * origAlpha));
// _0_0_0_3
shape = new Rectangle2D.Double(7.016119003295898, 10.033413887023926, 21.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.17045452f * origAlpha));
// _0_0_0_4
shape = new Rectangle2D.Double(7.016119003295898, 14.033413887023926, 20.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.17045452f * origAlpha));
// _0_0_0_5
shape = new Rectangle2D.Double(7.016119003295898, 18.033414840698242, 18.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.17045452f * origAlpha));
// _0_0_0_6
shape = new Rectangle2D.Double(7.016119003295898, 22.033414840698242, 21.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.17045452f * origAlpha));
// _0_0_0_7
shape = new Rectangle2D.Double(7.016119003295898, 26.03341293334961, 13.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.072946f, 10.500852f);
generalPath.lineTo(44.929333f, 10.500852f);
generalPath.curveTo(45.24507f, 10.500852f, 45.499256f, 10.753945f, 45.499256f, 11.068324f);
generalPath.lineTo(45.499256f, 38.235687f);
generalPath.curveTo(45.499256f, 40.71214f, 38.619446f, 46.538773f, 36.231323f, 46.538773f);
generalPath.lineTo(15.072946f, 46.538773f);
generalPath.curveTo(14.757206f, 46.538773f, 14.50302f, 46.285683f, 14.50302f, 45.9713f);
generalPath.lineTo(14.50302f, 11.068324f);
generalPath.curveTo(14.50302f, 10.753945f, 14.757206f, 10.500852f, 15.072946f, 10.500852f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(22.308330535888672, 18.99213981628418), new Point2D.Double(35.78529357910156, 39.49823760986328), new float[] {0.0f,0.59928656f,0.82758623f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 239, 255)) : new Color(240, 240, 239, 255)),((colorFilter != null) ? colorFilter.filter(new Color(232, 232, 232, 255)) : new Color(232, 232, 232, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 216, 211, 255)) : new Color(216, 216, 211, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0672359466552734f, 0.0f, 0.0f, 0.9892759919166565f, 4.391684055328369f, 4.035226821899414f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 138, 133, 255)) : new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0000002f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.072946f, 10.500852f);
generalPath.lineTo(44.929333f, 10.500852f);
generalPath.curveTo(45.24507f, 10.500852f, 45.499256f, 10.753945f, 45.499256f, 11.068324f);
generalPath.lineTo(45.499256f, 38.235687f);
generalPath.curveTo(45.499256f, 40.71214f, 38.619446f, 46.538773f, 36.231323f, 46.538773f);
generalPath.lineTo(15.072946f, 46.538773f);
generalPath.curveTo(14.757206f, 46.538773f, 14.50302f, 46.285683f, 14.50302f, 45.9713f);
generalPath.lineTo(14.50302f, 11.068324f);
generalPath.curveTo(14.50302f, 10.753945f, 14.757206f, 10.500852f, 15.072946f, 10.500852f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_1_1
paint = new LinearGradientPaint(new Point2D.Double(26.076091766357422, 26.69667625427246), new Point2D.Double(30.811172485351562, 42.00735092163086), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9994210004806519f, 0.0f, 0.0f, 1.0f, 5.991319179534912f, 4.033411026000977f));
stroke = new BasicStroke(1.0000008f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(15.502950668334961, 11.5, 28.99734878540039, 34.04076385498047);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.220917f, 46.536964f);
generalPath.curveTo(38.251335f, 46.866863f, 45.80971f, 42.00704f, 45.50533f, 38.039124f);
generalPath.curveTo(43.942066f, 40.46222f, 40.746807f, 39.32586f, 36.63805f, 39.48487f);
generalPath.curveTo(36.63805f, 39.48487f, 37.033417f, 46.036964f, 36.220917f, 46.536964f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.99658203125, 40.458221435546875), new Point2D.Double(33.664920806884766, 37.770721435546875), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(124, 124, 124, 255)) : new Color(124, 124, 124, 255)),((colorFilter != null) ? colorFilter.filter(new Color(184, 184, 184, 255)) : new Color(184, 184, 184, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.16183614730835f, 4.033411026000977f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(134, 138, 132, 255)) : new Color(134, 138, 132, 255);
stroke = new BasicStroke(1.0000002f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.220917f, 46.536964f);
generalPath.curveTo(38.251335f, 46.866863f, 45.80971f, 42.00704f, 45.50533f, 38.039124f);
generalPath.curveTo(43.942066f, 40.46222f, 40.746807f, 39.32586f, 36.63805f, 39.48487f);
generalPath.curveTo(36.63805f, 39.48487f, 37.033417f, 46.036964f, 36.220917f, 46.536964f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.36931816f * origAlpha));
// _0_0_1_3
paint = new LinearGradientPaint(new Point2D.Double(33.39600372314453, 36.92133331298828), new Point2D.Double(34.170047760009766, 38.07038116455078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.16183614730835f, 3.6584110260009766f));
stroke = new BasicStroke(0.9999998f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.671356f, 44.345463f);
generalPath.curveTo(39.041134f, 43.661636f, 42.099606f, 42.198997f, 43.398987f, 40.317993f);
generalPath.curveTo(41.80289f, 40.99805f, 40.451176f, 40.527493f, 37.69665f, 40.5084f);
generalPath.curveTo(37.69665f, 40.5084f, 37.858974f, 43.570496f, 37.671356f, 44.345463f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.17045452f * origAlpha));
// _0_0_1_4
shape = new Rectangle2D.Double(20.0, 19.033414840698242, 21.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.17045452f * origAlpha));
// _0_0_1_5
shape = new Rectangle2D.Double(20.0, 23.033414840698242, 19.992233276367188, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.17045452f * origAlpha));
// _0_0_1_6
shape = new Rectangle2D.Double(20.0, 27.033414840698242, 17.976701736450195, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.17045452f * origAlpha));
// _0_0_1_7
shape = new Rectangle2D.Double(20.0, 31.033414840698242, 21.0, 2.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);

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
        return 1.0005309581756592;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 1.0010666847229004;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 45.02638626098633;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 46.38484573364258;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private edit_copy() {
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
       edit_copy base = new edit_copy();
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
       edit_copy base = new edit_copy();
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
        return edit_copy::new;
    }
}

