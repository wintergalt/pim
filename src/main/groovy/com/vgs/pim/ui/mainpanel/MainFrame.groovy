package com.vgs.pim.ui.mainpanel

import java.awt.BorderLayout

import javax.swing.JDesktopPane
import javax.swing.JFrame

import com.vgs.pim.ui.mainpanel.action.OpenContactsFrameAction

class MainFrame extends JFrame {
	
	def static actions = [:]
	
	public MainFrame(JDesktopPane desktop) {
		loadActions()
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE)
		setSize(600, 400)
		setJMenuBar(new MainMenu())
		getContentPane().add(new MainToolbar(this), BorderLayout.PAGE_START)
		getContentPane().add(desktop)
		setVisible(true)
		addWindowListener(new PimWindowListener())
	}
	
	private void loadActions() {
		actions.put("openContactsFrameAction", new OpenContactsFrameAction())
	}

}
