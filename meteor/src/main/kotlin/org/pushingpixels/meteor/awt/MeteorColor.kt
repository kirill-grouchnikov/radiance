/*
 * Copyright (c) 2018 Radiance Meteor Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Meteor Kirill Grouchnikov nor the names of
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

import java.awt.Color


/**
 * Returns the red component of the color. This method enables the usage of destructuring
 * declarations such as:
 *
 * ```
 * val (red, green, blue) = color
 * ```
 */
inline operator fun Color.component1() = this.red

/**
 * Returns the green component of the color. This method enables the usage of destructuring
 * declarations such as:
 *
 * ```
 * val (red, green, blue) = color
 * ```
 */
inline operator fun Color.component2() = this.green

/**
 * Returns the blue component of the color. This method enables the usage of destructuring
 * declarations such as:
 *
 * ```
 * val (red, green, blue) = color
 * ```
 */
inline operator fun Color.component3() = this.blue

/**
 * Returns the alpha component of the color. This method enables the usage of destructuring
 * declarations such as:
 *
 * ```
 * val (red, green, blue, alpha) = color
 * ```
 */
inline operator fun Color.component4() = this.alpha

/**
 * Returns the hue of the color. This is a shortcut for calling [Color.HSBtoRGB] and
 * returning the first component of the result.
 */
inline fun Color.hue() = Color.RGBtoHSB(this.red, this.green, this.blue, null)[0]

/**
 * Returns the saturation of the color. This is a shortcut for calling [Color.HSBtoRGB] and
 * returning the second component of the result.
 */
inline fun Color.saturation() = Color.RGBtoHSB(this.red, this.green, this.blue, null)[1]

/**
 * Returns the brightness of the color. This is a shortcut for calling [Color.HSBtoRGB] and
 * returning the third component of the result.
 */
inline fun Color.brightness() = Color.RGBtoHSB(this.red, this.green, this.blue, null)[2]

/**
 * Returns a derived color based on the passed alpha.
 */
inline fun Color.withAlpha(alpha: Int) : Color {
    return Color(this.red, this.green, this.blue, alpha)
}
