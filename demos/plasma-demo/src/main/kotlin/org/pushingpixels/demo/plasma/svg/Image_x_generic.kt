package org.pushingpixels.demo.plasma.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.neon.icon.ResizableIconFactory
import org.pushingpixels.neon.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Image_x_generic private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
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
g.composite = AlphaComposite.getInstance(3, 0.5276382f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.3864840269088745f, -2.9843900203704834f))
// _0_0
paint = RadialGradientPaint(Point2D.Double(24.218406677246094, 41.63603973388672), 22.097088f, Point2D.Double(24.218406677246094, 41.63603973388672), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.18400000035762787f, 0.0f, 33.97500991821289f))
shape = GeneralPath()
shape.moveTo(46.315495, 41.63604)
shape.curveTo(46.350906, 43.092964, 42.146984, 44.442017, 35.295578, 45.172367)
shape.curveTo(28.444166, 45.902714, 19.992647, 45.902714, 13.141237, 45.172367)
shape.curveTo(6.289828, 44.442017, 2.085908, 43.092964, 2.1213188, 41.63604)
shape.curveTo(2.085908, 40.179115, 6.289828, 38.830063, 13.141237, 38.099712)
shape.curveTo(19.992647, 37.369366, 28.444166, 37.369366, 35.295578, 38.099712)
shape.curveTo(42.146984, 38.830063, 46.350906, 40.179115, 46.315495, 41.63604)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
paint = LinearGradientPaint(Point2D.Double(12.487299919128418, 3.7318999767303467), Point2D.Double(31.081300735473633, 36.032798767089844), floatArrayOf(0.0f,1.0f), arrayOf(Color(210, 210, 210, 255),Color(237, 237, 237, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.4340029954910278f, 0.0f, 0.0f, 0.9900869727134705f, 52.32167053222656f, 2.8389179706573486f))
shape = GeneralPath()
shape.moveTo(2.7177715, 6.454775)
shape.lineTo(43.379543, 6.454775)
shape.curveTo(44.002792, 6.454775, 44.504543, 6.956525, 44.504543, 7.5797744)
shape.lineTo(44.504543, 31.480581)
shape.curveTo(44.504543, 32.103832, 36.04784, 39.49987, 35.424595, 39.49987)
shape.lineTo(2.7177715, 39.49987)
shape.curveTo(2.094522, 39.49987, 1.5927727, 38.998123, 1.5927727, 38.37487)
shape.lineTo(1.5927727, 7.5797744)
shape.curveTo(1.5927727, 6.956525, 2.094522, 6.454775, 2.7177715, 6.454775)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(187, 191, 187, 255)
stroke = BasicStroke(0.99999994f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(2.7177715, 6.454775)
shape.lineTo(43.379543, 6.454775)
shape.curveTo(44.002792, 6.454775, 44.504543, 6.956525, 44.504543, 7.5797744)
shape.lineTo(44.504543, 31.480581)
shape.curveTo(44.504543, 32.103832, 36.04784, 39.49987, 35.424595, 39.49987)
shape.lineTo(2.7177715, 39.49987)
shape.curveTo(2.094522, 39.49987, 1.5927727, 38.998123, 1.5927727, 38.37487)
shape.lineTo(1.5927727, 7.5797744)
shape.curveTo(1.5927727, 6.956525, 2.094522, 6.454775, 2.7177715, 6.454775)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2 = g.transform
g.transform(AffineTransform(1.0547740459442139f, 0.0f, 0.0f, 1.0499889850616455f, -0.8146470189094543f, 4.485012054443359f))
// _0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0
paint = LinearGradientPaint(Point2D.Double(21.932600021362305, 24.627399444580078), Point2D.Double(21.932600021362305, 7.109099864959717), floatArrayOf(0.0f,1.0f), arrayOf(Color(133, 149, 188, 255),Color(4, 26, 59, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0989890098571777f, 0.0f, 0.0f, -0.7977570295333862f, -1.9538650512695312f, 37.32400131225586f))
shape = GeneralPath()
shape.moveTo(5.512695, 30.0)
shape.lineTo(39.643234, 30.0)
shape.lineTo(39.643234, 19.627375)
shape.lineTo(5.512695, 19.627375)
shape.lineTo(5.512695, 30.0)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1
paint = LinearGradientPaint(Point2D.Double(21.932600021362305, 24.627399444580078), Point2D.Double(21.932600021362305, 7.109099864959717), floatArrayOf(0.0f,1.0f), arrayOf(Color(208, 214, 229, 255),Color(9, 58, 128, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0989890098571777f, 0.0f, 0.0f, 1.1066969633102417f, -1.9538650512695312f, -4.922452926635742f))
shape = GeneralPath()
shape.moveTo(5.512695, 5.237844)
shape.lineTo(39.643234, 5.237844)
shape.lineTo(39.643234, 19.627375)
shape.lineTo(5.512695, 19.627375)
shape.lineTo(5.512695, 5.237844)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_2 = g.transform
g.transform(AffineTransform(1.1892169713974f, 0.0f, 0.0f, 1.1892169713974f, -3.525355100631714f, -6.535408020019531f))
// _0_2_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_2_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0
g.composite = AlphaComposite.getInstance(3, 0.04999994f * origAlpha)
val defaultTransform__0_2_2_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_0
paint = Color(232, 245, 47, 255)
shape = GeneralPath()
shape.moveTo(18.4, 15.4)
shape.curveTo(18.4, 17.6, 16.6, 19.5, 14.3, 19.5)
shape.curveTo(12.1, 19.5, 10.2, 17.7, 10.2, 15.4)
shape.curveTo(10.2, 13.2, 12.0, 11.3, 14.3, 11.3)
shape.curveTo(16.5, 11.3, 18.4, 13.1, 18.4, 15.4)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_2_0_0
g.composite = AlphaComposite.getInstance(3, 0.20829993f * origAlpha)
val defaultTransform__0_2_2_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_1
paint = Color(236, 247, 81, 255)
shape = GeneralPath()
shape.moveTo(18.0, 15.4)
shape.curveTo(18.0, 17.4, 16.4, 19.1, 14.3, 19.1)
shape.curveTo(12.3, 19.1, 10.6, 17.5, 10.6, 15.4)
shape.curveTo(10.6, 13.4, 12.2, 11.7, 14.3, 11.7)
shape.curveTo(16.3, 11.7, 18.0, 13.3, 18.0, 15.4)
shape.lineTo(18.0, 15.4)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_2_0_1
g.composite = AlphaComposite.getInstance(3, 0.36669993f * origAlpha)
val defaultTransform__0_2_2_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_2
paint = Color(240, 249, 114, 255)
shape = GeneralPath()
shape.moveTo(17.6, 15.4)
shape.curveTo(17.6, 17.2, 16.1, 18.7, 14.3, 18.7)
shape.curveTo(12.5, 18.7, 11.0, 17.2, 11.0, 15.4)
shape.curveTo(11.0, 13.6, 12.5, 12.1, 14.3, 12.1)
shape.curveTo(16.1, 12.1, 17.6, 13.6, 17.6, 15.4)
shape.lineTo(17.6, 15.4)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_2_0_2
g.composite = AlphaComposite.getInstance(3, 0.525f * origAlpha)
val defaultTransform__0_2_2_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_3
paint = Color(244, 250, 149, 255)
shape = GeneralPath()
shape.moveTo(17.2, 15.4)
shape.curveTo(17.2, 17.0, 15.9, 18.3, 14.3, 18.3)
shape.curveTo(12.7, 18.3, 11.4, 17.0, 11.4, 15.4)
shape.curveTo(11.4, 13.8, 12.7, 12.5, 14.3, 12.5)
shape.curveTo(15.9, 12.5, 17.2, 13.8, 17.2, 15.4)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_2_0_3
g.composite = AlphaComposite.getInstance(3, 0.6833f * origAlpha)
val defaultTransform__0_2_2_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_4
paint = Color(247, 252, 183, 255)
shape = GeneralPath()
shape.moveTo(16.8, 15.4)
shape.curveTo(16.8, 16.8, 15.7, 17.9, 14.3, 17.9)
shape.curveTo(12.9, 17.9, 11.8, 16.8, 11.8, 15.4)
shape.curveTo(11.8, 14.0, 12.9, 12.9, 14.3, 12.9)
shape.curveTo(15.7, 12.9, 16.8, 14.0, 16.8, 15.4)
shape.lineTo(16.8, 15.4)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_2_0_4
g.composite = AlphaComposite.getInstance(3, 0.8417f * origAlpha)
val defaultTransform__0_2_2_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_5
paint = Color(251, 253, 219, 255)
shape = GeneralPath()
shape.moveTo(16.4, 15.4)
shape.curveTo(16.4, 16.6, 15.4, 17.5, 14.3, 17.5)
shape.curveTo(13.2, 17.5, 12.2, 16.5, 12.2, 15.4)
shape.curveTo(12.2, 14.3, 13.2, 13.3, 14.3, 13.3)
shape.curveTo(15.4, 13.3, 16.4, 14.3, 16.4, 15.4)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_2_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_2_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_6
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(16.0, 15.4)
shape.curveTo(16.0, 16.4, 15.2, 17.2, 14.2, 17.2)
shape.curveTo(13.2, 17.2, 12.4, 16.4, 12.4, 15.4)
shape.curveTo(12.4, 14.4, 13.2, 13.6, 14.2, 13.6)
shape.curveTo(15.2, 13.6, 16.0, 14.4, 16.0, 15.4)
shape.lineTo(16.0, 15.4)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_2_0_6
g.transform = defaultTransform__0_2_2_0
g.transform = defaultTransform__0_2_2
g.composite = AlphaComposite.getInstance(3, 0.3f * origAlpha)
val defaultTransform__0_2_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_3
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(25.01586, 21.649044)
shape.lineTo(33.697147, 21.649044)
shape.lineTo(35.362053, 22.124731)
shape.lineTo(32.50793, 22.124731)
shape.curveTo(32.50793, 22.124731, 35.362053, 22.362574, 36.789116, 24.1464)
shape.curveTo(38.216175, 25.811304, 35.12421, 27.832975, 35.12421, 27.832975)
shape.curveTo(35.12421, 27.832975, 35.12421, 27.832975, 35.12421, 27.832975)
shape.curveTo(35.005287, 27.47621, 34.291756, 24.622087, 32.864697, 23.43287)
shape.curveTo(31.7944, 22.481497, 30.605183, 22.243652, 30.605183, 22.243652)
shape.lineTo(25.01586, 22.243652)
shape.lineTo(25.01586, 21.767965)
shape.lineTo(25.01586, 21.649044)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_3
g.composite = AlphaComposite.getInstance(3, 0.3f * origAlpha)
val defaultTransform__0_2_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(30.724106, 22.362574)
shape.lineTo(25.729391, 22.362574)
shape.lineTo(35.005287, 27.59513)
shape.lineTo(30.724106, 22.362574)
shape.lineTo(30.724106, 22.362574)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_5
paint = Color(81, 81, 81, 255)
shape = GeneralPath()
shape.moveTo(25.01586, 21.767965)
shape.lineTo(33.697147, 21.767965)
shape.lineTo(35.005287, 20.935513)
shape.lineTo(32.15117, 20.935513)
shape.curveTo(32.15117, 20.935513, 34.767445, 20.459827, 35.12421, 17.486782)
shape.curveTo(35.480972, 14.513739, 31.08087, 11.183931, 31.08087, 11.183931)
shape.curveTo(31.08087, 11.183931, 31.08087, 11.183931, 31.08087, 11.302853)
shape.curveTo(31.19979, 12.016383, 32.389008, 17.011095, 31.556557, 18.913845)
shape.curveTo(31.19979, 20.578747, 30.129496, 20.935513, 30.129496, 20.935513)
shape.lineTo(24.659094, 20.935513)
shape.lineTo(24.896938, 21.767965)
shape.lineTo(25.01586, 21.767965)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_6
paint = Color(81, 81, 81, 255)
shape = GeneralPath()
shape.moveTo(30.248419, 20.459827)
shape.lineTo(25.253704, 20.459827)
shape.lineTo(31.19979, 11.421773)
shape.lineTo(30.248419, 20.459827)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_6
g.transform = defaultTransform__0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(0.99999976f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(2.8042316, 7.4528584)
shape.lineTo(43.233986, 7.4528584)
shape.curveTo(43.384365, 7.4528584, 43.505432, 7.5739236, 43.505432, 7.7243047)
shape.lineTo(43.505432, 31.422651)
shape.curveTo(43.505432, 32.368526, 36.401688, 38.5, 36.251305, 38.5)
shape.lineTo(2.8042316, 38.5)
shape.curveTo(2.6538508, 38.5, 2.532786, 38.378937, 2.532786, 38.228554)
shape.lineTo(2.532786, 7.7243047)
shape.curveTo(2.532786, 7.5739236, 2.6538508, 7.4528584, 2.8042316, 7.4528584)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_3
g.composite = AlphaComposite.getInstance(3, 0.84659094f * origAlpha)
val defaultTransform__0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4
paint = Color(79, 79, 79, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = Rectangle2D.Double(5.5, 10.5, 35.0625, 25.0625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5
paint = LinearGradientPaint(Point2D.Double(35.99658203125, 40.458221435546875), Point2D.Double(33.664920806884766, 37.770721435546875), floatArrayOf(0.0f,1.0f), arrayOf(Color(124, 124, 124, 255),Color(184, 184, 184, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 5.1475701332092285f, -3.034791946411133f))
shape = GeneralPath()
shape.moveTo(35.206654, 39.46876)
shape.curveTo(37.23707, 39.79866, 44.795444, 34.938835, 44.491062, 30.970919)
shape.curveTo(42.9278, 33.394016, 39.73254, 32.257656, 35.623783, 32.416668)
shape.curveTo(35.623783, 32.416668, 36.019154, 38.96876, 35.206654, 39.46876)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(42.1875, 31.0), Point2D.Double(45.0, 39.98469161987305), floatArrayOf(0.0f,1.0f), arrayOf(Color(187, 189, 186, 255),Color(112, 116, 110, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0000002f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(35.206654, 39.46876)
shape.curveTo(37.23707, 39.79866, 44.795444, 34.938835, 44.491062, 30.970919)
shape.curveTo(42.9278, 33.394016, 39.73254, 32.257656, 35.623783, 32.416668)
shape.curveTo(35.623783, 32.416668, 36.019154, 38.96876, 35.206654, 39.46876)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_5
g.composite = AlphaComposite.getInstance(3, 0.36931816f * origAlpha)
val defaultTransform__0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_6
paint = LinearGradientPaint(Point2D.Double(33.39600372314453, 36.92133331298828), Point2D.Double(34.170047760009766, 38.07038116455078), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 5.1475701332092285f, -3.409791946411133f))
stroke = BasicStroke(0.9999998f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(36.65709, 37.27726)
shape.curveTo(38.026867, 36.593433, 41.08534, 35.130795, 42.38472, 33.24979)
shape.curveTo(40.788624, 33.929848, 39.43691, 33.45929, 36.682384, 33.440197)
shape.curveTo(36.682384, 33.440197, 36.844707, 36.502293, 36.65709, 37.27726)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_6
g.composite = AlphaComposite.getInstance(3, 0.30113637f * origAlpha)
val defaultTransform__0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_7
paint = RadialGradientPaint(Point2D.Double(12.700490951538086, 10.404875755310059), 19.96875f, Point2D.Double(12.700490951538086, 10.404875755310059), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.7105309963226318f, -5.396358033332207E-24f, 2.4703449431856023E-24f, 1.1248489618301392f, -11.568329811096191f, 1.802582025527954f))
shape = GeneralPath()
shape.moveTo(3.0625, 8.0)
shape.lineTo(3.0625, 30.0625)
shape.curveTo(25.388578, 30.950861, 27.884634, 17.0, 43.0, 17.0)
shape.lineTo(43.0, 8.0)
shape.lineTo(3.0625, 8.0)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_7
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
            return 0.6994239091873169
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 5.954774856567383
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 44.37505340576172
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 36.96355056762695
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Image_x_generic(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Image_x_generic(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): ResizableIconFactory {
            return ResizableIconFactory { Image_x_generic(16, 16) }
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

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC)
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

