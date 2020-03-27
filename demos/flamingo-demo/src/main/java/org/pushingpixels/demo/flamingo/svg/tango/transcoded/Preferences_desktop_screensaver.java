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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class Preferences_desktop_screensaver implements ResizableIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.50857145f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0502510070800781f, 0.0f, 0.0f, 1.8678879737854004f, -0.9455580115318298f, -28.106109619140625f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(41.10058, 35.051105);
generalPath.curveTo(41.127632, 36.682228, 37.915836, 38.192577, 32.681362, 39.010254);
generalPath.curveTo(27.446886, 39.827927, 20.989925, 39.827927, 15.755449, 39.010254);
generalPath.curveTo(10.520973, 38.192577, 7.3091793, 36.682228, 7.336233, 35.051105);
generalPath.curveTo(7.3091793, 33.419983, 10.520973, 31.909634, 15.755449, 31.091959);
generalPath.curveTo(20.989925, 30.274284, 27.446886, 30.274284, 32.681362, 31.091959);
generalPath.curveTo(37.915836, 31.909634, 41.127632, 33.419983, 41.10058, 35.051105);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(12.57571029663086, 67.501708984375), 8.766279f, new Point2D.Double(12.57571029663086, 67.501708984375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9258079528808594f, 0.0f, 0.0f, 0.5192620158195496f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 60.033390045166016f, 8.07843017578125f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-26.263968, 29.716238);
generalPath.curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274);
generalPath.curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274);
generalPath.curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238);
generalPath.curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736);
generalPath.curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736);
generalPath.curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 176, 170, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(75, 77, 74, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-26.263968, 29.716238);
generalPath.curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274);
generalPath.curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274);
generalPath.curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238);
generalPath.curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736);
generalPath.curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736);
generalPath.curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9023730158805847f, 0.0f, 0.0f, 0.8276500105857849f, 56.55215072631836f, 12.867919921875f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(-35.65838623046875, 33.416473388671875), new Point2D.Double(-35.65838623046875, 28.2059383392334), new float[] {0.0f,1.0f}, new Color[] {new Color(123, 127, 122, 255),new Color(123, 127, 122, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.1571338f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-26.263968, 29.716238);
generalPath.curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274);
generalPath.curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274);
generalPath.curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238);
generalPath.curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736);
generalPath.curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736);
generalPath.curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.837548017501831f, 0.0f, 0.0f, 0.8526549935340881f, 54.17810821533203f, 11.006150245666504f));
// _0_0_3
paint = new LinearGradientPaint(new Point2D.Double(-35.12268829345703, 34.24223709106445), new Point2D.Double(-35.074745178222656, 30.962345123291016), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.1833371f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-26.263968, 29.716238);
generalPath.curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274);
generalPath.curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274);
generalPath.curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238);
generalPath.curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736);
generalPath.curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736);
generalPath.curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
shape = new Rectangle2D.Double(19.972396850585938, 31.07861328125, 9.0396728515625, 6.365038871765137);
paint = new LinearGradientPaint(new Point2D.Double(12.206708908081055, 53.53514099121094), new Point2D.Double(12.127711296081543, 64.89252471923828), new float[] {0.0f,1.0f}, new Color[] {new Color(88, 89, 86, 255),new Color(187, 190, 184, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.816344976425171f, 0.0f, 0.0f, 1.278926968574524f, 2.5f, -40.245079040527344f));
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
generalPath.moveTo(7.5809026, 4.570622);
generalPath.lineTo(41.169098, 4.570622);
generalPath.curveTo(42.08044, 4.570622, 42.793243, 5.1541038, 42.83585, 5.972209);
generalPath.lineTo(44.167892, 31.550323);
generalPath.curveTo(44.2261, 32.668056, 43.266838, 33.57063, 42.147587, 33.57063);
generalPath.lineTo(6.602412, 33.57063);
generalPath.curveTo(5.483163, 33.57063, 4.523898, 32.668056, 4.5821066, 31.550323);
generalPath.lineTo(5.9141507, 5.972209);
generalPath.curveTo(5.9544344, 5.1986747, 6.461653, 4.570622, 7.5809026, 4.570622);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(8.611623764038086, 7.229358196258545), new Point2D.Double(34.78447341918945, 33.339786529541016), new float[] {0.0f,1.0f}, new Color[] {new Color(221, 225, 217, 255),new Color(202, 205, 198, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1298630237579346f, 0.0f, 0.0f, 0.8850629925727844f, 2.875f, 1.570628046989441f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(10.390737533569336, 5.381774425506592), new Point2D.Double(32.53682327270508, 31.24605369567871), new float[] {0.0f,1.0f}, new Color[] {new Color(143, 143, 143, 255),new Color(73, 73, 73, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1043970584869385f, 0.0f, 0.0f, 0.9054710268974304f, 4.5f, 2.875f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.5809026, 4.570622);
generalPath.lineTo(41.169098, 4.570622);
generalPath.curveTo(42.08044, 4.570622, 42.793243, 5.1541038, 42.83585, 5.972209);
generalPath.lineTo(44.167892, 31.550323);
generalPath.curveTo(44.2261, 32.668056, 43.266838, 33.57063, 42.147587, 33.57063);
generalPath.lineTo(6.602412, 33.57063);
generalPath.curveTo(5.483163, 33.57063, 4.523898, 32.668056, 4.5821066, 31.550323);
generalPath.lineTo(5.9141507, 5.972209);
generalPath.curveTo(5.9544344, 5.1986747, 6.461653, 4.570622, 7.5809026, 4.570622);
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
generalPath.moveTo(8.910536, 7.180827);
generalPath.lineTo(7.6683393, 29.226145);
generalPath.lineTo(39.31873, 29.226145);
generalPath.lineTo(37.98371, 7.274256);
generalPath.lineTo(8.910536, 7.180827);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(19.1503963470459, 32.62223815917969), new Point2D.Double(16.315818786621094, 8.866622924804688), new float[] {0.0f,1.0f}, new Color[] {new Color(91, 91, 151, 255),new Color(27, 27, 67, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1741390228271484f, 0.0f, 0.0f, 0.9454309940338135f, 5.221825122833252f, 1.5434759855270386f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 121, 255);
stroke = new BasicStroke(0.5f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.910536, 7.180827);
generalPath.lineTo(7.6683393, 29.226145);
generalPath.lineTo(39.31873, 29.226145);
generalPath.lineTo(37.98371, 7.274256);
generalPath.lineTo(8.910536, 7.180827);
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
paint = new LinearGradientPaint(new Point2D.Double(3.7069976329803467, 171.2913360595703), new Point2D.Double(3.7069973945617676, 162.4506072998047), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 63),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(5.7051591873168945f, 0.0f, 0.0f, 0.17528000473976135f, 5.5f, 2.195626974105835f));
stroke = new BasicStroke(0.9961812f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.677433, 31.610788);
generalPath.lineTo(42.10591, 31.610788);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new LinearGradientPaint(new Point2D.Double(17.698339462280273, 13.004725456237793), new Point2D.Double(34.97454833984375, 55.20075607299805), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 179),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1080689430236816f, 0.0f, 0.0f, 0.9024710059165955f, 5.5f, 3.875f));
stroke = new BasicStroke(0.99999964f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.4145985, 5.58134);
generalPath.lineTo(41.2601, 5.543538);
generalPath.curveTo(41.543797, 5.5432215, 41.819405, 5.780788, 41.842205, 6.196082);
generalPath.lineTo(43.204098, 30.99933);
generalPath.curveTo(43.26214, 32.056362, 42.66435, 32.785202, 41.60573, 32.785202);
generalPath.lineTo(7.0817585, 32.785202);
generalPath.curveTo(6.0231357, 32.785202, 5.488744, 32.05641, 5.545887, 30.99933);
generalPath.lineTo(6.8699775, 6.505163);
generalPath.curveTo(6.9086733, 5.7893324, 7.0363626, 5.581762, 7.4145985, 5.58134);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5314286f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.388312, 7.621363);
generalPath.lineTo(8.585783, 25.491693);
generalPath.curveTo(19.63042, 23.091063, 24.007246, 14.999494, 37.739815, 12.344943);
generalPath.lineTo(37.578342, 7.687427);
generalPath.lineTo(9.388312, 7.621363);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(11.492236137390137, 1.6537576913833618), new Point2D.Double(17.199417114257812, 26.729263305664062), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(252, 252, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2389769554138184f, 0.0f, 0.0f, 0.8959550261497498f, 5.267331123352051f, 1.5434759855270386f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.91933012008667f, 5.728866100311279f));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.620502, 3.9384086);
generalPath.curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735);
generalPath.curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735);
generalPath.curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086);
generalPath.curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822);
generalPath.curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822);
generalPath.curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.805729866027832f, 7.834650039672852f));
// _0_0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.620502, 3.9384086);
generalPath.curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735);
generalPath.curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735);
generalPath.curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086);
generalPath.curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822);
generalPath.curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822);
generalPath.curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.692130088806152f, 9.834650039672852f));
// _0_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.620502, 3.9384086);
generalPath.curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735);
generalPath.curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735);
generalPath.curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086);
generalPath.curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822);
generalPath.curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822);
generalPath.curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.5785298347473145f, 11.834650039672852f));
// _0_0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.620502, 3.9384086);
generalPath.curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735);
generalPath.curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735);
generalPath.curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086);
generalPath.curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822);
generalPath.curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822);
generalPath.curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.464930057525635f, 13.834650039672852f));
// _0_0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.620502, 3.9384086);
generalPath.curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735);
generalPath.curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735);
generalPath.curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086);
generalPath.curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822);
generalPath.curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822);
generalPath.curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(22.5, 30.192665);
generalPath.lineTo(22.781715, 30.192665);
generalPath.curveTo(22.86548, 30.192667, 22.9297, 30.21133, 22.974377, 30.248655);
generalPath.curveTo(23.019344, 30.28569, 23.041828, 30.338594, 23.04183, 30.40737);
generalPath.curveTo(23.041828, 30.47644, 23.019344, 30.529638, 22.974377, 30.566965);
generalPath.curveTo(22.9297, 30.603998, 22.86548, 30.622515, 22.781715, 30.622515);
generalPath.lineTo(22.669735, 30.622515);
generalPath.lineTo(22.669735, 30.850885);
generalPath.lineTo(22.5, 30.850885);
generalPath.lineTo(22.5, 30.192665);
generalPath.moveTo(22.669735, 30.315668);
generalPath.lineTo(22.669735, 30.499512);
generalPath.lineTo(22.76364, 30.499512);
generalPath.curveTo(22.796558, 30.499512, 22.821981, 30.491575, 22.83991, 30.475704);
generalPath.curveTo(22.85784, 30.45954, 22.866804, 30.436762, 22.866804, 30.40737);
generalPath.curveTo(22.866804, 30.37798, 22.85784, 30.355349, 22.83991, 30.339476);
generalPath.curveTo(22.821981, 30.323605, 22.796558, 30.315668, 22.76364, 30.315668);
generalPath.lineTo(22.669735, 30.315668);
generalPath.moveTo(23.461979, 30.303764);
generalPath.curveTo(23.41025, 30.303766, 23.37013, 30.32287, 23.341621, 30.361078);
generalPath.curveTo(23.313112, 30.399288, 23.298857, 30.453074, 23.298857, 30.522436);
generalPath.curveTo(23.298857, 30.591507, 23.313112, 30.645145, 23.341621, 30.683355);
generalPath.curveTo(23.37013, 30.721563, 23.41025, 30.740667, 23.461979, 30.740667);
generalPath.curveTo(23.514002, 30.740667, 23.554268, 30.721563, 23.582779, 30.683355);
generalPath.curveTo(23.611286, 30.645145, 23.625542, 30.591507, 23.625542, 30.522436);
generalPath.curveTo(23.625542, 30.453074, 23.611286, 30.399288, 23.582779, 30.361078);
generalPath.curveTo(23.554268, 30.32287, 23.514002, 30.303766, 23.461979, 30.303764);
generalPath.moveTo(23.461979, 30.180761);
generalPath.curveTo(23.567787, 30.180763, 23.650671, 30.211037, 23.71063, 30.271582);
generalPath.curveTo(23.770588, 30.332129, 23.800568, 30.415747, 23.800568, 30.522436);
generalPath.curveTo(23.800568, 30.628834, 23.770588, 30.712305, 23.71063, 30.772852);
generalPath.curveTo(23.650671, 30.833399, 23.567787, 30.86367, 23.461979, 30.86367);
generalPath.curveTo(23.356464, 30.86367, 23.27358, 30.833399, 23.213327, 30.772852);
generalPath.curveTo(23.15337, 30.712305, 23.12339, 30.628834, 23.12339, 30.522436);
generalPath.curveTo(23.12339, 30.415747, 23.15337, 30.332129, 23.213327, 30.271582);
generalPath.curveTo(23.27358, 30.211037, 23.356464, 30.180763, 23.461979, 30.180761);
generalPath.moveTo(23.92842, 30.192665);
generalPath.lineTo(24.117994, 30.192665);
generalPath.lineTo(24.357388, 30.644117);
generalPath.lineTo(24.357388, 30.192665);
generalPath.lineTo(24.518305, 30.192665);
generalPath.lineTo(24.518305, 30.850885);
generalPath.lineTo(24.32873, 30.850885);
generalPath.lineTo(24.089338, 30.399433);
generalPath.lineTo(24.089338, 30.850885);
generalPath.lineTo(23.92842, 30.850885);
generalPath.lineTo(23.92842, 30.192665);
generalPath.moveTo(24.59149, 30.192665);
generalPath.lineTo(24.777096, 30.192665);
generalPath.lineTo(24.92699, 30.42721);
generalPath.lineTo(25.076887, 30.192665);
generalPath.lineTo(25.262936, 30.192665);
generalPath.lineTo(25.01208, 30.573578);
generalPath.lineTo(25.01208, 30.850885);
generalPath.lineTo(24.842344, 30.850885);
generalPath.lineTo(24.842344, 30.573578);
generalPath.lineTo(24.59149, 30.192665);
shape = generalPath;
paint = new Color(74, 74, 74, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.80312, 13.315819);
generalPath.curveTo(34.47257, 20.995363, 29.513748, 25.45455, 21.3557, 20.989296);
generalPath.curveTo(21.982796, 23.339367, 23.622335, 25.369877, 26.108051, 26.170364);
generalPath.curveTo(29.996363, 27.422537, 34.167355, 25.283571, 35.41953, 21.395262);
generalPath.curveTo(36.407272, 18.32807, 35.229874, 15.16364, 32.80312, 13.315819);
generalPath.closePath();
shape = generalPath;
paint = new Color(252, 233, 79, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(237, 212, 0, 255);
stroke = new BasicStroke(0.9999996f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.80312, 13.315819);
generalPath.curveTo(34.47257, 20.995363, 29.513748, 25.45455, 21.3557, 20.989296);
generalPath.curveTo(21.982796, 23.339367, 23.622335, 25.369877, 26.108051, 26.170364);
generalPath.curveTo(29.996363, 27.422537, 34.167355, 25.283571, 35.41953, 21.395262);
generalPath.curveTo(36.407272, 18.32807, 35.229874, 15.16364, 32.80312, 13.315819);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f));
// _0_0_17_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.854446, 13.970486);
generalPath.curveTo(17.857279, 14.603931, 17.520966, 15.1904745, 16.972853, 15.5080185);
generalPath.curveTo(16.42474, 15.825562, 15.748619, 15.825562, 15.200506, 15.5080185);
generalPath.curveTo(14.652394, 15.1904745, 14.316081, 14.603931, 14.318913, 13.970486);
generalPath.curveTo(14.316081, 13.33704, 14.652394, 12.750497, 15.200506, 12.432953);
generalPath.curveTo(15.748619, 12.11541, 16.42474, 12.11541, 16.972853, 12.432953);
generalPath.curveTo(17.520966, 12.750497, 17.857279, 13.33704, 17.854446, 13.970486);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 233, 100, 255),new Color(254, 233, 100, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.970564, 11.584001);
generalPath.lineTo(13.930592, 11.85101);
generalPath.lineTo(13.611806, 14.942758);
generalPath.lineTo(13.344797, 11.902786);
generalPath.lineTo(10.253049, 11.584001);
generalPath.lineTo(13.29302, 11.316992);
generalPath.lineTo(13.611806, 8.225244);
generalPath.lineTo(13.878815, 11.265215);
generalPath.lineTo(16.970564, 11.584001);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.6315789818763733f, 0.0f, 0.0f, 0.6315789818763733f, 12.969829559326172f, 3.737459897994995f));
// _0_0_18
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f));
// _0_0_18_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.854446, 13.970486);
generalPath.curveTo(17.857279, 14.603931, 17.520966, 15.1904745, 16.972853, 15.5080185);
generalPath.curveTo(16.42474, 15.825562, 15.748619, 15.825562, 15.200506, 15.5080185);
generalPath.curveTo(14.652394, 15.1904745, 14.316081, 14.603931, 14.318913, 13.970486);
generalPath.curveTo(14.316081, 13.33704, 14.652394, 12.750497, 15.200506, 12.432953);
generalPath.curveTo(15.748619, 12.11541, 16.42474, 12.11541, 16.972853, 12.432953);
generalPath.curveTo(17.520966, 12.750497, 17.857279, 13.33704, 17.854446, 13.970486);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 233, 100, 255),new Color(254, 233, 100, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_18_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.970564, 11.584001);
generalPath.lineTo(13.930592, 11.85101);
generalPath.lineTo(13.611806, 14.942758);
generalPath.lineTo(13.344797, 11.902786);
generalPath.lineTo(10.253049, 11.584001);
generalPath.lineTo(13.29302, 11.316992);
generalPath.lineTo(13.611806, 8.225244);
generalPath.lineTo(13.878815, 11.265215);
generalPath.lineTo(16.970564, 11.584001);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.6315789818763733f, 0.0f, 0.0f, 0.6315789818763733f, 9.611074447631836f, 9.83625602722168f));
// _0_0_19
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f));
// _0_0_19_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.854446, 13.970486);
generalPath.curveTo(17.857279, 14.603931, 17.520966, 15.1904745, 16.972853, 15.5080185);
generalPath.curveTo(16.42474, 15.825562, 15.748619, 15.825562, 15.200506, 15.5080185);
generalPath.curveTo(14.652394, 15.1904745, 14.316081, 14.603931, 14.318913, 13.970486);
generalPath.curveTo(14.316081, 13.33704, 14.652394, 12.750497, 15.200506, 12.432953);
generalPath.curveTo(15.748619, 12.11541, 16.42474, 12.11541, 16.972853, 12.432953);
generalPath.curveTo(17.520966, 12.750497, 17.857279, 13.33704, 17.854446, 13.970486);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 233, 100, 255),new Color(254, 233, 100, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_19_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.970564, 11.584001);
generalPath.lineTo(13.930592, 11.85101);
generalPath.lineTo(13.611806, 14.942758);
generalPath.lineTo(13.344797, 11.902786);
generalPath.lineTo(10.253049, 11.584001);
generalPath.lineTo(13.29302, 11.316992);
generalPath.lineTo(13.611806, 8.225244);
generalPath.lineTo(13.878815, 11.265215);
generalPath.lineTo(16.970564, 11.584001);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.6315789818763733f, 0.0f, 0.0f, 0.6315789818763733f, 4.484549045562744f, 11.515629768371582f));
// _0_0_20
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f));
// _0_0_20_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.854446, 13.970486);
generalPath.curveTo(17.857279, 14.603931, 17.520966, 15.1904745, 16.972853, 15.5080185);
generalPath.curveTo(16.42474, 15.825562, 15.748619, 15.825562, 15.200506, 15.5080185);
generalPath.curveTo(14.652394, 15.1904745, 14.316081, 14.603931, 14.318913, 13.970486);
generalPath.curveTo(14.316081, 13.33704, 14.652394, 12.750497, 15.200506, 12.432953);
generalPath.curveTo(15.748619, 12.11541, 16.42474, 12.11541, 16.972853, 12.432953);
generalPath.curveTo(17.520966, 12.750497, 17.857279, 13.33704, 17.854446, 13.970486);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 233, 100, 255),new Color(254, 233, 100, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_20_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.970564, 11.584001);
generalPath.lineTo(13.930592, 11.85101);
generalPath.lineTo(13.611806, 14.942758);
generalPath.lineTo(13.344797, 11.902786);
generalPath.lineTo(10.253049, 11.584001);
generalPath.lineTo(13.29302, 11.316992);
generalPath.lineTo(13.611806, 8.225244);
generalPath.lineTo(13.878815, 11.265215);
generalPath.lineTo(16.970564, 11.584001);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
g.setPaint(paint);
g.fill(shape);
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
        return 4.074917316436768;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 4.070621967315674;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 40.664737701416016;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 42.21737289428711;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Preferences_desktop_screensaver() {
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
       Preferences_desktop_screensaver base = new Preferences_desktop_screensaver();
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
       Preferences_desktop_screensaver base = new Preferences_desktop_screensaver();
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
        return Preferences_desktop_screensaver::new;
    }
}

