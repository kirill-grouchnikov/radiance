package org.pushingpixels.radiance.demo.components.ktx.svg

import java.awt.*
import java.awt.geom.*
import java.awt.image.BufferedImage
import java.io.*
import java.lang.ref.WeakReference
import java.util.Base64
import java.util.Stack
import javax.imageio.ImageIO
import javax.swing.plaf.UIResource

import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
class Image_x_generic private constructor(private var width: Int, private var height: Int)
       : RadianceIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var colorFilter: RadianceIcon.ColorFilter? = null
    private val transformsStack = Stack<AffineTransform>()

    

	private fun _paint0(g : Graphics2D,origAlpha : Float) {
transformsStack.push(g.transform)
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 0.5276382f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.3864840269088745f, -2.9843900203704834f))
// _0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(46.315495f, 41.63604f)
generalPath!!.curveTo(46.350906f, 43.092964f, 42.146984f, 44.442017f, 35.295578f, 45.172367f)
generalPath!!.curveTo(28.444166f, 45.902714f, 19.992647f, 45.902714f, 13.141237f, 45.172367f)
generalPath!!.curveTo(6.289828f, 44.442017f, 2.085908f, 43.092964f, 2.1213188f, 41.63604f)
generalPath!!.curveTo(2.085908f, 40.179115f, 6.289828f, 38.830063f, 13.141237f, 38.099712f)
generalPath!!.curveTo(19.992647f, 37.369366f, 28.444166f, 37.369366f, 35.295578f, 38.099712f)
generalPath!!.curveTo(42.146984f, 38.830063f, 46.350906f, 40.179115f, 46.315495f, 41.63604f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.218406677246094, 41.63603973388672), 22.097088f, Point2D.Double(24.218406677246094, 41.63603973388672), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.18400000035762787f, 0.0f, 33.97500991821289f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.7177715f, 6.454775f)
generalPath!!.lineTo(43.379543f, 6.454775f)
generalPath!!.curveTo(44.002792f, 6.454775f, 44.504543f, 6.956525f, 44.504543f, 7.5797744f)
generalPath!!.lineTo(44.504543f, 31.480581f)
generalPath!!.curveTo(44.504543f, 32.103832f, 36.04784f, 39.49987f, 35.424595f, 39.49987f)
generalPath!!.lineTo(2.7177715f, 39.49987f)
generalPath!!.curveTo(2.094522f, 39.49987f, 1.5927727f, 38.998123f, 1.5927727f, 38.37487f)
generalPath!!.lineTo(1.5927727f, 7.5797744f)
generalPath!!.curveTo(1.5927727f, 6.956525f, 2.094522f, 6.454775f, 2.7177715f, 6.454775f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(12.487299919128418, 3.7318999767303467), Point2D.Double(31.081300735473633, 36.032798767089844), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(210, 210, 210, 255)) ?: Color(210, 210, 210, 255)),(colorFilter?.filter(Color(237, 237, 237, 255)) ?: Color(237, 237, 237, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.4340029954910278f, 0.0f, 0.0f, 0.9900869727134705f, 52.32167053222656f, 2.8389179706573486f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(187, 191, 187, 255)) ?: Color(187, 191, 187, 255)
stroke = BasicStroke(0.99999994f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.7177715f, 6.454775f)
generalPath!!.lineTo(43.379543f, 6.454775f)
generalPath!!.curveTo(44.002792f, 6.454775f, 44.504543f, 6.956525f, 44.504543f, 7.5797744f)
generalPath!!.lineTo(44.504543f, 31.480581f)
generalPath!!.curveTo(44.504543f, 32.103832f, 36.04784f, 39.49987f, 35.424595f, 39.49987f)
generalPath!!.lineTo(2.7177715f, 39.49987f)
generalPath!!.curveTo(2.094522f, 39.49987f, 1.5927727f, 38.998123f, 1.5927727f, 38.37487f)
generalPath!!.lineTo(1.5927727f, 7.5797744f)
generalPath!!.curveTo(1.5927727f, 6.956525f, 2.094522f, 6.454775f, 2.7177715f, 6.454775f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0547740459442139f, 0.0f, 0.0f, 1.0499889850616455f, -0.8146470189094543f, 4.485012054443359f))
// _0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.512695f, 30.0f)
generalPath!!.lineTo(39.643234f, 30.0f)
generalPath!!.lineTo(39.643234f, 19.627375f)
generalPath!!.lineTo(5.512695f, 19.627375f)
generalPath!!.lineTo(5.512695f, 30.0f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(21.932600021362305, 24.627399444580078), Point2D.Double(21.932600021362305, 7.109099864959717), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(133, 149, 188, 255)) ?: Color(133, 149, 188, 255)),(colorFilter?.filter(Color(4, 26, 59, 255)) ?: Color(4, 26, 59, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0989890098571777f, 0.0f, 0.0f, -0.7977570295333862f, -1.9538650512695312f, 37.32400131225586f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.512695f, 5.237844f)
generalPath!!.lineTo(39.643234f, 5.237844f)
generalPath!!.lineTo(39.643234f, 19.627375f)
generalPath!!.lineTo(5.512695f, 19.627375f)
generalPath!!.lineTo(5.512695f, 5.237844f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(21.932600021362305, 24.627399444580078), Point2D.Double(21.932600021362305, 7.109099864959717), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(208, 214, 229, 255)) ?: Color(208, 214, 229, 255)),(colorFilter?.filter(Color(9, 58, 128, 255)) ?: Color(9, 58, 128, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0989890098571777f, 0.0f, 0.0f, 1.1066969633102417f, -1.9538650512695312f, -4.922452926635742f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.1892169713974f, 0.0f, 0.0f, 1.1892169713974f, -3.525355100631714f, -6.535408020019531f))
// _0_2_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0
g.composite = AlphaComposite.getInstance(3, 0.04999994f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.4f, 15.4f)
generalPath!!.curveTo(18.4f, 17.6f, 16.6f, 19.5f, 14.3f, 19.5f)
generalPath!!.curveTo(12.1f, 19.5f, 10.2f, 17.7f, 10.2f, 15.4f)
generalPath!!.curveTo(10.2f, 13.2f, 12.0f, 11.3f, 14.3f, 11.3f)
generalPath!!.curveTo(16.5f, 11.3f, 18.4f, 13.1f, 18.4f, 15.4f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(232, 245, 47, 255)) ?: Color(232, 245, 47, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.20829993f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.0f, 15.4f)
generalPath!!.curveTo(18.0f, 17.4f, 16.4f, 19.1f, 14.3f, 19.1f)
generalPath!!.curveTo(12.3f, 19.1f, 10.6f, 17.5f, 10.6f, 15.4f)
generalPath!!.curveTo(10.6f, 13.4f, 12.2f, 11.7f, 14.3f, 11.7f)
generalPath!!.curveTo(16.3f, 11.7f, 18.0f, 13.3f, 18.0f, 15.4f)
generalPath!!.lineTo(18.0f, 15.4f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(236, 247, 81, 255)) ?: Color(236, 247, 81, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.36669993f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.6f, 15.4f)
generalPath!!.curveTo(17.6f, 17.2f, 16.1f, 18.7f, 14.3f, 18.7f)
generalPath!!.curveTo(12.5f, 18.7f, 11.0f, 17.2f, 11.0f, 15.4f)
generalPath!!.curveTo(11.0f, 13.6f, 12.5f, 12.1f, 14.3f, 12.1f)
generalPath!!.curveTo(16.1f, 12.1f, 17.6f, 13.6f, 17.6f, 15.4f)
generalPath!!.lineTo(17.6f, 15.4f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(240, 249, 114, 255)) ?: Color(240, 249, 114, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.525f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.2f, 15.4f)
generalPath!!.curveTo(17.2f, 17.0f, 15.9f, 18.3f, 14.3f, 18.3f)
generalPath!!.curveTo(12.7f, 18.3f, 11.4f, 17.0f, 11.4f, 15.4f)
generalPath!!.curveTo(11.4f, 13.8f, 12.7f, 12.5f, 14.3f, 12.5f)
generalPath!!.curveTo(15.9f, 12.5f, 17.2f, 13.8f, 17.2f, 15.4f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(244, 250, 149, 255)) ?: Color(244, 250, 149, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.6833f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.8f, 15.4f)
generalPath!!.curveTo(16.8f, 16.8f, 15.7f, 17.9f, 14.3f, 17.9f)
generalPath!!.curveTo(12.9f, 17.9f, 11.8f, 16.8f, 11.8f, 15.4f)
generalPath!!.curveTo(11.8f, 14.0f, 12.9f, 12.9f, 14.3f, 12.9f)
generalPath!!.curveTo(15.7f, 12.9f, 16.8f, 14.0f, 16.8f, 15.4f)
generalPath!!.lineTo(16.8f, 15.4f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(247, 252, 183, 255)) ?: Color(247, 252, 183, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.8417f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.4f, 15.4f)
generalPath!!.curveTo(16.4f, 16.6f, 15.4f, 17.5f, 14.3f, 17.5f)
generalPath!!.curveTo(13.2f, 17.5f, 12.2f, 16.5f, 12.2f, 15.4f)
generalPath!!.curveTo(12.2f, 14.3f, 13.2f, 13.3f, 14.3f, 13.3f)
generalPath!!.curveTo(15.4f, 13.3f, 16.4f, 14.3f, 16.4f, 15.4f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(251, 253, 219, 255)) ?: Color(251, 253, 219, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.0f, 15.4f)
generalPath!!.curveTo(16.0f, 16.4f, 15.2f, 17.2f, 14.2f, 17.2f)
generalPath!!.curveTo(13.2f, 17.2f, 12.4f, 16.4f, 12.4f, 15.4f)
generalPath!!.curveTo(12.4f, 14.4f, 13.2f, 13.6f, 14.2f, 13.6f)
generalPath!!.curveTo(15.2f, 13.6f, 16.0f, 14.4f, 16.0f, 15.4f)
generalPath!!.lineTo(16.0f, 15.4f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.3f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.01586f, 21.649044f)
generalPath!!.lineTo(33.697147f, 21.649044f)
generalPath!!.lineTo(35.362053f, 22.124731f)
generalPath!!.lineTo(32.50793f, 22.124731f)
generalPath!!.curveTo(32.50793f, 22.124731f, 35.362053f, 22.362574f, 36.789116f, 24.1464f)
generalPath!!.curveTo(38.216175f, 25.811304f, 35.12421f, 27.832975f, 35.12421f, 27.832975f)
generalPath!!.curveTo(35.12421f, 27.832975f, 35.12421f, 27.832975f, 35.12421f, 27.832975f)
generalPath!!.curveTo(35.005287f, 27.47621f, 34.291756f, 24.622087f, 32.864697f, 23.43287f)
generalPath!!.curveTo(31.7944f, 22.481497f, 30.605183f, 22.243652f, 30.605183f, 22.243652f)
generalPath!!.lineTo(25.01586f, 22.243652f)
generalPath!!.lineTo(25.01586f, 21.767965f)
generalPath!!.lineTo(25.01586f, 21.649044f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.3f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(30.724106f, 22.362574f)
generalPath!!.lineTo(25.729391f, 22.362574f)
generalPath!!.lineTo(35.005287f, 27.59513f)
generalPath!!.lineTo(30.724106f, 22.362574f)
generalPath!!.lineTo(30.724106f, 22.362574f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.01586f, 21.767965f)
generalPath!!.lineTo(33.697147f, 21.767965f)
generalPath!!.lineTo(35.005287f, 20.935513f)
generalPath!!.lineTo(32.15117f, 20.935513f)
generalPath!!.curveTo(32.15117f, 20.935513f, 34.767445f, 20.459827f, 35.12421f, 17.486782f)
generalPath!!.curveTo(35.480972f, 14.513739f, 31.08087f, 11.183931f, 31.08087f, 11.183931f)
generalPath!!.curveTo(31.08087f, 11.183931f, 31.08087f, 11.183931f, 31.08087f, 11.302853f)
generalPath!!.curveTo(31.19979f, 12.016383f, 32.389008f, 17.011095f, 31.556557f, 18.913845f)
generalPath!!.curveTo(31.19979f, 20.578747f, 30.129496f, 20.935513f, 30.129496f, 20.935513f)
generalPath!!.lineTo(24.659094f, 20.935513f)
generalPath!!.lineTo(24.896938f, 21.767965f)
generalPath!!.lineTo(25.01586f, 21.767965f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(81, 81, 81, 255)) ?: Color(81, 81, 81, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(30.248419f, 20.459827f)
generalPath!!.lineTo(25.253704f, 20.459827f)
generalPath!!.lineTo(31.19979f, 11.421773f)
generalPath!!.lineTo(30.248419f, 20.459827f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(81, 81, 81, 255)) ?: Color(81, 81, 81, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(0.99999976f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.8042316f, 7.4528584f)
generalPath!!.lineTo(43.233986f, 7.4528584f)
generalPath!!.curveTo(43.384365f, 7.4528584f, 43.505432f, 7.5739236f, 43.505432f, 7.7243047f)
generalPath!!.lineTo(43.505432f, 31.422651f)
generalPath!!.curveTo(43.505432f, 32.368526f, 36.401688f, 38.5f, 36.251305f, 38.5f)
generalPath!!.lineTo(2.8042316f, 38.5f)
generalPath!!.curveTo(2.6538508f, 38.5f, 2.532786f, 38.378937f, 2.532786f, 38.228554f)
generalPath!!.lineTo(2.532786f, 7.7243047f)
generalPath!!.curveTo(2.532786f, 7.5739236f, 2.6538508f, 7.4528584f, 2.8042316f, 7.4528584f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.84659094f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4
paint = colorFilter?.filter(Color(79, 79, 79, 255)) ?: Color(79, 79, 79, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = Rectangle2D.Double(5.5, 10.5, 35.0625, 25.0625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(35.206654f, 39.46876f)
generalPath!!.curveTo(37.23707f, 39.79866f, 44.795444f, 34.938835f, 44.491062f, 30.970919f)
generalPath!!.curveTo(42.9278f, 33.394016f, 39.73254f, 32.257656f, 35.623783f, 32.416668f)
generalPath!!.curveTo(35.623783f, 32.416668f, 36.019154f, 38.96876f, 35.206654f, 39.46876f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(35.99658203125, 40.458221435546875), Point2D.Double(33.664920806884766, 37.770721435546875), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(124, 124, 124, 255)) ?: Color(124, 124, 124, 255)),(colorFilter?.filter(Color(184, 184, 184, 255)) ?: Color(184, 184, 184, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 5.1475701332092285f, -3.034791946411133f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(42.1875, 31.0), Point2D.Double(45.0, 39.98469161987305), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(187, 189, 186, 255)) ?: Color(187, 189, 186, 255)),(colorFilter?.filter(Color(112, 116, 110, 255)) ?: Color(112, 116, 110, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0000002f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(35.206654f, 39.46876f)
generalPath!!.curveTo(37.23707f, 39.79866f, 44.795444f, 34.938835f, 44.491062f, 30.970919f)
generalPath!!.curveTo(42.9278f, 33.394016f, 39.73254f, 32.257656f, 35.623783f, 32.416668f)
generalPath!!.curveTo(35.623783f, 32.416668f, 36.019154f, 38.96876f, 35.206654f, 39.46876f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.36931816f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_6
paint = LinearGradientPaint(Point2D.Double(33.39600372314453, 36.92133331298828), Point2D.Double(34.170047760009766, 38.07038116455078), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 5.1475701332092285f, -3.409791946411133f))
stroke = BasicStroke(0.9999998f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(36.65709f, 37.27726f)
generalPath!!.curveTo(38.026867f, 36.593433f, 41.08534f, 35.130795f, 42.38472f, 33.24979f)
generalPath!!.curveTo(40.788624f, 33.929848f, 39.43691f, 33.45929f, 36.682384f, 33.440197f)
generalPath!!.curveTo(36.682384f, 33.440197f, 36.844707f, 36.502293f, 36.65709f, 37.27726f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.30113637f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.0625f, 8.0f)
generalPath!!.lineTo(3.0625f, 30.0625f)
generalPath!!.curveTo(25.388578f, 30.950861f, 27.884634f, 17.0f, 43.0f, 17.0f)
generalPath!!.lineTo(43.0f, 8.0f)
generalPath!!.lineTo(3.0625f, 8.0f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(12.700490951538086, 10.404875755310059), 19.96875f, Point2D.Double(12.700490951538086, 10.404875755310059), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.7105309963226318f, -5.396358033332207E-24f, 2.4703449431856023E-24f, 1.1248489618301392f, -11.568329811096191f, 1.802582025527954f))
g.paint = paint
g.fill(shape)
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
	    generalPath = null
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
            return 0.6994239091873169
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 5.954774856567383
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 44.3132209777832
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 36.96355056762695
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Image_x_generic(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Image_x_generic(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Image_x_generic(getOrigWidth().toInt(), getOrigHeight().toInt()) }
        }
    }

    override fun getIconHeight(): Int {
        return width
    }

    override fun getIconWidth(): Int {
        return height
    }

    override @Synchronized fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override fun supportsColorFilter(): Boolean {
        return true
    }

    override fun setColorFilter(colorFilter: RadianceIcon.ColorFilter?) {
        this.colorFilter = colorFilter
    }

    override @Synchronized fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
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

