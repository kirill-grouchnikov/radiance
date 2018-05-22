package org.pushingpixels.substance.swingx.svg;

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
public class dialog_information implements Icon, IsResizable, IsHiDpiAware, UIResource {
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
g.setComposite(AlphaComposite.getInstance(3, 0.8f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.1971830129623413f, 0.0f, 0.0f, 1.0985909700393677f, -6.201581954956055f, -3.2095069885253906f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(14.772334098815918, 74.2099380493164), 7.828983f, new Point2D.Double(14.772334098815918, 74.2099380493164), new float[] {0.0f,0.55172414f,1.0f}, new Color[] {new Color(0, 0, 0, 131),new Color(0, 0, 0, 37),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.7642780542373657f, 0.0f, 0.0f, 0.5668039917945862f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.875, 42.0625);
((GeneralPath)shape).curveTo(39.897133, 43.652596, 37.26934, 45.124954, 32.986645, 45.92206);
((GeneralPath)shape).curveTo(28.703949, 46.719166, 23.421051, 46.719166, 19.138357, 45.92206);
((GeneralPath)shape).curveTo(14.855661, 45.124954, 12.227865, 43.652596, 12.25, 42.0625);
((GeneralPath)shape).curveTo(12.227865, 40.472404, 14.855661, 39.000046, 19.138357, 38.20294);
((GeneralPath)shape).curveTo(23.421051, 37.405834, 28.703949, 37.405834, 32.986645, 38.20294);
((GeneralPath)shape).curveTo(37.26934, 39.000046, 39.897133, 40.472404, 39.875, 42.0625);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
// _0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0758229494094849f, 0.0f, 0.0f, 0.9374930262565613f, -2.551335096359253f, 3.047213077545166f));
// _0_0_1_0
paint = new LinearGradientPaint(new Point2D.Double(23.124000549316406, 43.165000915527344), new Point2D.Double(26.478500366210938, 43.165000915527344), new float[] {0.005618f,0.03012137f,0.08366583f,0.1422f,0.2074f,0.2846f,0.4045f,0.4962f,0.6057f,0.7245f,0.8497f,0.9789f,1.0f}, new Color[] {new Color(104, 104, 104, 255),new Color(119, 119, 119, 255),new Color(146, 146, 146, 255),new Color(167, 167, 167, 255),new Color(182, 182, 182, 255),new Color(190, 190, 190, 255),new Color(193, 193, 193, 255),new Color(188, 188, 188, 255),new Color(173, 173, 173, 255),new Color(149, 149, 149, 255),new Color(116, 116, 116, 255),new Color(73, 73, 73, 255),new Color(65, 65, 65, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.6391270160675049f, 0.0f, 0.0f, 1.6391270160675049f, -15.97035026550293f, -29.793550491333008f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(21.893503, 38.885944);
((GeneralPath)shape).lineTo(21.893503, 40.36116);
((GeneralPath)shape).curveTo(21.893503, 41.836376, 23.204807, 43.14768, 24.680021, 43.14768);
((GeneralPath)shape).curveTo(26.155237, 43.14768, 27.46654, 41.836376, 27.46654, 40.36116);
((GeneralPath)shape).lineTo(27.46654, 38.885944);
((GeneralPath)shape).lineTo(21.893503, 38.885944);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(86, 86, 86, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(21.893503, 38.885944);
((GeneralPath)shape).lineTo(21.893503, 40.36116);
((GeneralPath)shape).curveTo(21.893503, 41.836376, 23.204807, 43.14768, 24.680021, 43.14768);
((GeneralPath)shape).curveTo(26.155237, 43.14768, 27.46654, 41.836376, 27.46654, 40.36116);
((GeneralPath)shape).lineTo(27.46654, 38.885944);
((GeneralPath)shape).lineTo(21.893503, 38.885944);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1 = g.getTransform();
g.transform(new AffineTransform(0.9890729784965515f, 0.0f, 0.0f, 0.993556022644043f, -0.40873900055885315f, 0.007920479401946068f));
// _0_0_1_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_0
paint = new Color(174, 174, 87, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.511724, 27.668867);
((GeneralPath)shape).curveTo(21.208843, 27.660896, 17.463276, 28.632053, 19.492912, 30.467932);
((GeneralPath)shape).curveTo(18.98969, 30.670935, 18.27037, 31.124313, 18.355167, 32.185223);
((GeneralPath)shape).curveTo(18.401983, 32.739285, 18.989243, 33.079395, 19.79236, 33.32911);
((GeneralPath)shape).curveTo(18.881908, 33.967724, 18.302582, 34.642555, 18.355167, 35.26492);
((GeneralPath)shape).curveTo(18.401438, 35.812527, 18.976334, 36.18753, 19.76303, 36.43814);
((GeneralPath)shape).curveTo(18.875519, 37.069405, 18.3033, 37.76012, 18.355167, 38.37395);
((GeneralPath)shape).curveTo(18.434437, 39.312088, 20.457743, 40.362926, 24.838928, 40.2419);
((GeneralPath)shape).curveTo(27.993328, 40.155914, 30.776913, 39.590515, 30.9966, 38.37395);
((GeneralPath)shape).curveTo(31.082863, 37.896248, 30.691908, 37.45053, 30.087355, 37.05408);
((GeneralPath)shape).curveTo(30.539927, 36.59792, 30.85698, 36.135242, 30.820616, 35.70488);
((GeneralPath)shape).curveTo(30.774128, 35.154694, 30.205994, 34.78192, 29.412754, 34.53166);
((GeneralPath)shape).curveTo(30.300264, 33.9004, 30.872482, 33.20968, 30.820616, 32.595848);
((GeneralPath)shape).curveTo(30.774128, 32.045666, 30.205994, 31.702225, 29.412754, 31.45196);
((GeneralPath)shape).curveTo(30.310848, 30.817287, 30.872816, 30.133928, 30.820616, 29.51615);
((GeneralPath)shape).curveTo(30.762592, 28.829447, 27.61599, 27.676357, 24.511724, 27.668867);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(24.613027572631836, 31.146202087402344), new Point2D.Double(24.613027572631836, 26.7396240234375), new float[] {0.0f,1.0f}, new Color[] {new Color(76, 76, 40, 255),new Color(76, 76, 40, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0026559829711914f, 0.0f, 0.0f, 0.9973520040512085f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0175292f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.511724, 27.668867);
((GeneralPath)shape).curveTo(21.208843, 27.660896, 17.463276, 28.632053, 19.492912, 30.467932);
((GeneralPath)shape).curveTo(18.98969, 30.670935, 18.27037, 31.124313, 18.355167, 32.185223);
((GeneralPath)shape).curveTo(18.401983, 32.739285, 18.989243, 33.079395, 19.79236, 33.32911);
((GeneralPath)shape).curveTo(18.881908, 33.967724, 18.302582, 34.642555, 18.355167, 35.26492);
((GeneralPath)shape).curveTo(18.401438, 35.812527, 18.976334, 36.18753, 19.76303, 36.43814);
((GeneralPath)shape).curveTo(18.875519, 37.069405, 18.3033, 37.76012, 18.355167, 38.37395);
((GeneralPath)shape).curveTo(18.434437, 39.312088, 20.457743, 40.362926, 24.838928, 40.2419);
((GeneralPath)shape).curveTo(27.993328, 40.155914, 30.776913, 39.590515, 30.9966, 38.37395);
((GeneralPath)shape).curveTo(31.082863, 37.896248, 30.691908, 37.45053, 30.087355, 37.05408);
((GeneralPath)shape).curveTo(30.539927, 36.59792, 30.85698, 36.135242, 30.820616, 35.70488);
((GeneralPath)shape).curveTo(30.774128, 35.154694, 30.205994, 34.78192, 29.412754, 34.53166);
((GeneralPath)shape).curveTo(30.300264, 33.9004, 30.872482, 33.20968, 30.820616, 32.595848);
((GeneralPath)shape).curveTo(30.774128, 32.045666, 30.205994, 31.702225, 29.412754, 31.45196);
((GeneralPath)shape).curveTo(30.310848, 30.817287, 30.872816, 30.133928, 30.820616, 29.51615);
((GeneralPath)shape).curveTo(30.762592, 28.829447, 27.61599, 27.676357, 24.511724, 27.668867);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_1
paint = new LinearGradientPaint(new Point2D.Double(-22.874170303344727, 38.67599105834961), new Point2D.Double(-4.390831470489502, 38.67599105834961), new float[] {0.005618f,0.02078677f,0.06600059f,0.1148f,0.1677f,0.2265f,0.2963f,0.4045f,0.5239f,0.6666f,0.8211f,0.9832f,1.0f}, new Color[] {new Color(163, 163, 73, 255),new Color(172, 172, 84, 255),new Color(193, 193, 114, 255),new Color(212, 214, 142, 255),new Color(226, 228, 166, 255),new Color(237, 240, 184, 255),new Color(243, 246, 195, 255),new Color(245, 248, 199, 255),new Color(238, 240, 190, 255),new Color(219, 221, 169, 255),new Color(190, 189, 136, 255),new Color(152, 149, 100, 255),new Color(148, 145, 96, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.5666210055351257f, 0.029889769852161407f, -0.11855699867010117f, 0.6565409898757935f, 36.18544006347656f, 20.083110809326172f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.920208, 38.329765);
((GeneralPath)shape).curveTo(30.700521, 39.54633, 27.591421, 40.23286, 22.615131, 39.983673);
((GeneralPath)shape).curveTo(19.463507, 39.825855, 19.283163, 38.944054, 19.502848, 37.72749);
((GeneralPath)shape).curveTo(19.722534, 36.510925, 22.458319, 35.65848, 25.609509, 35.824707);
((GeneralPath)shape).curveTo(28.7607, 35.990936, 31.139893, 37.1132, 30.920208, 38.329765);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(-10.480864524841309, 39.03395080566406), new Point2D.Double(-23.851388931274414, 39.142845153808594), new float[] {0.0f,0.2647059f,0.63235295f,1.0f}, new Color[] {new Color(146, 148, 112, 255),new Color(252, 255, 193, 255),new Color(243, 245, 186, 255),new Color(146, 148, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.5666210055351257f, 0.029889769852161407f, -0.11855699867010117f, 0.6565409898757935f, 36.18544006347656f, 20.083110809326172f));
stroke = new BasicStroke(0.08906282f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.920208, 38.329765);
((GeneralPath)shape).curveTo(30.700521, 39.54633, 27.591421, 40.23286, 22.615131, 39.983673);
((GeneralPath)shape).curveTo(19.463507, 39.825855, 19.283163, 38.944054, 19.502848, 37.72749);
((GeneralPath)shape).curveTo(19.722534, 36.510925, 22.458319, 35.65848, 25.609509, 35.824707);
((GeneralPath)shape).curveTo(28.7607, 35.990936, 31.139893, 37.1132, 30.920208, 38.329765);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_2 = g.getTransform();
g.transform(new AffineTransform(0.6027399897575378f, -0.12862500548362732f, 0.06428372114896774f, 0.7607880234718323f, 31.120210647583008f, 14.491410255432129f));
// _0_0_1_1_2
paint = new LinearGradientPaint(new Point2D.Double(-22.874170303344727, 38.67599105834961), new Point2D.Double(-4.390831470489502, 38.67599105834961), new float[] {0.005618f,0.02078677f,0.06600059f,0.1148f,0.1677f,0.2265f,0.2963f,0.4045f,0.5239f,0.6666f,0.8211f,0.9832f,1.0f}, new Color[] {new Color(163, 163, 73, 255),new Color(172, 172, 84, 255),new Color(193, 193, 114, 255),new Color(212, 214, 142, 255),new Color(226, 228, 166, 255),new Color(237, 240, 184, 255),new Color(243, 246, 195, 255),new Color(245, 248, 199, 255),new Color(238, 240, 190, 255),new Color(219, 221, 169, 255),new Color(190, 189, 136, 255),new Color(152, 149, 100, 255),new Color(148, 145, 96, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0264500379562378f, 0.0f, 0.0f, 0.974232017993927f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-3.535534, 27.228739);
((GeneralPath)shape).curveTo(-3.5189617, 28.400614, -5.486396, 29.48572, -8.692855, 30.073174);
((GeneralPath)shape).curveTo(-11.899315, 30.66063, -15.854626, 30.66063, -19.061085, 30.073174);
((GeneralPath)shape).curveTo(-22.267544, 29.48572, -24.23498, 28.400614, -24.218407, 27.228739);
((GeneralPath)shape).curveTo(-24.23498, 26.056864, -22.267544, 24.971758, -19.061085, 24.384304);
((GeneralPath)shape).curveTo(-15.854626, 23.796848, -11.899315, 23.796848, -8.692855, 24.384304);
((GeneralPath)shape).curveTo(-5.486396, 24.971758, -3.5189617, 26.056864, -3.535534, 27.228739);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(-10.480864524841309, 39.03395080566406), new Point2D.Double(-23.851388931274414, 39.142845153808594), new float[] {0.0f,0.2647059f,0.63235295f,1.0f}, new Color[] {new Color(146, 148, 112, 255),new Color(252, 255, 193, 255),new Color(243, 245, 186, 255),new Color(146, 148, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0264500379562378f, 0.0f, 0.0f, 0.974232017993927f, 0.0f, 0.0f));
stroke = new BasicStroke(0.13035245f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-3.535534, 27.228739);
((GeneralPath)shape).curveTo(-3.5189617, 28.400614, -5.486396, 29.48572, -8.692855, 30.073174);
((GeneralPath)shape).curveTo(-11.899315, 30.66063, -15.854626, 30.66063, -19.061085, 30.073174);
((GeneralPath)shape).curveTo(-22.267544, 29.48572, -24.23498, 28.400614, -24.218407, 27.228739);
((GeneralPath)shape).curveTo(-24.23498, 26.056864, -22.267544, 24.971758, -19.061085, 24.384304);
((GeneralPath)shape).curveTo(-15.854626, 23.796848, -11.899315, 23.796848, -8.692855, 24.384304);
((GeneralPath)shape).curveTo(-5.486396, 24.971758, -3.5189617, 26.056864, -3.535534, 27.228739);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_1_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_3 = g.getTransform();
g.transform(new AffineTransform(0.6027399897575378f, -0.12862500548362732f, 0.06428372114896774f, 0.7607880234718323f, 31.120210647583008f, 11.395910263061523f));
// _0_0_1_1_3
paint = new LinearGradientPaint(new Point2D.Double(-22.874170303344727, 38.67599105834961), new Point2D.Double(-4.390831470489502, 38.67599105834961), new float[] {0.005618f,0.02078677f,0.06600059f,0.1148f,0.1677f,0.2265f,0.2963f,0.4045f,0.5239f,0.6666f,0.8211f,0.9832f,1.0f}, new Color[] {new Color(163, 163, 73, 255),new Color(172, 172, 84, 255),new Color(193, 193, 114, 255),new Color(212, 214, 142, 255),new Color(226, 228, 166, 255),new Color(237, 240, 184, 255),new Color(243, 246, 195, 255),new Color(245, 248, 199, 255),new Color(238, 240, 190, 255),new Color(219, 221, 169, 255),new Color(190, 189, 136, 255),new Color(152, 149, 100, 255),new Color(148, 145, 96, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0264500379562378f, 0.0f, 0.0f, 0.974232017993927f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-3.535534, 27.228739);
((GeneralPath)shape).curveTo(-3.5189617, 28.400614, -5.486396, 29.48572, -8.692855, 30.073174);
((GeneralPath)shape).curveTo(-11.899315, 30.66063, -15.854626, 30.66063, -19.061085, 30.073174);
((GeneralPath)shape).curveTo(-22.267544, 29.48572, -24.23498, 28.400614, -24.218407, 27.228739);
((GeneralPath)shape).curveTo(-24.23498, 26.056864, -22.267544, 24.971758, -19.061085, 24.384304);
((GeneralPath)shape).curveTo(-15.854626, 23.796848, -11.899315, 23.796848, -8.692855, 24.384304);
((GeneralPath)shape).curveTo(-5.486396, 24.971758, -3.5189617, 26.056864, -3.535534, 27.228739);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(-10.480864524841309, 39.03395080566406), new Point2D.Double(-23.851388931274414, 39.142845153808594), new float[] {0.0f,0.2647059f,0.63235295f,1.0f}, new Color[] {new Color(146, 148, 112, 255),new Color(252, 255, 193, 255),new Color(243, 245, 186, 255),new Color(146, 148, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0264500379562378f, 0.0f, 0.0f, 0.974232017993927f, 0.0f, 0.0f));
stroke = new BasicStroke(0.13035245f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-3.535534, 27.228739);
((GeneralPath)shape).curveTo(-3.5189617, 28.400614, -5.486396, 29.48572, -8.692855, 30.073174);
((GeneralPath)shape).curveTo(-11.899315, 30.66063, -15.854626, 30.66063, -19.061085, 30.073174);
((GeneralPath)shape).curveTo(-22.267544, 29.48572, -24.23498, 28.400614, -24.218407, 27.228739);
((GeneralPath)shape).curveTo(-24.23498, 26.056864, -22.267544, 24.971758, -19.061085, 24.384304);
((GeneralPath)shape).curveTo(-15.854626, 23.796848, -11.899315, 23.796848, -8.692855, 24.384304);
((GeneralPath)shape).curveTo(-5.486396, 24.971758, -3.5189617, 26.056864, -3.535534, 27.228739);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_1_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_4
paint = new LinearGradientPaint(new Point2D.Double(-22.874170303344727, 38.67599105834961), new Point2D.Double(-4.390831470489502, 38.67599105834961), new float[] {0.005618f,0.02078677f,0.06600059f,0.1148f,0.1677f,0.2265f,0.2963f,0.4045f,0.5239f,0.6666f,0.8211f,0.9832f,1.0f}, new Color[] {new Color(163, 163, 73, 255),new Color(172, 172, 84, 255),new Color(193, 193, 114, 255),new Color(212, 214, 142, 255),new Color(226, 228, 166, 255),new Color(237, 240, 184, 255),new Color(243, 246, 195, 255),new Color(245, 248, 199, 255),new Color(238, 240, 190, 255),new Color(219, 221, 169, 255),new Color(190, 189, 136, 255),new Color(152, 149, 100, 255),new Color(148, 145, 96, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.6186820268630981f, -0.13202700018882751f, 0.06262726336717606f, 0.7411839962005615f, 31.120210647583008f, 8.300410270690918f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.698088, 29.636387);
((GeneralPath)shape).curveTo(30.698088, 31.014688, 28.157326, 32.55444, 24.7166, 33.288692);
((GeneralPath)shape).curveTo(21.275875, 34.022945, 18.38922, 33.50421, 18.273172, 32.130802);
((GeneralPath)shape).curveTo(18.157124, 30.757395, 20.50968, 29.155466, 23.952389, 28.968826);
((GeneralPath)shape).curveTo(27.422379, 28.78071, 30.698088, 28.9249, 30.698088, 29.636387);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(-10.480864524841309, 39.03395080566406), new Point2D.Double(-23.851388931274414, 39.142845153808594), new float[] {0.0f,0.2647059f,0.63235295f,1.0f}, new Color[] {new Color(146, 148, 112, 255),new Color(252, 255, 193, 255),new Color(243, 245, 186, 255),new Color(146, 148, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.6186820268630981f, -0.13202700018882751f, 0.06262726336717606f, 0.7411839962005615f, 31.120210647583008f, 8.300410270690918f));
stroke = new BasicStroke(0.08906286f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.698088, 29.636387);
((GeneralPath)shape).curveTo(30.698088, 31.014688, 28.157326, 32.55444, 24.7166, 33.288692);
((GeneralPath)shape).curveTo(21.275875, 34.022945, 18.38922, 33.50421, 18.273172, 32.130802);
((GeneralPath)shape).curveTo(18.157124, 30.757395, 20.50968, 29.155466, 23.952389, 28.968826);
((GeneralPath)shape).curveTo(27.422379, 28.78071, 30.698088, 28.9249, 30.698088, 29.636387);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_1_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_5 = g.getTransform();
g.transform(new AffineTransform(0.3354640007019043f, 0.0f, 0.0f, 0.3354640007019043f, 11.746780395507812f, 27.22610092163086f));
// _0_0_1_1_5
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.0, 22.375);
((GeneralPath)shape).curveTo(31.005209, 23.539576, 30.386904, 24.617924, 29.37921, 25.20172);
((GeneralPath)shape).curveTo(28.371517, 25.785517, 27.128483, 25.785517, 26.12079, 25.20172);
((GeneralPath)shape).curveTo(25.113096, 24.617924, 24.494791, 23.539576, 24.5, 22.375);
((GeneralPath)shape).curveTo(24.494791, 21.210424, 25.113096, 20.132076, 26.12079, 19.54828);
((GeneralPath)shape).curveTo(27.128483, 18.964483, 28.371517, 18.964483, 29.37921, 19.54828);
((GeneralPath)shape).curveTo(30.386904, 20.132076, 31.005209, 21.210424, 31.0, 22.375);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_6
paint = new Color(0, 0, 0, 60);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.342182, 33.378864);
((GeneralPath)shape).curveTo(22.736591, 33.883533, 26.320992, 33.34619, 29.214315, 31.470806);
((GeneralPath)shape).curveTo(30.025581, 30.944962, 30.147604, 30.343945, 30.520922, 29.873844);
((GeneralPath)shape).curveTo(29.09679, 31.000706, 25.494982, 34.035625, 19.342182, 33.378864);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_7 = g.getTransform();
g.transform(new AffineTransform(0.3354640007019043f, 0.0f, 0.0f, 0.3354640007019043f, 11.746780395507812f, 30.233760833740234f));
// _0_0_1_1_7
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.0, 22.375);
((GeneralPath)shape).curveTo(31.005209, 23.539576, 30.386904, 24.617924, 29.37921, 25.20172);
((GeneralPath)shape).curveTo(28.371517, 25.785517, 27.128483, 25.785517, 26.12079, 25.20172);
((GeneralPath)shape).curveTo(25.113096, 24.617924, 24.494791, 23.539576, 24.5, 22.375);
((GeneralPath)shape).curveTo(24.494791, 21.210424, 25.113096, 20.132076, 26.12079, 19.54828);
((GeneralPath)shape).curveTo(27.128483, 18.964483, 28.371517, 18.964483, 29.37921, 19.54828);
((GeneralPath)shape).curveTo(30.386904, 20.132076, 31.005209, 21.210424, 31.0, 22.375);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_8
paint = new Color(0, 0, 0, 60);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.466621, 39.517838);
((GeneralPath)shape).curveTo(22.86103, 40.022507, 26.44543, 39.485165, 29.338753, 37.60978);
((GeneralPath)shape).curveTo(30.15002, 37.083935, 30.272043, 36.482918, 30.645359, 36.012817);
((GeneralPath)shape).curveTo(29.221228, 37.13968, 25.61942, 40.1746, 19.466621, 39.517838);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_9
paint = new Color(0, 0, 0, 60);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.487362, 36.40687);
((GeneralPath)shape).curveTo(22.88177, 36.91154, 26.46617, 36.3742, 29.359491, 34.498814);
((GeneralPath)shape).curveTo(30.17076, 33.97297, 30.292782, 33.371952, 30.6661, 32.90185);
((GeneralPath)shape).curveTo(29.241968, 34.028713, 25.64016, 37.063633, 19.487362, 36.40687);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1_9);
g.setTransform(defaultTransform__0_0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.9887970089912415f, 0.0f));
// _0_0_1_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_2_0_0 = g.getTransform();
g.transform(new AffineTransform(0.9544389843940735f, 0.0f, 0.0f, 0.9898689985275269f, 1.4332220554351807f, 0.6398810148239136f));
// _0_0_1_2_0_0
paint = new LinearGradientPaint(new Point2D.Double(17.879995346069336, 55.36279296875), new Point2D.Double(11.906206130981445, 54.8630256652832), new float[] {0.0f,1.0f}, new Color[] {new Color(214, 215, 165, 255),new Color(142, 143, 109, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.6034400463104248f, 0.0f, 0.0f, 0.5493959784507751f, 0.6141669750213623f, 0.024498000741004944f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.87103, 29.628128);
((GeneralPath)shape).curveTo(18.87103, 28.836695, 20.445135, 27.889988, 24.419233, 27.942972);
((GeneralPath)shape).curveTo(28.101154, 27.99206, 30.526608, 28.83866, 30.526608, 30.105404);
((GeneralPath)shape).curveTo(30.526608, 31.345282, 27.307241, 32.174416, 23.874678, 32.008186);
((GeneralPath)shape).curveTo(20.442114, 31.84196, 18.87103, 30.868006, 18.87103, 29.628128);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(-29.00719451904297, -29.799352645874023), new Point2D.Double(-37.641231536865234, -29.59831428527832), new float[] {0.0f,0.2647059f,0.63235295f,1.0f}, new Color[] {new Color(146, 148, 112, 255),new Color(96, 97, 74, 255),new Color(243, 245, 186, 255),new Color(146, 148, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.9057279825210571f, -0.04386156052350998f, 0.18951000273227692f, -0.963437020778656f, 0.6141669750213623f, 0.024498000741004944f));
stroke = new BasicStroke(0.09083303f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.87103, 29.628128);
((GeneralPath)shape).curveTo(18.87103, 28.836695, 20.445135, 27.889988, 24.419233, 27.942972);
((GeneralPath)shape).curveTo(28.101154, 27.99206, 30.526608, 28.83866, 30.526608, 30.105404);
((GeneralPath)shape).curveTo(30.526608, 31.345282, 27.307241, 32.174416, 23.874678, 32.008186);
((GeneralPath)shape).curveTo(20.442114, 31.84196, 18.87103, 30.868006, 18.87103, 29.628128);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_2_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_2_0_1 = g.getTransform();
g.transform(new AffineTransform(0.9544389843940735f, 0.0f, 0.0f, 0.9898689985275269f, 1.4332220554351807f, 0.6398810148239136f));
// _0_0_1_2_0_1
paint = new RadialGradientPaint(new Point2D.Double(68.13758850097656, 29.86931800842285), 33.93409f, new Point2D.Double(68.13758850097656, 29.86931800842285), new float[] {0.0f,0.882f,1.0f}, new Color[] {new Color(255, 255, 255, 45),new Color(112, 154, 200, 255),new Color(111, 150, 221, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.551289975643158f, 1.2655920282087467E-16f, -1.3557200395657485E-16f, 0.7660340070724487f, -10.48701000213623f, 3.5143120288848877f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.680021, 0.8622936);
((GeneralPath)shape).curveTo(16.858006, 0.8622936, 10.506261, 6.837263, 10.506261, 14.195288);
((GeneralPath)shape).curveTo(10.506261, 21.73785, 16.247826, 22.573217, 16.247826, 25.352995);
((GeneralPath)shape).curveTo(16.247826, 28.61906, 19.614103, 32.322685, 25.14931, 32.188995);
((GeneralPath)shape).curveTo(31.035158, 32.046837, 33.464184, 28.825655, 33.464184, 25.352995);
((GeneralPath)shape).curveTo(33.464184, 22.384064, 38.853783, 22.30489, 38.853783, 14.195288);
((GeneralPath)shape).curveTo(38.853783, 6.837263, 32.502037, 0.8622936, 24.680021, 0.8622936);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(97, 100, 113, 255);
stroke = new BasicStroke(1.0159545f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.680021, 0.8622936);
((GeneralPath)shape).curveTo(16.858006, 0.8622936, 10.506261, 6.837263, 10.506261, 14.195288);
((GeneralPath)shape).curveTo(10.506261, 21.73785, 16.247826, 22.573217, 16.247826, 25.352995);
((GeneralPath)shape).curveTo(16.247826, 28.61906, 19.614103, 32.322685, 25.14931, 32.188995);
((GeneralPath)shape).curveTo(31.035158, 32.046837, 33.464184, 28.825655, 33.464184, 25.352995);
((GeneralPath)shape).curveTo(33.464184, 22.384064, 38.853783, 22.30489, 38.853783, 14.195288);
((GeneralPath)shape).curveTo(38.853783, 6.837263, 32.502037, 0.8622936, 24.680021, 0.8622936);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_2_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_2_0_2 = g.getTransform();
g.transform(new AffineTransform(0.9544389843940735f, 0.0f, 0.0f, 0.9898689985275269f, 1.4332220554351807f, 0.6398810148239136f));
// _0_0_1_2_0_2
paint = new LinearGradientPaint(new Point2D.Double(37.940433502197266, 16.65186309814453), new Point2D.Double(-5.251716136932373, 3.8557322025299072), new float[] {0.0f,1.0f}, new Color[] {new Color(241, 243, 255, 255),new Color(241, 243, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8941289782524109f, 0.0f, 0.0f, 0.985230028629303f, 1.5159809589385986f, 0.024498000741004944f));
stroke = new BasicStroke(0.946857f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.680021, 1.9277146);
((GeneralPath)shape).curveTo(17.39, 1.9277146, 11.470252, 7.4963126, 11.470252, 14.353901);
((GeneralPath)shape).curveTo(11.470252, 21.383476, 16.82132, 22.162027, 16.82132, 24.752747);
((GeneralPath)shape).curveTo(16.82132, 27.79668, 19.958649, 31.248413, 25.117392, 31.123814);
((GeneralPath)shape).curveTo(30.60293, 30.991322, 32.866753, 27.989222, 32.866753, 24.752747);
((GeneralPath)shape).curveTo(32.866753, 21.98574, 37.88979, 21.911947, 37.88979, 14.353901);
((GeneralPath)shape).curveTo(37.88979, 7.4963126, 31.970043, 1.9277146, 24.680021, 1.9277146);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_2_0_2);
g.setTransform(defaultTransform__0_0_1_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_2_1 = g.getTransform();
g.transform(new AffineTransform(0.9375f, 0.0f, 0.0f, 0.926937997341156f, 0.569221019744873f, 0.25176000595092773f));
// _0_0_1_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_2_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2_1_0
paint = new LinearGradientPaint(new Point2D.Double(30.62037467956543, 10.313651084899902), new Point2D.Double(32.166080474853516, 18.162935256958008), new float[] {0.0f,0.4117647f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 113),new Color(0, 0, 0, 123)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.6292999982833862f, 0.0f, 0.0f, 1.589068055152893f, 50.688079833984375f, 3.804378032684326f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.947292, 19.22274);
((GeneralPath)shape).curveTo(32.260033, 19.326988, 32.46853, 19.63973, 32.36428, 19.95247);
((GeneralPath)shape).lineTo(28.507133, 31.523912);
((GeneralPath)shape).curveTo(28.402887, 31.836655, 28.090145, 32.04515, 27.777403, 31.940903);
((GeneralPath)shape).curveTo(27.464663, 31.836655, 27.256168, 31.523912, 27.360415, 31.211172);
((GeneralPath)shape).lineTo(31.217562, 19.63973);
((GeneralPath)shape).curveTo(31.32181, 19.326988, 31.63455, 19.118492, 31.947292, 19.22274);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_2_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_2_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2_1_1
paint = new LinearGradientPaint(new Point2D.Double(30.62037467956543, 10.313651084899902), new Point2D.Double(32.166080474853516, 18.162935256958008), new float[] {0.0f,0.4117647f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 113),new Color(0, 0, 0, 123)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.6292999982833862f, 0.0f, 0.0f, 1.589068055152893f, 1.4116120338439941f, 3.929378032684326f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.152405, 19.34774);
((GeneralPath)shape).curveTo(19.839663, 19.451988, 19.631166, 19.76473, 19.735415, 20.07747);
((GeneralPath)shape).lineTo(23.592562, 31.648912);
((GeneralPath)shape).curveTo(23.69681, 31.961655, 24.00955, 32.17015, 24.322292, 32.065903);
((GeneralPath)shape).curveTo(24.635035, 31.961655, 24.843529, 31.648912, 24.73928, 31.336172);
((GeneralPath)shape).lineTo(20.882133, 19.76473);
((GeneralPath)shape).curveTo(20.777887, 19.451988, 20.465145, 19.243492, 20.152405, 19.34774);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_2_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_2_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2_1_2
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.255362, 19.273129);
((GeneralPath)shape).curveTo(20.009453, 19.315193, 19.816807, 19.507772, 19.774652, 19.753668);
((GeneralPath)shape).curveTo(19.732498, 19.999561, 19.850004, 20.24531, 20.067862, 20.366879);
((GeneralPath)shape).curveTo(20.067862, 20.366879, 21.910084, 21.447746, 24.317862, 21.991879);
((GeneralPath)shape).curveTo(26.72564, 22.536009, 29.806763, 22.571304, 32.130363, 20.304379);
((GeneralPath)shape).curveTo(32.305607, 20.165344, 32.386852, 19.938963, 32.340008, 19.720224);
((GeneralPath)shape).curveTo(32.29316, 19.501486, 32.126324, 19.328234, 31.90951, 19.273169);
((GeneralPath)shape).curveTo(31.692694, 19.218103, 31.463406, 19.29075, 31.317862, 19.460629);
((GeneralPath)shape).curveTo(29.367327, 21.36359, 26.773024, 21.36522, 24.567862, 20.866879);
((GeneralPath)shape).curveTo(22.3627, 20.368536, 20.661612, 19.366879, 20.661612, 19.366879);
((GeneralPath)shape).curveTo(20.542177, 19.287088, 20.397682, 19.253744, 20.255362, 19.273129);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(14.637301445007324, 31.504121780395508), new Point2D.Double(9.36482048034668, 32.250980377197266), new float[] {0.0f,1.0f}, new Color[] {new Color(163, 163, 163, 255),new Color(181, 181, 181, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.985082983970642f, 0.0f, 0.0f, 0.5037569999694824f, 1.7866120338439941f, 4.554378032684326f));
stroke = new BasicStroke(0.21454535f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.255362, 19.273129);
((GeneralPath)shape).curveTo(20.009453, 19.315193, 19.816807, 19.507772, 19.774652, 19.753668);
((GeneralPath)shape).curveTo(19.732498, 19.999561, 19.850004, 20.24531, 20.067862, 20.366879);
((GeneralPath)shape).curveTo(20.067862, 20.366879, 21.910084, 21.447746, 24.317862, 21.991879);
((GeneralPath)shape).curveTo(26.72564, 22.536009, 29.806763, 22.571304, 32.130363, 20.304379);
((GeneralPath)shape).curveTo(32.305607, 20.165344, 32.386852, 19.938963, 32.340008, 19.720224);
((GeneralPath)shape).curveTo(32.29316, 19.501486, 32.126324, 19.328234, 31.90951, 19.273169);
((GeneralPath)shape).curveTo(31.692694, 19.218103, 31.463406, 19.29075, 31.317862, 19.460629);
((GeneralPath)shape).curveTo(29.367327, 21.36359, 26.773024, 21.36522, 24.567862, 20.866879);
((GeneralPath)shape).curveTo(22.3627, 20.368536, 20.661612, 19.366879, 20.661612, 19.366879);
((GeneralPath)shape).curveTo(20.542177, 19.287088, 20.397682, 19.253744, 20.255362, 19.273129);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_2_1_2);
g.setTransform(defaultTransform__0_0_1_2_1);
g.setComposite(AlphaComposite.getInstance(3, 0.5977654f * origAlpha));
AffineTransform defaultTransform__0_0_1_2_2 = g.getTransform();
g.transform(new AffineTransform(0.9544389843940735f, 0.0f, 0.0f, 0.9898689985275269f, 1.4332220554351807f, 0.6398810148239136f));
// _0_0_1_2_2
paint = new LinearGradientPaint(new Point2D.Double(16.998855590820312, 10.061083793640137), new Point2D.Double(32.09688186645508, 36.72629165649414), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1404939889907837f, 0.0f, 0.0f, 0.926002025604248f, 0.27232998609542847f, -3.2471699714660645f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.001158, 3.5644321);
((GeneralPath)shape).curveTo(18.737608, 3.5644321, 13.655359, 7.590033, 13.655359, 12.547843);
((GeneralPath)shape).curveTo(13.655359, 14.527956, 14.632918, 16.261759, 16.006008, 17.747034);
((GeneralPath)shape).curveTo(17.558672, 18.378895, 19.249826, 18.832941, 21.114752, 18.832941);
((GeneralPath)shape).curveTo(27.378302, 18.832941, 32.46055, 14.807341, 32.460552, 9.849528);
((GeneralPath)shape).curveTo(32.460552, 7.857476, 31.466743, 6.107463, 30.07856, 4.617433);
((GeneralPath)shape).curveTo(28.533138, 3.99306, 26.85424, 3.5644321, 25.001158, 3.5644321);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_2_2);
g.setTransform(defaultTransform__0_0_1_2);
g.setTransform(defaultTransform__0_0_1);
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
        return 8.437410354614258;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 1.990607738494873;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 33.12517547607422;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 46.00939178466797;
	}

    /** The current width of this resizable icon. */
    private int width;

    /** The current height of this resizable icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public dialog_information() {
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
       dialog_information base = new dialog_information();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       dialog_information base = new dialog_information();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

