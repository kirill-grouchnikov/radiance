/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.demo.flamingo.svg;

import org.apache.batik.anim.dom.SVGOMElement;
import org.apache.batik.dom.svg.SVGContext;
import org.apache.batik.ext.awt.LinearGradientPaint;
import org.apache.batik.ext.awt.MultipleGradientPaint;
import org.apache.batik.ext.awt.MultipleGradientPaint.ColorSpaceEnum;
import org.apache.batik.ext.awt.MultipleGradientPaint.CycleMethodEnum;
import org.apache.batik.ext.awt.RadialGradientPaint;
import org.apache.batik.ext.awt.geom.ExtendedGeneralPath;
import org.apache.batik.gvt.*;
import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.gvt.GVTTreeRendererAdapter;
import org.apache.batik.swing.gvt.GVTTreeRendererEvent;
import org.apache.batik.swing.svg.GVTTreeBuilderAdapter;
import org.apache.batik.swing.svg.GVTTreeBuilderEvent;
import org.apache.batik.swing.svg.SVGDocumentLoaderAdapter;
import org.apache.batik.swing.svg.SVGDocumentLoaderEvent;
import org.pushingpixels.photon.api.transcoder.SvgTranscoder;
import org.pushingpixels.photon.api.transcoder.TranscoderListener;
import org.pushingpixels.photon.api.transcoder.java.JavaLanguageRenderer;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Field;

public class SVGApplication {

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Batik");
        SVGApplication app = new SVGApplication(f);
        f.getContentPane().add(app.createComponents());

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setSize(400, 400);
        f.setVisible(true);
    }

    JFrame frame;

    JButton button = new JButton("Load...");

    JLabel label = new JLabel();

    JSVGCanvas svgCanvas = new JSVGCanvas();

    String lastDir;

    public SVGApplication(JFrame f) {
        frame = f;
    }

    public void traverse(Node node, String prefix) {
        System.err.print(prefix + " " + node.getLocalName() + " [" + node.getClass().getName() + "]");
        NamedNodeMap attrs = node.getAttributes();
        if (attrs != null) {
            for (int i = 0; i < attrs.getLength(); i++) {
                Node attr = attrs.item(i);
                System.err.print(" " + attr.getNodeName() + "=" + attr.getNodeValue());
            }
        }
        System.err.println();
        if ("animate".equals(node.getLocalName())) {
            if (node instanceof SVGOMElement) {
                SVGOMElement elt = (SVGOMElement) node;
                SVGContext ctx = elt.getSVGContext();
            }
        }
        for (Node n = node.getFirstChild(); n != null; n = n.getNextSibling()) {
            traverse(n, prefix + "   ");
        }
    }

    public JComponent createComponents() {
        final JPanel panel = new JPanel(new BorderLayout());

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(button);
        p.add(label);

        panel.add("North", p);
        panel.add("Center", svgCanvas);

        // Set the button action.
        button.addActionListener((ActionEvent e) -> {
            JFileChooser fc = new JFileChooser(lastDir);
            int choice = fc.showOpenDialog(panel);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                lastDir = f.getParent();
                try {
                    String svgClassName = f.getName().substring(0, f.getName().length() - 4);
                    svgClassName = svgClassName.replace('-', '_');
                    svgClassName = svgClassName.replace(' ', '_');

                    svgCanvas.setURI(f.toURI().toURL().toString());

                    String javaClassFilename = f.getParent() + File.separator + svgClassName
                            + ".java";

                    final PrintWriter pw = new PrintWriter(javaClassFilename);

                    SvgTranscoder transcoder = new SvgTranscoder(f.toURI().toURL().toString(),
                            svgClassName, new JavaLanguageRenderer());
                    transcoder.setListener(new TranscoderListener() {
                        public Writer getWriter() {
                            return pw;
                        }

                        public void finished() {
                            JOptionPane.showMessageDialog(null, "Finished");
                        }
                    });
                    Document svgDoc = transcoder.transcode(this.getClass().getResourceAsStream(
                            "/org/pushingpixels/photon/api/transcoder/java" +
                                    "/SvgTranscoderTemplateResizable.templ"));
                    traverse(svgDoc, "");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Set the JSVGCanvas listeners.
        svgCanvas.addSVGDocumentLoaderListener(new SVGDocumentLoaderAdapter() {
            @Override
            public void documentLoadingStarted(SVGDocumentLoaderEvent e) {
                label.setText("Document Loading...");
            }

            @Override
            public void documentLoadingCompleted(SVGDocumentLoaderEvent e) {
                label.setText("Document Loaded.");
            }
        });

        svgCanvas.addGVTTreeBuilderListener(new GVTTreeBuilderAdapter() {
            @Override
            public void gvtBuildStarted(GVTTreeBuilderEvent e) {
                label.setText("Build Started...");
            }

            // private void offset(int offset) {
            // for (int i = 0; i < offset; i++)
            // System.out.print(" ");
            // }
            //
            private void dumpShape(PrintWriter pw, ExtendedGeneralPath egPath, int offset) {
                float[] coords = new float[6];
                pw.println("shape = new GeneralPath();");
                for (PathIterator i = egPath.getPathIterator(null); !i.isDone(); i.next()) {
                    int type = i.currentSegment(coords);
                    switch (type) {
                        case PathIterator.SEG_CUBICTO:
                            // offset(offset + 1);
                            // pw.println("CUBICTO " + coords[0] + ":" + coords[1]
                            // + ":" + coords[2] + ":" + coords[3] + ":"
                            // + coords[4] + ":" + coords[5]);
                            pw.println("((GeneralPath)shape).curveTo(" + coords[0] + ", " + coords[1]
                                    + ", " + coords[2] + ", " + coords[3] + ", " + coords[4] + ", "
                                    + coords[5] + ");");
                            break;
                        case PathIterator.SEG_QUADTO:
                            // offset(offset + 1);
                            // pw.println("QUADTO " + coords[0] + ":" + coords[1]
                            // + ":" + coords[2] + ":" + coords[3]);
                            pw.println("((GeneralPath)shape).quadTo(" + coords[0] + ", " + coords[1]
                                    + ", " + coords[2] + ", " + coords[3] + ");");
                            break;
                        case PathIterator.SEG_MOVETO:
                            // offset(offset + 1);
                            // pw.println("MOVETO " + coords[0] + ":" + coords[1]);
                            pw.println("((GeneralPath)shape).moveTo(" + coords[0] + ", " + coords[1]
                                    + ");");
                            break;
                        case PathIterator.SEG_LINETO:
                            // offset(offset + 1);
                            // pw.println("LINETO " + coords[0] + ":" + coords[1]);
                            pw.println("((GeneralPath)shape).lineTo(" + coords[0] + ", " + coords[1]
                                    + ");");
                            break;
                        // through
                        case PathIterator.SEG_CLOSE:
                            // offset(offset + 1);
                            // pw.println("CLOSE");
                            pw.println("((GeneralPath)shape).closePath();");
                            break;
                    }
                }
            }

            private void dumpShape(PrintWriter pw, Shape shape, int offset) {
                if (shape instanceof ExtendedGeneralPath) {
                    dumpShape(pw, (ExtendedGeneralPath) shape, offset);
                    return;
                }
                if (shape instanceof Rectangle2D) {
                    Rectangle2D rect = (Rectangle2D) shape;
                    // offset(offset);
                    pw.println("shape = new Rectangle2D.Double(" + rect.getX() + ", " + rect.getY()
                            + ", " + rect.getWidth() + ", " + rect.getHeight() + ");");
                    // pw.println("Rectangle " + rect.getX() + ":" + rect.getY()
                    // + ":" + rect.getWidth() + ":" + rect.getHeight());
                    return;
                }
                if (shape instanceof RoundRectangle2D) {
                    RoundRectangle2D rRect = (RoundRectangle2D) shape;
                    // offset(offset);
                    pw.println("shape = new RoundRectangle2D.Double(" + rRect.getX() + ", "
                            + rRect.getY() + ", " + rRect.getWidth() + ", " + rRect.getHeight()
                            + ", " + rRect.getArcWidth() + ", " + rRect.getArcHeight() + ");");
                    // pw.println("Rectangle " + rect.getX() + ":" + rect.getY()
                    // + ":" + rect.getWidth() + ":" + rect.getHeight());
                    return;
                }
                throw new UnsupportedOperationException(shape.getClass().getCanonicalName());
            }

            private void dumpPaint(PrintWriter pw, LinearGradientPaint paint, int offset) {
                Point2D startPoint = paint.getStartPoint();
                Point2D endPoint = paint.getEndPoint();
                float[] fractions = paint.getFractions();
                Color[] colors = paint.getColors();
                CycleMethodEnum cycleMethod = paint.getCycleMethod();
                ColorSpaceEnum colorSpace = paint.getColorSpace();
                AffineTransform transform = paint.getTransform();

                StringBuffer fractionsRep = new StringBuffer();
                if (fractions == null) {
                    fractionsRep.append("null");
                } else {
                    String sep = "";
                    fractionsRep.append("new float[] {");
                    for (float fraction : fractions) {
                        fractionsRep.append(sep);
                        fractionsRep.append(fraction + "f");
                        sep = ",";
                    }
                    fractionsRep.append("}");
                }

                StringBuffer colorsRep = new StringBuffer();
                if (fractions == null) {
                    colorsRep.append("null");
                } else {
                    String sep = "";
                    colorsRep.append("new Color[] {");
                    for (Color color : colors) {
                        colorsRep.append(sep);
                        colorsRep.append("new Color(" + color.getRed() + ", " + color.getGreen()
                                + ", " + color.getBlue() + ", " + color.getAlpha() + ")");
                        sep = ",";
                    }
                    colorsRep.append("}");
                }

                String cycleMethodRep = null;
                if (cycleMethod == MultipleGradientPaint.NO_CYCLE) {
                    cycleMethodRep = "MultipleGradientPaint.CycleMethod.NO_CYCLE";
                }
                if (cycleMethod == MultipleGradientPaint.REFLECT) {
                    cycleMethodRep = "MultipleGradientPaint.CycleMethod.REFLECT";
                }
                if (cycleMethod == MultipleGradientPaint.REPEAT) {
                    cycleMethodRep = "MultipleGradientPaint.CycleMethod.REPEAT";
                }

                String colorSpaceRep = null;
                if (colorSpace == MultipleGradientPaint.SRGB) {
                    colorSpaceRep = "MultipleGradientPaint.ColorSpaceType.SRGB";
                }
                if (colorSpace == MultipleGradientPaint.LINEAR_RGB) {
                    colorSpaceRep = "MultipleGradientPaint.ColorSpaceType.LINEAR_RGB";
                }

                double[] transfMatrix = new double[6];
                transform.getMatrix(transfMatrix);

                pw.println("paint = new LinearGradientPaint(new Point2D.Double(" + startPoint.getX()
                        + ", " + startPoint.getY() + "), new Point2D.Double(" + endPoint.getX()
                        + ", " + endPoint.getY() + "), " + fractionsRep.toString() + ", "
                        + colorsRep.toString() + ", " + cycleMethodRep + ", " + colorSpaceRep
                        + ", new AffineTransform(" + transfMatrix[0] + "f, " + transfMatrix[1]
                        + "f, " + transfMatrix[2] + "f, " + transfMatrix[3] + "f, "
                        + transfMatrix[4] + "f, " + transfMatrix[5] + "f));");

                // offset(offset);
                // pw.println("LinearGradientPaint");
                // // offset(offset + 1);
                // pw.println("START : " + paint.getStartPoint());
                // // offset(offset + 1);
                // pw.println("END : " + paint.getEndPoint());
                // // offset(offset + 1);
                // pw.println("FRACTIONS : " + paint.getFractions());
                // // offset(offset + 1);
                // pw.println("CYCLE_METHOD : " + paint.getCycleMethod());
                // // offset(offset + 1);
                // pw.println("COLOR_SPACE : " + paint.getColorSpace());
                // // offset(offset + 1);
                // pw.println("GRADIENT_TRANSFORM : " + paint.getTransform());
            }

            private void dumpPaint(PrintWriter pw, RadialGradientPaint paint, int offset) {
                // offset(offset);
                Point2D centerPoint = paint.getCenterPoint();
                float radius = paint.getRadius();
                Point2D focusPoint = paint.getFocusPoint();
                float[] fractions = paint.getFractions();
                Color[] colors = paint.getColors();
                CycleMethodEnum cycleMethod = paint.getCycleMethod();
                ColorSpaceEnum colorSpace = paint.getColorSpace();
                AffineTransform transform = paint.getTransform();

                StringBuffer fractionsRep = new StringBuffer();
                if (fractions == null) {
                    fractionsRep.append("null");
                } else {
                    String sep = "";
                    fractionsRep.append("new float[] {");
                    for (float fraction : fractions) {
                        fractionsRep.append(sep);
                        fractionsRep.append(fraction + "f");
                        sep = ",";
                    }
                    fractionsRep.append("}");
                }

                StringBuffer colorsRep = new StringBuffer();
                if (fractions == null) {
                    colorsRep.append("null");
                } else {
                    String sep = "";
                    colorsRep.append("new Color[] {");
                    for (Color color : colors) {
                        colorsRep.append(sep);
                        colorsRep.append("new Color(" + color.getRed() + ", " + color.getGreen()
                                + ", " + color.getBlue() + ", " + color.getAlpha() + ")");
                        sep = ",";
                    }
                    colorsRep.append("}");
                }

                String cycleMethodRep = null;
                if (cycleMethod == MultipleGradientPaint.NO_CYCLE) {
                    cycleMethodRep = "MultipleGradientPaint.CycleMethod.NO_CYCLE";
                }
                if (cycleMethod == MultipleGradientPaint.REFLECT) {
                    cycleMethodRep = "MultipleGradientPaint.CycleMethod.REFLECT";
                }
                if (cycleMethod == MultipleGradientPaint.REPEAT) {
                    cycleMethodRep = "MultipleGradientPaint.CycleMethod.REPEAT";
                }

                String colorSpaceRep = null;
                if (colorSpace == MultipleGradientPaint.SRGB) {
                    colorSpaceRep = "MultipleGradientPaint.ColorSpaceType.SRGB";
                }
                if (colorSpace == MultipleGradientPaint.LINEAR_RGB) {
                    colorSpaceRep = "MultipleGradientPaint.ColorSpaceType.LINEAR_RGB";
                }

                double[] transfMatrix = new double[6];
                transform.getMatrix(transfMatrix);

                pw.println("paint = new RadialGradientPaint(new Point2D.Double("
                        + centerPoint.getX() + ", " + centerPoint.getY() + "), " + radius
                        + "f, new Point2D.Double(" + focusPoint.getX() + ", " + focusPoint.getY()
                        + "), " + fractionsRep.toString() + ", " + colorsRep.toString() + ", "
                        + cycleMethodRep + ", " + colorSpaceRep + ", new AffineTransform("
                        + transfMatrix[0] + "f, " + transfMatrix[1] + "f, " + transfMatrix[2]
                        + "f, " + transfMatrix[3] + "f, " + transfMatrix[4] + "f, "
                        + transfMatrix[5] + "f));");
                //
                // pw.println("RadialGradientPaint");
                // // offset(offset + 1);
                // pw.println("CENTER : " + paint.getCenterPoint());
                // // offset(offset + 1);
                // pw.println("RADIUS : " + paint.getRadius());
                // // offset(offset + 1);
                // pw.println("FOCUS : " + paint.getFocusPoint());
                // // offset(offset + 1);
                // pw.println("FRACTIONS : " + paint.getFractions());
                // // offset(offset + 1);
                // pw.println("COLORS : " + paint.getColors());
                // // offset(offset + 1);
                // pw.println("CYCLE_METHOD : " + paint.getCycleMethod());
                // // offset(offset + 1);
                // pw.println("COLOR_SPACE : " + paint.getColorSpace());
                // // offset(offset + 1);
                // pw.println("GRADIENT_TRANSFORM : " + paint.getTransform());
            }

            private void dumpPaint(PrintWriter pw, Paint paint, int offset) {
                if (paint instanceof RadialGradientPaint) {
                    dumpPaint(pw, (RadialGradientPaint) paint, offset);
                    return;
                }
                if (paint instanceof LinearGradientPaint) {
                    dumpPaint(pw, (LinearGradientPaint) paint, offset);
                    return;
                }
                if (paint instanceof Color) {
                    // offset(offset);
                    // pw.println((Color) paint);
                    Color c = (Color) paint;
                    pw.println("paint = new Color(" + c.getRed() + ", " + c.getGreen() + ", "
                            + c.getBlue() + ", " + c.getAlpha() + ");");
                    return;
                }
                if (paint == null) {
                    // offset(offset);
                    pw.println("No paint");
                    return;
                }

                throw new UnsupportedOperationException(paint.getClass().getCanonicalName());
            }

            private void dumpShapePainter(PrintWriter pw, ShapePainter painter, int offset) {
                if (painter instanceof CompositeShapePainter) {
                    dumpCompositeShapePainter(pw, (CompositeShapePainter) painter, offset);
                    return;
                }
                if (painter instanceof FillShapePainter) {
                    dumpFillShapePainter(pw, (FillShapePainter) painter, offset);
                    return;
                }
                if (painter instanceof StrokeShapePainter) {
                    dumpStrokeShapePainter(pw, (StrokeShapePainter) painter, offset);
                    return;
                }
                throw new UnsupportedOperationException(painter.getClass().getCanonicalName());
            }

            private void dumpCompositeShapePainter(PrintWriter pw, CompositeShapePainter painter,
                    int offset) {
                // offset(offset);
                // pw.println("CompositeShapePainter");
                for (int i = 0; i < painter.getShapePainterCount(); i++) {
                    dumpShapePainter(pw, painter.getShapePainter(i), offset + 1);
                }
            }

            private void dumpFillShapePainter(PrintWriter pw, FillShapePainter painter,
                    int offset) {
                try {
                    Field paintFld = FillShapePainter.class.getDeclaredField("paint");
                    paintFld.setAccessible(true);
                    Paint paint = (Paint) paintFld.get(painter);
                    if (paint == null)
                        return;
                    dumpPaint(pw, paint, offset + 1);
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                Shape shape = painter.getShape();
                // offset(offset);
                // pw.println("FillShapePainter");
                dumpShape(pw, shape, offset + 1);
                pw.println("g.setPaint(paint);");
                pw.println("g.fill(shape);");
            }

            private void dumpStrokeShapePainter(PrintWriter pw, StrokeShapePainter painter,
                    int offset) {
                Shape shape = painter.getShape();
                // offset(offset);
                // pw.println("StrokeShapePainter");
                try {
                    Field paintFld = StrokeShapePainter.class.getDeclaredField("paint");
                    paintFld.setAccessible(true);
                    Paint paint = (Paint) paintFld.get(painter);
                    if (paint == null)
                        return;
                    dumpPaint(pw, paint, offset);
                    // offset(offset + 1);
                    // pw.println(paint);
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                try {
                    Field strokeFld = StrokeShapePainter.class.getDeclaredField("stroke");
                    strokeFld.setAccessible(true);
                    Stroke stroke = (Stroke) strokeFld.get(painter);
                    // offset(offset + 1);

                    BasicStroke bStroke = (BasicStroke) stroke;
                    float width = bStroke.getLineWidth();
                    int cap = bStroke.getEndCap();
                    int join = bStroke.getLineJoin();
                    float miterlimit = bStroke.getMiterLimit();
                    float[] dash = bStroke.getDashArray();
                    float dash_phase = bStroke.getDashPhase();

                    StringBuffer dashRep = new StringBuffer();
                    if (dash == null) {
                        dashRep.append("null");
                    } else {
                        String sep = "";
                        dashRep.append("new float[] {");
                        for (float _dash : dash) {
                            dashRep.append(sep);
                            dashRep.append(_dash + "f");
                            sep = ",";
                        }
                        dashRep.append("}");
                    }
                    pw.println("stroke = new BasicStroke(" + width + "f," + cap + "," + join + ","
                            + miterlimit + "f," + dashRep + "," + dash_phase + "f);");
                } catch (Exception exc) {
                    exc.printStackTrace();
                }

                dumpShape(pw, shape, offset + 1);
                pw.println("g.setPaint(paint);");
                pw.println("g.setStroke(stroke);");
                pw.println("g.draw(shape);");
            }

            private void dumpNode(PrintWriter pw, ShapeNode node, String comment) {
                // offset(offset);
                // pw.println("ShapeNode");

                pw.println("// " + comment);
                ShapePainter sPainter = node.getShapePainter();
                dumpShapePainter(pw, sPainter, 0);
            }

            private void dumpNode(PrintWriter pw, CompositeGraphicsNode node, String comment) {
                pw.println("// " + comment);
                // offset(offset);
                // pw.println("CompositeGraphicsNode");
                int count = 0;
                for (Object obj : node.getChildren()) {
                    dumpNode(pw, (GraphicsNode) obj, comment + "_" + count);
                    count++;
                }
            }

            private void dumpNode(PrintWriter pw, GraphicsNode node, String comment) {
                AlphaComposite composite = (AlphaComposite) node.getComposite();
                if (composite != null) {
                    int rule = composite.getRule();
                    float alpha = composite.getAlpha();
                    pw.println("g.setComposite(AlphaComposite.getInstance(" + rule + ", " + alpha
                            + "f));");
                }
                AffineTransform transform = node.getTransform();
                pw.println("AffineTransform defaultTransform_" + comment + " = g.getTransform();");
                if (transform != null) {
                    // pw.println("g.transform(new AffineTransform());");
                    // } else {
                    double[] transfMatrix = new double[6];
                    transform.getMatrix(transfMatrix);
                    pw.println("g.transform(new AffineTransform(" + transfMatrix[0] + "f, "
                            + transfMatrix[1] + "f, " + transfMatrix[2] + "f, " + transfMatrix[3]
                            + "f, " + transfMatrix[4] + "f, " + transfMatrix[5] + "f));");
                }

                try {
                    if (node instanceof ShapeNode) {
                        dumpNode(pw, (ShapeNode) node, comment);
                        return;
                    }
                    if (node instanceof CompositeGraphicsNode) {
                        dumpNode(pw, (CompositeGraphicsNode) node, comment);
                        return;
                    }
                    throw new UnsupportedOperationException(node.getClass().getCanonicalName());
                } finally {
                    pw.println("g.setTransform(defaultTransform_" + comment + ");");
                }
            }

            @Override
            public void gvtBuildCompleted(GVTTreeBuilderEvent e) {
                label.setText("Build Done.");
                frame.pack();

                // try {
                // PrintWriter pw = new PrintWriter(
                // "C:/jprojects/flamingo/workspace/Svg2Java2D/src/Sample.java");
                // pw.println("import java.awt.*;");
                // pw.println("import java.awt.geom.*;");
                // pw.println("public class Sample {");
                // pw.println("\tpublic void paint(Graphics2D g) {");
                // pw.println("Shape shape = null;");
                // pw.println("Paint paint = null;");
                // pw.println("Stroke stroke = null;");
                // // pw.println("AffineTransform defaultTransform = null;");
                // dumpNode(pw, e.getGVTRoot(), "");
                // pw.println("\t}");
                // pw.println("}");
                // pw.close();
                // } catch (Exception exc) {
                // exc.printStackTrace();
                // }

                // GVTTreeWalker tw = new GVTTreeWalker(e.getGVTRoot());
                // GraphicsNode node = tw.firstChild();
                // System.out.println(node.getComposite());
                // System.out.println(node.getClip());
                // System.out.println(node.)
            }
        });

        svgCanvas.addGVTTreeRendererListener(new GVTTreeRendererAdapter() {
            @Override
            public void gvtRenderingPrepare(GVTTreeRendererEvent e) {
                label.setText("Rendering Started...");
            }

            @Override
            public void gvtRenderingCompleted(GVTTreeRendererEvent e) {
                label.setText("");
            }
        });

        return panel;
    }

}