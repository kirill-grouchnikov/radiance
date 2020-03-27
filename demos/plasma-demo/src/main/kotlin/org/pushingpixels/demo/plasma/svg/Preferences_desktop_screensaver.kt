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
class Preferences_desktop_screensaver private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 0.50857145f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0502510070800781f, 0.0f, 0.0f, 1.8678879737854004f, -0.9455580115318298f, -28.106109619140625f))
// _0_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(41.10058, 35.051105)
(shape as GeneralPath).curveTo(41.127632, 36.682228, 37.915836, 38.192577, 32.681362, 39.010254)
(shape as GeneralPath).curveTo(27.446886, 39.827927, 20.989925, 39.827927, 15.755449, 39.010254)
(shape as GeneralPath).curveTo(10.520973, 38.192577, 7.3091793, 36.682228, 7.336233, 35.051105)
(shape as GeneralPath).curveTo(7.3091793, 33.419983, 10.520973, 31.909634, 15.755449, 31.091959)
(shape as GeneralPath).curveTo(20.989925, 30.274284, 27.446886, 30.274284, 32.681362, 31.091959)
(shape as GeneralPath).curveTo(37.915836, 31.909634, 41.127632, 33.419983, 41.10058, 35.051105)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(12.57571029663086, 67.501708984375), 8.766279f, Point2D.Double(12.57571029663086, 67.501708984375), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9258079528808594f, 0.0f, 0.0f, 0.5192620158195496f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 60.033390045166016f, 8.07843017578125f))
// _0_0_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(-26.263968, 29.716238)
(shape as GeneralPath).curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274)
(shape as GeneralPath).curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274)
(shape as GeneralPath).curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238)
(shape as GeneralPath).curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736)
(shape as GeneralPath).curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736)
(shape as GeneralPath).curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238)
(shape as GeneralPath).closePath()
paint = Color(173, 176, 170, 255)
g.paint = paint
g.fill(shape)
paint = Color(75, 77, 74, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(-26.263968, 29.716238)
(shape as GeneralPath).curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274)
(shape as GeneralPath).curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274)
(shape as GeneralPath).curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238)
(shape as GeneralPath).curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736)
(shape as GeneralPath).curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736)
(shape as GeneralPath).curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9023730158805847f, 0.0f, 0.0f, 0.8276500105857849f, 56.55215072631836f, 12.867919921875f))
// _0_0_2
paint = LinearGradientPaint(Point2D.Double(-35.65838623046875, 33.416473388671875), Point2D.Double(-35.65838623046875, 28.2059383392334), floatArrayOf(0.0f,1.0f), arrayOf(Color(123, 127, 122, 255),Color(123, 127, 122, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.1571338f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(-26.263968, 29.716238)
(shape as GeneralPath).curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274)
(shape as GeneralPath).curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274)
(shape as GeneralPath).curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238)
(shape as GeneralPath).curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736)
(shape as GeneralPath).curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736)
(shape as GeneralPath).curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.837548017501831f, 0.0f, 0.0f, 0.8526549935340881f, 54.17810821533203f, 11.006150245666504f))
// _0_0_3
paint = LinearGradientPaint(Point2D.Double(-35.12268829345703, 34.24223709106445), Point2D.Double(-35.074745178222656, 30.962345123291016), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.1833371f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(-26.263968, 29.716238)
(shape as GeneralPath).curveTo(-26.248913, 31.127916, -28.036179, 32.43507, -30.949007, 33.14274)
(shape as GeneralPath).curveTo(-33.861835, 33.850407, -37.45494, 33.850407, -40.367767, 33.14274)
(shape as GeneralPath).curveTo(-43.280594, 32.43507, -45.06786, 31.127916, -45.052807, 29.716238)
(shape as GeneralPath).curveTo(-45.06786, 28.30456, -43.280594, 26.997404, -40.367767, 26.289736)
(shape as GeneralPath).curveTo(-37.45494, 25.582067, -33.861835, 25.582067, -30.949007, 26.289736)
(shape as GeneralPath).curveTo(-28.036179, 26.997404, -26.248913, 28.30456, -26.263968, 29.716238)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
shape = Rectangle2D.Double(19.972396850585938, 31.07861328125, 9.0396728515625, 6.365038871765137)
paint = LinearGradientPaint(Point2D.Double(12.206708908081055, 53.53514099121094), Point2D.Double(12.127711296081543, 64.89252471923828), floatArrayOf(0.0f,1.0f), arrayOf(Color(88, 89, 86, 255),Color(187, 190, 184, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.816344976425171f, 0.0f, 0.0f, 1.278926968574524f, 2.5f, -40.245079040527344f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
shape = GeneralPath()
(shape as GeneralPath).moveTo(7.5809026, 4.570622)
(shape as GeneralPath).lineTo(41.169098, 4.570622)
(shape as GeneralPath).curveTo(42.08044, 4.570622, 42.793243, 5.1541038, 42.83585, 5.972209)
(shape as GeneralPath).lineTo(44.167892, 31.550323)
(shape as GeneralPath).curveTo(44.2261, 32.668056, 43.266838, 33.57063, 42.147587, 33.57063)
(shape as GeneralPath).lineTo(6.602412, 33.57063)
(shape as GeneralPath).curveTo(5.483163, 33.57063, 4.523898, 32.668056, 4.5821066, 31.550323)
(shape as GeneralPath).lineTo(5.9141507, 5.972209)
(shape as GeneralPath).curveTo(5.9544344, 5.1986747, 6.461653, 4.570622, 7.5809026, 4.570622)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(8.611623764038086, 7.229358196258545), Point2D.Double(34.78447341918945, 33.339786529541016), floatArrayOf(0.0f,1.0f), arrayOf(Color(221, 225, 217, 255),Color(202, 205, 198, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.1298630237579346f, 0.0f, 0.0f, 0.8850629925727844f, 2.875f, 1.570628046989441f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(10.390737533569336, 5.381774425506592), Point2D.Double(32.53682327270508, 31.24605369567871), floatArrayOf(0.0f,1.0f), arrayOf(Color(143, 143, 143, 255),Color(73, 73, 73, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.1043970584869385f, 0.0f, 0.0f, 0.9054710268974304f, 4.5f, 2.875f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(7.5809026, 4.570622)
(shape as GeneralPath).lineTo(41.169098, 4.570622)
(shape as GeneralPath).curveTo(42.08044, 4.570622, 42.793243, 5.1541038, 42.83585, 5.972209)
(shape as GeneralPath).lineTo(44.167892, 31.550323)
(shape as GeneralPath).curveTo(44.2261, 32.668056, 43.266838, 33.57063, 42.147587, 33.57063)
(shape as GeneralPath).lineTo(6.602412, 33.57063)
(shape as GeneralPath).curveTo(5.483163, 33.57063, 4.523898, 32.668056, 4.5821066, 31.550323)
(shape as GeneralPath).lineTo(5.9141507, 5.972209)
(shape as GeneralPath).curveTo(5.9544344, 5.1986747, 6.461653, 4.570622, 7.5809026, 4.570622)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
shape = GeneralPath()
(shape as GeneralPath).moveTo(8.910536, 7.180827)
(shape as GeneralPath).lineTo(7.6683393, 29.226145)
(shape as GeneralPath).lineTo(39.31873, 29.226145)
(shape as GeneralPath).lineTo(37.98371, 7.274256)
(shape as GeneralPath).lineTo(8.910536, 7.180827)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(19.1503963470459, 32.62223815917969), Point2D.Double(16.315818786621094, 8.866622924804688), floatArrayOf(0.0f,1.0f), arrayOf(Color(91, 91, 151, 255),Color(27, 27, 67, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.1741390228271484f, 0.0f, 0.0f, 0.9454309940338135f, 5.221825122833252f, 1.5434759855270386f))
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 121, 255)
stroke = BasicStroke(0.5f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(8.910536, 7.180827)
(shape as GeneralPath).lineTo(7.6683393, 29.226145)
(shape as GeneralPath).lineTo(39.31873, 29.226145)
(shape as GeneralPath).lineTo(37.98371, 7.274256)
(shape as GeneralPath).lineTo(8.910536, 7.180827)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = LinearGradientPaint(Point2D.Double(3.7069976329803467, 171.2913360595703), Point2D.Double(3.7069973945617676, 162.4506072998047), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 63),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(5.7051591873168945f, 0.0f, 0.0f, 0.17528000473976135f, 5.5f, 2.195626974105835f))
stroke = BasicStroke(0.9961812f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(6.677433, 31.610788)
(shape as GeneralPath).lineTo(42.10591, 31.610788)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = LinearGradientPaint(Point2D.Double(17.698339462280273, 13.004725456237793), Point2D.Double(34.97454833984375, 55.20075607299805), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 179),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.1080689430236816f, 0.0f, 0.0f, 0.9024710059165955f, 5.5f, 3.875f))
stroke = BasicStroke(0.99999964f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(7.4145985, 5.58134)
(shape as GeneralPath).lineTo(41.2601, 5.543538)
(shape as GeneralPath).curveTo(41.543797, 5.5432215, 41.819405, 5.780788, 41.842205, 6.196082)
(shape as GeneralPath).lineTo(43.204098, 30.99933)
(shape as GeneralPath).curveTo(43.26214, 32.056362, 42.66435, 32.785202, 41.60573, 32.785202)
(shape as GeneralPath).lineTo(7.0817585, 32.785202)
(shape as GeneralPath).curveTo(6.0231357, 32.785202, 5.488744, 32.05641, 5.545887, 30.99933)
(shape as GeneralPath).lineTo(6.8699775, 6.505163)
(shape as GeneralPath).curveTo(6.9086733, 5.7893324, 7.0363626, 5.581762, 7.4145985, 5.58134)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.5314286f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
shape = GeneralPath()
(shape as GeneralPath).moveTo(9.388312, 7.621363)
(shape as GeneralPath).lineTo(8.585783, 25.491693)
(shape as GeneralPath).curveTo(19.63042, 23.091063, 24.007246, 14.999494, 37.739815, 12.344943)
(shape as GeneralPath).lineTo(37.578342, 7.687427)
(shape as GeneralPath).lineTo(9.388312, 7.621363)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(11.492236137390137, 1.6537576913833618), Point2D.Double(17.199417114257812, 26.729263305664062), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(252, 252, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2389769554138184f, 0.0f, 0.0f, 0.8959550261497498f, 5.267331123352051f, 1.5434759855270386f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.91933012008667f, 5.728866100311279f))
// _0_0_10
shape = GeneralPath()
(shape as GeneralPath).moveTo(35.620502, 3.9384086)
(shape as GeneralPath).curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735)
(shape as GeneralPath).curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735)
(shape as GeneralPath).curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086)
(shape as GeneralPath).curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822)
(shape as GeneralPath).curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822)
(shape as GeneralPath).curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(34.30099105834961, 3.938408613204956), Point2D.Double(35.52054214477539, 3.845109701156616), floatArrayOf(0.0f,1.0f), arrayOf(Color(144, 144, 144, 255),Color(190, 190, 190, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.805729866027832f, 7.834650039672852f))
// _0_0_11
shape = GeneralPath()
(shape as GeneralPath).moveTo(35.620502, 3.9384086)
(shape as GeneralPath).curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735)
(shape as GeneralPath).curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735)
(shape as GeneralPath).curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086)
(shape as GeneralPath).curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822)
(shape as GeneralPath).curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822)
(shape as GeneralPath).curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(34.30099105834961, 3.938408613204956), Point2D.Double(35.52054214477539, 3.845109701156616), floatArrayOf(0.0f,1.0f), arrayOf(Color(144, 144, 144, 255),Color(190, 190, 190, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.692130088806152f, 9.834650039672852f))
// _0_0_12
shape = GeneralPath()
(shape as GeneralPath).moveTo(35.620502, 3.9384086)
(shape as GeneralPath).curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735)
(shape as GeneralPath).curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735)
(shape as GeneralPath).curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086)
(shape as GeneralPath).curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822)
(shape as GeneralPath).curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822)
(shape as GeneralPath).curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(34.30099105834961, 3.938408613204956), Point2D.Double(35.52054214477539, 3.845109701156616), floatArrayOf(0.0f,1.0f), arrayOf(Color(144, 144, 144, 255),Color(190, 190, 190, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.5785298347473145f, 11.834650039672852f))
// _0_0_13
shape = GeneralPath()
(shape as GeneralPath).moveTo(35.620502, 3.9384086)
(shape as GeneralPath).curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735)
(shape as GeneralPath).curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735)
(shape as GeneralPath).curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086)
(shape as GeneralPath).curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822)
(shape as GeneralPath).curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822)
(shape as GeneralPath).curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(34.30099105834961, 3.938408613204956), Point2D.Double(35.52054214477539, 3.845109701156616), floatArrayOf(0.0f,1.0f), arrayOf(Color(144, 144, 144, 255),Color(190, 190, 190, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.464930057525635f, 13.834650039672852f))
// _0_0_14
shape = GeneralPath()
(shape as GeneralPath).moveTo(35.620502, 3.9384086)
(shape as GeneralPath).curveTo(35.62185, 4.2392945, 35.4621, 4.5179024, 35.201748, 4.668735)
(shape as GeneralPath).curveTo(34.941395, 4.8195677, 34.620235, 4.8195677, 34.359882, 4.668735)
(shape as GeneralPath).curveTo(34.09953, 4.5179024, 33.93978, 4.2392945, 33.941128, 3.9384086)
(shape as GeneralPath).curveTo(33.93978, 3.6375227, 34.09953, 3.358915, 34.359882, 3.2080822)
(shape as GeneralPath).curveTo(34.620235, 3.0572495, 34.941395, 3.0572495, 35.201748, 3.2080822)
(shape as GeneralPath).curveTo(35.4621, 3.358915, 35.62185, 3.6375227, 35.620502, 3.9384086)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(34.30099105834961, 3.938408613204956), Point2D.Double(35.52054214477539, 3.845109701156616), floatArrayOf(0.0f,1.0f), arrayOf(Color(144, 144, 144, 255),Color(190, 190, 190, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
shape = GeneralPath()
(shape as GeneralPath).moveTo(22.5, 30.192665)
(shape as GeneralPath).lineTo(22.781715, 30.192665)
(shape as GeneralPath).curveTo(22.86548, 30.192667, 22.9297, 30.21133, 22.974377, 30.248655)
(shape as GeneralPath).curveTo(23.019344, 30.28569, 23.041828, 30.338594, 23.04183, 30.40737)
(shape as GeneralPath).curveTo(23.041828, 30.47644, 23.019344, 30.529638, 22.974377, 30.566965)
(shape as GeneralPath).curveTo(22.9297, 30.603998, 22.86548, 30.622515, 22.781715, 30.622515)
(shape as GeneralPath).lineTo(22.669735, 30.622515)
(shape as GeneralPath).lineTo(22.669735, 30.850885)
(shape as GeneralPath).lineTo(22.5, 30.850885)
(shape as GeneralPath).lineTo(22.5, 30.192665)
(shape as GeneralPath).moveTo(22.669735, 30.315668)
(shape as GeneralPath).lineTo(22.669735, 30.499512)
(shape as GeneralPath).lineTo(22.76364, 30.499512)
(shape as GeneralPath).curveTo(22.796558, 30.499512, 22.821981, 30.491575, 22.83991, 30.475704)
(shape as GeneralPath).curveTo(22.85784, 30.45954, 22.866804, 30.436762, 22.866804, 30.40737)
(shape as GeneralPath).curveTo(22.866804, 30.37798, 22.85784, 30.355349, 22.83991, 30.339476)
(shape as GeneralPath).curveTo(22.821981, 30.323605, 22.796558, 30.315668, 22.76364, 30.315668)
(shape as GeneralPath).lineTo(22.669735, 30.315668)
(shape as GeneralPath).moveTo(23.461979, 30.303764)
(shape as GeneralPath).curveTo(23.41025, 30.303766, 23.37013, 30.32287, 23.341621, 30.361078)
(shape as GeneralPath).curveTo(23.313112, 30.399288, 23.298857, 30.453074, 23.298857, 30.522436)
(shape as GeneralPath).curveTo(23.298857, 30.591507, 23.313112, 30.645145, 23.341621, 30.683355)
(shape as GeneralPath).curveTo(23.37013, 30.721563, 23.41025, 30.740667, 23.461979, 30.740667)
(shape as GeneralPath).curveTo(23.514002, 30.740667, 23.554268, 30.721563, 23.582779, 30.683355)
(shape as GeneralPath).curveTo(23.611286, 30.645145, 23.625542, 30.591507, 23.625542, 30.522436)
(shape as GeneralPath).curveTo(23.625542, 30.453074, 23.611286, 30.399288, 23.582779, 30.361078)
(shape as GeneralPath).curveTo(23.554268, 30.32287, 23.514002, 30.303766, 23.461979, 30.303764)
(shape as GeneralPath).moveTo(23.461979, 30.180761)
(shape as GeneralPath).curveTo(23.567787, 30.180763, 23.650671, 30.211037, 23.71063, 30.271582)
(shape as GeneralPath).curveTo(23.770588, 30.332129, 23.800568, 30.415747, 23.800568, 30.522436)
(shape as GeneralPath).curveTo(23.800568, 30.628834, 23.770588, 30.712305, 23.71063, 30.772852)
(shape as GeneralPath).curveTo(23.650671, 30.833399, 23.567787, 30.86367, 23.461979, 30.86367)
(shape as GeneralPath).curveTo(23.356464, 30.86367, 23.27358, 30.833399, 23.213327, 30.772852)
(shape as GeneralPath).curveTo(23.15337, 30.712305, 23.12339, 30.628834, 23.12339, 30.522436)
(shape as GeneralPath).curveTo(23.12339, 30.415747, 23.15337, 30.332129, 23.213327, 30.271582)
(shape as GeneralPath).curveTo(23.27358, 30.211037, 23.356464, 30.180763, 23.461979, 30.180761)
(shape as GeneralPath).moveTo(23.92842, 30.192665)
(shape as GeneralPath).lineTo(24.117994, 30.192665)
(shape as GeneralPath).lineTo(24.357388, 30.644117)
(shape as GeneralPath).lineTo(24.357388, 30.192665)
(shape as GeneralPath).lineTo(24.518305, 30.192665)
(shape as GeneralPath).lineTo(24.518305, 30.850885)
(shape as GeneralPath).lineTo(24.32873, 30.850885)
(shape as GeneralPath).lineTo(24.089338, 30.399433)
(shape as GeneralPath).lineTo(24.089338, 30.850885)
(shape as GeneralPath).lineTo(23.92842, 30.850885)
(shape as GeneralPath).lineTo(23.92842, 30.192665)
(shape as GeneralPath).moveTo(24.59149, 30.192665)
(shape as GeneralPath).lineTo(24.777096, 30.192665)
(shape as GeneralPath).lineTo(24.92699, 30.42721)
(shape as GeneralPath).lineTo(25.076887, 30.192665)
(shape as GeneralPath).lineTo(25.262936, 30.192665)
(shape as GeneralPath).lineTo(25.01208, 30.573578)
(shape as GeneralPath).lineTo(25.01208, 30.850885)
(shape as GeneralPath).lineTo(24.842344, 30.850885)
(shape as GeneralPath).lineTo(24.842344, 30.573578)
(shape as GeneralPath).lineTo(24.59149, 30.192665)
paint = Color(74, 74, 74, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16
shape = GeneralPath()
(shape as GeneralPath).moveTo(32.80312, 13.315819)
(shape as GeneralPath).curveTo(34.47257, 20.995363, 29.513748, 25.45455, 21.3557, 20.989296)
(shape as GeneralPath).curveTo(21.982796, 23.339367, 23.622335, 25.369877, 26.108051, 26.170364)
(shape as GeneralPath).curveTo(29.996363, 27.422537, 34.167355, 25.283571, 35.41953, 21.395262)
(shape as GeneralPath).curveTo(36.407272, 18.32807, 35.229874, 15.16364, 32.80312, 13.315819)
(shape as GeneralPath).closePath()
paint = Color(252, 233, 79, 255)
g.paint = paint
g.fill(shape)
paint = Color(237, 212, 0, 255)
stroke = BasicStroke(0.9999996f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(32.80312, 13.315819)
(shape as GeneralPath).curveTo(34.47257, 20.995363, 29.513748, 25.45455, 21.3557, 20.989296)
(shape as GeneralPath).curveTo(21.982796, 23.339367, 23.622335, 25.369877, 26.108051, 26.170364)
(shape as GeneralPath).curveTo(29.996363, 27.422537, 34.167355, 25.283571, 35.41953, 21.395262)
(shape as GeneralPath).curveTo(36.407272, 18.32807, 35.229874, 15.16364, 32.80312, 13.315819)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f))
// _0_0_17_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(17.854446, 13.970486)
(shape as GeneralPath).curveTo(17.857279, 14.603931, 17.520966, 15.1904745, 16.972853, 15.5080185)
(shape as GeneralPath).curveTo(16.42474, 15.825562, 15.748619, 15.825562, 15.200506, 15.5080185)
(shape as GeneralPath).curveTo(14.652394, 15.1904745, 14.316081, 14.603931, 14.318913, 13.970486)
(shape as GeneralPath).curveTo(14.316081, 13.33704, 14.652394, 12.750497, 15.200506, 12.432953)
(shape as GeneralPath).curveTo(15.748619, 12.11541, 16.42474, 12.11541, 16.972853, 12.432953)
(shape as GeneralPath).curveTo(17.520966, 12.750497, 17.857279, 13.33704, 17.854446, 13.970486)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, Point2D.Double(16.086679458618164, 13.97048568725586), floatArrayOf(0.0f,1.0f), arrayOf(Color(254, 233, 100, 255),Color(254, 233, 100, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(16.970564, 11.584001)
(shape as GeneralPath).lineTo(13.930592, 11.85101)
(shape as GeneralPath).lineTo(13.611806, 14.942758)
(shape as GeneralPath).lineTo(13.344797, 11.902786)
(shape as GeneralPath).lineTo(10.253049, 11.584001)
(shape as GeneralPath).lineTo(13.29302, 11.316992)
(shape as GeneralPath).lineTo(13.611806, 8.225244)
(shape as GeneralPath).lineTo(13.878815, 11.265215)
(shape as GeneralPath).lineTo(16.970564, 11.584001)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, Point2D.Double(13.61180591583252, 11.584000587463379), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.6315789818763733f, 0.0f, 0.0f, 0.6315789818763733f, 12.969829559326172f, 3.737459897994995f))
// _0_0_18
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f))
// _0_0_18_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(17.854446, 13.970486)
(shape as GeneralPath).curveTo(17.857279, 14.603931, 17.520966, 15.1904745, 16.972853, 15.5080185)
(shape as GeneralPath).curveTo(16.42474, 15.825562, 15.748619, 15.825562, 15.200506, 15.5080185)
(shape as GeneralPath).curveTo(14.652394, 15.1904745, 14.316081, 14.603931, 14.318913, 13.970486)
(shape as GeneralPath).curveTo(14.316081, 13.33704, 14.652394, 12.750497, 15.200506, 12.432953)
(shape as GeneralPath).curveTo(15.748619, 12.11541, 16.42474, 12.11541, 16.972853, 12.432953)
(shape as GeneralPath).curveTo(17.520966, 12.750497, 17.857279, 13.33704, 17.854446, 13.970486)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, Point2D.Double(16.086679458618164, 13.97048568725586), floatArrayOf(0.0f,1.0f), arrayOf(Color(254, 233, 100, 255),Color(254, 233, 100, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_18_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(16.970564, 11.584001)
(shape as GeneralPath).lineTo(13.930592, 11.85101)
(shape as GeneralPath).lineTo(13.611806, 14.942758)
(shape as GeneralPath).lineTo(13.344797, 11.902786)
(shape as GeneralPath).lineTo(10.253049, 11.584001)
(shape as GeneralPath).lineTo(13.29302, 11.316992)
(shape as GeneralPath).lineTo(13.611806, 8.225244)
(shape as GeneralPath).lineTo(13.878815, 11.265215)
(shape as GeneralPath).lineTo(16.970564, 11.584001)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, Point2D.Double(13.61180591583252, 11.584000587463379), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.6315789818763733f, 0.0f, 0.0f, 0.6315789818763733f, 9.611074447631836f, 9.83625602722168f))
// _0_0_19
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f))
// _0_0_19_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(17.854446, 13.970486)
(shape as GeneralPath).curveTo(17.857279, 14.603931, 17.520966, 15.1904745, 16.972853, 15.5080185)
(shape as GeneralPath).curveTo(16.42474, 15.825562, 15.748619, 15.825562, 15.200506, 15.5080185)
(shape as GeneralPath).curveTo(14.652394, 15.1904745, 14.316081, 14.603931, 14.318913, 13.970486)
(shape as GeneralPath).curveTo(14.316081, 13.33704, 14.652394, 12.750497, 15.200506, 12.432953)
(shape as GeneralPath).curveTo(15.748619, 12.11541, 16.42474, 12.11541, 16.972853, 12.432953)
(shape as GeneralPath).curveTo(17.520966, 12.750497, 17.857279, 13.33704, 17.854446, 13.970486)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, Point2D.Double(16.086679458618164, 13.97048568725586), floatArrayOf(0.0f,1.0f), arrayOf(Color(254, 233, 100, 255),Color(254, 233, 100, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_19_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(16.970564, 11.584001)
(shape as GeneralPath).lineTo(13.930592, 11.85101)
(shape as GeneralPath).lineTo(13.611806, 14.942758)
(shape as GeneralPath).lineTo(13.344797, 11.902786)
(shape as GeneralPath).lineTo(10.253049, 11.584001)
(shape as GeneralPath).lineTo(13.29302, 11.316992)
(shape as GeneralPath).lineTo(13.611806, 8.225244)
(shape as GeneralPath).lineTo(13.878815, 11.265215)
(shape as GeneralPath).lineTo(16.970564, 11.584001)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, Point2D.Double(13.61180591583252, 11.584000587463379), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.6315789818763733f, 0.0f, 0.0f, 0.6315789818763733f, 4.484549045562744f, 11.515629768371582f))
// _0_0_20
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f))
// _0_0_20_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(17.854446, 13.970486)
(shape as GeneralPath).curveTo(17.857279, 14.603931, 17.520966, 15.1904745, 16.972853, 15.5080185)
(shape as GeneralPath).curveTo(16.42474, 15.825562, 15.748619, 15.825562, 15.200506, 15.5080185)
(shape as GeneralPath).curveTo(14.652394, 15.1904745, 14.316081, 14.603931, 14.318913, 13.970486)
(shape as GeneralPath).curveTo(14.316081, 13.33704, 14.652394, 12.750497, 15.200506, 12.432953)
(shape as GeneralPath).curveTo(15.748619, 12.11541, 16.42474, 12.11541, 16.972853, 12.432953)
(shape as GeneralPath).curveTo(17.520966, 12.750497, 17.857279, 13.33704, 17.854446, 13.970486)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, Point2D.Double(16.086679458618164, 13.97048568725586), floatArrayOf(0.0f,1.0f), arrayOf(Color(254, 233, 100, 255),Color(254, 233, 100, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_20_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(16.970564, 11.584001)
(shape as GeneralPath).lineTo(13.930592, 11.85101)
(shape as GeneralPath).lineTo(13.611806, 14.942758)
(shape as GeneralPath).lineTo(13.344797, 11.902786)
(shape as GeneralPath).lineTo(10.253049, 11.584001)
(shape as GeneralPath).lineTo(13.29302, 11.316992)
(shape as GeneralPath).lineTo(13.611806, 8.225244)
(shape as GeneralPath).lineTo(13.878815, 11.265215)
(shape as GeneralPath).lineTo(16.970564, 11.584001)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, Point2D.Double(13.61180591583252, 11.584000587463379), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f))
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
            return 4.074917316436768
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 4.070621967315674
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 40.664737701416016
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 42.21737289428711
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Preferences_desktop_screensaver(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Preferences_desktop_screensaver(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Preferences_desktop_screensaver(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

