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
package org.pushingpixels.radiance.demo.animation.jmusicapp;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.pushingpixels.radiance.demo.animation.jmusicapp.data.*;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BackendConnector {
    public static List<SearchResultRelease> doAlbumSearch(String artistId, String artistName)
            throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MusicBrainzService.API_URL)
                .client(getHttpClient())
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        MusicBrainzService service = retrofit.create(MusicBrainzService.class);

        Response<ReleaseList> releaseResponse = service.getReleases(artistId).execute();
        ReleaseList releases = releaseResponse.body();

        List<SearchResultRelease> result = new ArrayList<>();
        for (SearchResultRelease release : releases.releases) {
            if ((release.asin == null) || release.asin.isEmpty()) {
                continue;
            }
            if ((release.releaseEvents == null) || release.releaseEvents.isEmpty()) {
                continue;
            }

            boolean foundUsRelease = false;
            for (ReleaseEvent releaseEvent : release.releaseEvents) {
                if (releaseEvent.area == null) {
                    continue;
                }
                if (!"United States".equals(releaseEvent.area.name)) {
                    continue;
                }
                if ((releaseEvent.date == null) || releaseEvent.date.isEmpty()) {
                    continue;
                }
                foundUsRelease = true;
                break;
            }

            if (!foundUsRelease) {
                continue;
            }

            // do we already have one?
            boolean isDuplicate = false;
            for (SearchResultRelease present : result) {
                if (present.asin.equals(release.asin)
                        || present.title.equals(release.title)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                continue;
            }

            release.artist = artistName;
            result.add(release);
        }

        return result;
    }

    public static List<Track> doTrackSearch(String releaseId) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MusicBrainzService.API_URL)
                .client(getHttpClient())
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        MusicBrainzService service = retrofit.create(MusicBrainzService.class);

        Response<Release> releaseResponse = service.getRelease(releaseId).execute();
        Release release = releaseResponse.body();

        return release.media.get(0).tracks;
    }

    private static OkHttpClient getHttpClient() {
        OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();
        okHttpBuilder.addInterceptor(chain -> {
            Request requestWithUserAgent = chain.request().newBuilder()
                    .header("User-Agent", "Radiance test app. See https://github.com/kirill-grouchnikov/radiance/blob/sunshine/docs/animation/musicapp/overview.md")
                    .build();
            return chain.proceed(requestWithUserAgent);
        });
        return okHttpBuilder.build();
    }

    public static BufferedImage getLargeAlbumArt(String asin) throws Exception {
        return ImageIO.read(new URL(
                "http://ec1.images-amazon.com/images/P/" + asin + ".01.LZZZZZZZ.jpg"));
    }

    private interface MusicBrainzService {
        String API_URL = "https://musicbrainz.org/";

        @GET("/ws/2/release?type=album&fmt=json")
        Call<ReleaseList> getReleases(@Query("artist") String artistId);

        @GET("/ws/2/release/{release}?inc=recordings&fmt=json")
        Call<Release> getRelease(@Path("release") String releaseId);
    }
}
