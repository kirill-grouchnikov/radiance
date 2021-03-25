/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pushingpixels.neon.internal.contrib.intellij;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.*;

/**
 * @author max
 */
public class UIUtil {
    /**
     * Utility class for retina routine
     */
    private final static class DetectRetinaKit {

        private final static WeakHashMap<GraphicsDevice, Double> devicesScaleFactorCacheMap = new WeakHashMap<>();

        /**
         * This uses {@link GraphicsConfiguration}'s default transform as detailed at
         * https://bugs.openjdk.java.net/browse/JDK-8172962 (starting in Java 9).
         */
        private static double getScaleFactorModern(GraphicsDevice device) {
            GraphicsConfiguration graphicsConfig = device.getDefaultConfiguration();

            AffineTransform tx = graphicsConfig.getDefaultTransform();
            double scaleX = tx.getScaleX();
            double scaleY = tx.getScaleY();
            return Math.max(scaleX, scaleY);
        }

        private static double getScaleFactor(GraphicsDevice device) {
            if (devicesScaleFactorCacheMap.containsKey(device)) {
                return devicesScaleFactorCacheMap.get(device);
            }

            double result = getScaleFactorModern(device);

            devicesScaleFactorCacheMap.put(device, result);

            return result;

        }

        private static double getScaleFactor(Graphics2D g) {
            GraphicsDevice device = g.getDeviceConfiguration().getDevice();
            return getScaleFactor(device);
        }

        private static double getScaleFactor() {
            double result = 1.0;
            GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();

            GraphicsDevice[] devices = e.getScreenDevices();

            // now get the configurations for each device
            for (GraphicsDevice device : devices) {
                result = Math.max(result, getScaleFactor(device));
            }

            return result;
        }

    }

    public static double getScaleFactor(Graphics2D graphics) {
        return DetectRetinaKit.getScaleFactor(graphics);
    }

    private static Double cachedScaleFactorReply = null;

    public static double getScaleFactor() {
//        if (cachedScaleFactorReply != null) {
//            return cachedScaleFactorReply;
//        }

        double result = GraphicsEnvironment.isHeadless() ? 1.0 : DetectRetinaKit.getScaleFactor();
        cachedScaleFactorReply = Double.valueOf(result);
        return cachedScaleFactorReply;
    }
}
