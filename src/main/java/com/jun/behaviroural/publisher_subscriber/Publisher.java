package com.jun.behaviroural.publisher_subscriber;

public class Publisher {
	private Topic topic;

	public Publisher(Topic t) {
		this.topic = t;
	}
	
	public void publish(Message m) {
		ContentServer.getInstance().sendMessage(this.topic, m);
	}
}
