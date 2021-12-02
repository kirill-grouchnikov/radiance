package org.pushingpixels.radiance.demo.theming.main.check.svg.tango;

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
public class edit_delete implements RadianceIcon {
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
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.022623829543590546f, 0.0f, 0.0f, 0.019662480801343918f, 44.39519119262695f, 41.98146057128906f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
// _0_0_0_0
shape = new Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375);
paint = new LinearGradientPaint(new Point2D.Double(302.8571472167969, 366.64788818359375), new Point2D.Double(302.8571472167969, 609.5050659179688), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
// _0_0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-219.61876f, -150.68037f);
generalPath.curveTo(-219.61876f, -150.68037f, -219.61876f, 327.65042f, -219.61876f, 327.65042f);
generalPath.curveTo(-76.74459f, 328.55087f, 125.78146f, 220.48074f, 125.78138f, 88.45424f);
generalPath.curveTo(125.78138f, -43.572304f, -33.655437f, -150.68036f, -219.61876f, -150.68037f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
// _0_0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-1559.2523f, -150.68037f);
generalPath.curveTo(-1559.2523f, -150.68037f, -1559.2523f, 327.65042f, -1559.2523f, 327.65042f);
generalPath.curveTo(-1702.1265f, 328.55087f, -1904.6525f, 220.48074f, -1904.6525f, 88.45424f);
generalPath.curveTo(-1904.6525f, -43.572304f, -1745.2157f, -150.68036f, -1559.2523f, -150.68037f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.38659793f * origAlpha));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.75f, 21.0f);
generalPath.lineTo(43.25f, 21.0f);
generalPath.lineTo(42.375f, 32.25f);
generalPath.lineTo(5.625f, 32.25f);
generalPath.lineTo(4.75f, 21.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.0, 21.0), new Point2D.Double(25.0, 32.25), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.000805f, 16.500029f);
generalPath.curveTo(3.9568443f, 16.464575f, 5.72773f, 42.00552f, 5.7282343f, 42.013264f);
generalPath.curveTo(5.8943634f, 44.56396f, 7.288948f, 45.496197f, 8.84989f, 45.499996f);
generalPath.curveTo(8.905668f, 45.500126f, 38.133934f, 45.49671f, 38.756645f, 45.494057f);
generalPath.curveTo(41.38534f, 45.482838f, 42.029343f, 43.85947f, 42.202267f, 42.085777f);
generalPath.curveTo(42.216137f, 42.050804f, 43.986115f, 16.535f, 43.99998f, 16.500029f);
generalPath.curveTo(30.666924f, 16.500029f, 17.333866f, 16.500029f, 4.000805f, 16.500029f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 189, 182, 255)) : new Color(186, 189, 182, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(85, 87, 83, 255)) : new Color(85, 87, 83, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.000805f, 16.500029f);
generalPath.curveTo(3.9568443f, 16.464575f, 5.72773f, 42.00552f, 5.7282343f, 42.013264f);
generalPath.curveTo(5.8943634f, 44.56396f, 7.288948f, 45.496197f, 8.84989f, 45.499996f);
generalPath.curveTo(8.905668f, 45.500126f, 38.133934f, 45.49671f, 38.756645f, 45.494057f);
generalPath.curveTo(41.38534f, 45.482838f, 42.029343f, 43.85947f, 42.202267f, 42.085777f);
generalPath.curveTo(42.216137f, 42.050804f, 43.986115f, 16.535f, 43.99998f, 16.500029f);
generalPath.curveTo(30.666924f, 16.500029f, 17.333866f, 16.500029f, 4.000805f, 16.500029f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.23711339f * origAlpha));
// _0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.457954f, 20.71267f);
generalPath.lineTo(7.2079372f, 20.689264f);
generalPath.curveTo(34.519245f, 21.326591f, 39.885143f, 24.337412f, 43.214188f, 24.183575f);
generalPath.lineTo(43.457954f, 20.71267f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(7.373860836029053, 27.37662124633789), new Point2D.Double(7.529111862182617, 69.46050262451172), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.5204110145568848f, 0.0f, 0.0f, 0.34801599383354187f, -3.0379180908203125f, 1.5442570447921753f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.12886599f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.08838865160942078f, 0.08838865160942078f));
// _0_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.163486f, 19.614075f);
generalPath.curveTo(29.163486f, 19.614075f, 30.279472f, 23.33545f, 29.517143f, 26.348055f);
generalPath.curveTo(28.754814f, 29.360659f, 29.269247f, 34.210167f, 29.269247f, 34.210167f);
generalPath.lineTo(30.884373f, 34.634373f);
generalPath.curveTo(30.884373f, 34.634373f, 30.117495f, 30.028639f, 30.931356f, 26.524832f);
generalPath.curveTo(31.745218f, 23.021023f, 30.577814f, 19.614988f, 30.577814f, 19.614988f);
generalPath.lineTo(29.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.163486f, 19.614075f);
generalPath.curveTo(29.163486f, 19.614075f, 30.279472f, 23.33545f, 29.517143f, 26.348055f);
generalPath.curveTo(28.754814f, 29.360659f, 29.269247f, 34.210167f, 29.269247f, 34.210167f);
generalPath.lineTo(30.884373f, 34.634373f);
generalPath.curveTo(30.884373f, 34.634373f, 30.117495f, 30.028639f, 30.931356f, 26.524832f);
generalPath.curveTo(31.745218f, 23.021023f, 30.577814f, 19.614988f, 30.577814f, 19.614988f);
generalPath.lineTo(29.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.912416f, 19.75934f);
generalPath.curveTo(9.912416f, 19.75934f, 11.028404f, 23.480717f, 10.266074f, 26.49332f);
generalPath.curveTo(9.503745f, 29.505924f, 10.018178f, 34.355434f, 10.018178f, 34.355434f);
generalPath.lineTo(11.456527f, 33.80737f);
generalPath.curveTo(11.456527f, 33.80737f, 10.866426f, 30.173906f, 11.680288f, 26.670097f);
generalPath.curveTo(12.49415f, 23.16629f, 11.326745f, 19.760256f, 11.326745f, 19.760256f);
generalPath.lineTo(9.912416f, 19.75934f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.912416f, 19.75934f);
generalPath.curveTo(9.912416f, 19.75934f, 11.028404f, 23.480717f, 10.266074f, 26.49332f);
generalPath.curveTo(9.503745f, 29.505924f, 10.018178f, 34.355434f, 10.018178f, 34.355434f);
generalPath.lineTo(11.456527f, 33.80737f);
generalPath.curveTo(11.456527f, 33.80737f, 10.866426f, 30.173906f, 11.680288f, 26.670097f);
generalPath.curveTo(12.49415f, 23.16629f, 11.326745f, 19.760256f, 11.326745f, 19.760256f);
generalPath.lineTo(9.912416f, 19.75934f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.66716f, 19.714073f);
generalPath.curveTo(11.66716f, 19.714073f, 12.783146f, 23.43545f, 12.020817f, 26.448053f);
generalPath.curveTo(11.258488f, 29.460657f, 8.617841f, 31.76449f, 8.617841f, 31.76449f);
generalPath.lineTo(9.826038f, 33.73022f);
generalPath.curveTo(9.826038f, 33.73022f, 12.621168f, 30.12864f, 13.43503f, 26.62483f);
generalPath.curveTo(14.248892f, 23.121023f, 13.081487f, 19.714989f, 13.081487f, 19.714989f);
generalPath.lineTo(11.66716f, 19.714073f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.66716f, 19.714073f);
generalPath.curveTo(11.66716f, 19.714073f, 12.783146f, 23.43545f, 12.020817f, 26.448053f);
generalPath.curveTo(11.258488f, 29.460657f, 8.617841f, 31.76449f, 8.617841f, 31.76449f);
generalPath.lineTo(9.826038f, 33.73022f);
generalPath.curveTo(9.826038f, 33.73022f, 12.621168f, 30.12864f, 13.43503f, 26.62483f);
generalPath.curveTo(14.248892f, 23.121023f, 13.081487f, 19.714989f, 13.081487f, 19.714989f);
generalPath.lineTo(11.66716f, 19.714073f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.163486f, 19.614075f);
generalPath.curveTo(21.163486f, 19.614075f, 22.279472f, 23.33545f, 21.517143f, 26.348055f);
generalPath.curveTo(20.754814f, 29.360659f, 21.269247f, 34.210167f, 21.269247f, 34.210167f);
generalPath.lineTo(22.928568f, 34.766956f);
generalPath.curveTo(22.928568f, 34.766956f, 22.117495f, 30.028639f, 22.931356f, 26.524832f);
generalPath.curveTo(23.745218f, 23.021023f, 22.577814f, 19.614988f, 22.577814f, 19.614988f);
generalPath.lineTo(21.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.163486f, 19.614075f);
generalPath.curveTo(21.163486f, 19.614075f, 22.279472f, 23.33545f, 21.517143f, 26.348055f);
generalPath.curveTo(20.754814f, 29.360659f, 21.269247f, 34.210167f, 21.269247f, 34.210167f);
generalPath.lineTo(22.928568f, 34.766956f);
generalPath.curveTo(22.928568f, 34.766956f, 22.117495f, 30.028639f, 22.931356f, 26.524832f);
generalPath.curveTo(23.745218f, 23.021023f, 22.577814f, 19.614988f, 22.577814f, 19.614988f);
generalPath.lineTo(21.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.163486f, 19.614075f);
generalPath.curveTo(35.163486f, 19.614075f, 36.279472f, 23.33545f, 35.517143f, 26.348055f);
generalPath.curveTo(34.754814f, 29.360659f, 36.55088f, 33.50306f, 36.55088f, 33.50306f);
generalPath.lineTo(38.077614f, 32.292084f);
generalPath.curveTo(38.077614f, 32.292084f, 36.117496f, 30.028639f, 36.93136f, 26.524832f);
generalPath.curveTo(37.74522f, 23.021023f, 36.577812f, 19.614988f, 36.577812f, 19.614988f);
generalPath.lineTo(35.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.163486f, 19.614075f);
generalPath.curveTo(35.163486f, 19.614075f, 36.279472f, 23.33545f, 35.517143f, 26.348055f);
generalPath.curveTo(34.754814f, 29.360659f, 36.55088f, 33.50306f, 36.55088f, 33.50306f);
generalPath.lineTo(38.077614f, 32.292084f);
generalPath.curveTo(38.077614f, 32.292084f, 36.117496f, 30.028639f, 36.93136f, 26.524832f);
generalPath.curveTo(37.74522f, 23.021023f, 36.577812f, 19.614988f, 36.577812f, 19.614988f);
generalPath.lineTo(35.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.163486f, 19.614075f);
generalPath.curveTo(31.163486f, 19.614075f, 32.279472f, 23.33545f, 31.517143f, 26.348055f);
generalPath.curveTo(30.754814f, 29.360659f, 31.269247f, 34.210167f, 31.269247f, 34.210167f);
generalPath.lineTo(32.795982f, 34.148235f);
generalPath.curveTo(32.795982f, 34.148235f, 32.117496f, 30.028639f, 32.93136f, 26.524832f);
generalPath.curveTo(33.74522f, 23.021023f, 32.577812f, 19.614988f, 32.577812f, 19.614988f);
generalPath.lineTo(31.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.163486f, 19.614075f);
generalPath.curveTo(31.163486f, 19.614075f, 32.279472f, 23.33545f, 31.517143f, 26.348055f);
generalPath.curveTo(30.754814f, 29.360659f, 31.269247f, 34.210167f, 31.269247f, 34.210167f);
generalPath.lineTo(32.795982f, 34.148235f);
generalPath.curveTo(32.795982f, 34.148235f, 32.117496f, 30.028639f, 32.93136f, 26.524832f);
generalPath.curveTo(33.74522f, 23.021023f, 32.577812f, 19.614988f, 32.577812f, 19.614988f);
generalPath.lineTo(31.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.163486f, 19.614075f);
generalPath.curveTo(33.163486f, 19.614075f, 34.279472f, 23.33545f, 33.517143f, 26.348055f);
generalPath.curveTo(32.754814f, 29.360659f, 32.473755f, 34.03339f, 32.473755f, 34.03339f);
generalPath.lineTo(34.265656f, 34.457596f);
generalPath.curveTo(34.265656f, 34.457596f, 34.117496f, 30.028639f, 34.93136f, 26.524832f);
generalPath.curveTo(35.74522f, 23.021023f, 34.577812f, 19.614988f, 34.577812f, 19.614988f);
generalPath.lineTo(33.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.163486f, 19.614075f);
generalPath.curveTo(33.163486f, 19.614075f, 34.279472f, 23.33545f, 33.517143f, 26.348055f);
generalPath.curveTo(32.754814f, 29.360659f, 32.473755f, 34.03339f, 32.473755f, 34.03339f);
generalPath.lineTo(34.265656f, 34.457596f);
generalPath.curveTo(34.265656f, 34.457596f, 34.117496f, 30.028639f, 34.93136f, 26.524832f);
generalPath.curveTo(35.74522f, 23.021023f, 34.577812f, 19.614988f, 34.577812f, 19.614988f);
generalPath.lineTo(33.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(27.163486f, 19.614075f);
generalPath.curveTo(27.163486f, 19.614075f, 28.279472f, 23.33545f, 27.517143f, 26.348055f);
generalPath.curveTo(26.754814f, 29.360659f, 28.064743f, 33.989197f, 28.064743f, 33.989197f);
generalPath.lineTo(29.724062f, 33.308548f);
generalPath.curveTo(29.724062f, 33.308548f, 28.117495f, 30.028639f, 28.931356f, 26.524832f);
generalPath.curveTo(29.745218f, 23.021023f, 28.577814f, 19.614988f, 28.577814f, 19.614988f);
generalPath.lineTo(27.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(27.163486f, 19.614075f);
generalPath.curveTo(27.163486f, 19.614075f, 28.279472f, 23.33545f, 27.517143f, 26.348055f);
generalPath.curveTo(26.754814f, 29.360659f, 28.064743f, 33.989197f, 28.064743f, 33.989197f);
generalPath.lineTo(29.724062f, 33.308548f);
generalPath.curveTo(29.724062f, 33.308548f, 28.117495f, 30.028639f, 28.931356f, 26.524832f);
generalPath.curveTo(29.745218f, 23.021023f, 28.577814f, 19.614988f, 28.577814f, 19.614988f);
generalPath.lineTo(27.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.163486f, 19.614075f);
generalPath.curveTo(25.163486f, 19.614075f, 26.279472f, 23.33545f, 25.517143f, 26.348055f);
generalPath.curveTo(24.754814f, 29.360659f, 24.164394f, 34.077583f, 24.164394f, 34.077583f);
generalPath.lineTo(25.69113f, 34.28082f);
generalPath.curveTo(25.69113f, 34.28082f, 26.117495f, 30.028639f, 26.931356f, 26.524832f);
generalPath.curveTo(27.745218f, 23.021023f, 26.577814f, 19.614988f, 26.577814f, 19.614988f);
generalPath.lineTo(25.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.163486f, 19.614075f);
generalPath.curveTo(25.163486f, 19.614075f, 26.279472f, 23.33545f, 25.517143f, 26.348055f);
generalPath.curveTo(24.754814f, 29.360659f, 24.164394f, 34.077583f, 24.164394f, 34.077583f);
generalPath.lineTo(25.69113f, 34.28082f);
generalPath.curveTo(25.69113f, 34.28082f, 26.117495f, 30.028639f, 26.931356f, 26.524832f);
generalPath.curveTo(27.745218f, 23.021023f, 26.577814f, 19.614988f, 26.577814f, 19.614988f);
generalPath.lineTo(25.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.163486f, 19.614075f);
generalPath.curveTo(23.163486f, 19.614075f, 24.279472f, 23.33545f, 23.517143f, 26.348055f);
generalPath.curveTo(22.754814f, 29.360659f, 23.269247f, 34.210167f, 23.269247f, 34.210167f);
generalPath.lineTo(24.707596f, 33.6621f);
generalPath.curveTo(24.707596f, 33.6621f, 24.117495f, 30.028639f, 24.931356f, 26.524832f);
generalPath.curveTo(25.745218f, 23.021023f, 24.577814f, 19.614988f, 24.577814f, 19.614988f);
generalPath.lineTo(23.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.163486f, 19.614075f);
generalPath.curveTo(23.163486f, 19.614075f, 24.279472f, 23.33545f, 23.517143f, 26.348055f);
generalPath.curveTo(22.754814f, 29.360659f, 23.269247f, 34.210167f, 23.269247f, 34.210167f);
generalPath.lineTo(24.707596f, 33.6621f);
generalPath.curveTo(24.707596f, 33.6621f, 24.117495f, 30.028639f, 24.931356f, 26.524832f);
generalPath.curveTo(25.745218f, 23.021023f, 24.577814f, 19.614988f, 24.577814f, 19.614988f);
generalPath.lineTo(23.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.313608f, 19.714073f);
generalPath.curveTo(13.313608f, 19.714073f, 14.429594f, 23.43545f, 13.667265f, 26.448053f);
generalPath.curveTo(12.904936f, 29.460657f, 13.419369f, 34.310165f, 13.419369f, 34.310165f);
generalPath.lineTo(14.999517f, 34.698425f);
generalPath.curveTo(14.999517f, 34.698425f, 14.267616f, 30.12864f, 15.081478f, 26.62483f);
generalPath.curveTo(15.89534f, 23.121023f, 14.727935f, 19.714989f, 14.727935f, 19.714989f);
generalPath.lineTo(13.313608f, 19.714073f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.313608f, 19.714073f);
generalPath.curveTo(13.313608f, 19.714073f, 14.429594f, 23.43545f, 13.667265f, 26.448053f);
generalPath.curveTo(12.904936f, 29.460657f, 13.419369f, 34.310165f, 13.419369f, 34.310165f);
generalPath.lineTo(14.999517f, 34.698425f);
generalPath.curveTo(14.999517f, 34.698425f, 14.267616f, 30.12864f, 15.081478f, 26.62483f);
generalPath.curveTo(15.89534f, 23.121023f, 14.727935f, 19.714989f, 14.727935f, 19.714989f);
generalPath.lineTo(13.313608f, 19.714073f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.418083f, 20.520258f);
generalPath.curveTo(19.418083f, 20.520258f, 19.615713f, 24.1298f, 19.064632f, 27.254238f);
generalPath.curveTo(18.52486f, 30.31456f, 21.306417f, 34.496773f, 21.306417f, 34.496773f);
generalPath.lineTo(22.721163f, 33.86443f);
generalPath.curveTo(22.721163f, 33.86443f, 19.926762f, 31.248787f, 20.55876f, 27.078695f);
generalPath.curveTo(21.116432f, 23.399015f, 20.83241f, 20.521172f, 20.83241f, 20.521172f);
generalPath.lineTo(19.418083f, 20.520258f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.418083f, 20.520258f);
generalPath.curveTo(19.418083f, 20.520258f, 19.615713f, 24.1298f, 19.064632f, 27.254238f);
generalPath.curveTo(18.52486f, 30.31456f, 21.306417f, 34.496773f, 21.306417f, 34.496773f);
generalPath.lineTo(22.721163f, 33.86443f);
generalPath.curveTo(22.721163f, 33.86443f, 19.926762f, 31.248787f, 20.55876f, 27.078695f);
generalPath.curveTo(21.116432f, 23.399015f, 20.83241f, 20.521172f, 20.83241f, 20.521172f);
generalPath.lineTo(19.418083f, 20.520258f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.163487f, 19.614075f);
generalPath.curveTo(15.163487f, 19.614075f, 16.279472f, 23.33545f, 15.517144f, 26.348055f);
generalPath.curveTo(14.754815f, 29.360659f, 15.269248f, 34.210167f, 15.269248f, 34.210167f);
generalPath.lineTo(16.707596f, 33.6621f);
generalPath.curveTo(16.707596f, 33.6621f, 16.117495f, 30.028639f, 16.931356f, 26.524832f);
generalPath.curveTo(17.745218f, 23.021023f, 16.577814f, 19.614988f, 16.577814f, 19.614988f);
generalPath.lineTo(15.163487f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.163487f, 19.614075f);
generalPath.curveTo(15.163487f, 19.614075f, 16.279472f, 23.33545f, 15.517144f, 26.348055f);
generalPath.curveTo(14.754815f, 29.360659f, 15.269248f, 34.210167f, 15.269248f, 34.210167f);
generalPath.lineTo(16.707596f, 33.6621f);
generalPath.curveTo(16.707596f, 33.6621f, 16.117495f, 30.028639f, 16.931356f, 26.524832f);
generalPath.curveTo(17.745218f, 23.021023f, 16.577814f, 19.614988f, 16.577814f, 19.614988f);
generalPath.lineTo(15.163487f, 19.614075f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.81613f, 20.479515f);
generalPath.curveTo(16.81613f, 20.479515f, 17.932116f, 24.200891f, 17.169786f, 27.213495f);
generalPath.curveTo(16.407457f, 30.226099f, 14.726988f, 31.80438f, 14.726988f, 31.80438f);
generalPath.lineTo(15.964957f, 32.939804f);
generalPath.curveTo(15.964957f, 32.939804f, 17.770138f, 30.89408f, 18.584f, 27.390272f);
generalPath.curveTo(19.397861f, 23.886463f, 18.230455f, 20.480429f, 18.230455f, 20.480429f);
generalPath.lineTo(16.81613f, 20.479515f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.81613f, 20.479515f);
generalPath.curveTo(16.81613f, 20.479515f, 17.932116f, 24.200891f, 17.169786f, 27.213495f);
generalPath.curveTo(16.407457f, 30.226099f, 14.726988f, 31.80438f, 14.726988f, 31.80438f);
generalPath.lineTo(15.964957f, 32.939804f);
generalPath.curveTo(15.964957f, 32.939804f, 17.770138f, 30.89408f, 18.584f, 27.390272f);
generalPath.curveTo(19.397861f, 23.886463f, 18.230455f, 20.480429f, 18.230455f, 20.480429f);
generalPath.lineTo(16.81613f, 20.479515f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.163486f, 19.614075f);
generalPath.curveTo(29.163486f, 19.614075f, 30.279472f, 23.33545f, 29.517143f, 26.348055f);
generalPath.curveTo(28.754814f, 29.360659f, 29.269247f, 34.210167f, 29.269247f, 34.210167f);
generalPath.lineTo(30.884373f, 34.634373f);
generalPath.curveTo(30.884373f, 34.634373f, 30.117495f, 30.028639f, 30.931356f, 26.524832f);
generalPath.curveTo(31.745218f, 23.021023f, 30.577814f, 19.614988f, 30.577814f, 19.614988f);
generalPath.lineTo(29.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, -0.33256199955940247f, -61.89699172973633f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.912416f, 19.75934f);
generalPath.curveTo(9.912416f, 19.75934f, 11.028404f, 23.480717f, 10.266074f, 26.49332f);
generalPath.curveTo(9.503745f, 29.505924f, 10.018178f, 34.355434f, 10.018178f, 34.355434f);
generalPath.lineTo(11.456527f, 33.80737f);
generalPath.curveTo(11.456527f, 33.80737f, 10.866426f, 30.173906f, 11.680288f, 26.670097f);
generalPath.curveTo(12.49415f, 23.16629f, 11.326745f, 19.760256f, 11.326745f, 19.760256f);
generalPath.lineTo(9.912416f, 19.75934f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, -19.583620071411133f, -61.7517204284668f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.66716f, 19.714073f);
generalPath.curveTo(11.66716f, 19.714073f, 12.783146f, 23.43545f, 12.020817f, 26.448053f);
generalPath.curveTo(11.258488f, 29.460657f, 8.617841f, 31.76449f, 8.617841f, 31.76449f);
generalPath.lineTo(9.826038f, 33.73022f);
generalPath.curveTo(9.826038f, 33.73022f, 12.621168f, 30.12864f, 13.43503f, 26.62483f);
generalPath.curveTo(14.248892f, 23.121023f, 13.081487f, 19.714989f, 13.081487f, 19.714989f);
generalPath.lineTo(11.66716f, 19.714073f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, -17.82887077331543f, -61.79698944091797f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.163486f, 19.614075f);
generalPath.curveTo(21.163486f, 19.614075f, 22.279472f, 23.33545f, 21.517143f, 26.348055f);
generalPath.curveTo(20.754814f, 29.360659f, 21.269247f, 34.210167f, 21.269247f, 34.210167f);
generalPath.lineTo(22.928568f, 34.766956f);
generalPath.curveTo(22.928568f, 34.766956f, 22.117495f, 30.028639f, 22.931356f, 26.524832f);
generalPath.curveTo(23.745218f, 23.021023f, 22.577814f, 19.614988f, 22.577814f, 19.614988f);
generalPath.lineTo(21.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, -8.332562446594238f, -61.89699172973633f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.163486f, 19.614075f);
generalPath.curveTo(35.163486f, 19.614075f, 36.279472f, 23.33545f, 35.517143f, 26.348055f);
generalPath.curveTo(34.754814f, 29.360659f, 36.55088f, 33.50306f, 36.55088f, 33.50306f);
generalPath.lineTo(38.077614f, 32.292084f);
generalPath.curveTo(38.077614f, 32.292084f, 36.117496f, 30.028639f, 36.93136f, 26.524832f);
generalPath.curveTo(37.74522f, 23.021023f, 36.577812f, 19.614988f, 36.577812f, 19.614988f);
generalPath.lineTo(35.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, 5.66743803024292f, -61.89699172973633f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.163486f, 19.614075f);
generalPath.curveTo(31.163486f, 19.614075f, 32.279472f, 23.33545f, 31.517143f, 26.348055f);
generalPath.curveTo(30.754814f, 29.360659f, 31.269247f, 34.210167f, 31.269247f, 34.210167f);
generalPath.lineTo(32.795982f, 34.148235f);
generalPath.curveTo(32.795982f, 34.148235f, 32.117496f, 30.028639f, 32.93136f, 26.524832f);
generalPath.curveTo(33.74522f, 23.021023f, 32.577812f, 19.614988f, 32.577812f, 19.614988f);
generalPath.lineTo(31.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, 1.66743803024292f, -61.89699172973633f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.163486f, 19.614075f);
generalPath.curveTo(33.163486f, 19.614075f, 34.279472f, 23.33545f, 33.517143f, 26.348055f);
generalPath.curveTo(32.754814f, 29.360659f, 32.473755f, 34.03339f, 32.473755f, 34.03339f);
generalPath.lineTo(34.265656f, 34.457596f);
generalPath.curveTo(34.265656f, 34.457596f, 34.117496f, 30.028639f, 34.93136f, 26.524832f);
generalPath.curveTo(35.74522f, 23.021023f, 34.577812f, 19.614988f, 34.577812f, 19.614988f);
generalPath.lineTo(33.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, 3.66743803024292f, -61.89699172973633f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(27.163486f, 19.614075f);
generalPath.curveTo(27.163486f, 19.614075f, 28.279472f, 23.33545f, 27.517143f, 26.348055f);
generalPath.curveTo(26.754814f, 29.360659f, 28.064743f, 33.989197f, 28.064743f, 33.989197f);
generalPath.lineTo(29.724062f, 33.308548f);
generalPath.curveTo(29.724062f, 33.308548f, 28.117495f, 30.028639f, 28.931356f, 26.524832f);
generalPath.curveTo(29.745218f, 23.021023f, 28.577814f, 19.614988f, 28.577814f, 19.614988f);
generalPath.lineTo(27.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, -2.33256196975708f, -61.89699172973633f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.163486f, 19.614075f);
generalPath.curveTo(25.163486f, 19.614075f, 26.279472f, 23.33545f, 25.517143f, 26.348055f);
generalPath.curveTo(24.754814f, 29.360659f, 24.164394f, 34.077583f, 24.164394f, 34.077583f);
generalPath.lineTo(25.69113f, 34.28082f);
generalPath.curveTo(25.69113f, 34.28082f, 26.117495f, 30.028639f, 26.931356f, 26.524832f);
generalPath.curveTo(27.745218f, 23.021023f, 26.577814f, 19.614988f, 26.577814f, 19.614988f);
generalPath.lineTo(25.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, -4.33256196975708f, -61.89699172973633f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.163486f, 19.614075f);
generalPath.curveTo(23.163486f, 19.614075f, 24.279472f, 23.33545f, 23.517143f, 26.348055f);
generalPath.curveTo(22.754814f, 29.360659f, 23.269247f, 34.210167f, 23.269247f, 34.210167f);
generalPath.lineTo(24.707596f, 33.6621f);
generalPath.curveTo(24.707596f, 33.6621f, 24.117495f, 30.028639f, 24.931356f, 26.524832f);
generalPath.curveTo(25.745218f, 23.021023f, 24.577814f, 19.614988f, 24.577814f, 19.614988f);
generalPath.lineTo(23.163486f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, -6.33256196975708f, -61.89699172973633f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.313608f, 19.714073f);
generalPath.curveTo(13.313608f, 19.714073f, 14.429594f, 23.43545f, 13.667265f, 26.448053f);
generalPath.curveTo(12.904936f, 29.460657f, 13.419369f, 34.310165f, 13.419369f, 34.310165f);
generalPath.lineTo(14.999517f, 34.698425f);
generalPath.curveTo(14.999517f, 34.698425f, 14.267616f, 30.12864f, 15.081478f, 26.62483f);
generalPath.curveTo(15.89534f, 23.121023f, 14.727935f, 19.714989f, 14.727935f, 19.714989f);
generalPath.lineTo(13.313608f, 19.714073f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, -16.182430267333984f, -61.79698944091797f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.418083f, 20.520258f);
generalPath.curveTo(19.418083f, 20.520258f, 19.615713f, 24.1298f, 19.064632f, 27.254238f);
generalPath.curveTo(18.52486f, 30.31456f, 21.306417f, 34.496773f, 21.306417f, 34.496773f);
generalPath.lineTo(22.721163f, 33.86443f);
generalPath.curveTo(22.721163f, 33.86443f, 19.926762f, 31.248787f, 20.55876f, 27.078695f);
generalPath.curveTo(21.116432f, 23.399015f, 20.83241f, 20.521172f, 20.83241f, 20.521172f);
generalPath.lineTo(19.418083f, 20.520258f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, -10.785059928894043f, -60.99081039428711f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.163487f, 19.614075f);
generalPath.curveTo(15.163487f, 19.614075f, 16.279472f, 23.33545f, 15.517144f, 26.348055f);
generalPath.curveTo(14.754815f, 29.360659f, 15.269248f, 34.210167f, 15.269248f, 34.210167f);
generalPath.lineTo(16.707596f, 33.6621f);
generalPath.curveTo(16.707596f, 33.6621f, 16.117495f, 30.028639f, 16.931356f, 26.524832f);
generalPath.curveTo(17.745218f, 23.021023f, 16.577814f, 19.614988f, 16.577814f, 19.614988f);
generalPath.lineTo(15.163487f, 19.614075f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, -14.332550048828125f, -61.89699172973633f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.81613f, 20.479515f);
generalPath.curveTo(16.81613f, 20.479515f, 17.932116f, 24.200891f, 17.169786f, 27.213495f);
generalPath.curveTo(16.407457f, 30.226099f, 14.726988f, 31.80438f, 14.726988f, 31.80438f);
generalPath.lineTo(15.964957f, 32.939804f);
generalPath.curveTo(15.964957f, 32.939804f, 17.770138f, 30.89408f, 18.584f, 27.390272f);
generalPath.curveTo(19.397861f, 23.886463f, 18.230455f, 20.480429f, 18.230455f, 20.480429f);
generalPath.lineTo(16.81613f, 20.479515f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.57962417602539, 33.58826446533203), 2.5527742f, new Point2D.Double(9.57962417602539, 33.58826446533203), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(213, 213, 213, 255)) : new Color(213, 213, 213, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.146714925765991f, 0.06924886256456375f, -0.06039990857243538f, 2.744611978530884f, -12.679909706115723f, -61.031551361083984f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.62886596f * origAlpha));
// _0_0_6
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.414681f, 19.121548f);
generalPath.curveTo(5.3634243f, 19.121414f, 6.251433f, 31.93862f, 6.956946f, 40.927803f);
generalPath.curveTo(7.138951f, 43.235264f, 7.508862f, 44.174408f, 8.942307f, 44.174408f);
generalPath.curveTo(20.75913f, 44.174408f, 37.552948f, 44.260506f, 38.124794f, 44.258404f);
generalPath.curveTo(40.8913f, 44.248245f, 40.839523f, 43.22092f, 41.068645f, 41.03815f);
generalPath.curveTo(41.152054f, 40.243546f, 42.601147f, 19.210922f, 42.587322f, 19.210922f);
generalPath.curveTo(32.686245f, 19.210922f, 17.64779f, 19.153519f, 5.414681f, 19.121548f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.163233f, 6.56876f);
generalPath.curveTo(6.0964704f, 6.571197f, 5.203674f, 6.59587f, 4.7173743f, 7.611591f);
generalPath.curveTo(4.6328516f, 7.788132f, 2.0564582f, 14.953189f, 1.9325929f, 15.226435f);
generalPath.curveTo(0.8721842f, 17.565664f, 1.8500978f, 20.512358f, 3.8982468f, 20.492628f);
generalPath.curveTo(4.2877545f, 20.488998f, 44.257347f, 20.510899f, 44.877144f, 20.492628f);
generalPath.curveTo(46.620636f, 20.442135f, 46.843746f, 17.029898f, 46.093185f, 15.494889f);
generalPath.curveTo(46.050663f, 15.407927f, 42.567223f, 7.513946f, 42.47838f, 7.374125f);
generalPath.curveTo(42.067463f, 6.749683f, 41.14725f, 6.476015f, 40.463707f, 6.501646f);
generalPath.curveTo(40.329056f, 6.506821f, 7.296499f, 6.568457f, 7.163233f, 6.56876f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(24.0000057220459, 15.837312698364258), new Point2D.Double(24.0000057220459, 21.0), new float[] {0.0f,0.7567568f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(89, 139, 203, 255)) : new Color(89, 139, 203, 255)),((colorFilter != null) ? colorFilter.filter(new Color(47, 92, 150, 255)) : new Color(47, 92, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(32, 62, 101, 255)) : new Color(32, 62, 101, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 255)) : new Color(32, 74, 135, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.163233f, 6.56876f);
generalPath.curveTo(6.0964704f, 6.571197f, 5.203674f, 6.59587f, 4.7173743f, 7.611591f);
generalPath.curveTo(4.6328516f, 7.788132f, 2.0564582f, 14.953189f, 1.9325929f, 15.226435f);
generalPath.curveTo(0.8721842f, 17.565664f, 1.8500978f, 20.512358f, 3.8982468f, 20.492628f);
generalPath.curveTo(4.2877545f, 20.488998f, 44.257347f, 20.510899f, 44.877144f, 20.492628f);
generalPath.curveTo(46.620636f, 20.442135f, 46.843746f, 17.029898f, 46.093185f, 15.494889f);
generalPath.curveTo(46.050663f, 15.407927f, 42.567223f, 7.513946f, 42.47838f, 7.374125f);
generalPath.curveTo(42.067463f, 6.749683f, 41.14725f, 6.476015f, 40.463707f, 6.501646f);
generalPath.curveTo(40.329056f, 6.506821f, 7.296499f, 6.568457f, 7.163233f, 6.56876f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.14948454f * origAlpha));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.79225f, 20.902176f);
generalPath.lineTo(7.292169f, 20.902264f);
generalPath.lineTo(8.058021f, 41.513138f);
generalPath.lineTo(7.2954774f, 44.58633f);
generalPath.curveTo(6.688538f, 44.099873f, 6.4168015f, 43.36201f, 6.2792296f, 42.52353f);
generalPath.lineTo(4.79225f, 20.902176f);

}

private void _paint1(Graphics2D g,float origAlpha) {
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(85, 87, 83, 255)) : new Color(85, 87, 83, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.42783505f * origAlpha));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.033569f, 41.611683f);
generalPath.lineTo(7.3212657f, 44.54057f);
generalPath.curveTo(7.744129f, 44.765465f, 8.057012f, 44.85283f, 8.5125475f, 45.007175f);
generalPath.lineTo(38.53843f, 44.978477f);
generalPath.curveTo(39.11735f, 44.938854f, 39.669098f, 44.912678f, 40.052765f, 44.806892f);
generalPath.lineTo(38.00699f, 41.370872f);
generalPath.lineTo(8.033569f, 41.611683f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(238, 238, 236, 255)) : new Color(238, 238, 236, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.371134f * origAlpha));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.00699f, 41.370872f);
generalPath.lineTo(40.01949f, 44.81576f);
generalPath.curveTo(40.63769f, 44.55256f, 41.34983f, 44.09195f, 41.630913f, 42.961864f);
generalPath.lineTo(43.139313f, 20.94521f);
generalPath.lineTo(39.69211f, 20.942984f);
generalPath.lineTo(38.00699f, 41.370872f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(238, 238, 236, 255)) : new Color(238, 238, 236, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.38659793f * origAlpha));
// _0_0_11
paint = new LinearGradientPaint(new Point2D.Double(21.67790985107422, 19.969507217407227), new Point2D.Double(22.33352279663086, 11.643976211547852), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.375f, 7.53125f);
generalPath.curveTo(40.307785f, 7.5315127f, 40.187424f, 7.5621486f, 40.0625f, 7.5625f);
generalPath.curveTo(39.812653f, 7.5632033f, 39.458454f, 7.5614724f, 39.0f, 7.5625f);
generalPath.curveTo(38.083088f, 7.5645556f, 36.778275f, 7.559461f, 35.21875f, 7.5625f);
generalPath.curveTo(32.0997f, 7.5685787f, 27.959843f, 7.58628f, 23.8125f, 7.59375f);
generalPath.curveTo(15.517814f, 7.6086903f, 7.175529f, 7.593706f, 7.15625f, 7.59375f);
generalPath.curveTo(6.6366935f, 7.594937f, 6.261561f, 7.652425f, 6.0625f, 7.71875f);
generalPath.curveTo(5.863439f, 7.7850757f, 5.795362f, 7.77194f, 5.65625f, 8.0625f);
generalPath.curveTo(5.7244234f, 7.9201074f, 5.6779785f, 8.036386f, 5.65625f, 8.09375f);
generalPath.curveTo(5.6345215f, 8.151114f, 5.6013284f, 8.238751f, 5.5625f, 8.34375f);
generalPath.curveTo(5.4848433f, 8.553747f, 5.3772674f, 8.870004f, 5.25f, 9.21875f);
generalPath.curveTo(4.9954653f, 9.916243f, 4.647162f, 10.82881f, 4.3125f, 11.75f);
generalPath.curveTo(3.977838f, 12.67119f, 3.6668003f, 13.599915f, 3.40625f, 14.3125f);
generalPath.curveTo(3.275975f, 14.668793f, 3.1460285f, 14.962545f, 3.0625f, 15.1875f);
generalPath.curveTo(2.9789715f, 15.412455f, 2.96316f, 15.461769f, 2.875f, 15.65625f);
generalPath.curveTo(2.463348f, 16.564342f, 2.4810984f, 17.654814f, 2.75f, 18.40625f);
generalPath.curveTo(3.0189016f, 19.157686f, 3.387622f, 19.473745f, 3.90625f, 19.46875f);
generalPath.curveTo(4.0431166f, 19.467474f, 4.618759f, 19.468534f, 5.75f, 19.46875f);
generalPath.curveTo(6.881241f, 19.468966f, 8.469657f, 19.46812f, 10.375f, 19.46875f);
generalPath.curveTo(14.185686f, 19.470007f, 19.25455f, 19.46738f, 24.3125f, 19.46875f);
generalPath.curveTo(29.37045f, 19.47012f, 34.44211f, 19.469322f, 38.28125f, 19.46875f);
generalPath.curveTo(40.20082f, 19.468464f, 41.785362f, 19.469906f, 42.9375f, 19.46875f);
generalPath.curveTo(44.089638f, 19.467594f, 44.934708f, 19.466068f, 44.84375f, 19.46875f);
generalPath.curveTo(44.93948f, 19.465979f, 44.944878f, 19.474737f, 45.0625f, 19.3125f);
generalPath.curveTo(45.180122f, 19.150263f, 45.303425f, 18.79192f, 45.375f, 18.375f);
generalPath.curveTo(45.51815f, 17.541162f, 45.378994f, 16.424294f, 45.15625f, 15.96875f);
generalPath.curveTo(45.08818f, 15.829539f, 45.122097f, 15.876058f, 45.09375f, 15.8125f);
generalPath.curveTo(45.065403f, 15.748942f, 45.01873f, 15.674998f, 44.96875f, 15.5625f);
generalPath.curveTo(44.868786f, 15.337505f, 44.72996f, 15.002468f, 44.5625f, 14.625f);
generalPath.curveTo(44.227577f, 13.870065f, 43.788494f, 12.876072f, 43.34375f, 11.875f);
generalPath.curveTo(42.899006f, 10.873928f, 42.46493f, 9.884789f, 42.125f, 9.125f);
generalPath.curveTo(41.955036f, 8.745106f, 41.790173f, 8.413838f, 41.6875f, 8.1875f);
generalPath.curveTo(41.636166f, 8.074331f, 41.590405f, 7.997518f, 41.5625f, 7.9375f);
generalPath.curveTo(41.439575f, 7.7832594f, 40.85875f, 7.517798f, 40.5f, 7.53125f);
generalPath.curveTo(40.400017f, 7.535093f, 40.456734f, 7.5311365f, 40.4375f, 7.53125f);
generalPath.curveTo(40.418266f, 7.5313635f, 40.408607f, 7.531119f, 40.375f, 7.53125f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.8298969f * origAlpha));
// _0_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.0f, 10.0f);
generalPath.lineTo(7.375f, 12.0f);
generalPath.lineTo(39.375f, 12.0f);
generalPath.lineTo(38.593147f, 10.07544f);
generalPath.lineTo(8.0f, 10.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(27.5, 14.0), new Point2D.Double(27.625, 18.750015258789062), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.7999910116195679f, 0.0f, -1.199874997138977f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.853549f, 1.5000014f);
generalPath.lineTo(37.167316f, 1.5000014f);
generalPath.curveTo(37.363186f, 1.5000014f, 37.52087f, 1.6576864f, 37.52087f, 1.853555f);
generalPath.lineTo(37.52087f, 11.500003f);
generalPath.curveTo(37.52087f, 11.500003f, 9.499995f, 11.500003f, 9.499995f, 11.500003f);
generalPath.lineTo(9.499995f, 1.853555f);
generalPath.curveTo(9.499995f, 1.6576864f, 9.6576805f, 1.5000014f, 9.853549f, 1.5000014f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.151338577270508, -5.740115642547607), new Point2D.Double(27.50038719177246, 13.351767539978027), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 211, 211, 255)) : new Color(211, 211, 211, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9845330119132996f, 0.0f, 0.0f, 1.2035859823226929f, 0.9719030261039734f, -2.1231911182403564f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 138, 133, 255)) : new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0000008f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.853549f, 1.5000014f);
generalPath.lineTo(37.167316f, 1.5000014f);
generalPath.curveTo(37.363186f, 1.5000014f, 37.52087f, 1.6576864f, 37.52087f, 1.853555f);
generalPath.lineTo(37.52087f, 11.500003f);
generalPath.curveTo(37.52087f, 11.500003f, 9.499995f, 11.500003f, 9.499995f, 11.500003f);
generalPath.lineTo(9.499995f, 1.853555f);
generalPath.curveTo(9.499995f, 1.6576864f, 9.6576805f, 1.5000014f, 9.853549f, 1.5000014f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.62886596f * origAlpha));
// _0_0_14
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0000002f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.499998f, 10.522594f);
generalPath.lineTo(10.499998f, 2.5000012f);
generalPath.lineTo(36.50438f, 2.5000012f);
generalPath.lineTo(36.50438f, 10.611733f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.8143839836120605f, 0.0f, 0.0f, 0.796379029750824f, 7.5837202072143555f, 3.212693929672241f));
// _0_0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.0f, 15.0f);
generalPath.curveTo(43.004005f, 15.447914f, 42.52839f, 15.862662f, 41.75324f, 16.0872f);
generalPath.curveTo(40.97809f, 16.311737f, 40.02191f, 16.311737f, 39.24676f, 16.0872f);
generalPath.curveTo(38.47161f, 15.862662f, 37.995995f, 15.447914f, 38.0f, 15.0f);
generalPath.curveTo(37.995995f, 14.552086f, 38.47161f, 14.137338f, 39.24676f, 13.9128f);
generalPath.curveTo(40.02191f, 13.688263f, 40.97809f, 13.688263f, 41.75324f, 13.9128f);
generalPath.curveTo(42.52839f, 14.137338f, 43.004005f, 14.552086f, 43.0f, 15.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(204, 0, 0, 255)) : new Color(204, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(164, 0, 0, 255)) : new Color(164, 0, 0, 255);
stroke = new BasicStroke(1.2417247f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.0f, 15.0f);
generalPath.curveTo(43.004005f, 15.447914f, 42.52839f, 15.862662f, 41.75324f, 16.0872f);
generalPath.curveTo(40.97809f, 16.311737f, 40.02191f, 16.311737f, 39.24676f, 16.0872f);
generalPath.curveTo(38.47161f, 15.862662f, 37.995995f, 15.447914f, 38.0f, 15.0f);
generalPath.curveTo(37.995995f, 14.552086f, 38.47161f, 14.137338f, 39.24676f, 13.9128f);
generalPath.curveTo(40.02191f, 13.688263f, 40.97809f, 13.688263f, 41.75324f, 13.9128f);
generalPath.curveTo(42.52839f, 14.137338f, 43.004005f, 14.552086f, 43.0f, 15.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.8143839836120605f, 0.0f, 0.0f, 0.796379029750824f, 7.5837202072143555f, 2.549783945083618f));
// _0_0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.0f, 15.0f);
generalPath.curveTo(43.004005f, 15.447914f, 42.52839f, 15.862662f, 41.75324f, 16.0872f);
generalPath.curveTo(40.97809f, 16.311737f, 40.02191f, 16.311737f, 39.24676f, 16.0872f);
generalPath.curveTo(38.47161f, 15.862662f, 37.995995f, 15.447914f, 38.0f, 15.0f);
generalPath.curveTo(37.995995f, 14.552086f, 38.47161f, 14.137338f, 39.24676f, 13.9128f);
generalPath.curveTo(40.02191f, 13.688263f, 40.97809f, 13.688263f, 41.75324f, 13.9128f);
generalPath.curveTo(42.52839f, 14.137338f, 43.004005f, 14.552086f, 43.0f, 15.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(239, 41, 41, 255)) : new Color(239, 41, 41, 255);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(40.5, 13.822796821594238), new Point2D.Double(40.5, 16.87784194946289), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(164, 0, 0, 255)) : new Color(164, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 196, 196, 255)) : new Color(255, 196, 196, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.2417247f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.0f, 15.0f);
generalPath.curveTo(43.004005f, 15.447914f, 42.52839f, 15.862662f, 41.75324f, 16.0872f);
generalPath.curveTo(40.97809f, 16.311737f, 40.02191f, 16.311737f, 39.24676f, 16.0872f);
generalPath.curveTo(38.47161f, 15.862662f, 37.995995f, 15.447914f, 38.0f, 15.0f);
generalPath.curveTo(37.995995f, 14.552086f, 38.47161f, 14.137338f, 39.24676f, 13.9128f);
generalPath.curveTo(40.02191f, 13.688263f, 40.97809f, 13.688263f, 41.75324f, 13.9128f);
generalPath.curveTo(42.52839f, 14.137338f, 43.004005f, 14.552086f, 43.0f, 15.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.2731959f * origAlpha));
// _0_0_17
shape = new Rectangle2D.Double(9.0, 6.6875, 29.0, 5.3125);
paint = new LinearGradientPaint(new Point2D.Double(23.5, 12.0), new Point2D.Double(23.5, 6.6875), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.13917527f * origAlpha));
// _0_0_18
shape = new RoundRectangle2D.Double(12.0, 4.0, 23.0, 1.0, 1.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.13917527f * origAlpha));
// _0_0_19
shape = new RoundRectangle2D.Double(12.0, 6.0, 15.0, 1.0, 1.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.13917527f * origAlpha));
// _0_0_20
shape = new RoundRectangle2D.Double(12.0, 8.0, 19.0, 1.0, 1.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);

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
_paint1(g, origAlpha);


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
        return 0.51534104347229;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 1.0000009536743164;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 46.72550964355469;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 47.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private edit_delete() {
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
       edit_delete base = new edit_delete();
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
       edit_delete base = new edit_delete();
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
        return edit_delete::new;
    }
}

