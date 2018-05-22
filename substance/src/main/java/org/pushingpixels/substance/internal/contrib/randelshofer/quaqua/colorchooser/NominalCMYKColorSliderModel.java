package org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser;

import javax.swing.DefaultBoundedRangeModel;
/**
 * A ColorSliderModel for CMYK color models (cyan, magenta, yellow, black) with
 * nominally converted color components from/to an RGB color model.
 * <p>
 * This model may not be very useful. It assumes that the color components 
 * perfectly absorb the desired wavelenghts.
 *
 * @author  Werner Randelshofer
 * @version 1.0 May 22, 2005 Created.
 */
public class NominalCMYKColorSliderModel extends ColorSliderModel {
    /**
     * Creates a new instance.
     */
    public NominalCMYKColorSliderModel() {
        super(new DefaultBoundedRangeModel[] {
            new DefaultBoundedRangeModel(0, 0, 0, 100),
            new DefaultBoundedRangeModel(0, 0, 0, 100),
            new DefaultBoundedRangeModel(0, 0, 0, 100),
            new DefaultBoundedRangeModel(0, 0, 0, 100)
        });
    }
    
    public int getRGB() {
        float cyan, magenta, yellow, black;
        
        cyan = components[0].getValue() / 100f;
        magenta = components[1].getValue() / 100f;
        yellow = components[2].getValue() / 100f;
        black = components[3].getValue() / 100f;
        
        float red, green, blue;
        red = 1f - cyan * (1f - black) - black;
        green = 1f - magenta * (1f - black) - black;
        blue = 1f - yellow * (1f - black) - black;
        return 0xff000000
        | ((int) (red * 255) << 16)
        | ((int) (green * 255) << 8)
        | (int) (blue * 255);
    }
    
    public void setRGB(int rgb) {
        float cyan, magenta, yellow, black;
        
        cyan = 1f - ((rgb & 0xff0000) >>> 16) / 255f;
        magenta = 1f - ((rgb & 0x00ff00) >>> 8) / 255f;
        yellow = 1f - (rgb & 0x0000ff) / 255f;
        if (Math.min(Math.min(cyan, magenta), yellow) >= 1f) {
            cyan = magenta = yellow = 0f;
            black = 1f;
        } else {
            black = Math.min(Math.min(cyan, magenta), yellow);
            
            if (black > 0f) {
                cyan = (cyan - black) / (1 - black);
                magenta = (magenta - black) / (1 - black);
                yellow = (yellow - black) / (1 - black);
            }
        }

        components[0].setValue((int) (cyan * 100f));
        components[1].setValue((int) (magenta * 100f));
        components[2].setValue((int) (yellow * 100f));
        components[3].setValue((int) (black * 100f));
    }
    
    public int toRGB(int[] values) {
        float cyan, magenta, yellow, black;
        
        cyan = values[0] / 100f;
        magenta = values[1] / 100f;
        yellow = values[2] / 100f;
        black = values[3] / 100f;
        
        float red, green, blue;
        red = 1f - cyan * (1f - black) - black;
        green = 1f - magenta * (1f - black) - black;
        blue = 1f - yellow * (1f - black) - black;
        return 0xff000000
        | ((int) (red * 255) << 16)
        | ((int) (green * 255) << 8)
        | (int) (blue * 255);
    }    
}
