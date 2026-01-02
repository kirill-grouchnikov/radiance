/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.check;

import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.swing.SwingComponentTimeline;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintCallback;
import org.pushingpixels.radiance.demo.theming.main.check.command.ChainCommand;
import org.pushingpixels.radiance.demo.theming.main.check.command.ConfigurationCommand;
import org.pushingpixels.radiance.demo.theming.main.check.command.DisableCommand;
import org.pushingpixels.radiance.demo.theming.main.check.command.SelectCommand;
import org.pushingpixels.radiance.demo.theming.main.check.svg.flags.*;
import org.pushingpixels.radiance.demo.theming.main.check.svg.help_black_24dp;
import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.edit_cut;
import org.pushingpixels.radiance.demo.theming.main.check.svg.vaadin.bullseye;
import org.pushingpixels.radiance.demo.theming.main.check.svg.vaadin.button;
import org.pushingpixels.radiance.demo.theming.main.check.svg.vaadin.check_square_o;
import org.pushingpixels.radiance.demo.theming.main.check.svg.vaadin.dot_circle;
import org.pushingpixels.radiance.theming.api.ContainerColorTokensOverlay;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.FocusKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.Side;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.util.EnumSet;

/**
 * Test application panel for testing {@link JButton}, {@link JToggleButton}, {@link JRadioButton}
 * and {@link JCheckBox} components.
 *
 * @author Kirill Grouchnikov
 */
public class ButtonsPanel extends JPanel implements SkinDependent {
    /**
     * The default button.
     */
    public JButton defaultButton;

    /**
     * A configure command that removes the focus painting from the specified button.
     *
     * @author Kirill Grouchnikov
     */
    private static class NoFocusCommand implements ConfigurationCommand<AbstractButton> {
        @Override
        public void configure(AbstractButton ab) {
            ab.setFocusPainted(false);
        }
    }

    /**
     * A configure command that sets a 5-pixel margin on the specified button.
     *
     * @author Kirill Grouchnikov
     */
    private static class MarginCommand implements ConfigurationCommand<AbstractButton> {
        @Override
        public void configure(AbstractButton ab) {
            ab.setMargin(new Insets(5, 5, 5, 5));
        }
    }

    /**
     * A configure command that sets the specified text on the specified button.
     *
     * @author Kirill Grouchnikov
     */
    private static class TextCommand implements ConfigurationCommand<AbstractButton> {
        /**
         * Text to set.
         */
        private String text;

        /**
         * Creates a text configuration command.
         *
         * @param text Text to set.
         */
        public TextCommand(String text) {
            this.text = text;
        }

        @Override
        public void configure(AbstractButton ab) {
            ab.setText(this.text);
        }
    }

    /**
     * A configure command that sets the specified tooltip text on the specified button.
     *
     * @author Kirill Grouchnikov
     */
    private static class TooltipTextCommand implements ConfigurationCommand<AbstractButton> {
        /**
         * Tooltip text to set.
         */
        private String tooltipText;

        /**
         * Creates a tooltip text configuration command.
         *
         * @param tooltipText Tooltip text to set.
         */
        public TooltipTextCommand(String tooltipText) {
            this.tooltipText = tooltipText;
        }

        @Override
        public void configure(AbstractButton ab) {
            ab.setToolTipText(this.tooltipText);
        }
    }

    /**
     * A configure command that sets a popup menu handler on the specified button.
     *
     * @author Kirill Grouchnikov
     */
    private static class PopupMenuCommand implements ConfigurationCommand<AbstractButton> {
        @Override
        public void configure(AbstractButton ab) {
            ab.addMouseListener(new MousePopupListener(ab));
        }
    }

    private static class StaticSurfacePainterOverlayCommand implements ConfigurationCommand<JComponent> {
        @Override
        public void configure(JComponent component) {
            RadianceThemingCortex.ComponentScope.setSurfacePainterOverlay(component,
                (g, comp, width, height, scaleFactor, outline, colorTokens) -> {
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.clip(outline);

                    Color start1 = colorTokens.getContainerSurfaceLow();
                    Color start2 = colorTokens.getContainerSurface();
                    Color end1 = colorTokens.getContainerSurface();
                    Color end2 = colorTokens.getContainerSurfaceHigh();

                    int cellDim = (int) (8 * scaleFactor);

                    int rows = (int) Math.ceil(height / cellDim);
                    int columns = (int) Math.ceil(width / cellDim);
                    for (int col = 0; col <= columns; col++) {
                        double colFactor = (double) col / (double) columns;
                        Color alt1 = new Color(
                            start1.getRed() + (int) (colFactor) * (end1.getRed() - start1.getRed()),
                            start1.getGreen() + (int) (colFactor) * (end1.getGreen() - start1.getGreen()),
                            start1.getBlue() + (int) (colFactor) * (end1.getBlue() - start1.getBlue()));
                        Color alt2 = new Color(
                            start2.getRed() + (int) (colFactor) * (end2.getRed() - start2.getRed()),
                            start2.getGreen() + (int) (colFactor) * (end2.getGreen() - start2.getGreen()),
                            start2.getBlue() + (int) (colFactor) * (end2.getBlue() - start2.getBlue()));

                        for (int row = 0; row <= rows; row++) {
                            Color cellColor = ((col + row) % 2 == 0) ? alt1 : alt2;
                            g2d.setColor(cellColor);
                            g2d.fillRect(col * cellDim, row * cellDim, cellDim, cellDim);
                        }
                    }
                    g2d.dispose();
                });
        }
    }

    private static class AnimatedSurfacePainterOverlayCommand implements ConfigurationCommand<JComponent> {
        private float animationPosition;

        @Override
        public void configure(JComponent component) {
            Timeline timeline = SwingComponentTimeline.componentBuilder(component)
                .addPropertyToInterpolate(Timeline.<Float>property("animationPosition")
                    .from(-4.0f).to(5.0f)
                    .setWith((obj, fieldName, value) -> {
                        animationPosition = value;
                    }))
                .addCallback(new SwingRepaintCallback(component))
                .setDuration(2000)
                .build();
            timeline.playLoop(Timeline.RepeatBehavior.LOOP);

            RadianceThemingCortex.ComponentScope.setSurfacePainterOverlay(component,
                (g, comp, width, height, scaleFactor, outline, colorTokens) -> {
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.clip(outline);

                    Color start = colorTokens.isDark()
                        ? colorTokens.getContainerSurfaceHighest()
                        : colorTokens.getContainerSurfaceLowest();
                    Color end = colorTokens.isDark()
                        ? colorTokens.getContainerSurfaceLowest()
                        : colorTokens.getContainerSurfaceHighest();

                    int cellDim = (int) (6.0f * scaleFactor);
                    double dotDiameter = Math.ceil(3.0f * scaleFactor);

                    int rows = (int) Math.ceil(height / cellDim);
                    int columns = (int) Math.ceil(width / cellDim);
                    for (int col = 0; col <= columns; col++) {
                        double colFactor = (double) col / (double) columns;
                        double intensity =
                            Math.abs(colFactor - animationPosition);
                        intensity = Math.min(1.0, Math.max(0.0, intensity));
                        Color cellColor = new Color(
                            start.getRed() + (int) (intensity * (end.getRed() - start.getRed())),
                            start.getGreen() + (int) (intensity * (end.getGreen() - start.getGreen())),
                            start.getBlue() + (int) (intensity * (end.getBlue() - start.getBlue())));

                        g2d.setColor(cellColor);
                        double dotCenterX = (col + 0.6) * cellDim;

                        for (int row = 0; row <= rows; row++) {
                            double dotCenterY = (row + ((col % 2 == 0) ? 0.5 : 0.0)) * cellDim;
                            g2d.fill(new Ellipse2D.Double(dotCenterX - dotDiameter / 2.0,
                                dotCenterY - dotDiameter / 2.0, dotDiameter, dotDiameter));
                        }
                    }
                    g2d.dispose();
                });
        }
    }

    private static class AnimatedRolloverSurfacePainterOverlayCommand implements ConfigurationCommand<JComponent> {
        private float animationPosition;
        private float alpha;

        @Override
        public void configure(JComponent component) {
            Timeline timeline = SwingComponentTimeline.componentBuilder(component)
                .addPropertyToInterpolate(Timeline.<Float>property("animationPosition")
                    .from(-4.0f).to(5.0f)
                    .setWith((obj, fieldName, value) -> {
                        animationPosition = value;
                    }))
                .addCallback(new SwingRepaintCallback(component))
                .setDuration(2000)
                .build();
            timeline.playLoop(Timeline.RepeatBehavior.LOOP);

            Timeline alphaTimeline = SwingComponentTimeline.componentBuilder(component)
                .addPropertyToInterpolate(Timeline.<Float>property("alpha")
                    .from(0.0f).to(1.0f)
                    .setWith((obj, fieldName, value) -> {
                        alpha = value;
                    }))
                .addCallback(new SwingRepaintCallback(component))
                .setDuration(500)
                .build();

            component.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    alphaTimeline.play();
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    alphaTimeline.playReverse();
                }
            });

            RadianceThemingCortex.ComponentScope.setSurfacePainterOverlay(component,
                (g, comp, width, height, scaleFactor, outline, colorTokens) -> {
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.clip(outline);
                    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));

                    Color start = colorTokens.isDark()
                        ? colorTokens.getContainerSurfaceHighest()
                        : colorTokens.getContainerSurfaceLowest();
                    Color end = colorTokens.isDark()
                        ? colorTokens.getContainerSurfaceLowest()
                        : colorTokens.getContainerSurfaceHighest();

                    int cellDim = (int) (6.0f * scaleFactor);
                    double dotDiameter = Math.ceil(3.0f * scaleFactor);

                    int rows = (int) Math.ceil(height / cellDim);
                    int columns = (int) Math.ceil(width / cellDim);
                    for (int col = 0; col <= columns; col++) {
                        double colFactor = (double) col / (double) columns;
                        double intensity =
                            Math.abs(colFactor - animationPosition);
                        intensity = Math.min(1.0, Math.max(0.0, intensity));
                        Color cellColor = new Color(
                            start.getRed() + (int) (intensity * (end.getRed() - start.getRed())),
                            start.getGreen() + (int) (intensity * (end.getGreen() - start.getGreen())),
                            start.getBlue() + (int) (intensity * (end.getBlue() - start.getBlue())));

                        g2d.setColor(cellColor);
                        double dotCenterX = (col + 0.6) * cellDim;

                        for (int row = 0; row <= rows; row++) {
                            double dotCenterY = (row + ((col % 2 == 0) ? 0.5 : 0.0)) * cellDim;
                            g2d.fill(new Ellipse2D.Double(dotCenterX - dotDiameter / 2.0,
                                dotCenterY - dotDiameter / 2.0, dotDiameter, dotDiameter));
                        }
                    }
                    g2d.dispose();
                });
        }
    }

    private static class AnimatedArrowsSurfacePainterOverlayCommand implements ConfigurationCommand<JComponent> {
        private float animationPosition;

        private static final boolean[][] ARROW_MASK = {
            { true, true, true, false, false},
            { false, true, true, true, false},
            { false, false, true, true, true},
            { false, true, true, true, false},
            { true, true, true, false, false},
        };

        private static final int ARROW_SIZE = 5;
        private static final int ARROW_GAP = 2;
        private static final int ROWS = 7;

        @Override
        public void configure(JComponent component) {
            if ((component instanceof JCheckBox) || (component instanceof JRadioButton)) {
                return;
            }

            Timeline timeline = SwingComponentTimeline.componentBuilder(component)
                .addPropertyToInterpolate(Timeline.<Float>property("animationPosition")
                    .from(0.0f).to(1.0f)
                    .setWith((obj, fieldName, value) -> {
                        animationPosition = value;
                    }))
                .addCallback(new SwingRepaintCallback(component))
                .setDuration(500)
                .build();
            timeline.playLoop(Timeline.RepeatBehavior.LOOP);

            Color[] offColors = new Color[ROWS];
            Color[] onColors = new Color[ROWS];

            RadianceThemingCortex.ComponentScope.setSurfacePainterOverlay(component,
                (g, comp, width, height, scaleFactor, outline, colorTokens) -> {
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.clip(outline);

                    double dotSize = height / (double) (2 * ROWS + 1);
                    int columns = (int) Math.floor((width - 2 * dotSize) / dotSize);
                    double verticalMargin = dotSize;
                    double horizontalMargin = (width - columns * dotSize) / 2.0;

                    Color offTop = colorTokens.isDark()
                        ? colorTokens.getContainerSurfaceHighest()
                        : colorTokens.getContainerSurfaceLowest();
                    Color offBottom = colorTokens.getContainerSurface();

                    Color on = colorTokens.getOnContainerVariant();

                    for (int row = 0; row < ROWS; row++) {
                        double rowFactor = (double) row / (double) ROWS;
                        offColors[row] = new Color(
                            offTop.getRed() + (int) (rowFactor * (offBottom.getRed() - offTop.getRed())),
                            offTop.getGreen() + (int) (rowFactor * (offBottom.getGreen() - offTop.getGreen())),
                            offTop.getBlue() + (int) (rowFactor * (offBottom.getBlue() - offTop.getBlue())));
                        onColors[row] = new Color(
                            (2 * offColors[row].getRed() + on.getRed()) / 3,
                            (2 * offColors[row].getGreen() + on.getGreen()) / 3,
                            (2 * offColors[row].getBlue() + on.getBlue()) / 3);
                    }

                    int firstArrowColumn = (int) (animationPosition * (ARROW_SIZE + ARROW_GAP));
                    for (int col = 0; col <= columns; col++) {
                        int columnWithinArrow =
                            (ARROW_SIZE + ARROW_GAP + col - firstArrowColumn) % (ARROW_SIZE + ARROW_GAP);
                        boolean isInVerticalGap = (columnWithinArrow >= ARROW_SIZE);

                        double dotCenterX = horizontalMargin + 2 * (col + 0.5) * dotSize;

                        for (int row = 0; row < ROWS; row++) {
                            boolean isInArrow = false;
                            if (!isInVerticalGap) {
                                isInArrow = (row >= 1) && (row < (ROWS - 1))
                                    && ARROW_MASK[row - 1][columnWithinArrow];
                            }

                            Color cellColor = isInArrow ? onColors[row] : offColors[row];
                            g2d.setColor(cellColor);

                            double dotCenterY =
                                verticalMargin + 2 * (row + 0.5) * dotSize - 0.5 * dotSize;
                            g2d.fill(new Ellipse2D.Double(dotCenterX - dotSize / 2.0,
                                dotCenterY - dotSize / 2.0, dotSize, dotSize));
                        }
                    }
                    g2d.dispose();
                });
        }
    }

    private static class AnimatedOutlinePainterOverlayCommand implements ConfigurationCommand<JComponent> {
        private float animationPosition;

        @Override
        public void configure(JComponent component) {
            Timeline timeline = SwingComponentTimeline.componentBuilder(component)
                .addPropertyToInterpolate(Timeline.<Float>property("animationPosition")
                    .from(-2.0f).to(3.0f)
                    .setWith((obj, fieldName, value) -> {
                        animationPosition = value;
                    }))
                .addCallback(new SwingRepaintCallback(component))
                .setDuration(2000)
                .build();
            timeline.playLoop(Timeline.RepeatBehavior.LOOP);

            RadianceThemingCortex.ComponentScope.setOutlinePainterOverlay(component,
                (g, comp, width, height, scaleFactor, shapeSupplier, colorTokens) -> {
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.translate(0.5f, 0.5f);

                    double intensity = 2.0f * Math.abs(0.5f - animationPosition);
                    intensity = 1.0f - Math.min(1.0, Math.max(0.0, intensity));
                    Color accented = colorTokens.getAccentOnContainer();
                    Color outlineColor = new Color(accented.getRed(), accented.getGreen(),
                        accented.getBlue(), (int) (255 * intensity));
                    g2d.setColor(outlineColor);

                    Path2D outlinePath = new Path2D.Float(Path2D.WIND_EVEN_ODD);
                    Shape outlineOuterShape = shapeSupplier.getShape(comp, width, height, -0.5f,
                        0.0f, scaleFactor);
                    Shape outlineInnerShape = shapeSupplier.getShape(comp, width, height, 2.0f - 0.5f,
                        0.0f, scaleFactor);
                    outlinePath.append(outlineOuterShape, false);
                    outlinePath.append(outlineInnerShape, false);
                    g2d.fill(outlinePath);

                    g2d.dispose();
                });
        }
    }

    private static class SystemContainerColorTokenOverlayCommand implements ConfigurationCommand<JComponent> {
        private RadianceThemingSlices.SystemContainerType systemContainerType;

        public SystemContainerColorTokenOverlayCommand(RadianceThemingSlices.SystemContainerType systemContainerType) {
            this.systemContainerType = systemContainerType;
        }

        @Override
        public void configure(JComponent component) {
            RadianceThemingCortex.ComponentScope.setContainerColorTokensOverlayProvider(component,
                ContainerColorTokensOverlay.defaultSystemOverlayProvider(systemContainerType));
        }
    }

    private static class ContainerColorTokenOverlayCommand implements ConfigurationCommand<JComponent> {
        private Color seed;

        public ContainerColorTokenOverlayCommand(Color seed) {
            this.seed = seed;
        }

        @Override
        public void configure(JComponent component) {
            RadianceThemingCortex.ComponentScope.setContainerColorTokensOverlayProvider(component,
                ContainerColorTokensOverlay.defaultOverlayProvider(seed));
        }
    }

    /**
     * A configure command that sets the specified font on the specified button.
     *
     * @author Kirill Grouchnikov
     */
    private static class FontCommand implements ConfigurationCommand<AbstractButton> {
        /**
         * Font to set.
         */
        private Font font;

        /**
         * Creates a font configuration command.
         *
         * @param font Font to set.
         */
        public FontCommand(Font font) {
            this.font = font;
        }

        @Override
        public void configure(AbstractButton ab) {
            ab.setFont(this.font);
        }
    }

    /**
     * A configure command that sets the specified icon on the specified button.
     *
     * @author Kirill Grouchnikov
     */
    private static class IconCommand implements ConfigurationCommand<AbstractButton> {
        /**
         * Icon to set.
         */
        private Icon icon;

        /**
         * Creates an icon configuration command.
         *
         * @param icon Icon to set.
         */
        public IconCommand(Icon icon) {
            this.icon = icon;
        }

        @Override
        public void configure(AbstractButton ab) {
            if ((ab instanceof JRadioButton) || (ab instanceof JCheckBox))
                return;
            ab.setIcon(this.icon);
        }
    }

    /**
     * A configure command that marks the button to not have content area filled.
     *
     * @author Kirill Grouchnikov
     */
    private static class NoContentAreaFilledCommand implements ConfigurationCommand<AbstractButton> {
        @Override
        public void configure(AbstractButton ab) {
            ab.setContentAreaFilled(false);
        }
    }

    /**
     * A configure command that marks the button to not have border painted.
     *
     * @author Kirill Grouchnikov
     */
    private static class NoBorderPaintedCommand implements ConfigurationCommand<AbstractButton> {
        @Override
        public void configure(AbstractButton ab) {
            ab.setBorderPainted(false);
        }
    }

    /**
     * Returns a row of buttons, consisting of {@link JButton}, {@link JToggleButton},
     * {@link JCheckBox} and {@link JRadioButton} in default states.
     *
     * @return A row of buttons, consisting of {@link JButton}, {@link JToggleButton},
     * {@link JCheckBox} and {@link JRadioButton} in default states.
     */
    private AbstractButton[] getRow() {
        AbstractButton[] result = new AbstractButton[4];
        result[0] = new JButton("sample");
        result[0].setName("Button " + rowCount);
        result[1] = new JToggleButton("sample");
        result[1].setName("Toggle " + rowCount);
        result[2] = new JCheckBox("sample");
        result[2].setName("Check " + rowCount);
        result[3] = new JRadioButton("sample");
        result[3].setName("Radio " + rowCount);
        rowCount++;
        return result;
    }

    private int rowCount = 0;

    /**
     * Adds a row of buttons configured with the specified text, icon and configuration command.
     *
     * @param builder Form builder.
     * @param label   Text to set.
     * @param icon    Icon to set.
     * @param cmd     Configuration command to apply.
     */
    private void addRow(TestFormLayoutBuilder builder, String label, Icon icon,
            ConfigurationCommand<? super AbstractButton> cmd) {
        this.addRow(builder, label, icon, cmd, null);
    }

    /**
     * Adds a row of buttons configured with the specified text, icon and configuration command.
     *
     * @param builder Form builder.
     * @param label   Text to set.
     * @param icon    Icon to set.
     * @param cmd     Configuration command to apply.
     */
    private void addRow(TestFormLayoutBuilder builder, String label, Icon icon,
            ConfigurationCommand<? super AbstractButton> cmd, ConfigurationCommand<JLabel> labelCmd) {
        AbstractButton[] row = this.getRow();
        if (cmd != null) {
            for (AbstractButton ab : row) {
                cmd.configure(ab);
            }
        }

        JLabel jl = new JLabel(label);
        if (labelCmd != null) {
            labelCmd.configure(jl);
        }
        if (icon != null) {
            jl.setIcon(icon);
        }
        builder.append(jl);
        for (AbstractButton ab : row) {
            builder.append(ab);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void reload() {
        this.removeAll();

        this.setLayout(new BorderLayout());

        RadianceSkin skin = RadianceThemingCortex.ComponentScope.getCurrentSkin(this);
        Color textColor = skin.getNeutralContainerTokens(this).getOnContainer();

        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
            "right:pref, 10dlu, left:pref:grow(1), 4dlu, left:pref:grow(1), 4dlu, " +
                "left:pref:grow(1), 4dlu, left:pref:grow(1)", 5, 85).padding(Paddings.DIALOG);

        builder.append("");

        JLabel bLabel = new JLabel("Buttons");
        bLabel.setIcon(button.of(12, 12));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(bLabel,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);

        JLabel tbLabel = new JLabel("Toggle buttons");
        tbLabel.setIcon(bullseye.of(12, 12));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(tbLabel,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);

        JLabel cbLabel = new JLabel("Checkboxes");
        cbLabel.setIcon(check_square_o.of(12, 12));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(cbLabel,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);

        JLabel rbLabel = new JLabel("Radio buttons");
        rbLabel.setIcon(dot_circle.of(12, 12));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(rbLabel,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);

        builder.append(bLabel, tbLabel);
        builder.append(cbLabel, rbLabel);

        builder.appendSeparator("Regular settings");
        this.addRow(builder, "Enabled", null, null);
        this.addRow(builder, "Disabled", null, new DisableCommand());
        this.addRow(builder, "Selected", null, new SelectCommand());
        this.addRow(builder, "Disabled selected", null,
            new ChainCommand<>(new DisableCommand(), new SelectCommand()));
        this.addRow(builder, "HTML text", null,
            new TextCommand("<html><font color='" + RadianceColorUtilities.encode(textColor) +
                "'>text <b>text</b></font> <font color='red'>text</font>"));
        this.addRow(builder, "Long text", null, new TextCommand("Some long long text"));
        this.addRow(builder, "With tooltip", null, new TooltipTextCommand("Sample tooltip"));
        this.addRow(builder, "Disabled with tooltip", null,
            new ChainCommand(new TooltipTextCommand("Sample tooltip"), new DisableCommand()));
        this.addRow(builder, "Popup menu", null, new PopupMenuCommand());
        this.addRow(builder, "With icon", se.of(16, 16), new IconCommand(se.of(16, 16)));
        this.addRow(builder, "With icon (disabled)", se.of(16, 16),
            new ChainCommand<>(
                (AbstractButton ab) -> ab.setEnabled(false),
                new IconCommand(se.of(16, 16))));
        this.addRow(builder, "Themed follow color tokens", edit_cut.of(16, 16),
            new ChainCommand<>(new IconCommand(edit_cut.of(16, 16)),
                (AbstractButton ab) ->
                    RadianceThemingCortex.ComponentScope.setIconFilterStrategies(ab,
                        RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_TOKENS,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_TOKENS)),
            (JLabel label) -> RadianceThemingCortex.ComponentScope.setIconFilterStrategies(label,
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_TOKENS,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_TOKENS));
        this.addRow(builder, "Themed follow text", help_black_24dp.of(16, 16),
            new ChainCommand<>(new IconCommand(help_black_24dp.of(16, 16)),
                (AbstractButton ab) ->
                    RadianceThemingCortex.ComponentScope.setIconFilterStrategies(ab,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT)),
            (JLabel label) -> RadianceThemingCortex.ComponentScope.setIconFilterStrategies(label,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT));
        this.addRow(builder, "Themed follow text (disabled)", help_black_24dp.of(16, 16),
            new ChainCommand<>(
                new IconCommand(help_black_24dp.of(16, 16)),
                (AbstractButton ab) -> ab.setEnabled(false),
                (AbstractButton ab) ->
                    RadianceThemingCortex.ComponentScope.setIconFilterStrategies(ab,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT)),
            (JLabel label) -> RadianceThemingCortex.ComponentScope.setIconFilterStrategies(label,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT));

        builder.appendSeparator("Painter overlays");
        this.addRow(builder, "Static surface mosaic", null,
            new StaticSurfacePainterOverlayCommand());
        this.addRow(builder, "Static surface mosaic on selected", null,
            new ChainCommand<>(new StaticSurfacePainterOverlayCommand(), new SelectCommand()));
        this.addRow(builder, "Animated surface dots", null,
            new AnimatedSurfacePainterOverlayCommand());
        this.addRow(builder, "Animated surface dots on rollover", null,
            new AnimatedRolloverSurfacePainterOverlayCommand());
        this.addRow(builder, "Animated surface arrows", null,
            new AnimatedArrowsSurfacePainterOverlayCommand());
        this.addRow(builder, "Animated outline pass", null,
            new AnimatedOutlinePainterOverlayCommand());

        builder.appendSeparator("Container color token overlays");
        this.addRow(builder, "Info", null,
            new SystemContainerColorTokenOverlayCommand(RadianceThemingSlices.SystemContainerType.INFO));
        this.addRow(builder, "Warning", null,
            new SystemContainerColorTokenOverlayCommand(RadianceThemingSlices.SystemContainerType.WARNING));
        this.addRow(builder, "Error", null,
            new SystemContainerColorTokenOverlayCommand(RadianceThemingSlices.SystemContainerType.ERROR));
        this.addRow(builder, "Success", null,
            new SystemContainerColorTokenOverlayCommand(RadianceThemingSlices.SystemContainerType.SUCCESS));
        this.addRow(builder, "Orange", null,
            new ContainerColorTokenOverlayCommand(new Color(0xFFFFA53F)));
        this.addRow(builder, "Purple", null,
            new ContainerColorTokenOverlayCommand(new Color(0xFFD291FF)));
        this.addRow(builder, "Info + flat", null,
            new ChainCommand<>(
                new SystemContainerColorTokenOverlayCommand(RadianceThemingSlices.SystemContainerType.INFO),
                (JComponent jc) -> RadianceThemingCortex.ComponentOrParentScope
                    .setBackgroundAppearanceStrategy(jc, RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)));
        this.addRow(builder, "Warning + flat", null,
            new ChainCommand<>(
                new SystemContainerColorTokenOverlayCommand(RadianceThemingSlices.SystemContainerType.WARNING),
                (JComponent jc) -> RadianceThemingCortex.ComponentOrParentScope
                    .setBackgroundAppearanceStrategy(jc, RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)));
        this.addRow(builder, "Error + flat", null,
            new ChainCommand<>(
                new SystemContainerColorTokenOverlayCommand(RadianceThemingSlices.SystemContainerType.ERROR),
                (JComponent jc) -> RadianceThemingCortex.ComponentOrParentScope
                    .setBackgroundAppearanceStrategy(jc, RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)));
        this.addRow(builder, "Success + flat", null,
            new ChainCommand<>(
                new SystemContainerColorTokenOverlayCommand(RadianceThemingSlices.SystemContainerType.SUCCESS),
                (JComponent jc) -> RadianceThemingCortex.ComponentOrParentScope
                    .setBackgroundAppearanceStrategy(jc, RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)));
        this.addRow(builder, "Orange + flat", null,
            new ChainCommand<>(
                new ContainerColorTokenOverlayCommand(new Color(0xFFFFA53F)),
                (JComponent jc) -> RadianceThemingCortex.ComponentOrParentScope
                    .setBackgroundAppearanceStrategy(jc, RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)));
        this.addRow(builder, "Purple + flat", null,
            new ChainCommand<>(
                new ContainerColorTokenOverlayCommand(new Color(0xFFD291FF)),
                (JComponent jc) -> RadianceThemingCortex.ComponentOrParentScope
                    .setBackgroundAppearanceStrategy(jc, RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)));

        builder.appendSeparator("Focus indications");
        this.addRow(builder, "No focus painted", null, new NoFocusCommand());
        this.addRow(builder, "None", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentOrParentChainScope.setFocusKind(ab,
                FocusKind.NONE));
        this.addRow(builder, "Text", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentOrParentChainScope.setFocusKind(ab,
                FocusKind.TEXT));
        this.addRow(builder, "All", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentOrParentChainScope.setFocusKind(ab,
                FocusKind.ALL));
        this.addRow(builder, "All inner", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentOrParentChainScope.setFocusKind(ab,
                FocusKind.ALL_INNER));
        this.addRow(builder, "All strong inner", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentOrParentChainScope.setFocusKind(ab,
                FocusKind.ALL_STRONG_INNER));
        this.addRow(builder, "Underline", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentOrParentChainScope.setFocusKind(ab,
                FocusKind.UNDERLINE));
        this.addRow(builder, "Strong underline", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentOrParentChainScope.setFocusKind(ab,
                FocusKind.STRONG_UNDERLINE));

        builder.appendSeparator("Size settings");
        this.addRow(builder, "No min size", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentOrParentScope
                .setButtonIgnoreMinimumSize(ab, true));
        this.addRow(builder, "Custom margin", null, new MarginCommand());

        builder.appendSeparator("Side settings");
        this.addRow(builder, "Straight top", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentScope.setButtonStraightSide(ab,
                Side.TOP));
        this.addRow(builder, "Straight bottom", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentScope.setButtonStraightSide(ab,
                Side.BOTTOM));
        this.addRow(builder, "Straight leading", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentScope.setButtonStraightSides(ab,
                EnumSet.of(Side.LEADING)));
        this.addRow(builder, "Straight trailing", null,
            (AbstractButton ab) -> RadianceThemingCortex.ComponentScope.setButtonStraightSides(ab,
                EnumSet.of(Side.TRAILING)));

        this.addRow(builder, "Open top", null,
            new ChainCommand<>(
                (AbstractButton ab) -> RadianceThemingCortex.ComponentScope
                    .setButtonStraightSide(ab, Side.TOP),
                (AbstractButton ab) -> RadianceThemingCortex.ComponentScope.setButtonOpenSide(ab,
                    Side.TOP)));
        this.addRow(builder, "Open bottom", null,
            new ChainCommand<>(
                (AbstractButton ab) -> RadianceThemingCortex.ComponentScope
                    .setButtonStraightSide(ab, Side.BOTTOM),
                (AbstractButton ab) -> RadianceThemingCortex.ComponentScope.setButtonOpenSide(ab,
                    Side.BOTTOM)));
        this.addRow(builder, "Open leading", null,
            new ChainCommand<>(
                (AbstractButton ab) -> RadianceThemingCortex.ComponentScope
                    .setButtonStraightSides(ab, EnumSet.of(Side.LEADING)),
                (AbstractButton ab) -> RadianceThemingCortex.ComponentScope.setButtonOpenSides(ab,
                    EnumSet.of(Side.LEADING))));
        this.addRow(builder, "Open right", null,
            new ChainCommand<>(
                (AbstractButton ab) -> RadianceThemingCortex.ComponentScope
                    .setButtonStraightSides(ab, EnumSet.of(Side.TRAILING)),
                (AbstractButton ab) -> RadianceThemingCortex.ComponentScope.setButtonOpenSides(ab,
                    EnumSet.of(Side.TRAILING))));

        builder.appendSeparator("Unicode texts");
        this.addRow(builder, "Hebrew", null, new ChainCommand<>(
            new TextCommand("\u05D0\u05D1\u05D2"), new IconCommand(il.of(16, 16))));
        this.addRow(builder, "Chinese", null,
            new ChainCommand<>(
                new TextCommand("\u4E01\u4E02\u4E03"), new IconCommand(cn.of(16, 16))));
        this.addRow(builder, "Japanese", null,
            new ChainCommand<>(
                new TextCommand("\u30A2\u30B2\u30C2"), new IconCommand(jp.of(16, 16))));
        this.addRow(builder, "Cyrillic", null, new ChainCommand<>(
            new TextCommand("\u0430\u0431\u0432"), new IconCommand(ru.of(16, 16))));
        this.addRow(builder, "Greek", null, new ChainCommand<>(
            new TextCommand("\u03B1\u03B2\u03B3"), new IconCommand(gr.of(16, 16))));
        this.addRow(builder, "Latin", null, new ChainCommand<>(
            new TextCommand("\u00E6\u00F0\u0127\u2248"), new IconCommand(it.of(16, 16))));

        builder.appendSeparator("Misc settings");
        this.addRow(builder, "No content area", null, new NoContentAreaFilledCommand());
        this.addRow(builder, "No border", null, new NoBorderPaintedCommand());
        this.addRow(builder, "No background", null, new ChainCommand<>(
            new NoContentAreaFilledCommand(), new NoBorderPaintedCommand()));
        this.addRow(builder, "Flat", null, (JComponent jc) -> RadianceThemingCortex.ComponentOrParentScope
            .setBackgroundAppearanceStrategy(jc, RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT));
        this.addRow(builder, "Flat + disabled", null, new ChainCommand<>(
            (JComponent jc) -> RadianceThemingCortex.ComponentOrParentScope
                .setBackgroundAppearanceStrategy(jc, RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT),
            new DisableCommand()));
        this.addRow(builder, "Never", null,
            (JComponent jc) -> RadianceThemingCortex.ComponentOrParentScope
                .setBackgroundAppearanceStrategy(jc, RadianceThemingSlices.BackgroundAppearanceStrategy.NEVER));
        this.addRow(builder, "Never + disabled", null, new ChainCommand<>(
            (JComponent jc) -> RadianceThemingCortex.ComponentOrParentScope
                .setBackgroundAppearanceStrategy(jc, RadianceThemingSlices.BackgroundAppearanceStrategy.NEVER),
            new DisableCommand()));

        this.addRow(builder, "Fixed font", null,
            new FontCommand(new Font("Arial", Font.PLAIN, 12)));
        this.addRow(builder, "Null text", null, new TextCommand(null));
        this.addRow(builder, "Empty text", null, new TextCommand(""));

        JPanel panel = builder.build();
        JScrollPane jsp = new JScrollPane(panel);
        RadianceThemingCortex.ComponentScope.setAutomaticScrollPresence(jsp, true);
        this.add(jsp, BorderLayout.CENTER);
    }

    /**
     * Creates a new button panel.
     */
    public ButtonsPanel() {
        this.reload();
    }
}
