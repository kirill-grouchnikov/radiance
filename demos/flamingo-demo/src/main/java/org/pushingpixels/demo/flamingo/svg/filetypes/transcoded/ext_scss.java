package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_scss implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.4, 44.1);
((GeneralPath)shape).lineTo(14.4, 39.199997);
((GeneralPath)shape).curveTo(15.4, 39.1, 16.199999, 38.999996, 16.699999, 38.699997);
((GeneralPath)shape).curveTo(17.199999, 38.499996, 17.599998, 37.999996, 17.999998, 37.499996);
((GeneralPath)shape).curveTo(18.399998, 36.899998, 18.599998, 36.199997, 18.799997, 35.299995);
((GeneralPath)shape).curveTo(18.899998, 34.599995, 18.999998, 33.499996, 18.999998, 31.899996);
((GeneralPath)shape).curveTo(18.999998, 29.199995, 19.099998, 27.399996, 19.399998, 26.299995);
((GeneralPath)shape).curveTo(19.599998, 25.299995, 20.099998, 24.399996, 20.699997, 23.799995);
((GeneralPath)shape).curveTo(21.299995, 23.199995, 22.299997, 22.699995, 23.499996, 22.299995);
((GeneralPath)shape).curveTo(24.299995, 22.099995, 25.599997, 21.899996, 27.399996, 21.899996);
((GeneralPath)shape).lineTo(28.499996, 21.899996);
((GeneralPath)shape).lineTo(28.499996, 26.799995);
((GeneralPath)shape).curveTo(26.999996, 26.799995, 25.999996, 26.899996, 25.599997, 27.099995);
((GeneralPath)shape).curveTo(25.199997, 27.299995, 24.899996, 27.499994, 24.599997, 27.899994);
((GeneralPath)shape).curveTo(24.399996, 28.199993, 24.299997, 28.799994, 24.299997, 29.699993);
((GeneralPath)shape).curveTo(24.299997, 30.599993, 24.199997, 32.199993, 24.099997, 34.599995);
((GeneralPath)shape).curveTo(23.999996, 35.999996, 23.899996, 37.099995, 23.599997, 37.999996);
((GeneralPath)shape).curveTo(23.299997, 38.799995, 22.899996, 39.499996, 22.499996, 40.099995);
((GeneralPath)shape).curveTo(22.099997, 40.599995, 21.399996, 41.199993, 20.499996, 41.799995);
((GeneralPath)shape).curveTo(21.299995, 42.299995, 21.999996, 42.799995, 22.499996, 43.399994);
((GeneralPath)shape).curveTo(22.999996, 43.999992, 23.399996, 44.799995, 23.699997, 45.699993);
((GeneralPath)shape).curveTo(23.999998, 46.59999, 24.199997, 47.79999, 24.199997, 49.29999);
((GeneralPath)shape).curveTo(24.299997, 51.59999, 24.299997, 52.999992, 24.299997, 53.699993);
((GeneralPath)shape).curveTo(24.299997, 54.599995, 24.399998, 55.199993, 24.599997, 55.599995);
((GeneralPath)shape).curveTo(24.799997, 55.999996, 25.199997, 56.199993, 25.599997, 56.399994);
((GeneralPath)shape).curveTo(25.999996, 56.599995, 26.999996, 56.699993, 28.499996, 56.699993);
((GeneralPath)shape).lineTo(28.499996, 61.599995);
((GeneralPath)shape).lineTo(27.399996, 61.599995);
((GeneralPath)shape).curveTo(25.599997, 61.599995, 24.099997, 61.499996, 23.199997, 61.199993);
((GeneralPath)shape).curveTo(22.199997, 60.899994, 21.399998, 60.399994, 20.699997, 59.699993);
((GeneralPath)shape).curveTo(19.999996, 58.999992, 19.599997, 58.199993, 19.299997, 57.199993);
((GeneralPath)shape).curveTo(19.099997, 56.199993, 18.999998, 54.599995, 18.999998, 52.399994);
((GeneralPath)shape).curveTo(18.999998, 49.899994, 18.899998, 48.199993, 18.699999, 47.499992);
((GeneralPath)shape).curveTo(18.4, 46.399994, 17.9, 45.59999, 17.3, 45.09999);
((GeneralPath)shape).curveTo(16.599998, 44.499992, 15.699999, 44.09999, 14.4, 44.09999);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(21.450000762939453, 61.54999923706055), new Point2D.Double(21.450000762939453, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(58.7, 44.1);
((GeneralPath)shape).curveTo(57.7, 44.199997, 56.9, 44.3, 56.4, 44.6);
((GeneralPath)shape).curveTo(55.9, 44.8, 55.5, 45.3, 55.100002, 45.8);
((GeneralPath)shape).curveTo(54.7, 46.399998, 54.500004, 47.1, 54.300003, 48.0);
((GeneralPath)shape).curveTo(54.200005, 48.7, 54.100002, 49.8, 54.100002, 51.4);
((GeneralPath)shape).curveTo(54.100002, 54.100002, 54.000004, 55.9, 53.7, 57.0);
((GeneralPath)shape).curveTo(53.5, 58.1, 53.0, 58.9, 52.4, 59.5);
((GeneralPath)shape).curveTo(51.800003, 60.1, 50.800003, 60.6, 49.600002, 61.0);
((GeneralPath)shape).curveTo(48.800003, 61.2, 47.500004, 61.4, 45.7, 61.4);
((GeneralPath)shape).lineTo(44.600002, 61.4);
((GeneralPath)shape).lineTo(44.600002, 56.5);
((GeneralPath)shape).curveTo(46.100002, 56.5, 47.000004, 56.4, 47.500004, 56.2);
((GeneralPath)shape).curveTo(48.000004, 56.0, 48.300003, 55.7, 48.500004, 55.4);
((GeneralPath)shape).curveTo(48.700005, 55.100002, 48.800003, 54.5, 48.800003, 53.600002);
((GeneralPath)shape).curveTo(48.800003, 52.800003, 48.9, 51.2, 49.000004, 48.800003);
((GeneralPath)shape).curveTo(49.100002, 47.4, 49.300003, 46.200005, 49.600002, 45.4);
((GeneralPath)shape).curveTo(49.9, 44.5, 50.300003, 43.800003, 50.800003, 43.2);
((GeneralPath)shape).curveTo(51.300003, 42.6, 51.9, 42.100002, 52.700005, 41.600002);
((GeneralPath)shape).curveTo(51.700005, 40.9, 50.900005, 40.300003, 50.500004, 39.7);
((GeneralPath)shape).curveTo(49.900005, 38.8, 49.400005, 37.600002, 49.200005, 36.3);
((GeneralPath)shape).curveTo(49.000004, 35.3, 48.900005, 33.2, 48.900005, 30.0);
((GeneralPath)shape).curveTo(48.900005, 29.0, 48.800007, 28.3, 48.600006, 27.9);
((GeneralPath)shape).curveTo(48.400005, 27.6, 48.100006, 27.3, 47.700005, 27.1);
((GeneralPath)shape).curveTo(47.300003, 26.9, 46.300003, 26.800001, 44.700005, 26.800001);
((GeneralPath)shape).lineTo(44.700005, 22.0);
((GeneralPath)shape).lineTo(45.800003, 22.0);
((GeneralPath)shape).curveTo(47.600002, 22.0, 49.100002, 22.1, 50.000004, 22.4);
((GeneralPath)shape).curveTo(51.000004, 22.699999, 51.800003, 23.199999, 52.500004, 23.9);
((GeneralPath)shape).curveTo(53.200005, 24.6, 53.600002, 25.4, 53.900005, 26.4);
((GeneralPath)shape).curveTo(54.100006, 27.4, 54.300007, 29.0, 54.300007, 31.2);
((GeneralPath)shape).curveTo(54.300007, 33.7, 54.400005, 35.3, 54.600006, 36.100002);
((GeneralPath)shape).curveTo(54.900005, 37.2, 55.400005, 38.000004, 56.000008, 38.4);
((GeneralPath)shape).curveTo(56.600006, 38.9, 57.600006, 39.100002, 58.800007, 39.2);
((GeneralPath)shape).lineTo(58.70001, 44.100002);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(51.70000076293945, 61.45000076293945), new Point2D.Double(51.70000076293945, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_1);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.7, 86.2);
((GeneralPath)shape).lineTo(8.9, 85.899994);
((GeneralPath)shape).curveTo(9.099999, 86.99999, 9.5, 87.799995, 10.099999, 88.299995);
((GeneralPath)shape).curveTo(10.699999, 88.799995, 11.499999, 89.1, 12.5, 89.1);
((GeneralPath)shape).curveTo(13.6, 89.1, 14.4, 88.9, 14.9, 88.4);
((GeneralPath)shape).curveTo(15.4, 87.9, 15.7, 87.4, 15.7, 86.8);
((GeneralPath)shape).curveTo(15.7, 86.4, 15.599999, 86.100006, 15.4, 85.8);
((GeneralPath)shape).curveTo(15.2, 85.5, 14.799999, 85.3, 14.2, 85.100006);
((GeneralPath)shape).curveTo(13.8, 85.00001, 12.9, 84.700005, 11.5, 84.40001);
((GeneralPath)shape).curveTo(9.7, 84.00001, 8.5, 83.40001, 7.7, 82.80001);
((GeneralPath)shape).curveTo(6.7, 81.90001, 6.2, 80.80001, 6.2, 79.50001);
((GeneralPath)shape).curveTo(6.2, 78.700005, 6.3999996, 77.90001, 6.8999996, 77.100006);
((GeneralPath)shape).curveTo(7.3999996, 76.40001, 8.099999, 75.8, 9.0, 75.40001);
((GeneralPath)shape).curveTo(9.9, 75.00001, 11.0, 74.80001, 12.2, 74.80001);
((GeneralPath)shape).curveTo(14.299999, 74.80001, 15.799999, 75.30001, 16.9, 76.20001);
((GeneralPath)shape).curveTo(17.9, 77.10001, 18.5, 78.30001, 18.5, 79.80001);
((GeneralPath)shape).lineTo(15.2, 79.90001);
((GeneralPath)shape).curveTo(15.099999, 79.100006, 14.8, 78.40001, 14.3, 78.100006);
((GeneralPath)shape).curveTo(13.8, 77.700005, 13.1, 77.50001, 12.200001, 77.50001);
((GeneralPath)shape).curveTo(11.200001, 77.50001, 10.500001, 77.700005, 9.900001, 78.100006);
((GeneralPath)shape).curveTo(9.500001, 78.40001, 9.400001, 78.700005, 9.400001, 79.100006);
((GeneralPath)shape).curveTo(9.400001, 79.50001, 9.6, 79.8, 9.900001, 80.100006);
((GeneralPath)shape).curveTo(10.3, 80.50001, 11.3, 80.8, 13.0, 81.200005);
((GeneralPath)shape).curveTo(14.6, 81.600006, 15.8, 82.00001, 16.6, 82.4);
((GeneralPath)shape).curveTo(17.4, 82.8, 18.0, 83.4, 18.4, 84.1);
((GeneralPath)shape).curveTo(18.8, 84.799995, 19.1, 85.7, 19.1, 86.7);
((GeneralPath)shape).curveTo(19.1, 87.6, 18.800001, 88.5, 18.300001, 89.399994);
((GeneralPath)shape).curveTo(17.800001, 90.2, 17.000002, 90.799995, 16.1, 91.2);
((GeneralPath)shape).curveTo(15.199999, 91.6, 13.900001, 91.799995, 12.5, 91.799995);
((GeneralPath)shape).curveTo(10.4, 91.799995, 8.8, 91.299995, 7.7, 90.399994);
((GeneralPath)shape).curveTo(6.5999994, 89.49999, 5.8999996, 87.99999, 5.7, 86.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.4, 85.5);
((GeneralPath)shape).lineTo(35.600002, 86.5);
((GeneralPath)shape).curveTo(35.100002, 88.3, 34.300003, 89.6, 33.100002, 90.5);
((GeneralPath)shape).curveTo(32.000004, 91.4, 30.500002, 91.8, 28.700003, 91.8);
((GeneralPath)shape).curveTo(26.500002, 91.8, 24.700003, 91.100006, 23.300003, 89.600006);
((GeneralPath)shape).curveTo(21.900003, 88.100006, 21.200003, 86.100006, 21.200003, 83.50001);
((GeneralPath)shape).curveTo(21.200003, 80.80001, 21.900003, 78.600006, 23.300003, 77.100006);
((GeneralPath)shape).curveTo(24.700003, 75.600006, 26.600002, 74.8, 28.900003, 74.8);
((GeneralPath)shape).curveTo(30.900003, 74.8, 32.500004, 75.4, 33.800003, 76.600006);
((GeneralPath)shape).curveTo(34.500004, 77.3, 35.100002, 78.3, 35.500004, 79.600006);
((GeneralPath)shape).lineTo(32.200005, 80.40001);
((GeneralPath)shape).curveTo(32.000004, 79.50001, 31.600004, 78.90001, 31.000004, 78.40001);
((GeneralPath)shape).curveTo(30.400003, 77.90001, 29.600004, 77.70001, 28.700005, 77.70001);
((GeneralPath)shape).curveTo(27.500004, 77.70001, 26.500004, 78.10001, 25.700005, 79.000015);
((GeneralPath)shape).curveTo(24.900005, 79.90002, 24.600004, 81.30002, 24.600004, 83.30002);
((GeneralPath)shape).curveTo(24.600004, 85.40002, 25.000004, 86.90002, 25.700005, 87.70002);
((GeneralPath)shape).curveTo(26.400005, 88.50002, 27.400005, 89.00002, 28.600004, 89.00002);
((GeneralPath)shape).curveTo(29.500004, 89.00002, 30.200005, 88.70002, 30.900003, 88.20002);
((GeneralPath)shape).curveTo(31.600004, 87.60002, 32.100002, 86.70002, 32.4, 85.50002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.600002, 86.2);
((GeneralPath)shape).lineTo(40.800003, 85.899994);
((GeneralPath)shape).curveTo(41.000004, 86.99999, 41.4, 87.799995, 42.000004, 88.299995);
((GeneralPath)shape).curveTo(42.600006, 88.799995, 43.400005, 89.1, 44.400005, 89.1);
((GeneralPath)shape).curveTo(45.500004, 89.1, 46.300007, 88.9, 46.800007, 88.4);
((GeneralPath)shape).curveTo(47.300007, 87.9, 47.600006, 87.4, 47.600006, 86.8);
((GeneralPath)shape).curveTo(47.600006, 86.4, 47.500008, 86.100006, 47.300007, 85.8);
((GeneralPath)shape).curveTo(47.100006, 85.5, 46.70001, 85.3, 46.100006, 85.100006);
((GeneralPath)shape).curveTo(45.700005, 85.00001, 44.800007, 84.700005, 43.400005, 84.40001);
((GeneralPath)shape).curveTo(41.600006, 84.00001, 40.400005, 83.40001, 39.600006, 82.80001);
((GeneralPath)shape).curveTo(38.600006, 81.90001, 38.100006, 80.80001, 38.100006, 79.50001);
((GeneralPath)shape).curveTo(38.100006, 78.700005, 38.300007, 77.90001, 38.800007, 77.100006);
((GeneralPath)shape).curveTo(39.300007, 76.40001, 40.000008, 75.8, 40.900005, 75.40001);
((GeneralPath)shape).curveTo(41.800007, 75.00001, 42.900005, 74.80001, 44.100006, 74.80001);
((GeneralPath)shape).curveTo(46.200005, 74.80001, 47.700005, 75.30001, 48.800007, 76.20001);
((GeneralPath)shape).curveTo(49.800007, 77.10001, 50.400005, 78.30001, 50.400005, 79.80001);
((GeneralPath)shape).lineTo(47.100006, 79.90001);
((GeneralPath)shape).curveTo(47.000008, 79.100006, 46.700005, 78.40001, 46.200005, 78.100006);
((GeneralPath)shape).curveTo(45.700005, 77.700005, 45.000004, 77.50001, 44.100006, 77.50001);
((GeneralPath)shape).curveTo(43.100006, 77.50001, 42.400005, 77.700005, 41.800007, 78.100006);
((GeneralPath)shape).curveTo(41.400005, 78.40001, 41.300007, 78.700005, 41.300007, 79.100006);
((GeneralPath)shape).curveTo(41.300007, 79.50001, 41.500008, 79.8, 41.800007, 80.100006);
((GeneralPath)shape).curveTo(42.20001, 80.50001, 43.20001, 80.8, 44.900005, 81.200005);
((GeneralPath)shape).curveTo(46.500004, 81.600006, 47.700005, 82.00001, 48.500004, 82.4);
((GeneralPath)shape).curveTo(49.300003, 82.8, 49.900005, 83.4, 50.300003, 84.1);
((GeneralPath)shape).curveTo(50.700005, 84.799995, 51.000004, 85.7, 51.000004, 86.7);
((GeneralPath)shape).curveTo(51.000004, 87.6, 50.700005, 88.5, 50.200005, 89.399994);
((GeneralPath)shape).curveTo(49.700005, 90.2, 48.900005, 90.799995, 48.000004, 91.2);
((GeneralPath)shape).curveTo(47.000004, 91.6, 45.800003, 91.799995, 44.400005, 91.799995);
((GeneralPath)shape).curveTo(42.300007, 91.799995, 40.700005, 91.299995, 39.600006, 90.399994);
((GeneralPath)shape).curveTo(38.500008, 89.399994, 37.800007, 87.99999, 37.600006, 86.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.0, 86.2);
((GeneralPath)shape).lineTo(56.2, 85.899994);
((GeneralPath)shape).curveTo(56.4, 86.99999, 56.8, 87.799995, 57.4, 88.299995);
((GeneralPath)shape).curveTo(58.000004, 88.799995, 58.800003, 89.1, 59.800003, 89.1);
((GeneralPath)shape).curveTo(60.9, 89.1, 61.700005, 88.9, 62.200005, 88.4);
((GeneralPath)shape).curveTo(62.700005, 87.9, 63.000004, 87.4, 63.000004, 86.8);
((GeneralPath)shape).curveTo(63.000004, 86.4, 62.900005, 86.100006, 62.700005, 85.8);
((GeneralPath)shape).curveTo(62.500004, 85.5, 62.100006, 85.3, 61.500004, 85.100006);
((GeneralPath)shape).curveTo(61.100002, 85.00001, 60.200005, 84.700005, 58.800003, 84.40001);
((GeneralPath)shape).curveTo(57.000004, 84.00001, 55.800003, 83.40001, 55.000004, 82.80001);
((GeneralPath)shape).curveTo(54.000004, 81.90001, 53.500004, 80.80001, 53.500004, 79.50001);
((GeneralPath)shape).curveTo(53.500004, 78.700005, 53.700005, 77.90001, 54.200005, 77.100006);
((GeneralPath)shape).curveTo(54.700005, 76.40001, 55.400005, 75.8, 56.300003, 75.40001);
((GeneralPath)shape).curveTo(57.200005, 75.00001, 58.300003, 74.80001, 59.500004, 74.80001);
((GeneralPath)shape).curveTo(61.600002, 74.80001, 63.100002, 75.30001, 64.200005, 76.20001);
((GeneralPath)shape).curveTo(65.200005, 77.10001, 65.8, 78.30001, 65.8, 79.80001);
((GeneralPath)shape).lineTo(62.500004, 79.90001);
((GeneralPath)shape).curveTo(62.400005, 79.100006, 62.100002, 78.40001, 61.600002, 78.100006);
((GeneralPath)shape).curveTo(61.100002, 77.700005, 60.4, 77.50001, 59.500004, 77.50001);
((GeneralPath)shape).curveTo(58.500004, 77.50001, 57.800003, 77.700005, 57.200005, 78.100006);
((GeneralPath)shape).curveTo(56.800003, 78.40001, 56.700005, 78.700005, 56.700005, 79.100006);
((GeneralPath)shape).curveTo(56.700005, 79.50001, 56.900005, 79.8, 57.200005, 80.100006);
((GeneralPath)shape).curveTo(57.600006, 80.50001, 58.600006, 80.8, 60.300003, 81.200005);
((GeneralPath)shape).curveTo(61.9, 81.600006, 63.100002, 82.00001, 63.9, 82.4);
((GeneralPath)shape).curveTo(64.700005, 82.8, 65.3, 83.4, 65.700005, 84.1);
((GeneralPath)shape).curveTo(66.100006, 84.799995, 66.4, 85.7, 66.4, 86.7);
((GeneralPath)shape).curveTo(66.4, 87.6, 66.1, 88.5, 65.6, 89.399994);
((GeneralPath)shape).curveTo(65.1, 90.2, 64.299995, 90.799995, 63.399998, 91.2);
((GeneralPath)shape).curveTo(62.399998, 91.6, 61.199997, 91.799995, 59.8, 91.799995);
((GeneralPath)shape).curveTo(57.7, 91.799995, 56.1, 91.299995, 55.0, 90.399994);
((GeneralPath)shape).curveTo(53.8, 89.399994, 53.2, 87.99999, 53.0, 86.2);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12999999523162842;
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
		return 0.7400000095367432;
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
	private ext_scss() {
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
       ext_scss base = new ext_scss();
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
       ext_scss base = new ext_scss();
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
        return ext_scss::new;
    }
}

