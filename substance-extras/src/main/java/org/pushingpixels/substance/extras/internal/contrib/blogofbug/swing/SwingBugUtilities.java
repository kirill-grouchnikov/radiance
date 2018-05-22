/*
 * SwingBugUtilities.java
 *
 * Created on March 30, 2007, 12:27 AM
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

package org.pushingpixels.substance.extras.internal.contrib.blogofbug.swing;

import java.awt.event.ActionEvent;

import javax.swing.Timer;

/**
 * Contains some utility methods applicable to any swing application. 
 *
 * @author nigel
 */
public class SwingBugUtilities {
    
    /** Creates a new instance of SwingBugUtilities */
    private SwingBugUtilities() {
    }
    
    /** 
     * Runs the supplied class after a certain period of time, the thread
     * will be executed in the EDT. 
     *
     * @param execute The runnable object whose method will be called after the
     * specified delay
     * @param after The delay in ms before the event will be called
     */
    public static void invokeAfter(final Runnable execute, int after){
        Timer timer = new Timer(after, (ActionEvent actionEvent) -> execute.run());
        timer.setRepeats(false);
        timer.start();
    }
}
