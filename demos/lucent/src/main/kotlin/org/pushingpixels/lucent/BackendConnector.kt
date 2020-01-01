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
package org.pushingpixels.lucent

import org.pushingpixels.lucent.data.Release
import org.pushingpixels.lucent.data.ReleaseList
import org.pushingpixels.lucent.data.SearchResultRelease
import org.pushingpixels.lucent.data.Track
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.awt.image.BufferedImage
import java.io.IOException
import java.net.URL
import java.util.*
import javax.imageio.ImageIO

object BackendConnector {
    @Throws(IOException::class)
    fun doAlbumSearch(artistId: String, artistName: String): List<SearchResultRelease> {
        val retrofit = Retrofit.Builder()
                .baseUrl(MusicBrainzService.API_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        val service = retrofit.create(MusicBrainzService::class.java)

        val releaseResponse = service.getReleases(artistId).execute()
        val releases = releaseResponse.body()

        val result = ArrayList<SearchResultRelease>()
        for (release in releases!!.releases) {
            if (release.asin == null || release.asin.isEmpty()) {
                continue
            }
            if (release.releaseEvents.isEmpty()) {
                continue
            }

            var foundUsRelease = false
            for (releaseEvent in release.releaseEvents) {
                if (releaseEvent.area == null) {
                    continue
                }
                if ("United States" != releaseEvent.area.name) {
                    continue
                }
                if (releaseEvent.date == null || releaseEvent.date.isEmpty()) {
                    continue
                }
                foundUsRelease = true
                break
            }

            if (!foundUsRelease) {
                continue
            }

            // do we already have one?
            var isDuplicate = false
            for (present in result) {
                if (present.asin == release.asin || present.title == release.title) {
                    isDuplicate = true
                    break
                }
            }
            if (isDuplicate) {
                continue
            }

            release.artist = artistName
            result.add(release)
        }

        return result
    }

    @Throws(IOException::class)
    fun doTrackSearch(releaseId: String): List<Track> {
        val retrofit = Retrofit.Builder()
                .baseUrl(MusicBrainzService.API_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        val service = retrofit.create(MusicBrainzService::class.java)

        val releaseResponse = service.getRelease(releaseId).execute()
        val release = releaseResponse.body()

        return release!!.media[0].tracks
    }

    @Throws(Exception::class)
    fun getLargeAlbumArt(asin: String): BufferedImage {
        return ImageIO.read(URL(
                "http://ec1.images-amazon.com/images/P/$asin.01.LZZZZZZZ.jpg"))
    }

    private interface MusicBrainzService {
        @GET("/ws/2/release?type=album&fmt=json")
        fun getReleases(@Query("artist") artistId: String): Call<ReleaseList>

        @GET("/ws/2/release/{release}?inc=recordings&fmt=json")
        fun getRelease(@Path("release") releaseId: String): Call<Release>

        companion object {
            const val API_URL = "http://musicbrainz.org/"
        }
    }
}
