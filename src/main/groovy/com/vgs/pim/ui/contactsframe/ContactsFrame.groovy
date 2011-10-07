package com.vgs.pim.ui.contactsframe

import javax.swing.JInternalFrame

class ContactsFrame extends JInternalFrame {

	private static ContactsFrame instance = null

	private ContactsFrame() {
	}

	private ContactsFrame(String title, boolean resizable, boolean closable,
	boolean maximizable, boolean iconifiable) {
		super(title, resizable, closable, maximizable, iconifiable)
	}

	private ContactsFrame(String title, boolean resizable, boolean closable,
	boolean maximizable) {
		super(title, resizable, closable, maximizable)
	}

	private ContactsFrame(String title, boolean resizable, boolean closable) {
		super(title, resizable, closable)
	}

	private ContactsFrame(String title, boolean resizable) {
		super(title, resizable)
	}

	private ContactsFrame(String title) {
		super(title)
	}

	static ContactsFrame getInstance(title=null) {
		if(!instance) {
			instance = new ContactsFrame(title, true, true, true, false)
			instance.setSize(100, 100)
			instance.setLocation(50, 50)
		}
		instance
	}
}
