/*
 * Copyright (c) 2005-2018 Ibis Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Ibis Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.ibis.transcoder;

import java.io.BufferedInputStream;
import java.io.InputStream;

import org.apache.batik.gvt.GraphicsNode;
import org.apache.batik.transcoder.SVGAbstractTranscoder;
import org.apache.batik.transcoder.TranscoderInput;

/**
 * SVG to Java2D transcoder.
 * 
 * @author Kirill Grouchnikov.
 */
public class SvgStreamTranscoder extends SvgBaseTranscoder {
    public static class RawTranscoder extends SVGAbstractTranscoder {
        public GraphicsNode getGVTRoot() {
            return this.root;
        }
    }

    /**
     * Input stream of the SVG image.
     */
    protected InputStream is;

    /**
     * Creates a new transcoder.
     * 
     * @param is
     *            Input stream of the SVG image.
     * @param classname
     *            Classname for the generated Java2D code.
     */
    public SvgStreamTranscoder(InputStream is, String classname,
            LanguageRenderer languageRenderer) {
        super(classname, languageRenderer);
        this.is = is;
    }

    /**
     * Transcodes the SVG image into Java2D code. Does nothing if the {@link #listener} is
     * <code>null</code>.
     */
    public void transcode(InputStream templateStream) {
        if (this.externalPrintWriter == null)
            return;

        // SvgStreamCanvas canvas = new SvgStreamCanvas();
        RawTranscoder transcoder = new RawTranscoder();
        BufferedInputStream bis = new BufferedInputStream(is);
        TranscoderInput ti = new TranscoderInput(bis);

        try {
            transcoder.transcode(ti, null);
            this.transcode(transcoder.getGVTRoot(), templateStream);
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            this.externalPrintWriter.close();
        }
    }
}
