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

import org.pushingpixels.neon.api.icon.NeonIcon
import org.pushingpixels.neon.api.icon.NeonIcon.Factory
import org.pushingpixels.neon.api.icon.NeonIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Folder private constructor(private var width: Int, private var height: Int)
       : NeonIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var colorFilter: NeonIcon.ColorFilter? = null
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
g.transform(AffineTransform(0.022624000906944275f, 0.0f, 0.0f, 0.020867999643087387f, 43.382999420166016f, 36.369998931884766f))
// _0_0_0
g.composite = AlphaComposite.getInstance(3, 0.40206f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_0
shape = Rectangle2D.Double(-1559.300048828125, -150.6999969482422, 1339.5999755859375, 478.3599853515625)
paint = LinearGradientPaint(Point2D.Double(302.8599853515625, 366.6499938964844), Point2D.Double(302.8599853515625, 609.510009765625), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0)),(colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.774399995803833f, 0.0f, 0.0f, 1.9696999788284302f, -1892.199951171875f, -872.8900146484375f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.40206f * origAlpha)
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
g.composite = AlphaComposite.getInstance(3, 0.40206f * origAlpha)
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
generalPath!!.moveTo(4.5218f, 38.687f)
generalPath!!.curveTo(4.5436f, 39.104f, 4.9817f, 39.52f, 5.3980002f, 39.52f)
generalPath!!.lineTo(36.725f, 39.52f)
generalPath!!.curveTo(37.141f, 39.52f, 37.536f, 39.104f, 37.514f, 38.687f)
generalPath!!.lineTo(36.578f, 11.461f)
generalPath!!.curveTo(36.556f, 11.044001f, 36.118f, 10.628f, 35.701f, 10.628f)
generalPath!!.lineTo(22.431f, 10.628f)
generalPath!!.curveTo(21.945f, 10.628f, 21.196f, 10.312f, 21.029f, 9.5214f)
generalPath!!.lineTo(20.417f, 6.628401f)
generalPath!!.curveTo(20.262f, 5.8927007f, 19.535f, 5.590501f, 19.119f, 5.590501f)
generalPath!!.lineTo(4.339999f, 5.590501f)
generalPath!!.curveTo(3.9237993f, 5.590501f, 3.5292993f, 6.0068007f, 3.5510993f, 6.423101f)
generalPath!!.lineTo(4.521799f, 38.6871f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(20.70599937438965, 37.518001556396484), 30.905f, Point2D.Double(20.70599937438965, 37.518001556396484), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(32, 32, 32, 255)) ?: Color(32, 32, 32, 255)),(colorFilter?.filter(Color(185, 185, 185, 255)) ?: Color(185, 185, 185, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0549999475479126f, -0.027344999834895134f, 0.1776999980211258f, 1.1908999681472778f, -3.572200059890747f, -7.12529993057251f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(18.113000869750977, 31.368000030517578), Point2D.Double(15.515000343322754, 6.180300235748291), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(66, 66, 66, 255)) ?: Color(66, 66, 66, 255)),(colorFilter?.filter(Color(119, 119, 119, 255)) ?: Color(119, 119, 119, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.5218f, 38.687f)
generalPath!!.curveTo(4.5436f, 39.104f, 4.9817f, 39.52f, 5.3980002f, 39.52f)
generalPath!!.lineTo(36.725f, 39.52f)
generalPath!!.curveTo(37.141f, 39.52f, 37.536f, 39.104f, 37.514f, 38.687f)
generalPath!!.lineTo(36.578f, 11.461f)
generalPath!!.curveTo(36.556f, 11.044001f, 36.118f, 10.628f, 35.701f, 10.628f)
generalPath!!.lineTo(22.431f, 10.628f)
generalPath!!.curveTo(21.945f, 10.628f, 21.196f, 10.312f, 21.029f, 9.5214f)
generalPath!!.lineTo(20.417f, 6.628401f)
generalPath!!.curveTo(20.262f, 5.8927007f, 19.535f, 5.590501f, 19.119f, 5.590501f)
generalPath!!.lineTo(4.339999f, 5.590501f)
generalPath!!.curveTo(3.9237993f, 5.590501f, 3.5292993f, 6.0068007f, 3.5510993f, 6.423101f)
generalPath!!.lineTo(4.521799f, 38.6871f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.2266f, 22.562f)
generalPath!!.lineTo(35.4916f, 22.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.2266f, 22.562f)
generalPath!!.lineTo(35.4916f, 22.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0422f, 18.562f)
generalPath!!.lineTo(35.4892f, 18.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0422f, 18.562f)
generalPath!!.lineTo(35.4892f, 18.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.9807f, 12.562f)
generalPath!!.lineTo(35.4877f, 12.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.9807f, 12.562f)
generalPath!!.lineTo(35.4877f, 12.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3862f, 32.562f)
generalPath!!.lineTo(35.4952f, 32.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3862f, 32.562f)
generalPath!!.lineTo(35.4952f, 32.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.5091f, 34.562f)
generalPath!!.lineTo(35.4971f, 34.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.5091f, 34.562f)
generalPath!!.lineTo(35.4971f, 34.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0422f, 16.562f)
generalPath!!.lineTo(35.4892f, 16.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0422f, 16.562f)
generalPath!!.lineTo(35.4892f, 16.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0114f, 14.562f)
generalPath!!.lineTo(35.489403f, 14.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0114f, 14.562f)
generalPath!!.lineTo(35.489403f, 14.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.9221f, 10.562f)
generalPath!!.lineTo(20.2031f, 10.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.9221f, 10.562f)
generalPath!!.lineTo(20.2031f, 10.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.8738f, 8.5625f)
generalPath!!.lineTo(19.6568f, 8.5625f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.8738f, 8.5625f)
generalPath!!.lineTo(19.6568f, 8.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3247f, 28.562f)
generalPath!!.lineTo(35.493702f, 28.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3247f, 28.562f)
generalPath!!.lineTo(35.493702f, 28.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.2881f, 26.562f)
generalPath!!.lineTo(35.4931f, 26.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.2881f, 26.562f)
generalPath!!.lineTo(35.4931f, 26.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.2266f, 24.562f)
generalPath!!.lineTo(35.4916f, 24.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.2266f, 24.562f)
generalPath!!.lineTo(35.4916f, 24.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.1959f, 20.562f)
generalPath!!.lineTo(35.491898f, 20.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.1959f, 20.562f)
generalPath!!.lineTo(35.491898f, 20.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3247f, 30.562f)
generalPath!!.lineTo(35.493702f, 30.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3247f, 30.562f)
generalPath!!.lineTo(35.493702f, 30.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.5091f, 36.562f)
generalPath!!.lineTo(35.4971f, 36.562f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.5091f, 36.562f)
generalPath!!.lineTo(35.4971f, 36.562f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.45143f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.0683f, 38.864f)
generalPath!!.curveTo(6.0846996f, 39.176f, 5.8873997f, 39.384f, 5.5698f, 39.28f)
generalPath!!.curveTo(5.2521f, 39.176f, 5.033f, 38.968f, 5.0167f, 38.656f)
generalPath!!.lineTo(4.069f, 6.5909996f)
generalPath!!.curveTo(4.0526f, 6.2791996f, 4.2341f, 6.0905995f, 4.5463996f, 6.0905995f)
generalPath!!.lineTo(18.9684f, 6.0428996f)
generalPath!!.curveTo(19.281399f, 6.0428996f, 19.900398f, 6.3433995f, 20.101398f, 7.3650994f)
generalPath!!.lineTo(20.675398f, 10.181f)
generalPath!!.curveTo(20.248398f, 9.7154f, 20.256397f, 9.701f, 20.037397f, 9.0239f)
generalPath!!.lineTo(19.631397f, 7.7647f)
generalPath!!.curveTo(19.412397f, 7.0371f, 18.933397f, 6.9328f, 18.621397f, 6.9328f)
generalPath!!.lineTo(5.7333975f, 6.9328f)
generalPath!!.curveTo(5.4211974f, 6.9328f, 5.2238975f, 7.141f, 5.2402973f, 7.4532f)
generalPath!!.lineTo(6.1782975f, 38.9682f)
generalPath!!.lineTo(6.0686975f, 38.8642f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(6.229800224304199, 13.77299976348877), Point2D.Double(9.898099899291992, 66.83399963378906), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 223)) ?: Color(255, 255, 255, 223)),(colorFilter?.filter(Color(255, 255, 254, 0)) ?: Color(255, 255, 254, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.516800045967102f, 0.0f, 0.0f, 0.7089800238609314f, -0.8795700073242188f, -1.3181999921798706f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0407999753952026f, 0.0f, 0.054492998868227005f, 1.0407999753952026f, -8.67020034790039f, 2.670599937438965f))
// _0_0_18
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_18_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(42.417f, 8.5152f)
generalPath!!.curveTo(42.422f, 8.418099f, 42.289f, 8.2682f, 42.182f, 8.2682f)
generalPath!!.lineTo(29.151f, 8.2661f)
generalPath!!.curveTo(29.151f, 8.2661f, 30.061998f, 8.854f, 31.352f, 8.8623f)
generalPath!!.lineTo(42.406f, 8.9333f)
generalPath!!.curveTo(42.417f, 8.7216f, 42.408997f, 8.6773f, 42.417f, 8.5152f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 130)) ?: Color(255, 255, 255, 130)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_19
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.784f, 39.511f)
generalPath!!.curveTo(40.927002f, 39.467003f, 41.747f, 38.414f, 41.831f, 37.190002f)
generalPath!!.curveTo(42.622f, 25.641003f, 43.49f, 15.958002f, 43.49f, 15.958002f)
generalPath!!.curveTo(43.562f, 15.710002f, 43.322002f, 15.463002f, 43.010002f, 15.463002f)
generalPath!!.lineTo(8.639004f, 15.463002f)
generalPath!!.curveTo(8.638604f, 15.463002f, 6.788304f, 37.33f, 6.788304f, 37.33f)
generalPath!!.curveTo(6.673804f, 38.312f, 6.322304f, 39.134003f, 5.238504f, 39.513f)
generalPath!!.lineTo(39.784504f, 39.511f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(22.176000595092773, 36.987998962402344), Point2D.Double(22.065000534057617, 32.04999923706055), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(97, 148, 203, 255)) ?: Color(97, 148, 203, 255)),(colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255)
stroke = BasicStroke(1.0f,0,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.784f, 39.511f)
generalPath!!.curveTo(40.927002f, 39.467003f, 41.747f, 38.414f, 41.831f, 37.190002f)
generalPath!!.curveTo(42.622f, 25.641003f, 43.49f, 15.958002f, 43.49f, 15.958002f)
generalPath!!.curveTo(43.562f, 15.710002f, 43.322002f, 15.463002f, 43.010002f, 15.463002f)
generalPath!!.lineTo(8.639004f, 15.463002f)
generalPath!!.curveTo(8.638604f, 15.463002f, 6.788304f, 37.33f, 6.788304f, 37.33f)
generalPath!!.curveTo(6.673804f, 38.312f, 6.322304f, 39.134003f, 5.238504f, 39.513f)
generalPath!!.lineTo(39.784504f, 39.511f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.46591f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_20
paint = LinearGradientPaint(Point2D.Double(13.03600025177002, 32.56700134277344), Point2D.Double(12.854000091552734, 46.68899917602539), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3174999952316284f, 0.0f, 0.0f, 0.8162599802017212f, -0.8795700073242188f, -1.3181999921798706f))
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.6202f, 16.464f)
generalPath!!.lineTo(42.4112f, 16.529001f)
generalPath!!.lineTo(40.8372f, 36.531002f)
generalPath!!.curveTo(40.7532f, 37.602f, 40.3872f, 37.959003f, 38.9652f, 37.959003f)
generalPath!!.curveTo(37.093197f, 37.959003f, 10.287199f, 37.927002f, 7.570198f, 37.927002f)
generalPath!!.curveTo(7.803698f, 37.606003f, 7.9038982f, 36.938004f, 7.905198f, 36.922f)
generalPath!!.lineTo(9.620398f, 16.464f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_21
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.6202f, 16.223f)
generalPath!!.lineTo(8.4536f, 31.866f)
generalPath!!.curveTo(8.4536f, 31.866f, 16.75f, 27.717999f, 27.1196f, 27.717999f)
generalPath!!.curveTo(37.4892f, 27.717999f, 42.6746f, 16.223f, 42.6746f, 16.223f)
generalPath!!.lineTo(9.619598f, 16.223f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 23)) ?: Color(255, 255, 255, 23)
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
            return 0.29106324911117554
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 5.090500831604004
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 45.937583923339844
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 38.13568115234375
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return Folder(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Folder(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Folder(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

    override fun setColorFilter(colorFilter: NeonIcon.ColorFilter?) {
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

