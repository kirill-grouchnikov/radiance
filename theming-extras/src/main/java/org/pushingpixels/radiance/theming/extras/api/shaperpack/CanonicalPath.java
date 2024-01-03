/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.extras.api.shaperpack;

import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class CanonicalPath {
    private ArrayList<Point2D> majorPoints;

    private ArrayList<Point2D> minorPoints;

    private double ratio;

    public CanonicalPath(ArrayList<Point2D> majorPoints, ArrayList<Point2D> minorPoints, double ratio) {
        if (majorPoints.size() != minorPoints.size()) {
            throw new IllegalArgumentException("Sizes of major and minor must be equal");
        }
        this.majorPoints = majorPoints;
        this.minorPoints = minorPoints;
        this.ratio = ratio;
    }

    public GeneralPath getPath(float width, float height, float insets) {
        GeneralPath path = new GeneralPath();
        if (this.majorPoints.size() < 2) {
            return path;
        }

        float xs = insets;
        float ys = insets;
        width -= 2 * insets;
        height -= 2 * insets;

        path.moveTo((float) (xs + width * this.majorPoints.get(0).getX()),
                (float) (ys + height * this.majorPoints.get(0).getY()));
        for (int i = 1; i < this.majorPoints.size(); i++) {
            path.quadTo(xs + width * this.minorPoints.get(i - 1).getX(),
                    ys + height * this.minorPoints.get(i - 1).getY(),
                    xs + width * this.majorPoints.get(i).getX(),
                    ys + height * this.majorPoints.get(i).getY());
        }
        path.quadTo(xs + width * this.minorPoints.get(this.minorPoints.size() - 1).getX(),
                ys + height * this.minorPoints.get(this.minorPoints.size() - 1).getY(),
                xs + width * this.majorPoints.get(0).getX(),
                ys + height * this.majorPoints.get(0).getY());
        return path;
    }

    public ArrayList<Point2D> getMajorPoints() {
        return majorPoints;
    }

    public ArrayList<Point2D> getMinorPoints() {
        return minorPoints;
    }

    public double getRatio() {
        return ratio;
    }
}
