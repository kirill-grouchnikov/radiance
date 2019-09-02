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
public class ext_inf implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(42.0, 35.4);
((GeneralPath)shape).curveTo(42.0, 32.9, 40.5, 30.900002, 38.3, 30.000002);
((GeneralPath)shape).lineTo(38.3, 22.7);
((GeneralPath)shape).curveTo(38.3, 21.5, 37.399998, 20.6, 36.2, 20.6);
((GeneralPath)shape).curveTo(35.000004, 20.6, 34.100002, 21.5, 34.100002, 22.7);
((GeneralPath)shape).lineTo(34.100002, 30.0);
((GeneralPath)shape).curveTo(31.900002, 30.8, 30.400002, 32.9, 30.400002, 35.4);
((GeneralPath)shape).curveTo(30.400002, 37.9, 31.900002, 40.0, 34.100002, 40.800003);
((GeneralPath)shape).curveTo(34.100002, 40.9, 34.000004, 41.100002, 34.000004, 41.200005);
((GeneralPath)shape).lineTo(34.000004, 59.600006);
((GeneralPath)shape).curveTo(34.000004, 60.800007, 34.900005, 61.700005, 36.100002, 61.700005);
((GeneralPath)shape).curveTo(37.3, 61.700005, 38.2, 60.800003, 38.2, 59.600006);
((GeneralPath)shape).lineTo(38.2, 41.2);
((GeneralPath)shape).curveTo(38.2, 41.0, 38.2, 40.9, 38.100002, 40.8);
((GeneralPath)shape).curveTo(40.500004, 40.0, 42.000004, 37.899998, 42.000004, 35.399998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.2, 37.0);
((GeneralPath)shape).curveTo(35.3, 37.0, 34.600002, 36.3, 34.600002, 35.4);
((GeneralPath)shape).curveTo(34.600002, 34.500004, 35.300003, 33.800003, 36.2, 33.800003);
((GeneralPath)shape).curveTo(37.1, 33.800003, 37.8, 34.500004, 37.8, 35.4);
((GeneralPath)shape).curveTo(37.8, 36.3, 37.1, 37.0, 36.2, 37.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 61.71699905395508), new Point2D.Double(36.20000076293945, 20.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 62.21699905395508), new Point2D.Double(36.20000076293945, 20.216999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(42.0, 35.4);
((GeneralPath)shape).curveTo(42.0, 32.9, 40.5, 30.900002, 38.3, 30.000002);
((GeneralPath)shape).lineTo(38.3, 22.7);
((GeneralPath)shape).curveTo(38.3, 21.5, 37.399998, 20.6, 36.2, 20.6);
((GeneralPath)shape).curveTo(35.000004, 20.6, 34.100002, 21.5, 34.100002, 22.7);
((GeneralPath)shape).lineTo(34.100002, 30.0);
((GeneralPath)shape).curveTo(31.900002, 30.8, 30.400002, 32.9, 30.400002, 35.4);
((GeneralPath)shape).curveTo(30.400002, 37.9, 31.900002, 40.0, 34.100002, 40.800003);
((GeneralPath)shape).curveTo(34.100002, 40.9, 34.000004, 41.100002, 34.000004, 41.200005);
((GeneralPath)shape).lineTo(34.000004, 59.600006);
((GeneralPath)shape).curveTo(34.000004, 60.800007, 34.900005, 61.700005, 36.100002, 61.700005);
((GeneralPath)shape).curveTo(37.3, 61.700005, 38.2, 60.800003, 38.2, 59.600006);
((GeneralPath)shape).lineTo(38.2, 41.2);
((GeneralPath)shape).curveTo(38.2, 41.0, 38.2, 40.9, 38.100002, 40.8);
((GeneralPath)shape).curveTo(40.500004, 40.0, 42.000004, 37.899998, 42.000004, 35.399998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.2, 37.0);
((GeneralPath)shape).curveTo(35.3, 37.0, 34.600002, 36.3, 34.600002, 35.4);
((GeneralPath)shape).curveTo(34.600002, 34.500004, 35.300003, 33.800003, 36.2, 33.800003);
((GeneralPath)shape).curveTo(37.1, 33.800003, 37.8, 34.500004, 37.8, 35.4);
((GeneralPath)shape).curveTo(37.8, 36.3, 37.1, 37.0, 36.2, 37.0);
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
((GeneralPath)shape).moveTo(53.0, 22.8);
((GeneralPath)shape).curveTo(53.0, 21.599998, 52.1, 20.699999, 50.9, 20.699999);
((GeneralPath)shape).curveTo(49.7, 20.699999, 48.800003, 21.599998, 48.800003, 22.8);
((GeneralPath)shape).lineTo(48.800003, 40.0);
((GeneralPath)shape).curveTo(46.600002, 40.8, 45.100002, 42.9, 45.100002, 45.4);
((GeneralPath)shape).curveTo(45.100002, 47.9, 46.600002, 50.0, 48.800003, 50.800003);
((GeneralPath)shape).curveTo(48.800003, 50.9, 48.700005, 51.100002, 48.700005, 51.200005);
((GeneralPath)shape).lineTo(48.700005, 59.600006);
((GeneralPath)shape).curveTo(48.700005, 60.800007, 49.600006, 61.700005, 50.800003, 61.700005);
((GeneralPath)shape).curveTo(52.000004, 61.700005, 52.9, 60.800003, 52.9, 59.600006);
((GeneralPath)shape).lineTo(52.9, 51.200005);
((GeneralPath)shape).curveTo(52.9, 51.000004, 52.9, 50.900005, 52.800003, 50.800003);
((GeneralPath)shape).curveTo(55.000004, 50.000004, 56.500004, 47.9, 56.500004, 45.4);
((GeneralPath)shape).curveTo(56.500004, 42.9, 55.000004, 40.9, 52.800003, 40.0);
((GeneralPath)shape).lineTo(52.800003, 22.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.9, 47.0);
((GeneralPath)shape).curveTo(50.0, 47.0, 49.300003, 46.3, 49.300003, 45.4);
((GeneralPath)shape).curveTo(49.300003, 44.5, 50.000004, 43.800003, 50.9, 43.800003);
((GeneralPath)shape).curveTo(51.8, 43.800003, 52.5, 44.500004, 52.5, 45.4);
((GeneralPath)shape).curveTo(52.5, 46.300003, 51.8, 47.0, 50.9, 47.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 61.71699905395508), new Point2D.Double(50.917999267578125, 20.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 62.21699905395508), new Point2D.Double(50.917999267578125, 20.216999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.0, 22.8);
((GeneralPath)shape).curveTo(53.0, 21.599998, 52.1, 20.699999, 50.9, 20.699999);
((GeneralPath)shape).curveTo(49.7, 20.699999, 48.800003, 21.599998, 48.800003, 22.8);
((GeneralPath)shape).lineTo(48.800003, 40.0);
((GeneralPath)shape).curveTo(46.600002, 40.8, 45.100002, 42.9, 45.100002, 45.4);
((GeneralPath)shape).curveTo(45.100002, 47.9, 46.600002, 50.0, 48.800003, 50.800003);
((GeneralPath)shape).curveTo(48.800003, 50.9, 48.700005, 51.100002, 48.700005, 51.200005);
((GeneralPath)shape).lineTo(48.700005, 59.600006);
((GeneralPath)shape).curveTo(48.700005, 60.800007, 49.600006, 61.700005, 50.800003, 61.700005);
((GeneralPath)shape).curveTo(52.000004, 61.700005, 52.9, 60.800003, 52.9, 59.600006);
((GeneralPath)shape).lineTo(52.9, 51.200005);
((GeneralPath)shape).curveTo(52.9, 51.000004, 52.9, 50.900005, 52.800003, 50.800003);
((GeneralPath)shape).curveTo(55.000004, 50.000004, 56.500004, 47.9, 56.500004, 45.4);
((GeneralPath)shape).curveTo(56.500004, 42.9, 55.000004, 40.9, 52.800003, 40.0);
((GeneralPath)shape).lineTo(52.800003, 22.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.9, 47.0);
((GeneralPath)shape).curveTo(50.0, 47.0, 49.300003, 46.3, 49.300003, 45.4);
((GeneralPath)shape).curveTo(49.300003, 44.5, 50.000004, 43.800003, 50.9, 43.800003);
((GeneralPath)shape).curveTo(51.8, 43.800003, 52.5, 44.500004, 52.5, 45.4);
((GeneralPath)shape).curveTo(52.5, 46.300003, 51.8, 47.0, 50.9, 47.0);
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
((GeneralPath)shape).moveTo(19.4, 59.6);
((GeneralPath)shape).curveTo(19.4, 60.8, 20.3, 61.699997, 21.5, 61.699997);
((GeneralPath)shape).curveTo(22.7, 61.699997, 23.6, 60.799995, 23.6, 59.6);
((GeneralPath)shape).lineTo(23.6, 51.199997);
((GeneralPath)shape).curveTo(23.6, 50.999996, 23.6, 50.899998, 23.5, 50.799995);
((GeneralPath)shape).curveTo(25.7, 49.999996, 27.2, 47.899994, 27.2, 45.399994);
((GeneralPath)shape).curveTo(27.2, 42.899994, 25.7, 40.899994, 23.5, 39.999992);
((GeneralPath)shape).lineTo(23.5, 22.8);
((GeneralPath)shape).curveTo(23.5, 21.599998, 22.6, 20.699999, 21.4, 20.699999);
((GeneralPath)shape).curveTo(20.199999, 20.699999, 19.3, 21.599998, 19.3, 22.8);
((GeneralPath)shape).lineTo(19.3, 40.0);
((GeneralPath)shape).curveTo(17.099998, 40.8, 15.599999, 42.9, 15.599999, 45.4);
((GeneralPath)shape).curveTo(15.599999, 47.9, 17.099998, 50.0, 19.3, 50.800003);
((GeneralPath)shape).curveTo(19.3, 50.9, 19.199999, 51.100002, 19.199999, 51.200005);
((GeneralPath)shape).lineTo(19.199999, 59.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.5, 43.8);
((GeneralPath)shape).curveTo(22.4, 43.8, 23.1, 44.5, 23.1, 45.399998);
((GeneralPath)shape).curveTo(23.1, 46.3, 22.4, 46.999996, 21.5, 46.999996);
((GeneralPath)shape).curveTo(20.6, 46.999996, 19.9, 46.299995, 19.9, 45.399998);
((GeneralPath)shape).curveTo(19.9, 44.499996, 20.6, 43.8, 21.5, 43.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 61.71699905395508), new Point2D.Double(21.48200035095215, 20.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 62.21699905395508), new Point2D.Double(21.48200035095215, 20.216999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.4, 59.6);
((GeneralPath)shape).curveTo(19.4, 60.8, 20.3, 61.699997, 21.5, 61.699997);
((GeneralPath)shape).curveTo(22.7, 61.699997, 23.6, 60.799995, 23.6, 59.6);
((GeneralPath)shape).lineTo(23.6, 51.199997);
((GeneralPath)shape).curveTo(23.6, 50.999996, 23.6, 50.899998, 23.5, 50.799995);
((GeneralPath)shape).curveTo(25.7, 49.999996, 27.2, 47.899994, 27.2, 45.399994);
((GeneralPath)shape).curveTo(27.2, 42.899994, 25.7, 40.899994, 23.5, 39.999992);
((GeneralPath)shape).lineTo(23.5, 22.8);
((GeneralPath)shape).curveTo(23.5, 21.599998, 22.6, 20.699999, 21.4, 20.699999);
((GeneralPath)shape).curveTo(20.199999, 20.699999, 19.3, 21.599998, 19.3, 22.8);
((GeneralPath)shape).lineTo(19.3, 40.0);
((GeneralPath)shape).curveTo(17.099998, 40.8, 15.599999, 42.9, 15.599999, 45.4);
((GeneralPath)shape).curveTo(15.599999, 47.9, 17.099998, 50.0, 19.3, 50.800003);
((GeneralPath)shape).curveTo(19.3, 50.9, 19.199999, 51.100002, 19.199999, 51.200005);
((GeneralPath)shape).lineTo(19.199999, 59.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.5, 43.8);
((GeneralPath)shape).curveTo(22.4, 43.8, 23.1, 44.5, 23.1, 45.399998);
((GeneralPath)shape).curveTo(23.1, 46.3, 22.4, 46.999996, 21.5, 46.999996);
((GeneralPath)shape).curveTo(20.6, 46.999996, 19.9, 46.299995, 19.9, 45.399998);
((GeneralPath)shape).curveTo(19.9, 44.499996, 20.6, 43.8, 21.5, 43.8);
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
((GeneralPath)shape).moveTo(16.0, 91.9);
((GeneralPath)shape).lineTo(16.0, 71.9);
((GeneralPath)shape).lineTo(20.0, 71.9);
((GeneralPath)shape).lineTo(20.0, 91.9);
((GeneralPath)shape).lineTo(16.0, 91.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.9, 91.9);
((GeneralPath)shape).lineTo(23.9, 71.9);
((GeneralPath)shape).lineTo(27.8, 71.9);
((GeneralPath)shape).lineTo(36.0, 85.3);
((GeneralPath)shape).lineTo(36.0, 71.8);
((GeneralPath)shape).lineTo(39.8, 71.8);
((GeneralPath)shape).lineTo(39.8, 91.8);
((GeneralPath)shape).lineTo(35.7, 91.8);
((GeneralPath)shape).lineTo(27.6, 78.700005);
((GeneralPath)shape).lineTo(27.6, 91.8);
((GeneralPath)shape).lineTo(23.9, 91.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(44.1, 91.9);
((GeneralPath)shape).lineTo(44.1, 71.9);
((GeneralPath)shape).lineTo(57.8, 71.9);
((GeneralPath)shape).lineTo(57.8, 75.3);
((GeneralPath)shape).lineTo(48.1, 75.3);
((GeneralPath)shape).lineTo(48.1, 80.0);
((GeneralPath)shape).lineTo(56.5, 80.0);
((GeneralPath)shape).lineTo(56.5, 83.4);
((GeneralPath)shape).lineTo(48.1, 83.4);
((GeneralPath)shape).lineTo(48.1, 91.9);
((GeneralPath)shape).lineTo(44.1, 91.9);
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
	private ext_inf() {
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
       ext_inf base = new ext_inf();
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
       ext_inf base = new ext_inf();
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
        return ext_inf::new;
    }
}

