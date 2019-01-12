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
class Preferences_desktop_assistive_technology(private var width: Int, private var height: Int) : ResizableIcon {
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
g.composite = AlphaComposite.getInstance(3, 0.4064171f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(2.4600489139556885f, 0.0f, 0.0f, 2.4600489139556885f, -49.40945816040039f, -67.96373748779297f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(30.203561782836914, 44.56548309326172), 6.5659914f, Point2D.Double(30.203561782836914, 44.56548309326172), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.3384619951248169f, -1.4354759471951642E-15f, 29.481779098510742f))
shape = GeneralPath()
shape.moveTo(36.769554, 44.565483)
shape.curveTo(36.780075, 45.361816, 35.53091, 46.099186, 33.495064, 46.498383)
shape.curveTo(31.459217, 46.89758, 28.947906, 46.89758, 26.91206, 46.498383)
shape.curveTo(24.876213, 46.099186, 23.627047, 45.361816, 23.63757, 44.565483)
shape.curveTo(23.627047, 43.76915, 24.876213, 43.03178, 26.91206, 42.632584)
shape.curveTo(28.947906, 42.233387, 31.459217, 42.233387, 33.495064, 42.632584)
shape.curveTo(35.53091, 43.03178, 36.780075, 43.76915, 36.769554, 44.565483)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = RadialGradientPaint(Point2D.Double(25.457862854003906, 35.59623336791992), 20.530962f, Point2D.Double(25.457862854003906, 35.59623336791992), floatArrayOf(0.0f,1.0f), arrayOf(Color(156, 188, 222, 255),Color(32, 74, 135, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.1281850337982178f, -1.7271729602086339E-9f, 2.422814131750186E-16f, 2.128253936767578f, -29.019060134887695f, -39.917789459228516f))
shape = RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355)
g.paint = paint
g.fill(shape)
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(1.0f,0,2,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(2.0000021f,0,2,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(5.8954033851623535, 5.004019737243652, 37.10063552856445, 37.10063552856445, 7.81350040435791, 7.81350040435791)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.5521910190582275f, -0.6401000022888184f))
// _0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_0 = g.transform
g.transform(AffineTransform(0.7692310214042664f, 0.0f, 0.0f, 0.7692310214042664f, 6.846158027648926f, 4.576913833618164f))
// _0_0_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_0_0 = g.transform
g.transform(AffineTransform(1.444443941116333f, 0.0f, 0.0f, 1.444443941116333f, -7.841267108917236f, -5.8095221519470215f))
// _0_0_3_0_0
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(20.857141, 13.071428)
shape.curveTo(20.862293, 14.2232065, 20.250782, 15.289703, 19.254162, 15.8670845)
shape.curveTo(18.257544, 16.444466, 17.02817, 16.444466, 16.03155, 15.8670845)
shape.curveTo(15.03493, 15.289703, 14.42342, 14.2232065, 14.428571, 13.071428)
shape.curveTo(14.42342, 11.91965, 15.03493, 10.853153, 16.03155, 10.275772)
shape.curveTo(17.02817, 9.698391, 18.257544, 9.698391, 19.254162, 10.275772)
shape.curveTo(20.250782, 10.853153, 20.862293, 11.91965, 20.857141, 13.071428)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_0_1
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(2.5f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(17.571428, 13.142857)
shape.lineTo(20.0, 30.0)
shape.lineTo(32.0, 27.428572)
shape.lineTo(34.42857, 37.0)
shape.lineTo(38.0, 36.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_3_0_1
g.transform = defaultTransform__0_0_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_1
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(17.374998, 21.668259)
shape.curveTo(14.821727, 23.078575, 13.0, 25.694616, 13.0, 28.80768)
shape.curveTo(13.0, 33.36178, 16.715132, 37.076912, 21.26923, 37.076912)
shape.curveTo(25.584839, 37.076912, 29.03297, 33.705624, 29.39423, 29.480759)
shape.lineTo(27.399036, 29.937489)
shape.curveTo(26.85153, 32.888084, 24.382202, 35.153835, 21.26923, 35.153835)
shape.curveTo(17.755636, 35.153835, 14.923077, 32.321274, 14.923077, 28.80768)
shape.curveTo(14.923077, 26.611685, 16.12003, 24.778076, 17.807692, 23.639412)
shape.lineTo(17.374998, 21.668259)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3_1
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.9230775f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(22.857143, 20.857143)
shape.lineTo(31.714287, 20.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(0.6082140207290649f, 0.0f, 0.0f, 0.6082140207290649f, 20.155799865722656f, 19.565080642700195f))
// _0_0_5
g.composite = AlphaComposite.getInstance(3, 0.40909088f * origAlpha)
val defaultTransform__0_0_5_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.8838850259780884f, 2.4748740196228027f))
// _0_0_5_0
paint = RadialGradientPaint(Point2D.Double(25.45584487915039, 39.161163330078125), 19.622213f, Point2D.Double(25.45584487915039, 39.161163330078125), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.31531500816345215f, 6.894484305295864E-14f, 26.81304931640625f))
shape = GeneralPath()
shape.moveTo(45.078056, 39.161163)
shape.curveTo(45.1095, 41.378223, 41.37642, 43.431126, 35.29237, 44.542526)
shape.curveTo(29.208319, 45.65393, 21.70337, 45.65393, 15.619318, 44.542526)
shape.curveTo(9.535267, 43.431126, 5.802187, 41.378223, 5.8336315, 39.161163)
shape.curveTo(5.802187, 36.944103, 9.535267, 34.8912, 15.619318, 33.7798)
shape.curveTo(21.70337, 32.668396, 29.208319, 32.668396, 35.29237, 33.7798)
shape.curveTo(41.37642, 34.8912, 45.1095, 36.944103, 45.078056, 39.161163)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_5_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5_1
paint = LinearGradientPaint(Point2D.Double(14.462891578674316, 12.284523963928223), Point2D.Double(34.53434753417969, 39.684913635253906), floatArrayOf(0.0f,0.25f,0.5f,0.75f,1.0f), arrayOf(Color(201, 201, 201, 255),Color(248, 248, 248, 255),Color(226, 226, 226, 255),Color(176, 176, 176, 255),Color(201, 201, 201, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2419350147247314f, 0.0f, 0.0f, 1.2419350147247314f, -5.027507781982422f, -7.208988189697266f))
shape = GeneralPath()
shape.moveTo(23.25, 0.46875)
shape.curveTo(22.784561, 0.5005963, 22.332167, 0.5726847, 21.875, 0.625)
shape.lineTo(21.84375, 0.625)
shape.lineTo(20.75, 6.59375)
shape.curveTo(18.967276, 6.99974, 17.29009, 7.6887417, 15.78125, 8.625)
shape.lineTo(10.875, 5.09375)
shape.curveTo(9.548712, 6.1234407, 8.341802, 7.3243456, 7.28125, 8.625)
shape.lineTo(10.6875, 13.59375)
shape.curveTo(9.653267, 15.174265, 8.875532, 16.978973, 8.4375, 18.875)
shape.curveTo(8.437425, 18.883963, 8.437439, 18.904688, 8.4375, 18.90625)
shape.lineTo(2.5, 19.84375)
shape.curveTo(2.3914466, 20.730383, 2.34375, 21.646688, 2.34375, 22.5625)
shape.curveTo(2.34375, 23.3118, 2.3644395, 24.051088, 2.4375, 24.78125)
shape.lineTo(8.375, 25.84375)
shape.curveTo(8.797279, 27.905642, 9.599459, 29.831263, 10.71875, 31.53125)
shape.lineTo(7.1875, 36.375)
shape.curveTo(8.198826, 37.63052, 9.366392, 38.773617, 10.625, 39.78125)
shape.lineTo(15.625, 36.34375)
shape.curveTo(17.372433, 37.458466, 19.323084, 38.240124, 21.4375, 38.625)
shape.lineTo(22.375, 44.53125)
shape.curveTo(23.041183, 44.59189, 23.724348, 44.59375, 24.40625, 44.59375)
shape.curveTo(25.368935, 44.59375, 26.288486, 44.557266, 27.21875, 44.4375)
shape.lineTo(28.34375, 38.40625)
shape.curveTo(30.35131, 37.90665, 32.23722, 37.03996, 33.875, 35.875)
shape.lineTo(38.6875, 39.375)
shape.curveTo(39.935528, 38.3132, 41.07678, 37.092743, 42.0625, 35.78125)
shape.lineTo(38.5625, 30.71875)
shape.curveTo(39.510353, 29.08176, 40.16713, 27.275608, 40.5, 25.34375)
shape.lineTo(46.40625, 24.40625)
shape.curveTo(46.458042, 23.789904, 46.46875, 23.192163, 46.46875, 22.5625)
shape.curveTo(46.46875, 21.468287, 46.341568, 20.395416, 46.1875, 19.34375)
shape.lineTo(40.1875, 18.25)
shape.curveTo(39.717304, 16.513777, 38.945824, 14.893898, 37.96875, 13.4375)
shape.lineTo(41.5, 8.59375)
shape.curveTo(40.405426, 7.255143, 39.156822, 6.018569, 37.78125, 4.96875)
shape.lineTo(32.6875, 8.46875)
shape.curveTo(31.223503, 7.602913, 29.648037, 6.938568, 27.9375, 6.5625)
shape.lineTo(27.0, 0.625)
shape.curveTo(26.146702, 0.5246246, 25.286379, 0.46875, 24.40625, 0.46875)
shape.curveTo(24.168379, 0.46875, 23.923567, 0.4612654, 23.6875, 0.46875)
shape.curveTo(23.572416, 0.47239882, 23.458534, 0.4620551, 23.34375, 0.46875)
shape.curveTo(23.312662, 0.4705632, 23.281029, 0.4666269, 23.25, 0.46875)
shape.closePath()
shape.moveTo(24.0625, 15.65625)
shape.curveTo(24.176666, 15.650457, 24.290651, 15.65625, 24.40625, 15.65625)
shape.curveTo(28.105377, 15.65625, 31.125, 18.675875, 31.125, 22.375)
shape.curveTo(31.125002, 26.074125, 28.105375, 29.0625, 24.40625, 29.0625)
shape.curveTo(20.707125, 29.062502, 17.71875, 26.074125, 17.71875, 22.375)
shape.curveTo(17.718752, 18.791473, 20.52335, 15.835842, 24.0625, 15.65625)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(128, 128, 128, 255)
stroke = BasicStroke(1.6441573f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(23.25, 0.46875)
shape.curveTo(22.784561, 0.5005963, 22.332167, 0.5726847, 21.875, 0.625)
shape.lineTo(21.84375, 0.625)
shape.lineTo(20.75, 6.59375)
shape.curveTo(18.967276, 6.99974, 17.29009, 7.6887417, 15.78125, 8.625)
shape.lineTo(10.875, 5.09375)
shape.curveTo(9.548712, 6.1234407, 8.341802, 7.3243456, 7.28125, 8.625)
shape.lineTo(10.6875, 13.59375)
shape.curveTo(9.653267, 15.174265, 8.875532, 16.978973, 8.4375, 18.875)
shape.curveTo(8.437425, 18.883963, 8.437439, 18.904688, 8.4375, 18.90625)
shape.lineTo(2.5, 19.84375)
shape.curveTo(2.3914466, 20.730383, 2.34375, 21.646688, 2.34375, 22.5625)
shape.curveTo(2.34375, 23.3118, 2.3644395, 24.051088, 2.4375, 24.78125)
shape.lineTo(8.375, 25.84375)
shape.curveTo(8.797279, 27.905642, 9.599459, 29.831263, 10.71875, 31.53125)
shape.lineTo(7.1875, 36.375)
shape.curveTo(8.198826, 37.63052, 9.366392, 38.773617, 10.625, 39.78125)
shape.lineTo(15.625, 36.34375)
shape.curveTo(17.372433, 37.458466, 19.323084, 38.240124, 21.4375, 38.625)
shape.lineTo(22.375, 44.53125)
shape.curveTo(23.041183, 44.59189, 23.724348, 44.59375, 24.40625, 44.59375)
shape.curveTo(25.368935, 44.59375, 26.288486, 44.557266, 27.21875, 44.4375)
shape.lineTo(28.34375, 38.40625)
shape.curveTo(30.35131, 37.90665, 32.23722, 37.03996, 33.875, 35.875)
shape.lineTo(38.6875, 39.375)
shape.curveTo(39.935528, 38.3132, 41.07678, 37.092743, 42.0625, 35.78125)
shape.lineTo(38.5625, 30.71875)
shape.curveTo(39.510353, 29.08176, 40.16713, 27.275608, 40.5, 25.34375)
shape.lineTo(46.40625, 24.40625)
shape.curveTo(46.458042, 23.789904, 46.46875, 23.192163, 46.46875, 22.5625)
shape.curveTo(46.46875, 21.468287, 46.341568, 20.395416, 46.1875, 19.34375)
shape.lineTo(40.1875, 18.25)
shape.curveTo(39.717304, 16.513777, 38.945824, 14.893898, 37.96875, 13.4375)
shape.lineTo(41.5, 8.59375)
shape.curveTo(40.405426, 7.255143, 39.156822, 6.018569, 37.78125, 4.96875)
shape.lineTo(32.6875, 8.46875)
shape.curveTo(31.223503, 7.602913, 29.648037, 6.938568, 27.9375, 6.5625)
shape.lineTo(27.0, 0.625)
shape.curveTo(26.146702, 0.5246246, 25.286379, 0.46875, 24.40625, 0.46875)
shape.curveTo(24.168379, 0.46875, 23.923567, 0.4612654, 23.6875, 0.46875)
shape.curveTo(23.572416, 0.47239882, 23.458534, 0.4620551, 23.34375, 0.46875)
shape.curveTo(23.312662, 0.4705632, 23.281029, 0.4666269, 23.25, 0.46875)
shape.closePath()
shape.moveTo(24.0625, 15.65625)
shape.curveTo(24.176666, 15.650457, 24.290651, 15.65625, 24.40625, 15.65625)
shape.curveTo(28.105377, 15.65625, 31.125, 18.675875, 31.125, 22.375)
shape.curveTo(31.125002, 26.074125, 28.105375, 29.0625, 24.40625, 29.0625)
shape.curveTo(20.707125, 29.062502, 17.71875, 26.074125, 17.71875, 22.375)
shape.curveTo(17.718752, 18.791473, 20.52335, 15.835842, 24.0625, 15.65625)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_5_1
g.composite = AlphaComposite.getInstance(3, 0.64772725f * origAlpha)
val defaultTransform__0_0_5_2 = g.transform
g.transform(AffineTransform(0.6684309840202332f, 0.0f, 0.0f, 0.6684309840202332f, 8.69454574584961f, 6.464436054229736f))
// _0_0_5_2
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(2.4597247f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(36.239223, 23.781593)
shape.curveTo(36.25962, 28.342402, 33.83816, 32.565517, 29.89175, 34.85183)
shape.curveTo(25.94534, 37.13814, 21.077263, 37.13814, 17.130852, 34.85183)
shape.curveTo(13.18444, 32.565517, 10.762982, 28.342402, 10.783379, 23.781593)
shape.curveTo(10.762982, 19.220785, 13.18444, 14.997669, 17.130852, 12.711357)
shape.curveTo(21.077263, 10.425044, 25.94534, 10.425044, 29.89175, 12.711357)
shape.curveTo(33.83816, 14.997669, 36.25962, 19.220785, 36.239223, 23.781593)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_5_2
g.composite = AlphaComposite.getInstance(3, 0.34659088f * origAlpha)
val defaultTransform__0_0_5_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5_3
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.644156f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(22.66343, 2.8294024)
shape.lineTo(21.834734, 8.282713)
shape.curveTo(20.257912, 8.641812, 17.357416, 9.740083, 16.022846, 10.568205)
shape.lineTo(11.614124, 7.2775526)
shape.curveTo(10.441019, 8.188315, 10.36057, 8.250079, 9.42251, 9.40051)
shape.lineTo(12.610179, 14.128108)
shape.curveTo(11.6954, 15.526075, 10.596635, 18.017319, 10.202127, 19.797586)
shape.curveTo(10.202127, 19.797586, 4.61633, 20.73919, 4.61633, 20.73919)
shape.curveTo(4.5203147, 21.523417, 4.566459, 23.201902, 4.631081, 23.84773)
shape.lineTo(9.966658, 24.80891)
shape.curveTo(10.340164, 26.632656, 11.7379, 29.568249, 12.727915, 31.07189)
shape.lineTo(9.353855, 35.52969)
shape.curveTo(10.248374, 36.640198, 10.427401, 36.741817, 11.540642, 37.63307)
shape.lineTo(16.052347, 34.327667)
shape.curveTo(17.597954, 35.313633, 20.66584, 36.51303, 22.536043, 36.853455)
shape.lineTo(23.276506, 42.23811)
shape.curveTo(23.865746, 42.291744, 25.493572, 42.4422, 26.316393, 42.336266)
shape.lineTo(27.145086, 36.730892)
shape.curveTo(28.920776, 36.288998, 31.988947, 35.02955, 33.437565, 33.999138)
shape.lineTo(37.944447, 37.255463)
shape.curveTo(39.04833, 36.316303, 39.05822, 36.17479, 39.93009, 35.01477)
shape.lineTo(36.59036, 30.267595)
shape.curveTo(37.428738, 28.819675, 38.51277, 25.987974, 38.807198, 24.279242)
shape.lineTo(44.275257, 23.371965)
shape.curveTo(44.321068, 22.826805, 44.3233, 21.306536, 44.187027, 20.376335)
shape.lineTo(38.61598, 19.415154)
shape.curveTo(38.200092, 17.879461, 36.77285, 15.112168, 35.908627, 13.823982)
shape.lineTo(39.4495, 9.366181)
shape.curveTo(38.481354, 8.182182, 38.12138, 8.019728, 36.904682, 7.091162)
shape.lineTo(32.240913, 10.430893)
shape.curveTo(30.946007, 9.66506, 28.363857, 8.497611, 26.850887, 8.164979)
shape.lineTo(26.027018, 2.8294024)
shape.curveTo(25.272272, 2.7406204, 23.094751, 2.7800448, 22.66343, 2.8294024)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_5_3
g.transform = defaultTransform__0_0_5
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
            return 3.9147281646728516
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 3.0233452320098877
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 44.08527374267578
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.976654052734375
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Preferences_desktop_assistive_technology(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Preferences_desktop_assistive_technology(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): ResizableIconFactory {
            return ResizableIconFactory { Preferences_desktop_assistive_technology(16, 16) }
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

