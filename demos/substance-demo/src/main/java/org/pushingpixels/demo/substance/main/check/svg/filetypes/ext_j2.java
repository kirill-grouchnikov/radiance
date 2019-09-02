package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_j2 implements ResizableIcon {
    

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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(59.4, 24.0);
((GeneralPath)shape).curveTo(59.4, 24.0, 51.0, 28.0, 44.2, 28.9);
((GeneralPath)shape).curveTo(37.4, 29.8, 24.400002, 30.699999, 21.800001, 30.0);
((GeneralPath)shape).curveTo(19.2, 29.4, 17.400002, 28.6, 17.400002, 28.6);
((GeneralPath)shape).lineTo(17.900002, 30.4);
((GeneralPath)shape).lineTo(16.2, 31.9);
((GeneralPath)shape).lineTo(16.5, 32.4);
((GeneralPath)shape).lineTo(17.2, 32.5);
((GeneralPath)shape).lineTo(19.300001, 32.8);
((GeneralPath)shape).lineTo(19.6, 33.7);
((GeneralPath)shape).lineTo(20.800001, 33.8);
((GeneralPath)shape).lineTo(21.400002, 35.8);
((GeneralPath)shape).curveTo(21.400002, 35.8, 23.900002, 36.0, 24.600002, 36.0);
((GeneralPath)shape).curveTo(25.300003, 36.0, 26.800003, 35.9, 26.800003, 35.9);
((GeneralPath)shape).lineTo(26.800003, 36.7);
((GeneralPath)shape).lineTo(27.300003, 36.8);
((GeneralPath)shape).lineTo(27.300003, 37.7);
((GeneralPath)shape).lineTo(26.100002, 38.7);
((GeneralPath)shape).lineTo(26.400002, 38.8);
((GeneralPath)shape).lineTo(26.400002, 39.2);
((GeneralPath)shape).curveTo(26.400002, 39.2, 23.800001, 39.4, 22.7, 39.3);
((GeneralPath)shape).curveTo(21.800001, 39.0, 21.6, 39.0, 21.6, 39.0);
((GeneralPath)shape).lineTo(21.5, 39.1);
((GeneralPath)shape).lineTo(21.5, 39.6);
((GeneralPath)shape).lineTo(21.7, 39.6);
((GeneralPath)shape).lineTo(21.800001, 41.6);
((GeneralPath)shape).lineTo(27.2, 41.399998);
((GeneralPath)shape).lineTo(26.800001, 48.399998);
((GeneralPath)shape).lineTo(26.800001, 49.3);
((GeneralPath)shape).lineTo(22.2, 49.0);
((GeneralPath)shape).lineTo(22.2, 47.1);
((GeneralPath)shape).lineTo(23.2, 47.1);
((GeneralPath)shape).lineTo(23.300001, 46.399998);
((GeneralPath)shape).lineTo(24.2, 46.199997);
((GeneralPath)shape).lineTo(24.300001, 45.999996);
((GeneralPath)shape).lineTo(20.800001, 45.199997);
((GeneralPath)shape).lineTo(18.2, 45.999996);
((GeneralPath)shape).lineTo(18.6, 46.399998);
((GeneralPath)shape).lineTo(19.0, 46.399998);
((GeneralPath)shape).lineTo(19.0, 46.999996);
((GeneralPath)shape).lineTo(19.9, 47.099995);
((GeneralPath)shape).lineTo(19.9, 48.899994);
((GeneralPath)shape).lineTo(18.9, 49.199993);
((GeneralPath)shape).lineTo(19.1, 49.599995);
((GeneralPath)shape).lineTo(19.300001, 49.799995);
((GeneralPath)shape).lineTo(19.300001, 51.199997);
((GeneralPath)shape).lineTo(19.900002, 51.199997);
((GeneralPath)shape).lineTo(19.900002, 57.699997);
((GeneralPath)shape).lineTo(18.900002, 57.899998);
((GeneralPath)shape).lineTo(19.000002, 59.8);
((GeneralPath)shape).lineTo(19.600002, 59.899998);
((GeneralPath)shape).lineTo(19.500002, 64.2);
((GeneralPath)shape).lineTo(22.300001, 64.299995);
((GeneralPath)shape).lineTo(22.000002, 59.799995);
((GeneralPath)shape).lineTo(26.2, 59.699997);
((GeneralPath)shape).lineTo(25.900002, 61.999996);
((GeneralPath)shape).lineTo(25.500002, 63.599995);
((GeneralPath)shape).lineTo(29.7, 63.699993);
((GeneralPath)shape).lineTo(29.7, 59.499992);
((GeneralPath)shape).lineTo(32.600002, 59.199993);
((GeneralPath)shape).lineTo(32.500004, 61.79999);
((GeneralPath)shape).lineTo(32.400005, 63.39999);
((GeneralPath)shape).lineTo(34.900005, 63.39999);
((GeneralPath)shape).lineTo(34.800007, 59.09999);
((GeneralPath)shape).lineTo(35.100006, 59.19999);
((GeneralPath)shape).lineTo(35.200005, 57.19999);
((GeneralPath)shape).lineTo(34.800003, 57.19999);
((GeneralPath)shape).lineTo(34.700005, 56.39999);
((GeneralPath)shape).lineTo(34.500004, 53.99999);
((GeneralPath)shape).lineTo(34.600002, 51.19999);
((GeneralPath)shape).lineTo(35.100002, 51.19999);
((GeneralPath)shape).lineTo(35.100002, 49.49999);
((GeneralPath)shape).lineTo(34.4, 49.599987);
((GeneralPath)shape).lineTo(34.5, 47.599987);
((GeneralPath)shape).lineTo(35.3, 47.49999);
((GeneralPath)shape).lineTo(35.3, 46.89999);
((GeneralPath)shape).lineTo(35.7, 46.79999);
((GeneralPath)shape).lineTo(36.2, 46.39999);
((GeneralPath)shape).lineTo(33.4, 45.79999);
((GeneralPath)shape).lineTo(30.600002, 46.39999);
((GeneralPath)shape).lineTo(31.000002, 46.99999);
((GeneralPath)shape).lineTo(31.600002, 46.99999);
((GeneralPath)shape).lineTo(31.700003, 47.799988);
((GeneralPath)shape).lineTo(32.500004, 47.799988);
((GeneralPath)shape).lineTo(32.500004, 49.49999);
((GeneralPath)shape).lineTo(29.200005, 49.39999);
((GeneralPath)shape).lineTo(29.300005, 47.49999);
((GeneralPath)shape).lineTo(29.400005, 45.799988);
((GeneralPath)shape).lineTo(29.400005, 43.599987);
((GeneralPath)shape).lineTo(29.500006, 41.299988);
((GeneralPath)shape).lineTo(36.100006, 40.99999);
((GeneralPath)shape).lineTo(44.000008, 40.49999);
((GeneralPath)shape).lineTo(44.000008, 42.0);
((GeneralPath)shape).lineTo(43.70001, 45.6);
((GeneralPath)shape).lineTo(43.60001, 48.899998);
((GeneralPath)shape).lineTo(40.70001, 48.8);
((GeneralPath)shape).lineTo(40.70001, 46.5);
((GeneralPath)shape).lineTo(41.800007, 46.5);
((GeneralPath)shape).lineTo(41.800007, 45.8);
((GeneralPath)shape).lineTo(42.20001, 45.7);
((GeneralPath)shape).lineTo(42.20001, 45.600002);
((GeneralPath)shape).lineTo(42.60001, 45.600002);
((GeneralPath)shape).lineTo(42.80001, 45.300003);
((GeneralPath)shape).lineTo(39.50001, 44.500004);
((GeneralPath)shape).lineTo(36.200012, 45.200005);
((GeneralPath)shape).lineTo(36.400013, 45.600006);
((GeneralPath)shape).lineTo(36.800014, 45.600006);
((GeneralPath)shape).lineTo(36.800014, 45.800007);
((GeneralPath)shape).lineTo(37.200016, 45.800007);
((GeneralPath)shape).lineTo(37.200016, 46.500008);
((GeneralPath)shape).lineTo(38.200016, 46.500008);
((GeneralPath)shape).lineTo(38.200016, 48.600006);
((GeneralPath)shape).lineTo(37.200016, 48.600006);
((GeneralPath)shape).lineTo(37.200016, 49.100006);
((GeneralPath)shape).lineTo(37.500015, 49.100006);
((GeneralPath)shape).lineTo(37.500015, 50.900005);
((GeneralPath)shape).lineTo(38.200016, 50.900005);
((GeneralPath)shape).lineTo(38.100018, 58.000004);
((GeneralPath)shape).lineTo(37.200016, 58.200005);
((GeneralPath)shape).lineTo(37.200016, 58.500004);
((GeneralPath)shape).lineTo(37.500015, 58.500004);
((GeneralPath)shape).lineTo(37.500015, 60.300003);
((GeneralPath)shape).lineTo(38.000015, 60.300003);
((GeneralPath)shape).lineTo(37.900017, 62.800003);
((GeneralPath)shape).lineTo(38.000015, 64.9);
((GeneralPath)shape).lineTo(41.500015, 65.0);
((GeneralPath)shape).lineTo(41.400017, 63.1);
((GeneralPath)shape).lineTo(41.000015, 61.6);
((GeneralPath)shape).lineTo(41.000015, 60.199997);
((GeneralPath)shape).lineTo(43.900017, 60.1);
((GeneralPath)shape).lineTo(43.80002, 62.199997);
((GeneralPath)shape).lineTo(43.80002, 64.399994);
((GeneralPath)shape).lineTo(45.50002, 64.49999);
((GeneralPath)shape).lineTo(47.80002, 64.399994);
((GeneralPath)shape).lineTo(48.50002, 64.2);
((GeneralPath)shape).lineTo(48.100018, 62.999996);
((GeneralPath)shape).lineTo(48.00002, 61.299995);
((GeneralPath)shape).lineTo(47.80002, 59.999996);
((GeneralPath)shape).lineTo(50.600018, 59.899998);
((GeneralPath)shape).lineTo(50.50002, 61.499996);
((GeneralPath)shape).lineTo(50.50002, 64.0);
((GeneralPath)shape).lineTo(51.600018, 64.1);
((GeneralPath)shape).lineTo(52.700016, 64.1);
((GeneralPath)shape).lineTo(53.200016, 63.899998);
((GeneralPath)shape).lineTo(52.900017, 61.499996);
((GeneralPath)shape).lineTo(52.80002, 59.699997);
((GeneralPath)shape).lineTo(53.30002, 59.6);
((GeneralPath)shape).lineTo(53.30002, 58.0);
((GeneralPath)shape).lineTo(53.400017, 58.0);
((GeneralPath)shape).lineTo(53.400017, 57.6);
((GeneralPath)shape).lineTo(52.900017, 57.6);
((GeneralPath)shape).lineTo(52.80002, 56.399998);
((GeneralPath)shape).lineTo(52.80002, 51.199997);
((GeneralPath)shape).lineTo(53.20002, 51.199997);
((GeneralPath)shape).lineTo(53.20002, 49.499996);
((GeneralPath)shape).lineTo(53.40002, 49.499996);
((GeneralPath)shape).lineTo(53.40002, 49.199997);
((GeneralPath)shape).lineTo(52.800022, 49.1);
((GeneralPath)shape).lineTo(52.800022, 47.1);
((GeneralPath)shape).lineTo(53.800022, 47.0);
((GeneralPath)shape).lineTo(53.700024, 46.3);
((GeneralPath)shape).lineTo(54.100025, 46.3);
((GeneralPath)shape).lineTo(54.100025, 46.2);
((GeneralPath)shape).lineTo(54.700024, 45.9);
((GeneralPath)shape).lineTo(51.700024, 45.300003);
((GeneralPath)shape).lineTo(48.500023, 46.000004);
((GeneralPath)shape).lineTo(48.700024, 46.400005);
((GeneralPath)shape).lineTo(49.200024, 46.400005);
((GeneralPath)shape).lineTo(49.200024, 46.600006);
((GeneralPath)shape).lineTo(49.600025, 46.600006);
((GeneralPath)shape).lineTo(49.600025, 47.400005);
((GeneralPath)shape).lineTo(50.600025, 47.400005);
((GeneralPath)shape).lineTo(50.700024, 49.300007);
((GeneralPath)shape).lineTo(47.200024, 49.300007);
((GeneralPath)shape).lineTo(46.800022, 46.400005);
((GeneralPath)shape).lineTo(46.500023, 44.900005);
((GeneralPath)shape).lineTo(46.200024, 42.000004);
((GeneralPath)shape).lineTo(46.400024, 40.400005);
((GeneralPath)shape).lineTo(53.400024, 39.900005);
((GeneralPath)shape).lineTo(53.400024, 37.500004);
((GeneralPath)shape).lineTo(53.800026, 37.400005);
((GeneralPath)shape).lineTo(53.800026, 37.0);
((GeneralPath)shape).lineTo(53.500027, 36.8);
((GeneralPath)shape).curveTo(53.500027, 36.8, 49.700027, 37.399998, 48.40003, 37.5);
((GeneralPath)shape).curveTo(48.10003, 37.5, 48.10003, 37.5, 47.80003, 37.6);
((GeneralPath)shape).lineTo(47.80003, 37.199997);
((GeneralPath)shape).lineTo(46.30003, 36.399998);
((GeneralPath)shape).lineTo(46.30003, 35.499996);
((GeneralPath)shape).lineTo(46.80003, 35.499996);
((GeneralPath)shape).lineTo(46.80003, 34.299995);
((GeneralPath)shape).curveTo(46.80003, 34.299995, 49.80003, 34.099995, 50.90003, 33.799995);
((GeneralPath)shape).curveTo(52.000027, 33.499996, 53.60003, 33.299995, 53.60003, 33.299995);
((GeneralPath)shape).lineTo(54.30003, 31.299995);
((GeneralPath)shape).lineTo(55.80003, 30.899996);
((GeneralPath)shape).lineTo(55.90003, 30.599997);
((GeneralPath)shape).lineTo(59.200027, 29.699997);
((GeneralPath)shape).lineTo(59.60003, 29.399998);
((GeneralPath)shape).lineTo(58.30003, 26.599998);
((GeneralPath)shape).lineTo(58.40003, 25.999998);
((GeneralPath)shape).lineTo(59.000027, 25.699999);
((GeneralPath)shape).lineTo(59.500027, 24.3);
((GeneralPath)shape).lineTo(59.40003, 24.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(43.4, 34.5);
((GeneralPath)shape).lineTo(43.4, 35.5);
((GeneralPath)shape).lineTo(44.2, 35.5);
((GeneralPath)shape).lineTo(44.2, 36.5);
((GeneralPath)shape).lineTo(42.7, 37.5);
((GeneralPath)shape).lineTo(42.600002, 37.8);
((GeneralPath)shape).lineTo(43.2, 37.8);
((GeneralPath)shape).lineTo(43.2, 38.0);
((GeneralPath)shape).lineTo(38.7, 38.2);
((GeneralPath)shape).lineTo(38.7, 37.5);
((GeneralPath)shape).lineTo(38.9, 37.2);
((GeneralPath)shape).lineTo(38.9, 36.5);
((GeneralPath)shape).lineTo(39.0, 36.2);
((GeneralPath)shape).lineTo(39.0, 35.8);
((GeneralPath)shape).lineTo(39.2, 35.0);
((GeneralPath)shape).lineTo(43.4, 34.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.0, 35.4);
((GeneralPath)shape).lineTo(33.9, 36.100002);
((GeneralPath)shape).lineTo(34.300003, 36.500004);
((GeneralPath)shape).lineTo(34.300003, 37.200005);
((GeneralPath)shape).lineTo(34.600002, 37.700005);
((GeneralPath)shape).lineTo(34.500004, 38.300003);
((GeneralPath)shape).lineTo(34.700005, 38.700005);
((GeneralPath)shape).lineTo(30.100004, 38.900005);
((GeneralPath)shape).lineTo(30.100004, 38.700005);
((GeneralPath)shape).lineTo(30.600004, 38.600006);
((GeneralPath)shape).lineTo(30.600004, 38.400005);
((GeneralPath)shape).lineTo(29.400003, 37.800007);
((GeneralPath)shape).lineTo(29.300003, 36.800007);
((GeneralPath)shape).lineTo(29.900003, 36.800007);
((GeneralPath)shape).lineTo(29.900003, 35.70001);
((GeneralPath)shape).lineTo(34.000004, 35.40001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.8, 51.0);
((GeneralPath)shape).lineTo(43.6, 51.2);
((GeneralPath)shape).lineTo(43.5, 55.0);
((GeneralPath)shape).lineTo(43.9, 58.1);
((GeneralPath)shape).lineTo(40.9, 58.0);
((GeneralPath)shape).lineTo(40.800003, 51.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(22.099998, 51.1);
((GeneralPath)shape).lineTo(26.599998, 51.3);
((GeneralPath)shape).lineTo(26.099998, 54.0);
((GeneralPath)shape).lineTo(26.099998, 56.2);
((GeneralPath)shape).lineTo(26.399998, 57.4);
((GeneralPath)shape).lineTo(21.999998, 57.600002);
((GeneralPath)shape).lineTo(22.099998, 51.100002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.699997, 51.199997);
((GeneralPath)shape).lineTo(50.699997, 57.6);
((GeneralPath)shape).lineTo(47.899998, 57.8);
((GeneralPath)shape).lineTo(47.8, 54.399998);
((GeneralPath)shape).lineTo(47.5, 51.199997);
((GeneralPath)shape).lineTo(50.7, 51.199997);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.199997, 51.299995);
((GeneralPath)shape).lineTo(32.499996, 51.299995);
((GeneralPath)shape).lineTo(32.499996, 57.299995);
((GeneralPath)shape).lineTo(29.399996, 57.399994);
((GeneralPath)shape).lineTo(29.199995, 55.499992);
((GeneralPath)shape).lineTo(29.199995, 51.29999);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(38.0, 65.0), new Point2D.Double(38.0, 24.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
((GeneralPath)shape).moveTo(29.2, 71.8);
((GeneralPath)shape).lineTo(33.2, 71.8);
((GeneralPath)shape).lineTo(33.2, 84.5);
((GeneralPath)shape).curveTo(33.2, 86.2, 33.100002, 87.4, 32.8, 88.3);
((GeneralPath)shape).curveTo(32.399998, 89.5, 31.699999, 90.4, 30.699999, 91.100006);
((GeneralPath)shape).curveTo(29.699999, 91.8, 28.3, 92.200005, 26.599998, 92.200005);
((GeneralPath)shape).curveTo(24.599998, 92.200005, 23.099998, 91.600006, 21.999998, 90.50001);
((GeneralPath)shape).curveTo(20.899998, 89.40001, 20.399998, 87.80001, 20.399998, 85.600006);
((GeneralPath)shape).lineTo(24.199997, 85.200005);
((GeneralPath)shape).curveTo(24.199997, 86.3, 24.399998, 87.200005, 24.699997, 87.600006);
((GeneralPath)shape).curveTo(25.099997, 88.3, 25.799997, 88.700005, 26.699997, 88.700005);
((GeneralPath)shape).curveTo(27.599997, 88.700005, 28.199997, 88.4, 28.599997, 87.9);
((GeneralPath)shape).curveTo(28.999996, 87.4, 29.199997, 86.3, 29.199997, 84.700005);
((GeneralPath)shape).lineTo(29.199997, 71.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.6, 88.3);
((GeneralPath)shape).lineTo(49.6, 91.9);
((GeneralPath)shape).lineTo(36.2, 91.9);
((GeneralPath)shape).curveTo(36.3, 90.6, 36.8, 89.3, 37.5, 88.1);
((GeneralPath)shape).curveTo(38.2, 86.9, 39.7, 85.299995, 41.8, 83.299995);
((GeneralPath)shape).curveTo(43.5, 81.7, 44.6, 80.6, 45.0, 79.99999);
((GeneralPath)shape).curveTo(45.5, 79.19999, 45.8, 78.399994, 45.8, 77.59999);
((GeneralPath)shape).curveTo(45.8, 76.69999, 45.6, 76.09999, 45.1, 75.59999);
((GeneralPath)shape).curveTo(44.6, 75.09999, 44.0, 74.899994, 43.199997, 74.899994);
((GeneralPath)shape).curveTo(42.399998, 74.899994, 41.799995, 75.09999, 41.299995, 75.59999);
((GeneralPath)shape).curveTo(40.799995, 76.09999, 40.599995, 76.899994, 40.499996, 77.99999);
((GeneralPath)shape).lineTo(36.699997, 77.59999);
((GeneralPath)shape).curveTo(36.899998, 75.49999, 37.6, 73.99999, 38.799995, 72.99999);
((GeneralPath)shape).curveTo(39.999992, 71.99999, 41.499996, 71.59999, 43.299995, 71.59999);
((GeneralPath)shape).curveTo(45.299995, 71.59999, 46.799995, 72.09999, 47.999996, 73.19999);
((GeneralPath)shape).curveTo(49.099995, 74.29999, 49.699997, 75.59999, 49.699997, 77.19999);
((GeneralPath)shape).curveTo(49.699997, 78.09999, 49.499996, 78.99999, 49.199997, 79.79999);
((GeneralPath)shape).curveTo(48.899998, 80.59998, 48.399998, 81.499985, 47.699997, 82.39999);
((GeneralPath)shape).curveTo(47.199997, 82.999985, 46.399998, 83.79999, 45.199997, 84.999985);
((GeneralPath)shape).curveTo(43.999996, 86.09998, 43.199997, 86.89999, 42.899998, 87.19998);
((GeneralPath)shape).curveTo(42.6, 87.59998, 42.3, 87.89998, 42.1, 88.29998);
((GeneralPath)shape).lineTo(49.6, 88.29998);
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
	private ext_j2() {
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
       ext_j2 base = new ext_j2();
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
       ext_j2 base = new ext_j2();
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
        return ext_j2::new;
    }
}

