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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Edit_clear private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 0.47368422f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.4357800483703613f, 0.0f, 0.0f, 0.8257039785385132f, -5.050459861755371f, 13.431819915771484f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(38.142857f, 30.857143f)
generalPath!!.curveTo(38.16781f, 34.491642f, 35.205383f, 37.857037f, 30.377314f, 39.678993f)
generalPath!!.curveTo(25.549248f, 41.500954f, 19.593609f, 41.500954f, 14.765542f, 39.678993f)
generalPath!!.curveTo(9.937474f, 37.857037f, 6.9750466f, 34.491642f, 7.0f, 30.857143f)
generalPath!!.curveTo(6.9750466f, 27.222643f, 9.937474f, 23.85725f, 14.765542f, 22.035294f)
generalPath!!.curveTo(19.593609f, 20.213335f, 25.549248f, 20.213335f, 30.377314f, 22.035294f)
generalPath!!.curveTo(35.205383f, 23.85725f, 38.16781f, 27.222643f, 38.142857f, 30.857143f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(22.571428298950195, 30.85714340209961), 15.571428f, Point2D.Double(22.571428298950195, 30.85714340209961), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.6513760089874268f, 4.792387901721585E-15f, 10.757539749145508f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.9163117f, 1.7780186f)
generalPath!!.curveTo(8.646088f, 0.8999591f, 11.042237f, 1.7815151f, 11.928102f, 3.3353386f)
generalPath!!.lineTo(16.098341f, 12.820053f)
generalPath!!.curveTo(16.984205f, 14.373873f, 16.731756f, 16.189358f, 15.532312f, 16.890638f)
generalPath!!.curveTo(14.332867f, 17.591923f, 12.654079f, 16.90558f, 11.768213f, 15.351758f)
generalPath!!.lineTo(5.84975f, 6.996031f)
generalPath!!.curveTo(4.9638853f, 5.4422064f, 5.2207537f, 2.6387086f, 6.9163117f, 1.7780186f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(12.23343276977539, 12.3632230758667), Point2D.Double(16.870908737182617, 17.11094093322754), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(193, 125, 16, 255)) ?: Color(193, 125, 16, 255)),(colorFilter?.filter(Color(155, 101, 12, 255)) ?: Color(155, 101, 12, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9659259915351868f, 0.26210200786590576f, -0.25881901383399963f, 0.978177011013031f, 2.9570720195770264f, -5.939741134643555f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(143, 89, 2, 255)) ?: Color(143, 89, 2, 255)
stroke = BasicStroke(1.0063211f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.9163117f, 1.7780186f)
generalPath!!.curveTo(8.646088f, 0.8999591f, 11.042237f, 1.7815151f, 11.928102f, 3.3353386f)
generalPath!!.lineTo(16.098341f, 12.820053f)
generalPath!!.curveTo(16.984205f, 14.373873f, 16.731756f, 16.189358f, 15.532312f, 16.890638f)
generalPath!!.curveTo(14.332867f, 17.591923f, 12.654079f, 16.90558f, 11.768213f, 15.351758f)
generalPath!!.lineTo(5.84975f, 6.996031f)
generalPath!!.curveTo(4.9638853f, 5.4422064f, 5.2207537f, 2.6387086f, 6.9163117f, 1.7780186f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.4230769f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = LinearGradientPaint(Point2D.Double(9.56215763092041, 6.952558994293213), Point2D.Double(14.766724586486816, 14.200403213500977), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0056905f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.44627f, 2.7359104f)
generalPath!!.curveTo(8.868223f, 1.9500906f, 10.266975f, 2.5431693f, 11.141568f, 4.0752983f)
generalPath!!.lineTo(15.589706f, 14.162023f)
generalPath!!.lineTo(13.158185f, 15.581885f)
generalPath!!.lineTo(6.861574f, 6.761549f)
generalPath!!.curveTo(5.986981f, 5.2294207f, 5.9853272f, 3.5432765f, 7.44627f, 2.7359104f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(14.780848f, 22.793568f)
generalPath!!.curveTo(13.985353f, 27.080402f, 15.414814f, 36.746067f, 21.040081f, 42.487564f)
generalPath!!.curveTo(25.386835f, 42.628857f, 35.03017f, 39.06988f, 41.571175f, 32.290527f)
generalPath!!.curveTo(32.335f, 27.773815f, 26.034647f, 16.567549f, 21.135868f, 19.007853f)
generalPath!!.lineTo(14.780848f, 22.793568f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(20.764476776123047, 19.540945053100586), 14.799585f, Point2D.Double(20.764476776123047, 19.540945053100586), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(254, 240, 136, 255)) ?: Color(254, 240, 136, 255)),(colorFilter?.filter(Color(253, 230, 58, 255)) ?: Color(253, 230, 58, 255)),(colorFilter?.filter(Color(218, 194, 3, 255)) ?: Color(218, 194, 3, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.449398010969162f, -0.21649199724197388f, 0.5644159913063049f, 1.171617031097412f, -1.4322880506515503f, 2.5461080074310303f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(196, 160, 0, 255)) ?: Color(196, 160, 0, 255)
stroke = BasicStroke(1.0000005f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(14.780848f, 22.793568f)
generalPath!!.curveTo(13.985353f, 27.080402f, 15.414814f, 36.746067f, 21.040081f, 42.487564f)
generalPath!!.curveTo(25.386835f, 42.628857f, 35.03017f, 39.06988f, 41.571175f, 32.290527f)
generalPath!!.curveTo(32.335f, 27.773815f, 26.034647f, 16.567549f, 21.135868f, 19.007853f)
generalPath!!.lineTo(14.780848f, 22.793568f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(9.105389595031738, 38.82814407348633), Point2D.Double(10.146956443786621, 30.140830993652344), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(196, 160, 0, 255)) ?: Color(196, 160, 0, 255)),(colorFilter?.filter(Color(196, 160, 0, 0)) ?: Color(196, 160, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.866025984287262f, -0.5f, 0.7974910140037537f, 1.3812940120697021f, -15.699090003967285f, -9.225098609924316f))
stroke = BasicStroke(0.9999999f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.33836f, 24.367273f)
generalPath!!.curveTo(18.687374f, 30.637545f, 18.827803f, 37.155575f, 23.522142f, 42.28716f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.46153846f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(0.99999976f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(15.91878f, 23.414124f)
generalPath!!.curveTo(15.006687f, 23.922228f, 15.758401f, 35.934338f, 21.503035f, 41.41449f)
generalPath!!.curveTo(28.88902f, 41.227592f, 37.02675f, 35.018303f, 39.895985f, 32.576645f)
generalPath!!.curveTo(30.39657f, 26.592524f, 24.971184f, 17.814877f, 21.415195f, 20.003061f)
generalPath!!.lineTo(15.91878f, 23.414124f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = LinearGradientPaint(Point2D.Double(19.616243362426758, 39.25298309326172), Point2D.Double(18.48598289489746, 29.90907096862793), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(196, 160, 0, 255)) ?: Color(196, 160, 0, 255)),(colorFilter?.filter(Color(196, 160, 0, 0)) ?: Color(196, 160, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.866025984287262f, -0.5f, 0.7979609966278076f, 1.3821099996566772f, -15.729339599609375f, -9.277499198913574f))
stroke = BasicStroke(0.9999997f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(23.848486f, 22.273333f)
generalPath!!.curveTo(24.714846f, 21.524332f, 29.598505f, 28.360998f, 38.846985f, 34.655132f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = LinearGradientPaint(Point2D.Double(15.096997261047363, 36.967769622802734), Point2D.Double(14.045431137084961, 29.0), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(196, 160, 0, 255)) ?: Color(196, 160, 0, 255)),(colorFilter?.filter(Color(196, 160, 0, 0)) ?: Color(196, 160, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.866025984287262f, -0.5f, 0.8434789776802063f, 1.4609479904174805f, -19.740530014038086f, -11.13422966003418f))
stroke = BasicStroke(1.0000002f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.012894f, 22.86392f)
generalPath!!.curveTo(21.725203f, 28.211416f, 20.975883f, 35.288177f, 26.853708f, 40.94503f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = LinearGradientPaint(Point2D.Double(14.045431137084961, 37.575889587402344), Point2D.Double(14.045431137084961, 29.0), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(196, 160, 0, 255)) ?: Color(196, 160, 0, 255)),(colorFilter?.filter(Color(196, 160, 0, 0)) ?: Color(196, 160, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.866025984287262f, -0.5f, 0.8013049960136414f, 1.3878999948501587f, -12.818300247192383f, -11.144559860229492f))
stroke = BasicStroke(1.0000002f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(22.983898f, 22.775822f)
generalPath!!.curveTo(22.983898f, 22.775822f, 31.160627f, 35.84745f, 34.165833f, 37.880383f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
paint = LinearGradientPaint(Point2D.Double(16.928730010986328, 34.010501861572266), Point2D.Double(14.045431137084961, 29.0), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(196, 160, 0, 255)) ?: Color(196, 160, 0, 255)),(colorFilter?.filter(Color(196, 160, 0, 0)) ?: Color(196, 160, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.866025984287262f, -0.5f, 0.8614869713783264f, 1.4921400547027588f, -17.8795108795166f, -13.910849571228027f))
stroke = BasicStroke(1.0000001f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.300308f, 22.200695f)
generalPath!!.curveTo(22.747454f, 25.11751f, 28.002865f, 36.363884f, 30.610323f, 39.678444f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.508945f, 18.061867f)
generalPath!!.lineTo(19.970615f, 11.50296f)
generalPath!!.curveTo(20.569265f, 13.885531f, 19.628777f, 14.743545f, 21.766565f, 18.650673f)
generalPath!!.lineTo(13.856274f, 23.177313f)
generalPath!!.curveTo(12.402846f, 19.699894f, 10.291388f, 19.767015f, 8.508945f, 18.061867f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(11.9966459274292, 19.59173583984375), Point2D.Double(17.774032592773438, 16.234594345092773), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(218, 194, 3, 255)) ?: Color(218, 194, 3, 255)),(colorFilter?.filter(Color(253, 236, 105, 255)) ?: Color(253, 236, 105, 255)),(colorFilter?.filter(Color(253, 239, 126, 255)) ?: Color(253, 239, 126, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0148910284042358f, 0.0f, 0.0f, 1.0059200525283813f, -0.331699013710022f, -0.14018799364566803f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(196, 160, 0, 255)) ?: Color(196, 160, 0, 255)
stroke = BasicStroke(1.0103954f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.508945f, 18.061867f)
generalPath!!.lineTo(19.970615f, 11.50296f)
generalPath!!.curveTo(20.569265f, 13.885531f, 19.628777f, 14.743545f, 21.766565f, 18.650673f)
generalPath!!.lineTo(13.856274f, 23.177313f)
generalPath!!.curveTo(12.402846f, 19.699894f, 10.291388f, 19.767015f, 8.508945f, 18.061867f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.24725272f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(14.043449f, 21.24569f)
generalPath!!.curveTo(13.229488f, 19.824472f, 11.481136f, 19.009348f, 10.36413f, 18.11846f)
generalPath!!.lineTo(19.121552f, 13.184722f)
generalPath!!.curveTo(19.10196f, 14.66569f, 19.688457f, 16.272928f, 19.997164f, 17.703388f)
generalPath!!.lineTo(14.043449f, 21.24569f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.8660249710083008f, -0.5000010132789612f, 0.5f, 0.866025984287262f, 0.0f, 0.0f))
// _0_0_12
shape = RoundRectangle2D.Double(-1.4127867221832275, 24.17477798461914, 13.015023231506348, 3.459890604019165, 1.9999947547912598, 1.9999960660934448)
paint = LinearGradientPaint(Point2D.Double(10.615303993225098, 28.122554779052734), Point2D.Double(2.006974697113037, 27.234832763671875), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(179, 0, 0, 255)) ?: Color(179, 0, 0, 255)),(colorFilter?.filter(Color(255, 92, 92, 255)) ?: Color(255, 92, 92, 255)),(colorFilter?.filter(Color(195, 0, 0, 255)) ?: Color(195, 0, 0, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.1766999959945679f, 2.2371020257157828E-17f, 2.3198430825921146E-17f, 1.1767020225524902f, -0.819769024848938f, -5.3070549964904785f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(105, 0, 0, 255)) ?: Color(105, 0, 0, 255)
stroke = BasicStroke(0.99999803f,1,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(-1.4127867221832275, 24.17477798461914, 13.015023231506348, 3.459890604019165, 1.9999947547912598, 1.9999960660934448)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.5835570096969604f, 0.15636399388313293f, -0.15636399388313293f, 0.5835570096969604f, 20.457820892333984f, 5.158782005310059f))
// _0_0_13
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-17.172594f, 4.083618f)
generalPath!!.curveTo(-17.169153f, 4.8528023f, -17.577536f, 5.565034f, -18.243101f, 5.950622f)
generalPath!!.curveTo(-18.908667f, 6.3362107f, -19.72967f, 6.3362107f, -20.395235f, 5.950622f)
generalPath!!.curveTo(-21.0608f, 5.565034f, -21.469183f, 4.8528023f, -21.465742f, 4.083618f)
generalPath!!.curveTo(-21.469183f, 3.3144343f, -21.0608f, 2.6022027f, -20.395235f, 2.2166142f)
generalPath!!.curveTo(-19.72967f, 1.8310258f, -18.908667f, 1.8310258f, -18.243101f, 2.2166142f)
generalPath!!.curveTo(-17.577536f, 2.6022027f, -17.169153f, 3.3144343f, -17.172594f, 4.083618f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(143, 89, 2, 255)) ?: Color(143, 89, 2, 255)
stroke = BasicStroke(1.6552416f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-17.172594f, 4.083618f)
generalPath!!.curveTo(-17.169153f, 4.8528023f, -17.577536f, 5.565034f, -18.243101f, 5.950622f)
generalPath!!.curveTo(-18.908667f, 6.3362107f, -19.72967f, 6.3362107f, -20.395235f, 5.950622f)
generalPath!!.curveTo(-21.0608f, 5.565034f, -21.469183f, 4.8528023f, -21.465742f, 4.083618f)
generalPath!!.curveTo(-21.469183f, 3.3144343f, -21.0608f, 2.6022027f, -20.395235f, 2.2166142f)
generalPath!!.curveTo(-19.72967f, 1.8310258f, -18.908667f, 1.8310258f, -18.243101f, 2.2166142f)
generalPath!!.curveTo(-17.577536f, 2.6022027f, -17.169153f, 3.3144343f, -17.172594f, 4.083618f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.31730768f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(27.734835f, 40.55524f)
generalPath!!.curveTo(27.734835f, 40.55524f, 29.241419f, 40.054592f, 29.910933f, 39.613483f)
generalPath!!.curveTo(28.673494f, 37.66894f, 26.507591f, 33.71782f, 24.507807f, 30.737564f)
generalPath!!.curveTo(25.70105f, 37.2783f, 27.734835f, 40.55524f, 27.734835f, 40.55524f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.31730768f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.141806f, 39.05827f)
generalPath!!.lineTo(33.167805f, 37.9731f)
generalPath!!.curveTo(31.223259f, 36.116943f, 25.699306f, 27.857203f, 25.699306f, 27.857203f)
generalPath!!.lineTo(31.141806f, 39.05827f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.31730768f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(35.658524f, 36.38781f)
generalPath!!.lineTo(38.094894f, 34.64406f)
generalPath!!.curveTo(34.91291f, 33.318233f, 26.508352f, 24.763609f, 26.508352f, 24.763609f)
generalPath!!.curveTo(28.891289f, 27.775503f, 33.275585f, 33.375916f, 35.658524f, 36.38781f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.31730768f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.15369f, 33.91721f)
generalPath!!.lineTo(40.846f, 32.5077f)
generalPath!!.curveTo(37.53144f, 31.005098f, 28.350325f, 22.595682f, 28.350325f, 22.595682f)
generalPath!!.curveTo(28.350325f, 22.595682f, 34.42491f, 31.795889f, 39.15369f, 33.91721f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.31730765f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_18
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(24.376076f, 41.571705f)
generalPath!!.curveTo(24.376076f, 41.571705f, 25.573301f, 41.292027f, 26.419592f, 41.116085f)
generalPath!!.curveTo(24.961184f, 39.87865f, 22.618504f, 36.67883f, 21.325825f, 32.50533f)
generalPath!!.curveTo(21.856155f, 39.399624f, 24.376076f, 41.571705f, 24.376076f, 41.571705f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.31730765f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_19
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(21.370872f, 41.96945f)
generalPath!!.curveTo(21.370872f, 41.96945f, 22.618893f, 41.955776f, 22.618893f, 41.955776f)
generalPath!!.curveTo(20.320795f, 39.436707f, 19.480717f, 36.590443f, 18.188038f, 32.549526f)
generalPath!!.curveTo(18.055456f, 37.234108f, 21.370872f, 41.96945f, 21.370872f, 41.96945f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
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
            return 4.464073181152344
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.318803071975708
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 43.535926818847656
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 47.38051986694336
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Edit_clear(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Edit_clear(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Edit_clear(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

