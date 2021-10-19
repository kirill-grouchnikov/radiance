package org.pushingpixels.radiance.demo.theming.main;

import org.pushingpixels.radiance.theming.api.colorscheme.*;

import java.util.ArrayList;
import java.util.List;

public class ExportColorSchemes {
    public static void main(String[] args) {
        List<RadianceColorScheme> toExport = new ArrayList<>();
        toExport.add(new AquaColorScheme());
        toExport.add(new BarbyPinkColorScheme());
        toExport.add(new BottleGreenColorScheme());
        toExport.add(new BrownColorScheme());
        toExport.add(new CremeColorScheme());
        toExport.add(new DesertSandColorScheme());
        toExport.add(new LightAquaColorScheme());
        toExport.add(new LightGrayColorScheme());
        toExport.add(new LimeGreenColorScheme());
        toExport.add(new MetallicColorScheme());
        toExport.add(new OliveColorScheme());
        toExport.add(new OrangeColorScheme());
        toExport.add(new PurpleColorScheme());
        toExport.add(new RaspberryColorScheme());
        toExport.add(new SepiaColorScheme());
        toExport.add(new SteelBlueColorScheme());
        toExport.add(new SunfireRedColorScheme());
        toExport.add(new SunsetColorScheme());
        toExport.add(new SunGlareColorScheme());
        toExport.add(new TerracottaColorScheme());
        toExport.add(new CharcoalColorScheme());
        toExport.add(new EbonyColorScheme());
        toExport.add(new DarkGrayColorScheme());
        toExport.add(new DarkMetallicColorScheme());
        toExport.add(new DarkVioletColorScheme());
        toExport.add(new JadeForestColorScheme());
        toExport.add(new UltramarineColorScheme());

        for (RadianceColorScheme scheme : toExport) {
            System.out.println("class " + scheme.getClass().getSimpleName() +
                    " : Base" + (scheme.isDark() ? "Dark" : "Light") +
                    "ColorScheme(\"" + scheme.getDisplayName() + "\") {");
            System.out.println("\toverride val foregroundColor = Color(" +
                    scheme.getForegroundColor().getRed() + ", " +
                    scheme.getForegroundColor().getGreen() + ", " +
                    scheme.getForegroundColor().getBlue() + ")");
            System.out.println("\toverride val ultraLightColor = Color(" +
                    scheme.getUltraLightColor().getRed() + ", " +
                    scheme.getUltraLightColor().getGreen() + ", " +
                    scheme.getUltraLightColor().getBlue() + ")");
            System.out.println("\toverride val extraLightColor = Color(" +
                    scheme.getExtraLightColor().getRed() + ", " +
                    scheme.getExtraLightColor().getGreen() + ", " +
                    scheme.getExtraLightColor().getBlue() + ")");
            System.out.println("\toverride val lightColor = Color(" +
                    scheme.getLightColor().getRed() + ", " +
                    scheme.getLightColor().getGreen() + ", " +
                    scheme.getLightColor().getBlue() + ")");
            System.out.println("\toverride val midColor = Color(" +
                    scheme.getMidColor().getRed() + ", " +
                    scheme.getMidColor().getGreen() + ", " +
                    scheme.getMidColor().getBlue() + ")");
            System.out.println("\toverride val darkColor = Color(" +
                    scheme.getDarkColor().getRed() + ", " +
                    scheme.getDarkColor().getGreen() + ", " +
                    scheme.getDarkColor().getBlue() + ")");
            System.out.println("\toverride val ultraDarkColor = Color(" +
                    scheme.getUltraDarkColor().getRed() + ", " +
                    scheme.getUltraDarkColor().getGreen() + ", " +
                    scheme.getUltraDarkColor().getBlue() + ")");
            System.out.println("}");
            System.out.println();
        }
    }
}
