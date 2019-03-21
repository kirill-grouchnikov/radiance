/*
 * Copyright (c) 2018-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Kirill Grouchnikov nor the names of
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

import org.pushingpixels.trident.Timeline
import org.pushingpixels.trident.callback.TimelineCallback
import org.pushingpixels.trident.callback.TimelineCallbackAdapter
import org.pushingpixels.trident.ease.TimelineEase
import org.pushingpixels.trident.interpolator.KeyFrames
import org.pushingpixels.trident.swing.SwingComponentTimeline
import org.pushingpixels.trident.swing.SwingRepaintTimeline
import java.awt.Color
import java.awt.Component
import java.awt.Rectangle
import kotlin.reflect.*

@TridentElementMarker
open class KTimeline {
    var secondaryId: Comparable<*>? = null
    var duration: Long = Timeline.DEFAULT_DURATION
    var initialDelay: Long = 0
    var cycleDelay: Long = 0
    var repeatCount: Int = 0
    var repeatBehavior: Timeline.RepeatBehavior? = null
    val callbacks: MutableList<TimelineCallback> = ArrayList()
    var name: String? = null
    val properties: MutableList<PropertyFromTo<*>> = ArrayList()
    val propertiesGoingThrough : MutableList<PropertyGoingThrough<*>> = ArrayList()
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
            builder.addPropertyToInterpolate(Timeline.property<Any>(prop.property.name)
                    .from(prop.from)
                    .to(prop.to)
                    .setWith { _, _, value -> (prop.property as? KMutableProperty)?.setter?.call(value) })
        }
        for (prop in this.propertiesGoingThrough) {
            builder.addPropertyToInterpolate(Timeline.property<Any>(prop.property.name)
                    .goingThrough(prop.keyFrames)
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
    fun property(fromTo: PropertyFactoryFromTo<*>) {
        properties.add(fromTo.property.property(component) from fromTo.from to fromTo.to)
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

data class PropertyFromTo<R>(val property: KProperty<R>, val from: R, val to: R)

data class PropertyGoingThrough<R>(val property: KProperty<R>, val keyFrames: KeyFrames<R>)

infix fun <R> KProperty<R>.from(from: R): PropertyFrom<R> {
    return PropertyFrom(this, from)
}

infix fun <R> KProperty<R>.goingThrough(keyFrames: KeyFrames<R>): PropertyGoingThrough<R> {
    return PropertyGoingThrough(this, keyFrames)
}

class Getter<R>(override val property: SettableProperty<R>) : KProperty.Getter<R> {
    override val annotations: List<Annotation>
        get() = ArrayList()
    override val isAbstract: Boolean
        get() = false
    override val isExternal: Boolean
        get() = false
    override val isFinal: Boolean
        get() = false
    override val isInfix: Boolean
        get() = false
    override val isInline: Boolean
        get() = false
    override val isOpen: Boolean
        get() = true
    override val isOperator: Boolean
        get() = false
    override val isSuspend: Boolean
        get() = false
    override val name: String
        get() = "foreground"
    override val parameters: List<KParameter>
        get() = ArrayList()
    override val returnType: KType
        get() = Color::javaClass.returnType
    override val typeParameters: List<KTypeParameter>
        get() = ArrayList()
    override val visibility: KVisibility?
        get() = KVisibility.PRIVATE

    override fun call(vararg args: Any?): R {
        return property.get()
    }

    override fun callBy(args: Map<KParameter, Any?>): R {
        return property.get()
    }
}

class Setter<R>(override val property: SettableProperty<R>) : KMutableProperty.Setter<R> {
    override val annotations: List<Annotation>
        get() = ArrayList()
    override val isAbstract: Boolean
        get() = false
    override val isExternal: Boolean
        get() = false
    override val isFinal: Boolean
        get() = false
    override val isInfix: Boolean
        get() = false
    override val isInline: Boolean
        get() = false
    override val isOpen: Boolean
        get() = true
    override val isOperator: Boolean
        get() = false
    override val isSuspend: Boolean
        get() = false
    override val name: String
        get() = property.name
    override val parameters: List<KParameter>
        get() = ArrayList()
    override val returnType: KType
        get() = property.returnType
    override val typeParameters: List<KTypeParameter>
        get() = ArrayList()
    override val visibility: KVisibility?
        get() = KVisibility.PRIVATE

    @Suppress("UNCHECKED_CAST")
    override fun call(vararg args: Any?) {
        property.set(args[0] as R)
    }

    override fun callBy(args: Map<KParameter, Any?>) {
        throw UnsupportedOperationException()
    }
}

interface SettableProperty<R> : KMutableProperty<R> {
    fun set(value: R)
    fun get(): R
}

infix fun <R> SettableProperty<R>.from(from: R): PropertyFrom<R> {
    return PropertyFrom(this, from)
}

internal abstract class BaseSettableProperty<R>(private val propName: String, private val propType: KType) :
        SettableProperty<R> {
    override val annotations: List<Annotation>
        get() = ArrayList()
    override val isAbstract: Boolean
        get() = false
    override val isFinal: Boolean
        get() = false
    override val isOpen: Boolean
        get() = false
    override val isSuspend: Boolean
        get() = false
    override val isConst: Boolean
        get() = false
    override val isLateinit: Boolean
        get() = false
    override val parameters: List<KParameter>
        get() = ArrayList()
    override val typeParameters: List<KTypeParameter>
        get() = ArrayList()
    override val visibility: KVisibility?
        get() = KVisibility.PRIVATE

    override val name: String
        get() = propName
    override val returnType: KType
        get() = propType

    override fun call(vararg args: Any?): R {
        throw UnsupportedOperationException()
    }

    override fun callBy(args: Map<KParameter, Any?>): R {
        throw UnsupportedOperationException()
    }

    override val getter: KProperty.Getter<R> get() = Getter(this)
    override val setter: KMutableProperty.Setter<R> get() = Setter(this)
}

abstract class PropertyFactory<T> {
    abstract fun property(component: Component): SettableProperty<T>

    infix fun from(from: T): PropertyFactoryFrom<T> {
        return PropertyFactoryFrom<T>(this, from)
    }
}

object TorchComponent {
    val foreground = object : PropertyFactory<Color>() {
        override fun property(component: Component): SettableProperty<Color> {
            return object : BaseSettableProperty<Color>("foreground", Color::javaClass.returnType) {
                override fun set(value: Color) {
                    component.foreground = value
                }

                override fun get(): Color {
                    return component.foreground
                }
            }
        }
    }
}

data class PropertyFactoryFrom<T>(val property: PropertyFactory<T>, val from: T) {
    infix fun to(to: T): PropertyFactoryFromTo<T> {
        return PropertyFactoryFromTo(this.property, this.from, to)
    }
}

data class PropertyFactoryFromTo<T>(val property: PropertyFactory<T>, val from: T, val to: T)






