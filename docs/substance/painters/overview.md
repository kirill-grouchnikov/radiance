## Substance look and feel - painters overview

A Substance **painter** encapsulates common painting logic. For example, in Substance selected elements in lists, tables, trees and menus are painted with the same gradients. Instead of replicating this code across different UI delegates, it is extracted into a common painter. In addition to code reuse, it:

* Makes it easier to tweak an existing painting sequence.
* Lets applications to specify a custom (branding) painter which is applied to all relevant controls.
* Lets applications and third-party developers to provide consistent appearance of custom components without locking themselves to low-level implementation details of Substance.

Substance uses five types of painters which are used on different types of controls and window areas. The core library bundles a number of painter implementations which are available as officially supported APIs. Interested applications can also create custom implementation of the relevant painter interfaces and combine them together in a skin that creates a unique visual appearance based on the specific design requirements.

### Painter types

Substance uses the following painter types:

* [Fill painters](fill.md)
* [Border painters](border.md)
* [Highlight painters](highlight.md)
* [Decoration painters](decoration.md)
* [Overlay painters](overlay.md)

The vast majority of Substance visuals are painted by using these painters (applying the [current watermark](../watermarks.md) if necessary). The links above provide more technical information on how to specify custom painters and how to use them to paint custom components and window areas. Applications that wish to provide consistent appearance under different Substance skins are strongly encouraged to use the published painter APIs, even if it results in tying the application code to Substance.

### Painting custom components

The Substance painting layer provides a convenient API for the applications that wish to paint custom components in a way that is consistent with other Substance visuals. More information can be found in the [skinning primer](custom-skinning.md).
