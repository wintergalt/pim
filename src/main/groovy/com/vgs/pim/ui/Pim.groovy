package com.vgs.pim.ui;

import java.awt.BorderLayout
import java.util.prefs.Preferences

import javax.swing.JFrame

import com.vgs.pim.ui.mainpanel.MainMenu
import com.vgs.pim.ui.mainpanel.MainPanel
import com.vgs.pim.ui.mainpanel.MainToolbar

class Pim {

	private static Preferences userPreferences;

	public static void main(String[] args) {
		Pim pim = new Pim()
		pim.go()
	}

	private void go() {
		loadPreferences()
		setDefaultPreferences()
		JFrame frame = new JFrame()
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		frame.setContentPane(new MainPanel())
		frame.setSize(600, 400)
		frame.setJMenuBar(new MainMenu())
		frame.add(new MainToolbar(), BorderLayout.PAGE_START)
		frame.setVisible(true)
	}

	private void setDefaultPreferences() {
		if (userPreferences.get("lang", null) == null) {
			userPreferences.put("lang", "ES")
		}
	}

	private void loadPreferences() {
		userPreferences = Preferences.userRoot()
	}

	public static Preferences getUserPreferences() {
		return userPreferences
	}
}
