package org.pushingpixels.demo.substance.main.check.svg.flags;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class br implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private NeonIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.lineTo(512.0f, 0.0f);
generalPath.lineTo(512.0f, 512.0f);
generalPath.lineTo(0.0f, 512.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(34, 158, 69, 255)) : new Color(34, 158, 69, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(261.358f, 405.394f);
generalPath.lineTo(491.23f, 256.2f);
generalPath.lineTo(259.967f, 106.605f);
generalPath.lineTo(29.34f, 256.56f);
generalPath.lineTo(261.358f, 405.39398f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(248, 229, 9, 255)) : new Color(248, 229, 9, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(361.52f, 256.004f);
generalPath.curveTo(361.52f, 309.626f, 317.97998f, 353.097f, 264.27f, 353.097f);
generalPath.curveTo(210.56f, 353.097f, 167.02199f, 309.62698f, 167.02199f, 256.00397f);
generalPath.curveTo(167.02199f, 202.38095f, 210.56198f, 158.91096f, 264.27197f, 158.91096f);
generalPath.curveTo(317.98196f, 158.91096f, 361.51996f, 202.38097f, 361.51996f, 256.00497f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(43, 73, 163, 255)) : new Color(43, 73, 163, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.302f, 314.156f);
generalPath.lineTo(229.298f, 312.422f);
generalPath.lineTo(226.17801f, 313.966f);
generalPath.lineTo(226.876f, 310.49802f);
generalPath.lineTo(224.466f, 307.95602f);
generalPath.lineTo(227.912f, 307.553f);
generalPath.lineTo(229.532f, 304.44302f);
generalPath.lineTo(230.97499f, 307.65903f);
generalPath.lineTo(234.37498f, 308.27603f);
generalPath.lineTo(231.82498f, 310.66302f);
generalPath.moveTo(297.473f, 330.65802f);
generalPath.lineTo(294.468f, 328.924f);
generalPath.lineTo(291.348f, 330.46802f);
generalPath.lineTo(292.046f, 327.00003f);
generalPath.lineTo(289.636f, 324.46002f);
generalPath.lineTo(293.082f, 324.05502f);
generalPath.lineTo(294.702f, 320.94504f);
generalPath.lineTo(296.145f, 324.16205f);
generalPath.lineTo(299.54498f, 324.77905f);
generalPath.lineTo(296.995f, 327.16605f);
generalPath.moveTo(269.382f, 304.29706f);
generalPath.lineTo(266.787f, 302.79907f);
generalPath.lineTo(264.09097f, 304.13208f);
generalPath.lineTo(264.69498f, 301.13608f);
generalPath.lineTo(262.61298f, 298.94006f);
generalPath.lineTo(265.59097f, 298.59207f);
generalPath.lineTo(266.98898f, 295.90506f);
generalPath.lineTo(268.23697f, 298.68506f);
generalPath.lineTo(271.17398f, 299.21805f);
generalPath.lineTo(268.97098f, 301.28006f);
generalPath.moveTo(335.20197f, 294.81805f);
generalPath.lineTo(332.65198f, 293.34805f);
generalPath.lineTo(330.00598f, 294.65805f);
generalPath.lineTo(330.59897f, 291.71506f);
generalPath.lineTo(328.55298f, 289.55905f);
generalPath.lineTo(331.477f, 289.21606f);
generalPath.lineTo(332.84998f, 286.57806f);
generalPath.lineTo(334.076f, 289.30606f);
generalPath.lineTo(336.96f, 289.82907f);
generalPath.lineTo(334.797f, 291.85507f);
generalPath.moveTo(268.193f, 275.08508f);
generalPath.lineTo(265.188f, 273.35107f);
generalPath.lineTo(262.068f, 274.8961f);
generalPath.lineTo(262.766f, 271.4281f);
generalPath.lineTo(260.356f, 268.8861f);
generalPath.lineTo(263.80298f, 268.48212f);
generalPath.lineTo(265.421f, 265.37213f);
generalPath.lineTo(266.866f, 268.59012f);
generalPath.lineTo(270.266f, 269.20813f);
generalPath.lineTo(267.716f, 271.59512f);
generalPath.moveTo(187.95f, 244.96f);
generalPath.lineTo(184.94499f, 243.225f);
generalPath.lineTo(181.825f, 244.76901f);
generalPath.lineTo(182.523f, 241.29901f);
generalPath.lineTo(180.11299f, 238.75902f);
generalPath.lineTo(183.56f, 238.35501f);
generalPath.lineTo(185.178f, 235.24501f);
generalPath.lineTo(186.622f, 238.46101f);
generalPath.lineTo(190.02199f, 239.07901f);
generalPath.lineTo(187.47198f, 241.466f);
generalPath.moveTo(197.59999f, 285.034f);
generalPath.lineTo(194.59499f, 283.3f);
generalPath.lineTo(191.47499f, 284.844f);
generalPath.lineTo(192.17299f, 281.376f);
generalPath.lineTo(189.76299f, 278.834f);
generalPath.lineTo(193.20999f, 278.431f);
generalPath.lineTo(194.82799f, 275.321f);
generalPath.lineTo(196.27199f, 278.539f);
generalPath.lineTo(199.67198f, 279.156f);
generalPath.lineTo(197.12198f, 281.543f);
generalPath.moveTo(297.73398f, 230.206f);
generalPath.lineTo(295.08f, 228.676f);
generalPath.lineTo(292.323f, 230.039f);
generalPath.lineTo(292.94f, 226.974f);
generalPath.lineTo(290.81f, 224.729f);
generalPath.lineTo(293.856f, 224.37201f);
generalPath.lineTo(295.28598f, 221.62401f);
generalPath.lineTo(296.56097f, 224.46701f);
generalPath.lineTo(299.56598f, 225.01201f);
generalPath.lineTo(297.313f, 227.12201f);
generalPath.moveTo(292.22998f, 256.28f);
generalPath.lineTo(290.13998f, 255.072f);
generalPath.lineTo(287.96997f, 256.146f);
generalPath.lineTo(288.45496f, 253.734f);
generalPath.lineTo(286.77795f, 251.96399f);
generalPath.lineTo(289.17596f, 251.68399f);
generalPath.lineTo(290.30197f, 249.51999f);
generalPath.lineTo(291.30698f, 251.76f);
generalPath.lineTo(293.67297f, 252.18799f);
generalPath.lineTo(291.89798f, 253.84799f);
generalPath.moveTo(183.47699f, 292.296f);
generalPath.lineTo(181.471f, 291.138f);
generalPath.lineTo(179.388f, 292.168f);
generalPath.lineTo(179.855f, 289.854f);
generalPath.lineTo(178.245f, 288.157f);
generalPath.lineTo(180.547f, 287.88702f);
generalPath.lineTo(181.627f, 285.81003f);
generalPath.lineTo(182.591f, 287.95804f);
generalPath.lineTo(184.86101f, 288.37103f);
generalPath.lineTo(183.15901f, 289.96603f);
generalPath.moveTo(335.758f, 301.52704f);
generalPath.lineTo(334.124f, 300.66104f);
generalPath.lineTo(332.426f, 301.43304f);
generalPath.lineTo(332.806f, 299.70105f);
generalPath.lineTo(331.496f, 298.43106f);
generalPath.lineTo(333.37f, 298.23105f);
generalPath.lineTo(334.25f, 296.67606f);
generalPath.lineTo(335.036f, 298.28305f);
generalPath.lineTo(336.88602f, 298.59305f);
generalPath.lineTo(335.49902f, 299.78305f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 239, 255)) : new Color(255, 255, 239, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.477f, 292.296f);
generalPath.lineTo(181.47101f, 291.138f);
generalPath.lineTo(179.38802f, 292.168f);
generalPath.lineTo(179.85501f, 289.854f);
generalPath.lineTo(178.24501f, 288.157f);
generalPath.lineTo(180.54701f, 287.88702f);
generalPath.lineTo(181.62701f, 285.81003f);
generalPath.lineTo(182.59102f, 287.95804f);
generalPath.lineTo(184.86102f, 288.37103f);
generalPath.lineTo(183.15903f, 289.96603f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 239, 255)) : new Color(255, 255, 239, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.477f, 292.296f);
generalPath.lineTo(181.47101f, 291.138f);
generalPath.lineTo(179.38802f, 292.168f);
generalPath.lineTo(179.85501f, 289.854f);
generalPath.lineTo(178.24501f, 288.157f);
generalPath.lineTo(180.54701f, 287.88702f);
generalPath.lineTo(181.62701f, 285.81003f);
generalPath.lineTo(182.59102f, 287.95804f);
generalPath.lineTo(184.86102f, 288.37103f);
generalPath.lineTo(183.15903f, 289.96603f);
generalPath.moveTo(215.41003f, 292.28802f);
generalPath.lineTo(213.40303f, 291.131f);
generalPath.lineTo(211.32004f, 292.161f);
generalPath.lineTo(211.78604f, 289.84702f);
generalPath.lineTo(210.17604f, 288.15002f);
generalPath.lineTo(212.47804f, 287.88004f);
generalPath.lineTo(213.55804f, 285.80304f);
generalPath.lineTo(214.52304f, 287.95105f);
generalPath.lineTo(216.79305f, 288.36404f);
generalPath.lineTo(215.09004f, 289.95804f);
generalPath.moveTo(211.44005f, 302.91003f);
generalPath.lineTo(209.43605f, 301.75302f);
generalPath.lineTo(207.35205f, 302.78302f);
generalPath.lineTo(207.81805f, 300.46902f);
generalPath.lineTo(206.20805f, 298.77103f);
generalPath.lineTo(208.51006f, 298.50104f);
generalPath.lineTo(209.59006f, 296.42404f);
generalPath.lineTo(210.55505f, 298.57205f);
generalPath.lineTo(212.82506f, 298.98505f);
generalPath.lineTo(211.12306f, 300.57904f);
generalPath.moveTo(277.74805f, 283.57303f);
generalPath.lineTo(275.74203f, 282.41602f);
generalPath.lineTo(273.65903f, 283.446f);
generalPath.lineTo(274.12402f, 281.131f);
generalPath.lineTo(272.51404f, 279.435f);
generalPath.lineTo(274.81604f, 279.165f);
generalPath.lineTo(275.89603f, 277.08902f);
generalPath.lineTo(276.86102f, 279.23703f);
generalPath.lineTo(279.131f, 279.64902f);
generalPath.lineTo(277.428f, 281.243f);
generalPath.moveTo(258.29f, 283.566f);
generalPath.lineTo(256.285f, 282.40802f);
generalPath.lineTo(254.20201f, 283.43802f);
generalPath.lineTo(254.66801f, 281.12402f);
generalPath.lineTo(253.05801f, 279.42703f);
generalPath.lineTo(255.36002f, 279.15704f);
generalPath.lineTo(256.44f, 277.08005f);
generalPath.lineTo(257.405f, 279.23004f);
generalPath.lineTo(259.675f, 279.64005f);
generalPath.lineTo(257.972f, 281.23505f);
generalPath.moveTo(205.51498f, 276.78305f);
generalPath.lineTo(204.25798f, 276.05704f);
generalPath.lineTo(202.95299f, 276.70303f);
generalPath.lineTo(203.245f, 275.25302f);
generalPath.lineTo(202.237f, 274.18903f);
generalPath.lineTo(203.679f, 274.019f);
generalPath.lineTo(204.355f, 272.71902f);
generalPath.lineTo(204.959f, 274.06403f);
generalPath.lineTo(206.382f, 274.32202f);
generalPath.lineTo(205.315f, 275.32202f);
generalPath.moveTo(333.285f, 309.928f);
generalPath.lineTo(331.28f, 308.77002f);
generalPath.lineTo(329.19598f, 309.80002f);
generalPath.lineTo(329.662f, 307.48502f);
generalPath.lineTo(328.052f, 305.78802f);
generalPath.lineTo(330.354f, 305.51804f);
generalPath.lineTo(331.434f, 303.44205f);
generalPath.lineTo(332.399f, 305.59006f);
generalPath.lineTo(334.66898f, 306.00305f);
generalPath.lineTo(332.96597f, 307.59604f);
generalPath.moveTo(317.08298f, 312.05005f);
generalPath.lineTo(315.421f, 311.09006f);
generalPath.lineTo(313.697f, 311.94507f);
generalPath.lineTo(314.08298f, 310.02206f);
generalPath.lineTo(312.74997f, 308.61206f);
generalPath.lineTo(314.65497f, 308.38907f);
generalPath.lineTo(315.54996f, 306.66406f);
generalPath.lineTo(316.34995f, 308.44705f);
generalPath.lineTo(318.22995f, 308.79004f);
generalPath.lineTo(316.81995f, 310.11404f);
generalPath.moveTo(324.72696f, 311.86606f);
generalPath.lineTo(323.17896f, 310.97205f);
generalPath.lineTo(321.57095f, 311.76804f);
generalPath.lineTo(321.93094f, 309.98004f);
generalPath.lineTo(320.68893f, 308.67004f);
generalPath.lineTo(322.46393f, 308.46005f);
generalPath.lineTo(323.29794f, 306.85706f);
generalPath.lineTo(324.04095f, 308.51706f);
generalPath.lineTo(325.79095f, 308.83505f);
generalPath.lineTo(324.47894f, 310.06506f);
generalPath.moveTo(346.67593f, 292.71207f);
generalPath.lineTo(345.18594f, 291.85208f);
generalPath.lineTo(343.63596f, 292.61807f);
generalPath.lineTo(343.98294f, 290.89807f);
generalPath.lineTo(342.78693f, 289.63608f);
generalPath.lineTo(344.49692f, 289.43607f);
generalPath.lineTo(345.3009f, 287.89307f);
generalPath.lineTo(346.0179f, 289.48907f);
generalPath.lineTo(347.70493f, 289.79407f);
generalPath.lineTo(346.4399f, 290.97906f);
generalPath.moveTo(316.88992f, 322.86008f);
generalPath.lineTo(314.9439f, 321.7971f);
generalPath.lineTo(312.9219f, 322.74408f);
generalPath.lineTo(313.3749f, 320.61807f);
generalPath.lineTo(311.8129f, 319.06107f);
generalPath.lineTo(314.0459f, 318.81506f);
generalPath.lineTo(315.0959f, 316.90906f);
generalPath.lineTo(316.03088f, 318.87906f);
generalPath.lineTo(318.2349f, 319.25906f);
generalPath.lineTo(316.58188f, 320.72107f);
generalPath.moveTo(316.99988f, 331.58206f);
generalPath.lineTo(315.22488f, 330.52005f);
generalPath.lineTo(313.3809f, 331.46606f);
generalPath.lineTo(313.7949f, 329.34106f);
generalPath.lineTo(312.3699f, 327.78406f);
generalPath.lineTo(314.4059f, 327.53705f);
generalPath.lineTo(315.3629f, 325.63104f);
generalPath.lineTo(316.2159f, 327.60104f);
generalPath.lineTo(318.22592f, 327.98105f);
generalPath.lineTo(316.71793f, 329.44406f);
generalPath.moveTo(302.28592f, 311.86307f);
generalPath.lineTo(300.79593f, 311.00308f);
generalPath.lineTo(299.24594f, 311.7681f);
generalPath.lineTo(299.59293f, 310.0481f);
generalPath.lineTo(298.39792f, 308.7881f);
generalPath.lineTo(300.1079f, 308.5861f);
generalPath.lineTo(300.91092f, 307.0431f);
generalPath.lineTo(301.62793f, 308.6391f);
generalPath.lineTo(303.31494f, 308.9451f);
generalPath.lineTo(302.04993f, 310.1291f);
generalPath.moveTo(288.48993f, 311.8631f);
generalPath.lineTo(286.99994f, 311.0031f);
generalPath.lineTo(285.45294f, 311.76813f);
generalPath.lineTo(285.79895f, 310.04813f);
generalPath.lineTo(284.60196f, 308.78812f);
generalPath.lineTo(286.31195f, 308.58612f);
generalPath.lineTo(287.11496f, 307.04312f);
generalPath.lineTo(287.83197f, 308.63913f);
generalPath.lineTo(289.51898f, 308.94513f);
generalPath.lineTo(288.25397f, 310.12912f);
generalPath.moveTo(265.07f, 291.38f);
generalPath.lineTo(263.578f, 290.52002f);
generalPath.lineTo(262.03f, 291.286f);
generalPath.lineTo(262.37698f, 289.566f);
generalPath.lineTo(261.18097f, 288.306f);
generalPath.lineTo(262.89096f, 288.106f);
generalPath.lineTo(263.69495f, 286.56097f);
generalPath.lineTo(264.41095f, 288.15897f);
generalPath.lineTo(266.09796f, 288.46497f);
generalPath.lineTo(264.83295f, 289.64896f);
generalPath.moveTo(267.67993f, 333.12595f);
generalPath.lineTo(266.41592f, 332.39594f);
generalPath.lineTo(265.10593f, 333.04593f);
generalPath.lineTo(265.39893f, 331.58893f);
generalPath.lineTo(264.38492f, 330.51892f);
generalPath.lineTo(265.83292f, 330.3489f);
generalPath.lineTo(266.5129f, 329.0429f);
generalPath.lineTo(267.1199f, 330.3949f);
generalPath.lineTo(268.5499f, 330.6549f);
generalPath.lineTo(267.4779f, 331.65692f);
generalPath.moveTo(232.30191f, 265.60492f);
generalPath.lineTo(229.29791f, 263.8709f);
generalPath.lineTo(226.17792f, 265.41592f);
generalPath.lineTo(226.87592f, 261.94794f);
generalPath.lineTo(224.46591f, 259.40594f);
generalPath.lineTo(227.91191f, 259.00195f);
generalPath.lineTo(229.5319f, 255.89195f);
generalPath.lineTo(230.9749f, 259.10995f);
generalPath.lineTo(234.3749f, 259.72797f);
generalPath.lineTo(231.82489f, 262.11496f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 239, 255)) : new Color(255, 255, 239, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(355.113f, 290.934f);
generalPath.curveTo(356.595f, 287.05798f, 358.50702f, 281.214f, 359.523f, 275.848f);
generalPath.curveTo(307.87f, 230.47299f, 250.29001f, 207.23f, 177.533f, 212.012f);
generalPath.curveTo(174.92601f, 217.012f, 172.838f, 222.24799f, 171.07701f, 227.91199f);
generalPath.curveTo(257.284f, 219.689f, 320.47302f, 257.85498f, 355.115f, 290.934f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(331.893f, 265.425f);
generalPath.lineTo(333.738f, 266.43298f);
generalPath.curveTo(333.448f, 267.08698f, 333.371f, 267.659f, 333.502f, 268.14697f);
generalPath.curveTo(333.639f, 268.63998f, 333.97803f, 269.06897f, 334.519f, 269.43497f);
generalPath.curveTo(335.092f, 269.82697f, 335.605f, 269.99896f, 336.056f, 269.95297f);
generalPath.curveTo(336.513f, 269.90698f, 336.853f, 269.71997f, 337.074f, 269.39297f);
generalPath.curveTo(337.21402f, 269.18298f, 337.27002f, 268.96298f, 337.24402f, 268.735f);
generalPath.curveTo(337.22403f, 268.50497f, 337.09802f, 268.232f, 336.867f, 267.91498f);
generalPath.curveTo(336.707f, 267.70197f, 336.319f, 267.24997f, 335.702f, 266.56097f);
generalPath.curveTo(334.908f, 265.67697f, 334.435f, 264.93097f, 334.28198f, 264.32098f);
generalPath.curveTo(334.06998f, 263.46698f, 334.19897f, 262.69098f, 334.672f, 261.98898f);
generalPath.curveTo(334.97598f, 261.53897f, 335.385f, 261.20297f, 335.9f, 260.98398f);
generalPath.curveTo(336.42398f, 260.76398f, 336.995f, 260.714f, 337.61f, 260.83398f);
generalPath.curveTo(338.228f, 260.95398f, 338.878f, 261.244f, 339.554f, 261.70398f);
generalPath.curveTo(340.66098f, 262.45697f, 341.33f, 263.266f, 341.55798f, 264.13098f);
generalPath.curveTo(341.791f, 265.00098f, 341.64798f, 265.85098f, 341.128f, 266.68097f);
generalPath.lineTo(339.29498f, 265.55096f);
generalPath.curveTo(339.525f, 265.04398f, 339.581f, 264.60696f, 339.46097f, 264.23798f);
generalPath.curveTo(339.35098f, 263.86798f, 339.04297f, 263.51297f, 338.54095f, 263.17197f);
generalPath.curveTo(338.02396f, 262.82196f, 337.54697f, 262.65396f, 337.11096f, 262.66797f);
generalPath.curveTo(336.84634f, 262.6677f, 336.59985f, 262.80225f, 336.45697f, 263.02496f);
generalPath.curveTo(336.31647f, 263.23682f, 336.28036f, 263.50122f, 336.35898f, 263.74295f);
generalPath.curveTo(336.45697f, 264.08594f, 336.869f, 264.65295f, 337.59897f, 265.44696f);
generalPath.curveTo(338.32498f, 266.23996f, 338.82095f, 266.88696f, 339.08496f, 267.38995f);
generalPath.curveTo(339.35495f, 267.88995f, 339.47797f, 268.40994f, 339.45197f, 268.95197f);
generalPath.curveTo(339.43497f, 269.48996f, 339.23596f, 270.03897f, 338.85995f, 270.59897f);
generalPath.curveTo(338.52032f, 271.10434f, 338.04077f, 271.4998f, 337.47995f, 271.73697f);
generalPath.curveTo(336.89996f, 271.98898f, 336.27994f, 272.05096f, 335.61996f, 271.91898f);
generalPath.curveTo(334.96295f, 271.78497f, 334.25195f, 271.45697f, 333.48697f, 270.93597f);
generalPath.curveTo(332.37198f, 270.17996f, 331.68698f, 269.33997f, 331.43698f, 268.41898f);
generalPath.curveTo(331.192f, 267.49496f, 331.343f, 266.49597f, 331.895f, 265.42697f);
generalPath.closePath();
generalPath.moveTo(323.14f, 259.68f);
generalPath.lineTo(325.026f, 260.61f);
generalPath.curveTo(324.763f, 261.275f, 324.708f, 261.84998f, 324.859f, 262.33298f);
generalPath.curveTo(325.01602f, 262.81897f, 325.36902f, 263.236f, 325.92502f, 263.58f);
generalPath.curveTo(326.515f, 263.948f, 327.03302f, 264.09998f, 327.48203f, 264.03497f);
generalPath.curveTo(327.93903f, 263.96896f, 328.27203f, 263.77097f, 328.47702f, 263.43497f);
generalPath.curveTo(328.60532f, 263.23895f, 328.65726f, 263.00272f, 328.62302f, 262.77097f);
generalPath.curveTo(328.59302f, 262.54297f, 328.45602f, 262.27396f, 328.21103f, 261.96597f);
generalPath.curveTo(328.04404f, 261.75897f, 327.63904f, 261.32596f, 326.99304f, 260.65997f);
generalPath.curveTo(326.16504f, 259.80698f, 325.66306f, 259.08f, 325.48505f, 258.47998f);
generalPath.curveTo(325.23904f, 257.632f, 325.33704f, 256.84998f, 325.77805f, 256.132f);
generalPath.curveTo(326.06268f, 255.67249f, 326.47568f, 255.30643f, 326.96603f, 255.079f);
generalPath.curveTo(327.48105f, 254.83899f, 328.04904f, 254.763f, 328.66803f, 254.857f);
generalPath.curveTo(329.29102f, 254.954f, 329.95203f, 255.217f, 330.64603f, 255.651f);
generalPath.curveTo(331.78403f, 256.356f, 332.48303f, 257.138f, 332.74603f, 257.994f);
generalPath.curveTo(333.01303f, 258.85397f, 332.90604f, 259.707f, 332.42004f, 260.56f);
generalPath.lineTo(330.54004f, 259.504f);
generalPath.curveTo(330.75003f, 258.99f, 330.79004f, 258.55f, 330.65503f, 258.187f);
generalPath.curveTo(330.52704f, 257.821f, 330.20502f, 257.479f, 329.69202f, 257.159f);
generalPath.curveTo(329.16f, 256.827f, 328.677f, 256.679f, 328.242f, 256.711f);
generalPath.curveTo(327.97763f, 256.72137f, 327.73694f, 256.86624f, 327.604f, 257.095f);
generalPath.curveTo(327.47202f, 257.31f, 327.448f, 257.548f, 327.534f, 257.815f);
generalPath.curveTo(327.646f, 258.153f, 328.08f, 258.703f, 328.84f, 259.46802f);
generalPath.curveTo(329.597f, 260.22803f, 330.12f, 260.85602f, 330.40298f, 261.346f);
generalPath.curveTo(330.693f, 261.836f, 330.83698f, 262.351f, 330.83298f, 262.892f);
generalPath.curveTo(330.83798f, 263.432f, 330.65997f, 263.988f, 330.30798f, 264.564f);
generalPath.curveTo(329.986f, 265.08398f, 329.538f, 265.481f, 328.972f, 265.757f);
generalPath.curveTo(328.404f, 266.03198f, 327.78598f, 266.11697f, 327.12198f, 266.013f);
generalPath.curveTo(326.46198f, 265.905f, 325.73798f, 265.603f, 324.95197f, 265.116f);
generalPath.curveTo(323.80795f, 264.40298f, 323.09198f, 263.593f, 322.80396f, 262.682f);
generalPath.curveTo(322.51895f, 261.768f, 322.62994f, 260.76602f, 323.13895f, 259.676f);
generalPath.closePath();
generalPath.moveTo(312.31003f, 256.77698f);
generalPath.lineTo(317.85703f, 247.65398f);
generalPath.lineTo(324.59503f, 251.78398f);
generalPath.lineTo(323.65503f, 253.32799f);
generalPath.lineTo(318.75504f, 250.32199f);
generalPath.lineTo(317.52304f, 252.344f);
generalPath.lineTo(322.08505f, 255.14099f);
generalPath.lineTo(321.15005f, 256.67798f);
generalPath.lineTo(316.58804f, 253.88298f);
generalPath.lineTo(315.07803f, 256.36597f);
generalPath.lineTo(320.15503f, 259.47595f);
generalPath.lineTo(319.21902f, 261.01596f);
generalPath.lineTo(312.30902f, 256.77795f);
generalPath.closePath();
generalPath.moveTo(296.53204f, 243.81998f);
generalPath.lineTo(297.35504f, 242.21997f);
generalPath.lineTo(301.47305f, 244.34998f);
generalPath.lineTo(299.53305f, 248.13498f);
generalPath.curveTo(298.93005f, 248.31699f, 298.17307f, 248.35999f, 297.25806f, 248.26498f);
generalPath.curveTo(296.35104f, 248.16498f, 295.50806f, 247.91498f, 294.72806f, 247.51198f);
generalPath.curveTo(293.73807f, 246.99998f, 292.98206f, 246.34898f, 292.46005f, 245.55197f);
generalPath.curveTo(291.94006f, 244.75197f, 291.69006f, 243.87198f, 291.71704f, 242.90497f);
generalPath.curveTo(291.74704f, 241.93497f, 291.99405f, 240.99496f, 292.46204f, 240.08296f);
generalPath.curveTo(292.96902f, 239.09296f, 293.62903f, 238.32297f, 294.43805f, 237.76596f);
generalPath.curveTo(295.24304f, 237.21097f, 296.15204f, 236.93596f, 297.15805f, 236.93596f);
generalPath.curveTo(297.92804f, 236.93196f, 298.76306f, 237.16795f, 299.66806f, 237.63196f);
generalPath.curveTo(300.84305f, 238.24196f, 301.63306f, 238.96396f, 302.03406f, 239.80196f);
generalPath.curveTo(302.44406f, 240.63795f, 302.52005f, 241.53996f, 302.26105f, 242.51196f);
generalPath.lineTo(300.18106f, 241.88596f);
generalPath.curveTo(300.29276f, 241.38164f, 300.2256f, 240.85417f, 299.99106f, 240.39395f);
generalPath.curveTo(299.76605f, 239.93195f, 299.37704f, 239.55894f, 298.82806f, 239.27396f);
generalPath.curveTo(297.99106f, 238.84096f, 297.19107f, 238.76396f, 296.42206f, 239.04095f);
generalPath.curveTo(295.66006f, 239.31895f, 295.01205f, 239.97896f, 294.47507f, 241.02495f);
generalPath.curveTo(293.89508f, 242.15295f, 293.70908f, 243.12895f, 293.91806f, 243.95494f);
generalPath.curveTo(294.13007f, 244.77194f, 294.63806f, 245.39194f, 295.45007f, 245.81194f);
generalPath.curveTo(295.85007f, 246.01894f, 296.29007f, 246.14793f, 296.77008f, 246.19893f);
generalPath.curveTo(297.25607f, 246.24893f, 297.70007f, 246.23593f, 298.10507f, 246.16093f);
generalPath.lineTo(298.72507f, 244.95393f);
generalPath.lineTo(296.53506f, 243.82193f);
generalPath.closePath();
generalPath.moveTo(227.72504f, 226.75798f);
generalPath.lineTo(229.27504f, 216.18398f);
generalPath.lineTo(232.45705f, 216.65398f);
generalPath.lineTo(233.31305f, 224.14798f);
generalPath.lineTo(236.25705f, 217.21498f);
generalPath.lineTo(239.44905f, 217.68498f);
generalPath.lineTo(237.89905f, 228.26099f);
generalPath.lineTo(235.92305f, 227.971f);
generalPath.lineTo(237.14505f, 219.646f);
generalPath.lineTo(233.83305f, 227.661f);
generalPath.lineTo(231.78606f, 227.358f);
generalPath.lineTo(230.92105f, 218.726f);
generalPath.lineTo(229.70105f, 227.049f);
generalPath.lineTo(227.72404f, 226.759f);
generalPath.closePath();
generalPath.moveTo(216.96803f, 225.50798f);
generalPath.lineTo(217.96303f, 214.86398f);
generalPath.lineTo(225.82303f, 215.60698f);
generalPath.lineTo(225.65703f, 217.40698f);
generalPath.lineTo(219.93703f, 216.86699f);
generalPath.lineTo(219.71402f, 219.22699f);
generalPath.lineTo(225.03403f, 219.72899f);
generalPath.lineTo(224.86803f, 221.52199f);
generalPath.lineTo(219.54602f, 221.01999f);
generalPath.lineTo(219.27602f, 223.91699f);
generalPath.lineTo(225.19601f, 224.474f);
generalPath.lineTo(225.03001f, 226.269f);
generalPath.lineTo(216.96802f, 225.509f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 158, 58, 255)) : new Color(48, 158, 58, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(181.37f, 218.85f);
generalPath.curveTo(181.4f, 217.763f, 181.586f, 216.85301f, 181.93f, 216.12401f);
generalPath.curveTo(182.187f, 215.58601f, 182.53f, 215.10701f, 182.95699f, 214.686f);
generalPath.curveTo(183.38899f, 214.266f, 183.85698f, 213.95601f, 184.36398f, 213.76201f);
generalPath.curveTo(185.03398f, 213.49901f, 185.80399f, 213.378f, 186.66798f, 213.40201f);
generalPath.curveTo(188.23799f, 213.445f, 189.47798f, 213.96701f, 190.38799f, 214.96901f);
generalPath.curveTo(191.30798f, 215.97101f, 191.74199f, 217.34201f, 191.69499f, 219.08101f);
generalPath.curveTo(191.648f, 220.80501f, 191.14499f, 222.14401f, 190.183f, 223.095f);
generalPath.curveTo(189.22299f, 224.041f, 187.961f, 224.493f, 186.399f, 224.45f);
generalPath.curveTo(184.814f, 224.40799f, 183.569f, 223.89f, 182.662f, 222.898f);
generalPath.curveTo(181.754f, 221.9f, 181.322f, 220.551f, 181.37f, 218.851f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 158, 58, 255)) : new Color(48, 158, 58, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.592f, 218.83f);
generalPath.curveTo(183.55899f, 220.04001f, 183.812f, 220.967f, 184.35199f, 221.608f);
generalPath.curveTo(184.89198f, 222.246f, 185.59f, 222.576f, 186.44699f, 222.598f);
generalPath.curveTo(187.303f, 222.623f, 188.01399f, 222.33301f, 188.577f, 221.73201f);
generalPath.curveTo(189.14499f, 221.12401f, 189.44699f, 220.20201f, 189.48f, 218.962f);
generalPath.curveTo(189.513f, 217.738f, 189.26999f, 216.817f, 188.75f, 216.20001f);
generalPath.curveTo(188.232f, 215.58301f, 187.532f, 215.26302f, 186.646f, 215.238f);
generalPath.curveTo(185.761f, 215.214f, 185.039f, 215.501f, 184.47899f, 216.098f);
generalPath.curveTo(183.91899f, 216.69101f, 183.62299f, 217.602f, 183.59099f, 218.83101f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(247, 255, 255, 255)) : new Color(247, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.99f, 224.365f);
generalPath.lineTo(194.115f, 213.677f);
generalPath.lineTo(198.639f, 213.731f);
generalPath.curveTo(199.776f, 213.746f, 200.59901f, 213.851f, 201.11101f, 214.05301f);
generalPath.curveTo(201.62701f, 214.24802f, 202.037f, 214.593f, 202.341f, 215.08801f);
generalPath.curveTo(202.645f, 215.58302f, 202.793f, 216.14502f, 202.78601f, 216.77802f);
generalPath.curveTo(202.77602f, 217.57802f, 202.53401f, 218.24002f, 202.05801f, 218.75801f);
generalPath.curveTo(201.58202f, 219.27402f, 200.876f, 219.59302f, 199.93802f, 219.71802f);
generalPath.curveTo(200.40102f, 219.99602f, 200.78201f, 220.30002f, 201.07802f, 220.62802f);
generalPath.curveTo(201.37802f, 220.95802f, 201.78001f, 221.54102f, 202.28401f, 222.37802f);
generalPath.lineTo(203.56001f, 224.47803f);
generalPath.lineTo(200.99f, 224.44803f);
generalPath.lineTo(199.462f, 222.10403f);
generalPath.curveTo(198.92201f, 221.26703f, 198.548f, 220.74004f, 198.348f, 220.52403f);
generalPath.curveTo(198.17479f, 220.32224f, 197.9542f, 220.16658f, 197.70601f, 220.07103f);
generalPath.curveTo(197.48001f, 219.98703f, 197.12001f, 219.94102f, 196.626f, 219.93604f);
generalPath.lineTo(196.19101f, 219.93004f);
generalPath.lineTo(196.13802f, 224.39005f);
generalPath.lineTo(193.98802f, 224.36505f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 158, 58, 255)) : new Color(48, 158, 58, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(196.22f, 218.223f);
generalPath.lineTo(197.81f, 218.24301f);
generalPath.curveTo(198.842f, 218.255f, 199.486f, 218.21802f, 199.744f, 218.13301f);
generalPath.curveTo(200.001f, 218.04901f, 200.20401f, 217.90102f, 200.351f, 217.68901f);
generalPath.curveTo(200.49799f, 217.477f, 200.575f, 217.20901f, 200.581f, 216.889f);
generalPath.curveTo(200.584f, 216.529f, 200.491f, 216.23901f, 200.299f, 216.01901f);
generalPath.curveTo(200.11299f, 215.792f, 199.846f, 215.64702f, 199.499f, 215.585f);
generalPath.curveTo(199.32399f, 215.559f, 198.799f, 215.541f, 197.92899f, 215.53001f);
generalPath.lineTo(196.25198f, 215.51201f);
generalPath.lineTo(196.22198f, 218.22202f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(206.153f, 214.207f);
generalPath.lineTo(210.077f, 214.407f);
generalPath.curveTo(210.96199f, 214.452f, 211.63199f, 214.554f, 212.08899f, 214.714f);
generalPath.curveTo(212.702f, 214.93001f, 213.221f, 215.28401f, 213.64099f, 215.779f);
generalPath.curveTo(214.06299f, 216.27101f, 214.37099f, 216.865f, 214.57098f, 217.56201f);
generalPath.curveTo(214.76698f, 218.25401f, 214.84099f, 219.09901f, 214.79099f, 220.098f);
generalPath.curveTo(214.74698f, 220.97601f, 214.59898f, 221.72801f, 214.35098f, 222.35301f);
generalPath.curveTo(214.04398f, 223.11702f, 213.63399f, 223.725f, 213.11499f, 224.18102f);
generalPath.curveTo(212.72499f, 224.52602f, 212.208f, 224.78401f, 211.56499f, 224.95601f);
generalPath.curveTo(211.083f, 225.08301f, 210.44499f, 225.126f, 209.652f, 225.08601f);
generalPath.lineTo(205.614f, 224.88002f);
generalPath.lineTo(206.152f, 214.20502f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 158, 58, 255)) : new Color(48, 158, 58, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(208.213f, 216.11f);
generalPath.lineTo(207.857f, 223.182f);
generalPath.lineTo(209.45999f, 223.26201f);
generalPath.curveTo(210.06f, 223.29501f, 210.49399f, 223.28201f, 210.76299f, 223.22801f);
generalPath.curveTo(211.11499f, 223.158f, 211.41098f, 223.02402f, 211.64899f, 222.82802f);
generalPath.curveTo(211.89099f, 222.63002f, 212.096f, 222.29802f, 212.26399f, 221.82802f);
generalPath.curveTo(212.43399f, 221.35802f, 212.54f, 220.70802f, 212.58199f, 219.88301f);
generalPath.curveTo(212.62398f, 219.058f, 212.58199f, 218.419f, 212.45999f, 217.97002f);
generalPath.curveTo(212.338f, 217.52002f, 212.152f, 217.16702f, 211.90298f, 216.90501f);
generalPath.curveTo(211.63799f, 216.63503f, 211.3032f, 216.44394f, 210.93599f, 216.35301f);
generalPath.curveTo(210.63899f, 216.26901f, 210.053f, 216.20502f, 209.178f, 216.16101f);
generalPath.lineTo(208.213f, 216.11101f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(258.478f, 233.293f);
generalPath.lineTo(260.964f, 222.9f);
generalPath.lineTo(264.319f, 223.70999f);
generalPath.curveTo(265.589f, 224.01498f, 266.405f, 224.267f, 266.766f, 224.465f);
generalPath.curveTo(267.322f, 224.763f, 267.736f, 225.22299f, 268.012f, 225.845f);
generalPath.curveTo(268.287f, 226.46f, 268.32498f, 227.182f, 268.128f, 228.009f);
generalPath.curveTo(267.97498f, 228.646f, 267.732f, 229.155f, 267.396f, 229.534f);
generalPath.curveTo(267.063f, 229.914f, 266.686f, 230.18399f, 266.268f, 230.34999f);
generalPath.curveTo(265.888f, 230.50577f, 265.48068f, 230.58395f, 265.07f, 230.57999f);
generalPath.curveTo(264.548f, 230.55798f, 263.81302f, 230.43298f, 262.867f, 230.20499f);
generalPath.lineTo(261.504f, 229.87498f);
generalPath.lineTo(260.566f, 233.79698f);
generalPath.lineTo(258.474f, 233.29298f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 158, 58, 255)) : new Color(48, 158, 58, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(262.64f, 225.16f);
generalPath.lineTo(261.933f, 228.11f);
generalPath.lineTo(263.07703f, 228.385f);
generalPath.curveTo(263.90204f, 228.583f, 264.46503f, 228.66199f, 264.76703f, 228.61899f);
generalPath.curveTo(265.07303f, 228.57599f, 265.32904f, 228.45898f, 265.54004f, 228.26498f);
generalPath.curveTo(265.75504f, 228.07199f, 265.90002f, 227.82199f, 265.97305f, 227.51498f);
generalPath.curveTo(266.06305f, 227.13498f, 266.02805f, 226.79799f, 265.86606f, 226.49898f);
generalPath.curveTo(265.70206f, 226.19897f, 265.45905f, 225.97897f, 265.13605f, 225.83598f);
generalPath.curveTo(264.89606f, 225.72798f, 264.40204f, 225.58398f, 263.64905f, 225.40198f);
generalPath.lineTo(262.63904f, 225.15797f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(268.373f, 236.257f);
generalPath.lineTo(271.91098f, 226.177f);
generalPath.lineTo(276.18097f, 227.687f);
generalPath.curveTo(277.25296f, 228.067f, 278.00098f, 228.433f, 278.41898f, 228.787f);
generalPath.curveTo(278.84497f, 229.14f, 279.12198f, 229.597f, 279.25198f, 230.16501f);
generalPath.curveTo(279.382f, 230.73302f, 279.34198f, 231.313f, 279.132f, 231.908f);
generalPath.curveTo(278.86798f, 232.66501f, 278.427f, 233.211f, 277.81f, 233.55f);
generalPath.curveTo(277.195f, 233.884f, 276.424f, 233.96f, 275.498f, 233.776f);
generalPath.curveTo(275.84598f, 234.188f, 276.10797f, 234.59601f, 276.283f, 235.004f);
generalPath.curveTo(276.465f, 235.414f, 276.658f, 236.096f, 276.86798f, 237.05f);
generalPath.lineTo(277.404f, 239.45f);
generalPath.lineTo(274.97998f, 238.593f);
generalPath.lineTo(274.28497f, 235.881f);
generalPath.curveTo(274.03998f, 234.914f, 273.85696f, 234.29599f, 273.735f, 234.025f);
generalPath.curveTo(273.63528f, 233.7787f, 273.47662f, 233.56065f, 273.27298f, 233.39f);
generalPath.curveTo(273.08597f, 233.235f, 272.75998f, 233.077f, 272.29297f, 232.91f);
generalPath.lineTo(271.88297f, 232.766f);
generalPath.lineTo(270.40598f, 236.97601f);
generalPath.lineTo(268.37897f, 236.25601f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 158, 58, 255)) : new Color(48, 158, 58, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(272.438f, 231.163f);
generalPath.lineTo(273.938f, 231.693f);
generalPath.curveTo(274.91098f, 232.03699f, 275.53098f, 232.211f, 275.802f, 232.213f);
generalPath.curveTo(276.072f, 232.216f, 276.312f, 232.14299f, 276.522f, 231.98799f);
generalPath.curveTo(276.729f, 231.836f, 276.885f, 231.60799f, 276.992f, 231.305f);
generalPath.curveTo(277.11002f, 230.965f, 277.115f, 230.65999f, 277.005f, 230.39f);
generalPath.curveTo(276.901f, 230.116f, 276.695f, 229.894f, 276.385f, 229.722f);
generalPath.curveTo(276.228f, 229.642f, 275.739f, 229.455f, 274.91702f, 229.165f);
generalPath.lineTo(273.33502f, 228.605f);
generalPath.lineTo(272.43802f, 231.163f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(280.88f, 235.87f);
generalPath.curveTo(281.203f, 234.83f, 281.63f, 234.00699f, 282.156f, 233.4f);
generalPath.curveTo(282.55002f, 232.95f, 283.006f, 232.583f, 283.534f, 232.295f);
generalPath.curveTo(284.028f, 232.01894f, 284.5731f, 231.84644f, 285.136f, 231.788f);
generalPath.curveTo(285.85397f, 231.71599f, 286.62598f, 231.81f, 287.45297f, 232.068f);
generalPath.curveTo(288.95096f, 232.538f, 290.00296f, 233.37799f, 290.61f, 234.592f);
generalPath.curveTo(291.222f, 235.806f, 291.27f, 237.245f, 290.754f, 238.90599f);
generalPath.curveTo(290.244f, 240.55399f, 289.396f, 241.704f, 288.214f, 242.35799f);
generalPath.curveTo(287.034f, 243.00798f, 285.698f, 243.09799f, 284.20398f, 242.62999f);
generalPath.curveTo(282.69397f, 242.15799f, 281.63397f, 241.31999f, 281.02997f, 240.118f);
generalPath.curveTo(280.42496f, 238.91f, 280.37598f, 237.495f, 280.87997f, 235.871f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 158, 58, 255)) : new Color(48, 158, 58, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.027f, 236.47f);
generalPath.curveTo(282.66702f, 237.62401f, 282.661f, 238.584f, 283.00702f, 239.35f);
generalPath.curveTo(283.355f, 240.11f, 283.937f, 240.617f, 284.75702f, 240.87401f);
generalPath.curveTo(285.574f, 241.12901f, 286.33502f, 241.044f, 287.04f, 240.61801f);
generalPath.curveTo(287.752f, 240.19002f, 288.29202f, 239.38301f, 288.66f, 238.20001f);
generalPath.curveTo(289.022f, 237.03001f, 289.036f, 236.07802f, 288.7f, 235.34001f);
generalPath.curveTo(288.372f, 234.60701f, 287.78302f, 234.10701f, 286.93802f, 233.84302f);
generalPath.curveTo(286.092f, 233.57802f, 285.32f, 233.65701f, 284.62103f, 234.08002f);
generalPath.curveTo(283.92404f, 234.49802f, 283.39304f, 235.29402f, 283.02805f, 236.47002f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(301.692f, 250.754f);
generalPath.lineTo(306.582f, 241.26f);
generalPath.lineTo(310.602f, 243.347f);
generalPath.curveTo(311.612f, 243.873f, 312.302f, 244.339f, 312.66898f, 244.749f);
generalPath.curveTo(313.03897f, 245.155f, 313.253f, 245.64899f, 313.30298f, 246.22899f);
generalPath.curveTo(313.35297f, 246.80899f, 313.23297f, 247.37599f, 312.94498f, 247.939f);
generalPath.curveTo(312.57797f, 248.649f, 312.06497f, 249.131f, 311.40698f, 249.379f);
generalPath.curveTo(310.75198f, 249.62599f, 309.97998f, 249.593f, 309.08698f, 249.283f);
generalPath.curveTo(309.37497f, 249.739f, 309.57697f, 250.183f, 309.69696f, 250.60901f);
generalPath.curveTo(309.81696f, 251.039f, 309.91696f, 251.74101f, 309.99197f, 252.716f);
generalPath.lineTo(310.192f, 255.166f);
generalPath.lineTo(307.909f, 253.982f);
generalPath.lineTo(307.593f, 251.2f);
generalPath.curveTo(307.483f, 250.207f, 307.387f, 249.56999f, 307.30298f, 249.286f);
generalPath.curveTo(307.23886f, 249.02765f, 307.11176f, 248.78922f, 306.93298f, 248.592f);
generalPath.curveTo(306.77f, 248.414f, 306.46698f, 248.21199f, 306.029f, 247.982f);
generalPath.lineTo(305.642f, 247.782f);
generalPath.lineTo(303.602f, 251.745f);
generalPath.lineTo(301.692f, 250.75499f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 158, 58, 255)) : new Color(48, 158, 58, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(306.418f, 246.26f);
generalPath.lineTo(307.83f, 246.993f);
generalPath.curveTo(308.74597f, 247.47f, 309.33798f, 247.72699f, 309.606f, 247.76799f);
generalPath.curveTo(309.873f, 247.80798f, 310.12198f, 247.76799f, 310.349f, 247.64499f);
generalPath.curveTo(310.575f, 247.52199f, 310.759f, 247.318f, 310.909f, 247.03198f);
generalPath.curveTo(311.073f, 246.71198f, 311.119f, 246.41199f, 311.047f, 246.12898f);
generalPath.curveTo(310.982f, 245.84198f, 310.807f, 245.59198f, 310.525f, 245.37898f);
generalPath.curveTo(310.38098f, 245.27898f, 309.922f, 245.02599f, 309.147f, 244.62398f);
generalPath.lineTo(307.659f, 243.84998f);
generalPath.lineTo(306.417f, 246.25998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint1(Graphics2D g,float origAlpha) {
generalPath.moveTo(341.19f, 270.26f);
generalPath.curveTo(341.797f, 269.36002f, 342.44f, 268.69302f, 343.12302f, 268.264f);
generalPath.curveTo(343.6253f, 267.95f, 344.17917f, 267.72723f, 344.759f, 267.60602f);
generalPath.curveTo(345.31122f, 267.48572f, 345.8821f, 267.4789f, 346.437f, 267.58603f);
generalPath.curveTo(347.14502f, 267.72604f, 347.85703f, 268.03903f, 348.575f, 268.52603f);
generalPath.curveTo(349.875f, 269.40903f, 350.64f, 270.51904f, 350.87302f, 271.85602f);
generalPath.curveTo(351.11002f, 273.196f, 350.743f, 274.58603f, 349.77002f, 276.028f);
generalPath.curveTo(348.808f, 277.45602f, 347.66803f, 278.31403f, 346.35f, 278.59802f);
generalPath.curveTo(345.032f, 278.87604f, 343.72702f, 278.57602f, 342.43f, 277.69803f);
generalPath.curveTo(341.12f, 276.80603f, 340.347f, 275.69803f, 340.113f, 274.37103f);
generalPath.curveTo(339.881f, 273.04105f, 340.24002f, 271.67102f, 341.19f, 270.26105f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 158, 58, 255)) : new Color(48, 158, 58, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(343.073f, 271.443f);
generalPath.curveTo(342.398f, 272.44598f, 342.115f, 273.363f, 342.226f, 274.195f);
generalPath.curveTo(342.341f, 275.025f, 342.752f, 275.678f, 343.461f, 276.161f);
generalPath.curveTo(344.173f, 276.644f, 344.926f, 276.78302f, 345.724f, 276.58102f);
generalPath.curveTo(346.529f, 276.37503f, 347.277f, 275.76102f, 347.969f, 274.73303f);
generalPath.curveTo(348.652f, 273.71902f, 348.939f, 272.81003f, 348.82898f, 272.00903f);
generalPath.curveTo(348.72498f, 271.20905f, 348.30597f, 270.56204f, 347.572f, 270.06302f);
generalPath.curveTo(346.838f, 269.564f, 346.077f, 269.41602f, 345.287f, 269.61902f);
generalPath.curveTo(344.49698f, 269.81702f, 343.762f, 270.42603f, 343.07498f, 271.44403f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(246.427f, 228.95f);
generalPath.lineTo(248.141f, 221.446f);
generalPath.lineTo(253.684f, 222.724f);
generalPath.lineTo(253.39601f, 223.991f);
generalPath.lineTo(249.36401f, 223.064f);
generalPath.lineTo(248.98001f, 224.72699f);
generalPath.lineTo(252.73401f, 225.59299f);
generalPath.lineTo(252.44402f, 226.85498f);
generalPath.lineTo(248.69402f, 225.99197f);
generalPath.lineTo(248.22401f, 228.03398f);
generalPath.lineTo(252.40001f, 228.99599f);
generalPath.lineTo(252.11201f, 230.26099f);
generalPath.lineTo(246.42702f, 228.95099f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 158, 58, 255)) : new Color(48, 158, 58, 255);
g.setPaint(paint);
g.fill(shape);
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
_paint1(g, origAlpha);


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
        return 0.0;
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
		return 512.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 512.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private br() {
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
    public static NeonIcon of(int width, int height) {
       br base = new br();
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       br base = new br();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return br::new;
    }
}

