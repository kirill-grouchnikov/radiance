/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.extras.api.watermarkpack.flamefractal;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class IteratedFunctionSystem {
	private List<IteratedFunction> functions;

	private IteratedFunction[] rotations;

	private int rotationDegree;

	private int rotIndex;

	public IteratedFunctionSystem(int rotationDegree, IteratedFunction... fs) {
		this.functions = new ArrayList<>();
		for (IteratedFunction f : fs) {
			this.functions.add(f);
		}
		this.rotationDegree = rotationDegree;
		this.rotations = new IteratedFunction[this.rotationDegree];
		switch (this.rotationDegree) {
		case 1:
			this.rotations[0] = new Functions.Rotation0Function();
			break;
		case 2:
			this.rotations[0] = new Functions.Rotation0Function();
			this.rotations[1] = new Functions.Rotation180Function();
			break;
		case 3:
			this.rotations[0] = new Functions.Rotation0Function();
			this.rotations[1] = new Functions.Rotation120Function();
			this.rotations[2] = new Functions.Rotation240Function();
			break;
		case 4:
			this.rotations[0] = new Functions.Rotation0Function();
			this.rotations[1] = new Functions.Rotation90Function();
			this.rotations[2] = new Functions.Rotation180Function();
			this.rotations[3] = new Functions.Rotation270Function();
			break;
		default:
			double delta = 2.0 * Math.PI / this.rotationDegree;
			for (int i = 0; i < this.rotationDegree; i++) {
				this.rotations[i] = new Functions.RotationFunction(delta * i);
			}
		}
	}

	protected IteratedFunction getRandom() {
		int index = (int) (this.functions.size() * Math.random());
		return this.functions.get(index);
	}

	public void apply(Point2D bc) {
		this.getRandom().apply(bc);
		if (this.rotationDegree > 1) {
			int rotRandom = (int) (Math.random() * this.rotationDegree);
			this.rotIndex++;
			if (this.rotIndex >= this.rotationDegree)
				this.rotIndex = 0;
			this.rotations[rotRandom].apply(bc);
		}
	}
}
