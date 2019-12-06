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
public class ext_m4 implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(18.5, 90.1);
((GeneralPath)shape).lineTo(18.5, 70.2);
((GeneralPath)shape).lineTo(24.6, 70.2);
((GeneralPath)shape).lineTo(28.2, 83.7);
((GeneralPath)shape).lineTo(31.800001, 70.2);
((GeneralPath)shape).lineTo(37.9, 70.2);
((GeneralPath)shape).lineTo(37.9, 90.0);
((GeneralPath)shape).lineTo(34.100002, 90.0);
((GeneralPath)shape).lineTo(34.100002, 74.5);
((GeneralPath)shape).lineTo(30.100002, 90.1);
((GeneralPath)shape).lineTo(26.200003, 90.1);
((GeneralPath)shape).lineTo(22.200003, 74.5);
((GeneralPath)shape).lineTo(22.200003, 90.1);
((GeneralPath)shape).lineTo(18.500002, 90.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.6, 90.1);
((GeneralPath)shape).lineTo(48.6, 86.1);
((GeneralPath)shape).lineTo(40.399998, 86.1);
((GeneralPath)shape).lineTo(40.399998, 82.799995);
((GeneralPath)shape).lineTo(49.1, 70.2);
((GeneralPath)shape).lineTo(52.3, 70.2);
((GeneralPath)shape).lineTo(52.3, 82.799995);
((GeneralPath)shape).lineTo(54.8, 82.799995);
((GeneralPath)shape).lineTo(54.8, 86.1);
((GeneralPath)shape).lineTo(52.3, 86.1);
((GeneralPath)shape).lineTo(52.3, 90.1);
((GeneralPath)shape).lineTo(48.6, 90.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.6, 82.7);
((GeneralPath)shape).lineTo(48.6, 76.0);
((GeneralPath)shape).lineTo(44.0, 82.7);
((GeneralPath)shape).lineTo(48.6, 82.7);
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
((GeneralPath)shape).moveTo(54.4, 49.8);
((GeneralPath)shape).lineTo(54.2, 49.6);
((GeneralPath)shape).lineTo(54.0, 49.399998);
((GeneralPath)shape).curveTo(54.0, 45.999996, 52.0, 43.1, 49.2, 41.699997);
((GeneralPath)shape).curveTo(48.9, 40.499996, 49.100002, 40.1, 49.100002, 40.1);
((GeneralPath)shape).curveTo(49.2, 40.0, 49.300003, 39.8, 49.300003, 39.699997);
((GeneralPath)shape).lineTo(52.200005, 39.699997);
((GeneralPath)shape).curveTo(52.800003, 39.699997, 53.500004, 39.399998, 53.900005, 38.999996);
((GeneralPath)shape).curveTo(55.500004, 37.399998, 56.300007, 35.399998, 56.300007, 33.199997);
((GeneralPath)shape).curveTo(56.300007, 29.099997, 53.300007, 25.699997, 49.300007, 25.199997);
((GeneralPath)shape).curveTo(49.300007, 24.999996, 49.100006, 24.999996, 48.900005, 24.999996);
((GeneralPath)shape).lineTo(25.6, 24.999996);
((GeneralPath)shape).curveTo(21.1, 24.999996, 17.5, 28.599997, 17.5, 33.1);
((GeneralPath)shape).curveTo(17.5, 33.399998, 17.5, 33.8, 17.6, 34.199997);
((GeneralPath)shape).curveTo(17.800001, 41.699997, 23.5, 47.899998, 26.5, 50.6);
((GeneralPath)shape).lineTo(20.7, 50.6);
((GeneralPath)shape).curveTo(19.800001, 50.6, 19.0, 51.1, 18.6, 51.8);
((GeneralPath)shape).curveTo(17.9, 53.0, 17.6, 54.399998, 17.6, 55.7);
((GeneralPath)shape).curveTo(17.6, 60.2, 21.2, 63.800003, 25.7, 63.800003);
((GeneralPath)shape).curveTo(26.6, 63.800003, 49.0, 63.9, 49.0, 63.9);
((GeneralPath)shape).lineTo(49.2, 63.9);
((GeneralPath)shape).curveTo(53.3, 63.5, 56.600002, 59.9, 56.600002, 55.7);
((GeneralPath)shape).curveTo(56.500004, 53.8, 55.7, 51.5, 54.4, 49.8);
((GeneralPath)shape).moveTo(48.9, 27.4);
((GeneralPath)shape).curveTo(51.800003, 27.699999, 54.100002, 30.1, 54.100002, 33.1);
((GeneralPath)shape).curveTo(54.100002, 34.699997, 53.4, 36.199997, 52.4, 37.199997);
((GeneralPath)shape).lineTo(31.2, 37.199997);
((GeneralPath)shape).curveTo(32.0, 35.999996, 32.600002, 34.6, 32.600002, 33.1);
((GeneralPath)shape).curveTo(32.600002, 30.699999, 31.400002, 28.699999, 29.600002, 27.399998);
((GeneralPath)shape).lineTo(48.9, 27.399998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.900002, 55.8);
((GeneralPath)shape).curveTo(19.900002, 54.8, 20.2, 53.899998, 20.600002, 53.0);
((GeneralPath)shape).lineTo(30.500002, 53.0);
((GeneralPath)shape).curveTo(31.000002, 53.8, 31.200003, 54.8, 31.200003, 55.8);
((GeneralPath)shape).curveTo(31.200003, 58.899998, 28.700003, 61.5, 25.500004, 61.5);
((GeneralPath)shape).curveTo(22.500004, 61.5, 19.900003, 59.0, 19.900003, 55.8);
((GeneralPath)shape).moveTo(48.9, 61.6);
((GeneralPath)shape).lineTo(29.5, 61.6);
((GeneralPath)shape).curveTo(31.3, 60.3, 32.5, 58.199997, 32.5, 55.899998);
((GeneralPath)shape).curveTo(32.5, 53.499996, 31.3, 51.499996, 29.5, 50.199997);
((GeneralPath)shape).lineTo(29.6, 50.199997);
((GeneralPath)shape).curveTo(29.6, 50.199997, 20.0, 43.0, 19.9, 34.1);
((GeneralPath)shape).curveTo(19.9, 33.8, 19.8, 33.5, 19.8, 33.199997);
((GeneralPath)shape).curveTo(19.8, 30.099997, 22.3, 27.499996, 25.5, 27.499996);
((GeneralPath)shape).curveTo(28.7, 27.499996, 31.2, 29.999996, 31.2, 33.199997);
((GeneralPath)shape).lineTo(31.2, 33.6);
((GeneralPath)shape).curveTo(31.2, 34.1, 31.1, 34.6, 30.900002, 35.1);
((GeneralPath)shape).curveTo(30.7, 35.699997, 30.300001, 36.3, 29.900002, 36.8);
((GeneralPath)shape).lineTo(28.600002, 38.5);
((GeneralPath)shape).lineTo(47.200005, 38.5);
((GeneralPath)shape).curveTo(47.100006, 38.6, 47.100006, 38.7, 47.000004, 38.9);
((GeneralPath)shape).curveTo(46.600002, 39.5, 46.500004, 40.2, 46.600002, 41.0);
((GeneralPath)shape).curveTo(46.2, 41.0, 45.800003, 40.9, 45.500004, 40.9);
((GeneralPath)shape).curveTo(40.800003, 40.9, 37.000004, 44.7, 37.000004, 49.4);
((GeneralPath)shape).curveTo(37.000004, 54.100002, 40.800003, 57.9, 45.500004, 57.9);
((GeneralPath)shape).curveTo(49.000004, 57.9, 52.000004, 55.800003, 53.300003, 52.800003);
((GeneralPath)shape).curveTo(53.700005, 53.800003, 54.000004, 54.800003, 54.000004, 55.800003);
((GeneralPath)shape).curveTo(54.100002, 58.800003, 51.800003, 61.300003, 48.900005, 61.600002);
((GeneralPath)shape).moveTo(49.200005, 49.300003);
((GeneralPath)shape).lineTo(43.600006, 53.600002);
((GeneralPath)shape).lineTo(43.600006, 45.100002);
((GeneralPath)shape).lineTo(49.200005, 49.300003);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(37.0, 64.0), new Point2D.Double(37.0, 25.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(37.0, 64.25), new Point2D.Double(37.0, 24.75), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.4, 49.8);
((GeneralPath)shape).lineTo(54.2, 49.6);
((GeneralPath)shape).lineTo(54.0, 49.399998);
((GeneralPath)shape).curveTo(54.0, 45.999996, 52.0, 43.1, 49.2, 41.699997);
((GeneralPath)shape).curveTo(48.9, 40.499996, 49.100002, 40.1, 49.100002, 40.1);
((GeneralPath)shape).curveTo(49.2, 40.0, 49.300003, 39.8, 49.300003, 39.699997);
((GeneralPath)shape).lineTo(52.200005, 39.699997);
((GeneralPath)shape).curveTo(52.800003, 39.699997, 53.500004, 39.399998, 53.900005, 38.999996);
((GeneralPath)shape).curveTo(55.500004, 37.399998, 56.300007, 35.399998, 56.300007, 33.199997);
((GeneralPath)shape).curveTo(56.300007, 29.099997, 53.300007, 25.699997, 49.300007, 25.199997);
((GeneralPath)shape).curveTo(49.300007, 24.999996, 49.100006, 24.999996, 48.900005, 24.999996);
((GeneralPath)shape).lineTo(25.6, 24.999996);
((GeneralPath)shape).curveTo(21.1, 24.999996, 17.5, 28.599997, 17.5, 33.1);
((GeneralPath)shape).curveTo(17.5, 33.399998, 17.5, 33.8, 17.6, 34.199997);
((GeneralPath)shape).curveTo(17.800001, 41.699997, 23.5, 47.899998, 26.5, 50.6);
((GeneralPath)shape).lineTo(20.7, 50.6);
((GeneralPath)shape).curveTo(19.800001, 50.6, 19.0, 51.1, 18.6, 51.8);
((GeneralPath)shape).curveTo(17.9, 53.0, 17.6, 54.399998, 17.6, 55.7);
((GeneralPath)shape).curveTo(17.6, 60.2, 21.2, 63.800003, 25.7, 63.800003);
((GeneralPath)shape).curveTo(26.6, 63.800003, 49.0, 63.9, 49.0, 63.9);
((GeneralPath)shape).lineTo(49.2, 63.9);
((GeneralPath)shape).curveTo(53.3, 63.5, 56.600002, 59.9, 56.600002, 55.7);
((GeneralPath)shape).curveTo(56.500004, 53.8, 55.7, 51.5, 54.4, 49.8);
((GeneralPath)shape).moveTo(48.9, 27.4);
((GeneralPath)shape).curveTo(51.800003, 27.699999, 54.100002, 30.1, 54.100002, 33.1);
((GeneralPath)shape).curveTo(54.100002, 34.699997, 53.4, 36.199997, 52.4, 37.199997);
((GeneralPath)shape).lineTo(31.2, 37.199997);
((GeneralPath)shape).curveTo(32.0, 35.999996, 32.600002, 34.6, 32.600002, 33.1);
((GeneralPath)shape).curveTo(32.600002, 30.699999, 31.400002, 28.699999, 29.600002, 27.399998);
((GeneralPath)shape).lineTo(48.9, 27.399998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.900002, 55.8);
((GeneralPath)shape).curveTo(19.900002, 54.8, 20.2, 53.899998, 20.600002, 53.0);
((GeneralPath)shape).lineTo(30.500002, 53.0);
((GeneralPath)shape).curveTo(31.000002, 53.8, 31.200003, 54.8, 31.200003, 55.8);
((GeneralPath)shape).curveTo(31.200003, 58.899998, 28.700003, 61.5, 25.500004, 61.5);
((GeneralPath)shape).curveTo(22.500004, 61.5, 19.900003, 59.0, 19.900003, 55.8);
((GeneralPath)shape).moveTo(48.9, 61.6);
((GeneralPath)shape).lineTo(29.5, 61.6);
((GeneralPath)shape).curveTo(31.3, 60.3, 32.5, 58.199997, 32.5, 55.899998);
((GeneralPath)shape).curveTo(32.5, 53.499996, 31.3, 51.499996, 29.5, 50.199997);
((GeneralPath)shape).lineTo(29.6, 50.199997);
((GeneralPath)shape).curveTo(29.6, 50.199997, 20.0, 43.0, 19.9, 34.1);
((GeneralPath)shape).curveTo(19.9, 33.8, 19.8, 33.5, 19.8, 33.199997);
((GeneralPath)shape).curveTo(19.8, 30.099997, 22.3, 27.499996, 25.5, 27.499996);
((GeneralPath)shape).curveTo(28.7, 27.499996, 31.2, 29.999996, 31.2, 33.199997);
((GeneralPath)shape).lineTo(31.2, 33.6);
((GeneralPath)shape).curveTo(31.2, 34.1, 31.1, 34.6, 30.900002, 35.1);
((GeneralPath)shape).curveTo(30.7, 35.699997, 30.300001, 36.3, 29.900002, 36.8);
((GeneralPath)shape).lineTo(28.600002, 38.5);
((GeneralPath)shape).lineTo(47.200005, 38.5);
((GeneralPath)shape).curveTo(47.100006, 38.6, 47.100006, 38.7, 47.000004, 38.9);
((GeneralPath)shape).curveTo(46.600002, 39.5, 46.500004, 40.2, 46.600002, 41.0);
((GeneralPath)shape).curveTo(46.2, 41.0, 45.800003, 40.9, 45.500004, 40.9);
((GeneralPath)shape).curveTo(40.800003, 40.9, 37.000004, 44.7, 37.000004, 49.4);
((GeneralPath)shape).curveTo(37.000004, 54.100002, 40.800003, 57.9, 45.500004, 57.9);
((GeneralPath)shape).curveTo(49.000004, 57.9, 52.000004, 55.800003, 53.300003, 52.800003);
((GeneralPath)shape).curveTo(53.700005, 53.800003, 54.000004, 54.800003, 54.000004, 55.800003);
((GeneralPath)shape).curveTo(54.100002, 58.800003, 51.800003, 61.300003, 48.900005, 61.600002);
((GeneralPath)shape).moveTo(49.200005, 49.300003);
((GeneralPath)shape).lineTo(43.600006, 53.600002);
((GeneralPath)shape).lineTo(43.600006, 45.100002);
((GeneralPath)shape).lineTo(49.200005, 49.300003);
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
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
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
g.setTransform(defaultTransform__0_6);
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
	private ext_m4() {
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
       ext_m4 base = new ext_m4();
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
       ext_m4 base = new ext_m4();
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
        return ext_m4::new;
    }
}

