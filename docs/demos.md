## Radiance demos

* For **Substance** - the `demos/substance-demo` module
  * The main demo is `org.pushingpixels.demo.substance.main.Check` class. In order to switch the demo to other third-party look-and-feels you will need to download the matching jar files locally and add them to the classpath.
  * Smaller demos for showing how to use individual APIs in `org.pushingpixels.demo.substance.main.samples.substance.api` package
* For **Substance**, advanced - the `demos/spyglass` module
  * Skeleton of a chat app in `org.pushingpixels.demo.spyglass.chat.ChatFrame` class
  * Skeleton of a mail app in `org.pushingpixels.demo.spyglass.mail.VisorMail` class
  * Custom skin in `org.pushingpixels.demo.spyglass.seaglass` package
  * Heavily integrated custom design in the [cookbook](spyglass/cookbook/cookbook.md) sample
* For **Flamingo** - the `demos/flamingo-demo` module
  * The main ribbon demo is `org.pushingpixels.demo.flamingo.ribbon.BasicCheckRibbon` class
  * Breadcrumb demos in `org.pushingpixels.demo.flamingo.bcb` package
  * Command, popup and panel demos in `org.pushingpixels.demo.flamingo.common` package
  * Small image viewer demo using command panel in `org.pushingpixels.demo.flamingo.imageviewer` package
* For **Plasma** - the `demos/plasma-demo` module
  * The main ribbon demo is `org.pushingpixels.demo.plasma.ribbon.RibbonDemo` file
  * Breadcrumb demos in `org.pushingpixels.demo.plasma.bcb` package
  * Command, popup and panel demos in `org.pushingpixels.demo.plasma.common` package
  * Small image viewer demo using command panel in `org.pushingpixels.demo.plasma.imageviewer.ImageViewer` file
* For **Trident** - the `demos/trident-demo` module
  * Simple API usage in `org.pushingpixels.demo.trident` package
  * More complex samples in `org.pushingpixels.demo.trident.swing` package
  * Experimenting with splines in `org.pushingpixels.demo.trident.swing.tracker` package
  * Music browser with heavy usage of Trident animations in the [Lumen](lumen/lumen.md) sample
* **Ion** - the `demos/ion` module. Sample walkthroughs for [replacing](https://www.pushing-pixels.org/2018/08/07/replacing-swingworker-with-kotlin-coroutines.html) `SwingWorker` with Kotlin coroutines in the `org.pushingpixels.demo.ion` package
* **Rainbow** - the `demos/rainbow` module. Image browser that displays SVG content from local disk. Integrates functionality from Neon, Trident, Substance, Flamingo, Meteor and Photon in the `org.pushingpixels.demo.rainbow.RainbowLocalViewer` file
