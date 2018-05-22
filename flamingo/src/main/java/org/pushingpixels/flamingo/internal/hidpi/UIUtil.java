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
package org.pushingpixels.flamingo.internal.hidpi;

import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.geom.AffineTransform;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.WeakHashMap;

/**
 * @author max
 */
public class UIUtil {
	public static final boolean IS_OS_MAC = startsWith(getSystemProperty("os.name"), "Mac");
    public static final boolean IS_VENDOR_APPLE = containsIgnoreCase(
            getSystemProperty("java.vendor"), "Apple");
    public static final boolean IS_JAVA_9 = startsWith(
            getSystemProperty("java.specification.version"), "9");
    public static final boolean IS_JAVA_10 = startsWith(
            getSystemProperty("java.specification.version"), "10");

	private static String getSystemProperty(String key) {
		try {
			return System.getProperty(key);
		} catch (SecurityException e) {
			// log("Can't read the System property " + key + ".");
			return null;
		}
	}

	private static boolean startsWith(String str, String prefix) {
		return str != null && str.startsWith(prefix);
	}

	private static boolean containsIgnoreCase(String str, String searchFor) {
		return str != null
				&& str.toUpperCase(Locale.ENGLISH).contains(
						searchFor.toUpperCase(Locale.ENGLISH));
	}
	
    /**
     * Utility class for retina routine
     */
    private final static class DetectRetinaKit {

        //private final static WeakHashMap<GraphicsDevice, Boolean> devicesToRetinaSupportCacheMap = new WeakHashMap<GraphicsDevice, Boolean>();
        private final static WeakHashMap<GraphicsDevice, Double> devicesScaleFactorCacheMap = new WeakHashMap<GraphicsDevice, Double>();

        /**
         * This uses {@link GraphicsConfiguration}'s default transform as detailed at
         * https://bugs.openjdk.java.net/browse/JDK-8172962 (starting in Java 9).
         */
//        private static boolean isOracleMacRetinaDeviceModern(GraphicsDevice device) {
//            GraphicsConfiguration graphicsConfig = device.getDefaultConfiguration();
//
//            AffineTransform tx = graphicsConfig.getDefaultTransform();
//            double scaleX = tx.getScaleX();
//            double scaleY = tx.getScaleY();
//            return (scaleX > 1.0f && scaleY > 1.0f);
//        }

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

        /**
         * The best way to understand whether we are on a retina device is [NSScreen
         * backingScaleFactor] But we should not invoke it from any thread. We do not have access to
         * the AppKit thread on the other hand. So let's use a dedicated method. It is rather safe
         * because it caches a value that has been got on AppKit previously.
         */
//        private static boolean isOracleMacRetinaDeviceLegacy(GraphicsDevice device) {
//            try {
//                Method getScaleFactorMethod = Class.forName("sun.awt.CGraphicsDevice")
//                        .getMethod("getScaleFactor");
//                return getScaleFactorMethod == null
//                        || (Integer) getScaleFactorMethod.invoke(device) != 1;
//            } catch (Throwable t) {
//                return false;
//            }
//        }

        /**
         * The best way to understand whether we are on a retina device is [NSScreen
         * backingScaleFactor] But we should not invoke it from any thread. We do not have access to
         * the AppKit thread on the other hand. So let's use a dedicated method. It is rather safe
         * because it caches a value that has been got on AppKit previously.
         */
        private static double getScaleFactorLegacy(GraphicsDevice device) {
            try {
                Method getScaleFactorMethod = Class.forName("sun.awt.CGraphicsDevice")
                        .getMethod("getScaleFactor");
                if (getScaleFactorMethod == null) {
                    return 1.0;
                }
                int result = (Integer) getScaleFactorMethod.invoke(device);
                if (result <= 0) {
                    return 1.0;
                }
                return result;
            } catch (Throwable t) {
                return 1.0;
            }
        }

//        private static boolean isOracleMacRetinaDevice(GraphicsDevice device) {
//            if (LookUtils.IS_VENDOR_APPLE)
//                return false;
//
//            Boolean isRetina = devicesToRetinaSupportCacheMap.get(device);
//
//            if (isRetina != null) {
//                return isRetina;
//            }
//
//            isRetina = LookUtils.IS_JAVA_9 ? isOracleMacRetinaDeviceModern(device)
//                    : isOracleMacRetinaDeviceLegacy(device);
//
//            devicesToRetinaSupportCacheMap.put(device, isRetina);
//
//            return isRetina;
//        }

        private static double getScaleFactor(GraphicsDevice device) {
            if (IS_VENDOR_APPLE) {
                return 1.0;
            }

            if (devicesScaleFactorCacheMap.containsKey(device)) {
                return devicesScaleFactorCacheMap.get(device);
            }

            double result = IS_JAVA_9 || IS_JAVA_10 ? getScaleFactorModern(device)
                    : getScaleFactorLegacy(device);

            devicesScaleFactorCacheMap.put(device, result);

            return result;

        }

//        /**
//         * For JDK6 we have a dedicated property which does not allow to understand anything per
//         * device but could be useful for image creation. We will get true in case if at least one
//         * retina device is present.
//         */
//        private static boolean hasAppleRetinaDevice() {
//            return (Float) Toolkit.getDefaultToolkit()
//                    .getDesktopProperty("apple.awt.contentScaleFactor") != 1.0f;
//        }
//
//        /**
//         * This method perfectly detects retina Graphics2D for jdk7+ For Apple JDK6 it returns
//         * false.
//         * 
//         * @param g
//         *            graphics to be tested
//         * @return false if the device of the Graphics2D is not a retina device, jdk is an Apple JDK
//         *         or Oracle API has been changed.
//         */
//        private static boolean isMacRetina(Graphics2D g) {
//            GraphicsDevice device = g.getDeviceConfiguration().getDevice();
//            return isOracleMacRetinaDevice(device);
//        }

        /**
         * This method perfectly detects retina Graphics2D for jdk7+ For Apple JDK6 it returns
         * false.
         * 
         * @param g
         *            graphics to be tested
         * @return false if the device of the Graphics2D is not a retina device, jdk is an Apple JDK
         *         or Oracle API has been changed.
         */
        private static double getScaleFactor(Graphics2D g) {
            GraphicsDevice device = g.getDeviceConfiguration().getDevice();
            return getScaleFactor(device);
        }

        /**
         * Checks that at least one retina device is present. Do not use this method if your are
         * going to make decision for a particular screen. isRetina(Graphics2D) is more preferable
         *
         * @return true if at least one device is a retina device
         */
//        private static boolean isRetina() {
//            // if (true) return false;
//            if (LookUtils.IS_VENDOR_APPLE) {
//                return hasAppleRetinaDevice();
//            }
//
//            // Oracle JDK
//
//            if (LookUtils.IS_OS_MAC) {
//                GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
//
//                GraphicsDevice[] devices = e.getScreenDevices();
//
//                // now get the configurations for each device
//                for (GraphicsDevice device : devices) {
//                    if (isOracleMacRetinaDevice(device)) {
//                        return true;
//                    }
//                }
//            }
//
//            return false;
//        }
//
        /**
         * Checks that at least one retina device is present. Do not use this method if your are
         * going to make decision for a particular screen. isRetina(Graphics2D) is more preferable
         *
         * @return true if at least one device is a retina device
         */
        private static double getScaleFactor() {
            if (IS_VENDOR_APPLE) {
                return 1.0f;
            }

            // Oracle JDK

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

//    public static boolean isRetina(Graphics2D graphics) {
//        if (LookUtils.IS_OS_MAC) {
//            return DetectRetinaKit.isMacRetina(graphics);
//        } else {
//            return isRetina();
//        }
//    }

    public static double getScaleFactor(Graphics2D graphics) {
        return DetectRetinaKit.getScaleFactor(graphics);
//        if (LookUtils.IS_OS_MAC) {
//            return DetectRetinaKit.isMacRetina(graphics);
//        } else {
//            return isRetina();
//        }
    }

    //private static Boolean cachedRetinaReply = null;
    private static Double cachedScaleFactorReply = null;

//    public static boolean isRetina() {
//        if (cachedRetinaReply != null) {
//            return cachedRetinaReply;
//        }
//
//        boolean result = false;
//        if (GraphicsEnvironment.isHeadless()) {
//            result = false;
//        } else if ("true".equalsIgnoreCase(System.getProperty("is.hidpi"))) {
//            // Temporary workaround for HiDPI on Windows/Linux
//            result = true;
//        } else {
//            result = DetectRetinaKit.isRetina();
//        }
//        cachedRetinaReply = Boolean.valueOf(result);
//        return cachedRetinaReply;
//    }

    public static double getScaleFactor() {
        if (cachedScaleFactorReply != null) {
            return cachedScaleFactorReply;
        }

        double result = 1.0;
        if (GraphicsEnvironment.isHeadless()) {
            result = 1.0;
        } else {
            result = DetectRetinaKit.getScaleFactor();
        }
        cachedScaleFactorReply = Double.valueOf(result);
        return cachedScaleFactorReply;
//        return isRetina() ? 2 : 1;
    }

}
