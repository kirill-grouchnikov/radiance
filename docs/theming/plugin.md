## Radiance look and feel - plugins

While the core library provides consistent visuals and animation effects for core Swing components, it also provides an extensible plugin architecture to extend the library functionality to third-party components.

### Creating a plugin

Radiance plugin is a class that implements `RadianceThemingComponentPlugin` interface, along with optional additional implementation details.

The `RadianceThemingComponentPlugin` interface specifies the following methods which must be implemented by the plugin:

```java
  /**
   * Initializes <code>this</code> plugin.
   */
  default void initialize();

  /**
   * Unitializes <code>this</code> plugin.
   */
  default void uninitialize();

  /**
   * Retrieves a collection of custom settings based on the specified skin.
   * The entries in the array should be pairwise, odd being symbolic name of a
   * setting, and even being the setting value.
   *
   * @param skin
   *            Radiance skin.
   * @return Collection of custom settings based on the specified skin. The
   *         entries in the array should be pairwise, odd being symbolic name
   *         of a setting, and even being the setting value.
   */
  public Object[] getDefaults(RadianceSkin skin);
```  

### Using plugins

During the initialization of your application in the `main()` method - before creating your first window - use these `RadianceThemingCortex.GlobalScope` APIs to register plugins:
* `registerComponentPlugin()` for registering component plugins
* `registerSkinPlugin()` for registering skin plugins
