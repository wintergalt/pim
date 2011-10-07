package com.vgs.pim.ui.mainpanel

import javax.swing.AbstractAction
import javax.swing.Action
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JToolBar

import com.vgs.pim.ui.util.UiUtils

class MainToolbar extends JToolBar {

	public MainToolbar(JFrame mainFrame) {
		setFloatable(false)
		JButton contactsButton = new JButton()
		Action contactsAction = mainFrame.getActions().get("openContactsFrameAction")
		contactsAction.putValue(AbstractAction.SMALL_ICON, UiUtils.getIcon(
			"address-book-24.png", this))
		contactsButton.setAction(contactsAction)
		contactsButton.setToolTipText(UiUtils.getMessage("LABEL_CONTACTS"))
		add(contactsButton)
	}

}
