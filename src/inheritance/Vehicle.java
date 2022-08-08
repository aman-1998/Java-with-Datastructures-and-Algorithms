package inheritance;

public class Vehicle
{
	public String transportation()
	{
		return "It is used for transportation";
	}
	
	public String fuel()
	{
		return "It needs fuel to move";
	}
	
	public String Engine()
	{
		return "It has an engine";
	}
}

class Car extends Vehicle
{
	public String wheels()
	{
		return "It has 4 wheels";
	}
	
	public String doors()
	{
		return "It has doors";
	}

	@Override
	public String toString() {
		return "Car [wheels()=" + wheels() + ", doors()=" + doors() + ", transportation()=" + transportation()
				+ ", fuel()=" + fuel() + ", Engine()=" + Engine() + "]";
	}
}

class Bike extends Vehicle
{
	public String wheels()
	{
		return "It has 2 wheels";
	}
	
	public String doors()
	{
		return "It doesn't have any door";
	}

	@Override
	public String toString() {
		return "Bike [wheels()=" + wheels() + ", doors()=" + doors() + ", transportation()=" + transportation()
				+ ", fuel()=" + fuel() + ", Engine()=" + Engine() + "]";
	}
}
