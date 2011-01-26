/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.js.preferences;

import org.eclipse.swt.widgets.Composite;
import com.aptana.editor.common.preferences.CommonEditorPreferencePage;
import com.aptana.editor.js.JSPlugin;

public class JSPreferencePage extends CommonEditorPreferencePage
{

	/**
	 * JSPreferencePage
	 */

	public JSPreferencePage()
	{
		super();
		setDescription(Messages.JSPreferencePage_JS_Page_Title);
		setPreferenceStore(JSPlugin.getDefault().getPreferenceStore());
	}

	@Override
	protected void createMarkOccurrenceOptions(Composite parent)
	{
	}

}
