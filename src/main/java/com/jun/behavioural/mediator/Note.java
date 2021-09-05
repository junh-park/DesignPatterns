package com.jun.behavioural.mediator;

public class Note {
	private String name;
	private String text;
	
	public Note() {
		name = "New note";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getName() {
		return name;
	}
	
	public String getText() {
		return text;
	}
	
	public String toString() {
		return name;
	}
}
