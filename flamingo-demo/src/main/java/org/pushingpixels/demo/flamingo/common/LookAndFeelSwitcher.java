package org.pushingpixels.demo.flamingo.common;

import java.awt.event.ItemEvent;
import java.util.Locale;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class LookAndFeelSwitcher {
    static class LookAndFeelInfoObj {
        LookAndFeelInfo lafInfo;

        String displayName;

        public LookAndFeelInfoObj(LookAndFeelInfo lafInfo, String displayName) {
            this.lafInfo = lafInfo;
            this.displayName = displayName;
        }

        @Override
        public String toString() {
            return displayName;
        }
    }

    public interface LocaleCallback {
        public void onLocaleSelected(Locale selected);
    }

    public static JComboBox getLookAndFeelSwitcher(final JFrame frame) {
        LookAndFeelInfo[] lafs = UIManager.getInstalledLookAndFeels();
        LookAndFeelInfoObj[] lafObjs = new LookAndFeelInfoObj[lafs.length];
        for (int i = 0; i < lafs.length; i++) {
            lafObjs[i] = new LookAndFeelInfoObj(lafs[i], lafs[i].getName());
        }
        final JComboBox result = new JComboBox(lafObjs);
        for (int i = 0; i < lafs.length; i++) {
            if (lafs[i].getName().equals(UIManager.getLookAndFeel().getName())) {
                result.setSelectedIndex(i);
                break;
            }
        }

        result.addItemListener((ItemEvent e) -> SwingUtilities.invokeLater(() -> {
            boolean wasDecoratedByOS = !frame.isUndecorated();
            try {
                LookAndFeelInfoObj selected = (LookAndFeelInfoObj) result.getSelectedItem();
                UIManager.setLookAndFeel(selected.lafInfo.getClassName());
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (Exception exc) {
                exc.printStackTrace();
            }
            boolean canBeDecoratedByLAF = UIManager.getLookAndFeel().getSupportsWindowDecorations();
            if (canBeDecoratedByLAF == wasDecoratedByOS) {
                boolean wasVisible = frame.isVisible();

                frame.setVisible(false);
                frame.dispose();
                if (!canBeDecoratedByLAF) {
                    // see the java docs under the method
                    // JFrame.setDefaultLookAndFeelDecorated(boolean
                    // value) for description of these 2 lines:
                    frame.setUndecorated(false);
                    frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);

                } else {
                    frame.setUndecorated(true);
                    frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
                }
                frame.setVisible(wasVisible);
                wasDecoratedByOS = !frame.isUndecorated();
            }
        }));

        return result;
    }
}
