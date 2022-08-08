package designPatterns.creational.factory;

public class Main {
	public static void main(String[] args) {
//		OperatingSystem os1 = new Android();
//		os1.specification();
//		
//		OperatingSystem os2 = new IOS();
//		os2.specification();
//		
//		OperatingSystem os3 = new Windows();
//		os3.specification();
		
		OSFactory osFactory = new OSFactory();
		OperatingSystem os1 = osFactory.getInstance("openSource");
		OperatingSystem os2 = osFactory.getInstance("secure");
		OperatingSystem os3 = osFactory.getInstance("popular");
		
		os1.specification();
		os2.specification();
		os3.specification();
	}
}
