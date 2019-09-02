package org.pushingpixels.demo.plasma.svg

import java.awt.*
import java.awt.geom.*
import java.awt.image.BufferedImage
import java.io.*
import java.lang.ref.WeakReference
import java.util.Base64
import javax.imageio.ImageIO
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.neon.icon.ResizableIcon.Factory
import org.pushingpixels.neon.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Appointment_new private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
    

	private fun innerPaint(g : Graphics2D) {
        @Suppress("UNUSED_VARIABLE") var shape: Shape?
        @Suppress("UNUSED_VARIABLE") var paint: Paint?
        @Suppress("UNUSED_VARIABLE") var stroke: Stroke?
        @Suppress("UNUSED_VARIABLE") var clip: Shape?

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
g.transform(AffineTransform(2.5631580352783203f, 0.0f, 0.0f, 1.2196019887924194f, -55.98413848876953f, 14.0414400100708f))
// _0_0_0
shape = GeneralPath()
shape.moveTo(39.774754, 19.008621)
shape.curveTo(39.788635, 22.112505, 38.140697, 24.986568, 35.454945, 26.54253)
shape.curveTo(32.769196, 28.098494, 29.4562, 28.098494, 26.770447, 26.54253)
shape.curveTo(24.084696, 24.986568, 22.436758, 22.112505, 22.45064, 19.008621)
shape.curveTo(22.436758, 15.904738, 24.084696, 13.030674, 26.770447, 11.474711)
shape.curveTo(29.4562, 9.918749, 32.769196, 9.918749, 35.454945, 11.474711)
shape.curveTo(38.140697, 13.030674, 39.788635, 15.904738, 39.774754, 19.008621)
shape.closePath()
paint = RadialGradientPaint(Point2D.Double(31.11269760131836, 19.008621215820312), 8.662058f, Point2D.Double(31.11269760131836, 19.008621215820312), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
shape = GeneralPath()
shape.moveTo(18.587591, 1.403729)
shape.lineTo(4.226755, 18.096664)
shape.lineTo(5.4854717, 19.339844)
shape.lineTo(18.587591, 1.403729)
shape.closePath()
paint = LinearGradientPaint(Point2D.Double(8.915647506713867, 37.197017669677734), Point2D.Double(9.885503768920898, 52.09067916870117), floatArrayOf(0.0f,1.0f), arrayOf(Color(154, 162, 154, 255),Color(181, 190, 181, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(3.1238410472869873f, 0.0f, 0.0f, 0.9696909785270691f, -31.88758087158203f, -19.594919204711914f))
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
shape = GeneralPath()
shape.moveTo(18.467176, 1.3138036)
shape.lineTo(5.6605716, 19.072613)
shape.lineTo(7.4900985, 20.687914)
shape.lineTo(18.467176, 1.3138036)
shape.closePath()
paint = Color(254, 254, 254, 255)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.4315290451049805f, 0.0f, 0.0f, 1.4315290451049805f, 0.5694590210914612f, -1.6546180248260498f))
// _0_0_3
shape = GeneralPath()
shape.moveTo(31.160713, 16.910715)
shape.curveTo(31.184608, 22.253685, 28.34788, 27.20105, 23.724672, 29.879456)
shape.curveTo(19.101465, 32.55786, 13.398534, 32.55786, 8.775327, 29.879456)
shape.curveTo(4.15212, 27.20105, 1.3153913, 22.253685, 1.3392859, 16.910715)
shape.curveTo(1.3153913, 11.567745, 4.15212, 6.6203814, 8.775327, 3.9419744)
shape.curveTo(13.398534, 1.2635677, 19.101465, 1.2635677, 23.724672, 3.9419744)
shape.curveTo(28.34788, 6.6203814, 31.184608, 11.567745, 31.160713, 16.910715)
shape.closePath()
paint = RadialGradientPaint(Point2D.Double(8.746825218200684, 6.8283233642578125), 29.889715f, Point2D.Double(8.746825218200684, 6.8283233642578125), floatArrayOf(0.0f,1.0f), arrayOf(Color(148, 151, 179, 255),Color(76, 64, 89, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = Color(96, 87, 115, 255)
stroke = BasicStroke(0.69855404f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(31.160713, 16.910715)
shape.curveTo(31.184608, 22.253685, 28.34788, 27.20105, 23.724672, 29.879456)
shape.curveTo(19.101465, 32.55786, 13.398534, 32.55786, 8.775327, 29.879456)
shape.curveTo(4.15212, 27.20105, 1.3153913, 22.253685, 1.3392859, 16.910715)
shape.curveTo(1.3153913, 11.567745, 4.15212, 6.6203814, 8.775327, 3.9419744)
shape.curveTo(13.398534, 1.2635677, 19.101465, 1.2635677, 23.724672, 3.9419744)
shape.curveTo(28.34788, 6.6203814, 31.184608, 11.567745, 31.160713, 16.910715)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.1638380289077759f, 0.0f, 0.0f, 1.1638380289077759f, 4.824800968170166f, 2.7775559425354004f))
// _0_0_4
shape = GeneralPath()
shape.moveTo(31.160713, 16.910715)
shape.curveTo(31.184608, 22.253685, 28.34788, 27.20105, 23.724672, 29.879456)
shape.curveTo(19.101465, 32.55786, 13.398534, 32.55786, 8.775327, 29.879456)
shape.curveTo(4.15212, 27.20105, 1.3153913, 22.253685, 1.3392859, 16.910715)
shape.curveTo(1.3153913, 11.567745, 4.15212, 6.6203814, 8.775327, 3.9419744)
shape.curveTo(13.398534, 1.2635677, 19.101465, 1.2635677, 23.724672, 3.9419744)
shape.curveTo(28.34788, 6.6203814, 31.184608, 11.567745, 31.160713, 16.910715)
shape.closePath()
paint = RadialGradientPaint(Point2D.Double(11.901995658874512, 10.045443534851074), 29.292715f, Point2D.Double(11.901995658874512, 10.045443534851074), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 253, 255),Color(203, 203, 201, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(6.3422160148620605, 7.789332389831543), Point2D.Double(22.21842384338379, 25.884273529052734), floatArrayOf(0.0f,1.0f), arrayOf(Color(160, 160, 160, 255),Color(255, 255, 255, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.711396f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(31.160713, 16.910715)
shape.curveTo(31.184608, 22.253685, 28.34788, 27.20105, 23.724672, 29.879456)
shape.curveTo(19.101465, 32.55786, 13.398534, 32.55786, 8.775327, 29.879456)
shape.curveTo(4.15212, 27.20105, 1.3153913, 22.253685, 1.3392859, 16.910715)
shape.curveTo(1.3153913, 11.567745, 4.15212, 6.6203814, 8.775327, 3.9419744)
shape.curveTo(13.398534, 1.2635677, 19.101465, 1.2635677, 23.724672, 3.9419744)
shape.curveTo(28.34788, 6.6203814, 31.184608, 11.567745, 31.160713, 16.910715)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.7699509859085083f, 0.0f, 0.0f, 1.7699509859085083f, -17.024240493774414f, 1.6107410192489624f))
// _0_0_5
shape = GeneralPath()
shape.moveTo(16.679382, 6.638714)
shape.curveTo(18.281221, 4.5904484, 20.732477, 3.3880484, 23.332691, 3.3751054)
shape.lineTo(23.375, 11.875)
shape.closePath()
paint = RadialGradientPaint(Point2D.Double(23.375, 10.97286319732666), 3.3478093f, Point2D.Double(23.375, 10.97286319732666), floatArrayOf(0.0f,1.0f), arrayOf(Color(196, 160, 0, 255),Color(196, 160, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(3.630419969558716f, 1.654030035223679E-15f, -1.6087429951822541E-15f, 3.742065906524658f, -61.48606872558594f, -29.186180114746094f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(19.6673641204834, 4.257066249847412), Point2D.Double(20.329933166503906, 5.284587383270264), floatArrayOf(0.0f,1.0f), arrayOf(Color(196, 160, 0, 255),Color(196, 160, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.56498736f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(16.679382, 6.638714)
shape.curveTo(18.281221, 4.5904484, 20.732477, 3.3880484, 23.332691, 3.3751054)
shape.lineTo(23.375, 11.875)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(2.0732951164245605f, 0.0f, 0.0f, 2.0732951164245605f, -7.3102240562438965f, -13.136819839477539f))
// _0_0_6
shape = GeneralPath()
shape.moveTo(16.40625, 17.28125)
shape.curveTo(16.408203, 17.717966, 16.176338, 18.122347, 15.798454, 18.34127)
shape.curveTo(15.420569, 18.560194, 14.954431, 18.560194, 14.576546, 18.34127)
shape.curveTo(14.198661, 18.122347, 13.966797, 17.717966, 13.96875, 17.28125)
shape.curveTo(13.966797, 16.844534, 14.198661, 16.440153, 14.576546, 16.22123)
shape.curveTo(14.954431, 16.002306, 15.420569, 16.002306, 15.798454, 16.22123)
shape.curveTo(16.176338, 16.440153, 16.408203, 16.844534, 16.40625, 17.28125)
shape.closePath()
paint = Color(243, 243, 243, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(0.48232403f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(16.40625, 17.28125)
shape.curveTo(16.408203, 17.717966, 16.176338, 18.122347, 15.798454, 18.34127)
shape.curveTo(15.420569, 18.560194, 14.954431, 18.560194, 14.576546, 18.34127)
shape.curveTo(14.198661, 18.122347, 13.966797, 17.717966, 13.96875, 17.28125)
shape.curveTo(13.966797, 16.844534, 14.198661, 16.440153, 14.576546, 16.22123)
shape.curveTo(14.954431, 16.002306, 15.420569, 16.002306, 15.798454, 16.22123)
shape.curveTo(16.176338, 16.440153, 16.408203, 16.844534, 16.40625, 17.28125)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(22.176615, 20.718014)
shape.lineTo(13.155702, 13.140282)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(2.0f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(19.408613, 29.776506)
shape.lineTo(22.368654, 25.283228)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -22.300729751586914f, -12.409390449523926f))
// _0_0_9
shape = GeneralPath()
shape.moveTo(17.324118, 7.6932044)
shape.curveTo(17.32511, 7.914911, 17.2074, 8.120201, 17.01556, 8.231341)
shape.curveTo(16.823719, 8.342482, 16.587078, 8.342482, 16.395237, 8.231341)
shape.curveTo(16.203398, 8.120201, 16.085688, 7.914911, 16.08668, 7.6932044)
shape.curveTo(16.085688, 7.471498, 16.203398, 7.2662077, 16.395237, 7.1550674)
shape.curveTo(16.587078, 7.043927, 16.823719, 7.043927, 17.01556, 7.1550674)
shape.curveTo(17.2074, 7.2662077, 17.32511, 7.471498, 17.324118, 7.6932044)
shape.closePath()
paint = Color(182, 185, 177, 255)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -22.300729751586914f, 14.809220314025879f))
// _0_0_10
shape = GeneralPath()
shape.moveTo(17.324118, 7.6932044)
shape.curveTo(17.32511, 7.914911, 17.2074, 8.120201, 17.01556, 8.231341)
shape.curveTo(16.823719, 8.342482, 16.587078, 8.342482, 16.395237, 8.231341)
shape.curveTo(16.203398, 8.120201, 16.085688, 7.914911, 16.08668, 7.6932044)
shape.curveTo(16.085688, 7.471498, 16.203398, 7.2662077, 16.395237, 7.1550674)
shape.curveTo(16.587078, 7.043927, 16.823719, 7.043927, 17.01556, 7.1550674)
shape.curveTo(17.2074, 7.2662077, 17.32511, 7.471498, 17.324118, 7.6932044)
shape.closePath()
paint = Color(182, 185, 177, 255)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -35.91004180908203f, 1.1998900175094604f))
// _0_0_11
shape = GeneralPath()
shape.moveTo(17.324118, 7.6932044)
shape.curveTo(17.32511, 7.914911, 17.2074, 8.120201, 17.01556, 8.231341)
shape.curveTo(16.823719, 8.342482, 16.587078, 8.342482, 16.395237, 8.231341)
shape.curveTo(16.203398, 8.120201, 16.085688, 7.914911, 16.08668, 7.6932044)
shape.curveTo(16.085688, 7.471498, 16.203398, 7.2662077, 16.395237, 7.1550674)
shape.curveTo(16.587078, 7.043927, 16.823719, 7.043927, 17.01556, 7.1550674)
shape.curveTo(17.2074, 7.2662077, 17.32511, 7.471498, 17.324118, 7.6932044)
shape.closePath()
paint = Color(182, 185, 177, 255)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -8.691448211669922f, 1.1998900175094604f))
// _0_0_12
shape = GeneralPath()
shape.moveTo(17.324118, 7.6932044)
shape.curveTo(17.32511, 7.914911, 17.2074, 8.120201, 17.01556, 8.231341)
shape.curveTo(16.823719, 8.342482, 16.587078, 8.342482, 16.395237, 8.231341)
shape.curveTo(16.203398, 8.120201, 16.085688, 7.914911, 16.08668, 7.6932044)
shape.curveTo(16.085688, 7.471498, 16.203398, 7.2662077, 16.395237, 7.1550674)
shape.curveTo(16.587078, 7.043927, 16.823719, 7.043927, 17.01556, 7.1550674)
shape.curveTo(17.2074, 7.2662077, 17.32511, 7.471498, 17.324118, 7.6932044)
shape.closePath()
paint = Color(182, 185, 177, 255)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_12
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_13 = g.transform
g.transform(AffineTransform(1.3576539754867554f, 0.0f, 0.0f, 1.3576539754867554f, 1.7698960304260254f, -0.4937349855899811f))
// _0_0_13
paint = RadialGradientPaint(Point2D.Double(11.32919979095459, 10.583970069885254), 15.532059f, Point2D.Double(11.32919979095459, 10.583970069885254), floatArrayOf(0.0f,1.0f), arrayOf(Color(243, 244, 255, 255),Color(145, 147, 175, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.7365651f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(31.160713, 16.910715)
shape.curveTo(31.184608, 22.253685, 28.34788, 27.20105, 23.724672, 29.879456)
shape.curveTo(19.101465, 32.55786, 13.398534, 32.55786, 8.775327, 29.879456)
shape.curveTo(4.15212, 27.20105, 1.3153913, 22.253685, 1.3392859, 16.910715)
shape.curveTo(1.3153913, 11.567745, 4.15212, 6.6203814, 8.775327, 3.9419744)
shape.curveTo(13.398534, 1.2635677, 19.101465, 1.2635677, 23.724672, 3.9419744)
shape.curveTo(28.34788, 6.6203814, 31.184608, 11.567745, 31.160713, 16.910715)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_13
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14 = g.transform
g.transform(AffineTransform(0.6111270189285278f, 0.0f, 0.0f, 0.6111270189285278f, 5.5440521240234375f, -66.92817687988281f))
// _0_0_14
shape = GeneralPath()
shape.moveTo(69.375, 125.0)
shape.curveTo(69.39803, 130.151, 66.66322, 134.92062, 62.206123, 137.50279)
shape.curveTo(57.74902, 140.08498, 52.25098, 140.08498, 47.793877, 137.50279)
shape.curveTo(43.336773, 134.92062, 40.601963, 130.151, 40.625, 125.0)
shape.curveTo(40.601963, 119.84899, 43.336773, 115.07938, 47.793877, 112.4972)
shape.curveTo(52.25098, 109.91502, 57.74902, 109.91502, 62.206123, 112.4972)
shape.curveTo(66.66322, 115.07938, 69.39803, 119.84899, 69.375, 125.0)
shape.closePath()
paint = RadialGradientPaint(Point2D.Double(55.0, 125.0), 14.375f, Point2D.Double(55.0, 125.0), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 245, 32, 227),Color(255, 243, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_14
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
            return 1.5248181819915771
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
            return 46.43024826049805
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
            return Appointment_new(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Appointment_new(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Appointment_new(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

