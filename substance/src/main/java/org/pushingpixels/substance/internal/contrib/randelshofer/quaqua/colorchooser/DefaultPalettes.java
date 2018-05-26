/*
 * @(#)ColorPalettes.java  1.0  September 18, 2005
 *
 * Copyright (c) 2005 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Werner Randelshofer. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Werner Randelshofer.
 */

package org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser;

import java.awt.*;
/**
 * This class provides some well known color palettes as array constants.
 *
 * @author  Werner Randelshofer
 * @version 1.0 September 18, 2005 Created.
 */
public class DefaultPalettes {
    /**
     * Apple Crayon Colors.
     * Copyright Apple Computer Inc., All rights reserved.
     *
     * The colors are listed here in a logical sequence.
     * Do not change this sequence! Other classes depend on it.
     */
    public final static Color[] CRAYONS = {
        new Color(0x800000), //Cayenne
        new Color(0x808000), //Asparagus
        new Color(0x008000), //Clover
        new Color(0x008080), //Teal
        new Color(0x000080), //Midnight
        new Color(0x800080), //Plum
        new Color(0x7f7f7f), //Tin
        new Color(0x808080), //Nickel
        
        new Color(0x804000), //Mocha
        new Color(0x408000), //Fern
        new Color(0x008040), //Moss
        new Color(0x004080), //Ocean
        new Color(0x400080), //Eggplant
        new Color(0x800040), //Maroon
        new Color(0x666666), //Steel
        new Color(0x999999), //Aluminium
        
        new Color(0xff0000), //Maraschino
        new Color(0xffff00), //Lemon
        new Color(0x00ff00), //Spring
        new Color(0x00ffff), //Turquoise
        new Color(0x0000ff), //Blueberry
        new Color(0xff00ff), //Magenta
        new Color(0x4c4c4c), //Iron
        new Color(0xb3b3b3), //Magnesium
        
        new Color(0xff8000), //Tangerine
        new Color(0x80ff00), //Lime
        new Color(0x00ff80), //Sea Foam
        new Color(0x0080ff), //Aqua
        new Color(0x8000ff), //Grape
        new Color(0xff0080), //Strawberry
        new Color(0x333333), //Tungsten
        new Color(0xcccccc), //Silver
        
        new Color(0xff6666), //Salmon
        new Color(0xffff66), //Banana
        new Color(0x66ff66), //Flora
        new Color(0x66ffff), //Ice
        new Color(0x6666ff), //Orchid
        new Color(0xff66ff), //Bubblegum
        new Color(0x191919), //Lead
        new Color(0xe6e6e6), //Mercury
        
        new Color(0xffcc66), //Cantaloupe
        new Color(0xccff66), //Honeydew
        new Color(0x66ffcc), //Spindrift
        new Color(0x66ccff), //Sky
        new Color(0xcc66ff), //Lavender
        new Color(0xff6fcf), //Carnation
        new Color(0x000000), //Licorice
        new Color(0xffffff), //Snow
    };
    
    /**
     * Apple Colors.
     * Copyright Apple Computer Inc., All rights reserved.
     *
     * The colors are listed here in a logical sequence.
     * Do not change this sequence! Other classes depend on it.
     */
    public final static Color[] APPLE_COLORS = {
        new Color(0x000000), //Black
        new Color(0x0000ff), //Blue
        new Color(0x996633), //Brown
        new Color(0x00ffff), //Cyan
        new Color(0x00ff00), //Green
        new Color(0xff00ff), //Magenta
        new Color(0xff8000), //Orange
        new Color(0x800080), //Purple
        new Color(0xff0000), //Red
        new Color(0xffff00), //Yellow
        new Color(0xffffff), //White
};
        
    /**
     * Windows Basic Colors.
     * Copyright Microsoft Inc., All rights reserved.
     *
     * The colors are listed here in a logical sequence.
     * (This is the sequence used by native the Microsoft Windows color dialog.)
     * Do not alter this sequence! Other classes depend on it.
     */
    public final static Color[] WINDOWS_BASIC_COLORS = {
        new Color(0xff8080), //salmon
        new Color(0xffff80), //pale yellow
        new Color(0x80ff80), //pale green
        new Color(0x00ff80), //spring green
        new Color(0x80ffff), //pale turquoise
        new Color(0x0080ff), //deep sky blue
        new Color(0xff80c0), //pale rose
        new Color(0xff80ff), //pink

        new Color(0xff0000), //red
        new Color(0xffff00), //yellow
        new Color(0x80ff00), //apple green
        new Color(0x00ff40), //light green
        new Color(0x00ffff), //aqua
        new Color(0x0080c0), //turquoise
        new Color(0x8080c0), //pale slate blue
        new Color(0xff00ff), //magenta

        new Color(0x804040), //chocolate
        new Color(0xff8040), //pumpkin
        new Color(0x00ff00), //lime
        new Color(0x008080), //teal
        new Color(0x004080), //dark turquoise
        new Color(0x8080ff), //medium slate blue
        new Color(0x800040), //maroon
        new Color(0xff0080), //rose

        new Color(0x800000), //dark red
        new Color(0xff8000), //dark orange
        new Color(0x008000), //green
        new Color(0x008040), //sea green
        new Color(0x0000ff), //blue
        new Color(0x0000a0), //medium blue
        new Color(0x800080), //purple
        new Color(0x8000ff), //blueviolet

        new Color(0x400000), //dark brown
        new Color(0x804000), //saddle brown
        new Color(0x004000), //dark forest green
        new Color(0x004040), //dark teal
        new Color(0x000080), //navy
        new Color(0x000040), //midnight blue
        new Color(0x400040), //dark purple
        new Color(0x400080), //dark blueviolet

        new Color(0x000000), //black
        new Color(0x808000), //olive
        new Color(0x808040), //dark olive
        new Color(0x808080), //grey
        new Color(0x408080), //light teal
        new Color(0xc0c0c0), //light grey
        new Color(0x400040), //dark purple
        new Color(0xffffff), //white
    };
    
    /**
     * Web safe colors.
     * Copyright Apple Computer Inc., All rights reserved.
     *
     * The colors are listed here in a logical sequence.
     * (This is the sequence used by native NSColorPicker color dialog.)
     * Do not alter this sequence! Other classes depend on it.
     */
    public final static Color[] WEB_SAFE_COLORS = {
        new Color(0xffffff),
        new Color(0xcccccc),
        new Color(0x999999),
        new Color(0x666666),
        new Color(0x333333),
        new Color(0x000000),

        new Color(0xffcccc),
        new Color(0xcc9999),
        new Color(0x996666),
        new Color(0x663333),
        new Color(0x330000),

        new Color(0xff9999),
        new Color(0xcc6666),
        new Color(0xcc3333),
        new Color(0x993333),
        new Color(0x660000),

        new Color(0xff6666),
        new Color(0xff3333),
        new Color(0xff0000),
        new Color(0xcc0000),
        new Color(0x990000),

        new Color(0xff9966),
        new Color(0xff6633),
        new Color(0xff3300),
        new Color(0xcc3300),
        new Color(0x993300),

        new Color(0xffcc99),
        new Color(0xcc9966),
        new Color(0xcc6633),
        new Color(0x996633),
        new Color(0x663300),

        new Color(0xff9933),
        new Color(0xff6600),
        new Color(0xff9900),
        new Color(0xcc6600),
        new Color(0xcc9933),

        new Color(0xffcc66),
        new Color(0xffcc33),
        new Color(0xffcc00),
        new Color(0xcc9900),
        new Color(0x996600),

        new Color(0xffffcc),
        new Color(0xcccc99),
        new Color(0x999966),
        new Color(0x666633),
        new Color(0x333300),

        new Color(0xffff99),
        new Color(0xcccc66),
        new Color(0xcccc33),
        new Color(0x999933),
        new Color(0x666600),

        new Color(0xffff66),
        new Color(0xffff33),
        new Color(0xffff00),
        new Color(0xcccc00),
        new Color(0x999900),

        new Color(0xccff66),
        new Color(0xccff33),
        new Color(0xccff00),
        new Color(0x99cc00),
        new Color(0x669900),

        new Color(0xccff99),
        new Color(0x99cc66),
        new Color(0x99cc33),
        new Color(0x669933),
        new Color(0x336600),

        new Color(0x99ff33),
        new Color(0x99ff00),
        new Color(0x66ff00),
        new Color(0x66cc00),
        new Color(0x66cc33),

        new Color(0x99ff66),
        new Color(0x66ff33),
        new Color(0x33ff00),
        new Color(0x33cc00),
        new Color(0x339900),

        new Color(0xccffcc),
        new Color(0x99cc99),
        new Color(0x669966),
        new Color(0x336633),
        new Color(0x003300),

        new Color(0x99ff99),
        new Color(0x66cc66),
        new Color(0x33cc33),
        new Color(0x339933),
        new Color(0x006600),

        new Color(0x66ff66),
        new Color(0x33ff33),
        new Color(0x00ff00),
        new Color(0x00cc00),
        new Color(0x009900),

        new Color(0x66ff99),
        new Color(0x33ff66),
        new Color(0x00ff33),
        new Color(0x00cc33),
        new Color(0x009933),

        new Color(0x99ffcc),
        new Color(0x66cc99),
        new Color(0x33cc66),
        new Color(0x339966),
        new Color(0x006633),

        new Color(0x33ff99),
        new Color(0x00ff66),
        new Color(0x00ff99),
        new Color(0x00cc66),
        new Color(0x33cc99),

        new Color(0x66ffcc),
        new Color(0x33ffcc),
        new Color(0x00ffcc),
        new Color(0x00cc99),
        new Color(0x009966),

        new Color(0xccffff),
        new Color(0x99cccc),
        new Color(0x669999),
        new Color(0x336666),
        new Color(0x003333),

        new Color(0x99ffff),
        new Color(0x66cccc),
        new Color(0x33cccc),
        new Color(0x339999),
        new Color(0x006666),

        new Color(0x66ffff),
        new Color(0x33ffff),
        new Color(0x00ffff),
        new Color(0x00cccc),
        new Color(0x009999),

        new Color(0x66ccff),
        new Color(0x33ccff),
        new Color(0x00ccff),
        new Color(0x0099cc),
        new Color(0x006699),

        new Color(0x99ccff),
        new Color(0x6699cc),
        new Color(0x3399cc),
        new Color(0x336699),
        new Color(0x003366),

        new Color(0x3399ff),
        new Color(0x0099ff),
        new Color(0x0066ff),
        new Color(0x0066cc),
        new Color(0x3366cc),

        new Color(0x6699ff),
        new Color(0x3366ff),
        new Color(0x0033ff),
        new Color(0x0033cc),
        new Color(0x003399),

        new Color(0xccccff),
        new Color(0x9999cc),
        new Color(0x666699),
        new Color(0x333366),
        new Color(0x003333),

        new Color(0x9999ff),
        new Color(0x6666cc),
        new Color(0x3333cc),
        new Color(0x333399),
        new Color(0x000066),

        new Color(0x6666ff),
        new Color(0x3333ff),
        new Color(0x0000ff),
        new Color(0x0000cc),
        new Color(0x000099),

        new Color(0x9966ff),
        new Color(0x6633ff),
        new Color(0x3300ff),
        new Color(0x3300cc),
        new Color(0x330099),

        new Color(0xcc99ff),
        new Color(0x9966cc),
        new Color(0x6633cc),
        new Color(0x663399),
        new Color(0x330066),

        new Color(0x9933ff),
        new Color(0x6600ff),
        new Color(0x9900ff),
        new Color(0x6600cc),
        new Color(0x9933cc),

        new Color(0xcc66ff),
        new Color(0xcc33ff),
        new Color(0xcc00ff),
        new Color(0x9900cc),
        new Color(0x660099),

        new Color(0xffccff),
        new Color(0xcc99cc),
        new Color(0x996699),
        new Color(0x663366),
        new Color(0x330033),

        new Color(0xff99ff),
        new Color(0xcc66cc),
        new Color(0xcc33cc),
        new Color(0x993399),
        new Color(0x660066),

        new Color(0xff66ff),
        new Color(0xff33ff),
        new Color(0xff00ff),
        new Color(0xcc00cc),
        new Color(0x990099),

        new Color(0xff66cc),
        new Color(0xff33cc),
        new Color(0xff00cc),
        new Color(0xcc0099),
        new Color(0x990066),

        new Color(0xff99cc),
        new Color(0xcc6699),
        new Color(0xcc3399),
        new Color(0x993366),
        new Color(0x660033),

        new Color(0xff3399),
        new Color(0xff0099),
        new Color(0xff0066),
        new Color(0xcc0066),
        new Color(0xcc3366),

        new Color(0xff6699),
        new Color(0xff3366),
        new Color(0xff0033),
        new Color(0xcc0033),
        new Color(0x990033),
    };
    
    
    /**
     * Microsoft Office Colors.
     * Copyright Microsoft Inc., All rights reserved.
     *
     * The colors are listed here in a logical sequence.
     * (This is the sequence used by native the Microsoft Office color dialog.)
     * Do not alter this sequence! Other classes depend on it.
     */
    public final static Color[] MS_OFFICE_COLORS = {
        new Color(0x000000), //Black
    };

    /**
     * Prevent instance creation.
     */
    private DefaultPalettes() {
    }
    /*
    public static void main(String[] args) {
        for (int i=0; i < WINDOWS_BASIC_COLORS.length; i+=2) {
            System.out.println("new Color(0x"
            +Integer.toHexString(((Color)WINDOWS_BASIC_COLORS[i+1]).getRGB()).substring(2)
            +"), //"+WINDOWS_BASIC_COLORS[i]);
        }
    }*/
}
