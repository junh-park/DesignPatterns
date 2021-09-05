package com.jun.behavioural.mediator;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class DeleteButton extends JButton implements Component{
	private Mediator mediator;
	
	public DeleteButton() {
		super("Del");
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	};
	
	protected void fireActionPerformed(ActionEvent event) {
		mediator.deleteNote();
	}
	
	@Override
	public String getName() {
		return "DelButton";
	}
}
