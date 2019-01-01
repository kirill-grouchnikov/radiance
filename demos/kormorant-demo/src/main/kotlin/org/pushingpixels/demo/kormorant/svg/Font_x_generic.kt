package org.pushingpixels.demo.kormorant.svg

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
class Font_x_generic(private var width: Int, private var height: Int) : ResizableIcon {
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
g.composite = AlphaComposite.getInstance(3, 0.5f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(0.9409419894218445f, 0.0f, 0.0f, 1.7863709926605225f, 1.5861389636993408f, -35.5352897644043f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(22.402997970581055, 43.07173538208008), 22.318058f, Point2D.Double(22.402997970581055, 43.07173538208008), floatArrayOf(0.0f,1.0f), arrayOf(Color(46, 52, 54, 255),Color(46, 52, 54, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0260729789733887f, -0.004434012807905674f, 9.77009767666459E-4f, 0.07524541765451431f, -0.6261910200119019f, 41.790218353271484f))
shape = GeneralPath()
shape.moveTo(46.138718, 45.083183)
shape.curveTo(46.174484, 45.684956, 41.928524, 46.242172, 35.008602, 46.54384)
shape.curveTo(28.088676, 46.845505, 19.552643, 46.845505, 12.632719, 46.54384)
shape.curveTo(5.7127953, 46.242172, 1.4668367, 45.684956, 1.5026016, 45.083183)
shape.curveTo(1.4668367, 44.48141, 5.7127953, 43.924194, 12.632719, 43.622528)
shape.curveTo(19.552643, 43.32086, 28.088676, 43.32086, 35.008602, 43.622528)
shape.curveTo(41.928524, 43.924194, 46.174484, 44.48141, 46.138718, 45.083183)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = LinearGradientPaint(Point2D.Double(36.66853713989258, 36.38324737548828), Point2D.Double(10.30355453491211, 7.492883205413818), floatArrayOf(0.0f,1.0f), arrayOf(Color(238, 238, 236, 255),Color(255, 255, 255, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = RoundRectangle2D.Double(3.488370418548584, 2.512193202972412, 41.011470794677734, 42.987239837646484, 1.9981215000152588, 1.9982975721359253)
g.paint = paint
g.fill(shape)
paint = Color(136, 138, 133, 255)
stroke = BasicStroke(1.0249254f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(3.488370418548584, 2.512193202972412, 41.011470794677734, 42.987239837646484, 1.9981215000152588, 1.9982975721359253)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = LinearGradientPaint(Point2D.Double(18.561553955078125, 12.998213768005371), Point2D.Double(30.93592071533203, 33.68109130859375), floatArrayOf(0.0f,1.0f), arrayOf(Color(114, 159, 207, 255),Color(52, 101, 164, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f))
shape = GeneralPath()
shape.moveTo(39.0, 39.008526)
shape.curveTo(36.343773, 38.775524, 36.064167, 38.777718, 35.458363, 35.375885)
shape.lineTo(31.077913, 9.0)
shape.lineTo(30.2413, 9.0)
shape.lineTo(16.352156, 32.30025)
shape.curveTo(12.67072, 38.49811, 11.798459, 38.635723, 9.934442, 39.008526)
shape.lineTo(9.934442, 40.129135)
shape.lineTo(19.054985, 40.129135)
shape.lineTo(19.054985, 39.008526)
shape.curveTo(16.678362, 38.775524, 16.305555, 38.917522, 16.305555, 37.75251)
shape.curveTo(16.305555, 36.8671, 16.445358, 36.447693, 17.237564, 34.863277)
shape.lineTo(19.893793, 30.159922)
shape.lineTo(30.145905, 30.159922)
shape.lineTo(31.077913, 35.702087)
shape.curveTo(31.124516, 36.12149, 31.171116, 36.540897, 31.171116, 36.9137)
shape.curveTo(31.171116, 38.684517, 30.924955, 38.728924, 27.942526, 39.008526)
shape.lineTo(27.942526, 40.129135)
shape.lineTo(39.0, 40.129135)
shape.lineTo(39.0, 39.008526)
shape.moveTo(20.872404, 27.919804)
shape.lineTo(27.86248, 15.803673)
shape.lineTo(29.912903, 27.919804)
shape.lineTo(20.872404, 27.919804)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200600624084473f, 11.814530372619629f))
// _0_0_3
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 13.814539909362793f))
// _0_0_4
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200650691986084f, 17.81454086303711f))
// _0_0_5
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 19.81454086303711f))
// _0_0_6
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200560092926025f, 21.81454086303711f))
// _0_0_7
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520056962966919f, 23.814550399780273f))
// _0_0_8
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 25.81454086303711f))
// _0_0_9
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 27.814550399780273f))
// _0_0_10
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520056962966919f, 29.814550399780273f))
// _0_0_11
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200650691986084f, 31.81454086303711f))
// _0_0_12
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_12
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_13 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520066022872925f, 33.81454849243164f))
// _0_0_13
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_13
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200700759887695f, 35.81454086303711f))
// _0_0_14
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_14
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_15 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200700759887695f, 37.81454849243164f))
// _0_0_15
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_15
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_16 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520066022872925f, 39.81454849243164f))
// _0_0_16
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_16
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_17 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 15.814539909362793f))
// _0_0_17
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_17
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_18 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200650691986084f, 41.81454086303711f))
// _0_0_18
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_18
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_19 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520066022872925f, 43.81454849243164f))
// _0_0_19
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_19
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_20 = g.transform
g.transform(AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200700759887695f, 45.81454086303711f))
// _0_0_20
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_20
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_21 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 15.520009994506836f, 1.1854959726333618f))
// _0_0_21
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_21
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_22 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 21.52001953125f, 1.1854959726333618f))
// _0_0_22
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_22
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_23 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 23.52001953125f, 1.1854959726333618f))
// _0_0_23
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_23
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_24 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 25.52001953125f, 1.1854859590530396f))
// _0_0_24
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_24
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_25 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 27.520029067993164f, 1.1854859590530396f))
// _0_0_25
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_25
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_26 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 29.52001953125f, 1.1854959726333618f))
// _0_0_26
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_26
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_27 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 31.520029067993164f, 1.1854959726333618f))
// _0_0_27
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_27
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_28 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 33.5200309753418f, 1.1854859590530396f))
// _0_0_28
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_28
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_29 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 35.52001953125f, 1.1854959726333618f))
// _0_0_29
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_29
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_30 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 37.5200309753418f, 1.1854959726333618f))
// _0_0_30
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_30
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_31 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 39.52001953125f, 1.185505986213684f))
// _0_0_31
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_31
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_32 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 41.5200309753418f, 1.185505986213684f))
// _0_0_32
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_32
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_33 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 43.5200309753418f, 1.1854959726333618f))
// _0_0_33
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_33
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_34 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 19.52001953125f, 1.1854959726333618f))
// _0_0_34
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_34
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_35 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 45.52001953125f, 1.1854959726333618f))
// _0_0_35
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_35
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_36 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 47.5200309753418f, 1.1854959726333618f))
// _0_0_36
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_36
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_37 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 49.52001953125f, 1.185505986213684f))
// _0_0_37
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_37
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_38 = g.transform
g.transform(AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 17.520000457763672f, -0.8144890069961548f))
// _0_0_38
paint = Color(136, 138, 133, 255)
shape = GeneralPath()
shape.moveTo(23.246136, 9.981962)
shape.curveTo(23.247906, 10.3184805, 23.03771, 10.630082, 22.695139, 10.798777)
shape.curveTo(22.35257, 10.967472, 21.929993, 10.967472, 21.587423, 10.798777)
shape.curveTo(21.244852, 10.630082, 21.034657, 10.3184805, 21.036427, 9.981962)
shape.curveTo(21.034657, 9.645444, 21.244852, 9.333842, 21.587423, 9.165148)
shape.curveTo(21.929993, 8.996452, 22.35257, 8.996452, 22.695139, 9.165148)
shape.curveTo(23.03771, 9.333842, 23.247906, 9.645444, 23.246136, 9.981962)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_38
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_39 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_39
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0249996f,0,0,4.0f,null,0.0f)
shape = Rectangle2D.Double(4.487087726593018, 3.5124998092651367, 39.01362228393555, 41.0338134765625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_39
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
            return 2.9663472175598145
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 1.9997305870056152
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 42.06730270385742
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 46.00027084350586
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Font_x_generic(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Font_x_generic(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): ResizableIconFactory {
            return ResizableIconFactory { Font_x_generic(16, 16) }
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

