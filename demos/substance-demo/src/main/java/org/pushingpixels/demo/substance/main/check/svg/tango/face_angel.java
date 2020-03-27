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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class face_angel implements ResizableIcon {
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
generalPath.moveTo(44.42857, 38.57143);
generalPath.curveTo(44.460163, 40.926178, 40.709564, 43.10657, 34.596966, 44.286995);
generalPath.curveTo(28.484367, 45.46742, 20.944202, 45.46742, 14.831604, 44.286995);
generalPath.curveTo(8.719005, 43.10657, 4.9684076, 40.926178, 5.0, 38.57143);
generalPath.curveTo(4.9684076, 36.216682, 8.719005, 34.03629, 14.831604, 32.855865);
generalPath.curveTo(20.944202, 31.675442, 28.484367, 31.675442, 34.596966, 32.855865);
generalPath.curveTo(40.709564, 34.03629, 44.460163, 36.216682, 44.42857, 38.57143);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.714284896850586, 38.57143020629883), 19.714285f, new Point2D.Double(24.714284896850586, 38.57143020629883), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.33333298563957214f, 0.0f, 25.714290618896484f));
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
generalPath.moveTo(39.774754, 19.008621);
generalPath.curveTo(39.788635, 22.112505, 38.140697, 24.986568, 35.454945, 26.54253);
generalPath.curveTo(32.769196, 28.098494, 29.4562, 28.098494, 26.770447, 26.54253);
generalPath.curveTo(24.084696, 24.986568, 22.436758, 22.112505, 22.45064, 19.008621);
generalPath.curveTo(22.436758, 15.904738, 24.084696, 13.030674, 26.770447, 11.474711);
generalPath.curveTo(29.4562, 9.918749, 32.769196, 9.918749, 35.454945, 11.474711);
generalPath.curveTo(38.140697, 13.030674, 39.788635, 15.904738, 39.774754, 19.008621);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(29.288070678710938, 15.72098445892334), 8.90208f, new Point2D.Double(29.158466339111328, 15.755711555480957), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(246, 231, 106, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(228, 154, 23, 255);
stroke = new BasicStroke(0.48004404f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.774754, 19.008621);
generalPath.curveTo(39.788635, 22.112505, 38.140697, 24.986568, 35.454945, 26.54253);
generalPath.curveTo(32.769196, 28.098494, 29.4562, 28.098494, 26.770447, 26.54253);
generalPath.curveTo(24.084696, 24.986568, 22.436758, 22.112505, 22.45064, 19.008621);
generalPath.curveTo(22.436758, 15.904738, 24.084696, 13.030674, 26.770447, 11.474711);
generalPath.curveTo(29.4562, 9.918749, 32.769196, 9.918749, 35.454945, 11.474711);
generalPath.curveTo(38.140697, 13.030674, 39.788635, 15.904738, 39.774754, 19.008621);
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
generalPath.moveTo(40.204445, 10.451922);
generalPath.curveTo(40.228607, 11.352328, 37.360306, 12.186067, 32.685642, 12.637436);
generalPath.curveTo(28.01098, 13.088805, 22.244576, 13.088805, 17.569914, 12.637436);
generalPath.curveTo(12.895251, 12.186067, 10.026951, 11.352328, 10.051111, 10.451922);
generalPath.curveTo(10.026951, 9.551517, 12.895251, 8.717778, 17.569914, 8.266409);
generalPath.curveTo(22.244576, 7.8150396, 28.01098, 7.8150396, 32.685642, 8.266409);
generalPath.curveTo(37.360306, 8.717778, 40.228607, 9.551517, 40.204445, 10.451922);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(25.127777099609375, 10.451922416687012), 15.076666f, new Point2D.Double(25.127777099609375, 10.451922416687012), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 252, 154, 160),new Color(254, 252, 154, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.16666699945926666f, 7.650132117244495E-16f, 8.709935188293457f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.979781985282898f, 0.0f, 0.0f, 1.979781985282898f, -37.33127975463867f, -14.527460098266602f));
// _0_0_3
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.5051063f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.774754, 19.008621);
generalPath.curveTo(39.788635, 22.112505, 38.140697, 24.986568, 35.454945, 26.54253);
generalPath.curveTo(32.769196, 28.098494, 29.4562, 28.098494, 26.770447, 26.54253);
generalPath.curveTo(24.084696, 24.986568, 22.436758, 22.112505, 22.45064, 19.008621);
generalPath.curveTo(22.436758, 15.904738, 24.084696, 13.030674, 26.770447, 11.474711);
generalPath.curveTo(29.4562, 9.918749, 32.769196, 9.918749, 35.454945, 11.474711);
generalPath.curveTo(38.140697, 13.030674, 39.788635, 15.904738, 39.774754, 19.008621);
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
generalPath.moveTo(37.284637, 24.719967);
generalPath.curveTo(34.26817, 29.94464, 30.741135, 33.710007, 24.462492, 33.710007);
generalPath.curveTo(18.362474, 33.710007, 13.896955, 29.370308, 11.110016, 24.543188);
generalPath.curveTo(13.659429, 27.59911, 17.392948, 31.1095, 24.197327, 31.1095);
generalPath.curveTo(32.32753, 31.1095, 33.749104, 28.202646, 37.284637, 24.719967);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(37.284637, 24.012861);
generalPath.curveTo(34.26817, 29.237535, 30.741135, 33.0029, 24.462492, 33.0029);
generalPath.curveTo(18.362474, 33.0029, 13.896955, 28.663204, 11.110016, 23.836084);
generalPath.curveTo(13.659429, 26.892006, 17.392948, 30.402397, 24.197327, 30.402397);
generalPath.curveTo(32.32753, 30.402397, 33.749104, 27.495543, 37.284637, 24.012861);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(25.05270004272461, 39.59280014038086), 15.7572f, new Point2D.Double(25.05270004272461, 39.59280014038086), new float[] {0.0f,1.0f}, new Color[] {new Color(119, 119, 119, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.25f, 0.0f, 0.0f, 1.25f, -6.479445934295654f, -13.372110366821289f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0125030279159546f, 0.0f, 0.0f, 1.645326018333435f, -1.1769349575042725f, -10.685379981994629f));
// _0_0_6
paint = new Color(195, 180, 0, 255);
stroke = new BasicStroke(2.3243268f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.204445, 10.451922);
generalPath.curveTo(40.228607, 11.352328, 37.360306, 12.186067, 32.685642, 12.637436);
generalPath.curveTo(28.01098, 13.088805, 22.244576, 13.088805, 17.569914, 12.637436);
generalPath.curveTo(12.895251, 12.186067, 10.026951, 11.352328, 10.051111, 10.451922);
generalPath.curveTo(10.026951, 9.551517, 12.895251, 8.717778, 17.569914, 8.266409);
generalPath.curveTo(22.244576, 7.8150396, 28.01098, 7.8150396, 32.685642, 8.266409);
generalPath.curveTo(37.360306, 8.717778, 40.228607, 9.551517, 40.204445, 10.451922);
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
paint = new Color(255, 255, 6, 255);
stroke = new BasicStroke(0.78194094f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.204445, 10.451922);
generalPath.curveTo(40.228607, 11.352328, 37.360306, 12.186067, 32.685642, 12.637436);
generalPath.curveTo(28.01098, 13.088805, 22.244576, 13.088805, 17.569914, 12.637436);
generalPath.curveTo(12.895251, 12.186067, 10.026951, 11.352328, 10.051111, 10.451922);
generalPath.curveTo(10.026951, 9.551517, 12.895251, 8.717778, 17.569914, 8.266409);
generalPath.curveTo(22.244576, 7.8150396, 28.01098, 7.8150396, 32.685642, 8.266409);
generalPath.curveTo(37.360306, 8.717778, 40.228607, 9.551517, 40.204445, 10.451922);
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
generalPath.moveTo(25.203062, 17.57856);
generalPath.curveTo(26.982405, 21.949411, 31.532944, 22.064182, 33.1343, 17.728636);
generalPath.curveTo(30.310009, 19.967516, 27.713179, 19.322697, 25.203062, 17.57856);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
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
generalPath.moveTo(23.134298, 17.57856);
generalPath.curveTo(21.354958, 21.949411, 16.804419, 22.064182, 15.203063, 17.728636);
generalPath.curveTo(18.027353, 19.967516, 20.624184, 19.322697, 23.134298, 17.57856);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       face_angel base = new face_angel();
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
        return face_angel::new;
    }
}

