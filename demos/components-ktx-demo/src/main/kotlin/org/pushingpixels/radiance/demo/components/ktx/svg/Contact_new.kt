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
class Contact_new private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 0.3976608f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.1009429693222046f, 0.0f, 0.0f, 0.7564100027084351f, -4.579099178314209f, 8.809000015258789f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(44.125f, 38.125f)
generalPath!!.curveTo(44.154446f, 39.871864f, 40.658646f, 41.489384f, 34.961304f, 42.365078f)
generalPath!!.curveTo(29.263962f, 43.240772f, 22.236038f, 43.240772f, 16.538696f, 42.365078f)
generalPath!!.curveTo(10.841355f, 41.489384f, 7.345554f, 39.871864f, 7.375f, 38.125f)
generalPath!!.curveTo(7.345554f, 36.378136f, 10.841355f, 34.760616f, 16.538696f, 33.884922f)
generalPath!!.curveTo(22.236038f, 33.009228f, 29.263962f, 33.009228f, 34.961304f, 33.884922f)
generalPath!!.curveTo(40.658646f, 34.760616f, 44.154446f, 36.378136f, 44.125f, 38.125f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(25.75, 38.125), 18.375f, Point2D.Double(25.75, 38.125), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.2653059959411621f, -2.3028459437548035E-16f, 28.01020050048828f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
shape = RoundRectangle2D.Double(2.5534627437591553, 8.5, 43.89767837524414, 30.0, 5.5, 5.5)
paint = LinearGradientPaint(Point2D.Double(16.25, 12.25), Point2D.Double(31.5, 36.625), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(221, 221, 221, 255)) ?: Color(221, 221, 221, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.1078280210494995f, 0.0f, 0.0f, 1.0f, -1.8778489828109741f, -0.5f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(147, 147, 147, 255)) ?: Color(147, 147, 147, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(2.5534627437591553, 8.5, 43.89767837524414, 30.0, 5.5, 5.5)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(1.0000002f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(3.5477371215820312, 9.629325866699219, 41.90092468261719, 27.74135971069336, 3.5000007152557373, 3.500000476837158)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.43479999899864197f, 0.0f, 0.0f, 0.43479999899864197f, -4.122330188751221f, 8.441450119018555f))
// _0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(32.62349f, 41.30637f)
generalPath!!.lineTo(43.23009f, 41.30637f)
generalPath!!.curveTo(46.235294f, 41.30637f, 49.210575f, 40.204437f, 50.30116f, 37.06373f)
generalPath!!.curveTo(51.336796f, 34.081253f, 50.477936f, 28.40167f, 43.76042f, 23.805477f)
generalPath!!.lineTo(31.209274f, 23.805477f)
generalPath!!.curveTo(24.49176f, 28.048117f, 23.652283f, 33.850307f, 25.198868f, 37.240505f)
generalPath!!.curveTo(26.774462f, 40.694294f, 29.441507f, 41.30637f, 32.62349f, 41.30637f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(16.214740753173828, 19.836467742919922), 13.56536f, Point2D.Double(16.214740753173828, 19.836467742919922), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(114, 126, 10, 255)) ?: Color(114, 126, 10, 255)),(colorFilter?.filter(Color(91, 101, 8, 255)) ?: Color(91, 101, 8, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.6819170117378235f, 19.762310028076172f, 14.90410041809082f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(64, 70, 4, 255)) ?: Color(64, 70, 4, 255)
stroke = BasicStroke(2.299906f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(32.62349f, 41.30637f)
generalPath!!.lineTo(43.23009f, 41.30637f)
generalPath!!.curveTo(46.235294f, 41.30637f, 49.210575f, 40.204437f, 50.30116f, 37.06373f)
generalPath!!.curveTo(51.336796f, 34.081253f, 50.477936f, 28.40167f, 43.76042f, 23.805477f)
generalPath!!.lineTo(31.209274f, 23.805477f)
generalPath!!.curveTo(24.49176f, 28.048117f, 23.652283f, 33.850307f, 25.198868f, 37.240505f)
generalPath!!.curveTo(26.774462f, 40.694294f, 29.441507f, 41.30637f, 32.62349f, 41.30637f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(37.69468f, 26.457129f)
generalPath!!.curveTo(37.69468f, 26.457129f, 35.543358f, 28.117462f, 35.72869f, 30.11766f)
generalPath!!.curveTo(33.687466f, 28.316868f, 33.62882f, 24.866137f, 33.62882f, 24.866137f)
generalPath!!.lineTo(37.69468f, 26.457129f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(157, 176, 41, 255)) ?: Color(157, 176, 41, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.21518986f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_2
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(2.2999048f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(33.2112f, 39.48254f)
generalPath!!.lineTo(42.508293f, 39.48254f)
generalPath!!.curveTo(44.88714f, 39.48254f, 47.242294f, 38.610283f, 48.105576f, 36.124172f)
generalPath!!.curveTo(48.92536f, 33.76332f, 48.020214f, 29.267504f, 42.702797f, 25.629272f)
generalPath!!.lineTo(32.317036f, 25.629272f)
generalPath!!.curveTo(26.99962f, 28.98764f, 26.10982f, 33.58051f, 27.334055f, 36.264107f)
generalPath!!.curveTo(28.581259f, 38.99804f, 30.692423f, 39.48254f, 33.2112f, 39.48254f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(38.673107f, 26.457129f)
generalPath!!.curveTo(38.673107f, 26.457129f, 40.824432f, 28.117462f, 40.6391f, 30.11766f)
generalPath!!.curveTo(42.680325f, 28.316868f, 42.73897f, 24.866137f, 42.73897f, 24.866137f)
generalPath!!.lineTo(38.673107f, 26.457129f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(157, 176, 41, 255)) ?: Color(157, 176, 41, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.5123138427734375f, 3.1703310012817383f))
// _0_0_3_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.774754f, 19.008621f)
generalPath!!.curveTo(39.788635f, 22.112505f, 38.140697f, 24.986568f, 35.454945f, 26.54253f)
generalPath!!.curveTo(32.769196f, 28.098494f, 29.4562f, 28.098494f, 26.770447f, 26.54253f)
generalPath!!.curveTo(24.084696f, 24.986568f, 22.436758f, 22.112505f, 22.45064f, 19.008621f)
generalPath!!.curveTo(22.436758f, 15.904738f, 24.084696f, 13.030674f, 26.770447f, 11.474711f)
generalPath!!.curveTo(29.4562f, 9.918749f, 32.769196f, 9.918749f, 35.454945f, 11.474711f)
generalPath!!.curveTo(38.140697f, 13.030674f, 39.788635f, 15.904738f, 39.774754f, 19.008621f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(31.11269760131836, 19.008621215820312), 8.662058f, Point2D.Double(31.11269760131836, 19.008621215820312), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.6373138427734375f, -0.3296689987182617f))
// _0_0_3_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.774754f, 19.008621f)
generalPath!!.curveTo(39.788635f, 22.112505f, 38.140697f, 24.986568f, 35.454945f, 26.54253f)
generalPath!!.curveTo(32.769196f, 28.098494f, 29.4562f, 28.098494f, 26.770447f, 26.54253f)
generalPath!!.curveTo(24.084696f, 24.986568f, 22.436758f, 22.112505f, 22.45064f, 19.008621f)
generalPath!!.curveTo(22.436758f, 15.904738f, 24.084696f, 13.030674f, 26.770447f, 11.474711f)
generalPath!!.curveTo(29.4562f, 9.918749f, 32.769196f, 9.918749f, 35.454945f, 11.474711f)
generalPath!!.curveTo(38.140697f, 13.030674f, 39.788635f, 15.904738f, 39.774754f, 19.008621f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(29.34493064880371, 17.064077377319336), 9.162058f, Point2D.Double(29.34493064880371, 17.064077377319336), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(233, 177, 94, 255)) ?: Color(233, 177, 94, 255)),(colorFilter?.filter(Color(150, 100, 22, 255)) ?: Color(150, 100, 22, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.7879980206489563f, 3.87763689379579E-16f, -3.87763689379579E-16f, 0.7879980206489563f, 6.221198081970215f, 3.617626905441284f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(111, 71, 9, 255)) ?: Color(111, 71, 9, 255)
stroke = BasicStroke(2.299906f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.774754f, 19.008621f)
generalPath!!.curveTo(39.788635f, 22.112505f, 38.140697f, 24.986568f, 35.454945f, 26.54253f)
generalPath!!.curveTo(32.769196f, 28.098494f, 29.4562f, 28.098494f, 26.770447f, 26.54253f)
generalPath!!.curveTo(24.084696f, 24.986568f, 22.436758f, 22.112505f, 22.45064f, 19.008621f)
generalPath!!.curveTo(22.436758f, 15.904738f, 24.084696f, 13.030674f, 26.770447f, 11.474711f)
generalPath!!.curveTo(29.4562f, 9.918749f, 32.769196f, 9.918749f, 35.454945f, 11.474711f)
generalPath!!.curveTo(38.140697f, 13.030674f, 39.788635f, 15.904738f, 39.774754f, 19.008621f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.12658231f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.7473769783973694f, 0.0f, 0.0f, 0.7473769783973694f, 14.497119903564453f, 4.472360134124756f))
// _0_0_3_6
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(3.0773065f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.774754f, 19.008621f)
generalPath!!.curveTo(39.788635f, 22.112505f, 38.140697f, 24.986568f, 35.454945f, 26.54253f)
generalPath!!.curveTo(32.769196f, 28.098494f, 29.4562f, 28.098494f, 26.770447f, 26.54253f)
generalPath!!.curveTo(24.084696f, 24.986568f, 22.436758f, 22.112505f, 22.45064f, 19.008621f)
generalPath!!.curveTo(22.436758f, 15.904738f, 24.084696f, 13.030674f, 26.770447f, 11.474711f)
generalPath!!.curveTo(29.4562f, 9.918749f, 32.769196f, 9.918749f, 35.454945f, 11.474711f)
generalPath!!.curveTo(38.140697f, 13.030674f, 39.788635f, 15.904738f, 39.774754f, 19.008621f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(42.346207f, 33.70497f)
generalPath!!.lineTo(46.58885f, 33.70497f)
generalPath!!.lineTo(44.113976f, 31.406876f)
generalPath!!.lineTo(43.583645f, 32.113983f)
generalPath!!.lineTo(43.053314f, 31.583652f)
generalPath!!.lineTo(42.346207f, 33.70497f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(30.93592071533203, 29.553485870361328), Point2D.Double(30.93592071533203, 35.80348587036133), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(201, 201, 201, 255)) ?: Color(201, 201, 201, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 7.344423770904541f, -0.3296689987182617f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.22784807f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_8
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(28.310268f, 40.27208f)
generalPath!!.curveTo(27.06266f, 39.727108f, 26.504274f, 38.4138f, 26.504274f, 38.4138f)
generalPath!!.curveTo(27.345554f, 34.344666f, 30.2242f, 31.367584f, 30.2242f, 31.367584f)
generalPath!!.curveTo(30.2242f, 31.367584f, 27.944878f, 37.7791f, 28.310268f, 40.27208f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(20.66169548034668, 35.81797409057617), Point2D.Double(22.626924514770508, 36.21775817871094), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9833750128746033f, 0.18158799409866333f, -0.18158799409866333f, 0.9833750128746033f, 12.690190315246582f, -3.1545889377593994f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.22784807f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_9
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(47.215977f, 39.413727f)
generalPath!!.curveTo(48.447227f, 38.83275f, 49.020355f, 37.411407f, 49.020355f, 37.411407f)
generalPath!!.curveTo(48.061234f, 33.368423f, 45.044205f, 30.568584f, 45.044205f, 30.568584f)
generalPath!!.curveTo(45.044205f, 30.568584f, 47.5088f, 36.911186f, 47.215977f, 39.413727f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(22.686765670776367, 36.39039993286133), Point2D.Double(21.40845489501953, 35.73963165283203), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.9776849746704102f, 0.2100750058889389f, 0.2100750058889389f, 0.9776849746704102f, 61.56806945800781f, -4.448328971862793f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(21.342953f, 15.75347f)
generalPath!!.curveTo(21.34295f, 16.130426f, 21.254414f, 16.419514f, 21.07734f, 16.620735f)
generalPath!!.curveTo(20.900263f, 16.820616f, 20.658796f, 16.920555f, 20.352942f, 16.920555f)
generalPath!!.curveTo(20.228184f, 16.920555f, 20.108791f, 16.89708f, 19.994766f, 16.850128f)
generalPath!!.lineTo(19.994766f, 16.314878f)
generalPath!!.curveTo(20.095377f, 16.391342f, 20.20672f, 16.429575f, 20.328794f, 16.429575f)
generalPath!!.curveTo(20.479038f, 16.429575f, 20.591724f, 16.373903f, 20.666847f, 16.262562f)
generalPath!!.curveTo(20.74331f, 16.149878f, 20.781544f, 15.981522f, 20.781544f, 15.757494f)
generalPath!!.lineTo(20.781544f, 13.972657f)
generalPath!!.lineTo(21.342953f, 13.972657f)
generalPath!!.lineTo(21.342953f, 15.75347f)
generalPath!!.moveTo(22.91047f, 14.723214f)
generalPath!!.curveTo(23.224375f, 14.723216f, 23.47456f, 14.819803f, 23.661028f, 15.012973f)
generalPath!!.curveTo(23.84749f, 15.206148f, 23.940723f, 15.465724f, 23.940725f, 15.791702f)
generalPath!!.curveTo(23.940723f, 16.145853f, 23.840782f, 16.422197f, 23.640905f, 16.620735f)
generalPath!!.curveTo(23.441023f, 16.817932f, 23.172728f, 16.91653f, 22.836018f, 16.916533f)
generalPath!!.curveTo(22.526134f, 16.91653f, 22.273937f, 16.819275f, 22.079424f, 16.62476f)
generalPath!!.curveTo(21.886251f, 16.430246f, 21.789663f, 16.175365f, 21.789665f, 15.860117f)
generalPath!!.curveTo(21.789663f, 15.505968f, 21.890945f, 15.228282f, 22.09351f, 15.027059f)
generalPath!!.curveTo(22.296072f, 14.824498f, 22.568392f, 14.723216f, 22.91047f, 14.723214f)
generalPath!!.moveTo(22.86419f, 16.483906f)
generalPath!!.curveTo(23.027847f, 16.483906f, 23.160654f, 16.42555f, 23.262608f, 16.308842f)
generalPath!!.curveTo(23.3659f, 16.190792f, 23.417547f, 16.030485f, 23.41755f, 15.827922f)
generalPath!!.curveTo(23.417547f, 15.622677f, 23.366571f, 15.461029f, 23.26462f, 15.342977f)
generalPath!!.curveTo(23.162666f, 15.223587f, 23.031872f, 15.163891f, 22.872238f, 15.16389f)
generalPath!!.curveTo(22.713942f, 15.163891f, 22.579794f, 15.22627f, 22.469793f, 15.351026f)
generalPath!!.curveTo(22.359793f, 15.474443f, 22.304792f, 15.637433f, 22.304792f, 15.839995f)
generalPath!!.curveTo(22.304792f, 16.039877f, 22.358452f, 16.1975f, 22.46577f, 16.312866f)
generalPath!!.curveTo(22.574429f, 16.426891f, 22.707235f, 16.483906f, 22.86419f, 16.483906f)
generalPath!!.moveTo(26.282948f, 16.858177f)
generalPath!!.lineTo(25.743673f, 16.858177f)
generalPath!!.lineTo(25.743673f, 15.729323f)
generalPath!!.curveTo(25.743671f, 15.540176f, 25.714828f, 15.403345f, 25.657146f, 15.318831f)
generalPath!!.curveTo(25.599463f, 15.232978f, 25.500864f, 15.19005f, 25.361351f, 15.190049f)
generalPath!!.curveTo(25.239277f, 15.19005f, 25.137995f, 15.236331f, 25.057507f, 15.328892f)
generalPath!!.curveTo(24.977016f, 15.421455f, 24.936773f, 15.539505f, 24.936773f, 15.683042f)
generalPath!!.lineTo(24.936773f, 16.858177f)
generalPath!!.lineTo(24.391462f, 16.858177f)
generalPath!!.lineTo(24.391462f, 13.807655f)
generalPath!!.lineTo(24.936773f, 13.807655f)
generalPath!!.lineTo(24.936773f, 15.085413f)
generalPath!!.curveTo(25.010553f, 14.964682f, 25.102446f, 14.874132f, 25.212446f, 14.813764f)
generalPath!!.curveTo(25.32379f, 14.753399f, 25.453241f, 14.723216f, 25.600805f, 14.723214f)
generalPath!!.curveTo(25.827515f, 14.723216f, 25.99788f, 14.793644f, 26.11191f, 14.934497f)
generalPath!!.curveTo(26.225931f, 15.075354f, 26.282946f, 15.286637f, 26.282948f, 15.568346f)
generalPath!!.lineTo(26.282948f, 16.858177f)
generalPath!!.moveTo(28.75395f, 16.858177f)
generalPath!!.lineTo(28.214676f, 16.858177f)
generalPath!!.lineTo(28.214676f, 15.729323f)
generalPath!!.curveTo(28.214676f, 15.540176f, 28.185833f, 15.403345f, 28.12815f, 15.318831f)
generalPath!!.curveTo(28.070465f, 15.232978f, 27.971867f, 15.19005f, 27.832355f, 15.190049f)
generalPath!!.curveTo(27.71028f, 15.19005f, 27.608997f, 15.236331f, 27.52851f, 15.328892f)
generalPath!!.curveTo(27.44802f, 15.421455f, 27.407776f, 15.539505f, 27.407778f, 15.683042f)
generalPath!!.lineTo(27.407778f, 16.858177f)
generalPath!!.lineTo(26.862467f, 16.858177f)
generalPath!!.lineTo(26.862467f, 14.797666f)
generalPath!!.lineTo(27.407778f, 14.797666f)
generalPath!!.lineTo(27.407778f, 15.085413f)
generalPath!!.curveTo(27.481558f, 14.964682f, 27.573448f, 14.874132f, 27.68345f, 14.813764f)
generalPath!!.curveTo(27.794792f, 14.753399f, 27.924246f, 14.723216f, 28.07181f, 14.723214f)
generalPath!!.curveTo(28.298517f, 14.723216f, 28.468885f, 14.793644f, 28.582912f, 14.934497f)
generalPath!!.curveTo(28.696936f, 15.075354f, 28.753948f, 15.286637f, 28.75395f, 15.568346f)
generalPath!!.lineTo(28.75395f, 16.858177f)
generalPath!!.moveTo(30.518665f, 13.972657f)
generalPath!!.lineTo(31.5288f, 13.972657f)
generalPath!!.curveTo(32.017097f, 13.97266f, 32.38332f, 14.090039f, 32.62747f, 14.324795f)
generalPath!!.curveTo(32.87296f, 14.559556f, 32.995705f, 14.911023f, 32.995705f, 15.379197f)
generalPath!!.curveTo(32.995705f, 15.831276f, 32.857533f, 16.190792f, 32.58119f, 16.457747f)
generalPath!!.curveTo(32.306183f, 16.7247f, 31.933252f, 16.858177f, 31.462397f, 16.858177f)
generalPath!!.lineTo(30.518665f, 16.858177f)
generalPath!!.lineTo(30.518665f, 13.972657f)
generalPath!!.moveTo(31.080074f, 16.413477f)
generalPath!!.lineTo(31.450323f, 16.413477f)
generalPath!!.curveTo(31.753494f, 16.413477f, 31.991608f, 16.322927f, 32.16466f, 16.141829f)
generalPath!!.curveTo(32.33905f, 15.960729f, 32.426247f, 15.713226f, 32.42625f, 15.399319f)
generalPath!!.curveTo(32.426247f, 15.094805f, 32.341732f, 14.858035f, 32.17271f, 14.689006f)
generalPath!!.curveTo(32.00368f, 14.519982f, 31.768251f, 14.435469f, 31.466421f, 14.435467f)
generalPath!!.lineTo(31.080074f, 14.435467f)
generalPath!!.lineTo(31.080074f, 16.413477f)
generalPath!!.moveTo(34.436455f, 14.723214f)
generalPath!!.curveTo(34.75036f, 14.723216f, 35.00054f, 14.819803f, 35.18701f, 15.012973f)
generalPath!!.curveTo(35.373474f, 15.206148f, 35.466705f, 15.465724f, 35.46671f, 15.791702f)
generalPath!!.curveTo(35.466705f, 16.145853f, 35.366768f, 16.422197f, 35.16689f, 16.620735f)
generalPath!!.curveTo(34.967007f, 16.817932f, 34.69871f, 16.91653f, 34.362003f, 16.916533f)
generalPath!!.curveTo(34.05212f, 16.91653f, 33.79992f, 16.819275f, 33.605408f, 16.62476f)
generalPath!!.curveTo(33.412235f, 16.430246f, 33.315647f, 16.175365f, 33.315647f, 15.860117f)
generalPath!!.curveTo(33.315647f, 15.505968f, 33.41693f, 15.228282f, 33.61949f, 15.027059f)
generalPath!!.curveTo(33.822056f, 14.824498f, 34.094376f, 14.723216f, 34.436455f, 14.723214f)
generalPath!!.moveTo(34.390175f, 16.483906f)
generalPath!!.curveTo(34.553833f, 16.483906f, 34.686638f, 16.42555f, 34.788593f, 16.308842f)
generalPath!!.curveTo(34.891884f, 16.190792f, 34.94353f, 16.030485f, 34.94353f, 15.827922f)
generalPath!!.curveTo(34.94353f, 15.622677f, 34.892555f, 15.461029f, 34.790604f, 15.342977f)
generalPath!!.curveTo(34.68865f, 15.223587f, 34.557858f, 15.163891f, 34.39822f, 15.16389f)
generalPath!!.curveTo(34.239925f, 15.163891f, 34.105778f, 15.22627f, 33.995777f, 15.351026f)
generalPath!!.curveTo(33.885777f, 15.474443f, 33.830776f, 15.637433f, 33.830776f, 15.839995f)
generalPath!!.curveTo(33.830776f, 16.039877f, 33.884434f, 16.1975f, 33.991753f, 16.312866f)
generalPath!!.curveTo(34.10041f, 16.426891f, 34.23322f, 16.483906f, 34.390175f, 16.483906f)
generalPath!!.moveTo(37.690212f, 15.946642f)
generalPath!!.lineTo(36.31788f, 15.946642f)
generalPath!!.curveTo(36.31788f, 16.11567f, 36.369522f, 16.247133f, 36.47282f, 16.341038f)
generalPath!!.curveTo(36.577454f, 16.4336f, 36.722332f, 16.479881f, 36.90746f, 16.47988f)
generalPath!!.curveTo(37.111362f, 16.479881f, 37.307888f, 16.418842f, 37.49704f, 16.296768f)
generalPath!!.lineTo(37.49704f, 16.74348f)
generalPath!!.curveTo(37.285084f, 16.853481f, 37.04764f, 16.908484f, 36.784714f, 16.908484f)
generalPath!!.curveTo(36.46678f, 16.908484f, 36.217937f, 16.81525f, 36.03818f, 16.628784f)
generalPath!!.curveTo(35.859764f, 16.44232f, 35.770554f, 16.187439f, 35.770554f, 15.864142f)
generalPath!!.curveTo(35.770554f, 15.515358f, 35.8658f, 15.237673f, 36.05629f, 15.031083f)
generalPath!!.curveTo(36.24812f, 14.823156f, 36.500317f, 14.719192f, 36.812885f, 14.71919f)
generalPath!!.curveTo(37.087887f, 14.719192f, 37.30252f, 14.805046f, 37.456795f, 14.976753f)
generalPath!!.curveTo(37.612404f, 15.147123f, 37.69021f, 15.385235f, 37.690212f, 15.691091f)
generalPath!!.lineTo(37.690212f, 15.946642f)
generalPath!!.moveTo(37.187157f, 15.584443f)
generalPath!!.curveTo(37.187157f, 15.440906f, 37.150936f, 15.328893f, 37.078495f, 15.248403f)
generalPath!!.curveTo(37.007397f, 15.167916f, 36.906116f, 15.127672f, 36.77465f, 15.12767f)
generalPath!!.curveTo(36.65526f, 15.127672f, 36.551964f, 15.169257f, 36.46477f, 15.252427f)
generalPath!!.curveTo(36.37757f, 15.334259f, 36.32861f, 15.444931f, 36.31788f, 15.584443f)
generalPath!!.lineTo(37.187157f, 15.584443f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.3976608f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
shape = RoundRectangle2D.Double(21.0, 19.977853775024414, 17.375, 2.0, 2.0625, 2.0)
paint = colorFilter?.filter(Color(141, 141, 141, 255)) ?: Color(141, 141, 141, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.3976608f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
shape = RoundRectangle2D.Double(21.0, 23.0, 14.0, 2.0, 2.0625, 2.0)
paint = colorFilter?.filter(Color(141, 141, 141, 255)) ?: Color(141, 141, 141, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.4853801f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 0.8333330154418945f, 0.0f, 5.0f))
// _0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_0
shape = Rectangle2D.Double(6.0, 30.0, 1.0, 6.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_1
shape = Rectangle2D.Double(8.08464527130127, 30.0, 1.9375, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_2
shape = Rectangle2D.Double(11.0, 30.0, 1.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_3
shape = Rectangle2D.Double(13.0, 30.0, 2.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_4
shape = Rectangle2D.Double(16.0, 30.0, 1.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_5
shape = Rectangle2D.Double(18.0, 30.0, 1.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_6
shape = Rectangle2D.Double(21.0, 30.0, 1.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_7
shape = Rectangle2D.Double(23.0, 30.0, 2.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_8
shape = Rectangle2D.Double(26.0, 30.0, 2.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_9
shape = Rectangle2D.Double(29.0, 30.0, 1.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_10
shape = Rectangle2D.Double(31.0, 30.0, 1.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_11
shape = Rectangle2D.Double(33.0, 30.0, 1.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_12
shape = Rectangle2D.Double(35.0, 30.0, 2.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_13
shape = Rectangle2D.Double(39.0, 30.0, 2.0, 3.600013494491577)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_14
shape = Rectangle2D.Double(42.0, 30.0, 1.0, 6.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.937491f, 34.398197f)
generalPath!!.curveTo(9.012451f, 34.414223f, 9.0708685f, 34.447567f, 9.112743f, 34.49823f)
generalPath!!.curveTo(9.155133f, 34.548893f, 9.17633f, 34.611446f, 9.176331f, 34.68589f)
generalPath!!.curveTo(9.17633f, 34.80014f, 9.13704f, 34.88854f, 9.058462f, 34.95109f)
generalPath!!.curveTo(8.979882f, 35.013645f, 8.868217f, 35.04492f, 8.723468f, 35.04492f)
generalPath!!.curveTo(8.674872f, 35.04492f, 8.624726f, 35.040012f, 8.57303f, 35.03019f)
generalPath!!.curveTo(8.521851f, 35.02088f, 8.468862f, 35.006668f, 8.414063f, 34.987537f)
generalPath!!.lineTo(8.414063f, 34.836327f)
generalPath!!.curveTo(8.457488f, 34.861656f, 8.505049f, 34.880787f, 8.556746f, 34.89371f)
generalPath!!.curveTo(8.608442f, 34.906635f, 8.662465f, 34.913097f, 8.718815f, 34.913097f)
generalPath!!.curveTo(8.817038f, 34.913097f, 8.89174f, 34.89371f, 8.94292f, 34.85494f)
generalPath!!.curveTo(8.994616f, 34.816166f, 9.020464f, 34.759815f, 9.020465f, 34.68589f)
generalPath!!.curveTo(9.020464f, 34.61765f, 8.996425f, 34.564404f, 8.948348f, 34.526146f)
generalPath!!.curveTo(8.900786f, 34.487373f, 8.834356f, 34.467987f, 8.749058f, 34.467987f)
generalPath!!.lineTo(8.614129f, 34.467987f)
generalPath!!.lineTo(8.614129f, 34.339264f)
generalPath!!.lineTo(8.75526f, 34.339264f)
generalPath!!.curveTo(8.832289f, 34.339264f, 8.891223f, 34.324013f, 8.932063f, 34.29351f)
generalPath!!.curveTo(8.972903f, 34.262493f, 8.993323f, 34.218037f, 8.993324f, 34.160133f)
generalPath!!.curveTo(8.993323f, 34.100685f, 8.972128f, 34.05519f, 8.929737f, 34.023655f)
generalPath!!.curveTo(8.887862f, 33.991604f, 8.827636f, 33.97558f, 8.749058f, 33.97558f)
generalPath!!.curveTo(8.706149f, 33.97558f, 8.660139f, 33.980232f, 8.611028f, 33.989536f)
generalPath!!.curveTo(8.561915f, 33.99884f, 8.507893f, 34.013317f, 8.448958f, 34.03296f)
generalPath!!.lineTo(8.448958f, 33.89338f)
generalPath!!.curveTo(8.5084095f, 33.87684f, 8.563983f, 33.86443f, 8.61568f, 33.85616f)
generalPath!!.curveTo(8.667893f, 33.847885f, 8.717005f, 33.843754f, 8.763016f, 33.84375f)
generalPath!!.curveTo(8.881917f, 33.843754f, 8.976005f, 33.87089f, 9.0452795f, 33.925175f)
generalPath!!.curveTo(9.114552f, 33.97894f, 9.149189f, 34.05183f, 9.14919f, 34.14385f)
generalPath!!.curveTo(9.149189f, 34.207954f, 9.1308365f, 34.262238f, 9.094132f, 34.306694f)
generalPath!!.curveTo(9.057427f, 34.350636f, 9.005214f, 34.381138f, 8.937491f, 34.398197f)
generalPath!!.moveTo(9.609031f, 34.89061f)
generalPath!!.lineTo(10.155723f, 34.89061f)
generalPath!!.lineTo(10.155723f, 35.022434f)
generalPath!!.lineTo(9.420597f, 35.022434f)
generalPath!!.lineTo(9.420597f, 34.89061f)
generalPath!!.curveTo(9.480048f, 34.82909f, 9.560953f, 34.74663f, 9.663313f, 34.643238f)
generalPath!!.curveTo(9.766189f, 34.53933f, 9.83081f, 34.47238f, 9.857175f, 34.442398f)
generalPath!!.curveTo(9.90732f, 34.386047f, 9.942216f, 34.33849f, 9.961861f, 34.299713f)
generalPath!!.curveTo(9.982022f, 34.260426f, 9.992103f, 34.221912f, 9.992104f, 34.184174f)
generalPath!!.curveTo(9.992103f, 34.122654f, 9.97039f, 34.07251f, 9.926966f, 34.033737f)
generalPath!!.curveTo(9.884057f, 33.994965f, 9.827966f, 33.97558f, 9.758693f, 33.97558f)
generalPath!!.curveTo(9.70958f, 33.97558f, 9.657626f, 33.984108f, 9.602828f, 34.001167f)
generalPath!!.curveTo(9.548546f, 34.018227f, 9.490387f, 34.044075f, 9.428351f, 34.078712f)
generalPath!!.lineTo(9.428351f, 33.92052f)
generalPath!!.curveTo(9.491421f, 33.89519f, 9.550355f, 33.87606f, 9.605154f, 33.863136f)
generalPath!!.curveTo(9.659952f, 33.850212f, 9.710098f, 33.843754f, 9.755591f, 33.84375f)
generalPath!!.curveTo(9.875526f, 33.843754f, 9.971166f, 33.873737f, 10.042508f, 33.933704f)
generalPath!!.curveTo(10.113848f, 33.99367f, 10.149519f, 34.073803f, 10.14952f, 34.17409f)
generalPath!!.curveTo(10.149519f, 34.221653f, 10.140472f, 34.266888f, 10.122379f, 34.309795f)
generalPath!!.curveTo(10.104801f, 34.35219f, 10.072491f, 34.402332f, 10.025448f, 34.46023f)
generalPath!!.curveTo(10.012523f, 34.475227f, 9.971424f, 34.51865f, 9.902151f, 34.590508f)
generalPath!!.curveTo(9.832877f, 34.66185f, 9.73517f, 34.761883f, 9.609031f, 34.89061f)
generalPath!!.moveTo(10.915664f, 34.001167f)
generalPath!!.lineTo(10.520185f, 34.6192f)
generalPath!!.lineTo(10.915664f, 34.6192f)
generalPath!!.lineTo(10.915664f, 34.001167f)
generalPath!!.moveTo(10.874565f, 33.86469f)
generalPath!!.lineTo(11.07153f, 33.86469f)
generalPath!!.lineTo(11.07153f, 34.6192f)
generalPath!!.lineTo(11.2367f, 34.6192f)
generalPath!!.lineTo(11.2367f, 34.749477f)
generalPath!!.lineTo(11.07153f, 34.749477f)
generalPath!!.lineTo(11.07153f, 35.022434f)
generalPath!!.lineTo(10.915664f, 35.022434f)
generalPath!!.lineTo(10.915664f, 34.749477f)
generalPath!!.lineTo(10.393011f, 34.749477f)
generalPath!!.lineTo(10.393011f, 34.598263f)
generalPath!!.lineTo(10.874565f, 33.86469f)
generalPath!!.moveTo(11.498027f, 33.86469f)
generalPath!!.lineTo(12.112959f, 33.86469f)
generalPath!!.lineTo(12.112959f, 33.996513f)
generalPath!!.lineTo(11.641485f, 33.996513f)
generalPath!!.lineTo(11.641485f, 34.28033f)
generalPath!!.curveTo(11.664231f, 34.272575f, 11.686978f, 34.266888f, 11.709725f, 34.263268f)
generalPath!!.curveTo(11.732471f, 34.259132f, 11.755217f, 34.257065f, 11.777964f, 34.257065f)
generalPath!!.curveTo(11.907205f, 34.257065f, 12.009565f, 34.292477f, 12.085042f, 34.3633f)
generalPath!!.curveTo(12.160519f, 34.434128f, 12.198257f, 34.530025f, 12.198258f, 34.650993f)
generalPath!!.curveTo(12.198257f, 34.77558f, 12.159485f, 34.872513f, 12.081941f, 34.941788f)
generalPath!!.curveTo(12.004395f, 35.010544f, 11.895057f, 35.04492f, 11.753925f, 35.04492f)
generalPath!!.curveTo(11.70533f, 35.04492f, 11.655701f, 35.040787f, 11.605039f, 35.032516f)
generalPath!!.curveTo(11.554893f, 35.024242f, 11.502938f, 35.011837f, 11.449174f, 34.995293f)
generalPath!!.lineTo(11.449174f, 34.837875f)
generalPath!!.curveTo(11.4957f, 34.86321f, 11.543778f, 34.882076f, 11.593407f, 34.894485f)
generalPath!!.curveTo(11.643036f, 34.90689f, 11.695508f, 34.913097f, 11.750824f, 34.913097f)
generalPath!!.curveTo(11.840258f, 34.913097f, 11.911083f, 34.889572f, 11.963297f, 34.84253f)
generalPath!!.curveTo(12.01551f, 34.795486f, 12.041617f, 34.73164f, 12.041617f, 34.650993f)
generalPath!!.curveTo(12.041617f, 34.570347f, 12.01551f, 34.5065f, 11.963297f, 34.459457f)
generalPath!!.curveTo(11.911083f, 34.412415f, 11.840258f, 34.388893f, 11.750824f, 34.388893f)
generalPath!!.curveTo(11.708949f, 34.388893f, 11.667075f, 34.393543f, 11.625201f, 34.40285f)
generalPath!!.curveTo(11.583843f, 34.412155f, 11.541452f, 34.426632f, 11.498027f, 34.446274f)
generalPath!!.lineTo(11.498027f, 33.86469f)
generalPath!!.moveTo(13.34825f, 33.967823f)
generalPath!!.curveTo(13.267603f, 33.967823f, 13.20686f, 34.00763f, 13.16602f, 34.087242f)
generalPath!!.curveTo(13.125696f, 34.16634f, 13.105534f, 34.2855f, 13.105534f, 34.444725f)
generalPath!!.curveTo(13.105534f, 34.60343f, 13.125696f, 34.722595f, 13.16602f, 34.802204f)
generalPath!!.curveTo(13.20686f, 34.8813f, 13.267603f, 34.92085f, 13.34825f, 34.92085f)
generalPath!!.curveTo(13.429413f, 34.92085f, 13.490157f, 34.8813f, 13.530481f, 34.802204f)
generalPath!!.curveTo(13.571321f, 34.722595f, 13.591741f, 34.60343f, 13.591742f, 34.444725f)
generalPath!!.curveTo(13.591741f, 34.2855f, 13.571321f, 34.16634f, 13.530481f, 34.087242f)
generalPath!!.curveTo(13.490157f, 34.00763f, 13.429413f, 33.967823f, 13.34825f, 33.967823f)
generalPath!!.moveTo(13.34825f, 33.84375f)
generalPath!!.curveTo(13.478008f, 33.843754f, 13.577007f, 33.89519f, 13.645248f, 33.998066f)
generalPath!!.curveTo(13.714003f, 34.100426f, 13.748381f, 34.249313f, 13.748382f, 34.444725f)
generalPath!!.curveTo(13.748381f, 34.63962f, 13.714003f, 34.788506f, 13.645248f, 34.891384f)
generalPath!!.curveTo(13.577007f, 34.993744f, 13.478008f, 35.04492f, 13.34825f, 35.04492f)
generalPath!!.curveTo(13.218491f, 35.04492f, 13.119234f, 34.993744f, 13.050478f, 34.891384f)
generalPath!!.curveTo(12.982238f, 34.788506f, 12.948118f, 34.63962f, 12.948118f, 34.444725f)
generalPath!!.curveTo(12.948118f, 34.249313f, 12.982238f, 34.100426f, 13.050478f, 33.998066f)
generalPath!!.curveTo(13.119234f, 33.89519f, 13.218491f, 33.843754f, 13.34825f, 33.84375f)
generalPath!!.moveTo(14.025993f, 33.86469f)
generalPath!!.lineTo(14.640925f, 33.86469f)
generalPath!!.lineTo(14.640925f, 33.996513f)
generalPath!!.lineTo(14.169452f, 33.996513f)
generalPath!!.lineTo(14.169452f, 34.28033f)
generalPath!!.curveTo(14.192198f, 34.272575f, 14.214944f, 34.266888f, 14.237691f, 34.263268f)
generalPath!!.curveTo(14.260437f, 34.259132f, 14.283184f, 34.257065f, 14.305931f, 34.257065f)
generalPath!!.curveTo(14.435172f, 34.257065f, 14.537531f, 34.292477f, 14.613009f, 34.3633f)
generalPath!!.curveTo(14.688485f, 34.434128f, 14.726224f, 34.530025f, 14.726225f, 34.650993f)
generalPath!!.curveTo(14.726224f, 34.77558f, 14.687451f, 34.872513f, 14.609907f, 34.941788f)
generalPath!!.curveTo(14.532362f, 35.010544f, 14.423023f, 35.04492f, 14.281892f, 35.04492f)
generalPath!!.curveTo(14.233297f, 35.04492f, 14.183668f, 35.040787f, 14.133006f, 35.032516f)
generalPath!!.curveTo(14.08286f, 35.024242f, 14.030904f, 35.011837f, 13.97714f, 34.995293f)
generalPath!!.lineTo(13.97714f, 34.837875f)
generalPath!!.curveTo(14.023667f, 34.86321f, 14.071745f, 34.882076f, 14.121374f, 34.894485f)
generalPath!!.curveTo(14.171002f, 34.90689f, 14.223474f, 34.913097f, 14.27879f, 34.913097f)
generalPath!!.curveTo(14.368225f, 34.913097f, 14.439049f, 34.889572f, 14.491263f, 34.84253f)
generalPath!!.curveTo(14.543476f, 34.795486f, 14.569583f, 34.73164f, 14.569584f, 34.650993f)
generalPath!!.curveTo(14.569583f, 34.570347f, 14.543476f, 34.5065f, 14.491263f, 34.459457f)
generalPath!!.curveTo(14.439049f, 34.412415f, 14.368225f, 34.388893f, 14.27879f, 34.388893f)
generalPath!!.curveTo(14.236915f, 34.388893f, 14.195041f, 34.393543f, 14.153167f, 34.40285f)
generalPath!!.curveTo(14.11181f, 34.412155f, 14.069418f, 34.426632f, 14.025993f, 34.446274f)
generalPath!!.lineTo(14.025993f, 33.86469f)
generalPath!!.moveTo(15.03718f, 33.86469f)
generalPath!!.lineTo(15.652112f, 33.86469f)
generalPath!!.lineTo(15.652112f, 33.996513f)
generalPath!!.lineTo(15.180638f, 33.996513f)
generalPath!!.lineTo(15.180638f, 34.28033f)
generalPath!!.curveTo(15.203384f, 34.272575f, 15.226131f, 34.266888f, 15.248878f, 34.263268f)
generalPath!!.curveTo(15.271624f, 34.259132f, 15.29437f, 34.257065f, 15.317117f, 34.257065f)
generalPath!!.curveTo(15.446359f, 34.257065f, 15.548718f, 34.292477f, 15.624196f, 34.3633f)
generalPath!!.curveTo(15.699672f, 34.434128f, 15.73741f, 34.530025f, 15.737411f, 34.650993f)
generalPath!!.curveTo(15.73741f, 34.77558f, 15.698638f, 34.872513f, 15.621094f, 34.941788f)
generalPath!!.curveTo(15.543548f, 35.010544f, 15.43421f, 35.04492f, 15.293078f, 35.04492f)
generalPath!!.curveTo(15.244483f, 35.04492f, 15.194855f, 35.040787f, 15.144192f, 35.032516f)
generalPath!!.curveTo(15.094046f, 35.024242f, 15.042091f, 35.011837f, 14.988327f, 34.995293f)
generalPath!!.lineTo(14.988327f, 34.837875f)
generalPath!!.curveTo(15.034854f, 34.86321f, 15.082931f, 34.882076f, 15.13256f, 34.894485f)
generalPath!!.curveTo(15.182189f, 34.90689f, 15.234661f, 34.913097f, 15.289977f, 34.913097f)
generalPath!!.curveTo(15.379411f, 34.913097f, 15.450236f, 34.889572f, 15.50245f, 34.84253f)
generalPath!!.curveTo(15.554663f, 34.795486f, 15.58077f, 34.73164f, 15.58077f, 34.650993f)
generalPath!!.curveTo(15.58077f, 34.570347f, 15.554663f, 34.5065f, 15.50245f, 34.459457f)
generalPath!!.curveTo(15.450236f, 34.412415f, 15.379411f, 34.388893f, 15.289977f, 34.388893f)
generalPath!!.curveTo(15.248102f, 34.388893f, 15.206228f, 34.393543f, 15.164354f, 34.40285f)
generalPath!!.curveTo(15.122996f, 34.412155f, 15.080605f, 34.426632f, 15.03718f, 34.446274f)
generalPath!!.lineTo(15.03718f, 33.86469f)
generalPath!!.moveTo(16.007269f, 33.86469f)
generalPath!!.lineTo(16.7517f, 33.86469f)
generalPath!!.lineTo(16.7517f, 33.931377f)
generalPath!!.lineTo(16.331406f, 35.022434f)
generalPath!!.lineTo(16.167786f, 35.022434f)
generalPath!!.lineTo(16.563265f, 33.996513f)
generalPath!!.lineTo(16.007269f, 33.996513f)
generalPath!!.lineTo(16.007269f, 33.86469f)
generalPath!!.moveTo(17.565147f, 33.86469f)
generalPath!!.lineTo(18.180079f, 33.86469f)
generalPath!!.lineTo(18.180079f, 33.996513f)
generalPath!!.lineTo(17.708605f, 33.996513f)
generalPath!!.lineTo(17.708605f, 34.28033f)
generalPath!!.curveTo(17.731352f, 34.272575f, 17.754097f, 34.266888f, 17.776844f, 34.263268f)
generalPath!!.curveTo(17.79959f, 34.259132f, 17.822336f, 34.257065f, 17.845083f, 34.257065f)
generalPath!!.curveTo(17.974325f, 34.257065f, 18.076685f, 34.292477f, 18.152163f, 34.3633f)
generalPath!!.curveTo(18.227638f, 34.434128f, 18.265377f, 34.530025f, 18.265379f, 34.650993f)
generalPath!!.curveTo(18.265377f, 34.77558f, 18.226604f, 34.872513f, 18.14906f, 34.941788f)
generalPath!!.curveTo(18.071514f, 35.010544f, 17.962175f, 35.04492f, 17.821045f, 35.04492f)
generalPath!!.curveTo(17.77245f, 35.04492f, 17.72282f, 35.040787f, 17.67216f, 35.032516f)
generalPath!!.curveTo(17.622013f, 35.024242f, 17.570059f, 35.011837f, 17.516293f, 34.995293f)
generalPath!!.lineTo(17.516293f, 34.837875f)
generalPath!!.curveTo(17.56282f, 34.86321f, 17.610897f, 34.882076f, 17.660526f, 34.894485f)
generalPath!!.curveTo(17.710155f, 34.90689f, 17.762627f, 34.913097f, 17.817944f, 34.913097f)
generalPath!!.curveTo(17.907377f, 34.913097f, 17.978203f, 34.889572f, 18.030416f, 34.84253f)
generalPath!!.curveTo(18.082628f, 34.795486f, 18.108736f, 34.73164f, 18.108738f, 34.650993f)
generalPath!!.curveTo(18.108736f, 34.570347f, 18.082628f, 34.5065f, 18.030416f, 34.459457f)
generalPath!!.curveTo(17.978203f, 34.412415f, 17.907377f, 34.388893f, 17.817944f, 34.388893f)
generalPath!!.curveTo(17.77607f, 34.388893f, 17.734194f, 34.393543f, 17.69232f, 34.40285f)
generalPath!!.curveTo(17.650963f, 34.412155f, 17.608572f, 34.426632f, 17.565147f, 34.446274f)
generalPath!!.lineTo(17.565147f, 33.86469f)
generalPath!!.moveTo(18.601923f, 34.89061f)
generalPath!!.lineTo(18.85782f, 34.89061f)
generalPath!!.lineTo(18.85782f, 34.00737f)
generalPath!!.lineTo(18.579435f, 34.0632f)
generalPath!!.lineTo(18.579435f, 33.92052f)
generalPath!!.lineTo(18.856272f, 33.86469f)
generalPath!!.lineTo(19.01291f, 33.86469f)
generalPath!!.lineTo(19.01291f, 34.89061f)
generalPath!!.lineTo(19.26881f, 34.89061f)
generalPath!!.lineTo(19.26881f, 35.022434f)
generalPath!!.lineTo(18.601923f, 35.022434f)
generalPath!!.lineTo(18.601923f, 34.89061f)
generalPath!!.moveTo(19.920963f, 33.967823f)
generalPath!!.curveTo(19.840317f, 33.967823f, 19.779572f, 34.00763f, 19.738731f, 34.087242f)
generalPath!!.curveTo(19.698408f, 34.16634f, 19.678247f, 34.2855f, 19.678247f, 34.444725f)
generalPath!!.curveTo(19.678247f, 34.60343f, 19.698408f, 34.722595f, 19.738731f, 34.802204f)
generalPath!!.curveTo(19.779572f, 34.8813f, 19.840317f, 34.92085f, 19.920963f, 34.92085f)
generalPath!!.curveTo(20.002127f, 34.92085f, 20.06287f, 34.8813f, 20.103193f, 34.802204f)
generalPath!!.curveTo(20.144033f, 34.722595f, 20.164454f, 34.60343f, 20.164454f, 34.444725f)
generalPath!!.curveTo(20.164454f, 34.2855f, 20.144033f, 34.16634f, 20.103193f, 34.087242f)
generalPath!!.curveTo(20.06287f, 34.00763f, 20.002127f, 33.967823f, 19.920963f, 33.967823f)
generalPath!!.moveTo(19.920963f, 33.84375f)
generalPath!!.curveTo(20.05072f, 33.843754f, 20.14972f, 33.89519f, 20.21796f, 33.998066f)
generalPath!!.curveTo(20.286716f, 34.100426f, 20.321095f, 34.249313f, 20.321095f, 34.444725f)
generalPath!!.curveTo(20.321095f, 34.63962f, 20.286716f, 34.788506f, 20.21796f, 34.891384f)
generalPath!!.curveTo(20.14972f, 34.993744f, 20.05072f, 35.04492f, 19.920963f, 35.04492f)
generalPath!!.curveTo(19.791204f, 35.04492f, 19.691948f, 34.993744f, 19.62319f, 34.891384f)
generalPath!!.curveTo(19.55495f, 34.788506f, 19.52083f, 34.63962f, 19.52083f, 34.444725f)
generalPath!!.curveTo(19.52083f, 34.249313f, 19.55495f, 34.100426f, 19.62319f, 33.998066f)
generalPath!!.curveTo(19.691948f, 33.89519f, 19.791204f, 33.843754f, 19.920963f, 33.84375f)
generalPath!!.moveTo(20.951536f, 34.381138f)
generalPath!!.curveTo(20.881227f, 34.381138f, 20.825396f, 34.405178f, 20.784039f, 34.453255f)
generalPath!!.curveTo(20.743198f, 34.50133f, 20.722778f, 34.567245f, 20.722778f, 34.650993f)
generalPath!!.curveTo(20.722778f, 34.734226f, 20.743198f, 34.80014f, 20.784039f, 34.848732f)
generalPath!!.curveTo(20.825396f, 34.896812f, 20.881227f, 34.92085f, 20.951536f, 34.92085f)
generalPath!!.curveTo(21.021843f, 34.92085f, 21.077417f, 34.896812f, 21.118258f, 34.848732f)
generalPath!!.curveTo(21.159615f, 34.80014f, 21.180292f, 34.734226f, 21.180294f, 34.650993f)
generalPath!!.curveTo(21.180292f, 34.567245f, 21.159615f, 34.50133f, 21.118258f, 34.453255f)
generalPath!!.curveTo(21.077417f, 34.405178f, 21.021843f, 34.381138f, 20.951536f, 34.381138f)
generalPath!!.moveTo(21.262491f, 33.890278f)
generalPath!!.lineTo(21.262491f, 34.03296f)
generalPath!!.curveTo(21.223202f, 34.01435f, 21.183395f, 34.000134f, 21.143072f, 33.99031f)
generalPath!!.curveTo(21.103266f, 33.980488f, 21.063717f, 33.97558f, 21.024427f, 33.97558f)
generalPath!!.curveTo(20.921036f, 33.97558f, 20.84194f, 34.01047f, 20.787142f, 34.08026f)
generalPath!!.curveTo(20.732859f, 34.150055f, 20.701841f, 34.255516f, 20.694086f, 34.396645f)
generalPath!!.curveTo(20.724586f, 34.35167f, 20.762842f, 34.31729f, 20.808853f, 34.29351f)
generalPath!!.curveTo(20.854862f, 34.269215f, 20.905525f, 34.257065f, 20.96084f, 34.257065f)
generalPath!!.curveTo(21.077158f, 34.257065f, 21.16892f, 34.292477f, 21.236126f, 34.3633f)
generalPath!!.curveTo(21.303848f, 34.43361f, 21.33771f, 34.529507f, 21.33771f, 34.650993f)
generalPath!!.curveTo(21.33771f, 34.769897f, 21.302555f, 34.865276f, 21.232248f, 34.937134f)
generalPath!!.curveTo(21.161942f, 35.00899f, 21.06837f, 35.04492f, 20.951536f, 35.04492f)
generalPath!!.curveTo(20.81764f, 35.04492f, 20.715282f, 34.993744f, 20.644459f, 34.891384f)
generalPath!!.curveTo(20.573633f, 34.788506f, 20.538221f, 34.63962f, 20.538221f, 34.444725f)
generalPath!!.curveTo(20.538221f, 34.26172f, 20.581646f, 34.115932f, 20.668497f, 34.00737f)
generalPath!!.curveTo(20.755346f, 33.898293f, 20.871923f, 33.843754f, 21.018225f, 33.84375f)
generalPath!!.curveTo(21.057514f, 33.843754f, 21.097061f, 33.84763f, 21.13687f, 33.85538f)
generalPath!!.curveTo(21.17719f, 33.863136f, 21.219065f, 33.87477f, 21.262491f, 33.890278f)
generalPath!!.moveTo(22.115486f, 33.86469f)
generalPath!!.lineTo(22.730417f, 33.86469f)
generalPath!!.lineTo(22.730417f, 33.996513f)
generalPath!!.lineTo(22.258944f, 33.996513f)
generalPath!!.lineTo(22.258944f, 34.28033f)
generalPath!!.curveTo(22.28169f, 34.272575f, 22.304438f, 34.266888f, 22.327185f, 34.263268f)
generalPath!!.curveTo(22.34993f, 34.259132f, 22.372677f, 34.257065f, 22.395424f, 34.257065f)
generalPath!!.curveTo(22.524666f, 34.257065f, 22.627024f, 34.292477f, 22.702501f, 34.3633f)
generalPath!!.curveTo(22.777979f, 34.434128f, 22.815718f, 34.530025f, 22.815718f, 34.650993f)
generalPath!!.curveTo(22.815718f, 34.77558f, 22.776943f, 34.872513f, 22.6994f, 34.941788f)
generalPath!!.curveTo(22.621855f, 35.010544f, 22.512516f, 35.04492f, 22.371386f, 35.04492f)
generalPath!!.curveTo(22.322788f, 35.04492f, 22.27316f, 35.040787f, 22.222498f, 35.032516f)
generalPath!!.curveTo(22.172352f, 35.024242f, 22.120398f, 35.011837f, 22.066633f, 34.995293f)
generalPath!!.lineTo(22.066633f, 34.837875f)
generalPath!!.curveTo(22.11316f, 34.86321f, 22.161238f, 34.882076f, 22.210867f, 34.894485f)
generalPath!!.curveTo(22.260494f, 34.90689f, 22.312967f, 34.913097f, 22.368282f, 34.913097f)
generalPath!!.curveTo(22.457718f, 34.913097f, 22.528542f, 34.889572f, 22.580755f, 34.84253f)
generalPath!!.curveTo(22.632969f, 34.795486f, 22.659077f, 34.73164f, 22.659077f, 34.650993f)
generalPath!!.curveTo(22.659077f, 34.570347f, 22.632969f, 34.5065f, 22.580755f, 34.459457f)
generalPath!!.curveTo(22.528542f, 34.412415f, 22.457718f, 34.388893f, 22.368282f, 34.388893f)
generalPath!!.curveTo(22.326408f, 34.388893f, 22.284534f, 34.393543f, 22.24266f, 34.40285f)
generalPath!!.curveTo(22.201302f, 34.412155f, 22.15891f, 34.426632f, 22.115486f, 34.446274f)
generalPath!!.lineTo(22.115486f, 33.86469f)
generalPath!!.moveTo(23.555496f, 34.001167f)
generalPath!!.lineTo(23.160017f, 34.6192f)
generalPath!!.lineTo(23.555496f, 34.6192f)
generalPath!!.lineTo(23.555496f, 34.001167f)
generalPath!!.moveTo(23.514399f, 33.86469f)
generalPath!!.lineTo(23.711363f, 33.86469f)
generalPath!!.lineTo(23.711363f, 34.6192f)
generalPath!!.lineTo(23.876534f, 34.6192f)
generalPath!!.lineTo(23.876534f, 34.749477f)
generalPath!!.lineTo(23.711363f, 34.749477f)
generalPath!!.lineTo(23.711363f, 35.022434f)
generalPath!!.lineTo(23.555496f, 35.022434f)
generalPath!!.lineTo(23.555496f, 34.749477f)
generalPath!!.lineTo(23.032843f, 34.749477f)
generalPath!!.lineTo(23.032843f, 34.598263f)
generalPath!!.lineTo(23.514399f, 33.86469f)
generalPath!!.moveTo(24.471304f, 33.967823f)
generalPath!!.curveTo(24.390656f, 33.967823f, 24.329912f, 34.00763f, 24.289072f, 34.087242f)
generalPath!!.curveTo(24.248749f, 34.16634f, 24.228586f, 34.2855f, 24.228586f, 34.444725f)
generalPath!!.curveTo(24.228586f, 34.60343f, 24.248749f, 34.722595f, 24.289072f, 34.802204f)
generalPath!!.curveTo(24.329912f, 34.8813f, 24.390656f, 34.92085f, 24.471304f, 34.92085f)
generalPath!!.curveTo(24.552465f, 34.92085f, 24.61321f, 34.8813f, 24.653534f, 34.802204f)
generalPath!!.curveTo(24.694372f, 34.722595f, 24.714792f, 34.60343f, 24.714794f, 34.444725f)
generalPath!!.curveTo(24.714792f, 34.2855f, 24.694372f, 34.16634f, 24.653534f, 34.087242f)
generalPath!!.curveTo(24.61321f, 34.00763f, 24.552465f, 33.967823f, 24.471304f, 33.967823f)
generalPath!!.moveTo(24.471304f, 33.84375f)
generalPath!!.curveTo(24.60106f, 33.843754f, 24.70006f, 33.89519f, 24.7683f, 33.998066f)
generalPath!!.curveTo(24.837055f, 34.100426f, 24.871433f, 34.249313f, 24.871435f, 34.444725f)
generalPath!!.curveTo(24.871433f, 34.63962f, 24.837055f, 34.788506f, 24.7683f, 34.891384f)
generalPath!!.curveTo(24.70006f, 34.993744f, 24.60106f, 35.04492f, 24.471304f, 35.04492f)
generalPath!!.curveTo(24.341543f, 35.04492f, 24.242287f, 34.993744f, 24.17353f, 34.891384f)
generalPath!!.curveTo(24.10529f, 34.788506f, 24.07117f, 34.63962f, 24.07117f, 34.444725f)
generalPath!!.curveTo(24.07117f, 34.249313f, 24.10529f, 34.100426f, 24.17353f, 33.998066f)
generalPath!!.curveTo(24.242287f, 33.89519f, 24.341543f, 33.843754f, 24.471304f, 33.84375f)
generalPath!!.moveTo(25.501875f, 34.381138f)
generalPath!!.curveTo(25.431566f, 34.381138f, 25.375734f, 34.405178f, 25.334377f, 34.453255f)
generalPath!!.curveTo(25.293537f, 34.50133f, 25.273117f, 34.567245f, 25.273117f, 34.650993f)
generalPath!!.curveTo(25.273117f, 34.734226f, 25.293537f, 34.80014f, 25.334377f, 34.848732f)
generalPath!!.curveTo(25.375734f, 34.896812f, 25.431566f, 34.92085f, 25.501875f, 34.92085f)
generalPath!!.curveTo(25.572182f, 34.92085f, 25.627754f, 34.896812f, 25.668596f, 34.848732f)
generalPath!!.curveTo(25.709953f, 34.80014f, 25.730633f, 34.734226f, 25.730633f, 34.650993f)
generalPath!!.curveTo(25.730633f, 34.567245f, 25.709953f, 34.50133f, 25.668596f, 34.453255f)
generalPath!!.curveTo(25.627754f, 34.405178f, 25.572182f, 34.381138f, 25.501875f, 34.381138f)
generalPath!!.moveTo(25.81283f, 33.890278f)
generalPath!!.lineTo(25.81283f, 34.03296f)
generalPath!!.curveTo(25.77354f, 34.01435f, 25.733734f, 34.000134f, 25.69341f, 33.99031f)
generalPath!!.curveTo(25.653605f, 33.980488f, 25.614056f, 33.97558f, 25.574766f, 33.97558f)
generalPath!!.curveTo(25.471373f, 33.97558f, 25.392277f, 34.01047f, 25.337479f, 34.08026f)
generalPath!!.curveTo(25.283197f, 34.150055f, 25.25218f, 34.255516f, 25.244425f, 34.396645f)
generalPath!!.curveTo(25.274925f, 34.35167f, 25.313183f, 34.31729f, 25.359192f, 34.29351f)
generalPath!!.curveTo(25.405203f, 34.269215f, 25.455864f, 34.257065f, 25.51118f, 34.257065f)
generalPath!!.curveTo(25.627497f, 34.257065f, 25.719257f, 34.292477f, 25.786465f, 34.3633f)
generalPath!!.curveTo(25.854187f, 34.43361f, 25.888048f, 34.529507f, 25.888048f, 34.650993f)
generalPath!!.curveTo(25.888048f, 34.769897f, 25.852894f, 34.865276f, 25.782587f, 34.937134f)
generalPath!!.curveTo(25.712278f, 35.00899f, 25.61871f, 35.04492f, 25.501875f, 35.04492f)
generalPath!!.curveTo(25.36798f, 35.04492f, 25.265621f, 34.993744f, 25.194798f, 34.891384f)
generalPath!!.curveTo(25.123972f, 34.788506f, 25.08856f, 34.63962f, 25.08856f, 34.444725f)
generalPath!!.curveTo(25.08856f, 34.26172f, 25.131985f, 34.115932f, 25.218836f, 34.00737f)
generalPath!!.curveTo(25.305687f, 33.898293f, 25.42226f, 33.843754f, 25.568563f, 33.84375f)
generalPath!!.curveTo(25.607853f, 33.843754f, 25.6474f, 33.84763f, 25.687206f, 33.85538f)
generalPath!!.curveTo(25.72753f, 33.863136f, 25.769403f, 33.87477f, 25.81283f, 33.890278f)
generalPath!!.moveTo(26.665827f, 33.86469f)
generalPath!!.lineTo(27.280758f, 33.86469f)
generalPath!!.lineTo(27.280758f, 33.996513f)
generalPath!!.lineTo(26.809284f, 33.996513f)
generalPath!!.lineTo(26.809284f, 34.28033f)
generalPath!!.curveTo(26.83203f, 34.272575f, 26.854776f, 34.266888f, 26.877523f, 34.263268f)
generalPath!!.curveTo(26.90027f, 34.259132f, 26.923016f, 34.257065f, 26.945763f, 34.257065f)
generalPath!!.curveTo(27.075005f, 34.257065f, 27.177364f, 34.292477f, 27.252842f, 34.3633f)
generalPath!!.curveTo(27.328318f, 34.434128f, 27.366056f, 34.530025f, 27.366056f, 34.650993f)
generalPath!!.curveTo(27.366056f, 34.77558f, 27.327284f, 34.872513f, 27.24974f, 34.941788f)
generalPath!!.curveTo(27.172194f, 35.010544f, 27.062857f, 35.04492f, 26.921724f, 35.04492f)
generalPath!!.curveTo(26.873129f, 35.04492f, 26.8235f, 35.040787f, 26.772839f, 35.032516f)
generalPath!!.curveTo(26.722692f, 35.024242f, 26.670736f, 35.011837f, 26.616974f, 34.995293f)
generalPath!!.lineTo(26.616974f, 34.837875f)
generalPath!!.curveTo(26.6635f, 34.86321f, 26.711576f, 34.882076f, 26.761206f, 34.894485f)
generalPath!!.curveTo(26.810835f, 34.90689f, 26.863308f, 34.913097f, 26.918623f, 34.913097f)
generalPath!!.curveTo(27.008057f, 34.913097f, 27.078882f, 34.889572f, 27.131096f, 34.84253f)
generalPath!!.curveTo(27.18331f, 34.795486f, 27.209415f, 34.73164f, 27.209415f, 34.650993f)
generalPath!!.curveTo(27.209415f, 34.570347f, 27.18331f, 34.5065f, 27.131096f, 34.459457f)
generalPath!!.curveTo(27.078882f, 34.412415f, 27.008057f, 34.388893f, 26.918623f, 34.388893f)
generalPath!!.curveTo(26.876747f, 34.388893f, 26.834873f, 34.393543f, 26.793f, 34.40285f)
generalPath!!.curveTo(26.751642f, 34.412155f, 26.709251f, 34.426632f, 26.665827f, 34.446274f)
generalPath!!.lineTo(26.665827f, 33.86469f)
generalPath!!.moveTo(28.105837f, 34.001167f)
generalPath!!.lineTo(27.710358f, 34.6192f)
generalPath!!.lineTo(28.105837f, 34.6192f)
generalPath!!.lineTo(28.105837f, 34.001167f)
generalPath!!.moveTo(28.064737f, 33.86469f)
generalPath!!.lineTo(28.261702f, 33.86469f)
generalPath!!.lineTo(28.261702f, 34.6192f)
generalPath!!.lineTo(28.426872f, 34.6192f)
generalPath!!.lineTo(28.426872f, 34.749477f)
generalPath!!.lineTo(28.261702f, 34.749477f)
generalPath!!.lineTo(28.261702f, 35.022434f)
generalPath!!.lineTo(28.105837f, 35.022434f)
generalPath!!.lineTo(28.105837f, 34.749477f)
generalPath!!.lineTo(27.583183f, 34.749477f)
generalPath!!.lineTo(27.583183f, 34.598263f)
generalPath!!.lineTo(28.064737f, 33.86469f)
generalPath!!.moveTo(29.041029f, 34.381138f)
generalPath!!.curveTo(28.97072f, 34.381138f, 28.914888f, 34.405178f, 28.873531f, 34.453255f)
generalPath!!.curveTo(28.832691f, 34.50133f, 28.812271f, 34.567245f, 28.812271f, 34.650993f)
generalPath!!.curveTo(28.812271f, 34.734226f, 28.832691f, 34.80014f, 28.873531f, 34.848732f)
generalPath!!.curveTo(28.914888f, 34.896812f, 28.97072f, 34.92085f, 29.041029f, 34.92085f)
generalPath!!.curveTo(29.111336f, 34.92085f, 29.16691f, 34.896812f, 29.20775f, 34.848732f)
generalPath!!.curveTo(29.249107f, 34.80014f, 29.269787f, 34.734226f, 29.269787f, 34.650993f)
generalPath!!.curveTo(29.269787f, 34.567245f, 29.249107f, 34.50133f, 29.20775f, 34.453255f)
generalPath!!.curveTo(29.16691f, 34.405178f, 29.111336f, 34.381138f, 29.041029f, 34.381138f)
generalPath!!.moveTo(29.351984f, 33.890278f)
generalPath!!.lineTo(29.351984f, 34.03296f)
generalPath!!.curveTo(29.312695f, 34.01435f, 29.272888f, 34.000134f, 29.232565f, 33.99031f)
generalPath!!.curveTo(29.192759f, 33.980488f, 29.15321f, 33.97558f, 29.11392f, 33.97558f)
generalPath!!.curveTo(29.010527f, 33.97558f, 28.93143f, 34.01047f, 28.876633f, 34.08026f)
generalPath!!.curveTo(28.822351f, 34.150055f, 28.791334f, 34.255516f, 28.783579f, 34.396645f)
generalPath!!.curveTo(28.81408f, 34.35167f, 28.852337f, 34.31729f, 28.898346f, 34.29351f)
generalPath!!.curveTo(28.944357f, 34.269215f, 28.995018f, 34.257065f, 29.050335f, 34.257065f)
generalPath!!.curveTo(29.16665f, 34.257065f, 29.258413f, 34.292477f, 29.325619f, 34.3633f)
generalPath!!.curveTo(29.393341f, 34.43361f, 29.427202f, 34.529507f, 29.427202f, 34.650993f)
generalPath!!.curveTo(29.427202f, 34.769897f, 29.392048f, 34.865276f, 29.321741f, 34.937134f)
generalPath!!.curveTo(29.251432f, 35.00899f, 29.157864f, 35.04492f, 29.041029f, 35.04492f)
generalPath!!.curveTo(28.907133f, 35.04492f, 28.804775f, 34.993744f, 28.733952f, 34.891384f)
generalPath!!.curveTo(28.663126f, 34.788506f, 28.627714f, 34.63962f, 28.627714f, 34.444725f)
generalPath!!.curveTo(28.627714f, 34.26172f, 28.671139f, 34.115932f, 28.75799f, 34.00737f)

}

private fun _paint1(g : Graphics2D,origAlpha : Float) {
generalPath!!.curveTo(28.84484f, 33.898293f, 28.961416f, 33.843754f, 29.107718f, 33.84375f)
generalPath!!.curveTo(29.147005f, 33.843754f, 29.186554f, 33.84763f, 29.22636f, 33.85538f)
generalPath!!.curveTo(29.266684f, 33.863136f, 29.308558f, 33.87477f, 29.351984f, 33.890278f)
generalPath!!.moveTo(29.699387f, 33.86469f)
generalPath!!.lineTo(30.314318f, 33.86469f)
generalPath!!.lineTo(30.314318f, 33.996513f)
generalPath!!.lineTo(29.842844f, 33.996513f)
generalPath!!.lineTo(29.842844f, 34.28033f)
generalPath!!.curveTo(29.86559f, 34.272575f, 29.888336f, 34.266888f, 29.911083f, 34.263268f)
generalPath!!.curveTo(29.93383f, 34.259132f, 29.956575f, 34.257065f, 29.979322f, 34.257065f)
generalPath!!.curveTo(30.108564f, 34.257065f, 30.210922f, 34.292477f, 30.286402f, 34.3633f)
generalPath!!.curveTo(30.361877f, 34.434128f, 30.399616f, 34.530025f, 30.399616f, 34.650993f)
generalPath!!.curveTo(30.399616f, 34.77558f, 30.360844f, 34.872513f, 30.283298f, 34.941788f)
generalPath!!.curveTo(30.205753f, 35.010544f, 30.096415f, 35.04492f, 29.955284f, 35.04492f)
generalPath!!.curveTo(29.906689f, 35.04492f, 29.85706f, 35.040787f, 29.806398f, 35.032516f)
generalPath!!.curveTo(29.756252f, 35.024242f, 29.704296f, 35.011837f, 29.650532f, 34.995293f)
generalPath!!.lineTo(29.650532f, 34.837875f)
generalPath!!.curveTo(29.69706f, 34.86321f, 29.745136f, 34.882076f, 29.794765f, 34.894485f)
generalPath!!.curveTo(29.844395f, 34.90689f, 29.896868f, 34.913097f, 29.952183f, 34.913097f)
generalPath!!.curveTo(30.041616f, 34.913097f, 30.11244f, 34.889572f, 30.164656f, 34.84253f)
generalPath!!.curveTo(30.21687f, 34.795486f, 30.242975f, 34.73164f, 30.242975f, 34.650993f)
generalPath!!.curveTo(30.242975f, 34.570347f, 30.21687f, 34.5065f, 30.164656f, 34.459457f)
generalPath!!.curveTo(30.11244f, 34.412415f, 30.041616f, 34.388893f, 29.952183f, 34.388893f)
generalPath!!.curveTo(29.910309f, 34.388893f, 29.868433f, 34.393543f, 29.82656f, 34.40285f)
generalPath!!.curveTo(29.785202f, 34.412155f, 29.742811f, 34.426632f, 29.699387f, 34.446274f)
generalPath!!.lineTo(29.699387f, 33.86469f)
generalPath!!.moveTo(31.175066f, 33.86469f)
generalPath!!.lineTo(31.919498f, 33.86469f)
generalPath!!.lineTo(31.919498f, 33.931377f)
generalPath!!.lineTo(31.499205f, 35.022434f)
generalPath!!.lineTo(31.335585f, 35.022434f)
generalPath!!.lineTo(31.731064f, 33.996513f)
generalPath!!.lineTo(31.175066f, 33.996513f)
generalPath!!.lineTo(31.175066f, 33.86469f)
generalPath!!.moveTo(32.5608f, 33.967823f)
generalPath!!.curveTo(32.48015f, 33.967823f, 32.419407f, 34.00763f, 32.378567f, 34.087242f)
generalPath!!.curveTo(32.33824f, 34.16634f, 32.31808f, 34.2855f, 32.31808f, 34.444725f)
generalPath!!.curveTo(32.31808f, 34.60343f, 32.33824f, 34.722595f, 32.378567f, 34.802204f)
generalPath!!.curveTo(32.419407f, 34.8813f, 32.48015f, 34.92085f, 32.5608f, 34.92085f)
generalPath!!.curveTo(32.64196f, 34.92085f, 32.7027f, 34.8813f, 32.743027f, 34.802204f)
generalPath!!.curveTo(32.783867f, 34.722595f, 32.804287f, 34.60343f, 32.804287f, 34.444725f)
generalPath!!.curveTo(32.804287f, 34.2855f, 32.783867f, 34.16634f, 32.743027f, 34.087242f)
generalPath!!.curveTo(32.7027f, 34.00763f, 32.64196f, 33.967823f, 32.5608f, 33.967823f)
generalPath!!.moveTo(32.5608f, 33.84375f)
generalPath!!.curveTo(32.690556f, 33.843754f, 32.789555f, 33.89519f, 32.857796f, 33.998066f)
generalPath!!.curveTo(32.92655f, 34.100426f, 32.96093f, 34.249313f, 32.96093f, 34.444725f)
generalPath!!.curveTo(32.96093f, 34.63962f, 32.92655f, 34.788506f, 32.857796f, 34.891384f)
generalPath!!.curveTo(32.789555f, 34.993744f, 32.690556f, 35.04492f, 32.5608f, 35.04492f)
generalPath!!.curveTo(32.431038f, 35.04492f, 32.33178f, 34.993744f, 32.263023f, 34.891384f)
generalPath!!.curveTo(32.194782f, 34.788506f, 32.160664f, 34.63962f, 32.160664f, 34.444725f)
generalPath!!.curveTo(32.160664f, 34.249313f, 32.194782f, 34.100426f, 32.263023f, 33.998066f)
generalPath!!.curveTo(32.33178f, 33.89519f, 32.431038f, 33.843754f, 32.5608f, 33.84375f)
generalPath!!.moveTo(33.59137f, 34.381138f)
generalPath!!.curveTo(33.52106f, 34.381138f, 33.465225f, 34.405178f, 33.42387f, 34.453255f)
generalPath!!.curveTo(33.38303f, 34.50133f, 33.36261f, 34.567245f, 33.36261f, 34.650993f)
generalPath!!.curveTo(33.36261f, 34.734226f, 33.38303f, 34.80014f, 33.42387f, 34.848732f)
generalPath!!.curveTo(33.465225f, 34.896812f, 33.52106f, 34.92085f, 33.59137f, 34.92085f)
generalPath!!.curveTo(33.661674f, 34.92085f, 33.717247f, 34.896812f, 33.758087f, 34.848732f)
generalPath!!.curveTo(33.799446f, 34.80014f, 33.820126f, 34.734226f, 33.820126f, 34.650993f)
generalPath!!.curveTo(33.820126f, 34.567245f, 33.799446f, 34.50133f, 33.758087f, 34.453255f)
generalPath!!.curveTo(33.717247f, 34.405178f, 33.661674f, 34.381138f, 33.59137f, 34.381138f)
generalPath!!.moveTo(33.902325f, 33.890278f)
generalPath!!.lineTo(33.902325f, 34.03296f)
generalPath!!.curveTo(33.863033f, 34.01435f, 33.823227f, 34.000134f, 33.782906f, 33.99031f)
generalPath!!.curveTo(33.743095f, 33.980488f, 33.70355f, 33.97558f, 33.66426f, 33.97558f)
generalPath!!.curveTo(33.560867f, 33.97558f, 33.48177f, 34.01047f, 33.42697f, 34.08026f)
generalPath!!.curveTo(33.37269f, 34.150055f, 33.34167f, 34.255516f, 33.33392f, 34.396645f)
generalPath!!.curveTo(33.364418f, 34.35167f, 33.402676f, 34.31729f, 33.448685f, 34.29351f)
generalPath!!.curveTo(33.494694f, 34.269215f, 33.545357f, 34.257065f, 33.600674f, 34.257065f)
generalPath!!.curveTo(33.71699f, 34.257065f, 33.80875f, 34.292477f, 33.875957f, 34.3633f)
generalPath!!.curveTo(33.94368f, 34.43361f, 33.977543f, 34.529507f, 33.977543f, 34.650993f)
generalPath!!.curveTo(33.977543f, 34.769897f, 33.942387f, 34.865276f, 33.87208f, 34.937134f)
generalPath!!.curveTo(33.801773f, 35.00899f, 33.708202f, 35.04492f, 33.59137f, 35.04492f)
generalPath!!.curveTo(33.457474f, 35.04492f, 33.355114f, 34.993744f, 33.28429f, 34.891384f)
generalPath!!.curveTo(33.213467f, 34.788506f, 33.178055f, 34.63962f, 33.178055f, 34.444725f)
generalPath!!.curveTo(33.178055f, 34.26172f, 33.221478f, 34.115932f, 33.308327f, 34.00737f)
generalPath!!.curveTo(33.39518f, 33.898293f, 33.511753f, 33.843754f, 33.658054f, 33.84375f)
generalPath!!.curveTo(33.697346f, 33.843754f, 33.736893f, 33.84763f, 33.7767f, 33.85538f)
generalPath!!.curveTo(33.817024f, 33.863136f, 33.8589f, 33.87477f, 33.902325f, 33.890278f)
generalPath!!.moveTo(34.249725f, 33.86469f)
generalPath!!.lineTo(34.86466f, 33.86469f)
generalPath!!.lineTo(34.86466f, 33.996513f)
generalPath!!.lineTo(34.393185f, 33.996513f)
generalPath!!.lineTo(34.393185f, 34.28033f)
generalPath!!.curveTo(34.41593f, 34.272575f, 34.43868f, 34.266888f, 34.461426f, 34.263268f)
generalPath!!.curveTo(34.48417f, 34.259132f, 34.506916f, 34.257065f, 34.529663f, 34.257065f)
generalPath!!.curveTo(34.658905f, 34.257065f, 34.761265f, 34.292477f, 34.836742f, 34.3633f)
generalPath!!.curveTo(34.912216f, 34.434128f, 34.94996f, 34.530025f, 34.94996f, 34.650993f)
generalPath!!.curveTo(34.94996f, 34.77558f, 34.911182f, 34.872513f, 34.83364f, 34.941788f)
generalPath!!.curveTo(34.756096f, 35.010544f, 34.646755f, 35.04492f, 34.505627f, 35.04492f)
generalPath!!.curveTo(34.45703f, 35.04492f, 34.407402f, 35.040787f, 34.35674f, 35.032516f)
generalPath!!.curveTo(34.30659f, 35.024242f, 34.25464f, 35.011837f, 34.200874f, 34.995293f)
generalPath!!.lineTo(34.200874f, 34.837875f)
generalPath!!.curveTo(34.2474f, 34.86321f, 34.29548f, 34.882076f, 34.345108f, 34.894485f)
generalPath!!.curveTo(34.394733f, 34.90689f, 34.44721f, 34.913097f, 34.50252f, 34.913097f)
generalPath!!.curveTo(34.591957f, 34.913097f, 34.66278f, 34.889572f, 34.714996f, 34.84253f)
generalPath!!.curveTo(34.76721f, 34.795486f, 34.793316f, 34.73164f, 34.793316f, 34.650993f)
generalPath!!.curveTo(34.793316f, 34.570347f, 34.76721f, 34.5065f, 34.714996f, 34.459457f)
generalPath!!.curveTo(34.66278f, 34.412415f, 34.591957f, 34.388893f, 34.50252f, 34.388893f)
generalPath!!.curveTo(34.460648f, 34.388893f, 34.418774f, 34.393543f, 34.3769f, 34.40285f)
generalPath!!.curveTo(34.335545f, 34.412155f, 34.29315f, 34.426632f, 34.249725f, 34.446274f)
generalPath!!.lineTo(34.249725f, 33.86469f)
generalPath!!.moveTo(35.725407f, 33.86469f)
generalPath!!.lineTo(36.469837f, 33.86469f)
generalPath!!.lineTo(36.469837f, 33.931377f)
generalPath!!.lineTo(36.049545f, 35.022434f)
generalPath!!.lineTo(35.885925f, 35.022434f)
generalPath!!.lineTo(36.281403f, 33.996513f)
generalPath!!.lineTo(35.725407f, 33.996513f)
generalPath!!.lineTo(35.725407f, 33.86469f)
generalPath!!.moveTo(37.130524f, 34.381138f)
generalPath!!.curveTo(37.060215f, 34.381138f, 37.00438f, 34.405178f, 36.963024f, 34.453255f)
generalPath!!.curveTo(36.922184f, 34.50133f, 36.901764f, 34.567245f, 36.901764f, 34.650993f)
generalPath!!.curveTo(36.901764f, 34.734226f, 36.922184f, 34.80014f, 36.963024f, 34.848732f)
generalPath!!.curveTo(37.00438f, 34.896812f, 37.060215f, 34.92085f, 37.130524f, 34.92085f)
generalPath!!.curveTo(37.20083f, 34.92085f, 37.2564f, 34.896812f, 37.29724f, 34.848732f)
generalPath!!.curveTo(37.3386f, 34.80014f, 37.35928f, 34.734226f, 37.35928f, 34.650993f)
generalPath!!.curveTo(37.35928f, 34.567245f, 37.3386f, 34.50133f, 37.29724f, 34.453255f)
generalPath!!.curveTo(37.2564f, 34.405178f, 37.20083f, 34.381138f, 37.130524f, 34.381138f)
generalPath!!.moveTo(37.44148f, 33.890278f)
generalPath!!.lineTo(37.44148f, 34.03296f)
generalPath!!.curveTo(37.402187f, 34.01435f, 37.36238f, 34.000134f, 37.32206f, 33.99031f)
generalPath!!.curveTo(37.28225f, 33.980488f, 37.242702f, 33.97558f, 37.203415f, 33.97558f)
generalPath!!.curveTo(37.10002f, 33.97558f, 37.020924f, 34.01047f, 36.966125f, 34.08026f)
generalPath!!.curveTo(36.911842f, 34.150055f, 36.880825f, 34.255516f, 36.873074f, 34.396645f)
generalPath!!.curveTo(36.903572f, 34.35167f, 36.94183f, 34.31729f, 36.98784f, 34.29351f)
generalPath!!.curveTo(37.033848f, 34.269215f, 37.08451f, 34.257065f, 37.139828f, 34.257065f)
generalPath!!.curveTo(37.256145f, 34.257065f, 37.347904f, 34.292477f, 37.41511f, 34.3633f)
generalPath!!.curveTo(37.482834f, 34.43361f, 37.516693f, 34.529507f, 37.516697f, 34.650993f)
generalPath!!.curveTo(37.516693f, 34.769897f, 37.48154f, 34.865276f, 37.411236f, 34.937134f)
generalPath!!.curveTo(37.340927f, 35.00899f, 37.247356f, 35.04492f, 37.130524f, 35.04492f)
generalPath!!.curveTo(36.996628f, 35.04492f, 36.894268f, 34.993744f, 36.823444f, 34.891384f)
generalPath!!.curveTo(36.75262f, 34.788506f, 36.71721f, 34.63962f, 36.71721f, 34.444725f)
generalPath!!.curveTo(36.71721f, 34.26172f, 36.76063f, 34.115932f, 36.84748f, 34.00737f)
generalPath!!.curveTo(36.934334f, 33.898293f, 37.050907f, 33.843754f, 37.19721f, 33.84375f)
generalPath!!.curveTo(37.2365f, 33.843754f, 37.276047f, 33.84763f, 37.315853f, 33.85538f)
generalPath!!.curveTo(37.35618f, 33.863136f, 37.398052f, 33.87477f, 37.44148f, 33.890278f)
generalPath!!.moveTo(37.74778f, 33.86469f)
generalPath!!.lineTo(38.49221f, 33.86469f)
generalPath!!.lineTo(38.49221f, 33.931377f)
generalPath!!.lineTo(38.07192f, 35.022434f)
generalPath!!.lineTo(37.9083f, 35.022434f)
generalPath!!.lineTo(38.303776f, 33.996513f)
generalPath!!.lineTo(37.74778f, 33.996513f)
generalPath!!.lineTo(37.74778f, 33.86469f)
generalPath!!.moveTo(38.803165f, 34.998394f)
generalPath!!.lineTo(38.803165f, 34.855713f)
generalPath!!.curveTo(38.842457f, 34.874325f, 38.882263f, 34.88854f, 38.922585f, 34.89836f)
generalPath!!.curveTo(38.96291f, 34.908184f, 39.002457f, 34.913097f, 39.04123f, 34.913097f)
generalPath!!.curveTo(39.144623f, 34.913097f, 39.22346f, 34.87846f, 39.27774f, 34.809185f)
generalPath!!.curveTo(39.33254f, 34.739395f, 39.363815f, 34.633675f, 39.37157f, 34.492027f)
generalPath!!.curveTo(39.341587f, 34.536488f, 39.30359f, 34.570606f, 39.25758f, 34.594387f)
generalPath!!.curveTo(39.21157f, 34.618168f, 39.16065f, 34.63006f, 39.104816f, 34.63006f)
generalPath!!.curveTo(38.989017f, 34.63006f, 38.897255f, 34.59516f, 38.829533f, 34.52537f)
generalPath!!.curveTo(38.762325f, 34.455063f, 38.728725f, 34.359165f, 38.728725f, 34.23768f)
generalPath!!.curveTo(38.728725f, 34.11878f, 38.763878f, 34.023396f, 38.834187f, 33.951538f)
generalPath!!.curveTo(38.90449f, 33.87968f, 38.998062f, 33.843754f, 39.1149f, 33.84375f)
generalPath!!.curveTo(39.24879f, 33.843754f, 39.35089f, 33.89519f, 39.4212f, 33.998066f)
generalPath!!.curveTo(39.492023f, 34.100426f, 39.527435f, 34.249313f, 39.527435f, 34.444725f)
generalPath!!.curveTo(39.527435f, 34.627213f, 39.484013f, 34.773f, 39.397163f, 34.882076f)
generalPath!!.curveTo(39.310825f, 34.990643f, 39.19451f, 35.04492f, 39.04821f, 35.04492f)
generalPath!!.curveTo(39.00892f, 35.04492f, 38.969112f, 35.041046f, 38.92879f, 35.03329f)
generalPath!!.curveTo(38.888466f, 35.025536f, 38.846592f, 35.013905f, 38.803165f, 34.998394f)
generalPath!!.moveTo(39.1149f, 34.507538f)
generalPath!!.curveTo(39.185204f, 34.507538f, 39.24078f, 34.483498f, 39.28162f, 34.435417f)
generalPath!!.curveTo(39.322975f, 34.38734f, 39.343655f, 34.321426f, 39.343655f, 34.23768f)
generalPath!!.curveTo(39.343655f, 34.15445f, 39.322975f, 34.088795f, 39.28162f, 34.040714f)
generalPath!!.curveTo(39.24078f, 33.992123f, 39.185204f, 33.967823f, 39.1149f, 33.967823f)
generalPath!!.curveTo(39.04459f, 33.967823f, 38.988758f, 33.992123f, 38.9474f, 34.040714f)
generalPath!!.curveTo(38.90656f, 34.088795f, 38.88614f, 34.15445f, 38.88614f, 34.23768f)
generalPath!!.curveTo(38.88614f, 34.321426f, 38.90656f, 34.38734f, 38.9474f, 34.435417f)
generalPath!!.curveTo(38.988758f, 34.483498f, 39.04459f, 34.507538f, 39.1149f, 34.507538f)
generalPath!!.moveTo(39.814354f, 34.998394f)
generalPath!!.lineTo(39.814354f, 34.855713f)
generalPath!!.curveTo(39.85364f, 34.874325f, 39.893448f, 34.88854f, 39.933773f, 34.89836f)
generalPath!!.curveTo(39.974094f, 34.908184f, 40.013645f, 34.913097f, 40.052418f, 34.913097f)
generalPath!!.curveTo(40.155807f, 34.913097f, 40.234646f, 34.87846f, 40.28893f, 34.809185f)
generalPath!!.curveTo(40.343727f, 34.739395f, 40.375004f, 34.633675f, 40.38276f, 34.492027f)
generalPath!!.curveTo(40.352776f, 34.536488f, 40.314777f, 34.570606f, 40.26877f, 34.594387f)
generalPath!!.curveTo(40.222755f, 34.618168f, 40.171837f, 34.63006f, 40.116005f, 34.63006f)
generalPath!!.curveTo(40.000202f, 34.63006f, 39.90844f, 34.59516f, 39.840717f, 34.52537f)
generalPath!!.curveTo(39.773514f, 34.455063f, 39.73991f, 34.359165f, 39.73991f, 34.23768f)
generalPath!!.curveTo(39.73991f, 34.11878f, 39.775063f, 34.023396f, 39.84537f, 33.951538f)
generalPath!!.curveTo(39.91568f, 33.87968f, 40.00925f, 33.843754f, 40.126083f, 33.84375f)
generalPath!!.curveTo(40.25998f, 33.843754f, 40.36208f, 33.89519f, 40.43239f, 33.998066f)
generalPath!!.curveTo(40.503212f, 34.100426f, 40.538624f, 34.249313f, 40.538624f, 34.444725f)
generalPath!!.curveTo(40.538624f, 34.627213f, 40.495197f, 34.773f, 40.408348f, 34.882076f)
generalPath!!.curveTo(40.322014f, 34.990643f, 40.205696f, 35.04492f, 40.059395f, 35.04492f)
generalPath!!.curveTo(40.020107f, 35.04492f, 39.9803f, 35.041046f, 39.939976f, 35.03329f)
generalPath!!.curveTo(39.899654f, 35.025536f, 39.85778f, 35.013905f, 39.814354f, 34.998394f)
generalPath!!.moveTo(40.126083f, 34.507538f)
generalPath!!.curveTo(40.196392f, 34.507538f, 40.251965f, 34.483498f, 40.292805f, 34.435417f)
generalPath!!.curveTo(40.334164f, 34.38734f, 40.35484f, 34.321426f, 40.354843f, 34.23768f)
generalPath!!.curveTo(40.35484f, 34.15445f, 40.334164f, 34.088795f, 40.292805f, 34.040714f)
generalPath!!.curveTo(40.251965f, 33.992123f, 40.196392f, 33.967823f, 40.126083f, 33.967823f)
generalPath!!.curveTo(40.05578f, 33.967823f, 39.999943f, 33.992123f, 39.958588f, 34.040714f)
generalPath!!.curveTo(39.917747f, 34.088795f, 39.897327f, 34.15445f, 39.897327f, 34.23768f)
generalPath!!.curveTo(39.897327f, 34.321426f, 39.917747f, 34.38734f, 39.958588f, 34.435417f)
generalPath!!.curveTo(39.999943f, 34.483498f, 40.05578f, 34.507538f, 40.126083f, 34.507538f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.6111270189285278f, 0.0f, 0.0f, 0.6111270189285278f, 5.632443904876709f, -67.63530731201172f))
// _0_0_9
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(69.375f, 125.0f)
generalPath!!.curveTo(69.39803f, 130.151f, 66.66322f, 134.92062f, 62.206123f, 137.50279f)
generalPath!!.curveTo(57.74902f, 140.08498f, 52.25098f, 140.08498f, 47.793877f, 137.50279f)
generalPath!!.curveTo(43.336773f, 134.92062f, 40.601963f, 130.151f, 40.625f, 125.0f)
generalPath!!.curveTo(40.601963f, 119.84899f, 43.336773f, 115.07938f, 47.793877f, 112.4972f)
generalPath!!.curveTo(52.25098f, 109.91502f, 57.74902f, 109.91502f, 62.206123f, 112.4972f)
generalPath!!.curveTo(66.66322f, 115.07938f, 69.39803f, 119.84899f, 69.375f, 125.0f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(55.0, 125.0), 14.375f, Point2D.Double(55.0, 125.0), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 245, 32, 227)) ?: Color(255, 245, 32, 227)),(colorFilter?.filter(Color(255, 243, 0, 0)) ?: Color(255, 243, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
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
_paint1(g, origAlpha)


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
            return 2.0534627437591553
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
            return 45.946537017822266
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 41.51675033569336
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Contact_new(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Contact_new(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Contact_new(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

