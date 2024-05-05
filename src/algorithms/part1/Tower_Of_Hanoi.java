package algorithms.part1;

import java.util.Scanner;

public class Tower_Of_Hanoi {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of discs: ");
		int n = sc.nextInt();
		toh(n, 's', 'a', 'd');
		sc.close();
	}
	
	public static void toh(int n, char s, char a, char d) {
		
		if(n==1) {
			System.out.println("Move top most disc from "+s+" to "+d);
			return;
		}
		
		toh(n-1, s, d, a);
		toh(1, s, a, d);
		toh(n-1, a, s, d);
	}

}
