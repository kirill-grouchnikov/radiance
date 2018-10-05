## Radiance dependencies

Radiance artifacts are available in the central Maven repository.

### Core artifacts

* `org.pushing-pixels:radiance-neon` for [Neon](neon/neon.md)
* `org.pushing-pixels:radiance-photon` for [Photon](photon/photon.md)
* `org.pushing-pixels:radiance-trident` for [Trident](trident/trident.md)
* `org.pushing-pixels:radiance-substance` for [Substance](substance/substance.md)
* `org.pushing-pixels:radiance-substance-extras` for Substance extras
* `org.pushing-pixels:radiance-flamingo` for [Flamingo](flamingo/flamingo.md)
* `org.pushing-pixels:radiance-kormorant` for [Kormorant](kormorant/kormorant.md)
* `org.pushing-pixels:radiance-spoonbill` for Spoonbill

### Tools artifacts

* `org.pushing-pixels:radiance-ignite` for [Ignite](ignite/ignite.md)
* `org.pushing-pixels:radiance-beacon` for [Beacon](beacon/beacon.md)

### Declaring dependencies

To declare a dependency on version X.Y.Z of one of the Radiance artifacts, such as `radiance-substance`:

**For Maven**

```
<dependency>
  <groupId>org.pushing-pixels</groupId>
  <artifactId>radiance-substance</artifactId>
  <version>X.Y.Z</version>
</dependency>
```

**For Gradle (Groovy DSL)**

`compile 'org.pushing-pixels:radiance-substance:X.Y.Z'`

**For Gradle (Kotlin DSL)**

`compile(group = "org.pushing-pixels", name = "radiance-substance", version = "X.Y.Z")`

**For Apache Ivy**

`<dependency org="org.pushing-pixels" name="radiance-substance" rev="X.Y.Z" />`
