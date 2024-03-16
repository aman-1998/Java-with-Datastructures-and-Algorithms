package designPatterns.behavioural.observer;
/*
 * 
 * Usage: To push notification to multiple subscribers so that subscriber don't have to 
 * pull/check multiple times if the video uploaded or not. Example AWS SNS service
 * 
 * Note: Subscribers = Observer
 * Channels = Subject
 * 
 */
public class Main {
	
	private static Subscriber subs1 = new Aman("Aman");
	private static Subscriber subs2 = new Amit("Amit");
	
	private static Channel channel1 = new NeetCode("NeetCode");
	private static Channel channel2 = new NeetCode("Striver");
	
	public static void main(String[] args) {
		
		subscribe(subs1, channel1);
		
		subscribe(subs2, channel1);
		
		subscribe(subs2, channel2);
		
		channel1.videoUpload("Learn LLD");
		
		channel2.videoUpload("Learn HLD");
		
		unsubscribe(subs2, channel1);
		
		channel1.videoUpload("Learn Coding");
	}
	
	public static void subscribe(Subscriber subscriber, Channel channel) {
		subscriber.subscribeChannel(channel);
		channel.subscribe(subscriber);
	}
	
	public static void unsubscribe(Subscriber subscriber, Channel channel) {
		subscriber.unsubscribeChannel(channel);
		channel.unsubscribe(subscriber);
	}
}
