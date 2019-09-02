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
public class ext_torrent implements ResizableIcon {
    

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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.0), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(58.8, 58.5);
((GeneralPath)shape).curveTo(58.5, 59.6, 57.8, 60.4, 57.0, 61.2);
((GeneralPath)shape).curveTo(45.6, 73.1, 26.0, 70.8, 17.7, 56.600002);
((GeneralPath)shape).curveTo(15.500001, 52.800003, 14.200001, 48.800003, 14.400001, 44.4);
((GeneralPath)shape).curveTo(14.6, 38.9, 16.5, 34.0, 19.900002, 29.7);
((GeneralPath)shape).curveTo(24.000002, 24.5, 29.2, 21.1, 35.800003, 19.900002);
((GeneralPath)shape).curveTo(37.4, 19.600002, 39.000004, 19.500002, 40.600002, 19.300001);
((GeneralPath)shape).lineTo(40.600002, 23.900002);
((GeneralPath)shape).curveTo(39.500004, 24.000002, 38.4, 24.100002, 37.300003, 24.300001);
((GeneralPath)shape).curveTo(28.000004, 25.6, 20.100002, 33.5, 19.400003, 42.6);
((GeneralPath)shape).curveTo(19.000004, 48.3, 20.500004, 53.399998, 24.300003, 57.8);
((GeneralPath)shape).curveTo(25.800003, 59.6, 27.500004, 61.2, 29.600002, 62.3);
((GeneralPath)shape).curveTo(30.200003, 62.6, 30.900002, 62.7, 31.600002, 62.8);
((GeneralPath)shape).curveTo(25.700003, 59.3, 22.200003, 54.199997, 21.100002, 47.5);
((GeneralPath)shape).curveTo(20.300003, 43.0, 21.200003, 38.8, 23.700003, 34.9);
((GeneralPath)shape).curveTo(30.0, 25.1, 41.0, 23.6, 48.5, 26.8);
((GeneralPath)shape).curveTo(47.9, 28.099998, 47.3, 29.5, 46.7, 30.699999);
((GeneralPath)shape).curveTo(45.2, 30.4, 43.7, 29.999998, 42.2, 29.9);
((GeneralPath)shape).curveTo(37.9, 29.6, 34.0, 30.699999, 30.800001, 33.7);
((GeneralPath)shape).curveTo(22.600002, 41.2, 24.800001, 52.800003, 32.600002, 58.0);
((GeneralPath)shape).curveTo(35.100002, 59.7, 37.800003, 60.9, 40.800003, 61.6);
((GeneralPath)shape).curveTo(41.500004, 61.8, 42.300003, 61.6, 43.100002, 61.5);
((GeneralPath)shape).curveTo(43.000004, 61.4, 42.800003, 61.4, 42.7, 61.4);
((GeneralPath)shape).curveTo(39.0, 60.7, 35.5, 59.4, 32.6, 56.800003);
((GeneralPath)shape).curveTo(29.599998, 54.200005, 27.399998, 51.000004, 27.099998, 46.9);
((GeneralPath)shape).curveTo(26.699999, 41.100002, 28.899998, 36.4, 33.899998, 33.4);
((GeneralPath)shape).curveTo(38.199997, 30.7, 42.799995, 30.7, 47.399998, 32.9);
((GeneralPath)shape).curveTo(49.999996, 34.100002, 51.899998, 36.100002, 53.3, 38.600002);
((GeneralPath)shape).curveTo(52.0, 39.300003, 50.7, 40.000004, 49.5, 40.600002);
((GeneralPath)shape).curveTo(48.4, 39.500004, 47.4, 38.300003, 46.2, 37.500004);
((GeneralPath)shape).curveTo(40.4, 33.600002, 32.300003, 37.300003, 31.7, 44.500004);
((GeneralPath)shape).curveTo(31.400002, 48.100002, 32.9, 50.800003, 35.4, 53.200005);
((GeneralPath)shape).curveTo(38.4, 55.900005, 42.0, 56.900005, 45.9, 57.400005);
((GeneralPath)shape).curveTo(49.7, 57.900005, 53.600002, 57.800007, 57.4, 57.300007);
((GeneralPath)shape).curveTo(58.2, 57.20001, 58.5, 57.70001, 58.800003, 58.300007);
((GeneralPath)shape).lineTo(58.800003, 58.500008);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(14.380000114440918, 44.07899856567383), new Point2D.Double(58.79999923706055, 44.07899856567383), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 74.18699645996094), new Point2D.Double(58.5369987487793, 87.68699645996094), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
((GeneralPath)shape).moveTo(7.4, 91.5);
((GeneralPath)shape).lineTo(7.4, 83.8);
((GeneralPath)shape).lineTo(4.7, 83.8);
((GeneralPath)shape).lineTo(4.7, 82.200005);
((GeneralPath)shape).lineTo(12.2, 82.200005);
((GeneralPath)shape).lineTo(12.2, 83.8);
((GeneralPath)shape).lineTo(9.3, 83.8);
((GeneralPath)shape).lineTo(9.3, 91.5);
((GeneralPath)shape).lineTo(7.4, 91.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.700001, 86.9);
((GeneralPath)shape).curveTo(12.700001, 86.0, 12.800001, 85.200005, 13.1, 84.5);
((GeneralPath)shape).curveTo(13.3, 84.0, 13.6, 83.6, 14.0, 83.2);
((GeneralPath)shape).curveTo(14.4, 82.799995, 14.8, 82.5, 15.2, 82.399994);
((GeneralPath)shape).curveTo(15.8, 82.2, 16.5, 81.99999, 17.2, 81.99999);
((GeneralPath)shape).curveTo(18.6, 81.99999, 19.7, 82.399994, 20.5, 83.299995);
((GeneralPath)shape).curveTo(21.3, 84.2, 21.7, 85.299995, 21.7, 86.799995);
((GeneralPath)shape).curveTo(21.7, 88.299995, 21.300001, 89.49999, 20.5, 90.299995);
((GeneralPath)shape).curveTo(19.7, 91.1, 18.6, 91.6, 17.2, 91.6);
((GeneralPath)shape).curveTo(15.800001, 91.6, 14.700001, 91.2, 13.900001, 90.299995);
((GeneralPath)shape).curveTo(13.1, 89.6, 12.700001, 88.399994, 12.700001, 86.899994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(14.700001, 86.9);
((GeneralPath)shape).curveTo(14.700001, 88.0, 14.900001, 88.8, 15.400001, 89.3);
((GeneralPath)shape).curveTo(15.900001, 89.8, 16.5, 90.100006, 17.300001, 90.100006);
((GeneralPath)shape).curveTo(18.1, 90.100006, 18.7, 89.8, 19.2, 89.3);
((GeneralPath)shape).curveTo(19.7, 88.8, 19.900002, 88.0, 19.900002, 86.9);
((GeneralPath)shape).curveTo(19.900002, 85.8, 19.7, 85.0, 19.2, 84.5);
((GeneralPath)shape).curveTo(18.7, 84.0, 18.1, 83.7, 17.300001, 83.7);
((GeneralPath)shape).curveTo(16.500002, 83.7, 15.900002, 84.0, 15.400002, 84.5);
((GeneralPath)shape).curveTo(14.900002, 85.0, 14.700002, 85.8, 14.700002, 86.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.300001, 91.5);
((GeneralPath)shape).lineTo(23.300001, 82.2);
((GeneralPath)shape).lineTo(27.300001, 82.2);
((GeneralPath)shape).curveTo(28.300001, 82.2, 29.000002, 82.299995, 29.500002, 82.5);
((GeneralPath)shape).curveTo(30.000002, 82.7, 30.300001, 83.0, 30.600002, 83.4);
((GeneralPath)shape).curveTo(30.900003, 83.8, 31.000002, 84.3, 31.000002, 84.9);
((GeneralPath)shape).curveTo(31.000002, 85.6, 30.800001, 86.200005, 30.400002, 86.6);
((GeneralPath)shape).curveTo(30.000002, 87.1, 29.400002, 87.299995, 28.500002, 87.5);
((GeneralPath)shape).curveTo(28.900002, 87.7, 29.200003, 88.0, 29.500002, 88.3);
((GeneralPath)shape).curveTo(29.800001, 88.600006, 30.100002, 89.100006, 30.600002, 89.8);
((GeneralPath)shape).lineTo(31.700003, 91.600006);
((GeneralPath)shape).lineTo(29.400003, 91.600006);
((GeneralPath)shape).lineTo(28.000004, 89.600006);
((GeneralPath)shape).curveTo(27.500004, 88.90001, 27.200005, 88.40001, 27.000004, 88.200005);
((GeneralPath)shape).curveTo(26.800003, 88.0, 26.600004, 87.9, 26.400003, 87.8);
((GeneralPath)shape).curveTo(26.200003, 87.700005, 25.900003, 87.700005, 25.400003, 87.700005);
((GeneralPath)shape).lineTo(25.0, 87.700005);
((GeneralPath)shape).lineTo(25.0, 91.600006);
((GeneralPath)shape).lineTo(23.3, 91.600006);
((GeneralPath)shape).lineTo(23.3, 91.50001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(25.2, 86.2);
((GeneralPath)shape).lineTo(26.6, 86.2);
((GeneralPath)shape).curveTo(27.5, 86.2, 28.1, 86.2, 28.300001, 86.1);
((GeneralPath)shape).curveTo(28.500002, 86.0, 28.7, 85.9, 28.800001, 85.7);
((GeneralPath)shape).curveTo(28.900002, 85.49999, 29.000002, 85.299995, 29.000002, 85.0);
((GeneralPath)shape).curveTo(29.000002, 84.7, 28.900002, 84.4, 28.700003, 84.2);
((GeneralPath)shape).curveTo(28.500004, 83.99999, 28.300003, 83.899994, 28.000002, 83.799995);
((GeneralPath)shape).lineTo(25.100002, 83.799995);
((GeneralPath)shape).lineTo(25.200003, 86.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.8, 91.5);
((GeneralPath)shape).lineTo(32.8, 82.2);
((GeneralPath)shape).lineTo(36.8, 82.2);
((GeneralPath)shape).curveTo(37.8, 82.2, 38.5, 82.299995, 39.0, 82.5);
((GeneralPath)shape).curveTo(39.5, 82.700005, 39.8, 83.0, 40.1, 83.4);
((GeneralPath)shape).curveTo(40.399998, 83.8, 40.5, 84.3, 40.5, 84.9);
((GeneralPath)shape).curveTo(40.5, 85.6, 40.3, 86.200005, 39.9, 86.6);
((GeneralPath)shape).curveTo(39.500004, 86.99999, 38.9, 87.299995, 38.0, 87.5);
((GeneralPath)shape).curveTo(38.4, 87.7, 38.7, 88.0, 39.0, 88.3);
((GeneralPath)shape).curveTo(39.3, 88.600006, 39.6, 89.100006, 40.1, 89.8);
((GeneralPath)shape).lineTo(41.199997, 91.600006);
((GeneralPath)shape).lineTo(39.0, 91.600006);
((GeneralPath)shape).lineTo(37.6, 89.600006);
((GeneralPath)shape).curveTo(37.1, 88.90001, 36.8, 88.40001, 36.6, 88.200005);
((GeneralPath)shape).curveTo(36.399998, 88.0, 36.199997, 87.9, 36.0, 87.8);
((GeneralPath)shape).curveTo(35.8, 87.700005, 35.5, 87.700005, 35.0, 87.700005);
((GeneralPath)shape).lineTo(34.6, 87.700005);
((GeneralPath)shape).lineTo(34.6, 91.600006);
((GeneralPath)shape).lineTo(32.8, 91.600006);
((GeneralPath)shape).lineTo(32.8, 91.50001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.7, 86.2);
((GeneralPath)shape).lineTo(36.100002, 86.2);
((GeneralPath)shape).curveTo(37.000004, 86.2, 37.600002, 86.2, 37.800003, 86.1);
((GeneralPath)shape).curveTo(38.000004, 86.0, 38.200005, 85.9, 38.300003, 85.7);
((GeneralPath)shape).curveTo(38.4, 85.5, 38.500004, 85.299995, 38.500004, 85.0);
((GeneralPath)shape).curveTo(38.500004, 84.7, 38.400005, 84.4, 38.200005, 84.2);
((GeneralPath)shape).curveTo(38.000004, 83.99999, 37.800003, 83.899994, 37.500004, 83.799995);
((GeneralPath)shape).lineTo(34.600002, 83.799995);
((GeneralPath)shape).lineTo(34.7, 86.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.3, 91.5);
((GeneralPath)shape).lineTo(42.3, 82.2);
((GeneralPath)shape).lineTo(49.3, 82.2);
((GeneralPath)shape).lineTo(49.3, 83.799995);
((GeneralPath)shape).lineTo(44.2, 83.799995);
((GeneralPath)shape).lineTo(44.2, 85.899994);
((GeneralPath)shape).lineTo(48.9, 85.899994);
((GeneralPath)shape).lineTo(48.9, 87.49999);
((GeneralPath)shape).lineTo(44.2, 87.49999);
((GeneralPath)shape).lineTo(44.2, 90.0);
((GeneralPath)shape).lineTo(49.5, 90.0);
((GeneralPath)shape).lineTo(49.5, 91.6);
((GeneralPath)shape).lineTo(42.3, 91.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(51.1, 91.5);
((GeneralPath)shape).lineTo(51.1, 82.2);
((GeneralPath)shape).lineTo(52.899998, 82.2);
((GeneralPath)shape).lineTo(56.699997, 88.399994);
((GeneralPath)shape).lineTo(56.699997, 82.2);
((GeneralPath)shape).lineTo(58.499996, 82.2);
((GeneralPath)shape).lineTo(58.499996, 91.5);
((GeneralPath)shape).lineTo(56.599995, 91.5);
((GeneralPath)shape).lineTo(52.799995, 85.4);
((GeneralPath)shape).lineTo(52.799995, 91.5);
((GeneralPath)shape).lineTo(51.099995, 91.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(62.699997, 91.5);
((GeneralPath)shape).lineTo(62.699997, 83.8);
((GeneralPath)shape).lineTo(59.899998, 83.8);
((GeneralPath)shape).lineTo(59.899998, 82.200005);
((GeneralPath)shape).lineTo(67.399994, 82.200005);
((GeneralPath)shape).lineTo(67.399994, 83.8);
((GeneralPath)shape).lineTo(64.59999, 83.8);
((GeneralPath)shape).lineTo(64.59999, 91.5);
((GeneralPath)shape).lineTo(62.69999, 91.5);
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
	private ext_torrent() {
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
       ext_torrent base = new ext_torrent();
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
       ext_torrent base = new ext_torrent();
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
        return ext_torrent::new;
    }
}

