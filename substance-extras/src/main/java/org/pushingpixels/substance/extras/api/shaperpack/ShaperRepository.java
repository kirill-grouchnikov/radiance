/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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

import java.awt.geom.Point2D;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class ShaperRepository {
	public static CanonicalPath read(InputStream stream) {
		try (DataInputStream dis  = new DataInputStream(stream)) {
			double ratio = dis.readDouble();
			int pointCount = dis.readInt();
			ArrayList<Point2D> major = new ArrayList<>();
			ArrayList<Point2D> minor = new ArrayList<>();
			for (int i = 0; i < pointCount; i++) {
				Point2D currMajor = new Point2D.Double(dis.readDouble(), dis.readDouble());
				Point2D currMinor = new Point2D.Double(dis.readDouble(), dis.readDouble());
				major.add(currMajor);
				minor.add(currMinor);
			}
			return new CanonicalPath(major, minor, ratio);
		} catch (Exception exc) {
			exc.printStackTrace();
			return null;
		}
	}

	public static void write(OutputStream stream, CanonicalPath path) {
		try (DataOutputStream dos = new DataOutputStream(stream)) {
			ArrayList<Point2D> major = path.getMajorPoints();
			ArrayList<Point2D> minor = path.getMinorPoints();
			dos.writeDouble(path.getRatio());
			dos.writeInt(major.size());
			for (int i = 0; i < major.size(); i++) {
				Point2D currMajor = major.get(i);
				dos.writeDouble(currMajor.getX());
				dos.writeDouble(currMajor.getY());
				Point2D currMinor = minor.get(i);
				dos.writeDouble(currMinor.getX());
				dos.writeDouble(currMinor.getY());
			}
		} catch (Exception exc) {
		}
	}
}
