/*
 * ====================================================================
 * Copyright (c) 2004-2007 TMate Software Ltd.  All rights reserved.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution.  The terms
 * are also available at http://svnkit.com/license.html
 * If newer versions of this license are posted there, you may use a
 * newer version instead, at your option.
 * ====================================================================
 */
package org.pushingpixels.demo.flamingo.bcb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNNodeKind;
import org.tmatesoft.svn.core.SVNProperties;
import org.tmatesoft.svn.core.SVNProperty;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.fs.FSRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.svn.SVNRepositoryFactoryImpl;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

public class DisplayFile {
	/*
	 * args parameter is used to obtain a repository location URL, user's
	 * account name & password to authenticate him to the server, the file path
	 * in the rpository (the file path should be relative to the the
	 * path/to/repository part of the repository location URL).
	 */
	public static void main(String[] args) {
		/*
		 * Default values:
		 */
		String url = "svn://anonsvn.kde.org/home/kde/";
		String name = "anonymous";
		String password = "anonymous";
		String filePath = "branches/KDE/4.9/kdeartwork/IconThemes/nuvola/author.txt";
		/*
		 * Initializes the library (it must be done before ever using the
		 * library itself)
		 */
		setupLibrary();

		if (args != null) {
			/*
			 * Obtains a repository location URL
			 */
			url = (args.length >= 1) ? args[0] : url;
			/*
			 * Obtains a file path
			 */
			filePath = (args.length >= 2) ? args[1] : filePath;
			/*
			 * Obtains an account name (will be used to authenticate the user to
			 * the server)
			 */
			name = (args.length >= 3) ? args[2] : name;
			/*
			 * Obtains a password
			 */
			password = (args.length >= 4) ? args[3] : password;
		}
		SVNRepository repository = null;
		try {
			/*
			 * Creates an instance of SVNRepository to work with the repository.
			 * All user's requests to the repository are relative to the
			 * repository location used to create this SVNRepository. SVNURL is
			 * a wrapper for URL strings that refer to repository locations.
			 */
			repository = SVNRepositoryFactory.create(SVNURL
					.parseURIEncoded(url));
		} catch (SVNException svne) {
			/*
			 * Perhaps a malformed URL is the cause of this exception
			 */
			System.err
					.println("error while creating an SVNRepository for the location '"
							+ url + "': " + svne.getMessage());
			svne.printStackTrace();
			System.exit(1);
		}

		/*
		 * User's authentication information (name/password) is provided via an
		 * ISVNAuthenticationManager instance. SVNWCUtil creates a default
		 * authentication manager given user's name and password.
		 * 
		 * Default authentication manager first attempts to use provided user
		 * name and password and then falls back to the credentials stored in
		 * the default Subversion credentials storage that is located in
		 * Subversion configuration area. If you'd like to use provided user
		 * name and password only you may use BasicAuthenticationManager class
		 * instead of default authentication manager:
		 * 
		 * authManager = new BasicAuthenticationsManager(userName,
		 * userPassword);
		 * 
		 * You may also skip this point - anonymous access will be used.
		 */
		ISVNAuthenticationManager authManager = SVNWCUtil
				.createDefaultAuthenticationManager(name, password.toCharArray());
		repository.setAuthenticationManager(authManager);

		/*
		 * This Map will be used to get the file properties. Each Map key is a
		 * property name and the value associated with the key is the property
		 * value.
		 */
		Map fileProperties = new HashMap();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		try {
			/*
			 * Checks up if the specified path really corresponds to a file. If
			 * doesn't the program exits. SVNNodeKind is that one who says what
			 * is located at a path in a revision. -1 means the latest revision.
			 */
			SVNNodeKind nodeKind = repository.checkPath(filePath, -1);

			if (nodeKind == SVNNodeKind.NONE) {
				System.err.println("There is no entry at '" + url + "'.");
				System.exit(1);
			} else if (nodeKind == SVNNodeKind.DIR) {
				System.err.println("The entry at '" + url
						+ "' is a directory while a file was expected.");
				System.exit(1);
			}
			/*
			 * Gets the contents and properties of the file located at filePath
			 * in the repository at the latest revision (which is meant by a
			 * negative revision number).
			 */
			repository.getFile(filePath, -1,
					SVNProperties.wrap(fileProperties), baos);

		} catch (SVNException svne) {
			System.err
					.println("error while fetching the file contents and properties: "
							+ svne.getMessage());
			svne.printStackTrace();
			System.exit(1);
		}

		/*
		 * Here the SVNProperty class is used to get the value of the
		 * svn:mime-type property (if any). SVNProperty is used to facilitate
		 * the work with versioned properties.
		 */
		String mimeType = (String) fileProperties.get(SVNProperty.MIME_TYPE);

		/*
		 * SVNProperty.isTextMimeType(..) method checks up the value of the
		 * mime-type file property and says if the file is a text (true) or not
		 * (false).
		 */
		boolean isTextType = SVNProperty.isTextMimeType(mimeType);

		Iterator iterator = fileProperties.keySet().iterator();
		/*
		 * Displays file properties.
		 */
		while (iterator.hasNext()) {
			String propertyName = (String) iterator.next();
			String propertyValue = (String) fileProperties.get(propertyName);
			System.out.println("File property: " + propertyName + "="
					+ propertyValue);
		}
		/*
		 * Displays the file contents in the console if the file is a text.
		 */
		if (isTextType) {
			System.out.println("File contents:");
			System.out.println();
			try {
				baos.writeTo(System.out);
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} else {
			System.out
					.println("File contents can not be displayed in the console since the mime-type property says that it's not a kind of a text file.");
		}
		/*
		 * Gets the latest revision number of the repository
		 */
		long latestRevision = -1;
		try {
			latestRevision = repository.getLatestRevision();
		} catch (SVNException svne) {
			System.err
					.println("error while fetching the latest repository revision: "
							+ svne.getMessage());
			System.exit(1);
		}
		System.out.println("");
		System.out.println("---------------------------------------------");
		System.out.println("Repository latest revision: " + latestRevision);
		System.exit(0);
	}

	/*
	 * Initializes the library to work with a repository via different
	 * protocols.
	 */
	private static void setupLibrary() {
		/*
		 * For using over http:// and https://
		 */
		DAVRepositoryFactory.setup();
		/*
		 * For using over svn:// and svn+xxx://
		 */
		SVNRepositoryFactoryImpl.setup();

		/*
		 * For using over file:///
		 */
		FSRepositoryFactory.setup();
	}
}
