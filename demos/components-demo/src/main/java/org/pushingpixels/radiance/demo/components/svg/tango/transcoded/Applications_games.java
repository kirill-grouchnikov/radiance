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
public class Applications_games implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.38636363f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.408115029335022f, 0.0f, 0.0f, 0.4929580092430115f, -7.856804847717285f, 28.288719177246094f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.142857f, 30.857143f);
generalPath.curveTo(38.16781f, 34.491642f, 35.205383f, 37.857037f, 30.377314f, 39.678993f);
generalPath.curveTo(25.549248f, 41.500954f, 19.593609f, 41.500954f, 14.765542f, 39.678993f);
generalPath.curveTo(9.937474f, 37.857037f, 6.9750466f, 34.491642f, 7.0f, 30.857143f);
generalPath.curveTo(6.9750466f, 27.222643f, 9.937474f, 23.85725f, 14.765542f, 22.035294f);
generalPath.curveTo(19.593609f, 20.213335f, 25.549248f, 20.213335f, 30.377314f, 22.035294f);
generalPath.curveTo(35.205383f, 23.85725f, 38.16781f, 27.222643f, 38.142857f, 30.857143f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(22.571428298950195, 30.85714340209961), 15.571428f, new Point2D.Double(22.571428298950195, 30.85714340209961), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.6513760089874268f, 3.8960779657278184E-15f, 10.757539749145508f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9802799820899963f, -0.19761699438095093f, 0.19761699438095093f, 0.9802799820899963f, -10.728349685668945f, 1.0851049423217773f));
// _0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9653639793395996f, 0.26090800762176514f, -0.26090800762176514f, 0.9653639793395996f, 11.349209785461426f, -0.5226759910583496f));
// _0_0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9653840065002441f, -0.2608329951763153f, 0.2608329951763153f, 0.9653840065002441f, 0.0f, 0.0f));
// _0_0_1_0_0
shape = new RoundRectangle2D.Double(-1.9805312156677246, 8.210731506347656, 30.930360794067383, 39.03262710571289, 6.060927867889404, 5.656864643096924);
paint = new LinearGradientPaint(new Point2D.Double(42.15003204345703, 23.40526580810547), new Point2D.Double(50.87135696411133, 39.3181266784668), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(229, 229, 229, 255)) : new Color(229, 229, 229, 255)),((colorFilter != null) ? colorFilter.filter(new Color(200, 200, 200, 255)) : new Color(200, 200, 200, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8930889964103699f, 2.4185458797894126E-16f, -3.7011480501146997E-16f, 1.1197090148925781f, -18.45684051513672f, -0.381848007440567f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 138, 133, 255)) : new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0000017f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(-1.9805312156677246, 8.210731506347656, 30.930360794067383, 39.03262710571289, 6.060927867889404, 5.656864643096924);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9653760194778442f, -0.2608639895915985f, 0.2608030140399933f, 0.965391993522644f, 0.0f, 0.0f));
// _0_0_1_0_1
shape = new RoundRectangle2D.Double(-1.0130478143692017, 9.101876258850098, 28.99733543395996, 37.150211334228516, 4.4699506759643555, 3.8891007900238037);
paint = new LinearGradientPaint(new Point2D.Double(38.897804260253906, 32.23447799682617), new Point2D.Double(69.18116760253906, 57.055389404296875), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(229, 229, 229, 255)) : new Color(229, 229, 229, 255)),((colorFilter != null) ? colorFilter.filter(new Color(200, 200, 200, 255)) : new Color(200, 200, 200, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8824639916419983f, 3.464905002471759E-16f, -8.831331208893642E-16f, 1.1232290267944336f, -18.457029342651367f, -0.30422499775886536f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0000025f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(-1.0130478143692017, 9.101876258850098, 28.99733543395996, 37.150211334228516, 4.4699506759643555, 3.8891007900238037);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.51648355f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.1767760068178177f, 7.24783992767334f));
// _0_0_1_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.130389f, 22.794182f);
generalPath.curveTo(22.980885f, 26.961538f, 29.3674f, 17.052488f, 40.601906f, 22.794182f);
generalPath.lineTo(38.721928f, 3.5888283f);
generalPath.curveTo(38.721928f, 3.5888283f, 38.11114f, 1.4341087f, 36.70666f, 1.6919748f);
generalPath.lineTo(12.249217f, 1.922697f);
generalPath.curveTo(10.654669f, 1.781581f, 10.44653f, 2.8886232f, 10.479394f, 4.067412f);
generalPath.lineTo(10.130389f, 22.794182f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(48.0, 18.534204483032227), new Point2D.Double(78.0, 18.534204483032227), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0157170295715332f, 7.557276759059008E-18f, -7.795538689879395E-18f, 1.0477399826049805f, -38.624019622802734f, -6.5425190925598145f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.6875f, 12.28125f);
generalPath.curveTo(14.13478f, 15.630644f, 12.705188f, 16.554443f, 12.6875f, 18.4375f);
generalPath.curveTo(12.670309f, 20.26803f, 14.981028f, 21.868397f, 17.0f, 20.71875f);
generalPath.curveTo(17.064192f, 21.65549f, 17.094534f, 23.274815f, 16.53125f, 23.9375f);
generalPath.curveTo(16.61964f, 23.937502f, 19.0f, 23.96875f, 19.0f, 23.96875f);
generalPath.curveTo(18.999998f, 23.968752f, 18.387556f, 21.93878f, 18.3125f, 20.59375f);
generalPath.curveTo(20.52189f, 21.985624f, 22.669676f, 20.474531f, 22.6875f, 18.34375f);
generalPath.curveTo(22.706844f, 16.109568f, 21.406126f, 15.397146f, 17.6875f, 12.28125f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.25f));
// _0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.875f));
// _0_0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 2.5f, 2.75f));
// _0_0_2_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.1767760068178177f, 7.24783992767334f));
// _0_0_2_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.51648355f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.249051f, 13.68551f);
generalPath.curveTo(22.267511f, 21.50188f, 31.322859f, 13.953532f, 40.328777f, 22.789518f);
generalPath.lineTo(45.504536f, 4.778087f);
generalPath.lineTo(44.31062f, 2.2533867f);
generalPath.lineTo(19.506897f, -5.5996203f);
generalPath.lineTo(16.789787f, -4.294419f);
generalPath.lineTo(11.249051f, 13.68551f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(48.0, 18.534204483032227), new Point2D.Double(78.0, 18.534204483032227), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.969323992729187f, 0.3034670054912567f, -0.3130339980125427f, 0.9998840093612671f, -26.513540267944336f, -28.877639770507812f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9664639830589294f, 0.2568039894104004f, -0.2568039894104004f, 0.9664639830589294f, 0.0f, 0.0f));
// _0_0_2_0_0_1
shape = new RoundRectangle2D.Double(16.60003089904785, -3.979738712310791, 30.93037223815918, 39.03263854980469, 6.060929775238037, 5.656866550445557);
paint = new LinearGradientPaint(new Point2D.Double(35.32130813598633, 24.98446273803711), new Point2D.Double(51.86124801635742, 41.3704719543457), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(229, 229, 229, 255)) : new Color(229, 229, 229, 255)),((colorFilter != null) ? colorFilter.filter(new Color(200, 200, 200, 255)) : new Color(200, 200, 200, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8930889964103699f, -5.9912960600914874E-18f, 7.511521263475638E-18f, 1.1197099685668945f, 0.123710997402668f, -12.572319984436035f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 138, 133, 255)) : new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0000019f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(16.60003089904785, -3.979738712310791, 30.93037223815918, 39.03263854980469, 6.060929775238037, 5.656866550445557);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9664720296859741f, 0.2567729949951172f, -0.2568340003490448f, 0.9664559960365295f, 0.0f, 0.0f));
// _0_0_2_0_0_2
shape = new RoundRectangle2D.Double(17.567136764526367, -3.087998390197754, 28.99733543395996, 37.1502571105957, 4.469949722290039, 3.889106273651123);
paint = new LinearGradientPaint(new Point2D.Double(34.56182098388672, 17.249048233032227), new Point2D.Double(50.808902740478516, 44.76952362060547), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(229, 229, 229, 255)) : new Color(229, 229, 229, 255)),((colorFilter != null) ? colorFilter.filter(new Color(223, 223, 223, 255)) : new Color(223, 223, 223, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8824639916419983f, -2.896566144245519E-17f, -5.327444162002464E-17f, 1.1232320070266724f, 0.1231599971652031f, -12.494110107421875f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0000031f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(17.567136764526367, -3.087998390197754, 28.99733543395996, 37.1502571105957, 4.469949722290039, 3.889106273651123);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.21921f, 18.57943f);
generalPath.curveTo(32.016663f, 16.34947f, 35.37125f, 20.241547f, 34.574306f, 23.107834f);
generalPath.curveTo(33.84576f, 25.728115f, 31.535908f, 26.45757f, 25.327822f, 29.802046f);
generalPath.curveTo(21.304976f, 24.065321f, 19.745802f, 22.573204f, 20.607912f, 19.463713f);
generalPath.curveTo(21.49938f, 16.244665f, 25.660599f, 14.764478f, 28.21921f, 18.57943f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(204, 0, 0, 255)) : new Color(204, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.51648355f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.408724f, 24.666098f);
generalPath.curveTo(26.878572f, 31.803663f, 32.987286f, 22.750612f, 42.50975f, 31.027325f);
generalPath.lineTo(47.031673f, 13.797161f);
generalPath.curveTo(47.29684f, 12.824889f, 47.01348f, 12.056174f, 45.59927f, 11.70262f);
generalPath.lineTo(22.57675f, 5.2715507f);
generalPath.curveTo(21.250923f, 4.9179974f, 20.120085f, 5.8543754f, 19.943308f, 6.738259f);
generalPath.lineTo(15.408724f, 24.666098f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(54.287078857421875, 9.11362075805664), new Point2D.Double(68.8434829711914, 38.11833190917969), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.985863983631134f, 0.24445000290870667f, -0.2521570026874542f, 1.0169450044631958f, -24.58715057373047f, -15.188389778137207f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
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
        return 0.07118791341781616;
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
		return 47.92881393432617;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Applications_games() {
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
       Applications_games base = new Applications_games();
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
       Applications_games base = new Applications_games();
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
        return Applications_games::new;
    }
}

