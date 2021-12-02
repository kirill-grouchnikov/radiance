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
class Preferences_desktop_keyboard_shortcuts private constructor(private var width: Int, private var height: Int)
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
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.000005006790161f, -2.993760108947754f))
// _0_0_0
g.composite = AlphaComposite.getInstance(3, 0.3888889f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.5241569876670837f, 0.0f, 0.0f, 0.27388399839401245f, 2.4482979774475098f, 12.695910453796387f))
// _0_0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(41.625f, 39.8125f)
generalPath!!.curveTo(41.652843f, 42.29842f, 38.34729f, 44.600277f, 32.960007f, 45.84646f)
generalPath!!.curveTo(27.572727f, 47.09264f, 20.927273f, 47.09264f, 15.539991f, 45.84646f)
generalPath!!.curveTo(10.15271f, 44.600277f, 6.8471565f, 42.29842f, 6.875f, 39.8125f)
generalPath!!.curveTo(6.8471565f, 37.32658f, 10.15271f, 35.024723f, 15.539991f, 33.77854f)
generalPath!!.curveTo(20.927273f, 32.53236f, 27.572727f, 32.53236f, 32.960007f, 33.77854f)
generalPath!!.curveTo(38.34729f, 35.024723f, 41.652843f, 37.32658f, 41.625f, 39.8125f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.25, 39.8125), 17.375f, Point2D.Double(24.25, 39.8125), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.39928099513053894f, 1.3877779866880576E-16f, 23.916139602661133f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_0_1
shape = RoundRectangle2D.Double(5.495044231414795, 4.505629539489746, 19.989471435546875, 20.943740844726562, 4.898674011230469, 5.132530212402344)
paint = RadialGradientPaint(Point2D.Double(15.489779472351074, 6.2493181228637695), 10.494735f, Point2D.Double(15.489779472351074, 6.2493181228637695), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(248, 248, 247, 255)) ?: Color(248, 248, 247, 255)),(colorFilter?.filter(Color(186, 189, 182, 255)) ?: Color(186, 189, 182, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.2032740116119385f, -9.403162886887224E-17f, 4.212765016155811E-17f, 0.9813519716262817f, -18.638450622558594f, -0.28028398752212524f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 138, 133, 255)) ?: Color(136, 138, 133, 255)
stroke = BasicStroke(0.9999993f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(5.495044231414795, 4.505629539489746, 19.989471435546875, 20.943740844726562, 4.898674011230469, 5.132530212402344)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_2
shape = RoundRectangle2D.Double(-22.537153244018555, 7.234417915344238, 14.074298858642578, 13.327302932739258, 3.4490861892700195, 3.2660250663757324)
paint = RadialGradientPaint(Point2D.Double(24.500003814697266, 29.500003814697266), 15.095438f, Point2D.Double(24.500003814697266, 29.500003814697266), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(242, 244, 241, 255)) ?: Color(242, 244, 241, 255)),(colorFilter?.filter(Color(211, 215, 207, 255)) ?: Color(211, 215, 207, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0452109575271606f, -2.149016025506154E-16f, 2.269468875166044E-16f, 0.989736020565033f, -41.107669830322266f, -11.6466703414917f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(24.095441818237305, 12.595438003540039), Point2D.Double(24.095441818237305, 34.09543991088867), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(238, 238, 236, 255)) ?: Color(238, 238, 236, 255)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.4821470081806183f, 0.0f, 0.0f, 0.4565570056438446f, -27.117549896240234f, 4.266796112060547f))
stroke = BasicStroke(0.9999998f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(-22.537153244018555, 7.234417915344238, 14.074298858642578, 13.327302932739258, 3.4490861892700195, 3.2660250663757324)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.48888892f * origAlpha)
// _0_0_0_3
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(0.9999997f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.489673137664795, 5.500080108642578, 18.02066421508789, 18.996723175048828, 3.1135053634643555, 3.1135053634643555)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 0.48888892f * origAlpha)
// _0_0_0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.975835f, 22.771961f)
generalPath!!.curveTo(6.920206f, 23.604708f, 7.4649177f, 24.090702f, 8.383736f, 24.022097f)
generalPath!!.lineTo(9.265165f, 20.851969f)
generalPath!!.lineTo(8.619088f, 20.469515f)
generalPath!!.lineTo(6.975835f, 22.771961f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 0.48888892f * origAlpha)
// _0_0_0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(24.054497f, 22.998959f)
generalPath!!.curveTo(23.867056f, 23.942188f, 23.167665f, 24.052534f, 22.337234f, 24.05022f)
generalPath!!.lineTo(21.522097f, 20.96848f)
generalPath!!.lineTo(22.190271f, 20.563929f)
generalPath!!.lineTo(24.054497f, 22.998959f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(24.029566f, 7.081846f)
generalPath!!.curveTo(23.977024f, 6.4997454f, 23.650196f, 6.0533137f, 23.015554f, 6.0f)
generalPath!!.lineTo(22.15468f, 7.1442795f)
generalPath!!.lineTo(22.756563f, 7.778922f)
generalPath!!.lineTo(24.029566f, 7.081846f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(38.29299545288086, 6.717449188232422), Point2D.Double(39.4375, 8.161993026733398), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5241569876670837f, 0.0f, 0.0f, 0.5241569876670837f, 2.4096200466156006f, 3.2809340953826904f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_0_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.903371f, 6.982795f)
generalPath!!.curveTo(7.0443015f, 6.4669857f, 7.4488535f, 6.0312166f, 8.017205f, 6.0f)
generalPath!!.lineTo(8.779029f, 7.187702f)
generalPath!!.lineTo(8.219797f, 7.822345f)
generalPath!!.lineTo(6.903371f, 6.982795f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.116878509521484, 7.933439254760742), Point2D.Double(9.067480087280273, 6.784390926361084), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5241569876670837f, 0.0f, 0.0f, 0.5241569876670837f, 3.5291080474853516f, 3.248173952102661f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.384225994348526f, 0.0f, 0.0f, 0.384225994348526f, 25.257190704345703f, 17.865219116210938f))
// _0_0_1
paint = colorFilter?.filter(Color(32, 74, 135, 255)) ?: Color(32, 74, 135, 255)
stroke = BasicStroke(5.20527f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(44.724503f, 19.538952f)
generalPath!!.curveTo(44.746315f, 24.416483f, 42.1567f, 28.932869f, 37.936234f, 31.377954f)
generalPath!!.curveTo(33.715767f, 33.823036f, 28.50963f, 33.823036f, 24.289162f, 31.377954f)
generalPath!!.curveTo(20.068693f, 28.932869f, 17.47908f, 24.416483f, 17.500893f, 19.538952f)
generalPath!!.curveTo(17.47908f, 14.661421f, 20.068693f, 10.145034f, 24.289162f, 7.6999497f)
generalPath!!.curveTo(28.50963f, 5.2548656f, 33.715767f, 5.2548656f, 37.936234f, 7.6999497f)
generalPath!!.curveTo(42.1567f, 10.145034f, 44.746315f, 14.661421f, 44.724503f, 19.538952f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 20.004959106445312f, -2.9431300163269043f))
// _0_0_2
g.composite = AlphaComposite.getInstance(3, 0.3888889f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.5241569876670837f, 0.0f, 0.0f, 0.27388399839401245f, 2.4482979774475098f, 12.695910453796387f))
// _0_0_2_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(41.625f, 39.8125f)
generalPath!!.curveTo(41.652843f, 42.29842f, 38.34729f, 44.600277f, 32.960007f, 45.84646f)
generalPath!!.curveTo(27.572727f, 47.09264f, 20.927273f, 47.09264f, 15.539991f, 45.84646f)
generalPath!!.curveTo(10.15271f, 44.600277f, 6.8471565f, 42.29842f, 6.875f, 39.8125f)
generalPath!!.curveTo(6.8471565f, 37.32658f, 10.15271f, 35.024723f, 15.539991f, 33.77854f)
generalPath!!.curveTo(20.927273f, 32.53236f, 27.572727f, 32.53236f, 32.960007f, 33.77854f)
generalPath!!.curveTo(38.34729f, 35.024723f, 41.652843f, 37.32658f, 41.625f, 39.8125f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.25, 39.8125), 17.375f, Point2D.Double(24.25, 39.8125), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.39928099513053894f, 8.146703933198732E-14f, 23.916139602661133f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2_1
shape = RoundRectangle2D.Double(5.495044231414795, 4.505629539489746, 19.989471435546875, 20.943740844726562, 4.898674011230469, 5.132530212402344)
paint = colorFilter?.filter(Color(186, 189, 182, 255)) ?: Color(186, 189, 182, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 138, 133, 255)) ?: Color(136, 138, 133, 255)
stroke = BasicStroke(0.9999993f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(5.495044231414795, 4.505629539489746, 19.989471435546875, 20.943740844726562, 4.898674011230469, 5.132530212402344)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_2
shape = RoundRectangle2D.Double(-22.537153244018555, 7.234417915344238, 14.074298858642578, 13.327302932739258, 3.4490861892700195, 3.2660250663757324)
paint = RadialGradientPaint(Point2D.Double(24.500003814697266, 29.500003814697266), 15.095438f, Point2D.Double(24.500003814697266, 29.500003814697266), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(242, 244, 241, 255)) ?: Color(242, 244, 241, 255)),(colorFilter?.filter(Color(211, 215, 207, 255)) ?: Color(211, 215, 207, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0452109575271606f, -2.149016025506154E-16f, 2.269468875166044E-16f, 0.989736020565033f, -41.107669830322266f, -11.6466703414917f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(24.095441818237305, 12.595438003540039), Point2D.Double(24.095441818237305, 34.09543991088867), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(238, 238, 236, 255)) ?: Color(238, 238, 236, 255)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.4821470081806183f, 0.0f, 0.0f, 0.4565570056438446f, -27.117549896240234f, 4.266796112060547f))
stroke = BasicStroke(0.9999998f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(-22.537153244018555, 7.234417915344238, 14.074298858642578, 13.327302932739258, 3.4490861892700195, 3.2660250663757324)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.48888892f * origAlpha)
// _0_0_2_3
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(0.9999997f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.489673137664795, 5.500080108642578, 18.02066421508789, 18.996723175048828, 3.1135053634643555, 3.1135053634643555)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 0.48888892f * origAlpha)
// _0_0_2_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.975835f, 22.771961f)
generalPath!!.curveTo(6.920206f, 23.604708f, 7.4649177f, 24.090702f, 8.383736f, 24.022097f)
generalPath!!.lineTo(9.265165f, 20.851969f)
generalPath!!.lineTo(8.619088f, 20.469515f)
generalPath!!.lineTo(6.975835f, 22.771961f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 0.48888892f * origAlpha)
// _0_0_2_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(24.054497f, 22.998959f)
generalPath!!.curveTo(23.867056f, 23.942188f, 23.167665f, 24.052534f, 22.337234f, 24.05022f)
generalPath!!.lineTo(21.522097f, 20.96848f)
generalPath!!.lineTo(22.190271f, 20.563929f)
generalPath!!.lineTo(24.054497f, 22.998959f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(24.029566f, 7.081846f)
generalPath!!.curveTo(23.977024f, 6.4997454f, 23.650196f, 6.0533137f, 23.015554f, 6.0f)
generalPath!!.lineTo(22.15468f, 7.1442795f)
generalPath!!.lineTo(22.756563f, 7.778922f)
generalPath!!.lineTo(24.029566f, 7.081846f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(38.29299545288086, 6.717449188232422), Point2D.Double(39.4375, 8.161993026733398), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5241569876670837f, 0.0f, 0.0f, 0.5241569876670837f, 2.4096200466156006f, 3.2809340953826904f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.903371f, 6.982795f)
generalPath!!.curveTo(7.0443015f, 6.4669857f, 7.4488535f, 6.0312166f, 8.017205f, 6.0f)
generalPath!!.lineTo(8.779029f, 7.187702f)
generalPath!!.lineTo(8.219797f, 7.822345f)
generalPath!!.lineTo(6.903371f, 6.982795f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.116878509521484, 7.933439254760742), Point2D.Double(9.067480087280273, 6.784390926361084), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5241569876670837f, 0.0f, 0.0f, 0.5241569876670837f, 3.5291080474853516f, 3.248173952102661f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.005411982536316f, -2.9845149517059326f, 19.97269058227539f))
// _0_0_3
g.composite = AlphaComposite.getInstance(3, 0.3888889f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.5241569876670837f, 0.0f, 0.0f, 0.27388399839401245f, 2.4482979774475098f, 12.695910453796387f))
// _0_0_3_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(41.625f, 39.8125f)
generalPath!!.curveTo(41.652843f, 42.29842f, 38.34729f, 44.600277f, 32.960007f, 45.84646f)
generalPath!!.curveTo(27.572727f, 47.09264f, 20.927273f, 47.09264f, 15.539991f, 45.84646f)
generalPath!!.curveTo(10.15271f, 44.600277f, 6.8471565f, 42.29842f, 6.875f, 39.8125f)
generalPath!!.curveTo(6.8471565f, 37.32658f, 10.15271f, 35.024723f, 15.539991f, 33.77854f)
generalPath!!.curveTo(20.927273f, 32.53236f, 27.572727f, 32.53236f, 32.960007f, 33.77854f)
generalPath!!.curveTo(38.34729f, 35.024723f, 41.652843f, 37.32658f, 41.625f, 39.8125f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.25, 39.8125), 17.375f, Point2D.Double(24.25, 39.8125), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.39928099513053894f, 1.474514028138E-16f, 23.916139602661133f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_3_1
shape = RoundRectangle2D.Double(6.365069389343262, 4.505629539489746, 33.15983581542969, 20.943740844726562, 5.132530689239502, 5.104902267456055)
paint = colorFilter?.filter(Color(186, 189, 182, 255)) ?: Color(186, 189, 182, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 138, 133, 255)) ?: Color(136, 138, 133, 255)
stroke = BasicStroke(0.99730414f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.365069389343262, 4.505629539489746, 33.15983581542969, 20.943740844726562, 5.132530689239502, 5.104902267456055)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_3_2
shape = RoundRectangle2D.Double(9.190199851989746, 7.44936990737915, 27.299530029296875, 13.050630569458008, 2.6410248279571533, 2.6268086433410645)
paint = RadialGradientPaint(Point2D.Double(32.124046325683594, 31.886716842651367), 15.095438f, Point2D.Double(32.124046325683594, 31.886716842651367), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(242, 244, 241, 255)) ?: Color(242, 244, 241, 255)),(colorFilter?.filter(Color(211, 215, 207, 255)) ?: Color(211, 215, 207, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9507520198822021f, -2.149016025506154E-16f, 2.0643689790623775E-16f, 0.989736020565033f, -7.702035903930664f, -11.431719779968262f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(24.095441818237305, 12.595438003540039), Point2D.Double(24.095441818237305, 34.09543991088867), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(238, 238, 236, 255)) ?: Color(238, 238, 236, 255)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.4385739862918854f, 0.0f, 0.0f, 0.4565570056438446f, 5.023748874664307f, 4.481748104095459f))
stroke = BasicStroke(0.99730474f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(9.190199851989746, 7.44936990737915, 27.299530029296875, 13.050630569458008, 2.6410248279571533, 2.6268086433410645)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 0.48888892f * origAlpha)
// _0_0_3_3
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(0.99730456f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(7.3617119789123535, 5.437580108642578, 31.215261459350586, 18.996723175048828, 3.1135053634643555, 3.096745729446411)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 0.48888892f * origAlpha)
// _0_0_3_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.96021f, 22.928211f)
generalPath!!.curveTo(7.920206f, 23.604708f, 8.730542f, 23.981327f, 9.086861f, 23.943972f)
generalPath!!.lineTo(10.12454f, 20.883219f)
generalPath!!.lineTo(9.353463f, 20.29764f)
generalPath!!.lineTo(7.96021f, 22.928211f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 0.48888892f * origAlpha)
// _0_0_3_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(38.516914f, 22.835573f)
generalPath!!.curveTo(38.329475f, 23.778805f, 37.63008f, 23.88915f, 36.799652f, 23.886835f)
generalPath!!.lineTo(35.984516f, 20.805096f)
generalPath!!.lineTo(36.65269f, 20.400543f)
generalPath!!.lineTo(38.516914f, 22.835573f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_3_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(37.8594f, 6.968716f)
generalPath!!.curveTo(37.806858f, 6.3866153f, 37.480034f, 5.9401836f, 36.84539f, 5.88687f)
generalPath!!.lineTo(35.984516f, 7.0311494f)
generalPath!!.lineTo(36.5864f, 7.6657925f)
generalPath!!.lineTo(37.8594f, 6.968716f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(38.29299545288086, 6.717449188232422), Point2D.Double(39.4375, 8.161993026733398), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5241569876670837f, 0.0f, 0.0f, 0.5241569876670837f, 16.239459991455078f, 3.167804002761841f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_3_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.984515f, 6.932165f)
generalPath!!.curveTo(8.125445f, 6.4163556f, 8.529998f, 5.9805865f, 9.09835f, 5.94937f)
generalPath!!.lineTo(9.860173f, 7.137072f)
generalPath!!.lineTo(9.300941f, 7.7717147f)
generalPath!!.lineTo(7.984515f, 6.932165f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.116878509521484, 7.933439254760742), Point2D.Double(9.067480087280273, 6.784390926361084), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5241569876670837f, 0.0f, 0.0f, 0.5241569876670837f, 4.6102519035339355f, 3.1975440979003906f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.61914f, 8.9375f)
generalPath!!.lineTo(15.37793f, 14.635742f)
generalPath!!.curveTo(15.159828f, 15.185871f, 14.889646f, 15.597655f, 14.567383f, 15.871094f)
generalPath!!.curveTo(14.245116f, 16.147783f, 13.872395f, 16.28613f, 13.449219f, 16.286133f)
generalPath!!.curveTo(13.292968f, 16.28613f, 13.12858f, 16.2666f, 12.956055f, 16.22754f)
generalPath!!.lineTo(12.956055f, 15.329102f)
generalPath!!.curveTo(13.148112f, 15.387694f, 13.322265f, 15.416991f, 13.478516f, 15.416992f)
generalPath!!.curveTo(13.667317f, 15.416991f, 13.839843f, 15.360025f, 13.996094f, 15.246094f)
generalPath!!.curveTo(14.155597f, 15.135415f, 14.284178f, 14.966145f, 14.381836f, 14.738281f)
generalPath!!.lineTo(14.728516f, 13.9375f)
generalPath!!.lineTo(12.746094f, 8.9375f)
generalPath!!.lineTo(13.795898f, 8.9375f)
generalPath!!.lineTo(15.089844f, 12.6875f)
generalPath!!.curveTo(15.112628f, 12.746095f, 15.141925f, 12.876303f, 15.177734f, 13.078125f)
generalPath!!.lineTo(15.207031f, 13.078125f)
generalPath!!.curveTo(15.255857f, 12.873048f, 15.290036f, 12.74284f, 15.30957f, 12.6875f)
generalPath!!.lineTo(16.637695f, 8.9375f)
generalPath!!.lineTo(17.61914f, 8.9375f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.714844f, 8.9375f)
generalPath!!.lineTo(38.035156f, 11.457031f)
generalPath!!.lineTo(39.70508f, 13.9375f)
generalPath!!.lineTo(38.606445f, 13.9375f)
generalPath!!.lineTo(37.4541f, 11.989258f)
generalPath!!.lineTo(36.262695f, 13.9375f)
generalPath!!.lineTo(35.183594f, 13.9375f)
generalPath!!.lineTo(36.907227f, 11.476562f)
generalPath!!.lineTo(35.286133f, 8.9375f)
generalPath!!.lineTo(36.384766f, 8.9375f)
generalPath!!.lineTo(37.493164f, 10.978516f)
generalPath!!.lineTo(38.68457f, 8.9375f)
generalPath!!.lineTo(39.714844f, 8.9375f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(14.385742f, 38.052734f)
generalPath!!.curveTo(13.851883f, 38.348957f, 13.189449f, 38.49707f, 12.398438f, 38.49707f)
generalPath!!.curveTo(11.405596f, 38.49707f, 10.609699f, 38.176434f, 10.010742f, 37.535156f)
generalPath!!.curveTo(9.415038f, 36.893883f, 9.1171875f, 36.050785f, 9.1171875f, 35.00586f)
generalPath!!.curveTo(9.1171875f, 33.89584f, 9.458983f, 32.994144f, 10.142578f, 32.30078f)
generalPath!!.curveTo(10.829425f, 31.604174f, 11.680661f, 31.255865f, 12.696289f, 31.25586f)
generalPath!!.curveTo(13.383133f, 31.255865f, 13.946284f, 31.35515f, 14.385742f, 31.55371f)
generalPath!!.lineTo(14.385742f, 32.583984f)
generalPath!!.curveTo(13.868159f, 32.278f, 13.301753f, 32.125008f, 12.686523f, 32.125f)
generalPath!!.curveTo(11.924801f, 32.125008f, 11.304685f, 32.382168f, 10.826172f, 32.896484f)
generalPath!!.curveTo(10.347655f, 33.40756f, 10.108397f, 34.094406f, 10.108398f, 34.95703f)
generalPath!!.curveTo(10.108397f, 35.77409f, 10.329751f, 36.425133f, 10.772461f, 36.910156f)
generalPath!!.curveTo(11.215167f, 37.39193f, 11.802731f, 37.632812f, 12.535156f, 37.632812f)
generalPath!!.curveTo(13.244787f, 37.632812f, 13.861648f, 37.463543f, 14.385742f, 37.125f)
generalPath!!.lineTo(14.385742f, 38.052734f)
generalPath!!.moveTo(18.13086f, 38.30664f)
generalPath!!.curveTo(17.925777f, 38.41081f, 17.662107f, 38.46289f, 17.339844f, 38.46289f)
generalPath!!.curveTo(16.874348f, 38.46289f, 16.52604f, 38.337566f, 16.294922f, 38.086914f)
generalPath!!.curveTo(16.0638f, 37.833008f, 15.948241f, 37.45215f, 15.948242f, 36.944336f)
generalPath!!.lineTo(15.948242f, 34.126953f)
generalPath!!.lineTo(15.108398f, 34.126953f)
generalPath!!.lineTo(15.108398f, 33.375f)
generalPath!!.lineTo(15.948242f, 33.375f)
generalPath!!.lineTo(15.948242f, 32.183594f)
generalPath!!.lineTo(16.890625f, 31.885742f)
generalPath!!.lineTo(16.890625f, 33.375f)
generalPath!!.lineTo(18.13086f, 33.375f)
generalPath!!.lineTo(18.13086f, 34.126953f)
generalPath!!.lineTo(16.890625f, 34.126953f)
generalPath!!.lineTo(16.890625f, 36.76367f)
generalPath!!.curveTo(16.890623f, 37.089195f, 16.945961f, 37.32194f, 17.05664f, 37.461914f)
generalPath!!.curveTo(17.167315f, 37.598633f, 17.361f, 37.666992f, 17.637695f, 37.666992f)
generalPath!!.curveTo(17.816729f, 37.666992f, 17.981117f, 37.61328f, 18.13086f, 37.50586f)
generalPath!!.lineTo(18.13086f, 38.30664f)
generalPath!!.moveTo(22.011719f, 34.336914f)
generalPath!!.curveTo(21.842445f, 34.222984f, 21.625973f, 34.16602f, 21.362305f, 34.166016f)
generalPath!!.curveTo(21.049803f, 34.16602f, 20.50488f, 34.30925f, 20.29004f, 34.595703f)
generalPath!!.curveTo(20.075193f, 34.882164f, 19.967772f, 35.261395f, 19.967773f, 35.7334f)
generalPath!!.lineTo(19.967773f, 38.375f)
generalPath!!.lineTo(19.030273f, 38.375f)
generalPath!!.lineTo(19.030273f, 33.375f)
generalPath!!.lineTo(19.967773f, 33.375f)
generalPath!!.lineTo(19.967773f, 34.36621f)
generalPath!!.curveTo(20.088215f, 34.014652f, 20.263994f, 33.747726f, 20.495117f, 33.56543f)
generalPath!!.curveTo(20.726234f, 33.379887f, 21.259764f, 33.287113f, 21.533203f, 33.28711f)
generalPath!!.curveTo(21.738277f, 33.287113f, 21.897783f, 33.309902f, 22.011719f, 33.35547f)
generalPath!!.lineTo(22.011719f, 34.336914f)
generalPath!!.moveTo(24.00586f, 38.375f)
generalPath!!.lineTo(23.058594f, 38.375f)
generalPath!!.lineTo(23.058594f, 30.972656f)
generalPath!!.lineTo(24.00586f, 30.972656f)
generalPath!!.lineTo(24.00586f, 38.375f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_7
paint = colorFilter?.filter(Color(32, 74, 135, 255)) ?: Color(32, 74, 135, 255)
stroke = BasicStroke(2.0000005f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(3.1503379344940186, 23.928627014160156, 33.6993293762207, 22.14276123046875, 5.800036430358887, 5.800036430358887)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_8
paint = colorFilter?.filter(Color(32, 74, 135, 255)) ?: Color(32, 74, 135, 255)
stroke = BasicStroke(2.0000012f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(25.063217163085938, 1.1243784427642822, 20.877464294433594, 21.7812557220459, 5.446484088897705, 5.446484088897705)
g.paint = paint
g.stroke = stroke
g.draw(shape)

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
            return 1.995039701461792
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.12437784671783447
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 44.945640563964844
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 46.9470100402832
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Preferences_desktop_keyboard_shortcuts(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Preferences_desktop_keyboard_shortcuts(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Preferences_desktop_keyboard_shortcuts(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

