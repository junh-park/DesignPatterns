package com.jun.structural.proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
	volatile ImageIcon imageIcon;
	final URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;

	public ImageProxy(URL url) {
		imageURL = url;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading album cover, please wait...", x+300, y+190);
			if (!retrieving) {
				retrieving = true;
				new Thread(new Runnable() {
					public void run() {
						setImageIcon(new ImageIcon(imageURL, "Album Cover"));
						c.repaint();
					}
				});
				retrievalThread.start();
			}
		}
	}

	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		} else {
			return 800;
		}
	}

	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		} else {
			return 600;
		}
	}

	synchronized public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
}
