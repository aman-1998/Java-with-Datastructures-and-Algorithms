package java_8_features;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Student {
	private int roll;
	private String name;
	
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}
	
}

class Marks {
	private int marks;
	
	public Marks(int marks) {
		this.marks = marks;
	}
	
	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Marks [marks=" + marks + "]";
	}
}

class MeterReading {
	
	private Instant instant;
	private BigDecimal reading;
	
	public MeterReading(Instant instant, BigDecimal reading) {
		super();
		this.instant = instant;
		this.reading = reading;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}

	public BigDecimal getReading() {
		return reading;
	}

	public void setReading(BigDecimal reading) {
		this.reading = reading;
	}
}

public class Stream_N12 {
	public static void main(String[] args) {
		Map<Student, Marks> linkedhMap = new LinkedHashMap<>();
		
		linkedhMap.put(new Student(123, "Pritha Das"), new Marks(96));
		linkedhMap.put(new Student(145, "Dinesh Das"), new Marks(88));
		linkedhMap.put(new Student(152, "Manpreet Singh"), new Marks(82));
		linkedhMap.put(new Student(138, "Aman Mishra"), new Marks(92));
		linkedhMap.put(new Student(162, "Ayan Gupta"), new Marks(72));
		linkedhMap.put(new Student(141, "Gagan Yadav"), new Marks(100));
		linkedhMap.put(new Student(122, "Neha Khandewal"), new Marks(45));
		
		linkedhMap.entrySet().stream()
							 .sorted((entry1, entry2) -> entry1.getKey().getRoll() > entry2.getKey().getRoll() ? 1 : -1)
							 .forEach(entry -> System.out.println(entry));
		
		System.out.println("----------------------------------------------");
		
		linkedhMap.entrySet()
				  .stream()
				  .sorted(Comparator.comparing(entry -> entry.getValue().getMarks()))
				  .forEach(entry -> System.out.println(entry));
		
		System.out.println("----------------------------------------------");
		
		linkedhMap.entrySet()
				  .stream()
				  .sorted(Comparator.comparing(entry -> -(entry.getValue().getMarks()))) // Note: (-) is used for descending order of marks
				  .forEach(entry -> System.out.println(entry));
		
		linkedhMap.entrySet()
		          .stream()
		          .sorted(Comparator.comparing((Map.Entry<Student, Marks> entry) -> entry.getValue().getMarks()).reversed())
		          .forEach(entry -> System.out.println(entry));
		
		System.out.println("----------------------------------------------");
		
		linkedhMap.entrySet()
				  .stream()
				  .sorted(Comparator.comparing(entry -> entry.getKey().getName()))
				  .forEach(entry -> System.out.println(entry));
		
		System.out.println("----------------------------------------------");
		
		List<MeterReading> listOfMeterReading = Arrays.asList(new MeterReading(Instant.parse("2022-06-09T14:02:06.764299800Z"), BigDecimal.valueOf(1.567)),
															  new MeterReading(Instant.parse("2022-06-09T14:02:16.764299800Z"), BigDecimal.valueOf(2.102)),
															  new MeterReading(Instant.parse("2022-06-09T14:02:26.764299800Z"), BigDecimal.valueOf(0.319)),
															  new MeterReading(Instant.parse("2022-06-09T14:02:36.764299800Z"), BigDecimal.valueOf(1.071)),
															  new MeterReading(Instant.parse("2022-06-09T14:02:46.764299800Z"), BigDecimal.valueOf(1.777)),
															  new MeterReading(Instant.parse("2022-06-09T14:02:56.764299800Z"), BigDecimal.valueOf(2.812)),
															  new MeterReading(Instant.parse("2022-06-09T14:03:06.764299800Z"), BigDecimal.valueOf(1.723)),
															  new MeterReading(Instant.parse("2022-06-09T14:03:16.764299800Z"), BigDecimal.valueOf(1.312)));
		
		BigDecimal sumOfReadings = listOfMeterReading.stream()
													 .map(meterReading -> meterReading.getReading())
													 .reduce(BigDecimal.ZERO, (result, accumulator) -> result.add(accumulator));
		
		System.out.println("Sum of readings = "+sumOfReadings);
		
		System.out.println("----------------------------------------------");
		
		BigDecimal averagePowerConsumptionAtAnyInstant = sumOfReadings.divide(BigDecimal.valueOf(listOfMeterReading.size()), RoundingMode.HALF_UP);
		
		System.out.println("Average power consumption = "+averagePowerConsumptionAtAnyInstant);
		
		Instant minInstant = listOfMeterReading.stream()
											   .min(Comparator.comparing(meterReading -> meterReading.getInstant()))
											   .get()
											   .getInstant();
		
		Instant maxInstant = listOfMeterReading.stream()
											   .max(Comparator.comparing(meterReading -> meterReading.getInstant()))
											   .get()
											   .getInstant();
		
		System.out.println("----------------------------------------------");
		System.out.println("Min instant = "+minInstant);
		System.out.println("Max instant = "+maxInstant);
		System.out.println("----------------------------------------------");
		
		Duration timeElapsed = Duration.between(minInstant, maxInstant);
		BigDecimal timeElapsedInHours = BigDecimal.valueOf(timeElapsed.getSeconds() / 3600.0);
		System.out.println("Time Elapsed = "+timeElapsedInHours);
		
		System.out.println("----------------------------------------------");
		
		BigDecimal averageEnergy = averagePowerConsumptionAtAnyInstant.multiply(timeElapsedInHours).setScale(2, RoundingMode.HALF_UP);
		System.out.println("Average Energy = "+averageEnergy);
		
		System.out.println("----------------------------------------------");
		
		BigDecimal unitRate = BigDecimal.valueOf(0.2);
		BigDecimal costOfConsumption = averageEnergy.multiply(unitRate);
		System.out.println("Cost of consumption for elapsed time = Rs."+costOfConsumption);
		
		
		Instant anyInstant = listOfMeterReading.stream().map(meterReading -> meterReading.getInstant()).findAny().get();
		
		LocalDateTime dateTime = LocalDateTime.ofInstant(anyInstant, ZoneOffset.UTC);
		
		BigDecimal price = getPrice(dateTime, unitRate);
		
		BigDecimal costOfConsumptionDayBasis = averageEnergy.multiply(price);
		System.out.println("Cost of consumption for elapsed time on the basis of day = Rs."+costOfConsumptionDayBasis);
	}

	private static BigDecimal getPrice(LocalDateTime dateTime, BigDecimal unitRate) {
		if(dateTime.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
			return unitRate.multiply(BigDecimal.valueOf(0.2));
		} else if(dateTime.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
			return unitRate.multiply(BigDecimal.valueOf(0.5));
		} else if(dateTime.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)) {
			return unitRate.multiply(BigDecimal.valueOf(0.3));
		} else if(dateTime.getDayOfWeek().equals(DayOfWeek.THURSDAY)) {
			return unitRate.multiply(BigDecimal.valueOf(0.7));
		} else if(dateTime.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			return unitRate.multiply(BigDecimal.valueOf(0.8));
		} else if(dateTime.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			return unitRate.multiply(BigDecimal.valueOf(0.4));
		} else if(dateTime.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			return unitRate.multiply(BigDecimal.valueOf(0.6));
		}
		
		return unitRate;
	}
}
