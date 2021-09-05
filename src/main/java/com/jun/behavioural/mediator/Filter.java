package com.jun.behavioural.mediator;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.*;

public class Filter extends JTextField implements Component{
	private Mediator mediator;
	private ListModel listModel;
	
	public Filter() {
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	};
	
	protected void processComponentKeyEvent(KeyEvent e) {
		String start = getText();
		searchElements(start);
	}

	public void setListMode(ListModel listMode) {
		this.listModel = listMode;
	}

	private void searchElements(String s) {
		if (listenerList == null) {
			return;
		}
		
		if(s.startsWith("")) {
			mediator.setElementsList(listModel);
			return;
		}
		
		ArrayList<Note> notes = new ArrayList<Note>();
		for (int i = 0; i < listModel.getSize(); i++) {
			notes.add((Note) listModel.getElementAt(i));
		}
		DefaultListModel<Note> listModel = new DefaultListModel<Note>();
		for (Note note : notes) {
			if(note.getName().contains(s)) {
				listModel.addElement(note);
			}
		}
		mediator.setElementsList(listModel);
	}
	
	@Override
	public String getName() {
		return "Filter";
	}
	
}
