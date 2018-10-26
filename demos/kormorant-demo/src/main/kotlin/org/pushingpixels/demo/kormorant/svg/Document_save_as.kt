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
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Document_save_as(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
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
g.composite = AlphaComposite.getInstance(3, 0.56f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.0525330305099487f, 0.0f, 0.0f, 0.3631129860877991f, -0.5117570161819458f, 31.99485969543457f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(23.201940536499023, 27.096155166625977), 23.555494f, Point2D.Double(23.201940536499023, 27.096155166625977), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.6510319709777832f, -2.8850630397751114E-16f, 9.455693244934082f))
shape = GeneralPath()
shape.moveTo(46.757435, 27.096155)
shape.curveTo(46.79518, 32.591297, 42.313805, 37.67956, 35.010204, 40.434254)
shape.curveTo(27.7066, 43.188942, 18.69728, 43.188942, 11.393679, 40.434254)
shape.curveTo(4.0900764, 37.67956, -0.39130166, 32.591297, -0.35355377, 27.096155)
shape.curveTo(-0.39130166, 21.601015, 4.0900764, 16.512747, 11.393679, 13.758058)
shape.curveTo(18.69728, 11.003368, 27.7066, 11.003368, 35.010204, 13.758058)
shape.curveTo(42.313805, 16.512747, 46.79518, 21.601015, 46.757435, 27.096155)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = Color(83, 83, 83, 255)
stroke = BasicStroke(2.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(11.28569, 13.087628)
shape.curveTo(10.66069, 13.087628, 10.254441, 13.377808, 10.004442, 13.931381)
shape.curveTo(10.004441, 13.931381, 3.5356915, 31.034939, 3.5356915, 31.034939)
shape.curveTo(3.5356915, 31.034939, 3.2856915, 31.706497, 3.2856915, 32.81619)
shape.curveTo(3.2856915, 32.81619, 3.2856915, 42.466156, 3.2856915, 42.466156)
shape.curveTo(3.2856915, 43.54877, 3.943477, 44.09116, 4.9419417, 44.091156)
shape.lineTo(43.50444, 44.091156)
shape.curveTo(44.489292, 44.091156, 45.09819, 43.372974, 45.09819, 42.247406)
shape.lineTo(45.09819, 32.59744)
shape.curveTo(45.09819, 32.59744, 45.20415, 31.827015, 45.00444, 31.284939)
shape.lineTo(38.28569, 14.087631)
shape.curveTo(38.101166, 13.575725, 37.648785, 13.099533, 37.16069, 13.087628)
shape.lineTo(11.28569, 13.087628)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = LinearGradientPaint(Point2D.Double(7.604620456695557, 28.481176376342773), Point2D.Double(36.183067321777344, 40.94393539428711), floatArrayOf(0.0f,1.0f), arrayOf(Color(187, 187, 187, 255),Color(159, 159, 159, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.125f))
shape = GeneralPath()
shape.moveTo(3.2735915, 32.12181)
shape.lineTo(4.0381937, 31.429598)
shape.lineTo(41.647884, 31.492098)
shape.lineTo(45.11029, 31.809395)
shape.lineTo(45.11029, 42.24793)
shape.curveTo(45.11029, 43.373497, 44.503273, 44.09126, 43.518417, 44.09126)
shape.lineTo(4.9354315, 44.09126)
shape.curveTo(3.9369667, 44.09126, 3.2735915, 43.549206, 3.2735915, 42.466595)
shape.lineTo(3.2735915, 32.12181)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = RadialGradientPaint(Point2D.Double(15.571491241455078, 2.9585189819335938), 20.935818f, Point2D.Double(15.571491241455078, 2.9585189819335938), floatArrayOf(0.0f,1.0f), arrayOf(Color(228, 228, 228, 255),Color(211, 211, 211, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2862420082092285f, 0.7816979885101318f, -0.710781991481781f, 1.169551968574524f, -2.3543479442596436f, 0.24814000725746155f))
shape = GeneralPath()
shape.moveTo(3.5490842, 31.039404)
shape.curveTo(2.8347986, 32.50369, 3.5484686, 33.432262, 4.5847983, 33.432262)
shape.curveTo(4.5847983, 33.432262, 43.584797, 33.432262, 43.584797, 33.432262)
shape.curveTo(44.703842, 33.40845, 45.430035, 32.420357, 45.013367, 31.289404)
shape.lineTo(38.299084, 14.078704)
shape.curveTo(38.11456, 13.566798, 37.64432, 13.090606, 37.156223, 13.078701)
shape.lineTo(11.299083, 13.078701)
shape.curveTo(10.674083, 13.078701, 10.263369, 13.382274, 10.01337, 13.935847)
shape.curveTo(10.01337, 13.935847, 3.5490842, 31.039404, 3.5490842, 31.039404)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(7.0625, 35.28125), Point2D.Double(24.6875, 35.28125), floatArrayOf(0.0f,1.0f), arrayOf(Color(131, 131, 131, 255),Color(187, 187, 187, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.7954930067062378f, 3.799180030822754f))
shape = Rectangle2D.Double(7.857995986938477, 36.2991828918457, 17.625, 5.5625)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 0.81142855f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = LinearGradientPaint(Point2D.Double(12.277412414550781, 37.205810546875), Point2D.Double(12.221822738647461, 33.7586669921875), floatArrayOf(0.0f,1.0f), arrayOf(Color(238, 238, 238, 255),Color(238, 238, 238, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.125f))
shape = GeneralPath()
shape.moveTo(7.857995, 41.86168)
shape.curveTo(7.857995, 41.86168, 7.857995, 37.850197, 7.857995, 37.850197)
shape.curveTo(9.693522, 41.029423, 16.154486, 41.86168, 20.795492, 41.86168)
shape.curveTo(20.795492, 41.86168, 7.857995, 41.86168, 7.857995, 41.86168)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(44.79616, 30.753689)
shape.curveTo(44.859684, 32.003662, 44.38216, 33.069527, 43.474045, 33.09744)
shape.curveTo(43.474045, 33.09744, 5.3553295, 33.09744, 5.3553295, 33.09744)
shape.curveTo(4.0660977, 33.09744, 3.4875937, 32.77249, 3.271279, 32.22938)
shape.curveTo(3.3630404, 33.173714, 4.0970964, 33.87869, 5.3553295, 33.87869)
shape.curveTo(5.3553295, 33.87869, 43.474045, 33.87869, 43.474045, 33.87869)
shape.curveTo(44.550053, 33.845615, 45.226852, 32.454662, 44.82621, 30.883898)
shape.lineTo(44.79616, 30.753689)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 0.69142854f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = LinearGradientPaint(Point2D.Double(23.688077926635742, 11.318835258483887), Point2D.Double(23.688077926635742, 26.3571834564209), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 65),Color(255, 255, 255, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.125f))
shape = GeneralPath()
shape.moveTo(10.96875, 15.28125)
shape.curveTo(10.922675, 15.481571, 10.78125, 15.668047, 10.78125, 15.875)
shape.curveTo(10.78125, 16.823605, 11.37223, 17.664474, 12.125, 18.46875)
shape.curveTo(12.365268, 18.314674, 12.490117, 18.114342, 12.75, 17.96875)
shape.curveTo(11.809691, 17.152746, 11.196604, 16.252169, 10.96875, 15.28125)
shape.closePath()
shape.moveTo(37.625, 15.28125)
shape.curveTo(37.396275, 16.250866, 36.78299, 17.153675, 35.84375, 17.96875)
shape.curveTo(36.117893, 18.122332, 36.247738, 18.33699, 36.5, 18.5)
shape.curveTo(37.257263, 17.693344, 37.8125, 16.826956, 37.8125, 15.875)
shape.curveTo(37.8125, 15.668047, 37.670906, 15.481571, 37.625, 15.28125)
shape.closePath()
shape.moveTo(39.8125, 23.71875)
shape.curveTo(39.198708, 27.758862, 32.513885, 30.96875, 24.28125, 30.96875)
shape.curveTo(16.068996, 30.968752, 9.421101, 27.775965, 8.78125, 23.75)
shape.curveTo(8.748893, 23.947132, 8.65625, 24.141882, 8.65625, 24.34375)
shape.curveTo(8.65625, 28.661697, 15.645354, 32.1875, 24.28125, 32.1875)
shape.curveTo(32.917145, 32.1875, 39.9375, 28.661697, 39.9375, 24.34375)
shape.curveTo(39.9375, 24.130827, 39.84845, 23.926394, 39.8125, 23.71875)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.08838842809200287f, 5.3017802238464355f))
// _0_0_8
paint = Color(255, 255, 255, 117)
shape = GeneralPath()
shape.moveTo(8.57367, 25.593554)
shape.curveTo(8.575866, 25.957785, 8.315223, 26.295048, 7.890435, 26.477634)
shape.curveTo(7.4656477, 26.660223, 6.9416537, 26.660223, 6.516866, 26.477634)
shape.curveTo(6.0920787, 26.295048, 5.8314357, 25.957785, 5.833631, 25.593554)
shape.curveTo(5.8314357, 25.229322, 6.0920787, 24.89206, 6.516866, 24.709473)
shape.curveTo(6.9416537, 24.526884, 7.4656477, 24.526884, 7.890435, 24.709473)
shape.curveTo(8.315223, 24.89206, 8.575866, 25.229322, 8.57367, 25.593554)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 33.96704864501953f, 5.213389873504639f))
// _0_0_9
paint = Color(255, 255, 255, 117)
shape = GeneralPath()
shape.moveTo(8.57367, 25.593554)
shape.curveTo(8.575866, 25.957785, 8.315223, 26.295048, 7.890435, 26.477634)
shape.curveTo(7.4656477, 26.660223, 6.9416537, 26.660223, 6.516866, 26.477634)
shape.curveTo(6.0920787, 26.295048, 5.8314357, 25.957785, 5.833631, 25.593554)
shape.curveTo(5.8314357, 25.229322, 6.0920787, 24.89206, 6.516866, 24.709473)
shape.curveTo(6.9416537, 24.526884, 7.4656477, 24.526884, 7.890435, 24.709473)
shape.curveTo(8.315223, 24.89206, 8.575866, 25.229322, 8.57367, 25.593554)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
paint = LinearGradientPaint(Point2D.Double(12.37835693359375, 4.433135986328125), Point2D.Double(44.096099853515625, 47.620635986328125), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.125f))
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(11.642515, 13.540723)
shape.curveTo(11.040823, 13.540723, 10.649724, 13.820081, 10.409049, 14.35301)
shape.curveTo(10.409048, 14.35301, 3.994034, 30.943731, 3.994034, 30.943731)
shape.curveTo(3.994034, 30.943731, 3.7533574, 31.590246, 3.7533574, 32.658554)
shape.curveTo(3.7533574, 32.658554, 3.7533574, 41.94865, 3.7533574, 41.94865)
shape.curveTo(3.7533574, 43.30339, 4.1974134, 43.57555, 5.3478413, 43.57555)
shape.lineTo(43.034744, 43.57555)
shape.curveTo(44.357872, 43.57555, 44.56906, 43.25915, 44.56906, 41.738056)
shape.lineTo(44.56906, 32.447964)
shape.curveTo(44.56906, 32.447964, 44.67107, 31.70627, 44.478806, 31.184408)
shape.lineTo(37.885616, 14.378434)
shape.curveTo(37.707973, 13.885617, 37.334965, 13.552184, 36.86507, 13.540723)
shape.lineTo(11.642515, 13.540723)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
paint = Color(255, 255, 255, 108)
stroke = BasicStroke(1.0000005f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(40.5, 36.554165)
shape.lineTo(40.5, 41.5751)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
paint = Color(255, 255, 255, 108)
stroke = BasicStroke(1.0000005f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(38.5, 36.61394)
shape.lineTo(38.5, 41.634876)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_12
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
paint = Color(255, 255, 255, 108)
stroke = BasicStroke(1.0000005f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(36.5, 36.61394)
shape.lineTo(36.5, 41.634876)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_13
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
paint = Color(255, 255, 255, 108)
stroke = BasicStroke(1.0000005f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(34.5, 36.61394)
shape.lineTo(34.5, 41.634876)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_14
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_15 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
paint = Color(255, 255, 255, 108)
stroke = BasicStroke(1.0000005f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(32.5, 36.61394)
shape.lineTo(32.5, 41.634876)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_15
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_16 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16
paint = Color(255, 255, 255, 108)
stroke = BasicStroke(1.0000005f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(30.5, 36.61394)
shape.lineTo(30.5, 41.634876)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_16
g.composite = AlphaComposite.getInstance(3, 0.09714284f * origAlpha)
val defaultTransform__0_0_17 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000005f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(39.5, 36.604065)
shape.lineTo(39.5, 41.625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_17
g.composite = AlphaComposite.getInstance(3, 0.09714284f * origAlpha)
val defaultTransform__0_0_18 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_18
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000005f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(37.5, 36.66384)
shape.lineTo(37.5, 41.684776)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_18
g.composite = AlphaComposite.getInstance(3, 0.09714284f * origAlpha)
val defaultTransform__0_0_19 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_19
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000005f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(35.5, 36.66384)
shape.lineTo(35.5, 41.684776)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_19
g.composite = AlphaComposite.getInstance(3, 0.09714284f * origAlpha)
val defaultTransform__0_0_20 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_20
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000005f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(33.5, 36.66384)
shape.lineTo(33.5, 41.684776)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_20
g.composite = AlphaComposite.getInstance(3, 0.09714284f * origAlpha)
val defaultTransform__0_0_21 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_21
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000005f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(31.5, 36.66384)
shape.lineTo(31.5, 41.684776)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_21
g.composite = AlphaComposite.getInstance(3, 0.44f * origAlpha)
val defaultTransform__0_0_22 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_22
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(7.875, 36.3125)
shape.lineTo(7.875, 41.84375)
shape.lineTo(20.4375, 41.84375)
shape.lineTo(8.21875, 41.5)
shape.lineTo(7.875, 36.3125)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_22
g.composite = AlphaComposite.getInstance(3, 0.20571427f * origAlpha)
val defaultTransform__0_0_23 = g.transform
g.transform(AffineTransform(1.037814974784851f, 0.0f, 0.0f, 1.0607470273971558f, -1.6328779458999634f, 3.030369997024536f))
// _0_0_23
paint = LinearGradientPaint(Point2D.Double(33.431175231933594, 31.96477699279785), Point2D.Double(21.747974395751953, 11.780678749084473), floatArrayOf(0.0f,0.5f,0.75f,0.84166664f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(230, 230, 230, 255),Color(255, 255, 255, 255),Color(225, 225, 225, 255),Color(255, 255, 255, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(39.875, 19.5625)
shape.curveTo(39.898838, 21.958838, 37.068905, 24.177746, 32.456768, 25.379019)
shape.curveTo(27.844637, 26.580294, 22.155363, 26.580294, 17.54323, 25.379019)
shape.curveTo(12.931097, 24.177746, 10.101163, 21.958838, 10.125, 19.5625)
shape.curveTo(10.101163, 17.166162, 12.931097, 14.947254, 17.54323, 13.745981)
shape.curveTo(22.155363, 12.544707, 27.844637, 12.544707, 32.456768, 13.745981)
shape.curveTo(37.068905, 14.947254, 39.898838, 17.166162, 39.875, 19.5625)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_23
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.composite = AlphaComposite.getInstance(3, 0.14117648f * origAlpha)
val defaultTransform__0_1_0 = g.transform
g.transform(AffineTransform(1.1301900148391724f, 1.178179022145491E-16f, 7.91854375568848E-17f, -0.7596009969711304f, -3.9097249507904053f, 53.6655387878418f))
// _0_1_0
paint = RadialGradientPaint(Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, Point2D.Double(24.837125778198242, 36.42112731933594), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, -7.816466730460888E-32f, -1.1324090298499951E-32f, 0.5367230176925659f, -5.89796224012562E-14f, 16.87306022644043f))
shape = GeneralPath()
shape.moveTo(40.48186, 36.421127)
shape.curveTo(40.50693, 39.429993, 37.530556, 42.216076, 32.67976, 43.724407)
shape.curveTo(27.828962, 45.23274, 21.845287, 45.23274, 16.99449, 43.724407)
shape.curveTo(12.143692, 42.216076, 9.167317, 39.429993, 9.192389, 36.421127)
shape.curveTo(9.167317, 33.412262, 12.143692, 30.626177, 16.99449, 29.117847)
shape.curveTo(21.845287, 27.609516, 27.828962, 27.609516, 32.67976, 29.117847)
shape.curveTo(37.530556, 30.626177, 40.50693, 33.412262, 40.48186, 36.421127)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
paint = LinearGradientPaint(Point2D.Double(14.751648902893066, 15.86843204498291), Point2D.Double(8.895328521728516, 16.743431091308594), floatArrayOf(0.0f,1.0f), arrayOf(Color(52, 101, 164, 255),Color(52, 101, 164, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(3.2034502, 25.835194)
shape.curveTo(2.1729476, -5.385337, 28.741615, -0.4511153, 28.582417, 15.788689)
shape.lineTo(35.89533, 15.788689)
shape.lineTo(24.517653, 28.774672)
shape.lineTo(12.585426, 15.788689)
shape.curveTo(12.585426, 15.788689, 20.12686, 15.788689, 20.12686, 15.788689)
shape.curveTo(20.583921, 4.8193226, 3.4092324, 1.6100346, 3.2034502, 25.835194)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(12.25, 18.25), Point2D.Double(7.0, 21.118431091308594), floatArrayOf(0.0f,1.0f), arrayOf(Color(32, 74, 135, 255),Color(32, 74, 135, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.9999998f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(3.2034502, 25.835194)
shape.curveTo(2.1729476, -5.385337, 28.741615, -0.4511153, 28.582417, 15.788689)
shape.lineTo(35.89533, 15.788689)
shape.lineTo(24.517653, 28.774672)
shape.lineTo(12.585426, 15.788689)
shape.curveTo(12.585426, 15.788689, 20.12686, 15.788689, 20.12686, 15.788689)
shape.curveTo(20.583921, 4.8193226, 3.4092324, 1.6100346, 3.2034502, 25.835194)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_1
g.composite = AlphaComposite.getInstance(3, 0.4715909f * origAlpha)
val defaultTransform__0_1_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2
paint = LinearGradientPaint(Point2D.Double(33.059906005859375, 27.39411735534668), Point2D.Double(12.624337196350098, 12.583768844604492), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9141139984130859f, 1.412791001969375E-16f, -1.412791001969375E-16f, 0.9141139984130859f, -3.8686978816986084f, -2.706902027130127f))
stroke = BasicStroke(0.99999934f,0,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(7.6642103, 9.104105)
shape.curveTo(12.40638, -0.0400306, 28.122335, 2.7175443, 27.761604, 16.579393)
shape.lineTo(34.078976, 16.579393)
shape.curveTo(34.078976, 16.579393, 24.513151, 27.53677, 24.513151, 27.53677)
shape.lineTo(14.41668, 16.579393)
shape.curveTo(14.41668, 16.579393, 20.87332, 16.579393, 20.87332, 16.579393)
shape.curveTo(21.144976, 5.0041614, 10.922265, 5.5345216, 7.6642103, 9.104105)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_2
g.composite = AlphaComposite.getInstance(3, 0.49431816f * origAlpha)
val defaultTransform__0_1_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
paint = RadialGradientPaint(Point2D.Double(23.44707679748535, 6.457674503326416), 19.0625f, Point2D.Double(23.44707679748535, 6.457674503326416), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-1.3144710063934326f, -0.010063120163977146f, -0.010229639708995819f, 1.3362209796905518f, 46.2210807800293f, -4.909886837005615f))
shape = GeneralPath()
shape.moveTo(34.767155, 16.211613)
shape.lineTo(32.782978, 18.757322)
shape.curveTo(27.372948, 17.24103, 24.89683, 21.486664, 17.109283, 20.489113)
shape.lineTo(13.247998, 16.080076)
shape.lineTo(20.434467, 16.162863)
shape.curveTo(20.48322, 4.3164573, 8.34431, 4.998966, 5.0292664, 13.627829)
shape.curveTo(8.83722, -1.2611216, 27.893316, 0.8064118, 28.28332, 16.114113)
shape.lineTo(34.767155, 16.211613)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4
paint = LinearGradientPaint(Point2D.Double(28.061466217041016, 31.43134880065918), Point2D.Double(28.061466217041016, 36.43749237060547), floatArrayOf(0.0f,1.0f), arrayOf(Color(221, 221, 221, 255),Color(253, 253, 253, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = RoundRectangle2D.Double(4.563523769378662, 30.298381805419922, 39.24794387817383, 12.278223037719727, 3.2499992847442627, 3.2499992847442627)
g.paint = paint
g.fill(shape)
paint = Color(125, 125, 125, 255)
stroke = BasicStroke(0.99999976f,1,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(4.563523769378662, 30.298381805419922, 39.24794387817383, 12.278223037719727, 3.2499992847442627, 3.2499992847442627)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_4
g.composite = AlphaComposite.getInstance(3, 0.59659094f * origAlpha)
val defaultTransform__0_1_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_5
paint = Color(125, 125, 125, 255)
shape = Rectangle2D.Double(7.0, 33.0, 16.0, 7.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_6
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(24.0, 32.0, 1.0, 9.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_6
g.transform = defaultTransform__0_1
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
            return 0.0
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
            return 48.0
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 47.67732620239258
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Document_save_as(width, height))
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Document_save_as(width, height))
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

