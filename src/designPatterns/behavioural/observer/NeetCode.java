package designPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class NeetCode implements Channel {
	
	private String channelName;
	private List<Subscriber> subscribers = new ArrayList<>();
	private List<String> videos = new ArrayList<>();
	
	public NeetCode(String channelName) {
		this.channelName = channelName;
	}
	
	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}
	
	@Override
	public void videoUpload(String titleOfVideo) {
		videos.add(titleOfVideo);
		subscribers.stream().forEach(subscriber -> subscriber.update(this.channelName, titleOfVideo));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channelName == null) ? 0 : channelName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NeetCode other = (NeetCode) obj;
		if (channelName == null) {
			if (other.channelName != null)
				return false;
		} else if (!channelName.equals(other.channelName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NeetCode [channelName=" + channelName + ", subscribers=" + subscribers + ", videos=" + videos + "]";
	}
	
}
