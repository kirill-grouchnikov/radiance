package org.pushingpixels.demo.substance.main.check.svg.flags;

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
public class ca implements ResizableIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.18199999630451202f, -3.0250000953674316f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(81.32, 3.025);
generalPath.lineTo(443.595, 3.025);
generalPath.lineTo(443.595, 515.025);
generalPath.lineTo(81.32, 515.025);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(-99.818, 3.025);
generalPath.lineTo(81.32, 3.025);
generalPath.lineTo(81.32, 515.025);
generalPath.lineTo(-99.818, 515.025);
generalPath.closePath();
generalPath.moveTo(443.59503, 3.025);
generalPath.lineTo(624.73303, 3.025);
generalPath.lineTo(624.73303, 515.025);
generalPath.lineTo(443.595, 515.025);
generalPath.closePath();
generalPath.moveTo(135.49, 250.44);
generalPath.lineTo(121.423004, 255.248);
generalPath.lineTo(186.879, 312.694);
generalPath.curveTo(191.829, 327.458, 185.159, 331.81, 180.909, 339.55402);
generalPath.lineTo(251.969, 330.53403);
generalPath.lineTo(250.11899, 402.04602);
generalPath.lineTo(264.83698, 401.62302);
generalPath.lineTo(261.62698, 330.70502);
generalPath.lineTo(332.757, 339.13702);
generalPath.curveTo(328.35498, 329.84003, 324.43698, 324.90402, 328.50998, 310.03903);
generalPath.lineTo(393.92398, 255.61304);
generalPath.lineTo(382.477, 251.46904);
generalPath.curveTo(373.117, 244.24704, 386.521, 216.68504, 388.543, 199.29105);
generalPath.curveTo(388.543, 199.29105, 350.348, 212.42604, 347.845, 205.55304);
generalPath.lineTo(338.118, 186.86804);
generalPath.lineTo(303.371, 225.03804);
generalPath.curveTo(299.575, 225.94804, 297.958, 224.43803, 297.06702, 221.23004);
generalPath.lineTo(313.12003, 141.46405);
generalPath.lineTo(287.7, 155.76105);
generalPath.curveTo(285.57202, 156.67105, 283.444, 155.88605, 282.04202, 153.40605);
generalPath.lineTo(257.59702, 104.33305);
generalPath.lineTo(232.38702, 155.28505);
generalPath.curveTo(230.48703, 157.11105, 228.58502, 157.32205, 227.00702, 156.08105);
generalPath.lineTo(202.8, 142.505);
generalPath.lineTo(217.33, 221.64801);
generalPath.curveTo(216.174, 224.79001, 213.406, 225.67401, 210.15001, 223.973);
generalPath.lineTo(176.934, 186.23601);
generalPath.curveTo(172.589, 193.19801, 169.64401, 204.572, 163.901, 207.121);
generalPath.curveTo(158.157, 209.509, 138.921, 202.299, 126.028, 199.485);
generalPath.curveTo(130.432, 215.38, 144.204, 241.787, 135.488, 250.442);
generalPath.closePath();
shape = generalPath;
paint = new Color(191, 10, 48, 255);
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
        return 0.0;
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
		return 512.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 512.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ca() {
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
       ca base = new ca();
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
       ca base = new ca();
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
        return ca::new;
    }
}

