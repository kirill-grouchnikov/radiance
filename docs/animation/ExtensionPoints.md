## Core functionality
The core functionality of the Radiance Animation library can be extended to address custom needs of the specific applications. Out of the box Radiance supports:

* The timeline pulses being fired by a dedicated thread that wakes up every 40ms and updates all the timelines
* Interpolating [float and integer fields](TimelineInterpolatingFields.md) of any Java object that provides the matching public setter methods
* Swing [UI toolkit](UIToolkitSupport.md), respecting the threading rules and providing interpolators for the custom graphic classes

Interested applications can use Animation configuration APIs to:

* Provide a custom pulse source to drive the timeline updates
* Provide additional property interpolators for custom application classes
* Support additional Java-based UI toolkits

### Configuration APIs

The `RadianceAnimationCortex` class contains the published configuration APIs for:

* Setting a custom [pulse source](CustomPulseSource.md)
* Adding, removing and querying [property interpolators](CustomPropertyInterpolators.md)
* Adding, removing and querying [UI toolkit handlers](CustomUIToolkitHandlers.md)
