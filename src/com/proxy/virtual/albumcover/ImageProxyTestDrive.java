package com.proxy.virtual.albumcover;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.*;

public class ImageProxyTestDrive {
	ImageComponent imagecomponent;
	JFrame frame = new JFrame("Album Cover Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> albums = new Hashtable<String, String>();
	
	public static void main(String[] args) throws Exception {
		
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}
	
	public ImageProxyTestDrive() throws Exception {
		albums.put("Headfirst Design Patterns", "https://m.media-amazon.com/images/I/41Qcf84mmvL._AC_UF350,350_QL80_.jpg");
		albums.put("Headfirst Java", "https://m.media-amazon.com/images/I/9155wsDnIFL._AC_UF1000,1000_QL80_.jpg");
		albums.put("Headfirst Programming", "https://m.media-amazon.com/images/I/81iAn8ChDHL._AC_UF1000,1000_QL80_.jpg");
		albums.put("Headfirst HTML and CSS", "https://m.media-amazon.com/images/I/813Y++AElDL._AC_UF1000,1000_QL80_.jpg");
		URL initialURL = new URL((String) albums.get("Headfirst Design Patterns"));
		menuBar = new JMenuBar();
		menu = new JMenu("Favorite albums");
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		
		for(Enumeration e = albums.keys(); e.hasMoreElements();) {
			String name = (String) e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem);
			menuItem.addActionListener(event -> {
				imagecomponent.setIcon(
						new ImageProxy(getAlbumUrl(event.getActionCommand())));
				frame.repaint();				
			});
			
		}
		
		
		Icon icon = new ImageProxy(initialURL);
		imagecomponent = new ImageComponent(icon);
		frame.getContentPane().add(imagecomponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
		
		
		}



	 URL getAlbumUrl(String name) {
		try {
			return new URL((String) albums.get(name));
		}
		catch(MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}




	
	
	

}
