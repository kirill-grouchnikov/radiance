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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class face_plain implements NeonIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.5316456f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.42857f, 38.57143f);
generalPath.curveTo(44.460163f, 40.926178f, 40.709564f, 43.10657f, 34.596966f, 44.286995f);
generalPath.curveTo(28.484367f, 45.46742f, 20.944202f, 45.46742f, 14.831604f, 44.286995f);
generalPath.curveTo(8.719005f, 43.10657f, 4.9684076f, 40.926178f, 5.0f, 38.57143f);
generalPath.curveTo(4.9684076f, 36.216682f, 8.719005f, 34.03629f, 14.831604f, 32.855865f);
generalPath.curveTo(20.944202f, 31.675442f, 28.484367f, 31.675442f, 34.596966f, 32.855865f);
generalPath.curveTo(40.709564f, 34.03629f, 44.460163f, 36.216682f, 44.42857f, 38.57143f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.714284896850586, 38.57143020629883), 19.714285f, new Point2D.Double(24.714284896850586, 38.57143020629883), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.33333298563957214f, 0.0f, 25.714290618896484f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(2.083142042160034f, 0.0f, 0.0f, 2.083142042160034f, -40.547149658203125f, -16.49224090576172f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.774754f, 19.008621f);
generalPath.curveTo(39.788635f, 22.112505f, 38.140697f, 24.986568f, 35.454945f, 26.54253f);
generalPath.curveTo(32.769196f, 28.098494f, 29.4562f, 28.098494f, 26.770447f, 26.54253f);
generalPath.curveTo(24.084696f, 24.986568f, 22.436758f, 22.112505f, 22.45064f, 19.008621f);
generalPath.curveTo(22.436758f, 15.904738f, 24.084696f, 13.030674f, 26.770447f, 11.474711f);
generalPath.curveTo(29.4562f, 9.918749f, 32.769196f, 9.918749f, 35.454945f, 11.474711f);
generalPath.curveTo(38.140697f, 13.030674f, 39.788635f, 15.904738f, 39.774754f, 19.008621f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(29.288070678710938, 15.72098445892334), 8.90208f, new Point2D.Double(29.158466339111328, 15.755711555480957), new float[] {0.0f,0.6448598f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 252, 222, 255)) : new Color(255, 252, 222, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 231, 106, 255)) : new Color(246, 231, 106, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 183, 56, 255)) : new Color(255, 183, 56, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(156, 140, 10, 255)) : new Color(156, 140, 10, 255);
stroke = new BasicStroke(0.48004404f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.774754f, 19.008621f);
generalPath.curveTo(39.788635f, 22.112505f, 38.140697f, 24.986568f, 35.454945f, 26.54253f);
generalPath.curveTo(32.769196f, 28.098494f, 29.4562f, 28.098494f, 26.770447f, 26.54253f);
generalPath.curveTo(24.084696f, 24.986568f, 22.436758f, 22.112505f, 22.45064f, 19.008621f);
generalPath.curveTo(22.436758f, 15.904738f, 24.084696f, 13.030674f, 26.770447f, 11.474711f);
generalPath.curveTo(29.4562f, 9.918749f, 32.769196f, 9.918749f, 35.454945f, 11.474711f);
generalPath.curveTo(38.140697f, 13.030674f, 39.788635f, 15.904738f, 39.774754f, 19.008621f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.6772152f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.979781985282898f, 0.0f, 0.0f, 1.979781985282898f, -37.33127975463867f, -14.527460098266602f));
// _0_0_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.5051063f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.774754f, 19.008621f);
generalPath.curveTo(39.788635f, 22.112505f, 38.140697f, 24.986568f, 35.454945f, 26.54253f);
generalPath.curveTo(32.769196f, 28.098494f, 29.4562f, 28.098494f, 26.770447f, 26.54253f);
generalPath.curveTo(24.084696f, 24.986568f, 22.436758f, 22.112505f, 22.45064f, 19.008621f);
generalPath.curveTo(22.436758f, 15.904738f, 24.084696f, 13.030674f, 26.770447f, 11.474711f);
generalPath.curveTo(29.4562f, 9.918749f, 32.769196f, 9.918749f, 35.454945f, 11.474711f);
generalPath.curveTo(38.140697f, 13.030674f, 39.788635f, 15.904738f, 39.774754f, 19.008621f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 0.7495200037956238f, 0.35355299711227417f, 7.357569217681885f));
// _0_0_3
g.setComposite(AlphaComposite.getInstance(3, 0.36f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.398157f, 15.321428f);
generalPath.curveTo(21.398157f, 17.821428f, 20.273157f, 19.821428f, 18.898157f, 19.821428f);
generalPath.curveTo(17.523157f, 19.821428f, 16.273157f, 17.821428f, 16.273157f, 15.321428f);
generalPath.curveTo(16.273157f, 12.821428f, 17.398157f, 10.821428f, 18.773157f, 10.821428f);
generalPath.curveTo(20.148157f, 10.821428f, 21.273157f, 12.821428f, 21.273157f, 15.321428f);
generalPath.lineTo(21.398157f, 15.321428f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.36f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.688513f, 15.321428f);
generalPath.curveTo(30.688513f, 17.821428f, 29.563513f, 19.821428f, 28.188513f, 19.821428f);
generalPath.curveTo(26.813513f, 19.821428f, 25.688513f, 17.821428f, 25.688513f, 15.321428f);
generalPath.curveTo(25.688513f, 12.821428f, 26.813513f, 10.821428f, 28.188513f, 10.821428f);
generalPath.curveTo(29.563513f, 10.821428f, 30.688513f, 12.821428f, 30.688513f, 15.321428f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.398157f, 14.696428f);
generalPath.curveTo(21.398157f, 17.196428f, 20.273157f, 19.196428f, 18.898157f, 19.196428f);
generalPath.curveTo(17.523157f, 19.196428f, 16.398157f, 17.196428f, 16.398157f, 14.696428f);
generalPath.curveTo(16.398157f, 12.196428f, 17.523157f, 10.196428f, 18.898157f, 10.196428f);
generalPath.curveTo(20.273157f, 10.196428f, 21.398157f, 12.196428f, 21.398157f, 14.696428f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.688513f, 14.696428f);
generalPath.curveTo(30.688513f, 17.196428f, 29.563513f, 19.196428f, 28.188513f, 19.196428f);
generalPath.curveTo(26.813513f, 19.196428f, 25.688513f, 17.196428f, 25.688513f, 14.696428f);
generalPath.curveTo(25.688513f, 12.196428f, 26.813513f, 10.196428f, 28.188513f, 10.196428f);
generalPath.curveTo(29.563513f, 10.196428f, 30.688513f, 12.196428f, 30.688513f, 14.696428f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
shape = new RoundRectangle2D.Double(14.0, 29.0, 20.0, 1.0, 1.0, 1.0);
paint = new RadialGradientPaint(new Point2D.Double(-23.45212173461914, 38.60285186767578), 15.7572f, new Point2D.Double(-23.45212173461914, 38.60285186767578), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(119, 119, 119, 255)) : new Color(119, 119, 119, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3578989505767822f, 0.0f, 0.0f, 0.41666701436042786f, 55.845611572265625f, 15.20930004119873f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.36f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
shape = new RoundRectangle2D.Double(14.0, 30.0, 20.0, 1.0, 1.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
        return 4.96840763092041;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.647467613220215;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 39.491756439208984;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 41.819950103759766;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private face_plain() {
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
       face_plain base = new face_plain();
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
       face_plain base = new face_plain();
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
        return face_plain::new;
    }
}

