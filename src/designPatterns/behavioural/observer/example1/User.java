package designPatterns.behavioural.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private int userId;
	private String userName;
	private List<Channel> subscribedChannels = new ArrayList<>();
	
	public User(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public void subscribe(Channel channel) {
		subscribedChannels.add(channel);
		channel.getSubscribers().add(this);
	}
	
	public void notify(String channelName, String videoTitle) {
		System.out.println("Hi " + userName + "! Video uploaded on " + channelName
				+ " with title " + videoTitle);
	}
}
