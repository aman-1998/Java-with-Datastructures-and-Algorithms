package fileHandling;

import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class File_15 {
	
	public static void main(String[] args)
	{
		File file = new File("StudyEasy.txt");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter any two integers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a + b;
		
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("The sum of "+a+" and "+b+" is "+c);
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("IOException occured");
		}
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			char ch = (char)br.read();
			
			while(ch != (char)65535)
			{
				System.out.print(ch);
				ch = (char)br.read();
			}
			System.out.println("\n--------------------------------------------");
			String line = br.readLine();
			System.out.println(line);
			System.out.println("--------------------------------------------");
			
			br = new BufferedReader(new FileReader(file));
			
			line = br.readLine();
			while(line != null)
			{
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found exception");
		}
		catch(IOException e)
		{
			System.out.println("IOException occured");
		}
	}

}
