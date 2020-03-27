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
class Applications_internet private constructor(private var width: Int, private var height: Int)
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
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.2431999444961548f, 0.0f, -10.272000312805176f))
// _0_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(45.053, 38.909)
(shape as GeneralPath).curveTo(45.085377, 41.58756, 41.241802, 44.06779, 34.977673, 45.41054)
(shape as GeneralPath).curveTo(28.713545, 46.753292, 20.98646, 46.753292, 14.722331, 45.41054)
(shape as GeneralPath).curveTo(8.458201, 44.06779, 4.614628, 41.58756, 4.647003, 38.909)
(shape as GeneralPath).curveTo(4.614628, 36.230442, 8.458201, 33.75021, 14.722331, 32.40746)
(shape as GeneralPath).curveTo(20.98646, 31.064709, 28.713545, 31.064709, 34.977673, 32.40746)
(shape as GeneralPath).curveTo(41.241802, 33.75021, 45.085377, 36.230442, 45.053, 38.909)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(15.116000175476074, 63.96500015258789), 12.289f, Point2D.Double(15.116000175476074, 63.96500015258789), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.6440000534057617f, 0.0f, 0.0f, 0.6082800030708313f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(43.96, 23.485)
(shape as GeneralPath).curveTo(43.96, 34.195, 35.278, 42.877, 24.57, 42.877)
(shape as GeneralPath).curveTo(13.86, 42.877, 5.178999, 34.195, 5.178999, 23.484999)
(shape as GeneralPath).curveTo(5.178699, 12.775999, 13.859999, 4.0949993, 24.57, 4.0949993)
(shape as GeneralPath).curveTo(35.278, 4.095199, 43.96, 12.775999, 43.96, 23.484999)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(18.24799919128418, 15.715999603271484), 29.993f, Point2D.Double(18.24799919128418, 15.715999603271484), floatArrayOf(0.0f,0.15517f,0.75f,1.0f), arrayOf(Color(211, 233, 255, 255),Color(211, 233, 255, 255),Color(64, 116, 174, 255),Color(54, 72, 108, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9999899864196777f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = Color(57, 57, 108, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(43.96, 23.485)
(shape as GeneralPath).curveTo(43.96, 34.195, 35.278, 42.877, 24.57, 42.877)
(shape as GeneralPath).curveTo(13.86, 42.877, 5.178999, 34.195, 5.178999, 23.484999)
(shape as GeneralPath).curveTo(5.178699, 12.775999, 13.859999, 4.0949993, 24.57, 4.0949993)
(shape as GeneralPath).curveTo(35.278, 4.095199, 43.96, 12.775999, 43.96, 23.484999)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9823700189590454f, 0.0f, 0.0f, 0.9823700189590454f, 0.12108000367879868f, 0.23291000723838806f))
// _0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_0_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(44.071, 20.714)
(shape as GeneralPath).lineTo(44.071, 20.714)
(shape as GeneralPath).lineTo(43.526, 21.332)
(shape as GeneralPath).curveTo(43.192, 20.938002, 42.817, 20.607, 42.437, 20.261002)
(shape as GeneralPath).lineTo(41.601, 20.384)
(shape as GeneralPath).lineTo(40.837, 19.521)
(shape as GeneralPath).lineTo(40.837, 20.589)
(shape as GeneralPath).lineTo(41.491, 21.084002)
(shape as GeneralPath).lineTo(41.927002, 21.578001)
(shape as GeneralPath).lineTo(42.509003, 20.920002)
(shape as GeneralPath).curveTo(42.655003, 21.194002, 42.800003, 21.468002, 42.945004, 21.743002)
(shape as GeneralPath).lineTo(42.945004, 22.565002)
(shape as GeneralPath).lineTo(42.290005, 23.305002)
(shape as GeneralPath).lineTo(41.091003, 24.128002)
(shape as GeneralPath).lineTo(40.183002, 25.035002)
(shape as GeneralPath).lineTo(39.601, 24.374002)
(shape as GeneralPath).lineTo(39.892002, 23.634003)
(shape as GeneralPath).lineTo(39.31, 22.976002)
(shape as GeneralPath).lineTo(38.329002, 20.878002)
(shape as GeneralPath).lineTo(37.493004, 19.933002)
(shape as GeneralPath).lineTo(37.274002, 20.179003)
(shape as GeneralPath).lineTo(37.602, 21.373003)
(shape as GeneralPath).lineTo(38.22, 22.072002)
(shape as GeneralPath).curveTo(38.572002, 23.089003, 38.921, 24.062002, 39.384003, 25.035002)
(shape as GeneralPath).curveTo(40.102, 25.035002, 40.778004, 24.958002, 41.491, 24.869001)
(shape as GeneralPath).lineTo(41.491, 25.445002)
(shape as GeneralPath).lineTo(40.619, 27.584002)
(shape as GeneralPath).lineTo(39.819, 28.488)
(shape as GeneralPath).lineTo(39.165, 29.889)
(shape as GeneralPath).lineTo(39.165, 32.192)
(shape as GeneralPath).lineTo(39.384003, 33.098)
(shape as GeneralPath).lineTo(39.020004, 33.508)
(shape as GeneralPath).lineTo(38.220005, 34.002)
(shape as GeneralPath).lineTo(37.384007, 34.701)
(shape as GeneralPath).lineTo(38.075005, 35.483)
(shape as GeneralPath).lineTo(37.130005, 36.307003)
(shape as GeneralPath).lineTo(37.312004, 36.840004)
(shape as GeneralPath).lineTo(35.894005, 38.446003)
(shape as GeneralPath).lineTo(34.949005, 38.446003)
(shape as GeneralPath).lineTo(34.149006, 38.940002)
(shape as GeneralPath).lineTo(33.640007, 38.940002)
(shape as GeneralPath).lineTo(33.640007, 38.281002)
(shape as GeneralPath).lineTo(33.423008, 36.963)
(shape as GeneralPath).curveTo(33.14201, 36.137, 32.849007, 35.316, 32.551006, 34.496002)
(shape as GeneralPath).curveTo(32.551006, 33.891003, 32.587006, 33.291, 32.623005, 32.686)
(shape as GeneralPath).lineTo(32.987003, 31.863)
(shape as GeneralPath).lineTo(32.478004, 30.875)
(shape as GeneralPath).lineTo(32.515003, 29.518)
(shape as GeneralPath).lineTo(31.823004, 28.736)
(shape as GeneralPath).lineTo(32.169003, 27.606)
(shape as GeneralPath).lineTo(31.606003, 26.967001)
(shape as GeneralPath).lineTo(30.624002, 26.967001)
(shape as GeneralPath).lineTo(30.297003, 26.597)
(shape as GeneralPath).lineTo(29.316002, 27.215)
(shape as GeneralPath).lineTo(28.916002, 26.761)
(shape as GeneralPath).lineTo(28.007002, 27.543)
(shape as GeneralPath).curveTo(27.390001, 26.842999, 26.772001, 26.144, 26.153002, 25.445)
(shape as GeneralPath).lineTo(25.427002, 23.716)
(shape as GeneralPath).lineTo(26.081001, 22.73)
(shape as GeneralPath).lineTo(25.718, 22.319)
(shape as GeneralPath).lineTo(26.517, 20.425)
(shape as GeneralPath).curveTo(27.173, 19.609, 27.858, 18.826, 28.552, 18.039999)
(shape as GeneralPath).lineTo(29.788, 17.710999)
(shape as GeneralPath).lineTo(31.169, 17.545998)
(shape as GeneralPath).lineTo(32.114002, 17.793997)
(shape as GeneralPath).lineTo(33.459003, 19.149998)
(shape as GeneralPath).lineTo(33.932003, 18.615997)
(shape as GeneralPath).lineTo(34.585003, 18.533997)
(shape as GeneralPath).lineTo(35.821003, 18.944996)
(shape as GeneralPath).lineTo(36.767002, 18.944996)
(shape as GeneralPath).lineTo(37.421, 18.368996)
(shape as GeneralPath).lineTo(37.712, 17.957996)
(shape as GeneralPath).lineTo(37.057003, 17.545996)
(shape as GeneralPath).lineTo(35.966003, 17.463995)
(shape as GeneralPath).curveTo(35.663002, 17.044994, 35.382004, 16.602995, 35.022003, 16.229996)
(shape as GeneralPath).lineTo(34.658005, 16.393995)
(shape as GeneralPath).lineTo(34.513004, 17.463995)
(shape as GeneralPath).lineTo(33.858006, 16.723995)
(shape as GeneralPath).lineTo(33.714005, 15.899995)
(shape as GeneralPath).lineTo(32.987003, 15.3259945)
(shape as GeneralPath).lineTo(32.695004, 15.3259945)
(shape as GeneralPath).lineTo(33.423004, 16.147995)
(shape as GeneralPath).lineTo(33.132004, 16.887995)
(shape as GeneralPath).lineTo(32.551003, 17.051994)
(shape as GeneralPath).lineTo(32.914, 16.311995)
(shape as GeneralPath).lineTo(32.259003, 15.9839945)
(shape as GeneralPath).lineTo(31.678003, 15.3259945)
(shape as GeneralPath).lineTo(30.587004, 15.571995)
(shape as GeneralPath).lineTo(30.442003, 15.899995)
(shape as GeneralPath).lineTo(29.788004, 16.311995)
(shape as GeneralPath).lineTo(29.425003, 17.217995)
(shape as GeneralPath).lineTo(28.516003, 17.669994)
(shape as GeneralPath).lineTo(28.116003, 17.217995)
(shape as GeneralPath).lineTo(27.680002, 17.217995)
(shape as GeneralPath).lineTo(27.680002, 15.735994)
(shape as GeneralPath).lineTo(28.626001, 15.241994)
(shape as GeneralPath).lineTo(29.352001, 15.241994)
(shape as GeneralPath).lineTo(29.206001, 14.666994)
(shape as GeneralPath).lineTo(28.626001, 14.090994)
(shape as GeneralPath).lineTo(29.606, 13.884994)
(shape as GeneralPath).lineTo(30.151001, 13.267994)
(shape as GeneralPath).lineTo(30.587002, 12.526994)
(shape as GeneralPath).lineTo(31.388002, 12.526994)
(shape as GeneralPath).lineTo(31.169003, 11.951994)
(shape as GeneralPath).lineTo(31.678003, 11.622993)
(shape as GeneralPath).lineTo(31.678003, 12.280993)
(shape as GeneralPath).lineTo(32.768, 12.526994)
(shape as GeneralPath).lineTo(33.858, 11.622993)
(shape as GeneralPath).lineTo(33.931004, 11.210994)
(shape as GeneralPath).lineTo(34.876003, 10.552994)
(shape as GeneralPath).curveTo(34.534004, 10.595994, 34.192, 10.626994, 33.858, 10.717994)
(shape as GeneralPath).lineTo(33.858, 9.976594)
(shape as GeneralPath).lineTo(34.221, 9.153794)
(shape as GeneralPath).lineTo(33.858, 9.153794)
(shape as GeneralPath).lineTo(33.06, 9.893994)
(shape as GeneralPath).lineTo(32.841, 10.305994)
(shape as GeneralPath).lineTo(33.06, 10.881994)
(shape as GeneralPath).lineTo(32.695, 11.868994)
(shape as GeneralPath).lineTo(32.114, 11.539993)
(shape as GeneralPath).lineTo(31.605999, 10.963993)
(shape as GeneralPath).lineTo(30.806, 11.539993)
(shape as GeneralPath).lineTo(30.515, 10.223993)
(shape as GeneralPath).lineTo(31.896, 9.318793)
(shape as GeneralPath).lineTo(31.896, 8.824694)
(shape as GeneralPath).lineTo(32.768, 8.248994)
(shape as GeneralPath).lineTo(34.149002, 7.919394)
(shape as GeneralPath).lineTo(35.095, 8.248994)
(shape as GeneralPath).lineTo(36.839, 8.578094)
(shape as GeneralPath).lineTo(36.403, 9.071294)
(shape as GeneralPath).lineTo(35.458, 9.071294)
(shape as GeneralPath).lineTo(36.403, 10.058994)
(shape as GeneralPath).lineTo(37.13, 9.236294)
(shape as GeneralPath).lineTo(37.351, 8.874494)
(shape as GeneralPath).curveTo(37.351, 8.874494, 40.138, 11.371994, 41.730003, 14.104994)
(shape as GeneralPath).curveTo(43.323, 16.837994, 44.071003, 20.059994, 44.071003, 20.713993)
(shape as GeneralPath).closePath()
paint = Color(32, 74, 135, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_1_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(26.07, 9.2363)
(shape as GeneralPath).lineTo(25.997, 9.729501)
(shape as GeneralPath).lineTo(26.507, 10.059001)
(shape as GeneralPath).lineTo(27.378, 9.482901)
(shape as GeneralPath).lineTo(26.942, 8.989201)
(shape as GeneralPath).lineTo(26.359999, 9.318801)
(shape as GeneralPath).lineTo(26.069998, 9.2363)
paint = Color(32, 74, 135, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_2_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(26.87, 5.8633)
(shape as GeneralPath).lineTo(24.980001, 5.1225996)
(shape as GeneralPath).lineTo(22.800001, 5.3691998)
(shape as GeneralPath).lineTo(20.109001, 6.1094)
(shape as GeneralPath).lineTo(19.601002, 6.6035)
(shape as GeneralPath).lineTo(21.272001, 7.7549)
(shape as GeneralPath).lineTo(21.272001, 8.4131)
(shape as GeneralPath).lineTo(20.618002, 9.0713005)
(shape as GeneralPath).lineTo(21.491001, 10.8)
(shape as GeneralPath).lineTo(22.071001, 10.47)
(shape as GeneralPath).lineTo(22.800001, 9.3188)
(shape as GeneralPath).curveTo(23.923, 8.9716, 24.93, 8.5781, 25.997002, 8.0844)
(shape as GeneralPath).lineTo(26.87, 5.8632)
paint = Color(32, 74, 135, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_3_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(28.833, 12.775)
(shape as GeneralPath).lineTo(28.542, 12.033999)
(shape as GeneralPath).lineTo(28.032, 12.198999)
(shape as GeneralPath).lineTo(28.178999, 13.103)
(shape as GeneralPath).lineTo(28.832998, 12.775)
paint = Color(32, 74, 135, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_4_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(29.123, 12.609)
(shape as GeneralPath).lineTo(28.977999, 13.597)
(shape as GeneralPath).lineTo(29.776999, 13.432)
(shape as GeneralPath).lineTo(30.357998, 12.857)
(shape as GeneralPath).lineTo(29.849998, 12.363)
(shape as GeneralPath).curveTo(29.678999, 11.908, 29.481998, 11.483, 29.267998, 11.046)
(shape as GeneralPath).lineTo(28.832998, 11.046)
(shape as GeneralPath).lineTo(28.832998, 11.54)
(shape as GeneralPath).lineTo(29.123, 11.8689995)
(shape as GeneralPath).lineTo(29.123, 12.608999)
paint = Color(32, 74, 135, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_5_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_5_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.365, 28.242)
(shape as GeneralPath).lineTo(17.782999, 27.09)
(shape as GeneralPath).lineTo(16.692999, 26.843)
(shape as GeneralPath).lineTo(16.110998, 25.281)
(shape as GeneralPath).lineTo(14.657998, 25.445)
(shape as GeneralPath).lineTo(13.421998, 24.541)
(shape as GeneralPath).lineTo(12.112998, 25.692001)
(shape as GeneralPath).lineTo(12.112998, 25.874)
(shape as GeneralPath).curveTo(11.716998, 25.759, 11.229998, 25.744001, 10.877998, 25.527)
(shape as GeneralPath).lineTo(10.586998, 24.705)
(shape as GeneralPath).lineTo(10.586998, 23.799)
(shape as GeneralPath).lineTo(9.714798, 23.881)
(shape as GeneralPath).curveTo(9.787598, 23.305, 9.859798, 22.73, 9.933098, 22.154001)
(shape as GeneralPath).lineTo(9.423798, 22.154001)
(shape as GeneralPath).lineTo(8.915498, 22.812)
(shape as GeneralPath).lineTo(8.406198, 23.058)
(shape as GeneralPath).lineTo(7.6790977, 22.648)
(shape as GeneralPath).lineTo(7.6062975, 21.743)
(shape as GeneralPath).lineTo(7.7517977, 20.755)
(shape as GeneralPath).lineTo(8.842598, 19.932999)
(shape as GeneralPath).lineTo(9.714698, 19.932999)
(shape as GeneralPath).lineTo(9.859698, 19.439)
(shape as GeneralPath).lineTo(10.949998, 19.685)
(shape as GeneralPath).lineTo(11.749998, 20.673)
(shape as GeneralPath).lineTo(11.894999, 19.027)
(shape as GeneralPath).lineTo(13.2769985, 17.875)
(shape as GeneralPath).lineTo(13.784999, 16.641)
(shape as GeneralPath).lineTo(14.802999, 16.230001)
(shape as GeneralPath).lineTo(15.383999, 15.408001)
(shape as GeneralPath).lineTo(16.692999, 15.160001)
(shape as GeneralPath).lineTo(17.346998, 14.173)
(shape as GeneralPath).lineTo(15.383998, 14.173)
(shape as GeneralPath).lineTo(16.619997, 13.597)
(shape as GeneralPath).lineTo(17.491997, 13.597)
(shape as GeneralPath).lineTo(18.727997, 13.185)
(shape as GeneralPath).lineTo(18.873997, 12.693001)
(shape as GeneralPath).lineTo(18.436996, 12.281001)
(shape as GeneralPath).lineTo(17.927996, 12.116001)
(shape as GeneralPath).lineTo(18.073996, 11.622001)
(shape as GeneralPath).lineTo(17.710995, 10.882001)
(shape as GeneralPath).lineTo(16.837996, 11.210001)
(shape as GeneralPath).lineTo(16.983995, 10.553001)
(shape as GeneralPath).lineTo(15.965996, 9.976501)
(shape as GeneralPath).lineTo(15.166996, 11.3740015)
(shape as GeneralPath).lineTo(15.238996, 11.868002)
(shape as GeneralPath).lineTo(14.439996, 12.199002)
(shape as GeneralPath).lineTo(13.929996, 13.2680025)
(shape as GeneralPath).lineTo(13.711995, 12.281002)
(shape as GeneralPath).lineTo(12.330996, 11.704002)
(shape as GeneralPath).lineTo(12.112995, 10.964003)
(shape as GeneralPath).lineTo(13.929996, 9.893903)
(shape as GeneralPath).lineTo(14.729996, 9.153703)
(shape as GeneralPath).lineTo(14.802996, 8.248902)
(shape as GeneralPath).lineTo(14.366996, 8.001802)
(shape as GeneralPath).lineTo(13.784996, 7.9193025)
(shape as GeneralPath).lineTo(13.421996, 8.824602)
(shape as GeneralPath).curveTo(13.421996, 8.824602, 12.813996, 8.943702, 12.657996, 8.982302)
(shape as GeneralPath).curveTo(10.661996, 10.822001, 6.6285963, 14.792002, 5.691596, 22.288301)
(shape as GeneralPath).curveTo(5.728696, 22.462301, 6.370796, 23.4703, 6.370796, 23.4703)
(shape as GeneralPath).lineTo(7.8971963, 24.3743)
(shape as GeneralPath).lineTo(9.423596, 24.7863)
(shape as GeneralPath).lineTo(10.077996, 25.6103)
(shape as GeneralPath).lineTo(11.095996, 26.3503)
(shape as GeneralPath).lineTo(11.676996, 26.2683)
(shape as GeneralPath).lineTo(12.112996, 26.464298)
(shape as GeneralPath).lineTo(12.112996, 26.597298)
(shape as GeneralPath).lineTo(11.531996, 28.160297)
(shape as GeneralPath).lineTo(11.0949955, 28.818298)
(shape as GeneralPath).lineTo(11.240995, 29.148298)
(shape as GeneralPath).lineTo(10.8779955, 30.381298)
(shape as GeneralPath).lineTo(12.185995, 32.7673)
(shape as GeneralPath).lineTo(13.493995, 33.9203)
(shape as GeneralPath).lineTo(14.0759945, 34.7423)
(shape as GeneralPath).lineTo(14.002995, 36.4703)
(shape as GeneralPath).lineTo(14.439995, 37.4573)
(shape as GeneralPath).lineTo(14.002995, 39.349297)
(shape as GeneralPath).curveTo(14.002995, 39.349297, 13.968994, 39.338295, 14.024995, 39.527298)
(shape as GeneralPath).curveTo(14.080995, 39.717297, 16.353994, 40.9783, 16.497995, 40.8713)
(shape as GeneralPath).curveTo(16.641994, 40.7623, 16.764996, 40.666298, 16.764996, 40.666298)
(shape as GeneralPath).lineTo(16.619995, 40.256298)
(shape as GeneralPath).lineTo(17.200994, 39.6793)
(shape as GeneralPath).lineTo(17.419994, 39.1033)
(shape as GeneralPath).lineTo(18.364994, 38.773296)
(shape as GeneralPath).lineTo(19.091993, 36.963295)
(shape as GeneralPath).lineTo(18.873993, 36.470295)
(shape as GeneralPath).lineTo(19.381992, 35.730293)
(shape as GeneralPath).lineTo(20.471992, 35.482292)
(shape as GeneralPath).lineTo(21.053993, 34.16629)
(shape as GeneralPath).lineTo(20.908993, 32.52129)
(shape as GeneralPath).lineTo(21.780993, 31.28729)
(shape as GeneralPath).lineTo(21.925993, 30.05229)
(shape as GeneralPath).curveTo(20.732992, 29.46129, 19.549994, 28.85129, 18.364992, 28.24229)
paint = Color(32, 74, 135, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_6_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_6_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(16.766, 9.5649)
(shape as GeneralPath).lineTo(17.492, 10.059)
(shape as GeneralPath).lineTo(18.074001, 10.059)
(shape as GeneralPath).lineTo(18.074001, 9.4829)
(shape as GeneralPath).lineTo(17.348001, 9.1538)
(shape as GeneralPath).lineTo(16.766, 9.5649)
paint = Color(32, 74, 135, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_7_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_7_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(14.876, 8.9072)
(shape as GeneralPath).lineTo(14.512, 9.812)
(shape as GeneralPath).lineTo(15.239, 9.812)
(shape as GeneralPath).lineTo(15.603001, 8.989201)
(shape as GeneralPath).curveTo(15.917001, 8.767501, 16.229, 8.5444, 16.548, 8.331)
(shape as GeneralPath).lineTo(17.275, 8.5781)
(shape as GeneralPath).curveTo(17.758999, 8.9072, 18.244, 9.2363, 18.729, 9.5649)
(shape as GeneralPath).lineTo(19.456, 8.907201)
(shape as GeneralPath).lineTo(18.656, 8.578101)
(shape as GeneralPath).lineTo(18.292, 7.8374014)
(shape as GeneralPath).lineTo(16.911, 7.6728015)
(shape as GeneralPath).lineTo(16.838, 7.2612014)
(shape as GeneralPath).lineTo(16.184, 7.4262013)
(shape as GeneralPath).lineTo(15.894, 8.002002)
(shape as GeneralPath).lineTo(15.53, 7.261302)
(shape as GeneralPath).lineTo(15.384999, 7.590402)
(shape as GeneralPath).lineTo(15.457999, 8.413202)
(shape as GeneralPath).lineTo(14.875999, 8.907203)
paint = Color(32, 74, 135, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_8
g.composite = AlphaComposite.getInstance(3, 0.75f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_8_0
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_8_1
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_9
g.composite = AlphaComposite.getInstance(3, 0.75f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_9_0
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_9_1
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_10_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_10_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(17.492, 6.8496)
(shape as GeneralPath).lineTo(17.856, 6.521)
(shape as GeneralPath).lineTo(18.583, 6.3564)
(shape as GeneralPath).curveTo(19.081, 6.1142, 19.581, 5.9511, 20.11, 5.7802)
(shape as GeneralPath).lineTo(19.82, 5.2865)
(shape as GeneralPath).lineTo(18.881, 5.4213)
(shape as GeneralPath).lineTo(18.438, 5.8632)
(shape as GeneralPath).lineTo(17.706999, 5.9692)
(shape as GeneralPath).lineTo(17.057, 6.2744)
(shape as GeneralPath).lineTo(16.741, 6.4272003)
(shape as GeneralPath).lineTo(16.547998, 6.6855)
(shape as GeneralPath).lineTo(17.491999, 6.8496003)
paint = Color(32, 74, 135, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_11_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_11_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.728, 14.666)
(shape as GeneralPath).lineTo(19.165, 14.008)
(shape as GeneralPath).lineTo(18.51, 13.515)
(shape as GeneralPath).lineTo(18.728, 14.666)
paint = Color(32, 74, 135, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.3956f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = RadialGradientPaint(Point2D.Double(15.60099983215332, 12.142000198364258), 43.527f, Point2D.Double(15.60099983215332, 12.142000198364258), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 42)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9999899864196777f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(42.975, 23.486)
(shape as GeneralPath).curveTo(42.975, 33.651, 34.733997, 41.892, 24.568998, 41.892)
(shape as GeneralPath).curveTo(14.403999, 41.892, 6.162998, 33.650997, 6.162998, 23.485998)
(shape as GeneralPath).curveTo(6.1633983, 13.319998, 14.403998, 5.079998, 24.568998, 5.079998)
(shape as GeneralPath).curveTo(34.733997, 5.079898, 42.975, 13.319998, 42.975, 23.485998)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.13100004196167f, 0.613099992275238f, -0.47655999660491943f, 0.8791400194168091f, 54.090999603271484f, 16.04400062561035f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(-25.176000595092773, 30.05699920654297), Point2D.Double(-22.25200080871582, 21.04199981689453), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.88164f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(-2.8284, 21.042)
(shape as GeneralPath).curveTo(-2.803187, 24.431059, -5.7964487, 27.569181, -10.6747675, 29.268103)
(shape as GeneralPath).curveTo(-15.553087, 30.967022, -21.570711, 30.967022, -26.449032, 29.268103)
(shape as GeneralPath).curveTo(-31.32735, 27.569181, -34.32061, 24.431059, -34.2954, 21.042)
(shape as GeneralPath).curveTo(-34.32061, 17.65294, -31.32735, 14.514817, -26.44903, 12.815898)
(shape as GeneralPath).curveTo(-21.570711, 11.116979, -15.553086, 11.116979, -10.6747675, 12.815898)
(shape as GeneralPath).curveTo(-5.796448, 14.514817, -2.8031867, 17.65294, -2.8283997, 21.042)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.939329981803894f, -0.8790900111198425f, 0.6833099722862244f, 0.7301300168037415f, 32.31399917602539f, -4.451600074768066f))
// _0_0_5
paint = LinearGradientPaint(Point2D.Double(-25.176000595092773, 30.05699920654297), Point2D.Double(-22.11400032043457, 22.66200065612793), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.88164f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(-2.8284, 21.042)
(shape as GeneralPath).curveTo(-2.803187, 24.431059, -5.7964487, 27.569181, -10.6747675, 29.268103)
(shape as GeneralPath).curveTo(-15.553087, 30.967022, -21.570711, 30.967022, -26.449032, 29.268103)
(shape as GeneralPath).curveTo(-31.32735, 27.569181, -34.32061, 24.431059, -34.2954, 21.042)
(shape as GeneralPath).curveTo(-34.32061, 17.65294, -31.32735, 14.514817, -26.44903, 12.815898)
(shape as GeneralPath).curveTo(-21.570711, 11.116979, -15.553086, 11.116979, -10.6747675, 12.815898)
(shape as GeneralPath).curveTo(-5.796448, 14.514817, -2.8031867, 17.65294, -2.8283997, 21.042)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-1.045799970626831f, 0.7672500014305115f, 0.7672500014305115f, 1.045799970626831f, 35.617000579833984f, -22.143999099731445f))
// _0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f))
// _0_0_6_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.789, 12.493)
(shape as GeneralPath).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611)
(shape as GeneralPath).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611)
(shape as GeneralPath).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493)
(shape as GeneralPath).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388)
(shape as GeneralPath).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388)
(shape as GeneralPath).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, Point2D.Double(12.071000099182129, 12.493000030517578), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f))
// _0_0_6_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.789, 12.493)
(shape as GeneralPath).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611)
(shape as GeneralPath).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611)
(shape as GeneralPath).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493)
(shape as GeneralPath).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388)
(shape as GeneralPath).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388)
(shape as GeneralPath).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493)
(shape as GeneralPath).closePath()
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-1.2803000211715698f, -0.12615999579429626f, 0.09806200116872787f, -0.9951800107955933f, -2.405100107192993f, 40.52399826049805f))
// _0_0_7
paint = LinearGradientPaint(Point2D.Double(-22.822999954223633, 28.33799934387207), Point2D.Double(-22.11400032043457, 22.66200065612793), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.88164f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(-2.8284, 21.042)
(shape as GeneralPath).curveTo(-2.803187, 24.431059, -5.7964487, 27.569181, -10.6747675, 29.268103)
(shape as GeneralPath).curveTo(-15.553087, 30.967022, -21.570711, 30.967022, -26.449032, 29.268103)
(shape as GeneralPath).curveTo(-31.32735, 27.569181, -34.32061, 24.431059, -34.2954, 21.042)
(shape as GeneralPath).curveTo(-34.32061, 17.65294, -31.32735, 14.514817, -26.44903, 12.815898)
(shape as GeneralPath).curveTo(-21.570711, 11.116979, -15.553086, 11.116979, -10.6747675, 12.815898)
(shape as GeneralPath).curveTo(-5.796448, 14.514817, -2.8031867, 17.65294, -2.8283997, 21.042)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9178699851036072f, -0.8589800000190735f, 0.6676999926567078f, 0.7134299874305725f, 27.632999420166016f, -6.90910005569458f))
// _0_0_8
paint = LinearGradientPaint(Point2D.Double(-21.659000396728516, 15.64900016784668), Point2D.Double(-21.961999893188477, 21.336000442504883), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.90226f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(-2.8284, 21.042)
(shape as GeneralPath).curveTo(-2.803187, 24.431059, -5.7964487, 27.569181, -10.6747675, 29.268103)
(shape as GeneralPath).curveTo(-15.553087, 30.967022, -21.570711, 30.967022, -26.449032, 29.268103)
(shape as GeneralPath).curveTo(-31.32735, 27.569181, -34.32061, 24.431059, -34.2954, 21.042)
(shape as GeneralPath).curveTo(-34.32061, 17.65294, -31.32735, 14.514817, -26.44903, 12.815898)
(shape as GeneralPath).curveTo(-21.570711, 11.116979, -15.553086, 11.116979, -10.6747675, 12.815898)
(shape as GeneralPath).curveTo(-5.796448, 14.514817, -2.8031867, 17.65294, -2.8283997, 21.042)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.8062800168991089f, 0.5915399789810181f, 0.5915399789810181f, 0.8062800168991089f, 12.38599967956543f, -18.02899932861328f))
// _0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f))
// _0_0_9_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.789, 12.493)
(shape as GeneralPath).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611)
(shape as GeneralPath).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611)
(shape as GeneralPath).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493)
(shape as GeneralPath).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388)
(shape as GeneralPath).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388)
(shape as GeneralPath).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, Point2D.Double(12.071000099182129, 12.493000030517578), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f))
// _0_0_9_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.789, 12.493)
(shape as GeneralPath).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611)
(shape as GeneralPath).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611)
(shape as GeneralPath).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493)
(shape as GeneralPath).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388)
(shape as GeneralPath).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388)
(shape as GeneralPath).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493)
(shape as GeneralPath).closePath()
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.8062800168991089f, 0.5915399789810181f, 0.5915399789810181f, 0.8062800168991089f, 13.49899959564209f, -31.5f))
// _0_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f))
// _0_0_10_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.789, 12.493)
(shape as GeneralPath).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611)
(shape as GeneralPath).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611)
(shape as GeneralPath).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493)
(shape as GeneralPath).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388)
(shape as GeneralPath).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388)
(shape as GeneralPath).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, Point2D.Double(12.071000099182129, 12.493000030517578), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f))
// _0_0_10_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.789, 12.493)
(shape as GeneralPath).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611)
(shape as GeneralPath).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611)
(shape as GeneralPath).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493)
(shape as GeneralPath).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388)
(shape as GeneralPath).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388)
(shape as GeneralPath).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493)
(shape as GeneralPath).closePath()
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.8702300190925598f, 0.6385700106620789f, 0.6384599804878235f, 0.8703799843788147f, 25.204999923706055f, -35.3129997253418f))
// _0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f))
// _0_0_11_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.789, 12.493)
(shape as GeneralPath).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611)
(shape as GeneralPath).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611)
(shape as GeneralPath).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493)
(shape as GeneralPath).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388)
(shape as GeneralPath).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388)
(shape as GeneralPath).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, Point2D.Double(12.071000099182129, 12.493000030517578), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f))
// _0_0_11_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.789, 12.493)
(shape as GeneralPath).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611)
(shape as GeneralPath).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611)
(shape as GeneralPath).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493)
(shape as GeneralPath).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388)
(shape as GeneralPath).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388)
(shape as GeneralPath).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493)
(shape as GeneralPath).closePath()
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
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
            return 0.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 2.34157395362854
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
            return 45.658424377441406
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Applications_internet(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Applications_internet(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Applications_internet(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

