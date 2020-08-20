/*
 * Copyright (c) 2005-2020 Rainbow Kirill Grouchnikov
 * and Alexander Potochkin. All Rights Reserved.
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
package org.pushingpixels.demo.rainbow

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.flamingo.api.bcb.JBreadcrumbBar
import org.pushingpixels.flamingo.api.common.*
import org.pushingpixels.flamingo.api.common.model.Command
import org.pushingpixels.flamingo.api.layout.TransitionLayoutManager
import org.pushingpixels.neon.api.icon.ResizableIcon
import org.pushingpixels.photon.api.icon.SvgBatikResizableIcon
import java.awt.Dimension
import java.io.InputStream

/**
 * Panel that hosts SVG-based gallery buttons.
 *
 * @author Kirill Grouchnikov
 */
class RainbowFileViewPanel<T>(private val bar: JBreadcrumbBar<T>, startingDimension: Int) :
        AbstractFileViewPanel<T>(startingDimension) {
    init {
        TransitionLayoutManager.getInstance().track(this, true)
    }

    override fun configureCommand(leaf: Leaf, command: Command, icon: ResizableIcon?) {
        command.actionRichTooltip = RichTooltip.builder()
                .setTitle("Transcode")
                .addDescriptionSection("Click to generate Java2D class")
                .build()
        command.action = CommandAction {
            GlobalScope.launch(Dispatchers.Swing) {
                // can't pass the stream contents since the input can be .svgz
                val svgIcon = icon as SvgBatikResizableIcon
                RainbowUtils.processSvgButtonClick(svgIcon.svgBytes, leaf.leafName)
            }
        }
    }

    override fun toShowFile(pair: StringValuePair<T>): Boolean {
        val name = pair.key
        return name.endsWith(".svg") || name.endsWith(".svgz")
    }

    override fun getLeafContent(leaf: T): InputStream? {
        return bar.callback.getLeafContent(leaf)
    }

    override fun getResizableIcon(leaf: AbstractFileViewPanel.Leaf, stream: InputStream,
            state: CommandButtonPresentationState, dimension: Dimension): ResizableIcon? {
        val name = leaf.leafName
        return if (name.endsWith(".svg"))
            SvgBatikResizableIcon.getSvgIcon(leaf.leafStream, dimension)
        else
            SvgBatikResizableIcon.getSvgzIcon(leaf.leafStream, dimension)
    }
}
