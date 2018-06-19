## Substance look and feel - FAQ

**Can i use some / all of the code in Substance?**

Substance is released under BSD license. You are free to modify any part of the code as long as you mention the original license in the source code / the runnable distribution.

**Can i create my own look-and-feel on top of Substance?**

There are two supported ways of extending Substance. To create a custom look for branding your application, start by reading the skinning documentation and the code of the core skins in the `org.pushingpixels.substance.api.skin` package. To add custom behavior to the specific control(s), start by reading the widget documentation and the code in the [laf-widget](https://github.com/kirill-grouchnikov/laf-widget) project.

While you can extend the UI delegates in the `org.pushingpixels.substance.internal.ui` package, it is not recommended. In fact, anything in this package is subject to change at any point in time - and frequently does so between releases. At some point down the line (let's say 2019/20) Substance will switch to require Java 9 and will use the Java module system to effectively hide the internal implementation details further.

**Can I control some aspects of Substance via _UIManager_ or _UIDefaults_ key/value entries like I can with other look-and-feels?**

The official answer is no, even though it might work right now for some of those customizations. These two classes are somewhat of a crutch, in that they serve as a global data table to drop stuff in so that various UI delegates can look at that later. And that crutch was never officially documented or included as part of the official Swing APIs.

The main reason that it doesn't work under Substance is that in many places it simply did not scale well to the world where individual top-level windows are skinned differently and / or use different font sizes. Using a single global data table when different parts of the UI need different treatment is simply not a good solution.

To properly control the visual appearance of your app use [skins](skins/overview.md). If that doesn't work for you, let's chat.

**What is the policy for backwards binary and visual compatibility?**

I will do my best not to break the APIs exposed in the `org.pushingpixels.substance.api` package (read the skinning documentation and API documentation for more information).

Classes in the `org.pushingpixels.substance.internal.ui` package are not for application use and can change at any point in time.

There are no guarantees about visual compatibility between major or minor releases. Core painters and skins undergo routine reexamination to address visual flaws, add polish and remove unnecessary visual noise. If your application requires absolute visual backwards compatibility, it is recommended to create a custom skin that does not extend any of the existing core Substance skins.

**Is it possible to backport Substance to run on earlier releases of Java?**

This is probably not worth it. A lot of UI related bugs were fixed at the JDK level since Substance started out in 2005. At one point tools such as [Retrotranslator](http://retrotranslator.sourceforge.net/) and [Retroweaver](http://retroweaver.sourceforge.net/) were around, but they did not support the newer classes and methods that Substance is using. Things might have changed since then. Go crazy.

**I like some of the features, but the jar size is too big. How can i get a smaller runnable?**

In short - if you like the features, you pay the price. In long - you have a number of options:

* Use lite version (available from release 2.2). It's about 510KB less. Note that this option will be going away soon (probably in 2018).
* Use [Proguard](https://sourceforge.net/projects/proguard/) or other similar tools. Note that if you use this option, the stack traces of Substance defects probably will not contain line numbers. This may make it very difficult to reproduce and fix the defect.
* Set `compiler.debug` property to `off`. The result is the same as in the above option.
* Use code obfuscators. Almost all classes and all non-private methods will need to have their names preserved.
* Remove UI delegates for components that you don't use.
* Fork the codebase and follow the moving target.

Substance provides not only a highly configurable "look" part. It also adds significant amount of features to the core Swing components. If you need this functionality, you can either use third-party components, write the functionality yourself or take Substance. In any case these features have to reside somewhere in the classpath. Having them in Substance enables you to use well-tested additional "feel" part of the core Swing components.

**Why are you breaking my application by enforcing the creation and modification of components on the Event Dispatch Thread (EDT)?**

This has been introduced in version 5.0, and is being extended in every subsequent release. The answer to this question can be found on the "Pushing Pixels" blog in [entry from July 2008](http://www.pushing-pixels.org/?p=368) and in [entry from February 2010](http://www.pushing-pixels.org/?p=1643).

**Scrolling and moving windows leaves the watermark in inconsistent state. Is it a bug?**

No, it's by design. Swing does not repaint the component on every event while scrolling or moving the windows / frames / dialogs. Try it and watch the CPU go berserk. As by default the Substance watermarks are screen-bound, you may (and will) experience the watermark inconsistency. Here are some things you can do:

* Define your scrolled component to be non-opaque. It will be repainted on every scroll, including the watermark. Doesn't really help with CPU if you have a lot of child components.
* Add scroll / move listener and repaint the component there. It is recommended to call repaint every 100+ milliseconds to keep the application responsive. You will still experience "jagged" behaviour on fast scrolls / drags.
* Use WATERMARK_VISIBLE client property on the specific component, setting it to `Boolean.FALSE`
* Use null watermark (see watermarks) for your application.
* Use `SubstanceImageWatermark.setImageWatermarkKind(ImageWatermarkKind)` and specify one of `APP_ANCHOR`, `APP_CENTER` or `APP_TILE` values for the image watermark kind. This is relevant only for image-based watermarks.

**I use an image-based watermark in my application / applet and don't see it. Is it a bug?**

By default, **all** Substance watermarks are screen-bound (also true under multiple screens). This is in order to enable smooth and seamless operation of applications that use multiple frames / dialogs. In addition, this allows to blend Substance-based applications on desktops with matching backgrounds. Specifically for image-based watermarks this may present a visual problem if the specified (local or remote) image is smaller than the screen (one or both dimensions). In this case the image is not enlarged and is centered in the middle of the screen. Unless your application is situated properly, the visual result is "no watermark". In order to amend the situation you will need to provide a larger image. Two notes:

* If one or both dimensions of the watermark image are larger than the corresponding dimension(s) of the screen(s), the image will be scaled down.
* In order to ensure seamless operation of applications that use multiple frames / dialogs under window move / drag see the answer to question 6 above.

**I don't like Substance.**

That's not really a question. If you don't like it, you can either help improve it by suggesting additional features in the forums and mailing lists, or use any other core or third-party look-and-feel. The landscape of third-party look-and-feels was a bit more vibrant when Substance started. Some of those are still around.

**What's happening with my pull request?**

Look-and-feel in general and Substance in particular require fairly advanced knowledge of Swing. This is not a playground / sandbox for experimenting with Swing - Substance aims to be a production-quality alternative to core and other third-party LAFs. As you wouldn't want a total stranger to be a part of your production team, you need first to establish yourself a worthy addition to this (or any other) project. You can start by filing bugs, suggesting new features, learning Substance codebase and proposing ways to implement new features.

The bigger the pull request is, the less likely the chances are it will be handled. If you are planning to contribute something substantial (heyo), let's talk first.

**Are there any known issues in Substance?**

See the [known issues](docs/known-issues.md) documentation. If you find an issue not mentioned in the above document, [file a bug](https://github.com/kirill-grouchnikov/substance/issues) or [get in touch](http://www.pushing-pixels.org/about-kirill).

**How can i use Substance on Mac and still have the standard Mac application menu bar?**

The global Mac application menu bar is available only under menu UI delegates from the native Aqua look-and-feel. There are two options to have this functionality in your application.

* Use AWT menus. Thanks to **Werner Randelshofer** for this option.
* Use Aqua UI delegates for the menus and menu related classes. The recommended way to do this:
  1. Call `UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())`.
  2. Query and store the `UIManager` entries for the following keys: `MenuBarUI`, `MenuUI`, `MenuItemUI`, `CheckBoxMenuItemUI`, `RadioButtonMenuItemUI`, `PopupMenuUI`.
  3. Set Substance as the look-and-feel.
  4. Before creating your first window, restore the UIManager entries for the keys specified in the second step.

It is not recommended to rely on the current class names for the Aqua UI delegates, since the package that hosts these classes is different for different versions of Apple VM. This is mentioned in the [release notes](http://developer.apple.com/releasenotes/Java/JavaLeopardRN/ResolvedIssues/chapter_3_section_5.html#//apple_ref/doc/uid/TP40006634-CH3-DontLinkElementID_13) for Apple VM 1.6.0 on Mac OS X 10.5 Leopard (radar #4907470). Thanks to **Sergiy Michka** and **Mike Swingler** for this option.

**I use animated GIFs as icons on internal frames and the CPU usage goes berserk (100% maxed out). Some parts of the application do not get repainted at all. What do i do?**

When an animated GIF is set as an internal frame icon, the **entire** desktop pane is repainted on the GIF frame sequencing - not only the icon, not only the frame title pane and even not only that internal frame. Since Substance is much more CPU-intensive than Metal / Windows (it is partially addressed with the image caching), this results in severe CPU bottlenecks and refresh glitches on some controls. The call to `repaint()` doesn't necessarily cause an immediate repaint (this is what the `paintImmediately()` API is for). When the CPU is heavily loaded, most of the repaints will be skipped (coalesced). In extreme cases, the CPU is so heavily loaded that the repaint manager never gets to repaint some controls (such as combobox popup in a floating toolbar).

The best advice is to not use animated GIFs as icons. Thanks to **Martin Clifford** for pointing out this issue.

**What's going on with my cell renderers?**

By design, Substance provides default renderers for trees, tables and lists that provide the following functionality:

1. Respect the background color of the component.
2. Provide alternating striped painting of background (table / list only).
3. Provide theme-consistent rollover and selection highlighting.

This functionality is **only** available on default Substance renderers in the `org.pushingpixels.substance.api.renderers`. If you use custom renderers that extend core Swing classes, you will not have it.

If you want to change the default animation settings on your lists, tables and trees (for example, to disable core Substance animations on custom application renderers) please consult the [animation primer](animations.md).

**Is there support for custom tab components?**

Substance does not support custom tab components specified by the [JTabbedPane.setTabComponentAt](http://docs.oracle.com/javase/6/docs/api/javax/swing/JTabbedPane.html#setTabComponentAt(int,%20java.awt.Component)) API.

**Can i use Substance only for some parts of my UI?**

No. Substance in particular, and Java look and feels in general are not designed to be installed in the "mix and match" fashion.

**How do i make Substance to paint the title panes?**

In case you wish to use cross-platform frame and dialog decorations, use the following before you instantiate your first top-level window: `JFrame.setDefaultLookAndFeelDecorated(true);` and `JDialog.setDefaultLookAndFeelDecorated(true);`. This, however, causes flicker on resize due to a known Swing bug. For Windows, there is a workaround, using `System.setProperty("sun.awt.noerasebackground", "true");`. You can set this property along with the above two lines.

**I'm using `setOpaque()` method and i see visual artifacts in my UI**

Do not change the opacity of controls painted by Substance in the application code. Doing so will lead to unpredictable visual results at runtime.

**I'm seeing something weird in my editable text boxes. The cursor is not lining up properly with the characters**

This has been reported and analysed by Dale Anson, specifically on Arch Linux distribution with XFCE desktop environment. JDK [provides](https://bugs.openjdk.java.net/browse/JDK-6288260) a way [to use](https://docs.oracle.com/javase/7/docs/api/java/awt/doc-files/DesktopProperties.html) desktop-specific text rendering settings (smoothing / anti-aliasing), and that is being used in Substance. Under the particular configuration above (and possibly others) this API does not seem to be doing the right thing as far as positioning and rendering the text. If you're experiencing this issue, run your app under `-Dawt.useSystemAAFontSettings=off` flag.

**I'm using custom scale factor on my Windows machine, and under Java 9 I'm seeing rendering artifacts along the edges of some widgets**

Java 9 has changed the way it treats drawing images when the images need to be upscaled to match the screen resolution. Until I figure out how to make the existing Hi DPI support to work on both Java 8 and Java 9, add the following to your app:
* Run it under `–Dsun.java2d.uiScale=1.0` flag.
* Call `SubstanceLookAndFeel.setFontPolicy(SubstanceFontUtilities.getScaledFontPolicy((float)(SubstanceSizeUtils.getPointsToPixelsRatio()) / 1.33F))` with the factor that matches the custom scale factor that you've set on your machine
