package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_pkg implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
paint = new LinearGradientPaint(new Point2D.Double(35.75, 2.994999885559082), new Point2D.Double(35.75, 101.0009994506836), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {new Color(239, 196, 2, 255),new Color(241, 200, 41, 255),new Color(244, 210, 100, 255),new Color(247, 220, 139, 255),new Color(249, 229, 172, 255),new Color(251, 236, 199, 255),new Color(252, 243, 221, 255),new Color(254, 249, 238, 255),new Color(255, 253, 249, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(160, 120, 2, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.8, 92.1);
((GeneralPath)shape).lineTo(7.8, 72.2);
((GeneralPath)shape).lineTo(14.3, 72.2);
((GeneralPath)shape).curveTo(16.8, 72.2, 18.4, 72.299995, 19.1, 72.5);
((GeneralPath)shape).curveTo(20.2, 72.8, 21.2, 73.4, 22.0, 74.4);
((GeneralPath)shape).curveTo(22.8, 75.4, 23.2, 76.700005, 23.2, 78.3);
((GeneralPath)shape).curveTo(23.2, 79.5, 23.0, 80.5, 22.5, 81.4);
((GeneralPath)shape).curveTo(22.1, 82.200005, 21.5, 82.9, 20.8, 83.4);
((GeneralPath)shape).curveTo(20.099998, 83.9, 19.4, 84.200005, 18.699999, 84.3);
((GeneralPath)shape).curveTo(17.699999, 84.5, 16.3, 84.600006, 14.499999, 84.600006);
((GeneralPath)shape).lineTo(11.9, 84.600006);
((GeneralPath)shape).lineTo(11.9, 92.100006);
((GeneralPath)shape).lineTo(7.8, 92.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(11.8, 75.6);
((GeneralPath)shape).lineTo(11.8, 81.2);
((GeneralPath)shape).lineTo(14.0, 81.2);
((GeneralPath)shape).curveTo(15.6, 81.2, 16.7, 81.1, 17.2, 80.899994);
((GeneralPath)shape).curveTo(17.7, 80.7, 18.2, 80.399994, 18.5, 79.899994);
((GeneralPath)shape).curveTo(18.8, 79.49999, 19.0, 78.899994, 19.0, 78.399994);
((GeneralPath)shape).curveTo(19.0, 77.7, 18.8, 77.09999, 18.4, 76.59999);
((GeneralPath)shape).curveTo(18.0, 76.09999, 17.4, 75.79999, 16.8, 75.69999);
((GeneralPath)shape).curveTo(16.3, 75.59999, 15.299999, 75.59999, 13.9, 75.59999);
((GeneralPath)shape).lineTo(11.799999, 75.59999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.5, 92.1);
((GeneralPath)shape).lineTo(26.5, 72.2);
((GeneralPath)shape).lineTo(30.5, 72.2);
((GeneralPath)shape).lineTo(30.5, 81.0);
((GeneralPath)shape).lineTo(38.7, 72.2);
((GeneralPath)shape).lineTo(44.100002, 72.2);
((GeneralPath)shape).lineTo(36.6, 80.0);
((GeneralPath)shape).lineTo(44.6, 92.1);
((GeneralPath)shape).lineTo(39.399998, 92.1);
((GeneralPath)shape).lineTo(33.899998, 82.799995);
((GeneralPath)shape).lineTo(30.599998, 86.1);
((GeneralPath)shape).lineTo(30.599998, 92.1);
((GeneralPath)shape).lineTo(26.499998, 92.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(56.0, 84.8);
((GeneralPath)shape).lineTo(56.0, 81.5);
((GeneralPath)shape).lineTo(64.7, 81.5);
((GeneralPath)shape).lineTo(64.7, 89.4);
((GeneralPath)shape).curveTo(63.899998, 90.200005, 62.6, 90.9, 60.999996, 91.5);
((GeneralPath)shape).curveTo(59.399998, 92.1, 57.799995, 92.4, 56.099995, 92.4);
((GeneralPath)shape).curveTo(53.999996, 92.4, 52.199993, 92.0, 50.599995, 91.1);
((GeneralPath)shape).curveTo(48.999996, 90.2, 47.899994, 89.0, 47.099995, 87.4);
((GeneralPath)shape).curveTo(46.399994, 85.700005, 45.999996, 84.0, 45.999996, 82.1);
((GeneralPath)shape).curveTo(45.999996, 80.0, 46.399998, 78.2, 47.299995, 76.6);
((GeneralPath)shape).curveTo(48.199993, 75.0, 49.499996, 73.799995, 51.099995, 72.9);
((GeneralPath)shape).curveTo(52.399994, 72.200005, 53.999996, 71.9, 55.899994, 71.9);
((GeneralPath)shape).curveTo(58.399994, 71.9, 60.299995, 72.4, 61.699993, 73.4);
((GeneralPath)shape).curveTo(63.099995, 74.4, 63.999992, 75.9, 64.399994, 77.700005);
((GeneralPath)shape).lineTo(60.399994, 78.4);
((GeneralPath)shape).curveTo(60.099995, 77.4, 59.599995, 76.700005, 58.799995, 76.1);
((GeneralPath)shape).curveTo(57.999996, 75.5, 56.999996, 75.299995, 55.899994, 75.299995);
((GeneralPath)shape).curveTo(54.099995, 75.299995, 52.699993, 75.899994, 51.699993, 76.99999);
((GeneralPath)shape).curveTo(50.699993, 78.09999, 50.099995, 79.799995, 50.099995, 81.899994);
((GeneralPath)shape).curveTo(50.099995, 84.299995, 50.599995, 85.99999, 51.699993, 87.2);
((GeneralPath)shape).curveTo(52.79999, 88.399994, 54.099995, 89.0, 55.899994, 89.0);
((GeneralPath)shape).curveTo(56.699993, 89.0, 57.599995, 88.8, 58.499992, 88.5);
((GeneralPath)shape).curveTo(59.399994, 88.2, 60.09999, 87.8, 60.699993, 87.3);
((GeneralPath)shape).lineTo(60.699993, 84.8);
((GeneralPath)shape).lineTo(56.0, 84.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -952.3619995117188f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
paint = new LinearGradientPaint(new Point2D.Double(12.470999717712402, 995.2769775390625), new Point2D.Double(60.077999114990234, 995.2769775390625), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {new Color(164, 125, 3, 255),new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.0, 973.4);
((GeneralPath)shape).curveTo(29.9, 973.4, 29.8, 973.4, 29.7, 973.5);
((GeneralPath)shape).lineTo(13.0, 981.1);
((GeneralPath)shape).curveTo(12.5, 981.3, 12.3, 982.1, 12.7, 982.6);
((GeneralPath)shape).lineTo(17.9, 988.69995);
((GeneralPath)shape).lineTo(12.7, 994.69995);
((GeneralPath)shape).curveTo(12.4, 995.1, 12.5, 995.89996, 13.0, 996.19995);
((GeneralPath)shape).lineTo(18.2, 998.6);
((GeneralPath)shape).lineTo(18.2, 1008.69995);
((GeneralPath)shape).curveTo(18.2, 1009.1, 18.400002, 1009.39996, 18.800001, 1009.6);
((GeneralPath)shape).lineTo(35.9, 1017.19995);
((GeneralPath)shape).curveTo(36.100002, 1017.2999, 36.4, 1017.2999, 36.7, 1017.19995);
((GeneralPath)shape).lineTo(53.9, 1009.6);
((GeneralPath)shape).curveTo(54.2, 1009.5, 54.5, 1009.1, 54.5, 1008.69995);
((GeneralPath)shape).lineTo(54.5, 998.6);
((GeneralPath)shape).lineTo(59.7, 996.19995);
((GeneralPath)shape).curveTo(60.2, 995.99994, 60.4, 995.19995, 60.0, 994.69995);
((GeneralPath)shape).lineTo(54.8, 988.69995);
((GeneralPath)shape).lineTo(60.0, 982.6);
((GeneralPath)shape).curveTo(60.4, 982.19995, 60.2, 981.39996, 59.7, 981.1);
((GeneralPath)shape).lineTo(43.0, 973.5);
((GeneralPath)shape).curveTo(42.9, 973.4, 42.7, 973.4, 42.5, 973.4);
((GeneralPath)shape).curveTo(42.3, 973.4, 42.0, 973.5, 41.9, 973.7);
((GeneralPath)shape).lineTo(36.4, 979.60004);
((GeneralPath)shape).lineTo(30.900002, 973.7);
((GeneralPath)shape).curveTo(30.600002, 973.5, 30.300001, 973.3, 30.000002, 973.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.8, 975.5);
((GeneralPath)shape).lineTo(34.6, 980.7);
((GeneralPath)shape).lineTo(19.3, 987.5);
((GeneralPath)shape).lineTo(14.9, 982.3);
((GeneralPath)shape).lineTo(29.8, 975.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.699997, 975.5);
((GeneralPath)shape).lineTo(57.6, 982.3);
((GeneralPath)shape).lineTo(53.199997, 987.5);
((GeneralPath)shape).lineTo(37.899998, 980.7);
((GeneralPath)shape).lineTo(42.699997, 975.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.299995, 982.0);
((GeneralPath)shape).lineTo(51.099995, 988.6);
((GeneralPath)shape).lineTo(36.299995, 995.19995);
((GeneralPath)shape).lineTo(21.499996, 988.6);
((GeneralPath)shape).lineTo(36.299995, 982.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.399996, 989.8);
((GeneralPath)shape).lineTo(34.699997, 996.6);
((GeneralPath)shape).lineTo(29.899998, 1001.8);
((GeneralPath)shape).lineTo(15.0, 995.0);
((GeneralPath)shape).lineTo(19.4, 989.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.199997, 989.8);
((GeneralPath)shape).lineTo(57.6, 995.0);
((GeneralPath)shape).lineTo(42.699997, 1001.8);
((GeneralPath)shape).lineTo(37.899998, 996.6);
((GeneralPath)shape).lineTo(53.199997, 989.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.299995, 998.7);
((GeneralPath)shape).lineTo(35.299995, 1014.8);
((GeneralPath)shape).lineTo(20.0, 1008.0);
((GeneralPath)shape).lineTo(20.0, 999.4);
((GeneralPath)shape).lineTo(29.6, 1003.80005);
((GeneralPath)shape).curveTo(30.0, 1004.00006, 30.4, 1003.9, 30.7, 1003.60004);
((GeneralPath)shape).lineTo(35.3, 998.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.199997, 998.7);
((GeneralPath)shape).lineTo(41.699997, 1003.60004);
((GeneralPath)shape).curveTo(41.999996, 1003.9, 42.399998, 1004.00006, 42.799995, 1003.80005);
((GeneralPath)shape).lineTo(52.399994, 999.4);
((GeneralPath)shape).lineTo(52.399994, 1008.0);
((GeneralPath)shape).lineTo(37.099995, 1014.8);
((GeneralPath)shape).lineTo(37.099995, 998.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(11.720999717712402, 995.2769775390625), new Point2D.Double(60.827999114990234, 995.2769775390625), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {new Color(164, 125, 3, 255),new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.0, 973.4);
((GeneralPath)shape).curveTo(29.9, 973.4, 29.8, 973.4, 29.7, 973.5);
((GeneralPath)shape).lineTo(13.0, 981.1);
((GeneralPath)shape).curveTo(12.5, 981.3, 12.3, 982.1, 12.7, 982.6);
((GeneralPath)shape).lineTo(17.9, 988.69995);
((GeneralPath)shape).lineTo(12.7, 994.69995);
((GeneralPath)shape).curveTo(12.4, 995.1, 12.5, 995.89996, 13.0, 996.19995);
((GeneralPath)shape).lineTo(18.2, 998.6);
((GeneralPath)shape).lineTo(18.2, 1008.69995);
((GeneralPath)shape).curveTo(18.2, 1009.1, 18.400002, 1009.39996, 18.800001, 1009.6);
((GeneralPath)shape).lineTo(35.9, 1017.19995);
((GeneralPath)shape).curveTo(36.100002, 1017.2999, 36.4, 1017.2999, 36.7, 1017.19995);
((GeneralPath)shape).lineTo(53.9, 1009.6);
((GeneralPath)shape).curveTo(54.2, 1009.5, 54.5, 1009.1, 54.5, 1008.69995);
((GeneralPath)shape).lineTo(54.5, 998.6);
((GeneralPath)shape).lineTo(59.7, 996.19995);
((GeneralPath)shape).curveTo(60.2, 995.99994, 60.4, 995.19995, 60.0, 994.69995);
((GeneralPath)shape).lineTo(54.8, 988.69995);
((GeneralPath)shape).lineTo(60.0, 982.6);
((GeneralPath)shape).curveTo(60.4, 982.19995, 60.2, 981.39996, 59.7, 981.1);
((GeneralPath)shape).lineTo(43.0, 973.5);
((GeneralPath)shape).curveTo(42.9, 973.4, 42.7, 973.4, 42.5, 973.4);
((GeneralPath)shape).curveTo(42.3, 973.4, 42.0, 973.5, 41.9, 973.7);
((GeneralPath)shape).lineTo(36.4, 979.60004);
((GeneralPath)shape).lineTo(30.900002, 973.7);
((GeneralPath)shape).curveTo(30.600002, 973.5, 30.300001, 973.3, 30.000002, 973.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.8, 975.5);
((GeneralPath)shape).lineTo(34.6, 980.7);
((GeneralPath)shape).lineTo(19.3, 987.5);
((GeneralPath)shape).lineTo(14.9, 982.3);
((GeneralPath)shape).lineTo(29.8, 975.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.699997, 975.5);
((GeneralPath)shape).lineTo(57.6, 982.3);
((GeneralPath)shape).lineTo(53.199997, 987.5);
((GeneralPath)shape).lineTo(37.899998, 980.7);
((GeneralPath)shape).lineTo(42.699997, 975.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.299995, 982.0);
((GeneralPath)shape).lineTo(51.099995, 988.6);
((GeneralPath)shape).lineTo(36.299995, 995.19995);
((GeneralPath)shape).lineTo(21.499996, 988.6);
((GeneralPath)shape).lineTo(36.299995, 982.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.399996, 989.8);
((GeneralPath)shape).lineTo(34.699997, 996.6);
((GeneralPath)shape).lineTo(29.899998, 1001.8);
((GeneralPath)shape).lineTo(15.0, 995.0);
((GeneralPath)shape).lineTo(19.4, 989.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.199997, 989.8);
((GeneralPath)shape).lineTo(57.6, 995.0);
((GeneralPath)shape).lineTo(42.699997, 1001.8);
((GeneralPath)shape).lineTo(37.899998, 996.6);
((GeneralPath)shape).lineTo(53.199997, 989.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.299995, 998.7);
((GeneralPath)shape).lineTo(35.299995, 1014.8);
((GeneralPath)shape).lineTo(20.0, 1008.0);
((GeneralPath)shape).lineTo(20.0, 999.4);
((GeneralPath)shape).lineTo(29.6, 1003.80005);
((GeneralPath)shape).curveTo(30.0, 1004.00006, 30.4, 1003.9, 30.7, 1003.60004);
((GeneralPath)shape).lineTo(35.3, 998.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.199997, 998.7);
((GeneralPath)shape).lineTo(41.699997, 1003.60004);
((GeneralPath)shape).curveTo(41.999996, 1003.9, 42.399998, 1004.00006, 42.799995, 1003.80005);
((GeneralPath)shape).lineTo(52.399994, 999.4);
((GeneralPath)shape).lineTo(52.399994, 1008.0);
((GeneralPath)shape).lineTo(37.099995, 1014.8);
((GeneralPath)shape).lineTo(37.099995, 998.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_0);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
paint = new LinearGradientPaint(new Point2D.Double(45.34400177001953, 74.2300033569336), new Point2D.Double(58.84400177001953, 87.7300033569336), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 254, 251, 255),new Color(254, 250, 241, 255),new Color(253, 245, 228, 255),new Color(252, 240, 210, 255),new Color(250, 233, 188, 255),new Color(249, 226, 162, 255),new Color(247, 218, 131, 255),new Color(244, 209, 93, 255),new Color(241, 200, 39, 255),new Color(239, 196, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3_1);
g.setTransform(defaultTransform__0_3);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12800002098083496;
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
		return 0.7410274147987366;
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
	public ext_pkg() {
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
       ext_pkg base = new ext_pkg();
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
       ext_pkg base = new ext_pkg();
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
        return () -> new ext_pkg();
    }
}

