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
package org.pushingpixels.demo.substance.extras.generate;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.ImageIO;

import org.pushingpixels.substance.api.colorscheme.SunfireRedColorScheme;
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal.FractalFlameFactory;
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal.Functions;
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal.IteratedFunction;
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal.IteratedFunctionSystem;

public class Generator {
	public static void main(String[] args) throws Exception {
		File genFolder = new File("C:/JProjects/substance-watermark-pack/exp");
		genFolder.mkdirs();
		// get the current number
		File counterFile = new File(genFolder, "count.log");
		int currCount = 0;
		if (counterFile.exists()) {
			BufferedReader countReader = new BufferedReader(new FileReader(
					counterFile));
			currCount = Integer.parseInt(countReader.readLine()) + 1;
			countReader.close();
		}

		int iterCount = 100;
		for (int i = 0; i < iterCount; i++) {
			long start = System.currentTimeMillis();
			int rotationDegree = 1 + (int) (7.0 * Math.random());
			int funcCount = 1 + (int) (5.0 * Math.random());

			StringBuffer funcBuffer = new StringBuffer();
			funcBuffer.append(rotationDegree);

			List<IteratedFunction> funcs = new LinkedList<IteratedFunction>();

			for (int j = 0; j < funcCount; j++) {
				funcBuffer.append(",\n\t\t\t");
				int funcKind = (int) (5.0 * Math.random());
				double[] params = new double[6];
				for (int k = 0; k < 6; k++) {
					params[k] = 2.0 * Math.random() - 1.0;
				}
				funcBuffer.append("new Functions.");
				switch (funcKind) {
				case 0:
					funcBuffer.append("ExFunction");
					funcs.add(new Functions.ExFunction(params[0], params[1],
							params[2], params[3], params[4], params[5]));
					break;
				case 1:
					funcBuffer.append("HorseShoeFunction");
					funcs.add(new Functions.HorseShoeFunction(params[0],
							params[1], params[2], params[3], params[4],
							params[5]));
					break;
				case 2:
					funcBuffer.append("SphericalFunction");
					funcs.add(new Functions.SphericalFunction(params[0],
							params[1], params[2], params[3], params[4],
							params[5]));
					break;
				case 3:
					funcBuffer.append("SpiralFunction");
					funcs.add(new Functions.SpiralFunction(params[0],
							params[1], params[2], params[3], params[4],
							params[5]));
					break;
				case 4:
					funcBuffer.append("SwirlFunction");
					funcs.add(new Functions.SwirlFunction(params[0], params[1],
							params[2], params[3], params[4], params[5]));
					break;
				}
				funcBuffer.append("(");
				funcBuffer.append(params[0]);
				funcBuffer.append(",");
				funcBuffer.append(params[1]);
				funcBuffer.append(",");
				funcBuffer.append(params[2]);
				funcBuffer.append(",");
				funcBuffer.append(params[3]);
				funcBuffer.append(",");
				funcBuffer.append(params[4]);
				funcBuffer.append(",");
				funcBuffer.append(params[5]);
				funcBuffer.append(")");
			}

			String className = "Fractal" + (currCount + i);
			PrintWriter classWriter = new PrintWriter(new FileWriter(new File(
					genFolder, className + ".java")));

			classWriter.println("package test.generated;");
			classWriter.println();

			classWriter.println("import java.awt.*;");
			classWriter.println("import java.awt.image.BufferedImage;");
			classWriter.println();

			classWriter.println("import javax.swing.JFrame;");
			classWriter.println("import javax.swing.JPanel;");
			classWriter.println();

			classWriter.println("import org.pushingpixels.substance.color.*;");
			classWriter
					.println("import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal.*;");
			classWriter.println();
			classWriter.println("public class " + className
					+ " extends IteratedFunctionSystem {");
			classWriter.println("\tpublic " + className + "() {");
			classWriter.println("\t\tsuper(" + funcBuffer + ");");
			classWriter.println("\t}");
			classWriter.println();

			classWriter
					.println("\tprotected static class ImagePanel extends JPanel {");
			classWriter.println("\t\tprivate BufferedImage bi;");

			classWriter.println("\t\tpublic ImagePanel(BufferedImage bi) {");
			classWriter.println("\t\t\tthis.bi = bi;");
			classWriter.println("\t\t}");
			classWriter.println();

			classWriter.println("\t\tpublic Dimension getPreferredSize() {");
			classWriter
					.println("\t\t\treturn new Dimension(this.bi.getWidth(), this.bi.getHeight());");
			classWriter.println("\t\t}");
			classWriter.println();

			classWriter
					.println("\t\tprotected void paintComponent(Graphics g) {");
			classWriter.println("\t\t\tg.drawImage(this.bi, 0, 0, null);");
			classWriter.println("\t\t}");
			classWriter.println("\t}");
			classWriter.println();

			classWriter.println("\tpublic static void main(String[] args) {");
			classWriter.println("\t\tBufferedImage bi = FractalFlameFactory");
			classWriter
					.println("\t\t\t.getFractalFlameImage(new SunfireRedColorScheme(), 480, 400,");
			classWriter.println("\t\t\t\t2000000, new " + className + "());");
			classWriter
					.println("\t\tJFrame frame = new JFrame(\"Fractal Flames "
							+ (currCount + i) + "\");");
			classWriter.println("\t\tframe.add(new ImagePanel(bi));");
			classWriter.println("\t\tframe.pack();");
			classWriter
					.println("\t\tframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);");
			classWriter.println("\t\tframe.setLocationRelativeTo(null);");
			classWriter.println("\t\tframe.setVisible(true);");
			classWriter.println("\t}");

			classWriter.println("}");
			classWriter.close();

			PrintWriter countWriter = new PrintWriter(new FileWriter(new File(
					genFolder, "count.log")));
			countWriter.println(currCount + i);
			countWriter.close();

			BufferedImage bi = FractalFlameFactory.getFractalFlameImage(
					new SunfireRedColorScheme(), 300, 200, 100000,
					new IteratedFunctionSystem(rotationDegree, funcs
							.toArray(new IteratedFunction[0])));
			ImageIO.write(bi, "png", new File(genFolder, className + ".png"));

			if (rotationDegree > 1) {
				BufferedImage bi2 = FractalFlameFactory.getFractalFlameImage(
						new SunfireRedColorScheme(), 300, 200, 100000,
						new IteratedFunctionSystem(1, funcs
								.toArray(new IteratedFunction[0])));
				ImageIO.write(bi2, "png", new File(genFolder, className
						+ "-1.png"));
			}

			long end = System.currentTimeMillis();
			System.out
					.println((currCount + i) + " in " + (end - start) + " ms");
		}
	}
}
