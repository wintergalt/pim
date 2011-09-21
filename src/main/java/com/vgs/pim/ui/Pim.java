package com.vgs.pim.ui;

import javax.swing.JFrame;

import com.vgs.pim.model.bo.Appointment;

public class Pim {
	
	public static void main(String[] args) {
		Pim pim = new Pim();
		pim.go();
	}

	private void go() {
		
		Appointment a = new Appointment();
		a.setDescription("lalala");
		System.out.println(a.getDescription());
		
		JFrame frame = new JFrame();
		frame.setContentPane(new MainWindow());
		frame.setTitle(a.getDescription());
		frame.setVisible(true);
	}

}
