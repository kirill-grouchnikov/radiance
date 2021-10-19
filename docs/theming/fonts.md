## Radiance look and feel - working with fonts

Typography is one of the core pillars of modern applications. Radiance in general, and Radiance as one of its parts, come with a number of APIs to work with platform and custom fonts.

### Working with platform fonts

`RadianceCommonCortex.getDefaultFontPolicy()` API retrieves the font policy that is consistent with the default control font set used by the underlying platform / operating system. Use `getFontSet()` on the result (passing `null` as the parameter is supported), and then query the resulting font set for the specific font to use in your application.

`RadianceCommonCortex.getScaledFontPolicy()` API retrieves the platform-consistent font policy with all fonts scaled up or down by the passed multiplier.

Note that on Catalina (macOS 10.15), Radiance is using `Helvetica Neue` instead of the system `San Francisco`. See more details on [this bug](https://github.com/kirill-grouchnikov/radiance/issues/224).

### Rendering text

`RadianceCommonCortex.installDesktopHints` API should be used for rendering platform-consistent text in your application running under the Radiance look-and-feel.

For example:

```java
public static class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, this.getFont());
        g2d.drawString("Sample text", 50, 50);
        g2d.dispose();
    }
}
```

### Deriving fonts

What if you want to go beyond the built-in default font selection for core or custom Swing components? For example, maybe you want to bump up the font size for that table header, or use italic version in some of your labels (remember that while italic works reasonably well for Latin scripts, it doesn't scale as well to scripts such as CJK and others).

First, you get the current Radiance font policy. While the above-mentioned `RadianceCommonCortex.getScaledFontPolicy` returns a desktop-consistent font policy, it is recommended to use `RadianceThemingCortex.GlobalScope.getFontPolicy` that respects the custom font policy set by the (optional) earlier application call to `RadianceThemingCortex.GlobalScope.setFontPolicy`.

```java
Font controlFont = RadianceThemingCortex.GlobalScope.getFontPolicy()
    .getFontSet().getControlFont();
```

Here, we get the current global font policy, then get the font set and finally get the control font from it. In a similar way, you can retrieve other fonts such as menu, message etc.

The next thing you want to do is to "unwrap" the result, and then "wrap" it as a composite font. The unwrapping is needed to create a `Font` that is not a `UIResource` so that it's not unset by Radiance later on. The wrapping is needed for creating a [font "chain"](https://github.com/kirill-grouchnikov/radiance/issues/4) where a character that is not present in the particular font implementation is rendered by a "fallback" glyph. The only currently supported way to create a composite font in Swing is via `StyleContext`.

```java
Font base = StyleContext.getDefaultStyleContext().getFont(
    controlFont.getFamily(), controlFont.getStyle(),
    controlFont.getSize());
```

The line above combines both steps - unwrapping the Radiance control font by using its "parts" - family, style and size. And wrapping it in a composite font by calling `StyleContext.getDefaultStyleContext().getFont`.

From this point, you can derive your own font and set it on the specific component:

```java
JButton button = new JButton(...);
button.setFont(base.deriveFont((float) (controlFont.getSize() + 1.0f)));
```

### Using a custom font policy

What if you want to use a custom font everywhere in your Radiance-based application? This is what `RadianceThemingCortex.GlobalScope.setFontPolicy` API is for.

First, you load your font (one or more variants) from the TTF file (or any compatible resource supported by the `Font.createFont` core API):

```java
ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
URL baseFontURL = classLoader.getResource(regularFontFileName);
Font baseFont = Font.createFont(Font.TRUETYPE_FONT, baseFontURL.openStream());
URL boldFontURL = classLoader.getResource(boldFontFileName);
Font boldFont = Font.createFont(Font.TRUETYPE_FONT, boldFontURL.openStream());
```

Next, you decide on how to use these variants to derive the Radiance font set parts:

```java
Font controlFont = baseFont.deriveFont(13.0f);
Font menuFont = baseFont.deriveFont(14.0f);
Font titleFont = menuFont;
Font messageFont = controlFont;
Font smallFont = baseFont.deriveFont(12.0f);
Font windowTitleFont = boldFont.deriveFont(14.0f);
```

With the help of a simple implementation of the `FontSet` interface:

```java
private static class FontSetWrapper implements FontSet {
    private final FontUIResource controlFont;
    private final FontUIResource menuFont;
    private final FontUIResource titleFont;
    private final FontUIResource messageFont;
    private final FontUIResource smallFont;
    private final FontUIResource windowTitleFont;

    private FontSetWrapper(Font controlFont, Font menuFont, Font titleFont,
            Font messageFont, Font smallFont, Font windowTitleFont) {
        this.controlFont = new FontUIResource(controlFont);
        this.menuFont = new FontUIResource(menuFont);
        this.titleFont = new FontUIResource(titleFont);
        this.messageFont = new FontUIResource(messageFont);
        this.smallFont = new FontUIResource(smallFont);
        this.windowTitleFont = new FontUIResource(windowTitleFont);
    }

    @Override
    public FontUIResource getControlFont() {
        return controlFont;
    }

    @Override
    public FontUIResource getMenuFont() {
        return menuFont;
    }

    @Override
    public FontUIResource getTitleFont() {
        return titleFont;
    }

    @Override
    public FontUIResource getWindowTitleFont() {
        return windowTitleFont;
    }

    @Override
    public FontUIResource getSmallFont() {
        return smallFont;
    }

    @Override
    public FontUIResource getMessageFont() {
        return messageFont;
    }
}
```

You can now set your custom font as the global Radiance font policy:

```java
RadianceThemingCortex.GlobalScope.setFontPolicy(
    new FontSetWrapper(controlFont, menuFont, titleFont,
        messageFont, smallFont, windowTitleFont);
````

An important note. The `StyleContext` API for creating composite fonts only works with family+style+size parameters. There is no matching public API to "wrap" a `Font` object and create a composite font out of it. The instructions in this section assume that your TTF files have coverage for all the characters / glyphs in your application. Otherwise you will end up with "tofu characters" for undisplayable code points.
