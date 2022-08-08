package aggregationAndComposition;

public class Address 
{
	private String locality;
	private String houseNo;
	private String street;
	private String appartment;
	
	public Address(String locality, String houseNo, String street, String appartment)
	{
		this.locality = locality;
		this.houseNo = houseNo;
		this.street = street;
		this.appartment = appartment;
	}
	
	public String getLocality()
	{
		return locality;
	}
	
	public String getHouseNo()
	{
		return houseNo;
	}

	public String getStreet() 
	{
		return street;
	}

	public String getAppartment() 
	{
		return appartment;
	}
	
	@Override
	public String toString()
	{
		return "Address [" + "Locality = " + locality + ", House No. = " + houseNo
				+ ", Street = " + street + ", appartment = " + appartment + "]";
	}
}
