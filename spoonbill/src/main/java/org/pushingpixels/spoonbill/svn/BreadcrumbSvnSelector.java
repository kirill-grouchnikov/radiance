/*
 * Copyright (c) 2005-2018 Spoonbill Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Spoonbill Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.spoonbill.svn;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.pushingpixels.flamingo.api.bcb.BreadcrumbBarCallBack;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbBarException;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbItem;
import org.pushingpixels.flamingo.api.bcb.JBreadcrumbBar;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.tmatesoft.svn.core.SVNDirEntry;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNNodeKind;
import org.tmatesoft.svn.core.SVNProperties;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.fs.FSRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.svn.SVNRepositoryFactoryImpl;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

/**
 * Breadcrumb bar that allows browsing a single local / remote SVN repository.
 * The implementation uses <a href="http://www.svnkit.com">SVNKit</a> library.
 * Make sure to read the <a
 * href="http://www.svnkit.com/licensing/index.html">licensing terms</a> before
 * using this component in your application.
 * 
 * @author Kirill Grouchnikov
 */
public class BreadcrumbSvnSelector extends JBreadcrumbBar<String> {
	/**
	 * SVN-specific implementation of the {@link BreadcrumbBarCallBack}.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static class PathCallback extends BreadcrumbBarCallBack<String> {
		/**
		 * Repository URL.
		 */
		private String url;

		/**
		 * User name.
		 */
		private String userName;

		/**
		 * Password.
		 */
		private char[] password;

		/**
		 * The actual SVN repository.
		 */
		private SVNRepository repository;

		/**
		 * Creates a new callback.
		 * 
		 * @param url
		 *            Repository URL.
		 * @param userName
		 *            User name.
		 * @param password
		 *            Password.
		 */
		public PathCallback(String url, String userName, char[] password) {
			this.url = url;
			this.userName = userName;
			this.password = password;

		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.jvnet.flamingo.bcb.BreadcrumbBarCallBack#setup()
		 */
		@Override
		public void setup() throws BreadcrumbBarException {
			DAVRepositoryFactory.setup();
			SVNRepositoryFactoryImpl.setup();
			FSRepositoryFactory.setup();

			try {
				this.repository = SVNRepositoryFactory.create(SVNURL
						.parseURIEncoded(this.url));
				ISVNAuthenticationManager authManager = SVNWCUtil
						.createDefaultAuthenticationManager(this.userName,
								this.password);
				this.repository.setAuthenticationManager(authManager);
			} catch (SVNException svne) {
				if (this.throwsExceptions) {
					throw new BreadcrumbBarException(svne);
				}
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.jvnet.flamingo.bcb.BreadcrumbBarCallBack#getPathChoices(java.
		 * util.List)
		 */
		@Override
		public List<StringValuePair<String>> getPathChoices(
				List<BreadcrumbItem<String>> path)
				throws BreadcrumbBarException {
			String lastPath = (path == null) ? "" : path.get(path.size() - 1)
					.getData();
			try {
				return BreadcrumbSvnSelector.getPathChoices(this.repository,
						lastPath);
			} catch (SVNException svne) {
				if (this.throwsExceptions) {
					throw new BreadcrumbBarException(svne);
				}
				return null;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.jvnet.flamingo.bcb.BreadcrumbBarCallBack#getLeafs(java.util.List)
		 */
		@Override
		public List<StringValuePair<String>> getLeafs(
				List<BreadcrumbItem<String>> path)
				throws BreadcrumbBarException {
			String lastPath = (path == null) ? "" : path.get(path.size() - 1)
					.getData();
			try {
				return BreadcrumbSvnSelector
						.getLeafs(this.repository, lastPath);
			} catch (SVNException svne) {
				svne.printStackTrace();
				return null;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.jvnet.flamingo.bcb.BreadcrumbBarCallBack#getLeafContent(java.
		 * lang.Object)
		 */
		@Override
		public InputStream getLeafContent(String leaf)
				throws BreadcrumbBarException {
			try {
				return BreadcrumbSvnSelector.getLeafContent(this.repository,
						leaf);
			} catch (SVNException svne) {
				return null;
			}
		}

	}

	/**
	 * Creates a new empty breadcrumb bar that is not connected to any SVN
	 * repository.
	 */
	public BreadcrumbSvnSelector() {
		super(null);
	}

	/**
	 * Creates a new breadcrumb bar to browse the specified SVN repository. The
	 * actual connection is done off EDT so that the application remains
	 * responsive.
	 * 
	 * @param url
	 *            Repository URL.
	 * @param userName
	 *            User name.
	 * @param password
	 *            Password.
	 */
	public BreadcrumbSvnSelector(String url, String userName, char[] password) {
		super(new PathCallback(url, userName, password));
	}

	/**
	 * Sets the connection parameters. The breadcrumb bar path is reset to the
	 * root of thew specified SVN repository.
	 * 
	 * @param url
	 *            Repository URL.
	 * @param userName
	 *            User name.
	 * @param password
	 *            Password.
	 */
	public void setConnectionParams(String url, String userName, char[] password) {
		this.setConnectionParams(url, userName, password, false);
	}

	/**
	 * Sets the connection parameters. The breadcrumb bar path is reset to the
	 * root of thew specified SVN repository.
	 * 
	 * @param url
	 *            Repository URL.
	 * @param userName
	 *            User name.
	 * @param password
	 *            Password.
	 * @param throwsException
	 *            Indicates whether the inner exceptions should be reported to
	 *            the registered exception handlers.
	 */
	public void setConnectionParams(String url, String userName,
	        char[] password, boolean throwsException) {
		this.callback = new PathCallback(url, userName, password);
		this.callback.setup();
		this.callback.setThrowsExceptions(throwsException);
		this.setPath(new LinkedList<BreadcrumbItem<String>>());
	}

	/**
	 * Returns the contents of the specified repository file.
	 * 
	 * @param repository
	 *            SVN repository.
	 * @param leaf
	 *            Full path to the file.
	 * @return Contents of the specified repository file.
	 * @throws SVNException
	 */
	@SuppressWarnings("unchecked")
	protected static InputStream getLeafContent(SVNRepository repository,
			String leaf) throws SVNException {
		Map fileProperties = new HashMap();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		repository.getFile(leaf, -1, SVNProperties.wrap(fileProperties), baos);
		return new ByteArrayInputStream(baos.toByteArray());
	}

	/**
	 * Returns a list of all the files in the specified folder.
	 * 
	 * @param repository
	 *            SVN repository.
	 * @param path
	 *            Full path to the folder.
	 * @return List of all the files in the specified folder.
	 * @throws SVNException
	 */
	@SuppressWarnings("unchecked")
	protected static List<StringValuePair<String>> getLeafs(
			SVNRepository repository, String path) throws SVNException {
		List<StringValuePair<String>> result = new ArrayList<StringValuePair<String>>();
		Collection entries = repository.getDir(path, -1, null,
				(Collection) null);
		Iterator iterator = entries.iterator();
		while (iterator.hasNext()) {
			SVNDirEntry entry = (SVNDirEntry) iterator.next();
			if (entry.getKind() == SVNNodeKind.FILE) {
				String prefix = ((path == null) || (path.length() == 0)) ? ""
						: path + "/";
				StringValuePair<String> leafInfo = new StringValuePair<String>(
						entry.getName(), prefix + entry.getName());
				leafInfo.set("size", entry.getSize());
				leafInfo.set("author", entry.getAuthor());
				leafInfo.set("date", entry.getDate());
				leafInfo.set("revision", entry.getRevision());
				result.add(leafInfo);
			}
		}
		Collections.sort(result, new Comparator<StringValuePair<String>>() {
			public int compare(StringValuePair<String> o1,
					StringValuePair<String> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		return result;
	}

	/**
	 * Returns a list of all the foldes in the specified folder.
	 * 
	 * @param repository
	 *            SVN repository.
	 * @param path
	 *            Full path to the folder.
	 * @return List of all the folders in the specified folder.
	 * @throws SVNException
	 */
	@SuppressWarnings("unchecked")
	protected static List<StringValuePair<String>> getPathChoices(
			SVNRepository repository, String path) throws SVNException {
		List<StringValuePair<String>> result = new ArrayList<StringValuePair<String>>();
		Collection entries = repository.getDir(path, -1, null,
				(Collection) null);
		Iterator iterator = entries.iterator();
		while (iterator.hasNext()) {
			SVNDirEntry entry = (SVNDirEntry) iterator.next();
			if (entry.getKind() == SVNNodeKind.DIR) {
				String prefix = ((path == null) || (path.length() == 0)) ? ""
						: path + "/";
				result.add(new StringValuePair<String>(entry.getName(), prefix
						+ entry.getName()));
			}
		}
		Collections.sort(result, new Comparator<StringValuePair<String>>() {
			public int compare(StringValuePair<String> o1,
					StringValuePair<String> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		return result;
	}
}
