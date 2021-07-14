package org.pushingpixels.demo.substance.main.check.svg.tango;

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
public class user_home implements NeonIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.022623829543590546f, 0.0f, 0.0f, 0.02086758054792881f, 43.38343048095703f, 36.36962127685547f));
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
g.transform(new AffineTransform(1.001039981842041f, 0.0f, 0.0f, 1.0020760297775269f, -0.053901370614767075f, -0.10208500176668167f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.5217805f, 38.687416f);
generalPath.curveTo(4.5435767f, 39.10372f, 4.981685f, 39.520027f, 5.39799f, 39.520027f);
generalPath.lineTo(36.72501f, 39.520027f);
generalPath.curveTo(37.14131f, 39.520027f, 37.535824f, 39.10372f, 37.514027f, 38.687416f);
generalPath.lineTo(36.577583f, 11.460682f);
generalPath.curveTo(36.555786f, 11.044379f, 36.117687f, 10.628066f, 35.70138f, 10.628066f);
generalPath.lineTo(22.43051f, 10.628066f);
generalPath.curveTo(21.945454f, 10.628066f, 21.196037f, 10.312477f, 21.028866f, 9.521434f);
generalPath.lineTo(20.417475f, 6.6283627f);
generalPath.curveTo(20.262007f, 5.8926897f, 19.535261f, 5.5904765f, 19.118958f, 5.5904765f);
generalPath.lineTo(4.3400974f, 5.5904765f);
generalPath.curveTo(3.9237847f, 5.5904765f, 3.5292766f, 6.0067806f, 3.5510726f, 6.4230847f);
generalPath.lineTo(4.5217805f, 38.687416f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(20.706016540527344, 37.51798629760742), 30.905205f, new Point2D.Double(20.706016540527344, 37.51798629760742), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(32, 32, 32, 255)) : new Color(32, 32, 32, 255)),((colorFilter != null) ? colorFilter.filter(new Color(185, 185, 185, 255)) : new Color(185, 185, 185, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.056007981300354f, 0.015133569948375225f, 0.14261800050735474f, 1.2515989542007446f, -2.2762789726257324f, -10.281060218811035f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(18.112709045410156, 31.36775016784668), new Point2D.Double(15.514888763427734, 6.18025016784668), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(66, 66, 66, 255)) : new Color(66, 66, 66, 255)),((colorFilter != null) ? colorFilter.filter(new Color(119, 119, 119, 255)) : new Color(119, 119, 119, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.99844444f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.5217805f, 38.687416f);
generalPath.curveTo(4.5435767f, 39.10372f, 4.981685f, 39.520027f, 5.39799f, 39.520027f);
generalPath.lineTo(36.72501f, 39.520027f);
generalPath.curveTo(37.14131f, 39.520027f, 37.535824f, 39.10372f, 37.514027f, 38.687416f);
generalPath.lineTo(36.577583f, 11.460682f);
generalPath.curveTo(36.555786f, 11.044379f, 36.117687f, 10.628066f, 35.70138f, 10.628066f);
generalPath.lineTo(22.43051f, 10.628066f);
generalPath.curveTo(21.945454f, 10.628066f, 21.196037f, 10.312477f, 21.028866f, 9.521434f);
generalPath.lineTo(20.417475f, 6.6283627f);
generalPath.curveTo(20.262007f, 5.8926897f, 19.535261f, 5.5904765f, 19.118958f, 5.5904765f);
generalPath.lineTo(4.3400974f, 5.5904765f);
generalPath.curveTo(3.9237847f, 5.5904765f, 3.5292766f, 6.0067806f, 3.5510726f, 6.4230847f);
generalPath.lineTo(4.5217805f, 38.687416f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.4514286f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9935629963874817f, 0.0f, 0.0f, 0.992048978805542f, -0.04175005108118057f, 0.005133802071213722f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.068343f, 38.86402f);
generalPath.curveTo(6.084686f, 39.17625f, 5.8874316f, 39.384403f, 5.5697584f, 39.280327f);
generalPath.lineTo(5.5697584f, 39.280327f);
generalPath.curveTo(5.2520766f, 39.17625f, 5.033027f, 38.968098f, 5.0166755f, 38.65587f);
generalPath.lineTo(4.068956f, 6.591384f);
generalPath.curveTo(4.0526133f, 6.2791557f, 4.234142f, 6.0906134f, 4.54637f, 6.0906134f);
generalPath.lineTo(18.96842f, 6.0429196f);
generalPath.curveTo(19.280647f, 6.0429196f, 19.900364f, 6.3433924f, 20.101357f, 7.3651013f);
generalPath.lineTo(20.674845f, 10.180636f);
generalPath.curveTo(20.247791f, 9.715379f, 20.255651f, 9.701017f, 20.037287f, 9.02393f);
generalPath.lineTo(19.631191f, 7.764748f);
generalPath.curveTo(19.412142f, 7.037101f, 18.932991f, 6.932848f, 18.620764f, 6.932848f);
generalPath.lineTo(5.732989f, 6.932848f);
generalPath.curveTo(5.420761f, 6.932848f, 5.2235074f, 7.141f, 5.239858f, 7.4532366f);
generalPath.lineTo(6.1778636f, 38.968098f);
generalPath.lineTo(6.068343f, 38.86402f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(6.229796409606934, 13.773065567016602), new Point2D.Double(9.898089408874512, 66.83405303955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 223)) : new Color(255, 255, 255, 223)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 254, 0)) : new Color(255, 255, 254, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.5168440341949463f, 0.0f, 0.0f, 0.708977997303009f, -0.8795729875564575f, -1.3181660175323486f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.0421734f, 18.5625f);
generalPath.lineTo(35.489105f, 18.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.0421734f, 18.5625f);
generalPath.lineTo(35.489105f, 18.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.9806967f, 12.5625f);
generalPath.lineTo(35.488056f, 12.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.9806967f, 12.5625f);
generalPath.lineTo(35.488056f, 12.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.2265925f, 22.5625f);
generalPath.lineTo(35.492172f, 22.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.2265925f, 22.5625f);
generalPath.lineTo(35.492172f, 22.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.3861575f, 32.5625f);
generalPath.lineTo(35.49488f, 32.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.3861575f, 32.5625f);
generalPath.lineTo(35.49488f, 32.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.50914f, 34.5625f);
generalPath.lineTo(35.496895f, 34.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.50914f, 34.5625f);
generalPath.lineTo(35.496895f, 34.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.0421734f, 16.5625f);
generalPath.lineTo(35.489105f, 16.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.0421734f, 16.5625f);
generalPath.lineTo(35.489105f, 16.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.1958537f, 20.5625f);
generalPath.lineTo(35.49165f, 20.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000001f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.1958537f, 20.5625f);
generalPath.lineTo(35.49165f, 20.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.0114346f, 14.5625f);
generalPath.lineTo(35.48858f, 14.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.0114346f, 14.5625f);
generalPath.lineTo(35.48858f, 14.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0534039735794067f, 0.0f, 0.05515433847904205f, 1.0400680303573608f, -9.163335800170898f, 2.458743095397949f));
// _0_0_3_8
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_8_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(42.417183f, 8.515178f);
generalPath.curveTo(42.422268f, 8.418064f, 42.28902f, 8.268189f, 42.182068f, 8.268171f);
generalPath.lineTo(29.150665f, 8.266053f);
generalPath.curveTo(29.150665f, 8.266053f, 30.06238f, 8.854008f, 31.352476f, 8.862296f);
generalPath.lineTo(42.405975f, 8.933317f);
generalPath.curveTo(42.41706f, 8.721589f, 42.408695f, 8.677284f, 42.417183f, 8.515178f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 130)) : new Color(255, 255, 255, 130);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.2265925f, 24.5625f);
generalPath.lineTo(35.492172f, 24.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.2265925f, 24.5625f);
generalPath.lineTo(35.492172f, 24.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.3246665f, 30.5625f);
generalPath.lineTo(35.493877f, 30.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.3246665f, 30.5625f);
generalPath.lineTo(35.493877f, 30.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.3246665f, 28.5625f);
generalPath.lineTo(35.493877f, 28.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.3246665f, 28.5625f);
generalPath.lineTo(35.493877f, 28.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.50914f, 36.5625f);
generalPath.lineTo(35.496895f, 36.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.50914f, 36.5625f);
generalPath.lineTo(35.496895f, 36.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.288064f, 26.5625f);
generalPath.lineTo(35.493183f, 26.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.288064f, 26.5625f);
generalPath.lineTo(35.493183f, 26.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.8737535f, 8.5625f);
generalPath.lineTo(19.657488f, 8.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.9999998f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.8737535f, 8.5625f);
generalPath.lineTo(19.657488f, 8.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.9220967f, 10.5625f);
generalPath.lineTo(20.202911f, 10.5625f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.9220967f, 10.5625f);
generalPath.lineTo(20.202911f, 10.5625f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9930909872055054f, 0.0f, 0.0f, 0.9978960156440735f, 0.29771700501441956f, 0.06983204931020737f));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.78353f, 39.51062f);
generalPath.curveTo(40.927425f, 39.466557f, 41.74661f, 38.41432f, 41.830566f, 37.189613f);
generalPath.curveTo(42.622353f, 25.640928f, 43.489925f, 15.957666f, 43.489925f, 15.957666f);
generalPath.curveTo(43.56208f, 15.710182f, 43.322018f, 15.462699f, 43.00979f, 15.462699f);
generalPath.lineTo(8.638631f, 15.462699f);
generalPath.curveTo(8.638631f, 15.462699f, 6.7883115f, 37.32959f, 6.7883115f, 37.32959f);
generalPath.curveTo(6.673756f, 38.311657f, 6.322304f, 39.134308f, 5.2384753f, 39.513306f);
generalPath.lineTo(39.78353f, 39.51062f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(22.175975799560547, 36.987998962402344), new Point2D.Double(22.065330505371094, 32.050498962402344), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(97, 148, 203, 255)) : new Color(97, 148, 203, 255)),((colorFilter != null) ? colorFilter.filter(new Color(114, 159, 207, 255)) : new Color(114, 159, 207, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 255)) : new Color(52, 101, 164, 255);
stroke = new BasicStroke(1.0045297f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.78353f, 39.51062f);
generalPath.curveTo(40.927425f, 39.466557f, 41.74661f, 38.41432f, 41.830566f, 37.189613f);
generalPath.curveTo(42.622353f, 25.640928f, 43.489925f, 15.957666f, 43.489925f, 15.957666f);
generalPath.curveTo(43.56208f, 15.710182f, 43.322018f, 15.462699f, 43.00979f, 15.462699f);
generalPath.lineTo(8.638631f, 15.462699f);
generalPath.curveTo(8.638631f, 15.462699f, 6.7883115f, 37.32959f, 6.7883115f, 37.32959f);
generalPath.curveTo(6.673756f, 38.311657f, 6.322304f, 39.134308f, 5.2384753f, 39.513306f);
generalPath.lineTo(39.78353f, 39.51062f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.46590912f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9930909872055054f, 0.0f, 0.0f, 0.9978960156440735f, 0.29771700501441956f, 0.06983204931020737f));
// _0_0_5
paint = new LinearGradientPaint(new Point2D.Double(13.035696029663086, 32.56718444824219), new Point2D.Double(12.853771209716797, 46.68931198120117), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3174890279769897f, 0.0f, 0.0f, 0.8162559866905212f, -0.8795729875564575f, -1.3181660175323486f));
stroke = new BasicStroke(1.0045295f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.620244f, 16.46392f);
generalPath.lineTo(42.411343f, 16.528734f);
generalPath.lineTo(40.837296f, 36.530712f);
generalPath.curveTo(40.752975f, 37.602226f, 40.38662f, 37.958927f, 38.96464f, 37.958927f);
generalPath.curveTo(37.09314f, 37.958927f, 10.286673f, 37.92652f, 7.569899f, 37.92652f);
generalPath.curveTo(7.8034973f, 37.605713f, 7.9036546f, 36.9379f, 7.9049954f, 36.92191f);
generalPath.lineTo(9.620244f, 16.46392f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9930909872055054f, 0.0f, 0.0f, 0.9978960156440735f, 0.29771700501441956f, 0.06983204931020737f));
// _0_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.620248f, 16.223183f);
generalPath.lineTo(8.453602f, 31.866453f);
generalPath.curveTo(8.453602f, 31.866453f, 16.749756f, 27.718374f, 27.11995f, 27.718374f);
generalPath.curveTo(37.490143f, 27.718374f, 42.67524f, 16.223183f, 42.67524f, 16.223183f);
generalPath.lineTo(9.620248f, 16.223183f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 23)) : new Color(255, 255, 255, 23);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9889810085296631f, 0.0f, 0.0f, 0.9837819933891296f, 1.1542659997940063f, 0.5676299929618835f));
// _0_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.569914f, 27.404846f);
generalPath.lineTo(15.862615f, 35.0f);
generalPath.lineTo(23.713867f, 35.0f);
generalPath.lineTo(24.285564f, 28.86095f);
generalPath.lineTo(28.558756f, 28.86095f);
generalPath.lineTo(27.987057f, 35.0f);
generalPath.lineTo(32.867565f, 35.0f);
generalPath.lineTo(33.574863f, 27.404846f);
generalPath.lineTo(36.245113f, 27.402613f);
generalPath.lineTo(25.834953f, 19.752712f);
generalPath.lineTo(14.0f, 27.402613f);
generalPath.lineTo(16.569914f, 27.404846f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.354230880737305, 26.383647918701172), new Point2D.Double(20.796142578125, 50.77069091796875), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2078720331192017f, 0.0f, 0.0f, 0.8279020190238953f, -0.9520040154457092f, -0.11754699796438217f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.41477272f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0407639741897583f, 0.0f, 0.0544925183057785f, 1.3656419515609741f, -8.358528137207031f, 0.9217879772186279f));
// _0_0_8
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
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
        return 0.2928977608680725;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 4.999738693237305;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 45.93619155883789;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 38.22594451904297;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private user_home() {
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
    public static NeonIcon of(int width, int height) {
       user_home base = new user_home();
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
       user_home base = new user_home();
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
        return user_home::new;
    }
}

