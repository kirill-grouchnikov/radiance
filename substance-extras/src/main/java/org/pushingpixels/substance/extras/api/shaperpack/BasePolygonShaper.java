/*
 * Copyright (c) 2005-2019 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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
package org.pushingpixels.substance.extras.api.shaperpack;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Shape;
import java.io.InputStream;

import javax.swing.AbstractButton;
import javax.swing.border.Border;

import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.internal.ui.SubstanceButtonUI;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceOutlineUtilities;
import org.pushingpixels.substance.internal.utils.border.SubstanceButtonBorder;

public abstract class BasePolygonShaper implements SubstanceButtonShaper {
    private CanonicalPath canonicalPath;

    private double topCoef;

    private double leftCoef;

    private double bottomCoef;

    private double rightCoef;

    public BasePolygonShaper(String resourceName, double topCoef, double leftCoef,
            double bottomCoef, double rightCoef) {
        this.topCoef = topCoef;
        this.leftCoef = leftCoef;
        this.bottomCoef = bottomCoef;
        this.rightCoef = rightCoef;

        ClassLoader cl = BasePolygonShaper.class.getClassLoader();
        InputStream is = cl.getResourceAsStream(resourceName);
        if (is == null) {
            throw new IllegalArgumentException("Resource '" + resourceName + "' not found");
        }
        this.canonicalPath = ShaperRepository.read(is);
    }

    public Dimension getPreferredSize(AbstractButton button, Dimension uiPreferredSize) {
        if (button.getClientProperty(SubstanceButtonUI.BORDER_COMPUTED) == null) {
            boolean isBorderComputing = (button
                    .getClientProperty(SubstanceButtonUI.BORDER_COMPUTING) != null);
            Border border = button.getBorder();
            int uiw = uiPreferredSize.width;
            int uih = uiPreferredSize.height;
            if (border instanceof SubstanceButtonBorder) {
                // SubstanceButtonBorder sborder = (SubstanceButtonBorder)
                // button
                // .getBorder();
                // if (sborder.getButtonShaperClass() != this.getClass()) {
                Insets bi = border.getBorderInsets(button);
                if (!isBorderComputing) {
                    button.setBorder(null);
                }
                uiPreferredSize.setSize(uiw - bi.left - bi.right, uih - bi.top - bi.bottom);
                // }
            } else {
                Insets bi = border.getBorderInsets(button);
                if (!isBorderComputing) {
                    button.setBorder(null);
                }
                uiPreferredSize.setSize(uiw - bi.left - bi.right, uih - bi.top - bi.bottom);
            }
            if (!isBorderComputing) {
                button.setBorder(this.getButtonBorder(uiPreferredSize));
                button.putClientProperty(SubstanceButtonUI.BORDER_COMPUTED, new String());
            }
        }
        return uiPreferredSize;
    }

    public Border getButtonBorder(AbstractButton button) {
        return new SubstanceButtonBorder(this.getClass()) {
            public Insets getBorderInsets(Component c) {
                if (c instanceof AbstractButton) {
                    AbstractButton button = (AbstractButton) c;
                    if (SubstanceCoreUtilities.hasText(button)) {
                        if (button.getClientProperty(SubstanceButtonUI.BORDER_COMPUTING) != null) {
                            return new Insets(0, 0, 0, 0);
                        }
                        button.putClientProperty(SubstanceButtonUI.BORDER_COMPUTING, new String());
                        int width = button.getPreferredSize().width;
                        int height = button.getPreferredSize().height;
                        button.putClientProperty(SubstanceButtonUI.BORDER_COMPUTING, null);
                        double finalWidth = width * (1.0 + leftCoef + rightCoef);
                        double finalHeight = height * (1.0 + topCoef + bottomCoef);
                        double finalRatio = finalWidth / finalHeight;
                        int dx = 0;
                        int dy = 0;
                        if (finalRatio > canonicalPath.getRatio()) {
                            // need dy
                            dy = (int) (finalWidth / canonicalPath.getRatio() - finalHeight);
                        } else {
                            // need dx
                            dx = (int) (canonicalPath.getRatio() * finalHeight - finalWidth);
                        }
                        return new Insets((int) (topCoef * height) + dy / 2,
                                (int) (leftCoef * width) + dx / 2,
                                (int) (bottomCoef * height) + dy / 2,
                                (int) (rightCoef * width) + dx / 2);
                    }
                }
                return new Insets(0, 0, 0, 0);
            }
        };
    }

    public Border getButtonBorder(final Dimension preferredSize) {
        return new SubstanceButtonBorder(this.getClass()) {
            public Insets getBorderInsets(Component c) {
                if (c instanceof AbstractButton) {
                    AbstractButton button = (AbstractButton) c;
                    if (SubstanceCoreUtilities.hasText(button)) {
                        int width = preferredSize.width;
                        int height = preferredSize.height;
                        double finalWidth = width * (1.0 + leftCoef + rightCoef);
                        double finalHeight = height * (1.0 + topCoef + bottomCoef);
                        double finalRatio = finalWidth / finalHeight;
                        int dx = 0;
                        int dy = 0;
                        if (finalRatio > canonicalPath.getRatio()) {
                            // need dy
                            dy = (int) (finalWidth / canonicalPath.getRatio() - finalHeight);
                        } else {
                            // need dx
                            dx = (int) (canonicalPath.getRatio() * finalHeight - finalWidth);
                        }
                        return new Insets((int) (topCoef * height) + dy / 2,
                                (int) (leftCoef * width) + dx / 2,
                                (int) (bottomCoef * height) + dy / 2,
                                (int) (rightCoef * width) + dx / 2);
                    }
                }
                return new Insets(0, 0, 0, 0);
            }
        };
    }


    @Override
    public Shape getButtonOutline(AbstractButton button, float extraInsets, float width,
            float height, boolean isInner) {
        if (SubstanceCoreUtilities.hasText(button)) {
            return this.canonicalPath.getPath(width, height, extraInsets);
        }

        return SubstanceOutlineUtilities.getBaseOutline(width, height, 2, null, extraInsets);
    }

    @Override
    public boolean isProportionate() {
        return false;
    }
}
