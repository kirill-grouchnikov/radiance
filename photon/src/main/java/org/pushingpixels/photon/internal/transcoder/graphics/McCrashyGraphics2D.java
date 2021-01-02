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
package org.pushingpixels.photon.internal.transcoder.graphics;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.AffineTransform;
import java.awt.image.*;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class McCrashyGraphics2D extends Graphics2D {
    @Override
    public void draw(Shape s) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawRenderedImage(RenderedImage img, AffineTransform xform) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawRenderableImage(RenderableImage img, AffineTransform xform) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawString(String str, int x, int y) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawString(String str, float x, float y) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawString(AttributedCharacterIterator iterator, int x, int y) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawString(AttributedCharacterIterator iterator, float x, float y) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawGlyphVector(GlyphVector g, float x, float y) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void fill(Shape s) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public GraphicsConfiguration getDeviceConfiguration() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setComposite(Composite comp) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setPaint(Paint paint) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setStroke(Stroke s) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Object getRenderingHint(RenderingHints.Key hintKey) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setRenderingHints(Map<?, ?> hints) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void addRenderingHints(Map<?, ?> hints) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public RenderingHints getRenderingHints() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void translate(int x, int y) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void translate(double tx, double ty) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void rotate(double theta) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void rotate(double theta, double x, double y) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void scale(double sx, double sy) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void shear(double shx, double shy) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void transform(AffineTransform Tx) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setTransform(AffineTransform Tx) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public AffineTransform getTransform() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Paint getPaint() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Composite getComposite() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setBackground(Color color) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Color getBackground() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Stroke getStroke() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void clip(Shape s) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public FontRenderContext getFontRenderContext() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Graphics create() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Color getColor() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setColor(Color c) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setPaintMode() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setXORMode(Color c1) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Font getFont() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setFont(Font font) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public FontMetrics getFontMetrics(Font f) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Rectangle getClipBounds() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void clipRect(int x, int y, int width, int height) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setClip(int x, int y, int width, int height) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Shape getClip() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void setClip(Shape clip) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void copyArea(int x, int y, int width, int height, int dx, int dy) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void fillRect(int x, int y, int width, int height) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void clearRect(int x, int y, int width, int height) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawOval(int x, int y, int width, int height) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void fillOval(int x, int y, int width, int height) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean drawImage(Image img, int x, int y, int width, int height,
            ImageObserver observer) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void dispose() {
        throw new UnsupportedOperationException("This operation is not supported");
    }
}
