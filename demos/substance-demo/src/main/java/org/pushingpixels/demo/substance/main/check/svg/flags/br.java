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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class br implements ResizableIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
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
generalPath.moveTo(0.0, 0.0);
generalPath.lineTo(512.0, 0.0);
generalPath.lineTo(512.0, 512.0);
generalPath.lineTo(0.0, 512.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(34, 158, 69, 255);
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
generalPath.moveTo(261.358, 405.394);
generalPath.lineTo(491.23, 256.2);
generalPath.lineTo(259.967, 106.605);
generalPath.lineTo(29.34, 256.56);
generalPath.lineTo(261.358, 405.39398);
generalPath.closePath();
shape = generalPath;
paint = new Color(248, 229, 9, 255);
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
generalPath.moveTo(361.52, 256.004);
generalPath.curveTo(361.52, 309.626, 317.97998, 353.097, 264.27, 353.097);
generalPath.curveTo(210.56, 353.097, 167.02199, 309.62698, 167.02199, 256.00397);
generalPath.curveTo(167.02199, 202.38095, 210.56198, 158.91096, 264.27197, 158.91096);
generalPath.curveTo(317.98196, 158.91096, 361.51996, 202.38097, 361.51996, 256.00497);
generalPath.closePath();
shape = generalPath;
paint = new Color(43, 73, 163, 255);
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
generalPath.moveTo(232.302, 314.156);
generalPath.lineTo(229.298, 312.422);
generalPath.lineTo(226.17801, 313.966);
generalPath.lineTo(226.876, 310.49802);
generalPath.lineTo(224.466, 307.95602);
generalPath.lineTo(227.912, 307.553);
generalPath.lineTo(229.532, 304.44302);
generalPath.lineTo(230.97499, 307.65903);
generalPath.lineTo(234.37498, 308.27603);
generalPath.lineTo(231.82498, 310.66302);
generalPath.moveTo(297.473, 330.65802);
generalPath.lineTo(294.468, 328.924);
generalPath.lineTo(291.348, 330.46802);
generalPath.lineTo(292.046, 327.00003);
generalPath.lineTo(289.636, 324.46002);
generalPath.lineTo(293.082, 324.05502);
generalPath.lineTo(294.702, 320.94504);
generalPath.lineTo(296.145, 324.16205);
generalPath.lineTo(299.54498, 324.77905);
generalPath.lineTo(296.995, 327.16605);
generalPath.moveTo(269.382, 304.29706);
generalPath.lineTo(266.787, 302.79907);
generalPath.lineTo(264.09097, 304.13208);
generalPath.lineTo(264.69498, 301.13608);
generalPath.lineTo(262.61298, 298.94006);
generalPath.lineTo(265.59097, 298.59207);
generalPath.lineTo(266.98898, 295.90506);
generalPath.lineTo(268.23697, 298.68506);
generalPath.lineTo(271.17398, 299.21805);
generalPath.lineTo(268.97098, 301.28006);
generalPath.moveTo(335.20197, 294.81805);
generalPath.lineTo(332.65198, 293.34805);
generalPath.lineTo(330.00598, 294.65805);
generalPath.lineTo(330.59897, 291.71506);
generalPath.lineTo(328.55298, 289.55905);
generalPath.lineTo(331.477, 289.21606);
generalPath.lineTo(332.84998, 286.57806);
generalPath.lineTo(334.076, 289.30606);
generalPath.lineTo(336.96, 289.82907);
generalPath.lineTo(334.797, 291.85507);
generalPath.moveTo(268.193, 275.08508);
generalPath.lineTo(265.188, 273.35107);
generalPath.lineTo(262.068, 274.8961);
generalPath.lineTo(262.766, 271.4281);
generalPath.lineTo(260.356, 268.8861);
generalPath.lineTo(263.80298, 268.48212);
generalPath.lineTo(265.421, 265.37213);
generalPath.lineTo(266.866, 268.59012);
generalPath.lineTo(270.266, 269.20813);
generalPath.lineTo(267.716, 271.59512);
generalPath.moveTo(187.95, 244.96);
generalPath.lineTo(184.94499, 243.225);
generalPath.lineTo(181.825, 244.76901);
generalPath.lineTo(182.523, 241.29901);
generalPath.lineTo(180.11299, 238.75902);
generalPath.lineTo(183.56, 238.35501);
generalPath.lineTo(185.178, 235.24501);
generalPath.lineTo(186.622, 238.46101);
generalPath.lineTo(190.02199, 239.07901);
generalPath.lineTo(187.47198, 241.466);
generalPath.moveTo(197.59999, 285.034);
generalPath.lineTo(194.59499, 283.3);
generalPath.lineTo(191.47499, 284.844);
generalPath.lineTo(192.17299, 281.376);
generalPath.lineTo(189.76299, 278.834);
generalPath.lineTo(193.20999, 278.431);
generalPath.lineTo(194.82799, 275.321);
generalPath.lineTo(196.27199, 278.539);
generalPath.lineTo(199.67198, 279.156);
generalPath.lineTo(197.12198, 281.543);
generalPath.moveTo(297.73398, 230.206);
generalPath.lineTo(295.08, 228.676);
generalPath.lineTo(292.323, 230.039);
generalPath.lineTo(292.94, 226.974);
generalPath.lineTo(290.81, 224.729);
generalPath.lineTo(293.856, 224.37201);
generalPath.lineTo(295.28598, 221.62401);
generalPath.lineTo(296.56097, 224.46701);
generalPath.lineTo(299.56598, 225.01201);
generalPath.lineTo(297.313, 227.12201);
generalPath.moveTo(292.22998, 256.28);
generalPath.lineTo(290.13998, 255.072);
generalPath.lineTo(287.96997, 256.146);
generalPath.lineTo(288.45496, 253.734);
generalPath.lineTo(286.77795, 251.96399);
generalPath.lineTo(289.17596, 251.68399);
generalPath.lineTo(290.30197, 249.51999);
generalPath.lineTo(291.30698, 251.76);
generalPath.lineTo(293.67297, 252.18799);
generalPath.lineTo(291.89798, 253.84799);
generalPath.moveTo(183.47699, 292.296);
generalPath.lineTo(181.471, 291.138);
generalPath.lineTo(179.388, 292.168);
generalPath.lineTo(179.855, 289.854);
generalPath.lineTo(178.245, 288.157);
generalPath.lineTo(180.547, 287.88702);
generalPath.lineTo(181.627, 285.81003);
generalPath.lineTo(182.591, 287.95804);
generalPath.lineTo(184.86101, 288.37103);
generalPath.lineTo(183.15901, 289.96603);
generalPath.moveTo(335.758, 301.52704);
generalPath.lineTo(334.124, 300.66104);
generalPath.lineTo(332.426, 301.43304);
generalPath.lineTo(332.806, 299.70105);
generalPath.lineTo(331.496, 298.43106);
generalPath.lineTo(333.37, 298.23105);
generalPath.lineTo(334.25, 296.67606);
generalPath.lineTo(335.036, 298.28305);
generalPath.lineTo(336.88602, 298.59305);
generalPath.lineTo(335.49902, 299.78305);
shape = generalPath;
paint = new Color(255, 255, 239, 255);
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
generalPath.moveTo(183.477, 292.296);
generalPath.lineTo(181.47101, 291.138);
generalPath.lineTo(179.38802, 292.168);
generalPath.lineTo(179.85501, 289.854);
generalPath.lineTo(178.24501, 288.157);
generalPath.lineTo(180.54701, 287.88702);
generalPath.lineTo(181.62701, 285.81003);
generalPath.lineTo(182.59102, 287.95804);
generalPath.lineTo(184.86102, 288.37103);
generalPath.lineTo(183.15903, 289.96603);
shape = generalPath;
paint = new Color(255, 255, 239, 255);
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
generalPath.moveTo(183.477, 292.296);
generalPath.lineTo(181.47101, 291.138);
generalPath.lineTo(179.38802, 292.168);
generalPath.lineTo(179.85501, 289.854);
generalPath.lineTo(178.24501, 288.157);
generalPath.lineTo(180.54701, 287.88702);
generalPath.lineTo(181.62701, 285.81003);
generalPath.lineTo(182.59102, 287.95804);
generalPath.lineTo(184.86102, 288.37103);
generalPath.lineTo(183.15903, 289.96603);
generalPath.moveTo(215.41003, 292.28802);
generalPath.lineTo(213.40303, 291.131);
generalPath.lineTo(211.32004, 292.161);
generalPath.lineTo(211.78604, 289.84702);
generalPath.lineTo(210.17604, 288.15002);
generalPath.lineTo(212.47804, 287.88004);
generalPath.lineTo(213.55804, 285.80304);
generalPath.lineTo(214.52304, 287.95105);
generalPath.lineTo(216.79305, 288.36404);
generalPath.lineTo(215.09004, 289.95804);
generalPath.moveTo(211.44005, 302.91003);
generalPath.lineTo(209.43605, 301.75302);
generalPath.lineTo(207.35205, 302.78302);
generalPath.lineTo(207.81805, 300.46902);
generalPath.lineTo(206.20805, 298.77103);
generalPath.lineTo(208.51006, 298.50104);
generalPath.lineTo(209.59006, 296.42404);
generalPath.lineTo(210.55505, 298.57205);
generalPath.lineTo(212.82506, 298.98505);
generalPath.lineTo(211.12306, 300.57904);
generalPath.moveTo(277.74805, 283.57303);
generalPath.lineTo(275.74203, 282.41602);
generalPath.lineTo(273.65903, 283.446);
generalPath.lineTo(274.12402, 281.131);
generalPath.lineTo(272.51404, 279.435);
generalPath.lineTo(274.81604, 279.165);
generalPath.lineTo(275.89603, 277.08902);
generalPath.lineTo(276.86102, 279.23703);
generalPath.lineTo(279.131, 279.64902);
generalPath.lineTo(277.428, 281.243);
generalPath.moveTo(258.29, 283.566);
generalPath.lineTo(256.285, 282.40802);
generalPath.lineTo(254.20201, 283.43802);
generalPath.lineTo(254.66801, 281.12402);
generalPath.lineTo(253.05801, 279.42703);
generalPath.lineTo(255.36002, 279.15704);
generalPath.lineTo(256.44, 277.08005);
generalPath.lineTo(257.405, 279.23004);
generalPath.lineTo(259.675, 279.64005);
generalPath.lineTo(257.972, 281.23505);
generalPath.moveTo(205.51498, 276.78305);
generalPath.lineTo(204.25798, 276.05704);
generalPath.lineTo(202.95299, 276.70303);
generalPath.lineTo(203.245, 275.25302);
generalPath.lineTo(202.237, 274.18903);
generalPath.lineTo(203.679, 274.019);
generalPath.lineTo(204.355, 272.71902);
generalPath.lineTo(204.959, 274.06403);
generalPath.lineTo(206.382, 274.32202);
generalPath.lineTo(205.315, 275.32202);
generalPath.moveTo(333.285, 309.928);
generalPath.lineTo(331.28, 308.77002);
generalPath.lineTo(329.19598, 309.80002);
generalPath.lineTo(329.662, 307.48502);
generalPath.lineTo(328.052, 305.78802);
generalPath.lineTo(330.354, 305.51804);
generalPath.lineTo(331.434, 303.44205);
generalPath.lineTo(332.399, 305.59006);
generalPath.lineTo(334.66898, 306.00305);
generalPath.lineTo(332.96597, 307.59604);
generalPath.moveTo(317.08298, 312.05005);
generalPath.lineTo(315.421, 311.09006);
generalPath.lineTo(313.697, 311.94507);
generalPath.lineTo(314.08298, 310.02206);
generalPath.lineTo(312.74997, 308.61206);
generalPath.lineTo(314.65497, 308.38907);
generalPath.lineTo(315.54996, 306.66406);
generalPath.lineTo(316.34995, 308.44705);
generalPath.lineTo(318.22995, 308.79004);
generalPath.lineTo(316.81995, 310.11404);
generalPath.moveTo(324.72696, 311.86606);
generalPath.lineTo(323.17896, 310.97205);
generalPath.lineTo(321.57095, 311.76804);
generalPath.lineTo(321.93094, 309.98004);
generalPath.lineTo(320.68893, 308.67004);
generalPath.lineTo(322.46393, 308.46005);
generalPath.lineTo(323.29794, 306.85706);
generalPath.lineTo(324.04095, 308.51706);
generalPath.lineTo(325.79095, 308.83505);
generalPath.lineTo(324.47894, 310.06506);
generalPath.moveTo(346.67593, 292.71207);
generalPath.lineTo(345.18594, 291.85208);
generalPath.lineTo(343.63596, 292.61807);
generalPath.lineTo(343.98294, 290.89807);
generalPath.lineTo(342.78693, 289.63608);
generalPath.lineTo(344.49692, 289.43607);
generalPath.lineTo(345.3009, 287.89307);
generalPath.lineTo(346.0179, 289.48907);
generalPath.lineTo(347.70493, 289.79407);
generalPath.lineTo(346.4399, 290.97906);
generalPath.moveTo(316.88992, 322.86008);
generalPath.lineTo(314.9439, 321.7971);
generalPath.lineTo(312.9219, 322.74408);
generalPath.lineTo(313.3749, 320.61807);
generalPath.lineTo(311.8129, 319.06107);
generalPath.lineTo(314.0459, 318.81506);
generalPath.lineTo(315.0959, 316.90906);
generalPath.lineTo(316.03088, 318.87906);
generalPath.lineTo(318.2349, 319.25906);
generalPath.lineTo(316.58188, 320.72107);
generalPath.moveTo(316.99988, 331.58206);
generalPath.lineTo(315.22488, 330.52005);
generalPath.lineTo(313.3809, 331.46606);
generalPath.lineTo(313.7949, 329.34106);
generalPath.lineTo(312.3699, 327.78406);
generalPath.lineTo(314.4059, 327.53705);
generalPath.lineTo(315.3629, 325.63104);
generalPath.lineTo(316.2159, 327.60104);
generalPath.lineTo(318.22592, 327.98105);
generalPath.lineTo(316.71793, 329.44406);
generalPath.moveTo(302.28592, 311.86307);
generalPath.lineTo(300.79593, 311.00308);
generalPath.lineTo(299.24594, 311.7681);
generalPath.lineTo(299.59293, 310.0481);
generalPath.lineTo(298.39792, 308.7881);
generalPath.lineTo(300.1079, 308.5861);
generalPath.lineTo(300.91092, 307.0431);
generalPath.lineTo(301.62793, 308.6391);
generalPath.lineTo(303.31494, 308.9451);
generalPath.lineTo(302.04993, 310.1291);
generalPath.moveTo(288.48993, 311.8631);
generalPath.lineTo(286.99994, 311.0031);
generalPath.lineTo(285.45294, 311.76813);
generalPath.lineTo(285.79895, 310.04813);
generalPath.lineTo(284.60196, 308.78812);
generalPath.lineTo(286.31195, 308.58612);
generalPath.lineTo(287.11496, 307.04312);
generalPath.lineTo(287.83197, 308.63913);
generalPath.lineTo(289.51898, 308.94513);
generalPath.lineTo(288.25397, 310.12912);
generalPath.moveTo(265.07, 291.38);
generalPath.lineTo(263.578, 290.52002);
generalPath.lineTo(262.03, 291.286);
generalPath.lineTo(262.37698, 289.566);
generalPath.lineTo(261.18097, 288.306);
generalPath.lineTo(262.89096, 288.106);
generalPath.lineTo(263.69495, 286.56097);
generalPath.lineTo(264.41095, 288.15897);
generalPath.lineTo(266.09796, 288.46497);
generalPath.lineTo(264.83295, 289.64896);
generalPath.moveTo(267.67993, 333.12595);
generalPath.lineTo(266.41592, 332.39594);
generalPath.lineTo(265.10593, 333.04593);
generalPath.lineTo(265.39893, 331.58893);
generalPath.lineTo(264.38492, 330.51892);
generalPath.lineTo(265.83292, 330.3489);
generalPath.lineTo(266.5129, 329.0429);
generalPath.lineTo(267.1199, 330.3949);
generalPath.lineTo(268.5499, 330.6549);
generalPath.lineTo(267.4779, 331.65692);
generalPath.moveTo(232.30191, 265.60492);
generalPath.lineTo(229.29791, 263.8709);
generalPath.lineTo(226.17792, 265.41592);
generalPath.lineTo(226.87592, 261.94794);
generalPath.lineTo(224.46591, 259.40594);
generalPath.lineTo(227.91191, 259.00195);
generalPath.lineTo(229.5319, 255.89195);
generalPath.lineTo(230.9749, 259.10995);
generalPath.lineTo(234.3749, 259.72797);
generalPath.lineTo(231.82489, 262.11496);
shape = generalPath;
paint = new Color(255, 255, 239, 255);
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
generalPath.moveTo(355.113, 290.934);
generalPath.curveTo(356.595, 287.05798, 358.50702, 281.214, 359.523, 275.848);
generalPath.curveTo(307.87, 230.47299, 250.29001, 207.23, 177.533, 212.012);
generalPath.curveTo(174.92601, 217.012, 172.838, 222.24799, 171.07701, 227.91199);
generalPath.curveTo(257.284, 219.689, 320.47302, 257.85498, 355.115, 290.934);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(331.893, 265.425);
generalPath.lineTo(333.738, 266.43298);
generalPath.curveTo(333.448, 267.08698, 333.371, 267.659, 333.502, 268.14697);
generalPath.curveTo(333.639, 268.63998, 333.97803, 269.06897, 334.519, 269.43497);
generalPath.curveTo(335.092, 269.82697, 335.605, 269.99896, 336.056, 269.95297);
generalPath.curveTo(336.513, 269.90698, 336.853, 269.71997, 337.074, 269.39297);
generalPath.curveTo(337.21402, 269.18298, 337.27002, 268.96298, 337.24402, 268.735);
generalPath.curveTo(337.22403, 268.50497, 337.09802, 268.232, 336.867, 267.91498);
generalPath.curveTo(336.707, 267.70197, 336.319, 267.24997, 335.702, 266.56097);
generalPath.curveTo(334.908, 265.67697, 334.435, 264.93097, 334.28198, 264.32098);
generalPath.curveTo(334.06998, 263.46698, 334.19897, 262.69098, 334.672, 261.98898);
generalPath.curveTo(334.97598, 261.53897, 335.385, 261.20297, 335.9, 260.98398);
generalPath.curveTo(336.42398, 260.76398, 336.995, 260.714, 337.61, 260.83398);
generalPath.curveTo(338.228, 260.95398, 338.878, 261.244, 339.554, 261.70398);
generalPath.curveTo(340.66098, 262.45697, 341.33, 263.266, 341.55798, 264.13098);
generalPath.curveTo(341.791, 265.00098, 341.64798, 265.85098, 341.128, 266.68097);
generalPath.lineTo(339.29498, 265.55096);
generalPath.curveTo(339.525, 265.04398, 339.581, 264.60696, 339.46097, 264.23798);
generalPath.curveTo(339.35098, 263.86798, 339.04297, 263.51297, 338.54095, 263.17197);
generalPath.curveTo(338.02396, 262.82196, 337.54697, 262.65396, 337.11096, 262.66797);
generalPath.curveTo(336.84634, 262.6677, 336.59985, 262.80225, 336.45697, 263.02496);
generalPath.curveTo(336.31647, 263.23682, 336.28036, 263.50122, 336.35898, 263.74295);
generalPath.curveTo(336.45697, 264.08594, 336.869, 264.65295, 337.59897, 265.44696);
generalPath.curveTo(338.32498, 266.23996, 338.82095, 266.88696, 339.08496, 267.38995);
generalPath.curveTo(339.35495, 267.88995, 339.47797, 268.40994, 339.45197, 268.95197);
generalPath.curveTo(339.43497, 269.48996, 339.23596, 270.03897, 338.85995, 270.59897);
generalPath.curveTo(338.52032, 271.10434, 338.04077, 271.4998, 337.47995, 271.73697);
generalPath.curveTo(336.89996, 271.98898, 336.27994, 272.05096, 335.61996, 271.91898);
generalPath.curveTo(334.96295, 271.78497, 334.25195, 271.45697, 333.48697, 270.93597);
generalPath.curveTo(332.37198, 270.17996, 331.68698, 269.33997, 331.43698, 268.41898);
generalPath.curveTo(331.192, 267.49496, 331.343, 266.49597, 331.895, 265.42697);
generalPath.closePath();
generalPath.moveTo(323.14, 259.68);
generalPath.lineTo(325.026, 260.61);
generalPath.curveTo(324.763, 261.275, 324.708, 261.84998, 324.859, 262.33298);
generalPath.curveTo(325.01602, 262.81897, 325.36902, 263.236, 325.92502, 263.58);
generalPath.curveTo(326.515, 263.948, 327.03302, 264.09998, 327.48203, 264.03497);
generalPath.curveTo(327.93903, 263.96896, 328.27203, 263.77097, 328.47702, 263.43497);
generalPath.curveTo(328.60532, 263.23895, 328.65726, 263.00272, 328.62302, 262.77097);
generalPath.curveTo(328.59302, 262.54297, 328.45602, 262.27396, 328.21103, 261.96597);
generalPath.curveTo(328.04404, 261.75897, 327.63904, 261.32596, 326.99304, 260.65997);
generalPath.curveTo(326.16504, 259.80698, 325.66306, 259.08, 325.48505, 258.47998);
generalPath.curveTo(325.23904, 257.632, 325.33704, 256.84998, 325.77805, 256.132);
generalPath.curveTo(326.06268, 255.67249, 326.47568, 255.30643, 326.96603, 255.079);
generalPath.curveTo(327.48105, 254.83899, 328.04904, 254.763, 328.66803, 254.857);
generalPath.curveTo(329.29102, 254.954, 329.95203, 255.217, 330.64603, 255.651);
generalPath.curveTo(331.78403, 256.356, 332.48303, 257.138, 332.74603, 257.994);
generalPath.curveTo(333.01303, 258.85397, 332.90604, 259.707, 332.42004, 260.56);
generalPath.lineTo(330.54004, 259.504);
generalPath.curveTo(330.75003, 258.99, 330.79004, 258.55, 330.65503, 258.187);
generalPath.curveTo(330.52704, 257.821, 330.20502, 257.479, 329.69202, 257.159);
generalPath.curveTo(329.16, 256.827, 328.677, 256.679, 328.242, 256.711);
generalPath.curveTo(327.97763, 256.72137, 327.73694, 256.86624, 327.604, 257.095);
generalPath.curveTo(327.47202, 257.31, 327.448, 257.548, 327.534, 257.815);
generalPath.curveTo(327.646, 258.153, 328.08, 258.703, 328.84, 259.46802);
generalPath.curveTo(329.597, 260.22803, 330.12, 260.85602, 330.40298, 261.346);
generalPath.curveTo(330.693, 261.836, 330.83698, 262.351, 330.83298, 262.892);
generalPath.curveTo(330.83798, 263.432, 330.65997, 263.988, 330.30798, 264.564);
generalPath.curveTo(329.986, 265.08398, 329.538, 265.481, 328.972, 265.757);
generalPath.curveTo(328.404, 266.03198, 327.78598, 266.11697, 327.12198, 266.013);
generalPath.curveTo(326.46198, 265.905, 325.73798, 265.603, 324.95197, 265.116);
generalPath.curveTo(323.80795, 264.40298, 323.09198, 263.593, 322.80396, 262.682);
generalPath.curveTo(322.51895, 261.768, 322.62994, 260.76602, 323.13895, 259.676);
generalPath.closePath();
generalPath.moveTo(312.31003, 256.77698);
generalPath.lineTo(317.85703, 247.65398);
generalPath.lineTo(324.59503, 251.78398);
generalPath.lineTo(323.65503, 253.32799);
generalPath.lineTo(318.75504, 250.32199);
generalPath.lineTo(317.52304, 252.344);
generalPath.lineTo(322.08505, 255.14099);
generalPath.lineTo(321.15005, 256.67798);
generalPath.lineTo(316.58804, 253.88298);
generalPath.lineTo(315.07803, 256.36597);
generalPath.lineTo(320.15503, 259.47595);
generalPath.lineTo(319.21902, 261.01596);
generalPath.lineTo(312.30902, 256.77795);
generalPath.closePath();
generalPath.moveTo(296.53204, 243.81998);
generalPath.lineTo(297.35504, 242.21997);
generalPath.lineTo(301.47305, 244.34998);
generalPath.lineTo(299.53305, 248.13498);
generalPath.curveTo(298.93005, 248.31699, 298.17307, 248.35999, 297.25806, 248.26498);
generalPath.curveTo(296.35104, 248.16498, 295.50806, 247.91498, 294.72806, 247.51198);
generalPath.curveTo(293.73807, 246.99998, 292.98206, 246.34898, 292.46005, 245.55197);
generalPath.curveTo(291.94006, 244.75197, 291.69006, 243.87198, 291.71704, 242.90497);
generalPath.curveTo(291.74704, 241.93497, 291.99405, 240.99496, 292.46204, 240.08296);
generalPath.curveTo(292.96902, 239.09296, 293.62903, 238.32297, 294.43805, 237.76596);
generalPath.curveTo(295.24304, 237.21097, 296.15204, 236.93596, 297.15805, 236.93596);
generalPath.curveTo(297.92804, 236.93196, 298.76306, 237.16795, 299.66806, 237.63196);
generalPath.curveTo(300.84305, 238.24196, 301.63306, 238.96396, 302.03406, 239.80196);
generalPath.curveTo(302.44406, 240.63795, 302.52005, 241.53996, 302.26105, 242.51196);
generalPath.lineTo(300.18106, 241.88596);
generalPath.curveTo(300.29276, 241.38164, 300.2256, 240.85417, 299.99106, 240.39395);
generalPath.curveTo(299.76605, 239.93195, 299.37704, 239.55894, 298.82806, 239.27396);
generalPath.curveTo(297.99106, 238.84096, 297.19107, 238.76396, 296.42206, 239.04095);
generalPath.curveTo(295.66006, 239.31895, 295.01205, 239.97896, 294.47507, 241.02495);
generalPath.curveTo(293.89508, 242.15295, 293.70908, 243.12895, 293.91806, 243.95494);
generalPath.curveTo(294.13007, 244.77194, 294.63806, 245.39194, 295.45007, 245.81194);
generalPath.curveTo(295.85007, 246.01894, 296.29007, 246.14793, 296.77008, 246.19893);
generalPath.curveTo(297.25607, 246.24893, 297.70007, 246.23593, 298.10507, 246.16093);
generalPath.lineTo(298.72507, 244.95393);
generalPath.lineTo(296.53506, 243.82193);
generalPath.closePath();
generalPath.moveTo(227.72504, 226.75798);
generalPath.lineTo(229.27504, 216.18398);
generalPath.lineTo(232.45705, 216.65398);
generalPath.lineTo(233.31305, 224.14798);
generalPath.lineTo(236.25705, 217.21498);
generalPath.lineTo(239.44905, 217.68498);
generalPath.lineTo(237.89905, 228.26099);
generalPath.lineTo(235.92305, 227.971);
generalPath.lineTo(237.14505, 219.646);
generalPath.lineTo(233.83305, 227.661);
generalPath.lineTo(231.78606, 227.358);
generalPath.lineTo(230.92105, 218.726);
generalPath.lineTo(229.70105, 227.049);
generalPath.lineTo(227.72404, 226.759);
generalPath.closePath();
generalPath.moveTo(216.96803, 225.50798);
generalPath.lineTo(217.96303, 214.86398);
generalPath.lineTo(225.82303, 215.60698);
generalPath.lineTo(225.65703, 217.40698);
generalPath.lineTo(219.93703, 216.86699);
generalPath.lineTo(219.71402, 219.22699);
generalPath.lineTo(225.03403, 219.72899);
generalPath.lineTo(224.86803, 221.52199);
generalPath.lineTo(219.54602, 221.01999);
generalPath.lineTo(219.27602, 223.91699);
generalPath.lineTo(225.19601, 224.474);
generalPath.lineTo(225.03001, 226.269);
generalPath.lineTo(216.96802, 225.509);
generalPath.closePath();
shape = generalPath;
paint = new Color(48, 158, 58, 255);
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
generalPath.moveTo(181.37, 218.85);
generalPath.curveTo(181.4, 217.763, 181.586, 216.85301, 181.93, 216.12401);
generalPath.curveTo(182.187, 215.58601, 182.53, 215.10701, 182.95699, 214.686);
generalPath.curveTo(183.38899, 214.266, 183.85698, 213.95601, 184.36398, 213.76201);
generalPath.curveTo(185.03398, 213.49901, 185.80399, 213.378, 186.66798, 213.40201);
generalPath.curveTo(188.23799, 213.445, 189.47798, 213.96701, 190.38799, 214.96901);
generalPath.curveTo(191.30798, 215.97101, 191.74199, 217.34201, 191.69499, 219.08101);
generalPath.curveTo(191.648, 220.80501, 191.14499, 222.14401, 190.183, 223.095);
generalPath.curveTo(189.22299, 224.041, 187.961, 224.493, 186.399, 224.45);
generalPath.curveTo(184.814, 224.40799, 183.569, 223.89, 182.662, 222.898);
generalPath.curveTo(181.754, 221.9, 181.322, 220.551, 181.37, 218.851);
generalPath.closePath();
shape = generalPath;
paint = new Color(48, 158, 58, 255);
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
generalPath.moveTo(183.592, 218.83);
generalPath.curveTo(183.55899, 220.04001, 183.812, 220.967, 184.35199, 221.608);
generalPath.curveTo(184.89198, 222.246, 185.59, 222.576, 186.44699, 222.598);
generalPath.curveTo(187.303, 222.623, 188.01399, 222.33301, 188.577, 221.73201);
generalPath.curveTo(189.14499, 221.12401, 189.44699, 220.20201, 189.48, 218.962);
generalPath.curveTo(189.513, 217.738, 189.26999, 216.817, 188.75, 216.20001);
generalPath.curveTo(188.232, 215.58301, 187.532, 215.26302, 186.646, 215.238);
generalPath.curveTo(185.761, 215.214, 185.039, 215.501, 184.47899, 216.098);
generalPath.curveTo(183.91899, 216.69101, 183.62299, 217.602, 183.59099, 218.83101);
generalPath.closePath();
shape = generalPath;
paint = new Color(247, 255, 255, 255);
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
generalPath.moveTo(193.99, 224.365);
generalPath.lineTo(194.115, 213.677);
generalPath.lineTo(198.639, 213.731);
generalPath.curveTo(199.776, 213.746, 200.59901, 213.851, 201.11101, 214.05301);
generalPath.curveTo(201.62701, 214.24802, 202.037, 214.593, 202.341, 215.08801);
generalPath.curveTo(202.645, 215.58302, 202.793, 216.14502, 202.78601, 216.77802);
generalPath.curveTo(202.77602, 217.57802, 202.53401, 218.24002, 202.05801, 218.75801);
generalPath.curveTo(201.58202, 219.27402, 200.876, 219.59302, 199.93802, 219.71802);
generalPath.curveTo(200.40102, 219.99602, 200.78201, 220.30002, 201.07802, 220.62802);
generalPath.curveTo(201.37802, 220.95802, 201.78001, 221.54102, 202.28401, 222.37802);
generalPath.lineTo(203.56001, 224.47803);
generalPath.lineTo(200.99, 224.44803);
generalPath.lineTo(199.462, 222.10403);
generalPath.curveTo(198.92201, 221.26703, 198.548, 220.74004, 198.348, 220.52403);
generalPath.curveTo(198.17479, 220.32224, 197.9542, 220.16658, 197.70601, 220.07103);
generalPath.curveTo(197.48001, 219.98703, 197.12001, 219.94102, 196.626, 219.93604);
generalPath.lineTo(196.19101, 219.93004);
generalPath.lineTo(196.13802, 224.39005);
generalPath.lineTo(193.98802, 224.36505);
generalPath.closePath();
shape = generalPath;
paint = new Color(48, 158, 58, 255);
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
generalPath.moveTo(196.22, 218.223);
generalPath.lineTo(197.81, 218.24301);
generalPath.curveTo(198.842, 218.255, 199.486, 218.21802, 199.744, 218.13301);
generalPath.curveTo(200.001, 218.04901, 200.20401, 217.90102, 200.351, 217.68901);
generalPath.curveTo(200.49799, 217.477, 200.575, 217.20901, 200.581, 216.889);
generalPath.curveTo(200.584, 216.529, 200.491, 216.23901, 200.299, 216.01901);
generalPath.curveTo(200.11299, 215.792, 199.846, 215.64702, 199.499, 215.585);
generalPath.curveTo(199.32399, 215.559, 198.799, 215.541, 197.92899, 215.53001);
generalPath.lineTo(196.25198, 215.51201);
generalPath.lineTo(196.22198, 218.22202);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(206.153, 214.207);
generalPath.lineTo(210.077, 214.407);
generalPath.curveTo(210.96199, 214.452, 211.63199, 214.554, 212.08899, 214.714);
generalPath.curveTo(212.702, 214.93001, 213.221, 215.28401, 213.64099, 215.779);
generalPath.curveTo(214.06299, 216.27101, 214.37099, 216.865, 214.57098, 217.56201);
generalPath.curveTo(214.76698, 218.25401, 214.84099, 219.09901, 214.79099, 220.098);
generalPath.curveTo(214.74698, 220.97601, 214.59898, 221.72801, 214.35098, 222.35301);
generalPath.curveTo(214.04398, 223.11702, 213.63399, 223.725, 213.11499, 224.18102);
generalPath.curveTo(212.72499, 224.52602, 212.208, 224.78401, 211.56499, 224.95601);
generalPath.curveTo(211.083, 225.08301, 210.44499, 225.126, 209.652, 225.08601);
generalPath.lineTo(205.614, 224.88002);
generalPath.lineTo(206.152, 214.20502);
generalPath.closePath();
shape = generalPath;
paint = new Color(48, 158, 58, 255);
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
generalPath.moveTo(208.213, 216.11);
generalPath.lineTo(207.857, 223.182);
generalPath.lineTo(209.45999, 223.26201);
generalPath.curveTo(210.06, 223.29501, 210.49399, 223.28201, 210.76299, 223.22801);
generalPath.curveTo(211.11499, 223.158, 211.41098, 223.02402, 211.64899, 222.82802);
generalPath.curveTo(211.89099, 222.63002, 212.096, 222.29802, 212.26399, 221.82802);
generalPath.curveTo(212.43399, 221.35802, 212.54, 220.70802, 212.58199, 219.88301);
generalPath.curveTo(212.62398, 219.058, 212.58199, 218.419, 212.45999, 217.97002);
generalPath.curveTo(212.338, 217.52002, 212.152, 217.16702, 211.90298, 216.90501);
generalPath.curveTo(211.63799, 216.63503, 211.3032, 216.44394, 210.93599, 216.35301);
generalPath.curveTo(210.63899, 216.26901, 210.053, 216.20502, 209.178, 216.16101);
generalPath.lineTo(208.213, 216.11101);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(258.478, 233.293);
generalPath.lineTo(260.964, 222.9);
generalPath.lineTo(264.319, 223.70999);
generalPath.curveTo(265.589, 224.01498, 266.405, 224.267, 266.766, 224.465);
generalPath.curveTo(267.322, 224.763, 267.736, 225.22299, 268.012, 225.845);
generalPath.curveTo(268.287, 226.46, 268.32498, 227.182, 268.128, 228.009);
generalPath.curveTo(267.97498, 228.646, 267.732, 229.155, 267.396, 229.534);
generalPath.curveTo(267.063, 229.914, 266.686, 230.18399, 266.268, 230.34999);
generalPath.curveTo(265.888, 230.50577, 265.48068, 230.58395, 265.07, 230.57999);
generalPath.curveTo(264.548, 230.55798, 263.81302, 230.43298, 262.867, 230.20499);
generalPath.lineTo(261.504, 229.87498);
generalPath.lineTo(260.566, 233.79698);
generalPath.lineTo(258.474, 233.29298);
generalPath.closePath();
shape = generalPath;
paint = new Color(48, 158, 58, 255);
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
generalPath.moveTo(262.64, 225.16);
generalPath.lineTo(261.933, 228.11);
generalPath.lineTo(263.07703, 228.385);
generalPath.curveTo(263.90204, 228.583, 264.46503, 228.66199, 264.76703, 228.61899);
generalPath.curveTo(265.07303, 228.57599, 265.32904, 228.45898, 265.54004, 228.26498);
generalPath.curveTo(265.75504, 228.07199, 265.90002, 227.82199, 265.97305, 227.51498);
generalPath.curveTo(266.06305, 227.13498, 266.02805, 226.79799, 265.86606, 226.49898);
generalPath.curveTo(265.70206, 226.19897, 265.45905, 225.97897, 265.13605, 225.83598);
generalPath.curveTo(264.89606, 225.72798, 264.40204, 225.58398, 263.64905, 225.40198);
generalPath.lineTo(262.63904, 225.15797);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(268.373, 236.257);
generalPath.lineTo(271.91098, 226.177);
generalPath.lineTo(276.18097, 227.687);
generalPath.curveTo(277.25296, 228.067, 278.00098, 228.433, 278.41898, 228.787);
generalPath.curveTo(278.84497, 229.14, 279.12198, 229.597, 279.25198, 230.16501);
generalPath.curveTo(279.382, 230.73302, 279.34198, 231.313, 279.132, 231.908);
generalPath.curveTo(278.86798, 232.66501, 278.427, 233.211, 277.81, 233.55);
generalPath.curveTo(277.195, 233.884, 276.424, 233.96, 275.498, 233.776);
generalPath.curveTo(275.84598, 234.188, 276.10797, 234.59601, 276.283, 235.004);
generalPath.curveTo(276.465, 235.414, 276.658, 236.096, 276.86798, 237.05);
generalPath.lineTo(277.404, 239.45);
generalPath.lineTo(274.97998, 238.593);
generalPath.lineTo(274.28497, 235.881);
generalPath.curveTo(274.03998, 234.914, 273.85696, 234.29599, 273.735, 234.025);
generalPath.curveTo(273.63528, 233.7787, 273.47662, 233.56065, 273.27298, 233.39);
generalPath.curveTo(273.08597, 233.235, 272.75998, 233.077, 272.29297, 232.91);
generalPath.lineTo(271.88297, 232.766);
generalPath.lineTo(270.40598, 236.97601);
generalPath.lineTo(268.37897, 236.25601);
generalPath.closePath();
shape = generalPath;
paint = new Color(48, 158, 58, 255);
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
generalPath.moveTo(272.438, 231.163);
generalPath.lineTo(273.938, 231.693);
generalPath.curveTo(274.91098, 232.03699, 275.53098, 232.211, 275.802, 232.213);
generalPath.curveTo(276.072, 232.216, 276.312, 232.14299, 276.522, 231.98799);
generalPath.curveTo(276.729, 231.836, 276.885, 231.60799, 276.992, 231.305);
generalPath.curveTo(277.11002, 230.965, 277.115, 230.65999, 277.005, 230.39);
generalPath.curveTo(276.901, 230.116, 276.695, 229.894, 276.385, 229.722);
generalPath.curveTo(276.228, 229.642, 275.739, 229.455, 274.91702, 229.165);
generalPath.lineTo(273.33502, 228.605);
generalPath.lineTo(272.43802, 231.163);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(280.88, 235.87);
generalPath.curveTo(281.203, 234.83, 281.63, 234.00699, 282.156, 233.4);
generalPath.curveTo(282.55002, 232.95, 283.006, 232.583, 283.534, 232.295);
generalPath.curveTo(284.028, 232.01894, 284.5731, 231.84644, 285.136, 231.788);
generalPath.curveTo(285.85397, 231.71599, 286.62598, 231.81, 287.45297, 232.068);
generalPath.curveTo(288.95096, 232.538, 290.00296, 233.37799, 290.61, 234.592);
generalPath.curveTo(291.222, 235.806, 291.27, 237.245, 290.754, 238.90599);
generalPath.curveTo(290.244, 240.55399, 289.396, 241.704, 288.214, 242.35799);
generalPath.curveTo(287.034, 243.00798, 285.698, 243.09799, 284.20398, 242.62999);
generalPath.curveTo(282.69397, 242.15799, 281.63397, 241.31999, 281.02997, 240.118);
generalPath.curveTo(280.42496, 238.91, 280.37598, 237.495, 280.87997, 235.871);
generalPath.closePath();
shape = generalPath;
paint = new Color(48, 158, 58, 255);
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
generalPath.moveTo(283.027, 236.47);
generalPath.curveTo(282.66702, 237.62401, 282.661, 238.584, 283.00702, 239.35);
generalPath.curveTo(283.355, 240.11, 283.937, 240.617, 284.75702, 240.87401);
generalPath.curveTo(285.574, 241.12901, 286.33502, 241.044, 287.04, 240.61801);
generalPath.curveTo(287.752, 240.19002, 288.29202, 239.38301, 288.66, 238.20001);
generalPath.curveTo(289.022, 237.03001, 289.036, 236.07802, 288.7, 235.34001);
generalPath.curveTo(288.372, 234.60701, 287.78302, 234.10701, 286.93802, 233.84302);
generalPath.curveTo(286.092, 233.57802, 285.32, 233.65701, 284.62103, 234.08002);
generalPath.curveTo(283.92404, 234.49802, 283.39304, 235.29402, 283.02805, 236.47002);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(301.692, 250.754);
generalPath.lineTo(306.582, 241.26);
generalPath.lineTo(310.602, 243.347);
generalPath.curveTo(311.612, 243.873, 312.302, 244.339, 312.66898, 244.749);
generalPath.curveTo(313.03897, 245.155, 313.253, 245.64899, 313.30298, 246.22899);
generalPath.curveTo(313.35297, 246.80899, 313.23297, 247.37599, 312.94498, 247.939);
generalPath.curveTo(312.57797, 248.649, 312.06497, 249.131, 311.40698, 249.379);
generalPath.curveTo(310.75198, 249.62599, 309.97998, 249.593, 309.08698, 249.283);
generalPath.curveTo(309.37497, 249.739, 309.57697, 250.183, 309.69696, 250.60901);
generalPath.curveTo(309.81696, 251.039, 309.91696, 251.74101, 309.99197, 252.716);
generalPath.lineTo(310.192, 255.166);
generalPath.lineTo(307.909, 253.982);
generalPath.lineTo(307.593, 251.2);
generalPath.curveTo(307.483, 250.207, 307.387, 249.56999, 307.30298, 249.286);
generalPath.curveTo(307.23886, 249.02765, 307.11176, 248.78922, 306.93298, 248.592);
generalPath.curveTo(306.77, 248.414, 306.46698, 248.21199, 306.029, 247.982);
generalPath.lineTo(305.642, 247.782);
generalPath.lineTo(303.602, 251.745);
generalPath.lineTo(301.692, 250.75499);
generalPath.closePath();
shape = generalPath;
paint = new Color(48, 158, 58, 255);
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
generalPath.moveTo(306.418, 246.26);
generalPath.lineTo(307.83, 246.993);
generalPath.curveTo(308.74597, 247.47, 309.33798, 247.72699, 309.606, 247.76799);
generalPath.curveTo(309.873, 247.80798, 310.12198, 247.76799, 310.349, 247.64499);
generalPath.curveTo(310.575, 247.52199, 310.759, 247.318, 310.909, 247.03198);
generalPath.curveTo(311.073, 246.71198, 311.119, 246.41199, 311.047, 246.12898);
generalPath.curveTo(310.982, 245.84198, 310.807, 245.59198, 310.525, 245.37898);
generalPath.curveTo(310.38098, 245.27898, 309.922, 245.02599, 309.147, 244.62398);
generalPath.lineTo(307.659, 243.84998);
generalPath.lineTo(306.417, 246.25998);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(341.19, 270.26);
generalPath.curveTo(341.797, 269.36002, 342.44, 268.69302, 343.12302, 268.264);
generalPath.curveTo(343.6253, 267.95, 344.17917, 267.72723, 344.759, 267.60602);
generalPath.curveTo(345.31122, 267.48572, 345.8821, 267.4789, 346.437, 267.58603);
generalPath.curveTo(347.14502, 267.72604, 347.85703, 268.03903, 348.575, 268.52603);
generalPath.curveTo(349.875, 269.40903, 350.64, 270.51904, 350.87302, 271.85602);
generalPath.curveTo(351.11002, 273.196, 350.743, 274.58603, 349.77002, 276.028);
generalPath.curveTo(348.808, 277.45602, 347.66803, 278.31403, 346.35, 278.59802);
generalPath.curveTo(345.032, 278.87604, 343.72702, 278.57602, 342.43, 277.69803);
generalPath.curveTo(341.12, 276.80603, 340.347, 275.69803, 340.113, 274.37103);
generalPath.curveTo(339.881, 273.04105, 340.24002, 271.67102, 341.19, 270.26105);
generalPath.closePath();
shape = generalPath;
paint = new Color(48, 158, 58, 255);
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
generalPath.moveTo(343.073, 271.443);
generalPath.curveTo(342.398, 272.44598, 342.115, 273.363, 342.226, 274.195);
generalPath.curveTo(342.341, 275.025, 342.752, 275.678, 343.461, 276.161);
generalPath.curveTo(344.173, 276.644, 344.926, 276.78302, 345.724, 276.58102);
generalPath.curveTo(346.529, 276.37503, 347.277, 275.76102, 347.969, 274.73303);
generalPath.curveTo(348.652, 273.71902, 348.939, 272.81003, 348.82898, 272.00903);
generalPath.curveTo(348.72498, 271.20905, 348.30597, 270.56204, 347.572, 270.06302);
generalPath.curveTo(346.838, 269.564, 346.077, 269.41602, 345.287, 269.61902);
generalPath.curveTo(344.49698, 269.81702, 343.762, 270.42603, 343.07498, 271.44403);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(246.427, 228.95);
generalPath.lineTo(248.141, 221.446);
generalPath.lineTo(253.684, 222.724);
generalPath.lineTo(253.39601, 223.991);
generalPath.lineTo(249.36401, 223.064);
generalPath.lineTo(248.98001, 224.72699);
generalPath.lineTo(252.73401, 225.59299);
generalPath.lineTo(252.44402, 226.85498);
generalPath.lineTo(248.69402, 225.99197);
generalPath.lineTo(248.22401, 228.03398);
generalPath.lineTo(252.40001, 228.99599);
generalPath.lineTo(252.11201, 230.26099);
generalPath.lineTo(246.42702, 228.95099);
generalPath.closePath();
shape = generalPath;
paint = new Color(48, 158, 58, 255);
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
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
    public static ResizableIcon of(int width, int height) {
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       br base = new br();
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
        return br::new;
    }
}

