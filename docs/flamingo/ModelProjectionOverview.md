## Flamingo - content models, presentation models, projections

Let's take a deeper look at what it takes to write a content model, a presentation model and wire them up to a projection, and how to properly sync up model changes with all projected components.

### Content model

All content models implement the `org.pushingpixels.flamingo.api.common.model.ContentModel` interface. The builder pattern is used to configure all attributes of the specific content model type. After a content model object is created, it allows for a subset of its attributes to be dynamically modified. Such modifications are automatically propagated to all projections of that content model object.

A simplified skeleton of a custom content model class looks like this:

```java
public class MyContentModel implements ContentModel {
    private TypeA a;
    private TypeB b;
    ...
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    protected MyContentModel() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getA() {
        return this.a;
    }

    public void setA(TypeA a) {
        // Some kind of a proper type-based equality comparison
        if (!this.a != a) {
            TypeA old = this.a;
            this.a = a;
            this.pcs.firePropertyChange("a", old, this.a);
        }
    }

    public TypeB getB() {
        return this.b;
    }

    public void setB(TypeB b) {
        // Some kind of a proper type-based equality comparison
        if (this.b != b) {
            TypeB old = this.b;
            this.b = b;
            this.pcs.firePropertyChange("b", old, this.b);
        }
    }

    ...    

    public static class Builder {
        private TypeA a;
        private TypeB b;
        ...

        public MyContentModel build() {
            MyContentModel myContentModel = new MyContentModel();

            myContentModel.a = a;
            myContentModel.b = b;
            ...

            return myContentModel;
        }

        public Builder setA(TypeA a) {
            this.a = a;
            return this;
        }

        public Builder setB(TypeB b) {
            this.b = b;
            return this;
        }

        ...
    }
}
```

### Presentation model

All presentation models implement either `ImmutablePresentationModel` or `MutablePresentationModel` interfaces in the  `org.pushingpixels.flamingo.api.common.model` package. The builder pattern is used to configure all attributes of the specific presentation model type.

A simplified skeleton of a custom presentation model class would look exactly the same as that in the previous section (on content models), and is omitted for the sake of brevity.

### Projection

All projections extend the `org.pushingpixels.flamingo.api.common.projection.Projection` class. It is a generic class with the following three types:

- an extension of `JComponent` - indicating the base class for the projected Swing components
- an extension of `ContentModel` - indicating the type of content model used by this projection
- an extension of `PresentationModel` - indicating the type of presentation model used by this projection

For example, here is the class signature of `CommandStripProjection`:

```java
public class CommandStripProjection extends Projection<JCommandButtonStrip,
      CommandGroup, CommandStripPresentationModel> {
```

This signature says that `CommandStripProjection` takes a `CommandGroup` content model and a `CommandStripPresentationModel`, and the result of the projection is a Swing component of class `JCommandButtonStrip`.

From the application perspective, the most important method in the `Projection` class is:

```java
public T buildComponent()
```

where T is the type of the project Swing component. That method should be called in the application code when you're "ready" to convert the metadata describing the content and how it should be presented into an actual Swing component:

```java
contentPanel.add(
    new CommandStripProjection(new CommandGroup(justifyLeft, justifyCenter, justifyRight, justifyFill),
    CommandStripPresentationModel.builder()
        .setCommandPresentationState(CommandButtonPresentationState.BIG)
        .build())
    .buildComponent());
```

Here, a `CommandStripProjection` object is created from a `CommandGroup` (content model) and a `CommandStripPresentationModel` (presentation model). Then, we call `buildComponent()` on it which gives us an instance of the `JCommandButtonStrip` - which is then added to the component hierarchy of our `JFrame`.

### Handling content model modifications

If our content model class exposes one or more of its attributes to be dynamically modified at runtime, how do those changes propagate to the projected Swing components? Here is how it works:

- The `ContentModel` class has a `PropertyChangeSupport` object that gets notified via its `firePropertyChange` method on any change to one of the attributes (in the matching setter, as shown in the skeleton code above).
- The constructor for Swing class that implements the projected content accepts a single `Projection` object (see sample signature below). It saves that projection object and exposes it via a getter method.
- The UI delegate for that Swing class registers a property change listener on the projection's content model (available via `Projection.getContentModel()` API). In that property change listener it looks at the event's property name, and branches the logic based on those properties / attributes that are exposed as dynamic by the matching content model class.

For example, here's a snippet of the constructor for the `JCommandButton` class that is the base class for all command buttons - which are used for the projections of the `Command` content model and `CommandButtonPresentationModel` presentation model:

```java
public JCommandButton(Projection<JCommandButton,
        ? extends Command, CommandButtonPresentationModel> projection) {
    this.projection = projection;
    this.command = projection.getContentModel();
    this.commandPresentation = projection.getPresentationModel();

    this.setText(command.getText());
    this.setExtraText(command.getExtraText());

    this.setIcon((command.getIconFactory() != null)
            ? command.getIconFactory().createNewIcon()
            : null);
    ...

    boolean hasAction = (command.getAction() != null);
    if (hasAction) {
        this.addCommandListener(command.getAction());
        this.setActionRichTooltip(command.getActionRichTooltip());
        this.setActionKeyTip(commandPresentation.getActionKeyTip());
    }
    ...
}
```

Here, the `JCommandButton`'s constructor configures the Swing component based on the matching fields in both the `Command` (content model) and `CommandButtonPresentationModel` (presentation model) - both taken from the `Projection` object passed to the constructor.

And then the base class for the UI delegate (which is `BasicCommandButtonUI`) adds a property change listener to keep track of changes to the relevant content model attributes:

```java
protected void installListeners() {
    ...
    Command command = this.commandButton.getProjection().getContentModel();
    this.projectionPropertyChangeListener = (PropertyChangeEvent evt) -> {
        if ("text".equals(evt.getPropertyName())) {
            commandButton.setText((String) evt.getNewValue());
        }
        if ("iconFactory".equals(evt.getPropertyName())) {
            ResizableIcon.Factory factory = (ResizableIcon.Factory) evt.getNewValue();
            commandButton.setIcon((factory != null) ? factory.createNewIcon() : null);
        }
        if ("actionEnabled".equals(evt.getPropertyName())) {
            commandButton.getActionModel().setEnabled((Boolean) evt.getNewValue());
            syncDisabledIcon();
            commandButton.repaint();
        }
        ...
    };
    command.addPropertyChangeListener(this.projectionPropertyChangeListener);
```

This is how changes to the content model get propagated to all projected components. Each projected component keeps track of the content model changes and updates itself accordingly. Following the usual Swing approach, when the projected component is no longer in use, it unregisters all listeners that were registered when it was created / added to the component hierarchy - thus preventing memory leaks.

### Next

Continue to [projection customizations](ProjectionCustomization.md).
