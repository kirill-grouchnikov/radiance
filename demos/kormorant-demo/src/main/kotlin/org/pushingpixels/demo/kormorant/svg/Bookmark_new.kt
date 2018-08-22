package org.pushingpixels.demo.kormorant.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.IsHiDpiAware
import org.pushingpixels.neon.icon.NeonIcon
import org.pushingpixels.neon.icon.NeonIconUIResource
import org.pushingpixels.neon.icon.ResizableIcon

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Ibis SVG transcoder</a>.
 */
class Bookmark_new(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
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
paint = RadialGradientPaint(Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, Point2D.Double(33.966678619384766, 35.736915588378906), floatArrayOf(0.0f,1.0f), arrayOf(Color(250, 250, 250, 255),Color(187, 187, 187, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.044769048690796f, -0.10355299711227417f, -0.15918299555778503f))
shape = RoundRectangle2D.Double(6.5, 3.5, 34.875, 41.06343078613281, 2.2980971336364746, 2.298096179962158)
g.paint = paint
g.fill(shape)
paint = RadialGradientPaint(Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, Point2D.Double(8.824419021606445, 3.7561285495758057), floatArrayOf(0.0f,1.0f), arrayOf(Color(163, 163, 163, 255),Color(76, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0363739728927612f, 3.25f, 0.4895220100879669f))
stroke = BasicStroke(0.9999998f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.5, 3.5, 34.875, 41.06343078613281, 2.2980971336364746, 2.298096179962158)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
paint = RadialGradientPaint(Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, Point2D.Double(8.143556594848633, 7.26789665222168), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(248, 248, 248, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9730330109596252f, 0.0f, 0.0f, 1.0349370241165161f, 3.1687541007995605f, 0.5552769899368286f))
stroke = BasicStroke(0.9999996f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(7.502455234527588, 4.501048564910889, 32.93701171875, 39.0282096862793, 0.29809704422950745, 0.29809698462486267)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2
paint = Color(0, 0, 0, 4)
stroke = BasicStroke(0.9885531f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(11.505723, 5.4942765)
shape.lineTo(11.505723, 43.400867)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
paint = Color(255, 255, 255, 52)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(12.5, 5.0205154)
shape.lineTo(12.5, 43.038227)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_3
g.transform = defaultTransform__0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_0
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999994277954102, 9.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_1
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999994277954102, 11.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_2
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999994277954102, 13.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_3
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999994277954102, 15.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_4
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999994277954102, 17.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_5
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999994277954102, 19.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_6
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999994277954102, 21.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_7
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999994277954102, 23.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_8
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 25.0, 9.000005722045898, 1.0, 0.12400771677494049, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_9
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 29.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_10
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 31.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_11
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 33.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_12
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 35.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_12
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_13
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.999985694885254, 37.0, 14.000014305114746, 1.0, 0.19290097057819366, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_13
g.transform = defaultTransform__0_2_0
g.composite = AlphaComposite.getInstance(3, 0.28021976f * origAlpha)
val defaultTransform__0_2_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1
paint = LinearGradientPaint(Point2D.Double(19.452348709106445, 13.174174308776855), Point2D.Double(19.685436248779297, 27.095338821411133), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2242549657821655f, 0.0f, 0.0f, 1.2821760177612305f, 0.3715690076351166f, 0.26465699076652527f))
shape = GeneralPath()
shape.moveTo(28.245857, 31.324905)
shape.lineTo(21.14787, 27.133701)
shape.lineTo(14.30757, 30.8838)
shape.lineTo(13.761859, 3.9475667)
shape.lineTo(28.549599, 3.9475667)
shape.lineTo(28.245857, 31.324905)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2
paint = LinearGradientPaint(Point2D.Double(18.431310653686523, 19.119474411010742), Point2D.Double(18.4024715423584, 4.270232677459717), floatArrayOf(0.0f,1.0f), arrayOf(Color(133, 157, 188, 255),Color(84, 114, 153, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3195489645004272f, 0.0f, 0.0f, 1.2990130186080933f, -3.1061999797821045f, -1.336164951324463f))
shape = GeneralPath()
shape.moveTo(12.427339, 3.5180202)
shape.curveTo(12.427339, 3.5180202, 12.240033, 0.6052061, 15.107867, 0.5427061)
shape.lineTo(25.119343, 0.50728625)
shape.curveTo(26.277287, 0.50728625, 26.581888, 1.1910177, 26.581888, 2.1095588)
shape.lineTo(26.581888, 29.729916)
shape.lineTo(20.545425, 24.533861)
shape.lineTo(14.674346, 29.729916)
shape.lineTo(14.591655, 3.519629)
shape.lineTo(12.427339, 3.5180202)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(54, 72, 120, 255)
stroke = BasicStroke(0.9999999f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(12.427339, 3.5180202)
shape.curveTo(12.427339, 3.5180202, 12.240033, 0.6052061, 15.107867, 0.5427061)
shape.lineTo(25.119343, 0.50728625)
shape.curveTo(26.277287, 0.50728625, 26.581888, 1.1910177, 26.581888, 2.1095588)
shape.lineTo(26.581888, 29.729916)
shape.lineTo(20.545425, 24.533861)
shape.lineTo(14.674346, 29.729916)
shape.lineTo(14.591655, 3.519629)
shape.lineTo(12.427339, 3.5180202)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2_2
g.composite = AlphaComposite.getInstance(3, 0.4450549f * origAlpha)
val defaultTransform__0_2_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_3
paint = LinearGradientPaint(Point2D.Double(16.8125, 1.875), Point2D.Double(16.8125, 4.71875), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-1.3195489645004272f, 0.0f, 0.0f, 1.3620599508285522f, 40.38853073120117f, -0.36205700039863586f))
shape = GeneralPath()
shape.moveTo(13.030252, 3.011792)
shape.curveTo(13.011046, 2.225362, 13.312918, 1.0801307, 15.375418, 1.0176307)
shape.lineTo(25.027906, 1.0)
shape.curveTo(25.640923, 1.0, 26.090153, 1.167432, 26.090153, 1.7994802)
shape.lineTo(26.060993, 10.491851)
shape.lineTo(15.317102, 10.491851)
shape.lineTo(15.192102, 2.999325)
shape.curveTo(15.192102, 2.999325, 13.030252, 3.011792, 13.030252, 3.011792)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_3
g.composite = AlphaComposite.getInstance(3, 0.28021976f * origAlpha)
val defaultTransform__0_2_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4
paint = LinearGradientPaint(Point2D.Double(19.0, 9.773824691772461), Point2D.Double(19.0, 15.63559627532959), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(0, 0, 0, 0),Color(0, 0, 0, 145),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3195489645004272f, 0.0f, 0.0f, 2.1339259147644043f, -4.476132869720459f, -14.648449897766113f))
shape = RoundRectangle2D.Double(15.317100524902344, 6.6907958984375, 10.556391716003418, 12.803556442260742, 0.12400771677494049, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_5
paint = LinearGradientPaint(Point2D.Double(19.97037696838379, 6.116710662841797), Point2D.Double(19.97037696838379, 2.53125), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 49),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3195489645004272f, 0.0f, 0.0f, 1.2803560495376587f, -5.745297908782959f, 0.24900700151920319f))
stroke = BasicStroke(1.0000001f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(24.476831, 2.2095506)
shape.lineTo(25.575535, 3.113139)
shape.lineTo(25.547445, 27.511911)
shape.lineTo(20.497463, 23.203758)
shape.lineTo(15.704084, 27.415203)
shape.lineTo(15.699081, 2.7495618)
shape.lineTo(24.476831, 2.2095506)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_6 = g.transform
g.transform(AffineTransform(0.6111270189285278f, 0.0f, 0.0f, 0.6111270189285278f, 5.6324381828308105f, -67.28175354003906f))
// _0_2_6
paint = RadialGradientPaint(Point2D.Double(55.0, 125.0), 14.375f, Point2D.Double(55.0, 125.0), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 245, 32, 227),Color(255, 243, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(69.375, 125.0)
shape.curveTo(69.39803, 130.151, 66.66322, 134.92062, 62.206123, 137.50279)
shape.curveTo(57.74902, 140.08498, 52.25098, 140.08498, 47.793877, 137.50279)
shape.curveTo(43.336773, 134.92062, 40.601963, 130.151, 40.625, 125.0)
shape.curveTo(40.601963, 119.84899, 43.336773, 115.07938, 47.793877, 112.4972)
shape.curveTo(52.25098, 109.91502, 57.74902, 109.91502, 62.206123, 112.4972)
shape.curveTo(66.66322, 115.07938, 69.39803, 119.84899, 69.375, 125.0)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_6
g.composite = AlphaComposite.getInstance(3, 0.48295456f * origAlpha)
val defaultTransform__0_2_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_7
paint = LinearGradientPaint(Point2D.Double(13.354310989379883, 1.4866424798965454), Point2D.Double(14.075843811035156, 2.4017651081085205), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.1848160028457642f, 0.0f, -0.7278800010681152f))
shape = GeneralPath()
shape.moveTo(15.158602, 3.9384084)
shape.lineTo(15.114407, 1.0335178)
shape.curveTo(12.983906, 1.0335178, 12.993087, 2.9680774, 12.993087, 3.9384084)
shape.lineTo(15.158602, 3.9384084)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_7
g.composite = AlphaComposite.getInstance(3, 0.35795456f * origAlpha)
val defaultTransform__0_2_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_8
paint = LinearGradientPaint(Point2D.Double(14.584076881408691, 1.6392649412155151), Point2D.Double(14.552827835083008, 2.4912447929382324), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.5942139625549316f, 0.0f, -0.7902489900588989f))
shape = GeneralPath()
shape.moveTo(15.158602, 3.9384086)
shape.lineTo(15.114407, 1.8247592)
shape.curveTo(12.81631, 1.8426926, 12.993087, 3.9384086, 12.993087, 3.9384086)
shape.lineTo(15.158602, 3.9384086)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_8
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
            return 6.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.0
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 42.0
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 47.515533447265625
        }

        /**
         * Returns an instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Bookmark_new(width, height))
        }

        /**
         * Returns a [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Bookmark_new(width, height))
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

