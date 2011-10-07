package com.vgs.pim.ui;

import groovy.util.logging.Log

import java.beans.PropertyVetoException
import java.util.prefs.Preferences

import javax.swing.JDesktopPane
import javax.swing.JInternalFrame

import com.vgs.pim.ui.mainpanel.MainFrame

@Log
class Pim {

	private static Preferences userPreferences
	static Pim currentInstance
	private JDesktopPane desktop
	private MainFrame mainFrame
	

	public static void main(String[] args) {
		currentInstance = new Pim()
		currentInstance.go()
	}

	private Pim() {
	}

	private void go() {
		loadPreferences()
		setDefaultPreferences()
		desktop = new JDesktopPane()
		mainFrame = new MainFrame(desktop)
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

	public void showFrame(JInternalFrame internalFrame) {
		internalFrame.setVisible(true)
		desktop.add(internalFrame)
		try {
			internalFrame.setSelected(true)
			internalFrame.pack()
			mainFrame.pack()
		} catch(PropertyVetoException pve) {
			log.info("Error showing frame: " + internalFrame.getClass(), pve)
		}
	}
	
}
