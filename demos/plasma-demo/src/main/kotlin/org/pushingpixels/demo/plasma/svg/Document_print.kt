package org.pushingpixels.demo.plasma.svg

import java.awt.*
import java.awt.geom.*
import java.awt.image.BufferedImage
import java.io.*
import java.lang.ref.WeakReference
import java.util.Base64
import java.util.Stack
import javax.imageio.ImageIO
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.api.icon.ResizableIcon
import org.pushingpixels.neon.api.icon.ResizableIcon.Factory
import org.pushingpixels.neon.api.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Document_print private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private val transformsStack = Stack<AffineTransform>()

    

	private fun _paint0(g : Graphics2D,origAlpha : Float) {
transformsStack.push(g.transform)
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.3119190037250519f, -2.006727933883667f))
// _0_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(43.125, 41.875)
(shape as GeneralPath).curveTo(43.155647, 44.15936, 39.517162, 46.274582, 33.587276, 47.41972)
(shape as GeneralPath).curveTo(27.65739, 48.564857, 20.34261, 48.564857, 14.4127245, 47.41972)
(shape as GeneralPath).curveTo(8.482839, 46.274582, 4.8443522, 44.15936, 4.875, 41.875)
(shape as GeneralPath).curveTo(4.8443522, 39.59064, 8.482839, 37.475418, 14.4127245, 36.33028)
(shape as GeneralPath).curveTo(20.34261, 35.185143, 27.65739, 35.185143, 33.587276, 36.33028)
(shape as GeneralPath).curveTo(39.517162, 37.475418, 43.155647, 39.59064, 43.125, 41.875)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(24.0, 41.875), 19.125f, Point2D.Double(24.0, 41.875), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.33333298563957214f, 0.0f, 27.916669845581055f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
shape = RoundRectangle2D.Double(4.75, 36.0, 38.4375, 6.4375, 3.4230966567993164, 3.4230966567993164)
paint = LinearGradientPaint(Point2D.Double(1.8456430435180664, 88.29493713378906), Point2D.Double(18.972126007080078, 88.29493713378906), floatArrayOf(0.0f,0.27586207f,1.0f), arrayOf(Color(142, 141, 135, 255),Color(203, 201, 193, 255),Color(142, 141, 135, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.302720069885254f, 0.0f, 0.0f, 0.4342690110206604f, 0.0f, 0.875f))
g.paint = paint
g.fill(shape)
paint = Color(89, 89, 89, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(4.75, 36.0, 38.4375, 6.4375, 3.4230966567993164, 3.4230966567993164)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
shape = GeneralPath()
(shape as GeneralPath).moveTo(7.075825, 21.5)
(shape as GeneralPath).lineTo(40.975952, 21.5)
(shape as GeneralPath).curveTo(41.362827, 21.5, 41.857155, 21.788155, 42.162, 22.223919)
(shape as GeneralPath).curveTo(42.466843, 22.659683, 43.906723, 24.83394, 44.230183, 25.297964)
(shape as GeneralPath).curveTo(44.553642, 25.761988, 44.625, 26.201853, 44.625, 26.77405)
(shape as GeneralPath).lineTo(44.625, 38.850952)
(shape as GeneralPath).curveTo(44.625, 39.764523, 43.889523, 40.5, 42.975952, 40.5)
(shape as GeneralPath).lineTo(5.075825, 40.5)
(shape as GeneralPath).curveTo(4.1622524, 40.5, 3.4267766, 39.764523, 3.4267766, 38.850952)
(shape as GeneralPath).lineTo(3.4267766, 26.77405)
(shape as GeneralPath).curveTo(3.4267766, 26.280031, 3.5284235, 25.571642, 3.8753054, 25.120718)
(shape as GeneralPath).curveTo(4.313023, 24.551714, 5.487279, 22.57277, 5.7970057, 22.153118)
(shape as GeneralPath).curveTo(6.1067324, 21.733467, 6.675481, 21.5, 7.075825, 21.5)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(1.8456430435180664, 88.29492950439453), Point2D.Double(18.972126007080078, 88.29492950439453), floatArrayOf(0.0f,1.0f), arrayOf(Color(220, 220, 218, 255),Color(186, 185, 183, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.302720069885254f, 0.0f, 0.0f, 0.4342690110206604f, 0.0f, 2.0f))
g.paint = paint
g.fill(shape)
paint = Color(103, 103, 103, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(7.075825, 21.5)
(shape as GeneralPath).lineTo(40.975952, 21.5)
(shape as GeneralPath).curveTo(41.362827, 21.5, 41.857155, 21.788155, 42.162, 22.223919)
(shape as GeneralPath).curveTo(42.466843, 22.659683, 43.906723, 24.83394, 44.230183, 25.297964)
(shape as GeneralPath).curveTo(44.553642, 25.761988, 44.625, 26.201853, 44.625, 26.77405)
(shape as GeneralPath).lineTo(44.625, 38.850952)
(shape as GeneralPath).curveTo(44.625, 39.764523, 43.889523, 40.5, 42.975952, 40.5)
(shape as GeneralPath).lineTo(5.075825, 40.5)
(shape as GeneralPath).curveTo(4.1622524, 40.5, 3.4267766, 39.764523, 3.4267766, 38.850952)
(shape as GeneralPath).lineTo(3.4267766, 26.77405)
(shape as GeneralPath).curveTo(3.4267766, 26.280031, 3.5284235, 25.571642, 3.8753054, 25.120718)
(shape as GeneralPath).curveTo(4.313023, 24.551714, 5.487279, 22.57277, 5.7970057, 22.153118)
(shape as GeneralPath).curveTo(6.1067324, 21.733467, 6.675481, 21.5, 7.075825, 21.5)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
shape = GeneralPath()
(shape as GeneralPath).moveTo(7.424621, 21.975533)
(shape as GeneralPath).curveTo(6.921893, 21.975533, 6.2754774, 22.107307, 6.010408, 22.511225)
(shape as GeneralPath).lineTo(4.1542525, 25.339651)
(shape as GeneralPath).curveTo(3.8554516, 25.794966, 4.1881986, 26.868141, 5.087311, 26.868141)
(shape as GeneralPath).lineTo(42.730785, 26.868141)
(shape as GeneralPath).curveTo(43.946983, 26.868141, 43.950535, 25.858072, 43.663845, 25.42804)
(shape as GeneralPath).lineTo(41.896076, 22.776388)
(shape as GeneralPath).curveTo(41.575542, 22.29559, 41.459198, 21.975533, 40.65864, 21.975533)
(shape as GeneralPath).lineTo(7.424621, 21.975533)
(shape as GeneralPath).closePath()
paint = Color(251, 251, 251, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(15.387969017028809, 32.53923797607422), Point2D.Double(15.487822532653809, 58.83126449584961), floatArrayOf(0.0f,0.10344828f,1.0f), arrayOf(Color(255, 255, 255, 32),Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.495347023010254f, 0.0f, 0.0f, 0.66874098777771f, 0.0f, 2.0f))
stroke = BasicStroke(0.946967f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(7.537484, 22.445757)
(shape as GeneralPath).lineTo(40.425903, 22.445757)
(shape as GeneralPath).curveTo(40.792263, 22.445757, 41.260372, 22.71863, 41.54905, 23.131283)
(shape as GeneralPath).curveTo(41.837727, 23.543938, 42.847694, 25.160946, 43.154, 25.60036)
(shape as GeneralPath).curveTo(43.460304, 26.039776, 43.59038, 26.456312, 43.59038, 26.998163)
(shape as GeneralPath).lineTo(43.59038, 38.279263)
(shape as GeneralPath).curveTo(43.59038, 39.144386, 43.45641, 39.528355, 42.591286, 39.528355)
(shape as GeneralPath).lineTo(5.4604917, 39.528355)
(shape as GeneralPath).curveTo(4.5953684, 39.528355, 4.398897, 39.144386, 4.398897, 38.279263)
(shape as GeneralPath).lineTo(4.398897, 26.998163)
(shape as GeneralPath).curveTo(4.398897, 26.530346, 4.6201534, 25.859524, 4.948639, 25.432514)
(shape as GeneralPath).curveTo(5.363143, 24.893684, 6.033183, 23.461634, 6.326484, 23.064238)
(shape as GeneralPath).curveTo(6.619785, 22.666842, 7.158371, 22.445757, 7.537484, 22.445757)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
shape = GeneralPath()
(shape as GeneralPath).moveTo(11.570264, 4.406405)
(shape as GeneralPath).lineTo(36.30689, 4.406405)
(shape as GeneralPath).curveTo(36.95988, 4.406405, 37.485577, 4.9188805, 37.485577, 5.5554533)
(shape as GeneralPath).lineTo(37.485577, 24.345886)
(shape as GeneralPath).lineTo(10.391575, 24.345886)
(shape as GeneralPath).lineTo(10.391575, 5.5554533)
(shape as GeneralPath).curveTo(10.391575, 4.9188805, 10.91727, 4.406405, 11.570264, 4.406405)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(25.056711196899414, 3.6785457134246826), Point2D.Double(24.78970718383789, 25.247310638427734), floatArrayOf(0.0f,0.4054697f,0.5344828f,1.0f), arrayOf(Color(224, 224, 224, 255),Color(255, 255, 255, 255),Color(205, 205, 205, 255),Color(73, 73, 73, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9489499926567078f, 0.0f, 0.0f, 1.0809789896011353f, -0.0923556387424469f, 4.000000953674316f))
g.paint = paint
g.fill(shape)
paint = Color(137, 137, 137, 255)
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(11.570264, 4.406405)
(shape as GeneralPath).lineTo(36.30689, 4.406405)
(shape as GeneralPath).curveTo(36.95988, 4.406405, 37.485577, 4.9188805, 37.485577, 5.5554533)
(shape as GeneralPath).lineTo(37.485577, 24.345886)
(shape as GeneralPath).lineTo(10.391575, 24.345886)
(shape as GeneralPath).lineTo(10.391575, 5.5554533)
(shape as GeneralPath).curveTo(10.391575, 4.9188805, 10.91727, 4.406405, 11.570264, 4.406405)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = LinearGradientPaint(Point2D.Double(20.771228790283203, 25.1402530670166), Point2D.Double(20.71780014038086, 19.33746337890625), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 0),Color(248, 248, 248, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.202355980873108f, 0.0f, 0.0f, 0.8548570275306702f, -0.3023799955844879f, 2.0f))
stroke = BasicStroke(0.99999994f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(11.374062538146973, 5.469976425170898, 25.075401306152344, 18.864879608154297, 0.3535533547401428, 0.3535533845424652)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
shape = RoundRectangle2D.Double(6.875, 27.375, 33.75, 5.1875, 3.4230966567993164, 3.4230966567993164)
paint = LinearGradientPaint(Point2D.Double(10.33823299407959, 64.65225982666016), Point2D.Double(10.33823299407959, 54.136138916015625), floatArrayOf(0.0f,1.0f), arrayOf(Color(247, 246, 245, 255),Color(247, 246, 245, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.3698439598083496f, 0.0f, 0.0f, 0.4219689965248108f, 0.0f, 2.0f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(9.731653213500977, 70.7249755859375), Point2D.Double(9.705278396606445, 62.282466888427734), floatArrayOf(0.0f,1.0f), arrayOf(Color(102, 102, 102, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.3698439598083496f, 0.0f, 0.0f, 0.4219689965248108f, 0.0f, 2.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.875, 27.375, 33.75, 5.1875, 3.4230966567993164, 3.4230966567993164)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f))
// _0_0_8
shape = GeneralPath()
(shape as GeneralPath).moveTo(10.871767, 27.626486)
(shape as GeneralPath).curveTo(10.873821, 28.085733, 10.629993, 28.510979, 10.232612, 28.741198)
(shape as GeneralPath).curveTo(9.83523, 28.971416, 9.345042, 28.971416, 8.94766, 28.741198)
(shape as GeneralPath).curveTo(8.550279, 28.510979, 8.306451, 28.085733, 8.308505, 27.626486)
(shape as GeneralPath).curveTo(8.306451, 27.167238, 8.550279, 26.741993, 8.94766, 26.511774)
(shape as GeneralPath).curveTo(9.345042, 26.281555, 9.83523, 26.281555, 10.232612, 26.511774)
(shape as GeneralPath).curveTo(10.629993, 26.741993, 10.873821, 27.167238, 10.871767, 27.626486)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(9.129549026489258, 26.925594329833984), 2.1227016f, Point2D.Double(9.129549026489258, 26.925594329833984), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(255, 255, 253, 255),Color(187, 187, 185, 255),Color(0, 0, 0, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.36571428f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
shape = GeneralPath()
(shape as GeneralPath).moveTo(11.743718, 25.416054)
(shape as GeneralPath).lineTo(37.306217, 25.478554)
(shape as GeneralPath).curveTo(37.993717, 25.480234, 38.294037, 25.107557, 38.243717, 24.478554)
(shape as GeneralPath).lineTo(38.118717, 22.916054)
(shape as GeneralPath).lineTo(39.984837, 22.916054)
(shape as GeneralPath).curveTo(40.797337, 22.916054, 40.975037, 23.108616, 41.172337, 23.478554)
(shape as GeneralPath).lineTo(41.672337, 24.416054)
(shape as GeneralPath).curveTo(42.19913, 25.403793, 43.48351, 26.390165, 42.170494, 26.390165)
(shape as GeneralPath).curveTo(37.667786, 26.390165, 13.993718, 26.041054, 11.743718, 25.416054)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(9.869808197021484, 57.2276496887207), Point2D.Double(9.912813186645508, 72.06431579589844), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 60),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7720859050750732f, 0.0f, 0.0f, 0.36073899269104004f, 0.6187180280685425f, 2.883882999420166f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(42.9375, 26.75)
(shape as GeneralPath).lineTo(4.8125, 26.75)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.43575415f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f))
// _0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_0
shape = Rectangle2D.Double(14.0, 5.0, 19.0, 1.0)
paint = Color(0, 0, 0, 75)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_1
shape = Rectangle2D.Double(14.0, 7.0, 19.0, 1.0)
paint = Color(0, 0, 0, 75)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_2
shape = Rectangle2D.Double(14.0, 9.0, 19.0, 1.0)
paint = Color(0, 0, 0, 75)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_3
shape = Rectangle2D.Double(14.0, 11.0, 19.0, 1.0)
paint = Color(0, 0, 0, 75)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11_4
shape = Rectangle2D.Double(14.0, 13.0, 11.0, 1.0)
paint = Color(0, 0, 0, 75)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(21.02159, 20.989431)
(shape as GeneralPath).lineTo(27.989391, 20.989431)
(shape as GeneralPath).lineTo(27.989391, 16.064983)
(shape as GeneralPath).lineTo(31.0, 16.064983)
(shape as GeneralPath).lineTo(24.553757, 8.0)
(shape as GeneralPath).lineTo(17.435621, 15.986875)
(shape as GeneralPath).lineTo(21.023684, 15.986875)
(shape as GeneralPath).lineTo(21.02159, 20.989431)
(shape as GeneralPath).closePath()
paint = Color(167, 167, 167, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()

}



	private fun innerPaint(g : Graphics2D) {
        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    _paint0(g, origAlpha)


	    shape = null
	    paint = null
	    stroke = null
	    clip = null
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
            return Document_print(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Document_print(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Document_print(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

