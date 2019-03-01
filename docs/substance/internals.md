## Substance look and feel - internals

### Introduction

If you're interested in knowing more about Substance internals, this document is for you. It is a rather advanced topic, and it assumes a certain level of familiarity with how Swing internals work in general. Here is a list of overview articles that provide a glimpse into how Swing operates:

* [Swing painting pipeline](http://www.pushing-pixels.org/2007/08/07/swing-painting-pipeline-the-conclusion.html)
* [How to write a custom look-and-feel](https://community.oracle.com/docs/DOC-983579)
* [Enhancing Swing applications](http://today.java.net/pub/a/today/2006/10/03/enhancing-swing-applications.html) (especially the first section).

The rest of the document assumes that you're familiar with the basic building blocks of Swing painting pipeline and common terms of UI delegates.

### Contact points

As a UI toolkit, Swing takes care of displaying the application UI controls as pixels on the screen, and handles the user interaction with those pixels. This process has many steps, most of which can be configured by the application via custom painting, layered panes, glass panes [and more](http://www.pushing-pixels.org/2007/08/07/swing-painting-pipeline-the-conclusion.html). Applications that do not use these extension points rely on the current look-and-feel to put the pixels on the screen and control certain aspects of the user interaction.

A look-and-feel is a collection of UI delegates. Each UI delegate handles the specific Swing component type - buttons have button UI delegates, sliders have slider UI delegates, etc. While each component type is different, the UI delegates have very similar **contact points** that control the various aspects of component lifecycle. Here is the list of major contact points:

* Configuring the visual settings. This includes colors and fonts.
* Configuring the inner layout metrics. This includes insets, margins and gaps.
* Computing the preferred dimension.
* Layout of inner components for composite controls. This is relevant for controls such as combobox which has an inner text field and arrow button.
* Listening to component's model changes. This includes mouse and keyboard, as well as change and item listeners - depending on the specific control type.
* Painting the different visual areas.

As you can see, painting is only one contact point among many. In an ideal model-view separation promoted by the core Swing library, the UI delegate is responsible for anything that is related to the component's visual and interaction facets.

### Why choose Substance?

Why would you want to use a third-party look-and-feel when core Swing has a number of bundled look-and-feels (including the addition of Nimbus in JDK 6)? Subjective preferences about the visuals aside, Substance provides the following features one would expect from a modern UI toolkit:

* Full high DPI support for the core Swing controls with resolution-independent painting.
* Respecting the desktop font settings of the current environment.
* Built-in animations for the core Swing controls (rollover, selection, ...)
* Skinning layer, and especially decoration areas. It enables even the most demanding designs to be implemented as self-contained Substance skins that can be ported across different applications in the same portfolio.

### Substance implementation

As a high-level view, the following Substance classes (and dependencies) address the four main points above:

* `SubstanceSizeUtils` has a bunch of methods to compute the different metrics based on the component font size. It makes sure that all the component visuals (paddings, gaps, margins, insets, ...) scale and result in consistent physical appearance on various hardware.
* [Neon](../neon.md) has font policy implementations for Windows, Gnome, KDE and Mac desktops.
* [Trident](../trident.md) is the animation engine that powers all built-in animations.
* `SubstanceSkin` and `SubstanceColorSchemeBundle` are the main classes in the skinning layer.

Each Substance UI delegate uses these four classes at different contact points:

* `SubstanceSizeUtils` is used during the initialization to set up gaps, margins and insets. It is also used in the layout managers to compute the preferred sizes and layout internal sub-components.
* `Neon`-provided font configuration is used to populate the all the `*.font` entries in the `UIManager` that are later used to set the fonts on the components during the initialization stage.
* `Trident` is used in various mouse / change listeners to initiate animation sequences (such as mouse rollover over a button, tab losing selection state) and during the painting to show cross-fades between the states.
* `SubstanceSkin` is used during the painting to compute the colors for painting the different visual areas of the component.
