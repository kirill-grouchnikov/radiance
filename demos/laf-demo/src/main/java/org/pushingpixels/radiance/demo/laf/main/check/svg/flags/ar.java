package org.pushingpixels.radiance.demo.laf.main.check.svg.flags;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ar implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.lineTo(512.0f, 0.0f);
generalPath.lineTo(512.0f, 512.0f);
generalPath.lineTo(0.0f, 512.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(116, 172, 223, 255)) : new Color(116, 172, 223, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 170.67f);
generalPath.lineTo(512.0f, 170.67f);
generalPath.lineTo(512.0f, 341.34f);
generalPath.lineTo(0.0f, 341.34f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0240000486373901f, 0.0f, 0.0f, 1.0240000486373901f, -153.60000610351562f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9238795325112867f, 0.3826834323650898f, -0.3826834323650898f, 0.9238795325112867f, 126.11904508675775f, -134.04325607385758f));
// _0_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.7071067811865476f, 0.7071067811865475f, -0.7071067811865475f, 0.7071067811865476f, 293.9339828220178f, -209.61940777125585f));
// _0_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.38268343236508984f, 0.9238795325112867f, -0.9238795325112867f, 0.38268343236508984f, 477.89651018178574f, -215.22267109578718f));
// _0_2_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9238795325112867f, 0.3826834323650898f, -0.3826834323650898f, 0.9238795325112867f, 126.11904508675775f, -134.04325607385758f));
// _0_2_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.7071067811865476f, 0.7071067811865475f, -0.7071067811865475f, 0.7071067811865476f, 293.9339828220178f, -209.61940777125585f));
// _0_2_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.38268343236508984f, 0.9238795325112867f, -0.9238795325112867f, 0.38268343236508984f, 477.89651018178574f, -215.22267109578718f));
// _0_2_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_7_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.0f, 1.0f, -1.0f, 0.0f, 512.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0240000486373901f, 0.0f, 0.0f, 1.0240000486373901f, -153.60000610351562f, 0.0f));
// _0_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9238795325112867f, 0.3826834323650898f, -0.3826834323650898f, 0.9238795325112867f, 126.11904508675775f, -134.04325607385758f));
// _0_3_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.7071067811865476f, 0.7071067811865475f, -0.7071067811865475f, 0.7071067811865476f, 293.9339828220178f, -209.61940777125585f));
// _0_3_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.38268343236508984f, 0.9238795325112867f, -0.9238795325112867f, 0.38268343236508984f, 477.89651018178574f, -215.22267109578718f));
// _0_3_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9238795325112867f, 0.3826834323650898f, -0.3826834323650898f, 0.9238795325112867f, 126.11904508675775f, -134.04325607385758f));
// _0_3_0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.7071067811865476f, 0.7071067811865475f, -0.7071067811865475f, 0.7071067811865476f, 293.9339828220178f, -209.61940777125585f));
// _0_3_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.38268343236508984f, 0.9238795325112867f, -0.9238795325112867f, 0.38268343236508984f, 477.89651018178574f, -215.22267109578718f));
// _0_3_0_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0_7_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 512.0f, 512.0f));
// _0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0240000486373901f, 0.0f, 0.0f, 1.0240000486373901f, -153.60000610351562f, 0.0f));
// _0_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9238795325112867f, 0.3826834323650898f, -0.3826834323650898f, 0.9238795325112867f, 126.11904508675775f, -134.04325607385758f));
// _0_4_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.7071067811865476f, 0.7071067811865475f, -0.7071067811865475f, 0.7071067811865476f, 293.9339828220178f, -209.61940777125585f));
// _0_4_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.38268343236508984f, 0.9238795325112867f, -0.9238795325112867f, 0.38268343236508984f, 477.89651018178574f, -215.22267109578718f));
// _0_4_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9238795325112867f, 0.3826834323650898f, -0.3826834323650898f, 0.9238795325112867f, 126.11904508675775f, -134.04325607385758f));
// _0_4_0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.7071067811865476f, 0.7071067811865475f, -0.7071067811865475f, 0.7071067811865476f, 293.9339828220178f, -209.61940777125585f));
// _0_4_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.38268343236508984f, 0.9238795325112867f, -0.9238795325112867f, 0.38268343236508984f, 477.89651018178574f, -215.22267109578718f));
// _0_4_0_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_7_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 512.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0240000486373901f, 0.0f, 0.0f, 1.0240000486373901f, -153.60000610351562f, 0.0f));
// _0_5_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint1(Graphics2D g,float origAlpha) {
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9238795325112867f, 0.3826834323650898f, -0.3826834323650898f, 0.9238795325112867f, 126.11904508675775f, -134.04325607385758f));
// _0_5_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.7071067811865476f, 0.7071067811865475f, -0.7071067811865475f, 0.7071067811865476f, 293.9339828220178f, -209.61940777125585f));
// _0_5_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.38268343236508984f, 0.9238795325112867f, -0.9238795325112867f, 0.38268343236508984f, 477.89651018178574f, -215.22267109578718f));
// _0_5_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.112f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(396.84f, 251.31f);
generalPath.lineTo(425.294f, 313.302f);
generalPath.curveTo(425.294f, 313.302f, 425.784f, 314.487f, 426.574f, 314.161f);
generalPath.curveTo(427.364f, 313.834f, 426.87302f, 312.64902f, 426.87302f, 312.64902f);
generalPath.lineTo(403.15802f, 248.69302f);
generalPath.moveTo(402.47803f, 272.81302f);
generalPath.curveTo(402.13104f, 282.24103f, 407.93002f, 287.42603f, 407.17203f, 295.84503f);
generalPath.curveTo(406.41504f, 304.26505f, 411.03903f, 309.02502f, 412.11203f, 312.29904f);
generalPath.curveTo(413.18503f, 315.57303f, 410.95203f, 317.53104f, 411.91403f, 317.99704f);
generalPath.curveTo(412.87704f, 318.46304f, 414.98404f, 315.87704f, 414.29703f, 311.22205f);
generalPath.curveTo(413.61002f, 306.56705f, 410.07703f, 305.18506f, 410.907f, 294.90204f);
generalPath.curveTo(411.737f, 284.61905f, 406.70102f, 282.22403f, 407.927f, 272.84402f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9238795325112867f, 0.3826834323650898f, -0.3826834323650898f, 0.9238795325112867f, 126.11904508675775f, -134.04325607385758f));
// _0_5_0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.7071067811865476f, 0.7071067811865475f, -0.7071067811865475f, 0.7071067811865476f, 293.9339828220178f, -209.61940777125585f));
// _0_5_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.38268343236508984f, 0.9238795325112867f, -0.9238795325112867f, 0.38268343236508984f, 477.89651018178574f, -215.22267109578718f));
// _0_5_0_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0_7_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(404.31f, 274.41f);
generalPath.curveTo(404.763f, 283.464f, 409.897f, 287.473f, 408.889f, 295.724f);
generalPath.curveTo(411.10202f, 289.199f, 405.765f, 284.141f, 406.069f, 274.504f);
generalPath.moveTo(398.42f, 250.747f);
generalPath.lineTo(417.907f, 293.324f);
generalPath.lineTo(401.578f, 249.43701f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new Ellipse2D.Double(227.55499267578125, 227.55499267578125, 56.88999938964844, 56.88999938964844);
paint = (colorFilter != null) ? colorFilter.filter(new Color(246, 180, 14, 255)) : new Color(246, 180, 14, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
stroke = new BasicStroke(1.536f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(227.55499267578125, 227.55499267578125, 56.88999938964844, 56.88999938964844);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(265.697f, 249.917f);
generalPath.curveTo(263.755f, 249.917f, 261.895f, 250.759f, 260.801f, 252.509f);
generalPath.curveTo(262.98898f, 254.479f, 267.822f, 254.692f, 271.10498f, 252.285f);
generalPath.curveTo(269.68298f, 250.755f, 267.63898f, 249.917f, 265.697f, 249.917f);
generalPath.closePath();
generalPath.moveTo(265.66498f, 250.365f);
generalPath.curveTo(267.555f, 250.33101f, 269.32297f, 251.199f, 269.56897f, 252.061f);
generalPath.curveTo(267.38098f, 254.468f, 263.88498f, 254.259f, 261.69696f, 252.509f);
generalPath.curveTo(262.65497f, 250.978f, 264.19495f, 250.392f, 265.66495f, 250.365f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(132, 53, 17, 255)) : new Color(132, 53, 17, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 512.2559814453125f, 0.0f));
// _0_8
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(246.19f, 248.566f);
generalPath.curveTo(249.033f, 248.566f, 249.69f, 249.22299f, 251.004f, 250.316f);
generalPath.curveTo(252.318f, 251.411f, 252.974f, 251.191f, 253.192f, 251.411f);
generalPath.curveTo(253.409f, 251.631f, 253.192f, 252.28499f, 252.755f, 252.066f);
generalPath.curveTo(252.31801f, 251.846f, 251.44101f, 251.411f, 250.13f, 250.316f);
generalPath.curveTo(248.81601f, 249.221f, 247.505f, 249.222f, 246.19101f, 249.222f);
generalPath.curveTo(242.253f, 249.222f, 240.065f, 252.504f, 239.628f, 252.285f);
generalPath.curveTo(239.19101f, 252.065f, 241.81601f, 248.565f, 246.19101f, 248.565f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 512.2559814453125f, 0.0f));
// _0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(238.316f, 249.876f);
generalPath.curveTo(243.34799f, 245.501f, 249.692f, 244.84401f, 253.194f, 248.126f);
generalPath.curveTo(254.051f, 249.274f, 254.6f, 250.50201f, 254.826f, 251.78201f);
generalPath.curveTo(255.266f, 254.27402f, 254.488f, 256.96503f, 252.53601f, 259.724f);
generalPath.curveTo(252.75601f, 259.724f, 253.19402f, 259.942f, 253.41301f, 260.161f);
generalPath.curveTo(255.15001f, 256.83902f, 255.76501f, 253.42702f, 255.195f, 250.18102f);
generalPath.curveTo(255.04292f, 249.33081f, 254.8133f, 248.49634f, 254.509f, 247.68802f);
generalPath.curveTo(249.695f, 243.75002f, 243.132f, 243.31201f, 238.319f, 249.87701f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 19.315000534057617f, 0.0f));
// _0_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10_0
shape = new Ellipse2D.Double(244.34400939941406, 250.08900451660156, 3.937999963760376, 3.937999963760376);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 512.2559814453125f, 0.0f));
// _0_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_11_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(240.937f, 253.379f);
generalPath.curveTo(244.657f, 256.224f, 248.377f, 256.005f, 250.564f, 254.691f);
generalPath.curveTo(252.752f, 253.379f, 252.752f, 252.941f, 252.315f, 252.941f);
generalPath.curveTo(251.879f, 252.941f, 251.442f, 253.379f, 249.69101f, 254.25299f);
generalPath.curveTo(247.93901f, 255.12999f, 245.315f, 255.12999f, 240.93901f, 253.379f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(251.648f, 259.932f);
generalPath.curveTo(250.713f, 260.10202f, 250.04799f, 260.932f, 250.04799f, 261.884f);
generalPath.curveTo(250.04799f, 262.971f, 250.94699f, 263.836f, 252.03198f, 263.836f);
generalPath.curveTo(252.67398f, 263.836f, 253.26299f, 263.532f, 253.63199f, 263.004f);
generalPath.curveTo(254.38899f, 263.574f, 255.439f, 263.634f, 255.99998f, 263.644f);
generalPath.curveTo(256.086f, 263.64603f, 256.198f, 263.644f, 256.25598f, 263.644f);
generalPath.curveTo(256.817f, 263.634f, 257.86597f, 263.574f, 258.624f, 263.004f);
generalPath.curveTo(258.99298f, 263.532f, 259.582f, 263.836f, 260.224f, 263.836f);
generalPath.curveTo(261.309f, 263.836f, 262.208f, 262.971f, 262.208f, 261.884f);
generalPath.curveTo(262.208f, 260.933f, 261.543f, 260.103f, 260.608f, 259.932f);
generalPath.curveTo(261.133f, 260.117f, 261.47202f, 260.625f, 261.47202f, 261.18f);
generalPath.curveTo(261.47256f, 261.52814f, 261.3345f, 261.86215f, 261.08832f, 262.1083f);
generalPath.curveTo(260.84216f, 262.3545f, 260.50815f, 262.49255f, 260.16f, 262.492f);
generalPath.curveTo(259.46188f, 262.48734f, 258.88757f, 261.941f, 258.848f, 261.24402f);
generalPath.curveTo(258.634f, 261.67f, 257.789f, 262.93903f, 256.128f, 263.00403f);
generalPath.curveTo(254.467f, 262.93903f, 253.622f, 261.67102f, 253.40799f, 261.24402f);
generalPath.curveTo(253.36842f, 261.941f, 252.7941f, 262.48734f, 252.096f, 262.492f);
generalPath.curveTo(251.74786f, 262.49252f, 251.41385f, 262.35446f, 251.16768f, 262.1083f);
generalPath.curveTo(250.92152f, 261.86215f, 250.78346f, 261.5281f, 250.784f, 261.18f);
generalPath.curveTo(250.784f, 260.625f, 251.123f, 260.117f, 251.648f, 259.932f);
generalPath.closePath();
generalPath.moveTo(253.788f, 265.759f);
generalPath.curveTo(251.59799f, 265.759f, 250.734f, 267.742f, 248.76399f, 269.055f);
generalPath.curveTo(249.859f, 268.61798f, 250.71999f, 267.755f, 252.252f, 266.879f);
generalPath.curveTo(253.784f, 266.004f, 255.09f, 267.07098f, 255.964f, 267.07098f);
generalPath.lineTo(255.996f, 267.07098f);
generalPath.curveTo(256.87f, 267.07098f, 258.176f, 266.004f, 259.708f, 266.879f);
generalPath.curveTo(261.241f, 267.755f, 262.134f, 268.619f, 263.228f, 269.055f);
generalPath.curveTo(261.258f, 267.742f, 260.361f, 265.759f, 258.172f, 265.759f);
generalPath.curveTo(257.735f, 265.759f, 256.87f, 265.995f, 255.996f, 266.431f);
generalPath.lineTo(255.964f, 266.431f);
generalPath.curveTo(255.09001f, 265.994f, 254.225f, 265.759f, 253.78801f, 265.759f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(253.05f, 268.35f);
generalPath.curveTo(252.187f, 268.388f, 251.044f, 268.561f, 249.403f, 269.053f);
generalPath.curveTo(253.343f, 268.17902f, 254.212f, 269.501f, 255.963f, 269.501f);
generalPath.lineTo(255.995f, 269.501f);
generalPath.curveTo(257.745f, 269.501f, 258.615f, 268.178f, 262.555f, 269.053f);
generalPath.curveTo(258.17798f, 267.741f, 257.307f, 268.605f, 255.995f, 268.605f);
generalPath.lineTo(255.963f, 268.605f);
generalPath.curveTo(255.14299f, 268.605f, 254.491f, 268.285f, 253.051f, 268.349f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(249.6f, 269.025f);
generalPath.curveTo(249.34601f, 269.02798f, 249.069f, 269.03f, 248.768f, 269.057f);
generalPath.curveTo(253.364f, 269.495f, 251.155f, 272.129f, 255.968f, 272.129f);
generalPath.lineTo(256.0f, 272.129f);
generalPath.curveTo(260.813f, 272.129f, 258.636f, 269.495f, 263.232f, 269.057f);
generalPath.curveTo(258.418f, 268.62f, 259.94f, 271.457f, 256.0f, 271.457f);
generalPath.lineTo(255.968f, 271.457f);
generalPath.curveTo(252.274f, 271.457f, 253.412f, 268.977f, 249.6f, 269.025f);
generalPath.closePath();
generalPath.moveTo(259.942f, 276.132f);
generalPath.curveTo(259.94144f, 273.95715f, 258.17883f, 272.1941f, 256.004f, 272.193f);
generalPath.curveTo(253.82878f, 272.19354f, 252.06555f, 273.95676f, 252.065f, 276.132f);
generalPath.curveTo(252.49928f, 274.3079f, 254.1289f, 273.0204f, 256.004f, 273.02f);
generalPath.curveTo(257.8791f, 273.01978f, 259.50876f, 274.30762f, 259.942f, 276.132f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(238.316f, 249.876f);
generalPath.curveTo(243.34799f, 245.501f, 249.692f, 244.84401f, 253.194f, 248.126f);
generalPath.curveTo(254.051f, 249.274f, 254.6f, 250.50201f, 254.826f, 251.78201f);
generalPath.curveTo(255.266f, 254.27402f, 254.488f, 256.96503f, 252.53601f, 259.724f);
generalPath.curveTo(252.75601f, 259.724f, 253.19402f, 259.942f, 253.41301f, 260.161f);
generalPath.curveTo(255.15001f, 256.83902f, 255.76501f, 253.42702f, 255.195f, 250.18102f);
generalPath.curveTo(255.04292f, 249.33081f, 254.8133f, 248.49634f, 254.509f, 247.68802f);
generalPath.curveTo(249.695f, 243.75002f, 243.132f, 243.31201f, 238.319f, 249.87701f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(246.19f, 248.566f);
generalPath.curveTo(249.033f, 248.566f, 249.69f, 249.22299f, 251.004f, 250.316f);
generalPath.curveTo(252.318f, 251.411f, 252.974f, 251.191f, 253.192f, 251.411f);
generalPath.curveTo(253.409f, 251.631f, 253.192f, 252.28499f, 252.755f, 252.066f);
generalPath.curveTo(252.31801f, 251.846f, 251.44101f, 251.411f, 250.13f, 250.316f);
generalPath.curveTo(248.81601f, 249.221f, 247.505f, 249.222f, 246.19101f, 249.222f);
generalPath.curveTo(242.253f, 249.222f, 240.065f, 252.504f, 239.628f, 252.285f);
generalPath.curveTo(239.19101f, 252.065f, 241.81601f, 248.565f, 246.19101f, 248.565f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -19.641000747680664f, 0.0f));
// _0_17
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_17_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(265.697f, 249.917f);
generalPath.curveTo(263.755f, 249.917f, 261.895f, 250.759f, 260.801f, 252.509f);
generalPath.curveTo(262.98898f, 254.479f, 267.822f, 254.692f, 271.10498f, 252.285f);
generalPath.curveTo(269.68298f, 250.755f, 267.63898f, 249.917f, 265.697f, 249.917f);
generalPath.closePath();
generalPath.moveTo(265.66498f, 250.365f);
generalPath.curveTo(267.555f, 250.33101f, 269.32297f, 251.199f, 269.56897f, 252.061f);
generalPath.curveTo(267.38098f, 254.468f, 263.88498f, 254.259f, 261.69696f, 252.509f);
generalPath.curveTo(262.65497f, 250.978f, 264.19495f, 250.392f, 265.66495f, 250.365f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(132, 53, 17, 255)) : new Color(132, 53, 17, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_18
shape = new Ellipse2D.Double(244.34400939941406, 250.08900451660156, 3.937999963760376, 3.937999963760376);
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(240.937f, 253.379f);
generalPath.curveTo(244.657f, 256.224f, 248.377f, 256.005f, 250.564f, 254.691f);
generalPath.curveTo(252.752f, 253.379f, 252.752f, 252.941f, 252.315f, 252.941f);
generalPath.curveTo(251.879f, 252.941f, 251.442f, 253.379f, 249.69101f, 254.25299f);
generalPath.curveTo(247.93901f, 255.12999f, 245.315f, 255.12999f, 240.93901f, 253.379f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(133, 52, 10, 255)) : new Color(133, 52, 10, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());

}



    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    _paint0(g, origAlpha);
_paint1(g, origAlpha);


	    shape = null;
	    generalPath = null;
	    paint = null;
	    stroke = null;
	    clip = null;
        transformsStack.clear();
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 512.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 512.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ar() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public synchronized void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
    public boolean supportsColorFilter() {
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    @Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static RadianceIcon of(int width, int height) {
       ar base = new ar();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       ar base = new ar();
       base.width = width;
       base.height = height;
       return new RadianceIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ar::new;
    }
}

