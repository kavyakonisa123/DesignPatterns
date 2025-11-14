package com.proxy.virtual.albumcover;

import java.awt.Graphics;

import javax.swing.JComponent;

public class ImageComponent extends JComponent{
	private static final long serialVersionUID = 1L;
	private Icon icon;

	public ImageComponent(Icon icon) {
		this.icon = icon;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int h= icon.getIconHeight();
		int w= icon.getIconWidth();
		int x= (800-w)/2;
		int y= (600-h)/2;
		icon.paintIcon(this, g, x, y);
		
	}
	
	

}
