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
public class list_add implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.10824742f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.5504870414733887f, 0.0f, 0.0f, 1.9787139892578125f, -12.481300354003906f, -32.491031646728516f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.278214f, 34.94062f);
generalPath.curveTo(33.29475f, 35.77202f, 31.33152f, 36.541855f, 28.131912f, 36.958633f);
generalPath.curveTo(24.932302f, 37.37541f, 20.985443f, 37.37541f, 17.785833f, 36.958633f);
generalPath.curveTo(14.5862255f, 36.541855f, 12.622995f, 35.77202f, 12.639532f, 34.94062f);
generalPath.curveTo(12.622995f, 34.109222f, 14.5862255f, 33.339386f, 17.785833f, 32.922607f);
generalPath.curveTo(20.985443f, 32.505833f, 24.932302f, 32.505833f, 28.131912f, 32.922607f);
generalPath.curveTo(31.33152f, 33.339386f, 33.29475f, 34.109222f, 33.278214f, 34.94062f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(23.070682525634766, 35.127437591552734), 10.31934f, new Point2D.Double(23.070682525634766, 35.127437591552734), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9148120284080505f, 0.012650229968130589f, -0.008215020410716534f, 0.2135619968175888f, 2.2539141178131104f, 27.18889045715332f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(27.514357f, 37.542683f);
generalPath.lineTo(27.514357f, 28.515722f);
generalPath.lineTo(37.49282f, 28.475542f);
generalPath.lineTo(37.49282f, 21.480219f);
generalPath.lineTo(27.523285f, 21.480219f);
generalPath.lineTo(27.514357f, 11.520049f);
generalPath.lineTo(20.498081f, 11.53121f);
generalPath.lineTo(20.502546f, 21.462362f);
generalPath.lineTo(10.51292f, 21.536022f);
generalPath.lineTo(10.477206f, 28.50456f);
generalPath.lineTo(20.511475f, 28.475542f);
generalPath.lineTo(20.518171f, 37.515896f);
generalPath.lineTo(27.514357f, 37.542683f);
generalPath.closePath();
shape = generalPath;
paint = new Color(117, 161, 208, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(52, 101, 164, 255);
stroke = new BasicStroke(1.0000004f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(27.514357f, 37.542683f);
generalPath.lineTo(27.514357f, 28.515722f);
generalPath.lineTo(37.49282f, 28.475542f);
generalPath.lineTo(37.49282f, 21.480219f);
generalPath.lineTo(27.523285f, 21.480219f);
generalPath.lineTo(27.514357f, 11.520049f);
generalPath.lineTo(20.498081f, 11.53121f);
generalPath.lineTo(20.502546f, 21.462362f);
generalPath.lineTo(10.51292f, 21.536022f);
generalPath.lineTo(10.477206f, 28.50456f);
generalPath.lineTo(20.511475f, 28.475542f);
generalPath.lineTo(20.518171f, 37.515896f);
generalPath.lineTo(27.514357f, 37.542683f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.40860215f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.498701f, 36.53392f);
generalPath.lineTo(26.498701f, 27.499739f);
generalPath.lineTo(36.501305f, 27.499739f);
generalPath.lineTo(36.494606f, 22.47531f);
generalPath.lineTo(26.50763f, 22.47531f);
generalPath.lineTo(26.50763f, 12.480335f);
generalPath.lineTo(21.512796f, 12.498193f);
generalPath.lineTo(21.521725f, 22.47531f);
generalPath.lineTo(11.495536f, 22.493166f);
generalPath.lineTo(11.46875f, 27.466255f);
generalPath.lineTo(21.533142f, 27.475185f);
generalPath.lineTo(21.51975f, 36.50267f);
generalPath.lineTo(26.498701f, 36.53392f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.89284896850586, 36.42298889160156), new Point2D.Double(45.918697357177734, 48.54798889160156), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 255),new Color(81, 135, 214, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -18.017850875854492f, -13.571189880371094f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(16.874998092651367, 22.85179901123047), new Point2D.Double(27.900846481323242, 34.97679901123047), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 87)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0000006f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.498701f, 36.53392f);
generalPath.lineTo(26.498701f, 27.499739f);
generalPath.lineTo(36.501305f, 27.499739f);
generalPath.lineTo(36.494606f, 22.47531f);
generalPath.lineTo(26.50763f, 22.47531f);
generalPath.lineTo(26.50763f, 12.480335f);
generalPath.lineTo(21.512796f, 12.498193f);
generalPath.lineTo(21.521725f, 22.47531f);
generalPath.lineTo(11.495536f, 22.493166f);
generalPath.lineTo(11.46875f, 27.466255f);
generalPath.lineTo(21.533142f, 27.475185f);
generalPath.lineTo(21.51975f, 36.50267f);
generalPath.lineTo(26.498701f, 36.53392f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.31182796f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.0f, 25.0f);
generalPath.curveTo(11.0f, 26.9375f, 36.984375f, 24.03125f, 36.984375f, 24.96875f);
generalPath.lineTo(36.984375f, 21.96875f);
generalPath.lineTo(27.0f, 22.0f);
generalPath.lineTo(27.0f, 12.034772f);
generalPath.lineTo(21.0f, 12.034772f);
generalPath.lineTo(21.0f, 22.0f);
generalPath.lineTo(11.0f, 22.0f);
generalPath.lineTo(11.0f, 25.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
        return 7.090490341186523;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 11.019253730773926;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 32.05128860473633;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 30.444957733154297;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private list_add() {
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
       list_add base = new list_add();
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
       list_add base = new list_add();
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
        return list_add::new;
    }
}

