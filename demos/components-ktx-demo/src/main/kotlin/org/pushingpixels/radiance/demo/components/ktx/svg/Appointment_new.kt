package org.pushingpixels.radiance.demo.components.ktx.svg

import java.awt.*
import java.awt.geom.*
import java.awt.image.BufferedImage
import java.io.*
import java.lang.ref.WeakReference
import java.util.Base64
import java.util.Stack
import javax.imageio.ImageIO
import javax.swing.plaf.UIResource

import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
class Appointment_new private constructor(private var width: Int, private var height: Int)
       : RadianceIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var colorFilter: RadianceIcon.ColorFilter? = null
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
g.transform(AffineTransform(2.5631580352783203f, 0.0f, 0.0f, 1.2196019887924194f, -55.98413848876953f, 14.0414400100708f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.774754f, 19.008621f)
generalPath!!.curveTo(39.788635f, 22.112505f, 38.140697f, 24.986568f, 35.454945f, 26.54253f)
generalPath!!.curveTo(32.769196f, 28.098494f, 29.4562f, 28.098494f, 26.770447f, 26.54253f)
generalPath!!.curveTo(24.084696f, 24.986568f, 22.436758f, 22.112505f, 22.45064f, 19.008621f)
generalPath!!.curveTo(22.436758f, 15.904738f, 24.084696f, 13.030674f, 26.770447f, 11.474711f)
generalPath!!.curveTo(29.4562f, 9.918749f, 32.769196f, 9.918749f, 35.454945f, 11.474711f)
generalPath!!.curveTo(38.140697f, 13.030674f, 39.788635f, 15.904738f, 39.774754f, 19.008621f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(31.11269760131836, 19.008621215820312), 8.662058f, Point2D.Double(31.11269760131836, 19.008621215820312), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
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
generalPath!!.moveTo(18.587591f, 1.403729f)
generalPath!!.lineTo(4.226755f, 18.096664f)
generalPath!!.lineTo(5.4854717f, 19.339844f)
generalPath!!.lineTo(18.587591f, 1.403729f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.915647506713867, 37.197017669677734), Point2D.Double(9.885503768920898, 52.09067916870117), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(154, 162, 154, 255)) ?: Color(154, 162, 154, 255)),(colorFilter?.filter(Color(181, 190, 181, 255)) ?: Color(181, 190, 181, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(3.1238410472869873f, 0.0f, 0.0f, 0.9696909785270691f, -31.88758087158203f, -19.594919204711914f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.467176f, 1.3138036f)
generalPath!!.lineTo(5.6605716f, 19.072613f)
generalPath!!.lineTo(7.4900985f, 20.687914f)
generalPath!!.lineTo(18.467176f, 1.3138036f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.4315290451049805f, 0.0f, 0.0f, 1.4315290451049805f, 0.5694590210914612f, -1.6546180248260498f))
// _0_0_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.160713f, 16.910715f)
generalPath!!.curveTo(31.184608f, 22.253685f, 28.34788f, 27.20105f, 23.724672f, 29.879456f)
generalPath!!.curveTo(19.101465f, 32.55786f, 13.398534f, 32.55786f, 8.775327f, 29.879456f)
generalPath!!.curveTo(4.15212f, 27.20105f, 1.3153913f, 22.253685f, 1.3392859f, 16.910715f)
generalPath!!.curveTo(1.3153913f, 11.567745f, 4.15212f, 6.6203814f, 8.775327f, 3.9419744f)
generalPath!!.curveTo(13.398534f, 1.2635677f, 19.101465f, 1.2635677f, 23.724672f, 3.9419744f)
generalPath!!.curveTo(28.34788f, 6.6203814f, 31.184608f, 11.567745f, 31.160713f, 16.910715f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(8.746825218200684, 6.8283233642578125), 29.889715f, Point2D.Double(8.746825218200684, 6.8283233642578125), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(148, 151, 179, 255)) ?: Color(148, 151, 179, 255)),(colorFilter?.filter(Color(76, 64, 89, 255)) ?: Color(76, 64, 89, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(96, 87, 115, 255)) ?: Color(96, 87, 115, 255)
stroke = BasicStroke(0.69855404f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.160713f, 16.910715f)
generalPath!!.curveTo(31.184608f, 22.253685f, 28.34788f, 27.20105f, 23.724672f, 29.879456f)
generalPath!!.curveTo(19.101465f, 32.55786f, 13.398534f, 32.55786f, 8.775327f, 29.879456f)
generalPath!!.curveTo(4.15212f, 27.20105f, 1.3153913f, 22.253685f, 1.3392859f, 16.910715f)
generalPath!!.curveTo(1.3153913f, 11.567745f, 4.15212f, 6.6203814f, 8.775327f, 3.9419744f)
generalPath!!.curveTo(13.398534f, 1.2635677f, 19.101465f, 1.2635677f, 23.724672f, 3.9419744f)
generalPath!!.curveTo(28.34788f, 6.6203814f, 31.184608f, 11.567745f, 31.160713f, 16.910715f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.1638380289077759f, 0.0f, 0.0f, 1.1638380289077759f, 4.824800968170166f, 2.7775559425354004f))
// _0_0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.160713f, 16.910715f)
generalPath!!.curveTo(31.184608f, 22.253685f, 28.34788f, 27.20105f, 23.724672f, 29.879456f)
generalPath!!.curveTo(19.101465f, 32.55786f, 13.398534f, 32.55786f, 8.775327f, 29.879456f)
generalPath!!.curveTo(4.15212f, 27.20105f, 1.3153913f, 22.253685f, 1.3392859f, 16.910715f)
generalPath!!.curveTo(1.3153913f, 11.567745f, 4.15212f, 6.6203814f, 8.775327f, 3.9419744f)
generalPath!!.curveTo(13.398534f, 1.2635677f, 19.101465f, 1.2635677f, 23.724672f, 3.9419744f)
generalPath!!.curveTo(28.34788f, 6.6203814f, 31.184608f, 11.567745f, 31.160713f, 16.910715f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(11.901995658874512, 10.045443534851074), 29.292715f, Point2D.Double(11.901995658874512, 10.045443534851074), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 253, 255)) ?: Color(255, 255, 253, 255)),(colorFilter?.filter(Color(203, 203, 201, 255)) ?: Color(203, 203, 201, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(6.3422160148620605, 7.789332389831543), Point2D.Double(22.21842384338379, 25.884273529052734), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(160, 160, 160, 255)) ?: Color(160, 160, 160, 255)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.711396f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.160713f, 16.910715f)
generalPath!!.curveTo(31.184608f, 22.253685f, 28.34788f, 27.20105f, 23.724672f, 29.879456f)
generalPath!!.curveTo(19.101465f, 32.55786f, 13.398534f, 32.55786f, 8.775327f, 29.879456f)
generalPath!!.curveTo(4.15212f, 27.20105f, 1.3153913f, 22.253685f, 1.3392859f, 16.910715f)
generalPath!!.curveTo(1.3153913f, 11.567745f, 4.15212f, 6.6203814f, 8.775327f, 3.9419744f)
generalPath!!.curveTo(13.398534f, 1.2635677f, 19.101465f, 1.2635677f, 23.724672f, 3.9419744f)
generalPath!!.curveTo(28.34788f, 6.6203814f, 31.184608f, 11.567745f, 31.160713f, 16.910715f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.7699509859085083f, 0.0f, 0.0f, 1.7699509859085083f, -17.024240493774414f, 1.6107410192489624f))
// _0_0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.679382f, 6.638714f)
generalPath!!.curveTo(18.281221f, 4.5904484f, 20.732477f, 3.3880484f, 23.332691f, 3.3751054f)
generalPath!!.lineTo(23.375f, 11.875f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(23.375, 10.97286319732666), 3.3478093f, Point2D.Double(23.375, 10.97286319732666), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(196, 160, 0, 255)) ?: Color(196, 160, 0, 255)),(colorFilter?.filter(Color(196, 160, 0, 0)) ?: Color(196, 160, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(3.630419969558716f, 1.654030035223679E-15f, -1.6087429951822541E-15f, 3.742065906524658f, -61.48606872558594f, -29.186180114746094f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(19.6673641204834, 4.257066249847412), Point2D.Double(20.329933166503906, 5.284587383270264), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(196, 160, 0, 255)) ?: Color(196, 160, 0, 255)),(colorFilter?.filter(Color(196, 160, 0, 0)) ?: Color(196, 160, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.56498736f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.679382f, 6.638714f)
generalPath!!.curveTo(18.281221f, 4.5904484f, 20.732477f, 3.3880484f, 23.332691f, 3.3751054f)
generalPath!!.lineTo(23.375f, 11.875f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(2.0732951164245605f, 0.0f, 0.0f, 2.0732951164245605f, -7.3102240562438965f, -13.136819839477539f))
// _0_0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.40625f, 17.28125f)
generalPath!!.curveTo(16.408203f, 17.717966f, 16.176338f, 18.122347f, 15.798454f, 18.34127f)
generalPath!!.curveTo(15.420569f, 18.560194f, 14.954431f, 18.560194f, 14.576546f, 18.34127f)
generalPath!!.curveTo(14.198661f, 18.122347f, 13.966797f, 17.717966f, 13.96875f, 17.28125f)
generalPath!!.curveTo(13.966797f, 16.844534f, 14.198661f, 16.440153f, 14.576546f, 16.22123f)
generalPath!!.curveTo(14.954431f, 16.002306f, 15.420569f, 16.002306f, 15.798454f, 16.22123f)
generalPath!!.curveTo(16.176338f, 16.440153f, 16.408203f, 16.844534f, 16.40625f, 17.28125f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(243, 243, 243, 255)) ?: Color(243, 243, 243, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(0.48232403f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.40625f, 17.28125f)
generalPath!!.curveTo(16.408203f, 17.717966f, 16.176338f, 18.122347f, 15.798454f, 18.34127f)
generalPath!!.curveTo(15.420569f, 18.560194f, 14.954431f, 18.560194f, 14.576546f, 18.34127f)
generalPath!!.curveTo(14.198661f, 18.122347f, 13.966797f, 17.717966f, 13.96875f, 17.28125f)
generalPath!!.curveTo(13.966797f, 16.844534f, 14.198661f, 16.440153f, 14.576546f, 16.22123f)
generalPath!!.curveTo(14.954431f, 16.002306f, 15.420569f, 16.002306f, 15.798454f, 16.22123f)
generalPath!!.curveTo(16.176338f, 16.440153f, 16.408203f, 16.844534f, 16.40625f, 17.28125f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(22.176615f, 20.718014f)
generalPath!!.lineTo(13.155702f, 13.140282f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(2.0f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.408613f, 29.776506f)
generalPath!!.lineTo(22.368654f, 25.283228f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -22.300729751586914f, -12.409390449523926f))
// _0_0_9
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.324118f, 7.6932044f)
generalPath!!.curveTo(17.32511f, 7.914911f, 17.2074f, 8.120201f, 17.01556f, 8.231341f)
generalPath!!.curveTo(16.823719f, 8.342482f, 16.587078f, 8.342482f, 16.395237f, 8.231341f)
generalPath!!.curveTo(16.203398f, 8.120201f, 16.085688f, 7.914911f, 16.08668f, 7.6932044f)
generalPath!!.curveTo(16.085688f, 7.471498f, 16.203398f, 7.2662077f, 16.395237f, 7.1550674f)
generalPath!!.curveTo(16.587078f, 7.043927f, 16.823719f, 7.043927f, 17.01556f, 7.1550674f)
generalPath!!.curveTo(17.2074f, 7.2662077f, 17.32511f, 7.471498f, 17.324118f, 7.6932044f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(182, 185, 177, 255)) ?: Color(182, 185, 177, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -22.300729751586914f, 14.809220314025879f))
// _0_0_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.324118f, 7.6932044f)
generalPath!!.curveTo(17.32511f, 7.914911f, 17.2074f, 8.120201f, 17.01556f, 8.231341f)
generalPath!!.curveTo(16.823719f, 8.342482f, 16.587078f, 8.342482f, 16.395237f, 8.231341f)
generalPath!!.curveTo(16.203398f, 8.120201f, 16.085688f, 7.914911f, 16.08668f, 7.6932044f)
generalPath!!.curveTo(16.085688f, 7.471498f, 16.203398f, 7.2662077f, 16.395237f, 7.1550674f)
generalPath!!.curveTo(16.587078f, 7.043927f, 16.823719f, 7.043927f, 17.01556f, 7.1550674f)
generalPath!!.curveTo(17.2074f, 7.2662077f, 17.32511f, 7.471498f, 17.324118f, 7.6932044f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(182, 185, 177, 255)) ?: Color(182, 185, 177, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -35.91004180908203f, 1.1998900175094604f))
// _0_0_11
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.324118f, 7.6932044f)
generalPath!!.curveTo(17.32511f, 7.914911f, 17.2074f, 8.120201f, 17.01556f, 8.231341f)
generalPath!!.curveTo(16.823719f, 8.342482f, 16.587078f, 8.342482f, 16.395237f, 8.231341f)
generalPath!!.curveTo(16.203398f, 8.120201f, 16.085688f, 7.914911f, 16.08668f, 7.6932044f)
generalPath!!.curveTo(16.085688f, 7.471498f, 16.203398f, 7.2662077f, 16.395237f, 7.1550674f)
generalPath!!.curveTo(16.587078f, 7.043927f, 16.823719f, 7.043927f, 17.01556f, 7.1550674f)
generalPath!!.curveTo(17.2074f, 7.2662077f, 17.32511f, 7.471498f, 17.324118f, 7.6932044f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(182, 185, 177, 255)) ?: Color(182, 185, 177, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -8.691448211669922f, 1.1998900175094604f))
// _0_0_12
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.324118f, 7.6932044f)
generalPath!!.curveTo(17.32511f, 7.914911f, 17.2074f, 8.120201f, 17.01556f, 8.231341f)
generalPath!!.curveTo(16.823719f, 8.342482f, 16.587078f, 8.342482f, 16.395237f, 8.231341f)
generalPath!!.curveTo(16.203398f, 8.120201f, 16.085688f, 7.914911f, 16.08668f, 7.6932044f)
generalPath!!.curveTo(16.085688f, 7.471498f, 16.203398f, 7.2662077f, 16.395237f, 7.1550674f)
generalPath!!.curveTo(16.587078f, 7.043927f, 16.823719f, 7.043927f, 17.01556f, 7.1550674f)
generalPath!!.curveTo(17.2074f, 7.2662077f, 17.32511f, 7.471498f, 17.324118f, 7.6932044f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(182, 185, 177, 255)) ?: Color(182, 185, 177, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.3576539754867554f, 0.0f, 0.0f, 1.3576539754867554f, 1.7698960304260254f, -0.4937349855899811f))
// _0_0_13
paint = RadialGradientPaint(Point2D.Double(11.32919979095459, 10.583970069885254), 15.532059f, Point2D.Double(11.32919979095459, 10.583970069885254), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(243, 244, 255, 255)) ?: Color(243, 244, 255, 255)),(colorFilter?.filter(Color(145, 147, 175, 255)) ?: Color(145, 147, 175, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.7365651f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.160713f, 16.910715f)
generalPath!!.curveTo(31.184608f, 22.253685f, 28.34788f, 27.20105f, 23.724672f, 29.879456f)
generalPath!!.curveTo(19.101465f, 32.55786f, 13.398534f, 32.55786f, 8.775327f, 29.879456f)
generalPath!!.curveTo(4.15212f, 27.20105f, 1.3153913f, 22.253685f, 1.3392859f, 16.910715f)
generalPath!!.curveTo(1.3153913f, 11.567745f, 4.15212f, 6.6203814f, 8.775327f, 3.9419744f)
generalPath!!.curveTo(13.398534f, 1.2635677f, 19.101465f, 1.2635677f, 23.724672f, 3.9419744f)
generalPath!!.curveTo(28.34788f, 6.6203814f, 31.184608f, 11.567745f, 31.160713f, 16.910715f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.6111270189285278f, 0.0f, 0.0f, 0.6111270189285278f, 5.5440521240234375f, -66.92817687988281f))
// _0_0_14
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(69.375f, 125.0f)
generalPath!!.curveTo(69.39803f, 130.151f, 66.66322f, 134.92062f, 62.206123f, 137.50279f)
generalPath!!.curveTo(57.74902f, 140.08498f, 52.25098f, 140.08498f, 47.793877f, 137.50279f)
generalPath!!.curveTo(43.336773f, 134.92062f, 40.601963f, 130.151f, 40.625f, 125.0f)
generalPath!!.curveTo(40.601963f, 119.84899f, 43.336773f, 115.07938f, 47.793877f, 112.4972f)
generalPath!!.curveTo(52.25098f, 109.91502f, 57.74902f, 109.91502f, 62.206123f, 112.4972f)
generalPath!!.curveTo(66.66322f, 115.07938f, 69.39803f, 119.84899f, 69.375f, 125.0f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(55.0, 125.0), 14.375f, Point2D.Double(55.0, 125.0), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 245, 32, 227)) ?: Color(255, 245, 32, 227)),(colorFilter?.filter(Color(255, 243, 0, 0)) ?: Color(255, 243, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
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
        fun of(width: Int, height: Int): RadianceIcon {
            return Appointment_new(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Appointment_new(width, height))
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

    override @Synchronized fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override fun supportsColorFilter(): Boolean {
        return true
    }

    override fun setColorFilter(colorFilter: RadianceIcon.ColorFilter?) {
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

