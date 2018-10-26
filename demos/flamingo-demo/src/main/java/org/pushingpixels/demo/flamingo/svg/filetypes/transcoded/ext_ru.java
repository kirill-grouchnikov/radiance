package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.IsHiDpiAware;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.NeonIcon;
import org.pushingpixels.neon.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_ru implements ResizableIcon, IsHiDpiAware {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
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
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.9, 90.1);
((GeneralPath)shape).lineTo(18.9, 70.2);
((GeneralPath)shape).lineTo(27.4, 70.2);
((GeneralPath)shape).curveTo(29.5, 70.2, 31.1, 70.399994, 32.1, 70.7);
((GeneralPath)shape).curveTo(33.1, 71.0, 33.899998, 71.7, 34.399998, 72.6);
((GeneralPath)shape).curveTo(34.999996, 73.5, 35.3, 74.6, 35.3, 75.7);
((GeneralPath)shape).curveTo(35.3, 77.2, 34.899998, 78.399994, 34.0, 79.399994);
((GeneralPath)shape).curveTo(33.100002, 80.399994, 31.8, 80.99999, 30.0, 81.2);
((GeneralPath)shape).curveTo(30.9, 81.7, 31.6, 82.299995, 32.2, 82.899994);
((GeneralPath)shape).curveTo(32.8, 83.49999, 33.5, 84.59999, 34.5, 86.09999);
((GeneralPath)shape).lineTo(37.0, 90.0);
((GeneralPath)shape).lineTo(32.1, 90.0);
((GeneralPath)shape).lineTo(29.199999, 85.7);
((GeneralPath)shape).curveTo(28.199999, 84.2, 27.4, 83.2, 27.099998, 82.799995);
((GeneralPath)shape).curveTo(26.699999, 82.399994, 26.3, 82.1, 25.899998, 81.99999);
((GeneralPath)shape).curveTo(25.499998, 81.899994, 24.799997, 81.799995, 23.899998, 81.799995);
((GeneralPath)shape).lineTo(23.099998, 81.799995);
((GeneralPath)shape).lineTo(23.099998, 90.1);
((GeneralPath)shape).lineTo(18.899998, 90.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(22.9, 78.6);
((GeneralPath)shape).lineTo(25.9, 78.6);
((GeneralPath)shape).curveTo(27.8, 78.6, 29.1, 78.5, 29.5, 78.4);
((GeneralPath)shape).curveTo(29.9, 78.3, 30.4, 78.0, 30.6, 77.6);
((GeneralPath)shape).curveTo(30.9, 77.2, 31.0, 76.7, 31.0, 76.1);
((GeneralPath)shape).curveTo(31.0, 75.4, 30.8, 74.9, 30.5, 74.5);
((GeneralPath)shape).curveTo(30.1, 74.1, 29.6, 73.8, 29.0, 73.7);
((GeneralPath)shape).curveTo(28.7, 73.7, 27.7, 73.6, 26.0, 73.6);
((GeneralPath)shape).lineTo(22.8, 73.6);
((GeneralPath)shape).lineTo(22.8, 78.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.1, 70.2);
((GeneralPath)shape).lineTo(43.199997, 70.2);
((GeneralPath)shape).lineTo(43.199997, 81.0);
((GeneralPath)shape).curveTo(43.199997, 82.7, 43.199997, 83.8, 43.399998, 84.3);
((GeneralPath)shape).curveTo(43.6, 85.100006, 43.999996, 85.8, 44.6, 86.3);
((GeneralPath)shape).curveTo(45.3, 86.8, 46.1, 87.0, 47.3, 87.0);
((GeneralPath)shape).curveTo(48.5, 87.0, 49.3, 86.8, 49.899998, 86.3);
((GeneralPath)shape).curveTo(50.499996, 85.8, 50.8, 85.3, 50.999996, 84.600006);
((GeneralPath)shape).curveTo(51.199993, 83.90001, 51.199997, 82.8, 51.199997, 81.200005);
((GeneralPath)shape).lineTo(51.199997, 70.200005);
((GeneralPath)shape).lineTo(55.299995, 70.200005);
((GeneralPath)shape).lineTo(55.299995, 80.600006);
((GeneralPath)shape).curveTo(55.299995, 83.00001, 55.199997, 84.700005, 54.999996, 85.600006);
((GeneralPath)shape).curveTo(54.799995, 86.600006, 54.399998, 87.40001, 53.799995, 88.100006);
((GeneralPath)shape).curveTo(53.199993, 88.8, 52.399994, 89.3, 51.399994, 89.700005);
((GeneralPath)shape).curveTo(50.399994, 90.100006, 49.099995, 90.3, 47.499992, 90.3);
((GeneralPath)shape).curveTo(45.59999, 90.3, 44.09999, 90.100006, 43.09999, 89.600006);
((GeneralPath)shape).curveTo(42.09999, 89.200005, 41.29999, 88.600006, 40.69999, 87.90001);
((GeneralPath)shape).curveTo(40.09999, 87.20001, 39.69999, 86.50001, 39.59999, 85.70001);
((GeneralPath)shape).curveTo(39.29999, 84.60001, 39.19999, 82.90001, 39.19999, 80.70001);
((GeneralPath)shape).lineTo(39.19999, 70.2);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.8, 32.0);
((GeneralPath)shape).curveTo(31.699999, 32.1, 31.699999, 32.1, 31.8, 32.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new LinearGradientPaint(new Point2D.Double(18.0, 60.5), new Point2D.Double(54.0, 60.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 59.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 50.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 41.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 32.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 23.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 59.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 50.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 41.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 32.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 23.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 59.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 50.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 41.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 32.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 23.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_7);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.13099999725818634;
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
		return 0.7420064210891724;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. It is recommended to use the 
	 * {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	public ext_ru() {
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
       ext_ru base = new ext_ru();
       base.width = width;
       base.height = height;
       return new NeonIcon(base);
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_ru base = new ext_ru();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }
}

