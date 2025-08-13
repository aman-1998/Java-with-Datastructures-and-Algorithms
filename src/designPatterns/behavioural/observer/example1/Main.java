package designPatterns.behavioural.observer.example1;

public class Main {
	
	public static void main(String[] args) {
		
		Channel channel1 = new Striver(123, "Striver");
		Channel channel2 = new Striver(124, "NeetCode");
		
		User user1 = new User(1, "Aman");
		User user2 = new User(2, "Alok");
		User user3 = new User(3, "Vijaya");
		
		user1.subscribe(channel1);
		user1.subscribe(channel2);
		
		user3.subscribe(channel1);
		
		System.out.println("-----------------------------------------");
		
		Video video1 = new Video("Spring Boot crash course", 60);
		channel1.uploadVideo(video1);
		Video video2 = new Video("Java crash course", 120);
		channel1.uploadVideo(video2);
		
		
		Video video3 = new Video("WebSockets Crash course", 30);
		channel2.uploadVideo(video3);
		Video video4 = new Video("REST API", 180);
		channel2.uploadVideo(video3);
		
	}
}
