package java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Stream_N13 {
	
	public static void main(String[] args) {
		
		List<Worker> listOfWorker = new ArrayList<>();
		listOfWorker.add(new Worker(1, "Aman", "Payments", 28));
		listOfWorker.add(new Worker(2, "Sumit", "Refund", 32));
		listOfWorker.add(new Worker(3, "Raju", "Sales", 28));
		listOfWorker.add(new Worker(4, "Jyoti", "HR", 29));
		listOfWorker.add(new Worker(5, "Amit", "Refund", 28));
		listOfWorker.add(new Worker(6, "Sonia", "HR", 25));
		listOfWorker.add(new Worker(7, "Shyam", "Payments", 30));
		listOfWorker.add(new Worker(5, "Amit", "Refund", 28));
		listOfWorker.add(new Worker(8, "Oindrila", "Sales", 27));
		listOfWorker.add(new Worker(9, "Jaya", "Payments", 34));
		listOfWorker.add(new Worker(10, "Ashutosh", "Sales", 30));
		listOfWorker.add(new Worker(11, "Varsha", "Refund", 28));
		listOfWorker.add(new Worker(12, "Vinod", "Payments", 28));
		
		/************** groupingBy ***************************/
		Map<String, List<Worker>> groupByDepartment = listOfWorker.stream().collect(Collectors.groupingBy(worker -> worker.getDepartment()));
		
		groupByDepartment.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
		
		System.out.println("\n------------------------------------------------------");
		
		Map<Integer, List<Worker>> groupByAge = listOfWorker.stream().collect(Collectors.groupingBy(worker -> worker.getAge()));
		
		groupByAge.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
		
		System.out.println("\n------------------------------------------------------");
		
		groupByAge.entrySet().stream().sorted(Comparator.comparing(entry -> entry.getKey())).forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
		
		System.out.println("\n------------------------------------------------------");
		
		Map<Integer, Set<Worker>> groupByAgeSet = listOfWorker.stream().collect(Collectors.groupingBy(worker -> worker.getAge(), Collectors.toSet()));
		
		groupByAgeSet.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
		
		System.out.println("\n------------------------------------------------------");
		
		Map<Integer, Set<Worker>> groupByAgeSortedSet = listOfWorker.stream()
				                                                    .collect(Collectors.groupingBy(worker -> worker.getAge(), 
				                                                                                   () -> new TreeMap<>(), 
				                                                                                   Collectors.toSet()));
		
		groupByAgeSortedSet.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
		
		System.out.println("\n------------------------------------------------------");
		
		Map<Integer, Set<Worker>> groupByAgeSortedSet2 = listOfWorker.stream()
				                                                     .collect(Collectors.groupingBy(Worker::getAge, 
				                                                                                    TreeMap::new, 
				                                                                                    Collectors.toSet()));
		
		groupByAgeSortedSet2.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
		
		System.out.println("\n------------------------------------------------------");
		
		
		/************** summaryStatistics ***************************/
		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		IntSummaryStatistics summaryStatistics = listOfIntegers.stream().mapToInt(x -> (int)x).summaryStatistics();
		
		System.out.println("Average: " + summaryStatistics.getAverage());
		System.out.println("Sum: " + summaryStatistics.getSum());
		System.out.println("Count: " + summaryStatistics.getCount());
		System.out.println("Max: " + summaryStatistics.getMax());
		System.out.println("Min: " + summaryStatistics.getMin());
		
		/************** Skip Limit *********************/
		
		List<Integer> listOfIntegers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Second largest element
		int secondLargestElement = listOfIntegers2.stream().sorted(Comparator.reverseOrder())
		                                          .skip(1).limit(1)
		                                          .collect(Collectors.toList()).get(0);
		
		System.out.println("Second largest element : " + secondLargestElement); // T = O(n*log(n))
		
		int maxVal = Integer.MIN_VALUE;
		int n = listOfIntegers2.size();
		for(int i = 0; i <= n-1; i++) {
			if(listOfIntegers2.get(i) > maxVal) {
				maxVal = listOfIntegers2.get(i);
			}
		}
		
		int secondMax = Integer.MIN_VALUE;
		for(int i = 0; i <= n-1; i++) {
			if((listOfIntegers2.get(i) > secondMax) && (listOfIntegers2.get(i) < maxVal)) {
				secondMax = listOfIntegers2.get(i);
			}
		}
		
		System.out.println("Second lagest element : " + secondMax); // T = O(2n)
		
		
		/******************** Find Duplicates - 1st approach **************************/
		
		List<Integer> listOfInteger3 = Arrays.asList(1, 5, 7, 1, 4, 8, 6, 7, 2, 7, 5, 9);
		
		List<List<Integer>> groups = listOfInteger3.stream().collect(Collectors.groupingBy(x -> x))
				                                            .entrySet().stream()
				                                            .map(entry -> entry.getValue())
				                                            .collect(Collectors.toList());
		
		List<Integer> listOfDuplicates = groups.stream().filter(group -> group.size() > 1)
				                                        .map(list -> list.get(0))
				                                        .collect(Collectors.toList());
		
		System.out.print("List of duplicates : ");
		listOfDuplicates.forEach(t -> System.out.print(t + " "));
		
		System.out.println("\n----------------------------------------------------");
		
		/******************** Find Duplicates - 2nd approach **************************/
		
		Set<Integer> uniques = new HashSet<>();
		Set<Integer> duplicates = listOfInteger3.stream().filter(t -> !uniques.add(t)).collect(Collectors.toSet());
		
		System.out.print("List of duplicates : ");
		duplicates.forEach(t -> System.out.print(t + " "));
		
		System.out.println("\n----------------------------------------------------");
		
		System.out.print("List of uniques (all elements) : ");
		uniques.forEach(t -> System.out.print(t + " "));
		
		
		/******************** Second most frequent element *************************/
		
		System.out.println("\n----------------------------------------------------");
		
		String str = "abccaaabdde";
		
		List<Character> listOfChars = str.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		
		Map<Character, List<Character>> charGroup = listOfChars.stream().collect(Collectors.groupingBy(c -> c, () -> new TreeMap<Character, List<Character>>(), Collectors.toList()));
		Map<Integer, List<Character>> frequencyMap = charGroup.entrySet().stream().collect(Collectors.groupingBy(entry -> entry.getValue().size(), TreeMap::new, Collectors.mapping(entry -> entry.getKey(), Collectors.toList())));
		                             
		                             
		List<Character> secondMostFrequentElements = frequencyMap.entrySet().stream()
				                                                 .sorted(Comparator.comparing((Map.Entry<Integer, List<Character>> entry) -> entry.getKey()).reversed())
								                                 .map(entry -> entry.getValue())
								                                 .skip(1)
								                                 .limit(1)
								                                 .flatMap(elementList -> elementList.stream())
								                                 .collect(Collectors.toList());
		
		
		System.out.println("Second most frequent elements : " + secondMostFrequentElements);
		
		List<Character> secondMostFrequentElements2 = listOfChars.stream().collect(Collectors.groupingBy(t -> t))
												        .entrySet().stream()
												        .collect(Collectors.groupingBy(entry -> entry.getValue().size(), Collectors.mapping(entry -> entry.getKey(), Collectors.toList())))
												        .entrySet().stream()
												        .sorted(Comparator.comparing((Map.Entry<Integer, List<Character>> entry)-> entry.getKey()).reversed())
														  .map(entry -> entry.getValue())
														  .skip(1)
														  .limit(1)
														  .flatMap(list -> list.stream())
														  .collect(Collectors.toList());
		
		System.out.println("=>Second most frequent elements : " + secondMostFrequentElements2);
		
		// Best and easy
		List<Character> secondMostFrequentElements3 = listOfChars.stream().collect(Collectors.groupingBy(ch -> ch))
																 .entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue().size()))
																 .entrySet().stream().collect(Collectors.groupingBy(entry -> entry.getValue(), Collectors.mapping(entry -> entry.getKey(), Collectors.toList())))
																 .entrySet().stream().sorted(Comparator.comparing((Map.Entry<Integer, List<Character>> entry) -> entry.getKey()).reversed())
																 .skip(1).limit(1).flatMap(entry -> entry.getValue().stream()).collect(Collectors.toList());
		
		System.out.println("===>Second most frequent elements : " + secondMostFrequentElements3);
		                    
		
		System.out.println("\n----------------------------------------------------");
		
		/**************** Collectors.mapping *****************/
		
		List<Integer> listOfInteger4 = Arrays.asList(1, 5, 7, 1, 4, 8, 6, 7, 2, 7, 5, 9);
		
		listOfInteger4 = listOfInteger4.stream().collect(Collectors.mapping(t -> t*2, Collectors.toList()));
		
		listOfInteger4.forEach(t -> System.out.print(t + " "));
		
		
		System.out.println("\n----------------------------------------------------");
		
		/***************** Collectors.averagingInt **************/
		
		List<Integer> listOfInteger5 = Arrays.asList(1, 5, 7, 1, 4, 8, 6, 7, 2, 7, 5, 9);
		
		double avg = listOfInteger5.stream().collect(Collectors.averagingInt(t -> t));
		
		System.out.println("Average : " + avg);
		
		/***************** Collectors.summingInt **************/
		
		System.out.println("\n----------------------------------------------------");
		
		List<Integer> listOfInteger6 = Arrays.asList(1, 5, 7, 1, 4, 8, 6, 7, 2, 7, 5, 9);
		
		int sum = listOfInteger6.stream().collect(Collectors.summingInt(t -> (int)t));
		
		System.out.println("Sum : " + sum);
		
		
		/***************** Collectors.maxBy / Collectors.minBy **************/
		
		System.out.println("\n----------------------------------------------------");
		
		List<Integer> listOfInteger7 = Arrays.asList(1, 5, 7, 1, 4, 8, 6, 7, 2, 7, 5, 9);
		
		int max = listOfInteger7.stream().collect(Collectors.maxBy(Comparator.comparing(t -> t))).get();
		int min = listOfInteger7.stream().collect(Collectors.minBy(Comparator.comparing(t -> t))).get();
		
		System.out.println("Max : " + max + " | Min : " + min);
		
	}
}

class Worker {
	
	private int id;
	
	private String name;
	
	private String department;
	
	private int age;

	public Worker(int id, String name, String department, int age) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Worker other = (Worker) obj;
		if (age != other.age)
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", department=" + department + ", age=" + age + "]";
	}
}
