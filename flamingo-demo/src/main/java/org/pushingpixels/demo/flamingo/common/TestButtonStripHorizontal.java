package org.pushingpixels.demo.flamingo.common;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.Locale;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import org.pushingpixels.demo.flamingo.common.LocaleSwitcher.LocaleCallback;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_center;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_left;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_right;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_bold;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_italic;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_strikethrough;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_text_underline;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandButtonStrip;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessSkin;

public class TestButtonStripHorizontal extends JFrame {
    protected Locale currLocale;

    private JPanel buttonPanel;

    public TestButtonStripHorizontal() {
        super("Tests for horizontal buttons strips");

        buttonPanel = getButtonPanel();
        this.add(buttonPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JComboBox localeSwitcher = LocaleSwitcher.getLocaleSwitcher(new LocaleCallback() {
            @Override
            public void onLocaleSelected(Locale selected) {
                currLocale = selected;
                remove(buttonPanel);
                buttonPanel = getButtonPanel();
                add(buttonPanel, BorderLayout.CENTER);
                Window window = SwingUtilities.getWindowAncestor(buttonPanel);
                window.applyComponentOrientation(ComponentOrientation.getOrientation(currLocale));
                SwingUtilities.updateComponentTreeUI(window);
            }
        });
        controlPanel.add(localeSwitcher);
        this.add(controlPanel, BorderLayout.SOUTH);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    protected JPanel getButtonPanel() {
        FormLayout lm = new FormLayout("right:pref, 4dlu, left:pref, 4dlu, left:pref", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm).border(Borders.DIALOG);

        builder.append("hgap 0.5,  vgap 1.0", getStrip1(0.5, 1.0), getStrip2(0.5, 1.0));
        builder.append("hgap 0.75, vgap 1.0", getStrip1(0.75, 1.0), getStrip2(0.75, 1.0));
        builder.append("hgap 1.0,  vgap 1.0", getStrip1(1.0, 1.0), getStrip2(1.0, 1.0));

        builder.append("hgap 0.75, vgap 0.5", getStrip1(0.75, 0.5), getStrip2(0.75, 0.5));
        builder.append("hgap 0.75, vgap 0.75", getStrip1(0.75, 0.75), getStrip2(0.75, 0.75));
        builder.append("hgap 0.75, vgap 1.0", getStrip1(0.75, 1.0), getStrip2(0.75, 1.0));

        return builder.getPanel();
    }

    private JCommandButtonStrip getStrip1(double hgapScaleFactor, double vgapScaleFactor) {
        JCommandButtonStrip buttonStrip = new JCommandButtonStrip();
        buttonStrip.setHGapScaleFactor(hgapScaleFactor);
        buttonStrip.setVGapScaleFactor(vgapScaleFactor);
        buttonStrip.add(new JCommandButton("", new Format_justify_left()));
        buttonStrip.add(new JCommandButton("", new Format_justify_center()));
        buttonStrip.add(new JCommandButton("", new Format_justify_right()));
        return buttonStrip;
    }

    private JCommandButtonStrip getStrip2(double hgapScaleFactor, double vgapScaleFactor) {
        JCommandButtonStrip buttonStrip2 = new JCommandButtonStrip();
        buttonStrip2.setHGapScaleFactor(hgapScaleFactor);
        buttonStrip2.setVGapScaleFactor(vgapScaleFactor);
        buttonStrip2.add(new JCommandButton("", new Format_text_bold()));
        buttonStrip2.add(new JCommandButton("", new Format_text_italic()));
        buttonStrip2.add(new JCommandButton("", new Format_text_underline()));
        JCommandButton strike = new JCommandButton("", new Format_text_strikethrough());
        strike.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
        strike.setPopupCallback((JCommandButton commandButton) -> new SamplePopupMenu(
                commandButton.getComponentOrientation()));
        buttonStrip2.add(strike);
        return buttonStrip2;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());
            new TestButtonStripHorizontal().setVisible(true);
        });
    }
}
