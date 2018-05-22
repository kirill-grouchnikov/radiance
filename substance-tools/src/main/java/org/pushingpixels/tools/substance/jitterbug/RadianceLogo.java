package org.pushingpixels.tools.substance.jitterbug;

import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIcon;

import java.awt.image.BufferedImage;

public class RadianceLogo {
    public static SubstanceIcon getLogoIcon(SubstanceColorScheme scheme) {
        // Step 1 - create a new instance of the transcoded Substance logo with
        // base size of 16x16
        SubstanceIcon hiDpiAwareIcon = radiance_menu.of(16, 16);
        // Step 2 - return the colorized version of the icon
        return hiDpiAwareIcon.colorize(scheme.getForegroundColor());
    }
    
    public static BufferedImage getLogoImage(SubstanceColorScheme scheme) {
        return getLogoIcon(scheme).toImage();
    }
}
