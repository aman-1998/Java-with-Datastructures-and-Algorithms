package designPatterns.behavioural.observer;

public interface Channel {
	
	void subscribe(Subscriber subscriber);
	
	void unsubscribe(Subscriber subscriber);
	
	void videoUpload(String titleOfVideo);
}
