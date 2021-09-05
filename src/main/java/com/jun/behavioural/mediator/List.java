package com.jun.behavioural.mediator;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class List extends JList implements Component {
	private Mediator mediator;
	private final DefaultListModel LIST_MODEL;

	public List(DefaultListModel listModel) {
		super(listModel);
		this.LIST_MODEL = listModel;
		setModel(listModel);
		this.setLayoutOrientation(JList.VERTICAL);
		Thread thread = new Thread(new Hide(this));
		thread.start();
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void addElement(Note note) {
		LIST_MODEL.addElement(note);
		int index = LIST_MODEL.size() - 1;
		setSelectedIndex(index);
		ensureIndexIsVisible(index);
		mediator.sendToFilter(LIST_MODEL);
	}

	public void deleteElement() {
		int index = this.getSelectedIndex();
		LIST_MODEL.remove(index);
		mediator.sendToFilter(LIST_MODEL);
	}

	public Note getCurrentElement() {
		return (Note) getSelectedValue();
	}

	public String getName() {
		return "List";
	}

	private class Hide implements Runnable {
		private List list;

		public Hide(List list) {
			this.list = list;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (list.isSelectionEmpty()) {
					mediator.hideElements(true);
				} else {
					mediator.hideElements(false);
				}
			}
		}
	}
}
