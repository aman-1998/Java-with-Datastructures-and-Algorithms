package stringConcept;

public class Car {
	
	String model;
	boolean AWD;
	String type;
	String company;
	
	public Car(String model, boolean AWD, String type, String company)
	{
		this.model = model;
		this.AWD = AWD;
		this.type = type;
		this.company = company;
	}
	
	public String getModel()
	{
		return this.model;
	}

	public boolean isAWD() {
		return AWD;
	}

	public String getType() {
		return type;
	}

	public String getCompany() {
		return company;
	}
	
	public boolean equals(Car car)
	{
		boolean first = this.model.equals(car.model);
		boolean second = this.AWD == car.AWD;
		boolean third = this.type.equals(car.type);
		boolean fourth = this.company.equals(car.company);
		
		return first && second && third && fourth;
	}

	public String toString() {
		return "Car [model=" + model + ", AWD=" + AWD + ", type=" + type + ", company=" + company + "]";
	}

}
