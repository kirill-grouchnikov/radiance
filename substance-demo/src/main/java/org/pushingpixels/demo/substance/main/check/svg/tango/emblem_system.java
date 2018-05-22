package org.pushingpixels.demo.substance.main.check.svg.tango;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.Icon;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.icon.IsHiDpiAware;
import org.pushingpixels.substance.api.icon.IsResizable;
import org.pushingpixels.substance.api.icon.SubstanceIcon;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/ibis">Ibis SVG transcoder</a>.
 */
public class emblem_system implements Icon, IsResizable, IsHiDpiAware, UIResource {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.40909088f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.8838850259780884f, 2.4748740196228027f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(25.45584487915039, 39.161163330078125), 19.622213f, new Point2D.Double(25.45584487915039, 39.161163330078125), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.31531500816345215f, 0.0f, 26.81304931640625f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.078056, 39.161163);
((GeneralPath)shape).curveTo(45.1095, 41.378223, 41.37642, 43.431126, 35.29237, 44.542526);
((GeneralPath)shape).curveTo(29.208319, 45.65393, 21.70337, 45.65393, 15.619318, 44.542526);
((GeneralPath)shape).curveTo(9.535267, 43.431126, 5.802187, 41.378223, 5.8336315, 39.161163);
((GeneralPath)shape).curveTo(5.802187, 36.944103, 9.535267, 34.8912, 15.619318, 33.7798);
((GeneralPath)shape).curveTo(21.70337, 32.668396, 29.208319, 32.668396, 35.29237, 33.7798);
((GeneralPath)shape).curveTo(41.37642, 34.8912, 45.1095, 36.944103, 45.078056, 39.161163);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(14.462891578674316, 12.284523963928223), new Point2D.Double(34.53434753417969, 39.684913635253906), new float[] {0.0f,0.25f,0.5f,0.75f,1.0f}, new Color[] {new Color(201, 201, 201, 255),new Color(248, 248, 248, 255),new Color(226, 226, 226, 255),new Color(176, 176, 176, 255),new Color(201, 201, 201, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2419350147247314f, 0.0f, 0.0f, 1.2419350147247314f, -5.027507781982422f, -7.208988189697266f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.25, 0.46875);
((GeneralPath)shape).curveTo(22.784561, 0.5005963, 22.332167, 0.5726847, 21.875, 0.625);
((GeneralPath)shape).lineTo(21.84375, 0.625);
((GeneralPath)shape).lineTo(20.75, 6.59375);
((GeneralPath)shape).curveTo(18.967276, 6.99974, 17.29009, 7.6887417, 15.78125, 8.625);
((GeneralPath)shape).lineTo(10.875, 5.09375);
((GeneralPath)shape).curveTo(9.548712, 6.1234407, 8.341802, 7.3243456, 7.28125, 8.625);
((GeneralPath)shape).lineTo(10.6875, 13.59375);
((GeneralPath)shape).curveTo(9.653267, 15.174265, 8.875532, 16.978973, 8.4375, 18.875);
((GeneralPath)shape).curveTo(8.437425, 18.883963, 8.437439, 18.904688, 8.4375, 18.90625);
((GeneralPath)shape).lineTo(2.5, 19.84375);
((GeneralPath)shape).curveTo(2.3914466, 20.730383, 2.34375, 21.646688, 2.34375, 22.5625);
((GeneralPath)shape).curveTo(2.34375, 23.3118, 2.3644395, 24.051088, 2.4375, 24.78125);
((GeneralPath)shape).lineTo(8.375, 25.84375);
((GeneralPath)shape).curveTo(8.797279, 27.905642, 9.599459, 29.831263, 10.71875, 31.53125);
((GeneralPath)shape).lineTo(7.1875, 36.375);
((GeneralPath)shape).curveTo(8.198826, 37.63052, 9.366392, 38.773617, 10.625, 39.78125);
((GeneralPath)shape).lineTo(15.625, 36.34375);
((GeneralPath)shape).curveTo(17.372433, 37.458466, 19.323084, 38.240124, 21.4375, 38.625);
((GeneralPath)shape).lineTo(22.375, 44.53125);
((GeneralPath)shape).curveTo(23.041183, 44.59189, 23.724348, 44.59375, 24.40625, 44.59375);
((GeneralPath)shape).curveTo(25.368935, 44.59375, 26.288486, 44.557266, 27.21875, 44.4375);
((GeneralPath)shape).lineTo(28.34375, 38.40625);
((GeneralPath)shape).curveTo(30.35131, 37.90665, 32.23722, 37.03996, 33.875, 35.875);
((GeneralPath)shape).lineTo(38.6875, 39.375);
((GeneralPath)shape).curveTo(39.935528, 38.3132, 41.07678, 37.092743, 42.0625, 35.78125);
((GeneralPath)shape).lineTo(38.5625, 30.71875);
((GeneralPath)shape).curveTo(39.510353, 29.08176, 40.16713, 27.275608, 40.5, 25.34375);
((GeneralPath)shape).lineTo(46.40625, 24.40625);
((GeneralPath)shape).curveTo(46.458042, 23.789904, 46.46875, 23.192163, 46.46875, 22.5625);
((GeneralPath)shape).curveTo(46.46875, 21.468287, 46.341568, 20.395416, 46.1875, 19.34375);
((GeneralPath)shape).lineTo(40.1875, 18.25);
((GeneralPath)shape).curveTo(39.717304, 16.513777, 38.945824, 14.893898, 37.96875, 13.4375);
((GeneralPath)shape).lineTo(41.5, 8.59375);
((GeneralPath)shape).curveTo(40.405426, 7.255143, 39.156822, 6.018569, 37.78125, 4.96875);
((GeneralPath)shape).lineTo(32.6875, 8.46875);
((GeneralPath)shape).curveTo(31.223503, 7.602913, 29.648037, 6.938568, 27.9375, 6.5625);
((GeneralPath)shape).lineTo(27.0, 0.625);
((GeneralPath)shape).curveTo(26.146702, 0.5246246, 25.286379, 0.46875, 24.40625, 0.46875);
((GeneralPath)shape).curveTo(24.168379, 0.46875, 23.923567, 0.4612654, 23.6875, 0.46875);
((GeneralPath)shape).curveTo(23.572416, 0.47239882, 23.458534, 0.4620551, 23.34375, 0.46875);
((GeneralPath)shape).curveTo(23.312662, 0.4705632, 23.281029, 0.4666269, 23.25, 0.46875);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(24.0625, 15.65625);
((GeneralPath)shape).curveTo(24.176666, 15.650457, 24.290651, 15.65625, 24.40625, 15.65625);
((GeneralPath)shape).curveTo(28.105377, 15.65625, 31.125, 18.675875, 31.125, 22.375);
((GeneralPath)shape).curveTo(31.125002, 26.074125, 28.105375, 29.0625, 24.40625, 29.0625);
((GeneralPath)shape).curveTo(20.707125, 29.062502, 17.71875, 26.074125, 17.71875, 22.375);
((GeneralPath)shape).curveTo(17.718752, 18.791473, 20.52335, 15.835842, 24.0625, 15.65625);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(128, 128, 128, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.25, 0.46875);
((GeneralPath)shape).curveTo(22.784561, 0.5005963, 22.332167, 0.5726847, 21.875, 0.625);
((GeneralPath)shape).lineTo(21.84375, 0.625);
((GeneralPath)shape).lineTo(20.75, 6.59375);
((GeneralPath)shape).curveTo(18.967276, 6.99974, 17.29009, 7.6887417, 15.78125, 8.625);
((GeneralPath)shape).lineTo(10.875, 5.09375);
((GeneralPath)shape).curveTo(9.548712, 6.1234407, 8.341802, 7.3243456, 7.28125, 8.625);
((GeneralPath)shape).lineTo(10.6875, 13.59375);
((GeneralPath)shape).curveTo(9.653267, 15.174265, 8.875532, 16.978973, 8.4375, 18.875);
((GeneralPath)shape).curveTo(8.437425, 18.883963, 8.437439, 18.904688, 8.4375, 18.90625);
((GeneralPath)shape).lineTo(2.5, 19.84375);
((GeneralPath)shape).curveTo(2.3914466, 20.730383, 2.34375, 21.646688, 2.34375, 22.5625);
((GeneralPath)shape).curveTo(2.34375, 23.3118, 2.3644395, 24.051088, 2.4375, 24.78125);
((GeneralPath)shape).lineTo(8.375, 25.84375);
((GeneralPath)shape).curveTo(8.797279, 27.905642, 9.599459, 29.831263, 10.71875, 31.53125);
((GeneralPath)shape).lineTo(7.1875, 36.375);
((GeneralPath)shape).curveTo(8.198826, 37.63052, 9.366392, 38.773617, 10.625, 39.78125);
((GeneralPath)shape).lineTo(15.625, 36.34375);
((GeneralPath)shape).curveTo(17.372433, 37.458466, 19.323084, 38.240124, 21.4375, 38.625);
((GeneralPath)shape).lineTo(22.375, 44.53125);
((GeneralPath)shape).curveTo(23.041183, 44.59189, 23.724348, 44.59375, 24.40625, 44.59375);
((GeneralPath)shape).curveTo(25.368935, 44.59375, 26.288486, 44.557266, 27.21875, 44.4375);
((GeneralPath)shape).lineTo(28.34375, 38.40625);
((GeneralPath)shape).curveTo(30.35131, 37.90665, 32.23722, 37.03996, 33.875, 35.875);
((GeneralPath)shape).lineTo(38.6875, 39.375);
((GeneralPath)shape).curveTo(39.935528, 38.3132, 41.07678, 37.092743, 42.0625, 35.78125);
((GeneralPath)shape).lineTo(38.5625, 30.71875);
((GeneralPath)shape).curveTo(39.510353, 29.08176, 40.16713, 27.275608, 40.5, 25.34375);
((GeneralPath)shape).lineTo(46.40625, 24.40625);
((GeneralPath)shape).curveTo(46.458042, 23.789904, 46.46875, 23.192163, 46.46875, 22.5625);
((GeneralPath)shape).curveTo(46.46875, 21.468287, 46.341568, 20.395416, 46.1875, 19.34375);
((GeneralPath)shape).lineTo(40.1875, 18.25);
((GeneralPath)shape).curveTo(39.717304, 16.513777, 38.945824, 14.893898, 37.96875, 13.4375);
((GeneralPath)shape).lineTo(41.5, 8.59375);
((GeneralPath)shape).curveTo(40.405426, 7.255143, 39.156822, 6.018569, 37.78125, 4.96875);
((GeneralPath)shape).lineTo(32.6875, 8.46875);
((GeneralPath)shape).curveTo(31.223503, 7.602913, 29.648037, 6.938568, 27.9375, 6.5625);
((GeneralPath)shape).lineTo(27.0, 0.625);
((GeneralPath)shape).curveTo(26.146702, 0.5246246, 25.286379, 0.46875, 24.40625, 0.46875);
((GeneralPath)shape).curveTo(24.168379, 0.46875, 23.923567, 0.4612654, 23.6875, 0.46875);
((GeneralPath)shape).curveTo(23.572416, 0.47239882, 23.458534, 0.4620551, 23.34375, 0.46875);
((GeneralPath)shape).curveTo(23.312662, 0.4705632, 23.281029, 0.4666269, 23.25, 0.46875);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(24.0625, 15.65625);
((GeneralPath)shape).curveTo(24.176666, 15.650457, 24.290651, 15.65625, 24.40625, 15.65625);
((GeneralPath)shape).curveTo(28.105377, 15.65625, 31.125, 18.675875, 31.125, 22.375);
((GeneralPath)shape).curveTo(31.125002, 26.074125, 28.105375, 29.0625, 24.40625, 29.0625);
((GeneralPath)shape).curveTo(20.707125, 29.062502, 17.71875, 26.074125, 17.71875, 22.375);
((GeneralPath)shape).curveTo(17.718752, 18.791473, 20.52335, 15.835842, 24.0625, 15.65625);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.64772725f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(0.6065179705619812f, 0.0f, 0.0f, 0.6065179705619812f, 10.1502103805542f, 7.936834812164307f));
// _0_0_2
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.6487557f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.239223, 23.781593);
((GeneralPath)shape).curveTo(36.25962, 28.342402, 33.83816, 32.565517, 29.89175, 34.85183);
((GeneralPath)shape).curveTo(25.94534, 37.13814, 21.077263, 37.13814, 17.130852, 34.85183);
((GeneralPath)shape).curveTo(13.18444, 32.565517, 10.762982, 28.342402, 10.783379, 23.781593);
((GeneralPath)shape).curveTo(10.762982, 19.220785, 13.18444, 14.997669, 17.130852, 12.711357);
((GeneralPath)shape).curveTo(21.077263, 10.425044, 25.94534, 10.425044, 29.89175, 12.711357);
((GeneralPath)shape).curveTo(33.83816, 14.997669, 36.25962, 19.220785, 36.239223, 23.781593);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.34659088f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.9999997f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.557789, 1.6501132);
((GeneralPath)shape).lineTo(21.6796, 7.4291234);
((GeneralPath)shape).curveTo(20.0086, 7.809669, 16.934874, 8.973535, 15.520595, 9.851116);
((GeneralPath)shape).lineTo(10.848562, 6.3639293);
((GeneralPath)shape).curveTo(9.605394, 7.3290873, 9.520139, 7.3945394, 8.526054, 8.613681);
((GeneralPath)shape).lineTo(11.904107, 13.623634);
((GeneralPath)shape).curveTo(10.934692, 15.105095, 9.770303, 17.745129, 9.352234, 19.631721);
((GeneralPath)shape).curveTo(9.352234, 19.631721, 3.4328249, 20.629562, 3.4328249, 20.629562);
((GeneralPath)shape).curveTo(3.331075, 21.460629, 3.379975, 23.23936, 3.448457, 23.923761);
((GeneralPath)shape).lineTo(9.1027, 24.942348);
((GeneralPath)shape).curveTo(9.498514, 26.875017, 10.979731, 29.985937, 12.028874, 31.579384);
((GeneralPath)shape).lineTo(8.453299, 36.30343);
((GeneralPath)shape).curveTo(9.401242, 37.48026, 9.590962, 37.587948, 10.770691, 38.532433);
((GeneralPath)shape).lineTo(15.551859, 35.029613);
((GeneralPath)shape).curveTo(17.189777, 36.074467, 20.440891, 37.345497, 22.422794, 37.706253);
((GeneralPath)shape).lineTo(23.207481, 43.412506);
((GeneralPath)shape).curveTo(23.831913, 43.469345, 25.556961, 43.628788, 26.428925, 43.516525);
((GeneralPath)shape).lineTo(27.307112, 37.576374);
((GeneralPath)shape).curveTo(29.188854, 37.108086, 32.440273, 35.773415, 33.97541, 34.68146);
((GeneralPath)shape).lineTo(38.751465, 38.13227);
((GeneralPath)shape).curveTo(39.921276, 37.13702, 39.93176, 36.987057, 40.8557, 35.757755);
((GeneralPath)shape).lineTo(37.316505, 30.727055);
((GeneralPath)shape).curveTo(38.204952, 29.192656, 39.353733, 26.191832, 39.66574, 24.381044);
((GeneralPath)shape).lineTo(45.460384, 23.419582);
((GeneralPath)shape).curveTo(45.50893, 22.841864, 45.511295, 21.230793, 45.366882, 20.245037);
((GeneralPath)shape).lineTo(39.463104, 19.226448);
((GeneralPath)shape).curveTo(39.022377, 17.599037, 37.509895, 14.666467, 36.594055, 13.301345);
((GeneralPath)shape).lineTo(40.34641, 8.577302);
((GeneralPath)shape).curveTo(39.320435, 7.3225875, 38.938965, 7.150431, 37.6496, 6.1664066);
((GeneralPath)shape).lineTo(32.70729, 9.705604);
((GeneralPath)shape).curveTo(31.335043, 8.894031, 28.598675, 7.656856, 26.99534, 7.304357);
((GeneralPath)shape).lineTo(26.122267, 1.6501132);
((GeneralPath)shape).curveTo(25.322445, 1.5560285, 23.014872, 1.5978075, 22.557789, 1.6501132);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 1.84375;
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
		return 45.125;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.0;
	}

    /** The current width of this resizable icon. */
    private int width;

    /** The current height of this resizable icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public emblem_system() {
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
    public boolean isHiDpiAware() {
        return true;
    }

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
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
     * Returns an instance of this icon with specified dimensions.
     */
    public static SubstanceIcon of(int width, int height) {
       emblem_system base = new emblem_system();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       emblem_system base = new emblem_system();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

