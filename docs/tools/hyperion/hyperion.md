## Hyperion - editing custom button shapers

### Editing

Hyperion is a visual editor for creating and editing files that define custom button shapers.

It has two panes - control panel on the left and editor panel on the right.

Use "Load image" button to load the source image in the editor panel. This image should have the shape / outline that you want to trace and serve as the basis for your custom button shaper.

Use "Load contour" button to load an existing `.shaper` file into the editor. Alternatively, you can start editing a new contour, as Hyperion starts you off with one major and one minor point.

Major and minor points serve to anchor the shape outline and create curved segments. Use radio buttons in the control panel to switch between add, delete and edit modes.

In edit mode, click and drag a major or minor point to change its location. In add mode, click to add a major point. In delete mode, click a major point to delete it and its minor point.

When you're done with editing, click "Save contour" to save the serialized representation of the contour.

### Runtime usage

The [extras pack](https://github.com/kirill-grouchnikov/radiance/tree/master/substance-extras) comes with three helper classes that you can use to load and display custom button shaper outlines:

* `ShaperRepository` has methods for reading and writing serialized `.shaper` files.
* `CanonicalPath` is returned by `.read` and accepted by `.write` methods in the repository. After reading a serialized `.shaper` file, use `CanonicalPath.getPath` to get a Java2D `GeneralPath` that matches the size and insets of the relevant control.
* `BasePolygonShaper` is the base abstract class that brings it all together, implementing the core `SubstanceButtonShaper` interface.

See `XYZShaper` classes in [`org.pushingpixels.substance.extras.api.shaperpack`](https://github.com/kirill-grouchnikov/radiance/tree/master/substance-extras/src/main/java/org/pushingpixels/substance/extras/api/shaperpack) package for examples of how extra button shapers are implemented with these helper classes.
