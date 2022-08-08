/*Program to find all possible substrings with non repeating characters*/

package stringConcept;

import java.util.Scanner;

public class Leet_code_question {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		int n = str1.length();
		String str2 = "";
		String[] arr_sub_str = new String[n*(n+1)/2];
		int y = 0;
		int flag = 0;
		int i = 0;
		for(int x = 0; x <= str1.length()-1; x++)
		{
			for(i = x; i <= str1.length()-1; i++)
			{
				flag = 0;
				if(i == x)
				{
					str2 = str2 + str1.charAt(i);
					continue;
				}
				for(int j = 0; j <= str2.length()-1; j++)
				{
					if(str1.charAt(i) == str2.charAt(j))
					{
						flag = 1;
						arr_sub_str[y] = str2;
						y++;
						str2 = "";
						break;
					}
				}
				if(flag == 0)
					str2 = str2 + str1.charAt(i);
				if(flag == 1)
					break;
			}
			if(i == str1.length())
			{
				arr_sub_str[y] = str2;
				y++;
				str2 = "";
			}
		}
		for(i = 0; i < y; i++)
			System.out.println(arr_sub_str[i]);
	}
}
