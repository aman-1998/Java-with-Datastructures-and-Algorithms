package designPatterns.behavioural.observer;

public class Main {
	public static void main(String[] args) {
		Viewer aman = new Viewer("Aman");
		Viewer rakshit = new Viewer("Rakshit");
		Viewer akshay = new Viewer("Akshay");
		Viewer ranjeet = new Viewer("Ranjeet");
		Viewer shreya = new Viewer("Shreya");
		
		Channel telusko = new Channel("Telusko");
		
		telusko.subscribe(aman);
		telusko.subscribe(rakshit);
		telusko.subscribe(akshay);
		telusko.subscribe(ranjeet);
		telusko.subscribe(shreya);
		
		telusko.uploadVideo("How to start programming ?");
		System.out.println("-----------------------------------");
		
		telusko.unsubscribe(ranjeet);
		telusko.uploadVideo("How to learn Algorithms ?");
		
		System.out.println("-----------------------------------");
		System.out.println(akshay.getChannelName());
		System.out.println(ranjeet.getChannelName());
	}
}
