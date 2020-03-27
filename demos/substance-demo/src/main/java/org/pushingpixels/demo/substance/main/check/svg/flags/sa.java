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
public class sa implements ResizableIcon {
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
g.transform(new AffineTransform(1.032099962234497f, 0.0f, 0.0f, 1.032099962234497f, -128.0f, 0.0f));
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
generalPath.lineTo(744.09, 0.0);
generalPath.lineTo(744.09, 496.06);
generalPath.lineTo(0.0, 496.06);
generalPath.closePath();
shape = generalPath;
paint = new Color(25, 157, 0, 255);
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
generalPath.moveTo(187.52, 140.62);
generalPath.curveTo(186.66101, 152.209, 185.63, 172.603, 195.477, 174.69499);
generalPath.curveTo(207.38701, 175.84, 200.82, 154.53699, 205.13101, 150.674);
generalPath.curveTo(205.94601, 148.765, 207.449, 148.75499, 207.57301, 151.163);
generalPath.lineTo(207.57301, 169.233);
generalPath.curveTo(207.46402, 175.10901, 211.32701, 176.84, 214.32802, 178.054);
generalPath.curveTo(217.45102, 177.813, 219.53601, 177.917, 220.76003, 180.956);
generalPath.lineTo(222.22502, 212.213);
generalPath.curveTo(222.22502, 212.213, 229.46802, 214.286, 229.81302, 194.632);
generalPath.curveTo(230.15901, 183.09201, 227.50803, 173.432, 229.06201, 171.18701);
generalPath.curveTo(229.117, 168.98102, 231.934, 168.84901, 233.88802, 169.92401);
generalPath.curveTo(237.00102, 172.12001, 238.38802, 174.83202, 243.22601, 173.74701);
generalPath.curveTo(250.58801, 171.71901, 255.01302, 168.13802, 255.12201, 162.48502);
generalPath.curveTo(254.69202, 157.11302, 254.09001, 151.74002, 251.76201, 146.36801);
generalPath.curveTo(252.087, 145.391, 250.341, 142.86002, 250.66501, 141.88301);
generalPath.curveTo(251.988, 143.95502, 254.001, 143.783, 254.45901, 141.88301);
generalPath.curveTo(253.20601, 137.75401, 251.26201, 133.798, 248.11002, 132.08601);
generalPath.curveTo(245.50502, 129.79102, 241.69302, 130.26001, 240.29701, 135.04602);
generalPath.curveTo(239.65001, 140.56102, 242.28502, 147.11302, 246.30101, 152.45502);
generalPath.curveTo(247.154, 154.54202, 248.352, 158.01001, 247.82501, 161.13301);
generalPath.curveTo(245.68802, 162.352, 243.55101, 161.84401, 241.76102, 159.95401);
generalPath.curveTo(241.76102, 159.95401, 235.90102, 155.559, 235.90102, 154.58202);
generalPath.curveTo(237.45601, 144.62602, 236.24602, 143.49701, 235.38402, 140.73401);
generalPath.curveTo(234.78201, 136.92001, 232.97202, 135.697, 231.50601, 133.09201);
generalPath.curveTo(230.04001, 131.53801, 228.057, 131.53801, 227.10901, 133.09201);
generalPath.curveTo(224.51901, 137.58202, 225.727, 147.22101, 227.598, 151.53801);
generalPath.curveTo(228.95001, 155.509, 231.016, 158.001, 230.04001, 158.001);
generalPath.curveTo(229.23601, 160.24501, 227.574, 159.727, 226.365, 157.13701);
generalPath.curveTo(224.639, 151.78401, 224.293, 143.79701, 224.293, 140.20001);
generalPath.curveTo(223.775, 135.74101, 223.206, 126.23001, 220.271, 123.81301);
generalPath.curveTo(218.481, 121.37501, 215.827, 122.56401, 214.9, 124.78901);
generalPath.curveTo(214.707, 129.21501, 214.687, 133.64001, 215.185, 137.71901);
generalPath.curveTo(217.198, 144.87302, 217.83, 151.16301, 218.80699, 158.48901);
generalPath.curveTo(219.07799, 168.30202, 213.133, 162.74701, 213.405, 157.88202);
generalPath.curveTo(214.776, 151.56302, 214.42, 141.61702, 213.202, 139.09602);
generalPath.curveTo(212.236, 136.57503, 211.096, 135.95302, 208.747, 136.36803);
generalPath.curveTo(206.88199, 136.25403, 202.083, 141.49403, 200.736, 150.18602);
generalPath.curveTo(200.736, 150.18602, 199.58699, 154.66002, 199.09698, 158.63202);
generalPath.curveTo(198.43799, 163.12102, 195.48299, 166.28902, 193.41098, 158.00102);
generalPath.curveTo(191.61998, 151.97702, 190.51898, 137.14702, 187.51997, 140.62003);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(219.88, 188.16);
generalPath.curveTo(209.37001, 193.298, 199.205, 198.091, 188.866, 203.056);
generalPath.curveTo(189.244, 196.026, 203.611, 183.336, 213.409, 183.157);
generalPath.curveTo(219.786, 183.33499, 218.18399, 185.62799, 219.87999, 188.16);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(214.46, 197.88);
generalPath.curveTo(198.115, 240.013, 252.73502, 245.884, 258.83902, 199.606);
generalPath.curveTo(259.41403, 197.707, 261.717, 195.807, 262.12003, 198.91501);
generalPath.curveTo(260.85303, 240.81702, 219.87103, 243.69601, 212.90703, 230.514);
generalPath.curveTo(211.18103, 227.40701, 210.66203, 220.5, 210.48903, 216.35501);
generalPath.curveTo(209.45303, 208.12502, 205.13702, 211.29001, 204.44603, 219.46301);
generalPath.curveTo(203.75504, 224.01001, 203.92802, 225.27802, 203.92802, 229.65201);
generalPath.curveTo(206.11502, 262.74802, 258.898, 248.531, 267.47302, 221.19101);
generalPath.curveTo(272.02002, 206.052, 266.72403, 194.88701, 269.19904, 194.94301);
generalPath.curveTo(274.43704, 200.585, 281.74603, 195.692, 283.35803, 193.73502);
generalPath.curveTo(284.04904, 192.75601, 285.77704, 192.12402, 286.98505, 193.39001);
generalPath.curveTo(291.07104, 196.32701, 298.26804, 194.94301, 299.76306, 189.76302);
generalPath.curveTo(300.62708, 184.69801, 301.31805, 179.46002, 301.49106, 174.05101);
generalPath.curveTo(298.15106, 175.08801, 295.67706, 175.77701, 295.44705, 177.15901);
generalPath.lineTo(294.75604, 181.64801);
generalPath.curveTo(294.46906, 183.08801, 291.58905, 183.14401, 291.47504, 181.30202);
generalPath.curveTo(290.20905, 175.54602, 284.97104, 174.79802, 281.80502, 183.72102);
generalPath.curveTo(279.67502, 185.44702, 275.81903, 185.79303, 275.415, 183.20302);
generalPath.curveTo(275.933, 177.21701, 273.515, 176.41002, 268.681, 179.23102);
generalPath.curveTo(267.127, 167.37402, 265.574, 156.03502, 264.019, 144.17801);
generalPath.curveTo(266.03403, 144.12001, 267.877, 145.61601, 269.71902, 143.31401);
generalPath.curveTo(267.70203, 137.04102, 263.44403, 124.20501, 261.08304, 123.28401);
generalPath.curveTo(259.93204, 121.903015, 258.95203, 122.766014, 257.45703, 123.111015);
generalPath.curveTo(254.92503, 123.917015, 252.56403, 126.10402, 253.31203, 130.36401);
generalPath.curveTo(256.30502, 148.55202, 258.26303, 162.42401, 261.256, 180.613);
generalPath.curveTo(261.716, 182.74301, 259.932, 185.561, 257.63, 185.274);
generalPath.curveTo(253.716, 182.626, 252.74, 177.274, 246.061, 177.503);
generalPath.curveTo(241.226, 177.561, 235.699, 182.79901, 235.01001, 187.86601);
generalPath.curveTo(234.20401, 191.893, 233.91501, 196.26701, 235.00801, 199.779);
generalPath.curveTo(238.406, 203.865, 242.492, 203.464, 246.061, 202.542);
generalPath.curveTo(248.996, 201.33401, 251.41301, 198.39801, 252.45001, 199.08801);
generalPath.curveTo(253.141, 199.95201, 252.62102, 209.62001, 238.63501, 217.04602);
generalPath.curveTo(230.17401, 220.84502, 223.43901, 221.70901, 219.815, 214.80103);
generalPath.curveTo(217.57, 210.48402, 219.987, 194.08002, 214.46, 197.88002);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(283.79, 155.05);
generalPath.curveTo(287.071, 153.841, 302.614, 136.056, 302.614, 136.056);
generalPath.curveTo(301.807, 135.365, 301.087, 134.847, 300.281, 134.156);
generalPath.curveTo(299.417, 133.408, 299.504, 132.66, 300.281, 131.91101);
generalPath.curveTo(304.137, 129.667, 302.9, 124.74501, 300.88602, 122.50101);
generalPath.curveTo(297.54703, 121.004005, 294.64, 121.493004, 292.51, 122.587006);
generalPath.curveTo(289.80502, 125.177, 289.173, 129.321, 291.303, 131.91101);
generalPath.curveTo(293.376, 132.89001, 295.44702, 134.99101, 294.065, 136.14201);
generalPath.curveTo(287.706, 142.93402, 270.294, 154.64702, 272.309, 155.05002);
generalPath.curveTo(272.73898, 155.62602, 283.44598, 155.59702, 283.78998, 155.05002);
generalPath.closePath();
generalPath.moveTo(189.93, 217.99);
generalPath.curveTo(184.101, 227.276, 183.594, 241.149, 186.81, 245.285);
generalPath.curveTo(188.519, 247.239, 191.327, 248.095, 193.40399, 247.483);
generalPath.curveTo(197.066, 245.895, 198.66899, 238.475, 197.79999, 235.761);
generalPath.curveTo(196.57799, 233.848, 195.61499, 233.545, 194.39499, 235.172);
generalPath.curveTo(191.818, 240.40399, 190.74799, 236.815, 190.52199, 233.89099);
generalPath.curveTo(190.12698, 228.346, 190.64899, 223.23898, 191.25099, 219.19499);
generalPath.curveTo(191.892, 215.04999, 191.23999, 216.31699, 189.93, 217.98999);
generalPath.closePath();
generalPath.moveTo(439.02, 203.12);
generalPath.curveTo(433.384, 190.989, 425.582, 179.00099, 423.099, 174.396);
generalPath.curveTo(420.617, 169.789, 401.876, 142.591, 399.117, 139.532);
generalPath.curveTo(393.029, 132.297, 409.003, 142.545, 397.096, 128.181);
generalPath.curveTo(392.556, 124.286, 392.29202, 124.048996, 388.52402, 120.871);
generalPath.curveTo(386.62302, 119.522, 381.98203, 117.058, 381.16, 121.142006);
generalPath.curveTo(380.747, 124.743004, 380.97, 126.69601, 381.575, 129.694);
generalPath.curveTo(382.039, 131.693, 384.95102, 135.041, 386.38303, 136.981);
generalPath.curveTo(405.39703, 162.539, 422.25702, 188.35, 438.51602, 220.802);
generalPath.curveTo(441.083, 219.582, 440.52203, 205.15, 439.02002, 203.12);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(414.28, 243.71);
generalPath.curveTo(413.172, 244.95401, 417.016, 250.27501, 422.012, 250.27);
generalPath.curveTo(430.367, 249.3, 437.722, 244.60701, 444.53198, 232.253);
generalPath.curveTo(446.353, 229.37201, 449.554, 223.21, 449.64798, 218.43001);
generalPath.curveTo(450.28497, 190.40501, 448.24496, 168.598, 444.046, 148.34302);
generalPath.curveTo(443.77698, 146.37001, 443.94098, 144.05103, 444.275, 143.45901);
generalPath.curveTo(444.81598, 142.81302, 446.651, 143.46202, 447.624, 141.86601);
generalPath.curveTo(449.052, 140.40802, 443.832, 128.33101, 440.856, 123.679016);
generalPath.curveTo(439.79898, 121.60201, 439.431, 120.21502, 437.68198, 123.92302);
generalPath.curveTo(435.84198, 126.93702, 434.606, 132.19601, 434.75098, 137.11002);
generalPath.curveTo(438.73697, 164.70502, 439.96097, 188.84601, 442.56598, 216.44202);
generalPath.curveTo(442.77798, 219.11102, 442.386, 222.98901, 440.61197, 224.53502);
generalPath.curveTo(434.04996, 231.38702, 424.57898, 239.82101, 414.27997, 243.71002);
generalPath.closePath();
generalPath.moveTo(527.14, 243.56);
generalPath.curveTo(521.14404, 247.026, 521.137, 251.013, 525.985, 251.157);
generalPath.curveTo(534.33997, 250.187, 544.212, 249.493, 551.022, 239.212);
generalPath.curveTo(552.844, 236.33101, 555.008, 228.54001, 555.102, 223.76001);
generalPath.curveTo(555.739, 195.73502, 554.73596, 174.81702, 550.537, 154.56201);
generalPath.curveTo(550.268, 152.589, 549.39496, 148.048, 549.729, 147.45601);
generalPath.curveTo(550.27, 146.06902, 552.994, 147.60701, 553.967, 146.011);
generalPath.curveTo(555.39496, 144.55301, 546.91595, 133.661, 543.94, 129.009);
generalPath.curveTo(542.883, 126.932, 542.515, 125.545006, 540.766, 129.253);
generalPath.curveTo(538.92596, 132.267, 538.283, 137.67401, 539.02, 142.44);
generalPath.curveTo(543.45, 172.405, 546.74805, 194.917, 547.42804, 221.47601);
generalPath.curveTo(547.04706, 223.99701, 546.952, 225.35602, 545.77, 228.53201);
generalPath.curveTo(543.155, 231.88402, 540.258, 236.07501, 537.541, 238.10101);
generalPath.curveTo(534.825, 240.126, 529.03, 242.059, 527.14, 243.56001);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(531.64, 216.7);
generalPath.curveTo(531.57104, 209.692, 531.739, 203.64099, 531.508, 198.414);
generalPath.curveTo(531.278, 193.187, 530.354, 188.931, 528.545, 185.22101);
generalPath.curveTo(526.833, 181.24301, 527.896, 178.046, 527.092, 173.809);
generalPath.curveTo(526.289, 169.573, 526.487, 163.229, 525.273, 158.20201);
generalPath.curveTo(524.94, 156.23901, 523.92, 149.95201, 524.235, 149.34901);
generalPath.curveTo(524.73, 147.94601, 526.615, 149.39302, 527.536, 147.76701);
generalPath.curveTo(528.91504, 146.264, 522.753, 130.32, 519.627, 125.76701);
generalPath.curveTo(518.503, 123.72601, 516.46204, 124.42501, 513.945, 127.74401);
generalPath.curveTo(511.611, 129.92801, 512.477, 134.90901, 513.368, 139.64801);
generalPath.curveTo(519.363, 170.934, 523.83496, 199.251, 522.859, 229.03302);
generalPath.curveTo(522.56, 231.56502, 531.702, 221.48003, 531.64, 216.70001);
generalPath.closePath();
generalPath.moveTo(487.34, 177.89);
generalPath.curveTo(483.569, 177.821, 475.671, 170.552, 473.366, 166.293);
generalPath.curveTo(472.495, 163.85, 473.054, 161.467, 473.822, 160.071);
generalPath.curveTo(475.218, 159.163, 477.366, 158.143, 478.972, 159.121);
generalPath.curveTo(478.972, 159.121, 480.637, 161.451, 480.31497, 161.74701);
generalPath.curveTo(482.37396, 162.733, 483.248, 162.16602, 483.45697, 161.328);
generalPath.curveTo(483.597, 159.862, 482.84796, 158.988, 482.83997, 157.373);
generalPath.curveTo(483.71295, 152.993, 488.71896, 152.312, 490.60397, 155.105);
generalPath.curveTo(491.98398, 156.808, 492.48996, 160.426, 492.69897, 162.86899);
generalPath.curveTo(492.67697, 164.11699, 490.65598, 162.65298, 489.50797, 162.95299);
generalPath.curveTo(488.35898, 163.25398, 488.08298, 164.579, 487.99396, 165.77798);
generalPath.curveTo(487.78595, 168.95398, 487.40994, 174.04999, 487.33997, 177.88998);
generalPath.closePath();
generalPath.moveTo(417.75, 224.47);
generalPath.curveTo(418.789, 214.948, 417.366, 197.99, 417.271, 192.371);
generalPath.curveTo(416.88998, 179.097, 414.722, 153.459, 413.69, 149.176);
generalPath.curveTo(412.527, 141.10199, 417.01102, 150.062, 416.39, 145.36899);
generalPath.curveTo(414.936, 137.30598, 410.46402, 131.84099, 405.207, 124.455986);
generalPath.curveTo(403.512, 122.053986, 403.569, 121.56399, 400.952, 125.04498);
generalPath.curveTo(398.056, 131.61499, 400.556, 136.13399, 401.304, 141.24998);
generalPath.curveTo(405.09497, 157.91998, 407.30698, 173.25899, 408.33698, 188.42198);
generalPath.curveTo(409.36697, 203.58598, 409.68298, 219.97998, 408.74298, 235.94998);
generalPath.curveTo(411.58398, 236.06198, 416.15198, 231.35399, 417.74997, 224.46999);
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
generalPath.moveTo(544.47, 209.22);
generalPath.curveTo(537.821, 198.063, 527.787, 185.98, 525.10596, 181.487);
generalPath.curveTo(522.42596, 176.993, 499.75397, 147.741, 496.86496, 144.805);
generalPath.curveTo(488.57095, 136.092, 500.66895, 143.387, 495.27695, 136.657);
generalPath.curveTo(490.71695, 131.65, 489.38693, 130.078, 485.48395, 127.067);
generalPath.curveTo(483.52695, 125.802, 482.34094, 123.387, 481.69794, 127.503);
generalPath.curveTo(481.44193, 131.119, 481.17493, 135.302, 481.41794, 138.35);
generalPath.curveTo(481.40393, 140.044, 483.16794, 143.227, 484.68295, 145.10301);
generalPath.curveTo(504.79196, 169.809, 526.725, 195.03601, 544.38196, 226.74902);
generalPath.curveTo(546.894, 225.41803, 546.05896, 211.18303, 544.47, 209.22003);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(242.79, 188.63);
generalPath.curveTo(242.31099, 189.46901, 241.24599, 190.556, 241.603, 191.681);
generalPath.curveTo(242.34999, 192.693, 242.946, 192.898, 244.19, 192.953);
generalPath.curveTo(245.269, 192.953, 246.77701, 193.20801, 247.101, 192.571);
generalPath.curveTo(247.68199, 191.931, 248.124, 190.625, 247.64, 189.392);
generalPath.curveTo(246.516, 186.583, 243.377, 187.63, 242.79, 188.63);
generalPath.closePath();
shape = generalPath;
paint = new Color(27, 164, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(467.16, 351.26);
generalPath.curveTo(476.052, 351.587, 481.872, 351.66602, 489.781, 352.607);
generalPath.curveTo(489.781, 352.607, 496.601, 351.93298, 499.03702, 351.565);
generalPath.curveTo(509.33203, 350.583, 509.78802, 366.269, 509.78802, 366.269);
generalPath.curveTo(509.67502, 375.46902, 506.12402, 375.95, 501.59103, 376.922);
generalPath.curveTo(499.00104, 377.25198, 497.64005, 375.371, 496.27902, 373.368);
generalPath.curveTo(494.57, 374.083, 492.24802, 374.186, 489.43402, 373.79602);
generalPath.curveTo(485.72903, 373.56403, 482.023, 373.579, 478.31802, 373.34702);
generalPath.curveTo(474.381, 373.00003, 472.28702, 373.75702, 468.35004, 373.41);
generalPath.curveTo(467.53903, 374.684, 466.48404, 376.448, 464.07605, 375.88);
generalPath.curveTo(462.07306, 375.659, 459.70004, 370.035, 460.39905, 365.76);
generalPath.curveTo(461.84506, 362.694, 461.44806, 363.68002, 461.29706, 362.333);
generalPath.curveTo(424.94006, 361.407, 388.23505, 359.786, 352.57706, 360.249);
generalPath.curveTo(324.67307, 360.365, 297.11505, 361.52298, 269.55707, 362.681);
generalPath.curveTo(254.85207, 362.449, 243.62106, 360.133, 235.86307, 348.786);
generalPath.curveTo(236.55807, 348.786, 273.37805, 350.87003, 284.14706, 350.17502);
generalPath.curveTo(304.06207, 349.94302, 322.24005, 348.32303, 342.50305, 347.74402);
generalPath.curveTo(382.45004, 348.43802, 422.05005, 348.43903, 461.99304, 351.217);
generalPath.curveTo(458.17203, 348.603, 458.03503, 342.428, 463.91605, 340.919);
generalPath.curveTo(464.41605, 340.575, 464.67404, 343.989, 465.55405, 343.92502);
generalPath.curveTo(470.25903, 343.57202, 468.19604, 349.946, 467.16104, 351.26);
generalPath.closePath();
generalPath.moveTo(306.78, 131.07);
generalPath.curveTo(300.726, 148.373, 310.248, 167.3, 316.85, 165.457);
generalPath.curveTo(321.613, 167.429, 324.646, 158.368, 326.596, 148.441);
generalPath.curveTo(327.93002, 145.655, 328.93802, 145.358, 329.62302, 146.79);
generalPath.curveTo(329.44702, 159.991, 330.571, 162.915, 333.96503, 166.922);
generalPath.curveTo(341.53604, 172.763, 347.799, 167.668, 348.29004, 167.176);
generalPath.lineTo(354.18503, 161.28099);
generalPath.curveTo(355.49704, 159.90099, 357.24402, 159.81999, 359.09702, 161.036);
generalPath.curveTo(360.898, 162.67299, 360.64502, 165.50099, 364.501, 167.46199);
generalPath.curveTo(367.746, 168.76, 374.68402, 167.762, 376.29102, 164.96599);
generalPath.curveTo(378.454, 161.25899, 378.97302, 159.986, 379.975, 158.57999);
generalPath.curveTo(381.519, 156.525, 384.151, 157.43898, 384.151, 158.08798);
generalPath.curveTo(383.905, 159.23398, 382.36002, 160.38098, 383.414, 162.44498);
generalPath.curveTo(385.25, 163.82198, 385.674, 162.93597, 386.76, 162.62997);
generalPath.curveTo(390.601, 160.79398, 393.48502, 152.43898, 393.48502, 152.43898);
generalPath.curveTo(393.65503, 149.33098, 391.91302, 149.58798, 390.78302, 150.22798);
generalPath.curveTo(389.30902, 151.12898, 389.213, 151.41698, 387.739, 152.31798);
generalPath.curveTo(385.86102, 152.59698, 382.21802, 153.84198, 380.41702, 151.05298);
generalPath.curveTo(378.57803, 147.69998, 378.553, 143.02197, 377.14703, 139.63998);
generalPath.curveTo(377.14703, 139.39398, 374.70703, 134.31299, 376.97803, 133.98799);
generalPath.curveTo(378.12402, 134.20099, 380.56903, 134.84799, 380.95804, 132.78899);
generalPath.curveTo(382.16003, 130.78198, 378.38403, 125.09898, 375.80005, 122.22699);
generalPath.curveTo(373.55704, 119.76499, 370.44904, 119.46799, 367.44904, 121.98199);
generalPath.curveTo(365.34802, 123.914986, 365.65002, 126.07499, 365.23804, 128.122);
generalPath.curveTo(364.70303, 130.47299, 364.81705, 133.36499, 367.20303, 136.47299);
generalPath.curveTo(369.30002, 140.60799, 373.12604, 145.933, 371.87003, 153.42099);
generalPath.curveTo(371.87003, 153.42099, 369.63504, 156.95999, 365.74103, 156.497);
generalPath.curveTo(364.11804, 156.14299, 361.48602, 155.454, 360.08002, 145.06999);
generalPath.curveTo(359.01602, 137.20999, 360.33102, 126.21299, 356.99503, 121.05699);
generalPath.curveTo(355.79004, 117.94399, 354.91003, 114.93799, 351.97403, 120.26199);
generalPath.curveTo(351.18503, 122.353, 347.79904, 125.52599, 350.25504, 132.05199);
generalPath.curveTo(352.26404, 136.18999, 353.08203, 142.92398, 352.17004, 150.41599);
generalPath.curveTo(350.77805, 152.54498, 350.46906, 153.26599, 348.64404, 155.39499);
generalPath.curveTo(346.08005, 158.152, 343.29803, 157.44798, 341.16705, 156.41899);
generalPath.curveTo(339.17606, 155.077, 337.61707, 154.383, 336.70804, 150.12);
generalPath.curveTo(336.87204, 143.325, 337.25104, 132.202, 336.00903, 129.842);
generalPath.curveTo(334.17804, 126.187, 331.15802, 127.508995, 329.86804, 128.61299);
generalPath.curveTo(323.67004, 134.28, 320.60803, 143.842, 318.73703, 151.456);
generalPath.curveTo(317.01804, 157.00499, 315.18903, 155.415, 313.903, 153.176);
generalPath.curveTo(310.772, 150.24199, 310.56003, 127.298, 306.78003, 131.06999);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(325.01, 168.68);
generalPath.curveTo(327.759, 166.73299, 326.474, 165.372, 330.58502, 169.482);
generalPath.curveTo(335.73203, 178.282, 339.04, 189.678, 339.536, 199.775);
generalPath.curveTo(339.319, 202.263, 341.073, 203.838, 341.875, 203.297);
generalPath.curveTo(342.352, 197.456, 356.556, 189.317, 369.581, 188.127);
generalPath.curveTo(371.573, 187.694, 370.604, 183.877, 370.929, 181.93);
generalPath.curveTo(370.14798, 174.69899, 374.99197, 168.116, 381.78198, 167.59099);
generalPath.curveTo(391.02298, 168.95699, 394.09897, 173.89099, 394.25497, 181.42198);
generalPath.curveTo(393.257, 195.87997, 378.19598, 198.33098, 369.73398, 199.48398);
generalPath.curveTo(368.43597, 199.97498, 367.895, 200.57397, 369.73398, 201.28198);
generalPath.lineTo(405.18997, 201.44298);
generalPath.lineTo(406.99896, 202.48798);
generalPath.curveTo(407.21597, 203.33298, 406.48196, 202.62798, 405.08197, 204.93298);
generalPath.curveTo(403.68298, 207.23798, 401.61896, 212.55298, 401.51196, 216.10199);
generalPath.curveTo(390.94797, 219.499, 380.02197, 220.98698, 368.91696, 222.32999);
generalPath.curveTo(365.05896, 224.28099, 363.14697, 226.88098, 363.93896, 229.80699);
generalPath.curveTo(365.23697, 233.05199, 373.78296, 236.29399, 373.78296, 236.448);
generalPath.curveTo(375.40594, 237.466, 377.32596, 239.841, 373.32394, 244.708);
generalPath.curveTo(356.02893, 243.94699, 342.62695, 236.58699, 337.98694, 226.19899);
generalPath.curveTo(336.58893, 225.11499, 335.08295, 226.193, 334.11795, 227.59698);
generalPath.curveTo(327.36594, 236.30098, 320.72195, 244.13998, 309.20996, 248.30098);
generalPath.curveTo(302.34497, 250.01598, 295.31696, 247.24799, 291.99796, 242.75198);
generalPath.curveTo(289.77597, 240.19298, 289.86096, 237.36798, 289.04495, 236.75598);
generalPath.curveTo(285.33496, 238.39699, 253.40495, 251.96399, 257.45197, 245.64398);
generalPath.curveTo(265.22296, 237.32698, 278.67596, 231.21698, 290.55698, 223.00798);
generalPath.curveTo(291.41397, 220.25798, 292.97296, 210.95297, 297.666, 207.92297);
generalPath.curveTo(297.93698, 207.94597, 296.922, 213.38698, 297.024, 215.68198);
generalPath.curveTo(297.077, 217.56598, 296.886, 218.30397, 297.29797, 217.81897);
generalPath.curveTo(298.09998, 217.30797, 312.51596, 205.97997, 313.62997, 202.50597);
generalPath.curveTo(315.03598, 200.51396, 314.05197, 195.46896, 314.05197, 195.31596);
generalPath.curveTo(311.34796, 188.34796, 307.55597, 187.75597, 306.14996, 184.29396);
generalPath.curveTo(304.88397, 179.69496, 305.45697, 174.44496, 308.08597, 172.98196);
generalPath.curveTo(310.41998, 170.86296, 313.18497, 171.12497, 315.73495, 173.44096);
generalPath.curveTo(318.64694, 176.04897, 321.23294, 181.14597, 321.98096, 184.94296);
generalPath.curveTo(321.48096, 186.44496, 318.17096, 183.94496, 317.02194, 184.68996);
generalPath.curveTo(319.05493, 186.79495, 320.00394, 189.22296, 320.73795, 192.19395);
generalPath.curveTo(322.61594, 200.14696, 322.04294, 203.23895, 320.15295, 208.38196);
generalPath.curveTo(313.75195, 221.83997, 305.57196, 225.85596, 298.41495, 230.84096);
generalPath.curveTo(298.22394, 230.90895, 298.09695, 234.25595, 300.78894, 236.06596);
generalPath.curveTo(301.71695, 237.03996, 305.44995, 237.53996, 309.83994, 236.13396);
generalPath.curveTo(318.32193, 231.50795, 327.12793, 222.98695, 331.49893, 213.49396);
generalPath.curveTo(332.76794, 206.31296, 331.00793, 198.69896, 329.14093, 192.05896);
generalPath.curveTo(326.32794, 185.56895, 323.01492, 176.30296, 323.01492, 176.14996);
generalPath.curveTo(322.9059, 172.10297, 323.23492, 170.69896, 325.00992, 168.67996);
generalPath.closePath();
generalPath.moveTo(232.18, 131.25);
generalPath.curveTo(236.26099, 133.196, 243.933, 132.368, 243.609, 125.788);
generalPath.curveTo(243.609, 125.206, 243.461, 123.237, 243.403, 122.704);
generalPath.curveTo(242.57, 120.764, 240.297, 121.243004, 239.782, 123.246);
generalPath.curveTo(239.62, 123.902, 240.071, 124.97, 239.477, 125.3);
generalPath.curveTo(239.136, 125.644005, 237.832, 125.442, 237.886, 123.624);
generalPath.curveTo(237.886, 123.045, 237.459, 122.422, 237.202, 122.055);
generalPath.curveTo(236.944, 121.886, 236.78, 121.839, 236.31299, 121.839);
generalPath.curveTo(235.74399, 121.862, 235.75299, 122.009995, 235.441, 122.488);
generalPath.curveTo(235.30899, 122.975, 235.12599, 123.451, 235.12599, 124.003);
generalPath.curveTo(235.055, 124.65, 234.81099, 124.881, 234.33499, 124.976);
generalPath.curveTo(233.803, 124.976, 233.92299, 125.034996, 233.49199, 124.759995);
generalPath.curveTo(233.236, 124.479996, 232.91599, 124.37299, 232.91599, 123.895);
generalPath.curveTo(232.91599, 123.399994, 232.80399, 122.599, 232.65498, 122.271996);
generalPath.curveTo(232.42899, 121.974, 232.06598, 121.836, 231.65698, 121.730995);
generalPath.curveTo(229.42798, 121.739, 229.27399, 124.281, 229.40198, 125.245995);
generalPath.curveTo(229.23497, 125.42799, 229.13998, 129.98799, 232.17998, 131.25);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(351.81, 181.89);
generalPath.curveTo(355.891, 183.836, 365.605, 182.716, 363.23898, 176.428);
generalPath.curveTo(363.23898, 175.846, 363.09097, 173.877, 363.033, 173.344);
generalPath.curveTo(362.19998, 171.40399, 359.927, 171.883, 359.412, 173.886);
generalPath.curveTo(359.25, 174.542, 359.701, 175.61, 359.107, 175.94);
generalPath.curveTo(358.766, 176.284, 357.462, 176.082, 357.516, 174.264);
generalPath.curveTo(357.516, 173.68501, 357.089, 173.06201, 356.832, 172.695);
generalPath.curveTo(356.574, 172.526, 356.41, 172.479, 355.943, 172.479);
generalPath.curveTo(355.374, 172.502, 355.383, 172.65001, 355.07098, 173.128);
generalPath.curveTo(354.939, 173.615, 354.75598, 174.091, 354.75598, 174.643);
generalPath.curveTo(354.68497, 175.29001, 354.44098, 175.52101, 353.965, 175.61601);
generalPath.curveTo(353.43298, 175.61601, 353.553, 175.67502, 353.122, 175.40001);
generalPath.curveTo(352.866, 175.12001, 352.54602, 175.01302, 352.54602, 174.535);
generalPath.curveTo(352.54602, 174.04001, 352.43402, 173.239, 352.28503, 172.912);
generalPath.curveTo(352.05902, 172.614, 351.69604, 172.476, 351.28705, 172.371);
generalPath.curveTo(349.05804, 172.379, 348.90405, 174.921, 349.03204, 175.886);
generalPath.curveTo(348.86505, 176.06801, 348.77005, 180.628, 351.81006, 181.89);
generalPath.closePath();
generalPath.moveTo(421.56, 160.93);
generalPath.curveTo(425.641, 162.87599, 433.313, 162.04799, 432.98898, 155.46799);
generalPath.curveTo(432.98898, 154.88599, 432.84097, 152.91699, 432.783, 152.38399);
generalPath.curveTo(431.94998, 150.44398, 429.677, 150.92299, 429.162, 152.926);
generalPath.curveTo(429.0, 153.582, 429.451, 154.65, 428.857, 154.98);
generalPath.curveTo(428.516, 155.32399, 427.212, 155.122, 427.266, 153.304);
generalPath.curveTo(427.266, 152.725, 426.839, 152.102, 426.582, 151.735);
generalPath.curveTo(426.324, 151.566, 426.16, 151.519, 425.693, 151.519);
generalPath.curveTo(425.124, 151.54199, 425.133, 151.69, 424.82098, 152.168);
generalPath.curveTo(424.689, 152.655, 424.50598, 153.131, 424.50598, 153.683);
generalPath.curveTo(424.43497, 154.33, 424.19098, 154.561, 423.715, 154.656);
generalPath.curveTo(423.18298, 154.656, 423.303, 154.71501, 422.872, 154.44);
generalPath.curveTo(422.616, 154.16, 422.29602, 154.05301, 422.29602, 153.575);
generalPath.curveTo(422.29602, 153.08, 422.18402, 152.27899, 422.03503, 151.952);
generalPath.curveTo(421.80902, 151.65399, 421.44604, 151.51599, 421.03705, 151.411);
generalPath.curveTo(418.80804, 151.41899, 418.65405, 153.961, 418.78204, 154.926);
generalPath.curveTo(418.61505, 155.108, 418.52005, 159.668, 421.56006, 160.93);
generalPath.closePath();
generalPath.moveTo(457.69, 213.56);
generalPath.curveTo(450.578, 221.575, 453.714, 234.832, 455.32, 237.688);
generalPath.curveTo(457.665, 242.379, 459.553, 245.388, 464.116, 247.70801);
generalPath.curveTo(468.272, 250.76701, 471.51, 248.85501, 473.29498, 246.71301);
generalPath.curveTo(477.477, 242.37901, 477.52698, 231.31401, 479.49, 229.12102);
generalPath.curveTo(480.867, 225.09302, 484.33398, 225.78102, 486.017, 227.56602);
generalPath.curveTo(487.648, 229.91103, 489.569, 231.42302, 491.965, 232.69902);
generalPath.curveTo(495.866, 236.14001, 500.524, 236.76903, 505.113, 233.63303);
generalPath.curveTo(508.249, 231.87402, 510.288, 229.60103, 512.124, 225.08902);
generalPath.curveTo(514.164, 219.63303, 513.02704, 194.42603, 512.619, 179.48602);
generalPath.curveTo(512.46204, 178.31403, 508.56503, 158.94102, 508.56503, 158.72502);
generalPath.curveTo(508.56503, 158.50803, 508.05002, 148.83803, 507.62103, 146.53403);
generalPath.curveTo(507.54602, 145.59903, 507.31403, 145.33003, 508.29404, 145.44902);
generalPath.curveTo(509.33304, 146.32301, 509.47504, 146.37802, 510.12402, 146.66602);
generalPath.curveTo(511.17303, 146.85802, 512.112, 145.07301, 511.47903, 143.43002);
generalPath.lineTo(501.74405, 125.47402);
generalPath.curveTo(500.96304, 124.705025, 499.95404, 123.86002, 498.71506, 125.691025);
generalPath.curveTo(497.53107, 126.72903, 496.27005, 128.60803, 496.30905, 131.02303);
generalPath.curveTo(496.59705, 135.27803, 497.34506, 139.60803, 497.63306, 143.86302);
generalPath.lineTo(501.52805, 165.71303);
generalPath.curveTo(502.75406, 181.28903, 503.06104, 194.03603, 504.28705, 209.61203);
generalPath.curveTo(504.11505, 216.20703, 502.06506, 221.95703, 500.14206, 222.78703);
generalPath.curveTo(500.14206, 222.78703, 497.21606, 224.48303, 495.25406, 222.61003);
generalPath.curveTo(493.82706, 222.03703, 488.11505, 213.09103, 488.11505, 213.09103);
generalPath.curveTo(485.19504, 210.41403, 483.27005, 211.17903, 481.19205, 213.09103);
generalPath.curveTo(475.46204, 218.62404, 472.86905, 228.97504, 468.97504, 236.11403);
generalPath.curveTo(467.97104, 237.70703, 465.13303, 239.07103, 461.98904, 235.99803);
generalPath.curveTo(454.00406, 225.08904, 458.68405, 209.56903, 457.69003, 213.56003);
generalPath.closePath();
generalPath.moveTo(423.4, 122.72);
generalPath.curveTo(427.056, 124.25, 429.63498, 131.656, 428.794, 135.272);
generalPath.curveTo(428.066, 139.74501, 426.127, 144.576, 424.733, 143.947);
generalPath.curveTo(423.218, 143.38501, 425.766, 139.501, 424.31, 135.425);
generalPath.curveTo(423.501, 132.772, 418.512, 127.925, 419.037, 126.496);
generalPath.curveTo(418.007, 123.502, 421.158, 122.192, 423.4, 122.72);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(469.46, 217.96);
generalPath.curveTo(470.229, 209.067, 468.931, 203.64401, 468.69998, 198.417);
generalPath.curveTo(468.46997, 193.19, 462.788, 153.307, 461.636, 149.352);
generalPath.curveTo(460.24597, 141.87401, 467.159, 148.349, 466.404, 144.0);
generalPath.curveTo(464.012, 138.517, 458.06, 130.533, 456.19098, 125.770004);
generalPath.curveTo(455.067, 123.729004, 455.53897, 121.914, 453.02197, 125.233);
generalPath.curveTo(450.68796, 132.864, 449.87796, 139.101, 450.76898, 143.84);
generalPath.curveTo(456.76398, 175.12599, 462.912, 201.13899, 461.93597, 230.92099);
generalPath.curveTo(464.77896, 230.93999, 468.05597, 224.41599, 469.45996, 217.95999);
generalPath.closePath();
generalPath.moveTo(531.93, 135.33);
generalPath.curveTo(535.263, 136.987, 537.21497, 146.268, 536.847, 148.919);
generalPath.curveTo(536.18396, 153.76201, 534.41595, 158.992, 533.14496, 158.311);
generalPath.curveTo(531.764, 157.703, 533.42194, 151.129, 532.759, 149.085);
generalPath.curveTo(532.022, 146.21301, 527.474, 140.96501, 527.95197, 139.418);
generalPath.curveTo(527.01294, 136.177, 529.886, 134.759, 531.93, 135.33);
generalPath.closePath();
generalPath.moveTo(284.22, 201.14);
generalPath.curveTo(287.408, 202.357, 289.277, 209.177, 288.925, 211.126);
generalPath.curveTo(288.289, 214.684, 286.597, 218.52701, 285.383, 218.02701);
generalPath.curveTo(284.061, 217.58, 285.648, 212.74901, 285.013, 211.24701);
generalPath.curveTo(284.744, 207.604, 280.319, 205.718, 280.412, 204.14401);
generalPath.curveTo(279.586, 201.251, 282.263, 200.71901, 284.22, 201.14001);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(361.25, 211.38);
generalPath.curveTo(365.365, 211.641, 367.421, 214.87001, 363.567, 216.224);
generalPath.curveTo(359.76498, 217.526, 356.111, 218.543, 356.094, 224.037);
generalPath.curveTo(357.5, 231.69301, 354.165, 229.06601, 352.176, 228.026);
generalPath.curveTo(349.832, 226.343, 343.254, 222.291, 342.317, 213.541);
generalPath.curveTo(342.176, 211.453, 343.804, 209.696, 346.425, 209.70801);
generalPath.curveTo(350.373, 210.781, 356.198, 210.85901, 361.25, 211.38);
generalPath.closePath();
shape = generalPath;
paint = new Color(27, 157, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(199.01, 120.52);
generalPath.curveTo(203.71399, 121.937996, 203.99199, 128.85199, 203.64499, 130.873);
generalPath.curveTo(203.01799, 134.562, 201.35199, 138.546, 200.15498, 138.02701);
generalPath.curveTo(198.85298, 137.56401, 200.10399, 132.55602, 199.47899, 130.998);
generalPath.curveTo(198.78198, 128.81, 194.80699, 124.813, 195.258, 123.635);
generalPath.curveTo(194.373, 121.165, 197.082, 120.084, 199.01, 120.520004);
generalPath.closePath();
generalPath.moveTo(291.9, 153.12);
generalPath.curveTo(288.291, 155.07199, 286.891, 160.89099, 289.138, 164.27899);
generalPath.curveTo(291.237, 167.26299, 294.552, 166.157, 294.994, 166.157);
generalPath.curveTo(298.53, 166.599, 300.628, 159.528, 300.628, 159.528);
generalPath.curveTo(300.628, 159.528, 300.73898, 157.54, 296.53998, 161.297);
generalPath.curveTo(294.77298, 161.62799, 294.55197, 160.965, 294.11, 159.97);
generalPath.curveTo(293.74197, 158.129, 293.81497, 156.288, 294.662, 154.446);
generalPath.curveTo(295.288, 152.679, 293.925, 151.905, 291.9, 153.12);
generalPath.closePath();
generalPath.moveTo(318.97, 117.84);
generalPath.curveTo(317.156, 119.056, 313.546, 122.796, 313.436, 127.104996);
generalPath.curveTo(313.32602, 129.536, 312.87302, 129.52899, 314.465, 131.07599);
generalPath.curveTo(315.615, 132.734, 316.775, 132.58499, 319.096, 131.36899);
generalPath.curveTo(320.42902, 130.387, 320.88, 129.73499, 321.329, 128.08798);
generalPath.curveTo(321.88202, 125.32598, 318.409, 129.39798, 317.967, 126.32398);
generalPath.curveTo(317.194, 123.469986, 319.424, 122.30198, 321.523, 119.539986);
generalPath.curveTo(321.59302, 117.64799, 321.552, 116.30798, 318.97, 117.83999);
generalPath.closePath();
generalPath.moveTo(340.78, 121.72);
generalPath.curveTo(339.998, 123.447, 339.061, 132.468, 339.217, 132.468);
generalPath.curveTo(338.59302, 135.156, 342.03, 136.306, 343.59302, 132.851);
generalPath.curveTo(345.936, 126.517, 345.936, 123.83, 346.09302, 121.143);
generalPath.curveTo(345.363, 117.049995, 342.60303, 117.178, 340.78003, 121.72);
generalPath.closePath();
generalPath.moveTo(478.28, 191.69);
generalPath.curveTo(478.749, 191.22101, 497.656, 177.784, 497.656, 177.784);
generalPath.curveTo(499.583, 177.107, 499.16602, 184.711, 498.281, 184.659);
generalPath.curveTo(498.64502, 186.16899, 479.635, 199.086, 478.28, 198.565);
generalPath.curveTo(477.343, 199.242, 476.405, 193.357, 478.28, 191.69);
generalPath.closePath();
generalPath.moveTo(495.52, 191.58);
generalPath.curveTo(498.853, 193.237, 500.18, 202.987, 499.81198, 205.638);
generalPath.curveTo(499.93, 210.794, 496.59998, 214.93, 495.32898, 214.249);
generalPath.curveTo(493.94797, 213.64099, 495.44998, 207.84799, 494.787, 205.80399);
generalPath.curveTo(494.05, 202.93199, 491.22, 197.52798, 491.698, 195.98099);
generalPath.curveTo(490.759, 192.73999, 493.476, 191.00899, 495.52, 191.57999);
generalPath.closePath();
generalPath.moveTo(383.06, 233.56);
generalPath.curveTo(384.375, 231.638, 388.437, 228.872, 388.529, 228.872);
generalPath.curveTo(390.40298, 227.93399, 392.23398, 229.607, 392.123, 229.497);
generalPath.curveTo(392.435, 231.372, 390.93698, 233.11699, 391.40598, 235.618);
generalPath.curveTo(391.81598, 236.62599, 392.11597, 237.745, 393.96298, 237.318);
generalPath.curveTo(396.965, 234.956, 399.74597, 234.80399, 402.748, 234.653);
generalPath.curveTo(405.04898, 234.792, 405.13998, 238.687, 403.685, 238.716);
generalPath.curveTo(398.142, 239.921, 395.658, 241.405, 391.7, 242.916);
generalPath.curveTo(389.825, 244.009, 388.216, 242.622, 388.216, 242.466);
generalPath.curveTo(388.216, 242.31001, 387.11902, 241.40201, 387.885, 238.918);
generalPath.curveTo(388.021, 236.926, 387.21902, 235.834, 385.56, 236.06);
generalPath.curveTo(384.31, 236.736, 383.20898, 237.18399, 382.58398, 235.747);
generalPath.curveTo(382.33798, 234.68599, 382.258, 234.17, 383.06, 233.56);
generalPath.closePath();
generalPath.moveTo(515.42, 238.81);
generalPath.curveTo(516.23, 239.841, 516.75397, 240.795, 515.355, 242.489);
generalPath.curveTo(514.029, 243.704, 513.095, 244.373, 511.76898, 245.588);
generalPath.curveTo(511.14297, 246.65599, 510.74298, 248.276, 512.65796, 248.79199);
generalPath.curveTo(516.194, 249.786, 524.36993, 244.48299, 524.36993, 244.372);
generalPath.curveTo(525.6959, 243.37799, 525.2539, 241.5, 525.14294, 241.5);
generalPath.curveTo(524.36993, 240.616, 522.6279, 241.141, 521.45593, 240.998);
generalPath.curveTo(520.89795, 240.998, 519.06793, 240.72101, 519.9389, 239.101);
generalPath.curveTo(520.6659, 238.093, 520.9259, 237.476, 521.4189, 236.234);
generalPath.curveTo(521.9709, 235.019, 521.4969, 234.208, 519.5079, 233.545);
generalPath.curveTo(517.4819, 233.177, 516.67285, 233.361, 514.4259, 233.545);
generalPath.curveTo(513.2109, 233.803, 512.7959, 234.346, 512.5749, 235.819);
generalPath.curveTo(512.66187, 238.053, 514.0209, 237.926, 515.41986, 238.81);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(383.784, 183.827);
generalPath.curveTo(383.26498, 184.72299, 381.513, 184.679, 379.869, 183.72899);
generalPath.curveTo(378.22498, 182.77898, 377.314, 181.28099, 377.83298, 180.38399);
generalPath.curveTo(378.35196, 179.48698, 380.10297, 179.53198, 381.74698, 180.482);
generalPath.curveTo(383.391, 181.432, 384.30197, 182.93, 383.78397, 183.827);
generalPath.closePath();
generalPath.moveTo(297.484, 131.908);
generalPath.curveTo(296.502, 132.14801, 295.21802, 131.27301, 294.617, 129.953);
generalPath.curveTo(294.016, 128.633, 294.324, 127.367004, 295.307, 127.126);
generalPath.curveTo(296.29, 126.884995, 297.573, 127.761, 298.174, 129.082);
generalPath.curveTo(298.77502, 130.403, 298.467, 131.668, 297.484, 131.908);
generalPath.closePath();
shape = generalPath;
paint = new Color(37, 159, 0, 255);
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(468.2, 363.3);
generalPath.curveTo(477.26, 363.74197, 485.772, 363.40298, 494.832, 363.845);
generalPath.curveTo(496.473, 365.24, 495.301, 368.66602, 494.207, 368.42);
generalPath.curveTo(491.261, 368.346, 489.564, 368.273, 486.618, 368.199);
generalPath.curveTo(486.517, 365.31302, 479.152, 365.78702, 479.364, 368.29102);
generalPath.curveTo(475.38702, 368.769, 471.80002, 368.152, 467.823, 368.005);
generalPath.curveTo(466.647, 366.54102, 466.798, 363.905, 468.2, 363.30002);
generalPath.closePath();
shape = generalPath;
paint = new Color(32, 144, 0, 255);
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
        return 0.0010338516440242529;
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
		return 511.9835205078125;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 511.9834899902344;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private sa() {
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
       sa base = new sa();
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
       sa base = new sa();
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
        return sa::new;
    }
}

