package org.pushingpixels.demo.substance.main.check.svg.tango;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.Icon;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.icon.IsHiDpiAware;
import org.pushingpixels.substance.api.icon.IsResizable;
import org.pushingpixels.substance.api.icon.SubstanceIcon;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/ibis">Ibis SVG transcoder</a>.
 */
public class computer implements Icon, IsResizable, IsHiDpiAware, UIResource {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.3689320087432861f, -1.978553056716919f, -13.617130279541016f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(12.57571029663086, 67.501708984375), 8.766279f, new Point2D.Double(12.57571029663086, 67.501708984375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9258079528808594f, 0.0f, 0.0f, 0.5192620158195496f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(41.10058, 35.051105);
((GeneralPath)shape).curveTo(41.127632, 36.682228, 37.915836, 38.192577, 32.681362, 39.010254);
((GeneralPath)shape).curveTo(27.446886, 39.827927, 20.989925, 39.827927, 15.755449, 39.010254);
((GeneralPath)shape).curveTo(10.520973, 38.192577, 7.3091793, 36.682228, 7.336233, 35.051105);
((GeneralPath)shape).curveTo(7.3091793, 33.419983, 10.520973, 31.909634, 15.755449, 31.091959);
((GeneralPath)shape).curveTo(20.989925, 30.274284, 27.446886, 30.274284, 32.681362, 31.091959);
((GeneralPath)shape).curveTo(37.915836, 31.909634, 41.127632, 33.419983, 41.10058, 35.051105);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 57.533390045166016f, 3.2034270763397217f));
// _0_0_1
paint = new Color(173, 176, 170, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-26.263968, 29.716238);
((GeneralPath)shape).curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274);
((GeneralPath)shape).curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274);
((GeneralPath)shape).curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238);
((GeneralPath)shape).curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736);
((GeneralPath)shape).curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736);
((GeneralPath)shape).curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(75, 77, 74, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-26.263968, 29.716238);
((GeneralPath)shape).curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274);
((GeneralPath)shape).curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274);
((GeneralPath)shape).curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238);
((GeneralPath)shape).curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736);
((GeneralPath)shape).curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736);
((GeneralPath)shape).curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(0.9402729868888855f, 0.0f, 0.0f, 0.9402729868888855f, 55.40361022949219f, 4.271193981170654f));
// _0_0_2
paint = new Color(123, 127, 122, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-26.263968, 29.716238);
((GeneralPath)shape).curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274);
((GeneralPath)shape).curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274);
((GeneralPath)shape).curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238);
((GeneralPath)shape).curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736);
((GeneralPath)shape).curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736);
((GeneralPath)shape).curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(0.9402729868888855f, 0.0f, 0.0f, 0.9402729868888855f, 55.40361022949219f, 3.5211939811706543f));
// _0_0_3
paint = new LinearGradientPaint(new Point2D.Double(-23.885700225830078, 49.9530029296875), new Point2D.Double(-23.885700225830078, 44.878883361816406), new float[] {0.0f,1.0f}, new Color[] {new Color(216, 223, 214, 255),new Color(216, 223, 214, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.4928749799728394f, 0.0f, 0.0f, 0.6698480248451233f, 0.0f, 0.0f));
stroke = new BasicStroke(0.6806534f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-26.263968, 29.716238);
((GeneralPath)shape).curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274);
((GeneralPath)shape).curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274);
((GeneralPath)shape).curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238);
((GeneralPath)shape).curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736);
((GeneralPath)shape).curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736);
((GeneralPath)shape).curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new Color(208, 208, 208, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.6875, 28.766243);
((GeneralPath)shape).lineTo(25.625, 29.766243);
((GeneralPath)shape).curveTo(25.625, 29.766243, 29.949108, 33.36541, 34.625, 33.96875);
((GeneralPath)shape).curveTo(36.962948, 34.27042, 39.378674, 34.67116, 41.375, 35.15625);
((GeneralPath)shape).curveTo(43.371326, 35.64134, 44.963356, 36.275856, 45.5, 36.8125);
((GeneralPath)shape).curveTo(45.81041, 37.12291, 45.95106, 37.38614, 46.0, 37.59375);
((GeneralPath)shape).curveTo(46.04894, 37.80136, 46.038216, 37.948566, 45.90625, 38.15625);
((GeneralPath)shape).curveTo(45.64232, 38.57162, 44.826393, 39.1239, 43.4375, 39.5625);
((GeneralPath)shape).curveTo(40.659714, 40.439693, 35.717075, 41.0, 28.875, 41.0);
((GeneralPath)shape).lineTo(28.875, 42.0);
((GeneralPath)shape).curveTo(35.770996, 42.0, 40.738667, 41.47233, 43.71875, 40.53125);
((GeneralPath)shape).curveTo(45.208794, 40.06071, 46.24369, 39.515564, 46.75, 38.71875);
((GeneralPath)shape).curveTo(47.003155, 38.320343, 47.107323, 37.8303, 47.0, 37.375);
((GeneralPath)shape).curveTo(46.892677, 36.9197, 46.615444, 36.490444, 46.21875, 36.09375);
((GeneralPath)shape).curveTo(45.34118, 35.21618, 43.68191, 34.68731, 41.625, 34.1875);
((GeneralPath)shape).curveTo(39.56809, 33.68769, 37.109264, 33.27317, 34.75, 32.96875);
((GeneralPath)shape).curveTo(30.031473, 32.35991, 25.6875, 28.766243, 25.6875, 28.766243);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(151, 151, 151, 255);
stroke = new BasicStroke(0.4f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.6875, 28.766243);
((GeneralPath)shape).lineTo(25.625, 29.766243);
((GeneralPath)shape).curveTo(25.625, 29.766243, 29.949108, 33.36541, 34.625, 33.96875);
((GeneralPath)shape).curveTo(36.962948, 34.27042, 39.378674, 34.67116, 41.375, 35.15625);
((GeneralPath)shape).curveTo(43.371326, 35.64134, 44.963356, 36.275856, 45.5, 36.8125);
((GeneralPath)shape).curveTo(45.81041, 37.12291, 45.95106, 37.38614, 46.0, 37.59375);
((GeneralPath)shape).curveTo(46.04894, 37.80136, 46.038216, 37.948566, 45.90625, 38.15625);
((GeneralPath)shape).curveTo(45.64232, 38.57162, 44.826393, 39.1239, 43.4375, 39.5625);
((GeneralPath)shape).curveTo(40.659714, 40.439693, 35.717075, 41.0, 28.875, 41.0);
((GeneralPath)shape).lineTo(28.875, 42.0);
((GeneralPath)shape).curveTo(35.770996, 42.0, 40.738667, 41.47233, 43.71875, 40.53125);
((GeneralPath)shape).curveTo(45.208794, 40.06071, 46.24369, 39.515564, 46.75, 38.71875);
((GeneralPath)shape).curveTo(47.003155, 38.320343, 47.107323, 37.8303, 47.0, 37.375);
((GeneralPath)shape).curveTo(46.892677, 36.9197, 46.615444, 36.490444, 46.21875, 36.09375);
((GeneralPath)shape).curveTo(45.34118, 35.21618, 43.68191, 34.68731, 41.625, 34.1875);
((GeneralPath)shape).curveTo(39.56809, 33.68769, 37.109264, 33.27317, 34.75, 32.96875);
((GeneralPath)shape).curveTo(30.031473, 32.35991, 25.6875, 28.766243, 25.6875, 28.766243);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.3689320087432861f, -1.978553056716919f, -19.021259307861328f));
// _0_0_5
paint = new RadialGradientPaint(new Point2D.Double(12.57571029663086, 67.501708984375), 8.766279f, new Point2D.Double(12.57571029663086, 67.501708984375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9258079528808594f, 0.0f, 0.0f, 0.5192620158195496f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(41.10058, 35.051105);
((GeneralPath)shape).curveTo(41.127632, 36.682228, 37.915836, 38.192577, 32.681362, 39.010254);
((GeneralPath)shape).curveTo(27.446886, 39.827927, 20.989925, 39.827927, 15.755449, 39.010254);
((GeneralPath)shape).curveTo(10.520973, 38.192577, 7.3091793, 36.682228, 7.336233, 35.051105);
((GeneralPath)shape).curveTo(7.3091793, 33.419983, 10.520973, 31.909634, 15.755449, 31.091959);
((GeneralPath)shape).curveTo(20.989925, 30.274284, 27.446886, 30.274284, 32.681362, 31.091959);
((GeneralPath)shape).curveTo(37.915836, 31.909634, 41.127632, 33.419983, 41.10058, 35.051105);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = new LinearGradientPaint(new Point2D.Double(12.206708908081055, 53.53514099121094), new Point2D.Double(12.127711296081543, 64.89252471923828), new float[] {0.0f,1.0f}, new Color[] {new Color(88, 89, 86, 255),new Color(187, 190, 184, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.816344976425171f, 0.0f, 0.0f, 0.5505560040473938f, 0.0f, 0.0f));
shape = new Rectangle2D.Double(17.472396850585938, 30.703611373901367, 9.0396728515625, 2.7400388717651367);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new LinearGradientPaint(new Point2D.Double(8.611623764038086, 7.229358196258545), new Point2D.Double(34.78447341918945, 33.339786529541016), new float[] {0.0f,1.0f}, new Color[] {new Color(221, 225, 217, 255),new Color(202, 205, 198, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1298630237579346f, 0.0f, 0.0f, 0.8850629925727844f, -1.625f, -1.304371953010559f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.0809026, 1.6956221);
((GeneralPath)shape).lineTo(36.669098, 1.6956221);
((GeneralPath)shape).curveTo(37.58044, 1.6956221, 38.293243, 2.279104, 38.33585, 3.0972092);
((GeneralPath)shape).lineTo(39.667892, 28.675323);
((GeneralPath)shape).curveTo(39.7261, 29.793058, 38.766838, 30.695627, 37.647587, 30.695627);
((GeneralPath)shape).lineTo(6.102412, 30.695627);
((GeneralPath)shape).curveTo(4.983163, 30.695627, 4.023898, 29.793058, 4.0821066, 28.675323);
((GeneralPath)shape).lineTo(5.4141507, 3.0972092);
((GeneralPath)shape).curveTo(5.4544344, 2.3236744, 5.961653, 1.6956221, 7.0809026, 1.6956221);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(10.390737533569336, 5.381774425506592), new Point2D.Double(32.53682327270508, 31.24605369567871), new float[] {0.0f,1.0f}, new Color[] {new Color(143, 143, 143, 255),new Color(73, 73, 73, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1043970584869385f, 0.0f, 0.0f, 0.9054710268974304f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.0809026, 1.6956221);
((GeneralPath)shape).lineTo(36.669098, 1.6956221);
((GeneralPath)shape).curveTo(37.58044, 1.6956221, 38.293243, 2.279104, 38.33585, 3.0972092);
((GeneralPath)shape).lineTo(39.667892, 28.675323);
((GeneralPath)shape).curveTo(39.7261, 29.793058, 38.766838, 30.695627, 37.647587, 30.695627);
((GeneralPath)shape).lineTo(6.102412, 30.695627);
((GeneralPath)shape).curveTo(4.983163, 30.695627, 4.023898, 29.793058, 4.0821066, 28.675323);
((GeneralPath)shape).lineTo(5.4141507, 3.0972092);
((GeneralPath)shape).curveTo(5.4544344, 2.3236744, 5.961653, 1.6956221, 7.0809026, 1.6956221);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new LinearGradientPaint(new Point2D.Double(19.1503963470459, 32.62223815917969), new Point2D.Double(16.315818786621094, 8.866622924804688), new float[] {0.0f,1.0f}, new Color[] {new Color(91, 91, 151, 255),new Color(27, 27, 67, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1741390228271484f, 0.0f, 0.0f, 0.9454309940338135f, 0.7218250036239624f, -1.3315240144729614f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.410535, 4.305827);
((GeneralPath)shape).lineTo(7.1683397, 26.351145);
((GeneralPath)shape).lineTo(34.81873, 26.351145);
((GeneralPath)shape).lineTo(33.48371, 4.3992558);
((GeneralPath)shape).lineTo(8.410535, 4.305827);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 121, 255);
stroke = new BasicStroke(0.5f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.410535, 4.305827);
((GeneralPath)shape).lineTo(7.1683397, 26.351145);
((GeneralPath)shape).lineTo(34.81873, 26.351145);
((GeneralPath)shape).lineTo(33.48371, 4.3992558);
((GeneralPath)shape).lineTo(8.410535, 4.305827);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
paint = new LinearGradientPaint(new Point2D.Double(3.7069976329803467, 171.2913360595703), new Point2D.Double(3.7069973945617676, 162.4506072998047), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 63),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(5.7051591873168945f, 0.0f, 0.0f, 0.17528000473976135f, 1.0f, -0.679373025894165f));
stroke = new BasicStroke(0.9961812f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.177433, 28.735788);
((GeneralPath)shape).lineTo(37.60591, 28.735788);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new LinearGradientPaint(new Point2D.Double(17.698339462280273, 13.004725456237793), new Point2D.Double(34.97454833984375, 55.20075607299805), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 179),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1080689430236816f, 0.0f, 0.0f, 0.9024710059165955f, 1.0f, 1.0f));
stroke = new BasicStroke(0.99999964f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.9145985, 2.7063396);
((GeneralPath)shape).lineTo(36.7601, 2.6685383);
((GeneralPath)shape).curveTo(37.043797, 2.668179, 37.319405, 2.9057882, 37.342205, 3.321082);
((GeneralPath)shape).lineTo(38.704098, 28.12433);
((GeneralPath)shape).curveTo(38.76214, 29.18136, 38.16435, 29.9102, 37.10573, 29.9102);
((GeneralPath)shape).lineTo(6.5817585, 29.9102);
((GeneralPath)shape).curveTo(5.5231357, 29.9102, 4.988744, 29.18141, 5.045887, 28.12433);
((GeneralPath)shape).lineTo(6.3699775, 3.6301632);
((GeneralPath)shape).curveTo(6.4086733, 2.9143326, 6.5363626, 2.7068188, 6.9145985, 2.7063396);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 0.5314286f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
paint = new LinearGradientPaint(new Point2D.Double(11.492236137390137, 1.6537576913833618), new Point2D.Double(17.199417114257812, 26.729263305664062), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(252, 252, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2389769554138184f, 0.0f, 0.0f, 0.8959550261497498f, 0.5905529856681824f, -1.3315240144729614f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.711536, 4.7463627);
((GeneralPath)shape).lineTo(7.909007, 22.616693);
((GeneralPath)shape).curveTo(18.953646, 20.216063, 19.33047, 12.124494, 33.063038, 9.469943);
((GeneralPath)shape).lineTo(32.901566, 4.8124266);
((GeneralPath)shape).lineTo(8.711536, 4.7463627);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(1.2643979787826538f, 0.0f, 0.0f, 1.2912620306015015f, -6.216331958770752f, -4.000422954559326f));
// _0_0_12
paint = new RadialGradientPaint(new Point2D.Double(12.57571029663086, 67.501708984375), 8.766279f, new Point2D.Double(12.57571029663086, 67.501708984375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9258079528808594f, 0.0f, 0.0f, 0.5192620158195496f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(41.10058, 35.051105);
((GeneralPath)shape).curveTo(41.127632, 36.682228, 37.915836, 38.192577, 32.681362, 39.010254);
((GeneralPath)shape).curveTo(27.446886, 39.827927, 20.989925, 39.827927, 15.755449, 39.010254);
((GeneralPath)shape).curveTo(10.520973, 38.192577, 7.3091793, 36.682228, 7.336233, 35.051105);
((GeneralPath)shape).curveTo(7.3091793, 33.419983, 10.520973, 31.909634, 15.755449, 31.091959);
((GeneralPath)shape).curveTo(20.989925, 30.274284, 27.446886, 30.274284, 32.681362, 31.091959);
((GeneralPath)shape).curveTo(37.915836, 31.909634, 41.127632, 33.419983, 41.10058, 35.051105);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
paint = new LinearGradientPaint(new Point2D.Double(18.316999435424805, 48.64323425292969), new Point2D.Double(18.1767520904541, 52.536460876464844), new float[] {0.0f,1.0f}, new Color[] {new Color(221, 225, 217, 255),new Color(202, 205, 198, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1298630237579346f, 0.0f, 0.0f, 0.8850629925727844f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.462184, 36.81745);
((GeneralPath)shape).lineTo(37.46459, 36.81745);
((GeneralPath)shape).curveTo(38.58384, 36.81745, 38.441944, 37.08889, 38.556816, 37.430298);
((GeneralPath)shape).lineTo(41.391464, 45.855106);
((GeneralPath)shape).curveTo(41.506336, 46.196518, 41.418484, 46.467953, 40.299236, 46.467953);
((GeneralPath)shape).lineTo(3.6275382, 46.467953);
((GeneralPath)shape).curveTo(2.508289, 46.467953, 2.4204388, 46.196518, 2.5353107, 45.855106);
((GeneralPath)shape).lineTo(5.3699565, 37.430298);
((GeneralPath)shape).curveTo(5.4848285, 37.08889, 5.3429346, 36.81745, 6.462184, 36.81745);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(10.390737533569336, 5.381774425506592), new Point2D.Double(32.53682327270508, 31.24605369567871), new float[] {0.0f,1.0f}, new Color[] {new Color(143, 143, 143, 255),new Color(73, 73, 73, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1043970584869385f, 0.0f, 0.0f, 0.9054710268974304f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.462184, 36.81745);
((GeneralPath)shape).lineTo(37.46459, 36.81745);
((GeneralPath)shape).curveTo(38.58384, 36.81745, 38.441944, 37.08889, 38.556816, 37.430298);
((GeneralPath)shape).lineTo(41.391464, 45.855106);
((GeneralPath)shape).curveTo(41.506336, 46.196518, 41.418484, 46.467953, 40.299236, 46.467953);
((GeneralPath)shape).lineTo(3.6275382, 46.467953);
((GeneralPath)shape).curveTo(2.508289, 46.467953, 2.4204388, 46.196518, 2.5353107, 45.855106);
((GeneralPath)shape).lineTo(5.3699565, 37.430298);
((GeneralPath)shape).curveTo(5.4848285, 37.08889, 5.3429346, 36.81745, 6.462184, 36.81745);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
paint = new Color(122, 125, 119, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.3916893, 38.829113);
((GeneralPath)shape).lineTo(4.6239223, 43.95564);
((GeneralPath)shape).lineTo(10.104, 43.95564);
((GeneralPath)shape).lineTo(10.63433, 41.922707);
((GeneralPath)shape).lineTo(25.483572, 41.922707);
((GeneralPath)shape).lineTo(26.03325, 43.99782);
((GeneralPath)shape).lineTo(32.201084, 43.99782);
((GeneralPath)shape).lineTo(30.521708, 38.829113);
((GeneralPath)shape).lineTo(6.3916893, 38.829113);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
paint = new Color(119, 120, 116, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.076272, 42.27626);
((GeneralPath)shape).lineTo(10.63433, 43.95564);
((GeneralPath)shape).lineTo(25.395184, 43.95564);
((GeneralPath)shape).lineTo(24.953241, 42.187874);
((GeneralPath)shape).lineTo(11.076272, 42.27626);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16
paint = new Color(119, 122, 117, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(37.592777, 38.829113);
((GeneralPath)shape).lineTo(39.272156, 43.86725);
((GeneralPath)shape).lineTo(33.792076, 43.778862);
((GeneralPath)shape).lineTo(32.289474, 38.917503);
((GeneralPath)shape).lineTo(37.592777, 38.829113);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_16);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_17 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17
paint = new LinearGradientPaint(new Point2D.Double(8.113424301147461, 88.50907135009766), new Point2D.Double(8.113423347473145, 100.20014953613281), new float[] {0.0f,1.0f}, new Color[] {new Color(157, 157, 157, 255),new Color(185, 185, 185, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.3098509311676025f, 0.0f, 0.0f, 0.4329279959201813f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(37.592777, 38.298786);
((GeneralPath)shape).lineTo(39.272156, 43.33692);
((GeneralPath)shape).lineTo(33.792076, 43.24853);
((GeneralPath)shape).lineTo(32.289474, 38.387173);
((GeneralPath)shape).lineTo(37.592777, 38.298786);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_17);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_18 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_18
paint = new LinearGradientPaint(new Point2D.Double(8.113424301147461, 88.50907135009766), new Point2D.Double(8.113423347473145, 100.20014953613281), new float[] {0.0f,1.0f}, new Color[] {new Color(157, 157, 157, 255),new Color(185, 185, 185, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.3098509311676025f, 0.0f, 0.0f, 0.4329279959201813f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.3916893, 38.210396);
((GeneralPath)shape).lineTo(4.6239223, 43.33692);
((GeneralPath)shape).lineTo(10.104, 43.33692);
((GeneralPath)shape).lineTo(10.63433, 41.30399);
((GeneralPath)shape).lineTo(25.483572, 41.30399);
((GeneralPath)shape).lineTo(26.03325, 43.379105);
((GeneralPath)shape).lineTo(32.201084, 43.379105);
((GeneralPath)shape).lineTo(30.521708, 38.210396);
((GeneralPath)shape).lineTo(6.3916893, 38.210396);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_18);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_19 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_19
paint = new LinearGradientPaint(new Point2D.Double(8.113424301147461, 88.50907135009766), new Point2D.Double(8.113423347473145, 100.20014953613281), new float[] {0.0f,1.0f}, new Color[] {new Color(157, 157, 157, 255),new Color(185, 185, 185, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.3098509311676025f, 0.0f, 0.0f, 0.4329279959201813f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.076272, 41.745934);
((GeneralPath)shape).lineTo(10.63433, 43.425312);
((GeneralPath)shape).lineTo(25.395184, 43.425312);
((GeneralPath)shape).lineTo(24.953241, 41.657543);
((GeneralPath)shape).lineTo(11.076272, 41.745934);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_19);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_20 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_20
paint = new LinearGradientPaint(new Point2D.Double(13.62870979309082, 101.28459930419922), new Point2D.Double(8.6485013961792, 74.09800720214844), new float[] {0.0f,1.0f}, new Color[] {new Color(249, 255, 245, 255),new Color(249, 255, 245, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.143634080886841f, 0.0f, 0.0f, 0.4664979875087738f, 1.0f, -0.5088260173797607f));
stroke = new BasicStroke(0.5f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.127819, 37.578117);
((GeneralPath)shape).lineTo(37.953632, 37.578117);
((GeneralPath)shape).lineTo(40.590813, 45.670677);
((GeneralPath)shape).lineTo(3.329743, 45.670677);
((GeneralPath)shape).lineTo(6.127819, 37.578117);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_20);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_21 = g.getTransform();
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -10.419329643249512f, 2.8538661003112793f));
// _0_0_21
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.620502, 3.9384086);
((GeneralPath)shape).curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735);
((GeneralPath)shape).curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735);
((GeneralPath)shape).curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086);
((GeneralPath)shape).curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822);
((GeneralPath)shape).curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822);
((GeneralPath)shape).curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_21);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_22 = g.getTransform();
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -10.305729866027832f, 4.959650993347168f));
// _0_0_22
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.620502, 3.9384086);
((GeneralPath)shape).curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735);
((GeneralPath)shape).curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735);
((GeneralPath)shape).curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086);
((GeneralPath)shape).curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822);
((GeneralPath)shape).curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822);
((GeneralPath)shape).curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_22);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_23 = g.getTransform();
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -10.192130088806152f, 6.959650993347168f));
// _0_0_23
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.620502, 3.9384086);
((GeneralPath)shape).curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735);
((GeneralPath)shape).curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735);
((GeneralPath)shape).curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086);
((GeneralPath)shape).curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822);
((GeneralPath)shape).curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822);
((GeneralPath)shape).curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_23);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_24 = g.getTransform();
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -10.078530311584473f, 8.959650993347168f));
// _0_0_24
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.620502, 3.9384086);
((GeneralPath)shape).curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735);
((GeneralPath)shape).curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735);
((GeneralPath)shape).curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086);
((GeneralPath)shape).curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822);
((GeneralPath)shape).curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822);
((GeneralPath)shape).curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_24);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_25 = g.getTransform();
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -9.964929580688477f, 10.959650039672852f));
// _0_0_25
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.620502, 3.9384086);
((GeneralPath)shape).curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735);
((GeneralPath)shape).curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735);
((GeneralPath)shape).curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086);
((GeneralPath)shape).curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822);
((GeneralPath)shape).curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822);
((GeneralPath)shape).curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_25);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_26 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_26
paint = new Color(74, 74, 74, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.0, 27.317665);
((GeneralPath)shape).lineTo(20.281715, 27.317665);
((GeneralPath)shape).curveTo(20.36548, 27.317667, 20.4297, 27.33633, 20.474377, 27.373655);
((GeneralPath)shape).curveTo(20.519344, 27.41069, 20.541828, 27.463594, 20.54183, 27.53237);
((GeneralPath)shape).curveTo(20.541828, 27.60144, 20.519344, 27.654638, 20.474377, 27.691965);
((GeneralPath)shape).curveTo(20.4297, 27.728998, 20.36548, 27.747515, 20.281715, 27.747515);
((GeneralPath)shape).lineTo(20.169735, 27.747515);
((GeneralPath)shape).lineTo(20.169735, 27.975885);
((GeneralPath)shape).lineTo(20.0, 27.975885);
((GeneralPath)shape).lineTo(20.0, 27.317665);
((GeneralPath)shape).moveTo(20.169735, 27.440668);
((GeneralPath)shape).lineTo(20.169735, 27.624512);
((GeneralPath)shape).lineTo(20.26364, 27.624512);
((GeneralPath)shape).curveTo(20.296558, 27.624512, 20.321981, 27.616575, 20.33991, 27.600704);
((GeneralPath)shape).curveTo(20.35784, 27.58454, 20.366804, 27.561762, 20.366804, 27.53237);
((GeneralPath)shape).curveTo(20.366804, 27.50298, 20.35784, 27.480349, 20.33991, 27.464476);
((GeneralPath)shape).curveTo(20.321981, 27.448605, 20.296558, 27.440668, 20.26364, 27.440668);
((GeneralPath)shape).lineTo(20.169735, 27.440668);
((GeneralPath)shape).moveTo(20.961979, 27.428764);
((GeneralPath)shape).curveTo(20.91025, 27.428766, 20.87013, 27.44787, 20.841621, 27.486078);
((GeneralPath)shape).curveTo(20.813112, 27.524288, 20.798857, 27.578074, 20.798857, 27.647436);
((GeneralPath)shape).curveTo(20.798857, 27.716507, 20.813112, 27.770145, 20.841621, 27.808355);
((GeneralPath)shape).curveTo(20.87013, 27.846563, 20.91025, 27.865667, 20.961979, 27.865667);
((GeneralPath)shape).curveTo(21.014002, 27.865667, 21.054268, 27.846563, 21.082779, 27.808355);
((GeneralPath)shape).curveTo(21.111286, 27.770145, 21.125542, 27.716507, 21.125542, 27.647436);
((GeneralPath)shape).curveTo(21.125542, 27.578074, 21.111286, 27.524288, 21.082779, 27.486078);
((GeneralPath)shape).curveTo(21.054268, 27.44787, 21.014002, 27.428766, 20.961979, 27.428764);
((GeneralPath)shape).moveTo(20.961979, 27.305761);
((GeneralPath)shape).curveTo(21.067787, 27.305763, 21.150671, 27.336037, 21.21063, 27.396582);
((GeneralPath)shape).curveTo(21.270588, 27.457129, 21.300568, 27.540747, 21.300568, 27.647436);
((GeneralPath)shape).curveTo(21.300568, 27.753834, 21.270588, 27.837305, 21.21063, 27.897852);
((GeneralPath)shape).curveTo(21.150671, 27.958399, 21.067787, 27.98867, 20.961979, 27.98867);
((GeneralPath)shape).curveTo(20.856464, 27.98867, 20.77358, 27.958399, 20.713327, 27.897852);
((GeneralPath)shape).curveTo(20.65337, 27.837305, 20.62339, 27.753834, 20.62339, 27.647436);
((GeneralPath)shape).curveTo(20.62339, 27.540747, 20.65337, 27.457129, 20.713327, 27.396582);
((GeneralPath)shape).curveTo(20.77358, 27.336037, 20.856464, 27.305763, 20.961979, 27.305761);
((GeneralPath)shape).moveTo(21.42842, 27.317665);
((GeneralPath)shape).lineTo(21.617994, 27.317665);
((GeneralPath)shape).lineTo(21.857388, 27.769117);
((GeneralPath)shape).lineTo(21.857388, 27.317665);
((GeneralPath)shape).lineTo(22.018305, 27.317665);
((GeneralPath)shape).lineTo(22.018305, 27.975885);
((GeneralPath)shape).lineTo(21.82873, 27.975885);
((GeneralPath)shape).lineTo(21.589338, 27.524433);
((GeneralPath)shape).lineTo(21.589338, 27.975885);
((GeneralPath)shape).lineTo(21.42842, 27.975885);
((GeneralPath)shape).lineTo(21.42842, 27.317665);
((GeneralPath)shape).moveTo(22.09149, 27.317665);
((GeneralPath)shape).lineTo(22.277096, 27.317665);
((GeneralPath)shape).lineTo(22.42699, 27.55221);
((GeneralPath)shape).lineTo(22.576887, 27.317665);
((GeneralPath)shape).lineTo(22.762936, 27.317665);
((GeneralPath)shape).lineTo(22.51208, 27.698578);
((GeneralPath)shape).lineTo(22.51208, 27.975885);
((GeneralPath)shape).lineTo(22.342344, 27.975885);
((GeneralPath)shape).lineTo(22.342344, 27.698578);
((GeneralPath)shape).lineTo(22.09149, 27.317665);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_26);
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
        return 1.9848570823669434;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 1.1956220865249634;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 45.32952880859375;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 46.232242584228516;
	}

    /** The current width of this resizable icon. */
    private int width;

    /** The current height of this resizable icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public computer() {
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
    public static SubstanceIcon of(int width, int height) {
       computer base = new computer();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       computer base = new computer();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

