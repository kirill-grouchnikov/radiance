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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class Preferences_desktop_theme implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private NeonIcon.ColorFilter colorFilter = null;
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
g.setComposite(AlphaComposite.getInstance(3, 0.54385966f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.232558012008667f, 0.0f, 0.0f, 1.0f, 12.041410446166992f, -9.914664268493652f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.516504f, 39.249554f);
generalPath.curveTo(26.53173f, 40.959858f, 24.724045f, 42.543526f, 21.777939f, 43.40089f);
generalPath.curveTo(18.831835f, 44.25826f, 15.19768f, 44.25826f, 12.2515745f, 43.40089f);
generalPath.curveTo(9.305469f, 42.543526f, 7.497783f, 40.959858f, 7.51301f, 39.249554f);
generalPath.curveTo(7.497783f, 37.53925f, 9.305469f, 35.95558f, 12.2515745f, 35.098217f);
generalPath.curveTo(15.19768f, 34.24085f, 18.831835f, 34.24085f, 21.777939f, 35.098217f);
generalPath.curveTo(24.724045f, 35.95558f, 26.53173f, 37.53925f, 26.516504f, 39.249554f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(17.01475715637207, 39.24955368041992), 9.501747f, new Point2D.Double(17.01475715637207, 39.24955368041992), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5023260116577148f, 5.762756045876163E-15f, 19.53350067138672f));
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
generalPath.moveTo(31.205997f, 5.2048745f);
generalPath.lineTo(34.908493f, 5.2048745f);
generalPath.curveTo(39.19495f, 5.2048745f, 44.455605f, 6.5223904f, 44.455605f, 7.0610294f);
generalPath.lineTo(44.455605f, 29.688444f);
generalPath.curveTo(44.455605f, 30.227083f, 44.018726f, 30.660715f, 43.476055f, 30.660715f);
generalPath.lineTo(22.638435f, 30.660715f);
generalPath.curveTo(22.095766f, 30.660715f, 21.65889f, 30.227083f, 21.65889f, 29.688444f);
generalPath.lineTo(21.65889f, 7.0610294f);
generalPath.curveTo(21.65889f, 6.5223904f, 26.830568f, 5.2048745f, 31.205997f, 5.2048745f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(14.883313179016113, 27.847455978393555), new Point2D.Double(13.400960922241211, 20.06928062438965), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(214, 214, 214, 255)) : new Color(214, 214, 214, 255)),((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 240, 255)) : new Color(240, 240, 240, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(148, 148, 148, 255)) : new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.205997f, 5.2048745f);
generalPath.lineTo(34.908493f, 5.2048745f);
generalPath.curveTo(39.19495f, 5.2048745f, 44.455605f, 6.5223904f, 44.455605f, 7.0610294f);
generalPath.lineTo(44.455605f, 29.688444f);
generalPath.curveTo(44.455605f, 30.227083f, 44.018726f, 30.660715f, 43.476055f, 30.660715f);
generalPath.lineTo(22.638435f, 30.660715f);
generalPath.curveTo(22.095766f, 30.660715f, 21.65889f, 30.227083f, 21.65889f, 29.688444f);
generalPath.lineTo(21.65889f, 7.0610294f);
generalPath.curveTo(21.65889f, 6.5223904f, 26.830568f, 5.2048745f, 31.205997f, 5.2048745f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.61988306f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.363447f, 6.0663853f);
generalPath.lineTo(34.751057f, 6.0663853f);
generalPath.curveTo(38.672962f, 6.0663853f, 43.486214f, 7.5879025f, 43.486214f, 7.5879025f);
generalPath.lineTo(43.486214f, 29.657421f);
generalPath.curveTo(43.486214f, 29.657421f, 22.62829f, 29.657421f, 22.62829f, 29.657421f);
generalPath.lineTo(22.62829f, 7.5879025f);
generalPath.curveTo(22.62829f, 7.5879025f, 27.360134f, 6.0663853f, 31.363447f, 6.0663853f);
generalPath.closePath();
shape = generalPath;
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
generalPath.moveTo(33.410797f, 10.508173f);
generalPath.lineTo(30.405594f, 17.314075f);
generalPath.lineTo(30.405594f, 29.600058f);
generalPath.lineTo(33.587574f, 32.428486f);
generalPath.lineTo(36.50439f, 29.600058f);
generalPath.lineTo(36.50439f, 17.1373f);
generalPath.lineTo(33.410797f, 10.508173f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(16.940231323242188, 27.853084564208984), new Point2D.Double(16.940231323242188, 24.13514518737793), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(176, 176, 176, 255)) : new Color(176, 176, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(147, 147, 147, 255)) : new Color(147, 147, 147, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(148, 148, 148, 255)) : new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.410797f, 10.508173f);
generalPath.lineTo(30.405594f, 17.314075f);
generalPath.lineTo(30.405594f, 29.600058f);
generalPath.lineTo(33.587574f, 32.428486f);
generalPath.lineTo(36.50439f, 29.600058f);
generalPath.lineTo(36.50439f, 17.1373f);
generalPath.lineTo(33.410797f, 10.508173f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.46783626f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(17.456695556640625, 37.66166687011719), new Point2D.Double(17.456695556640625, 27.231843948364258), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f));
stroke = new BasicStroke(0.99999976f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.4229f, 13.510439f);
generalPath.lineTo(31.417679f, 17.9217f);
generalPath.lineTo(31.417679f, 28.969769f);
generalPath.lineTo(33.551254f, 31.023417f);
generalPath.lineTo(35.492302f, 28.969769f);
generalPath.lineTo(35.492302f, 17.793346f);
generalPath.lineTo(33.4229f, 13.510439f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.114439964294434f, -11.15211009979248f));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.506096f, 23.251263f);
generalPath.curveTo(20.50985f, 23.948053f, 20.064234f, 24.59325f, 19.337984f, 24.942549f);
generalPath.curveTo(18.611736f, 25.291845f, 17.715874f, 25.291845f, 16.989626f, 24.942549f);
generalPath.curveTo(16.263376f, 24.59325f, 15.81776f, 23.948053f, 15.821514f, 23.251263f);
generalPath.curveTo(15.81776f, 22.554472f, 16.263376f, 21.909275f, 16.989626f, 21.559977f);
generalPath.curveTo(17.715874f, 21.21068f, 18.611736f, 21.21068f, 19.337984f, 21.559977f);
generalPath.curveTo(20.064234f, 21.909275f, 20.50985f, 22.554472f, 20.506096f, 23.251263f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.16380500793457, 22.53187370300293), 2.842291f, new Point2D.Double(18.16380500793457, 22.53187370300293), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(176, 176, 176, 255)) : new Color(176, 176, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 117, 117, 255)) : new Color(117, 117, 117, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.86006098985672f, 0.0f, 3.2537600994110107f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(148, 148, 148, 255)) : new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.506096f, 23.251263f);
generalPath.curveTo(20.50985f, 23.948053f, 20.064234f, 24.59325f, 19.337984f, 24.942549f);
generalPath.curveTo(18.611736f, 25.291845f, 17.715874f, 25.291845f, 16.989626f, 24.942549f);
generalPath.curveTo(16.263376f, 24.59325f, 15.81776f, 23.948053f, 15.821514f, 23.251263f);
generalPath.curveTo(15.81776f, 22.554472f, 16.263376f, 21.909275f, 16.989626f, 21.559977f);
generalPath.curveTo(17.715874f, 21.21068f, 18.611736f, 21.21068f, 19.337984f, 21.559977f);
generalPath.curveTo(20.064234f, 21.909275f, 20.50985f, 22.554472f, 20.506096f, 23.251263f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(33.057243f, 10.331398f);
generalPath.lineTo(28.01911f, 14.132097f);
generalPath.curveTo(28.01911f, 14.132097f, 26.162954f, 8.565209f, 26.162954f, 6.0887585f);
generalPath.curveTo(26.162954f, 3.6138842f, 27.48878f, 2.6416132f, 28.902992f, 2.6416132f);
generalPath.curveTo(28.902992f, 2.6416132f, 37.299885f, 2.6416132f, 37.299885f, 2.6416132f);
generalPath.curveTo(38.256462f, 2.6416132f, 39.92944f, 3.0393603f, 40.12831f, 5.9119825f);
generalPath.curveTo(40.327187f, 8.784603f, 38.095383f, 14.132097f, 38.095383f, 14.132097f);
generalPath.lineTo(33.057243f, 10.331398f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(12.910969734191895, 13.001997947692871), 7.488951f, new Point2D.Double(12.910969734191895, 13.001997947692871), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 240, 255)) : new Color(240, 240, 240, 255)),((colorFilter != null) ? colorFilter.filter(new Color(201, 201, 201, 255)) : new Color(201, 201, 201, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8027249574661255f, 2.307501924799594E-23f, -2.6369310276807938E-23f, 1.5033420324325562f, 5.634344100952148f, -15.57903003692627f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(148, 148, 148, 255)) : new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.057243f, 10.331398f);
generalPath.lineTo(28.01911f, 14.132097f);
generalPath.curveTo(28.01911f, 14.132097f, 26.162954f, 8.565209f, 26.162954f, 6.0887585f);
generalPath.curveTo(26.162954f, 3.6138842f, 27.48878f, 2.6416132f, 28.902992f, 2.6416132f);
generalPath.curveTo(28.902992f, 2.6416132f, 37.299885f, 2.6416132f, 37.299885f, 2.6416132f);
generalPath.curveTo(38.256462f, 2.6416132f, 39.92944f, 3.0393603f, 40.12831f, 5.9119825f);
generalPath.curveTo(40.327187f, 8.784603f, 38.095383f, 14.132097f, 38.095383f, 14.132097f);
generalPath.lineTo(33.057243f, 10.331398f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.915115f, 5.0280943f);
generalPath.curveTo(29.915115f, 5.0280943f, 28.099472f, 5.5160723f, 28.41988f, 6.687217f);
generalPath.curveTo(28.740288f, 7.8583636f, 31.196747f, 9.712676f, 31.196747f, 9.712676f);
generalPath.lineTo(35.789257f, 9.712676f);
generalPath.curveTo(35.789257f, 9.712676f, 37.89861f, 8.15115f, 38.138916f, 6.9800043f);
generalPath.curveTo(38.379223f, 5.8088584f, 36.75048f, 5.0280943f, 36.75048f, 5.0280943f);
generalPath.lineTo(29.915115f, 5.0280943f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.73834f, 4.055826f);
generalPath.curveTo(29.73834f, 4.055826f, 27.922695f, 4.543804f, 28.243105f, 5.714949f);
generalPath.curveTo(28.56351f, 6.8860955f, 31.019972f, 8.740409f, 31.019972f, 8.740409f);
generalPath.lineTo(35.61248f, 8.740409f);
generalPath.curveTo(35.61248f, 8.740409f, 37.721832f, 7.178881f, 37.96214f, 6.007736f);
generalPath.curveTo(38.202446f, 4.8365903f, 36.573704f, 4.055826f, 36.573704f, 4.055826f);
generalPath.lineTo(29.73834f, 4.055826f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(17.09746742248535, 19.777185440063477), 4.5473714f, new Point2D.Double(17.09746742248535, 19.777185440063477), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(139, 139, 139, 255)) : new Color(139, 139, 139, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 169, 169, 255)) : new Color(169, 169, 169, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2083330154418945f, 0.0f, 0.0f, 0.6364930272102356f, 12.436349868774414f, -4.23803186416626f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.14035088f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.232558012008667f, 0.0f, 0.0f, 1.0f, 12.041410446166992f, -9.914664268493652f));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.516504f, 39.249554f);
generalPath.curveTo(26.53173f, 40.959858f, 24.724045f, 42.543526f, 21.777939f, 43.40089f);
generalPath.curveTo(18.831835f, 44.25826f, 15.19768f, 44.25826f, 12.2515745f, 43.40089f);
generalPath.curveTo(9.305469f, 42.543526f, 7.497783f, 40.959858f, 7.51301f, 39.249554f);
generalPath.curveTo(7.497783f, 37.53925f, 9.305469f, 35.95558f, 12.2515745f, 35.098217f);
generalPath.curveTo(15.19768f, 34.24085f, 18.831835f, 34.24085f, 21.777939f, 35.098217f);
generalPath.curveTo(24.724045f, 35.95558f, 26.53173f, 37.53925f, 26.516504f, 39.249554f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(17.01475715637207, 39.24955368041992), 9.501747f, new Point2D.Double(17.01475715637207, 39.24955368041992), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5023260116577148f, 5.762756045876163E-15f, 19.53350067138672f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.205997f, 5.2048745f);
generalPath.lineTo(34.908493f, 5.2048745f);
generalPath.curveTo(39.19495f, 5.2048745f, 44.455605f, 6.5223904f, 44.455605f, 7.0610294f);
generalPath.lineTo(44.455605f, 29.688444f);
generalPath.curveTo(44.455605f, 30.227083f, 44.018726f, 30.660715f, 43.476055f, 30.660715f);
generalPath.lineTo(22.638435f, 30.660715f);
generalPath.curveTo(22.095766f, 30.660715f, 21.65889f, 30.227083f, 21.65889f, 29.688444f);
generalPath.lineTo(21.65889f, 7.0610294f);
generalPath.curveTo(21.65889f, 6.5223904f, 26.830568f, 5.2048745f, 31.205997f, 5.2048745f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(14.883313179016113, 27.847455978393555), new Point2D.Double(13.400960922241211, 20.06928062438965), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(80, 121, 173, 255)) : new Color(80, 121, 173, 255)),((colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 255)) : new Color(52, 101, 164, 255);
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.205997f, 5.2048745f);
generalPath.lineTo(34.908493f, 5.2048745f);
generalPath.curveTo(39.19495f, 5.2048745f, 44.455605f, 6.5223904f, 44.455605f, 7.0610294f);
generalPath.lineTo(44.455605f, 29.688444f);
generalPath.curveTo(44.455605f, 30.227083f, 44.018726f, 30.660715f, 43.476055f, 30.660715f);
generalPath.lineTo(22.638435f, 30.660715f);
generalPath.curveTo(22.095766f, 30.660715f, 21.65889f, 30.227083f, 21.65889f, 29.688444f);
generalPath.lineTo(21.65889f, 7.0610294f);
generalPath.curveTo(21.65889f, 6.5223904f, 26.830568f, 5.2048745f, 31.205997f, 5.2048745f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.26315793f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.363447f, 6.0663853f);
generalPath.lineTo(34.751057f, 6.0663853f);
generalPath.curveTo(38.672962f, 6.0663853f, 43.486214f, 7.5879025f, 43.486214f, 7.5879025f);
generalPath.lineTo(43.486214f, 29.657421f);
generalPath.curveTo(43.486214f, 29.657421f, 22.62829f, 29.657421f, 22.62829f, 29.657421f);
generalPath.lineTo(22.62829f, 7.5879025f);
generalPath.curveTo(22.62829f, 7.5879025f, 27.360134f, 6.0663853f, 31.363447f, 6.0663853f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.410797f, 10.508173f);
generalPath.curveTo(33.410797f, 10.508173f, 30.405594f, 15.439076f, 30.405594f, 17.314075f);
generalPath.lineTo(30.405594f, 29.600058f);
generalPath.lineTo(33.587574f, 32.428486f);
generalPath.lineTo(36.50439f, 29.600058f);
generalPath.lineTo(36.50439f, 17.1373f);
generalPath.curveTo(36.50439f, 15.3873f, 33.410797f, 10.508173f, 33.410797f, 10.508173f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(117, 80, 123, 255)) : new Color(117, 80, 123, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(92, 53, 102, 255)) : new Color(92, 53, 102, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.410797f, 10.508173f);
generalPath.curveTo(33.410797f, 10.508173f, 30.405594f, 15.439076f, 30.405594f, 17.314075f);
generalPath.lineTo(30.405594f, 29.600058f);
generalPath.lineTo(33.587574f, 32.428486f);
generalPath.lineTo(36.50439f, 29.600058f);
generalPath.lineTo(36.50439f, 17.1373f);
generalPath.curveTo(36.50439f, 15.3873f, 33.410797f, 10.508173f, 33.410797f, 10.508173f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.25146198f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
paint = new LinearGradientPaint(new Point2D.Double(17.456695556640625, 37.66166687011719), new Point2D.Double(17.456695556640625, 27.231843948364258), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f));
stroke = new BasicStroke(0.99999976f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.4229f, 13.510439f);
generalPath.lineTo(31.417679f, 17.9217f);
generalPath.lineTo(31.417679f, 28.969769f);
generalPath.lineTo(33.551254f, 31.023417f);
generalPath.lineTo(35.492302f, 28.969769f);
generalPath.lineTo(35.492302f, 17.793346f);
generalPath.lineTo(33.4229f, 13.510439f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.114439964294434f, -11.15211009979248f));
// _0_0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.506096f, 23.251263f);
generalPath.curveTo(20.50985f, 23.948053f, 20.064234f, 24.59325f, 19.337984f, 24.942549f);
generalPath.curveTo(18.611736f, 25.291845f, 17.715874f, 25.291845f, 16.989626f, 24.942549f);
generalPath.curveTo(16.263376f, 24.59325f, 15.81776f, 23.948053f, 15.821514f, 23.251263f);
generalPath.curveTo(15.81776f, 22.554472f, 16.263376f, 21.909275f, 16.989626f, 21.559977f);
generalPath.curveTo(17.715874f, 21.21068f, 18.611736f, 21.21068f, 19.337984f, 21.559977f);
generalPath.curveTo(20.064234f, 21.909275f, 20.50985f, 22.554472f, 20.506096f, 23.251263f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.16380500793457, 22.42910385131836), 2.842291f, new Point2D.Double(18.16380500793457, 22.42910385131836), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(117, 80, 123, 255)) : new Color(117, 80, 123, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 57, 88, 255)) : new Color(84, 57, 88, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8709900379180908f, -2.4998940770107683E-15f, 2.150062058256454E-15f, 1.6091660261154175f, -15.820500373840332f, -13.547989845275879f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(92, 53, 102, 255)) : new Color(92, 53, 102, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.506096f, 23.251263f);
generalPath.curveTo(20.50985f, 23.948053f, 20.064234f, 24.59325f, 19.337984f, 24.942549f);
generalPath.curveTo(18.611736f, 25.291845f, 17.715874f, 25.291845f, 16.989626f, 24.942549f);
generalPath.curveTo(16.263376f, 24.59325f, 15.81776f, 23.948053f, 15.821514f, 23.251263f);
generalPath.curveTo(15.81776f, 22.554472f, 16.263376f, 21.909275f, 16.989626f, 21.559977f);
generalPath.curveTo(17.715874f, 21.21068f, 18.611736f, 21.21068f, 19.337984f, 21.559977f);
generalPath.curveTo(20.064234f, 21.909275f, 20.50985f, 22.554472f, 20.506096f, 23.251263f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.057243f, 10.331398f);
generalPath.lineTo(28.01911f, 14.132097f);
generalPath.curveTo(28.01911f, 14.132097f, 26.162954f, 8.565209f, 26.162954f, 6.0887585f);
generalPath.curveTo(26.162954f, 3.6138842f, 27.48878f, 2.6416132f, 28.902992f, 2.6416132f);
generalPath.curveTo(28.902992f, 2.6416132f, 37.299885f, 2.6416132f, 37.299885f, 2.6416132f);
generalPath.curveTo(38.256462f, 2.6416132f, 39.92944f, 3.0393603f, 40.12831f, 5.9119825f);
generalPath.curveTo(40.327187f, 8.784603f, 38.095383f, 14.132097f, 38.095383f, 14.132097f);
generalPath.lineTo(33.057243f, 10.331398f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(27.848600387573242, 4.607162952423096), 7.488951f, new Point2D.Double(27.848600387573242, 4.607162952423096), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 213, 230, 255)) : new Color(200, 213, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 126, 191, 255)) : new Color(66, 126, 191, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.8339279890060425f, 2.121324062347412f, 0.6557289958000183f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 255)) : new Color(52, 101, 164, 255);
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.057243f, 10.331398f);
generalPath.lineTo(28.01911f, 14.132097f);
generalPath.curveTo(28.01911f, 14.132097f, 26.162954f, 8.565209f, 26.162954f, 6.0887585f);
generalPath.curveTo(26.162954f, 3.6138842f, 27.48878f, 2.6416132f, 28.902992f, 2.6416132f);
generalPath.curveTo(28.902992f, 2.6416132f, 37.299885f, 2.6416132f, 37.299885f, 2.6416132f);
generalPath.curveTo(38.256462f, 2.6416132f, 39.92944f, 3.0393603f, 40.12831f, 5.9119825f);
generalPath.curveTo(40.327187f, 8.784603f, 38.095383f, 14.132097f, 38.095383f, 14.132097f);
generalPath.lineTo(33.057243f, 10.331398f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.33333334f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.915115f, 5.0280943f);
generalPath.curveTo(29.915115f, 5.0280943f, 28.099472f, 5.5160723f, 28.41988f, 6.687217f);
generalPath.curveTo(28.740288f, 7.8583636f, 30.696747f, 9.712676f, 31.196747f, 9.712676f);
generalPath.lineTo(35.789257f, 9.712676f);
generalPath.curveTo(36.539257f, 9.650176f, 37.89861f, 8.15115f, 38.138916f, 6.9800043f);
generalPath.curveTo(38.379223f, 5.8088584f, 36.75048f, 5.0280943f, 36.75048f, 5.0280943f);
generalPath.lineTo(29.915115f, 5.0280943f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.73834f, 4.055826f);
generalPath.curveTo(29.23834f, 4.055826f, 27.922695f, 4.543804f, 28.243105f, 5.714949f);
generalPath.curveTo(28.56351f, 6.8860955f, 30.14274f, 8.740409f, 31.019972f, 8.740409f);
generalPath.lineTo(35.61248f, 8.740409f);
generalPath.curveTo(36.30282f, 8.740409f, 37.721832f, 7.178881f, 37.96214f, 6.007736f);
generalPath.curveTo(38.202446f, 4.8365903f, 37.073704f, 4.055826f, 36.573704f, 4.055826f);
generalPath.lineTo(29.73834f, 4.055826f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(30.974437713623047, 12.172572135925293), 4.890574f, new Point2D.Double(30.974437713623047, 12.172572135925293), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 255)) : new Color(32, 74, 135, 255)),((colorFilter != null) ? colorFilter.filter(new Color(20, 46, 85, 255)) : new Color(20, 46, 85, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.132075071334839f, -4.7341581982461144E-15f, 2.2673780272753057E-15f, 1.0211360454559326f, -32.94403839111328f, -3.6894469261169434f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.28654972f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.145634f, 9.68365f);
generalPath.lineTo(37.83022f, 13.219183f);
generalPath.lineTo(39.067654f, 9.772038f);
generalPath.lineTo(37.565052f, 12.246911f);
generalPath.lineTo(33.145634f, 9.68365f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.643028259277344, 13.61693286895752), new Point2D.Double(31.643028259277344, 9.63847541809082), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 2.121324062347412f, -0.8838850259780884f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.28654972f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.79208f, 9.860426f);
generalPath.lineTo(28.372663f, 13.219183f);
generalPath.lineTo(26.870062f, 6.5900598f);
generalPath.lineTo(28.902992f, 11.981746f);
generalPath.lineTo(32.79208f, 9.860426f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.643028259277344, 13.61693286895752), new Point2D.Double(31.643028259277344, 9.63847541809082), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 2.121324062347412f, -0.8838850259780884f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 0.54385966f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.232558012008667f, 0.0f, 0.0f, 1.0f, -6.0782389640808105f, 3.005204916000366f));
// _0_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.516504f, 39.249554f);
generalPath.curveTo(26.53173f, 40.959858f, 24.724045f, 42.543526f, 21.777939f, 43.40089f);
generalPath.curveTo(18.831835f, 44.25826f, 15.19768f, 44.25826f, 12.2515745f, 43.40089f);
generalPath.curveTo(9.305469f, 42.543526f, 7.497783f, 40.959858f, 7.51301f, 39.249554f);
generalPath.curveTo(7.497783f, 37.53925f, 9.305469f, 35.95558f, 12.2515745f, 35.098217f);
generalPath.curveTo(15.19768f, 34.24085f, 18.831835f, 34.24085f, 21.777939f, 35.098217f);
generalPath.curveTo(24.724045f, 35.95558f, 26.53173f, 37.53925f, 26.516504f, 39.249554f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(17.01475715637207, 39.24955368041992), 9.501747f, new Point2D.Double(17.01475715637207, 39.24955368041992), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5023260116577148f, -2.992396937268808E-15f, 19.53350067138672f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.086385f, 18.12474f);
generalPath.lineTo(16.78888f, 18.12474f);
generalPath.curveTo(21.075336f, 18.12474f, 26.33599f, 19.442257f, 26.33599f, 19.980894f);
generalPath.lineTo(26.33599f, 42.60831f);
generalPath.curveTo(26.33599f, 43.14695f, 25.899113f, 43.58058f, 25.356443f, 43.58058f);
generalPath.lineTo(4.5188212f, 43.58058f);
generalPath.curveTo(3.9761531f, 43.58058f, 3.5392747f, 43.14695f, 3.5392747f, 42.60831f);
generalPath.lineTo(3.5392747f, 19.980894f);
generalPath.curveTo(3.5392747f, 19.442257f, 8.710954f, 18.12474f, 13.086385f, 18.12474f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(14.883313179016113, 27.847455978393555), new Point2D.Double(13.400960922241211, 20.06928062438965), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(214, 214, 214, 255)) : new Color(214, 214, 214, 255)),((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 240, 255)) : new Color(240, 240, 240, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(148, 148, 148, 255)) : new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.086385f, 18.12474f);
generalPath.lineTo(16.78888f, 18.12474f);
generalPath.curveTo(21.075336f, 18.12474f, 26.33599f, 19.442257f, 26.33599f, 19.980894f);
generalPath.lineTo(26.33599f, 42.60831f);
generalPath.curveTo(26.33599f, 43.14695f, 25.899113f, 43.58058f, 25.356443f, 43.58058f);
generalPath.lineTo(4.5188212f, 43.58058f);
generalPath.curveTo(3.9761531f, 43.58058f, 3.5392747f, 43.14695f, 3.5392747f, 42.60831f);
generalPath.lineTo(3.5392747f, 19.980894f);
generalPath.curveTo(3.5392747f, 19.442257f, 8.710954f, 18.12474f, 13.086385f, 18.12474f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.61988306f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.243834f, 18.986252f);
generalPath.lineTo(16.631443f, 18.986252f);
generalPath.curveTo(20.55335f, 18.986252f, 25.3666f, 20.507769f, 25.3666f, 20.507769f);
generalPath.lineTo(25.3666f, 42.57729f);
generalPath.curveTo(25.3666f, 42.57729f, 4.508677f, 42.57729f, 4.508677f, 42.57729f);
generalPath.lineTo(4.508677f, 20.507769f);
generalPath.curveTo(4.508677f, 20.507769f, 9.2405205f, 18.986252f, 13.243834f, 18.986252f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.291184f, 23.42804f);
generalPath.lineTo(12.285981f, 30.233944f);
generalPath.lineTo(12.285981f, 42.519924f);
generalPath.lineTo(15.467961f, 45.34835f);
generalPath.lineTo(18.384777f, 42.519924f);
generalPath.lineTo(18.384777f, 30.057167f);
generalPath.lineTo(15.291184f, 23.42804f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(16.940231323242188, 27.853084564208984), new Point2D.Double(16.940231323242188, 24.13514518737793), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(176, 176, 176, 255)) : new Color(176, 176, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(147, 147, 147, 255)) : new Color(147, 147, 147, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(148, 148, 148, 255)) : new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.291184f, 23.42804f);
generalPath.lineTo(12.285981f, 30.233944f);
generalPath.lineTo(12.285981f, 42.519924f);
generalPath.lineTo(15.467961f, 45.34835f);
generalPath.lineTo(18.384777f, 42.519924f);
generalPath.lineTo(18.384777f, 30.057167f);
generalPath.lineTo(15.291184f, 23.42804f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.46783626f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_4
paint = new LinearGradientPaint(new Point2D.Double(17.456695556640625, 37.66166687011719), new Point2D.Double(17.456695556640625, 27.231843948364258), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f));
stroke = new BasicStroke(0.99999976f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.303288f, 26.430305f);
generalPath.lineTo(13.298065f, 30.841566f);
generalPath.lineTo(13.298065f, 41.889637f);
generalPath.lineTo(15.431641f, 43.943283f);
generalPath.lineTo(17.372688f, 41.889637f);
generalPath.lineTo(17.372688f, 30.713213f);
generalPath.lineTo(15.303288f, 26.430305f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.0052080154418945f, 1.7677680253982544f));
// _0_1_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.506096f, 23.251263f);
generalPath.curveTo(20.50985f, 23.948053f, 20.064234f, 24.59325f, 19.337984f, 24.942549f);
generalPath.curveTo(18.611736f, 25.291845f, 17.715874f, 25.291845f, 16.989626f, 24.942549f);
generalPath.curveTo(16.263376f, 24.59325f, 15.81776f, 23.948053f, 15.821514f, 23.251263f);
generalPath.curveTo(15.81776f, 22.554472f, 16.263376f, 21.909275f, 16.989626f, 21.559977f);
generalPath.curveTo(17.715874f, 21.21068f, 18.611736f, 21.21068f, 19.337984f, 21.559977f);
generalPath.curveTo(20.064234f, 21.909275f, 20.50985f, 22.554472f, 20.506096f, 23.251263f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.16380500793457, 22.53187370300293), 2.842291f, new Point2D.Double(18.16380500793457, 22.53187370300293), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(176, 176, 176, 255)) : new Color(176, 176, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 117, 117, 255)) : new Color(117, 117, 117, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.86006098985672f, 0.0f, 3.2537600994110107f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(148, 148, 148, 255)) : new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.506096f, 23.251263f);
generalPath.curveTo(20.50985f, 23.948053f, 20.064234f, 24.59325f, 19.337984f, 24.942549f);
generalPath.curveTo(18.611736f, 25.291845f, 17.715874f, 25.291845f, 16.989626f, 24.942549f);
generalPath.curveTo(16.263376f, 24.59325f, 15.81776f, 23.948053f, 15.821514f, 23.251263f);
generalPath.curveTo(15.81776f, 22.554472f, 16.263376f, 21.909275f, 16.989626f, 21.559977f);
generalPath.curveTo(17.715874f, 21.21068f, 18.611736f, 21.21068f, 19.337984f, 21.559977f);
generalPath.curveTo(20.064234f, 21.909275f, 20.50985f, 22.554472f, 20.506096f, 23.251263f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.937632f, 23.251265f);
generalPath.lineTo(9.899495f, 27.051964f);
generalPath.curveTo(9.899495f, 27.051964f, 8.04334f, 21.485075f, 8.04334f, 19.008623f);
generalPath.curveTo(8.043341f, 16.53375f, 9.369165f, 15.561479f, 10.78338f, 15.561479f);
generalPath.curveTo(10.78338f, 15.561479f, 19.180273f, 15.561479f, 19.180273f, 15.561479f);
generalPath.curveTo(20.13685f, 15.561479f, 21.809826f, 15.959226f, 22.0087f, 18.831848f);
generalPath.curveTo(22.207575f, 21.70447f, 19.975767f, 27.051964f, 19.975767f, 27.051964f);
generalPath.lineTo(14.937632f, 23.251265f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(12.910969734191895, 13.001997947692871), 7.488951f, new Point2D.Double(12.910969734191895, 13.001997947692871), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 240, 255)) : new Color(240, 240, 240, 255)),((colorFilter != null) ? colorFilter.filter(new Color(201, 201, 201, 255)) : new Color(201, 201, 201, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8027249574661255f, 2.307501924799594E-23f, -2.6369310276807938E-23f, 1.5033420324325562f, -12.485250473022461f, -2.6591429710388184f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(148, 148, 148, 255)) : new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.937632f, 23.251265f);
generalPath.lineTo(9.899495f, 27.051964f);
generalPath.curveTo(9.899495f, 27.051964f, 8.04334f, 21.485075f, 8.04334f, 19.008623f);
generalPath.curveTo(8.043341f, 16.53375f, 9.369165f, 15.561479f, 10.78338f, 15.561479f);
generalPath.curveTo(10.78338f, 15.561479f, 19.180273f, 15.561479f, 19.180273f, 15.561479f);
generalPath.curveTo(20.13685f, 15.561479f, 21.809826f, 15.959226f, 22.0087f, 18.831848f);
generalPath.curveTo(22.207575f, 21.70447f, 19.975767f, 27.051964f, 19.975767f, 27.051964f);
generalPath.lineTo(14.937632f, 23.251265f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.795503f, 17.94796f);
generalPath.curveTo(11.795503f, 17.94796f, 9.979857f, 18.435938f, 10.300266f, 19.607082f);
generalPath.curveTo(10.620674f, 20.778229f, 13.077134f, 22.632542f, 13.077134f, 22.632542f);
generalPath.lineTo(17.669645f, 22.632542f);
generalPath.curveTo(17.669645f, 22.632542f, 19.778996f, 21.071014f, 20.019302f, 19.89987f);
generalPath.curveTo(20.259607f, 18.728724f, 18.630869f, 17.94796f, 18.630869f, 17.94796f);
generalPath.lineTo(11.795503f, 17.94796f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.618727f, 16.975693f);
generalPath.curveTo(11.618727f, 16.975693f, 9.8030815f, 17.46367f, 10.12349f, 18.634815f);
generalPath.curveTo(10.443897f, 19.805962f, 12.900358f, 21.660275f, 12.900358f, 21.660275f);
generalPath.lineTo(17.492868f, 21.660275f);
generalPath.curveTo(17.492868f, 21.660275f, 19.602219f, 20.098747f, 19.842525f, 18.927603f);
generalPath.curveTo(20.082832f, 17.756456f, 18.454092f, 16.975693f, 18.454092f, 16.975693f);
generalPath.lineTo(11.618727f, 16.975693f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(17.09746742248535, 19.777185440063477), 4.5473714f, new Point2D.Double(17.09746742248535, 19.777185440063477), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(139, 139, 139, 255)) : new Color(139, 139, 139, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 169, 169, 255)) : new Color(169, 169, 169, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2083330154418945f, 0.0f, 0.0f, 0.6364930272102356f, -5.683291912078857f, 8.681835174560547f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.14035088f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.232558012008667f, 0.0f, 0.0f, 1.0f, -6.0782389640808105f, 3.005204916000366f));
// _0_1_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.516504f, 39.249554f);
generalPath.curveTo(26.53173f, 40.959858f, 24.724045f, 42.543526f, 21.777939f, 43.40089f);
generalPath.curveTo(18.831835f, 44.25826f, 15.19768f, 44.25826f, 12.2515745f, 43.40089f);
generalPath.curveTo(9.305469f, 42.543526f, 7.497783f, 40.959858f, 7.51301f, 39.249554f);
generalPath.curveTo(7.497783f, 37.53925f, 9.305469f, 35.95558f, 12.2515745f, 35.098217f);
generalPath.curveTo(15.19768f, 34.24085f, 18.831835f, 34.24085f, 21.777939f, 35.098217f);
generalPath.curveTo(24.724045f, 35.95558f, 26.53173f, 37.53925f, 26.516504f, 39.249554f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(17.01475715637207, 39.24955368041992), 9.501747f, new Point2D.Double(17.01475715637207, 39.24955368041992), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5023260116577148f, -2.992396937268808E-15f, 19.53350067138672f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.086385f, 18.12474f);
generalPath.lineTo(16.78888f, 18.12474f);
generalPath.curveTo(21.075336f, 18.12474f, 26.33599f, 19.442257f, 26.33599f, 19.980894f);
generalPath.lineTo(26.33599f, 42.60831f);
generalPath.curveTo(26.33599f, 43.14695f, 25.899113f, 43.58058f, 25.356443f, 43.58058f);
generalPath.lineTo(4.5188212f, 43.58058f);
generalPath.curveTo(3.9761531f, 43.58058f, 3.5392747f, 43.14695f, 3.5392747f, 42.60831f);
generalPath.lineTo(3.5392747f, 19.980894f);
generalPath.curveTo(3.5392747f, 19.442257f, 8.710954f, 18.12474f, 13.086385f, 18.12474f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(14.883313179016113, 27.847455978393555), new Point2D.Double(13.400960922241211, 20.06928062438965), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(214, 214, 214, 255)) : new Color(214, 214, 214, 255)),((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 240, 255)) : new Color(240, 240, 240, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(148, 148, 148, 255)) : new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.086385f, 18.12474f);
generalPath.lineTo(16.78888f, 18.12474f);
generalPath.curveTo(21.075336f, 18.12474f, 26.33599f, 19.442257f, 26.33599f, 19.980894f);
generalPath.lineTo(26.33599f, 42.60831f);
generalPath.curveTo(26.33599f, 43.14695f, 25.899113f, 43.58058f, 25.356443f, 43.58058f);
generalPath.lineTo(4.5188212f, 43.58058f);
generalPath.curveTo(3.9761531f, 43.58058f, 3.5392747f, 43.14695f, 3.5392747f, 42.60831f);
generalPath.lineTo(3.5392747f, 19.980894f);
generalPath.curveTo(3.5392747f, 19.442257f, 8.710954f, 18.12474f, 13.086385f, 18.12474f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.61988306f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_11
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.243834f, 18.986252f);
generalPath.lineTo(16.631443f, 18.986252f);
generalPath.curveTo(20.55335f, 18.986252f, 25.3666f, 20.507769f, 25.3666f, 20.507769f);
generalPath.lineTo(25.3666f, 42.57729f);
generalPath.curveTo(25.3666f, 42.57729f, 4.508677f, 42.57729f, 4.508677f, 42.57729f);
generalPath.lineTo(4.508677f, 20.507769f);
generalPath.curveTo(4.508677f, 20.507769f, 9.2405205f, 18.986252f, 13.243834f, 18.986252f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint1(Graphics2D g,float origAlpha) {
generalPath.moveTo(15.291184f, 23.42804f);
generalPath.curveTo(15.291184f, 23.42804f, 12.285981f, 27.845821f, 12.285981f, 30.233944f);
generalPath.lineTo(12.285981f, 42.519924f);
generalPath.lineTo(15.467961f, 45.34835f);
generalPath.lineTo(18.384777f, 42.519924f);
generalPath.lineTo(18.384777f, 30.057167f);
generalPath.curveTo(18.384777f, 28.057167f, 15.291184f, 23.42804f, 15.291184f, 23.42804f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(15.335378646850586, 28.37778663635254), new Point2D.Double(15.335378646850586, 34.3881950378418), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(85, 87, 83, 255)) : new Color(85, 87, 83, 255)),((colorFilter != null) ? colorFilter.filter(new Color(124, 127, 121, 255)) : new Color(124, 127, 121, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(46, 52, 54, 255)) : new Color(46, 52, 54, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.291184f, 23.42804f);
generalPath.curveTo(15.291184f, 23.42804f, 12.285981f, 27.845821f, 12.285981f, 30.233944f);
generalPath.lineTo(12.285981f, 42.519924f);
generalPath.lineTo(15.467961f, 45.34835f);
generalPath.lineTo(18.384777f, 42.519924f);
generalPath.lineTo(18.384777f, 30.057167f);
generalPath.curveTo(18.384777f, 28.057167f, 15.291184f, 23.42804f, 15.291184f, 23.42804f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.46783626f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_13
paint = new LinearGradientPaint(new Point2D.Double(17.456695556640625, 37.66166687011719), new Point2D.Double(17.456695556640625, 27.231843948364258), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f));
stroke = new BasicStroke(0.99999976f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.303288f, 26.430305f);
generalPath.lineTo(13.298065f, 30.841566f);
generalPath.lineTo(13.298065f, 41.889637f);
generalPath.lineTo(15.431641f, 43.943283f);
generalPath.lineTo(17.372688f, 41.889637f);
generalPath.lineTo(17.372688f, 30.713213f);
generalPath.lineTo(15.303288f, 26.430305f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.0052080154418945f, 1.7677680253982544f));
// _0_1_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.506096f, 23.251263f);
generalPath.curveTo(20.50985f, 23.948053f, 20.064234f, 24.59325f, 19.337984f, 24.942549f);
generalPath.curveTo(18.611736f, 25.291845f, 17.715874f, 25.291845f, 16.989626f, 24.942549f);
generalPath.curveTo(16.263376f, 24.59325f, 15.81776f, 23.948053f, 15.821514f, 23.251263f);
generalPath.curveTo(15.81776f, 22.554472f, 16.263376f, 21.909275f, 16.989626f, 21.559977f);
generalPath.curveTo(17.715874f, 21.21068f, 18.611736f, 21.21068f, 19.337984f, 21.559977f);
generalPath.curveTo(20.064234f, 21.909275f, 20.50985f, 22.554472f, 20.506096f, 23.251263f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.16380500793457, 22.22356414794922), 2.842291f, new Point2D.Double(18.16380500793457, 22.22356414794922), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(128, 131, 125, 255)) : new Color(128, 131, 125, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 77, 74, 255)) : new Color(76, 77, 74, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.86006098985672f, 0.0f, 3.2537600994110107f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(46, 52, 54, 255)) : new Color(46, 52, 54, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.506096f, 23.251263f);
generalPath.curveTo(20.50985f, 23.948053f, 20.064234f, 24.59325f, 19.337984f, 24.942549f);
generalPath.curveTo(18.611736f, 25.291845f, 17.715874f, 25.291845f, 16.989626f, 24.942549f);
generalPath.curveTo(16.263376f, 24.59325f, 15.81776f, 23.948053f, 15.821514f, 23.251263f);
generalPath.curveTo(15.81776f, 22.554472f, 16.263376f, 21.909275f, 16.989626f, 21.559977f);
generalPath.curveTo(17.715874f, 21.21068f, 18.611736f, 21.21068f, 19.337984f, 21.559977f);
generalPath.curveTo(20.064234f, 21.909275f, 20.50985f, 22.554472f, 20.506096f, 23.251263f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.937632f, 23.251265f);
generalPath.lineTo(9.899495f, 27.051964f);
generalPath.curveTo(9.899495f, 27.051964f, 8.04334f, 21.485075f, 8.04334f, 19.008623f);
generalPath.curveTo(8.043341f, 16.53375f, 9.369165f, 15.561479f, 10.78338f, 15.561479f);
generalPath.curveTo(10.78338f, 15.561479f, 19.180273f, 15.561479f, 19.180273f, 15.561479f);
generalPath.curveTo(20.13685f, 15.561479f, 21.809826f, 15.959226f, 22.0087f, 18.831848f);
generalPath.curveTo(22.207575f, 21.70447f, 19.975767f, 27.051964f, 19.975767f, 27.051964f);
generalPath.lineTo(14.937632f, 23.251265f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(12.910969734191895, 13.001997947692871), 7.488951f, new Point2D.Double(12.910969734191895, 13.001997947692871), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 240, 255)) : new Color(240, 240, 240, 255)),((colorFilter != null) ? colorFilter.filter(new Color(201, 201, 201, 255)) : new Color(201, 201, 201, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8027249574661255f, 2.307501924799594E-23f, -2.6369310276807938E-23f, 1.5033420324325562f, -12.485250473022461f, -2.6591429710388184f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(148, 148, 148, 255)) : new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.937632f, 23.251265f);
generalPath.lineTo(9.899495f, 27.051964f);
generalPath.curveTo(9.899495f, 27.051964f, 8.04334f, 21.485075f, 8.04334f, 19.008623f);
generalPath.curveTo(8.043341f, 16.53375f, 9.369165f, 15.561479f, 10.78338f, 15.561479f);
generalPath.curveTo(10.78338f, 15.561479f, 19.180273f, 15.561479f, 19.180273f, 15.561479f);
generalPath.curveTo(20.13685f, 15.561479f, 21.809826f, 15.959226f, 22.0087f, 18.831848f);
generalPath.curveTo(22.207575f, 21.70447f, 19.975767f, 27.051964f, 19.975767f, 27.051964f);
generalPath.lineTo(14.937632f, 23.251265f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.795503f, 17.94796f);
generalPath.curveTo(11.795503f, 17.94796f, 9.979857f, 18.435938f, 10.300266f, 19.607082f);
generalPath.curveTo(10.620674f, 20.778229f, 12.007307f, 22.632542f, 13.077134f, 22.632542f);
generalPath.lineTo(17.669645f, 22.632542f);
generalPath.curveTo(18.546875f, 22.632542f, 19.778996f, 21.071014f, 20.019302f, 19.89987f);
generalPath.curveTo(20.259607f, 18.728724f, 18.630869f, 17.94796f, 18.630869f, 17.94796f);
generalPath.lineTo(11.795503f, 17.94796f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.618727f, 16.975693f);
generalPath.curveTo(11.618727f, 16.975693f, 9.8030815f, 17.46367f, 10.12349f, 18.634815f);
generalPath.curveTo(10.443897f, 19.805962f, 11.775358f, 21.660275f, 12.900358f, 21.660275f);
generalPath.lineTo(17.492868f, 21.660275f);
generalPath.curveTo(18.242868f, 21.660275f, 19.602219f, 20.098747f, 19.842525f, 18.927603f);
generalPath.curveTo(20.082832f, 17.756456f, 18.454092f, 16.975693f, 18.454092f, 16.975693f);
generalPath.lineTo(11.618727f, 16.975693f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(17.09746742248535, 19.777185440063477), 4.5473714f, new Point2D.Double(17.09746742248535, 19.777185440063477), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(139, 139, 139, 255)) : new Color(139, 139, 139, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 169, 169, 255)) : new Color(169, 169, 169, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2083330154418945f, 0.0f, 0.0f, 0.6364930272102356f, -5.683291912078857f, 8.681835174560547f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.61988306f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.937632f, 22.720934f);
generalPath.lineTo(19.622215f, 26.256468f);
generalPath.lineTo(20.859652f, 22.809322f);
generalPath.lineTo(19.35705f, 25.284197f);
generalPath.lineTo(14.937632f, 22.720934f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.61988306f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.584078f, 22.89771f);
generalPath.lineTo(10.164659f, 26.256468f);
generalPath.lineTo(8.662058f, 19.627342f);
generalPath.lineTo(10.69499f, 25.019032f);
generalPath.lineTo(14.584078f, 22.89771f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
        return 3.0392746925354004;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 2.141613245010376;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 41.91632843017578;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 45.121849060058594;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Preferences_desktop_theme() {
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
    public static NeonIcon of(int width, int height) {
       Preferences_desktop_theme base = new Preferences_desktop_theme();
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       Preferences_desktop_theme base = new Preferences_desktop_theme();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return Preferences_desktop_theme::new;
    }
}

