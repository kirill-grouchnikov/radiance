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
public class view_refresh implements Icon, IsResizable, IsHiDpiAware, UIResource {
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
g.setComposite(AlphaComposite.getInstance(3, 0.38333333f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(-1.4897359609603882f, 0.0f, 0.0f, -1.0012520551681519f, 61.208648681640625f, 75.28189849853516f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, new Point2D.Double(24.837125778198242, 36.42112731933594), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5367230176925659f, -9.680927934296868E-14f, 16.87306022644043f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.48186, 36.421127);
((GeneralPath)shape).curveTo(40.50693, 39.429993, 37.530556, 42.216076, 32.67976, 43.724407);
((GeneralPath)shape).curveTo(27.828962, 45.23274, 21.845287, 45.23274, 16.99449, 43.724407);
((GeneralPath)shape).curveTo(12.143692, 42.216076, 9.167317, 39.429993, 9.192389, 36.421127);
((GeneralPath)shape).curveTo(9.167317, 33.412262, 12.143692, 30.626177, 16.99449, 29.117847);
((GeneralPath)shape).curveTo(21.845287, 27.609516, 27.828962, 27.609516, 32.67976, 29.117847);
((GeneralPath)shape).curveTo(37.530556, 30.626177, 40.50693, 33.412262, 40.48186, 36.421127);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(13.478553771972656, 10.61220645904541), new Point2D.Double(15.419417381286621, 19.115121841430664), new float[] {0.0f,0.33333334f,1.0f}, new Color[] {new Color(52, 101, 164, 255),new Color(91, 134, 190, 255),new Color(131, 168, 216, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.46541300415992737f, -0.2775929868221283f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.152912, 10.409904);
((GeneralPath)shape).curveTo(20.152912, 10.409904, 11.215413, 9.784904, 13.965413, 20.284904);
((GeneralPath)shape).lineTo(6.277913, 20.284904);
((GeneralPath)shape).curveTo(6.277913, 20.284904, 6.777913, 8.409904, 20.152912, 10.409904);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(37.1280517578125, 29.729604721069336), new Point2D.Double(37.06541442871094, 26.19407081604004), new float[] {0.0f,1.0f}, new Color[] {new Color(52, 101, 164, 255),new Color(52, 101, 164, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 47.52790832519531f, 45.847408294677734f));
stroke = new BasicStroke(0.9999996f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.152912, 10.409904);
((GeneralPath)shape).curveTo(20.152912, 10.409904, 11.215413, 9.784904, 13.965413, 20.284904);
((GeneralPath)shape).lineTo(6.277913, 20.284904);
((GeneralPath)shape).curveTo(6.277913, 20.284904, 6.777913, 8.409904, 20.152912, 10.409904);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(-0.5790510177612305f, -0.4892280101776123f, -0.4892280101776123f, 0.5790510177612305f, 56.91585159301758f, 13.371370315551758f));
// _0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0
paint = new LinearGradientPaint(new Point2D.Double(62.51383590698242, 36.06123733520508), new Point2D.Double(15.98486328125, 20.608579635620117), new float[] {0.0f,1.0f}, new Color[] {new Color(185, 207, 231, 255),new Color(114, 159, 207, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.30678, 50.229694);
((GeneralPath)shape).curveTo(62.8215, 35.81886, 49.664585, 13.411704, 22.462412, 12.49765);
((GeneralPath)shape).lineTo(22.113844, 3.151548);
((GeneralPath)shape).lineTo(7.624544, 20.496754);
((GeneralPath)shape).lineTo(22.714329, 33.21919);
((GeneralPath)shape).curveTo(22.714329, 33.21919, 22.462412, 23.337969, 22.462412, 23.337969);
((GeneralPath)shape).curveTo(41.29217, 24.336946, 55.44404, 37.4097, 44.30678, 50.229694);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(46.834815979003906, 45.264122009277344), new Point2D.Double(45.380435943603516, 50.939666748046875), new float[] {0.0f,1.0f}, new Color[] {new Color(52, 101, 164, 255),new Color(52, 101, 164, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.3191693f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.30678, 50.229694);
((GeneralPath)shape).curveTo(62.8215, 35.81886, 49.664585, 13.411704, 22.462412, 12.49765);
((GeneralPath)shape).lineTo(22.113844, 3.151548);
((GeneralPath)shape).lineTo(7.624544, 20.496754);
((GeneralPath)shape).lineTo(22.714329, 33.21919);
((GeneralPath)shape).curveTo(22.714329, 33.21919, 22.462412, 23.337969, 22.462412, 23.337969);
((GeneralPath)shape).curveTo(41.29217, 24.336946, 55.44404, 37.4097, 44.30678, 50.229694);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2_0);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new LinearGradientPaint(new Point2D.Double(32.647972106933594, 30.74884605407715), new Point2D.Double(37.12446212768555, 24.842252731323242), new float[] {0.0f,1.0f}, new Color[] {new Color(196, 215, 235, 255),new Color(196, 215, 235, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.375, 33.4375);
((GeneralPath)shape).curveTo(28.375, 33.4375, 37.3125, 34.0625, 34.5625, 23.5625);
((GeneralPath)shape).lineTo(42.338387, 23.5625);
((GeneralPath)shape).curveTo(42.338387, 25.065102, 41.75, 35.4375, 28.375, 33.4375);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.713836669921875, 31.455951690673828), new Point2D.Double(37.12446212768555, 24.842252731323242), new float[] {0.0f,1.0f}, new Color[] {new Color(57, 119, 195, 255),new Color(137, 174, 220, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.9999996f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.375, 33.4375);
((GeneralPath)shape).curveTo(28.375, 33.4375, 37.3125, 34.0625, 34.5625, 23.5625);
((GeneralPath)shape).lineTo(42.338387, 23.5625);
((GeneralPath)shape).curveTo(42.338387, 25.065102, 41.75, 35.4375, 28.375, 33.4375);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(0.5790510177612305f, 0.4892280101776123f, 0.4892280101776123f, -0.5790510177612305f, -7.921022891998291f, 30.53598976135254f));
// _0_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4_0
paint = new LinearGradientPaint(new Point2D.Double(18.935766220092773, 23.667896270751953), new Point2D.Double(53.588623046875, 26.649362564086914), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 255),new Color(82, 138, 197, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.30678, 50.229694);
((GeneralPath)shape).curveTo(62.8215, 35.81886, 49.664585, 13.411704, 22.462412, 12.49765);
((GeneralPath)shape).lineTo(22.399431, 3.0690298);
((GeneralPath)shape).lineTo(7.793943, 20.424006);
((GeneralPath)shape).lineTo(22.462412, 33.006348);
((GeneralPath)shape).curveTo(22.462412, 33.006348, 22.462412, 23.337969, 22.462412, 23.337969);
((GeneralPath)shape).curveTo(41.29217, 24.336946, 55.44404, 37.4097, 44.30678, 50.229694);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(46.834815979003906, 45.264122009277344), new Point2D.Double(45.380435943603516, 50.939666748046875), new float[] {0.0f,1.0f}, new Color[] {new Color(52, 101, 164, 255),new Color(52, 101, 164, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.3191693f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.30678, 50.229694);
((GeneralPath)shape).curveTo(62.8215, 35.81886, 49.664585, 13.411704, 22.462412, 12.49765);
((GeneralPath)shape).lineTo(22.399431, 3.0690298);
((GeneralPath)shape).lineTo(7.793943, 20.424006);
((GeneralPath)shape).lineTo(22.462412, 33.006348);
((GeneralPath)shape).curveTo(22.462412, 33.006348, 22.462412, 23.337969, 22.462412, 23.337969);
((GeneralPath)shape).curveTo(41.29217, 24.336946, 55.44404, 37.4097, 44.30678, 50.229694);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4_0);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.27222225f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.0625, 38.1875);
((GeneralPath)shape).lineTo(7.125, 23.3125);
((GeneralPath)shape).lineTo(20.0625, 22.9375);
((GeneralPath)shape).lineTo(15.673627, 28.116318);
((GeneralPath)shape).lineTo(19.540852, 30.489515);
((GeneralPath)shape).curveTo(16.540852, 32.739517, 14.991304, 32.911644, 13.991304, 35.474144);
((GeneralPath)shape).lineTo(11.174446, 33.363873);
((GeneralPath)shape).lineTo(7.0625, 38.1875);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(0.5085359811782837f, 0.4296509921550751f, 0.4296509921550751f, -0.5085359811782837f, -3.9731879234313965f, 30.541189193725586f));
// _0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6_0
paint = new LinearGradientPaint(new Point2D.Double(5.9649176597595215, 26.04816436767578), new Point2D.Double(52.854095458984375, 26.04816436767578), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5020893f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(51.090263, 45.943707);
((GeneralPath)shape).curveTo(60.210464, 30.723955, 46.631615, 12.20113, 19.485058, 11.948579);
((GeneralPath)shape).lineTo(19.513464, 3.7032833);
((GeneralPath)shape).lineTo(6.534198, 19.296638);
((GeneralPath)shape).lineTo(19.36766, 30.26876);
((GeneralPath)shape).curveTo(19.36766, 30.26876, 19.42328, 21.261883, 19.42328, 21.261883);
((GeneralPath)shape).curveTo(36.951096, 21.037973, 54.618465, 31.365253, 51.090263, 45.943707);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6_0);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(-0.5085359811782837f, -0.4296509921550751f, -0.4296509921550751f, 0.5085359811782837f, 53.04899978637695f, 13.365480422973633f));
// _0_0_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7_0
paint = new LinearGradientPaint(new Point2D.Double(5.9649176597595215, 26.04816436767578), new Point2D.Double(52.854095458984375, 26.04816436767578), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5020893f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(51.389927, 46.505947);
((GeneralPath)shape).curveTo(60.510128, 31.286196, 47.050762, 12.432359, 19.628483, 12.069755);
((GeneralPath)shape).lineTo(19.342825, 4.05072);
((GeneralPath)shape).lineTo(6.341309, 19.379475);
((GeneralPath)shape).lineTo(19.80906, 30.76459);
((GeneralPath)shape).curveTo(19.80906, 30.76459, 19.627295, 21.311346, 19.627295, 21.311346);
((GeneralPath)shape).curveTo(37.87223, 21.693317, 54.411175, 32.23659, 51.389927, 46.505947);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7_0);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 0.27222225f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.8125, 16.5);
((GeneralPath)shape).curveTo(10.405935, 6.0587273, 23.256283, 10.355393, 27.0, 12.0);
((GeneralPath)shape).curveTo(31.175306, 12.211475, 32.674736, 9.164996, 36.0, 9.0);
((GeneralPath)shape).curveTo(21.950264, -0.7899963, 7.1875, 2.5, 6.8125, 16.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
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
		return 48.0;
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
	public view_refresh() {
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
       view_refresh base = new view_refresh();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       view_refresh base = new view_refresh();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

