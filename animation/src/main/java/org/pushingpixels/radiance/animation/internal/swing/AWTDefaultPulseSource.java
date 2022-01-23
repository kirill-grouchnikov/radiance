package org.pushingpixels.radiance.animation.internal.swing;

import org.pushingpixels.radiance.animation.api.RadianceAnimationCortex;

import java.awt.*;
import java.util.Arrays;

/**
 * Default pulse source which derives the pulse delay from
 * the highest refresh rate of all local screen devices.
 *
 * @author Timotej Šulík.
 */
public class AWTDefaultPulseSource extends RadianceAnimationCortex.FixedRatePulseSource {
    /**
     * Refresh rate to use if none of the screen devices report a valid refresh rate.
     */
    private static final int REFRESH_RATE_FALLBACK = 60;

    public AWTDefaultPulseSource() {
        super(1000 / getHighestDisplayRefreshRate());
    }

    private static int getHighestDisplayRefreshRate() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        return Arrays.stream(ge.getScreenDevices())
                .mapToInt(rate -> rate.getDisplayMode().getRefreshRate())
                .filter(rate -> rate != DisplayMode.REFRESH_RATE_UNKNOWN)
                .max()
                .orElse(REFRESH_RATE_FALLBACK);
    }
}