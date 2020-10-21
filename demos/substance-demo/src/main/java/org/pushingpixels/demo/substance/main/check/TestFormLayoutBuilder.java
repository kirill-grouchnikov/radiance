/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.substance.main.check;

import com.jgoodies.forms.builder.FormBuilder;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TestFormLayoutBuilder {
    private FormBuilder formLayoutBuilder;
    private int columnCount;
    private int currRow = 0;
    private int currColumn = 0;

    public TestFormLayoutBuilder(String columns, int columnCount, int rowCount) {
        this.columnCount = columnCount;
        this.formLayoutBuilder = FormBuilder.create().columns(columns);
        String rows = "p";
        for (int i = 1; i < rowCount; i++) {
            rows += ", $lg, p";
        }
        this.formLayoutBuilder.rows(rows);
    }

    public TestFormLayoutBuilder padding(EmptyBorder border) {
        this.formLayoutBuilder.padding(border);
        return this;
    }

    public TestFormLayoutBuilder columnGroups(int[]... multipleColumnGroups) {
        this.formLayoutBuilder.columnGroups(multipleColumnGroups);
        return this;
    }

    public TestFormLayoutBuilder appendSeparator(String title) {
        this.formLayoutBuilder.addSeparator(title).xyw(1, 2 * currRow + 1,
                2 * columnCount - 1);
        currRow++;
        currColumn = 0;
        return this;
    }

    public TestFormLayoutBuilder append(Component... components) {
        for (Component component : components) {
            this.append(component);
        }
        return this;
    }

    public TestFormLayoutBuilder append(String string) {
        return this.append(new JLabel(string));
    }

    public TestFormLayoutBuilder append(String string, Component component) {
        return this.append(new JLabel(string), component);
    }

    public TestFormLayoutBuilder append(Component component) {
        this.formLayoutBuilder.add(component).xy(2 * currColumn + 1, 2 * currRow + 1);
        currColumn++;

        if (currColumn == this.columnCount) {
            currColumn = 0;
            currRow++;
        }

        return this;
    }

    public TestFormLayoutBuilder nextLine() {
        currRow++;
        currColumn = 0;

        return this;
    }

    public JPanel build() {
        return this.formLayoutBuilder.build();
    }
}
