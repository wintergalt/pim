package com.vgs.pim.ui.mainpanel

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener

import groovy.util.logging.Log

@Log
class PimWindowListener implements WindowListener {

	@Override
	void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	void windowClosing(WindowEvent e) {
		log.info("Window closing...")
	}

	@Override
	void windowClosed(WindowEvent e) {
		log.info("Window closed...")
	}

	@Override
	void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
