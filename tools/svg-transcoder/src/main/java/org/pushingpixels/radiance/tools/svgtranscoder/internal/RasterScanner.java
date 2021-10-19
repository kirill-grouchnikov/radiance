/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.tools.svgtranscoder.internal;

import org.apache.batik.bridge.SVGPatternElementBridge;
import org.apache.batik.gvt.*;
import org.pushingpixels.radiance.tools.svgtranscoder.api.LanguageRenderer;
import org.pushingpixels.radiance.tools.svgtranscoder.internal.graphics.McStableGraphics2D;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;

public class RasterScanner {
    private PrintWriter printWriter;

    private LanguageRenderer languageRenderer;

    private Set<String> processedMD5s = new HashSet<>();

    public RasterScanner(PrintWriter printWriter, LanguageRenderer languageRenderer) {
        this.printWriter = printWriter;
        this.languageRenderer = languageRenderer;
    }

    /**
     * Scans the SVG image for raster content
     *
     * @param gvtRoot Graphics vector tree root.
     */
    public void scan(GraphicsNode gvtRoot) {
        scanGraphicsNode(gvtRoot);
    }

    public boolean hasRasters() {
        return !this.processedMD5s.isEmpty();
    }

    private void scanPatternPaint(PatternPaint paint) {
        // Since PatternGraphicsNode does not (yet?) expose its content, we ask it to
        // paint itself to a custom extension of Graphics2D that tracks image draw operations
        // and transcodes the image to a base64-string + code that decodes that string back
        // to image content at runtime
        SVGPatternElementBridge.PatternGraphicsNode pgn =
                (SVGPatternElementBridge.PatternGraphicsNode) paint.getGraphicsNode();
        pgn.primitivePaint(new McStableGraphics2D() {
            @Override
            public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
                transcodeRenderedImage((RenderedImage) img);
                return false;
            }
        });
    }

    /**
     * Scans the specified paint.
     *
     * @param paint Paint.
     * @throws UnsupportedOperationException if the paint is unsupported.
     */
    private void scanPaint(Paint paint) throws UnsupportedOperationException {
        if (paint instanceof PatternPaint) {
            scanPatternPaint((PatternPaint) paint);
        }
    }

    /**
     * Scans the specified shape painter.
     *
     * @param painter Shape painter.
     * @throws UnsupportedOperationException if the shape painter is unsupported.
     */
    private void scanShapePainter(ShapePainter painter) throws UnsupportedOperationException {
        if (painter == null) {
            return;
        }
        if (painter instanceof CompositeShapePainter) {
            scanCompositeShapePainter((CompositeShapePainter) painter);
            return;
        }
        if (painter instanceof FillShapePainter) {
            scanFillShapePainter((FillShapePainter) painter);
            return;
        }
        if (painter instanceof StrokeShapePainter) {
            scanStrokeShapePainter((StrokeShapePainter) painter);
            return;
        }
        if (painter instanceof MarkerShapePainter) {
            scanMarkerShapePainter((MarkerShapePainter) painter);
            return;
        }
        throw new UnsupportedOperationException(painter.getClass().getCanonicalName());
    }

    /**
     * Scans the specified composite shape painter.
     *
     * @param painter Composite shape painter.
     */
    private void scanCompositeShapePainter(CompositeShapePainter painter) {
        // offset(offset);
        // printWriter.println("CompositeShapePainter");
        for (int i = 0; i < painter.getShapePainterCount(); i++) {
            scanShapePainter(painter.getShapePainter(i));
        }
    }

    /**
     * Scans the specified fill shape painter.
     *
     * @param painter Fill shape painter.
     */
    private void scanFillShapePainter(FillShapePainter painter) {
        Paint paint = painter.getPaint();
        if (paint == null) {
            return;
        }
        scanPaint(paint);
    }

    /**
     * Scans the specified stroke shape painter.
     *
     * @param painter Stroke shape painter.
     */
    private void scanStrokeShapePainter(StrokeShapePainter painter) {
        Paint paint = painter.getPaint();
        if (paint == null) {
            return;
        }
        scanPaint(paint);
    }

    /**
     * Scans the specified marker shape painter.
     *
     * @param painter Marker shape painter.
     */
    private void scanMarkerShapePainter(MarkerShapePainter painter) {
        Marker start = painter.getStartMarker();
        if (start != null) {
            scanGraphicsNode(start.getMarkerNode());
        }
        Marker middle = painter.getMiddleMarker();
        if (middle != null) {
            scanGraphicsNode(middle.getMarkerNode());
        }
        Marker end = painter.getEndMarker();
        if (end != null) {
            scanGraphicsNode(end.getMarkerNode());
        }
    }

    /**
     * Scans the specified shape node.
     *
     * @param node    Shape node.
     */
    private void scanShapeNode(ShapeNode node) {
        ShapePainter sPainter = node.getShapePainter();
        scanShapePainter(sPainter);
    }

    /**
     * Scans the specified composite graphics node.
     *
     * @param node    Composite graphics node.
     */
    private void scanCompositeGraphicsNode(CompositeGraphicsNode node) {
        for (Object obj : node.getChildren()) {
            scanGraphicsNode((GraphicsNode) obj);
        }
    }

    private void transcodeRenderedImage(RenderedImage image) {
        String md5 = getMD5(image);
        if (this.processedMD5s.contains(md5)) {
            // Already transcoded
            return;
        }

        // Static WeakReference to the decoded image
        printWriter.println("private static WeakReference<BufferedImage> image" + md5 + ";");

        // Static method that returns a BufferedImage
        printWriter.println("private static BufferedImage getImage" + md5 + "() {");
        printWriter.println("    BufferedImage result = (image" + md5 + " != null)");
        printWriter.println("        ? image" + md5 + ".get() : null;");
        printWriter.println("    if (result != null) {");
        printWriter.println("        return result;");
        printWriter.println("    }");

        // Encode image content as a single base-64 string
        String encoded = convertToBase64String(image);
        // Work around compile-time limitations on how long a String can be in the source file
        // by splitting the full base64 encoding into chunks of 1000 characters
        printWriter.println("    " + languageRenderer.startVariableDefinition("StringBuilder")
                + "imageData = " + languageRenderer.getObjectCreation("StringBuilder")
                + "(" + encoded.length() + ")" + languageRenderer.getStatementEnd());
        int imageDataStart = 0;
        while (true) {
            int chunkLength = Math.min(1000, encoded.length() - imageDataStart);
            printWriter.println("    imageData.append(\""
                    + encoded.substring(imageDataStart, imageDataStart + chunkLength)
                    + "\")" + languageRenderer.getStatementEnd());
            imageDataStart += 1000;
            if (imageDataStart > encoded.length()) {
                break;
            }
        }

        printWriter.println("    try {");
        printWriter.println(
                "        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));");
        printWriter.println("        image" + md5 + " = new WeakReference<>(result);");
        printWriter.println("        return result;");
        printWriter.println("    } catch (IOException ioe) {");
        printWriter.println("    }");
        printWriter.println("    return null;");
        printWriter.println("}");

        this.processedMD5s.add(md5);
    }

    private void scanRasterImageNode(RasterImageNode node) {
        RenderedImage image = node.getImage().createDefaultRendering();
        transcodeRenderedImage(image);
    }

    /**
     * Scans the specified graphics node.
     *
     * @param node    Graphics node.
     * @throws UnsupportedOperationException if the graphics node is unsupported.
     */
    private void scanGraphicsNode(GraphicsNode node)
            throws UnsupportedOperationException {
        if (node instanceof ShapeNode) {
            scanShapeNode((ShapeNode) node);
            return;
        }
        if (node instanceof CompositeGraphicsNode) {
            scanCompositeGraphicsNode((CompositeGraphicsNode) node);
            return;
        }
        if (node instanceof RasterImageNode) {
            scanRasterImageNode((RasterImageNode) node);
            return;
        }
    }

    private static String convertToBase64String(RenderedImage renderedImage) {
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(renderedImage, "png", Base64.getEncoder().wrap(os));
            return os.toString(StandardCharsets.ISO_8859_1.name());
        } catch (final IOException ioe) {
            throw new UncheckedIOException(ioe);
        }
    }

    public static String getMD5(RenderedImage renderedImage) {
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(renderedImage, "png", Base64.getEncoder().wrap(os));
            MessageDigest md5Digest = MessageDigest.getInstance("MD5");
            md5Digest.update(os.toByteArray());
            byte[] digest = md5Digest.digest();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                result.append(Integer.toString((digest[i] & 0xff) + 0x100, 16).substring(1));
            }
            return result.toString();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
}


