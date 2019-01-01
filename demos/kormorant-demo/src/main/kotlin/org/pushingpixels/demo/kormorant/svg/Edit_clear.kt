package org.pushingpixels.demo.kormorant.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.neon.icon.ResizableIconFactory
import org.pushingpixels.neon.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Edit_clear(private var width: Int, private var height: Int) : ResizableIcon {
	private fun innerPaint(g : Graphics2D) {
        @Suppress("UNUSED_VARIABLE") var shape: Shape?
        @Suppress("UNUSED_VARIABLE") var paint: Paint?
        @Suppress("UNUSED_VARIABLE") var stroke: Stroke?
         
        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    val defaultTransform_ = g.transform
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 0.47368422f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.4357800483703613f, 0.0f, 0.0f, 0.8257039785385132f, -5.050459861755371f, 13.431819915771484f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(22.571428298950195, 30.85714340209961), 15.571428f, Point2D.Double(22.571428298950195, 30.85714340209961), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.6513760089874268f, 4.792387901721585E-15f, 10.757539749145508f))
shape = GeneralPath()
shape.moveTo(38.142857, 30.857143)
shape.curveTo(38.16781, 34.491642, 35.205383, 37.857037, 30.377314, 39.678993)
shape.curveTo(25.549248, 41.500954, 19.593609, 41.500954, 14.765542, 39.678993)
shape.curveTo(9.937474, 37.857037, 6.9750466, 34.491642, 7.0, 30.857143)
shape.curveTo(6.9750466, 27.222643, 9.937474, 23.85725, 14.765542, 22.035294)
shape.curveTo(19.593609, 20.213335, 25.549248, 20.213335, 30.377314, 22.035294)
shape.curveTo(35.205383, 23.85725, 38.16781, 27.222643, 38.142857, 30.857143)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = LinearGradientPaint(Point2D.Double(12.23343276977539, 12.3632230758667), Point2D.Double(16.870908737182617, 17.11094093322754), floatArrayOf(0.0f,1.0f), arrayOf(Color(193, 125, 16, 255),Color(155, 101, 12, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9659259915351868f, 0.26210200786590576f, -0.25881901383399963f, 0.978177011013031f, 2.9570720195770264f, -5.939741134643555f))
shape = GeneralPath()
shape.moveTo(6.9163117, 1.7780186)
shape.curveTo(8.646088, 0.8999591, 11.042237, 1.7815151, 11.928102, 3.3353386)
shape.lineTo(16.098341, 12.820053)
shape.curveTo(16.984205, 14.373873, 16.731756, 16.189358, 15.532312, 16.890638)
shape.curveTo(14.332867, 17.591923, 12.654079, 16.90558, 11.768213, 15.351758)
shape.lineTo(5.84975, 6.996031)
shape.curveTo(4.9638853, 5.4422064, 5.2207537, 2.6387086, 6.9163117, 1.7780186)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(143, 89, 2, 255)
stroke = BasicStroke(1.0063211f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(6.9163117, 1.7780186)
shape.curveTo(8.646088, 0.8999591, 11.042237, 1.7815151, 11.928102, 3.3353386)
shape.lineTo(16.098341, 12.820053)
shape.curveTo(16.984205, 14.373873, 16.731756, 16.189358, 15.532312, 16.890638)
shape.curveTo(14.332867, 17.591923, 12.654079, 16.90558, 11.768213, 15.351758)
shape.lineTo(5.84975, 6.996031)
shape.curveTo(4.9638853, 5.4422064, 5.2207537, 2.6387086, 6.9163117, 1.7780186)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 0.4230769f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = LinearGradientPaint(Point2D.Double(9.56215763092041, 6.952558994293213), Point2D.Double(14.766724586486816, 14.200403213500977), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0056905f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(7.44627, 2.7359104)
shape.curveTo(8.868223, 1.9500906, 10.266975, 2.5431693, 11.141568, 4.0752983)
shape.lineTo(15.589706, 14.162023)
shape.lineTo(13.158185, 15.581885)
shape.lineTo(6.861574, 6.761549)
shape.curveTo(5.986981, 5.2294207, 5.9853272, 3.5432765, 7.44627, 2.7359104)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = RadialGradientPaint(Point2D.Double(20.764476776123047, 19.540945053100586), 14.799585f, Point2D.Double(20.764476776123047, 19.540945053100586), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(254, 240, 136, 255),Color(253, 230, 58, 255),Color(218, 194, 3, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.449398010969162f, -0.21649199724197388f, 0.5644159913063049f, 1.171617031097412f, -1.4322880506515503f, 2.5461080074310303f))
shape = GeneralPath()
shape.moveTo(14.780848, 22.793568)
shape.curveTo(13.985353, 27.080402, 15.414814, 36.746067, 21.040081, 42.487564)
shape.curveTo(25.386835, 42.628857, 35.03017, 39.06988, 41.571175, 32.290527)
shape.curveTo(32.335, 27.773815, 26.034647, 16.567549, 21.135868, 19.007853)
shape.lineTo(14.780848, 22.793568)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(196, 160, 0, 255)
stroke = BasicStroke(1.0000005f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(14.780848, 22.793568)
shape.curveTo(13.985353, 27.080402, 15.414814, 36.746067, 21.040081, 42.487564)
shape.curveTo(25.386835, 42.628857, 35.03017, 39.06988, 41.571175, 32.290527)
shape.curveTo(32.335, 27.773815, 26.034647, 16.567549, 21.135868, 19.007853)
shape.lineTo(14.780848, 22.793568)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(9.105389595031738, 38.82814407348633), Point2D.Double(10.146956443786621, 30.140830993652344), floatArrayOf(0.0f,1.0f), arrayOf(Color(196, 160, 0, 255),Color(196, 160, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.866025984287262f, -0.5f, 0.7974910140037537f, 1.3812940120697021f, -15.699090003967285f, -9.225098609924316f))
stroke = BasicStroke(0.9999999f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(16.33836, 24.367273)
shape.curveTo(18.687374, 30.637545, 18.827803, 37.155575, 23.522142, 42.28716)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 0.46153846f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(0.99999976f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(15.91878, 23.414124)
shape.curveTo(15.006687, 23.922228, 15.758401, 35.934338, 21.503035, 41.41449)
shape.curveTo(28.88902, 41.227592, 37.02675, 35.018303, 39.895985, 32.576645)
shape.curveTo(30.39657, 26.592524, 24.971184, 17.814877, 21.415195, 20.003061)
shape.lineTo(15.91878, 23.414124)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = LinearGradientPaint(Point2D.Double(19.616243362426758, 39.25298309326172), Point2D.Double(18.48598289489746, 29.90907096862793), floatArrayOf(0.0f,1.0f), arrayOf(Color(196, 160, 0, 255),Color(196, 160, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.866025984287262f, -0.5f, 0.7979609966278076f, 1.3821099996566772f, -15.729339599609375f, -9.277499198913574f))
stroke = BasicStroke(0.9999997f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(23.848486, 22.273333)
shape.curveTo(24.714846, 21.524332, 29.598505, 28.360998, 38.846985, 34.655132)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = LinearGradientPaint(Point2D.Double(15.096997261047363, 36.967769622802734), Point2D.Double(14.045431137084961, 29.0), floatArrayOf(0.0f,1.0f), arrayOf(Color(196, 160, 0, 255),Color(196, 160, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.866025984287262f, -0.5f, 0.8434789776802063f, 1.4609479904174805f, -19.740530014038086f, -11.13422966003418f))
stroke = BasicStroke(1.0000002f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(18.012894, 22.86392)
shape.curveTo(21.725203, 28.211416, 20.975883, 35.288177, 26.853708, 40.94503)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = LinearGradientPaint(Point2D.Double(14.045431137084961, 37.575889587402344), Point2D.Double(14.045431137084961, 29.0), floatArrayOf(0.0f,1.0f), arrayOf(Color(196, 160, 0, 255),Color(196, 160, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.866025984287262f, -0.5f, 0.8013049960136414f, 1.3878999948501587f, -12.818300247192383f, -11.144559860229492f))
stroke = BasicStroke(1.0000002f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(22.983898, 22.775822)
shape.curveTo(22.983898, 22.775822, 31.160627, 35.84745, 34.165833, 37.880383)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
paint = LinearGradientPaint(Point2D.Double(16.928730010986328, 34.010501861572266), Point2D.Double(14.045431137084961, 29.0), floatArrayOf(0.0f,1.0f), arrayOf(Color(196, 160, 0, 255),Color(196, 160, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.866025984287262f, -0.5f, 0.8614869713783264f, 1.4921400547027588f, -17.8795108795166f, -13.910849571228027f))
stroke = BasicStroke(1.0000001f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(19.300308, 22.200695)
shape.curveTo(22.747454, 25.11751, 28.002865, 36.363884, 30.610323, 39.678444)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
paint = LinearGradientPaint(Point2D.Double(11.9966459274292, 19.59173583984375), Point2D.Double(17.774032592773438, 16.234594345092773), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(218, 194, 3, 255),Color(253, 236, 105, 255),Color(253, 239, 126, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0148910284042358f, 0.0f, 0.0f, 1.0059200525283813f, -0.331699013710022f, -0.14018799364566803f))
shape = GeneralPath()
shape.moveTo(8.508945, 18.061867)
shape.lineTo(19.970615, 11.50296)
shape.curveTo(20.569265, 13.885531, 19.628777, 14.743545, 21.766565, 18.650673)
shape.lineTo(13.856274, 23.177313)
shape.curveTo(12.402846, 19.699894, 10.291388, 19.767015, 8.508945, 18.061867)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(196, 160, 0, 255)
stroke = BasicStroke(1.0103954f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(8.508945, 18.061867)
shape.lineTo(19.970615, 11.50296)
shape.curveTo(20.569265, 13.885531, 19.628777, 14.743545, 21.766565, 18.650673)
shape.lineTo(13.856274, 23.177313)
shape.curveTo(12.402846, 19.699894, 10.291388, 19.767015, 8.508945, 18.061867)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 0.24725272f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(14.043449, 21.24569)
shape.curveTo(13.229488, 19.824472, 11.481136, 19.009348, 10.36413, 18.11846)
shape.lineTo(19.121552, 13.184722)
shape.curveTo(19.10196, 14.66569, 19.688457, 16.272928, 19.997164, 17.703388)
shape.lineTo(14.043449, 21.24569)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(0.8660249710083008f, -0.5000010132789612f, 0.5f, 0.866025984287262f, 0.0f, 0.0f))
// _0_0_12
paint = LinearGradientPaint(Point2D.Double(10.615303993225098, 28.122554779052734), Point2D.Double(2.006974697113037, 27.234832763671875), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(179, 0, 0, 255),Color(255, 92, 92, 255),Color(195, 0, 0, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.1766999959945679f, 2.2371020257157828E-17f, 2.3198430825921146E-17f, 1.1767020225524902f, -0.819769024848938f, -5.3070549964904785f))
shape = RoundRectangle2D.Double(-1.4127867221832275, 24.17477798461914, 13.015023231506348, 3.459890604019165, 1.9999947547912598, 1.9999960660934448)
g.paint = paint
g.fill(shape)
paint = Color(105, 0, 0, 255)
stroke = BasicStroke(0.99999803f,1,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(-1.4127867221832275, 24.17477798461914, 13.015023231506348, 3.459890604019165, 1.9999947547912598, 1.9999960660934448)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_12
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_13 = g.transform
g.transform(AffineTransform(0.5835570096969604f, 0.15636399388313293f, -0.15636399388313293f, 0.5835570096969604f, 20.457820892333984f, 5.158782005310059f))
// _0_0_13
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(-17.172594, 4.083618)
shape.curveTo(-17.169153, 4.8528023, -17.577536, 5.565034, -18.243101, 5.950622)
shape.curveTo(-18.908667, 6.3362107, -19.72967, 6.3362107, -20.395235, 5.950622)
shape.curveTo(-21.0608, 5.565034, -21.469183, 4.8528023, -21.465742, 4.083618)
shape.curveTo(-21.469183, 3.3144343, -21.0608, 2.6022027, -20.395235, 2.2166142)
shape.curveTo(-19.72967, 1.8310258, -18.908667, 1.8310258, -18.243101, 2.2166142)
shape.curveTo(-17.577536, 2.6022027, -17.169153, 3.3144343, -17.172594, 4.083618)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(143, 89, 2, 255)
stroke = BasicStroke(1.6552416f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(-17.172594, 4.083618)
shape.curveTo(-17.169153, 4.8528023, -17.577536, 5.565034, -18.243101, 5.950622)
shape.curveTo(-18.908667, 6.3362107, -19.72967, 6.3362107, -20.395235, 5.950622)
shape.curveTo(-21.0608, 5.565034, -21.469183, 4.8528023, -21.465742, 4.083618)
shape.curveTo(-21.469183, 3.3144343, -21.0608, 2.6022027, -20.395235, 2.2166142)
shape.curveTo(-19.72967, 1.8310258, -18.908667, 1.8310258, -18.243101, 2.2166142)
shape.curveTo(-17.577536, 2.6022027, -17.169153, 3.3144343, -17.172594, 4.083618)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_13
g.composite = AlphaComposite.getInstance(3, 0.31730768f * origAlpha)
val defaultTransform__0_0_14 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(27.734835, 40.55524)
shape.curveTo(27.734835, 40.55524, 29.241419, 40.054592, 29.910933, 39.613483)
shape.curveTo(28.673494, 37.66894, 26.507591, 33.71782, 24.507807, 30.737564)
shape.curveTo(25.70105, 37.2783, 27.734835, 40.55524, 27.734835, 40.55524)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_14
g.composite = AlphaComposite.getInstance(3, 0.31730768f * origAlpha)
val defaultTransform__0_0_15 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(31.141806, 39.05827)
shape.lineTo(33.167805, 37.9731)
shape.curveTo(31.223259, 36.116943, 25.699306, 27.857203, 25.699306, 27.857203)
shape.lineTo(31.141806, 39.05827)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_15
g.composite = AlphaComposite.getInstance(3, 0.31730768f * origAlpha)
val defaultTransform__0_0_16 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(35.658524, 36.38781)
shape.lineTo(38.094894, 34.64406)
shape.curveTo(34.91291, 33.318233, 26.508352, 24.763609, 26.508352, 24.763609)
shape.curveTo(28.891289, 27.775503, 33.275585, 33.375916, 35.658524, 36.38781)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_16
g.composite = AlphaComposite.getInstance(3, 0.31730768f * origAlpha)
val defaultTransform__0_0_17 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(39.15369, 33.91721)
shape.lineTo(40.846, 32.5077)
shape.curveTo(37.53144, 31.005098, 28.350325, 22.595682, 28.350325, 22.595682)
shape.curveTo(28.350325, 22.595682, 34.42491, 31.795889, 39.15369, 33.91721)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_17
g.composite = AlphaComposite.getInstance(3, 0.31730765f * origAlpha)
val defaultTransform__0_0_18 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_18
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(24.376076, 41.571705)
shape.curveTo(24.376076, 41.571705, 25.573301, 41.292027, 26.419592, 41.116085)
shape.curveTo(24.961184, 39.87865, 22.618504, 36.67883, 21.325825, 32.50533)
shape.curveTo(21.856155, 39.399624, 24.376076, 41.571705, 24.376076, 41.571705)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_18
g.composite = AlphaComposite.getInstance(3, 0.31730765f * origAlpha)
val defaultTransform__0_0_19 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_19
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(21.370872, 41.96945)
shape.curveTo(21.370872, 41.96945, 22.618893, 41.955776, 22.618893, 41.955776)
shape.curveTo(20.320795, 39.436707, 19.480717, 36.590443, 18.188038, 32.549526)
shape.curveTo(18.055456, 37.234108, 21.370872, 41.96945, 21.370872, 41.96945)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_19
g.transform = defaultTransform__0_0
g.transform = defaultTransform__0
g.transform = defaultTransform_

	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 4.734177589416504
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.3300114870071411
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 43.26582336425781
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 47.36931228637695
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Edit_clear(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Edit_clear(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): ResizableIconFactory {
            return ResizableIconFactory { Edit_clear(16, 16) }
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

