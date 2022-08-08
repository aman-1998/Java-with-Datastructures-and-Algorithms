package aggregationAndComposition;

public class Processor {
	
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	
	public Processor() 
	{
		brand = "Intel";
		series = "Core i5 7200u";
		generation = 5;
		cores = 4;
		threads = 8;
		cacheMemory = "4 MB";
		frequency = "2.2 GHz";
	}

	public Processor(String brand, String series, int generation, int cores, int threads, 
			String cacheMemory, String frequency) 
	{
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
	}

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public int getGeneration() {
		return generation;
	}

	public int getCores() {
		return cores;
	}

	public int getThreads() {
		return threads;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public String getFrequency() {
		return frequency;
	}
	
}
