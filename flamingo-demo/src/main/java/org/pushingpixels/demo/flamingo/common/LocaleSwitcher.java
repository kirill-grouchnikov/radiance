package org.pushingpixels.demo.flamingo.common;

import java.awt.event.ActionEvent;
import java.util.Locale;

import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

public class LocaleSwitcher {
    static class LocaleInfo {
        Locale locale;

        String displayName;

        public LocaleInfo(Locale locale, String displayName) {
            this.locale = locale;
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

    public static JComboBox getLocaleSwitcher(final LocaleCallback callback) {
        Object[] locales = new Object[] { new LocaleInfo(new Locale("en", "US"), "English"),
                        new LocaleInfo(new Locale("iw", "IL"), "Hebrew") };
        final JComboBox result = new JComboBox(locales);
        result.setSelectedIndex(0);
        result.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            LocaleInfo selected = (LocaleInfo) result.getSelectedItem();
            callback.onLocaleSelected(selected.locale);
        }));
        return result;
    }
}
