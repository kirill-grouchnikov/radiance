/**
 * 
 */
package org.pushingpixels.demo.flamingo.common;

import java.awt.ComponentOrientation;

import org.pushingpixels.flamingo.api.common.JCommandMenuButton;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;

public class SamplePopupMenu extends JCommandPopupMenu {
	public SamplePopupMenu(ComponentOrientation co) {
		this.addMenuButton(new JCommandMenuButton("Test menu item 1",
				new EmptyResizableIcon(16)));
		this.addMenuButton(new JCommandMenuButton("Test menu item 2",
				new EmptyResizableIcon(16)));
		this.addMenuButton(new JCommandMenuButton("Test menu item 3",
				new EmptyResizableIcon(16)));
		this.addMenuSeparator();
		this.addMenuButton(new JCommandMenuButton("Test menu item 4",
				new EmptyResizableIcon(16)));
		this.addMenuButton(new JCommandMenuButton("Test menu item 5",
				new EmptyResizableIcon(16)));

		this.applyComponentOrientation(co);
	}
}