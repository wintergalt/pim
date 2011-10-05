package com.vgs.pim.ui.util;

import groovy.util.logging.Log;
import groovy.util.logging.Log4j;

import java.net.URL;

import javax.swing.ImageIcon;

import com.vgs.pim.ui.Pim;

@Log
class UiUtils {

	public static ImageIcon getIcon(String imageName, Object o) {
		String imagePath = "com/vgs/pim/ui/images/" + imageName
		ClassLoader cl = o.getClass().getClassLoader()
		URL url = cl.getResource(imagePath)
		return new ImageIcon(url)
	}

	public static String getMessage(String key) {
		Locale locale = new Locale(Pim.getUserPreferences().get("lang", "ES").toLowerCase())
		ResourceBundle captions = ResourceBundle.getBundle(
				"com.vgs.pim.ui.messages",locale)
		captions.getString(key)
	}
}
