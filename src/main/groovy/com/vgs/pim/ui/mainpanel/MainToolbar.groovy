package com.vgs.pim.ui.mainpanel

import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JToolBar

import com.vgs.pim.ui.util.UiUtils

class MainToolbar extends JToolBar {

	public MainToolbar(JFrame mainFrame) {
		setFloatable(false)
		JButton contactsButton = new JButton(UiUtils.getIcon(
				"address-book-24.png", this))
		contactsButton.setAction(mainFrame.getActions().get("openContactsFrameAction"))
		contactsButton.setToolTipText(UiUtils.getMessage("LABEL_CONTACTS"))
		add(contactsButton)
		print mainFrame.getActions().get("openContactsFrameAction")
	}

}
