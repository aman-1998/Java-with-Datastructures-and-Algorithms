package designPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Channel {
	private List<Viewer> subscribers = new LinkedList<>();
	private String channelName;
	private List<String> videos = new ArrayList<>();
	
	public Channel(String channelName) {
		this.channelName = channelName;
	}

	public List<Viewer> getSubscribers() {
		return subscribers;
	}
	
	public void setSubscribers(List<Viewer> subscribers) {
		this.subscribers = subscribers;
	}
	
	public String getChannelName() {
		return channelName;
	}
	
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	@Override
	public String toString() {
		return "Channel [subscribers=" + subscribers + ", channelName=" + channelName + "]";
	}
	
	public void uploadVideo(String videoTitle) {
		this.videos.add(videoTitle);
		for(Viewer sb : subscribers) {
			sb.update(videoTitle);
		}
	}
	
	public void subscribe(Viewer sb) {
		sb.setChannelName(this.channelName);
		subscribers.add(sb);
	}
	
	public void unsubscribe(Viewer sb) {
		subscribers.remove(sb);
		sb.setChannelName(null);
	}
}
