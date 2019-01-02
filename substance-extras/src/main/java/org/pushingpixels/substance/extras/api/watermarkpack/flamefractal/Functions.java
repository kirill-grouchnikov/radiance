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
package org.pushingpixels.substance.extras.api.watermarkpack.flamefractal;

import java.awt.geom.Point2D;

public class Functions {
	public static class LinearFunction extends AffineFunction {
		public LinearFunction(double a, double b, double c, double d, double e,
				double f) {
			super(new IteratedFunction() {
				public void apply(Point2D coord) {
				}
			}, a, b, c, d, e, f);
		}
	}

	public static class SphericalFunction extends AffineFunction {
		public SphericalFunction(double a, double b, double c, double d,
				double e, double f) {
			super(new IteratedFunction() {
				public void apply(Point2D coord) {
					double r2 = (coord.getX() * coord.getX())
							+ (coord.getY() * coord.getY());
					coord.setLocation(coord.getX() / r2, coord.getY() / r2);
				}
			}, a, b, c, d, e, f);
		}
	}

	public static class HorseShoeFunction extends AffineFunction {
		public HorseShoeFunction(double a, double b, double c, double d,
				double e, double f) {
			super(new IteratedFunction() {
				public void apply(Point2D coord) {
					double r2 = Math.min(1.0, coord.getX() * coord.getX()
							+ coord.getY() * coord.getY());
					double r = Math.sqrt(r2);
					// double theta = Math.atan2(coord.getY(), coord.getX());
					// coord.getX() = r * Math.cos(2.0 * theta);
					// coord.getY() = r * Math.sin(2.0 * theta);
					double nx = (coord.getX() * coord.getX() - coord.getY()
							* coord.getY())
							/ r;
					double ny = 2.0 * coord.getX() * coord.getY() / r;
					coord.setLocation(nx, ny);
				}
			}, a, b, c, d, e, f);
		}
	}

	public static class ExFunction extends AffineFunction {
		public ExFunction(double a, double b, double c, double d, double e,
				double f) {
			super(new IteratedFunction() {
				public void apply(Point2D coord) {
					double r2 = coord.getX() * coord.getX() + coord.getY()
							* coord.getY();
					double r = Math.min(1.0, Math.sqrt(r2));
					double theta = Math.atan2(coord.getY(), coord.getX());
					double s = Math.sin(theta + r);
					double c = Math.cos(theta - r);
					coord.setLocation(r * s * s * s, r * c * c * c);
				}
			}, a, b, c, d, e, f);
		}
	}

	public static class SwirlFunction extends AffineFunction {
		public SwirlFunction(double a, double b, double c, double d, double e,
				double f) {
			super(new IteratedFunction() {
				public void apply(Point2D coord) {
					double r2 = coord.getX() * coord.getX() + coord.getY()
							* coord.getY();
					double r = Math.min(1.0, Math.sqrt(r2));
					double theta = Math.atan2(coord.getY(), coord.getX());
					coord.setLocation(r * Math.cos(theta + r), r
							* Math.sin(theta + r));
				}
			}, a, b, c, d, e, f);
		}
	}

	public static class SpiralFunction extends AffineFunction {
		public SpiralFunction(double a, double b, double c, double d, double e,
				double f) {
			super(new IteratedFunction() {
				public void apply(Point2D coord) {
					double r2 = coord.getX() * coord.getX() + coord.getY()
							* coord.getY();
					double r = Math.min(1.0, Math.sqrt(r2));
					double theta = Math.atan2(coord.getY(), coord.getX());
					coord.setLocation((Math.cos(theta) + Math.sin(r)) / r,
							(Math.sin(theta) - Math.cos(r)) / r);
				}
			}, a, b, c, d, e, f);
		}
	}

	public static class RotationFunction implements IteratedFunction {
		private double theta;
		private double c;
		private double s;

		public RotationFunction(double theta) {
			this.theta = theta;
			this.c = Math.cos(this.theta);
			this.s = Math.sin(this.theta);
		}

		public void apply(Point2D coord) {
			if (theta == 0.0)
				return;
			double nx = coord.getX() * c + coord.getY() * s;
			double ny = -coord.getX() * s + coord.getY() * c;
			coord.setLocation(nx, ny);
		}

	}

	public static class Rotation0Function implements IteratedFunction {
		public void apply(Point2D coord) {
		}
	}

	public static class Rotation90Function implements IteratedFunction {
		public void apply(Point2D coord) {
			double nx = coord.getY();
			double ny = -coord.getX();
			coord.setLocation(nx, ny);
		}
	}

	public static class Rotation180Function implements IteratedFunction {
		public void apply(Point2D coord) {
			coord.setLocation(-coord.getX(), -coord.getY());
		}
	}

	public static class Rotation270Function implements IteratedFunction {
		public void apply(Point2D coord) {
			double nx = -coord.getY();
			double ny = coord.getX();
			coord.setLocation(nx, ny);
		}
	}

	public static class Rotation120Function implements IteratedFunction {
		private double c = Math.cos(Math.toRadians(120.0));
		private double s = Math.sin(Math.toRadians(120.0));

		public void apply(Point2D coord) {
			double nx = coord.getX() * c + coord.getY() * s;
			double ny = -coord.getX() * s + coord.getY() * c;
			coord.setLocation(nx, ny);
		}
	}

	public static class Rotation240Function implements IteratedFunction {
		private double c = Math.cos(Math.toRadians(240.0));
		private double s = Math.sin(Math.toRadians(240.0));

		public void apply(Point2D coord) {
			double nx = coord.getX() * c + coord.getY() * s;
			double ny = -coord.getX() * s + coord.getY() * c;
			coord.setLocation(nx, ny);
		}
	}
}
