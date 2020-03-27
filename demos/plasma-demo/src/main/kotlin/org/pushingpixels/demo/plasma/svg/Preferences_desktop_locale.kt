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
class Preferences_desktop_locale private constructor(private var width: Int, private var height: Int)
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
g.transform(AffineTransform(0.019714679569005966f, 0.0f, 0.0f, 0.033432260155677795f, 38.92491912841797f, 24.7125301361084f))
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
shape = GeneralPath()
(shape as GeneralPath).moveTo(-219.61876, -150.68037)
(shape as GeneralPath).curveTo(-219.61876, -150.68037, -219.61876, 327.65042, -219.61876, 327.65042)
(shape as GeneralPath).curveTo(-76.74459, 328.55087, 125.78146, 220.48074, 125.78138, 88.45424)
(shape as GeneralPath).curveTo(125.78138, -43.572304, -33.655437, -150.68036, -219.61876, -150.68037)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_2
shape = GeneralPath()
(shape as GeneralPath).moveTo(-1559.2523, -150.68037)
(shape as GeneralPath).curveTo(-1559.2523, -150.68037, -1559.2523, 327.65042, -1559.2523, 327.65042)
(shape as GeneralPath).curveTo(-1702.1265, 328.55087, -1904.6525, 220.48074, -1904.6525, 88.45424)
(shape as GeneralPath).curveTo(-1904.6525, -43.572304, -1745.2157, -150.68036, -1559.2523, -150.68037)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f))
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
paint = LinearGradientPaint(Point2D.Double(302.8571472167969, 366.64788818359375), Point2D.Double(302.8571472167969, 609.5050659179688), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(0, 0, 0, 0),Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(-219.61876, -150.68037)
(shape as GeneralPath).curveTo(-219.61876, -150.68037, -219.61876, 327.65042, -219.61876, 327.65042)
(shape as GeneralPath).curveTo(-76.74459, 328.55087, 125.78146, 220.48074, 125.78138, 88.45424)
(shape as GeneralPath).curveTo(125.78138, -43.572304, -33.655437, -150.68036, -219.61876, -150.68037)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1_2
shape = GeneralPath()
(shape as GeneralPath).moveTo(-1559.2523, -150.68037)
(shape as GeneralPath).curveTo(-1559.2523, -150.68037, -1559.2523, 327.65042, -1559.2523, 327.65042)
(shape as GeneralPath).curveTo(-1702.1265, 328.55087, -1904.6525, 220.48074, -1904.6525, 88.45424)
(shape as GeneralPath).curveTo(-1904.6525, -43.572304, -1745.2157, -150.68036, -1559.2523, -150.68037)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f))
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
shape = GeneralPath()
(shape as GeneralPath).moveTo(1.5021164, 4.1593795)
(shape as GeneralPath).curveTo(10.684459, -2.3813581, 27.143377, 6.1039233, 36.498974, 4.1593795)
(shape as GeneralPath).lineTo(36.498974, 29.261671)
(shape as GeneralPath).curveTo(27.489882, 32.266876, 11.897222, 22.89771, 1.5021164, 29.261671)
(shape as GeneralPath).lineTo(1.5021164, 4.1593795)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(0.9142135381698608, 16.710525512695312), Point2D.Double(37.623104095458984, 16.710525512695312), floatArrayOf(0.0f,0.42424244f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(190, 190, 190, 255),Color(235, 235, 235, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9800599813461304f, 0.0f, 0.0f, 1.0f, 0.11610300093889236f, 0.0f))
g.paint = paint
g.fill(shape)
paint = Color(85, 87, 83, 255)
stroke = BasicStroke(0.9999994f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(1.5021164, 4.1593795)
(shape as GeneralPath).curveTo(10.684459, -2.3813581, 27.143377, 6.1039233, 36.498974, 4.1593795)
(shape as GeneralPath).lineTo(36.498974, 29.261671)
(shape as GeneralPath).curveTo(27.489882, 32.266876, 11.897222, 22.89771, 1.5021164, 29.261671)
(shape as GeneralPath).lineTo(1.5021164, 4.1593795)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(2.0, 26.0)
(shape as GeneralPath).curveTo(11.0625, 19.9375, 29.8125, 29.25, 36.0, 26.0)
(shape as GeneralPath).lineTo(36.0, 23.0)
(shape as GeneralPath).curveTo(29.3125, 26.4375, 11.0, 16.8125, 2.0, 23.0)
(shape as GeneralPath).lineTo(2.0, 26.0)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(2.0, 23.791154861450195), Point2D.Double(36.0, 23.791154861450195), floatArrayOf(0.0f,0.15151516f,0.57575756f,1.0f), arrayOf(Color(204, 0, 0, 255),Color(255, 55, 55, 255),Color(180, 20, 20, 255),Color(255, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_2
shape = GeneralPath()
(shape as GeneralPath).moveTo(2.0, 14.751733)
(shape as GeneralPath).curveTo(11.0625, 8.689233, 29.8125, 18.001734, 36.0, 14.751733)
(shape as GeneralPath).lineTo(36.0, 11.751733)
(shape as GeneralPath).curveTo(29.3125, 15.189233, 11.0, 5.5642333, 2.0, 11.751733)
(shape as GeneralPath).lineTo(2.0, 14.751733)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(2.0, 23.791154861450195), Point2D.Double(36.0, 23.791154861450195), floatArrayOf(0.0f,0.15151516f,0.57575756f,1.0f), arrayOf(Color(204, 0, 0, 255),Color(255, 55, 55, 255),Color(180, 20, 20, 255),Color(255, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -11.248270034790039f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_3
shape = GeneralPath()
(shape as GeneralPath).moveTo(2.0, 20.375868)
(shape as GeneralPath).curveTo(11.0625, 14.313367, 29.8125, 23.625868, 36.0, 20.375868)
(shape as GeneralPath).lineTo(36.0, 17.375868)
(shape as GeneralPath).curveTo(29.3125, 20.813368, 11.0, 11.188367, 2.0, 17.375868)
(shape as GeneralPath).lineTo(2.0, 20.375868)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(2.0, 23.791154861450195), Point2D.Double(36.0, 23.791154861450195), floatArrayOf(0.0f,0.15151516f,0.57575756f,1.0f), arrayOf(Color(204, 0, 0, 255),Color(255, 55, 55, 255),Color(180, 20, 20, 255),Color(255, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -5.624133110046387f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_4
shape = GeneralPath()
(shape as GeneralPath).moveTo(2.0, 9.127602)
(shape as GeneralPath).curveTo(11.0625, 3.0651011, 29.8125, 12.377601, 36.0, 9.127602)
(shape as GeneralPath).lineTo(36.0, 6.1276016)
(shape as GeneralPath).curveTo(29.3125, 9.565102, 11.0, -0.0598988, 2.0, 6.1276016)
(shape as GeneralPath).lineTo(2.0, 9.127602)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(2.0, 23.791154861450195), Point2D.Double(36.0, 23.791154861450195), floatArrayOf(0.0f,0.15151516f,0.57575756f,1.0f), arrayOf(Color(204, 0, 0, 255),Color(255, 55, 55, 255),Color(180, 20, 20, 255),Color(255, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -16.872400283813477f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.5f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_5
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(0.9999999f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(2.5, 4.7703295)
(shape as GeneralPath).curveTo(10.477148, -0.9579077, 26.333595, 6.7148733, 35.53555, 5.2703295)
(shape as GeneralPath).lineTo(35.41055, 28.560122)
(shape as GeneralPath).curveTo(28.595705, 30.752825, 12.672841, 22.855684, 2.5625, 27.435122)
(shape as GeneralPath).lineTo(2.5, 4.7703295)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_6
shape = GeneralPath()
(shape as GeneralPath).moveTo(2.0, 4.5)
(shape as GeneralPath).curveTo(2.0, 4.5, 2.0, 14.875, 2.0, 14.875)
(shape as GeneralPath).curveTo(4.125, 13.0, 9.8125, 11.625, 19.0, 13.5)
(shape as GeneralPath).lineTo(19.0, 3.0)
(shape as GeneralPath).curveTo(15.375, 2.125, 5.5, 1.0624999, 2.0, 4.5)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(2.0, 8.501786231994629), Point2D.Double(19.0, 8.501786231994629), floatArrayOf(0.0f,0.21212122f,1.0f), arrayOf(Color(32, 74, 135, 255),Color(63, 123, 210, 255),Color(32, 74, 135, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
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
shape = GeneralPath()
(shape as GeneralPath).moveTo(11.502116, 18.15938)
(shape as GeneralPath).curveTo(20.68446, 11.618642, 37.143375, 20.103924, 46.498974, 18.15938)
(shape as GeneralPath).lineTo(46.498974, 43.26167)
(shape as GeneralPath).curveTo(37.48988, 46.266876, 21.897223, 36.89771, 11.502116, 43.26167)
(shape as GeneralPath).lineTo(11.502116, 18.15938)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(11.002116203308105, 29.756582260131836), Point2D.Double(46.99897384643555, 29.756582260131836), floatArrayOf(0.0f,0.27272728f,1.0f), arrayOf(Color(237, 212, 0, 255),Color(255, 244, 145, 255),Color(237, 212, 0, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = Color(85, 87, 83, 255)
stroke = BasicStroke(0.9999994f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(11.502116, 18.15938)
(shape as GeneralPath).curveTo(20.68446, 11.618642, 37.143375, 20.103924, 46.498974, 18.15938)
(shape as GeneralPath).lineTo(46.498974, 43.26167)
(shape as GeneralPath).curveTo(37.48988, 46.266876, 21.897223, 36.89771, 11.502116, 43.26167)
(shape as GeneralPath).lineTo(11.502116, 18.15938)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(11.976621, 18.478292)
(shape as GeneralPath).lineTo(12.020815, 26.61002)
(shape as GeneralPath).curveTo(19.975765, 21.612175, 38.890873, 29.350058, 46.05033, 26.963573)
(shape as GeneralPath).lineTo(46.05033, 18.522486)
(shape as GeneralPath).curveTo(38.09538, 20.599611, 19.666407, 12.202719, 11.976621, 18.478292)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(11.9766206741333, 21.723522186279297), Point2D.Double(46.13871765136719, 21.723522186279297), floatArrayOf(0.0f,0.27272728f,0.6363636f,1.0f), arrayOf(Color(46, 52, 54, 255),Color(80, 90, 93, 255),Color(20, 23, 23, 255),Color(46, 52, 54, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_2
shape = GeneralPath()
(shape as GeneralPath).moveTo(11.976621, 26.61002)
(shape as GeneralPath).lineTo(12.020815, 34.564972)
(shape as GeneralPath).curveTo(20.682873, 27.759068, 37.476658, 38.719223, 46.050327, 35.095303)
(shape as GeneralPath).lineTo(46.050327, 26.830992)
(shape as GeneralPath).curveTo(37.918602, 29.084894, 20.73963, 19.831844, 11.976621, 26.61002)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(11.9766206741333, 29.74867057800293), Point2D.Double(46.13871765136719, 29.74867057800293), floatArrayOf(0.0f,0.24242425f,0.6097337f,1.0f), arrayOf(Color(204, 0, 0, 255),Color(255, 71, 71, 255),Color(155, 18, 18, 255),Color(204, 0, 0, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.62921345f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_3
paint = LinearGradientPaint(Point2D.Double(29.01777458190918, 40.34728240966797), Point2D.Double(29.01777458190918, 17.189533233642578), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.9999999f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(12.5, 18.68194)
(shape as GeneralPath).curveTo(20.477148, 12.953704, 36.333595, 20.626486, 45.53555, 19.18194)
(shape as GeneralPath).lineTo(45.41055, 42.56012)
(shape as GeneralPath).curveTo(38.595703, 44.752827, 22.67284, 36.855686, 12.5625, 41.43512)
(shape as GeneralPath).lineTo(12.5, 18.68194)
(shape as GeneralPath).closePath()
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
        fun of(width: Int, height: Int): ResizableIcon {
            return Preferences_desktop_locale(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Preferences_desktop_locale(width, height))
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

