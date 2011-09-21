package com.vgs.pim.ui;

import java.awt.BorderLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JToolBar;

public class MainWindow extends JPanel {
	
	public MainWindow() {

		JMenuBar menuBar = new JMenuBar();
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmOpen = new JMenuItem("Open...");
		mnFile.add(mntmOpen);

		JSeparator separator = new JSeparator();
		mnFile.add(separator);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);

		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		JMenu mnTools = new JMenu("Tools");
		menuBar.add(mnTools);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmHelpContents = new JMenuItem("Help contents");
		mnHelp.add(mntmHelpContents);

		JSeparator separator_1 = new JSeparator();
		mnHelp.add(separator_1);

		JMenuItem mntmAbout = new JMenuItem("About...");
		mnHelp.add(mntmAbout);

		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);

		add(menuBar, BorderLayout.NORTH);
	}

}
