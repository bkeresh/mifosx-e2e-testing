// ========================================================================
// $Id: FilterHolderMBean.java,v 1.4 2005/03/21 13:30:04 janb Exp $
// Copyright 200-2004 Mort Bay Consulting Pty. Ltd.
// ------------------------------------------------------------------------
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at 
// http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// ========================================================================

package org.browsermob.proxy.jetty.jetty.servlet.jmx;

import org.browsermob.proxy.jetty.jetty.servlet.FilterHolder;

import javax.management.MBeanException;

// TODO: Auto-generated Javadoc
/* ------------------------------------------------------------ */
/**
 * The Class FilterHolderMBean.
 * 
 * @version $Revision: 1.4 $
 * @author Greg Wilkins (gregw)
 */
public class FilterHolderMBean extends HolderMBean {
	/* ------------------------------------------------------------ */
	/** The _holder. */
	private FilterHolder _holder;

	/* ------------------------------------------------------------ */
	/**
	 * Constructor.
	 * 
	 * @throws MBeanException
	 *             the m bean exception
	 */
	public FilterHolderMBean() throws MBeanException {
	}

	/* ------------------------------------------------------------ */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.browsermob.proxy.jetty.jetty.servlet.jmx.HolderMBean#
	 * defineManagedResource()
	 */
	protected void defineManagedResource() {
		super.defineManagedResource();
		_holder = (FilterHolder) getManagedResource();
	}

}
