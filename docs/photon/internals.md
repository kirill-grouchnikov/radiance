## Photon - the internals of the offline transcoder

Photon uses [Apache Batik](https://xmlgraphics.apache.org/batik/) to transcode SVG source into corresponding Java / Kotlin classes that contain a sequence of Java2D canvas draw calls to render the original content. How does it work?

### Parsing the SVG document

We start in `SvgTranscoder`. It uses Batik's `DocumentLoader` to load the local file based on the `URI`, and `GVTBuilder` to construct an hierarchical representation of the SVG content. The root of that representation is a `GraphicsNode`.

That is then passed to `SvgBaseTranscoder.transcode()`. This is the base class where the rest of the transcoding happens. Transcoding has three parts:

- traversing the Batik tree
- parsing out the information to create matching Java2D instructions
- printing those instructions in Java / Kotlin syntax

Let's take a look at each one of these parts.

### Traversing the Batik tree

The 'GraphicsNode' that we get from Batik's `GVTBuilder` is the root of a hierarchical representation of the original SVG content. Here it is important to note that it is *not* the DOM tree of the original SVG document - some of the SVG elements such as `<style>` or `<defs>` might be in a different place in the `GraphicsNode` hierarchy - "attached" to the specific elements that use them.

The traversal itself looks at two main types of nodes - `GraphicsNode` and `Paint`. Each supported sub-class of these two classes is transcoded in its own method. For example, `PatternPaint` is transcoded by the `transcodePatternPaint` and `TextNode` is transcoded by `transcodeTextNode`.

The traversal is depth-first, visiting every supported node in the tree, querying the information to create Java2D instructions (next section) and traversing children nodes where appropriate.

Important note - there is special handling of raster image and pattern content. See later sections in this document for more details.

### Parsing information for creating Java2D instructions

Every supported node in the `GraphicsNode` tree is queried for attributes relevant to the rendering. Let's take a look at `transcodeFillShapePainter` that transcodes a `FillShapePainter` node.

First, it transcodes `FillShapePainter.getShape()`. Simple shapes like `Rectangle2D`, `Ellipse2D` or `Line2D` are queried directly for their basic elements (coordinates, width, height, etc). More complex shapes like `GeneralPath` are converted into a `PathIterator`, and that iterator is then queried for information on each segment (`lineto`, `moveto`, `quadto`, `cubicto`, `close`).

Second, it transcodes the paint itself. Each paint type is queried for its basic elements - `Color` for red, green, blue and alpha, `LinearGradientPaint` for start / end point, fractions, etc.

There's special handling for `PatternPaint`. This paint type is transcoded into double-nested loop that performs tiling of the shape bounds along both axes, X and Y.

### Printing instructions in Java / Kotlin

Here is a snippet of how transcoded SVG content looks like in Java:

```java
paint = new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0000002f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(8.53232192993164, 6.529515743255615,
    30.95155906677246, 35.976688385009766,
    1.1330167055130005, 1.1330167055130005);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
```

And here is the matching snippet in Kotlin:

```kotlin
paint = Color(136, 138, 133, 255)
stroke = BasicStroke(1.0000002f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(8.53232192993164, 6.529515743255615,
      30.95155906677246, 35.976688385009766,
      1.1330167055130005, 1.1330167055130005)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
```

As you can see, the instructions are identical. The only difference is respecting the syntax and the conventions of the underlying language.

At the implementation level, this is done with the `LanguageRenderer` abstraction. Here is how rendering the `BasicStroke` object creation might look like in one of the `transcode` methods:

```java
printWriter.println("stroke = " + languageRenderer.getObjectCreation("BasicStroke")
        + "(" + width + "f," + cap + "," + join + "," + miterlimit + "f," + dashRep
        + "," + dash_phase + "f)" + languageRenderer.getStatementEnd());
```

### Wrapping it all together

The `src/main/resources` folder contains Photon templates. These templates contain the general outline that is required for a valid Java / Kotlin class. While these instructions (import statements, class definition, etc) could have been created alongside the Java2D instructions emitted during the `GraphicsNode` tree traversal, the implementation preference is for `SvgBaseTranscoder` logic to focus only on the painting / rendering part of the SVG content.

Each template uses a number of "token" strings. A token is a placeholder for a dynamic bit of information, such as the class name (that is generated based on the filename of the original SVG), dimensions of the SVG content bounding box etc.

When the template is loaded in `SvgBaseTranscoder.transcode()`, the flow is:

* Replace top-level tokens (package name, classname)
* Generate the entire sequence of Java2D commands to render the full SVG content (into a local `ByteArrayOutputStream`)
* Replace the painting token with that Java2D sequence
* Replace the rest of the tokens (bounding box)
* Print the entire transcoded content into the matching `PrintWriter` (supplied by the code in `SvgTranscoder`)

### Addendum A - handling `PatternPaint`

As mentioned earlier, `PatternPaint` is transcoded to a double-nested loop that perform tiling of the matching shape bounds. However, that is not the only "special" treatment done for transcoding this node.

Since the [PatternGraphicsNode](https://xmlgraphics.apache.org/batik/javadoc/org/apache/batik/bridge/SVGPatternElementBridge.PatternGraphicsNode.html) class does not expose access to its actual content (nodes that represent the content for a single tile of the pattern), `transcodePatternPaint()` instead uses a custom implementation of `Graphics2D` class to "capture" that content.

This custom implementation overrides methods such as `setStroke(Stroke)` or `fill(Shape)`. These methods then parse the basic contents of the relevant objects and create the mirror Java2D instructions for the transcoded tile pattern content.

### Addendum B - handling `TextPaint`

### Addendum C - handling `RasterImageNode`
