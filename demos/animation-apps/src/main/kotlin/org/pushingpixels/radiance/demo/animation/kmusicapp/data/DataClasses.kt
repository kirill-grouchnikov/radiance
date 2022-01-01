/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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

package org.pushingpixels.radiance.demo.animation.kmusicapp.data

import com.squareup.moshi.Json

data class SearchResultRelease(
    @field:Json(name = "id") val id: String?,
    @field:Json(name = "title") val title: String?,
    @field:Json(name = "artist") var artist: String?,
    @field:Json(name = "date") val date: String?,
    @field:Json(name = "release-events") val releaseEvents: List<ReleaseEvent>,
    @field:Json(name = "asin") val asin: String?)

data class Area(
        @field:Json(name = "disambiguation") val disambiguation: String?,
        @field:Json(name = "id") val id: String?,
        @field:Json(name = "name") var name: String?,
        @field:Json(name = "sort-name") val sortName: String?,
        @field:Json(name = "iso-3166-1-codes") val iso31661Codes: List<String>)

data class Medium(
        @field:Json(name = "tracks") val tracks: List<Track>)

data class Release(
    @field:Json(name = "id") val id: String?,
    @field:Json(name = "title") val title: String?,
    @field:Json(name = "date") val date: String?,
    @field:Json(name = "media") val media: List<Medium>,
    @field:Json(name = "asin") val asin: String?)

data class ReleaseEvent(
        @field:Json(name = "date") val date: String?,
        @field:Json(name = "area") val area: Area?)

@Json(name = "release-list")
data class ReleaseList(
        @field:Json(name = "count") val count: Int?,
        @field:Json(name = "releases") val releases: List<SearchResultRelease>)

data class Track(
        @field:Json(name = "title") val title: String?,
        @field:Json(name = "length") val length: Int?)

