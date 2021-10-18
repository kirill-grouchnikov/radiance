package org.pushingpixels.radiance.demo.laf.main.check.svg.tango;

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
public class drive_harddisk implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.024527400732040405f, 0.0f, 0.0f, 0.02086758054792881f, 45.6905403137207f, 36.15359878540039f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0
shape = new Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375);
paint = new LinearGradientPaint(new Point2D.Double(302.8571472167969, 366.64788818359375), new Point2D.Double(302.8571472167969, 609.5050659179688), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(83, 83, 83, 255)) : new Color(83, 83, 83, 255);
stroke = new BasicStroke(2.0f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.28569f, 7.962628f);
generalPath.curveTo(10.66069f, 7.962628f, 10.254441f, 8.252809f, 10.004442f, 8.806381f);
generalPath.curveTo(10.004441f, 8.806381f, 3.5356915f, 25.909939f, 3.5356915f, 25.909939f);
generalPath.curveTo(3.5356915f, 25.909939f, 3.2856915f, 26.581497f, 3.2856915f, 27.691189f);
generalPath.curveTo(3.2856915f, 27.691189f, 3.2856915f, 37.341156f, 3.2856915f, 37.341156f);
generalPath.curveTo(3.2856915f, 38.42377f, 3.943477f, 38.96616f, 4.9419417f, 38.966156f);
generalPath.lineTo(43.50444f, 38.966156f);
generalPath.curveTo(44.489292f, 38.966156f, 45.09819f, 38.247974f, 45.09819f, 37.122406f);
generalPath.lineTo(45.09819f, 27.472439f);
generalPath.curveTo(45.09819f, 27.472439f, 45.20415f, 26.702015f, 45.00444f, 26.159939f);
generalPath.lineTo(38.28569f, 8.962631f);
generalPath.curveTo(38.101166f, 8.450725f, 37.648785f, 7.974533f, 37.16069f, 7.962628f);
generalPath.lineTo(11.28569f, 7.962628f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(3.2735915f, 26.996813f);
generalPath.lineTo(4.0381937f, 26.304598f);
generalPath.lineTo(41.647884f, 26.367098f);
generalPath.lineTo(45.11029f, 26.684395f);
generalPath.lineTo(45.11029f, 37.12293f);
generalPath.curveTo(45.11029f, 38.248497f, 44.503273f, 38.96626f, 43.518417f, 38.96626f);
generalPath.lineTo(4.9354315f, 38.96626f);
generalPath.curveTo(3.9369667f, 38.96626f, 3.2735915f, 38.424206f, 3.2735915f, 37.341595f);
generalPath.lineTo(3.2735915f, 26.996813f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(7.604620456695557, 28.481176376342773), new Point2D.Double(36.183067321777344, 40.94393539428711), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(187, 187, 187, 255)) : new Color(187, 187, 187, 255)),((colorFilter != null) ? colorFilter.filter(new Color(159, 159, 159, 255)) : new Color(159, 159, 159, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(3.5490842f, 25.914404f);
generalPath.curveTo(2.8347986f, 27.37869f, 3.5484686f, 28.30726f, 4.5847983f, 28.30726f);
generalPath.curveTo(4.5847983f, 28.30726f, 43.584797f, 28.30726f, 43.584797f, 28.30726f);
generalPath.curveTo(44.703842f, 28.283451f, 45.430035f, 27.295357f, 45.013367f, 26.164404f);
generalPath.lineTo(38.299084f, 8.953705f);
generalPath.curveTo(38.11456f, 8.441797f, 37.64432f, 7.9656057f, 37.156223f, 7.953701f);
generalPath.lineTo(11.299083f, 7.953701f);
generalPath.curveTo(10.674083f, 7.953701f, 10.263369f, 8.257274f, 10.01337f, 8.810847f);
generalPath.curveTo(10.01337f, 8.810847f, 3.5490842f, 25.914404f, 3.5490842f, 25.914404f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(15.571491241455078, 2.9585189819335938), 20.935818f, new Point2D.Double(15.571491241455078, 2.9585189819335938), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(228, 228, 228, 255)) : new Color(228, 228, 228, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 211, 211, 255)) : new Color(211, 211, 211, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2862420082092285f, 0.7816979885101318f, -0.710781991481781f, 1.169551968574524f, -2.3543479442596436f, -4.876862049102783f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
shape = new Rectangle2D.Double(7.857995986938477, 31.174182891845703, 17.625, 5.5625);
paint = new LinearGradientPaint(new Point2D.Double(7.0625, 35.28125), new Point2D.Double(24.6875, 35.28125), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(131, 131, 131, 255)) : new Color(131, 131, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(187, 187, 187, 0)) : new Color(187, 187, 187, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.7954930067062378f, -1.325821042060852f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.81142855f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.857995f, 36.73668f);
generalPath.curveTo(7.857995f, 36.73668f, 7.857995f, 32.725197f, 7.857995f, 32.725197f);
generalPath.curveTo(9.693522f, 35.904423f, 16.154486f, 36.73668f, 20.795492f, 36.73668f);
generalPath.curveTo(20.795492f, 36.73668f, 7.857995f, 36.73668f, 7.857995f, 36.73668f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(12.277412414550781, 37.205810546875), new Point2D.Double(12.221822738647461, 33.7586669921875), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(238, 238, 238, 255)) : new Color(238, 238, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 238, 238, 0)) : new Color(238, 238, 238, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.79616f, 25.628689f);
generalPath.curveTo(44.859684f, 26.878662f, 44.38216f, 27.944529f, 43.474045f, 27.972439f);
generalPath.curveTo(43.474045f, 27.972439f, 5.3553295f, 27.972437f, 5.3553295f, 27.972439f);
generalPath.curveTo(4.0660977f, 27.972439f, 3.4875937f, 27.647491f, 3.271279f, 27.104382f);
generalPath.curveTo(3.3630404f, 28.048714f, 4.0970964f, 28.753689f, 5.3553295f, 28.753689f);
generalPath.curveTo(5.3553295f, 28.753687f, 43.474045f, 28.753689f, 43.474045f, 28.753689f);
generalPath.curveTo(44.550053f, 28.720617f, 45.226852f, 27.329664f, 44.82621f, 25.758898f);
generalPath.lineTo(44.79616f, 25.628689f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.69142854f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.96875f, 10.15625f);
generalPath.curveTo(10.922675f, 10.356571f, 10.78125f, 10.543047f, 10.78125f, 10.75f);
generalPath.curveTo(10.78125f, 11.698605f, 11.37223f, 12.539474f, 12.125f, 13.34375f);
generalPath.curveTo(12.365268f, 13.189675f, 12.490117f, 12.989342f, 12.75f, 12.84375f);
generalPath.curveTo(11.809691f, 12.027746f, 11.196604f, 11.127168f, 10.96875f, 10.15625f);
generalPath.closePath();
generalPath.moveTo(37.625f, 10.15625f);
generalPath.curveTo(37.396275f, 11.125866f, 36.78299f, 12.028676f, 35.84375f, 12.84375f);
generalPath.curveTo(36.117893f, 12.997332f, 36.247738f, 13.21199f, 36.5f, 13.375f);
generalPath.curveTo(37.257263f, 12.568344f, 37.8125f, 11.701956f, 37.8125f, 10.75f);
generalPath.curveTo(37.8125f, 10.543047f, 37.670906f, 10.356571f, 37.625f, 10.15625f);
generalPath.closePath();
generalPath.moveTo(39.8125f, 18.59375f);
generalPath.curveTo(39.198708f, 22.633862f, 32.513885f, 25.84375f, 24.28125f, 25.84375f);
generalPath.curveTo(16.068996f, 25.843752f, 9.421101f, 22.650965f, 8.78125f, 18.625f);
generalPath.curveTo(8.748893f, 18.822132f, 8.65625f, 19.016882f, 8.65625f, 19.21875f);
generalPath.curveTo(8.65625f, 23.536697f, 15.645354f, 27.062502f, 24.28125f, 27.0625f);
generalPath.curveTo(32.917145f, 27.0625f, 39.9375f, 23.536697f, 39.9375f, 19.21875f);
generalPath.curveTo(39.9375f, 19.005827f, 39.84845f, 18.801394f, 39.8125f, 18.59375f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(23.688077926635742, 11.318835258483887), new Point2D.Double(23.688077926635742, 26.3571834564209), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 65)) : new Color(255, 255, 255, 65)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.08838842809200287f, 0.1767760068178177f));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.57367f, 25.593554f);
generalPath.curveTo(8.575866f, 25.957785f, 8.315223f, 26.295048f, 7.890435f, 26.477634f);
generalPath.curveTo(7.4656477f, 26.660223f, 6.9416537f, 26.660223f, 6.516866f, 26.477634f);
generalPath.curveTo(6.0920787f, 26.295048f, 5.8314357f, 25.957785f, 5.833631f, 25.593554f);
generalPath.curveTo(5.8314357f, 25.229322f, 6.0920787f, 24.89206f, 6.516866f, 24.709473f);
generalPath.curveTo(6.9416537f, 24.526884f, 7.4656477f, 24.526884f, 7.890435f, 24.709473f);
generalPath.curveTo(8.315223f, 24.89206f, 8.575866f, 25.229322f, 8.57367f, 25.593554f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 117)) : new Color(255, 255, 255, 117);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 33.96704864501953f, 0.08838804066181183f));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.57367f, 25.593554f);
generalPath.curveTo(8.575866f, 25.957785f, 8.315223f, 26.295048f, 7.890435f, 26.477634f);
generalPath.curveTo(7.4656477f, 26.660223f, 6.9416537f, 26.660223f, 6.516866f, 26.477634f);
generalPath.curveTo(6.0920787f, 26.295048f, 5.8314357f, 25.957785f, 5.833631f, 25.593554f);
generalPath.curveTo(5.8314357f, 25.229322f, 6.0920787f, 24.89206f, 6.516866f, 24.709473f);
generalPath.curveTo(6.9416537f, 24.526884f, 7.4656477f, 24.526884f, 7.890435f, 24.709473f);
generalPath.curveTo(8.315223f, 24.89206f, 8.575866f, 25.229322f, 8.57367f, 25.593554f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 117)) : new Color(255, 255, 255, 117);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new LinearGradientPaint(new Point2D.Double(12.37835693359375, 4.433135986328125), new Point2D.Double(44.096099853515625, 47.620635986328125), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.642515f, 8.415723f);
generalPath.curveTo(11.040823f, 8.415723f, 10.649724f, 8.695082f, 10.409049f, 9.22801f);
generalPath.curveTo(10.409048f, 9.22801f, 3.994034f, 25.818731f, 3.994034f, 25.818731f);
generalPath.curveTo(3.994034f, 25.818731f, 3.7533574f, 26.465246f, 3.7533574f, 27.533554f);
generalPath.curveTo(3.7533574f, 27.533554f, 3.7533574f, 36.82365f, 3.7533574f, 36.82365f);
generalPath.curveTo(3.7533574f, 38.17839f, 4.1974134f, 38.45055f, 5.3478413f, 38.45055f);
generalPath.lineTo(43.034744f, 38.45055f);
generalPath.curveTo(44.357872f, 38.45055f, 44.56906f, 38.13415f, 44.56906f, 36.613056f);
generalPath.lineTo(44.56906f, 27.322962f);
generalPath.curveTo(44.56906f, 27.322962f, 44.67107f, 26.58127f, 44.478806f, 26.059408f);
generalPath.lineTo(37.885616f, 9.253433f);
generalPath.curveTo(37.707973f, 8.760617f, 37.334965f, 8.427184f, 36.86507f, 8.415723f);
generalPath.lineTo(11.642515f, 8.415723f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 108)) : new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.5f, 31.429167f);
generalPath.lineTo(40.5f, 36.4501f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 108)) : new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.5f, 31.488943f);
generalPath.lineTo(38.5f, 36.509876f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 108)) : new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.5f, 31.488943f);
generalPath.lineTo(36.5f, 36.509876f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 108)) : new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(34.5f, 31.488943f);
generalPath.lineTo(34.5f, 36.509876f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 108)) : new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.5f, 31.488943f);
generalPath.lineTo(32.5f, 36.509876f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 108)) : new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.5f, 31.488943f);
generalPath.lineTo(30.5f, 36.509876f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.09714286f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.5f, 31.479065f);
generalPath.lineTo(39.5f, 36.5f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.09714286f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_18
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.5f, 31.538841f);
generalPath.lineTo(37.5f, 36.559776f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.09714286f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_19
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.5f, 31.538841f);
generalPath.lineTo(35.5f, 36.559776f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.09714286f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_20
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.5f, 31.538841f);
generalPath.lineTo(33.5f, 36.559776f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.09714286f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_21
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.5f, 31.538841f);
generalPath.lineTo(31.5f, 36.559776f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.44f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_22
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.875f, 31.1875f);
generalPath.lineTo(7.875f, 36.71875f);
generalPath.lineTo(20.4375f, 36.71875f);
generalPath.lineTo(8.21875f, 36.375f);
generalPath.lineTo(7.875f, 31.1875f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.20571424f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.037814974784851f, 0.0f, 0.0f, 1.0607470273971558f, -1.6328779458999634f, -2.094625949859619f));
// _0_0_23
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.875f, 19.5625f);
generalPath.curveTo(39.898838f, 21.958838f, 37.068905f, 24.177746f, 32.456768f, 25.379019f);
generalPath.curveTo(27.844637f, 26.580294f, 22.155363f, 26.580294f, 17.54323f, 25.379019f);
generalPath.curveTo(12.931097f, 24.177746f, 10.101163f, 21.958838f, 10.125f, 19.5625f);
generalPath.curveTo(10.101163f, 17.166162f, 12.931097f, 14.947254f, 17.54323f, 13.745981f);
generalPath.curveTo(22.155363f, 12.544707f, 27.844637f, 12.544707f, 32.456768f, 13.745981f);
generalPath.curveTo(37.068905f, 14.947254f, 39.898838f, 17.166162f, 39.875f, 19.5625f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.431175231933594, 31.96477699279785), new Point2D.Double(21.747974395751953, 11.780678749084473), new float[] {0.0f,0.5f,0.75f,0.84166664f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(230, 230, 230, 255)) : new Color(230, 230, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(225, 225, 225, 255)) : new Color(225, 225, 225, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
        return 6.96262788772583;
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
		return 36.04703140258789;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private drive_harddisk() {
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
       drive_harddisk base = new drive_harddisk();
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
       drive_harddisk base = new drive_harddisk();
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
        return drive_harddisk::new;
    }
}

