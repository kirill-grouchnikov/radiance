package org.pushingpixels.demo.flamingo.svg.tango.transcoded;

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
public class Preferences_desktop_font implements RadianceIcon {
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
paint = new RadialGradientPaint(new Point2D.Double(24.445690155029297, 35.878170013427734), 20.530962f, new Point2D.Double(24.445690155029297, 35.878170013427734), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(220, 220, 220, 255)) : new Color(220, 220, 220, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9950579404830933f, -1.6515269512350966E-32f, 0.0f, 1.9950579404830933f, -24.324880599975586f, -35.700870513916016f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 255)) : new Color(155, 155, 155, 255);
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
stroke = new BasicStroke(0.99999976f,0,2,10.0f,null,0.0f);
shape = new RoundRectangle2D.Double(5.597388744354248, 4.70600700378418, 37.69658660888672, 37.69658660888672, 8.485278129577637, 8.485278129577637);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.187523f, 7.5673065f);
generalPath.lineTo(16.902367f, 15.512619f);
generalPath.lineTo(16.644554f, 16.579025f);
generalPath.curveTo(16.621107f, 16.68059f, 16.60939f, 16.766527f, 16.609398f, 16.836838f);
generalPath.curveTo(16.60939f, 16.96184f, 16.648453f, 17.071215f, 16.726585f, 17.164963f);
generalPath.curveTo(16.789078f, 17.235275f, 16.867203f, 17.270432f, 16.96096f, 17.270432f);
generalPath.curveTo(17.062513f, 17.270432f, 17.195328f, 17.207932f, 17.359398f, 17.082932f);
generalPath.curveTo(17.664076f, 16.85637f, 18.070326f, 16.38762f, 18.578148f, 15.676682f);
generalPath.lineTo(18.976585f, 15.957932f);
generalPath.curveTo(18.437513f, 16.770433f, 17.882826f, 17.391525f, 17.312523f, 17.821213f);
generalPath.curveTo(16.742203f, 18.243088f, 16.214859f, 18.454025f, 15.730492f, 18.454025f);
generalPath.curveTo(15.394547f, 18.454025f, 15.140641f, 18.368088f, 14.968773f, 18.196213f);
generalPath.curveTo(14.804704f, 18.03215f, 14.722673f, 17.789963f, 14.72268f, 17.46965f);
generalPath.curveTo(14.722673f, 17.08684f, 14.80861f, 16.582933f, 14.980492f, 15.957932f);
generalPath.lineTo(15.226586f, 15.079025f);
generalPath.curveTo(14.203142f, 16.414965f, 13.261737f, 17.348557f, 12.402367f, 17.879807f);
generalPath.curveTo(11.785176f, 18.262619f, 11.179708f, 18.454025f, 10.585961f, 18.454025f);
generalPath.curveTo(10.015646f, 18.454025f, 9.523459f, 18.21965f, 9.109399f, 17.7509f);
generalPath.curveTo(8.695335f, 17.27434f, 8.488304f, 16.621996f, 8.488305f, 15.793869f);
generalPath.curveTo(8.488304f, 14.551685f, 8.859398f, 13.243093f, 9.601586f, 11.868088f);
generalPath.curveTo(10.351583f, 10.485283f, 11.300801f, 9.379815f, 12.449242f, 8.5516815f);
generalPath.curveTo(13.347674f, 7.895442f, 14.19533f, 7.567317f, 14.992211f, 7.5673065f);
generalPath.curveTo(15.468766f, 7.567317f, 15.863297f, 7.692317f, 16.175804f, 7.9423065f);
generalPath.curveTo(16.496109f, 8.192317f, 16.738297f, 8.606379f, 16.902367f, 9.184494f);
generalPath.lineTo(17.324242f, 7.8485565f);
generalPath.lineTo(19.187523f, 7.5673065f);
generalPath.moveTo(15.015648f, 8.1766815f);
generalPath.curveTo(14.515642f, 8.176692f, 13.984392f, 8.411066f, 13.421898f, 8.8798065f);
generalPath.curveTo(12.625019f, 9.543878f, 11.914082f, 10.528252f, 11.289086f, 11.832932f);
generalPath.curveTo(10.671896f, 13.137624f, 10.363302f, 14.31731f, 10.363305f, 15.371994f);
generalPath.curveTo(10.363302f, 15.903246f, 10.496115f, 16.32512f, 10.761742f, 16.637619f);
generalPath.curveTo(11.027364f, 16.942308f, 11.332051f, 17.09465f, 11.675805f, 17.09465f);
generalPath.curveTo(12.527363f, 17.09465f, 13.453143f, 16.465746f, 14.453148f, 15.207932f);
generalPath.curveTo(15.789078f, 13.536061f, 16.457047f, 11.821219f, 16.457054f, 10.0634f);
generalPath.curveTo(16.457047f, 9.399346f, 16.32814f, 8.918879f, 16.070335f, 8.621994f);
generalPath.curveTo(15.812515f, 8.325129f, 15.460953f, 8.176692f, 15.015648f, 8.1766815f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.843164f, 20.148026f);
generalPath.lineTo(23.843164f, 26.056417f);
generalPath.curveTo(24.570492f, 25.30076f, 25.31199f, 24.724564f, 26.067669f, 24.327824f);
generalPath.curveTo(26.82333f, 23.921665f, 27.758469f, 23.718578f, 28.87309f, 23.718563f);
generalPath.curveTo(30.157719f, 23.718578f, 31.281775f, 24.02557f, 32.245266f, 24.639536f);
generalPath.curveTo(33.218178f, 25.244085f, 33.969124f, 26.127274f, 34.498108f, 27.289103f);
generalPath.curveTo(35.036507f, 28.44151f, 35.305714f, 29.81116f, 35.30573f, 31.398058f);
generalPath.curveTo(35.305714f, 32.56935f, 35.15458f, 33.64618f, 34.85233f, 34.628544f);
generalPath.curveTo(34.55949f, 35.601475f, 34.129704f, 36.446877f, 33.562965f, 37.16476f);
generalPath.curveTo(32.9962f, 37.88265f, 32.306652f, 38.439953f, 31.49432f, 38.83668f);
generalPath.curveTo(30.691408f, 39.22396f, 29.803497f, 39.417603f, 28.830585f, 39.417603f);
generalPath.curveTo(28.235485f, 39.417603f, 27.673456f, 39.346756f, 27.144497f, 39.20507f);
generalPath.curveTo(26.624966f, 39.06338f, 26.18101f, 38.87919f, 25.81263f, 38.652485f);
generalPath.curveTo(25.444233f, 38.41634f, 25.127796f, 38.17547f, 24.86332f, 37.92988f);
generalPath.curveTo(24.608274f, 37.684284f, 24.268223f, 37.3159f, 23.843164f, 36.82471f);
generalPath.lineTo(23.843164f, 37.207268f);
generalPath.curveTo(23.843159f, 37.9346f, 23.668411f, 38.487183f, 23.318918f, 38.865017f);
generalPath.curveTo(22.969418f, 39.233406f, 22.525461f, 39.417603f, 21.987051f, 39.417603f);
generalPath.curveTo(21.439188f, 39.417603f, 20.999954f, 39.233406f, 20.669352f, 38.865017f);
generalPath.curveTo(20.34819f, 38.487183f, 20.18761f, 37.9346f, 20.187613f, 37.207268f);
generalPath.lineTo(20.187613f, 20.31805f);
generalPath.curveTo(20.18761f, 19.534063f, 20.343468f, 18.943695f, 20.655184f, 18.54695f);
generalPath.curveTo(20.976341f, 18.140799f, 21.420296f, 17.937712f, 21.987051f, 17.93769f);
generalPath.curveTo(22.582136f, 17.937712f, 23.04026f, 18.131351f, 23.361425f, 18.518612f);
generalPath.curveTo(23.68258f, 18.896467f, 23.843159f, 19.439604f, 23.843164f, 20.148026f);
generalPath.moveTo(24.02736f, 31.638927f);
generalPath.curveTo(24.027353f, 33.178608f, 24.37685f, 34.364063f, 25.075851f, 35.195297f);
generalPath.curveTo(25.784285f, 36.01709f, 26.709978f, 36.427986f, 27.852938f, 36.427982f);
generalPath.curveTo(28.825851f, 36.427986f, 29.66181f, 36.007645f, 30.360815f, 35.166958f);
generalPath.curveTo(31.069244f, 34.316837f, 31.423464f, 33.103043f, 31.423475f, 31.525576f);
generalPath.curveTo(31.423464f, 30.50543f, 31.277052f, 29.626966f, 30.984243f, 28.890179f);
generalPath.curveTo(30.691408f, 28.153412f, 30.275791f, 27.58666f, 29.737389f, 27.18992f);
generalPath.curveTo(29.198963f, 26.78376f, 28.570812f, 26.580675f, 27.852938f, 26.580664f);
generalPath.curveTo(27.11615f, 26.580675f, 26.459663f, 26.78376f, 25.883472f, 27.18992f);
generalPath.curveTo(25.307268f, 27.58666f, 24.853867f, 28.16758f, 24.523268f, 28.932686f);
generalPath.curveTo(24.192656f, 29.688364f, 24.027353f, 30.590443f, 24.02736f, 31.638927f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
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
generalPath.moveTo(39.201935f, 12.649522f);
generalPath.curveTo(39.201927f, 12.84475f, 39.18891f, 13.13107f, 39.16289f, 13.508484f);
generalPath.curveTo(39.149868f, 13.8729f, 39.14336f, 14.139699f, 39.143368f, 14.308881f);
generalPath.lineTo(36.41031f, 14.308881f);
generalPath.lineTo(36.41031f, 11.907691f);
generalPath.curveTo(36.4103f, 11.439177f, 36.15001f, 11.204915f, 35.629433f, 11.204904f);
generalPath.curveTo(35.108845f, 11.204915f, 34.848553f, 11.439177f, 34.848557f, 11.907691f);
generalPath.lineTo(34.848557f, 19.618828f);
generalPath.curveTo(34.848553f, 20.100368f, 35.108845f, 20.341139f, 35.629433f, 20.341137f);
generalPath.curveTo(36.15001f, 20.341139f, 36.4103f, 20.100368f, 36.41031f, 19.618828f);
generalPath.lineTo(36.41031f, 17.061464f);
generalPath.lineTo(39.143368f, 17.061464f);
generalPath.lineTo(39.143368f, 19.560263f);
generalPath.curveTo(39.14336f, 20.328123f, 38.726894f, 20.913778f, 37.89397f, 21.31723f);
generalPath.curveTo(37.23022f, 21.642595f, 36.475376f, 21.805277f, 35.629433f, 21.805277f);
generalPath.curveTo(34.770466f, 21.805277f, 34.01562f, 21.642595f, 33.364895f, 21.31723f);
generalPath.curveTo(32.531963f, 20.913778f, 32.115498f, 20.328123f, 32.115498f, 19.560263f);
generalPath.lineTo(32.115498f, 12.044344f);
generalPath.curveTo(32.115498f, 10.599737f, 33.286808f, 9.877429f, 35.629433f, 9.877418f);
generalPath.curveTo(36.80074f, 9.877429f, 37.6597f, 10.053126f, 38.206318f, 10.404508f);
generalPath.curveTo(38.870056f, 10.833999f, 39.201927f, 11.582337f, 39.201935f, 12.649522f);
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
	private Preferences_desktop_font() {
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
       Preferences_desktop_font base = new Preferences_desktop_font();
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
       Preferences_desktop_font base = new Preferences_desktop_font();
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
        return Preferences_desktop_font::new;
    }
}

