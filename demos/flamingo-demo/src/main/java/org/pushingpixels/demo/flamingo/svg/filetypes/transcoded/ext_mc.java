package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_mc implements ResizableIcon {
    

    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Shape clip = null;

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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.6, 90.1);
((GeneralPath)shape).lineTo(16.6, 70.2);
((GeneralPath)shape).lineTo(22.7, 70.2);
((GeneralPath)shape).lineTo(26.300001, 83.7);
((GeneralPath)shape).lineTo(30.0, 70.2);
((GeneralPath)shape).lineTo(36.1, 70.2);
((GeneralPath)shape).lineTo(36.1, 90.0);
((GeneralPath)shape).lineTo(32.3, 90.0);
((GeneralPath)shape).lineTo(32.3, 74.5);
((GeneralPath)shape).lineTo(28.3, 90.1);
((GeneralPath)shape).lineTo(24.4, 90.1);
((GeneralPath)shape).lineTo(20.4, 74.5);
((GeneralPath)shape).lineTo(20.4, 90.1);
((GeneralPath)shape).lineTo(16.6, 90.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.0, 82.8);
((GeneralPath)shape).lineTo(56.9, 84.0);
((GeneralPath)shape).curveTo(56.300003, 86.2, 55.300003, 87.8, 53.9, 88.8);
((GeneralPath)shape).curveTo(52.5, 89.9, 50.7, 90.4, 48.600002, 90.4);
((GeneralPath)shape).curveTo(45.9, 90.4, 43.7, 89.5, 42.000004, 87.700005);
((GeneralPath)shape).curveTo(40.300003, 85.9, 39.400005, 83.4, 39.400005, 80.3);
((GeneralPath)shape).curveTo(39.400005, 77.0, 40.300007, 74.4, 42.000004, 72.600006);
((GeneralPath)shape).curveTo(43.700005, 70.8, 46.000004, 69.90001, 48.800003, 69.90001);
((GeneralPath)shape).curveTo(51.300003, 69.90001, 53.300003, 70.600006, 54.800003, 72.100006);
((GeneralPath)shape).curveTo(55.700005, 72.90001, 56.4, 74.200005, 56.9, 75.8);
((GeneralPath)shape).lineTo(52.9, 76.700005);
((GeneralPath)shape).curveTo(52.7, 75.700005, 52.2, 74.9, 51.4, 74.3);
((GeneralPath)shape).curveTo(50.600002, 73.700005, 49.7, 73.4, 48.600002, 73.4);
((GeneralPath)shape).curveTo(47.100002, 73.4, 45.9, 73.9, 45.000004, 75.0);
((GeneralPath)shape).curveTo(44.000004, 76.0, 43.600002, 77.7, 43.600002, 80.0);
((GeneralPath)shape).curveTo(43.600002, 82.5, 44.100002, 84.3, 45.000004, 85.4);
((GeneralPath)shape).curveTo(45.900005, 86.5, 47.000004, 87.0, 48.500004, 87.0);
((GeneralPath)shape).curveTo(49.600002, 87.0, 50.500004, 86.7, 51.300003, 86.0);
((GeneralPath)shape).curveTo(52.100002, 85.3, 52.600002, 84.2, 53.000004, 82.8);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.8, 32.0);
((GeneralPath)shape).curveTo(31.699999, 32.1, 31.699999, 32.1, 31.8, 32.0);
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
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
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 45.0);
((GeneralPath)shape).curveTo(53.2, 39.7, 47.6, 36.2, 43.4, 33.6);
((GeneralPath)shape).curveTo(41.600002, 32.5, 38.600002, 30.999998, 38.300003, 28.599998);
((GeneralPath)shape).curveTo(38.100002, 27.599998, 38.100002, 26.599998, 38.100002, 25.599998);
((GeneralPath)shape).curveTo(38.100002, 25.199999, 38.100002, 24.8, 38.000004, 24.399998);
((GeneralPath)shape).curveTo(38.000004, 23.899998, 37.400005, 24.499998, 37.200005, 24.099998);
((GeneralPath)shape).curveTo(36.500004, 22.999998, 36.800003, 24.399998, 36.800003, 24.999998);
((GeneralPath)shape).curveTo(37.000004, 26.299997, 37.100002, 27.699999, 37.100002, 28.999998);
((GeneralPath)shape).curveTo(37.100002, 31.599998, 36.7, 34.1, 36.000004, 36.6);
((GeneralPath)shape).curveTo(34.500004, 42.399998, 33.300003, 48.399998, 34.800003, 54.399998);
((GeneralPath)shape).curveTo(35.100002, 55.6, 35.500004, 56.899998, 36.000004, 57.999996);
((GeneralPath)shape).curveTo(36.200005, 58.399998, 36.500004, 59.299995, 36.900005, 59.499996);
((GeneralPath)shape).curveTo(38.500004, 59.899998, 39.700005, 59.999996, 41.000004, 61.199997);
((GeneralPath)shape).curveTo(41.800003, 61.899998, 42.400005, 61.499996, 43.300003, 61.199997);
((GeneralPath)shape).curveTo(46.100002, 60.1, 48.600002, 58.6, 50.600002, 56.299995);
((GeneralPath)shape).curveTo(53.500004, 53.099995, 54.7, 49.299995, 54.000004, 44.999996);
((GeneralPath)shape).moveTo(51.000004, 50.399998);
((GeneralPath)shape).curveTo(50.700005, 52.6, 49.400005, 54.499996, 48.000004, 56.199997);
((GeneralPath)shape).curveTo(47.000004, 57.399998, 45.600002, 58.899998, 44.100002, 59.399998);
((GeneralPath)shape).curveTo(43.600002, 59.6, 44.2, 58.499996, 44.300003, 58.399998);
((GeneralPath)shape).curveTo(44.800003, 57.699997, 45.300003, 57.1, 45.9, 56.399998);
((GeneralPath)shape).curveTo(46.7, 55.399998, 47.4, 54.399998, 47.800003, 53.3);
((GeneralPath)shape).curveTo(49.300003, 49.399998, 49.000004, 44.8, 46.700005, 41.3);
((GeneralPath)shape).curveTo(45.500004, 39.399998, 43.800003, 37.8, 42.100006, 36.399998);
((GeneralPath)shape).curveTo(41.300007, 35.699997, 40.400005, 34.999996, 39.700005, 34.199997);
((GeneralPath)shape).curveTo(39.500004, 33.999996, 38.100006, 32.1, 38.600006, 31.899998);
((GeneralPath)shape).curveTo(38.700005, 31.799997, 41.800007, 35.1, 42.200005, 35.3);
((GeneralPath)shape).curveTo(43.500004, 36.3, 44.800003, 37.2, 46.000004, 38.3);
((GeneralPath)shape).curveTo(47.600002, 39.8, 49.300003, 41.399998, 50.200005, 43.399998);
((GeneralPath)shape).curveTo(51.100006, 45.499996, 51.300003, 47.999996, 51.000004, 50.399998);
paint = new LinearGradientPaint(new Point2D.Double(44.178001403808594, 61.7239990234375), new Point2D.Double(44.178001403808594, 23.770999908447266), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.6, 18.8);
((GeneralPath)shape).curveTo(36.1, 19.099998, 36.199997, 20.9, 36.199997, 22.599998);
((GeneralPath)shape).curveTo(36.199997, 24.3, 36.399998, 31.399998, 35.799995, 33.3);
((GeneralPath)shape).curveTo(35.299995, 35.2, 34.099995, 37.3, 32.799995, 39.2);
((GeneralPath)shape).curveTo(31.499996, 41.100002, 29.999996, 45.0, 30.099995, 47.4);
((GeneralPath)shape).curveTo(30.199995, 49.800003, 31.499994, 53.800003, 32.599995, 55.5);
((GeneralPath)shape).curveTo(33.699993, 57.2, 35.499996, 59.5, 35.099995, 60.0);
((GeneralPath)shape).curveTo(34.399994, 60.9, 31.399994, 57.7, 29.899994, 55.9);
((GeneralPath)shape).curveTo(28.299994, 54.0, 26.799994, 50.300003, 26.699993, 47.300003);
((GeneralPath)shape).curveTo(26.599993, 44.4, 28.299994, 41.600002, 29.499992, 40.000004);
((GeneralPath)shape).curveTo(30.699993, 38.300003, 32.999992, 35.500004, 33.59999, 34.200005);
((GeneralPath)shape).curveTo(34.19999, 32.900005, 34.89999, 31.500004, 35.09999, 29.700005);
((GeneralPath)shape).curveTo(35.29999, 27.900005, 35.09999, 21.400005, 35.09999, 21.400005);
((GeneralPath)shape).curveTo(35.09999, 21.400005, 35.19999, 18.500006, 35.59999, 18.800005);
paint = new LinearGradientPaint(new Point2D.Double(31.518999099731445, 60.15999984741211), new Point2D.Double(31.518999099731445, 18.820999145507812), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
shape = new GeneralPath();
((GeneralPath)shape).moveTo(34.4, 21.9);
((GeneralPath)shape).curveTo(34.9, 22.1, 34.9, 22.699999, 34.9, 23.199999);
((GeneralPath)shape).curveTo(34.9, 23.8, 34.7, 26.099998, 34.600002, 28.399998);
((GeneralPath)shape).curveTo(34.4, 30.699997, 32.600002, 32.6, 31.300003, 33.899998);
((GeneralPath)shape).curveTo(30.000004, 35.199997, 26.100002, 39.399998, 24.600002, 41.499996);
((GeneralPath)shape).curveTo(23.200003, 43.599995, 22.400002, 46.299995, 22.600002, 48.599995);
((GeneralPath)shape).curveTo(22.800003, 50.899994, 23.300003, 53.199993, 25.500002, 55.599995);
((GeneralPath)shape).curveTo(27.700003, 57.999996, 29.200003, 59.199993, 30.300003, 59.699993);
((GeneralPath)shape).curveTo(31.400003, 60.29999, 32.600002, 60.699993, 32.300003, 61.199993);
((GeneralPath)shape).curveTo(32.000004, 61.699993, 31.000004, 61.399994, 29.800003, 60.899994);
((GeneralPath)shape).curveTo(28.600002, 60.499992, 24.600002, 58.799995, 22.300003, 56.199993);
((GeneralPath)shape).curveTo(20.000004, 53.59999, 18.800003, 49.999992, 18.900003, 46.699993);
((GeneralPath)shape).curveTo(19.000004, 43.29999, 19.900003, 41.899994, 21.500004, 39.79999);
((GeneralPath)shape).curveTo(23.100004, 37.59999, 27.300003, 34.39999, 28.700005, 33.59999);
((GeneralPath)shape).curveTo(30.000004, 32.79999, 31.900005, 31.39999, 32.700005, 30.199991);
((GeneralPath)shape).curveTo(33.600006, 29.09999, 34.000004, 28.09999, 34.000004, 26.59999);
((GeneralPath)shape).curveTo(33.900005, 24.99999, 34.100002, 23.699991, 34.100002, 23.09999);
((GeneralPath)shape).curveTo(33.9, 22.699991, 33.9, 21.699991, 34.4, 21.89999);
paint = new LinearGradientPaint(new Point2D.Double(26.878999710083008, 61.54199981689453), new Point2D.Double(26.878999710083008, 21.868000030517578), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
shape = new GeneralPath();
((GeneralPath)shape).moveTo(34.5, 62.4);
((GeneralPath)shape).curveTo(34.7, 62.4, 34.6, 63.300003, 34.2, 63.800003);
((GeneralPath)shape).curveTo(33.8, 64.3, 33.2, 64.5, 33.100002, 64.3);
((GeneralPath)shape).curveTo(33.000004, 64.100006, 33.600002, 64.0, 34.000004, 63.600002);
((GeneralPath)shape).curveTo(34.400005, 63.2, 34.300003, 62.4, 34.500004, 62.4);
paint = new LinearGradientPaint(new Point2D.Double(33.888999938964844, 64.37000274658203), new Point2D.Double(33.888999938964844, 62.41600036621094), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.7, 62.4);
((GeneralPath)shape).curveTo(38.5, 62.4, 38.600002, 63.300003, 39.0, 63.800003);
((GeneralPath)shape).curveTo(39.4, 64.3, 40.0, 64.5, 40.1, 64.3);
((GeneralPath)shape).curveTo(40.199997, 64.100006, 39.6, 64.0, 39.199997, 63.600002);
((GeneralPath)shape).curveTo(38.899998, 63.2, 38.999996, 62.4, 38.699997, 62.4);
paint = new LinearGradientPaint(new Point2D.Double(39.361000061035156, 64.34600067138672), new Point2D.Double(39.361000061035156, 62.391998291015625), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_11
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.9, 63.4);
((GeneralPath)shape).curveTo(36.9, 64.200005, 36.9, 64.8, 36.800003, 64.8);
((GeneralPath)shape).curveTo(36.600002, 64.8, 36.700005, 64.200005, 36.700005, 63.4);
((GeneralPath)shape).curveTo(36.700005, 62.600002, 36.600006, 62.0, 36.800003, 62.0);
((GeneralPath)shape).curveTo(36.9, 61.9, 36.9, 62.6, 36.9, 63.4);
paint = new LinearGradientPaint(new Point2D.Double(36.72100067138672, 64.82099914550781), new Point2D.Double(36.72100067138672, 61.939998626708984), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_12
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 45.0);
((GeneralPath)shape).curveTo(53.2, 39.7, 47.6, 36.2, 43.4, 33.6);
((GeneralPath)shape).curveTo(41.600002, 32.5, 38.600002, 30.999998, 38.300003, 28.599998);
((GeneralPath)shape).curveTo(38.100002, 27.599998, 38.100002, 26.599998, 38.100002, 25.599998);
((GeneralPath)shape).curveTo(38.100002, 25.199999, 38.100002, 24.8, 38.000004, 24.399998);
((GeneralPath)shape).curveTo(38.000004, 23.899998, 37.400005, 24.499998, 37.200005, 24.099998);
((GeneralPath)shape).curveTo(36.500004, 22.999998, 36.800003, 24.399998, 36.800003, 24.999998);
((GeneralPath)shape).curveTo(37.000004, 26.299997, 37.100002, 27.699999, 37.100002, 28.999998);
((GeneralPath)shape).curveTo(37.100002, 31.599998, 36.7, 34.1, 36.000004, 36.6);
((GeneralPath)shape).curveTo(34.500004, 42.399998, 33.300003, 48.399998, 34.800003, 54.399998);
((GeneralPath)shape).curveTo(35.100002, 55.6, 35.500004, 56.899998, 36.000004, 57.999996);
((GeneralPath)shape).curveTo(36.200005, 58.399998, 36.500004, 59.299995, 36.900005, 59.499996);
((GeneralPath)shape).curveTo(38.500004, 59.899998, 39.700005, 59.999996, 41.000004, 61.199997);
((GeneralPath)shape).curveTo(41.800003, 61.899998, 42.400005, 61.499996, 43.300003, 61.199997);
((GeneralPath)shape).curveTo(46.100002, 60.1, 48.600002, 58.6, 50.600002, 56.299995);
((GeneralPath)shape).curveTo(53.500004, 53.099995, 54.7, 49.299995, 54.000004, 44.999996);
((GeneralPath)shape).moveTo(51.000004, 50.399998);
((GeneralPath)shape).curveTo(50.700005, 52.6, 49.400005, 54.499996, 48.000004, 56.199997);
((GeneralPath)shape).curveTo(47.000004, 57.399998, 45.600002, 58.899998, 44.100002, 59.399998);
((GeneralPath)shape).curveTo(43.600002, 59.6, 44.2, 58.499996, 44.300003, 58.399998);
((GeneralPath)shape).curveTo(44.800003, 57.699997, 45.300003, 57.1, 45.9, 56.399998);
((GeneralPath)shape).curveTo(46.7, 55.399998, 47.4, 54.399998, 47.800003, 53.3);
((GeneralPath)shape).curveTo(49.300003, 49.399998, 49.000004, 44.8, 46.700005, 41.3);
((GeneralPath)shape).curveTo(45.500004, 39.399998, 43.800003, 37.8, 42.100006, 36.399998);
((GeneralPath)shape).curveTo(41.300007, 35.699997, 40.400005, 34.999996, 39.700005, 34.199997);
((GeneralPath)shape).curveTo(39.500004, 33.999996, 38.100006, 32.1, 38.600006, 31.899998);
((GeneralPath)shape).curveTo(38.700005, 31.799997, 41.800007, 35.1, 42.200005, 35.3);
((GeneralPath)shape).curveTo(43.500004, 36.3, 44.800003, 37.2, 46.000004, 38.3);
((GeneralPath)shape).curveTo(47.600002, 39.8, 49.300003, 41.399998, 50.200005, 43.399998);
((GeneralPath)shape).curveTo(51.100006, 45.499996, 51.300003, 47.999996, 51.000004, 50.399998);
paint = new LinearGradientPaint(new Point2D.Double(44.178001403808594, 61.7239990234375), new Point2D.Double(44.178001403808594, 23.770999908447266), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_13
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.6, 18.8);
((GeneralPath)shape).curveTo(36.1, 19.099998, 36.199997, 20.9, 36.199997, 22.599998);
((GeneralPath)shape).curveTo(36.199997, 24.3, 36.399998, 31.399998, 35.799995, 33.3);
((GeneralPath)shape).curveTo(35.299995, 35.2, 34.099995, 37.3, 32.799995, 39.2);
((GeneralPath)shape).curveTo(31.499996, 41.100002, 29.999996, 45.0, 30.099995, 47.4);
((GeneralPath)shape).curveTo(30.199995, 49.800003, 31.499994, 53.800003, 32.599995, 55.5);
((GeneralPath)shape).curveTo(33.699993, 57.2, 35.499996, 59.5, 35.099995, 60.0);
((GeneralPath)shape).curveTo(34.399994, 60.9, 31.399994, 57.7, 29.899994, 55.9);
((GeneralPath)shape).curveTo(28.299994, 54.0, 26.799994, 50.300003, 26.699993, 47.300003);
((GeneralPath)shape).curveTo(26.599993, 44.4, 28.299994, 41.600002, 29.499992, 40.000004);
((GeneralPath)shape).curveTo(30.699993, 38.300003, 32.999992, 35.500004, 33.59999, 34.200005);
((GeneralPath)shape).curveTo(34.19999, 32.900005, 34.89999, 31.500004, 35.09999, 29.700005);
((GeneralPath)shape).curveTo(35.29999, 27.900005, 35.09999, 21.400005, 35.09999, 21.400005);
((GeneralPath)shape).curveTo(35.09999, 21.400005, 35.19999, 18.500006, 35.59999, 18.800005);
paint = new LinearGradientPaint(new Point2D.Double(31.518999099731445, 60.15999984741211), new Point2D.Double(31.518999099731445, 18.820999145507812), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_13);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_14 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_14
shape = new GeneralPath();
((GeneralPath)shape).moveTo(34.4, 21.9);
((GeneralPath)shape).curveTo(34.9, 22.1, 34.9, 22.699999, 34.9, 23.199999);
((GeneralPath)shape).curveTo(34.9, 23.8, 34.7, 26.099998, 34.600002, 28.399998);
((GeneralPath)shape).curveTo(34.4, 30.699997, 32.600002, 32.6, 31.300003, 33.899998);
((GeneralPath)shape).curveTo(30.000004, 35.199997, 26.100002, 39.399998, 24.600002, 41.499996);
((GeneralPath)shape).curveTo(23.200003, 43.599995, 22.400002, 46.299995, 22.600002, 48.599995);
((GeneralPath)shape).curveTo(22.800003, 50.899994, 23.300003, 53.199993, 25.500002, 55.599995);
((GeneralPath)shape).curveTo(27.700003, 57.999996, 29.200003, 59.199993, 30.300003, 59.699993);
((GeneralPath)shape).curveTo(31.400003, 60.29999, 32.600002, 60.699993, 32.300003, 61.199993);
((GeneralPath)shape).curveTo(32.000004, 61.699993, 31.000004, 61.399994, 29.800003, 60.899994);
((GeneralPath)shape).curveTo(28.600002, 60.499992, 24.600002, 58.799995, 22.300003, 56.199993);
((GeneralPath)shape).curveTo(20.000004, 53.59999, 18.800003, 49.999992, 18.900003, 46.699993);
((GeneralPath)shape).curveTo(19.000004, 43.29999, 19.900003, 41.899994, 21.500004, 39.79999);
((GeneralPath)shape).curveTo(23.100004, 37.59999, 27.300003, 34.39999, 28.700005, 33.59999);
((GeneralPath)shape).curveTo(30.000004, 32.79999, 31.900005, 31.39999, 32.700005, 30.199991);
((GeneralPath)shape).curveTo(33.600006, 29.09999, 34.000004, 28.09999, 34.000004, 26.59999);
((GeneralPath)shape).curveTo(33.900005, 24.99999, 34.100002, 23.699991, 34.100002, 23.09999);
((GeneralPath)shape).curveTo(33.9, 22.699991, 33.9, 21.699991, 34.4, 21.89999);
paint = new LinearGradientPaint(new Point2D.Double(26.878999710083008, 61.54199981689453), new Point2D.Double(26.878999710083008, 21.868000030517578), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_14);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_15 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_15
shape = new GeneralPath();
((GeneralPath)shape).moveTo(34.5, 62.4);
((GeneralPath)shape).curveTo(34.7, 62.4, 34.6, 63.300003, 34.2, 63.800003);
((GeneralPath)shape).curveTo(33.8, 64.3, 33.2, 64.5, 33.100002, 64.3);
((GeneralPath)shape).curveTo(33.000004, 64.100006, 33.600002, 64.0, 34.000004, 63.600002);
((GeneralPath)shape).curveTo(34.400005, 63.2, 34.300003, 62.4, 34.500004, 62.4);
paint = new LinearGradientPaint(new Point2D.Double(33.888999938964844, 64.37000274658203), new Point2D.Double(33.888999938964844, 62.41600036621094), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_16 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_16
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.7, 62.4);
((GeneralPath)shape).curveTo(38.5, 62.4, 38.600002, 63.300003, 39.0, 63.800003);
((GeneralPath)shape).curveTo(39.4, 64.3, 40.0, 64.5, 40.1, 64.3);
((GeneralPath)shape).curveTo(40.199997, 64.100006, 39.6, 64.0, 39.199997, 63.600002);
((GeneralPath)shape).curveTo(38.899998, 63.2, 38.999996, 62.4, 38.699997, 62.4);
paint = new LinearGradientPaint(new Point2D.Double(39.361000061035156, 64.34600067138672), new Point2D.Double(39.361000061035156, 62.391998291015625), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_16);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_17 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_17
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.9, 63.4);
((GeneralPath)shape).curveTo(36.9, 64.200005, 36.9, 64.8, 36.800003, 64.8);
((GeneralPath)shape).curveTo(36.600002, 64.8, 36.700005, 64.200005, 36.700005, 63.4);
((GeneralPath)shape).curveTo(36.700005, 62.600002, 36.600006, 62.0, 36.800003, 62.0);
((GeneralPath)shape).curveTo(36.9, 61.9, 36.9, 62.6, 36.9, 63.4);
paint = new LinearGradientPaint(new Point2D.Double(36.72100067138672, 64.82099914550781), new Point2D.Double(36.72100067138672, 61.939998626708984), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_17);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_18 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_18
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 45.0);
((GeneralPath)shape).curveTo(53.2, 39.7, 47.6, 36.2, 43.4, 33.6);
((GeneralPath)shape).curveTo(41.600002, 32.5, 38.600002, 30.999998, 38.300003, 28.599998);
((GeneralPath)shape).curveTo(38.100002, 27.599998, 38.100002, 26.599998, 38.100002, 25.599998);
((GeneralPath)shape).curveTo(38.100002, 25.199999, 38.100002, 24.8, 38.000004, 24.399998);
((GeneralPath)shape).curveTo(38.000004, 23.899998, 37.400005, 24.499998, 37.200005, 24.099998);
((GeneralPath)shape).curveTo(36.500004, 22.999998, 36.800003, 24.399998, 36.800003, 24.999998);
((GeneralPath)shape).curveTo(37.000004, 26.299997, 37.100002, 27.699999, 37.100002, 28.999998);
((GeneralPath)shape).curveTo(37.100002, 31.599998, 36.7, 34.1, 36.000004, 36.6);
((GeneralPath)shape).curveTo(34.500004, 42.399998, 33.300003, 48.399998, 34.800003, 54.399998);
((GeneralPath)shape).curveTo(35.100002, 55.6, 35.500004, 56.899998, 36.000004, 57.999996);
((GeneralPath)shape).curveTo(36.200005, 58.399998, 36.500004, 59.299995, 36.900005, 59.499996);
((GeneralPath)shape).curveTo(38.500004, 59.899998, 39.700005, 59.999996, 41.000004, 61.199997);
((GeneralPath)shape).curveTo(41.800003, 61.899998, 42.400005, 61.499996, 43.300003, 61.199997);
((GeneralPath)shape).curveTo(46.100002, 60.1, 48.600002, 58.6, 50.600002, 56.299995);
((GeneralPath)shape).curveTo(53.500004, 53.099995, 54.7, 49.299995, 54.000004, 44.999996);
((GeneralPath)shape).moveTo(51.000004, 50.399998);
((GeneralPath)shape).curveTo(50.700005, 52.6, 49.400005, 54.499996, 48.000004, 56.199997);
((GeneralPath)shape).curveTo(47.000004, 57.399998, 45.600002, 58.899998, 44.100002, 59.399998);
((GeneralPath)shape).curveTo(43.600002, 59.6, 44.2, 58.499996, 44.300003, 58.399998);
((GeneralPath)shape).curveTo(44.800003, 57.699997, 45.300003, 57.1, 45.9, 56.399998);
((GeneralPath)shape).curveTo(46.7, 55.399998, 47.4, 54.399998, 47.800003, 53.3);
((GeneralPath)shape).curveTo(49.300003, 49.399998, 49.000004, 44.8, 46.700005, 41.3);
((GeneralPath)shape).curveTo(45.500004, 39.399998, 43.800003, 37.8, 42.100006, 36.399998);
((GeneralPath)shape).curveTo(41.300007, 35.699997, 40.400005, 34.999996, 39.700005, 34.199997);
((GeneralPath)shape).curveTo(39.500004, 33.999996, 38.100006, 32.1, 38.600006, 31.899998);
((GeneralPath)shape).curveTo(38.700005, 31.799997, 41.800007, 35.1, 42.200005, 35.3);
((GeneralPath)shape).curveTo(43.500004, 36.3, 44.800003, 37.2, 46.000004, 38.3);
((GeneralPath)shape).curveTo(47.600002, 39.8, 49.300003, 41.399998, 50.200005, 43.399998);
((GeneralPath)shape).curveTo(51.100006, 45.499996, 51.300003, 47.999996, 51.000004, 50.399998);
paint = new LinearGradientPaint(new Point2D.Double(44.178001403808594, 61.7239990234375), new Point2D.Double(44.178001403808594, 23.770999908447266), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_18);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_19 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_19
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.6, 18.8);
((GeneralPath)shape).curveTo(36.1, 19.099998, 36.199997, 20.9, 36.199997, 22.599998);
((GeneralPath)shape).curveTo(36.199997, 24.3, 36.399998, 31.399998, 35.799995, 33.3);
((GeneralPath)shape).curveTo(35.299995, 35.2, 34.099995, 37.3, 32.799995, 39.2);
((GeneralPath)shape).curveTo(31.499996, 41.100002, 29.999996, 45.0, 30.099995, 47.4);
((GeneralPath)shape).curveTo(30.199995, 49.800003, 31.499994, 53.800003, 32.599995, 55.5);
((GeneralPath)shape).curveTo(33.699993, 57.2, 35.499996, 59.5, 35.099995, 60.0);
((GeneralPath)shape).curveTo(34.399994, 60.9, 31.399994, 57.7, 29.899994, 55.9);
((GeneralPath)shape).curveTo(28.299994, 54.0, 26.799994, 50.300003, 26.699993, 47.300003);
((GeneralPath)shape).curveTo(26.599993, 44.4, 28.299994, 41.600002, 29.499992, 40.000004);
((GeneralPath)shape).curveTo(30.699993, 38.300003, 32.999992, 35.500004, 33.59999, 34.200005);
((GeneralPath)shape).curveTo(34.19999, 32.900005, 34.89999, 31.500004, 35.09999, 29.700005);
((GeneralPath)shape).curveTo(35.29999, 27.900005, 35.09999, 21.400005, 35.09999, 21.400005);
((GeneralPath)shape).curveTo(35.09999, 21.400005, 35.19999, 18.500006, 35.59999, 18.800005);
paint = new LinearGradientPaint(new Point2D.Double(31.518999099731445, 60.15999984741211), new Point2D.Double(31.518999099731445, 18.820999145507812), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_19);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_20 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_20
shape = new GeneralPath();
((GeneralPath)shape).moveTo(34.4, 21.9);
((GeneralPath)shape).curveTo(34.9, 22.1, 34.9, 22.699999, 34.9, 23.199999);
((GeneralPath)shape).curveTo(34.9, 23.8, 34.7, 26.099998, 34.600002, 28.399998);
((GeneralPath)shape).curveTo(34.4, 30.699997, 32.600002, 32.6, 31.300003, 33.899998);
((GeneralPath)shape).curveTo(30.000004, 35.199997, 26.100002, 39.399998, 24.600002, 41.499996);
((GeneralPath)shape).curveTo(23.200003, 43.599995, 22.400002, 46.299995, 22.600002, 48.599995);
((GeneralPath)shape).curveTo(22.800003, 50.899994, 23.300003, 53.199993, 25.500002, 55.599995);
((GeneralPath)shape).curveTo(27.700003, 57.999996, 29.200003, 59.199993, 30.300003, 59.699993);
((GeneralPath)shape).curveTo(31.400003, 60.29999, 32.600002, 60.699993, 32.300003, 61.199993);
((GeneralPath)shape).curveTo(32.000004, 61.699993, 31.000004, 61.399994, 29.800003, 60.899994);
((GeneralPath)shape).curveTo(28.600002, 60.499992, 24.600002, 58.799995, 22.300003, 56.199993);
((GeneralPath)shape).curveTo(20.000004, 53.59999, 18.800003, 49.999992, 18.900003, 46.699993);
((GeneralPath)shape).curveTo(19.000004, 43.29999, 19.900003, 41.899994, 21.500004, 39.79999);
((GeneralPath)shape).curveTo(23.100004, 37.59999, 27.300003, 34.39999, 28.700005, 33.59999);
((GeneralPath)shape).curveTo(30.000004, 32.79999, 31.900005, 31.39999, 32.700005, 30.199991);
((GeneralPath)shape).curveTo(33.600006, 29.09999, 34.000004, 28.09999, 34.000004, 26.59999);
((GeneralPath)shape).curveTo(33.900005, 24.99999, 34.100002, 23.699991, 34.100002, 23.09999);
((GeneralPath)shape).curveTo(33.9, 22.699991, 33.9, 21.699991, 34.4, 21.89999);
paint = new LinearGradientPaint(new Point2D.Double(26.878999710083008, 61.54199981689453), new Point2D.Double(26.878999710083008, 21.868000030517578), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_20);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_21 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_21
shape = new GeneralPath();
((GeneralPath)shape).moveTo(34.5, 62.4);
((GeneralPath)shape).curveTo(34.7, 62.4, 34.6, 63.300003, 34.2, 63.800003);
((GeneralPath)shape).curveTo(33.8, 64.3, 33.2, 64.5, 33.100002, 64.3);
((GeneralPath)shape).curveTo(33.000004, 64.100006, 33.600002, 64.0, 34.000004, 63.600002);
((GeneralPath)shape).curveTo(34.400005, 63.2, 34.300003, 62.4, 34.500004, 62.4);
paint = new LinearGradientPaint(new Point2D.Double(33.888999938964844, 64.37000274658203), new Point2D.Double(33.888999938964844, 62.41600036621094), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_21);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_22 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_22
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.7, 62.4);
((GeneralPath)shape).curveTo(38.5, 62.4, 38.600002, 63.300003, 39.0, 63.800003);
((GeneralPath)shape).curveTo(39.4, 64.3, 40.0, 64.5, 40.1, 64.3);
((GeneralPath)shape).curveTo(40.199997, 64.100006, 39.6, 64.0, 39.199997, 63.600002);
((GeneralPath)shape).curveTo(38.899998, 63.2, 38.999996, 62.4, 38.699997, 62.4);
paint = new LinearGradientPaint(new Point2D.Double(39.361000061035156, 64.34600067138672), new Point2D.Double(39.361000061035156, 62.391998291015625), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_22);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_23 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_23
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.9, 63.4);
((GeneralPath)shape).curveTo(36.9, 64.200005, 36.9, 64.8, 36.800003, 64.8);
((GeneralPath)shape).curveTo(36.600002, 64.8, 36.700005, 64.200005, 36.700005, 63.4);
((GeneralPath)shape).curveTo(36.700005, 62.600002, 36.600006, 62.0, 36.800003, 62.0);
((GeneralPath)shape).curveTo(36.9, 61.9, 36.9, 62.6, 36.9, 63.4);
paint = new LinearGradientPaint(new Point2D.Double(36.72100067138672, 64.82099914550781), new Point2D.Double(36.72100067138672, 61.939998626708984), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_23);
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
	private ext_mc() {
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
       ext_mc base = new ext_mc();
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
       ext_mc base = new ext_mc();
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
        return ext_mc::new;
    }
}

