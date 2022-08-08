package designPatterns.creational.builder;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone("android", "Qualcom Snapdragon 625", "6 GB", "20 Mega px", "4100 mah");
		System.out.println(phone);
		
		PhoneBuilder phoneBuilder = new PhoneBuilder();
		
		Phone phone1 = phoneBuilder.setOs("Android").setBattery("5000 mah").getPhone();
		System.out.println(phone1);
		
		Phone phone2 = phoneBuilder.setOs("IOS").getPhone();
		System.out.println(phone2);
		
		Phone phone3 = phoneBuilder.setOs("Android").setProcessor("Qualcom Snapdragon 636").setBattery("4100 mah").getPhone();
		System.out.println(phone3);
	
	}
}
