/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.tools.lafbenchmark.panels;

import org.pushingpixels.radiance.tools.lafbenchmark.LafBenchmarkUtils;
import org.pushingpixels.radiance.tools.lafbenchmark.PerformanceScenario;
import org.pushingpixels.radiance.tools.lafbenchmark.PerformanceScenarioParticipant;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Random;

/**
 * Test application panel for testing {@link JTextArea} component.
 * 
 * @author Kirill Grouchnikov
 */
public class BigTextAreaPanel extends JPanel {
	private JTextArea textArea;

	/**
	 * Creates a new tabbed panel.
	 */
	public BigTextAreaPanel() {
		this.setLayout(new BorderLayout());

		this.textArea = new JTextArea();

		this.add(new JScrollPane(this.textArea), BorderLayout.CENTER);
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getLargeScrollScenario() {
		return new PerformanceScenario() {
			int[] perms;

			@Override
			public String getName() {
				return "Scrolling large text area";
			}

			@Override
			public void setup() {
				int lineCount = 1000;
				textArea.setText("");
				Random seed = new Random(10000);
				for (int i = 0; i < lineCount; i++) {
					StringBuffer line = new StringBuffer();
					for (int j = 0; j < 10; j++) {
						line.append(LafBenchmarkUtils.dictionary[seed
								.nextInt(LafBenchmarkUtils.dictionary.length)]);
						line.append(" ");
					}
					textArea.append(line.toString() + "\n");
				}

				textArea.scrollRectToVisible(new Rectangle(0, 0, textArea
						.getWidth(), 10));
				textArea.select(0, 0);
				this.perms = LafBenchmarkUtils.getPermutation(textArea
						.getLineCount(), this.getIterationCount());
			}

			@Override
			public int getIterationCount() {
				return 10;
			}

			@Override
			public void runSingleIteration(int iterationNumber) {
				try {
					int lineToScrollTo = this.perms[iterationNumber];
					int charToScrollTo = textArea.getLineStartOffset(lineToScrollTo);
					Rectangle2D view = textArea.modelToView2D(charToScrollTo);
					textArea.scrollRectToVisible(view.getBounds());
					paintImmediately(0, 0, getWidth(), getHeight());
				} catch (BadLocationException ble) {
					ble.printStackTrace();
				}
			}
		};
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getAddTextScenario() {
		return new PerformanceScenario() {
			int[] perms;

			@Override
			public String getName() {
				return "Adding text to text area";
			}

			@Override
			public void setup() {
				textArea.setText("");
				textArea.select(0, 0);
				this.perms = LafBenchmarkUtils.getPermutation(
						LafBenchmarkUtils.dictionary.length, this
								.getIterationCount());
			}

			@Override
			public int getIterationCount() {
				return 10;
			}

			@Override
			public void runSingleIteration(int iterationNumber) {
				try {
					String wordToAdd = LafBenchmarkUtils.dictionary[this.perms[iterationNumber]];
					StringBuffer line = new StringBuffer();
					for (int i = 0; i < 10; i++) {
						line.append(wordToAdd);
						line.append(" ");
					}
					for (int i = 0; i < 100; i++) {
						textArea.append(line.toString() + "\n");
					}

					int lastLine = textArea.getLineCount();
					int charToScrollTo = textArea.getLineStartOffset(lastLine - 1);
					Rectangle2D view = textArea.modelToView2D(charToScrollTo);
					textArea.scrollRectToVisible(view.getBounds());
					paintImmediately(0, 0, getWidth(), getHeight());
				} catch (BadLocationException ble) {
					ble.printStackTrace();
				}
			}
		};
	}
}
