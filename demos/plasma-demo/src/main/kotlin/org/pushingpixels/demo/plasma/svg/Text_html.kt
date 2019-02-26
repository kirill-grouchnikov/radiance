package org.pushingpixels.demo.plasma.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.neon.icon.ResizableIcon.Factory
import org.pushingpixels.neon.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Text_html private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 0.56725144f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.167598009109497f, 0.0f, 0.0f, 1.0f, -4.880565166473389f, 0.17202000319957733f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(24.306795120239258, 42.077980041503906), 15.821514f, Point2D.Double(24.306795120239258, 42.077980041503906), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.2849160134792328f, -7.702171174545839E-16f, 30.089279174804688f))
shape = GeneralPath()
shape.moveTo(40.128307, 42.07798)
shape.curveTo(40.15366, 43.693268, 37.143654, 45.188953, 32.23805, 45.998688)
shape.curveTo(27.332438, 46.808426, 21.28115, 46.808426, 16.375542, 45.998688)
shape.curveTo(11.469933, 45.188953, 8.459927, 43.693268, 8.485281, 42.07798)
shape.curveTo(8.459927, 40.462692, 11.469933, 38.967007, 16.375542, 38.157272)
shape.curveTo(21.28115, 37.347534, 27.332438, 37.347534, 32.23805, 38.157272)
shape.curveTo(37.143654, 38.967007, 40.15366, 40.462692, 40.128307, 42.07798)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0
paint = RadialGradientPaint(Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, Point2D.Double(33.966678619384766, 35.736915588378906), floatArrayOf(0.0f,1.0f), arrayOf(Color(250, 250, 250, 255),Color(187, 187, 187, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.0411319732666016f, 0.0f, 0.0f))
shape = RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746)
g.paint = paint
g.fill(shape)
paint = RadialGradientPaint(Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, Point2D.Double(8.824419021606445, 3.7561285495758057), floatArrayOf(0.0f,1.0f), arrayOf(Color(163, 163, 163, 255),Color(76, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
paint = RadialGradientPaint(Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, Point2D.Double(8.143556594848633, 7.26789665222168), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(248, 248, 248, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(7.666053771972656, 4.583946228027344, 32.77588653564453, 38.94638442993164, 0.2980971336364746, 0.2980971336364746)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.6464470028877258f, -0.03798932954668999f))
// _0_1_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2_0 = g.transform
g.transform(AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.967081069946289f, 4.244972229003906f))
// _0_1_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_0_0
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(23.428, 113.07)
shape.curveTo(23.428, 115.043, 21.828, 116.642, 19.855, 116.642)
shape.curveTo(17.881, 116.642, 16.282, 115.042, 16.282, 113.07)
shape.curveTo(16.282, 111.096, 17.882, 109.497, 19.855, 109.497)
shape.curveTo(21.828, 109.497, 23.428, 111.097, 23.428, 113.07)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_2_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_0_1
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(23.428, 63.07)
shape.curveTo(23.428, 65.043, 21.828, 66.643, 19.855, 66.643)
shape.curveTo(17.881, 66.643, 16.282, 65.043, 16.282, 63.07)
shape.curveTo(16.282, 61.096, 17.882, 59.497, 19.855, 59.497)
shape.curveTo(21.828, 59.497, 23.428, 61.097, 23.428, 63.07)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_2_0_1
g.transform = defaultTransform__0_1_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_1
paint = RadialGradientPaint(Point2D.Double(20.892099380493164, 114.56839752197266), 5.256f, Point2D.Double(20.892099380493164, 114.56839752197266), floatArrayOf(0.0f,1.0f), arrayOf(Color(240, 240, 240, 255),Color(154, 154, 154, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f))
shape = GeneralPath()
shape.moveTo(9.995011, 29.952326)
shape.curveTo(9.995011, 30.40553, 9.627486, 30.772825, 9.174282, 30.772825)
shape.curveTo(8.720848, 30.772825, 8.353554, 30.4053, 8.353554, 29.952326)
shape.curveTo(8.353554, 29.498892, 8.721078, 29.131598, 9.174282, 29.131598)
shape.curveTo(9.627486, 29.131598, 9.995011, 29.499123, 9.995011, 29.952326)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_2_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_2
paint = RadialGradientPaint(Point2D.Double(20.892099380493164, 64.56790161132812), 5.257f, Point2D.Double(20.892099380493164, 64.56790161132812), floatArrayOf(0.0f,1.0f), arrayOf(Color(240, 240, 240, 255),Color(154, 154, 154, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f))
shape = GeneralPath()
shape.moveTo(9.995011, 18.467176)
shape.curveTo(9.995011, 18.92038, 9.627486, 19.287905, 9.174282, 19.287905)
shape.curveTo(8.720848, 19.287905, 8.353554, 18.92038, 8.353554, 18.467176)
shape.curveTo(8.353554, 18.013742, 8.721078, 17.646446, 9.174282, 17.646446)
shape.curveTo(9.627486, 17.646446, 9.995011, 18.013971, 9.995011, 18.467176)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_2_2
g.transform = defaultTransform__0_1_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
paint = Color(0, 0, 0, 4)
stroke = BasicStroke(0.9885531f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(11.505723, 5.4942765)
shape.lineTo(11.505723, 43.400867)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4
paint = Color(255, 255, 255, 52)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(12.5, 5.0205154)
shape.lineTo(12.5, 43.038227)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_4
g.transform = defaultTransform__0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0 = g.transform
g.transform(AffineTransform(0.9090909957885742f, 0.0f, 0.0f, 1.0f, 2.3636279106140137f, 0.0f))
// _0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_0
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 9.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_1
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 11.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_2
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 13.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_3
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 15.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_4
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 17.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_5
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 19.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_6
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 21.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_7
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 23.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_8
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 25.0, 9.900005340576172, 1.0, 0.1364084780216217, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_9
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 29.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_10
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 31.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_11
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 33.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_12
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 35.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_12
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_13
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 37.0, 15.40001392364502, 1.0, 0.21219104528427124, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_13
g.transform = defaultTransform__0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1 = g.transform
g.transform(AffineTransform(1.1605110168457031f, 0.0f, 0.0f, 1.1605110168457031f, 1.8477129936218262f, 3.119486093521118f))
// _0_2_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_0 = g.transform
g.transform(AffineTransform(0.5871359705924988f, 0.0f, 0.0f, 0.7299540042877197f, 11.299189567565918f, 4.3983588218688965f))
// _0_2_1_0
paint = RadialGradientPaint(Point2D.Double(15.115513801574707, 63.965389251708984), 12.289036f, Point2D.Double(15.115513801574707, 63.965389251708984), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.6439900398254395f, 0.0f, 0.0f, 0.6082760095596313f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(45.052803, 38.908627)
shape.curveTo(45.08518, 41.587196, 41.241596, 44.06744, 34.97745, 45.410194)
shape.curveTo(28.713305, 46.75295, 20.9862, 46.75295, 14.722055, 45.410194)
shape.curveTo(8.45791, 44.06744, 4.6143265, 41.587196, 4.646702, 38.908627)
shape.curveTo(4.6143265, 36.230057, 8.45791, 33.749813, 14.722055, 32.40706)
shape.curveTo(20.9862, 31.064304, 28.713305, 31.064304, 34.97745, 32.40706)
shape.curveTo(41.241596, 33.749813, 45.08518, 36.230057, 45.052803, 38.908627)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_1
paint = RadialGradientPaint(Point2D.Double(18.247644424438477, 15.716078758239746), 29.99335f, Point2D.Double(18.247644424438477, 15.716078758239746), floatArrayOf(0.0f,0.15517241f,0.75f,1.0f), arrayOf(Color(211, 233, 255, 255),Color(211, 233, 255, 255),Color(64, 116, 174, 255),Color(54, 72, 108, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5871300101280212f, 0.0f, 0.0f, 0.5871419906616211f, 11.299189567565918f, 10.429670333862305f))
shape = GeneralPath()
shape.moveTo(37.109608, 24.218857)
shape.curveTo(37.109608, 30.50692, 32.012028, 35.60444, 25.72483, 35.60444)
shape.curveTo(19.437057, 35.60444, 14.339767, 30.50686, 14.339767, 24.218857)
shape.curveTo(14.339767, 17.931082, 19.437057, 12.834081, 25.72483, 12.834081)
shape.curveTo(32.012028, 12.834081, 37.109608, 17.931082, 37.109608, 24.218857)
shape.lineTo(37.109608, 24.218857)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(57, 57, 108, 255)
stroke = BasicStroke(1.7233788f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(37.109608, 24.218857)
shape.curveTo(37.109608, 30.50692, 32.012028, 35.60444, 25.72483, 35.60444)
shape.curveTo(19.437057, 35.60444, 14.339767, 30.50686, 14.339767, 24.218857)
shape.curveTo(14.339767, 17.931082, 19.437057, 12.834081, 25.72483, 12.834081)
shape.curveTo(32.012028, 12.834081, 37.109608, 17.931082, 37.109608, 24.218857)
shape.lineTo(37.109608, 24.218857)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2_1_1
g.composite = AlphaComposite.getInstance(3, 0.42159382f * origAlpha)
val defaultTransform__0_2_1_2 = g.transform
g.transform(AffineTransform(0.49080899357795715f, 0.0f, 0.0f, 0.5871359705924988f, 17.104129791259766f, 10.429670333862305f))
// _0_2_1_2
paint = RadialGradientPaint(Point2D.Double(11.82690715789795, 10.476452827453613), 32.66485f, Point2D.Double(11.82690715789795, 10.476452827453613), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.179535984992981f, 0.0f, 0.0f, 0.8477910161018372f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(30.708637, 15.271057)
shape.curveTo(30.729357, 18.601171, 28.269464, 21.684715, 24.26041, 23.354086)
shape.curveTo(20.251358, 25.023458, 15.306011, 25.023458, 11.296958, 23.354086)
shape.curveTo(7.287905, 21.684715, 4.8280115, 18.601171, 4.848732, 15.271057)
shape.curveTo(4.8280115, 11.940943, 7.287905, 8.857399, 11.296958, 7.1880274)
shape.curveTo(15.306011, 5.5186563, 20.251358, 5.5186563, 24.26041, 7.1880274)
shape.curveTo(28.269464, 8.857399, 30.729357, 11.940943, 30.708637, 15.271057)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3 = g.transform
g.transform(AffineTransform(0.5767859816551208f, 0.0f, 0.0f, 0.5767859816551208f, 11.370280265808105f, 10.56641960144043f))
// _0_2_1_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_0_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
shape.moveTo(44.0713, 20.7144)
shape.curveTo(44.0713, 20.9771, 44.0713, 20.7144, 44.0713, 20.7144)
shape.lineTo(43.5264, 21.3316)
shape.curveTo(43.1924, 20.938, 42.8174, 20.607, 42.4366, 20.2613)
shape.lineTo(41.6007, 20.3843)
shape.lineTo(40.837, 19.521)
shape.lineTo(40.837, 20.5894)
shape.lineTo(41.4913, 21.0845)
shape.lineTo(41.9268, 21.5777)
shape.lineTo(42.5088, 20.9195)
shape.curveTo(42.6553, 21.1939, 42.7998, 21.4683, 42.9453, 21.7427)
shape.lineTo(42.9453, 22.565)
shape.lineTo(42.29, 23.3052)
shape.lineTo(41.0908, 24.1284)
shape.lineTo(40.1826, 25.0347)
shape.lineTo(39.6006, 24.3745)
shape.lineTo(39.8916, 23.6343)
shape.lineTo(39.3105, 22.9761)
shape.lineTo(38.3291, 20.8784)
shape.lineTo(37.4932, 19.9331)
shape.lineTo(37.2744, 20.1792)
shape.lineTo(37.6025, 21.3726)
shape.lineTo(38.2197, 22.0718)
shape.curveTo(38.5722, 23.0894, 38.9209, 24.062, 39.3838, 25.0347)
shape.curveTo(40.1016, 25.0347, 40.7783, 24.9585, 41.4912, 24.8687)
shape.lineTo(41.4912, 25.4449)
shape.lineTo(40.6191, 27.5841)
shape.lineTo(39.8193, 28.4884)
shape.lineTo(39.165, 29.8888)
shape.curveTo(39.165, 30.6564, 39.165, 31.424, 39.165, 32.1915)
shape.lineTo(39.3838, 33.0978)
shape.lineTo(39.0205, 33.508)
shape.lineTo(38.2197, 34.0021)
shape.lineTo(37.3838, 34.7013)
shape.lineTo(38.0752, 35.4826)
shape.lineTo(37.1299, 36.3068)
shape.lineTo(37.3115, 36.84)
shape.lineTo(35.8935, 38.4455)
shape.lineTo(34.9492, 38.4455)
shape.lineTo(34.1494, 38.9396)
shape.lineTo(33.6396, 38.9396)
shape.lineTo(33.6396, 38.2814)
shape.lineTo(33.4228, 36.963)
shape.curveTo(33.1415, 36.1368, 32.8486, 35.3165, 32.5507, 34.4962)
shape.curveTo(32.5507, 33.8907, 32.5868, 33.2911, 32.623, 32.6857)
shape.lineTo(32.9873, 31.8634)
shape.lineTo(32.4775, 30.8751)
shape.lineTo(32.5146, 29.5177)
shape.lineTo(31.8232, 28.7364)
shape.lineTo(32.1689, 27.6055)
shape.lineTo(31.6064, 26.9673)
shape.lineTo(30.624, 26.9673)
shape.lineTo(30.2969, 26.5972)
shape.lineTo(29.3155, 27.2149)
shape.lineTo(28.9161, 26.7613)
shape.lineTo(28.0069, 27.543)
shape.curveTo(27.3897, 26.8433, 26.7715, 26.1441, 26.1534, 25.4449)
shape.lineTo(25.4268, 23.7164)
shape.lineTo(26.0811, 22.7301)
shape.lineTo(25.7178, 22.319)
shape.lineTo(26.5166, 20.4254)
shape.curveTo(27.1729, 19.609, 27.8584, 18.8258, 28.5518, 18.0397)
shape.lineTo(29.7881, 17.7106)
shape.lineTo(31.169, 17.5465)
shape.lineTo(32.1143, 17.7936)
shape.lineTo(33.459, 19.15)
shape.lineTo(33.9317, 18.6158)
shape.lineTo(34.585, 18.5338)
shape.lineTo(35.8213, 18.9449)
shape.lineTo(36.7666, 18.9449)
shape.lineTo(37.4209, 18.3687)
shape.lineTo(37.7119, 17.9576)
shape.lineTo(37.0566, 17.5465)
shape.lineTo(35.9658, 17.4645)
shape.curveTo(35.6631, 17.0446, 35.3818, 16.6032, 35.0224, 16.2301)
shape.lineTo(34.6581, 16.3942)
shape.lineTo(34.5126, 17.4645)
shape.lineTo(33.8583, 16.7243)
shape.lineTo(33.7138, 15.9001)
shape.lineTo(32.9872, 15.3259)
shape.lineTo(32.6952, 15.3259)
shape.lineTo(33.4227, 16.1482)
shape.lineTo(33.1317, 16.8884)
shape.lineTo(32.5506, 17.0525)
shape.lineTo(32.9139, 16.3123)
shape.lineTo(32.2586, 15.9842)
shape.lineTo(31.6785, 15.326)
shape.lineTo(30.5867, 15.5721)
shape.lineTo(30.4422, 15.9002)
shape.lineTo(29.7879, 16.3123)
shape.lineTo(29.4246, 17.2176)
shape.lineTo(28.5164, 17.6697)
shape.lineTo(28.116, 17.2176)
shape.lineTo(27.6805, 17.2176)
shape.lineTo(27.6805, 15.7362)
shape.lineTo(28.6258, 15.2421)
shape.lineTo(29.3524, 15.2421)
shape.lineTo(29.2059, 14.6669)
shape.lineTo(28.6258, 14.0907)
shape.lineTo(29.6063, 13.8846)
shape.lineTo(30.1512, 13.2684)
shape.lineTo(30.5867, 12.5272)
shape.lineTo(31.3875, 12.5272)
shape.lineTo(31.1687, 11.952)
shape.lineTo(31.6785, 11.6229)
shape.lineTo(31.6785, 12.2811)
shape.lineTo(32.7683, 12.5272)
shape.lineTo(33.8581, 11.6229)
shape.lineTo(33.9313, 11.2108)
shape.lineTo(34.8756, 10.5531)
shape.curveTo(34.5338, 10.5956, 34.192, 10.6268, 33.858, 10.7177)
shape.lineTo(33.858, 9.9766)
shape.lineTo(34.2213, 9.1538)
shape.lineTo(33.858, 9.1538)
shape.lineTo(33.0596, 9.894)
shape.lineTo(32.8408, 10.3056)
shape.lineTo(33.0596, 10.8823)
shape.lineTo(32.6953, 11.8686)
shape.lineTo(32.1142, 11.5395)
shape.lineTo(31.6064, 10.9643)
shape.lineTo(30.8056, 11.5395)
shape.lineTo(30.5146, 10.2236)
shape.lineTo(31.8955, 9.3188)
shape.lineTo(31.8955, 8.8247)
shape.lineTo(32.7685, 8.249001)
shape.lineTo(34.1494, 7.9194)
shape.lineTo(35.0947, 8.249001)
shape.lineTo(36.8388, 8.5781)
shape.lineTo(36.4033, 9.0713005)
shape.lineTo(35.458, 9.0713005)
shape.lineTo(36.4033, 10.0586)
shape.lineTo(37.1299, 9.2363)
shape.lineTo(37.3506, 8.8745)
shape.curveTo(37.3506, 8.8745, 40.1377, 11.3725, 41.7305, 14.105)
shape.curveTo(43.3233, 16.8384, 44.0713, 20.0601, 44.0713, 20.7144)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_0_0_0
g.transform = defaultTransform__0_2_1_3_0_0
g.transform = defaultTransform__0_2_1_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_1_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_1_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_1_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
shape.moveTo(26.0703, 9.2363)
shape.lineTo(25.9971, 9.7295)
shape.lineTo(26.5069, 10.0586)
shape.lineTo(27.378, 9.4829)
shape.lineTo(26.9425, 8.9892)
shape.lineTo(26.3605, 9.3188)
shape.lineTo(26.0705, 9.2363)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_1_0_0
g.transform = defaultTransform__0_2_1_3_1_0
g.transform = defaultTransform__0_2_1_3_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_2_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_2_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_2_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
shape.moveTo(26.8701, 5.8633)
shape.lineTo(24.9795, 5.1226)
shape.lineTo(22.7998, 5.3692)
shape.lineTo(20.1094, 6.1094)
shape.lineTo(19.6006, 6.6035)
shape.lineTo(21.2725, 7.7549)
shape.lineTo(21.2725, 8.4131)
shape.lineTo(20.6182, 9.0713005)
shape.lineTo(21.4912, 10.8003)
shape.lineTo(22.0713, 10.4702)
shape.lineTo(22.7998, 9.3188)
shape.curveTo(23.9228, 8.971601, 24.9297, 8.5781, 25.9971, 8.0844)
shape.lineTo(26.8701, 5.8632)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_2_0_0
g.transform = defaultTransform__0_2_1_3_2_0
g.transform = defaultTransform__0_2_1_3_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_3_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_3_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_3_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
shape.moveTo(28.833, 12.7749)
shape.lineTo(28.542, 12.0337)
shape.lineTo(28.0322, 12.1987)
shape.lineTo(28.1787, 13.103)
shape.lineTo(28.833, 12.7749)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_3_0_0
g.transform = defaultTransform__0_2_1_3_3_0
g.transform = defaultTransform__0_2_1_3_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_4_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_4_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_4_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
shape.moveTo(29.123, 12.6089)
shape.lineTo(28.9775, 13.5972)
shape.lineTo(29.7773, 13.4322)
shape.lineTo(30.3584, 12.857)
shape.lineTo(29.8496, 12.3629)
shape.curveTo(29.6787, 11.9078, 29.4824, 11.483, 29.2685, 11.0465)
shape.lineTo(28.833, 11.0465)
shape.lineTo(28.833, 11.5397)
shape.lineTo(29.123, 11.8688)
shape.lineTo(29.123, 12.609)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_4_0_0
g.transform = defaultTransform__0_2_1_3_4_0
g.transform = defaultTransform__0_2_1_3_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_5_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_5_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_5_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_5_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
shape.moveTo(18.3652, 28.2422)
shape.lineTo(17.7832, 27.0899)
shape.lineTo(16.6929, 26.8433)
shape.lineTo(16.1114, 25.2808)
shape.lineTo(14.6578, 25.4449)
shape.lineTo(13.4224, 24.5406)
shape.lineTo(12.1133, 25.692)
shape.lineTo(12.1133, 25.8736)
shape.curveTo(11.7173, 25.7593, 11.2305, 25.7437, 10.8779, 25.5269)
shape.lineTo(10.5869, 24.7046)
shape.lineTo(10.5869, 23.7993)
shape.lineTo(9.7148, 23.8813)
shape.curveTo(9.7876005, 23.3051, 9.8598, 22.7299, 9.9331, 22.1538)
shape.lineTo(9.4238, 22.1538)
shape.lineTo(8.9155, 22.812)
shape.lineTo(8.4062, 23.0581)
shape.lineTo(7.6791, 22.6479)
shape.lineTo(7.6063, 21.7426)
shape.lineTo(7.7518, 20.7553)
shape.lineTo(8.8426, 19.933)
shape.lineTo(9.7147, 19.933)
shape.lineTo(9.8597, 19.4389)
shape.lineTo(10.95, 19.685)
shape.lineTo(11.7498, 20.6733)
shape.lineTo(11.8953, 19.0268)
shape.lineTo(13.2766, 17.8754)
shape.lineTo(13.7854, 16.641)
shape.lineTo(14.803, 16.2299)
shape.lineTo(15.3845, 15.4076)
shape.lineTo(16.6926, 15.1596)
shape.lineTo(17.3474, 14.1733)
shape.curveTo(16.6931, 14.1733, 16.0388, 14.1733, 15.3845, 14.1733)
shape.lineTo(16.6203, 13.5971)
shape.lineTo(17.4919, 13.5971)
shape.lineTo(18.7282, 13.185)
shape.lineTo(18.8737, 12.6928)
shape.lineTo(18.4372, 12.2807)
shape.lineTo(17.9284, 12.1157)
shape.lineTo(18.0739, 11.6225)
shape.lineTo(17.7106, 10.8823)
shape.lineTo(16.838, 11.2104)
shape.lineTo(16.9835, 10.5527)
shape.lineTo(15.9659, 9.9765005)
shape.lineTo(15.1666, 11.3744)
shape.lineTo(15.2389, 11.8685)
shape.lineTo(14.4396, 12.1986)
shape.lineTo(13.9303, 13.2679)
shape.lineTo(13.7125, 12.2806)
shape.lineTo(12.3312, 11.7044)
shape.lineTo(12.1129, 10.9642)
shape.lineTo(13.9303, 9.8939)
shape.lineTo(14.7301, 9.1537)
shape.lineTo(14.8029, 8.2489)
shape.lineTo(14.3669, 8.001801)
shape.lineTo(13.7854, 7.9193)
shape.lineTo(13.4221, 8.8246)
shape.curveTo(13.4221, 8.8246, 12.8142, 8.9437, 12.6579, 8.9823)
shape.curveTo(10.6618, 10.8217, 6.6286, 14.7924, 5.6916, 22.2885)
shape.curveTo(5.7287, 22.4623, 6.3708, 23.4701, 6.3708, 23.4701)
shape.lineTo(7.8972, 24.3744)
shape.lineTo(9.4236, 24.7865)
shape.lineTo(10.0784, 25.6097)
shape.lineTo(11.0955, 26.3499)
shape.lineTo(11.677, 26.2679)
shape.lineTo(12.113, 26.4642)
shape.lineTo(12.113, 26.597)
shape.lineTo(11.5319, 28.16)
shape.lineTo(11.0954, 28.8182)
shape.lineTo(11.2409, 29.1483)
shape.lineTo(10.8776, 30.3807)
shape.lineTo(12.1862, 32.7674)
shape.lineTo(13.4943, 33.9197)
shape.lineTo(14.0763, 34.742)
shape.lineTo(14.0031, 36.4705)
shape.lineTo(14.4396, 37.4568)
shape.lineTo(14.0031, 39.3494)
shape.curveTo(14.0031, 39.3494, 13.9689, 39.3377, 14.0246, 39.5271)
shape.curveTo(14.0808, 39.7166, 16.3537, 40.9783, 16.4982, 40.8709)
shape.curveTo(16.6422, 40.7615, 16.7653, 40.6658, 16.7653, 40.6658)
shape.lineTo(16.6203, 40.2556)
shape.lineTo(17.2014, 39.6794)
shape.lineTo(17.4197, 39.1032)
shape.lineTo(18.365, 38.7731)
shape.lineTo(19.0916, 36.9626)
shape.lineTo(18.8738, 36.4704)
shape.lineTo(19.3816, 35.7302)
shape.lineTo(20.4724, 35.4822)
shape.lineTo(21.0544, 34.1658)
shape.lineTo(20.9089, 32.5213)
shape.lineTo(21.781, 31.2869)
shape.lineTo(21.9265, 30.0525)
shape.curveTo(20.7331, 29.4607, 19.5495, 28.8513, 18.365, 28.242)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_5_0_0
g.transform = defaultTransform__0_2_1_3_5_0
g.transform = defaultTransform__0_2_1_3_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_6_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_6_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_6_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_6_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
shape.moveTo(16.7656, 9.5649)
shape.lineTo(17.4922, 10.0586)
shape.lineTo(18.0742, 10.0586)
shape.lineTo(18.0742, 9.4829)
shape.lineTo(17.3476, 9.1538)
shape.lineTo(16.7656, 9.5649)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_6_0_0
g.transform = defaultTransform__0_2_1_3_6_0
g.transform = defaultTransform__0_2_1_3_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_7_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_7_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_7_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_7_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
shape.moveTo(14.876, 8.9072)
shape.lineTo(14.5122, 9.812)
shape.lineTo(15.2393, 9.812)
shape.lineTo(15.6031, 8.9892)
shape.curveTo(15.9166, 8.7675, 16.2286, 8.5444, 16.5479, 8.331)
shape.lineTo(17.275, 8.5781)
shape.curveTo(17.7594, 8.9072, 18.2438, 9.2363, 18.7286, 9.5649)
shape.lineTo(19.4561, 8.9072)
shape.lineTo(18.6558, 8.5781)
shape.lineTo(18.292, 7.8374)
shape.lineTo(16.9111, 7.6728)
shape.lineTo(16.8383, 7.2612)
shape.lineTo(16.184, 7.4262)
shape.lineTo(15.8936, 8.002)
shape.lineTo(15.5298, 7.2613)
shape.lineTo(15.3848, 7.5904)
shape.lineTo(15.4576, 8.4132)
shape.lineTo(14.876, 8.9072)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_7_0_0
g.transform = defaultTransform__0_2_1_3_7_0
g.transform = defaultTransform__0_2_1_3_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_8
g.composite = AlphaComposite.getInstance(3, 0.75f * origAlpha)
val defaultTransform__0_2_1_3_8_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_8_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_8_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_8_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_8_0_0
g.transform = defaultTransform__0_2_1_3_8_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_8_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_8_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_8_1_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_8_1_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_8_1_0
g.transform = defaultTransform__0_2_1_3_8_1
g.transform = defaultTransform__0_2_1_3_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_9
g.composite = AlphaComposite.getInstance(3, 0.75f * origAlpha)
val defaultTransform__0_2_1_3_9_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_9_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_9_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_9_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_9_0_0
g.transform = defaultTransform__0_2_1_3_9_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_9_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_9_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_9_1_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_9_1_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_9_1_0
g.transform = defaultTransform__0_2_1_3_9_1
g.transform = defaultTransform__0_2_1_3_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_10_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_10_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_10_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_10_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
shape.moveTo(17.4922, 6.8496003)
shape.lineTo(17.856, 6.521)
shape.lineTo(18.5831, 6.3564)
shape.curveTo(19.0811, 6.1142, 19.5811, 5.9511, 20.1095, 5.7802)
shape.lineTo(19.8195, 5.2865)
shape.lineTo(18.881, 5.4213)
shape.lineTo(18.4376, 5.8632)
shape.lineTo(17.7066, 5.9692)
shape.lineTo(17.0567, 6.2744)
shape.lineTo(16.7408, 6.4272)
shape.lineTo(16.5479, 6.6855)
shape.lineTo(17.4922, 6.8496003)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_10_0_0
g.transform = defaultTransform__0_2_1_3_10_0
g.transform = defaultTransform__0_2_1_3_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_11_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_11_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3_11_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_11_0_0
paint = Color(0, 0, 0, 182)
shape = GeneralPath()
shape.moveTo(18.7285, 14.6665)
shape.lineTo(19.165, 14.0083)
shape.lineTo(18.5102, 13.5151)
shape.lineTo(18.7285, 14.6665)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3_11_0_0
g.transform = defaultTransform__0_2_1_3_11_0
g.transform = defaultTransform__0_2_1_3_11
g.transform = defaultTransform__0_2_1_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4 = g.transform
g.transform(AffineTransform(0.5767859816551208f, 0.0f, 0.0f, 0.5767859816551208f, 11.251660346984863f, 10.447799682617188f))
// _0_2_1_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_0_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(44.0713, 20.7144)
shape.curveTo(44.0713, 20.9771, 44.0713, 20.7144, 44.0713, 20.7144)
shape.lineTo(43.5264, 21.3316)
shape.curveTo(43.1924, 20.938, 42.8174, 20.607, 42.4366, 20.2613)
shape.lineTo(41.6007, 20.3843)
shape.lineTo(40.837, 19.521)
shape.lineTo(40.837, 20.5894)
shape.lineTo(41.4913, 21.0845)
shape.lineTo(41.9268, 21.5777)
shape.lineTo(42.5088, 20.9195)
shape.curveTo(42.6553, 21.1939, 42.7998, 21.4683, 42.9453, 21.7427)
shape.lineTo(42.9453, 22.565)
shape.lineTo(42.29, 23.3052)
shape.lineTo(41.0908, 24.1284)
shape.lineTo(40.1826, 25.0347)
shape.lineTo(39.6006, 24.3745)
shape.lineTo(39.8916, 23.6343)
shape.lineTo(39.3105, 22.9761)
shape.lineTo(38.3291, 20.8784)
shape.lineTo(37.4932, 19.9331)
shape.lineTo(37.2744, 20.1792)
shape.lineTo(37.6025, 21.3726)
shape.lineTo(38.2197, 22.0718)
shape.curveTo(38.5722, 23.0894, 38.9209, 24.062, 39.3838, 25.0347)
shape.curveTo(40.1016, 25.0347, 40.7783, 24.9585, 41.4912, 24.8687)
shape.lineTo(41.4912, 25.4449)
shape.lineTo(40.6191, 27.5841)
shape.lineTo(39.8193, 28.4884)
shape.lineTo(39.165, 29.8888)
shape.curveTo(39.165, 30.6564, 39.165, 31.424, 39.165, 32.1915)
shape.lineTo(39.3838, 33.0978)
shape.lineTo(39.0205, 33.508)
shape.lineTo(38.2197, 34.0021)
shape.lineTo(37.3838, 34.7013)
shape.lineTo(38.0752, 35.4826)
shape.lineTo(37.1299, 36.3068)
shape.lineTo(37.3115, 36.84)
shape.lineTo(35.8935, 38.4455)
shape.lineTo(34.9492, 38.4455)
shape.lineTo(34.1494, 38.9396)
shape.lineTo(33.6396, 38.9396)
shape.lineTo(33.6396, 38.2814)
shape.lineTo(33.4228, 36.963)
shape.curveTo(33.1415, 36.1368, 32.8486, 35.3165, 32.5507, 34.4962)
shape.curveTo(32.5507, 33.8907, 32.5868, 33.2911, 32.623, 32.6857)
shape.lineTo(32.9873, 31.8634)
shape.lineTo(32.4775, 30.8751)
shape.lineTo(32.5146, 29.5177)
shape.lineTo(31.8232, 28.7364)
shape.lineTo(32.1689, 27.6055)
shape.lineTo(31.6064, 26.9673)
shape.lineTo(30.624, 26.9673)
shape.lineTo(30.2969, 26.5972)
shape.lineTo(29.3155, 27.2149)
shape.lineTo(28.9161, 26.7613)
shape.lineTo(28.0069, 27.543)
shape.curveTo(27.3897, 26.8433, 26.7715, 26.1441, 26.1534, 25.4449)
shape.lineTo(25.4268, 23.7164)
shape.lineTo(26.0811, 22.7301)
shape.lineTo(25.7178, 22.319)
shape.lineTo(26.5166, 20.4254)
shape.curveTo(27.1729, 19.609, 27.8584, 18.8258, 28.5518, 18.0397)
shape.lineTo(29.7881, 17.7106)
shape.lineTo(31.169, 17.5465)
shape.lineTo(32.1143, 17.7936)
shape.lineTo(33.459, 19.15)
shape.lineTo(33.9317, 18.6158)
shape.lineTo(34.585, 18.5338)
shape.lineTo(35.8213, 18.9449)
shape.lineTo(36.7666, 18.9449)
shape.lineTo(37.4209, 18.3687)
shape.lineTo(37.7119, 17.9576)
shape.lineTo(37.0566, 17.5465)
shape.lineTo(35.9658, 17.4645)
shape.curveTo(35.6631, 17.0446, 35.3818, 16.6032, 35.0224, 16.2301)
shape.lineTo(34.6581, 16.3942)
shape.lineTo(34.5126, 17.4645)
shape.lineTo(33.8583, 16.7243)
shape.lineTo(33.7138, 15.9001)
shape.lineTo(32.9872, 15.3259)
shape.lineTo(32.6952, 15.3259)
shape.lineTo(33.4227, 16.1482)
shape.lineTo(33.1317, 16.8884)
shape.lineTo(32.5506, 17.0525)
shape.lineTo(32.9139, 16.3123)
shape.lineTo(32.2586, 15.9842)
shape.lineTo(31.6785, 15.326)
shape.lineTo(30.5867, 15.5721)
shape.lineTo(30.4422, 15.9002)
shape.lineTo(29.7879, 16.3123)
shape.lineTo(29.4246, 17.2176)
shape.lineTo(28.5164, 17.6697)
shape.lineTo(28.116, 17.2176)
shape.lineTo(27.6805, 17.2176)
shape.lineTo(27.6805, 15.7362)
shape.lineTo(28.6258, 15.2421)
shape.lineTo(29.3524, 15.2421)
shape.lineTo(29.2059, 14.6669)
shape.lineTo(28.6258, 14.0907)
shape.lineTo(29.6063, 13.8846)
shape.lineTo(30.1512, 13.2684)
shape.lineTo(30.5867, 12.5272)
shape.lineTo(31.3875, 12.5272)
shape.lineTo(31.1687, 11.952)
shape.lineTo(31.6785, 11.6229)
shape.lineTo(31.6785, 12.2811)
shape.lineTo(32.7683, 12.5272)
shape.lineTo(33.8581, 11.6229)
shape.lineTo(33.9313, 11.2108)
shape.lineTo(34.8756, 10.5531)
shape.curveTo(34.5338, 10.5956, 34.192, 10.6268, 33.858, 10.7177)
shape.lineTo(33.858, 9.9766)
shape.lineTo(34.2213, 9.1538)
shape.lineTo(33.858, 9.1538)
shape.lineTo(33.0596, 9.894)
shape.lineTo(32.8408, 10.3056)
shape.lineTo(33.0596, 10.8823)
shape.lineTo(32.6953, 11.8686)
shape.lineTo(32.1142, 11.5395)
shape.lineTo(31.6064, 10.9643)
shape.lineTo(30.8056, 11.5395)
shape.lineTo(30.5146, 10.2236)
shape.lineTo(31.8955, 9.3188)
shape.lineTo(31.8955, 8.8247)
shape.lineTo(32.7685, 8.249001)
shape.lineTo(34.1494, 7.9194)
shape.lineTo(35.0947, 8.249001)
shape.lineTo(36.8388, 8.5781)
shape.lineTo(36.4033, 9.0713005)
shape.lineTo(35.458, 9.0713005)
shape.lineTo(36.4033, 10.0586)
shape.lineTo(37.1299, 9.2363)
shape.lineTo(37.3506, 8.8745)
shape.curveTo(37.3506, 8.8745, 40.1377, 11.3725, 41.7305, 14.105)
shape.curveTo(43.3233, 16.8384, 44.0713, 20.0601, 44.0713, 20.7144)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_0_0_0
g.transform = defaultTransform__0_2_1_4_0_0
g.transform = defaultTransform__0_2_1_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_1_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_1_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_1_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(26.0703, 9.2363)
shape.lineTo(25.9971, 9.7295)
shape.lineTo(26.5069, 10.0586)
shape.lineTo(27.378, 9.4829)
shape.lineTo(26.9425, 8.9892)
shape.lineTo(26.3605, 9.3188)
shape.lineTo(26.0705, 9.2363)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_1_0_0
g.transform = defaultTransform__0_2_1_4_1_0
g.transform = defaultTransform__0_2_1_4_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_2_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_2_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_2_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(26.8701, 5.8633)
shape.lineTo(24.9795, 5.1226)
shape.lineTo(22.7998, 5.3692)
shape.lineTo(20.1094, 6.1094)
shape.lineTo(19.6006, 6.6035)
shape.lineTo(21.2725, 7.7549)
shape.lineTo(21.2725, 8.4131)
shape.lineTo(20.6182, 9.0713005)
shape.lineTo(21.4912, 10.8003)
shape.lineTo(22.0713, 10.4702)
shape.lineTo(22.7998, 9.3188)
shape.curveTo(23.9228, 8.971601, 24.9297, 8.5781, 25.9971, 8.0844)
shape.lineTo(26.8701, 5.8632)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_2_0_0
g.transform = defaultTransform__0_2_1_4_2_0
g.transform = defaultTransform__0_2_1_4_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_3_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_3_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_3_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(28.833, 12.7749)
shape.lineTo(28.542, 12.0337)
shape.lineTo(28.0322, 12.1987)
shape.lineTo(28.1787, 13.103)
shape.lineTo(28.833, 12.7749)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_3_0_0
g.transform = defaultTransform__0_2_1_4_3_0
g.transform = defaultTransform__0_2_1_4_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_4_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_4_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_4_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(29.123, 12.6089)
shape.lineTo(28.9775, 13.5972)
shape.lineTo(29.7773, 13.4322)
shape.lineTo(30.3584, 12.857)
shape.lineTo(29.8496, 12.3629)
shape.curveTo(29.6787, 11.9078, 29.4824, 11.483, 29.2685, 11.0465)
shape.lineTo(28.833, 11.0465)
shape.lineTo(28.833, 11.5397)
shape.lineTo(29.123, 11.8688)
shape.lineTo(29.123, 12.609)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_4_0_0
g.transform = defaultTransform__0_2_1_4_4_0
g.transform = defaultTransform__0_2_1_4_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_5_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_5_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_5_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_5_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(18.3652, 28.2422)
shape.lineTo(17.7832, 27.0899)
shape.lineTo(16.6929, 26.8433)
shape.lineTo(16.1114, 25.2808)
shape.lineTo(14.6578, 25.4449)
shape.lineTo(13.4224, 24.5406)
shape.lineTo(12.1133, 25.692)
shape.lineTo(12.1133, 25.8736)
shape.curveTo(11.7173, 25.7593, 11.2305, 25.7437, 10.8779, 25.5269)
shape.lineTo(10.5869, 24.7046)
shape.lineTo(10.5869, 23.7993)
shape.lineTo(9.7148, 23.8813)
shape.curveTo(9.7876005, 23.3051, 9.8598, 22.7299, 9.9331, 22.1538)
shape.lineTo(9.4238, 22.1538)
shape.lineTo(8.9155, 22.812)
shape.lineTo(8.4062, 23.0581)
shape.lineTo(7.6791, 22.6479)
shape.lineTo(7.6063, 21.7426)
shape.lineTo(7.7518, 20.7553)
shape.lineTo(8.8426, 19.933)
shape.lineTo(9.7147, 19.933)
shape.lineTo(9.8597, 19.4389)
shape.lineTo(10.95, 19.685)
shape.lineTo(11.7498, 20.6733)
shape.lineTo(11.8953, 19.0268)
shape.lineTo(13.2766, 17.8754)
shape.lineTo(13.7854, 16.641)
shape.lineTo(14.803, 16.2299)
shape.lineTo(15.3845, 15.4076)
shape.lineTo(16.6926, 15.1596)
shape.lineTo(17.3474, 14.1733)
shape.curveTo(16.6931, 14.1733, 16.0388, 14.1733, 15.3845, 14.1733)
shape.lineTo(16.6203, 13.5971)
shape.lineTo(17.4919, 13.5971)
shape.lineTo(18.7282, 13.185)
shape.lineTo(18.8737, 12.6928)
shape.lineTo(18.4372, 12.2807)
shape.lineTo(17.9284, 12.1157)
shape.lineTo(18.0739, 11.6225)
shape.lineTo(17.7106, 10.8823)
shape.lineTo(16.838, 11.2104)
shape.lineTo(16.9835, 10.5527)
shape.lineTo(15.9659, 9.9765005)
shape.lineTo(15.1666, 11.3744)
shape.lineTo(15.2389, 11.8685)
shape.lineTo(14.4396, 12.1986)
shape.lineTo(13.9303, 13.2679)
shape.lineTo(13.7125, 12.2806)
shape.lineTo(12.3312, 11.7044)
shape.lineTo(12.1129, 10.9642)
shape.lineTo(13.9303, 9.8939)
shape.lineTo(14.7301, 9.1537)
shape.lineTo(14.8029, 8.2489)
shape.lineTo(14.3669, 8.001801)
shape.lineTo(13.7854, 7.9193)
shape.lineTo(13.4221, 8.8246)
shape.curveTo(13.4221, 8.8246, 12.8142, 8.9437, 12.6579, 8.9823)
shape.curveTo(10.6618, 10.8217, 6.6286, 14.7924, 5.6916, 22.2885)
shape.curveTo(5.7287, 22.4623, 6.3708, 23.4701, 6.3708, 23.4701)
shape.lineTo(7.8972, 24.3744)
shape.lineTo(9.4236, 24.7865)
shape.lineTo(10.0784, 25.6097)
shape.lineTo(11.0955, 26.3499)
shape.lineTo(11.677, 26.2679)
shape.lineTo(12.113, 26.4642)
shape.lineTo(12.113, 26.597)
shape.lineTo(11.5319, 28.16)
shape.lineTo(11.0954, 28.8182)
shape.lineTo(11.2409, 29.1483)
shape.lineTo(10.8776, 30.3807)
shape.lineTo(12.1862, 32.7674)
shape.lineTo(13.4943, 33.9197)
shape.lineTo(14.0763, 34.742)
shape.lineTo(14.0031, 36.4705)
shape.lineTo(14.4396, 37.4568)
shape.lineTo(14.0031, 39.3494)
shape.curveTo(14.0031, 39.3494, 13.9689, 39.3377, 14.0246, 39.5271)
shape.curveTo(14.0808, 39.7166, 16.3537, 40.9783, 16.4982, 40.8709)
shape.curveTo(16.6422, 40.7615, 16.7653, 40.6658, 16.7653, 40.6658)
shape.lineTo(16.6203, 40.2556)
shape.lineTo(17.2014, 39.6794)
shape.lineTo(17.4197, 39.1032)
shape.lineTo(18.365, 38.7731)
shape.lineTo(19.0916, 36.9626)
shape.lineTo(18.8738, 36.4704)
shape.lineTo(19.3816, 35.7302)
shape.lineTo(20.4724, 35.4822)
shape.lineTo(21.0544, 34.1658)
shape.lineTo(20.9089, 32.5213)
shape.lineTo(21.781, 31.2869)
shape.lineTo(21.9265, 30.0525)
shape.curveTo(20.7331, 29.4607, 19.5495, 28.8513, 18.365, 28.242)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_5_0_0
g.transform = defaultTransform__0_2_1_4_5_0
g.transform = defaultTransform__0_2_1_4_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_6_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_6_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_6_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_6_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(16.7656, 9.5649)
shape.lineTo(17.4922, 10.0586)
shape.lineTo(18.0742, 10.0586)
shape.lineTo(18.0742, 9.4829)
shape.lineTo(17.3476, 9.1538)
shape.lineTo(16.7656, 9.5649)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_6_0_0
g.transform = defaultTransform__0_2_1_4_6_0
g.transform = defaultTransform__0_2_1_4_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_7_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_7_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_7_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_7_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(14.876, 8.9072)
shape.lineTo(14.5122, 9.812)
shape.lineTo(15.2393, 9.812)
shape.lineTo(15.6031, 8.9892)
shape.curveTo(15.9166, 8.7675, 16.2286, 8.5444, 16.5479, 8.331)
shape.lineTo(17.275, 8.5781)
shape.curveTo(17.7594, 8.9072, 18.2438, 9.2363, 18.7286, 9.5649)
shape.lineTo(19.4561, 8.9072)
shape.lineTo(18.6558, 8.5781)
shape.lineTo(18.292, 7.8374)
shape.lineTo(16.9111, 7.6728)
shape.lineTo(16.8383, 7.2612)
shape.lineTo(16.184, 7.4262)
shape.lineTo(15.8936, 8.002)
shape.lineTo(15.5298, 7.2613)
shape.lineTo(15.3848, 7.5904)
shape.lineTo(15.4576, 8.4132)
shape.lineTo(14.876, 8.9072)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_7_0_0
g.transform = defaultTransform__0_2_1_4_7_0
g.transform = defaultTransform__0_2_1_4_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_8
g.composite = AlphaComposite.getInstance(3, 0.75f * origAlpha)
val defaultTransform__0_2_1_4_8_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_8_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_8_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_8_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_8_0_0
g.transform = defaultTransform__0_2_1_4_8_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_8_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_8_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_8_1_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_8_1_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_8_1_0
g.transform = defaultTransform__0_2_1_4_8_1
g.transform = defaultTransform__0_2_1_4_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_9
g.composite = AlphaComposite.getInstance(3, 0.75f * origAlpha)
val defaultTransform__0_2_1_4_9_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_9_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_9_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_9_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_9_0_0
g.transform = defaultTransform__0_2_1_4_9_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_9_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_9_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_9_1_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_9_1_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_9_1_0
g.transform = defaultTransform__0_2_1_4_9_1
g.transform = defaultTransform__0_2_1_4_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_10_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_10_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_10_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_10_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(17.4922, 6.8496003)
shape.lineTo(17.856, 6.521)
shape.lineTo(18.5831, 6.3564)
shape.curveTo(19.0811, 6.1142, 19.5811, 5.9511, 20.1095, 5.7802)
shape.lineTo(19.8195, 5.2865)
shape.lineTo(18.881, 5.4213)
shape.lineTo(18.4376, 5.8632)
shape.lineTo(17.7066, 5.9692)
shape.lineTo(17.0567, 6.2744)
shape.lineTo(16.7408, 6.4272)
shape.lineTo(16.5479, 6.6855)
shape.lineTo(17.4922, 6.8496003)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_10_0_0
g.transform = defaultTransform__0_2_1_4_10_0
g.transform = defaultTransform__0_2_1_4_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_11_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_11_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4_11_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_11_0_0
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(254, 254, 254, 255),Color(29, 29, 29, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(18.7285, 14.6665)
shape.lineTo(19.165, 14.0083)
shape.lineTo(18.5102, 13.5151)
shape.lineTo(18.7285, 14.6665)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_4_11_0_0
g.transform = defaultTransform__0_2_1_4_11_0
g.transform = defaultTransform__0_2_1_4_11
g.transform = defaultTransform__0_2_1_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_5
paint = RadialGradientPaint(Point2D.Double(15.601279258728027, 12.142301559448242), 43.526714f, Point2D.Double(15.601279258728027, 12.142301559448242), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 42)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5871300101280212f, 0.0f, 0.0f, 0.5871419906616211f, 11.299189567565918f, 10.429670333862305f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(36.531418, 24.218876)
shape.curveTo(36.531418, 30.187597, 31.692724, 35.026237, 25.724825, 35.026237)
shape.curveTo(19.756376, 35.026237, 14.917956, 30.187544, 14.917956, 24.218876)
shape.curveTo(14.917956, 18.25043, 19.756376, 13.412282, 25.724825, 13.412282)
shape.curveTo(31.692724, 13.412282, 36.531418, 18.25043, 36.531418, 24.218876)
shape.lineTo(36.531418, 24.218876)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2_1_5
g.transform = defaultTransform__0_2_1
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
            return 4.997228145599365
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 3.1464462280273438
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 40.916595458984375
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.6827278137207
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Text_html(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Text_html(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Text_html(16, 16) }
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

