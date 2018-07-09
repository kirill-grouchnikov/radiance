/*
 * Copyright (c) 2018 Radiance Kormorant Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Kormorant Kirill Grouchnikov nor the names of
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
package org.pushingpixels.kormorant.ribbon

import org.pushingpixels.flamingo.api.ribbon.RibbonTask
import org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizeSequencingPolicy
import org.pushingpixels.kormorant.FlamingoElementMarker
import org.pushingpixels.kormorant.NullableDelegate

@FlamingoElementMarker
class KRibbonTaskBandContainer {
    internal val bands = arrayListOf<KBaseRibbonBand<*, *>>()

    operator fun KBaseRibbonBand<*, *>.unaryPlus() {
        this@KRibbonTaskBandContainer.bands.add(this)
    }
}

@FlamingoElementMarker
class KRibbonTask {
    private lateinit var ribbonTask: RibbonTask
    private var hasBeenConverted: Boolean = false

    var title: String? by NullableDelegate({ hasBeenConverted })
    var keyTip: String? by NullableDelegate({ hasBeenConverted })
    private val bands = KRibbonTaskBandContainer()
    var bandResizeSequencingPolicySource: ((task: RibbonTask) -> RibbonBandResizeSequencingPolicy)?
            by NullableDelegate({ hasBeenConverted })

    fun bands(init: KRibbonTaskBandContainer.() -> Unit) {
        bands.init()
    }

    fun asRibbonTask(): RibbonTask {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }
        val javaBands = bands.bands.map { it -> it.asRibbonBand() }
        ribbonTask = RibbonTask(title, javaBands.asIterable())
        ribbonTask.keyTip = keyTip
        if (bandResizeSequencingPolicySource != null) {
            ribbonTask.resizeSequencingPolicy =
                    bandResizeSequencingPolicySource!!(ribbonTask)
        }
        hasBeenConverted = true
        return ribbonTask
    }
}

fun ribbonTask(init: KRibbonTask.() -> Unit): KRibbonTask {
    val ribbonTask = KRibbonTask()
    ribbonTask.init()
    return ribbonTask
}
