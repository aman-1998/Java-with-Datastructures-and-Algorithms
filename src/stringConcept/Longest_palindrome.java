package stringConcept;

import java.util.Scanner;

public class Longest_palindrome {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = str.length();
		int i=0,j=0,k=0;
		String[] arr = new String[n*(n+1)/2];
		int x = 0;
		String temp_str = "";
		
		for(i = 0; i <= str.length()-1; i++)
		{
			temp_str = temp_str + str.charAt(i);
			if(i == 0)
			{
				for(j = 1; j <= str.length()-1; j++)
				{
					if(str.charAt(j) == str.charAt(i))
						temp_str = temp_str + str.charAt(j);
					else
					{
						arr[x] = temp_str;
						temp_str = "";
						x++;
						break;
					}
				}
			}
			else if(i == str.length()-1)
			{
				for(j = str.length()-2; j >= 0; j--)
				{
					if(str.charAt(j) == str.charAt(i))
						temp_str = temp_str + str.charAt(j);
					else
					{
						arr[x] = temp_str;
						temp_str = "";
						x++;
						break;
					}
				}
			}
			else
			{
				if(i-1 >= 0 && i+1 <= str.length())
				{
					if(str.charAt(i-1) == str.charAt(i+1))
					{
						temp_str = str.charAt(j) + temp_str + str.charAt(k);

						j = i - 2;
						k = i + 2;

						while(j >= 0 && k <= str.length()-1)
						{
							if(str.charAt(j) == str.charAt(k))
								temp_str = str.charAt(j) + temp_str + str.charAt(k);
							else
							{
								arr[x] = temp_str;
								temp_str = "";
								x++;
								break;
							}
							j--;
							k++;
						}
					}
					else if(str.charAt(i) == str.charAt(i+1))
					{
						temp_str = temp_str + str.charAt(i+1);
						
						for(j = i+2; j <= str.length()-1; j++)
						{
							if(str.charAt(j) == str.charAt(i))
								temp_str = temp_str + str.charAt(j);
							else
							{
								arr[x] = temp_str;
								temp_str = "";
								x++;
								break;
							}
						}
					}
				}
			}
			temp_str = "";
		}
		
		for(i = 0; i < x; i++)
			System.out.println(arr[i]);
	}

}
