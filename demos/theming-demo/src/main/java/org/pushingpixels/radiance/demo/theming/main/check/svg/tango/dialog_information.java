package org.pushingpixels.radiance.demo.theming.main.check.svg.tango;

import java.awt.*;
import java.awt.geom.*;
import java.util.Stack;
import javax.swing.plaf.UIResource;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class dialog_information implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.8f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.1971830129623413f, 0.0f, 0.0f, 1.0985909700393677f, -6.201581954956055f, -3.2095069885253906f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.875f, 42.0625f);
generalPath.curveTo(39.897133f, 43.652596f, 37.26934f, 45.124954f, 32.986645f, 45.92206f);
generalPath.curveTo(28.703949f, 46.719166f, 23.421051f, 46.719166f, 19.138357f, 45.92206f);
generalPath.curveTo(14.855661f, 45.124954f, 12.227865f, 43.652596f, 12.25f, 42.0625f);
generalPath.curveTo(12.227865f, 40.472404f, 14.855661f, 39.000046f, 19.138357f, 38.20294f);
generalPath.curveTo(23.421051f, 37.405834f, 28.703949f, 37.405834f, 32.986645f, 38.20294f);
generalPath.curveTo(37.26934f, 39.000046f, 39.897133f, 40.472404f, 39.875f, 42.0625f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(14.772334098815918, 74.2099380493164), 7.828983f, new Point2D.Double(14.772334098815918, 74.2099380493164), new float[] {0.0f,0.55172414f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 131)) : new Color(0, 0, 0, 131)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 37)) : new Color(0, 0, 0, 37)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.7642780542373657f, 0.0f, 0.0f, 0.5668039917945862f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
// _0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0758229494094849f, 0.0f, 0.0f, 0.9374930262565613f, -2.551335096359253f, 3.047213077545166f));
// _0_0_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.893503f, 38.885944f);
generalPath.lineTo(21.893503f, 40.36116f);
generalPath.curveTo(21.893503f, 41.836376f, 23.204807f, 43.14768f, 24.680021f, 43.14768f);
generalPath.curveTo(26.155237f, 43.14768f, 27.46654f, 41.836376f, 27.46654f, 40.36116f);
generalPath.lineTo(27.46654f, 38.885944f);
generalPath.lineTo(21.893503f, 38.885944f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(23.124000549316406, 43.165000915527344), new Point2D.Double(26.478500366210938, 43.165000915527344), new float[] {0.005618f,0.03012137f,0.08366583f,0.1422f,0.2074f,0.2846f,0.4045f,0.4962f,0.6057f,0.7245f,0.8497f,0.9789f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(104, 104, 104, 255)) : new Color(104, 104, 104, 255)),((colorFilter != null) ? colorFilter.filter(new Color(119, 119, 119, 255)) : new Color(119, 119, 119, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 146, 146, 255)) : new Color(146, 146, 146, 255)),((colorFilter != null) ? colorFilter.filter(new Color(167, 167, 167, 255)) : new Color(167, 167, 167, 255)),((colorFilter != null) ? colorFilter.filter(new Color(182, 182, 182, 255)) : new Color(182, 182, 182, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 190, 190, 255)) : new Color(190, 190, 190, 255)),((colorFilter != null) ? colorFilter.filter(new Color(193, 193, 193, 255)) : new Color(193, 193, 193, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 188, 188, 255)) : new Color(188, 188, 188, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 173, 173, 255)) : new Color(173, 173, 173, 255)),((colorFilter != null) ? colorFilter.filter(new Color(149, 149, 149, 255)) : new Color(149, 149, 149, 255)),((colorFilter != null) ? colorFilter.filter(new Color(116, 116, 116, 255)) : new Color(116, 116, 116, 255)),((colorFilter != null) ? colorFilter.filter(new Color(73, 73, 73, 255)) : new Color(73, 73, 73, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 65, 65, 255)) : new Color(65, 65, 65, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.6391270160675049f, 0.0f, 0.0f, 1.6391270160675049f, -15.97035026550293f, -29.793550491333008f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(86, 86, 86, 255)) : new Color(86, 86, 86, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.893503f, 38.885944f);
generalPath.lineTo(21.893503f, 40.36116f);
generalPath.curveTo(21.893503f, 41.836376f, 23.204807f, 43.14768f, 24.680021f, 43.14768f);
generalPath.curveTo(26.155237f, 43.14768f, 27.46654f, 41.836376f, 27.46654f, 40.36116f);
generalPath.lineTo(27.46654f, 38.885944f);
generalPath.lineTo(21.893503f, 38.885944f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9890729784965515f, 0.0f, 0.0f, 0.993556022644043f, -0.40873900055885315f, 0.007920479401946068f));
// _0_0_1_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.511724f, 27.668867f);
generalPath.curveTo(21.208843f, 27.660896f, 17.463276f, 28.632053f, 19.492912f, 30.467932f);
generalPath.curveTo(18.98969f, 30.670935f, 18.27037f, 31.124313f, 18.355167f, 32.185223f);
generalPath.curveTo(18.401983f, 32.739285f, 18.989243f, 33.079395f, 19.79236f, 33.32911f);
generalPath.curveTo(18.881908f, 33.967724f, 18.302582f, 34.642555f, 18.355167f, 35.26492f);
generalPath.curveTo(18.401438f, 35.812527f, 18.976334f, 36.18753f, 19.76303f, 36.43814f);
generalPath.curveTo(18.875519f, 37.069405f, 18.3033f, 37.76012f, 18.355167f, 38.37395f);
generalPath.curveTo(18.434437f, 39.312088f, 20.457743f, 40.362926f, 24.838928f, 40.2419f);
generalPath.curveTo(27.993328f, 40.155914f, 30.776913f, 39.590515f, 30.9966f, 38.37395f);
generalPath.curveTo(31.082863f, 37.896248f, 30.691908f, 37.45053f, 30.087355f, 37.05408f);
generalPath.curveTo(30.539927f, 36.59792f, 30.85698f, 36.135242f, 30.820616f, 35.70488f);
generalPath.curveTo(30.774128f, 35.154694f, 30.205994f, 34.78192f, 29.412754f, 34.53166f);
generalPath.curveTo(30.300264f, 33.9004f, 30.872482f, 33.20968f, 30.820616f, 32.595848f);
generalPath.curveTo(30.774128f, 32.045666f, 30.205994f, 31.702225f, 29.412754f, 31.45196f);
generalPath.curveTo(30.310848f, 30.817287f, 30.872816f, 30.133928f, 30.820616f, 29.51615f);
generalPath.curveTo(30.762592f, 28.829447f, 27.61599f, 27.676357f, 24.511724f, 27.668867f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(174, 174, 87, 255)) : new Color(174, 174, 87, 255);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(24.613027572631836, 31.146202087402344), new Point2D.Double(24.613027572631836, 26.7396240234375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(76, 76, 40, 255)) : new Color(76, 76, 40, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 76, 40, 0)) : new Color(76, 76, 40, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0026559829711914f, 0.0f, 0.0f, 0.9973520040512085f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0175292f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.511724f, 27.668867f);
generalPath.curveTo(21.208843f, 27.660896f, 17.463276f, 28.632053f, 19.492912f, 30.467932f);
generalPath.curveTo(18.98969f, 30.670935f, 18.27037f, 31.124313f, 18.355167f, 32.185223f);
generalPath.curveTo(18.401983f, 32.739285f, 18.989243f, 33.079395f, 19.79236f, 33.32911f);
generalPath.curveTo(18.881908f, 33.967724f, 18.302582f, 34.642555f, 18.355167f, 35.26492f);
generalPath.curveTo(18.401438f, 35.812527f, 18.976334f, 36.18753f, 19.76303f, 36.43814f);
generalPath.curveTo(18.875519f, 37.069405f, 18.3033f, 37.76012f, 18.355167f, 38.37395f);
generalPath.curveTo(18.434437f, 39.312088f, 20.457743f, 40.362926f, 24.838928f, 40.2419f);
generalPath.curveTo(27.993328f, 40.155914f, 30.776913f, 39.590515f, 30.9966f, 38.37395f);
generalPath.curveTo(31.082863f, 37.896248f, 30.691908f, 37.45053f, 30.087355f, 37.05408f);
generalPath.curveTo(30.539927f, 36.59792f, 30.85698f, 36.135242f, 30.820616f, 35.70488f);
generalPath.curveTo(30.774128f, 35.154694f, 30.205994f, 34.78192f, 29.412754f, 34.53166f);
generalPath.curveTo(30.300264f, 33.9004f, 30.872482f, 33.20968f, 30.820616f, 32.595848f);
generalPath.curveTo(30.774128f, 32.045666f, 30.205994f, 31.702225f, 29.412754f, 31.45196f);
generalPath.curveTo(30.310848f, 30.817287f, 30.872816f, 30.133928f, 30.820616f, 29.51615f);
generalPath.curveTo(30.762592f, 28.829447f, 27.61599f, 27.676357f, 24.511724f, 27.668867f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.920208f, 38.329765f);
generalPath.curveTo(30.700521f, 39.54633f, 27.591421f, 40.23286f, 22.615131f, 39.983673f);
generalPath.curveTo(19.463507f, 39.825855f, 19.283163f, 38.944054f, 19.502848f, 37.72749f);
generalPath.curveTo(19.722534f, 36.510925f, 22.458319f, 35.65848f, 25.609509f, 35.824707f);
generalPath.curveTo(28.7607f, 35.990936f, 31.139893f, 37.1132f, 30.920208f, 38.329765f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-22.874170303344727, 38.67599105834961), new Point2D.Double(-4.390831470489502, 38.67599105834961), new float[] {0.005618f,0.02078677f,0.06600059f,0.1148f,0.1677f,0.2265f,0.2963f,0.4045f,0.5239f,0.6666f,0.8211f,0.9832f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(163, 163, 73, 255)) : new Color(163, 163, 73, 255)),((colorFilter != null) ? colorFilter.filter(new Color(172, 172, 84, 255)) : new Color(172, 172, 84, 255)),((colorFilter != null) ? colorFilter.filter(new Color(193, 193, 114, 255)) : new Color(193, 193, 114, 255)),((colorFilter != null) ? colorFilter.filter(new Color(212, 214, 142, 255)) : new Color(212, 214, 142, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 228, 166, 255)) : new Color(226, 228, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 240, 184, 255)) : new Color(237, 240, 184, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 246, 195, 255)) : new Color(243, 246, 195, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 248, 199, 255)) : new Color(245, 248, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 240, 190, 255)) : new Color(238, 240, 190, 255)),((colorFilter != null) ? colorFilter.filter(new Color(219, 221, 169, 255)) : new Color(219, 221, 169, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 189, 136, 255)) : new Color(190, 189, 136, 255)),((colorFilter != null) ? colorFilter.filter(new Color(152, 149, 100, 255)) : new Color(152, 149, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(148, 145, 96, 255)) : new Color(148, 145, 96, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.5666210055351257f, 0.029889769852161407f, -0.11855699867010117f, 0.6565409898757935f, 36.18544006347656f, 20.083110809326172f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(-10.480864524841309, 39.03395080566406), new Point2D.Double(-23.851388931274414, 39.142845153808594), new float[] {0.0f,0.2647059f,0.63235295f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(146, 148, 112, 255)) : new Color(146, 148, 112, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 255, 193, 255)) : new Color(252, 255, 193, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 245, 186, 255)) : new Color(243, 245, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 148, 112, 255)) : new Color(146, 148, 112, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.5666210055351257f, 0.029889769852161407f, -0.11855699867010117f, 0.6565409898757935f, 36.18544006347656f, 20.083110809326172f));
stroke = new BasicStroke(0.08906282f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.920208f, 38.329765f);
generalPath.curveTo(30.700521f, 39.54633f, 27.591421f, 40.23286f, 22.615131f, 39.983673f);
generalPath.curveTo(19.463507f, 39.825855f, 19.283163f, 38.944054f, 19.502848f, 37.72749f);
generalPath.curveTo(19.722534f, 36.510925f, 22.458319f, 35.65848f, 25.609509f, 35.824707f);
generalPath.curveTo(28.7607f, 35.990936f, 31.139893f, 37.1132f, 30.920208f, 38.329765f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.6027399897575378f, -0.12862500548362732f, 0.06428372114896774f, 0.7607880234718323f, 31.120210647583008f, 14.491410255432129f));
// _0_0_1_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-3.535534f, 27.228739f);
generalPath.curveTo(-3.5189617f, 28.400614f, -5.486396f, 29.48572f, -8.692855f, 30.073174f);
generalPath.curveTo(-11.899315f, 30.66063f, -15.854626f, 30.66063f, -19.061085f, 30.073174f);
generalPath.curveTo(-22.267544f, 29.48572f, -24.23498f, 28.400614f, -24.218407f, 27.228739f);
generalPath.curveTo(-24.23498f, 26.056864f, -22.267544f, 24.971758f, -19.061085f, 24.384304f);
generalPath.curveTo(-15.854626f, 23.796848f, -11.899315f, 23.796848f, -8.692855f, 24.384304f);
generalPath.curveTo(-5.486396f, 24.971758f, -3.5189617f, 26.056864f, -3.535534f, 27.228739f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-22.874170303344727, 38.67599105834961), new Point2D.Double(-4.390831470489502, 38.67599105834961), new float[] {0.005618f,0.02078677f,0.06600059f,0.1148f,0.1677f,0.2265f,0.2963f,0.4045f,0.5239f,0.6666f,0.8211f,0.9832f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(163, 163, 73, 255)) : new Color(163, 163, 73, 255)),((colorFilter != null) ? colorFilter.filter(new Color(172, 172, 84, 255)) : new Color(172, 172, 84, 255)),((colorFilter != null) ? colorFilter.filter(new Color(193, 193, 114, 255)) : new Color(193, 193, 114, 255)),((colorFilter != null) ? colorFilter.filter(new Color(212, 214, 142, 255)) : new Color(212, 214, 142, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 228, 166, 255)) : new Color(226, 228, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 240, 184, 255)) : new Color(237, 240, 184, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 246, 195, 255)) : new Color(243, 246, 195, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 248, 199, 255)) : new Color(245, 248, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 240, 190, 255)) : new Color(238, 240, 190, 255)),((colorFilter != null) ? colorFilter.filter(new Color(219, 221, 169, 255)) : new Color(219, 221, 169, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 189, 136, 255)) : new Color(190, 189, 136, 255)),((colorFilter != null) ? colorFilter.filter(new Color(152, 149, 100, 255)) : new Color(152, 149, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(148, 145, 96, 255)) : new Color(148, 145, 96, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0264500379562378f, 0.0f, 0.0f, 0.974232017993927f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(-10.480864524841309, 39.03395080566406), new Point2D.Double(-23.851388931274414, 39.142845153808594), new float[] {0.0f,0.2647059f,0.63235295f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(146, 148, 112, 255)) : new Color(146, 148, 112, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 255, 193, 255)) : new Color(252, 255, 193, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 245, 186, 255)) : new Color(243, 245, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 148, 112, 255)) : new Color(146, 148, 112, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0264500379562378f, 0.0f, 0.0f, 0.974232017993927f, 0.0f, 0.0f));
stroke = new BasicStroke(0.13035245f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-3.535534f, 27.228739f);
generalPath.curveTo(-3.5189617f, 28.400614f, -5.486396f, 29.48572f, -8.692855f, 30.073174f);
generalPath.curveTo(-11.899315f, 30.66063f, -15.854626f, 30.66063f, -19.061085f, 30.073174f);
generalPath.curveTo(-22.267544f, 29.48572f, -24.23498f, 28.400614f, -24.218407f, 27.228739f);
generalPath.curveTo(-24.23498f, 26.056864f, -22.267544f, 24.971758f, -19.061085f, 24.384304f);
generalPath.curveTo(-15.854626f, 23.796848f, -11.899315f, 23.796848f, -8.692855f, 24.384304f);
generalPath.curveTo(-5.486396f, 24.971758f, -3.5189617f, 26.056864f, -3.535534f, 27.228739f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.6027399897575378f, -0.12862500548362732f, 0.06428372114896774f, 0.7607880234718323f, 31.120210647583008f, 11.395910263061523f));
// _0_0_1_1_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-3.535534f, 27.228739f);
generalPath.curveTo(-3.5189617f, 28.400614f, -5.486396f, 29.48572f, -8.692855f, 30.073174f);
generalPath.curveTo(-11.899315f, 30.66063f, -15.854626f, 30.66063f, -19.061085f, 30.073174f);
generalPath.curveTo(-22.267544f, 29.48572f, -24.23498f, 28.400614f, -24.218407f, 27.228739f);
generalPath.curveTo(-24.23498f, 26.056864f, -22.267544f, 24.971758f, -19.061085f, 24.384304f);
generalPath.curveTo(-15.854626f, 23.796848f, -11.899315f, 23.796848f, -8.692855f, 24.384304f);
generalPath.curveTo(-5.486396f, 24.971758f, -3.5189617f, 26.056864f, -3.535534f, 27.228739f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-22.874170303344727, 38.67599105834961), new Point2D.Double(-4.390831470489502, 38.67599105834961), new float[] {0.005618f,0.02078677f,0.06600059f,0.1148f,0.1677f,0.2265f,0.2963f,0.4045f,0.5239f,0.6666f,0.8211f,0.9832f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(163, 163, 73, 255)) : new Color(163, 163, 73, 255)),((colorFilter != null) ? colorFilter.filter(new Color(172, 172, 84, 255)) : new Color(172, 172, 84, 255)),((colorFilter != null) ? colorFilter.filter(new Color(193, 193, 114, 255)) : new Color(193, 193, 114, 255)),((colorFilter != null) ? colorFilter.filter(new Color(212, 214, 142, 255)) : new Color(212, 214, 142, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 228, 166, 255)) : new Color(226, 228, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 240, 184, 255)) : new Color(237, 240, 184, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 246, 195, 255)) : new Color(243, 246, 195, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 248, 199, 255)) : new Color(245, 248, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 240, 190, 255)) : new Color(238, 240, 190, 255)),((colorFilter != null) ? colorFilter.filter(new Color(219, 221, 169, 255)) : new Color(219, 221, 169, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 189, 136, 255)) : new Color(190, 189, 136, 255)),((colorFilter != null) ? colorFilter.filter(new Color(152, 149, 100, 255)) : new Color(152, 149, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(148, 145, 96, 255)) : new Color(148, 145, 96, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0264500379562378f, 0.0f, 0.0f, 0.974232017993927f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(-10.480864524841309, 39.03395080566406), new Point2D.Double(-23.851388931274414, 39.142845153808594), new float[] {0.0f,0.2647059f,0.63235295f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(146, 148, 112, 255)) : new Color(146, 148, 112, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 255, 193, 255)) : new Color(252, 255, 193, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 245, 186, 255)) : new Color(243, 245, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 148, 112, 255)) : new Color(146, 148, 112, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0264500379562378f, 0.0f, 0.0f, 0.974232017993927f, 0.0f, 0.0f));
stroke = new BasicStroke(0.13035245f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-3.535534f, 27.228739f);
generalPath.curveTo(-3.5189617f, 28.400614f, -5.486396f, 29.48572f, -8.692855f, 30.073174f);
generalPath.curveTo(-11.899315f, 30.66063f, -15.854626f, 30.66063f, -19.061085f, 30.073174f);
generalPath.curveTo(-22.267544f, 29.48572f, -24.23498f, 28.400614f, -24.218407f, 27.228739f);
generalPath.curveTo(-24.23498f, 26.056864f, -22.267544f, 24.971758f, -19.061085f, 24.384304f);
generalPath.curveTo(-15.854626f, 23.796848f, -11.899315f, 23.796848f, -8.692855f, 24.384304f);
generalPath.curveTo(-5.486396f, 24.971758f, -3.5189617f, 26.056864f, -3.535534f, 27.228739f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.698088f, 29.636387f);
generalPath.curveTo(30.698088f, 31.014688f, 28.157326f, 32.55444f, 24.7166f, 33.288692f);
generalPath.curveTo(21.275875f, 34.022945f, 18.38922f, 33.50421f, 18.273172f, 32.130802f);
generalPath.curveTo(18.157124f, 30.757395f, 20.50968f, 29.155466f, 23.952389f, 28.968826f);
generalPath.curveTo(27.422379f, 28.78071f, 30.698088f, 28.9249f, 30.698088f, 29.636387f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-22.874170303344727, 38.67599105834961), new Point2D.Double(-4.390831470489502, 38.67599105834961), new float[] {0.005618f,0.02078677f,0.06600059f,0.1148f,0.1677f,0.2265f,0.2963f,0.4045f,0.5239f,0.6666f,0.8211f,0.9832f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(163, 163, 73, 255)) : new Color(163, 163, 73, 255)),((colorFilter != null) ? colorFilter.filter(new Color(172, 172, 84, 255)) : new Color(172, 172, 84, 255)),((colorFilter != null) ? colorFilter.filter(new Color(193, 193, 114, 255)) : new Color(193, 193, 114, 255)),((colorFilter != null) ? colorFilter.filter(new Color(212, 214, 142, 255)) : new Color(212, 214, 142, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 228, 166, 255)) : new Color(226, 228, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 240, 184, 255)) : new Color(237, 240, 184, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 246, 195, 255)) : new Color(243, 246, 195, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 248, 199, 255)) : new Color(245, 248, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 240, 190, 255)) : new Color(238, 240, 190, 255)),((colorFilter != null) ? colorFilter.filter(new Color(219, 221, 169, 255)) : new Color(219, 221, 169, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 189, 136, 255)) : new Color(190, 189, 136, 255)),((colorFilter != null) ? colorFilter.filter(new Color(152, 149, 100, 255)) : new Color(152, 149, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(148, 145, 96, 255)) : new Color(148, 145, 96, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.6186820268630981f, -0.13202700018882751f, 0.06262726336717606f, 0.7411839962005615f, 31.120210647583008f, 8.300410270690918f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(-10.480864524841309, 39.03395080566406), new Point2D.Double(-23.851388931274414, 39.142845153808594), new float[] {0.0f,0.2647059f,0.63235295f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(146, 148, 112, 255)) : new Color(146, 148, 112, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 255, 193, 255)) : new Color(252, 255, 193, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 245, 186, 255)) : new Color(243, 245, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 148, 112, 255)) : new Color(146, 148, 112, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.6186820268630981f, -0.13202700018882751f, 0.06262726336717606f, 0.7411839962005615f, 31.120210647583008f, 8.300410270690918f));
stroke = new BasicStroke(0.08906286f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.698088f, 29.636387f);
generalPath.curveTo(30.698088f, 31.014688f, 28.157326f, 32.55444f, 24.7166f, 33.288692f);
generalPath.curveTo(21.275875f, 34.022945f, 18.38922f, 33.50421f, 18.273172f, 32.130802f);
generalPath.curveTo(18.157124f, 30.757395f, 20.50968f, 29.155466f, 23.952389f, 28.968826f);
generalPath.curveTo(27.422379f, 28.78071f, 30.698088f, 28.9249f, 30.698088f, 29.636387f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.3354640007019043f, 0.0f, 0.0f, 0.3354640007019043f, 11.746780395507812f, 27.22610092163086f));
// _0_0_1_1_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.0f, 22.375f);
generalPath.curveTo(31.005209f, 23.539576f, 30.386904f, 24.617924f, 29.37921f, 25.20172f);
generalPath.curveTo(28.371517f, 25.785517f, 27.128483f, 25.785517f, 26.12079f, 25.20172f);
generalPath.curveTo(25.113096f, 24.617924f, 24.494791f, 23.539576f, 24.5f, 22.375f);
generalPath.curveTo(24.494791f, 21.210424f, 25.113096f, 20.132076f, 26.12079f, 19.54828f);
generalPath.curveTo(27.128483f, 18.964483f, 28.371517f, 18.964483f, 29.37921f, 19.54828f);
generalPath.curveTo(30.386904f, 20.132076f, 31.005209f, 21.210424f, 31.0f, 22.375f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.342182f, 33.378864f);
generalPath.curveTo(22.736591f, 33.883533f, 26.320992f, 33.34619f, 29.214315f, 31.470806f);
generalPath.curveTo(30.025581f, 30.944962f, 30.147604f, 30.343945f, 30.520922f, 29.873844f);
generalPath.curveTo(29.09679f, 31.000706f, 25.494982f, 34.035625f, 19.342182f, 33.378864f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 60)) : new Color(0, 0, 0, 60);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.3354640007019043f, 0.0f, 0.0f, 0.3354640007019043f, 11.746780395507812f, 30.233760833740234f));
// _0_0_1_1_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.0f, 22.375f);
generalPath.curveTo(31.005209f, 23.539576f, 30.386904f, 24.617924f, 29.37921f, 25.20172f);
generalPath.curveTo(28.371517f, 25.785517f, 27.128483f, 25.785517f, 26.12079f, 25.20172f);
generalPath.curveTo(25.113096f, 24.617924f, 24.494791f, 23.539576f, 24.5f, 22.375f);
generalPath.curveTo(24.494791f, 21.210424f, 25.113096f, 20.132076f, 26.12079f, 19.54828f);
generalPath.curveTo(27.128483f, 18.964483f, 28.371517f, 18.964483f, 29.37921f, 19.54828f);
generalPath.curveTo(30.386904f, 20.132076f, 31.005209f, 21.210424f, 31.0f, 22.375f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.466621f, 39.517838f);
generalPath.curveTo(22.86103f, 40.022507f, 26.44543f, 39.485165f, 29.338753f, 37.60978f);
generalPath.curveTo(30.15002f, 37.083935f, 30.272043f, 36.482918f, 30.645359f, 36.012817f);
generalPath.curveTo(29.221228f, 37.13968f, 25.61942f, 40.1746f, 19.466621f, 39.517838f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 60)) : new Color(0, 0, 0, 60);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.487362f, 36.40687f);
generalPath.curveTo(22.88177f, 36.91154f, 26.46617f, 36.3742f, 29.359491f, 34.498814f);
generalPath.curveTo(30.17076f, 33.97297f, 30.292782f, 33.371952f, 30.6661f, 32.90185f);
generalPath.curveTo(29.241968f, 34.028713f, 25.64016f, 37.063633f, 19.487362f, 36.40687f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 60)) : new Color(0, 0, 0, 60);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.9887970089912415f, 0.0f));
// _0_0_1_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9544389843940735f, 0.0f, 0.0f, 0.9898689985275269f, 1.4332220554351807f, 0.6398810148239136f));
// _0_0_1_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.87103f, 29.628128f);
generalPath.curveTo(18.87103f, 28.836695f, 20.445135f, 27.889988f, 24.419233f, 27.942972f);
generalPath.curveTo(28.101154f, 27.99206f, 30.526608f, 28.83866f, 30.526608f, 30.105404f);
generalPath.curveTo(30.526608f, 31.345282f, 27.307241f, 32.174416f, 23.874678f, 32.008186f);
generalPath.curveTo(20.442114f, 31.84196f, 18.87103f, 30.868006f, 18.87103f, 29.628128f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(17.879995346069336, 55.36279296875), new Point2D.Double(11.906206130981445, 54.8630256652832), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(214, 215, 165, 255)) : new Color(214, 215, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(142, 143, 109, 255)) : new Color(142, 143, 109, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.6034400463104248f, 0.0f, 0.0f, 0.5493959784507751f, 0.6141669750213623f, 0.024498000741004944f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(-29.00719451904297, -29.799352645874023), new Point2D.Double(-37.641231536865234, -29.59831428527832), new float[] {0.0f,0.2647059f,0.63235295f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(146, 148, 112, 255)) : new Color(146, 148, 112, 255)),((colorFilter != null) ? colorFilter.filter(new Color(96, 97, 74, 255)) : new Color(96, 97, 74, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 245, 186, 255)) : new Color(243, 245, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 148, 112, 255)) : new Color(146, 148, 112, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.9057279825210571f, -0.04386156052350998f, 0.18951000273227692f, -0.963437020778656f, 0.6141669750213623f, 0.024498000741004944f));
stroke = new BasicStroke(0.09083303f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.87103f, 29.628128f);
generalPath.curveTo(18.87103f, 28.836695f, 20.445135f, 27.889988f, 24.419233f, 27.942972f);
generalPath.curveTo(28.101154f, 27.99206f, 30.526608f, 28.83866f, 30.526608f, 30.105404f);
generalPath.curveTo(30.526608f, 31.345282f, 27.307241f, 32.174416f, 23.874678f, 32.008186f);
generalPath.curveTo(20.442114f, 31.84196f, 18.87103f, 30.868006f, 18.87103f, 29.628128f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9544389843940735f, 0.0f, 0.0f, 0.9898689985275269f, 1.4332220554351807f, 0.6398810148239136f));
// _0_0_1_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.680021f, 0.8622936f);
generalPath.curveTo(16.858006f, 0.8622936f, 10.506261f, 6.837263f, 10.506261f, 14.195288f);
generalPath.curveTo(10.506261f, 21.73785f, 16.247826f, 22.573217f, 16.247826f, 25.352995f);
generalPath.curveTo(16.247826f, 28.61906f, 19.614103f, 32.322685f, 25.14931f, 32.188995f);
generalPath.curveTo(31.035158f, 32.046837f, 33.464184f, 28.825655f, 33.464184f, 25.352995f);
generalPath.curveTo(33.464184f, 22.384064f, 38.853783f, 22.30489f, 38.853783f, 14.195288f);
generalPath.curveTo(38.853783f, 6.837263f, 32.502037f, 0.8622936f, 24.680021f, 0.8622936f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(68.13758850097656, 29.86931800842285), 33.93409f, new Point2D.Double(68.13758850097656, 29.86931800842285), new float[] {0.0f,0.882f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 45)) : new Color(255, 255, 255, 45)),((colorFilter != null) ? colorFilter.filter(new Color(112, 154, 200, 255)) : new Color(112, 154, 200, 255)),((colorFilter != null) ? colorFilter.filter(new Color(111, 150, 221, 255)) : new Color(111, 150, 221, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.551289975643158f, 1.2655920282087467E-16f, -1.3557200395657485E-16f, 0.7660340070724487f, -10.48701000213623f, 3.5143120288848877f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(97, 100, 113, 255)) : new Color(97, 100, 113, 255);
stroke = new BasicStroke(1.0159545f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.680021f, 0.8622936f);
generalPath.curveTo(16.858006f, 0.8622936f, 10.506261f, 6.837263f, 10.506261f, 14.195288f);
generalPath.curveTo(10.506261f, 21.73785f, 16.247826f, 22.573217f, 16.247826f, 25.352995f);
generalPath.curveTo(16.247826f, 28.61906f, 19.614103f, 32.322685f, 25.14931f, 32.188995f);
generalPath.curveTo(31.035158f, 32.046837f, 33.464184f, 28.825655f, 33.464184f, 25.352995f);
generalPath.curveTo(33.464184f, 22.384064f, 38.853783f, 22.30489f, 38.853783f, 14.195288f);
generalPath.curveTo(38.853783f, 6.837263f, 32.502037f, 0.8622936f, 24.680021f, 0.8622936f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9544389843940735f, 0.0f, 0.0f, 0.9898689985275269f, 1.4332220554351807f, 0.6398810148239136f));
// _0_0_1_2_0_2
paint = new LinearGradientPaint(new Point2D.Double(37.940433502197266, 16.65186309814453), new Point2D.Double(-5.251716136932373, 3.8557322025299072), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(241, 243, 255, 255)) : new Color(241, 243, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 243, 255, 0)) : new Color(241, 243, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8941289782524109f, 0.0f, 0.0f, 0.985230028629303f, 1.5159809589385986f, 0.024498000741004944f));
stroke = new BasicStroke(0.946857f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.680021f, 1.9277146f);
generalPath.curveTo(17.39f, 1.9277146f, 11.470252f, 7.4963126f, 11.470252f, 14.353901f);
generalPath.curveTo(11.470252f, 21.383476f, 16.82132f, 22.162027f, 16.82132f, 24.752747f);
generalPath.curveTo(16.82132f, 27.79668f, 19.958649f, 31.248413f, 25.117392f, 31.123814f);
generalPath.curveTo(30.60293f, 30.991322f, 32.866753f, 27.989222f, 32.866753f, 24.752747f);
generalPath.curveTo(32.866753f, 21.98574f, 37.88979f, 21.911947f, 37.88979f, 14.353901f);
generalPath.curveTo(37.88979f, 7.4963126f, 31.970043f, 1.9277146f, 24.680021f, 1.9277146f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9375f, 0.0f, 0.0f, 0.926937997341156f, 0.569221019744873f, 0.25176000595092773f));
// _0_0_1_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.947292f, 19.22274f);
generalPath.curveTo(32.260033f, 19.326988f, 32.46853f, 19.63973f, 32.36428f, 19.95247f);
generalPath.lineTo(28.507133f, 31.523912f);
generalPath.curveTo(28.402887f, 31.836655f, 28.090145f, 32.04515f, 27.777403f, 31.940903f);
generalPath.curveTo(27.464663f, 31.836655f, 27.256168f, 31.523912f, 27.360415f, 31.211172f);
generalPath.lineTo(31.217562f, 19.63973f);
generalPath.curveTo(31.32181f, 19.326988f, 31.63455f, 19.118492f, 31.947292f, 19.22274f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(30.62037467956543, 10.313651084899902), new Point2D.Double(32.166080474853516, 18.162935256958008), new float[] {0.0f,0.4117647f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 113)) : new Color(255, 255, 255, 113)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 123)) : new Color(0, 0, 0, 123))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.6292999982833862f, 0.0f, 0.0f, 1.589068055152893f, 50.688079833984375f, 3.804378032684326f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2_1_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.152405f, 19.34774f);
generalPath.curveTo(19.839663f, 19.451988f, 19.631166f, 19.76473f, 19.735415f, 20.07747f);
generalPath.lineTo(23.592562f, 31.648912f);
generalPath.curveTo(23.69681f, 31.961655f, 24.00955f, 32.17015f, 24.322292f, 32.065903f);
generalPath.curveTo(24.635035f, 31.961655f, 24.843529f, 31.648912f, 24.73928f, 31.336172f);
generalPath.lineTo(20.882133f, 19.76473f);
generalPath.curveTo(20.777887f, 19.451988f, 20.465145f, 19.243492f, 20.152405f, 19.34774f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(30.62037467956543, 10.313651084899902), new Point2D.Double(32.166080474853516, 18.162935256958008), new float[] {0.0f,0.4117647f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 113)) : new Color(255, 255, 255, 113)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 123)) : new Color(0, 0, 0, 123))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.6292999982833862f, 0.0f, 0.0f, 1.589068055152893f, 1.4116120338439941f, 3.929378032684326f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.255362f, 19.273129f);
generalPath.curveTo(20.009453f, 19.315193f, 19.816807f, 19.507772f, 19.774652f, 19.753668f);
generalPath.curveTo(19.732498f, 19.999561f, 19.850004f, 20.24531f, 20.067862f, 20.366879f);
generalPath.curveTo(20.067862f, 20.366879f, 21.910084f, 21.447746f, 24.317862f, 21.991879f);
generalPath.curveTo(26.72564f, 22.536009f, 29.806763f, 22.571304f, 32.130363f, 20.304379f);
generalPath.curveTo(32.305607f, 20.165344f, 32.386852f, 19.938963f, 32.340008f, 19.720224f);
generalPath.curveTo(32.29316f, 19.501486f, 32.126324f, 19.328234f, 31.90951f, 19.273169f);
generalPath.curveTo(31.692694f, 19.218103f, 31.463406f, 19.29075f, 31.317862f, 19.460629f);
generalPath.curveTo(29.367327f, 21.36359f, 26.773024f, 21.36522f, 24.567862f, 20.866879f);
generalPath.curveTo(22.3627f, 20.368536f, 20.661612f, 19.366879f, 20.661612f, 19.366879f);
generalPath.curveTo(20.542177f, 19.287088f, 20.397682f, 19.253744f, 20.255362f, 19.273129f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(14.637301445007324, 31.504121780395508), new Point2D.Double(9.36482048034668, 32.250980377197266), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(163, 163, 163, 255)) : new Color(163, 163, 163, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 181, 181, 0)) : new Color(181, 181, 181, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.985082983970642f, 0.0f, 0.0f, 0.5037569999694824f, 1.7866120338439941f, 4.554378032684326f));
stroke = new BasicStroke(0.21454535f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.255362f, 19.273129f);
generalPath.curveTo(20.009453f, 19.315193f, 19.816807f, 19.507772f, 19.774652f, 19.753668f);
generalPath.curveTo(19.732498f, 19.999561f, 19.850004f, 20.24531f, 20.067862f, 20.366879f);
generalPath.curveTo(20.067862f, 20.366879f, 21.910084f, 21.447746f, 24.317862f, 21.991879f);
generalPath.curveTo(26.72564f, 22.536009f, 29.806763f, 22.571304f, 32.130363f, 20.304379f);
generalPath.curveTo(32.305607f, 20.165344f, 32.386852f, 19.938963f, 32.340008f, 19.720224f);
generalPath.curveTo(32.29316f, 19.501486f, 32.126324f, 19.328234f, 31.90951f, 19.273169f);
generalPath.curveTo(31.692694f, 19.218103f, 31.463406f, 19.29075f, 31.317862f, 19.460629f);
generalPath.curveTo(29.367327f, 21.36359f, 26.773024f, 21.36522f, 24.567862f, 20.866879f);
generalPath.curveTo(22.3627f, 20.368536f, 20.661612f, 19.366879f, 20.661612f, 19.366879f);
generalPath.curveTo(20.542177f, 19.287088f, 20.397682f, 19.253744f, 20.255362f, 19.273129f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5977654f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9544389843940735f, 0.0f, 0.0f, 0.9898689985275269f, 1.4332220554351807f, 0.6398810148239136f));
// _0_0_1_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.001158f, 3.5644321f);
generalPath.curveTo(18.737608f, 3.5644321f, 13.655359f, 7.590033f, 13.655359f, 12.547843f);
generalPath.curveTo(13.655359f, 14.527956f, 14.632918f, 16.261759f, 16.006008f, 17.747034f);
generalPath.curveTo(17.558672f, 18.378895f, 19.249826f, 18.832941f, 21.114752f, 18.832941f);
generalPath.curveTo(27.378302f, 18.832941f, 32.46055f, 14.807341f, 32.460552f, 9.849528f);
generalPath.curveTo(32.460552f, 7.857476f, 31.466743f, 6.107463f, 30.07856f, 4.617433f);
generalPath.curveTo(28.533138f, 3.99306f, 26.85424f, 3.5644321f, 25.001158f, 3.5644321f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(16.998855590820312, 10.061083793640137), new Point2D.Double(32.09688186645508, 36.72629165649414), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1404939889907837f, 0.0f, 0.0f, 0.926002025604248f, 0.27232998609542847f, -3.2471699714660645f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());

}



    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    _paint0(g, origAlpha);


	    shape = null;
	    generalPath = null;
	    paint = null;
	    stroke = null;
	    clip = null;
        transformsStack.clear();
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private dialog_information() {
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
	public synchronized void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
    public boolean supportsColorFilter() {
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    @Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
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
    public static RadianceIcon of(int width, int height) {
       dialog_information base = new dialog_information();
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       dialog_information base = new dialog_information();
       base.width = width;
       base.height = height;
       return new RadianceIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return dialog_information::new;
    }
}

