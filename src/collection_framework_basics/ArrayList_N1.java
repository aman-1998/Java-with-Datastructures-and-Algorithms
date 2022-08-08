package collection_framework_basics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_N1 {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5); // add(4)
		arrList.add(8);
		arrList.add(12);
		arrList.add(8);
		arrList.add(17);
		arrList.add(1);
		
		Display_List<Integer> disp = new Display_List<Integer>();
		
		System.out.println("ArrayList:-");
		disp.display1(arrList);
		System.out.println("\n----------------------------------------");
		
		arrList.add(3,35); // add(5,6)
		
		System.out.println("ArrayList:-");
		disp.display2(arrList);
		System.out.println("\n----------------------------------------");
		
		arrList.set(3, 78); // set(3,4)
		
		System.out.println("ArrayList:-");
		disp.display1(arrList);
		System.out.println("\n----------------------------------------");
		
		boolean check = arrList.contains(17); // contains(56)
		System.out.println(check);
		System.out.println("\n----------------------------------------");
		
		int i = arrList.indexOf(78); // indexOf(6)
		System.out.println(i);
		System.out.println("\n----------------------------------------");
		
		i = arrList.lastIndexOf(8);
		System.out.println(i); // lastIndexOf(8)
		System.out.println("\n----------------------------------------");
		
		int element = arrList.get(5); // get(5)
		System.out.println(element);
		System.out.println("\n----------------------------------------");
		
		int size = arrList.size(); // size()
		System.out.println(size);
		System.out.println("\n----------------------------------------");
		
		System.out.println(arrList.isEmpty()); // isEmpty()
		System.out.println("\n----------------------------------------");
		
		System.out.println("ArrayList:-");
		arrList.remove(3); // remove(4)
		disp.display2(arrList);
		System.out.println("\n----------------------------------------");
		
		// arrList.remove(12); - It will throw exception
		arrList.remove(new Integer(12)); // remove(obj)
		disp.display2(arrList);
		System.out.println("\n----------------------------------------");
		
		String str = arrList.toString(); // toString()
		System.out.println(str);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		System.out.println("\n----------------------------------------");
		
		ArrayList<Integer> arrList2 = (ArrayList<Integer>) arrList.clone(); // clone()
		System.out.println("ArrayList:-");
		disp.display1(arrList2);
		System.out.println("\n----------------------------------------");
		
		ArrayList<Integer> arrList3 = new ArrayList<Integer>(5);
		arrList3.add(4);
		arrList3.add(8);
		System.out.println("ArrayList:-");
		disp.display1(arrList3);
		System.out.println("\n----------------------------------------");
		
		size = arrList3.size();
		System.out.println(size);
		arrList3.trimToSize();
		System.out.println(size);
		System.out.println("\n----------------------------------------");
		
		Collections.sort(arrList);
		System.out.println("ArrayList:-");
		disp.display2(arrList);
		System.out.println("\n----------------------------------------");
		
		Collections.reverse(arrList);
		System.out.println("ArrayList:-");
		disp.display2(arrList);
	}
}
