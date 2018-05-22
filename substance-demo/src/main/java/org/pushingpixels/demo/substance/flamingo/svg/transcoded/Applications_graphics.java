package org.pushingpixels.demo.substance.flamingo.svg.transcoded;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/ibis">Ibis SVG transcoder</a>.
 */
public class Applications_graphics implements
		org.pushingpixels.flamingo.api.common.icon.ResizableIcon {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.3f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.069200038909912f, 0.0f, 0.0f, 1.1230000257492065f, 5.769000053405762f, -7.116199970245361f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(26.781999588012695, 42.34299850463867), 14.407f, new Point2D.Double(26.781999588012695, 42.34299850463867), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.28220999240875244f, 2.936099951220735E-15f, 30.393999099731445f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(41.189, 42.343);
((GeneralPath)shape).curveTo(41.212086, 43.799988, 38.471092, 45.149097, 34.003914, 45.87948);
((GeneralPath)shape).curveTo(29.536732, 46.60986, 24.026266, 46.60986, 19.559084, 45.87948);
((GeneralPath)shape).curveTo(15.091904, 45.149097, 12.35091, 43.799988, 12.373999, 42.343);
((GeneralPath)shape).curveTo(12.35091, 40.88601, 15.091904, 39.5369, 19.559084, 38.80652);
((GeneralPath)shape).curveTo(24.026266, 38.076138, 29.536732, 38.076138, 34.003914, 38.80652);
((GeneralPath)shape).curveTo(38.471092, 39.5369, 41.212086, 40.88601, 41.189, 42.343);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(28.05900001525879, 18.868000030517578), new Point2D.Double(33.4370002746582, 23.743000030517578), new float[] {0.0f,0.24242f,0.62121f,1.0f}, new Color[] {new Color(110, 61, 9, 255),new Color(234, 129, 19, 255),new Color(92, 51, 7, 255),new Color(224, 124, 18, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.9070000648498535f, -1.802899956703186f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.652, 22.587);
((GeneralPath)shape).lineTo(23.718, 26.387);
((GeneralPath)shape).curveTo(30.905, 19.324999, 41.501, 2.4099998, 41.501, 2.4099998);
((GeneralPath)shape).curveTo(41.93, 1.1856998, 40.413, 0.41419983, 39.654, 1.2396998);
((GeneralPath)shape).curveTo(39.654, 1.2396998, 25.964, 15.3367, 19.651999, 22.5867);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(103, 57, 7, 255);
stroke = new BasicStroke(1.0f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.652, 22.587);
((GeneralPath)shape).lineTo(23.718, 26.387);
((GeneralPath)shape).curveTo(30.905, 19.324999, 41.501, 2.4099998, 41.501, 2.4099998);
((GeneralPath)shape).curveTo(41.93, 1.1856998, 40.413, 0.41419983, 39.654, 1.2396998);
((GeneralPath)shape).curveTo(39.654, 1.2396998, 25.964, 15.3367, 19.651999, 22.5867);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(19.395000457763672, 30.000999450683594), new Point2D.Double(23.108999252319336, 33.43899917602539), new float[] {0.0f,0.33333f,0.66667f,1.0f}, new Color[] {new Color(189, 189, 189, 255),new Color(226, 226, 226, 255),new Color(163, 163, 163, 255),new Color(221, 221, 221, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.9070000648498535f, -1.802899956703186f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.05, 32.814);
((GeneralPath)shape).lineTo(14.297, 34.748);
((GeneralPath)shape).lineTo(22.789, 27.381);
((GeneralPath)shape).lineTo(23.064, 26.675001);
((GeneralPath)shape).lineTo(24.158998, 26.657001);
((GeneralPath)shape).curveTo(23.720999, 25.095001, 21.217, 22.274002, 19.342, 22.274002);
((GeneralPath)shape).lineTo(19.424, 23.364002);
((GeneralPath)shape).lineTo(18.754, 23.744001);
((GeneralPath)shape).lineTo(12.049999, 32.814003);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.05, 32.814);
((GeneralPath)shape).lineTo(14.297, 34.748);
((GeneralPath)shape).lineTo(22.789, 27.381);
((GeneralPath)shape).lineTo(23.064, 26.675001);
((GeneralPath)shape).lineTo(24.158998, 26.657001);
((GeneralPath)shape).curveTo(23.720999, 25.095001, 21.217, 22.274002, 19.342, 22.274002);
((GeneralPath)shape).lineTo(19.424, 23.364002);
((GeneralPath)shape).lineTo(18.754, 23.744001);
((GeneralPath)shape).lineTo(12.049999, 32.814003);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.3f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.3384000062942505f, 0.0f, 0.0f, 1.0f, -20.926000595092773f, -3.4089999198913574f));
// _0_0_3
paint = new RadialGradientPaint(new Point2D.Double(26.781999588012695, 42.34299850463867), 14.407f, new Point2D.Double(26.781999588012695, 42.34299850463867), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.28220999240875244f, 1.679200042767814E-15f, 30.393999099731445f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(41.189, 42.343);
((GeneralPath)shape).curveTo(41.212086, 43.799988, 38.471092, 45.149097, 34.003914, 45.87948);
((GeneralPath)shape).curveTo(29.536732, 46.60986, 24.026266, 46.60986, 19.559084, 45.87948);
((GeneralPath)shape).curveTo(15.091904, 45.149097, 12.35091, 43.799988, 12.373999, 42.343);
((GeneralPath)shape).curveTo(12.35091, 40.88601, 15.091904, 39.5369, 19.559084, 38.80652);
((GeneralPath)shape).curveTo(24.026266, 38.076138, 29.536732, 38.076138, 34.003914, 38.80652);
((GeneralPath)shape).curveTo(38.471092, 39.5369, 41.212086, 40.88601, 41.189, 42.343);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new RadialGradientPaint(new Point2D.Double(15.414999961853027, 35.356998443603516), 7.5792f, new Point2D.Double(15.414999961853027, 35.356998443603516), new float[] {0.0f,1.0f}, new Color[] {new Color(105, 105, 105, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9946600198745728f, 3.262900085348021E-16f, 6.564499920209965E-13f, 0.9693199992179871f, -4.583000183105469f, 0.16592000424861908f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(1.7577, 40.724);
((GeneralPath)shape).curveTo(8.363, 40.724, 13.3757, 41.510998, 14.3247, 36.704998);
((GeneralPath)shape).curveTo(15.089701, 32.831997, 9.7643, 30.975998, 7.1255, 34.434);
((GeneralPath)shape).curveTo(4.5835, 37.764, 1.7574, 40.724, 1.7574, 40.724);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.52778f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(0.8522999882698059f, 0.0f, 0.0f, 0.8522999882698059f, 3.733599901199341f, 2.5755999088287354f));
// _0_0_5
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.875, 37.75);
((GeneralPath)shape).curveTo(8.877003, 38.197914, 8.639194, 38.612663, 8.251619, 38.8372);
((GeneralPath)shape).curveTo(7.864045, 39.061737, 7.385955, 39.061737, 6.9983807, 38.8372);
((GeneralPath)shape).curveTo(6.6108065, 38.612663, 6.372997, 38.197914, 6.375, 37.75);
((GeneralPath)shape).curveTo(6.372997, 37.302086, 6.6108065, 36.887337, 6.9983807, 36.6628);
((GeneralPath)shape).curveTo(7.385955, 36.438263, 7.864045, 36.438263, 8.251619, 36.6628);
((GeneralPath)shape).curveTo(8.639194, 36.887337, 8.877003, 37.302086, 8.875, 37.75);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(0.7878699898719788f, 0.0f, 0.0f, 0.7878699898719788f, 14.265000343322754f, -4.723400115966797f));
// _0_0_6
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.875, 37.75);
((GeneralPath)shape).curveTo(8.877003, 38.197914, 8.639194, 38.612663, 8.251619, 38.8372);
((GeneralPath)shape).curveTo(7.864045, 39.061737, 7.385955, 39.061737, 6.9983807, 38.8372);
((GeneralPath)shape).curveTo(6.6108065, 38.612663, 6.372997, 38.197914, 6.375, 37.75);
((GeneralPath)shape).curveTo(6.372997, 37.302086, 6.6108065, 36.887337, 6.9983807, 36.6628);
((GeneralPath)shape).curveTo(7.385955, 36.438263, 7.864045, 36.438263, 8.251619, 36.6628);
((GeneralPath)shape).curveTo(8.639194, 36.887337, 8.877003, 37.302086, 8.875, 37.75);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.941, 26.398);
((GeneralPath)shape).lineTo(13.6380005, 32.541);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 0.42778f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new LinearGradientPaint(new Point2D.Double(13.236000061035156, 37.75199890136719), new Point2D.Double(7.752099990844727, 42.28200149536133), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8522999882698059f, 0.0f, 0.0f, 0.8522999882698059f, -1.6750999689102173f, 3.753999948501587f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(3.0709, 40.069);
((GeneralPath)shape).curveTo(3.0709, 40.069, 6.4119997, 38.427002, 7.8357, 35.982002);
((GeneralPath)shape).curveTo(8.3394, 35.117, 9.4801, 35.855003, 8.7774, 36.717003);
((GeneralPath)shape).curveTo(7.2596, 38.577003, 3.0709, 40.069004, 3.0709, 40.069004);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 0.53333f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(0.237869992852211f, 0.0f, 0.0f, 0.237869992852211f, 38.433998107910156f, -7.10099983215332f));
// _0_0_9
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.875, 37.75);
((GeneralPath)shape).curveTo(8.877003, 38.197914, 8.639194, 38.612663, 8.251619, 38.8372);
((GeneralPath)shape).curveTo(7.864045, 39.061737, 7.385955, 39.061737, 6.9983807, 38.8372);
((GeneralPath)shape).curveTo(6.6108065, 38.612663, 6.372997, 38.197914, 6.375, 37.75);
((GeneralPath)shape).curveTo(6.372997, 37.302086, 6.6108065, 36.887337, 6.9983807, 36.6628);
((GeneralPath)shape).curveTo(7.385955, 36.438263, 7.864045, 36.438263, 8.251619, 36.6628);
((GeneralPath)shape).curveTo(8.639194, 36.887337, 8.877003, 37.302086, 8.875, 37.75);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_0
paint = new LinearGradientPaint(new Point2D.Double(52.71799850463867, 2.316200017929077), new Point2D.Double(67.46600341796875, 2.316200017929077), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 255),new Color(60, 116, 177, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8624799847602844f, 0.0f, 0.0f, 0.5807200074195862f, -16.256999969482422f, 11.012999534606934f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.127, 7.3501);
((GeneralPath)shape).curveTo(32.069, 7.4374, 29.642998, 8.4062, 29.642998, 9.5744);
((GeneralPath)shape).lineTo(29.642998, 13.145);
((GeneralPath)shape).curveTo(29.642998, 14.370001, 32.312996, 15.369, 35.584, 15.369);
((GeneralPath)shape).curveTo(38.854, 15.369, 41.5, 14.370001, 41.5, 13.145);
((GeneralPath)shape).lineTo(41.5, 9.5744);
((GeneralPath)shape).curveTo(41.5, 8.3487, 38.854, 7.3501, 35.584, 7.3501);
((GeneralPath)shape).curveTo(35.431, 7.3501, 35.277, 7.3458, 35.127, 7.3501);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(32, 74, 135, 255);
stroke = new BasicStroke(1.0f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.127, 7.3501);
((GeneralPath)shape).curveTo(32.069, 7.4374, 29.642998, 8.4062, 29.642998, 9.5744);
((GeneralPath)shape).lineTo(29.642998, 13.145);
((GeneralPath)shape).curveTo(29.642998, 14.370001, 32.312996, 15.369, 35.584, 15.369);
((GeneralPath)shape).curveTo(38.854, 15.369, 41.5, 14.370001, 41.5, 13.145);
((GeneralPath)shape).lineTo(41.5, 9.5744);
((GeneralPath)shape).curveTo(41.5, 8.3487, 38.854, 7.3501, 35.584, 7.3501);
((GeneralPath)shape).curveTo(35.431, 7.3501, 35.277, 7.3458, 35.127, 7.3501);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_1 = g.getTransform();
g.transform(new AffineTransform(0.8862800002098083f, 0.0f, 0.0f, 0.46891000866889954f, -10.444000244140625f, -9.718899726867676f));
// _0_0_10_1
paint = new Color(52, 101, 164, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(57.375, 49.75);
((GeneralPath)shape).curveTo(57.383614, 50.287495, 56.36103, 50.785194, 54.69446, 51.05464);
((GeneralPath)shape).curveTo(53.027893, 51.324085, 50.972107, 51.324085, 49.30554, 51.05464);
((GeneralPath)shape).curveTo(47.63897, 50.785194, 46.616386, 50.287495, 46.625, 49.75);
((GeneralPath)shape).curveTo(46.616386, 49.212505, 47.63897, 48.714806, 49.30554, 48.44536);
((GeneralPath)shape).curveTo(50.972107, 48.175915, 53.027893, 48.175915, 54.69446, 48.44536);
((GeneralPath)shape).curveTo(56.36103, 48.714806, 57.383614, 49.212505, 57.375, 49.75);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_2
paint = new LinearGradientPaint(new Point2D.Double(53.16899871826172, 24.2450008392334), new Point2D.Double(69.69100189208984, 24.2450008392334), new float[] {0.0f,1.0f}, new Color[] {new Color(242, 242, 242, 255),new Color(195, 195, 195, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7194399833679199f, 0.0f, 0.0f, 0.7189099788665771f, -7.696300029754639f, 9.471699714660645f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(27.926, 39.155);
((GeneralPath)shape).lineTo(28.973001, 17.805998);
((GeneralPath)shape).lineTo(31.460001, 14.142998);
((GeneralPath)shape).curveTo(33.431, 13.506998, 38.187, 13.506998, 39.967003, 14.142998);
((GeneralPath)shape).lineTo(42.454002, 17.173998);
((GeneralPath)shape).lineTo(45.071003, 39.660995);
((GeneralPath)shape).lineTo(27.926003, 39.154995);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(90, 90, 90, 255);
stroke = new BasicStroke(1.0f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(27.926, 39.155);
((GeneralPath)shape).lineTo(28.973001, 17.805998);
((GeneralPath)shape).lineTo(31.460001, 14.142998);
((GeneralPath)shape).curveTo(33.431, 13.506998, 38.187, 13.506998, 39.967003, 14.142998);
((GeneralPath)shape).lineTo(42.454002, 17.173998);
((GeneralPath)shape).lineTo(45.071003, 39.660995);
((GeneralPath)shape).lineTo(27.926003, 39.154995);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_3
paint = new LinearGradientPaint(new Point2D.Double(61.87200164794922, 29.614999771118164), new Point2D.Double(61.87200164794922, 41.45899963378906), new float[] {0.0f,1.0f}, new Color[] {new Color(174, 174, 174, 255),new Color(196, 196, 196, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8886200189590454f, 0.0f, 0.0f, 0.7189099788665771f, -18.29800033569336f, 9.471699714660645f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.828, 38.896);
((GeneralPath)shape).curveTo(28.828, 38.896, 31.418999, 29.365, 36.369, 29.365);
((GeneralPath)shape).curveTo(41.475, 29.365, 44.537, 39.277, 44.537, 39.277);
((GeneralPath)shape).lineTo(28.828, 38.896);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_4
paint = new LinearGradientPaint(new Point2D.Double(49.85300064086914, 64.26000213623047), new Point2D.Double(62.768001556396484, 64.26000213623047), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 255),new Color(43, 85, 130, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7189099788665771f, 0.0f, 0.0f, 0.7189099788665771f, -1.8970999717712402f, -22.424999237060547f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.18, 20.499);
((GeneralPath)shape).lineTo(28.884, 26.973);
((GeneralPath)shape).curveTo(30.547, 25.895, 40.877, 25.709, 43.228, 27.361);
((GeneralPath)shape).lineTo(42.526, 20.764);
((GeneralPath)shape).curveTo(41.128002, 19.811, 31.943, 19.286, 29.18, 20.499);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_4);
g.setComposite(AlphaComposite.getInstance(3, 0.59444f * origAlpha));
AffineTransform defaultTransform__0_0_10_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_5
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.049, 38.222);
((GeneralPath)shape).lineTo(29.926, 18.028);
((GeneralPath)shape).lineTo(31.766, 14.995);
((GeneralPath)shape).curveTo(33.585, 14.403, 37.971, 14.403, 39.614002, 14.995);
((GeneralPath)shape).lineTo(41.575, 17.528);
((GeneralPath)shape).lineTo(44.027, 38.776);
((GeneralPath)shape).lineTo(29.049, 38.222);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_6
paint = new LinearGradientPaint(new Point2D.Double(60.16899871826172, 40.119998931884766), new Point2D.Double(60.441001892089844, 43.869998931884766), new float[] {0.0f,1.0f}, new Color[] {new Color(242, 242, 242, 255),new Color(195, 195, 195, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.737309992313385f, 0.0f, 0.0f, 0.7708500027656555f, -8.531999588012695f, 7.121600151062012f));
shape = new RoundRectangle2D.Double(26.51300048828125, 37.5359992980957, 19.974000930786133, 3.927799940109253, 1.7677600383758545, 1.7677600383758545);
g.setPaint(paint);
g.fill(shape);
paint = new Color(90, 90, 90, 255);
stroke = new BasicStroke(1.0f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(26.51300048828125, 37.5359992980957, 19.974000930786133, 3.927799940109253, 1.7677600383758545, 1.7677600383758545);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_7
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.395, 17.996);
((GeneralPath)shape).curveTo(31.27, 16.630001, 38.493, 16.341, 42.115, 17.39);
((GeneralPath)shape).lineTo(39.778, 14.504);
((GeneralPath)shape).curveTo(37.3, 13.837, 33.853, 14.127999, 31.501999, 14.573);
((GeneralPath)shape).lineTo(29.394999, 17.996);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_7);
g.setComposite(AlphaComposite.getInstance(3, 0.86111f * origAlpha));
AffineTransform defaultTransform__0_0_10_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_8
paint = new LinearGradientPaint(new Point2D.Double(48.25, 54.75), new Point2D.Double(48.25, 71.25), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7189099788665771f, 0.0f, 0.0f, 0.7189099788665771f, -1.8970999717712402f, -20.68600082397461f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.173, 17.416);
((GeneralPath)shape).lineTo(31.173, 32.873);
((GeneralPath)shape).lineTo(34.408, 29.278002);
((GeneralPath)shape).lineTo(34.049, 16.697002);
((GeneralPath)shape).lineTo(31.173, 17.416002);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_8);
g.setComposite(AlphaComposite.getInstance(3, 0.57778f * origAlpha));
AffineTransform defaultTransform__0_0_10_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_9
g.setComposite(AlphaComposite.getInstance(3, 0.41111f * origAlpha));
AffineTransform defaultTransform__0_0_10_9_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_9_0
paint = new Color(230, 231, 230, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.009, 9.381);
((GeneralPath)shape).lineTo(31.009, 12.620999);
((GeneralPath)shape).curveTo(31.009, 12.620999, 31.621, 12.273, 32.0, 12.259999);
((GeneralPath)shape).lineTo(32.0, 8.999999);
((GeneralPath)shape).curveTo(31.518, 9.069499, 31.009, 9.380999, 31.009, 9.380999);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_9_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_9_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_9_1
paint = new Color(230, 231, 230, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.009, 8.76);
((GeneralPath)shape).lineTo(33.009, 12.0);
((GeneralPath)shape).curveTo(33.009, 12.0, 33.621, 11.917, 34.0, 11.904);
((GeneralPath)shape).lineTo(34.0, 8.588901);
((GeneralPath)shape).curveTo(33.488, 8.6147, 33.009, 8.76, 33.009, 8.76);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_9_1);
g.setComposite(AlphaComposite.getInstance(3, 0.44444f * origAlpha));
AffineTransform defaultTransform__0_0_10_9_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_9_2
paint = new Color(230, 231, 230, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.009, 8.5611);
((GeneralPath)shape).lineTo(35.009, 11.856);
((GeneralPath)shape).curveTo(35.009, 11.856, 35.565, 11.851, 36.0, 11.871);
((GeneralPath)shape).lineTo(36.0, 8.5337);
((GeneralPath)shape).curveTo(35.499, 8.4821, 35.009, 8.5611, 35.009, 8.5611);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_9_2);
g.setTransform(defaultTransform__0_0_10_9);
g.setTransform(defaultTransform__0_0_10);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.2635764479637146;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 48.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 44.963096618652344;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. It is recommended to use the 
	 * {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	public Applications_graphics() {
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
		g2d.translate(x, y);

        double coef1 = (double) this.width / (double) getOrigWidth();
        double coef2 = (double) this.height / (double) getOrigHeight();
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
     * Returns an instance of this icon with specified dimensions.
     */
    public static Applications_graphics of(int width, int height) {
       Applications_graphics result = new Applications_graphics();
       result.width = width;
       result.height = height;
       return result;
    }
}

