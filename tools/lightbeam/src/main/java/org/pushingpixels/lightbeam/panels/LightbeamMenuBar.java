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
package org.pushingpixels.lightbeam.panels;

import org.pushingpixels.lightbeam.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class LightbeamMenuBar extends JMenuBar {
	public LightbeamMenuBar() {
		super();

		this.add(this.getMenu("0", 0, 5));
		this.add(this.getMenu("1", 0, 4));
		this.add(this.getMenu("2", 0, 3));
		this.add(this.getMenu("3", 0, 2));
		this.add(this.getMenu("4", 0, 1));
	}

	private JMenu getMenu(String prefix, int level, int levelToStop) {
		JMenu result = new JMenu("menu" + prefix);

		JMenuItem item0 = new JMenuItem("item" + prefix + "0");
		JMenuItem item1 = new JRadioButtonMenuItem("item" + prefix + "1");
		JMenuItem item2 = new JCheckBoxMenuItem("item" + prefix + "2");
		JMenuItem item3 = new JRadioButtonMenuItem("item" + prefix + "3");
		item3.setSelected(true);
		JMenuItem item4 = new JCheckBoxMenuItem("item" + prefix + "4");
		item4.setSelected(true);

		result.add(item0);
		result.add(item1);
		result.add(item2);
		result.add(item3);
		result.add(item4);

		if (level < levelToStop) {
			result.add(getMenu(prefix + "0", level + 1, levelToStop));
			result.add(getMenu(prefix + "1", level + 1, levelToStop));
		}

		return result;
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getMenuSelectionScenario() {
		return new PerformanceScenario() {
			private List<MenuElement[]> menuPaths;

			private int[] perms;

			@Override
			public String getName() {
				return "Menu selection";
			}

			@Override
			public void setup() {
				this.menuPaths = new ArrayList<MenuElement[]>();
				for (int i = 0; i < getComponentCount(); i++) {
					Component comp = getComponent(i);
					if (comp instanceof JMenu) {
						this.scanMenu(null, (JMenu) comp);
					}
				}
				this.perms = LightbeamUtils.getPermutation(menuPaths.size(),
						this.getIterationCount());
			}

			private void scanMenu(LinkedList<JMenu> currentPath,
					JMenuItem menuLeaf) {
				int count = 1;
				if (currentPath != null)
					count += 2 * currentPath.size();
				if (menuLeaf != null)
					count++;
				MenuElement[] path = new MenuElement[count];
				count = 0;

				// the first element is the menu bar itself
				path[count++] = LightbeamMenuBar.this;
				if (currentPath != null) {
					for (JMenu menu : currentPath) {
						// JMenu menu = (JMenu) it.next();
						path[count++] = menu;
						// important - don't forget the popup menu of the menu
						path[count++] = menu.getPopupMenu();
					}
				}
				if (menuLeaf != null)
					path[count] = menuLeaf;

				menuPaths.add(path);

				if (menuLeaf instanceof JMenu) {
					JMenu menu = (JMenu) menuLeaf;
					if (currentPath == null)
						currentPath = new LinkedList<JMenu>();
					currentPath.addLast(menu);
					for (int i = 0; i < menu.getMenuComponentCount(); i++) {
						JMenuItem currItem = menu.getItem(i);
						scanMenu(currentPath, currItem);
					}
					currentPath.removeLast();
				}
			}

			@Override
			public int getIterationCount() {
				return 15;
			}

			@Override
			public void runSingleIteration(int iterationNumber) {
				MenuSelectionManager.defaultManager().setSelectedPath(
						this.menuPaths.get(this.perms[iterationNumber]));
				JRootPane root = SwingUtilities.getRootPane(LightbeamMenuBar.this);
				root.paintImmediately(new Rectangle(0, 0, root.getWidth(), root.getHeight()));
			}

			@Override
			public void tearDown() {
				MenuSelectionManager.defaultManager().clearSelectedPath();
			}
		};
	}

//	@PerformanceScenarioParticipant
//	public PerformanceScenario getCorePopupFactoryMenuSelectionScenario() {
//		return new PerformanceScenario() {
//			private List<MenuElement[]> menuPaths;
//
//			private int[] perms;
//
//			private PopupFactory popupFactory;
//
//			@Override
//			public String getName() {
//				return "Menu selection with core popup factory";
//			}
//
//			@Override
//			public void setup() {
//				this.popupFactory = PopupFactory.getSharedInstance();
//				PopupFactory.setSharedInstance(new PopupFactory());
//				this.menuPaths = new ArrayList<MenuElement[]>();
//				for (int i = 0; i < getComponentCount(); i++) {
//					Component comp = getComponent(i);
//					if (comp instanceof JMenu) {
//						this.scanMenu(null, (JMenu) comp);
//					}
//				}
//				this.perms = LightbeamUtils.getPermutation(menuPaths.size(),
//						this.getIterationCount());
//			}
//
//			private void scanMenu(LinkedList<JMenu> currentPath,
//					JMenuItem menuLeaf) {
//				int count = 1;
//				if (currentPath != null)
//					count += 2 * currentPath.size();
//				if (menuLeaf != null)
//					count++;
//				MenuElement[] path = new MenuElement[count];
//				count = 0;
//
//				// the first element is the menu bar itself
//				path[count++] = LightbeamMenuBar.this;
//				if (currentPath != null) {
//					for (JMenu menu : currentPath) {
//						// JMenu menu = (JMenu) it.next();
//						path[count++] = menu;
//						// important - don't forget the popup menu of the menu
//						path[count++] = menu.getPopupMenu();
//					}
//				}
//				if (menuLeaf != null)
//					path[count] = menuLeaf;
//
//				menuPaths.add(path);
//
//				if (menuLeaf instanceof JMenu) {
//					JMenu menu = (JMenu) menuLeaf;
//					if (currentPath == null)
//						currentPath = new LinkedList<JMenu>();
//					currentPath.addLast(menu);
//					for (int i = 0; i < menu.getMenuComponentCount(); i++) {
//						JMenuItem currItem = menu.getItem(i);
//						scanMenu(currentPath, currItem);
//					}
//					currentPath.removeLast();
//				}
//			}
//
//			@Override
//			public int getIterationCount() {
//				return 15;
//			}
//
//			@Override
//			public void runSingleIteration(int iterationNumber) {
//				MenuSelectionManager.defaultManager().setSelectedPath(
//						this.menuPaths.get(this.perms[iterationNumber]));
//				JRootPane root = SwingUtilities
//						.getRootPane(LightbeamMenuBar.this);
//				root.paintImmediately(new Rectangle(0, 0, root.getWidth(), root
//						.getHeight()));
//			}
//
//			@Override
//			public void tearDown() {
//				MenuSelectionManager.defaultManager().clearSelectedPath();
//				PopupFactory.setSharedInstance(this.popupFactory);
//			}
//		};
//	}

}
