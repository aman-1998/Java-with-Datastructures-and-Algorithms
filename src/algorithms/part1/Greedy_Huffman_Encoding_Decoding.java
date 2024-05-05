package algorithms.part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class CharWithFrequency {
	private char character;
	private int frequency;
	private CharWithFrequency left;
	private CharWithFrequency right;
	
	public CharWithFrequency(CharWithFrequency left, char character, int frequency, CharWithFrequency right) {
		this.character = character;
		this.frequency = frequency;
		this.left = left;
		this.right = right;
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public CharWithFrequency getLeft() {
		return left;
	}

	public void setLeft(CharWithFrequency left) {
		this.left = left;
	}

	public CharWithFrequency getRight() {
		return right;
	}

	public void setRight(CharWithFrequency right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "CharWithFrequency [character=" + character + ", frequency=" + frequency + "]";
	}
	
}

class CharWithCode {
	private char chracter;
	private String code;
	
	public CharWithCode(char chracter, String code) {
		this.chracter = chracter;
		this.code = code;
	}
	
	public char getChracter() {
		return chracter;
	}
	
	public void setChracter(char chracter) {
		this.chracter = chracter;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "CharWithCode [chracter=" + chracter + ", code=" + code + "]";
	}
	
}

public class Greedy_Huffman_Encoding_Decoding {
	
	private static List<CharWithCode> charWithCodeArr = new ArrayList<>();
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter any string: ");
		 String input = in.nextLine();
		 
		 //PriorityQueue<CharWithFrequency> minHeap = new PriorityQueue<>((charWithFreq1, charWithFreq2) -> charWithFreq1.getFrequency() > charWithFreq2.getFrequency() ? 1 : -1);
		 PriorityQueue<CharWithFrequency> minHeap = new PriorityQueue<>(Comparator.comparing(charWithFreq1 -> charWithFreq1.getFrequency()));
		 
		 Map<Character, Integer> map = frequencyOfEachElements(input); // Time = O(n)
		 
		 System.out.println("Frequency:-");
		 map.entrySet().forEach(entry -> { // Time = O(n*log(n))
			 System.out.println(entry.getKey() + " | " + entry.getValue());
			 minHeap.add(new CharWithFrequency(null, entry.getKey(), entry.getValue(), null));
		 });
		 
		 CharWithFrequency root = constructHuffmanTree(minHeap); // Time = O(n*log(n))
		 huffmanEncoding(root, new StringBuffer()); // O(log n)
		 
		 charWithCodeArr.stream().forEach(t -> System.out.println(t)); // O(n)
		 
		 String huffmanEncodedString = "";
		 for(int i = 0; i < input.length(); i++) { // Time = O(n*m)
			 for(int j = 0; j < charWithCodeArr.size(); j++) {
				 if(charWithCodeArr.get(j).getChracter() == input.charAt(i)) {
					 huffmanEncodedString = huffmanEncodedString + charWithCodeArr.get(j).getCode();
				 }
			 }
		 }
		 
		 System.out.println("Huffman encoded string = " + huffmanEncodedString);
		 
		 String decodedString = huffmanDecoding(root, huffmanEncodedString); // Time = O(m)
		 
		 System.out.println("Decoded String = " + decodedString);
	}
	
	private static String huffmanDecoding(CharWithFrequency root, String huffmanEncodedString) { // Time = O(m)
		CharWithFrequency curr = root;
		String result = "";
		for(int i = 0; i < huffmanEncodedString.length(); i++) {
			if(huffmanEncodedString.charAt(i) == '0') {
				curr = curr.getLeft();
			} else {
				curr = curr.getRight();
			}
			
			if(curr.getLeft() == null && curr.getRight() == null) {
				result = result + curr.getCharacter();
				curr = root;
			}
		}
		
		return result;
	}

	private static Map<Character, Integer> frequencyOfEachElements(String input) { // Time = O(n)
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < input.length(); i++) {
			if(map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
			} else {
				map.put(input.charAt(i), 1);
			}
		}
		
		return map;
	}

	private static void huffmanEncoding(CharWithFrequency root, StringBuffer code) { // Time = O(log(n))
		if(root != null) {
			if(root.getLeft() != null) {
				code = code.append(0);
				huffmanEncoding(root.getLeft(), code);
				code = code.deleteCharAt(code.length()-1);
			}
			
			if(root.getRight() != null) {
				code = code.append(1);
				huffmanEncoding(root.getRight(), code);
				code = code.deleteCharAt(code.length()-1);
			}
			
			if(root.getLeft() == null && root.getRight() == null) {
				charWithCodeArr.add(new CharWithCode(root.getCharacter(), code.toString()));
			}
		}
	}

	private static CharWithFrequency constructHuffmanTree(PriorityQueue<CharWithFrequency> minHeap) { // O(n*log(n))
		
		while(minHeap.size() > 1) {
			CharWithFrequency min1 = minHeap.poll();
			CharWithFrequency min2 = minHeap.poll();
			CharWithFrequency internalNode = new CharWithFrequency(min1, '#', min1.getFrequency()+min2.getFrequency(), min2);
			minHeap.add(internalNode);
		}
		
		return minHeap.poll();
	}
}
