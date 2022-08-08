package stringConcept;

public class toString_vs_valueOf_N4 
{
	public static void main(String[] args)
	{
		Bike bike = new Bike("ZMR", "Karishma");
		String str1 = bike.toString();
		System.out.println(str1);
		System.out.println(bike);
		System.out.println(bike.getClass().getSimpleName());
		
		String str2 = String.valueOf(bike);
		System.out.println(str2);
		
		Float f = new Float(12.7);
		String strf1 = f.toString();
		System.out.println(strf1);
		
		String strf2 = String.valueOf(f);
		System.out.println(strf2);
	}
}

class Bike
{
	private String model;
	private String company;
	
	public Bike(String model, String company)
	{
		this.model = model;
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	/*
	public String toString()
	{
		return "bike";
	}*/
}
