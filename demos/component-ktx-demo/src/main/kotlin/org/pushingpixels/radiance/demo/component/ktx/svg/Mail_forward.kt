package org.pushingpixels.radiance.demo.component.ktx.svg

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
class Mail_forward private constructor(private var width: Int, private var height: Int)
       : RadianceIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var colorFilter: RadianceIcon.ColorFilter? = null
    private val transformsStack = Stack<AffineTransform>()

    

	private fun _paint0(g : Graphics2D,origAlpha : Float) {
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0136200189590454f, 0.0f, 0.0f, -1.0136200189590454f, 11.129389762878418f, -8.619853973388672f))
// _0_0_0
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.3f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.596972942352295f, 0.0f, 0.0f, 1.5260640382766724f, 3.9802498817443848f, -19.785049438476562f))
// _0_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(26.5f, 38.7f)
generalPath!!.curveTo(26.522034f, 40.061657f, 23.90613f, 41.322495f, 19.642813f, 42.00509f)
generalPath!!.curveTo(15.379496f, 42.68768f, 10.120504f, 42.68768f, 5.8571877f, 42.00509f)
generalPath!!.curveTo(1.5938711f, 41.322495f, -1.0220345f, 40.061657f, -1.0f, 38.7f)
generalPath!!.curveTo(-1.0220345f, 37.338345f, 1.5938711f, 36.077507f, 5.8571877f, 35.394913f)
generalPath!!.curveTo(10.120504f, 34.712322f, 15.379496f, 34.712322f, 19.642813f, 35.394913f)
generalPath!!.curveTo(23.90613f, 36.077507f, 26.522034f, 37.338345f, 26.5f, 38.7f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(6.7027130126953125, 73.61571502685547), 7.228416f, Point2D.Double(6.7027130126953125, 73.61571502685547), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9022150039672852f, 0.0f, 0.0f, 0.5257030129432678f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0047270059585571f, 0.0f, 0.0f, 1.001608967781067f, 0.042089998722076416f, -8.972783088684082f))
// _0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.34375f, 15.454879f)
generalPath!!.lineTo(6.34375f, 41.44216f)
generalPath!!.lineTo(43.3125f, 41.44216f)
generalPath!!.lineTo(43.25f, 15.554447f)
generalPath!!.curveTo(43.24999f, 15.548732f, 43.250374f, 15.527358f, 43.25f, 15.521258f)
generalPath!!.curveTo(43.249268f, 15.514776f, 43.251087f, 15.494928f, 43.25f, 15.488068f)
generalPath!!.curveTo(43.24856f, 15.480833f, 43.22054f, 15.462487f, 43.21875f, 15.454879f)
generalPath!!.lineTo(6.34375f, 15.454879f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(11.57284164428711, 4.746162414550781), Point2D.Double(18.47528648376465, 26.02290916442871), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(226, 226, 226, 255)) ?: Color(226, 226, 226, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3434749841690063f, 0.0f, 0.0f, 1.5058460235595703f, 2.8795111179351807f, -2.2660179138183594f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 138, 133, 255)) ?: Color(136, 138, 133, 255)
stroke = BasicStroke(0.99684346f,0,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.34375f, 15.454879f)
generalPath!!.lineTo(6.34375f, 41.44216f)
generalPath!!.lineTo(43.3125f, 41.44216f)
generalPath!!.lineTo(43.25f, 15.554447f)
generalPath!!.curveTo(43.24999f, 15.548732f, 43.250374f, 15.527358f, 43.25f, 15.521258f)
generalPath!!.curveTo(43.249268f, 15.514776f, 43.251087f, 15.494928f, 43.25f, 15.488068f)
generalPath!!.curveTo(43.24856f, 15.480833f, 43.22054f, 15.462487f, 43.21875f, 15.454879f)
generalPath!!.lineTo(6.34375f, 15.454879f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.490673f, 29.058712f)
generalPath!!.lineTo(7.09471f, 40.0307f)
generalPath!!.lineTo(21.003551f, 30.426394f)
generalPath!!.lineTo(30.02171f, 30.426394f)
generalPath!!.lineTo(42.440758f, 39.90859f)
generalPath!!.lineTo(30.577332f, 29.058712f)
generalPath!!.lineTo(20.490673f, 29.058712f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(9.164306640625, 38.070892333984375), Point2D.Double(9.885503768920898, 52.09067916870117), floatArrayOf(0.0f,0.23809524f,1.0f), arrayOf((colorFilter?.filter(Color(223, 224, 223, 255)) ?: Color(223, 224, 223, 255)),(colorFilter?.filter(Color(166, 176, 166, 255)) ?: Color(166, 176, 166, 255)),(colorFilter?.filter(Color(181, 190, 181, 255)) ?: Color(181, 190, 181, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547810554504395f, 0.0f, 0.0f, 0.762004017829895f, 2.8817501068115234f, 0.33738601207733154f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2_2
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(0.9968433f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.4471445f, 16.725622f)
generalPath!!.curveTo(7.440469f, 16.738968f, 7.4525223f, 16.74528f, 7.4471445f, 16.757236f)
generalPath!!.curveTo(7.4447837f, 16.762865f, 7.4180174f, 16.783579f, 7.415987f, 16.788853f)
generalPath!!.curveTo(7.4142895f, 16.793766f, 7.417349f, 16.81591f, 7.415987f, 16.820465f)
generalPath!!.curveTo(7.414963f, 16.82466f, 7.416671f, 16.848255f, 7.415987f, 16.852081f)
generalPath!!.lineTo(7.4471445f, 40.341904f)
generalPath!!.lineTo(42.28123f, 40.341904f)
generalPath!!.lineTo(42.218914f, 16.97854f)
generalPath!!.curveTo(42.21823f, 16.974827f, 42.219936f, 16.951012f, 42.218914f, 16.946924f)
generalPath!!.curveTo(42.2043f, 16.898813f, 42.177208f, 16.814676f, 42.125443f, 16.725622f)
generalPath!!.lineTo(7.4471445f, 16.725622f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(23.329298f, 32.99672f)
generalPath!!.curveTo(20.93719f, 32.550377f, 7.9003873f, 18.771126f, 6.596606f, 16.372023f)
generalPath!!.curveTo(6.5816493f, 16.343449f, 6.5559707f, 16.288609f, 6.5446897f, 16.2636f)
generalPath!!.lineTo(41.057804f, 16.2636f)
generalPath!!.curveTo(40.780724f, 18.766403f, 33.533577f, 32.769344f, 31.496525f, 32.99672f)
generalPath!!.curveTo(31.488352f, 32.99719f, 31.475246f, 32.99672f, 31.46725f, 32.99672f)
generalPath!!.lineTo(23.446392f, 32.99672f)
generalPath!!.curveTo(23.412766f, 32.99672f, 23.368837f, 33.0041f, 23.329298f, 32.99672f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(27.741130828857422, 38.71150588989258), 17.977943f, Point2D.Double(27.741130828857422, 38.71150588989258), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 33)) ?: Color(0, 0, 0, 33)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.6299290060997009f, 0.45937299728393555f, -0.14767499268054962f, 0.24851199984550476f, 16.517240524291992f, 9.053736686706543f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.77475f, 31.085394f)
generalPath!!.curveTo(18.407309f, 30.694258f, 7.945269f, 18.619434f, 7.118584f, 16.51709f)
generalPath!!.curveTo(7.109327f, 16.49205f, 7.094677f, 16.443993f, 7.088438f, 16.42208f)
generalPath!!.lineTo(42.630646f, 16.42208f)
generalPath!!.curveTo(41.80703f, 18.6153f, 31.332195f, 30.886145f, 29.185501f, 31.085394f)
generalPath!!.curveTo(29.176985f, 31.085802f, 29.16359f, 31.085394f, 29.155355f, 31.085394f)
generalPath!!.lineTo(20.895334f, 31.085394f)
generalPath!!.curveTo(20.860706f, 31.085394f, 20.81388f, 31.091858f, 20.77475f, 31.085394f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(11.742170333862305, 11.484869956970215), Point2D.Double(13.846982955932617, 11.98198127746582), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(226, 226, 226, 255)) ?: Color(226, 226, 226, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2960150241851807f, 0.0f, 0.0f, -1.4369200468063354f, 3.7465760707855225f, 33.20515823364258f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(152, 152, 152, 255)) ?: Color(152, 152, 152, 255)
stroke = BasicStroke(0.85390013f,0,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.77475f, 31.085394f)
generalPath!!.curveTo(18.407309f, 30.694258f, 7.945269f, 18.619434f, 7.118584f, 16.51709f)
generalPath!!.curveTo(7.109327f, 16.49205f, 7.094677f, 16.443993f, 7.088438f, 16.42208f)
generalPath!!.lineTo(42.630646f, 16.42208f)
generalPath!!.curveTo(41.80703f, 18.6153f, 31.332195f, 30.886145f, 29.185501f, 31.085394f)
generalPath!!.curveTo(29.176985f, 31.085802f, 29.16359f, 31.085394f, 29.155355f, 31.085394f)
generalPath!!.lineTo(20.895334f, 31.085394f)
generalPath!!.curveTo(20.860706f, 31.085394f, 20.81388f, 31.091858f, 20.77475f, 31.085394f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.625174f, 30.490479f)
generalPath!!.curveTo(18.51921f, 29.999928f, 7.7224803f, 17.98771f, 7.0314245f, 16.466377f)
generalPath!!.curveTo(7.028888f, 16.460379f, 7.033602f, 16.43969f, 7.0314245f, 16.434063f)
generalPath!!.curveTo(7.0259733f, 16.418306f, 7.002328f, 16.381763f, 7.0001745f, 16.369436f)
generalPath!!.curveTo(7.000203f, 16.366104f, 6.9997683f, 16.34006f, 7.0001745f, 16.337122f)
generalPath!!.curveTo(7.0013437f, 16.334982f, 7.0298696f, 16.33886f, 7.0314245f, 16.337122f)
generalPath!!.lineTo(7.1251745f, 16.240181f)
generalPath!!.lineTo(42.593925f, 16.240181f)
generalPath!!.curveTo(42.59121f, 16.264507f, 42.57124f, 16.307055f, 42.562675f, 16.337122f)
generalPath!!.curveTo(42.555172f, 16.360727f, 42.542103f, 16.407354f, 42.531425f, 16.434063f)
generalPath!!.curveTo(41.609325f, 18.615f, 31.023436f, 30.200512f, 29.187674f, 30.490479f)
generalPath!!.curveTo(29.172747f, 30.492123f, 29.138826f, 30.490479f, 29.125174f, 30.490479f)
generalPath!!.lineTo(20.750174f, 30.490479f)
generalPath!!.curveTo(20.719887f, 30.488811f, 20.66042f, 30.49869f, 20.625174f, 30.490479f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(10.027000427246094, 20.21976089477539), Point2D.Double(17.178024291992188, -7.527464389801025), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(226, 226, 226, 255)) ?: Color(226, 226, 226, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5706069469451904f, 0.0f, 0.0f, -1.2315109968185425f, 2.973436117172241f, 33.3348503112793f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2_6
paint = LinearGradientPaint(Point2D.Double(11.841544151306152, 4.250730514526367), Point2D.Double(40.0240592956543, 7.412107467651367), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(237, 237, 237, 255)) ?: Color(237, 237, 237, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3709280490875244f, 0.0f, 0.0f, -1.4645600318908691f, 2.525057077407837f, 33.71268844604492f))
stroke = BasicStroke(0.85389996f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.875174f, 30.051142f)
generalPath!!.curveTo(18.427216f, 29.50167f, 8.704f, 18.433899f, 7.5314245f, 16.451725f)
generalPath!!.lineTo(42.125175f, 16.451725f)
generalPath!!.curveTo(40.634987f, 18.784897f, 31.078503f, 29.863516f, 28.968924f, 30.051142f)
generalPath!!.curveTo(28.96018f, 30.051542f, 28.946142f, 30.051142f, 28.937674f, 30.051142f)
generalPath!!.lineTo(21.031424f, 30.051142f)
generalPath!!.curveTo(21.00503f, 30.051142f, 20.966541f, 30.054691f, 20.937674f, 30.051142f)
generalPath!!.curveTo(20.917889f, 30.047995f, 20.896025f, 30.05582f, 20.875174f, 30.051142f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.95951f, 30.447113f)
generalPath!!.lineTo(9.018012f, 38.717968f)
generalPath!!.lineTo(11.237445f, 38.724075f)
generalPath!!.lineTo(21.23557f, 31.855137f)
generalPath!!.lineTo(30.057478f, 30.432299f)
generalPath!!.lineTo(20.95951f, 30.447113f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(17.39720344543457, 33.35737609863281), Point2D.Double(22.177709579467773, 31.02674102783203), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.8457019925117493f, 0.0f, 0.0f, -0.8457019925117493f, 51.403228759765625f, 49.140480041503906f))
// _0_0_3_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(49.78573f, 36.46161f)
generalPath!!.curveTo(31.871506f, 29.801214f, 51.855164f, 14.067224f, 22.462412f, 12.49765f)
generalPath!!.lineTo(22.462412f, 3.1222396f)
generalPath!!.lineTo(5.81393f, 17.708818f)
generalPath!!.lineTo(22.462412f, 33.006348f)
generalPath!!.curveTo(22.462412f, 33.006348f, 22.462412f, 23.337969f, 22.462412f, 23.337969f)
generalPath!!.curveTo(39.481644f, 22.456387f, 30.293505f, 37.380238f, 49.78573f, 36.46161f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(32.707862854003906, 28.042139053344727), Point2D.Double(43.98674392700195, 34.40784454345703), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(253, 157, 20, 255)) ?: Color(253, 157, 20, 255)),(colorFilter?.filter(Color(255, 200, 121, 0)) ?: Color(255, 200, 121, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(32.707862854003906, 28.042139053344727), Point2D.Double(43.98674392700195, 34.40784454345703), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(159, 98, 11, 255)) ?: Color(159, 98, 11, 255)),(colorFilter?.filter(Color(255, 200, 121, 0)) ?: Color(255, 200, 121, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.1824504f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(49.78573f, 36.46161f)
generalPath!!.curveTo(31.871506f, 29.801214f, 51.855164f, 14.067224f, 22.462412f, 12.49765f)
generalPath!!.lineTo(22.462412f, 3.1222396f)
generalPath!!.lineTo(5.81393f, 17.708818f)
generalPath!!.lineTo(22.462412f, 33.006348f)
generalPath!!.curveTo(22.462412f, 33.006348f, 22.462412f, 23.337969f, 22.462412f, 23.337969f)
generalPath!!.curveTo(39.481644f, 22.456387f, 30.293505f, 37.380238f, 49.78573f, 36.46161f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.7f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.8457019925117493f, 0.0f, 0.0f, -0.8457019925117493f, 51.403228759765625f, 49.140480041503906f))
// _0_0_3_1
paint = LinearGradientPaint(Point2D.Double(23.70759391784668, 11.027570724487305), Point2D.Double(36.172122955322266, 50.995052337646484), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9141139984130859f, 1.412791001969375E-16f, -1.412791001969375E-16f, 0.9141139984130859f, -3.8686978816986084f, -2.706902027130127f))
stroke = BasicStroke(1.1824498f,0,0,10.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(44.926064f, 35.103043f)
generalPath!!.curveTo(33.88701f, 28.727802f, 48.67967f, 14.639454f, 21.448702f, 13.549959f)
generalPath!!.lineTo(21.448702f, 5.4508677f)
generalPath!!.curveTo(21.448702f, 5.4508677f, 7.400963f, 17.714588f, 7.400963f, 17.714588f)
generalPath!!.lineTo(21.448702f, 30.658617f)
generalPath!!.curveTo(21.448702f, 30.658617f, 21.448702f, 22.38098f, 21.448702f, 22.38098f)
generalPath!!.curveTo(37.544903f, 20.111229f, 34.13055f, 34.399548f, 44.926064f, 35.103043f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_3_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(32.84375f, 38.1875f)
generalPath!!.lineTo(32.78125f, 45.5f)
generalPath!!.lineTo(45.875f, 34.15625f)
generalPath!!.lineTo(32.84375f, 22.09375f)
generalPath!!.curveTo(32.84375f, 22.093752f, 32.78125f, 29.65625f, 32.78125f, 29.65625f)
generalPath!!.curveTo(20.26305f, 32.276806f, 23.547112f, 18.410612f, 11.6875f, 18.9375f)
generalPath!!.curveTo(22.872463f, 24.02322f, 9.730253f, 37.29154f, 32.84375f, 38.1875f)
generalPath!!.closePath()
generalPath!!.moveTo(40.78125f, 29.625f)
generalPath!!.curveTo(40.860493f, 29.62021f, 40.917072f, 29.627337f, 41.0f, 29.625f)
generalPath!!.lineTo(45.8125f, 34.1875f)
generalPath!!.lineTo(32.875f, 45.46875f)
generalPath!!.lineTo(32.78125f, 38.15625f)
generalPath!!.lineTo(28.59375f, 37.625f)
generalPath!!.curveTo(37.938694f, 35.04962f, 35.789047f, 29.926678f, 40.78125f, 29.625f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(11.6875, 14.319357872009277), Point2D.Double(37.11378479003906, 36.08745193481445), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)

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
            return 2.348088502883911
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 6.0077385902404785
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 44.88691329956055
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 41.595096588134766
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Mail_forward(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Mail_forward(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Mail_forward(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

