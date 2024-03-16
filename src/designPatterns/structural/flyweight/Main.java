package designPatterns.structural.flyweight;
/*
 * Pros:
 * 1. Used for memory optimization.
 * 
 * Cons:
 * Apply when required only otherwise code becomes very complicated and difficult to 
 * understand as it involves Pattern inside Pattern.
 * 
 * Usage: Used for Memory optimization. If we have already created an object. 
 * Then next time we don't create the same object again and again. We just use 
 * the already created object change it's extrinsic properties and use it. 
 * Intrinsic property remains same.
 * 
 * 
 * 
 */
public class Main {
	
	private static final String colours[] = {"Green", "Red", "Orange", "Yellow"};
	private static final String urls[] = {"url1", "url2", "url3", "url4", "url5", "url6"};
	
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			String color = colours[(int)(Math.random() * (colours.length))];
			String url = urls[(int)(Math.random() * (urls.length))];
			
			Ball ball = BallFactory.getBall(color, url);
			
			ball.setX(i);
			ball.setY(i);
			ball.setRadius(2*i);
			
			ball.draw();
		}
	}
}
