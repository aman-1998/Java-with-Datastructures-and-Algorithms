package bitwise;

import java.util.Scanner;

public class Bitwise_N1
{
	public static void main(String[] args)
	{
		/*
		 * 1. & -- Bitwise AND
		 * 2. | -- Bitwise OR
		 * 3. ~ -- Bitwise NOT
		 * 4. ^ -- Bitwise XOR
		 * 5. << -- Bitwise left-shift
		 * 6. >> -- Bitwise Logical right-Shift
		 * 7. >>> -- Bitwise Arithmetic right-shift
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any integer: ");
		int input = in.nextInt();
		Bitwise_N1 ob = new Bitwise_N1();
		System.out.print("n = "+ob.integerToBinaryPrint(input));
		
		//We want to clear nth bit from right side (use of &)
		System.out.print("\nEnter the position which you want to clear: ");
		int n = in.nextInt();
		int temp1 = -2 << (n-1);
		int temp2 = ((1 << 31) - 1) >> (32-n);
		int mask = temp1 | temp2;
		System.out.println("\nmask = "+ob.integerToBinaryPrint(mask));
		int modified_input = input & mask;
		System.out.println("Modified input = "+ob.integerToBinaryPrint(modified_input)+" = "+modified_input);
		
		//We want to know whether nth bit is set or clear (use of &)
		System.out.print("\nEnter the the position which you want to determine: ");
		n = in.nextInt();
		mask = 1 << (n-1);
		int bit = (input & mask) != 0 ? 1 : 0;
		System.out.println("Bit at "+n+" position = "+bit);
		
		//We want to set nth bit for n (use of |)
		System.out.print("\nEnter the position which you want to set: ");
		n = in.nextInt();
		mask = 1 << (n-1);
		modified_input = input | mask;
		System.out.println("Modified input = "+ob.integerToBinaryPrint(modified_input)+" = "+modified_input);
		
		//We want to toggle nth bit
		System.out.print("\nEnter the position which you want to toggle: ");
		n = in.nextInt();
		mask = 1 << (n-1);
		modified_input = input ^ mask;
		System.out.println("Modified input = "+ob.integerToBinaryPrint(modified_input)+" = "+modified_input);
	
		//Encryption Decryption
		System.out.print("\nEnter the information: ");
		int information = in.nextInt();
		System.out.print("\nEnter the mask: ");
		mask = in.nextInt();
		int encrypted_value = information ^ mask;
		System.out.println("Encrypted value = "+encrypted_value);
		int decrypted_value = encrypted_value ^ mask;
		System.out.println("Decrypted value = "+decrypted_value);
		
		//XOR of two same integer is 0
		temp1 = 141421;
		temp2 = 141421;
		int res = temp1 ^ temp2;
		System.out.println("XOR of two same integer = "+res);
		in.close();
	}
	
	public String integerToBinaryPrint(int input)
	{
		int mask, bit;
		String binary = "";
		for(int i = 31; i >= 0; i--)
		{
			mask = 1 << i;
			bit = (input & mask) == 0 ? 0 : 1;
			binary = binary + bit;
		}
		return binary;
	}
}