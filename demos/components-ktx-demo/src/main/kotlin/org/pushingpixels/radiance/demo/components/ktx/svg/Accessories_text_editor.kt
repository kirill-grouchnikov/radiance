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
class Accessories_text_editor private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.02417599968612194f, 0.0f, 0.0f, 0.020867999643087387f, 45.12799835205078f, 40.15399932861328f))
// _0_0_0
g.composite = AlphaComposite.getInstance(3, 0.4f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_0
shape = Rectangle2D.Double(-1559.300048828125, -150.6999969482422, 1339.5999755859375, 478.3599853515625)
paint = LinearGradientPaint(Point2D.Double(302.8599853515625, 366.6499938964844), Point2D.Double(302.8599853515625, 609.510009765625), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0)),(colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.774399995803833f, 0.0f, 0.0f, 1.9696999788284302f, -1892.199951171875f, -872.8900146484375f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.4f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-219.62f, -150.68f)
generalPath!!.lineTo(-219.62f, 327.65f)
generalPath!!.curveTo(-76.73999f, 328.55f, 125.78f, 220.48f, 125.78f, 88.45f)
generalPath!!.curveTo(125.78f, -43.570007f, -33.660004f, -150.68001f, -219.62f, -150.68001f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(605.7100219726562, 486.6499938964844), 117.14f, Point2D.Double(605.7100219726562, 486.6499938964844), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.774399995803833f, 0.0f, 0.0f, 1.9696999788284302f, -1891.5999755859375f, -872.8900146484375f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.4f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-1559.3f, -150.68f)
generalPath!!.lineTo(-1559.3f, 327.65f)
generalPath!!.curveTo(-1702.1001f, 328.55f, -1904.7001f, 220.48f, -1904.7001f, 88.45f)
generalPath!!.curveTo(-1904.7001f, -43.570007f, -1745.2001f, -150.68001f, -1559.3f, -150.68001f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(605.7100219726562, 486.6499938964844), 117.14f, Point2D.Double(605.7100219726562, 486.6499938964844), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-2.774399995803833f, 0.0f, 0.0f, 1.9696999788284302f, 112.76000213623047f, -872.8900146484375f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
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
generalPath!!.moveTo(7.1639f, 4.5064f)
generalPath!!.lineTo(39.812897f, 4.5064f)
generalPath!!.curveTo(40.575897f, 4.5064f, 41.189896f, 5.0388002f, 41.189896f, 5.7002f)
generalPath!!.lineTo(43.590897f, 39.869198f)
generalPath!!.lineTo(43.602898f, 42.217197f)
generalPath!!.curveTo(43.602898f, 42.878197f, 42.9889f, 43.4102f, 42.2269f, 43.4102f)
generalPath!!.lineTo(4.749897f, 43.4102f)
generalPath!!.curveTo(3.987397f, 43.4102f, 3.373497f, 42.878197f, 3.373497f, 42.217197f)
generalPath!!.lineTo(3.362297f, 40.050198f)
generalPath!!.lineTo(5.7872972f, 5.700199f)
generalPath!!.curveTo(5.7872972f, 5.038999f, 6.4011974f, 4.506599f, 7.1637974f, 4.506599f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(21.042999267578125, 42.83300018310547), Point2D.Double(14.284000396728516, 6.833399772644043), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(223, 223, 223, 255)) ?: Color(223, 223, 223, 255)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.1378999948501587f, 0.0f, 0.0f, 1.0f, -2.660900115966797f, 0.0f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(26.61199951171875, 28.08300018310547), Point2D.Double(26.22800064086914, 42.83300018310547), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(147, 147, 147, 255)) ?: Color(147, 147, 147, 255)),(colorFilter?.filter(Color(66, 66, 66, 255)) ?: Color(66, 66, 66, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.1639f, 4.5064f)
generalPath!!.lineTo(39.812897f, 4.5064f)
generalPath!!.curveTo(40.575897f, 4.5064f, 41.189896f, 5.0388002f, 41.189896f, 5.7002f)
generalPath!!.lineTo(43.590897f, 39.869198f)
generalPath!!.lineTo(43.602898f, 42.217197f)
generalPath!!.curveTo(43.602898f, 42.878197f, 42.9889f, 43.4102f, 42.2269f, 43.4102f)
generalPath!!.lineTo(4.749897f, 43.4102f)
generalPath!!.curveTo(3.987397f, 43.4102f, 3.373497f, 42.878197f, 3.373497f, 42.217197f)
generalPath!!.lineTo(3.362297f, 40.050198f)
generalPath!!.lineTo(5.7872972f, 5.700199f)
generalPath!!.curveTo(5.7872972f, 5.038999f, 6.4011974f, 4.506599f, 7.1637974f, 4.506599f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.31579f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.6166099905967712f, 0.0f, 0.0f, 0.44036999344825745f, 10.61400032043457f, 13.942999839782715f))
// _0_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(43.125f, 40.438f)
generalPath!!.curveTo(43.15635f, 42.879192f, 39.434628f, 45.139633f, 33.36909f, 46.36339f)
generalPath!!.curveTo(27.303555f, 47.58715f, 19.821445f, 47.58715f, 13.755908f, 46.36339f)
generalPath!!.curveTo(7.690371f, 45.139633f, 3.9686508f, 42.879192f, 4.0f, 40.438f)
generalPath!!.curveTo(3.9686508f, 37.996807f, 7.690371f, 35.736366f, 13.755908f, 34.512608f)
generalPath!!.curveTo(19.821445f, 33.28885f, 27.303555f, 33.28885f, 33.36909f, 34.512608f)
generalPath!!.curveTo(39.434628f, 35.736366f, 43.15635f, 37.996807f, 43.125f, 40.438f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(23.562000274658203, 40.4379997253418), 19.562f, Point2D.Double(23.562000274658203, 40.4379997253418), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.3482399880886078f, 0.0f, 26.354999542236328f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
shape = RoundRectangle2D.Double(3.9769999980926514, 39.86800003051758, 39.04800033569336, 3.071500062942505, 1.3587599992752075, 1.3587599992752075)
paint = colorFilter?.filter(Color(164, 164, 164, 255)) ?: Color(164, 164, 164, 255)
g.paint = paint
g.fill(shape)
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
generalPath!!.moveTo(3.9268f, 40.443f)
generalPath!!.curveTo(3.9268f, 40.443f, 4.0776f, 39.912003f, 4.6308002f, 39.868f)
generalPath!!.lineTo(42.1948f, 39.868f)
generalPath!!.curveTo(42.949802f, 39.868f, 42.9998f, 40.62f, 42.9998f, 40.62f)
generalPath!!.curveTo(42.9998f, 40.62f, 43.0238f, 39.0f, 41.7158f, 39.0f)
generalPath!!.lineTo(5.3038025f, 39.0f)
generalPath!!.curveTo(4.2983027f, 39.088f, 3.9266024f, 39.78f, 3.9266024f, 40.443f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.25f, 5.7344f)
generalPath!!.lineTo(6.0f, 10.125f)
generalPath!!.curveTo(6.0f, 10.125f, 6.3125f, 9.0f, 7.0f, 9.0f)
generalPath!!.lineTo(40.125f, 9.0f)
generalPath!!.curveTo(40.828f, 8.9844f, 40.859f, 9.3125f, 40.984f, 9.8281f)
generalPath!!.lineTo(40.734f, 5.9531f)
generalPath!!.curveTo(40.703003f, 5.4062004f, 40.516003f, 5.0f, 39.953003f, 5.0f)
generalPath!!.lineTo(7.0630035f, 5.0f)
generalPath!!.curveTo(6.6094036f, 5.0f, 6.2969036f, 5.3437f, 6.2500033f, 5.7344f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(6.0, 7.5625), Point2D.Double(40.98400115966797, 7.5625), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(163, 164, 160, 255)) ?: Color(163, 164, 160, 255)),(colorFilter?.filter(Color(136, 138, 133, 255)) ?: Color(136, 138, 133, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.4386f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.8126f, 5.5405f)
generalPath!!.lineTo(38.9446f, 5.5405f)
generalPath!!.curveTo(39.6666f, 5.5405f, 40.2476f, 5.3883f, 40.2476f, 6.0146003f)
generalPath!!.curveTo(40.2476f, 6.0146003f, 42.5216f, 39.0226f, 42.5216f, 39.0226f)
generalPath!!.lineTo(42.621597f, 41.731598f)
generalPath!!.curveTo(42.621597f, 42.357597f, 42.482597f, 42.3756f, 41.760597f, 42.3756f)
generalPath!!.lineTo(4.861599f, 42.3756f)
generalPath!!.curveTo(4.448999f, 42.3756f, 4.4421988f, 42.2696f, 4.4421988f, 41.864597f)
generalPath!!.lineTo(4.4315987f, 39.193596f)
generalPath!!.lineTo(6.7276983f, 6.045597f)
generalPath!!.curveTo(6.7276983f, 5.419197f, 7.0901985f, 5.540097f, 7.812198f, 5.540097f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_0
shape = RoundRectangle2D.Double(8.5, 2.5, 2.0, 5.0, 2.0, 2.0)
paint = colorFilter?.filter(Color(252, 233, 79, 255)) ?: Color(252, 233, 79, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 111, 0, 255)) ?: Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(8.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_1
shape = RoundRectangle2D.Double(12.5, 2.5, 2.0, 5.0, 2.0, 2.0)
paint = colorFilter?.filter(Color(252, 233, 79, 255)) ?: Color(252, 233, 79, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 111, 0, 255)) ?: Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(12.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_2
shape = RoundRectangle2D.Double(16.5, 2.5, 2.0, 5.0, 2.0, 2.0)
paint = colorFilter?.filter(Color(252, 233, 79, 255)) ?: Color(252, 233, 79, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 111, 0, 255)) ?: Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(16.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_3
shape = RoundRectangle2D.Double(20.5, 2.5, 2.0, 5.0, 2.0, 2.0)
paint = colorFilter?.filter(Color(252, 233, 79, 255)) ?: Color(252, 233, 79, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 111, 0, 255)) ?: Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(20.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_4
shape = RoundRectangle2D.Double(24.5, 2.5, 2.0, 5.0, 2.0, 2.0)
paint = colorFilter?.filter(Color(252, 233, 79, 255)) ?: Color(252, 233, 79, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 111, 0, 255)) ?: Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(24.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_5
shape = RoundRectangle2D.Double(28.5, 2.5, 2.0, 5.0, 2.0, 2.0)
paint = colorFilter?.filter(Color(252, 233, 79, 255)) ?: Color(252, 233, 79, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 111, 0, 255)) ?: Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(28.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_6
shape = RoundRectangle2D.Double(32.5, 2.5, 2.0, 5.0, 2.0, 2.0)
paint = colorFilter?.filter(Color(252, 233, 79, 255)) ?: Color(252, 233, 79, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 111, 0, 255)) ?: Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(32.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_7
shape = RoundRectangle2D.Double(36.5, 2.5, 2.0, 5.0, 2.0, 2.0)
paint = colorFilter?.filter(Color(252, 233, 79, 255)) ?: Color(252, 233, 79, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 111, 0, 255)) ?: Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(36.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_0
shape = Rectangle2D.Double(9.0, 12.0, 29.0, 1.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_1
shape = Rectangle2D.Double(9.0, 14.982000350952148, 29.0, 1.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_2
shape = Rectangle2D.Double(9.0, 18.003999710083008, 13.0, 1.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_3
shape = Rectangle2D.Double(9.0, 22.986000061035156, 29.0, 1.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_4
shape = Rectangle2D.Double(9.0, 26.007999420166016, 29.0, 1.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_5
shape = Rectangle2D.Double(9.0, 29.030000686645508, 29.0, 1.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_6
shape = Rectangle2D.Double(9.0, 32.051998138427734, 8.0, 1.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.341f, 32.5f)
generalPath!!.lineTo(22.966f, 26.875f)
generalPath!!.lineTo(43.059998f, 17.125f)
generalPath!!.curveTo(46.309998f, 15.875f, 48.246998f, 20.5f, 45.371998f, 22.125f)
generalPath!!.lineTo(25.340998f, 31.5f)
generalPath!!.lineTo(17.340998f, 32.5f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(203, 144, 34, 255)) ?: Color(203, 144, 34, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(92, 65, 12, 255)) ?: Color(92, 65, 12, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.341f, 32.5f)
generalPath!!.lineTo(22.966f, 26.875f)
generalPath!!.lineTo(43.059998f, 17.125f)
generalPath!!.curveTo(46.309998f, 15.875f, 48.246998f, 20.5f, 45.371998f, 22.125f)
generalPath!!.lineTo(25.340998f, 31.5f)
generalPath!!.lineTo(17.340998f, 32.5f)
generalPath!!.closePath()
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
generalPath!!.moveTo(38.331f, 20.0f)
generalPath!!.curveTo(38.331f, 20.0f, 39.768f, 20.094f, 40.331f, 21.344f)
generalPath!!.curveTo(40.91f, 22.632f, 40.331f, 24.0f, 40.331f, 24.0f)
generalPath!!.lineTo(45.362f, 21.531f)
generalPath!!.curveTo(45.362f, 21.531f, 46.814f, 20.65f, 46.017998f, 18.688f)
generalPath!!.curveTo(45.232998f, 16.751999f, 43.330997f, 17.531f, 43.330997f, 17.531f)
generalPath!!.lineTo(38.330997f, 20.0f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(48.90599822998047, 17.375999450683594), Point2D.Double(50.987998962402344, 22.250999450683594), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 209, 209, 255)) ?: Color(255, 209, 209, 255)),(colorFilter?.filter(Color(255, 29, 29, 255)) ?: Color(255, 29, 29, 255)),(colorFilter?.filter(Color(111, 0, 0, 255)) ?: Color(111, 0, 0, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -5.669300079345703f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(38.331f, 20.0f)
generalPath!!.curveTo(38.331f, 20.0f, 39.768f, 20.094f, 40.331f, 21.344f)
generalPath!!.curveTo(40.91f, 22.632f, 40.331f, 24.0f, 40.331f, 24.0f)
generalPath!!.lineTo(42.331f, 23.0f)
generalPath!!.curveTo(42.331f, 23.0f, 43.158f, 21.681f, 42.549f, 20.312f)
generalPath!!.curveTo(41.924f, 18.906f, 40.331f, 19.0f, 40.331f, 19.0f)
generalPath!!.lineTo(38.331f, 20.0f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(46.0, 19.812000274658203), Point2D.Double(47.6879997253418, 22.625), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(193, 193, 193, 255)) ?: Color(193, 193, 193, 255)),(colorFilter?.filter(Color(172, 172, 172, 255)) ?: Color(172, 172, 172, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -5.669300079345703f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.768f, 31.781f)
generalPath!!.lineTo(23.268f, 27.281f)
generalPath!!.curveTo(24.768f, 28.094f, 25.549f, 29.438f, 25.143f, 31.0f)
generalPath!!.lineTo(18.768f, 31.781f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(29.05299949645996, 27.641000747680664), 3.2409f, Point2D.Double(29.05299949645996, 27.641000747680664), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(231, 226, 184, 255)) ?: Color(231, 226, 184, 255)),(colorFilter?.filter(Color(231, 226, 184, 0)) ?: Color(231, 226, 184, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.9235999584198f, 0.0f, 0.0f, 2.0297000408172607f, -61.55500030517578f, -27.884000778198242f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.112f, 30.375f)
generalPath!!.lineTo(18.487f, 31.969f)
generalPath!!.lineTo(20.831f, 31.656f)
generalPath!!.curveTo(21.049f, 30.938f, 20.643f, 30.594f, 20.112f, 30.375f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(25.7189998626709, 31.047000885009766), Point2D.Double(25.514999389648438, 30.702999114990234), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(201, 201, 201, 255)) ?: Color(201, 201, 201, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -5.825500011444092f, 0.125f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(23.268f, 27.25f)
generalPath!!.lineTo(24.831f, 28.5f)
generalPath!!.lineTo(40.218f, 21.181f)
generalPath!!.curveTo(39.774f, 20.324999f, 38.975998f, 20.097f, 38.315f, 20.019f)
generalPath!!.lineTo(23.267998f, 27.25f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 93)) ?: Color(255, 255, 255, 93)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.143f, 31.062f)
generalPath!!.lineTo(25.331f, 30.312f)
generalPath!!.lineTo(40.562f, 23.183f)
generalPath!!.curveTo(40.562f, 23.183f, 40.452f, 23.797f, 40.346f, 23.932001f)
generalPath!!.lineTo(25.143002f, 31.062f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 93)) ?: Color(0, 0, 0, 93)
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
            return 0.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 2.0
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
            return 45.01018142700195
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Accessories_text_editor(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Accessories_text_editor(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Accessories_text_editor(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

