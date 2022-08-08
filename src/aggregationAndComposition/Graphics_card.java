package aggregationAndComposition;

public class Graphics_card {
	
	private String brand;
	private int series;
	private String memory;
	
	public Graphics_card()
	{
		brand = "Nvidia";
		series = 940;
		memory = "2 GB";
	}
	
	public Graphics_card(String brand, int series, String memory)
	{
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	public String getBrand() {
		return brand;
	}

	public int getSeries() {
		return series;
	}

	public String getMemory() {
		return memory;
	}

}
