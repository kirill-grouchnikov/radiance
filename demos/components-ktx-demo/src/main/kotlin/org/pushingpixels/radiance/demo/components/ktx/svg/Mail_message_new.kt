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
class Mail_message_new private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 0.402f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
shape = Rectangle2D.Double(9.256999969482422, 37.369998931884766, 30.983999252319336, 7.10699987411499)
paint = LinearGradientPaint(Point2D.Double(0.0, 366.6499938964844), Point2D.Double(0.0, 609.510009765625), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0)),(colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.06419999897480011f, 0.0f, 0.0f, 0.02930000051856041f, 1.555999994277954f, 26.645000457763672f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.402f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.24f, 37.38f)
generalPath!!.lineTo(40.24f, 44.487f)
generalPath!!.curveTo(43.544003f, 44.5f, 48.229f, 42.895f, 48.229f, 40.933f)
generalPath!!.curveTo(48.229f, 38.970997f, 44.541f, 37.379997f, 40.24f, 37.379997f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(605.7100219726562, 486.6499938964844), 117.14f, Point2D.Double(605.7100219726562, 486.6499938964844), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.06419999897480011f, 0.0f, 0.0f, 0.02930000051856041f, 1.569000005722046f, 26.645000457763672f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.402f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.257f, 37.38f)
generalPath!!.lineTo(9.257f, 44.487f)
generalPath!!.curveTo(5.953f, 44.5f, 1.2680001f, 42.895f, 1.2680001f, 40.933f)
generalPath!!.curveTo(1.2680001f, 38.970997f, 4.9560003f, 37.379997f, 9.257f, 37.379997f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(605.7100219726562, 486.6499938964844), 117.14f, Point2D.Double(605.7100219726562, 486.6499938964844), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.06419999897480011f, 0.0f, 0.0f, 0.02930000051856041f, 47.92900085449219f, 26.645000457763672f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.333f, 16.972f)
generalPath!!.lineTo(6.333f, 41.482002f)
generalPath!!.lineTo(43.306f, 41.482002f)
generalPath!!.lineTo(43.244f, 17.090002f)
generalPath!!.curveTo(43.241f, 15.712002f, 31.396f, 2.4120016f, 29.214f, 2.4120016f)
generalPath!!.lineTo(20.662f, 2.4120016f)
generalPath!!.curveTo(18.365002f, 2.4120016f, 6.3360004f, 15.674002f, 6.3360004f, 16.972002f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(11.572999954223633, 4.745999813079834), Point2D.Double(18.475000381469727, 26.020000457763672), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(226, 226, 226, 255)) ?: Color(226, 226, 226, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.880000114440918f, 0.3149999976158142f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(2.062000036239624, 0.0), Point2D.Double(30.600000381469727, 0.0), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(152, 150, 144, 255)) ?: Color(152, 150, 144, 255)),(colorFilter?.filter(Color(101, 100, 96, 255)) ?: Color(101, 100, 96, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.880000114440918f, 0.3149999976158142f))
stroke = BasicStroke(0.857f,0,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.333f, 16.972f)
generalPath!!.lineTo(6.333f, 41.482002f)
generalPath!!.lineTo(43.306f, 41.482002f)
generalPath!!.lineTo(43.244f, 17.090002f)
generalPath!!.curveTo(43.241f, 15.712002f, 31.396f, 2.4120016f, 29.214f, 2.4120016f)
generalPath!!.lineTo(20.662f, 2.4120016f)
generalPath!!.curveTo(18.365002f, 2.4120016f, 6.3360004f, 15.674002f, 6.3360004f, 16.972002f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.923f, 16.787f)
generalPath!!.curveTo(6.5249996f, 16.357f, 18.81f, 3.0930004f, 20.667f, 3.0930004f)
generalPath!!.lineTo(29.043f, 3.0930004f)
generalPath!!.curveTo(30.789999f, 3.0930004f, 43.083f, 16.223f, 42.47f, 16.979f)
generalPath!!.lineTo(31.609001f, 30.473999f)
generalPath!!.lineTo(19.295002f, 30.155998f)
generalPath!!.lineTo(6.9230022f, 16.786f)
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(5.827000141143799, 7.230999946594238), Point2D.Double(13.467000007629395, 17.87700080871582), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(237, 237, 237, 255)) ?: Color(237, 237, 237, 255)),(colorFilter?.filter(Color(200, 200, 200, 255)) ?: Color(200, 200, 200, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5706000328063965f, 0.0f, 0.0f, 1.190999984741211f, 2.880000114440918f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.08f, 30.02f)
generalPath!!.lineTo(11.747f, 21.274f)
generalPath!!.lineTo(36.565002f, 14.338f)
generalPath!!.lineTo(39.595f, 20.554f)
generalPath!!.lineTo(32.179f, 29.994f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 37)) ?: Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.292f, 29.836f)
generalPath!!.lineTo(10.809f, 21.026001f)
generalPath!!.lineTo(35.457f, 14.133001f)
generalPath!!.lineTo(38.631f, 20.404001f)
generalPath!!.lineTo(31.39f, 29.811f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 37)) ?: Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.775f, 29.957f)
generalPath!!.lineTo(11.099999f, 21.297f)
generalPath!!.lineTo(36.068f, 14.227001f)
generalPath!!.lineTo(39.354f, 20.820002f)
generalPath!!.lineTo(31.874f, 29.927002f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 37)) ?: Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.594f, 30.441f)
generalPath!!.lineTo(11.261f, 21.695f)
generalPath!!.lineTo(35.973f, 14.801f)
generalPath!!.lineTo(39.083f, 21.189f)
generalPath!!.lineTo(31.963001f, 30.175f)
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(10.184000015258789, 15.149999618530273), Point2D.Double(15.310999870300293, 29.569000244140625), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(220, 220, 220, 255)) ?: Color(220, 220, 220, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.8193000555038452f, 0.0f, 0.0f, 1.0282000303268433f, 2.880000114440918f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_7_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.488f, 29.06f)
generalPath!!.lineTo(7.092001f, 40.031998f)
generalPath!!.lineTo(21.001001f, 30.427998f)
generalPath!!.lineTo(30.021002f, 30.427998f)
generalPath!!.lineTo(42.441f, 39.909996f)
generalPath!!.lineTo(30.577002f, 29.059996f)
generalPath!!.lineTo(20.487001f, 29.059996f)
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.916000366210938, 37.20000076293945), Point2D.Double(9.88599967956543, 52.09000015258789), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(154, 162, 154, 255)) ?: Color(154, 162, 154, 255)),(colorFilter?.filter(Color(181, 190, 181, 255)) ?: Color(181, 190, 181, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.880000114440918f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_7_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.963f, 16.885f)
generalPath!!.lineTo(18.479f, 31.201f)
generalPath!!.lineTo(19.547f, 30.347f)
generalPath!!.lineTo(6.9630013f, 16.885f)
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.916000366210938, 37.20000076293945), Point2D.Double(9.88599967956543, 52.09000015258789), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(154, 162, 154, 255)) ?: Color(154, 162, 154, 255)),(colorFilter?.filter(Color(181, 190, 181, 255)) ?: Color(181, 190, 181, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.880000114440918f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_8
paint = LinearGradientPaint(Point2D.Double(11.232999801635742, 13.685999870300293), Point2D.Double(21.110000610351562, 24.1299991607666), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(237, 237, 237, 255)) ?: Color(237, 237, 237, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.37090003490448f, 0.0f, 0.0f, 1.4437999725341797f, 2.430999994277954f, -0.14100000262260437f))
stroke = BasicStroke(0.857f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.308f, 17.13f)
generalPath!!.lineTo(7.339f, 40.339996f)
generalPath!!.lineTo(42.284f, 40.339996f)
generalPath!!.lineTo(42.221f, 17.259996f)
generalPath!!.curveTo(42.219f, 16.509996f, 31.005001f, 3.4609966f, 28.837002f, 3.4609966f)
generalPath!!.lineTo(20.942001f, 3.4609966f)
generalPath!!.curveTo(18.689001f, 3.4609966f, 7.307001f, 16.352997f, 7.3080015f, 17.132996f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_9_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.957f, 30.453f)
generalPath!!.lineTo(9.016001f, 38.724f)
generalPath!!.lineTo(11.235001f, 38.73f)
generalPath!!.lineTo(21.233002f, 31.861f)
generalPath!!.lineTo(30.055f, 30.438f)
generalPath!!.lineTo(20.955f, 30.453f)
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_9_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.428f, 21.67f)
generalPath!!.lineTo(12.752001f, 23.081f)
generalPath!!.lineTo(35.543f, 16.196999f)
generalPath!!.lineTo(38.458f, 21.878998f)
generalPath!!.lineTo(39.072f, 21.166998f)
generalPath!!.lineTo(36.003f, 14.788998f)
generalPath!!.lineTo(11.427998f, 21.669998f)
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(13.308f, 23.636f)
generalPath!!.lineTo(19.338f, 30.09f)
generalPath!!.lineTo(20.535f, 29.064f)
generalPath!!.lineTo(30.625f, 29.106998f)
generalPath!!.lineTo(31.437f, 29.833998f)
generalPath!!.lineTo(35.412f, 25.089998f)
generalPath!!.curveTo(34.258f, 23.678999f, 13.311998f, 23.635998f, 13.311998f, 23.635998f)
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.779999732971191, 37.78499984741211), Point2D.Double(9.76200008392334, 32.20000076293945), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 33)) ?: Color(0, 0, 0, 33)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.39490008354187f, 0.0f, 0.0f, 0.7810999751091003f, 2.880000114440918f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_11
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(41.813f, 17.848f)
generalPath!!.lineTo(31.861f, 30.479f)
generalPath!!.lineTo(30.793f, 29.624f)
generalPath!!.lineTo(41.813f, 17.848f)
shape = generalPath
paint = colorFilter?.filter(Color(177, 177, 177, 255)) ?: Color(177, 177, 177, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_12
shape = Ellipse2D.Double(25.48000144958496, 0.0, 22.520000457763672, 22.520000457763672)
paint = RadialGradientPaint(Point2D.Double(36.7400016784668, 11.258999824523926), 11.26f, Point2D.Double(36.7400016784668, 11.258999824523926), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 245, 32, 227)) ?: Color(255, 245, 32, 227)),(colorFilter?.filter(Color(255, 243, 0, 0)) ?: Color(255, 243, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
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
            return 1.2680001258850098
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
            return 46.731998443603516
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.5
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Mail_message_new(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Mail_message_new(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Mail_message_new(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

