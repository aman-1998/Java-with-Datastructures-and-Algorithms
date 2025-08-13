package designPatterns.behavioural.observer.example1;

import java.util.ArrayList;
import java.util.List;

public abstract class Channel {
	
	private int channelId;
	private String channelName;
	private List<Video> listOfVideo = new ArrayList<>();
	private List<User> subscribers = new ArrayList<>();
	
	public Channel(int channelId, String channelName) {
		this.channelId = channelId;
		this.channelName = channelName;
	}
	
	public abstract void uploadVideo(Video title);
	
	public abstract void deleteVideo(String title);

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public List<Video> getListOfVideo() {
		return listOfVideo;
	}

	public void setListOfVideo(List<Video> listOfVideo) {
		this.listOfVideo = listOfVideo;
	}

	public List<User> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<User> subscribers) {
		this.subscribers = subscribers;
	}
	
	
}
