package designPatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BallFactory {

	private static Map<String, Ball> cache = new HashMap<>();
	
	public static Ball getBall(String color, String url) {
		
		Ball ball = cache.get(color+url);
		if(ball == null) {
			ball = new Ball(color, url); 
			cache.put(color+url, ball);
		}
		
		return ball;
		
	}
	
}
