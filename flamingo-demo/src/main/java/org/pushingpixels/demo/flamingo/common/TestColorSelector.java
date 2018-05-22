package org.pushingpixels.demo.flamingo.common;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.metal.MetalLookAndFeel;

import org.pushingpixels.demo.flamingo.common.LocaleSwitcher.LocaleCallback;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandMenuButton;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu;

public class TestColorSelector extends JFrame {
    Color bColor;

    protected ResourceBundle resourceBundle;

    protected Locale currLocale;

    protected JPanel centerPanel;

    public TestColorSelector() {
        JPanel top = new JPanel(new FlowLayout());

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle.getBundle("org.pushingpixels.demo.flamingo.resource.Resources", currLocale);

        centerPanel = new JPanel();
        bColor = centerPanel.getBackground();

        this.add(top, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);

        final JCheckBox hasTheme = new JCheckBox("theme");
        hasTheme.setSelected(true);
        final JCheckBox hasStandard = new JCheckBox("standard");
        hasStandard.setSelected(true);
        final JCheckBox hasRecent = new JCheckBox("recent");
        hasRecent.setSelected(true);

        final ColorIcon colorIcon = new ColorIcon(bColor);

        JCommandButton jcb = new JCommandButton(colorIcon);
        jcb.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
        jcb.setDisplayState(CommandButtonDisplayState.SMALL);
        jcb.setFlat(false);

        final JColorSelectorPopupMenu.ColorSelectorCallback callback = new JColorSelectorPopupMenu.ColorSelectorCallback() {
            @Override
            public void onColorSelected(Color color) {
                bColor = color;
                centerPanel.setBackground(bColor);
                colorIcon.setColor(bColor);
            }

            @Override
            public void onColorRollover(Color color) {
                if (color != null) {
                    centerPanel.setBackground(color);
                } else {
                    centerPanel.setBackground(bColor);
                    colorIcon.setColor(bColor);
                }
            }
        };

        final Color defaultPanelColor = centerPanel.getBackground();
        jcb.setPopupCallback((JCommandButton commandButton) -> {
            JColorSelectorPopupMenu result = new JColorSelectorPopupMenu(callback);
            final JCommandMenuButton automaticColor = new JCommandMenuButton(
                    resourceBundle.getString("ColorSelector.textAutomatic"),
                    new ColorIcon(defaultPanelColor));
            automaticColor.getActionModel().addActionListener((ActionEvent e) -> {
                callback.onColorSelected(defaultPanelColor);
                JColorSelectorPopupMenu.addColorToRecentlyUsed(defaultPanelColor);
            });
            automaticColor.getActionModel().addChangeListener(new ChangeListener() {
                boolean wasRollover = automaticColor.getActionModel().isRollover();

                @Override
                public void stateChanged(ChangeEvent e) {
                    boolean isRollover = automaticColor.getActionModel().isRollover();
                    if (wasRollover && !isRollover) {
                        callback.onColorRollover(null);
                    }
                    if (!wasRollover && isRollover) {
                        callback.onColorRollover(Color.black);
                    }
                    wasRollover = isRollover;
                }
            });
            result.addMenuButton(automaticColor);

            if (hasTheme.isSelected()) {
                result.addColorSectionWithDerived(
                        resourceBundle.getString("ColorSelector.textThemeCaption"),
                        new Color[] { new Color(255, 255, 255), new Color(0, 0, 0),
                                        new Color(160, 160, 160), new Color(16, 64, 128),
                                        new Color(80, 128, 192), new Color(180, 80, 80),
                                        new Color(160, 192, 80), new Color(128, 92, 160),
                                        new Color(80, 160, 208), new Color(255, 144, 64) });
            }
            if (hasStandard.isSelected()) {
                result.addColorSection(
                        resourceBundle.getString("ColorSelector.textStandardCaption"),
                        new Color[] { new Color(140, 0, 0), new Color(253, 0, 0),
                                        new Color(255, 160, 0), new Color(255, 255, 0),
                                        new Color(144, 240, 144), new Color(0, 128, 0),
                                        new Color(160, 224, 224), new Color(0, 0, 255),
                                        new Color(0, 0, 128), new Color(128, 0, 128) });
            }
            if (hasRecent.isSelected()) {
                result.addRecentSection(
                        resourceBundle.getString("ColorSelector.textRecentCaption"));
            }

            JCommandMenuButton moreButton = new JCommandMenuButton(
                    resourceBundle.getString("ColorSelector.textMoreColor"), null);
            moreButton.getActionModel()
                    .addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
                        Color color = JColorChooser.showDialog(TestColorSelector.this,
                                "Color chooser", bColor);
                        if (color != null) {
                            callback.onColorSelected(color);
                            JColorSelectorPopupMenu.addColorToRecentlyUsed(color);
                        }
                    }));
            result.addMenuButton(moreButton);
            return result;
        });

        top.add(jcb);
        top.add(hasTheme);
        top.add(hasStandard);
        top.add(hasRecent);

        JComboBox localeSwitcher = LocaleSwitcher.getLocaleSwitcher(new LocaleCallback() {
            @Override
            public void onLocaleSelected(Locale selected) {
                currLocale = selected;
                resourceBundle = ResourceBundle.getBundle("test.resource.Resources", currLocale);

                TestColorSelector.this
                        .applyComponentOrientation(ComponentOrientation.getOrientation(selected));
                SwingUtilities.updateComponentTreeUI(TestColorSelector.this);
            }
        });
        top.add(localeSwitcher);

        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    protected static class ColorIcon implements ResizableIcon {
        int w;
        int h;
        Color color;

        public ColorIcon(Color color) {
            this.color = color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            g.setColor(color);
            g.fillRect(x, y, w, h);
            g.setColor(color.darker());
            g.drawRect(x, y, w - 1, h - 1);
        }

        @Override
        public int getIconWidth() {
            return w;
        }

        @Override
        public int getIconHeight() {
            return h;
        }

        @Override
        public void setDimension(Dimension newDimension) {
            w = newDimension.width;
            h = newDimension.height;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new MetalLookAndFeel());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new TestColorSelector().setVisible(true);
        });
    }

}
