/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.torch

import org.pushingpixels.trident.api.Timeline
import org.pushingpixels.trident.api.callback.TimelineCallback
import org.pushingpixels.trident.api.callback.TimelineCallbackAdapter
import org.pushingpixels.trident.api.ease.TimelineEase
import org.pushingpixels.trident.api.interpolator.KeyFrames
import org.pushingpixels.trident.api.swing.SwingComponentTimeline
import org.pushingpixels.trident.api.swing.SwingRepaintCallback
import org.pushingpixels.trident.api.swing.SwingRepaintTimeline
import java.awt.Component
import java.awt.Rectangle
import java.awt.Window
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty

// Annotation to control the receiver scoping in the DSL
@DslMarker
annotation class TridentElementMarker

@TridentElementMarker
open class KTimeline {
    var secondaryId: Comparable<*>? = null
    var duration: Long = Timeline.DEFAULT_DURATION
    var initialDelay: Long = 0
    var cycleDelay: Long = 0
    var repeatCount: Int = 0
    var repeatBehavior: Timeline.RepeatBehavior? = null
    private val callbacks: MutableList<TimelineCallback> = ArrayList()
    var name: String? = null
    internal val properties: MutableList<PropertyFromTo<*>> = ArrayList()
    private val propertiesGoingThrough: MutableList<PropertyGoingThrough<*>> = ArrayList()
    var ease: TimelineEase = Timeline.DEFAULT_EASE

    var onTimelineStateChangedList: MutableList<(Timeline.TimelineState, Timeline.TimelineState,
                                                 Float, Float) -> Unit> = ArrayList()
    var onTimelinePulseList: MutableList<(Float, Float) -> Unit> = ArrayList()

    fun property(fromTo: PropertyFromTo<*>) {
        properties.add(fromTo)
    }

    fun property(goingThrough: PropertyGoingThrough<*>) {
        propertiesGoingThrough.add(goingThrough)
    }

    fun callback(callback: TimelineCallback) {
        callbacks.add(callback)
    }

    fun onTimelineStateChanged(callback: (Timeline.TimelineState, Timeline.TimelineState,
                                          Float, Float) -> Unit) {
        onTimelineStateChangedList.add(callback)
    }

    fun onTimelineDone(callback: () -> Unit) {
        onTimelineStateChangedList.add { _, newState, _, _ ->
            if (newState == Timeline.TimelineState.DONE) {
                callback.invoke()
            }
        }
    }

    fun onTimelinePulse(callback: (Float, Float) -> Unit) {
        onTimelinePulseList.add(callback)
    }

    internal fun populateBuilder(builder: Timeline.BaseBuilder<*, *, *>) {
        if (this.secondaryId != null) {
            builder.setSecondaryId(this.secondaryId)
        }
        builder.duration = this.duration
        builder.setInitialDelay(this.initialDelay)
        builder.setCycleDelay(this.cycleDelay)
        builder.setRepeatCount(this.repeatCount)
        if (this.repeatBehavior != null) {
            builder.setRepeatBehavior(this.repeatBehavior)
        }
        if (this.name != null) {
            builder.setName(this.name)
        }
        builder.setEase(this.ease)

        for (prop in this.properties) {
            val propBuilder = Timeline.property<Any>(prop.property.name)
            if (prop.from == null) {
                propBuilder.fromCurrent()
            } else {
                propBuilder.from(prop.from)
            }
            propBuilder.to(prop.to)
            propBuilder.getWith { _, _ -> prop.property.getter.call() }
            propBuilder.setWith { _, _, value -> (prop.property as? KMutableProperty)?.setter?.call(value) }
            builder.addPropertyToInterpolate(propBuilder)
        }
        for (prop in this.propertiesGoingThrough) {
            builder.addPropertyToInterpolate(Timeline.property<Any>(prop.property.name)
                    .goingThrough(prop.keyFrames)
                    .getWith { _, _ -> prop.property.getter.call() }
                    .setWith { _, _, value -> (prop.property as? KMutableProperty)?.setter?.call(value) })
        }

        for (callback in this.callbacks) {
            builder.addCallback(callback)
        }
        if (this.onTimelineStateChangedList.isNotEmpty() || this.onTimelinePulseList.isNotEmpty()) {
            builder.addCallback(object : TimelineCallbackAdapter() {
                override fun onTimelineStateChanged(oldState: Timeline.TimelineState,
                                                    newState: Timeline.TimelineState, durationFraction: Float, timelinePosition: Float) {
                    for (callback in onTimelineStateChangedList) {
                        callback.invoke(oldState, newState, durationFraction, timelinePosition)
                    }
                }

                override fun onTimelinePulse(durationFraction: Float, timelinePosition: Float) {
                    for (callback in onTimelinePulseList) {
                        callback.invoke(durationFraction, timelinePosition)
                    }
                }
            })
        }
    }
}

class KSwingComponentTimeline(val component: Component) : KTimeline() {
    fun property(fromTo: PropertyFactoryFromTo<*, in Component>) {
        if (fromTo.from == null) {
            properties.add(fromTo.property.property(component) fromCurrentTo fromTo.to)
        } else {
            properties.add(fromTo.property.property(component) from fromTo.from to fromTo.to)
        }
    }

    fun repaintCallback() {
        callback(SwingRepaintCallback(component))
    }
}

class KSwingWindowTimeline(val window: Window) : KTimeline() {
    fun property(fromTo: PropertyFactoryFromTo<*, in Window>) {
        if (fromTo.from == null) {
            properties.add(fromTo.property.property(window) fromCurrentTo fromTo.to)
        } else {
            properties.add(fromTo.property.property(window) from fromTo.from to fromTo.to)
        }
    }
}

class KSwingRepaintTimeline(val component: Component) : KTimeline() {
    var toRepaint: Rectangle? = null
    var autoRepaintMode: Boolean = true
}

fun timeline(property: KProperty<Any>, from: Any, to: Any): Timeline {
    val builder = Timeline.Builder()
    builder.addPropertyToInterpolate(Timeline.property<Any>(property.name)
            .from(from)
            .to(to)
            .getWith { _, _ -> property.getter.call() }
            .setWith { _, _, value -> (property as? KMutableProperty)?.setter?.call(value) })

    return builder.build()
}

fun timeline(property: KProperty<Any>, to: Any): Timeline {
    val builder = Timeline.Builder()
    builder.addPropertyToInterpolate(Timeline.property<Any>(property.name)
            .fromCurrent()
            .to(to)
            .getWith { _, _ -> property.getter.call() }
            .setWith { _, _, value -> (property as? KMutableProperty)?.setter?.call(value) })

    return builder.build()
}

fun timeline(init: KTimeline.() -> Unit): Timeline {
    val timeline = KTimeline()
    timeline.init()

    val builder = Timeline.Builder()
    timeline.populateBuilder(builder)
    return builder.build()
}

fun Any.timeline(init: KTimeline.() -> Unit): Timeline {
    val timeline = KTimeline()
    timeline.init()

    val builder = Timeline.builder(this)
    timeline.populateBuilder(builder)
    return builder.build()
}

fun Component.componentTimeline(init: KSwingComponentTimeline.() -> Unit): SwingComponentTimeline {
    val timeline = KSwingComponentTimeline(this)
    timeline.init()

    val builder = SwingComponentTimeline.componentBuilder(this)
    timeline.populateBuilder(builder)
    return builder.build()
}

fun Window.windowTimeline(init: KSwingWindowTimeline.() -> Unit): SwingComponentTimeline {
    val timeline = KSwingWindowTimeline(this)
    timeline.init()

    val builder = SwingComponentTimeline.componentBuilder(this)
    timeline.populateBuilder(builder)
    return builder.build()
}

fun Component.repaintTimeline(init: (KSwingRepaintTimeline.() -> Unit)? = null): SwingRepaintTimeline {
    val timeline = KSwingRepaintTimeline(this)
    if (init != null) {
        timeline.init()
    }

    val builder = SwingRepaintTimeline.repaintBuilder(this)
    timeline.populateBuilder(builder)
    if (timeline.toRepaint != null) {
        builder.setRepaintRectangle(timeline.toRepaint)
    }
    builder.setAutoRepaintMode(timeline.autoRepaintMode)
    return builder.build()
}

data class PropertyFrom<R>(val property: KProperty<R>, val from: R) {
    infix fun to(to: R): PropertyFromTo<R> {
        return PropertyFromTo(this.property, this.from, to)
    }
}

data class PropertyFromTo<R>(val property: KProperty<R>, val from: R?, val to: R)

data class PropertyGoingThrough<R>(val property: KProperty<R>, val keyFrames: KeyFrames<R>)

infix fun <R> KProperty<R>.from(from: R): PropertyFrom<R> {
    return PropertyFrom(this, from)
}

infix fun <R> KProperty<R>.fromCurrentTo(to: R): PropertyFromTo<R> {
    return PropertyFromTo(this, null, to)
}

infix fun <R> KProperty<R>.goingThrough(keyFrames: KeyFrames<R>): PropertyGoingThrough<R> {
    return PropertyGoingThrough(this, keyFrames)
}

abstract class PropertyFactory<T, R> {
    abstract fun property(mainObject: R): SettableProperty<T>

    infix fun from(from: T): PropertyFactoryFrom<T, R> {
        return PropertyFactoryFrom(this, from)
    }

    infix fun fromCurrentTo(to: T): PropertyFactoryFromTo<T, R> {
        return PropertyFactoryFromTo(this, null, to)
    }
}

data class PropertyFactoryFrom<T, R>(val property: PropertyFactory<T, R>, val from: T) {
    infix fun to(to: T): PropertyFactoryFromTo<T, R> {
        return PropertyFactoryFromTo(this.property, this.from, to)
    }
}

data class PropertyFactoryFromTo<T, R>(val property: PropertyFactory<T, R>, val from: T?, val to: T)
