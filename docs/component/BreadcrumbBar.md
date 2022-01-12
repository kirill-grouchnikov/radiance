## Components - breadcrumb bars

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/breadcrumb.png" width="620" border=0/>

Breadcrumb bars facilitate quick navigation of multi-level hierarchies, such as file systems or XML documents. This functionality is commonly found in many web sites and is the main navigation tool in the Windows Explorer application.

The core library provides helper classes to expose a variety of navigation sources as breadcrumb bars, such as local and remote file systems, and tree models.

### Supplying content to breadcrumb bar

Unlike [command](Command.md) and other related content models (command strips, command panels, command popup menus), breadcrumb bar does not force ahead-of-time, exhaustive construction of the entire content at initialization time.

The `BreadcrumbBarContentProvider` is used by the breadcrumb component at runtime to ask the application code for the structure of the hierarchy being navigated. The two main methods are:

- `List<BreadcrumbItem<T>> getPathChoices(List<BreadcrumbItem<T>> path)`
- `List<BreadcrumbItem<T>> getLeaves(List<BreadcrumbItem<T>> path)`

What are these two used for? Let's take another look at the screenshot of a sample app that is using the breadcrumb bar for navigating the local file system:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/breadcrumb.png" width="620" border=0/>

The `getPathChoices()` should return the list of paths that can be "explored" from the specified path. In the screenshot above these are the subfolders of the currently activated "JavaVirtualMachines" path.

The `getLeaves()` should return the list of leaf elements that correspond to the specified path. In the screenshot above these are the individual files (not subfolders) of the currently selected "bin" path.

### Working with breadcrumb bar

The `JBreadcrumbBar` is a Swing component. It is initialized with:

* a `BreadcrumbBarContentProvider` that is used to dynamically populate the breadcrumb bar content as the user interacts with it
* a `BreadcrumbBarPresentationModel` that is used to configure the visual appearance of the content

Use `JBreadcrumbBar.setPath()` to set the specified path to be the currently selected one - like the "Select and set path..." in the screenshot above that does this:

```java
JButton setPath = new JButton("Select and set path...");
setPath.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
    JFileChooser folderChooser = new JFileChooser();
    folderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    if (folderChooser.showOpenDialog(BreadCrumbTest.this) == JFileChooser.APPROVE_OPTION) {
        File selected = folderChooser.getSelectedFile();
        bar.setPath(selected);
    }
}));
```

Here, we are using the `BreadcrumbFileSelector` that is a core extension of `JBreadcrumbBar` that exposes the local file system. This subclass exposes `setPath(File)` API that constructs a full `List<BreadcrumbItem<File>>` that leads from the root of the file system to the specified file.

### Observing breadcrumb events

Let's go back to our app screenshot again:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/breadcrumb.png" width="620" border=0/>

The top part of the app is `BreadcrumbFileSelector` (which is a subclass of `JBreadcrumbBar`). The main content is the panel that shows the list of files in the currently selected path. This panel is an extension of `AbstractFileViewPanel` class.

On the presentation side of things, it is implemented as a [command button panel](CommandPanel.md) with `CommandPanelContentModel` content model, `CommandPanelPresentationModel` presentation model and `CommandPanelProjection` projection.

But how does a selection change in the breadcrumb bar (clicking any element of the path or selecting a new path) get reflected in this panel?

It is achieved by adding a path listener to the `JBreadcrumbBar`'s model:

```java
this.bar.getContentModel().addPathListener(
        event -> SwingUtilities.invokeLater(() -> {
            final List<BreadcrumbItem<File>> newPath = event.getSource().getItems();
            System.out.println("New path is ");
            for (BreadcrumbItem<File> item : newPath) {
                System.out.println("\t" + item.getData().getAbsolutePath());
            }

            if (newPath.size() > 0) {
                SwingWorker<List<BreadcrumbItem<File>>, Void> worker = new SwingWorker<>() {
                    @Override
                    protected List<BreadcrumbItem<File>> doInBackground() throws Exception {
                        return bar.getContentProvider().getLeaves(newPath);
                    }

                    @Override
                    protected void done() {
                        try {
                            List<BreadcrumbItem<File>> leaves = get();
                            filePanel.setFolder(leaves);
                        } catch (Exception exc) {
                        }
                    }
                };
                worker.execute();
            }
        }));
```

Let's take a look at what we're doing here:

- Use `JBreadcrumbBar.getContentModel()` to get an instance of `BreadcrumbBarContentModel`.
- Use `BreadcrumbBarContentModel.addPathListener()` to add a `BreadcrumbPathListener`.
- The listener's only method (elided `breadcrumbPathEvent`) gets a `BreadcrumbPathEvent` object.
- Use `BreadcrumbPathEvent.getSource()` to obtain the model (or use the same `bar.getContentModel()` above) and then `BreadcrumbBarContentModel.getItems()` to get the currently selected path.
- Create a `SwingWorker` to load the list of files in the selected path in the background using `BreadcrumbBarContentProvider.getLeaves()`. We want to run this off the UI thread so that the UI remains responsive during this potentially blocking I/O operation.
- When the list of files is loaded, call `AbstractFileViewPanel.setFolder()` API to update the panel to show the files from the currently selected path. As that content is loaded, `AbstractFileViewPanel` calls into its abstract `configureCommand()` and `getRadianceIcon` (which are implemented in our subclass) to get the application-specific visual representation of each file.

### Core breadcrumb bar integrations

The `org.pushingpixels.radiance.component.api.bcb.core` has helper classes to facilitate exposing existing hierarchical data sources as breadcrumb bar content.

- `BreadcrumbFileSelector` subclasses the `JBreadcrumbBar` class to expose the local file system.
- `BreadcrumbTreeAdapterSelector` subclasses the `JBreadcrumbBar` class to wrap the core Swing `JTree` and `TreeModel` structures.
