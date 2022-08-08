package fileHandling;

import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class File_12 {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter two numbers : ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a + b;
		
		File file = new File("StudyEasy.txt");
		
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("Sum of "+a+" and "+b+" is "+c);
			bw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Job done");
	}

}
