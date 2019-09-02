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
public class ext_deb implements ResizableIcon {
    

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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -952.3619995117188f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
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
paint = new LinearGradientPaint(new Point2D.Double(36.275001525878906, 1017.1959838867188), new Point2D.Double(36.275001525878906, 973.3590087890625), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.275001525878906, 1017.9459838867188), new Point2D.Double(36.275001525878906, 972.6090087890625), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
((GeneralPath)shape).moveTo(9.4, 72.2);
((GeneralPath)shape).lineTo(16.599998, 72.2);
((GeneralPath)shape).curveTo(18.199999, 72.2, 19.499998, 72.299995, 20.3, 72.6);
((GeneralPath)shape).curveTo(21.4, 72.9, 22.4, 73.5, 23.199999, 74.4);
((GeneralPath)shape).curveTo(23.999998, 75.3, 24.599998, 76.3, 25.099998, 77.5);
((GeneralPath)shape).curveTo(25.499998, 78.7, 25.699999, 80.3, 25.699999, 82.1);
((GeneralPath)shape).curveTo(25.699999, 83.7, 25.499998, 85.1, 25.099998, 86.2);
((GeneralPath)shape).curveTo(24.599998, 87.6, 23.899998, 88.7, 22.999998, 89.6);
((GeneralPath)shape).curveTo(22.299997, 90.299995, 21.399998, 90.799995, 20.199999, 91.1);
((GeneralPath)shape).curveTo(19.3, 91.4, 18.199999, 91.5, 16.699999, 91.5);
((GeneralPath)shape).lineTo(9.4, 91.5);
((GeneralPath)shape).lineTo(9.4, 72.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(13.299999, 75.5);
((GeneralPath)shape).lineTo(13.299999, 88.3);
((GeneralPath)shape).lineTo(16.199999, 88.3);
((GeneralPath)shape).curveTo(17.3, 88.3, 18.099998, 88.200005, 18.599998, 88.100006);
((GeneralPath)shape).curveTo(19.199999, 87.90001, 19.8, 87.700005, 20.199999, 87.3);
((GeneralPath)shape).curveTo(20.599998, 86.9, 20.999998, 86.3, 21.199999, 85.4);
((GeneralPath)shape).curveTo(21.499998, 84.5, 21.599998, 83.4, 21.599998, 81.9);
((GeneralPath)shape).curveTo(21.599998, 80.4, 21.499998, 79.3, 21.199999, 78.5);
((GeneralPath)shape).curveTo(20.9, 77.7, 20.599998, 77.1, 20.099998, 76.6);
((GeneralPath)shape).curveTo(19.599998, 76.2, 18.999998, 75.799995, 18.3, 75.7);
((GeneralPath)shape).curveTo(17.699999, 75.6, 16.699999, 75.5, 15.099999, 75.5);
((GeneralPath)shape).lineTo(13.299999, 75.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.099998, 91.5);
((GeneralPath)shape).lineTo(29.099998, 72.2);
((GeneralPath)shape).lineTo(43.6, 72.2);
((GeneralPath)shape).lineTo(43.6, 75.5);
((GeneralPath)shape).lineTo(33.0, 75.5);
((GeneralPath)shape).lineTo(33.0, 79.8);
((GeneralPath)shape).lineTo(42.8, 79.8);
((GeneralPath)shape).lineTo(42.8, 83.0);
((GeneralPath)shape).lineTo(33.0, 83.0);
((GeneralPath)shape).lineTo(33.0, 88.3);
((GeneralPath)shape).lineTo(43.9, 88.3);
((GeneralPath)shape).lineTo(43.9, 91.600006);
((GeneralPath)shape).lineTo(29.1, 91.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.3, 72.2);
((GeneralPath)shape).lineTo(55.1, 72.2);
((GeneralPath)shape).curveTo(56.6, 72.2, 57.8, 72.299995, 58.6, 72.399994);
((GeneralPath)shape).curveTo(59.399998, 72.49999, 60.0, 72.799995, 60.6, 73.2);
((GeneralPath)shape).curveTo(61.199997, 73.6, 61.699997, 74.1, 62.1, 74.799995);
((GeneralPath)shape).curveTo(62.5, 75.49999, 62.699997, 76.2, 62.699997, 77.1);
((GeneralPath)shape).curveTo(62.699997, 78.0, 62.499996, 78.799995, 61.999996, 79.6);
((GeneralPath)shape).curveTo(61.499996, 80.4, 60.799995, 80.9, 59.999996, 81.299995);
((GeneralPath)shape).curveTo(61.199997, 81.6, 62.099995, 82.2, 62.699997, 83.1);
((GeneralPath)shape).curveTo(63.299995, 83.9, 63.699997, 84.9, 63.699997, 86.0);
((GeneralPath)shape).curveTo(63.699997, 86.9, 63.499996, 87.7, 63.1, 88.6);
((GeneralPath)shape).curveTo(62.699997, 89.4, 62.1, 90.1, 61.399998, 90.6);
((GeneralPath)shape).curveTo(60.699997, 91.1, 59.8, 91.4, 58.8, 91.5);
((GeneralPath)shape).curveTo(58.1, 91.6, 56.6, 91.6, 54.0, 91.6);
((GeneralPath)shape).lineTo(47.4, 91.6);
((GeneralPath)shape).lineTo(47.4, 72.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(51.2, 75.399994);
((GeneralPath)shape).lineTo(51.2, 79.899994);
((GeneralPath)shape).lineTo(53.8, 79.899994);
((GeneralPath)shape).curveTo(55.3, 79.899994, 56.3, 79.899994, 56.7, 79.799995);
((GeneralPath)shape).curveTo(57.4, 79.7, 57.9, 79.49999, 58.3, 79.1);
((GeneralPath)shape).curveTo(58.7, 78.7, 58.899998, 78.2, 58.899998, 77.6);
((GeneralPath)shape).curveTo(58.899998, 77.0, 58.699997, 76.5, 58.399998, 76.1);
((GeneralPath)shape).curveTo(58.1, 75.7, 57.6, 75.5, 56.899998, 75.4);
((GeneralPath)shape).curveTo(56.499996, 75.4, 55.399998, 75.3, 53.499996, 75.3);
((GeneralPath)shape).lineTo(51.199997, 75.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(51.2, 83.09999);
((GeneralPath)shape).lineTo(51.2, 88.29999);
((GeneralPath)shape).lineTo(54.8, 88.29999);
((GeneralPath)shape).curveTo(56.2, 88.29999, 57.1, 88.29999, 57.5, 88.19999);
((GeneralPath)shape).curveTo(58.1, 88.09999, 58.6, 87.79999, 58.9, 87.39999);
((GeneralPath)shape).curveTo(59.300003, 86.999985, 59.5, 86.39999, 59.5, 85.79999);
((GeneralPath)shape).curveTo(59.5, 85.19999, 59.4, 84.69999, 59.1, 84.29999);
((GeneralPath)shape).curveTo(58.799995, 83.89999, 58.399998, 83.59999, 57.899998, 83.39999);
((GeneralPath)shape).curveTo(57.399998, 83.19998, 56.199997, 83.09998, 54.399998, 83.09998);
((GeneralPath)shape).lineTo(51.199997, 83.09998);
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
	private ext_deb() {
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
       ext_deb base = new ext_deb();
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
       ext_deb base = new ext_deb();
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
        return ext_deb::new;
    }
}

