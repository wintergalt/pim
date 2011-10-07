package com.vgs.pim.ui.mainpanel.action

import java.awt.event.ActionEvent

import javax.swing.AbstractAction

import com.vgs.pim.ui.Pim
import com.vgs.pim.ui.contactsframe.ContactsFrame

public class OpenContactsFrameAction extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		Pim.currentInstance.showFrame(ContactsFrame.getInstance())
	}

	
}
