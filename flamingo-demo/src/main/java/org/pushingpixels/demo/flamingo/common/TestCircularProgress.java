package org.pushingpixels.demo.flamingo.common;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.pushingpixels.flamingo.internal.ui.common.JCircularProgress;

public class TestCircularProgress extends JFrame {
    public TestCircularProgress() {
        this.setLayout(new BorderLayout());
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        JButton add = new JButton("add");
        add.addActionListener((ActionEvent e) -> {
            JCircularProgress jcp = new JCircularProgress();
            jcp.setPreferredSize(new Dimension(20, 20));
            flow.add(jcp);
            jcp.setVisible(false);
            jcp.setVisible(true);
        });
        this.add(flow, BorderLayout.CENTER);
        this.add(add, BorderLayout.SOUTH);

        this.setPreferredSize(new Dimension(400, 300));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(() -> {
            new TestCircularProgress().setVisible(true);
        });
    }

}
