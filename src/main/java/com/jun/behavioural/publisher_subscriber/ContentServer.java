package com.jun.behavioural.publisher_subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class ContentServer {
	private Map<Topic, List<Subscriber>> subscriberLists;
	private static ContentServer serverInstance;
	public static ContentServer getInstance() {
		if (serverInstance == null) {
			serverInstance = new ContentServer();
		}
		return serverInstance;
	}

	private ContentServer() {
		this.subscriberLists = new HashMap<Topic, List<Subscriber>>();
	}

	public void sendMessage(Topic t, Message m) {
		List<Subscriber> subs = subscriberLists.get(t);
		for (Subscriber s : subs) {
			s.receiveMessage(t, m);
		}
	}

	public void registerSubscriber(Subscriber s, Topic t) {
		if (!subscriberLists.containsKey(t)) {
			System.out.println("Topic " + t.getTopic() + " has not been created yet");
			System.out.println("Topic " + t.getTopic() + " has been added to the category");
			subscriberLists.put(t, new ArrayList<Subscriber>());
			registerSubscriber(s, t);
		} else {
			subscriberLists.get(t).add(s);
			System.out.println("Subscriber " + s.getName() + " successfully starts subscribing " + t.getTopic());
		}
	}
	
	public void showSubscribers(Topic t) {
		ContentServer.getInstance().subscriberLists.get(t).forEach(
				e -> System.out.println(e.getName())
				);
	}

	public static void main(String[] args) {
		ContentServer cs = ContentServer.getInstance();
		Topic sports = new Topic("Sports");
		Topic eSports = new Topic("eSports");
		
		
		Subscriber sub1 = new Subscriber("Jun", eSports, sports);
		Map<Topic, List<Subscriber>> subList = cs.subscriberLists;
	
		Topic snowboarding = new Topic("Snowboarding");
		Publisher pub1 = new Publisher(snowboarding);
		Subscriber sub2 = new Subscriber("Park", snowboarding);
		
		pub1.publish(new Message("Something cool about snowboarding"));
		
		cs.showSubscribers(snowboarding);
	}
}
