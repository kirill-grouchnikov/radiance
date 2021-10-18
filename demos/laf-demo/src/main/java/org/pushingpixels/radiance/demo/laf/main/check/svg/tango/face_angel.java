package org.pushingpixels.radiance.demo.laf.main.check.svg.tango;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class face_angel implements RadianceIcon {
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
paint = new RadialGradientPaint(new Point2D.Double(29.288070678710938, 15.72098445892334), 8.90208f, new Point2D.Double(29.158466339111328, 15.755711555480957), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 231, 106, 255)) : new Color(246, 231, 106, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(228, 154, 23, 255)) : new Color(228, 154, 23, 255);
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.1758090257644653f, 0.0f, 0.0f, 2.5822269916534424f, -5.280448913574219f, -20.477800369262695f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.204445f, 10.451922f);
generalPath.curveTo(40.228607f, 11.352328f, 37.360306f, 12.186067f, 32.685642f, 12.637436f);
generalPath.curveTo(28.01098f, 13.088805f, 22.244576f, 13.088805f, 17.569914f, 12.637436f);
generalPath.curveTo(12.895251f, 12.186067f, 10.026951f, 11.352328f, 10.051111f, 10.451922f);
generalPath.curveTo(10.026951f, 9.551517f, 12.895251f, 8.717778f, 17.569914f, 8.266409f);
generalPath.curveTo(22.244576f, 7.8150396f, 28.01098f, 7.8150396f, 32.685642f, 8.266409f);
generalPath.curveTo(37.360306f, 8.717778f, 40.228607f, 9.551517f, 40.204445f, 10.451922f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(25.127777099609375, 10.451922416687012), 15.076666f, new Point2D.Double(25.127777099609375, 10.451922416687012), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 252, 154, 160)) : new Color(254, 252, 154, 160)),((colorFilter != null) ? colorFilter.filter(new Color(254, 252, 154, 0)) : new Color(254, 252, 154, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.16666699945926666f, 7.650132117244495E-16f, 8.709935188293457f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.979781985282898f, 0.0f, 0.0f, 1.979781985282898f, -37.33127975463867f, -14.527460098266602f));
// _0_0_3
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
g.setComposite(AlphaComposite.getInstance(3, 0.35999998f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.284637f, 24.719967f);
generalPath.curveTo(34.26817f, 29.94464f, 30.741135f, 33.710007f, 24.462492f, 33.710007f);
generalPath.curveTo(18.362474f, 33.710007f, 13.896955f, 29.370308f, 11.110016f, 24.543188f);
generalPath.curveTo(13.659429f, 27.59911f, 17.392948f, 31.1095f, 24.197327f, 31.1095f);
generalPath.curveTo(32.32753f, 31.1095f, 33.749104f, 28.202646f, 37.284637f, 24.719967f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.284637f, 24.012861f);
generalPath.curveTo(34.26817f, 29.237535f, 30.741135f, 33.0029f, 24.462492f, 33.0029f);
generalPath.curveTo(18.362474f, 33.0029f, 13.896955f, 28.663204f, 11.110016f, 23.836084f);
generalPath.curveTo(13.659429f, 26.892006f, 17.392948f, 30.402397f, 24.197327f, 30.402397f);
generalPath.curveTo(32.32753f, 30.402397f, 33.749104f, 27.495543f, 37.284637f, 24.012861f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(25.05270004272461, 39.59280014038086), 15.7572f, new Point2D.Double(25.05270004272461, 39.59280014038086), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(119, 119, 119, 255)) : new Color(119, 119, 119, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.25f, 0.0f, 0.0f, 1.25f, -6.479445934295654f, -13.372110366821289f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0125030279159546f, 0.0f, 0.0f, 1.645326018333435f, -1.1769349575042725f, -10.685379981994629f));
// _0_0_6
paint = (colorFilter != null) ? colorFilter.filter(new Color(195, 180, 0, 255)) : new Color(195, 180, 0, 255);
stroke = new BasicStroke(2.3243268f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.204445f, 10.451922f);
generalPath.curveTo(40.228607f, 11.352328f, 37.360306f, 12.186067f, 32.685642f, 12.637436f);
generalPath.curveTo(28.01098f, 13.088805f, 22.244576f, 13.088805f, 17.569914f, 12.637436f);
generalPath.curveTo(12.895251f, 12.186067f, 10.026951f, 11.352328f, 10.051111f, 10.451922f);
generalPath.curveTo(10.026951f, 9.551517f, 12.895251f, 8.717778f, 17.569914f, 8.266409f);
generalPath.curveTo(22.244576f, 7.8150396f, 28.01098f, 7.8150396f, 32.685642f, 8.266409f);
generalPath.curveTo(37.360306f, 8.717778f, 40.228607f, 9.551517f, 40.204445f, 10.451922f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.014855980873108f, 0.0f, 0.0f, 1.611564040184021f, -1.206928014755249f, -10.33866024017334f));
// _0_0_7
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 6, 255)) : new Color(255, 255, 6, 255);
stroke = new BasicStroke(0.78194094f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.204445f, 10.451922f);
generalPath.curveTo(40.228607f, 11.352328f, 37.360306f, 12.186067f, 32.685642f, 12.637436f);
generalPath.curveTo(28.01098f, 13.088805f, 22.244576f, 13.088805f, 17.569914f, 12.637436f);
generalPath.curveTo(12.895251f, 12.186067f, 10.026951f, 11.352328f, 10.051111f, 10.451922f);
generalPath.curveTo(10.026951f, 9.551517f, 12.895251f, 8.717778f, 17.569914f, 8.266409f);
generalPath.curveTo(22.244576f, 7.8150396f, 28.01098f, 7.8150396f, 32.685642f, 8.266409f);
generalPath.curveTo(37.360306f, 8.717778f, 40.228607f, 9.551517f, 40.204445f, 10.451922f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.203062f, 17.57856f);
generalPath.curveTo(26.982405f, 21.949411f, 31.532944f, 22.064182f, 33.1343f, 17.728636f);
generalPath.curveTo(30.310009f, 19.967516f, 27.713179f, 19.322697f, 25.203062f, 17.57856f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.134298f, 17.57856f);
generalPath.curveTo(21.354958f, 21.949411f, 16.804419f, 22.064182f, 15.203063f, 17.728636f);
generalPath.curveTo(18.027353f, 19.967516f, 20.624184f, 19.322697f, 23.134298f, 17.57856f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
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
        return 0.0;
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
		return 45.46742248535156;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private face_angel() {
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
       face_angel base = new face_angel();
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
       face_angel base = new face_angel();
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
        return face_angel::new;
    }
}

