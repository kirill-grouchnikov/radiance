package org.pushingpixels.demo.kormorant.svg

import org.pushingpixels.neon.icon.IsHiDpiAware
import org.pushingpixels.neon.icon.NeonIcon
import org.pushingpixels.neon.icon.NeonIconUIResource
import org.pushingpixels.neon.icon.ResizableIcon
import java.awt.*
import java.awt.geom.AffineTransform
import java.awt.geom.GeneralPath
import java.awt.geom.Point2D
import java.awt.geom.Rectangle2D
import javax.swing.plaf.UIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Ibis SVG transcoder</a>.
 */
class Folder(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
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
g.transform(AffineTransform(0.022624000906944275f, 0.0f, 0.0f, 0.020867999643087387f, 43.382999420166016f, 36.369998931884766f))
// _0_0_0
g.composite = AlphaComposite.getInstance(3, 0.40206f * origAlpha)
val defaultTransform__0_0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_0
paint = LinearGradientPaint(Point2D.Double(302.8599853515625, 366.6499938964844), Point2D.Double(302.8599853515625, 609.510009765625), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(0, 0, 0, 0),Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.774399995803833f, 0.0f, 0.0f, 1.9696999788284302f, -1892.199951171875f, -872.8900146484375f))
shape = Rectangle2D.Double(-1559.300048828125, -150.6999969482422, 1339.5999755859375, 478.3599853515625)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0_0
g.composite = AlphaComposite.getInstance(3, 0.40206f * origAlpha)
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
g.composite = AlphaComposite.getInstance(3, 0.40206f * origAlpha)
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
paint = RadialGradientPaint(Point2D.Double(20.70599937438965, 37.518001556396484), 30.905f, Point2D.Double(20.70599937438965, 37.518001556396484), floatArrayOf(0.0f,1.0f), arrayOf(Color(32, 32, 32, 255),Color(185, 185, 185, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0549999475479126f, -0.027344999834895134f, 0.1776999980211258f, 1.1908999681472778f, -3.572200059890747f, -7.12529993057251f))
shape = GeneralPath()
shape.moveTo(4.5218, 38.687)
shape.curveTo(4.5436, 39.104, 4.9817, 39.52, 5.3980002, 39.52)
shape.lineTo(36.725, 39.52)
shape.curveTo(37.141, 39.52, 37.536, 39.104, 37.514, 38.687)
shape.lineTo(36.578, 11.461)
shape.curveTo(36.556, 11.044001, 36.118, 10.628, 35.701, 10.628)
shape.lineTo(22.431, 10.628)
shape.curveTo(21.945, 10.628, 21.196, 10.312, 21.029, 9.5214)
shape.lineTo(20.417, 6.628401)
shape.curveTo(20.262, 5.8927007, 19.535, 5.590501, 19.119, 5.590501)
shape.lineTo(4.339999, 5.590501)
shape.curveTo(3.9237993, 5.590501, 3.5292993, 6.0068007, 3.5510993, 6.423101)
shape.lineTo(4.521799, 38.6871)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(18.113000869750977, 31.368000030517578), Point2D.Double(15.515000343322754, 6.180300235748291), floatArrayOf(0.0f,1.0f), arrayOf(Color(66, 66, 66, 255),Color(119, 119, 119, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.5218, 38.687)
shape.curveTo(4.5436, 39.104, 4.9817, 39.52, 5.3980002, 39.52)
shape.lineTo(36.725, 39.52)
shape.curveTo(37.141, 39.52, 37.536, 39.104, 37.514, 38.687)
shape.lineTo(36.578, 11.461)
shape.curveTo(36.556, 11.044001, 36.118, 10.628, 35.701, 10.628)
shape.lineTo(22.431, 10.628)
shape.curveTo(21.945, 10.628, 21.196, 10.312, 21.029, 9.5214)
shape.lineTo(20.417, 6.628401)
shape.curveTo(20.262, 5.8927007, 19.535, 5.590501, 19.119, 5.590501)
shape.lineTo(4.339999, 5.590501)
shape.curveTo(3.9237993, 5.590501, 3.5292993, 6.0068007, 3.5510993, 6.423101)
shape.lineTo(4.521799, 38.6871)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.2266, 22.562)
shape.lineTo(35.4916, 22.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.2266, 22.562)
shape.lineTo(35.4916, 22.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.0422, 18.562)
shape.lineTo(35.4892, 18.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.0422, 18.562)
shape.lineTo(35.4892, 18.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(4.9807, 12.562)
shape.lineTo(35.4877, 12.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.9807, 12.562)
shape.lineTo(35.4877, 12.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.3862, 32.562)
shape.lineTo(35.4952, 32.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.3862, 32.562)
shape.lineTo(35.4952, 32.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.5091, 34.562)
shape.lineTo(35.4971, 34.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.5091, 34.562)
shape.lineTo(35.4971, 34.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.0422, 16.562)
shape.lineTo(35.4892, 16.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.0422, 16.562)
shape.lineTo(35.4892, 16.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.0114, 14.562)
shape.lineTo(35.489403, 14.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.0114, 14.562)
shape.lineTo(35.489403, 14.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(4.9221, 10.562)
shape.lineTo(20.2031, 10.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.9221, 10.562)
shape.lineTo(20.2031, 10.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(4.8738, 8.5625)
shape.lineTo(19.6568, 8.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.8738, 8.5625)
shape.lineTo(19.6568, 8.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.3247, 28.562)
shape.lineTo(35.493702, 28.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.3247, 28.562)
shape.lineTo(35.493702, 28.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.2881, 26.562)
shape.lineTo(35.4931, 26.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.2881, 26.562)
shape.lineTo(35.4931, 26.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_12
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.2266, 24.562)
shape.lineTo(35.4916, 24.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.2266, 24.562)
shape.lineTo(35.4916, 24.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_13
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_14 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.1959, 20.562)
shape.lineTo(35.491898, 20.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.1959, 20.562)
shape.lineTo(35.491898, 20.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_14
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_15 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.3247, 30.562)
shape.lineTo(35.493702, 30.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.3247, 30.562)
shape.lineTo(35.493702, 30.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_15
g.composite = AlphaComposite.getInstance(3, 0.11364f * origAlpha)
val defaultTransform__0_0_16 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.5091, 36.562)
shape.lineTo(35.4971, 36.562)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.5091, 36.562)
shape.lineTo(35.4971, 36.562)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_16
g.composite = AlphaComposite.getInstance(3, 0.45143f * origAlpha)
val defaultTransform__0_0_17 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17
paint = LinearGradientPaint(Point2D.Double(6.229800224304199, 13.77299976348877), Point2D.Double(9.898099899291992, 66.83399963378906), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 223),Color(255, 255, 254, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.516800045967102f, 0.0f, 0.0f, 0.7089800238609314f, -0.8795700073242188f, -1.3181999921798706f))
shape = GeneralPath()
shape.moveTo(6.0683, 38.864)
shape.curveTo(6.0846996, 39.176, 5.8873997, 39.384, 5.5698, 39.28)
shape.curveTo(5.2521, 39.176, 5.033, 38.968, 5.0167, 38.656)
shape.lineTo(4.069, 6.5909996)
shape.curveTo(4.0526, 6.2791996, 4.2341, 6.0905995, 4.5463996, 6.0905995)
shape.lineTo(18.9684, 6.0428996)
shape.curveTo(19.281399, 6.0428996, 19.900398, 6.3433995, 20.101398, 7.3650994)
shape.lineTo(20.675398, 10.181)
shape.curveTo(20.248398, 9.7154, 20.256397, 9.701, 20.037397, 9.0239)
shape.lineTo(19.631397, 7.7647)
shape.curveTo(19.412397, 7.0371, 18.933397, 6.9328, 18.621397, 6.9328)
shape.lineTo(5.7333975, 6.9328)
shape.curveTo(5.4211974, 6.9328, 5.2238975, 7.141, 5.2402973, 7.4532)
shape.lineTo(6.1782975, 38.9682)
shape.lineTo(6.0686975, 38.8642)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_17
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_18 = g.transform
g.transform(AffineTransform(1.0407999753952026f, 0.0f, 0.054492998868227005f, 1.0407999753952026f, -8.67020034790039f, 2.670599937438965f))
// _0_0_18
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_18_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_18_0
paint = Color(255, 255, 255, 130)
shape = GeneralPath()
shape.moveTo(42.417, 8.5152)
shape.curveTo(42.422, 8.418099, 42.289, 8.2682, 42.182, 8.2682)
shape.lineTo(29.151, 8.2661)
shape.curveTo(29.151, 8.2661, 30.061998, 8.854, 31.352, 8.8623)
shape.lineTo(42.406, 8.9333)
shape.curveTo(42.417, 8.7216, 42.408997, 8.6773, 42.417, 8.5152)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_18_0
g.transform = defaultTransform__0_0_18
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_19 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_19
paint = LinearGradientPaint(Point2D.Double(22.176000595092773, 36.987998962402344), Point2D.Double(22.065000534057617, 32.04999923706055), floatArrayOf(0.0f,1.0f), arrayOf(Color(97, 148, 203, 255),Color(114, 159, 207, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(39.784, 39.511)
shape.curveTo(40.927002, 39.467003, 41.747, 38.414, 41.831, 37.190002)
shape.curveTo(42.622, 25.641003, 43.49, 15.958002, 43.49, 15.958002)
shape.curveTo(43.562, 15.710002, 43.322002, 15.463002, 43.010002, 15.463002)
shape.lineTo(8.639004, 15.463002)
shape.curveTo(8.638604, 15.463002, 6.788304, 37.33, 6.788304, 37.33)
shape.curveTo(6.673804, 38.312, 6.322304, 39.134003, 5.238504, 39.513)
shape.lineTo(39.784504, 39.511)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(1.0f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(39.784, 39.511)
shape.curveTo(40.927002, 39.467003, 41.747, 38.414, 41.831, 37.190002)
shape.curveTo(42.622, 25.641003, 43.49, 15.958002, 43.49, 15.958002)
shape.curveTo(43.562, 15.710002, 43.322002, 15.463002, 43.010002, 15.463002)
shape.lineTo(8.639004, 15.463002)
shape.curveTo(8.638604, 15.463002, 6.788304, 37.33, 6.788304, 37.33)
shape.curveTo(6.673804, 38.312, 6.322304, 39.134003, 5.238504, 39.513)
shape.lineTo(39.784504, 39.511)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_19
g.composite = AlphaComposite.getInstance(3, 0.46591f * origAlpha)
val defaultTransform__0_0_20 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_20
paint = LinearGradientPaint(Point2D.Double(13.03600025177002, 32.56700134277344), Point2D.Double(12.854000091552734, 46.68899917602539), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3174999952316284f, 0.0f, 0.0f, 0.8162599802017212f, -0.8795700073242188f, -1.3181999921798706f))
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(9.6202, 16.464)
shape.lineTo(42.4112, 16.529001)
shape.lineTo(40.8372, 36.531002)
shape.curveTo(40.7532, 37.602, 40.3872, 37.959003, 38.9652, 37.959003)
shape.curveTo(37.093197, 37.959003, 10.287199, 37.927002, 7.570198, 37.927002)
shape.curveTo(7.803698, 37.606003, 7.9038982, 36.938004, 7.905198, 36.922)
shape.lineTo(9.620398, 16.464)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_20
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_21 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_21
paint = Color(255, 255, 255, 23)
shape = GeneralPath()
shape.moveTo(9.6202, 16.223)
shape.lineTo(8.4536, 31.866)
shape.curveTo(8.4536, 31.866, 16.75, 27.717999, 27.1196, 27.717999)
shape.curveTo(37.4892, 27.717999, 42.6746, 16.223, 42.6746, 16.223)
shape.lineTo(9.619598, 16.223)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_21
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
         * Returns an instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Folder(width, height))
        }

        /**
         * Returns a [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Folder(width, height))
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

    override fun isHiDpiAware(): Boolean {
        return true
    }

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
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

