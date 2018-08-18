/*
 * Copyright (c) 2009-2018 Onyx Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Onyx Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.onyx;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.pushingpixels.onyx.data.Album;
import org.pushingpixels.onyx.data.Track;

public class BackendConnector {
	public static List<Album> doAlbumSearch(String artistId, String artistName) throws Exception {
		List<Album> result = new ArrayList<Album>();

		URL url = new URL(
				"http://musicbrainz.org/ws/2/release?limit=100&type=album&artist=" + artistId);
		BufferedReader in = new BufferedReader(new InputStreamReader(url
				.openStream()));

		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(in);
		Element root = doc.getRootElement();

		Element releaseList = (Element) root.getChildren().get(0);
		for (Object relObj : releaseList.getChildren()) {
			Element rel = (Element) relObj;
				Album album = new Album();
				album.name = rel.getChild("title", rel.getNamespace())
						.getText();
				album.releaseID = rel.getAttributeValue("id");
				album.artist = artistName;

				Element asin = rel.getChild("asin", rel.getNamespace());
				if (asin == null)
					continue;

				if (asin != null) {
					album.asin = asin.getText().trim();
				}
				if (album.asin.length() == 0)
					continue;

				Element relEventList = rel.getChild("release-event-list", rel
						.getNamespace());
				if (relEventList == null)
					continue;
				boolean foundUsRelease = false;
				for (Object relEventObj : relEventList.getChildren("release-event", rel
						.getNamespace())) {
					Element relEvent = (Element) relEventObj;
					Element area = relEvent.getChild("area", relEvent.getNamespace());
					if (area == null) {
					    continue;
                    }
					if (!"United States".equals(area.getChild("name", area.getNamespace()).getText()))
						continue;
					album.releaseDate = relEvent.getChild("date", relEvent.getNamespace()).getText();
					if (album.releaseDate != null) {
						foundUsRelease = true;
						break;
					}
				}
				if (!foundUsRelease)
					continue;

				// do we already have one?
				boolean isDuplicate = false;
				for (Album present : result) {
					if (present.asin.equals(album.asin)
							|| present.name.equals(album.name)) {
						isDuplicate = true;
						break;
					}
				}
				if (isDuplicate)
					continue;

				result.add(album);
		}

		in.close();

		return result;
	}

	public static List<Track> doTrackSearch(String releaseId) throws Exception {
		List<Track> result = new ArrayList<Track>();

		URL url = new URL("http://musicbrainz.org/ws/1/release/" + releaseId
				+ "?type=xml&inc=tracks");
		BufferedReader in = new BufferedReader(new InputStreamReader(url
				.openStream()));

		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(in);
		Element root = doc.getRootElement();

		Element release = (Element) root.getChildren().get(0);
		Element trackList = release.getChild("track-list", release
				.getNamespace());
		for (Object trackObj : trackList.getChildren()) {
			Element track = (Element) trackObj;
			Track tr = new Track();
			tr.title = track.getChild("title", release.getNamespace())
					.getText();
			tr.duration = Long.parseLong(track.getChild("duration",
					release.getNamespace()).getText()) / 1000;
			result.add(tr);
		}

		in.close();

		return result;
	}

	public static BufferedImage getAlbumArt(String asin) throws Exception {
		BufferedImage cover = ImageIO.read(new URL(
				"http://ec1.images-amazon.com/images/P/" + asin
						+ ".01.MZZZZZZZ.jpg"));
		return cover;
	}

	public static BufferedImage getLargeAlbumArt(String asin) throws Exception {
		BufferedImage cover = ImageIO.read(new URL(
				"http://ec1.images-amazon.com/images/P/" + asin
						+ ".01.LZZZZZZZ.jpg"));
		return cover;
	}

}
