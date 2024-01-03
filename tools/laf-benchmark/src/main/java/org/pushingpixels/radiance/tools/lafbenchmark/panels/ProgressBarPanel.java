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

import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.tools.lafbenchmark.BasePerformanceScenario;
import org.pushingpixels.radiance.tools.lafbenchmark.LafBenchmarkUtils;
import org.pushingpixels.radiance.tools.lafbenchmark.PerformanceScenario;
import org.pushingpixels.radiance.tools.lafbenchmark.PerformanceScenarioParticipant;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Test application panel for testing {@link JProgressBar} component.
 * 
 * @author Kirill Grouchnikov
 */
public class ProgressBarPanel extends JPanel {
	/**
	 * Creates a new panel with progress bars.
	 */
	public ProgressBarPanel() {
		this.setLayout(new BorderLayout());

		JPanel bars = new JPanel(new GridLayout(1, 2));

		TestFormLayoutBuilder horizontalBuilder = new TestFormLayoutBuilder(
				"left:pref:grow", 1, 12).border(Paddings.DIALOG);

		JProgressBar determinateEnHor = new JProgressBar(
				JProgressBar.HORIZONTAL, 0, 100);
		determinateEnHor.setIndeterminate(false);
		horizontalBuilder.appendSeparator("Determinate enabled");
		horizontalBuilder.append(determinateEnHor);

		JProgressBar determinateEnHorStr = new JProgressBar(
				JProgressBar.HORIZONTAL, 0, 100);
		determinateEnHorStr.setIndeterminate(false);
		determinateEnHorStr.setStringPainted(true);
		horizontalBuilder.appendSeparator("Determinate enabled + string");
		horizontalBuilder.append(determinateEnHorStr);

		JProgressBar indeterminateEnHor = new JProgressBar(
				JProgressBar.HORIZONTAL, 0, 100);
		indeterminateEnHor.setIndeterminate(true);
		indeterminateEnHor.setStringPainted(true);
		indeterminateEnHor.setString("In progress");
		horizontalBuilder.appendSeparator("Indeterminate enabled + string");
		horizontalBuilder.append(indeterminateEnHor);

		JProgressBar determinateDisHor = new JProgressBar(
				JProgressBar.HORIZONTAL, 0, 100);
		determinateDisHor.setIndeterminate(false);
		determinateDisHor.setEnabled(false);
		horizontalBuilder.appendSeparator("Determinate disabled");
		horizontalBuilder.append(determinateDisHor);

		JProgressBar determinateDisHorStr = new JProgressBar(
				JProgressBar.HORIZONTAL, 0, 100);
		determinateDisHorStr.setIndeterminate(false);
		determinateDisHorStr.setEnabled(false);
		determinateDisHorStr.setStringPainted(true);
		horizontalBuilder.appendSeparator("Determinate disabled + string");
		horizontalBuilder.append(determinateDisHorStr);

		JProgressBar indeterminateDisHor = new JProgressBar(
				JProgressBar.HORIZONTAL, 0, 100);
		indeterminateDisHor.setIndeterminate(true);
		indeterminateDisHor.setEnabled(false);
		horizontalBuilder.appendSeparator("Indeterminate disabled");
		horizontalBuilder.append(indeterminateDisHor);

		bars.add(horizontalBuilder.build());

		TestFormLayoutBuilder verticalBuilder = new TestFormLayoutBuilder(
                "center:pref:grow, 4dlu, center:pref:grow, 4dlu, "
                        + "center:pref:grow, 4dlu, center:pref:grow, 4dlu, center:pref:grow", 5, 2).
                border(Paddings.DIALOG);
		verticalBuilder.append("Enabled");
		verticalBuilder.append("RTL");
		verticalBuilder.append("Indeterm");
		verticalBuilder.append("Disabled");
		verticalBuilder.append("Dis indet");

		JProgressBar determinateEnVer = new JProgressBar(JProgressBar.VERTICAL,
				0, 100);
		determinateEnVer.setIndeterminate(false);
		determinateEnVer.setStringPainted(true);
		verticalBuilder.append(determinateEnVer);

		JProgressBar determinateEnVerRTL = new JProgressBar(
				JProgressBar.VERTICAL, 0, 100);
		determinateEnVerRTL.setIndeterminate(false);
		determinateEnVerRTL.setStringPainted(true);
		determinateEnVerRTL
				.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		verticalBuilder.append(determinateEnVerRTL);

		JProgressBar indeterminateEnVer = new JProgressBar(
				JProgressBar.VERTICAL, 0, 100);
		indeterminateEnVer.setIndeterminate(true);
		indeterminateEnVer.setStringPainted(true);
		indeterminateEnVer.setString("In progress");
		verticalBuilder.append(indeterminateEnVer);

		JProgressBar determinateDisVer = new JProgressBar(
				JProgressBar.VERTICAL, 0, 100);
		determinateDisVer.setIndeterminate(false);
		determinateDisVer.setEnabled(false);
		verticalBuilder.append(determinateDisVer);

		JProgressBar indeterminateDisVer = new JProgressBar(
				JProgressBar.VERTICAL, 0, 100);
		indeterminateDisVer.setIndeterminate(true);
		indeterminateDisVer.setEnabled(false);
		verticalBuilder.append(indeterminateDisVer);

		bars.add(verticalBuilder.build());

		this.add(new JScrollPane(bars), BorderLayout.CENTER);
	}

	public void setValue(int value) {
		List<JProgressBar> bars = new ArrayList<>();
		LafBenchmarkUtils.collectFromContainer(this, JProgressBar.class, true, bars);
		for (JProgressBar bar : bars) {
			bar.setValue(value);
		}
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getChangeValuePerformanceScenario() {
		return new BasePerformanceScenario<JProgressBar>(ProgressBarPanel.this,
				JProgressBar.class) {
			int[] perms;

			@Override
			public String getName() {
				return "Changing progress bar values";
			};

			@Override
			public void setup() {
				super.setup();
				this.perms = LafBenchmarkUtils.getPermutation(100,
						getIterationCount() * this.controls.size());
			}

			@Override
			public int getIterationCount() {
				return 10;
			};

			@Override
			public void runSingleIteration(int iterationNumber) {
				int count = 0;
				for (JProgressBar bar : this.controls) {
					if (!bar.isIndeterminate()) {
						bar.setValue(this.perms[this.controls.size()
								* iterationNumber + count]);
					}
					count++;
				}
				paintImmediately(new Rectangle(0, 0, getWidth(), getHeight()));
			};
		};
	}
}
