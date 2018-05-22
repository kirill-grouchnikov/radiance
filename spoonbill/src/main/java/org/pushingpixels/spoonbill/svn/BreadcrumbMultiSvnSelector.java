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

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

import org.pushingpixels.flamingo.api.bcb.BreadcrumbBarCallBack;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbBarException;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbBarExceptionHandler;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbItem;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbPathEvent;
import org.pushingpixels.flamingo.api.bcb.JBreadcrumbBar;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.fs.FSRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.svn.SVNRepositoryFactoryImpl;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

/**
 * Breadcrumb bar that allows browsing multiple local and remote SVN
 * repositories. The implementation uses
 * <a href="http://www.svnkit.com">SVNKit</a> library. Make sure to read the
 * <a href="http://www.svnkit.com/licensing/index.html">licensing terms</a>
 * before using this component in your application.
 * 
 * @author Kirill Grouchnikov
 */
public class BreadcrumbMultiSvnSelector extends JBreadcrumbBar<String> {
	/**
	 * Information on a single SVN repository.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static class SvnRepositoryInfo {
		/**
		 * Repository name.
		 */
		public String name;

		/**
		 * Repository URL.
		 */
		public String url;

		/**
		 * User name.
		 */
		public String user;

		/**
		 * Password.
		 */
		public char[] password;

		/**
		 * Creates a new info object.
		 * 
		 * @param name
		 *            Repository name.
		 * @param url
		 *            Repository URL.
		 * @param user
		 *            User name.
		 * @param password
		 *            Password.
		 */
		public SvnRepositoryInfo(String name, String url, String user, char[] password) {
			this.name = name;
			this.url = url;
			this.user = user;
			this.password = password;
		}
	}

	/**
	 * SVN-specific implementation of the {@link BreadcrumbBarCallBack}.
	 * 
	 * <p>
	 * This is tricky. Unlike other implementations that connect in the setup
	 * method, this implementation connects when the first path selection is
	 * done. The code in
	 * BasicBreadcrumbBar.PopupAction.actionPerformed(ActionEvent) adds two
	 * items - the selected SVN repository and the matching choices. The first
	 * addition requires connecting to the selected repository, which is done
	 * off EDT (using {@link SwingWorker}). The second addition must wait until
	 * the connection has been established since otherwise the repository is not
	 * yet available. In order to make the second addition wait, we use a
	 * {@link CountDownLatch}.
	 * </p>
	 * 
	 * <p>
	 * It is {@link CountDownLatch#countDown()} in the
	 * <code>SwingWorker.done()</code> that wraps the connection. The
	 * {@link BreadcrumbBarCallBack#getPathChoices(BreadcrumbItem[])} and
	 * {@link BreadcrumbBarCallBack#getLeafs(BreadcrumbItem[])} call
	 * {@link CountDownLatch#await()} on the same latch that blocks until the
	 * connection is done. Since both these methods should be wrapped off EDT in
	 * a separate {@link SwingWorker}, this doesn't block the UI.
	 * </p>
	 * 
	 * @author Kirill Grouchnikov
	 */
	protected class PathCallback extends BreadcrumbBarCallBack<String> {
		/**
		 * Information on all the configured SVN repositories.
		 */
		protected List<SvnRepositoryInfo> repositories;

		/**
		 * The current SVN repository.
		 */
		private SVNRepository currRepository;

		/**
		 * Latch to synchronize between connecting to a selected SVN repository
		 * and fetching folder contents.
		 */
		private CountDownLatch connectionLatch;

		/**
		 * Creates a new callback.
		 * 
		 * @param repoList
		 *            List of all SVN repositories.
		 */
		public PathCallback(BreadcrumbMultiSvnSelector.SvnRepositoryInfo... repoList) {
			this.repositories = new ArrayList<SvnRepositoryInfo>();
			if (repoList != null) {
				for (BreadcrumbMultiSvnSelector.SvnRepositoryInfo repository : repoList) {
					this.addSvnRepositoryInfo(repository);
				}
			}

			getModel().addPathListener((BreadcrumbPathEvent event) -> {
				final List<BreadcrumbItem<String>> newPath = getModel().getItems();
				// If one element - an SVN repository has been
				// selected. Need to connect to it and update the
				// currRepository field.
				if (newPath.size() == 1)
					connectionLatch = new CountDownLatch(1);

				SwingUtilities.invokeLater(() -> {
					// If one element - an SVN repository has been
					// selected. Need to connect to it and update
					// the currRepository field.
					if (newPath.size() != 1)
						return;
					final String newSvnName = newPath.get(0).getData();
					// System.out.println("Connecting to " +
					// newSvnName);
					// find the connection params
					for (final SvnRepositoryInfo repoInfo : repositories) {
						if (newSvnName.equals(repoInfo.name)) {
							// connect
							SwingWorker<SVNRepository, Void> worker = new SwingWorker<SVNRepository, Void>() {
								@Override
								protected SVNRepository doInBackground() throws Exception {
									try {
										SVNRepository repository = SVNRepositoryFactory
												.create(SVNURL.parseURIEncoded(repoInfo.url));
										ISVNAuthenticationManager authManager = SVNWCUtil
												.createDefaultAuthenticationManager(repoInfo.user,
														repoInfo.password);
										repository.setAuthenticationManager(authManager);
										return repository;
									} catch (SVNException svne) {
										List<BreadcrumbBarExceptionHandler> handlers = getExceptionHandlers();
										for (BreadcrumbBarExceptionHandler handler : handlers) {
											handler.onException(svne);
										}
										return null;
									}
								}

								@Override
								protected void done() {
									try {
										currRepository = get();
										connectionLatch.countDown();
									} catch (Exception exc) {
									}
								}
							};
							worker.execute();
						}
					}
				});
			});
		}

		/**
		 * Adds information on a new SVN repository.
		 * 
		 * @param repositoryInfo
		 */
		public void addSvnRepositoryInfo(SvnRepositoryInfo repositoryInfo) {
			this.repositories.add(repositoryInfo);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.jvnet.flamingo.bcb.BreadcrumbBarCallBack#setup()
		 */
		@Override
		public void setup() {
			DAVRepositoryFactory.setup();
			SVNRepositoryFactoryImpl.setup();
			FSRepositoryFactory.setup();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.jvnet.flamingo.bcb.BreadcrumbBarCallBack#getPathChoices(java.
		 * util.List)
		 */
		@Override
		public List<StringValuePair<String>> getPathChoices(List<BreadcrumbItem<String>> path)
				throws BreadcrumbBarException {
			try {
				if (connectionLatch != null)
					connectionLatch.await();
			} catch (InterruptedException ie) {
			}
			// System.out.println("Getting choices for " + path);
			if (path == null) {
				// root - list all the repositories.
				List<StringValuePair<String>> result = new ArrayList<StringValuePair<String>>();
				for (SvnRepositoryInfo repoInfo : repositories) {
					StringValuePair<String> toAdd = new StringValuePair<String>(repoInfo.name,
							repoInfo.name);
					result.add(toAdd);
				}
				return result;
			}

			String lastPath = (path.size() == 1) ? "" : path.get(path.size() - 1).getData();
			// System.out.println("Last path is " + lastPath + ", repo "
			// + this.currRepository);
			try {
				return BreadcrumbSvnSelector.getPathChoices(this.currRepository, lastPath);
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
		public List<StringValuePair<String>> getLeafs(List<BreadcrumbItem<String>> path)
				throws BreadcrumbBarException {
			if (path == null) {
				// root - no leafs, only repositories.
				return null;
			}

			try {
				if (connectionLatch != null)
					connectionLatch.await();
			} catch (InterruptedException ie) {
			}
			String lastPath = (path.size() == 1) ? "" : path.get(path.size() - 1).getData();
			try {
				return BreadcrumbSvnSelector.getLeafs(this.currRepository, lastPath);
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
		 * org.jvnet.flamingo.bcb.BreadcrumbBarCallBack#getLeafContent(java.
		 * lang.Object)
		 */
		@Override
		public InputStream getLeafContent(String leaf) throws BreadcrumbBarException {
			try {
				return BreadcrumbSvnSelector.getLeafContent(this.currRepository, leaf);
			} catch (SVNException svne) {
				if (this.throwsExceptions) {
					throw new BreadcrumbBarException(svne);
				}
				return null;
			}
		}

	}

	/**
	 * Creates a new breadcrumb bar with the specified SVN repositories.
	 * 
	 * @param repositories
	 *            List of all SVN repositories.
	 */
	public BreadcrumbMultiSvnSelector(
			BreadcrumbMultiSvnSelector.SvnRepositoryInfo... repositories) {
		super(null);
		this.callback = new PathCallback(repositories);
		this.callback.setup();
		this.getModel().reset();
	}
}
