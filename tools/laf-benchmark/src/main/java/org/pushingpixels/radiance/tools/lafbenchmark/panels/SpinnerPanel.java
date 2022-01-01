/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.tools.lafbenchmark.commands.ConfigurationCommand;
import org.pushingpixels.radiance.tools.lafbenchmark.commands.CreationCommand;
import org.pushingpixels.radiance.tools.lafbenchmark.commands.DisableCommand;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Test application panel for testing {@link JSpinner} component.
 * 
 * @author Kirill Grouchnikov
 */
public class SpinnerPanel extends JPanel {
	/**
	 * Creates a test panel with spinners.
	 */
	public SpinnerPanel() {
		this.setLayout(new BorderLayout());

		TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
				"right:pref, 4dlu, left:pref:grow", 2, 10).border(Paddings.DIALOG);

		CreationCommand<Component> basicCr = new CreationCommand<Component>() {
			public Component create() {
				JSpinner basicSpinner = new JSpinner(new SpinnerNumberModel());
				return basicSpinner;
			}
		};
		CreationCommand<Component> dateCr = new CreationCommand<Component>() {
			public Component create() {
				JSpinner dateEnSpinner = new JSpinner(new SpinnerDateModel());
				return dateEnSpinner;
			}
		};
		CreationCommand<Component> weekdaysCr = new CreationCommand<Component>() {
			public Component create() {
				String weekdaysEn[] = new String[] { "Sunday", "Monday",
						"Tuesday", "Wednesday", "Thursday", "Friday",
						"Saturday" };
				JSpinner listEnSpinner = new JSpinner(new SpinnerListModel(
						weekdaysEn));
				return listEnSpinner;
			}
		};
		CreationCommand<Component> numberCr = new CreationCommand<Component>() {
			public Component create() {
				JSpinner numberEnSpinner = new JSpinner(new SpinnerNumberModel(
						0, 0, 100, 5));
				return numberEnSpinner;
			}
		};

		builder.appendSeparator("Enabled");
		addSpinner(builder, "Basic", basicCr, null);
		addSpinner(builder, "Date", dateCr, null);
		addSpinner(builder, "Weekdays", weekdaysCr, null);
		addSpinner(builder, "Number", numberCr, null);

		builder.appendSeparator("Disabled");
		addSpinner(builder, "Basic", basicCr, new DisableCommand());
		addSpinner(builder, "Date", dateCr, new DisableCommand());
		addSpinner(builder, "Weekdays", weekdaysCr, new DisableCommand());
		addSpinner(builder, "Number", numberCr, new DisableCommand());

		this.add(new JScrollPane(builder.build()), BorderLayout.CENTER);
	}

	private void addSpinner(TestFormLayoutBuilder builder, String label,
			CreationCommand<Component> creationCmd,
			ConfigurationCommand<Component> configurationCmd) {

		Component comp = creationCmd.create();

		if (configurationCmd != null) {
			configurationCmd.configure(comp);
		}

		JLabel jl = new JLabel(label);
		builder.append(jl);
		builder.append(comp);
	}

	protected abstract class BaseSpinnerPerformanceScenario extends
            BasePerformanceScenario<JSpinner> {
		int[] perms;

		int flipCount;

		public BaseSpinnerPerformanceScenario() {
			super(SpinnerPanel.this, JSpinner.class);
		}

		@Override
		public void setup() {
			super.setup();
			this.flipCount = this.controls.size() / 4;
			this.perms = LafBenchmarkUtils.getPermutation(this.controls.size(),
					this.flipCount * getIterationCount());
		}
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getToggleEnabledScenario() {
		return new BaseSpinnerPerformanceScenario() {
			Map<JSpinner, Boolean> origEnabledMap;

			@Override
			public String getName() {
				return "Toggling enabled on spinners";
			}

			@Override
			public int getIterationCount() {
				return 10;
			}

			@Override
			public void setup() {
				super.setup();
				this.origEnabledMap = new HashMap<JSpinner, Boolean>();
				for (JSpinner spinner : this.controls) {
					this.origEnabledMap.put(spinner, spinner.isEnabled());
				}
			}

			@Override
			public void tearDown() {
				for (JSpinner spinner : this.controls) {
					spinner.setEnabled(this.origEnabledMap.get(spinner));
				}
				this.origEnabledMap.clear();
				super.tearDown();
			}

			@Override
			public void runSingleIteration(int iterationNumber) {
				int startInd = this.flipCount * iterationNumber;
				int endInd = startInd + this.flipCount;
				for (int i = startInd; i < endInd; i++) {
					JSpinner spinner = this.controls.get(this.perms[i]);
					spinner.setEnabled(!spinner.isEnabled());
				}
				paintImmediately(new Rectangle(0, 0, getWidth(), getHeight()));
			}
		};
	}

}
