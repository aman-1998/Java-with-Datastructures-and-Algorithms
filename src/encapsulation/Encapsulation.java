package encapsulation;

public class Encapsulation {
	
	public static void main(String args[])
	{
		Person person = new Person();
		/*
		person.name = "Aman Kumar Mishra";
		person.age = -23;
		person.bloodGroup = "AB+";
		person.heightInMeters = 177;
		*/
		person.setAge(26);
		person.setBloodGroup("AB");
		person.setHeightInMeters(177);
		person.setName("Aman Mishra");
		person.showInfo();
	}

}
