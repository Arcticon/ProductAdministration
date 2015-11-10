package de.arcticon.main;

import de.arcticon.gui.MainGui;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			MainGui frame = new MainGui();
			frame.setVisible(true);
			frame.setAlwaysOnTop(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}