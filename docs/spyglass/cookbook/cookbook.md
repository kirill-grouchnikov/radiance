## Cookbook - exploring rich visuals with Radiance

The [Cookbook demo app](https://github.com/kirill-grouchnikov/radiance/tree/sunshine/demos/spyglass/src/main/java/org/pushingpixels/demo/spyglass/cookbook) takes the design of [Cookbook UI](http://flickr.com/photos/mydreamapp/sets/72157600046909364/) from the [My Dream App context](https://web.archive.org/web/20080117124702/http://mydreamapp.com:80/news/post/389/) and turns it into a Swing application powered by a custom Radiance skin.

* [Step 1](01-analyze.md) is to analyze the original design
* [Step 2](02-map.md) is to map the design to Swing and Radiance
* [Step 3](03-decorations.md) is to implement the decoration painting
* [Step 4](04-skin.md) is to implement the full skin
* [Step 5](05-polish.md) is to polish the visuals

The customization layer of Radiance (especially the [painters](../../laf/painters/overview.md)) aims to create a customizable and powerful separation between painting layer and the rest of the application code (business logic such as persistence, authentication, communication and more). In this separation, Radiance allows working on the application visuals as a separate work flow (although the process of mapping the application areas to Swing and Radiance may require closer cooperation with implementing the actual UI container structure).

The ideal end result of this process is a self-contained implementation of the application skin that can be:

* tweaked as the design changes
* reused in other applications under the same portfolio
* even swapped out for a completely different appearance (such as using a native look-and-feel)

It took me about 20 hours to create the final visuals, and additional couple of hours when Radiance gained full hi-dpi support.

As the developer of Radiance I have the advantage of knowing how the library is built and what APIs are available. The main goal for the Cookbook demo is to help Swing developers to understand the customization layer of Radiance and use it to its fullest potential.

An important question that needs to be addressed is: why do you need to do it with Radiance? Why would you want to tie yourself to a third-party library when you can override `paintComponent` and use `Java2D` to create all the visuals? While you can most certainly do so (and in fact, the light bar holder is implemented this way), Radiance gives you quite a few advantages:

* Cleaner separation of the painting logic from your main application. A close cooperation with your design team that is made aware of the current Radiance limitations may result in zero to very little custom painting code in your components even for such a complicated design as Cookbook UI.
* Performance of Radiance is on par with the core look-and-feels. If your painting code is making heavy use of Java2D and images, you will need to provide a sophisticated caching layer to make sure that the UI remains responsive.
* The same Radiance skin can be reused across multiple portfolio applications. Embedding custom painting code in your UI components may result in a code that is harder to refactor into reusable building blocks.
* Radiance provides [animation effects](../../animation/animations.md) (rollover, selection, others) out of the box. These effects add a modern touch expected from visually rich applications.
* Radiance provides a well-defined [plugin mechanism](../../laf/plugin.md) to support third-party components.
* Radiance makes your applications safer by [checking EDT violations](https://www.pushing-pixels.org/2008/07/15/stricter-checks-on-edt-violations-in-substance.html) during the UI construction.
