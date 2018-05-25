package org.pushingpixels.demo.flamingo.common;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Address_book_new;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Help_browser;
import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.internal.ui.common.JRichTooltipPanel;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessSkin;

public class TestRichTooltipPanels extends JFrame {
    public TestRichTooltipPanels() {
        JRichTooltipPanel panel = new JRichTooltipPanel(new RichTooltip.RichTooltipBuilder()
                .setTitle(
                        "Main title that can go over multiple lines of text even exceeding the bigger")
                .addDescriptionSection(
                        "Simple description that can go over multiple lines of text even exceeding the bigger")
                .addDescriptionSection(
                        "Second paragraph that can be multiline as well to test this feature")
                .setMainIcon(Address_book_new.of(32, 32)).setFooterIcon(Help_browser.of(32, 32))
                .addFooterSection(
                        "Multiline footer description to provide a little bit more information on this subject")
                .build());
        this.add(panel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());
            new TestRichTooltipPanels().setVisible(true);
        });
    }

}
