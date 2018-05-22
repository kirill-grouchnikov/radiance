package org.pushingpixels.demo.substance.main.check.svg.tango;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.Icon;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.icon.IsHiDpiAware;
import org.pushingpixels.substance.api.icon.IsResizable;
import org.pushingpixels.substance.api.icon.SubstanceIcon;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/ibis">Ibis SVG transcoder</a>.
 */
public class locked implements Icon, IsResizable, IsHiDpiAware, UIResource {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.47368422f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.4402250051498413f, 0.0f, 0.0f, 0.41901400685310364f, -8.581572532653809f, 29.820430755615234f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(22.571428298950195, 30.85714340209961), 15.571428f, new Point2D.Double(22.571428298950195, 30.85714340209961), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.6513760089874268f, 4.75660880651309E-15f, 10.757539749145508f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.142857, 30.857143);
((GeneralPath)shape).curveTo(38.16781, 34.491642, 35.205383, 37.857037, 30.377314, 39.678993);
((GeneralPath)shape).curveTo(25.549248, 41.500954, 19.593609, 41.500954, 14.765542, 39.678993);
((GeneralPath)shape).curveTo(9.937474, 37.857037, 6.9750466, 34.491642, 7.0, 30.857143);
((GeneralPath)shape).curveTo(6.9750466, 27.222643, 9.937474, 23.85725, 14.765542, 22.035294);
((GeneralPath)shape).curveTo(19.593609, 20.213335, 25.549248, 20.213335, 30.377314, 22.035294);
((GeneralPath)shape).curveTo(35.205383, 23.85725, 38.16781, 27.222643, 38.142857, 30.857143);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(6.72681999206543, 32.16169738769531), new Point2D.Double(40.93812561035156, 32.16169738769531), new float[] {0.0f,0.21f,0.84f,1.0f}, new Color[] {new Color(234, 210, 0, 182),new Color(255, 236, 65, 255),new Color(226, 204, 0, 255),new Color(195, 175, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.089877963066101f, 0.0f, -5.109789848327637f));
shape = new RoundRectangle2D.Double(6.5, 17.5, 34.993770599365234, 27.00927734375, 4.469950199127197, 4.514106750488281);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(31.630468368530273, 41.79181671142578), new Point2D.Double(8.671363830566406, 25.79352378845215), new float[] {0.0f,1.0f}, new Color[] {new Color(125, 100, 0, 255),new Color(190, 151, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.089877963066101f, 0.0f, -3.986898899078369f));
stroke = new BasicStroke(0.99999946f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.5, 17.5, 34.993770599365234, 27.00927734375, 4.469950199127197, 4.514106750488281);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(10.907268524169922, 25.002281188964844), new Point2D.Double(30.875446319580078, 36.127281188964844), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 153),new Color(255, 255, 255, 76)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9991120100021362f, 0.0f, 0.0f, 1.0958019495010376f, 0.036421410739421844f, -4.139732837677002f));
stroke = new BasicStroke(1.0000001f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.5, 18.5, 33.00090408325195, 25.006881713867188, 2.577022075653076, 2.577022075653076);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0662909746170044f, 0.0f, 0.0f, 1.0f, -1.5909899473190308f, 0.0f));
// _0_0_3
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_0
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {new Color(137, 109, 0, 255),new Color(161, 128, 0, 68)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 14.897740364074707f));
shape = new Rectangle2D.Double(8.0, 23.0, 32.0, 0.9722709655761719);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_0);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_3_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_1
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {new Color(137, 109, 0, 255),new Color(161, 128, 0, 68)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 16.89773941040039f));
shape = new Rectangle2D.Double(8.0, 25.0, 32.0, 0.9722709655761719);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_1);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_3_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_2
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {new Color(137, 109, 0, 255),new Color(161, 128, 0, 68)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 18.89773941040039f));
shape = new Rectangle2D.Double(8.0, 27.0, 32.0, 0.9722709655761719);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_2);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_3_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_3
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {new Color(137, 109, 0, 255),new Color(161, 128, 0, 68)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 20.89773941040039f));
shape = new Rectangle2D.Double(8.0, 29.0, 32.0, 0.9722709655761719);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_3);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_3_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_4
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {new Color(137, 109, 0, 255),new Color(161, 128, 0, 68)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 22.89773941040039f));
shape = new Rectangle2D.Double(8.0, 31.0, 32.0, 0.9722709655761719);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_4);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_3_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_5
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {new Color(137, 109, 0, 255),new Color(161, 128, 0, 68)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 24.89773941040039f));
shape = new Rectangle2D.Double(8.0, 33.0, 32.0, 0.9722709655761719);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_5);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_3_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_6
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {new Color(137, 109, 0, 255),new Color(161, 128, 0, 68)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 26.89773941040039f));
shape = new Rectangle2D.Double(8.0, 35.0, 32.0, 0.9722709655761719);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_6);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_3_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_7
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {new Color(137, 109, 0, 255),new Color(161, 128, 0, 68)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 28.89773941040039f));
shape = new Rectangle2D.Double(8.0, 37.0, 32.0, 0.9722709655761719);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_7);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_3_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_8
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {new Color(137, 109, 0, 255),new Color(161, 128, 0, 68)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 30.89773941040039f));
shape = new Rectangle2D.Double(8.0, 39.0, 32.0, 0.9722709655761719);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_8);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_3_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_9
paint = new LinearGradientPaint(new Point2D.Double(27.8125, 22.73945426940918), new Point2D.Double(27.82421875, 26.024690628051758), new float[] {0.0f,1.0f}, new Color[] {new Color(137, 109, 0, 255),new Color(161, 128, 0, 68)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2307690382003784f, 0.0f, 0.0f, 0.32409000396728516f, -5.538462162017822f, 32.89773941040039f));
shape = new Rectangle2D.Double(8.0, 41.0, 32.0, 0.9722709655761719);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_9);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(24.875, 21.0), new Point2D.Double(24.75, 17.0), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 236, 65, 255),new Color(195, 175, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
shape = new RoundRectangle2D.Double(7.0, 18.0, 34.0, 4.0, 3.429290771484375, 3.3221452236175537);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.4065934f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new RadialGradientPaint(new Point2D.Double(12.845671653747559, 13.342373847961426), 17.0f, new Point2D.Double(12.845671653747559, 13.342373847961426), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.5310890674591064f, -2.901826880592458E-16f, 6.080015158005381E-9f, 2.860548973083496f, -19.66786003112793f, -16.339290618896484f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.022896, 21.954401);
((GeneralPath)shape).lineTo(8.978923, 21.954401);
((GeneralPath)shape).curveTo(7.4608207, 21.962502, 6.998228, 22.594587, 6.982603, 24.335226);
((GeneralPath)shape).lineTo(6.982603, 35.18088);
((GeneralPath)shape).curveTo(12.330783, 39.93756, 24.775284, 30.210882, 40.9826, 35.18088);
((GeneralPath)shape).lineTo(40.9826, 24.314186);
((GeneralPath)shape).curveTo(40.969994, 22.533916, 40.441753, 21.96814, 39.022896, 21.954401);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.0861629934643133E-7f, -0.987405002117157f));
// _0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6_0
paint = new LinearGradientPaint(new Point2D.Double(10.65084171295166, 2.913684129714966), new Point2D.Double(27.19227409362793, 17.47001075744629), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(202, 208, 198, 255),new Color(234, 236, 233, 255),new Color(197, 203, 192, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.9262789487838745f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.5, 20.234846);
((GeneralPath)shape).lineTo(10.5, 13.0);
((GeneralPath)shape).curveTo(10.5, 5.1298666, 15.897609, 1.3910066, 24.020027, 1.4892921);
((GeneralPath)shape).curveTo(32.18664, 1.5875777, 37.5, 5.037278, 37.5, 13.0);
((GeneralPath)shape).lineTo(37.5, 20.234846);
((GeneralPath)shape).curveTo(37.416054, 21.93843, 32.536613, 21.93215, 32.5, 20.234846);
((GeneralPath)shape).lineTo(32.5, 15.0);
((GeneralPath)shape).curveTo(32.5, 13.0, 33.138264, 6.528147, 24.077242, 6.528147);
((GeneralPath)shape).curveTo(14.953718, 6.528147, 15.489989, 13.039885, 15.52268, 14.992026);
((GeneralPath)shape).lineTo(15.52268, 20.268524);
((GeneralPath)shape).curveTo(15.3125, 21.859846, 10.5, 21.797346, 10.5, 20.234846);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(19.25061798095703, 9.66357707977295), new Point2D.Double(16.198251724243164, 6.039654731750488), new float[] {0.0f,1.0f}, new Color[] {new Color(111, 113, 109, 255),new Color(158, 160, 156, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.9262789487838745f));
stroke = new BasicStroke(0.9999996f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.5, 20.234846);
((GeneralPath)shape).lineTo(10.5, 13.0);
((GeneralPath)shape).curveTo(10.5, 5.1298666, 15.897609, 1.3910066, 24.020027, 1.4892921);
((GeneralPath)shape).curveTo(32.18664, 1.5875777, 37.5, 5.037278, 37.5, 13.0);
((GeneralPath)shape).lineTo(37.5, 20.234846);
((GeneralPath)shape).curveTo(37.416054, 21.93843, 32.536613, 21.93215, 32.5, 20.234846);
((GeneralPath)shape).lineTo(32.5, 15.0);
((GeneralPath)shape).curveTo(32.5, 13.0, 33.138264, 6.528147, 24.077242, 6.528147);
((GeneralPath)shape).curveTo(14.953718, 6.528147, 15.489989, 13.039885, 15.52268, 14.992026);
((GeneralPath)shape).lineTo(15.52268, 20.268524);
((GeneralPath)shape).curveTo(15.3125, 21.859846, 10.5, 21.797346, 10.5, 20.234846);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6_1
paint = new RadialGradientPaint(new Point2D.Double(12.184196472167969, 8.546343803405762), 3.6037734f, new Point2D.Double(12.184196472167969, 8.546343803405762), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 126)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.44134199619293213f, 3.7869648933410645f, -3.285907030105591f, -0.38293901085853577f, 47.91817855834961f, -38.448299407958984f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.496849, 13.160018);
((GeneralPath)shape).curveTo(11.745273, 8.76218, 12.91305, 4.7080564, 18.456118, 3.1987817);
((GeneralPath)shape).curveTo(20.036661, 5.0232134, 13.557817, 5.119544, 13.458448, 11.481749);
((GeneralPath)shape).curveTo(13.458448, 11.481749, 13.480108, 19.46426, 13.480108, 19.46426);
((GeneralPath)shape).curveTo(13.245273, 20.052649, 11.559349, 20.070826, 11.496849, 19.414576);
((GeneralPath)shape).lineTo(11.496849, 13.160018);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6_2
paint = new RadialGradientPaint(new Point2D.Double(30.996042251586914, 13.15640926361084), 1.000184f, new Point2D.Double(30.996042251586914, 13.15640926361084), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 0),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-5.316169904290291E-7f, 14.968979835510254f, -8.276676177978516f, 3.9688320248387754E-4f, 143.8948974609375f, -454.2723083496094f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.500366, 9.7120695);
((GeneralPath)shape).lineTo(35.500366, 9.7120695);
((GeneralPath)shape).lineTo(35.500366, 19.347483);
((GeneralPath)shape).curveTo(35.437866, 20.472483, 33.469116, 19.878733, 33.500366, 19.347483);
((GeneralPath)shape).lineTo(33.500366, 9.7120695);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6_2);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new LinearGradientPaint(new Point2D.Double(21.941509246826172, 21.55086898803711), new Point2D.Double(21.941509246826172, 18.037588119506836), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.9519230127334595f, 0.0f, 1.9759629964828491f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.5, 18.634618759155273, 33.0, 2.855769634246826, 2.400388479232788, 2.193695306777954);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

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

    /** The current width of this resizable icon. */
    private int width;

    /** The current height of this resizable icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public locked() {
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
    public void setDimension(Dimension newDimension) {
        this.width = newDimension.width;
        this.height = newDimension.height;
    }
    
    @Override
    public boolean isHiDpiAware() {
        return true;
    }

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
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
     * Returns an instance of this icon with specified dimensions.
     */
    public static SubstanceIcon of(int width, int height) {
       locked base = new locked();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       locked base = new locked();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

