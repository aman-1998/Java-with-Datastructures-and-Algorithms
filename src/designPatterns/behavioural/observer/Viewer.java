package designPatterns.behavioural.observer;

public class Viewer {
	private String ViewerName;
	private String channelName;
	
	public Viewer(String subscriberName) {
		this.ViewerName = subscriberName;
	}
	
	public String getSubscriberName() {
		return ViewerName;
	}

	public void setSubscriberName(String subscriberName) {
		this.ViewerName = subscriberName;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public void update(String videoTitle) {
		System.out.println("Hey! "+ViewerName+" video["+videoTitle+"] uploaded");
	}
	
	@Override
	public String toString() {
		return "Subscriber [subscriberName=" + ViewerName + ", channel=" + channelName + "]";
	}
}
