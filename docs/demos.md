## Radiance demos

* For **Theming** - the `demos/theming-demo` module
  * The main demo is `Check` class. In order to switch the demo to other third-party look-and-feels you will need to download the matching jar files locally and add them to the classpath.
  * Smaller demos for showing how to use individual APIs in `org.pushingpixels.radiance.demo.theming.main.samples.theming.api` package
* For **Theming**, advanced - the `demos/theming-apps` module
  * Skeleton of a chat app in `ChatFrame` class
  * Skeleton of a mail app in `VisorMail` class
  * Custom skin in `org.pushingpixels.radiance.demo.themingapps.seaglass` package
  * Heavily integrated custom design in the [cookbook](theming/cookbook/cookbook.md) sample
* For **Component** - the `demos/component-demo` module
  * The main ribbon demo is `org.pushingpixels.radiance.demo.component.ribbon.BasicCheckRibbon` class
  * Breadcrumb demos in `org.pushingpixels.radiance.demo.component.bcb` package
  * Command, popup and panel demos in `org.pushingpixels.radiance.demo.component.common` package
  * Small image viewer demo using command panel in `org.pushingpixels.radiance.demo.component.imageviewer` package
* For **Component Kotlin extensions** - the `demos/component-ktx-demo` module
  * The main ribbon demo is `org.pushingpixels.radiance.demo.component.ktx.ribbon` file
  * Breadcrumb demos in `org.pushingpixels.adiance.demo.component.ktx.bcb` package
  * Command, popup and panel demos in `org.pushingpixels.adiance.demo.components.ktx.common` package
  * Small image viewer demo using command panel in `org.pushingpixels.adiance.demo.component.ktx.imageviewer.ImageViewer` file
* For **Animation** - the `demos/animation-demo` module
  * Simple API usage in `org.pushingpixels.radiance.demo.animation` package
  * More complex samples in `org.pushingpixels.radiance.demo.animation.swing` package
  * Experimenting with splines in `org.pushingpixels.radiance.demo.animation.swing.tracker` package
  * Music browser with heavy usage of Radiance animations in the [Music app](animation/musicapp/overview.md) sample
