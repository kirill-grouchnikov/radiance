## Timeline scenarios
**Timeline scenario** allows combining multiple timeline scenario actors in a parallel, sequential or custom order.

There are three core types of timeline scenario actors:
* [Timelines](TimelineOverview.md)
* `TimelineRunnable` which is an extension of [Runnable](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)
* [Swing-specific](UIToolkitSupport.md) `TimelineSwingWorker` class which is an extension of [SwingWorker](http://docs.oracle.com/javase/8/docs/api/javax/swing/SwingWorker.html).

Additional types of timeline scenario actors can be added in the application code by implementing the `TimelineScenario.TimelineScenarioActor` interface.

To create a custom timeline scenario, use the following APIs of the `TimelineScenario` class:
* `public void addScenarioActor(TimelineScenarioActor actor)` adds the specified actor
* `public void addDependency(TimelineScenarioActor actor, TimelineScenarioActor... waitFor)` specifies the dependencies between the actors

### Timeline scenario kinds

There are three built-in timeline scenario kinds that address the most common dependencies between the actors:
* `Timeline.Parallel` runs all the actors in a parallel fashion
* `Timeline.Sequence` runs the actors one after another in the order they have been added
* `Timeline.RendezvousSequence` allows simple branch-and-wait ordering. The rendezvous scenario has a stage-like approach. All actors belonging to the same stage run in parallel, while actors in stage N+1 wait for **all** actors in stage N to be finished. The `RendezvousSequence.rendezvous()` marks the end of one stage and the beginning of another.
