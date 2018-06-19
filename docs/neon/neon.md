## Neon - scalable icons and native text rendering

### Resizable icons

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/flamingo/master/www/images/thumbs/learn/resizable-icon.png" width="248" height="274" border=0 align="right">

The `ResizableIcon` extends the core `Icon` interface to allow scaling the icon visuals at runtime. This is especially relevant for controls that can be dynamically resized. This class is used extensively in Flamingo for such controls as ribbon buttons or file viewer panel, but can be used in core and third-party components as well.

The core library provides helper classes to expose a variety of image formats as `ResizableIcon`s, including ICO and all `ImageIO`-supported formats. Additional helper classes allow decorating, filtering and layering icons to create more advanced functionality.
