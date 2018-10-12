/*
 * Copyright (c) 2005-2018 Radiance Photon Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Photon Kirill Grouchnikov nor the names of
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
package org.pushingpixels.photon.transcoder;

import org.apache.batik.ext.awt.LinearGradientPaint;
import org.apache.batik.ext.awt.MultipleGradientPaint;
import org.apache.batik.ext.awt.MultipleGradientPaint.*;
import org.apache.batik.ext.awt.RadialGradientPaint;
import org.apache.batik.ext.awt.geom.ExtendedGeneralPath;
import org.apache.batik.gvt.*;

import java.awt.*;
import java.awt.geom.*;
import java.io.*;

/**
 * SVG to Java2D transcoder.
 *
 * @author Kirill Grouchnikov.
 */
abstract class SvgBaseTranscoder {
    /**
     * Listener.
     */
    protected TranscoderListener listener;

    /**
     * Print writer that wraps the {@link TranscoderListener#getWriter()} of the registered
     * {@link #listener}.
     */
    protected PrintWriter externalPrintWriter;

    /**
     * Print writer that wraps the {@link TranscoderListener#getWriter()} of the registered
     * {@link #listener}.
     */
    protected PrintWriter printWriter;

    private LanguageRenderer languageRenderer;

    /**
     * Class name for the generated Java2D code.
     */
    protected String classname;

    /**
     * Package name for the generated Java2D code.
     */
    protected String packageName;

    protected final static String TOKEN_PACKAGE = "TOKEN_PACKAGE";

    protected final static String TOKEN_CLASSNAME = "TOKEN_CLASSNAME";

    protected final static String TOKEN_PAINTING_CODE = "TOKEN_PAINTING_CODE";

    protected final static String TOKEN_ORIG_X = "TOKEN_ORIG_X";

    protected final static String TOKEN_ORIG_Y = "TOKEN_ORIG_Y";

    protected final static String TOKEN_ORIG_WIDTH = "TOKEN_ORIG_WIDTH";

    protected final static String TOKEN_ORIG_HEIGHT = "TOKEN_ORIG_HEIGHT";

    /**
     * Creates a new transcoder.
     *
     * @param classname        Classname for the generated Java2D code.
     * @param languageRenderer Language renderer (Java, Kotlin, ...)
     */
    public SvgBaseTranscoder(String classname, LanguageRenderer languageRenderer) {
        this.classname = classname;
        this.languageRenderer = languageRenderer;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * Sets the listener.
     *
     * @param listener Listener.
     */
    public void setListener(TranscoderListener listener) {
        this.listener = listener;
        this.setPrintWriter(new PrintWriter(this.listener.getWriter()));
    }

    public void setPrintWriter(PrintWriter printWriter) {
        this.externalPrintWriter = printWriter;
    }

    /**
     * Transcodes the SVG image into Java2D code.
     *
     * @param gvtRoot        Graphics vector tree root.
     * @param templateStream Stream with the template content.
     */
    public void transcode(GraphicsNode gvtRoot, InputStream templateStream) {
        // load the template
        StringBuffer templateBuffer = new StringBuffer();
        BufferedReader templateReader = new BufferedReader(new InputStreamReader(templateStream));
        try {
            while (true) {
                String line = templateReader.readLine();
                if (line == null)
                    break;
                templateBuffer.append(line + "\n");
            }
            templateReader.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        String templateString = templateBuffer.toString();

        if (packageName != null) {
            templateString = templateString.replaceAll(TOKEN_PACKAGE,
                    "package " + packageName + languageRenderer.getStatementEnd());
        } else {
            templateString = templateString.replaceAll(TOKEN_PACKAGE, "");
        }

        templateString = templateString.replaceAll(TOKEN_CLASSNAME, classname);
        templateString = templateString.replaceAll(TOKEN_CLASSNAME, classname);
        templateString = templateString.replaceAll(TOKEN_CLASSNAME, classname);

        ByteArrayOutputStream paintingCodeStream = new ByteArrayOutputStream();
        this.printWriter = new PrintWriter(paintingCodeStream);
        transcodeGraphicsNode(gvtRoot, "");
        this.printWriter.close();

        String paintingCode = new String(paintingCodeStream.toByteArray());
        templateString = templateString.replaceAll(TOKEN_PAINTING_CODE, paintingCode);

        Rectangle2D bounds = gvtRoot.getBounds();

        templateString = templateString.replaceAll(TOKEN_ORIG_X, "" + bounds.getX());
        // + (int) Math.ceil(bounds.getX()));
        templateString = templateString.replaceAll(TOKEN_ORIG_Y, "" + bounds.getY());
        // + (int) Math.ceil(bounds.getY()));
        templateString = templateString.replaceAll(TOKEN_ORIG_WIDTH, "" + bounds.getWidth());
        // + (int) Math.ceil(bounds.getWidth()));
        templateString = templateString.replaceAll(TOKEN_ORIG_HEIGHT, "" + bounds.getHeight());
        // + (int) Math.ceil(bounds.getHeight()));

        this.externalPrintWriter.println(templateString);
        this.externalPrintWriter.close();

        if (listener != null)
            listener.finished();
    }

    /**
     * Transcodes the specified path iterator.
     *
     * @param pathIterator Path iterator.
     */
    private void transcodePathIterator(PathIterator pathIterator) {
        float[] coords = new float[6];
        printWriter.println("shape = " + languageRenderer.getObjectCreationNoParams("GeneralPath")
                + languageRenderer.getStatementEnd());
        for (; !pathIterator.isDone(); pathIterator.next()) {
            int type = pathIterator.currentSegment(coords);
            switch (type) {
                case PathIterator.SEG_CUBICTO:
                    // offset(offset + 1);
                    // printWriter.println("CUBICTO " + coords[0] + ":" + coords[1]
                    // + ":" + coords[2] + ":" + coords[3] + ":"
                    // + coords[4] + ":" + coords[5]);
                    printWriter.println(languageRenderer.getObjectCast("shape", "GeneralPath")
                            + ".curveTo(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ", "
                            + coords[3] + ", " + coords[4] + ", " + coords[5] + ")"
                            + languageRenderer.getStatementEnd());
                    break;
                case PathIterator.SEG_QUADTO:
                    // offset(offset + 1);
                    // printWriter.println("QUADTO " + coords[0] + ":" + coords[1]
                    // + ":" + coords[2] + ":" + coords[3]);
                    printWriter.println(languageRenderer.getObjectCast("shape", "GeneralPath")
                            + ".quadTo(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ", "
                            + coords[3] + ")" + languageRenderer.getStatementEnd());
                    break;
                case PathIterator.SEG_MOVETO:
                    // offset(offset + 1);
                    // printWriter.println("MOVETO " + coords[0] + ":" + coords[1]);
                    printWriter.println(languageRenderer.getObjectCast("shape", "GeneralPath")
                            + ".moveTo(" + coords[0] + ", " + coords[1] + ")"
                            + languageRenderer.getStatementEnd());
                    break;
                case PathIterator.SEG_LINETO:
                    // offset(offset + 1);
                    // printWriter.println("LINETO " + coords[0] + ":" + coords[1]);
                    printWriter.println(languageRenderer.getObjectCast("shape", "GeneralPath")
                            + ".lineTo(" + coords[0] + ", " + coords[1] + ")"
                            + languageRenderer.getStatementEnd());
                    break;
                // through
                case PathIterator.SEG_CLOSE:
                    // offset(offset + 1);
                    // printWriter.println("CLOSE");
                    printWriter.println(languageRenderer.getObjectCast("shape", "GeneralPath")
                            + ".closePath()" + languageRenderer.getStatementEnd());
                    break;
            }
        }
    }

    /**
     * Transcodes the specified shape.
     *
     * @param shape Shape.
     * @throws UnsupportedOperationException if the shape is unsupported.
     */
    private void transcodeShape(Shape shape) throws UnsupportedOperationException {
        if (shape instanceof ExtendedGeneralPath) {
            transcodePathIterator(((ExtendedGeneralPath) shape).getPathIterator(null));
            return;
        }
        if (shape instanceof GeneralPath) {
            transcodePathIterator(((GeneralPath) shape).getPathIterator(null));
            return;
        }
        if (shape instanceof Rectangle2D) {
            Rectangle2D rect = (Rectangle2D) shape;
            printWriter
                    .println("shape = " + languageRenderer.getObjectCreation("Rectangle2D.Double")
                            + "(" + rect.getX() + ", " + rect.getY() + ", " + rect.getWidth() + ", "
                            + rect.getHeight() + ")" + languageRenderer.getStatementEnd());
            return;
        }
        if (shape instanceof RoundRectangle2D) {
            RoundRectangle2D rRect = (RoundRectangle2D) shape;
            printWriter.println(
                    "shape = " + languageRenderer.getObjectCreation("RoundRectangle2D.Double") + "("
                            + rRect.getX() + ", " + rRect.getY() + ", " + rRect.getWidth() + ", "
                            + rRect.getHeight() + ", " + rRect.getArcWidth() + ", "
                            + rRect.getArcHeight() + ")" + languageRenderer.getStatementEnd());
            return;
        }
        if (shape instanceof Ellipse2D) {
            Ellipse2D ell = (Ellipse2D) shape;
            printWriter.println("shape = " + languageRenderer.getObjectCreation("Ellipse2D.Double")
                    + "(" + ell.getX() + ", " + ell.getY() + ", " + ell.getWidth() + ", "
                    + ell.getHeight() + ")" + languageRenderer.getStatementEnd());
            return;
        }
        if (shape instanceof Line2D.Float) {
            Line2D.Float l2df = (Line2D.Float) shape;
            printWriter.print("shape = " + languageRenderer.getObjectCreation("Line2D.Float"));
            printWriter.format("(%ff,%ff,%ff,%ff)", l2df.x1, l2df.y1, l2df.x2, l2df.y2);
            printWriter.println(languageRenderer.getStatementEnd());
            return;
        }
        throw new UnsupportedOperationException(shape.getClass().getCanonicalName());
    }

    /**
     * Transcodes the specified linear gradient paint.
     *
     * @param paint Linear gradient paint.
     * @throws IllegalArgumentException if the fractions are not strictly increasing.
     */
    private void transcodeLinearGradientPaint(LinearGradientPaint paint)
            throws IllegalArgumentException {
        Point2D startPoint = paint.getStartPoint();
        Point2D endPoint = paint.getEndPoint();
        float[] fractions = paint.getFractions();
        Color[] colors = paint.getColors();
        CycleMethodEnum cycleMethod = paint.getCycleMethod();
        ColorSpaceEnum colorSpace = paint.getColorSpace();
        AffineTransform transform = paint.getTransform();

        float previousFraction = -1.0f;
        for (float currentFraction : fractions) {
            if (currentFraction < 0f || currentFraction > 1f) {
                throw new IllegalArgumentException(
                        "Fraction values must " + "be in the range 0 to 1: " + currentFraction);
            }

            if (currentFraction < previousFraction) {
                throw new IllegalArgumentException(
                        "Keyframe fractions " + "must be non-decreasing: " + currentFraction);
            }

            previousFraction = currentFraction;
        }

        StringBuffer fractionsRep = new StringBuffer();
        if (fractions == null) {
            fractionsRep.append("null");
        } else {
            String sep = "";
            fractionsRep.append(languageRenderer.startPrimitiveArrayOf("float"));
            previousFraction = -1.0f;
            for (float currentFraction : fractions) {
                fractionsRep.append(sep);
                if (currentFraction == previousFraction)
                    currentFraction += 0.000000001f;
                fractionsRep.append(currentFraction + "f");
                sep = ",";

                previousFraction = currentFraction;
            }
            fractionsRep.append(languageRenderer.endArray());
        }

        StringBuffer colorsRep = new StringBuffer();
        if (fractions == null) {
            colorsRep.append("null");
        } else {
            String sep = "";
            colorsRep.append(languageRenderer.startGenericArrayOf("Color"));
            for (Color color : colors) {
                colorsRep.append(sep);
                colorsRep.append(languageRenderer.getObjectCreation("Color") + "(" + color.getRed()
                        + ", " + color.getGreen() + ", " + color.getBlue() + ", " + color.getAlpha()
                        + ")");
                sep = ",";
            }
            colorsRep.append(languageRenderer.endArray());
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

        this.printWriter
                .println("paint = " + languageRenderer.getObjectCreation("LinearGradientPaint")
                        + "(" + languageRenderer.getObjectCreation("Point2D.Double") + "("
                        + startPoint.getX() + ", " + startPoint.getY() + "), "
                        + languageRenderer.getObjectCreation("Point2D.Double") + "("
                        + endPoint.getX() + ", " + endPoint.getY() + "), " + fractionsRep.toString()
                        + ", " + colorsRep.toString() + ", " + cycleMethodRep + ", " + colorSpaceRep
                        + ", " + languageRenderer.getObjectCreation("AffineTransform") + "("
                        + transfMatrix[0] + "f, " + transfMatrix[1] + "f, " + transfMatrix[2]
                        + "f, " + transfMatrix[3] + "f, " + transfMatrix[4] + "f, "
                        + transfMatrix[5] + "f))" + languageRenderer.getStatementEnd());

        // offset(offset);
        // printWriter.println("LinearGradientPaint");
        // // offset(offset + 1);
        // printWriter.println("START : " + paint.getStartPoint());
        // // offset(offset + 1);
        // printWriter.println("END : " + paint.getEndPoint());
        // // offset(offset + 1);
        // printWriter.println("FRACTIONS : " + paint.getFractions());
        // // offset(offset + 1);
        // printWriter.println("CYCLE_METHOD : " + paint.getCycleMethod());
        // // offset(offset + 1);
        // printWriter.println("COLOR_SPACE : " + paint.getColorSpace());
        // // offset(offset + 1);
        // printWriter.println("GRADIENT_TRANSFORM : " + paint.getTransform());
    }

    /**
     * Transcodes the specified radial gradient paint.
     *
     * @param paint Radial gradient paint.
     * @throws IllegalArgumentException if the fractions are not strictly increasing.
     */
    private void transcodeRadialGradientPaint(RadialGradientPaint paint)
            throws IllegalArgumentException {
        // offset(offset);
        Point2D centerPoint = paint.getCenterPoint();
        float radius = paint.getRadius();
        Point2D focusPoint = paint.getFocusPoint();
        float[] fractions = paint.getFractions();
        Color[] colors = paint.getColors();
        CycleMethodEnum cycleMethod = paint.getCycleMethod();
        ColorSpaceEnum colorSpace = paint.getColorSpace();
        AffineTransform transform = paint.getTransform();

        float previousFraction = -1.0f;
        for (float currentFraction : fractions) {
            if (currentFraction < 0f || currentFraction > 1f) {
                throw new IllegalArgumentException(
                        "Fraction values must " + "be in the range 0 to 1: " + currentFraction);
            }

            if (currentFraction < previousFraction) {
                throw new IllegalArgumentException(
                        "Keyframe fractions " + "must be non-decreasing: " + currentFraction);
            }

            previousFraction = currentFraction;
        }

        StringBuffer fractionsRep = new StringBuffer();
        if (fractions == null) {
            fractionsRep.append("null");
        } else {
            String sep = "";
            fractionsRep.append(languageRenderer.startPrimitiveArrayOf("float"));
            previousFraction = -1.0f;
            for (float currentFraction : fractions) {
                fractionsRep.append(sep);
                if (currentFraction == previousFraction)
                    currentFraction += 0.000000001f;
                fractionsRep.append(currentFraction + "f");
                sep = ",";

                previousFraction = currentFraction;
            }
            fractionsRep.append(languageRenderer.endArray());
        }

        StringBuffer colorsRep = new StringBuffer();
        if (fractions == null) {
            colorsRep.append("null");
        } else {
            String sep = "";
            colorsRep.append(languageRenderer.startGenericArrayOf("Color"));
            for (Color color : colors) {
                colorsRep.append(sep);
                colorsRep.append(languageRenderer.getObjectCreation("Color") + "(" + color.getRed()
                        + ", " + color.getGreen() + ", " + color.getBlue() + ", " + color.getAlpha()
                        + ")");
                sep = ",";
            }
            colorsRep.append(languageRenderer.endArray());
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

        this.printWriter.println("paint = "
                + languageRenderer.getObjectCreation("RadialGradientPaint") + "("
                + languageRenderer.getObjectCreation("Point2D.Double") + "(" + centerPoint.getX()
                + ", " + centerPoint.getY() + "), " + radius + "f, "
                + languageRenderer.getObjectCreation("Point2D.Double") + "(" + focusPoint.getX()
                + ", " + focusPoint.getY() + "), " + fractionsRep.toString() + ", "
                + colorsRep.toString() + ", " + cycleMethodRep + ", " + colorSpaceRep + ", "
                + languageRenderer.getObjectCreation("AffineTransform") + "(" + transfMatrix[0]
                + "f, " + transfMatrix[1] + "f, " + transfMatrix[2] + "f, " + transfMatrix[3]
                + "f, " + transfMatrix[4] + "f, " + transfMatrix[5] + "f))"
                + languageRenderer.getStatementEnd());
        //
        // printWriter.println("RadialGradientPaint");
        // // offset(offset + 1);
        // printWriter.println("CENTER : " + paint.getCenterPoint());
        // // offset(offset + 1);
        // printWriter.println("RADIUS : " + paint.getRadius());
        // // offset(offset + 1);
        // printWriter.println("FOCUS : " + paint.getFocusPoint());
        // // offset(offset + 1);
        // printWriter.println("FRACTIONS : " + paint.getFractions());
        // // offset(offset + 1);
        // printWriter.println("COLORS : " + paint.getColors());
        // // offset(offset + 1);
        // printWriter.println("CYCLE_METHOD : " + paint.getCycleMethod());
        // // offset(offset + 1);
        // printWriter.println("COLOR_SPACE : " + paint.getColorSpace());
        // // offset(offset + 1);
        // printWriter.println("GRADIENT_TRANSFORM : " + paint.getTransform());
    }

    /**
     * Transcodes the specified paint.
     *
     * @param paint Paint.
     * @throws UnsupportedOperationException if the paint is unsupported.
     */
    private void transcodePaint(Paint paint) throws UnsupportedOperationException {
        if (paint instanceof RadialGradientPaint) {
            transcodeRadialGradientPaint((RadialGradientPaint) paint);
            return;
        }
        if (paint instanceof LinearGradientPaint) {
            transcodeLinearGradientPaint((LinearGradientPaint) paint);
            return;
        }
        if (paint instanceof Color) {
            // offset(offset);
            // printWriter.println((Color) paint);
            Color c = (Color) paint;
            printWriter.println("paint = " + languageRenderer.getObjectCreation("Color") + "("
                    + c.getRed() + ", " + c.getGreen() + ", " + c.getBlue() + ", " + c.getAlpha()
                    + ")" + languageRenderer.getStatementEnd());
            return;
        }
        if (paint == null) {
            // offset(offset);
            printWriter.println("No paint");
            return;
        }

        throw new UnsupportedOperationException(paint.getClass().getCanonicalName());
    }

    /**
     * Transcodes the specified shape painter.
     *
     * @param painter Shape painter.
     * @throws UnsupportedOperationException if the shape painter is unsupported.
     */
    private void transcodeShapePainter(ShapePainter painter) throws UnsupportedOperationException {
        if (painter == null)
            return;
        if (painter instanceof CompositeShapePainter) {
            transcodeCompositeShapePainter((CompositeShapePainter) painter);
            return;
        }
        if (painter instanceof FillShapePainter) {
            transcodeFillShapePainter((FillShapePainter) painter);
            return;
        }
        if (painter instanceof StrokeShapePainter) {
            transcodeStrokeShapePainter((StrokeShapePainter) painter);
            return;
        }
        throw new UnsupportedOperationException(painter.getClass().getCanonicalName());
    }

    /**
     * Transcodes the specified composite shape painter.
     *
     * @param painter Composite shape painter.
     */
    private void transcodeCompositeShapePainter(CompositeShapePainter painter) {
        // offset(offset);
        // printWriter.println("CompositeShapePainter");
        for (int i = 0; i < painter.getShapePainterCount(); i++) {
            transcodeShapePainter(painter.getShapePainter(i));
        }
    }

    /**
     * Transcodes the specified fill shape painter.
     *
     * @param painter Fill shape painter.
     */
    private void transcodeFillShapePainter(FillShapePainter painter) {
        Paint paint = painter.getPaint();
        if (paint == null)
            return;
        transcodePaint(paint);
        Shape shape = painter.getShape();
        // offset(offset);
        // printWriter.println("FillShapePainter");
        transcodeShape(shape);
        printWriter.println("g" + languageRenderer.startSetterAssignment("paint") + "paint"
                + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
        printWriter.println("g.fill(shape)" + languageRenderer.getStatementEnd());
    }

    /**
     * Transcodes the specified stroke shape painter.
     *
     * @param painter Stroke shape painter.
     */
    private void transcodeStrokeShapePainter(StrokeShapePainter painter) {
        Shape shape = painter.getShape();
        // offset(offset);
        // printWriter.println("StrokeShapePainter");
        Paint paint = painter.getPaint();
        if (paint == null)
            return;
        transcodePaint(paint);
        // offset(offset + 1);
        // printWriter.println(paint);
        Stroke stroke = painter.getStroke();
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
            dashRep.append(languageRenderer.startPrimitiveArrayOf("float"));
            for (float _dash : dash) {
                dashRep.append(sep);
                dashRep.append(_dash + "f");
                sep = ",";
            }
            dashRep.append("}");
        }
        printWriter.println("stroke = " + languageRenderer.getObjectCreation("BasicStroke")
                + "(" + width + "f," + cap + "," + join + "," + miterlimit + "f," + dashRep
                + "," + dash_phase + "f)" + languageRenderer.getStatementEnd());

        transcodeShape(shape);
        printWriter.println("g" + languageRenderer.startSetterAssignment("paint") + "paint"
                + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
        printWriter.println("g" + languageRenderer.startSetterAssignment("stroke") + "stroke"
                + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
        printWriter.println("g.draw(shape)" + languageRenderer.getStatementEnd());
    }

    /**
     * Transcodes the specified shape node.
     *
     * @param node    Shape node.
     * @param comment Comment (for associating the Java2D section with the corresponding SVG
     *                section).
     */
    private void transcodeShapeNode(ShapeNode node, String comment) {
        // offset(offset);
        // printWriter.println("ShapeNode");

        printWriter.println("// " + comment);
        ShapePainter sPainter = node.getShapePainter();
        transcodeShapePainter(sPainter);
    }

    /**
     * Transcodes the specified composite graphics node.
     *
     * @param node    Composite graphics node.
     * @param comment Comment (for associating the Java2D section with the corresponding SVG
     *                section).
     */
    private void transcodeCompositeGraphicsNode(CompositeGraphicsNode node, String comment) {
        printWriter.println("// " + comment);
        // offset(offset);
        // printWriter.println("CompositeGraphicsNode");
        int count = 0;
        for (Object obj : node.getChildren()) {
            transcodeGraphicsNode((GraphicsNode) obj, comment + "_" + count);
            count++;
        }
    }

    /**
     * Transcodes the specified graphics node.
     *
     * @param node    Graphics node.
     * @param comment Comment (for associating the Java2D section with the corresponding SVG
     *                section).
     * @throws UnsupportedOperationException if the graphics node is unsupported.
     */
    private void transcodeGraphicsNode(GraphicsNode node, String comment)
            throws UnsupportedOperationException {
        AlphaComposite composite = (AlphaComposite) node.getComposite();
        if (composite != null) {
            int rule = composite.getRule();
            float alpha = composite.getAlpha();
            printWriter.println("g" + languageRenderer.startSetterAssignment("composite")
                    + "AlphaComposite.getInstance(" + rule + ", " + alpha + "f * origAlpha)"
                    + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
        }
        AffineTransform transform = node.getTransform();
        printWriter.println(languageRenderer.startVariableDefinition("AffineTransform")
                + "defaultTransform_" + comment + " = g" + languageRenderer.getGetter("transform")
                + languageRenderer.getStatementEnd());
        if (transform != null) {
            // printWriter.println("g.transform(new AffineTransform());");
            // } else {
            double[] transfMatrix = new double[6];
            transform.getMatrix(transfMatrix);
            printWriter
                    .println("g.transform(" + languageRenderer.getObjectCreation("AffineTransform")
                            + "(" + transfMatrix[0] + "f, " + transfMatrix[1] + "f, "
                            + transfMatrix[2] + "f, " + transfMatrix[3] + "f, " + transfMatrix[4]
                            + "f, " + transfMatrix[5] + "f))" + languageRenderer.getStatementEnd());
        }

        try {
            if (node instanceof ShapeNode) {
                transcodeShapeNode((ShapeNode) node, comment);
                return;
            }
            if (node instanceof CompositeGraphicsNode) {
                transcodeCompositeGraphicsNode((CompositeGraphicsNode) node, comment);
                return;
            }
            throw new UnsupportedOperationException(node.getClass().getCanonicalName());
        } finally {
            printWriter.println("g" + languageRenderer.startSetterAssignment("transform")
                    + "defaultTransform_" + comment + languageRenderer.endSetterAssignment()
                    + languageRenderer.getStatementEnd());
        }
    }
}
