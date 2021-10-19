package org.pushingpixels.demo.demo.components.ktx.svg

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
class Preferences_desktop_locale private constructor(private var width: Int, private var height: Int)
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
g.transform(AffineTransform(0.019714679569005966f, 0.0f, 0.0f, 0.033432260155677795f, 38.92491912841797f, 24.7125301361084f))
// _0_0_0
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_0
shape = Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375)
paint = LinearGradientPaint(Point2D.Double(302.8571472167969, 366.64788818359375), Point2D.Double(302.8571472167969, 609.5050659179688), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0)),(colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-219.61876f, -150.68037f)
generalPath!!.curveTo(-219.61876f, -150.68037f, -219.61876f, 327.65042f, -219.61876f, 327.65042f)
generalPath!!.curveTo(-76.74459f, 328.55087f, 125.78146f, 220.48074f, 125.78138f, 88.45424f)
generalPath!!.curveTo(125.78138f, -43.572304f, -33.655437f, -150.68036f, -219.61876f, -150.68037f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-1559.2523f, -150.68037f)
generalPath!!.curveTo(-1559.2523f, -150.68037f, -1559.2523f, 327.65042f, -1559.2523f, 327.65042f)
generalPath!!.curveTo(-1702.1265f, 328.55087f, -1904.6525f, 220.48074f, -1904.6525f, 88.45424f)
generalPath!!.curveTo(-1904.6525f, -43.572304f, -1745.2157f, -150.68036f, -1559.2523f, -150.68037f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.019714679569005966f, 0.0f, 0.0f, 0.033432260155677795f, 46.172760009765625f, 35.14236068725586f))
// _0_0_1
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1_0
shape = Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375)
paint = LinearGradientPaint(Point2D.Double(302.8571472167969, 366.64788818359375), Point2D.Double(302.8571472167969, 609.5050659179688), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0)),(colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-219.61876f, -150.68037f)
generalPath!!.curveTo(-219.61876f, -150.68037f, -219.61876f, 327.65042f, -219.61876f, 327.65042f)
generalPath!!.curveTo(-76.74459f, 328.55087f, 125.78146f, 220.48074f, 125.78138f, 88.45424f)
generalPath!!.curveTo(125.78138f, -43.572304f, -33.655437f, -150.68036f, -219.61876f, -150.68037f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-1559.2523f, -150.68037f)
generalPath!!.curveTo(-1559.2523f, -150.68037f, -1559.2523f, 327.65042f, -1559.2523f, 327.65042f)
generalPath!!.curveTo(-1702.1265f, 328.55087f, -1904.6525f, 220.48074f, -1904.6525f, 88.45424f)
generalPath!!.curveTo(-1904.6525f, -43.572304f, -1745.2157f, -150.68036f, -1559.2523f, -150.68037f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 2.1213181018829346f, 2.0329320430755615f))
// _0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(1.5021164f, 4.1593795f)
generalPath!!.curveTo(10.684459f, -2.3813581f, 27.143377f, 6.1039233f, 36.498974f, 4.1593795f)
generalPath!!.lineTo(36.498974f, 29.261671f)
generalPath!!.curveTo(27.489882f, 32.266876f, 11.897222f, 22.89771f, 1.5021164f, 29.261671f)
generalPath!!.lineTo(1.5021164f, 4.1593795f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(0.9142135381698608, 16.710525512695312), Point2D.Double(37.623104095458984, 16.710525512695312), floatArrayOf(0.0f,0.42424244f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(190, 190, 190, 255)) ?: Color(190, 190, 190, 255)),(colorFilter?.filter(Color(235, 235, 235, 255)) ?: Color(235, 235, 235, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9800599813461304f, 0.0f, 0.0f, 1.0f, 0.11610300093889236f, 0.0f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(85, 87, 83, 255)) ?: Color(85, 87, 83, 255)
stroke = BasicStroke(0.9999994f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(1.5021164f, 4.1593795f)
generalPath!!.curveTo(10.684459f, -2.3813581f, 27.143377f, 6.1039233f, 36.498974f, 4.1593795f)
generalPath!!.lineTo(36.498974f, 29.261671f)
generalPath!!.curveTo(27.489882f, 32.266876f, 11.897222f, 22.89771f, 1.5021164f, 29.261671f)
generalPath!!.lineTo(1.5021164f, 4.1593795f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.0f, 26.0f)
generalPath!!.curveTo(11.0625f, 19.9375f, 29.8125f, 29.25f, 36.0f, 26.0f)
generalPath!!.lineTo(36.0f, 23.0f)
generalPath!!.curveTo(29.3125f, 26.4375f, 11.0f, 16.8125f, 2.0f, 23.0f)
generalPath!!.lineTo(2.0f, 26.0f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(2.0, 23.791154861450195), Point2D.Double(36.0, 23.791154861450195), floatArrayOf(0.0f,0.15151516f,0.57575756f,1.0f), arrayOf((colorFilter?.filter(Color(204, 0, 0, 255)) ?: Color(204, 0, 0, 255)),(colorFilter?.filter(Color(255, 55, 55, 255)) ?: Color(255, 55, 55, 255)),(colorFilter?.filter(Color(180, 20, 20, 255)) ?: Color(180, 20, 20, 255)),(colorFilter?.filter(Color(255, 76, 76, 255)) ?: Color(255, 76, 76, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.0f, 14.751733f)
generalPath!!.curveTo(11.0625f, 8.689233f, 29.8125f, 18.001734f, 36.0f, 14.751733f)
generalPath!!.lineTo(36.0f, 11.751733f)
generalPath!!.curveTo(29.3125f, 15.189233f, 11.0f, 5.5642333f, 2.0f, 11.751733f)
generalPath!!.lineTo(2.0f, 14.751733f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(2.0, 23.791154861450195), Point2D.Double(36.0, 23.791154861450195), floatArrayOf(0.0f,0.15151516f,0.57575756f,1.0f), arrayOf((colorFilter?.filter(Color(204, 0, 0, 255)) ?: Color(204, 0, 0, 255)),(colorFilter?.filter(Color(255, 55, 55, 255)) ?: Color(255, 55, 55, 255)),(colorFilter?.filter(Color(180, 20, 20, 255)) ?: Color(180, 20, 20, 255)),(colorFilter?.filter(Color(255, 76, 76, 255)) ?: Color(255, 76, 76, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -11.248270034790039f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.0f, 20.375868f)
generalPath!!.curveTo(11.0625f, 14.313367f, 29.8125f, 23.625868f, 36.0f, 20.375868f)
generalPath!!.lineTo(36.0f, 17.375868f)
generalPath!!.curveTo(29.3125f, 20.813368f, 11.0f, 11.188367f, 2.0f, 17.375868f)
generalPath!!.lineTo(2.0f, 20.375868f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(2.0, 23.791154861450195), Point2D.Double(36.0, 23.791154861450195), floatArrayOf(0.0f,0.15151516f,0.57575756f,1.0f), arrayOf((colorFilter?.filter(Color(204, 0, 0, 255)) ?: Color(204, 0, 0, 255)),(colorFilter?.filter(Color(255, 55, 55, 255)) ?: Color(255, 55, 55, 255)),(colorFilter?.filter(Color(180, 20, 20, 255)) ?: Color(180, 20, 20, 255)),(colorFilter?.filter(Color(255, 76, 76, 255)) ?: Color(255, 76, 76, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -5.624133110046387f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.0f, 9.127602f)
generalPath!!.curveTo(11.0625f, 3.0651011f, 29.8125f, 12.377601f, 36.0f, 9.127602f)
generalPath!!.lineTo(36.0f, 6.1276016f)
generalPath!!.curveTo(29.3125f, 9.565102f, 11.0f, -0.0598988f, 2.0f, 6.1276016f)
generalPath!!.lineTo(2.0f, 9.127602f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(2.0, 23.791154861450195), Point2D.Double(36.0, 23.791154861450195), floatArrayOf(0.0f,0.15151516f,0.57575756f,1.0f), arrayOf((colorFilter?.filter(Color(204, 0, 0, 255)) ?: Color(204, 0, 0, 255)),(colorFilter?.filter(Color(255, 55, 55, 255)) ?: Color(255, 55, 55, 255)),(colorFilter?.filter(Color(180, 20, 20, 255)) ?: Color(180, 20, 20, 255)),(colorFilter?.filter(Color(255, 76, 76, 255)) ?: Color(255, 76, 76, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -16.872400283813477f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.5f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_5
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(0.9999999f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.5f, 4.7703295f)
generalPath!!.curveTo(10.477148f, -0.9579077f, 26.333595f, 6.7148733f, 35.53555f, 5.2703295f)
generalPath!!.lineTo(35.41055f, 28.560122f)
generalPath!!.curveTo(28.595705f, 30.752825f, 12.672841f, 22.855684f, 2.5625f, 27.435122f)
generalPath!!.lineTo(2.5f, 4.7703295f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.0f, 4.5f)
generalPath!!.curveTo(2.0f, 4.5f, 2.0f, 14.875f, 2.0f, 14.875f)
generalPath!!.curveTo(4.125f, 13.0f, 9.8125f, 11.625f, 19.0f, 13.5f)
generalPath!!.lineTo(19.0f, 3.0f)
generalPath!!.curveTo(15.375f, 2.125f, 5.5f, 1.0624999f, 2.0f, 4.5f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(2.0, 8.501786231994629), Point2D.Double(19.0, 8.501786231994629), floatArrayOf(0.0f,0.21212122f,1.0f), arrayOf((colorFilter?.filter(Color(32, 74, 135, 255)) ?: Color(32, 74, 135, 255)),(colorFilter?.filter(Color(63, 123, 210, 255)) ?: Color(63, 123, 210, 255)),(colorFilter?.filter(Color(32, 74, 135, 255)) ?: Color(32, 74, 135, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.9722740054130554f, -1.0606600046157837f))
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
generalPath!!.moveTo(11.502116f, 18.15938f)
generalPath!!.curveTo(20.68446f, 11.618642f, 37.143375f, 20.103924f, 46.498974f, 18.15938f)
generalPath!!.lineTo(46.498974f, 43.26167f)
generalPath!!.curveTo(37.48988f, 46.266876f, 21.897223f, 36.89771f, 11.502116f, 43.26167f)
generalPath!!.lineTo(11.502116f, 18.15938f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(11.002116203308105, 29.756582260131836), Point2D.Double(46.99897384643555, 29.756582260131836), floatArrayOf(0.0f,0.27272728f,1.0f), arrayOf((colorFilter?.filter(Color(237, 212, 0, 255)) ?: Color(237, 212, 0, 255)),(colorFilter?.filter(Color(255, 244, 145, 255)) ?: Color(255, 244, 145, 255)),(colorFilter?.filter(Color(237, 212, 0, 255)) ?: Color(237, 212, 0, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(85, 87, 83, 255)) ?: Color(85, 87, 83, 255)
stroke = BasicStroke(0.9999994f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.502116f, 18.15938f)
generalPath!!.curveTo(20.68446f, 11.618642f, 37.143375f, 20.103924f, 46.498974f, 18.15938f)
generalPath!!.lineTo(46.498974f, 43.26167f)
generalPath!!.curveTo(37.48988f, 46.266876f, 21.897223f, 36.89771f, 11.502116f, 43.26167f)
generalPath!!.lineTo(11.502116f, 18.15938f)
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
generalPath!!.moveTo(11.976621f, 18.478292f)
generalPath!!.lineTo(12.020815f, 26.61002f)
generalPath!!.curveTo(19.975765f, 21.612175f, 38.890873f, 29.350058f, 46.05033f, 26.963573f)
generalPath!!.lineTo(46.05033f, 18.522486f)
generalPath!!.curveTo(38.09538f, 20.599611f, 19.666407f, 12.202719f, 11.976621f, 18.478292f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(11.9766206741333, 21.723522186279297), Point2D.Double(46.13871765136719, 21.723522186279297), floatArrayOf(0.0f,0.27272728f,0.6363636f,1.0f), arrayOf((colorFilter?.filter(Color(46, 52, 54, 255)) ?: Color(46, 52, 54, 255)),(colorFilter?.filter(Color(80, 90, 93, 255)) ?: Color(80, 90, 93, 255)),(colorFilter?.filter(Color(20, 23, 23, 255)) ?: Color(20, 23, 23, 255)),(colorFilter?.filter(Color(46, 52, 54, 255)) ?: Color(46, 52, 54, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.976621f, 26.61002f)
generalPath!!.lineTo(12.020815f, 34.564972f)
generalPath!!.curveTo(20.682873f, 27.759068f, 37.476658f, 38.719223f, 46.050327f, 35.095303f)
generalPath!!.lineTo(46.050327f, 26.830992f)
generalPath!!.curveTo(37.918602f, 29.084894f, 20.73963f, 19.831844f, 11.976621f, 26.61002f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(11.9766206741333, 29.74867057800293), Point2D.Double(46.13871765136719, 29.74867057800293), floatArrayOf(0.0f,0.24242425f,0.6097337f,1.0f), arrayOf((colorFilter?.filter(Color(204, 0, 0, 255)) ?: Color(204, 0, 0, 255)),(colorFilter?.filter(Color(255, 71, 71, 255)) ?: Color(255, 71, 71, 255)),(colorFilter?.filter(Color(155, 18, 18, 255)) ?: Color(155, 18, 18, 255)),(colorFilter?.filter(Color(204, 0, 0, 255)) ?: Color(204, 0, 0, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.62921345f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_3
paint = LinearGradientPaint(Point2D.Double(29.01777458190918, 40.34728240966797), Point2D.Double(29.01777458190918, 17.189533233642578), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.9999999f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(12.5f, 18.68194f)
generalPath!!.curveTo(20.477148f, 12.953704f, 36.333595f, 20.626486f, 45.53555f, 19.18194f)
generalPath!!.lineTo(45.41055f, 42.56012f)
generalPath!!.curveTo(38.595703f, 44.752827f, 22.67284f, 36.855686f, 12.5625f, 41.43512f)
generalPath!!.lineTo(12.5f, 18.68194f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
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
            return 1.3753061294555664
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
            return 46.62469482421875
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 46.12656021118164
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Preferences_desktop_locale(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Preferences_desktop_locale(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Preferences_desktop_locale(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

