## Flamingo - projection customizations

Let's go back to Flamingo projections [in a nutshell](Intro.md):

- **content model + presentation model &#8594; projection**
- **projection &#8594; one or more Swing components**

Instead of operating directly at the level of Swing components, Flamingo's way is to "separate" your user-facing application layer into two parts - **content models** and **presentation models**.

A **projection** is the combination of two, and `Projection.buildComponent()` creates a Swing component that can be placed into the component hierarchy of your application. The intent is that for most cases, that is the only time your code is "aware" of the matching Flamingo Swing component. You do not explicitly configure any of that component's attributes, or wire any listeners to it. Everything is configured via the content and the presentation models, and any user interaction with the projected component automatically syncs back to the content model.

However, in some cases you might find yourself in need of a more specific configuration of that projected Swing component. Let's see how that is enabled at the level of the `Projection` class.

### Component supplier

```java
public interface ComponentSupplier<TC extends JComponent, CC extends ContentModel,
        PC extends PresentationModel> {
    /**
     * @param projection Information on the projection in case this
     *                   creator has logic that depends on specific field(s) of
     *                   the content model and / or the presentation model.
     * @return A supplier of the target component. It should be a reference to a function that
     * gets one parameter - projection, and returns an instance of the matching
     * {@link JComponent} subclass that represents the Swing component to be
     * used to configure the projected component in {@link #configureComponent(JComponent)}
     * call.
     */
    Function<Projection, TC> getComponentSupplier(Projection<TC, CC, PC> projection);
}
```

This interface uses the same generic class parameters as the `Projection` class it resides in. It allows you to effectively "substitute" your own class to be used during the flow of `Projection.buildComponent()` call. For example:

```java
@SubstanceInternalButton
private class RibbonBandExpandButton extends JCommandButton implements FlamingoInternalButton {
    private RibbonBandExpandButton(Projection<JCommandButton, Command,
            CommandButtonPresentationModel> projection) {
        super(projection);
        ...
    }
}

// and then use it like this:
CommandButtonProjection<Command> expandCommandProjection =
        new CommandButtonProjection<>(this.expandCommand,
                CommandButtonPresentationModel.builder()
                        .setFocusable(false)
                        .setActionKeyTip(ribbonBand.getExpandButtonKeyTip())
                        .build());
expandCommandProjection.setComponentSupplier(projection -> RibbonBandExpandButton::new);
```

Here, we are "pointing" the specific projection to use our custom subclass of `JCommandButton` which is annotated with `SubstanceInternalButton` to mark it for special internal handling inside Substance.

Note that the `Function` method returned from `getComponentSupplier` does not have to be the class constructor. It can be any `Function` object that matches the expected signature.

### Component customizer

```java
public interface ComponentCustomizer<TC extends JComponent> {
    /**
     * Customizes the result of {@link #buildComponent()} just before it is returned
     * to the application code.
     *
     * @param component Projected component (from
     *                  {@link #setComponentSupplier(ComponentSupplier)}
     *                  if configured, or the default supplier otherwise.
     */
    void customizeComponent(TC component);
}
```

Component customizer is a way to provide a block of code to be run on the projected component prior to that component being returned by the `Projection.buildComponent()` call.

For example:

```java
CommandButtonProjection<Command> expandCommandProjection =
        new CommandButtonProjection<>(this.expandCommand,
                CommandButtonPresentationModel.builder()
                        .setFocusable(false)
                        .setActionKeyTip(ribbonBand.getExpandButtonKeyTip())
                        .build());
expandCommandProjection.setComponentCustomizer((JCommandButton button) -> {
    // since paintBandTitleBackground uses GENERAL, mark this button with
    // GENERAL as well to sync the mark color
    ComponentOrParentChainScope.setDecorationType(button, DecorationAreaType.GENERAL);
    SubstanceSkin skin = SubstanceCoreUtilities.getSkin(this.ribbonBand);
    button.setIcon(getExpandButtonIcon(skin, button));
    // Mark the button as rectangular
    SubstanceCortex.ComponentScope.setButtonStraightSides(button,
            EnumSet.allOf(SubstanceSlices.Side.class));
});
```

Here, we want to provide additional presentation configuration on the projected button that is not covered by the `CommandButtonPresentationModel` attributes.

Why should you use a component customizer? You might as well simply call `Projection.buildComponent()` and then perform the same customization over the projected component? One of the target cases is a projection that is used to project more than one instance of a Swing component. In this case, specifying the additional customization logic at the level of projection results in a nice encapsulation of responsibilities between different layers in your application codebase.

### Next

Continue to [command strips](CommandStrip.md).
