package com.vgs.pim.ui;

import javax.swing.JButton;
import javax.swing.JToolBar;

import com.vgs.pim.ui.util.UiUtils;

class MainToolbar extends JToolBar {

	public MainToolbar() {
		setFloatable(false);
		JButton contactsButton = new JButton(UiUtils.getIcon(
				"address-book.png", this));
		contactsButton.setToolTipText(UiUtils.getMessage("LABEL_CONTACTS"));
		add(contactsButton);
	}

}
