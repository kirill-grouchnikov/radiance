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

import java.util.Collection;
import java.util.Iterator;

import org.tmatesoft.svn.core.SVNDirEntry;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNNodeKind;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.fs.FSRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.svn.SVNRepositoryFactoryImpl;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

/*
 * This example shows how to get the repository tree at the latest (HEAD)
 * revision starting with the directory that is the path/to/repository part of
 * the repository location URL. The main point is SVNRepository.getDir() method
 * that is called recursively for each directory (till the end of the tree).
 * getDir collects all entries located inside a directory and returns them as a
 * java.util.Collection. As an example here's one of the program layouts (for
 * the default url used in the program ):
 * 
 * Repository Root: http://svn.svnkit.com/repos/svnkit Repository UUID:
 * 0a862816-5deb-0310-9199-c792c6ae6c6e
 * 
 * /examples (author: 'sa'; revision: 2794; date: Tue Nov 14 03:21:11 NOVT 2006)
 * /examples/svnkit-examples.iml (author: 'alex'; revision: 2775; date: Fri Nov
 * 10 02:08:45 NOVT 2006) /examples/src (author: 'sa'; revision: 2794; date: Tue
 * Nov 14 03:21:11 NOVT 2006) /examples/src/org (author: 'sa'; revision: 2794;
 * date: Tue Nov 14 03:21:11 NOVT 2006) /examples/src/org/tmatesoft (author:
 * 'sa'; revision: 2794; date: Tue Nov 14 03:21:11 NOVT 2006)
 * /examples/src/org/tmatesoft/svn (author: 'sa'; revision: 2794; date: Tue Nov
 * 14 03:21:11 NOVT 2006) /examples/src/org/tmatesoft/svn/examples (author:
 * 'sa'; revision: 2794; date: Tue Nov 14 03:21:11 NOVT 2006)
 * /examples/src/org/tmatesoft/svn/examples/wc (author: 'alex'; revision: 2776;
 * date: Fri Nov 10 02:25:08 NOVT 2006)
 * ......................................................
 * --------------------------------------------- Repository latest revision:
 * 2802
 */
public class DisplayRepositoryTree {
	/*
	 * args parameter is used to obtain a repository location URL, user's
	 * account name & password to authenticate him to the server.
	 */
	public static void main(String[] args) {
		/*
		 * default values:
		 */
		String url = "svn://anonsvn.kde.org/home/kde/";
		String name = "anonymous";
		String password = "anonymous";

		/*
		 * initializes the library (it must be done before ever using the
		 * library itself)
		 */
		setupLibrary();
		if (args != null) {
			/*
			 * obtains a repository location URL
			 */
			url = (args.length >= 1) ? args[0] : url;
			/*
			 * obtains an account name (will be used to authenticate the user to
			 * the server)
			 */
			name = (args.length >= 2) ? args[1] : name;
			/*
			 * obtains a password
			 */
			password = (args.length >= 3) ? args[2] : password;
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
					.println("error while creating an SVNRepository for location '"
							+ url + "': " + svne.getMessage());
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

		try {
			/*
			 * Checks up if the specified path/to/repository part of the URL
			 * really corresponds to a directory. If doesn't the program exits.
			 * SVNNodeKind is that one who says what is located at a path in a
			 * revision. -1 means the latest revision.
			 */
			SVNNodeKind nodeKind = repository.checkPath("", -1);
			if (nodeKind == SVNNodeKind.NONE) {
				System.err.println("There is no entry at '" + url + "'.");
				System.exit(1);
			} else if (nodeKind == SVNNodeKind.FILE) {
				System.err.println("The entry at '" + url
						+ "' is a file while a directory was expected.");
				System.exit(1);
			}
			/*
			 * getRepositoryRoot() returns the actual root directory where the
			 * repository was created. 'true' forces to connect to the
			 * repository if the root url is not cached yet.
			 */
			System.out.println("Repository Root: "
					+ repository.getRepositoryRoot(true));
			/*
			 * getRepositoryUUID() returns Universal Unique IDentifier (UUID) of
			 * the repository. 'true' forces to connect to the repository if the
			 * UUID is not cached yet.
			 */
			System.out.println("Repository UUID: "
					+ repository.getRepositoryUUID(true));
			System.out.println("");

			/*
			 * Displays the repository tree at the current path - "" (what means
			 * the path/to/repository directory)
			 */
			listEntries(repository, "");
		} catch (SVNException svne) {
			System.err.println("error while listing entries: "
					+ svne.getMessage());
			System.exit(1);
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

	/*
	 * Called recursively to obtain all entries that make up the repository tree
	 * repository - an SVNRepository which interface is used to carry out the
	 * request, in this case it's a request to get all entries in the directory
	 * located at the path parameter;
	 * 
	 * path is a directory path relative to the repository location path (that
	 * is a part of the URL used to create an SVNRepository instance);
	 * 
	 */
	public static void listEntries(SVNRepository repository, String path)
			throws SVNException {
		/*
		 * Gets the contents of the directory specified by path at the latest
		 * revision (for this purpose -1 is used here as the revision number to
		 * mean HEAD-revision) getDir returns a Collection of SVNDirEntry
		 * elements. SVNDirEntry represents information about the directory
		 * entry. Here this information is used to get the entry name, the name
		 * of the person who last changed this entry, the number of the revision
		 * when it was last changed and the entry type to determine whether it's
		 * a directory or a file. If it's a directory listEntries steps into a
		 * next recursion to display the contents of this directory. The third
		 * parameter of getDir is null and means that a user is not interested
		 * in directory properties. The fourth one is null, too - the user
		 * doesn't provide its own Collection instance and uses the one returned
		 * by getDir.
		 */
		Collection entries = repository.getDir(path, -1, null,
				(Collection) null);
		Iterator iterator = entries.iterator();
		while (iterator.hasNext()) {
			SVNDirEntry entry = (SVNDirEntry) iterator.next();
			System.out.println("/" + (path.equals("") ? "" : path + "/")
					+ entry.getName() + " (author: '" + entry.getAuthor()
					+ "'; revision: " + entry.getRevision() + "; date: "
					+ entry.getDate() + ")");
			/*
			 * Checking up if the entry is a directory.
			 */
			if (entry.getKind() == SVNNodeKind.DIR) {
				listEntries(repository, (path.equals("")) ? entry.getName()
						: path + "/" + entry.getName());
			}
		}
	}
}