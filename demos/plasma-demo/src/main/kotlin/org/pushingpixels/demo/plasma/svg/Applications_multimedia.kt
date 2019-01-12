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
class Applications_multimedia(private var width: Int, private var height: Int) : ResizableIcon {
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
g.composite = AlphaComposite.getInstance(3, 0.74372f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.8571400046348572f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(24.64299964904785, 44.2859992980957), 22.071f, Point2D.Double(24.64299964904785, 44.2859992980957), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.20712000131607056f, 0.0f, 35.112998962402344f))
shape = GeneralPath()
shape.moveTo(46.714, 44.286)
shape.curveTo(46.74937, 45.92411, 42.55032, 47.440933, 35.706844, 48.26211)
shape.curveTo(28.863367, 49.083286, 20.421633, 49.083286, 13.578157, 48.26211)
shape.curveTo(6.734681, 47.440933, 2.5356293, 45.92411, 2.5709991, 44.286)
shape.curveTo(2.5356293, 42.64789, 6.734681, 41.131065, 13.578157, 40.309887)
shape.curveTo(20.421633, 39.488712, 28.863367, 39.488712, 35.706844, 40.309887)
shape.curveTo(42.55032, 41.131065, 46.74937, 42.64789, 46.714, 44.286)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = RadialGradientPaint(Point2D.Double(27.215999603271484, 35.67300033569336), 19.571f, Point2D.Double(27.215999603271484, 35.67300033569336), floatArrayOf(0.0f,1.0f), arrayOf(Color(93, 93, 93, 255),Color(68, 68, 68, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.8831000328063965f, 5.542399773829683E-23f, 8.493700076394464E-23f, 2.135999917984009f, -64.96800231933594f, -52.486000061035156f))
shape = RoundRectangle2D.Double(5.428599834442139, 16.570999145507812, 38.143001556396484, 28.0, 2.285799980163574, 2.285799980163574)
g.paint = paint
g.fill(shape)
paint = Color(27, 27, 27, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(5.428599834442139, 16.570999145507812, 38.143001556396484, 28.0, 2.285799980163574, 2.285799980163574)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 0.31156f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = LinearGradientPaint(Point2D.Double(5.463500022888184, 13.142999649047852), Point2D.Double(21.535999298095703, 49.143001556396484), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.392099857330322, 17.48900032043457, 36.073001861572266, 26.059999465942383, 0.5474399924278259, 0.5474399924278259)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(-0.9727100133895874f, 0.23202000558376312f, 0.23202000558376312f, 0.9727100133895874f, 45.7859992980957f, 5.110599994659424f))
// _0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_0 = g.transform
g.transform(AffineTransform(0.974405387304794f, -0.22479800086164994f, 0.22479800086164994f, 0.974405387304794f, 0.0f, 0.0f))
// _0_0_3_0
paint = LinearGradientPaint(Point2D.Double(2.761199951171875, 6.110300064086914), Point2D.Double(18.773000717163086, 18.69300079345703), floatArrayOf(0.0f,1.0f), arrayOf(Color(253, 253, 253, 255),Color(212, 212, 212, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = RoundRectangle2D.Double(1.705199956893921, 10.352999687194824, 39.805999755859375, 6.508800029754639, 2.285799980163574, 2.285799980163574)
g.paint = paint
g.fill(shape)
paint = Color(43, 43, 43, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(1.705199956893921, 10.352999687194824, 39.805999755859375, 6.508800029754639, 2.285799980163574, 2.285799980163574)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_1
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(9.1896, 8.9692)
shape.lineTo(6.7611, 15.541)
shape.lineTo(11.475, 14.255)
shape.lineTo(13.904, 7.9692)
shape.lineTo(9.1896, 8.9692)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_2
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(18.332, 6.8978)
shape.lineTo(16.047, 13.398)
shape.lineTo(20.761002, 12.255)
shape.lineTo(23.047, 5.8978)
shape.lineTo(18.332, 6.8978)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_3
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(27.904, 4.6835)
shape.lineTo(25.618, 11.1119995)
shape.lineTo(30.332, 9.969199)
shape.lineTo(32.618, 3.6834993)
shape.lineTo(27.904, 4.6834993)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_4
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(39.413, 2.0183)
shape.curveTo(39.642, 2.1743, 39.814, 2.3819, 39.882, 2.6745)
shape.lineTo(40.614, 5.7504)
shape.lineTo(39.891, 7.7504)
shape.lineTo(35.203, 8.8353)
shape.lineTo(37.483997, 2.4781003)
shape.lineTo(39.413, 2.0183003)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_5 = g.transform
g.transform(AffineTransform(0.974405387304794f, -0.22479800086164994f, 0.22479800086164994f, 0.974405387304794f, 0.0f, 0.0f))
// _0_0_3_5
paint = Color(255, 255, 255, 147)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(2.6717000007629395, 11.32699966430664, 37.84299850463867, 4.606900215148926, 0.5301200151443481, 0.5301200151443481)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_3_5
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(0.974405387304794f, -0.22479800086164994f, 0.22479800086164994f, 0.974405387304794f, 0.0f, 0.0f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(2.761199951171875, 6.110300064086914), Point2D.Double(18.773000717163086, 18.69300079345703), floatArrayOf(0.0f,1.0f), arrayOf(Color(253, 253, 253, 255),Color(212, 212, 212, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.5996699929237366f, -0.5781700015068054f))
shape = RoundRectangle2D.Double(0.6704300045967102, 9.685199737548828, 40.07699966430664, 6.9415998458862305, 2.285799980163574, 2.285799980163574)
g.paint = paint
g.fill(shape)
paint = Color(46, 46, 46, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(0.6704300045967102, 9.685199737548828, 40.07699966430664, 6.9415998458862305, 2.285799980163574, 2.285799980163574)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(10.143, 8.1429)
shape.lineTo(7.7142997, 14.714001)
shape.lineTo(12.429, 13.429001)
shape.lineTo(14.857, 7.142901)
shape.lineTo(10.143, 8.1429)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(19.429, 5.7857)
shape.lineTo(16.786001, 12.785999)
shape.lineTo(21.500002, 11.643)
shape.lineTo(24.143002, 4.7857)
shape.lineTo(19.429, 5.7857)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(29.071, 3.6429)
shape.lineTo(26.5, 10.785999)
shape.lineTo(31.214, 9.6428995)
shape.lineTo(33.786, 2.6428995)
shape.lineTo(29.071, 3.6428995)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(41.295, 0.97768)
shape.curveTo(41.524, 1.1337, 41.696, 1.3413, 41.762997, 1.6339)
shape.lineTo(42.423996, 4.2813)
shape.lineTo(41.343994, 7.0670004)
shape.lineTo(36.227993, 8.2946005)
shape.lineTo(38.579994, 1.5804005)
shape.lineTo(41.294994, 0.97768044)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(0.974405387304794f, -0.22479800086164994f, 0.22479800086164994f, 0.974405387304794f, 0.0f, 0.0f))
// _0_0_9
paint = Color(255, 255, 255, 147)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(1.6368999481201172, 10.659000396728516, 38.19900131225586, 4.914700031280518, 0.5301200151443481, 0.5301200151443481)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
paint = LinearGradientPaint(Point2D.Double(10.678999900817871, 15.928999900817871), Point2D.Double(7.928599834442139, 11.107000350952148), floatArrayOf(0.0f,1.0f), arrayOf(Color(147, 147, 147, 255),Color(217, 217, 217, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(6.5357, 10.893)
shape.lineTo(6.5357, 18.678999)
shape.curveTo(6.5357, 19.143, 6.9286, 19.571, 7.3929, 19.606998)
shape.lineTo(15.285999, 19.606998)
shape.curveTo(16.149, 19.606998, 16.56, 18.345, 15.893, 17.678999)
shape.lineTo(9.6786, 10.393)
shape.curveTo(8.7143, 9.0, 6.5357003, 9.678599, 6.5357003, 10.893)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(27, 27, 27, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(6.5357, 10.893)
shape.lineTo(6.5357, 18.678999)
shape.curveTo(6.5357, 19.143, 6.9286, 19.571, 7.3929, 19.606998)
shape.lineTo(15.285999, 19.606998)
shape.curveTo(16.149, 19.606998, 16.56, 18.345, 15.893, 17.678999)
shape.lineTo(9.6786, 10.393)
shape.curveTo(8.7143, 9.0, 6.5357003, 9.678599, 6.5357003, 10.893)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.07142899930477142f, -4.964300155639648f))
// _0_0_11
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(9.0357, 17.196)
shape.curveTo(9.036472, 17.368769, 8.944744, 17.528746, 8.795249, 17.615355)
shape.curveTo(8.645754, 17.701962, 8.461346, 17.701962, 8.311851, 17.615355)
shape.curveTo(8.162355, 17.528746, 8.070627, 17.368769, 8.0714, 17.196)
shape.curveTo(8.070627, 17.02323, 8.162355, 16.863253, 8.311851, 16.776644)
shape.curveTo(8.461346, 16.690037, 8.645754, 16.690037, 8.795249, 16.776644)
shape.curveTo(8.944744, 16.863253, 9.036472, 17.02323, 9.0357, 17.196)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.07142899930477142f, 0.3214299976825714f))
// _0_0_12
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(9.0357, 17.196)
shape.curveTo(9.036472, 17.368769, 8.944744, 17.528746, 8.795249, 17.615355)
shape.curveTo(8.645754, 17.701962, 8.461346, 17.701962, 8.311851, 17.615355)
shape.curveTo(8.162355, 17.528746, 8.070627, 17.368769, 8.0714, 17.196)
shape.curveTo(8.070627, 17.02323, 8.162355, 16.863253, 8.311851, 16.776644)
shape.curveTo(8.461346, 16.690037, 8.645754, 16.690037, 8.795249, 16.776644)
shape.curveTo(8.944744, 16.863253, 9.036472, 17.02323, 9.0357, 17.196)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_12
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.964300155639648f, 0.3214299976825714f))
// _0_0_13
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(9.0357, 17.196)
shape.curveTo(9.036472, 17.368769, 8.944744, 17.528746, 8.795249, 17.615355)
shape.curveTo(8.645754, 17.701962, 8.461346, 17.701962, 8.311851, 17.615355)
shape.curveTo(8.162355, 17.528746, 8.070627, 17.368769, 8.0714, 17.196)
shape.curveTo(8.070627, 17.02323, 8.162355, 16.863253, 8.311851, 16.776644)
shape.curveTo(8.461346, 16.690037, 8.645754, 16.690037, 8.795249, 16.776644)
shape.curveTo(8.944744, 16.863253, 9.036472, 17.02323, 9.0357, 17.196)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_13
g.composite = AlphaComposite.getInstance(3, 0.26131f * origAlpha)
val defaultTransform__0_0_14 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f))
// _0_0_14
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14_0
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(10.0, 28.429)
shape.lineTo(38.0, 28.429)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_14_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14_1
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(10.0, 32.571)
shape.lineTo(38.0, 32.571)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_14_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14_2
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(32.5, 28.0)
shape.lineTo(32.5, 24.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_14_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14_3
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(10.0, 32.571)
shape.lineTo(38.0, 32.571)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_14_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14_4
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(22.5, 28.0)
shape.lineTo(22.5, 24.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_14_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14_5
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(9.7429, 36.571)
shape.lineTo(23.0429, 36.571)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_14_5
g.transform = defaultTransform__0_0_14
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_15 = g.transform
g.transform(AffineTransform(0.6880599856376648f, 0.0f, 0.0f, 0.6880599856376648f, 11.982000350952148f, 14.732999801635742f))
// _0_0_15
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_15_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15_0
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(13.817, 27.839)
shape.curveTo(13.931001, 28.804, 14.062, 29.766, 14.212001, 30.727001)
shape.lineTo(12.104001, 31.842001)
shape.curveTo(11.971001, 30.899, 11.860001, 29.949001, 11.653001, 29.018002)
shape.lineTo(13.817001, 27.839)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_15_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_15_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15_1
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(17.665, 28.673)
shape.curveTo(17.641, 30.752, 18.343, 29.866001, 15.754001, 31.262001)
shape.curveTo(16.57, 29.959002, 17.946001, 28.644001, 19.303001, 29.817001)
shape.curveTo(21.894001, 30.239002, 17.869001, 32.299, 19.658, 30.132002)
shape.curveTo(22.258001, 27.862001, 21.880001, 29.134003, 24.062, 29.263002)
shape.curveTo(25.842001, 29.693003, 25.858, 29.319002, 23.492, 30.680002)
shape.lineTo(23.588001, 30.596003)
shape.lineTo(25.827002, 29.649002)
shape.curveTo(25.801003, 29.688002, 25.776001, 29.726002, 25.751001, 29.765001)
shape.curveTo(22.939001, 31.443, 24.082, 30.949001, 22.104002, 30.691002)
shape.curveTo(20.237001, 30.364002, 19.228003, 30.138002, 21.883001, 29.207003)
shape.curveTo(20.743002, 30.501003, 18.901001, 32.507004, 17.264002, 31.090002)
shape.curveTo(15.676002, 29.919003, 19.397001, 28.676003, 18.029001, 30.359001)
shape.curveTo(15.346001, 31.837002, 15.628001, 31.910002, 15.468001, 29.793001)
shape.lineTo(17.665, 28.673)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_15_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_15_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15_2
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(29.175, 26.231)
shape.curveTo(29.321, 27.739, 29.401, 29.25, 29.58, 30.755001)
shape.curveTo(31.004, 32.606003, 27.753, 35.389, 28.233, 32.564003)
shape.curveTo(28.575, 29.320004, 28.883, 28.720003, 31.762, 27.684002)
shape.curveTo(32.309, 28.668001, 32.608997, 29.822002, 33.466, 30.412003)
shape.curveTo(28.626, 32.964005, 35.159, 28.931004, 35.887, 28.545002)
shape.curveTo(36.352, 28.436003, 36.826, 28.380001, 37.299, 28.314001)
shape.lineTo(35.378, 29.752)
shape.curveTo(34.913, 29.820002, 34.442997, 29.87, 33.993, 30.013)
shape.curveTo(36.992, 28.101, 33.425, 30.855, 31.487, 31.83)
shape.curveTo(30.563, 31.105999, 30.344, 29.936, 29.703999, 28.95)
shape.curveTo(32.85, 26.731, 30.336998, 28.809, 30.342, 31.527)
shape.curveTo(30.057999, 33.877, 27.022, 35.077, 27.526999, 31.834)
shape.curveTo(27.353998, 30.352, 27.276999, 28.851, 26.996998, 27.386)
shape.lineTo(29.174997, 26.230999)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_15_2
g.transform = defaultTransform__0_0_15
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_16 = g.transform
g.transform(AffineTransform(1.0140000581741333f, 0.0f, 0.0f, 1.0140000581741333f, 1.878600001335144f, 5.469099998474121f))
// _0_0_16
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_16_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16_0
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(11.316, 22.374)
shape.curveTo(13.137, 21.041, 12.443, 22.093, 12.445, 23.521)
shape.curveTo(12.429999, 24.807, 12.620999, 26.078, 12.907, 27.327)
shape.lineTo(11.643999, 28.01)
shape.curveTo(11.356999, 26.75, 11.164999, 25.469, 11.168999, 24.173)
shape.curveTo(11.148998, 22.62, 10.879999, 22.220001, 12.515999, 21.502)
shape.lineTo(11.315999, 22.374)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_16_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_16_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16_1
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(15.611, 22.413)
shape.curveTo(15.587, 23.203001, 15.587, 23.994, 15.584, 24.785)
shape.curveTo(15.582999, 25.117, 15.582999, 25.449, 15.582999, 25.781)
shape.lineTo(14.317999, 26.425)
shape.curveTo(14.317999, 26.094, 14.317999, 25.762, 14.3169985, 25.431)
shape.curveTo(14.313998, 24.649, 14.313998, 23.868, 14.289998, 23.086)
shape.lineTo(15.610998, 22.413)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_16_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_16_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16_2
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(17.833, 21.201)
shape.curveTo(17.932001, 21.997, 17.95, 22.856, 17.978, 23.674)
shape.curveTo(17.986, 23.914999, 17.992, 24.156, 17.998001, 24.397)
shape.lineTo(16.741001, 25.043)
shape.curveTo(16.733002, 24.803, 16.727001, 24.561998, 16.717001, 24.321999)
shape.curveTo(16.681002, 23.506998, 16.675001, 22.673998, 16.512001, 21.873999)
shape.lineTo(17.833, 21.200998)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_16_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_16_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16_3
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(20.258, 20.595)
shape.curveTo(20.060999, 21.276999, 19.989, 21.991, 19.92, 22.699)
shape.curveTo(19.853, 23.46, 19.822, 24.223, 19.791, 24.987)
shape.lineTo(18.534, 25.621)
shape.curveTo(18.564001, 24.858, 18.594, 24.095001, 18.65, 23.332)
shape.curveTo(18.705, 22.644001, 18.733, 21.927, 18.935999, 21.268002)
shape.lineTo(20.258, 20.595001)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_16_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_16_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16_4
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(9.8969, 22.31)
shape.curveTo(10.804, 22.501, 11.724, 22.659, 12.639, 22.814)
shape.curveTo(14.789, 23.146, 16.946, 23.441, 19.107, 23.688)
shape.curveTo(20.011, 23.779999, 20.914, 23.878, 21.817001, 23.984)
shape.lineTo(20.649002, 24.810999)
shape.curveTo(19.755003, 24.699999, 18.860003, 24.596998, 17.964003, 24.498999)
shape.curveTo(15.802003, 24.237999, 13.6430025, 23.943998, 11.489002, 23.620998)
shape.curveTo(10.561003, 23.471998, 9.627102, 23.289999, 8.697103, 23.182)
shape.lineTo(9.896902, 22.31)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_16_4
g.transform = defaultTransform__0_0_16
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
            return 2.230882406234741
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
            return 44.518489837646484
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 48.0
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Applications_multimedia(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Applications_multimedia(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): ResizableIconFactory {
            return ResizableIconFactory { Applications_multimedia(16, 16) }
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

