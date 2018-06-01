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
class Edit_cut(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
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
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0
paint = LinearGradientPaint(Point2D.Double(292.9716796875, 4.75927734375), Point2D.Double(296.9397888183594, 10.711433410644531), floatArrayOf(0.0f,1.0f), arrayOf(Color(238, 238, 236, 255),Color(255, 255, 255, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-4.127760887145996f, 0.0f, 0.0f, 4.136600971221924f, 1244.4649658203125f, -11.904950141906738f))
shape = GeneralPath()
shape.moveTo(34.174313, 1.6249996)
shape.curveTo(34.38626, 1.6935354, 34.59157, 1.7696619, 34.798294, 1.842502)
shape.curveTo(35.44971, 4.0395036, 38.469776, 6.261222, 37.321354, 8.449133)
shape.curveTo(33.49551, 14.82952, 29.697021, 21.294565, 25.89976, 27.72527)
shape.curveTo(25.154013, 27.872171, 24.401731, 27.952183, 23.647995, 27.96996)
shape.curveTo(22.061604, 28.01017, 20.433064, 27.775465, 18.927431, 27.23589)
shape.curveTo(23.978304, 18.684616, 29.031301, 10.114483, 34.174313, 1.6249996)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(136, 138, 133, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(34.174313, 1.6249996)
shape.curveTo(34.38626, 1.6935354, 34.59157, 1.7696619, 34.798294, 1.842502)
shape.curveTo(35.44971, 4.0395036, 38.469776, 6.261222, 37.321354, 8.449133)
shape.curveTo(33.49551, 14.82952, 29.697021, 21.294565, 25.89976, 27.72527)
shape.curveTo(25.154013, 27.872171, 24.401731, 27.952183, 23.647995, 27.96996)
shape.curveTo(22.061604, 28.01017, 20.433064, 27.775465, 18.927431, 27.23589)
shape.curveTo(23.978304, 18.684616, 29.031301, 10.114483, 34.174313, 1.6249996)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = LinearGradientPaint(Point2D.Double(20.28802490234375, 6.460364818572998), Point2D.Double(24.325969696044922, 23.942537307739258), floatArrayOf(0.0f,1.0f), arrayOf(Color(226, 226, 226, 255),Color(216, 216, 216, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(34.288822, 4.25)
shape.curveTo(34.0577, 4.5574527, 33.839207, 5.120942, 33.602795, 5.40625)
shape.curveTo(29.555939, 12.158979, 25.440784, 18.90033, 21.378977, 25.625)
shape.curveTo(21.318424, 25.878117, 20.565046, 26.637291, 21.366936, 26.567963)
shape.curveTo(22.478493, 26.765842, 23.638681, 26.918568, 24.746761, 26.625)
shape.curveTo(28.505753, 20.407795, 32.19264, 14.142582, 35.943047, 7.923178)
shape.curveTo(36.28552, 7.5359044, 36.35216, 6.99792, 35.9924, 6.611197)
shape.curveTo(35.462387, 5.794589, 34.925465, 4.936482, 34.382374, 4.15625)
shape.lineTo(34.311813, 4.2269607)
shape.lineTo(34.288822, 4.25)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(3.637892961502075f, 0.0f, 0.0f, 3.4703750610351562f, -1056.115966796875f, -16.007240295410156f))
// _0_0_2
paint = LinearGradientPaint(Point2D.Double(294.594970703125, 12.187602996826172), Point2D.Double(297.1851501464844, 13.339599609375), floatArrayOf(0.0f,1.0E-9f,1.0f), arrayOf(Color(239, 53, 53, 255),Color(201, 26, 26, 255),Color(255, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0103000402450562f, 1.0079690004374643E-18f, -0.15980100631713867f))
shape = GeneralPath()
shape.moveTo(297.04443, 12.300293)
shape.lineTo(296.3994, 13.384766)
shape.lineTo(295.1328, 14.71875)
shape.lineTo(294.73242, 13.672852)
shape.lineTo(295.74658, 11.960449)
shape.lineTo(297.04443, 12.300293)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(154, 12, 0, 255)
stroke = BasicStroke(0.28144068f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(297.04443, 12.300293)
shape.lineTo(296.3994, 13.384766)
shape.lineTo(295.1328, 14.71875)
shape.lineTo(294.73242, 13.672852)
shape.lineTo(295.74658, 11.960449)
shape.lineTo(297.04443, 12.300293)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = LinearGradientPaint(Point2D.Double(296.4861145019531, 15.506916046142578), Point2D.Double(296.529052734375, 9.876952171325684), floatArrayOf(0.0f,1.0E-9f,1.0f), arrayOf(Color(239, 53, 53, 255),Color(201, 26, 26, 255),Color(255, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(3.637892961502075f, 0.0f, 0.0f, 3.4703750610351562f, -1056.115966796875f, -16.007240295410156f))
shape = GeneralPath()
shape.moveTo(20.40625, 26.96875)
shape.curveTo(19.183905, 27.455467, 19.192232, 29.00393, 18.481272, 29.932762)
shape.curveTo(18.138948, 30.648558, 17.537483, 31.27899, 17.28125, 32.03125)
shape.curveTo(17.27157, 32.546642, 17.729202, 33.391476, 18.3125, 32.9375)
shape.curveTo(19.697475, 31.791172, 20.876865, 30.39882, 21.756725, 28.810629)
shape.curveTo(21.989088, 28.320597, 22.552477, 27.916466, 22.625, 27.40625)
shape.curveTo(22.086432, 26.835442, 21.112183, 26.873224, 20.40625, 26.96875)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(292.9716796875, 4.75927734375), Point2D.Double(296.9397888183594, 10.711433410644531), floatArrayOf(0.0f,1.0f), arrayOf(Color(238, 238, 236, 255),Color(255, 255, 255, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(4.053427219390869f, 0.0f, 0.0f, 4.136600971221924f, -1175.5350341796875f, -11.904950141906738f))
shape = GeneralPath()
shape.moveTo(12.960099, 1.6249996)
shape.curveTo(12.751966, 1.6935354, 12.550355, 1.7696619, 12.347353, 1.842502)
shape.curveTo(11.707669, 4.0395036, 8.741988, 6.261222, 9.86973, 8.449133)
shape.curveTo(13.626677, 14.82952, 17.35676, 21.294565, 21.08564, 27.72527)
shape.curveTo(21.817957, 27.872171, 22.55669, 27.952183, 23.296852, 27.96996)
shape.curveTo(24.854677, 28.01017, 26.45389, 27.775465, 27.932407, 27.23589)
shape.curveTo(22.972492, 18.684616, 18.010492, 10.114483, 12.960099, 1.6249996)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(136, 138, 133, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(12.960099, 1.6249996)
shape.curveTo(12.751966, 1.6935354, 12.550355, 1.7696619, 12.347353, 1.842502)
shape.curveTo(11.707669, 4.0395036, 8.741988, 6.261222, 9.86973, 8.449133)
shape.curveTo(13.626677, 14.82952, 17.35676, 21.294565, 21.08564, 27.72527)
shape.curveTo(21.817957, 27.872171, 22.55669, 27.952183, 23.296852, 27.96996)
shape.curveTo(24.854677, 28.01017, 26.45389, 27.775465, 27.932407, 27.23589)
shape.curveTo(22.972492, 18.684616, 18.010492, 10.114483, 12.960099, 1.6249996)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = LinearGradientPaint(Point2D.Double(20.28802490234375, 6.460364818572998), Point2D.Double(24.325969696044922, 23.942537307739258), floatArrayOf(0.0f,1.0f), arrayOf(Color(226, 226, 226, 255),Color(216, 216, 216, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(12.719667, 4.25)
shape.curveTo(12.336632, 5.3766794, 11.270006, 6.2059646, 11.004855, 7.40625)
shape.curveTo(14.713376, 13.800362, 18.475798, 20.175379, 22.181757, 26.5625)
shape.curveTo(23.380123, 26.820799, 24.610197, 26.655657, 25.795113, 26.40625)
shape.curveTo(25.606339, 25.665808, 25.056911, 25.07532, 24.76513, 24.3767)
shape.curveTo(20.870525, 17.806173, 16.94143, 11.242872, 13.087127, 4.65625)
shape.curveTo(13.072466, 4.50464, 12.870425, 4.1721153, 12.719667, 4.25)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(0.9798930287361145f, 0.0f, 0.0f, 1.0f, 0.311383992433548f, 0.17404299974441528f))
// _0_0_6
paint = LinearGradientPaint(Point2D.Double(22.225399017333984, 23.84343147277832), Point2D.Double(24.190448760986328, 22.86090660095215), floatArrayOf(0.0f,1.0f), arrayOf(Color(186, 189, 182, 255),Color(238, 238, 236, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(24.190449, 23.843431)
shape.curveTo(24.192022, 24.195501, 24.0051, 24.521502, 23.700459, 24.697992)
shape.curveTo(23.395819, 24.874483, 23.02003, 24.874483, 22.71539, 24.697992)
shape.curveTo(22.410748, 24.521502, 22.223825, 24.195501, 22.225399, 23.843431)
shape.curveTo(22.223825, 23.491362, 22.410748, 23.165361, 22.71539, 22.98887)
shape.curveTo(23.02003, 22.81238, 23.395819, 22.81238, 23.700459, 22.98887)
shape.curveTo(24.0051, 23.165361, 24.192022, 23.491362, 24.190449, 23.843431)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = LinearGradientPaint(Point2D.Double(7.184844970703125, 31.056621551513672), Point2D.Double(25.15223503112793, 50.77488708496094), floatArrayOf(0.0f,1.0E-9f,1.0f), arrayOf(Color(239, 53, 53, 255),Color(201, 26, 26, 255),Color(255, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.161877989768982f, 0.0f, 0.0f, 0.9924970269203186f, -2.430778980255127f, 0.26576098799705505f))
shape = GeneralPath()
shape.moveTo(17.700394, 30.286934)
shape.curveTo(20.935404, 32.013584, 21.19623, 36.899853, 18.278337, 41.201286)
shape.curveTo(15.360479, 45.50525, 10.373849, 47.596474, 7.1373806, 45.87742)
shape.curveTo(3.9008825, 44.15077, 3.6415462, 39.267033, 6.5594354, 34.965595)
shape.curveTo(9.475807, 30.664165, 14.463925, 28.572945, 17.700394, 30.286934)
shape.closePath()
shape.moveTo(15.845268, 33.02908)
shape.curveTo(14.408745, 32.26545, 11.33781, 33.5696, 9.378926, 36.463108)
shape.curveTo(7.4160166, 39.356613, 7.5560293, 42.376625, 8.991202, 43.13795)
shape.curveTo(10.426348, 43.90618, 13.499985, 42.59743, 15.458868, 39.703926)
shape.curveTo(17.42313, 36.81042, 17.281765, 33.79271, 15.845268, 33.02908)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(164, 0, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(17.700394, 30.286934)
shape.curveTo(20.935404, 32.013584, 21.19623, 36.899853, 18.278337, 41.201286)
shape.curveTo(15.360479, 45.50525, 10.373849, 47.596474, 7.1373806, 45.87742)
shape.curveTo(3.9008825, 44.15077, 3.6415462, 39.267033, 6.5594354, 34.965595)
shape.curveTo(9.475807, 30.664165, 14.463925, 28.572945, 17.700394, 30.286934)
shape.closePath()
shape.moveTo(15.845268, 33.02908)
shape.curveTo(14.408745, 32.26545, 11.33781, 33.5696, 9.378926, 36.463108)
shape.curveTo(7.4160166, 39.356613, 7.5560293, 42.376625, 8.991202, 43.13795)
shape.curveTo(10.426348, 43.90618, 13.499985, 42.59743, 15.458868, 39.703926)
shape.curveTo(17.42313, 36.81042, 17.281765, 33.79271, 15.845268, 33.02908)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = LinearGradientPaint(Point2D.Double(13.825360298156738, 40.06875228881836), Point2D.Double(7.670061111450195, 2.3262276649475098), floatArrayOf(0.0f,1.0E-9f,1.0f), arrayOf(Color(239, 53, 53, 255),Color(201, 26, 26, 255),Color(255, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.161877989768982f, 0.0f, 0.0f, 0.9924970269203186f, -2.6669669151306152f, 0.06400521844625473f))
shape = GeneralPath()
shape.moveTo(14.3255, 30.583288)
shape.curveTo(12.400369, 30.97051, 10.691041, 32.037308, 9.278593, 33.06453)
shape.curveTo(8.52683, 33.759434, 8.035029, 34.514454, 7.362945, 35.31874)
shape.curveTo(5.654618, 37.670807, 4.938707, 40.76217, 6.290107, 43.38841)
shape.curveTo(6.90956, 44.841515, 8.932742, 45.435852, 10.658323, 45.067543)
shape.curveTo(12.110236, 44.819077, 13.339639, 43.90647, 14.470735, 43.268642)
shape.curveTo(15.391637, 42.47786, 16.02475, 41.64213, 16.803625, 40.677364)
shape.curveTo(18.612986, 38.20296, 19.595537, 34.928688, 18.101604, 32.16508)
shape.curveTo(17.377897, 31.022951, 15.866963, 30.41829, 14.3255, 30.583288)
shape.closePath()
shape.moveTo(14.797513, 31.54477)
shape.curveTo(16.814016, 31.795124, 18.154488, 33.577583, 17.92006, 35.266636)
shape.curveTo(17.940832, 37.553574, 16.774038, 39.710728, 15.196909, 41.500755)
shape.curveTo(13.779705, 42.902737, 11.848294, 44.229027, 9.532754, 44.137077)
shape.curveTo(8.1739, 44.13421, 7.100179, 43.224777, 6.716933, 42.176617)
shape.curveTo(6.1002936, 39.644695, 6.9116497, 36.91139, 8.683129, 34.83862)
shape.curveTo(10.041367, 33.315308, 11.877976, 31.95152, 14.150642, 31.596926)
shape.curveTo(14.366331, 31.581652, 14.581522, 31.554432, 14.797513, 31.54477)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
paint = RadialGradientPaint(Point2D.Double(34.37609100341797, 37.50008010864258), 8.388787f, Point2D.Double(34.37609100341797, 37.50008010864258), floatArrayOf(0.0f,1.0E-9f,1.0f), arrayOf(Color(239, 53, 53, 255),Color(201, 26, 26, 255),Color(255, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0603810548782349f, 0.0f, -2.299514055252075f))
shape = GeneralPath()
shape.moveTo(30.331764, 30.286934)
shape.curveTo(27.096752, 32.013584, 26.83593, 36.899853, 29.75382, 41.201286)
shape.curveTo(32.67168, 45.50525, 37.65831, 47.596474, 40.894775, 45.87742)
shape.curveTo(44.131275, 44.15077, 44.39061, 39.267033, 41.47272, 34.965595)
shape.curveTo(38.55635, 30.664165, 33.568233, 28.572945, 30.331764, 30.286934)
shape.closePath()
shape.moveTo(32.18689, 33.02908)
shape.curveTo(33.623413, 32.26545, 36.694347, 33.5696, 38.653233, 36.463108)
shape.curveTo(40.616142, 39.356613, 40.476128, 42.376625, 39.040955, 43.13795)
shape.curveTo(37.60581, 43.90618, 34.532173, 42.59743, 32.57329, 39.703926)
shape.curveTo(30.609028, 36.81042, 30.750393, 33.79271, 32.18689, 33.02908)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(164, 0, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(30.331764, 30.286934)
shape.curveTo(27.096752, 32.013584, 26.83593, 36.899853, 29.75382, 41.201286)
shape.curveTo(32.67168, 45.50525, 37.65831, 47.596474, 40.894775, 45.87742)
shape.curveTo(44.131275, 44.15077, 44.39061, 39.267033, 41.47272, 34.965595)
shape.curveTo(38.55635, 30.664165, 33.568233, 28.572945, 30.331764, 30.286934)
shape.closePath()
shape.moveTo(32.18689, 33.02908)
shape.curveTo(33.623413, 32.26545, 36.694347, 33.5696, 38.653233, 36.463108)
shape.curveTo(40.616142, 39.356613, 40.476128, 42.376625, 39.040955, 43.13795)
shape.curveTo(37.60581, 43.90618, 34.532173, 42.59743, 32.57329, 39.703926)
shape.curveTo(30.609028, 36.81042, 30.750393, 33.79271, 32.18689, 33.02908)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(3.6244380474090576f, 0.0f, 0.0f, 3.6244380474090576f, -1053.178955078125f, -16.847200393676758f))
// _0_0_10
paint = LinearGradientPaint(Point2D.Double(298.478515625, 13.599584579467773), Point2D.Double(298.8694763183594, 13.802948951721191), floatArrayOf(0.0f,1.0f), arrayOf(Color(223, 42, 42, 255),Color(223, 42, 42, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(296.95605, 12.300293)
shape.lineTo(297.6001, 13.384766)
shape.lineTo(298.8672, 14.71875)
shape.lineTo(299.26807, 13.672852)
shape.lineTo(298.2539, 11.960449)
shape.lineTo(296.95605, 12.300293)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(298.478515625, 13.599584579467773), Point2D.Double(298.8694763183594, 13.802948951721191), floatArrayOf(0.0f,1.0f), arrayOf(Color(154, 12, 0, 255),Color(154, 12, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.2759049f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(296.95605, 12.300293)
shape.lineTo(297.6001, 13.384766)
shape.lineTo(298.8672, 14.71875)
shape.lineTo(299.26807, 13.672852)
shape.lineTo(298.2539, 11.960449)
shape.lineTo(296.95605, 12.300293)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
paint = LinearGradientPaint(Point2D.Double(296.7619934082031, 12.012225151062012), Point2D.Double(297.7982177734375, 10.946586608886719), floatArrayOf(0.0f,1.0E-9f,1.0f), arrayOf(Color(239, 53, 53, 255),Color(201, 26, 26, 255),Color(255, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(3.6244380474090576f, 0.0f, 0.0f, 3.6244380474090576f, -1053.178955078125f, -16.847200393676758f))
shape = GeneralPath()
shape.moveTo(26.15625, 27.9375)
shape.curveTo(25.729502, 28.13632, 25.139437, 28.13898, 24.8125, 28.4375)
shape.curveTo(25.76252, 29.838888, 26.702412, 31.352161, 27.66338, 32.650078)
shape.curveTo(28.331932, 33.40462, 29.019194, 34.150303, 29.78125, 34.8125)
shape.curveTo(30.516527, 33.421078, 29.91641, 31.751291, 28.96875, 30.625)
shape.curveTo(28.366215, 29.725307, 28.138927, 28.512037, 27.125, 28.03125)
shape.curveTo(26.820951, 27.91284, 26.474384, 27.853373, 26.15625, 27.9375)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
paint = LinearGradientPaint(Point2D.Double(39.61994171142578, 44.540931701660156), Point2D.Double(-3.532515048980713, -11.889041900634766), floatArrayOf(0.0f,1.0f), arrayOf(Color(239, 53, 53, 255),Color(164, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.161877989768982f, 0.0f, 0.0f, 0.9924970269203186f, -5.1121110916137695f, 0.06400521844625473f))
shape = GeneralPath()
shape.moveTo(32.280087, 30.449093)
shape.curveTo(30.759703, 30.678844, 29.385141, 31.534748, 29.039639, 32.837055)
shape.curveTo(27.908495, 35.23251, 28.824762, 37.95057, 30.319418, 40.063908)
shape.curveTo(31.421345, 41.40911, 32.259487, 42.99382, 33.959, 43.83788)
shape.curveTo(35.429653, 44.7615, 37.300144, 45.72845, 39.17664, 45.138767)
shape.curveTo(40.689957, 44.70532, 41.547314, 43.4582, 41.85681, 42.166912)
shape.curveTo(42.461243, 39.85688, 41.561115, 37.49095, 40.149845, 35.53043)
shape.curveTo(39.491173, 34.616722, 38.81686, 33.64722, 38.03653, 32.83578)
shape.curveTo(36.84197, 31.93233, 35.398613, 31.184254, 33.94769, 30.603432)
shape.curveTo(33.41359, 30.49302, 32.832462, 30.37069, 32.280087, 30.449093)
shape.closePath()
shape.moveTo(32.715794, 31.658699)
shape.curveTo(34.473095, 31.591923, 35.950306, 32.398155, 37.092163, 33.427666)
shape.curveTo(38.12446, 34.396793, 39.113815, 35.23287, 39.754673, 36.42654)
shape.curveTo(40.831856, 38.24711, 41.142532, 40.4065, 40.594776, 42.39007)
shape.curveTo(40.0664, 43.714584, 38.36862, 44.36211, 36.803658, 44.00652)
shape.curveTo(34.821777, 43.77769, 33.586315, 42.335503, 32.277092, 41.19816)
shape.curveTo(30.771343, 39.76677, 29.83647, 37.719532, 29.76651, 35.715782)
shape.curveTo(29.780622, 34.698112, 29.740042, 33.53736, 30.464653, 32.682213)
shape.curveTo(30.876926, 32.13906, 31.84466, 31.627886, 32.715794, 31.658699)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_12
g.composite = AlphaComposite.getInstance(3, 0.26704544f * origAlpha)
val defaultTransform__0_0_13 = g.transform
g.transform(AffineTransform(1.2560549974441528f, 0.0f, 0.0f, 0.8191490173339844f, -7.199394226074219f, 9.090420722961426f))
// _0_0_13
paint = RadialGradientPaint(Point2D.Double(25.1875, 41.625), 18.0625f, Point2D.Double(25.1875, 41.625), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.3252600133419037f, 2.0296259374972723E-16f, 28.086069107055664f))
shape = GeneralPath()
shape.moveTo(43.25, 41.625)
shape.curveTo(43.278946, 43.730194, 39.842598, 45.679516, 34.24215, 46.73484)
shape.curveTo(28.6417, 47.790165, 21.7333, 47.790165, 16.13285, 46.73484)
shape.curveTo(10.532403, 45.679516, 7.0960546, 43.730194, 7.125, 41.625)
shape.curveTo(7.0960546, 39.519806, 10.532403, 37.570484, 16.13285, 36.51516)
shape.curveTo(21.7333, 35.459835, 28.6417, 35.459835, 34.24215, 36.51516)
shape.curveTo(39.842598, 37.570484, 43.278946, 39.519806, 43.25, 41.625)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_13
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
            return 1.713640570640564
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 1.0767812728881836
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 45.44770050048828
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 46.9232177734375
        }

        /**
         * Returns an instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Edit_cut(width, height))
        }

        /**
         * Returns a [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Edit_cut(width, height))
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

