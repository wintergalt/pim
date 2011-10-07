package com.vgs.pim.ui.contactsframe

import javax.swing.JButton
import javax.swing.JToolBar

import com.vgs.pim.ui.util.UiUtils

class ContactsToolBar extends JToolBar {
	
	public ContactsToolBar() {
		setFloatable(false)
		JButton newContactButton = new JButton(UiUtils.getIcon(
				"new-contact-24.png", this))
		contactsButton.setToolTipText(UiUtils.getMessage("LABEL_NEW_CONTACT"))
		add(newContactButton)
	}

}
