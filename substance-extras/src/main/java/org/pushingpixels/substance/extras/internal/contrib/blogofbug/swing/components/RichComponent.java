/*
 * RichComponent.java
 *
 * Created on March 16, 2007, 3:58 PM
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

package org.pushingpixels.substance.extras.internal.contrib.blogofbug.swing.components;

import java.awt.Image;
import java.io.File;
import java.net.URL;

/**
 * A component that can be part of the a rich user interface
 * @author nigel
 */
public interface RichComponent {
    
    /** 
     * Assigns an image to the component, the width and height taken from the supplied image
     *
     * @param image         The URL of the image
     */
    void setRichImage(URL image);
    
    /** 
     * Assigns an image to the component, the width and height taken from the supplied image
     *
     * @param image A file referencing the image
     */
    void setRichImage(File image);

    /** 
     * Assisgns an image to the component, the width and height taken from the supplied image
     *
     * @param image An image object containing the image
     */
    void setRichImage(Image image);
    
    /** 
     * Allows a RichContainer to request that the component pre-renders anything
     * that might provide peak performance. It is expected that most implementations will 
     * do this automatically after the image has been specified
     */
    void prePaintImage();
    
    /**
     * Specifies text that should be displayed by the rich component when 
     * getRichText() is called.
     * @param text The text to be displayed. This may be different to that of the component
     * being enriched.
     */
    void setRichText(String text);
    
    /**
     * Gets the text to be displayed by the RichContainer for the component. May
     * be extracted from elsewhere
     *
     * @return The text to be displayed
     */
    String getRichText();
    
    /** 
     * Assisgns a uniform alpha to the component
     *
     * @param alpha A value from 0.0 to 1.0 where 1.0 is fully visible, and 0.0
     * is completely invisible.
     */
    void setAlpha(float alpha);
    
    
}
