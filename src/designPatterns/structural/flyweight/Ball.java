package designPatterns.structural.flyweight;

public class Ball {
	
	private String color; // intrinsic attributes
	private String imageUrl; // intrinsic attributes
	
	private int x; // extrinsic attributes
	private int y; // extrinsic attributes
	private int radius; // extrinsic attributes
	
	public Ball(String color, String imageUrl) {
		super();
		this.color = color;
		this.imageUrl = imageUrl;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	// Logic to draw ball
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		
		String drawn = toString();
		System.out.println(drawn);
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + ", imageUrl=" + imageUrl + ", x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	
}
