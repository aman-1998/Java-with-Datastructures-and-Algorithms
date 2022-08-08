package aggregationAndComposition;

public class Laptop {
	
	private float screen;
	private String ram;
	private Processor processor;
	private String hardDrive;
	private Graphics_card graphicsCard;
	
	public Laptop() 
	{
		screen = 15.6f;
		ram = "4 GB";
		processor = new Processor();
		hardDrive = "1 TB";
		graphicsCard = new Graphics_card();
	}

	public Laptop(float screen, String ram, Processor processor, String hardDrive, 
			Graphics_card graphicsCard) 
	{
		this.screen = screen;
		this.ram = ram;
		this.processor = processor;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
	}
	
	public void laptopInfo()
	{
		System.out.println("\nLaptop Information :-\n");
		System.out.println("Screen = "+screen+"\nRAM = "+ram+"\nHrad Drive = "+hardDrive);
		System.out.println("\n<-----Processor Info----->");
		System.out.println("Brand = "+processor.getBrand()+"\nSeries = "+processor.getSeries()+
				"\nGeneration = "+processor.getGeneration()+"\nCores = "+processor.getCores()+
				"\nThreads = "+processor.getThreads()+"\nCache Memory = "
				+processor.getCacheMemory()+"\nFrequency = "+processor.getFrequency());
		System.out.println("\n<------Graphics Card----->");
		System.out.println("Brand = "+graphicsCard.getBrand()+"\nSeries = "+
		graphicsCard.getSeries()+"\nMemory = "+graphicsCard.getMemory());
		System.out.println("---------------X-------------X---------------");
	}
}
