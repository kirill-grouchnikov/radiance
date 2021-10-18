/*
 * AbstractCarouselMenuAction.java
 *
 * Created on January 14, 2007, 11:49 AM
 *
 * Copyright 2006-2007 Nigel Hughes 
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/
 * licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language 
 * governing permissions and limitations under the License.
 */

package org.pushingpixels.radiance.laf.extras.internal.contrib.blogofbug.swing.components;

import javax.swing.*;
import java.net.URL;

/**
 * An action for the CarouselMenuAction. May be later refactored into a more useful set of fields or removed completely.
 * @author nigel
 */
public abstract class AbstractCarouselMenuAction extends AbstractAction{
    /**
     * A very high resolution (recommend at leat 128x128) image to associate with the action
     */
    public static final String  ACTION_IMAGE_URL    = "actionImageURL";

    /**
     * Creates a new instance of AbstractCarouselMenuAction
     * @param image The image
     * @param label The text
     */
    public AbstractCarouselMenuAction(URL image, String label) {
        super();
        this.putValue(ACTION_IMAGE_URL,image);
        this.putValue(Action.SHORT_DESCRIPTION,label);
    }
    
}
