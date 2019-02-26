package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_rub implements ResizableIcon {
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
((GeneralPath)shape).moveTo(8.9, 90.1);
((GeneralPath)shape).lineTo(8.9, 70.2);
((GeneralPath)shape).lineTo(17.4, 70.2);
((GeneralPath)shape).curveTo(19.5, 70.2, 21.1, 70.399994, 22.099998, 70.7);
((GeneralPath)shape).curveTo(23.099997, 71.0, 23.899998, 71.7, 24.399998, 72.6);
((GeneralPath)shape).curveTo(24.999998, 73.5, 25.299997, 74.6, 25.299997, 75.7);
((GeneralPath)shape).curveTo(25.299997, 77.2, 24.899998, 78.399994, 23.999998, 79.399994);
((GeneralPath)shape).curveTo(23.099998, 80.399994, 21.799997, 80.99999, 19.999998, 81.2);
((GeneralPath)shape).curveTo(20.899998, 81.7, 21.599998, 82.299995, 22.199999, 82.899994);
((GeneralPath)shape).curveTo(22.8, 83.49999, 23.499998, 84.59999, 24.499998, 86.09999);
((GeneralPath)shape).lineTo(27.0, 90.0);
((GeneralPath)shape).lineTo(22.1, 90.0);
((GeneralPath)shape).lineTo(19.2, 85.7);
((GeneralPath)shape).curveTo(18.2, 84.2, 17.400002, 83.2, 17.1, 82.799995);
((GeneralPath)shape).curveTo(16.7, 82.399994, 16.300001, 82.1, 15.900001, 81.99999);
((GeneralPath)shape).curveTo(15.500001, 81.899994, 14.8, 81.799995, 13.900001, 81.799995);
((GeneralPath)shape).lineTo(13.0, 81.799995);
((GeneralPath)shape).lineTo(13.0, 90.1);
((GeneralPath)shape).lineTo(8.9, 90.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(13.0, 78.6);
((GeneralPath)shape).lineTo(16.0, 78.6);
((GeneralPath)shape).curveTo(17.9, 78.6, 19.2, 78.5, 19.6, 78.4);
((GeneralPath)shape).curveTo(20.0, 78.3, 20.5, 78.0, 20.7, 77.6);
((GeneralPath)shape).curveTo(21.0, 77.2, 21.1, 76.7, 21.1, 76.1);
((GeneralPath)shape).curveTo(21.1, 75.4, 20.9, 74.9, 20.6, 74.5);
((GeneralPath)shape).curveTo(20.2, 74.1, 19.7, 73.8, 19.1, 73.7);
((GeneralPath)shape).curveTo(18.800001, 73.7, 17.800001, 73.6, 16.1, 73.6);
((GeneralPath)shape).lineTo(13.0, 73.6);
((GeneralPath)shape).lineTo(13.0, 78.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.1, 70.2);
((GeneralPath)shape).lineTo(33.2, 70.2);
((GeneralPath)shape).lineTo(33.2, 81.0);
((GeneralPath)shape).curveTo(33.2, 82.7, 33.3, 83.8, 33.4, 84.3);
((GeneralPath)shape).curveTo(33.600002, 85.100006, 34.0, 85.8, 34.600002, 86.3);
((GeneralPath)shape).curveTo(35.300003, 86.8, 36.100002, 87.0, 37.300003, 87.0);
((GeneralPath)shape).curveTo(38.500004, 87.0, 39.300003, 86.8, 39.9, 86.3);
((GeneralPath)shape).curveTo(40.5, 85.8, 40.800003, 85.3, 41.0, 84.600006);
((GeneralPath)shape).curveTo(41.199997, 83.90001, 41.2, 82.8, 41.2, 81.200005);
((GeneralPath)shape).lineTo(41.2, 70.200005);
((GeneralPath)shape).lineTo(45.3, 70.200005);
((GeneralPath)shape).lineTo(45.3, 80.600006);
((GeneralPath)shape).curveTo(45.3, 83.00001, 45.2, 84.700005, 45.0, 85.600006);
((GeneralPath)shape).curveTo(44.8, 86.600006, 44.4, 87.40001, 43.8, 88.100006);
((GeneralPath)shape).curveTo(43.199997, 88.8, 42.399998, 89.3, 41.399998, 89.700005);
((GeneralPath)shape).curveTo(40.399998, 90.100006, 39.1, 90.3, 37.499996, 90.3);
((GeneralPath)shape).curveTo(35.599995, 90.3, 34.099995, 90.100006, 33.099995, 89.600006);
((GeneralPath)shape).curveTo(32.099995, 89.200005, 31.299995, 88.600006, 30.699995, 87.90001);
((GeneralPath)shape).curveTo(30.099995, 87.20001, 29.699995, 86.50001, 29.599995, 85.70001);
((GeneralPath)shape).curveTo(29.299995, 84.60001, 29.199995, 82.90001, 29.199995, 80.70001);
((GeneralPath)shape).lineTo(29.199995, 70.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.5, 70.2);
((GeneralPath)shape).lineTo(57.5, 70.2);
((GeneralPath)shape).curveTo(59.1, 70.2, 60.3, 70.299995, 61.1, 70.399994);
((GeneralPath)shape).curveTo(61.899998, 70.49999, 62.6, 70.799995, 63.199997, 71.2);
((GeneralPath)shape).curveTo(63.799995, 71.6, 64.299995, 72.2, 64.7, 72.899994);
((GeneralPath)shape).curveTo(65.1, 73.59999, 65.299995, 74.399994, 65.299995, 75.2);
((GeneralPath)shape).curveTo(65.299995, 76.1, 64.99999, 77.0, 64.49999, 77.799995);
((GeneralPath)shape).curveTo(63.999992, 78.59999, 63.29999, 79.2, 62.399994, 79.49999);
((GeneralPath)shape).curveTo(63.599995, 79.899994, 64.59999, 80.49999, 65.2, 81.299995);
((GeneralPath)shape).curveTo(65.899994, 82.1, 66.2, 83.1, 66.2, 84.299995);
((GeneralPath)shape).curveTo(66.2, 85.2, 66.0, 86.1, 65.6, 86.899994);
((GeneralPath)shape).curveTo(65.2, 87.69999, 64.6, 88.399994, 63.899998, 88.899994);
((GeneralPath)shape).curveTo(63.199997, 89.399994, 62.3, 89.7, 61.199997, 89.799995);
((GeneralPath)shape).curveTo(60.499996, 89.899994, 58.899998, 89.899994, 56.299995, 89.899994);
((GeneralPath)shape).lineTo(49.499996, 89.899994);
((GeneralPath)shape).lineTo(49.499996, 70.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.5, 73.5);
((GeneralPath)shape).lineTo(53.5, 78.1);
((GeneralPath)shape).lineTo(56.2, 78.1);
((GeneralPath)shape).curveTo(57.8, 78.1, 58.8, 78.1, 59.100002, 78.0);
((GeneralPath)shape).curveTo(59.800003, 77.9, 60.300003, 77.7, 60.7, 77.3);
((GeneralPath)shape).curveTo(61.1, 76.90001, 61.3, 76.4, 61.3, 75.8);
((GeneralPath)shape).curveTo(61.3, 75.200005, 61.1, 74.700005, 60.8, 74.3);
((GeneralPath)shape).curveTo(60.5, 73.9, 59.899998, 73.700005, 59.3, 73.600006);
((GeneralPath)shape).curveTo(58.899998, 73.600006, 57.7, 73.50001, 55.8, 73.50001);
((GeneralPath)shape).lineTo(53.5, 73.50001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.5, 81.4);
((GeneralPath)shape).lineTo(53.5, 86.700005);
((GeneralPath)shape).lineTo(57.3, 86.700005);
((GeneralPath)shape).curveTo(58.8, 86.700005, 59.7, 86.700005, 60.1, 86.600006);
((GeneralPath)shape).curveTo(60.699997, 86.50001, 61.199997, 86.200005, 61.6, 85.8);
((GeneralPath)shape).curveTo(62.0, 85.4, 62.199997, 84.8, 62.199997, 84.100006);
((GeneralPath)shape).curveTo(62.199997, 83.50001, 62.1, 83.00001, 61.799995, 82.600006);
((GeneralPath)shape).curveTo(61.499996, 82.200005, 61.099995, 81.90001, 60.499996, 81.700005);
((GeneralPath)shape).curveTo(59.899998, 81.50001, 58.699997, 81.4, 56.899998, 81.4);
((GeneralPath)shape).lineTo(53.499996, 81.4);
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
        return 0.13099998235702515;
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
		return 0.7420000433921814;
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
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_rub() {
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
	public void paintIcon(Component c, Graphics g, int x, int y) {
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
       ext_rub base = new ext_rub();
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
       ext_rub base = new ext_rub();
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
        return () -> new ext_rub();
    }
}

