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

public class McStableGraphics2D extends Graphics2D {
    @Override
    public void draw(Shape s) {
    }

    @Override
    public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
        return false;
    }

    @Override
    public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {
    }

    @Override
    public void drawRenderedImage(RenderedImage img, AffineTransform xform) {
    }

    @Override
    public void drawRenderableImage(RenderableImage img, AffineTransform xform) {
    }

    @Override
    public void drawString(String str, int x, int y) {
    }

    @Override
    public void drawString(String str, float x, float y) {
    }

    @Override
    public void drawString(AttributedCharacterIterator iterator, int x, int y) {
    }

    @Override
    public void drawString(AttributedCharacterIterator iterator, float x, float y) {
    }

    @Override
    public void drawGlyphVector(GlyphVector g, float x, float y) {
    }

    @Override
    public void fill(Shape s) {
    }

    @Override
    public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
        return false;
    }

    @Override
    public GraphicsConfiguration getDeviceConfiguration() {
        return null;
    }

    @Override
    public void setComposite(Composite comp) {
    }

    @Override
    public void setPaint(Paint paint) {
    }

    @Override
    public void setStroke(Stroke s) {
    }

    @Override
    public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {
    }

    @Override
    public Object getRenderingHint(RenderingHints.Key hintKey) {
        return null;
    }

    @Override
    public void setRenderingHints(Map<?, ?> hints) {
    }

    @Override
    public void addRenderingHints(Map<?, ?> hints) {
    }

    @Override
    public RenderingHints getRenderingHints() {
        return null;
    }

    @Override
    public void translate(int x, int y) {
    }

    @Override
    public void translate(double tx, double ty) {
    }

    @Override
    public void rotate(double theta) {
    }

    @Override
    public void rotate(double theta, double x, double y) {
    }

    @Override
    public void scale(double sx, double sy) {
    }

    @Override
    public void shear(double shx, double shy) {
    }

    @Override
    public void transform(AffineTransform Tx) {
    }

    @Override
    public void setTransform(AffineTransform Tx) {
    }

    @Override
    public AffineTransform getTransform() {
        return new AffineTransform();
    }

    @Override
    public Paint getPaint() {
        return null;
    }

    @Override
    public Composite getComposite() {
        return AlphaComposite.getInstance(AlphaComposite.SRC_OVER);
    }

    @Override
    public void setBackground(Color color) {
    }

    @Override
    public Color getBackground() {
        return new Color(0x00000000);
    }

    @Override
    public Stroke getStroke() {
        return new BasicStroke();
    }

    @Override
    public void clip(Shape s) {
    }

    @Override
    public FontRenderContext getFontRenderContext() {
        return null;
    }

    @Override
    public Graphics create() {
        return this;
    }

    @Override
    public Color getColor() {
        return new Color(0x00000000);
    }

    @Override
    public void setColor(Color c) {
    }

    @Override
    public void setPaintMode() {
    }

    @Override
    public void setXORMode(Color c1) {
    }

    @Override
    public Font getFont() {
        return null;
    }

    @Override
    public void setFont(Font font) {
    }

    @Override
    public FontMetrics getFontMetrics(Font f) {
        return null;
    }

    @Override
    public Rectangle getClipBounds() {
        return null;
    }

    @Override
    public void clipRect(int x, int y, int width, int height) {
    }

    @Override
    public void setClip(int x, int y, int width, int height) {
    }

    @Override
    public Shape getClip() {
        return null;
    }

    @Override
    public void setClip(Shape clip) {
    }

    @Override
    public void copyArea(int x, int y, int width, int height, int dx, int dy) {
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
    }

    @Override
    public void fillRect(int x, int y, int width, int height) {
    }

    @Override
    public void clearRect(int x, int y, int width, int height) {
    }

    @Override
    public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
    }

    @Override
    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
    }

    @Override
    public void drawOval(int x, int y, int width, int height) {
    }

    @Override
    public void fillOval(int x, int y, int width, int height) {
    }

    @Override
    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
    }

    @Override
    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
    }

    @Override
    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
    }

    @Override
    public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
    }

    @Override
    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
    }

    @Override
    public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
        return false;
    }

    @Override
    public boolean drawImage(Image img, int x, int y, int width, int height,
            ImageObserver observer) {
        return false;
    }

    @Override
    public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
        return false;
    }

    @Override
    public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
        return false;
    }

    @Override
    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
        return false;
    }

    @Override
    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
        return false;
    }

    @Override
    public void dispose() {
    }
}
