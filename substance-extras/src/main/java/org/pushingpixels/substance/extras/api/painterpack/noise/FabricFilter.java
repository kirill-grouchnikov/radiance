/*
 * Copyright (c) 2005-2019 Substance Kirill Grouchnikov. All Rights Reserved.
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

import java.util.LinkedList;

/**
 * Noise filter that produces fabric-like distribution. This filter contains a
 * collection of links, each one with its own orientation. Using a combination
 * of filter links it's possible to create a composite complex fabric effect.
 * This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class FabricFilter implements NoiseFilter {
	/**
	 * Fabric links.
	 */
	protected LinkedList<FabricFilterLink> links;

	/**
	 * A single fabric link.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static class FabricFilterLink extends BaseNoiseFilter {
		/**
		 * Creates a new fabric link.
		 * 
		 * @param xFactor
		 *            Stretch factor for X axis.
		 * @param yFactor
		 *            Stretch factor for Y axis.
		 * @param zFactor
		 *            Stretch factor for Z axis.
		 * @param valueFactor
		 *            Stretch factor for value.
		 * @param trigKind
		 *            Trigonometry function.
		 */
		public FabricFilterLink(double xFactor, double yFactor, double zFactor,
				double valueFactor, TrigKind trigKind) {
			super(xFactor, yFactor, zFactor, valueFactor, trigKind);
		}

		/**
		 * Creates a new fabric link oriented along X axis.
		 * 
		 * @param xFactor
		 *            Stretch factor for X axis.
		 * @param valueFactor
		 *            Stretch factor for value.
		 * @param trigKind
		 *            Trigonometry function.
		 * @return Fabric link oriented along X axis.
		 */
		public static FabricFilterLink getXLink(double xFactor,
				double valueFactor, TrigKind trigKind) {
			return new FabricFilterLink(xFactor, 0.0, 0.0, valueFactor,
					trigKind);
		}

		/**
		 * Creates a new fabric link oriented along Y axis.
		 * 
		 * @param yFactor
		 *            Stretch factor for Y axis.
		 * @param valueFactor
		 *            Stretch factor for value.
		 * @param trigKind
		 *            Trigonometry function.
		 * @return Fabric link oriented along Y axis.
		 */
		public static FabricFilterLink getYLink(double yFactor,
				double valueFactor, TrigKind trigKind) {
			return new FabricFilterLink(0.0, yFactor, 0.0, valueFactor,
					trigKind);
		}

		/**
		 * Creates a new fabric link oriented along Z axis.
		 * 
		 * @param zFactor
		 *            Stretch factor for Z axis.
		 * @param valueFactor
		 *            Stretch factor for value.
		 * @param trigKind
		 *            Trigonometry function.
		 * @return Fabric link oriented along Z axis.
		 */
		public static FabricFilterLink getZLink(double zFactor,
				double valueFactor, TrigKind trigKind) {
			return new FabricFilterLink(0.0, 0.0, zFactor, valueFactor,
					trigKind);
		}

		@Override
		public double apply(double x, double y, double z, double origValue) {
			double trans = this.xFactor * x + this.yFactor * y + this.zFactor
					* z + this.valueFactor * origValue;
			double trig = (this.trigKind == TrigKind.COSINE) ? Math.cos(trans)
					: Math.sin(trans);
			return trig;
		}
	}

	/**
	 * Creates fabric filter.
	 * 
	 * @param links
	 *            Fabric links.
	 */
	public FabricFilter(FabricFilterLink... links) {
		this.links = new LinkedList<FabricFilterLink>();
		for (FabricFilterLink link : links) {
			this.links.add(link);
		}
	}

	@Override
	public double apply(double x, double y, double z, double origValue) {
		double val = 1.0;
		for (FabricFilterLink link : this.links)
			val *= link.apply(x, y, z, origValue);
		return 0.5 + 0.5 * val;
	}
}
