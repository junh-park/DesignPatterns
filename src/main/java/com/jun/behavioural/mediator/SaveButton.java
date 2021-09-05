package com.jun.behavioural.mediator;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class SaveButton extends JButton implements Component {
	private Mediator mediator;

	public SaveButton() {
		super("Save");
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	protected void fireActionPerformed(ActionEvent event) {
		mediator.saveChange();
	}
	
	public String getName() {
		return "SaveButton";
	}

}
