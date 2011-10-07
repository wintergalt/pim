package com.vgs.pim.ui.mainpanel;

import javax.swing.JPanel

import com.vgs.pim.ui.mainpanel.action.OpenContactsFrameAction

class MainPanel extends JPanel {

	def static actions = [:]

	public MainPanel() {
		loadActions()
	}
	
	private void loadActions() {
		actions.add("openContactsFrameAction", new OpenContactsFrameAction())
	}
	
}
