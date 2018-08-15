/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.flamingo.internal.ui.common;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.PopupButtonModel;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Listener to track user interaction with the command buttons.
 * 
 * @author Kirill Grouchnikov
 */
public class BasicCommandButtonListener implements MouseListener,
		MouseMotionListener, FocusListener, ChangeListener {
	@Override
	public void focusLost(FocusEvent e) {
		AbstractCommandButton b = (AbstractCommandButton) e.getSource();
		// System.err.println(e.getComponent() + "\n\tlost "
		// + (e.isTemporary() ? "temporary" : "permanent")
		// + " focus to \n\t" + e.getOppositeComponent());
		b.getActionModel().setArmed(false);
		b.getActionModel().setPressed(false);
		if (b instanceof JCommandButton) {
			PopupButtonModel popupModel = ((JCommandButton) b).getPopupModel();
			popupModel.setPressed(false);
			popupModel.setArmed(false);
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		AbstractCommandButton b = (AbstractCommandButton) e.getSource();
		b.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e)) {
			AbstractCommandButton b = (AbstractCommandButton) e.getSource();

			JScrollablePanel scrollable = (JScrollablePanel) SwingUtilities
					.getAncestorOfClass(JScrollablePanel.class, b);
			if (scrollable != null) {
				// scroll the viewport of the scrollable panel so that
				// the button is fully viewed.
				Point loc = SwingUtilities.convertPoint(b.getParent(), b
						.getLocation(), scrollable.getView());
				if (scrollable.getScrollType() == JScrollablePanel.ScrollType.HORIZONTALLY) {
					scrollable.scrollToIfNecessary(loc.x, b.getWidth());
				} else {
					scrollable.scrollToIfNecessary(loc.y, b.getHeight());
				}
			}

			if (b.contains(e.getX(), e.getY())) {
				CommandButtonUI ui = b.getUI();
				Rectangle actionRect = ui.getLayoutInfo().actionClickArea;
				Rectangle popupRect = ui.getLayoutInfo().popupClickArea;

				if ((actionRect != null) && actionRect.contains(e.getPoint())) {
					ButtonModel actionModel = b.getActionModel();
					if (actionModel.isEnabled()) {
						actionModel.setArmed(true);
						actionModel.setPressed(true);
					}
				} else {
					if ((popupRect != null) && popupRect.contains(e.getPoint())) {
						PopupButtonModel popupModel = ((JCommandButton) b)
								.getPopupModel();
						if (popupModel.isEnabled()) {
							popupModel.setArmed(true);
							popupModel.setPressed(true);
						}
					}
				}

				// System.err.println(b.getText() + " - hasFocus():"
				// + b.hasFocus() + ", isRequestFocusEnabled():"
				// + b.isRequestFocusEnabled());
				if (!b.hasFocus() && b.isRequestFocusEnabled()) {
					b.requestFocusInWindow();
				}
			}
		}
	};

	@Override
	public void mouseReleased(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e)) {
			AbstractCommandButton b = (AbstractCommandButton) e.getSource();
			b.getActionModel().setPressed(false);
			if (b instanceof JCommandButton) {
				((JCommandButton) b).getPopupModel().setPressed(false);
			}
			b.getActionModel().setArmed(false);
			if (b instanceof JCommandButton) {
				((JCommandButton) b).getPopupModel().setArmed(false);
			}
		}
	};

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.syncMouseMovement(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.syncMouseMovement(e);
	}

	/**
	 * Synchronizes the action and popup models of the command button with the
	 * specified mouse event.
	 * 
	 * @param e
	 *            Mouse event for the model synchronization.
	 */
	private void syncMouseMovement(MouseEvent e) {
		AbstractCommandButton b = (AbstractCommandButton) e.getSource();
		ButtonModel actionModel = b.getActionModel();
		PopupButtonModel popupModel = (b instanceof JCommandButton) ? ((JCommandButton) b)
				.getPopupModel()
				: null;
		CommandButtonUI ui = b.getUI();
		Rectangle actionRect = ui.getLayoutInfo().actionClickArea;
		Rectangle popupRect = ui.getLayoutInfo().popupClickArea;

		if ((actionRect != null) && actionRect.contains(e.getPoint())) {
			if (actionModel.isEnabled()) {
				if (!SwingUtilities.isLeftMouseButton(e))
					actionModel.setRollover(true);
				if (actionModel.isPressed())
					actionModel.setArmed(true);
			}
			if (popupModel != null && !SwingUtilities.isLeftMouseButton(e))
				popupModel.setRollover(false);
		} else {
			if ((popupRect != null) && popupRect.contains(e.getPoint())) {
				if ((popupModel != null) && popupModel.isEnabled()) {
					if (!SwingUtilities.isLeftMouseButton(e))
						popupModel.setRollover(true);
					if (popupModel.isPressed())
						popupModel.setArmed(true);
				}
				if (!SwingUtilities.isLeftMouseButton(e))
					actionModel.setRollover(false);
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		AbstractCommandButton b = (AbstractCommandButton) e.getSource();
		ButtonModel actionModel = b.getActionModel();
		PopupButtonModel popupModel = (b instanceof JCommandButton) ? ((JCommandButton) b)
				.getPopupModel()
				: null;
		actionModel.setRollover(false);
		actionModel.setArmed(false);
		if (popupModel != null) {
			popupModel.setRollover(false);
			popupModel.setArmed(false);
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		AbstractCommandButton b = (AbstractCommandButton) e.getSource();
		b.repaint();
	}

	/**
	 * Installs keyboard action (space / enter keys) on the specified command
	 * button.
	 * 
	 * @param button
	 *            Command button.
	 */
	public void installKeyboardActions(AbstractCommandButton button) {
		ActionMap map = new ActionMap();
		map.put(PressAction.PRESS, new PressAction(button));
		map.put(ReleaseAction.RELEASE, new ReleaseAction(button));

		SwingUtilities.replaceUIActionMap(button, map);
		InputMap km = LookAndFeel.makeInputMap(new Object[] { "SPACE",
				"pressed", "released SPACE", "released", "ENTER", "pressed",
				"released ENTER", "released" });

		SwingUtilities.replaceUIInputMap(button, JComponent.WHEN_FOCUSED, km);
	}

	/**
	 * Button press action.
	 * 
	 * @author Kirill Grouchnikov
	 */
	private static class PressAction extends AbstractAction {
		/**
		 * Press action name.
		 */
		private static final String PRESS = "pressed";

		/**
		 * Associated command button.
		 */
		AbstractCommandButton button;

		/**
		 * Creates a new press action.
		 * 
		 * @param button
		 *            Associated command button.
		 */
		PressAction(AbstractCommandButton button) {
			super(PRESS);
			this.button = button;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			ButtonModel model = button.getActionModel();
			model.setArmed(true);
			model.setPressed(true);
			if (!button.hasFocus()) {
				button.requestFocus();
			}
		}

		@Override
		public boolean isEnabled() {
			return button.getActionModel().isEnabled();
		}
	}

	/**
	 * Button release action.
	 * 
	 * @author Kirill Grouchnikov
	 */
	private static class ReleaseAction extends AbstractAction {
		/**
		 * Release action name.
		 */
		private static final String RELEASE = "released";

		/**
		 * Associated command button.
		 */
		AbstractCommandButton button;

		/**
		 * Creates a new release action.
		 * 
		 * @param button
		 *            Associated command button.
		 */
		ReleaseAction(AbstractCommandButton button) {
			super(RELEASE);
			this.button = button;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			ButtonModel model = button.getActionModel();
			model.setPressed(false);
			model.setArmed(false);
		}

		@Override
		public boolean isEnabled() {
			return button.getActionModel().isEnabled();
		}
	}

	/**
	 * Uninstalls keyboard action (space / enter keys) from the specified
	 * command button.
	 * 
	 * @param button
	 *            Command button.
	 */
	public void uninstallKeyboardActions(AbstractCommandButton button) {
		SwingUtilities.replaceUIInputMap(button,
				JComponent.WHEN_IN_FOCUSED_WINDOW, null);
		SwingUtilities.replaceUIInputMap(button, JComponent.WHEN_FOCUSED, null);
		SwingUtilities.replaceUIActionMap(button, null);
	}
}
