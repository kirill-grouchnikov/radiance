/*
 * Copyright (c) 2008-2018 Lightbeam Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Lightbeam Kirill Grouchnikov nor the names of
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
package org.pushingpixels.lightbeam.panels;

import org.pushingpixels.lightbeam.*;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Test application panel for testing {@link JTabbedPane} component.
 * 
 * @author Kirill Grouchnikov
 */
public class TabsPanel extends JPanel {
	private JTabbedPane tabbedPane;

	/**
	 * Creates a new tabbed panel.
	 */
	public TabsPanel() {
		this.setLayout(new BorderLayout());

		this.tabbedPane = new JTabbedPane();
		Random seed = new Random(50);
		for (int i = 0; i < 20; i++) {
			int backgrColor = Color.HSBtoRGB(seed.nextFloat(), 0.4f, 0.8f);
			JPanel tab = new JPanel();
			tab.setBackground(new Color(backgrColor));
			this.tabbedPane
					.addTab("Tab " + i, IconManager.getRandomIcon(), tab);
		}

		this.add(this.tabbedPane, BorderLayout.CENTER);
	}

	private class TabPlacementScenario extends PerformanceScenario {
		private int tabPlacement;

		private String tabPlacementName;

		private int[] perm;

		public TabPlacementScenario(int location, String locationName) {
			this.tabPlacement = location;
			this.tabPlacementName = locationName;
		}

		@Override
		public String getName() {
			return "Selecting tabs under " + this.tabPlacementName;
		}

		@Override
		public void setup() {
			this.perm = LightbeamUtils.getPermutation(tabbedPane.getTabCount(),
					this.getIterationCount());
			tabbedPane.setTabPlacement(this.tabPlacement);
		}

		@Override
		public int getIterationCount() {
			return 10;
		}

		@Override
		public void runSingleIteration(int iterationNumber) {
			tabbedPane.setSelectedIndex(this.perm[iterationNumber]);
			paintImmediately(new Rectangle(0, 0, getWidth(), getHeight()));
		}
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getTabSelectionTopPerformanceScenario() {
		return new TabPlacementScenario(SwingConstants.TOP, "top");
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getTabSelectionLeftPerformanceScenario() {
		return new TabPlacementScenario(SwingConstants.LEFT, "left");
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getTabSelectionRightPerformanceScenario() {
		return new TabPlacementScenario(SwingConstants.RIGHT, "right");
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getTabSelectionBottomPerformanceScenario() {
		return new TabPlacementScenario(SwingConstants.BOTTOM, "bottom");
	}
}
