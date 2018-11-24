package org.pushingpixels.demo.kormorant.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.IsHiDpiAware
import org.pushingpixels.neon.icon.NeonIcon
import org.pushingpixels.neon.icon.NeonIconUIResource
import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.neon.icon.ResizableIconFactory

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Document_open(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
	private fun innerPaint(g : Graphics2D) {
        @Suppress("UNUSED_VARIABLE") var shape: Shape?
        @Suppress("UNUSED_VARIABLE") var paint: Paint?
        @Suppress("UNUSED_VARIABLE") var stroke: Stroke?
         
        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    val defaultTransform_ = g.transform
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0
paint = RadialGradientPaint(Point2D.Double(26.10677719116211, 38.19511413574219), 32.25977f, Point2D.Double(26.10677719116211, 38.19511413574219), floatArrayOf(0.0f,1.0f), arrayOf(Color(160, 160, 160, 255),Color(168, 168, 168, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0156350135803223f, 0.0f, 0.10310500115156174f, 1.0005120038986206f, 0.0f, -0.08369457721710205f))
shape = GeneralPath()
shape.moveTo(4.6200285, 38.651016)
shape.curveTo(4.6618366, 39.07147, 5.117414, 39.491924, 5.5311837, 39.491924)
shape.lineTo(36.667347, 39.491924)
shape.curveTo(37.081116, 39.491924, 37.45308, 39.07147, 37.41127, 38.651016)
shape.lineTo(34.714653, 11.531728)
shape.curveTo(34.672844, 11.111274, 34.217266, 10.69082, 33.803497, 10.69082)
shape.lineTo(21.080082, 10.69082)
shape.curveTo(20.489536, 10.69082, 19.870998, 10.311268, 19.677221, 9.730485)
shape.lineTo(18.574219, 6.4246087)
shape.curveTo(18.404966, 5.9173307, 18.02707, 5.6888137, 17.259747, 5.6888137)
shape.lineTo(2.3224187, 5.6888137)
shape.curveTo(1.9086492, 5.6888137, 1.5366876, 6.109268, 1.5784956, 6.529722)
shape.lineTo(4.6200285, 38.651016)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(90, 90, 90, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.6200285, 38.651016)
shape.curveTo(4.6618366, 39.07147, 5.117414, 39.491924, 5.5311837, 39.491924)
shape.lineTo(36.667347, 39.491924)
shape.curveTo(37.081116, 39.491924, 37.45308, 39.07147, 37.41127, 38.651016)
shape.lineTo(34.714653, 11.531728)
shape.curveTo(34.672844, 11.111274, 34.217266, 10.69082, 33.803497, 10.69082)
shape.lineTo(21.080082, 10.69082)
shape.curveTo(20.489536, 10.69082, 19.870998, 10.311268, 19.677221, 9.730485)
shape.lineTo(18.574219, 6.4246087)
shape.curveTo(18.404966, 5.9173307, 18.02707, 5.6888137, 17.259747, 5.6888137)
shape.lineTo(2.3224187, 5.6888137)
shape.curveTo(1.9086492, 5.6888137, 1.5366876, 6.109268, 1.5784956, 6.529722)
shape.lineTo(4.6200285, 38.651016)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_0
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(3.3386018, 17.533487)
shape.lineTo(34.48846, 17.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(3.3386018, 17.533487)
shape.lineTo(34.48846, 17.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_1
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.3301525, 37.533485)
shape.lineTo(35.317905, 37.533485)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.3301525, 37.533485)
shape.lineTo(35.317905, 37.533485)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_2
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.3301525, 35.533485)
shape.lineTo(35.317905, 35.533485)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.3301525, 35.533485)
shape.lineTo(35.317905, 35.533485)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_4 = g.transform
g.transform(AffineTransform(0.02165151946246624f, 0.0f, 0.0f, 0.019038410857319832f, 42.41537857055664f, 36.933719635009766f))
// _0_1_4
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
val defaultTransform__0_1_4_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4_0
paint = LinearGradientPaint(Point2D.Double(302.8571472167969, 366.64788818359375), Point2D.Double(302.8571472167969, 609.5050659179688), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(0, 0, 0, 0),Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f))
shape = Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_4_0
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
val defaultTransform__0_1_4_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4_1
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f))
shape = GeneralPath()
shape.moveTo(-219.61876, -150.68037)
shape.curveTo(-219.61876, -150.68037, -219.61876, 327.65042, -219.61876, 327.65042)
shape.curveTo(-76.74459, 328.55087, 125.78146, 220.48074, 125.78138, 88.45424)
shape.curveTo(125.78138, -43.572304, -33.655437, -150.68036, -219.61876, -150.68037)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_4_1
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
val defaultTransform__0_1_4_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4_2
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f))
shape = GeneralPath()
shape.moveTo(-1559.2523, -150.68037)
shape.curveTo(-1559.2523, -150.68037, -1559.2523, 327.65042, -1559.2523, 327.65042)
shape.curveTo(-1702.1265, 328.55087, -1904.6525, 220.48074, -1904.6525, 88.45424)
shape.curveTo(-1904.6525, -43.572304, -1745.2157, -150.68036, -1559.2523, -150.68037)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_4_2
g.transform = defaultTransform__0_1_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_5
paint = LinearGradientPaint(Point2D.Double(5.265791416168213, 18.725862503051758), Point2D.Double(8.212224006652832, 52.625850677490234), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 179),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.4626959562301636f, 0.0f, 0.06907907873392105f, 0.6836689710617065f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(6.171752, 38.418674)
shape.curveTo(6.203108, 38.729, 6.017127, 38.935886, 5.6963477, 38.832443)
shape.lineTo(5.6963477, 38.832443)
shape.curveTo(5.3755684, 38.729, 5.14778, 38.522118, 5.1164236, 38.21179)
shape.lineTo(2.0868573, 6.8445945)
shape.curveTo(2.0555012, 6.534267, 2.243451, 6.346871, 2.5537784, 6.346871)
shape.lineTo(17.303532, 6.255425)
shape.curveTo(17.834814, 6.2521315, 18.04296, 6.308731, 18.18333, 6.7726374)
shape.curveTo(18.18333, 6.7726374, 19.268703, 9.885435, 19.429564, 10.470742)
shape.lineTo(17.873968, 7.553706)
shape.curveTo(17.608788, 7.0564437, 17.275225, 7.1399364, 16.901178, 7.1399364)
shape.lineTo(3.7717774, 7.1399364)
shape.curveTo(3.4614503, 7.1399364, 3.2754695, 7.3468213, 3.3068254, 7.657149)
shape.lineTo(6.285646, 38.522118)
shape.lineTo(6.171752, 38.418674)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_5
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_6
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(2.3052332, 7.533487)
shape.lineTo(17.088966, 7.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(0.9999998f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(2.3052332, 7.533487)
shape.lineTo(17.088966, 7.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_6
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_7
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(2.7573333, 11.533487)
shape.lineTo(33.496216, 11.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000001f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(2.7573333, 11.533487)
shape.lineTo(33.496216, 11.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_8 = g.transform
g.transform(AffineTransform(1.0344239473342896f, 0.0f, 0.10452000051736832f, 1.0344239473342896f, -10.032480239868164f, 2.631913900375366f))
// _0_1_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_8_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_8_0
paint = Color(255, 255, 255, 148)
shape = GeneralPath()
shape.moveTo(41.785744, 9.0363865)
shape.curveTo(41.79537, 8.561804, 41.800934, 8.311881, 41.36235, 8.312183)
shape.lineTo(28.80653, 8.32084)
shape.curveTo(28.50653, 8.32084, 28.481916, 8.177634, 28.80653, 8.32084)
shape.curveTo(29.131144, 8.4640465, 30.053629, 8.979112, 30.989227, 9.021835)
shape.curveTo(30.989227, 9.021835, 41.785706, 9.038299, 41.785744, 9.0363865)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_8_0
g.transform = defaultTransform__0_1_8
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_9
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(3.1628954, 15.533487)
shape.lineTo(33.99345, 15.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(0.99999994f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(3.1628954, 15.533487)
shape.lineTo(33.99345, 15.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_9
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_10
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.1594715, 33.533485)
shape.lineTo(35.147224, 33.533485)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.1594715, 33.533485)
shape.lineTo(35.147224, 33.533485)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_10
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_11
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(4.8658085, 31.533487)
shape.lineTo(34.974533, 31.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.8658085, 31.533487)
shape.lineTo(34.974533, 31.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_11
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_12
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(4.6336365, 29.533487)
shape.lineTo(34.80285, 29.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.6336365, 29.533487)
shape.lineTo(34.80285, 29.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_12
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_13
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(4.4629555, 27.533487)
shape.lineTo(34.632168, 27.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.4629555, 27.533487)
shape.lineTo(34.632168, 27.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_13
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_14 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_14
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(4.255672, 25.533487)
shape.lineTo(34.460793, 25.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.255672, 25.533487)
shape.lineTo(34.460793, 25.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_14
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_15 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_15
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(4.02352, 23.533487)
shape.lineTo(34.2891, 23.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.02352, 23.533487)
shape.lineTo(34.2891, 23.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_15
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_16 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_16
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(3.852839, 21.533487)
shape.lineTo(34.11842, 21.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(3.852839, 21.533487)
shape.lineTo(34.11842, 21.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_16
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_17 = g.transform
g.transform(AffineTransform(1.0344239473342896f, 0.0f, 0.10452000051736832f, 1.0344239473342896f, -10.032480239868164f, 2.631913900375366f))
// _0_1_17
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_17_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_17_0
paint = Color(255, 255, 255, 148)
shape = GeneralPath()
shape.moveTo(41.785744, 9.0363865)
shape.curveTo(41.79537, 8.561804, 41.800934, 8.311881, 41.36235, 8.312183)
shape.lineTo(28.80653, 8.32084)
shape.curveTo(28.50653, 8.32084, 28.481916, 8.177634, 28.80653, 8.32084)
shape.curveTo(29.131144, 8.4640465, 30.053629, 8.979112, 30.989227, 9.021835)
shape.curveTo(30.989227, 9.021835, 41.785706, 9.038299, 41.785744, 9.0363865)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_17_0
g.transform = defaultTransform__0_1_17
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_18 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_18
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(2.9642313, 13.533487)
shape.lineTo(33.990734, 13.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(2.9642313, 13.533487)
shape.lineTo(33.990734, 13.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_18
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_19 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_19
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(3.651419, 19.533487)
shape.lineTo(33.947216, 19.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000001f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(3.651419, 19.533487)
shape.lineTo(33.947216, 19.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_19
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_1_20 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_20
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(2.5242572, 9.533487)
shape.lineTo(17.805073, 9.533487)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(2.5242572, 9.533487)
shape.lineTo(17.805073, 9.533487)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_20
g.composite = AlphaComposite.getInstance(3, 0.39204544f * origAlpha)
val defaultTransform__0_1_21 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_21
paint = LinearGradientPaint(Point2D.Double(22.25, 37.625), Point2D.Double(19.75, 14.875), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(34.375, 14.125)
shape.lineTo(37.0, 38.75)
shape.lineTo(6.0, 38.875)
shape.curveTo(6.0, 38.875, 4.125, 14.125, 4.125, 14.125)
shape.curveTo(4.125, 14.125, 34.5, 14.125, 34.375, 14.125)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_21
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_22 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_22
paint = LinearGradientPaint(Point2D.Double(25.875, 10.625), Point2D.Double(25.25, 30.875), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(250, 250, 250, 255),Color(168, 168, 168, 255),Color(205, 205, 205, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.2388060092926025f, 0.0f, -7.880597114562988f))
shape = GeneralPath()
shape.moveTo(43.375, 2.4944034)
shape.curveTo(43.875, 19.373135, 34.29994, 21.022879, 37.36244, 31.494661)
shape.curveTo(37.36244, 31.494661, 5.875, 32.380596, 5.875, 32.380596)
shape.curveTo(4.0, 19.527987, 14.25, 11.166045, 11.25, 2.649254)
shape.lineTo(43.375, 2.4944034)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = RadialGradientPaint(Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, Point2D.Double(8.824419021606445, 3.7561285495758057), floatArrayOf(0.0f,1.0f), arrayOf(Color(163, 163, 163, 255),Color(76, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.046686053276062f, 44.36452865600586f, -17.007169723510742f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(43.375, 2.4944034)
shape.curveTo(43.875, 19.373135, 34.29994, 21.022879, 37.36244, 31.494661)
shape.curveTo(37.36244, 31.494661, 5.875, 32.380596, 5.875, 32.380596)
shape.curveTo(4.0, 19.527987, 14.25, 11.166045, 11.25, 2.649254)
shape.lineTo(43.375, 2.4944034)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_22
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_23 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_23
paint = Color(161, 161, 161, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(15.4375, 6.5625)
shape.lineTo(39.0, 6.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_23
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_24 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_24
paint = LinearGradientPaint(Point2D.Double(22.175975799560547, 36.987998962402344), Point2D.Double(22.065330505371094, 32.050498962402344), floatArrayOf(0.0f,1.0f), arrayOf(Color(97, 148, 203, 255),Color(114, 159, 207, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0221179723739624f, 52.05693817138672f, -1.3230259418487549f))
shape = GeneralPath()
shape.moveTo(5.7785654, 39.065998)
shape.curveTo(5.8820076, 39.277466, 6.0888915, 39.488926, 6.399217, 39.488926)
shape.lineTo(39.70767, 39.488926)
shape.curveTo(39.914562, 39.488926, 40.228832, 39.36262, 40.415844, 39.224575)
shape.curveTo(40.946247, 38.83304, 41.070705, 38.61219, 41.308624, 38.251106)
shape.curveTo(43.756752, 34.53565, 47.113766, 18.974215, 47.113766, 18.974215)
shape.curveTo(47.21721, 18.762754, 47.010326, 18.551294, 46.7, 18.551294)
shape.lineTo(11.776358, 18.551294)
shape.curveTo(11.466032, 18.551294, 10.120393, 34.658623, 6.913359, 37.838318)
shape.lineTo(5.6751237, 39.065998)
shape.lineTo(5.7785654, 39.065998)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(0.9999998f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.7785654, 39.065998)
shape.curveTo(5.8820076, 39.277466, 6.0888915, 39.488926, 6.399217, 39.488926)
shape.lineTo(39.70767, 39.488926)
shape.curveTo(39.914562, 39.488926, 40.228832, 39.36262, 40.415844, 39.224575)
shape.curveTo(40.946247, 38.83304, 41.070705, 38.61219, 41.308624, 38.251106)
shape.curveTo(43.756752, 34.53565, 47.113766, 18.974215, 47.113766, 18.974215)
shape.curveTo(47.21721, 18.762754, 47.010326, 18.551294, 46.7, 18.551294)
shape.lineTo(11.776358, 18.551294)
shape.curveTo(11.466032, 18.551294, 10.120393, 34.658623, 6.913359, 37.838318)
shape.lineTo(5.6751237, 39.065998)
shape.lineTo(5.7785654, 39.065998)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_24
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_25 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_25
paint = Color(161, 161, 161, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(15.356073, 8.5625)
shape.lineTo(35.08142, 8.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_25
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_26 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_26
paint = LinearGradientPaint(Point2D.Double(14.899378776550293, 27.059642791748047), Point2D.Double(22.71544647216797, 41.83689498901367), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 34),Color(255, 255, 255, 13)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5352989435195923f, 0.0f, 0.0f, 0.6513389945030212f, 3.451417922973633f, 2.447999954223633f))
shape = GeneralPath()
shape.moveTo(13.134476, 20.138641)
shape.curveTo(12.361729, 25.129398, 11.633175, 29.147884, 10.418486, 33.652504)
shape.curveTo(12.804971, 32.945396, 17.534601, 30.448, 27.534601, 30.448)
shape.curveTo(37.534603, 30.448, 44.258175, 21.1993, 45.186253, 20.094446)
shape.lineTo(13.134476, 20.138641)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_26
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_27 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_27
paint = Color(161, 161, 161, 255)
stroke = BasicStroke(1.0000001f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(15.143007, 10.5625)
shape.lineTo(39.457832, 10.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_27
g.composite = AlphaComposite.getInstance(3, 0.52272725f * origAlpha)
val defaultTransform__0_1_28 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_28
paint = LinearGradientPaint(Point2D.Double(19.11611557006836, 28.946041107177734), Point2D.Double(19.426923751831055, 51.91269302368164), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.4215370416641235f, 0.0f, 0.0f, 0.7034639716148376f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(45.820084, 19.6875)
shape.lineTo(12.661612, 19.6875)
shape.curveTo(12.661612, 19.6875, 10.513864, 35.707108, 7.93934, 37.928078)
shape.curveTo(16.060417, 37.928078, 39.51051, 37.87944, 39.53033, 37.87944)
shape.curveTo(41.28199, 37.87944, 44.43797, 25.243248, 45.820084, 19.6875)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_28
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_29 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_29
paint = Color(161, 161, 161, 255)
stroke = BasicStroke(1.0000002f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(14.398767, 12.5625)
shape.lineTo(38.25216, 12.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_29
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_30 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_30
paint = Color(161, 161, 161, 255)
stroke = BasicStroke(1.0000005f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(13.629028, 14.5625)
shape.lineTo(36.97533, 14.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_30
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_31 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_31
paint = Color(161, 161, 161, 255)
stroke = BasicStroke(1.0000002f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(12.520679, 16.5625)
shape.lineTo(31.16684, 16.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_31
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_32 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_32
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(6.375, 31.75)
shape.curveTo(5.1336346, 19.511961, 13.5625, 12.6875, 12.0, 3.0)
shape.lineTo(42.875, 3.0)
shape.lineTo(12.875, 3.625)
shape.curveTo(14.125, 13.1875, 6.6786165, 18.271446, 6.375, 31.75)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_32
g.transform = defaultTransform__0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
g.transform = defaultTransform__0_2
g.transform = defaultTransform__0
g.transform = defaultTransform_

	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 1.0461368560791016
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 1.9921634197235107
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 46.661460876464844
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 41.19664001464844
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Document_open(width, height))
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Document_open(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): ResizableIconFactory {
            return ResizableIconFactory { NeonIcon(Document_open(16, 16)) }
        }
    }

    override fun getIconHeight(): Int {
        return width
    }

    override fun getIconWidth(): Int {
        return height
    }

    override fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override fun isHiDpiAware(): Boolean {
        return true
    }

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
        g2d.translate(x, y)

        val coef1 = this.width.toDouble() / getOrigWidth()
        val coef2 = this.height.toDouble() / getOrigHeight()
        val coef = Math.min(coef1, coef2)
        g2d.clipRect(0, 0, this.width, this.height)
        g2d.scale(coef, coef)
        g2d.translate(-getOrigX(), -getOrigY())
        if (coef1 != coef2) {
            if (coef1 < coef2) {
                val extraDy = ((getOrigWidth() - getOrigHeight()) / 2.0).toInt()
                g2d.translate(0, extraDy)
            } else {
                val extraDx = ((getOrigHeight() - getOrigWidth()) / 2.0).toInt()
                g2d.translate(extraDx, 0)
            }
        }
        val g2ForInner = g2d.create() as Graphics2D
        innerPaint(g2ForInner)
        g2ForInner.dispose()
        g2d.dispose()

    }
}

