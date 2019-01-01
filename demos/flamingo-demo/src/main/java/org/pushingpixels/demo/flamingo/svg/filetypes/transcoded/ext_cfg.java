package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconFactory;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_cfg implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
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
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
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
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 61.71699905395508), new Point2D.Double(36.20000076293945, 20.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 61.71699905395508), new Point2D.Double(50.917999267578125, 20.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 61.71699905395508), new Point2D.Double(21.48200035095215, 20.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
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
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(21.3, 84.5);
((GeneralPath)shape).lineTo(25.199999, 85.7);
((GeneralPath)shape).curveTo(24.599998, 87.899994, 23.599998, 89.5, 22.199999, 90.6);
((GeneralPath)shape).curveTo(20.8, 91.7, 18.999998, 92.2, 16.899998, 92.2);
((GeneralPath)shape).curveTo(14.199998, 92.2, 12.0999975, 91.299995, 10.299997, 89.5);
((GeneralPath)shape).curveTo(8.5999975, 87.7, 7.6999974, 85.2, 7.6999974, 82.0);
((GeneralPath)shape).curveTo(7.6999974, 78.7, 8.5999975, 76.1, 10.299997, 74.2);
((GeneralPath)shape).curveTo(11.999997, 72.299995, 14.299997, 71.399994, 17.099998, 71.399994);
((GeneralPath)shape).curveTo(19.599998, 71.399994, 21.499998, 72.09999, 23.099998, 73.59999);
((GeneralPath)shape).curveTo(23.999998, 74.49999, 24.699999, 75.69999, 25.199999, 77.29999);
((GeneralPath)shape).lineTo(21.199999, 78.29999);
((GeneralPath)shape).curveTo(20.999998, 77.29999, 20.499998, 76.39999, 19.699999, 75.79999);
((GeneralPath)shape).curveTo(18.9, 75.19999, 18.0, 75.0, 16.9, 75.0);
((GeneralPath)shape).curveTo(15.4, 75.0, 14.2, 75.5, 13.299999, 76.6);
((GeneralPath)shape).curveTo(12.4, 77.7, 11.9, 79.4, 11.9, 81.799995);
((GeneralPath)shape).curveTo(11.9, 84.299995, 12.4, 86.1, 13.299999, 87.2);
((GeneralPath)shape).curveTo(14.199999, 88.299995, 15.4, 88.799995, 16.9, 88.799995);
((GeneralPath)shape).curveTo(18.0, 88.799995, 18.9, 88.49999, 19.699999, 87.799995);
((GeneralPath)shape).curveTo(20.4, 87.1, 20.999998, 85.99999, 21.3, 84.49999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.699999, 91.9);
((GeneralPath)shape).lineTo(28.699999, 71.9);
((GeneralPath)shape).lineTo(42.399998, 71.9);
((GeneralPath)shape).lineTo(42.399998, 75.3);
((GeneralPath)shape).lineTo(32.699997, 75.3);
((GeneralPath)shape).lineTo(32.699997, 80.0);
((GeneralPath)shape).lineTo(41.1, 80.0);
((GeneralPath)shape).lineTo(41.1, 83.4);
((GeneralPath)shape).lineTo(32.699997, 83.4);
((GeneralPath)shape).lineTo(32.699997, 91.9);
((GeneralPath)shape).lineTo(28.699997, 91.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(55.1, 84.5);
((GeneralPath)shape).lineTo(55.1, 81.1);
((GeneralPath)shape).lineTo(63.8, 81.1);
((GeneralPath)shape).lineTo(63.8, 89.1);
((GeneralPath)shape).curveTo(63.0, 89.9, 61.7, 90.6, 60.1, 91.299995);
((GeneralPath)shape).curveTo(58.5, 91.899994, 56.899998, 92.2, 55.199997, 92.2);
((GeneralPath)shape).curveTo(53.1, 92.2, 51.299995, 91.799995, 49.699997, 90.899994);
((GeneralPath)shape).curveTo(48.1, 89.99999, 46.999996, 88.799995, 46.199997, 87.09999);
((GeneralPath)shape).curveTo(45.399998, 85.49999, 44.999996, 83.69999, 44.999996, 81.79999);
((GeneralPath)shape).curveTo(44.999996, 79.69999, 45.399998, 77.89999, 46.299995, 76.19999);
((GeneralPath)shape).curveTo(47.199993, 74.49999, 48.499996, 73.29999, 50.099995, 72.49999);
((GeneralPath)shape).curveTo(51.399994, 71.799995, 52.999996, 71.49999, 54.899994, 71.49999);
((GeneralPath)shape).curveTo(57.399994, 71.49999, 59.299995, 71.99999, 60.699993, 73.09999);
((GeneralPath)shape).curveTo(62.099995, 74.09999, 62.999992, 75.59999, 63.399994, 77.399994);
((GeneralPath)shape).lineTo(59.399994, 78.2);
((GeneralPath)shape).curveTo(59.099995, 77.2, 58.599995, 76.399994, 57.799995, 75.899994);
((GeneralPath)shape).curveTo(56.999996, 75.399994, 56.199997, 74.99999, 55.099995, 74.99999);
((GeneralPath)shape).curveTo(53.299995, 74.99999, 51.899994, 75.59999, 50.899994, 76.69999);
((GeneralPath)shape).curveTo(49.899994, 77.79999, 49.299995, 79.49999, 49.299995, 81.69999);
((GeneralPath)shape).curveTo(49.299995, 84.09999, 49.799995, 85.89999, 50.899994, 87.09999);
((GeneralPath)shape).curveTo(51.999992, 88.29999, 53.299995, 88.899994, 55.099995, 88.899994);
((GeneralPath)shape).curveTo(55.899994, 88.899994, 56.799995, 88.7, 57.599995, 88.399994);
((GeneralPath)shape).curveTo(58.499996, 88.09999, 59.199993, 87.7, 59.799995, 87.2);
((GeneralPath)shape).lineTo(59.799995, 84.7);
((GeneralPath)shape).lineTo(55.099995, 84.7);
((GeneralPath)shape).closePath();
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
	 * Creates a new transcoded SVG image. It is recommended to use the 
	 * {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	public ext_cfg() {
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
       ext_cfg base = new ext_cfg();
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
       ext_cfg base = new ext_cfg();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static ResizableIconFactory factory() {
        return () -> new ext_cfg();
    }
}

