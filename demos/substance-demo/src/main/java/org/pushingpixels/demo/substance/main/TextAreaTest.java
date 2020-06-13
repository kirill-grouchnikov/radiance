package org.pushingpixels.demo.substance.main;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;

public class TextAreaTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());

            JFrame frame = new JFrame("Text area");
            frame.setLayout(new BorderLayout());
            frame.add(new JTextArea(), BorderLayout.CENTER);
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
