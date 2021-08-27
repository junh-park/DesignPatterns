package com.jun.behaviroural.publisher_subscriber;

public class Subscriber {
	private String name;

	public Subscriber(String name, Topic...topics) {
		this.name = name;
		for (Topic topic : topics) {
			ContentServer.getInstance().registerSubscriber(this, topic);
		}
	}

	public void receiveMessage(Topic t, Message m) {
		m.showPushAlarm(t);
	}
	
	public String getName() {
		return name;
	}
}
