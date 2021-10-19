package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.util.Stack;
import javax.swing.plaf.UIResource;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_mobi implements RadianceIcon {
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
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(486.3110046386719, 644.1119995117188), new Point2D.Double(486.30999755859375, 742.0850219726562), new float[] {0.0f,0.005f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(116, 45, 45, 255)) : new Color(116, 45, 45, 255)),((colorFilter != null) ? colorFilter.filter(new Color(130, 113, 0, 255)) : new Color(130, 113, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 238, 145, 255)) : new Color(255, 238, 145, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(130, 113, 0, 255)) : new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.8f, 91.6f);
generalPath.lineTo(9.8f, 76.0f);
generalPath.lineTo(14.6f, 76.0f);
generalPath.lineTo(17.5f, 86.6f);
generalPath.lineTo(20.3f, 76.0f);
generalPath.lineTo(25.099998f, 76.0f);
generalPath.lineTo(25.099998f, 91.6f);
generalPath.lineTo(22.099998f, 91.6f);
generalPath.lineTo(22.099998f, 79.3f);
generalPath.lineTo(19.0f, 91.6f);
generalPath.lineTo(15.9f, 91.6f);
generalPath.lineTo(12.799999f, 79.299995f);
generalPath.lineTo(12.799999f, 91.6f);
generalPath.lineTo(9.799999f, 91.6f);
generalPath.closePath();
generalPath.moveTo(27.599998f, 83.9f);
generalPath.curveTo(27.599998f, 82.3f, 27.8f, 81.0f, 28.3f, 79.9f);
generalPath.curveTo(28.699999f, 79.1f, 29.099998f, 78.4f, 29.8f, 77.8f);
generalPath.curveTo(30.5f, 77.200005f, 31.099998f, 76.700005f, 31.8f, 76.4f);
generalPath.curveTo(32.8f, 76.0f, 33.899998f, 75.8f, 35.2f, 75.8f);
generalPath.curveTo(37.5f, 75.8f, 39.4f, 76.5f, 40.8f, 77.9f);
generalPath.curveTo(42.2f, 79.3f, 42.899998f, 81.3f, 42.899998f, 83.8f);
generalPath.curveTo(42.899998f, 86.3f, 42.199997f, 88.3f, 40.8f, 89.700005f);
generalPath.curveTo(39.4f, 91.100006f, 37.6f, 91.8f, 35.2f, 91.8f);
generalPath.curveTo(32.8f, 91.8f, 31.0f, 91.100006f, 29.6f, 89.700005f);
generalPath.curveTo(28.300001f, 88.3f, 27.6f, 86.4f, 27.6f, 83.9f);
generalPath.closePath();
generalPath.moveTo(30.899998f, 83.8f);
generalPath.curveTo(30.899998f, 85.600006f, 31.299997f, 86.9f, 32.1f, 87.8f);
generalPath.curveTo(32.899998f, 88.700005f, 34.0f, 89.200005f, 35.199997f, 89.200005f);
generalPath.curveTo(36.399994f, 89.200005f, 37.499996f, 88.700005f, 38.299995f, 87.8f);
generalPath.curveTo(39.099995f, 86.9f, 39.499996f, 85.5f, 39.499996f, 83.700005f);
generalPath.curveTo(39.499996f, 81.9f, 39.099995f, 80.600006f, 38.299995f, 79.700005f);
generalPath.curveTo(37.499996f, 78.8f, 36.499996f, 78.4f, 35.099995f, 78.4f);
generalPath.curveTo(33.699993f, 78.4f, 32.699993f, 78.8f, 31.899994f, 79.700005f);
generalPath.curveTo(31.299994f, 80.600006f, 30.899994f, 82.00001f, 30.899994f, 83.8f);
generalPath.closePath();
generalPath.moveTo(45.4f, 76.0f);
generalPath.lineTo(51.7f, 76.0f);
generalPath.curveTo(52.9f, 76.0f, 53.9f, 76.1f, 54.5f, 76.2f);
generalPath.curveTo(55.1f, 76.299995f, 55.7f, 76.5f, 56.1f, 76.799995f);
generalPath.curveTo(56.499996f, 77.09999f, 57.0f, 77.6f, 57.3f, 78.1f);
generalPath.curveTo(57.6f, 78.6f, 57.8f, 79.299995f, 57.8f, 79.9f);
generalPath.curveTo(57.8f, 80.6f, 57.6f, 81.3f, 57.2f, 81.9f);
generalPath.curveTo(56.800003f, 82.5f, 56.3f, 83.0f, 55.600002f, 83.3f);
generalPath.curveTo(56.600002f, 83.600006f, 57.300003f, 84.0f, 57.800003f, 84.700005f);
generalPath.curveTo(58.300003f, 85.40001f, 58.600002f, 86.100006f, 58.600002f, 87.00001f);
generalPath.curveTo(58.600002f, 87.700005f, 58.4f, 88.40001f, 58.100002f, 89.100006f);
generalPath.curveTo(57.800003f, 89.8f, 57.300003f, 90.3f, 56.7f, 90.700005f);
generalPath.curveTo(56.100002f, 91.100006f, 55.4f, 91.3f, 54.600002f, 91.4f);
generalPath.curveTo(54.100002f, 91.5f, 52.800003f, 91.5f, 50.800003f, 91.5f);
generalPath.lineTo(45.4f, 91.5f);
generalPath.lineTo(45.4f, 76.0f);
generalPath.closePath();
generalPath.moveTo(48.600002f, 78.6f);
generalPath.lineTo(48.600002f, 82.2f);
generalPath.lineTo(50.7f, 82.2f);
generalPath.curveTo(51.9f, 82.2f, 52.7f, 82.2f, 53.0f, 82.1f);
generalPath.curveTo(53.5f, 82.0f, 54.0f, 81.9f, 54.3f, 81.5f);
generalPath.curveTo(54.6f, 81.2f, 54.8f, 80.8f, 54.8f, 80.3f);
generalPath.curveTo(54.8f, 79.8f, 54.7f, 79.4f, 54.399998f, 79.100006f);
generalPath.curveTo(54.1f, 78.8f, 53.699997f, 78.600006f, 53.199997f, 78.600006f);
generalPath.curveTo(52.899998f, 78.600006f, 51.999996f, 78.50001f, 50.499996f, 78.50001f);
generalPath.lineTo(48.599995f, 78.50001f);
generalPath.closePath();
generalPath.moveTo(48.600002f, 84.799995f);
generalPath.lineTo(48.600002f, 89.0f);
generalPath.lineTo(51.600002f, 89.0f);
generalPath.curveTo(52.800003f, 89.0f, 53.500004f, 89.0f, 53.800003f, 88.9f);
generalPath.curveTo(54.300003f, 88.8f, 54.700005f, 88.6f, 55.000004f, 88.3f);
generalPath.curveTo(55.300003f, 88.0f, 55.400005f, 87.5f, 55.400005f, 87.0f);
generalPath.curveTo(55.400005f, 86.5f, 55.300007f, 86.1f, 55.100006f, 85.8f);
generalPath.curveTo(54.900005f, 85.5f, 54.500008f, 85.200005f, 54.100006f, 85.100006f);
generalPath.curveTo(53.700005f, 85.00001f, 52.700005f, 84.90001f, 51.300007f, 84.90001f);
generalPath.lineTo(48.600006f, 84.90001f);
generalPath.closePath();
generalPath.moveTo(61.200005f, 91.6f);
generalPath.lineTo(61.200005f, 76.0f);
generalPath.lineTo(64.4f, 76.0f);
generalPath.lineTo(64.4f, 91.6f);
generalPath.lineTo(61.2f, 91.6f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(254, 254, 254, 255)) : new Color(254, 254, 254, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(62.7f, 34.5f);
generalPath.curveTo(62.4f, 33.8f, 62.0f, 33.3f, 61.4f, 32.8f);
generalPath.curveTo(61.300003f, 33.3f, 61.100002f, 33.899998f, 60.800003f, 34.399998f);
generalPath.lineTo(44.4f, 59.6f);
generalPath.curveTo(43.800003f, 60.5f, 42.4f, 60.8f, 41.4f, 60.5f);
generalPath.lineTo(15.300001f, 53.2f);
generalPath.curveTo(13.700001f, 52.8f, 11.900002f, 51.9f, 11.800001f, 50.100002f);
generalPath.curveTo(11.700001f, 49.4f, 11.800001f, 49.2f, 12.200001f, 48.9f);
generalPath.curveTo(12.6f, 48.600002f, 13.000001f, 48.7f, 13.400001f, 48.800003f);
generalPath.lineTo(38.0f, 55.6f);
generalPath.curveTo(41.6f, 56.6f, 42.6f, 55.899998f, 45.2f, 51.899998f);
generalPath.lineTo(60.2f, 28.799997f);
generalPath.curveTo(61.0f, 27.599997f, 61.2f, 26.199997f, 60.7f, 24.999998f);
generalPath.curveTo(60.3f, 23.799997f, 59.3f, 22.899998f, 57.9f, 22.499998f);
generalPath.lineTo(36.4f, 16.499998f);
generalPath.curveTo(35.9f, 16.399998f, 35.4f, 16.399998f, 34.9f, 16.299997f);
generalPath.lineTo(35.0f, 16.199997f);
generalPath.curveTo(31.7f, 14.199997f, 30.4f, 17.999996f, 28.7f, 19.399998f);
generalPath.curveTo(28.1f, 19.899998f, 27.2f, 20.299997f, 27.0f, 20.799997f);
generalPath.curveTo(26.8f, 21.299997f, 26.9f, 21.799997f, 26.7f, 22.299997f);
generalPath.curveTo(26.1f, 23.699997f, 24.2f, 26.099997f, 23.300001f, 26.799997f);
generalPath.curveTo(22.7f, 27.199997f, 22.000002f, 27.299997f, 21.6f, 27.899998f);
generalPath.curveTo(21.300001f, 28.299997f, 21.4f, 28.999998f, 21.2f, 29.599998f);
generalPath.curveTo(20.7f, 30.899998f, 19.0f, 33.1f, 17.800001f, 34.199997f);
generalPath.curveTo(17.400002f, 34.6f, 16.7f, 34.899998f, 16.400002f, 35.399998f);
generalPath.curveTo(16.100002f, 35.8f, 16.2f, 36.499996f, 15.900002f, 36.999996f);
generalPath.curveTo(15.200002f, 38.399998f, 13.600001f, 40.399998f, 12.300001f, 41.499996f);
generalPath.curveTo(11.600001f, 42.099995f, 10.900002f, 42.399998f, 10.600001f, 43.099995f);
generalPath.curveTo(10.400002f, 43.399994f, 10.600001f, 43.899994f, 10.400002f, 44.299995f);
generalPath.curveTo(10.100001f, 44.999996f, 9.800001f, 45.499996f, 9.600001f, 45.999996f);
generalPath.curveTo(8.900002f, 46.999996f, 8.500001f, 48.199997f, 8.600001f, 49.599995f);
generalPath.curveTo(8.800001f, 52.799995f, 11.300001f, 55.899994f, 14.100001f, 56.699993f);
generalPath.lineTo(40.3f, 64.0f);
generalPath.curveTo(42.7f, 64.7f, 45.8f, 63.5f, 47.1f, 61.4f);
generalPath.lineTo(62.1f, 38.300003f);
generalPath.curveTo(62.899998f, 37.000004f, 63.1f, 35.700005f, 62.699997f, 34.500004f);
generalPath.closePath();
generalPath.moveTo(32.5f, 26.2f);
generalPath.lineTo(33.6f, 24.6f);
generalPath.curveTo(33.899998f, 24.1f, 34.6f, 23.9f, 35.0f, 24.0f);
generalPath.lineTo(52.2f, 28.8f);
generalPath.curveTo(52.7f, 28.9f, 52.9f, 29.4f, 52.600002f, 29.9f);
generalPath.lineTo(51.500004f, 31.5f);
generalPath.curveTo(51.200005f, 32.0f, 50.500004f, 32.2f, 50.100002f, 32.1f);
generalPath.lineTo(32.9f, 27.3f);
generalPath.curveTo(32.4f, 27.099998f, 32.2f, 26.599998f, 32.5f, 26.199999f);
generalPath.closePath();
generalPath.moveTo(28.1f, 32.600002f);
generalPath.lineTo(29.2f, 31.000002f);
generalPath.curveTo(29.5f, 30.500002f, 30.2f, 30.300001f, 30.6f, 30.400002f);
generalPath.lineTo(47.800003f, 35.2f);
generalPath.curveTo(48.300003f, 35.3f, 48.500004f, 35.8f, 48.200005f, 36.3f);
generalPath.lineTo(47.100006f, 37.899998f);
generalPath.curveTo(46.800007f, 38.399998f, 46.100006f, 38.6f, 45.700005f, 38.499996f);
generalPath.lineTo(28.500004f, 33.699997f);
generalPath.curveTo(28.000004f, 33.6f, 27.800003f, 33.1f, 28.100004f, 32.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(305.1709899902344, 859.4439697265625), new Point2D.Double(305.1709899902344, 814.6840209960938), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(170, 148, 0, 255)) : new Color(170, 148, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 74, 0, 255)) : new Color(86, 74, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9622655009227857f, 0.27211230353260446f, 0.27211230353260446f, -0.9622655009227857f, -485.17203323389003f, 762.9451758873668f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(495.43701171875, 715.27099609375), new Point2D.Double(508.98199462890625, 728.8179931640625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(254, 234, 134, 255)) : new Color(254, 234, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(134, 114, 0, 255)) : new Color(134, 114, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(130, 113, 0, 255)) : new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
        return 0.13099998235702515;
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
		return 0.7437919974327087;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_mobi() {
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
       ext_mobi base = new ext_mobi();
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
       ext_mobi base = new ext_mobi();
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
        return ext_mobi::new;
    }
}

