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
public class ext_xps implements ResizableIcon {
    

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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.0, 44.7);
((GeneralPath)shape).lineTo(26.0, 32.6);
((GeneralPath)shape).lineTo(26.0, 38.699997);
((GeneralPath)shape).lineTo(16.5, 46.6);
((GeneralPath)shape).lineTo(16.5, 46.699997);
((GeneralPath)shape).lineTo(26.0, 54.6);
((GeneralPath)shape).lineTo(26.0, 60.699997);
((GeneralPath)shape).lineTo(12.0, 48.699997);
((GeneralPath)shape).lineTo(12.0, 44.699997);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(19.013999938964844, 60.792999267578125), new Point2D.Double(19.013999938964844, 32.60300064086914), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(19.013999938964844, 62.979000091552734), new Point2D.Double(19.013999938964844, 30.417999267578125), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.0, 44.7);
((GeneralPath)shape).lineTo(26.0, 32.6);
((GeneralPath)shape).lineTo(26.0, 38.699997);
((GeneralPath)shape).lineTo(16.5, 46.6);
((GeneralPath)shape).lineTo(16.5, 46.699997);
((GeneralPath)shape).lineTo(26.0, 54.6);
((GeneralPath)shape).lineTo(26.0, 60.699997);
((GeneralPath)shape).lineTo(12.0, 48.699997);
((GeneralPath)shape).lineTo(12.0, 44.699997);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.4, 29.5);
((GeneralPath)shape).lineTo(42.100002, 29.5);
((GeneralPath)shape).lineTo(34.9, 64.5);
((GeneralPath)shape).lineTo(31.300001, 64.5);
((GeneralPath)shape).lineTo(38.4, 29.5);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.68600082397461, 64.5), new Point2D.Double(36.68600082397461, 29.5), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.6879997253418, 65.5), new Point2D.Double(36.6879997253418, 28.5), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.4, 29.5);
((GeneralPath)shape).lineTo(42.100002, 29.5);
((GeneralPath)shape).lineTo(34.9, 64.5);
((GeneralPath)shape).lineTo(31.300001, 64.5);
((GeneralPath)shape).lineTo(38.4, 29.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(47.2, 54.8);
((GeneralPath)shape).lineTo(56.7, 46.899998);
((GeneralPath)shape).lineTo(56.7, 46.8);
((GeneralPath)shape).lineTo(47.2, 38.899998);
((GeneralPath)shape).lineTo(47.2, 32.8);
((GeneralPath)shape).lineTo(61.2, 44.9);
((GeneralPath)shape).lineTo(61.2, 49.0);
((GeneralPath)shape).lineTo(47.2, 61.1);
((GeneralPath)shape).lineTo(47.2, 54.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(54.18600082397461, 61.051998138427734), new Point2D.Double(54.18600082397461, 32.689998626708984), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(54.18600082397461, 63.237998962402344), new Point2D.Double(54.18600082397461, 30.503999710083008), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(47.2, 54.8);
((GeneralPath)shape).lineTo(56.7, 46.899998);
((GeneralPath)shape).lineTo(56.7, 46.8);
((GeneralPath)shape).lineTo(47.2, 38.899998);
((GeneralPath)shape).lineTo(47.2, 32.8);
((GeneralPath)shape).lineTo(61.2, 44.9);
((GeneralPath)shape).lineTo(61.2, 49.0);
((GeneralPath)shape).lineTo(47.2, 61.1);
((GeneralPath)shape).lineTo(47.2, 54.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_2);
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
((GeneralPath)shape).moveTo(9.4, 91.5);
((GeneralPath)shape).lineTo(16.0, 81.5);
((GeneralPath)shape).lineTo(10.0, 72.3);
((GeneralPath)shape).lineTo(14.6, 72.3);
((GeneralPath)shape).lineTo(18.5, 78.5);
((GeneralPath)shape).lineTo(22.3, 72.3);
((GeneralPath)shape).lineTo(26.9, 72.3);
((GeneralPath)shape).lineTo(20.8, 81.700005);
((GeneralPath)shape).lineTo(27.5, 91.600006);
((GeneralPath)shape).lineTo(22.7, 91.600006);
((GeneralPath)shape).lineTo(18.400002, 84.90001);
((GeneralPath)shape).lineTo(14.100001, 91.600006);
((GeneralPath)shape).lineTo(9.4, 91.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.6, 91.5);
((GeneralPath)shape).lineTo(29.6, 72.2);
((GeneralPath)shape).lineTo(35.9, 72.2);
((GeneralPath)shape).curveTo(38.300003, 72.2, 39.9, 72.299995, 40.600002, 72.5);
((GeneralPath)shape).curveTo(41.7, 72.8, 42.7, 73.4, 43.4, 74.4);
((GeneralPath)shape).curveTo(44.2, 75.4, 44.5, 76.6, 44.5, 78.200005);
((GeneralPath)shape).curveTo(44.5, 79.4, 44.3, 80.4, 43.8, 81.200005);
((GeneralPath)shape).curveTo(43.399998, 82.00001, 42.8, 82.600006, 42.1, 83.100006);
((GeneralPath)shape).curveTo(41.399998, 83.600006, 40.699997, 83.90001, 40.1, 84.00001);
((GeneralPath)shape).curveTo(39.199997, 84.200005, 37.8, 84.30001, 36.0, 84.30001);
((GeneralPath)shape).lineTo(33.4, 84.30001);
((GeneralPath)shape).lineTo(33.4, 91.60001);
((GeneralPath)shape).lineTo(29.600002, 91.60001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.5, 75.5);
((GeneralPath)shape).lineTo(33.5, 81.0);
((GeneralPath)shape).lineTo(35.7, 81.0);
((GeneralPath)shape).curveTo(37.3, 81.0, 38.3, 80.9, 38.8, 80.7);
((GeneralPath)shape).curveTo(39.3, 80.5, 39.7, 80.2, 40.0, 79.799995);
((GeneralPath)shape).curveTo(40.3, 79.399994, 40.4, 78.899994, 40.4, 78.299995);
((GeneralPath)shape).curveTo(40.4, 77.6, 40.2, 76.99999, 39.800003, 76.6);
((GeneralPath)shape).curveTo(39.4, 76.1, 38.9, 75.9, 38.200005, 75.7);
((GeneralPath)shape).curveTo(37.700005, 75.6, 36.800003, 75.6, 35.400005, 75.6);
((GeneralPath)shape).lineTo(33.500004, 75.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.7, 85.3);
((GeneralPath)shape).lineTo(50.5, 84.9);
((GeneralPath)shape).curveTo(50.7, 86.200005, 51.2, 87.1, 51.9, 87.700005);
((GeneralPath)shape).curveTo(52.600002, 88.3, 53.600002, 88.600006, 54.800003, 88.600006);
((GeneralPath)shape).curveTo(56.100002, 88.600006, 57.000004, 88.3, 57.700005, 87.8);
((GeneralPath)shape).curveTo(58.300003, 87.3, 58.700005, 86.600006, 58.700005, 85.9);
((GeneralPath)shape).curveTo(58.700005, 85.4, 58.600006, 85.1, 58.300003, 84.700005);
((GeneralPath)shape).curveTo(58.000004, 84.4, 57.600002, 84.100006, 56.9, 83.9);
((GeneralPath)shape).curveTo(56.4, 83.700005, 55.4, 83.5, 53.7, 83.1);
((GeneralPath)shape).curveTo(51.600002, 82.6, 50.100002, 81.9, 49.3, 81.2);
((GeneralPath)shape).curveTo(48.1, 80.1, 47.5, 78.799995, 47.5, 77.299995);
((GeneralPath)shape).curveTo(47.5, 76.299995, 47.8, 75.399994, 48.3, 74.49999);
((GeneralPath)shape).curveTo(48.899998, 73.59999, 49.7, 72.99999, 50.7, 72.49999);
((GeneralPath)shape).curveTo(51.8, 72.09999, 53.0, 71.799995, 54.5, 71.799995);
((GeneralPath)shape).curveTo(57.0, 71.799995, 58.8, 72.299995, 60.0, 73.399994);
((GeneralPath)shape).curveTo(61.2, 74.49999, 61.9, 75.899994, 62.0, 77.7);
((GeneralPath)shape).lineTo(58.1, 77.899994);
((GeneralPath)shape).curveTo(57.899998, 76.899994, 57.6, 76.2, 57.0, 75.799995);
((GeneralPath)shape).curveTo(56.4, 75.399994, 55.6, 75.1, 54.5, 75.1);
((GeneralPath)shape).curveTo(53.4, 75.1, 52.5, 75.299995, 51.8, 75.799995);
((GeneralPath)shape).curveTo(51.399998, 76.1, 51.2, 76.49999, 51.2, 76.99999);
((GeneralPath)shape).curveTo(51.2, 77.49999, 51.4, 77.799995, 51.8, 78.19999);
((GeneralPath)shape).curveTo(52.3, 78.59999, 53.5, 78.99999, 55.399998, 79.49999);
((GeneralPath)shape).curveTo(57.3, 79.899994, 58.699997, 80.399994, 59.699997, 80.899994);
((GeneralPath)shape).curveTo(60.6, 81.399994, 61.299995, 81.99999, 61.899998, 82.899994);
((GeneralPath)shape).curveTo(62.399998, 83.7, 62.699997, 84.799995, 62.699997, 85.99999);
((GeneralPath)shape).curveTo(62.699997, 87.09999, 62.399998, 88.09999, 61.799995, 89.09999);
((GeneralPath)shape).curveTo(61.199993, 90.09999, 60.299995, 90.79999, 59.199997, 91.29999);
((GeneralPath)shape).curveTo(58.1, 91.79999, 56.6, 91.999985, 54.999996, 91.999985);
((GeneralPath)shape).curveTo(52.499996, 91.999985, 50.599995, 91.39999, 49.299995, 90.29999);
((GeneralPath)shape).curveTo(47.799995, 89.09999, 46.999996, 87.39999, 46.699997, 85.29999);
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
	private ext_xps() {
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
       ext_xps base = new ext_xps();
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
       ext_xps base = new ext_xps();
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
        return ext_xps::new;
    }
}

