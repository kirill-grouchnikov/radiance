package org.pushingpixels.radiance.demo.component.svg.tango.transcoded;

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
public class Help_browser implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.6306818f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.1738029718399048f, 0.0f, 0.0f, 0.6000000238418579f, -5.004403114318848f, 20.325000762939453f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.875f, 36.75f);
generalPath.curveTo(40.900238f, 40.109352f, 37.90384f, 43.21997f, 33.020405f, 44.904f);
generalPath.curveTo(28.136969f, 46.588028f, 22.113031f, 46.588028f, 17.229597f, 44.904f);
generalPath.curveTo(12.346162f, 43.21997f, 9.34976f, 40.109352f, 9.375f, 36.75f);
generalPath.curveTo(9.34976f, 33.390648f, 12.346162f, 30.28003f, 17.229597f, 28.596f);
generalPath.curveTo(22.113031f, 26.911972f, 28.136969f, 26.911972f, 33.020405f, 28.596f);
generalPath.curveTo(37.90384f, 30.28003f, 40.900238f, 33.390648f, 40.875f, 36.75f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(25.125, 36.75), 15.75f, new Point2D.Double(25.125, 36.75), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5952379703521729f, 3.369686058403963E-16f, 14.875f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9384419918060303f, 0.0f, 0.0f, 0.9386799931526184f, 1.564074993133545f, 1.6339060068130493f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.785164f, 23.825787f);
generalPath.curveTo(45.82022f, 31.664677f, 41.65834f, 38.923157f, 34.875446f, 42.852757f);
generalPath.curveTo(28.09255f, 46.782352f, 19.725546f, 46.782352f, 12.942651f, 42.852757f);
generalPath.curveTo(6.1597557f, 38.923157f, 1.9978756f, 31.664677f, 2.0329323f, 23.825787f);
generalPath.curveTo(1.9978756f, 15.986897f, 6.1597557f, 8.728418f, 12.942651f, 4.7988186f);
generalPath.curveTo(19.725546f, 0.8692189f, 28.09255f, 0.8692189f, 34.875446f, 4.7988186f);
generalPath.curveTo(41.65834f, 8.728418f, 45.82022f, 15.986897f, 45.785164f, 23.825787f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(26.544321060180664, 28.458724975585938), 22.376116f, new Point2D.Double(26.544321060180664, 28.458724975585938), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(156, 188, 222, 255)) : new Color(156, 188, 222, 255)),((colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 255)) : new Color(32, 74, 135, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.238342046737671f, 0.005954845808446407f, -0.006507761776447296f, 1.3512719869613647f, -6.992513179779053f, -9.744841575622559f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 255)) : new Color(32, 74, 135, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.785164f, 23.825787f);
generalPath.curveTo(45.82022f, 31.664677f, 41.65834f, 38.923157f, 34.875446f, 42.852757f);
generalPath.curveTo(28.09255f, 46.782352f, 19.725546f, 46.782352f, 12.942651f, 42.852757f);
generalPath.curveTo(6.1597557f, 38.923157f, 1.9978756f, 31.664677f, 2.0329323f, 23.825787f);
generalPath.curveTo(1.9978756f, 15.986897f, 6.1597557f, 8.728418f, 12.942651f, 4.7988186f);
generalPath.curveTo(19.725546f, 0.8692189f, 28.09255f, 0.8692189f, 34.875446f, 4.7988186f);
generalPath.curveTo(41.65834f, 8.728418f, 45.82022f, 15.986897f, 45.785164f, 23.825787f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.96022725f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.8551030158996582f, 0.0f, 0.0f, 0.8552129864692688f, 3.555288076400757f, 3.625019073486328f));
// _0_0_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(3.0307744f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.785164f, 23.825787f);
generalPath.curveTo(45.82022f, 31.664677f, 41.65834f, 38.923157f, 34.875446f, 42.852757f);
generalPath.curveTo(28.09255f, 46.782352f, 19.725546f, 46.782352f, 12.942651f, 42.852757f);
generalPath.curveTo(6.1597557f, 38.923157f, 1.9978756f, 31.664677f, 2.0329323f, 23.825787f);
generalPath.curveTo(1.9978756f, 15.986897f, 6.1597557f, 8.728418f, 12.942651f, 4.7988186f);
generalPath.curveTo(19.725546f, 0.8692189f, 28.09255f, 0.8692189f, 34.875446f, 4.7988186f);
generalPath.curveTo(41.65834f, 8.728418f, 45.82022f, 15.986897f, 45.785164f, 23.825787f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.8498950004577637f, 0.0f, 0.0f, 0.8352050185203552f, 41.72980880737305f, 8.548327445983887f));
// _0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-20.25f, 5.875f);
generalPath.curveTo(-21.30902f, 5.875026f, -22.397636f, 5.9982357f, -23.53125f, 6.21875f);
generalPath.curveTo(-24.664175f, 6.4391785f, -25.911411f, 6.756263f, -27.28125f, 7.21875f);
generalPath.curveTo(-27.291632f, 7.21754f, -27.302118f, 7.21754f, -27.3125f, 7.21875f);
generalPath.curveTo(-27.324562f, 7.227379f, -27.335121f, 7.237937f, -27.34375f, 7.25f);
generalPath.curveTo(-27.355812f, 7.258629f, -27.366371f, 7.269187f, -27.375f, 7.28125f);
generalPath.curveTo(-27.37621f, 7.2916317f, -27.37621f, 7.302119f, -27.375f, 7.3125f);
generalPath.curveTo(-27.37621f, 7.3228817f, -27.37621f, 7.333369f, -27.375f, 7.34375f);
generalPath.lineTo(-27.375f, 12.5f);
generalPath.curveTo(-27.37621f, 12.510382f, -27.37621f, 12.520868f, -27.375f, 12.53125f);
generalPath.curveTo(-27.37621f, 12.541632f, -27.37621f, 12.552118f, -27.375f, 12.5625f);
generalPath.curveTo(-27.366371f, 12.574563f, -27.355812f, 12.585121f, -27.34375f, 12.59375f);
generalPath.curveTo(-27.335121f, 12.605813f, -27.324562f, 12.616371f, -27.3125f, 12.625f);
generalPath.curveTo(-27.302118f, 12.62621f, -27.291632f, 12.62621f, -27.28125f, 12.625f);
generalPath.curveTo(-27.270868f, 12.62621f, -27.260382f, 12.62621f, -27.25f, 12.625f);
generalPath.curveTo(-27.239618f, 12.62621f, -27.229132f, 12.62621f, -27.21875f, 12.625f);
generalPath.curveTo(-27.208368f, 12.62621f, -27.197882f, 12.62621f, -27.1875f, 12.625f);
generalPath.curveTo(-26.045061f, 11.905957f, -24.954147f, 11.357862f, -23.90625f, 11.0f);
generalPath.curveTo(-22.858109f, 10.631244f, -21.863134f, 10.437521f, -20.96875f, 10.4375f);
generalPath.curveTo(-20.019531f, 10.437521f, -19.323826f, 10.648045f, -18.8125f, 11.0625f);
generalPath.curveTo(-18.303778f, 11.46459f, -18.031261f, 12.04554f, -18.03125f, 12.78125f);
generalPath.curveTo(-18.03126f, 13.261907f, -18.175438f, 13.73266f, -18.46875f, 14.21875f);
generalPath.curveTo(-18.751741f, 14.705766f, -19.209015f, 15.249245f, -19.84375f, 15.8125f);
generalPath.lineTo(-20.9375f, 16.75f);
generalPath.curveTo(-22.13896f, 17.83049f, -22.926743f, 18.741022f, -23.3125f, 19.46875f);
generalPath.curveTo(-23.695614f, 20.180197f, -23.875006f, 20.988073f, -23.875f, 21.90625f);
generalPath.lineTo(-23.875f, 22.71875f);
generalPath.curveTo(-23.87621f, 22.729132f, -23.87621f, 22.739618f, -23.875f, 22.75f);
generalPath.curveTo(-23.87621f, 22.760382f, -23.87621f, 22.770868f, -23.875f, 22.78125f);
generalPath.curveTo(-23.866371f, 22.793312f, -23.855812f, 22.803871f, -23.84375f, 22.8125f);
generalPath.curveTo(-23.835121f, 22.824562f, -23.824562f, 22.835121f, -23.8125f, 22.84375f);
generalPath.curveTo(-23.802118f, 22.84496f, -23.791632f, 22.84496f, -23.78125f, 22.84375f);
generalPath.curveTo(-23.770868f, 22.84496f, -23.760382f, 22.84496f, -23.75f, 22.84375f);
generalPath.lineTo(-17.65625f, 22.84375f);
generalPath.curveTo(-17.645868f, 22.84496f, -17.635382f, 22.84496f, -17.625f, 22.84375f);
generalPath.curveTo(-17.614618f, 22.84496f, -17.604132f, 22.84496f, -17.59375f, 22.84375f);
generalPath.curveTo(-17.581688f, 22.835121f, -17.571129f, 22.824562f, -17.5625f, 22.8125f);
generalPath.curveTo(-17.550438f, 22.803871f, -17.539879f, 22.793312f, -17.53125f, 22.78125f);
generalPath.curveTo(-17.53004f, 22.770868f, -17.53004f, 22.760382f, -17.53125f, 22.75f);
generalPath.curveTo(-17.53004f, 22.739618f, -17.53004f, 22.729132f, -17.53125f, 22.71875f);
generalPath.lineTo(-17.53125f, 21.96875f);
generalPath.curveTo(-17.531261f, 21.500553f, -17.38288f, 21.075901f, -17.15625f, 20.6875f);
generalPath.curveTo(-16.933954f, 20.296215f, -16.448177f, 19.73714f, -15.6875f, 19.0625f);
generalPath.lineTo(-14.625f, 18.125f);
generalPath.curveTo(-13.558412f, 17.14269f, -12.794341f, 16.240347f, -12.34375f, 15.375f);
generalPath.curveTo(-11.894481f, 14.500954f, -11.656268f, 13.50158f, -11.65625f, 12.40625f);
generalPath.curveTo(-11.656268f, 10.279985f, -12.400019f, 8.672222f, -13.875f, 7.5625f);
generalPath.curveTo(-15.350197f, 6.441475f, -17.48124f, 5.875026f, -20.25f, 5.875f);
generalPath.closePath();
generalPath.moveTo(-23.8125f, 25.03125f);
generalPath.curveTo(-23.824562f, 25.039879f, -23.835121f, 25.050438f, -23.84375f, 25.0625f);
generalPath.curveTo(-23.855812f, 25.071129f, -23.866371f, 25.081688f, -23.875f, 25.09375f);
generalPath.curveTo(-23.87621f, 25.104132f, -23.87621f, 25.114618f, -23.875f, 25.125f);
generalPath.curveTo(-23.87621f, 25.135382f, -23.87621f, 25.145868f, -23.875f, 25.15625f);
generalPath.lineTo(-23.875f, 31.0f);
generalPath.curveTo(-23.87621f, 31.010382f, -23.87621f, 31.020868f, -23.875f, 31.03125f);
generalPath.curveTo(-23.87621f, 31.041632f, -23.87621f, 31.052118f, -23.875f, 31.0625f);
generalPath.curveTo(-23.866371f, 31.074562f, -23.855812f, 31.085121f, -23.84375f, 31.09375f);
generalPath.curveTo(-23.835121f, 31.105812f, -23.824562f, 31.116371f, -23.8125f, 31.125f);
generalPath.curveTo(-23.802118f, 31.12621f, -23.791632f, 31.12621f, -23.78125f, 31.125f);
generalPath.curveTo(-23.770868f, 31.12621f, -23.760382f, 31.12621f, -23.75f, 31.125f);
generalPath.lineTo(-17.65625f, 31.125f);
generalPath.curveTo(-17.645868f, 31.12621f, -17.635382f, 31.12621f, -17.625f, 31.125f);
generalPath.curveTo(-17.614618f, 31.12621f, -17.604132f, 31.12621f, -17.59375f, 31.125f);
generalPath.curveTo(-17.581688f, 31.116371f, -17.571129f, 31.105812f, -17.5625f, 31.09375f);
generalPath.curveTo(-17.550438f, 31.085121f, -17.539879f, 31.074562f, -17.53125f, 31.0625f);
generalPath.curveTo(-17.53004f, 31.052118f, -17.53004f, 31.041632f, -17.53125f, 31.03125f);
generalPath.curveTo(-17.53004f, 31.020868f, -17.53004f, 31.010382f, -17.53125f, 31.0f);
generalPath.lineTo(-17.53125f, 25.15625f);
generalPath.curveTo(-17.53004f, 25.145868f, -17.53004f, 25.135382f, -17.53125f, 25.125f);
generalPath.curveTo(-17.53004f, 25.114618f, -17.53004f, 25.104132f, -17.53125f, 25.09375f);
generalPath.curveTo(-17.539879f, 25.081688f, -17.550438f, 25.071129f, -17.5625f, 25.0625f);
generalPath.curveTo(-17.571129f, 25.050438f, -17.581688f, 25.039879f, -17.59375f, 25.03125f);
generalPath.curveTo(-17.604132f, 25.03004f, -17.614618f, 25.03004f, -17.625f, 25.03125f);
generalPath.curveTo(-17.635382f, 25.03004f, -17.645868f, 25.03004f, -17.65625f, 25.03125f);
generalPath.lineTo(-23.75f, 25.03125f);
generalPath.curveTo(-23.760382f, 25.03004f, -23.770868f, 25.03004f, -23.78125f, 25.03125f);
generalPath.curveTo(-23.791632f, 25.03004f, -23.802118f, 25.03004f, -23.8125f, 25.03125f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(-19.51563835144043, 16.855663299560547), 8.753643f, new Point2D.Double(-19.51563835144043, 16.855663299560547), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(184, 184, 184, 255)) : new Color(184, 184, 184, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(4.445991039276123f, -8.852599147408013E-16f, 1.3672169501077291E-15f, 6.866499900817871f, 67.2507095336914f, -104.66790008544922f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 200)) : new Color(255, 255, 255, 200);
stroke = new BasicStroke(1.0994728f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-20.25f, 5.875f);
generalPath.curveTo(-21.30902f, 5.875026f, -22.397636f, 5.9982357f, -23.53125f, 6.21875f);
generalPath.curveTo(-24.664175f, 6.4391785f, -25.911411f, 6.756263f, -27.28125f, 7.21875f);
generalPath.curveTo(-27.291632f, 7.21754f, -27.302118f, 7.21754f, -27.3125f, 7.21875f);
generalPath.curveTo(-27.324562f, 7.227379f, -27.335121f, 7.237937f, -27.34375f, 7.25f);
generalPath.curveTo(-27.355812f, 7.258629f, -27.366371f, 7.269187f, -27.375f, 7.28125f);
generalPath.curveTo(-27.37621f, 7.2916317f, -27.37621f, 7.302119f, -27.375f, 7.3125f);
generalPath.curveTo(-27.37621f, 7.3228817f, -27.37621f, 7.333369f, -27.375f, 7.34375f);
generalPath.lineTo(-27.375f, 12.5f);
generalPath.curveTo(-27.37621f, 12.510382f, -27.37621f, 12.520868f, -27.375f, 12.53125f);
generalPath.curveTo(-27.37621f, 12.541632f, -27.37621f, 12.552118f, -27.375f, 12.5625f);
generalPath.curveTo(-27.366371f, 12.574563f, -27.355812f, 12.585121f, -27.34375f, 12.59375f);
generalPath.curveTo(-27.335121f, 12.605813f, -27.324562f, 12.616371f, -27.3125f, 12.625f);
generalPath.curveTo(-27.302118f, 12.62621f, -27.291632f, 12.62621f, -27.28125f, 12.625f);
generalPath.curveTo(-27.270868f, 12.62621f, -27.260382f, 12.62621f, -27.25f, 12.625f);
generalPath.curveTo(-27.239618f, 12.62621f, -27.229132f, 12.62621f, -27.21875f, 12.625f);
generalPath.curveTo(-27.208368f, 12.62621f, -27.197882f, 12.62621f, -27.1875f, 12.625f);
generalPath.curveTo(-26.045061f, 11.905957f, -24.954147f, 11.357862f, -23.90625f, 11.0f);
generalPath.curveTo(-22.858109f, 10.631244f, -21.863134f, 10.437521f, -20.96875f, 10.4375f);
generalPath.curveTo(-20.019531f, 10.437521f, -19.323826f, 10.648045f, -18.8125f, 11.0625f);
generalPath.curveTo(-18.303778f, 11.46459f, -18.031261f, 12.04554f, -18.03125f, 12.78125f);
generalPath.curveTo(-18.03126f, 13.261907f, -18.175438f, 13.73266f, -18.46875f, 14.21875f);
generalPath.curveTo(-18.751741f, 14.705766f, -19.209015f, 15.249245f, -19.84375f, 15.8125f);
generalPath.lineTo(-20.9375f, 16.75f);
generalPath.curveTo(-22.13896f, 17.83049f, -22.926743f, 18.741022f, -23.3125f, 19.46875f);
generalPath.curveTo(-23.695614f, 20.180197f, -23.875006f, 20.988073f, -23.875f, 21.90625f);
generalPath.lineTo(-23.875f, 22.71875f);
generalPath.curveTo(-23.87621f, 22.729132f, -23.87621f, 22.739618f, -23.875f, 22.75f);
generalPath.curveTo(-23.87621f, 22.760382f, -23.87621f, 22.770868f, -23.875f, 22.78125f);
generalPath.curveTo(-23.866371f, 22.793312f, -23.855812f, 22.803871f, -23.84375f, 22.8125f);
generalPath.curveTo(-23.835121f, 22.824562f, -23.824562f, 22.835121f, -23.8125f, 22.84375f);
generalPath.curveTo(-23.802118f, 22.84496f, -23.791632f, 22.84496f, -23.78125f, 22.84375f);
generalPath.curveTo(-23.770868f, 22.84496f, -23.760382f, 22.84496f, -23.75f, 22.84375f);
generalPath.lineTo(-17.65625f, 22.84375f);
generalPath.curveTo(-17.645868f, 22.84496f, -17.635382f, 22.84496f, -17.625f, 22.84375f);
generalPath.curveTo(-17.614618f, 22.84496f, -17.604132f, 22.84496f, -17.59375f, 22.84375f);
generalPath.curveTo(-17.581688f, 22.835121f, -17.571129f, 22.824562f, -17.5625f, 22.8125f);
generalPath.curveTo(-17.550438f, 22.803871f, -17.539879f, 22.793312f, -17.53125f, 22.78125f);
generalPath.curveTo(-17.53004f, 22.770868f, -17.53004f, 22.760382f, -17.53125f, 22.75f);
generalPath.curveTo(-17.53004f, 22.739618f, -17.53004f, 22.729132f, -17.53125f, 22.71875f);
generalPath.lineTo(-17.53125f, 21.96875f);
generalPath.curveTo(-17.531261f, 21.500553f, -17.38288f, 21.075901f, -17.15625f, 20.6875f);
generalPath.curveTo(-16.933954f, 20.296215f, -16.448177f, 19.73714f, -15.6875f, 19.0625f);
generalPath.lineTo(-14.625f, 18.125f);
generalPath.curveTo(-13.558412f, 17.14269f, -12.794341f, 16.240347f, -12.34375f, 15.375f);
generalPath.curveTo(-11.894481f, 14.500954f, -11.656268f, 13.50158f, -11.65625f, 12.40625f);
generalPath.curveTo(-11.656268f, 10.279985f, -12.400019f, 8.672222f, -13.875f, 7.5625f);
generalPath.curveTo(-15.350197f, 6.441475f, -17.48124f, 5.875026f, -20.25f, 5.875f);
generalPath.closePath();
generalPath.moveTo(-23.8125f, 25.03125f);
generalPath.curveTo(-23.824562f, 25.039879f, -23.835121f, 25.050438f, -23.84375f, 25.0625f);
generalPath.curveTo(-23.855812f, 25.071129f, -23.866371f, 25.081688f, -23.875f, 25.09375f);
generalPath.curveTo(-23.87621f, 25.104132f, -23.87621f, 25.114618f, -23.875f, 25.125f);
generalPath.curveTo(-23.87621f, 25.135382f, -23.87621f, 25.145868f, -23.875f, 25.15625f);
generalPath.lineTo(-23.875f, 31.0f);
generalPath.curveTo(-23.87621f, 31.010382f, -23.87621f, 31.020868f, -23.875f, 31.03125f);
generalPath.curveTo(-23.87621f, 31.041632f, -23.87621f, 31.052118f, -23.875f, 31.0625f);
generalPath.curveTo(-23.866371f, 31.074562f, -23.855812f, 31.085121f, -23.84375f, 31.09375f);
generalPath.curveTo(-23.835121f, 31.105812f, -23.824562f, 31.116371f, -23.8125f, 31.125f);
generalPath.curveTo(-23.802118f, 31.12621f, -23.791632f, 31.12621f, -23.78125f, 31.125f);
generalPath.curveTo(-23.770868f, 31.12621f, -23.760382f, 31.12621f, -23.75f, 31.125f);
generalPath.lineTo(-17.65625f, 31.125f);
generalPath.curveTo(-17.645868f, 31.12621f, -17.635382f, 31.12621f, -17.625f, 31.125f);
generalPath.curveTo(-17.614618f, 31.12621f, -17.604132f, 31.12621f, -17.59375f, 31.125f);
generalPath.curveTo(-17.581688f, 31.116371f, -17.571129f, 31.105812f, -17.5625f, 31.09375f);
generalPath.curveTo(-17.550438f, 31.085121f, -17.539879f, 31.074562f, -17.53125f, 31.0625f);
generalPath.curveTo(-17.53004f, 31.052118f, -17.53004f, 31.041632f, -17.53125f, 31.03125f);
generalPath.curveTo(-17.53004f, 31.020868f, -17.53004f, 31.010382f, -17.53125f, 31.0f);
generalPath.lineTo(-17.53125f, 25.15625f);
generalPath.curveTo(-17.53004f, 25.145868f, -17.53004f, 25.135382f, -17.53125f, 25.125f);
generalPath.curveTo(-17.53004f, 25.114618f, -17.53004f, 25.104132f, -17.53125f, 25.09375f);
generalPath.curveTo(-17.539879f, 25.081688f, -17.550438f, 25.071129f, -17.5625f, 25.0625f);
generalPath.curveTo(-17.571129f, 25.050438f, -17.581688f, 25.039879f, -17.59375f, 25.03125f);
generalPath.curveTo(-17.604132f, 25.03004f, -17.614618f, 25.03004f, -17.625f, 25.03125f);
generalPath.curveTo(-17.635382f, 25.03004f, -17.645868f, 25.03004f, -17.65625f, 25.03125f);
generalPath.lineTo(-23.75f, 25.03125f);
generalPath.curveTo(-23.760382f, 25.03004f, -23.770868f, 25.03004f, -23.78125f, 25.03125f);
generalPath.curveTo(-23.791632f, 25.03004f, -23.802118f, 25.03004f, -23.8125f, 25.03125f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
        return 2.9689972400665283;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 1.9594069719314575;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 42.064666748046875;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 46.040592193603516;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Help_browser() {
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
       Help_browser base = new Help_browser();
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
       Help_browser base = new Help_browser();
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
        return Help_browser::new;
    }
}

