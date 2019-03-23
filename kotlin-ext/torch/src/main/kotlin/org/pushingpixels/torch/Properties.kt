/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import java.awt.Color
import kotlin.reflect.*


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

