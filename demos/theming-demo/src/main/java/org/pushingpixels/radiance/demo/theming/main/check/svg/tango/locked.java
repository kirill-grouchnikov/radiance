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
public class locked implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.47368422f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.4402250051498413f, 0.0f, 0.0f, 0.41901400685310364f, -8.581572532653809f, 29.820430755615234f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.142857f, 30.857143f);
generalPath.curveTo(38.16781f, 34.491642f, 35.205383f, 37.857037f, 30.377314f, 39.678993f);
generalPath.curveTo(25.549248f, 41.500954f, 19.593609f, 41.500954f, 14.765542f, 39.678993f);
generalPath.curveTo(9.937474f, 37.857037f, 6.9750466f, 34.491642f, 7.0f, 30.857143f);
generalPath.curveTo(6.9750466f, 27.222643f, 9.937474f, 23.85725f, 14.765542f, 22.035294f);
generalPath.curveTo(19.593609f, 20.213335f, 25.549248f, 20.213335f, 30.377314f, 22.035294f);
generalPath.curveTo(35.205383f, 23.85725f, 38.16781f, 27.222643f, 38.142857f, 30.857143f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(22.571428298950195, 30.85714340209961), 15.571428f, new Point2D.Double(22.571428298950195, 30.85714340209961), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.6513760089874268f, 4.75660880651309E-15f, 10.757539749145508f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new RoundRectangle2D.Double(6.5, 17.5, 34.993770599365234, 27.00927734375, 4.469950199127197, 4.514106750488281);
paint = new LinearGradientPaint(new Point2D.Double(6.72681999206543, 32.16169738769531), new Point2D.Double(40.93812561035156, 32.16169738769531), new float[] {0.0f,0.21f,0.84f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(234, 210, 0, 182)) : new Color(234, 210, 0, 182)),((colorFilter != null) ? colorFilter.filter(new Color(255, 236, 65, 255)) : new Color(255, 236, 65, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 204, 0, 255)) : new Color(226, 204, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(195, 175, 0, 255)) : new Color(195, 175, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.089877963066101f, 0.0f, -5.109789848327637f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(31.630468368530273, 41.79181671142578), new Point2D.Double(8.671363830566406, 25.79352378845215), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(125, 100, 0, 255)) : new Color(125, 100, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 151, 0, 255)) : new Color(190, 151, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.089877963066101f, 0.0f, -3.986898899078369f));
stroke = new BasicStroke(0.99999946f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.5, 17.5, 34.993770599365234, 27.00927734375, 4.469950199127197, 4.514106750488281);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(10.907268524169922, 25.002281188964844), new Point2D.Double(30.875446319580078, 36.127281188964844), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 153)) : new Color(255, 255, 255, 153)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 76)) : new Color(255, 255, 255, 76))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9991120100021362f, 0.0f, 0.0f, 1.0958019495010376f, 0.036421410739421844f, -4.139732837677002f));
stroke = new BasicStroke(1.0000001f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.5, 18.5, 33.00090408325195, 25.006881713867188, 2.577022075653076, 2.577022075653076);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0662909746170044f, 0.0f, 0.0f, 1.0f, -1.5909899473190308f, 0.0f));
// _0_0_3
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_0
shape = new Rectangle2D.Double(8.0, 23.0, 32.0, 0.9722709655761719);
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(137, 109, 0, 255)) : new Color(137, 109, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 128, 0, 68)) : new Color(161, 128, 0, 68))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 14.897740364074707f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_1
shape = new Rectangle2D.Double(8.0, 25.0, 32.0, 0.9722709655761719);
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(137, 109, 0, 255)) : new Color(137, 109, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 128, 0, 68)) : new Color(161, 128, 0, 68))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 16.89773941040039f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_2
shape = new Rectangle2D.Double(8.0, 27.0, 32.0, 0.9722709655761719);
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(137, 109, 0, 255)) : new Color(137, 109, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 128, 0, 68)) : new Color(161, 128, 0, 68))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 18.89773941040039f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_3
shape = new Rectangle2D.Double(8.0, 29.0, 32.0, 0.9722709655761719);
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(137, 109, 0, 255)) : new Color(137, 109, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 128, 0, 68)) : new Color(161, 128, 0, 68))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 20.89773941040039f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_4
shape = new Rectangle2D.Double(8.0, 31.0, 32.0, 0.9722709655761719);
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(137, 109, 0, 255)) : new Color(137, 109, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 128, 0, 68)) : new Color(161, 128, 0, 68))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 22.89773941040039f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_5
shape = new Rectangle2D.Double(8.0, 33.0, 32.0, 0.9722709655761719);
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(137, 109, 0, 255)) : new Color(137, 109, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 128, 0, 68)) : new Color(161, 128, 0, 68))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 24.89773941040039f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_6
shape = new Rectangle2D.Double(8.0, 35.0, 32.0, 0.9722709655761719);
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(137, 109, 0, 255)) : new Color(137, 109, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 128, 0, 68)) : new Color(161, 128, 0, 68))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 26.89773941040039f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_7
shape = new Rectangle2D.Double(8.0, 37.0, 32.0, 0.9722709655761719);
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(137, 109, 0, 255)) : new Color(137, 109, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 128, 0, 68)) : new Color(161, 128, 0, 68))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 28.89773941040039f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_8
shape = new Rectangle2D.Double(8.0, 39.0, 32.0, 0.9722709655761719);
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(137, 109, 0, 255)) : new Color(137, 109, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 128, 0, 68)) : new Color(161, 128, 0, 68))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 30.89773941040039f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_9
shape = new Rectangle2D.Double(8.0, 41.0, 32.0, 0.9722709655761719);
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(137, 109, 0, 255)) : new Color(137, 109, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 128, 0, 68)) : new Color(161, 128, 0, 68))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 32.89773941040039f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
shape = new RoundRectangle2D.Double(7.0, 18.0, 34.0, 4.0, 3.429290771484375, 3.3221452236175537);
paint = new LinearGradientPaint(new Point2D.Double(24.875, 21.0), new Point2D.Double(24.75, 17.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 236, 65, 255)) : new Color(255, 236, 65, 255)),((colorFilter != null) ? colorFilter.filter(new Color(195, 175, 0, 255)) : new Color(195, 175, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.4065934f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.022896f, 21.954401f);
generalPath.lineTo(8.978923f, 21.954401f);
generalPath.curveTo(7.4608207f, 21.962502f, 6.998228f, 22.594587f, 6.982603f, 24.335226f);
generalPath.lineTo(6.982603f, 35.18088f);
generalPath.curveTo(12.330783f, 39.93756f, 24.775284f, 30.210882f, 40.9826f, 35.18088f);
generalPath.lineTo(40.9826f, 24.314186f);
generalPath.curveTo(40.969994f, 22.533916f, 40.441753f, 21.96814f, 39.022896f, 21.954401f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(12.845671653747559, 13.342373847961426), 17.0f, new Point2D.Double(12.845671653747559, 13.342373847961426), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.5310890674591064f, -2.901826880592458E-16f, 6.080015158005381E-9f, 2.860548973083496f, -19.66786003112793f, -16.339290618896484f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.0861629934643133E-7f, -0.987405002117157f));
// _0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.5f, 20.234846f);
generalPath.lineTo(10.5f, 13.0f);
generalPath.curveTo(10.5f, 5.1298666f, 15.897609f, 1.3910066f, 24.020027f, 1.4892921f);
generalPath.curveTo(32.18664f, 1.5875777f, 37.5f, 5.037278f, 37.5f, 13.0f);
generalPath.lineTo(37.5f, 20.234846f);
generalPath.curveTo(37.416054f, 21.93843f, 32.536613f, 21.93215f, 32.5f, 20.234846f);
generalPath.lineTo(32.5f, 15.0f);
generalPath.curveTo(32.5f, 13.0f, 33.138264f, 6.528147f, 24.077242f, 6.528147f);
generalPath.curveTo(14.953718f, 6.528147f, 15.489989f, 13.039885f, 15.52268f, 14.992026f);
generalPath.lineTo(15.52268f, 20.268524f);
generalPath.curveTo(15.3125f, 21.859846f, 10.5f, 21.797346f, 10.5f, 20.234846f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(10.65084171295166, 2.913684129714966), new Point2D.Double(27.19227409362793, 17.47001075744629), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(202, 208, 198, 255)) : new Color(202, 208, 198, 255)),((colorFilter != null) ? colorFilter.filter(new Color(234, 236, 233, 255)) : new Color(234, 236, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(197, 203, 192, 255)) : new Color(197, 203, 192, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.9262789487838745f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(19.25061798095703, 9.66357707977295), new Point2D.Double(16.198251724243164, 6.039654731750488), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(111, 113, 109, 255)) : new Color(111, 113, 109, 255)),((colorFilter != null) ? colorFilter.filter(new Color(158, 160, 156, 255)) : new Color(158, 160, 156, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.9262789487838745f));
stroke = new BasicStroke(0.9999996f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.5f, 20.234846f);
generalPath.lineTo(10.5f, 13.0f);
generalPath.curveTo(10.5f, 5.1298666f, 15.897609f, 1.3910066f, 24.020027f, 1.4892921f);
generalPath.curveTo(32.18664f, 1.5875777f, 37.5f, 5.037278f, 37.5f, 13.0f);
generalPath.lineTo(37.5f, 20.234846f);
generalPath.curveTo(37.416054f, 21.93843f, 32.536613f, 21.93215f, 32.5f, 20.234846f);
generalPath.lineTo(32.5f, 15.0f);
generalPath.curveTo(32.5f, 13.0f, 33.138264f, 6.528147f, 24.077242f, 6.528147f);
generalPath.curveTo(14.953718f, 6.528147f, 15.489989f, 13.039885f, 15.52268f, 14.992026f);
generalPath.lineTo(15.52268f, 20.268524f);
generalPath.curveTo(15.3125f, 21.859846f, 10.5f, 21.797346f, 10.5f, 20.234846f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.496849f, 13.160018f);
generalPath.curveTo(11.745273f, 8.76218f, 12.91305f, 4.7080564f, 18.456118f, 3.1987817f);
generalPath.curveTo(20.036661f, 5.0232134f, 13.557817f, 5.119544f, 13.458448f, 11.481749f);
generalPath.curveTo(13.458448f, 11.481749f, 13.480108f, 19.46426f, 13.480108f, 19.46426f);
generalPath.curveTo(13.245273f, 20.052649f, 11.559349f, 20.070826f, 11.496849f, 19.414576f);
generalPath.lineTo(11.496849f, 13.160018f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(12.184196472167969, 8.546343803405762), 3.6037734f, new Point2D.Double(12.184196472167969, 8.546343803405762), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 126)) : new Color(255, 255, 255, 126))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.44134199619293213f, 3.7869648933410645f, -3.285907030105591f, -0.38293901085853577f, 47.91817855834961f, -38.448299407958984f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.500366f, 9.7120695f);
generalPath.lineTo(35.500366f, 9.7120695f);
generalPath.lineTo(35.500366f, 19.347483f);
generalPath.curveTo(35.437866f, 20.472483f, 33.469116f, 19.878733f, 33.500366f, 19.347483f);
generalPath.lineTo(33.500366f, 9.7120695f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(30.996042251586914, 13.15640926361084), 1.000184f, new Point2D.Double(30.996042251586914, 13.15640926361084), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-5.316169904290291E-7f, 14.968979835510254f, -8.276676177978516f, 3.9688320248387754E-4f, 143.8948974609375f, -454.2723083496094f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new LinearGradientPaint(new Point2D.Double(21.941509246826172, 21.55086898803711), new Point2D.Double(21.941509246826172, 18.037588119506836), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.9519230127334595f, 0.0f, 1.9759629964828491f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.5, 18.634618759155273, 33.0, 2.855769634246826, 2.400388479232788, 2.193695306777954);
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
        return 1.4640640020370483;
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
		return 44.92459487915039;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 47.20991134643555;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private locked() {
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
       locked base = new locked();
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
       locked base = new locked();
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
        return locked::new;
    }
}

