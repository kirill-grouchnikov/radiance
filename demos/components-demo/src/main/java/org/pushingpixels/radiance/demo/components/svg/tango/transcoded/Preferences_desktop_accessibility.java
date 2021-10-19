package org.pushingpixels.radiance.demo.components.svg.tango.transcoded;

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
public class Preferences_desktop_accessibility implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.4064171f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(2.4600489139556885f, 0.0f, 0.0f, 2.4600489139556885f, -49.40945816040039f, -67.96373748779297f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.769554f, 44.565483f);
generalPath.curveTo(36.780075f, 45.361816f, 35.53091f, 46.099186f, 33.495064f, 46.498383f);
generalPath.curveTo(31.459217f, 46.89758f, 28.947906f, 46.89758f, 26.91206f, 46.498383f);
generalPath.curveTo(24.876213f, 46.099186f, 23.627047f, 45.361816f, 23.63757f, 44.565483f);
generalPath.curveTo(23.627047f, 43.76915f, 24.876213f, 43.03178f, 26.91206f, 42.632584f);
generalPath.curveTo(28.947906f, 42.233387f, 31.459217f, 42.233387f, 33.495064f, 42.632584f);
generalPath.curveTo(35.53091f, 43.03178f, 36.780075f, 43.76915f, 36.769554f, 44.565483f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(30.203561782836914, 44.56548309326172), 6.5659914f, new Point2D.Double(30.203561782836914, 44.56548309326172), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.3384619951248169f, -1.4354759471951642E-15f, 29.481779098510742f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355);
paint = new RadialGradientPaint(new Point2D.Double(25.457862854003906, 35.59623336791992), 20.530962f, new Point2D.Double(25.457862854003906, 35.59623336791992), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(156, 188, 222, 255)) : new Color(156, 188, 222, 255)),((colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 255)) : new Color(32, 74, 135, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.1281850337982178f, -1.7271729602086339E-9f, 2.422814131750186E-16f, 2.128253936767578f, -29.019060134887695f, -39.917789459228516f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 255)) : new Color(52, 101, 164, 255);
stroke = new BasicStroke(1.0f,0,2,10.0f,null,0.0f);
shape = new RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(2.0000021f,0,2,10.0f,null,0.0f);
shape = new RoundRectangle2D.Double(5.8954033851623535, 5.004019737243652, 37.10063552856445, 37.10063552856445, 7.81350040435791, 7.81350040435791);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.5521910190582275f, -0.6401000022888184f));
// _0_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.7692310214042664f, 0.0f, 0.0f, 0.7692310214042664f, 6.846158027648926f, 4.576913833618164f));
// _0_0_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.444443941116333f, 0.0f, 0.0f, 1.444443941116333f, -7.841267108917236f, -5.8095221519470215f));
// _0_0_3_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.857141f, 13.071428f);
generalPath.curveTo(20.862293f, 14.2232065f, 20.250782f, 15.289703f, 19.254162f, 15.8670845f);
generalPath.curveTo(18.257544f, 16.444466f, 17.02817f, 16.444466f, 16.03155f, 15.8670845f);
generalPath.curveTo(15.03493f, 15.289703f, 14.42342f, 14.2232065f, 14.428571f, 13.071428f);
generalPath.curveTo(14.42342f, 11.91965f, 15.03493f, 10.853153f, 16.03155f, 10.275772f);
generalPath.curveTo(17.02817f, 9.698391f, 18.257544f, 9.698391f, 19.254162f, 10.275772f);
generalPath.curveTo(20.250782f, 10.853153f, 20.862293f, 11.91965f, 20.857141f, 13.071428f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_0_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(2.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.571428f, 13.142857f);
generalPath.lineTo(20.0f, 30.0f);
generalPath.lineTo(32.0f, 27.428572f);
generalPath.lineTo(34.42857f, 37.0f);
generalPath.lineTo(38.0f, 36.0f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.374998f, 21.668259f);
generalPath.curveTo(14.821727f, 23.078575f, 13.0f, 25.694616f, 13.0f, 28.80768f);
generalPath.curveTo(13.0f, 33.36178f, 16.715132f, 37.076912f, 21.26923f, 37.076912f);
generalPath.curveTo(25.584839f, 37.076912f, 29.03297f, 33.705624f, 29.39423f, 29.480759f);
generalPath.lineTo(27.399036f, 29.937489f);
generalPath.curveTo(26.85153f, 32.888084f, 24.382202f, 35.153835f, 21.26923f, 35.153835f);
generalPath.curveTo(17.755636f, 35.153835f, 14.923077f, 32.321274f, 14.923077f, 28.80768f);
generalPath.curveTo(14.923077f, 26.611685f, 16.12003f, 24.778076f, 17.807692f, 23.639412f);
generalPath.lineTo(17.374998f, 21.668259f);
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
// _0_0_4
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.9230775f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.857143f, 20.857143f);
generalPath.lineTo(31.714287f, 20.0f);
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
        return 3.9147281646728516;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.0233452320098877;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 41.061927795410156;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 44.38325500488281;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Preferences_desktop_accessibility() {
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
       Preferences_desktop_accessibility base = new Preferences_desktop_accessibility();
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
       Preferences_desktop_accessibility base = new Preferences_desktop_accessibility();
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
        return Preferences_desktop_accessibility::new;
    }
}

