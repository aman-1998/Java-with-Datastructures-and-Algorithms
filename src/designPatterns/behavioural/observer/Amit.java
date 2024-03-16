package designPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Amit implements Subscriber {
	
	private String name;
	private List<Channel> channels = new ArrayList<>();
	
	public Amit(String name) {
		this.name = name;
	}
	
	@Override
	public void subscribeChannel(Channel channel) {
		channels.add(channel);
	}
	
	@Override
	public void unsubscribeChannel(Channel channel) {
		channels.remove(channel);
	}
	
	@Override
	public void update(String channelName, String title) {
		System.out.println("Hi " + name + "! Video uploaded on " + channelName + ": " + title);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Amit other = (Amit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subscriber [name=" + name + ", channels=" + channels + "]";
	}
	
}
