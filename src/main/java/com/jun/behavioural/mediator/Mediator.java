package com.jun.behavioural.mediator;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import javafx.scene.Node;

public interface Mediator {

	void deleteNote();
	void addNewNote(Note note);
	void setElementsList(ListModel list);
	void sendToFilter(ListModel listModel);
	void hideElements(boolean flag);
	void saveChange();
	void markNote();
	void getInfoFromList(Note note);
	void clear();
	void registerComponent(Component component);
	void createGUI();

}
