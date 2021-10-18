## Substance look and feel - extras

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-substance-extras/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-substance-extras) `radiance-substance-extras`

The **extras** module contains additional functionality that builds on top of the core Substance module.

### Color schemes

Additional [color schemes](skins/colorschemes.md) are available under the `org.pushingpixels.substance.extras.api.colorschemepack` package. See the [full list here](skins/colorschemes-extras.md).

<p>
<img alt="Belize"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf-extras/colorschemes/belize.png" width="340" height="258" />
<img alt="Bloody Moon"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf-extras/colorschemes/bloody-moon.png" width="340" height="258" />
</p>

### Painters

Additional [fill](painters/fill.md) and [decoration](painters/decoration.md) painters are available under the `org.pushingpixels.substance.extras.api.painterpack` package.

### Skins

Additional [skins](skins/overview.md) are available under the `org.pushingpixels.substance.extras.api.skinpack` package.

<p>
<img alt="Office Blue 2007"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf-extras/skins/officeblue20071.png" width="340" height="258" />
<img alt="Magma"  src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/laf-extras/skins/magma1.png" width="340" height="258" />
</p>

### Tab widgets

The `org.pushingpixels.substance.extras.api.tabbed` package provides three widgets that can be enabled for on `JTabbedPane`s in your application.

To enable a specific widget, use `SubstanceCortex.GlobalScope.registerWidget` API:

```java
SubstanceCortex.GlobalScope.registerWidget(
     "TabHoverPreviewWidget",
     JTabbedPane.class, false)
```

As a result of this call, all `JTabbedPane` containers in your application (including those of classes that extend `JTabbedPane` - which is enabled by passing `false` as the last parameter) will display a small tab preview popup when the mouse hovers over one of the tabs.

Use `SubstanceExtrasCortex.ComponentScope.setTabPanePreviewPainter` to configure the painter to be used to render preview thumbnails of tabs for the specific `JTabbedPane`. You can use `DefaultTabPreviewPainter` as is, or extend some of its functionality as required by your application.
