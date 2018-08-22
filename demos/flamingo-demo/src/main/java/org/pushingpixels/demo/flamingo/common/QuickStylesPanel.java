/**
 *
 */
package org.pushingpixels.demo.flamingo.common;

import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Font_x_generic;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.icon.DecoratedResizableIcon;
import org.pushingpixels.neon.icon.ResizableIcon;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.MessageFormat;
import java.util.*;

public class QuickStylesPanel extends JCommandButtonPanel {
    public QuickStylesPanel(ResourceBundle resourceBundle, Locale locale) {
        super(48);

        MessageFormat mf = new MessageFormat(resourceBundle.getString("PanelStyles.text"));
        mf.setLocale(locale);

        for (int groupIndex = 0; groupIndex < 4; groupIndex++) {
            String iconGroupName = mf.format(new Object[]{groupIndex});
            this.addButtonGroup(iconGroupName, groupIndex);
            for (int i = 0; i < 15; i++) {
                final String deco = groupIndex + "/" + i;
                ResizableIcon fontIcon = new Font_x_generic();
                ResizableIcon finalIcon = new DecoratedResizableIcon(fontIcon,
                        (Component c, Graphics g, int x, int y,
                                int width, int height) -> {
                            Graphics2D g2d = (Graphics2D) g.create();
                            g2d.setColor(Color.black);
                            if (getComponentOrientation().isLeftToRight()) {
                                g2d.drawString(deco, x + 2, y + height - 2);
                            } else {
                                g2d.drawString(deco,
                                        x + width - g2d.getFontMetrics().stringWidth(deco) - 2,
                                        y + height - 2);
                            }
                            g2d.dispose();
                        });
                JCommandToggleButton jrb = new JCommandToggleButton(null, finalIcon);
                jrb.setName("Group " + groupIndex + ", index " + i);
                jrb.addActionListener(
                        (ActionEvent e) -> System.out.println("Invoked action on " + deco));
                this.addButtonToLastGroup(jrb);
            }
        }
        this.setSingleSelectionMode(true);
        this.setToShowGroupLabels(false);
    }
}