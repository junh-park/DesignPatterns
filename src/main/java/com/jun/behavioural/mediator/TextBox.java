package com.jun.behavioural.mediator;

import java.awt.event.KeyEvent;

import javax.swing.JTextArea;

public class TextBox extends JTextArea implements Component{
	private Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	protected void processComponentKeyEvent(KeyEvent e) {
		mediator.markNote();
	}

	@Override
	public String getName() {
		return "TextBox";
	}
}
