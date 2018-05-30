package org.pushingpixels.demo.flamingo.common;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_center;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_left;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_right;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_bold;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_italic;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_strikethrough;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_underline;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandButtonStrip;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessSkin;

/**
 * Test application for {@link JCommandButtonStrip} component.
 * 
 * @author Kirill Grouchnikov
 */
public class ButtonStripTest extends JFrame {
	/**
	 * Creates the test application.
	 */
	public ButtonStripTest() {
		this.setLayout(new FlowLayout());

		JCommandButtonStrip buttonStrip = new JCommandButtonStrip();
		buttonStrip.add(new JCommandButton("", new Format_justify_left()));
		buttonStrip.add(new JCommandButton("", new Format_justify_center()));
		buttonStrip.add(new JCommandButton("", new Format_justify_right()));
		this.add(buttonStrip);

		JCommandButtonStrip buttonStrip2 = new JCommandButtonStrip();
		buttonStrip2.add(new JCommandButton("", new Format_text_bold()));
		buttonStrip2.add(new JCommandButton("", new Format_text_italic()));
		buttonStrip2.add(new JCommandButton("", new Format_text_underline()));
		JCommandButton strike = new JCommandButton("", new Format_text_strikethrough());
		strike.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
		strike.setPopupCallback((JCommandButton commandButton) -> new SamplePopupMenu(
				commandButton.getComponentOrientation()));
		buttonStrip2.add(strike);
		this.add(buttonStrip2);

		JCommandButton standalone = new JCommandButton("", new Format_justify_left()) {
			@Override
			public java.awt.Dimension getPreferredSize() {
				return super.getPreferredSize();
			}
		};
		standalone.setDisplayState(CommandButtonDisplayState.SMALL);
		standalone.setFlat(false);
		this.add(standalone);

		this.setSize(300, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Main method for testing.
	 * 
	 * @param args
	 *            Ignored.
	 */
	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(() -> {
			JFrame.setDefaultLookAndFeelDecorated(true);
			SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());
			ButtonStripTest bst = new ButtonStripTest();
			bst.setVisible(true);
		});
	}
}
