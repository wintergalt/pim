package com.vgs.pim.ui.contactsframe

import java.awt.BorderLayout
import java.awt.FlowLayout

import javax.swing.JInternalFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField

import com.vgs.pim.ui.util.UiUtils

class ContactsFrame extends JInternalFrame {

	private static ContactsFrame instance = null
	private JPanel searchPanel = new JPanel(new FlowLayout())
	private JTextField searchField = new JTextField(20)

	private ContactsFrame() {
	}

	private ContactsFrame(String title, boolean resizable, boolean closable,
	boolean maximizable, boolean iconifiable) {
		super(title, resizable, closable, maximizable, iconifiable)
		setSize(400, 600)
		setLocation(50, 50)
		setTitle(UiUtils.getMessage("LABEL_CONTACTS"))
		setLayout(new BorderLayout())
		
		searchPanel.add(new JLabel(UiUtils.getMessage("LABEL_SEARCH") + ":"))
		searchPanel.add(searchField)
		getContentPane().add(searchPanel,BorderLayout.NORTH)
		instance
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
		}
		instance
	}
}
