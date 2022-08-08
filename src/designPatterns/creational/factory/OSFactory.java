package designPatterns.creational.factory;

public class OSFactory {
	public OperatingSystem getInstance(String type) {
		if(type.equals("openSource")) {
			return new Android();
		} else if(type.equals("secure")) {
			return new IOS();
		} else {
			return new Windows();
		}
	}
}
