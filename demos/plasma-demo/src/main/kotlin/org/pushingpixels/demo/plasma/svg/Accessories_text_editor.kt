package org.pushingpixels.demo.plasma.svg

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
class Accessories_text_editor private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(0.02417599968612194f, 0.0f, 0.0f, 0.020867999643087387f, 45.12799835205078f, 40.15399932861328f))
// _0_0_0
g.composite = AlphaComposite.getInstance(3, 0.4f * origAlpha)
val defaultTransform__0_0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_0
paint = LinearGradientPaint(Point2D.Double(302.8599853515625, 366.6499938964844), Point2D.Double(302.8599853515625, 609.510009765625), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(0, 0, 0, 0),Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.774399995803833f, 0.0f, 0.0f, 1.9696999788284302f, -1892.199951171875f, -872.8900146484375f))
shape = Rectangle2D.Double(-1559.300048828125, -150.6999969482422, 1339.5999755859375, 478.3599853515625)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0_0
g.composite = AlphaComposite.getInstance(3, 0.4f * origAlpha)
val defaultTransform__0_0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_1
paint = RadialGradientPaint(Point2D.Double(605.7100219726562, 486.6499938964844), 117.14f, Point2D.Double(605.7100219726562, 486.6499938964844), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.774399995803833f, 0.0f, 0.0f, 1.9696999788284302f, -1891.5999755859375f, -872.8900146484375f))
shape = GeneralPath()
shape.moveTo(-219.62, -150.68)
shape.lineTo(-219.62, 327.65)
shape.curveTo(-76.73999, 328.55, 125.78, 220.48, 125.78, 88.45)
shape.curveTo(125.78, -43.570007, -33.660004, -150.68001, -219.62, -150.68001)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0_1
g.composite = AlphaComposite.getInstance(3, 0.4f * origAlpha)
val defaultTransform__0_0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_2
paint = RadialGradientPaint(Point2D.Double(605.7100219726562, 486.6499938964844), 117.14f, Point2D.Double(605.7100219726562, 486.6499938964844), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-2.774399995803833f, 0.0f, 0.0f, 1.9696999788284302f, 112.76000213623047f, -872.8900146484375f))
shape = GeneralPath()
shape.moveTo(-1559.3, -150.68)
shape.lineTo(-1559.3, 327.65)
shape.curveTo(-1702.1001, 328.55, -1904.7001, 220.48, -1904.7001, 88.45)
shape.curveTo(-1904.7001, -43.570007, -1745.2001, -150.68001, -1559.3, -150.68001)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0_2
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = LinearGradientPaint(Point2D.Double(21.042999267578125, 42.83300018310547), Point2D.Double(14.284000396728516, 6.833399772644043), floatArrayOf(0.0f,1.0f), arrayOf(Color(223, 223, 223, 255),Color(255, 255, 255, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.1378999948501587f, 0.0f, 0.0f, 1.0f, -2.660900115966797f, 0.0f))
shape = GeneralPath()
shape.moveTo(7.1639, 4.5064)
shape.lineTo(39.812897, 4.5064)
shape.curveTo(40.575897, 4.5064, 41.189896, 5.0388002, 41.189896, 5.7002)
shape.lineTo(43.590897, 39.869198)
shape.lineTo(43.602898, 42.217197)
shape.curveTo(43.602898, 42.878197, 42.9889, 43.4102, 42.2269, 43.4102)
shape.lineTo(4.749897, 43.4102)
shape.curveTo(3.987397, 43.4102, 3.373497, 42.878197, 3.373497, 42.217197)
shape.lineTo(3.362297, 40.050198)
shape.lineTo(5.7872972, 5.700199)
shape.curveTo(5.7872972, 5.038999, 6.4011974, 4.506599, 7.1637974, 4.506599)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(26.61199951171875, 28.08300018310547), Point2D.Double(26.22800064086914, 42.83300018310547), floatArrayOf(0.0f,1.0f), arrayOf(Color(147, 147, 147, 255),Color(66, 66, 66, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(7.1639, 4.5064)
shape.lineTo(39.812897, 4.5064)
shape.curveTo(40.575897, 4.5064, 41.189896, 5.0388002, 41.189896, 5.7002)
shape.lineTo(43.590897, 39.869198)
shape.lineTo(43.602898, 42.217197)
shape.curveTo(43.602898, 42.878197, 42.9889, 43.4102, 42.2269, 43.4102)
shape.lineTo(4.749897, 43.4102)
shape.curveTo(3.987397, 43.4102, 3.373497, 42.878197, 3.373497, 42.217197)
shape.lineTo(3.362297, 40.050198)
shape.lineTo(5.7872972, 5.700199)
shape.curveTo(5.7872972, 5.038999, 6.4011974, 4.506599, 7.1637974, 4.506599)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 0.31579f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(0.6166099905967712f, 0.0f, 0.0f, 0.44036999344825745f, 10.61400032043457f, 13.942999839782715f))
// _0_0_2
paint = RadialGradientPaint(Point2D.Double(23.562000274658203, 40.4379997253418), 19.562f, Point2D.Double(23.562000274658203, 40.4379997253418), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.3482399880886078f, 0.0f, 26.354999542236328f))
shape = GeneralPath()
shape.moveTo(43.125, 40.438)
shape.curveTo(43.15635, 42.879192, 39.434628, 45.139633, 33.36909, 46.36339)
shape.curveTo(27.303555, 47.58715, 19.821445, 47.58715, 13.755908, 46.36339)
shape.curveTo(7.690371, 45.139633, 3.9686508, 42.879192, 4.0, 40.438)
shape.curveTo(3.9686508, 37.996807, 7.690371, 35.736366, 13.755908, 34.512608)
shape.curveTo(19.821445, 33.28885, 27.303555, 33.28885, 33.36909, 34.512608)
shape.curveTo(39.434628, 35.736366, 43.15635, 37.996807, 43.125, 40.438)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = Color(164, 164, 164, 255)
shape = RoundRectangle2D.Double(3.9769999980926514, 39.86800003051758, 39.04800033569336, 3.071500062942505, 1.3587599992752075, 1.3587599992752075)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(3.9268, 40.443)
shape.curveTo(3.9268, 40.443, 4.0776, 39.912003, 4.6308002, 39.868)
shape.lineTo(42.1948, 39.868)
shape.curveTo(42.949802, 39.868, 42.9998, 40.62, 42.9998, 40.62)
shape.curveTo(42.9998, 40.62, 43.0238, 39.0, 41.7158, 39.0)
shape.lineTo(5.3038025, 39.0)
shape.curveTo(4.2983027, 39.088, 3.9266024, 39.78, 3.9266024, 40.443)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = LinearGradientPaint(Point2D.Double(6.0, 7.5625), Point2D.Double(40.98400115966797, 7.5625), floatArrayOf(0.0f,1.0f), arrayOf(Color(163, 164, 160, 255),Color(136, 138, 133, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(6.25, 5.7344)
shape.lineTo(6.0, 10.125)
shape.curveTo(6.0, 10.125, 6.3125, 9.0, 7.0, 9.0)
shape.lineTo(40.125, 9.0)
shape.curveTo(40.828, 8.9844, 40.859, 9.3125, 40.984, 9.8281)
shape.lineTo(40.734, 5.9531)
shape.curveTo(40.703003, 5.4062004, 40.516003, 5.0, 39.953003, 5.0)
shape.lineTo(7.0630035, 5.0)
shape.curveTo(6.6094036, 5.0, 6.2969036, 5.3437, 6.2500033, 5.7344)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 0.4386f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(7.8126, 5.5405)
shape.lineTo(38.9446, 5.5405)
shape.curveTo(39.6666, 5.5405, 40.2476, 5.3883, 40.2476, 6.0146003)
shape.curveTo(40.2476, 6.0146003, 42.5216, 39.0226, 42.5216, 39.0226)
shape.lineTo(42.621597, 41.731598)
shape.curveTo(42.621597, 42.357597, 42.482597, 42.3756, 41.760597, 42.3756)
shape.lineTo(4.861599, 42.3756)
shape.curveTo(4.448999, 42.3756, 4.4421988, 42.2696, 4.4421988, 41.864597)
shape.lineTo(4.4315987, 39.193596)
shape.lineTo(6.7276983, 6.045597)
shape.curveTo(6.7276983, 5.419197, 7.0901985, 5.540097, 7.812198, 5.540097)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_0
paint = Color(252, 233, 79, 255)
shape = RoundRectangle2D.Double(8.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.fill(shape)
paint = Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(8.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_1
paint = Color(252, 233, 79, 255)
shape = RoundRectangle2D.Double(12.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.fill(shape)
paint = Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(12.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_2
paint = Color(252, 233, 79, 255)
shape = RoundRectangle2D.Double(16.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.fill(shape)
paint = Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(16.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_3
paint = Color(252, 233, 79, 255)
shape = RoundRectangle2D.Double(20.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.fill(shape)
paint = Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(20.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_4
paint = Color(252, 233, 79, 255)
shape = RoundRectangle2D.Double(24.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.fill(shape)
paint = Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(24.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_5
paint = Color(252, 233, 79, 255)
shape = RoundRectangle2D.Double(28.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.fill(shape)
paint = Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(28.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_6
paint = Color(252, 233, 79, 255)
shape = RoundRectangle2D.Double(32.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.fill(shape)
paint = Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(32.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_7
paint = Color(252, 233, 79, 255)
shape = RoundRectangle2D.Double(36.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.fill(shape)
paint = Color(136, 111, 0, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(36.5, 2.5, 2.0, 5.0, 2.0, 2.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7_7
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
val defaultTransform__0_0_8_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_0
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(9.0, 12.0, 29.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8_0
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
val defaultTransform__0_0_8_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_1
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(9.0, 14.982000350952148, 29.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8_1
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
val defaultTransform__0_0_8_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_2
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(9.0, 18.003999710083008, 13.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8_2
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
val defaultTransform__0_0_8_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_3
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(9.0, 22.986000061035156, 29.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8_3
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
val defaultTransform__0_0_8_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_4
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(9.0, 26.007999420166016, 29.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8_4
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
val defaultTransform__0_0_8_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_5
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(9.0, 29.030000686645508, 29.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8_5
g.composite = AlphaComposite.getInstance(3, 0.2807f * origAlpha)
val defaultTransform__0_0_8_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8_6
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(9.0, 32.051998138427734, 8.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8_6
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
paint = Color(203, 144, 34, 255)
shape = GeneralPath()
shape.moveTo(17.341, 32.5)
shape.lineTo(22.966, 26.875)
shape.lineTo(43.059998, 17.125)
shape.curveTo(46.309998, 15.875, 48.246998, 20.5, 45.371998, 22.125)
shape.lineTo(25.340998, 31.5)
shape.lineTo(17.340998, 32.5)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(92, 65, 12, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(17.341, 32.5)
shape.lineTo(22.966, 26.875)
shape.lineTo(43.059998, 17.125)
shape.curveTo(46.309998, 15.875, 48.246998, 20.5, 45.371998, 22.125)
shape.lineTo(25.340998, 31.5)
shape.lineTo(17.340998, 32.5)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
paint = LinearGradientPaint(Point2D.Double(48.90599822998047, 17.375999450683594), Point2D.Double(50.987998962402344, 22.250999450683594), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(255, 209, 209, 255),Color(255, 29, 29, 255),Color(111, 0, 0, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -5.669300079345703f, 0.0f))
shape = GeneralPath()
shape.moveTo(38.331, 20.0)
shape.curveTo(38.331, 20.0, 39.768, 20.094, 40.331, 21.344)
shape.curveTo(40.91, 22.632, 40.331, 24.0, 40.331, 24.0)
shape.lineTo(45.362, 21.531)
shape.curveTo(45.362, 21.531, 46.814, 20.65, 46.017998, 18.688)
shape.curveTo(45.232998, 16.751999, 43.330997, 17.531, 43.330997, 17.531)
shape.lineTo(38.330997, 20.0)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
paint = LinearGradientPaint(Point2D.Double(46.0, 19.812000274658203), Point2D.Double(47.6879997253418, 22.625), floatArrayOf(0.0f,1.0f), arrayOf(Color(193, 193, 193, 255),Color(172, 172, 172, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -5.669300079345703f, 0.0f))
shape = GeneralPath()
shape.moveTo(38.331, 20.0)
shape.curveTo(38.331, 20.0, 39.768, 20.094, 40.331, 21.344)
shape.curveTo(40.91, 22.632, 40.331, 24.0, 40.331, 24.0)
shape.lineTo(42.331, 23.0)
shape.curveTo(42.331, 23.0, 43.158, 21.681, 42.549, 20.312)
shape.curveTo(41.924, 18.906, 40.331, 19.0, 40.331, 19.0)
shape.lineTo(38.331, 20.0)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
paint = RadialGradientPaint(Point2D.Double(29.05299949645996, 27.641000747680664), 3.2409f, Point2D.Double(29.05299949645996, 27.641000747680664), floatArrayOf(0.0f,1.0f), arrayOf(Color(231, 226, 184, 255),Color(231, 226, 184, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.9235999584198f, 0.0f, 0.0f, 2.0297000408172607f, -61.55500030517578f, -27.884000778198242f))
shape = GeneralPath()
shape.moveTo(18.768, 31.781)
shape.lineTo(23.268, 27.281)
shape.curveTo(24.768, 28.094, 25.549, 29.438, 25.143, 31.0)
shape.lineTo(18.768, 31.781)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_12
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
paint = LinearGradientPaint(Point2D.Double(25.7189998626709, 31.047000885009766), Point2D.Double(25.514999389648438, 30.702999114990234), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(201, 201, 201, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -5.825500011444092f, 0.125f))
shape = GeneralPath()
shape.moveTo(20.112, 30.375)
shape.lineTo(18.487, 31.969)
shape.lineTo(20.831, 31.656)
shape.curveTo(21.049, 30.938, 20.643, 30.594, 20.112, 30.375)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_13
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
paint = Color(255, 255, 255, 93)
shape = GeneralPath()
shape.moveTo(23.268, 27.25)
shape.lineTo(24.831, 28.5)
shape.lineTo(40.218, 21.181)
shape.curveTo(39.774, 20.324999, 38.975998, 20.097, 38.315, 20.019)
shape.lineTo(23.267998, 27.25)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_14
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_15 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
paint = Color(0, 0, 0, 93)
shape = GeneralPath()
shape.moveTo(25.143, 31.062)
shape.lineTo(25.331, 30.312)
shape.lineTo(40.562, 23.183)
shape.curveTo(40.562, 23.183, 40.452, 23.797, 40.346, 23.932001)
shape.lineTo(25.143002, 31.062)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_15
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
        fun of(width: Int, height: Int): ResizableIcon {
            return Accessories_text_editor(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Accessories_text_editor(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): ResizableIconFactory {
            return ResizableIconFactory { Accessories_text_editor(16, 16) }
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

