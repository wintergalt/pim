package com.vgs.pim.ui.mainpanel;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class MainMenu extends JMenuBar {
	
	public MainMenu() {
		
		JMenu mnFile = new JMenu("File");
		add(mnFile);

		JMenuItem mntmOpen = new JMenuItem("Open...");
		mnFile.add(mntmOpen);

		JSeparator separator = new JSeparator();
		mnFile.add(separator);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);

		JMenu mnEdit = new JMenu("Edit");
		add(mnEdit);

		JMenuItem mntmContacts = new JMenuItem("Contacts");
		mnEdit.add(mntmContacts);

		JMenu mnTools = new JMenu("Tools");
		add(mnTools);

		JMenu mnHelp = new JMenu("Help");
		add(mnHelp);

		JMenuItem mntmHelpContents = new JMenuItem("Help contents");
		mnHelp.add(mntmHelpContents);

		JSeparator separator_1 = new JSeparator();
		mnHelp.add(separator_1);

		JMenuItem mntmAbout = new JMenuItem("About...");
		mnHelp.add(mntmAbout);

	}

}
