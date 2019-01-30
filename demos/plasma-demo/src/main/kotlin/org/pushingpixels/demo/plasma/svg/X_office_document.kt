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
class X_office_document private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 0.7836257f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071080207824707f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(24.306795120239258, 42.077980041503906), 15.821514f, Point2D.Double(24.306795120239258, 42.077980041503906), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.2849160134792328f, 0.0f, 30.089279174804688f))
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
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 31.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 33.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 35.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_3
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 37.0, 14.000014305114746, 1.0, 0.19290097057819366, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_3
g.composite = AlphaComposite.getInstance(3, 0.66477275f * origAlpha)
val defaultTransform__0_2_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_4_0 = g.transform
g.transform(AffineTransform(0.6089820265769958f, 0.0f, 0.0f, 0.6062189936637878f, 12.8233003616333f, 10.55720043182373f))
// _0_2_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_4_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_0
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
g.transform = defaultTransform__0_2_4_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_4_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_1
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.512695, 5.679136)
shape.lineTo(39.643234, 5.679136)
shape.lineTo(39.643234, 19.627375)
shape.lineTo(5.512695, 19.627375)
shape.lineTo(5.512695, 5.679136)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_4_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_4_0_2 = g.transform
g.transform(AffineTransform(1.1892169713974f, 0.0f, 0.0f, 1.1892169713974f, -3.525355100631714f, -6.535408020019531f))
// _0_2_4_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_4_0_2_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_2_0
g.composite = AlphaComposite.getInstance(3, 0.04999994f * origAlpha)
val defaultTransform__0_2_4_0_2_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_2_0_0
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
g.transform = defaultTransform__0_2_4_0_2_0_0
g.composite = AlphaComposite.getInstance(3, 0.20829993f * origAlpha)
val defaultTransform__0_2_4_0_2_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_2_0_1
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
g.transform = defaultTransform__0_2_4_0_2_0_1
g.composite = AlphaComposite.getInstance(3, 0.36669993f * origAlpha)
val defaultTransform__0_2_4_0_2_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_2_0_2
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
g.transform = defaultTransform__0_2_4_0_2_0_2
g.composite = AlphaComposite.getInstance(3, 0.525f * origAlpha)
val defaultTransform__0_2_4_0_2_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_2_0_3
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
g.transform = defaultTransform__0_2_4_0_2_0_3
g.composite = AlphaComposite.getInstance(3, 0.6833f * origAlpha)
val defaultTransform__0_2_4_0_2_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_2_0_4
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
g.transform = defaultTransform__0_2_4_0_2_0_4
g.composite = AlphaComposite.getInstance(3, 0.8417f * origAlpha)
val defaultTransform__0_2_4_0_2_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_2_0_5
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
g.transform = defaultTransform__0_2_4_0_2_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_4_0_2_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_2_0_6
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
g.transform = defaultTransform__0_2_4_0_2_0_6
g.transform = defaultTransform__0_2_4_0_2_0
g.transform = defaultTransform__0_2_4_0_2
g.composite = AlphaComposite.getInstance(3, 0.3f * origAlpha)
val defaultTransform__0_2_4_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_3
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
g.transform = defaultTransform__0_2_4_0_3
g.composite = AlphaComposite.getInstance(3, 0.3f * origAlpha)
val defaultTransform__0_2_4_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_4
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
g.transform = defaultTransform__0_2_4_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_4_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_5
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
g.transform = defaultTransform__0_2_4_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_4_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0_6
paint = Color(81, 81, 81, 255)
shape = GeneralPath()
shape.moveTo(30.248419, 20.459827)
shape.lineTo(25.253704, 20.459827)
shape.lineTo(31.19979, 11.421773)
shape.lineTo(30.248419, 20.459827)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_4_0_6
g.transform = defaultTransform__0_2_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_4_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_1
paint = Color(158, 158, 158, 255)
stroke = BasicStroke(0.9999986f,0,0,4.0f,null,0.0f)
shape = Rectangle2D.Double(16.508501052856445, 14.48575210571289, 19.995502471923828, 13.99746322631836)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2_4_1
g.transform = defaultTransform__0_2_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_5
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 9.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_6
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 11.0, 14.000014305114746, 1.0, 0.19290097057819366, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_6
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
            return 6.10355281829834
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
            return 35.875
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.36908721923828
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return X_office_document(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(X_office_document(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): ResizableIconFactory {
            return ResizableIconFactory { X_office_document(16, 16) }
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

