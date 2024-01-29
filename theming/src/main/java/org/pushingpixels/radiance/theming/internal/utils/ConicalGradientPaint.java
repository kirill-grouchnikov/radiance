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
package org.pushingpixels.radiance.theming.internal.utils;

/**
 * A paint class that creates conical gradients around a given center point
 * It could be used in the same way as LinearGradientPaint and RadialGradientPaint
 * and follows the same syntax.
 * You could use floats from 0.0 to 1.0 for the fractions which is standard but it's
 * also possible to use angles from 0.0 to 360 degrees which is most of the times
 * much easier to handle.
 * Gradients always start at the top with a clockwise direction and you could
 * rotate the gradient around the center by given offset.
 * The offset could also be defined from -0.5 to +0.5 or -180 to +180 degrees.
 * If you would like to use degrees instead of values from 0 to 1 you have to use
 * the full constructor and set the USE_DEGREES variable to true.
 *
 * Contributed under the BSD license by Gerrit Grunwald. Original code from
 * https://www.jug-muenster.de/java2d-conical-gradient-paint-674/
 *
 * @author hansolo
 */
public final class ConicalGradientPaint implements java.awt.Paint
{
    private final java.awt.geom.Point2D CENTER;
    private final double[] FRACTION_ANGLES;
    private final double[] RED_STEP_LOOKUP;
    private final double[] GREEN_STEP_LOOKUP;
    private final double[] BLUE_STEP_LOOKUP;
    private final double[] ALPHA_STEP_LOOKUP;
    private final java.awt.Color[] COLORS;
    private static final float INT_TO_FLOAT_CONST = 1f / 255f;

    public ConicalGradientPaint(final java.awt.geom.Point2D CENTER, final float[] GIVEN_FRACTIONS, final java.awt.Color[] GIVEN_COLORS) throws IllegalArgumentException
    {
        this(false, CENTER, 0.0f, GIVEN_FRACTIONS, GIVEN_COLORS);
    }

    public ConicalGradientPaint(final boolean USE_DEGREES, final java.awt.geom.Point2D CENTER, final float GIVEN_OFFSET, final float[] GIVEN_FRACTIONS, final java.awt.Color[] GIVEN_COLORS) throws IllegalArgumentException
    {
        // Check that fractions and colors are of the same size
        if (GIVEN_FRACTIONS.length != GIVEN_COLORS.length)
        {
            throw new IllegalArgumentException("Fractions and colors must be equal in size");
        }

        final java.util.ArrayList<Float> FRACTION_LIST = new java.util.ArrayList<Float>(GIVEN_FRACTIONS.length);
        final float OFFSET;
        if (USE_DEGREES)
        {
            final double DEG_FRACTION = 1f / 360f;
            if (Double.compare((GIVEN_OFFSET * DEG_FRACTION), -0.5) == 0)
            {
                // This is needed because of problems in the creation of the Raster
                // with a angle offset of exactly -0.5
                OFFSET = -0.499f;
            }
            else if (Double.compare((GIVEN_OFFSET * DEG_FRACTION), 0.5) == 0)
            {
                // This is needed because of problems in the creation of the Raster
                // with a angle offset of exactly +0.5
                OFFSET = 0.499f;
            }
            else
            {
                OFFSET = (float) (GIVEN_OFFSET * DEG_FRACTION);
            }
            for (float fraction : GIVEN_FRACTIONS)
            {
                FRACTION_LIST.add((float) (fraction * DEG_FRACTION));
            }
        }
        else
        {
            if (GIVEN_OFFSET == -0.5)
            {
                // This is needed because of problems in the creation of the Raster
                // with a angle offset of exactly -0.5
                OFFSET = -0.49999f;
            }
            else if (GIVEN_OFFSET == 0.5)
            {
                // This is needed because of problems in the creation of the Raster
                // with a angle offset of exactly +0.5
                OFFSET = 0.499999f;
            }
            else
            {
                OFFSET = GIVEN_OFFSET;
            }
            for (float fraction : GIVEN_FRACTIONS)
            {
                FRACTION_LIST.add(fraction);
            }
        }

        // Check for valid offset
        if (OFFSET > 0.5f || OFFSET < -0.5f)
        {
            throw new IllegalArgumentException("Offset has to be in the range of -0.5 to 0.5");
        }

        // Adjust fractions and colors array in the case where startvalue != 0.0f and/or endvalue != 1.0f
        final java.util.List<java.awt.Color> COLOR_LIST = new java.util.ArrayList<java.awt.Color>(GIVEN_COLORS.length);
        COLOR_LIST.addAll(java.util.Arrays.asList(GIVEN_COLORS));

        // Assure that fractions start with 0.0f
        if (FRACTION_LIST.get(0) != 0.0f)
        {
            FRACTION_LIST.add(0, 0.0f);
            final java.awt.Color TMP_COLOR = COLOR_LIST.get(0);
            COLOR_LIST.add(0, TMP_COLOR);
        }

        // Assure that fractions end with 1.0f
        if (FRACTION_LIST.get(FRACTION_LIST.size() - 1) != 1.0f)
        {
            FRACTION_LIST.add(1.0f);
            COLOR_LIST.add(GIVEN_COLORS[0]);
        }

        // Recalculate the fractions and colors with the given offset
        final java.util.Map<Float, java.awt.Color> FRACTION_COLORS = recalculate(FRACTION_LIST, COLOR_LIST, OFFSET);

        // Clear the original FRACTION_LIST and COLOR_LIST
        FRACTION_LIST.clear();
        COLOR_LIST.clear();

        // Sort the hashmap by fraction and add the values to the FRACION_LIST and COLOR_LIST
        final java.util.SortedSet<Float> SORTED_FRACTIONS= new java.util.TreeSet<Float>(FRACTION_COLORS.keySet());
        final java.util.Iterator<Float> ITERATOR = SORTED_FRACTIONS.iterator();
        while (ITERATOR.hasNext())
        {
            final float CURRENT_FRACTION = ITERATOR.next();
            FRACTION_LIST.add(CURRENT_FRACTION);
            COLOR_LIST.add(FRACTION_COLORS.get(CURRENT_FRACTION));            
        }

        // Set the values
        this.CENTER = CENTER;
        COLORS = COLOR_LIST.toArray(new java.awt.Color[]{});

        // Prepare lookup table for the angles of each fraction
        final int MAX_FRACTIONS = FRACTION_LIST.size();
        this.FRACTION_ANGLES = new double[MAX_FRACTIONS];
        for (int i = 0 ; i < MAX_FRACTIONS ; i++)
        {
            FRACTION_ANGLES[i] = FRACTION_LIST.get(i) * 360;
        }

        // Prepare lookup tables for the color stepsize of each color
        RED_STEP_LOOKUP = new double[COLORS.length];
        GREEN_STEP_LOOKUP = new double[COLORS.length];
        BLUE_STEP_LOOKUP = new double[COLORS.length];
        ALPHA_STEP_LOOKUP = new double[COLORS.length];

        for (int i = 0 ; i < (COLORS.length - 1) ; i++)
        {
            RED_STEP_LOOKUP[i] = ((COLORS[i + 1].getRed() - COLORS[i].getRed()) * INT_TO_FLOAT_CONST) / (FRACTION_ANGLES[i + 1] - FRACTION_ANGLES[i]);
            GREEN_STEP_LOOKUP[i] = ((COLORS[i + 1].getGreen() - COLORS[i].getGreen()) * INT_TO_FLOAT_CONST) / (FRACTION_ANGLES[i + 1] - FRACTION_ANGLES[i]);
            BLUE_STEP_LOOKUP[i] = ((COLORS[i + 1].getBlue() - COLORS[i].getBlue()) * INT_TO_FLOAT_CONST) / (FRACTION_ANGLES[i + 1] - FRACTION_ANGLES[i]);
            ALPHA_STEP_LOOKUP[i] = ((COLORS[i + 1].getAlpha() - COLORS[i].getAlpha()) * INT_TO_FLOAT_CONST) / (FRACTION_ANGLES[i + 1] - FRACTION_ANGLES[i]);
        }
    }

    /**
     * Recalculates the fractions in the FRACTION_LIST and their associated colors in the COLOR_LIST with a given OFFSET.
     * Because the conical gradients always starts with 0 at the top and clockwise direction
     * you could rotate the defined conical gradient from -180 to 180 degrees which equals values from -0.5 to +0.5
     * @param FRACTION_LIST
     * @param COLOR_LIST
     * @param OFFSET
     * @return
     */
    private java.util.HashMap<Float, java.awt.Color> recalculate(final java.util.List<Float> FRACTION_LIST, final java.util.List<java.awt.Color> COLOR_LIST, final float OFFSET)
    {
        // Recalculate the fractions and colors with the given offset
        final int MAX_FRACTIONS = FRACTION_LIST.size();
        final java.util.HashMap<Float, java.awt.Color> FRACTION_COLORS = new java.util.HashMap<Float, java.awt.Color>(MAX_FRACTIONS);
        for (int i = 0 ; i < MAX_FRACTIONS ; i++)
        {
            // Add offset to fraction
            final float TMP_FRACTION = FRACTION_LIST.get(i) + OFFSET;

            // Color related to current fraction
            final java.awt.Color TMP_COLOR = COLOR_LIST.get(i);

            // Check each fraction for limits (0...1)
            if (TMP_FRACTION <= 0)
            {
                FRACTION_COLORS.put(1.0f + TMP_FRACTION + 0.0001f, TMP_COLOR);

                final float NEXT_FRACTION;
                final java.awt.Color NEXT_COLOR;
                if (i < MAX_FRACTIONS - 1)
                {
                    NEXT_FRACTION = FRACTION_LIST.get(i + 1) + OFFSET;
                    NEXT_COLOR = COLOR_LIST.get(i + 1);
                }
                else
                {
                    NEXT_FRACTION = 1 - FRACTION_LIST.get(0) + OFFSET;
                    NEXT_COLOR = COLOR_LIST.get(0);
                }
                if (NEXT_FRACTION > 0)
                {
                    final java.awt.Color NEW_FRACTION_COLOR = getColorFromFraction(TMP_COLOR, NEXT_COLOR, (int) ((NEXT_FRACTION - TMP_FRACTION) * 10000), (int) ((-TMP_FRACTION) * 10000));
                    FRACTION_COLORS.put(0.0f, NEW_FRACTION_COLOR);
                    FRACTION_COLORS.put(1.0f, NEW_FRACTION_COLOR);
                }
            }
            else if(TMP_FRACTION >= 1)
            {
                FRACTION_COLORS.put(TMP_FRACTION - 1.0f - 0.0001f, TMP_COLOR);

                final float PREVIOUS_FRACTION;
                final java.awt.Color PREVIOUS_COLOR;
                if (i > 0)
                {
                    PREVIOUS_FRACTION = FRACTION_LIST.get(i - 1) + OFFSET;
                    PREVIOUS_COLOR = COLOR_LIST.get(i - 1);
                }
                else
                {
                    PREVIOUS_FRACTION = FRACTION_LIST.get(MAX_FRACTIONS - 1) + OFFSET;
                    PREVIOUS_COLOR = COLOR_LIST.get(MAX_FRACTIONS - 1);
                }
                if (PREVIOUS_FRACTION < 1)
                {
                    final java.awt.Color NEW_FRACTION_COLOR = getColorFromFraction(TMP_COLOR, PREVIOUS_COLOR, (int) ((TMP_FRACTION - PREVIOUS_FRACTION) * 10000), (int) (TMP_FRACTION - 1.0f) * 10000);
                    FRACTION_COLORS.put(1.0f, NEW_FRACTION_COLOR);
                    FRACTION_COLORS.put(0.0f, NEW_FRACTION_COLOR);
                }                
            }
            else
            {
                FRACTION_COLORS.put(TMP_FRACTION, TMP_COLOR);                
            }
        }

        // Clear the original FRACTION_LIST and COLOR_LIST
        FRACTION_LIST.clear();
        COLOR_LIST.clear();

        return FRACTION_COLORS;
    }

    /**
     * With the START_COLOR at the beginning and the DESTINATION_COLOR at the end of the given RANGE the method will calculate
     * and return the color that equals the given VALUE.
     * e.g. a START_COLOR of BLACK (R:0, G:0, B:0, A:255) and a DESTINATION_COLOR of WHITE(R:255, G:255, B:255, A:255)
     * with a given RANGE of 100 and a given VALUE of 50 will return the color that is exactly in the middle of the
     * gradient between black and white which is gray(R:128, G:128, B:128, A:255)
     * So this method is really useful to calculate colors in gradients between two given colors.
     * @param START_COLOR
     * @param DESTINATION_COLOR
     * @param RANGE
     * @param VALUE
     * @return
     */
    public java.awt.Color getColorFromFraction(final java.awt.Color START_COLOR, final java.awt.Color DESTINATION_COLOR, final int RANGE, final int VALUE)
    {
        final float SOURCE_RED = START_COLOR.getRed() * INT_TO_FLOAT_CONST;
        final float SOURCE_GREEN = START_COLOR.getGreen() * INT_TO_FLOAT_CONST;
        final float SOURCE_BLUE = START_COLOR.getBlue() * INT_TO_FLOAT_CONST;
        final float SOURCE_ALPHA = START_COLOR.getAlpha() * INT_TO_FLOAT_CONST;

        final float DESTINATION_RED = DESTINATION_COLOR.getRed() * INT_TO_FLOAT_CONST;
        final float DESTINATION_GREEN = DESTINATION_COLOR.getGreen() * INT_TO_FLOAT_CONST;
        final float DESTINATION_BLUE = DESTINATION_COLOR.getBlue() * INT_TO_FLOAT_CONST;
        final float DESTINATION_ALPHA = DESTINATION_COLOR.getAlpha() * INT_TO_FLOAT_CONST;

        final float RED_DELTA = DESTINATION_RED - SOURCE_RED;
        final float GREEN_DELTA = DESTINATION_GREEN - SOURCE_GREEN;
        final float BLUE_DELTA = DESTINATION_BLUE - SOURCE_BLUE;
        final float ALPHA_DELTA = DESTINATION_ALPHA - SOURCE_ALPHA;

        final float RED_FRACTION = RED_DELTA / RANGE;
        final float GREEN_FRACTION = GREEN_DELTA / RANGE;
        final float BLUE_FRACTION = BLUE_DELTA / RANGE;
        final float ALPHA_FRACTION = ALPHA_DELTA / RANGE;
        //System.out.println(DISTANCE + "     " + CURRENT_FRACTION);

        return new java.awt.Color(SOURCE_RED + RED_FRACTION * VALUE, SOURCE_GREEN + GREEN_FRACTION * VALUE, SOURCE_BLUE + BLUE_FRACTION * VALUE, SOURCE_ALPHA + ALPHA_FRACTION * VALUE);
    }

    @Override
    public java.awt.PaintContext createContext(final java.awt.image.ColorModel COLOR_MODEL, final java.awt.Rectangle DEVICE_BOUNDS, final java.awt.geom.Rectangle2D USER_BOUNDS, final java.awt.geom.AffineTransform TRANSFORM, final java.awt.RenderingHints HINTS)
    {
        final java.awt.geom.Point2D TRANSFORMED_CENTER = TRANSFORM.transform(CENTER, null);
        return new ConicalGradientPaintContext(TRANSFORMED_CENTER);
    }

    @Override
    public int getTransparency()
    {
        return java.awt.Transparency.TRANSLUCENT;
    }

    private final class ConicalGradientPaintContext implements java.awt.PaintContext
    {
        final private java.awt.geom.Point2D CENTER;

        public ConicalGradientPaintContext(final java.awt.geom.Point2D CENTER)
        {
            this.CENTER = new java.awt.geom.Point2D.Double(CENTER.getX(), CENTER.getY());
        }

        @Override
        public void dispose()
        {
        }

        @Override
        public java.awt.image.ColorModel getColorModel()
        {
            return java.awt.image.ColorModel.getRGBdefault();
        }

        @Override
        public java.awt.image.Raster getRaster(final int X, final int Y, final int TILE_WIDTH, final int TILE_HEIGHT)
        {
            final double ROTATION_CENTER_X = -X + CENTER.getX();
            final double ROTATION_CENTER_Y = -Y + CENTER.getY();

            final int MAX = FRACTION_ANGLES.length;

            // Create raster for given colormodel
            final java.awt.image.WritableRaster RASTER = getColorModel().createCompatibleWritableRaster(TILE_WIDTH, TILE_HEIGHT);

            // Create data array with place for red, green, blue and alpha values
            int[] data = new int[(TILE_WIDTH * TILE_HEIGHT * 4)];

            double dx;
            double dy;
            double distance;
            double angle;
            double currentRed = 0;
            double currentGreen = 0;
            double currentBlue = 0 ;
            double currentAlpha = 0;

            for (int py = 0; py < TILE_HEIGHT; py++)
            {
                for (int px = 0; px < TILE_WIDTH; px++)
                {

                    // Calculate the distance between the current position and the rotation angle
                    dx = px - ROTATION_CENTER_X;
                    dy = py - ROTATION_CENTER_Y;
                    distance = Math.sqrt(dx * dx + dy * dy);

                    // Avoid division by zero
                    if (distance == 0)
                    {
                        distance = 1;
                    }

                    // 0 degree on top
                    angle = Math.abs(Math.toDegrees(Math.acos(dx / distance)));

                    if (dx >= 0 && dy <= 0)
                    {
                        angle = 90.0 - angle;
                    }
                    else if (dx >= 0 && dy >= 0)
                    {
                        angle += 90.0;
                    }
                    else if (dx <= 0 && dy >= 0)
                    {
                        angle += 90.0;
                    }
                    else if (dx <= 0 && dy <= 0)
                    {
                        angle = 450.0 - angle;
                    }

                    // Check for each angle in fractionAngles array
                    for (int i = 0 ; i < (MAX - 1) ; i++)
                    {
                        if ((angle >= FRACTION_ANGLES[i]) )
                        {
                            currentRed = COLORS[i].getRed() * INT_TO_FLOAT_CONST + (angle - FRACTION_ANGLES[i]) * RED_STEP_LOOKUP[i];
                            currentGreen = COLORS[i].getGreen() * INT_TO_FLOAT_CONST + (angle - FRACTION_ANGLES[i]) * GREEN_STEP_LOOKUP[i];
                            currentBlue = COLORS[i].getBlue() * INT_TO_FLOAT_CONST + (angle - FRACTION_ANGLES[i]) * BLUE_STEP_LOOKUP[i];
                            currentAlpha = COLORS[i].getAlpha() * INT_TO_FLOAT_CONST + (angle - FRACTION_ANGLES[i]) * ALPHA_STEP_LOOKUP[i];
                            continue;
                        }
                    }

                    // Fill data array with calculated color values
                    final int BASE = (py * TILE_WIDTH + px) * 4;
                    data[BASE + 0] = (int) (currentRed * 255);
                    data[BASE + 1] = (int) (currentGreen * 255);
                    data[BASE + 2] = (int) (currentBlue * 255);
                    data[BASE + 3] = (int) (currentAlpha * 255);
                }
            }

            // Fill the raster with the data
            RASTER.setPixels(0, 0, TILE_WIDTH, TILE_HEIGHT, data);

            return RASTER;
        }
    }
}