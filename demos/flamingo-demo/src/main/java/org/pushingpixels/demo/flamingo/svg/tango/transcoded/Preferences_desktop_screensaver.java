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
public class Preferences_desktop_screensaver implements NeonIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.50857145f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0502510070800781f, 0.0f, 0.0f, 1.8678879737854004f, -0.9455580115318298f, -28.106109619140625f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(41.10058f, 35.051105f);
generalPath.curveTo(41.127632f, 36.682228f, 37.915836f, 38.192577f, 32.681362f, 39.010254f);
generalPath.curveTo(27.446886f, 39.827927f, 20.989925f, 39.827927f, 15.755449f, 39.010254f);
generalPath.curveTo(10.520973f, 38.192577f, 7.3091793f, 36.682228f, 7.336233f, 35.051105f);
generalPath.curveTo(7.3091793f, 33.419983f, 10.520973f, 31.909634f, 15.755449f, 31.091959f);
generalPath.curveTo(20.989925f, 30.274284f, 27.446886f, 30.274284f, 32.681362f, 31.091959f);
generalPath.curveTo(37.915836f, 31.909634f, 41.127632f, 33.419983f, 41.10058f, 35.051105f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(12.57571029663086, 67.501708984375), 8.766279f, new Point2D.Double(12.57571029663086, 67.501708984375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9258079528808594f, 0.0f, 0.0f, 0.5192620158195496f, 0.0f, 0.0f));
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
generalPath.moveTo(-26.263968f, 29.716238f);
generalPath.curveTo(-26.248913f, 31.127916f, -28.036179f, 32.43507f, -30.949007f, 33.14274f);
generalPath.curveTo(-33.861835f, 33.850407f, -37.45494f, 33.850407f, -40.367767f, 33.14274f);
generalPath.curveTo(-43.280594f, 32.43507f, -45.06786f, 31.127916f, -45.052807f, 29.716238f);
generalPath.curveTo(-45.06786f, 28.30456f, -43.280594f, 26.997404f, -40.367767f, 26.289736f);
generalPath.curveTo(-37.45494f, 25.582067f, -33.861835f, 25.582067f, -30.949007f, 26.289736f);
generalPath.curveTo(-28.036179f, 26.997404f, -26.248913f, 28.30456f, -26.263968f, 29.716238f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(173, 176, 170, 255)) : new Color(173, 176, 170, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(75, 77, 74, 255)) : new Color(75, 77, 74, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-26.263968f, 29.716238f);
generalPath.curveTo(-26.248913f, 31.127916f, -28.036179f, 32.43507f, -30.949007f, 33.14274f);
generalPath.curveTo(-33.861835f, 33.850407f, -37.45494f, 33.850407f, -40.367767f, 33.14274f);
generalPath.curveTo(-43.280594f, 32.43507f, -45.06786f, 31.127916f, -45.052807f, 29.716238f);
generalPath.curveTo(-45.06786f, 28.30456f, -43.280594f, 26.997404f, -40.367767f, 26.289736f);
generalPath.curveTo(-37.45494f, 25.582067f, -33.861835f, 25.582067f, -30.949007f, 26.289736f);
generalPath.curveTo(-28.036179f, 26.997404f, -26.248913f, 28.30456f, -26.263968f, 29.716238f);
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
paint = new LinearGradientPaint(new Point2D.Double(-35.65838623046875, 33.416473388671875), new Point2D.Double(-35.65838623046875, 28.2059383392334), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(123, 127, 122, 255)) : new Color(123, 127, 122, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 127, 122, 0)) : new Color(123, 127, 122, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.1571338f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-26.263968f, 29.716238f);
generalPath.curveTo(-26.248913f, 31.127916f, -28.036179f, 32.43507f, -30.949007f, 33.14274f);
generalPath.curveTo(-33.861835f, 33.850407f, -37.45494f, 33.850407f, -40.367767f, 33.14274f);
generalPath.curveTo(-43.280594f, 32.43507f, -45.06786f, 31.127916f, -45.052807f, 29.716238f);
generalPath.curveTo(-45.06786f, 28.30456f, -43.280594f, 26.997404f, -40.367767f, 26.289736f);
generalPath.curveTo(-37.45494f, 25.582067f, -33.861835f, 25.582067f, -30.949007f, 26.289736f);
generalPath.curveTo(-28.036179f, 26.997404f, -26.248913f, 28.30456f, -26.263968f, 29.716238f);
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
paint = new LinearGradientPaint(new Point2D.Double(-35.12268829345703, 34.24223709106445), new Point2D.Double(-35.074745178222656, 30.962345123291016), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.1833371f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-26.263968f, 29.716238f);
generalPath.curveTo(-26.248913f, 31.127916f, -28.036179f, 32.43507f, -30.949007f, 33.14274f);
generalPath.curveTo(-33.861835f, 33.850407f, -37.45494f, 33.850407f, -40.367767f, 33.14274f);
generalPath.curveTo(-43.280594f, 32.43507f, -45.06786f, 31.127916f, -45.052807f, 29.716238f);
generalPath.curveTo(-45.06786f, 28.30456f, -43.280594f, 26.997404f, -40.367767f, 26.289736f);
generalPath.curveTo(-37.45494f, 25.582067f, -33.861835f, 25.582067f, -30.949007f, 26.289736f);
generalPath.curveTo(-28.036179f, 26.997404f, -26.248913f, 28.30456f, -26.263968f, 29.716238f);
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
paint = new LinearGradientPaint(new Point2D.Double(12.206708908081055, 53.53514099121094), new Point2D.Double(12.127711296081543, 64.89252471923828), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(88, 89, 86, 255)) : new Color(88, 89, 86, 255)),((colorFilter != null) ? colorFilter.filter(new Color(187, 190, 184, 255)) : new Color(187, 190, 184, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.816344976425171f, 0.0f, 0.0f, 1.278926968574524f, 2.5f, -40.245079040527344f));
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
generalPath.moveTo(7.5809026f, 4.570622f);
generalPath.lineTo(41.169098f, 4.570622f);
generalPath.curveTo(42.08044f, 4.570622f, 42.793243f, 5.1541038f, 42.83585f, 5.972209f);
generalPath.lineTo(44.167892f, 31.550323f);
generalPath.curveTo(44.2261f, 32.668056f, 43.266838f, 33.57063f, 42.147587f, 33.57063f);
generalPath.lineTo(6.602412f, 33.57063f);
generalPath.curveTo(5.483163f, 33.57063f, 4.523898f, 32.668056f, 4.5821066f, 31.550323f);
generalPath.lineTo(5.9141507f, 5.972209f);
generalPath.curveTo(5.9544344f, 5.1986747f, 6.461653f, 4.570622f, 7.5809026f, 4.570622f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(8.611623764038086, 7.229358196258545), new Point2D.Double(34.78447341918945, 33.339786529541016), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(221, 225, 217, 255)) : new Color(221, 225, 217, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 205, 198, 255)) : new Color(202, 205, 198, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1298630237579346f, 0.0f, 0.0f, 0.8850629925727844f, 2.875f, 1.570628046989441f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(10.390737533569336, 5.381774425506592), new Point2D.Double(32.53682327270508, 31.24605369567871), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(143, 143, 143, 255)) : new Color(143, 143, 143, 255)),((colorFilter != null) ? colorFilter.filter(new Color(73, 73, 73, 255)) : new Color(73, 73, 73, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1043970584869385f, 0.0f, 0.0f, 0.9054710268974304f, 4.5f, 2.875f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.5809026f, 4.570622f);
generalPath.lineTo(41.169098f, 4.570622f);
generalPath.curveTo(42.08044f, 4.570622f, 42.793243f, 5.1541038f, 42.83585f, 5.972209f);
generalPath.lineTo(44.167892f, 31.550323f);
generalPath.curveTo(44.2261f, 32.668056f, 43.266838f, 33.57063f, 42.147587f, 33.57063f);
generalPath.lineTo(6.602412f, 33.57063f);
generalPath.curveTo(5.483163f, 33.57063f, 4.523898f, 32.668056f, 4.5821066f, 31.550323f);
generalPath.lineTo(5.9141507f, 5.972209f);
generalPath.curveTo(5.9544344f, 5.1986747f, 6.461653f, 4.570622f, 7.5809026f, 4.570622f);
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
generalPath.moveTo(8.910536f, 7.180827f);
generalPath.lineTo(7.6683393f, 29.226145f);
generalPath.lineTo(39.31873f, 29.226145f);
generalPath.lineTo(37.98371f, 7.274256f);
generalPath.lineTo(8.910536f, 7.180827f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(19.1503963470459, 32.62223815917969), new Point2D.Double(16.315818786621094, 8.866622924804688), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(91, 91, 151, 255)) : new Color(91, 91, 151, 255)),((colorFilter != null) ? colorFilter.filter(new Color(27, 27, 67, 255)) : new Color(27, 27, 67, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1741390228271484f, 0.0f, 0.0f, 0.9454309940338135f, 5.221825122833252f, 1.5434759855270386f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 121, 255)) : new Color(0, 0, 121, 255);
stroke = new BasicStroke(0.5f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.910536f, 7.180827f);
generalPath.lineTo(7.6683393f, 29.226145f);
generalPath.lineTo(39.31873f, 29.226145f);
generalPath.lineTo(37.98371f, 7.274256f);
generalPath.lineTo(8.910536f, 7.180827f);
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
paint = new LinearGradientPaint(new Point2D.Double(3.7069976329803467, 171.2913360595703), new Point2D.Double(3.7069973945617676, 162.4506072998047), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 63)) : new Color(0, 0, 0, 63)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(5.7051591873168945f, 0.0f, 0.0f, 0.17528000473976135f, 5.5f, 2.195626974105835f));
stroke = new BasicStroke(0.9961812f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.677433f, 31.610788f);
generalPath.lineTo(42.10591f, 31.610788f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new LinearGradientPaint(new Point2D.Double(17.698339462280273, 13.004725456237793), new Point2D.Double(34.97454833984375, 55.20075607299805), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 179)) : new Color(255, 255, 255, 179)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1080689430236816f, 0.0f, 0.0f, 0.9024710059165955f, 5.5f, 3.875f));
stroke = new BasicStroke(0.99999964f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.4145985f, 5.58134f);
generalPath.lineTo(41.2601f, 5.543538f);
generalPath.curveTo(41.543797f, 5.5432215f, 41.819405f, 5.780788f, 41.842205f, 6.196082f);
generalPath.lineTo(43.204098f, 30.99933f);
generalPath.curveTo(43.26214f, 32.056362f, 42.66435f, 32.785202f, 41.60573f, 32.785202f);
generalPath.lineTo(7.0817585f, 32.785202f);
generalPath.curveTo(6.0231357f, 32.785202f, 5.488744f, 32.05641f, 5.545887f, 30.99933f);
generalPath.lineTo(6.8699775f, 6.505163f);
generalPath.curveTo(6.9086733f, 5.7893324f, 7.0363626f, 5.581762f, 7.4145985f, 5.58134f);
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
generalPath.moveTo(9.388312f, 7.621363f);
generalPath.lineTo(8.585783f, 25.491693f);
generalPath.curveTo(19.63042f, 23.091063f, 24.007246f, 14.999494f, 37.739815f, 12.344943f);
generalPath.lineTo(37.578342f, 7.687427f);
generalPath.lineTo(9.388312f, 7.621363f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(11.492236137390137, 1.6537576913833618), new Point2D.Double(17.199417114257812, 26.729263305664062), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 252, 255, 0)) : new Color(252, 252, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2389769554138184f, 0.0f, 0.0f, 0.8959550261497498f, 5.267331123352051f, 1.5434759855270386f));
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
generalPath.moveTo(35.620502f, 3.9384086f);
generalPath.curveTo(35.62185f, 4.2392945f, 35.4621f, 4.5179024f, 35.201748f, 4.668735f);
generalPath.curveTo(34.941395f, 4.8195677f, 34.620235f, 4.8195677f, 34.359882f, 4.668735f);
generalPath.curveTo(34.09953f, 4.5179024f, 33.93978f, 4.2392945f, 33.941128f, 3.9384086f);
generalPath.curveTo(33.93978f, 3.6375227f, 34.09953f, 3.358915f, 34.359882f, 3.2080822f);
generalPath.curveTo(34.620235f, 3.0572495f, 34.941395f, 3.0572495f, 35.201748f, 3.2080822f);
generalPath.curveTo(35.4621f, 3.358915f, 35.62185f, 3.6375227f, 35.620502f, 3.9384086f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(144, 144, 144, 255)) : new Color(144, 144, 144, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 190, 190, 0)) : new Color(190, 190, 190, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(35.620502f, 3.9384086f);
generalPath.curveTo(35.62185f, 4.2392945f, 35.4621f, 4.5179024f, 35.201748f, 4.668735f);
generalPath.curveTo(34.941395f, 4.8195677f, 34.620235f, 4.8195677f, 34.359882f, 4.668735f);
generalPath.curveTo(34.09953f, 4.5179024f, 33.93978f, 4.2392945f, 33.941128f, 3.9384086f);
generalPath.curveTo(33.93978f, 3.6375227f, 34.09953f, 3.358915f, 34.359882f, 3.2080822f);
generalPath.curveTo(34.620235f, 3.0572495f, 34.941395f, 3.0572495f, 35.201748f, 3.2080822f);
generalPath.curveTo(35.4621f, 3.358915f, 35.62185f, 3.6375227f, 35.620502f, 3.9384086f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(144, 144, 144, 255)) : new Color(144, 144, 144, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 190, 190, 0)) : new Color(190, 190, 190, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(35.620502f, 3.9384086f);
generalPath.curveTo(35.62185f, 4.2392945f, 35.4621f, 4.5179024f, 35.201748f, 4.668735f);
generalPath.curveTo(34.941395f, 4.8195677f, 34.620235f, 4.8195677f, 34.359882f, 4.668735f);
generalPath.curveTo(34.09953f, 4.5179024f, 33.93978f, 4.2392945f, 33.941128f, 3.9384086f);
generalPath.curveTo(33.93978f, 3.6375227f, 34.09953f, 3.358915f, 34.359882f, 3.2080822f);
generalPath.curveTo(34.620235f, 3.0572495f, 34.941395f, 3.0572495f, 35.201748f, 3.2080822f);
generalPath.curveTo(35.4621f, 3.358915f, 35.62185f, 3.6375227f, 35.620502f, 3.9384086f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(144, 144, 144, 255)) : new Color(144, 144, 144, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 190, 190, 0)) : new Color(190, 190, 190, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(35.620502f, 3.9384086f);
generalPath.curveTo(35.62185f, 4.2392945f, 35.4621f, 4.5179024f, 35.201748f, 4.668735f);
generalPath.curveTo(34.941395f, 4.8195677f, 34.620235f, 4.8195677f, 34.359882f, 4.668735f);
generalPath.curveTo(34.09953f, 4.5179024f, 33.93978f, 4.2392945f, 33.941128f, 3.9384086f);
generalPath.curveTo(33.93978f, 3.6375227f, 34.09953f, 3.358915f, 34.359882f, 3.2080822f);
generalPath.curveTo(34.620235f, 3.0572495f, 34.941395f, 3.0572495f, 35.201748f, 3.2080822f);
generalPath.curveTo(35.4621f, 3.358915f, 35.62185f, 3.6375227f, 35.620502f, 3.9384086f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(144, 144, 144, 255)) : new Color(144, 144, 144, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 190, 190, 0)) : new Color(190, 190, 190, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(35.620502f, 3.9384086f);
generalPath.curveTo(35.62185f, 4.2392945f, 35.4621f, 4.5179024f, 35.201748f, 4.668735f);
generalPath.curveTo(34.941395f, 4.8195677f, 34.620235f, 4.8195677f, 34.359882f, 4.668735f);
generalPath.curveTo(34.09953f, 4.5179024f, 33.93978f, 4.2392945f, 33.941128f, 3.9384086f);
generalPath.curveTo(33.93978f, 3.6375227f, 34.09953f, 3.358915f, 34.359882f, 3.2080822f);
generalPath.curveTo(34.620235f, 3.0572495f, 34.941395f, 3.0572495f, 35.201748f, 3.2080822f);
generalPath.curveTo(35.4621f, 3.358915f, 35.62185f, 3.6375227f, 35.620502f, 3.9384086f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(144, 144, 144, 255)) : new Color(144, 144, 144, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 190, 190, 0)) : new Color(190, 190, 190, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(22.5f, 30.192665f);
generalPath.lineTo(22.781715f, 30.192665f);
generalPath.curveTo(22.86548f, 30.192667f, 22.9297f, 30.21133f, 22.974377f, 30.248655f);
generalPath.curveTo(23.019344f, 30.28569f, 23.041828f, 30.338594f, 23.04183f, 30.40737f);
generalPath.curveTo(23.041828f, 30.47644f, 23.019344f, 30.529638f, 22.974377f, 30.566965f);
generalPath.curveTo(22.9297f, 30.603998f, 22.86548f, 30.622515f, 22.781715f, 30.622515f);
generalPath.lineTo(22.669735f, 30.622515f);
generalPath.lineTo(22.669735f, 30.850885f);
generalPath.lineTo(22.5f, 30.850885f);
generalPath.lineTo(22.5f, 30.192665f);
generalPath.moveTo(22.669735f, 30.315668f);
generalPath.lineTo(22.669735f, 30.499512f);
generalPath.lineTo(22.76364f, 30.499512f);
generalPath.curveTo(22.796558f, 30.499512f, 22.821981f, 30.491575f, 22.83991f, 30.475704f);
generalPath.curveTo(22.85784f, 30.45954f, 22.866804f, 30.436762f, 22.866804f, 30.40737f);
generalPath.curveTo(22.866804f, 30.37798f, 22.85784f, 30.355349f, 22.83991f, 30.339476f);
generalPath.curveTo(22.821981f, 30.323605f, 22.796558f, 30.315668f, 22.76364f, 30.315668f);
generalPath.lineTo(22.669735f, 30.315668f);
generalPath.moveTo(23.461979f, 30.303764f);
generalPath.curveTo(23.41025f, 30.303766f, 23.37013f, 30.32287f, 23.341621f, 30.361078f);
generalPath.curveTo(23.313112f, 30.399288f, 23.298857f, 30.453074f, 23.298857f, 30.522436f);
generalPath.curveTo(23.298857f, 30.591507f, 23.313112f, 30.645145f, 23.341621f, 30.683355f);
generalPath.curveTo(23.37013f, 30.721563f, 23.41025f, 30.740667f, 23.461979f, 30.740667f);
generalPath.curveTo(23.514002f, 30.740667f, 23.554268f, 30.721563f, 23.582779f, 30.683355f);
generalPath.curveTo(23.611286f, 30.645145f, 23.625542f, 30.591507f, 23.625542f, 30.522436f);
generalPath.curveTo(23.625542f, 30.453074f, 23.611286f, 30.399288f, 23.582779f, 30.361078f);
generalPath.curveTo(23.554268f, 30.32287f, 23.514002f, 30.303766f, 23.461979f, 30.303764f);
generalPath.moveTo(23.461979f, 30.180761f);
generalPath.curveTo(23.567787f, 30.180763f, 23.650671f, 30.211037f, 23.71063f, 30.271582f);
generalPath.curveTo(23.770588f, 30.332129f, 23.800568f, 30.415747f, 23.800568f, 30.522436f);
generalPath.curveTo(23.800568f, 30.628834f, 23.770588f, 30.712305f, 23.71063f, 30.772852f);
generalPath.curveTo(23.650671f, 30.833399f, 23.567787f, 30.86367f, 23.461979f, 30.86367f);
generalPath.curveTo(23.356464f, 30.86367f, 23.27358f, 30.833399f, 23.213327f, 30.772852f);
generalPath.curveTo(23.15337f, 30.712305f, 23.12339f, 30.628834f, 23.12339f, 30.522436f);
generalPath.curveTo(23.12339f, 30.415747f, 23.15337f, 30.332129f, 23.213327f, 30.271582f);
generalPath.curveTo(23.27358f, 30.211037f, 23.356464f, 30.180763f, 23.461979f, 30.180761f);
generalPath.moveTo(23.92842f, 30.192665f);
generalPath.lineTo(24.117994f, 30.192665f);
generalPath.lineTo(24.357388f, 30.644117f);
generalPath.lineTo(24.357388f, 30.192665f);
generalPath.lineTo(24.518305f, 30.192665f);
generalPath.lineTo(24.518305f, 30.850885f);
generalPath.lineTo(24.32873f, 30.850885f);
generalPath.lineTo(24.089338f, 30.399433f);
generalPath.lineTo(24.089338f, 30.850885f);
generalPath.lineTo(23.92842f, 30.850885f);
generalPath.lineTo(23.92842f, 30.192665f);
generalPath.moveTo(24.59149f, 30.192665f);
generalPath.lineTo(24.777096f, 30.192665f);
generalPath.lineTo(24.92699f, 30.42721f);
generalPath.lineTo(25.076887f, 30.192665f);
generalPath.lineTo(25.262936f, 30.192665f);
generalPath.lineTo(25.01208f, 30.573578f);
generalPath.lineTo(25.01208f, 30.850885f);
generalPath.lineTo(24.842344f, 30.850885f);
generalPath.lineTo(24.842344f, 30.573578f);
generalPath.lineTo(24.59149f, 30.192665f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(74, 74, 74, 255)) : new Color(74, 74, 74, 255);
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
generalPath.moveTo(32.80312f, 13.315819f);
generalPath.curveTo(34.47257f, 20.995363f, 29.513748f, 25.45455f, 21.3557f, 20.989296f);
generalPath.curveTo(21.982796f, 23.339367f, 23.622335f, 25.369877f, 26.108051f, 26.170364f);
generalPath.curveTo(29.996363f, 27.422537f, 34.167355f, 25.283571f, 35.41953f, 21.395262f);
generalPath.curveTo(36.407272f, 18.32807f, 35.229874f, 15.16364f, 32.80312f, 13.315819f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(252, 233, 79, 255)) : new Color(252, 233, 79, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(237, 212, 0, 255)) : new Color(237, 212, 0, 255);
stroke = new BasicStroke(0.9999996f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.80312f, 13.315819f);
generalPath.curveTo(34.47257f, 20.995363f, 29.513748f, 25.45455f, 21.3557f, 20.989296f);
generalPath.curveTo(21.982796f, 23.339367f, 23.622335f, 25.369877f, 26.108051f, 26.170364f);
generalPath.curveTo(29.996363f, 27.422537f, 34.167355f, 25.283571f, 35.41953f, 21.395262f);
generalPath.curveTo(36.407272f, 18.32807f, 35.229874f, 15.16364f, 32.80312f, 13.315819f);
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
generalPath.moveTo(17.854446f, 13.970486f);
generalPath.curveTo(17.857279f, 14.603931f, 17.520966f, 15.1904745f, 16.972853f, 15.5080185f);
generalPath.curveTo(16.42474f, 15.825562f, 15.748619f, 15.825562f, 15.200506f, 15.5080185f);
generalPath.curveTo(14.652394f, 15.1904745f, 14.316081f, 14.603931f, 14.318913f, 13.970486f);
generalPath.curveTo(14.316081f, 13.33704f, 14.652394f, 12.750497f, 15.200506f, 12.432953f);
generalPath.curveTo(15.748619f, 12.11541f, 16.42474f, 12.11541f, 16.972853f, 12.432953f);
generalPath.curveTo(17.520966f, 12.750497f, 17.857279f, 13.33704f, 17.854446f, 13.970486f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(254, 233, 100, 255)) : new Color(254, 233, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 233, 100, 0)) : new Color(254, 233, 100, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(16.970564f, 11.584001f);
generalPath.lineTo(13.930592f, 11.85101f);
generalPath.lineTo(13.611806f, 14.942758f);
generalPath.lineTo(13.344797f, 11.902786f);
generalPath.lineTo(10.253049f, 11.584001f);
generalPath.lineTo(13.29302f, 11.316992f);
generalPath.lineTo(13.611806f, 8.225244f);
generalPath.lineTo(13.878815f, 11.265215f);
generalPath.lineTo(16.970564f, 11.584001f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
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
generalPath.moveTo(17.854446f, 13.970486f);
generalPath.curveTo(17.857279f, 14.603931f, 17.520966f, 15.1904745f, 16.972853f, 15.5080185f);
generalPath.curveTo(16.42474f, 15.825562f, 15.748619f, 15.825562f, 15.200506f, 15.5080185f);
generalPath.curveTo(14.652394f, 15.1904745f, 14.316081f, 14.603931f, 14.318913f, 13.970486f);
generalPath.curveTo(14.316081f, 13.33704f, 14.652394f, 12.750497f, 15.200506f, 12.432953f);
generalPath.curveTo(15.748619f, 12.11541f, 16.42474f, 12.11541f, 16.972853f, 12.432953f);
generalPath.curveTo(17.520966f, 12.750497f, 17.857279f, 13.33704f, 17.854446f, 13.970486f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(254, 233, 100, 255)) : new Color(254, 233, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 233, 100, 0)) : new Color(254, 233, 100, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(16.970564f, 11.584001f);
generalPath.lineTo(13.930592f, 11.85101f);
generalPath.lineTo(13.611806f, 14.942758f);
generalPath.lineTo(13.344797f, 11.902786f);
generalPath.lineTo(10.253049f, 11.584001f);
generalPath.lineTo(13.29302f, 11.316992f);
generalPath.lineTo(13.611806f, 8.225244f);
generalPath.lineTo(13.878815f, 11.265215f);
generalPath.lineTo(16.970564f, 11.584001f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
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
generalPath.moveTo(17.854446f, 13.970486f);
generalPath.curveTo(17.857279f, 14.603931f, 17.520966f, 15.1904745f, 16.972853f, 15.5080185f);
generalPath.curveTo(16.42474f, 15.825562f, 15.748619f, 15.825562f, 15.200506f, 15.5080185f);
generalPath.curveTo(14.652394f, 15.1904745f, 14.316081f, 14.603931f, 14.318913f, 13.970486f);
generalPath.curveTo(14.316081f, 13.33704f, 14.652394f, 12.750497f, 15.200506f, 12.432953f);
generalPath.curveTo(15.748619f, 12.11541f, 16.42474f, 12.11541f, 16.972853f, 12.432953f);
generalPath.curveTo(17.520966f, 12.750497f, 17.857279f, 13.33704f, 17.854446f, 13.970486f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(254, 233, 100, 255)) : new Color(254, 233, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 233, 100, 0)) : new Color(254, 233, 100, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(16.970564f, 11.584001f);
generalPath.lineTo(13.930592f, 11.85101f);
generalPath.lineTo(13.611806f, 14.942758f);
generalPath.lineTo(13.344797f, 11.902786f);
generalPath.lineTo(10.253049f, 11.584001f);
generalPath.lineTo(13.29302f, 11.316992f);
generalPath.lineTo(13.611806f, 8.225244f);
generalPath.lineTo(13.878815f, 11.265215f);
generalPath.lineTo(16.970564f, 11.584001f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
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
generalPath.moveTo(17.854446f, 13.970486f);
generalPath.curveTo(17.857279f, 14.603931f, 17.520966f, 15.1904745f, 16.972853f, 15.5080185f);
generalPath.curveTo(16.42474f, 15.825562f, 15.748619f, 15.825562f, 15.200506f, 15.5080185f);
generalPath.curveTo(14.652394f, 15.1904745f, 14.316081f, 14.603931f, 14.318913f, 13.970486f);
generalPath.curveTo(14.316081f, 13.33704f, 14.652394f, 12.750497f, 15.200506f, 12.432953f);
generalPath.curveTo(15.748619f, 12.11541f, 16.42474f, 12.11541f, 16.972853f, 12.432953f);
generalPath.curveTo(17.520966f, 12.750497f, 17.857279f, 13.33704f, 17.854446f, 13.970486f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(254, 233, 100, 255)) : new Color(254, 233, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 233, 100, 0)) : new Color(254, 233, 100, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(16.970564f, 11.584001f);
generalPath.lineTo(13.930592f, 11.85101f);
generalPath.lineTo(13.611806f, 14.942758f);
generalPath.lineTo(13.344797f, 11.902786f);
generalPath.lineTo(10.253049f, 11.584001f);
generalPath.lineTo(13.29302f, 11.316992f);
generalPath.lineTo(13.611806f, 8.225244f);
generalPath.lineTo(13.878815f, 11.265215f);
generalPath.lineTo(16.970564f, 11.584001f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       Preferences_desktop_screensaver base = new Preferences_desktop_screensaver();
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
        return Preferences_desktop_screensaver::new;
    }
}

