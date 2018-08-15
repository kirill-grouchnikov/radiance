/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.substance.extras.api.painterpack.noise;

/**
 * Noise filter that produces marble-like distribution. This class is part of
 * officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class MarbleFilter extends BaseNoiseFilter {
	/**
	 * Creates a new marble filter.
	 * 
	 * @param xFactor
	 *            Stretch factor for X axis.
	 * @param yFactor
	 *            Stretch factor for Y axis.
	 * @param zFactor
	 *            Stretch factor for Z axis.
	 * @param trigKind
	 *            Trigonometry function.
	 */
	public MarbleFilter(double xFactor, double yFactor, double zFactor,
			TrigKind trigKind) {
		super(xFactor, yFactor, zFactor, 1.0, trigKind);
	}

	/**
	 * Creates a new marble filter oriented along X axis.
	 * 
	 * @param xFactor
	 *            Stretch factor for X axis.
	 * @param trigKind
	 *            Trigonometry function.
	 * @return Marble filter oriented along X axis.
	 */
	public static MarbleFilter getXFilter(double xFactor, TrigKind trigKind) {
		return new MarbleFilter(xFactor, 0.0, 0.0, trigKind);
	}

	/**
	 * Creates a new marble filter oriented along Y axis.
	 * 
	 * @param yFactor
	 *            Stretch factor for Y axis.
	 * @param trigKind
	 *            Trigonometry function.
	 * @return Marble filter oriented along Y axis.
	 */
	public static MarbleFilter getYFilter(double yFactor, TrigKind trigKind) {
		return new MarbleFilter(0.0, yFactor, 0.0, trigKind);
	}

	/**
	 * Creates a new marble filter oriented along Z axis.
	 * 
	 * @param zFactor
	 *            Stretch factor for Z axis.
	 * @param trigKind
	 *            Trigonometry function.
	 * @return Marble filter oriented along Z axis.
	 */
	public static MarbleFilter getZFilter(double zFactor, TrigKind trigKind) {
		return new MarbleFilter(0.0, 0.0, zFactor, trigKind);
	}

	@Override
	public double apply(double x, double y, double z, double origValue) {
		double trans = this.xFactor * x + this.yFactor * y + this.zFactor * z
				+ origValue;
		double trig = (this.trigKind == TrigKind.COSINE) ? Math.cos(trans)
				: Math.sin(trans);
		return 0.5 + 0.5 * trig;
	}
}
