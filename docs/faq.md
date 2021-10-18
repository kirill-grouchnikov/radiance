## Radiance, frequently asked questions

**Can I use some / all the code in Radiance?**

Radiance libraries are released under BSD license. You are free to fork and modify any part of the code as long as you mention the original license in the source code / the runnable distribution.

**What is the policy for backwards binary and visual compatibility?**

I will do my best not to break the APIs exposed in the `org.pushingpixels.***.api` packages. Classes in the `org.pushingpixels.***.internal` packages are not for application use and can change at any point in time.

There are no guarantees about visual compatibility between major or minor releases. Visuals of different components and skins undergo periodic reexamination to address visual flaws, add polish and remove  visual noise. If your application requires absolute visual backwards compatibility, it would be best to create a custom skin that does not extend any of the existing core Substance skins.

The best way to stop me from breaking Radiance APIs is to test them early and give me feedback on what doesn't work. There's plenty of time in the release cycle (roughly twice a year now) to take the latest development bits for a spin and see how well - or not - Radiance APIs address the needs of your application.

I plan for Radiance to be here in the next 10-15 years. That's a long time to carry the burden of APIs that were not designed well. If I make a mistake and release APIs that are not good, I'm not going to support them forever. Again, the best way to get well functioning Radiance APIs is to tell me what is missing, and what does not work well.

**Is it possible to backport Radiance to run on earlier releases of Java?**

This is probably not worth it. A lot of UI related bugs were fixed at the JDK level since these libraries started out in 2005. At one point tools such as [Retrotranslator](http://retrotranslator.sourceforge.net/) and [Retroweaver](http://retroweaver.sourceforge.net/) were around, but they did not support the newer classes and methods that Substance is using. Things might have changed since then. Go crazy.

**I like some features, but the binary size overhead is too much. How can I get a smaller runnable?**

In short - if you like the features, you pay the price. In long - you have a number of options:

* Use [Proguard](https://sourceforge.net/projects/proguard/) or other similar tools. Note that if you use this option, the stack traces of Substance defects probably will not contain line numbers. This may make it very difficult to reproduce and fix the defect.
* Set `compiler.debug` property to `off`. The result is the same as in the above option.
* Use code obfuscators. Almost all classes and all non-private methods will need to have their names preserved.
* Remove code that you don't use.
* Fork the codebase and follow the moving target.

Radiance provides a significant amount of features on top of the core Swing library. If you need this functionality, you can either use third-party components, write the functionality yourself or take Radiance. In any case these features have to reside somewhere in the classpath.

**Why are you breaking my application by enforcing the creation and modification of components on the Event Dispatch Thread (EDT)?**

This has been long been part of Radiance. The answer to this question can be found on the "Pushing Pixels" blog in [entry from July 2008](http://www.pushing-pixels.org/?p=368) and in [entry from February 2010](http://www.pushing-pixels.org/?p=1643).

**I don't like Radiance.**

That's not really a question. If you don't like it, you can either help improve it by suggesting additional features in the [issue tracker](https://github.com/kirill-grouchnikov/radiance/issues), or use the other core or third-party alternatives.

## Substance, frequently asked questions

**Can I create my own look-and-feel on top of Substance?**

To create a custom look for your application, start by reading the [skinning documentation](substance/skins/overview.md) and the code of the core skins in the `org.pushingpixels.radiance.laf.api.skin` package.

While you can extend the UI delegates in the `org.pushingpixels.substance.internal.ui` package, it is not recommended. In fact, anything in this package is subject to change at any point in time - and frequently does so between releases. At some point down the line Substance will use the Java module system to effectively hide the internal implementation details further.

**Can I control some aspects of Substance via _UIManager_ or _UIDefaults_ key/value entries like I can with other look-and-feels?**

The official answer is no, even though it might work right now for some of those customizations. These two classes are somewhat of a crutch, in that they serve as a global data table to drop stuff in so that various UI delegates can look at that later. And that crutch was never officially documented or included as part of the official Swing APIs.

The main reason that it doesn't work under Substance is that in many places it simply did not scale well to the world where individual top-level windows are skinned differently and / or use different font sizes. Using a single global data table when different parts of the UI need different treatment is simply not a good solution.

To properly control the visual appearance of your app use [skins](substance/skins/overview.md). If that doesn't work for you, let's chat.

**How can I use Substance on Mac and still have the standard Mac application menu bar?**

The global Mac application menu bar is available only under menu UI delegates from the native Aqua look-and-feel. There are two options to have this functionality in your application.

* Use AWT menus. Thanks to **Werner Randelshofer** for this option.
* Use Aqua UI delegates for the menus and menu related classes. The recommended way to do this:
  1. Call `UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())`.
  2. Query and store the `UIManager` entries for the following keys: `MenuBarUI`, `MenuUI`, `MenuItemUI`, `CheckBoxMenuItemUI`, `RadioButtonMenuItemUI`, `PopupMenuUI`.
  3. Set Substance as the look-and-feel.
  4. Before creating your first window, restore the `UIManager` entries for the keys specified in the second step.

It is not recommended to rely on the current class names for the Aqua UI delegates, since the package that hosts these classes is different for different versions of JVMs. This is mentioned in the [release notes](http://developer.apple.com/releasenotes/Java/JavaLeopardRN/ResolvedIssues/chapter_3_section_5.html#//apple_ref/doc/uid/TP40006634-CH3-DontLinkElementID_13) for Apple VM 1.6.0 on Mac OS X 10.5 Leopard (radar #4907470). Thanks to **Sergiy Michka** and **Mike Swingler** for this option.
