package designPatterns.behavioural.observer;

public interface Subscriber {
	
	void subscribeChannel(Channel channel);
	
	void unsubscribeChannel(Channel channel);
	
	void update(String channelName, String title);
}
