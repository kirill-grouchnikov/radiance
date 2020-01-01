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
@file:Suppress("NOTHING_TO_INLINE")
package org.pushingpixels.meteor.awt

import java.awt.Component
import java.awt.Container

/**
 * Returns the view at [index].
 *
 * @throws IndexOutOfBoundsException if index is less than 0 or greater than or equal to the component count.
 */
operator fun Container.get(index: Int) =
        getComponent(index) ?: throw IndexOutOfBoundsException("Index: $index, Components: $componentCount")

/** Returns `true` if [component] is found in this container. */
inline operator fun Container.contains(component: Component) : Boolean {
    for (child in this) {
        if (child == component) {
            return true
        }
    }
    return false
}

/** Returns a [MutableIterator] over the child components in this container. */
operator fun Container.iterator() = object : MutableIterator<Component> {
    private var index = 0
    override fun hasNext() = (index < componentCount)
    override fun next() = getComponent(index++) ?: throw IndexOutOfBoundsException()
    override fun remove() = remove(--index)
}

/** Returns a [Sequence] over the child components in this container. */
val Container.children: Sequence<Component>
    get() = object : Sequence<Component> {
        override fun iterator() = this@children.iterator()
    }

/** Performs the given action on each child component in this container. */
inline fun Container.forEach(childAction: (Component) -> Unit) {
    for (index in 0 until componentCount) {
        childAction(getComponent(index))
    }
}

/** Performs the given action on each descendant component in this container. */
fun Container.deepForEach(descendantAction: (Component) -> Unit) {
    for (index in 0 until componentCount) {
        val child = getComponent(index)
        if (child is Component) {
            descendantAction(child)
        }
        if (child is Container) {
            child.deepForEach(descendantAction)
        }
    }
}
