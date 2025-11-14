package com.proxy.virtual.albumcover;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

public class ImageIcon implements Icon {
	
	private URL imageURL;
	private javax.swing.ImageIcon swingIcon;
	

	public ImageIcon(URL imageURL, String description) {
		this.imageURL = imageURL;
		try {
			swingIcon = new javax.swing.ImageIcon(imageURL, description);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getIconWidth() {
		if(swingIcon != null) return swingIcon.getIconWidth();
		else return 800;
	}


	@Override
	public int getIconHeight() {
		if(swingIcon != null) return swingIcon.getIconHeight();
		else return 600;
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		if(swingIcon != null) {
			Image img = swingIcon.getImage();
			g.drawImage(img, x, y, c);
		}
		
	}
	
	public javax.swing.ImageIcon getImageIcon() {
		return swingIcon;
	}

}
