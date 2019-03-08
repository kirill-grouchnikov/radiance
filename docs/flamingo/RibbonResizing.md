## Flamingo - ribbon resizing

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize0.png" width="1406" border=0/>

The ribbon is a highly dynamic container that adapts the layout of its content (selected ribbon task, taskbar, etc) to the available space. As the developer of your application, you are providing two things:

- The content itself
- Hints for resizability

We have seen these hints earlier in [command projection](RibbonBandCommandProjections.md) and [gallery](RibbonBandGalleries.md) ribbon APIs. Let's take another look.

### Priority hints for command projections

```java
// Paste command projection
clipboardBand.addRibbonCommand(
        Command.builder().
            ...
            .build()
            .project(CommandButtonPresentationModel.builder().
                ...),
        JRibbonBand.PresentationPriority.TOP);
// Copy command projection
clipboardBand.addRibbonCommand(
        Command.builder().
            ...
            .build()
            .project(CommandButtonPresentationModel.builder().
                ...),
        JRibbonBand.PresentationPriority.MEDIUM);
// Format command projection
clipboardBand.addRibbonCommand(
        Command.builder().
            ...
            .build()
            .project(CommandButtonPresentationModel.builder().
                ...),
        JRibbonBand.PresentationPriority.MEDIUM);
```

Here we have four command projections added to the first "Clipboard" ribbon band. One projection is added at `PresentationPriority.TOP`, and the other three at `PresentationPriority.MEDIUM`.

It is a hint to the ribbon's built-in layout logic that is used to decide how to layout content in this ribbon band, and what the presentation state of each command projection should be. In this particular case, `PresentationPriority.TOP` results in the "Paste" command projection to be displayed in `BIG` presentation state. When there is enough horizontal space, the other three are is displayed at `MEDIUM` presentation state. But if the ribbon is resized to be more narrow, those projections will be in the `SMALL` presentation state instead (displaying only their icon) - we'll see screenshots shortly.

### Priority hints for in-ribbon galleries

And here is another look at specifying presentation priorities for the [in-ribbon gallery](RibbonBandGalleries.md) in the "Quick Styles" band:

```java
Map<JRibbonBand.PresentationPriority, Integer> stylesGalleryVisibleCommandCounts =
        new HashMap<>();
stylesGalleryVisibleCommandCounts.put(JRibbonBand.PresentationPriority.LOW, 1);
stylesGalleryVisibleCommandCounts.put(JRibbonBand.PresentationPriority.MEDIUM, 2);
stylesGalleryVisibleCommandCounts.put(JRibbonBand.PresentationPriority.TOP, 2);

RibbonGalleryProjection quickStylesGalleryProjection =
        new RibbonGalleryProjection(this.styleGalleryContentModel,
                RibbonGalleryPresentationModel.builder()...);
quickStylesBand.addRibbonGallery(quickStylesGalleryProjection,
        JRibbonBand.PresentationPriority.TOP);
```

The first part defines the mapping of how many (projected) commands we want to be displayed inline (not in the expanded / popup state) for every presentation priority. As the ribbon is resized, this mapping will be used to show more of fewer of the projected commands. The second part adds the gallery projection at the `PresentationPriority.TOP`, so that we start with 2 visible projected commands when there is enough horizontal space.

But what happens when the ribbon is resized, and available horizontal space is reduced?

### Adaptive resizing

What happens when the user starts resizing the ribbon frame, progressively reducing the amount of horizontal space available to the ribbon content? In more traditional containers, once the content does not fit in the available space, scrolling kicks in.

The ribbon uses a more dynamic model of adapting to increased or reduced horizontal space, with the following (rough) model of what happens when space is reduced:

- Display "less" of the same content. For example, a stack of three `MEDIUM` buttons that display icon + text becomes a stack of three `SMALL` buttons that only display icons.
- Replace the ribbon band content with a single large popup button that, when activated, shows the full content in a popup.
- Only as the last resort kick in the horizontal scrolling at the ribbon level.

From the application perspective, this model is controlled by two APIs:

- `RibbonTask.setResizeSequencingPolicy(RibbonBandResizeSequencingPolicy)`
- `AbstractRibbonBand.setResizePolicies(List<RibbonBandResizePolicy>)`

### Resize sequencing policy

The resize sequencing policy defines which ribbon band will be chosen next when the ribbon is shrunk / expanded. It is installed with the `RibbonTask.setResizeSequencingPolicy(RibbonBandResizeSequencingPolicy)` API.

The `org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizeSequencingPolicies` class provides two built in resize sequencing policies:

- `RoundRobin` under which the ribbon bands are being collapsed in a cyclic fashion, distributing the collapsed pixels between the different bands.
- `CollapseFromLast` under which the ribbon bands are being collapsed from last (right under LTR) to first (left under LTR).

The choice of the resize sequencing policy is a design decision left to the application developer. `RoundRobin` is the default policy. However, depending on the content of your specific ribbon you may want to use `CollapseFromLast` which, overall, introduces less "jumping around" of the content across the entire ribbon surface as it is resized.

### Resize policy

The `org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizePolicy` is the base class for resize policies used in general and flow ribbon bands. The resize policy defines a single visual state of the given ribbon band. For every control in the specific ribbon band (command button, gallery etc), the resize policy defines what is its presentation state - based on the priority hints explained above.

The resize policies are installed with the `AbstractRibbonBand.setResizePolicies(List<RibbonBandResizePolicy>)` API. The order of the resize policies in this list is important. The first entry in the list must be the most permissive policy that returns the largest value from its `getPreferredWidth(int, int)`. Each successive entry in the list must return the value smaller than its predecessors.

The `org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies` class provides a number of built in resize policies that respect the hints passed to
`JRibbonBand.addRibbonCommand()` and `JRibbonBand.addRibbonGallery()` APIs. There are three types of built in resize policies:

- Resize policies for the `JFlowRibbonBand`s. The `FlowTwoRows` and `FlowThreeRows` allow placing the flow ribbon band content in two and three rows respectively.
- Resize policies for the `JRibbonBand`s. The
`BaseCoreRibbonBandResizePolicy` is the base class for these policies. These policies respect the `JRibbonBand.PresentationPriority` associated with command buttons and ribbon galleries. They can also change the presentation state of the command buttons and the number of visible buttons in the ribbon galleries.
- The collapsed policy that replaces the entire content of the ribbon band with a single popup button. This is done when there is not enough horizontal space to show the content of the ribbon band under the most restrictive resize policy. Activating the popup button will show the original content under the most permissive resize policy in a popup. This policy is implemented in the  `IconRibbonBandResizePolicy`

In addition to the specific resize policies, the
`CoreRibbonResizePolicies` class provides three core resize policies lists for `JRibbonBand`s:

- `getCorePoliciesPermissive(JRibbonBand)` returns a list that starts with a resize policy that shows all command
buttons in the `BIG` presentation state and ribbon galleries
with the largest number of visible buttons, fully utilizing the available screen space.
- `getCorePoliciesRestrictive(JRibbonBand)` returns a list that starts with a resize policy that respects the priority hint associated with the specific components.
- `getCorePoliciesNone(JRibbonBand)` returns
a list that only has a <code>mirror</code> resize policy that respects the priority hint associated with the specific components.

In addition, the `getCoreFlowPoliciesRestrictive(JFlowRibbonBand, int)` returns a restrictive resize policy for `JFlowRibbonBand`s. The list starts with the two-row policy, goes to the three-row policy and then finally to the collapsed policy.

### Hints + resize policies in action

Starting with the original content displayed with enough available width:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize0.png" width="1406" border=0/>

Now we shrink the ribbon a bit:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize1.png" width="1318" border=0/>

Take a look at the rightmost band ("Find (toggle)"). It is now in iconified state, being displayed as a single popup button. This is due to the matching list of resize policies installed on it:

```java
List<RibbonBandResizePolicy> resizePolicies = new ArrayList<>();
resizePolicies.add(new CoreRibbonResizePolicies.Mirror(findBand));
resizePolicies.add(new CoreRibbonResizePolicies.IconRibbonBandResizePolicy(findBand));
findBand.setResizePolicies(resizePolicies);
```

Let's shrink the ribbon a bit more:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize2.png" width="1121" border=0/>

Under the default `RoundRobin` resize sequencing policy, the "Document" band is the next one to shrink. It is using `CoreRibbonResizePolicies.getCorePoliciesRestrictive()` list of resize policies that, at this first shrink step, leaves buttons with `TOP` priority hint as `BIG`, but changes the buttons with `MEDIUM` priority hint from `MEDIUM` (icon + text) to `SMALL` (icon only).

Let's shrink the ribbon a bit more:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize3.png" width="1067" border=0/>

The "Font" band is the next one to shrink. It is using the default `CoreRibbonResizePolicies.getCoreFlowPoliciesRestrictive()` list of resize policies that is configured to "allow" its content to stay at two rows at this iteration. Since that is the case, the `RoundRobin` resize sequencing policy goes to the next band - "Quick Styles".

Taking another look at the hint mapping for the in-ribbon gallery in that band:

```java
Map<JRibbonBand.PresentationPriority, Integer> stylesGalleryVisibleCommandCounts =
        new HashMap<>();
stylesGalleryVisibleCommandCounts.put(JRibbonBand.PresentationPriority.LOW, 1);
stylesGalleryVisibleCommandCounts.put(JRibbonBand.PresentationPriority.MEDIUM, 2);
stylesGalleryVisibleCommandCounts.put(JRibbonBand.PresentationPriority.TOP, 2);
```

We see that the gallery has requested to still display two commands in this reduced state. But the buttons next to it went from `MEDIUM` to `SMALL` presentation state, losing their texts.

Let's shrink the ribbon a bit more:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize4.png" width="1020" border=0/>

Now the `MEDIUM` buttons in the "Clipboard" band went to `SMALL` presentation state, losing their texts.

Let's shrink the ribbon a bit more:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize5.png" width="939" border=0/>

The pass skips the last "Find (toggle)" ribbon band (since it's already in iconified state), and switches the three `BIG` buttons in the "Document" band to a vertical stack of three `MEDIUM` ones.

Let's shrink the ribbon a bit more:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize6.png" width="888" border=0/>

This pass skips all the way back to the "Document" band again - based on the resize policies associated with the first three ribbon bands that, in this particular case, the application design considers more important. Now the vertical stack of three `MEDIUM` buttons has switched to three `SMALL` ones.

Let's shrink the ribbon a bit more:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize7.png" width="822" border=0/>

Now it's time for the "Font" flow band to switch from 2-row to 3-row layout. All the content is still there. It's just a bit more compact.

Let's shrink the ribbon a bit more:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize8.png" width="1067" border=0/>

This pass has switched the in-ribbon gallery in "Quick Styles" to display only one button. Yet again, all the gallery content is still there. You can still scroll up and down, and open the larger grid in the popup.

Let's shrink the ribbon a bit more:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize9.png" width="716" border=0/>

This pass skips over the higher priority "Clipboard" band and goes to iconify the "Document" band content.

Let's shrink the ribbon a bit more:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize10.png" width="619" border=0/>

The ribbon resize policies set on the "Font" band keep it at the 3-row layout still, and the "Quick Styles" band is iconified.

Let's shrink the ribbon even more:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/flamingo/walkthrough/ribbon/bands/bands-resize11.png" width="1067" border=0/>

Now all the ribbon bands except for the "Clipboard" are iconified. What is going to happen when we shrink the ribbon again? Let's take a look at the resize policies set on the "Clipboard" band:

```java
List<RibbonBandResizePolicy> resizePolicies = new ArrayList<>();
resizePolicies.add(new CoreRibbonResizePolicies.Mirror(clipboardBand));
resizePolicies.add(new CoreRibbonResizePolicies.Mid2Low(clipboardBand));
clipboardBand.setResizePolicies(resizePolicies);
```

Here, the design places such an importance on this band that it never goes to the iconified state. The next phase here is to kick in horizontal scrolling on this entire ribbon task content, leaving the "Clipboard" content as it is shown in the last screenshot above.

### Conclusion

The ribbon container has a powerful set of APIs that allows extending the default resize behavior based on the relative importance of elements in each specific ribbon task. You can go with the default resize policies, or you can go as detailed as you want to fully control what gets resized, and in which order that resizing happens.

### Next

Continue to [ribbon application menu](RibbonApplicationMenu.md).
