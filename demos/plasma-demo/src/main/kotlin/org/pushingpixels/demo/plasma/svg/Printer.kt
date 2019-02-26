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
class Printer private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.3119190037250519f, -2.006727933883667f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(24.0, 41.875), 19.125f, Point2D.Double(24.0, 41.875), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.33333298563957214f, 0.0f, 27.916669845581055f))
shape = GeneralPath()
shape.moveTo(43.125, 41.875)
shape.curveTo(43.155647, 44.15936, 39.517162, 46.274582, 33.587276, 47.41972)
shape.curveTo(27.65739, 48.564857, 20.34261, 48.564857, 14.4127245, 47.41972)
shape.curveTo(8.482839, 46.274582, 4.8443522, 44.15936, 4.875, 41.875)
shape.curveTo(4.8443522, 39.59064, 8.482839, 37.475418, 14.4127245, 36.33028)
shape.curveTo(20.34261, 35.185143, 27.65739, 35.185143, 33.587276, 36.33028)
shape.curveTo(39.517162, 37.475418, 43.155647, 39.59064, 43.125, 41.875)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = LinearGradientPaint(Point2D.Double(1.8456430435180664, 88.29493713378906), Point2D.Double(18.972126007080078, 88.29493713378906), floatArrayOf(0.0f,0.27586207f,1.0f), arrayOf(Color(142, 141, 135, 255),Color(203, 201, 193, 255),Color(142, 141, 135, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.302720069885254f, 0.0f, 0.0f, 0.4379180073738098f, 0.0f, 0.5840340256690979f))
shape = RoundRectangle2D.Double(4.75, 36.004188537597656, 38.4375, 6.491594314575195, 3.4230966567993164, 3.423095464706421)
g.paint = paint
g.fill(shape)
paint = Color(89, 89, 89, 255)
stroke = BasicStroke(0.9999998f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(4.75, 36.004188537597656, 38.4375, 6.491594314575195, 3.4230966567993164, 3.423095464706421)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = LinearGradientPaint(Point2D.Double(1.8456430435180664, 88.29492950439453), Point2D.Double(18.972126007080078, 88.29492950439453), floatArrayOf(0.0f,1.0f), arrayOf(Color(220, 220, 218, 255),Color(186, 185, 183, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.2918241024017334f, 0.0f, 0.0f, 0.4342690110206604f, 0.08855178952217102f, 2.0f))
shape = GeneralPath()
shape.moveTo(7.130896, 21.5)
shape.lineTo(40.870613, 21.5)
shape.curveTo(41.25566, 21.5, 41.747646, 21.788155, 42.05105, 22.223919)
shape.curveTo(42.35445, 22.659683, 43.787518, 24.83394, 44.109447, 25.297964)
shape.curveTo(44.431377, 25.761988, 44.502396, 26.201853, 44.502396, 26.77405)
shape.lineTo(44.502396, 38.850952)
shape.curveTo(44.502396, 39.764523, 43.7704, 40.5, 42.861153, 40.5)
shape.lineTo(5.1403594, 40.5)
shape.curveTo(4.2311096, 40.5, 3.4991138, 39.764523, 3.4991138, 38.850952)
shape.lineTo(3.4991138, 26.77405)
shape.curveTo(3.4991138, 26.280031, 3.6002798, 25.571642, 3.9455202, 25.120718)
shape.curveTo(4.3811665, 24.551714, 5.549866, 22.57277, 5.8581276, 22.153118)
shape.curveTo(6.1663885, 21.733467, 6.732446, 21.5, 7.130896, 21.5)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(103, 103, 103, 255)
stroke = BasicStroke(1.0000004f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(7.130896, 21.5)
shape.lineTo(40.870613, 21.5)
shape.curveTo(41.25566, 21.5, 41.747646, 21.788155, 42.05105, 22.223919)
shape.curveTo(42.35445, 22.659683, 43.787518, 24.83394, 44.109447, 25.297964)
shape.curveTo(44.431377, 25.761988, 44.502396, 26.201853, 44.502396, 26.77405)
shape.lineTo(44.502396, 38.850952)
shape.curveTo(44.502396, 39.764523, 43.7704, 40.5, 42.861153, 40.5)
shape.lineTo(5.1403594, 40.5)
shape.curveTo(4.2311096, 40.5, 3.4991138, 39.764523, 3.4991138, 38.850952)
shape.lineTo(3.4991138, 26.77405)
shape.curveTo(3.4991138, 26.280031, 3.6002798, 25.571642, 3.9455202, 25.120718)
shape.curveTo(4.3811665, 24.551714, 5.549866, 22.57277, 5.8581276, 22.153118)
shape.curveTo(6.1663885, 21.733467, 6.732446, 21.5, 7.130896, 21.5)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = Color(251, 251, 251, 255)
shape = GeneralPath()
shape.moveTo(7.424621, 21.975533)
shape.curveTo(6.921893, 21.975533, 6.3048778, 22.053783, 6.0546017, 22.46703)
shape.lineTo(4.1542525, 25.604816)
shape.curveTo(3.8721285, 26.070648, 4.1881986, 26.868141, 5.087311, 26.868141)
shape.lineTo(42.730785, 26.868141)
shape.curveTo(44.040733, 26.868141, 43.950535, 25.858072, 43.663845, 25.42804)
shape.lineTo(41.896076, 22.776388)
shape.curveTo(41.575542, 22.29559, 41.459198, 21.975533, 40.65864, 21.975533)
shape.lineTo(7.424621, 21.975533)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(15.387969017028809, 32.53923797607422), Point2D.Double(15.487822532653809, 58.83126449584961), floatArrayOf(0.0f,0.10344828f,1.0f), arrayOf(Color(255, 255, 255, 32),Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.4925689697265625f, 0.0f, 0.0f, 0.66874098777771f, 0.08188071846961975f, 2.0f))
stroke = BasicStroke(0.9469671f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(7.60536, 22.445757)
shape.lineTo(40.432674, 22.445757)
shape.curveTo(40.79835, 22.445757, 41.26559, 22.71863, 41.553734, 23.131283)
shape.curveTo(41.841873, 23.543938, 42.849964, 25.160946, 43.1557, 25.60036)
shape.curveTo(43.461437, 26.039776, 43.59127, 26.456312, 43.59127, 26.998163)
shape.lineTo(43.59127, 38.279263)
shape.curveTo(43.59127, 39.144386, 43.457546, 39.528355, 42.594032, 39.528355)
shape.lineTo(5.5322266, 39.528355)
shape.curveTo(4.6687107, 39.528355, 4.4726048, 39.144386, 4.4726048, 38.279263)
shape.lineTo(4.4726048, 26.998163)
shape.curveTo(4.4726048, 26.530346, 4.69345, 25.859524, 5.021325, 25.432514)
shape.curveTo(5.435059, 24.893684, 6.103854, 23.461634, 6.3966103, 23.064238)
shape.curveTo(6.6893663, 22.666842, 7.2269516, 22.445757, 7.60536, 22.445757)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = LinearGradientPaint(Point2D.Double(25.056711196899414, 3.6785457134246826), Point2D.Double(24.78970718383789, 25.247310638427734), floatArrayOf(0.0f,0.4054697f,0.5344828f,1.0f), arrayOf(Color(224, 224, 224, 255),Color(255, 255, 255, 255),Color(205, 205, 205, 255),Color(73, 73, 73, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9457100033760071f, 0.0f, 0.0f, 1.076032042503357f, 0.05016683042049408f, 4.095404148101807f))
shape = GeneralPath()
shape.moveTo(11.672962, 4.4999475)
shape.lineTo(36.325115, 4.4999475)
shape.curveTo(36.97588, 4.4999475, 37.49978, 5.0100775, 37.49978, 5.6437373)
shape.lineTo(37.49978, 24.348175)
shape.lineTo(10.498298, 24.348175)
shape.lineTo(10.498298, 5.6437373)
shape.curveTo(10.498298, 5.0100775, 11.022197, 4.4999475, 11.672962, 4.4999475)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(137, 137, 137, 255)
stroke = BasicStroke(1.0000004f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(11.672962, 4.4999475)
shape.lineTo(36.325115, 4.4999475)
shape.curveTo(36.97588, 4.4999475, 37.49978, 5.0100775, 37.49978, 5.6437373)
shape.lineTo(37.49978, 24.348175)
shape.lineTo(10.498298, 24.348175)
shape.lineTo(10.498298, 5.6437373)
shape.curveTo(10.498298, 5.0100775, 11.022197, 4.4999475, 11.672962, 4.4999475)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = LinearGradientPaint(Point2D.Double(20.771228790283203, 25.1402530670166), Point2D.Double(20.71780014038086, 19.33746337890625), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 0),Color(248, 248, 248, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.198768973350525f, 0.0f, 0.0f, 0.853564977645874f, -0.1430860012769699f, 2.034512996673584f))
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(11.498513221740723, 5.499246597290039, 25.00057601928711, 18.836374282836914, 0.35355344414711, 0.35355350375175476)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = LinearGradientPaint(Point2D.Double(10.33823299407959, 64.65225982666016), Point2D.Double(10.33823299407959, 54.136138916015625), floatArrayOf(0.0f,1.0f), arrayOf(Color(247, 246, 245, 255),Color(247, 246, 245, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.3698439598083496f, 0.0f, 0.0f, 0.4219689965248108f, 0.0f, 2.0f))
shape = RoundRectangle2D.Double(6.875, 27.375, 33.75, 5.1875, 3.4230966567993164, 3.4230966567993164)
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(9.731653213500977, 70.7249755859375), Point2D.Double(9.705278396606445, 62.282466888427734), floatArrayOf(0.0f,1.0f), arrayOf(Color(102, 102, 102, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.3698439598083496f, 0.0f, 0.0f, 0.4219689965248108f, 0.0f, 2.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.875, 27.375, 33.75, 5.1875, 3.4230966567993164, 3.4230966567993164)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f))
// _0_0_8
paint = RadialGradientPaint(Point2D.Double(9.129549026489258, 26.925594329833984), 2.1227016f, Point2D.Double(9.129549026489258, 26.925594329833984), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(255, 255, 253, 255),Color(187, 187, 185, 255),Color(0, 0, 0, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(10.871767, 27.626486)
shape.curveTo(10.873821, 28.085733, 10.629993, 28.510979, 10.232612, 28.741198)
shape.curveTo(9.83523, 28.971416, 9.345042, 28.971416, 8.94766, 28.741198)
shape.curveTo(8.550279, 28.510979, 8.306451, 28.085733, 8.308505, 27.626486)
shape.curveTo(8.306451, 27.167238, 8.550279, 26.741993, 8.94766, 26.511774)
shape.curveTo(9.345042, 26.281555, 9.83523, 26.281555, 10.232612, 26.511774)
shape.curveTo(10.629993, 26.741993, 10.873821, 27.167238, 10.871767, 27.626486)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 0.36571428f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
paint = LinearGradientPaint(Point2D.Double(9.869808197021484, 57.2276496887207), Point2D.Double(9.912813186645508, 72.06431579589844), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 60),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7720859050750732f, 0.0f, 0.0f, 0.36073899269104004f, 0.6187180280685425f, 2.883882999420166f))
shape = GeneralPath()
shape.moveTo(11.743718, 25.416054)
shape.lineTo(37.306217, 25.478554)
shape.curveTo(37.993717, 25.480234, 38.294037, 25.107557, 38.243717, 24.478554)
shape.lineTo(38.118717, 22.916054)
shape.lineTo(39.984837, 22.916054)
shape.curveTo(40.797337, 22.916054, 40.975037, 23.108616, 41.172337, 23.478554)
shape.lineTo(41.672337, 24.416054)
shape.curveTo(42.19913, 25.403793, 43.48351, 26.390165, 42.170494, 26.390165)
shape.curveTo(37.667786, 26.390165, 13.993718, 26.041054, 11.743718, 25.416054)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(0.99999994f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(43.488808, 26.5)
shape.lineTo(4.5111804, 26.5)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 0.43575415f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f))
// _0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_0
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 7.0, 19.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_1
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 9.0, 19.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_2
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 11.0, 19.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_3
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 13.0, 11.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_4
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 17.0, 19.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_5
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 19.0, 19.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_5
g.transform = defaultTransform__0_0_11
g.transform = defaultTransform__0_0
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
            return 2.9991135597229004
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 3.9999473094940186
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 42.00328063964844
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 42.55818176269531
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Printer(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Printer(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Printer(16, 16) }
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

