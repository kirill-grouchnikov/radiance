## Flamingo - ribbon keytips

Keytips are evolution of mnemonics - a way to quickly navigate to and activate a specific command or component without using the mouse. Keytips are only shown on projections added to the ribbon container.

If we start from this content in our ribbon:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon/content/content-intro.png" width="1433" border=0/>

and then activate keytips by pressing the "Alt" key on the keyboard, the ribbon will show the first level of keytips:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon/bands/ribbon-keytips.png" width="1400" border=0/>

This first level shows keytips for:
- Application menu button
- All task toggle buttons
- Anchored content (to the far right of the task toggle buttons)
- All taskbar content (in the window title pane)

Pressing a key that corresponds to one of the single-letter keytips will hide this first level and activate the matching part of the ribbon. Activation mechanics depend on the specific part:

- For the application menu button it will show the application menu + display keytips of primary entries in that menu.
- For a task toggle button it will select that task (if necessary) + display keytips of components in that task.
- For an anchored command it will either activate its action or display its secondary content depending on which keytip it is.
- For a taskbar component it will either activate its action or display its secondary content depending on which keytip it is.
- Special handling for taskbar overflow button - it will show taskbar overflow content + display keytips of those overflow components.

Here is how the ribbon will look like if you press the "P" key on the keyboard - that corresponds to the "Page Layout" task:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon/bands/band-keytips.png" width="1400" border=0/>

Pressing a key that corresponds to one of the keytips here will either activate the action of the relevant projection or display the secondary content of that projection depending on which keytip it is. For example, if you press "V" key on the keyboard - that corresponds to secondary content of the "Paste" button in the first band, it will display that popup content:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/flamingo/walkthrough/ribbon/bands/command-popup-keytips.png" width="1400" border=0/>

What happens when the ribbon shows keytips for a certain level (root, task, application menu, etc) and some keytips are configured to have two characters? You can see this in the second screenshot above where some of the components in the middle "Font" band have two-character keytips - AO, AI, AL, AC, AR, AF.

If you press "A", only keytips that start with A will remain visible. Then, pressing one of the second letters (O, I, L, C, R or F in this case) will either activate the action of the relevant projection or display the secondary content of that projection depending on which keytip it is.

### Next

Continue to [keyboard accelerators](RibbonKeyboardAccelerators.md).
