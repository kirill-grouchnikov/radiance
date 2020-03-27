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
class Mail_message_new private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 0.402f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
shape = Rectangle2D.Double(9.256999969482422, 37.369998931884766, 30.983999252319336, 7.10699987411499)
paint = LinearGradientPaint(Point2D.Double(0.0, 366.6499938964844), Point2D.Double(0.0, 609.510009765625), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(0, 0, 0, 0),Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.06419999897480011f, 0.0f, 0.0f, 0.02930000051856041f, 1.555999994277954f, 26.645000457763672f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.402f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(40.24, 37.38)
(shape as GeneralPath).lineTo(40.24, 44.487)
(shape as GeneralPath).curveTo(43.544003, 44.5, 48.229, 42.895, 48.229, 40.933)
(shape as GeneralPath).curveTo(48.229, 38.970997, 44.541, 37.379997, 40.24, 37.379997)
paint = RadialGradientPaint(Point2D.Double(605.7100219726562, 486.6499938964844), 117.14f, Point2D.Double(605.7100219726562, 486.6499938964844), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.06419999897480011f, 0.0f, 0.0f, 0.02930000051856041f, 1.569000005722046f, 26.645000457763672f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.402f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
shape = GeneralPath()
(shape as GeneralPath).moveTo(9.257, 37.38)
(shape as GeneralPath).lineTo(9.257, 44.487)
(shape as GeneralPath).curveTo(5.953, 44.5, 1.2680001, 42.895, 1.2680001, 40.933)
(shape as GeneralPath).curveTo(1.2680001, 38.970997, 4.9560003, 37.379997, 9.257, 37.379997)
paint = RadialGradientPaint(Point2D.Double(605.7100219726562, 486.6499938964844), 117.14f, Point2D.Double(605.7100219726562, 486.6499938964844), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.06419999897480011f, 0.0f, 0.0f, 0.02930000051856041f, 47.92900085449219f, 26.645000457763672f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3
shape = GeneralPath()
(shape as GeneralPath).moveTo(6.333, 16.972)
(shape as GeneralPath).lineTo(6.333, 41.482002)
(shape as GeneralPath).lineTo(43.306, 41.482002)
(shape as GeneralPath).lineTo(43.244, 17.090002)
(shape as GeneralPath).curveTo(43.241, 15.712002, 31.396, 2.4120016, 29.214, 2.4120016)
(shape as GeneralPath).lineTo(20.662, 2.4120016)
(shape as GeneralPath).curveTo(18.365002, 2.4120016, 6.3360004, 15.674002, 6.3360004, 16.972002)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(11.572999954223633, 4.745999813079834), Point2D.Double(18.475000381469727, 26.020000457763672), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(226, 226, 226, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.880000114440918f, 0.3149999976158142f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(2.062000036239624, 0.0), Point2D.Double(30.600000381469727, 0.0), floatArrayOf(0.0f,1.0f), arrayOf(Color(152, 150, 144, 255),Color(101, 100, 96, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.880000114440918f, 0.3149999976158142f))
stroke = BasicStroke(0.857f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(6.333, 16.972)
(shape as GeneralPath).lineTo(6.333, 41.482002)
(shape as GeneralPath).lineTo(43.306, 41.482002)
(shape as GeneralPath).lineTo(43.244, 17.090002)
(shape as GeneralPath).curveTo(43.241, 15.712002, 31.396, 2.4120016, 29.214, 2.4120016)
(shape as GeneralPath).lineTo(20.662, 2.4120016)
(shape as GeneralPath).curveTo(18.365002, 2.4120016, 6.3360004, 15.674002, 6.3360004, 16.972002)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4
shape = GeneralPath()
(shape as GeneralPath).moveTo(6.923, 16.787)
(shape as GeneralPath).curveTo(6.5249996, 16.357, 18.81, 3.0930004, 20.667, 3.0930004)
(shape as GeneralPath).lineTo(29.043, 3.0930004)
(shape as GeneralPath).curveTo(30.789999, 3.0930004, 43.083, 16.223, 42.47, 16.979)
(shape as GeneralPath).lineTo(31.609001, 30.473999)
(shape as GeneralPath).lineTo(19.295002, 30.155998)
(shape as GeneralPath).lineTo(6.9230022, 16.786)
paint = LinearGradientPaint(Point2D.Double(5.827000141143799, 7.230999946594238), Point2D.Double(13.467000007629395, 17.87700080871582), floatArrayOf(0.0f,1.0f), arrayOf(Color(237, 237, 237, 255),Color(200, 200, 200, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5706000328063965f, 0.0f, 0.0f, 1.190999984741211f, 2.880000114440918f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(19.08, 30.02)
(shape as GeneralPath).lineTo(11.747, 21.274)
(shape as GeneralPath).lineTo(36.565002, 14.338)
(shape as GeneralPath).lineTo(39.595, 20.554)
(shape as GeneralPath).lineTo(32.179, 29.994)
paint = Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.292, 29.836)
(shape as GeneralPath).lineTo(10.809, 21.026001)
(shape as GeneralPath).lineTo(35.457, 14.133001)
(shape as GeneralPath).lineTo(38.631, 20.404001)
(shape as GeneralPath).lineTo(31.39, 29.811)
paint = Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5_2
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.775, 29.957)
(shape as GeneralPath).lineTo(11.099999, 21.297)
(shape as GeneralPath).lineTo(36.068, 14.227001)
(shape as GeneralPath).lineTo(39.354, 20.820002)
(shape as GeneralPath).lineTo(31.874, 29.927002)
paint = Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_6
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.594, 30.441)
(shape as GeneralPath).lineTo(11.261, 21.695)
(shape as GeneralPath).lineTo(35.973, 14.801)
(shape as GeneralPath).lineTo(39.083, 21.189)
(shape as GeneralPath).lineTo(31.963001, 30.175)
paint = LinearGradientPaint(Point2D.Double(10.184000015258789, 15.149999618530273), Point2D.Double(15.310999870300293, 29.569000244140625), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(220, 220, 220, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.8193000555038452f, 0.0f, 0.0f, 1.0282000303268433f, 2.880000114440918f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_7_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(20.488, 29.06)
(shape as GeneralPath).lineTo(7.092001, 40.031998)
(shape as GeneralPath).lineTo(21.001001, 30.427998)
(shape as GeneralPath).lineTo(30.021002, 30.427998)
(shape as GeneralPath).lineTo(42.441, 39.909996)
(shape as GeneralPath).lineTo(30.577002, 29.059996)
(shape as GeneralPath).lineTo(20.487001, 29.059996)
paint = LinearGradientPaint(Point2D.Double(8.916000366210938, 37.20000076293945), Point2D.Double(9.88599967956543, 52.09000015258789), floatArrayOf(0.0f,1.0f), arrayOf(Color(154, 162, 154, 255),Color(181, 190, 181, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.880000114440918f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_7_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(6.963, 16.885)
(shape as GeneralPath).lineTo(18.479, 31.201)
(shape as GeneralPath).lineTo(19.547, 30.347)
(shape as GeneralPath).lineTo(6.9630013, 16.885)
paint = LinearGradientPaint(Point2D.Double(8.916000366210938, 37.20000076293945), Point2D.Double(9.88599967956543, 52.09000015258789), floatArrayOf(0.0f,1.0f), arrayOf(Color(154, 162, 154, 255),Color(181, 190, 181, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.880000114440918f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_8
paint = LinearGradientPaint(Point2D.Double(11.232999801635742, 13.685999870300293), Point2D.Double(21.110000610351562, 24.1299991607666), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(237, 237, 237, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.37090003490448f, 0.0f, 0.0f, 1.4437999725341797f, 2.430999994277954f, -0.14100000262260437f))
stroke = BasicStroke(0.857f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(7.308, 17.13)
(shape as GeneralPath).lineTo(7.339, 40.339996)
(shape as GeneralPath).lineTo(42.284, 40.339996)
(shape as GeneralPath).lineTo(42.221, 17.259996)
(shape as GeneralPath).curveTo(42.219, 16.509996, 31.005001, 3.4609966, 28.837002, 3.4609966)
(shape as GeneralPath).lineTo(20.942001, 3.4609966)
(shape as GeneralPath).curveTo(18.689001, 3.4609966, 7.307001, 16.352997, 7.3080015, 17.132996)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_9_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(20.957, 30.453)
(shape as GeneralPath).lineTo(9.016001, 38.724)
(shape as GeneralPath).lineTo(11.235001, 38.73)
(shape as GeneralPath).lineTo(21.233002, 31.861)
(shape as GeneralPath).lineTo(30.055, 30.438)
(shape as GeneralPath).lineTo(20.955, 30.453)
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_9_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(11.428, 21.67)
(shape as GeneralPath).lineTo(12.752001, 23.081)
(shape as GeneralPath).lineTo(35.543, 16.196999)
(shape as GeneralPath).lineTo(38.458, 21.878998)
(shape as GeneralPath).lineTo(39.072, 21.166998)
(shape as GeneralPath).lineTo(36.003, 14.788998)
(shape as GeneralPath).lineTo(11.427998, 21.669998)
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_10
shape = GeneralPath()
(shape as GeneralPath).moveTo(13.308, 23.636)
(shape as GeneralPath).lineTo(19.338, 30.09)
(shape as GeneralPath).lineTo(20.535, 29.064)
(shape as GeneralPath).lineTo(30.625, 29.106998)
(shape as GeneralPath).lineTo(31.437, 29.833998)
(shape as GeneralPath).lineTo(35.412, 25.089998)
(shape as GeneralPath).curveTo(34.258, 23.678999, 13.311998, 23.635998, 13.311998, 23.635998)
paint = LinearGradientPaint(Point2D.Double(8.779999732971191, 37.78499984741211), Point2D.Double(9.76200008392334, 32.20000076293945), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 33),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.39490008354187f, 0.0f, 0.0f, 0.7810999751091003f, 2.880000114440918f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_11
shape = GeneralPath()
(shape as GeneralPath).moveTo(41.813, 17.848)
(shape as GeneralPath).lineTo(31.861, 30.479)
(shape as GeneralPath).lineTo(30.793, 29.624)
(shape as GeneralPath).lineTo(41.813, 17.848)
paint = Color(177, 177, 177, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_12
shape = Ellipse2D.Double(25.48000144958496, 0.0, 22.520000457763672, 22.520000457763672)
paint = RadialGradientPaint(Point2D.Double(36.7400016784668, 11.258999824523926), 11.26f, Point2D.Double(36.7400016784668, 11.258999824523926), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 245, 32, 227),Color(255, 243, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
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
            return 1.2680001258850098
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
            return 46.731998443603516
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.5
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Mail_message_new(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Mail_message_new(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Mail_message_new(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

