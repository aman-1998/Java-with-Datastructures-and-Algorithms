package fileHandling;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_9 {
	
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\DELL\\Desktop\\folder9\\folder10\\Demo.txt");
		try 
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("Aman Kumar");
			bw.newLine();
			bw.write("Mishra");
			bw.write("Radha");
			bw.newLine();
			bw.write("Jha");
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("Writing can not be done in file");
		}
		
		System.out.println("Job done");
	}

}
