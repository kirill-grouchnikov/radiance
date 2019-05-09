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
package org.pushingpixels.demo.trident;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.TimelinePropertyBuilder.PropertySetter;

public class CustomSetter {
    private float value;

    public static void main(String[] args) {
        final CustomSetter helloWorld = new CustomSetter();
        PropertySetter<Float> propertySetter = (Object obj, String fieldName, Float value) -> {
            SimpleDateFormat sdf = new SimpleDateFormat("ss.SSS");
            float oldValue = helloWorld.value;
            System.out.println(sdf.format(new Date()) + " : " + oldValue + " -> " + value);
            helloWorld.value = value;
        };

        Timeline timeline = Timeline.builder(helloWorld)
                .addPropertyToInterpolate(Timeline.<Float>property("value")
                        .from(0.0f)
                        .to(1.0f)
                        .setWith(propertySetter))
                .setDuration(300)
                .build();
        timeline.play();

        try {
            Thread.sleep(1000);
        } catch (Exception exc) {
        }
    }
}
