/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.colorscheme;

import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;

/**
 * Defines a query that returns a single color based on a color scheme.
 * 
 * @author Kirill Grouchnikov
 */
@FunctionalInterface
public interface ContainerColorTokensSingleColorQuery {
	Color query(ContainerColorTokens colorTokens);

	ContainerColorTokensSingleColorQuery CONTAINER_SURFACE_LOWEST = (colorTokens) ->
		colorTokens.getContainerSurfaceLowest();
	ContainerColorTokensSingleColorQuery CONTAINER_SURFACE_LOW = (colorTokens) ->
			colorTokens.getContainerSurfaceLow();
	ContainerColorTokensSingleColorQuery CONTAINER_SURFACE = (colorTokens) ->
			colorTokens.getContainerSurface();
	ContainerColorTokensSingleColorQuery CONTAINER_SURFACE_HIGH = (colorTokens) ->
			colorTokens.getContainerSurfaceHigh();
	ContainerColorTokensSingleColorQuery CONTAINER_SURFACE_HIGHEST = (colorTokens) ->
			colorTokens.getContainerSurfaceHighest();

	ContainerColorTokensSingleColorQuery CONTAINER_OUTLINE = (colorTokens) ->
			colorTokens.getContainerOutline();
	ContainerColorTokensSingleColorQuery CONTAINER_OUTLINE_VARIANT = (colorTokens) ->
			colorTokens.getContainerOutlineVariant();

	ContainerColorTokensSingleColorQuery INVERSE_CONTAINTER_SURFACE = (colorTokens) ->
		colorTokens.getInverseContainerSurface();
	ContainerColorTokensSingleColorQuery INVERSE_CONTAINER_OUTLINE = (colorTokens) ->
		colorTokens.getInverseContainerOutline();

	static ContainerColorTokensSingleColorQuery composite(
		ContainerColorTokensSingleColorQuery base, ColorTransform... transforms) {
		return colorTokens -> {
			Color result = base.query(colorTokens);
			for (ColorTransform transform: transforms) {
				result = transform.transform(result);
			}
			return result;
		};
	}

	static ContainerColorTokensSingleColorQuery blend(
		ContainerColorTokensSingleColorQuery first,
		ContainerColorTokensSingleColorQuery second,
		float firstLikeness) {
		return colorTokens -> {
			return RadianceColorUtilities.getInterpolatedColor(first.query(colorTokens),
				second.query(colorTokens), firstLikeness);
		};
	}
}
