package org.pushingpixels.demo.flamingo.common;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_center;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_fill;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_left;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_right;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_bold;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_italic;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_strikethrough;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_underline;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.CommandToggleButtonGroup;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandToggleMenuButton;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;

public class TestToggleMenuButtons extends JFrame {
    public TestToggleMenuButtons() {
        JCommandButton singleChoice = new JCommandButton("single");
        singleChoice.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
        singleChoice.setDisplayState(CommandButtonDisplayState.MEDIUM);
        singleChoice.setFlat(false);

        final JCommandToggleMenuButton b11 = new JCommandToggleMenuButton("left",
                new Format_justify_left());
        final JCommandToggleMenuButton b12 = new JCommandToggleMenuButton("center",
                new Format_justify_center());
        final JCommandToggleMenuButton b13 = new JCommandToggleMenuButton("right",
                new Format_justify_right());
        final JCommandToggleMenuButton b14 = new JCommandToggleMenuButton("fill",
                new Format_justify_fill());

        CommandToggleButtonGroup group = new CommandToggleButtonGroup();
        group.add(b11);
        group.add(b12);
        group.add(b13);
        group.add(b14);

        singleChoice.setPopupCallback((JCommandButton commandButton) -> {
            JCommandPopupMenu result = new JCommandPopupMenu();

            result.addMenuButton(b11);
            result.addMenuButton(b12);
            result.addMenuButton(b13);
            result.addMenuButton(b14);

            return result;
        });

        JCommandButton multiChoice = new JCommandButton("multi");
        multiChoice.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
        multiChoice.setDisplayState(CommandButtonDisplayState.MEDIUM);
        multiChoice.setFlat(false);

        final JCommandToggleMenuButton b21 = new JCommandToggleMenuButton("bold",
                new Format_text_bold());
        final JCommandToggleMenuButton b22 = new JCommandToggleMenuButton("italic",
                new Format_text_italic());
        final JCommandToggleMenuButton b23 = new JCommandToggleMenuButton("underline",
                new Format_text_underline());
        final JCommandToggleMenuButton b24 = new JCommandToggleMenuButton("strike",
                new Format_text_strikethrough());

        multiChoice.setPopupCallback((JCommandButton commandButton) -> {
            JCommandPopupMenu result = new JCommandPopupMenu();

            result.addMenuButton(b21);
            result.addMenuButton(b22);
            result.addMenuButton(b23);
            result.addMenuButton(b24);

            result.setToDismissOnChildClick(false);

            return result;
        });

        JPanel main = new JPanel(new FlowLayout());
        main.add(singleChoice);
        main.add(multiChoice);
        this.add(main, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        controlPanel.add(LookAndFeelSwitcher.getLookAndFeelSwitcher(this));
        this.add(controlPanel, BorderLayout.SOUTH);

        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TestToggleMenuButtons().setVisible(true);
        });
    }

}
