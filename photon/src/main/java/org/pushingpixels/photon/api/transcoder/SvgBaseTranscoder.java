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
package org.pushingpixels.photon.api.transcoder;

import org.apache.batik.bridge.*;
import org.apache.batik.ext.awt.LinearGradientPaint;
import org.apache.batik.ext.awt.MultipleGradientPaint;
import org.apache.batik.ext.awt.MultipleGradientPaint.*;
import org.apache.batik.ext.awt.RadialGradientPaint;
import org.apache.batik.ext.awt.geom.ExtendedGeneralPath;
import org.apache.batik.gvt.*;
import org.pushingpixels.photon.internal.transcoder.RasterScanner;
import org.pushingpixels.photon.internal.transcoder.graphics.McCrashyGraphics2D;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import java.util.List;
import java.util.*;

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
    private String packageName;

    private final static String TOKEN_PACKAGE = "TOKEN_PACKAGE";

    private final static String TOKEN_CLASSNAME = "TOKEN_CLASSNAME";

    private final static String TOKEN_RASTER_CODE = "TOKEN_RASTER_CODE";

    private final static String TOKEN_PAINTING_CODE = "TOKEN_PAINTING_CODE";

    private final static String TOKEN_ORIG_X = "TOKEN_ORIG_X";

    private final static String TOKEN_ORIG_Y = "TOKEN_ORIG_Y";

    private final static String TOKEN_ORIG_WIDTH = "TOKEN_ORIG_WIDTH";

    private final static String TOKEN_ORIG_HEIGHT = "TOKEN_ORIG_HEIGHT";

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

        // Pass 1 - scan and transcode all raster images
        ByteArrayOutputStream rasterCodeStream = new ByteArrayOutputStream();
        PrintWriter rasterPrintWriter = new PrintWriter(rasterCodeStream);
        RasterScanner rasterScanner = new RasterScanner(rasterPrintWriter, this.languageRenderer);
        rasterScanner.scan(gvtRoot);
        rasterPrintWriter.close();

        String rasterCode = new String(rasterCodeStream.toByteArray());
        templateString = templateString.replaceAll(TOKEN_RASTER_CODE, rasterCode);

        // Pass 2 - transcode the rest of the content
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
    private void transcodePathIterator(PathIterator pathIterator, String suffix) {
        float[] coords = new float[6];
        printWriter.println("shape" + suffix + " = "
                + languageRenderer.getObjectCreationNoParams("GeneralPath")
                + languageRenderer.getStatementEnd());
        for (; !pathIterator.isDone(); pathIterator.next()) {
            int type = pathIterator.currentSegment(coords);
            switch (type) {
                case PathIterator.SEG_CUBICTO:
                    printWriter.println(
                            languageRenderer.getObjectCast("shape" + suffix, "GeneralPath")
                                    + ".curveTo(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ", "
                                    + coords[3] + ", " + coords[4] + ", " + coords[5] + ")"
                                    + languageRenderer.getStatementEnd());
                    break;
                case PathIterator.SEG_QUADTO:
                    printWriter.println(
                            languageRenderer.getObjectCast("shape" + suffix, "GeneralPath")
                                    + ".quadTo(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ", "
                                    + coords[3] + ")" + languageRenderer.getStatementEnd());
                    break;
                case PathIterator.SEG_MOVETO:
                    printWriter.println(
                            languageRenderer.getObjectCast("shape" + suffix, "GeneralPath")
                                    + ".moveTo(" + coords[0] + ", " + coords[1] + ")"
                                    + languageRenderer.getStatementEnd());
                    break;
                case PathIterator.SEG_LINETO:
                    printWriter.println(
                            languageRenderer.getObjectCast("shape" + suffix, "GeneralPath")
                                    + ".lineTo(" + coords[0] + ", " + coords[1] + ")"
                                    + languageRenderer.getStatementEnd());
                    break;
                case PathIterator.SEG_CLOSE:
                    printWriter.println(
                            languageRenderer.getObjectCast("shape" + suffix, "GeneralPath")
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
    private void transcodeShape(Shape shape, String suffix) throws UnsupportedOperationException {
        if (shape instanceof ExtendedGeneralPath) {
            transcodePathIterator(shape.getPathIterator(null), suffix);
            return;
        }
        if (shape instanceof GeneralPath) {
            transcodePathIterator(shape.getPathIterator(null), suffix);
            return;
        }
        if (shape instanceof Rectangle2D) {
            Rectangle2D rect = (Rectangle2D) shape;
            printWriter.println("shape" + suffix + " = "
                    + languageRenderer.getObjectCreation("Rectangle2D.Double")
                    + "(" + rect.getX() + ", " + rect.getY() + ", " + rect.getWidth() + ", "
                    + rect.getHeight() + ")" + languageRenderer.getStatementEnd());
            return;
        }
        if (shape instanceof RoundRectangle2D) {
            RoundRectangle2D rRect = (RoundRectangle2D) shape;
            printWriter.println("shape" + suffix + " = " +
                    languageRenderer.getObjectCreation("RoundRectangle2D.Double") + "("
                    + rRect.getX() + ", " + rRect.getY() + ", " + rRect.getWidth() + ", "
                    + rRect.getHeight() + ", " + rRect.getArcWidth() + ", "
                    + rRect.getArcHeight() + ")" + languageRenderer.getStatementEnd());
            return;
        }
        if (shape instanceof Ellipse2D) {
            Ellipse2D ell = (Ellipse2D) shape;
            printWriter.println("shape" + suffix + " = "
                    + languageRenderer.getObjectCreation("Ellipse2D.Double")
                    + "(" + ell.getX() + ", " + ell.getY() + ", " + ell.getWidth() + ", "
                    + ell.getHeight() + ")" + languageRenderer.getStatementEnd());
            return;
        }
        if (shape instanceof Line2D) {
            Line2D l2df = (Line2D) shape;
            printWriter.print("shape" + suffix + " = "
                    + languageRenderer.getObjectCreation("Line2D.Float"));
            printWriter.format("(%ff,%ff,%ff,%ff)", (float) l2df.getX1(), (float) l2df.getY1(),
                    (float) l2df.getX2(), (float) l2df.getY2());
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
    }

    private void transcodePatternPaint(PatternPaint paint) {
        AffineTransform transform = paint.getPatternTransform();
        transform.concatenate(paint.getGraphicsNode().getTransform());

        // Confine the tiling to the shape of the current node
        printWriter.println("clip = g" + languageRenderer.getGetter("clip")
                + languageRenderer.getStatementEnd());
        printWriter.println("g.clip(shape)" + languageRenderer.getStatementEnd());

        printWriter.println("{");
        // Get the pre-transformation bounding box of the pattern node
        Rectangle2D rect2D = paint.getGraphicsNode().getBounds();
        printWriter.println("    " + languageRenderer.startVariableDefinition("Rectangle2D")
                + "rect2D = " + languageRenderer.getObjectCreation("Rectangle2D.Double")
                + "(" + rect2D.getX() + ", " + rect2D.getY() + ", " + rect2D.getWidth() + ", "
                + rect2D.getHeight() + ")" + languageRenderer.getStatementEnd());
        // Create a new Graphics2D object
        printWriter.println("    " + languageRenderer.startVariableDefinition("Graphics2D")
                + "gTiled = " + languageRenderer.getObjectCast("g.create()", "Graphics2D")
                + languageRenderer.getStatementEnd());

        double[] transfMatrix = new double[6];
        transform.getMatrix(transfMatrix);
        // Apply the transformation from the pattern node
        printWriter
                .println("    " + languageRenderer.startVariableDefinition("AffineTransform")
                        + "tTiled = " + languageRenderer.getObjectCreation(
                        "AffineTransform")
                        + "(" + transfMatrix[0] + "f, " + transfMatrix[1] + "f, "
                        + transfMatrix[2] + "f, " + transfMatrix[3] + "f, " + transfMatrix[4]
                        + "f, " + transfMatrix[5] + "f)" + languageRenderer.getStatementEnd());
        printWriter
                .println("    gTiled.transform(tTiled)" + languageRenderer.getStatementEnd());
        // Point2D objects for tracking when the tiling ends (in both directions)
        printWriter.println("    " + languageRenderer.startVariableDefinition("Point2D")
                + "src = " + languageRenderer.getObjectCreation("Point2D.Double")
                + "(0, 0)" + languageRenderer.getStatementEnd());
        printWriter.println("    " + languageRenderer.startVariableDefinition("Point2D")
                + "dst = " + languageRenderer.getObjectCreation("Point2D.Double")
                + "(0, 0)" + languageRenderer.getStatementEnd());

        // Start a nested loop that tiles the pattern (post-transformation) on the
        // clipped Graphics2D.
        printWriter.println("    " + languageRenderer.startVariableDefinition("double")
                + "startX = rect2D.getX()" + languageRenderer.getStatementEnd());
        printWriter.println("    while (true) {");
        printWriter.println("        " + languageRenderer.startVariableDefinition("double")
                + "startY = rect2D.getY()" + languageRenderer.getStatementEnd());
        printWriter.println("        while (true) {");
        printWriter.println(
                "            gTiled.translate(startX, startY)" + languageRenderer.getStatementEnd());
        printWriter.println("            " + languageRenderer.startVariableDefinition("Shape")
                + "shapeTile = null" + languageRenderer.getStatementEnd());

        // Since PatternGraphicsNode does not (yet?) expose its content, we ask it to
        // paint itself to a custom extension of Graphics2D that tracks all relevant
        // operations and converts them to the matching Java2D instructions that are
        // printed to our writer.
        SVGPatternElementBridge.PatternGraphicsNode pgn =
                (SVGPatternElementBridge.PatternGraphicsNode) paint.getGraphicsNode();
        pgn.primitivePaint(new McCrashyGraphics2D() {
            private Shape clip;
            private RenderingHints hints = new RenderingHints(new HashMap<>());
            private AffineTransform transform = new AffineTransform();
            private Composite composite;

            @Override
            public Graphics create() {
                return this;
            }

            @Override
            public void dispose() {
            }

            @Override
            public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
                transcodeRenderedImage((RenderedImage) img, "gTiled");
                return false;
            }

            public void draw(Shape shape) {
                transcodeShape(shape, "Tile");
                printWriter.println("gTiled.draw(shapeTile);");
            }

            public void fill(Shape shape) {
                transcodeShape(shape, "Tile");
                printWriter.println("gTiled.fill(shapeTile);");
            }

            public void setComposite(Composite composite) {
                this.composite = composite;
                int rule = ((AlphaComposite) composite).getRule();
                float alpha = ((AlphaComposite) composite).getAlpha();
                printWriter.println("gTiled" + languageRenderer.startSetterAssignment("composite")
                        + "AlphaComposite.getInstance(" + rule + ", " + alpha + "f * origAlpha)"
                        + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
            }

            public void setPaint(Paint paint) {
                transcodePaint(paint);
                printWriter.println(
                        "gTiled" + languageRenderer.startSetterAssignment("paint") + "paint"
                                + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
            }

            public void setStroke(Stroke stroke) {
                float strokeWidth = ((BasicStroke) stroke).getLineWidth();
                int endCap = ((BasicStroke) stroke).getEndCap();
                int lineJoin = ((BasicStroke) stroke).getLineJoin();
                float miterLimit = ((BasicStroke) stroke).getMiterLimit();

                float[] dash = ((BasicStroke) stroke).getDashArray();
                float dash_phase = ((BasicStroke) stroke).getDashPhase();

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
                printWriter.println("gTiled" + languageRenderer.startSetterAssignment("stroke")
                        + languageRenderer.getObjectCreation("BasicStroke")
                        + "(" + strokeWidth + "f," + endCap + "," + lineJoin + "," + miterLimit
                        + "f," + dashRep + "," + dash_phase + "f)"
                        + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
            }

            @Override
            public Shape getClip() {
                return this.clip;
            }

            @Override
            public void setClip(Shape clip) {
                this.clip = clip;
            }

            @Override
            public void setClip(int x, int y, int width, int height) {
                this.clip = new Rectangle2D.Double(x, y, width, height);
            }

            @Override
            public void clip(Shape s) {
                if (this.clip == null) {
                    this.clip = s;
                } else {
                    Area current = new Area(this.clip);
                    Area requested = new Area(s);
                    current.intersect(requested);
                    this.clip = current;
                }
            }

            @Override
            public void clipRect(int x, int y, int width, int height) {
                this.clip(new Rectangle.Double(x, y, width, height));
            }

            @Override
            public void setRenderingHints(Map<?, ?> hints) {
                this.hints.clear();
                this.hints.putAll(hints);
            }

            @Override
            public void addRenderingHints(Map<?, ?> hints) {
                this.hints.putAll(hints);
            }

            @Override
            public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {
                this.hints.put(hintKey, hintValue);
            }

            public Object getRenderingHint(RenderingHints.Key key) {
                return this.hints.get(key);
            }

            @Override
            public RenderingHints getRenderingHints() {
                return this.hints;
            }

            @Override
            public void setTransform(AffineTransform transform) {
                this.transform = transform;
//                double[] transfMatrix = new double[6];
//                transform.getMatrix(transfMatrix);
//                printWriter
//                        .println("gTiled.setTransform(" + languageRenderer.getObjectCreation
//                        ("AffineTransform")
//                                + "(" + transfMatrix[0] + "f, " + transfMatrix[1] + "f, "
//                                + transfMatrix[2] + "f, " + transfMatrix[3] + "f, " +
//                                transfMatrix[4]
//                                + "f, " + transfMatrix[5] + "f))" + languageRenderer
//                                .getStatementEnd());
            }

            @Override
            public void transform(AffineTransform Tx) {
                this.transform.concatenate(Tx);
//                double[] transfMatrix = new double[6];
//                transform.getMatrix(transfMatrix);
//                printWriter
//                        .println("gTiled.transform(" + languageRenderer.getObjectCreation
//                        ("AffineTransform")
//                                + "(" + transfMatrix[0] + "f, " + transfMatrix[1] + "f, "
//                                + transfMatrix[2] + "f, " + transfMatrix[3] + "f, " +
//                                transfMatrix[4]
//                                + "f, " + transfMatrix[5] + "f))" + languageRenderer
//                                .getStatementEnd());
            }

            @Override
            public void translate(int x, int y) {
                this.transform.translate(x, y);
//                printWriter.println("gTiled.translate(" + x + ", " + y + ")"
//                        + languageRenderer.getStatementEnd());
            }

            @Override
            public void translate(double tx, double ty) {
                this.transform.translate(tx, ty);
//                printWriter.println("gTiled.translate(" + tx + ", " + ty + ")"
//                        + languageRenderer.getStatementEnd());
            }

            @Override
            public void rotate(double theta) {
                this.transform.rotate(theta);
//                printWriter.println("gTiled.rotate(" + theta + ")"
//                        + languageRenderer.getStatementEnd());
            }

            @Override
            public void rotate(double theta, double x, double y) {
                this.transform.rotate(theta, x, y);
//                printWriter.println("gTiled.rotate(" + theta + ", " + x + ", " + y + ")"
//                        + languageRenderer.getStatementEnd());
            }

            @Override
            public AffineTransform getTransform() {
                return this.transform;
            }

            @Override
            public Composite getComposite() {
                return this.composite;
            }

            @Override
            public GraphicsConfiguration getDeviceConfiguration() {
                return null;
            }
        });

        printWriter.println(
                "            gTiled.translate(-startX, -startY)" + languageRenderer.getStatementEnd());
        printWriter.println(
                "            startY += rect2D.getHeight()" + languageRenderer.getStatementEnd());
        printWriter.println(
                "            src.setLocation(startX, startY)" + languageRenderer.getStatementEnd());
        printWriter.println(
                "            tTiled.transform(src, dst)" + languageRenderer.getStatementEnd());
        printWriter.println("            if (dst.getY() > shape.getBounds().getMaxY()) {");
        printWriter.println("                break" + languageRenderer.getStatementEnd());
        printWriter.println("            }");
        printWriter.println("        }");

        printWriter.println(
                "        startX += rect2D.getWidth()" + languageRenderer.getStatementEnd());
        printWriter.println(
                "        src.setLocation(startX, startY)" + languageRenderer.getStatementEnd());
        printWriter.println(
                "        tTiled.transform(src, dst)" + languageRenderer.getStatementEnd());
        printWriter.println("        if (dst.getX() > shape.getBounds().getMaxX()) {");
        printWriter.println("            break" + languageRenderer.getStatementEnd());
        printWriter.println("        }");
        printWriter.println("    }");
        printWriter.println("    gTiled.dispose()" + languageRenderer.getStatementEnd());
        printWriter.println("}");

        // Restore the original (pre-pattern) clip
        printWriter.println("g.setClip(clip)" + languageRenderer.getStatementEnd());
    }

    /**
     * Transcodes the specified radial gradient paint.
     *
     * @param paint Radial gradient paint.
     * @throws IllegalArgumentException if the fractions are not strictly increasing.
     */
    private void transcodeRadialGradientPaint(RadialGradientPaint paint)
            throws IllegalArgumentException {
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
    }

    /**
     * Transcodes the specified paint.
     *
     * @param paint Paint.
     * @throws UnsupportedOperationException if the paint is unsupported.
     */
    private void transcodePaint(Paint paint) throws UnsupportedOperationException {
        if (paint instanceof PatternPaint) {
            transcodePatternPaint((PatternPaint) paint);
            return;
        }
        if (paint instanceof RadialGradientPaint) {
            transcodeRadialGradientPaint((RadialGradientPaint) paint);
            return;
        }
        if (paint instanceof LinearGradientPaint) {
            transcodeLinearGradientPaint((LinearGradientPaint) paint);
            return;
        }
        if (paint instanceof Color) {
            Color c = (Color) paint;
            printWriter.println("paint = " + languageRenderer.getObjectCreation("Color") + "("
                    + c.getRed() + ", " + c.getGreen() + ", " + c.getBlue() + ", " + c.getAlpha()
                    + ")" + languageRenderer.getStatementEnd());
            return;
        }
        if (paint == null) {
            printWriter.println("No paint");
            return;
        }

        throw new UnsupportedOperationException(paint.getClass().getCanonicalName());
    }

    /**
     * Transcodes the specified paint.
     *
     * @param paint Paint.
     * @throws UnsupportedOperationException if the paint is unsupported.
     */
    private void transcodePaintAndFill(Paint paint) throws UnsupportedOperationException {
        if (paint instanceof PatternPaint) {
            transcodePatternPaint((PatternPaint) paint);
            return;
        }
        if (paint instanceof RadialGradientPaint) {
            transcodeRadialGradientPaint((RadialGradientPaint) paint);
            printWriter.println("g" + languageRenderer.startSetterAssignment("paint") + "paint"
                    + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
            printWriter.println("g.fill(shape)" + languageRenderer.getStatementEnd());
            return;
        }
        if (paint instanceof LinearGradientPaint) {
            transcodeLinearGradientPaint((LinearGradientPaint) paint);
            printWriter.println("g" + languageRenderer.startSetterAssignment("paint") + "paint"
                    + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
            printWriter.println("g.fill(shape)" + languageRenderer.getStatementEnd());
            return;
        }
        if (paint instanceof Color) {
            Color c = (Color) paint;
            printWriter.println("paint = " + languageRenderer.getObjectCreation("Color") + "("
                    + c.getRed() + ", " + c.getGreen() + ", " + c.getBlue() + ", " + c.getAlpha()
                    + ")" + languageRenderer.getStatementEnd());
            printWriter.println("g" + languageRenderer.startSetterAssignment("paint") + "paint"
                    + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
            printWriter.println("g.fill(shape)" + languageRenderer.getStatementEnd());
            return;
        }
        if (paint == null) {
            throw new UnsupportedOperationException("No paint");
        }

        throw new UnsupportedOperationException(paint.getClass().getCanonicalName());
    }

    /**
     * Transcodes the specified shape painter.
     *
     * @param painter Shape painter.
     * @throws UnsupportedOperationException if the shape painter is unsupported.
     */
    private void transcodeShapePainter(ShapePainter painter, Shape shape, String comment)
            throws UnsupportedOperationException {
        if (painter == null)
            return;
        if (painter instanceof CompositeShapePainter) {
            transcodeCompositeShapePainter((CompositeShapePainter) painter, shape, comment);
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
        if (painter instanceof MarkerShapePainter) {
            transcodeMarkerShapePainter((MarkerShapePainter) painter, shape, comment);
            return;
        }
        throw new UnsupportedOperationException(painter.getClass().getCanonicalName());
    }

    /**
     * Transcodes the specified composite shape painter.
     *
     * @param painter Composite shape painter.
     */
    private void transcodeCompositeShapePainter(CompositeShapePainter painter, Shape shape,
            String comment) {
        for (int i = 0; i < painter.getShapePainterCount(); i++) {
            transcodeShapePainter(painter.getShapePainter(i), shape, comment);
        }
    }

    /**
     * Transcodes the specified fill shape painter.
     *
     * @param painter Fill shape painter.
     */
    private void transcodeFillShapePainter(FillShapePainter painter) {
        Paint paint = painter.getPaint();
        if (paint == null) {
            return;
        }
        transcodeShape(painter.getShape(), "");
        transcodePaintAndFill(paint);
    }

    /**
     * Transcodes the specified stroke shape painter.
     *
     * @param painter Stroke shape painter.
     */
    private void transcodeStrokeShapePainter(StrokeShapePainter painter) {
        Shape shape = painter.getShape();
        Paint paint = painter.getPaint();
        if (paint == null) {
            return;
        }
        transcodePaint(paint);
        Stroke stroke = painter.getStroke();

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

        transcodeShape(shape, "");
        printWriter.println("g" + languageRenderer.startSetterAssignment("paint") + "paint"
                + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
        printWriter.println("g" + languageRenderer.startSetterAssignment("stroke") + "stroke"
                + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
        printWriter.println("g.draw(shape)" + languageRenderer.getStatementEnd());
    }

    /**
     * Transcodes the specified marker shape painter.
     *
     * @param painter Marker shape painter.
     */
    private void transcodeMarkerShapePainter(MarkerShapePainter painter, Shape shape,
            String comment) {
        // Get all the shape points by flattening it into PathIterator
        PathIterator pathIterator = shape.getPathIterator(null);
        List<Point2D> pathPoints = new ArrayList<>();
        float[] coords = new float[6];
        for (; !pathIterator.isDone(); pathIterator.next()) {
            int type = pathIterator.currentSegment(coords);
            switch (type) {
                case PathIterator.SEG_CUBICTO:
                    pathPoints.add(new Point2D.Float(coords[4], coords[5]));
                    break;
                case PathIterator.SEG_QUADTO:
                    pathPoints.add(new Point2D.Float(coords[2], coords[3]));
                    break;
                case PathIterator.SEG_MOVETO:
                case PathIterator.SEG_LINETO:
                    pathPoints.add(new Point2D.Float(coords[0], coords[1]));
                    break;
            }
        }

        int pathPointCount = pathPoints.size();

        // Transcode the start marker if it's there. This only applies to the first point.
        if (painter.getStartMarker() != null) {
            Point2D firstPoint = pathPoints.get(0);
            Marker startMarker = painter.getStartMarker();
            double dx = firstPoint.getX() - startMarker.getRef().getX();
            double dy = firstPoint.getY() - startMarker.getRef().getY();
            printWriter.println("g.translate(" + dx + ", " + dy + ")"
                    + languageRenderer.getStatementEnd());
            rotate(startMarker.getOrient());
            transcodeGraphicsNode(startMarker.getMarkerNode(), comment + "_" + "m0");
            rotate(-startMarker.getOrient());
            printWriter.println("g.translate(" + (-dx) + ", " + (-dy) + ")"
                    + languageRenderer.getStatementEnd());
        }

        // Transcode the middle marker if it's there. This only applies to the points between
        // the first and the last.
        if (painter.getMiddleMarker() != null) {
            if (pathPointCount > 2) {
                Marker middleMarker = painter.getMiddleMarker();
                for (int i = 1; i < pathPointCount - 1; i++) {
                    Point2D middlePoint = pathPoints.get(i);
                    double dx = middlePoint.getX() - middleMarker.getRef().getX();
                    double dy = middlePoint.getY() - middleMarker.getRef().getY();
                    printWriter.println("g.translate(" + dx + ", " + dy + ")"
                            + languageRenderer.getStatementEnd());
                    rotate(middleMarker.getOrient());
                    transcodeGraphicsNode(middleMarker.getMarkerNode(), comment + "_" + "m" + i);
                    rotate(-middleMarker.getOrient());
                    printWriter.println("g.translate(" + (-dx) + ", " + (-dy) + ")"
                            + languageRenderer.getStatementEnd());
                }
            }
        }

        // Transcode the end marker if it's there. This only applies to the last point.
        if (painter.getEndMarker() != null) {
            Point2D lastPoint = pathPoints.get(pathPointCount - 1);
            Marker endMarker = painter.getEndMarker();
            double dx = lastPoint.getX() - endMarker.getRef().getX();
            double dy = lastPoint.getY() - endMarker.getRef().getY();
            printWriter.println("g.translate(" + dx + ", " + dy + ")"
                    + languageRenderer.getStatementEnd());
            rotate(endMarker.getOrient());
            transcodeGraphicsNode(endMarker.getMarkerNode(),
                    comment + "_" + "m" + (pathPointCount - 1));
            rotate(-endMarker.getOrient());
            printWriter.println("g.translate(" + (-dx) + ", " + (-dy) + ")"
                    + languageRenderer.getStatementEnd());
        }
    }

    private void rotate(double angle) {
        if (Double.isFinite(angle) && angle != 0.0) {
            printWriter.println("g.rotate(" + angle + ")" + languageRenderer.getStatementEnd());
        }
    }

    /**
     * Transcodes the specified shape node.
     *
     * @param node    Shape node.
     * @param comment Comment (for associating the Java2D section with the corresponding SVG
     *                section).
     */
    private void transcodeShapeNode(ShapeNode node, String comment) {
        printWriter.println("// " + comment);
        transcodeShapePainter(node.getShapePainter(), node.getShape(), comment);
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
        int count = 0;
        for (Object obj : node.getChildren()) {
            transcodeGraphicsNode((GraphicsNode) obj, comment + "_" + count);
            count++;
        }
    }

    private void transcodeRenderedImage(RenderedImage image, String graphicsName) {
        String md5 = RasterScanner.getMD5(image);

        printWriter.println(languageRenderer.startVariableDefinition("BufferedImage")
                + "image" + md5 + "=getImage" + md5 + "()" + languageRenderer.getStatementEnd());
        printWriter.println("if (image" + md5 + " != null) {");
        printWriter.println("    " + graphicsName + ".drawImage(image" + md5 + ", 0, 0, null)"
                + languageRenderer.getStatementEnd());
        printWriter.println("}");
    }

    private void transcodeRasterImageNode(RasterImageNode node, String comment) {
        printWriter.println("// " + comment);

        RenderedImage image = node.getImage().createDefaultRendering();
        transcodeRenderedImage(image, "g");
    }

    private void transcodeTextNode(TextNode node, String comment) {
        printWriter.println("{");
        // Create a new Graphics2D object
        printWriter.println("    " + languageRenderer.startVariableDefinition("Graphics2D")
                + "gText = " + languageRenderer.getObjectCast("g.create()", "Graphics2D")
                + languageRenderer.getStatementEnd());
        printWriter.println("            " + languageRenderer.startVariableDefinition("Shape")
                + "shapeText = null" + languageRenderer.getStatementEnd());

        node.primitivePaint(new McCrashyGraphics2D() {
            private Shape clip;
            private RenderingHints hints = new RenderingHints(new HashMap<>());
            private AffineTransform transform = new AffineTransform();
            private Composite composite;

            @Override
            public Graphics create() {
                return this;
            }

            @Override
            public void dispose() {
            }

            public void draw(Shape shape) {
                transcodeShape(shape, "Text");
                printWriter.println("gText.draw(shapeText);");
            }

            public void fill(Shape shape) {
                transcodeShape(shape, "Text");
                printWriter.println("gText.fill(shapeText);");
            }

            public void setComposite(Composite composite) {
                this.composite = composite;
                int rule = ((AlphaComposite) composite).getRule();
                float alpha = ((AlphaComposite) composite).getAlpha();
                printWriter.println("gText" + languageRenderer.startSetterAssignment("composite")
                        + "AlphaComposite.getInstance(" + rule + ", " + alpha + "f * origAlpha)"
                        + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
            }

            public void setPaint(Paint paint) {
                transcodePaint(paint);
                printWriter.println(
                        "gText" + languageRenderer.startSetterAssignment("paint") + "paint"
                                + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
            }

            public void setStroke(Stroke stroke) {
                float strokeWidth = ((BasicStroke) stroke).getLineWidth();
                int endCap = ((BasicStroke) stroke).getEndCap();
                int lineJoin = ((BasicStroke) stroke).getLineJoin();
                float miterLimit = ((BasicStroke) stroke).getMiterLimit();

                float[] dash = ((BasicStroke) stroke).getDashArray();
                float dash_phase = ((BasicStroke) stroke).getDashPhase();

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
                printWriter.println("gText" + languageRenderer.startSetterAssignment("stroke")
                        + languageRenderer.getObjectCreation("BasicStroke")
                        + "(" + strokeWidth + "f," + endCap + "," + lineJoin + "," + miterLimit
                        + "f," + dashRep + "," + dash_phase + "f)"
                        + languageRenderer.endSetterAssignment() + languageRenderer.getStatementEnd());
            }

            @Override
            public Shape getClip() {
                return this.clip;
            }

            @Override
            public void setClip(Shape clip) {
                this.clip = clip;
            }

            @Override
            public void setClip(int x, int y, int width, int height) {
                this.clip = new Rectangle2D.Double(x, y, width, height);
            }

            @Override
            public void clip(Shape s) {
                if (this.clip == null) {
                    this.clip = s;
                } else {
                    Area current = new Area(this.clip);
                    Area requested = new Area(s);
                    current.intersect(requested);
                    this.clip = current;
                }
            }

            @Override
            public void clipRect(int x, int y, int width, int height) {
                this.clip(new Rectangle.Double(x, y, width, height));
            }

            @Override
            public void setRenderingHints(Map<?, ?> hints) {
                this.hints.clear();
                this.hints.putAll(hints);
            }

            @Override
            public void addRenderingHints(Map<?, ?> hints) {
                this.hints.putAll(hints);
            }

            @Override
            public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {
                this.hints.put(hintKey, hintValue);
            }

            public Object getRenderingHint(RenderingHints.Key key) {
                return this.hints.get(key);
            }

            @Override
            public RenderingHints getRenderingHints() {
                return this.hints;
            }

            @Override
            public void setTransform(AffineTransform transform) {
                this.transform = transform;
//                double[] transfMatrix = new double[6];
//                transform.getMatrix(transfMatrix);
//                printWriter
//                        .println("gTiled.setTransform(" + languageRenderer.getObjectCreation
//                        ("AffineTransform")
//                                + "(" + transfMatrix[0] + "f, " + transfMatrix[1] + "f, "
//                                + transfMatrix[2] + "f, " + transfMatrix[3] + "f, " +
//                                transfMatrix[4]
//                                + "f, " + transfMatrix[5] + "f))" + languageRenderer
//                                .getStatementEnd());
            }

            @Override
            public void transform(AffineTransform Tx) {
                this.transform.concatenate(Tx);
//                double[] transfMatrix = new double[6];
//                transform.getMatrix(transfMatrix);
//                printWriter
//                        .println("gTiled.transform(" + languageRenderer.getObjectCreation
//                        ("AffineTransform")
//                                + "(" + transfMatrix[0] + "f, " + transfMatrix[1] + "f, "
//                                + transfMatrix[2] + "f, " + transfMatrix[3] + "f, " +
//                                transfMatrix[4]
//                                + "f, " + transfMatrix[5] + "f))" + languageRenderer
//                                .getStatementEnd());
            }

            @Override
            public void translate(int x, int y) {
                this.transform.translate(x, y);
//                printWriter.println("gTiled.translate(" + x + ", " + y + ")"
//                        + languageRenderer.getStatementEnd());
            }

            @Override
            public void translate(double tx, double ty) {
                this.transform.translate(tx, ty);
//                printWriter.println("gTiled.translate(" + tx + ", " + ty + ")"
//                        + languageRenderer.getStatementEnd());
            }

            @Override
            public void rotate(double theta) {
                this.transform.rotate(theta);
//                printWriter.println("gTiled.rotate(" + theta + ")"
//                        + languageRenderer.getStatementEnd());
            }

            @Override
            public void rotate(double theta, double x, double y) {
                this.transform.rotate(theta, x, y);
//                printWriter.println("gTiled.rotate(" + theta + ", " + x + ", " + y + ")"
//                        + languageRenderer.getStatementEnd());
            }

            @Override
            public AffineTransform getTransform() {
                return this.transform;
            }

            @Override
            public Composite getComposite() {
                return this.composite;
            }

            @Override
            public GraphicsConfiguration getDeviceConfiguration() {
                return null;
            }
        });
        printWriter.println("    gText.dispose()" + languageRenderer.getStatementEnd());
        printWriter.println("}");
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
            if (node instanceof RasterImageNode) {
                transcodeRasterImageNode((RasterImageNode) node, comment);
                return;
            }
            if (node instanceof TextNode) {
                transcodeTextNode((TextNode) node, comment);
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

