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
class Folder_saved_search private constructor(private var width: Int, private var height: Int)
       : NeonIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
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
g.transform(AffineTransform(0.022623829543590546f, 0.0f, 0.0f, 0.02086758054792881f, 43.38343048095703f, 36.36962127685547f))
// _0_0_0
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_0
shape = Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375)
paint = LinearGradientPaint(Point2D.Double(302.8571472167969, 366.64788818359375), Point2D.Double(302.8571472167969, 609.5050659179688), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(0, 0, 0, 0),Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f))
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
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f))
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
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.001039981842041f, 0.0f, 0.0f, 1.0020760297775269f, -0.053901348263025284f, -0.10208400338888168f))
// _0_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.5217805f, 38.687416f)
generalPath!!.curveTo(4.5435767f, 39.10372f, 4.981685f, 39.520027f, 5.39799f, 39.520027f)
generalPath!!.lineTo(36.72501f, 39.520027f)
generalPath!!.curveTo(37.14131f, 39.520027f, 37.535824f, 39.10372f, 37.514027f, 38.687416f)
generalPath!!.lineTo(36.577583f, 11.460682f)
generalPath!!.curveTo(36.555786f, 11.044379f, 36.117687f, 10.628066f, 35.70138f, 10.628066f)
generalPath!!.lineTo(22.43051f, 10.628066f)
generalPath!!.curveTo(21.945454f, 10.628066f, 21.196037f, 10.312477f, 21.028866f, 9.521434f)
generalPath!!.lineTo(20.417475f, 6.6283627f)
generalPath!!.curveTo(20.262007f, 5.8926897f, 19.535261f, 5.5904765f, 19.118958f, 5.5904765f)
generalPath!!.lineTo(4.3400974f, 5.5904765f)
generalPath!!.curveTo(3.9237847f, 5.5904765f, 3.5292766f, 6.0067806f, 3.5510726f, 6.4230847f)
generalPath!!.lineTo(4.5217805f, 38.687416f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(20.706016540527344, 37.51798629760742), 30.905205f, Point2D.Double(20.706016540527344, 37.51798629760742), floatArrayOf(0.0f,1.0f), arrayOf(Color(32, 32, 32, 255),Color(185, 185, 185, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.056007981300354f, 0.015133569948375225f, 0.14261800050735474f, 1.2515989542007446f, -2.2762789726257324f, -10.281060218811035f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(18.112709045410156, 31.36775016784668), Point2D.Double(15.514888763427734, 6.18025016784668), floatArrayOf(0.0f,1.0f), arrayOf(Color(66, 66, 66, 255),Color(119, 119, 119, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.99844444f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.5217805f, 38.687416f)
generalPath!!.curveTo(4.5435767f, 39.10372f, 4.981685f, 39.520027f, 5.39799f, 39.520027f)
generalPath!!.lineTo(36.72501f, 39.520027f)
generalPath!!.curveTo(37.14131f, 39.520027f, 37.535824f, 39.10372f, 37.514027f, 38.687416f)
generalPath!!.lineTo(36.577583f, 11.460682f)
generalPath!!.curveTo(36.555786f, 11.044379f, 36.117687f, 10.628066f, 35.70138f, 10.628066f)
generalPath!!.lineTo(22.43051f, 10.628066f)
generalPath!!.curveTo(21.945454f, 10.628066f, 21.196037f, 10.312477f, 21.028866f, 9.521434f)
generalPath!!.lineTo(20.417475f, 6.6283627f)
generalPath!!.curveTo(20.262007f, 5.8926897f, 19.535261f, 5.5904765f, 19.118958f, 5.5904765f)
generalPath!!.lineTo(4.3400974f, 5.5904765f)
generalPath!!.curveTo(3.9237847f, 5.5904765f, 3.5292766f, 6.0067806f, 3.5510726f, 6.4230847f)
generalPath!!.lineTo(4.5217805f, 38.687416f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0421734f, 18.5625f)
generalPath!!.lineTo(35.489105f, 18.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0421734f, 18.5625f)
generalPath!!.lineTo(35.489105f, 18.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.9806967f, 12.5625f)
generalPath!!.lineTo(35.488056f, 12.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.9806967f, 12.5625f)
generalPath!!.lineTo(35.488056f, 12.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.2265925f, 22.5625f)
generalPath!!.lineTo(35.492172f, 22.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.2265925f, 22.5625f)
generalPath!!.lineTo(35.492172f, 22.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3861575f, 32.5625f)
generalPath!!.lineTo(35.49488f, 32.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3861575f, 32.5625f)
generalPath!!.lineTo(35.49488f, 32.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.50914f, 34.5625f)
generalPath!!.lineTo(35.496895f, 34.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.50914f, 34.5625f)
generalPath!!.lineTo(35.496895f, 34.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0421734f, 16.5625f)
generalPath!!.lineTo(35.489105f, 16.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0421734f, 16.5625f)
generalPath!!.lineTo(35.489105f, 16.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.1958537f, 20.5625f)
generalPath!!.lineTo(35.49165f, 20.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000001f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.1958537f, 20.5625f)
generalPath!!.lineTo(35.49165f, 20.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0114346f, 14.5625f)
generalPath!!.lineTo(35.48858f, 14.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.0114346f, 14.5625f)
generalPath!!.lineTo(35.48858f, 14.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0407639741897583f, 0.0f, 0.0544925183057785f, 1.0407639741897583f, -8.539401054382324f, 2.452526092529297f))
// _0_0_2_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_8_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(42.417183f, 8.515178f)
generalPath!!.curveTo(42.422268f, 8.418064f, 42.28902f, 8.268189f, 42.182068f, 8.268171f)
generalPath!!.lineTo(29.150665f, 8.266053f)
generalPath!!.curveTo(29.150665f, 8.266053f, 30.06238f, 8.854008f, 31.352476f, 8.862296f)
generalPath!!.lineTo(42.405975f, 8.933317f)
generalPath!!.curveTo(42.41706f, 8.721589f, 42.408695f, 8.677284f, 42.417183f, 8.515178f)
generalPath!!.closePath()
shape = generalPath
paint = Color(255, 255, 255, 130)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_9
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.2265925f, 24.5625f)
generalPath!!.lineTo(35.492172f, 24.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.2265925f, 24.5625f)
generalPath!!.lineTo(35.492172f, 24.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3246665f, 30.5625f)
generalPath!!.lineTo(35.493877f, 30.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3246665f, 30.5625f)
generalPath!!.lineTo(35.493877f, 30.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_11
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3246665f, 28.5625f)
generalPath!!.lineTo(35.493877f, 28.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3246665f, 28.5625f)
generalPath!!.lineTo(35.493877f, 28.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_12
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.50914f, 36.5625f)
generalPath!!.lineTo(35.496895f, 36.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.50914f, 36.5625f)
generalPath!!.lineTo(35.496895f, 36.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.4514286f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_13
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.068343f, 38.86402f)
generalPath!!.curveTo(6.084686f, 39.17625f, 5.8874316f, 39.384403f, 5.5697584f, 39.280327f)
generalPath!!.lineTo(5.5697584f, 39.280327f)
generalPath!!.curveTo(5.2520766f, 39.17625f, 5.033027f, 38.968098f, 5.0166755f, 38.65587f)
generalPath!!.lineTo(4.068956f, 6.591384f)
generalPath!!.curveTo(4.0526133f, 6.2791557f, 4.234142f, 6.0906134f, 4.54637f, 6.0906134f)
generalPath!!.lineTo(18.96842f, 6.0429196f)
generalPath!!.curveTo(19.280647f, 6.0429196f, 19.900364f, 6.3433924f, 20.101357f, 7.3651013f)
generalPath!!.lineTo(20.674845f, 10.180636f)
generalPath!!.curveTo(20.247791f, 9.715379f, 20.255651f, 9.701017f, 20.037287f, 9.02393f)
generalPath!!.lineTo(19.631191f, 7.764748f)
generalPath!!.curveTo(19.412142f, 7.037101f, 18.932991f, 6.932848f, 18.620764f, 6.932848f)
generalPath!!.lineTo(5.732989f, 6.932848f)
generalPath!!.curveTo(5.420761f, 6.932848f, 5.2235074f, 7.141f, 5.239858f, 7.4532366f)
generalPath!!.lineTo(6.1778636f, 38.968098f)
generalPath!!.lineTo(6.068343f, 38.86402f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(6.229796409606934, 13.773065567016602), Point2D.Double(9.898089408874512, 66.83405303955078), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 223),Color(255, 255, 254, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5168440341949463f, 0.0f, 0.0f, 0.708977997303009f, -0.8795729875564575f, -1.3181660175323486f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_14
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.288064f, 26.5625f)
generalPath!!.lineTo(35.493183f, 26.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.288064f, 26.5625f)
generalPath!!.lineTo(35.493183f, 26.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_15
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.8737535f, 8.5625f)
generalPath!!.lineTo(19.657488f, 8.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(0.9999998f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.8737535f, 8.5625f)
generalPath!!.lineTo(19.657488f, 8.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_16
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.9220967f, 10.5625f)
generalPath!!.lineTo(20.202911f, 10.5625f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.9220967f, 10.5625f)
generalPath!!.lineTo(20.202911f, 10.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9930909872055054f, 0.0f, 0.0f, 0.9978960156440735f, 0.2977159917354584f, 0.0698358565568924f))
// _0_0_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.78353f, 39.51062f)
generalPath!!.curveTo(40.927425f, 39.466557f, 41.74661f, 38.41432f, 41.830566f, 37.189613f)
generalPath!!.curveTo(42.622353f, 25.640928f, 43.489925f, 15.957666f, 43.489925f, 15.957666f)
generalPath!!.curveTo(43.56208f, 15.710182f, 43.322018f, 15.462699f, 43.00979f, 15.462699f)
generalPath!!.lineTo(8.638631f, 15.462699f)
generalPath!!.curveTo(8.638631f, 15.462699f, 6.7883115f, 37.32959f, 6.7883115f, 37.32959f)
generalPath!!.curveTo(6.673756f, 38.311657f, 6.322304f, 39.134308f, 5.2384753f, 39.513306f)
generalPath!!.lineTo(39.78353f, 39.51062f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(28.238475799560547, 40.0133056640625), Point2D.Double(28.752830505371094, 17.488000869750977), floatArrayOf(0.0f,0.18421052f,1.0f), arrayOf(Color(254, 207, 140, 255),Color(252, 186, 88, 255),Color(253, 197, 114, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = Color(206, 92, 0, 255)
stroke = BasicStroke(1.0045297f,0,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.78353f, 39.51062f)
generalPath!!.curveTo(40.927425f, 39.466557f, 41.74661f, 38.41432f, 41.830566f, 37.189613f)
generalPath!!.curveTo(42.622353f, 25.640928f, 43.489925f, 15.957666f, 43.489925f, 15.957666f)
generalPath!!.curveTo(43.56208f, 15.710182f, 43.322018f, 15.462699f, 43.00979f, 15.462699f)
generalPath!!.lineTo(8.638631f, 15.462699f)
generalPath!!.curveTo(8.638631f, 15.462699f, 6.7883115f, 37.32959f, 6.7883115f, 37.32959f)
generalPath!!.curveTo(6.673756f, 38.311657f, 6.322304f, 39.134308f, 5.2384753f, 39.513306f)
generalPath!!.lineTo(39.78353f, 39.51062f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.46590912f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9930909872055054f, 0.0f, 0.0f, 0.9978960156440735f, 0.2977159917354584f, 0.0698358565568924f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(13.035696029663086, 32.56718444824219), Point2D.Double(12.853771209716797, 46.68931198120117), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3174890279769897f, 0.0f, 0.0f, 0.8162559866905212f, -0.8795729875564575f, -1.3181660175323486f))
stroke = BasicStroke(1.0045295f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.620244f, 16.46392f)
generalPath!!.lineTo(42.411343f, 16.528734f)
generalPath!!.lineTo(40.837296f, 36.530712f)
generalPath!!.curveTo(40.752975f, 37.602226f, 40.38662f, 37.958927f, 38.96464f, 37.958927f)
generalPath!!.curveTo(37.09314f, 37.958927f, 10.286673f, 37.92652f, 7.569899f, 37.92652f)
generalPath!!.curveTo(7.8034973f, 37.605713f, 7.9036546f, 36.9379f, 7.9049954f, 36.92191f)
generalPath!!.lineTo(9.620244f, 16.46392f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9930909872055054f, 0.0f, 0.0f, 0.9978960156440735f, 0.2977159917354584f, 0.0698358565568924f))
// _0_0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.620248f, 16.223183f)
generalPath!!.lineTo(8.453602f, 31.866453f)
generalPath!!.curveTo(8.453602f, 31.866453f, 16.749756f, 27.718374f, 27.11995f, 27.718374f)
generalPath!!.curveTo(37.490143f, 27.718374f, 42.67524f, 16.223183f, 42.67524f, 16.223183f)
generalPath!!.lineTo(9.620248f, 16.223183f)
generalPath!!.closePath()
shape = generalPath
paint = Color(255, 255, 255, 23)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.41477272f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0407639741897583f, 0.0f, 0.0544925183057785f, 1.3656419515609741f, -8.358528137207031f, 0.9217879772186279f))
// _0_0_6
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0016820430755615f, 0.0f, 0.0f, 0.9640309810638428f, -0.06592009961605072f, 1.2589360475540161f))
// _0_0_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(23.216295f, 20.483131f)
generalPath!!.curveTo(19.939735f, 20.73441f, 17.206654f, 23.494648f, 17.044767f, 26.819387f)
generalPath!!.curveTo(16.874922f, 30.30764f, 19.609264f, 33.18194f, 23.097519f, 33.18194f)
generalPath!!.curveTo(24.80758f, 33.18194f, 26.401075f, 32.506996f, 27.601545f, 31.394114f)
generalPath!!.curveTo(27.663282f, 31.574078f, 27.771542f, 31.746853f, 27.89272f, 31.893652f)
generalPath!!.curveTo(28.003195f, 32.022076f, 28.14461f, 32.14614f, 28.296741f, 32.235443f)
generalPath!!.lineTo(32.38049f, 34.759426f)
generalPath!!.curveTo(33.15578f, 35.2386f, 34.20425f, 34.979637f, 34.72231f, 34.181015f)
generalPath!!.curveTo(35.240368f, 33.382393f, 35.03184f, 32.346535f, 34.25655f, 31.867361f)
generalPath!!.lineTo(30.1728f, 29.343374f)
generalPath!!.curveTo(29.896967f, 29.16637f, 29.571732f, 29.069204f, 29.239107f, 29.08046f)
generalPath!!.curveTo(29.541227f, 28.380236f, 29.705093f, 27.609695f, 29.743574f, 26.819387f)
generalPath!!.curveTo(29.91342f, 23.331137f, 27.204088f, 20.483131f, 23.715836f, 20.483131f)
generalPath!!.curveTo(23.552322f, 20.483131f, 23.377438f, 20.470774f, 23.216295f, 20.483131f)
generalPath!!.closePath()
generalPath!!.moveTo(23.43519f, 23.007116f)
generalPath!!.curveTo(23.484535f, 23.005278f, 23.543192f, 23.007116f, 23.59294f, 23.007116f)
generalPath!!.curveTo(25.715557f, 23.007118f, 27.32294f, 24.69677f, 27.219587f, 26.819387f)
generalPath!!.curveTo(27.116236f, 28.942007f, 25.34431f, 30.631659f, 23.221695f, 30.631659f)
generalPath!!.curveTo(21.099075f, 30.631659f, 19.491693f, 28.942007f, 19.595045f, 26.819387f)
generalPath!!.curveTo(19.695974f, 24.74652f, 21.379108f, 23.083765f, 23.43519f, 23.007116f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(20.13309669494629, 33.64693832397461), Point2D.Double(20.796142578125, 50.77069091796875), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2078720331192017f, 0.0f, -0.0403112918138504f, 0.8279020190238953f, -29.59564971923828f, -0.11754699796438217f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
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
            return 0.2928977608680725
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 4.999739646911621
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 45.93619155883789
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 38.2259407043457
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return Folder_saved_search(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Folder_saved_search(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Folder_saved_search(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

