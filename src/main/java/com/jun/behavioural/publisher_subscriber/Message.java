package com.jun.behavioural.publisher_subscriber;

public class Message {
	String message;
	
	public Message(String string) {
		this.message = string;
	}

	public void showPushAlarm(Topic t) {
		System.out.println(t.getTopic() + " has been updated: " + this.message);
	}

}
