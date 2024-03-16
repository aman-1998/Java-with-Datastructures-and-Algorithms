package java_8_features.completableFuture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFuture_N4 {
	
	public static void main(String[] args) {
		
		CompletableFuture.supplyAsync(() -> {
			
			String str = "Aman Kumar Mishra";
			for(int i = 65; i <= 70; i++) {
				str = str + (char)i;
			}
			
			System.out.println(str);
			return str;
			
		}).thenApply(result -> result.length())
		  .thenApply(length -> convertToWords(length))
		  .thenAccept(listOfWords -> {
			  listOfWords.stream().forEach(word -> System.out.print(word + " "));
		  });
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Main thread");
	}
	
	private static List<String> convertToWords(int n) {
		
		List<String> inWords = new ArrayList<>();
		
		while(n != 0) {
			
			int r = n % 10;
			n = n / 10;
			inWords.add(word(r));
		}
		
		Collections.reverse(inWords);
		return inWords;
	}

	private static String word(int r) {
		
		switch(r) {
			case 0 : return "Zero";
			case 1 : return "One";
			case 2 : return "Two";
			case 3 : return "Three";
			case 4 : return "Four";
			case 5 : return "Five";
			case 6 : return "Six";
			case 7 : return "Seven";
			case 8 : return "Eight";
			default : return "Nine";
		}
	}
}
