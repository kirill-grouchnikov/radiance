package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.IsHiDpiAware;
import org.pushingpixels.neon.icon.NeonIcon;
import org.pushingpixels.neon.icon.NeonIconUIResource;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconFactory;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_mdb implements ResizableIcon, IsHiDpiAware {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(-0.2, 99.0);
((GeneralPath)shape).lineTo(-0.2, 1.0);
((GeneralPath)shape).lineTo(45.1, 1.0);
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
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(-0.2, 99.0);
((GeneralPath)shape).lineTo(-0.2, 1.0);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(160, 53, 55, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(-0.2, 99.0);
((GeneralPath)shape).lineTo(-0.2, 1.0);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.3, 91.1);
((GeneralPath)shape).lineTo(6.3, 71.2);
((GeneralPath)shape).lineTo(12.4, 71.2);
((GeneralPath)shape).lineTo(16.0, 84.8);
((GeneralPath)shape).lineTo(19.6, 71.3);
((GeneralPath)shape).lineTo(25.7, 71.3);
((GeneralPath)shape).lineTo(25.7, 91.100006);
((GeneralPath)shape).lineTo(22.0, 91.100006);
((GeneralPath)shape).lineTo(22.0, 75.4);
((GeneralPath)shape).lineTo(18.0, 91.0);
((GeneralPath)shape).lineTo(14.0, 91.0);
((GeneralPath)shape).lineTo(10.0, 75.4);
((GeneralPath)shape).lineTo(10.0, 91.0);
((GeneralPath)shape).lineTo(6.3, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.8, 71.2);
((GeneralPath)shape).lineTo(37.2, 71.2);
((GeneralPath)shape).curveTo(38.9, 71.2, 40.2, 71.299995, 41.0, 71.6);
((GeneralPath)shape).curveTo(42.2, 71.9, 43.2, 72.6, 44.0, 73.4);
((GeneralPath)shape).curveTo(44.8, 74.200005, 45.5, 75.3, 45.9, 76.6);
((GeneralPath)shape).curveTo(46.300003, 77.9, 46.600002, 79.4, 46.600002, 81.299995);
((GeneralPath)shape).curveTo(46.600002, 82.899994, 46.4, 84.299995, 46.000004, 85.49999);
((GeneralPath)shape).curveTo(45.500004, 86.899994, 44.800003, 88.09999, 43.800003, 88.99999);
((GeneralPath)shape).curveTo(43.100002, 89.69999, 42.100002, 90.19999, 40.9, 90.59999);
((GeneralPath)shape).curveTo(40.0, 90.899994, 38.800003, 90.99999, 37.300003, 90.99999);
((GeneralPath)shape).lineTo(29.600002, 90.99999);
((GeneralPath)shape).lineTo(29.600002, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.899998, 74.6);
((GeneralPath)shape).lineTo(33.899998, 87.7);
((GeneralPath)shape).lineTo(36.899998, 87.7);
((GeneralPath)shape).curveTo(37.999996, 87.7, 38.899998, 87.6, 39.399998, 87.5);
((GeneralPath)shape).curveTo(40.1, 87.3, 40.6, 87.1, 40.999996, 86.7);
((GeneralPath)shape).curveTo(41.399994, 86.299995, 41.799995, 85.7, 42.099995, 84.799995);
((GeneralPath)shape).curveTo(42.399994, 83.899994, 42.499996, 82.7, 42.499996, 81.2);
((GeneralPath)shape).curveTo(42.499996, 79.7, 42.399998, 78.5, 42.099995, 77.7);
((GeneralPath)shape).curveTo(41.79999, 76.899994, 41.399994, 76.2, 40.899994, 75.799995);
((GeneralPath)shape).curveTo(40.399994, 75.299995, 39.799995, 74.99999, 38.999992, 74.899994);
((GeneralPath)shape).curveTo(38.399994, 74.799995, 37.29999, 74.7, 35.699993, 74.7);
((GeneralPath)shape).lineTo(33.899994, 74.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.199997, 71.2);
((GeneralPath)shape).lineTo(58.299995, 71.2);
((GeneralPath)shape).curveTo(59.899994, 71.2, 61.099995, 71.299995, 61.899994, 71.399994);
((GeneralPath)shape).curveTo(62.699993, 71.49999, 63.399994, 71.799995, 63.999992, 72.2);
((GeneralPath)shape).curveTo(64.59999, 72.6, 65.09999, 73.2, 65.49999, 73.899994);
((GeneralPath)shape).curveTo(65.899994, 74.59999, 66.09999, 75.399994, 66.09999, 76.2);
((GeneralPath)shape).curveTo(66.09999, 77.1, 65.79999, 78.0, 65.29999, 78.799995);
((GeneralPath)shape).curveTo(64.79999, 79.59999, 64.09999, 80.2, 63.19999, 80.49999);
((GeneralPath)shape).curveTo(64.39999, 80.899994, 65.39999, 81.49999, 65.99999, 82.299995);
((GeneralPath)shape).curveTo(66.69999, 83.1, 66.99999, 84.1, 66.99999, 85.299995);
((GeneralPath)shape).curveTo(66.99999, 86.2, 66.799995, 87.1, 66.399994, 87.899994);
((GeneralPath)shape).curveTo(65.99999, 88.69999, 65.399994, 89.399994, 64.7, 89.899994);
((GeneralPath)shape).curveTo(64.0, 90.399994, 62.999996, 90.799995, 61.999996, 90.899994);
((GeneralPath)shape).curveTo(61.299995, 90.99999, 59.599995, 90.99999, 56.999996, 91.09999);
((GeneralPath)shape).lineTo(50.099995, 91.09999);
((GeneralPath)shape).lineTo(50.099995, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.299995, 74.5);
((GeneralPath)shape).lineTo(54.299995, 79.1);
((GeneralPath)shape).lineTo(57.0, 79.1);
((GeneralPath)shape).curveTo(58.6, 79.1, 59.6, 79.1, 60.0, 79.0);
((GeneralPath)shape).curveTo(60.7, 78.9, 61.2, 78.7, 61.6, 78.3);
((GeneralPath)shape).curveTo(62.0, 77.9, 62.199997, 77.4, 62.199997, 76.8);
((GeneralPath)shape).curveTo(62.199997, 76.200005, 61.999996, 75.700005, 61.699997, 75.3);
((GeneralPath)shape).curveTo(61.399998, 74.9, 60.799995, 74.700005, 60.199997, 74.600006);
((GeneralPath)shape).curveTo(59.799995, 74.600006, 58.6, 74.50001, 56.699997, 74.50001);
((GeneralPath)shape).lineTo(54.299995, 74.50001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.299995, 82.4);
((GeneralPath)shape).lineTo(54.299995, 87.700005);
((GeneralPath)shape).lineTo(58.0, 87.700005);
((GeneralPath)shape).curveTo(59.5, 87.700005, 60.4, 87.700005, 60.8, 87.600006);
((GeneralPath)shape).curveTo(61.399998, 87.50001, 61.899998, 87.200005, 62.3, 86.8);
((GeneralPath)shape).curveTo(62.7, 86.4, 62.899998, 85.8, 62.899998, 85.100006);
((GeneralPath)shape).curveTo(62.899998, 84.50001, 62.8, 84.00001, 62.499996, 83.600006);
((GeneralPath)shape).curveTo(62.199993, 83.200005, 61.799995, 82.90001, 61.199997, 82.700005);
((GeneralPath)shape).curveTo(60.6, 82.5, 59.399998, 82.4, 57.6, 82.4);
((GeneralPath)shape).lineTo(54.3, 82.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new Color(242, 242, 242, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 48.1);
((GeneralPath)shape).curveTo(54.0, 50.6, 45.9, 52.6, 36.0, 52.6);
((GeneralPath)shape).curveTo(26.099998, 52.6, 18.0, 50.6, 18.0, 48.1);
((GeneralPath)shape).curveTo(18.0, 45.6, 26.1, 43.6, 36.0, 43.6);
((GeneralPath)shape).curveTo(45.9, 43.6, 54.0, 45.6, 54.0, 48.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 47.22200012207031), new Point2D.Double(43.02799987792969, 61.27799987792969), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.5, 47.8);
((GeneralPath)shape).curveTo(49.5, 50.0, 43.5, 51.7, 36.0, 51.7);
((GeneralPath)shape).curveTo(28.5, 51.7, 22.5, 50.0, 22.5, 47.8);
((GeneralPath)shape).curveTo(22.5, 45.6, 28.5, 43.899998, 36.0, 43.899998);
((GeneralPath)shape).curveTo(43.5, 43.899998, 49.5, 45.6, 49.5, 47.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(18.0, 45.900001525878906), new Point2D.Double(54.0, 45.900001525878906), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.0, 48.3);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).curveTo(18.0, 59.5, 22.5, 64.0, 36.0, 64.0);
((GeneralPath)shape).curveTo(49.5, 64.0, 54.0, 59.5, 54.0, 59.5);
((GeneralPath)shape).lineTo(54.0, 48.3);
((GeneralPath)shape).curveTo(54.0, 48.3, 51.8, 52.2, 36.0, 52.5);
((GeneralPath)shape).curveTo(20.2, 52.8, 18.0, 48.3, 18.0, 48.3);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new Color(242, 242, 242, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 32.3);
((GeneralPath)shape).curveTo(54.0, 34.8, 45.9, 36.8, 36.0, 36.8);
((GeneralPath)shape).curveTo(26.099998, 36.8, 18.0, 34.8, 18.0, 32.3);
((GeneralPath)shape).curveTo(18.0, 29.8, 26.1, 27.8, 36.0, 27.8);
((GeneralPath)shape).curveTo(45.9, 27.8, 54.0, 29.8, 54.0, 32.3);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = new LinearGradientPaint(new Point2D.Double(28.95400047302246, 63.00400161743164), new Point2D.Double(43.0099983215332, 77.05999755859375), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.5, 31.9);
((GeneralPath)shape).curveTo(49.5, 34.1, 43.5, 35.8, 36.0, 35.8);
((GeneralPath)shape).curveTo(28.5, 35.8, 22.5, 34.1, 22.5, 31.9);
((GeneralPath)shape).curveTo(22.5, 29.7, 28.5, 28.0, 36.0, 28.0);
((GeneralPath)shape).curveTo(43.5, 28.1, 49.5, 29.8, 49.5, 31.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
paint = new LinearGradientPaint(new Point2D.Double(18.0, 61.599998474121094), new Point2D.Double(54.0, 61.599998474121094), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.0, 32.6);
((GeneralPath)shape).lineTo(18.0, 43.8);
((GeneralPath)shape).curveTo(18.0, 43.8, 22.5, 48.3, 36.0, 48.3);
((GeneralPath)shape).curveTo(49.5, 48.3, 54.0, 43.8, 54.0, 43.8);
((GeneralPath)shape).lineTo(54.0, 32.6);
((GeneralPath)shape).curveTo(54.0, 32.6, 51.8, 36.5, 36.0, 36.8);
((GeneralPath)shape).curveTo(20.2, 37.1, 18.0, 32.6, 18.0, 32.6);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 16.6);
((GeneralPath)shape).curveTo(54.0, 19.1, 45.9, 21.1, 36.0, 21.1);
((GeneralPath)shape).curveTo(26.099998, 21.1, 18.0, 19.1, 18.0, 16.6);
((GeneralPath)shape).curveTo(18.0, 14.1, 26.1, 12.1, 36.0, 12.1);
((GeneralPath)shape).curveTo(45.9, 12.1, 54.0, 14.1, 54.0, 16.6);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 78.72200012207031), new Point2D.Double(43.02799987792969, 92.77799987792969), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.5, 16.3);
((GeneralPath)shape).curveTo(49.5, 18.5, 43.5, 20.199999, 36.0, 20.199999);
((GeneralPath)shape).curveTo(28.5, 20.199999, 22.5, 18.499998, 22.5, 16.3);
((GeneralPath)shape).curveTo(22.5, 14.1, 28.5, 12.4, 36.0, 12.4);
((GeneralPath)shape).curveTo(43.5, 12.4, 49.5, 14.099999, 49.5, 16.3);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_11
paint = new LinearGradientPaint(new Point2D.Double(18.0, 77.4000015258789), new Point2D.Double(54.0, 77.4000015258789), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.0, 16.8);
((GeneralPath)shape).lineTo(18.0, 28.0);
((GeneralPath)shape).curveTo(18.0, 28.0, 22.5, 32.5, 36.0, 32.5);
((GeneralPath)shape).curveTo(49.5, 32.5, 54.0, 28.0, 54.0, 28.0);
((GeneralPath)shape).lineTo(54.0, 16.8);
((GeneralPath)shape).curveTo(54.0, 16.8, 51.8, 20.699999, 36.0, 21.0);
((GeneralPath)shape).curveTo(20.2, 21.3, 18.0, 16.8, 18.0, 16.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_12
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_13
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.1, 1.0);
((GeneralPath)shape).lineTo(71.3, 27.7);
((GeneralPath)shape).lineTo(44.1, 27.7);
((GeneralPath)shape).lineTo(44.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(160, 53, 55, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.1, 1.0);
((GeneralPath)shape).lineTo(71.3, 27.7);
((GeneralPath)shape).lineTo(44.1, 27.7);
((GeneralPath)shape).lineTo(44.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_13);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12799999117851257;
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
		return 0.7450000047683716;
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
	public ext_mdb() {
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
       ext_mdb base = new ext_mdb();
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
       ext_mdb base = new ext_mdb();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static ResizableIconFactory factory() {
        return () -> new NeonIcon(new ext_mdb());
    }
}

