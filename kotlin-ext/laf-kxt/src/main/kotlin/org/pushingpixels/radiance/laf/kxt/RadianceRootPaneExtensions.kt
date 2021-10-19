/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.laf.kxt

import org.pushingpixels.radiance.laf.api.RadianceLafCortex
import org.pushingpixels.radiance.laf.api.RadianceSkin
import javax.swing.JComponent
import javax.swing.JInternalFrame
import javax.swing.JRootPane
import javax.swing.SwingUtilities

/**
 * Specifies a skin to be used on this root pane. This will affect all the controls
 * in this root pane. After calling this method, call
 * [SwingUtilities.updateComponentTreeUI] on the matching window.
 *
 * @param skin     Skin to use on all the controls in the root pane.
 */
@RadianceRootPaneScope
public fun JRootPane.setSkin(skin: RadianceSkin) {
    RadianceLafCortex.RootPaneScope.setSkin(this, skin)
}

/**
 * Specifies that contents of this root pane have been modified and not saved. The **close**
 * button of the title pane of the matching frame / dialog will be animated (in case that
 * the frame / dialog have decorated title pane). In case the root pane belongs to a
 * [JInternalFrame] and that frame is iconified (to a
 * [JInternalFrame.JDesktopIcon]), the close button of the its desktop icon is
 * animated as well.
 *
 * The animation cycles between red, orange and yellow color schemes. The animation will be
 * visible only when the mouse hovers over the close button of the matching container
 * (frame, dialog, internal frame, desktop icon). The tooltip of the close button is changed
 * as well to reflect that the container contents are marked as modified.
 *
 * @param contentsModified If `true`, the **close** button of the title
 * pane of the matching frame / dialog will be animated.
 * @see JComponent.setTabContentsModified
 */
@RadianceRootPaneScope
public fun JRootPane.setContentsModified(contentsModified: Boolean?) {
    RadianceLafCortex.RootPaneScope.setContentsModified(this, contentsModified)
}
