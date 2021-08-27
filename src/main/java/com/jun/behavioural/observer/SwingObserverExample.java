package com.jun.behavioural.observer;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;

	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go() {
		frame = new JFrame();
		
		JButton button = new JButton("Should I do it?");
		button.addActionListener(event -> System.out.println("Don't do it, you might regret it"));
		button.addActionListener(event -> System.out.println("Come on, do it!"));
		
	    frame.setVisible(true);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
	}
}
