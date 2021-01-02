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
package org.pushingpixels.demo.trident;

import org.pushingpixels.trident.api.Timeline;
import org.pushingpixels.trident.api.TimelinePropertyBuilder.PropertyAccessor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CustomAccessor {
    private Map<String, Float> values = new HashMap<>();

    public static void main(String[] args) {
        final CustomAccessor helloWorld = new CustomAccessor();

        PropertyAccessor<Float> propertyAccessor = new PropertyAccessor<>() {
            @Override
            public Float get(Object obj, String fieldName) {
                return helloWorld.values.get("value");
            }

            @Override
            public void set(Object obj, String fieldName, Float value) {
                SimpleDateFormat sdf = new SimpleDateFormat("ss.SSS");
                float oldValue = helloWorld.values.get("value");
                System.out.println(sdf.format(new Date()) + " : " + oldValue + " -> " + value);
                helloWorld.values.put("value", value);
            }
        };
        helloWorld.values.put("value", 50f);

        Timeline timeline = Timeline.builder(helloWorld)
                .addPropertyToInterpolate(Timeline.<Float>property("value")
                        .fromCurrent()
                        .to(100.0f)
                        .accessWith(propertyAccessor))
                .setDuration(300)
                .build();
        timeline.play();

        try {
            Thread.sleep(1000);
        } catch (Exception exc) {
        }
    }
}
