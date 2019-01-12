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
class Document_print_preview(private var width: Int, private var height: Int) : ResizableIcon {
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
paint = LinearGradientPaint(Point2D.Double(1.8456430435180664, 88.29493713378906), Point2D.Double(18.972126007080078, 88.29493713378906), floatArrayOf(0.0f,0.27586207f,1.0f), arrayOf(Color(142, 141, 135, 255),Color(203, 201, 193, 255),Color(142, 141, 135, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.302720069885254f, 0.0f, 0.0f, 0.4342690110206604f, 0.0f, 0.875f))
shape = RoundRectangle2D.Double(4.75, 36.0, 38.4375, 6.4375, 3.4230966567993164, 3.4230966567993164)
g.paint = paint
g.fill(shape)
paint = Color(89, 89, 89, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(4.75, 36.0, 38.4375, 6.4375, 3.4230966567993164, 3.4230966567993164)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = LinearGradientPaint(Point2D.Double(1.8456430435180664, 88.29492950439453), Point2D.Double(18.972126007080078, 88.29492950439453), floatArrayOf(0.0f,1.0f), arrayOf(Color(220, 220, 218, 255),Color(186, 185, 183, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.302720069885254f, 0.0f, 0.0f, 0.4342690110206604f, 0.0f, 2.0f))
shape = GeneralPath()
shape.moveTo(7.075825, 21.5)
shape.lineTo(40.975952, 21.5)
shape.curveTo(41.362827, 21.5, 41.857155, 21.788155, 42.162, 22.223919)
shape.curveTo(42.466843, 22.659683, 43.906723, 24.83394, 44.230183, 25.297964)
shape.curveTo(44.553642, 25.761988, 44.625, 26.201853, 44.625, 26.77405)
shape.lineTo(44.625, 38.850952)
shape.curveTo(44.625, 39.764523, 43.889523, 40.5, 42.975952, 40.5)
shape.lineTo(5.075825, 40.5)
shape.curveTo(4.1622524, 40.5, 3.4267766, 39.764523, 3.4267766, 38.850952)
shape.lineTo(3.4267766, 26.77405)
shape.curveTo(3.4267766, 26.280031, 3.5284235, 25.571642, 3.8753054, 25.120718)
shape.curveTo(4.313023, 24.551714, 5.487279, 22.57277, 5.7970057, 22.153118)
shape.curveTo(6.1067324, 21.733467, 6.675481, 21.5, 7.075825, 21.5)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(103, 103, 103, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(7.075825, 21.5)
shape.lineTo(40.975952, 21.5)
shape.curveTo(41.362827, 21.5, 41.857155, 21.788155, 42.162, 22.223919)
shape.curveTo(42.466843, 22.659683, 43.906723, 24.83394, 44.230183, 25.297964)
shape.curveTo(44.553642, 25.761988, 44.625, 26.201853, 44.625, 26.77405)
shape.lineTo(44.625, 38.850952)
shape.curveTo(44.625, 39.764523, 43.889523, 40.5, 42.975952, 40.5)
shape.lineTo(5.075825, 40.5)
shape.curveTo(4.1622524, 40.5, 3.4267766, 39.764523, 3.4267766, 38.850952)
shape.lineTo(3.4267766, 26.77405)
shape.curveTo(3.4267766, 26.280031, 3.5284235, 25.571642, 3.8753054, 25.120718)
shape.curveTo(4.313023, 24.551714, 5.487279, 22.57277, 5.7970057, 22.153118)
shape.curveTo(6.1067324, 21.733467, 6.675481, 21.5, 7.075825, 21.5)
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
shape.curveTo(6.921893, 21.975533, 6.2754774, 22.107307, 6.010408, 22.511225)
shape.lineTo(4.1542525, 25.339651)
shape.curveTo(3.8554516, 25.794966, 4.1881986, 26.868141, 5.087311, 26.868141)
shape.lineTo(42.730785, 26.868141)
shape.curveTo(43.946983, 26.868141, 43.950535, 25.858072, 43.663845, 25.42804)
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
paint = LinearGradientPaint(Point2D.Double(15.387969017028809, 32.53923797607422), Point2D.Double(15.487822532653809, 58.83126449584961), floatArrayOf(0.0f,0.10344828f,1.0f), arrayOf(Color(255, 255, 255, 32),Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.495347023010254f, 0.0f, 0.0f, 0.66874098777771f, 0.0f, 2.0f))
stroke = BasicStroke(0.946967f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(7.537484, 22.445757)
shape.lineTo(40.425903, 22.445757)
shape.curveTo(40.792263, 22.445757, 41.260372, 22.71863, 41.54905, 23.131283)
shape.curveTo(41.837727, 23.543938, 42.847694, 25.160946, 43.154, 25.60036)
shape.curveTo(43.460304, 26.039776, 43.59038, 26.456312, 43.59038, 26.998163)
shape.lineTo(43.59038, 38.279263)
shape.curveTo(43.59038, 39.144386, 43.45641, 39.528355, 42.591286, 39.528355)
shape.lineTo(5.4604917, 39.528355)
shape.curveTo(4.5953684, 39.528355, 4.398897, 39.144386, 4.398897, 38.279263)
shape.lineTo(4.398897, 26.998163)
shape.curveTo(4.398897, 26.530346, 4.6201534, 25.859524, 4.948639, 25.432514)
shape.curveTo(5.363143, 24.893684, 6.033183, 23.461634, 6.326484, 23.064238)
shape.curveTo(6.619785, 22.666842, 7.158371, 22.445757, 7.537484, 22.445757)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = LinearGradientPaint(Point2D.Double(25.056711196899414, 3.6785457134246826), Point2D.Double(24.78970718383789, 25.247310638427734), floatArrayOf(0.0f,0.4054697f,0.5344828f,1.0f), arrayOf(Color(224, 224, 224, 255),Color(255, 255, 255, 255),Color(205, 205, 205, 255),Color(73, 73, 73, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9489499926567078f, 0.0f, 0.0f, 1.0809789896011353f, -0.0923556387424469f, 4.000000953674316f))
shape = GeneralPath()
shape.moveTo(11.570264, 4.406405)
shape.lineTo(36.30689, 4.406405)
shape.curveTo(36.95988, 4.406405, 37.485577, 4.9188805, 37.485577, 5.5554533)
shape.lineTo(37.485577, 24.345886)
shape.lineTo(10.391575, 24.345886)
shape.lineTo(10.391575, 5.5554533)
shape.curveTo(10.391575, 4.9188805, 10.91727, 4.406405, 11.570264, 4.406405)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(137, 137, 137, 255)
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(11.570264, 4.406405)
shape.lineTo(36.30689, 4.406405)
shape.curveTo(36.95988, 4.406405, 37.485577, 4.9188805, 37.485577, 5.5554533)
shape.lineTo(37.485577, 24.345886)
shape.lineTo(10.391575, 24.345886)
shape.lineTo(10.391575, 5.5554533)
shape.curveTo(10.391575, 4.9188805, 10.91727, 4.406405, 11.570264, 4.406405)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = LinearGradientPaint(Point2D.Double(20.771228790283203, 25.1402530670166), Point2D.Double(20.71780014038086, 19.33746337890625), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 0),Color(248, 248, 248, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.202355980873108f, 0.0f, 0.0f, 0.8548570275306702f, -0.3023799955844879f, 2.0f))
stroke = BasicStroke(0.99999994f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(11.374062538146973, 5.469976425170898, 25.075401306152344, 18.864879608154297, 0.3535533547401428, 0.3535533845424652)
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
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(42.9375, 26.75)
shape.lineTo(4.8125, 26.75)
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
shape = Rectangle2D.Double(14.0, 5.0, 19.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_1
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 7.0, 19.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_2
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 9.0, 19.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_3
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 11.0, 19.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_4
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 13.0, 11.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_5
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 17.0, 19.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_6
paint = Color(0, 0, 0, 75)
shape = Rectangle2D.Double(14.0, 19.0, 19.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11_6
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(0.7156779766082764f, 0.0f, 0.0f, 0.7156779766082764f, 4.077534198760986f, 4.71388578414917f))
// _0_0_12
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12_0
paint = Color(220, 220, 220, 255)
shape = GeneralPath()
shape.moveTo(18.62757, 3.1435547)
shape.curveTo(10.488439, 3.1435547, 3.8827682, 9.749226, 3.8827682, 17.888355)
shape.curveTo(3.8827682, 26.027487, 10.488439, 32.63316, 18.62757, 32.63316)
shape.curveTo(22.107124, 32.63316, 25.17857, 31.248766, 27.701292, 29.23051)
shape.curveTo(27.495914, 30.237392, 27.623257, 31.265879, 28.457436, 31.990437)
shape.lineTo(39.42152, 41.517845)
shape.curveTo(40.654938, 42.589176, 42.508984, 42.448807, 43.58031, 41.21539)
shape.curveTo(44.651638, 39.98197, 44.51127, 38.127926, 43.27785, 37.0566)
shape.lineTo(32.31377, 27.529188)
shape.curveTo(31.642242, 26.94591, 30.82089, 26.773218, 30.00753, 26.886465)
shape.curveTo(31.99423, 24.374044, 33.37237, 21.337664, 33.37237, 17.888355)
shape.curveTo(33.37237, 9.749226, 26.766699, 3.1435547, 18.62757, 3.1435547)
shape.closePath()
shape.moveTo(18.551954, 4.369738)
shape.curveTo(26.191414, 4.369738, 31.843729, 9.158689, 31.843729, 17.661512)
shape.curveTo(31.843729, 26.336626, 26.027039, 30.953287, 18.551954, 30.953287)
shape.curveTo(11.249005, 30.953287, 5.2601805, 25.475197, 5.2601805, 17.661512)
shape.curveTo(5.2601805, 9.677406, 11.084819, 4.369738, 18.551954, 4.369738)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(27.36634063720703, 26.58029556274414), Point2D.Double(31.33596420288086, 30.557771682739258), floatArrayOf(0.0f,1.0f), arrayOf(Color(138, 138, 138, 255),Color(72, 72, 72, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(2.7945554f,1,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(18.62757, 3.1435547)
shape.curveTo(10.488439, 3.1435547, 3.8827682, 9.749226, 3.8827682, 17.888355)
shape.curveTo(3.8827682, 26.027487, 10.488439, 32.63316, 18.62757, 32.63316)
shape.curveTo(22.107124, 32.63316, 25.17857, 31.248766, 27.701292, 29.23051)
shape.curveTo(27.495914, 30.237392, 27.623257, 31.265879, 28.457436, 31.990437)
shape.lineTo(39.42152, 41.517845)
shape.curveTo(40.654938, 42.589176, 42.508984, 42.448807, 43.58031, 41.21539)
shape.curveTo(44.651638, 39.98197, 44.51127, 38.127926, 43.27785, 37.0566)
shape.lineTo(32.31377, 27.529188)
shape.curveTo(31.642242, 26.94591, 30.82089, 26.773218, 30.00753, 26.886465)
shape.curveTo(31.99423, 24.374044, 33.37237, 21.337664, 33.37237, 17.888355)
shape.curveTo(33.37237, 9.749226, 26.766699, 3.1435547, 18.62757, 3.1435547)
shape.closePath()
shape.moveTo(18.551954, 4.369738)
shape.curveTo(26.191414, 4.369738, 31.843729, 9.158689, 31.843729, 17.661512)
shape.curveTo(31.843729, 26.336626, 26.027039, 30.953287, 18.551954, 30.953287)
shape.curveTo(11.249005, 30.953287, 5.2601805, 25.475197, 5.2601805, 17.661512)
shape.curveTo(5.2601805, 9.677406, 11.084819, 4.369738, 18.551954, 4.369738)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_12_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12_1
paint = Color(220, 220, 220, 255)
shape = GeneralPath()
shape.moveTo(18.602905, 3.0803552)
shape.curveTo(10.437465, 3.0803552, 3.8104408, 9.707379, 3.8104408, 17.87282)
shape.curveTo(3.8104408, 26.03826, 10.437465, 32.665283, 18.602905, 32.665283)
shape.curveTo(22.093708, 32.665283, 25.175081, 31.276417, 27.70596, 29.251638)
shape.curveTo(27.49992, 30.261774, 27.627672, 31.293585, 28.464546, 32.020485)
shape.lineTo(39.464073, 41.57869)
shape.curveTo(40.701477, 42.653484, 42.561516, 42.51266, 43.636307, 41.275257)
shape.curveTo(44.711098, 40.037853, 44.570274, 38.177814, 43.33287, 37.103024)
shape.lineTo(32.333347, 27.544815)
shape.curveTo(31.659649, 26.959652, 30.835642, 26.786402, 30.019653, 26.900017)
shape.curveTo(32.012775, 24.379473, 33.39537, 21.333277, 33.39537, 17.87282)
shape.curveTo(33.39537, 9.707379, 26.768345, 3.0803552, 18.602905, 3.0803552)
shape.closePath()
shape.moveTo(18.527046, 6.266424)
shape.curveTo(24.808153, 6.2664247, 29.905865, 11.364135, 29.905865, 17.645243)
shape.curveTo(29.905865, 23.926352, 24.808153, 29.024061, 18.527046, 29.024061)
shape.curveTo(12.245938, 29.024061, 7.1482277, 23.926352, 7.1482277, 17.645243)
shape.curveTo(7.1482277, 11.364135, 12.245938, 6.266424, 18.527046, 6.266424)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_12_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12_2
paint = LinearGradientPaint(Point2D.Double(30.65625, 34.0), Point2D.Double(33.21875, 31.0625), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(125, 125, 125, 255),Color(177, 177, 177, 255),Color(104, 104, 104, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3345930576324463f, 0.0f, 0.0f, 1.2912919521331787f, -6.973842144012451f, -7.460658073425293f))
shape = GeneralPath()
shape.moveTo(39.507004, 41.57769)
shape.curveTo(39.02833, 39.304504, 40.904335, 36.76627, 43.091057, 36.789314)
shape.curveTo(43.091057, 36.789314, 32.33069, 27.531204, 32.33069, 27.531204)
shape.curveTo(29.385899, 27.474499, 28.061188, 29.80382, 28.553877, 32.131126)
shape.lineTo(39.507004, 41.57769)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_12_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12_3 = g.transform
g.transform(AffineTransform(1.2457430362701416f, 0.0f, 0.0f, 1.2457430362701416f, -3.4253458976745605f, -6.177032947540283f))
// _0_0_12_3
paint = LinearGradientPaint(Point2D.Double(18.292673110961914, 13.602121353149414), Point2D.Double(17.500892639160156, 25.74346923828125), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 56),Color(255, 255, 255, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.1216413f,1,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(28.549437, 18.920233)
shape.curveTo(28.567142, 22.879269, 26.465181, 26.545166, 23.039478, 28.529814)
shape.curveTo(19.613773, 30.51446, 15.388013, 30.51446, 11.962308, 28.529814)
shape.curveTo(8.536603, 26.545166, 6.4346433, 22.879269, 6.4523487, 18.920233)
shape.curveTo(6.4346433, 14.961198, 8.536603, 11.295299, 11.962308, 9.310653)
shape.curveTo(15.388013, 7.326006, 19.613773, 7.326006, 23.039478, 9.310653)
shape.curveTo(26.465181, 11.295299, 28.567142, 14.961198, 28.549437, 18.920233)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_12_3
g.composite = AlphaComposite.getInstance(3, 0.4331551f * origAlpha)
val defaultTransform__0_0_12_4 = g.transform
g.transform(AffineTransform(0.7529860138893127f, 0.658037006855011f, -0.6489019989967346f, 0.7608720064163208f, 0.0f, 0.0f))
// _0_0_12_4
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.3973206f,1,0,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(40.373348236083984, 0.14086054265499115, 19.048444747924805, 4.440478324890137, 5.971015930175781, 4.440478324890137)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_12_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12_5 = g.transform
g.transform(AffineTransform(1.3986140489578247f, 0.0f, 0.0f, 1.3986140489578247f, -6.224338054656982f, -8.298957824707031f))
// _0_0_12_5
paint = RadialGradientPaint(Point2D.Double(18.240928649902344, 21.8179874420166), 8.308505f, Point2D.Double(18.240928649902344, 21.8179874420166), floatArrayOf(0.0f,1.0f), arrayOf(Color(114, 159, 207, 53),Color(114, 159, 207, 172)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(25.897785, 18.478292)
shape.curveTo(25.9111, 21.455486, 24.330425, 24.212242, 21.754295, 25.704697)
shape.curveTo(19.178165, 27.197151, 16.000395, 27.197151, 13.424265, 25.704697)
shape.curveTo(10.848135, 24.212242, 9.267462, 21.455486, 9.280776, 18.478292)
shape.curveTo(9.267462, 15.501098, 10.848135, 12.744343, 13.424265, 11.251888)
shape.curveTo(16.000395, 9.759435, 19.178165, 9.759435, 21.754295, 11.251888)
shape.curveTo(24.330425, 12.744343, 25.9111, 15.501098, 25.897785, 18.478292)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(48, 99, 163, 255)
stroke = BasicStroke(0.99904466f,1,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(25.897785, 18.478292)
shape.curveTo(25.9111, 21.455486, 24.330425, 24.212242, 21.754295, 25.704697)
shape.curveTo(19.178165, 27.197151, 16.000395, 27.197151, 13.424265, 25.704697)
shape.curveTo(10.848135, 24.212242, 9.267462, 21.455486, 9.280776, 18.478292)
shape.curveTo(9.267462, 15.501098, 10.848135, 12.744343, 13.424265, 11.251888)
shape.curveTo(16.000395, 9.759435, 19.178165, 9.759435, 21.754295, 11.251888)
shape.curveTo(24.330425, 12.744343, 25.9111, 15.501098, 25.897785, 18.478292)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_12_5
g.composite = AlphaComposite.getInstance(3, 0.8342246f * origAlpha)
val defaultTransform__0_0_12_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12_6
paint = RadialGradientPaint(Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, Point2D.Double(15.4143705368042, 13.078408241271973), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 63)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.5929629802703857f, -7.746899656918026E-24f, -5.714442921965876E-24f, 2.2521040439605713f, -25.059749603271484f, -18.94099998474121f))
shape = GeneralPath()
shape.moveTo(18.156916, 7.3966937)
shape.curveTo(12.949325, 7.3966937, 8.732368, 11.613651, 8.732368, 16.821241)
shape.curveTo(8.732368, 18.325216, 9.152676, 19.709015, 9.77954, 20.971144)
shape.curveTo(11.03192, 21.432756, 12.362297, 21.746826, 13.774307, 21.746826)
shape.curveTo(19.945263, 21.746826, 24.873589, 16.88519, 25.254414, 10.809698)
shape.curveTo(23.523449, 8.764167, 21.044374, 7.3966937, 18.156916, 7.3966937)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_12_6
g.transform = defaultTransform__0_0_12
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
            return 2.926776647567749
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 3.906404972076416
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 42.19822311401367
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 42.65172576904297
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Document_print_preview(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Document_print_preview(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): ResizableIconFactory {
            return ResizableIconFactory { Document_print_preview(16, 16) }
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

