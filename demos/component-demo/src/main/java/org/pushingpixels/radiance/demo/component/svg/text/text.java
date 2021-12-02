package org.pushingpixels.radiance.demo.component.svg.text;

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
public class text implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.004166666883975267f, 0.0f, 0.0f, 0.004166666883975267f, -0.0f, 0.3333333507180214f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
{
    Graphics2D gText = ((Graphics2D)g.create());
            Shape shapeText = null;
            GeneralPath generalPathText = null;
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
gText.setPaint(paint);
if (generalPathText == null) {
   generalPathText = new GeneralPath();
} else {
   generalPathText.reset();
}
generalPathText.moveTo(21.212402f, 35.0f);
generalPathText.lineTo(23.091309f, 25.605469f);
generalPathText.lineTo(24.938477f, 25.605469f);
generalPathText.lineTo(26.087402f, 32.873535f);
generalPathText.lineTo(30.219727f, 25.605469f);
generalPathText.lineTo(31.870117f, 25.605469f);
generalPathText.lineTo(29.99121f, 35.0f);
generalPathText.lineTo(28.74707f, 35.0f);
generalPathText.lineTo(30.275585f, 27.357422f);
generalPathText.lineTo(26.28291f, 34.371582f);
generalPathText.lineTo(24.994335f, 34.371582f);
generalPathText.lineTo(23.887304f, 27.338379f);
generalPathText.lineTo(22.35498f, 35.0f);
generalPathText.closePath();
generalPathText.moveTo(32.34619f, 37.507324f);
generalPathText.lineTo(33.964844f, 35.0f);
generalPathText.lineTo(32.67754f, 28.106445f);
generalPathText.lineTo(34.02959f, 28.106445f);
generalPathText.lineTo(34.965233f, 33.29883f);
generalPathText.lineTo(38.111134f, 28.106445f);
generalPathText.lineTo(39.291798f, 28.106445f);
generalPathText.lineTo(33.64746f, 37.507324f);
generalPathText.closePath();
shapeText = generalPath;
gText.fill(shapeText);
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
    gText.dispose();
}
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
{
    Graphics2D gText = ((Graphics2D)g.create());
            Shape shapeText = null;
            GeneralPath generalPathText = null;
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
gText.setPaint(paint);
if (generalPathText == null) {
   generalPathText = new GeneralPath();
} else {
   generalPathText.reset();
}
generalPathText.moveTo(54.575195f, 34.648438f);
generalPathText.quadTo(51.879883f, 35.36621f, 49.58008f, 35.36621f);
generalPathText.quadTo(45.72754f, 35.36621f, 43.493652f, 33.103027f);
generalPathText.quadTo(41.259766f, 30.839844f, 41.259766f, 26.94336f);
generalPathText.quadTo(41.259766f, 23.00293f, 43.55957f, 20.776367f);
generalPathText.quadTo(45.859375f, 18.549805f, 49.916992f, 18.549805f);
generalPathText.quadTo(51.879883f, 18.549805f, 54.44336f, 19.179688f);
generalPathText.lineTo(54.44336f, 22.314453f);
generalPathText.quadTo(51.777344f, 21.450195f, 50.180664f, 21.450195f);
generalPathText.quadTo(48.23242f, 21.450195f, 47.0459f, 22.944336f);
generalPathText.quadTo(45.859375f, 24.438477f, 45.859375f, 26.914062f);
generalPathText.quadTo(45.859375f, 29.448242f, 47.141113f, 30.97168f);
generalPathText.quadTo(48.42285f, 32.495117f, 50.561523f, 32.495117f);
generalPathText.quadTo(52.509766f, 32.495117f, 54.575195f, 31.645508f);
generalPathText.closePath();
generalPathText.moveTo(66.55762f, 33.271484f);
generalPathText.quadTo(64.38965f, 35.36621f, 61.914062f, 35.36621f);
generalPathText.quadTo(59.804688f, 35.36621f, 58.48633f, 34.07715f);
generalPathText.quadTo(57.16797f, 32.788086f, 57.16797f, 30.737305f);
generalPathText.quadTo(57.16797f, 28.07129f, 59.299316f, 26.628418f);
generalPathText.quadTo(61.430664f, 25.185547f, 65.40039f, 25.185547f);
generalPathText.lineTo(66.55762f, 25.185547f);
generalPathText.lineTo(66.55762f, 23.720703f);
generalPathText.quadTo(66.55762f, 21.21582f, 63.70117f, 21.21582f);
generalPathText.quadTo(61.166992f, 21.21582f, 58.57422f, 22.651367f);
generalPathText.lineTo(58.57422f, 19.663086f);
generalPathText.quadTo(61.518555f, 18.549805f, 64.4043f, 18.549805f);
generalPathText.quadTo(70.71777f, 18.549805f, 70.71777f, 23.574219f);
generalPathText.lineTo(70.71777f, 30.69336f);
generalPathText.quadTo(70.71777f, 32.583008f, 71.93359f, 32.583008f);
generalPathText.quadTo(72.15332f, 32.583008f, 72.50488f, 32.524414f);
generalPathText.lineTo(72.60742f, 34.956055f);
generalPathText.quadTo(71.23047f, 35.36621f, 70.17578f, 35.36621f);
generalPathText.quadTo(67.509766f, 35.36621f, 66.74805f, 33.271484f);
generalPathText.closePath();
generalPathText.moveTo(66.55762f, 30.942383f);
generalPathText.lineTo(66.55762f, 27.675781f);
generalPathText.lineTo(65.53223f, 27.675781f);
generalPathText.quadTo(61.328125f, 27.675781f, 61.328125f, 30.3125f);
generalPathText.quadTo(61.328125f, 31.206055f, 61.936035f, 31.813965f);
generalPathText.quadTo(62.543945f, 32.421875f, 63.4375f, 32.421875f);
generalPathText.quadTo(64.96094f, 32.421875f, 66.55762f, 30.942383f);
generalPathText.closePath();
generalPathText.moveTo(84.60449f, 34.91211f);
generalPathText.quadTo(83.05176f, 35.36621f, 82.1582f, 35.36621f);
generalPathText.quadTo(76.518555f, 35.36621f, 76.518555f, 30.092773f);
generalPathText.lineTo(76.518555f, 21.625977f);
generalPathText.lineTo(74.7168f, 21.625977f);
generalPathText.lineTo(74.7168f, 18.916016f);
generalPathText.lineTo(76.518555f, 18.916016f);
generalPathText.lineTo(76.518555f, 16.206055f);
generalPathText.lineTo(80.85449f, 15.708008f);
generalPathText.lineTo(80.85449f, 18.916016f);
generalPathText.lineTo(84.296875f, 18.916016f);
generalPathText.lineTo(84.296875f, 21.625977f);
generalPathText.lineTo(80.85449f, 21.625977f);
generalPathText.lineTo(80.85449f, 29.521484f);
generalPathText.quadTo(80.85449f, 32.48047f, 83.271484f, 32.48047f);
generalPathText.quadTo(83.828125f, 32.48047f, 84.60449f, 32.27539f);
generalPathText.closePath();
shapeText = generalPath;
gText.fill(shapeText);
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
    gText.dispose();
}
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2
{
    Graphics2D gText = ((Graphics2D)g.create());
            Shape shapeText = null;
            GeneralPath generalPathText = null;
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
gText.setPaint(paint);
if (generalPathText == null) {
   generalPathText = new GeneralPath();
} else {
   generalPathText.reset();
}
generalPathText.moveTo(56.25049f, 55.0f);
generalPathText.lineTo(57.6292f, 48.106445f);
generalPathText.lineTo(58.87969f, 48.106445f);
generalPathText.lineTo(57.500977f, 55.0f);
generalPathText.closePath();
generalPathText.moveTo(57.879295f, 46.855957f);
generalPathText.lineTo(58.129395f, 45.60547f);
generalPathText.lineTo(59.379883f, 45.60547f);
generalPathText.lineTo(59.129784f, 46.855957f);
generalPathText.closePath();
generalPathText.moveTo(61.804688f, 55.15869f);
generalPathText.quadTo(60.947754f, 55.15869f, 59.802635f, 54.75879f);
generalPathText.lineTo(60.03242f, 53.609863f);
generalPathText.quadTo(61.135643f, 54.21924f, 62.043358f, 54.21924f);
generalPathText.quadTo(62.58291f, 54.21924f, 62.996777f, 53.927246f);
generalPathText.quadTo(63.410645f, 53.635254f, 63.49824f, 53.197266f);
generalPathText.quadTo(63.626465f, 52.556152f, 62.713673f, 52.137207f);
generalPathText.lineTo(62.0459f, 51.82617f);
generalPathText.quadTo(60.561817f, 51.15332f, 60.814453f, 49.890137f);
generalPathText.quadTo(60.994728f, 48.98877f, 61.736134f, 48.471436f);
generalPathText.quadTo(62.47754f, 47.9541f, 63.58838f, 47.9541f);
generalPathText.quadTo(64.166016f, 47.9541f, 64.98486f, 48.112793f);
generalPathText.lineTo(65.23496f, 48.163574f);
generalPathText.lineTo(65.02676f, 49.20459f);
generalPathText.quadTo(64.0416f, 48.893555f, 63.42588f, 48.893555f);
generalPathText.quadTo(62.219826f, 48.893555f, 62.04463f, 49.76953f);
generalPathText.quadTo(61.93164f, 50.334473f, 62.76826f, 50.72168f);
generalPathText.lineTo(63.320507f, 50.975586f);
generalPathText.quadTo(64.25615f, 51.407227f, 64.585594f, 51.886475f);
generalPathText.quadTo(64.91504f, 52.365723f, 64.77158f, 53.083008f);
generalPathText.quadTo(64.59004f, 53.990723f, 63.75596f, 54.574707f);
generalPathText.quadTo(62.921875f, 55.15869f, 61.804688f, 55.15869f);
generalPathText.closePath();
shapeText = generalPath;
gText.fill(shapeText);
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
    gText.dispose();
}
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_3
{
    Graphics2D gText = ((Graphics2D)g.create());
            Shape shapeText = null;
            GeneralPath generalPathText = null;
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 0, 0, 255)) : new Color(255, 0, 0, 255);
gText.setPaint(paint);
if (generalPathText == null) {
   generalPathText = new GeneralPath();
} else {
   generalPathText.reset();
}
generalPathText.moveTo(90.60547f, 54.21875f);
generalPathText.quadTo(85.05078f, 55.722656f, 81.14453f, 55.722656f);
generalPathText.quadTo(74.25f, 55.722656f, 71.353516f, 51.796875f);
generalPathText.quadTo(68.45703f, 47.871094f, 69.921875f, 40.546875f);
generalPathText.quadTo(71.359375f, 33.359375f, 75.88867f, 29.365234f);
generalPathText.quadTo(80.41797f, 25.371094f, 87.15625f, 25.371094f);
generalPathText.quadTo(91.57031f, 25.371094f, 96.07422f, 26.679688f);
generalPathText.lineTo(95.31641f, 30.46875f);
generalPathText.quadTo(89.74609f, 28.4375f, 86.5625f, 28.4375f);
generalPathText.quadTo(81.875f, 28.4375f, 78.65039f, 31.621094f);
generalPathText.quadTo(75.42578f, 34.804688f, 74.26953f, 40.585938f);
generalPathText.quadTo(73.125f, 46.308594f, 75.26367f, 49.48242f);
generalPathText.quadTo(77.40234f, 52.65625f, 82.40234f, 52.65625f);
generalPathText.quadTo(84.453125f, 52.65625f, 86.98047f, 51.933594f);
generalPathText.lineTo(88.86328f, 42.51953f);
generalPathText.lineTo(92.94531f, 42.51953f);
generalPathText.closePath();
generalPathText.moveTo(97.75391f, 55.0f);
generalPathText.lineTo(101.99609f, 33.789062f);
generalPathText.lineTo(105.84375f, 33.789062f);
generalPathText.lineTo(105.046875f, 37.773438f);
generalPathText.quadTo(108.22266f, 33.320312f, 112.578125f, 33.320312f);
generalPathText.quadTo(113.16406f, 33.320312f, 113.78906f, 33.41797f);
generalPathText.lineTo(113.07031f, 37.01172f);
generalPathText.quadTo(112.140625f, 36.679688f, 111.37891f, 36.679688f);
generalPathText.quadTo(107.72656f, 36.679688f, 104.39844f, 41.015625f);
generalPathText.lineTo(101.60156f, 55.0f);
generalPathText.closePath();
generalPathText.moveTo(127.38281f, 55.0f);
generalPathText.lineTo(128.17969f, 51.015625f);
generalPathText.quadTo(124.21875f, 55.48828f, 119.84375f, 55.48828f);
generalPathText.quadTo(117.07031f, 55.48828f, 115.7793f, 53.740234f);
generalPathText.quadTo(114.48828f, 51.992188f, 115.08203f, 49.023438f);
generalPathText.lineTo(118.12891f, 33.789062f);
generalPathText.lineTo(121.97656f, 33.789062f);
generalPathText.lineTo(119.17969f, 47.773438f);
generalPathText.quadTo(118.703125f, 50.15625f, 119.19531f, 51.16211f);
generalPathText.quadTo(119.6875f, 52.16797f, 121.30859f, 52.16797f);
generalPathText.quadTo(124.82422f, 52.16797f, 128.875f, 47.539062f);
generalPathText.lineTo(131.625f, 33.789062f);
generalPathText.lineTo(135.47266f, 33.789062f);
generalPathText.lineTo(131.23047f, 55.0f);
generalPathText.closePath();
generalPathText.moveTo(138.94531f, 55.0f);
generalPathText.lineTo(143.1875f, 33.789062f);
generalPathText.lineTo(147.03516f, 33.789062f);
generalPathText.lineTo(146.23828f, 37.773438f);
generalPathText.quadTo(149.9414f, 33.320312f, 154.35547f, 33.320312f);
generalPathText.quadTo(158.61328f, 33.320312f, 159.26562f, 37.773438f);
generalPathText.quadTo(162.89453f, 33.30078f, 167.26953f, 33.30078f);
generalPathText.quadTo(170.08203f, 33.30078f, 171.29492f, 34.95117f);
generalPathText.quadTo(172.50781f, 36.601562f, 171.91406f, 39.570312f);
generalPathText.lineTo(168.82812f, 55.0f);
generalPathText.lineTo(164.96094f, 55.0f);
generalPathText.lineTo(167.92578f, 40.17578f);
generalPathText.quadTo(168.65234f, 36.54297f, 165.78125f, 36.54297f);
generalPathText.quadTo(162.79297f, 36.54297f, 158.66406f, 40.78125f);
generalPathText.lineTo(155.82031f, 55.0f);
generalPathText.lineTo(151.95312f, 55.0f);
generalPathText.lineTo(154.91797f, 40.17578f);
generalPathText.quadTo(155.64844f, 36.523438f, 152.71875f, 36.523438f);
generalPathText.quadTo(149.8086f, 36.523438f, 145.63672f, 40.78125f);
generalPathText.lineTo(142.79297f, 55.0f);
generalPathText.closePath();
generalPathText.moveTo(174.7461f, 62.714844f);
generalPathText.lineTo(180.53125f, 33.789062f);
generalPathText.lineTo(184.3789f, 33.789062f);
generalPathText.lineTo(183.58203f, 37.773438f);
generalPathText.quadTo(186.83594f, 33.320312f, 191.5625f, 33.320312f);
generalPathText.quadTo(195.39062f, 33.320312f, 197.0293f, 36.11328f);
generalPathText.quadTo(198.66797f, 38.90625f, 197.69922f, 43.75f);
generalPathText.quadTo(196.64453f, 49.023438f, 193.50781f, 52.25586f);
generalPathText.quadTo(190.3711f, 55.48828f, 186.3086f, 55.48828f);
generalPathText.quadTo(182.53906f, 55.48828f, 180.61719f, 52.597656f);
generalPathText.lineTo(178.59375f, 62.714844f);
generalPathText.closePath();
generalPathText.moveTo(181.14844f, 49.941406f);
generalPathText.quadTo(183.58594f, 52.597656f, 186.28125f, 52.597656f);
generalPathText.quadTo(191.82812f, 52.597656f, 193.51953f, 44.140625f);
generalPathText.quadTo(195.01172f, 36.679688f, 190.08984f, 36.679688f);
generalPathText.quadTo(186.86719f, 36.679688f, 183.10156f, 40.17578f);
generalPathText.closePath();
generalPathText.moveTo(201.15234f, 62.714844f);
generalPathText.lineTo(206.13281f, 55.0f);
generalPathText.lineTo(202.17188f, 33.789062f);
generalPathText.lineTo(206.33203f, 33.789062f);
generalPathText.lineTo(209.21094f, 49.765625f);
generalPathText.lineTo(218.89062f, 33.789062f);
generalPathText.lineTo(222.52344f, 33.789062f);
generalPathText.lineTo(205.15625f, 62.714844f);
generalPathText.closePath();
generalPathText.moveTo(222.91016f, 55.0f);
generalPathText.lineTo(223.67969f, 51.152344f);
generalPathText.lineTo(227.52734f, 51.152344f);
generalPathText.lineTo(226.75781f, 55.0f);
generalPathText.closePath();
generalPathText.moveTo(224.9414f, 47.285156f);
generalPathText.lineTo(227.53516f, 31.875f);
generalPathText.lineTo(228.6914f, 26.09375f);
generalPathText.lineTo(232.53906f, 26.09375f);
generalPathText.lineTo(231.38281f, 31.875f);
generalPathText.lineTo(227.83203f, 47.285156f);
generalPathText.closePath();
shapeText = generalPath;
gText.fill(shapeText);
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
    gText.dispose();
}
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
        return 0.08838501572608948;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.3987833857536316;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.8805277943611145;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 0.1958618313074112;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private text() {
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
       text base = new text();
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
       text base = new text();
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
        return text::new;
    }
}

