package encapsulation;

public class Person {
	
	private int age;
	private String name;
	private String bloodGroup;
	private int heightInMeters;
	
	public void setAge(int age)
	{
		if(age <= 0)
			System.out.println("Invalid Age");
		else
			this.age = age;
	}
	
	public void setName(String name) 
	{
		for(int i=0; i<=name.length()-1; i++)
		{
			if(name.charAt(i) == '0' || name.charAt(i) == '1' || name.charAt(i) == '2' || name.charAt(i) == '3' || 
					name.charAt(i) == '4' || name.charAt(i) == '5' || name.charAt(i) == '6' || name.charAt(i) == '7'
					 || name.charAt(i) == '8' || name.charAt(i) == '9')
			{
				System.out.println("Invalid Name");
				return;
			}
		}
		this.name = name;
	}

	public void setBloodGroup(String bloodGroup) {
		if(bloodGroup.equals("AB+") || bloodGroup.equals("AB-") || bloodGroup.equals("A+")
				 || bloodGroup.equals("A-") || bloodGroup.equals("B+") || 
				 bloodGroup.equals("B-") || bloodGroup.equals("O+") || bloodGroup.equals("O-"))
			this.bloodGroup = bloodGroup;
		else
			System.out.println("Invalid Blood Group");
			
	}

	public void setHeightInMeters(int heightInMeters) {
		
		if(heightInMeters <= 0)
			System.out.println("Invalid height");
		else
			this.heightInMeters = heightInMeters;
	}

	public void showInfo()
	{
		System.out.println("Name - "+name+"\nAge  = "+age+"\nBlood Group = "+bloodGroup+
				"\nHeight = "+heightInMeters+" m");
	}
}
