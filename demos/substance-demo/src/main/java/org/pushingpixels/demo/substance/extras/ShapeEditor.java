/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.substance.extras;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;
import org.pushingpixels.substance.extras.api.shaperpack.CanonicalPath;
import org.pushingpixels.substance.extras.api.shaperpack.ShaperRepository;

public class ShapeEditor extends JFrame {
    private ArrayList<Point2D> majorPoints;

    private ArrayList<Point2D> minorPoints;

    private boolean isInEditMajorMode;

    private boolean isShowImage;

    private boolean isShowPath;

    private JButton loadImageButton;

    private JButton loadContourButton = new JButton("Load contour");

    private JCheckBox showImageCB;

    private JCheckBox showPathCB;

    private JRadioButton editMajorRB;

    private JRadioButton editMinorRB;

    private JRadioButton addModeRB;

    private JRadioButton deleteModeRB;

    private JRadioButton editModeRB;

    private JButton saveContourButton;

    private JButton cancelButton;

    private ShapePanel shapePanel;

    private static class ShapePanel extends JPanel {
        private BufferedImage image;

        private ShapeEditor editorFrame;

        private int selectedPointIndex;

        public ShapePanel(final ShapeEditor editorFrame) {
            this.editorFrame = editorFrame;
            this.selectedPointIndex = -1;

            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if (editorFrame.addModeRB.isSelected()) {
                        if (selectedPointIndex >= 0) {
                            // add new major point at click
                            ArrayList<Point2D> major = editorFrame.majorPoints;
                            ArrayList<Point2D> minor = editorFrame.minorPoints;
                            Point2D newMajor = new Point2D.Double((double) e.getX() / getWidth(),
                                    (double) e.getY() / getHeight());
                            double selectedX = major.get(selectedPointIndex).getX();
                            double selectedY = major.get(selectedPointIndex).getY();
                            Point2D newMinor = new Point2D.Double(
                                    (getWidth() * selectedX + e.getX()) / (2.0 * getWidth()),
                                    (getHeight() * selectedY + e.getY()) / (2.0 * getHeight()));
                            major.add(selectedPointIndex + 1, newMajor);
                            minor.add(selectedPointIndex, newMinor);
                            selectedPointIndex++;

                            Point2D majorNext = (selectedPointIndex == (major.size() - 1))
                                    ? major.get(0)
                                    : major.get(selectedPointIndex + 1);
                            minor.get(selectedPointIndex).setLocation(
                                    0.5 * (newMajor.getX() + majorNext.getX()),
                                    0.5 * (newMajor.getY() + majorNext.getY()));

                            editorFrame.repaint();
                            return;
                        }
                    }

                    int majorIndex = getMajorPointIndex(e.getPoint());
                    if (majorIndex >= 0) {
                        if (editorFrame.deleteModeRB.isSelected()) {
                            if (editorFrame.majorPoints.size() > 1) {
                                // delete major and previous minor
                                editorFrame.majorPoints.remove(majorIndex);
                                Point2D minorToRemove = null;
                                if (majorIndex != 0) {
                                    minorToRemove = editorFrame.minorPoints.get(majorIndex - 1);
                                } else {
                                    minorToRemove = editorFrame.minorPoints
                                            .get(editorFrame.minorPoints.size() - 1);
                                }
                                double newMinorX = 0.5 * (minorToRemove.getX()
                                        + editorFrame.minorPoints.get(majorIndex).getX());
                                double newMinorY = 0.5 * (minorToRemove.getY()
                                        + editorFrame.minorPoints.get(majorIndex).getY());
                                editorFrame.minorPoints.get(majorIndex).setLocation(newMinorX,
                                        newMinorY);
                                editorFrame.minorPoints.remove(minorToRemove);
                                if (majorIndex == 0) {
                                    editorFrame.minorPoints.add(editorFrame.minorPoints.remove(0));
                                }
                                selectedPointIndex = -1;
                            }
                        } else {
                            selectedPointIndex = majorIndex;
                            editorFrame.editMajorRB.setSelected(true);
                            editorFrame.isInEditMajorMode = true;
                        }
                        editorFrame.repaint();
                        return;
                    }
                    if (!editorFrame.addModeRB.isSelected()) {
                        int minorIndex = getMinorPointIndex(e.getPoint());
                        if (minorIndex >= 0) {
                            selectedPointIndex = minorIndex;
                            editorFrame.editMinorRB.setSelected(true);
                            editorFrame.isInEditMajorMode = false;
                            editorFrame.repaint();
                            return;
                        }
                    }
                    selectedPointIndex = -1;
                    editorFrame.repaint();
                }
            });

            this.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    if (!editorFrame.editModeRB.isSelected())
                        return;

                    if (selectedPointIndex < 0)
                        return;

                    double newX = (double) e.getX() / getWidth();
                    double newY = (double) e.getY() / getHeight();

                    if (editorFrame.isInEditMajorMode) {
                        editorFrame.majorPoints.get(selectedPointIndex).setLocation(newX, newY);
                    } else {
                        editorFrame.minorPoints.get(selectedPointIndex).setLocation(newX, newY);
                    }
                    editorFrame.repaint();
                }
            });
        }

        public Point2D translate(Point2D relative) {
            return new Point2D.Double(relative.getX() * this.getWidth(),
                    relative.getY() * this.getHeight());
        }

        public int getMajorPointIndex(Point point) {
            for (int i = 0; i < this.editorFrame.majorPoints.size(); i++) {
                Point2D majorPoint = this.editorFrame.majorPoints.get(i);
                if (point.distance(this.translate(majorPoint)) < 3.0) {
                    return i;
                }
            }
            return -1;
        }

        public int getMinorPointIndex(Point point) {
            for (int i = 0; i < this.editorFrame.minorPoints.size(); i++) {
                Point2D minorPoint = this.editorFrame.minorPoints.get(i);
                if (point.distance(this.translate(minorPoint)) < 3.0) {
                    return i;
                }
            }
            return -1;
        }

        @Override
        public void paint(Graphics g) {
            Graphics2D graphics = (Graphics2D) g.create();
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            int width = this.getWidth();
            int height = this.getHeight();
            graphics.setFont(new Font("Tahoma", Font.PLAIN, 10));

            // image
            if ((this.image != null) && (this.editorFrame.isShowImage)) {
                graphics.drawImage(this.image, 0, 0, width, height, 0, 0, this.image.getWidth(),
                        this.image.getHeight(), null);
            }

            // grid
            graphics.setColor(new Color(0, 0, 0, 128));
            graphics.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL,
                    1.0f, new float[] { 3.0f, 2.0f }, 0.0f));
            for (int i = 0; i <= 10; i++) {
                int x = i * width / 10;
                graphics.drawLine(x, 0, x, height);
                int y = i * height / 10;
                graphics.drawLine(0, y, width, y);
            }

            graphics.setStroke(new BasicStroke(1.0f));
            // points
            for (int i = 0; i < this.editorFrame.majorPoints.size(); i++) {
                Point2D majorPoint = this.translate(this.editorFrame.majorPoints.get(i));
                int x = (int) majorPoint.getX();
                int y = (int) majorPoint.getY();
                this.paintOval(graphics, x, y, 3, Color.black, new Color(0, 128, 255));

                boolean isSelected = this.editorFrame.isInEditMajorMode
                        && (i == this.selectedPointIndex);
                if (isSelected) {
                    this.paintOval(graphics, x, y - 4, 1, Color.green, new Color(0, 128, 0));
                    this.paintOval(graphics, x - 4, y, 1, Color.green, new Color(0, 128, 0));
                    this.paintOval(graphics, x, y + 4, 1, Color.green, new Color(0, 128, 0));
                    this.paintOval(graphics, x + 4, y, 1, Color.green, new Color(0, 128, 0));
                }

                graphics.setColor(Color.black);
                graphics.drawString("" + i, x + 5, y);
            }

            for (int i = 0; i < this.editorFrame.minorPoints.size(); i++) {
                Point2D minorPoint = this.translate(this.editorFrame.minorPoints.get(i));
                int x = (int) minorPoint.getX();
                int y = (int) minorPoint.getY();
                this.paintOval(graphics, x, y, 3, Color.black, new Color(128, 255, 255));

                boolean isSelected = (!this.editorFrame.isInEditMajorMode)
                        && (i == this.selectedPointIndex);
                if (isSelected) {
                    this.paintOval(graphics, x, y - 4, 1, Color.green, new Color(0, 128, 0));
                    this.paintOval(graphics, x - 4, y, 1, Color.green, new Color(0, 128, 0));
                    this.paintOval(graphics, x, y + 4, 1, Color.green, new Color(0, 128, 0));
                    this.paintOval(graphics, x + 4, y, 1, Color.green, new Color(0, 128, 0));
                }

                graphics.setColor(Color.black);
                graphics.drawString("" + i, x + 5, y);
            }

            // path
            if (this.editorFrame.isShowPath) {
                CanonicalPath canonical = new CanonicalPath(this.editorFrame.majorPoints,
                        this.editorFrame.minorPoints, this.getRatio());
                GeneralPath path = canonical.getPath(width, height, 0);

                graphics.setColor(new Color(96, 0, 0, 200));
                graphics.setStroke(new BasicStroke(1.4f));
                graphics.draw(path);
            }

            graphics.dispose();
        }

        private void paintOval(Graphics2D graphics, int x, int y, int radius, Color outer,
                Color inner) {
            graphics.setColor(inner);
            graphics.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
            graphics.setColor(outer);
            graphics.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);

        }

        public double getRatio() {
            if (this.image == null)
                return 1.0;
            return (double) this.image.getWidth() / (double) this.image.getHeight();
        }
    }

    public ShapeEditor() {
        this.loadImageButton = new JButton("Load image");
        this.loadContourButton = new JButton("Load contour");
        this.showImageCB = new JCheckBox("Show image");
        this.showPathCB = new JCheckBox("Show path");
        this.editMajorRB = new JRadioButton("Edit major points");
        this.editMinorRB = new JRadioButton("Edit minor points");
        this.addModeRB = new JRadioButton("Add mode");
        this.deleteModeRB = new JRadioButton("Delete mode");
        this.editModeRB = new JRadioButton("Edit mode");
        this.saveContourButton = new JButton("Save contour");
        this.cancelButton = new JButton("Cancel");

        ButtonGroup editGroup = new ButtonGroup();
        editGroup.add(this.editMajorRB);
        editGroup.add(this.editMinorRB);

        ButtonGroup addDeleteGroup = new ButtonGroup();
        addDeleteGroup.add(this.addModeRB);
        addDeleteGroup.add(this.deleteModeRB);
        addDeleteGroup.add(this.editModeRB);

        this.editMajorRB.setSelected(true);
        this.addModeRB.setSelected(true);

        this.showPathCB.setSelected(true);
        this.isShowPath = true;
        this.showImageCB.setSelected(true);
        this.isShowImage = true;
        this.showImageCB.setEnabled(false);

        this.loadImageButton.addActionListener((ActionEvent e) -> {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            // modalize on the main frame
            int returnVal = chooser.showOpenDialog(ShapeEditor.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File selected = chooser.getSelectedFile();
                try {
                    BufferedImage image = ImageIO.read(selected);
                    shapePanel.image = image;
                    showImageCB.setEnabled(true);
                } catch (Exception exc) {
                    shapePanel.image = null;
                    showImageCB.setEnabled(false);
                }
                repaint();
            }
        });

        this.loadContourButton.addActionListener((ActionEvent e) -> {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            // modalize on the main frame
            int returnVal = chooser.showOpenDialog(ShapeEditor.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File selected = chooser.getSelectedFile();
                try {
                    CanonicalPath path = ShaperRepository.read(new FileInputStream(selected));
                    if (path != null) {
                        majorPoints = path.getMajorPoints();
                        minorPoints = path.getMinorPoints();
                    }
                } catch (Exception exc) {
                }
                repaint();
            }
        });

        this.saveContourButton.addActionListener((ActionEvent e) -> {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            // modalize on the main frame
            int returnVal = chooser.showOpenDialog(ShapeEditor.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File selected = chooser.getSelectedFile();
                try {
                    CanonicalPath path = new CanonicalPath(majorPoints, minorPoints,
                            shapePanel.getRatio());
                    ShaperRepository.write(new FileOutputStream(selected), path);
                } catch (Exception exc) {
                }
                repaint();
            }
        });

        this.showImageCB.addActionListener((ActionEvent e) -> {
            isShowImage = showImageCB.isSelected();
            repaint();
        });

        this.showPathCB.addActionListener((ActionEvent e) -> {
            isShowPath = showPathCB.isSelected();
            repaint();
        });

        this.addModeRB.addActionListener((ActionEvent e) -> {
            editMajorRB.setSelected(true);
            isInEditMajorMode = true;
            repaint();
        });

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(this.loadImageButton);
        topPanel.add(this.loadContourButton);

        JPanel midPanel = new JPanel(new GridLayout(3, 1));
        JPanel showPanel = new JPanel(new GridLayout(2, 1));
        showPanel.add(this.showImageCB);
        showPanel.add(this.showPathCB);
        showPanel.setBorder(new TitledBorder("Show controls"));
        midPanel.add(showPanel);

        JPanel editModePanel = new JPanel(new GridLayout(2, 1));
        editModePanel.add(this.editMajorRB);
        editModePanel.add(this.editMinorRB);
        editModePanel.setBorder(new TitledBorder("Major / minor mode"));
        midPanel.add(editModePanel);

        JPanel addDeleteModePanel = new JPanel(new GridLayout(3, 1));
        addDeleteModePanel.add(this.addModeRB);
        addDeleteModePanel.add(this.deleteModeRB);
        addDeleteModePanel.add(this.editModeRB);
        addDeleteModePanel.setBorder(new TitledBorder("Work mode"));
        midPanel.add(addDeleteModePanel);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(this.saveContourButton);
        bottomPanel.add(this.cancelButton);

        JPanel controlPanel = new JPanel(new BorderLayout());
        controlPanel.add(topPanel, BorderLayout.NORTH);
        controlPanel.add(midPanel, BorderLayout.CENTER);
        controlPanel.add(bottomPanel, BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(controlPanel, BorderLayout.WEST);

        this.shapePanel = new ShapePanel(this);
        this.add(this.shapePanel, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.majorPoints = new ArrayList<Point2D>();
        this.majorPoints.add(new Point2D.Double(0.5f, 0.5f));
        this.minorPoints = new ArrayList<Point2D>();
        this.minorPoints.add(new Point2D.Double(0.55f, 0.55f));
    }

    public static void main(String... args) {
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            ShapeEditor editor = new ShapeEditor();
            editor.setPreferredSize(new Dimension(600, 400));
            editor.setSize(editor.getPreferredSize());
            editor.setLocationRelativeTo(null);
            editor.setVisible(true);
        });
    }

}
