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
public class computer implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.3689320087432861f, -1.978553056716919f, -13.617130279541016f));
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 57.533390045166016f, 3.2034270763397217f));
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
g.transform(new AffineTransform(0.9402729868888855f, 0.0f, 0.0f, 0.9402729868888855f, 55.40361022949219f, 4.271193981170654f));
// _0_0_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(123, 127, 122, 255)) : new Color(123, 127, 122, 255);
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
g.transform(new AffineTransform(0.9402729868888855f, 0.0f, 0.0f, 0.9402729868888855f, 55.40361022949219f, 3.5211939811706543f));
// _0_0_3
paint = new LinearGradientPaint(new Point2D.Double(-23.885700225830078, 49.9530029296875), new Point2D.Double(-23.885700225830078, 44.878883361816406), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(216, 223, 214, 255)) : new Color(216, 223, 214, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 223, 214, 0)) : new Color(216, 223, 214, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.4928749799728394f, 0.0f, 0.0f, 0.6698480248451233f, 0.0f, 0.0f));
stroke = new BasicStroke(0.6806534f,0,0,4.0f,null,0.0f);
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
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.6875f, 28.766243f);
generalPath.lineTo(25.625f, 29.766243f);
generalPath.curveTo(25.625f, 29.766243f, 29.949108f, 33.36541f, 34.625f, 33.96875f);
generalPath.curveTo(36.962948f, 34.27042f, 39.378674f, 34.67116f, 41.375f, 35.15625f);
generalPath.curveTo(43.371326f, 35.64134f, 44.963356f, 36.275856f, 45.5f, 36.8125f);
generalPath.curveTo(45.81041f, 37.12291f, 45.95106f, 37.38614f, 46.0f, 37.59375f);
generalPath.curveTo(46.04894f, 37.80136f, 46.038216f, 37.948566f, 45.90625f, 38.15625f);
generalPath.curveTo(45.64232f, 38.57162f, 44.826393f, 39.1239f, 43.4375f, 39.5625f);
generalPath.curveTo(40.659714f, 40.439693f, 35.717075f, 41.0f, 28.875f, 41.0f);
generalPath.lineTo(28.875f, 42.0f);
generalPath.curveTo(35.770996f, 42.0f, 40.738667f, 41.47233f, 43.71875f, 40.53125f);
generalPath.curveTo(45.208794f, 40.06071f, 46.24369f, 39.515564f, 46.75f, 38.71875f);
generalPath.curveTo(47.003155f, 38.320343f, 47.107323f, 37.8303f, 47.0f, 37.375f);
generalPath.curveTo(46.892677f, 36.9197f, 46.615444f, 36.490444f, 46.21875f, 36.09375f);
generalPath.curveTo(45.34118f, 35.21618f, 43.68191f, 34.68731f, 41.625f, 34.1875f);
generalPath.curveTo(39.56809f, 33.68769f, 37.109264f, 33.27317f, 34.75f, 32.96875f);
generalPath.curveTo(30.031473f, 32.35991f, 25.6875f, 28.766243f, 25.6875f, 28.766243f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(208, 208, 208, 255)) : new Color(208, 208, 208, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(151, 151, 151, 255)) : new Color(151, 151, 151, 255);
stroke = new BasicStroke(0.4f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.6875f, 28.766243f);
generalPath.lineTo(25.625f, 29.766243f);
generalPath.curveTo(25.625f, 29.766243f, 29.949108f, 33.36541f, 34.625f, 33.96875f);
generalPath.curveTo(36.962948f, 34.27042f, 39.378674f, 34.67116f, 41.375f, 35.15625f);
generalPath.curveTo(43.371326f, 35.64134f, 44.963356f, 36.275856f, 45.5f, 36.8125f);
generalPath.curveTo(45.81041f, 37.12291f, 45.95106f, 37.38614f, 46.0f, 37.59375f);
generalPath.curveTo(46.04894f, 37.80136f, 46.038216f, 37.948566f, 45.90625f, 38.15625f);
generalPath.curveTo(45.64232f, 38.57162f, 44.826393f, 39.1239f, 43.4375f, 39.5625f);
generalPath.curveTo(40.659714f, 40.439693f, 35.717075f, 41.0f, 28.875f, 41.0f);
generalPath.lineTo(28.875f, 42.0f);
generalPath.curveTo(35.770996f, 42.0f, 40.738667f, 41.47233f, 43.71875f, 40.53125f);
generalPath.curveTo(45.208794f, 40.06071f, 46.24369f, 39.515564f, 46.75f, 38.71875f);
generalPath.curveTo(47.003155f, 38.320343f, 47.107323f, 37.8303f, 47.0f, 37.375f);
generalPath.curveTo(46.892677f, 36.9197f, 46.615444f, 36.490444f, 46.21875f, 36.09375f);
generalPath.curveTo(45.34118f, 35.21618f, 43.68191f, 34.68731f, 41.625f, 34.1875f);
generalPath.curveTo(39.56809f, 33.68769f, 37.109264f, 33.27317f, 34.75f, 32.96875f);
generalPath.curveTo(30.031473f, 32.35991f, 25.6875f, 28.766243f, 25.6875f, 28.766243f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.3689320087432861f, -1.978553056716919f, -19.021259307861328f));
// _0_0_5
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
shape = new Rectangle2D.Double(17.472396850585938, 30.703611373901367, 9.0396728515625, 2.7400388717651367);
paint = new LinearGradientPaint(new Point2D.Double(12.206708908081055, 53.53514099121094), new Point2D.Double(12.127711296081543, 64.89252471923828), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(88, 89, 86, 255)) : new Color(88, 89, 86, 255)),((colorFilter != null) ? colorFilter.filter(new Color(187, 190, 184, 255)) : new Color(187, 190, 184, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.816344976425171f, 0.0f, 0.0f, 0.5505560040473938f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(7.0809026f, 1.6956221f);
generalPath.lineTo(36.669098f, 1.6956221f);
generalPath.curveTo(37.58044f, 1.6956221f, 38.293243f, 2.279104f, 38.33585f, 3.0972092f);
generalPath.lineTo(39.667892f, 28.675323f);
generalPath.curveTo(39.7261f, 29.793058f, 38.766838f, 30.695627f, 37.647587f, 30.695627f);
generalPath.lineTo(6.102412f, 30.695627f);
generalPath.curveTo(4.983163f, 30.695627f, 4.023898f, 29.793058f, 4.0821066f, 28.675323f);
generalPath.lineTo(5.4141507f, 3.0972092f);
generalPath.curveTo(5.4544344f, 2.3236744f, 5.961653f, 1.6956221f, 7.0809026f, 1.6956221f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(8.611623764038086, 7.229358196258545), new Point2D.Double(34.78447341918945, 33.339786529541016), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(221, 225, 217, 255)) : new Color(221, 225, 217, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 205, 198, 255)) : new Color(202, 205, 198, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1298630237579346f, 0.0f, 0.0f, 0.8850629925727844f, -1.625f, -1.304371953010559f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(10.390737533569336, 5.381774425506592), new Point2D.Double(32.53682327270508, 31.24605369567871), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(143, 143, 143, 255)) : new Color(143, 143, 143, 255)),((colorFilter != null) ? colorFilter.filter(new Color(73, 73, 73, 255)) : new Color(73, 73, 73, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1043970584869385f, 0.0f, 0.0f, 0.9054710268974304f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.0809026f, 1.6956221f);
generalPath.lineTo(36.669098f, 1.6956221f);
generalPath.curveTo(37.58044f, 1.6956221f, 38.293243f, 2.279104f, 38.33585f, 3.0972092f);
generalPath.lineTo(39.667892f, 28.675323f);
generalPath.curveTo(39.7261f, 29.793058f, 38.766838f, 30.695627f, 37.647587f, 30.695627f);
generalPath.lineTo(6.102412f, 30.695627f);
generalPath.curveTo(4.983163f, 30.695627f, 4.023898f, 29.793058f, 4.0821066f, 28.675323f);
generalPath.lineTo(5.4141507f, 3.0972092f);
generalPath.curveTo(5.4544344f, 2.3236744f, 5.961653f, 1.6956221f, 7.0809026f, 1.6956221f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(8.410535f, 4.305827f);
generalPath.lineTo(7.1683397f, 26.351145f);
generalPath.lineTo(34.81873f, 26.351145f);
generalPath.lineTo(33.48371f, 4.3992558f);
generalPath.lineTo(8.410535f, 4.305827f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(19.1503963470459, 32.62223815917969), new Point2D.Double(16.315818786621094, 8.866622924804688), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(91, 91, 151, 255)) : new Color(91, 91, 151, 255)),((colorFilter != null) ? colorFilter.filter(new Color(27, 27, 67, 255)) : new Color(27, 27, 67, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1741390228271484f, 0.0f, 0.0f, 0.9454309940338135f, 0.7218250036239624f, -1.3315240144729614f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 121, 255)) : new Color(0, 0, 121, 255);
stroke = new BasicStroke(0.5f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.410535f, 4.305827f);
generalPath.lineTo(7.1683397f, 26.351145f);
generalPath.lineTo(34.81873f, 26.351145f);
generalPath.lineTo(33.48371f, 4.3992558f);
generalPath.lineTo(8.410535f, 4.305827f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
paint = new LinearGradientPaint(new Point2D.Double(3.7069976329803467, 171.2913360595703), new Point2D.Double(3.7069973945617676, 162.4506072998047), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 63)) : new Color(0, 0, 0, 63)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(5.7051591873168945f, 0.0f, 0.0f, 0.17528000473976135f, 1.0f, -0.679373025894165f));
stroke = new BasicStroke(0.9961812f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.177433f, 28.735788f);
generalPath.lineTo(37.60591f, 28.735788f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new LinearGradientPaint(new Point2D.Double(17.698339462280273, 13.004725456237793), new Point2D.Double(34.97454833984375, 55.20075607299805), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 179)) : new Color(255, 255, 255, 179)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1080689430236816f, 0.0f, 0.0f, 0.9024710059165955f, 1.0f, 1.0f));
stroke = new BasicStroke(0.99999964f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.9145985f, 2.7063396f);
generalPath.lineTo(36.7601f, 2.6685383f);
generalPath.curveTo(37.043797f, 2.668179f, 37.319405f, 2.9057882f, 37.342205f, 3.321082f);
generalPath.lineTo(38.704098f, 28.12433f);
generalPath.curveTo(38.76214f, 29.18136f, 38.16435f, 29.9102f, 37.10573f, 29.9102f);
generalPath.lineTo(6.5817585f, 29.9102f);
generalPath.curveTo(5.5231357f, 29.9102f, 4.988744f, 29.18141f, 5.045887f, 28.12433f);
generalPath.lineTo(6.3699775f, 3.6301632f);
generalPath.curveTo(6.4086733f, 2.9143326f, 6.5363626f, 2.7068188f, 6.9145985f, 2.7063396f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5314286f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.711536f, 4.7463627f);
generalPath.lineTo(7.909007f, 22.616693f);
generalPath.curveTo(18.953646f, 20.216063f, 19.33047f, 12.124494f, 33.063038f, 9.469943f);
generalPath.lineTo(32.901566f, 4.8124266f);
generalPath.lineTo(8.711536f, 4.7463627f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(11.492236137390137, 1.6537576913833618), new Point2D.Double(17.199417114257812, 26.729263305664062), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 252, 255, 0)) : new Color(252, 252, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2389769554138184f, 0.0f, 0.0f, 0.8959550261497498f, 0.5905529856681824f, -1.3315240144729614f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.2643979787826538f, 0.0f, 0.0f, 1.2912620306015015f, -6.216331958770752f, -4.000422954559326f));
// _0_0_12
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.462184f, 36.81745f);
generalPath.lineTo(37.46459f, 36.81745f);
generalPath.curveTo(38.58384f, 36.81745f, 38.441944f, 37.08889f, 38.556816f, 37.430298f);
generalPath.lineTo(41.391464f, 45.855106f);
generalPath.curveTo(41.506336f, 46.196518f, 41.418484f, 46.467953f, 40.299236f, 46.467953f);
generalPath.lineTo(3.6275382f, 46.467953f);
generalPath.curveTo(2.508289f, 46.467953f, 2.4204388f, 46.196518f, 2.5353107f, 45.855106f);
generalPath.lineTo(5.3699565f, 37.430298f);
generalPath.curveTo(5.4848285f, 37.08889f, 5.3429346f, 36.81745f, 6.462184f, 36.81745f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.316999435424805, 48.64323425292969), new Point2D.Double(18.1767520904541, 52.536460876464844), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(221, 225, 217, 255)) : new Color(221, 225, 217, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 205, 198, 255)) : new Color(202, 205, 198, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1298630237579346f, 0.0f, 0.0f, 0.8850629925727844f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(10.390737533569336, 5.381774425506592), new Point2D.Double(32.53682327270508, 31.24605369567871), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(143, 143, 143, 255)) : new Color(143, 143, 143, 255)),((colorFilter != null) ? colorFilter.filter(new Color(73, 73, 73, 255)) : new Color(73, 73, 73, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1043970584869385f, 0.0f, 0.0f, 0.9054710268974304f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.462184f, 36.81745f);
generalPath.lineTo(37.46459f, 36.81745f);
generalPath.curveTo(38.58384f, 36.81745f, 38.441944f, 37.08889f, 38.556816f, 37.430298f);
generalPath.lineTo(41.391464f, 45.855106f);
generalPath.curveTo(41.506336f, 46.196518f, 41.418484f, 46.467953f, 40.299236f, 46.467953f);
generalPath.lineTo(3.6275382f, 46.467953f);
generalPath.curveTo(2.508289f, 46.467953f, 2.4204388f, 46.196518f, 2.5353107f, 45.855106f);
generalPath.lineTo(5.3699565f, 37.430298f);
generalPath.curveTo(5.4848285f, 37.08889f, 5.3429346f, 36.81745f, 6.462184f, 36.81745f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.3916893f, 38.829113f);
generalPath.lineTo(4.6239223f, 43.95564f);
generalPath.lineTo(10.104f, 43.95564f);
generalPath.lineTo(10.63433f, 41.922707f);
generalPath.lineTo(25.483572f, 41.922707f);
generalPath.lineTo(26.03325f, 43.99782f);
generalPath.lineTo(32.201084f, 43.99782f);
generalPath.lineTo(30.521708f, 38.829113f);
generalPath.lineTo(6.3916893f, 38.829113f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(122, 125, 119, 255)) : new Color(122, 125, 119, 255);
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
generalPath.moveTo(11.076272f, 42.27626f);
generalPath.lineTo(10.63433f, 43.95564f);
generalPath.lineTo(25.395184f, 43.95564f);
generalPath.lineTo(24.953241f, 42.187874f);
generalPath.lineTo(11.076272f, 42.27626f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(119, 120, 116, 255)) : new Color(119, 120, 116, 255);
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
generalPath.moveTo(37.592777f, 38.829113f);
generalPath.lineTo(39.272156f, 43.86725f);
generalPath.lineTo(33.792076f, 43.778862f);
generalPath.lineTo(32.289474f, 38.917503f);
generalPath.lineTo(37.592777f, 38.829113f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(119, 122, 117, 255)) : new Color(119, 122, 117, 255);
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
generalPath.moveTo(37.592777f, 38.298786f);
generalPath.lineTo(39.272156f, 43.33692f);
generalPath.lineTo(33.792076f, 43.24853f);
generalPath.lineTo(32.289474f, 38.387173f);
generalPath.lineTo(37.592777f, 38.298786f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(8.113424301147461, 88.50907135009766), new Point2D.Double(8.113423347473145, 100.20014953613281), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(157, 157, 157, 255)) : new Color(157, 157, 157, 255)),((colorFilter != null) ? colorFilter.filter(new Color(185, 185, 185, 255)) : new Color(185, 185, 185, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.3098509311676025f, 0.0f, 0.0f, 0.4329279959201813f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.3916893f, 38.210396f);
generalPath.lineTo(4.6239223f, 43.33692f);
generalPath.lineTo(10.104f, 43.33692f);
generalPath.lineTo(10.63433f, 41.30399f);
generalPath.lineTo(25.483572f, 41.30399f);
generalPath.lineTo(26.03325f, 43.379105f);
generalPath.lineTo(32.201084f, 43.379105f);
generalPath.lineTo(30.521708f, 38.210396f);
generalPath.lineTo(6.3916893f, 38.210396f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(8.113424301147461, 88.50907135009766), new Point2D.Double(8.113423347473145, 100.20014953613281), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(157, 157, 157, 255)) : new Color(157, 157, 157, 255)),((colorFilter != null) ? colorFilter.filter(new Color(185, 185, 185, 255)) : new Color(185, 185, 185, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.3098509311676025f, 0.0f, 0.0f, 0.4329279959201813f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.076272f, 41.745934f);
generalPath.lineTo(10.63433f, 43.425312f);
generalPath.lineTo(25.395184f, 43.425312f);
generalPath.lineTo(24.953241f, 41.657543f);
generalPath.lineTo(11.076272f, 41.745934f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(8.113424301147461, 88.50907135009766), new Point2D.Double(8.113423347473145, 100.20014953613281), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(157, 157, 157, 255)) : new Color(157, 157, 157, 255)),((colorFilter != null) ? colorFilter.filter(new Color(185, 185, 185, 255)) : new Color(185, 185, 185, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.3098509311676025f, 0.0f, 0.0f, 0.4329279959201813f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_20
paint = new LinearGradientPaint(new Point2D.Double(13.62870979309082, 101.28459930419922), new Point2D.Double(8.6485013961792, 74.09800720214844), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(249, 255, 245, 255)) : new Color(249, 255, 245, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 255, 245, 0)) : new Color(249, 255, 245, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.143634080886841f, 0.0f, 0.0f, 0.4664979875087738f, 1.0f, -0.5088260173797607f));
stroke = new BasicStroke(0.5f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.127819f, 37.578117f);
generalPath.lineTo(37.953632f, 37.578117f);
generalPath.lineTo(40.590813f, 45.670677f);
generalPath.lineTo(3.329743f, 45.670677f);
generalPath.lineTo(6.127819f, 37.578117f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -10.419329643249512f, 2.8538661003112793f));
// _0_0_21
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
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -10.305729866027832f, 4.959650993347168f));
// _0_0_22
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
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -10.192130088806152f, 6.959650993347168f));
// _0_0_23
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
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -10.078530311584473f, 8.959650993347168f));
// _0_0_24
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
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -9.964929580688477f, 10.959650039672852f));
// _0_0_25
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
// _0_0_26
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.0f, 27.317665f);
generalPath.lineTo(20.281715f, 27.317665f);
generalPath.curveTo(20.36548f, 27.317667f, 20.4297f, 27.33633f, 20.474377f, 27.373655f);
generalPath.curveTo(20.519344f, 27.41069f, 20.541828f, 27.463594f, 20.54183f, 27.53237f);
generalPath.curveTo(20.541828f, 27.60144f, 20.519344f, 27.654638f, 20.474377f, 27.691965f);
generalPath.curveTo(20.4297f, 27.728998f, 20.36548f, 27.747515f, 20.281715f, 27.747515f);
generalPath.lineTo(20.169735f, 27.747515f);
generalPath.lineTo(20.169735f, 27.975885f);
generalPath.lineTo(20.0f, 27.975885f);
generalPath.lineTo(20.0f, 27.317665f);
generalPath.moveTo(20.169735f, 27.440668f);
generalPath.lineTo(20.169735f, 27.624512f);
generalPath.lineTo(20.26364f, 27.624512f);
generalPath.curveTo(20.296558f, 27.624512f, 20.321981f, 27.616575f, 20.33991f, 27.600704f);
generalPath.curveTo(20.35784f, 27.58454f, 20.366804f, 27.561762f, 20.366804f, 27.53237f);
generalPath.curveTo(20.366804f, 27.50298f, 20.35784f, 27.480349f, 20.33991f, 27.464476f);
generalPath.curveTo(20.321981f, 27.448605f, 20.296558f, 27.440668f, 20.26364f, 27.440668f);
generalPath.lineTo(20.169735f, 27.440668f);
generalPath.moveTo(20.961979f, 27.428764f);
generalPath.curveTo(20.91025f, 27.428766f, 20.87013f, 27.44787f, 20.841621f, 27.486078f);
generalPath.curveTo(20.813112f, 27.524288f, 20.798857f, 27.578074f, 20.798857f, 27.647436f);
generalPath.curveTo(20.798857f, 27.716507f, 20.813112f, 27.770145f, 20.841621f, 27.808355f);
generalPath.curveTo(20.87013f, 27.846563f, 20.91025f, 27.865667f, 20.961979f, 27.865667f);
generalPath.curveTo(21.014002f, 27.865667f, 21.054268f, 27.846563f, 21.082779f, 27.808355f);
generalPath.curveTo(21.111286f, 27.770145f, 21.125542f, 27.716507f, 21.125542f, 27.647436f);
generalPath.curveTo(21.125542f, 27.578074f, 21.111286f, 27.524288f, 21.082779f, 27.486078f);
generalPath.curveTo(21.054268f, 27.44787f, 21.014002f, 27.428766f, 20.961979f, 27.428764f);
generalPath.moveTo(20.961979f, 27.305761f);
generalPath.curveTo(21.067787f, 27.305763f, 21.150671f, 27.336037f, 21.21063f, 27.396582f);
generalPath.curveTo(21.270588f, 27.457129f, 21.300568f, 27.540747f, 21.300568f, 27.647436f);
generalPath.curveTo(21.300568f, 27.753834f, 21.270588f, 27.837305f, 21.21063f, 27.897852f);
generalPath.curveTo(21.150671f, 27.958399f, 21.067787f, 27.98867f, 20.961979f, 27.98867f);
generalPath.curveTo(20.856464f, 27.98867f, 20.77358f, 27.958399f, 20.713327f, 27.897852f);
generalPath.curveTo(20.65337f, 27.837305f, 20.62339f, 27.753834f, 20.62339f, 27.647436f);
generalPath.curveTo(20.62339f, 27.540747f, 20.65337f, 27.457129f, 20.713327f, 27.396582f);
generalPath.curveTo(20.77358f, 27.336037f, 20.856464f, 27.305763f, 20.961979f, 27.305761f);
generalPath.moveTo(21.42842f, 27.317665f);
generalPath.lineTo(21.617994f, 27.317665f);
generalPath.lineTo(21.857388f, 27.769117f);
generalPath.lineTo(21.857388f, 27.317665f);
generalPath.lineTo(22.018305f, 27.317665f);
generalPath.lineTo(22.018305f, 27.975885f);
generalPath.lineTo(21.82873f, 27.975885f);
generalPath.lineTo(21.589338f, 27.524433f);
generalPath.lineTo(21.589338f, 27.975885f);
generalPath.lineTo(21.42842f, 27.975885f);
generalPath.lineTo(21.42842f, 27.317665f);
generalPath.moveTo(22.09149f, 27.317665f);
generalPath.lineTo(22.277096f, 27.317665f);
generalPath.lineTo(22.42699f, 27.55221f);
generalPath.lineTo(22.576887f, 27.317665f);
generalPath.lineTo(22.762936f, 27.317665f);
generalPath.lineTo(22.51208f, 27.698578f);
generalPath.lineTo(22.51208f, 27.975885f);
generalPath.lineTo(22.342344f, 27.975885f);
generalPath.lineTo(22.342344f, 27.698578f);
generalPath.lineTo(22.09149f, 27.317665f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(74, 74, 74, 255)) : new Color(74, 74, 74, 255);
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
        return 1.9125070571899414;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 1.1956220865249634;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 45.403358459472656;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 46.232242584228516;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private computer() {
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
       computer base = new computer();
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
       computer base = new computer();
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
        return computer::new;
    }
}

