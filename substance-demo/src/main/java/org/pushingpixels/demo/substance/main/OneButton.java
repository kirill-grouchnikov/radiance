package org.pushingpixels.demo.substance.main;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.FocusKind;
import org.pushingpixels.substance.api.skin.BusinessSkin;

public class OneButton extends JFrame {
    public OneButton() {
        this.setLayout(new FlowLayout());
        this.add(new JButton("test"));
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());
            SubstanceCortex.GlobalScope.setFocusKind(FocusKind.ALL);
            new OneButton().setVisible(true);
        });
    }
}
